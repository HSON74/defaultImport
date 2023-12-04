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
<compare>
(C++20)
Three-way comparison operator support
<csetjmp>
Macro (and function) that saves (and jumps) to an execution context
<csignal>
Functions and macro constants for signal management
<cstdarg>
Handling of variable length argument lists
<cstddef>
Standard macros and typedefs
<cstdlib>
General purpose utilities: program control, dynamic memory allocation, random numbers, sort and search
<ctime>
C-style time/date utilities
<expected>
(C++23)
std::expected class template
<functional>
Function objects, Function invocations, Bind operations and Reference wrappers
<initializer_list>
(C++11)
std::initializer_list class template
<optional>
(C++17)
std::optional class template
<source_location>
(C++20)
Supplies means to obtain source code location
<tuple>
(C++11)
std::tuple class template
<type_traits>
(C++11)
Compile-time type information
<typeindex>
(C++11)
std::type_index
<typeinfo>
Runtime type information utilities
<utility>
Various utility components
<variant>
(C++17)
std::variant class template
<version>
(C++20)
Supplies implementation-dependent library information
Dynamic memory management
<memory>
High-level memory management utilities
<memory_resource>
(C++17)
Polymorphic allocators and memory resources
<new>
Low-level memory management utilities
<scoped_allocator>
(C++11)
Nested allocator class
Numeric limits
<cfloat>
Limits of floating-point types
<cinttypes>
(C++11)
Formatting macros, intmax_t and uintmax_t math and conversions
<climits>
Limits of integral types
<cstdint>
(C++11)
Fixed-width integer types and limits of other types
<limits>
Uniform way to query properties of arithmetic types
<stdfloat>
(C++23)
Optional extended floating-point types
Error handling
<cassert>
Conditionally compiled macro that compares its argument to zero
<cerrno>
Macro containing the last error number
<exception>
Exception handling utilities
<stacktrace>
(C++23)
Stacktrace library
/*<stdexcept>
Standard exception objects
<system_error>
(C++11)
Defines std::error_code, a platform-dependent error code
Strings library
<cctype>
Functions to determine the category of narrow characters
<charconv>
(C++17)
std::to_chars and std::from_chars
<cstring>
Various narrow character string handling functions
<cuchar>
(C++11)
C-style Unicode character conversion functions
<cwchar>
Various wide and multibyte string handling functions
<cwctype>
Functions to determine the category of wide characters
<format>
(C++20)
Formatting library including std::format
<string>
std::basic_string class template
<string_view>
(C++17)
std::basic_string_view class template
Containers library
<array>
(C++11)
std::array container
<deque>
std::deque container
<flat_map>
(C++23)
std::flat_map and std::flat_multimap container adaptors
<flat_set>
(C++23)
std::flat_set and std::flat_multiset container adaptors
<forward_list>
(C++11)
std::forward_list container
<list>
std::list container
<map>
std::map and std::multimap associative containers
<mdspan>
(C++23)
std::mdspan view
<queue>
std::queue and std::priority_queue container adaptors
<set>
std::set and std::multiset associative containers
<span>
(C++20)
std::span view
<stack>
std::stack container adaptor
<unordered_map>
(C++11)
std::unordered_map and std::unordered_multimap unordered associative containers
<unordered_set>
(C++11)
std::unordered_set and std::unordered_multiset unordered associative containers
<vector>
std::vector container
Iterators library
<iterator>
Range iterators
Ranges library
<generator>
(C++23)
std::generator class template
<ranges>
(C++20)
Range access, primitives, requirements, utilities and adaptors
Algorithms library
<algorithm>
Algorithms that operate on ranges
<execution>
(C++17)
Predefined execution policies for parallel versions of the algorithms
Numerics library
<bit>
(C++20)
Bit manipulation functions
<cfenv>
(C++11)
Floating-point environment access functions
<cmath>
Common mathematics functions
<complex>
Complex number type
<numbers>
(C++20)
Math constants
<numeric>
Numeric operations on values in ranges
<random>
(C++11)
Random number generators and distributions
<ratio>
(C++11)
Compile-time rational arithmetic
<valarray>
Class for representing and manipulating arrays of values
Localization library
<clocale>
C localization utilities
<codecvt>
(C++11)(deprecated in C++17)
Unicode conversion facilities
<locale>
Localization utilities
Input/output library
<cstdio>
C-style input-output functions
<fstream>
std::basic_fstream, std::basic_ifstream, std::basic_ofstream class templates and several typedefs
<iomanip>
Helper functions to control the format of input and output
<ios>
std::ios_base class, std::basic_ios class template and several typedefs
<iosfwd>
Forward declarations of all classes in the input/output library
<iostream>
Several standard stream objects
<istream>
std::basic_istream class template and several typedefs
<ostream>
std::basic_ostream, std::basic_iostream class templates and several typedefs
<print>
(C++23)
Formatted output library including std::print
<spanstream>
(C++23)
std::basic_spanstream, std::basic_ispanstream, std::basic_ospanstream class templates and typedefs
<sstream>
std::basic_stringstream, std::basic_istringstream, std::basic_ostringstream class templates and several typedefs
<streambuf>
std::basic_streambuf class template
<strstream>
(deprecated in C++98)
std::strstream, std::istrstream, std::ostrstream
<syncstream>
(C++20)
std::basic_osyncstream, std::basic_syncbuf, and typedefs
Filesystem library
<filesystem>
(C++17)
std::path class and supporting functions
Regular Expressions library
<regex>
(C++11)
Classes, algorithms and iterators to support regular expression processing
Atomic Operations library
<atomic>
(C++11)
Atomic operations library
Thread support library
<barrier>
(C++20)
Barriers
<condition_variable>
(C++11)
Thread waiting conditions
<future>
(C++11)
Primitives for asynchronous computations
<latch>
(C++20)
Latches
<mutex>
(C++11)
Mutual exclusion primitives
<semaphore>
(C++20)
Semaphores
<shared_mutex>
(C++14)
Shared mutual exclusion primitives
<stop_token>
(C++20)
Stop tokens for std::jthread
<thread>
(C++11)
std::thread class and supporting functions
C compatibility headers
For some of the C standard library headers of the form xxx.h, the C++ standard library both includes an identically-named header and another header of the form cxxx (all meaningful cxxx headers are listed above). The intended use of headers of form xxx.h is for interoperability only. It is possible that C++ source files need to include one of these headers in order to be valid ISO C. Source files that are not intended to also be valid ISO C should not use any of the C headers.

With the exception of complex.h , each xxx.h header included in the C++ standard library places in the global namespace each name that the corresponding cxxx header would have placed in the std namespace.

These headers are allowed to also declare the same names in the std namespace, and the corresponding cxxx headers are allowed to also declare the same names in the global namespace: including <cstdlib> definitely provides std::malloc and may also provide ::malloc. Including <stdlib.h> definitely provides ::malloc and may also provide std::malloc. This applies even to functions and function overloads that are not part of C standard library.

Notes: xxx.h headers are deprecated in C++98 and undeprecated in C++23. These headers are discouraged for pure C++ code, but not subject to future removal.

<assert.h>
Behaves same as <cassert>
<ctype.h>
Behaves as if each name from <cctype> is placed in global namespace
<errno.h>
Behaves same as <cerrno>
<fenv.h>
(C++11)
Behaves as if each name from <cfenv> is placed in global namespace
<float.h>
Behaves same as <cfloat>
<inttypes.h>
(C++11)
Behaves as if each name from <cinttypes> is placed in global namespace
<limits.h>
Behaves same as <climits>
<locale.h>
Behaves as if each name from <clocale> is placed in global namespace
<math.h>
Behaves as if each name from <cmath> is placed in global namespace,
except for names of mathematical special functions
<setjmp.h>
Behaves as if each name from <csetjmp> is placed in global namespace
<signal.h>
Behaves as if each name from <csignal> is placed in global namespace
<stdarg.h>
Behaves as if each name from <cstdarg> is placed in global namespace
<stddef.h>
Behaves as if each name from <cstddef> is placed in global namespace,
except for names of std::byte and related functions
<stdint.h>
(C++11)
Behaves as if each name from <cstdint> is placed in global namespace
<stdio.h>
Behaves as if each name from <cstdio> is placed in global namespace
<stdlib.h>
Behaves as if each name from <cstdlib> is placed in global namespace
<string.h>
Behaves as if each name from <cstring> is placed in global namespace
<time.h>
Behaves as if each name from <ctime> is placed in global namespace
<uchar.h>
(C++11)
Behaves as if each name from <cuchar> is placed in global namespace
<wchar.h>
Behaves as if each name from <cwchar> is placed in global namespace
<wctype.h>
Behaves as if each name from <cwctype> is placed in global namespace
Special C compatibility headers
The header <stdatomic.h> declares names which are also provided in the C standard library, and defines the _Atomic macro which is a keyword in C. Unlike other xxx.h headers, corresponding <cstdatomic> is not provided.

<stdatomic.h>
(C++23)
Defines _Atomic and provides corresponding components in the C standard library
Empty C headers
The headers <complex.h>, <ccomplex>, <tgmath.h>, and <ctgmath> do not contain any content from the C standard library and instead merely include other headers from the C++ standard library.

<ccomplex>
(C++11)(deprecated in C++17)(removed in C++20)
Simply includes the header <complex>
<complex.h>
(C++11)
Simply includes the header <complex>
<ctgmath>
(C++11)(deprecated in C++17)(removed in C++20)
Simply includes the headers <complex> and <cmath>: the overloads equivalent to the contents of the C header tgmath.h are already provided by those headers
<tgmath.h>
(C++11)
Simply includes the headers <complex> and <cmath>
Meaningless C headers
The headers <ciso646>, <cstdalign>, and <cstdbool> are meaningless in C++ because the macros they provide in C are language keywords in C++.

<ciso646>
(removed in C++20)
Empty header. The macros that appear in iso646.h in C are keywords in C++
<cstdalign>
(deprecated in C++17)(removed in C++20)
Defines one compatibility macro constant
<cstdbool>
(deprecated in C++17)(removed in C++20)
Defines one compatibility macro constant
<iso646.h>
Has no effect
<stdalign.h>

Defines one compatibility macro constant
<stdbool.h>

Defines one compatibility macro constant*/