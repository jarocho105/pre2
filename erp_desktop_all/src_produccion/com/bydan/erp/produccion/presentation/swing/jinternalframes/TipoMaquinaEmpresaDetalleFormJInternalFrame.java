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
package com.bydan.erp.produccion.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.produccion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.produccion.business.entity.*;
import com.bydan.erp.produccion.util.TipoMaquinaEmpresaConstantesFunciones;

import com.bydan.erp.produccion.business.logic.*;
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
public class TipoMaquinaEmpresaDetalleFormJInternalFrame extends TipoMaquinaEmpresaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoMaquinaEmpresa;
	
	protected JMenuBar jmenuBarDetalleTipoMaquinaEmpresa;
	
	protected JMenu jmenuDetalleTipoMaquinaEmpresa;
	protected JMenu jmenuDetalleArchivoTipoMaquinaEmpresa;
	protected JMenu jmenuDetalleAccionesTipoMaquinaEmpresa;
	protected JMenu jmenuDetalleDatosTipoMaquinaEmpresa;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoMaquinaEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoMaquinaEmpresa;	
	protected GridBagConstraints gridBagConstraintsTipoMaquinaEmpresa;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoMaquinaEmpresaBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoMaquinaEmpresa;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontabledebitoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontabledebito="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablecreditoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablecredito="";
	
	public TipoMaquinaEmpresaSessionBean tipomaquinaempresaSessionBean;
	
	

	public ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrame productoordendetaprodumaquinaBeanSwingJInternalFrame=null;
	public ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrame productoordendetaprodumaquinaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteProductoOrdenDetaProduMaquina=false;
	public ProductoOrdenDetaProduMaquinaSessionBean productoordendetaprodumaquinaSessionBean;

	public ProductoProduMaquinaBeanSwingJInternalFrame productoprodumaquinaBeanSwingJInternalFrame=null;
	public ProductoProduMaquinaBeanSwingJInternalFrame productoprodumaquinaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteProductoProduMaquina=false;
	public ProductoProduMaquinaSessionBean productoprodumaquinaSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public CuentaContableSessionBean cuentacontabledebitoSessionBean;
	public CuentaContableSessionBean cuentacontablecreditoSessionBean;	
	
	public TipoMaquinaEmpresaLogic tipomaquinaempresaLogic;
	
	public JScrollPane jScrollPanelDatosTipoMaquinaEmpresa;
	public JScrollPane jScrollPanelDatosEdicionTipoMaquinaEmpresa;
	public JScrollPane jScrollPanelDatosGeneralTipoMaquinaEmpresa;
	
	protected JPanel jPanelCamposTipoMaquinaEmpresa;    
	protected JPanel jPanelCamposOcultosTipoMaquinaEmpresa;    	
	protected JPanel jPanelAccionesTipoMaquinaEmpresa;
	protected JPanel jPanelAccionesFormularioTipoMaquinaEmpresa;
    
	
	
	protected Integer iXPanelCamposTipoMaquinaEmpresa=0;
	protected Integer iYPanelCamposTipoMaquinaEmpresa=0;
	
	protected Integer iXPanelCamposOcultosTipoMaquinaEmpresa=0;
	protected Integer iYPanelCamposOcultosTipoMaquinaEmpresa=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoMaquinaEmpresa;
	public JButton jButtonModificarTipoMaquinaEmpresa;
	public JButton jButtonActualizarTipoMaquinaEmpresa;
    public JButton jButtonEliminarTipoMaquinaEmpresa;
	public JButton jButtonCancelarTipoMaquinaEmpresa;
    public JButton jButtonGuardarCambiosTipoMaquinaEmpresa;
	public JButton jButtonGuardarCambiosTablaTipoMaquinaEmpresa;
	protected JButton jButtonCerrarTipoMaquinaEmpresa;
	
	
	protected JButton jButtonProcesarInformacionTipoMaquinaEmpresa;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoMaquinaEmpresa;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoMaquinaEmpresa;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoMaquinaEmpresa;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoMaquinaEmpresa;
	protected JButton jButtonModificarToolBarTipoMaquinaEmpresa;
	protected JButton jButtonActualizarToolBarTipoMaquinaEmpresa;
    protected JButton jButtonEliminarToolBarTipoMaquinaEmpresa;
	protected JButton jButtonCancelarToolBarTipoMaquinaEmpresa;
    protected JButton jButtonGuardarCambiosToolBarTipoMaquinaEmpresa;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoMaquinaEmpresa;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoMaquinaEmpresa;
	protected JButton jButtonCerrarToolBarTipoMaquinaEmpresa;
	
	protected JButton jButtonProcesarInformacionToolBarTipoMaquinaEmpresa;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoMaquinaEmpresa;
	protected JMenuItem jMenuItemModificarTipoMaquinaEmpresa;
	protected JMenuItem jMenuItemActualizarTipoMaquinaEmpresa;
    protected JMenuItem jMenuItemEliminarTipoMaquinaEmpresa;
	protected JMenuItem jMenuItemCancelarTipoMaquinaEmpresa;
    protected JMenuItem jMenuItemGuardarCambiosTipoMaquinaEmpresa;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoMaquinaEmpresa;
	protected JMenuItem jMenuItemCerrarTipoMaquinaEmpresa;
	protected JMenuItem jMenuItemDetalleCerrarTipoMaquinaEmpresa;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoMaquinaEmpresa;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoMaquinaEmpresa;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoMaquinaEmpresa;
	protected JMenuItem jMenuItemMostrarOcultarTipoMaquinaEmpresa;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoMaquinaEmpresa;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoMaquinaEmpresa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoMaquinaEmpresa;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoMaquinaEmpresa;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoMaquinaEmpresa;
	public JLabel jLabelIdTipoMaquinaEmpresa;
	public JLabel jLabelidTipoMaquinaEmpresa;
	public JButton jButtonidTipoMaquinaEmpresaBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoMaquinaEmpresa;
	public JLabel jLabelcodigoTipoMaquinaEmpresa;
	public JTextField jTextFieldcodigoTipoMaquinaEmpresa;
	public JButton jButtoncodigoTipoMaquinaEmpresaBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoMaquinaEmpresa;
	public JLabel jLabelnombreTipoMaquinaEmpresa;
	public JTextArea jTextAreanombreTipoMaquinaEmpresa;
	public JScrollPane jscrollPanenombreTipoMaquinaEmpresa;
	public JButton jButtonnombreTipoMaquinaEmpresaBusqueda= new JButtonMe();

	public JPanel jPanelmarcaTipoMaquinaEmpresa;
	public JLabel jLabelmarcaTipoMaquinaEmpresa;
	public JTextArea jTextAreamarcaTipoMaquinaEmpresa;
	public JScrollPane jscrollPanemarcaTipoMaquinaEmpresa;
	public JButton jButtonmarcaTipoMaquinaEmpresaBusqueda= new JButtonMe();

	public JPanel jPanelmodeloTipoMaquinaEmpresa;
	public JLabel jLabelmodeloTipoMaquinaEmpresa;
	public JTextArea jTextAreamodeloTipoMaquinaEmpresa;
	public JScrollPane jscrollPanemodeloTipoMaquinaEmpresa;
	public JButton jButtonmodeloTipoMaquinaEmpresaBusqueda= new JButtonMe();

	public JPanel jPanelcostoTipoMaquinaEmpresa;
	public JLabel jLabelcostoTipoMaquinaEmpresa;
	public JTextField jTextFieldcostoTipoMaquinaEmpresa;
	public JButton jButtoncostoTipoMaquinaEmpresaBusqueda= new JButtonMe();

	public JPanel jPanelesta_activoTipoMaquinaEmpresa;
	public JLabel jLabelesta_activoTipoMaquinaEmpresa;
	public JCheckBox jCheckBoxesta_activoTipoMaquinaEmpresa;
	public JButton jButtonesta_activoTipoMaquinaEmpresaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoMaquinaEmpresa;
	public JLabel jLabelid_empresaTipoMaquinaEmpresa;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoMaquinaEmpresa;
	public JButton jButtonid_empresaTipoMaquinaEmpresa= new JButtonMe();
	public JButton jButtonid_empresaTipoMaquinaEmpresaUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoMaquinaEmpresaBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalTipoMaquinaEmpresa;
	public JLabel jLabelid_sucursalTipoMaquinaEmpresa;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalTipoMaquinaEmpresa;
	public JButton jButtonid_sucursalTipoMaquinaEmpresa= new JButtonMe();
	public JButton jButtonid_sucursalTipoMaquinaEmpresaUpdate= new JButtonMe();
	public JButton jButtonid_sucursalTipoMaquinaEmpresaBusqueda= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_debitoTipoMaquinaEmpresa;
	public JLabel jLabelid_cuenta_contable_debitoTipoMaquinaEmpresa;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_debitoTipoMaquinaEmpresa;
	public JButton jButtonid_cuenta_contable_debitoTipoMaquinaEmpresa= new JButtonMe();
	public JButton jButtonid_cuenta_contable_debitoTipoMaquinaEmpresaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_debitoTipoMaquinaEmpresaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_debitoTipoMaquinaEmpresaArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_creditoTipoMaquinaEmpresa;
	public JLabel jLabelid_cuenta_contable_creditoTipoMaquinaEmpresa;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_creditoTipoMaquinaEmpresa;
	public JButton jButtonid_cuenta_contable_creditoTipoMaquinaEmpresa= new JButtonMe();
	public JButton jButtonid_cuenta_contable_creditoTipoMaquinaEmpresaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_creditoTipoMaquinaEmpresaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_creditoTipoMaquinaEmpresaArbol= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoMaquinaEmpresa;
	
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
	public int iHeightFormulario=858;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TipoMaquinaEmpresaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoMaquinaEmpresa=new JPanel();
				this.jPanelAccionesFormularioTipoMaquinaEmpresa=new JPanel();
				this.jmenuBarDetalleTipoMaquinaEmpresa=new JMenuBar();
				this.jTtoolBarDetalleTipoMaquinaEmpresa=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoMaquinaEmpresaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoMaquinaEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoMaquinaEmpresaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoMaquinaEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoMaquinaEmpresaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoMaquinaEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoMaquinaEmpresaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoMaquinaEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoMaquinaEmpresaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoMaquinaEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoMaquinaEmpresa() {
		return this.jButtonActualizarToolBarTipoMaquinaEmpresa;
	}
	
	public JButton getjButtonEliminarToolBarTipoMaquinaEmpresa() {
		return this.jButtonEliminarToolBarTipoMaquinaEmpresa;
	}
	
	public JButton getjButtonCancelarToolBarTipoMaquinaEmpresa() {
		return this.jButtonCancelarToolBarTipoMaquinaEmpresa;
	}		
	
	public JButton getjButtonProcesarInformacionTipoMaquinaEmpresa() {
		return this.jButtonProcesarInformacionTipoMaquinaEmpresa;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoMaquinaEmpresa)	{
		this.jButtonProcesarInformacionTipoMaquinaEmpresa = jButtonProcesarInformacionTipoMaquinaEmpresa;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoMaquinaEmpresa() {
		return this.jComboBoxTiposAccionesTipoMaquinaEmpresa;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoMaquinaEmpresa(
			JComboBox jComboBoxTiposRelacionesTipoMaquinaEmpresa) {
		this.jComboBoxTiposRelacionesTipoMaquinaEmpresa = jComboBoxTiposRelacionesTipoMaquinaEmpresa;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoMaquinaEmpresa(
			JComboBox jComboBoxTiposAccionesTipoMaquinaEmpresa) {
		this.jComboBoxTiposAccionesTipoMaquinaEmpresa = jComboBoxTiposAccionesTipoMaquinaEmpresa;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoMaquinaEmpresa() {
		return this.jComboBoxTiposAccionesFormularioTipoMaquinaEmpresa;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoMaquinaEmpresa(
			JComboBox jComboBoxTiposAccionesFormularioTipoMaquinaEmpresa) {
		this.jComboBoxTiposAccionesFormularioTipoMaquinaEmpresa = jComboBoxTiposAccionesFormularioTipoMaquinaEmpresa;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipomaquinaempresaSessionBean=new TipoMaquinaEmpresaSessionBean();
		
		this.tipomaquinaempresaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipomaquinaempresaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.productoordendetaprodumaquinaSessionBean=new ProductoOrdenDetaProduMaquinaSessionBean();
		//this.productoprodumaquinaSessionBean=new ProductoProduMaquinaSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoMaquinaEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoMaquinaEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoMaquinaEmpresaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Maquina Empresa MANTENIMIENTO"));
		
		
		if(iWidth > 1050) {
			iWidth=1050;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoMaquinaEmpresaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoMaquinaEmpresa= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoMaquinaEmpresa=new JButtonMe();
				this.jButtonModificarToolBarTipoMaquinaEmpresa=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoMaquinaEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoMaquinaEmpresa,this.jTtoolBarDetalleTipoMaquinaEmpresa,
							"actualizar","actualizar","Actualizar"+" "+TipoMaquinaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoMaquinaEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoMaquinaEmpresa,this.jTtoolBarDetalleTipoMaquinaEmpresa,
							"eliminar","eliminar","Eliminar"+" "+TipoMaquinaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoMaquinaEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoMaquinaEmpresa,this.jTtoolBarDetalleTipoMaquinaEmpresa,
							"cancelar","cancelar","Cancelar"+" "+TipoMaquinaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoMaquinaEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoMaquinaEmpresa,this.jTtoolBarDetalleTipoMaquinaEmpresa,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoMaquinaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoMaquinaEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoMaquinaEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoMaquinaEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoMaquinaEmpresa=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoMaquinaEmpresa=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoMaquinaEmpresa=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoMaquinaEmpresa=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoMaquinaEmpresa=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoMaquinaEmpresa= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoMaquinaEmpresa.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoMaquinaEmpresa,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoMaquinaEmpresa= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoMaquinaEmpresa.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoMaquinaEmpresa,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoMaquinaEmpresa= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoMaquinaEmpresa.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoMaquinaEmpresa,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoMaquinaEmpresa= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoMaquinaEmpresa.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoMaquinaEmpresa,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoMaquinaEmpresa= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoMaquinaEmpresa.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoMaquinaEmpresa,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoMaquinaEmpresa= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoMaquinaEmpresa.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoMaquinaEmpresa,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoMaquinaEmpresa= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoMaquinaEmpresa.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoMaquinaEmpresa,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoMaquinaEmpresa= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoMaquinaEmpresa.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoMaquinaEmpresa,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoMaquinaEmpresa= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoMaquinaEmpresa.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoMaquinaEmpresa,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoMaquinaEmpresa= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoMaquinaEmpresa.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoMaquinaEmpresa,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoMaquinaEmpresa.add(this.jMenuItemDetalleCerrarTipoMaquinaEmpresa);
		
		this.jmenuDetalleAccionesTipoMaquinaEmpresa.add(this.jMenuItemActualizarTipoMaquinaEmpresa);
		this.jmenuDetalleAccionesTipoMaquinaEmpresa.add(this.jMenuItemEliminarTipoMaquinaEmpresa);
		this.jmenuDetalleAccionesTipoMaquinaEmpresa.add(this.jMenuItemCancelarTipoMaquinaEmpresa);		
		
		//this.jmenuDetalleDatosTipoMaquinaEmpresa.add(this.jMenuItemDetalleAbrirOrderByTipoMaquinaEmpresa);				
		this.jmenuDetalleDatosTipoMaquinaEmpresa.add(this.jMenuItemDetalleMostarOcultarTipoMaquinaEmpresa);				
				
		//this.jmenuDetalleAccionesTipoMaquinaEmpresa.add(this.jMenuItemGuardarCambiosTipoMaquinaEmpresa);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoMaquinaEmpresa.add(this.jmenuDetalleArchivoTipoMaquinaEmpresa);		
		this.jmenuBarDetalleTipoMaquinaEmpresa.add(this.jmenuDetalleAccionesTipoMaquinaEmpresa);		
		this.jmenuBarDetalleTipoMaquinaEmpresa.add(this.jmenuDetalleDatosTipoMaquinaEmpresa);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoMaquinaEmpresa.add(this.jmenuDetalleTipoMaquinaEmpresa);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoMaquinaEmpresa);				
	}
	
	
	public void inicializarElementosCamposTipoMaquinaEmpresa() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoMaquinaEmpresa = new JLabelMe();
		jLabelIdTipoMaquinaEmpresa.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoMaquinaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoMaquinaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoMaquinaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoMaquinaEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoMaquinaEmpresa = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoMaquinaEmpresa.setToolTipText(TipoMaquinaEmpresaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoMaquinaEmpresa= new GridBagLayout();

		this.jPanelidTipoMaquinaEmpresa.setLayout(this.gridaBagLayoutTipoMaquinaEmpresa);

		jLabelidTipoMaquinaEmpresa = new JLabel();
		jLabelidTipoMaquinaEmpresa.setText("Id");

		jLabelidTipoMaquinaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoMaquinaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoMaquinaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoMaquinaEmpresa = new JLabelMe();
		this.jLabelcodigoTipoMaquinaEmpresa.setText(""+TipoMaquinaEmpresaConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoMaquinaEmpresa.setToolTipText("Codigo");
		this.jLabelcodigoTipoMaquinaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoMaquinaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoMaquinaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoMaquinaEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoMaquinaEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoMaquinaEmpresa.setToolTipText(TipoMaquinaEmpresaConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoMaquinaEmpresa = new GridBagLayout();
		this.jPanelcodigoTipoMaquinaEmpresa.setLayout(this.gridaBagLayoutTipoMaquinaEmpresa);


		jTextFieldcodigoTipoMaquinaEmpresa= new JTextFieldMe();

		jTextFieldcodigoTipoMaquinaEmpresa.setEnabled(false);
		jTextFieldcodigoTipoMaquinaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoMaquinaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoMaquinaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoMaquinaEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoMaquinaEmpresaBusqueda= new JButtonMe();
		this.jButtoncodigoTipoMaquinaEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoMaquinaEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoMaquinaEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoMaquinaEmpresaBusqueda.setText("U");
		this.jButtoncodigoTipoMaquinaEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoMaquinaEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoMaquinaEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoMaquinaEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoMaquinaEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoMaquinaEmpresaBusqueda"));

		if(this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoMaquinaEmpresaBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoMaquinaEmpresa = new JLabelMe();
		this.jLabelnombreTipoMaquinaEmpresa.setText(""+TipoMaquinaEmpresaConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoMaquinaEmpresa.setToolTipText("Nombre");
		this.jLabelnombreTipoMaquinaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoMaquinaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoMaquinaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoMaquinaEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoMaquinaEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoMaquinaEmpresa.setToolTipText(TipoMaquinaEmpresaConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoMaquinaEmpresa = new GridBagLayout();
		this.jPanelnombreTipoMaquinaEmpresa.setLayout(this.gridaBagLayoutTipoMaquinaEmpresa);


		jTextAreanombreTipoMaquinaEmpresa= new JTextAreaMe();
		jTextAreanombreTipoMaquinaEmpresa.setEnabled(false);
		jTextAreanombreTipoMaquinaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoMaquinaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoMaquinaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoMaquinaEmpresa.setLineWrap(true);
		jTextAreanombreTipoMaquinaEmpresa.setWrapStyleWord(true);
		jTextAreanombreTipoMaquinaEmpresa.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoMaquinaEmpresa.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoMaquinaEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoMaquinaEmpresa = new JScrollPane(jTextAreanombreTipoMaquinaEmpresa);
		jscrollPanenombreTipoMaquinaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoMaquinaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoMaquinaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoMaquinaEmpresaBusqueda= new JButtonMe();
		this.jButtonnombreTipoMaquinaEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoMaquinaEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoMaquinaEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoMaquinaEmpresaBusqueda.setText("U");
		this.jButtonnombreTipoMaquinaEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoMaquinaEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoMaquinaEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoMaquinaEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoMaquinaEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoMaquinaEmpresaBusqueda"));

		if(this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoMaquinaEmpresaBusqueda.setVisible(false);		}


					
		this.jLabelmarcaTipoMaquinaEmpresa = new JLabelMe();
		this.jLabelmarcaTipoMaquinaEmpresa.setText(""+TipoMaquinaEmpresaConstantesFunciones.LABEL_MARCA+" : *");
		this.jLabelmarcaTipoMaquinaEmpresa.setToolTipText("Marca");
		this.jLabelmarcaTipoMaquinaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmarcaTipoMaquinaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmarcaTipoMaquinaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelmarcaTipoMaquinaEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmarcaTipoMaquinaEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmarcaTipoMaquinaEmpresa.setToolTipText(TipoMaquinaEmpresaConstantesFunciones.LABEL_MARCA);
		this.gridaBagLayoutTipoMaquinaEmpresa = new GridBagLayout();
		this.jPanelmarcaTipoMaquinaEmpresa.setLayout(this.gridaBagLayoutTipoMaquinaEmpresa);


		jTextAreamarcaTipoMaquinaEmpresa= new JTextAreaMe();
		jTextAreamarcaTipoMaquinaEmpresa.setEnabled(false);
		jTextAreamarcaTipoMaquinaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreamarcaTipoMaquinaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreamarcaTipoMaquinaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreamarcaTipoMaquinaEmpresa.setLineWrap(true);
		jTextAreamarcaTipoMaquinaEmpresa.setWrapStyleWord(true);
		jTextAreamarcaTipoMaquinaEmpresa.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreamarcaTipoMaquinaEmpresa.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreamarcaTipoMaquinaEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanemarcaTipoMaquinaEmpresa = new JScrollPane(jTextAreamarcaTipoMaquinaEmpresa);
		jscrollPanemarcaTipoMaquinaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanemarcaTipoMaquinaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanemarcaTipoMaquinaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonmarcaTipoMaquinaEmpresaBusqueda= new JButtonMe();
		this.jButtonmarcaTipoMaquinaEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmarcaTipoMaquinaEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmarcaTipoMaquinaEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmarcaTipoMaquinaEmpresaBusqueda.setText("U");
		this.jButtonmarcaTipoMaquinaEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmarcaTipoMaquinaEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmarcaTipoMaquinaEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreamarcaTipoMaquinaEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreamarcaTipoMaquinaEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"marcaTipoMaquinaEmpresaBusqueda"));

		if(this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmarcaTipoMaquinaEmpresaBusqueda.setVisible(false);		}


					
		this.jLabelmodeloTipoMaquinaEmpresa = new JLabelMe();
		this.jLabelmodeloTipoMaquinaEmpresa.setText(""+TipoMaquinaEmpresaConstantesFunciones.LABEL_MODELO+" : *");
		this.jLabelmodeloTipoMaquinaEmpresa.setToolTipText("Modelo");
		this.jLabelmodeloTipoMaquinaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmodeloTipoMaquinaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmodeloTipoMaquinaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelmodeloTipoMaquinaEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmodeloTipoMaquinaEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmodeloTipoMaquinaEmpresa.setToolTipText(TipoMaquinaEmpresaConstantesFunciones.LABEL_MODELO);
		this.gridaBagLayoutTipoMaquinaEmpresa = new GridBagLayout();
		this.jPanelmodeloTipoMaquinaEmpresa.setLayout(this.gridaBagLayoutTipoMaquinaEmpresa);


		jTextAreamodeloTipoMaquinaEmpresa= new JTextAreaMe();
		jTextAreamodeloTipoMaquinaEmpresa.setEnabled(false);
		jTextAreamodeloTipoMaquinaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreamodeloTipoMaquinaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreamodeloTipoMaquinaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreamodeloTipoMaquinaEmpresa.setLineWrap(true);
		jTextAreamodeloTipoMaquinaEmpresa.setWrapStyleWord(true);
		jTextAreamodeloTipoMaquinaEmpresa.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreamodeloTipoMaquinaEmpresa.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreamodeloTipoMaquinaEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanemodeloTipoMaquinaEmpresa = new JScrollPane(jTextAreamodeloTipoMaquinaEmpresa);
		jscrollPanemodeloTipoMaquinaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanemodeloTipoMaquinaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanemodeloTipoMaquinaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonmodeloTipoMaquinaEmpresaBusqueda= new JButtonMe();
		this.jButtonmodeloTipoMaquinaEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmodeloTipoMaquinaEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmodeloTipoMaquinaEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmodeloTipoMaquinaEmpresaBusqueda.setText("U");
		this.jButtonmodeloTipoMaquinaEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmodeloTipoMaquinaEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmodeloTipoMaquinaEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreamodeloTipoMaquinaEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreamodeloTipoMaquinaEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"modeloTipoMaquinaEmpresaBusqueda"));

		if(this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmodeloTipoMaquinaEmpresaBusqueda.setVisible(false);		}


					
		this.jLabelcostoTipoMaquinaEmpresa = new JLabelMe();
		this.jLabelcostoTipoMaquinaEmpresa.setText(""+TipoMaquinaEmpresaConstantesFunciones.LABEL_COSTO+" : *");
		this.jLabelcostoTipoMaquinaEmpresa.setToolTipText("Costo");
		this.jLabelcostoTipoMaquinaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcostoTipoMaquinaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcostoTipoMaquinaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcostoTipoMaquinaEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcostoTipoMaquinaEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcostoTipoMaquinaEmpresa.setToolTipText(TipoMaquinaEmpresaConstantesFunciones.LABEL_COSTO);
		this.gridaBagLayoutTipoMaquinaEmpresa = new GridBagLayout();
		this.jPanelcostoTipoMaquinaEmpresa.setLayout(this.gridaBagLayoutTipoMaquinaEmpresa);


		jTextFieldcostoTipoMaquinaEmpresa= new JTextFieldMe();
		jTextFieldcostoTipoMaquinaEmpresa.setEnabled(false);
		jTextFieldcostoTipoMaquinaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcostoTipoMaquinaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcostoTipoMaquinaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcostoTipoMaquinaEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcostoTipoMaquinaEmpresa.setText("0.0");

		this.jButtoncostoTipoMaquinaEmpresaBusqueda= new JButtonMe();
		this.jButtoncostoTipoMaquinaEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncostoTipoMaquinaEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncostoTipoMaquinaEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncostoTipoMaquinaEmpresaBusqueda.setText("U");
		this.jButtoncostoTipoMaquinaEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncostoTipoMaquinaEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncostoTipoMaquinaEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcostoTipoMaquinaEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcostoTipoMaquinaEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costoTipoMaquinaEmpresaBusqueda"));

		if(this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncostoTipoMaquinaEmpresaBusqueda.setVisible(false);		}


					
		this.jLabelesta_activoTipoMaquinaEmpresa = new JLabelMe();
		this.jLabelesta_activoTipoMaquinaEmpresa.setText(""+TipoMaquinaEmpresaConstantesFunciones.LABEL_ESTAACTIVO+" : *");
		this.jLabelesta_activoTipoMaquinaEmpresa.setToolTipText("Esta Activo");
		this.jLabelesta_activoTipoMaquinaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesta_activoTipoMaquinaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesta_activoTipoMaquinaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelesta_activoTipoMaquinaEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelesta_activoTipoMaquinaEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelesta_activoTipoMaquinaEmpresa.setToolTipText(TipoMaquinaEmpresaConstantesFunciones.LABEL_ESTAACTIVO);
		this.gridaBagLayoutTipoMaquinaEmpresa = new GridBagLayout();
		this.jPanelesta_activoTipoMaquinaEmpresa.setLayout(this.gridaBagLayoutTipoMaquinaEmpresa);


		jCheckBoxesta_activoTipoMaquinaEmpresa= new JCheckBoxMe();
		jCheckBoxesta_activoTipoMaquinaEmpresa.setEnabled(false);

		jCheckBoxesta_activoTipoMaquinaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_activoTipoMaquinaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_activoTipoMaquinaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxesta_activoTipoMaquinaEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonesta_activoTipoMaquinaEmpresaBusqueda= new JButtonMe();
		this.jButtonesta_activoTipoMaquinaEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_activoTipoMaquinaEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_activoTipoMaquinaEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonesta_activoTipoMaquinaEmpresaBusqueda.setText("U");
		this.jButtonesta_activoTipoMaquinaEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonesta_activoTipoMaquinaEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonesta_activoTipoMaquinaEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxesta_activoTipoMaquinaEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxesta_activoTipoMaquinaEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"esta_activoTipoMaquinaEmpresaBusqueda"));

		if(this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonesta_activoTipoMaquinaEmpresaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoMaquinaEmpresa() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoMaquinaEmpresa = new JLabelMe();
		this.jLabelid_empresaTipoMaquinaEmpresa.setText(""+TipoMaquinaEmpresaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoMaquinaEmpresa.setToolTipText("Empresa");
		this.jLabelid_empresaTipoMaquinaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoMaquinaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoMaquinaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoMaquinaEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoMaquinaEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoMaquinaEmpresa.setToolTipText(TipoMaquinaEmpresaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoMaquinaEmpresa = new GridBagLayout();
		this.jPanelid_empresaTipoMaquinaEmpresa.setLayout(this.gridaBagLayoutTipoMaquinaEmpresa);


		jComboBoxid_empresaTipoMaquinaEmpresa= new JComboBoxMe();
		jComboBoxid_empresaTipoMaquinaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoMaquinaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoMaquinaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoMaquinaEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoMaquinaEmpresa.setEnabled(false);

		this.jButtonid_empresaTipoMaquinaEmpresa= new JButtonMe();
		this.jButtonid_empresaTipoMaquinaEmpresa.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoMaquinaEmpresa.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoMaquinaEmpresa.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoMaquinaEmpresa.setText("Buscar");
		this.jButtonid_empresaTipoMaquinaEmpresa.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoMaquinaEmpresa.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoMaquinaEmpresa,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoMaquinaEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoMaquinaEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoMaquinaEmpresa"));

		this.jButtonid_empresaTipoMaquinaEmpresaBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoMaquinaEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoMaquinaEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoMaquinaEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoMaquinaEmpresaBusqueda.setText("U");
		this.jButtonid_empresaTipoMaquinaEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoMaquinaEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoMaquinaEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoMaquinaEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoMaquinaEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoMaquinaEmpresaBusqueda"));

		if(this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoMaquinaEmpresaBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoMaquinaEmpresaUpdate= new JButtonMe();
		this.jButtonid_empresaTipoMaquinaEmpresaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoMaquinaEmpresaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoMaquinaEmpresaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoMaquinaEmpresaUpdate.setText("U");
		this.jButtonid_empresaTipoMaquinaEmpresaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoMaquinaEmpresaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoMaquinaEmpresaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoMaquinaEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoMaquinaEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoMaquinaEmpresaUpdate"));



					
		this.jLabelid_sucursalTipoMaquinaEmpresa = new JLabelMe();
		this.jLabelid_sucursalTipoMaquinaEmpresa.setText(""+TipoMaquinaEmpresaConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalTipoMaquinaEmpresa.setToolTipText("Sucursal");
		this.jLabelid_sucursalTipoMaquinaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalTipoMaquinaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalTipoMaquinaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalTipoMaquinaEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalTipoMaquinaEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalTipoMaquinaEmpresa.setToolTipText(TipoMaquinaEmpresaConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutTipoMaquinaEmpresa = new GridBagLayout();
		this.jPanelid_sucursalTipoMaquinaEmpresa.setLayout(this.gridaBagLayoutTipoMaquinaEmpresa);


		jComboBoxid_sucursalTipoMaquinaEmpresa= new JComboBoxMe();
		jComboBoxid_sucursalTipoMaquinaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalTipoMaquinaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalTipoMaquinaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalTipoMaquinaEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalTipoMaquinaEmpresa.setEnabled(false);

		this.jButtonid_sucursalTipoMaquinaEmpresa= new JButtonMe();
		this.jButtonid_sucursalTipoMaquinaEmpresa.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalTipoMaquinaEmpresa.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalTipoMaquinaEmpresa.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalTipoMaquinaEmpresa.setText("Buscar");
		this.jButtonid_sucursalTipoMaquinaEmpresa.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalTipoMaquinaEmpresa.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalTipoMaquinaEmpresa,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalTipoMaquinaEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalTipoMaquinaEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalTipoMaquinaEmpresa"));

		this.jButtonid_sucursalTipoMaquinaEmpresaBusqueda= new JButtonMe();
		this.jButtonid_sucursalTipoMaquinaEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalTipoMaquinaEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalTipoMaquinaEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalTipoMaquinaEmpresaBusqueda.setText("U");
		this.jButtonid_sucursalTipoMaquinaEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalTipoMaquinaEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalTipoMaquinaEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalTipoMaquinaEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalTipoMaquinaEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalTipoMaquinaEmpresaBusqueda"));

		if(this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalTipoMaquinaEmpresaBusqueda.setVisible(false);		}

		this.jButtonid_sucursalTipoMaquinaEmpresaUpdate= new JButtonMe();
		this.jButtonid_sucursalTipoMaquinaEmpresaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalTipoMaquinaEmpresaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalTipoMaquinaEmpresaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalTipoMaquinaEmpresaUpdate.setText("U");
		this.jButtonid_sucursalTipoMaquinaEmpresaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalTipoMaquinaEmpresaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalTipoMaquinaEmpresaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalTipoMaquinaEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalTipoMaquinaEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalTipoMaquinaEmpresaUpdate"));



					
		this.jLabelid_cuenta_contable_debitoTipoMaquinaEmpresa = new JLabelMe();
		this.jLabelid_cuenta_contable_debitoTipoMaquinaEmpresa.setText(""+TipoMaquinaEmpresaConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO+" : *");
		this.jLabelid_cuenta_contable_debitoTipoMaquinaEmpresa.setToolTipText("Cuenta Contable Debito");
		this.jLabelid_cuenta_contable_debitoTipoMaquinaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_debitoTipoMaquinaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_debitoTipoMaquinaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_debitoTipoMaquinaEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_debitoTipoMaquinaEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_debitoTipoMaquinaEmpresa.setToolTipText(TipoMaquinaEmpresaConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO);
		this.gridaBagLayoutTipoMaquinaEmpresa = new GridBagLayout();
		this.jPanelid_cuenta_contable_debitoTipoMaquinaEmpresa.setLayout(this.gridaBagLayoutTipoMaquinaEmpresa);


		jComboBoxid_cuenta_contable_debitoTipoMaquinaEmpresa= new JComboBoxMe();
		jComboBoxid_cuenta_contable_debitoTipoMaquinaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_debitoTipoMaquinaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_debitoTipoMaquinaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_debitoTipoMaquinaEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_debitoTipoMaquinaEmpresa= new JButtonMe();
		this.jButtonid_cuenta_contable_debitoTipoMaquinaEmpresa.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_debitoTipoMaquinaEmpresa.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_debitoTipoMaquinaEmpresa.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_debitoTipoMaquinaEmpresa.setText("Buscar");
		this.jButtonid_cuenta_contable_debitoTipoMaquinaEmpresa.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_debitoTipoMaquinaEmpresa.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_debitoTipoMaquinaEmpresa,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_debitoTipoMaquinaEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_debitoTipoMaquinaEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_debitoTipoMaquinaEmpresa"));

		this.jButtonid_cuenta_contable_debitoTipoMaquinaEmpresaBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_debitoTipoMaquinaEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_debitoTipoMaquinaEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_debitoTipoMaquinaEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_debitoTipoMaquinaEmpresaBusqueda.setText("U");
		this.jButtonid_cuenta_contable_debitoTipoMaquinaEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_debitoTipoMaquinaEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_debitoTipoMaquinaEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_debitoTipoMaquinaEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_debitoTipoMaquinaEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_debitoTipoMaquinaEmpresaBusqueda"));

		if(this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_debitoTipoMaquinaEmpresaBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_debitoTipoMaquinaEmpresaUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_debitoTipoMaquinaEmpresaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_debitoTipoMaquinaEmpresaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_debitoTipoMaquinaEmpresaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_debitoTipoMaquinaEmpresaUpdate.setText("U");
		this.jButtonid_cuenta_contable_debitoTipoMaquinaEmpresaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_debitoTipoMaquinaEmpresaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_debitoTipoMaquinaEmpresaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_debitoTipoMaquinaEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_debitoTipoMaquinaEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_debitoTipoMaquinaEmpresaUpdate"));


		jButtonid_cuenta_contable_debitoTipoMaquinaEmpresaArbol= new JButtonMe();
		jButtonid_cuenta_contable_debitoTipoMaquinaEmpresaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_debitoTipoMaquinaEmpresaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_debitoTipoMaquinaEmpresaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_debitoTipoMaquinaEmpresaArbol.setText("Arbol");
		jButtonid_cuenta_contable_debitoTipoMaquinaEmpresaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_debitoTipoMaquinaEmpresaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_debitoTipoMaquinaEmpresaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_debitoTipoMaquinaEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_debitoTipoMaquinaEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_debitoTipoMaquinaEmpresaArbol"));



					
		this.jLabelid_cuenta_contable_creditoTipoMaquinaEmpresa = new JLabelMe();
		this.jLabelid_cuenta_contable_creditoTipoMaquinaEmpresa.setText(""+TipoMaquinaEmpresaConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO+" : *");
		this.jLabelid_cuenta_contable_creditoTipoMaquinaEmpresa.setToolTipText("Cuenta Contable Credito");
		this.jLabelid_cuenta_contable_creditoTipoMaquinaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_creditoTipoMaquinaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_creditoTipoMaquinaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_creditoTipoMaquinaEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_creditoTipoMaquinaEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_creditoTipoMaquinaEmpresa.setToolTipText(TipoMaquinaEmpresaConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO);
		this.gridaBagLayoutTipoMaquinaEmpresa = new GridBagLayout();
		this.jPanelid_cuenta_contable_creditoTipoMaquinaEmpresa.setLayout(this.gridaBagLayoutTipoMaquinaEmpresa);


		jComboBoxid_cuenta_contable_creditoTipoMaquinaEmpresa= new JComboBoxMe();
		jComboBoxid_cuenta_contable_creditoTipoMaquinaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_creditoTipoMaquinaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_creditoTipoMaquinaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_creditoTipoMaquinaEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_creditoTipoMaquinaEmpresa= new JButtonMe();
		this.jButtonid_cuenta_contable_creditoTipoMaquinaEmpresa.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_creditoTipoMaquinaEmpresa.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_creditoTipoMaquinaEmpresa.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_creditoTipoMaquinaEmpresa.setText("Buscar");
		this.jButtonid_cuenta_contable_creditoTipoMaquinaEmpresa.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_creditoTipoMaquinaEmpresa.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_creditoTipoMaquinaEmpresa,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_creditoTipoMaquinaEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_creditoTipoMaquinaEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_creditoTipoMaquinaEmpresa"));

		this.jButtonid_cuenta_contable_creditoTipoMaquinaEmpresaBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_creditoTipoMaquinaEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_creditoTipoMaquinaEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_creditoTipoMaquinaEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_creditoTipoMaquinaEmpresaBusqueda.setText("U");
		this.jButtonid_cuenta_contable_creditoTipoMaquinaEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_creditoTipoMaquinaEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_creditoTipoMaquinaEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_creditoTipoMaquinaEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_creditoTipoMaquinaEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_creditoTipoMaquinaEmpresaBusqueda"));

		if(this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_creditoTipoMaquinaEmpresaBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_creditoTipoMaquinaEmpresaUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_creditoTipoMaquinaEmpresaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_creditoTipoMaquinaEmpresaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_creditoTipoMaquinaEmpresaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_creditoTipoMaquinaEmpresaUpdate.setText("U");
		this.jButtonid_cuenta_contable_creditoTipoMaquinaEmpresaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_creditoTipoMaquinaEmpresaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_creditoTipoMaquinaEmpresaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_creditoTipoMaquinaEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_creditoTipoMaquinaEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_creditoTipoMaquinaEmpresaUpdate"));


		jButtonid_cuenta_contable_creditoTipoMaquinaEmpresaArbol= new JButtonMe();
		jButtonid_cuenta_contable_creditoTipoMaquinaEmpresaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_creditoTipoMaquinaEmpresaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_creditoTipoMaquinaEmpresaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_creditoTipoMaquinaEmpresaArbol.setText("Arbol");
		jButtonid_cuenta_contable_creditoTipoMaquinaEmpresaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_creditoTipoMaquinaEmpresaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_creditoTipoMaquinaEmpresaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_creditoTipoMaquinaEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_creditoTipoMaquinaEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_creditoTipoMaquinaEmpresaArbol"));



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
		//this.jInternalFrameDetalleTipoMaquinaEmpresa = new TipoMaquinaEmpresaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Maquina Empresa DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoMaquinaEmpresa= new GridBagLayout();
		

		
		String sToolTipTipoMaquinaEmpresa="";
		sToolTipTipoMaquinaEmpresa=TipoMaquinaEmpresaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoMaquinaEmpresa+="(Produccion.TipoMaquinaEmpresa)";
		}
		
		if(!this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoMaquinaEmpresa+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoMaquinaEmpresa = new JButtonMe();
		this.jButtonModificarTipoMaquinaEmpresa = new JButtonMe();
        this.jButtonActualizarTipoMaquinaEmpresa = new JButtonMe();
        this.jButtonEliminarTipoMaquinaEmpresa = new JButtonMe();
        this.jButtonCancelarTipoMaquinaEmpresa = new JButtonMe();
        this.jButtonGuardarCambiosTipoMaquinaEmpresa = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoMaquinaEmpresa = new JButtonMe();
		this.jButtonCerrarTipoMaquinaEmpresa = new JButtonMe();
		
		this.jScrollPanelDatosTipoMaquinaEmpresa = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoMaquinaEmpresa = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoMaquinaEmpresa = new JScrollPane();
				
		
		
		this.jPanelCamposTipoMaquinaEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoMaquinaEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoMaquinaEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoMaquinaEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Maquina Empresa";
		
		if(!this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoMaquinaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Maquina Empresas" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoMaquinaEmpresa.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoMaquinaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoMaquinaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoMaquinaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoMaquinaEmpresa.setName("jPanelCamposTipoMaquinaEmpresa"); 

		this.jPanelCamposOcultosTipoMaquinaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoMaquinaEmpresa.setName("jPanelCamposOcultosTipoMaquinaEmpresa"); 

        this.jPanelAccionesTipoMaquinaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoMaquinaEmpresa.setToolTipText("Acciones");
        this.jPanelAccionesTipoMaquinaEmpresa.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoMaquinaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoMaquinaEmpresa.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoMaquinaEmpresa.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoMaquinaEmpresa.setText("Nuevo");
		this.jButtonModificarTipoMaquinaEmpresa.setText("Editar");
        this.jButtonActualizarTipoMaquinaEmpresa.setText("Actualizar");
        this.jButtonEliminarTipoMaquinaEmpresa.setText("Eliminar");
        this.jButtonCancelarTipoMaquinaEmpresa.setText("Cancelar");
        this.jButtonGuardarCambiosTipoMaquinaEmpresa.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoMaquinaEmpresa.setText("Guardar");
		this.jButtonCerrarTipoMaquinaEmpresa.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoMaquinaEmpresa,"nuevo_button","Nuevo",this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoMaquinaEmpresa,"modificar_button","Editar",this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoMaquinaEmpresa,"actualizar_button","Actualizar",this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoMaquinaEmpresa,"eliminar_button","Eliminar",this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoMaquinaEmpresa,"cancelar_button","Cancelar",this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoMaquinaEmpresa,"guardarcambios_button","Guardar",this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoMaquinaEmpresa,"guardarcambiostabla_button","Guardar",this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoMaquinaEmpresa,"cerrar_button","Salir",this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoMaquinaEmpresa.setToolTipText("Nuevo"+" "+TipoMaquinaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoMaquinaEmpresa.setToolTipText("Editar"+" "+TipoMaquinaEmpresaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoMaquinaEmpresa.setToolTipText("Actualizar"+" "+TipoMaquinaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoMaquinaEmpresa.setToolTipText("Eliminar)"+" "+TipoMaquinaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoMaquinaEmpresa.setToolTipText("Cancelar"+" "+TipoMaquinaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoMaquinaEmpresa.setToolTipText("Guardar"+" "+TipoMaquinaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoMaquinaEmpresa.setToolTipText("Guardar"+" "+TipoMaquinaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoMaquinaEmpresa.setToolTipText("Salir"+" "+TipoMaquinaEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoMaquinaEmpresa";
		inputMap = this.jButtonNuevoTipoMaquinaEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoMaquinaEmpresa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoMaquinaEmpresa"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoMaquinaEmpresa";
		inputMap = this.jButtonActualizarTipoMaquinaEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoMaquinaEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoMaquinaEmpresa"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoMaquinaEmpresa";
		inputMap = this.jButtonEliminarTipoMaquinaEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoMaquinaEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoMaquinaEmpresa"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoMaquinaEmpresa";
		inputMap = this.jButtonCancelarTipoMaquinaEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoMaquinaEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoMaquinaEmpresa"));
		
		//CERRAR		
		sMapKey = "CerrarTipoMaquinaEmpresa";
		inputMap = this.jButtonCerrarTipoMaquinaEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoMaquinaEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoMaquinaEmpresa"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoMaquinaEmpresa";
		inputMap = this.jButtonGuardarCambiosTablaTipoMaquinaEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoMaquinaEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoMaquinaEmpresa"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoMaquinaEmpresa = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoMaquinaEmpresa.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoMaquinaEmpresa.setToolTipText("Nuevo TipoMaquinaEmpresa");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoMaquinaEmpresa = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoMaquinaEmpresa.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoMaquinaEmpresa.setToolTipText("Sin Cerrar Ventana TipoMaquinaEmpresa");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoMaquinaEmpresa = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoMaquinaEmpresa.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoMaquinaEmpresa.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoMaquinaEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoMaquinaEmpresa.setText("Accion");
		this.jComboBoxTiposAccionesTipoMaquinaEmpresa.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoMaquinaEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoMaquinaEmpresa.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoMaquinaEmpresa.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoMaquinaEmpresa = new JLabelMe();
		
		this.jLabelAccionesTipoMaquinaEmpresa.setText("Acciones");		
		this.jLabelAccionesTipoMaquinaEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoMaquinaEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoMaquinaEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoMaquinaEmpresa();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoMaquinaEmpresa();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoMaquinaEmpresa=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoMaquinaEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoMaquinaEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoMaquinaEmpresa.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoMaquinaEmpresa.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoMaquinaEmpresa.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoMaquinaEmpresa.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoMaquinaEmpresa.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoMaquinaEmpresa.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoMaquinaEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoMaquinaEmpresa = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoMaquinaEmpresa = new GridBagLayout();
		
		this.jPanelCamposTipoMaquinaEmpresa.setLayout(gridaBagLayoutCamposTipoMaquinaEmpresa);
		this.jPanelCamposOcultosTipoMaquinaEmpresa.setLayout(gridaBagLayoutCamposOcultosTipoMaquinaEmpresa);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMaquinaEmpresa.gridy = 0;
	this.gridBagConstraintsTipoMaquinaEmpresa.gridx = 0;
	this.gridBagConstraintsTipoMaquinaEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoMaquinaEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoMaquinaEmpresa.add(jLabelIdTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);



	this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMaquinaEmpresa.gridy = 0;
	this.gridBagConstraintsTipoMaquinaEmpresa.gridx = 1;
	this.gridBagConstraintsTipoMaquinaEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoMaquinaEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoMaquinaEmpresa.add(jLabelidTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);


	this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMaquinaEmpresa.gridy = 0;
	this.gridBagConstraintsTipoMaquinaEmpresa.gridx = 0;
	this.gridBagConstraintsTipoMaquinaEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoMaquinaEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoMaquinaEmpresa.add(jLabelid_empresaTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMaquinaEmpresa.gridy = 0;
		this.gridBagConstraintsTipoMaquinaEmpresa.gridx = 2;
		this.gridBagConstraintsTipoMaquinaEmpresa.ipadx = 0;
		this.gridBagConstraintsTipoMaquinaEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoMaquinaEmpresa.add(jButtonid_empresaTipoMaquinaEmpresaBusqueda, this.gridBagConstraintsTipoMaquinaEmpresa);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMaquinaEmpresa.gridy = 0;
		this.gridBagConstraintsTipoMaquinaEmpresa.gridx = 3;
		this.gridBagConstraintsTipoMaquinaEmpresa.ipadx = 0;
		this.gridBagConstraintsTipoMaquinaEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoMaquinaEmpresa.add(jButtonid_empresaTipoMaquinaEmpresaUpdate, this.gridBagConstraintsTipoMaquinaEmpresa);
	}

	this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMaquinaEmpresa.gridy = 0;
	this.gridBagConstraintsTipoMaquinaEmpresa.gridx = 1;
	this.gridBagConstraintsTipoMaquinaEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoMaquinaEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoMaquinaEmpresa.add(jComboBoxid_empresaTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);


	this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMaquinaEmpresa.gridy = 0;
	this.gridBagConstraintsTipoMaquinaEmpresa.gridx = 0;
	this.gridBagConstraintsTipoMaquinaEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoMaquinaEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalTipoMaquinaEmpresa.add(jLabelid_sucursalTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMaquinaEmpresa.gridy = 0;
		this.gridBagConstraintsTipoMaquinaEmpresa.gridx = 2;
		this.gridBagConstraintsTipoMaquinaEmpresa.ipadx = 0;
		this.gridBagConstraintsTipoMaquinaEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalTipoMaquinaEmpresa.add(jButtonid_sucursalTipoMaquinaEmpresaBusqueda, this.gridBagConstraintsTipoMaquinaEmpresa);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMaquinaEmpresa.gridy = 0;
		this.gridBagConstraintsTipoMaquinaEmpresa.gridx = 3;
		this.gridBagConstraintsTipoMaquinaEmpresa.ipadx = 0;
		this.gridBagConstraintsTipoMaquinaEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalTipoMaquinaEmpresa.add(jButtonid_sucursalTipoMaquinaEmpresaUpdate, this.gridBagConstraintsTipoMaquinaEmpresa);
	}

	this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMaquinaEmpresa.gridy = 0;
	this.gridBagConstraintsTipoMaquinaEmpresa.gridx = 1;
	this.gridBagConstraintsTipoMaquinaEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoMaquinaEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalTipoMaquinaEmpresa.add(jComboBoxid_sucursalTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);


	this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMaquinaEmpresa.gridy = 0;
	this.gridBagConstraintsTipoMaquinaEmpresa.gridx = 0;
	this.gridBagConstraintsTipoMaquinaEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoMaquinaEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_debitoTipoMaquinaEmpresa.add(jLabelid_cuenta_contable_debitoTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMaquinaEmpresa.gridy = 0;
		this.gridBagConstraintsTipoMaquinaEmpresa.gridx = 2;
		this.gridBagConstraintsTipoMaquinaEmpresa.ipadx = 0;
		this.gridBagConstraintsTipoMaquinaEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_debitoTipoMaquinaEmpresa.add(jButtonid_cuenta_contable_debitoTipoMaquinaEmpresaBusqueda, this.gridBagConstraintsTipoMaquinaEmpresa);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMaquinaEmpresa.gridy = 0;
		this.gridBagConstraintsTipoMaquinaEmpresa.gridx = 3;
		this.gridBagConstraintsTipoMaquinaEmpresa.ipadx = 0;
		this.gridBagConstraintsTipoMaquinaEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_debitoTipoMaquinaEmpresa.add(jButtonid_cuenta_contable_debitoTipoMaquinaEmpresaUpdate, this.gridBagConstraintsTipoMaquinaEmpresa);
	}

	this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMaquinaEmpresa.gridy = 0;
	this.gridBagConstraintsTipoMaquinaEmpresa.gridx = 1;
	this.gridBagConstraintsTipoMaquinaEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoMaquinaEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_debitoTipoMaquinaEmpresa.add(jComboBoxid_cuenta_contable_debitoTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);


	this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMaquinaEmpresa.gridy = 0;
	this.gridBagConstraintsTipoMaquinaEmpresa.gridx = 0;
	this.gridBagConstraintsTipoMaquinaEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoMaquinaEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_creditoTipoMaquinaEmpresa.add(jLabelid_cuenta_contable_creditoTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMaquinaEmpresa.gridy = 0;
		this.gridBagConstraintsTipoMaquinaEmpresa.gridx = 2;
		this.gridBagConstraintsTipoMaquinaEmpresa.ipadx = 0;
		this.gridBagConstraintsTipoMaquinaEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_creditoTipoMaquinaEmpresa.add(jButtonid_cuenta_contable_creditoTipoMaquinaEmpresaBusqueda, this.gridBagConstraintsTipoMaquinaEmpresa);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMaquinaEmpresa.gridy = 0;
		this.gridBagConstraintsTipoMaquinaEmpresa.gridx = 3;
		this.gridBagConstraintsTipoMaquinaEmpresa.ipadx = 0;
		this.gridBagConstraintsTipoMaquinaEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_creditoTipoMaquinaEmpresa.add(jButtonid_cuenta_contable_creditoTipoMaquinaEmpresaUpdate, this.gridBagConstraintsTipoMaquinaEmpresa);
	}

	this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMaquinaEmpresa.gridy = 0;
	this.gridBagConstraintsTipoMaquinaEmpresa.gridx = 1;
	this.gridBagConstraintsTipoMaquinaEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoMaquinaEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_creditoTipoMaquinaEmpresa.add(jComboBoxid_cuenta_contable_creditoTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);


	this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMaquinaEmpresa.gridy = 0;
	this.gridBagConstraintsTipoMaquinaEmpresa.gridx = 0;
	this.gridBagConstraintsTipoMaquinaEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoMaquinaEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoMaquinaEmpresa.add(jLabelcodigoTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMaquinaEmpresa.gridy = 0;
		this.gridBagConstraintsTipoMaquinaEmpresa.gridx = 2;
		this.gridBagConstraintsTipoMaquinaEmpresa.ipadx = 0;
		this.gridBagConstraintsTipoMaquinaEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoMaquinaEmpresa.add(jButtoncodigoTipoMaquinaEmpresaBusqueda, this.gridBagConstraintsTipoMaquinaEmpresa);
	}

	this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMaquinaEmpresa.gridy = 0;
	this.gridBagConstraintsTipoMaquinaEmpresa.gridx = 1;
	this.gridBagConstraintsTipoMaquinaEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoMaquinaEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoMaquinaEmpresa.add(jTextFieldcodigoTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);


	this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMaquinaEmpresa.gridy = 0;
	this.gridBagConstraintsTipoMaquinaEmpresa.gridx = 0;
	this.gridBagConstraintsTipoMaquinaEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoMaquinaEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoMaquinaEmpresa.add(jLabelnombreTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMaquinaEmpresa.gridy = 0;
		this.gridBagConstraintsTipoMaquinaEmpresa.gridx = 2;
		this.gridBagConstraintsTipoMaquinaEmpresa.ipadx = 0;
		this.gridBagConstraintsTipoMaquinaEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoMaquinaEmpresa.add(jButtonnombreTipoMaquinaEmpresaBusqueda, this.gridBagConstraintsTipoMaquinaEmpresa);
	}

	this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMaquinaEmpresa.gridy = 0;
	this.gridBagConstraintsTipoMaquinaEmpresa.gridx = 1;
	this.gridBagConstraintsTipoMaquinaEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoMaquinaEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoMaquinaEmpresa.add(jscrollPanenombreTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);


	this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMaquinaEmpresa.gridy = 0;
	this.gridBagConstraintsTipoMaquinaEmpresa.gridx = 0;
	this.gridBagConstraintsTipoMaquinaEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoMaquinaEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelmarcaTipoMaquinaEmpresa.add(jLabelmarcaTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMaquinaEmpresa.gridy = 0;
		this.gridBagConstraintsTipoMaquinaEmpresa.gridx = 2;
		this.gridBagConstraintsTipoMaquinaEmpresa.ipadx = 0;
		this.gridBagConstraintsTipoMaquinaEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelmarcaTipoMaquinaEmpresa.add(jButtonmarcaTipoMaquinaEmpresaBusqueda, this.gridBagConstraintsTipoMaquinaEmpresa);
	}

	this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMaquinaEmpresa.gridy = 0;
	this.gridBagConstraintsTipoMaquinaEmpresa.gridx = 1;
	this.gridBagConstraintsTipoMaquinaEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoMaquinaEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelmarcaTipoMaquinaEmpresa.add(jscrollPanemarcaTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);


	this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMaquinaEmpresa.gridy = 0;
	this.gridBagConstraintsTipoMaquinaEmpresa.gridx = 0;
	this.gridBagConstraintsTipoMaquinaEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoMaquinaEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelmodeloTipoMaquinaEmpresa.add(jLabelmodeloTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMaquinaEmpresa.gridy = 0;
		this.gridBagConstraintsTipoMaquinaEmpresa.gridx = 2;
		this.gridBagConstraintsTipoMaquinaEmpresa.ipadx = 0;
		this.gridBagConstraintsTipoMaquinaEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelmodeloTipoMaquinaEmpresa.add(jButtonmodeloTipoMaquinaEmpresaBusqueda, this.gridBagConstraintsTipoMaquinaEmpresa);
	}

	this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMaquinaEmpresa.gridy = 0;
	this.gridBagConstraintsTipoMaquinaEmpresa.gridx = 1;
	this.gridBagConstraintsTipoMaquinaEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoMaquinaEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelmodeloTipoMaquinaEmpresa.add(jscrollPanemodeloTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);


	this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMaquinaEmpresa.gridy = 0;
	this.gridBagConstraintsTipoMaquinaEmpresa.gridx = 0;
	this.gridBagConstraintsTipoMaquinaEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoMaquinaEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcostoTipoMaquinaEmpresa.add(jLabelcostoTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMaquinaEmpresa.gridy = 0;
		this.gridBagConstraintsTipoMaquinaEmpresa.gridx = 2;
		this.gridBagConstraintsTipoMaquinaEmpresa.ipadx = 0;
		this.gridBagConstraintsTipoMaquinaEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelcostoTipoMaquinaEmpresa.add(jButtoncostoTipoMaquinaEmpresaBusqueda, this.gridBagConstraintsTipoMaquinaEmpresa);
	}

	this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMaquinaEmpresa.gridy = 0;
	this.gridBagConstraintsTipoMaquinaEmpresa.gridx = 1;
	this.gridBagConstraintsTipoMaquinaEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoMaquinaEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcostoTipoMaquinaEmpresa.add(jTextFieldcostoTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);


	this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMaquinaEmpresa.gridy = 0;
	this.gridBagConstraintsTipoMaquinaEmpresa.gridx = 0;
	this.gridBagConstraintsTipoMaquinaEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoMaquinaEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelesta_activoTipoMaquinaEmpresa.add(jLabelesta_activoTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMaquinaEmpresa.gridy = 0;
		this.gridBagConstraintsTipoMaquinaEmpresa.gridx = 2;
		this.gridBagConstraintsTipoMaquinaEmpresa.ipadx = 0;
		this.gridBagConstraintsTipoMaquinaEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelesta_activoTipoMaquinaEmpresa.add(jButtonesta_activoTipoMaquinaEmpresaBusqueda, this.gridBagConstraintsTipoMaquinaEmpresa);
	}

	this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMaquinaEmpresa.gridy = 0;
	this.gridBagConstraintsTipoMaquinaEmpresa.gridx = 1;
	this.gridBagConstraintsTipoMaquinaEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoMaquinaEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelesta_activoTipoMaquinaEmpresa.add(jCheckBoxesta_activoTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoMaquinaEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoMaquinaEmpresa.gridy = iYPanelCamposTipoMaquinaEmpresa;
	this.gridBagConstraintsTipoMaquinaEmpresa.gridx = iXPanelCamposTipoMaquinaEmpresa++;
	this.gridBagConstraintsTipoMaquinaEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoMaquinaEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoMaquinaEmpresa.add(this.jPanelidTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);



	if(iXPanelCamposTipoMaquinaEmpresa % 1==0) {
		iXPanelCamposTipoMaquinaEmpresa=0;
		iYPanelCamposTipoMaquinaEmpresa++;
	}
	this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoMaquinaEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoMaquinaEmpresa.gridy = iYPanelCamposTipoMaquinaEmpresa;
	this.gridBagConstraintsTipoMaquinaEmpresa.gridx = iXPanelCamposTipoMaquinaEmpresa++;
	this.gridBagConstraintsTipoMaquinaEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoMaquinaEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoMaquinaEmpresa.add(this.jPanelid_cuenta_contable_debitoTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);



	if(iXPanelCamposTipoMaquinaEmpresa % 1==0) {
		iXPanelCamposTipoMaquinaEmpresa=0;
		iYPanelCamposTipoMaquinaEmpresa++;
	}
	this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoMaquinaEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoMaquinaEmpresa.gridy = iYPanelCamposTipoMaquinaEmpresa;
	this.gridBagConstraintsTipoMaquinaEmpresa.gridx = iXPanelCamposTipoMaquinaEmpresa++;
	this.gridBagConstraintsTipoMaquinaEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoMaquinaEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoMaquinaEmpresa.add(this.jPanelid_cuenta_contable_creditoTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);



	if(iXPanelCamposTipoMaquinaEmpresa % 1==0) {
		iXPanelCamposTipoMaquinaEmpresa=0;
		iYPanelCamposTipoMaquinaEmpresa++;
	}
	this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoMaquinaEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoMaquinaEmpresa.gridy = iYPanelCamposTipoMaquinaEmpresa;
	this.gridBagConstraintsTipoMaquinaEmpresa.gridx = iXPanelCamposTipoMaquinaEmpresa++;
	this.gridBagConstraintsTipoMaquinaEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoMaquinaEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoMaquinaEmpresa.add(this.jPanelcodigoTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);



	if(iXPanelCamposTipoMaquinaEmpresa % 1==0) {
		iXPanelCamposTipoMaquinaEmpresa=0;
		iYPanelCamposTipoMaquinaEmpresa++;
	}
	this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoMaquinaEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoMaquinaEmpresa.gridy = iYPanelCamposTipoMaquinaEmpresa;
	this.gridBagConstraintsTipoMaquinaEmpresa.gridx = iXPanelCamposTipoMaquinaEmpresa++;
	this.gridBagConstraintsTipoMaquinaEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoMaquinaEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoMaquinaEmpresa.add(this.jPanelnombreTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);



	if(iXPanelCamposTipoMaquinaEmpresa % 1==0) {
		iXPanelCamposTipoMaquinaEmpresa=0;
		iYPanelCamposTipoMaquinaEmpresa++;
	}
	this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoMaquinaEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoMaquinaEmpresa.gridy = iYPanelCamposTipoMaquinaEmpresa;
	this.gridBagConstraintsTipoMaquinaEmpresa.gridx = iXPanelCamposTipoMaquinaEmpresa++;
	this.gridBagConstraintsTipoMaquinaEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoMaquinaEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoMaquinaEmpresa.add(this.jPanelmarcaTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);



	if(iXPanelCamposTipoMaquinaEmpresa % 1==0) {
		iXPanelCamposTipoMaquinaEmpresa=0;
		iYPanelCamposTipoMaquinaEmpresa++;
	}
	this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoMaquinaEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoMaquinaEmpresa.gridy = iYPanelCamposTipoMaquinaEmpresa;
	this.gridBagConstraintsTipoMaquinaEmpresa.gridx = iXPanelCamposTipoMaquinaEmpresa++;
	this.gridBagConstraintsTipoMaquinaEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoMaquinaEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoMaquinaEmpresa.add(this.jPanelmodeloTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);



	if(iXPanelCamposTipoMaquinaEmpresa % 1==0) {
		iXPanelCamposTipoMaquinaEmpresa=0;
		iYPanelCamposTipoMaquinaEmpresa++;
	}
	this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoMaquinaEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoMaquinaEmpresa.gridy = iYPanelCamposTipoMaquinaEmpresa;
	this.gridBagConstraintsTipoMaquinaEmpresa.gridx = iXPanelCamposTipoMaquinaEmpresa++;
	this.gridBagConstraintsTipoMaquinaEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoMaquinaEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoMaquinaEmpresa.add(this.jPanelcostoTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);



	if(iXPanelCamposTipoMaquinaEmpresa % 1==0) {
		iXPanelCamposTipoMaquinaEmpresa=0;
		iYPanelCamposTipoMaquinaEmpresa++;
	}
	this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoMaquinaEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoMaquinaEmpresa.gridy = iYPanelCamposTipoMaquinaEmpresa;
	this.gridBagConstraintsTipoMaquinaEmpresa.gridx = iXPanelCamposTipoMaquinaEmpresa++;
	this.gridBagConstraintsTipoMaquinaEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoMaquinaEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoMaquinaEmpresa.add(this.jPanelesta_activoTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);



	if(iXPanelCamposTipoMaquinaEmpresa % 1==0) {
		iXPanelCamposTipoMaquinaEmpresa=0;
		iYPanelCamposTipoMaquinaEmpresa++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoMaquinaEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoMaquinaEmpresa.gridy = iYPanelCamposOcultosTipoMaquinaEmpresa;
	this.gridBagConstraintsTipoMaquinaEmpresa.gridx = iXPanelCamposOcultosTipoMaquinaEmpresa++;
	this.gridBagConstraintsTipoMaquinaEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoMaquinaEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoMaquinaEmpresa.add(this.jPanelid_empresaTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);



	if(iXPanelCamposOcultosTipoMaquinaEmpresa % 1==0) {
		iXPanelCamposOcultosTipoMaquinaEmpresa=0;
		iYPanelCamposOcultosTipoMaquinaEmpresa++;
	}
	this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoMaquinaEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoMaquinaEmpresa.gridy = iYPanelCamposOcultosTipoMaquinaEmpresa;
	this.gridBagConstraintsTipoMaquinaEmpresa.gridx = iXPanelCamposOcultosTipoMaquinaEmpresa++;
	this.gridBagConstraintsTipoMaquinaEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoMaquinaEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoMaquinaEmpresa.add(this.jPanelid_sucursalTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);



	if(iXPanelCamposOcultosTipoMaquinaEmpresa % 1==0) {
		iXPanelCamposOcultosTipoMaquinaEmpresa=0;
		iYPanelCamposOcultosTipoMaquinaEmpresa++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoMaquinaEmpresa= new GridBagLayout();
		this.jPanelAccionesTipoMaquinaEmpresa.setLayout(gridaBagLayoutAccionesTipoMaquinaEmpresa);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoMaquinaEmpresa= new GridBagLayout();
		this.jPanelAccionesFormularioTipoMaquinaEmpresa.setLayout(gridaBagLayoutAccionesFormularioTipoMaquinaEmpresa);
		
		this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMaquinaEmpresa.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoMaquinaEmpresa.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoMaquinaEmpresa.add(this.jComboBoxTiposAccionesFormularioTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);

		this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMaquinaEmpresa.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoMaquinaEmpresa.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoMaquinaEmpresa.add(this.jCheckBoxPostAccionNuevoTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipomaquinaempresaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoMaquinaEmpresa.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoMaquinaEmpresa.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoMaquinaEmpresa.add(this.jCheckBoxPostAccionSinCerrarTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipomaquinaempresaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoMaquinaEmpresa.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoMaquinaEmpresa.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoMaquinaEmpresa.add(this.jCheckBoxPostAccionSinMensajeTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMaquinaEmpresa.gridy = 0;
		this.gridBagConstraintsTipoMaquinaEmpresa.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoMaquinaEmpresa.add(this.jButtonModificarTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);							

		this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMaquinaEmpresa.gridy = 0;
		this.gridBagConstraintsTipoMaquinaEmpresa.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoMaquinaEmpresa.add(this.jButtonEliminarTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);
		
			
		this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMaquinaEmpresa.gridy = 0;		
		this.gridBagConstraintsTipoMaquinaEmpresa.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoMaquinaEmpresa.add(this.jButtonActualizarTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);


		this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMaquinaEmpresa.gridy = 0;		
		this.gridBagConstraintsTipoMaquinaEmpresa.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoMaquinaEmpresa.add(this.jButtonGuardarCambiosTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);	
		
		this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMaquinaEmpresa.gridy = 0;		
		this.gridBagConstraintsTipoMaquinaEmpresa.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoMaquinaEmpresa.add(this.jButtonCancelarTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoMaquinaEmpresa = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoMaquinaEmpresa);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipomaquinaempresaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();						
			this.gridBagConstraintsTipoMaquinaEmpresa.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoMaquinaEmpresa.gridx = 0;		
			//this.gridBagConstraintsTipoMaquinaEmpresa.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMaquinaEmpresa.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoMaquinaEmpresa.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMaquinaEmpresa.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoMaquinaEmpresa.gridx =0;
		this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoMaquinaEmpresa.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoMaquinaEmpresaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoMaquinaEmpresa = new TipoMaquinaEmpresaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Maquina Empresa DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Maquina Empresa DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Maquina Empresa Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoMaquinaEmpresaModel tipomaquinaempresaModel=new TipoMaquinaEmpresaModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoMaquinaEmpresaModel.TipoMaquinaEmpresaFocusTraversalPolicy tipomaquinaempresaFocusTraversalPolicy = tipomaquinaempresaModel.new TipoMaquinaEmpresaFocusTraversalPolicy(this);
			
			//tipomaquinaempresaFocusTraversalPolicy.settipomaquinaempresaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipomaquinaempresaModel);
			
			
			this.jContentPaneDetalleTipoMaquinaEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoMaquinaEmpresa = new GridBagLayout();	
			this.jContentPaneDetalleTipoMaquinaEmpresa.setLayout(gridaBagLayoutDetalleTipoMaquinaEmpresa);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoMaquinaEmpresa = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
				this.gridBagConstraintsTipoMaquinaEmpresa.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoMaquinaEmpresa.gridx = 0;
					
				
				this.jContentPaneDetalleTipoMaquinaEmpresa.add(jTtoolBarDetalleTipoMaquinaEmpresa, gridBagConstraintsTipoMaquinaEmpresa);								
				
}
			
			this.jScrollPanelDatosEdicionTipoMaquinaEmpresa=   new JScrollPane(jContentPaneDetalleTipoMaquinaEmpresa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoMaquinaEmpresa.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoMaquinaEmpresa.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoMaquinaEmpresa.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoMaquinaEmpresa=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoMaquinaEmpresa.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoMaquinaEmpresa.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoMaquinaEmpresa.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoMaquinaEmpresa.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoMaquinaEmpresa.gridx = 0;
	        
			this.jContentPaneDetalleTipoMaquinaEmpresa.add(jPanelCamposTipoMaquinaEmpresa, gridBagConstraintsTipoMaquinaEmpresa);
			
			
			
			
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
						&& tipomaquinaempresaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameProductoOrdenDetaProduMaquina(this.puedeCargarPorParteProductoOrdenDetaProduMaquina,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProductoProduMaquina(this.puedeCargarPorParteProductoProduMaquina,false,-1);
					
					if(this.tipomaquinaempresaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoMaquinaEmpresa= new GridBagConstraints();
						this.gridBagConstraintsTipoMaquinaEmpresa.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoMaquinaEmpresa.gridx = 0;
						this.jContentPaneDetalleTipoMaquinaEmpresa.add(this.jTabbedPaneRelacionesTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoMaquinaEmpresa.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameProductoOrdenDetaProduMaquina(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProductoProduMaquina(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoMaquinaEmpresa.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
					this.gridBagConstraintsTipoMaquinaEmpresa.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoMaquinaEmpresa.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoMaquinaEmpresa.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoMaquinaEmpresa.gridx = 0;
					
				
					this.jContentPaneDetalleTipoMaquinaEmpresa.add(jPanelCamposOcultosTipoMaquinaEmpresa, gridBagConstraintsTipoMaquinaEmpresa);
				
					this.jPanelCamposOcultosTipoMaquinaEmpresa.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoMaquinaEmpresa.gridy = iGridyRelaciones++;//7;		
	        this.gridBagConstraintsTipoMaquinaEmpresa.gridx = 0;
	        this.gridBagConstraintsTipoMaquinaEmpresa.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoMaquinaEmpresa.add(this.jPanelAccionesFormularioTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);							
			
			
			
			this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
	        this.gridBagConstraintsTipoMaquinaEmpresa.gridy = iGridyRelaciones;//7;		
	        this.gridBagConstraintsTipoMaquinaEmpresa.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoMaquinaEmpresa.add(this.jPanelAccionesTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoMaquinaEmpresa);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoMaquinaEmpresa=   new JScrollPane(this.jPanelCamposTipoMaquinaEmpresa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoMaquinaEmpresa.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoMaquinaEmpresa.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoMaquinaEmpresa.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoMaquinaEmpresa.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoMaquinaEmpresa.gridx = 0;
			this.gridBagConstraintsTipoMaquinaEmpresa.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoMaquinaEmpresa.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoMaquinaEmpresa.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoMaquinaEmpresa.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoMaquinaEmpresa.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);			
			
			this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoMaquinaEmpresa.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoMaquinaEmpresa.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMaquinaEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoMaquinaEmpresa.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);
			
			
		this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMaquinaEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoMaquinaEmpresa.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);
		
			
		this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoMaquinaEmpresa.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoMaquinaEmpresa.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoMaquinaEmpresa, this.gridBagConstraintsTipoMaquinaEmpresa);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoMaquinaEmpresa;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoMaquinaEmpresa;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameProductoOrdenDetaProduMaquina(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.productoordendetaprodumaquinaSessionBean=new ProductoOrdenDetaProduMaquinaSessionBean();
		this.productoordendetaprodumaquinaSessionBean.setConGuardarRelaciones(false);
		this.productoordendetaprodumaquinaSessionBean.setEsGuardarRelacionado(true);

		this.productoordendetaprodumaquinaBeanSwingJInternalFrame=null;//new ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.productoordendetaprodumaquinaBeanSwingJInternalFramePopup=new ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.productoordendetaprodumaquinaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado()) {

				ProductoOrdenDetaProduMaquinaJInternalFrame.STIPO_TAMANIO_GENERAL=TipoMaquinaEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL;
				ProductoOrdenDetaProduMaquinaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoMaquinaEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.productoordendetaprodumaquinaSessionBean.setEsGuardarRelacionado(true);

				this.productoordendetaprodumaquinaBeanSwingJInternalFrame=new ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.productoordendetaprodumaquinaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.productoordendetaprodumaquinaBeanSwingJInternalFrame.setproductoordendetaprodumaquinaSessionBean(this.productoordendetaprodumaquinaSessionBean);

				//this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
				//this.gridBagConstraintsTipoMaquinaEmpresa.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoMaquinaEmpresa.gridx = 0;
				//this.jContentPaneDetalleTipoMaquinaEmpresa.add(this.productoordendetaprodumaquinaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoMaquinaEmpresa);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoMaquinaEmpresa.add("Orden Maquinaes",this.productoordendetaprodumaquinaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoMaquinaEmpresa.setComponentAt(iIndexTab,this.productoordendetaprodumaquinaBeanSwingJInternalFrame.getContentPane());
				}

				//ProductoOrdenDetaProduMaquinaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.productoordendetaprodumaquinaSessionBean.setEsGuardarRelacionado(false);
				this.productoordendetaprodumaquinaBeanSwingJInternalFrame=null;//new ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteProductoOrdenDetaProduMaquina) {
					this.jTabbedPaneRelacionesTipoMaquinaEmpresa.add("Orden Maquinaes",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameProductoProduMaquina(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.productoprodumaquinaSessionBean=new ProductoProduMaquinaSessionBean();
		this.productoprodumaquinaSessionBean.setConGuardarRelaciones(false);
		this.productoprodumaquinaSessionBean.setEsGuardarRelacionado(true);

		this.productoprodumaquinaBeanSwingJInternalFrame=null;//new ProductoProduMaquinaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.productoprodumaquinaBeanSwingJInternalFramePopup=new ProductoProduMaquinaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.productoprodumaquinaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.productoprodumaquinaSessionBean.getEsGuardarRelacionado()) {

				ProductoProduMaquinaJInternalFrame.STIPO_TAMANIO_GENERAL=TipoMaquinaEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL;
				ProductoProduMaquinaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoMaquinaEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.productoprodumaquinaSessionBean.setEsGuardarRelacionado(true);

				this.productoprodumaquinaBeanSwingJInternalFrame=new ProductoProduMaquinaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.productoprodumaquinaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.productoprodumaquinaBeanSwingJInternalFrame.setproductoprodumaquinaSessionBean(this.productoprodumaquinaSessionBean);

				//this.gridBagConstraintsTipoMaquinaEmpresa = new GridBagConstraints();
				//this.gridBagConstraintsTipoMaquinaEmpresa.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoMaquinaEmpresa.gridx = 0;
				//this.jContentPaneDetalleTipoMaquinaEmpresa.add(this.productoprodumaquinaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoMaquinaEmpresa);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoMaquinaEmpresa.add("Producto Maquina Producciones",this.productoprodumaquinaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoMaquinaEmpresa.setComponentAt(iIndexTab,this.productoprodumaquinaBeanSwingJInternalFrame.getContentPane());
				}

				//ProductoProduMaquinaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.productoprodumaquinaSessionBean.setEsGuardarRelacionado(false);
				this.productoprodumaquinaBeanSwingJInternalFrame=null;//new ProductoProduMaquinaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.productoprodumaquinaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteProductoProduMaquina) {
					this.jTabbedPaneRelacionesTipoMaquinaEmpresa.add("Producto Maquina Producciones",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarProductoOrdenDetaProduMaquinaBeanSwingJInternalFrame(List<TipoMaquinaEmpresa> tipomaquinaempresas,TipoMaquinaEmpresa tipomaquinaempresa,ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrame productoordendetaprodumaquinaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//productoordendetaprodumaquinaBeanSwingJInternalFrame=new ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					productoordendetaprodumaquinaBeanSwingJInternalFrame.getProductoOrdenDetaProduMaquinaLogic().setConnexion(this.tipomaquinaempresaLogic.getConnexion());

					productoordendetaprodumaquinaBeanSwingJInternalFrame.settipomaquinaempresasForeignKey(tipomaquinaempresas);
					productoordendetaprodumaquinaBeanSwingJInternalFrame.settipomaquinaempresaForeignKey(tipomaquinaempresa);
					productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinaSessionBean.setisBusquedaDesdeForeignKeySesionTipoMaquinaEmpresa(true);
					productoordendetaprodumaquinaBeanSwingJInternalFrame.productoordendetaprodumaquinaSessionBean.setlidTipoMaquinaEmpresaActual(tipomaquinaempresa.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					productoordendetaprodumaquinaBeanSwingJInternalFrame.cargarCombosForeignKeyProductoOrdenDetaProduMaquina(productoordendetaprodumaquinaBeanSwingJInternalFrame.isCargarCombosDependencia);
					productoordendetaprodumaquinaBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoMaquinaEmpresa(true);
					productoordendetaprodumaquinaBeanSwingJInternalFrame.setid_tipo_merma_empresaFK_IdTipoMaquinaEmpresa(tipomaquinaempresa.getId());

					if(!this.conCargarFormDetalle) {
						productoordendetaprodumaquinaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					productoordendetaprodumaquinaBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoMaquinaEmpresaForeignKey(tipomaquinaempresa,1,false,true,true);
					productoordendetaprodumaquinaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					productoordendetaprodumaquinaBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoMaquinaEmpresa");
					productoordendetaprodumaquinaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoMaquinaEmpresa");
					productoordendetaprodumaquinaBeanSwingJInternalFrame.inicializarActualizarBindingTablaProductoOrdenDetaProduMaquina(true);
					productoordendetaprodumaquinaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesProductoOrdenDetaProduMaquina("n",productoordendetaprodumaquinaBeanSwingJInternalFrame.isGuardarCambiosEnLote, productoordendetaprodumaquinaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					productoordendetaprodumaquinaBeanSwingJInternalFrame.setAutoscrolls(true);
					productoordendetaprodumaquinaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						productoordendetaprodumaquinaBeanSwingJInternalFrame.actualizarEstadoPanelsProductoOrdenDetaProduMaquina("relacionado");
					} else {
						productoordendetaprodumaquinaBeanSwingJInternalFrame.actualizarEstadoPanelsProductoOrdenDetaProduMaquina("no_relacionado");
					}

					productoordendetaprodumaquinaBeanSwingJInternalFrame.getjButtonRecargarInformacionProductoOrdenDetaProduMaquina().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarProductoProduMaquinaBeanSwingJInternalFrame(List<TipoMaquinaEmpresa> tipomaquinaempresas,TipoMaquinaEmpresa tipomaquinaempresa,ProductoProduMaquinaBeanSwingJInternalFrame productoprodumaquinaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//productoprodumaquinaBeanSwingJInternalFrame=new ProductoProduMaquinaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					productoprodumaquinaBeanSwingJInternalFrame.getProductoProduMaquinaLogic().setConnexion(this.tipomaquinaempresaLogic.getConnexion());

					productoprodumaquinaBeanSwingJInternalFrame.settipomaquinaempresasForeignKey(tipomaquinaempresas);
					productoprodumaquinaBeanSwingJInternalFrame.settipomaquinaempresaForeignKey(tipomaquinaempresa);
					productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaSessionBean.setisBusquedaDesdeForeignKeySesionTipoMaquinaEmpresa(true);
					productoprodumaquinaBeanSwingJInternalFrame.productoprodumaquinaSessionBean.setlidTipoMaquinaEmpresaActual(tipomaquinaempresa.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					productoprodumaquinaBeanSwingJInternalFrame.cargarCombosForeignKeyProductoProduMaquina(productoprodumaquinaBeanSwingJInternalFrame.isCargarCombosDependencia);
					productoprodumaquinaBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoMaquinaEmpresa(true);
					productoprodumaquinaBeanSwingJInternalFrame.setid_tipo_merma_empresaFK_IdTipoMaquinaEmpresa(tipomaquinaempresa.getId());

					if(!this.conCargarFormDetalle) {
						productoprodumaquinaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					productoprodumaquinaBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoMaquinaEmpresaForeignKey(tipomaquinaempresa,1,false,true,true);
					productoprodumaquinaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					productoprodumaquinaBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoMaquinaEmpresa");
					productoprodumaquinaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoMaquinaEmpresa");
					productoprodumaquinaBeanSwingJInternalFrame.inicializarActualizarBindingTablaProductoProduMaquina(true);
					productoprodumaquinaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesProductoProduMaquina("n",productoprodumaquinaBeanSwingJInternalFrame.isGuardarCambiosEnLote, productoprodumaquinaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					productoprodumaquinaBeanSwingJInternalFrame.setAutoscrolls(true);
					productoprodumaquinaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						productoprodumaquinaBeanSwingJInternalFrame.actualizarEstadoPanelsProductoProduMaquina("relacionado");
					} else {
						productoprodumaquinaBeanSwingJInternalFrame.actualizarEstadoPanelsProductoProduMaquina("no_relacionado");
					}

					productoprodumaquinaBeanSwingJInternalFrame.getjButtonRecargarInformacionProductoProduMaquina().setVisible(false);

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
