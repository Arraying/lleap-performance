# Important Information

This is a slimmed-down version of the DaCapo Benchmark [1], version 23.11-MR2, made available under the [Apache License 2.0](https://github.com/dacapobench/dacapobench/blob/4e3de06d48e4615b65959b9b384f20a1670ebc1a/LICENSE).
A copy of this license, taken directly from the DaCapo repository, has been attached in this directory.

There are no changes made to the source code. The changes solely consist of stripping the contents of distributed `.zip` file, which has been committed here.
Concretely, the following changes were made:
- Removed all files in the `dat/` directory that were not necessary for the successful execution of the Sunflow benchmark.
- Removed all files in the `jar/` and `jar/lib` directory that were not necessary for the successful execution of the Sunflow benchmark.

[1] Stephen M. Blackburn, Zixian Cai, Rui Chen, Xi Yang, John Zhang, and John Zigman. 2025. Rethinking Java Performance Analysis. In Proceedings of the 30th ACM International Conference on Architectural Support for Programming Languages and Operating Systems, Volume 1 (ASPLOS ’25), March 30-April 3, 2025, Rotterdam, Netherlands.
