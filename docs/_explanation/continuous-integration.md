---
title: Continuous Integration
---

# GitHub Actions CI/CD

This project uses GitHub Actions for Continuous Integration and Continuous Deployment (CI/CD).

## GitHub Actions Configuration

See [Using secrets in GitHub Actions].

## Release workflow

The Release workflow is defined in the `.github/workflows/release.yml` file.

## Pages workflow

The GitHub Actions workflow is configured to automatically build and deploy the documentation site to GitHub Pages
whenever changes are pushed to the `main` branch.

The workflow is defined in the `.github/workflows/pages.yml` file.

[Using secrets in GitHub Actions]: https://docs.github.com/en/actions/security-for-github-actions/security-guides/using-secrets-in-github-actions


