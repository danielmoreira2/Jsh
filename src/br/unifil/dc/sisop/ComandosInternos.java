package br.unifil.dc.sisop;

import java.util.Optional;

/**
 * Write a description of class ComandosInternos here.
 *
 * @author Ricardo Inacio Alvares e Silva
 * @version 180823
 */
public final class ComandosInternos {
    
    public static int exibirRelogio() {
        Calendar data = Calendar.getInstance();
          int hora = data.get(Calendar.HOUR_OF_DAY); 
          int min = data.get(Calendar.MINUTE);

        throw new RuntimeException("Relogio exibido:" + Calendar);
    }
    
    public static int escreverListaArquivos(Optional<String> nomeDir) {
        system.out.println(nomeDir);
        throw new RuntimeException("La Listado");
    }
    
    public static int criarNovoDiretorio(String nomeDir) {
        ComandoPronpt lerComando = get.Argumentos;
        new File(get.Argumentos).mkdir();
        throw new RuntimeException("Novo diretorio criado");
    }
    
    public static int apagarDiretorio(String nomeDir) {
        if(get.Argumentos.isDirectory())
        { File[] arquivos = get.Argumentos.listFiles(); for(int i=0;i<arquivos.length;i++)
       } 
       { excluir(arquivos[0]);   get.Argumentos.delete();
     }  
        throw new RuntimeException("Diretorio excluido");
    }
    
    public static int mudarDiretorioTrabalho(String nomeDir){
        //esse não sei como faz,pelo que eu pesquisei fica assim
        File a = new File("teste");
        a.createNewFile();
        System.out.println(a.getAbsolutePath());
        throw new RuntimeException("Diretorio Trocado");
    }
    
    /**
     * Essa classe não deve ser instanciada.
     */
    private ComandosInternos() {}
}
