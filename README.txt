

                       | Caracteristicas Stream |  |

              |------------------------|------------------------|

    • Stream é uma solução para proessar sequencias de dados de forma:
        - Declartiva (iterações internas: escodida do programador)
        - Parallel-friendly (imutavel -> thread safe)
        - Sem efeitos colaterais (pure functions)
        - Sob demanda (lazy evaluation)

    • Acesso sequencial (não há indices)
    • Acesso aos elementos de forma transparente (não há acesso direto)
    • Suporte a operações de agregação (filter, map, reduce, etc)
    • Suporte a operações de redução (allMatch, anyMatch, etc)
    • Suporte a operações de busca (findFirst, findAny, etc)
    • Suporte a operações de iteração (forEach, etc)
    • Suporte a operações de conversão (toArray, collect, etc)
    • Suporte a operações de agrupamento (groupBy, etc)
    • Suporte a operações de geração de fluxo (iterate, generate, etc)

    • Single-use: uma vez que uma Stream é usada, ela não pode ser reutilizada.(usada novamente)

    • Pipeline: operaçoes em streams retornam novas streams. Então é possivel criar uma cadeia de operações (pipeline).
    Essas operações são chamadas de intermediate operations.

    • Stream é uma sequencia de elementos que suporta operações sequenciais e paralelas de agregação.
    • Elementos são fontes de dados (arrays, collections, IO resources, etc).
    • Stream não armazena dados.
    • Stream não altera a fonte de dados. Ela retorna uma nova Stream com os novos valores.
    • Stream opera em 3 etapas:
        - Criação de uma Stream
        - Intermediary operations
        - Terminal operations

    • Criação de uma Stream:
