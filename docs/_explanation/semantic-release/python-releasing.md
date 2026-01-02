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

The standard practice is to use a `pyproject.toml` file to define the package metadata, dependencies, and build
settings.

Change the `name` to include your username; this ensures that you have a unique package name that doesn’t conflict with
packages uploaded by other people following this learning hour.

```toml
[project]
name = "lift_button_ibanfr"
```
Change `authors` to include your name and email address.

```toml
authors = [
    { name="Iván Fernández", email="ibanFR@users.noreply.github.com" },

]
```

Change the `[project.urls]` to include links to your repository.

```toml
Homepage = "https://github.com/ibanFR/semantic-release-python"
Issues = "https://github.com/ibanFR/semantic-release-python/issues"
```

For more details on how to configure the `pyproject.toml` file, refer to [Writing your pyproject.toml] in the Python 
Packaging User Guide.

## Create an account on TestPyPI

TestPyPI is a separate instance of the Python Package Index (PyPI) that allows you to try out the distribution tools and
process without worrying about affecting the real index.

To register an account, go to https://test.pypi.org/account/register/ and complete the steps on that page. You will 
also need to verify your email address before you're able to upload any packages.

## Build artifacts

See:

- https://packaging.python.org/en/latest/flow/#the-packaging-flow
- https://packaging.python.org/en/latest/tutorials/installing-packages/

See the documentation on [Building and Distributing Packages] in the Python Packaging User Guide for details on how to
build source and binary distributions of your package.


## Upload to the package distribution service (PyPI)

See:

- https://packaging.python.org/en/latest/guides/publishing-package-distribution-releases-using-github-actions-ci-cd-workflows/

## Other sources and inspiration

 - [Automatic Versioning and Release — Python Package]

[Distribution Packages]: https://packaging.python.org/en/latest/glossary/#term-Distribution-Package
[PyPI]: https://pypi.org/
[Writing your pyproject.toml]: https://packaging.python.org/en/latest/guides/writing-pyproject-toml/#writing-pyproject-toml
[Automatic Versioning and Release — Python Package]: https://python.plainenglish.io/automatic-versioning-and-release-python-package-ba15dfb8adf0