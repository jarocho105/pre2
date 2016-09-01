/*
*AVISO LEGAL
© Copyright
*Este programa esta protegido por la ley de derechos de autor.
*La reproduccion o distribucion ilicita de este programa o de cualquiera de
*sus partes esta penado por la ley con severas sanciones civiles y penales,
*y seran objeto de todas las sanciones legales que correspondan.

*Su contenido no puede copiarse para fines comerciales o de otras,
*ni puede mostrarse, incluso en una version modificada, en otros sitios Web.
Solo esta permitido colocar hipervinculos al sitio web.
*/
package com.bydan.erp.cartera.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.cartera.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.util.ClienteConstantesFunciones;

import com.bydan.erp.cartera.business.logic.*;
import com.bydan.framework.erp.business.entity.DatoGeneral;
import com.bydan.framework.erp.business.entity.OrderBy;
import com.bydan.framework.erp.business.entity.Mensajes;
import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverter;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverterFromDate;
import com.bydan.framework.erp.presentation.desktop.swing.FuncionesSwing;
import com.bydan.framework.erp.presentation.desktop.swing.JInternalFrameBase;
import com.bydan.framework.erp.presentation.desktop.swing.*;
import com.bydan.framework.erp.util.*;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.*;


import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRRuntimeException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.export.JRHtmlExporter;
import net.sf.jasperreports.j2ee.servlets.BaseHttpServlet;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.data.JRBeanArrayDataSource;


import javax.swing.*;
import java.awt.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.table.TableColumn;

import com.toedter.calendar.JDateChooser;


@SuppressWarnings("unused")
public class ClienteDetalleFormJInternalFrame extends ClienteBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleCliente;
	
	protected JMenuBar jmenuBarDetalleCliente;
	
	protected JMenu jmenuDetalleCliente;
	protected JMenu jmenuDetalleArchivoCliente;
	protected JMenu jmenuDetalleAccionesCliente;
	protected JMenu jmenuDetalleDatosCliente;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCliente;	
	protected GridBagConstraints gridBagConstraintsCliente;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ClienteBeanSwingJInternalFrameAdditional jInternalFrameDetalleCliente;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected TipoIdentificacionBeanSwingJInternalFrame tipoidentificacionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoidentificacion="";

	protected GrupoClienteBeanSwingJInternalFrame grupoclienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_grupocliente="";

	protected TituloClienteBeanSwingJInternalFrame tituloclienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_titulocliente="";

	protected AreaCrBeanSwingJInternalFrame areacrBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_areacr="";

	protected EstadoClienteBeanSwingJInternalFrame estadoclienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadocliente="";

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";

	protected RegionBeanSwingJInternalFrame regionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_region="";

	protected ProvinciaBeanSwingJInternalFrame provinciaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_provincia="";

	protected CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ciudad="";

	protected ZonaBeanSwingJInternalFrame zonaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_zona="";

	protected PaisBeanSwingJInternalFrame paisnacionalidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_paisnacionalidad="";

	protected TipoCargoLaboBeanSwingJInternalFrame tipocargolaboBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocargolabo="";

	protected TipoNivelEduBeanSwingJInternalFrame tiponiveleduBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiponiveledu="";

	protected ProfesionBeanSwingJInternalFrame profesionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_profesion="";

	protected TipoGeneroBeanSwingJInternalFrame tipogeneroBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipogenero="";

	protected EstadoCivilBeanSwingJInternalFrame estadocivilBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadocivil="";

	protected EstadoLegalBeanSwingJInternalFrame estadolegalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadolegal="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";

	protected RutaBeanSwingJInternalFrame rutaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ruta="";

	protected VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_vendedor="";

	protected CentroActividadBeanSwingJInternalFrame centroactividadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centroactividad="";

	protected TipoGarantiaEmpresaBeanSwingJInternalFrame tipogarantiaempresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipogarantiaempresa="";

	protected CateTipoAfiliacionBeanSwingJInternalFrame catetipoafiliacionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_catetipoafiliacion="";

	protected DiaBeanSwingJInternalFrame diaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_dia="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected TipoPrecioBeanSwingJInternalFrame tipoprecioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoprecio="";

	protected TipoListaPrecioBeanSwingJInternalFrame tipolistaprecioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipolistaprecio="";
	
	public ClienteSessionBean clienteSessionBean;
	
	

	public InformacionLaboralBeanSwingJInternalFrame informacionlaboralBeanSwingJInternalFrame=null;
	public InformacionLaboralBeanSwingJInternalFrame informacionlaboralBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteInformacionLaboral=false;
	public InformacionLaboralSessionBean informacionlaboralSessionBean;

	public TransportistaBeanSwingJInternalFrame transportistaBeanSwingJInternalFrame=null;
	public TransportistaBeanSwingJInternalFrame transportistaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteTransportista=false;
	public TransportistaSessionBean transportistaSessionBean;

	public NovedadBeanSwingJInternalFrame novedadBeanSwingJInternalFrame=null;
	public NovedadBeanSwingJInternalFrame novedadBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteNovedad=false;
	public NovedadSessionBean novedadSessionBean;

	public PoliticasClienteBeanSwingJInternalFrame politicasclienteBeanSwingJInternalFrame=null;
	public PoliticasClienteBeanSwingJInternalFrame politicasclienteBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorPartePoliticasCliente=false;
	public PoliticasClienteSessionBean politicasclienteSessionBean;

	public ReferenciaPersonalBeanSwingJInternalFrame referenciapersonalBeanSwingJInternalFrame=null;
	public ReferenciaPersonalBeanSwingJInternalFrame referenciapersonalBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteReferenciaPersonal=false;
	public ReferenciaPersonalSessionBean referenciapersonalSessionBean;

	public BalanceGeneralClienteBeanSwingJInternalFrame balancegeneralclienteBeanSwingJInternalFrame=null;
	public BalanceGeneralClienteBeanSwingJInternalFrame balancegeneralclienteBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteBalanceGeneralCliente=false;
	public BalanceGeneralClienteSessionBean balancegeneralclienteSessionBean;

	public PoliticaClienteBeanSwingJInternalFrame politicaclienteBeanSwingJInternalFrame=null;
	public PoliticaClienteBeanSwingJInternalFrame politicaclienteBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorPartePoliticaCliente=false;
	public PoliticaClienteSessionBean politicaclienteSessionBean;

	public VehiculoClienteBeanSwingJInternalFrame vehiculoclienteBeanSwingJInternalFrame=null;
	public VehiculoClienteBeanSwingJInternalFrame vehiculoclienteBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteVehiculoCliente=false;
	public VehiculoClienteSessionBean vehiculoclienteSessionBean;

	public ResponsableBeanSwingJInternalFrame responsableBeanSwingJInternalFrame=null;
	public ResponsableBeanSwingJInternalFrame responsableBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteResponsable=false;
	public ResponsableSessionBean responsableSessionBean;

	public InformacionFinancieraBeanSwingJInternalFrame informacionfinancieraBeanSwingJInternalFrame=null;
	public InformacionFinancieraBeanSwingJInternalFrame informacionfinancieraBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteInformacionFinanciera=false;
	public InformacionFinancieraSessionBean informacionfinancieraSessionBean;

	public ConsignatarioBeanSwingJInternalFrame consignatarioBeanSwingJInternalFrame=null;
	public ConsignatarioBeanSwingJInternalFrame consignatarioBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteConsignatario=false;
	public ConsignatarioSessionBean consignatarioSessionBean;

	public ClienteImagenBeanSwingJInternalFrame clienteimagenBeanSwingJInternalFrame=null;
	public ClienteImagenBeanSwingJInternalFrame clienteimagenBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteClienteImagen=false;
	public ClienteImagenSessionBean clienteimagenSessionBean;

	public GarantiaClienteBeanSwingJInternalFrame garantiaclienteBeanSwingJInternalFrame=null;
	public GarantiaClienteBeanSwingJInternalFrame garantiaclienteBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteGarantiaCliente=false;
	public GarantiaClienteSessionBean garantiaclienteSessionBean;

	public InformacionEconomicaBeanSwingJInternalFrame informacioneconomicaBeanSwingJInternalFrame=null;
	public InformacionEconomicaBeanSwingJInternalFrame informacioneconomicaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteInformacionEconomica=false;
	public InformacionEconomicaSessionBean informacioneconomicaSessionBean;

	public ReferenciaComercialBeanSwingJInternalFrame referenciacomercialBeanSwingJInternalFrame=null;
	public ReferenciaComercialBeanSwingJInternalFrame referenciacomercialBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteReferenciaComercial=false;
	public ReferenciaComercialSessionBean referenciacomercialSessionBean;

	public BienBeanSwingJInternalFrame bienBeanSwingJInternalFrame=null;
	public BienBeanSwingJInternalFrame bienBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteBien=false;
	public BienSessionBean bienSessionBean;

	public ProveedorProductoBeanSwingJInternalFrame proveedorproductoBeanSwingJInternalFrame=null;
	public ProveedorProductoBeanSwingJInternalFrame proveedorproductoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteProveedorProducto=false;
	public ProveedorProductoSessionBean proveedorproductoSessionBean;

	public ServicioClienteBeanSwingJInternalFrame servicioclienteBeanSwingJInternalFrame=null;
	public ServicioClienteBeanSwingJInternalFrame servicioclienteBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteServicioCliente=false;
	public ServicioClienteSessionBean servicioclienteSessionBean;

	public ContactoClienteBeanSwingJInternalFrame contactoclienteBeanSwingJInternalFrame=null;
	public ContactoClienteBeanSwingJInternalFrame contactoclienteBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteContactoCliente=false;
	public ContactoClienteSessionBean contactoclienteSessionBean;

	public DatoConstitucionBeanSwingJInternalFrame datoconstitucionBeanSwingJInternalFrame=null;
	public DatoConstitucionBeanSwingJInternalFrame datoconstitucionBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDatoConstitucion=false;
	public DatoConstitucionSessionBean datoconstitucionSessionBean;

	public ClienteCoaBeanSwingJInternalFrame clientecoaBeanSwingJInternalFrame=null;
	public ClienteCoaBeanSwingJInternalFrame clientecoaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteClienteCoa=false;
	public ClienteCoaSessionBean clientecoaSessionBean;

	public HobbyClienteBeanSwingJInternalFrame hobbyclienteBeanSwingJInternalFrame=null;
	public HobbyClienteBeanSwingJInternalFrame hobbyclienteBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteHobbyCliente=false;
	public HobbyClienteSessionBean hobbyclienteSessionBean;

	public CargaFamiliarBeanSwingJInternalFrame cargafamiliarBeanSwingJInternalFrame=null;
	public CargaFamiliarBeanSwingJInternalFrame cargafamiliarBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteCargaFamiliar=false;
	public CargaFamiliarSessionBean cargafamiliarSessionBean;

	public EMailBeanSwingJInternalFrame emailBeanSwingJInternalFrame=null;
	public EMailBeanSwingJInternalFrame emailBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteEMail=false;
	public EMailSessionBean emailSessionBean;

	public ConyugeBeanSwingJInternalFrame conyugeBeanSwingJInternalFrame=null;
	public ConyugeBeanSwingJInternalFrame conyugeBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteConyuge=false;
	public ConyugeSessionBean conyugeSessionBean;

	public CuentaPorCobrarBeanSwingJInternalFrame cuentaporcobrarBeanSwingJInternalFrame=null;
	public CuentaPorCobrarBeanSwingJInternalFrame cuentaporcobrarBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteCuentaPorCobrar=false;
	public CuentaPorCobrarSessionBean cuentaporcobrarSessionBean;

	public FirmaClienteBeanSwingJInternalFrame firmaclienteBeanSwingJInternalFrame=null;
	public FirmaClienteBeanSwingJInternalFrame firmaclienteBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteFirmaCliente=false;
	public FirmaClienteSessionBean firmaclienteSessionBean;

	public RepresentanteLegalBeanSwingJInternalFrame representantelegalBeanSwingJInternalFrame=null;
	public RepresentanteLegalBeanSwingJInternalFrame representantelegalBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteRepresentanteLegal=false;
	public RepresentanteLegalSessionBean representantelegalSessionBean;

	public TelefonoBeanSwingJInternalFrame telefonoBeanSwingJInternalFrame=null;
	public TelefonoBeanSwingJInternalFrame telefonoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteTelefono=false;
	public TelefonoSessionBean telefonoSessionBean;

	public NegocioClienteBeanSwingJInternalFrame negocioclienteBeanSwingJInternalFrame=null;
	public NegocioClienteBeanSwingJInternalFrame negocioclienteBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteNegocioCliente=false;
	public NegocioClienteSessionBean negocioclienteSessionBean;

	public ReferenciaBancariaBeanSwingJInternalFrame referenciabancariaBeanSwingJInternalFrame=null;
	public ReferenciaBancariaBeanSwingJInternalFrame referenciabancariaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteReferenciaBancaria=false;
	public ReferenciaBancariaSessionBean referenciabancariaSessionBean;

	public MontoBeanSwingJInternalFrame montoBeanSwingJInternalFrame=null;
	public MontoBeanSwingJInternalFrame montoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteMonto=false;
	public MontoSessionBean montoSessionBean;

	public ClienteArchivoBeanSwingJInternalFrame clientearchivoBeanSwingJInternalFrame=null;
	public ClienteArchivoBeanSwingJInternalFrame clientearchivoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteClienteArchivo=false;
	public ClienteArchivoSessionBean clientearchivoSessionBean;

	public ActividadEconomicaBeanSwingJInternalFrame actividadeconomicaBeanSwingJInternalFrame=null;
	public ActividadEconomicaBeanSwingJInternalFrame actividadeconomicaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteActividadEconomica=false;
	public ActividadEconomicaSessionBean actividadeconomicaSessionBean;

	public DireccionBeanSwingJInternalFrame direccionBeanSwingJInternalFrame=null;
	public DireccionBeanSwingJInternalFrame direccionBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDireccion=false;
	public DireccionSessionBean direccionSessionBean;

	public ChequePostFechadoBeanSwingJInternalFrame chequepostfechadoBeanSwingJInternalFrame=null;
	public ChequePostFechadoBeanSwingJInternalFrame chequepostfechadoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteChequePostFechado=false;
	public ChequePostFechadoSessionBean chequepostfechadoSessionBean;

	public SubClienteBeanSwingJInternalFrame subclienteBeanSwingJInternalFrame=null;
	public SubClienteBeanSwingJInternalFrame subclienteBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteSubCliente=false;
	public SubClienteSessionBean subclienteSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public TipoIdentificacionSessionBean tipoidentificacionSessionBean;
	public GrupoClienteSessionBean grupoclienteSessionBean;
	public TituloClienteSessionBean tituloclienteSessionBean;
	public AreaCrSessionBean areacrSessionBean;
	public EstadoClienteSessionBean estadoclienteSessionBean;
	public PaisSessionBean paisSessionBean;
	public RegionSessionBean regionSessionBean;
	public ProvinciaSessionBean provinciaSessionBean;
	public CiudadSessionBean ciudadSessionBean;
	public ZonaSessionBean zonaSessionBean;
	public PaisSessionBean paisnacionalidadSessionBean;
	public TipoCargoLaboSessionBean tipocargolaboSessionBean;
	public TipoNivelEduSessionBean tiponiveleduSessionBean;
	public ProfesionSessionBean profesionSessionBean;
	public TipoGeneroSessionBean tipogeneroSessionBean;
	public EstadoCivilSessionBean estadocivilSessionBean;
	public EstadoLegalSessionBean estadolegalSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;
	public RutaSessionBean rutaSessionBean;
	public VendedorSessionBean vendedorSessionBean;
	public CentroActividadSessionBean centroactividadSessionBean;
	public TipoGarantiaEmpresaSessionBean tipogarantiaempresaSessionBean;
	public CateTipoAfiliacionSessionBean catetipoafiliacionSessionBean;
	public DiaSessionBean diaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public TipoPrecioSessionBean tipoprecioSessionBean;
	public TipoListaPrecioSessionBean tipolistaprecioSessionBean;	
	
	public ClienteLogic clienteLogic;
	
	public JScrollPane jScrollPanelDatosCliente;
	public JScrollPane jScrollPanelDatosEdicionCliente;
	public JScrollPane jScrollPanelDatosGeneralCliente;
	
	protected JPanel jPanelCamposCliente;    
	protected JPanel jPanelCamposOcultosCliente;    	
	protected JPanel jPanelAccionesCliente;
	protected JPanel jPanelAccionesFormularioCliente;
    
	
	
	protected JTabbedPane jTabbedPaneCamposCliente;	
	protected Integer iXPanelCamposCliente=0;
	protected Integer iYPanelCamposCliente=0;
	
	protected Integer iXPanelCamposOcultosCliente=0;
	protected Integer iYPanelCamposOcultosCliente=0;
	
	

	protected JPanel jPanelCamposIniciogeneralCliente;
	protected Integer iXPanelCamposIniciogeneralCliente=0;
	protected Integer iYPanelCamposIniciogeneralCliente=0;

	protected JPanel jPanelCamposInicioubicacionCliente;
	protected Integer iXPanelCamposInicioubicacionCliente=0;
	protected Integer iYPanelCamposInicioubicacionCliente=0;

	protected JPanel jPanelCamposIniciopersonalCliente;
	protected Integer iXPanelCamposIniciopersonalCliente=0;
	protected Integer iYPanelCamposIniciopersonalCliente=0;

	protected JPanel jPanelCamposIniciocontableCliente;
	protected Integer iXPanelCamposIniciocontableCliente=0;
	protected Integer iYPanelCamposIniciocontableCliente=0;

	protected JPanel jPanelCamposIniciofacturaCliente;
	protected Integer iXPanelCamposIniciofacturaCliente=0;
	protected Integer iYPanelCamposIniciofacturaCliente=0;;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoCliente;
	public JButton jButtonModificarCliente;
	public JButton jButtonActualizarCliente;
    public JButton jButtonEliminarCliente;
	public JButton jButtonCancelarCliente;
    public JButton jButtonGuardarCambiosCliente;
	public JButton jButtonGuardarCambiosTablaCliente;
	protected JButton jButtonCerrarCliente;
	
	
	protected JButton jButtonProcesarInformacionCliente;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoCliente;
	protected JCheckBox jCheckBoxPostAccionSinCerrarCliente;
	protected JCheckBox jCheckBoxPostAccionSinMensajeCliente;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCliente;
	protected JButton jButtonModificarToolBarCliente;
	protected JButton jButtonActualizarToolBarCliente;
    protected JButton jButtonEliminarToolBarCliente;
	protected JButton jButtonCancelarToolBarCliente;
    protected JButton jButtonGuardarCambiosToolBarCliente;
	protected JButton jButtonGuardarCambiosTablaToolBarCliente;
	protected JButton jButtonMostrarOcultarTablaToolBarCliente;
	protected JButton jButtonCerrarToolBarCliente;
	
	protected JButton jButtonProcesarInformacionToolBarCliente;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCliente;
	protected JMenuItem jMenuItemModificarCliente;
	protected JMenuItem jMenuItemActualizarCliente;
    protected JMenuItem jMenuItemEliminarCliente;
	protected JMenuItem jMenuItemCancelarCliente;
    protected JMenuItem jMenuItemGuardarCambiosCliente;
	protected JMenuItem jMenuItemGuardarCambiosTablaCliente;
	protected JMenuItem jMenuItemCerrarCliente;
	protected JMenuItem jMenuItemDetalleCerrarCliente;
	protected JMenuItem jMenuItemDetalleMostarOcultarCliente;
	
	protected JMenuItem jMenuItemProcesarInformacionCliente;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCliente;
	protected JMenuItem jMenuItemMostrarOcultarCliente;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCliente;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCliente;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioCliente;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidCliente;
	public JLabel jLabelIdCliente;
	public JLabel jLabelidCliente;
	public JButton jButtonidClienteBusqueda= new JButtonMe();

	public JPanel jPanelcodigoCliente;
	public JLabel jLabelcodigoCliente;
	public JTextField jTextFieldcodigoCliente;
	public JButton jButtoncodigoClienteBusqueda= new JButtonMe();

	public JPanel jPanelidentificacionCliente;
	public JLabel jLabelidentificacionCliente;
	public JTextField jTextFieldidentificacionCliente;
	public JButton jButtonidentificacionClienteBusqueda= new JButtonMe();

	public JPanel jPanelrucCliente;
	public JLabel jLabelrucCliente;
	public JTextField jTextFieldrucCliente;
	public JButton jButtonrucClienteBusqueda= new JButtonMe();

	public JPanel jPanelnombreCliente;
	public JLabel jLabelnombreCliente;
	public JTextArea jTextAreanombreCliente;
	public JScrollPane jscrollPanenombreCliente;
	public JButton jButtonnombreClienteBusqueda= new JButtonMe();

	public JPanel jPanelapellidoCliente;
	public JLabel jLabelapellidoCliente;
	public JTextArea jTextAreaapellidoCliente;
	public JScrollPane jscrollPaneapellidoCliente;
	public JButton jButtonapellidoClienteBusqueda= new JButtonMe();

	public JPanel jPanelnombre_completoCliente;
	public JLabel jLabelnombre_completoCliente;
	public JTextArea jTextAreanombre_completoCliente;
	public JScrollPane jscrollPanenombre_completoCliente;
	public JButton jButtonnombre_completoClienteBusqueda= new JButtonMe();

	public JPanel jPanelnombre_comercialCliente;
	public JLabel jLabelnombre_comercialCliente;
	public JTextArea jTextAreanombre_comercialCliente;
	public JScrollPane jscrollPanenombre_comercialCliente;
	public JButton jButtonnombre_comercialClienteBusqueda= new JButtonMe();

	public JPanel jPaneltelefonoCliente;
	public JLabel jLabeltelefonoCliente;
	public JTextField jTextFieldtelefonoCliente;
	public JButton jButtontelefonoClienteBusqueda= new JButtonMe();

	public JPanel jPaneldireccionCliente;
	public JLabel jLabeldireccionCliente;
	public JTextArea jTextAreadireccionCliente;
	public JScrollPane jscrollPanedireccionCliente;
	public JButton jButtondireccionClienteBusqueda= new JButtonMe();

	public JPanel jPaneles_proveCliente;
	public JLabel jLabeles_proveCliente;
	public JCheckBox jCheckBoxes_proveCliente;
	public JButton jButtones_proveClienteBusqueda= new JButtonMe();

	public JPanel jPanelobservacionCliente;
	public JLabel jLabelobservacionCliente;
	public JTextArea jTextAreaobservacionCliente;
	public JScrollPane jscrollPaneobservacionCliente;
	public JButton jButtonobservacionClienteBusqueda= new JButtonMe();

	public JPanel jPanelfecha_nacimientoCliente;
	public JLabel jLabelfecha_nacimientoCliente;
	//public JFormattedTextField jDateChooserfecha_nacimientoCliente;

	public JDateChooser jDateChooserfecha_nacimientoCliente;
	public JButton jButtonfecha_nacimientoClienteBusqueda= new JButtonMe();

	public JPanel jPanelpath_imagen_firmaCliente;
	public JLabel jLabelpath_imagen_firmaCliente;
	public JTextArea jTextAreapath_imagen_firmaCliente;
	public JScrollPane jscrollPanepath_imagen_firmaCliente;
	public JButton jButtonpath_imagen_firmaClienteBusqueda= new JButtonMe();

	public JPanel jPanelcontactoCliente;
	public JLabel jLabelcontactoCliente;
	public JTextArea jTextAreacontactoCliente;
	public JScrollPane jscrollPanecontactoCliente;
	public JButton jButtoncontactoClienteBusqueda= new JButtonMe();

	public JPanel jPanelrepresentanteCliente;
	public JLabel jLabelrepresentanteCliente;
	public JTextArea jTextArearepresentanteCliente;
	public JScrollPane jscrollPanerepresentanteCliente;
	public JButton jButtonrepresentanteClienteBusqueda= new JButtonMe();

	public JPanel jPanelnombre_garantiaCliente;
	public JLabel jLabelnombre_garantiaCliente;
	public JTextArea jTextAreanombre_garantiaCliente;
	public JScrollPane jscrollPanenombre_garantiaCliente;
	public JButton jButtonnombre_garantiaClienteBusqueda= new JButtonMe();

	public JPanel jPanelvalor_garantiaCliente;
	public JLabel jLabelvalor_garantiaCliente;
	public JTextField jTextFieldvalor_garantiaCliente;
	public JButton jButtonvalor_garantiaClienteBusqueda= new JButtonMe();

	public JPanel jPanelnumero_cargaCliente;
	public JLabel jLabelnumero_cargaCliente;
	public JTextField jTextFieldnumero_cargaCliente;
	public JButton jButtonnumero_cargaClienteBusqueda= new JButtonMe();

	public JPanel jPanelcredito_usadoCliente;
	public JLabel jLabelcredito_usadoCliente;
	public JTextField jTextFieldcredito_usadoCliente;
	public JButton jButtoncredito_usadoClienteBusqueda= new JButtonMe();

	public JPanel jPanellimite_creditoCliente;
	public JLabel jLabellimite_creditoCliente;
	public JTextField jTextFieldlimite_creditoCliente;
	public JButton jButtonlimite_creditoClienteBusqueda= new JButtonMe();

	public JPanel jPanelcredito_disponibleCliente;
	public JLabel jLabelcredito_disponibleCliente;
	public JTextField jTextFieldcredito_disponibleCliente;
	public JButton jButtoncredito_disponibleClienteBusqueda= new JButtonMe();

	public JPanel jPaneltotal_documentosCliente;
	public JLabel jLabeltotal_documentosCliente;
	public JTextField jTextFieldtotal_documentosCliente;
	public JButton jButtontotal_documentosClienteBusqueda= new JButtonMe();

	public JPanel jPanelfecha_ultima_facturaCliente;
	public JLabel jLabelfecha_ultima_facturaCliente;
	//public JFormattedTextField jDateChooserfecha_ultima_facturaCliente;

	public JDateChooser jDateChooserfecha_ultima_facturaCliente;
	public JButton jButtonfecha_ultima_facturaClienteBusqueda= new JButtonMe();

	public JPanel jPaneldescuentoCliente;
	public JLabel jLabeldescuentoCliente;
	public JTextField jTextFielddescuentoCliente;
	public JButton jButtondescuentoClienteBusqueda= new JButtonMe();

	public JPanel jPanelhora_pagoCliente;
	public JLabel jLabelhora_pagoCliente;
	public JSpinner jSpinnerhora_pagoCliente= new JSpinner(new SpinnerDateModel());;
	public JButton jButtonhora_pagoClienteBusqueda= new JButtonMe();

	public JPanel jPanelcobranzasCliente;
	public JLabel jLabelcobranzasCliente;
	public JTextArea jTextAreacobranzasCliente;
	public JScrollPane jscrollPanecobranzasCliente;
	public JButton jButtoncobranzasClienteBusqueda= new JButtonMe();

	public JPanel jPanelmotivoCliente;
	public JLabel jLabelmotivoCliente;
	public JTextArea jTextAreamotivoCliente;
	public JScrollPane jscrollPanemotivoCliente;
	public JButton jButtonmotivoClienteBusqueda= new JButtonMe();

	public JPanel jPanelpreferenciaCliente;
	public JLabel jLabelpreferenciaCliente;
	public JTextArea jTextAreapreferenciaCliente;
	public JScrollPane jscrollPanepreferenciaCliente;
	public JButton jButtonpreferenciaClienteBusqueda= new JButtonMe();

	public JPanel jPanelcon_separacion_bienesCliente;
	public JLabel jLabelcon_separacion_bienesCliente;
	public JCheckBox jCheckBoxcon_separacion_bienesCliente;
	public JButton jButtoncon_separacion_bienesClienteBusqueda= new JButtonMe();

	public JPanel jPaneldetalle_estadoCliente;
	public JLabel jLabeldetalle_estadoCliente;
	public JTextArea jTextAreadetalle_estadoCliente;
	public JScrollPane jscrollPanedetalle_estadoCliente;
	public JButton jButtondetalle_estadoClienteBusqueda= new JButtonMe();

	public JPanel jPaneles_contribuyente_especialCliente;
	public JLabel jLabeles_contribuyente_especialCliente;
	public JCheckBox jCheckBoxes_contribuyente_especialCliente;
	public JButton jButtones_contribuyente_especialClienteBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaCliente;
	public JLabel jLabelid_empresaCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaCliente;
	public JButton jButtonid_empresaCliente= new JButtonMe();
	public JButton jButtonid_empresaClienteUpdate= new JButtonMe();
	public JButton jButtonid_empresaClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalCliente;
	public JLabel jLabelid_sucursalCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalCliente;
	public JButton jButtonid_sucursalCliente= new JButtonMe();
	public JButton jButtonid_sucursalClienteUpdate= new JButtonMe();
	public JButton jButtonid_sucursalClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_identificacionCliente;
	public JLabel jLabelid_tipo_identificacionCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_identificacionCliente;
	public JButton jButtonid_tipo_identificacionCliente= new JButtonMe();
	public JButton jButtonid_tipo_identificacionClienteUpdate= new JButtonMe();
	public JButton jButtonid_tipo_identificacionClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_grupo_clienteCliente;
	public JLabel jLabelid_grupo_clienteCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_grupo_clienteCliente;
	public JButton jButtonid_grupo_clienteCliente= new JButtonMe();
	public JButton jButtonid_grupo_clienteClienteUpdate= new JButtonMe();
	public JButton jButtonid_grupo_clienteClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_titulo_clienteCliente;
	public JLabel jLabelid_titulo_clienteCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_titulo_clienteCliente;
	public JButton jButtonid_titulo_clienteCliente= new JButtonMe();
	public JButton jButtonid_titulo_clienteClienteUpdate= new JButtonMe();
	public JButton jButtonid_titulo_clienteClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_area_crCliente;
	public JLabel jLabelid_area_crCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_area_crCliente;
	public JButton jButtonid_area_crCliente= new JButtonMe();
	public JButton jButtonid_area_crClienteUpdate= new JButtonMe();
	public JButton jButtonid_area_crClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_estado_clienteCliente;
	public JLabel jLabelid_estado_clienteCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_clienteCliente;
	public JButton jButtonid_estado_clienteCliente= new JButtonMe();
	public JButton jButtonid_estado_clienteClienteUpdate= new JButtonMe();
	public JButton jButtonid_estado_clienteClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_paisCliente;
	public JLabel jLabelid_paisCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisCliente;
	public JButton jButtonid_paisCliente= new JButtonMe();
	public JButton jButtonid_paisClienteUpdate= new JButtonMe();
	public JButton jButtonid_paisClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_regionCliente;
	public JLabel jLabelid_regionCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_regionCliente;
	public JButton jButtonid_regionCliente= new JButtonMe();
	public JButton jButtonid_regionClienteUpdate= new JButtonMe();
	public JButton jButtonid_regionClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_provinciaCliente;
	public JLabel jLabelid_provinciaCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_provinciaCliente;
	public JButton jButtonid_provinciaCliente= new JButtonMe();
	public JButton jButtonid_provinciaClienteUpdate= new JButtonMe();
	public JButton jButtonid_provinciaClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_ciudadCliente;
	public JLabel jLabelid_ciudadCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ciudadCliente;
	public JButton jButtonid_ciudadCliente= new JButtonMe();
	public JButton jButtonid_ciudadClienteUpdate= new JButtonMe();
	public JButton jButtonid_ciudadClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_zonaCliente;
	public JLabel jLabelid_zonaCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_zonaCliente;
	public JButton jButtonid_zonaCliente= new JButtonMe();
	public JButton jButtonid_zonaClienteUpdate= new JButtonMe();
	public JButton jButtonid_zonaClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_pais_nacionalidadCliente;
	public JLabel jLabelid_pais_nacionalidadCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_pais_nacionalidadCliente;
	public JButton jButtonid_pais_nacionalidadCliente= new JButtonMe();
	public JButton jButtonid_pais_nacionalidadClienteUpdate= new JButtonMe();
	public JButton jButtonid_pais_nacionalidadClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_cargo_laboCliente;
	public JLabel jLabelid_tipo_cargo_laboCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_cargo_laboCliente;
	public JButton jButtonid_tipo_cargo_laboCliente= new JButtonMe();
	public JButton jButtonid_tipo_cargo_laboClienteUpdate= new JButtonMe();
	public JButton jButtonid_tipo_cargo_laboClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_nivel_eduCliente;
	public JLabel jLabelid_tipo_nivel_eduCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_nivel_eduCliente;
	public JButton jButtonid_tipo_nivel_eduCliente= new JButtonMe();
	public JButton jButtonid_tipo_nivel_eduClienteUpdate= new JButtonMe();
	public JButton jButtonid_tipo_nivel_eduClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_profesionCliente;
	public JLabel jLabelid_profesionCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_profesionCliente;
	public JButton jButtonid_profesionCliente= new JButtonMe();
	public JButton jButtonid_profesionClienteUpdate= new JButtonMe();
	public JButton jButtonid_profesionClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_generoCliente;
	public JLabel jLabelid_tipo_generoCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_generoCliente;
	public JButton jButtonid_tipo_generoCliente= new JButtonMe();
	public JButton jButtonid_tipo_generoClienteUpdate= new JButtonMe();
	public JButton jButtonid_tipo_generoClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_estado_civilCliente;
	public JLabel jLabelid_estado_civilCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_civilCliente;
	public JButton jButtonid_estado_civilCliente= new JButtonMe();
	public JButton jButtonid_estado_civilClienteUpdate= new JButtonMe();
	public JButton jButtonid_estado_civilClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_estado_legalCliente;
	public JLabel jLabelid_estado_legalCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_legalCliente;
	public JButton jButtonid_estado_legalCliente= new JButtonMe();
	public JButton jButtonid_estado_legalClienteUpdate= new JButtonMe();
	public JButton jButtonid_estado_legalClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_cuenta_contableCliente;
	public JLabel jLabelid_cuenta_contableCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contableCliente;
	public JButton jButtonid_cuenta_contableCliente= new JButtonMe();
	public JButton jButtonid_cuenta_contableClienteUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contableClienteBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contableClienteArbol= new JButtonMe();

	public JPanel jPanelid_rutaCliente;
	public JLabel jLabelid_rutaCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_rutaCliente;
	public JButton jButtonid_rutaCliente= new JButtonMe();
	public JButton jButtonid_rutaClienteUpdate= new JButtonMe();
	public JButton jButtonid_rutaClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_vendedorCliente;
	public JLabel jLabelid_vendedorCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_vendedorCliente;
	public JButton jButtonid_vendedorCliente= new JButtonMe();
	public JButton jButtonid_vendedorClienteUpdate= new JButtonMe();
	public JButton jButtonid_vendedorClienteBusqueda= new JButtonMe();
	public JButton jButtonid_vendedorClienteArbol= new JButtonMe();

	public JPanel jPanelid_centro_actividadCliente;
	public JLabel jLabelid_centro_actividadCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_actividadCliente;
	public JButton jButtonid_centro_actividadCliente= new JButtonMe();
	public JButton jButtonid_centro_actividadClienteUpdate= new JButtonMe();
	public JButton jButtonid_centro_actividadClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_garantia_empresaCliente;
	public JLabel jLabelid_tipo_garantia_empresaCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_garantia_empresaCliente;
	public JButton jButtonid_tipo_garantia_empresaCliente= new JButtonMe();
	public JButton jButtonid_tipo_garantia_empresaClienteUpdate= new JButtonMe();
	public JButton jButtonid_tipo_garantia_empresaClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_cate_tipo_afiliacionCliente;
	public JLabel jLabelid_cate_tipo_afiliacionCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cate_tipo_afiliacionCliente;
	public JButton jButtonid_cate_tipo_afiliacionCliente= new JButtonMe();
	public JButton jButtonid_cate_tipo_afiliacionClienteUpdate= new JButtonMe();
	public JButton jButtonid_cate_tipo_afiliacionClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_diaCliente;
	public JLabel jLabelid_diaCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_diaCliente;
	public JButton jButtonid_diaCliente= new JButtonMe();
	public JButton jButtonid_diaClienteUpdate= new JButtonMe();
	public JButton jButtonid_diaClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_empleadoCliente;
	public JLabel jLabelid_empleadoCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoCliente;
	public JButton jButtonid_empleadoCliente= new JButtonMe();
	public JButton jButtonid_empleadoClienteUpdate= new JButtonMe();
	public JButton jButtonid_empleadoClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_precioCliente;
	public JLabel jLabelid_tipo_precioCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_precioCliente;
	public JButton jButtonid_tipo_precioCliente= new JButtonMe();
	public JButton jButtonid_tipo_precioClienteUpdate= new JButtonMe();
	public JButton jButtonid_tipo_precioClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_lista_precioCliente;
	public JLabel jLabelid_tipo_lista_precioCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_lista_precioCliente;
	public JButton jButtonid_tipo_lista_precioCliente= new JButtonMe();
	public JButton jButtonid_tipo_lista_precioClienteUpdate= new JButtonMe();
	public JButton jButtonid_tipo_lista_precioClienteBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesCliente;
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=true;
	public static Boolean ISBINDING_MANUAL_TABLA=true;
	public static Boolean CON_CARGAR_MEMORIA_INICIAL=true;
	
	//Al final no se utilizan, se inicializan desde JInternalFrameBase, desde ParametroGeneralUsuario
	public static String STIPO_TAMANIO_GENERAL="NORMAL";
	public static String STIPO_TAMANIO_GENERAL_TABLA="NORMAL";
	public static Boolean CONTIPO_TAMANIO_MANUAL=false;
	public static Boolean CON_LLAMADA_SIMPLE=true;
	public static Boolean CON_LLAMADA_SIMPLE_TOTAL=true;
	public static Boolean ESTA_CARGADO_PORPARTE=false;
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=880;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightFormulario=2200;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ClienteDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposCliente=new JPanel();
				this.jPanelAccionesFormularioCliente=new JPanel();
				this.jmenuBarDetalleCliente=new JMenuBar();
				this.jTtoolBarDetalleCliente=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ClienteDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Cliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ClienteDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Cliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ClienteDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Cliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ClienteDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Cliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ClienteDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Cliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			
			long start_time=0;
			long end_time=0;
			
			if(Constantes2.ISDEVELOPING2) {
				start_time = System.currentTimeMillis();
			}

			this.initialize(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Clase Padre Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }		

	public JInternalFrameBase getJInternalFrameParent() {
		return jInternalFrameParent;
	}

	public void setJInternalFrameParent(JInternalFrameBase internalFrameParent)	{
		jInternalFrameParent = internalFrameParent;
	}
	
	
	public JButton getjButtonActualizarToolBarCliente() {
		return this.jButtonActualizarToolBarCliente;
	}
	
	public JButton getjButtonEliminarToolBarCliente() {
		return this.jButtonEliminarToolBarCliente;
	}
	
	public JButton getjButtonCancelarToolBarCliente() {
		return this.jButtonCancelarToolBarCliente;
	}		
	
	public JButton getjButtonProcesarInformacionCliente() {
		return this.jButtonProcesarInformacionCliente;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCliente)	{
		this.jButtonProcesarInformacionCliente = jButtonProcesarInformacionCliente;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCliente() {
		return this.jComboBoxTiposAccionesCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCliente(
			JComboBox jComboBoxTiposRelacionesCliente) {
		this.jComboBoxTiposRelacionesCliente = jComboBoxTiposRelacionesCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCliente(
			JComboBox jComboBoxTiposAccionesCliente) {
		this.jComboBoxTiposAccionesCliente = jComboBoxTiposAccionesCliente;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioCliente() {
		return this.jComboBoxTiposAccionesFormularioCliente;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioCliente(
			JComboBox jComboBoxTiposAccionesFormularioCliente) {
		this.jComboBoxTiposAccionesFormularioCliente = jComboBoxTiposAccionesFormularioCliente;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.clienteSessionBean=new ClienteSessionBean();
		
		this.clienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.clienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.clienteSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.informacionlaboralSessionBean=new InformacionLaboralSessionBean();
		//this.transportistaSessionBean=new TransportistaSessionBean();
		//this.novedadSessionBean=new NovedadSessionBean();
		//this.politicasclienteSessionBean=new PoliticasClienteSessionBean();
		//this.referenciapersonalSessionBean=new ReferenciaPersonalSessionBean();
		//this.balancegeneralclienteSessionBean=new BalanceGeneralClienteSessionBean();
		//this.politicaclienteSessionBean=new PoliticaClienteSessionBean();
		//this.vehiculoclienteSessionBean=new VehiculoClienteSessionBean();
		//this.responsableSessionBean=new ResponsableSessionBean();
		//this.informacionfinancieraSessionBean=new InformacionFinancieraSessionBean();
		//this.consignatarioSessionBean=new ConsignatarioSessionBean();
		//this.clienteimagenSessionBean=new ClienteImagenSessionBean();
		//this.garantiaclienteSessionBean=new GarantiaClienteSessionBean();
		//this.informacioneconomicaSessionBean=new InformacionEconomicaSessionBean();
		//this.referenciacomercialSessionBean=new ReferenciaComercialSessionBean();
		//this.bienSessionBean=new BienSessionBean();
		//this.proveedorproductoSessionBean=new ProveedorProductoSessionBean();
		//this.servicioclienteSessionBean=new ServicioClienteSessionBean();
		//this.contactoclienteSessionBean=new ContactoClienteSessionBean();
		//this.datoconstitucionSessionBean=new DatoConstitucionSessionBean();
		//this.clientecoaSessionBean=new ClienteCoaSessionBean();
		//this.hobbyclienteSessionBean=new HobbyClienteSessionBean();
		//this.cargafamiliarSessionBean=new CargaFamiliarSessionBean();
		//this.emailSessionBean=new EMailSessionBean();
		//this.conyugeSessionBean=new ConyugeSessionBean();
		//this.cuentaporcobrarSessionBean=new CuentaPorCobrarSessionBean();
		//this.firmaclienteSessionBean=new FirmaClienteSessionBean();
		//this.representantelegalSessionBean=new RepresentanteLegalSessionBean();
		//this.telefonoSessionBean=new TelefonoSessionBean();
		//this.negocioclienteSessionBean=new NegocioClienteSessionBean();
		//this.referenciabancariaSessionBean=new ReferenciaBancariaSessionBean();
		//this.montoSessionBean=new MontoSessionBean();
		//this.clientearchivoSessionBean=new ClienteArchivoSessionBean();
		//this.actividadeconomicaSessionBean=new ActividadEconomicaSessionBean();
		//this.direccionSessionBean=new DireccionSessionBean();
		//this.chequepostfechadoSessionBean=new ChequePostFechadoSessionBean();
		//this.subclienteSessionBean=new SubClienteSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ClienteJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ClienteJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cliente MANTENIMIENTO"));
		
		
		if(iWidth > 6050) {
			iWidth=6050;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.clienteSessionBean.getEsGuardarRelacionado()) {
			this.setResizable(true);
			this.setClosable(true);
			this.setMaximizable(true);
			this.iconable=true;
			
			setLocation(xOffset*openFrameCount, yOffset*openFrameCount);
			
			if(Constantes.CON_VARIAS_VENTANAS) {
				openFrameCount++;
				
				if(openFrameCount==Constantes.INUM_MAX_VENTANAS) {
					openFrameCount=0;
				}
			}
		}				
	
		ClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleCliente= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarCliente=new JButtonMe();
				this.jButtonModificarToolBarCliente=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarCliente,this.jTtoolBarDetalleCliente,
							"actualizar","actualizar","Actualizar"+" "+ClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarCliente,this.jTtoolBarDetalleCliente,
							"eliminar","eliminar","Eliminar"+" "+ClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarCliente,this.jTtoolBarDetalleCliente,
							"cancelar","cancelar","Cancelar"+" "+ClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarCliente,this.jTtoolBarDetalleCliente,
							"guardarcambios","guardarcambios","Guardar"+" "+ClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarCliente,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleCliente=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleCliente=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoCliente=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesCliente=new JMenuMe("Acciones");
		this.jmenuDetalleDatosCliente=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCliente= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCliente.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCliente,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarCliente= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarCliente.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarCliente,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarCliente= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarCliente.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarCliente,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarCliente= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarCliente.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarCliente,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarCliente= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarCliente.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarCliente,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosCliente= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCliente.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCliente,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCliente,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCliente,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCliente, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoCliente.add(this.jMenuItemDetalleCerrarCliente);
		
		this.jmenuDetalleAccionesCliente.add(this.jMenuItemActualizarCliente);
		this.jmenuDetalleAccionesCliente.add(this.jMenuItemEliminarCliente);
		this.jmenuDetalleAccionesCliente.add(this.jMenuItemCancelarCliente);		
		
		//this.jmenuDetalleDatosCliente.add(this.jMenuItemDetalleAbrirOrderByCliente);				
		this.jmenuDetalleDatosCliente.add(this.jMenuItemDetalleMostarOcultarCliente);				
				
		//this.jmenuDetalleAccionesCliente.add(this.jMenuItemGuardarCambiosCliente);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleCliente.add(this.jmenuDetalleArchivoCliente);		
		this.jmenuBarDetalleCliente.add(this.jmenuDetalleAccionesCliente);		
		this.jmenuBarDetalleCliente.add(this.jmenuDetalleDatosCliente);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleCliente.add(this.jmenuDetalleCliente);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleCliente);				
	}
	
	
	public void inicializarElementosCamposCliente() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdCliente = new JLabelMe();
		jLabelIdCliente.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidCliente = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidCliente.setToolTipText(ClienteConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutCliente= new GridBagLayout();

		this.jPanelidCliente.setLayout(this.gridaBagLayoutCliente);

		jLabelidCliente = new JLabel();
		jLabelidCliente.setText("Id");

		jLabelidCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoCliente = new JLabelMe();
		this.jLabelcodigoCliente.setText(""+ClienteConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoCliente.setToolTipText("Codigo");
		this.jLabelcodigoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoCliente.setToolTipText(ClienteConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutCliente = new GridBagLayout();
		this.jPanelcodigoCliente.setLayout(this.gridaBagLayoutCliente);


		jTextFieldcodigoCliente= new JTextFieldMe();

		jTextFieldcodigoCliente.setEnabled(false);
		jTextFieldcodigoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoClienteBusqueda= new JButtonMe();
		this.jButtoncodigoClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoClienteBusqueda.setText("U");
		this.jButtoncodigoClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoClienteBusqueda"));

		if(this.clienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoClienteBusqueda.setVisible(false);		}


					
		this.jLabelidentificacionCliente = new JLabelMe();
		this.jLabelidentificacionCliente.setText(""+ClienteConstantesFunciones.LABEL_IDENTIFICACION+" : *");
		this.jLabelidentificacionCliente.setToolTipText("Identificacion");
		this.jLabelidentificacionCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelidentificacionCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelidentificacionCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelidentificacionCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelidentificacionCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidentificacionCliente.setToolTipText(ClienteConstantesFunciones.LABEL_IDENTIFICACION);
		this.gridaBagLayoutCliente = new GridBagLayout();
		this.jPanelidentificacionCliente.setLayout(this.gridaBagLayoutCliente);


		jTextFieldidentificacionCliente= new JTextFieldMe();

		jTextFieldidentificacionCliente.setEnabled(false);
		jTextFieldidentificacionCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldidentificacionCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldidentificacionCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldidentificacionCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonidentificacionClienteBusqueda= new JButtonMe();
		this.jButtonidentificacionClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidentificacionClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidentificacionClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonidentificacionClienteBusqueda.setText("U");
		this.jButtonidentificacionClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonidentificacionClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidentificacionClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldidentificacionCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldidentificacionCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"identificacionClienteBusqueda"));

		if(this.clienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonidentificacionClienteBusqueda.setVisible(false);		}


					
		this.jLabelrucCliente = new JLabelMe();
		this.jLabelrucCliente.setText(""+ClienteConstantesFunciones.LABEL_RUC+" : *");
		this.jLabelrucCliente.setToolTipText("Ruc");
		this.jLabelrucCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrucCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrucCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelrucCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelrucCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelrucCliente.setToolTipText(ClienteConstantesFunciones.LABEL_RUC);
		this.gridaBagLayoutCliente = new GridBagLayout();
		this.jPanelrucCliente.setLayout(this.gridaBagLayoutCliente);


		jTextFieldrucCliente= new JTextFieldMe();

		jTextFieldrucCliente.setEnabled(false);
		jTextFieldrucCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldrucCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonrucClienteBusqueda= new JButtonMe();
		this.jButtonrucClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrucClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrucClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonrucClienteBusqueda.setText("U");
		this.jButtonrucClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonrucClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonrucClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldrucCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldrucCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"rucClienteBusqueda"));

		if(this.clienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonrucClienteBusqueda.setVisible(false);		}


					
		this.jLabelnombreCliente = new JLabelMe();
		this.jLabelnombreCliente.setText(""+ClienteConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreCliente.setToolTipText("Nombre");
		this.jLabelnombreCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreCliente.setToolTipText(ClienteConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutCliente = new GridBagLayout();
		this.jPanelnombreCliente.setLayout(this.gridaBagLayoutCliente);


		jTextAreanombreCliente= new JTextAreaMe();
		jTextAreanombreCliente.setEnabled(false);
		jTextAreanombreCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreCliente.setLineWrap(true);
		jTextAreanombreCliente.setWrapStyleWord(true);
		jTextAreanombreCliente.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreCliente.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreCliente = new JScrollPane(jTextAreanombreCliente);
		jscrollPanenombreCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreClienteBusqueda= new JButtonMe();
		this.jButtonnombreClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreClienteBusqueda.setText("U");
		this.jButtonnombreClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreClienteBusqueda"));

		if(this.clienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreClienteBusqueda.setVisible(false);		}


					
		this.jLabelapellidoCliente = new JLabelMe();
		this.jLabelapellidoCliente.setText(""+ClienteConstantesFunciones.LABEL_APELLIDO+" : *");
		this.jLabelapellidoCliente.setToolTipText("Apellido");
		this.jLabelapellidoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelapellidoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelapellidoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelapellidoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelapellidoCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelapellidoCliente.setToolTipText(ClienteConstantesFunciones.LABEL_APELLIDO);
		this.gridaBagLayoutCliente = new GridBagLayout();
		this.jPanelapellidoCliente.setLayout(this.gridaBagLayoutCliente);


		jTextAreaapellidoCliente= new JTextAreaMe();
		jTextAreaapellidoCliente.setEnabled(false);
		jTextAreaapellidoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaapellidoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaapellidoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaapellidoCliente.setLineWrap(true);
		jTextAreaapellidoCliente.setWrapStyleWord(true);
		jTextAreaapellidoCliente.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaapellidoCliente.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreaapellidoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneapellidoCliente = new JScrollPane(jTextAreaapellidoCliente);
		jscrollPaneapellidoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneapellidoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneapellidoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonapellidoClienteBusqueda= new JButtonMe();
		this.jButtonapellidoClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonapellidoClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonapellidoClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonapellidoClienteBusqueda.setText("U");
		this.jButtonapellidoClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonapellidoClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonapellidoClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaapellidoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaapellidoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"apellidoClienteBusqueda"));

		if(this.clienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonapellidoClienteBusqueda.setVisible(false);		}


					
		this.jLabelnombre_completoCliente = new JLabelMe();
		this.jLabelnombre_completoCliente.setText(""+ClienteConstantesFunciones.LABEL_NOMBRECOMPLETO+" :");
		this.jLabelnombre_completoCliente.setToolTipText("Nombre Completo");
		this.jLabelnombre_completoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_completoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_completoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_completoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_completoCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_completoCliente.setToolTipText(ClienteConstantesFunciones.LABEL_NOMBRECOMPLETO);
		this.gridaBagLayoutCliente = new GridBagLayout();
		this.jPanelnombre_completoCliente.setLayout(this.gridaBagLayoutCliente);


		jTextAreanombre_completoCliente= new JTextAreaMe();
		jTextAreanombre_completoCliente.setEnabled(false);
		jTextAreanombre_completoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoCliente.setLineWrap(true);
		jTextAreanombre_completoCliente.setWrapStyleWord(true);
		jTextAreanombre_completoCliente.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_completoCliente.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_completoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_completoCliente = new JScrollPane(jTextAreanombre_completoCliente);
		jscrollPanenombre_completoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_completoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_completoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		jTextAreanombre_completoCliente.setEnabled(false);
		this.jButtonnombre_completoClienteBusqueda= new JButtonMe();
		this.jButtonnombre_completoClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completoClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completoClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_completoClienteBusqueda.setText("U");
		this.jButtonnombre_completoClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_completoClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_completoClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_completoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_completoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_completoClienteBusqueda"));

		if(this.clienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_completoClienteBusqueda.setVisible(false);		}


					
		this.jLabelnombre_comercialCliente = new JLabelMe();
		this.jLabelnombre_comercialCliente.setText(""+ClienteConstantesFunciones.LABEL_NOMBRECOMERCIAL+" :");
		this.jLabelnombre_comercialCliente.setToolTipText("Nombre Comercial");
		this.jLabelnombre_comercialCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_comercialCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_comercialCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_comercialCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_comercialCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_comercialCliente.setToolTipText(ClienteConstantesFunciones.LABEL_NOMBRECOMERCIAL);
		this.gridaBagLayoutCliente = new GridBagLayout();
		this.jPanelnombre_comercialCliente.setLayout(this.gridaBagLayoutCliente);


		jTextAreanombre_comercialCliente= new JTextAreaMe();
		jTextAreanombre_comercialCliente.setEnabled(false);
		jTextAreanombre_comercialCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_comercialCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_comercialCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_comercialCliente.setLineWrap(true);
		jTextAreanombre_comercialCliente.setWrapStyleWord(true);
		jTextAreanombre_comercialCliente.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_comercialCliente.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_comercialCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_comercialCliente = new JScrollPane(jTextAreanombre_comercialCliente);
		jscrollPanenombre_comercialCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_comercialCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_comercialCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_comercialClienteBusqueda= new JButtonMe();
		this.jButtonnombre_comercialClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_comercialClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_comercialClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_comercialClienteBusqueda.setText("U");
		this.jButtonnombre_comercialClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_comercialClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_comercialClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_comercialCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_comercialCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_comercialClienteBusqueda"));

		if(this.clienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_comercialClienteBusqueda.setVisible(false);		}


					
		this.jLabeltelefonoCliente = new JLabelMe();
		this.jLabeltelefonoCliente.setText(""+ClienteConstantesFunciones.LABEL_TELEFONO+" :");
		this.jLabeltelefonoCliente.setToolTipText("Telefono");
		this.jLabeltelefonoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefonoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefonoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltelefonoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltelefonoCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltelefonoCliente.setToolTipText(ClienteConstantesFunciones.LABEL_TELEFONO);
		this.gridaBagLayoutCliente = new GridBagLayout();
		this.jPaneltelefonoCliente.setLayout(this.gridaBagLayoutCliente);


		jTextFieldtelefonoCliente= new JTextFieldMe();

		jTextFieldtelefonoCliente.setEnabled(false);
		jTextFieldtelefonoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtelefonoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtelefonoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtelefonoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtontelefonoClienteBusqueda= new JButtonMe();
		this.jButtontelefonoClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonoClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonoClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontelefonoClienteBusqueda.setText("U");
		this.jButtontelefonoClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontelefonoClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontelefonoClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtelefonoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtelefonoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"telefonoClienteBusqueda"));

		if(this.clienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontelefonoClienteBusqueda.setVisible(false);		}


					
		this.jLabeldireccionCliente = new JLabelMe();
		this.jLabeldireccionCliente.setText(""+ClienteConstantesFunciones.LABEL_DIRECCION+" :");
		this.jLabeldireccionCliente.setToolTipText("Direccion");
		this.jLabeldireccionCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldireccionCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldireccionCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldireccionCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldireccionCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldireccionCliente.setToolTipText(ClienteConstantesFunciones.LABEL_DIRECCION);
		this.gridaBagLayoutCliente = new GridBagLayout();
		this.jPaneldireccionCliente.setLayout(this.gridaBagLayoutCliente);


		jTextAreadireccionCliente= new JTextAreaMe();
		jTextAreadireccionCliente.setEnabled(false);
		jTextAreadireccionCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionCliente.setLineWrap(true);
		jTextAreadireccionCliente.setWrapStyleWord(true);
		jTextAreadireccionCliente.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadireccionCliente.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadireccionCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedireccionCliente = new JScrollPane(jTextAreadireccionCliente);
		jscrollPanedireccionCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedireccionCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedireccionCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondireccionClienteBusqueda= new JButtonMe();
		this.jButtondireccionClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccionClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccionClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondireccionClienteBusqueda.setText("U");
		this.jButtondireccionClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondireccionClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondireccionClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadireccionCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadireccionCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"direccionClienteBusqueda"));

		if(this.clienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondireccionClienteBusqueda.setVisible(false);		}


					
		this.jLabeles_proveCliente = new JLabelMe();
		this.jLabeles_proveCliente.setText(""+ClienteConstantesFunciones.LABEL_ESPROVE+" : *");
		this.jLabeles_proveCliente.setToolTipText("Es Proveedor");
		this.jLabeles_proveCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_proveCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_proveCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_proveCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_proveCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_proveCliente.setToolTipText(ClienteConstantesFunciones.LABEL_ESPROVE);
		this.gridaBagLayoutCliente = new GridBagLayout();
		this.jPaneles_proveCliente.setLayout(this.gridaBagLayoutCliente);


		jCheckBoxes_proveCliente= new JCheckBoxMe();
		jCheckBoxes_proveCliente.setEnabled(false);

		jCheckBoxes_proveCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_proveCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_proveCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_proveCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_proveClienteBusqueda= new JButtonMe();
		this.jButtones_proveClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_proveClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_proveClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_proveClienteBusqueda.setText("U");
		this.jButtones_proveClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_proveClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_proveClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_proveCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_proveCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_proveClienteBusqueda"));

		if(this.clienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_proveClienteBusqueda.setVisible(false);		}


					
		this.jLabelobservacionCliente = new JLabelMe();
		this.jLabelobservacionCliente.setText(""+ClienteConstantesFunciones.LABEL_OBSERVACION+" :");
		this.jLabelobservacionCliente.setToolTipText("Observacion");
		this.jLabelobservacionCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelobservacionCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelobservacionCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelobservacionCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelobservacionCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelobservacionCliente.setToolTipText(ClienteConstantesFunciones.LABEL_OBSERVACION);
		this.gridaBagLayoutCliente = new GridBagLayout();
		this.jPanelobservacionCliente.setLayout(this.gridaBagLayoutCliente);


		jTextAreaobservacionCliente= new JTextAreaMe();
		jTextAreaobservacionCliente.setEnabled(false);
		jTextAreaobservacionCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaobservacionCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaobservacionCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaobservacionCliente.setLineWrap(true);
		jTextAreaobservacionCliente.setWrapStyleWord(true);
		jTextAreaobservacionCliente.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaobservacionCliente.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreaobservacionCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneobservacionCliente = new JScrollPane(jTextAreaobservacionCliente);
		jscrollPaneobservacionCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPaneobservacionCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPaneobservacionCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonobservacionClienteBusqueda= new JButtonMe();
		this.jButtonobservacionClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonobservacionClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonobservacionClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonobservacionClienteBusqueda.setText("U");
		this.jButtonobservacionClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonobservacionClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonobservacionClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaobservacionCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaobservacionCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"observacionClienteBusqueda"));

		if(this.clienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonobservacionClienteBusqueda.setVisible(false);		}


					
		this.jLabelfecha_nacimientoCliente = new JLabelMe();
		this.jLabelfecha_nacimientoCliente.setText(""+ClienteConstantesFunciones.LABEL_FECHANACIMIENTO+" : *");
		this.jLabelfecha_nacimientoCliente.setToolTipText("Fecha Nacimiento");
		this.jLabelfecha_nacimientoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_nacimientoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_nacimientoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_nacimientoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_nacimientoCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_nacimientoCliente.setToolTipText(ClienteConstantesFunciones.LABEL_FECHANACIMIENTO);
		this.gridaBagLayoutCliente = new GridBagLayout();
		this.jPanelfecha_nacimientoCliente.setLayout(this.gridaBagLayoutCliente);


		//jFormattedTextFieldfecha_nacimientoCliente= new JFormattedTextFieldMe();

		jDateChooserfecha_nacimientoCliente= new JDateChooser();
		jDateChooserfecha_nacimientoCliente.setEnabled(false);
		jDateChooserfecha_nacimientoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_nacimientoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_nacimientoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_nacimientoCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_nacimientoCliente.setDate(new Date());
		jDateChooserfecha_nacimientoCliente.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_nacimientoCliente.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_nacimientoClienteBusqueda= new JButtonMe();
		this.jButtonfecha_nacimientoClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_nacimientoClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_nacimientoClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_nacimientoClienteBusqueda.setText("U");
		this.jButtonfecha_nacimientoClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_nacimientoClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_nacimientoClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_nacimientoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_nacimientoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_nacimientoClienteBusqueda"));

		if(this.clienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_nacimientoClienteBusqueda.setVisible(false);		}


					
		this.jLabelpath_imagen_firmaCliente = new JLabelMe();
		this.jLabelpath_imagen_firmaCliente.setText(""+ClienteConstantesFunciones.LABEL_PATHIMAGENFIRMA+" :");
		this.jLabelpath_imagen_firmaCliente.setToolTipText("Path Imagen Firma");
		this.jLabelpath_imagen_firmaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelpath_imagen_firmaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelpath_imagen_firmaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelpath_imagen_firmaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelpath_imagen_firmaCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelpath_imagen_firmaCliente.setToolTipText(ClienteConstantesFunciones.LABEL_PATHIMAGENFIRMA);
		this.gridaBagLayoutCliente = new GridBagLayout();
		this.jPanelpath_imagen_firmaCliente.setLayout(this.gridaBagLayoutCliente);


		jTextAreapath_imagen_firmaCliente= new JTextAreaMe();
		jTextAreapath_imagen_firmaCliente.setEnabled(false);
		jTextAreapath_imagen_firmaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreapath_imagen_firmaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreapath_imagen_firmaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreapath_imagen_firmaCliente.setLineWrap(true);
		jTextAreapath_imagen_firmaCliente.setWrapStyleWord(true);
		jTextAreapath_imagen_firmaCliente.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreapath_imagen_firmaCliente.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreapath_imagen_firmaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanepath_imagen_firmaCliente = new JScrollPane(jTextAreapath_imagen_firmaCliente);
		jscrollPanepath_imagen_firmaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanepath_imagen_firmaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanepath_imagen_firmaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonpath_imagen_firmaClienteBusqueda= new JButtonMe();
		this.jButtonpath_imagen_firmaClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpath_imagen_firmaClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpath_imagen_firmaClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonpath_imagen_firmaClienteBusqueda.setText("U");
		this.jButtonpath_imagen_firmaClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonpath_imagen_firmaClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonpath_imagen_firmaClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreapath_imagen_firmaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreapath_imagen_firmaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"path_imagen_firmaClienteBusqueda"));

		if(this.clienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonpath_imagen_firmaClienteBusqueda.setVisible(false);		}


					
		this.jLabelcontactoCliente = new JLabelMe();
		this.jLabelcontactoCliente.setText(""+ClienteConstantesFunciones.LABEL_CONTACTO+" :");
		this.jLabelcontactoCliente.setToolTipText("Contacto");
		this.jLabelcontactoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcontactoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcontactoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcontactoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcontactoCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcontactoCliente.setToolTipText(ClienteConstantesFunciones.LABEL_CONTACTO);
		this.gridaBagLayoutCliente = new GridBagLayout();
		this.jPanelcontactoCliente.setLayout(this.gridaBagLayoutCliente);


		jTextAreacontactoCliente= new JTextAreaMe();
		jTextAreacontactoCliente.setEnabled(false);
		jTextAreacontactoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacontactoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacontactoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacontactoCliente.setLineWrap(true);
		jTextAreacontactoCliente.setWrapStyleWord(true);
		jTextAreacontactoCliente.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreacontactoCliente.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreacontactoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanecontactoCliente = new JScrollPane(jTextAreacontactoCliente);
		jscrollPanecontactoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanecontactoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanecontactoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtoncontactoClienteBusqueda= new JButtonMe();
		this.jButtoncontactoClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncontactoClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncontactoClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncontactoClienteBusqueda.setText("U");
		this.jButtoncontactoClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncontactoClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncontactoClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreacontactoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreacontactoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"contactoClienteBusqueda"));

		if(this.clienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncontactoClienteBusqueda.setVisible(false);		}


					
		this.jLabelrepresentanteCliente = new JLabelMe();
		this.jLabelrepresentanteCliente.setText(""+ClienteConstantesFunciones.LABEL_REPRESENTANTE+" :");
		this.jLabelrepresentanteCliente.setToolTipText("Representante");
		this.jLabelrepresentanteCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrepresentanteCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrepresentanteCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelrepresentanteCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelrepresentanteCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelrepresentanteCliente.setToolTipText(ClienteConstantesFunciones.LABEL_REPRESENTANTE);
		this.gridaBagLayoutCliente = new GridBagLayout();
		this.jPanelrepresentanteCliente.setLayout(this.gridaBagLayoutCliente);


		jTextArearepresentanteCliente= new JTextAreaMe();
		jTextArearepresentanteCliente.setEnabled(false);
		jTextArearepresentanteCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextArearepresentanteCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextArearepresentanteCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextArearepresentanteCliente.setLineWrap(true);
		jTextArearepresentanteCliente.setWrapStyleWord(true);
		jTextArearepresentanteCliente.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextArearepresentanteCliente.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextArearepresentanteCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanerepresentanteCliente = new JScrollPane(jTextArearepresentanteCliente);
		jscrollPanerepresentanteCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanerepresentanteCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanerepresentanteCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonrepresentanteClienteBusqueda= new JButtonMe();
		this.jButtonrepresentanteClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrepresentanteClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrepresentanteClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonrepresentanteClienteBusqueda.setText("U");
		this.jButtonrepresentanteClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonrepresentanteClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonrepresentanteClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextArearepresentanteCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextArearepresentanteCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"representanteClienteBusqueda"));

		if(this.clienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonrepresentanteClienteBusqueda.setVisible(false);		}


					
		this.jLabelnombre_garantiaCliente = new JLabelMe();
		this.jLabelnombre_garantiaCliente.setText(""+ClienteConstantesFunciones.LABEL_NOMBREGARANTIA+" :");
		this.jLabelnombre_garantiaCliente.setToolTipText("Nombre Garantia");
		this.jLabelnombre_garantiaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_garantiaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_garantiaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_garantiaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_garantiaCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_garantiaCliente.setToolTipText(ClienteConstantesFunciones.LABEL_NOMBREGARANTIA);
		this.gridaBagLayoutCliente = new GridBagLayout();
		this.jPanelnombre_garantiaCliente.setLayout(this.gridaBagLayoutCliente);


		jTextAreanombre_garantiaCliente= new JTextAreaMe();
		jTextAreanombre_garantiaCliente.setEnabled(false);
		jTextAreanombre_garantiaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_garantiaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_garantiaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_garantiaCliente.setLineWrap(true);
		jTextAreanombre_garantiaCliente.setWrapStyleWord(true);
		jTextAreanombre_garantiaCliente.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_garantiaCliente.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_garantiaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_garantiaCliente = new JScrollPane(jTextAreanombre_garantiaCliente);
		jscrollPanenombre_garantiaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_garantiaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_garantiaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_garantiaClienteBusqueda= new JButtonMe();
		this.jButtonnombre_garantiaClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_garantiaClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_garantiaClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_garantiaClienteBusqueda.setText("U");
		this.jButtonnombre_garantiaClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_garantiaClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_garantiaClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_garantiaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_garantiaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_garantiaClienteBusqueda"));

		if(this.clienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_garantiaClienteBusqueda.setVisible(false);		}


					
		this.jLabelvalor_garantiaCliente = new JLabelMe();
		this.jLabelvalor_garantiaCliente.setText(""+ClienteConstantesFunciones.LABEL_VALORGARANTIA+" : *");
		this.jLabelvalor_garantiaCliente.setToolTipText("Valor Garantia");
		this.jLabelvalor_garantiaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_garantiaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_garantiaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_garantiaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_garantiaCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_garantiaCliente.setToolTipText(ClienteConstantesFunciones.LABEL_VALORGARANTIA);
		this.gridaBagLayoutCliente = new GridBagLayout();
		this.jPanelvalor_garantiaCliente.setLayout(this.gridaBagLayoutCliente);


		jTextFieldvalor_garantiaCliente= new JTextFieldMe();
		jTextFieldvalor_garantiaCliente.setEnabled(false);
		jTextFieldvalor_garantiaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_garantiaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_garantiaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_garantiaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_garantiaCliente.setText("0.0");

		this.jButtonvalor_garantiaClienteBusqueda= new JButtonMe();
		this.jButtonvalor_garantiaClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_garantiaClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_garantiaClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_garantiaClienteBusqueda.setText("U");
		this.jButtonvalor_garantiaClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_garantiaClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_garantiaClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_garantiaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_garantiaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_garantiaClienteBusqueda"));

		if(this.clienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_garantiaClienteBusqueda.setVisible(false);		}


					
		this.jLabelnumero_cargaCliente = new JLabelMe();
		this.jLabelnumero_cargaCliente.setText(""+ClienteConstantesFunciones.LABEL_NUMEROCARGA+" : *");
		this.jLabelnumero_cargaCliente.setToolTipText("Numero Carga");
		this.jLabelnumero_cargaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_cargaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_cargaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_cargaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_cargaCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_cargaCliente.setToolTipText(ClienteConstantesFunciones.LABEL_NUMEROCARGA);
		this.gridaBagLayoutCliente = new GridBagLayout();
		this.jPanelnumero_cargaCliente.setLayout(this.gridaBagLayoutCliente);


		jTextFieldnumero_cargaCliente= new JTextFieldMe();
		jTextFieldnumero_cargaCliente.setEnabled(false);
		jTextFieldnumero_cargaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_cargaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_cargaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_cargaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_cargaCliente.setText("0");

		this.jButtonnumero_cargaClienteBusqueda= new JButtonMe();
		this.jButtonnumero_cargaClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_cargaClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_cargaClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_cargaClienteBusqueda.setText("U");
		this.jButtonnumero_cargaClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_cargaClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_cargaClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_cargaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_cargaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_cargaClienteBusqueda"));

		if(this.clienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_cargaClienteBusqueda.setVisible(false);		}


					
		this.jLabelcredito_usadoCliente = new JLabelMe();
		this.jLabelcredito_usadoCliente.setText(""+ClienteConstantesFunciones.LABEL_CREDITOUSADO+" : *");
		this.jLabelcredito_usadoCliente.setToolTipText("Credito Usado");
		this.jLabelcredito_usadoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcredito_usadoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcredito_usadoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcredito_usadoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcredito_usadoCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcredito_usadoCliente.setToolTipText(ClienteConstantesFunciones.LABEL_CREDITOUSADO);
		this.gridaBagLayoutCliente = new GridBagLayout();
		this.jPanelcredito_usadoCliente.setLayout(this.gridaBagLayoutCliente);


		jTextFieldcredito_usadoCliente= new JTextFieldMe();
		jTextFieldcredito_usadoCliente.setEnabled(false);
		jTextFieldcredito_usadoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcredito_usadoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcredito_usadoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcredito_usadoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcredito_usadoCliente.setText("0.0");

		this.jButtoncredito_usadoClienteBusqueda= new JButtonMe();
		this.jButtoncredito_usadoClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncredito_usadoClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncredito_usadoClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncredito_usadoClienteBusqueda.setText("U");
		this.jButtoncredito_usadoClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncredito_usadoClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncredito_usadoClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcredito_usadoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcredito_usadoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"credito_usadoClienteBusqueda"));

		if(this.clienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncredito_usadoClienteBusqueda.setVisible(false);		}


					
		this.jLabellimite_creditoCliente = new JLabelMe();
		this.jLabellimite_creditoCliente.setText(""+ClienteConstantesFunciones.LABEL_LIMITECREDITO+" : *");
		this.jLabellimite_creditoCliente.setToolTipText("Limite Credito");
		this.jLabellimite_creditoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabellimite_creditoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabellimite_creditoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabellimite_creditoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanellimite_creditoCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanellimite_creditoCliente.setToolTipText(ClienteConstantesFunciones.LABEL_LIMITECREDITO);
		this.gridaBagLayoutCliente = new GridBagLayout();
		this.jPanellimite_creditoCliente.setLayout(this.gridaBagLayoutCliente);


		jTextFieldlimite_creditoCliente= new JTextFieldMe();
		jTextFieldlimite_creditoCliente.setEnabled(false);
		jTextFieldlimite_creditoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldlimite_creditoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldlimite_creditoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldlimite_creditoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldlimite_creditoCliente.setText("0.0");

		this.jButtonlimite_creditoClienteBusqueda= new JButtonMe();
		this.jButtonlimite_creditoClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonlimite_creditoClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonlimite_creditoClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonlimite_creditoClienteBusqueda.setText("U");
		this.jButtonlimite_creditoClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonlimite_creditoClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonlimite_creditoClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldlimite_creditoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldlimite_creditoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"limite_creditoClienteBusqueda"));

		if(this.clienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonlimite_creditoClienteBusqueda.setVisible(false);		}


					
		this.jLabelcredito_disponibleCliente = new JLabelMe();
		this.jLabelcredito_disponibleCliente.setText(""+ClienteConstantesFunciones.LABEL_CREDITODISPONIBLE+" : *");
		this.jLabelcredito_disponibleCliente.setToolTipText("Credito Disponible");
		this.jLabelcredito_disponibleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcredito_disponibleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcredito_disponibleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcredito_disponibleCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcredito_disponibleCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcredito_disponibleCliente.setToolTipText(ClienteConstantesFunciones.LABEL_CREDITODISPONIBLE);
		this.gridaBagLayoutCliente = new GridBagLayout();
		this.jPanelcredito_disponibleCliente.setLayout(this.gridaBagLayoutCliente);


		jTextFieldcredito_disponibleCliente= new JTextFieldMe();
		jTextFieldcredito_disponibleCliente.setEnabled(false);
		jTextFieldcredito_disponibleCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcredito_disponibleCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcredito_disponibleCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcredito_disponibleCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcredito_disponibleCliente.setText("0.0");

		this.jButtoncredito_disponibleClienteBusqueda= new JButtonMe();
		this.jButtoncredito_disponibleClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncredito_disponibleClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncredito_disponibleClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncredito_disponibleClienteBusqueda.setText("U");
		this.jButtoncredito_disponibleClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncredito_disponibleClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncredito_disponibleClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcredito_disponibleCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcredito_disponibleCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"credito_disponibleClienteBusqueda"));

		if(this.clienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncredito_disponibleClienteBusqueda.setVisible(false);		}


					
		this.jLabeltotal_documentosCliente = new JLabelMe();
		this.jLabeltotal_documentosCliente.setText(""+ClienteConstantesFunciones.LABEL_TOTALDOCUMENTOS+" : *");
		this.jLabeltotal_documentosCliente.setToolTipText("Total Documentos");
		this.jLabeltotal_documentosCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltotal_documentosCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltotal_documentosCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_documentosCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_documentosCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_documentosCliente.setToolTipText(ClienteConstantesFunciones.LABEL_TOTALDOCUMENTOS);
		this.gridaBagLayoutCliente = new GridBagLayout();
		this.jPaneltotal_documentosCliente.setLayout(this.gridaBagLayoutCliente);


		jTextFieldtotal_documentosCliente= new JTextFieldMe();
		jTextFieldtotal_documentosCliente.setEnabled(false);
		jTextFieldtotal_documentosCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_documentosCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_documentosCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_documentosCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_documentosCliente.setText("0.0");

		this.jButtontotal_documentosClienteBusqueda= new JButtonMe();
		this.jButtontotal_documentosClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_documentosClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_documentosClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_documentosClienteBusqueda.setText("U");
		this.jButtontotal_documentosClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_documentosClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_documentosClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_documentosCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_documentosCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_documentosClienteBusqueda"));

		if(this.clienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_documentosClienteBusqueda.setVisible(false);		}


					
		this.jLabelfecha_ultima_facturaCliente = new JLabelMe();
		this.jLabelfecha_ultima_facturaCliente.setText(""+ClienteConstantesFunciones.LABEL_FECHAULTIMAFACTURA+" : *");
		this.jLabelfecha_ultima_facturaCliente.setToolTipText("Fecha Ultima Factura");
		this.jLabelfecha_ultima_facturaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelfecha_ultima_facturaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelfecha_ultima_facturaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_ultima_facturaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_ultima_facturaCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_ultima_facturaCliente.setToolTipText(ClienteConstantesFunciones.LABEL_FECHAULTIMAFACTURA);
		this.gridaBagLayoutCliente = new GridBagLayout();
		this.jPanelfecha_ultima_facturaCliente.setLayout(this.gridaBagLayoutCliente);


		//jFormattedTextFieldfecha_ultima_facturaCliente= new JFormattedTextFieldMe();

		jDateChooserfecha_ultima_facturaCliente= new JDateChooser();
		jDateChooserfecha_ultima_facturaCliente.setEnabled(false);
		jDateChooserfecha_ultima_facturaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ultima_facturaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ultima_facturaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_ultima_facturaCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_ultima_facturaCliente.setDate(new Date());
		jDateChooserfecha_ultima_facturaCliente.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_ultima_facturaCliente.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_ultima_facturaClienteBusqueda= new JButtonMe();
		this.jButtonfecha_ultima_facturaClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ultima_facturaClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ultima_facturaClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_ultima_facturaClienteBusqueda.setText("U");
		this.jButtonfecha_ultima_facturaClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_ultima_facturaClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_ultima_facturaClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_ultima_facturaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_ultima_facturaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_ultima_facturaClienteBusqueda"));

		if(this.clienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_ultima_facturaClienteBusqueda.setVisible(false);		}


					
		this.jLabeldescuentoCliente = new JLabelMe();
		this.jLabeldescuentoCliente.setText(""+ClienteConstantesFunciones.LABEL_DESCUENTO+" : *");
		this.jLabeldescuentoCliente.setToolTipText("Descuento");
		this.jLabeldescuentoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuentoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuentoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuentoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuentoCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuentoCliente.setToolTipText(ClienteConstantesFunciones.LABEL_DESCUENTO);
		this.gridaBagLayoutCliente = new GridBagLayout();
		this.jPaneldescuentoCliente.setLayout(this.gridaBagLayoutCliente);


		jTextFielddescuentoCliente= new JTextFieldMe();
		jTextFielddescuentoCliente.setEnabled(false);
		jTextFielddescuentoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuentoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuentoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuentoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuentoCliente.setText("0.0");

		this.jButtondescuentoClienteBusqueda= new JButtonMe();
		this.jButtondescuentoClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuentoClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuentoClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuentoClienteBusqueda.setText("U");
		this.jButtondescuentoClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuentoClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuentoClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuentoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuentoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuentoClienteBusqueda"));

		if(this.clienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuentoClienteBusqueda.setVisible(false);		}


					
		this.jLabelhora_pagoCliente = new JLabelMe();
		this.jLabelhora_pagoCliente.setText(""+ClienteConstantesFunciones.LABEL_HORAPAGO+" :");
		this.jLabelhora_pagoCliente.setToolTipText("Hora Pago");
		this.jLabelhora_pagoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhora_pagoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhora_pagoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelhora_pagoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelhora_pagoCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelhora_pagoCliente.setToolTipText(ClienteConstantesFunciones.LABEL_HORAPAGO);
		this.gridaBagLayoutCliente = new GridBagLayout();
		this.jPanelhora_pagoCliente.setLayout(this.gridaBagLayoutCliente);


		//jFormattedTextFieldhora_pagoCliente= new JFormattedTextFieldMe();

		jSpinnerhora_pagoCliente= new JSpinner(new SpinnerDateModel());;
		jSpinnerhora_pagoCliente.setEnabled(false);
		JSpinner.DateEditor timeEditorhora_pagoCliente = new JSpinner.DateEditor(jSpinnerhora_pagoCliente, "HH:mm:ss");

		jSpinnerhora_pagoCliente.setEditor(timeEditorhora_pagoCliente);

		jSpinnerhora_pagoCliente.setValue(new Date());

		jSpinnerhora_pagoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhora_pagoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhora_pagoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldHora(jSpinnerhora_pagoCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		jSpinnerhora_pagoCliente.setValue(new Date());
		//jSpinnerhora_pagoCliente.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldhora_pagoCliente.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonhora_pagoClienteBusqueda= new JButtonMe();
		this.jButtonhora_pagoClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhora_pagoClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhora_pagoClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonhora_pagoClienteBusqueda.setText("U");
		this.jButtonhora_pagoClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonhora_pagoClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonhora_pagoClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jSpinnerhora_pagoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jSpinnerhora_pagoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"hora_pagoClienteBusqueda"));

		if(this.clienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonhora_pagoClienteBusqueda.setVisible(false);		}


					
		this.jLabelcobranzasCliente = new JLabelMe();
		this.jLabelcobranzasCliente.setText(""+ClienteConstantesFunciones.LABEL_COBRANZAS+" :");
		this.jLabelcobranzasCliente.setToolTipText("Cobranzas");
		this.jLabelcobranzasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcobranzasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcobranzasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcobranzasCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcobranzasCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcobranzasCliente.setToolTipText(ClienteConstantesFunciones.LABEL_COBRANZAS);
		this.gridaBagLayoutCliente = new GridBagLayout();
		this.jPanelcobranzasCliente.setLayout(this.gridaBagLayoutCliente);


		jTextAreacobranzasCliente= new JTextAreaMe();
		jTextAreacobranzasCliente.setEnabled(false);
		jTextAreacobranzasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacobranzasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacobranzasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacobranzasCliente.setLineWrap(true);
		jTextAreacobranzasCliente.setWrapStyleWord(true);
		jTextAreacobranzasCliente.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreacobranzasCliente.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreacobranzasCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanecobranzasCliente = new JScrollPane(jTextAreacobranzasCliente);
		jscrollPanecobranzasCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanecobranzasCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanecobranzasCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtoncobranzasClienteBusqueda= new JButtonMe();
		this.jButtoncobranzasClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncobranzasClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncobranzasClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncobranzasClienteBusqueda.setText("U");
		this.jButtoncobranzasClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncobranzasClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncobranzasClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreacobranzasCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreacobranzasCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cobranzasClienteBusqueda"));

		if(this.clienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncobranzasClienteBusqueda.setVisible(false);		}


					
		this.jLabelmotivoCliente = new JLabelMe();
		this.jLabelmotivoCliente.setText(""+ClienteConstantesFunciones.LABEL_MOTIVO+" :");
		this.jLabelmotivoCliente.setToolTipText("Motivo");
		this.jLabelmotivoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmotivoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmotivoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelmotivoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmotivoCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmotivoCliente.setToolTipText(ClienteConstantesFunciones.LABEL_MOTIVO);
		this.gridaBagLayoutCliente = new GridBagLayout();
		this.jPanelmotivoCliente.setLayout(this.gridaBagLayoutCliente);


		jTextAreamotivoCliente= new JTextAreaMe();
		jTextAreamotivoCliente.setEnabled(false);
		jTextAreamotivoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreamotivoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreamotivoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreamotivoCliente.setLineWrap(true);
		jTextAreamotivoCliente.setWrapStyleWord(true);
		jTextAreamotivoCliente.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreamotivoCliente.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreamotivoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanemotivoCliente = new JScrollPane(jTextAreamotivoCliente);
		jscrollPanemotivoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanemotivoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanemotivoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonmotivoClienteBusqueda= new JButtonMe();
		this.jButtonmotivoClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmotivoClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmotivoClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmotivoClienteBusqueda.setText("U");
		this.jButtonmotivoClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmotivoClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmotivoClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreamotivoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreamotivoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"motivoClienteBusqueda"));

		if(this.clienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmotivoClienteBusqueda.setVisible(false);		}


					
		this.jLabelpreferenciaCliente = new JLabelMe();
		this.jLabelpreferenciaCliente.setText(""+ClienteConstantesFunciones.LABEL_PREFERENCIA+" :");
		this.jLabelpreferenciaCliente.setToolTipText("Preferencia");
		this.jLabelpreferenciaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelpreferenciaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelpreferenciaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelpreferenciaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelpreferenciaCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelpreferenciaCliente.setToolTipText(ClienteConstantesFunciones.LABEL_PREFERENCIA);
		this.gridaBagLayoutCliente = new GridBagLayout();
		this.jPanelpreferenciaCliente.setLayout(this.gridaBagLayoutCliente);


		jTextAreapreferenciaCliente= new JTextAreaMe();
		jTextAreapreferenciaCliente.setEnabled(false);
		jTextAreapreferenciaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreapreferenciaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreapreferenciaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreapreferenciaCliente.setLineWrap(true);
		jTextAreapreferenciaCliente.setWrapStyleWord(true);
		jTextAreapreferenciaCliente.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreapreferenciaCliente.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreapreferenciaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanepreferenciaCliente = new JScrollPane(jTextAreapreferenciaCliente);
		jscrollPanepreferenciaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanepreferenciaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanepreferenciaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonpreferenciaClienteBusqueda= new JButtonMe();
		this.jButtonpreferenciaClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpreferenciaClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpreferenciaClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonpreferenciaClienteBusqueda.setText("U");
		this.jButtonpreferenciaClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonpreferenciaClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonpreferenciaClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreapreferenciaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreapreferenciaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"preferenciaClienteBusqueda"));

		if(this.clienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonpreferenciaClienteBusqueda.setVisible(false);		}


					
		this.jLabelcon_separacion_bienesCliente = new JLabelMe();
		this.jLabelcon_separacion_bienesCliente.setText(""+ClienteConstantesFunciones.LABEL_CONSEPARACIONBIENES+" : *");
		this.jLabelcon_separacion_bienesCliente.setToolTipText("Con Separacion Bienes");
		this.jLabelcon_separacion_bienesCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcon_separacion_bienesCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcon_separacion_bienesCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_separacion_bienesCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_separacion_bienesCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_separacion_bienesCliente.setToolTipText(ClienteConstantesFunciones.LABEL_CONSEPARACIONBIENES);
		this.gridaBagLayoutCliente = new GridBagLayout();
		this.jPanelcon_separacion_bienesCliente.setLayout(this.gridaBagLayoutCliente);


		jCheckBoxcon_separacion_bienesCliente= new JCheckBoxMe();
		jCheckBoxcon_separacion_bienesCliente.setEnabled(false);

		jCheckBoxcon_separacion_bienesCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_separacion_bienesCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_separacion_bienesCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_separacion_bienesCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_separacion_bienesClienteBusqueda= new JButtonMe();
		this.jButtoncon_separacion_bienesClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_separacion_bienesClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_separacion_bienesClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_separacion_bienesClienteBusqueda.setText("U");
		this.jButtoncon_separacion_bienesClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_separacion_bienesClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_separacion_bienesClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_separacion_bienesCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_separacion_bienesCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_separacion_bienesClienteBusqueda"));

		if(this.clienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_separacion_bienesClienteBusqueda.setVisible(false);		}


					
		this.jLabeldetalle_estadoCliente = new JLabelMe();
		this.jLabeldetalle_estadoCliente.setText(""+ClienteConstantesFunciones.LABEL_DETALLEESTADO+" :");
		this.jLabeldetalle_estadoCliente.setToolTipText("Detalle Estado");
		this.jLabeldetalle_estadoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldetalle_estadoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldetalle_estadoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldetalle_estadoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldetalle_estadoCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldetalle_estadoCliente.setToolTipText(ClienteConstantesFunciones.LABEL_DETALLEESTADO);
		this.gridaBagLayoutCliente = new GridBagLayout();
		this.jPaneldetalle_estadoCliente.setLayout(this.gridaBagLayoutCliente);


		jTextAreadetalle_estadoCliente= new JTextAreaMe();
		jTextAreadetalle_estadoCliente.setEnabled(false);
		jTextAreadetalle_estadoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadetalle_estadoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadetalle_estadoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadetalle_estadoCliente.setLineWrap(true);
		jTextAreadetalle_estadoCliente.setWrapStyleWord(true);
		jTextAreadetalle_estadoCliente.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadetalle_estadoCliente.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadetalle_estadoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedetalle_estadoCliente = new JScrollPane(jTextAreadetalle_estadoCliente);
		jscrollPanedetalle_estadoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedetalle_estadoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedetalle_estadoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondetalle_estadoClienteBusqueda= new JButtonMe();
		this.jButtondetalle_estadoClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondetalle_estadoClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondetalle_estadoClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondetalle_estadoClienteBusqueda.setText("U");
		this.jButtondetalle_estadoClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondetalle_estadoClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondetalle_estadoClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadetalle_estadoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadetalle_estadoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"detalle_estadoClienteBusqueda"));

		if(this.clienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondetalle_estadoClienteBusqueda.setVisible(false);		}


					
		this.jLabeles_contribuyente_especialCliente = new JLabelMe();
		this.jLabeles_contribuyente_especialCliente.setText(""+ClienteConstantesFunciones.LABEL_ESCONTRIBUYENTEESPECIAL+" : *");
		this.jLabeles_contribuyente_especialCliente.setToolTipText("Es Contribuyente Especial");
		this.jLabeles_contribuyente_especialCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabeles_contribuyente_especialCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabeles_contribuyente_especialCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabeles_contribuyente_especialCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_contribuyente_especialCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_contribuyente_especialCliente.setToolTipText(ClienteConstantesFunciones.LABEL_ESCONTRIBUYENTEESPECIAL);
		this.gridaBagLayoutCliente = new GridBagLayout();
		this.jPaneles_contribuyente_especialCliente.setLayout(this.gridaBagLayoutCliente);


		jCheckBoxes_contribuyente_especialCliente= new JCheckBoxMe();
		jCheckBoxes_contribuyente_especialCliente.setEnabled(false);

		jCheckBoxes_contribuyente_especialCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_contribuyente_especialCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_contribuyente_especialCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_contribuyente_especialCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_contribuyente_especialClienteBusqueda= new JButtonMe();
		this.jButtones_contribuyente_especialClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_contribuyente_especialClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_contribuyente_especialClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_contribuyente_especialClienteBusqueda.setText("U");
		this.jButtones_contribuyente_especialClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_contribuyente_especialClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_contribuyente_especialClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_contribuyente_especialCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_contribuyente_especialCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_contribuyente_especialClienteBusqueda"));

		if(this.clienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_contribuyente_especialClienteBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysCliente() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaCliente = new JLabelMe();
		this.jLabelid_empresaCliente.setText(""+ClienteConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaCliente.setToolTipText("Empresa");
		this.jLabelid_empresaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaCliente.setToolTipText(ClienteConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutCliente = new GridBagLayout();
		this.jPanelid_empresaCliente.setLayout(this.gridaBagLayoutCliente);


		jComboBoxid_empresaCliente= new JComboBoxMe();
		jComboBoxid_empresaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaCliente.setEnabled(false);

		this.jButtonid_empresaCliente= new JButtonMe();
		this.jButtonid_empresaCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCliente.setText("Buscar");
		this.jButtonid_empresaCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCliente"));

		this.jButtonid_empresaClienteBusqueda= new JButtonMe();
		this.jButtonid_empresaClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaClienteBusqueda.setText("U");
		this.jButtonid_empresaClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaClienteBusqueda"));

		if(this.clienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaClienteBusqueda.setVisible(false);		}

		this.jButtonid_empresaClienteUpdate= new JButtonMe();
		this.jButtonid_empresaClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaClienteUpdate.setText("U");
		this.jButtonid_empresaClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaClienteUpdate"));



					
		this.jLabelid_sucursalCliente = new JLabelMe();
		this.jLabelid_sucursalCliente.setText(""+ClienteConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalCliente.setToolTipText("Sucursal");
		this.jLabelid_sucursalCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalCliente.setToolTipText(ClienteConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutCliente = new GridBagLayout();
		this.jPanelid_sucursalCliente.setLayout(this.gridaBagLayoutCliente);


		jComboBoxid_sucursalCliente= new JComboBoxMe();
		jComboBoxid_sucursalCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalCliente.setEnabled(false);

		this.jButtonid_sucursalCliente= new JButtonMe();
		this.jButtonid_sucursalCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalCliente.setText("Buscar");
		this.jButtonid_sucursalCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalCliente"));

		this.jButtonid_sucursalClienteBusqueda= new JButtonMe();
		this.jButtonid_sucursalClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalClienteBusqueda.setText("U");
		this.jButtonid_sucursalClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalClienteBusqueda"));

		if(this.clienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalClienteBusqueda.setVisible(false);		}

		this.jButtonid_sucursalClienteUpdate= new JButtonMe();
		this.jButtonid_sucursalClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalClienteUpdate.setText("U");
		this.jButtonid_sucursalClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalClienteUpdate"));



					
		this.jLabelid_tipo_identificacionCliente = new JLabelMe();
		this.jLabelid_tipo_identificacionCliente.setText(""+ClienteConstantesFunciones.LABEL_IDTIPOIDENTIFICACION+" : *");
		this.jLabelid_tipo_identificacionCliente.setToolTipText("Tipo Identificacion");
		this.jLabelid_tipo_identificacionCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_identificacionCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_identificacionCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_identificacionCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_identificacionCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_identificacionCliente.setToolTipText(ClienteConstantesFunciones.LABEL_IDTIPOIDENTIFICACION);
		this.gridaBagLayoutCliente = new GridBagLayout();
		this.jPanelid_tipo_identificacionCliente.setLayout(this.gridaBagLayoutCliente);


		jComboBoxid_tipo_identificacionCliente= new JComboBoxMe();
		jComboBoxid_tipo_identificacionCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_identificacionCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_identificacionCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_identificacionCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_identificacionCliente= new JButtonMe();
		this.jButtonid_tipo_identificacionCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_identificacionCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_identificacionCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_identificacionCliente.setText("Buscar");
		this.jButtonid_tipo_identificacionCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_identificacionCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_identificacionCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_identificacionCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_identificacionCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_identificacionCliente"));

		this.jButtonid_tipo_identificacionClienteBusqueda= new JButtonMe();
		this.jButtonid_tipo_identificacionClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_identificacionClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_identificacionClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_identificacionClienteBusqueda.setText("U");
		this.jButtonid_tipo_identificacionClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_identificacionClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_identificacionClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_identificacionCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_identificacionCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_identificacionClienteBusqueda"));

		if(this.clienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_identificacionClienteBusqueda.setVisible(false);		}

		this.jButtonid_tipo_identificacionClienteUpdate= new JButtonMe();
		this.jButtonid_tipo_identificacionClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_identificacionClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_identificacionClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_identificacionClienteUpdate.setText("U");
		this.jButtonid_tipo_identificacionClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_identificacionClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_identificacionClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_identificacionCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_identificacionCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_identificacionClienteUpdate"));



					
		this.jLabelid_grupo_clienteCliente = new JLabelMe();
		this.jLabelid_grupo_clienteCliente.setText(""+ClienteConstantesFunciones.LABEL_IDGRUPOCLIENTE+" : *");
		this.jLabelid_grupo_clienteCliente.setToolTipText("Grupo Cliente");
		this.jLabelid_grupo_clienteCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_grupo_clienteCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_grupo_clienteCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_grupo_clienteCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_grupo_clienteCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_grupo_clienteCliente.setToolTipText(ClienteConstantesFunciones.LABEL_IDGRUPOCLIENTE);
		this.gridaBagLayoutCliente = new GridBagLayout();
		this.jPanelid_grupo_clienteCliente.setLayout(this.gridaBagLayoutCliente);


		jComboBoxid_grupo_clienteCliente= new JComboBoxMe();
		jComboBoxid_grupo_clienteCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_clienteCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_clienteCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_grupo_clienteCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_grupo_clienteCliente= new JButtonMe();
		this.jButtonid_grupo_clienteCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_grupo_clienteCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_grupo_clienteCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_grupo_clienteCliente.setText("Buscar");
		this.jButtonid_grupo_clienteCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_grupo_clienteCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_grupo_clienteCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_grupo_clienteCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_grupo_clienteCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_grupo_clienteCliente"));

		this.jButtonid_grupo_clienteClienteBusqueda= new JButtonMe();
		this.jButtonid_grupo_clienteClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_grupo_clienteClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_grupo_clienteClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_grupo_clienteClienteBusqueda.setText("U");
		this.jButtonid_grupo_clienteClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_grupo_clienteClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_grupo_clienteClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_grupo_clienteCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_grupo_clienteCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_grupo_clienteClienteBusqueda"));

		if(this.clienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_grupo_clienteClienteBusqueda.setVisible(false);		}

		this.jButtonid_grupo_clienteClienteUpdate= new JButtonMe();
		this.jButtonid_grupo_clienteClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_grupo_clienteClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_grupo_clienteClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_grupo_clienteClienteUpdate.setText("U");
		this.jButtonid_grupo_clienteClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_grupo_clienteClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_grupo_clienteClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_grupo_clienteCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_grupo_clienteCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_grupo_clienteClienteUpdate"));



					
		this.jLabelid_titulo_clienteCliente = new JLabelMe();
		this.jLabelid_titulo_clienteCliente.setText(""+ClienteConstantesFunciones.LABEL_IDTITULOCLIENTE+" : *");
		this.jLabelid_titulo_clienteCliente.setToolTipText("Titulo Cliente");
		this.jLabelid_titulo_clienteCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_titulo_clienteCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_titulo_clienteCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_titulo_clienteCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_titulo_clienteCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_titulo_clienteCliente.setToolTipText(ClienteConstantesFunciones.LABEL_IDTITULOCLIENTE);
		this.gridaBagLayoutCliente = new GridBagLayout();
		this.jPanelid_titulo_clienteCliente.setLayout(this.gridaBagLayoutCliente);


		jComboBoxid_titulo_clienteCliente= new JComboBoxMe();
		jComboBoxid_titulo_clienteCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_titulo_clienteCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_titulo_clienteCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_titulo_clienteCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_titulo_clienteCliente= new JButtonMe();
		this.jButtonid_titulo_clienteCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_titulo_clienteCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_titulo_clienteCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_titulo_clienteCliente.setText("Buscar");
		this.jButtonid_titulo_clienteCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_titulo_clienteCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_titulo_clienteCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_titulo_clienteCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_titulo_clienteCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_titulo_clienteCliente"));

		this.jButtonid_titulo_clienteClienteBusqueda= new JButtonMe();
		this.jButtonid_titulo_clienteClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_titulo_clienteClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_titulo_clienteClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_titulo_clienteClienteBusqueda.setText("U");
		this.jButtonid_titulo_clienteClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_titulo_clienteClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_titulo_clienteClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_titulo_clienteCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_titulo_clienteCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_titulo_clienteClienteBusqueda"));

		if(this.clienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_titulo_clienteClienteBusqueda.setVisible(false);		}

		this.jButtonid_titulo_clienteClienteUpdate= new JButtonMe();
		this.jButtonid_titulo_clienteClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_titulo_clienteClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_titulo_clienteClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_titulo_clienteClienteUpdate.setText("U");
		this.jButtonid_titulo_clienteClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_titulo_clienteClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_titulo_clienteClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_titulo_clienteCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_titulo_clienteCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_titulo_clienteClienteUpdate"));



					
		this.jLabelid_area_crCliente = new JLabelMe();
		this.jLabelid_area_crCliente.setText(""+ClienteConstantesFunciones.LABEL_IDAREACR+" : *");
		this.jLabelid_area_crCliente.setToolTipText("Area");
		this.jLabelid_area_crCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_area_crCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_area_crCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_area_crCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_area_crCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_area_crCliente.setToolTipText(ClienteConstantesFunciones.LABEL_IDAREACR);
		this.gridaBagLayoutCliente = new GridBagLayout();
		this.jPanelid_area_crCliente.setLayout(this.gridaBagLayoutCliente);


		jComboBoxid_area_crCliente= new JComboBoxMe();
		jComboBoxid_area_crCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_area_crCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_area_crCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_area_crCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_area_crCliente= new JButtonMe();
		this.jButtonid_area_crCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_area_crCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_area_crCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_area_crCliente.setText("Buscar");
		this.jButtonid_area_crCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_area_crCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_area_crCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_area_crCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_area_crCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_area_crCliente"));

		this.jButtonid_area_crClienteBusqueda= new JButtonMe();
		this.jButtonid_area_crClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_area_crClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_area_crClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_area_crClienteBusqueda.setText("U");
		this.jButtonid_area_crClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_area_crClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_area_crClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_area_crCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_area_crCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_area_crClienteBusqueda"));

		if(this.clienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_area_crClienteBusqueda.setVisible(false);		}

		this.jButtonid_area_crClienteUpdate= new JButtonMe();
		this.jButtonid_area_crClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_area_crClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_area_crClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_area_crClienteUpdate.setText("U");
		this.jButtonid_area_crClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_area_crClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_area_crClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_area_crCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_area_crCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_area_crClienteUpdate"));



					
		this.jLabelid_estado_clienteCliente = new JLabelMe();
		this.jLabelid_estado_clienteCliente.setText(""+ClienteConstantesFunciones.LABEL_IDESTADOCLIENTE+" : *");
		this.jLabelid_estado_clienteCliente.setToolTipText("Estado Cliente");
		this.jLabelid_estado_clienteCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_clienteCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_clienteCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_clienteCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_clienteCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_clienteCliente.setToolTipText(ClienteConstantesFunciones.LABEL_IDESTADOCLIENTE);
		this.gridaBagLayoutCliente = new GridBagLayout();
		this.jPanelid_estado_clienteCliente.setLayout(this.gridaBagLayoutCliente);


		jComboBoxid_estado_clienteCliente= new JComboBoxMe();
		jComboBoxid_estado_clienteCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_clienteCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_clienteCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_clienteCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estado_clienteCliente= new JButtonMe();
		this.jButtonid_estado_clienteCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_clienteCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_clienteCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_clienteCliente.setText("Buscar");
		this.jButtonid_estado_clienteCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_clienteCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_clienteCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_clienteCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_clienteCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_clienteCliente"));

		this.jButtonid_estado_clienteClienteBusqueda= new JButtonMe();
		this.jButtonid_estado_clienteClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_clienteClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_clienteClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_clienteClienteBusqueda.setText("U");
		this.jButtonid_estado_clienteClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_clienteClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_clienteClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_clienteCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_clienteCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_clienteClienteBusqueda"));

		if(this.clienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_clienteClienteBusqueda.setVisible(false);		}

		this.jButtonid_estado_clienteClienteUpdate= new JButtonMe();
		this.jButtonid_estado_clienteClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_clienteClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_clienteClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_clienteClienteUpdate.setText("U");
		this.jButtonid_estado_clienteClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_clienteClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_clienteClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_clienteCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_clienteCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_clienteClienteUpdate"));



					
		this.jLabelid_paisCliente = new JLabelMe();
		this.jLabelid_paisCliente.setText(""+ClienteConstantesFunciones.LABEL_IDPAIS+" : *");
		this.jLabelid_paisCliente.setToolTipText("Pais");
		this.jLabelid_paisCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_paisCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_paisCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_paisCliente.setToolTipText(ClienteConstantesFunciones.LABEL_IDPAIS);
		this.gridaBagLayoutCliente = new GridBagLayout();
		this.jPanelid_paisCliente.setLayout(this.gridaBagLayoutCliente);


		jComboBoxid_paisCliente= new JComboBoxMe();
		jComboBoxid_paisCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_paisCliente= new JButtonMe();
		this.jButtonid_paisCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisCliente.setText("Buscar");
		this.jButtonid_paisCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_paisCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_paisCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisCliente"));

		this.jButtonid_paisClienteBusqueda= new JButtonMe();
		this.jButtonid_paisClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisClienteBusqueda.setText("U");
		this.jButtonid_paisClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_paisClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_paisCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisClienteBusqueda"));

		if(this.clienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_paisClienteBusqueda.setVisible(false);		}

		this.jButtonid_paisClienteUpdate= new JButtonMe();
		this.jButtonid_paisClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisClienteUpdate.setText("U");
		this.jButtonid_paisClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_paisClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_paisCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisClienteUpdate"));



					
		this.jLabelid_regionCliente = new JLabelMe();
		this.jLabelid_regionCliente.setText(""+ClienteConstantesFunciones.LABEL_IDREGION+" : *");
		this.jLabelid_regionCliente.setToolTipText("Region");
		this.jLabelid_regionCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_regionCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_regionCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_regionCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_regionCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_regionCliente.setToolTipText(ClienteConstantesFunciones.LABEL_IDREGION);
		this.gridaBagLayoutCliente = new GridBagLayout();
		this.jPanelid_regionCliente.setLayout(this.gridaBagLayoutCliente);


		jComboBoxid_regionCliente= new JComboBoxMe();
		jComboBoxid_regionCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_regionCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_regionCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_regionCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_regionCliente= new JButtonMe();
		this.jButtonid_regionCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_regionCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_regionCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_regionCliente.setText("Buscar");
		this.jButtonid_regionCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_regionCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_regionCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_regionCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_regionCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_regionCliente"));

		this.jButtonid_regionClienteBusqueda= new JButtonMe();
		this.jButtonid_regionClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_regionClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_regionClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_regionClienteBusqueda.setText("U");
		this.jButtonid_regionClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_regionClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_regionClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_regionCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_regionCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_regionClienteBusqueda"));

		if(this.clienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_regionClienteBusqueda.setVisible(false);		}

		this.jButtonid_regionClienteUpdate= new JButtonMe();
		this.jButtonid_regionClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_regionClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_regionClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_regionClienteUpdate.setText("U");
		this.jButtonid_regionClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_regionClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_regionClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_regionCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_regionCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_regionClienteUpdate"));



					
		this.jLabelid_provinciaCliente = new JLabelMe();
		this.jLabelid_provinciaCliente.setText(""+ClienteConstantesFunciones.LABEL_IDPROVINCIA+" : *");
		this.jLabelid_provinciaCliente.setToolTipText("Provincia");
		this.jLabelid_provinciaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_provinciaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_provinciaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_provinciaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_provinciaCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_provinciaCliente.setToolTipText(ClienteConstantesFunciones.LABEL_IDPROVINCIA);
		this.gridaBagLayoutCliente = new GridBagLayout();
		this.jPanelid_provinciaCliente.setLayout(this.gridaBagLayoutCliente);


		jComboBoxid_provinciaCliente= new JComboBoxMe();
		jComboBoxid_provinciaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_provinciaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_provinciaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_provinciaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_provinciaCliente= new JButtonMe();
		this.jButtonid_provinciaCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_provinciaCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_provinciaCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_provinciaCliente.setText("Buscar");
		this.jButtonid_provinciaCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_provinciaCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_provinciaCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_provinciaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_provinciaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_provinciaCliente"));

		this.jButtonid_provinciaClienteBusqueda= new JButtonMe();
		this.jButtonid_provinciaClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_provinciaClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_provinciaClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_provinciaClienteBusqueda.setText("U");
		this.jButtonid_provinciaClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_provinciaClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_provinciaClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_provinciaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_provinciaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_provinciaClienteBusqueda"));

		if(this.clienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_provinciaClienteBusqueda.setVisible(false);		}

		this.jButtonid_provinciaClienteUpdate= new JButtonMe();
		this.jButtonid_provinciaClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_provinciaClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_provinciaClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_provinciaClienteUpdate.setText("U");
		this.jButtonid_provinciaClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_provinciaClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_provinciaClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_provinciaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_provinciaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_provinciaClienteUpdate"));



					
		this.jLabelid_ciudadCliente = new JLabelMe();
		this.jLabelid_ciudadCliente.setText(""+ClienteConstantesFunciones.LABEL_IDCIUDAD+" : *");
		this.jLabelid_ciudadCliente.setToolTipText("Ciudad");
		this.jLabelid_ciudadCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ciudadCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ciudadCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ciudadCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ciudadCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ciudadCliente.setToolTipText(ClienteConstantesFunciones.LABEL_IDCIUDAD);
		this.gridaBagLayoutCliente = new GridBagLayout();
		this.jPanelid_ciudadCliente.setLayout(this.gridaBagLayoutCliente);


		jComboBoxid_ciudadCliente= new JComboBoxMe();
		jComboBoxid_ciudadCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ciudadCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_ciudadCliente= new JButtonMe();
		this.jButtonid_ciudadCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadCliente.setText("Buscar");
		this.jButtonid_ciudadCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ciudadCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ciudadCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadCliente"));

		this.jButtonid_ciudadClienteBusqueda= new JButtonMe();
		this.jButtonid_ciudadClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ciudadClienteBusqueda.setText("U");
		this.jButtonid_ciudadClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ciudadClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ciudadCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadClienteBusqueda"));

		if(this.clienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ciudadClienteBusqueda.setVisible(false);		}

		this.jButtonid_ciudadClienteUpdate= new JButtonMe();
		this.jButtonid_ciudadClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ciudadClienteUpdate.setText("U");
		this.jButtonid_ciudadClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ciudadClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ciudadCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadClienteUpdate"));



					
		this.jLabelid_zonaCliente = new JLabelMe();
		this.jLabelid_zonaCliente.setText(""+ClienteConstantesFunciones.LABEL_IDZONA+" : *");
		this.jLabelid_zonaCliente.setToolTipText("Zona");
		this.jLabelid_zonaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_zonaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_zonaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_zonaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_zonaCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_zonaCliente.setToolTipText(ClienteConstantesFunciones.LABEL_IDZONA);
		this.gridaBagLayoutCliente = new GridBagLayout();
		this.jPanelid_zonaCliente.setLayout(this.gridaBagLayoutCliente);


		jComboBoxid_zonaCliente= new JComboBoxMe();
		jComboBoxid_zonaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_zonaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_zonaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_zonaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_zonaCliente= new JButtonMe();
		this.jButtonid_zonaCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_zonaCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_zonaCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_zonaCliente.setText("Buscar");
		this.jButtonid_zonaCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_zonaCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_zonaCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_zonaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_zonaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_zonaCliente"));

		this.jButtonid_zonaClienteBusqueda= new JButtonMe();
		this.jButtonid_zonaClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_zonaClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_zonaClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_zonaClienteBusqueda.setText("U");
		this.jButtonid_zonaClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_zonaClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_zonaClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_zonaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_zonaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_zonaClienteBusqueda"));

		if(this.clienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_zonaClienteBusqueda.setVisible(false);		}

		this.jButtonid_zonaClienteUpdate= new JButtonMe();
		this.jButtonid_zonaClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_zonaClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_zonaClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_zonaClienteUpdate.setText("U");
		this.jButtonid_zonaClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_zonaClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_zonaClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_zonaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_zonaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_zonaClienteUpdate"));



					
		this.jLabelid_pais_nacionalidadCliente = new JLabelMe();
		this.jLabelid_pais_nacionalidadCliente.setText(""+ClienteConstantesFunciones.LABEL_IDPAISNACIONALIDAD+" : *");
		this.jLabelid_pais_nacionalidadCliente.setToolTipText("Pais Nacionalidad");
		this.jLabelid_pais_nacionalidadCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_pais_nacionalidadCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_pais_nacionalidadCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_pais_nacionalidadCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_pais_nacionalidadCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_pais_nacionalidadCliente.setToolTipText(ClienteConstantesFunciones.LABEL_IDPAISNACIONALIDAD);
		this.gridaBagLayoutCliente = new GridBagLayout();
		this.jPanelid_pais_nacionalidadCliente.setLayout(this.gridaBagLayoutCliente);


		jComboBoxid_pais_nacionalidadCliente= new JComboBoxMe();
		jComboBoxid_pais_nacionalidadCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_pais_nacionalidadCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_pais_nacionalidadCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_pais_nacionalidadCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_pais_nacionalidadCliente= new JButtonMe();
		this.jButtonid_pais_nacionalidadCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_pais_nacionalidadCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_pais_nacionalidadCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_pais_nacionalidadCliente.setText("Buscar");
		this.jButtonid_pais_nacionalidadCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_pais_nacionalidadCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_pais_nacionalidadCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_pais_nacionalidadCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_pais_nacionalidadCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_pais_nacionalidadCliente"));

		this.jButtonid_pais_nacionalidadClienteBusqueda= new JButtonMe();
		this.jButtonid_pais_nacionalidadClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_pais_nacionalidadClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_pais_nacionalidadClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_pais_nacionalidadClienteBusqueda.setText("U");
		this.jButtonid_pais_nacionalidadClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_pais_nacionalidadClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_pais_nacionalidadClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_pais_nacionalidadCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_pais_nacionalidadCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_pais_nacionalidadClienteBusqueda"));

		if(this.clienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_pais_nacionalidadClienteBusqueda.setVisible(false);		}

		this.jButtonid_pais_nacionalidadClienteUpdate= new JButtonMe();
		this.jButtonid_pais_nacionalidadClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_pais_nacionalidadClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_pais_nacionalidadClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_pais_nacionalidadClienteUpdate.setText("U");
		this.jButtonid_pais_nacionalidadClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_pais_nacionalidadClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_pais_nacionalidadClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_pais_nacionalidadCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_pais_nacionalidadCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_pais_nacionalidadClienteUpdate"));



					
		this.jLabelid_tipo_cargo_laboCliente = new JLabelMe();
		this.jLabelid_tipo_cargo_laboCliente.setText(""+ClienteConstantesFunciones.LABEL_IDTIPOCARGOLABO+" : *");
		this.jLabelid_tipo_cargo_laboCliente.setToolTipText("Tipo Cargo Laboral");
		this.jLabelid_tipo_cargo_laboCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_cargo_laboCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_cargo_laboCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_cargo_laboCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_cargo_laboCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_cargo_laboCliente.setToolTipText(ClienteConstantesFunciones.LABEL_IDTIPOCARGOLABO);
		this.gridaBagLayoutCliente = new GridBagLayout();
		this.jPanelid_tipo_cargo_laboCliente.setLayout(this.gridaBagLayoutCliente);


		jComboBoxid_tipo_cargo_laboCliente= new JComboBoxMe();
		jComboBoxid_tipo_cargo_laboCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cargo_laboCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cargo_laboCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_cargo_laboCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_cargo_laboCliente= new JButtonMe();
		this.jButtonid_tipo_cargo_laboCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cargo_laboCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cargo_laboCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cargo_laboCliente.setText("Buscar");
		this.jButtonid_tipo_cargo_laboCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_cargo_laboCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cargo_laboCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_cargo_laboCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cargo_laboCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cargo_laboCliente"));

		this.jButtonid_tipo_cargo_laboClienteBusqueda= new JButtonMe();
		this.jButtonid_tipo_cargo_laboClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cargo_laboClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cargo_laboClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_cargo_laboClienteBusqueda.setText("U");
		this.jButtonid_tipo_cargo_laboClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_cargo_laboClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cargo_laboClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_cargo_laboCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cargo_laboCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cargo_laboClienteBusqueda"));

		if(this.clienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_cargo_laboClienteBusqueda.setVisible(false);		}

		this.jButtonid_tipo_cargo_laboClienteUpdate= new JButtonMe();
		this.jButtonid_tipo_cargo_laboClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cargo_laboClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cargo_laboClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_cargo_laboClienteUpdate.setText("U");
		this.jButtonid_tipo_cargo_laboClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_cargo_laboClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cargo_laboClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_cargo_laboCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cargo_laboCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cargo_laboClienteUpdate"));



					
		this.jLabelid_tipo_nivel_eduCliente = new JLabelMe();
		this.jLabelid_tipo_nivel_eduCliente.setText(""+ClienteConstantesFunciones.LABEL_IDTIPONIVELEDU+" : *");
		this.jLabelid_tipo_nivel_eduCliente.setToolTipText("Tipo Nivel Educativo");
		this.jLabelid_tipo_nivel_eduCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_nivel_eduCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_nivel_eduCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_nivel_eduCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_nivel_eduCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_nivel_eduCliente.setToolTipText(ClienteConstantesFunciones.LABEL_IDTIPONIVELEDU);
		this.gridaBagLayoutCliente = new GridBagLayout();
		this.jPanelid_tipo_nivel_eduCliente.setLayout(this.gridaBagLayoutCliente);


		jComboBoxid_tipo_nivel_eduCliente= new JComboBoxMe();
		jComboBoxid_tipo_nivel_eduCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_nivel_eduCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_nivel_eduCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_nivel_eduCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_nivel_eduCliente= new JButtonMe();
		this.jButtonid_tipo_nivel_eduCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_nivel_eduCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_nivel_eduCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_nivel_eduCliente.setText("Buscar");
		this.jButtonid_tipo_nivel_eduCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_nivel_eduCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_nivel_eduCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_nivel_eduCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_nivel_eduCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_nivel_eduCliente"));

		this.jButtonid_tipo_nivel_eduClienteBusqueda= new JButtonMe();
		this.jButtonid_tipo_nivel_eduClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_nivel_eduClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_nivel_eduClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_nivel_eduClienteBusqueda.setText("U");
		this.jButtonid_tipo_nivel_eduClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_nivel_eduClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_nivel_eduClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_nivel_eduCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_nivel_eduCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_nivel_eduClienteBusqueda"));

		if(this.clienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_nivel_eduClienteBusqueda.setVisible(false);		}

		this.jButtonid_tipo_nivel_eduClienteUpdate= new JButtonMe();
		this.jButtonid_tipo_nivel_eduClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_nivel_eduClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_nivel_eduClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_nivel_eduClienteUpdate.setText("U");
		this.jButtonid_tipo_nivel_eduClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_nivel_eduClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_nivel_eduClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_nivel_eduCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_nivel_eduCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_nivel_eduClienteUpdate"));



					
		this.jLabelid_profesionCliente = new JLabelMe();
		this.jLabelid_profesionCliente.setText(""+ClienteConstantesFunciones.LABEL_IDPROFESION+" : *");
		this.jLabelid_profesionCliente.setToolTipText("Profesion");
		this.jLabelid_profesionCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_profesionCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_profesionCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_profesionCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_profesionCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_profesionCliente.setToolTipText(ClienteConstantesFunciones.LABEL_IDPROFESION);
		this.gridaBagLayoutCliente = new GridBagLayout();
		this.jPanelid_profesionCliente.setLayout(this.gridaBagLayoutCliente);


		jComboBoxid_profesionCliente= new JComboBoxMe();
		jComboBoxid_profesionCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_profesionCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_profesionCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_profesionCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_profesionCliente= new JButtonMe();
		this.jButtonid_profesionCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_profesionCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_profesionCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_profesionCliente.setText("Buscar");
		this.jButtonid_profesionCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_profesionCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_profesionCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_profesionCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_profesionCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_profesionCliente"));

		this.jButtonid_profesionClienteBusqueda= new JButtonMe();
		this.jButtonid_profesionClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_profesionClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_profesionClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_profesionClienteBusqueda.setText("U");
		this.jButtonid_profesionClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_profesionClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_profesionClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_profesionCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_profesionCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_profesionClienteBusqueda"));

		if(this.clienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_profesionClienteBusqueda.setVisible(false);		}

		this.jButtonid_profesionClienteUpdate= new JButtonMe();
		this.jButtonid_profesionClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_profesionClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_profesionClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_profesionClienteUpdate.setText("U");
		this.jButtonid_profesionClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_profesionClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_profesionClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_profesionCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_profesionCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_profesionClienteUpdate"));



					
		this.jLabelid_tipo_generoCliente = new JLabelMe();
		this.jLabelid_tipo_generoCliente.setText(""+ClienteConstantesFunciones.LABEL_IDTIPOGENERO+" : *");
		this.jLabelid_tipo_generoCliente.setToolTipText("Tipo Genero");
		this.jLabelid_tipo_generoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_generoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_generoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_generoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_generoCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_generoCliente.setToolTipText(ClienteConstantesFunciones.LABEL_IDTIPOGENERO);
		this.gridaBagLayoutCliente = new GridBagLayout();
		this.jPanelid_tipo_generoCliente.setLayout(this.gridaBagLayoutCliente);


		jComboBoxid_tipo_generoCliente= new JComboBoxMe();
		jComboBoxid_tipo_generoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_generoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_generoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_generoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_generoCliente= new JButtonMe();
		this.jButtonid_tipo_generoCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_generoCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_generoCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_generoCliente.setText("Buscar");
		this.jButtonid_tipo_generoCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_generoCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_generoCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_generoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_generoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_generoCliente"));

		this.jButtonid_tipo_generoClienteBusqueda= new JButtonMe();
		this.jButtonid_tipo_generoClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_generoClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_generoClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_generoClienteBusqueda.setText("U");
		this.jButtonid_tipo_generoClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_generoClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_generoClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_generoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_generoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_generoClienteBusqueda"));

		if(this.clienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_generoClienteBusqueda.setVisible(false);		}

		this.jButtonid_tipo_generoClienteUpdate= new JButtonMe();
		this.jButtonid_tipo_generoClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_generoClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_generoClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_generoClienteUpdate.setText("U");
		this.jButtonid_tipo_generoClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_generoClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_generoClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_generoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_generoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_generoClienteUpdate"));



					
		this.jLabelid_estado_civilCliente = new JLabelMe();
		this.jLabelid_estado_civilCliente.setText(""+ClienteConstantesFunciones.LABEL_IDESTADOCIVIL+" : *");
		this.jLabelid_estado_civilCliente.setToolTipText("Estado Civil");
		this.jLabelid_estado_civilCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_civilCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_civilCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_civilCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_civilCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_civilCliente.setToolTipText(ClienteConstantesFunciones.LABEL_IDESTADOCIVIL);
		this.gridaBagLayoutCliente = new GridBagLayout();
		this.jPanelid_estado_civilCliente.setLayout(this.gridaBagLayoutCliente);


		jComboBoxid_estado_civilCliente= new JComboBoxMe();
		jComboBoxid_estado_civilCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_civilCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_civilCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_civilCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estado_civilCliente= new JButtonMe();
		this.jButtonid_estado_civilCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_civilCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_civilCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_civilCliente.setText("Buscar");
		this.jButtonid_estado_civilCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_civilCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_civilCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_civilCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_civilCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_civilCliente"));

		this.jButtonid_estado_civilClienteBusqueda= new JButtonMe();
		this.jButtonid_estado_civilClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_civilClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_civilClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_civilClienteBusqueda.setText("U");
		this.jButtonid_estado_civilClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_civilClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_civilClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_civilCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_civilCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_civilClienteBusqueda"));

		if(this.clienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_civilClienteBusqueda.setVisible(false);		}

		this.jButtonid_estado_civilClienteUpdate= new JButtonMe();
		this.jButtonid_estado_civilClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_civilClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_civilClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_civilClienteUpdate.setText("U");
		this.jButtonid_estado_civilClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_civilClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_civilClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_civilCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_civilCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_civilClienteUpdate"));



					
		this.jLabelid_estado_legalCliente = new JLabelMe();
		this.jLabelid_estado_legalCliente.setText(""+ClienteConstantesFunciones.LABEL_IDESTADOLEGAL+" : *");
		this.jLabelid_estado_legalCliente.setToolTipText("Estado Legal");
		this.jLabelid_estado_legalCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_legalCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_legalCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_legalCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_legalCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_legalCliente.setToolTipText(ClienteConstantesFunciones.LABEL_IDESTADOLEGAL);
		this.gridaBagLayoutCliente = new GridBagLayout();
		this.jPanelid_estado_legalCliente.setLayout(this.gridaBagLayoutCliente);


		jComboBoxid_estado_legalCliente= new JComboBoxMe();
		jComboBoxid_estado_legalCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_legalCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_legalCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_legalCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estado_legalCliente= new JButtonMe();
		this.jButtonid_estado_legalCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_legalCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_legalCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_legalCliente.setText("Buscar");
		this.jButtonid_estado_legalCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_legalCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_legalCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_legalCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_legalCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_legalCliente"));

		this.jButtonid_estado_legalClienteBusqueda= new JButtonMe();
		this.jButtonid_estado_legalClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_legalClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_legalClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_legalClienteBusqueda.setText("U");
		this.jButtonid_estado_legalClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_legalClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_legalClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_legalCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_legalCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_legalClienteBusqueda"));

		if(this.clienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_legalClienteBusqueda.setVisible(false);		}

		this.jButtonid_estado_legalClienteUpdate= new JButtonMe();
		this.jButtonid_estado_legalClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_legalClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_legalClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_legalClienteUpdate.setText("U");
		this.jButtonid_estado_legalClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_legalClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_legalClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_legalCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_legalCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_legalClienteUpdate"));



					
		this.jLabelid_cuenta_contableCliente = new JLabelMe();
		this.jLabelid_cuenta_contableCliente.setText(""+ClienteConstantesFunciones.LABEL_IDCUENTACONTABLE+" : *");
		this.jLabelid_cuenta_contableCliente.setToolTipText("Cuenta Contable");
		this.jLabelid_cuenta_contableCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contableCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contableCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contableCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contableCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contableCliente.setToolTipText(ClienteConstantesFunciones.LABEL_IDCUENTACONTABLE);
		this.gridaBagLayoutCliente = new GridBagLayout();
		this.jPanelid_cuenta_contableCliente.setLayout(this.gridaBagLayoutCliente);


		jComboBoxid_cuenta_contableCliente= new JComboBoxMe();
		jComboBoxid_cuenta_contableCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contableCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contableCliente= new JButtonMe();
		this.jButtonid_cuenta_contableCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableCliente.setText("Buscar");
		this.jButtonid_cuenta_contableCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contableCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contableCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableCliente"));

		this.jButtonid_cuenta_contableClienteBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contableClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableClienteBusqueda.setText("U");
		this.jButtonid_cuenta_contableClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contableClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contableCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableClienteBusqueda"));

		if(this.clienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contableClienteBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contableClienteUpdate= new JButtonMe();
		this.jButtonid_cuenta_contableClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableClienteUpdate.setText("U");
		this.jButtonid_cuenta_contableClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contableClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contableCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableClienteUpdate"));


		jButtonid_cuenta_contableClienteArbol= new JButtonMe();
		jButtonid_cuenta_contableClienteArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableClienteArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableClienteArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableClienteArbol.setText("Arbol");
		jButtonid_cuenta_contableClienteArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contableClienteArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableClienteArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contableCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableClienteArbol"));



					
		this.jLabelid_rutaCliente = new JLabelMe();
		this.jLabelid_rutaCliente.setText(""+ClienteConstantesFunciones.LABEL_IDRUTA+" : *");
		this.jLabelid_rutaCliente.setToolTipText("Ruta");
		this.jLabelid_rutaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_rutaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_rutaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_rutaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_rutaCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_rutaCliente.setToolTipText(ClienteConstantesFunciones.LABEL_IDRUTA);
		this.gridaBagLayoutCliente = new GridBagLayout();
		this.jPanelid_rutaCliente.setLayout(this.gridaBagLayoutCliente);


		jComboBoxid_rutaCliente= new JComboBoxMe();
		jComboBoxid_rutaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_rutaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_rutaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_rutaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_rutaCliente= new JButtonMe();
		this.jButtonid_rutaCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_rutaCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_rutaCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_rutaCliente.setText("Buscar");
		this.jButtonid_rutaCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_rutaCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_rutaCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_rutaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_rutaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_rutaCliente"));

		this.jButtonid_rutaClienteBusqueda= new JButtonMe();
		this.jButtonid_rutaClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_rutaClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_rutaClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_rutaClienteBusqueda.setText("U");
		this.jButtonid_rutaClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_rutaClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_rutaClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_rutaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_rutaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_rutaClienteBusqueda"));

		if(this.clienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_rutaClienteBusqueda.setVisible(false);		}

		this.jButtonid_rutaClienteUpdate= new JButtonMe();
		this.jButtonid_rutaClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_rutaClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_rutaClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_rutaClienteUpdate.setText("U");
		this.jButtonid_rutaClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_rutaClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_rutaClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_rutaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_rutaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_rutaClienteUpdate"));



					
		this.jLabelid_vendedorCliente = new JLabelMe();
		this.jLabelid_vendedorCliente.setText(""+ClienteConstantesFunciones.LABEL_IDVENDEDOR+" : *");
		this.jLabelid_vendedorCliente.setToolTipText("Vendedor");
		this.jLabelid_vendedorCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_vendedorCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_vendedorCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_vendedorCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_vendedorCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_vendedorCliente.setToolTipText(ClienteConstantesFunciones.LABEL_IDVENDEDOR);
		this.gridaBagLayoutCliente = new GridBagLayout();
		this.jPanelid_vendedorCliente.setLayout(this.gridaBagLayoutCliente);


		jComboBoxid_vendedorCliente= new JComboBoxMe();
		jComboBoxid_vendedorCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_vendedorCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_vendedorCliente= new JButtonMe();
		this.jButtonid_vendedorCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorCliente.setText("Buscar");
		this.jButtonid_vendedorCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_vendedorCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_vendedorCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorCliente"));

		this.jButtonid_vendedorClienteBusqueda= new JButtonMe();
		this.jButtonid_vendedorClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_vendedorClienteBusqueda.setText("U");
		this.jButtonid_vendedorClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_vendedorClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_vendedorCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorClienteBusqueda"));

		if(this.clienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_vendedorClienteBusqueda.setVisible(false);		}

		this.jButtonid_vendedorClienteUpdate= new JButtonMe();
		this.jButtonid_vendedorClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_vendedorClienteUpdate.setText("U");
		this.jButtonid_vendedorClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_vendedorClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_vendedorCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorClienteUpdate"));


		jButtonid_vendedorClienteArbol= new JButtonMe();
		jButtonid_vendedorClienteArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_vendedorClienteArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_vendedorClienteArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_vendedorClienteArbol.setText("Arbol");
		jButtonid_vendedorClienteArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_vendedorClienteArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorClienteArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_vendedorCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorClienteArbol"));



					
		this.jLabelid_centro_actividadCliente = new JLabelMe();
		this.jLabelid_centro_actividadCliente.setText(""+ClienteConstantesFunciones.LABEL_IDCENTROACTIVIDAD+" : *");
		this.jLabelid_centro_actividadCliente.setToolTipText("Centro Activad");
		this.jLabelid_centro_actividadCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_actividadCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_actividadCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_centro_actividadCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_centro_actividadCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_centro_actividadCliente.setToolTipText(ClienteConstantesFunciones.LABEL_IDCENTROACTIVIDAD);
		this.gridaBagLayoutCliente = new GridBagLayout();
		this.jPanelid_centro_actividadCliente.setLayout(this.gridaBagLayoutCliente);


		jComboBoxid_centro_actividadCliente= new JComboBoxMe();
		jComboBoxid_centro_actividadCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_actividadCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_actividadCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_actividadCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_centro_actividadCliente= new JButtonMe();
		this.jButtonid_centro_actividadCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_actividadCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_actividadCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_actividadCliente.setText("Buscar");
		this.jButtonid_centro_actividadCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_centro_actividadCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_actividadCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_centro_actividadCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_actividadCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_actividadCliente"));

		this.jButtonid_centro_actividadClienteBusqueda= new JButtonMe();
		this.jButtonid_centro_actividadClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_actividadClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_actividadClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_actividadClienteBusqueda.setText("U");
		this.jButtonid_centro_actividadClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_centro_actividadClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_actividadClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_centro_actividadCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_actividadCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_actividadClienteBusqueda"));

		if(this.clienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_centro_actividadClienteBusqueda.setVisible(false);		}

		this.jButtonid_centro_actividadClienteUpdate= new JButtonMe();
		this.jButtonid_centro_actividadClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_actividadClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_actividadClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_actividadClienteUpdate.setText("U");
		this.jButtonid_centro_actividadClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_centro_actividadClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_actividadClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_centro_actividadCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_actividadCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_actividadClienteUpdate"));



					
		this.jLabelid_tipo_garantia_empresaCliente = new JLabelMe();
		this.jLabelid_tipo_garantia_empresaCliente.setText(""+ClienteConstantesFunciones.LABEL_IDTIPOGARANTIAEMPRESA+" : *");
		this.jLabelid_tipo_garantia_empresaCliente.setToolTipText("Tipo Garantia");
		this.jLabelid_tipo_garantia_empresaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_garantia_empresaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_garantia_empresaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_garantia_empresaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_garantia_empresaCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_garantia_empresaCliente.setToolTipText(ClienteConstantesFunciones.LABEL_IDTIPOGARANTIAEMPRESA);
		this.gridaBagLayoutCliente = new GridBagLayout();
		this.jPanelid_tipo_garantia_empresaCliente.setLayout(this.gridaBagLayoutCliente);


		jComboBoxid_tipo_garantia_empresaCliente= new JComboBoxMe();
		jComboBoxid_tipo_garantia_empresaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_garantia_empresaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_garantia_empresaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_garantia_empresaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_garantia_empresaCliente= new JButtonMe();
		this.jButtonid_tipo_garantia_empresaCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_garantia_empresaCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_garantia_empresaCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_garantia_empresaCliente.setText("Buscar");
		this.jButtonid_tipo_garantia_empresaCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_garantia_empresaCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_garantia_empresaCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_garantia_empresaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_garantia_empresaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_garantia_empresaCliente"));

		this.jButtonid_tipo_garantia_empresaClienteBusqueda= new JButtonMe();
		this.jButtonid_tipo_garantia_empresaClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_garantia_empresaClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_garantia_empresaClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_garantia_empresaClienteBusqueda.setText("U");
		this.jButtonid_tipo_garantia_empresaClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_garantia_empresaClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_garantia_empresaClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_garantia_empresaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_garantia_empresaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_garantia_empresaClienteBusqueda"));

		if(this.clienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_garantia_empresaClienteBusqueda.setVisible(false);		}

		this.jButtonid_tipo_garantia_empresaClienteUpdate= new JButtonMe();
		this.jButtonid_tipo_garantia_empresaClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_garantia_empresaClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_garantia_empresaClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_garantia_empresaClienteUpdate.setText("U");
		this.jButtonid_tipo_garantia_empresaClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_garantia_empresaClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_garantia_empresaClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_garantia_empresaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_garantia_empresaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_garantia_empresaClienteUpdate"));



					
		this.jLabelid_cate_tipo_afiliacionCliente = new JLabelMe();
		this.jLabelid_cate_tipo_afiliacionCliente.setText(""+ClienteConstantesFunciones.LABEL_IDCATETIPOAFILIACION+" : *");
		this.jLabelid_cate_tipo_afiliacionCliente.setToolTipText("Categoria Afiliacion");
		this.jLabelid_cate_tipo_afiliacionCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cate_tipo_afiliacionCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cate_tipo_afiliacionCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cate_tipo_afiliacionCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cate_tipo_afiliacionCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cate_tipo_afiliacionCliente.setToolTipText(ClienteConstantesFunciones.LABEL_IDCATETIPOAFILIACION);
		this.gridaBagLayoutCliente = new GridBagLayout();
		this.jPanelid_cate_tipo_afiliacionCliente.setLayout(this.gridaBagLayoutCliente);


		jComboBoxid_cate_tipo_afiliacionCliente= new JComboBoxMe();
		jComboBoxid_cate_tipo_afiliacionCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cate_tipo_afiliacionCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cate_tipo_afiliacionCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cate_tipo_afiliacionCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cate_tipo_afiliacionCliente= new JButtonMe();
		this.jButtonid_cate_tipo_afiliacionCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cate_tipo_afiliacionCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cate_tipo_afiliacionCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cate_tipo_afiliacionCliente.setText("Buscar");
		this.jButtonid_cate_tipo_afiliacionCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cate_tipo_afiliacionCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cate_tipo_afiliacionCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cate_tipo_afiliacionCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cate_tipo_afiliacionCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cate_tipo_afiliacionCliente"));

		this.jButtonid_cate_tipo_afiliacionClienteBusqueda= new JButtonMe();
		this.jButtonid_cate_tipo_afiliacionClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cate_tipo_afiliacionClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cate_tipo_afiliacionClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cate_tipo_afiliacionClienteBusqueda.setText("U");
		this.jButtonid_cate_tipo_afiliacionClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cate_tipo_afiliacionClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cate_tipo_afiliacionClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cate_tipo_afiliacionCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cate_tipo_afiliacionCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cate_tipo_afiliacionClienteBusqueda"));

		if(this.clienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cate_tipo_afiliacionClienteBusqueda.setVisible(false);		}

		this.jButtonid_cate_tipo_afiliacionClienteUpdate= new JButtonMe();
		this.jButtonid_cate_tipo_afiliacionClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cate_tipo_afiliacionClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cate_tipo_afiliacionClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cate_tipo_afiliacionClienteUpdate.setText("U");
		this.jButtonid_cate_tipo_afiliacionClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cate_tipo_afiliacionClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cate_tipo_afiliacionClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cate_tipo_afiliacionCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cate_tipo_afiliacionCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cate_tipo_afiliacionClienteUpdate"));



					
		this.jLabelid_diaCliente = new JLabelMe();
		this.jLabelid_diaCliente.setText(""+ClienteConstantesFunciones.LABEL_IDDIA+" : *");
		this.jLabelid_diaCliente.setToolTipText("Dia Pago");
		this.jLabelid_diaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_diaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_diaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_diaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_diaCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_diaCliente.setToolTipText(ClienteConstantesFunciones.LABEL_IDDIA);
		this.gridaBagLayoutCliente = new GridBagLayout();
		this.jPanelid_diaCliente.setLayout(this.gridaBagLayoutCliente);


		jComboBoxid_diaCliente= new JComboBoxMe();
		jComboBoxid_diaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_diaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_diaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_diaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_diaCliente= new JButtonMe();
		this.jButtonid_diaCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_diaCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_diaCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_diaCliente.setText("Buscar");
		this.jButtonid_diaCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_diaCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_diaCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_diaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_diaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_diaCliente"));

		this.jButtonid_diaClienteBusqueda= new JButtonMe();
		this.jButtonid_diaClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_diaClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_diaClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_diaClienteBusqueda.setText("U");
		this.jButtonid_diaClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_diaClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_diaClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_diaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_diaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_diaClienteBusqueda"));

		if(this.clienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_diaClienteBusqueda.setVisible(false);		}

		this.jButtonid_diaClienteUpdate= new JButtonMe();
		this.jButtonid_diaClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_diaClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_diaClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_diaClienteUpdate.setText("U");
		this.jButtonid_diaClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_diaClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_diaClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_diaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_diaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_diaClienteUpdate"));



					
		this.jLabelid_empleadoCliente = new JLabelMe();
		this.jLabelid_empleadoCliente.setText(""+ClienteConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoCliente.setToolTipText("Empleado");
		this.jLabelid_empleadoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoCliente.setToolTipText(ClienteConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutCliente = new GridBagLayout();
		this.jPanelid_empleadoCliente.setLayout(this.gridaBagLayoutCliente);


		jComboBoxid_empleadoCliente= new JComboBoxMe();
		jComboBoxid_empleadoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoCliente= new JButtonMe();
		this.jButtonid_empleadoCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoCliente.setText("Buscar");
		this.jButtonid_empleadoCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoCliente"));

		this.jButtonid_empleadoClienteBusqueda= new JButtonMe();
		this.jButtonid_empleadoClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoClienteBusqueda.setText("U");
		this.jButtonid_empleadoClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoClienteBusqueda"));

		if(this.clienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoClienteBusqueda.setVisible(false);		}

		this.jButtonid_empleadoClienteUpdate= new JButtonMe();
		this.jButtonid_empleadoClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoClienteUpdate.setText("U");
		this.jButtonid_empleadoClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoClienteUpdate"));



					
		this.jLabelid_tipo_precioCliente = new JLabelMe();
		this.jLabelid_tipo_precioCliente.setText(""+ClienteConstantesFunciones.LABEL_IDTIPOPRECIO+" : *");
		this.jLabelid_tipo_precioCliente.setToolTipText("Tipo Precio");
		this.jLabelid_tipo_precioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_precioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_precioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_precioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_precioCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_precioCliente.setToolTipText(ClienteConstantesFunciones.LABEL_IDTIPOPRECIO);
		this.gridaBagLayoutCliente = new GridBagLayout();
		this.jPanelid_tipo_precioCliente.setLayout(this.gridaBagLayoutCliente);


		jComboBoxid_tipo_precioCliente= new JComboBoxMe();
		jComboBoxid_tipo_precioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_precioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_precioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_precioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_precioCliente= new JButtonMe();
		this.jButtonid_tipo_precioCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_precioCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_precioCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_precioCliente.setText("Buscar");
		this.jButtonid_tipo_precioCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_precioCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_precioCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_precioCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_precioCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_precioCliente"));

		this.jButtonid_tipo_precioClienteBusqueda= new JButtonMe();
		this.jButtonid_tipo_precioClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_precioClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_precioClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_precioClienteBusqueda.setText("U");
		this.jButtonid_tipo_precioClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_precioClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_precioClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_precioCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_precioCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_precioClienteBusqueda"));

		if(this.clienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_precioClienteBusqueda.setVisible(false);		}

		this.jButtonid_tipo_precioClienteUpdate= new JButtonMe();
		this.jButtonid_tipo_precioClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_precioClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_precioClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_precioClienteUpdate.setText("U");
		this.jButtonid_tipo_precioClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_precioClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_precioClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_precioCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_precioCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_precioClienteUpdate"));



					
		this.jLabelid_tipo_lista_precioCliente = new JLabelMe();
		this.jLabelid_tipo_lista_precioCliente.setText(""+ClienteConstantesFunciones.LABEL_IDTIPOLISTAPRECIO+" : *");
		this.jLabelid_tipo_lista_precioCliente.setToolTipText("Tipo Lista Precio");
		this.jLabelid_tipo_lista_precioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_lista_precioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_lista_precioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_lista_precioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_lista_precioCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_lista_precioCliente.setToolTipText(ClienteConstantesFunciones.LABEL_IDTIPOLISTAPRECIO);
		this.gridaBagLayoutCliente = new GridBagLayout();
		this.jPanelid_tipo_lista_precioCliente.setLayout(this.gridaBagLayoutCliente);


		jComboBoxid_tipo_lista_precioCliente= new JComboBoxMe();
		jComboBoxid_tipo_lista_precioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_lista_precioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_lista_precioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_lista_precioCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_lista_precioCliente= new JButtonMe();
		this.jButtonid_tipo_lista_precioCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_lista_precioCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_lista_precioCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_lista_precioCliente.setText("Buscar");
		this.jButtonid_tipo_lista_precioCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_lista_precioCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_lista_precioCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_lista_precioCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_lista_precioCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_lista_precioCliente"));

		this.jButtonid_tipo_lista_precioClienteBusqueda= new JButtonMe();
		this.jButtonid_tipo_lista_precioClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_lista_precioClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_lista_precioClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_lista_precioClienteBusqueda.setText("U");
		this.jButtonid_tipo_lista_precioClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_lista_precioClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_lista_precioClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_lista_precioCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_lista_precioCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_lista_precioClienteBusqueda"));

		if(this.clienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_lista_precioClienteBusqueda.setVisible(false);		}

		this.jButtonid_tipo_lista_precioClienteUpdate= new JButtonMe();
		this.jButtonid_tipo_lista_precioClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_lista_precioClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_lista_precioClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_lista_precioClienteUpdate.setText("U");
		this.jButtonid_tipo_lista_precioClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_lista_precioClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_lista_precioClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_lista_precioCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_lista_precioCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_lista_precioClienteUpdate"));



	}
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) {
		//System.out.println("TRANSFIERE EL MANEJO AL PADRE O FORM PRINCIPAL");
		
		jInternalFrameParent.jButtonActionPerformedTecladoGeneral(sTipo,evt);
	}
	
	//JPanel
	//@SuppressWarnings({"unchecked" })//"rawtypes"
	public JScrollPane getJContentPane(int iWidth,int iHeight,JDesktopPane jDesktopPane,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {	
		//PARA TABLA PARAMETROS
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		this.jContentPane = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
				
		this.usuarioActual=usuarioActual;
		this.resumenUsuarioActual=resumenUsuarioActual;
		this.opcionActual=opcionActual;
		
		this.moduloActual=moduloActual;		
		this.parametroGeneralSg=parametroGeneralSg;		
		this.parametroGeneralUsuario=parametroGeneralUsuario;	
		
		this.jDesktopPane=jDesktopPane;
				
		this.conFuncionalidadRelaciones=parametroGeneralUsuario.getcon_guardar_relaciones();
		
		
		int iGridyPrincipal=0;
		
		
		this.inicializarToolBar();		
		
		
		//CARGAR MENUS
		//this.jInternalFrameDetalleCliente = new ClienteBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Cliente DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCliente= new GridBagLayout();
		

		
		String sToolTipCliente="";
		sToolTipCliente=ClienteConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCliente+="(Cartera.Cliente)";
		}
		
		if(!this.clienteSessionBean.getEsGuardarRelacionado()) {
			sToolTipCliente+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoCliente = new JButtonMe();
		this.jButtonModificarCliente = new JButtonMe();
        this.jButtonActualizarCliente = new JButtonMe();
        this.jButtonEliminarCliente = new JButtonMe();
        this.jButtonCancelarCliente = new JButtonMe();
        this.jButtonGuardarCambiosCliente = new JButtonMe();
		this.jButtonGuardarCambiosTablaCliente = new JButtonMe();
		this.jButtonCerrarCliente = new JButtonMe();
		
		this.jScrollPanelDatosCliente = new JScrollPane();   
        this.jScrollPanelDatosEdicionCliente = new JScrollPane();
		this.jScrollPanelDatosGeneralCliente = new JScrollPane();
				
		
		
		this.jPanelCamposCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		this.jTabbedPaneCamposCliente=new JTabbedPane();
		
		
		this.jTabbedPaneCamposCliente.setBorder(javax.swing.BorderFactory.createEmptyBorder());//javax.swing.BorderFactory.createTitledBorder("Campos")
		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneCamposCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciogeneralCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposInicioubicacionCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciopersonalCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciocontableCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciofacturaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		;
		//}
		
		this.sPath=" <---> Acceso: Cliente";
		
		if(!this.clienteSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Clientes" + this.sPath));
		} else {
			this.jScrollPanelDatosCliente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposCliente.setName("jPanelCamposCliente"); 

		this.jPanelCamposOcultosCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosCliente.setName("jPanelCamposOcultosCliente"); 

        this.jPanelAccionesCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCliente.setToolTipText("Acciones");
        this.jPanelAccionesCliente.setName("Acciones"); 

		this.jPanelAccionesFormularioCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioCliente.setToolTipText("Acciones");
        this.jPanelAccionesFormularioCliente.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCliente, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposCliente, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosCliente, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciogeneralCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));
		this.jPanelCamposIniciogeneralCliente.setName("jPanelCamposFingeneralCliente");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralCliente, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposInicioubicacionCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Ubicacion"));
		this.jPanelCamposInicioubicacionCliente.setName("jPanelCamposFinubicacionCliente");
		FuncionesSwing.setBoldPanel(this.jPanelCamposInicioubicacionCliente, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciopersonalCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Personal"));
		this.jPanelCamposIniciopersonalCliente.setName("jPanelCamposFinpersonalCliente");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciopersonalCliente, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciocontableCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Contable"));
		this.jPanelCamposIniciocontableCliente.setName("jPanelCamposFincontableCliente");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciocontableCliente, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciofacturaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Factura"));
		this.jPanelCamposIniciofacturaCliente.setName("jPanelCamposFinfacturaCliente");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciofacturaCliente, STIPO_TAMANIO_GENERAL,false,false,this);;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoCliente.setText("Nuevo");
		this.jButtonModificarCliente.setText("Editar");
        this.jButtonActualizarCliente.setText("Actualizar");
        this.jButtonEliminarCliente.setText("Eliminar");
        this.jButtonCancelarCliente.setText("Cancelar");
        this.jButtonGuardarCambiosCliente.setText("Guardar");
		this.jButtonGuardarCambiosTablaCliente.setText("Guardar");
		this.jButtonCerrarCliente.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCliente,"nuevo_button","Nuevo",this.clienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarCliente,"modificar_button","Editar",this.clienteSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarCliente,"actualizar_button","Actualizar",this.clienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarCliente,"eliminar_button","Eliminar",this.clienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarCliente,"cancelar_button","Cancelar",this.clienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosCliente,"guardarcambios_button","Guardar",this.clienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCliente,"guardarcambiostabla_button","Guardar",this.clienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCliente,"cerrar_button","Salir",this.clienteSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoCliente.setToolTipText("Nuevo"+" "+ClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarCliente.setToolTipText("Editar"+" "+ClienteConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarCliente.setToolTipText("Actualizar"+" "+ClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarCliente.setToolTipText("Eliminar)"+" "+ClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarCliente.setToolTipText("Cancelar"+" "+ClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosCliente.setToolTipText("Guardar"+" "+ClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaCliente.setToolTipText("Guardar"+" "+ClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCliente.setToolTipText("Salir"+" "+ClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
		//HOT KEYS
		/*
		N->Nuevo
		N->Alt + Nuevo Relaciones (ANTES R)
		A->Actualizar
		E->Eliminar
		S->Cerrar
		C->->Mayus + Cancelar (ANTES Q->Quit)
		G->Guardar Cambios
		D->Duplicar
		C->Alt + Cop?ar
		O->Orden
		N->Nuevo Tabla
		R->Recargar Informacion Inicial (ANTES I)
		Alt + Pag.Down->Siguientes
		Alt + Pag.Up->Anteriores
		
		NO UTILIZADOS
		M->Modificar
		
		*/
		String sMapKey = "";
		InputMap inputMap =null;
		
		//NUEVO
		sMapKey = "NuevoCliente";
		inputMap = this.jButtonNuevoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCliente"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarCliente";
		inputMap = this.jButtonActualizarCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarCliente"));
		
		//ELIMINAR
		sMapKey = "EliminarCliente";
		inputMap = this.jButtonEliminarCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarCliente"));
		
		//CANCELAR	
		sMapKey = "CancelarCliente";
		inputMap = this.jButtonCancelarCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarCliente"));
		
		//CERRAR		
		sMapKey = "CerrarCliente";
		inputMap = this.jButtonCerrarCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCliente"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCliente";
		inputMap = this.jButtonGuardarCambiosTablaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCliente"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoCliente.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoCliente.setToolTipText("Nuevo Cliente");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarCliente.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarCliente.setToolTipText("Sin Cerrar Ventana Cliente");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarCliente, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeCliente.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeCliente.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeCliente, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCliente.setText("Accion");
		this.jComboBoxTiposAccionesCliente.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioCliente.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioCliente.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesCliente = new JLabelMe();
		
		this.jLabelAccionesCliente.setText("Acciones");		
		this.jLabelAccionesCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposCliente();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysCliente();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesCliente=new JTabbedPane();
		this.jTabbedPaneRelacionesCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioCliente.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCliente.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCliente.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioCliente, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposCliente = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosCliente = new GridBagLayout();
		
		this.jPanelCamposCliente.setLayout(gridaBagLayoutCamposCliente);
		this.jPanelCamposOcultosCliente.setLayout(gridaBagLayoutCamposOcultosCliente);
		
		

		GridBagLayout gridaBagLayoutCamposIniciogeneralCliente= new GridBagLayout();
		this.jPanelCamposIniciogeneralCliente.setLayout(gridaBagLayoutCamposIniciogeneralCliente);

		GridBagLayout gridaBagLayoutCamposInicioubicacionCliente= new GridBagLayout();
		this.jPanelCamposInicioubicacionCliente.setLayout(gridaBagLayoutCamposInicioubicacionCliente);

		GridBagLayout gridaBagLayoutCamposIniciopersonalCliente= new GridBagLayout();
		this.jPanelCamposIniciopersonalCliente.setLayout(gridaBagLayoutCamposIniciopersonalCliente);

		GridBagLayout gridaBagLayoutCamposIniciocontableCliente= new GridBagLayout();
		this.jPanelCamposIniciocontableCliente.setLayout(gridaBagLayoutCamposIniciocontableCliente);

		GridBagLayout gridaBagLayoutCamposIniciofacturaCliente= new GridBagLayout();
		this.jPanelCamposIniciofacturaCliente.setLayout(gridaBagLayoutCamposIniciofacturaCliente);;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 0;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidCliente.add(jLabelIdCliente, this.gridBagConstraintsCliente);



	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 1;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidCliente.add(jLabelidCliente, this.gridBagConstraintsCliente);


	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 0;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaCliente.add(jLabelid_empresaCliente, this.gridBagConstraintsCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 2;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCliente.add(jButtonid_empresaClienteBusqueda, this.gridBagConstraintsCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 3;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCliente.add(jButtonid_empresaClienteUpdate, this.gridBagConstraintsCliente);
	}

	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 1;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaCliente.add(jComboBoxid_empresaCliente, this.gridBagConstraintsCliente);


	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 0;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalCliente.add(jLabelid_sucursalCliente, this.gridBagConstraintsCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 2;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalCliente.add(jButtonid_sucursalClienteBusqueda, this.gridBagConstraintsCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 3;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalCliente.add(jButtonid_sucursalClienteUpdate, this.gridBagConstraintsCliente);
	}

	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 1;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalCliente.add(jComboBoxid_sucursalCliente, this.gridBagConstraintsCliente);


	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 0;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoCliente.add(jLabelcodigoCliente, this.gridBagConstraintsCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 2;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoCliente.add(jButtoncodigoClienteBusqueda, this.gridBagConstraintsCliente);
	}

	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 1;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoCliente.add(jTextFieldcodigoCliente, this.gridBagConstraintsCliente);


	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 0;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_identificacionCliente.add(jLabelid_tipo_identificacionCliente, this.gridBagConstraintsCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 2;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_identificacionCliente.add(jButtonid_tipo_identificacionClienteBusqueda, this.gridBagConstraintsCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 3;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_identificacionCliente.add(jButtonid_tipo_identificacionClienteUpdate, this.gridBagConstraintsCliente);
	}

	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 1;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_identificacionCliente.add(jComboBoxid_tipo_identificacionCliente, this.gridBagConstraintsCliente);


	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 0;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidentificacionCliente.add(jLabelidentificacionCliente, this.gridBagConstraintsCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 2;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelidentificacionCliente.add(jButtonidentificacionClienteBusqueda, this.gridBagConstraintsCliente);
	}

	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 1;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidentificacionCliente.add(jTextFieldidentificacionCliente, this.gridBagConstraintsCliente);


	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 0;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelrucCliente.add(jLabelrucCliente, this.gridBagConstraintsCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 2;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelrucCliente.add(jButtonrucClienteBusqueda, this.gridBagConstraintsCliente);
	}

	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 1;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelrucCliente.add(jTextFieldrucCliente, this.gridBagConstraintsCliente);


	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 0;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreCliente.add(jLabelnombreCliente, this.gridBagConstraintsCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 2;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreCliente.add(jButtonnombreClienteBusqueda, this.gridBagConstraintsCliente);
	}

	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 1;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreCliente.add(jscrollPanenombreCliente, this.gridBagConstraintsCliente);


	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 0;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelapellidoCliente.add(jLabelapellidoCliente, this.gridBagConstraintsCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 2;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelapellidoCliente.add(jButtonapellidoClienteBusqueda, this.gridBagConstraintsCliente);
	}

	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 1;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelapellidoCliente.add(jscrollPaneapellidoCliente, this.gridBagConstraintsCliente);


	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 0;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_completoCliente.add(jLabelnombre_completoCliente, this.gridBagConstraintsCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 2;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_completoCliente.add(jButtonnombre_completoClienteBusqueda, this.gridBagConstraintsCliente);
	}

	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 1;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_completoCliente.add(jscrollPanenombre_completoCliente, this.gridBagConstraintsCliente);


	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 0;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_comercialCliente.add(jLabelnombre_comercialCliente, this.gridBagConstraintsCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 2;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_comercialCliente.add(jButtonnombre_comercialClienteBusqueda, this.gridBagConstraintsCliente);
	}

	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 1;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_comercialCliente.add(jscrollPanenombre_comercialCliente, this.gridBagConstraintsCliente);


	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 0;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltelefonoCliente.add(jLabeltelefonoCliente, this.gridBagConstraintsCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 2;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPaneltelefonoCliente.add(jButtontelefonoClienteBusqueda, this.gridBagConstraintsCliente);
	}

	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 1;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltelefonoCliente.add(jTextFieldtelefonoCliente, this.gridBagConstraintsCliente);


	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 0;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldireccionCliente.add(jLabeldireccionCliente, this.gridBagConstraintsCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 2;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPaneldireccionCliente.add(jButtondireccionClienteBusqueda, this.gridBagConstraintsCliente);
	}

	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 1;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldireccionCliente.add(jscrollPanedireccionCliente, this.gridBagConstraintsCliente);


	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 0;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_proveCliente.add(jLabeles_proveCliente, this.gridBagConstraintsCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 2;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_proveCliente.add(jButtones_proveClienteBusqueda, this.gridBagConstraintsCliente);
	}

	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 1;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_proveCliente.add(jCheckBoxes_proveCliente, this.gridBagConstraintsCliente);


	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 0;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_grupo_clienteCliente.add(jLabelid_grupo_clienteCliente, this.gridBagConstraintsCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 2;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_grupo_clienteCliente.add(jButtonid_grupo_clienteClienteBusqueda, this.gridBagConstraintsCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 3;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_grupo_clienteCliente.add(jButtonid_grupo_clienteClienteUpdate, this.gridBagConstraintsCliente);
	}

	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 1;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_grupo_clienteCliente.add(jComboBoxid_grupo_clienteCliente, this.gridBagConstraintsCliente);


	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 0;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_titulo_clienteCliente.add(jLabelid_titulo_clienteCliente, this.gridBagConstraintsCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 2;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_titulo_clienteCliente.add(jButtonid_titulo_clienteClienteBusqueda, this.gridBagConstraintsCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 3;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_titulo_clienteCliente.add(jButtonid_titulo_clienteClienteUpdate, this.gridBagConstraintsCliente);
	}

	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 1;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_titulo_clienteCliente.add(jComboBoxid_titulo_clienteCliente, this.gridBagConstraintsCliente);


	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 0;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_area_crCliente.add(jLabelid_area_crCliente, this.gridBagConstraintsCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 2;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_area_crCliente.add(jButtonid_area_crClienteBusqueda, this.gridBagConstraintsCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 3;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_area_crCliente.add(jButtonid_area_crClienteUpdate, this.gridBagConstraintsCliente);
	}

	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 1;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_area_crCliente.add(jComboBoxid_area_crCliente, this.gridBagConstraintsCliente);


	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 0;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estado_clienteCliente.add(jLabelid_estado_clienteCliente, this.gridBagConstraintsCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 2;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_clienteCliente.add(jButtonid_estado_clienteClienteBusqueda, this.gridBagConstraintsCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 3;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_clienteCliente.add(jButtonid_estado_clienteClienteUpdate, this.gridBagConstraintsCliente);
	}

	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 1;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estado_clienteCliente.add(jComboBoxid_estado_clienteCliente, this.gridBagConstraintsCliente);


	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 0;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelobservacionCliente.add(jLabelobservacionCliente, this.gridBagConstraintsCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 2;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelobservacionCliente.add(jButtonobservacionClienteBusqueda, this.gridBagConstraintsCliente);
	}

	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 1;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelobservacionCliente.add(jscrollPaneobservacionCliente, this.gridBagConstraintsCliente);


	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 0;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_paisCliente.add(jLabelid_paisCliente, this.gridBagConstraintsCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 2;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisCliente.add(jButtonid_paisClienteBusqueda, this.gridBagConstraintsCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 3;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisCliente.add(jButtonid_paisClienteUpdate, this.gridBagConstraintsCliente);
	}

	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 1;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_paisCliente.add(jComboBoxid_paisCliente, this.gridBagConstraintsCliente);


	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 0;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_regionCliente.add(jLabelid_regionCliente, this.gridBagConstraintsCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 2;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_regionCliente.add(jButtonid_regionClienteBusqueda, this.gridBagConstraintsCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 3;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_regionCliente.add(jButtonid_regionClienteUpdate, this.gridBagConstraintsCliente);
	}

	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 1;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_regionCliente.add(jComboBoxid_regionCliente, this.gridBagConstraintsCliente);


	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 0;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_provinciaCliente.add(jLabelid_provinciaCliente, this.gridBagConstraintsCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 2;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_provinciaCliente.add(jButtonid_provinciaClienteBusqueda, this.gridBagConstraintsCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 3;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_provinciaCliente.add(jButtonid_provinciaClienteUpdate, this.gridBagConstraintsCliente);
	}

	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 1;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_provinciaCliente.add(jComboBoxid_provinciaCliente, this.gridBagConstraintsCliente);


	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 0;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ciudadCliente.add(jLabelid_ciudadCliente, this.gridBagConstraintsCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 2;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ciudadCliente.add(jButtonid_ciudadClienteBusqueda, this.gridBagConstraintsCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 3;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ciudadCliente.add(jButtonid_ciudadClienteUpdate, this.gridBagConstraintsCliente);
	}

	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 1;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ciudadCliente.add(jComboBoxid_ciudadCliente, this.gridBagConstraintsCliente);


	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 0;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_zonaCliente.add(jLabelid_zonaCliente, this.gridBagConstraintsCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 2;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_zonaCliente.add(jButtonid_zonaClienteBusqueda, this.gridBagConstraintsCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 3;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_zonaCliente.add(jButtonid_zonaClienteUpdate, this.gridBagConstraintsCliente);
	}

	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 1;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_zonaCliente.add(jComboBoxid_zonaCliente, this.gridBagConstraintsCliente);


	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 0;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_pais_nacionalidadCliente.add(jLabelid_pais_nacionalidadCliente, this.gridBagConstraintsCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 2;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_pais_nacionalidadCliente.add(jButtonid_pais_nacionalidadClienteBusqueda, this.gridBagConstraintsCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 3;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_pais_nacionalidadCliente.add(jButtonid_pais_nacionalidadClienteUpdate, this.gridBagConstraintsCliente);
	}

	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 1;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_pais_nacionalidadCliente.add(jComboBoxid_pais_nacionalidadCliente, this.gridBagConstraintsCliente);


	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 0;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_cargo_laboCliente.add(jLabelid_tipo_cargo_laboCliente, this.gridBagConstraintsCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 2;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_cargo_laboCliente.add(jButtonid_tipo_cargo_laboClienteBusqueda, this.gridBagConstraintsCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 3;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_cargo_laboCliente.add(jButtonid_tipo_cargo_laboClienteUpdate, this.gridBagConstraintsCliente);
	}

	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 1;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_cargo_laboCliente.add(jComboBoxid_tipo_cargo_laboCliente, this.gridBagConstraintsCliente);


	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 0;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_nivel_eduCliente.add(jLabelid_tipo_nivel_eduCliente, this.gridBagConstraintsCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 2;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_nivel_eduCliente.add(jButtonid_tipo_nivel_eduClienteBusqueda, this.gridBagConstraintsCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 3;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_nivel_eduCliente.add(jButtonid_tipo_nivel_eduClienteUpdate, this.gridBagConstraintsCliente);
	}

	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 1;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_nivel_eduCliente.add(jComboBoxid_tipo_nivel_eduCliente, this.gridBagConstraintsCliente);


	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 0;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_profesionCliente.add(jLabelid_profesionCliente, this.gridBagConstraintsCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 2;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_profesionCliente.add(jButtonid_profesionClienteBusqueda, this.gridBagConstraintsCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 3;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_profesionCliente.add(jButtonid_profesionClienteUpdate, this.gridBagConstraintsCliente);
	}

	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 1;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_profesionCliente.add(jComboBoxid_profesionCliente, this.gridBagConstraintsCliente);


	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 0;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_generoCliente.add(jLabelid_tipo_generoCliente, this.gridBagConstraintsCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 2;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_generoCliente.add(jButtonid_tipo_generoClienteBusqueda, this.gridBagConstraintsCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 3;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_generoCliente.add(jButtonid_tipo_generoClienteUpdate, this.gridBagConstraintsCliente);
	}

	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 1;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_generoCliente.add(jComboBoxid_tipo_generoCliente, this.gridBagConstraintsCliente);


	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 0;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estado_civilCliente.add(jLabelid_estado_civilCliente, this.gridBagConstraintsCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 2;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_civilCliente.add(jButtonid_estado_civilClienteBusqueda, this.gridBagConstraintsCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 3;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_civilCliente.add(jButtonid_estado_civilClienteUpdate, this.gridBagConstraintsCliente);
	}

	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 1;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estado_civilCliente.add(jComboBoxid_estado_civilCliente, this.gridBagConstraintsCliente);


	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 0;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estado_legalCliente.add(jLabelid_estado_legalCliente, this.gridBagConstraintsCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 2;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_legalCliente.add(jButtonid_estado_legalClienteBusqueda, this.gridBagConstraintsCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 3;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_legalCliente.add(jButtonid_estado_legalClienteUpdate, this.gridBagConstraintsCliente);
	}

	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 1;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estado_legalCliente.add(jComboBoxid_estado_legalCliente, this.gridBagConstraintsCliente);


	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 0;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_nacimientoCliente.add(jLabelfecha_nacimientoCliente, this.gridBagConstraintsCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 2;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_nacimientoCliente.add(jButtonfecha_nacimientoClienteBusqueda, this.gridBagConstraintsCliente);
	}

	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 1;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_nacimientoCliente.add(jDateChooserfecha_nacimientoCliente, this.gridBagConstraintsCliente);


	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 0;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelpath_imagen_firmaCliente.add(jLabelpath_imagen_firmaCliente, this.gridBagConstraintsCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 2;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelpath_imagen_firmaCliente.add(jButtonpath_imagen_firmaClienteBusqueda, this.gridBagConstraintsCliente);
	}

	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 1;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelpath_imagen_firmaCliente.add(jscrollPanepath_imagen_firmaCliente, this.gridBagConstraintsCliente);


	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 0;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcontactoCliente.add(jLabelcontactoCliente, this.gridBagConstraintsCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 2;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelcontactoCliente.add(jButtoncontactoClienteBusqueda, this.gridBagConstraintsCliente);
	}

	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 1;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcontactoCliente.add(jscrollPanecontactoCliente, this.gridBagConstraintsCliente);


	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 0;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contableCliente.add(jLabelid_cuenta_contableCliente, this.gridBagConstraintsCliente);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsCliente = new GridBagConstraints();
	//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 2;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contableCliente.add(jButtonid_cuenta_contableCliente, this.gridBagConstraintsCliente);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsCliente = new GridBagConstraints();
	//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 3;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contableCliente.add(jButtonid_cuenta_contableClienteArbol, this.gridBagConstraintsCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 4;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableCliente.add(jButtonid_cuenta_contableClienteBusqueda, this.gridBagConstraintsCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 5;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableCliente.add(jButtonid_cuenta_contableClienteUpdate, this.gridBagConstraintsCliente);
	}

	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 1;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contableCliente.add(jComboBoxid_cuenta_contableCliente, this.gridBagConstraintsCliente);


	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 0;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_rutaCliente.add(jLabelid_rutaCliente, this.gridBagConstraintsCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 2;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_rutaCliente.add(jButtonid_rutaClienteBusqueda, this.gridBagConstraintsCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 3;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_rutaCliente.add(jButtonid_rutaClienteUpdate, this.gridBagConstraintsCliente);
	}

	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 1;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_rutaCliente.add(jComboBoxid_rutaCliente, this.gridBagConstraintsCliente);


	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 0;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_vendedorCliente.add(jLabelid_vendedorCliente, this.gridBagConstraintsCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 2;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_vendedorCliente.add(jButtonid_vendedorClienteBusqueda, this.gridBagConstraintsCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 3;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_vendedorCliente.add(jButtonid_vendedorClienteUpdate, this.gridBagConstraintsCliente);
	}

	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 1;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_vendedorCliente.add(jComboBoxid_vendedorCliente, this.gridBagConstraintsCliente);


	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 0;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_centro_actividadCliente.add(jLabelid_centro_actividadCliente, this.gridBagConstraintsCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 2;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_actividadCliente.add(jButtonid_centro_actividadClienteBusqueda, this.gridBagConstraintsCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 3;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_actividadCliente.add(jButtonid_centro_actividadClienteUpdate, this.gridBagConstraintsCliente);
	}

	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 1;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_centro_actividadCliente.add(jComboBoxid_centro_actividadCliente, this.gridBagConstraintsCliente);


	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 0;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelrepresentanteCliente.add(jLabelrepresentanteCliente, this.gridBagConstraintsCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 2;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelrepresentanteCliente.add(jButtonrepresentanteClienteBusqueda, this.gridBagConstraintsCliente);
	}

	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 1;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelrepresentanteCliente.add(jscrollPanerepresentanteCliente, this.gridBagConstraintsCliente);


	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 0;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_garantia_empresaCliente.add(jLabelid_tipo_garantia_empresaCliente, this.gridBagConstraintsCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 2;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_garantia_empresaCliente.add(jButtonid_tipo_garantia_empresaClienteBusqueda, this.gridBagConstraintsCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 3;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_garantia_empresaCliente.add(jButtonid_tipo_garantia_empresaClienteUpdate, this.gridBagConstraintsCliente);
	}

	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 1;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_garantia_empresaCliente.add(jComboBoxid_tipo_garantia_empresaCliente, this.gridBagConstraintsCliente);


	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 0;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_garantiaCliente.add(jLabelnombre_garantiaCliente, this.gridBagConstraintsCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 2;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_garantiaCliente.add(jButtonnombre_garantiaClienteBusqueda, this.gridBagConstraintsCliente);
	}

	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 1;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_garantiaCliente.add(jscrollPanenombre_garantiaCliente, this.gridBagConstraintsCliente);


	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 0;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_garantiaCliente.add(jLabelvalor_garantiaCliente, this.gridBagConstraintsCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 2;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_garantiaCliente.add(jButtonvalor_garantiaClienteBusqueda, this.gridBagConstraintsCliente);
	}

	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 1;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_garantiaCliente.add(jTextFieldvalor_garantiaCliente, this.gridBagConstraintsCliente);


	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 0;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cate_tipo_afiliacionCliente.add(jLabelid_cate_tipo_afiliacionCliente, this.gridBagConstraintsCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 2;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cate_tipo_afiliacionCliente.add(jButtonid_cate_tipo_afiliacionClienteBusqueda, this.gridBagConstraintsCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 3;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cate_tipo_afiliacionCliente.add(jButtonid_cate_tipo_afiliacionClienteUpdate, this.gridBagConstraintsCliente);
	}

	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 1;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cate_tipo_afiliacionCliente.add(jComboBoxid_cate_tipo_afiliacionCliente, this.gridBagConstraintsCliente);


	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 0;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_cargaCliente.add(jLabelnumero_cargaCliente, this.gridBagConstraintsCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 2;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_cargaCliente.add(jButtonnumero_cargaClienteBusqueda, this.gridBagConstraintsCliente);
	}

	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 1;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_cargaCliente.add(jTextFieldnumero_cargaCliente, this.gridBagConstraintsCliente);


	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 0;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcredito_usadoCliente.add(jLabelcredito_usadoCliente, this.gridBagConstraintsCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 2;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelcredito_usadoCliente.add(jButtoncredito_usadoClienteBusqueda, this.gridBagConstraintsCliente);
	}

	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 1;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcredito_usadoCliente.add(jTextFieldcredito_usadoCliente, this.gridBagConstraintsCliente);


	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 0;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanellimite_creditoCliente.add(jLabellimite_creditoCliente, this.gridBagConstraintsCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 2;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanellimite_creditoCliente.add(jButtonlimite_creditoClienteBusqueda, this.gridBagConstraintsCliente);
	}

	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 1;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanellimite_creditoCliente.add(jTextFieldlimite_creditoCliente, this.gridBagConstraintsCliente);


	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 0;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcredito_disponibleCliente.add(jLabelcredito_disponibleCliente, this.gridBagConstraintsCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 2;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelcredito_disponibleCliente.add(jButtoncredito_disponibleClienteBusqueda, this.gridBagConstraintsCliente);
	}

	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 1;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcredito_disponibleCliente.add(jTextFieldcredito_disponibleCliente, this.gridBagConstraintsCliente);


	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 0;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_documentosCliente.add(jLabeltotal_documentosCliente, this.gridBagConstraintsCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 2;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_documentosCliente.add(jButtontotal_documentosClienteBusqueda, this.gridBagConstraintsCliente);
	}

	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 1;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_documentosCliente.add(jTextFieldtotal_documentosCliente, this.gridBagConstraintsCliente);


	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 0;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_ultima_facturaCliente.add(jLabelfecha_ultima_facturaCliente, this.gridBagConstraintsCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 2;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_ultima_facturaCliente.add(jButtonfecha_ultima_facturaClienteBusqueda, this.gridBagConstraintsCliente);
	}

	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 1;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_ultima_facturaCliente.add(jDateChooserfecha_ultima_facturaCliente, this.gridBagConstraintsCliente);


	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 0;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescuentoCliente.add(jLabeldescuentoCliente, this.gridBagConstraintsCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 2;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuentoCliente.add(jButtondescuentoClienteBusqueda, this.gridBagConstraintsCliente);
	}

	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 1;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescuentoCliente.add(jTextFielddescuentoCliente, this.gridBagConstraintsCliente);


	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 0;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_diaCliente.add(jLabelid_diaCliente, this.gridBagConstraintsCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 2;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_diaCliente.add(jButtonid_diaClienteBusqueda, this.gridBagConstraintsCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 3;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_diaCliente.add(jButtonid_diaClienteUpdate, this.gridBagConstraintsCliente);
	}

	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 1;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_diaCliente.add(jComboBoxid_diaCliente, this.gridBagConstraintsCliente);


	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 0;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelhora_pagoCliente.add(jLabelhora_pagoCliente, this.gridBagConstraintsCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 2;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelhora_pagoCliente.add(jButtonhora_pagoClienteBusqueda, this.gridBagConstraintsCliente);
	}

	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 1;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelhora_pagoCliente.add(jSpinnerhora_pagoCliente, this.gridBagConstraintsCliente);


	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 0;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleadoCliente.add(jLabelid_empleadoCliente, this.gridBagConstraintsCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 2;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoCliente.add(jButtonid_empleadoClienteBusqueda, this.gridBagConstraintsCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 3;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoCliente.add(jButtonid_empleadoClienteUpdate, this.gridBagConstraintsCliente);
	}

	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 1;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleadoCliente.add(jComboBoxid_empleadoCliente, this.gridBagConstraintsCliente);


	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 0;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcobranzasCliente.add(jLabelcobranzasCliente, this.gridBagConstraintsCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 2;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelcobranzasCliente.add(jButtoncobranzasClienteBusqueda, this.gridBagConstraintsCliente);
	}

	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 1;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcobranzasCliente.add(jscrollPanecobranzasCliente, this.gridBagConstraintsCliente);


	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 0;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelmotivoCliente.add(jLabelmotivoCliente, this.gridBagConstraintsCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 2;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelmotivoCliente.add(jButtonmotivoClienteBusqueda, this.gridBagConstraintsCliente);
	}

	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 1;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelmotivoCliente.add(jscrollPanemotivoCliente, this.gridBagConstraintsCliente);


	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 0;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelpreferenciaCliente.add(jLabelpreferenciaCliente, this.gridBagConstraintsCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 2;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelpreferenciaCliente.add(jButtonpreferenciaClienteBusqueda, this.gridBagConstraintsCliente);
	}

	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 1;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelpreferenciaCliente.add(jscrollPanepreferenciaCliente, this.gridBagConstraintsCliente);


	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 0;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_separacion_bienesCliente.add(jLabelcon_separacion_bienesCliente, this.gridBagConstraintsCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 2;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_separacion_bienesCliente.add(jButtoncon_separacion_bienesClienteBusqueda, this.gridBagConstraintsCliente);
	}

	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 1;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_separacion_bienesCliente.add(jCheckBoxcon_separacion_bienesCliente, this.gridBagConstraintsCliente);


	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 0;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_precioCliente.add(jLabelid_tipo_precioCliente, this.gridBagConstraintsCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 2;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_precioCliente.add(jButtonid_tipo_precioClienteBusqueda, this.gridBagConstraintsCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 3;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_precioCliente.add(jButtonid_tipo_precioClienteUpdate, this.gridBagConstraintsCliente);
	}

	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 1;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_precioCliente.add(jComboBoxid_tipo_precioCliente, this.gridBagConstraintsCliente);


	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 0;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_lista_precioCliente.add(jLabelid_tipo_lista_precioCliente, this.gridBagConstraintsCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 2;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_lista_precioCliente.add(jButtonid_tipo_lista_precioClienteBusqueda, this.gridBagConstraintsCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 3;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_lista_precioCliente.add(jButtonid_tipo_lista_precioClienteUpdate, this.gridBagConstraintsCliente);
	}

	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 1;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_lista_precioCliente.add(jComboBoxid_tipo_lista_precioCliente, this.gridBagConstraintsCliente);


	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 0;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldetalle_estadoCliente.add(jLabeldetalle_estadoCliente, this.gridBagConstraintsCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 2;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPaneldetalle_estadoCliente.add(jButtondetalle_estadoClienteBusqueda, this.gridBagConstraintsCliente);
	}

	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 1;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldetalle_estadoCliente.add(jscrollPanedetalle_estadoCliente, this.gridBagConstraintsCliente);


	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 0;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_contribuyente_especialCliente.add(jLabeles_contribuyente_especialCliente, this.gridBagConstraintsCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCliente = new GridBagConstraints();
		//this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = 2;
		this.gridBagConstraintsCliente.ipadx = 0;
		this.gridBagConstraintsCliente.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_contribuyente_especialCliente.add(jButtones_contribuyente_especialClienteBusqueda, this.gridBagConstraintsCliente);
	}

	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCliente.gridy = 0;
	this.gridBagConstraintsCliente.gridx = 1;
	this.gridBagConstraintsCliente.ipadx = 0;
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_contribuyente_especialCliente.add(jCheckBoxes_contribuyente_especialCliente, this.gridBagConstraintsCliente);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCliente.gridy = iYPanelCamposOcultosCliente;
	this.gridBagConstraintsCliente.gridx = iXPanelCamposOcultosCliente++;
	this.gridBagConstraintsCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCliente.add(this.jPanelid_empresaCliente, this.gridBagConstraintsCliente);



	if(iXPanelCamposOcultosCliente % 2==0) {
		iXPanelCamposOcultosCliente=0;
		iYPanelCamposOcultosCliente++;
	}
	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCliente.gridy = iYPanelCamposOcultosCliente;
	this.gridBagConstraintsCliente.gridx = iXPanelCamposOcultosCliente++;
	this.gridBagConstraintsCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCliente.add(this.jPanelid_sucursalCliente, this.gridBagConstraintsCliente);



	if(iXPanelCamposOcultosCliente % 2==0) {
		iXPanelCamposOcultosCliente=0;
		iYPanelCamposOcultosCliente++;
	}
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCliente.gridy = iYPanelCamposIniciogeneralCliente;
	this.gridBagConstraintsCliente.gridx = iXPanelCamposIniciogeneralCliente++;
	this.gridBagConstraintsCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralCliente.add(this.jPanelidCliente, this.gridBagConstraintsCliente);



	if(iXPanelCamposIniciogeneralCliente % 2==0) {
		iXPanelCamposIniciogeneralCliente=0;
		iYPanelCamposIniciogeneralCliente++;
	}
	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCliente.gridy = iYPanelCamposIniciogeneralCliente;
	this.gridBagConstraintsCliente.gridx = iXPanelCamposIniciogeneralCliente++;
	this.gridBagConstraintsCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralCliente.add(this.jPanelcodigoCliente, this.gridBagConstraintsCliente);



	if(iXPanelCamposIniciogeneralCliente % 2==0) {
		iXPanelCamposIniciogeneralCliente=0;
		iYPanelCamposIniciogeneralCliente++;
	}
	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCliente.gridy = iYPanelCamposIniciogeneralCliente;
	this.gridBagConstraintsCliente.gridx = iXPanelCamposIniciogeneralCliente++;
	this.gridBagConstraintsCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralCliente.add(this.jPanelid_tipo_identificacionCliente, this.gridBagConstraintsCliente);



	if(iXPanelCamposIniciogeneralCliente % 2==0) {
		iXPanelCamposIniciogeneralCliente=0;
		iYPanelCamposIniciogeneralCliente++;
	}
	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCliente.gridy = iYPanelCamposIniciogeneralCliente;
	this.gridBagConstraintsCliente.gridx = iXPanelCamposIniciogeneralCliente++;
	this.gridBagConstraintsCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralCliente.add(this.jPanelidentificacionCliente, this.gridBagConstraintsCliente);



	if(iXPanelCamposIniciogeneralCliente % 2==0) {
		iXPanelCamposIniciogeneralCliente=0;
		iYPanelCamposIniciogeneralCliente++;
	}
	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCliente.gridy = iYPanelCamposIniciogeneralCliente;
	this.gridBagConstraintsCliente.gridx = iXPanelCamposIniciogeneralCliente++;
	this.gridBagConstraintsCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralCliente.add(this.jPanelrucCliente, this.gridBagConstraintsCliente);



	if(iXPanelCamposIniciogeneralCliente % 2==0) {
		iXPanelCamposIniciogeneralCliente=0;
		iYPanelCamposIniciogeneralCliente++;
	}
	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCliente.gridy = iYPanelCamposIniciogeneralCliente;
	this.gridBagConstraintsCliente.gridx = iXPanelCamposIniciogeneralCliente++;
	this.gridBagConstraintsCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralCliente.add(this.jPanelnombreCliente, this.gridBagConstraintsCliente);



	if(iXPanelCamposIniciogeneralCliente % 2==0) {
		iXPanelCamposIniciogeneralCliente=0;
		iYPanelCamposIniciogeneralCliente++;
	}
	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCliente.gridy = iYPanelCamposIniciogeneralCliente;
	this.gridBagConstraintsCliente.gridx = iXPanelCamposIniciogeneralCliente++;
	this.gridBagConstraintsCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralCliente.add(this.jPanelapellidoCliente, this.gridBagConstraintsCliente);



	if(iXPanelCamposIniciogeneralCliente % 2==0) {
		iXPanelCamposIniciogeneralCliente=0;
		iYPanelCamposIniciogeneralCliente++;
	}
	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCliente.gridy = iYPanelCamposIniciogeneralCliente;
	this.gridBagConstraintsCliente.gridx = iXPanelCamposIniciogeneralCliente++;
	this.gridBagConstraintsCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralCliente.add(this.jPanelnombre_completoCliente, this.gridBagConstraintsCliente);



	if(iXPanelCamposIniciogeneralCliente % 2==0) {
		iXPanelCamposIniciogeneralCliente=0;
		iYPanelCamposIniciogeneralCliente++;
	}
	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCliente.gridy = iYPanelCamposIniciogeneralCliente;
	this.gridBagConstraintsCliente.gridx = iXPanelCamposIniciogeneralCliente++;
	this.gridBagConstraintsCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralCliente.add(this.jPanelnombre_comercialCliente, this.gridBagConstraintsCliente);



	if(iXPanelCamposIniciogeneralCliente % 2==0) {
		iXPanelCamposIniciogeneralCliente=0;
		iYPanelCamposIniciogeneralCliente++;
	}
	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCliente.gridy = iYPanelCamposIniciogeneralCliente;
	this.gridBagConstraintsCliente.gridx = iXPanelCamposIniciogeneralCliente++;
	this.gridBagConstraintsCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralCliente.add(this.jPaneltelefonoCliente, this.gridBagConstraintsCliente);



	if(iXPanelCamposIniciogeneralCliente % 2==0) {
		iXPanelCamposIniciogeneralCliente=0;
		iYPanelCamposIniciogeneralCliente++;
	}
	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCliente.gridy = iYPanelCamposIniciogeneralCliente;
	this.gridBagConstraintsCliente.gridx = iXPanelCamposIniciogeneralCliente++;
	this.gridBagConstraintsCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralCliente.add(this.jPaneldireccionCliente, this.gridBagConstraintsCliente);



	if(iXPanelCamposIniciogeneralCliente % 2==0) {
		iXPanelCamposIniciogeneralCliente=0;
		iYPanelCamposIniciogeneralCliente++;
	}
	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCliente.gridy = iYPanelCamposIniciogeneralCliente;
	this.gridBagConstraintsCliente.gridx = iXPanelCamposIniciogeneralCliente++;
	this.gridBagConstraintsCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralCliente.add(this.jPaneles_proveCliente, this.gridBagConstraintsCliente);



	if(iXPanelCamposIniciogeneralCliente % 2==0) {
		iXPanelCamposIniciogeneralCliente=0;
		iYPanelCamposIniciogeneralCliente++;
	}
	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCliente.gridy = iYPanelCamposIniciogeneralCliente;
	this.gridBagConstraintsCliente.gridx = iXPanelCamposIniciogeneralCliente++;
	this.gridBagConstraintsCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralCliente.add(this.jPanelid_grupo_clienteCliente, this.gridBagConstraintsCliente);



	if(iXPanelCamposIniciogeneralCliente % 2==0) {
		iXPanelCamposIniciogeneralCliente=0;
		iYPanelCamposIniciogeneralCliente++;
	}
	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCliente.gridy = iYPanelCamposIniciogeneralCliente;
	this.gridBagConstraintsCliente.gridx = iXPanelCamposIniciogeneralCliente++;
	this.gridBagConstraintsCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralCliente.add(this.jPanelid_titulo_clienteCliente, this.gridBagConstraintsCliente);



	if(iXPanelCamposIniciogeneralCliente % 2==0) {
		iXPanelCamposIniciogeneralCliente=0;
		iYPanelCamposIniciogeneralCliente++;
	}
	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCliente.gridy = iYPanelCamposIniciogeneralCliente;
	this.gridBagConstraintsCliente.gridx = iXPanelCamposIniciogeneralCliente++;
	this.gridBagConstraintsCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralCliente.add(this.jPanelid_area_crCliente, this.gridBagConstraintsCliente);



	if(iXPanelCamposIniciogeneralCliente % 2==0) {
		iXPanelCamposIniciogeneralCliente=0;
		iYPanelCamposIniciogeneralCliente++;
	}
	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCliente.gridy = iYPanelCamposIniciogeneralCliente;
	this.gridBagConstraintsCliente.gridx = iXPanelCamposIniciogeneralCliente++;
	this.gridBagConstraintsCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralCliente.add(this.jPanelid_estado_clienteCliente, this.gridBagConstraintsCliente);



	if(iXPanelCamposIniciogeneralCliente % 2==0) {
		iXPanelCamposIniciogeneralCliente=0;
		iYPanelCamposIniciogeneralCliente++;
	}
	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCliente.gridy = iYPanelCamposIniciogeneralCliente;
	this.gridBagConstraintsCliente.gridx = iXPanelCamposIniciogeneralCliente++;
	this.gridBagConstraintsCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralCliente.add(this.jPanelobservacionCliente, this.gridBagConstraintsCliente);



	if(iXPanelCamposIniciogeneralCliente % 2==0) {
		iXPanelCamposIniciogeneralCliente=0;
		iYPanelCamposIniciogeneralCliente++;
	}
	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCliente.gridy = iYPanelCamposInicioubicacionCliente;
	this.gridBagConstraintsCliente.gridx = iXPanelCamposInicioubicacionCliente++;
	this.gridBagConstraintsCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioubicacionCliente.add(this.jPanelid_paisCliente, this.gridBagConstraintsCliente);



	if(iXPanelCamposInicioubicacionCliente % 2==0) {
		iXPanelCamposInicioubicacionCliente=0;
		iYPanelCamposInicioubicacionCliente++;
	}
	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCliente.gridy = iYPanelCamposInicioubicacionCliente;
	this.gridBagConstraintsCliente.gridx = iXPanelCamposInicioubicacionCliente++;
	this.gridBagConstraintsCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioubicacionCliente.add(this.jPanelid_regionCliente, this.gridBagConstraintsCliente);



	if(iXPanelCamposInicioubicacionCliente % 2==0) {
		iXPanelCamposInicioubicacionCliente=0;
		iYPanelCamposInicioubicacionCliente++;
	}
	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCliente.gridy = iYPanelCamposInicioubicacionCliente;
	this.gridBagConstraintsCliente.gridx = iXPanelCamposInicioubicacionCliente++;
	this.gridBagConstraintsCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioubicacionCliente.add(this.jPanelid_provinciaCliente, this.gridBagConstraintsCliente);



	if(iXPanelCamposInicioubicacionCliente % 2==0) {
		iXPanelCamposInicioubicacionCliente=0;
		iYPanelCamposInicioubicacionCliente++;
	}
	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCliente.gridy = iYPanelCamposInicioubicacionCliente;
	this.gridBagConstraintsCliente.gridx = iXPanelCamposInicioubicacionCliente++;
	this.gridBagConstraintsCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioubicacionCliente.add(this.jPanelid_ciudadCliente, this.gridBagConstraintsCliente);



	if(iXPanelCamposInicioubicacionCliente % 2==0) {
		iXPanelCamposInicioubicacionCliente=0;
		iYPanelCamposInicioubicacionCliente++;
	}
	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCliente.gridy = iYPanelCamposInicioubicacionCliente;
	this.gridBagConstraintsCliente.gridx = iXPanelCamposInicioubicacionCliente++;
	this.gridBagConstraintsCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioubicacionCliente.add(this.jPanelid_zonaCliente, this.gridBagConstraintsCliente);



	if(iXPanelCamposInicioubicacionCliente % 2==0) {
		iXPanelCamposInicioubicacionCliente=0;
		iYPanelCamposInicioubicacionCliente++;
	}
	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCliente.gridy = iYPanelCamposInicioubicacionCliente;
	this.gridBagConstraintsCliente.gridx = iXPanelCamposInicioubicacionCliente++;
	this.gridBagConstraintsCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioubicacionCliente.add(this.jPanelid_pais_nacionalidadCliente, this.gridBagConstraintsCliente);



	if(iXPanelCamposInicioubicacionCliente % 2==0) {
		iXPanelCamposInicioubicacionCliente=0;
		iYPanelCamposInicioubicacionCliente++;
	}
	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCliente.gridy = iYPanelCamposIniciopersonalCliente;
	this.gridBagConstraintsCliente.gridx = iXPanelCamposIniciopersonalCliente++;
	this.gridBagConstraintsCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciopersonalCliente.add(this.jPanelid_tipo_cargo_laboCliente, this.gridBagConstraintsCliente);



	if(iXPanelCamposIniciopersonalCliente % 2==0) {
		iXPanelCamposIniciopersonalCliente=0;
		iYPanelCamposIniciopersonalCliente++;
	}
	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCliente.gridy = iYPanelCamposIniciopersonalCliente;
	this.gridBagConstraintsCliente.gridx = iXPanelCamposIniciopersonalCliente++;
	this.gridBagConstraintsCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciopersonalCliente.add(this.jPanelid_tipo_nivel_eduCliente, this.gridBagConstraintsCliente);



	if(iXPanelCamposIniciopersonalCliente % 2==0) {
		iXPanelCamposIniciopersonalCliente=0;
		iYPanelCamposIniciopersonalCliente++;
	}
	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCliente.gridy = iYPanelCamposIniciopersonalCliente;
	this.gridBagConstraintsCliente.gridx = iXPanelCamposIniciopersonalCliente++;
	this.gridBagConstraintsCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciopersonalCliente.add(this.jPanelid_profesionCliente, this.gridBagConstraintsCliente);



	if(iXPanelCamposIniciopersonalCliente % 2==0) {
		iXPanelCamposIniciopersonalCliente=0;
		iYPanelCamposIniciopersonalCliente++;
	}
	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCliente.gridy = iYPanelCamposIniciopersonalCliente;
	this.gridBagConstraintsCliente.gridx = iXPanelCamposIniciopersonalCliente++;
	this.gridBagConstraintsCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciopersonalCliente.add(this.jPanelid_tipo_generoCliente, this.gridBagConstraintsCliente);



	if(iXPanelCamposIniciopersonalCliente % 2==0) {
		iXPanelCamposIniciopersonalCliente=0;
		iYPanelCamposIniciopersonalCliente++;
	}
	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCliente.gridy = iYPanelCamposIniciopersonalCliente;
	this.gridBagConstraintsCliente.gridx = iXPanelCamposIniciopersonalCliente++;
	this.gridBagConstraintsCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciopersonalCliente.add(this.jPanelid_estado_civilCliente, this.gridBagConstraintsCliente);



	if(iXPanelCamposIniciopersonalCliente % 2==0) {
		iXPanelCamposIniciopersonalCliente=0;
		iYPanelCamposIniciopersonalCliente++;
	}
	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCliente.gridy = iYPanelCamposIniciopersonalCliente;
	this.gridBagConstraintsCliente.gridx = iXPanelCamposIniciopersonalCliente++;
	this.gridBagConstraintsCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciopersonalCliente.add(this.jPanelid_estado_legalCliente, this.gridBagConstraintsCliente);



	if(iXPanelCamposIniciopersonalCliente % 2==0) {
		iXPanelCamposIniciopersonalCliente=0;
		iYPanelCamposIniciopersonalCliente++;
	}
	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCliente.gridy = iYPanelCamposIniciopersonalCliente;
	this.gridBagConstraintsCliente.gridx = iXPanelCamposIniciopersonalCliente++;
	this.gridBagConstraintsCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciopersonalCliente.add(this.jPanelfecha_nacimientoCliente, this.gridBagConstraintsCliente);



	if(iXPanelCamposIniciopersonalCliente % 2==0) {
		iXPanelCamposIniciopersonalCliente=0;
		iYPanelCamposIniciopersonalCliente++;
	}
	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCliente.gridy = iYPanelCamposIniciopersonalCliente;
	this.gridBagConstraintsCliente.gridx = iXPanelCamposIniciopersonalCliente++;
	this.gridBagConstraintsCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciopersonalCliente.add(this.jPanelpath_imagen_firmaCliente, this.gridBagConstraintsCliente);



	if(iXPanelCamposIniciopersonalCliente % 2==0) {
		iXPanelCamposIniciopersonalCliente=0;
		iYPanelCamposIniciopersonalCliente++;
	}
	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCliente.gridy = iYPanelCamposIniciopersonalCliente;
	this.gridBagConstraintsCliente.gridx = iXPanelCamposIniciopersonalCliente++;
	this.gridBagConstraintsCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciopersonalCliente.add(this.jPanelcontactoCliente, this.gridBagConstraintsCliente);



	if(iXPanelCamposIniciopersonalCliente % 2==0) {
		iXPanelCamposIniciopersonalCliente=0;
		iYPanelCamposIniciopersonalCliente++;
	}
	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCliente.gridy = iYPanelCamposIniciocontableCliente;
	this.gridBagConstraintsCliente.gridx = iXPanelCamposIniciocontableCliente++;
	this.gridBagConstraintsCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocontableCliente.add(this.jPanelid_cuenta_contableCliente, this.gridBagConstraintsCliente);



	if(iXPanelCamposIniciocontableCliente % 2==0) {
		iXPanelCamposIniciocontableCliente=0;
		iYPanelCamposIniciocontableCliente++;
	}
	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCliente.gridy = iYPanelCamposIniciocontableCliente;
	this.gridBagConstraintsCliente.gridx = iXPanelCamposIniciocontableCliente++;
	this.gridBagConstraintsCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocontableCliente.add(this.jPanelid_rutaCliente, this.gridBagConstraintsCliente);



	if(iXPanelCamposIniciocontableCliente % 2==0) {
		iXPanelCamposIniciocontableCliente=0;
		iYPanelCamposIniciocontableCliente++;
	}
	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCliente.gridy = iYPanelCamposIniciocontableCliente;
	this.gridBagConstraintsCliente.gridx = iXPanelCamposIniciocontableCliente++;
	this.gridBagConstraintsCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocontableCliente.add(this.jPanelid_vendedorCliente, this.gridBagConstraintsCliente);



	if(iXPanelCamposIniciocontableCliente % 2==0) {
		iXPanelCamposIniciocontableCliente=0;
		iYPanelCamposIniciocontableCliente++;
	}
	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCliente.gridy = iYPanelCamposIniciocontableCliente;
	this.gridBagConstraintsCliente.gridx = iXPanelCamposIniciocontableCliente++;
	this.gridBagConstraintsCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocontableCliente.add(this.jPanelid_centro_actividadCliente, this.gridBagConstraintsCliente);



	if(iXPanelCamposIniciocontableCliente % 2==0) {
		iXPanelCamposIniciocontableCliente=0;
		iYPanelCamposIniciocontableCliente++;
	}
	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCliente.gridy = iYPanelCamposIniciocontableCliente;
	this.gridBagConstraintsCliente.gridx = iXPanelCamposIniciocontableCliente++;
	this.gridBagConstraintsCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocontableCliente.add(this.jPanelrepresentanteCliente, this.gridBagConstraintsCliente);



	if(iXPanelCamposIniciocontableCliente % 2==0) {
		iXPanelCamposIniciocontableCliente=0;
		iYPanelCamposIniciocontableCliente++;
	}
	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCliente.gridy = iYPanelCamposIniciocontableCliente;
	this.gridBagConstraintsCliente.gridx = iXPanelCamposIniciocontableCliente++;
	this.gridBagConstraintsCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocontableCliente.add(this.jPanelid_tipo_garantia_empresaCliente, this.gridBagConstraintsCliente);



	if(iXPanelCamposIniciocontableCliente % 2==0) {
		iXPanelCamposIniciocontableCliente=0;
		iYPanelCamposIniciocontableCliente++;
	}
	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCliente.gridy = iYPanelCamposIniciocontableCliente;
	this.gridBagConstraintsCliente.gridx = iXPanelCamposIniciocontableCliente++;
	this.gridBagConstraintsCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocontableCliente.add(this.jPanelnombre_garantiaCliente, this.gridBagConstraintsCliente);



	if(iXPanelCamposIniciocontableCliente % 2==0) {
		iXPanelCamposIniciocontableCliente=0;
		iYPanelCamposIniciocontableCliente++;
	}
	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCliente.gridy = iYPanelCamposIniciocontableCliente;
	this.gridBagConstraintsCliente.gridx = iXPanelCamposIniciocontableCliente++;
	this.gridBagConstraintsCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocontableCliente.add(this.jPanelvalor_garantiaCliente, this.gridBagConstraintsCliente);



	if(iXPanelCamposIniciocontableCliente % 2==0) {
		iXPanelCamposIniciocontableCliente=0;
		iYPanelCamposIniciocontableCliente++;
	}
	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCliente.gridy = iYPanelCamposIniciocontableCliente;
	this.gridBagConstraintsCliente.gridx = iXPanelCamposIniciocontableCliente++;
	this.gridBagConstraintsCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocontableCliente.add(this.jPanelid_cate_tipo_afiliacionCliente, this.gridBagConstraintsCliente);



	if(iXPanelCamposIniciocontableCliente % 2==0) {
		iXPanelCamposIniciocontableCliente=0;
		iYPanelCamposIniciocontableCliente++;
	}
	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCliente.gridy = iYPanelCamposIniciocontableCliente;
	this.gridBagConstraintsCliente.gridx = iXPanelCamposIniciocontableCliente++;
	this.gridBagConstraintsCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocontableCliente.add(this.jPanelnumero_cargaCliente, this.gridBagConstraintsCliente);



	if(iXPanelCamposIniciocontableCliente % 2==0) {
		iXPanelCamposIniciocontableCliente=0;
		iYPanelCamposIniciocontableCliente++;
	}
	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCliente.gridy = iYPanelCamposIniciocontableCliente;
	this.gridBagConstraintsCliente.gridx = iXPanelCamposIniciocontableCliente++;
	this.gridBagConstraintsCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocontableCliente.add(this.jPanelcredito_usadoCliente, this.gridBagConstraintsCliente);



	if(iXPanelCamposIniciocontableCliente % 2==0) {
		iXPanelCamposIniciocontableCliente=0;
		iYPanelCamposIniciocontableCliente++;
	}
	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCliente.gridy = iYPanelCamposIniciocontableCliente;
	this.gridBagConstraintsCliente.gridx = iXPanelCamposIniciocontableCliente++;
	this.gridBagConstraintsCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocontableCliente.add(this.jPanellimite_creditoCliente, this.gridBagConstraintsCliente);



	if(iXPanelCamposIniciocontableCliente % 2==0) {
		iXPanelCamposIniciocontableCliente=0;
		iYPanelCamposIniciocontableCliente++;
	}
	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCliente.gridy = iYPanelCamposIniciocontableCliente;
	this.gridBagConstraintsCliente.gridx = iXPanelCamposIniciocontableCliente++;
	this.gridBagConstraintsCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocontableCliente.add(this.jPanelcredito_disponibleCliente, this.gridBagConstraintsCliente);



	if(iXPanelCamposIniciocontableCliente % 2==0) {
		iXPanelCamposIniciocontableCliente=0;
		iYPanelCamposIniciocontableCliente++;
	}
	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCliente.gridy = iYPanelCamposIniciocontableCliente;
	this.gridBagConstraintsCliente.gridx = iXPanelCamposIniciocontableCliente++;
	this.gridBagConstraintsCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocontableCliente.add(this.jPaneltotal_documentosCliente, this.gridBagConstraintsCliente);



	if(iXPanelCamposIniciocontableCliente % 2==0) {
		iXPanelCamposIniciocontableCliente=0;
		iYPanelCamposIniciocontableCliente++;
	}
	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCliente.gridy = iYPanelCamposIniciofacturaCliente;
	this.gridBagConstraintsCliente.gridx = iXPanelCamposIniciofacturaCliente++;
	this.gridBagConstraintsCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciofacturaCliente.add(this.jPanelfecha_ultima_facturaCliente, this.gridBagConstraintsCliente);



	if(iXPanelCamposIniciofacturaCliente % 2==0) {
		iXPanelCamposIniciofacturaCliente=0;
		iYPanelCamposIniciofacturaCliente++;
	}
	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCliente.gridy = iYPanelCamposIniciofacturaCliente;
	this.gridBagConstraintsCliente.gridx = iXPanelCamposIniciofacturaCliente++;
	this.gridBagConstraintsCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciofacturaCliente.add(this.jPaneldescuentoCliente, this.gridBagConstraintsCliente);



	if(iXPanelCamposIniciofacturaCliente % 2==0) {
		iXPanelCamposIniciofacturaCliente=0;
		iYPanelCamposIniciofacturaCliente++;
	}
	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCliente.gridy = iYPanelCamposIniciofacturaCliente;
	this.gridBagConstraintsCliente.gridx = iXPanelCamposIniciofacturaCliente++;
	this.gridBagConstraintsCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciofacturaCliente.add(this.jPanelid_diaCliente, this.gridBagConstraintsCliente);



	if(iXPanelCamposIniciofacturaCliente % 2==0) {
		iXPanelCamposIniciofacturaCliente=0;
		iYPanelCamposIniciofacturaCliente++;
	}
	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCliente.gridy = iYPanelCamposIniciofacturaCliente;
	this.gridBagConstraintsCliente.gridx = iXPanelCamposIniciofacturaCliente++;
	this.gridBagConstraintsCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciofacturaCliente.add(this.jPanelhora_pagoCliente, this.gridBagConstraintsCliente);



	if(iXPanelCamposIniciofacturaCliente % 2==0) {
		iXPanelCamposIniciofacturaCliente=0;
		iYPanelCamposIniciofacturaCliente++;
	}
	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCliente.gridy = iYPanelCamposIniciofacturaCliente;
	this.gridBagConstraintsCliente.gridx = iXPanelCamposIniciofacturaCliente++;
	this.gridBagConstraintsCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciofacturaCliente.add(this.jPanelid_empleadoCliente, this.gridBagConstraintsCliente);



	if(iXPanelCamposIniciofacturaCliente % 2==0) {
		iXPanelCamposIniciofacturaCliente=0;
		iYPanelCamposIniciofacturaCliente++;
	}
	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCliente.gridy = iYPanelCamposIniciofacturaCliente;
	this.gridBagConstraintsCliente.gridx = iXPanelCamposIniciofacturaCliente++;
	this.gridBagConstraintsCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciofacturaCliente.add(this.jPanelcobranzasCliente, this.gridBagConstraintsCliente);



	if(iXPanelCamposIniciofacturaCliente % 2==0) {
		iXPanelCamposIniciofacturaCliente=0;
		iYPanelCamposIniciofacturaCliente++;
	}
	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCliente.gridy = iYPanelCamposIniciofacturaCliente;
	this.gridBagConstraintsCliente.gridx = iXPanelCamposIniciofacturaCliente++;
	this.gridBagConstraintsCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciofacturaCliente.add(this.jPanelmotivoCliente, this.gridBagConstraintsCliente);



	if(iXPanelCamposIniciofacturaCliente % 2==0) {
		iXPanelCamposIniciofacturaCliente=0;
		iYPanelCamposIniciofacturaCliente++;
	}
	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCliente.gridy = iYPanelCamposIniciofacturaCliente;
	this.gridBagConstraintsCliente.gridx = iXPanelCamposIniciofacturaCliente++;
	this.gridBagConstraintsCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciofacturaCliente.add(this.jPanelpreferenciaCliente, this.gridBagConstraintsCliente);



	if(iXPanelCamposIniciofacturaCliente % 2==0) {
		iXPanelCamposIniciofacturaCliente=0;
		iYPanelCamposIniciofacturaCliente++;
	}
	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCliente.gridy = iYPanelCamposIniciofacturaCliente;
	this.gridBagConstraintsCliente.gridx = iXPanelCamposIniciofacturaCliente++;
	this.gridBagConstraintsCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciofacturaCliente.add(this.jPanelcon_separacion_bienesCliente, this.gridBagConstraintsCliente);



	if(iXPanelCamposIniciofacturaCliente % 2==0) {
		iXPanelCamposIniciofacturaCliente=0;
		iYPanelCamposIniciofacturaCliente++;
	}
	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCliente.gridy = iYPanelCamposIniciofacturaCliente;
	this.gridBagConstraintsCliente.gridx = iXPanelCamposIniciofacturaCliente++;
	this.gridBagConstraintsCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciofacturaCliente.add(this.jPanelid_tipo_precioCliente, this.gridBagConstraintsCliente);



	if(iXPanelCamposIniciofacturaCliente % 2==0) {
		iXPanelCamposIniciofacturaCliente=0;
		iYPanelCamposIniciofacturaCliente++;
	}
	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCliente.gridy = iYPanelCamposIniciofacturaCliente;
	this.gridBagConstraintsCliente.gridx = iXPanelCamposIniciofacturaCliente++;
	this.gridBagConstraintsCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciofacturaCliente.add(this.jPanelid_tipo_lista_precioCliente, this.gridBagConstraintsCliente);



	if(iXPanelCamposIniciofacturaCliente % 2==0) {
		iXPanelCamposIniciofacturaCliente=0;
		iYPanelCamposIniciofacturaCliente++;
	}
	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCliente.gridy = iYPanelCamposIniciofacturaCliente;
	this.gridBagConstraintsCliente.gridx = iXPanelCamposIniciofacturaCliente++;
	this.gridBagConstraintsCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciofacturaCliente.add(this.jPaneldetalle_estadoCliente, this.gridBagConstraintsCliente);



	if(iXPanelCamposIniciofacturaCliente % 2==0) {
		iXPanelCamposIniciofacturaCliente=0;
		iYPanelCamposIniciofacturaCliente++;
	}
	this.gridBagConstraintsCliente = new GridBagConstraints();
	this.gridBagConstraintsCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCliente.gridy = iYPanelCamposIniciofacturaCliente;
	this.gridBagConstraintsCliente.gridx = iXPanelCamposIniciofacturaCliente++;
	this.gridBagConstraintsCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciofacturaCliente.add(this.jPaneles_contribuyente_especialCliente, this.gridBagConstraintsCliente);



	if(iXPanelCamposIniciofacturaCliente % 2==0) {
		iXPanelCamposIniciofacturaCliente=0;
		iYPanelCamposIniciofacturaCliente++;
	}
		
		//SUBPANELES EN PANEL CAMPOS FIN				
		
				
		//SUBPANELES EN PANEL
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
			 		
			
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesCliente= new GridBagLayout();
		this.jPanelAccionesCliente.setLayout(gridaBagLayoutAccionesCliente);
		
		GridBagLayout gridaBagLayoutAccionesFormularioCliente= new GridBagLayout();
		this.jPanelAccionesFormularioCliente.setLayout(gridaBagLayoutAccionesFormularioCliente);
		
		this.gridBagConstraintsCliente = new GridBagConstraints();
		this.gridBagConstraintsCliente.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCliente.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCliente.add(this.jComboBoxTiposAccionesFormularioCliente, this.gridBagConstraintsCliente);

		this.gridBagConstraintsCliente = new GridBagConstraints();
		this.gridBagConstraintsCliente.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCliente.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCliente.add(this.jCheckBoxPostAccionNuevoCliente, this.gridBagConstraintsCliente);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.clienteSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsCliente = new GridBagConstraints();
			this.gridBagConstraintsCliente.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCliente.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCliente.add(this.jCheckBoxPostAccionSinCerrarCliente, this.gridBagConstraintsCliente);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.clienteSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.clienteSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsCliente = new GridBagConstraints();
			this.gridBagConstraintsCliente.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCliente.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCliente.add(this.jCheckBoxPostAccionSinMensajeCliente, this.gridBagConstraintsCliente);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsCliente = new GridBagConstraints();
		this.gridBagConstraintsCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx = iPosXAccion++;
			
		this.jPanelAccionesCliente.add(this.jButtonModificarCliente, this.gridBagConstraintsCliente);							

		this.gridBagConstraintsCliente = new GridBagConstraints();
		this.gridBagConstraintsCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCliente.gridy = 0;
		this.gridBagConstraintsCliente.gridx =iPosXAccion++;
			
		this.jPanelAccionesCliente.add(this.jButtonEliminarCliente, this.gridBagConstraintsCliente);
		
			
		this.gridBagConstraintsCliente = new GridBagConstraints();
		this.gridBagConstraintsCliente.gridy = 0;		
		this.gridBagConstraintsCliente.gridx = iPosXAccion++;
		
		this.jPanelAccionesCliente.add(this.jButtonActualizarCliente, this.gridBagConstraintsCliente);


		this.gridBagConstraintsCliente = new GridBagConstraints();
		this.gridBagConstraintsCliente.gridy = 0;		
		this.gridBagConstraintsCliente.gridx = iPosXAccion++;
		
		this.jPanelAccionesCliente.add(this.jButtonGuardarCambiosCliente, this.gridBagConstraintsCliente);	
		
		this.gridBagConstraintsCliente = new GridBagConstraints();
		this.gridBagConstraintsCliente.gridy = 0;		
		this.gridBagConstraintsCliente.gridx =iPosXAccion++;
		
		this.jPanelAccionesCliente.add(this.jButtonCancelarCliente, this.gridBagConstraintsCliente);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCliente = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCliente);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.clienteSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCliente = new GridBagConstraints();						
			this.gridBagConstraintsCliente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCliente.gridx = 0;		
			//this.gridBagConstraintsCliente.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCliente.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCliente.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsCliente = new GridBagConstraints();
		this.gridBagConstraintsCliente.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCliente.gridx =0;
		this.gridBagConstraintsCliente.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCliente.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCliente, this.gridBagConstraintsCliente);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ClienteJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleCliente = new ClienteBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Cliente DATOS");
			
			this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	        //this.setjInternalFrameParent(this);
	        
			iHeightFormularioMaximo=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	        
	        if(iHeightFormulario>iHeightFormularioMaximo) {
	        	iHeightFormulario=iHeightFormularioMaximo;
	        }
			
			iWidthFormularioMaximo=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
	        
			if(iWidthFormulario>iWidthFormularioMaximo) {
	        	iWidthFormulario=iWidthFormularioMaximo;
	        }
			
	        //this.setTitle("[FOR] - Cliente DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cliente Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ClienteModel clienteModel=new ClienteModel(this);
			
			//SI USARA CLASE INTERNA
			//ClienteModel.ClienteFocusTraversalPolicy clienteFocusTraversalPolicy = clienteModel.new ClienteFocusTraversalPolicy(this);
			
			//clienteFocusTraversalPolicy.setclienteJInternalFrame(this);
			
			this.setFocusTraversalPolicy(clienteModel);
			
			
			this.jContentPaneDetalleCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleCliente = new GridBagLayout();	
			this.jContentPaneDetalleCliente.setLayout(gridaBagLayoutDetalleCliente);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCliente = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsCliente = new GridBagConstraints();
				this.gridBagConstraintsCliente.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsCliente.gridx = 0;
					
				
				this.jContentPaneDetalleCliente.add(jTtoolBarDetalleCliente, gridBagConstraintsCliente);								
				
}
			
			this.jScrollPanelDatosEdicionCliente=   new JScrollPane(jContentPaneDetalleCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralCliente=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCliente = new GridBagConstraints();
			
			
			
			
			
		this.jTabbedPaneCamposCliente.add("General",this.jPanelCamposIniciogeneralCliente);
		this.jTabbedPaneCamposCliente.add("Ubicacion",this.jPanelCamposInicioubicacionCliente);
		this.jTabbedPaneCamposCliente.add("Personal",this.jPanelCamposIniciopersonalCliente);
		this.jTabbedPaneCamposCliente.add("Contable",this.jPanelCamposIniciocontableCliente);
		this.jTabbedPaneCamposCliente.add("Factura",this.jPanelCamposIniciofacturaCliente);
			
			this.gridBagConstraintsCliente = new GridBagConstraints();
						
			this.gridBagConstraintsCliente.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsCliente.gridx = 0;
	        
			this.jContentPaneDetalleCliente.add(jTabbedPaneCamposCliente, gridBagConstraintsCliente);
			
			
			//if(!this.conCargarMinimo) {
			
			;
			//}
						
			this.conMaximoRelaciones=true;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
				
			}									
			
			//CARGA O NO CARGA RELACIONADOS(MAESTRO DETALLE)
									  // ABAJO VIENE DE PARAMETRO GENERAL USUARIO
			if(conMaximoRelaciones) { // && this.conFuncionalidadRelaciones) {
				if(!this.conCargarMinimo) {
					if(cargarRelaciones 
						&& clienteSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameActividadEconomica(this.puedeCargarPorParteActividadEconomica,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameBalanceGeneralCliente(this.puedeCargarPorParteBalanceGeneralCliente,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameBien(this.puedeCargarPorParteBien,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameCargaFamiliar(this.puedeCargarPorParteCargaFamiliar,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameChequePostFechado(this.puedeCargarPorParteChequePostFechado,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameClienteArchivo(this.puedeCargarPorParteClienteArchivo,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameClienteCoa(this.puedeCargarPorParteClienteCoa,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameClienteImagen(this.puedeCargarPorParteClienteImagen,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameConsignatario(this.puedeCargarPorParteConsignatario,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameContactoCliente(this.puedeCargarPorParteContactoCliente,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameConyuge(this.puedeCargarPorParteConyuge,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameCuentaPorCobrar(this.puedeCargarPorParteCuentaPorCobrar,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameDatoConstitucion(this.puedeCargarPorParteDatoConstitucion,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameDireccion(this.puedeCargarPorParteDireccion,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameEMail(this.puedeCargarPorParteEMail,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameFirmaCliente(this.puedeCargarPorParteFirmaCliente,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameGarantiaCliente(this.puedeCargarPorParteGarantiaCliente,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameHobbyCliente(this.puedeCargarPorParteHobbyCliente,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameInformacionEconomica(this.puedeCargarPorParteInformacionEconomica,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameInformacionFinanciera(this.puedeCargarPorParteInformacionFinanciera,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameInformacionLaboral(this.puedeCargarPorParteInformacionLaboral,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameMonto(this.puedeCargarPorParteMonto,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameNegocioCliente(this.puedeCargarPorParteNegocioCliente,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameNovedad(this.puedeCargarPorParteNovedad,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePoliticaCliente(this.puedeCargarPorPartePoliticaCliente,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePoliticasCliente(this.puedeCargarPorPartePoliticasCliente,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProveedorProducto(this.puedeCargarPorParteProveedorProducto,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameReferenciaBancaria(this.puedeCargarPorParteReferenciaBancaria,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameReferenciaComercial(this.puedeCargarPorParteReferenciaComercial,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameReferenciaPersonal(this.puedeCargarPorParteReferenciaPersonal,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameRepresentanteLegal(this.puedeCargarPorParteRepresentanteLegal,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameResponsable(this.puedeCargarPorParteResponsable,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameServicioCliente(this.puedeCargarPorParteServicioCliente,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameSubCliente(this.puedeCargarPorParteSubCliente,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameTelefono(this.puedeCargarPorParteTelefono,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameTransportista(this.puedeCargarPorParteTransportista,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameVehiculoCliente(this.puedeCargarPorParteVehiculoCliente,false,-1);
					
					if(this.clienteSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsCliente= new GridBagConstraints();
						this.gridBagConstraintsCliente.gridy = iGridyRelaciones++;
						this.gridBagConstraintsCliente.gridx = 0;
						this.jContentPaneDetalleCliente.add(this.jTabbedPaneRelacionesCliente, this.gridBagConstraintsCliente);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesCliente.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameActividadEconomica(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameBalanceGeneralCliente(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameBien(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameCargaFamiliar(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameChequePostFechado(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameClienteArchivo(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameClienteCoa(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameClienteImagen(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameConsignatario(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameContactoCliente(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameConyuge(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameCuentaPorCobrar(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameDatoConstitucion(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameDireccion(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameEMail(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameFirmaCliente(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameGarantiaCliente(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameHobbyCliente(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameInformacionEconomica(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameInformacionFinanciera(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameInformacionLaboral(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameMonto(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameNegocioCliente(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameNovedad(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePoliticaCliente(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePoliticasCliente(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProveedorProducto(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameReferenciaBancaria(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameReferenciaComercial(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameReferenciaPersonal(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameRepresentanteLegal(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameResponsable(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameServicioCliente(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameSubCliente(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameTelefono(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameTransportista(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameVehiculoCliente(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosCliente.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsCliente = new GridBagConstraints();
					this.gridBagConstraintsCliente.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsCliente.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsCliente.gridx = 0;
					
				
					this.jContentPaneDetalleCliente.add(jPanelCamposOcultosCliente, gridBagConstraintsCliente);
				
					this.jPanelCamposOcultosCliente.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsCliente = new GridBagConstraints();
			this.gridBagConstraintsCliente.gridy = iGridyRelaciones++;//112;		
	        this.gridBagConstraintsCliente.gridx = 0;
	        this.gridBagConstraintsCliente.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleCliente.add(this.jPanelAccionesFormularioCliente, this.gridBagConstraintsCliente);							
			
			
			
			this.gridBagConstraintsCliente = new GridBagConstraints();
	        this.gridBagConstraintsCliente.gridy = iGridyRelaciones;//112;		
	        this.gridBagConstraintsCliente.gridx = 0;
	        
			
			this.jContentPaneDetalleCliente.add(this.jPanelAccionesCliente, this.gridBagConstraintsCliente);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionCliente);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionCliente=   new JScrollPane(this.jPanelCamposCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsCliente = new GridBagConstraints();
			this.gridBagConstraintsCliente.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsCliente.gridx = 0;
			this.gridBagConstraintsCliente.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsCliente.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsCliente.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionCliente, this.gridBagConstraintsCliente);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsCliente = new GridBagConstraints();
			this.gridBagConstraintsCliente.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCliente.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioCliente, this.gridBagConstraintsCliente);			
			
			this.gridBagConstraintsCliente = new GridBagConstraints();
			this.gridBagConstraintsCliente.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCliente.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesCliente, this.gridBagConstraintsCliente);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsCliente = new GridBagConstraints();
		this.gridBagConstraintsCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCliente, this.gridBagConstraintsCliente);
			
			
		this.gridBagConstraintsCliente = new GridBagConstraints();
		this.gridBagConstraintsCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCliente, this.gridBagConstraintsCliente);
		
			
		this.gridBagConstraintsCliente = new GridBagConstraints();
		this.gridBagConstraintsCliente.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCliente.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCliente, this.gridBagConstraintsCliente);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralCliente;//jContentPane;
		
		return jScrollPanelDatosEdicionCliente;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameActividadEconomica(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.actividadeconomicaSessionBean=new ActividadEconomicaSessionBean();
		this.actividadeconomicaSessionBean.setConGuardarRelaciones(false);
		this.actividadeconomicaSessionBean.setEsGuardarRelacionado(true);

		this.actividadeconomicaBeanSwingJInternalFrame=null;//new ActividadEconomicaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.actividadeconomicaBeanSwingJInternalFramePopup=new ActividadEconomicaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.actividadeconomicaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.actividadeconomicaSessionBean.getEsGuardarRelacionado()) {

				ActividadEconomicaJInternalFrame.STIPO_TAMANIO_GENERAL=ClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
				ActividadEconomicaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ClienteJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.actividadeconomicaSessionBean.setEsGuardarRelacionado(true);

				this.actividadeconomicaBeanSwingJInternalFrame=new ActividadEconomicaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.actividadeconomicaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.actividadeconomicaBeanSwingJInternalFrame.setactividadeconomicaSessionBean(this.actividadeconomicaSessionBean);

				//this.gridBagConstraintsCliente = new GridBagConstraints();
				//this.gridBagConstraintsCliente.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsCliente.gridx = 0;
				//this.jContentPaneDetalleCliente.add(this.actividadeconomicaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsCliente);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesCliente.add("Actividad Economicas",this.actividadeconomicaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesCliente.setComponentAt(iIndexTab,this.actividadeconomicaBeanSwingJInternalFrame.getContentPane());
				}

				//ActividadEconomicaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.actividadeconomicaSessionBean.setEsGuardarRelacionado(false);
				this.actividadeconomicaBeanSwingJInternalFrame=null;//new ActividadEconomicaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.actividadeconomicaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteActividadEconomica) {
					this.jTabbedPaneRelacionesCliente.add("Actividad Economicas",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameBalanceGeneralCliente(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.balancegeneralclienteSessionBean=new BalanceGeneralClienteSessionBean();
		this.balancegeneralclienteSessionBean.setConGuardarRelaciones(false);
		this.balancegeneralclienteSessionBean.setEsGuardarRelacionado(true);

		this.balancegeneralclienteBeanSwingJInternalFrame=null;//new BalanceGeneralClienteBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.balancegeneralclienteBeanSwingJInternalFramePopup=new BalanceGeneralClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.balancegeneralclienteBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.balancegeneralclienteSessionBean.getEsGuardarRelacionado()) {

				BalanceGeneralClienteJInternalFrame.STIPO_TAMANIO_GENERAL=ClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
				BalanceGeneralClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ClienteJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.balancegeneralclienteSessionBean.setEsGuardarRelacionado(true);

				this.balancegeneralclienteBeanSwingJInternalFrame=new BalanceGeneralClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.balancegeneralclienteBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.balancegeneralclienteBeanSwingJInternalFrame.setbalancegeneralclienteSessionBean(this.balancegeneralclienteSessionBean);

				//this.gridBagConstraintsCliente = new GridBagConstraints();
				//this.gridBagConstraintsCliente.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsCliente.gridx = 0;
				//this.jContentPaneDetalleCliente.add(this.balancegeneralclienteBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsCliente);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesCliente.add("Balance General Clientes",this.balancegeneralclienteBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesCliente.setComponentAt(iIndexTab,this.balancegeneralclienteBeanSwingJInternalFrame.getContentPane());
				}

				//BalanceGeneralClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.balancegeneralclienteSessionBean.setEsGuardarRelacionado(false);
				this.balancegeneralclienteBeanSwingJInternalFrame=null;//new BalanceGeneralClienteBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.balancegeneralclienteSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteBalanceGeneralCliente) {
					this.jTabbedPaneRelacionesCliente.add("Balance General Clientes",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameBien(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.bienSessionBean=new BienSessionBean();
		this.bienSessionBean.setConGuardarRelaciones(false);
		this.bienSessionBean.setEsGuardarRelacionado(true);

		this.bienBeanSwingJInternalFrame=null;//new BienBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.bienBeanSwingJInternalFramePopup=new BienBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.bienBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.bienSessionBean.getEsGuardarRelacionado()) {

				BienJInternalFrame.STIPO_TAMANIO_GENERAL=ClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
				BienJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ClienteJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.bienSessionBean.setEsGuardarRelacionado(true);

				this.bienBeanSwingJInternalFrame=new BienBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.bienBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.bienBeanSwingJInternalFrame.setbienSessionBean(this.bienSessionBean);

				//this.gridBagConstraintsCliente = new GridBagConstraints();
				//this.gridBagConstraintsCliente.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsCliente.gridx = 0;
				//this.jContentPaneDetalleCliente.add(this.bienBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsCliente);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesCliente.add("Bienes",this.bienBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesCliente.setComponentAt(iIndexTab,this.bienBeanSwingJInternalFrame.getContentPane());
				}

				//BienJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.bienSessionBean.setEsGuardarRelacionado(false);
				this.bienBeanSwingJInternalFrame=null;//new BienBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.bienSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteBien) {
					this.jTabbedPaneRelacionesCliente.add("Bienes",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameCargaFamiliar(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.cargafamiliarSessionBean=new CargaFamiliarSessionBean();
		this.cargafamiliarSessionBean.setConGuardarRelaciones(false);
		this.cargafamiliarSessionBean.setEsGuardarRelacionado(true);

		this.cargafamiliarBeanSwingJInternalFrame=null;//new CargaFamiliarBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.cargafamiliarBeanSwingJInternalFramePopup=new CargaFamiliarBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.cargafamiliarBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.cargafamiliarSessionBean.getEsGuardarRelacionado()) {

				CargaFamiliarJInternalFrame.STIPO_TAMANIO_GENERAL=ClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
				CargaFamiliarJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ClienteJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.cargafamiliarSessionBean.setEsGuardarRelacionado(true);

				this.cargafamiliarBeanSwingJInternalFrame=new CargaFamiliarBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.cargafamiliarBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.cargafamiliarBeanSwingJInternalFrame.setcargafamiliarSessionBean(this.cargafamiliarSessionBean);

				//this.gridBagConstraintsCliente = new GridBagConstraints();
				//this.gridBagConstraintsCliente.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsCliente.gridx = 0;
				//this.jContentPaneDetalleCliente.add(this.cargafamiliarBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsCliente);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesCliente.add("Carga Familiares",this.cargafamiliarBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesCliente.setComponentAt(iIndexTab,this.cargafamiliarBeanSwingJInternalFrame.getContentPane());
				}

				//CargaFamiliarJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.cargafamiliarSessionBean.setEsGuardarRelacionado(false);
				this.cargafamiliarBeanSwingJInternalFrame=null;//new CargaFamiliarBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.cargafamiliarSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteCargaFamiliar) {
					this.jTabbedPaneRelacionesCliente.add("Carga Familiares",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameChequePostFechado(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.chequepostfechadoSessionBean=new ChequePostFechadoSessionBean();
		this.chequepostfechadoSessionBean.setConGuardarRelaciones(false);
		this.chequepostfechadoSessionBean.setEsGuardarRelacionado(true);

		this.chequepostfechadoBeanSwingJInternalFrame=null;//new ChequePostFechadoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.chequepostfechadoBeanSwingJInternalFramePopup=new ChequePostFechadoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.chequepostfechadoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.chequepostfechadoSessionBean.getEsGuardarRelacionado()) {

				ChequePostFechadoJInternalFrame.STIPO_TAMANIO_GENERAL=ClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
				ChequePostFechadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ClienteJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.chequepostfechadoSessionBean.setEsGuardarRelacionado(true);

				this.chequepostfechadoBeanSwingJInternalFrame=new ChequePostFechadoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.chequepostfechadoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.chequepostfechadoBeanSwingJInternalFrame.setchequepostfechadoSessionBean(this.chequepostfechadoSessionBean);

				//this.gridBagConstraintsCliente = new GridBagConstraints();
				//this.gridBagConstraintsCliente.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsCliente.gridx = 0;
				//this.jContentPaneDetalleCliente.add(this.chequepostfechadoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsCliente);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesCliente.add("Cheque Post Fechados",this.chequepostfechadoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesCliente.setComponentAt(iIndexTab,this.chequepostfechadoBeanSwingJInternalFrame.getContentPane());
				}

				//ChequePostFechadoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.chequepostfechadoSessionBean.setEsGuardarRelacionado(false);
				this.chequepostfechadoBeanSwingJInternalFrame=null;//new ChequePostFechadoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.chequepostfechadoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteChequePostFechado) {
					this.jTabbedPaneRelacionesCliente.add("Cheque Post Fechados",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameClienteArchivo(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.clientearchivoSessionBean=new ClienteArchivoSessionBean();
		this.clientearchivoSessionBean.setConGuardarRelaciones(false);
		this.clientearchivoSessionBean.setEsGuardarRelacionado(true);

		this.clientearchivoBeanSwingJInternalFrame=null;//new ClienteArchivoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.clientearchivoBeanSwingJInternalFramePopup=new ClienteArchivoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.clientearchivoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.clientearchivoSessionBean.getEsGuardarRelacionado()) {

				ClienteArchivoJInternalFrame.STIPO_TAMANIO_GENERAL=ClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
				ClienteArchivoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ClienteJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.clientearchivoSessionBean.setEsGuardarRelacionado(true);

				this.clientearchivoBeanSwingJInternalFrame=new ClienteArchivoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.clientearchivoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.clientearchivoBeanSwingJInternalFrame.setclientearchivoSessionBean(this.clientearchivoSessionBean);

				//this.gridBagConstraintsCliente = new GridBagConstraints();
				//this.gridBagConstraintsCliente.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsCliente.gridx = 0;
				//this.jContentPaneDetalleCliente.add(this.clientearchivoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsCliente);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesCliente.add("Cliente Archivos",this.clientearchivoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesCliente.setComponentAt(iIndexTab,this.clientearchivoBeanSwingJInternalFrame.getContentPane());
				}

				//ClienteArchivoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.clientearchivoSessionBean.setEsGuardarRelacionado(false);
				this.clientearchivoBeanSwingJInternalFrame=null;//new ClienteArchivoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.clientearchivoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteClienteArchivo) {
					this.jTabbedPaneRelacionesCliente.add("Cliente Archivos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameClienteCoa(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.clientecoaSessionBean=new ClienteCoaSessionBean();
		this.clientecoaSessionBean.setConGuardarRelaciones(false);
		this.clientecoaSessionBean.setEsGuardarRelacionado(true);

		this.clientecoaBeanSwingJInternalFrame=null;//new ClienteCoaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.clientecoaBeanSwingJInternalFramePopup=new ClienteCoaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.clientecoaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.clientecoaSessionBean.getEsGuardarRelacionado()) {

				ClienteCoaJInternalFrame.STIPO_TAMANIO_GENERAL=ClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
				ClienteCoaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ClienteJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.clientecoaSessionBean.setEsGuardarRelacionado(true);

				this.clientecoaBeanSwingJInternalFrame=new ClienteCoaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.clientecoaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.clientecoaBeanSwingJInternalFrame.setclientecoaSessionBean(this.clientecoaSessionBean);

				//this.gridBagConstraintsCliente = new GridBagConstraints();
				//this.gridBagConstraintsCliente.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsCliente.gridx = 0;
				//this.jContentPaneDetalleCliente.add(this.clientecoaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsCliente);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesCliente.add("Coas",this.clientecoaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesCliente.setComponentAt(iIndexTab,this.clientecoaBeanSwingJInternalFrame.getContentPane());
				}

				//ClienteCoaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.clientecoaSessionBean.setEsGuardarRelacionado(false);
				this.clientecoaBeanSwingJInternalFrame=null;//new ClienteCoaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.clientecoaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteClienteCoa) {
					this.jTabbedPaneRelacionesCliente.add("Coas",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameClienteImagen(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.clienteimagenSessionBean=new ClienteImagenSessionBean();
		this.clienteimagenSessionBean.setConGuardarRelaciones(false);
		this.clienteimagenSessionBean.setEsGuardarRelacionado(true);

		this.clienteimagenBeanSwingJInternalFrame=null;//new ClienteImagenBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.clienteimagenBeanSwingJInternalFramePopup=new ClienteImagenBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.clienteimagenBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.clienteimagenSessionBean.getEsGuardarRelacionado()) {

				ClienteImagenJInternalFrame.STIPO_TAMANIO_GENERAL=ClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
				ClienteImagenJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ClienteJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.clienteimagenSessionBean.setEsGuardarRelacionado(true);

				this.clienteimagenBeanSwingJInternalFrame=new ClienteImagenBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.clienteimagenBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.clienteimagenBeanSwingJInternalFrame.setclienteimagenSessionBean(this.clienteimagenSessionBean);

				//this.gridBagConstraintsCliente = new GridBagConstraints();
				//this.gridBagConstraintsCliente.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsCliente.gridx = 0;
				//this.jContentPaneDetalleCliente.add(this.clienteimagenBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsCliente);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesCliente.add("Cliente Imagenes",this.clienteimagenBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesCliente.setComponentAt(iIndexTab,this.clienteimagenBeanSwingJInternalFrame.getContentPane());
				}

				//ClienteImagenJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.clienteimagenSessionBean.setEsGuardarRelacionado(false);
				this.clienteimagenBeanSwingJInternalFrame=null;//new ClienteImagenBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.clienteimagenSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteClienteImagen) {
					this.jTabbedPaneRelacionesCliente.add("Cliente Imagenes",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameConsignatario(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.consignatarioSessionBean=new ConsignatarioSessionBean();
		this.consignatarioSessionBean.setConGuardarRelaciones(false);
		this.consignatarioSessionBean.setEsGuardarRelacionado(true);

		this.consignatarioBeanSwingJInternalFrame=null;//new ConsignatarioBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.consignatarioBeanSwingJInternalFramePopup=new ConsignatarioBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.consignatarioBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.consignatarioSessionBean.getEsGuardarRelacionado()) {

				ConsignatarioJInternalFrame.STIPO_TAMANIO_GENERAL=ClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
				ConsignatarioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ClienteJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.consignatarioSessionBean.setEsGuardarRelacionado(true);

				this.consignatarioBeanSwingJInternalFrame=new ConsignatarioBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.consignatarioBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.consignatarioBeanSwingJInternalFrame.setconsignatarioSessionBean(this.consignatarioSessionBean);

				//this.gridBagConstraintsCliente = new GridBagConstraints();
				//this.gridBagConstraintsCliente.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsCliente.gridx = 0;
				//this.jContentPaneDetalleCliente.add(this.consignatarioBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsCliente);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesCliente.add("Consignatarios",this.consignatarioBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesCliente.setComponentAt(iIndexTab,this.consignatarioBeanSwingJInternalFrame.getContentPane());
				}

				//ConsignatarioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.consignatarioSessionBean.setEsGuardarRelacionado(false);
				this.consignatarioBeanSwingJInternalFrame=null;//new ConsignatarioBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.consignatarioSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteConsignatario) {
					this.jTabbedPaneRelacionesCliente.add("Consignatarios",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameContactoCliente(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.contactoclienteSessionBean=new ContactoClienteSessionBean();
		this.contactoclienteSessionBean.setConGuardarRelaciones(false);
		this.contactoclienteSessionBean.setEsGuardarRelacionado(true);

		this.contactoclienteBeanSwingJInternalFrame=null;//new ContactoClienteBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.contactoclienteBeanSwingJInternalFramePopup=new ContactoClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.contactoclienteBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.contactoclienteSessionBean.getEsGuardarRelacionado()) {

				ContactoClienteJInternalFrame.STIPO_TAMANIO_GENERAL=ClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
				ContactoClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ClienteJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.contactoclienteSessionBean.setEsGuardarRelacionado(true);

				this.contactoclienteBeanSwingJInternalFrame=new ContactoClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.contactoclienteBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.contactoclienteBeanSwingJInternalFrame.setcontactoclienteSessionBean(this.contactoclienteSessionBean);

				//this.gridBagConstraintsCliente = new GridBagConstraints();
				//this.gridBagConstraintsCliente.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsCliente.gridx = 0;
				//this.jContentPaneDetalleCliente.add(this.contactoclienteBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsCliente);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesCliente.add("Contacto Clientes",this.contactoclienteBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesCliente.setComponentAt(iIndexTab,this.contactoclienteBeanSwingJInternalFrame.getContentPane());
				}

				//ContactoClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.contactoclienteSessionBean.setEsGuardarRelacionado(false);
				this.contactoclienteBeanSwingJInternalFrame=null;//new ContactoClienteBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.contactoclienteSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteContactoCliente) {
					this.jTabbedPaneRelacionesCliente.add("Contacto Clientes",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameConyuge(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.conyugeSessionBean=new ConyugeSessionBean();
		this.conyugeSessionBean.setConGuardarRelaciones(false);
		this.conyugeSessionBean.setEsGuardarRelacionado(true);

		this.conyugeBeanSwingJInternalFrame=null;//new ConyugeBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.conyugeBeanSwingJInternalFramePopup=new ConyugeBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.conyugeBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.conyugeSessionBean.getEsGuardarRelacionado()) {

				ConyugeJInternalFrame.STIPO_TAMANIO_GENERAL=ClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
				ConyugeJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ClienteJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.conyugeSessionBean.setEsGuardarRelacionado(true);

				this.conyugeBeanSwingJInternalFrame=new ConyugeBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.conyugeBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.conyugeBeanSwingJInternalFrame.setconyugeSessionBean(this.conyugeSessionBean);

				//this.gridBagConstraintsCliente = new GridBagConstraints();
				//this.gridBagConstraintsCliente.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsCliente.gridx = 0;
				//this.jContentPaneDetalleCliente.add(this.conyugeBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsCliente);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesCliente.add("Conyuges",this.conyugeBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesCliente.setComponentAt(iIndexTab,this.conyugeBeanSwingJInternalFrame.getContentPane());
				}

				//ConyugeJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.conyugeSessionBean.setEsGuardarRelacionado(false);
				this.conyugeBeanSwingJInternalFrame=null;//new ConyugeBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.conyugeSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteConyuge) {
					this.jTabbedPaneRelacionesCliente.add("Conyuges",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameCuentaPorCobrar(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.cuentaporcobrarSessionBean=new CuentaPorCobrarSessionBean();
		this.cuentaporcobrarSessionBean.setConGuardarRelaciones(false);
		this.cuentaporcobrarSessionBean.setEsGuardarRelacionado(true);

		this.cuentaporcobrarBeanSwingJInternalFrame=null;//new CuentaPorCobrarBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.cuentaporcobrarBeanSwingJInternalFramePopup=new CuentaPorCobrarBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.cuentaporcobrarBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.cuentaporcobrarSessionBean.getEsGuardarRelacionado()) {

				CuentaPorCobrarJInternalFrame.STIPO_TAMANIO_GENERAL=ClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
				CuentaPorCobrarJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ClienteJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.cuentaporcobrarSessionBean.setEsGuardarRelacionado(true);

				this.cuentaporcobrarBeanSwingJInternalFrame=new CuentaPorCobrarBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.cuentaporcobrarBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.cuentaporcobrarBeanSwingJInternalFrame.setcuentaporcobrarSessionBean(this.cuentaporcobrarSessionBean);

				//this.gridBagConstraintsCliente = new GridBagConstraints();
				//this.gridBagConstraintsCliente.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsCliente.gridx = 0;
				//this.jContentPaneDetalleCliente.add(this.cuentaporcobrarBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsCliente);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesCliente.add("Cuenta Por Cobrares",this.cuentaporcobrarBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesCliente.setComponentAt(iIndexTab,this.cuentaporcobrarBeanSwingJInternalFrame.getContentPane());
				}

				//CuentaPorCobrarJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.cuentaporcobrarSessionBean.setEsGuardarRelacionado(false);
				this.cuentaporcobrarBeanSwingJInternalFrame=null;//new CuentaPorCobrarBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.cuentaporcobrarSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteCuentaPorCobrar) {
					this.jTabbedPaneRelacionesCliente.add("Cuenta Por Cobrares",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameDatoConstitucion(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.datoconstitucionSessionBean=new DatoConstitucionSessionBean();
		this.datoconstitucionSessionBean.setConGuardarRelaciones(false);
		this.datoconstitucionSessionBean.setEsGuardarRelacionado(true);

		this.datoconstitucionBeanSwingJInternalFrame=null;//new DatoConstitucionBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.datoconstitucionBeanSwingJInternalFramePopup=new DatoConstitucionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.datoconstitucionBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.datoconstitucionSessionBean.getEsGuardarRelacionado()) {

				DatoConstitucionJInternalFrame.STIPO_TAMANIO_GENERAL=ClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
				DatoConstitucionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ClienteJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.datoconstitucionSessionBean.setEsGuardarRelacionado(true);

				this.datoconstitucionBeanSwingJInternalFrame=new DatoConstitucionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.datoconstitucionBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.datoconstitucionBeanSwingJInternalFrame.setdatoconstitucionSessionBean(this.datoconstitucionSessionBean);

				//this.gridBagConstraintsCliente = new GridBagConstraints();
				//this.gridBagConstraintsCliente.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsCliente.gridx = 0;
				//this.jContentPaneDetalleCliente.add(this.datoconstitucionBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsCliente);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesCliente.add("Dato Constituciones",this.datoconstitucionBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesCliente.setComponentAt(iIndexTab,this.datoconstitucionBeanSwingJInternalFrame.getContentPane());
				}

				//DatoConstitucionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.datoconstitucionSessionBean.setEsGuardarRelacionado(false);
				this.datoconstitucionBeanSwingJInternalFrame=null;//new DatoConstitucionBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.datoconstitucionSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDatoConstitucion) {
					this.jTabbedPaneRelacionesCliente.add("Dato Constituciones",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameDireccion(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.direccionSessionBean=new DireccionSessionBean();
		this.direccionSessionBean.setConGuardarRelaciones(false);
		this.direccionSessionBean.setEsGuardarRelacionado(true);

		this.direccionBeanSwingJInternalFrame=null;//new DireccionBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.direccionBeanSwingJInternalFramePopup=new DireccionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.direccionBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.direccionSessionBean.getEsGuardarRelacionado()) {

				DireccionJInternalFrame.STIPO_TAMANIO_GENERAL=ClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
				DireccionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ClienteJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.direccionSessionBean.setEsGuardarRelacionado(true);

				this.direccionBeanSwingJInternalFrame=new DireccionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.direccionBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.direccionBeanSwingJInternalFrame.setdireccionSessionBean(this.direccionSessionBean);

				//this.gridBagConstraintsCliente = new GridBagConstraints();
				//this.gridBagConstraintsCliente.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsCliente.gridx = 0;
				//this.jContentPaneDetalleCliente.add(this.direccionBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsCliente);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesCliente.add("Direcciones",this.direccionBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesCliente.setComponentAt(iIndexTab,this.direccionBeanSwingJInternalFrame.getContentPane());
				}

				//DireccionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.direccionSessionBean.setEsGuardarRelacionado(false);
				this.direccionBeanSwingJInternalFrame=null;//new DireccionBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.direccionSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDireccion) {
					this.jTabbedPaneRelacionesCliente.add("Direcciones",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameEMail(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.emailSessionBean=new EMailSessionBean();
		this.emailSessionBean.setConGuardarRelaciones(false);
		this.emailSessionBean.setEsGuardarRelacionado(true);

		this.emailBeanSwingJInternalFrame=null;//new EMailBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.emailBeanSwingJInternalFramePopup=new EMailBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.emailBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.emailSessionBean.getEsGuardarRelacionado()) {

				EMailJInternalFrame.STIPO_TAMANIO_GENERAL=ClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
				EMailJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ClienteJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.emailSessionBean.setEsGuardarRelacionado(true);

				this.emailBeanSwingJInternalFrame=new EMailBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.emailBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.emailBeanSwingJInternalFrame.setemailSessionBean(this.emailSessionBean);

				//this.gridBagConstraintsCliente = new GridBagConstraints();
				//this.gridBagConstraintsCliente.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsCliente.gridx = 0;
				//this.jContentPaneDetalleCliente.add(this.emailBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsCliente);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesCliente.add("E Mailes",this.emailBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesCliente.setComponentAt(iIndexTab,this.emailBeanSwingJInternalFrame.getContentPane());
				}

				//EMailJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.emailSessionBean.setEsGuardarRelacionado(false);
				this.emailBeanSwingJInternalFrame=null;//new EMailBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.emailSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteEMail) {
					this.jTabbedPaneRelacionesCliente.add("E Mailes",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameFirmaCliente(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.firmaclienteSessionBean=new FirmaClienteSessionBean();
		this.firmaclienteSessionBean.setConGuardarRelaciones(false);
		this.firmaclienteSessionBean.setEsGuardarRelacionado(true);

		this.firmaclienteBeanSwingJInternalFrame=null;//new FirmaClienteBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.firmaclienteBeanSwingJInternalFramePopup=new FirmaClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.firmaclienteBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.firmaclienteSessionBean.getEsGuardarRelacionado()) {

				FirmaClienteJInternalFrame.STIPO_TAMANIO_GENERAL=ClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
				FirmaClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ClienteJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.firmaclienteSessionBean.setEsGuardarRelacionado(true);

				this.firmaclienteBeanSwingJInternalFrame=new FirmaClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.firmaclienteBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.firmaclienteBeanSwingJInternalFrame.setfirmaclienteSessionBean(this.firmaclienteSessionBean);

				//this.gridBagConstraintsCliente = new GridBagConstraints();
				//this.gridBagConstraintsCliente.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsCliente.gridx = 0;
				//this.jContentPaneDetalleCliente.add(this.firmaclienteBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsCliente);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesCliente.add("Firma Clientes",this.firmaclienteBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesCliente.setComponentAt(iIndexTab,this.firmaclienteBeanSwingJInternalFrame.getContentPane());
				}

				//FirmaClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.firmaclienteSessionBean.setEsGuardarRelacionado(false);
				this.firmaclienteBeanSwingJInternalFrame=null;//new FirmaClienteBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.firmaclienteSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteFirmaCliente) {
					this.jTabbedPaneRelacionesCliente.add("Firma Clientes",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameGarantiaCliente(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.garantiaclienteSessionBean=new GarantiaClienteSessionBean();
		this.garantiaclienteSessionBean.setConGuardarRelaciones(false);
		this.garantiaclienteSessionBean.setEsGuardarRelacionado(true);

		this.garantiaclienteBeanSwingJInternalFrame=null;//new GarantiaClienteBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.garantiaclienteBeanSwingJInternalFramePopup=new GarantiaClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.garantiaclienteBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.garantiaclienteSessionBean.getEsGuardarRelacionado()) {

				GarantiaClienteJInternalFrame.STIPO_TAMANIO_GENERAL=ClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
				GarantiaClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ClienteJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.garantiaclienteSessionBean.setEsGuardarRelacionado(true);

				this.garantiaclienteBeanSwingJInternalFrame=new GarantiaClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.garantiaclienteBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.garantiaclienteBeanSwingJInternalFrame.setgarantiaclienteSessionBean(this.garantiaclienteSessionBean);

				//this.gridBagConstraintsCliente = new GridBagConstraints();
				//this.gridBagConstraintsCliente.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsCliente.gridx = 0;
				//this.jContentPaneDetalleCliente.add(this.garantiaclienteBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsCliente);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesCliente.add("Garantia Clientes",this.garantiaclienteBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesCliente.setComponentAt(iIndexTab,this.garantiaclienteBeanSwingJInternalFrame.getContentPane());
				}

				//GarantiaClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.garantiaclienteSessionBean.setEsGuardarRelacionado(false);
				this.garantiaclienteBeanSwingJInternalFrame=null;//new GarantiaClienteBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.garantiaclienteSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteGarantiaCliente) {
					this.jTabbedPaneRelacionesCliente.add("Garantia Clientes",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameHobbyCliente(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.hobbyclienteSessionBean=new HobbyClienteSessionBean();
		this.hobbyclienteSessionBean.setConGuardarRelaciones(false);
		this.hobbyclienteSessionBean.setEsGuardarRelacionado(true);

		this.hobbyclienteBeanSwingJInternalFrame=null;//new HobbyClienteBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.hobbyclienteBeanSwingJInternalFramePopup=new HobbyClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.hobbyclienteBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.hobbyclienteSessionBean.getEsGuardarRelacionado()) {

				HobbyClienteJInternalFrame.STIPO_TAMANIO_GENERAL=ClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
				HobbyClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ClienteJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.hobbyclienteSessionBean.setEsGuardarRelacionado(true);

				this.hobbyclienteBeanSwingJInternalFrame=new HobbyClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.hobbyclienteBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.hobbyclienteBeanSwingJInternalFrame.sethobbyclienteSessionBean(this.hobbyclienteSessionBean);

				//this.gridBagConstraintsCliente = new GridBagConstraints();
				//this.gridBagConstraintsCliente.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsCliente.gridx = 0;
				//this.jContentPaneDetalleCliente.add(this.hobbyclienteBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsCliente);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesCliente.add("Hobby Clientes",this.hobbyclienteBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesCliente.setComponentAt(iIndexTab,this.hobbyclienteBeanSwingJInternalFrame.getContentPane());
				}

				//HobbyClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.hobbyclienteSessionBean.setEsGuardarRelacionado(false);
				this.hobbyclienteBeanSwingJInternalFrame=null;//new HobbyClienteBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.hobbyclienteSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteHobbyCliente) {
					this.jTabbedPaneRelacionesCliente.add("Hobby Clientes",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameInformacionEconomica(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.informacioneconomicaSessionBean=new InformacionEconomicaSessionBean();
		this.informacioneconomicaSessionBean.setConGuardarRelaciones(false);
		this.informacioneconomicaSessionBean.setEsGuardarRelacionado(true);

		this.informacioneconomicaBeanSwingJInternalFrame=null;//new InformacionEconomicaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.informacioneconomicaBeanSwingJInternalFramePopup=new InformacionEconomicaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.informacioneconomicaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.informacioneconomicaSessionBean.getEsGuardarRelacionado()) {

				InformacionEconomicaJInternalFrame.STIPO_TAMANIO_GENERAL=ClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
				InformacionEconomicaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ClienteJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.informacioneconomicaSessionBean.setEsGuardarRelacionado(true);

				this.informacioneconomicaBeanSwingJInternalFrame=new InformacionEconomicaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.informacioneconomicaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.informacioneconomicaBeanSwingJInternalFrame.setinformacioneconomicaSessionBean(this.informacioneconomicaSessionBean);

				//this.gridBagConstraintsCliente = new GridBagConstraints();
				//this.gridBagConstraintsCliente.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsCliente.gridx = 0;
				//this.jContentPaneDetalleCliente.add(this.informacioneconomicaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsCliente);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesCliente.add("Informacion Economicas",this.informacioneconomicaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesCliente.setComponentAt(iIndexTab,this.informacioneconomicaBeanSwingJInternalFrame.getContentPane());
				}

				//InformacionEconomicaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.informacioneconomicaSessionBean.setEsGuardarRelacionado(false);
				this.informacioneconomicaBeanSwingJInternalFrame=null;//new InformacionEconomicaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.informacioneconomicaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteInformacionEconomica) {
					this.jTabbedPaneRelacionesCliente.add("Informacion Economicas",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameInformacionFinanciera(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.informacionfinancieraSessionBean=new InformacionFinancieraSessionBean();
		this.informacionfinancieraSessionBean.setConGuardarRelaciones(false);
		this.informacionfinancieraSessionBean.setEsGuardarRelacionado(true);

		this.informacionfinancieraBeanSwingJInternalFrame=null;//new InformacionFinancieraBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.informacionfinancieraBeanSwingJInternalFramePopup=new InformacionFinancieraBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.informacionfinancieraBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.informacionfinancieraSessionBean.getEsGuardarRelacionado()) {

				InformacionFinancieraJInternalFrame.STIPO_TAMANIO_GENERAL=ClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
				InformacionFinancieraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ClienteJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.informacionfinancieraSessionBean.setEsGuardarRelacionado(true);

				this.informacionfinancieraBeanSwingJInternalFrame=new InformacionFinancieraBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.informacionfinancieraBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.informacionfinancieraBeanSwingJInternalFrame.setinformacionfinancieraSessionBean(this.informacionfinancieraSessionBean);

				//this.gridBagConstraintsCliente = new GridBagConstraints();
				//this.gridBagConstraintsCliente.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsCliente.gridx = 0;
				//this.jContentPaneDetalleCliente.add(this.informacionfinancieraBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsCliente);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesCliente.add("Informacion Financieras",this.informacionfinancieraBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesCliente.setComponentAt(iIndexTab,this.informacionfinancieraBeanSwingJInternalFrame.getContentPane());
				}

				//InformacionFinancieraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.informacionfinancieraSessionBean.setEsGuardarRelacionado(false);
				this.informacionfinancieraBeanSwingJInternalFrame=null;//new InformacionFinancieraBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.informacionfinancieraSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteInformacionFinanciera) {
					this.jTabbedPaneRelacionesCliente.add("Informacion Financieras",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameInformacionLaboral(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.informacionlaboralSessionBean=new InformacionLaboralSessionBean();
		this.informacionlaboralSessionBean.setConGuardarRelaciones(false);
		this.informacionlaboralSessionBean.setEsGuardarRelacionado(true);

		this.informacionlaboralBeanSwingJInternalFrame=null;//new InformacionLaboralBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.informacionlaboralBeanSwingJInternalFramePopup=new InformacionLaboralBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.informacionlaboralBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.informacionlaboralSessionBean.getEsGuardarRelacionado()) {

				InformacionLaboralJInternalFrame.STIPO_TAMANIO_GENERAL=ClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
				InformacionLaboralJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ClienteJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.informacionlaboralSessionBean.setEsGuardarRelacionado(true);

				this.informacionlaboralBeanSwingJInternalFrame=new InformacionLaboralBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.informacionlaboralBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.informacionlaboralBeanSwingJInternalFrame.setinformacionlaboralSessionBean(this.informacionlaboralSessionBean);

				//this.gridBagConstraintsCliente = new GridBagConstraints();
				//this.gridBagConstraintsCliente.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsCliente.gridx = 0;
				//this.jContentPaneDetalleCliente.add(this.informacionlaboralBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsCliente);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesCliente.add("Informacion Laborales",this.informacionlaboralBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesCliente.setComponentAt(iIndexTab,this.informacionlaboralBeanSwingJInternalFrame.getContentPane());
				}

				//InformacionLaboralJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.informacionlaboralSessionBean.setEsGuardarRelacionado(false);
				this.informacionlaboralBeanSwingJInternalFrame=null;//new InformacionLaboralBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.informacionlaboralSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteInformacionLaboral) {
					this.jTabbedPaneRelacionesCliente.add("Informacion Laborales",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameMonto(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.montoSessionBean=new MontoSessionBean();
		this.montoSessionBean.setConGuardarRelaciones(false);
		this.montoSessionBean.setEsGuardarRelacionado(true);

		this.montoBeanSwingJInternalFrame=null;//new MontoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.montoBeanSwingJInternalFramePopup=new MontoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.montoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.montoSessionBean.getEsGuardarRelacionado()) {

				MontoJInternalFrame.STIPO_TAMANIO_GENERAL=ClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
				MontoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ClienteJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.montoSessionBean.setEsGuardarRelacionado(true);

				this.montoBeanSwingJInternalFrame=new MontoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.montoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.montoBeanSwingJInternalFrame.setmontoSessionBean(this.montoSessionBean);

				//this.gridBagConstraintsCliente = new GridBagConstraints();
				//this.gridBagConstraintsCliente.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsCliente.gridx = 0;
				//this.jContentPaneDetalleCliente.add(this.montoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsCliente);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesCliente.add("Monto De Facturacions",this.montoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesCliente.setComponentAt(iIndexTab,this.montoBeanSwingJInternalFrame.getContentPane());
				}

				//MontoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.montoSessionBean.setEsGuardarRelacionado(false);
				this.montoBeanSwingJInternalFrame=null;//new MontoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.montoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteMonto) {
					this.jTabbedPaneRelacionesCliente.add("Monto De Facturacions",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameNegocioCliente(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.negocioclienteSessionBean=new NegocioClienteSessionBean();
		this.negocioclienteSessionBean.setConGuardarRelaciones(false);
		this.negocioclienteSessionBean.setEsGuardarRelacionado(true);

		this.negocioclienteBeanSwingJInternalFrame=null;//new NegocioClienteBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.negocioclienteBeanSwingJInternalFramePopup=new NegocioClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.negocioclienteBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.negocioclienteSessionBean.getEsGuardarRelacionado()) {

				NegocioClienteJInternalFrame.STIPO_TAMANIO_GENERAL=ClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
				NegocioClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ClienteJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.negocioclienteSessionBean.setEsGuardarRelacionado(true);

				this.negocioclienteBeanSwingJInternalFrame=new NegocioClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.negocioclienteBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.negocioclienteBeanSwingJInternalFrame.setnegocioclienteSessionBean(this.negocioclienteSessionBean);

				//this.gridBagConstraintsCliente = new GridBagConstraints();
				//this.gridBagConstraintsCliente.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsCliente.gridx = 0;
				//this.jContentPaneDetalleCliente.add(this.negocioclienteBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsCliente);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesCliente.add("Negocio Clientes",this.negocioclienteBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesCliente.setComponentAt(iIndexTab,this.negocioclienteBeanSwingJInternalFrame.getContentPane());
				}

				//NegocioClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.negocioclienteSessionBean.setEsGuardarRelacionado(false);
				this.negocioclienteBeanSwingJInternalFrame=null;//new NegocioClienteBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.negocioclienteSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteNegocioCliente) {
					this.jTabbedPaneRelacionesCliente.add("Negocio Clientes",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameNovedad(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.novedadSessionBean=new NovedadSessionBean();
		this.novedadSessionBean.setConGuardarRelaciones(false);
		this.novedadSessionBean.setEsGuardarRelacionado(true);

		this.novedadBeanSwingJInternalFrame=null;//new NovedadBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.novedadBeanSwingJInternalFramePopup=new NovedadBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.novedadBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.novedadSessionBean.getEsGuardarRelacionado()) {

				NovedadJInternalFrame.STIPO_TAMANIO_GENERAL=ClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
				NovedadJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ClienteJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.novedadSessionBean.setEsGuardarRelacionado(true);

				this.novedadBeanSwingJInternalFrame=new NovedadBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.novedadBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.novedadBeanSwingJInternalFrame.setnovedadSessionBean(this.novedadSessionBean);

				//this.gridBagConstraintsCliente = new GridBagConstraints();
				//this.gridBagConstraintsCliente.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsCliente.gridx = 0;
				//this.jContentPaneDetalleCliente.add(this.novedadBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsCliente);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesCliente.add("Novedades",this.novedadBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesCliente.setComponentAt(iIndexTab,this.novedadBeanSwingJInternalFrame.getContentPane());
				}

				//NovedadJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.novedadSessionBean.setEsGuardarRelacionado(false);
				this.novedadBeanSwingJInternalFrame=null;//new NovedadBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.novedadSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteNovedad) {
					this.jTabbedPaneRelacionesCliente.add("Novedades",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFramePoliticaCliente(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.politicaclienteSessionBean=new PoliticaClienteSessionBean();
		this.politicaclienteSessionBean.setConGuardarRelaciones(false);
		this.politicaclienteSessionBean.setEsGuardarRelacionado(true);

		this.politicaclienteBeanSwingJInternalFrame=null;//new PoliticaClienteBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.politicaclienteBeanSwingJInternalFramePopup=new PoliticaClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.politicaclienteBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.politicaclienteSessionBean.getEsGuardarRelacionado()) {

				PoliticaClienteJInternalFrame.STIPO_TAMANIO_GENERAL=ClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
				PoliticaClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ClienteJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.politicaclienteSessionBean.setEsGuardarRelacionado(true);

				this.politicaclienteBeanSwingJInternalFrame=new PoliticaClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.politicaclienteBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.politicaclienteBeanSwingJInternalFrame.setpoliticaclienteSessionBean(this.politicaclienteSessionBean);

				//this.gridBagConstraintsCliente = new GridBagConstraints();
				//this.gridBagConstraintsCliente.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsCliente.gridx = 0;
				//this.jContentPaneDetalleCliente.add(this.politicaclienteBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsCliente);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesCliente.add("Politica Clientes",this.politicaclienteBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesCliente.setComponentAt(iIndexTab,this.politicaclienteBeanSwingJInternalFrame.getContentPane());
				}

				//PoliticaClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.politicaclienteSessionBean.setEsGuardarRelacionado(false);
				this.politicaclienteBeanSwingJInternalFrame=null;//new PoliticaClienteBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.politicaclienteSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorPartePoliticaCliente) {
					this.jTabbedPaneRelacionesCliente.add("Politica Clientes",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFramePoliticasCliente(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.politicasclienteSessionBean=new PoliticasClienteSessionBean();
		this.politicasclienteSessionBean.setConGuardarRelaciones(false);
		this.politicasclienteSessionBean.setEsGuardarRelacionado(true);

		this.politicasclienteBeanSwingJInternalFrame=null;//new PoliticasClienteBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.politicasclienteBeanSwingJInternalFramePopup=new PoliticasClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.politicasclienteBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.politicasclienteSessionBean.getEsGuardarRelacionado()) {

				PoliticasClienteJInternalFrame.STIPO_TAMANIO_GENERAL=ClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
				PoliticasClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ClienteJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.politicasclienteSessionBean.setEsGuardarRelacionado(true);

				this.politicasclienteBeanSwingJInternalFrame=new PoliticasClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.politicasclienteBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.politicasclienteBeanSwingJInternalFrame.setpoliticasclienteSessionBean(this.politicasclienteSessionBean);

				//this.gridBagConstraintsCliente = new GridBagConstraints();
				//this.gridBagConstraintsCliente.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsCliente.gridx = 0;
				//this.jContentPaneDetalleCliente.add(this.politicasclienteBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsCliente);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesCliente.add("Politicas Clientes",this.politicasclienteBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesCliente.setComponentAt(iIndexTab,this.politicasclienteBeanSwingJInternalFrame.getContentPane());
				}

				//PoliticasClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.politicasclienteSessionBean.setEsGuardarRelacionado(false);
				this.politicasclienteBeanSwingJInternalFrame=null;//new PoliticasClienteBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.politicasclienteSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorPartePoliticasCliente) {
					this.jTabbedPaneRelacionesCliente.add("Politicas Clientes",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameProveedorProducto(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.proveedorproductoSessionBean=new ProveedorProductoSessionBean();
		this.proveedorproductoSessionBean.setConGuardarRelaciones(false);
		this.proveedorproductoSessionBean.setEsGuardarRelacionado(true);

		this.proveedorproductoBeanSwingJInternalFrame=null;//new ProveedorProductoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.proveedorproductoBeanSwingJInternalFramePopup=new ProveedorProductoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.proveedorproductoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.proveedorproductoSessionBean.getEsGuardarRelacionado()) {

				ProveedorProductoJInternalFrame.STIPO_TAMANIO_GENERAL=ClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
				ProveedorProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ClienteJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.proveedorproductoSessionBean.setEsGuardarRelacionado(true);

				this.proveedorproductoBeanSwingJInternalFrame=new ProveedorProductoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.proveedorproductoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.proveedorproductoBeanSwingJInternalFrame.setproveedorproductoSessionBean(this.proveedorproductoSessionBean);

				//this.gridBagConstraintsCliente = new GridBagConstraints();
				//this.gridBagConstraintsCliente.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsCliente.gridx = 0;
				//this.jContentPaneDetalleCliente.add(this.proveedorproductoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsCliente);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesCliente.add("Producto Proveedors",this.proveedorproductoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesCliente.setComponentAt(iIndexTab,this.proveedorproductoBeanSwingJInternalFrame.getContentPane());
				}

				//ProveedorProductoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.proveedorproductoSessionBean.setEsGuardarRelacionado(false);
				this.proveedorproductoBeanSwingJInternalFrame=null;//new ProveedorProductoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.proveedorproductoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteProveedorProducto) {
					this.jTabbedPaneRelacionesCliente.add("Producto Proveedors",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameReferenciaBancaria(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.referenciabancariaSessionBean=new ReferenciaBancariaSessionBean();
		this.referenciabancariaSessionBean.setConGuardarRelaciones(false);
		this.referenciabancariaSessionBean.setEsGuardarRelacionado(true);

		this.referenciabancariaBeanSwingJInternalFrame=null;//new ReferenciaBancariaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.referenciabancariaBeanSwingJInternalFramePopup=new ReferenciaBancariaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.referenciabancariaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.referenciabancariaSessionBean.getEsGuardarRelacionado()) {

				ReferenciaBancariaJInternalFrame.STIPO_TAMANIO_GENERAL=ClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
				ReferenciaBancariaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ClienteJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.referenciabancariaSessionBean.setEsGuardarRelacionado(true);

				this.referenciabancariaBeanSwingJInternalFrame=new ReferenciaBancariaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.referenciabancariaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.referenciabancariaBeanSwingJInternalFrame.setreferenciabancariaSessionBean(this.referenciabancariaSessionBean);

				//this.gridBagConstraintsCliente = new GridBagConstraints();
				//this.gridBagConstraintsCliente.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsCliente.gridx = 0;
				//this.jContentPaneDetalleCliente.add(this.referenciabancariaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsCliente);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesCliente.add("Referencia Bancarias",this.referenciabancariaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesCliente.setComponentAt(iIndexTab,this.referenciabancariaBeanSwingJInternalFrame.getContentPane());
				}

				//ReferenciaBancariaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.referenciabancariaSessionBean.setEsGuardarRelacionado(false);
				this.referenciabancariaBeanSwingJInternalFrame=null;//new ReferenciaBancariaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.referenciabancariaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteReferenciaBancaria) {
					this.jTabbedPaneRelacionesCliente.add("Referencia Bancarias",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameReferenciaComercial(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.referenciacomercialSessionBean=new ReferenciaComercialSessionBean();
		this.referenciacomercialSessionBean.setConGuardarRelaciones(false);
		this.referenciacomercialSessionBean.setEsGuardarRelacionado(true);

		this.referenciacomercialBeanSwingJInternalFrame=null;//new ReferenciaComercialBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.referenciacomercialBeanSwingJInternalFramePopup=new ReferenciaComercialBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.referenciacomercialBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.referenciacomercialSessionBean.getEsGuardarRelacionado()) {

				ReferenciaComercialJInternalFrame.STIPO_TAMANIO_GENERAL=ClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
				ReferenciaComercialJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ClienteJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.referenciacomercialSessionBean.setEsGuardarRelacionado(true);

				this.referenciacomercialBeanSwingJInternalFrame=new ReferenciaComercialBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.referenciacomercialBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.referenciacomercialBeanSwingJInternalFrame.setreferenciacomercialSessionBean(this.referenciacomercialSessionBean);

				//this.gridBagConstraintsCliente = new GridBagConstraints();
				//this.gridBagConstraintsCliente.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsCliente.gridx = 0;
				//this.jContentPaneDetalleCliente.add(this.referenciacomercialBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsCliente);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesCliente.add("Referencia Comerciales",this.referenciacomercialBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesCliente.setComponentAt(iIndexTab,this.referenciacomercialBeanSwingJInternalFrame.getContentPane());
				}

				//ReferenciaComercialJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.referenciacomercialSessionBean.setEsGuardarRelacionado(false);
				this.referenciacomercialBeanSwingJInternalFrame=null;//new ReferenciaComercialBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.referenciacomercialSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteReferenciaComercial) {
					this.jTabbedPaneRelacionesCliente.add("Referencia Comerciales",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameReferenciaPersonal(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.referenciapersonalSessionBean=new ReferenciaPersonalSessionBean();
		this.referenciapersonalSessionBean.setConGuardarRelaciones(false);
		this.referenciapersonalSessionBean.setEsGuardarRelacionado(true);

		this.referenciapersonalBeanSwingJInternalFrame=null;//new ReferenciaPersonalBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.referenciapersonalBeanSwingJInternalFramePopup=new ReferenciaPersonalBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.referenciapersonalBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.referenciapersonalSessionBean.getEsGuardarRelacionado()) {

				ReferenciaPersonalJInternalFrame.STIPO_TAMANIO_GENERAL=ClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
				ReferenciaPersonalJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ClienteJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.referenciapersonalSessionBean.setEsGuardarRelacionado(true);

				this.referenciapersonalBeanSwingJInternalFrame=new ReferenciaPersonalBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.referenciapersonalBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.referenciapersonalBeanSwingJInternalFrame.setreferenciapersonalSessionBean(this.referenciapersonalSessionBean);

				//this.gridBagConstraintsCliente = new GridBagConstraints();
				//this.gridBagConstraintsCliente.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsCliente.gridx = 0;
				//this.jContentPaneDetalleCliente.add(this.referenciapersonalBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsCliente);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesCliente.add("Referencia Personales",this.referenciapersonalBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesCliente.setComponentAt(iIndexTab,this.referenciapersonalBeanSwingJInternalFrame.getContentPane());
				}

				//ReferenciaPersonalJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.referenciapersonalSessionBean.setEsGuardarRelacionado(false);
				this.referenciapersonalBeanSwingJInternalFrame=null;//new ReferenciaPersonalBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.referenciapersonalSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteReferenciaPersonal) {
					this.jTabbedPaneRelacionesCliente.add("Referencia Personales",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameRepresentanteLegal(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.representantelegalSessionBean=new RepresentanteLegalSessionBean();
		this.representantelegalSessionBean.setConGuardarRelaciones(false);
		this.representantelegalSessionBean.setEsGuardarRelacionado(true);

		this.representantelegalBeanSwingJInternalFrame=null;//new RepresentanteLegalBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.representantelegalBeanSwingJInternalFramePopup=new RepresentanteLegalBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.representantelegalBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.representantelegalSessionBean.getEsGuardarRelacionado()) {

				RepresentanteLegalJInternalFrame.STIPO_TAMANIO_GENERAL=ClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
				RepresentanteLegalJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ClienteJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.representantelegalSessionBean.setEsGuardarRelacionado(true);

				this.representantelegalBeanSwingJInternalFrame=new RepresentanteLegalBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.representantelegalBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.representantelegalBeanSwingJInternalFrame.setrepresentantelegalSessionBean(this.representantelegalSessionBean);

				//this.gridBagConstraintsCliente = new GridBagConstraints();
				//this.gridBagConstraintsCliente.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsCliente.gridx = 0;
				//this.jContentPaneDetalleCliente.add(this.representantelegalBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsCliente);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesCliente.add("Representante Legales",this.representantelegalBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesCliente.setComponentAt(iIndexTab,this.representantelegalBeanSwingJInternalFrame.getContentPane());
				}

				//RepresentanteLegalJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.representantelegalSessionBean.setEsGuardarRelacionado(false);
				this.representantelegalBeanSwingJInternalFrame=null;//new RepresentanteLegalBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.representantelegalSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteRepresentanteLegal) {
					this.jTabbedPaneRelacionesCliente.add("Representante Legales",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameResponsable(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.responsableSessionBean=new ResponsableSessionBean();
		this.responsableSessionBean.setConGuardarRelaciones(false);
		this.responsableSessionBean.setEsGuardarRelacionado(true);

		this.responsableBeanSwingJInternalFrame=null;//new ResponsableBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.responsableBeanSwingJInternalFramePopup=new ResponsableBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.responsableBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.responsableSessionBean.getEsGuardarRelacionado()) {

				ResponsableJInternalFrame.STIPO_TAMANIO_GENERAL=ClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
				ResponsableJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ClienteJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.responsableSessionBean.setEsGuardarRelacionado(true);

				this.responsableBeanSwingJInternalFrame=new ResponsableBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.responsableBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.responsableBeanSwingJInternalFrame.setresponsableSessionBean(this.responsableSessionBean);

				//this.gridBagConstraintsCliente = new GridBagConstraints();
				//this.gridBagConstraintsCliente.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsCliente.gridx = 0;
				//this.jContentPaneDetalleCliente.add(this.responsableBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsCliente);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesCliente.add("Responsables",this.responsableBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesCliente.setComponentAt(iIndexTab,this.responsableBeanSwingJInternalFrame.getContentPane());
				}

				//ResponsableJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.responsableSessionBean.setEsGuardarRelacionado(false);
				this.responsableBeanSwingJInternalFrame=null;//new ResponsableBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.responsableSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteResponsable) {
					this.jTabbedPaneRelacionesCliente.add("Responsables",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameServicioCliente(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.servicioclienteSessionBean=new ServicioClienteSessionBean();
		this.servicioclienteSessionBean.setConGuardarRelaciones(false);
		this.servicioclienteSessionBean.setEsGuardarRelacionado(true);

		this.servicioclienteBeanSwingJInternalFrame=null;//new ServicioClienteBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.servicioclienteBeanSwingJInternalFramePopup=new ServicioClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.servicioclienteBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.servicioclienteSessionBean.getEsGuardarRelacionado()) {

				ServicioClienteJInternalFrame.STIPO_TAMANIO_GENERAL=ClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
				ServicioClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ClienteJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.servicioclienteSessionBean.setEsGuardarRelacionado(true);

				this.servicioclienteBeanSwingJInternalFrame=new ServicioClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.servicioclienteBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.servicioclienteBeanSwingJInternalFrame.setservicioclienteSessionBean(this.servicioclienteSessionBean);

				//this.gridBagConstraintsCliente = new GridBagConstraints();
				//this.gridBagConstraintsCliente.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsCliente.gridx = 0;
				//this.jContentPaneDetalleCliente.add(this.servicioclienteBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsCliente);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesCliente.add("Servicio Clientes",this.servicioclienteBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesCliente.setComponentAt(iIndexTab,this.servicioclienteBeanSwingJInternalFrame.getContentPane());
				}

				//ServicioClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.servicioclienteSessionBean.setEsGuardarRelacionado(false);
				this.servicioclienteBeanSwingJInternalFrame=null;//new ServicioClienteBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.servicioclienteSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteServicioCliente) {
					this.jTabbedPaneRelacionesCliente.add("Servicio Clientes",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameSubCliente(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.subclienteSessionBean=new SubClienteSessionBean();
		this.subclienteSessionBean.setConGuardarRelaciones(false);
		this.subclienteSessionBean.setEsGuardarRelacionado(true);

		this.subclienteBeanSwingJInternalFrame=null;//new SubClienteBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.subclienteBeanSwingJInternalFramePopup=new SubClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.subclienteBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.subclienteSessionBean.getEsGuardarRelacionado()) {

				SubClienteJInternalFrame.STIPO_TAMANIO_GENERAL=ClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
				SubClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ClienteJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.subclienteSessionBean.setEsGuardarRelacionado(true);

				this.subclienteBeanSwingJInternalFrame=new SubClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.subclienteBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.subclienteBeanSwingJInternalFrame.setsubclienteSessionBean(this.subclienteSessionBean);

				//this.gridBagConstraintsCliente = new GridBagConstraints();
				//this.gridBagConstraintsCliente.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsCliente.gridx = 0;
				//this.jContentPaneDetalleCliente.add(this.subclienteBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsCliente);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesCliente.add("Sub Clientes",this.subclienteBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesCliente.setComponentAt(iIndexTab,this.subclienteBeanSwingJInternalFrame.getContentPane());
				}

				//SubClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.subclienteSessionBean.setEsGuardarRelacionado(false);
				this.subclienteBeanSwingJInternalFrame=null;//new SubClienteBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.subclienteSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteSubCliente) {
					this.jTabbedPaneRelacionesCliente.add("Sub Clientes",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameTelefono(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.telefonoSessionBean=new TelefonoSessionBean();
		this.telefonoSessionBean.setConGuardarRelaciones(false);
		this.telefonoSessionBean.setEsGuardarRelacionado(true);

		this.telefonoBeanSwingJInternalFrame=null;//new TelefonoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.telefonoBeanSwingJInternalFramePopup=new TelefonoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.telefonoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.telefonoSessionBean.getEsGuardarRelacionado()) {

				TelefonoJInternalFrame.STIPO_TAMANIO_GENERAL=ClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
				TelefonoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ClienteJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.telefonoSessionBean.setEsGuardarRelacionado(true);

				this.telefonoBeanSwingJInternalFrame=new TelefonoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.telefonoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.telefonoBeanSwingJInternalFrame.settelefonoSessionBean(this.telefonoSessionBean);

				//this.gridBagConstraintsCliente = new GridBagConstraints();
				//this.gridBagConstraintsCliente.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsCliente.gridx = 0;
				//this.jContentPaneDetalleCliente.add(this.telefonoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsCliente);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesCliente.add("Telefonos",this.telefonoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesCliente.setComponentAt(iIndexTab,this.telefonoBeanSwingJInternalFrame.getContentPane());
				}

				//TelefonoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.telefonoSessionBean.setEsGuardarRelacionado(false);
				this.telefonoBeanSwingJInternalFrame=null;//new TelefonoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.telefonoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteTelefono) {
					this.jTabbedPaneRelacionesCliente.add("Telefonos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameTransportista(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.transportistaSessionBean=new TransportistaSessionBean();
		this.transportistaSessionBean.setConGuardarRelaciones(false);
		this.transportistaSessionBean.setEsGuardarRelacionado(true);

		this.transportistaBeanSwingJInternalFrame=null;//new TransportistaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.transportistaBeanSwingJInternalFramePopup=new TransportistaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.transportistaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.transportistaSessionBean.getEsGuardarRelacionado()) {

				TransportistaJInternalFrame.STIPO_TAMANIO_GENERAL=ClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
				TransportistaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ClienteJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.transportistaSessionBean.setEsGuardarRelacionado(true);

				this.transportistaBeanSwingJInternalFrame=new TransportistaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.transportistaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.transportistaBeanSwingJInternalFrame.settransportistaSessionBean(this.transportistaSessionBean);

				//this.gridBagConstraintsCliente = new GridBagConstraints();
				//this.gridBagConstraintsCliente.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsCliente.gridx = 0;
				//this.jContentPaneDetalleCliente.add(this.transportistaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsCliente);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesCliente.add("Transportistas",this.transportistaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesCliente.setComponentAt(iIndexTab,this.transportistaBeanSwingJInternalFrame.getContentPane());
				}

				//TransportistaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.transportistaSessionBean.setEsGuardarRelacionado(false);
				this.transportistaBeanSwingJInternalFrame=null;//new TransportistaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.transportistaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteTransportista) {
					this.jTabbedPaneRelacionesCliente.add("Transportistas",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameVehiculoCliente(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.vehiculoclienteSessionBean=new VehiculoClienteSessionBean();
		this.vehiculoclienteSessionBean.setConGuardarRelaciones(false);
		this.vehiculoclienteSessionBean.setEsGuardarRelacionado(true);

		this.vehiculoclienteBeanSwingJInternalFrame=null;//new VehiculoClienteBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.vehiculoclienteBeanSwingJInternalFramePopup=new VehiculoClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.vehiculoclienteBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.vehiculoclienteSessionBean.getEsGuardarRelacionado()) {

				VehiculoClienteJInternalFrame.STIPO_TAMANIO_GENERAL=ClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
				VehiculoClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ClienteJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.vehiculoclienteSessionBean.setEsGuardarRelacionado(true);

				this.vehiculoclienteBeanSwingJInternalFrame=new VehiculoClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.vehiculoclienteBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.vehiculoclienteBeanSwingJInternalFrame.setvehiculoclienteSessionBean(this.vehiculoclienteSessionBean);

				//this.gridBagConstraintsCliente = new GridBagConstraints();
				//this.gridBagConstraintsCliente.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsCliente.gridx = 0;
				//this.jContentPaneDetalleCliente.add(this.vehiculoclienteBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsCliente);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesCliente.add("Vehiculo Clientes",this.vehiculoclienteBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesCliente.setComponentAt(iIndexTab,this.vehiculoclienteBeanSwingJInternalFrame.getContentPane());
				}

				//VehiculoClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.vehiculoclienteSessionBean.setEsGuardarRelacionado(false);
				this.vehiculoclienteBeanSwingJInternalFrame=null;//new VehiculoClienteBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.vehiculoclienteSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteVehiculoCliente) {
					this.jTabbedPaneRelacionesCliente.add("Vehiculo Clientes",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarInformacionLaboralBeanSwingJInternalFrame(List<Cliente> clientes,Cliente cliente,InformacionLaboralBeanSwingJInternalFrame informacionlaboralBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//informacionlaboralBeanSwingJInternalFrame=new InformacionLaboralBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					informacionlaboralBeanSwingJInternalFrame.getInformacionLaboralLogic().setConnexion(this.clienteLogic.getConnexion());

					informacionlaboralBeanSwingJInternalFrame.setclientesForeignKey(clientes);
					informacionlaboralBeanSwingJInternalFrame.setclienteForeignKey(cliente);
					informacionlaboralBeanSwingJInternalFrame.informacionlaboralSessionBean.setisBusquedaDesdeForeignKeySesionCliente(true);
					informacionlaboralBeanSwingJInternalFrame.informacionlaboralSessionBean.setlidClienteActual(cliente.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					informacionlaboralBeanSwingJInternalFrame.cargarCombosForeignKeyInformacionLaboral(informacionlaboralBeanSwingJInternalFrame.isCargarCombosDependencia);
					informacionlaboralBeanSwingJInternalFrame.setVisibilidadBusquedasParaCliente(true);
					informacionlaboralBeanSwingJInternalFrame.setidclienteFK_IdCliente(cliente.getId());

					if(!this.conCargarFormDetalle) {
						informacionlaboralBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					informacionlaboralBeanSwingJInternalFrame.setSelectedItemCombosFrameClienteForeignKey(cliente,1,false,true,true);
					informacionlaboralBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					informacionlaboralBeanSwingJInternalFrame.procesarBusqueda("FK_IdCliente");
					informacionlaboralBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdCliente");
					informacionlaboralBeanSwingJInternalFrame.inicializarActualizarBindingTablaInformacionLaboral(true);
					informacionlaboralBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesInformacionLaboral("n",informacionlaboralBeanSwingJInternalFrame.isGuardarCambiosEnLote, informacionlaboralBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					informacionlaboralBeanSwingJInternalFrame.setAutoscrolls(true);
					informacionlaboralBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						informacionlaboralBeanSwingJInternalFrame.actualizarEstadoPanelsInformacionLaboral("relacionado");
					} else {
						informacionlaboralBeanSwingJInternalFrame.actualizarEstadoPanelsInformacionLaboral("no_relacionado");
					}

					informacionlaboralBeanSwingJInternalFrame.getjButtonRecargarInformacionInformacionLaboral().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarTransportistaBeanSwingJInternalFrame(List<Cliente> clientes,Cliente cliente,TransportistaBeanSwingJInternalFrame transportistaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//transportistaBeanSwingJInternalFrame=new TransportistaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					transportistaBeanSwingJInternalFrame.getTransportistaLogic().setConnexion(this.clienteLogic.getConnexion());

					transportistaBeanSwingJInternalFrame.setclientesForeignKey(clientes);
					transportistaBeanSwingJInternalFrame.setclienteForeignKey(cliente);
					transportistaBeanSwingJInternalFrame.transportistaSessionBean.setisBusquedaDesdeForeignKeySesionCliente(true);
					transportistaBeanSwingJInternalFrame.transportistaSessionBean.setlidClienteActual(cliente.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					transportistaBeanSwingJInternalFrame.cargarCombosForeignKeyTransportista(transportistaBeanSwingJInternalFrame.isCargarCombosDependencia);
					transportistaBeanSwingJInternalFrame.setVisibilidadBusquedasParaCliente(true);
					transportistaBeanSwingJInternalFrame.setid_clienteFK_IdCliente(cliente.getId());

					if(!this.conCargarFormDetalle) {
						transportistaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					transportistaBeanSwingJInternalFrame.setSelectedItemCombosFrameClienteForeignKey(cliente,1,false,true,true);
					transportistaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					transportistaBeanSwingJInternalFrame.procesarBusqueda("FK_IdCliente");
					transportistaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdCliente");
					transportistaBeanSwingJInternalFrame.inicializarActualizarBindingTablaTransportista(true);
					transportistaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesTransportista("n",transportistaBeanSwingJInternalFrame.isGuardarCambiosEnLote, transportistaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					transportistaBeanSwingJInternalFrame.setAutoscrolls(true);
					transportistaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						transportistaBeanSwingJInternalFrame.actualizarEstadoPanelsTransportista("relacionado");
					} else {
						transportistaBeanSwingJInternalFrame.actualizarEstadoPanelsTransportista("no_relacionado");
					}

					transportistaBeanSwingJInternalFrame.getjButtonRecargarInformacionTransportista().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarNovedadBeanSwingJInternalFrame(List<Cliente> clientes,Cliente cliente,NovedadBeanSwingJInternalFrame novedadBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//novedadBeanSwingJInternalFrame=new NovedadBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					novedadBeanSwingJInternalFrame.getNovedadLogic().setConnexion(this.clienteLogic.getConnexion());

					novedadBeanSwingJInternalFrame.setclientesForeignKey(clientes);
					novedadBeanSwingJInternalFrame.setclienteForeignKey(cliente);
					novedadBeanSwingJInternalFrame.novedadSessionBean.setisBusquedaDesdeForeignKeySesionCliente(true);
					novedadBeanSwingJInternalFrame.novedadSessionBean.setlidClienteActual(cliente.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					novedadBeanSwingJInternalFrame.cargarCombosForeignKeyNovedad(novedadBeanSwingJInternalFrame.isCargarCombosDependencia);
					novedadBeanSwingJInternalFrame.setVisibilidadBusquedasParaCliente(true);
					novedadBeanSwingJInternalFrame.setid_clienteFK_IdCliente(cliente.getId());

					if(!this.conCargarFormDetalle) {
						novedadBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					novedadBeanSwingJInternalFrame.setSelectedItemCombosFrameClienteForeignKey(cliente,1,false,true,true);
					novedadBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					novedadBeanSwingJInternalFrame.procesarBusqueda("FK_IdCliente");
					novedadBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdCliente");
					novedadBeanSwingJInternalFrame.inicializarActualizarBindingTablaNovedad(true);
					novedadBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesNovedad("n",novedadBeanSwingJInternalFrame.isGuardarCambiosEnLote, novedadBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					novedadBeanSwingJInternalFrame.setAutoscrolls(true);
					novedadBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						novedadBeanSwingJInternalFrame.actualizarEstadoPanelsNovedad("relacionado");
					} else {
						novedadBeanSwingJInternalFrame.actualizarEstadoPanelsNovedad("no_relacionado");
					}

					novedadBeanSwingJInternalFrame.getjButtonRecargarInformacionNovedad().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarPoliticasClienteBeanSwingJInternalFrame(List<Cliente> clientes,Cliente cliente,PoliticasClienteBeanSwingJInternalFrame politicasclienteBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//politicasclienteBeanSwingJInternalFrame=new PoliticasClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					politicasclienteBeanSwingJInternalFrame.getPoliticasClienteLogic().setConnexion(this.clienteLogic.getConnexion());

					politicasclienteBeanSwingJInternalFrame.setclientesForeignKey(clientes);
					politicasclienteBeanSwingJInternalFrame.setclienteForeignKey(cliente);
					politicasclienteBeanSwingJInternalFrame.politicasclienteSessionBean.setisBusquedaDesdeForeignKeySesionCliente(true);
					politicasclienteBeanSwingJInternalFrame.politicasclienteSessionBean.setlidClienteActual(cliente.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					politicasclienteBeanSwingJInternalFrame.cargarCombosForeignKeyPoliticasCliente(politicasclienteBeanSwingJInternalFrame.isCargarCombosDependencia);
					politicasclienteBeanSwingJInternalFrame.setVisibilidadBusquedasParaCliente(true);
					politicasclienteBeanSwingJInternalFrame.setid_clienteFK_IdCliente(cliente.getId());

					if(!this.conCargarFormDetalle) {
						politicasclienteBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					politicasclienteBeanSwingJInternalFrame.setSelectedItemCombosFrameClienteForeignKey(cliente,1,false,true,true);
					politicasclienteBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					politicasclienteBeanSwingJInternalFrame.procesarBusqueda("FK_IdCliente");
					politicasclienteBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdCliente");
					politicasclienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaPoliticasCliente(true);
					politicasclienteBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesPoliticasCliente("n",politicasclienteBeanSwingJInternalFrame.isGuardarCambiosEnLote, politicasclienteBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					politicasclienteBeanSwingJInternalFrame.inicializarActualizarBindingPoliticasCliente(false);
					politicasclienteBeanSwingJInternalFrame.setAutoscrolls(true);
					politicasclienteBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						politicasclienteBeanSwingJInternalFrame.actualizarEstadoPanelsPoliticasCliente("relacionado");
					} else {
						politicasclienteBeanSwingJInternalFrame.actualizarEstadoPanelsPoliticasCliente("no_relacionado");
					}

					politicasclienteBeanSwingJInternalFrame.getjButtonRecargarInformacionPoliticasCliente().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarReferenciaPersonalBeanSwingJInternalFrame(List<Cliente> clientes,Cliente cliente,ReferenciaPersonalBeanSwingJInternalFrame referenciapersonalBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//referenciapersonalBeanSwingJInternalFrame=new ReferenciaPersonalBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					referenciapersonalBeanSwingJInternalFrame.getReferenciaPersonalLogic().setConnexion(this.clienteLogic.getConnexion());

					referenciapersonalBeanSwingJInternalFrame.setclientesForeignKey(clientes);
					referenciapersonalBeanSwingJInternalFrame.setclienteForeignKey(cliente);
					referenciapersonalBeanSwingJInternalFrame.referenciapersonalSessionBean.setisBusquedaDesdeForeignKeySesionCliente(true);
					referenciapersonalBeanSwingJInternalFrame.referenciapersonalSessionBean.setlidClienteActual(cliente.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					referenciapersonalBeanSwingJInternalFrame.cargarCombosForeignKeyReferenciaPersonal(referenciapersonalBeanSwingJInternalFrame.isCargarCombosDependencia);
					referenciapersonalBeanSwingJInternalFrame.setVisibilidadBusquedasParaCliente(true);
					referenciapersonalBeanSwingJInternalFrame.setidclienteFK_IdCliente(cliente.getId());

					if(!this.conCargarFormDetalle) {
						referenciapersonalBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					referenciapersonalBeanSwingJInternalFrame.setSelectedItemCombosFrameClienteForeignKey(cliente,1,false,true,true);
					referenciapersonalBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					referenciapersonalBeanSwingJInternalFrame.procesarBusqueda("FK_IdCliente");
					referenciapersonalBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdCliente");
					referenciapersonalBeanSwingJInternalFrame.inicializarActualizarBindingTablaReferenciaPersonal(true);
					referenciapersonalBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesReferenciaPersonal("n",referenciapersonalBeanSwingJInternalFrame.isGuardarCambiosEnLote, referenciapersonalBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					referenciapersonalBeanSwingJInternalFrame.setAutoscrolls(true);
					referenciapersonalBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						referenciapersonalBeanSwingJInternalFrame.actualizarEstadoPanelsReferenciaPersonal("relacionado");
					} else {
						referenciapersonalBeanSwingJInternalFrame.actualizarEstadoPanelsReferenciaPersonal("no_relacionado");
					}

					referenciapersonalBeanSwingJInternalFrame.getjButtonRecargarInformacionReferenciaPersonal().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarBalanceGeneralClienteBeanSwingJInternalFrame(List<Cliente> clientes,Cliente cliente,BalanceGeneralClienteBeanSwingJInternalFrame balancegeneralclienteBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//balancegeneralclienteBeanSwingJInternalFrame=new BalanceGeneralClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					balancegeneralclienteBeanSwingJInternalFrame.getBalanceGeneralClienteLogic().setConnexion(this.clienteLogic.getConnexion());

					balancegeneralclienteBeanSwingJInternalFrame.setclientesForeignKey(clientes);
					balancegeneralclienteBeanSwingJInternalFrame.setclienteForeignKey(cliente);
					balancegeneralclienteBeanSwingJInternalFrame.balancegeneralclienteSessionBean.setisBusquedaDesdeForeignKeySesionCliente(true);
					balancegeneralclienteBeanSwingJInternalFrame.balancegeneralclienteSessionBean.setlidClienteActual(cliente.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					balancegeneralclienteBeanSwingJInternalFrame.cargarCombosForeignKeyBalanceGeneralCliente(balancegeneralclienteBeanSwingJInternalFrame.isCargarCombosDependencia);
					balancegeneralclienteBeanSwingJInternalFrame.setVisibilidadBusquedasParaCliente(true);
					balancegeneralclienteBeanSwingJInternalFrame.setid_clienteFK_IdCliente(cliente.getId());

					if(!this.conCargarFormDetalle) {
						balancegeneralclienteBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					balancegeneralclienteBeanSwingJInternalFrame.setSelectedItemCombosFrameClienteForeignKey(cliente,1,false,true,true);
					balancegeneralclienteBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					balancegeneralclienteBeanSwingJInternalFrame.procesarBusqueda("FK_IdCliente");
					balancegeneralclienteBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdCliente");
					balancegeneralclienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaBalanceGeneralCliente(true);
					balancegeneralclienteBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesBalanceGeneralCliente("n",balancegeneralclienteBeanSwingJInternalFrame.isGuardarCambiosEnLote, balancegeneralclienteBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					balancegeneralclienteBeanSwingJInternalFrame.setAutoscrolls(true);
					balancegeneralclienteBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						balancegeneralclienteBeanSwingJInternalFrame.actualizarEstadoPanelsBalanceGeneralCliente("relacionado");
					} else {
						balancegeneralclienteBeanSwingJInternalFrame.actualizarEstadoPanelsBalanceGeneralCliente("no_relacionado");
					}

					balancegeneralclienteBeanSwingJInternalFrame.getjButtonRecargarInformacionBalanceGeneralCliente().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarPoliticaClienteBeanSwingJInternalFrame(List<Cliente> clientes,Cliente cliente,PoliticaClienteBeanSwingJInternalFrame politicaclienteBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//politicaclienteBeanSwingJInternalFrame=new PoliticaClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					politicaclienteBeanSwingJInternalFrame.getPoliticaClienteLogic().setConnexion(this.clienteLogic.getConnexion());

					politicaclienteBeanSwingJInternalFrame.setclientesForeignKey(clientes);
					politicaclienteBeanSwingJInternalFrame.setclienteForeignKey(cliente);
					politicaclienteBeanSwingJInternalFrame.politicaclienteSessionBean.setisBusquedaDesdeForeignKeySesionCliente(true);
					politicaclienteBeanSwingJInternalFrame.politicaclienteSessionBean.setlidClienteActual(cliente.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					politicaclienteBeanSwingJInternalFrame.cargarCombosForeignKeyPoliticaCliente(politicaclienteBeanSwingJInternalFrame.isCargarCombosDependencia);
					politicaclienteBeanSwingJInternalFrame.setVisibilidadBusquedasParaCliente(true);
					politicaclienteBeanSwingJInternalFrame.setid_clienteFK_IdCliente(cliente.getId());

					if(!this.conCargarFormDetalle) {
						politicaclienteBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					politicaclienteBeanSwingJInternalFrame.setSelectedItemCombosFrameClienteForeignKey(cliente,1,false,true,true);
					politicaclienteBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					politicaclienteBeanSwingJInternalFrame.procesarBusqueda("FK_IdCliente");
					politicaclienteBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdCliente");
					politicaclienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaPoliticaCliente(true);
					politicaclienteBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesPoliticaCliente("n",politicaclienteBeanSwingJInternalFrame.isGuardarCambiosEnLote, politicaclienteBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					politicaclienteBeanSwingJInternalFrame.setAutoscrolls(true);
					politicaclienteBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						politicaclienteBeanSwingJInternalFrame.actualizarEstadoPanelsPoliticaCliente("relacionado");
					} else {
						politicaclienteBeanSwingJInternalFrame.actualizarEstadoPanelsPoliticaCliente("no_relacionado");
					}

					politicaclienteBeanSwingJInternalFrame.getjButtonRecargarInformacionPoliticaCliente().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarVehiculoClienteBeanSwingJInternalFrame(List<Cliente> clientes,Cliente cliente,VehiculoClienteBeanSwingJInternalFrame vehiculoclienteBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//vehiculoclienteBeanSwingJInternalFrame=new VehiculoClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					vehiculoclienteBeanSwingJInternalFrame.getVehiculoClienteLogic().setConnexion(this.clienteLogic.getConnexion());

					vehiculoclienteBeanSwingJInternalFrame.setclientesForeignKey(clientes);
					vehiculoclienteBeanSwingJInternalFrame.setclienteForeignKey(cliente);
					vehiculoclienteBeanSwingJInternalFrame.vehiculoclienteSessionBean.setisBusquedaDesdeForeignKeySesionCliente(true);
					vehiculoclienteBeanSwingJInternalFrame.vehiculoclienteSessionBean.setlidClienteActual(cliente.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					vehiculoclienteBeanSwingJInternalFrame.cargarCombosForeignKeyVehiculoCliente(vehiculoclienteBeanSwingJInternalFrame.isCargarCombosDependencia);
					vehiculoclienteBeanSwingJInternalFrame.setVisibilidadBusquedasParaCliente(true);
					vehiculoclienteBeanSwingJInternalFrame.setid_clienteFK_IdCliente(cliente.getId());

					if(!this.conCargarFormDetalle) {
						vehiculoclienteBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					vehiculoclienteBeanSwingJInternalFrame.setSelectedItemCombosFrameClienteForeignKey(cliente,1,false,true,true);
					vehiculoclienteBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					vehiculoclienteBeanSwingJInternalFrame.procesarBusqueda("FK_IdCliente");
					vehiculoclienteBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdCliente");
					vehiculoclienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaVehiculoCliente(true);
					vehiculoclienteBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesVehiculoCliente("n",vehiculoclienteBeanSwingJInternalFrame.isGuardarCambiosEnLote, vehiculoclienteBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					vehiculoclienteBeanSwingJInternalFrame.setAutoscrolls(true);
					vehiculoclienteBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						vehiculoclienteBeanSwingJInternalFrame.actualizarEstadoPanelsVehiculoCliente("relacionado");
					} else {
						vehiculoclienteBeanSwingJInternalFrame.actualizarEstadoPanelsVehiculoCliente("no_relacionado");
					}

					vehiculoclienteBeanSwingJInternalFrame.getjButtonRecargarInformacionVehiculoCliente().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarResponsableBeanSwingJInternalFrame(List<Cliente> clientes,Cliente cliente,ResponsableBeanSwingJInternalFrame responsableBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//responsableBeanSwingJInternalFrame=new ResponsableBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					responsableBeanSwingJInternalFrame.getResponsableLogic().setConnexion(this.clienteLogic.getConnexion());

					responsableBeanSwingJInternalFrame.setclientesForeignKey(clientes);
					responsableBeanSwingJInternalFrame.setclienteForeignKey(cliente);
					responsableBeanSwingJInternalFrame.responsableSessionBean.setisBusquedaDesdeForeignKeySesionCliente(true);
					responsableBeanSwingJInternalFrame.responsableSessionBean.setlidClienteActual(cliente.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					responsableBeanSwingJInternalFrame.cargarCombosForeignKeyResponsable(responsableBeanSwingJInternalFrame.isCargarCombosDependencia);
					responsableBeanSwingJInternalFrame.setVisibilidadBusquedasParaCliente(true);
					responsableBeanSwingJInternalFrame.setid_clienteFK_IdCliente(cliente.getId());

					if(!this.conCargarFormDetalle) {
						responsableBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					responsableBeanSwingJInternalFrame.setSelectedItemCombosFrameClienteForeignKey(cliente,1,false,true,true);
					responsableBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					responsableBeanSwingJInternalFrame.procesarBusqueda("FK_IdCliente");
					responsableBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdCliente");
					responsableBeanSwingJInternalFrame.inicializarActualizarBindingTablaResponsable(true);
					responsableBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesResponsable("n",responsableBeanSwingJInternalFrame.isGuardarCambiosEnLote, responsableBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					responsableBeanSwingJInternalFrame.setAutoscrolls(true);
					responsableBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						responsableBeanSwingJInternalFrame.actualizarEstadoPanelsResponsable("relacionado");
					} else {
						responsableBeanSwingJInternalFrame.actualizarEstadoPanelsResponsable("no_relacionado");
					}

					responsableBeanSwingJInternalFrame.getjButtonRecargarInformacionResponsable().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarInformacionFinancieraBeanSwingJInternalFrame(List<Cliente> clientes,Cliente cliente,InformacionFinancieraBeanSwingJInternalFrame informacionfinancieraBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//informacionfinancieraBeanSwingJInternalFrame=new InformacionFinancieraBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					informacionfinancieraBeanSwingJInternalFrame.getInformacionFinancieraLogic().setConnexion(this.clienteLogic.getConnexion());

					informacionfinancieraBeanSwingJInternalFrame.setclientesForeignKey(clientes);
					informacionfinancieraBeanSwingJInternalFrame.setclienteForeignKey(cliente);
					informacionfinancieraBeanSwingJInternalFrame.informacionfinancieraSessionBean.setisBusquedaDesdeForeignKeySesionCliente(true);
					informacionfinancieraBeanSwingJInternalFrame.informacionfinancieraSessionBean.setlidClienteActual(cliente.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					informacionfinancieraBeanSwingJInternalFrame.cargarCombosForeignKeyInformacionFinanciera(informacionfinancieraBeanSwingJInternalFrame.isCargarCombosDependencia);
					informacionfinancieraBeanSwingJInternalFrame.setVisibilidadBusquedasParaCliente(true);
					informacionfinancieraBeanSwingJInternalFrame.setidclienteFK_IdCliente(cliente.getId());

					if(!this.conCargarFormDetalle) {
						informacionfinancieraBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					informacionfinancieraBeanSwingJInternalFrame.setSelectedItemCombosFrameClienteForeignKey(cliente,1,false,true,true);
					informacionfinancieraBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					informacionfinancieraBeanSwingJInternalFrame.procesarBusqueda("FK_IdCliente");
					informacionfinancieraBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdCliente");
					informacionfinancieraBeanSwingJInternalFrame.inicializarActualizarBindingTablaInformacionFinanciera(true);
					informacionfinancieraBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesInformacionFinanciera("n",informacionfinancieraBeanSwingJInternalFrame.isGuardarCambiosEnLote, informacionfinancieraBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					informacionfinancieraBeanSwingJInternalFrame.setAutoscrolls(true);
					informacionfinancieraBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						informacionfinancieraBeanSwingJInternalFrame.actualizarEstadoPanelsInformacionFinanciera("relacionado");
					} else {
						informacionfinancieraBeanSwingJInternalFrame.actualizarEstadoPanelsInformacionFinanciera("no_relacionado");
					}

					informacionfinancieraBeanSwingJInternalFrame.getjButtonRecargarInformacionInformacionFinanciera().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarConsignatarioBeanSwingJInternalFrame(List<Cliente> clientes,Cliente cliente,ConsignatarioBeanSwingJInternalFrame consignatarioBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//consignatarioBeanSwingJInternalFrame=new ConsignatarioBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					consignatarioBeanSwingJInternalFrame.getConsignatarioLogic().setConnexion(this.clienteLogic.getConnexion());

					consignatarioBeanSwingJInternalFrame.setclientesForeignKey(clientes);
					consignatarioBeanSwingJInternalFrame.setclienteForeignKey(cliente);
					consignatarioBeanSwingJInternalFrame.consignatarioSessionBean.setisBusquedaDesdeForeignKeySesionCliente(true);
					consignatarioBeanSwingJInternalFrame.consignatarioSessionBean.setlidClienteActual(cliente.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					consignatarioBeanSwingJInternalFrame.cargarCombosForeignKeyConsignatario(consignatarioBeanSwingJInternalFrame.isCargarCombosDependencia);
					consignatarioBeanSwingJInternalFrame.setVisibilidadBusquedasParaCliente(true);
					consignatarioBeanSwingJInternalFrame.setid_clienteFK_IdCliente(cliente.getId());

					if(!this.conCargarFormDetalle) {
						consignatarioBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					consignatarioBeanSwingJInternalFrame.setSelectedItemCombosFrameClienteForeignKey(cliente,1,false,true,true);
					consignatarioBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					consignatarioBeanSwingJInternalFrame.procesarBusqueda("FK_IdCliente");
					consignatarioBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdCliente");
					consignatarioBeanSwingJInternalFrame.inicializarActualizarBindingTablaConsignatario(true);
					consignatarioBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesConsignatario("n",consignatarioBeanSwingJInternalFrame.isGuardarCambiosEnLote, consignatarioBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					consignatarioBeanSwingJInternalFrame.setAutoscrolls(true);
					consignatarioBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						consignatarioBeanSwingJInternalFrame.actualizarEstadoPanelsConsignatario("relacionado");
					} else {
						consignatarioBeanSwingJInternalFrame.actualizarEstadoPanelsConsignatario("no_relacionado");
					}

					consignatarioBeanSwingJInternalFrame.getjButtonRecargarInformacionConsignatario().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarClienteImagenBeanSwingJInternalFrame(List<Cliente> clientes,Cliente cliente,ClienteImagenBeanSwingJInternalFrame clienteimagenBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//clienteimagenBeanSwingJInternalFrame=new ClienteImagenBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					clienteimagenBeanSwingJInternalFrame.getClienteImagenLogic().setConnexion(this.clienteLogic.getConnexion());

					clienteimagenBeanSwingJInternalFrame.setclientesForeignKey(clientes);
					clienteimagenBeanSwingJInternalFrame.setclienteForeignKey(cliente);
					clienteimagenBeanSwingJInternalFrame.clienteimagenSessionBean.setisBusquedaDesdeForeignKeySesionCliente(true);
					clienteimagenBeanSwingJInternalFrame.clienteimagenSessionBean.setlidClienteActual(cliente.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					clienteimagenBeanSwingJInternalFrame.cargarCombosForeignKeyClienteImagen(clienteimagenBeanSwingJInternalFrame.isCargarCombosDependencia);
					clienteimagenBeanSwingJInternalFrame.setVisibilidadBusquedasParaCliente(true);
					clienteimagenBeanSwingJInternalFrame.setid_clienteFK_IdCliente(cliente.getId());

					if(!this.conCargarFormDetalle) {
						clienteimagenBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					clienteimagenBeanSwingJInternalFrame.setSelectedItemCombosFrameClienteForeignKey(cliente,1,false,true,true);
					clienteimagenBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					clienteimagenBeanSwingJInternalFrame.procesarBusqueda("FK_IdCliente");
					clienteimagenBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdCliente");
					clienteimagenBeanSwingJInternalFrame.inicializarActualizarBindingTablaClienteImagen(true);
					clienteimagenBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesClienteImagen("n",clienteimagenBeanSwingJInternalFrame.isGuardarCambiosEnLote, clienteimagenBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					clienteimagenBeanSwingJInternalFrame.setAutoscrolls(true);
					clienteimagenBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						clienteimagenBeanSwingJInternalFrame.actualizarEstadoPanelsClienteImagen("relacionado");
					} else {
						clienteimagenBeanSwingJInternalFrame.actualizarEstadoPanelsClienteImagen("no_relacionado");
					}

					clienteimagenBeanSwingJInternalFrame.getjButtonRecargarInformacionClienteImagen().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarGarantiaClienteBeanSwingJInternalFrame(List<Cliente> clientes,Cliente cliente,GarantiaClienteBeanSwingJInternalFrame garantiaclienteBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//garantiaclienteBeanSwingJInternalFrame=new GarantiaClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					garantiaclienteBeanSwingJInternalFrame.getGarantiaClienteLogic().setConnexion(this.clienteLogic.getConnexion());

					garantiaclienteBeanSwingJInternalFrame.setclientesForeignKey(clientes);
					garantiaclienteBeanSwingJInternalFrame.setclienteForeignKey(cliente);
					garantiaclienteBeanSwingJInternalFrame.garantiaclienteSessionBean.setisBusquedaDesdeForeignKeySesionCliente(true);
					garantiaclienteBeanSwingJInternalFrame.garantiaclienteSessionBean.setlidClienteActual(cliente.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					garantiaclienteBeanSwingJInternalFrame.cargarCombosForeignKeyGarantiaCliente(garantiaclienteBeanSwingJInternalFrame.isCargarCombosDependencia);
					garantiaclienteBeanSwingJInternalFrame.setVisibilidadBusquedasParaCliente(true);
					garantiaclienteBeanSwingJInternalFrame.setid_clienteFK_IdCliente(cliente.getId());

					if(!this.conCargarFormDetalle) {
						garantiaclienteBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					garantiaclienteBeanSwingJInternalFrame.setSelectedItemCombosFrameClienteForeignKey(cliente,1,false,true,true);
					garantiaclienteBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					garantiaclienteBeanSwingJInternalFrame.procesarBusqueda("FK_IdCliente");
					garantiaclienteBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdCliente");
					garantiaclienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaGarantiaCliente(true);
					garantiaclienteBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesGarantiaCliente("n",garantiaclienteBeanSwingJInternalFrame.isGuardarCambiosEnLote, garantiaclienteBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					garantiaclienteBeanSwingJInternalFrame.setAutoscrolls(true);
					garantiaclienteBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						garantiaclienteBeanSwingJInternalFrame.actualizarEstadoPanelsGarantiaCliente("relacionado");
					} else {
						garantiaclienteBeanSwingJInternalFrame.actualizarEstadoPanelsGarantiaCliente("no_relacionado");
					}

					garantiaclienteBeanSwingJInternalFrame.getjButtonRecargarInformacionGarantiaCliente().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarInformacionEconomicaBeanSwingJInternalFrame(List<Cliente> clientes,Cliente cliente,InformacionEconomicaBeanSwingJInternalFrame informacioneconomicaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//informacioneconomicaBeanSwingJInternalFrame=new InformacionEconomicaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					informacioneconomicaBeanSwingJInternalFrame.getInformacionEconomicaLogic().setConnexion(this.clienteLogic.getConnexion());

					informacioneconomicaBeanSwingJInternalFrame.setclientesForeignKey(clientes);
					informacioneconomicaBeanSwingJInternalFrame.setclienteForeignKey(cliente);
					informacioneconomicaBeanSwingJInternalFrame.informacioneconomicaSessionBean.setisBusquedaDesdeForeignKeySesionCliente(true);
					informacioneconomicaBeanSwingJInternalFrame.informacioneconomicaSessionBean.setlidClienteActual(cliente.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					informacioneconomicaBeanSwingJInternalFrame.cargarCombosForeignKeyInformacionEconomica(informacioneconomicaBeanSwingJInternalFrame.isCargarCombosDependencia);
					informacioneconomicaBeanSwingJInternalFrame.setVisibilidadBusquedasParaCliente(true);
					informacioneconomicaBeanSwingJInternalFrame.setidclienteFK_IdCliente(cliente.getId());

					if(!this.conCargarFormDetalle) {
						informacioneconomicaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					informacioneconomicaBeanSwingJInternalFrame.setSelectedItemCombosFrameClienteForeignKey(cliente,1,false,true,true);
					informacioneconomicaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					informacioneconomicaBeanSwingJInternalFrame.procesarBusqueda("FK_IdCliente");
					informacioneconomicaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdCliente");
					informacioneconomicaBeanSwingJInternalFrame.inicializarActualizarBindingTablaInformacionEconomica(true);
					informacioneconomicaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesInformacionEconomica("n",informacioneconomicaBeanSwingJInternalFrame.isGuardarCambiosEnLote, informacioneconomicaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					informacioneconomicaBeanSwingJInternalFrame.setAutoscrolls(true);
					informacioneconomicaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						informacioneconomicaBeanSwingJInternalFrame.actualizarEstadoPanelsInformacionEconomica("relacionado");
					} else {
						informacioneconomicaBeanSwingJInternalFrame.actualizarEstadoPanelsInformacionEconomica("no_relacionado");
					}

					informacioneconomicaBeanSwingJInternalFrame.getjButtonRecargarInformacionInformacionEconomica().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarReferenciaComercialBeanSwingJInternalFrame(List<Cliente> clientes,Cliente cliente,ReferenciaComercialBeanSwingJInternalFrame referenciacomercialBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//referenciacomercialBeanSwingJInternalFrame=new ReferenciaComercialBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					referenciacomercialBeanSwingJInternalFrame.getReferenciaComercialLogic().setConnexion(this.clienteLogic.getConnexion());

					referenciacomercialBeanSwingJInternalFrame.setclientesForeignKey(clientes);
					referenciacomercialBeanSwingJInternalFrame.setclienteForeignKey(cliente);
					referenciacomercialBeanSwingJInternalFrame.referenciacomercialSessionBean.setisBusquedaDesdeForeignKeySesionCliente(true);
					referenciacomercialBeanSwingJInternalFrame.referenciacomercialSessionBean.setlidClienteActual(cliente.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					referenciacomercialBeanSwingJInternalFrame.cargarCombosForeignKeyReferenciaComercial(referenciacomercialBeanSwingJInternalFrame.isCargarCombosDependencia);
					referenciacomercialBeanSwingJInternalFrame.setVisibilidadBusquedasParaCliente(true);
					referenciacomercialBeanSwingJInternalFrame.setidclienteFK_IdCliente(cliente.getId());

					if(!this.conCargarFormDetalle) {
						referenciacomercialBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					referenciacomercialBeanSwingJInternalFrame.setSelectedItemCombosFrameClienteForeignKey(cliente,1,false,true,true);
					referenciacomercialBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					referenciacomercialBeanSwingJInternalFrame.procesarBusqueda("FK_IdCliente");
					referenciacomercialBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdCliente");
					referenciacomercialBeanSwingJInternalFrame.inicializarActualizarBindingTablaReferenciaComercial(true);
					referenciacomercialBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesReferenciaComercial("n",referenciacomercialBeanSwingJInternalFrame.isGuardarCambiosEnLote, referenciacomercialBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					referenciacomercialBeanSwingJInternalFrame.setAutoscrolls(true);
					referenciacomercialBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						referenciacomercialBeanSwingJInternalFrame.actualizarEstadoPanelsReferenciaComercial("relacionado");
					} else {
						referenciacomercialBeanSwingJInternalFrame.actualizarEstadoPanelsReferenciaComercial("no_relacionado");
					}

					referenciacomercialBeanSwingJInternalFrame.getjButtonRecargarInformacionReferenciaComercial().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarBienBeanSwingJInternalFrame(List<Cliente> clientes,Cliente cliente,BienBeanSwingJInternalFrame bienBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//bienBeanSwingJInternalFrame=new BienBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					bienBeanSwingJInternalFrame.getBienLogic().setConnexion(this.clienteLogic.getConnexion());

					bienBeanSwingJInternalFrame.setclientesForeignKey(clientes);
					bienBeanSwingJInternalFrame.setclienteForeignKey(cliente);
					bienBeanSwingJInternalFrame.bienSessionBean.setisBusquedaDesdeForeignKeySesionCliente(true);
					bienBeanSwingJInternalFrame.bienSessionBean.setlidClienteActual(cliente.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					bienBeanSwingJInternalFrame.cargarCombosForeignKeyBien(bienBeanSwingJInternalFrame.isCargarCombosDependencia);
					bienBeanSwingJInternalFrame.setVisibilidadBusquedasParaCliente(true);
					bienBeanSwingJInternalFrame.setid_clienteFK_IdCliente(cliente.getId());

					if(!this.conCargarFormDetalle) {
						bienBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					bienBeanSwingJInternalFrame.setSelectedItemCombosFrameClienteForeignKey(cliente,1,false,true,true);
					bienBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					bienBeanSwingJInternalFrame.procesarBusqueda("FK_IdCliente");
					bienBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdCliente");
					bienBeanSwingJInternalFrame.inicializarActualizarBindingTablaBien(true);
					bienBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesBien("n",bienBeanSwingJInternalFrame.isGuardarCambiosEnLote, bienBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					bienBeanSwingJInternalFrame.setAutoscrolls(true);
					bienBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						bienBeanSwingJInternalFrame.actualizarEstadoPanelsBien("relacionado");
					} else {
						bienBeanSwingJInternalFrame.actualizarEstadoPanelsBien("no_relacionado");
					}

					bienBeanSwingJInternalFrame.getjButtonRecargarInformacionBien().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarProveedorProductoBeanSwingJInternalFrame(List<Cliente> clientes,Cliente cliente,ProveedorProductoBeanSwingJInternalFrame proveedorproductoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//proveedorproductoBeanSwingJInternalFrame=new ProveedorProductoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					proveedorproductoBeanSwingJInternalFrame.getProveedorProductoLogic().setConnexion(this.clienteLogic.getConnexion());

					proveedorproductoBeanSwingJInternalFrame.setclientesForeignKey(clientes);
					proveedorproductoBeanSwingJInternalFrame.setclienteForeignKey(cliente);
					proveedorproductoBeanSwingJInternalFrame.proveedorproductoSessionBean.setisBusquedaDesdeForeignKeySesionCliente(true);
					proveedorproductoBeanSwingJInternalFrame.proveedorproductoSessionBean.setlidClienteActual(cliente.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					proveedorproductoBeanSwingJInternalFrame.cargarCombosForeignKeyProveedorProducto(proveedorproductoBeanSwingJInternalFrame.isCargarCombosDependencia);
					proveedorproductoBeanSwingJInternalFrame.setVisibilidadBusquedasParaCliente(true);
					proveedorproductoBeanSwingJInternalFrame.setid_clienteFK_IdCliente(cliente.getId());

					if(!this.conCargarFormDetalle) {
						proveedorproductoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					proveedorproductoBeanSwingJInternalFrame.setSelectedItemCombosFrameClienteForeignKey(cliente,1,false,true,true);
					proveedorproductoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					proveedorproductoBeanSwingJInternalFrame.procesarBusqueda("FK_IdCliente");
					proveedorproductoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdCliente");
					proveedorproductoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProveedorProducto(true);
					proveedorproductoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesProveedorProducto("n",proveedorproductoBeanSwingJInternalFrame.isGuardarCambiosEnLote, proveedorproductoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					proveedorproductoBeanSwingJInternalFrame.setAutoscrolls(true);
					proveedorproductoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						proveedorproductoBeanSwingJInternalFrame.actualizarEstadoPanelsProveedorProducto("relacionado");
					} else {
						proveedorproductoBeanSwingJInternalFrame.actualizarEstadoPanelsProveedorProducto("no_relacionado");
					}

					proveedorproductoBeanSwingJInternalFrame.getjButtonRecargarInformacionProveedorProducto().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarServicioClienteBeanSwingJInternalFrame(List<Cliente> clientes,Cliente cliente,ServicioClienteBeanSwingJInternalFrame servicioclienteBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//servicioclienteBeanSwingJInternalFrame=new ServicioClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					servicioclienteBeanSwingJInternalFrame.getServicioClienteLogic().setConnexion(this.clienteLogic.getConnexion());

					servicioclienteBeanSwingJInternalFrame.setclientesForeignKey(clientes);
					servicioclienteBeanSwingJInternalFrame.setclienteForeignKey(cliente);
					servicioclienteBeanSwingJInternalFrame.servicioclienteSessionBean.setisBusquedaDesdeForeignKeySesionCliente(true);
					servicioclienteBeanSwingJInternalFrame.servicioclienteSessionBean.setlidClienteActual(cliente.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					servicioclienteBeanSwingJInternalFrame.cargarCombosForeignKeyServicioCliente(servicioclienteBeanSwingJInternalFrame.isCargarCombosDependencia);
					servicioclienteBeanSwingJInternalFrame.setVisibilidadBusquedasParaCliente(true);
					servicioclienteBeanSwingJInternalFrame.setid_clienteFK_IdCliente(cliente.getId());

					if(!this.conCargarFormDetalle) {
						servicioclienteBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					servicioclienteBeanSwingJInternalFrame.setSelectedItemCombosFrameClienteForeignKey(cliente,1,false,true,true);
					servicioclienteBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					servicioclienteBeanSwingJInternalFrame.procesarBusqueda("FK_IdCliente");
					servicioclienteBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdCliente");
					servicioclienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaServicioCliente(true);
					servicioclienteBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesServicioCliente("n",servicioclienteBeanSwingJInternalFrame.isGuardarCambiosEnLote, servicioclienteBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					servicioclienteBeanSwingJInternalFrame.setAutoscrolls(true);
					servicioclienteBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						servicioclienteBeanSwingJInternalFrame.actualizarEstadoPanelsServicioCliente("relacionado");
					} else {
						servicioclienteBeanSwingJInternalFrame.actualizarEstadoPanelsServicioCliente("no_relacionado");
					}

					servicioclienteBeanSwingJInternalFrame.getjButtonRecargarInformacionServicioCliente().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarContactoClienteBeanSwingJInternalFrame(List<Cliente> clientes,Cliente cliente,ContactoClienteBeanSwingJInternalFrame contactoclienteBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//contactoclienteBeanSwingJInternalFrame=new ContactoClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					contactoclienteBeanSwingJInternalFrame.getContactoClienteLogic().setConnexion(this.clienteLogic.getConnexion());

					contactoclienteBeanSwingJInternalFrame.setclientesForeignKey(clientes);
					contactoclienteBeanSwingJInternalFrame.setclienteForeignKey(cliente);
					contactoclienteBeanSwingJInternalFrame.contactoclienteSessionBean.setisBusquedaDesdeForeignKeySesionCliente(true);
					contactoclienteBeanSwingJInternalFrame.contactoclienteSessionBean.setlidClienteActual(cliente.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					contactoclienteBeanSwingJInternalFrame.cargarCombosForeignKeyContactoCliente(contactoclienteBeanSwingJInternalFrame.isCargarCombosDependencia);
					contactoclienteBeanSwingJInternalFrame.setVisibilidadBusquedasParaCliente(true);
					contactoclienteBeanSwingJInternalFrame.setid_clienteFK_IdCliente(cliente.getId());

					if(!this.conCargarFormDetalle) {
						contactoclienteBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					contactoclienteBeanSwingJInternalFrame.setSelectedItemCombosFrameClienteForeignKey(cliente,1,false,true,true);
					contactoclienteBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					contactoclienteBeanSwingJInternalFrame.procesarBusqueda("FK_IdCliente");
					contactoclienteBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdCliente");
					contactoclienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaContactoCliente(true);
					contactoclienteBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesContactoCliente("n",contactoclienteBeanSwingJInternalFrame.isGuardarCambiosEnLote, contactoclienteBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					contactoclienteBeanSwingJInternalFrame.setAutoscrolls(true);
					contactoclienteBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						contactoclienteBeanSwingJInternalFrame.actualizarEstadoPanelsContactoCliente("relacionado");
					} else {
						contactoclienteBeanSwingJInternalFrame.actualizarEstadoPanelsContactoCliente("no_relacionado");
					}

					contactoclienteBeanSwingJInternalFrame.getjButtonRecargarInformacionContactoCliente().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarDatoConstitucionBeanSwingJInternalFrame(List<Cliente> clientes,Cliente cliente,DatoConstitucionBeanSwingJInternalFrame datoconstitucionBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//datoconstitucionBeanSwingJInternalFrame=new DatoConstitucionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					datoconstitucionBeanSwingJInternalFrame.getDatoConstitucionLogic().setConnexion(this.clienteLogic.getConnexion());

					datoconstitucionBeanSwingJInternalFrame.setclientesForeignKey(clientes);
					datoconstitucionBeanSwingJInternalFrame.setclienteForeignKey(cliente);
					datoconstitucionBeanSwingJInternalFrame.datoconstitucionSessionBean.setisBusquedaDesdeForeignKeySesionCliente(true);
					datoconstitucionBeanSwingJInternalFrame.datoconstitucionSessionBean.setlidClienteActual(cliente.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					datoconstitucionBeanSwingJInternalFrame.cargarCombosForeignKeyDatoConstitucion(datoconstitucionBeanSwingJInternalFrame.isCargarCombosDependencia);
					datoconstitucionBeanSwingJInternalFrame.setVisibilidadBusquedasParaCliente(true);
					datoconstitucionBeanSwingJInternalFrame.setidclienteFK_IdCliente(cliente.getId());

					if(!this.conCargarFormDetalle) {
						datoconstitucionBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					datoconstitucionBeanSwingJInternalFrame.setSelectedItemCombosFrameClienteForeignKey(cliente,1,false,true,true);
					datoconstitucionBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					datoconstitucionBeanSwingJInternalFrame.procesarBusqueda("FK_IdCliente");
					datoconstitucionBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdCliente");
					datoconstitucionBeanSwingJInternalFrame.inicializarActualizarBindingTablaDatoConstitucion(true);
					datoconstitucionBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDatoConstitucion("n",datoconstitucionBeanSwingJInternalFrame.isGuardarCambiosEnLote, datoconstitucionBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					datoconstitucionBeanSwingJInternalFrame.setAutoscrolls(true);
					datoconstitucionBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						datoconstitucionBeanSwingJInternalFrame.actualizarEstadoPanelsDatoConstitucion("relacionado");
					} else {
						datoconstitucionBeanSwingJInternalFrame.actualizarEstadoPanelsDatoConstitucion("no_relacionado");
					}

					datoconstitucionBeanSwingJInternalFrame.getjButtonRecargarInformacionDatoConstitucion().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarClienteCoaBeanSwingJInternalFrame(List<Cliente> clientes,Cliente cliente,ClienteCoaBeanSwingJInternalFrame clientecoaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//clientecoaBeanSwingJInternalFrame=new ClienteCoaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					clientecoaBeanSwingJInternalFrame.getClienteCoaLogic().setConnexion(this.clienteLogic.getConnexion());

					clientecoaBeanSwingJInternalFrame.setclientesForeignKey(clientes);
					clientecoaBeanSwingJInternalFrame.setclienteForeignKey(cliente);
					clientecoaBeanSwingJInternalFrame.clientecoaSessionBean.setisBusquedaDesdeForeignKeySesionCliente(true);
					clientecoaBeanSwingJInternalFrame.clientecoaSessionBean.setlidClienteActual(cliente.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					clientecoaBeanSwingJInternalFrame.cargarCombosForeignKeyClienteCoa(clientecoaBeanSwingJInternalFrame.isCargarCombosDependencia);
					clientecoaBeanSwingJInternalFrame.setVisibilidadBusquedasParaCliente(true);
					clientecoaBeanSwingJInternalFrame.setid_clienteFK_IdCliente(cliente.getId());

					if(!this.conCargarFormDetalle) {
						clientecoaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					clientecoaBeanSwingJInternalFrame.setSelectedItemCombosFrameClienteForeignKey(cliente,1,false,true,true);
					clientecoaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					clientecoaBeanSwingJInternalFrame.procesarBusqueda("FK_IdCliente");
					clientecoaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdCliente");
					clientecoaBeanSwingJInternalFrame.inicializarActualizarBindingTablaClienteCoa(true);
					clientecoaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesClienteCoa("n",clientecoaBeanSwingJInternalFrame.isGuardarCambiosEnLote, clientecoaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					clientecoaBeanSwingJInternalFrame.setAutoscrolls(true);
					clientecoaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						clientecoaBeanSwingJInternalFrame.actualizarEstadoPanelsClienteCoa("relacionado");
					} else {
						clientecoaBeanSwingJInternalFrame.actualizarEstadoPanelsClienteCoa("no_relacionado");
					}

					clientecoaBeanSwingJInternalFrame.getjButtonRecargarInformacionClienteCoa().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarHobbyClienteBeanSwingJInternalFrame(List<Cliente> clientes,Cliente cliente,HobbyClienteBeanSwingJInternalFrame hobbyclienteBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//hobbyclienteBeanSwingJInternalFrame=new HobbyClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					hobbyclienteBeanSwingJInternalFrame.getHobbyClienteLogic().setConnexion(this.clienteLogic.getConnexion());

					hobbyclienteBeanSwingJInternalFrame.setclientesForeignKey(clientes);
					hobbyclienteBeanSwingJInternalFrame.setclienteForeignKey(cliente);
					hobbyclienteBeanSwingJInternalFrame.hobbyclienteSessionBean.setisBusquedaDesdeForeignKeySesionCliente(true);
					hobbyclienteBeanSwingJInternalFrame.hobbyclienteSessionBean.setlidClienteActual(cliente.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					hobbyclienteBeanSwingJInternalFrame.cargarCombosForeignKeyHobbyCliente(hobbyclienteBeanSwingJInternalFrame.isCargarCombosDependencia);
					hobbyclienteBeanSwingJInternalFrame.setVisibilidadBusquedasParaCliente(true);
					hobbyclienteBeanSwingJInternalFrame.setid_clienteFK_IdCliente(cliente.getId());

					if(!this.conCargarFormDetalle) {
						hobbyclienteBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					hobbyclienteBeanSwingJInternalFrame.setSelectedItemCombosFrameClienteForeignKey(cliente,1,false,true,true);
					hobbyclienteBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					hobbyclienteBeanSwingJInternalFrame.procesarBusqueda("FK_IdCliente");
					hobbyclienteBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdCliente");
					hobbyclienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaHobbyCliente(true);
					hobbyclienteBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesHobbyCliente("n",hobbyclienteBeanSwingJInternalFrame.isGuardarCambiosEnLote, hobbyclienteBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					hobbyclienteBeanSwingJInternalFrame.setAutoscrolls(true);
					hobbyclienteBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						hobbyclienteBeanSwingJInternalFrame.actualizarEstadoPanelsHobbyCliente("relacionado");
					} else {
						hobbyclienteBeanSwingJInternalFrame.actualizarEstadoPanelsHobbyCliente("no_relacionado");
					}

					hobbyclienteBeanSwingJInternalFrame.getjButtonRecargarInformacionHobbyCliente().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarCargaFamiliarBeanSwingJInternalFrame(List<Cliente> clientes,Cliente cliente,CargaFamiliarBeanSwingJInternalFrame cargafamiliarBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//cargafamiliarBeanSwingJInternalFrame=new CargaFamiliarBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					cargafamiliarBeanSwingJInternalFrame.getCargaFamiliarLogic().setConnexion(this.clienteLogic.getConnexion());

					cargafamiliarBeanSwingJInternalFrame.setclientesForeignKey(clientes);
					cargafamiliarBeanSwingJInternalFrame.setclienteForeignKey(cliente);
					cargafamiliarBeanSwingJInternalFrame.cargafamiliarSessionBean.setisBusquedaDesdeForeignKeySesionCliente(true);
					cargafamiliarBeanSwingJInternalFrame.cargafamiliarSessionBean.setlidClienteActual(cliente.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					cargafamiliarBeanSwingJInternalFrame.cargarCombosForeignKeyCargaFamiliar(cargafamiliarBeanSwingJInternalFrame.isCargarCombosDependencia);
					cargafamiliarBeanSwingJInternalFrame.setVisibilidadBusquedasParaCliente(true);
					cargafamiliarBeanSwingJInternalFrame.setid_clienteFK_IdCliente(cliente.getId());

					if(!this.conCargarFormDetalle) {
						cargafamiliarBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					cargafamiliarBeanSwingJInternalFrame.setSelectedItemCombosFrameClienteForeignKey(cliente,1,false,true,true);
					cargafamiliarBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					cargafamiliarBeanSwingJInternalFrame.procesarBusqueda("FK_IdCliente");
					cargafamiliarBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdCliente");
					cargafamiliarBeanSwingJInternalFrame.inicializarActualizarBindingTablaCargaFamiliar(true);
					cargafamiliarBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesCargaFamiliar("n",cargafamiliarBeanSwingJInternalFrame.isGuardarCambiosEnLote, cargafamiliarBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					cargafamiliarBeanSwingJInternalFrame.setAutoscrolls(true);
					cargafamiliarBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						cargafamiliarBeanSwingJInternalFrame.actualizarEstadoPanelsCargaFamiliar("relacionado");
					} else {
						cargafamiliarBeanSwingJInternalFrame.actualizarEstadoPanelsCargaFamiliar("no_relacionado");
					}

					cargafamiliarBeanSwingJInternalFrame.getjButtonRecargarInformacionCargaFamiliar().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarEMailBeanSwingJInternalFrame(List<Cliente> clientes,Cliente cliente,EMailBeanSwingJInternalFrame emailBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//emailBeanSwingJInternalFrame=new EMailBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					emailBeanSwingJInternalFrame.getEMailLogic().setConnexion(this.clienteLogic.getConnexion());

					emailBeanSwingJInternalFrame.setclientesForeignKey(clientes);
					emailBeanSwingJInternalFrame.setclienteForeignKey(cliente);
					emailBeanSwingJInternalFrame.emailSessionBean.setisBusquedaDesdeForeignKeySesionCliente(true);
					emailBeanSwingJInternalFrame.emailSessionBean.setlidClienteActual(cliente.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					emailBeanSwingJInternalFrame.cargarCombosForeignKeyEMail(emailBeanSwingJInternalFrame.isCargarCombosDependencia);
					emailBeanSwingJInternalFrame.setVisibilidadBusquedasParaCliente(true);
					emailBeanSwingJInternalFrame.setid_clienteFK_IdCliente(cliente.getId());

					if(!this.conCargarFormDetalle) {
						emailBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					emailBeanSwingJInternalFrame.setSelectedItemCombosFrameClienteForeignKey(cliente,1,false,true,true);
					emailBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					emailBeanSwingJInternalFrame.procesarBusqueda("FK_IdCliente");
					emailBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdCliente");
					emailBeanSwingJInternalFrame.inicializarActualizarBindingTablaEMail(true);
					emailBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesEMail("n",emailBeanSwingJInternalFrame.isGuardarCambiosEnLote, emailBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					emailBeanSwingJInternalFrame.setAutoscrolls(true);
					emailBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						emailBeanSwingJInternalFrame.actualizarEstadoPanelsEMail("relacionado");
					} else {
						emailBeanSwingJInternalFrame.actualizarEstadoPanelsEMail("no_relacionado");
					}

					emailBeanSwingJInternalFrame.getjButtonRecargarInformacionEMail().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarConyugeBeanSwingJInternalFrame(List<Cliente> clientes,Cliente cliente,ConyugeBeanSwingJInternalFrame conyugeBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//conyugeBeanSwingJInternalFrame=new ConyugeBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					conyugeBeanSwingJInternalFrame.getConyugeLogic().setConnexion(this.clienteLogic.getConnexion());

					conyugeBeanSwingJInternalFrame.setclientesForeignKey(clientes);
					conyugeBeanSwingJInternalFrame.setclienteForeignKey(cliente);
					conyugeBeanSwingJInternalFrame.conyugeSessionBean.setisBusquedaDesdeForeignKeySesionCliente(true);
					conyugeBeanSwingJInternalFrame.conyugeSessionBean.setlidClienteActual(cliente.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					conyugeBeanSwingJInternalFrame.cargarCombosForeignKeyConyuge(conyugeBeanSwingJInternalFrame.isCargarCombosDependencia);
					conyugeBeanSwingJInternalFrame.setVisibilidadBusquedasParaCliente(true);
					conyugeBeanSwingJInternalFrame.setid_clienteFK_IdCliente(cliente.getId());

					if(!this.conCargarFormDetalle) {
						conyugeBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					conyugeBeanSwingJInternalFrame.setSelectedItemCombosFrameClienteForeignKey(cliente,1,false,true,true);
					conyugeBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					conyugeBeanSwingJInternalFrame.procesarBusqueda("FK_IdCliente");
					conyugeBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdCliente");
					conyugeBeanSwingJInternalFrame.inicializarActualizarBindingTablaConyuge(true);
					conyugeBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesConyuge("n",conyugeBeanSwingJInternalFrame.isGuardarCambiosEnLote, conyugeBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					conyugeBeanSwingJInternalFrame.inicializarActualizarBindingConyuge(false);
					conyugeBeanSwingJInternalFrame.setAutoscrolls(true);
					conyugeBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						conyugeBeanSwingJInternalFrame.actualizarEstadoPanelsConyuge("relacionado");
					} else {
						conyugeBeanSwingJInternalFrame.actualizarEstadoPanelsConyuge("no_relacionado");
					}

					conyugeBeanSwingJInternalFrame.getjButtonRecargarInformacionConyuge().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarCuentaPorCobrarBeanSwingJInternalFrame(List<Cliente> clientes,Cliente cliente,CuentaPorCobrarBeanSwingJInternalFrame cuentaporcobrarBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//cuentaporcobrarBeanSwingJInternalFrame=new CuentaPorCobrarBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					cuentaporcobrarBeanSwingJInternalFrame.getCuentaPorCobrarLogic().setConnexion(this.clienteLogic.getConnexion());

					cuentaporcobrarBeanSwingJInternalFrame.setclientesForeignKey(clientes);
					cuentaporcobrarBeanSwingJInternalFrame.setclienteForeignKey(cliente);
					cuentaporcobrarBeanSwingJInternalFrame.cuentaporcobrarSessionBean.setisBusquedaDesdeForeignKeySesionCliente(true);
					cuentaporcobrarBeanSwingJInternalFrame.cuentaporcobrarSessionBean.setlidClienteActual(cliente.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					cuentaporcobrarBeanSwingJInternalFrame.cargarCombosForeignKeyCuentaPorCobrar(cuentaporcobrarBeanSwingJInternalFrame.isCargarCombosDependencia);
					cuentaporcobrarBeanSwingJInternalFrame.setVisibilidadBusquedasParaCliente(true);
					cuentaporcobrarBeanSwingJInternalFrame.setid_clienteFK_IdCliente(cliente.getId());

					if(!this.conCargarFormDetalle) {
						cuentaporcobrarBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					cuentaporcobrarBeanSwingJInternalFrame.setSelectedItemCombosFrameClienteForeignKey(cliente,1,false,true,true);
					cuentaporcobrarBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					cuentaporcobrarBeanSwingJInternalFrame.procesarBusqueda("FK_IdCliente");
					cuentaporcobrarBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdCliente");
					cuentaporcobrarBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaPorCobrar(true);
					cuentaporcobrarBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesCuentaPorCobrar("n",cuentaporcobrarBeanSwingJInternalFrame.isGuardarCambiosEnLote, cuentaporcobrarBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					cuentaporcobrarBeanSwingJInternalFrame.setAutoscrolls(true);
					cuentaporcobrarBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						cuentaporcobrarBeanSwingJInternalFrame.actualizarEstadoPanelsCuentaPorCobrar("relacionado");
					} else {
						cuentaporcobrarBeanSwingJInternalFrame.actualizarEstadoPanelsCuentaPorCobrar("no_relacionado");
					}

					cuentaporcobrarBeanSwingJInternalFrame.getjButtonRecargarInformacionCuentaPorCobrar().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarFirmaClienteBeanSwingJInternalFrame(List<Cliente> clientes,Cliente cliente,FirmaClienteBeanSwingJInternalFrame firmaclienteBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//firmaclienteBeanSwingJInternalFrame=new FirmaClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					firmaclienteBeanSwingJInternalFrame.getFirmaClienteLogic().setConnexion(this.clienteLogic.getConnexion());

					firmaclienteBeanSwingJInternalFrame.setclientesForeignKey(clientes);
					firmaclienteBeanSwingJInternalFrame.setclienteForeignKey(cliente);
					firmaclienteBeanSwingJInternalFrame.firmaclienteSessionBean.setisBusquedaDesdeForeignKeySesionCliente(true);
					firmaclienteBeanSwingJInternalFrame.firmaclienteSessionBean.setlidClienteActual(cliente.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					firmaclienteBeanSwingJInternalFrame.cargarCombosForeignKeyFirmaCliente(firmaclienteBeanSwingJInternalFrame.isCargarCombosDependencia);
					firmaclienteBeanSwingJInternalFrame.setVisibilidadBusquedasParaCliente(true);
					firmaclienteBeanSwingJInternalFrame.setid_clienteFK_IdCliente(cliente.getId());

					if(!this.conCargarFormDetalle) {
						firmaclienteBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					firmaclienteBeanSwingJInternalFrame.setSelectedItemCombosFrameClienteForeignKey(cliente,1,false,true,true);
					firmaclienteBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					firmaclienteBeanSwingJInternalFrame.procesarBusqueda("FK_IdCliente");
					firmaclienteBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdCliente");
					firmaclienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaFirmaCliente(true);
					firmaclienteBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesFirmaCliente("n",firmaclienteBeanSwingJInternalFrame.isGuardarCambiosEnLote, firmaclienteBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					firmaclienteBeanSwingJInternalFrame.setAutoscrolls(true);
					firmaclienteBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						firmaclienteBeanSwingJInternalFrame.actualizarEstadoPanelsFirmaCliente("relacionado");
					} else {
						firmaclienteBeanSwingJInternalFrame.actualizarEstadoPanelsFirmaCliente("no_relacionado");
					}

					firmaclienteBeanSwingJInternalFrame.getjButtonRecargarInformacionFirmaCliente().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarRepresentanteLegalBeanSwingJInternalFrame(List<Cliente> clientes,Cliente cliente,RepresentanteLegalBeanSwingJInternalFrame representantelegalBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//representantelegalBeanSwingJInternalFrame=new RepresentanteLegalBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					representantelegalBeanSwingJInternalFrame.getRepresentanteLegalLogic().setConnexion(this.clienteLogic.getConnexion());

					representantelegalBeanSwingJInternalFrame.setclientesForeignKey(clientes);
					representantelegalBeanSwingJInternalFrame.setclienteForeignKey(cliente);
					representantelegalBeanSwingJInternalFrame.representantelegalSessionBean.setisBusquedaDesdeForeignKeySesionCliente(true);
					representantelegalBeanSwingJInternalFrame.representantelegalSessionBean.setlidClienteActual(cliente.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					representantelegalBeanSwingJInternalFrame.cargarCombosForeignKeyRepresentanteLegal(representantelegalBeanSwingJInternalFrame.isCargarCombosDependencia);
					representantelegalBeanSwingJInternalFrame.setVisibilidadBusquedasParaCliente(true);
					representantelegalBeanSwingJInternalFrame.setidclienteFK_IdCliente(cliente.getId());

					if(!this.conCargarFormDetalle) {
						representantelegalBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					representantelegalBeanSwingJInternalFrame.setSelectedItemCombosFrameClienteForeignKey(cliente,1,false,true,true);
					representantelegalBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					representantelegalBeanSwingJInternalFrame.procesarBusqueda("FK_IdCliente");
					representantelegalBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdCliente");
					representantelegalBeanSwingJInternalFrame.inicializarActualizarBindingTablaRepresentanteLegal(true);
					representantelegalBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesRepresentanteLegal("n",representantelegalBeanSwingJInternalFrame.isGuardarCambiosEnLote, representantelegalBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					representantelegalBeanSwingJInternalFrame.setAutoscrolls(true);
					representantelegalBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						representantelegalBeanSwingJInternalFrame.actualizarEstadoPanelsRepresentanteLegal("relacionado");
					} else {
						representantelegalBeanSwingJInternalFrame.actualizarEstadoPanelsRepresentanteLegal("no_relacionado");
					}

					representantelegalBeanSwingJInternalFrame.getjButtonRecargarInformacionRepresentanteLegal().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarTelefonoBeanSwingJInternalFrame(List<Cliente> clientes,Cliente cliente,TelefonoBeanSwingJInternalFrame telefonoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//telefonoBeanSwingJInternalFrame=new TelefonoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					telefonoBeanSwingJInternalFrame.getTelefonoLogic().setConnexion(this.clienteLogic.getConnexion());

					telefonoBeanSwingJInternalFrame.setclientesForeignKey(clientes);
					telefonoBeanSwingJInternalFrame.setclienteForeignKey(cliente);
					telefonoBeanSwingJInternalFrame.telefonoSessionBean.setisBusquedaDesdeForeignKeySesionCliente(true);
					telefonoBeanSwingJInternalFrame.telefonoSessionBean.setlidClienteActual(cliente.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					telefonoBeanSwingJInternalFrame.cargarCombosForeignKeyTelefono(telefonoBeanSwingJInternalFrame.isCargarCombosDependencia);
					telefonoBeanSwingJInternalFrame.setVisibilidadBusquedasParaCliente(true);
					telefonoBeanSwingJInternalFrame.setid_clienteFK_IdCliente(cliente.getId());

					if(!this.conCargarFormDetalle) {
						telefonoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					telefonoBeanSwingJInternalFrame.setSelectedItemCombosFrameClienteForeignKey(cliente,1,false,true,true);
					telefonoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					telefonoBeanSwingJInternalFrame.procesarBusqueda("FK_IdCliente");
					telefonoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdCliente");
					telefonoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTelefono(true);
					telefonoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesTelefono("n",telefonoBeanSwingJInternalFrame.isGuardarCambiosEnLote, telefonoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					telefonoBeanSwingJInternalFrame.setAutoscrolls(true);
					telefonoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						telefonoBeanSwingJInternalFrame.actualizarEstadoPanelsTelefono("relacionado");
					} else {
						telefonoBeanSwingJInternalFrame.actualizarEstadoPanelsTelefono("no_relacionado");
					}

					telefonoBeanSwingJInternalFrame.getjButtonRecargarInformacionTelefono().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarNegocioClienteBeanSwingJInternalFrame(List<Cliente> clientes,Cliente cliente,NegocioClienteBeanSwingJInternalFrame negocioclienteBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//negocioclienteBeanSwingJInternalFrame=new NegocioClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					negocioclienteBeanSwingJInternalFrame.getNegocioClienteLogic().setConnexion(this.clienteLogic.getConnexion());

					negocioclienteBeanSwingJInternalFrame.setclientesForeignKey(clientes);
					negocioclienteBeanSwingJInternalFrame.setclienteForeignKey(cliente);
					negocioclienteBeanSwingJInternalFrame.negocioclienteSessionBean.setisBusquedaDesdeForeignKeySesionCliente(true);
					negocioclienteBeanSwingJInternalFrame.negocioclienteSessionBean.setlidClienteActual(cliente.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					negocioclienteBeanSwingJInternalFrame.cargarCombosForeignKeyNegocioCliente(negocioclienteBeanSwingJInternalFrame.isCargarCombosDependencia);
					negocioclienteBeanSwingJInternalFrame.setVisibilidadBusquedasParaCliente(true);
					negocioclienteBeanSwingJInternalFrame.setid_clienteFK_IdCliente(cliente.getId());

					if(!this.conCargarFormDetalle) {
						negocioclienteBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					negocioclienteBeanSwingJInternalFrame.setSelectedItemCombosFrameClienteForeignKey(cliente,1,false,true,true);
					negocioclienteBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					negocioclienteBeanSwingJInternalFrame.procesarBusqueda("FK_IdCliente");
					negocioclienteBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdCliente");
					negocioclienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaNegocioCliente(true);
					negocioclienteBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesNegocioCliente("n",negocioclienteBeanSwingJInternalFrame.isGuardarCambiosEnLote, negocioclienteBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					negocioclienteBeanSwingJInternalFrame.setAutoscrolls(true);
					negocioclienteBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						negocioclienteBeanSwingJInternalFrame.actualizarEstadoPanelsNegocioCliente("relacionado");
					} else {
						negocioclienteBeanSwingJInternalFrame.actualizarEstadoPanelsNegocioCliente("no_relacionado");
					}

					negocioclienteBeanSwingJInternalFrame.getjButtonRecargarInformacionNegocioCliente().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarReferenciaBancariaBeanSwingJInternalFrame(List<Cliente> clientes,Cliente cliente,ReferenciaBancariaBeanSwingJInternalFrame referenciabancariaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//referenciabancariaBeanSwingJInternalFrame=new ReferenciaBancariaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					referenciabancariaBeanSwingJInternalFrame.getReferenciaBancariaLogic().setConnexion(this.clienteLogic.getConnexion());

					referenciabancariaBeanSwingJInternalFrame.setclientesForeignKey(clientes);
					referenciabancariaBeanSwingJInternalFrame.setclienteForeignKey(cliente);
					referenciabancariaBeanSwingJInternalFrame.referenciabancariaSessionBean.setisBusquedaDesdeForeignKeySesionCliente(true);
					referenciabancariaBeanSwingJInternalFrame.referenciabancariaSessionBean.setlidClienteActual(cliente.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					referenciabancariaBeanSwingJInternalFrame.cargarCombosForeignKeyReferenciaBancaria(referenciabancariaBeanSwingJInternalFrame.isCargarCombosDependencia);
					referenciabancariaBeanSwingJInternalFrame.setVisibilidadBusquedasParaCliente(true);
					referenciabancariaBeanSwingJInternalFrame.setidclienteFK_IdCliente(cliente.getId());

					if(!this.conCargarFormDetalle) {
						referenciabancariaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					referenciabancariaBeanSwingJInternalFrame.setSelectedItemCombosFrameClienteForeignKey(cliente,1,false,true,true);
					referenciabancariaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					referenciabancariaBeanSwingJInternalFrame.procesarBusqueda("FK_IdCliente");
					referenciabancariaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdCliente");
					referenciabancariaBeanSwingJInternalFrame.inicializarActualizarBindingTablaReferenciaBancaria(true);
					referenciabancariaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesReferenciaBancaria("n",referenciabancariaBeanSwingJInternalFrame.isGuardarCambiosEnLote, referenciabancariaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					referenciabancariaBeanSwingJInternalFrame.setAutoscrolls(true);
					referenciabancariaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						referenciabancariaBeanSwingJInternalFrame.actualizarEstadoPanelsReferenciaBancaria("relacionado");
					} else {
						referenciabancariaBeanSwingJInternalFrame.actualizarEstadoPanelsReferenciaBancaria("no_relacionado");
					}

					referenciabancariaBeanSwingJInternalFrame.getjButtonRecargarInformacionReferenciaBancaria().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarMontoBeanSwingJInternalFrame(List<Cliente> clientes,Cliente cliente,MontoBeanSwingJInternalFrame montoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//montoBeanSwingJInternalFrame=new MontoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					montoBeanSwingJInternalFrame.getMontoLogic().setConnexion(this.clienteLogic.getConnexion());

					montoBeanSwingJInternalFrame.setclientesForeignKey(clientes);
					montoBeanSwingJInternalFrame.setclienteForeignKey(cliente);
					montoBeanSwingJInternalFrame.montoSessionBean.setisBusquedaDesdeForeignKeySesionCliente(true);
					montoBeanSwingJInternalFrame.montoSessionBean.setlidClienteActual(cliente.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					montoBeanSwingJInternalFrame.cargarCombosForeignKeyMonto(montoBeanSwingJInternalFrame.isCargarCombosDependencia);
					montoBeanSwingJInternalFrame.setVisibilidadBusquedasParaCliente(true);
					montoBeanSwingJInternalFrame.setid_clienteFK_IdCliente(cliente.getId());

					if(!this.conCargarFormDetalle) {
						montoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					montoBeanSwingJInternalFrame.setSelectedItemCombosFrameClienteForeignKey(cliente,1,false,true,true);
					montoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					montoBeanSwingJInternalFrame.procesarBusqueda("FK_IdCliente");
					montoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdCliente");
					montoBeanSwingJInternalFrame.inicializarActualizarBindingTablaMonto(true);
					montoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesMonto("n",montoBeanSwingJInternalFrame.isGuardarCambiosEnLote, montoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					montoBeanSwingJInternalFrame.setAutoscrolls(true);
					montoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						montoBeanSwingJInternalFrame.actualizarEstadoPanelsMonto("relacionado");
					} else {
						montoBeanSwingJInternalFrame.actualizarEstadoPanelsMonto("no_relacionado");
					}

					montoBeanSwingJInternalFrame.getjButtonRecargarInformacionMonto().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarClienteArchivoBeanSwingJInternalFrame(List<Cliente> clientes,Cliente cliente,ClienteArchivoBeanSwingJInternalFrame clientearchivoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//clientearchivoBeanSwingJInternalFrame=new ClienteArchivoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					clientearchivoBeanSwingJInternalFrame.getClienteArchivoLogic().setConnexion(this.clienteLogic.getConnexion());

					clientearchivoBeanSwingJInternalFrame.setclientesForeignKey(clientes);
					clientearchivoBeanSwingJInternalFrame.setclienteForeignKey(cliente);
					clientearchivoBeanSwingJInternalFrame.clientearchivoSessionBean.setisBusquedaDesdeForeignKeySesionCliente(true);
					clientearchivoBeanSwingJInternalFrame.clientearchivoSessionBean.setlidClienteActual(cliente.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					clientearchivoBeanSwingJInternalFrame.cargarCombosForeignKeyClienteArchivo(clientearchivoBeanSwingJInternalFrame.isCargarCombosDependencia);
					clientearchivoBeanSwingJInternalFrame.setVisibilidadBusquedasParaCliente(true);
					clientearchivoBeanSwingJInternalFrame.setid_clienteFK_IdCliente(cliente.getId());

					if(!this.conCargarFormDetalle) {
						clientearchivoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					clientearchivoBeanSwingJInternalFrame.setSelectedItemCombosFrameClienteForeignKey(cliente,1,false,true,true);
					clientearchivoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					clientearchivoBeanSwingJInternalFrame.procesarBusqueda("FK_IdCliente");
					clientearchivoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdCliente");
					clientearchivoBeanSwingJInternalFrame.inicializarActualizarBindingTablaClienteArchivo(true);
					clientearchivoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesClienteArchivo("n",clientearchivoBeanSwingJInternalFrame.isGuardarCambiosEnLote, clientearchivoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					clientearchivoBeanSwingJInternalFrame.setAutoscrolls(true);
					clientearchivoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						clientearchivoBeanSwingJInternalFrame.actualizarEstadoPanelsClienteArchivo("relacionado");
					} else {
						clientearchivoBeanSwingJInternalFrame.actualizarEstadoPanelsClienteArchivo("no_relacionado");
					}

					clientearchivoBeanSwingJInternalFrame.getjButtonRecargarInformacionClienteArchivo().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarActividadEconomicaBeanSwingJInternalFrame(List<Cliente> clientes,Cliente cliente,ActividadEconomicaBeanSwingJInternalFrame actividadeconomicaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//actividadeconomicaBeanSwingJInternalFrame=new ActividadEconomicaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					actividadeconomicaBeanSwingJInternalFrame.getActividadEconomicaLogic().setConnexion(this.clienteLogic.getConnexion());

					actividadeconomicaBeanSwingJInternalFrame.setclientesForeignKey(clientes);
					actividadeconomicaBeanSwingJInternalFrame.setclienteForeignKey(cliente);
					actividadeconomicaBeanSwingJInternalFrame.actividadeconomicaSessionBean.setisBusquedaDesdeForeignKeySesionCliente(true);
					actividadeconomicaBeanSwingJInternalFrame.actividadeconomicaSessionBean.setlidClienteActual(cliente.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					actividadeconomicaBeanSwingJInternalFrame.cargarCombosForeignKeyActividadEconomica(actividadeconomicaBeanSwingJInternalFrame.isCargarCombosDependencia);
					actividadeconomicaBeanSwingJInternalFrame.setVisibilidadBusquedasParaCliente(true);
					actividadeconomicaBeanSwingJInternalFrame.setid_clienteFK_IdCliente(cliente.getId());

					if(!this.conCargarFormDetalle) {
						actividadeconomicaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					actividadeconomicaBeanSwingJInternalFrame.setSelectedItemCombosFrameClienteForeignKey(cliente,1,false,true,true);
					actividadeconomicaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					actividadeconomicaBeanSwingJInternalFrame.procesarBusqueda("FK_IdCliente");
					actividadeconomicaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdCliente");
					actividadeconomicaBeanSwingJInternalFrame.inicializarActualizarBindingTablaActividadEconomica(true);
					actividadeconomicaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesActividadEconomica("n",actividadeconomicaBeanSwingJInternalFrame.isGuardarCambiosEnLote, actividadeconomicaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					actividadeconomicaBeanSwingJInternalFrame.setAutoscrolls(true);
					actividadeconomicaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						actividadeconomicaBeanSwingJInternalFrame.actualizarEstadoPanelsActividadEconomica("relacionado");
					} else {
						actividadeconomicaBeanSwingJInternalFrame.actualizarEstadoPanelsActividadEconomica("no_relacionado");
					}

					actividadeconomicaBeanSwingJInternalFrame.getjButtonRecargarInformacionActividadEconomica().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarDireccionBeanSwingJInternalFrame(List<Cliente> clientes,Cliente cliente,DireccionBeanSwingJInternalFrame direccionBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//direccionBeanSwingJInternalFrame=new DireccionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					direccionBeanSwingJInternalFrame.getDireccionLogic().setConnexion(this.clienteLogic.getConnexion());

					direccionBeanSwingJInternalFrame.setclientesForeignKey(clientes);
					direccionBeanSwingJInternalFrame.setclienteForeignKey(cliente);
					direccionBeanSwingJInternalFrame.direccionSessionBean.setisBusquedaDesdeForeignKeySesionCliente(true);
					direccionBeanSwingJInternalFrame.direccionSessionBean.setlidClienteActual(cliente.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					direccionBeanSwingJInternalFrame.cargarCombosForeignKeyDireccion(direccionBeanSwingJInternalFrame.isCargarCombosDependencia);
					direccionBeanSwingJInternalFrame.setVisibilidadBusquedasParaCliente(true);
					direccionBeanSwingJInternalFrame.setid_clienteFK_IdCliente(cliente.getId());

					if(!this.conCargarFormDetalle) {
						direccionBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					direccionBeanSwingJInternalFrame.setSelectedItemCombosFrameClienteForeignKey(cliente,1,false,true,true);
					direccionBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					direccionBeanSwingJInternalFrame.procesarBusqueda("FK_IdCliente");
					direccionBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdCliente");
					direccionBeanSwingJInternalFrame.inicializarActualizarBindingTablaDireccion(true);
					direccionBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDireccion("n",direccionBeanSwingJInternalFrame.isGuardarCambiosEnLote, direccionBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					direccionBeanSwingJInternalFrame.setAutoscrolls(true);
					direccionBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						direccionBeanSwingJInternalFrame.actualizarEstadoPanelsDireccion("relacionado");
					} else {
						direccionBeanSwingJInternalFrame.actualizarEstadoPanelsDireccion("no_relacionado");
					}

					direccionBeanSwingJInternalFrame.getjButtonRecargarInformacionDireccion().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarChequePostFechadoBeanSwingJInternalFrame(List<Cliente> clientes,Cliente cliente,ChequePostFechadoBeanSwingJInternalFrame chequepostfechadoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//chequepostfechadoBeanSwingJInternalFrame=new ChequePostFechadoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					chequepostfechadoBeanSwingJInternalFrame.getChequePostFechadoLogic().setConnexion(this.clienteLogic.getConnexion());

					chequepostfechadoBeanSwingJInternalFrame.setclientesForeignKey(clientes);
					chequepostfechadoBeanSwingJInternalFrame.setclienteForeignKey(cliente);
					chequepostfechadoBeanSwingJInternalFrame.chequepostfechadoSessionBean.setisBusquedaDesdeForeignKeySesionCliente(true);
					chequepostfechadoBeanSwingJInternalFrame.chequepostfechadoSessionBean.setlidClienteActual(cliente.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					chequepostfechadoBeanSwingJInternalFrame.cargarCombosForeignKeyChequePostFechado(chequepostfechadoBeanSwingJInternalFrame.isCargarCombosDependencia);
					chequepostfechadoBeanSwingJInternalFrame.setVisibilidadBusquedasParaCliente(true);
					chequepostfechadoBeanSwingJInternalFrame.setid_clienteFK_IdCliente(cliente.getId());

					if(!this.conCargarFormDetalle) {
						chequepostfechadoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					chequepostfechadoBeanSwingJInternalFrame.setSelectedItemCombosFrameClienteForeignKey(cliente,1,false,true,true);
					chequepostfechadoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					chequepostfechadoBeanSwingJInternalFrame.procesarBusqueda("FK_IdCliente");
					chequepostfechadoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdCliente");
					chequepostfechadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaChequePostFechado(true);
					chequepostfechadoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesChequePostFechado("n",chequepostfechadoBeanSwingJInternalFrame.isGuardarCambiosEnLote, chequepostfechadoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					chequepostfechadoBeanSwingJInternalFrame.setAutoscrolls(true);
					chequepostfechadoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						chequepostfechadoBeanSwingJInternalFrame.actualizarEstadoPanelsChequePostFechado("relacionado");
					} else {
						chequepostfechadoBeanSwingJInternalFrame.actualizarEstadoPanelsChequePostFechado("no_relacionado");
					}

					chequepostfechadoBeanSwingJInternalFrame.getjButtonRecargarInformacionChequePostFechado().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarSubClienteBeanSwingJInternalFrame(List<Cliente> clientes,Cliente cliente,SubClienteBeanSwingJInternalFrame subclienteBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//subclienteBeanSwingJInternalFrame=new SubClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					subclienteBeanSwingJInternalFrame.getSubClienteLogic().setConnexion(this.clienteLogic.getConnexion());

					subclienteBeanSwingJInternalFrame.setclientesForeignKey(clientes);
					subclienteBeanSwingJInternalFrame.setclienteForeignKey(cliente);
					subclienteBeanSwingJInternalFrame.subclienteSessionBean.setisBusquedaDesdeForeignKeySesionCliente(true);
					subclienteBeanSwingJInternalFrame.subclienteSessionBean.setlidClienteActual(cliente.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					subclienteBeanSwingJInternalFrame.cargarCombosForeignKeySubCliente(subclienteBeanSwingJInternalFrame.isCargarCombosDependencia);
					subclienteBeanSwingJInternalFrame.setVisibilidadBusquedasParaCliente(true);
					subclienteBeanSwingJInternalFrame.setid_clienteFK_IdCliente(cliente.getId());

					if(!this.conCargarFormDetalle) {
						subclienteBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					subclienteBeanSwingJInternalFrame.setSelectedItemCombosFrameClienteForeignKey(cliente,1,false,true,true);
					subclienteBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					subclienteBeanSwingJInternalFrame.procesarBusqueda("FK_IdCliente");
					subclienteBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdCliente");
					subclienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaSubCliente(true);
					subclienteBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesSubCliente("n",subclienteBeanSwingJInternalFrame.isGuardarCambiosEnLote, subclienteBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					subclienteBeanSwingJInternalFrame.setAutoscrolls(true);
					subclienteBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						subclienteBeanSwingJInternalFrame.actualizarEstadoPanelsSubCliente("relacionado");
					} else {
						subclienteBeanSwingJInternalFrame.actualizarEstadoPanelsSubCliente("no_relacionado");
					}

					subclienteBeanSwingJInternalFrame.getjButtonRecargarInformacionSubCliente().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

	
	
	
	
	/*
	case "CONTROL_BUSQUEDA":
		sKeyName="F3";
	case "CONTROL_BUSCAR":
		sKeyName="F4";
	case "CONTROL_ARBOL":
		sKeyName="F5";
	case "CONTROL_ACTUALIZAR":
		sKeyName="F6";
	sKeyName="N";					
	*/
}
