let acertos = 0;
//let respostas = prompt("QUAL A CAPITAL DO BRASIL?" + "\n 1. Brasília " + "\n 2. Rio de Janeiro" + "\n 3. Porto Velho");
let perguntas = [
    {
        questao: "QUAL É A CAPITAL DO BRASIL?",
        opcao: ["Brasília", "São Paulo", "Salvador"],
        correta: 1,
    },
    {
        questao: "QUAL A CAPITAL DO PARANÁ?",
        opcao: ["Londrina", "Curitiba", "Maringa"],
        correta: 2,
    },
    {
        questao: "QUAL A CAPITAL DE GOIÁS?",
        opcao: ["Brasília", "Palmas", "Goiânia"],
        correta: 3,
    },
    {
        questao: "QUAL É A CAPITAL DO RIO GRANDE DO SUL?",
        opcao: ["Rio Grande", "Porto Velho", "Porto Alegre"],
        correta: 3,
    },
    {
        questao: "QUAL É A CAPITAL DE SÃO PAULO?",
        opcao: ["Bauru", "Cambé", "São Paulo"],
        correta: 3,
    },
    {
        questao: "QUAL É A CAPITAL DO RIO DE JANEIRO?",
        opcao: ["Fluminense", "Vasco", "Rio de Janeiro"],
        correta: 3,
    },
    {
        questao: "QUAL É A CAPITAL DA RUSSIA?",
        opcao: ["Vladivostok", "Moscou", "Sibéria"],
        correta: 2,
    },
    {
        questao: "QUAL É A FÓRMULA QUÍMICA DA ÁGUA?",
        opcao: ["H2O", "CO2", "O2"],
        correta: 1,
    },
    {
        questao: "QUAL É O AUTOR DE MACBETH?",
        opcao: ["Nelson Gonçalves", "Segundo de Chomon", "William Shakespeare"],
        correta: 3,
    },
    {
        questao: "QUAL É O CINEASTA PORTUGUES FEZ O FILME 'FALE COM ELA'?",
        opcao: ["Rodrigo Leão", "Pedro Almodovár", "Jefferson De"],
        correta: 2,
    },
    {
        questao: "QUAL É O CINEASTA BRASILEIRO QUE FEZ O FILME 'DRAGÃO DA MALDADE CONTRA O SANTO GUERREIRO'?",
        opcao: ["Glauber Rocha", "Rui Guerra", "Hector Babenco"],
        correta: 1,
    },
    {
        questao: "QUAL É O(A) CINEASTA FRANCÊS QUE FEZ O FILME 'JULIETA DOS ESPIRITOS'?",
        opcao: ["Agnes Varda", "Felini", "Godard"],
        correta: 2,
    },
    {
        questao: "QUAL É O CINESTA CHINÊS QUE FEZ O FILME '2046'?",
        opcao: ["Wong Kar Wai", "Hong Sang Soo", "Ishikawa Goemon"],
        correta: 1,
    },
    {
        questao: "QUAL É O CINEASTA AMERICANO QUE FEZ O FILME 'ASTEROID CITY'?",
        opcao: ["Christofer Nolan", "Spike Lee", "Wes Anderson"],
        correta: 3,
    },
    {
        questao: "QUAL CANTOR BRASILEIRO FEZ A MÚSICA 'EU TE AMO'?",
        opcao: ["Gal Costa", "Dorival Caymmi", "Chico Buarque"],
        correta: 3,
    }
]
for (let i=0; i<5; i++){
    let questaoIgual = 0
    let qualQuestao = 0
    qualQuestao = Math.floor(Math.random(1)*15);
    console.log(qualQuestao, questaoIgual)
    while (qualQuestao == questaoIgual){
    qualQuestao = Math.floor(Math.random(1)*15);
    console.log(qualQuestao, questaoIgual)
   }
    let resposta = prompt(perguntas[qualQuestao].questao + "\n" + "1." + perguntas[qualQuestao].opcao[0] + "\n2." + perguntas[qualQuestao].opcao[1] + "\n3." + perguntas[qualQuestao].opcao[2]);
    if (parseInt(resposta) == perguntas[qualQuestao].correta){
        acertos ++;
    };   
    questaoIgual = qualQuestao;
}
let telaCor = document.querySelector('body')
let textAcerto = document.querySelector('.container')
if (acertos >= 0 && acertos <= 2){
telaCor.style.backgroundColor = 'red'
textAcerto.innerHTML = `PERDOU ${acertos}`
}
else if (acertos >= 3 && acertos <= 4){
    telaCor.style.backgroundColor = 'green'
    textAcerto.innerHTML = `ACERTOU QUASE TODAS ${acertos}`
}
else {
    telaCor.style.backgroundColor = 'blue'
    textAcerto.innerHTML = `ACERTOU TODAS ${acertos}`
}