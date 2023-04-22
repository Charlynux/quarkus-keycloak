# Quarkus + Keycloak

Minimal repository to reproduce a strange behavior with `quarkus-oidc`.

## Run the app

```
./mvnw quarkus:dev
```

**Keycloak server is provided by DevServices, which requires Docker.**

## Reproduction steps

- Go to http://localhost:8080/init
- Click on the link
- *You're redirected to a Keycloak login page*
- Go back to previous page
- Refresh
- *You've got a 401*

Reproduced with :
- Quarkus 2.16.6.Final
- Quarkus 3.0.0.Final

With 2.16.6.Final, you got the log message "State verification has failed, completing the code flow with HTTP status 401" which helps me found this [issue](https://github.com/quarkusio/quarkus/issues/27348).

With 3.0.0.Final, you got nothing in the log.