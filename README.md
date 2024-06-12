# Projeto-Clinica-Java
<p>Nathan - Conectado <p>

<p>Paulo - Conectado<p>

<p>Gabriel - <p>


Possíveis Classes

<b>Pessoa - Classe Abstrata<b>
- nome: String
- cpf: String
- dataNascimento: String


<b>Paciente<b>
- nomePlano : String    
- numeroCartaoPlano: String     
           
<b>Funcionário<b>
-salario : double

<b>Medico<b>                  
 - crm: String
- especialidade: String

<b>Trabalhador<b>
- matricula: String
- cargo: String

<b>Consulta<b>
- dataConsulta: String
- medico: Medico
- paciente: Paciente

<b>Endereço<b>
String rua;
String numero;
String cidade;
String estado;
String cep;

<b>Pagamento (interface)<b>
realizarPagamento():
emitirRecibo(): 

<b>PagamentoCartao<b>        
- numeroCartao: String 
- nomeTitular: String
- dataValidade: String

<b>PagamentoDinheiro<b>
- quantiaRecebida: double