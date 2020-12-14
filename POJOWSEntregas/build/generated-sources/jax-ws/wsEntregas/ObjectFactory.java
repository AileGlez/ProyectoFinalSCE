
package wsEntregas;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the wsEntregas package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CountResponse_QNAME = new QName("http://wsenvios/", "countResponse");
    private final static QName _FindResponse_QNAME = new QName("http://wsenvios/", "findResponse");
    private final static QName _CreateResponse_QNAME = new QName("http://wsenvios/", "createResponse");
    private final static QName _Count_QNAME = new QName("http://wsenvios/", "count");
    private final static QName _Remove_QNAME = new QName("http://wsenvios/", "remove");
    private final static QName _FindAll_QNAME = new QName("http://wsenvios/", "findAll");
    private final static QName _Mediopago_QNAME = new QName("http://wsenvios/", "mediopago");
    private final static QName _FindRange_QNAME = new QName("http://wsenvios/", "findRange");
    private final static QName _Edit_QNAME = new QName("http://wsenvios/", "edit");
    private final static QName _ParseException_QNAME = new QName("http://wsenvios/", "ParseException");
    private final static QName _Articulo_QNAME = new QName("http://wsenvios/", "articulo");
    private final static QName _FindAllResponse_QNAME = new QName("http://wsenvios/", "findAllResponse");
    private final static QName _Create_QNAME = new QName("http://wsenvios/", "create");
    private final static QName _FindByFechaEntregaResponse_QNAME = new QName("http://wsenvios/", "findByFechaEntregaResponse");
    private final static QName _Empresa_QNAME = new QName("http://wsenvios/", "empresa");
    private final static QName _Factura_QNAME = new QName("http://wsenvios/", "factura");
    private final static QName _FindByFechaEntrega_QNAME = new QName("http://wsenvios/", "findByFechaEntrega");
    private final static QName _FindRangeResponse_QNAME = new QName("http://wsenvios/", "findRangeResponse");
    private final static QName _Cliente_QNAME = new QName("http://wsenvios/", "cliente");
    private final static QName _Envio_QNAME = new QName("http://wsenvios/", "envio");
    private final static QName _Find_QNAME = new QName("http://wsenvios/", "find");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wsEntregas
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Edit }
     * 
     */
    public Edit createEdit() {
        return new Edit();
    }

    /**
     * Create an instance of {@link FindRange }
     * 
     */
    public FindRange createFindRange() {
        return new FindRange();
    }

    /**
     * Create an instance of {@link Count }
     * 
     */
    public Count createCount() {
        return new Count();
    }

    /**
     * Create an instance of {@link CreateResponse }
     * 
     */
    public CreateResponse createCreateResponse() {
        return new CreateResponse();
    }

    /**
     * Create an instance of {@link CountResponse }
     * 
     */
    public CountResponse createCountResponse() {
        return new CountResponse();
    }

    /**
     * Create an instance of {@link FindResponse }
     * 
     */
    public FindResponse createFindResponse() {
        return new FindResponse();
    }

    /**
     * Create an instance of {@link FindAll }
     * 
     */
    public FindAll createFindAll() {
        return new FindAll();
    }

    /**
     * Create an instance of {@link Mediopago }
     * 
     */
    public Mediopago createMediopago() {
        return new Mediopago();
    }

    /**
     * Create an instance of {@link Remove }
     * 
     */
    public Remove createRemove() {
        return new Remove();
    }

    /**
     * Create an instance of {@link Envio }
     * 
     */
    public Envio createEnvio() {
        return new Envio();
    }

    /**
     * Create an instance of {@link Cliente }
     * 
     */
    public Cliente createCliente() {
        return new Cliente();
    }

    /**
     * Create an instance of {@link FindByFechaEntrega }
     * 
     */
    public FindByFechaEntrega createFindByFechaEntrega() {
        return new FindByFechaEntrega();
    }

    /**
     * Create an instance of {@link FindRangeResponse }
     * 
     */
    public FindRangeResponse createFindRangeResponse() {
        return new FindRangeResponse();
    }

    /**
     * Create an instance of {@link Factura }
     * 
     */
    public Factura createFactura() {
        return new Factura();
    }

    /**
     * Create an instance of {@link Find }
     * 
     */
    public Find createFind() {
        return new Find();
    }

    /**
     * Create an instance of {@link FindByFechaEntregaResponse }
     * 
     */
    public FindByFechaEntregaResponse createFindByFechaEntregaResponse() {
        return new FindByFechaEntregaResponse();
    }

    /**
     * Create an instance of {@link Create }
     * 
     */
    public Create createCreate() {
        return new Create();
    }

    /**
     * Create an instance of {@link ParseException }
     * 
     */
    public ParseException createParseException() {
        return new ParseException();
    }

    /**
     * Create an instance of {@link Articulo }
     * 
     */
    public Articulo createArticulo() {
        return new Articulo();
    }

    /**
     * Create an instance of {@link FindAllResponse }
     * 
     */
    public FindAllResponse createFindAllResponse() {
        return new FindAllResponse();
    }

    /**
     * Create an instance of {@link Empresa }
     * 
     */
    public Empresa createEmpresa() {
        return new Empresa();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsenvios/", name = "countResponse")
    public JAXBElement<CountResponse> createCountResponse(CountResponse value) {
        return new JAXBElement<CountResponse>(_CountResponse_QNAME, CountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsenvios/", name = "findResponse")
    public JAXBElement<FindResponse> createFindResponse(FindResponse value) {
        return new JAXBElement<FindResponse>(_FindResponse_QNAME, FindResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsenvios/", name = "createResponse")
    public JAXBElement<CreateResponse> createCreateResponse(CreateResponse value) {
        return new JAXBElement<CreateResponse>(_CreateResponse_QNAME, CreateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Count }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsenvios/", name = "count")
    public JAXBElement<Count> createCount(Count value) {
        return new JAXBElement<Count>(_Count_QNAME, Count.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Remove }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsenvios/", name = "remove")
    public JAXBElement<Remove> createRemove(Remove value) {
        return new JAXBElement<Remove>(_Remove_QNAME, Remove.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAll }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsenvios/", name = "findAll")
    public JAXBElement<FindAll> createFindAll(FindAll value) {
        return new JAXBElement<FindAll>(_FindAll_QNAME, FindAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Mediopago }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsenvios/", name = "mediopago")
    public JAXBElement<Mediopago> createMediopago(Mediopago value) {
        return new JAXBElement<Mediopago>(_Mediopago_QNAME, Mediopago.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindRange }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsenvios/", name = "findRange")
    public JAXBElement<FindRange> createFindRange(FindRange value) {
        return new JAXBElement<FindRange>(_FindRange_QNAME, FindRange.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Edit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsenvios/", name = "edit")
    public JAXBElement<Edit> createEdit(Edit value) {
        return new JAXBElement<Edit>(_Edit_QNAME, Edit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParseException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsenvios/", name = "ParseException")
    public JAXBElement<ParseException> createParseException(ParseException value) {
        return new JAXBElement<ParseException>(_ParseException_QNAME, ParseException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Articulo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsenvios/", name = "articulo")
    public JAXBElement<Articulo> createArticulo(Articulo value) {
        return new JAXBElement<Articulo>(_Articulo_QNAME, Articulo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsenvios/", name = "findAllResponse")
    public JAXBElement<FindAllResponse> createFindAllResponse(FindAllResponse value) {
        return new JAXBElement<FindAllResponse>(_FindAllResponse_QNAME, FindAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Create }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsenvios/", name = "create")
    public JAXBElement<Create> createCreate(Create value) {
        return new JAXBElement<Create>(_Create_QNAME, Create.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByFechaEntregaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsenvios/", name = "findByFechaEntregaResponse")
    public JAXBElement<FindByFechaEntregaResponse> createFindByFechaEntregaResponse(FindByFechaEntregaResponse value) {
        return new JAXBElement<FindByFechaEntregaResponse>(_FindByFechaEntregaResponse_QNAME, FindByFechaEntregaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Empresa }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsenvios/", name = "empresa")
    public JAXBElement<Empresa> createEmpresa(Empresa value) {
        return new JAXBElement<Empresa>(_Empresa_QNAME, Empresa.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Factura }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsenvios/", name = "factura")
    public JAXBElement<Factura> createFactura(Factura value) {
        return new JAXBElement<Factura>(_Factura_QNAME, Factura.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByFechaEntrega }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsenvios/", name = "findByFechaEntrega")
    public JAXBElement<FindByFechaEntrega> createFindByFechaEntrega(FindByFechaEntrega value) {
        return new JAXBElement<FindByFechaEntrega>(_FindByFechaEntrega_QNAME, FindByFechaEntrega.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindRangeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsenvios/", name = "findRangeResponse")
    public JAXBElement<FindRangeResponse> createFindRangeResponse(FindRangeResponse value) {
        return new JAXBElement<FindRangeResponse>(_FindRangeResponse_QNAME, FindRangeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsenvios/", name = "cliente")
    public JAXBElement<Cliente> createCliente(Cliente value) {
        return new JAXBElement<Cliente>(_Cliente_QNAME, Cliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Envio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsenvios/", name = "envio")
    public JAXBElement<Envio> createEnvio(Envio value) {
        return new JAXBElement<Envio>(_Envio_QNAME, Envio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Find }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsenvios/", name = "find")
    public JAXBElement<Find> createFind(Find value) {
        return new JAXBElement<Find>(_Find_QNAME, Find.class, null, value);
    }

}
