
class Data {
  // constante de classe
  private static final int[] DIAS = { 0, 
  // JA  FE  MA  AB  MA  JN  JL  AG  ST  OU  NO  DZ
     31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
  }; // mapa

  // atributos
  private int dia, mes, ano;

  // construtor
  Data(int dia, int mes, int ano) {
    // guard-clause (salvaguarda)
    if (ano < 2000 || ano > 2030) {
      // exceção
      throw new IllegalArgumentException("Ano inválido, deve estar entre 2000 e 2030");
    }

    if (mes < 1 || mes > 12) {
      throw new IllegalArgumentException("Mês inválido, deve estar entre 1 e 12");
    }

    if (dia < 1 || dia > DIAS[mes]) {
      throw new IllegalArgumentException("Dia inválido, deve estar entre 1 e " + DIAS[mes]);
    }

    this.dia = dia;
    this.mes = mes;
    this.ano = ano;
  }

  Data(String str) { // 15/03/2024
    this( // construtor de cima 
      Integer.parseInt(str.split("/")[0]),
      Integer.parseInt(str.split("/")[1]),
      Integer.parseInt(str.split("/")[2])
    );
  }

  // POLIMORFISMO, POLI MORFO ("MUITAS FORMAS")
  // polimorfismo adhoc, por sobrecarga (overload)
  // constructor overload: sobrecarga de construtor
  // mais de um construtor
  Data() { // new Data()
    this(15, 4, 2000);
  }

  int getDia() {
    return this.dia; // "this" é opcional
  }

  int getMes() {
    return this.mes;
  }

  int getAno() {
    return this.ano;
  }

  @Override // representar o dado como string
  public String toString() { // 4/5/2025
    return dia + "/" + mes + "/" + ano;
  }

}
