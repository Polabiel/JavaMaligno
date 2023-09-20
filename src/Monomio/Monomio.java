package src.Monomio;

public class Monomio {

  private double coeficiente;
  private double expoente;

  public /* Void */ Monomio(double coeficiente, double expoente) {
    this.coeficiente = coeficiente;
    this.expoente = expoente;
  }

  public double getCoeficiente() {
    return this.coeficiente;
  }

  public double getExpoente() {
    return this.expoente;
  }

  public Monomio mais(Monomio m) throws Exception {
    if (m == null) throw new Exception("Monomio Ausente!");
    if (m.expoente != this.expoente) throw new Exception(
      "Expoentes diferentes!"
    );

    return new Monomio(this.coeficiente + m.coeficiente, this.expoente);
  }

  public Monomio menos(Monomio m) throws Exception {
    if (m == null) throw new Exception("Monomio Ausente!");
    if (m.expoente != this.expoente) throw new Exception(
      "Expoentes diferentes!"
    );

    return new Monomio(this.coeficiente - m.coeficiente, this.expoente);
  }

  public Monomio vezes(Monomio m) throws Exception {
    if (m == null) throw new Exception("Monomio Ausente!");

    return new Monomio(
      this.coeficiente * m.coeficiente,
      m.expoente + this.expoente
    );
  }

  public Monomio divididoPor(Monomio m) throws Exception {
    if (m == null) throw new Exception("Monomio Ausente!");
    if (m.coeficiente == 0) throw new Exception("Coeficiente é zero!");

    return new Monomio(
      this.coeficiente / m.coeficiente,
      m.expoente - this.expoente
    );
  }

  public double aplicadoA(double x) {
    return Math.pow(x, this.expoente) * this.coeficiente;
  }

  @Override
  public String toString() {
    if (this.coeficiente == 0) return "0";
    if (this.expoente == 0) return "" + this.coeficiente;
    if (this.coeficiente == 1 && this.expoente == 1) return "x";
    if (this.coeficiente != 0 && this.expoente == 1) return (
      this.coeficiente + "x"
    );
    return this.coeficiente + "x" + this.expoente;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) return false;
    if (this == obj) return true;
    if (obj.getClass() != this.getClass()) return false;

    Monomio module = (Monomio) obj;

    return (
      this.coeficiente == module.coeficiente && this.expoente == module.expoente
    );
  }

  @Override
  public int hashCode() {
    int ret = 666;

    ret = 7 * ret + Double.valueOf(this.coeficiente).hashCode();
    ret = 7 * ret + Double.valueOf(this.expoente).hashCode();

    if (ret < 0) ret = -ret;

    return ret;
  }
}
