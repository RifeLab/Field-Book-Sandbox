"""
This module provides common functions for GitHub Actions 
automation scripts.
"""

import os
import subprocess
import sys


def run_command(cmd):
    """ Run a shell command and return the output. """
    result = subprocess.run(cmd, shell=True, capture_output=True, text=True)
    if result.returncode != 0:
        print(f"Error running command: {cmd}")
        print(f"Error: {result.stderr}")
        sys.exit(0)
    return result.stdout.strip()


def read_file(file_path):
    """Read content from a file."""
    try:
        with open(file_path, 'r') as f:
            return f.read()
    except Exception as e:
        print(f"Error reading file '{file_path}': {e}")
        sys.exit(0)


def write_file(file_path, content):
    """Write content to a file."""
    try:
        with open(file_path, 'w') as f:
            f.write(content)
    except Exception as e:
        print(f"Error writing to file '{file_path}': {e}")
        sys.exit(0)


def set_github_output(name, value):
    """ Set GitHub Actions output variable. """
    github_output = os.environ.get('GITHUB_OUTPUT')
    if github_output:
        with open(github_output, 'a') as f:
            f.write(f"{name}={value}\n")