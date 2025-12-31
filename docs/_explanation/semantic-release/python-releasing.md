---
title: Releasing in Python
parent: Semantic Release
nav_order: 1
---

# Packaging Python projects
{: .no_toc }

Python [Distribution Packages] are the standard mechanism for distributing and installing Python libraries and
applications. 

{: .fs-6 .fw-300 }

Python packages can be published to the [Python Package Index (PyPI)], the default package repository for the Python
ecosystem, where they are made available to the wider developer community.


## Table of Contents
{: .no_toc .text-delta }

1. TOC
{:toc}

## The configuration file

The standard practice is to use a `pyproject.toml` file to define the package metadata, dependencies, and build settings.

For more details on how to configure the `pyproject.toml` file, refer to [Writing your pyproject.toml] in the Python 
Packaging User Guide.

## Build artifacts

See:

- https://packaging.python.org/en/latest/flow/#the-packaging-flow
- https://packaging.python.org/en/latest/tutorials/installing-packages/

See the documentation on [Building and Distributing Packages] in the Python Packaging User Guide for details on how to
build source and binary distributions of your package.


## Upload to the package distribution service (PyPI)

## Other sources and inspiration

 - [Automatic Versioning and Release — Python Package]

[Distribution Packages]: https://packaging.python.org/en/latest/glossary/#term-Distribution-Package
[PyPI]: https://pypi.org/
[Writing your pyproject.toml]: https://packaging.python.org/en/latest/guides/writing-pyproject-toml/#writing-pyproject-toml
[Automatic Versioning and Release — Python Package]: https://python.plainenglish.io/automatic-versioning-and-release-python-package-ba15dfb8adf0