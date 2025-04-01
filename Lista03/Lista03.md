# Lista 03 - Programação Orientada a Objetos (POO) - Java

## 1. Formatação de Nome no Padrão ABNT
Desenvolva um programa em **Java** que leia o **nome completo** de um autor e o exiba no **formato ABNT**.

### Exemplo:
**Entrada:**
```
Nome: Brendo Hideki Affonso
```
**Saída:**
```
Formato ABNT: AFFONSO, B. H.
```

---

## 2. Codificação e Decodificação de Senhas
Desenvolva um programa em **Java** que **codifique e decodifique senhas**. O programa deve:
- Receber uma senha e aplicar **no mínimo três modificações**.
- Gerar uma nova senha com **tamanho bem maior que o original**.
- A nova senha **não pode ser interpretada visualmente** (deve ser incompreensível para humanos).

### Exemplo:
```
Senha -> mod1 -> mod2 -> mod3 -> ajdeu72jnwokuh234nsbwoiuw091
```
Onde **mod1, mod2 e mod3** são métodos implementados com a seguinte assinatura:

```java
/**
 * Descrição do método.
 * @param password A senha a ser codificada ou decodificada.
 * @param codec Flag que indica se o algoritmo de methodName
 *              será utilizado para codificar ou decodificar a senha.
 * @return A senha codificada ou decodificada.
 */
public String methodName(String password, int codec);
```

