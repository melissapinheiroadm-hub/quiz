import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("==============================================");
        System.out.println("           QUIZ -  CULTURA GEEK       ");
        System.out.println("==============================================");
        System.out.println("Aluno: Melissa Pinheiro Almeida");
        System.out.println("Professor: Brenno Pimenta");
        System.out.println("Faculdade: Faculdade Alfredo Nasser (UNIFAN)");
        System.out.println("==============================================");
        System.out.println();

        System.out.println("========== AJUDA ==========");
        System.out.println("Digite 1 para dica");
        System.out.println("Digite 2 para explicação do tema");
        System.out.println("============================");
        System.out.println();

        List<Questao> questoes = new ArrayList<>();

        Questao q1 = new Questao();
        q1.pergunta = "1. Qual modelo 3D descartado de Undertale foi considerado pelo Toby Fox \"realista até demais\"?";
        q1.opcaoA = "A) Sans";
        q1.opcaoB = "B) Toriel";
        q1.opcaoC = "C) Flowey";
        q1.opcaoD = "D) Papyrus";
        q1.opcaoE = "E) Frisk";
        q1.correta = "B";
        questoes.add(q1);

        Questao q2 = new Questao();
        q2.pergunta = "2. Qual é a morte mais icônica de Another?";
        q2.opcaoA = "A) Yukari — A morte do guarda-chuva";
        q2.opcaoB = "B) Mieko — Atropelada";
        q2.opcaoC = "C) Manabu — Ataque cardíaco";
        q2.opcaoD = "D) Yumi — Caiu da janela";
        q2.opcaoE = "E) Sanae — Elevador despenca";
        q2.correta = "A";
        questoes.add(q2);

        Questao q3 = new Questao();
        q3.pergunta = "3. Qual das músicas abaixo não pertence à Hatsune Miku?";
        q3.opcaoA = "A) Mesmerizer";
        q3.opcaoB = "B) Retry Now";
        q3.opcaoC = "C) Static";
        q3.opcaoD = "D) Mãos Pra Cima";
        q3.opcaoE = "E) Looping the Rooms";
        q3.correta = "E";
        questoes.add(q3);

        Questao q4 = new Questao();
        q4.pergunta = "4. Qual é o final de Boku no Hero?";
        q4.opcaoA = "A) Deku se torna o herói número 1";
        q4.opcaoB = "B) Deku morre no final da história";
        q4.opcaoC = "C) Bakugou vira o protagonista no final";
        q4.opcaoD = "D) Deku vira CLT";
        q4.opcaoE = "E) Nenhuma das alternativas";
        q4.correta = "D";
        questoes.add(q4);

        Questao q5 = new Questao();
        q5.pergunta = "5. Qual desses animes não é considerado infantil?";
        q5.opcaoA = "A) Sailor Moon";
        q5.opcaoB = "B) Puella Magi Madoka Magica";
        q5.opcaoC = "C) Pokémon";
        q5.opcaoD = "D) Ponyo";
        q5.opcaoE = "E) Cardcaptor Sakura";
        q5.correta = "B";
        questoes.add(q5);

        Questao q6 = new Questao();
        q6.pergunta = "6. De quem é esta música?";
        q6.opcaoA = "A) Pérola — Steven Universo";
        q6.opcaoB = "B) Marceline — Hora de Aventura";
        q6.opcaoC = "C) Darwin — O Incrível Mundo de Gumball";
        q6.opcaoD = "D) Luz — A Casa Coruja";
        q6.opcaoE = "E) Fluttershy — My Little Pony";
        q6.correta = "B";
        questoes.add(q6);

        Questao q7 = new Questao();
        q7.pergunta = "7. Qual é a morte mais comum em animes de isekai?";
        q7.opcaoA = "A) Trator";
        q7.opcaoB = "B) Queda";
        q7.opcaoC = "C) Caminhão";
        q7.opcaoD = "D) Explosão";
        q7.opcaoE = "E) Sono";
        q7.correta = "C";
        questoes.add(q7);

        Questao q8 = new Questao();
        q8.pergunta = "8. Qual era a cor do Kirby em seu primeiro jogo, Kirby's Dream Land?";
        q8.opcaoA = "A) Rosa";
        q8.opcaoB = "B) Amarelo";
        q8.opcaoC = "C) Branco";
        q8.opcaoD = "D) Azul";
        q8.opcaoE = "E) Roxo";
        q8.correta = "C";
        questoes.add(q8);

        Questao q9 = new Questao();
        q9.pergunta = "9. De onde veio o nome \"Steve\" para o personagem de Minecraft?";
        q9.opcaoA = "A) Foi inspirado no cofundador da Apple, Steve Jobs.";
        q9.opcaoB = "B) Veio de um dos programadores originais do jogo.";
        q9.opcaoC = "C) Era o nome do gato de estimação do criador, Markus \"Notch\".";
        q9.opcaoD = "D) Super Meat Boy.";
        q9.opcaoE = "E) Veio aleatoriamente.";
        q9.correta = "D";
        questoes.add(q9);

        Questao q10 = new Questao();
        q10.pergunta = "10. Qual é o Konami Code?";
        q10.opcaoA = "A) ↑ ↑ ↓ ↓ ← → ← → B A";
        q10.opcaoB = "B) ↓ ↓ ↑ ↑ → ← → ← A B";
        q10.opcaoC = "C) ↑ ↓ ↑ ↓ ← → ← → B A";
        q10.opcaoD = "D) ↑ ↑ ↓ ↓ ← ← → → A B";
        q10.opcaoE = "E) → → ← ← ↑ ↓ ↑ ↓ B A";
        q10.correta = "A";
        questoes.add(q10);

        Questao q11 = new Questao();
        q11.pergunta = "11. Em quantos jogos o personagem \"Steven\", de Time Fcuk, apareceu oficialmente?";
        q11.opcaoA = "A) 2";
        q11.opcaoB = "B) 3";
        q11.opcaoC = "C) 4";
        q11.opcaoD = "D) 5";
        q11.opcaoE = "E) 6";
        q11.correta = "C";
        questoes.add(q11);

        Questao q12 = new Questao();
        q12.pergunta = "12. Em FNAF 2, qual personagem não pode ser simplesmente impedido usando a máscara de Freddy da mesma maneira que vários outros animatrônicos?";
        q12.opcaoA = "A) Toy Bonnie";
        q12.opcaoB = "B) Toy Chica";
        q12.opcaoC = "C) Foxy";
        q12.opcaoD = "D) Toy Freddy";
        q12.opcaoE = "E) Nenhuma das alternativas";
        q12.correta = "A";
        questoes.add(q12);

        Questao q13 = new Questao();
        q13.pergunta = "13. Em Hollow Knight, qual é a principal função do Dream Nail?";
        q13.opcaoA = "A) Teletransportar";
        q13.opcaoB = "B) Acessar e interagir com aspectos ligados aos sonhos";
        q13.opcaoC = "C) Aumentar permanentemente a quantidade de máscaras";
        q13.opcaoD = "D) Aumentar o dano";
        q13.opcaoE = "E) Nenhuma das alternativas";
        q13.correta = "B";
        questoes.add(q13);

        Questao q14 = new Questao();
        q14.pergunta = "14. Por que existem Wario e Waluigi, mas não existe uma \"Wapeach\" (versão maligna da Princesa Peach)?";
        q14.opcaoA = "A) A Nintendo barrou a ideia por medo de processos com a Disney.";
        q14.opcaoB = "B) O design foi rejeitado por ser muito parecido com uma vilã de anime da época.";
        q14.opcaoC = "C) A personagem foi criada, mas removida após reclamações do público.";
        q14.opcaoD = "D) O criador não conseguiu adaptar o visual clássico para uma versão feminina.";
        q14.opcaoE = "E) Nunca houve planos ou rascunhos para criar uma versão maligna da Peach.";
        q14.correta = "B";
        questoes.add(q14);

        Questao q15 = new Questao();
        q15.pergunta = "15. Qual é o principal sonho de Monkey D. Luffy ao longo de One Piece?";
        q15.opcaoA = "A) Tornar-se o Rei dos Piratas";
        q15.opcaoB = "B) Tornar-se um Almirante";
        q15.opcaoC = "C) Encontrar o All Blue";
        q15.opcaoD = "D) Tornar-se o maior espadachim";
        q15.opcaoE = "E) Encontrar o One Piece";
        q15.correta = "A";
        questoes.add(q15);

        String[] dicas = {

                "O personagem em questão mora nas ruínas. 乁⁠|⁠ ･⁠ 〰⁠ ･⁠|⁠ㄏ",

                "A morte da personagem viralizou durante a pandemia como um GIF. (⁠•⁠ ▽⁠ •⁠;⁠)",

                "As alternativas C e D podem ser descartadas. (⁠ ╹⁠▽⁠╹⁠ )",

                "O final é péssimo. (⁠눈⁠‸⁠눈⁠)\n" +
                        "O que você imaginaria de uma história cujo tema é: \"A história de como eu me tornei um herói\"?",

                "Descarte a alternativa D. (⁠ ´⁠◡⁠‿⁠ゝ⁠◡⁠`⁠)",

                "Descarte a alternativa A. (⁠人⁠ •͈⁠ᴗ⁠•͈⁠)",

                "Se vira, ksksksks. (⁠.⁠ ❛⁠ ᴗ⁠ ❛⁠.⁠)\n" +
                        "Tô brincando! Descarte a alternativa A.",

                "Certamente não foi amarelo. /⁠ᐠ⁠｡⁠ꞈ⁠｡⁠ᐟ⁠\\",

                "Veio de um jogo daquela época.",

                "Padrões bem repetidos.\n" +
                        "As alternativas A e B estão mais próximas da resposta correta.",

                "Foram poucas vezes, mas não tão poucas assim.",

                "Tem um meme muito bom sobre isso.\n" +
                        "Mas descarte as alternativas B e D.",

                "Saber um pouquinho de inglês ajuda bastante.",

                "Descarte as alternativas C e D.",

                "Nunca ouviu falar do pirata que estica? Que caverna você esteve? ( ಠ⁠ಗ⁠ಠ )\n" +
                        "Enfim, descarte as alternativas D e E."
        };

        int acertos = 0;

        System.out.println("========== INÍCIO DO QUIZ ==========");
        System.out.println();

        for (int i = 0; i < questoes.size(); i++) {

            Questao questao = questoes.get(i);

            System.out.println("----------------------------------------------");
            System.out.println("Questão " + (i + 1));
            System.out.println("----------------------------------------------");

            questao.escrevaQuestao();

            String resposta;

            while (true) {

                System.out.print("Digite sua resposta: ");
                resposta = scanner.next();

                if (resposta.equals("1")) {

                    System.out.println();
                    System.out.println("========== DICA ==========");
                    System.out.println(dicas[i]);
                    System.out.println("==========================");
                    System.out.println();

                } else if (resposta.equals("2")) {

                    System.out.println();
                    System.out.println("==============================================");
                    System.out.println("             O QUE É CULTURA GEEK?");
                    System.out.println("==============================================");

                    System.out.println();
                    System.out.println("Cultura Geek é um termo usado para falar de um");
                    System.out.println("conjunto de interesses, hobbies e comunidades");
                    System.out.println("ligados principalmente a entretenimento,");
                    System.out.println("tecnologia e mundos fictícios.");

                    System.out.println();
                    System.out.println("Por exemplo, quando uma pessoa gosta muito de:");

                    System.out.println();
                    System.out.println("🎮 Jogos — FNAF, Minecraft, Pokémon, Mario, etc.");
                    System.out.println("🍥 Animes e mangás — One Piece, Naruto, Dragon Ball, Another, etc.");
                    System.out.println("🎬 Filmes e séries — Marvel, Star Wars, Harry Potter, etc.");
                    System.out.println("🦸 Super-heróis e quadrinhos — DC, Marvel, etc.");
                    System.out.println("🎨 Desenhos e animações — Hora de Aventura, Steven Universo, etc.");
                    System.out.println("🎵 Músicas relacionadas a esses universos");
                    System.out.println("💻 Tecnologia e computadores");
                    System.out.println("👾 Ficção científica e fantasia");
                    System.out.println("😂 Memes e referências desses universos");

                    System.out.println();
                    System.out.println("Tudo isso pode fazer parte da Cultura Geek.");

                    System.out.println();
                    System.out.println("Mas por que chama \"Geek\"?");

                    System.out.println();
                    System.out.println("A palavra \"geek\" passou a ser usada para descrever");
                    System.out.println("pessoas muito interessadas ou conhecedoras de");
                    System.out.println("determinados assuntos.");

                    System.out.println();
                    System.out.println("Com o tempo, o termo ficou muito associado a");
                    System.out.println("comunidades que gostam bastante de jogos,");
                    System.out.println("tecnologia, quadrinhos, animes, filmes, séries");
                    System.out.println("e outros conteúdos da cultura pop.");

                    System.out.println();
                    System.out.println("E uma coisa importante: não existe uma lista");
                    System.out.println("fechada do que é ou não é geek.");

                    System.out.println();
                    System.out.println("O termo é bastante amplo e pode mudar conforme");
                    System.out.println("a comunidade e o contexto.");

                    System.out.println();
                    System.out.println("Também há alguns eventos sobre cultura geek");
                    System.out.println("aqui no Brasil.");

                    System.out.println();
                    System.out.println("Um exemplo seria a Comic Con Experience (CCXP)");
                    System.out.println("e a Brasil Game Show (BGS), que acontecem");
                    System.out.println("em São Paulo.");

                    System.out.println();
                    System.out.println("==============================================");
                    System.out.println();

                } else if (resposta.equalsIgnoreCase("A") ||
                        resposta.equalsIgnoreCase("B") ||
                        resposta.equalsIgnoreCase("C") ||
                        resposta.equalsIgnoreCase("D") ||
                        resposta.equalsIgnoreCase("E")) {

                    break;

                } else {

                    System.out.println();
                    System.out.println("Opção inválida! Digite A, B, C, D ou E.");
                    System.out.println();
                }
            }

            if (resposta.equalsIgnoreCase(questao.correta)) {
                acertos++;
            }

            System.out.println();
        }

        double porcentagem = (acertos * 100.0) / questoes.size();

        System.out.println("==============================================");
        System.out.println("              RESULTADO FINAL");
        System.out.println("==============================================");

        System.out.println("Total de questões: " + questoes.size());
        System.out.println("Quantidade de acertos: " + acertos);
        System.out.printf("Porcentagem de acertos: %.2f%%%n", porcentagem);

        System.out.println();

        if (porcentagem == 100.0) {

            System.out.println("PARABÉNS! Você foi excelente!");

        } else if (porcentagem >= 70.0) {

            System.out.println("Muito bem! Você mandou muito bem!");

        } else if (porcentagem >= 50.0) {

            System.out.println("Quase lá! Você está no caminho certo!");

        } else if (porcentagem >= 30.0) {

            System.out.println("Foi uma tentativa! Continue estudando e tente novamente.");

        } else {

            System.out.println("Não foi dessa vez! Mas você sempre pode tentar de novo.");
        }

        if (porcentagem >= 90.0) {

            System.out.println();
            System.out.println("🎉 COMO AGRADECIMENTO 🎉");
            System.out.println();

            System.out.println("Você foi muito bem no nosso quiz e alcançou");
            System.out.println("uma pontuação de 90% a 100%!");
            System.out.println();

            System.out.println("Por isso, preparamos uma pequena surpresa para você. ✨");
            System.out.println();

            System.out.println("Pense muito bem antes de escolher... (⁠╹⁠▽⁠╹⁠)");
            System.out.println();

            System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
            System.out.println();
            System.out.println("⭐ STAGE BONUS — Você entendeu o final de Evangelion? ⭐");
            System.out.println();

            System.out.println("A) Sim");
            System.out.println("B) Não");

            System.out.println();
            System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
            System.out.println();

            String bonus;

            do {

                System.out.print("Escolha A ou B: ");
                bonus = scanner.next();

                if (!bonus.equalsIgnoreCase("A") &&
                        !bonus.equalsIgnoreCase("B")) {

                    System.out.println();
                    System.out.println("Opção inválida! Digite A ou B.");
                    System.out.println();
                }

            } while (!bonus.equalsIgnoreCase("A") &&
                    !bonus.equalsIgnoreCase("B"));

            System.out.println();

            if (bonus.equalsIgnoreCase("A")) {

                System.out.println("Nem eu entendi.");
                System.out.println("✧◝(⁰▿⁰)◜✧");

            } else {

                System.out.println("MENTIROSO!");
                System.out.println("Ninguém entendeu aquela bomba. (⁠눈⁠‸⁠눈⁠)");
                System.out.println();

                System.out.println("Como punição pelos seus atos de desonestidade,");
                System.out.println("você perderá 999 pontos.");
                System.out.println();

                System.out.println("-999 PONTOS! 💀");
            }
        }

        System.out.println();
        System.out.println("==============================================");
        System.out.println("Obrigado por participar do Quiz!");
        System.out.println("==============================================");

        scanner.close();
    }
}