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
package com.bydan.erp.activosfijos.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.activosfijos.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.activosfijos.util.DetalleGrupoActivoFijoConstantesFunciones;

import com.bydan.erp.activosfijos.business.logic.*;
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
public class DetalleGrupoActivoFijoDetalleFormJInternalFrame extends DetalleGrupoActivoFijoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleDetalleGrupoActivoFijo;
	
	protected JMenuBar jmenuBarDetalleDetalleGrupoActivoFijo;
	
	protected JMenu jmenuDetalleDetalleGrupoActivoFijo;
	protected JMenu jmenuDetalleArchivoDetalleGrupoActivoFijo;
	protected JMenu jmenuDetalleAccionesDetalleGrupoActivoFijo;
	protected JMenu jmenuDetalleDatosDetalleGrupoActivoFijo;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleDetalleGrupoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetalleGrupoActivoFijo;	
	protected GridBagConstraints gridBagConstraintsDetalleGrupoActivoFijo;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected DetalleGrupoActivoFijoBeanSwingJInternalFrameAdditional jInternalFrameDetalleDetalleGrupoActivoFijo;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablecostooriginalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablecostooriginal="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontabledeprenormalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontabledeprenormal="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontabledepregastonormalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontabledepregastonormal="";
	
	public DetalleGrupoActivoFijoSessionBean detallegrupoactivofijoSessionBean;
	
	

	public DetalleActivoFijoBeanSwingJInternalFrame detalleactivofijoBeanSwingJInternalFrame=null;
	public DetalleActivoFijoBeanSwingJInternalFrame detalleactivofijoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDetalleActivoFijo=false;
	public DetalleActivoFijoSessionBean detalleactivofijoSessionBean;

	public CuentaContaDetaGrupoActiBeanSwingJInternalFrame cuentacontadetagrupoactiBeanSwingJInternalFrame=null;
	public CuentaContaDetaGrupoActiBeanSwingJInternalFrame cuentacontadetagrupoactiBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteCuentaContaDetaGrupoActi=false;
	public CuentaContaDetaGrupoActiSessionBean cuentacontadetagrupoactiSessionBean;

	public SubGrupoActivoFijoBeanSwingJInternalFrame subgrupoactivofijoBeanSwingJInternalFrame=null;
	public SubGrupoActivoFijoBeanSwingJInternalFrame subgrupoactivofijoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteSubGrupoActivoFijo=false;
	public SubGrupoActivoFijoSessionBean subgrupoactivofijoSessionBean;

	public GastoDepreciacionBeanSwingJInternalFrame gastodepreciacionBeanSwingJInternalFrame=null;
	public GastoDepreciacionBeanSwingJInternalFrame gastodepreciacionBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteGastoDepreciacion=false;
	public GastoDepreciacionSessionBean gastodepreciacionSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public CuentaContableSessionBean cuentacontablecostooriginalSessionBean;
	public CuentaContableSessionBean cuentacontabledeprenormalSessionBean;
	public CuentaContableSessionBean cuentacontabledepregastonormalSessionBean;	
	
	public DetalleGrupoActivoFijoLogic detallegrupoactivofijoLogic;
	
	public JScrollPane jScrollPanelDatosDetalleGrupoActivoFijo;
	public JScrollPane jScrollPanelDatosEdicionDetalleGrupoActivoFijo;
	public JScrollPane jScrollPanelDatosGeneralDetalleGrupoActivoFijo;
	
	protected JPanel jPanelCamposDetalleGrupoActivoFijo;    
	protected JPanel jPanelCamposOcultosDetalleGrupoActivoFijo;    	
	protected JPanel jPanelAccionesDetalleGrupoActivoFijo;
	protected JPanel jPanelAccionesFormularioDetalleGrupoActivoFijo;
    
	
	
	protected Integer iXPanelCamposDetalleGrupoActivoFijo=0;
	protected Integer iYPanelCamposDetalleGrupoActivoFijo=0;
	
	protected Integer iXPanelCamposOcultosDetalleGrupoActivoFijo=0;
	protected Integer iYPanelCamposOcultosDetalleGrupoActivoFijo=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoDetalleGrupoActivoFijo;
	public JButton jButtonModificarDetalleGrupoActivoFijo;
	public JButton jButtonActualizarDetalleGrupoActivoFijo;
    public JButton jButtonEliminarDetalleGrupoActivoFijo;
	public JButton jButtonCancelarDetalleGrupoActivoFijo;
    public JButton jButtonGuardarCambiosDetalleGrupoActivoFijo;
	public JButton jButtonGuardarCambiosTablaDetalleGrupoActivoFijo;
	protected JButton jButtonCerrarDetalleGrupoActivoFijo;
	
	
	protected JButton jButtonProcesarInformacionDetalleGrupoActivoFijo;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoDetalleGrupoActivoFijo;
	protected JCheckBox jCheckBoxPostAccionSinCerrarDetalleGrupoActivoFijo;
	protected JCheckBox jCheckBoxPostAccionSinMensajeDetalleGrupoActivoFijo;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetalleGrupoActivoFijo;
	protected JButton jButtonModificarToolBarDetalleGrupoActivoFijo;
	protected JButton jButtonActualizarToolBarDetalleGrupoActivoFijo;
    protected JButton jButtonEliminarToolBarDetalleGrupoActivoFijo;
	protected JButton jButtonCancelarToolBarDetalleGrupoActivoFijo;
    protected JButton jButtonGuardarCambiosToolBarDetalleGrupoActivoFijo;
	protected JButton jButtonGuardarCambiosTablaToolBarDetalleGrupoActivoFijo;
	protected JButton jButtonMostrarOcultarTablaToolBarDetalleGrupoActivoFijo;
	protected JButton jButtonCerrarToolBarDetalleGrupoActivoFijo;
	
	protected JButton jButtonProcesarInformacionToolBarDetalleGrupoActivoFijo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetalleGrupoActivoFijo;
	protected JMenuItem jMenuItemModificarDetalleGrupoActivoFijo;
	protected JMenuItem jMenuItemActualizarDetalleGrupoActivoFijo;
    protected JMenuItem jMenuItemEliminarDetalleGrupoActivoFijo;
	protected JMenuItem jMenuItemCancelarDetalleGrupoActivoFijo;
    protected JMenuItem jMenuItemGuardarCambiosDetalleGrupoActivoFijo;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetalleGrupoActivoFijo;
	protected JMenuItem jMenuItemCerrarDetalleGrupoActivoFijo;
	protected JMenuItem jMenuItemDetalleCerrarDetalleGrupoActivoFijo;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetalleGrupoActivoFijo;
	
	protected JMenuItem jMenuItemProcesarInformacionDetalleGrupoActivoFijo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetalleGrupoActivoFijo;
	protected JMenuItem jMenuItemMostrarOcultarDetalleGrupoActivoFijo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetalleGrupoActivoFijo;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetalleGrupoActivoFijo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetalleGrupoActivoFijo;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioDetalleGrupoActivoFijo;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidDetalleGrupoActivoFijo;
	public JLabel jLabelIdDetalleGrupoActivoFijo;
	public JLabel jLabelidDetalleGrupoActivoFijo;
	public JButton jButtonidDetalleGrupoActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelcodigoDetalleGrupoActivoFijo;
	public JLabel jLabelcodigoDetalleGrupoActivoFijo;
	public JTextField jTextFieldcodigoDetalleGrupoActivoFijo;
	public JButton jButtoncodigoDetalleGrupoActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelnombreDetalleGrupoActivoFijo;
	public JLabel jLabelnombreDetalleGrupoActivoFijo;
	public JTextArea jTextAreanombreDetalleGrupoActivoFijo;
	public JScrollPane jscrollPanenombreDetalleGrupoActivoFijo;
	public JButton jButtonnombreDetalleGrupoActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelsiglasDetalleGrupoActivoFijo;
	public JLabel jLabelsiglasDetalleGrupoActivoFijo;
	public JTextField jTextFieldsiglasDetalleGrupoActivoFijo;
	public JButton jButtonsiglasDetalleGrupoActivoFijoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaDetalleGrupoActivoFijo;
	public JLabel jLabelid_empresaDetalleGrupoActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaDetalleGrupoActivoFijo;
	public JButton jButtonid_empresaDetalleGrupoActivoFijo= new JButtonMe();
	public JButton jButtonid_empresaDetalleGrupoActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_empresaDetalleGrupoActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_costo_originalDetalleGrupoActivoFijo;
	public JLabel jLabelid_cuenta_contable_costo_originalDetalleGrupoActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_costo_originalDetalleGrupoActivoFijo;
	public JButton jButtonid_cuenta_contable_costo_originalDetalleGrupoActivoFijo= new JButtonMe();
	public JButton jButtonid_cuenta_contable_costo_originalDetalleGrupoActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_costo_originalDetalleGrupoActivoFijoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_costo_originalDetalleGrupoActivoFijoArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_depre_normalDetalleGrupoActivoFijo;
	public JLabel jLabelid_cuenta_contable_depre_normalDetalleGrupoActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_depre_normalDetalleGrupoActivoFijo;
	public JButton jButtonid_cuenta_contable_depre_normalDetalleGrupoActivoFijo= new JButtonMe();
	public JButton jButtonid_cuenta_contable_depre_normalDetalleGrupoActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_depre_normalDetalleGrupoActivoFijoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_depre_normalDetalleGrupoActivoFijoArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo;
	public JLabel jLabelid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo;
	public JButton jButtonid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo= new JButtonMe();
	public JButton jButtonid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijoArbol= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesDetalleGrupoActivoFijo;
	
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
	public int iHeightFormulario=682;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public DetalleGrupoActivoFijoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposDetalleGrupoActivoFijo=new JPanel();
				this.jPanelAccionesFormularioDetalleGrupoActivoFijo=new JPanel();
				this.jmenuBarDetalleDetalleGrupoActivoFijo=new JMenuBar();
				this.jTtoolBarDetalleDetalleGrupoActivoFijo=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleGrupoActivoFijoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("DetalleGrupoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public DetalleGrupoActivoFijoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("DetalleGrupoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleGrupoActivoFijoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleGrupoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleGrupoActivoFijoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleGrupoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleGrupoActivoFijoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetalleGrupoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarDetalleGrupoActivoFijo() {
		return this.jButtonActualizarToolBarDetalleGrupoActivoFijo;
	}
	
	public JButton getjButtonEliminarToolBarDetalleGrupoActivoFijo() {
		return this.jButtonEliminarToolBarDetalleGrupoActivoFijo;
	}
	
	public JButton getjButtonCancelarToolBarDetalleGrupoActivoFijo() {
		return this.jButtonCancelarToolBarDetalleGrupoActivoFijo;
	}		
	
	public JButton getjButtonProcesarInformacionDetalleGrupoActivoFijo() {
		return this.jButtonProcesarInformacionDetalleGrupoActivoFijo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetalleGrupoActivoFijo)	{
		this.jButtonProcesarInformacionDetalleGrupoActivoFijo = jButtonProcesarInformacionDetalleGrupoActivoFijo;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetalleGrupoActivoFijo() {
		return this.jComboBoxTiposAccionesDetalleGrupoActivoFijo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetalleGrupoActivoFijo(
			JComboBox jComboBoxTiposRelacionesDetalleGrupoActivoFijo) {
		this.jComboBoxTiposRelacionesDetalleGrupoActivoFijo = jComboBoxTiposRelacionesDetalleGrupoActivoFijo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetalleGrupoActivoFijo(
			JComboBox jComboBoxTiposAccionesDetalleGrupoActivoFijo) {
		this.jComboBoxTiposAccionesDetalleGrupoActivoFijo = jComboBoxTiposAccionesDetalleGrupoActivoFijo;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioDetalleGrupoActivoFijo() {
		return this.jComboBoxTiposAccionesFormularioDetalleGrupoActivoFijo;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioDetalleGrupoActivoFijo(
			JComboBox jComboBoxTiposAccionesFormularioDetalleGrupoActivoFijo) {
		this.jComboBoxTiposAccionesFormularioDetalleGrupoActivoFijo = jComboBoxTiposAccionesFormularioDetalleGrupoActivoFijo;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.detallegrupoactivofijoSessionBean=new DetalleGrupoActivoFijoSessionBean();
		
		this.detallegrupoactivofijoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detallegrupoactivofijoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.detalleactivofijoSessionBean=new DetalleActivoFijoSessionBean();
		//this.cuentacontadetagrupoactiSessionBean=new CuentaContaDetaGrupoActiSessionBean();
		//this.subgrupoactivofijoSessionBean=new SubGrupoActivoFijoSessionBean();
		//this.gastodepreciacionSessionBean=new GastoDepreciacionSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetalleGrupoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetalleGrupoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetalleGrupoActivoFijoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Grupo Activo Fijo MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
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
	
		DetalleGrupoActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleDetalleGrupoActivoFijo= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarDetalleGrupoActivoFijo=new JButtonMe();
				this.jButtonModificarToolBarDetalleGrupoActivoFijo=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarDetalleGrupoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarDetalleGrupoActivoFijo,this.jTtoolBarDetalleDetalleGrupoActivoFijo,
							"actualizar","actualizar","Actualizar"+" "+DetalleGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarDetalleGrupoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarDetalleGrupoActivoFijo,this.jTtoolBarDetalleDetalleGrupoActivoFijo,
							"eliminar","eliminar","Eliminar"+" "+DetalleGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarDetalleGrupoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarDetalleGrupoActivoFijo,this.jTtoolBarDetalleDetalleGrupoActivoFijo,
							"cancelar","cancelar","Cancelar"+" "+DetalleGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarDetalleGrupoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarDetalleGrupoActivoFijo,this.jTtoolBarDetalleDetalleGrupoActivoFijo,
							"guardarcambios","guardarcambios","Guardar"+" "+DetalleGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarDetalleGrupoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarDetalleGrupoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarDetalleGrupoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleDetalleGrupoActivoFijo=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleDetalleGrupoActivoFijo=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoDetalleGrupoActivoFijo=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesDetalleGrupoActivoFijo=new JMenuMe("Acciones");
		this.jmenuDetalleDatosDetalleGrupoActivoFijo=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetalleGrupoActivoFijo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetalleGrupoActivoFijo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetalleGrupoActivoFijo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarDetalleGrupoActivoFijo= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarDetalleGrupoActivoFijo.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarDetalleGrupoActivoFijo,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarDetalleGrupoActivoFijo= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarDetalleGrupoActivoFijo.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarDetalleGrupoActivoFijo,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarDetalleGrupoActivoFijo= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarDetalleGrupoActivoFijo.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarDetalleGrupoActivoFijo,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarDetalleGrupoActivoFijo= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarDetalleGrupoActivoFijo.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarDetalleGrupoActivoFijo,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosDetalleGrupoActivoFijo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetalleGrupoActivoFijo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetalleGrupoActivoFijo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetalleGrupoActivoFijo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetalleGrupoActivoFijo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetalleGrupoActivoFijo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarDetalleGrupoActivoFijo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarDetalleGrupoActivoFijo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarDetalleGrupoActivoFijo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetalleGrupoActivoFijo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetalleGrupoActivoFijo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetalleGrupoActivoFijo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetalleGrupoActivoFijo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetalleGrupoActivoFijo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetalleGrupoActivoFijo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoDetalleGrupoActivoFijo.add(this.jMenuItemDetalleCerrarDetalleGrupoActivoFijo);
		
		this.jmenuDetalleAccionesDetalleGrupoActivoFijo.add(this.jMenuItemActualizarDetalleGrupoActivoFijo);
		this.jmenuDetalleAccionesDetalleGrupoActivoFijo.add(this.jMenuItemEliminarDetalleGrupoActivoFijo);
		this.jmenuDetalleAccionesDetalleGrupoActivoFijo.add(this.jMenuItemCancelarDetalleGrupoActivoFijo);		
		
		//this.jmenuDetalleDatosDetalleGrupoActivoFijo.add(this.jMenuItemDetalleAbrirOrderByDetalleGrupoActivoFijo);				
		this.jmenuDetalleDatosDetalleGrupoActivoFijo.add(this.jMenuItemDetalleMostarOcultarDetalleGrupoActivoFijo);				
				
		//this.jmenuDetalleAccionesDetalleGrupoActivoFijo.add(this.jMenuItemGuardarCambiosDetalleGrupoActivoFijo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleDetalleGrupoActivoFijo.add(this.jmenuDetalleArchivoDetalleGrupoActivoFijo);		
		this.jmenuBarDetalleDetalleGrupoActivoFijo.add(this.jmenuDetalleAccionesDetalleGrupoActivoFijo);		
		this.jmenuBarDetalleDetalleGrupoActivoFijo.add(this.jmenuDetalleDatosDetalleGrupoActivoFijo);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleDetalleGrupoActivoFijo.add(this.jmenuDetalleDetalleGrupoActivoFijo);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleDetalleGrupoActivoFijo);				
	}
	
	
	public void inicializarElementosCamposDetalleGrupoActivoFijo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdDetalleGrupoActivoFijo = new JLabelMe();
		jLabelIdDetalleGrupoActivoFijo.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdDetalleGrupoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetalleGrupoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetalleGrupoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdDetalleGrupoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidDetalleGrupoActivoFijo = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidDetalleGrupoActivoFijo.setToolTipText(DetalleGrupoActivoFijoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutDetalleGrupoActivoFijo= new GridBagLayout();

		this.jPanelidDetalleGrupoActivoFijo.setLayout(this.gridaBagLayoutDetalleGrupoActivoFijo);

		jLabelidDetalleGrupoActivoFijo = new JLabel();
		jLabelidDetalleGrupoActivoFijo.setText("Id");

		jLabelidDetalleGrupoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleGrupoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleGrupoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoDetalleGrupoActivoFijo = new JLabelMe();
		this.jLabelcodigoDetalleGrupoActivoFijo.setText(""+DetalleGrupoActivoFijoConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoDetalleGrupoActivoFijo.setToolTipText("Codigo");
		this.jLabelcodigoDetalleGrupoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoDetalleGrupoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoDetalleGrupoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoDetalleGrupoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoDetalleGrupoActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoDetalleGrupoActivoFijo.setToolTipText(DetalleGrupoActivoFijoConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutDetalleGrupoActivoFijo = new GridBagLayout();
		this.jPanelcodigoDetalleGrupoActivoFijo.setLayout(this.gridaBagLayoutDetalleGrupoActivoFijo);


		jTextFieldcodigoDetalleGrupoActivoFijo= new JTextFieldMe();

		jTextFieldcodigoDetalleGrupoActivoFijo.setEnabled(false);
		jTextFieldcodigoDetalleGrupoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoDetalleGrupoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoDetalleGrupoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoDetalleGrupoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoDetalleGrupoActivoFijoBusqueda= new JButtonMe();
		this.jButtoncodigoDetalleGrupoActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoDetalleGrupoActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoDetalleGrupoActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoDetalleGrupoActivoFijoBusqueda.setText("U");
		this.jButtoncodigoDetalleGrupoActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoDetalleGrupoActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoDetalleGrupoActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoDetalleGrupoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoDetalleGrupoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoDetalleGrupoActivoFijoBusqueda"));

		if(this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoDetalleGrupoActivoFijoBusqueda.setVisible(false);		}


					
		this.jLabelnombreDetalleGrupoActivoFijo = new JLabelMe();
		this.jLabelnombreDetalleGrupoActivoFijo.setText(""+DetalleGrupoActivoFijoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreDetalleGrupoActivoFijo.setToolTipText("Nombre");
		this.jLabelnombreDetalleGrupoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreDetalleGrupoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreDetalleGrupoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreDetalleGrupoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreDetalleGrupoActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreDetalleGrupoActivoFijo.setToolTipText(DetalleGrupoActivoFijoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutDetalleGrupoActivoFijo = new GridBagLayout();
		this.jPanelnombreDetalleGrupoActivoFijo.setLayout(this.gridaBagLayoutDetalleGrupoActivoFijo);


		jTextAreanombreDetalleGrupoActivoFijo= new JTextAreaMe();
		jTextAreanombreDetalleGrupoActivoFijo.setEnabled(false);
		jTextAreanombreDetalleGrupoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreDetalleGrupoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreDetalleGrupoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreDetalleGrupoActivoFijo.setLineWrap(true);
		jTextAreanombreDetalleGrupoActivoFijo.setWrapStyleWord(true);
		jTextAreanombreDetalleGrupoActivoFijo.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreDetalleGrupoActivoFijo.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreDetalleGrupoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreDetalleGrupoActivoFijo = new JScrollPane(jTextAreanombreDetalleGrupoActivoFijo);
		jscrollPanenombreDetalleGrupoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreDetalleGrupoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreDetalleGrupoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreDetalleGrupoActivoFijoBusqueda= new JButtonMe();
		this.jButtonnombreDetalleGrupoActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreDetalleGrupoActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreDetalleGrupoActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreDetalleGrupoActivoFijoBusqueda.setText("U");
		this.jButtonnombreDetalleGrupoActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreDetalleGrupoActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreDetalleGrupoActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreDetalleGrupoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreDetalleGrupoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreDetalleGrupoActivoFijoBusqueda"));

		if(this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreDetalleGrupoActivoFijoBusqueda.setVisible(false);		}


					
		this.jLabelsiglasDetalleGrupoActivoFijo = new JLabelMe();
		this.jLabelsiglasDetalleGrupoActivoFijo.setText(""+DetalleGrupoActivoFijoConstantesFunciones.LABEL_SIGLAS+" : *");
		this.jLabelsiglasDetalleGrupoActivoFijo.setToolTipText("Siglas");
		this.jLabelsiglasDetalleGrupoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsiglasDetalleGrupoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsiglasDetalleGrupoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsiglasDetalleGrupoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsiglasDetalleGrupoActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsiglasDetalleGrupoActivoFijo.setToolTipText(DetalleGrupoActivoFijoConstantesFunciones.LABEL_SIGLAS);
		this.gridaBagLayoutDetalleGrupoActivoFijo = new GridBagLayout();
		this.jPanelsiglasDetalleGrupoActivoFijo.setLayout(this.gridaBagLayoutDetalleGrupoActivoFijo);


		jTextFieldsiglasDetalleGrupoActivoFijo= new JTextFieldMe();

		jTextFieldsiglasDetalleGrupoActivoFijo.setEnabled(false);
		jTextFieldsiglasDetalleGrupoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsiglasDetalleGrupoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsiglasDetalleGrupoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsiglasDetalleGrupoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonsiglasDetalleGrupoActivoFijoBusqueda= new JButtonMe();
		this.jButtonsiglasDetalleGrupoActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsiglasDetalleGrupoActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsiglasDetalleGrupoActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsiglasDetalleGrupoActivoFijoBusqueda.setText("U");
		this.jButtonsiglasDetalleGrupoActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsiglasDetalleGrupoActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsiglasDetalleGrupoActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsiglasDetalleGrupoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsiglasDetalleGrupoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"siglasDetalleGrupoActivoFijoBusqueda"));

		if(this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsiglasDetalleGrupoActivoFijoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysDetalleGrupoActivoFijo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaDetalleGrupoActivoFijo = new JLabelMe();
		this.jLabelid_empresaDetalleGrupoActivoFijo.setText(""+DetalleGrupoActivoFijoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaDetalleGrupoActivoFijo.setToolTipText("Empresa");
		this.jLabelid_empresaDetalleGrupoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetalleGrupoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetalleGrupoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaDetalleGrupoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaDetalleGrupoActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaDetalleGrupoActivoFijo.setToolTipText(DetalleGrupoActivoFijoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutDetalleGrupoActivoFijo = new GridBagLayout();
		this.jPanelid_empresaDetalleGrupoActivoFijo.setLayout(this.gridaBagLayoutDetalleGrupoActivoFijo);


		jComboBoxid_empresaDetalleGrupoActivoFijo= new JComboBoxMe();
		jComboBoxid_empresaDetalleGrupoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetalleGrupoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetalleGrupoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaDetalleGrupoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaDetalleGrupoActivoFijo.setEnabled(false);

		this.jButtonid_empresaDetalleGrupoActivoFijo= new JButtonMe();
		this.jButtonid_empresaDetalleGrupoActivoFijo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleGrupoActivoFijo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleGrupoActivoFijo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleGrupoActivoFijo.setText("Buscar");
		this.jButtonid_empresaDetalleGrupoActivoFijo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaDetalleGrupoActivoFijo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleGrupoActivoFijo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaDetalleGrupoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleGrupoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleGrupoActivoFijo"));

		this.jButtonid_empresaDetalleGrupoActivoFijoBusqueda= new JButtonMe();
		this.jButtonid_empresaDetalleGrupoActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleGrupoActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleGrupoActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetalleGrupoActivoFijoBusqueda.setText("U");
		this.jButtonid_empresaDetalleGrupoActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaDetalleGrupoActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleGrupoActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaDetalleGrupoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleGrupoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleGrupoActivoFijoBusqueda"));

		if(this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaDetalleGrupoActivoFijoBusqueda.setVisible(false);		}

		this.jButtonid_empresaDetalleGrupoActivoFijoUpdate= new JButtonMe();
		this.jButtonid_empresaDetalleGrupoActivoFijoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleGrupoActivoFijoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleGrupoActivoFijoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetalleGrupoActivoFijoUpdate.setText("U");
		this.jButtonid_empresaDetalleGrupoActivoFijoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaDetalleGrupoActivoFijoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleGrupoActivoFijoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaDetalleGrupoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleGrupoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleGrupoActivoFijoUpdate"));



					
		this.jLabelid_cuenta_contable_costo_originalDetalleGrupoActivoFijo = new JLabelMe();
		this.jLabelid_cuenta_contable_costo_originalDetalleGrupoActivoFijo.setText(""+DetalleGrupoActivoFijoConstantesFunciones.LABEL_IDCUENTACONTABLECOSTOORIGINAL+" : *");
		this.jLabelid_cuenta_contable_costo_originalDetalleGrupoActivoFijo.setToolTipText("Cuenta Contable Costo Original");
		this.jLabelid_cuenta_contable_costo_originalDetalleGrupoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_costo_originalDetalleGrupoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_costo_originalDetalleGrupoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_costo_originalDetalleGrupoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_costo_originalDetalleGrupoActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_costo_originalDetalleGrupoActivoFijo.setToolTipText(DetalleGrupoActivoFijoConstantesFunciones.LABEL_IDCUENTACONTABLECOSTOORIGINAL);
		this.gridaBagLayoutDetalleGrupoActivoFijo = new GridBagLayout();
		this.jPanelid_cuenta_contable_costo_originalDetalleGrupoActivoFijo.setLayout(this.gridaBagLayoutDetalleGrupoActivoFijo);


		jComboBoxid_cuenta_contable_costo_originalDetalleGrupoActivoFijo= new JComboBoxMe();
		jComboBoxid_cuenta_contable_costo_originalDetalleGrupoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_costo_originalDetalleGrupoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_costo_originalDetalleGrupoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_costo_originalDetalleGrupoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_costo_originalDetalleGrupoActivoFijo= new JButtonMe();
		this.jButtonid_cuenta_contable_costo_originalDetalleGrupoActivoFijo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_costo_originalDetalleGrupoActivoFijo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_costo_originalDetalleGrupoActivoFijo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_costo_originalDetalleGrupoActivoFijo.setText("Buscar");
		this.jButtonid_cuenta_contable_costo_originalDetalleGrupoActivoFijo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_costo_originalDetalleGrupoActivoFijo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_costo_originalDetalleGrupoActivoFijo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_costo_originalDetalleGrupoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_costo_originalDetalleGrupoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_costo_originalDetalleGrupoActivoFijo"));

		this.jButtonid_cuenta_contable_costo_originalDetalleGrupoActivoFijoBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_costo_originalDetalleGrupoActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_costo_originalDetalleGrupoActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_costo_originalDetalleGrupoActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_costo_originalDetalleGrupoActivoFijoBusqueda.setText("U");
		this.jButtonid_cuenta_contable_costo_originalDetalleGrupoActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_costo_originalDetalleGrupoActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_costo_originalDetalleGrupoActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_costo_originalDetalleGrupoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_costo_originalDetalleGrupoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_costo_originalDetalleGrupoActivoFijoBusqueda"));

		if(this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_costo_originalDetalleGrupoActivoFijoBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_costo_originalDetalleGrupoActivoFijoUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_costo_originalDetalleGrupoActivoFijoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_costo_originalDetalleGrupoActivoFijoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_costo_originalDetalleGrupoActivoFijoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_costo_originalDetalleGrupoActivoFijoUpdate.setText("U");
		this.jButtonid_cuenta_contable_costo_originalDetalleGrupoActivoFijoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_costo_originalDetalleGrupoActivoFijoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_costo_originalDetalleGrupoActivoFijoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_costo_originalDetalleGrupoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_costo_originalDetalleGrupoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_costo_originalDetalleGrupoActivoFijoUpdate"));


		jButtonid_cuenta_contable_costo_originalDetalleGrupoActivoFijoArbol= new JButtonMe();
		jButtonid_cuenta_contable_costo_originalDetalleGrupoActivoFijoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_costo_originalDetalleGrupoActivoFijoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_costo_originalDetalleGrupoActivoFijoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_costo_originalDetalleGrupoActivoFijoArbol.setText("Arbol");
		jButtonid_cuenta_contable_costo_originalDetalleGrupoActivoFijoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_costo_originalDetalleGrupoActivoFijoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_costo_originalDetalleGrupoActivoFijoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_costo_originalDetalleGrupoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_costo_originalDetalleGrupoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_costo_originalDetalleGrupoActivoFijoArbol"));



					
		this.jLabelid_cuenta_contable_depre_normalDetalleGrupoActivoFijo = new JLabelMe();
		this.jLabelid_cuenta_contable_depre_normalDetalleGrupoActivoFijo.setText(""+DetalleGrupoActivoFijoConstantesFunciones.LABEL_IDCUENTACONTABLEDEPRENORMAL+" : *");
		this.jLabelid_cuenta_contable_depre_normalDetalleGrupoActivoFijo.setToolTipText("Cuenta Contable Depre Normal");
		this.jLabelid_cuenta_contable_depre_normalDetalleGrupoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_depre_normalDetalleGrupoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_depre_normalDetalleGrupoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_depre_normalDetalleGrupoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_depre_normalDetalleGrupoActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_depre_normalDetalleGrupoActivoFijo.setToolTipText(DetalleGrupoActivoFijoConstantesFunciones.LABEL_IDCUENTACONTABLEDEPRENORMAL);
		this.gridaBagLayoutDetalleGrupoActivoFijo = new GridBagLayout();
		this.jPanelid_cuenta_contable_depre_normalDetalleGrupoActivoFijo.setLayout(this.gridaBagLayoutDetalleGrupoActivoFijo);


		jComboBoxid_cuenta_contable_depre_normalDetalleGrupoActivoFijo= new JComboBoxMe();
		jComboBoxid_cuenta_contable_depre_normalDetalleGrupoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_depre_normalDetalleGrupoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_depre_normalDetalleGrupoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_depre_normalDetalleGrupoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_depre_normalDetalleGrupoActivoFijo= new JButtonMe();
		this.jButtonid_cuenta_contable_depre_normalDetalleGrupoActivoFijo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_depre_normalDetalleGrupoActivoFijo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_depre_normalDetalleGrupoActivoFijo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_depre_normalDetalleGrupoActivoFijo.setText("Buscar");
		this.jButtonid_cuenta_contable_depre_normalDetalleGrupoActivoFijo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_depre_normalDetalleGrupoActivoFijo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_depre_normalDetalleGrupoActivoFijo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_depre_normalDetalleGrupoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_depre_normalDetalleGrupoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_depre_normalDetalleGrupoActivoFijo"));

		this.jButtonid_cuenta_contable_depre_normalDetalleGrupoActivoFijoBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_depre_normalDetalleGrupoActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_depre_normalDetalleGrupoActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_depre_normalDetalleGrupoActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_depre_normalDetalleGrupoActivoFijoBusqueda.setText("U");
		this.jButtonid_cuenta_contable_depre_normalDetalleGrupoActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_depre_normalDetalleGrupoActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_depre_normalDetalleGrupoActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_depre_normalDetalleGrupoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_depre_normalDetalleGrupoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_depre_normalDetalleGrupoActivoFijoBusqueda"));

		if(this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_depre_normalDetalleGrupoActivoFijoBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_depre_normalDetalleGrupoActivoFijoUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_depre_normalDetalleGrupoActivoFijoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_depre_normalDetalleGrupoActivoFijoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_depre_normalDetalleGrupoActivoFijoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_depre_normalDetalleGrupoActivoFijoUpdate.setText("U");
		this.jButtonid_cuenta_contable_depre_normalDetalleGrupoActivoFijoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_depre_normalDetalleGrupoActivoFijoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_depre_normalDetalleGrupoActivoFijoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_depre_normalDetalleGrupoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_depre_normalDetalleGrupoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_depre_normalDetalleGrupoActivoFijoUpdate"));


		jButtonid_cuenta_contable_depre_normalDetalleGrupoActivoFijoArbol= new JButtonMe();
		jButtonid_cuenta_contable_depre_normalDetalleGrupoActivoFijoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_depre_normalDetalleGrupoActivoFijoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_depre_normalDetalleGrupoActivoFijoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_depre_normalDetalleGrupoActivoFijoArbol.setText("Arbol");
		jButtonid_cuenta_contable_depre_normalDetalleGrupoActivoFijoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_depre_normalDetalleGrupoActivoFijoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_depre_normalDetalleGrupoActivoFijoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_depre_normalDetalleGrupoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_depre_normalDetalleGrupoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_depre_normalDetalleGrupoActivoFijoArbol"));



					
		this.jLabelid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo = new JLabelMe();
		this.jLabelid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo.setText(""+DetalleGrupoActivoFijoConstantesFunciones.LABEL_IDCUENTACONTABLEDEPREGASTONORMAL+" : *");
		this.jLabelid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo.setToolTipText("Cuenta Contable Depre Gasto Normal");
		this.jLabelid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo.setToolTipText(DetalleGrupoActivoFijoConstantesFunciones.LABEL_IDCUENTACONTABLEDEPREGASTONORMAL);
		this.gridaBagLayoutDetalleGrupoActivoFijo = new GridBagLayout();
		this.jPanelid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo.setLayout(this.gridaBagLayoutDetalleGrupoActivoFijo);


		jComboBoxid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo= new JComboBoxMe();
		jComboBoxid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo= new JButtonMe();
		this.jButtonid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo.setText("Buscar");
		this.jButtonid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo"));

		this.jButtonid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijoBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijoBusqueda.setText("U");
		this.jButtonid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijoBusqueda"));

		if(this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijoBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijoUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijoUpdate.setText("U");
		this.jButtonid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijoUpdate"));


		jButtonid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijoArbol= new JButtonMe();
		jButtonid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijoArbol.setText("Arbol");
		jButtonid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijoArbol"));



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
		//this.jInternalFrameDetalleDetalleGrupoActivoFijo = new DetalleGrupoActivoFijoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Detalle Grupo Activo Fijo DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetalleGrupoActivoFijo= new GridBagLayout();
		

		
		String sToolTipDetalleGrupoActivoFijo="";
		sToolTipDetalleGrupoActivoFijo=DetalleGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetalleGrupoActivoFijo+="(ActivosFijos.DetalleGrupoActivoFijo)";
		}
		
		if(!this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetalleGrupoActivoFijo+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoDetalleGrupoActivoFijo = new JButtonMe();
		this.jButtonModificarDetalleGrupoActivoFijo = new JButtonMe();
        this.jButtonActualizarDetalleGrupoActivoFijo = new JButtonMe();
        this.jButtonEliminarDetalleGrupoActivoFijo = new JButtonMe();
        this.jButtonCancelarDetalleGrupoActivoFijo = new JButtonMe();
        this.jButtonGuardarCambiosDetalleGrupoActivoFijo = new JButtonMe();
		this.jButtonGuardarCambiosTablaDetalleGrupoActivoFijo = new JButtonMe();
		this.jButtonCerrarDetalleGrupoActivoFijo = new JButtonMe();
		
		this.jScrollPanelDatosDetalleGrupoActivoFijo = new JScrollPane();   
        this.jScrollPanelDatosEdicionDetalleGrupoActivoFijo = new JScrollPane();
		this.jScrollPanelDatosGeneralDetalleGrupoActivoFijo = new JScrollPane();
				
		
		
		this.jPanelCamposDetalleGrupoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosDetalleGrupoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesDetalleGrupoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioDetalleGrupoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Grupo Activo Fijo";
		
		if(!this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetalleGrupoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Grupo Activo Fijos" + this.sPath));
		} else {
			this.jScrollPanelDatosDetalleGrupoActivoFijo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionDetalleGrupoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralDetalleGrupoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposDetalleGrupoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposDetalleGrupoActivoFijo.setName("jPanelCamposDetalleGrupoActivoFijo"); 

		this.jPanelCamposOcultosDetalleGrupoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosDetalleGrupoActivoFijo.setName("jPanelCamposOcultosDetalleGrupoActivoFijo"); 

        this.jPanelAccionesDetalleGrupoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetalleGrupoActivoFijo.setToolTipText("Acciones");
        this.jPanelAccionesDetalleGrupoActivoFijo.setName("Acciones"); 

		this.jPanelAccionesFormularioDetalleGrupoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioDetalleGrupoActivoFijo.setToolTipText("Acciones");
        this.jPanelAccionesFormularioDetalleGrupoActivoFijo.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoDetalleGrupoActivoFijo.setText("Nuevo");
		this.jButtonModificarDetalleGrupoActivoFijo.setText("Editar");
        this.jButtonActualizarDetalleGrupoActivoFijo.setText("Actualizar");
        this.jButtonEliminarDetalleGrupoActivoFijo.setText("Eliminar");
        this.jButtonCancelarDetalleGrupoActivoFijo.setText("Cancelar");
        this.jButtonGuardarCambiosDetalleGrupoActivoFijo.setText("Guardar");
		this.jButtonGuardarCambiosTablaDetalleGrupoActivoFijo.setText("Guardar");
		this.jButtonCerrarDetalleGrupoActivoFijo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetalleGrupoActivoFijo,"nuevo_button","Nuevo",this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarDetalleGrupoActivoFijo,"modificar_button","Editar",this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarDetalleGrupoActivoFijo,"actualizar_button","Actualizar",this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarDetalleGrupoActivoFijo,"eliminar_button","Eliminar",this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarDetalleGrupoActivoFijo,"cancelar_button","Cancelar",this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosDetalleGrupoActivoFijo,"guardarcambios_button","Guardar",this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetalleGrupoActivoFijo,"guardarcambiostabla_button","Guardar",this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetalleGrupoActivoFijo,"cerrar_button","Salir",this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoDetalleGrupoActivoFijo.setToolTipText("Nuevo"+" "+DetalleGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarDetalleGrupoActivoFijo.setToolTipText("Editar"+" "+DetalleGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarDetalleGrupoActivoFijo.setToolTipText("Actualizar"+" "+DetalleGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarDetalleGrupoActivoFijo.setToolTipText("Eliminar)"+" "+DetalleGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarDetalleGrupoActivoFijo.setToolTipText("Cancelar"+" "+DetalleGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosDetalleGrupoActivoFijo.setToolTipText("Guardar"+" "+DetalleGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaDetalleGrupoActivoFijo.setToolTipText("Guardar"+" "+DetalleGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetalleGrupoActivoFijo.setToolTipText("Salir"+" "+DetalleGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetalleGrupoActivoFijo";
		inputMap = this.jButtonNuevoDetalleGrupoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetalleGrupoActivoFijo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetalleGrupoActivoFijo"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarDetalleGrupoActivoFijo";
		inputMap = this.jButtonActualizarDetalleGrupoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarDetalleGrupoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarDetalleGrupoActivoFijo"));
		
		//ELIMINAR
		sMapKey = "EliminarDetalleGrupoActivoFijo";
		inputMap = this.jButtonEliminarDetalleGrupoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarDetalleGrupoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarDetalleGrupoActivoFijo"));
		
		//CANCELAR	
		sMapKey = "CancelarDetalleGrupoActivoFijo";
		inputMap = this.jButtonCancelarDetalleGrupoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarDetalleGrupoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarDetalleGrupoActivoFijo"));
		
		//CERRAR		
		sMapKey = "CerrarDetalleGrupoActivoFijo";
		inputMap = this.jButtonCerrarDetalleGrupoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetalleGrupoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetalleGrupoActivoFijo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetalleGrupoActivoFijo";
		inputMap = this.jButtonGuardarCambiosTablaDetalleGrupoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetalleGrupoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetalleGrupoActivoFijo"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoDetalleGrupoActivoFijo = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoDetalleGrupoActivoFijo.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoDetalleGrupoActivoFijo.setToolTipText("Nuevo DetalleGrupoActivoFijo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarDetalleGrupoActivoFijo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarDetalleGrupoActivoFijo.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarDetalleGrupoActivoFijo.setToolTipText("Sin Cerrar Ventana DetalleGrupoActivoFijo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeDetalleGrupoActivoFijo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeDetalleGrupoActivoFijo.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeDetalleGrupoActivoFijo.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesDetalleGrupoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetalleGrupoActivoFijo.setText("Accion");
		this.jComboBoxTiposAccionesDetalleGrupoActivoFijo.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioDetalleGrupoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioDetalleGrupoActivoFijo.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioDetalleGrupoActivoFijo.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesDetalleGrupoActivoFijo = new JLabelMe();
		
		this.jLabelAccionesDetalleGrupoActivoFijo.setText("Acciones");		
		this.jLabelAccionesDetalleGrupoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleGrupoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleGrupoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposDetalleGrupoActivoFijo();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysDetalleGrupoActivoFijo();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesDetalleGrupoActivoFijo=new JTabbedPane();
		this.jTabbedPaneRelacionesDetalleGrupoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesDetalleGrupoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesDetalleGrupoActivoFijo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleGrupoActivoFijo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleGrupoActivoFijo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioDetalleGrupoActivoFijo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetalleGrupoActivoFijo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetalleGrupoActivoFijo.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioDetalleGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposDetalleGrupoActivoFijo = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosDetalleGrupoActivoFijo = new GridBagLayout();
		
		this.jPanelCamposDetalleGrupoActivoFijo.setLayout(gridaBagLayoutCamposDetalleGrupoActivoFijo);
		this.jPanelCamposOcultosDetalleGrupoActivoFijo.setLayout(gridaBagLayoutCamposOcultosDetalleGrupoActivoFijo);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = 0;
	this.gridBagConstraintsDetalleGrupoActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleGrupoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidDetalleGrupoActivoFijo.add(jLabelIdDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);



	this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = 1;
	this.gridBagConstraintsDetalleGrupoActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleGrupoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidDetalleGrupoActivoFijo.add(jLabelidDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);


	this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = 0;
	this.gridBagConstraintsDetalleGrupoActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleGrupoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaDetalleGrupoActivoFijo.add(jLabelid_empresaDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = 0;
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = 2;
		this.gridBagConstraintsDetalleGrupoActivoFijo.ipadx = 0;
		this.gridBagConstraintsDetalleGrupoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetalleGrupoActivoFijo.add(jButtonid_empresaDetalleGrupoActivoFijoBusqueda, this.gridBagConstraintsDetalleGrupoActivoFijo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = 0;
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = 3;
		this.gridBagConstraintsDetalleGrupoActivoFijo.ipadx = 0;
		this.gridBagConstraintsDetalleGrupoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetalleGrupoActivoFijo.add(jButtonid_empresaDetalleGrupoActivoFijoUpdate, this.gridBagConstraintsDetalleGrupoActivoFijo);
	}

	this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = 1;
	this.gridBagConstraintsDetalleGrupoActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleGrupoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaDetalleGrupoActivoFijo.add(jComboBoxid_empresaDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);


	this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = 0;
	this.gridBagConstraintsDetalleGrupoActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleGrupoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoDetalleGrupoActivoFijo.add(jLabelcodigoDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = 0;
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = 2;
		this.gridBagConstraintsDetalleGrupoActivoFijo.ipadx = 0;
		this.gridBagConstraintsDetalleGrupoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoDetalleGrupoActivoFijo.add(jButtoncodigoDetalleGrupoActivoFijoBusqueda, this.gridBagConstraintsDetalleGrupoActivoFijo);
	}

	this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = 1;
	this.gridBagConstraintsDetalleGrupoActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleGrupoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoDetalleGrupoActivoFijo.add(jTextFieldcodigoDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);


	this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = 0;
	this.gridBagConstraintsDetalleGrupoActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleGrupoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreDetalleGrupoActivoFijo.add(jLabelnombreDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = 0;
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = 2;
		this.gridBagConstraintsDetalleGrupoActivoFijo.ipadx = 0;
		this.gridBagConstraintsDetalleGrupoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreDetalleGrupoActivoFijo.add(jButtonnombreDetalleGrupoActivoFijoBusqueda, this.gridBagConstraintsDetalleGrupoActivoFijo);
	}

	this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = 1;
	this.gridBagConstraintsDetalleGrupoActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleGrupoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreDetalleGrupoActivoFijo.add(jscrollPanenombreDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);


	this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = 0;
	this.gridBagConstraintsDetalleGrupoActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleGrupoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsiglasDetalleGrupoActivoFijo.add(jLabelsiglasDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = 0;
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = 2;
		this.gridBagConstraintsDetalleGrupoActivoFijo.ipadx = 0;
		this.gridBagConstraintsDetalleGrupoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelsiglasDetalleGrupoActivoFijo.add(jButtonsiglasDetalleGrupoActivoFijoBusqueda, this.gridBagConstraintsDetalleGrupoActivoFijo);
	}

	this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = 1;
	this.gridBagConstraintsDetalleGrupoActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleGrupoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsiglasDetalleGrupoActivoFijo.add(jTextFieldsiglasDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);


	this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = 0;
	this.gridBagConstraintsDetalleGrupoActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleGrupoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_costo_originalDetalleGrupoActivoFijo.add(jLabelid_cuenta_contable_costo_originalDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
	//this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = 2;
	this.gridBagConstraintsDetalleGrupoActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleGrupoActivoFijo.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_costo_originalDetalleGrupoActivoFijo.add(jButtonid_cuenta_contable_costo_originalDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
	//this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = 3;
	this.gridBagConstraintsDetalleGrupoActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleGrupoActivoFijo.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_costo_originalDetalleGrupoActivoFijo.add(jButtonid_cuenta_contable_costo_originalDetalleGrupoActivoFijoArbol, this.gridBagConstraintsDetalleGrupoActivoFijo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = 0;
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = 4;
		this.gridBagConstraintsDetalleGrupoActivoFijo.ipadx = 0;
		this.gridBagConstraintsDetalleGrupoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_costo_originalDetalleGrupoActivoFijo.add(jButtonid_cuenta_contable_costo_originalDetalleGrupoActivoFijoBusqueda, this.gridBagConstraintsDetalleGrupoActivoFijo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = 0;
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = 5;
		this.gridBagConstraintsDetalleGrupoActivoFijo.ipadx = 0;
		this.gridBagConstraintsDetalleGrupoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_costo_originalDetalleGrupoActivoFijo.add(jButtonid_cuenta_contable_costo_originalDetalleGrupoActivoFijoUpdate, this.gridBagConstraintsDetalleGrupoActivoFijo);
	}

	this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = 1;
	this.gridBagConstraintsDetalleGrupoActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleGrupoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_costo_originalDetalleGrupoActivoFijo.add(jComboBoxid_cuenta_contable_costo_originalDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);


	this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = 0;
	this.gridBagConstraintsDetalleGrupoActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleGrupoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_depre_normalDetalleGrupoActivoFijo.add(jLabelid_cuenta_contable_depre_normalDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
	//this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = 2;
	this.gridBagConstraintsDetalleGrupoActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleGrupoActivoFijo.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_depre_normalDetalleGrupoActivoFijo.add(jButtonid_cuenta_contable_depre_normalDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
	//this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = 3;
	this.gridBagConstraintsDetalleGrupoActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleGrupoActivoFijo.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_depre_normalDetalleGrupoActivoFijo.add(jButtonid_cuenta_contable_depre_normalDetalleGrupoActivoFijoArbol, this.gridBagConstraintsDetalleGrupoActivoFijo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = 0;
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = 4;
		this.gridBagConstraintsDetalleGrupoActivoFijo.ipadx = 0;
		this.gridBagConstraintsDetalleGrupoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_depre_normalDetalleGrupoActivoFijo.add(jButtonid_cuenta_contable_depre_normalDetalleGrupoActivoFijoBusqueda, this.gridBagConstraintsDetalleGrupoActivoFijo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = 0;
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = 5;
		this.gridBagConstraintsDetalleGrupoActivoFijo.ipadx = 0;
		this.gridBagConstraintsDetalleGrupoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_depre_normalDetalleGrupoActivoFijo.add(jButtonid_cuenta_contable_depre_normalDetalleGrupoActivoFijoUpdate, this.gridBagConstraintsDetalleGrupoActivoFijo);
	}

	this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = 1;
	this.gridBagConstraintsDetalleGrupoActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleGrupoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_depre_normalDetalleGrupoActivoFijo.add(jComboBoxid_cuenta_contable_depre_normalDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);


	this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = 0;
	this.gridBagConstraintsDetalleGrupoActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleGrupoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo.add(jLabelid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
	//this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = 2;
	this.gridBagConstraintsDetalleGrupoActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleGrupoActivoFijo.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo.add(jButtonid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
	//this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = 3;
	this.gridBagConstraintsDetalleGrupoActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleGrupoActivoFijo.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo.add(jButtonid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijoArbol, this.gridBagConstraintsDetalleGrupoActivoFijo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = 0;
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = 4;
		this.gridBagConstraintsDetalleGrupoActivoFijo.ipadx = 0;
		this.gridBagConstraintsDetalleGrupoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo.add(jButtonid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijoBusqueda, this.gridBagConstraintsDetalleGrupoActivoFijo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = 0;
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = 5;
		this.gridBagConstraintsDetalleGrupoActivoFijo.ipadx = 0;
		this.gridBagConstraintsDetalleGrupoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo.add(jButtonid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijoUpdate, this.gridBagConstraintsDetalleGrupoActivoFijo);
	}

	this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = 0;
	this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = 1;
	this.gridBagConstraintsDetalleGrupoActivoFijo.ipadx = 0;
	this.gridBagConstraintsDetalleGrupoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo.add(jComboBoxid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleGrupoActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = iYPanelCamposDetalleGrupoActivoFijo;
	this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = iXPanelCamposDetalleGrupoActivoFijo++;
	this.gridBagConstraintsDetalleGrupoActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleGrupoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleGrupoActivoFijo.add(this.jPanelidDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);



	if(iXPanelCamposDetalleGrupoActivoFijo % 1==0) {
		iXPanelCamposDetalleGrupoActivoFijo=0;
		iYPanelCamposDetalleGrupoActivoFijo++;
	}
	this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleGrupoActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = iYPanelCamposDetalleGrupoActivoFijo;
	this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = iXPanelCamposDetalleGrupoActivoFijo++;
	this.gridBagConstraintsDetalleGrupoActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleGrupoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleGrupoActivoFijo.add(this.jPanelcodigoDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);



	if(iXPanelCamposDetalleGrupoActivoFijo % 1==0) {
		iXPanelCamposDetalleGrupoActivoFijo=0;
		iYPanelCamposDetalleGrupoActivoFijo++;
	}
	this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleGrupoActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = iYPanelCamposDetalleGrupoActivoFijo;
	this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = iXPanelCamposDetalleGrupoActivoFijo++;
	this.gridBagConstraintsDetalleGrupoActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleGrupoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleGrupoActivoFijo.add(this.jPanelnombreDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);



	if(iXPanelCamposDetalleGrupoActivoFijo % 1==0) {
		iXPanelCamposDetalleGrupoActivoFijo=0;
		iYPanelCamposDetalleGrupoActivoFijo++;
	}
	this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleGrupoActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = iYPanelCamposDetalleGrupoActivoFijo;
	this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = iXPanelCamposDetalleGrupoActivoFijo++;
	this.gridBagConstraintsDetalleGrupoActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleGrupoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleGrupoActivoFijo.add(this.jPanelsiglasDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);



	if(iXPanelCamposDetalleGrupoActivoFijo % 1==0) {
		iXPanelCamposDetalleGrupoActivoFijo=0;
		iYPanelCamposDetalleGrupoActivoFijo++;
	}
	this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleGrupoActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = iYPanelCamposDetalleGrupoActivoFijo;
	this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = iXPanelCamposDetalleGrupoActivoFijo++;
	this.gridBagConstraintsDetalleGrupoActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleGrupoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleGrupoActivoFijo.add(this.jPanelid_cuenta_contable_costo_originalDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);



	if(iXPanelCamposDetalleGrupoActivoFijo % 1==0) {
		iXPanelCamposDetalleGrupoActivoFijo=0;
		iYPanelCamposDetalleGrupoActivoFijo++;
	}
	this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleGrupoActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = iYPanelCamposDetalleGrupoActivoFijo;
	this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = iXPanelCamposDetalleGrupoActivoFijo++;
	this.gridBagConstraintsDetalleGrupoActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleGrupoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleGrupoActivoFijo.add(this.jPanelid_cuenta_contable_depre_normalDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);



	if(iXPanelCamposDetalleGrupoActivoFijo % 1==0) {
		iXPanelCamposDetalleGrupoActivoFijo=0;
		iYPanelCamposDetalleGrupoActivoFijo++;
	}
	this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleGrupoActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = iYPanelCamposDetalleGrupoActivoFijo;
	this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = iXPanelCamposDetalleGrupoActivoFijo++;
	this.gridBagConstraintsDetalleGrupoActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleGrupoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleGrupoActivoFijo.add(this.jPanelid_cuenta_contable_depre_gasto_normalDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);



	if(iXPanelCamposDetalleGrupoActivoFijo % 1==0) {
		iXPanelCamposDetalleGrupoActivoFijo=0;
		iYPanelCamposDetalleGrupoActivoFijo++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleGrupoActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = iYPanelCamposOcultosDetalleGrupoActivoFijo;
	this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = iXPanelCamposOcultosDetalleGrupoActivoFijo++;
	this.gridBagConstraintsDetalleGrupoActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleGrupoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleGrupoActivoFijo.add(this.jPanelid_empresaDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);



	if(iXPanelCamposOcultosDetalleGrupoActivoFijo % 1==0) {
		iXPanelCamposOcultosDetalleGrupoActivoFijo=0;
		iYPanelCamposOcultosDetalleGrupoActivoFijo++;
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
			
		GridBagLayout gridaBagLayoutAccionesDetalleGrupoActivoFijo= new GridBagLayout();
		this.jPanelAccionesDetalleGrupoActivoFijo.setLayout(gridaBagLayoutAccionesDetalleGrupoActivoFijo);
		
		GridBagLayout gridaBagLayoutAccionesFormularioDetalleGrupoActivoFijo= new GridBagLayout();
		this.jPanelAccionesFormularioDetalleGrupoActivoFijo.setLayout(gridaBagLayoutAccionesFormularioDetalleGrupoActivoFijo);
		
		this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetalleGrupoActivoFijo.add(this.jComboBoxTiposAccionesFormularioDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);

		this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetalleGrupoActivoFijo.add(this.jCheckBoxPostAccionNuevoDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.detallegrupoactivofijoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetalleGrupoActivoFijo.add(this.jCheckBoxPostAccionSinCerrarDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.detallegrupoactivofijoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetalleGrupoActivoFijo.add(this.jCheckBoxPostAccionSinMensajeDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = 0;
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = iPosXAccion++;
			
		this.jPanelAccionesDetalleGrupoActivoFijo.add(this.jButtonModificarDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);							

		this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = 0;
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridx =iPosXAccion++;
			
		this.jPanelAccionesDetalleGrupoActivoFijo.add(this.jButtonEliminarDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);
		
			
		this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = 0;		
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetalleGrupoActivoFijo.add(this.jButtonActualizarDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);


		this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = 0;		
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetalleGrupoActivoFijo.add(this.jButtonGuardarCambiosDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);	
		
		this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = 0;		
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridx =iPosXAccion++;
		
		this.jPanelAccionesDetalleGrupoActivoFijo.add(this.jButtonCancelarDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetalleGrupoActivoFijo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetalleGrupoActivoFijo);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detallegrupoactivofijoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();						
			this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = 0;		
			//this.gridBagConstraintsDetalleGrupoActivoFijo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleGrupoActivoFijo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetalleGrupoActivoFijo.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridx =0;
		this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetalleGrupoActivoFijo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(DetalleGrupoActivoFijoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleDetalleGrupoActivoFijo = new DetalleGrupoActivoFijoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Detalle Grupo Activo Fijo DATOS");
			
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
			
	        //this.setTitle("[FOR] - Detalle Grupo Activo Fijo DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Detalle Grupo Activo Fijo Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			DetalleGrupoActivoFijoModel detallegrupoactivofijoModel=new DetalleGrupoActivoFijoModel(this);
			
			//SI USARA CLASE INTERNA
			//DetalleGrupoActivoFijoModel.DetalleGrupoActivoFijoFocusTraversalPolicy detallegrupoactivofijoFocusTraversalPolicy = detallegrupoactivofijoModel.new DetalleGrupoActivoFijoFocusTraversalPolicy(this);
			
			//detallegrupoactivofijoFocusTraversalPolicy.setdetallegrupoactivofijoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(detallegrupoactivofijoModel);
			
			
			this.jContentPaneDetalleDetalleGrupoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleDetalleGrupoActivoFijo = new GridBagLayout();	
			this.jContentPaneDetalleDetalleGrupoActivoFijo.setLayout(gridaBagLayoutDetalleDetalleGrupoActivoFijo);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetalleGrupoActivoFijo = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
				this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = 0;
					
				
				this.jContentPaneDetalleDetalleGrupoActivoFijo.add(jTtoolBarDetalleDetalleGrupoActivoFijo, gridBagConstraintsDetalleGrupoActivoFijo);								
				
}
			
			this.jScrollPanelDatosEdicionDetalleGrupoActivoFijo=   new JScrollPane(jContentPaneDetalleDetalleGrupoActivoFijo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetalleGrupoActivoFijo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleGrupoActivoFijo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleGrupoActivoFijo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralDetalleGrupoActivoFijo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetalleGrupoActivoFijo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleGrupoActivoFijo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleGrupoActivoFijo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
			
			
	        this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = 0;
	        
			this.jContentPaneDetalleDetalleGrupoActivoFijo.add(jPanelCamposDetalleGrupoActivoFijo, gridBagConstraintsDetalleGrupoActivoFijo);
			
			
			
			
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
						&& detallegrupoactivofijoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameCuentaContaDetaGrupoActi(this.puedeCargarPorParteCuentaContaDetaGrupoActi,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameDetalleActivoFijo(this.puedeCargarPorParteDetalleActivoFijo,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameGastoDepreciacion(this.puedeCargarPorParteGastoDepreciacion,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameSubGrupoActivoFijo(this.puedeCargarPorParteSubGrupoActivoFijo,false,-1);
					
					if(this.detallegrupoactivofijoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsDetalleGrupoActivoFijo= new GridBagConstraints();
						this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = iGridyRelaciones++;
						this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = 0;
						this.jContentPaneDetalleDetalleGrupoActivoFijo.add(this.jTabbedPaneRelacionesDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesDetalleGrupoActivoFijo.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameCuentaContaDetaGrupoActi(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameDetalleActivoFijo(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameGastoDepreciacion(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameSubGrupoActivoFijo(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosDetalleGrupoActivoFijo.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
					this.gridBagConstraintsDetalleGrupoActivoFijo.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsDetalleGrupoActivoFijo.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = 0;
					
				
					this.jContentPaneDetalleDetalleGrupoActivoFijo.add(jPanelCamposOcultosDetalleGrupoActivoFijo, gridBagConstraintsDetalleGrupoActivoFijo);
				
					this.jPanelCamposOcultosDetalleGrupoActivoFijo.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = iGridyRelaciones++;//13;		
	        this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = 0;
	        this.gridBagConstraintsDetalleGrupoActivoFijo.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleDetalleGrupoActivoFijo.add(this.jPanelAccionesFormularioDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);							
			
			
			
			this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
	        this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = iGridyRelaciones;//13;		
	        this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = 0;
	        
			
			this.jContentPaneDetalleDetalleGrupoActivoFijo.add(this.jPanelAccionesDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionDetalleGrupoActivoFijo);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionDetalleGrupoActivoFijo=   new JScrollPane(this.jPanelCamposDetalleGrupoActivoFijo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetalleGrupoActivoFijo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleGrupoActivoFijo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleGrupoActivoFijo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = 0;
			this.gridBagConstraintsDetalleGrupoActivoFijo.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsDetalleGrupoActivoFijo.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsDetalleGrupoActivoFijo.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDetalleGrupoActivoFijo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);			
			
			this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsDetalleGrupoActivoFijo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);
			
			
		this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);
		
			
		this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetalleGrupoActivoFijo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetalleGrupoActivoFijo, this.gridBagConstraintsDetalleGrupoActivoFijo);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralDetalleGrupoActivoFijo;//jContentPane;
		
		return jScrollPanelDatosEdicionDetalleGrupoActivoFijo;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameCuentaContaDetaGrupoActi(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.cuentacontadetagrupoactiSessionBean=new CuentaContaDetaGrupoActiSessionBean();
		this.cuentacontadetagrupoactiSessionBean.setConGuardarRelaciones(false);
		this.cuentacontadetagrupoactiSessionBean.setEsGuardarRelacionado(true);

		this.cuentacontadetagrupoactiBeanSwingJInternalFrame=null;//new CuentaContaDetaGrupoActiBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.cuentacontadetagrupoactiBeanSwingJInternalFramePopup=new CuentaContaDetaGrupoActiBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.cuentacontadetagrupoactiBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado()) {

				CuentaContaDetaGrupoActiJInternalFrame.STIPO_TAMANIO_GENERAL=DetalleGrupoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL;
				CuentaContaDetaGrupoActiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=DetalleGrupoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.cuentacontadetagrupoactiSessionBean.setEsGuardarRelacionado(true);

				this.cuentacontadetagrupoactiBeanSwingJInternalFrame=new CuentaContaDetaGrupoActiBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.cuentacontadetagrupoactiBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.cuentacontadetagrupoactiBeanSwingJInternalFrame.setcuentacontadetagrupoactiSessionBean(this.cuentacontadetagrupoactiSessionBean);

				//this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
				//this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = 0;
				//this.jContentPaneDetalleDetalleGrupoActivoFijo.add(this.cuentacontadetagrupoactiBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsDetalleGrupoActivoFijo);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesDetalleGrupoActivoFijo.add("Cuenta Conta Deta Grupo Actis",this.cuentacontadetagrupoactiBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesDetalleGrupoActivoFijo.setComponentAt(iIndexTab,this.cuentacontadetagrupoactiBeanSwingJInternalFrame.getContentPane());
				}

				//CuentaContaDetaGrupoActiJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.cuentacontadetagrupoactiSessionBean.setEsGuardarRelacionado(false);
				this.cuentacontadetagrupoactiBeanSwingJInternalFrame=null;//new CuentaContaDetaGrupoActiBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteCuentaContaDetaGrupoActi) {
					this.jTabbedPaneRelacionesDetalleGrupoActivoFijo.add("Cuenta Conta Deta Grupo Actis",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameDetalleActivoFijo(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.detalleactivofijoSessionBean=new DetalleActivoFijoSessionBean();
		this.detalleactivofijoSessionBean.setConGuardarRelaciones(false);
		this.detalleactivofijoSessionBean.setEsGuardarRelacionado(true);

		this.detalleactivofijoBeanSwingJInternalFrame=null;//new DetalleActivoFijoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.detalleactivofijoBeanSwingJInternalFramePopup=new DetalleActivoFijoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.detalleactivofijoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.detalleactivofijoSessionBean.getEsGuardarRelacionado()) {

				DetalleActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL=DetalleGrupoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL;
				DetalleActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=DetalleGrupoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.detalleactivofijoSessionBean.setEsGuardarRelacionado(true);

				this.detalleactivofijoBeanSwingJInternalFrame=new DetalleActivoFijoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.detalleactivofijoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.detalleactivofijoBeanSwingJInternalFrame.setdetalleactivofijoSessionBean(this.detalleactivofijoSessionBean);

				//this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
				//this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = 0;
				//this.jContentPaneDetalleDetalleGrupoActivoFijo.add(this.detalleactivofijoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsDetalleGrupoActivoFijo);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesDetalleGrupoActivoFijo.add("Detalle Activo Fijos",this.detalleactivofijoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesDetalleGrupoActivoFijo.setComponentAt(iIndexTab,this.detalleactivofijoBeanSwingJInternalFrame.getContentPane());
				}

				//DetalleActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.detalleactivofijoSessionBean.setEsGuardarRelacionado(false);
				this.detalleactivofijoBeanSwingJInternalFrame=null;//new DetalleActivoFijoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.detalleactivofijoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDetalleActivoFijo) {
					this.jTabbedPaneRelacionesDetalleGrupoActivoFijo.add("Detalle Activo Fijos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameGastoDepreciacion(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.gastodepreciacionSessionBean=new GastoDepreciacionSessionBean();
		this.gastodepreciacionSessionBean.setConGuardarRelaciones(false);
		this.gastodepreciacionSessionBean.setEsGuardarRelacionado(true);

		this.gastodepreciacionBeanSwingJInternalFrame=null;//new GastoDepreciacionBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.gastodepreciacionBeanSwingJInternalFramePopup=new GastoDepreciacionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.gastodepreciacionBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.gastodepreciacionSessionBean.getEsGuardarRelacionado()) {

				GastoDepreciacionJInternalFrame.STIPO_TAMANIO_GENERAL=DetalleGrupoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL;
				GastoDepreciacionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=DetalleGrupoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.gastodepreciacionSessionBean.setEsGuardarRelacionado(true);

				this.gastodepreciacionBeanSwingJInternalFrame=new GastoDepreciacionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.gastodepreciacionBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.gastodepreciacionBeanSwingJInternalFrame.setgastodepreciacionSessionBean(this.gastodepreciacionSessionBean);

				//this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
				//this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = 0;
				//this.jContentPaneDetalleDetalleGrupoActivoFijo.add(this.gastodepreciacionBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsDetalleGrupoActivoFijo);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesDetalleGrupoActivoFijo.add("Gasto Depreciaciones",this.gastodepreciacionBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesDetalleGrupoActivoFijo.setComponentAt(iIndexTab,this.gastodepreciacionBeanSwingJInternalFrame.getContentPane());
				}

				//GastoDepreciacionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.gastodepreciacionSessionBean.setEsGuardarRelacionado(false);
				this.gastodepreciacionBeanSwingJInternalFrame=null;//new GastoDepreciacionBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.gastodepreciacionSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteGastoDepreciacion) {
					this.jTabbedPaneRelacionesDetalleGrupoActivoFijo.add("Gasto Depreciaciones",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameSubGrupoActivoFijo(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.subgrupoactivofijoSessionBean=new SubGrupoActivoFijoSessionBean();
		this.subgrupoactivofijoSessionBean.setConGuardarRelaciones(false);
		this.subgrupoactivofijoSessionBean.setEsGuardarRelacionado(true);

		this.subgrupoactivofijoBeanSwingJInternalFrame=null;//new SubGrupoActivoFijoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.subgrupoactivofijoBeanSwingJInternalFramePopup=new SubGrupoActivoFijoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.subgrupoactivofijoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado()) {

				SubGrupoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL=DetalleGrupoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL;
				SubGrupoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=DetalleGrupoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.subgrupoactivofijoSessionBean.setEsGuardarRelacionado(true);

				this.subgrupoactivofijoBeanSwingJInternalFrame=new SubGrupoActivoFijoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.subgrupoactivofijoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.subgrupoactivofijoBeanSwingJInternalFrame.setsubgrupoactivofijoSessionBean(this.subgrupoactivofijoSessionBean);

				//this.gridBagConstraintsDetalleGrupoActivoFijo = new GridBagConstraints();
				//this.gridBagConstraintsDetalleGrupoActivoFijo.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsDetalleGrupoActivoFijo.gridx = 0;
				//this.jContentPaneDetalleDetalleGrupoActivoFijo.add(this.subgrupoactivofijoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsDetalleGrupoActivoFijo);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesDetalleGrupoActivoFijo.add("Sub Grupo Activo Fijos",this.subgrupoactivofijoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesDetalleGrupoActivoFijo.setComponentAt(iIndexTab,this.subgrupoactivofijoBeanSwingJInternalFrame.getContentPane());
				}

				//SubGrupoActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.subgrupoactivofijoSessionBean.setEsGuardarRelacionado(false);
				this.subgrupoactivofijoBeanSwingJInternalFrame=null;//new SubGrupoActivoFijoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteSubGrupoActivoFijo) {
					this.jTabbedPaneRelacionesDetalleGrupoActivoFijo.add("Sub Grupo Activo Fijos",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarDetalleActivoFijoBeanSwingJInternalFrame(List<DetalleGrupoActivoFijo> detallegrupoactivofijos,DetalleGrupoActivoFijo detallegrupoactivofijo,DetalleActivoFijoBeanSwingJInternalFrame detalleactivofijoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//detalleactivofijoBeanSwingJInternalFrame=new DetalleActivoFijoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					detalleactivofijoBeanSwingJInternalFrame.getDetalleActivoFijoLogic().setConnexion(this.detallegrupoactivofijoLogic.getConnexion());

					detalleactivofijoBeanSwingJInternalFrame.setdetallegrupoactivofijosForeignKey(detallegrupoactivofijos);
					detalleactivofijoBeanSwingJInternalFrame.setdetallegrupoactivofijoForeignKey(detallegrupoactivofijo);
					detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoSessionBean.setisBusquedaDesdeForeignKeySesionDetalleGrupoActivoFijo(true);
					detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoSessionBean.setlidDetalleGrupoActivoFijoActual(detallegrupoactivofijo.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					detalleactivofijoBeanSwingJInternalFrame.cargarCombosForeignKeyDetalleActivoFijo(detalleactivofijoBeanSwingJInternalFrame.isCargarCombosDependencia);
					detalleactivofijoBeanSwingJInternalFrame.setVisibilidadBusquedasParaDetalleGrupoActivoFijo(true);
					detalleactivofijoBeanSwingJInternalFrame.setid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijo(detallegrupoactivofijo.getId());

					if(!this.conCargarFormDetalle) {
						detalleactivofijoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					detalleactivofijoBeanSwingJInternalFrame.setSelectedItemCombosFrameDetalleGrupoActivoFijoForeignKey(detallegrupoactivofijo,1,false,true,true);
					detalleactivofijoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					detalleactivofijoBeanSwingJInternalFrame.procesarBusqueda("FK_IdDetalleGrupoActivoFijo");
					detalleactivofijoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdDetalleGrupoActivoFijo");
					detalleactivofijoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleActivoFijo(true);
					detalleactivofijoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDetalleActivoFijo("n",detalleactivofijoBeanSwingJInternalFrame.isGuardarCambiosEnLote, detalleactivofijoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					detalleactivofijoBeanSwingJInternalFrame.setAutoscrolls(true);
					detalleactivofijoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						detalleactivofijoBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleActivoFijo("relacionado");
					} else {
						detalleactivofijoBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleActivoFijo("no_relacionado");
					}

					detalleactivofijoBeanSwingJInternalFrame.getjButtonRecargarInformacionDetalleActivoFijo().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarCuentaContaDetaGrupoActiBeanSwingJInternalFrame(List<DetalleGrupoActivoFijo> detallegrupoactivofijos,DetalleGrupoActivoFijo detallegrupoactivofijo,CuentaContaDetaGrupoActiBeanSwingJInternalFrame cuentacontadetagrupoactiBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//cuentacontadetagrupoactiBeanSwingJInternalFrame=new CuentaContaDetaGrupoActiBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					cuentacontadetagrupoactiBeanSwingJInternalFrame.getCuentaContaDetaGrupoActiLogic().setConnexion(this.detallegrupoactivofijoLogic.getConnexion());

					cuentacontadetagrupoactiBeanSwingJInternalFrame.setdetallegrupoactivofijosForeignKey(detallegrupoactivofijos);
					cuentacontadetagrupoactiBeanSwingJInternalFrame.setdetallegrupoactivofijoForeignKey(detallegrupoactivofijo);
					cuentacontadetagrupoactiBeanSwingJInternalFrame.cuentacontadetagrupoactiSessionBean.setisBusquedaDesdeForeignKeySesionDetalleGrupoActivoFijo(true);
					cuentacontadetagrupoactiBeanSwingJInternalFrame.cuentacontadetagrupoactiSessionBean.setlidDetalleGrupoActivoFijoActual(detallegrupoactivofijo.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					cuentacontadetagrupoactiBeanSwingJInternalFrame.cargarCombosForeignKeyCuentaContaDetaGrupoActi(cuentacontadetagrupoactiBeanSwingJInternalFrame.isCargarCombosDependencia);
					cuentacontadetagrupoactiBeanSwingJInternalFrame.setVisibilidadBusquedasParaDetalleGrupoActivoFijo(true);
					cuentacontadetagrupoactiBeanSwingJInternalFrame.setid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijo(detallegrupoactivofijo.getId());

					if(!this.conCargarFormDetalle) {
						cuentacontadetagrupoactiBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					cuentacontadetagrupoactiBeanSwingJInternalFrame.setSelectedItemCombosFrameDetalleGrupoActivoFijoForeignKey(detallegrupoactivofijo,1,false,true,true);
					cuentacontadetagrupoactiBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					cuentacontadetagrupoactiBeanSwingJInternalFrame.procesarBusqueda("FK_IdDetalleGrupoActivoFijo");
					cuentacontadetagrupoactiBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdDetalleGrupoActivoFijo");
					cuentacontadetagrupoactiBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaContaDetaGrupoActi(true);
					cuentacontadetagrupoactiBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesCuentaContaDetaGrupoActi("n",cuentacontadetagrupoactiBeanSwingJInternalFrame.isGuardarCambiosEnLote, cuentacontadetagrupoactiBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					cuentacontadetagrupoactiBeanSwingJInternalFrame.setAutoscrolls(true);
					cuentacontadetagrupoactiBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						cuentacontadetagrupoactiBeanSwingJInternalFrame.actualizarEstadoPanelsCuentaContaDetaGrupoActi("relacionado");
					} else {
						cuentacontadetagrupoactiBeanSwingJInternalFrame.actualizarEstadoPanelsCuentaContaDetaGrupoActi("no_relacionado");
					}

					cuentacontadetagrupoactiBeanSwingJInternalFrame.getjButtonRecargarInformacionCuentaContaDetaGrupoActi().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarSubGrupoActivoFijoBeanSwingJInternalFrame(List<DetalleGrupoActivoFijo> detallegrupoactivofijos,DetalleGrupoActivoFijo detallegrupoactivofijo,SubGrupoActivoFijoBeanSwingJInternalFrame subgrupoactivofijoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//subgrupoactivofijoBeanSwingJInternalFrame=new SubGrupoActivoFijoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					subgrupoactivofijoBeanSwingJInternalFrame.getSubGrupoActivoFijoLogic().setConnexion(this.detallegrupoactivofijoLogic.getConnexion());

					subgrupoactivofijoBeanSwingJInternalFrame.setdetallegrupoactivofijosForeignKey(detallegrupoactivofijos);
					subgrupoactivofijoBeanSwingJInternalFrame.setdetallegrupoactivofijoForeignKey(detallegrupoactivofijo);
					subgrupoactivofijoBeanSwingJInternalFrame.subgrupoactivofijoSessionBean.setisBusquedaDesdeForeignKeySesionDetalleGrupoActivoFijo(true);
					subgrupoactivofijoBeanSwingJInternalFrame.subgrupoactivofijoSessionBean.setlidDetalleGrupoActivoFijoActual(detallegrupoactivofijo.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					subgrupoactivofijoBeanSwingJInternalFrame.cargarCombosForeignKeySubGrupoActivoFijo(subgrupoactivofijoBeanSwingJInternalFrame.isCargarCombosDependencia);
					subgrupoactivofijoBeanSwingJInternalFrame.setVisibilidadBusquedasParaDetalleGrupoActivoFijo(true);
					subgrupoactivofijoBeanSwingJInternalFrame.setid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijo(detallegrupoactivofijo.getId());

					if(!this.conCargarFormDetalle) {
						subgrupoactivofijoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					subgrupoactivofijoBeanSwingJInternalFrame.setSelectedItemCombosFrameDetalleGrupoActivoFijoForeignKey(detallegrupoactivofijo,1,false,true,true);
					subgrupoactivofijoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					subgrupoactivofijoBeanSwingJInternalFrame.procesarBusqueda("FK_IdDetalleGrupoActivoFijo");
					subgrupoactivofijoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdDetalleGrupoActivoFijo");
					subgrupoactivofijoBeanSwingJInternalFrame.inicializarActualizarBindingTablaSubGrupoActivoFijo(true);
					subgrupoactivofijoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesSubGrupoActivoFijo("n",subgrupoactivofijoBeanSwingJInternalFrame.isGuardarCambiosEnLote, subgrupoactivofijoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					subgrupoactivofijoBeanSwingJInternalFrame.setAutoscrolls(true);
					subgrupoactivofijoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						subgrupoactivofijoBeanSwingJInternalFrame.actualizarEstadoPanelsSubGrupoActivoFijo("relacionado");
					} else {
						subgrupoactivofijoBeanSwingJInternalFrame.actualizarEstadoPanelsSubGrupoActivoFijo("no_relacionado");
					}

					subgrupoactivofijoBeanSwingJInternalFrame.getjButtonRecargarInformacionSubGrupoActivoFijo().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarGastoDepreciacionBeanSwingJInternalFrame(List<DetalleGrupoActivoFijo> detallegrupoactivofijos,DetalleGrupoActivoFijo detallegrupoactivofijo,GastoDepreciacionBeanSwingJInternalFrame gastodepreciacionBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//gastodepreciacionBeanSwingJInternalFrame=new GastoDepreciacionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					gastodepreciacionBeanSwingJInternalFrame.getGastoDepreciacionLogic().setConnexion(this.detallegrupoactivofijoLogic.getConnexion());

					gastodepreciacionBeanSwingJInternalFrame.setdetallegrupoactivofijosForeignKey(detallegrupoactivofijos);
					gastodepreciacionBeanSwingJInternalFrame.setdetallegrupoactivofijoForeignKey(detallegrupoactivofijo);
					gastodepreciacionBeanSwingJInternalFrame.gastodepreciacionSessionBean.setisBusquedaDesdeForeignKeySesionDetalleGrupoActivoFijo(true);
					gastodepreciacionBeanSwingJInternalFrame.gastodepreciacionSessionBean.setlidDetalleGrupoActivoFijoActual(detallegrupoactivofijo.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					gastodepreciacionBeanSwingJInternalFrame.cargarCombosForeignKeyGastoDepreciacion(gastodepreciacionBeanSwingJInternalFrame.isCargarCombosDependencia);
					gastodepreciacionBeanSwingJInternalFrame.setVisibilidadBusquedasParaDetalleGrupoActivoFijo(true);
					gastodepreciacionBeanSwingJInternalFrame.setid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijo(detallegrupoactivofijo.getId());

					if(!this.conCargarFormDetalle) {
						gastodepreciacionBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					gastodepreciacionBeanSwingJInternalFrame.setSelectedItemCombosFrameDetalleGrupoActivoFijoForeignKey(detallegrupoactivofijo,1,false,true,true);
					gastodepreciacionBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					gastodepreciacionBeanSwingJInternalFrame.procesarBusqueda("FK_IdDetalleGrupoActivoFijo");
					gastodepreciacionBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdDetalleGrupoActivoFijo");
					gastodepreciacionBeanSwingJInternalFrame.inicializarActualizarBindingTablaGastoDepreciacion(true);
					gastodepreciacionBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesGastoDepreciacion("n",gastodepreciacionBeanSwingJInternalFrame.isGuardarCambiosEnLote, gastodepreciacionBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					gastodepreciacionBeanSwingJInternalFrame.setAutoscrolls(true);
					gastodepreciacionBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						gastodepreciacionBeanSwingJInternalFrame.actualizarEstadoPanelsGastoDepreciacion("relacionado");
					} else {
						gastodepreciacionBeanSwingJInternalFrame.actualizarEstadoPanelsGastoDepreciacion("no_relacionado");
					}

					gastodepreciacionBeanSwingJInternalFrame.getjButtonRecargarInformacionGastoDepreciacion().setVisible(false);

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
