{ pkgs ? import <nixpkgs> { } }:

with pkgs;

mkShell { buildInputs = [ gradle_6 jetbrains.idea-community openjdk8 ]; }
