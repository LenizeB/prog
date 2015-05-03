import javax.swing.JOptionPane;

public class TesteAtor {
    
    public static void main(String[] args) {
        Ator Ator = new Ator();
        
        String informacoes;
        Integer datan;
        Integer quantidaden;
        String email;
        String nomeart;
        Double salariomen;
        Double cache;
        String cidade;
        String endereco;
        String bairro;
        String estado;
        Integer quantidadeevent;
        
        String Nome = JOptionPane.showInputDialog("digite o nome artistico do ator");
        Ator.setNomeart(Nome);
        
        datan = Integer.parseInt(JOptionPane.showInputDialog("digite a data de nascimento do ator"));
        Ator.setDatan(datan);
        
        email = JOptionPane.showInputDialog("digite o email");
        Ator.setEmail(email);
        
        quantidaden = Integer.parseInt(JOptionPane.showInputDialog("digite a quantidade de novelas feita por ele"));
        Ator.setQuantidaden(quantidaden);
        
        salariomen = Double.parseDouble(JOptionPane.showInputDialog("digite o salario do ator"));
        Ator.setSalariomen(salariomen);
        
        quantidadeevent = Integer.parseInt(JOptionPane.showInputDialog("informe a quantidade de eventos feitas pelo ator"));
        Ator.setQuantidadeevent(quantidadeevent);
        
        cache = Double.parseDouble(JOptionPane.showInputDialog("informe o cache do ator"));
        Ator.setCache(cache);
        
        JOptionPane.showMessageDialog(null, "o nome do artista é; " + Nome + "\na data de nascimento dele é; " + datan + "\no email é; " + email + "\na quantidade de novelas feita por ele é; " + quantidaden + "\no salario mensal dele é; " + salariomen + "\no seu status é; " + Ator.status() + "\nseu ganho mensal é; " + Ator.ganhos(quantidadeevent));
        
    }
    
}
