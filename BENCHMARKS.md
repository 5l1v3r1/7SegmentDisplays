| Command | Mean [ms] | Min [ms] | Max [ms] | Relative |
|:---|---:|---:|---:|---:|
| `C/C.out` | 18.1 ± 0.1 | 18.0 | 18.4 | 1.00 |
| `C/C++.out` | 21.2 ± 0.3 | 20.9 | 21.9 | 1.17 ± 0.02 |
| `Rust/rust.out` | 22.1 ± 0.2 | 21.8 | 22.4 | 1.22 ± 0.01 |
| `Go/Go.out` | 27.5 ± 1.3 | 25.7 | 29.4 | 1.51 ± 0.07 |
| `Pascal/Pascal.out` | 35.1 ± 0.2 | 34.9 | 35.3 | 1.93 ± 0.02 |
| `Nim/Nim.out` | 42.0 ± 0.4 | 41.7 | 42.6 | 2.32 ± 0.03 |
| `D/D.out` | 77.7 ± 0.7 | 76.9 | 79.0 | 4.29 ± 0.05 |
| `Pascal/Delphi.out` | 93.3 ± 0.8 | 92.2 | 94.6 | 5.14 ± 0.06 |
| `node JavaScript/JavaScript.js` | 105.4 ± 1.9 | 102.8 | 108.3 | 5.81 ± 0.11 |
| `mono C/C#.out` | 111.5 ± 1.3 | 109.9 | 113.8 | 6.15 ± 0.08 |
| `perl Perl/Perl.pl` | 128.7 ± 2.1 | 127.2 | 133.2 | 7.09 ± 0.13 |
| `awk -f Awk/Awk.awk` | 129.5 ± 2.2 | 127.1 | 132.6 | 7.14 ± 0.13 |
| `Dart/Dart.out` | 133.7 ± 3.8 | 131.0 | 140.4 | 7.37 ± 0.22 |
| `ruby Ruby/Ruby.ru` | 134.4 ± 1.6 | 132.5 | 136.5 | 7.41 ± 0.10 |
| `python2 Python/Python2.py` | 149.0 ± 1.7 | 145.8 | 151.5 | 8.21 ± 0.11 |
| `php -n PHP/PHP.php` | 153.4 ± 3.7 | 149.6 | 161.2 | 8.46 ± 0.22 |
| `lsc JavaScript/LiveScript.ls` | 172.9 ± 2.7 | 170.7 | 178.0 | 9.53 ± 0.17 |
| `coffee JavaScript/CoffeeScript.coffee` | 179.4 ± 3.1 | 174.8 | 184.1 | 9.89 ± 0.19 |
| `python3 Python/Python3.py` | 181.6 ± 2.6 | 178.7 | 186.0 | 10.01 ± 0.16 |
| `lua Lua/Lua.lua` | 235.7 ± 2.2 | 233.0 | 240.0 | 12.99 ± 0.16 |
| `kotlin -cp Java Kotlin7SegmentDisplays` | 255.9 ± 5.7 | 246.5 | 261.3 | 14.11 ± 0.33 |
| `gawk -f Awk/Gawk.awk` | 261.9 ± 1.5 | 260.5 | 264.6 | 14.44 ± 0.14 |
| `java -cp Java Java7SegmentDisplays` | 320.6 ± 21.3 | 283.2 | 343.9 | 17.68 ± 1.18 |
| `julia Julia/Julia.jl` | 330.7 ± 4.3 | 325.2 | 339.5 | 18.23 ± 0.27 |
| `ts-node --skip-project -T JavaScript/TypeScript.ts` | 379.3 ± 5.4 | 373.9 | 389.1 | 20.91 ± 0.34 |
| `psql -qtAX -U postgres -d 7SegmentDisplays -f SQL/PostgreSQL.sql` | 576.7 ± 8.3 | 565.7 | 587.0 | 31.79 ± 0.52 |
| `sqlite3 /tmp/7SegmentDisplays.db <SQL/SQLite.sql` | 577.9 ± 3.7 | 574.8 | 583.2 | 31.86 ± 0.31 |
| `scala -cp Java Scala7SegmentDisplays` | 752.8 ± 56.5 | 696.4 | 865.2 | 41.50 ± 3.13 |
| `Rscript --vanilla R/R.r` | 895.4 ± 7.5 | 883.3 | 905.1 | 49.37 ± 0.56 |
| `groovy Java/Groovy.groovy 2>/dev/null` | 1010.2 ± 23.0 | 974.1 | 1037.5 | 55.70 ± 1.34 |
| `escript -c Erlang/erlang.erl` | 1099.2 ± 11.9 | 1078.6 | 1109.7 | 60.60 ± 0.80 |
| `mysql 7SegmentDisplays -Nsu travis <SQL/MySQL.sql` | 1164.3 ± 27.0 | 1141.0 | 1213.7 | 64.19 ± 1.57 |
| `zsh -f Shell/Zsh.sh` | 2348.7 ± 41.7 | 2293.9 | 2403.7 | 129.49 ± 2.50 |
| `bash --noprofile --norc Shell/Bash.sh` | 5206.9 ± 44.2 | 5153.1 | 5269.2 | 287.08 ± 3.26 |
| `cmake -P CMake/CMake.cmake 2>&1` | 6624.1 ± 68.8 | 6504.2 | 6701.4 | 365.21 ± 4.69 |
| `perl6 Perl/Perl6.p6` | 6877.4 ± 108.6 | 6729.7 | 7035.4 | 379.18 ± 6.64 |
