# Projeto-Clinica-Java
<p>Nathan - Conectado <p>

<p>Paulo - Conectado<p>

<p>Gabriel - Conectado<p>


<t1>Classes<t1>

<b>main<b>

<b>1 - Pessoa - Classe Abstrata - GABRIEL<b>
- nome: String
- cpf: String
- dataNascimento: String

+gets e sets


<b>2 - Paciente - PAULO<b>
- nomePlano : String    
- numeroCartaoPlano: String   

+gets e sets
           
<b>3 - Funcionário - NATHAN <b>
-salario : double

+gets e sets

<b>4 - Medico - GABRIEL <b>                  
- crm: String
- especialidade: especialidades

+gets e sets

<b>5 - Recepcionista - PAULO<b>
- matricula: String
- cargo: String

+gets e sets

<b>6 - Consulta - NATHAN<b>
- valor : double
- dataConsulta: String
- medico: Medico
- paciente: Paciente

+gets e sets

<b>7 - Endereço - GABRIEL<b>
- String rua;
- String numero;
- String cidade;
- String estado;
- String cep;

+gets e sets

<b>8 - Pagamento (interface) - PAULO<b>
- realizarPagamento():
- emitirRecibo(): 



<b>9 - PagamentoCartao - NATHAN<b>        
- numeroCartao: String 
- nomeTitular: String
- dataValidade: String

+gets e sets
+implemntar o realizar pagamento
+implemntar o emetirRecibo();

<b>10 - PagamentoDinheiro - GABRIEL<b>
- quantiaRecebida: double

+gets e sets
implemntar o realizar pagamento
+implemntar o emetirRecibo();

<b>11 - Especialidades - PAULO <b>

<b>12 - PagamentoPix - NATHAN<b>
-Chave pix String;
 
+gets e sets
+implemntar o realizar pagamento
+implemntar o emetirRecibo();

<b>13 - Exames - GABRIEL<b>
- String tipoExame;
- dataExame;
- medicoResponsavel;
- Paciente paciente;
- String resultado;

+agendarExame
+emitirResultado


<b>14 - Agendamento - PAULO<b>
- String dataAgendamento;
- String horarioAgendamento;
- Paciente paciente;
- Medico medico;

+gets e sets
+verificarDisponiblidade
+confirmarAgendamento

<b>15 - ReceitaMedica - NATHAN<b>

- private medicamentos;
- dosagem;
- instrucoes;
- dataEmissao;
- medico;
- paciente;

+imprimirReceita
