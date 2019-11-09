# Dropwizard issue 3017

```
# ./gradlew shadowJar
# java -Ddw.server.applicationConnectors[0].type="http" -Ddw.server.applicationConnectors[0].port="8000" -jar build/libs/dropwizard-issue-3017-all.jar server configuration.yml
```
