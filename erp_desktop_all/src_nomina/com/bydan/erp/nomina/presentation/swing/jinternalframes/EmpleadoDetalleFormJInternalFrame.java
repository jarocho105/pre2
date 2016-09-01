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
package com.bydan.erp.nomina.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.nomina.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.nomina.util.EmpleadoConstantesFunciones;

import com.bydan.erp.nomina.business.logic.*;
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
public class EmpleadoDetalleFormJInternalFrame extends EmpleadoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleEmpleado;
	
	protected JMenuBar jmenuBarDetalleEmpleado;
	
	protected JMenu jmenuDetalleEmpleado;
	protected JMenu jmenuDetalleArchivoEmpleado;
	protected JMenu jmenuDetalleAccionesEmpleado;
	protected JMenu jmenuDetalleDatosEmpleado;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEmpleado;	
	protected GridBagConstraints gridBagConstraintsEmpleado;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected EmpleadoBeanSwingJInternalFrameAdditional jInternalFrameDetalleEmpleado;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";

	protected ProvinciaBeanSwingJInternalFrame provinciaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_provincia="";

	protected CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ciudad="";

	protected CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centrocosto="";

	protected ReligionBeanSwingJInternalFrame religionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_religion="";

	protected EstadoCivilBeanSwingJInternalFrame estadocivilBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadocivil="";

	protected TipoGeneroBeanSwingJInternalFrame tipogeneroBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipogenero="";

	protected TipoEmpleadoBeanSwingJInternalFrame tipoempleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoempleado="";

	protected TipoInstruccionBeanSwingJInternalFrame tipoinstruccionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoinstruccion="";

	protected CargoBeanSwingJInternalFrame cargoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cargo="";

	protected EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estructura="";

	protected EstructuraBeanSwingJInternalFrame estructuraseccionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estructuraseccion="";

	protected EstadoEmpleadoBeanSwingJInternalFrame estadoempleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadoempleado="";

	protected TipoContratoBeanSwingJInternalFrame tipocontratoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocontrato="";

	protected TipoCuentaBancoGlobalBeanSwingJInternalFrame tipocuentabancoglobalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocuentabancoglobal="";
	
	public EmpleadoSessionBean empleadoSessionBean;
	
	

	public CargaFamiliar_NMBeanSwingJInternalFrame cargafamiliar_nmBeanSwingJInternalFrame=null;
	public CargaFamiliar_NMBeanSwingJInternalFrame cargafamiliar_nmBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteCargaFamiliar_NM=false;
	public CargaFamiliar_NMSessionBean cargafamiliar_nmSessionBean;

	public CursoBeanSwingJInternalFrame cursoBeanSwingJInternalFrame=null;
	public CursoBeanSwingJInternalFrame cursoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteCurso=false;
	public CursoSessionBean cursoSessionBean;

	public PrestamoBeanSwingJInternalFrame prestamoBeanSwingJInternalFrame=null;
	public PrestamoBeanSwingJInternalFrame prestamoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorPartePrestamo=false;
	public PrestamoSessionBean prestamoSessionBean;

	public EmpleadoIdiomaBeanSwingJInternalFrame empleadoidiomaBeanSwingJInternalFrame=null;
	public EmpleadoIdiomaBeanSwingJInternalFrame empleadoidiomaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteEmpleadoIdioma=false;
	public EmpleadoIdiomaSessionBean empleadoidiomaSessionBean;

	public HistorialPagoMesNomiBeanSwingJInternalFrame historialpagomesnomiBeanSwingJInternalFrame=null;
	public HistorialPagoMesNomiBeanSwingJInternalFrame historialpagomesnomiBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteHistorialPagoMesNomi=false;
	public HistorialPagoMesNomiSessionBean historialpagomesnomiSessionBean;

	public EmpleadoImpuestoRentaBeanSwingJInternalFrame empleadoimpuestorentaBeanSwingJInternalFrame=null;
	public EmpleadoImpuestoRentaBeanSwingJInternalFrame empleadoimpuestorentaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteEmpleadoImpuestoRenta=false;
	public EmpleadoImpuestoRentaSessionBean empleadoimpuestorentaSessionBean;

	public DatoGeneralEmpleadoBeanSwingJInternalFrame datogeneralempleadoBeanSwingJInternalFrame=null;
	public DatoGeneralEmpleadoBeanSwingJInternalFrame datogeneralempleadoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDatoGeneralEmpleado=false;
	public DatoGeneralEmpleadoSessionBean datogeneralempleadoSessionBean;

	public AreaBeanSwingJInternalFrame areaBeanSwingJInternalFrame=null;
	public AreaBeanSwingJInternalFrame areaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteArea=false;
	public AreaSessionBean areaSessionBean;

	public GastoEmpleadoBeanSwingJInternalFrame gastoempleadoBeanSwingJInternalFrame=null;
	public GastoEmpleadoBeanSwingJInternalFrame gastoempleadoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteGastoEmpleado=false;
	public GastoEmpleadoSessionBean gastoempleadoSessionBean;

	public EmpleadoHobbyBeanSwingJInternalFrame empleadohobbyBeanSwingJInternalFrame=null;
	public EmpleadoHobbyBeanSwingJInternalFrame empleadohobbyBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteEmpleadoHobby=false;
	public EmpleadoHobbySessionBean empleadohobbySessionBean;

	public EmpleadoEMailBeanSwingJInternalFrame empleadoemailBeanSwingJInternalFrame=null;
	public EmpleadoEMailBeanSwingJInternalFrame empleadoemailBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteEmpleadoEMail=false;
	public EmpleadoEMailSessionBean empleadoemailSessionBean;

	public RasgoPersonalBeanSwingJInternalFrame rasgopersonalBeanSwingJInternalFrame=null;
	public RasgoPersonalBeanSwingJInternalFrame rasgopersonalBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteRasgoPersonal=false;
	public RasgoPersonalSessionBean rasgopersonalSessionBean;

	public ReferenciaBeanSwingJInternalFrame referenciaBeanSwingJInternalFrame=null;
	public ReferenciaBeanSwingJInternalFrame referenciaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteReferencia=false;
	public ReferenciaSessionBean referenciaSessionBean;

	public Telefono_NMBeanSwingJInternalFrame telefono_nmBeanSwingJInternalFrame=null;
	public Telefono_NMBeanSwingJInternalFrame telefono_nmBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteTelefono_NM=false;
	public Telefono_NMSessionBean telefono_nmSessionBean;

	public NovedadBeanSwingJInternalFrame novedadBeanSwingJInternalFrame=null;
	public NovedadBeanSwingJInternalFrame novedadBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteNovedad=false;
	public NovedadSessionBean novedadSessionBean;

	public EmpleadoHerraBeanSwingJInternalFrame empleadoherraBeanSwingJInternalFrame=null;
	public EmpleadoHerraBeanSwingJInternalFrame empleadoherraBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteEmpleadoHerra=false;
	public EmpleadoHerraSessionBean empleadoherraSessionBean;

	public EmpleadoEnferBeanSwingJInternalFrame empleadoenferBeanSwingJInternalFrame=null;
	public EmpleadoEnferBeanSwingJInternalFrame empleadoenferBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteEmpleadoEnfer=false;
	public EmpleadoEnferSessionBean empleadoenferSessionBean;

	public VisaBeanSwingJInternalFrame visaBeanSwingJInternalFrame=null;
	public VisaBeanSwingJInternalFrame visaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteVisa=false;
	public VisaSessionBean visaSessionBean;

	public SeguroBeanSwingJInternalFrame seguroBeanSwingJInternalFrame=null;
	public SeguroBeanSwingJInternalFrame seguroBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteSeguro=false;
	public SeguroSessionBean seguroSessionBean;

	public AsistenciaMensualBeanSwingJInternalFrame asistenciamensualBeanSwingJInternalFrame=null;
	public AsistenciaMensualBeanSwingJInternalFrame asistenciamensualBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteAsistenciaMensual=false;
	public AsistenciaMensualSessionBean asistenciamensualSessionBean;

	public EmpleadoDiscaBeanSwingJInternalFrame empleadodiscaBeanSwingJInternalFrame=null;
	public EmpleadoDiscaBeanSwingJInternalFrame empleadodiscaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteEmpleadoDisca=false;
	public EmpleadoDiscaSessionBean empleadodiscaSessionBean;

	public ProfesionEmpleaBeanSwingJInternalFrame profesionempleaBeanSwingJInternalFrame=null;
	public ProfesionEmpleaBeanSwingJInternalFrame profesionempleaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteProfesionEmplea=false;
	public ProfesionEmpleaSessionBean profesionempleaSessionBean;

	public RubroEmpleadoBeanSwingJInternalFrame rubroempleadoBeanSwingJInternalFrame=null;
	public RubroEmpleadoBeanSwingJInternalFrame rubroempleadoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteRubroEmpleado=false;
	public RubroEmpleadoSessionBean rubroempleadoSessionBean;

	public EmpleadoConstanteBeanSwingJInternalFrame empleadoconstanteBeanSwingJInternalFrame=null;
	public EmpleadoConstanteBeanSwingJInternalFrame empleadoconstanteBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteEmpleadoConstante=false;
	public EmpleadoConstanteSessionBean empleadoconstanteSessionBean;

	public TallaVestidoBeanSwingJInternalFrame tallavestidoBeanSwingJInternalFrame=null;
	public TallaVestidoBeanSwingJInternalFrame tallavestidoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteTallaVestido=false;
	public TallaVestidoSessionBean tallavestidoSessionBean;

	public NovedadNomiBeanSwingJInternalFrame novedadnomiBeanSwingJInternalFrame=null;
	public NovedadNomiBeanSwingJInternalFrame novedadnomiBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteNovedadNomi=false;
	public NovedadNomiSessionBean novedadnomiSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public PaisSessionBean paisSessionBean;
	public ProvinciaSessionBean provinciaSessionBean;
	public CiudadSessionBean ciudadSessionBean;
	public CentroCostoSessionBean centrocostoSessionBean;
	public ReligionSessionBean religionSessionBean;
	public EstadoCivilSessionBean estadocivilSessionBean;
	public TipoGeneroSessionBean tipogeneroSessionBean;
	public TipoEmpleadoSessionBean tipoempleadoSessionBean;
	public TipoInstruccionSessionBean tipoinstruccionSessionBean;
	public CargoSessionBean cargoSessionBean;
	public EstructuraSessionBean estructuraSessionBean;
	public EstructuraSessionBean estructuraseccionSessionBean;
	public EstadoEmpleadoSessionBean estadoempleadoSessionBean;
	public TipoContratoSessionBean tipocontratoSessionBean;
	public TipoCuentaBancoGlobalSessionBean tipocuentabancoglobalSessionBean;	
	
	public EmpleadoLogic empleadoLogic;
	
	public JScrollPane jScrollPanelDatosEmpleado;
	public JScrollPane jScrollPanelDatosEdicionEmpleado;
	public JScrollPane jScrollPanelDatosGeneralEmpleado;
	
	protected JPanel jPanelCamposEmpleado;    
	protected JPanel jPanelCamposOcultosEmpleado;    	
	protected JPanel jPanelAccionesEmpleado;
	protected JPanel jPanelAccionesFormularioEmpleado;
    
	
	
	protected Integer iXPanelCamposEmpleado=0;
	protected Integer iYPanelCamposEmpleado=0;
	
	protected Integer iXPanelCamposOcultosEmpleado=0;
	protected Integer iYPanelCamposOcultosEmpleado=0;
	
	;
	
	protected JTabbedPane jTabbedPaneRelacionesFinformas_de_pagoEmpleado;
	protected JButton jButtonRelacionesFinformas_de_pagoEmpleado;
	protected JPanel jPanelAccionesRelacionesFinEmpleado;
	protected JButton jButtonRelacionesFinNormalEmpleado;
	Integer iPosXAccionesRelacionesFin=0;;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoEmpleado;
	public JButton jButtonModificarEmpleado;
	public JButton jButtonActualizarEmpleado;
    public JButton jButtonEliminarEmpleado;
	public JButton jButtonCancelarEmpleado;
    public JButton jButtonGuardarCambiosEmpleado;
	public JButton jButtonGuardarCambiosTablaEmpleado;
	protected JButton jButtonCerrarEmpleado;
	
	
	protected JButton jButtonProcesarInformacionEmpleado;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoEmpleado;
	protected JCheckBox jCheckBoxPostAccionSinCerrarEmpleado;
	protected JCheckBox jCheckBoxPostAccionSinMensajeEmpleado;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEmpleado;
	protected JButton jButtonModificarToolBarEmpleado;
	protected JButton jButtonActualizarToolBarEmpleado;
    protected JButton jButtonEliminarToolBarEmpleado;
	protected JButton jButtonCancelarToolBarEmpleado;
    protected JButton jButtonGuardarCambiosToolBarEmpleado;
	protected JButton jButtonGuardarCambiosTablaToolBarEmpleado;
	protected JButton jButtonMostrarOcultarTablaToolBarEmpleado;
	protected JButton jButtonCerrarToolBarEmpleado;
	
	protected JButton jButtonProcesarInformacionToolBarEmpleado;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEmpleado;
	protected JMenuItem jMenuItemModificarEmpleado;
	protected JMenuItem jMenuItemActualizarEmpleado;
    protected JMenuItem jMenuItemEliminarEmpleado;
	protected JMenuItem jMenuItemCancelarEmpleado;
    protected JMenuItem jMenuItemGuardarCambiosEmpleado;
	protected JMenuItem jMenuItemGuardarCambiosTablaEmpleado;
	protected JMenuItem jMenuItemCerrarEmpleado;
	protected JMenuItem jMenuItemDetalleCerrarEmpleado;
	protected JMenuItem jMenuItemDetalleMostarOcultarEmpleado;
	
	protected JMenuItem jMenuItemProcesarInformacionEmpleado;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEmpleado;
	protected JMenuItem jMenuItemMostrarOcultarEmpleado;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEmpleado;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEmpleado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEmpleado;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioEmpleado;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidEmpleado;
	public JLabel jLabelIdEmpleado;
	public JLabel jLabelidEmpleado;
	public JButton jButtonidEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelcodigoEmpleado;
	public JLabel jLabelcodigoEmpleado;
	public JTextField jTextFieldcodigoEmpleado;
	public JButton jButtoncodigoEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelnombreEmpleado;
	public JLabel jLabelnombreEmpleado;
	public JTextArea jTextAreanombreEmpleado;
	public JScrollPane jscrollPanenombreEmpleado;
	public JButton jButtonnombreEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelapellidoEmpleado;
	public JLabel jLabelapellidoEmpleado;
	public JTextArea jTextAreaapellidoEmpleado;
	public JScrollPane jscrollPaneapellidoEmpleado;
	public JButton jButtonapellidoEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelnombre_completoEmpleado;
	public JLabel jLabelnombre_completoEmpleado;
	public JTextArea jTextAreanombre_completoEmpleado;
	public JScrollPane jscrollPanenombre_completoEmpleado;
	public JButton jButtonnombre_completoEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelmailEmpleado;
	public JLabel jLabelmailEmpleado;
	public JTextArea jTextAreamailEmpleado;
	public JScrollPane jscrollPanemailEmpleado;
	public JButton jButtonmailEmpleadoBusqueda= new JButtonMe();

	public JPanel jPaneldireccionEmpleado;
	public JLabel jLabeldireccionEmpleado;
	public JTextArea jTextAreadireccionEmpleado;
	public JScrollPane jscrollPanedireccionEmpleado;
	public JButton jButtondireccionEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelsueldoEmpleado;
	public JLabel jLabelsueldoEmpleado;
	public JTextField jTextFieldsueldoEmpleado;
	public JButton jButtonsueldoEmpleadoBusqueda= new JButtonMe();

	public JPanel jPaneltelefonoEmpleado;
	public JLabel jLabeltelefonoEmpleado;
	public JTextArea jTextAreatelefonoEmpleado;
	public JScrollPane jscrollPanetelefonoEmpleado;
	public JButton jButtontelefonoEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelnumero_cuentaEmpleado;
	public JLabel jLabelnumero_cuentaEmpleado;
	public JTextField jTextFieldnumero_cuentaEmpleado;
	public JButton jButtonnumero_cuentaEmpleadoBusqueda= new JButtonMe();

	public JPanel jPaneltiene_casaEmpleado;
	public JLabel jLabeltiene_casaEmpleado;
	public JCheckBox jCheckBoxtiene_casaEmpleado;
	public JButton jButtontiene_casaEmpleadoBusqueda= new JButtonMe();

	public JPanel jPaneltiene_vehiculoEmpleado;
	public JLabel jLabeltiene_vehiculoEmpleado;
	public JCheckBox jCheckBoxtiene_vehiculoEmpleado;
	public JButton jButtontiene_vehiculoEmpleadoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaEmpleado;
	public JLabel jLabelid_empresaEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaEmpleado;
	public JButton jButtonid_empresaEmpleado= new JButtonMe();
	public JButton jButtonid_empresaEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_empresaEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalEmpleado;
	public JLabel jLabelid_sucursalEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalEmpleado;
	public JButton jButtonid_sucursalEmpleado= new JButtonMe();
	public JButton jButtonid_sucursalEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_sucursalEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelid_paisEmpleado;
	public JLabel jLabelid_paisEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisEmpleado;
	public JButton jButtonid_paisEmpleado= new JButtonMe();
	public JButton jButtonid_paisEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_paisEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelid_provinciaEmpleado;
	public JLabel jLabelid_provinciaEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_provinciaEmpleado;
	public JButton jButtonid_provinciaEmpleado= new JButtonMe();
	public JButton jButtonid_provinciaEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_provinciaEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelid_ciudadEmpleado;
	public JLabel jLabelid_ciudadEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ciudadEmpleado;
	public JButton jButtonid_ciudadEmpleado= new JButtonMe();
	public JButton jButtonid_ciudadEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_ciudadEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelid_centro_costoEmpleado;
	public JLabel jLabelid_centro_costoEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_costoEmpleado;
	public JButton jButtonid_centro_costoEmpleado= new JButtonMe();
	public JButton jButtonid_centro_costoEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_centro_costoEmpleadoBusqueda= new JButtonMe();
	public JButton jButtonid_centro_costoEmpleadoArbol= new JButtonMe();

	public JPanel jPanelid_religionEmpleado;
	public JLabel jLabelid_religionEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_religionEmpleado;
	public JButton jButtonid_religionEmpleado= new JButtonMe();
	public JButton jButtonid_religionEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_religionEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelid_estado_civilEmpleado;
	public JLabel jLabelid_estado_civilEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_civilEmpleado;
	public JButton jButtonid_estado_civilEmpleado= new JButtonMe();
	public JButton jButtonid_estado_civilEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_estado_civilEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_generoEmpleado;
	public JLabel jLabelid_tipo_generoEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_generoEmpleado;
	public JButton jButtonid_tipo_generoEmpleado= new JButtonMe();
	public JButton jButtonid_tipo_generoEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_generoEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_empleadoEmpleado;
	public JLabel jLabelid_tipo_empleadoEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_empleadoEmpleado;
	public JButton jButtonid_tipo_empleadoEmpleado= new JButtonMe();
	public JButton jButtonid_tipo_empleadoEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_empleadoEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_instruccionEmpleado;
	public JLabel jLabelid_tipo_instruccionEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_instruccionEmpleado;
	public JButton jButtonid_tipo_instruccionEmpleado= new JButtonMe();
	public JButton jButtonid_tipo_instruccionEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_instruccionEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelid_cargoEmpleado;
	public JLabel jLabelid_cargoEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cargoEmpleado;
	public JButton jButtonid_cargoEmpleado= new JButtonMe();
	public JButton jButtonid_cargoEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_cargoEmpleadoBusqueda= new JButtonMe();
	public JButton jButtonid_cargoEmpleadoArbol= new JButtonMe();

	public JPanel jPanelid_estructuraEmpleado;
	public JLabel jLabelid_estructuraEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estructuraEmpleado;
	public JButton jButtonid_estructuraEmpleado= new JButtonMe();
	public JButton jButtonid_estructuraEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_estructuraEmpleadoBusqueda= new JButtonMe();
	public JButton jButtonid_estructuraEmpleadoArbol= new JButtonMe();

	public JPanel jPanelid_estructura_seccionEmpleado;
	public JLabel jLabelid_estructura_seccionEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estructura_seccionEmpleado;
	public JButton jButtonid_estructura_seccionEmpleado= new JButtonMe();
	public JButton jButtonid_estructura_seccionEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_estructura_seccionEmpleadoBusqueda= new JButtonMe();
	public JButton jButtonid_estructura_seccionEmpleadoArbol= new JButtonMe();

	public JPanel jPanelid_estado_empleadoEmpleado;
	public JLabel jLabelid_estado_empleadoEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_empleadoEmpleado;
	public JButton jButtonid_estado_empleadoEmpleado= new JButtonMe();
	public JButton jButtonid_estado_empleadoEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_estado_empleadoEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_contratoEmpleado;
	public JLabel jLabelid_tipo_contratoEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_contratoEmpleado;
	public JButton jButtonid_tipo_contratoEmpleado= new JButtonMe();
	public JButton jButtonid_tipo_contratoEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_contratoEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_cuenta_banco_globalEmpleado;
	public JLabel jLabelid_tipo_cuenta_banco_globalEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_cuenta_banco_globalEmpleado;
	public JButton jButtonid_tipo_cuenta_banco_globalEmpleado= new JButtonMe();
	public JButton jButtonid_tipo_cuenta_banco_globalEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_cuenta_banco_globalEmpleadoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesEmpleado;
	
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
	public int iHeightFormulario=1056;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public EmpleadoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposEmpleado=new JPanel();
				this.jPanelAccionesFormularioEmpleado=new JPanel();
				this.jmenuBarDetalleEmpleado=new JMenuBar();
				this.jTtoolBarDetalleEmpleado=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Empleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public EmpleadoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Empleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Empleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Empleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Empleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarEmpleado() {
		return this.jButtonActualizarToolBarEmpleado;
	}
	
	public JButton getjButtonEliminarToolBarEmpleado() {
		return this.jButtonEliminarToolBarEmpleado;
	}
	
	public JButton getjButtonCancelarToolBarEmpleado() {
		return this.jButtonCancelarToolBarEmpleado;
	}		
	
	public JButton getjButtonProcesarInformacionEmpleado() {
		return this.jButtonProcesarInformacionEmpleado;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEmpleado)	{
		this.jButtonProcesarInformacionEmpleado = jButtonProcesarInformacionEmpleado;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEmpleado() {
		return this.jComboBoxTiposAccionesEmpleado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEmpleado(
			JComboBox jComboBoxTiposRelacionesEmpleado) {
		this.jComboBoxTiposRelacionesEmpleado = jComboBoxTiposRelacionesEmpleado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEmpleado(
			JComboBox jComboBoxTiposAccionesEmpleado) {
		this.jComboBoxTiposAccionesEmpleado = jComboBoxTiposAccionesEmpleado;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioEmpleado() {
		return this.jComboBoxTiposAccionesFormularioEmpleado;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioEmpleado(
			JComboBox jComboBoxTiposAccionesFormularioEmpleado) {
		this.jComboBoxTiposAccionesFormularioEmpleado = jComboBoxTiposAccionesFormularioEmpleado;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.empleadoSessionBean=new EmpleadoSessionBean();
		
		this.empleadoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.empleadoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.empleadoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.cargafamiliar_nmSessionBean=new CargaFamiliar_NMSessionBean();
		//this.cursoSessionBean=new CursoSessionBean();
		//this.prestamoSessionBean=new PrestamoSessionBean();
		//this.empleadoidiomaSessionBean=new EmpleadoIdiomaSessionBean();
		//this.historialpagomesnomiSessionBean=new HistorialPagoMesNomiSessionBean();
		//this.empleadoimpuestorentaSessionBean=new EmpleadoImpuestoRentaSessionBean();
		//this.datogeneralempleadoSessionBean=new DatoGeneralEmpleadoSessionBean();
		//this.areaSessionBean=new AreaSessionBean();
		//this.gastoempleadoSessionBean=new GastoEmpleadoSessionBean();
		//this.empleadohobbySessionBean=new EmpleadoHobbySessionBean();
		//this.empleadoemailSessionBean=new EmpleadoEMailSessionBean();
		//this.rasgopersonalSessionBean=new RasgoPersonalSessionBean();
		//this.referenciaSessionBean=new ReferenciaSessionBean();
		//this.telefono_nmSessionBean=new Telefono_NMSessionBean();
		//this.novedadSessionBean=new NovedadSessionBean();
		//this.empleadoherraSessionBean=new EmpleadoHerraSessionBean();
		//this.empleadoenferSessionBean=new EmpleadoEnferSessionBean();
		//this.visaSessionBean=new VisaSessionBean();
		//this.seguroSessionBean=new SeguroSessionBean();
		//this.asistenciamensualSessionBean=new AsistenciaMensualSessionBean();
		//this.empleadodiscaSessionBean=new EmpleadoDiscaSessionBean();
		//this.profesionempleaSessionBean=new ProfesionEmpleaSessionBean();
		//this.rubroempleadoSessionBean=new RubroEmpleadoSessionBean();
		//this.empleadoconstanteSessionBean=new EmpleadoConstanteSessionBean();
		//this.tallavestidoSessionBean=new TallaVestidoSessionBean();
		//this.novedadnomiSessionBean=new NovedadNomiSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EmpleadoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Empleado MANTENIMIENTO"));
		
		
		if(iWidth > 2850) {
			iWidth=2850;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.empleadoSessionBean.getEsGuardarRelacionado()) {
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
	
		EmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleEmpleado= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarEmpleado=new JButtonMe();
				this.jButtonModificarToolBarEmpleado=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarEmpleado,this.jTtoolBarDetalleEmpleado,
							"actualizar","actualizar","Actualizar"+" "+EmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarEmpleado,this.jTtoolBarDetalleEmpleado,
							"eliminar","eliminar","Eliminar"+" "+EmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarEmpleado,this.jTtoolBarDetalleEmpleado,
							"cancelar","cancelar","Cancelar"+" "+EmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarEmpleado,this.jTtoolBarDetalleEmpleado,
							"guardarcambios","guardarcambios","Guardar"+" "+EmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleEmpleado=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleEmpleado=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoEmpleado=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesEmpleado=new JMenuMe("Acciones");
		this.jmenuDetalleDatosEmpleado=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEmpleado= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEmpleado.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEmpleado,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarEmpleado= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarEmpleado.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarEmpleado,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarEmpleado= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarEmpleado.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarEmpleado,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarEmpleado= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarEmpleado.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarEmpleado,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarEmpleado= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarEmpleado.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarEmpleado,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosEmpleado= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEmpleado.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEmpleado,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEmpleado= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEmpleado.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEmpleado,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarEmpleado= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarEmpleado.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarEmpleado,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEmpleado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEmpleado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEmpleado,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEmpleado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEmpleado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEmpleado,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoEmpleado.add(this.jMenuItemDetalleCerrarEmpleado);
		
		this.jmenuDetalleAccionesEmpleado.add(this.jMenuItemActualizarEmpleado);
		this.jmenuDetalleAccionesEmpleado.add(this.jMenuItemEliminarEmpleado);
		this.jmenuDetalleAccionesEmpleado.add(this.jMenuItemCancelarEmpleado);		
		
		//this.jmenuDetalleDatosEmpleado.add(this.jMenuItemDetalleAbrirOrderByEmpleado);				
		this.jmenuDetalleDatosEmpleado.add(this.jMenuItemDetalleMostarOcultarEmpleado);				
				
		//this.jmenuDetalleAccionesEmpleado.add(this.jMenuItemGuardarCambiosEmpleado);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleEmpleado.add(this.jmenuDetalleArchivoEmpleado);		
		this.jmenuBarDetalleEmpleado.add(this.jmenuDetalleAccionesEmpleado);		
		this.jmenuBarDetalleEmpleado.add(this.jmenuDetalleDatosEmpleado);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleEmpleado.add(this.jmenuDetalleEmpleado);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleEmpleado);				
	}
	
	
	public void inicializarElementosCamposEmpleado() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdEmpleado = new JLabelMe();
		jLabelIdEmpleado.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidEmpleado = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidEmpleado.setToolTipText(EmpleadoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutEmpleado= new GridBagLayout();

		this.jPanelidEmpleado.setLayout(this.gridaBagLayoutEmpleado);

		jLabelidEmpleado = new JLabel();
		jLabelidEmpleado.setText("Id");

		jLabelidEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoEmpleado = new JLabelMe();
		this.jLabelcodigoEmpleado.setText(""+EmpleadoConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoEmpleado.setToolTipText("Codigo");
		this.jLabelcodigoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoEmpleado.setToolTipText(EmpleadoConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutEmpleado = new GridBagLayout();
		this.jPanelcodigoEmpleado.setLayout(this.gridaBagLayoutEmpleado);


		jTextFieldcodigoEmpleado= new JTextFieldMe();

		jTextFieldcodigoEmpleado.setEnabled(false);
		jTextFieldcodigoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoEmpleadoBusqueda= new JButtonMe();
		this.jButtoncodigoEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoEmpleadoBusqueda.setText("U");
		this.jButtoncodigoEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoEmpleadoBusqueda"));

		if(this.empleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabelnombreEmpleado = new JLabelMe();
		this.jLabelnombreEmpleado.setText(""+EmpleadoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreEmpleado.setToolTipText("Nombre");
		this.jLabelnombreEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreEmpleado.setToolTipText(EmpleadoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutEmpleado = new GridBagLayout();
		this.jPanelnombreEmpleado.setLayout(this.gridaBagLayoutEmpleado);


		jTextAreanombreEmpleado= new JTextAreaMe();
		jTextAreanombreEmpleado.setEnabled(false);
		jTextAreanombreEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEmpleado.setLineWrap(true);
		jTextAreanombreEmpleado.setWrapStyleWord(true);
		jTextAreanombreEmpleado.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreEmpleado.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreEmpleado = new JScrollPane(jTextAreanombreEmpleado);
		jscrollPanenombreEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreEmpleadoBusqueda= new JButtonMe();
		this.jButtonnombreEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreEmpleadoBusqueda.setText("U");
		this.jButtonnombreEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreEmpleadoBusqueda"));

		if(this.empleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabelapellidoEmpleado = new JLabelMe();
		this.jLabelapellidoEmpleado.setText(""+EmpleadoConstantesFunciones.LABEL_APELLIDO+" : *");
		this.jLabelapellidoEmpleado.setToolTipText("Apellido");
		this.jLabelapellidoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelapellidoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelapellidoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelapellidoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelapellidoEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelapellidoEmpleado.setToolTipText(EmpleadoConstantesFunciones.LABEL_APELLIDO);
		this.gridaBagLayoutEmpleado = new GridBagLayout();
		this.jPanelapellidoEmpleado.setLayout(this.gridaBagLayoutEmpleado);


		jTextAreaapellidoEmpleado= new JTextAreaMe();
		jTextAreaapellidoEmpleado.setEnabled(false);
		jTextAreaapellidoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaapellidoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaapellidoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaapellidoEmpleado.setLineWrap(true);
		jTextAreaapellidoEmpleado.setWrapStyleWord(true);
		jTextAreaapellidoEmpleado.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaapellidoEmpleado.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreaapellidoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneapellidoEmpleado = new JScrollPane(jTextAreaapellidoEmpleado);
		jscrollPaneapellidoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneapellidoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneapellidoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonapellidoEmpleadoBusqueda= new JButtonMe();
		this.jButtonapellidoEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonapellidoEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonapellidoEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonapellidoEmpleadoBusqueda.setText("U");
		this.jButtonapellidoEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonapellidoEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonapellidoEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaapellidoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaapellidoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"apellidoEmpleadoBusqueda"));

		if(this.empleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonapellidoEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabelnombre_completoEmpleado = new JLabelMe();
		this.jLabelnombre_completoEmpleado.setText(""+EmpleadoConstantesFunciones.LABEL_NOMBRECOMPLETO+" : *");
		this.jLabelnombre_completoEmpleado.setToolTipText("Nombre Completo");
		this.jLabelnombre_completoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_completoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_completoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_completoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_completoEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_completoEmpleado.setToolTipText(EmpleadoConstantesFunciones.LABEL_NOMBRECOMPLETO);
		this.gridaBagLayoutEmpleado = new GridBagLayout();
		this.jPanelnombre_completoEmpleado.setLayout(this.gridaBagLayoutEmpleado);


		jTextAreanombre_completoEmpleado= new JTextAreaMe();
		jTextAreanombre_completoEmpleado.setEnabled(false);
		jTextAreanombre_completoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoEmpleado.setLineWrap(true);
		jTextAreanombre_completoEmpleado.setWrapStyleWord(true);
		jTextAreanombre_completoEmpleado.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_completoEmpleado.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_completoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_completoEmpleado = new JScrollPane(jTextAreanombre_completoEmpleado);
		jscrollPanenombre_completoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombre_completoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombre_completoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonnombre_completoEmpleadoBusqueda= new JButtonMe();
		this.jButtonnombre_completoEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completoEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completoEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_completoEmpleadoBusqueda.setText("U");
		this.jButtonnombre_completoEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_completoEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_completoEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_completoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_completoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_completoEmpleadoBusqueda"));

		if(this.empleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_completoEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabelmailEmpleado = new JLabelMe();
		this.jLabelmailEmpleado.setText(""+EmpleadoConstantesFunciones.LABEL_MAIL+" : *");
		this.jLabelmailEmpleado.setToolTipText("Mail");
		this.jLabelmailEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmailEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmailEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelmailEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmailEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmailEmpleado.setToolTipText(EmpleadoConstantesFunciones.LABEL_MAIL);
		this.gridaBagLayoutEmpleado = new GridBagLayout();
		this.jPanelmailEmpleado.setLayout(this.gridaBagLayoutEmpleado);


		jTextAreamailEmpleado= new JTextAreaMe();
		jTextAreamailEmpleado.setEnabled(false);
		jTextAreamailEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreamailEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreamailEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreamailEmpleado.setLineWrap(true);
		jTextAreamailEmpleado.setWrapStyleWord(true);
		jTextAreamailEmpleado.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreamailEmpleado.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreamailEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanemailEmpleado = new JScrollPane(jTextAreamailEmpleado);
		jscrollPanemailEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanemailEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanemailEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonmailEmpleadoBusqueda= new JButtonMe();
		this.jButtonmailEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmailEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmailEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmailEmpleadoBusqueda.setText("U");
		this.jButtonmailEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmailEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmailEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreamailEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreamailEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"mailEmpleadoBusqueda"));

		if(this.empleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmailEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabeldireccionEmpleado = new JLabelMe();
		this.jLabeldireccionEmpleado.setText(""+EmpleadoConstantesFunciones.LABEL_DIRECCION+" : *");
		this.jLabeldireccionEmpleado.setToolTipText("Direccion");
		this.jLabeldireccionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldireccionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldireccionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldireccionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldireccionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldireccionEmpleado.setToolTipText(EmpleadoConstantesFunciones.LABEL_DIRECCION);
		this.gridaBagLayoutEmpleado = new GridBagLayout();
		this.jPaneldireccionEmpleado.setLayout(this.gridaBagLayoutEmpleado);


		jTextAreadireccionEmpleado= new JTextAreaMe();
		jTextAreadireccionEmpleado.setEnabled(false);
		jTextAreadireccionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionEmpleado.setLineWrap(true);
		jTextAreadireccionEmpleado.setWrapStyleWord(true);
		jTextAreadireccionEmpleado.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadireccionEmpleado.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreadireccionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedireccionEmpleado = new JScrollPane(jTextAreadireccionEmpleado);
		jscrollPanedireccionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedireccionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedireccionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondireccionEmpleadoBusqueda= new JButtonMe();
		this.jButtondireccionEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccionEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccionEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondireccionEmpleadoBusqueda.setText("U");
		this.jButtondireccionEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondireccionEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondireccionEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadireccionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadireccionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"direccionEmpleadoBusqueda"));

		if(this.empleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondireccionEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabelsueldoEmpleado = new JLabelMe();
		this.jLabelsueldoEmpleado.setText(""+EmpleadoConstantesFunciones.LABEL_SUELDO+" : *");
		this.jLabelsueldoEmpleado.setToolTipText("Sueldo");
		this.jLabelsueldoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsueldoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsueldoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsueldoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsueldoEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsueldoEmpleado.setToolTipText(EmpleadoConstantesFunciones.LABEL_SUELDO);
		this.gridaBagLayoutEmpleado = new GridBagLayout();
		this.jPanelsueldoEmpleado.setLayout(this.gridaBagLayoutEmpleado);


		jTextFieldsueldoEmpleado= new JTextFieldMe();
		jTextFieldsueldoEmpleado.setEnabled(false);
		jTextFieldsueldoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsueldoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsueldoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsueldoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsueldoEmpleado.setText("0.0");

		this.jButtonsueldoEmpleadoBusqueda= new JButtonMe();
		this.jButtonsueldoEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsueldoEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsueldoEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsueldoEmpleadoBusqueda.setText("U");
		this.jButtonsueldoEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsueldoEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsueldoEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsueldoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsueldoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"sueldoEmpleadoBusqueda"));

		if(this.empleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsueldoEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabeltelefonoEmpleado = new JLabelMe();
		this.jLabeltelefonoEmpleado.setText(""+EmpleadoConstantesFunciones.LABEL_TELEFONO+" : *");
		this.jLabeltelefonoEmpleado.setToolTipText("Telefono");
		this.jLabeltelefonoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefonoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefonoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltelefonoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltelefonoEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltelefonoEmpleado.setToolTipText(EmpleadoConstantesFunciones.LABEL_TELEFONO);
		this.gridaBagLayoutEmpleado = new GridBagLayout();
		this.jPaneltelefonoEmpleado.setLayout(this.gridaBagLayoutEmpleado);


		jTextAreatelefonoEmpleado= new JTextAreaMe();
		jTextAreatelefonoEmpleado.setEnabled(false);
		jTextAreatelefonoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefonoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefonoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefonoEmpleado.setLineWrap(true);
		jTextAreatelefonoEmpleado.setWrapStyleWord(true);
		jTextAreatelefonoEmpleado.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreatelefonoEmpleado.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreatelefonoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanetelefonoEmpleado = new JScrollPane(jTextAreatelefonoEmpleado);
		jscrollPanetelefonoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanetelefonoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanetelefonoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtontelefonoEmpleadoBusqueda= new JButtonMe();
		this.jButtontelefonoEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonoEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonoEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontelefonoEmpleadoBusqueda.setText("U");
		this.jButtontelefonoEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontelefonoEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontelefonoEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreatelefonoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreatelefonoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"telefonoEmpleadoBusqueda"));

		if(this.empleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontelefonoEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabelnumero_cuentaEmpleado = new JLabelMe();
		this.jLabelnumero_cuentaEmpleado.setText(""+EmpleadoConstantesFunciones.LABEL_NUMEROCUENTA+" : *");
		this.jLabelnumero_cuentaEmpleado.setToolTipText("Numero Cuenta");
		this.jLabelnumero_cuentaEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_cuentaEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_cuentaEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_cuentaEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_cuentaEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_cuentaEmpleado.setToolTipText(EmpleadoConstantesFunciones.LABEL_NUMEROCUENTA);
		this.gridaBagLayoutEmpleado = new GridBagLayout();
		this.jPanelnumero_cuentaEmpleado.setLayout(this.gridaBagLayoutEmpleado);


		jTextFieldnumero_cuentaEmpleado= new JTextFieldMe();

		jTextFieldnumero_cuentaEmpleado.setEnabled(false);
		jTextFieldnumero_cuentaEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_cuentaEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_cuentaEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_cuentaEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_cuentaEmpleadoBusqueda= new JButtonMe();
		this.jButtonnumero_cuentaEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_cuentaEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_cuentaEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_cuentaEmpleadoBusqueda.setText("U");
		this.jButtonnumero_cuentaEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_cuentaEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_cuentaEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_cuentaEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_cuentaEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_cuentaEmpleadoBusqueda"));

		if(this.empleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_cuentaEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabeltiene_casaEmpleado = new JLabelMe();
		this.jLabeltiene_casaEmpleado.setText(""+EmpleadoConstantesFunciones.LABEL_TIENECASA+" : *");
		this.jLabeltiene_casaEmpleado.setToolTipText("Tiene Casa");
		this.jLabeltiene_casaEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltiene_casaEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltiene_casaEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltiene_casaEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltiene_casaEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltiene_casaEmpleado.setToolTipText(EmpleadoConstantesFunciones.LABEL_TIENECASA);
		this.gridaBagLayoutEmpleado = new GridBagLayout();
		this.jPaneltiene_casaEmpleado.setLayout(this.gridaBagLayoutEmpleado);


		jCheckBoxtiene_casaEmpleado= new JCheckBoxMe();
		jCheckBoxtiene_casaEmpleado.setEnabled(false);

		jCheckBoxtiene_casaEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxtiene_casaEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxtiene_casaEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxtiene_casaEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtontiene_casaEmpleadoBusqueda= new JButtonMe();
		this.jButtontiene_casaEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontiene_casaEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontiene_casaEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontiene_casaEmpleadoBusqueda.setText("U");
		this.jButtontiene_casaEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontiene_casaEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontiene_casaEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxtiene_casaEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxtiene_casaEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"tiene_casaEmpleadoBusqueda"));

		if(this.empleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontiene_casaEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabeltiene_vehiculoEmpleado = new JLabelMe();
		this.jLabeltiene_vehiculoEmpleado.setText(""+EmpleadoConstantesFunciones.LABEL_TIENEVEHICULO+" : *");
		this.jLabeltiene_vehiculoEmpleado.setToolTipText("Tiene Vehiculo");
		this.jLabeltiene_vehiculoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltiene_vehiculoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltiene_vehiculoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltiene_vehiculoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltiene_vehiculoEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltiene_vehiculoEmpleado.setToolTipText(EmpleadoConstantesFunciones.LABEL_TIENEVEHICULO);
		this.gridaBagLayoutEmpleado = new GridBagLayout();
		this.jPaneltiene_vehiculoEmpleado.setLayout(this.gridaBagLayoutEmpleado);


		jCheckBoxtiene_vehiculoEmpleado= new JCheckBoxMe();
		jCheckBoxtiene_vehiculoEmpleado.setEnabled(false);

		jCheckBoxtiene_vehiculoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxtiene_vehiculoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxtiene_vehiculoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxtiene_vehiculoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtontiene_vehiculoEmpleadoBusqueda= new JButtonMe();
		this.jButtontiene_vehiculoEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontiene_vehiculoEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontiene_vehiculoEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontiene_vehiculoEmpleadoBusqueda.setText("U");
		this.jButtontiene_vehiculoEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontiene_vehiculoEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontiene_vehiculoEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxtiene_vehiculoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxtiene_vehiculoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"tiene_vehiculoEmpleadoBusqueda"));

		if(this.empleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontiene_vehiculoEmpleadoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysEmpleado() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaEmpleado = new JLabelMe();
		this.jLabelid_empresaEmpleado.setText(""+EmpleadoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaEmpleado.setToolTipText("Empresa");
		this.jLabelid_empresaEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaEmpleado.setToolTipText(EmpleadoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutEmpleado = new GridBagLayout();
		this.jPanelid_empresaEmpleado.setLayout(this.gridaBagLayoutEmpleado);


		jComboBoxid_empresaEmpleado= new JComboBoxMe();
		jComboBoxid_empresaEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaEmpleado.setEnabled(false);

		this.jButtonid_empresaEmpleado= new JButtonMe();
		this.jButtonid_empresaEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEmpleado.setText("Buscar");
		this.jButtonid_empresaEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEmpleado"));

		this.jButtonid_empresaEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_empresaEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaEmpleadoBusqueda.setText("U");
		this.jButtonid_empresaEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEmpleadoBusqueda"));

		if(this.empleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_empresaEmpleadoUpdate= new JButtonMe();
		this.jButtonid_empresaEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaEmpleadoUpdate.setText("U");
		this.jButtonid_empresaEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEmpleadoUpdate"));



					
		this.jLabelid_sucursalEmpleado = new JLabelMe();
		this.jLabelid_sucursalEmpleado.setText(""+EmpleadoConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalEmpleado.setToolTipText("Sucursal");
		this.jLabelid_sucursalEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalEmpleado.setToolTipText(EmpleadoConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutEmpleado = new GridBagLayout();
		this.jPanelid_sucursalEmpleado.setLayout(this.gridaBagLayoutEmpleado);


		jComboBoxid_sucursalEmpleado= new JComboBoxMe();
		jComboBoxid_sucursalEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalEmpleado.setEnabled(false);

		this.jButtonid_sucursalEmpleado= new JButtonMe();
		this.jButtonid_sucursalEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalEmpleado.setText("Buscar");
		this.jButtonid_sucursalEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalEmpleado"));

		this.jButtonid_sucursalEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_sucursalEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalEmpleadoBusqueda.setText("U");
		this.jButtonid_sucursalEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalEmpleadoBusqueda"));

		if(this.empleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_sucursalEmpleadoUpdate= new JButtonMe();
		this.jButtonid_sucursalEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalEmpleadoUpdate.setText("U");
		this.jButtonid_sucursalEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalEmpleadoUpdate"));



					
		this.jLabelid_paisEmpleado = new JLabelMe();
		this.jLabelid_paisEmpleado.setText(""+EmpleadoConstantesFunciones.LABEL_IDPAIS+" : *");
		this.jLabelid_paisEmpleado.setToolTipText("Pais");
		this.jLabelid_paisEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_paisEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_paisEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_paisEmpleado.setToolTipText(EmpleadoConstantesFunciones.LABEL_IDPAIS);
		this.gridaBagLayoutEmpleado = new GridBagLayout();
		this.jPanelid_paisEmpleado.setLayout(this.gridaBagLayoutEmpleado);


		jComboBoxid_paisEmpleado= new JComboBoxMe();
		jComboBoxid_paisEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_paisEmpleado= new JButtonMe();
		this.jButtonid_paisEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisEmpleado.setText("Buscar");
		this.jButtonid_paisEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_paisEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_paisEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisEmpleado"));

		this.jButtonid_paisEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_paisEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisEmpleadoBusqueda.setText("U");
		this.jButtonid_paisEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_paisEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_paisEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisEmpleadoBusqueda"));

		if(this.empleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_paisEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_paisEmpleadoUpdate= new JButtonMe();
		this.jButtonid_paisEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisEmpleadoUpdate.setText("U");
		this.jButtonid_paisEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_paisEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_paisEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisEmpleadoUpdate"));



					
		this.jLabelid_provinciaEmpleado = new JLabelMe();
		this.jLabelid_provinciaEmpleado.setText(""+EmpleadoConstantesFunciones.LABEL_IDPROVINCIA+" : *");
		this.jLabelid_provinciaEmpleado.setToolTipText("Provincia");
		this.jLabelid_provinciaEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_provinciaEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_provinciaEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_provinciaEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_provinciaEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_provinciaEmpleado.setToolTipText(EmpleadoConstantesFunciones.LABEL_IDPROVINCIA);
		this.gridaBagLayoutEmpleado = new GridBagLayout();
		this.jPanelid_provinciaEmpleado.setLayout(this.gridaBagLayoutEmpleado);


		jComboBoxid_provinciaEmpleado= new JComboBoxMe();
		jComboBoxid_provinciaEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_provinciaEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_provinciaEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_provinciaEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_provinciaEmpleado= new JButtonMe();
		this.jButtonid_provinciaEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_provinciaEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_provinciaEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_provinciaEmpleado.setText("Buscar");
		this.jButtonid_provinciaEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_provinciaEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_provinciaEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_provinciaEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_provinciaEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_provinciaEmpleado"));

		this.jButtonid_provinciaEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_provinciaEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_provinciaEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_provinciaEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_provinciaEmpleadoBusqueda.setText("U");
		this.jButtonid_provinciaEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_provinciaEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_provinciaEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_provinciaEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_provinciaEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_provinciaEmpleadoBusqueda"));

		if(this.empleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_provinciaEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_provinciaEmpleadoUpdate= new JButtonMe();
		this.jButtonid_provinciaEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_provinciaEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_provinciaEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_provinciaEmpleadoUpdate.setText("U");
		this.jButtonid_provinciaEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_provinciaEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_provinciaEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_provinciaEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_provinciaEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_provinciaEmpleadoUpdate"));



					
		this.jLabelid_ciudadEmpleado = new JLabelMe();
		this.jLabelid_ciudadEmpleado.setText(""+EmpleadoConstantesFunciones.LABEL_IDCIUDAD+" : *");
		this.jLabelid_ciudadEmpleado.setToolTipText("Ciudad");
		this.jLabelid_ciudadEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ciudadEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ciudadEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ciudadEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ciudadEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ciudadEmpleado.setToolTipText(EmpleadoConstantesFunciones.LABEL_IDCIUDAD);
		this.gridaBagLayoutEmpleado = new GridBagLayout();
		this.jPanelid_ciudadEmpleado.setLayout(this.gridaBagLayoutEmpleado);


		jComboBoxid_ciudadEmpleado= new JComboBoxMe();
		jComboBoxid_ciudadEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ciudadEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_ciudadEmpleado= new JButtonMe();
		this.jButtonid_ciudadEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadEmpleado.setText("Buscar");
		this.jButtonid_ciudadEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ciudadEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ciudadEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadEmpleado"));

		this.jButtonid_ciudadEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_ciudadEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ciudadEmpleadoBusqueda.setText("U");
		this.jButtonid_ciudadEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ciudadEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ciudadEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadEmpleadoBusqueda"));

		if(this.empleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ciudadEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_ciudadEmpleadoUpdate= new JButtonMe();
		this.jButtonid_ciudadEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ciudadEmpleadoUpdate.setText("U");
		this.jButtonid_ciudadEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ciudadEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ciudadEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadEmpleadoUpdate"));



					
		this.jLabelid_centro_costoEmpleado = new JLabelMe();
		this.jLabelid_centro_costoEmpleado.setText(""+EmpleadoConstantesFunciones.LABEL_IDCENTROCOSTO+" : *");
		this.jLabelid_centro_costoEmpleado.setToolTipText("Centro Costo");
		this.jLabelid_centro_costoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_centro_costoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_centro_costoEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_centro_costoEmpleado.setToolTipText(EmpleadoConstantesFunciones.LABEL_IDCENTROCOSTO);
		this.gridaBagLayoutEmpleado = new GridBagLayout();
		this.jPanelid_centro_costoEmpleado.setLayout(this.gridaBagLayoutEmpleado);


		jComboBoxid_centro_costoEmpleado= new JComboBoxMe();
		jComboBoxid_centro_costoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_costoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_centro_costoEmpleado= new JButtonMe();
		this.jButtonid_centro_costoEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoEmpleado.setText("Buscar");
		this.jButtonid_centro_costoEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_centro_costoEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_centro_costoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoEmpleado"));

		this.jButtonid_centro_costoEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_centro_costoEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoEmpleadoBusqueda.setText("U");
		this.jButtonid_centro_costoEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_centro_costoEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_centro_costoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoEmpleadoBusqueda"));

		if(this.empleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_centro_costoEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_centro_costoEmpleadoUpdate= new JButtonMe();
		this.jButtonid_centro_costoEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoEmpleadoUpdate.setText("U");
		this.jButtonid_centro_costoEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_centro_costoEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_centro_costoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoEmpleadoUpdate"));


		jButtonid_centro_costoEmpleadoArbol= new JButtonMe();
		jButtonid_centro_costoEmpleadoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoEmpleadoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoEmpleadoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoEmpleadoArbol.setText("Arbol");
		jButtonid_centro_costoEmpleadoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_centro_costoEmpleadoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoEmpleadoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_centro_costoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoEmpleadoArbol"));



					
		this.jLabelid_religionEmpleado = new JLabelMe();
		this.jLabelid_religionEmpleado.setText(""+EmpleadoConstantesFunciones.LABEL_IDRELIGION+" : *");
		this.jLabelid_religionEmpleado.setToolTipText("Religion");
		this.jLabelid_religionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_religionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_religionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_religionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_religionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_religionEmpleado.setToolTipText(EmpleadoConstantesFunciones.LABEL_IDRELIGION);
		this.gridaBagLayoutEmpleado = new GridBagLayout();
		this.jPanelid_religionEmpleado.setLayout(this.gridaBagLayoutEmpleado);


		jComboBoxid_religionEmpleado= new JComboBoxMe();
		jComboBoxid_religionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_religionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_religionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_religionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_religionEmpleado= new JButtonMe();
		this.jButtonid_religionEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_religionEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_religionEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_religionEmpleado.setText("Buscar");
		this.jButtonid_religionEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_religionEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_religionEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_religionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_religionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_religionEmpleado"));

		this.jButtonid_religionEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_religionEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_religionEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_religionEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_religionEmpleadoBusqueda.setText("U");
		this.jButtonid_religionEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_religionEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_religionEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_religionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_religionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_religionEmpleadoBusqueda"));

		if(this.empleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_religionEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_religionEmpleadoUpdate= new JButtonMe();
		this.jButtonid_religionEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_religionEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_religionEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_religionEmpleadoUpdate.setText("U");
		this.jButtonid_religionEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_religionEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_religionEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_religionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_religionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_religionEmpleadoUpdate"));



					
		this.jLabelid_estado_civilEmpleado = new JLabelMe();
		this.jLabelid_estado_civilEmpleado.setText(""+EmpleadoConstantesFunciones.LABEL_IDESTADOCIVIL+" : *");
		this.jLabelid_estado_civilEmpleado.setToolTipText("Estado Civil");
		this.jLabelid_estado_civilEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_civilEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_civilEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_civilEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_civilEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_civilEmpleado.setToolTipText(EmpleadoConstantesFunciones.LABEL_IDESTADOCIVIL);
		this.gridaBagLayoutEmpleado = new GridBagLayout();
		this.jPanelid_estado_civilEmpleado.setLayout(this.gridaBagLayoutEmpleado);


		jComboBoxid_estado_civilEmpleado= new JComboBoxMe();
		jComboBoxid_estado_civilEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_civilEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_civilEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_civilEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estado_civilEmpleado= new JButtonMe();
		this.jButtonid_estado_civilEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_civilEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_civilEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_civilEmpleado.setText("Buscar");
		this.jButtonid_estado_civilEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_civilEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_civilEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_civilEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_civilEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_civilEmpleado"));

		this.jButtonid_estado_civilEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_estado_civilEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_civilEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_civilEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_civilEmpleadoBusqueda.setText("U");
		this.jButtonid_estado_civilEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_civilEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_civilEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_civilEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_civilEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_civilEmpleadoBusqueda"));

		if(this.empleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_civilEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_estado_civilEmpleadoUpdate= new JButtonMe();
		this.jButtonid_estado_civilEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_civilEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_civilEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_civilEmpleadoUpdate.setText("U");
		this.jButtonid_estado_civilEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_civilEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_civilEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_civilEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_civilEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_civilEmpleadoUpdate"));



					
		this.jLabelid_tipo_generoEmpleado = new JLabelMe();
		this.jLabelid_tipo_generoEmpleado.setText(""+EmpleadoConstantesFunciones.LABEL_IDTIPOGENERO+" : *");
		this.jLabelid_tipo_generoEmpleado.setToolTipText("Tipo Genero");
		this.jLabelid_tipo_generoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_generoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_generoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_generoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_generoEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_generoEmpleado.setToolTipText(EmpleadoConstantesFunciones.LABEL_IDTIPOGENERO);
		this.gridaBagLayoutEmpleado = new GridBagLayout();
		this.jPanelid_tipo_generoEmpleado.setLayout(this.gridaBagLayoutEmpleado);


		jComboBoxid_tipo_generoEmpleado= new JComboBoxMe();
		jComboBoxid_tipo_generoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_generoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_generoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_generoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_generoEmpleado= new JButtonMe();
		this.jButtonid_tipo_generoEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_generoEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_generoEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_generoEmpleado.setText("Buscar");
		this.jButtonid_tipo_generoEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_generoEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_generoEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_generoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_generoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_generoEmpleado"));

		this.jButtonid_tipo_generoEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_tipo_generoEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_generoEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_generoEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_generoEmpleadoBusqueda.setText("U");
		this.jButtonid_tipo_generoEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_generoEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_generoEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_generoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_generoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_generoEmpleadoBusqueda"));

		if(this.empleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_generoEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_generoEmpleadoUpdate= new JButtonMe();
		this.jButtonid_tipo_generoEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_generoEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_generoEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_generoEmpleadoUpdate.setText("U");
		this.jButtonid_tipo_generoEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_generoEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_generoEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_generoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_generoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_generoEmpleadoUpdate"));



					
		this.jLabelid_tipo_empleadoEmpleado = new JLabelMe();
		this.jLabelid_tipo_empleadoEmpleado.setText(""+EmpleadoConstantesFunciones.LABEL_IDTIPOEMPLEADO+" : *");
		this.jLabelid_tipo_empleadoEmpleado.setToolTipText("Tipo Empleado");
		this.jLabelid_tipo_empleadoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_empleadoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_empleadoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_empleadoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_empleadoEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_empleadoEmpleado.setToolTipText(EmpleadoConstantesFunciones.LABEL_IDTIPOEMPLEADO);
		this.gridaBagLayoutEmpleado = new GridBagLayout();
		this.jPanelid_tipo_empleadoEmpleado.setLayout(this.gridaBagLayoutEmpleado);


		jComboBoxid_tipo_empleadoEmpleado= new JComboBoxMe();
		jComboBoxid_tipo_empleadoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_empleadoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_empleadoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_empleadoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_empleadoEmpleado= new JButtonMe();
		this.jButtonid_tipo_empleadoEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_empleadoEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_empleadoEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_empleadoEmpleado.setText("Buscar");
		this.jButtonid_tipo_empleadoEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_empleadoEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_empleadoEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_empleadoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_empleadoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_empleadoEmpleado"));

		this.jButtonid_tipo_empleadoEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_tipo_empleadoEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_empleadoEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_empleadoEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_empleadoEmpleadoBusqueda.setText("U");
		this.jButtonid_tipo_empleadoEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_empleadoEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_empleadoEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_empleadoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_empleadoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_empleadoEmpleadoBusqueda"));

		if(this.empleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_empleadoEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_empleadoEmpleadoUpdate= new JButtonMe();
		this.jButtonid_tipo_empleadoEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_empleadoEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_empleadoEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_empleadoEmpleadoUpdate.setText("U");
		this.jButtonid_tipo_empleadoEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_empleadoEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_empleadoEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_empleadoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_empleadoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_empleadoEmpleadoUpdate"));



					
		this.jLabelid_tipo_instruccionEmpleado = new JLabelMe();
		this.jLabelid_tipo_instruccionEmpleado.setText(""+EmpleadoConstantesFunciones.LABEL_IDTIPOINSTRUCCION+" : *");
		this.jLabelid_tipo_instruccionEmpleado.setToolTipText("Tipo Instruccion");
		this.jLabelid_tipo_instruccionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_instruccionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_instruccionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_instruccionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_instruccionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_instruccionEmpleado.setToolTipText(EmpleadoConstantesFunciones.LABEL_IDTIPOINSTRUCCION);
		this.gridaBagLayoutEmpleado = new GridBagLayout();
		this.jPanelid_tipo_instruccionEmpleado.setLayout(this.gridaBagLayoutEmpleado);


		jComboBoxid_tipo_instruccionEmpleado= new JComboBoxMe();
		jComboBoxid_tipo_instruccionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_instruccionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_instruccionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_instruccionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_instruccionEmpleado= new JButtonMe();
		this.jButtonid_tipo_instruccionEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_instruccionEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_instruccionEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_instruccionEmpleado.setText("Buscar");
		this.jButtonid_tipo_instruccionEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_instruccionEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_instruccionEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_instruccionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_instruccionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_instruccionEmpleado"));

		this.jButtonid_tipo_instruccionEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_tipo_instruccionEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_instruccionEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_instruccionEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_instruccionEmpleadoBusqueda.setText("U");
		this.jButtonid_tipo_instruccionEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_instruccionEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_instruccionEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_instruccionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_instruccionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_instruccionEmpleadoBusqueda"));

		if(this.empleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_instruccionEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_instruccionEmpleadoUpdate= new JButtonMe();
		this.jButtonid_tipo_instruccionEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_instruccionEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_instruccionEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_instruccionEmpleadoUpdate.setText("U");
		this.jButtonid_tipo_instruccionEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_instruccionEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_instruccionEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_instruccionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_instruccionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_instruccionEmpleadoUpdate"));



					
		this.jLabelid_cargoEmpleado = new JLabelMe();
		this.jLabelid_cargoEmpleado.setText(""+EmpleadoConstantesFunciones.LABEL_IDCARGO+" : *");
		this.jLabelid_cargoEmpleado.setToolTipText("Cargo");
		this.jLabelid_cargoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cargoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cargoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cargoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cargoEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cargoEmpleado.setToolTipText(EmpleadoConstantesFunciones.LABEL_IDCARGO);
		this.gridaBagLayoutEmpleado = new GridBagLayout();
		this.jPanelid_cargoEmpleado.setLayout(this.gridaBagLayoutEmpleado);


		jComboBoxid_cargoEmpleado= new JComboBoxMe();
		jComboBoxid_cargoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cargoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cargoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cargoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cargoEmpleado= new JButtonMe();
		this.jButtonid_cargoEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cargoEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cargoEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cargoEmpleado.setText("Buscar");
		this.jButtonid_cargoEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cargoEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cargoEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cargoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cargoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cargoEmpleado"));

		this.jButtonid_cargoEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_cargoEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cargoEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cargoEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cargoEmpleadoBusqueda.setText("U");
		this.jButtonid_cargoEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cargoEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cargoEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cargoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cargoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cargoEmpleadoBusqueda"));

		if(this.empleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cargoEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_cargoEmpleadoUpdate= new JButtonMe();
		this.jButtonid_cargoEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cargoEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cargoEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cargoEmpleadoUpdate.setText("U");
		this.jButtonid_cargoEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cargoEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cargoEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cargoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cargoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cargoEmpleadoUpdate"));


		jButtonid_cargoEmpleadoArbol= new JButtonMe();
		jButtonid_cargoEmpleadoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cargoEmpleadoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cargoEmpleadoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cargoEmpleadoArbol.setText("Arbol");
		jButtonid_cargoEmpleadoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cargoEmpleadoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cargoEmpleadoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cargoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cargoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cargoEmpleadoArbol"));



					
		this.jLabelid_estructuraEmpleado = new JLabelMe();
		this.jLabelid_estructuraEmpleado.setText(""+EmpleadoConstantesFunciones.LABEL_IDESTRUCTURA+" : *");
		this.jLabelid_estructuraEmpleado.setToolTipText("Estructura");
		this.jLabelid_estructuraEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estructuraEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estructuraEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estructuraEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estructuraEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estructuraEmpleado.setToolTipText(EmpleadoConstantesFunciones.LABEL_IDESTRUCTURA);
		this.gridaBagLayoutEmpleado = new GridBagLayout();
		this.jPanelid_estructuraEmpleado.setLayout(this.gridaBagLayoutEmpleado);


		jComboBoxid_estructuraEmpleado= new JComboBoxMe();
		jComboBoxid_estructuraEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estructuraEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estructuraEmpleado= new JButtonMe();
		this.jButtonid_estructuraEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraEmpleado.setText("Buscar");
		this.jButtonid_estructuraEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estructuraEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estructuraEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraEmpleado"));

		this.jButtonid_estructuraEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_estructuraEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estructuraEmpleadoBusqueda.setText("U");
		this.jButtonid_estructuraEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estructuraEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estructuraEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraEmpleadoBusqueda"));

		if(this.empleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estructuraEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_estructuraEmpleadoUpdate= new JButtonMe();
		this.jButtonid_estructuraEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estructuraEmpleadoUpdate.setText("U");
		this.jButtonid_estructuraEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estructuraEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estructuraEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraEmpleadoUpdate"));


		jButtonid_estructuraEmpleadoArbol= new JButtonMe();
		jButtonid_estructuraEmpleadoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_estructuraEmpleadoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_estructuraEmpleadoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_estructuraEmpleadoArbol.setText("Arbol");
		jButtonid_estructuraEmpleadoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_estructuraEmpleadoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraEmpleadoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_estructuraEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraEmpleadoArbol"));



					
		this.jLabelid_estructura_seccionEmpleado = new JLabelMe();
		this.jLabelid_estructura_seccionEmpleado.setText(""+EmpleadoConstantesFunciones.LABEL_IDESTRUCTURASECCION+" : *");
		this.jLabelid_estructura_seccionEmpleado.setToolTipText("Estructura Seccion");
		this.jLabelid_estructura_seccionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_estructura_seccionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_estructura_seccionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estructura_seccionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estructura_seccionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estructura_seccionEmpleado.setToolTipText(EmpleadoConstantesFunciones.LABEL_IDESTRUCTURASECCION);
		this.gridaBagLayoutEmpleado = new GridBagLayout();
		this.jPanelid_estructura_seccionEmpleado.setLayout(this.gridaBagLayoutEmpleado);


		jComboBoxid_estructura_seccionEmpleado= new JComboBoxMe();
		jComboBoxid_estructura_seccionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructura_seccionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructura_seccionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estructura_seccionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estructura_seccionEmpleado= new JButtonMe();
		this.jButtonid_estructura_seccionEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructura_seccionEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructura_seccionEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructura_seccionEmpleado.setText("Buscar");
		this.jButtonid_estructura_seccionEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estructura_seccionEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructura_seccionEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estructura_seccionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructura_seccionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructura_seccionEmpleado"));

		this.jButtonid_estructura_seccionEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_estructura_seccionEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructura_seccionEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructura_seccionEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estructura_seccionEmpleadoBusqueda.setText("U");
		this.jButtonid_estructura_seccionEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estructura_seccionEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructura_seccionEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estructura_seccionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructura_seccionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructura_seccionEmpleadoBusqueda"));

		if(this.empleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estructura_seccionEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_estructura_seccionEmpleadoUpdate= new JButtonMe();
		this.jButtonid_estructura_seccionEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructura_seccionEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructura_seccionEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estructura_seccionEmpleadoUpdate.setText("U");
		this.jButtonid_estructura_seccionEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estructura_seccionEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructura_seccionEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estructura_seccionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructura_seccionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructura_seccionEmpleadoUpdate"));


		jButtonid_estructura_seccionEmpleadoArbol= new JButtonMe();
		jButtonid_estructura_seccionEmpleadoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_estructura_seccionEmpleadoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_estructura_seccionEmpleadoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_estructura_seccionEmpleadoArbol.setText("Arbol");
		jButtonid_estructura_seccionEmpleadoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_estructura_seccionEmpleadoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructura_seccionEmpleadoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_estructura_seccionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructura_seccionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructura_seccionEmpleadoArbol"));



					
		this.jLabelid_estado_empleadoEmpleado = new JLabelMe();
		this.jLabelid_estado_empleadoEmpleado.setText(""+EmpleadoConstantesFunciones.LABEL_IDESTADOEMPLEADO+" : *");
		this.jLabelid_estado_empleadoEmpleado.setToolTipText("Estado Empleado");
		this.jLabelid_estado_empleadoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_estado_empleadoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_estado_empleadoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_empleadoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_empleadoEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_empleadoEmpleado.setToolTipText(EmpleadoConstantesFunciones.LABEL_IDESTADOEMPLEADO);
		this.gridaBagLayoutEmpleado = new GridBagLayout();
		this.jPanelid_estado_empleadoEmpleado.setLayout(this.gridaBagLayoutEmpleado);


		jComboBoxid_estado_empleadoEmpleado= new JComboBoxMe();
		jComboBoxid_estado_empleadoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_empleadoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_empleadoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_empleadoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estado_empleadoEmpleado= new JButtonMe();
		this.jButtonid_estado_empleadoEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_empleadoEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_empleadoEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_empleadoEmpleado.setText("Buscar");
		this.jButtonid_estado_empleadoEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_empleadoEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_empleadoEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_empleadoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_empleadoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_empleadoEmpleado"));

		this.jButtonid_estado_empleadoEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_estado_empleadoEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_empleadoEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_empleadoEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_empleadoEmpleadoBusqueda.setText("U");
		this.jButtonid_estado_empleadoEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_empleadoEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_empleadoEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_empleadoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_empleadoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_empleadoEmpleadoBusqueda"));

		if(this.empleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_empleadoEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_estado_empleadoEmpleadoUpdate= new JButtonMe();
		this.jButtonid_estado_empleadoEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_empleadoEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_empleadoEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_empleadoEmpleadoUpdate.setText("U");
		this.jButtonid_estado_empleadoEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_empleadoEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_empleadoEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_empleadoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_empleadoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_empleadoEmpleadoUpdate"));



					
		this.jLabelid_tipo_contratoEmpleado = new JLabelMe();
		this.jLabelid_tipo_contratoEmpleado.setText(""+EmpleadoConstantesFunciones.LABEL_IDTIPOCONTRATO+" : *");
		this.jLabelid_tipo_contratoEmpleado.setToolTipText("Idtipo Contrato");
		this.jLabelid_tipo_contratoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_contratoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_contratoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_contratoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_contratoEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_contratoEmpleado.setToolTipText(EmpleadoConstantesFunciones.LABEL_IDTIPOCONTRATO);
		this.gridaBagLayoutEmpleado = new GridBagLayout();
		this.jPanelid_tipo_contratoEmpleado.setLayout(this.gridaBagLayoutEmpleado);


		jComboBoxid_tipo_contratoEmpleado= new JComboBoxMe();
		jComboBoxid_tipo_contratoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_contratoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_contratoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_contratoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_contratoEmpleado= new JButtonMe();
		this.jButtonid_tipo_contratoEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_contratoEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_contratoEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_contratoEmpleado.setText("Buscar");
		this.jButtonid_tipo_contratoEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_contratoEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_contratoEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_contratoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_contratoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_contratoEmpleado"));

		this.jButtonid_tipo_contratoEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_tipo_contratoEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_contratoEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_contratoEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_contratoEmpleadoBusqueda.setText("U");
		this.jButtonid_tipo_contratoEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_contratoEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_contratoEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_contratoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_contratoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_contratoEmpleadoBusqueda"));

		if(this.empleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_contratoEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_contratoEmpleadoUpdate= new JButtonMe();
		this.jButtonid_tipo_contratoEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_contratoEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_contratoEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_contratoEmpleadoUpdate.setText("U");
		this.jButtonid_tipo_contratoEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_contratoEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_contratoEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_contratoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_contratoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_contratoEmpleadoUpdate"));



					
		this.jLabelid_tipo_cuenta_banco_globalEmpleado = new JLabelMe();
		this.jLabelid_tipo_cuenta_banco_globalEmpleado.setText(""+EmpleadoConstantesFunciones.LABEL_IDTIPOCUENTABANCOGLOBAL+" : *");
		this.jLabelid_tipo_cuenta_banco_globalEmpleado.setToolTipText("Tipo Cuenta Banco Global");
		this.jLabelid_tipo_cuenta_banco_globalEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_cuenta_banco_globalEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_cuenta_banco_globalEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_cuenta_banco_globalEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_cuenta_banco_globalEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_cuenta_banco_globalEmpleado.setToolTipText(EmpleadoConstantesFunciones.LABEL_IDTIPOCUENTABANCOGLOBAL);
		this.gridaBagLayoutEmpleado = new GridBagLayout();
		this.jPanelid_tipo_cuenta_banco_globalEmpleado.setLayout(this.gridaBagLayoutEmpleado);


		jComboBoxid_tipo_cuenta_banco_globalEmpleado= new JComboBoxMe();
		jComboBoxid_tipo_cuenta_banco_globalEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cuenta_banco_globalEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cuenta_banco_globalEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_cuenta_banco_globalEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_cuenta_banco_globalEmpleado= new JButtonMe();
		this.jButtonid_tipo_cuenta_banco_globalEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cuenta_banco_globalEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cuenta_banco_globalEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cuenta_banco_globalEmpleado.setText("Buscar");
		this.jButtonid_tipo_cuenta_banco_globalEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_cuenta_banco_globalEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cuenta_banco_globalEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_cuenta_banco_globalEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cuenta_banco_globalEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cuenta_banco_globalEmpleado"));

		this.jButtonid_tipo_cuenta_banco_globalEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_tipo_cuenta_banco_globalEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cuenta_banco_globalEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cuenta_banco_globalEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_cuenta_banco_globalEmpleadoBusqueda.setText("U");
		this.jButtonid_tipo_cuenta_banco_globalEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_cuenta_banco_globalEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cuenta_banco_globalEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_cuenta_banco_globalEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cuenta_banco_globalEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cuenta_banco_globalEmpleadoBusqueda"));

		if(this.empleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_cuenta_banco_globalEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_cuenta_banco_globalEmpleadoUpdate= new JButtonMe();
		this.jButtonid_tipo_cuenta_banco_globalEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cuenta_banco_globalEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cuenta_banco_globalEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_cuenta_banco_globalEmpleadoUpdate.setText("U");
		this.jButtonid_tipo_cuenta_banco_globalEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_cuenta_banco_globalEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cuenta_banco_globalEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_cuenta_banco_globalEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cuenta_banco_globalEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cuenta_banco_globalEmpleadoUpdate"));



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
		//this.jInternalFrameDetalleEmpleado = new EmpleadoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Empleado DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEmpleado= new GridBagLayout();
		

		
		String sToolTipEmpleado="";
		sToolTipEmpleado=EmpleadoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEmpleado+="(Nomina.Empleado)";
		}
		
		if(!this.empleadoSessionBean.getEsGuardarRelacionado()) {
			sToolTipEmpleado+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoEmpleado = new JButtonMe();
		this.jButtonModificarEmpleado = new JButtonMe();
        this.jButtonActualizarEmpleado = new JButtonMe();
        this.jButtonEliminarEmpleado = new JButtonMe();
        this.jButtonCancelarEmpleado = new JButtonMe();
        this.jButtonGuardarCambiosEmpleado = new JButtonMe();
		this.jButtonGuardarCambiosTablaEmpleado = new JButtonMe();
		this.jButtonCerrarEmpleado = new JButtonMe();
		
		this.jScrollPanelDatosEmpleado = new JScrollPane();   
        this.jScrollPanelDatosEdicionEmpleado = new JScrollPane();
		this.jScrollPanelDatosGeneralEmpleado = new JScrollPane();
				
		
		
		this.jPanelCamposEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		
		this.jTabbedPaneRelacionesFinformas_de_pagoEmpleado=new JTabbedPane();
		this.jTabbedPaneRelacionesFinformas_de_pagoEmpleado.add("",new JPanel());
		this.jButtonRelacionesFinformas_de_pagoEmpleado=new JButtonMe();
		this.jPanelAccionesRelacionesFinEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jButtonRelacionesFinNormalEmpleado=new JButtonMe();;
		//}
		
		this.sPath=" <---> Acceso: Empleado";
		
		if(!this.empleadoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empleados" + this.sPath));
		} else {
			this.jScrollPanelDatosEmpleado.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposEmpleado.setName("jPanelCamposEmpleado"); 

		this.jPanelCamposOcultosEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosEmpleado.setName("jPanelCamposOcultosEmpleado"); 

        this.jPanelAccionesEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEmpleado.setToolTipText("Acciones");
        this.jPanelAccionesEmpleado.setName("Acciones"); 

		this.jPanelAccionesFormularioEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioEmpleado.setToolTipText("Acciones");
        this.jPanelAccionesFormularioEmpleado.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		
		this.jTabbedPaneRelacionesFinformas_de_pagoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("formas_de_pago"));
		this.jTabbedPaneRelacionesFinformas_de_pagoEmpleado.setName("jTabbedPaneRelacionesFinformas_de_pagoEmpleado");
		this.jButtonRelacionesFinformas_de_pagoEmpleado.setText("FORMAS DE PAGO");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRelacionesFinformas_de_pagoEmpleado,"relaciones_fin_button","FORMAS DE PAGO",true);
		this.jButtonRelacionesFinformas_de_pagoEmpleado.setToolTipText("FORMAS DE PAGO");

		this.jPanelAccionesRelacionesFinEmpleado.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		this.jPanelAccionesRelacionesFinEmpleado.setName("jPanelAccionesRelacionesFinEmpleado");
		this.jButtonRelacionesFinNormalEmpleado.setText("NORMAL");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRelacionesFinNormalEmpleado,"relaciones_fin_button","NORMAL",true);
		this.jButtonRelacionesFinNormalEmpleado.setToolTipText("NORMAL");;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoEmpleado.setText("Nuevo");
		this.jButtonModificarEmpleado.setText("Editar");
        this.jButtonActualizarEmpleado.setText("Actualizar");
        this.jButtonEliminarEmpleado.setText("Eliminar");
        this.jButtonCancelarEmpleado.setText("Cancelar");
        this.jButtonGuardarCambiosEmpleado.setText("Guardar");
		this.jButtonGuardarCambiosTablaEmpleado.setText("Guardar");
		this.jButtonCerrarEmpleado.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEmpleado,"nuevo_button","Nuevo",this.empleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarEmpleado,"modificar_button","Editar",this.empleadoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarEmpleado,"actualizar_button","Actualizar",this.empleadoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarEmpleado,"eliminar_button","Eliminar",this.empleadoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarEmpleado,"cancelar_button","Cancelar",this.empleadoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosEmpleado,"guardarcambios_button","Guardar",this.empleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEmpleado,"guardarcambiostabla_button","Guardar",this.empleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEmpleado,"cerrar_button","Salir",this.empleadoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoEmpleado.setToolTipText("Nuevo"+" "+EmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarEmpleado.setToolTipText("Editar"+" "+EmpleadoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarEmpleado.setToolTipText("Actualizar"+" "+EmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarEmpleado.setToolTipText("Eliminar)"+" "+EmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarEmpleado.setToolTipText("Cancelar"+" "+EmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosEmpleado.setToolTipText("Guardar"+" "+EmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaEmpleado.setToolTipText("Guardar"+" "+EmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEmpleado.setToolTipText("Salir"+" "+EmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEmpleado";
		inputMap = this.jButtonNuevoEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEmpleado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEmpleado"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarEmpleado";
		inputMap = this.jButtonActualizarEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarEmpleado"));
		
		//ELIMINAR
		sMapKey = "EliminarEmpleado";
		inputMap = this.jButtonEliminarEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarEmpleado"));
		
		//CANCELAR	
		sMapKey = "CancelarEmpleado";
		inputMap = this.jButtonCancelarEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarEmpleado"));
		
		//CERRAR		
		sMapKey = "CerrarEmpleado";
		inputMap = this.jButtonCerrarEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEmpleado"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEmpleado";
		inputMap = this.jButtonGuardarCambiosTablaEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEmpleado"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoEmpleado = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoEmpleado.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoEmpleado.setToolTipText("Nuevo Empleado");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarEmpleado = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarEmpleado.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarEmpleado.setToolTipText("Sin Cerrar Ventana Empleado");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeEmpleado = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeEmpleado.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeEmpleado.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEmpleado.setText("Accion");
		this.jComboBoxTiposAccionesEmpleado.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioEmpleado.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioEmpleado.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesEmpleado = new JLabelMe();
		
		this.jLabelAccionesEmpleado.setText("Acciones");		
		this.jLabelAccionesEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposEmpleado();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysEmpleado();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesEmpleado=new JTabbedPane();
		this.jTabbedPaneRelacionesEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesEmpleado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEmpleado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEmpleado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioEmpleado.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEmpleado.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEmpleado.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposEmpleado = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosEmpleado = new GridBagLayout();
		
		this.jPanelCamposEmpleado.setLayout(gridaBagLayoutCamposEmpleado);
		this.jPanelCamposOcultosEmpleado.setLayout(gridaBagLayoutCamposOcultosEmpleado);
		
		;
		
		this.jTabbedPaneRelacionesFinformas_de_pagoEmpleado.setMinimumSize(new Dimension(this.getWidth(),EmpleadoConstantesFunciones.ALTO_TABPANE_RELACIONES));
		this.jTabbedPaneRelacionesFinformas_de_pagoEmpleado.setMaximumSize(new Dimension(this.getWidth(),EmpleadoConstantesFunciones.ALTO_TABPANE_RELACIONES));
		this.jTabbedPaneRelacionesFinformas_de_pagoEmpleado.setPreferredSize(new Dimension(this.getWidth(),EmpleadoConstantesFunciones.ALTO_TABPANE_RELACIONES));
		GridBagLayout gridaBagLayoutAccionesRelacionesFinEmpleado= new GridBagLayout();
		this.jPanelAccionesRelacionesFinEmpleado.setLayout(gridaBagLayoutAccionesRelacionesFinEmpleado);;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleado.gridy = 0;
	this.gridBagConstraintsEmpleado.gridx = 0;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidEmpleado.add(jLabelIdEmpleado, this.gridBagConstraintsEmpleado);



	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleado.gridy = 0;
	this.gridBagConstraintsEmpleado.gridx = 1;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidEmpleado.add(jLabelidEmpleado, this.gridBagConstraintsEmpleado);


	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleado.gridy = 0;
	this.gridBagConstraintsEmpleado.gridx = 0;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaEmpleado.add(jLabelid_empresaEmpleado, this.gridBagConstraintsEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleado.gridy = 0;
		this.gridBagConstraintsEmpleado.gridx = 2;
		this.gridBagConstraintsEmpleado.ipadx = 0;
		this.gridBagConstraintsEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaEmpleado.add(jButtonid_empresaEmpleadoBusqueda, this.gridBagConstraintsEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleado.gridy = 0;
		this.gridBagConstraintsEmpleado.gridx = 3;
		this.gridBagConstraintsEmpleado.ipadx = 0;
		this.gridBagConstraintsEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaEmpleado.add(jButtonid_empresaEmpleadoUpdate, this.gridBagConstraintsEmpleado);
	}

	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleado.gridy = 0;
	this.gridBagConstraintsEmpleado.gridx = 1;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaEmpleado.add(jComboBoxid_empresaEmpleado, this.gridBagConstraintsEmpleado);


	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleado.gridy = 0;
	this.gridBagConstraintsEmpleado.gridx = 0;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalEmpleado.add(jLabelid_sucursalEmpleado, this.gridBagConstraintsEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleado.gridy = 0;
		this.gridBagConstraintsEmpleado.gridx = 2;
		this.gridBagConstraintsEmpleado.ipadx = 0;
		this.gridBagConstraintsEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalEmpleado.add(jButtonid_sucursalEmpleadoBusqueda, this.gridBagConstraintsEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleado.gridy = 0;
		this.gridBagConstraintsEmpleado.gridx = 3;
		this.gridBagConstraintsEmpleado.ipadx = 0;
		this.gridBagConstraintsEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalEmpleado.add(jButtonid_sucursalEmpleadoUpdate, this.gridBagConstraintsEmpleado);
	}

	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleado.gridy = 0;
	this.gridBagConstraintsEmpleado.gridx = 1;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalEmpleado.add(jComboBoxid_sucursalEmpleado, this.gridBagConstraintsEmpleado);


	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleado.gridy = 0;
	this.gridBagConstraintsEmpleado.gridx = 0;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_paisEmpleado.add(jLabelid_paisEmpleado, this.gridBagConstraintsEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleado.gridy = 0;
		this.gridBagConstraintsEmpleado.gridx = 2;
		this.gridBagConstraintsEmpleado.ipadx = 0;
		this.gridBagConstraintsEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisEmpleado.add(jButtonid_paisEmpleadoBusqueda, this.gridBagConstraintsEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleado.gridy = 0;
		this.gridBagConstraintsEmpleado.gridx = 3;
		this.gridBagConstraintsEmpleado.ipadx = 0;
		this.gridBagConstraintsEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisEmpleado.add(jButtonid_paisEmpleadoUpdate, this.gridBagConstraintsEmpleado);
	}

	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleado.gridy = 0;
	this.gridBagConstraintsEmpleado.gridx = 1;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_paisEmpleado.add(jComboBoxid_paisEmpleado, this.gridBagConstraintsEmpleado);


	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleado.gridy = 0;
	this.gridBagConstraintsEmpleado.gridx = 0;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_provinciaEmpleado.add(jLabelid_provinciaEmpleado, this.gridBagConstraintsEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleado.gridy = 0;
		this.gridBagConstraintsEmpleado.gridx = 2;
		this.gridBagConstraintsEmpleado.ipadx = 0;
		this.gridBagConstraintsEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_provinciaEmpleado.add(jButtonid_provinciaEmpleadoBusqueda, this.gridBagConstraintsEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleado.gridy = 0;
		this.gridBagConstraintsEmpleado.gridx = 3;
		this.gridBagConstraintsEmpleado.ipadx = 0;
		this.gridBagConstraintsEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_provinciaEmpleado.add(jButtonid_provinciaEmpleadoUpdate, this.gridBagConstraintsEmpleado);
	}

	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleado.gridy = 0;
	this.gridBagConstraintsEmpleado.gridx = 1;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_provinciaEmpleado.add(jComboBoxid_provinciaEmpleado, this.gridBagConstraintsEmpleado);


	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleado.gridy = 0;
	this.gridBagConstraintsEmpleado.gridx = 0;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ciudadEmpleado.add(jLabelid_ciudadEmpleado, this.gridBagConstraintsEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleado.gridy = 0;
		this.gridBagConstraintsEmpleado.gridx = 2;
		this.gridBagConstraintsEmpleado.ipadx = 0;
		this.gridBagConstraintsEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ciudadEmpleado.add(jButtonid_ciudadEmpleadoBusqueda, this.gridBagConstraintsEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleado.gridy = 0;
		this.gridBagConstraintsEmpleado.gridx = 3;
		this.gridBagConstraintsEmpleado.ipadx = 0;
		this.gridBagConstraintsEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ciudadEmpleado.add(jButtonid_ciudadEmpleadoUpdate, this.gridBagConstraintsEmpleado);
	}

	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleado.gridy = 0;
	this.gridBagConstraintsEmpleado.gridx = 1;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ciudadEmpleado.add(jComboBoxid_ciudadEmpleado, this.gridBagConstraintsEmpleado);


	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleado.gridy = 0;
	this.gridBagConstraintsEmpleado.gridx = 0;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_centro_costoEmpleado.add(jLabelid_centro_costoEmpleado, this.gridBagConstraintsEmpleado);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	//this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleado.gridy = 0;
	this.gridBagConstraintsEmpleado.gridx = 2;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	this.gridBagConstraintsEmpleado.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_centro_costoEmpleado.add(jButtonid_centro_costoEmpleado, this.gridBagConstraintsEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	//this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleado.gridy = 0;
	this.gridBagConstraintsEmpleado.gridx = 3;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	this.gridBagConstraintsEmpleado.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_centro_costoEmpleado.add(jButtonid_centro_costoEmpleadoArbol, this.gridBagConstraintsEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleado.gridy = 0;
		this.gridBagConstraintsEmpleado.gridx = 4;
		this.gridBagConstraintsEmpleado.ipadx = 0;
		this.gridBagConstraintsEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoEmpleado.add(jButtonid_centro_costoEmpleadoBusqueda, this.gridBagConstraintsEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleado.gridy = 0;
		this.gridBagConstraintsEmpleado.gridx = 5;
		this.gridBagConstraintsEmpleado.ipadx = 0;
		this.gridBagConstraintsEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoEmpleado.add(jButtonid_centro_costoEmpleadoUpdate, this.gridBagConstraintsEmpleado);
	}

	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleado.gridy = 0;
	this.gridBagConstraintsEmpleado.gridx = 1;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_centro_costoEmpleado.add(jComboBoxid_centro_costoEmpleado, this.gridBagConstraintsEmpleado);


	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleado.gridy = 0;
	this.gridBagConstraintsEmpleado.gridx = 0;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_religionEmpleado.add(jLabelid_religionEmpleado, this.gridBagConstraintsEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleado.gridy = 0;
		this.gridBagConstraintsEmpleado.gridx = 2;
		this.gridBagConstraintsEmpleado.ipadx = 0;
		this.gridBagConstraintsEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_religionEmpleado.add(jButtonid_religionEmpleadoBusqueda, this.gridBagConstraintsEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleado.gridy = 0;
		this.gridBagConstraintsEmpleado.gridx = 3;
		this.gridBagConstraintsEmpleado.ipadx = 0;
		this.gridBagConstraintsEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_religionEmpleado.add(jButtonid_religionEmpleadoUpdate, this.gridBagConstraintsEmpleado);
	}

	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleado.gridy = 0;
	this.gridBagConstraintsEmpleado.gridx = 1;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_religionEmpleado.add(jComboBoxid_religionEmpleado, this.gridBagConstraintsEmpleado);


	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleado.gridy = 0;
	this.gridBagConstraintsEmpleado.gridx = 0;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estado_civilEmpleado.add(jLabelid_estado_civilEmpleado, this.gridBagConstraintsEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleado.gridy = 0;
		this.gridBagConstraintsEmpleado.gridx = 2;
		this.gridBagConstraintsEmpleado.ipadx = 0;
		this.gridBagConstraintsEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_civilEmpleado.add(jButtonid_estado_civilEmpleadoBusqueda, this.gridBagConstraintsEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleado.gridy = 0;
		this.gridBagConstraintsEmpleado.gridx = 3;
		this.gridBagConstraintsEmpleado.ipadx = 0;
		this.gridBagConstraintsEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_civilEmpleado.add(jButtonid_estado_civilEmpleadoUpdate, this.gridBagConstraintsEmpleado);
	}

	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleado.gridy = 0;
	this.gridBagConstraintsEmpleado.gridx = 1;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estado_civilEmpleado.add(jComboBoxid_estado_civilEmpleado, this.gridBagConstraintsEmpleado);


	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleado.gridy = 0;
	this.gridBagConstraintsEmpleado.gridx = 0;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_generoEmpleado.add(jLabelid_tipo_generoEmpleado, this.gridBagConstraintsEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleado.gridy = 0;
		this.gridBagConstraintsEmpleado.gridx = 2;
		this.gridBagConstraintsEmpleado.ipadx = 0;
		this.gridBagConstraintsEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_generoEmpleado.add(jButtonid_tipo_generoEmpleadoBusqueda, this.gridBagConstraintsEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleado.gridy = 0;
		this.gridBagConstraintsEmpleado.gridx = 3;
		this.gridBagConstraintsEmpleado.ipadx = 0;
		this.gridBagConstraintsEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_generoEmpleado.add(jButtonid_tipo_generoEmpleadoUpdate, this.gridBagConstraintsEmpleado);
	}

	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleado.gridy = 0;
	this.gridBagConstraintsEmpleado.gridx = 1;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_generoEmpleado.add(jComboBoxid_tipo_generoEmpleado, this.gridBagConstraintsEmpleado);


	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleado.gridy = 0;
	this.gridBagConstraintsEmpleado.gridx = 0;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_empleadoEmpleado.add(jLabelid_tipo_empleadoEmpleado, this.gridBagConstraintsEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleado.gridy = 0;
		this.gridBagConstraintsEmpleado.gridx = 2;
		this.gridBagConstraintsEmpleado.ipadx = 0;
		this.gridBagConstraintsEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_empleadoEmpleado.add(jButtonid_tipo_empleadoEmpleadoBusqueda, this.gridBagConstraintsEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleado.gridy = 0;
		this.gridBagConstraintsEmpleado.gridx = 3;
		this.gridBagConstraintsEmpleado.ipadx = 0;
		this.gridBagConstraintsEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_empleadoEmpleado.add(jButtonid_tipo_empleadoEmpleadoUpdate, this.gridBagConstraintsEmpleado);
	}

	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleado.gridy = 0;
	this.gridBagConstraintsEmpleado.gridx = 1;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_empleadoEmpleado.add(jComboBoxid_tipo_empleadoEmpleado, this.gridBagConstraintsEmpleado);


	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleado.gridy = 0;
	this.gridBagConstraintsEmpleado.gridx = 0;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_instruccionEmpleado.add(jLabelid_tipo_instruccionEmpleado, this.gridBagConstraintsEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleado.gridy = 0;
		this.gridBagConstraintsEmpleado.gridx = 2;
		this.gridBagConstraintsEmpleado.ipadx = 0;
		this.gridBagConstraintsEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_instruccionEmpleado.add(jButtonid_tipo_instruccionEmpleadoBusqueda, this.gridBagConstraintsEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleado.gridy = 0;
		this.gridBagConstraintsEmpleado.gridx = 3;
		this.gridBagConstraintsEmpleado.ipadx = 0;
		this.gridBagConstraintsEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_instruccionEmpleado.add(jButtonid_tipo_instruccionEmpleadoUpdate, this.gridBagConstraintsEmpleado);
	}

	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleado.gridy = 0;
	this.gridBagConstraintsEmpleado.gridx = 1;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_instruccionEmpleado.add(jComboBoxid_tipo_instruccionEmpleado, this.gridBagConstraintsEmpleado);


	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleado.gridy = 0;
	this.gridBagConstraintsEmpleado.gridx = 0;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cargoEmpleado.add(jLabelid_cargoEmpleado, this.gridBagConstraintsEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleado.gridy = 0;
		this.gridBagConstraintsEmpleado.gridx = 2;
		this.gridBagConstraintsEmpleado.ipadx = 0;
		this.gridBagConstraintsEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cargoEmpleado.add(jButtonid_cargoEmpleadoBusqueda, this.gridBagConstraintsEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleado.gridy = 0;
		this.gridBagConstraintsEmpleado.gridx = 3;
		this.gridBagConstraintsEmpleado.ipadx = 0;
		this.gridBagConstraintsEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cargoEmpleado.add(jButtonid_cargoEmpleadoUpdate, this.gridBagConstraintsEmpleado);
	}

	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleado.gridy = 0;
	this.gridBagConstraintsEmpleado.gridx = 1;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cargoEmpleado.add(jComboBoxid_cargoEmpleado, this.gridBagConstraintsEmpleado);


	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleado.gridy = 0;
	this.gridBagConstraintsEmpleado.gridx = 0;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estructuraEmpleado.add(jLabelid_estructuraEmpleado, this.gridBagConstraintsEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleado.gridy = 0;
		this.gridBagConstraintsEmpleado.gridx = 2;
		this.gridBagConstraintsEmpleado.ipadx = 0;
		this.gridBagConstraintsEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estructuraEmpleado.add(jButtonid_estructuraEmpleadoBusqueda, this.gridBagConstraintsEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleado.gridy = 0;
		this.gridBagConstraintsEmpleado.gridx = 3;
		this.gridBagConstraintsEmpleado.ipadx = 0;
		this.gridBagConstraintsEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estructuraEmpleado.add(jButtonid_estructuraEmpleadoUpdate, this.gridBagConstraintsEmpleado);
	}

	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleado.gridy = 0;
	this.gridBagConstraintsEmpleado.gridx = 1;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estructuraEmpleado.add(jComboBoxid_estructuraEmpleado, this.gridBagConstraintsEmpleado);


	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleado.gridy = 0;
	this.gridBagConstraintsEmpleado.gridx = 0;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estructura_seccionEmpleado.add(jLabelid_estructura_seccionEmpleado, this.gridBagConstraintsEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleado.gridy = 0;
		this.gridBagConstraintsEmpleado.gridx = 2;
		this.gridBagConstraintsEmpleado.ipadx = 0;
		this.gridBagConstraintsEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estructura_seccionEmpleado.add(jButtonid_estructura_seccionEmpleadoBusqueda, this.gridBagConstraintsEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleado.gridy = 0;
		this.gridBagConstraintsEmpleado.gridx = 3;
		this.gridBagConstraintsEmpleado.ipadx = 0;
		this.gridBagConstraintsEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estructura_seccionEmpleado.add(jButtonid_estructura_seccionEmpleadoUpdate, this.gridBagConstraintsEmpleado);
	}

	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleado.gridy = 0;
	this.gridBagConstraintsEmpleado.gridx = 1;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estructura_seccionEmpleado.add(jComboBoxid_estructura_seccionEmpleado, this.gridBagConstraintsEmpleado);


	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleado.gridy = 0;
	this.gridBagConstraintsEmpleado.gridx = 0;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estado_empleadoEmpleado.add(jLabelid_estado_empleadoEmpleado, this.gridBagConstraintsEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleado.gridy = 0;
		this.gridBagConstraintsEmpleado.gridx = 2;
		this.gridBagConstraintsEmpleado.ipadx = 0;
		this.gridBagConstraintsEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_empleadoEmpleado.add(jButtonid_estado_empleadoEmpleadoBusqueda, this.gridBagConstraintsEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleado.gridy = 0;
		this.gridBagConstraintsEmpleado.gridx = 3;
		this.gridBagConstraintsEmpleado.ipadx = 0;
		this.gridBagConstraintsEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_empleadoEmpleado.add(jButtonid_estado_empleadoEmpleadoUpdate, this.gridBagConstraintsEmpleado);
	}

	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleado.gridy = 0;
	this.gridBagConstraintsEmpleado.gridx = 1;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estado_empleadoEmpleado.add(jComboBoxid_estado_empleadoEmpleado, this.gridBagConstraintsEmpleado);


	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleado.gridy = 0;
	this.gridBagConstraintsEmpleado.gridx = 0;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_contratoEmpleado.add(jLabelid_tipo_contratoEmpleado, this.gridBagConstraintsEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleado.gridy = 0;
		this.gridBagConstraintsEmpleado.gridx = 2;
		this.gridBagConstraintsEmpleado.ipadx = 0;
		this.gridBagConstraintsEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_contratoEmpleado.add(jButtonid_tipo_contratoEmpleadoBusqueda, this.gridBagConstraintsEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleado.gridy = 0;
		this.gridBagConstraintsEmpleado.gridx = 3;
		this.gridBagConstraintsEmpleado.ipadx = 0;
		this.gridBagConstraintsEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_contratoEmpleado.add(jButtonid_tipo_contratoEmpleadoUpdate, this.gridBagConstraintsEmpleado);
	}

	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleado.gridy = 0;
	this.gridBagConstraintsEmpleado.gridx = 1;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_contratoEmpleado.add(jComboBoxid_tipo_contratoEmpleado, this.gridBagConstraintsEmpleado);


	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleado.gridy = 0;
	this.gridBagConstraintsEmpleado.gridx = 0;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoEmpleado.add(jLabelcodigoEmpleado, this.gridBagConstraintsEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleado.gridy = 0;
		this.gridBagConstraintsEmpleado.gridx = 2;
		this.gridBagConstraintsEmpleado.ipadx = 0;
		this.gridBagConstraintsEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoEmpleado.add(jButtoncodigoEmpleadoBusqueda, this.gridBagConstraintsEmpleado);
	}

	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleado.gridy = 0;
	this.gridBagConstraintsEmpleado.gridx = 1;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoEmpleado.add(jTextFieldcodigoEmpleado, this.gridBagConstraintsEmpleado);


	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleado.gridy = 0;
	this.gridBagConstraintsEmpleado.gridx = 0;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreEmpleado.add(jLabelnombreEmpleado, this.gridBagConstraintsEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleado.gridy = 0;
		this.gridBagConstraintsEmpleado.gridx = 2;
		this.gridBagConstraintsEmpleado.ipadx = 0;
		this.gridBagConstraintsEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreEmpleado.add(jButtonnombreEmpleadoBusqueda, this.gridBagConstraintsEmpleado);
	}

	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleado.gridy = 0;
	this.gridBagConstraintsEmpleado.gridx = 1;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreEmpleado.add(jscrollPanenombreEmpleado, this.gridBagConstraintsEmpleado);


	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleado.gridy = 0;
	this.gridBagConstraintsEmpleado.gridx = 0;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelapellidoEmpleado.add(jLabelapellidoEmpleado, this.gridBagConstraintsEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleado.gridy = 0;
		this.gridBagConstraintsEmpleado.gridx = 2;
		this.gridBagConstraintsEmpleado.ipadx = 0;
		this.gridBagConstraintsEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelapellidoEmpleado.add(jButtonapellidoEmpleadoBusqueda, this.gridBagConstraintsEmpleado);
	}

	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleado.gridy = 0;
	this.gridBagConstraintsEmpleado.gridx = 1;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelapellidoEmpleado.add(jscrollPaneapellidoEmpleado, this.gridBagConstraintsEmpleado);


	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleado.gridy = 0;
	this.gridBagConstraintsEmpleado.gridx = 0;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_completoEmpleado.add(jLabelnombre_completoEmpleado, this.gridBagConstraintsEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleado.gridy = 0;
		this.gridBagConstraintsEmpleado.gridx = 2;
		this.gridBagConstraintsEmpleado.ipadx = 0;
		this.gridBagConstraintsEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_completoEmpleado.add(jButtonnombre_completoEmpleadoBusqueda, this.gridBagConstraintsEmpleado);
	}

	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleado.gridy = 0;
	this.gridBagConstraintsEmpleado.gridx = 1;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_completoEmpleado.add(jscrollPanenombre_completoEmpleado, this.gridBagConstraintsEmpleado);


	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleado.gridy = 0;
	this.gridBagConstraintsEmpleado.gridx = 0;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelmailEmpleado.add(jLabelmailEmpleado, this.gridBagConstraintsEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleado.gridy = 0;
		this.gridBagConstraintsEmpleado.gridx = 2;
		this.gridBagConstraintsEmpleado.ipadx = 0;
		this.gridBagConstraintsEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelmailEmpleado.add(jButtonmailEmpleadoBusqueda, this.gridBagConstraintsEmpleado);
	}

	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleado.gridy = 0;
	this.gridBagConstraintsEmpleado.gridx = 1;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelmailEmpleado.add(jscrollPanemailEmpleado, this.gridBagConstraintsEmpleado);


	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleado.gridy = 0;
	this.gridBagConstraintsEmpleado.gridx = 0;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldireccionEmpleado.add(jLabeldireccionEmpleado, this.gridBagConstraintsEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleado.gridy = 0;
		this.gridBagConstraintsEmpleado.gridx = 2;
		this.gridBagConstraintsEmpleado.ipadx = 0;
		this.gridBagConstraintsEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPaneldireccionEmpleado.add(jButtondireccionEmpleadoBusqueda, this.gridBagConstraintsEmpleado);
	}

	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleado.gridy = 0;
	this.gridBagConstraintsEmpleado.gridx = 1;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldireccionEmpleado.add(jscrollPanedireccionEmpleado, this.gridBagConstraintsEmpleado);


	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleado.gridy = 0;
	this.gridBagConstraintsEmpleado.gridx = 0;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsueldoEmpleado.add(jLabelsueldoEmpleado, this.gridBagConstraintsEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleado.gridy = 0;
		this.gridBagConstraintsEmpleado.gridx = 2;
		this.gridBagConstraintsEmpleado.ipadx = 0;
		this.gridBagConstraintsEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelsueldoEmpleado.add(jButtonsueldoEmpleadoBusqueda, this.gridBagConstraintsEmpleado);
	}

	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleado.gridy = 0;
	this.gridBagConstraintsEmpleado.gridx = 1;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsueldoEmpleado.add(jTextFieldsueldoEmpleado, this.gridBagConstraintsEmpleado);


	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleado.gridy = 0;
	this.gridBagConstraintsEmpleado.gridx = 0;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltelefonoEmpleado.add(jLabeltelefonoEmpleado, this.gridBagConstraintsEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleado.gridy = 0;
		this.gridBagConstraintsEmpleado.gridx = 2;
		this.gridBagConstraintsEmpleado.ipadx = 0;
		this.gridBagConstraintsEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPaneltelefonoEmpleado.add(jButtontelefonoEmpleadoBusqueda, this.gridBagConstraintsEmpleado);
	}

	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleado.gridy = 0;
	this.gridBagConstraintsEmpleado.gridx = 1;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltelefonoEmpleado.add(jscrollPanetelefonoEmpleado, this.gridBagConstraintsEmpleado);


	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleado.gridy = 0;
	this.gridBagConstraintsEmpleado.gridx = 0;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_cuenta_banco_globalEmpleado.add(jLabelid_tipo_cuenta_banco_globalEmpleado, this.gridBagConstraintsEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleado.gridy = 0;
		this.gridBagConstraintsEmpleado.gridx = 2;
		this.gridBagConstraintsEmpleado.ipadx = 0;
		this.gridBagConstraintsEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_cuenta_banco_globalEmpleado.add(jButtonid_tipo_cuenta_banco_globalEmpleadoBusqueda, this.gridBagConstraintsEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleado.gridy = 0;
		this.gridBagConstraintsEmpleado.gridx = 3;
		this.gridBagConstraintsEmpleado.ipadx = 0;
		this.gridBagConstraintsEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_cuenta_banco_globalEmpleado.add(jButtonid_tipo_cuenta_banco_globalEmpleadoUpdate, this.gridBagConstraintsEmpleado);
	}

	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleado.gridy = 0;
	this.gridBagConstraintsEmpleado.gridx = 1;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_cuenta_banco_globalEmpleado.add(jComboBoxid_tipo_cuenta_banco_globalEmpleado, this.gridBagConstraintsEmpleado);


	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleado.gridy = 0;
	this.gridBagConstraintsEmpleado.gridx = 0;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_cuentaEmpleado.add(jLabelnumero_cuentaEmpleado, this.gridBagConstraintsEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleado.gridy = 0;
		this.gridBagConstraintsEmpleado.gridx = 2;
		this.gridBagConstraintsEmpleado.ipadx = 0;
		this.gridBagConstraintsEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_cuentaEmpleado.add(jButtonnumero_cuentaEmpleadoBusqueda, this.gridBagConstraintsEmpleado);
	}

	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleado.gridy = 0;
	this.gridBagConstraintsEmpleado.gridx = 1;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_cuentaEmpleado.add(jTextFieldnumero_cuentaEmpleado, this.gridBagConstraintsEmpleado);


	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleado.gridy = 0;
	this.gridBagConstraintsEmpleado.gridx = 0;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltiene_casaEmpleado.add(jLabeltiene_casaEmpleado, this.gridBagConstraintsEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleado.gridy = 0;
		this.gridBagConstraintsEmpleado.gridx = 2;
		this.gridBagConstraintsEmpleado.ipadx = 0;
		this.gridBagConstraintsEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPaneltiene_casaEmpleado.add(jButtontiene_casaEmpleadoBusqueda, this.gridBagConstraintsEmpleado);
	}

	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleado.gridy = 0;
	this.gridBagConstraintsEmpleado.gridx = 1;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltiene_casaEmpleado.add(jCheckBoxtiene_casaEmpleado, this.gridBagConstraintsEmpleado);


	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleado.gridy = 0;
	this.gridBagConstraintsEmpleado.gridx = 0;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltiene_vehiculoEmpleado.add(jLabeltiene_vehiculoEmpleado, this.gridBagConstraintsEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleado.gridy = 0;
		this.gridBagConstraintsEmpleado.gridx = 2;
		this.gridBagConstraintsEmpleado.ipadx = 0;
		this.gridBagConstraintsEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPaneltiene_vehiculoEmpleado.add(jButtontiene_vehiculoEmpleadoBusqueda, this.gridBagConstraintsEmpleado);
	}

	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleado.gridy = 0;
	this.gridBagConstraintsEmpleado.gridx = 1;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltiene_vehiculoEmpleado.add(jCheckBoxtiene_vehiculoEmpleado, this.gridBagConstraintsEmpleado);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleado.gridy = iYPanelCamposEmpleado;
	this.gridBagConstraintsEmpleado.gridx = iXPanelCamposEmpleado++;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleado.add(this.jPanelidEmpleado, this.gridBagConstraintsEmpleado);



	if(iXPanelCamposEmpleado % 2==0) {
		iXPanelCamposEmpleado=0;
		iYPanelCamposEmpleado++;
	}
	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleado.gridy = iYPanelCamposEmpleado;
	this.gridBagConstraintsEmpleado.gridx = iXPanelCamposEmpleado++;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleado.add(this.jPanelid_paisEmpleado, this.gridBagConstraintsEmpleado);



	if(iXPanelCamposEmpleado % 2==0) {
		iXPanelCamposEmpleado=0;
		iYPanelCamposEmpleado++;
	}
	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleado.gridy = iYPanelCamposEmpleado;
	this.gridBagConstraintsEmpleado.gridx = iXPanelCamposEmpleado++;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleado.add(this.jPanelid_provinciaEmpleado, this.gridBagConstraintsEmpleado);



	if(iXPanelCamposEmpleado % 2==0) {
		iXPanelCamposEmpleado=0;
		iYPanelCamposEmpleado++;
	}
	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleado.gridy = iYPanelCamposEmpleado;
	this.gridBagConstraintsEmpleado.gridx = iXPanelCamposEmpleado++;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleado.add(this.jPanelid_ciudadEmpleado, this.gridBagConstraintsEmpleado);



	if(iXPanelCamposEmpleado % 2==0) {
		iXPanelCamposEmpleado=0;
		iYPanelCamposEmpleado++;
	}
	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleado.gridy = iYPanelCamposEmpleado;
	this.gridBagConstraintsEmpleado.gridx = iXPanelCamposEmpleado++;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleado.add(this.jPanelid_centro_costoEmpleado, this.gridBagConstraintsEmpleado);



	if(iXPanelCamposEmpleado % 2==0) {
		iXPanelCamposEmpleado=0;
		iYPanelCamposEmpleado++;
	}
	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleado.gridy = iYPanelCamposEmpleado;
	this.gridBagConstraintsEmpleado.gridx = iXPanelCamposEmpleado++;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleado.add(this.jPanelid_religionEmpleado, this.gridBagConstraintsEmpleado);



	if(iXPanelCamposEmpleado % 2==0) {
		iXPanelCamposEmpleado=0;
		iYPanelCamposEmpleado++;
	}
	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleado.gridy = iYPanelCamposEmpleado;
	this.gridBagConstraintsEmpleado.gridx = iXPanelCamposEmpleado++;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleado.add(this.jPanelid_estado_civilEmpleado, this.gridBagConstraintsEmpleado);



	if(iXPanelCamposEmpleado % 2==0) {
		iXPanelCamposEmpleado=0;
		iYPanelCamposEmpleado++;
	}
	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleado.gridy = iYPanelCamposEmpleado;
	this.gridBagConstraintsEmpleado.gridx = iXPanelCamposEmpleado++;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleado.add(this.jPanelid_tipo_generoEmpleado, this.gridBagConstraintsEmpleado);



	if(iXPanelCamposEmpleado % 2==0) {
		iXPanelCamposEmpleado=0;
		iYPanelCamposEmpleado++;
	}
	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleado.gridy = iYPanelCamposEmpleado;
	this.gridBagConstraintsEmpleado.gridx = iXPanelCamposEmpleado++;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleado.add(this.jPanelid_tipo_empleadoEmpleado, this.gridBagConstraintsEmpleado);



	if(iXPanelCamposEmpleado % 2==0) {
		iXPanelCamposEmpleado=0;
		iYPanelCamposEmpleado++;
	}
	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleado.gridy = iYPanelCamposEmpleado;
	this.gridBagConstraintsEmpleado.gridx = iXPanelCamposEmpleado++;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleado.add(this.jPanelid_tipo_instruccionEmpleado, this.gridBagConstraintsEmpleado);



	if(iXPanelCamposEmpleado % 2==0) {
		iXPanelCamposEmpleado=0;
		iYPanelCamposEmpleado++;
	}
	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleado.gridy = iYPanelCamposEmpleado;
	this.gridBagConstraintsEmpleado.gridx = iXPanelCamposEmpleado++;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleado.add(this.jPanelid_cargoEmpleado, this.gridBagConstraintsEmpleado);



	if(iXPanelCamposEmpleado % 2==0) {
		iXPanelCamposEmpleado=0;
		iYPanelCamposEmpleado++;
	}
	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleado.gridy = iYPanelCamposEmpleado;
	this.gridBagConstraintsEmpleado.gridx = iXPanelCamposEmpleado++;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleado.add(this.jPanelid_estructuraEmpleado, this.gridBagConstraintsEmpleado);



	if(iXPanelCamposEmpleado % 2==0) {
		iXPanelCamposEmpleado=0;
		iYPanelCamposEmpleado++;
	}
	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleado.gridy = iYPanelCamposEmpleado;
	this.gridBagConstraintsEmpleado.gridx = iXPanelCamposEmpleado++;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleado.add(this.jPanelid_estructura_seccionEmpleado, this.gridBagConstraintsEmpleado);



	if(iXPanelCamposEmpleado % 2==0) {
		iXPanelCamposEmpleado=0;
		iYPanelCamposEmpleado++;
	}
	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleado.gridy = iYPanelCamposEmpleado;
	this.gridBagConstraintsEmpleado.gridx = iXPanelCamposEmpleado++;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleado.add(this.jPanelid_estado_empleadoEmpleado, this.gridBagConstraintsEmpleado);



	if(iXPanelCamposEmpleado % 2==0) {
		iXPanelCamposEmpleado=0;
		iYPanelCamposEmpleado++;
	}
	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleado.gridy = iYPanelCamposEmpleado;
	this.gridBagConstraintsEmpleado.gridx = iXPanelCamposEmpleado++;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleado.add(this.jPanelid_tipo_contratoEmpleado, this.gridBagConstraintsEmpleado);



	if(iXPanelCamposEmpleado % 2==0) {
		iXPanelCamposEmpleado=0;
		iYPanelCamposEmpleado++;
	}
	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleado.gridy = iYPanelCamposEmpleado;
	this.gridBagConstraintsEmpleado.gridx = iXPanelCamposEmpleado++;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleado.add(this.jPanelcodigoEmpleado, this.gridBagConstraintsEmpleado);



	if(iXPanelCamposEmpleado % 2==0) {
		iXPanelCamposEmpleado=0;
		iYPanelCamposEmpleado++;
	}
	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleado.gridy = iYPanelCamposEmpleado;
	this.gridBagConstraintsEmpleado.gridx = iXPanelCamposEmpleado++;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleado.add(this.jPanelnombreEmpleado, this.gridBagConstraintsEmpleado);



	if(iXPanelCamposEmpleado % 2==0) {
		iXPanelCamposEmpleado=0;
		iYPanelCamposEmpleado++;
	}
	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleado.gridy = iYPanelCamposEmpleado;
	this.gridBagConstraintsEmpleado.gridx = iXPanelCamposEmpleado++;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleado.add(this.jPanelapellidoEmpleado, this.gridBagConstraintsEmpleado);



	if(iXPanelCamposEmpleado % 2==0) {
		iXPanelCamposEmpleado=0;
		iYPanelCamposEmpleado++;
	}
	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleado.gridy = iYPanelCamposEmpleado;
	this.gridBagConstraintsEmpleado.gridx = iXPanelCamposEmpleado++;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleado.add(this.jPanelnombre_completoEmpleado, this.gridBagConstraintsEmpleado);



	if(iXPanelCamposEmpleado % 2==0) {
		iXPanelCamposEmpleado=0;
		iYPanelCamposEmpleado++;
	}
	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleado.gridy = iYPanelCamposEmpleado;
	this.gridBagConstraintsEmpleado.gridx = iXPanelCamposEmpleado++;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleado.add(this.jPanelmailEmpleado, this.gridBagConstraintsEmpleado);



	if(iXPanelCamposEmpleado % 2==0) {
		iXPanelCamposEmpleado=0;
		iYPanelCamposEmpleado++;
	}
	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleado.gridy = iYPanelCamposEmpleado;
	this.gridBagConstraintsEmpleado.gridx = iXPanelCamposEmpleado++;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleado.add(this.jPaneldireccionEmpleado, this.gridBagConstraintsEmpleado);



	if(iXPanelCamposEmpleado % 2==0) {
		iXPanelCamposEmpleado=0;
		iYPanelCamposEmpleado++;
	}
	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleado.gridy = iYPanelCamposEmpleado;
	this.gridBagConstraintsEmpleado.gridx = iXPanelCamposEmpleado++;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleado.add(this.jPanelsueldoEmpleado, this.gridBagConstraintsEmpleado);



	if(iXPanelCamposEmpleado % 2==0) {
		iXPanelCamposEmpleado=0;
		iYPanelCamposEmpleado++;
	}
	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleado.gridy = iYPanelCamposEmpleado;
	this.gridBagConstraintsEmpleado.gridx = iXPanelCamposEmpleado++;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleado.add(this.jPaneltelefonoEmpleado, this.gridBagConstraintsEmpleado);



	if(iXPanelCamposEmpleado % 2==0) {
		iXPanelCamposEmpleado=0;
		iYPanelCamposEmpleado++;
	}
	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleado.gridy = iYPanelCamposEmpleado;
	this.gridBagConstraintsEmpleado.gridx = iXPanelCamposEmpleado++;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleado.add(this.jPanelid_tipo_cuenta_banco_globalEmpleado, this.gridBagConstraintsEmpleado);



	if(iXPanelCamposEmpleado % 2==0) {
		iXPanelCamposEmpleado=0;
		iYPanelCamposEmpleado++;
	}
	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleado.gridy = iYPanelCamposEmpleado;
	this.gridBagConstraintsEmpleado.gridx = iXPanelCamposEmpleado++;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleado.add(this.jPanelnumero_cuentaEmpleado, this.gridBagConstraintsEmpleado);



	if(iXPanelCamposEmpleado % 2==0) {
		iXPanelCamposEmpleado=0;
		iYPanelCamposEmpleado++;
	}
	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleado.gridy = iYPanelCamposEmpleado;
	this.gridBagConstraintsEmpleado.gridx = iXPanelCamposEmpleado++;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleado.add(this.jPaneltiene_casaEmpleado, this.gridBagConstraintsEmpleado);



	if(iXPanelCamposEmpleado % 2==0) {
		iXPanelCamposEmpleado=0;
		iYPanelCamposEmpleado++;
	}
	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleado.gridy = iYPanelCamposEmpleado;
	this.gridBagConstraintsEmpleado.gridx = iXPanelCamposEmpleado++;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleado.add(this.jPaneltiene_vehiculoEmpleado, this.gridBagConstraintsEmpleado);



	if(iXPanelCamposEmpleado % 2==0) {
		iXPanelCamposEmpleado=0;
		iYPanelCamposEmpleado++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleado.gridy = iYPanelCamposOcultosEmpleado;
	this.gridBagConstraintsEmpleado.gridx = iXPanelCamposOcultosEmpleado++;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosEmpleado.add(this.jPanelid_empresaEmpleado, this.gridBagConstraintsEmpleado);



	if(iXPanelCamposOcultosEmpleado % 2==0) {
		iXPanelCamposOcultosEmpleado=0;
		iYPanelCamposOcultosEmpleado++;
	}
	this.gridBagConstraintsEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleado.gridy = iYPanelCamposOcultosEmpleado;
	this.gridBagConstraintsEmpleado.gridx = iXPanelCamposOcultosEmpleado++;
	this.gridBagConstraintsEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosEmpleado.add(this.jPanelid_sucursalEmpleado, this.gridBagConstraintsEmpleado);



	if(iXPanelCamposOcultosEmpleado % 2==0) {
		iXPanelCamposOcultosEmpleado=0;
		iYPanelCamposOcultosEmpleado++;
	}
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
		
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
			
		GridBagLayout gridaBagLayoutAccionesEmpleado= new GridBagLayout();
		this.jPanelAccionesEmpleado.setLayout(gridaBagLayoutAccionesEmpleado);
		
		GridBagLayout gridaBagLayoutAccionesFormularioEmpleado= new GridBagLayout();
		this.jPanelAccionesFormularioEmpleado.setLayout(gridaBagLayoutAccionesFormularioEmpleado);
		
		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEmpleado.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEmpleado.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEmpleado.add(this.jComboBoxTiposAccionesFormularioEmpleado, this.gridBagConstraintsEmpleado);

		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEmpleado.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEmpleado.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEmpleado.add(this.jCheckBoxPostAccionNuevoEmpleado, this.gridBagConstraintsEmpleado);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.empleadoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEmpleado.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEmpleado.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEmpleado.add(this.jCheckBoxPostAccionSinCerrarEmpleado, this.gridBagConstraintsEmpleado);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.empleadoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.empleadoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEmpleado.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEmpleado.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEmpleado.add(this.jCheckBoxPostAccionSinMensajeEmpleado, this.gridBagConstraintsEmpleado);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleado.gridy = 0;
		this.gridBagConstraintsEmpleado.gridx = iPosXAccion++;
			
		this.jPanelAccionesEmpleado.add(this.jButtonModificarEmpleado, this.gridBagConstraintsEmpleado);							

		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleado.gridy = 0;
		this.gridBagConstraintsEmpleado.gridx =iPosXAccion++;
			
		this.jPanelAccionesEmpleado.add(this.jButtonEliminarEmpleado, this.gridBagConstraintsEmpleado);
		
			
		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEmpleado.gridy = 0;		
		this.gridBagConstraintsEmpleado.gridx = iPosXAccion++;
		
		this.jPanelAccionesEmpleado.add(this.jButtonActualizarEmpleado, this.gridBagConstraintsEmpleado);


		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEmpleado.gridy = 0;		
		this.gridBagConstraintsEmpleado.gridx = iPosXAccion++;
		
		this.jPanelAccionesEmpleado.add(this.jButtonGuardarCambiosEmpleado, this.gridBagConstraintsEmpleado);	
		
		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEmpleado.gridy = 0;		
		this.gridBagConstraintsEmpleado.gridx =iPosXAccion++;
		
		this.jPanelAccionesEmpleado.add(this.jButtonCancelarEmpleado, this.gridBagConstraintsEmpleado);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEmpleado = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEmpleado);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.empleadoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEmpleado = new GridBagConstraints();						
			this.gridBagConstraintsEmpleado.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEmpleado.gridx = 0;		
			//this.gridBagConstraintsEmpleado.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleado.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEmpleado.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEmpleado.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEmpleado.gridx =0;
		this.gridBagConstraintsEmpleado.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEmpleado.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEmpleado, this.gridBagConstraintsEmpleado);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(EmpleadoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleEmpleado = new EmpleadoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Empleado DATOS");
			
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
			
	        //this.setTitle("[FOR] - Empleado DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Empleado Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			EmpleadoModel empleadoModel=new EmpleadoModel(this);
			
			//SI USARA CLASE INTERNA
			//EmpleadoModel.EmpleadoFocusTraversalPolicy empleadoFocusTraversalPolicy = empleadoModel.new EmpleadoFocusTraversalPolicy(this);
			
			//empleadoFocusTraversalPolicy.setempleadoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(empleadoModel);
			
			
			this.jContentPaneDetalleEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleEmpleado = new GridBagLayout();	
			this.jContentPaneDetalleEmpleado.setLayout(gridaBagLayoutDetalleEmpleado);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEmpleado = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsEmpleado = new GridBagConstraints();
				this.gridBagConstraintsEmpleado.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsEmpleado.gridx = 0;
					
				
				this.jContentPaneDetalleEmpleado.add(jTtoolBarDetalleEmpleado, gridBagConstraintsEmpleado);								
				
}
			
			this.jScrollPanelDatosEdicionEmpleado=   new JScrollPane(jContentPaneDetalleEmpleado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEmpleado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEmpleado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEmpleado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralEmpleado=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEmpleado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEmpleado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEmpleado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEmpleado = new GridBagConstraints();
			
			
	        this.gridBagConstraintsEmpleado.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsEmpleado.gridx = 0;
	        
			this.jContentPaneDetalleEmpleado.add(jPanelCamposEmpleado, gridBagConstraintsEmpleado);
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			
			
				this.gridBagConstraintsEmpleado = new GridBagConstraints();
				//this.gridBagConstraintsEmpleado.fill=GridBagConstraints.NONE;
				//this.gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;

				this.gridBagConstraintsEmpleado.gridy = iGridyRelaciones++;
				this.gridBagConstraintsEmpleado.gridx = 0;

				this.jContentPaneDetalleEmpleado.add(this.jPanelAccionesRelacionesFinEmpleado, gridBagConstraintsEmpleado);;
			//}
						
			this.conMaximoRelaciones=true;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
				

				if(!PrestamoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.puedeCargarPorPartePrestamo=true;
				}
			}									
			
			//CARGA O NO CARGA RELACIONADOS(MAESTRO DETALLE)
									  // ABAJO VIENE DE PARAMETRO GENERAL USUARIO
			if(conMaximoRelaciones) { // && this.conFuncionalidadRelaciones) {
				if(!this.conCargarMinimo) {
					if(cargarRelaciones 
						&& empleadoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameAsistenciaMensual(this.puedeCargarPorParteAsistenciaMensual,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameArea(this.puedeCargarPorParteArea,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameCargaFamiliar_NM(this.puedeCargarPorParteCargaFamiliar_NM,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameCurso(this.puedeCargarPorParteCurso,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameDatoGeneralEmpleado(this.puedeCargarPorParteDatoGeneralEmpleado,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameEmpleadoConstante(this.puedeCargarPorParteEmpleadoConstante,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameEmpleadoDisca(this.puedeCargarPorParteEmpleadoDisca,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameEmpleadoEMail(this.puedeCargarPorParteEmpleadoEMail,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameEmpleadoEnfer(this.puedeCargarPorParteEmpleadoEnfer,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameEmpleadoHerra(this.puedeCargarPorParteEmpleadoHerra,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameEmpleadoHobby(this.puedeCargarPorParteEmpleadoHobby,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameEmpleadoIdioma(this.puedeCargarPorParteEmpleadoIdioma,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameEmpleadoImpuestoRenta(this.puedeCargarPorParteEmpleadoImpuestoRenta,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameGastoEmpleado(this.puedeCargarPorParteGastoEmpleado,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameHistorialPagoMesNomi(this.puedeCargarPorParteHistorialPagoMesNomi,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameNovedad(this.puedeCargarPorParteNovedad,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameNovedadNomi(this.puedeCargarPorParteNovedadNomi,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePrestamo(this.puedeCargarPorPartePrestamo,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProfesionEmplea(this.puedeCargarPorParteProfesionEmplea,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameRasgoPersonal(this.puedeCargarPorParteRasgoPersonal,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameReferencia(this.puedeCargarPorParteReferencia,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameRubroEmpleado(this.puedeCargarPorParteRubroEmpleado,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameSeguro(this.puedeCargarPorParteSeguro,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameTallaVestido(this.puedeCargarPorParteTallaVestido,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameTelefono_NM(this.puedeCargarPorParteTelefono_NM,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameVisa(this.puedeCargarPorParteVisa,false,-1);
					
					if(this.empleadoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsEmpleado= new GridBagConstraints();
						this.gridBagConstraintsEmpleado.gridy = iGridyRelaciones++;
						this.gridBagConstraintsEmpleado.gridx = 0;
						this.jContentPaneDetalleEmpleado.add(this.jTabbedPaneRelacionesEmpleado, this.gridBagConstraintsEmpleado);
					}
					
					//RELACIONES OTROS AGRUPADOS
					
				this.gridBagConstraintsEmpleado = new GridBagConstraints();
				//this.gridBagConstraintsEmpleado.fill=GridBagConstraints.NONE;
				//this.gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;

				this.gridBagConstraintsEmpleado.gridy = iGridyRelaciones++;
				this.gridBagConstraintsEmpleado.gridx = 0;

				this.jContentPaneDetalleEmpleado.add(this.jTabbedPaneRelacionesFinformas_de_pagoEmpleado, gridBagConstraintsEmpleado);

				this.jTabbedPaneRelacionesFinformas_de_pagoEmpleado.setVisible(false);

				this.gridBagConstraintsEmpleado = new GridBagConstraints();
				this.gridBagConstraintsEmpleado.gridy = 0;
				this.gridBagConstraintsEmpleado.gridx = iPosXAccionesRelacionesFin++;
				this.jPanelAccionesRelacionesFinEmpleado.add(this.jButtonRelacionesFinNormalEmpleado, this.gridBagConstraintsEmpleado);
				this.gridBagConstraintsEmpleado = new GridBagConstraints();
				this.gridBagConstraintsEmpleado.gridy = 0;
				this.gridBagConstraintsEmpleado.gridx = iPosXAccionesRelacionesFin++;
				this.jPanelAccionesRelacionesFinEmpleado.add(this.jButtonRelacionesFinformas_de_pagoEmpleado, this.gridBagConstraintsEmpleado);;
					
					} else {
						//this.jButtonNuevoRelacionesEmpleado.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameAsistenciaMensual(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameArea(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameCargaFamiliar_NM(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameCurso(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameDatoGeneralEmpleado(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameEmpleadoConstante(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameEmpleadoDisca(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameEmpleadoEMail(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameEmpleadoEnfer(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameEmpleadoHerra(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameEmpleadoHobby(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameEmpleadoIdioma(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameEmpleadoImpuestoRenta(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameGastoEmpleado(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameHistorialPagoMesNomi(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameNovedad(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameNovedadNomi(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePrestamo(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProfesionEmplea(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameRasgoPersonal(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameReferencia(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameRubroEmpleado(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameSeguro(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameTallaVestido(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameTelefono_NM(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameVisa(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosEmpleado.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsEmpleado = new GridBagConstraints();
					this.gridBagConstraintsEmpleado.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsEmpleado.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsEmpleado.gridx = 0;
					
				
					this.jContentPaneDetalleEmpleado.add(jPanelCamposOcultosEmpleado, gridBagConstraintsEmpleado);
				
					this.jPanelCamposOcultosEmpleado.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEmpleado.gridy = iGridyRelaciones++;//79;		
	        this.gridBagConstraintsEmpleado.gridx = 0;
	        this.gridBagConstraintsEmpleado.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleEmpleado.add(this.jPanelAccionesFormularioEmpleado, this.gridBagConstraintsEmpleado);							
			
			
			
			this.gridBagConstraintsEmpleado = new GridBagConstraints();
	        this.gridBagConstraintsEmpleado.gridy = iGridyRelaciones;//79;		
	        this.gridBagConstraintsEmpleado.gridx = 0;
	        
			
			this.jContentPaneDetalleEmpleado.add(this.jPanelAccionesEmpleado, this.gridBagConstraintsEmpleado);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionEmpleado);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionEmpleado=   new JScrollPane(this.jPanelCamposEmpleado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEmpleado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEmpleado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEmpleado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEmpleado.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsEmpleado.gridx = 0;
			this.gridBagConstraintsEmpleado.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsEmpleado.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsEmpleado.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionEmpleado, this.gridBagConstraintsEmpleado);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEmpleado.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEmpleado.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioEmpleado, this.gridBagConstraintsEmpleado);			
			
			this.gridBagConstraintsEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEmpleado.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEmpleado.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesEmpleado, this.gridBagConstraintsEmpleado);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEmpleado, this.gridBagConstraintsEmpleado);
			
			
		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEmpleado, this.gridBagConstraintsEmpleado);
		
			
		this.gridBagConstraintsEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEmpleado.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEmpleado.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEmpleado, this.gridBagConstraintsEmpleado);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralEmpleado;//jContentPane;
		
		return jScrollPanelDatosEdicionEmpleado;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameAsistenciaMensual(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.asistenciamensualSessionBean=new AsistenciaMensualSessionBean();
		this.asistenciamensualSessionBean.setConGuardarRelaciones(false);
		this.asistenciamensualSessionBean.setEsGuardarRelacionado(true);

		this.asistenciamensualBeanSwingJInternalFrame=null;//new AsistenciaMensualBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.asistenciamensualBeanSwingJInternalFramePopup=new AsistenciaMensualBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.asistenciamensualBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.asistenciamensualSessionBean.getEsGuardarRelacionado()) {

				AsistenciaMensualJInternalFrame.STIPO_TAMANIO_GENERAL=EmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;
				AsistenciaMensualJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.asistenciamensualSessionBean.setEsGuardarRelacionado(true);

				this.asistenciamensualBeanSwingJInternalFrame=new AsistenciaMensualBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.asistenciamensualBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.asistenciamensualBeanSwingJInternalFrame.setasistenciamensualSessionBean(this.asistenciamensualSessionBean);

				//this.gridBagConstraintsEmpleado = new GridBagConstraints();
				//this.gridBagConstraintsEmpleado.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEmpleado.gridx = 0;
				//this.jContentPaneDetalleEmpleado.add(this.asistenciamensualBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEmpleado);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEmpleado.add("Asistencia Mensuales",this.asistenciamensualBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEmpleado.setComponentAt(iIndexTab,this.asistenciamensualBeanSwingJInternalFrame.getContentPane());
				}

				//AsistenciaMensualJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.asistenciamensualSessionBean.setEsGuardarRelacionado(false);
				this.asistenciamensualBeanSwingJInternalFrame=null;//new AsistenciaMensualBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.asistenciamensualSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteAsistenciaMensual) {
					this.jTabbedPaneRelacionesEmpleado.add("Asistencia Mensuales",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameArea(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.areaSessionBean=new AreaSessionBean();
		this.areaSessionBean.setConGuardarRelaciones(false);
		this.areaSessionBean.setEsGuardarRelacionado(true);

		this.areaBeanSwingJInternalFrame=null;//new AreaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.areaBeanSwingJInternalFramePopup=new AreaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.areaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.areaSessionBean.getEsGuardarRelacionado()) {

				AreaJInternalFrame.STIPO_TAMANIO_GENERAL=EmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;
				AreaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.areaSessionBean.setEsGuardarRelacionado(true);

				this.areaBeanSwingJInternalFrame=new AreaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.areaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.areaBeanSwingJInternalFrame.setareaSessionBean(this.areaSessionBean);

				//this.gridBagConstraintsEmpleado = new GridBagConstraints();
				//this.gridBagConstraintsEmpleado.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEmpleado.gridx = 0;
				//this.jContentPaneDetalleEmpleado.add(this.areaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEmpleado);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEmpleado.add("Areas",this.areaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEmpleado.setComponentAt(iIndexTab,this.areaBeanSwingJInternalFrame.getContentPane());
				}

				//AreaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.areaSessionBean.setEsGuardarRelacionado(false);
				this.areaBeanSwingJInternalFrame=null;//new AreaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.areaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteArea) {
					this.jTabbedPaneRelacionesEmpleado.add("Areas",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameCargaFamiliar_NM(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.cargafamiliar_nmSessionBean=new CargaFamiliar_NMSessionBean();
		this.cargafamiliar_nmSessionBean.setConGuardarRelaciones(false);
		this.cargafamiliar_nmSessionBean.setEsGuardarRelacionado(true);

		this.cargafamiliar_nmBeanSwingJInternalFrame=null;//new CargaFamiliar_NMBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.cargafamiliar_nmBeanSwingJInternalFramePopup=new CargaFamiliar_NMBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.cargafamiliar_nmBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado()) {

				CargaFamiliar_NMJInternalFrame.STIPO_TAMANIO_GENERAL=EmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;
				CargaFamiliar_NMJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.cargafamiliar_nmSessionBean.setEsGuardarRelacionado(true);

				this.cargafamiliar_nmBeanSwingJInternalFrame=new CargaFamiliar_NMBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.cargafamiliar_nmBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.cargafamiliar_nmBeanSwingJInternalFrame.setcargafamiliar_nmSessionBean(this.cargafamiliar_nmSessionBean);

				//this.gridBagConstraintsEmpleado = new GridBagConstraints();
				//this.gridBagConstraintsEmpleado.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEmpleado.gridx = 0;
				//this.jContentPaneDetalleEmpleado.add(this.cargafamiliar_nmBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEmpleado);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEmpleado.add("Carga Familiar_ N Mes",this.cargafamiliar_nmBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEmpleado.setComponentAt(iIndexTab,this.cargafamiliar_nmBeanSwingJInternalFrame.getContentPane());
				}

				//CargaFamiliar_NMJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.cargafamiliar_nmSessionBean.setEsGuardarRelacionado(false);
				this.cargafamiliar_nmBeanSwingJInternalFrame=null;//new CargaFamiliar_NMBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.cargafamiliar_nmSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteCargaFamiliar_NM) {
					this.jTabbedPaneRelacionesEmpleado.add("Carga Familiar_ N Mes",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameCurso(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.cursoSessionBean=new CursoSessionBean();
		this.cursoSessionBean.setConGuardarRelaciones(false);
		this.cursoSessionBean.setEsGuardarRelacionado(true);

		this.cursoBeanSwingJInternalFrame=null;//new CursoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.cursoBeanSwingJInternalFramePopup=new CursoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.cursoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.cursoSessionBean.getEsGuardarRelacionado()) {

				CursoJInternalFrame.STIPO_TAMANIO_GENERAL=EmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;
				CursoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.cursoSessionBean.setEsGuardarRelacionado(true);

				this.cursoBeanSwingJInternalFrame=new CursoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.cursoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.cursoBeanSwingJInternalFrame.setcursoSessionBean(this.cursoSessionBean);

				//this.gridBagConstraintsEmpleado = new GridBagConstraints();
				//this.gridBagConstraintsEmpleado.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEmpleado.gridx = 0;
				//this.jContentPaneDetalleEmpleado.add(this.cursoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEmpleado);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEmpleado.add("Cursos",this.cursoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEmpleado.setComponentAt(iIndexTab,this.cursoBeanSwingJInternalFrame.getContentPane());
				}

				//CursoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.cursoSessionBean.setEsGuardarRelacionado(false);
				this.cursoBeanSwingJInternalFrame=null;//new CursoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.cursoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteCurso) {
					this.jTabbedPaneRelacionesEmpleado.add("Cursos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameDatoGeneralEmpleado(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.datogeneralempleadoSessionBean=new DatoGeneralEmpleadoSessionBean();
		this.datogeneralempleadoSessionBean.setConGuardarRelaciones(false);
		this.datogeneralempleadoSessionBean.setEsGuardarRelacionado(true);

		this.datogeneralempleadoBeanSwingJInternalFrame=null;//new DatoGeneralEmpleadoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.datogeneralempleadoBeanSwingJInternalFramePopup=new DatoGeneralEmpleadoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.datogeneralempleadoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.datogeneralempleadoSessionBean.getEsGuardarRelacionado()) {

				DatoGeneralEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL=EmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;
				DatoGeneralEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.datogeneralempleadoSessionBean.setEsGuardarRelacionado(true);

				this.datogeneralempleadoBeanSwingJInternalFrame=new DatoGeneralEmpleadoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.datogeneralempleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.datogeneralempleadoBeanSwingJInternalFrame.setdatogeneralempleadoSessionBean(this.datogeneralempleadoSessionBean);

				//this.gridBagConstraintsEmpleado = new GridBagConstraints();
				//this.gridBagConstraintsEmpleado.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEmpleado.gridx = 0;
				//this.jContentPaneDetalleEmpleado.add(this.datogeneralempleadoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEmpleado);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEmpleado.add("Dato General Empleados",this.datogeneralempleadoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEmpleado.setComponentAt(iIndexTab,this.datogeneralempleadoBeanSwingJInternalFrame.getContentPane());
				}

				//DatoGeneralEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.datogeneralempleadoSessionBean.setEsGuardarRelacionado(false);
				this.datogeneralempleadoBeanSwingJInternalFrame=null;//new DatoGeneralEmpleadoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.datogeneralempleadoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDatoGeneralEmpleado) {
					this.jTabbedPaneRelacionesEmpleado.add("Dato General Empleados",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameEmpleadoConstante(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.empleadoconstanteSessionBean=new EmpleadoConstanteSessionBean();
		this.empleadoconstanteSessionBean.setConGuardarRelaciones(false);
		this.empleadoconstanteSessionBean.setEsGuardarRelacionado(true);

		this.empleadoconstanteBeanSwingJInternalFrame=null;//new EmpleadoConstanteBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.empleadoconstanteBeanSwingJInternalFramePopup=new EmpleadoConstanteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.empleadoconstanteBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.empleadoconstanteSessionBean.getEsGuardarRelacionado()) {

				EmpleadoConstanteJInternalFrame.STIPO_TAMANIO_GENERAL=EmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;
				EmpleadoConstanteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.empleadoconstanteSessionBean.setEsGuardarRelacionado(true);

				this.empleadoconstanteBeanSwingJInternalFrame=new EmpleadoConstanteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.empleadoconstanteBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.empleadoconstanteBeanSwingJInternalFrame.setempleadoconstanteSessionBean(this.empleadoconstanteSessionBean);

				//this.gridBagConstraintsEmpleado = new GridBagConstraints();
				//this.gridBagConstraintsEmpleado.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEmpleado.gridx = 0;
				//this.jContentPaneDetalleEmpleado.add(this.empleadoconstanteBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEmpleado);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEmpleado.add("Empleado Constantes",this.empleadoconstanteBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEmpleado.setComponentAt(iIndexTab,this.empleadoconstanteBeanSwingJInternalFrame.getContentPane());
				}

				//EmpleadoConstanteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.empleadoconstanteSessionBean.setEsGuardarRelacionado(false);
				this.empleadoconstanteBeanSwingJInternalFrame=null;//new EmpleadoConstanteBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.empleadoconstanteSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteEmpleadoConstante) {
					this.jTabbedPaneRelacionesEmpleado.add("Empleado Constantes",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameEmpleadoDisca(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.empleadodiscaSessionBean=new EmpleadoDiscaSessionBean();
		this.empleadodiscaSessionBean.setConGuardarRelaciones(false);
		this.empleadodiscaSessionBean.setEsGuardarRelacionado(true);

		this.empleadodiscaBeanSwingJInternalFrame=null;//new EmpleadoDiscaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.empleadodiscaBeanSwingJInternalFramePopup=new EmpleadoDiscaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.empleadodiscaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.empleadodiscaSessionBean.getEsGuardarRelacionado()) {

				EmpleadoDiscaJInternalFrame.STIPO_TAMANIO_GENERAL=EmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;
				EmpleadoDiscaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.empleadodiscaSessionBean.setEsGuardarRelacionado(true);

				this.empleadodiscaBeanSwingJInternalFrame=new EmpleadoDiscaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.empleadodiscaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.empleadodiscaBeanSwingJInternalFrame.setempleadodiscaSessionBean(this.empleadodiscaSessionBean);

				//this.gridBagConstraintsEmpleado = new GridBagConstraints();
				//this.gridBagConstraintsEmpleado.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEmpleado.gridx = 0;
				//this.jContentPaneDetalleEmpleado.add(this.empleadodiscaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEmpleado);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEmpleado.add("Empleado Discas",this.empleadodiscaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEmpleado.setComponentAt(iIndexTab,this.empleadodiscaBeanSwingJInternalFrame.getContentPane());
				}

				//EmpleadoDiscaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.empleadodiscaSessionBean.setEsGuardarRelacionado(false);
				this.empleadodiscaBeanSwingJInternalFrame=null;//new EmpleadoDiscaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.empleadodiscaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteEmpleadoDisca) {
					this.jTabbedPaneRelacionesEmpleado.add("Empleado Discas",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameEmpleadoEMail(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.empleadoemailSessionBean=new EmpleadoEMailSessionBean();
		this.empleadoemailSessionBean.setConGuardarRelaciones(false);
		this.empleadoemailSessionBean.setEsGuardarRelacionado(true);

		this.empleadoemailBeanSwingJInternalFrame=null;//new EmpleadoEMailBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.empleadoemailBeanSwingJInternalFramePopup=new EmpleadoEMailBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.empleadoemailBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.empleadoemailSessionBean.getEsGuardarRelacionado()) {

				EmpleadoEMailJInternalFrame.STIPO_TAMANIO_GENERAL=EmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;
				EmpleadoEMailJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.empleadoemailSessionBean.setEsGuardarRelacionado(true);

				this.empleadoemailBeanSwingJInternalFrame=new EmpleadoEMailBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.empleadoemailBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.empleadoemailBeanSwingJInternalFrame.setempleadoemailSessionBean(this.empleadoemailSessionBean);

				//this.gridBagConstraintsEmpleado = new GridBagConstraints();
				//this.gridBagConstraintsEmpleado.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEmpleado.gridx = 0;
				//this.jContentPaneDetalleEmpleado.add(this.empleadoemailBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEmpleado);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEmpleado.add("Empleado Emails",this.empleadoemailBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEmpleado.setComponentAt(iIndexTab,this.empleadoemailBeanSwingJInternalFrame.getContentPane());
				}

				//EmpleadoEMailJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.empleadoemailSessionBean.setEsGuardarRelacionado(false);
				this.empleadoemailBeanSwingJInternalFrame=null;//new EmpleadoEMailBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.empleadoemailSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteEmpleadoEMail) {
					this.jTabbedPaneRelacionesEmpleado.add("Empleado Emails",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameEmpleadoEnfer(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.empleadoenferSessionBean=new EmpleadoEnferSessionBean();
		this.empleadoenferSessionBean.setConGuardarRelaciones(false);
		this.empleadoenferSessionBean.setEsGuardarRelacionado(true);

		this.empleadoenferBeanSwingJInternalFrame=null;//new EmpleadoEnferBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.empleadoenferBeanSwingJInternalFramePopup=new EmpleadoEnferBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.empleadoenferBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.empleadoenferSessionBean.getEsGuardarRelacionado()) {

				EmpleadoEnferJInternalFrame.STIPO_TAMANIO_GENERAL=EmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;
				EmpleadoEnferJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.empleadoenferSessionBean.setEsGuardarRelacionado(true);

				this.empleadoenferBeanSwingJInternalFrame=new EmpleadoEnferBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.empleadoenferBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.empleadoenferBeanSwingJInternalFrame.setempleadoenferSessionBean(this.empleadoenferSessionBean);

				//this.gridBagConstraintsEmpleado = new GridBagConstraints();
				//this.gridBagConstraintsEmpleado.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEmpleado.gridx = 0;
				//this.jContentPaneDetalleEmpleado.add(this.empleadoenferBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEmpleado);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEmpleado.add("Empleado Enferes",this.empleadoenferBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEmpleado.setComponentAt(iIndexTab,this.empleadoenferBeanSwingJInternalFrame.getContentPane());
				}

				//EmpleadoEnferJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.empleadoenferSessionBean.setEsGuardarRelacionado(false);
				this.empleadoenferBeanSwingJInternalFrame=null;//new EmpleadoEnferBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.empleadoenferSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteEmpleadoEnfer) {
					this.jTabbedPaneRelacionesEmpleado.add("Empleado Enferes",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameEmpleadoHerra(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.empleadoherraSessionBean=new EmpleadoHerraSessionBean();
		this.empleadoherraSessionBean.setConGuardarRelaciones(false);
		this.empleadoherraSessionBean.setEsGuardarRelacionado(true);

		this.empleadoherraBeanSwingJInternalFrame=null;//new EmpleadoHerraBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.empleadoherraBeanSwingJInternalFramePopup=new EmpleadoHerraBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.empleadoherraBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.empleadoherraSessionBean.getEsGuardarRelacionado()) {

				EmpleadoHerraJInternalFrame.STIPO_TAMANIO_GENERAL=EmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;
				EmpleadoHerraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.empleadoherraSessionBean.setEsGuardarRelacionado(true);

				this.empleadoherraBeanSwingJInternalFrame=new EmpleadoHerraBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.empleadoherraBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.empleadoherraBeanSwingJInternalFrame.setempleadoherraSessionBean(this.empleadoherraSessionBean);

				//this.gridBagConstraintsEmpleado = new GridBagConstraints();
				//this.gridBagConstraintsEmpleado.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEmpleado.gridx = 0;
				//this.jContentPaneDetalleEmpleado.add(this.empleadoherraBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEmpleado);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEmpleado.add("Empleado Herras",this.empleadoherraBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEmpleado.setComponentAt(iIndexTab,this.empleadoherraBeanSwingJInternalFrame.getContentPane());
				}

				//EmpleadoHerraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.empleadoherraSessionBean.setEsGuardarRelacionado(false);
				this.empleadoherraBeanSwingJInternalFrame=null;//new EmpleadoHerraBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.empleadoherraSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteEmpleadoHerra) {
					this.jTabbedPaneRelacionesEmpleado.add("Empleado Herras",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameEmpleadoHobby(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.empleadohobbySessionBean=new EmpleadoHobbySessionBean();
		this.empleadohobbySessionBean.setConGuardarRelaciones(false);
		this.empleadohobbySessionBean.setEsGuardarRelacionado(true);

		this.empleadohobbyBeanSwingJInternalFrame=null;//new EmpleadoHobbyBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.empleadohobbyBeanSwingJInternalFramePopup=new EmpleadoHobbyBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.empleadohobbyBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.empleadohobbySessionBean.getEsGuardarRelacionado()) {

				EmpleadoHobbyJInternalFrame.STIPO_TAMANIO_GENERAL=EmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;
				EmpleadoHobbyJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.empleadohobbySessionBean.setEsGuardarRelacionado(true);

				this.empleadohobbyBeanSwingJInternalFrame=new EmpleadoHobbyBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.empleadohobbyBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.empleadohobbyBeanSwingJInternalFrame.setempleadohobbySessionBean(this.empleadohobbySessionBean);

				//this.gridBagConstraintsEmpleado = new GridBagConstraints();
				//this.gridBagConstraintsEmpleado.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEmpleado.gridx = 0;
				//this.jContentPaneDetalleEmpleado.add(this.empleadohobbyBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEmpleado);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEmpleado.add("Empleado Hobbyes",this.empleadohobbyBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEmpleado.setComponentAt(iIndexTab,this.empleadohobbyBeanSwingJInternalFrame.getContentPane());
				}

				//EmpleadoHobbyJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.empleadohobbySessionBean.setEsGuardarRelacionado(false);
				this.empleadohobbyBeanSwingJInternalFrame=null;//new EmpleadoHobbyBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.empleadohobbySessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteEmpleadoHobby) {
					this.jTabbedPaneRelacionesEmpleado.add("Empleado Hobbyes",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameEmpleadoIdioma(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.empleadoidiomaSessionBean=new EmpleadoIdiomaSessionBean();
		this.empleadoidiomaSessionBean.setConGuardarRelaciones(false);
		this.empleadoidiomaSessionBean.setEsGuardarRelacionado(true);

		this.empleadoidiomaBeanSwingJInternalFrame=null;//new EmpleadoIdiomaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.empleadoidiomaBeanSwingJInternalFramePopup=new EmpleadoIdiomaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.empleadoidiomaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.empleadoidiomaSessionBean.getEsGuardarRelacionado()) {

				EmpleadoIdiomaJInternalFrame.STIPO_TAMANIO_GENERAL=EmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;
				EmpleadoIdiomaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.empleadoidiomaSessionBean.setEsGuardarRelacionado(true);

				this.empleadoidiomaBeanSwingJInternalFrame=new EmpleadoIdiomaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.empleadoidiomaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.empleadoidiomaBeanSwingJInternalFrame.setempleadoidiomaSessionBean(this.empleadoidiomaSessionBean);

				//this.gridBagConstraintsEmpleado = new GridBagConstraints();
				//this.gridBagConstraintsEmpleado.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEmpleado.gridx = 0;
				//this.jContentPaneDetalleEmpleado.add(this.empleadoidiomaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEmpleado);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEmpleado.add("Empleado Idiomas",this.empleadoidiomaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEmpleado.setComponentAt(iIndexTab,this.empleadoidiomaBeanSwingJInternalFrame.getContentPane());
				}

				//EmpleadoIdiomaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.empleadoidiomaSessionBean.setEsGuardarRelacionado(false);
				this.empleadoidiomaBeanSwingJInternalFrame=null;//new EmpleadoIdiomaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.empleadoidiomaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteEmpleadoIdioma) {
					this.jTabbedPaneRelacionesEmpleado.add("Empleado Idiomas",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameEmpleadoImpuestoRenta(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.empleadoimpuestorentaSessionBean=new EmpleadoImpuestoRentaSessionBean();
		this.empleadoimpuestorentaSessionBean.setConGuardarRelaciones(false);
		this.empleadoimpuestorentaSessionBean.setEsGuardarRelacionado(true);

		this.empleadoimpuestorentaBeanSwingJInternalFrame=null;//new EmpleadoImpuestoRentaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.empleadoimpuestorentaBeanSwingJInternalFramePopup=new EmpleadoImpuestoRentaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.empleadoimpuestorentaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado()) {

				EmpleadoImpuestoRentaJInternalFrame.STIPO_TAMANIO_GENERAL=EmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;
				EmpleadoImpuestoRentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.empleadoimpuestorentaSessionBean.setEsGuardarRelacionado(true);

				this.empleadoimpuestorentaBeanSwingJInternalFrame=new EmpleadoImpuestoRentaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.empleadoimpuestorentaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.empleadoimpuestorentaBeanSwingJInternalFrame.setempleadoimpuestorentaSessionBean(this.empleadoimpuestorentaSessionBean);

				//this.gridBagConstraintsEmpleado = new GridBagConstraints();
				//this.gridBagConstraintsEmpleado.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEmpleado.gridx = 0;
				//this.jContentPaneDetalleEmpleado.add(this.empleadoimpuestorentaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEmpleado);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEmpleado.add("Empleado Impuesto Rentas",this.empleadoimpuestorentaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEmpleado.setComponentAt(iIndexTab,this.empleadoimpuestorentaBeanSwingJInternalFrame.getContentPane());
				}

				//EmpleadoImpuestoRentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.empleadoimpuestorentaSessionBean.setEsGuardarRelacionado(false);
				this.empleadoimpuestorentaBeanSwingJInternalFrame=null;//new EmpleadoImpuestoRentaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteEmpleadoImpuestoRenta) {
					this.jTabbedPaneRelacionesEmpleado.add("Empleado Impuesto Rentas",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameGastoEmpleado(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.gastoempleadoSessionBean=new GastoEmpleadoSessionBean();
		this.gastoempleadoSessionBean.setConGuardarRelaciones(false);
		this.gastoempleadoSessionBean.setEsGuardarRelacionado(true);

		this.gastoempleadoBeanSwingJInternalFrame=null;//new GastoEmpleadoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.gastoempleadoBeanSwingJInternalFramePopup=new GastoEmpleadoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.gastoempleadoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.gastoempleadoSessionBean.getEsGuardarRelacionado()) {

				GastoEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL=EmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;
				GastoEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.gastoempleadoSessionBean.setEsGuardarRelacionado(true);

				this.gastoempleadoBeanSwingJInternalFrame=new GastoEmpleadoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.gastoempleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.gastoempleadoBeanSwingJInternalFrame.setgastoempleadoSessionBean(this.gastoempleadoSessionBean);

				//this.gridBagConstraintsEmpleado = new GridBagConstraints();
				//this.gridBagConstraintsEmpleado.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEmpleado.gridx = 0;
				//this.jContentPaneDetalleEmpleado.add(this.gastoempleadoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEmpleado);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEmpleado.add("Gasto Empleados",this.gastoempleadoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEmpleado.setComponentAt(iIndexTab,this.gastoempleadoBeanSwingJInternalFrame.getContentPane());
				}

				//GastoEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.gastoempleadoSessionBean.setEsGuardarRelacionado(false);
				this.gastoempleadoBeanSwingJInternalFrame=null;//new GastoEmpleadoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.gastoempleadoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteGastoEmpleado) {
					this.jTabbedPaneRelacionesEmpleado.add("Gasto Empleados",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameHistorialPagoMesNomi(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.historialpagomesnomiSessionBean=new HistorialPagoMesNomiSessionBean();
		this.historialpagomesnomiSessionBean.setConGuardarRelaciones(false);
		this.historialpagomesnomiSessionBean.setEsGuardarRelacionado(true);

		this.historialpagomesnomiBeanSwingJInternalFrame=null;//new HistorialPagoMesNomiBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.historialpagomesnomiBeanSwingJInternalFramePopup=new HistorialPagoMesNomiBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.historialpagomesnomiBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.historialpagomesnomiSessionBean.getEsGuardarRelacionado()) {

				HistorialPagoMesNomiJInternalFrame.STIPO_TAMANIO_GENERAL=EmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;
				HistorialPagoMesNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.historialpagomesnomiSessionBean.setEsGuardarRelacionado(true);

				this.historialpagomesnomiBeanSwingJInternalFrame=new HistorialPagoMesNomiBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.historialpagomesnomiBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.historialpagomesnomiBeanSwingJInternalFrame.sethistorialpagomesnomiSessionBean(this.historialpagomesnomiSessionBean);

				//this.gridBagConstraintsEmpleado = new GridBagConstraints();
				//this.gridBagConstraintsEmpleado.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEmpleado.gridx = 0;
				//this.jContentPaneDetalleEmpleado.add(this.historialpagomesnomiBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEmpleado);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEmpleado.add("Historial Pago Mes Nomis",this.historialpagomesnomiBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEmpleado.setComponentAt(iIndexTab,this.historialpagomesnomiBeanSwingJInternalFrame.getContentPane());
				}

				//HistorialPagoMesNomiJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.historialpagomesnomiSessionBean.setEsGuardarRelacionado(false);
				this.historialpagomesnomiBeanSwingJInternalFrame=null;//new HistorialPagoMesNomiBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.historialpagomesnomiSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteHistorialPagoMesNomi) {
					this.jTabbedPaneRelacionesEmpleado.add("Historial Pago Mes Nomis",new JPanel());
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

				NovedadJInternalFrame.STIPO_TAMANIO_GENERAL=EmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;
				NovedadJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.novedadSessionBean.setEsGuardarRelacionado(true);

				this.novedadBeanSwingJInternalFrame=new NovedadBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.novedadBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.novedadBeanSwingJInternalFrame.setnovedadSessionBean(this.novedadSessionBean);

				//this.gridBagConstraintsEmpleado = new GridBagConstraints();
				//this.gridBagConstraintsEmpleado.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEmpleado.gridx = 0;
				//this.jContentPaneDetalleEmpleado.add(this.novedadBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEmpleado);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEmpleado.add("Novedades",this.novedadBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEmpleado.setComponentAt(iIndexTab,this.novedadBeanSwingJInternalFrame.getContentPane());
				}

				//NovedadJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.novedadSessionBean.setEsGuardarRelacionado(false);
				this.novedadBeanSwingJInternalFrame=null;//new NovedadBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.novedadSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteNovedad) {
					this.jTabbedPaneRelacionesEmpleado.add("Novedades",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameNovedadNomi(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.novedadnomiSessionBean=new NovedadNomiSessionBean();
		this.novedadnomiSessionBean.setConGuardarRelaciones(false);
		this.novedadnomiSessionBean.setEsGuardarRelacionado(true);

		this.novedadnomiBeanSwingJInternalFrame=null;//new NovedadNomiBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.novedadnomiBeanSwingJInternalFramePopup=new NovedadNomiBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.novedadnomiBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.novedadnomiSessionBean.getEsGuardarRelacionado()) {

				NovedadNomiJInternalFrame.STIPO_TAMANIO_GENERAL=EmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;
				NovedadNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.novedadnomiSessionBean.setEsGuardarRelacionado(true);

				this.novedadnomiBeanSwingJInternalFrame=new NovedadNomiBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.novedadnomiBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.novedadnomiBeanSwingJInternalFrame.setnovedadnomiSessionBean(this.novedadnomiSessionBean);

				//this.gridBagConstraintsEmpleado = new GridBagConstraints();
				//this.gridBagConstraintsEmpleado.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEmpleado.gridx = 0;
				//this.jContentPaneDetalleEmpleado.add(this.novedadnomiBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEmpleado);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEmpleado.add("Novedad Nomis",this.novedadnomiBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEmpleado.setComponentAt(iIndexTab,this.novedadnomiBeanSwingJInternalFrame.getContentPane());
				}

				//NovedadNomiJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.novedadnomiSessionBean.setEsGuardarRelacionado(false);
				this.novedadnomiBeanSwingJInternalFrame=null;//new NovedadNomiBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.novedadnomiSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteNovedadNomi) {
					this.jTabbedPaneRelacionesEmpleado.add("Novedad Nomis",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFramePrestamo(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.prestamoSessionBean=new PrestamoSessionBean();
		this.prestamoSessionBean.setConGuardarRelaciones(true);
		this.prestamoSessionBean.setEsGuardarRelacionado(true);

		this.prestamoBeanSwingJInternalFrame=null;//new PrestamoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.prestamoBeanSwingJInternalFramePopup=new PrestamoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.prestamoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.prestamoSessionBean.getEsGuardarRelacionado()) {

				PrestamoJInternalFrame.STIPO_TAMANIO_GENERAL=EmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;
				PrestamoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.prestamoSessionBean.setEsGuardarRelacionado(true);

				this.prestamoBeanSwingJInternalFrame=new PrestamoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,true,true,true,false);//false->4

				this.prestamoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.prestamoBeanSwingJInternalFrame.setprestamoSessionBean(this.prestamoSessionBean);

				//this.gridBagConstraintsEmpleado = new GridBagConstraints();
				//this.gridBagConstraintsEmpleado.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEmpleado.gridx = 0;
				//this.jContentPaneDetalleEmpleado.add(this.prestamoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEmpleado);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesFinformas_de_pagoEmpleado.add("Prestamos",this.prestamoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesFinformas_de_pagoEmpleado.setComponentAt(iIndexTab,this.prestamoBeanSwingJInternalFrame.getContentPane());
				}

				//PrestamoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.prestamoSessionBean.setEsGuardarRelacionado(false);
				this.prestamoBeanSwingJInternalFrame=null;//new PrestamoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.prestamoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorPartePrestamo) {
					this.jTabbedPaneRelacionesFinformas_de_pagoEmpleado.add("Prestamos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameProfesionEmplea(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.profesionempleaSessionBean=new ProfesionEmpleaSessionBean();
		this.profesionempleaSessionBean.setConGuardarRelaciones(false);
		this.profesionempleaSessionBean.setEsGuardarRelacionado(true);

		this.profesionempleaBeanSwingJInternalFrame=null;//new ProfesionEmpleaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.profesionempleaBeanSwingJInternalFramePopup=new ProfesionEmpleaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.profesionempleaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.profesionempleaSessionBean.getEsGuardarRelacionado()) {

				ProfesionEmpleaJInternalFrame.STIPO_TAMANIO_GENERAL=EmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;
				ProfesionEmpleaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.profesionempleaSessionBean.setEsGuardarRelacionado(true);

				this.profesionempleaBeanSwingJInternalFrame=new ProfesionEmpleaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.profesionempleaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.profesionempleaBeanSwingJInternalFrame.setprofesionempleaSessionBean(this.profesionempleaSessionBean);

				//this.gridBagConstraintsEmpleado = new GridBagConstraints();
				//this.gridBagConstraintsEmpleado.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEmpleado.gridx = 0;
				//this.jContentPaneDetalleEmpleado.add(this.profesionempleaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEmpleado);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEmpleado.add("Profesion Empleas",this.profesionempleaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEmpleado.setComponentAt(iIndexTab,this.profesionempleaBeanSwingJInternalFrame.getContentPane());
				}

				//ProfesionEmpleaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.profesionempleaSessionBean.setEsGuardarRelacionado(false);
				this.profesionempleaBeanSwingJInternalFrame=null;//new ProfesionEmpleaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.profesionempleaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteProfesionEmplea) {
					this.jTabbedPaneRelacionesEmpleado.add("Profesion Empleas",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameRasgoPersonal(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.rasgopersonalSessionBean=new RasgoPersonalSessionBean();
		this.rasgopersonalSessionBean.setConGuardarRelaciones(false);
		this.rasgopersonalSessionBean.setEsGuardarRelacionado(true);

		this.rasgopersonalBeanSwingJInternalFrame=null;//new RasgoPersonalBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.rasgopersonalBeanSwingJInternalFramePopup=new RasgoPersonalBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.rasgopersonalBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.rasgopersonalSessionBean.getEsGuardarRelacionado()) {

				RasgoPersonalJInternalFrame.STIPO_TAMANIO_GENERAL=EmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;
				RasgoPersonalJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.rasgopersonalSessionBean.setEsGuardarRelacionado(true);

				this.rasgopersonalBeanSwingJInternalFrame=new RasgoPersonalBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.rasgopersonalBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.rasgopersonalBeanSwingJInternalFrame.setrasgopersonalSessionBean(this.rasgopersonalSessionBean);

				//this.gridBagConstraintsEmpleado = new GridBagConstraints();
				//this.gridBagConstraintsEmpleado.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEmpleado.gridx = 0;
				//this.jContentPaneDetalleEmpleado.add(this.rasgopersonalBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEmpleado);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEmpleado.add("Rasgo Personales",this.rasgopersonalBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEmpleado.setComponentAt(iIndexTab,this.rasgopersonalBeanSwingJInternalFrame.getContentPane());
				}

				//RasgoPersonalJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.rasgopersonalSessionBean.setEsGuardarRelacionado(false);
				this.rasgopersonalBeanSwingJInternalFrame=null;//new RasgoPersonalBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.rasgopersonalSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteRasgoPersonal) {
					this.jTabbedPaneRelacionesEmpleado.add("Rasgo Personales",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameReferencia(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.referenciaSessionBean=new ReferenciaSessionBean();
		this.referenciaSessionBean.setConGuardarRelaciones(false);
		this.referenciaSessionBean.setEsGuardarRelacionado(true);

		this.referenciaBeanSwingJInternalFrame=null;//new ReferenciaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.referenciaBeanSwingJInternalFramePopup=new ReferenciaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.referenciaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.referenciaSessionBean.getEsGuardarRelacionado()) {

				ReferenciaJInternalFrame.STIPO_TAMANIO_GENERAL=EmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;
				ReferenciaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.referenciaSessionBean.setEsGuardarRelacionado(true);

				this.referenciaBeanSwingJInternalFrame=new ReferenciaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.referenciaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.referenciaBeanSwingJInternalFrame.setreferenciaSessionBean(this.referenciaSessionBean);

				//this.gridBagConstraintsEmpleado = new GridBagConstraints();
				//this.gridBagConstraintsEmpleado.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEmpleado.gridx = 0;
				//this.jContentPaneDetalleEmpleado.add(this.referenciaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEmpleado);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEmpleado.add("Referencias",this.referenciaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEmpleado.setComponentAt(iIndexTab,this.referenciaBeanSwingJInternalFrame.getContentPane());
				}

				//ReferenciaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.referenciaSessionBean.setEsGuardarRelacionado(false);
				this.referenciaBeanSwingJInternalFrame=null;//new ReferenciaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.referenciaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteReferencia) {
					this.jTabbedPaneRelacionesEmpleado.add("Referencias",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameRubroEmpleado(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.rubroempleadoSessionBean=new RubroEmpleadoSessionBean();
		this.rubroempleadoSessionBean.setConGuardarRelaciones(false);
		this.rubroempleadoSessionBean.setEsGuardarRelacionado(true);

		this.rubroempleadoBeanSwingJInternalFrame=null;//new RubroEmpleadoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.rubroempleadoBeanSwingJInternalFramePopup=new RubroEmpleadoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.rubroempleadoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.rubroempleadoSessionBean.getEsGuardarRelacionado()) {

				RubroEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL=EmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;
				RubroEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.rubroempleadoSessionBean.setEsGuardarRelacionado(true);

				this.rubroempleadoBeanSwingJInternalFrame=new RubroEmpleadoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.rubroempleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.rubroempleadoBeanSwingJInternalFrame.setrubroempleadoSessionBean(this.rubroempleadoSessionBean);

				//this.gridBagConstraintsEmpleado = new GridBagConstraints();
				//this.gridBagConstraintsEmpleado.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEmpleado.gridx = 0;
				//this.jContentPaneDetalleEmpleado.add(this.rubroempleadoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEmpleado);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEmpleado.add("Rubro Empleados",this.rubroempleadoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEmpleado.setComponentAt(iIndexTab,this.rubroempleadoBeanSwingJInternalFrame.getContentPane());
				}

				//RubroEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.rubroempleadoSessionBean.setEsGuardarRelacionado(false);
				this.rubroempleadoBeanSwingJInternalFrame=null;//new RubroEmpleadoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.rubroempleadoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteRubroEmpleado) {
					this.jTabbedPaneRelacionesEmpleado.add("Rubro Empleados",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameSeguro(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.seguroSessionBean=new SeguroSessionBean();
		this.seguroSessionBean.setConGuardarRelaciones(false);
		this.seguroSessionBean.setEsGuardarRelacionado(true);

		this.seguroBeanSwingJInternalFrame=null;//new SeguroBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.seguroBeanSwingJInternalFramePopup=new SeguroBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.seguroBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.seguroSessionBean.getEsGuardarRelacionado()) {

				SeguroJInternalFrame.STIPO_TAMANIO_GENERAL=EmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;
				SeguroJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.seguroSessionBean.setEsGuardarRelacionado(true);

				this.seguroBeanSwingJInternalFrame=new SeguroBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.seguroBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.seguroBeanSwingJInternalFrame.setseguroSessionBean(this.seguroSessionBean);

				//this.gridBagConstraintsEmpleado = new GridBagConstraints();
				//this.gridBagConstraintsEmpleado.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEmpleado.gridx = 0;
				//this.jContentPaneDetalleEmpleado.add(this.seguroBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEmpleado);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEmpleado.add("Seguros",this.seguroBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEmpleado.setComponentAt(iIndexTab,this.seguroBeanSwingJInternalFrame.getContentPane());
				}

				//SeguroJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.seguroSessionBean.setEsGuardarRelacionado(false);
				this.seguroBeanSwingJInternalFrame=null;//new SeguroBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.seguroSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteSeguro) {
					this.jTabbedPaneRelacionesEmpleado.add("Seguros",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameTallaVestido(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.tallavestidoSessionBean=new TallaVestidoSessionBean();
		this.tallavestidoSessionBean.setConGuardarRelaciones(false);
		this.tallavestidoSessionBean.setEsGuardarRelacionado(true);

		this.tallavestidoBeanSwingJInternalFrame=null;//new TallaVestidoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.tallavestidoBeanSwingJInternalFramePopup=new TallaVestidoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.tallavestidoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.tallavestidoSessionBean.getEsGuardarRelacionado()) {

				TallaVestidoJInternalFrame.STIPO_TAMANIO_GENERAL=EmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;
				TallaVestidoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.tallavestidoSessionBean.setEsGuardarRelacionado(true);

				this.tallavestidoBeanSwingJInternalFrame=new TallaVestidoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.tallavestidoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.tallavestidoBeanSwingJInternalFrame.settallavestidoSessionBean(this.tallavestidoSessionBean);

				//this.gridBagConstraintsEmpleado = new GridBagConstraints();
				//this.gridBagConstraintsEmpleado.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEmpleado.gridx = 0;
				//this.jContentPaneDetalleEmpleado.add(this.tallavestidoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEmpleado);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEmpleado.add("Talla Vestidos",this.tallavestidoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEmpleado.setComponentAt(iIndexTab,this.tallavestidoBeanSwingJInternalFrame.getContentPane());
				}

				//TallaVestidoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.tallavestidoSessionBean.setEsGuardarRelacionado(false);
				this.tallavestidoBeanSwingJInternalFrame=null;//new TallaVestidoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.tallavestidoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteTallaVestido) {
					this.jTabbedPaneRelacionesEmpleado.add("Talla Vestidos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameTelefono_NM(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.telefono_nmSessionBean=new Telefono_NMSessionBean();
		this.telefono_nmSessionBean.setConGuardarRelaciones(false);
		this.telefono_nmSessionBean.setEsGuardarRelacionado(true);

		this.telefono_nmBeanSwingJInternalFrame=null;//new Telefono_NMBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.telefono_nmBeanSwingJInternalFramePopup=new Telefono_NMBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.telefono_nmBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.telefono_nmSessionBean.getEsGuardarRelacionado()) {

				Telefono_NMJInternalFrame.STIPO_TAMANIO_GENERAL=EmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;
				Telefono_NMJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.telefono_nmSessionBean.setEsGuardarRelacionado(true);

				this.telefono_nmBeanSwingJInternalFrame=new Telefono_NMBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.telefono_nmBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.telefono_nmBeanSwingJInternalFrame.settelefono_nmSessionBean(this.telefono_nmSessionBean);

				//this.gridBagConstraintsEmpleado = new GridBagConstraints();
				//this.gridBagConstraintsEmpleado.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEmpleado.gridx = 0;
				//this.jContentPaneDetalleEmpleado.add(this.telefono_nmBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEmpleado);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEmpleado.add("Telefono_ N Mes",this.telefono_nmBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEmpleado.setComponentAt(iIndexTab,this.telefono_nmBeanSwingJInternalFrame.getContentPane());
				}

				//Telefono_NMJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.telefono_nmSessionBean.setEsGuardarRelacionado(false);
				this.telefono_nmBeanSwingJInternalFrame=null;//new Telefono_NMBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.telefono_nmSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteTelefono_NM) {
					this.jTabbedPaneRelacionesEmpleado.add("Telefono_ N Mes",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameVisa(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.visaSessionBean=new VisaSessionBean();
		this.visaSessionBean.setConGuardarRelaciones(false);
		this.visaSessionBean.setEsGuardarRelacionado(true);

		this.visaBeanSwingJInternalFrame=null;//new VisaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.visaBeanSwingJInternalFramePopup=new VisaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.visaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.visaSessionBean.getEsGuardarRelacionado()) {

				VisaJInternalFrame.STIPO_TAMANIO_GENERAL=EmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;
				VisaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.visaSessionBean.setEsGuardarRelacionado(true);

				this.visaBeanSwingJInternalFrame=new VisaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.visaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.visaBeanSwingJInternalFrame.setvisaSessionBean(this.visaSessionBean);

				//this.gridBagConstraintsEmpleado = new GridBagConstraints();
				//this.gridBagConstraintsEmpleado.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEmpleado.gridx = 0;
				//this.jContentPaneDetalleEmpleado.add(this.visaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEmpleado);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEmpleado.add("Visas",this.visaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEmpleado.setComponentAt(iIndexTab,this.visaBeanSwingJInternalFrame.getContentPane());
				}

				//VisaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.visaSessionBean.setEsGuardarRelacionado(false);
				this.visaBeanSwingJInternalFrame=null;//new VisaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.visaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteVisa) {
					this.jTabbedPaneRelacionesEmpleado.add("Visas",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarCargaFamiliar_NMBeanSwingJInternalFrame(List<Empleado> empleados,Empleado empleado,CargaFamiliar_NMBeanSwingJInternalFrame cargafamiliar_nmBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//cargafamiliar_nmBeanSwingJInternalFrame=new CargaFamiliar_NMBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					cargafamiliar_nmBeanSwingJInternalFrame.getCargaFamiliar_NMLogic().setConnexion(this.empleadoLogic.getConnexion());

					cargafamiliar_nmBeanSwingJInternalFrame.setempleadosForeignKey(empleados);
					cargafamiliar_nmBeanSwingJInternalFrame.setempleadoForeignKey(empleado);
					cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nmSessionBean.setisBusquedaDesdeForeignKeySesionEmpleado(true);
					cargafamiliar_nmBeanSwingJInternalFrame.cargafamiliar_nmSessionBean.setlidEmpleadoActual(empleado.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					cargafamiliar_nmBeanSwingJInternalFrame.cargarCombosForeignKeyCargaFamiliar_NM(cargafamiliar_nmBeanSwingJInternalFrame.isCargarCombosDependencia);
					cargafamiliar_nmBeanSwingJInternalFrame.setVisibilidadBusquedasParaEmpleado(true);
					cargafamiliar_nmBeanSwingJInternalFrame.setid_empleadoFK_IdEmpleado(empleado.getId());

					if(!this.conCargarFormDetalle) {
						cargafamiliar_nmBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					cargafamiliar_nmBeanSwingJInternalFrame.setSelectedItemCombosFrameEmpleadoForeignKey(empleado,1,false,true,true);
					cargafamiliar_nmBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					cargafamiliar_nmBeanSwingJInternalFrame.procesarBusqueda("FK_IdEmpleado");
					cargafamiliar_nmBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEmpleado");
					cargafamiliar_nmBeanSwingJInternalFrame.inicializarActualizarBindingTablaCargaFamiliar_NM(true);
					cargafamiliar_nmBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesCargaFamiliar_NM("n",cargafamiliar_nmBeanSwingJInternalFrame.isGuardarCambiosEnLote, cargafamiliar_nmBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					cargafamiliar_nmBeanSwingJInternalFrame.setAutoscrolls(true);
					cargafamiliar_nmBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						cargafamiliar_nmBeanSwingJInternalFrame.actualizarEstadoPanelsCargaFamiliar_NM("relacionado");
					} else {
						cargafamiliar_nmBeanSwingJInternalFrame.actualizarEstadoPanelsCargaFamiliar_NM("no_relacionado");
					}

					cargafamiliar_nmBeanSwingJInternalFrame.getjButtonRecargarInformacionCargaFamiliar_NM().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarCursoBeanSwingJInternalFrame(List<Empleado> empleados,Empleado empleado,CursoBeanSwingJInternalFrame cursoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//cursoBeanSwingJInternalFrame=new CursoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					cursoBeanSwingJInternalFrame.getCursoLogic().setConnexion(this.empleadoLogic.getConnexion());

					cursoBeanSwingJInternalFrame.setempleadosForeignKey(empleados);
					cursoBeanSwingJInternalFrame.setempleadoForeignKey(empleado);
					cursoBeanSwingJInternalFrame.cursoSessionBean.setisBusquedaDesdeForeignKeySesionEmpleado(true);
					cursoBeanSwingJInternalFrame.cursoSessionBean.setlidEmpleadoActual(empleado.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					cursoBeanSwingJInternalFrame.cargarCombosForeignKeyCurso(cursoBeanSwingJInternalFrame.isCargarCombosDependencia);
					cursoBeanSwingJInternalFrame.setVisibilidadBusquedasParaEmpleado(true);
					cursoBeanSwingJInternalFrame.setid_empleadoFK_IdEmpleado(empleado.getId());

					if(!this.conCargarFormDetalle) {
						cursoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					cursoBeanSwingJInternalFrame.setSelectedItemCombosFrameEmpleadoForeignKey(empleado,1,false,true,true);
					cursoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					cursoBeanSwingJInternalFrame.procesarBusqueda("FK_IdEmpleado");
					cursoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEmpleado");
					cursoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCurso(true);
					cursoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesCurso("n",cursoBeanSwingJInternalFrame.isGuardarCambiosEnLote, cursoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					cursoBeanSwingJInternalFrame.setAutoscrolls(true);
					cursoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						cursoBeanSwingJInternalFrame.actualizarEstadoPanelsCurso("relacionado");
					} else {
						cursoBeanSwingJInternalFrame.actualizarEstadoPanelsCurso("no_relacionado");
					}

					cursoBeanSwingJInternalFrame.getjButtonRecargarInformacionCurso().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarPrestamoBeanSwingJInternalFrame(List<Empleado> empleados,Empleado empleado,PrestamoBeanSwingJInternalFrame prestamoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//prestamoBeanSwingJInternalFrame=new PrestamoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					prestamoBeanSwingJInternalFrame.getPrestamoLogic().setConnexion(this.empleadoLogic.getConnexion());

					prestamoBeanSwingJInternalFrame.setempleadosForeignKey(empleados);
					prestamoBeanSwingJInternalFrame.setempleadoForeignKey(empleado);
					prestamoBeanSwingJInternalFrame.prestamoSessionBean.setisBusquedaDesdeForeignKeySesionEmpleado(true);
					prestamoBeanSwingJInternalFrame.prestamoSessionBean.setlidEmpleadoActual(empleado.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					prestamoBeanSwingJInternalFrame.cargarCombosForeignKeyPrestamo(prestamoBeanSwingJInternalFrame.isCargarCombosDependencia);
					prestamoBeanSwingJInternalFrame.setVisibilidadBusquedasParaEmpleado(true);
					prestamoBeanSwingJInternalFrame.setid_empleadoFK_IdEmpleado(empleado.getId());

					if(!this.conCargarFormDetalle) {
						prestamoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					prestamoBeanSwingJInternalFrame.setSelectedItemCombosFrameEmpleadoForeignKey(empleado,1,false,true,true);
					prestamoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					prestamoBeanSwingJInternalFrame.procesarBusqueda("FK_IdEmpleado");
					prestamoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEmpleado");
					prestamoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPrestamo(true);
					prestamoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesPrestamo("n",prestamoBeanSwingJInternalFrame.isGuardarCambiosEnLote, prestamoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					prestamoBeanSwingJInternalFrame.setAutoscrolls(true);
					prestamoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						prestamoBeanSwingJInternalFrame.actualizarEstadoPanelsPrestamo("relacionado");
					} else {
						prestamoBeanSwingJInternalFrame.actualizarEstadoPanelsPrestamo("no_relacionado");
					}

					prestamoBeanSwingJInternalFrame.getjButtonRecargarInformacionPrestamo().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarEmpleadoIdiomaBeanSwingJInternalFrame(List<Empleado> empleados,Empleado empleado,EmpleadoIdiomaBeanSwingJInternalFrame empleadoidiomaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//empleadoidiomaBeanSwingJInternalFrame=new EmpleadoIdiomaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					empleadoidiomaBeanSwingJInternalFrame.getEmpleadoIdiomaLogic().setConnexion(this.empleadoLogic.getConnexion());

					empleadoidiomaBeanSwingJInternalFrame.setempleadosForeignKey(empleados);
					empleadoidiomaBeanSwingJInternalFrame.setempleadoForeignKey(empleado);
					empleadoidiomaBeanSwingJInternalFrame.empleadoidiomaSessionBean.setisBusquedaDesdeForeignKeySesionEmpleado(true);
					empleadoidiomaBeanSwingJInternalFrame.empleadoidiomaSessionBean.setlidEmpleadoActual(empleado.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					empleadoidiomaBeanSwingJInternalFrame.cargarCombosForeignKeyEmpleadoIdioma(empleadoidiomaBeanSwingJInternalFrame.isCargarCombosDependencia);
					empleadoidiomaBeanSwingJInternalFrame.setVisibilidadBusquedasParaEmpleado(true);
					empleadoidiomaBeanSwingJInternalFrame.setid_empleadoFK_IdEmpleado(empleado.getId());

					if(!this.conCargarFormDetalle) {
						empleadoidiomaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					empleadoidiomaBeanSwingJInternalFrame.setSelectedItemCombosFrameEmpleadoForeignKey(empleado,1,false,true,true);
					empleadoidiomaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					empleadoidiomaBeanSwingJInternalFrame.procesarBusqueda("FK_IdEmpleado");
					empleadoidiomaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEmpleado");
					empleadoidiomaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleadoIdioma(true);
					empleadoidiomaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesEmpleadoIdioma("n",empleadoidiomaBeanSwingJInternalFrame.isGuardarCambiosEnLote, empleadoidiomaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					empleadoidiomaBeanSwingJInternalFrame.setAutoscrolls(true);
					empleadoidiomaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						empleadoidiomaBeanSwingJInternalFrame.actualizarEstadoPanelsEmpleadoIdioma("relacionado");
					} else {
						empleadoidiomaBeanSwingJInternalFrame.actualizarEstadoPanelsEmpleadoIdioma("no_relacionado");
					}

					empleadoidiomaBeanSwingJInternalFrame.getjButtonRecargarInformacionEmpleadoIdioma().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarHistorialPagoMesNomiBeanSwingJInternalFrame(List<Empleado> empleados,Empleado empleado,HistorialPagoMesNomiBeanSwingJInternalFrame historialpagomesnomiBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//historialpagomesnomiBeanSwingJInternalFrame=new HistorialPagoMesNomiBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					historialpagomesnomiBeanSwingJInternalFrame.getHistorialPagoMesNomiLogic().setConnexion(this.empleadoLogic.getConnexion());

					historialpagomesnomiBeanSwingJInternalFrame.setempleadosForeignKey(empleados);
					historialpagomesnomiBeanSwingJInternalFrame.setempleadoForeignKey(empleado);
					historialpagomesnomiBeanSwingJInternalFrame.historialpagomesnomiSessionBean.setisBusquedaDesdeForeignKeySesionEmpleado(true);
					historialpagomesnomiBeanSwingJInternalFrame.historialpagomesnomiSessionBean.setlidEmpleadoActual(empleado.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					historialpagomesnomiBeanSwingJInternalFrame.cargarCombosForeignKeyHistorialPagoMesNomi(historialpagomesnomiBeanSwingJInternalFrame.isCargarCombosDependencia);
					historialpagomesnomiBeanSwingJInternalFrame.setVisibilidadBusquedasParaEmpleado(true);
					historialpagomesnomiBeanSwingJInternalFrame.setid_empleadoFK_IdEmpleado(empleado.getId());

					if(!this.conCargarFormDetalle) {
						historialpagomesnomiBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					historialpagomesnomiBeanSwingJInternalFrame.setSelectedItemCombosFrameEmpleadoForeignKey(empleado,1,false,true,true);
					historialpagomesnomiBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					historialpagomesnomiBeanSwingJInternalFrame.procesarBusqueda("FK_IdEmpleado");
					historialpagomesnomiBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEmpleado");
					historialpagomesnomiBeanSwingJInternalFrame.inicializarActualizarBindingTablaHistorialPagoMesNomi(true);
					historialpagomesnomiBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesHistorialPagoMesNomi("n",historialpagomesnomiBeanSwingJInternalFrame.isGuardarCambiosEnLote, historialpagomesnomiBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					historialpagomesnomiBeanSwingJInternalFrame.setAutoscrolls(true);
					historialpagomesnomiBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						historialpagomesnomiBeanSwingJInternalFrame.actualizarEstadoPanelsHistorialPagoMesNomi("relacionado");
					} else {
						historialpagomesnomiBeanSwingJInternalFrame.actualizarEstadoPanelsHistorialPagoMesNomi("no_relacionado");
					}

					historialpagomesnomiBeanSwingJInternalFrame.getjButtonRecargarInformacionHistorialPagoMesNomi().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarEmpleadoImpuestoRentaBeanSwingJInternalFrame(List<Empleado> empleados,Empleado empleado,EmpleadoImpuestoRentaBeanSwingJInternalFrame empleadoimpuestorentaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//empleadoimpuestorentaBeanSwingJInternalFrame=new EmpleadoImpuestoRentaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					empleadoimpuestorentaBeanSwingJInternalFrame.getEmpleadoImpuestoRentaLogic().setConnexion(this.empleadoLogic.getConnexion());

					empleadoimpuestorentaBeanSwingJInternalFrame.setempleadosForeignKey(empleados);
					empleadoimpuestorentaBeanSwingJInternalFrame.setempleadoForeignKey(empleado);
					empleadoimpuestorentaBeanSwingJInternalFrame.empleadoimpuestorentaSessionBean.setisBusquedaDesdeForeignKeySesionEmpleado(true);
					empleadoimpuestorentaBeanSwingJInternalFrame.empleadoimpuestorentaSessionBean.setlidEmpleadoActual(empleado.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					empleadoimpuestorentaBeanSwingJInternalFrame.cargarCombosForeignKeyEmpleadoImpuestoRenta(empleadoimpuestorentaBeanSwingJInternalFrame.isCargarCombosDependencia);
					empleadoimpuestorentaBeanSwingJInternalFrame.setVisibilidadBusquedasParaEmpleado(true);
					empleadoimpuestorentaBeanSwingJInternalFrame.setid_empleadoFK_IdEmpleado(empleado.getId());

					if(!this.conCargarFormDetalle) {
						empleadoimpuestorentaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					empleadoimpuestorentaBeanSwingJInternalFrame.setSelectedItemCombosFrameEmpleadoForeignKey(empleado,1,false,true,true);
					empleadoimpuestorentaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					empleadoimpuestorentaBeanSwingJInternalFrame.procesarBusqueda("FK_IdEmpleado");
					empleadoimpuestorentaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEmpleado");
					empleadoimpuestorentaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleadoImpuestoRenta(true);
					empleadoimpuestorentaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesEmpleadoImpuestoRenta("n",empleadoimpuestorentaBeanSwingJInternalFrame.isGuardarCambiosEnLote, empleadoimpuestorentaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					empleadoimpuestorentaBeanSwingJInternalFrame.setAutoscrolls(true);
					empleadoimpuestorentaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						empleadoimpuestorentaBeanSwingJInternalFrame.actualizarEstadoPanelsEmpleadoImpuestoRenta("relacionado");
					} else {
						empleadoimpuestorentaBeanSwingJInternalFrame.actualizarEstadoPanelsEmpleadoImpuestoRenta("no_relacionado");
					}

					empleadoimpuestorentaBeanSwingJInternalFrame.getjButtonRecargarInformacionEmpleadoImpuestoRenta().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarDatoGeneralEmpleadoBeanSwingJInternalFrame(List<Empleado> empleados,Empleado empleado,DatoGeneralEmpleadoBeanSwingJInternalFrame datogeneralempleadoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//datogeneralempleadoBeanSwingJInternalFrame=new DatoGeneralEmpleadoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					datogeneralempleadoBeanSwingJInternalFrame.getDatoGeneralEmpleadoLogic().setConnexion(this.empleadoLogic.getConnexion());

					datogeneralempleadoBeanSwingJInternalFrame.setempleadosForeignKey(empleados);
					datogeneralempleadoBeanSwingJInternalFrame.setempleadoForeignKey(empleado);
					datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoSessionBean.setisBusquedaDesdeForeignKeySesionEmpleado(true);
					datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoSessionBean.setlidEmpleadoActual(empleado.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					datogeneralempleadoBeanSwingJInternalFrame.cargarCombosForeignKeyDatoGeneralEmpleado(datogeneralempleadoBeanSwingJInternalFrame.isCargarCombosDependencia);
					datogeneralempleadoBeanSwingJInternalFrame.setVisibilidadBusquedasParaEmpleado(true);
					datogeneralempleadoBeanSwingJInternalFrame.setid_empleadoFK_IdEmpleado(empleado.getId());

					if(!this.conCargarFormDetalle) {
						datogeneralempleadoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					datogeneralempleadoBeanSwingJInternalFrame.setSelectedItemCombosFrameEmpleadoForeignKey(empleado,1,false,true,true);
					datogeneralempleadoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					datogeneralempleadoBeanSwingJInternalFrame.procesarBusqueda("FK_IdEmpleado");
					datogeneralempleadoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEmpleado");
					datogeneralempleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDatoGeneralEmpleado(true);
					datogeneralempleadoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDatoGeneralEmpleado("n",datogeneralempleadoBeanSwingJInternalFrame.isGuardarCambiosEnLote, datogeneralempleadoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					datogeneralempleadoBeanSwingJInternalFrame.inicializarActualizarBindingDatoGeneralEmpleado(false);
					datogeneralempleadoBeanSwingJInternalFrame.setAutoscrolls(true);
					datogeneralempleadoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						datogeneralempleadoBeanSwingJInternalFrame.actualizarEstadoPanelsDatoGeneralEmpleado("relacionado");
					} else {
						datogeneralempleadoBeanSwingJInternalFrame.actualizarEstadoPanelsDatoGeneralEmpleado("no_relacionado");
					}

					datogeneralempleadoBeanSwingJInternalFrame.getjButtonRecargarInformacionDatoGeneralEmpleado().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarAreaBeanSwingJInternalFrame(List<Empleado> empleados,Empleado empleado,AreaBeanSwingJInternalFrame areaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//areaBeanSwingJInternalFrame=new AreaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					areaBeanSwingJInternalFrame.getAreaLogic().setConnexion(this.empleadoLogic.getConnexion());

					areaBeanSwingJInternalFrame.setempleadosForeignKey(empleados);
					areaBeanSwingJInternalFrame.setempleadoForeignKey(empleado);
					areaBeanSwingJInternalFrame.areaSessionBean.setisBusquedaDesdeForeignKeySesionEmpleado(true);
					areaBeanSwingJInternalFrame.areaSessionBean.setlidEmpleadoActual(empleado.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					areaBeanSwingJInternalFrame.cargarCombosForeignKeyArea(areaBeanSwingJInternalFrame.isCargarCombosDependencia);
					areaBeanSwingJInternalFrame.setVisibilidadBusquedasParaEmpleado(true);
					areaBeanSwingJInternalFrame.setid_empleadoFK_IdEmpleado(empleado.getId());

					if(!this.conCargarFormDetalle) {
						areaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					areaBeanSwingJInternalFrame.setSelectedItemCombosFrameEmpleadoForeignKey(empleado,1,false,true,true);
					areaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					areaBeanSwingJInternalFrame.procesarBusqueda("FK_IdEmpleado");
					areaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEmpleado");
					areaBeanSwingJInternalFrame.inicializarActualizarBindingTablaArea(true);
					areaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesArea("n",areaBeanSwingJInternalFrame.isGuardarCambiosEnLote, areaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					areaBeanSwingJInternalFrame.setAutoscrolls(true);
					areaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						areaBeanSwingJInternalFrame.actualizarEstadoPanelsArea("relacionado");
					} else {
						areaBeanSwingJInternalFrame.actualizarEstadoPanelsArea("no_relacionado");
					}

					areaBeanSwingJInternalFrame.getjButtonRecargarInformacionArea().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarGastoEmpleadoBeanSwingJInternalFrame(List<Empleado> empleados,Empleado empleado,GastoEmpleadoBeanSwingJInternalFrame gastoempleadoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//gastoempleadoBeanSwingJInternalFrame=new GastoEmpleadoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					gastoempleadoBeanSwingJInternalFrame.getGastoEmpleadoLogic().setConnexion(this.empleadoLogic.getConnexion());

					gastoempleadoBeanSwingJInternalFrame.setempleadosForeignKey(empleados);
					gastoempleadoBeanSwingJInternalFrame.setempleadoForeignKey(empleado);
					gastoempleadoBeanSwingJInternalFrame.gastoempleadoSessionBean.setisBusquedaDesdeForeignKeySesionEmpleado(true);
					gastoempleadoBeanSwingJInternalFrame.gastoempleadoSessionBean.setlidEmpleadoActual(empleado.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					gastoempleadoBeanSwingJInternalFrame.cargarCombosForeignKeyGastoEmpleado(gastoempleadoBeanSwingJInternalFrame.isCargarCombosDependencia);
					gastoempleadoBeanSwingJInternalFrame.setVisibilidadBusquedasParaEmpleado(true);
					gastoempleadoBeanSwingJInternalFrame.setid_empleadoFK_IdEmpleado(empleado.getId());

					if(!this.conCargarFormDetalle) {
						gastoempleadoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					gastoempleadoBeanSwingJInternalFrame.setSelectedItemCombosFrameEmpleadoForeignKey(empleado,1,false,true,true);
					gastoempleadoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					gastoempleadoBeanSwingJInternalFrame.procesarBusqueda("FK_IdEmpleado");
					gastoempleadoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEmpleado");
					gastoempleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaGastoEmpleado(true);
					gastoempleadoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesGastoEmpleado("n",gastoempleadoBeanSwingJInternalFrame.isGuardarCambiosEnLote, gastoempleadoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					gastoempleadoBeanSwingJInternalFrame.setAutoscrolls(true);
					gastoempleadoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						gastoempleadoBeanSwingJInternalFrame.actualizarEstadoPanelsGastoEmpleado("relacionado");
					} else {
						gastoempleadoBeanSwingJInternalFrame.actualizarEstadoPanelsGastoEmpleado("no_relacionado");
					}

					gastoempleadoBeanSwingJInternalFrame.getjButtonRecargarInformacionGastoEmpleado().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarEmpleadoHobbyBeanSwingJInternalFrame(List<Empleado> empleados,Empleado empleado,EmpleadoHobbyBeanSwingJInternalFrame empleadohobbyBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//empleadohobbyBeanSwingJInternalFrame=new EmpleadoHobbyBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					empleadohobbyBeanSwingJInternalFrame.getEmpleadoHobbyLogic().setConnexion(this.empleadoLogic.getConnexion());

					empleadohobbyBeanSwingJInternalFrame.setempleadosForeignKey(empleados);
					empleadohobbyBeanSwingJInternalFrame.setempleadoForeignKey(empleado);
					empleadohobbyBeanSwingJInternalFrame.empleadohobbySessionBean.setisBusquedaDesdeForeignKeySesionEmpleado(true);
					empleadohobbyBeanSwingJInternalFrame.empleadohobbySessionBean.setlidEmpleadoActual(empleado.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					empleadohobbyBeanSwingJInternalFrame.cargarCombosForeignKeyEmpleadoHobby(empleadohobbyBeanSwingJInternalFrame.isCargarCombosDependencia);
					empleadohobbyBeanSwingJInternalFrame.setVisibilidadBusquedasParaEmpleado(true);
					empleadohobbyBeanSwingJInternalFrame.setid_empleadoFK_IdEmpleado(empleado.getId());

					if(!this.conCargarFormDetalle) {
						empleadohobbyBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					empleadohobbyBeanSwingJInternalFrame.setSelectedItemCombosFrameEmpleadoForeignKey(empleado,1,false,true,true);
					empleadohobbyBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					empleadohobbyBeanSwingJInternalFrame.procesarBusqueda("FK_IdEmpleado");
					empleadohobbyBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEmpleado");
					empleadohobbyBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleadoHobby(true);
					empleadohobbyBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesEmpleadoHobby("n",empleadohobbyBeanSwingJInternalFrame.isGuardarCambiosEnLote, empleadohobbyBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					empleadohobbyBeanSwingJInternalFrame.setAutoscrolls(true);
					empleadohobbyBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						empleadohobbyBeanSwingJInternalFrame.actualizarEstadoPanelsEmpleadoHobby("relacionado");
					} else {
						empleadohobbyBeanSwingJInternalFrame.actualizarEstadoPanelsEmpleadoHobby("no_relacionado");
					}

					empleadohobbyBeanSwingJInternalFrame.getjButtonRecargarInformacionEmpleadoHobby().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarEmpleadoEMailBeanSwingJInternalFrame(List<Empleado> empleados,Empleado empleado,EmpleadoEMailBeanSwingJInternalFrame empleadoemailBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//empleadoemailBeanSwingJInternalFrame=new EmpleadoEMailBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					empleadoemailBeanSwingJInternalFrame.getEmpleadoEMailLogic().setConnexion(this.empleadoLogic.getConnexion());

					empleadoemailBeanSwingJInternalFrame.setempleadosForeignKey(empleados);
					empleadoemailBeanSwingJInternalFrame.setempleadoForeignKey(empleado);
					empleadoemailBeanSwingJInternalFrame.empleadoemailSessionBean.setisBusquedaDesdeForeignKeySesionEmpleado(true);
					empleadoemailBeanSwingJInternalFrame.empleadoemailSessionBean.setlidEmpleadoActual(empleado.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					empleadoemailBeanSwingJInternalFrame.cargarCombosForeignKeyEmpleadoEMail(empleadoemailBeanSwingJInternalFrame.isCargarCombosDependencia);
					empleadoemailBeanSwingJInternalFrame.setVisibilidadBusquedasParaEmpleado(true);
					empleadoemailBeanSwingJInternalFrame.setid_empleadoFK_IdEmpleado(empleado.getId());

					if(!this.conCargarFormDetalle) {
						empleadoemailBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					empleadoemailBeanSwingJInternalFrame.setSelectedItemCombosFrameEmpleadoForeignKey(empleado,1,false,true,true);
					empleadoemailBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					empleadoemailBeanSwingJInternalFrame.procesarBusqueda("FK_IdEmpleado");
					empleadoemailBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEmpleado");
					empleadoemailBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleadoEMail(true);
					empleadoemailBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesEmpleadoEMail("n",empleadoemailBeanSwingJInternalFrame.isGuardarCambiosEnLote, empleadoemailBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					empleadoemailBeanSwingJInternalFrame.setAutoscrolls(true);
					empleadoemailBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						empleadoemailBeanSwingJInternalFrame.actualizarEstadoPanelsEmpleadoEMail("relacionado");
					} else {
						empleadoemailBeanSwingJInternalFrame.actualizarEstadoPanelsEmpleadoEMail("no_relacionado");
					}

					empleadoemailBeanSwingJInternalFrame.getjButtonRecargarInformacionEmpleadoEMail().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarRasgoPersonalBeanSwingJInternalFrame(List<Empleado> empleados,Empleado empleado,RasgoPersonalBeanSwingJInternalFrame rasgopersonalBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//rasgopersonalBeanSwingJInternalFrame=new RasgoPersonalBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					rasgopersonalBeanSwingJInternalFrame.getRasgoPersonalLogic().setConnexion(this.empleadoLogic.getConnexion());

					rasgopersonalBeanSwingJInternalFrame.setempleadosForeignKey(empleados);
					rasgopersonalBeanSwingJInternalFrame.setempleadoForeignKey(empleado);
					rasgopersonalBeanSwingJInternalFrame.rasgopersonalSessionBean.setisBusquedaDesdeForeignKeySesionEmpleado(true);
					rasgopersonalBeanSwingJInternalFrame.rasgopersonalSessionBean.setlidEmpleadoActual(empleado.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					rasgopersonalBeanSwingJInternalFrame.cargarCombosForeignKeyRasgoPersonal(rasgopersonalBeanSwingJInternalFrame.isCargarCombosDependencia);
					rasgopersonalBeanSwingJInternalFrame.setVisibilidadBusquedasParaEmpleado(true);
					rasgopersonalBeanSwingJInternalFrame.setid_empleadoFK_IdEmpleado(empleado.getId());

					if(!this.conCargarFormDetalle) {
						rasgopersonalBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					rasgopersonalBeanSwingJInternalFrame.setSelectedItemCombosFrameEmpleadoForeignKey(empleado,1,false,true,true);
					rasgopersonalBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					rasgopersonalBeanSwingJInternalFrame.procesarBusqueda("FK_IdEmpleado");
					rasgopersonalBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEmpleado");
					rasgopersonalBeanSwingJInternalFrame.inicializarActualizarBindingTablaRasgoPersonal(true);
					rasgopersonalBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesRasgoPersonal("n",rasgopersonalBeanSwingJInternalFrame.isGuardarCambiosEnLote, rasgopersonalBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					rasgopersonalBeanSwingJInternalFrame.setAutoscrolls(true);
					rasgopersonalBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						rasgopersonalBeanSwingJInternalFrame.actualizarEstadoPanelsRasgoPersonal("relacionado");
					} else {
						rasgopersonalBeanSwingJInternalFrame.actualizarEstadoPanelsRasgoPersonal("no_relacionado");
					}

					rasgopersonalBeanSwingJInternalFrame.getjButtonRecargarInformacionRasgoPersonal().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarReferenciaBeanSwingJInternalFrame(List<Empleado> empleados,Empleado empleado,ReferenciaBeanSwingJInternalFrame referenciaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//referenciaBeanSwingJInternalFrame=new ReferenciaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					referenciaBeanSwingJInternalFrame.getReferenciaLogic().setConnexion(this.empleadoLogic.getConnexion());

					referenciaBeanSwingJInternalFrame.setempleadosForeignKey(empleados);
					referenciaBeanSwingJInternalFrame.setempleadoForeignKey(empleado);
					referenciaBeanSwingJInternalFrame.referenciaSessionBean.setisBusquedaDesdeForeignKeySesionEmpleado(true);
					referenciaBeanSwingJInternalFrame.referenciaSessionBean.setlidEmpleadoActual(empleado.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					referenciaBeanSwingJInternalFrame.cargarCombosForeignKeyReferencia(referenciaBeanSwingJInternalFrame.isCargarCombosDependencia);
					referenciaBeanSwingJInternalFrame.setVisibilidadBusquedasParaEmpleado(true);
					referenciaBeanSwingJInternalFrame.setid_empleadoFK_IdEmpleado(empleado.getId());

					if(!this.conCargarFormDetalle) {
						referenciaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					referenciaBeanSwingJInternalFrame.setSelectedItemCombosFrameEmpleadoForeignKey(empleado,1,false,true,true);
					referenciaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					referenciaBeanSwingJInternalFrame.procesarBusqueda("FK_IdEmpleado");
					referenciaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEmpleado");
					referenciaBeanSwingJInternalFrame.inicializarActualizarBindingTablaReferencia(true);
					referenciaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesReferencia("n",referenciaBeanSwingJInternalFrame.isGuardarCambiosEnLote, referenciaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					referenciaBeanSwingJInternalFrame.setAutoscrolls(true);
					referenciaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						referenciaBeanSwingJInternalFrame.actualizarEstadoPanelsReferencia("relacionado");
					} else {
						referenciaBeanSwingJInternalFrame.actualizarEstadoPanelsReferencia("no_relacionado");
					}

					referenciaBeanSwingJInternalFrame.getjButtonRecargarInformacionReferencia().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarTelefono_NMBeanSwingJInternalFrame(List<Empleado> empleados,Empleado empleado,Telefono_NMBeanSwingJInternalFrame telefono_nmBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//telefono_nmBeanSwingJInternalFrame=new Telefono_NMBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					telefono_nmBeanSwingJInternalFrame.getTelefono_NMLogic().setConnexion(this.empleadoLogic.getConnexion());

					telefono_nmBeanSwingJInternalFrame.setempleadosForeignKey(empleados);
					telefono_nmBeanSwingJInternalFrame.setempleadoForeignKey(empleado);
					telefono_nmBeanSwingJInternalFrame.telefono_nmSessionBean.setisBusquedaDesdeForeignKeySesionEmpleado(true);
					telefono_nmBeanSwingJInternalFrame.telefono_nmSessionBean.setlidEmpleadoActual(empleado.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					telefono_nmBeanSwingJInternalFrame.cargarCombosForeignKeyTelefono_NM(telefono_nmBeanSwingJInternalFrame.isCargarCombosDependencia);
					telefono_nmBeanSwingJInternalFrame.setVisibilidadBusquedasParaEmpleado(true);
					telefono_nmBeanSwingJInternalFrame.setid_empleadoFK_IdEmpleado(empleado.getId());

					if(!this.conCargarFormDetalle) {
						telefono_nmBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					telefono_nmBeanSwingJInternalFrame.setSelectedItemCombosFrameEmpleadoForeignKey(empleado,1,false,true,true);
					telefono_nmBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					telefono_nmBeanSwingJInternalFrame.procesarBusqueda("FK_IdEmpleado");
					telefono_nmBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEmpleado");
					telefono_nmBeanSwingJInternalFrame.inicializarActualizarBindingTablaTelefono_NM(true);
					telefono_nmBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesTelefono_NM("n",telefono_nmBeanSwingJInternalFrame.isGuardarCambiosEnLote, telefono_nmBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					telefono_nmBeanSwingJInternalFrame.setAutoscrolls(true);
					telefono_nmBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						telefono_nmBeanSwingJInternalFrame.actualizarEstadoPanelsTelefono_NM("relacionado");
					} else {
						telefono_nmBeanSwingJInternalFrame.actualizarEstadoPanelsTelefono_NM("no_relacionado");
					}

					telefono_nmBeanSwingJInternalFrame.getjButtonRecargarInformacionTelefono_NM().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarNovedadBeanSwingJInternalFrame(List<Empleado> empleados,Empleado empleado,NovedadBeanSwingJInternalFrame novedadBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//novedadBeanSwingJInternalFrame=new NovedadBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					novedadBeanSwingJInternalFrame.getNovedadLogic().setConnexion(this.empleadoLogic.getConnexion());

					novedadBeanSwingJInternalFrame.setempleadosForeignKey(empleados);
					novedadBeanSwingJInternalFrame.setempleadoForeignKey(empleado);
					novedadBeanSwingJInternalFrame.novedadSessionBean.setisBusquedaDesdeForeignKeySesionEmpleado(true);
					novedadBeanSwingJInternalFrame.novedadSessionBean.setlidEmpleadoActual(empleado.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					novedadBeanSwingJInternalFrame.cargarCombosForeignKeyNovedad(novedadBeanSwingJInternalFrame.isCargarCombosDependencia);
					novedadBeanSwingJInternalFrame.setVisibilidadBusquedasParaEmpleado(true);
					novedadBeanSwingJInternalFrame.setid_empleadoFK_IdEmpleado(empleado.getId());

					if(!this.conCargarFormDetalle) {
						novedadBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					novedadBeanSwingJInternalFrame.setSelectedItemCombosFrameEmpleadoForeignKey(empleado,1,false,true,true);
					novedadBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					novedadBeanSwingJInternalFrame.procesarBusqueda("FK_IdEmpleado");
					novedadBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEmpleado");
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

		public void cargarEmpleadoHerraBeanSwingJInternalFrame(List<Empleado> empleados,Empleado empleado,EmpleadoHerraBeanSwingJInternalFrame empleadoherraBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//empleadoherraBeanSwingJInternalFrame=new EmpleadoHerraBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					empleadoherraBeanSwingJInternalFrame.getEmpleadoHerraLogic().setConnexion(this.empleadoLogic.getConnexion());

					empleadoherraBeanSwingJInternalFrame.setempleadosForeignKey(empleados);
					empleadoherraBeanSwingJInternalFrame.setempleadoForeignKey(empleado);
					empleadoherraBeanSwingJInternalFrame.empleadoherraSessionBean.setisBusquedaDesdeForeignKeySesionEmpleado(true);
					empleadoherraBeanSwingJInternalFrame.empleadoherraSessionBean.setlidEmpleadoActual(empleado.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					empleadoherraBeanSwingJInternalFrame.cargarCombosForeignKeyEmpleadoHerra(empleadoherraBeanSwingJInternalFrame.isCargarCombosDependencia);
					empleadoherraBeanSwingJInternalFrame.setVisibilidadBusquedasParaEmpleado(true);
					empleadoherraBeanSwingJInternalFrame.setid_empleadoFK_IdEmpleado(empleado.getId());

					if(!this.conCargarFormDetalle) {
						empleadoherraBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					empleadoherraBeanSwingJInternalFrame.setSelectedItemCombosFrameEmpleadoForeignKey(empleado,1,false,true,true);
					empleadoherraBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					empleadoherraBeanSwingJInternalFrame.procesarBusqueda("FK_IdEmpleado");
					empleadoherraBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEmpleado");
					empleadoherraBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleadoHerra(true);
					empleadoherraBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesEmpleadoHerra("n",empleadoherraBeanSwingJInternalFrame.isGuardarCambiosEnLote, empleadoherraBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					empleadoherraBeanSwingJInternalFrame.setAutoscrolls(true);
					empleadoherraBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						empleadoherraBeanSwingJInternalFrame.actualizarEstadoPanelsEmpleadoHerra("relacionado");
					} else {
						empleadoherraBeanSwingJInternalFrame.actualizarEstadoPanelsEmpleadoHerra("no_relacionado");
					}

					empleadoherraBeanSwingJInternalFrame.getjButtonRecargarInformacionEmpleadoHerra().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarEmpleadoEnferBeanSwingJInternalFrame(List<Empleado> empleados,Empleado empleado,EmpleadoEnferBeanSwingJInternalFrame empleadoenferBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//empleadoenferBeanSwingJInternalFrame=new EmpleadoEnferBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					empleadoenferBeanSwingJInternalFrame.getEmpleadoEnferLogic().setConnexion(this.empleadoLogic.getConnexion());

					empleadoenferBeanSwingJInternalFrame.setempleadosForeignKey(empleados);
					empleadoenferBeanSwingJInternalFrame.setempleadoForeignKey(empleado);
					empleadoenferBeanSwingJInternalFrame.empleadoenferSessionBean.setisBusquedaDesdeForeignKeySesionEmpleado(true);
					empleadoenferBeanSwingJInternalFrame.empleadoenferSessionBean.setlidEmpleadoActual(empleado.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					empleadoenferBeanSwingJInternalFrame.cargarCombosForeignKeyEmpleadoEnfer(empleadoenferBeanSwingJInternalFrame.isCargarCombosDependencia);
					empleadoenferBeanSwingJInternalFrame.setVisibilidadBusquedasParaEmpleado(true);
					empleadoenferBeanSwingJInternalFrame.setid_empleadoFK_IdEmpleado(empleado.getId());

					if(!this.conCargarFormDetalle) {
						empleadoenferBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					empleadoenferBeanSwingJInternalFrame.setSelectedItemCombosFrameEmpleadoForeignKey(empleado,1,false,true,true);
					empleadoenferBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					empleadoenferBeanSwingJInternalFrame.procesarBusqueda("FK_IdEmpleado");
					empleadoenferBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEmpleado");
					empleadoenferBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleadoEnfer(true);
					empleadoenferBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesEmpleadoEnfer("n",empleadoenferBeanSwingJInternalFrame.isGuardarCambiosEnLote, empleadoenferBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					empleadoenferBeanSwingJInternalFrame.setAutoscrolls(true);
					empleadoenferBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						empleadoenferBeanSwingJInternalFrame.actualizarEstadoPanelsEmpleadoEnfer("relacionado");
					} else {
						empleadoenferBeanSwingJInternalFrame.actualizarEstadoPanelsEmpleadoEnfer("no_relacionado");
					}

					empleadoenferBeanSwingJInternalFrame.getjButtonRecargarInformacionEmpleadoEnfer().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarVisaBeanSwingJInternalFrame(List<Empleado> empleados,Empleado empleado,VisaBeanSwingJInternalFrame visaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//visaBeanSwingJInternalFrame=new VisaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					visaBeanSwingJInternalFrame.getVisaLogic().setConnexion(this.empleadoLogic.getConnexion());

					visaBeanSwingJInternalFrame.setempleadosForeignKey(empleados);
					visaBeanSwingJInternalFrame.setempleadoForeignKey(empleado);
					visaBeanSwingJInternalFrame.visaSessionBean.setisBusquedaDesdeForeignKeySesionEmpleado(true);
					visaBeanSwingJInternalFrame.visaSessionBean.setlidEmpleadoActual(empleado.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					visaBeanSwingJInternalFrame.cargarCombosForeignKeyVisa(visaBeanSwingJInternalFrame.isCargarCombosDependencia);
					visaBeanSwingJInternalFrame.setVisibilidadBusquedasParaEmpleado(true);
					visaBeanSwingJInternalFrame.setid_empleadoFK_IdEmpleado(empleado.getId());

					if(!this.conCargarFormDetalle) {
						visaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					visaBeanSwingJInternalFrame.setSelectedItemCombosFrameEmpleadoForeignKey(empleado,1,false,true,true);
					visaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					visaBeanSwingJInternalFrame.procesarBusqueda("FK_IdEmpleado");
					visaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEmpleado");
					visaBeanSwingJInternalFrame.inicializarActualizarBindingTablaVisa(true);
					visaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesVisa("n",visaBeanSwingJInternalFrame.isGuardarCambiosEnLote, visaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					visaBeanSwingJInternalFrame.setAutoscrolls(true);
					visaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						visaBeanSwingJInternalFrame.actualizarEstadoPanelsVisa("relacionado");
					} else {
						visaBeanSwingJInternalFrame.actualizarEstadoPanelsVisa("no_relacionado");
					}

					visaBeanSwingJInternalFrame.getjButtonRecargarInformacionVisa().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarSeguroBeanSwingJInternalFrame(List<Empleado> empleados,Empleado empleado,SeguroBeanSwingJInternalFrame seguroBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//seguroBeanSwingJInternalFrame=new SeguroBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					seguroBeanSwingJInternalFrame.getSeguroLogic().setConnexion(this.empleadoLogic.getConnexion());

					seguroBeanSwingJInternalFrame.setempleadosForeignKey(empleados);
					seguroBeanSwingJInternalFrame.setempleadoForeignKey(empleado);
					seguroBeanSwingJInternalFrame.seguroSessionBean.setisBusquedaDesdeForeignKeySesionEmpleado(true);
					seguroBeanSwingJInternalFrame.seguroSessionBean.setlidEmpleadoActual(empleado.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					seguroBeanSwingJInternalFrame.cargarCombosForeignKeySeguro(seguroBeanSwingJInternalFrame.isCargarCombosDependencia);
					seguroBeanSwingJInternalFrame.setVisibilidadBusquedasParaEmpleado(true);
					seguroBeanSwingJInternalFrame.setid_empleadoFK_IdEmpleado(empleado.getId());

					if(!this.conCargarFormDetalle) {
						seguroBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					seguroBeanSwingJInternalFrame.setSelectedItemCombosFrameEmpleadoForeignKey(empleado,1,false,true,true);
					seguroBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					seguroBeanSwingJInternalFrame.procesarBusqueda("FK_IdEmpleado");
					seguroBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEmpleado");
					seguroBeanSwingJInternalFrame.inicializarActualizarBindingTablaSeguro(true);
					seguroBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesSeguro("n",seguroBeanSwingJInternalFrame.isGuardarCambiosEnLote, seguroBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					seguroBeanSwingJInternalFrame.setAutoscrolls(true);
					seguroBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						seguroBeanSwingJInternalFrame.actualizarEstadoPanelsSeguro("relacionado");
					} else {
						seguroBeanSwingJInternalFrame.actualizarEstadoPanelsSeguro("no_relacionado");
					}

					seguroBeanSwingJInternalFrame.getjButtonRecargarInformacionSeguro().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarAsistenciaMensualBeanSwingJInternalFrame(List<Empleado> empleados,Empleado empleado,AsistenciaMensualBeanSwingJInternalFrame asistenciamensualBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//asistenciamensualBeanSwingJInternalFrame=new AsistenciaMensualBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					asistenciamensualBeanSwingJInternalFrame.getAsistenciaMensualLogic().setConnexion(this.empleadoLogic.getConnexion());

					asistenciamensualBeanSwingJInternalFrame.setempleadosForeignKey(empleados);
					asistenciamensualBeanSwingJInternalFrame.setempleadoForeignKey(empleado);
					asistenciamensualBeanSwingJInternalFrame.asistenciamensualSessionBean.setisBusquedaDesdeForeignKeySesionEmpleado(true);
					asistenciamensualBeanSwingJInternalFrame.asistenciamensualSessionBean.setlidEmpleadoActual(empleado.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					asistenciamensualBeanSwingJInternalFrame.cargarCombosForeignKeyAsistenciaMensual(asistenciamensualBeanSwingJInternalFrame.isCargarCombosDependencia);
					asistenciamensualBeanSwingJInternalFrame.setVisibilidadBusquedasParaEmpleado(true);
					asistenciamensualBeanSwingJInternalFrame.setid_empleadoFK_IdEmpleado(empleado.getId());

					if(!this.conCargarFormDetalle) {
						asistenciamensualBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					asistenciamensualBeanSwingJInternalFrame.setSelectedItemCombosFrameEmpleadoForeignKey(empleado,1,false,true,true);
					asistenciamensualBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					asistenciamensualBeanSwingJInternalFrame.procesarBusqueda("FK_IdEmpleado");
					asistenciamensualBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEmpleado");
					asistenciamensualBeanSwingJInternalFrame.inicializarActualizarBindingTablaAsistenciaMensual(true);
					asistenciamensualBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesAsistenciaMensual("n",asistenciamensualBeanSwingJInternalFrame.isGuardarCambiosEnLote, asistenciamensualBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					asistenciamensualBeanSwingJInternalFrame.setAutoscrolls(true);
					asistenciamensualBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						asistenciamensualBeanSwingJInternalFrame.actualizarEstadoPanelsAsistenciaMensual("relacionado");
					} else {
						asistenciamensualBeanSwingJInternalFrame.actualizarEstadoPanelsAsistenciaMensual("no_relacionado");
					}

					asistenciamensualBeanSwingJInternalFrame.getjButtonRecargarInformacionAsistenciaMensual().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarEmpleadoDiscaBeanSwingJInternalFrame(List<Empleado> empleados,Empleado empleado,EmpleadoDiscaBeanSwingJInternalFrame empleadodiscaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//empleadodiscaBeanSwingJInternalFrame=new EmpleadoDiscaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					empleadodiscaBeanSwingJInternalFrame.getEmpleadoDiscaLogic().setConnexion(this.empleadoLogic.getConnexion());

					empleadodiscaBeanSwingJInternalFrame.setempleadosForeignKey(empleados);
					empleadodiscaBeanSwingJInternalFrame.setempleadoForeignKey(empleado);
					empleadodiscaBeanSwingJInternalFrame.empleadodiscaSessionBean.setisBusquedaDesdeForeignKeySesionEmpleado(true);
					empleadodiscaBeanSwingJInternalFrame.empleadodiscaSessionBean.setlidEmpleadoActual(empleado.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					empleadodiscaBeanSwingJInternalFrame.cargarCombosForeignKeyEmpleadoDisca(empleadodiscaBeanSwingJInternalFrame.isCargarCombosDependencia);
					empleadodiscaBeanSwingJInternalFrame.setVisibilidadBusquedasParaEmpleado(true);
					empleadodiscaBeanSwingJInternalFrame.setid_empleadoFK_IdEmpleado(empleado.getId());

					if(!this.conCargarFormDetalle) {
						empleadodiscaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					empleadodiscaBeanSwingJInternalFrame.setSelectedItemCombosFrameEmpleadoForeignKey(empleado,1,false,true,true);
					empleadodiscaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					empleadodiscaBeanSwingJInternalFrame.procesarBusqueda("FK_IdEmpleado");
					empleadodiscaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEmpleado");
					empleadodiscaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleadoDisca(true);
					empleadodiscaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesEmpleadoDisca("n",empleadodiscaBeanSwingJInternalFrame.isGuardarCambiosEnLote, empleadodiscaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					empleadodiscaBeanSwingJInternalFrame.setAutoscrolls(true);
					empleadodiscaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						empleadodiscaBeanSwingJInternalFrame.actualizarEstadoPanelsEmpleadoDisca("relacionado");
					} else {
						empleadodiscaBeanSwingJInternalFrame.actualizarEstadoPanelsEmpleadoDisca("no_relacionado");
					}

					empleadodiscaBeanSwingJInternalFrame.getjButtonRecargarInformacionEmpleadoDisca().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarProfesionEmpleaBeanSwingJInternalFrame(List<Empleado> empleados,Empleado empleado,ProfesionEmpleaBeanSwingJInternalFrame profesionempleaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//profesionempleaBeanSwingJInternalFrame=new ProfesionEmpleaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					profesionempleaBeanSwingJInternalFrame.getProfesionEmpleaLogic().setConnexion(this.empleadoLogic.getConnexion());

					profesionempleaBeanSwingJInternalFrame.setempleadosForeignKey(empleados);
					profesionempleaBeanSwingJInternalFrame.setempleadoForeignKey(empleado);
					profesionempleaBeanSwingJInternalFrame.profesionempleaSessionBean.setisBusquedaDesdeForeignKeySesionEmpleado(true);
					profesionempleaBeanSwingJInternalFrame.profesionempleaSessionBean.setlidEmpleadoActual(empleado.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					profesionempleaBeanSwingJInternalFrame.cargarCombosForeignKeyProfesionEmplea(profesionempleaBeanSwingJInternalFrame.isCargarCombosDependencia);
					profesionempleaBeanSwingJInternalFrame.setVisibilidadBusquedasParaEmpleado(true);
					profesionempleaBeanSwingJInternalFrame.setid_empleadoFK_IdEmpleado(empleado.getId());

					if(!this.conCargarFormDetalle) {
						profesionempleaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					profesionempleaBeanSwingJInternalFrame.setSelectedItemCombosFrameEmpleadoForeignKey(empleado,1,false,true,true);
					profesionempleaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					profesionempleaBeanSwingJInternalFrame.procesarBusqueda("FK_IdEmpleado");
					profesionempleaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEmpleado");
					profesionempleaBeanSwingJInternalFrame.inicializarActualizarBindingTablaProfesionEmplea(true);
					profesionempleaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesProfesionEmplea("n",profesionempleaBeanSwingJInternalFrame.isGuardarCambiosEnLote, profesionempleaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					profesionempleaBeanSwingJInternalFrame.setAutoscrolls(true);
					profesionempleaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						profesionempleaBeanSwingJInternalFrame.actualizarEstadoPanelsProfesionEmplea("relacionado");
					} else {
						profesionempleaBeanSwingJInternalFrame.actualizarEstadoPanelsProfesionEmplea("no_relacionado");
					}

					profesionempleaBeanSwingJInternalFrame.getjButtonRecargarInformacionProfesionEmplea().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarRubroEmpleadoBeanSwingJInternalFrame(List<Empleado> empleados,Empleado empleado,RubroEmpleadoBeanSwingJInternalFrame rubroempleadoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//rubroempleadoBeanSwingJInternalFrame=new RubroEmpleadoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					rubroempleadoBeanSwingJInternalFrame.getRubroEmpleadoLogic().setConnexion(this.empleadoLogic.getConnexion());

					rubroempleadoBeanSwingJInternalFrame.setempleadosForeignKey(empleados);
					rubroempleadoBeanSwingJInternalFrame.setempleadoForeignKey(empleado);
					rubroempleadoBeanSwingJInternalFrame.rubroempleadoSessionBean.setisBusquedaDesdeForeignKeySesionEmpleado(true);
					rubroempleadoBeanSwingJInternalFrame.rubroempleadoSessionBean.setlidEmpleadoActual(empleado.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					rubroempleadoBeanSwingJInternalFrame.cargarCombosForeignKeyRubroEmpleado(rubroempleadoBeanSwingJInternalFrame.isCargarCombosDependencia);
					rubroempleadoBeanSwingJInternalFrame.setVisibilidadBusquedasParaEmpleado(true);
					rubroempleadoBeanSwingJInternalFrame.setid_empleadoFK_IdEmpleado(empleado.getId());

					if(!this.conCargarFormDetalle) {
						rubroempleadoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					rubroempleadoBeanSwingJInternalFrame.setSelectedItemCombosFrameEmpleadoForeignKey(empleado,1,false,true,true);
					rubroempleadoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					rubroempleadoBeanSwingJInternalFrame.procesarBusqueda("FK_IdEmpleado");
					rubroempleadoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEmpleado");
					rubroempleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaRubroEmpleado(true);
					rubroempleadoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesRubroEmpleado("n",rubroempleadoBeanSwingJInternalFrame.isGuardarCambiosEnLote, rubroempleadoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					rubroempleadoBeanSwingJInternalFrame.setAutoscrolls(true);
					rubroempleadoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						rubroempleadoBeanSwingJInternalFrame.actualizarEstadoPanelsRubroEmpleado("relacionado");
					} else {
						rubroempleadoBeanSwingJInternalFrame.actualizarEstadoPanelsRubroEmpleado("no_relacionado");
					}

					rubroempleadoBeanSwingJInternalFrame.getjButtonRecargarInformacionRubroEmpleado().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarEmpleadoConstanteBeanSwingJInternalFrame(List<Empleado> empleados,Empleado empleado,EmpleadoConstanteBeanSwingJInternalFrame empleadoconstanteBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//empleadoconstanteBeanSwingJInternalFrame=new EmpleadoConstanteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					empleadoconstanteBeanSwingJInternalFrame.getEmpleadoConstanteLogic().setConnexion(this.empleadoLogic.getConnexion());

					empleadoconstanteBeanSwingJInternalFrame.setempleadosForeignKey(empleados);
					empleadoconstanteBeanSwingJInternalFrame.setempleadoForeignKey(empleado);
					empleadoconstanteBeanSwingJInternalFrame.empleadoconstanteSessionBean.setisBusquedaDesdeForeignKeySesionEmpleado(true);
					empleadoconstanteBeanSwingJInternalFrame.empleadoconstanteSessionBean.setlidEmpleadoActual(empleado.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					empleadoconstanteBeanSwingJInternalFrame.cargarCombosForeignKeyEmpleadoConstante(empleadoconstanteBeanSwingJInternalFrame.isCargarCombosDependencia);
					empleadoconstanteBeanSwingJInternalFrame.setVisibilidadBusquedasParaEmpleado(true);
					empleadoconstanteBeanSwingJInternalFrame.setid_empleadoFK_IdEmpleado(empleado.getId());

					if(!this.conCargarFormDetalle) {
						empleadoconstanteBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					empleadoconstanteBeanSwingJInternalFrame.setSelectedItemCombosFrameEmpleadoForeignKey(empleado,1,false,true,true);
					empleadoconstanteBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					empleadoconstanteBeanSwingJInternalFrame.procesarBusqueda("FK_IdEmpleado");
					empleadoconstanteBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEmpleado");
					empleadoconstanteBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleadoConstante(true);
					empleadoconstanteBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesEmpleadoConstante("n",empleadoconstanteBeanSwingJInternalFrame.isGuardarCambiosEnLote, empleadoconstanteBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					empleadoconstanteBeanSwingJInternalFrame.setAutoscrolls(true);
					empleadoconstanteBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						empleadoconstanteBeanSwingJInternalFrame.actualizarEstadoPanelsEmpleadoConstante("relacionado");
					} else {
						empleadoconstanteBeanSwingJInternalFrame.actualizarEstadoPanelsEmpleadoConstante("no_relacionado");
					}

					empleadoconstanteBeanSwingJInternalFrame.getjButtonRecargarInformacionEmpleadoConstante().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarTallaVestidoBeanSwingJInternalFrame(List<Empleado> empleados,Empleado empleado,TallaVestidoBeanSwingJInternalFrame tallavestidoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//tallavestidoBeanSwingJInternalFrame=new TallaVestidoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					tallavestidoBeanSwingJInternalFrame.getTallaVestidoLogic().setConnexion(this.empleadoLogic.getConnexion());

					tallavestidoBeanSwingJInternalFrame.setempleadosForeignKey(empleados);
					tallavestidoBeanSwingJInternalFrame.setempleadoForeignKey(empleado);
					tallavestidoBeanSwingJInternalFrame.tallavestidoSessionBean.setisBusquedaDesdeForeignKeySesionEmpleado(true);
					tallavestidoBeanSwingJInternalFrame.tallavestidoSessionBean.setlidEmpleadoActual(empleado.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					tallavestidoBeanSwingJInternalFrame.cargarCombosForeignKeyTallaVestido(tallavestidoBeanSwingJInternalFrame.isCargarCombosDependencia);
					tallavestidoBeanSwingJInternalFrame.setVisibilidadBusquedasParaEmpleado(true);
					tallavestidoBeanSwingJInternalFrame.setid_empleadoFK_IdEmpleado(empleado.getId());

					if(!this.conCargarFormDetalle) {
						tallavestidoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					tallavestidoBeanSwingJInternalFrame.setSelectedItemCombosFrameEmpleadoForeignKey(empleado,1,false,true,true);
					tallavestidoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					tallavestidoBeanSwingJInternalFrame.procesarBusqueda("FK_IdEmpleado");
					tallavestidoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEmpleado");
					tallavestidoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTallaVestido(true);
					tallavestidoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesTallaVestido("n",tallavestidoBeanSwingJInternalFrame.isGuardarCambiosEnLote, tallavestidoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					tallavestidoBeanSwingJInternalFrame.setAutoscrolls(true);
					tallavestidoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						tallavestidoBeanSwingJInternalFrame.actualizarEstadoPanelsTallaVestido("relacionado");
					} else {
						tallavestidoBeanSwingJInternalFrame.actualizarEstadoPanelsTallaVestido("no_relacionado");
					}

					tallavestidoBeanSwingJInternalFrame.getjButtonRecargarInformacionTallaVestido().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarNovedadNomiBeanSwingJInternalFrame(List<Empleado> empleados,Empleado empleado,NovedadNomiBeanSwingJInternalFrame novedadnomiBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//novedadnomiBeanSwingJInternalFrame=new NovedadNomiBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					novedadnomiBeanSwingJInternalFrame.getNovedadNomiLogic().setConnexion(this.empleadoLogic.getConnexion());

					novedadnomiBeanSwingJInternalFrame.setempleadosForeignKey(empleados);
					novedadnomiBeanSwingJInternalFrame.setempleadoForeignKey(empleado);
					novedadnomiBeanSwingJInternalFrame.novedadnomiSessionBean.setisBusquedaDesdeForeignKeySesionEmpleado(true);
					novedadnomiBeanSwingJInternalFrame.novedadnomiSessionBean.setlidEmpleadoActual(empleado.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					novedadnomiBeanSwingJInternalFrame.cargarCombosForeignKeyNovedadNomi(novedadnomiBeanSwingJInternalFrame.isCargarCombosDependencia);
					novedadnomiBeanSwingJInternalFrame.setVisibilidadBusquedasParaEmpleado(true);
					novedadnomiBeanSwingJInternalFrame.setid_empleadoFK_IdEmpleado(empleado.getId());

					if(!this.conCargarFormDetalle) {
						novedadnomiBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					novedadnomiBeanSwingJInternalFrame.setSelectedItemCombosFrameEmpleadoForeignKey(empleado,1,false,true,true);
					novedadnomiBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					novedadnomiBeanSwingJInternalFrame.procesarBusqueda("FK_IdEmpleado");
					novedadnomiBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEmpleado");
					novedadnomiBeanSwingJInternalFrame.inicializarActualizarBindingTablaNovedadNomi(true);
					novedadnomiBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesNovedadNomi("n",novedadnomiBeanSwingJInternalFrame.isGuardarCambiosEnLote, novedadnomiBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					novedadnomiBeanSwingJInternalFrame.setAutoscrolls(true);
					novedadnomiBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						novedadnomiBeanSwingJInternalFrame.actualizarEstadoPanelsNovedadNomi("relacionado");
					} else {
						novedadnomiBeanSwingJInternalFrame.actualizarEstadoPanelsNovedadNomi("no_relacionado");
					}

					novedadnomiBeanSwingJInternalFrame.getjButtonRecargarInformacionNovedadNomi().setVisible(false);

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
