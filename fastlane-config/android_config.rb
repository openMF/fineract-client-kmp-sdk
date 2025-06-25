module FastlaneConfig
  module AndroidConfig
    STORE_CONFIG = {
      default_store_file: "release_keystore.keystore",
      default_store_password: "Mifos@123",
      default_key_alias: "fineract-testing",
      default_key_password: "Mifos@123"
    }

    FIREBASE_CONFIG = {
      firebase_prod_app_id: "1:728434912738:android:3902eb3363b0938f1a1dbb",
      firebase_demo_app_id: "1:728434912738:android:8392hjksak9032skja",
      firebase_service_creds_file: "secrets/firebaseAppDistributionServiceCredentialsFile.json",
      firebase_groups: "mifos-mobile-apps"
    }

    BUILD_PATHS = {
      prod_apk_path: "composeApp/build/outputs/apk/prod/release/composeApp-prod-release.apk",
      demo_apk_path: "composeApp/build/outputs/apk/demo/release/composeApp-demo-release.apk",
      prod_aab_path: "composeApp/build/outputs/bundle/prodRelease/composeApp-prod-release.aab"
    }
  end
end
