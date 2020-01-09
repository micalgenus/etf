# etf

## Requirement
- [mkcert](https://github.com/FiloSottile/mkcert)

### certification

1. Install [mkcert](https://github.com/FiloSottile/mkcert).
2. Setup root ca
   
    ```
    mkcert -install
    ```

3. Create certification

    ```
    mkcert -pkcs12 -key-file key.pem -cert-file cert.pem localhost
    ```

4. Move certification to `backend` and rename `keystore.p12`

<!-- helm delete --purge etf && helm install --name etf --namespace etf micalgenus/etf -->
