/*Fundamental library concepts*/
#include <concepts>

/*Coroutines library*/
/*Coroutine support library*/
#include <coroutine>

/*Utilities library*/
// std::any class
#include <any>
// std::bitset class template
#include <bitset>
// C++ time utilities
#include <chrono>
// Three-way comparison operator support
#include <compare>
// Macro (and function) that saves (and jumps) to an execution context
#include <csetjmp>
// Functions and macro constants for signal management
#include <csignal>
// Handling of variable length argument lists
#include <cstdarg>
// Standard macros and typedefs
#include <cstddef>
// General purpose utilities: program control, dynamic memory allocation, random numbers, sort and search
#include <cstdlib>
// C-style time/date utilities
#include <ctime>
// std::expected class template
#include <expected>
// Function objects, Function invocations, Bind operations and Reference wrappers
#include <functional>

// std::initializer_list class template
#include <initializer_list>
// std::optional class template
#include <optional>
// Supplies means to obtain source code location
#include <source_location>
// std::tuple class template <type_traits>
#include <tuple>
// Compile-time type information
#include <typeindex>
// std::type_index
#include <typeindex>
// Runtime type information utilities
#include <typeinfo>
// Various utility components
#include <utility>
// std::variant class template
#include <variant>
// Supplies implementation-dependent library information
#include <version>

// Dynamic memory management
// High-level memory management utilities
#include <memory>
// Polymorphic allocators and memory resources
#include <memory_resource>
// Low-level memory management utilities
#include <new>
// Nested allocator class
#include <scoped_allocator>

// Numeric limits
// Limits of floating-point types
#include <cfloat>
// Formatting macros, intmax_t and uintmax_t math and conversions
#include <cinttypes>
// Limits of integral types
#include <climits>
// Fixed-width integer types and limits of other types
#include <cstdint>
// Uniform way to query properties of arithmetic types
#include <limits>
// Optional extended floating-point types
#include <stdfloat>

// Error handling
// Conditionally compiled macro that compares its argument to zero
#include <cassert>
// Macro containing the last error number
#include <cerrno>
// Exception handling utilities
#include <exception>
// Stacktrace library
#include <stacktrace>
// Standard exception objects
#include <stdexcept>
// Defines std::error_code, a platform-dependent error code
#include <system_error>

// Strings library
// Functions to determine the category of narrow characters
#include <cctype>
// std::to_chars and std::from_chars
#include <charconv>
// Various narrow character string handling functions
#include <cstring>
// C-style Unicode character conversion functions
#include <cuchar>
// Various wide and multibyte string handling functions
#include <cwchar>
// Functions to determine the category of wide characters
#include <cwctype>
// Formatting library including std::format
#include <format>
// std::basic_string class template
#include <string>
// std::basic_string_view class template
#include <string_view>

// Containers library
// std::array container
#include <array>
// std::deque container
#include <deque>
// std::forward_list container
#include <forward_list>
// std::list container
#include <list>
// std::map and std::multimap associative containers
#include <map>
// std::queue and std::priority_queue container adaptors
#include <queue>
// std::set and std::multiset associative containers
#include <set>
// std::span view
#include <span>
// std::stack container adaptor
#include <stack>
// std::unordered_map and std::unordered_multimap unordered associative containers
#include <unordered_map>
// std::unordered_set and std::unordered_multiset unordered associative containers
#include <unordered_set>
// std::vector container
#include <vector>

// Iterators library
// Range iterators
#include <iterator>

// Ranges library
// Range access, primitives, requirements, utilities and adaptors
#include <ranges>

// Algorithms library
// Algorithms that operate on ranges
#include <algorithm>
// Predefined execution policies for parallel versions of the algorithms
#include <execution>

// Numerics library
// Bit manipulation functions
#include <bit>
// Floating-point environment access functions
#include <cfenv>
// Common mathematics functions
#include <cmath>
// Complex number type
#include <complex>
// Math constants
#include <numbers>
// Numeric operations on values in ranges
#include <numeric>
// Random number generators and distributions
#include <random>
// Compile-time rational arithmetic
#include <ratio>
// Class for representing and manipulating arrays of values
#include <valarray>

// Localization library
// C localization utilities
#include <clocale>
// Unicode conversion facilities
#include <codecvt>
// Localization utilities
#include <locale>

// Input/output library
// C-style input-output functions
#include <cstdio>
// std::basic_fstream, std::basic_ifstream, std::basic_ofstream class templates and several typedefs
#include <fstream>
// Helper functions to control the format of input and output
#include <iomanip>
// std::ios_base class, std::basic_ios class template and several typedefs
#include <ios>
// Forward declarations of all classes in the input/output library
#include <iosfwd>
// Several standard stream objects
#include <iostream>
// std::basic_istream class template and several typedefs
#include <istream>
// std::basic_ostream, std::basic_iostream class templates and several typedefs
#include <ostream>
// Formatted output library including std::print
#include <print>
// std::basic_spanstream, std::basic_ispanstream, std::basic_ospanstream class templates and typedefs
#include <spanstream>
// std::basic_stringstream, std::basic_istringstream, std::basic_ostringstream class templates and several typedefs
#include <sstream>
// std::basic_streambuf class template
#include <streambuf>
// std::strstream, std::istrstream, std::ostrstream
#include <strstream>
// std::basic_osyncstream, std::basic_syncbuf, and typedefs
#include <syncstream>

// Filesystem library
// std::path class and supporting functions
#include <filesystem>

// Regular Expressions library
// Classes, algorithms and iterators to support regular expression processing
#include <regex>
// Atomic Operations library
#include <atomic>

// Thread support library
// Barriers
#include <barrier>
// Thread waiting conditions
#include <condition_variable>
// Primitives for asynchronous computations
#include <future>
// Latches
#include <latch>
// Mutual exclusion primitives
#include <mutex>
// Semaphores
#include <semaphore>
// Shared mutual exclusion primitives
#include <shared_mutex>
// Stop tokens for std::jthread
#include <stop_token>
// std::thread class and supporting functions
#include <thread>

/*C compatibility headers*/
// Behaves same as <cassert>
#include <assert.h>
// Behaves as if each name from <cctype> is placed in global namespace
#include <ctype.h>
// Behaves same as <cerrno>
#include <errno.h>
// Behaves as if each name from <cfenv> is placed in global namespace
#include <fenv.h>
// Behaves same as <cfloat>
#include <float.h>
// Behaves as if each name from <cinttypes> is placed in global namespace
#include <inttypes.h>
// Behaves same as <climits>
#include <limits.h>
// Behaves as if each name from <clocale> is placed in global namespace
#include <locale.h>
// Behaves as if each name from <cmath> is placed in global namespace, except for names of mathematical special functions
#include <math.h>
// Behaves as if each name from <csetjmp> is placed in global namespace
#include <setjmp.h>
// Behaves as if each name from <csignal> is placed in global namespace
#include <signal.h>
// Behaves as if each name from <cstdarg> is placed in global namespace
#include <stdarg.h>
// Behaves as if each name from <cstddef> is placed in global namespace, except for names of std::byte and related functions
#include <stddef.h>
// Behaves as if each name from <cstdint> is placed in global namespace
#include <stdint.h>
// Behaves as if each name from <cstdio> is placed in global namespace
#include <stdio.h>
// Behaves as if each name from <cstdlib> is placed in global namespace
#include <stdlib.h>
// Behaves as if each name from <cstring> is placed in global namespace
#include <string.h>
// Behaves as if each name from <ctime> is placed in global namespace
#include <time.h>
// Behaves as if each name from <cuchar> is placed in global namespace
#include <uchar.h>
// Behaves as if each name from <cwchar> is placed in global namespace
#include <wchar.h>
// Behaves as if each name from <cwctype> is placed in global namespace
#include <wctype.h>

// Special C compatibility headers

/*The header <stdatomic.h> declares names which are also provided in the C standard library,
and defines the _Atomic macro which is a keyword in C. Unlike other xxx.h headers, corresponding
<cstdatomic> is not provided.*/

// Defines _Atomic and provides corresponding components in the C standard library
#include <stdatomic.h>
