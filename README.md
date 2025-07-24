
# Java Boilerplate

[![License](https://img.shields.io/badge/license-MIT-green.svg)](LICENSE)
[![Java Version](https://img.shields.io/badge/java-8+-blue.svg)](https://adoptopenjdk.net/)
[![Maven Central](https://img.shields.io/maven-central/v/com./.svg)](https://search.maven.org/search?q=g:com.instigator)
[![Javadoc](https://javadoc.io/badge2/com.instigator/instigator/javadoc.svg)](https://javadoc.io/doc/com.instigator/instigator)
[![Coverage Status](https://img.shields.io/codecov/c/github/your-org/your-repo.svg)](https://codecov.io/gh/your-org/your-repo)
[![Release](https://img.shields.io/github/v/release/your-org/your-repo?include_prereleases)](https://github.com/your-org/your-repo/releases)
[![Issues](https://img.shields.io/github/issues/your-org/your-repo)](https://github.com/your-org/your-repo/issues)
[![Pull Requests](https://img.shields.io/github/issues-pr/your-org/your-repo)](https://github.com/your-org/your-repo/pulls)

> A modern, multi-release Java boilerplate for enterprise-grade application foundations.

---

## Table of Contents

- [Features](#-features)
- [Getting Started](#-getting-started)
- [Installation](#-installation)
- [Configuration](#-configuration)
- [Usage](#-usage)
- [Testing](#-testing)
- [Documentation](#-documentation)
- [Contributing](#-contributing)
- [License](#-license)
- [Contact](#-contact)

---

## ✨ Features

- **Multi-release JAR** support (Java 8 & 11+)
- Built-in testing with JUnit 5 and integration via Failsafe
- Foundation for reusable modules and utilities
- Easily deployable to Maven Central
- Optional Dockerfile support
- Javadoc and Source JAR generation
- Clean project layout using Maven standards

---

## 🚀 Getting Started

Clone this repository:

```bash
git clone https://github.com/onewhub/java-boilerplate
cd java-boilerplate
````

Build and test:

```bash
mvn clean install
```

---

## Installation

Add the dependency to your `pom.xml`:

```xml
<dependency>
  <groupId>com.app</groupId>
  <artifactId>app</artifactId>
  <version>0.0.1-SNAPSHOT</version>
</dependency>
```

Or use with Gradle:

```groovy
implementation 'com.app:app:0.0.1-SNAPSHOT'
```

---

## Testing

Run all unit tests:

```bash
mvn test
```

Run integration tests:

```bash
mvn verify -P failsafe
```

View test coverage (if integrated):

```bash
mvn jacoco:report
```

---

## Documentation

* [API Docs (Javadoc)](https://javadoc.io/doc/com./)
* [User Guide](docs/user-guide.md)
* [Architecture](docs/architecture.md)
* [Changelog](CHANGELOG.md)

---

## Contributing

We love contributions! Here's how to get started:

1. Fork this repo
2. Create a feature branch: `git checkout -b feature/amazing-feature`
3. Commit changes: `git commit -m 'Add amazing feature'`
4. Push to the branch: `git push origin feature/amazing-feature`
5. Submit a pull request

---

## License

This project is licensed under the [MIT License](LICENSE).

---

## Contact

Created by **[Dio Arafi]()**
Email: [info@dioarafi.com](mailto:info@dioarafi.com)
GitHub: [github.com/](https://github.com/)

---

<p align="center">
  <em>Made with ❤️ by Dio Arafi • Updated July 2025</em>
</p>


