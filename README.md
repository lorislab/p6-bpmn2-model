# P6 Workflow BPMN2 model

[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](LICENSE)
[![Maven Central](https://img.shields.io/maven-central/v/org.lorislab.p6/p6-bpmn2-model)](https://search.maven.org/artifact/org.lorislab.p6/p6-bpmn2-model)
[![GitHub release](https://img.shields.io/github/v/release/lorislab/p6-bpmn2-model)](https://github.com/lorislab/p6-bpmn2-model/releases)

The **p6-bpmn2-model** repository is the foundational modeling component for the **P6 Workflow Engine**. It provides the necessary structures, schemas, and parsing logic to interpret BPMN 2.0 XML definitions and convert them into an executable format for the engine.

---

## Overview

The goal of this repository is to provide a high-performance, strictly typed representation of Business Process Model and Notation (BPMN) 2.0. It acts as the "source of truth" for how workflows are structured, validated, and stored within the P6 ecosystem.

## Features

* **BPMN 2.0 Compliant:** Supports standard elements (Events, Gateways, Tasks, and Sequence Flows).
* **P6 Extensions:** Specialized support for custom P6 attributes like service task connectors and execution listeners.
* **Validation Layer:** Detects logical errors (e.g., deadlocks, dangling nodes) before the model reaches the execution phase.
* **Serialization:** Conversion between XML and internal object models.

## Usage in Maven

To use these configurations in your project, add this repository as a dependency in the `pom.xml`.

```xml
<dependency>
    <groupId>org.lorislab.p6</groupId>
    <artifactId>p6-bpmn2-model</artifactId>
    <version>{VERSION}</version>
</dependency>
```

## License

This project is licensed under the Apache License 2.0 - see the [LICENSE](LICENSE) file for details.
