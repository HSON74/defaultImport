# base64 security considerations in RFC 4648
import base64

# CGI security considerations
import cgi

# all constructors take a “usedforsecurity” keyword-only argument disabling known insecure and blocked algorithms
import hashlib

# is not suitable for production use, only implementing basic security checks. See the security considerations.
import http.server

# Logging configuration uses eval()
import logging

# Connection.recv() uses pickle
import multiprocessing

# Restricting globals in pickle
import pickle

# shelve is based on pickle and thus unsuitable for dealing with untrusted sources
import shelve

# SSL/TLS security considerations
import ssl

# Subprocess security considerations
import subprocess

# mktemp is deprecated due to vulnerability to race conditions
import tempfile

# XML vulnerabilities
import xml

# maliciously prepared .zip files can cause disk volume exhaustion
import zipfile

# Text Processing Services
# Common string operations
import string

# Regular expression operations
import re

# Helpers for computing deltas
import difflib

# Text wrapping and filling
import textwrap

# Unicode Database
import unicodedata

# Internet String Preparation
import stringprep

# GNU readline interface
import readline

# Completion function for GNU readline
import rlcompleter

# Binary Data Services
# Interpret bytes as packed binary data
import struct

# Codec registry and base classes
import codecs

# Data Types
# Basic date and time types
import datetime

# IANA time zone support
import zoneinfo

# General calendar-related functions
import calendar

# Container datatypes
import collections

# Abstract Base Classes for Containers
import collections.abc

# Heap queue algorithm
import heapq

# Array bisection algorithm
import bisect

# Efficient arrays of numeric values
import array

# Weak references
import weakref

# Dynamic type creation and names for built-in types
import types

# Shallow and deep copy operations
import copy

# Data pretty printer
import pprint

# Alternate repr() implementation
import reprlib

# Support for enumerations
import enum

# Functionality to operate with graph-like structures
import graphlib

# Numeric and Mathematical Modules
# Numeric abstract base classes
import numbers

# Mathematical functions
import math

# Mathematical functions for complex numbers
import cmath

# Decimal fixed point and floating point arithmetic
import decimal

# Rational numbers
import fractions

# Generate pseudo-random numbers
import random

# Mathematical statistics functions
import statistics

# Functional Programming Modules
# Functions creating iterators for efficient looping
import itertools

# Higher-order functions and operations on callable objects
import functools

# Standard operators as functions
import operator

# File and Directory Access
# Object-oriented filesystem paths
import pathlib

# Common pathname manipulations
import os.path

# Iterate over lines from multiple input streams
import fileinput

# Interpreting stat() results
import stat

# File and Directory Comparisons
import filecmp

# Generate temporary files and directories
import tempfile

# Unix style pathname pattern expansion
import glob

# Unix filename pattern matching
import fnmatch

# Random access to text lines
import linecache

# High-level file operations
import shutil

# Data Persistence
# Python object serialization
import pickle

# Register pickle support functions
import copyreg

# Python object persistence
import shelve

# Internal Python object serialization
import marshal

# Interfaces to Unix “databases”
import dbm

# DB-API 2.0 interface for SQLite databases
import sqlite3

# Data Compression and Archiving
# Compression compatible with gzip
import zlib

# Support for gzip files
import gzip

# Support for bzip2 compression
import bz2

# Compression using the LZMA algorithm
import lzma

# Work with ZIP archives
import zipfile

# Read and write tar archive files
import tarfile

# File Formats
# CSV File Reading and Writing
import csv

# Configuration file parser
import configparser

# Parse TOML files
import tomllib

# netrc file processing
import netrc

# Generate and parse Apple .plist files
import plistlib

# Cryptographic Services
# Secure hashes and message digests
import hashlib

# Keyed-Hashing for Message Authentication
import hmac

# Generate secure random numbers for managing secrets
import secrets

# Generic Operating System Services
# Miscellaneous operating system interfaces
import os

# Core tools for working with streams
import io

# Time access and conversions
import time

# Parser for command-line options, arguments and sub-commands
import argparse

# C-style parser for command line options
import getopt

# Logging facility for Python
import logging

# Logging configuration
import logging.config

# Logging handlers
import logging.handlers

# Portable password input
import getpass

# Terminal handling for character-cell displays
import curses

# Text input widget for curses programs
import curses.textpad

# Utilities for ASCII characters
import curses.ascii

# A panel stack extension for curses
import curses.panel

# Access to underlying platform’s identifying data
import platform

# Standard errno system symbols
import errno

# A foreign function library for Python
import ctypes

# Concurrent Execution
# Thread-based parallelism
import threading

# Process-based parallelism
import multiprocessing

# Shared memory for direct access across processes
import multiprocessing.shared_memory

# Launching parallel tasks
import concurrent.futures

# Subprocess management
import subprocess

# Event scheduler
import sched

# A synchronized queue class
import queue

# Context Variables
import contextvars

# Low-level threading API
import _thread

# Networking and Interprocess Communication
# Asynchronous I/O
import asyncio

# Low-level networking interface
import socket

# TLS/SSL wrapper for socket objects
import ssl

# Waiting for I/O completion
import select

# High-level I/O multiplexing
import selectors

# Set handlers for asynchronous events
import signal

# Memory-mapped file support
import mmap

# Internet Data Handling
# An email and MIME handling package
import email

# JSON encoder and decoder
import json

# Manipulate mailboxes in various formats
import mailbox

# Map filenames to MIME types
import mimetypes

# Base16, Base32, Base64, Base85 Data Encodings
import base64

# Convert between binary and ASCII
import binascii

# Encode and decode MIME quoted-printable data
import quopri

# Structured Markup Processing Tools
# HyperText Markup Language support
import html

# Simple HTML and XHTML parser
import html.parser

# Definitions of HTML general entities
import html.entities

# XML Processing Modules
# The ElementTree XML API
import xml.etree.ElementTree

# The Document Object Model API
import xml.dom

# Minimal DOM implementation
import xml.dom.minidom

# Support for building partial DOM trees
import xml.dom.pulldom

# Support for SAX2 parsers
import xml.sax

# Base classes for SAX handlers
import xml.sax.handler

# SAX Utilities
import xml.sax.saxutils

# Interface for XML parsers
import xml.sax.xmlreader

# Fast XML parsing using Expat
import xml.parsers.expat

# Internet Protocols and Support
# Convenient web-browser controller
import webbrowser

# WSGI Utilities and Reference Implementation
import wsgiref

# URL handling modules
import urllib

# Extensible library for opening URLs
import urllib.request

# Response classes used by urllib
import urllib.response

# Parse URLs into components
import urllib.parse

# Exception classes raised by urllib.request
import urllib.error

# Parser for robots.txt
import urllib.robotparser

# HTTP modules
import http

# HTTP protocol client
import http.client

# FTP protocol client
import ftplib

# POP3 protocol client
import poplib

# IMAP4 protocol client
import imaplib

# SMTP protocol client
import smtplib

# UUID objects according to RFC 4122
import uuid

# A framework for network servers
import socketserver

# HTTP servers
import http.server

# HTTP state management
import http.cookies

# Cookie handling for HTTP clients
import http.cookiejar

# XMLRPC server and client modules
import xmlrpc

# XML-RPC client access
import xmlrpc.client

# Basic XML-RPC servers
import xmlrpc.server

# IPv4/IPv6 manipulation library
import ipaddress

# Multimedia Services
# Read and write WAV files
import wave

# Conversions between color systems
import colorsys

# Internationalization
# Multilingual internationalization services
import gettext

# Internationalization services
import locale

# Program Frameworks
# Turtle graphics
import turtle

# Support for line-oriented command interpreters
import cmd

# Simple lexical analysis
import shlex

# Graphical User Interfaces with Tk
# Python interface to Tcl/Tk
import tkinter

# Color choosing dialog
import tkinter.colorchooser

# Tkinter font wrapper
import tkinter.font

# Tkinter Dialogs
# Tkinter message prompts
import tkinter.messagebox

# Scrolled Text Widget
import tkinter.scrolledtext

# Drag and drop support
import tkinter.dnd

# Tk themed widgets
import tkinter.ttk

# Extension widgets for Tk
import tkinter.tix

# IDLE Development Tools
# Support for type hints
typing
# Documentation generator and online help system
pydoc

# Python Development Mode
# Test interactive Python examples
import doctest

# Unit testing framework
import unittest

# mock object library
import unittest.mock

# getting started
# Regression tests package for Python
import test

# Utilities for the Python test suite
import test.support

# Utilities for socket tests
import test.support.socket_helper

# Utilities for the Python execution tests
import test.support.script_helper

# Support tools for testing correct bytecode generation
import test.support.bytecode_helper

# Utilities for threading tests
import test.support.threading_helper

# Utilities for os tests
import test.support.os_helper

# Utilities for import tests
import test.support.import_helper

# Utilities for warnings tests
import test.support.warnings_helper

# Debugging and Profiling
# Debugger framework
import bdb

# Dump the Python traceback
import faulthandler

# The Python Debugger
import pdb

# The Python Profilers
# Measure execution time of small code snippets
import timeit

# Trace or track Python statement execution
import trace

# Trace memory allocations
import tracemalloc

# Software Packaging and Distribution
# Building and installing Python modules
import distutils

# Bootstrapping the pip installer
import ensurepip

# Creation of virtual environments
import venv

# Manage executable Python zip archives
import zipapp

# Python Runtime Services
# System-specific parameters and functions
import sys

# Provide access to Python’s configuration information
import sysconfig

# Built-in objects
import builtins

# Top-level code environment
import __main__

# Warning control
import warnings

# Data Classes
import dataclasses

# Utilities for with-statement contexts
import contextlib

# Abstract Base Classes
import abc

# Exit handlers
import atexit

# Print or retrieve a stack traceback
import traceback

# Future statement definitions
import __future__

# Garbage Collector interface
import gc

# Inspect live objects
import inspect

# Site-specific configuration hook
import site

# Custom Python Interpreters
# Interpreter base classes
import code

# Compile Python code
import codeop

# Importing Modules
# Import modules from Zip archives
import zipimport

# Package extension utility
import pkgutil

# Find modules used by a script
import modulefinder

# Locating and executing Python modules
import runpy

# The implementation of import
import importlib

# Package resource reading, opening and access
import importlib.resources

# Abstract base classes for resources
import importlib.resources.abc

# Accessing package metadata
import importlib.metadata


# Python Language Services
# Abstract Syntax Trees
import ast

# Access to the compiler’s symbol tables
import symtable

# Constants used with Python parse trees
import token

# Testing for Python keywords
import keyword

# Tokenizer for Python source
import tokenize

# Detection of ambiguous indentation
import tabnanny

# Python module browser support
import pyclbr

# Compile Python source files
import py_compile

# Byte-compile Python libraries
import compileall

# Disassembler for Python bytecode
import dis

# Tools for pickle developers
import pickletools

# MS Windows Specific Services
# Useful routines from the MS VC++ runtime
import msvcrt

# Windows registry access
import winreg

# Sound-playing interface for Windows
import winsound

# Unix Specific Services
# The most common POSIX system calls
import posix

# The password database
import pwd

# The group database
import grp

# POSIX style tty control
import termios

# Terminal control functions
import tty

# Pseudo-terminal utilities
import pty

# The fcntl and ioctl system calls
import fcntl

# Resource usage information
import resource

# Unix syslog library routines
import syslog

# Superseded Modules
# Read and write AIFF and AIFC files
import aifc

# Asynchronous socket handler
import asyncore

# Manipulate raw audio data
import audioop

# Common Gateway Interface support
import cgi

# Traceback manager for CGI scripts
import cgitb

# Read IFF chunked data
import chunk

# Function to check Unix passwords
import crypt

# Determine the type of an image
import imghdr

# Access the import internals
import ImportFile

# Mailcap file handling
import mailcap

# Read and write Microsoft Installer files
import msilib

# Interface to Sun’s NIS (Yellow Pages)
import nis

# NNTP protocol client
import nntplib

# Parser for command line options
import optparse

# Access to OSS-compatible audio devices
import ossaudiodev

# Interface to shell pipelines
import pipes

# SMTP Server
import smtplib

# Determine type of sound file
import sndhdr

# The shadow password database
import spwd

# Read and write Sun AU files
import sunau

# Telnet client
import telnetlib

# Encode and decode uuencode files
import uu

# Encode and decode XDR data
import xdrlib
