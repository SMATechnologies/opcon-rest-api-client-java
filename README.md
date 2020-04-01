[![Actions Status](https://github.com/SMATechnologies/opcon-rest-api-client-java/workflows/Deploy%20Release/badge.svg)](https://github.com/SMATechnologies/opcon-rest-api-client-java/actions)

[![Actions Status](https://github.com/SMATechnologies/opcon-rest-api-client-java/workflows/Deploy%20Snapshot/badge.svg)](https://github.com/SMATechnologies/opcon-rest-api-client-java/actions)


# OpCon REST API Java Client library
Java client library for OpCon REST API

# Disclaimer
No Support and No Warranty are provided by SMA Technologies for this project and related material. The use of this project's files is on your own risk.

SMA Technologies assumes no liability for damage caused by the usage of any of the files offered here via this Github repository.

# Prerequisites

Java 11

# Instructions

Available from Central Maven Repository (https://search.maven.org/artifact/com.smatechnologies/opcon-rest-api-client):
```
<dependency>
    <groupId>com.smatechnologies</groupId>
    <artifactId>opcon-rest-api-client</artifactId>
    <version>1.0.2</version>
</dependency>
```

# Example

```java
OpconApiProfile profile = new OpconApiProfile("https://localhost:9010/api");

OpconApi opconApi;
try {
    Client client = SmClientBuilder.get()
            .configureDefaultClientBuilder(defaultClientBuilder -> defaultClientBuilder
                    .setTrustAllCert(true)
            )
            .setDebug(true)
            .setFailOnUnknownProperties(true)
            .build();

    opconApi = new OpconApi(client, profile, new OpconApi.OpconApiListener() {

        @Override
        public void onFailed(WsException e) {
            e.printStackTrace();
        }
    });

    opconApi.login("MyOpconUser", "MyOpconPassword");

} catch (KeyManagementException | NoSuchAlgorithmException | WsException e) {
    e.printStackTrace();
    return;
}

try {
    //Fetch Machines
    List<Machine> machines = opconApi.machines().get(null);

    //Fetch Roles with machines
    RolesCriteria rolesCriteria = new RolesCriteria();
    rolesCriteria.setIncludeMachines(true);
    List<Role> roles = opconApi.roles().get(rolesCriteria);
    
} catch (WsException e) {
    e.printStackTrace();
}

try {
    opconApi.logout();
} catch (WsException e) {
    e.printStackTrace();
}
```
# License
Copyright 2019 SMA Technologies

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at [apache.org/licenses/LICENSE-2.0](http://www.apache.org/licenses/LICENSE-2.0)

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

# Contributing
We love contributions, please read our [Contribution Guide](CONTRIBUTING.md) to get started!

# Code of Conduct
[![Contributor Covenant](https://img.shields.io/badge/Contributor%20Covenant-v2.0%20adopted-ff69b4.svg)](code-of-conduct.md)
SMA Technologies has adopted the [Contributor Covenant](CODE_OF_CONDUCT.md) as its Code of Conduct, and we expect project participants to adhere to it. Please read the [full text](CODE_OF_CONDUCT.md) so that you can understand what actions will and will not be tolerated.
