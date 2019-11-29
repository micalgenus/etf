#!/usr/bin/env bash

rm -rf keystore.p12
echo "123456
123456






yes
" | keytool -genkey -alias bns-ssl -storetype PKCS12 -keyalg RSA -keysize 2048 -keystore keystore.p12 -validity 36504 1>/dev/null

./gradlew bootRun -Pdev -t