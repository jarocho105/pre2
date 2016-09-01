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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.contabilidad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.contabilidad.util.ParametroFormularioIvaConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.*;
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
public class ParametroFormularioIvaDetalleFormJInternalFrame extends ParametroFormularioIvaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleParametroFormularioIva;
	
	protected JMenuBar jmenuBarDetalleParametroFormularioIva;
	
	protected JMenu jmenuDetalleParametroFormularioIva;
	protected JMenu jmenuDetalleArchivoParametroFormularioIva;
	protected JMenu jmenuDetalleAccionesParametroFormularioIva;
	protected JMenu jmenuDetalleDatosParametroFormularioIva;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleParametroFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutParametroFormularioIva;	
	protected GridBagConstraints gridBagConstraintsParametroFormularioIva;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ParametroFormularioIvaBeanSwingJInternalFrameAdditional jInternalFrameDetalleParametroFormularioIva;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected TipoParametroFormularioIvaBeanSwingJInternalFrame tipoparametroformularioivaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoparametroformularioiva="";

	protected GrupoParametroFormularioIvaBeanSwingJInternalFrame grupoparametroformularioivaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_grupoparametroformularioiva="";

	protected SubGrupoParametroFormularioIvaBeanSwingJInternalFrame subgrupoparametroformularioivaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_subgrupoparametroformularioiva="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontable1BeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable1="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontable2BeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable2="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontable3BeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable3="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontable4BeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable4="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontable5BeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable5="";
	
	public ParametroFormularioIvaSessionBean parametroformularioivaSessionBean;
	
	

	public FormularioRentaBeanSwingJInternalFrame formulariorentaBeanSwingJInternalFrame=null;
	public FormularioRentaBeanSwingJInternalFrame formulariorentaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteFormularioRenta=false;
	public FormularioRentaSessionBean formulariorentaSessionBean;

	public FormularioIvaBeanSwingJInternalFrame formularioivaBeanSwingJInternalFrame=null;
	public FormularioIvaBeanSwingJInternalFrame formularioivaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteFormularioIva=false;
	public FormularioIvaSessionBean formularioivaSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public TipoParametroFormularioIvaSessionBean tipoparametroformularioivaSessionBean;
	public GrupoParametroFormularioIvaSessionBean grupoparametroformularioivaSessionBean;
	public SubGrupoParametroFormularioIvaSessionBean subgrupoparametroformularioivaSessionBean;
	public CuentaContableSessionBean cuentacontable1SessionBean;
	public CuentaContableSessionBean cuentacontable2SessionBean;
	public CuentaContableSessionBean cuentacontable3SessionBean;
	public CuentaContableSessionBean cuentacontable4SessionBean;
	public CuentaContableSessionBean cuentacontable5SessionBean;	
	
	public ParametroFormularioIvaLogic parametroformularioivaLogic;
	
	public JScrollPane jScrollPanelDatosParametroFormularioIva;
	public JScrollPane jScrollPanelDatosEdicionParametroFormularioIva;
	public JScrollPane jScrollPanelDatosGeneralParametroFormularioIva;
	
	protected JPanel jPanelCamposParametroFormularioIva;    
	protected JPanel jPanelCamposOcultosParametroFormularioIva;    	
	protected JPanel jPanelAccionesParametroFormularioIva;
	protected JPanel jPanelAccionesFormularioParametroFormularioIva;
    
	
	
	protected JTabbedPane jTabbedPaneCamposParametroFormularioIva;	
	protected Integer iXPanelCamposParametroFormularioIva=0;
	protected Integer iYPanelCamposParametroFormularioIva=0;
	
	protected Integer iXPanelCamposOcultosParametroFormularioIva=0;
	protected Integer iYPanelCamposOcultosParametroFormularioIva=0;
	
	

	protected JPanel jPanelCamposIniciogeneralParametroFormularioIva;
	protected Integer iXPanelCamposIniciogeneralParametroFormularioIva=0;
	protected Integer iYPanelCamposIniciogeneralParametroFormularioIva=0;

	protected JPanel jPanelCamposIniciocuenta_contableParametroFormularioIva;
	protected Integer iXPanelCamposIniciocuenta_contableParametroFormularioIva=0;
	protected Integer iYPanelCamposIniciocuenta_contableParametroFormularioIva=0;;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoParametroFormularioIva;
	public JButton jButtonModificarParametroFormularioIva;
	public JButton jButtonActualizarParametroFormularioIva;
    public JButton jButtonEliminarParametroFormularioIva;
	public JButton jButtonCancelarParametroFormularioIva;
    public JButton jButtonGuardarCambiosParametroFormularioIva;
	public JButton jButtonGuardarCambiosTablaParametroFormularioIva;
	protected JButton jButtonCerrarParametroFormularioIva;
	
	
	protected JButton jButtonProcesarInformacionParametroFormularioIva;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoParametroFormularioIva;
	protected JCheckBox jCheckBoxPostAccionSinCerrarParametroFormularioIva;
	protected JCheckBox jCheckBoxPostAccionSinMensajeParametroFormularioIva;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarParametroFormularioIva;
	protected JButton jButtonModificarToolBarParametroFormularioIva;
	protected JButton jButtonActualizarToolBarParametroFormularioIva;
    protected JButton jButtonEliminarToolBarParametroFormularioIva;
	protected JButton jButtonCancelarToolBarParametroFormularioIva;
    protected JButton jButtonGuardarCambiosToolBarParametroFormularioIva;
	protected JButton jButtonGuardarCambiosTablaToolBarParametroFormularioIva;
	protected JButton jButtonMostrarOcultarTablaToolBarParametroFormularioIva;
	protected JButton jButtonCerrarToolBarParametroFormularioIva;
	
	protected JButton jButtonProcesarInformacionToolBarParametroFormularioIva;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoParametroFormularioIva;
	protected JMenuItem jMenuItemModificarParametroFormularioIva;
	protected JMenuItem jMenuItemActualizarParametroFormularioIva;
    protected JMenuItem jMenuItemEliminarParametroFormularioIva;
	protected JMenuItem jMenuItemCancelarParametroFormularioIva;
    protected JMenuItem jMenuItemGuardarCambiosParametroFormularioIva;
	protected JMenuItem jMenuItemGuardarCambiosTablaParametroFormularioIva;
	protected JMenuItem jMenuItemCerrarParametroFormularioIva;
	protected JMenuItem jMenuItemDetalleCerrarParametroFormularioIva;
	protected JMenuItem jMenuItemDetalleMostarOcultarParametroFormularioIva;
	
	protected JMenuItem jMenuItemProcesarInformacionParametroFormularioIva;
	protected JMenuItem jMenuItemNuevoGuardarCambiosParametroFormularioIva;
	protected JMenuItem jMenuItemMostrarOcultarParametroFormularioIva;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesParametroFormularioIva;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesParametroFormularioIva;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesParametroFormularioIva;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioParametroFormularioIva;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidParametroFormularioIva;
	public JLabel jLabelIdParametroFormularioIva;
	public JLabel jLabelidParametroFormularioIva;
	public JButton jButtonidParametroFormularioIvaBusqueda= new JButtonMe();

	public JPanel jPanelgrupoParametroFormularioIva;
	public JLabel jLabelgrupoParametroFormularioIva;
	public JTextField jTextFieldgrupoParametroFormularioIva;
	public JButton jButtongrupoParametroFormularioIvaBusqueda= new JButtonMe();

	public JPanel jPanelgrupo2ParametroFormularioIva;
	public JLabel jLabelgrupo2ParametroFormularioIva;
	public JTextField jTextFieldgrupo2ParametroFormularioIva;
	public JButton jButtongrupo2ParametroFormularioIvaBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_sriParametroFormularioIva;
	public JLabel jLabelcodigo_sriParametroFormularioIva;
	public JTextField jTextFieldcodigo_sriParametroFormularioIva;
	public JButton jButtoncodigo_sriParametroFormularioIvaBusqueda= new JButtonMe();

	public JPanel jPanelnombreParametroFormularioIva;
	public JLabel jLabelnombreParametroFormularioIva;
	public JTextArea jTextAreanombreParametroFormularioIva;
	public JScrollPane jscrollPanenombreParametroFormularioIva;
	public JButton jButtonnombreParametroFormularioIvaBusqueda= new JButtonMe();

	public JPanel jPanelporcentajeParametroFormularioIva;
	public JLabel jLabelporcentajeParametroFormularioIva;
	public JTextField jTextFieldporcentajeParametroFormularioIva;
	public JButton jButtonporcentajeParametroFormularioIvaBusqueda= new JButtonMe();

	public JPanel jPanelcon_totalParametroFormularioIva;
	public JLabel jLabelcon_totalParametroFormularioIva;
	public JCheckBox jCheckBoxcon_totalParametroFormularioIva;
	public JButton jButtoncon_totalParametroFormularioIvaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaParametroFormularioIva;
	public JLabel jLabelid_empresaParametroFormularioIva;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaParametroFormularioIva;
	public JButton jButtonid_empresaParametroFormularioIva= new JButtonMe();
	public JButton jButtonid_empresaParametroFormularioIvaUpdate= new JButtonMe();
	public JButton jButtonid_empresaParametroFormularioIvaBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_parametro_formulario_ivaParametroFormularioIva;
	public JLabel jLabelid_tipo_parametro_formulario_ivaParametroFormularioIva;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_parametro_formulario_ivaParametroFormularioIva;
	public JButton jButtonid_tipo_parametro_formulario_ivaParametroFormularioIva= new JButtonMe();
	public JButton jButtonid_tipo_parametro_formulario_ivaParametroFormularioIvaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_parametro_formulario_ivaParametroFormularioIvaBusqueda= new JButtonMe();

	public JPanel jPanelid_grupo_parametro_formulario_ivaParametroFormularioIva;
	public JLabel jLabelid_grupo_parametro_formulario_ivaParametroFormularioIva;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_grupo_parametro_formulario_ivaParametroFormularioIva;
	public JButton jButtonid_grupo_parametro_formulario_ivaParametroFormularioIva= new JButtonMe();
	public JButton jButtonid_grupo_parametro_formulario_ivaParametroFormularioIvaUpdate= new JButtonMe();
	public JButton jButtonid_grupo_parametro_formulario_ivaParametroFormularioIvaBusqueda= new JButtonMe();

	public JPanel jPanelid_sub_grupo_parametro_formulario_ivaParametroFormularioIva;
	public JLabel jLabelid_sub_grupo_parametro_formulario_ivaParametroFormularioIva;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sub_grupo_parametro_formulario_ivaParametroFormularioIva;
	public JButton jButtonid_sub_grupo_parametro_formulario_ivaParametroFormularioIva= new JButtonMe();
	public JButton jButtonid_sub_grupo_parametro_formulario_ivaParametroFormularioIvaUpdate= new JButtonMe();
	public JButton jButtonid_sub_grupo_parametro_formulario_ivaParametroFormularioIvaBusqueda= new JButtonMe();

	public JPanel jPanelid_cuenta_contable1ParametroFormularioIva;
	public JLabel jLabelid_cuenta_contable1ParametroFormularioIva;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable1ParametroFormularioIva;
	public JButton jButtonid_cuenta_contable1ParametroFormularioIva= new JButtonMe();
	public JButton jButtonid_cuenta_contable1ParametroFormularioIvaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable1ParametroFormularioIvaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable1ParametroFormularioIvaArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable2ParametroFormularioIva;
	public JLabel jLabelid_cuenta_contable2ParametroFormularioIva;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable2ParametroFormularioIva;
	public JButton jButtonid_cuenta_contable2ParametroFormularioIva= new JButtonMe();
	public JButton jButtonid_cuenta_contable2ParametroFormularioIvaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable2ParametroFormularioIvaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable2ParametroFormularioIvaArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable3ParametroFormularioIva;
	public JLabel jLabelid_cuenta_contable3ParametroFormularioIva;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable3ParametroFormularioIva;
	public JButton jButtonid_cuenta_contable3ParametroFormularioIva= new JButtonMe();
	public JButton jButtonid_cuenta_contable3ParametroFormularioIvaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable3ParametroFormularioIvaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable3ParametroFormularioIvaArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable4ParametroFormularioIva;
	public JLabel jLabelid_cuenta_contable4ParametroFormularioIva;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable4ParametroFormularioIva;
	public JButton jButtonid_cuenta_contable4ParametroFormularioIva= new JButtonMe();
	public JButton jButtonid_cuenta_contable4ParametroFormularioIvaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable4ParametroFormularioIvaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable4ParametroFormularioIvaArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable5ParametroFormularioIva;
	public JLabel jLabelid_cuenta_contable5ParametroFormularioIva;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable5ParametroFormularioIva;
	public JButton jButtonid_cuenta_contable5ParametroFormularioIva= new JButtonMe();
	public JButton jButtonid_cuenta_contable5ParametroFormularioIvaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable5ParametroFormularioIvaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable5ParametroFormularioIvaArbol= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesParametroFormularioIva;
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=580;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=946;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ParametroFormularioIvaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposParametroFormularioIva=new JPanel();
				this.jPanelAccionesFormularioParametroFormularioIva=new JPanel();
				this.jmenuBarDetalleParametroFormularioIva=new JMenuBar();
				this.jTtoolBarDetalleParametroFormularioIva=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroFormularioIvaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ParametroFormularioIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ParametroFormularioIvaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ParametroFormularioIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroFormularioIvaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroFormularioIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroFormularioIvaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroFormularioIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroFormularioIvaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ParametroFormularioIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarParametroFormularioIva() {
		return this.jButtonActualizarToolBarParametroFormularioIva;
	}
	
	public JButton getjButtonEliminarToolBarParametroFormularioIva() {
		return this.jButtonEliminarToolBarParametroFormularioIva;
	}
	
	public JButton getjButtonCancelarToolBarParametroFormularioIva() {
		return this.jButtonCancelarToolBarParametroFormularioIva;
	}		
	
	public JButton getjButtonProcesarInformacionParametroFormularioIva() {
		return this.jButtonProcesarInformacionParametroFormularioIva;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionParametroFormularioIva)	{
		this.jButtonProcesarInformacionParametroFormularioIva = jButtonProcesarInformacionParametroFormularioIva;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesParametroFormularioIva() {
		return this.jComboBoxTiposAccionesParametroFormularioIva;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesParametroFormularioIva(
			JComboBox jComboBoxTiposRelacionesParametroFormularioIva) {
		this.jComboBoxTiposRelacionesParametroFormularioIva = jComboBoxTiposRelacionesParametroFormularioIva;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesParametroFormularioIva(
			JComboBox jComboBoxTiposAccionesParametroFormularioIva) {
		this.jComboBoxTiposAccionesParametroFormularioIva = jComboBoxTiposAccionesParametroFormularioIva;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioParametroFormularioIva() {
		return this.jComboBoxTiposAccionesFormularioParametroFormularioIva;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioParametroFormularioIva(
			JComboBox jComboBoxTiposAccionesFormularioParametroFormularioIva) {
		this.jComboBoxTiposAccionesFormularioParametroFormularioIva = jComboBoxTiposAccionesFormularioParametroFormularioIva;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.parametroformularioivaSessionBean=new ParametroFormularioIvaSessionBean();
		
		this.parametroformularioivaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parametroformularioivaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.parametroformularioivaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.formulariorentaSessionBean=new FormularioRentaSessionBean();
		//this.formularioivaSessionBean=new FormularioIvaSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ParametroFormularioIvaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ParametroFormularioIvaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ParametroFormularioIvaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Parametro Formulario Iva MANTENIMIENTO"));
		
		
		if(iWidth > 1650) {
			iWidth=1650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.parametroformularioivaSessionBean.getEsGuardarRelacionado()) {
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
	
		ParametroFormularioIvaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleParametroFormularioIva= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarParametroFormularioIva=new JButtonMe();
				this.jButtonModificarToolBarParametroFormularioIva=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarParametroFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarParametroFormularioIva,this.jTtoolBarDetalleParametroFormularioIva,
							"actualizar","actualizar","Actualizar"+" "+ParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarParametroFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarParametroFormularioIva,this.jTtoolBarDetalleParametroFormularioIva,
							"eliminar","eliminar","Eliminar"+" "+ParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarParametroFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarParametroFormularioIva,this.jTtoolBarDetalleParametroFormularioIva,
							"cancelar","cancelar","Cancelar"+" "+ParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarParametroFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarParametroFormularioIva,this.jTtoolBarDetalleParametroFormularioIva,
							"guardarcambios","guardarcambios","Guardar"+" "+ParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarParametroFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarParametroFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarParametroFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleParametroFormularioIva=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleParametroFormularioIva=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoParametroFormularioIva=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesParametroFormularioIva=new JMenuMe("Acciones");
		this.jmenuDetalleDatosParametroFormularioIva=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoParametroFormularioIva= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoParametroFormularioIva.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoParametroFormularioIva,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarParametroFormularioIva= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarParametroFormularioIva.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarParametroFormularioIva,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarParametroFormularioIva= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarParametroFormularioIva.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarParametroFormularioIva,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarParametroFormularioIva= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarParametroFormularioIva.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarParametroFormularioIva,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarParametroFormularioIva= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarParametroFormularioIva.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarParametroFormularioIva,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosParametroFormularioIva= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosParametroFormularioIva.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosParametroFormularioIva,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarParametroFormularioIva= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarParametroFormularioIva.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarParametroFormularioIva,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarParametroFormularioIva= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarParametroFormularioIva.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarParametroFormularioIva,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarParametroFormularioIva= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarParametroFormularioIva.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarParametroFormularioIva,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarParametroFormularioIva= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarParametroFormularioIva.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarParametroFormularioIva,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoParametroFormularioIva.add(this.jMenuItemDetalleCerrarParametroFormularioIva);
		
		this.jmenuDetalleAccionesParametroFormularioIva.add(this.jMenuItemActualizarParametroFormularioIva);
		this.jmenuDetalleAccionesParametroFormularioIva.add(this.jMenuItemEliminarParametroFormularioIva);
		this.jmenuDetalleAccionesParametroFormularioIva.add(this.jMenuItemCancelarParametroFormularioIva);		
		
		//this.jmenuDetalleDatosParametroFormularioIva.add(this.jMenuItemDetalleAbrirOrderByParametroFormularioIva);				
		this.jmenuDetalleDatosParametroFormularioIva.add(this.jMenuItemDetalleMostarOcultarParametroFormularioIva);				
				
		//this.jmenuDetalleAccionesParametroFormularioIva.add(this.jMenuItemGuardarCambiosParametroFormularioIva);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleParametroFormularioIva.add(this.jmenuDetalleArchivoParametroFormularioIva);		
		this.jmenuBarDetalleParametroFormularioIva.add(this.jmenuDetalleAccionesParametroFormularioIva);		
		this.jmenuBarDetalleParametroFormularioIva.add(this.jmenuDetalleDatosParametroFormularioIva);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleParametroFormularioIva.add(this.jmenuDetalleParametroFormularioIva);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleParametroFormularioIva);				
	}
	
	
	public void inicializarElementosCamposParametroFormularioIva() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdParametroFormularioIva = new JLabelMe();
		jLabelIdParametroFormularioIva.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdParametroFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidParametroFormularioIva = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidParametroFormularioIva.setToolTipText(ParametroFormularioIvaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutParametroFormularioIva= new GridBagLayout();

		this.jPanelidParametroFormularioIva.setLayout(this.gridaBagLayoutParametroFormularioIva);

		jLabelidParametroFormularioIva = new JLabel();
		jLabelidParametroFormularioIva.setText("Id");

		jLabelidParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelgrupoParametroFormularioIva = new JLabelMe();
		this.jLabelgrupoParametroFormularioIva.setText(""+ParametroFormularioIvaConstantesFunciones.LABEL_GRUPO+" : *");
		this.jLabelgrupoParametroFormularioIva.setToolTipText("Grupo");
		this.jLabelgrupoParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelgrupoParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelgrupoParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelgrupoParametroFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelgrupoParametroFormularioIva=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelgrupoParametroFormularioIva.setToolTipText(ParametroFormularioIvaConstantesFunciones.LABEL_GRUPO);
		this.gridaBagLayoutParametroFormularioIva = new GridBagLayout();
		this.jPanelgrupoParametroFormularioIva.setLayout(this.gridaBagLayoutParametroFormularioIva);


		jTextFieldgrupoParametroFormularioIva= new JTextFieldMe();
		jTextFieldgrupoParametroFormularioIva.setEnabled(false);
		jTextFieldgrupoParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldgrupoParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldgrupoParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldgrupoParametroFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldgrupoParametroFormularioIva.setText("0");

		this.jButtongrupoParametroFormularioIvaBusqueda= new JButtonMe();
		this.jButtongrupoParametroFormularioIvaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtongrupoParametroFormularioIvaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtongrupoParametroFormularioIvaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtongrupoParametroFormularioIvaBusqueda.setText("U");
		this.jButtongrupoParametroFormularioIvaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtongrupoParametroFormularioIvaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtongrupoParametroFormularioIvaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldgrupoParametroFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldgrupoParametroFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"grupoParametroFormularioIvaBusqueda"));

		if(this.parametroformularioivaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtongrupoParametroFormularioIvaBusqueda.setVisible(false);		}


					
		this.jLabelgrupo2ParametroFormularioIva = new JLabelMe();
		this.jLabelgrupo2ParametroFormularioIva.setText(""+ParametroFormularioIvaConstantesFunciones.LABEL_GRUPO2+" : *");
		this.jLabelgrupo2ParametroFormularioIva.setToolTipText("Grupo 2");
		this.jLabelgrupo2ParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelgrupo2ParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelgrupo2ParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelgrupo2ParametroFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelgrupo2ParametroFormularioIva=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelgrupo2ParametroFormularioIva.setToolTipText(ParametroFormularioIvaConstantesFunciones.LABEL_GRUPO2);
		this.gridaBagLayoutParametroFormularioIva = new GridBagLayout();
		this.jPanelgrupo2ParametroFormularioIva.setLayout(this.gridaBagLayoutParametroFormularioIva);


		jTextFieldgrupo2ParametroFormularioIva= new JTextFieldMe();
		jTextFieldgrupo2ParametroFormularioIva.setEnabled(false);
		jTextFieldgrupo2ParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldgrupo2ParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldgrupo2ParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldgrupo2ParametroFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldgrupo2ParametroFormularioIva.setText("0");

		this.jButtongrupo2ParametroFormularioIvaBusqueda= new JButtonMe();
		this.jButtongrupo2ParametroFormularioIvaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtongrupo2ParametroFormularioIvaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtongrupo2ParametroFormularioIvaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtongrupo2ParametroFormularioIvaBusqueda.setText("U");
		this.jButtongrupo2ParametroFormularioIvaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtongrupo2ParametroFormularioIvaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtongrupo2ParametroFormularioIvaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldgrupo2ParametroFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldgrupo2ParametroFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"grupo2ParametroFormularioIvaBusqueda"));

		if(this.parametroformularioivaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtongrupo2ParametroFormularioIvaBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_sriParametroFormularioIva = new JLabelMe();
		this.jLabelcodigo_sriParametroFormularioIva.setText(""+ParametroFormularioIvaConstantesFunciones.LABEL_CODIGOSRI+" : *");
		this.jLabelcodigo_sriParametroFormularioIva.setToolTipText("Codigo Sri");
		this.jLabelcodigo_sriParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_sriParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_sriParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_sriParametroFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_sriParametroFormularioIva=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_sriParametroFormularioIva.setToolTipText(ParametroFormularioIvaConstantesFunciones.LABEL_CODIGOSRI);
		this.gridaBagLayoutParametroFormularioIva = new GridBagLayout();
		this.jPanelcodigo_sriParametroFormularioIva.setLayout(this.gridaBagLayoutParametroFormularioIva);


		jTextFieldcodigo_sriParametroFormularioIva= new JTextFieldMe();

		jTextFieldcodigo_sriParametroFormularioIva.setEnabled(false);
		jTextFieldcodigo_sriParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_sriParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_sriParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_sriParametroFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_sriParametroFormularioIvaBusqueda= new JButtonMe();
		this.jButtoncodigo_sriParametroFormularioIvaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_sriParametroFormularioIvaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_sriParametroFormularioIvaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_sriParametroFormularioIvaBusqueda.setText("U");
		this.jButtoncodigo_sriParametroFormularioIvaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_sriParametroFormularioIvaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_sriParametroFormularioIvaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_sriParametroFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_sriParametroFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_sriParametroFormularioIvaBusqueda"));

		if(this.parametroformularioivaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_sriParametroFormularioIvaBusqueda.setVisible(false);		}


					
		this.jLabelnombreParametroFormularioIva = new JLabelMe();
		this.jLabelnombreParametroFormularioIva.setText(""+ParametroFormularioIvaConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreParametroFormularioIva.setToolTipText("Nombre");
		this.jLabelnombreParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreParametroFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreParametroFormularioIva=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreParametroFormularioIva.setToolTipText(ParametroFormularioIvaConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutParametroFormularioIva = new GridBagLayout();
		this.jPanelnombreParametroFormularioIva.setLayout(this.gridaBagLayoutParametroFormularioIva);


		jTextAreanombreParametroFormularioIva= new JTextAreaMe();
		jTextAreanombreParametroFormularioIva.setEnabled(false);
		jTextAreanombreParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,150),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,150),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,150),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreParametroFormularioIva.setLineWrap(true);
		jTextAreanombreParametroFormularioIva.setWrapStyleWord(true);
		jTextAreanombreParametroFormularioIva.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreParametroFormularioIva.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreParametroFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreParametroFormularioIva = new JScrollPane(jTextAreanombreParametroFormularioIva);
		jscrollPanenombreParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,150),70));
		jscrollPanenombreParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,150),70));
		jscrollPanenombreParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,150),70));

		this.jButtonnombreParametroFormularioIvaBusqueda= new JButtonMe();
		this.jButtonnombreParametroFormularioIvaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreParametroFormularioIvaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreParametroFormularioIvaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreParametroFormularioIvaBusqueda.setText("U");
		this.jButtonnombreParametroFormularioIvaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreParametroFormularioIvaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreParametroFormularioIvaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreParametroFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreParametroFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreParametroFormularioIvaBusqueda"));

		if(this.parametroformularioivaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreParametroFormularioIvaBusqueda.setVisible(false);		}


					
		this.jLabelporcentajeParametroFormularioIva = new JLabelMe();
		this.jLabelporcentajeParametroFormularioIva.setText(""+ParametroFormularioIvaConstantesFunciones.LABEL_PORCENTAJE+" : *");
		this.jLabelporcentajeParametroFormularioIva.setToolTipText("Porcentaje");
		this.jLabelporcentajeParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentajeParametroFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentajeParametroFormularioIva=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentajeParametroFormularioIva.setToolTipText(ParametroFormularioIvaConstantesFunciones.LABEL_PORCENTAJE);
		this.gridaBagLayoutParametroFormularioIva = new GridBagLayout();
		this.jPanelporcentajeParametroFormularioIva.setLayout(this.gridaBagLayoutParametroFormularioIva);


		jTextFieldporcentajeParametroFormularioIva= new JTextFieldMe();
		jTextFieldporcentajeParametroFormularioIva.setEnabled(false);
		jTextFieldporcentajeParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentajeParametroFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentajeParametroFormularioIva.setText("0.0");

		this.jButtonporcentajeParametroFormularioIvaBusqueda= new JButtonMe();
		this.jButtonporcentajeParametroFormularioIvaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeParametroFormularioIvaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeParametroFormularioIvaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentajeParametroFormularioIvaBusqueda.setText("U");
		this.jButtonporcentajeParametroFormularioIvaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentajeParametroFormularioIvaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentajeParametroFormularioIvaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentajeParametroFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentajeParametroFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentajeParametroFormularioIvaBusqueda"));

		if(this.parametroformularioivaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentajeParametroFormularioIvaBusqueda.setVisible(false);		}


					
		this.jLabelcon_totalParametroFormularioIva = new JLabelMe();
		this.jLabelcon_totalParametroFormularioIva.setText(""+ParametroFormularioIvaConstantesFunciones.LABEL_CONTOTAL+" : *");
		this.jLabelcon_totalParametroFormularioIva.setToolTipText("Con Total");
		this.jLabelcon_totalParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_totalParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_totalParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_totalParametroFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_totalParametroFormularioIva=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_totalParametroFormularioIva.setToolTipText(ParametroFormularioIvaConstantesFunciones.LABEL_CONTOTAL);
		this.gridaBagLayoutParametroFormularioIva = new GridBagLayout();
		this.jPanelcon_totalParametroFormularioIva.setLayout(this.gridaBagLayoutParametroFormularioIva);


		jCheckBoxcon_totalParametroFormularioIva= new JCheckBoxMe();
		jCheckBoxcon_totalParametroFormularioIva.setEnabled(false);

		jCheckBoxcon_totalParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_totalParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_totalParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_totalParametroFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_totalParametroFormularioIvaBusqueda= new JButtonMe();
		this.jButtoncon_totalParametroFormularioIvaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_totalParametroFormularioIvaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_totalParametroFormularioIvaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_totalParametroFormularioIvaBusqueda.setText("U");
		this.jButtoncon_totalParametroFormularioIvaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_totalParametroFormularioIvaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_totalParametroFormularioIvaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_totalParametroFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_totalParametroFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_totalParametroFormularioIvaBusqueda"));

		if(this.parametroformularioivaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_totalParametroFormularioIvaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysParametroFormularioIva() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaParametroFormularioIva = new JLabelMe();
		this.jLabelid_empresaParametroFormularioIva.setText(""+ParametroFormularioIvaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaParametroFormularioIva.setToolTipText("Empresa");
		this.jLabelid_empresaParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaParametroFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaParametroFormularioIva=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaParametroFormularioIva.setToolTipText(ParametroFormularioIvaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutParametroFormularioIva = new GridBagLayout();
		this.jPanelid_empresaParametroFormularioIva.setLayout(this.gridaBagLayoutParametroFormularioIva);


		jComboBoxid_empresaParametroFormularioIva= new JComboBoxMe();
		jComboBoxid_empresaParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaParametroFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaParametroFormularioIva.setEnabled(false);

		this.jButtonid_empresaParametroFormularioIva= new JButtonMe();
		this.jButtonid_empresaParametroFormularioIva.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaParametroFormularioIva.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaParametroFormularioIva.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaParametroFormularioIva.setText("Buscar");
		this.jButtonid_empresaParametroFormularioIva.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaParametroFormularioIva.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaParametroFormularioIva,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaParametroFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaParametroFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaParametroFormularioIva"));

		this.jButtonid_empresaParametroFormularioIvaBusqueda= new JButtonMe();
		this.jButtonid_empresaParametroFormularioIvaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroFormularioIvaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroFormularioIvaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaParametroFormularioIvaBusqueda.setText("U");
		this.jButtonid_empresaParametroFormularioIvaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaParametroFormularioIvaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaParametroFormularioIvaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaParametroFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaParametroFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaParametroFormularioIvaBusqueda"));

		if(this.parametroformularioivaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaParametroFormularioIvaBusqueda.setVisible(false);		}

		this.jButtonid_empresaParametroFormularioIvaUpdate= new JButtonMe();
		this.jButtonid_empresaParametroFormularioIvaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroFormularioIvaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroFormularioIvaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaParametroFormularioIvaUpdate.setText("U");
		this.jButtonid_empresaParametroFormularioIvaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaParametroFormularioIvaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaParametroFormularioIvaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaParametroFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaParametroFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaParametroFormularioIvaUpdate"));



					
		this.jLabelid_tipo_parametro_formulario_ivaParametroFormularioIva = new JLabelMe();
		this.jLabelid_tipo_parametro_formulario_ivaParametroFormularioIva.setText(""+ParametroFormularioIvaConstantesFunciones.LABEL_IDTIPOPARAMETROFORMULARIOIVA+" : *");
		this.jLabelid_tipo_parametro_formulario_ivaParametroFormularioIva.setToolTipText("Tipo Parametro");
		this.jLabelid_tipo_parametro_formulario_ivaParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_parametro_formulario_ivaParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_parametro_formulario_ivaParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_parametro_formulario_ivaParametroFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_parametro_formulario_ivaParametroFormularioIva=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_parametro_formulario_ivaParametroFormularioIva.setToolTipText(ParametroFormularioIvaConstantesFunciones.LABEL_IDTIPOPARAMETROFORMULARIOIVA);
		this.gridaBagLayoutParametroFormularioIva = new GridBagLayout();
		this.jPanelid_tipo_parametro_formulario_ivaParametroFormularioIva.setLayout(this.gridaBagLayoutParametroFormularioIva);


		jComboBoxid_tipo_parametro_formulario_ivaParametroFormularioIva= new JComboBoxMe();
		jComboBoxid_tipo_parametro_formulario_ivaParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,150),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_parametro_formulario_ivaParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,150),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_parametro_formulario_ivaParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,150),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_parametro_formulario_ivaParametroFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_parametro_formulario_ivaParametroFormularioIva= new JButtonMe();
		this.jButtonid_tipo_parametro_formulario_ivaParametroFormularioIva.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_parametro_formulario_ivaParametroFormularioIva.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_parametro_formulario_ivaParametroFormularioIva.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_parametro_formulario_ivaParametroFormularioIva.setText("Buscar");
		this.jButtonid_tipo_parametro_formulario_ivaParametroFormularioIva.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_parametro_formulario_ivaParametroFormularioIva.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_parametro_formulario_ivaParametroFormularioIva,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_parametro_formulario_ivaParametroFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_parametro_formulario_ivaParametroFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_parametro_formulario_ivaParametroFormularioIva"));

		this.jButtonid_tipo_parametro_formulario_ivaParametroFormularioIvaBusqueda= new JButtonMe();
		this.jButtonid_tipo_parametro_formulario_ivaParametroFormularioIvaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_parametro_formulario_ivaParametroFormularioIvaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_parametro_formulario_ivaParametroFormularioIvaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_parametro_formulario_ivaParametroFormularioIvaBusqueda.setText("U");
		this.jButtonid_tipo_parametro_formulario_ivaParametroFormularioIvaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_parametro_formulario_ivaParametroFormularioIvaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_parametro_formulario_ivaParametroFormularioIvaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_parametro_formulario_ivaParametroFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_parametro_formulario_ivaParametroFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_parametro_formulario_ivaParametroFormularioIvaBusqueda"));

		if(this.parametroformularioivaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_parametro_formulario_ivaParametroFormularioIvaBusqueda.setVisible(false);		}

		this.jButtonid_tipo_parametro_formulario_ivaParametroFormularioIvaUpdate= new JButtonMe();
		this.jButtonid_tipo_parametro_formulario_ivaParametroFormularioIvaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_parametro_formulario_ivaParametroFormularioIvaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_parametro_formulario_ivaParametroFormularioIvaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_parametro_formulario_ivaParametroFormularioIvaUpdate.setText("U");
		this.jButtonid_tipo_parametro_formulario_ivaParametroFormularioIvaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_parametro_formulario_ivaParametroFormularioIvaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_parametro_formulario_ivaParametroFormularioIvaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_parametro_formulario_ivaParametroFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_parametro_formulario_ivaParametroFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_parametro_formulario_ivaParametroFormularioIvaUpdate"));



					
		this.jLabelid_grupo_parametro_formulario_ivaParametroFormularioIva = new JLabelMe();
		this.jLabelid_grupo_parametro_formulario_ivaParametroFormularioIva.setText(""+ParametroFormularioIvaConstantesFunciones.LABEL_IDGRUPOPARAMETROFORMULARIOIVA+" : *");
		this.jLabelid_grupo_parametro_formulario_ivaParametroFormularioIva.setToolTipText("Grupo Parametro");
		this.jLabelid_grupo_parametro_formulario_ivaParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_grupo_parametro_formulario_ivaParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_grupo_parametro_formulario_ivaParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_grupo_parametro_formulario_ivaParametroFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_grupo_parametro_formulario_ivaParametroFormularioIva=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_grupo_parametro_formulario_ivaParametroFormularioIva.setToolTipText(ParametroFormularioIvaConstantesFunciones.LABEL_IDGRUPOPARAMETROFORMULARIOIVA);
		this.gridaBagLayoutParametroFormularioIva = new GridBagLayout();
		this.jPanelid_grupo_parametro_formulario_ivaParametroFormularioIva.setLayout(this.gridaBagLayoutParametroFormularioIva);


		jComboBoxid_grupo_parametro_formulario_ivaParametroFormularioIva= new JComboBoxMe();
		jComboBoxid_grupo_parametro_formulario_ivaParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_parametro_formulario_ivaParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_parametro_formulario_ivaParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_grupo_parametro_formulario_ivaParametroFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_grupo_parametro_formulario_ivaParametroFormularioIva= new JButtonMe();
		this.jButtonid_grupo_parametro_formulario_ivaParametroFormularioIva.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_grupo_parametro_formulario_ivaParametroFormularioIva.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_grupo_parametro_formulario_ivaParametroFormularioIva.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_grupo_parametro_formulario_ivaParametroFormularioIva.setText("Buscar");
		this.jButtonid_grupo_parametro_formulario_ivaParametroFormularioIva.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_grupo_parametro_formulario_ivaParametroFormularioIva.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_grupo_parametro_formulario_ivaParametroFormularioIva,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_grupo_parametro_formulario_ivaParametroFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_grupo_parametro_formulario_ivaParametroFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_grupo_parametro_formulario_ivaParametroFormularioIva"));

		this.jButtonid_grupo_parametro_formulario_ivaParametroFormularioIvaBusqueda= new JButtonMe();
		this.jButtonid_grupo_parametro_formulario_ivaParametroFormularioIvaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_grupo_parametro_formulario_ivaParametroFormularioIvaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_grupo_parametro_formulario_ivaParametroFormularioIvaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_grupo_parametro_formulario_ivaParametroFormularioIvaBusqueda.setText("U");
		this.jButtonid_grupo_parametro_formulario_ivaParametroFormularioIvaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_grupo_parametro_formulario_ivaParametroFormularioIvaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_grupo_parametro_formulario_ivaParametroFormularioIvaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_grupo_parametro_formulario_ivaParametroFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_grupo_parametro_formulario_ivaParametroFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_grupo_parametro_formulario_ivaParametroFormularioIvaBusqueda"));

		if(this.parametroformularioivaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_grupo_parametro_formulario_ivaParametroFormularioIvaBusqueda.setVisible(false);		}

		this.jButtonid_grupo_parametro_formulario_ivaParametroFormularioIvaUpdate= new JButtonMe();
		this.jButtonid_grupo_parametro_formulario_ivaParametroFormularioIvaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_grupo_parametro_formulario_ivaParametroFormularioIvaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_grupo_parametro_formulario_ivaParametroFormularioIvaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_grupo_parametro_formulario_ivaParametroFormularioIvaUpdate.setText("U");
		this.jButtonid_grupo_parametro_formulario_ivaParametroFormularioIvaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_grupo_parametro_formulario_ivaParametroFormularioIvaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_grupo_parametro_formulario_ivaParametroFormularioIvaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_grupo_parametro_formulario_ivaParametroFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_grupo_parametro_formulario_ivaParametroFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_grupo_parametro_formulario_ivaParametroFormularioIvaUpdate"));



					
		this.jLabelid_sub_grupo_parametro_formulario_ivaParametroFormularioIva = new JLabelMe();
		this.jLabelid_sub_grupo_parametro_formulario_ivaParametroFormularioIva.setText(""+ParametroFormularioIvaConstantesFunciones.LABEL_IDSUBGRUPOPARAMETROFORMULARIOIVA+" : *");
		this.jLabelid_sub_grupo_parametro_formulario_ivaParametroFormularioIva.setToolTipText("Sub Grupo Parametro");
		this.jLabelid_sub_grupo_parametro_formulario_ivaParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_sub_grupo_parametro_formulario_ivaParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_sub_grupo_parametro_formulario_ivaParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sub_grupo_parametro_formulario_ivaParametroFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sub_grupo_parametro_formulario_ivaParametroFormularioIva=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sub_grupo_parametro_formulario_ivaParametroFormularioIva.setToolTipText(ParametroFormularioIvaConstantesFunciones.LABEL_IDSUBGRUPOPARAMETROFORMULARIOIVA);
		this.gridaBagLayoutParametroFormularioIva = new GridBagLayout();
		this.jPanelid_sub_grupo_parametro_formulario_ivaParametroFormularioIva.setLayout(this.gridaBagLayoutParametroFormularioIva);


		jComboBoxid_sub_grupo_parametro_formulario_ivaParametroFormularioIva= new JComboBoxMe();
		jComboBoxid_sub_grupo_parametro_formulario_ivaParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sub_grupo_parametro_formulario_ivaParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sub_grupo_parametro_formulario_ivaParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sub_grupo_parametro_formulario_ivaParametroFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_sub_grupo_parametro_formulario_ivaParametroFormularioIva= new JButtonMe();
		this.jButtonid_sub_grupo_parametro_formulario_ivaParametroFormularioIva.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sub_grupo_parametro_formulario_ivaParametroFormularioIva.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sub_grupo_parametro_formulario_ivaParametroFormularioIva.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sub_grupo_parametro_formulario_ivaParametroFormularioIva.setText("Buscar");
		this.jButtonid_sub_grupo_parametro_formulario_ivaParametroFormularioIva.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sub_grupo_parametro_formulario_ivaParametroFormularioIva.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sub_grupo_parametro_formulario_ivaParametroFormularioIva,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sub_grupo_parametro_formulario_ivaParametroFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sub_grupo_parametro_formulario_ivaParametroFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sub_grupo_parametro_formulario_ivaParametroFormularioIva"));

		this.jButtonid_sub_grupo_parametro_formulario_ivaParametroFormularioIvaBusqueda= new JButtonMe();
		this.jButtonid_sub_grupo_parametro_formulario_ivaParametroFormularioIvaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sub_grupo_parametro_formulario_ivaParametroFormularioIvaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sub_grupo_parametro_formulario_ivaParametroFormularioIvaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sub_grupo_parametro_formulario_ivaParametroFormularioIvaBusqueda.setText("U");
		this.jButtonid_sub_grupo_parametro_formulario_ivaParametroFormularioIvaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sub_grupo_parametro_formulario_ivaParametroFormularioIvaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sub_grupo_parametro_formulario_ivaParametroFormularioIvaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sub_grupo_parametro_formulario_ivaParametroFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sub_grupo_parametro_formulario_ivaParametroFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sub_grupo_parametro_formulario_ivaParametroFormularioIvaBusqueda"));

		if(this.parametroformularioivaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sub_grupo_parametro_formulario_ivaParametroFormularioIvaBusqueda.setVisible(false);		}

		this.jButtonid_sub_grupo_parametro_formulario_ivaParametroFormularioIvaUpdate= new JButtonMe();
		this.jButtonid_sub_grupo_parametro_formulario_ivaParametroFormularioIvaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sub_grupo_parametro_formulario_ivaParametroFormularioIvaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sub_grupo_parametro_formulario_ivaParametroFormularioIvaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sub_grupo_parametro_formulario_ivaParametroFormularioIvaUpdate.setText("U");
		this.jButtonid_sub_grupo_parametro_formulario_ivaParametroFormularioIvaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sub_grupo_parametro_formulario_ivaParametroFormularioIvaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sub_grupo_parametro_formulario_ivaParametroFormularioIvaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sub_grupo_parametro_formulario_ivaParametroFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sub_grupo_parametro_formulario_ivaParametroFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sub_grupo_parametro_formulario_ivaParametroFormularioIvaUpdate"));



					
		this.jLabelid_cuenta_contable1ParametroFormularioIva = new JLabelMe();
		this.jLabelid_cuenta_contable1ParametroFormularioIva.setText(""+ParametroFormularioIvaConstantesFunciones.LABEL_IDCUENTACONTABLE1+" : *");
		this.jLabelid_cuenta_contable1ParametroFormularioIva.setToolTipText("Cuenta C. 1");
		this.jLabelid_cuenta_contable1ParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cuenta_contable1ParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cuenta_contable1ParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable1ParametroFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable1ParametroFormularioIva=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable1ParametroFormularioIva.setToolTipText(ParametroFormularioIvaConstantesFunciones.LABEL_IDCUENTACONTABLE1);
		this.gridaBagLayoutParametroFormularioIva = new GridBagLayout();
		this.jPanelid_cuenta_contable1ParametroFormularioIva.setLayout(this.gridaBagLayoutParametroFormularioIva);


		jComboBoxid_cuenta_contable1ParametroFormularioIva= new JComboBoxMe();
		jComboBoxid_cuenta_contable1ParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable1ParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable1ParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable1ParametroFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable1ParametroFormularioIva= new JButtonMe();
		this.jButtonid_cuenta_contable1ParametroFormularioIva.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable1ParametroFormularioIva.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable1ParametroFormularioIva.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable1ParametroFormularioIva.setText("Buscar");
		this.jButtonid_cuenta_contable1ParametroFormularioIva.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable1ParametroFormularioIva.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable1ParametroFormularioIva,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable1ParametroFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable1ParametroFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable1ParametroFormularioIva"));

		this.jButtonid_cuenta_contable1ParametroFormularioIvaBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable1ParametroFormularioIvaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable1ParametroFormularioIvaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable1ParametroFormularioIvaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable1ParametroFormularioIvaBusqueda.setText("U");
		this.jButtonid_cuenta_contable1ParametroFormularioIvaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable1ParametroFormularioIvaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable1ParametroFormularioIvaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable1ParametroFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable1ParametroFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable1ParametroFormularioIvaBusqueda"));

		if(this.parametroformularioivaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable1ParametroFormularioIvaBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable1ParametroFormularioIvaUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable1ParametroFormularioIvaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable1ParametroFormularioIvaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable1ParametroFormularioIvaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable1ParametroFormularioIvaUpdate.setText("U");
		this.jButtonid_cuenta_contable1ParametroFormularioIvaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable1ParametroFormularioIvaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable1ParametroFormularioIvaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable1ParametroFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable1ParametroFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable1ParametroFormularioIvaUpdate"));


		jButtonid_cuenta_contable1ParametroFormularioIvaArbol= new JButtonMe();
		jButtonid_cuenta_contable1ParametroFormularioIvaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable1ParametroFormularioIvaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable1ParametroFormularioIvaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable1ParametroFormularioIvaArbol.setText("Arbol");
		jButtonid_cuenta_contable1ParametroFormularioIvaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable1ParametroFormularioIvaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable1ParametroFormularioIvaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable1ParametroFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable1ParametroFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable1ParametroFormularioIvaArbol"));



					
		this.jLabelid_cuenta_contable2ParametroFormularioIva = new JLabelMe();
		this.jLabelid_cuenta_contable2ParametroFormularioIva.setText(""+ParametroFormularioIvaConstantesFunciones.LABEL_IDCUENTACONTABLE2+" : *");
		this.jLabelid_cuenta_contable2ParametroFormularioIva.setToolTipText("Cuenta C. 2");
		this.jLabelid_cuenta_contable2ParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cuenta_contable2ParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cuenta_contable2ParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable2ParametroFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable2ParametroFormularioIva=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable2ParametroFormularioIva.setToolTipText(ParametroFormularioIvaConstantesFunciones.LABEL_IDCUENTACONTABLE2);
		this.gridaBagLayoutParametroFormularioIva = new GridBagLayout();
		this.jPanelid_cuenta_contable2ParametroFormularioIva.setLayout(this.gridaBagLayoutParametroFormularioIva);


		jComboBoxid_cuenta_contable2ParametroFormularioIva= new JComboBoxMe();
		jComboBoxid_cuenta_contable2ParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable2ParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable2ParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable2ParametroFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable2ParametroFormularioIva= new JButtonMe();
		this.jButtonid_cuenta_contable2ParametroFormularioIva.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable2ParametroFormularioIva.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable2ParametroFormularioIva.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable2ParametroFormularioIva.setText("Buscar");
		this.jButtonid_cuenta_contable2ParametroFormularioIva.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable2ParametroFormularioIva.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable2ParametroFormularioIva,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable2ParametroFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable2ParametroFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable2ParametroFormularioIva"));

		this.jButtonid_cuenta_contable2ParametroFormularioIvaBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable2ParametroFormularioIvaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable2ParametroFormularioIvaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable2ParametroFormularioIvaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable2ParametroFormularioIvaBusqueda.setText("U");
		this.jButtonid_cuenta_contable2ParametroFormularioIvaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable2ParametroFormularioIvaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable2ParametroFormularioIvaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable2ParametroFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable2ParametroFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable2ParametroFormularioIvaBusqueda"));

		if(this.parametroformularioivaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable2ParametroFormularioIvaBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable2ParametroFormularioIvaUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable2ParametroFormularioIvaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable2ParametroFormularioIvaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable2ParametroFormularioIvaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable2ParametroFormularioIvaUpdate.setText("U");
		this.jButtonid_cuenta_contable2ParametroFormularioIvaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable2ParametroFormularioIvaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable2ParametroFormularioIvaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable2ParametroFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable2ParametroFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable2ParametroFormularioIvaUpdate"));


		jButtonid_cuenta_contable2ParametroFormularioIvaArbol= new JButtonMe();
		jButtonid_cuenta_contable2ParametroFormularioIvaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable2ParametroFormularioIvaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable2ParametroFormularioIvaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable2ParametroFormularioIvaArbol.setText("Arbol");
		jButtonid_cuenta_contable2ParametroFormularioIvaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable2ParametroFormularioIvaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable2ParametroFormularioIvaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable2ParametroFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable2ParametroFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable2ParametroFormularioIvaArbol"));



					
		this.jLabelid_cuenta_contable3ParametroFormularioIva = new JLabelMe();
		this.jLabelid_cuenta_contable3ParametroFormularioIva.setText(""+ParametroFormularioIvaConstantesFunciones.LABEL_IDCUENTACONTABLE3+" : *");
		this.jLabelid_cuenta_contable3ParametroFormularioIva.setToolTipText("Cuenta C. 3");
		this.jLabelid_cuenta_contable3ParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cuenta_contable3ParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cuenta_contable3ParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable3ParametroFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable3ParametroFormularioIva=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable3ParametroFormularioIva.setToolTipText(ParametroFormularioIvaConstantesFunciones.LABEL_IDCUENTACONTABLE3);
		this.gridaBagLayoutParametroFormularioIva = new GridBagLayout();
		this.jPanelid_cuenta_contable3ParametroFormularioIva.setLayout(this.gridaBagLayoutParametroFormularioIva);


		jComboBoxid_cuenta_contable3ParametroFormularioIva= new JComboBoxMe();
		jComboBoxid_cuenta_contable3ParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable3ParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable3ParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable3ParametroFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable3ParametroFormularioIva= new JButtonMe();
		this.jButtonid_cuenta_contable3ParametroFormularioIva.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable3ParametroFormularioIva.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable3ParametroFormularioIva.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable3ParametroFormularioIva.setText("Buscar");
		this.jButtonid_cuenta_contable3ParametroFormularioIva.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable3ParametroFormularioIva.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable3ParametroFormularioIva,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable3ParametroFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable3ParametroFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable3ParametroFormularioIva"));

		this.jButtonid_cuenta_contable3ParametroFormularioIvaBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable3ParametroFormularioIvaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable3ParametroFormularioIvaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable3ParametroFormularioIvaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable3ParametroFormularioIvaBusqueda.setText("U");
		this.jButtonid_cuenta_contable3ParametroFormularioIvaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable3ParametroFormularioIvaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable3ParametroFormularioIvaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable3ParametroFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable3ParametroFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable3ParametroFormularioIvaBusqueda"));

		if(this.parametroformularioivaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable3ParametroFormularioIvaBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable3ParametroFormularioIvaUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable3ParametroFormularioIvaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable3ParametroFormularioIvaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable3ParametroFormularioIvaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable3ParametroFormularioIvaUpdate.setText("U");
		this.jButtonid_cuenta_contable3ParametroFormularioIvaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable3ParametroFormularioIvaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable3ParametroFormularioIvaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable3ParametroFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable3ParametroFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable3ParametroFormularioIvaUpdate"));


		jButtonid_cuenta_contable3ParametroFormularioIvaArbol= new JButtonMe();
		jButtonid_cuenta_contable3ParametroFormularioIvaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable3ParametroFormularioIvaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable3ParametroFormularioIvaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable3ParametroFormularioIvaArbol.setText("Arbol");
		jButtonid_cuenta_contable3ParametroFormularioIvaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable3ParametroFormularioIvaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable3ParametroFormularioIvaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable3ParametroFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable3ParametroFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable3ParametroFormularioIvaArbol"));



					
		this.jLabelid_cuenta_contable4ParametroFormularioIva = new JLabelMe();
		this.jLabelid_cuenta_contable4ParametroFormularioIva.setText(""+ParametroFormularioIvaConstantesFunciones.LABEL_IDCUENTACONTABLE4+" : *");
		this.jLabelid_cuenta_contable4ParametroFormularioIva.setToolTipText("Cuenta C. 4");
		this.jLabelid_cuenta_contable4ParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cuenta_contable4ParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cuenta_contable4ParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable4ParametroFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable4ParametroFormularioIva=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable4ParametroFormularioIva.setToolTipText(ParametroFormularioIvaConstantesFunciones.LABEL_IDCUENTACONTABLE4);
		this.gridaBagLayoutParametroFormularioIva = new GridBagLayout();
		this.jPanelid_cuenta_contable4ParametroFormularioIva.setLayout(this.gridaBagLayoutParametroFormularioIva);


		jComboBoxid_cuenta_contable4ParametroFormularioIva= new JComboBoxMe();
		jComboBoxid_cuenta_contable4ParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable4ParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable4ParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable4ParametroFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable4ParametroFormularioIva= new JButtonMe();
		this.jButtonid_cuenta_contable4ParametroFormularioIva.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable4ParametroFormularioIva.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable4ParametroFormularioIva.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable4ParametroFormularioIva.setText("Buscar");
		this.jButtonid_cuenta_contable4ParametroFormularioIva.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable4ParametroFormularioIva.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable4ParametroFormularioIva,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable4ParametroFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable4ParametroFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable4ParametroFormularioIva"));

		this.jButtonid_cuenta_contable4ParametroFormularioIvaBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable4ParametroFormularioIvaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable4ParametroFormularioIvaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable4ParametroFormularioIvaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable4ParametroFormularioIvaBusqueda.setText("U");
		this.jButtonid_cuenta_contable4ParametroFormularioIvaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable4ParametroFormularioIvaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable4ParametroFormularioIvaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable4ParametroFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable4ParametroFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable4ParametroFormularioIvaBusqueda"));

		if(this.parametroformularioivaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable4ParametroFormularioIvaBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable4ParametroFormularioIvaUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable4ParametroFormularioIvaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable4ParametroFormularioIvaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable4ParametroFormularioIvaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable4ParametroFormularioIvaUpdate.setText("U");
		this.jButtonid_cuenta_contable4ParametroFormularioIvaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable4ParametroFormularioIvaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable4ParametroFormularioIvaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable4ParametroFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable4ParametroFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable4ParametroFormularioIvaUpdate"));


		jButtonid_cuenta_contable4ParametroFormularioIvaArbol= new JButtonMe();
		jButtonid_cuenta_contable4ParametroFormularioIvaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable4ParametroFormularioIvaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable4ParametroFormularioIvaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable4ParametroFormularioIvaArbol.setText("Arbol");
		jButtonid_cuenta_contable4ParametroFormularioIvaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable4ParametroFormularioIvaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable4ParametroFormularioIvaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable4ParametroFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable4ParametroFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable4ParametroFormularioIvaArbol"));



					
		this.jLabelid_cuenta_contable5ParametroFormularioIva = new JLabelMe();
		this.jLabelid_cuenta_contable5ParametroFormularioIva.setText(""+ParametroFormularioIvaConstantesFunciones.LABEL_IDCUENTACONTABLE5+" : *");
		this.jLabelid_cuenta_contable5ParametroFormularioIva.setToolTipText("Cuenta C. 5");
		this.jLabelid_cuenta_contable5ParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cuenta_contable5ParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cuenta_contable5ParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable5ParametroFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable5ParametroFormularioIva=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable5ParametroFormularioIva.setToolTipText(ParametroFormularioIvaConstantesFunciones.LABEL_IDCUENTACONTABLE5);
		this.gridaBagLayoutParametroFormularioIva = new GridBagLayout();
		this.jPanelid_cuenta_contable5ParametroFormularioIva.setLayout(this.gridaBagLayoutParametroFormularioIva);


		jComboBoxid_cuenta_contable5ParametroFormularioIva= new JComboBoxMe();
		jComboBoxid_cuenta_contable5ParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable5ParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable5ParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable5ParametroFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable5ParametroFormularioIva= new JButtonMe();
		this.jButtonid_cuenta_contable5ParametroFormularioIva.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable5ParametroFormularioIva.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable5ParametroFormularioIva.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable5ParametroFormularioIva.setText("Buscar");
		this.jButtonid_cuenta_contable5ParametroFormularioIva.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable5ParametroFormularioIva.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable5ParametroFormularioIva,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable5ParametroFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable5ParametroFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable5ParametroFormularioIva"));

		this.jButtonid_cuenta_contable5ParametroFormularioIvaBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable5ParametroFormularioIvaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable5ParametroFormularioIvaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable5ParametroFormularioIvaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable5ParametroFormularioIvaBusqueda.setText("U");
		this.jButtonid_cuenta_contable5ParametroFormularioIvaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable5ParametroFormularioIvaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable5ParametroFormularioIvaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable5ParametroFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable5ParametroFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable5ParametroFormularioIvaBusqueda"));

		if(this.parametroformularioivaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable5ParametroFormularioIvaBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable5ParametroFormularioIvaUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable5ParametroFormularioIvaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable5ParametroFormularioIvaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable5ParametroFormularioIvaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable5ParametroFormularioIvaUpdate.setText("U");
		this.jButtonid_cuenta_contable5ParametroFormularioIvaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable5ParametroFormularioIvaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable5ParametroFormularioIvaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable5ParametroFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable5ParametroFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable5ParametroFormularioIvaUpdate"));


		jButtonid_cuenta_contable5ParametroFormularioIvaArbol= new JButtonMe();
		jButtonid_cuenta_contable5ParametroFormularioIvaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable5ParametroFormularioIvaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable5ParametroFormularioIvaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable5ParametroFormularioIvaArbol.setText("Arbol");
		jButtonid_cuenta_contable5ParametroFormularioIvaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable5ParametroFormularioIvaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable5ParametroFormularioIvaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable5ParametroFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable5ParametroFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable5ParametroFormularioIvaArbol"));



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
		//this.jInternalFrameDetalleParametroFormularioIva = new ParametroFormularioIvaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Parametro Formulario Iva DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutParametroFormularioIva= new GridBagLayout();
		

		
		String sToolTipParametroFormularioIva="";
		sToolTipParametroFormularioIva=ParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipParametroFormularioIva+="(Contabilidad.ParametroFormularioIva)";
		}
		
		if(!this.parametroformularioivaSessionBean.getEsGuardarRelacionado()) {
			sToolTipParametroFormularioIva+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoParametroFormularioIva = new JButtonMe();
		this.jButtonModificarParametroFormularioIva = new JButtonMe();
        this.jButtonActualizarParametroFormularioIva = new JButtonMe();
        this.jButtonEliminarParametroFormularioIva = new JButtonMe();
        this.jButtonCancelarParametroFormularioIva = new JButtonMe();
        this.jButtonGuardarCambiosParametroFormularioIva = new JButtonMe();
		this.jButtonGuardarCambiosTablaParametroFormularioIva = new JButtonMe();
		this.jButtonCerrarParametroFormularioIva = new JButtonMe();
		
		this.jScrollPanelDatosParametroFormularioIva = new JScrollPane();   
        this.jScrollPanelDatosEdicionParametroFormularioIva = new JScrollPane();
		this.jScrollPanelDatosGeneralParametroFormularioIva = new JScrollPane();
				
		
		
		this.jPanelCamposParametroFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosParametroFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesParametroFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioParametroFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		this.jTabbedPaneCamposParametroFormularioIva=new JTabbedPane();
		
		
		this.jTabbedPaneCamposParametroFormularioIva.setBorder(javax.swing.BorderFactory.createEmptyBorder());//javax.swing.BorderFactory.createTitledBorder("Campos")
		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneCamposParametroFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciogeneralParametroFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciocuenta_contableParametroFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		;
		//}
		
		this.sPath=" <---> Acceso: Parametro Formulario Iva";
		
		if(!this.parametroformularioivaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Formulario Ivas" + this.sPath));
		} else {
			this.jScrollPanelDatosParametroFormularioIva.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposParametroFormularioIva.setName("jPanelCamposParametroFormularioIva"); 

		this.jPanelCamposOcultosParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosParametroFormularioIva.setName("jPanelCamposOcultosParametroFormularioIva"); 

        this.jPanelAccionesParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesParametroFormularioIva.setToolTipText("Acciones");
        this.jPanelAccionesParametroFormularioIva.setName("Acciones"); 

		this.jPanelAccionesFormularioParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioParametroFormularioIva.setToolTipText("Acciones");
        this.jPanelAccionesFormularioParametroFormularioIva.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciogeneralParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));
		this.jPanelCamposIniciogeneralParametroFormularioIva.setName("jPanelCamposFingeneralParametroFormularioIva");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciocuenta_contableParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Cuenta Contable"));
		this.jPanelCamposIniciocuenta_contableParametroFormularioIva.setName("jPanelCamposFincuenta_contableParametroFormularioIva");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciocuenta_contableParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoParametroFormularioIva.setText("Nuevo");
		this.jButtonModificarParametroFormularioIva.setText("Editar");
        this.jButtonActualizarParametroFormularioIva.setText("Actualizar");
        this.jButtonEliminarParametroFormularioIva.setText("Eliminar");
        this.jButtonCancelarParametroFormularioIva.setText("Cancelar");
        this.jButtonGuardarCambiosParametroFormularioIva.setText("Guardar");
		this.jButtonGuardarCambiosTablaParametroFormularioIva.setText("Guardar");
		this.jButtonCerrarParametroFormularioIva.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoParametroFormularioIva,"nuevo_button","Nuevo",this.parametroformularioivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarParametroFormularioIva,"modificar_button","Editar",this.parametroformularioivaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarParametroFormularioIva,"actualizar_button","Actualizar",this.parametroformularioivaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarParametroFormularioIva,"eliminar_button","Eliminar",this.parametroformularioivaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarParametroFormularioIva,"cancelar_button","Cancelar",this.parametroformularioivaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosParametroFormularioIva,"guardarcambios_button","Guardar",this.parametroformularioivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaParametroFormularioIva,"guardarcambiostabla_button","Guardar",this.parametroformularioivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarParametroFormularioIva,"cerrar_button","Salir",this.parametroformularioivaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoParametroFormularioIva.setToolTipText("Nuevo"+" "+ParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarParametroFormularioIva.setToolTipText("Editar"+" "+ParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarParametroFormularioIva.setToolTipText("Actualizar"+" "+ParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarParametroFormularioIva.setToolTipText("Eliminar)"+" "+ParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarParametroFormularioIva.setToolTipText("Cancelar"+" "+ParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosParametroFormularioIva.setToolTipText("Guardar"+" "+ParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaParametroFormularioIva.setToolTipText("Guardar"+" "+ParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarParametroFormularioIva.setToolTipText("Salir"+" "+ParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoParametroFormularioIva";
		inputMap = this.jButtonNuevoParametroFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoParametroFormularioIva.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoParametroFormularioIva"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarParametroFormularioIva";
		inputMap = this.jButtonActualizarParametroFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarParametroFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarParametroFormularioIva"));
		
		//ELIMINAR
		sMapKey = "EliminarParametroFormularioIva";
		inputMap = this.jButtonEliminarParametroFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarParametroFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarParametroFormularioIva"));
		
		//CANCELAR	
		sMapKey = "CancelarParametroFormularioIva";
		inputMap = this.jButtonCancelarParametroFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarParametroFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarParametroFormularioIva"));
		
		//CERRAR		
		sMapKey = "CerrarParametroFormularioIva";
		inputMap = this.jButtonCerrarParametroFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarParametroFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarParametroFormularioIva"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaParametroFormularioIva";
		inputMap = this.jButtonGuardarCambiosTablaParametroFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaParametroFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaParametroFormularioIva"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoParametroFormularioIva = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoParametroFormularioIva.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoParametroFormularioIva.setToolTipText("Nuevo ParametroFormularioIva");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarParametroFormularioIva = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarParametroFormularioIva.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarParametroFormularioIva.setToolTipText("Sin Cerrar Ventana ParametroFormularioIva");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeParametroFormularioIva = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeParametroFormularioIva.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeParametroFormularioIva.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesParametroFormularioIva = new JComboBoxMe();
		//this.jComboBoxTiposAccionesParametroFormularioIva.setText("Accion");
		this.jComboBoxTiposAccionesParametroFormularioIva.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioParametroFormularioIva = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioParametroFormularioIva.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioParametroFormularioIva.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesParametroFormularioIva = new JLabelMe();
		
		this.jLabelAccionesParametroFormularioIva.setText("Acciones");		
		this.jLabelAccionesParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposParametroFormularioIva();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysParametroFormularioIva();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesParametroFormularioIva=new JTabbedPane();
		this.jTabbedPaneRelacionesParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesParametroFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesParametroFormularioIva.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroFormularioIva.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroFormularioIva.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioParametroFormularioIva.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioParametroFormularioIva.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioParametroFormularioIva.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposParametroFormularioIva = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosParametroFormularioIva = new GridBagLayout();
		
		this.jPanelCamposParametroFormularioIva.setLayout(gridaBagLayoutCamposParametroFormularioIva);
		this.jPanelCamposOcultosParametroFormularioIva.setLayout(gridaBagLayoutCamposOcultosParametroFormularioIva);
		
		

		GridBagLayout gridaBagLayoutCamposIniciogeneralParametroFormularioIva= new GridBagLayout();
		this.jPanelCamposIniciogeneralParametroFormularioIva.setLayout(gridaBagLayoutCamposIniciogeneralParametroFormularioIva);

		GridBagLayout gridaBagLayoutCamposIniciocuenta_contableParametroFormularioIva= new GridBagLayout();
		this.jPanelCamposIniciocuenta_contableParametroFormularioIva.setLayout(gridaBagLayoutCamposIniciocuenta_contableParametroFormularioIva);;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFormularioIva.gridy = 0;
	this.gridBagConstraintsParametroFormularioIva.gridx = 0;
	this.gridBagConstraintsParametroFormularioIva.ipadx = 0;
	this.gridBagConstraintsParametroFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidParametroFormularioIva.add(jLabelIdParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);



	this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFormularioIva.gridy = 0;
	this.gridBagConstraintsParametroFormularioIva.gridx = 1;
	this.gridBagConstraintsParametroFormularioIva.ipadx = 0;
	this.gridBagConstraintsParametroFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidParametroFormularioIva.add(jLabelidParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);


	this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFormularioIva.gridy = 0;
	this.gridBagConstraintsParametroFormularioIva.gridx = 0;
	this.gridBagConstraintsParametroFormularioIva.ipadx = 0;
	this.gridBagConstraintsParametroFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaParametroFormularioIva.add(jLabelid_empresaParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		//this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFormularioIva.gridy = 0;
		this.gridBagConstraintsParametroFormularioIva.gridx = 2;
		this.gridBagConstraintsParametroFormularioIva.ipadx = 0;
		this.gridBagConstraintsParametroFormularioIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaParametroFormularioIva.add(jButtonid_empresaParametroFormularioIvaBusqueda, this.gridBagConstraintsParametroFormularioIva);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		//this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFormularioIva.gridy = 0;
		this.gridBagConstraintsParametroFormularioIva.gridx = 3;
		this.gridBagConstraintsParametroFormularioIva.ipadx = 0;
		this.gridBagConstraintsParametroFormularioIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaParametroFormularioIva.add(jButtonid_empresaParametroFormularioIvaUpdate, this.gridBagConstraintsParametroFormularioIva);
	}

	this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFormularioIva.gridy = 0;
	this.gridBagConstraintsParametroFormularioIva.gridx = 1;
	this.gridBagConstraintsParametroFormularioIva.ipadx = 0;
	this.gridBagConstraintsParametroFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaParametroFormularioIva.add(jComboBoxid_empresaParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);


	this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFormularioIva.gridy = 0;
	this.gridBagConstraintsParametroFormularioIva.gridx = 0;
	this.gridBagConstraintsParametroFormularioIva.ipadx = 0;
	this.gridBagConstraintsParametroFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_parametro_formulario_ivaParametroFormularioIva.add(jLabelid_tipo_parametro_formulario_ivaParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		//this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFormularioIva.gridy = 0;
		this.gridBagConstraintsParametroFormularioIva.gridx = 2;
		this.gridBagConstraintsParametroFormularioIva.ipadx = 0;
		this.gridBagConstraintsParametroFormularioIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_parametro_formulario_ivaParametroFormularioIva.add(jButtonid_tipo_parametro_formulario_ivaParametroFormularioIvaBusqueda, this.gridBagConstraintsParametroFormularioIva);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		//this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFormularioIva.gridy = 0;
		this.gridBagConstraintsParametroFormularioIva.gridx = 3;
		this.gridBagConstraintsParametroFormularioIva.ipadx = 0;
		this.gridBagConstraintsParametroFormularioIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_parametro_formulario_ivaParametroFormularioIva.add(jButtonid_tipo_parametro_formulario_ivaParametroFormularioIvaUpdate, this.gridBagConstraintsParametroFormularioIva);
	}

	this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFormularioIva.gridy = 0;
	this.gridBagConstraintsParametroFormularioIva.gridx = 1;
	this.gridBagConstraintsParametroFormularioIva.ipadx = 0;
	this.gridBagConstraintsParametroFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_parametro_formulario_ivaParametroFormularioIva.add(jComboBoxid_tipo_parametro_formulario_ivaParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);


	this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFormularioIva.gridy = 0;
	this.gridBagConstraintsParametroFormularioIva.gridx = 0;
	this.gridBagConstraintsParametroFormularioIva.ipadx = 0;
	this.gridBagConstraintsParametroFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_grupo_parametro_formulario_ivaParametroFormularioIva.add(jLabelid_grupo_parametro_formulario_ivaParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		//this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFormularioIva.gridy = 0;
		this.gridBagConstraintsParametroFormularioIva.gridx = 2;
		this.gridBagConstraintsParametroFormularioIva.ipadx = 0;
		this.gridBagConstraintsParametroFormularioIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_grupo_parametro_formulario_ivaParametroFormularioIva.add(jButtonid_grupo_parametro_formulario_ivaParametroFormularioIvaBusqueda, this.gridBagConstraintsParametroFormularioIva);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		//this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFormularioIva.gridy = 0;
		this.gridBagConstraintsParametroFormularioIva.gridx = 3;
		this.gridBagConstraintsParametroFormularioIva.ipadx = 0;
		this.gridBagConstraintsParametroFormularioIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_grupo_parametro_formulario_ivaParametroFormularioIva.add(jButtonid_grupo_parametro_formulario_ivaParametroFormularioIvaUpdate, this.gridBagConstraintsParametroFormularioIva);
	}

	this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFormularioIva.gridy = 0;
	this.gridBagConstraintsParametroFormularioIva.gridx = 1;
	this.gridBagConstraintsParametroFormularioIva.ipadx = 0;
	this.gridBagConstraintsParametroFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_grupo_parametro_formulario_ivaParametroFormularioIva.add(jComboBoxid_grupo_parametro_formulario_ivaParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);


	this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFormularioIva.gridy = 0;
	this.gridBagConstraintsParametroFormularioIva.gridx = 0;
	this.gridBagConstraintsParametroFormularioIva.ipadx = 0;
	this.gridBagConstraintsParametroFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sub_grupo_parametro_formulario_ivaParametroFormularioIva.add(jLabelid_sub_grupo_parametro_formulario_ivaParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		//this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFormularioIva.gridy = 0;
		this.gridBagConstraintsParametroFormularioIva.gridx = 2;
		this.gridBagConstraintsParametroFormularioIva.ipadx = 0;
		this.gridBagConstraintsParametroFormularioIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sub_grupo_parametro_formulario_ivaParametroFormularioIva.add(jButtonid_sub_grupo_parametro_formulario_ivaParametroFormularioIvaBusqueda, this.gridBagConstraintsParametroFormularioIva);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		//this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFormularioIva.gridy = 0;
		this.gridBagConstraintsParametroFormularioIva.gridx = 3;
		this.gridBagConstraintsParametroFormularioIva.ipadx = 0;
		this.gridBagConstraintsParametroFormularioIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sub_grupo_parametro_formulario_ivaParametroFormularioIva.add(jButtonid_sub_grupo_parametro_formulario_ivaParametroFormularioIvaUpdate, this.gridBagConstraintsParametroFormularioIva);
	}

	this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFormularioIva.gridy = 0;
	this.gridBagConstraintsParametroFormularioIva.gridx = 1;
	this.gridBagConstraintsParametroFormularioIva.ipadx = 0;
	this.gridBagConstraintsParametroFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sub_grupo_parametro_formulario_ivaParametroFormularioIva.add(jComboBoxid_sub_grupo_parametro_formulario_ivaParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);


	this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFormularioIva.gridy = 0;
	this.gridBagConstraintsParametroFormularioIva.gridx = 0;
	this.gridBagConstraintsParametroFormularioIva.ipadx = 0;
	this.gridBagConstraintsParametroFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelgrupoParametroFormularioIva.add(jLabelgrupoParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		//this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFormularioIva.gridy = 0;
		this.gridBagConstraintsParametroFormularioIva.gridx = 2;
		this.gridBagConstraintsParametroFormularioIva.ipadx = 0;
		this.gridBagConstraintsParametroFormularioIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelgrupoParametroFormularioIva.add(jButtongrupoParametroFormularioIvaBusqueda, this.gridBagConstraintsParametroFormularioIva);
	}

	this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFormularioIva.gridy = 0;
	this.gridBagConstraintsParametroFormularioIva.gridx = 1;
	this.gridBagConstraintsParametroFormularioIva.ipadx = 0;
	this.gridBagConstraintsParametroFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelgrupoParametroFormularioIva.add(jTextFieldgrupoParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);


	this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFormularioIva.gridy = 0;
	this.gridBagConstraintsParametroFormularioIva.gridx = 0;
	this.gridBagConstraintsParametroFormularioIva.ipadx = 0;
	this.gridBagConstraintsParametroFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelgrupo2ParametroFormularioIva.add(jLabelgrupo2ParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		//this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFormularioIva.gridy = 0;
		this.gridBagConstraintsParametroFormularioIva.gridx = 2;
		this.gridBagConstraintsParametroFormularioIva.ipadx = 0;
		this.gridBagConstraintsParametroFormularioIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelgrupo2ParametroFormularioIva.add(jButtongrupo2ParametroFormularioIvaBusqueda, this.gridBagConstraintsParametroFormularioIva);
	}

	this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFormularioIva.gridy = 0;
	this.gridBagConstraintsParametroFormularioIva.gridx = 1;
	this.gridBagConstraintsParametroFormularioIva.ipadx = 0;
	this.gridBagConstraintsParametroFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelgrupo2ParametroFormularioIva.add(jTextFieldgrupo2ParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);


	this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFormularioIva.gridy = 0;
	this.gridBagConstraintsParametroFormularioIva.gridx = 0;
	this.gridBagConstraintsParametroFormularioIva.ipadx = 0;
	this.gridBagConstraintsParametroFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_sriParametroFormularioIva.add(jLabelcodigo_sriParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		//this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFormularioIva.gridy = 0;
		this.gridBagConstraintsParametroFormularioIva.gridx = 2;
		this.gridBagConstraintsParametroFormularioIva.ipadx = 0;
		this.gridBagConstraintsParametroFormularioIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_sriParametroFormularioIva.add(jButtoncodigo_sriParametroFormularioIvaBusqueda, this.gridBagConstraintsParametroFormularioIva);
	}

	this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFormularioIva.gridy = 0;
	this.gridBagConstraintsParametroFormularioIva.gridx = 1;
	this.gridBagConstraintsParametroFormularioIva.ipadx = 0;
	this.gridBagConstraintsParametroFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_sriParametroFormularioIva.add(jTextFieldcodigo_sriParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);


	this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFormularioIva.gridy = 0;
	this.gridBagConstraintsParametroFormularioIva.gridx = 0;
	this.gridBagConstraintsParametroFormularioIva.ipadx = 0;
	this.gridBagConstraintsParametroFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreParametroFormularioIva.add(jLabelnombreParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		//this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFormularioIva.gridy = 0;
		this.gridBagConstraintsParametroFormularioIva.gridx = 2;
		this.gridBagConstraintsParametroFormularioIva.ipadx = 0;
		this.gridBagConstraintsParametroFormularioIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreParametroFormularioIva.add(jButtonnombreParametroFormularioIvaBusqueda, this.gridBagConstraintsParametroFormularioIva);
	}

	this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFormularioIva.gridy = 0;
	this.gridBagConstraintsParametroFormularioIva.gridx = 1;
	this.gridBagConstraintsParametroFormularioIva.ipadx = 0;
	this.gridBagConstraintsParametroFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreParametroFormularioIva.add(jscrollPanenombreParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);


	this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFormularioIva.gridy = 0;
	this.gridBagConstraintsParametroFormularioIva.gridx = 0;
	this.gridBagConstraintsParametroFormularioIva.ipadx = 0;
	this.gridBagConstraintsParametroFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentajeParametroFormularioIva.add(jLabelporcentajeParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		//this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFormularioIva.gridy = 0;
		this.gridBagConstraintsParametroFormularioIva.gridx = 2;
		this.gridBagConstraintsParametroFormularioIva.ipadx = 0;
		this.gridBagConstraintsParametroFormularioIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentajeParametroFormularioIva.add(jButtonporcentajeParametroFormularioIvaBusqueda, this.gridBagConstraintsParametroFormularioIva);
	}

	this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFormularioIva.gridy = 0;
	this.gridBagConstraintsParametroFormularioIva.gridx = 1;
	this.gridBagConstraintsParametroFormularioIva.ipadx = 0;
	this.gridBagConstraintsParametroFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentajeParametroFormularioIva.add(jTextFieldporcentajeParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);


	this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFormularioIva.gridy = 0;
	this.gridBagConstraintsParametroFormularioIva.gridx = 0;
	this.gridBagConstraintsParametroFormularioIva.ipadx = 0;
	this.gridBagConstraintsParametroFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_totalParametroFormularioIva.add(jLabelcon_totalParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		//this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFormularioIva.gridy = 0;
		this.gridBagConstraintsParametroFormularioIva.gridx = 2;
		this.gridBagConstraintsParametroFormularioIva.ipadx = 0;
		this.gridBagConstraintsParametroFormularioIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_totalParametroFormularioIva.add(jButtoncon_totalParametroFormularioIvaBusqueda, this.gridBagConstraintsParametroFormularioIva);
	}

	this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFormularioIva.gridy = 0;
	this.gridBagConstraintsParametroFormularioIva.gridx = 1;
	this.gridBagConstraintsParametroFormularioIva.ipadx = 0;
	this.gridBagConstraintsParametroFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_totalParametroFormularioIva.add(jCheckBoxcon_totalParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);


	this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFormularioIva.gridy = 0;
	this.gridBagConstraintsParametroFormularioIva.gridx = 0;
	this.gridBagConstraintsParametroFormularioIva.ipadx = 0;
	this.gridBagConstraintsParametroFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable1ParametroFormularioIva.add(jLabelid_cuenta_contable1ParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
	//this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFormularioIva.gridy = 0;
	this.gridBagConstraintsParametroFormularioIva.gridx = 2;
	this.gridBagConstraintsParametroFormularioIva.ipadx = 0;
	this.gridBagConstraintsParametroFormularioIva.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable1ParametroFormularioIva.add(jButtonid_cuenta_contable1ParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
	//this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFormularioIva.gridy = 0;
	this.gridBagConstraintsParametroFormularioIva.gridx = 3;
	this.gridBagConstraintsParametroFormularioIva.ipadx = 0;
	this.gridBagConstraintsParametroFormularioIva.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable1ParametroFormularioIva.add(jButtonid_cuenta_contable1ParametroFormularioIvaArbol, this.gridBagConstraintsParametroFormularioIva);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		//this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFormularioIva.gridy = 0;
		this.gridBagConstraintsParametroFormularioIva.gridx = 4;
		this.gridBagConstraintsParametroFormularioIva.ipadx = 0;
		this.gridBagConstraintsParametroFormularioIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable1ParametroFormularioIva.add(jButtonid_cuenta_contable1ParametroFormularioIvaBusqueda, this.gridBagConstraintsParametroFormularioIva);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		//this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFormularioIva.gridy = 0;
		this.gridBagConstraintsParametroFormularioIva.gridx = 5;
		this.gridBagConstraintsParametroFormularioIva.ipadx = 0;
		this.gridBagConstraintsParametroFormularioIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable1ParametroFormularioIva.add(jButtonid_cuenta_contable1ParametroFormularioIvaUpdate, this.gridBagConstraintsParametroFormularioIva);
	}

	this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFormularioIva.gridy = 0;
	this.gridBagConstraintsParametroFormularioIva.gridx = 1;
	this.gridBagConstraintsParametroFormularioIva.ipadx = 0;
	this.gridBagConstraintsParametroFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable1ParametroFormularioIva.add(jComboBoxid_cuenta_contable1ParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);


	this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFormularioIva.gridy = 0;
	this.gridBagConstraintsParametroFormularioIva.gridx = 0;
	this.gridBagConstraintsParametroFormularioIva.ipadx = 0;
	this.gridBagConstraintsParametroFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable2ParametroFormularioIva.add(jLabelid_cuenta_contable2ParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
	//this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFormularioIva.gridy = 0;
	this.gridBagConstraintsParametroFormularioIva.gridx = 2;
	this.gridBagConstraintsParametroFormularioIva.ipadx = 0;
	this.gridBagConstraintsParametroFormularioIva.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable2ParametroFormularioIva.add(jButtonid_cuenta_contable2ParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
	//this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFormularioIva.gridy = 0;
	this.gridBagConstraintsParametroFormularioIva.gridx = 3;
	this.gridBagConstraintsParametroFormularioIva.ipadx = 0;
	this.gridBagConstraintsParametroFormularioIva.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable2ParametroFormularioIva.add(jButtonid_cuenta_contable2ParametroFormularioIvaArbol, this.gridBagConstraintsParametroFormularioIva);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		//this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFormularioIva.gridy = 0;
		this.gridBagConstraintsParametroFormularioIva.gridx = 4;
		this.gridBagConstraintsParametroFormularioIva.ipadx = 0;
		this.gridBagConstraintsParametroFormularioIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable2ParametroFormularioIva.add(jButtonid_cuenta_contable2ParametroFormularioIvaBusqueda, this.gridBagConstraintsParametroFormularioIva);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		//this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFormularioIva.gridy = 0;
		this.gridBagConstraintsParametroFormularioIva.gridx = 5;
		this.gridBagConstraintsParametroFormularioIva.ipadx = 0;
		this.gridBagConstraintsParametroFormularioIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable2ParametroFormularioIva.add(jButtonid_cuenta_contable2ParametroFormularioIvaUpdate, this.gridBagConstraintsParametroFormularioIva);
	}

	this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFormularioIva.gridy = 0;
	this.gridBagConstraintsParametroFormularioIva.gridx = 1;
	this.gridBagConstraintsParametroFormularioIva.ipadx = 0;
	this.gridBagConstraintsParametroFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable2ParametroFormularioIva.add(jComboBoxid_cuenta_contable2ParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);


	this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFormularioIva.gridy = 0;
	this.gridBagConstraintsParametroFormularioIva.gridx = 0;
	this.gridBagConstraintsParametroFormularioIva.ipadx = 0;
	this.gridBagConstraintsParametroFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable3ParametroFormularioIva.add(jLabelid_cuenta_contable3ParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
	//this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFormularioIva.gridy = 0;
	this.gridBagConstraintsParametroFormularioIva.gridx = 2;
	this.gridBagConstraintsParametroFormularioIva.ipadx = 0;
	this.gridBagConstraintsParametroFormularioIva.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable3ParametroFormularioIva.add(jButtonid_cuenta_contable3ParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
	//this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFormularioIva.gridy = 0;
	this.gridBagConstraintsParametroFormularioIva.gridx = 3;
	this.gridBagConstraintsParametroFormularioIva.ipadx = 0;
	this.gridBagConstraintsParametroFormularioIva.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable3ParametroFormularioIva.add(jButtonid_cuenta_contable3ParametroFormularioIvaArbol, this.gridBagConstraintsParametroFormularioIva);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		//this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFormularioIva.gridy = 0;
		this.gridBagConstraintsParametroFormularioIva.gridx = 4;
		this.gridBagConstraintsParametroFormularioIva.ipadx = 0;
		this.gridBagConstraintsParametroFormularioIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable3ParametroFormularioIva.add(jButtonid_cuenta_contable3ParametroFormularioIvaBusqueda, this.gridBagConstraintsParametroFormularioIva);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		//this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFormularioIva.gridy = 0;
		this.gridBagConstraintsParametroFormularioIva.gridx = 5;
		this.gridBagConstraintsParametroFormularioIva.ipadx = 0;
		this.gridBagConstraintsParametroFormularioIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable3ParametroFormularioIva.add(jButtonid_cuenta_contable3ParametroFormularioIvaUpdate, this.gridBagConstraintsParametroFormularioIva);
	}

	this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFormularioIva.gridy = 0;
	this.gridBagConstraintsParametroFormularioIva.gridx = 1;
	this.gridBagConstraintsParametroFormularioIva.ipadx = 0;
	this.gridBagConstraintsParametroFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable3ParametroFormularioIva.add(jComboBoxid_cuenta_contable3ParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);


	this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFormularioIva.gridy = 0;
	this.gridBagConstraintsParametroFormularioIva.gridx = 0;
	this.gridBagConstraintsParametroFormularioIva.ipadx = 0;
	this.gridBagConstraintsParametroFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable4ParametroFormularioIva.add(jLabelid_cuenta_contable4ParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
	//this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFormularioIva.gridy = 0;
	this.gridBagConstraintsParametroFormularioIva.gridx = 2;
	this.gridBagConstraintsParametroFormularioIva.ipadx = 0;
	this.gridBagConstraintsParametroFormularioIva.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable4ParametroFormularioIva.add(jButtonid_cuenta_contable4ParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
	//this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFormularioIva.gridy = 0;
	this.gridBagConstraintsParametroFormularioIva.gridx = 3;
	this.gridBagConstraintsParametroFormularioIva.ipadx = 0;
	this.gridBagConstraintsParametroFormularioIva.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable4ParametroFormularioIva.add(jButtonid_cuenta_contable4ParametroFormularioIvaArbol, this.gridBagConstraintsParametroFormularioIva);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		//this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFormularioIva.gridy = 0;
		this.gridBagConstraintsParametroFormularioIva.gridx = 4;
		this.gridBagConstraintsParametroFormularioIva.ipadx = 0;
		this.gridBagConstraintsParametroFormularioIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable4ParametroFormularioIva.add(jButtonid_cuenta_contable4ParametroFormularioIvaBusqueda, this.gridBagConstraintsParametroFormularioIva);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		//this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFormularioIva.gridy = 0;
		this.gridBagConstraintsParametroFormularioIva.gridx = 5;
		this.gridBagConstraintsParametroFormularioIva.ipadx = 0;
		this.gridBagConstraintsParametroFormularioIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable4ParametroFormularioIva.add(jButtonid_cuenta_contable4ParametroFormularioIvaUpdate, this.gridBagConstraintsParametroFormularioIva);
	}

	this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFormularioIva.gridy = 0;
	this.gridBagConstraintsParametroFormularioIva.gridx = 1;
	this.gridBagConstraintsParametroFormularioIva.ipadx = 0;
	this.gridBagConstraintsParametroFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable4ParametroFormularioIva.add(jComboBoxid_cuenta_contable4ParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);


	this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFormularioIva.gridy = 0;
	this.gridBagConstraintsParametroFormularioIva.gridx = 0;
	this.gridBagConstraintsParametroFormularioIva.ipadx = 0;
	this.gridBagConstraintsParametroFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable5ParametroFormularioIva.add(jLabelid_cuenta_contable5ParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
	//this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFormularioIva.gridy = 0;
	this.gridBagConstraintsParametroFormularioIva.gridx = 2;
	this.gridBagConstraintsParametroFormularioIva.ipadx = 0;
	this.gridBagConstraintsParametroFormularioIva.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable5ParametroFormularioIva.add(jButtonid_cuenta_contable5ParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
	//this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFormularioIva.gridy = 0;
	this.gridBagConstraintsParametroFormularioIva.gridx = 3;
	this.gridBagConstraintsParametroFormularioIva.ipadx = 0;
	this.gridBagConstraintsParametroFormularioIva.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable5ParametroFormularioIva.add(jButtonid_cuenta_contable5ParametroFormularioIvaArbol, this.gridBagConstraintsParametroFormularioIva);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		//this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFormularioIva.gridy = 0;
		this.gridBagConstraintsParametroFormularioIva.gridx = 4;
		this.gridBagConstraintsParametroFormularioIva.ipadx = 0;
		this.gridBagConstraintsParametroFormularioIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable5ParametroFormularioIva.add(jButtonid_cuenta_contable5ParametroFormularioIvaBusqueda, this.gridBagConstraintsParametroFormularioIva);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		//this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFormularioIva.gridy = 0;
		this.gridBagConstraintsParametroFormularioIva.gridx = 5;
		this.gridBagConstraintsParametroFormularioIva.ipadx = 0;
		this.gridBagConstraintsParametroFormularioIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable5ParametroFormularioIva.add(jButtonid_cuenta_contable5ParametroFormularioIvaUpdate, this.gridBagConstraintsParametroFormularioIva);
	}

	this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFormularioIva.gridy = 0;
	this.gridBagConstraintsParametroFormularioIva.gridx = 1;
	this.gridBagConstraintsParametroFormularioIva.ipadx = 0;
	this.gridBagConstraintsParametroFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable5ParametroFormularioIva.add(jComboBoxid_cuenta_contable5ParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFormularioIva.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFormularioIva.gridy = iYPanelCamposParametroFormularioIva;
	this.gridBagConstraintsParametroFormularioIva.gridx = iXPanelCamposParametroFormularioIva++;
	this.gridBagConstraintsParametroFormularioIva.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroFormularioIva.add(this.jPanelidParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);



	if(iXPanelCamposParametroFormularioIva % 1==0) {
		iXPanelCamposParametroFormularioIva=0;
		iYPanelCamposParametroFormularioIva++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFormularioIva.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFormularioIva.gridy = iYPanelCamposOcultosParametroFormularioIva;
	this.gridBagConstraintsParametroFormularioIva.gridx = iXPanelCamposOcultosParametroFormularioIva++;
	this.gridBagConstraintsParametroFormularioIva.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosParametroFormularioIva.add(this.jPanelid_empresaParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);



	if(iXPanelCamposOcultosParametroFormularioIva % 1==0) {
		iXPanelCamposOcultosParametroFormularioIva=0;
		iYPanelCamposOcultosParametroFormularioIva++;
	}
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
	this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFormularioIva.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFormularioIva.gridy = iYPanelCamposIniciogeneralParametroFormularioIva;
	this.gridBagConstraintsParametroFormularioIva.gridx = iXPanelCamposIniciogeneralParametroFormularioIva++;
	this.gridBagConstraintsParametroFormularioIva.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralParametroFormularioIva.add(this.jPanelid_tipo_parametro_formulario_ivaParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);



	if(iXPanelCamposIniciogeneralParametroFormularioIva % 1==0) {
		iXPanelCamposIniciogeneralParametroFormularioIva=0;
		iYPanelCamposIniciogeneralParametroFormularioIva++;
	}
	this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFormularioIva.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFormularioIva.gridy = iYPanelCamposIniciogeneralParametroFormularioIva;
	this.gridBagConstraintsParametroFormularioIva.gridx = iXPanelCamposIniciogeneralParametroFormularioIva++;
	this.gridBagConstraintsParametroFormularioIva.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralParametroFormularioIva.add(this.jPanelid_grupo_parametro_formulario_ivaParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);



	if(iXPanelCamposIniciogeneralParametroFormularioIva % 1==0) {
		iXPanelCamposIniciogeneralParametroFormularioIva=0;
		iYPanelCamposIniciogeneralParametroFormularioIva++;
	}
	this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFormularioIva.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFormularioIva.gridy = iYPanelCamposIniciogeneralParametroFormularioIva;
	this.gridBagConstraintsParametroFormularioIva.gridx = iXPanelCamposIniciogeneralParametroFormularioIva++;
	this.gridBagConstraintsParametroFormularioIva.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralParametroFormularioIva.add(this.jPanelid_sub_grupo_parametro_formulario_ivaParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);



	if(iXPanelCamposIniciogeneralParametroFormularioIva % 1==0) {
		iXPanelCamposIniciogeneralParametroFormularioIva=0;
		iYPanelCamposIniciogeneralParametroFormularioIva++;
	}
	this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFormularioIva.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFormularioIva.gridy = iYPanelCamposIniciogeneralParametroFormularioIva;
	this.gridBagConstraintsParametroFormularioIva.gridx = iXPanelCamposIniciogeneralParametroFormularioIva++;
	this.gridBagConstraintsParametroFormularioIva.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralParametroFormularioIva.add(this.jPanelgrupoParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);



	if(iXPanelCamposIniciogeneralParametroFormularioIva % 1==0) {
		iXPanelCamposIniciogeneralParametroFormularioIva=0;
		iYPanelCamposIniciogeneralParametroFormularioIva++;
	}
	this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFormularioIva.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFormularioIva.gridy = iYPanelCamposIniciogeneralParametroFormularioIva;
	this.gridBagConstraintsParametroFormularioIva.gridx = iXPanelCamposIniciogeneralParametroFormularioIva++;
	this.gridBagConstraintsParametroFormularioIva.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralParametroFormularioIva.add(this.jPanelgrupo2ParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);



	if(iXPanelCamposIniciogeneralParametroFormularioIva % 1==0) {
		iXPanelCamposIniciogeneralParametroFormularioIva=0;
		iYPanelCamposIniciogeneralParametroFormularioIva++;
	}
	this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFormularioIva.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFormularioIva.gridy = iYPanelCamposIniciogeneralParametroFormularioIva;
	this.gridBagConstraintsParametroFormularioIva.gridx = iXPanelCamposIniciogeneralParametroFormularioIva++;
	this.gridBagConstraintsParametroFormularioIva.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralParametroFormularioIva.add(this.jPanelcodigo_sriParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);



	if(iXPanelCamposIniciogeneralParametroFormularioIva % 1==0) {
		iXPanelCamposIniciogeneralParametroFormularioIva=0;
		iYPanelCamposIniciogeneralParametroFormularioIva++;
	}
	this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFormularioIva.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFormularioIva.gridy = iYPanelCamposIniciogeneralParametroFormularioIva;
	this.gridBagConstraintsParametroFormularioIva.gridx = iXPanelCamposIniciogeneralParametroFormularioIva++;
	this.gridBagConstraintsParametroFormularioIva.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralParametroFormularioIva.add(this.jPanelnombreParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);



	if(iXPanelCamposIniciogeneralParametroFormularioIva % 1==0) {
		iXPanelCamposIniciogeneralParametroFormularioIva=0;
		iYPanelCamposIniciogeneralParametroFormularioIva++;
	}
	this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFormularioIva.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFormularioIva.gridy = iYPanelCamposIniciogeneralParametroFormularioIva;
	this.gridBagConstraintsParametroFormularioIva.gridx = iXPanelCamposIniciogeneralParametroFormularioIva++;
	this.gridBagConstraintsParametroFormularioIva.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralParametroFormularioIva.add(this.jPanelporcentajeParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);



	if(iXPanelCamposIniciogeneralParametroFormularioIva % 1==0) {
		iXPanelCamposIniciogeneralParametroFormularioIva=0;
		iYPanelCamposIniciogeneralParametroFormularioIva++;
	}
	this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFormularioIva.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFormularioIva.gridy = iYPanelCamposIniciogeneralParametroFormularioIva;
	this.gridBagConstraintsParametroFormularioIva.gridx = iXPanelCamposIniciogeneralParametroFormularioIva++;
	this.gridBagConstraintsParametroFormularioIva.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralParametroFormularioIva.add(this.jPanelcon_totalParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);



	if(iXPanelCamposIniciogeneralParametroFormularioIva % 1==0) {
		iXPanelCamposIniciogeneralParametroFormularioIva=0;
		iYPanelCamposIniciogeneralParametroFormularioIva++;
	}
	this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFormularioIva.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFormularioIva.gridy = iYPanelCamposIniciocuenta_contableParametroFormularioIva;
	this.gridBagConstraintsParametroFormularioIva.gridx = iXPanelCamposIniciocuenta_contableParametroFormularioIva++;
	this.gridBagConstraintsParametroFormularioIva.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contableParametroFormularioIva.add(this.jPanelid_cuenta_contable1ParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);



	if(iXPanelCamposIniciocuenta_contableParametroFormularioIva % 1==0) {
		iXPanelCamposIniciocuenta_contableParametroFormularioIva=0;
		iYPanelCamposIniciocuenta_contableParametroFormularioIva++;
	}
	this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFormularioIva.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFormularioIva.gridy = iYPanelCamposIniciocuenta_contableParametroFormularioIva;
	this.gridBagConstraintsParametroFormularioIva.gridx = iXPanelCamposIniciocuenta_contableParametroFormularioIva++;
	this.gridBagConstraintsParametroFormularioIva.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contableParametroFormularioIva.add(this.jPanelid_cuenta_contable2ParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);



	if(iXPanelCamposIniciocuenta_contableParametroFormularioIva % 1==0) {
		iXPanelCamposIniciocuenta_contableParametroFormularioIva=0;
		iYPanelCamposIniciocuenta_contableParametroFormularioIva++;
	}
	this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFormularioIva.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFormularioIva.gridy = iYPanelCamposIniciocuenta_contableParametroFormularioIva;
	this.gridBagConstraintsParametroFormularioIva.gridx = iXPanelCamposIniciocuenta_contableParametroFormularioIva++;
	this.gridBagConstraintsParametroFormularioIva.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contableParametroFormularioIva.add(this.jPanelid_cuenta_contable3ParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);



	if(iXPanelCamposIniciocuenta_contableParametroFormularioIva % 1==0) {
		iXPanelCamposIniciocuenta_contableParametroFormularioIva=0;
		iYPanelCamposIniciocuenta_contableParametroFormularioIva++;
	}
	this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFormularioIva.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFormularioIva.gridy = iYPanelCamposIniciocuenta_contableParametroFormularioIva;
	this.gridBagConstraintsParametroFormularioIva.gridx = iXPanelCamposIniciocuenta_contableParametroFormularioIva++;
	this.gridBagConstraintsParametroFormularioIva.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contableParametroFormularioIva.add(this.jPanelid_cuenta_contable4ParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);



	if(iXPanelCamposIniciocuenta_contableParametroFormularioIva % 1==0) {
		iXPanelCamposIniciocuenta_contableParametroFormularioIva=0;
		iYPanelCamposIniciocuenta_contableParametroFormularioIva++;
	}
	this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFormularioIva.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFormularioIva.gridy = iYPanelCamposIniciocuenta_contableParametroFormularioIva;
	this.gridBagConstraintsParametroFormularioIva.gridx = iXPanelCamposIniciocuenta_contableParametroFormularioIva++;
	this.gridBagConstraintsParametroFormularioIva.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contableParametroFormularioIva.add(this.jPanelid_cuenta_contable5ParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);



	if(iXPanelCamposIniciocuenta_contableParametroFormularioIva % 1==0) {
		iXPanelCamposIniciocuenta_contableParametroFormularioIva=0;
		iYPanelCamposIniciocuenta_contableParametroFormularioIva++;
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
			
		GridBagLayout gridaBagLayoutAccionesParametroFormularioIva= new GridBagLayout();
		this.jPanelAccionesParametroFormularioIva.setLayout(gridaBagLayoutAccionesParametroFormularioIva);
		
		GridBagLayout gridaBagLayoutAccionesFormularioParametroFormularioIva= new GridBagLayout();
		this.jPanelAccionesFormularioParametroFormularioIva.setLayout(gridaBagLayoutAccionesFormularioParametroFormularioIva);
		
		this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsParametroFormularioIva.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsParametroFormularioIva.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioParametroFormularioIva.add(this.jComboBoxTiposAccionesFormularioParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);

		this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsParametroFormularioIva.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsParametroFormularioIva.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioParametroFormularioIva.add(this.jCheckBoxPostAccionNuevoParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.parametroformularioivaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsParametroFormularioIva.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsParametroFormularioIva.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioParametroFormularioIva.add(this.jCheckBoxPostAccionSinCerrarParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.parametroformularioivaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.parametroformularioivaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsParametroFormularioIva.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsParametroFormularioIva.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioParametroFormularioIva.add(this.jCheckBoxPostAccionSinMensajeParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFormularioIva.gridy = 0;
		this.gridBagConstraintsParametroFormularioIva.gridx = iPosXAccion++;
			
		this.jPanelAccionesParametroFormularioIva.add(this.jButtonModificarParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);							

		this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFormularioIva.gridy = 0;
		this.gridBagConstraintsParametroFormularioIva.gridx =iPosXAccion++;
			
		this.jPanelAccionesParametroFormularioIva.add(this.jButtonEliminarParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);
		
			
		this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsParametroFormularioIva.gridy = 0;		
		this.gridBagConstraintsParametroFormularioIva.gridx = iPosXAccion++;
		
		this.jPanelAccionesParametroFormularioIva.add(this.jButtonActualizarParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);


		this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsParametroFormularioIva.gridy = 0;		
		this.gridBagConstraintsParametroFormularioIva.gridx = iPosXAccion++;
		
		this.jPanelAccionesParametroFormularioIva.add(this.jButtonGuardarCambiosParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);	
		
		this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsParametroFormularioIva.gridy = 0;		
		this.gridBagConstraintsParametroFormularioIva.gridx =iPosXAccion++;
		
		this.jPanelAccionesParametroFormularioIva.add(this.jButtonCancelarParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutParametroFormularioIva = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutParametroFormularioIva);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.parametroformularioivaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();						
			this.gridBagConstraintsParametroFormularioIva.gridy = iGridyPrincipal++;
			this.gridBagConstraintsParametroFormularioIva.gridx = 0;		
			//this.gridBagConstraintsParametroFormularioIva.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFormularioIva.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsParametroFormularioIva.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsParametroFormularioIva.gridy =iGridyPrincipal++;
		this.gridBagConstraintsParametroFormularioIva.gridx =0;
		this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsParametroFormularioIva.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ParametroFormularioIvaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleParametroFormularioIva = new ParametroFormularioIvaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Parametro Formulario Iva DATOS");
			
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
			
	        //this.setTitle("[FOR] - Parametro Formulario Iva DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Parametro Formulario Iva Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ParametroFormularioIvaModel parametroformularioivaModel=new ParametroFormularioIvaModel(this);
			
			//SI USARA CLASE INTERNA
			//ParametroFormularioIvaModel.ParametroFormularioIvaFocusTraversalPolicy parametroformularioivaFocusTraversalPolicy = parametroformularioivaModel.new ParametroFormularioIvaFocusTraversalPolicy(this);
			
			//parametroformularioivaFocusTraversalPolicy.setparametroformularioivaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(parametroformularioivaModel);
			
			
			this.jContentPaneDetalleParametroFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleParametroFormularioIva = new GridBagLayout();	
			this.jContentPaneDetalleParametroFormularioIva.setLayout(gridaBagLayoutDetalleParametroFormularioIva);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosParametroFormularioIva = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
				this.gridBagConstraintsParametroFormularioIva.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsParametroFormularioIva.gridx = 0;
					
				
				this.jContentPaneDetalleParametroFormularioIva.add(jTtoolBarDetalleParametroFormularioIva, gridBagConstraintsParametroFormularioIva);								
				
}
			
			this.jScrollPanelDatosEdicionParametroFormularioIva=   new JScrollPane(jContentPaneDetalleParametroFormularioIva,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionParametroFormularioIva.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroFormularioIva.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroFormularioIva.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralParametroFormularioIva=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralParametroFormularioIva.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroFormularioIva.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroFormularioIva.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
			
			
			
			
			
		this.jTabbedPaneCamposParametroFormularioIva.add("General",this.jPanelCamposIniciogeneralParametroFormularioIva);
		this.jTabbedPaneCamposParametroFormularioIva.add("Cuenta Contable",this.jPanelCamposIniciocuenta_contableParametroFormularioIva);
			
			this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
						
			this.gridBagConstraintsParametroFormularioIva.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsParametroFormularioIva.gridx = 0;
	        
			this.jContentPaneDetalleParametroFormularioIva.add(jTabbedPaneCamposParametroFormularioIva, gridBagConstraintsParametroFormularioIva);
			
			
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
						&& parametroformularioivaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameFormularioIva(this.puedeCargarPorParteFormularioIva,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameFormularioRenta(this.puedeCargarPorParteFormularioRenta,false,-1);
					
					if(this.parametroformularioivaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsParametroFormularioIva= new GridBagConstraints();
						this.gridBagConstraintsParametroFormularioIva.gridy = iGridyRelaciones++;
						this.gridBagConstraintsParametroFormularioIva.gridx = 0;
						this.jContentPaneDetalleParametroFormularioIva.add(this.jTabbedPaneRelacionesParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesParametroFormularioIva.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameFormularioIva(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameFormularioRenta(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosParametroFormularioIva.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
					this.gridBagConstraintsParametroFormularioIva.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsParametroFormularioIva.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsParametroFormularioIva.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsParametroFormularioIva.gridx = 0;
					
				
					this.jContentPaneDetalleParametroFormularioIva.add(jPanelCamposOcultosParametroFormularioIva, gridBagConstraintsParametroFormularioIva);
				
					this.jPanelCamposOcultosParametroFormularioIva.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsParametroFormularioIva.gridy = iGridyRelaciones++;//7;		
	        this.gridBagConstraintsParametroFormularioIva.gridx = 0;
	        this.gridBagConstraintsParametroFormularioIva.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleParametroFormularioIva.add(this.jPanelAccionesFormularioParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);							
			
			
			
			this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
	        this.gridBagConstraintsParametroFormularioIva.gridy = iGridyRelaciones;//7;		
	        this.gridBagConstraintsParametroFormularioIva.gridx = 0;
	        
			
			this.jContentPaneDetalleParametroFormularioIva.add(this.jPanelAccionesParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionParametroFormularioIva);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionParametroFormularioIva=   new JScrollPane(this.jPanelCamposParametroFormularioIva,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionParametroFormularioIva.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroFormularioIva.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroFormularioIva.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsParametroFormularioIva.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsParametroFormularioIva.gridx = 0;
			this.gridBagConstraintsParametroFormularioIva.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsParametroFormularioIva.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsParametroFormularioIva.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsParametroFormularioIva.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsParametroFormularioIva.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);			
			
			this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsParametroFormularioIva.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsParametroFormularioIva.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsParametroFormularioIva.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroFormularioIva.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);
			
			
		this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsParametroFormularioIva.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroFormularioIva.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);
		
			
		this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsParametroFormularioIva.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsParametroFormularioIva.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesParametroFormularioIva, this.gridBagConstraintsParametroFormularioIva);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralParametroFormularioIva;//jContentPane;
		
		return jScrollPanelDatosEdicionParametroFormularioIva;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameFormularioIva(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.formularioivaSessionBean=new FormularioIvaSessionBean();
		this.formularioivaSessionBean.setConGuardarRelaciones(false);
		this.formularioivaSessionBean.setEsGuardarRelacionado(true);

		this.formularioivaBeanSwingJInternalFrame=null;//new FormularioIvaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.formularioivaBeanSwingJInternalFramePopup=new FormularioIvaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.formularioivaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.formularioivaSessionBean.getEsGuardarRelacionado()) {

				FormularioIvaJInternalFrame.STIPO_TAMANIO_GENERAL=ParametroFormularioIvaJInternalFrame.STIPO_TAMANIO_GENERAL;
				FormularioIvaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ParametroFormularioIvaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.formularioivaSessionBean.setEsGuardarRelacionado(true);

				this.formularioivaBeanSwingJInternalFrame=new FormularioIvaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.formularioivaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.formularioivaBeanSwingJInternalFrame.setformularioivaSessionBean(this.formularioivaSessionBean);

				//this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
				//this.gridBagConstraintsParametroFormularioIva.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsParametroFormularioIva.gridx = 0;
				//this.jContentPaneDetalleParametroFormularioIva.add(this.formularioivaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsParametroFormularioIva);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesParametroFormularioIva.add("Formulario Ivas",this.formularioivaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesParametroFormularioIva.setComponentAt(iIndexTab,this.formularioivaBeanSwingJInternalFrame.getContentPane());
				}

				//FormularioIvaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.formularioivaSessionBean.setEsGuardarRelacionado(false);
				this.formularioivaBeanSwingJInternalFrame=null;//new FormularioIvaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.formularioivaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteFormularioIva) {
					this.jTabbedPaneRelacionesParametroFormularioIva.add("Formulario Ivas",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameFormularioRenta(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.formulariorentaSessionBean=new FormularioRentaSessionBean();
		this.formulariorentaSessionBean.setConGuardarRelaciones(false);
		this.formulariorentaSessionBean.setEsGuardarRelacionado(true);

		this.formulariorentaBeanSwingJInternalFrame=null;//new FormularioRentaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.formulariorentaBeanSwingJInternalFramePopup=new FormularioRentaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.formulariorentaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.formulariorentaSessionBean.getEsGuardarRelacionado()) {

				FormularioRentaJInternalFrame.STIPO_TAMANIO_GENERAL=ParametroFormularioIvaJInternalFrame.STIPO_TAMANIO_GENERAL;
				FormularioRentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ParametroFormularioIvaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.formulariorentaSessionBean.setEsGuardarRelacionado(true);

				this.formulariorentaBeanSwingJInternalFrame=new FormularioRentaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.formulariorentaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.formulariorentaBeanSwingJInternalFrame.setformulariorentaSessionBean(this.formulariorentaSessionBean);

				//this.gridBagConstraintsParametroFormularioIva = new GridBagConstraints();
				//this.gridBagConstraintsParametroFormularioIva.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsParametroFormularioIva.gridx = 0;
				//this.jContentPaneDetalleParametroFormularioIva.add(this.formulariorentaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsParametroFormularioIva);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesParametroFormularioIva.add("Formulario Rentas",this.formulariorentaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesParametroFormularioIva.setComponentAt(iIndexTab,this.formulariorentaBeanSwingJInternalFrame.getContentPane());
				}

				//FormularioRentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.formulariorentaSessionBean.setEsGuardarRelacionado(false);
				this.formulariorentaBeanSwingJInternalFrame=null;//new FormularioRentaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.formulariorentaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteFormularioRenta) {
					this.jTabbedPaneRelacionesParametroFormularioIva.add("Formulario Rentas",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarFormularioRentaBeanSwingJInternalFrame(List<ParametroFormularioIva> parametroformularioivas,ParametroFormularioIva parametroformularioiva,FormularioRentaBeanSwingJInternalFrame formulariorentaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//formulariorentaBeanSwingJInternalFrame=new FormularioRentaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					formulariorentaBeanSwingJInternalFrame.getFormularioRentaLogic().setConnexion(this.parametroformularioivaLogic.getConnexion());

					formulariorentaBeanSwingJInternalFrame.setparametroformularioivasForeignKey(parametroformularioivas);
					formulariorentaBeanSwingJInternalFrame.setparametroformularioivaForeignKey(parametroformularioiva);
					formulariorentaBeanSwingJInternalFrame.formulariorentaSessionBean.setisBusquedaDesdeForeignKeySesionParametroFormularioIva(true);
					formulariorentaBeanSwingJInternalFrame.formulariorentaSessionBean.setlidParametroFormularioIvaActual(parametroformularioiva.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					formulariorentaBeanSwingJInternalFrame.cargarCombosForeignKeyFormularioRenta(formulariorentaBeanSwingJInternalFrame.isCargarCombosDependencia);
					formulariorentaBeanSwingJInternalFrame.setVisibilidadBusquedasParaParametroFormularioIva(true);
					formulariorentaBeanSwingJInternalFrame.setid_parametro_formulario_ivaFK_IdParametroFormularioIva(parametroformularioiva.getId());

					if(!this.conCargarFormDetalle) {
						formulariorentaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					formulariorentaBeanSwingJInternalFrame.setSelectedItemCombosFrameParametroFormularioIvaForeignKey(parametroformularioiva,1,false,true,true);
					formulariorentaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					formulariorentaBeanSwingJInternalFrame.procesarBusqueda("FK_IdParametroFormularioIva");
					formulariorentaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdParametroFormularioIva");
					formulariorentaBeanSwingJInternalFrame.inicializarActualizarBindingTablaFormularioRenta(true);
					formulariorentaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesFormularioRenta("n",formulariorentaBeanSwingJInternalFrame.isGuardarCambiosEnLote, formulariorentaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					formulariorentaBeanSwingJInternalFrame.setAutoscrolls(true);
					formulariorentaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						formulariorentaBeanSwingJInternalFrame.actualizarEstadoPanelsFormularioRenta("relacionado");
					} else {
						formulariorentaBeanSwingJInternalFrame.actualizarEstadoPanelsFormularioRenta("no_relacionado");
					}

					formulariorentaBeanSwingJInternalFrame.getjButtonRecargarInformacionFormularioRenta().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarFormularioIvaBeanSwingJInternalFrame(List<ParametroFormularioIva> parametroformularioivas,ParametroFormularioIva parametroformularioiva,FormularioIvaBeanSwingJInternalFrame formularioivaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//formularioivaBeanSwingJInternalFrame=new FormularioIvaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					formularioivaBeanSwingJInternalFrame.getFormularioIvaLogic().setConnexion(this.parametroformularioivaLogic.getConnexion());

					formularioivaBeanSwingJInternalFrame.setparametroformularioivasForeignKey(parametroformularioivas);
					formularioivaBeanSwingJInternalFrame.setparametroformularioivaForeignKey(parametroformularioiva);
					formularioivaBeanSwingJInternalFrame.formularioivaSessionBean.setisBusquedaDesdeForeignKeySesionParametroFormularioIva(true);
					formularioivaBeanSwingJInternalFrame.formularioivaSessionBean.setlidParametroFormularioIvaActual(parametroformularioiva.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					formularioivaBeanSwingJInternalFrame.cargarCombosForeignKeyFormularioIva(formularioivaBeanSwingJInternalFrame.isCargarCombosDependencia);
					formularioivaBeanSwingJInternalFrame.setVisibilidadBusquedasParaParametroFormularioIva(true);
					formularioivaBeanSwingJInternalFrame.setid_parametro_formulario_ivaFK_IdParametroFormularioIva(parametroformularioiva.getId());

					if(!this.conCargarFormDetalle) {
						formularioivaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					formularioivaBeanSwingJInternalFrame.setSelectedItemCombosFrameParametroFormularioIvaForeignKey(parametroformularioiva,1,false,true,true);
					formularioivaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					formularioivaBeanSwingJInternalFrame.procesarBusqueda("FK_IdParametroFormularioIva");
					formularioivaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdParametroFormularioIva");
					formularioivaBeanSwingJInternalFrame.inicializarActualizarBindingTablaFormularioIva(true);
					formularioivaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesFormularioIva("n",formularioivaBeanSwingJInternalFrame.isGuardarCambiosEnLote, formularioivaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					formularioivaBeanSwingJInternalFrame.setAutoscrolls(true);
					formularioivaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						formularioivaBeanSwingJInternalFrame.actualizarEstadoPanelsFormularioIva("relacionado");
					} else {
						formularioivaBeanSwingJInternalFrame.actualizarEstadoPanelsFormularioIva("no_relacionado");
					}

					formularioivaBeanSwingJInternalFrame.getjButtonRecargarInformacionFormularioIva().setVisible(false);

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
