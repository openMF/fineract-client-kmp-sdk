/*
 * Copyright 2025 Mifos Initiative
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * See See https://github.com/openMF/kmp-project-template/blob/main/LICENSE
 */
package org.mifos.core.common

import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement

// Enhance This Formatter to Format the Response Properly
class JsonFormatter {
    companion object {
        fun format(jsonString: String): String {
            return try {
                val json = Json {
                    prettyPrint = true
                    ignoreUnknownKeys = true
                }
                val jsonElement = Json.decodeFromString<JsonElement>(jsonString)
                json.encodeToString(JsonElement.serializer(), jsonElement)
            } catch (e: Exception) {
                // Fallback to manual formatting
                manualJsonFormat(jsonString)
            }
        }

        private fun manualJsonFormat(jsonString: String): String {
            var indentLevel = 0
            val indentWidth = 4
            val result = StringBuilder()

            for (char in jsonString) {
                when (char) {
                    '{', '[' -> {
                        result.append(char)
                        result.append('\n')
                        indentLevel++
                        result.append(" ".repeat(indentLevel * indentWidth))
                    }

                    '}', ']' -> {
                        result.append('\n')
                        indentLevel--
                        result.append(" ".repeat(indentLevel * indentWidth))
                        result.append(char)
                    }

                    ',' -> {
                        result.append(char)
                        result.append('\n')
                        result.append(" ".repeat(indentLevel * indentWidth))
                    }

                    ':' -> {
                        result.append(char)
                        result.append(' ')
                    }

                    else -> {
                        if (!char.isWhitespace() || result.lastOrNull() != ' ') {
                            result.append(char)
                        }
                    }
                }
            }

            return result.toString()
        }
    }
}
