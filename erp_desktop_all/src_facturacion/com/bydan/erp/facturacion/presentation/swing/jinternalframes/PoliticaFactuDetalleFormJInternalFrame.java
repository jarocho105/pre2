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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.facturacion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.facturacion.util.PoliticaFactuConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.*;
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
public class PoliticaFactuDetalleFormJInternalFrame extends PoliticaFactuBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetallePoliticaFactu;
	
	protected JMenuBar jmenuBarDetallePoliticaFactu;
	
	protected JMenu jmenuDetallePoliticaFactu;
	protected JMenu jmenuDetalleArchivoPoliticaFactu;
	protected JMenu jmenuDetalleAccionesPoliticaFactu;
	protected JMenu jmenuDetalleDatosPoliticaFactu;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetallePoliticaFactu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPoliticaFactu;	
	protected GridBagConstraints gridBagConstraintsPoliticaFactu;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected PoliticaFactuBeanSwingJInternalFrameAdditional jInternalFrameDetallePoliticaFactu;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected GrupoClienteBeanSwingJInternalFrame grupoclienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_grupocliente="";
	
	public PoliticaFactuSessionBean politicafactuSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ProductoSessionBean productoSessionBean;
	public GrupoClienteSessionBean grupoclienteSessionBean;	
	
	public PoliticaFactuLogic politicafactuLogic;
	
	public JScrollPane jScrollPanelDatosPoliticaFactu;
	public JScrollPane jScrollPanelDatosEdicionPoliticaFactu;
	public JScrollPane jScrollPanelDatosGeneralPoliticaFactu;
	
	protected JPanel jPanelCamposPoliticaFactu;    
	protected JPanel jPanelCamposOcultosPoliticaFactu;    	
	protected JPanel jPanelAccionesPoliticaFactu;
	protected JPanel jPanelAccionesFormularioPoliticaFactu;
    
	
	
	protected Integer iXPanelCamposPoliticaFactu=0;
	protected Integer iYPanelCamposPoliticaFactu=0;
	
	protected Integer iXPanelCamposOcultosPoliticaFactu=0;
	protected Integer iYPanelCamposOcultosPoliticaFactu=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoPoliticaFactu;
	public JButton jButtonModificarPoliticaFactu;
	public JButton jButtonActualizarPoliticaFactu;
    public JButton jButtonEliminarPoliticaFactu;
	public JButton jButtonCancelarPoliticaFactu;
    public JButton jButtonGuardarCambiosPoliticaFactu;
	public JButton jButtonGuardarCambiosTablaPoliticaFactu;
	protected JButton jButtonCerrarPoliticaFactu;
	
	
	protected JButton jButtonProcesarInformacionPoliticaFactu;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoPoliticaFactu;
	protected JCheckBox jCheckBoxPostAccionSinCerrarPoliticaFactu;
	protected JCheckBox jCheckBoxPostAccionSinMensajePoliticaFactu;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPoliticaFactu;
	protected JButton jButtonModificarToolBarPoliticaFactu;
	protected JButton jButtonActualizarToolBarPoliticaFactu;
    protected JButton jButtonEliminarToolBarPoliticaFactu;
	protected JButton jButtonCancelarToolBarPoliticaFactu;
    protected JButton jButtonGuardarCambiosToolBarPoliticaFactu;
	protected JButton jButtonGuardarCambiosTablaToolBarPoliticaFactu;
	protected JButton jButtonMostrarOcultarTablaToolBarPoliticaFactu;
	protected JButton jButtonCerrarToolBarPoliticaFactu;
	
	protected JButton jButtonProcesarInformacionToolBarPoliticaFactu;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPoliticaFactu;
	protected JMenuItem jMenuItemModificarPoliticaFactu;
	protected JMenuItem jMenuItemActualizarPoliticaFactu;
    protected JMenuItem jMenuItemEliminarPoliticaFactu;
	protected JMenuItem jMenuItemCancelarPoliticaFactu;
    protected JMenuItem jMenuItemGuardarCambiosPoliticaFactu;
	protected JMenuItem jMenuItemGuardarCambiosTablaPoliticaFactu;
	protected JMenuItem jMenuItemCerrarPoliticaFactu;
	protected JMenuItem jMenuItemDetalleCerrarPoliticaFactu;
	protected JMenuItem jMenuItemDetalleMostarOcultarPoliticaFactu;
	
	protected JMenuItem jMenuItemProcesarInformacionPoliticaFactu;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPoliticaFactu;
	protected JMenuItem jMenuItemMostrarOcultarPoliticaFactu;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPoliticaFactu;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPoliticaFactu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPoliticaFactu;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioPoliticaFactu;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidPoliticaFactu;
	public JLabel jLabelIdPoliticaFactu;
	public JLabel jLabelidPoliticaFactu;
	public JButton jButtonidPoliticaFactuBusqueda= new JButtonMe();

	public JPanel jPanelnombrePoliticaFactu;
	public JLabel jLabelnombrePoliticaFactu;
	public JTextArea jTextAreanombrePoliticaFactu;
	public JScrollPane jscrollPanenombrePoliticaFactu;
	public JButton jButtonnombrePoliticaFactuBusqueda= new JButtonMe();

	public JPanel jPanelfecha_desdePoliticaFactu;
	public JLabel jLabelfecha_desdePoliticaFactu;
	//public JFormattedTextField jDateChooserfecha_desdePoliticaFactu;

	public JDateChooser jDateChooserfecha_desdePoliticaFactu;
	public JButton jButtonfecha_desdePoliticaFactuBusqueda= new JButtonMe();

	public JPanel jPanelfecha_hastaPoliticaFactu;
	public JLabel jLabelfecha_hastaPoliticaFactu;
	//public JFormattedTextField jDateChooserfecha_hastaPoliticaFactu;

	public JDateChooser jDateChooserfecha_hastaPoliticaFactu;
	public JButton jButtonfecha_hastaPoliticaFactuBusqueda= new JButtonMe();

	public JPanel jPanelporcentajePoliticaFactu;
	public JLabel jLabelporcentajePoliticaFactu;
	public JTextField jTextFieldporcentajePoliticaFactu;
	public JButton jButtonporcentajePoliticaFactuBusqueda= new JButtonMe();

	public JPanel jPanelvalorPoliticaFactu;
	public JLabel jLabelvalorPoliticaFactu;
	public JTextField jTextFieldvalorPoliticaFactu;
	public JButton jButtonvalorPoliticaFactuBusqueda= new JButtonMe();

	public JPanel jPanelcon_banco_clientePoliticaFactu;
	public JLabel jLabelcon_banco_clientePoliticaFactu;
	public JCheckBox jCheckBoxcon_banco_clientePoliticaFactu;
	public JButton jButtoncon_banco_clientePoliticaFactuBusqueda= new JButtonMe();

	public JPanel jPanelcon_banco_productoPoliticaFactu;
	public JLabel jLabelcon_banco_productoPoliticaFactu;
	public JCheckBox jCheckBoxcon_banco_productoPoliticaFactu;
	public JButton jButtoncon_banco_productoPoliticaFactuBusqueda= new JButtonMe();

	public JPanel jPaneles_activoPoliticaFactu;
	public JLabel jLabeles_activoPoliticaFactu;
	public JCheckBox jCheckBoxes_activoPoliticaFactu;
	public JButton jButtones_activoPoliticaFactuBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaPoliticaFactu;
	public JLabel jLabelid_empresaPoliticaFactu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaPoliticaFactu;
	public JButton jButtonid_empresaPoliticaFactu= new JButtonMe();
	public JButton jButtonid_empresaPoliticaFactuUpdate= new JButtonMe();
	public JButton jButtonid_empresaPoliticaFactuBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalPoliticaFactu;
	public JLabel jLabelid_sucursalPoliticaFactu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalPoliticaFactu;
	public JButton jButtonid_sucursalPoliticaFactu= new JButtonMe();
	public JButton jButtonid_sucursalPoliticaFactuUpdate= new JButtonMe();
	public JButton jButtonid_sucursalPoliticaFactuBusqueda= new JButtonMe();

	public JPanel jPanelid_productoPoliticaFactu;
	public JLabel jLabelid_productoPoliticaFactu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoPoliticaFactu;
	public JButton jButtonid_productoPoliticaFactu= new JButtonMe();
	public JButton jButtonid_productoPoliticaFactuUpdate= new JButtonMe();
	public JButton jButtonid_productoPoliticaFactuBusqueda= new JButtonMe();

	public JPanel jPanelid_grupo_clientePoliticaFactu;
	public JLabel jLabelid_grupo_clientePoliticaFactu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_grupo_clientePoliticaFactu;
	public JButton jButtonid_grupo_clientePoliticaFactu= new JButtonMe();
	public JButton jButtonid_grupo_clientePoliticaFactuUpdate= new JButtonMe();
	public JButton jButtonid_grupo_clientePoliticaFactuBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesPoliticaFactu;
	
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
		
	public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightFormulario=396;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public PoliticaFactuDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposPoliticaFactu=new JPanel();
				this.jPanelAccionesFormularioPoliticaFactu=new JPanel();
				this.jmenuBarDetallePoliticaFactu=new JMenuBar();
				this.jTtoolBarDetallePoliticaFactu=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PoliticaFactuDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("PoliticaFactu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public PoliticaFactuDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("PoliticaFactu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PoliticaFactuDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PoliticaFactu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PoliticaFactuDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PoliticaFactu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PoliticaFactuDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PoliticaFactu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarPoliticaFactu() {
		return this.jButtonActualizarToolBarPoliticaFactu;
	}
	
	public JButton getjButtonEliminarToolBarPoliticaFactu() {
		return this.jButtonEliminarToolBarPoliticaFactu;
	}
	
	public JButton getjButtonCancelarToolBarPoliticaFactu() {
		return this.jButtonCancelarToolBarPoliticaFactu;
	}		
	
	public JButton getjButtonProcesarInformacionPoliticaFactu() {
		return this.jButtonProcesarInformacionPoliticaFactu;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPoliticaFactu)	{
		this.jButtonProcesarInformacionPoliticaFactu = jButtonProcesarInformacionPoliticaFactu;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPoliticaFactu() {
		return this.jComboBoxTiposAccionesPoliticaFactu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPoliticaFactu(
			JComboBox jComboBoxTiposRelacionesPoliticaFactu) {
		this.jComboBoxTiposRelacionesPoliticaFactu = jComboBoxTiposRelacionesPoliticaFactu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPoliticaFactu(
			JComboBox jComboBoxTiposAccionesPoliticaFactu) {
		this.jComboBoxTiposAccionesPoliticaFactu = jComboBoxTiposAccionesPoliticaFactu;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioPoliticaFactu() {
		return this.jComboBoxTiposAccionesFormularioPoliticaFactu;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioPoliticaFactu(
			JComboBox jComboBoxTiposAccionesFormularioPoliticaFactu) {
		this.jComboBoxTiposAccionesFormularioPoliticaFactu = jComboBoxTiposAccionesFormularioPoliticaFactu;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.politicafactuSessionBean=new PoliticaFactuSessionBean();
		
		this.politicafactuSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.politicafactuSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.politicafactuSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PoliticaFactuJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PoliticaFactuJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PoliticaFactuJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Politica Factu MANTENIMIENTO"));
		
		
		if(iWidth > 1250) {
			iWidth=1250;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.politicafactuSessionBean.getEsGuardarRelacionado()) {
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
	
		PoliticaFactuJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetallePoliticaFactu= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarPoliticaFactu=new JButtonMe();
				this.jButtonModificarToolBarPoliticaFactu=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarPoliticaFactu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarPoliticaFactu,this.jTtoolBarDetallePoliticaFactu,
							"actualizar","actualizar","Actualizar"+" "+PoliticaFactuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarPoliticaFactu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarPoliticaFactu,this.jTtoolBarDetallePoliticaFactu,
							"eliminar","eliminar","Eliminar"+" "+PoliticaFactuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarPoliticaFactu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarPoliticaFactu,this.jTtoolBarDetallePoliticaFactu,
							"cancelar","cancelar","Cancelar"+" "+PoliticaFactuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarPoliticaFactu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarPoliticaFactu,this.jTtoolBarDetallePoliticaFactu,
							"guardarcambios","guardarcambios","Guardar"+" "+PoliticaFactuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarPoliticaFactu,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarPoliticaFactu,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarPoliticaFactu,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetallePoliticaFactu=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetallePoliticaFactu=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoPoliticaFactu=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesPoliticaFactu=new JMenuMe("Acciones");
		this.jmenuDetalleDatosPoliticaFactu=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPoliticaFactu= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPoliticaFactu.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPoliticaFactu,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPoliticaFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarPoliticaFactu= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarPoliticaFactu.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarPoliticaFactu,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarPoliticaFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarPoliticaFactu= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarPoliticaFactu.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarPoliticaFactu,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarPoliticaFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarPoliticaFactu= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarPoliticaFactu.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarPoliticaFactu,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarPoliticaFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarPoliticaFactu= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarPoliticaFactu.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarPoliticaFactu,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarPoliticaFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosPoliticaFactu= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPoliticaFactu.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPoliticaFactu,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPoliticaFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPoliticaFactu= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPoliticaFactu.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPoliticaFactu,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPoliticaFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarPoliticaFactu= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarPoliticaFactu.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarPoliticaFactu,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarPoliticaFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPoliticaFactu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPoliticaFactu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPoliticaFactu,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPoliticaFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPoliticaFactu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPoliticaFactu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPoliticaFactu,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPoliticaFactu, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoPoliticaFactu.add(this.jMenuItemDetalleCerrarPoliticaFactu);
		
		this.jmenuDetalleAccionesPoliticaFactu.add(this.jMenuItemActualizarPoliticaFactu);
		this.jmenuDetalleAccionesPoliticaFactu.add(this.jMenuItemEliminarPoliticaFactu);
		this.jmenuDetalleAccionesPoliticaFactu.add(this.jMenuItemCancelarPoliticaFactu);		
		
		//this.jmenuDetalleDatosPoliticaFactu.add(this.jMenuItemDetalleAbrirOrderByPoliticaFactu);				
		this.jmenuDetalleDatosPoliticaFactu.add(this.jMenuItemDetalleMostarOcultarPoliticaFactu);				
				
		//this.jmenuDetalleAccionesPoliticaFactu.add(this.jMenuItemGuardarCambiosPoliticaFactu);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoPoliticaFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesPoliticaFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosPoliticaFactu, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetallePoliticaFactu.add(this.jmenuDetalleArchivoPoliticaFactu);		
		this.jmenuBarDetallePoliticaFactu.add(this.jmenuDetalleAccionesPoliticaFactu);		
		this.jmenuBarDetallePoliticaFactu.add(this.jmenuDetalleDatosPoliticaFactu);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetallePoliticaFactu);				
	}
	
	
	public void inicializarElementosCamposPoliticaFactu() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdPoliticaFactu = new JLabelMe();
		jLabelIdPoliticaFactu.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdPoliticaFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPoliticaFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPoliticaFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdPoliticaFactu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidPoliticaFactu = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidPoliticaFactu.setToolTipText(PoliticaFactuConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutPoliticaFactu= new GridBagLayout();

		this.jPanelidPoliticaFactu.setLayout(this.gridaBagLayoutPoliticaFactu);

		jLabelidPoliticaFactu = new JLabel();
		jLabelidPoliticaFactu.setText("Id");

		jLabelidPoliticaFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPoliticaFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPoliticaFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombrePoliticaFactu = new JLabelMe();
		this.jLabelnombrePoliticaFactu.setText(""+PoliticaFactuConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombrePoliticaFactu.setToolTipText("Nombre");
		this.jLabelnombrePoliticaFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombrePoliticaFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombrePoliticaFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombrePoliticaFactu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombrePoliticaFactu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombrePoliticaFactu.setToolTipText(PoliticaFactuConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutPoliticaFactu = new GridBagLayout();
		this.jPanelnombrePoliticaFactu.setLayout(this.gridaBagLayoutPoliticaFactu);


		jTextAreanombrePoliticaFactu= new JTextAreaMe();
		jTextAreanombrePoliticaFactu.setEnabled(false);
		jTextAreanombrePoliticaFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombrePoliticaFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombrePoliticaFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombrePoliticaFactu.setLineWrap(true);
		jTextAreanombrePoliticaFactu.setWrapStyleWord(true);
		jTextAreanombrePoliticaFactu.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombrePoliticaFactu.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombrePoliticaFactu,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombrePoliticaFactu = new JScrollPane(jTextAreanombrePoliticaFactu);
		jscrollPanenombrePoliticaFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombrePoliticaFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombrePoliticaFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombrePoliticaFactuBusqueda= new JButtonMe();
		this.jButtonnombrePoliticaFactuBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombrePoliticaFactuBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombrePoliticaFactuBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombrePoliticaFactuBusqueda.setText("U");
		this.jButtonnombrePoliticaFactuBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombrePoliticaFactuBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombrePoliticaFactuBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombrePoliticaFactu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombrePoliticaFactu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombrePoliticaFactuBusqueda"));

		if(this.politicafactuSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombrePoliticaFactuBusqueda.setVisible(false);		}


					
		this.jLabelfecha_desdePoliticaFactu = new JLabelMe();
		this.jLabelfecha_desdePoliticaFactu.setText(""+PoliticaFactuConstantesFunciones.LABEL_FECHADESDE+" : *");
		this.jLabelfecha_desdePoliticaFactu.setToolTipText("Fecha Desde");
		this.jLabelfecha_desdePoliticaFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_desdePoliticaFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_desdePoliticaFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_desdePoliticaFactu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_desdePoliticaFactu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_desdePoliticaFactu.setToolTipText(PoliticaFactuConstantesFunciones.LABEL_FECHADESDE);
		this.gridaBagLayoutPoliticaFactu = new GridBagLayout();
		this.jPanelfecha_desdePoliticaFactu.setLayout(this.gridaBagLayoutPoliticaFactu);


		//jFormattedTextFieldfecha_desdePoliticaFactu= new JFormattedTextFieldMe();

		jDateChooserfecha_desdePoliticaFactu= new JDateChooser();
		jDateChooserfecha_desdePoliticaFactu.setEnabled(false);
		jDateChooserfecha_desdePoliticaFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_desdePoliticaFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_desdePoliticaFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_desdePoliticaFactu,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_desdePoliticaFactu.setDate(new Date());
		jDateChooserfecha_desdePoliticaFactu.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_desdePoliticaFactu.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_desdePoliticaFactuBusqueda= new JButtonMe();
		this.jButtonfecha_desdePoliticaFactuBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_desdePoliticaFactuBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_desdePoliticaFactuBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_desdePoliticaFactuBusqueda.setText("U");
		this.jButtonfecha_desdePoliticaFactuBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_desdePoliticaFactuBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_desdePoliticaFactuBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_desdePoliticaFactu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_desdePoliticaFactu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_desdePoliticaFactuBusqueda"));

		if(this.politicafactuSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_desdePoliticaFactuBusqueda.setVisible(false);		}


					
		this.jLabelfecha_hastaPoliticaFactu = new JLabelMe();
		this.jLabelfecha_hastaPoliticaFactu.setText(""+PoliticaFactuConstantesFunciones.LABEL_FECHAHASTA+" : *");
		this.jLabelfecha_hastaPoliticaFactu.setToolTipText("Fecha Hasta");
		this.jLabelfecha_hastaPoliticaFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_hastaPoliticaFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_hastaPoliticaFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_hastaPoliticaFactu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_hastaPoliticaFactu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_hastaPoliticaFactu.setToolTipText(PoliticaFactuConstantesFunciones.LABEL_FECHAHASTA);
		this.gridaBagLayoutPoliticaFactu = new GridBagLayout();
		this.jPanelfecha_hastaPoliticaFactu.setLayout(this.gridaBagLayoutPoliticaFactu);


		//jFormattedTextFieldfecha_hastaPoliticaFactu= new JFormattedTextFieldMe();

		jDateChooserfecha_hastaPoliticaFactu= new JDateChooser();
		jDateChooserfecha_hastaPoliticaFactu.setEnabled(false);
		jDateChooserfecha_hastaPoliticaFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaPoliticaFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaPoliticaFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_hastaPoliticaFactu,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_hastaPoliticaFactu.setDate(new Date());
		jDateChooserfecha_hastaPoliticaFactu.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_hastaPoliticaFactu.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_hastaPoliticaFactuBusqueda= new JButtonMe();
		this.jButtonfecha_hastaPoliticaFactuBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_hastaPoliticaFactuBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_hastaPoliticaFactuBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_hastaPoliticaFactuBusqueda.setText("U");
		this.jButtonfecha_hastaPoliticaFactuBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_hastaPoliticaFactuBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_hastaPoliticaFactuBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_hastaPoliticaFactu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_hastaPoliticaFactu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_hastaPoliticaFactuBusqueda"));

		if(this.politicafactuSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_hastaPoliticaFactuBusqueda.setVisible(false);		}


					
		this.jLabelporcentajePoliticaFactu = new JLabelMe();
		this.jLabelporcentajePoliticaFactu.setText(""+PoliticaFactuConstantesFunciones.LABEL_PORCENTAJE+" : *");
		this.jLabelporcentajePoliticaFactu.setToolTipText("Porcentaje");
		this.jLabelporcentajePoliticaFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajePoliticaFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajePoliticaFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentajePoliticaFactu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentajePoliticaFactu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentajePoliticaFactu.setToolTipText(PoliticaFactuConstantesFunciones.LABEL_PORCENTAJE);
		this.gridaBagLayoutPoliticaFactu = new GridBagLayout();
		this.jPanelporcentajePoliticaFactu.setLayout(this.gridaBagLayoutPoliticaFactu);


		jTextFieldporcentajePoliticaFactu= new JTextFieldMe();
		jTextFieldporcentajePoliticaFactu.setEnabled(false);
		jTextFieldporcentajePoliticaFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajePoliticaFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajePoliticaFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentajePoliticaFactu,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentajePoliticaFactu.setText("0.0");

		this.jButtonporcentajePoliticaFactuBusqueda= new JButtonMe();
		this.jButtonporcentajePoliticaFactuBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajePoliticaFactuBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajePoliticaFactuBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentajePoliticaFactuBusqueda.setText("U");
		this.jButtonporcentajePoliticaFactuBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentajePoliticaFactuBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentajePoliticaFactuBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentajePoliticaFactu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentajePoliticaFactu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentajePoliticaFactuBusqueda"));

		if(this.politicafactuSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentajePoliticaFactuBusqueda.setVisible(false);		}


					
		this.jLabelvalorPoliticaFactu = new JLabelMe();
		this.jLabelvalorPoliticaFactu.setText(""+PoliticaFactuConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorPoliticaFactu.setToolTipText("Valor");
		this.jLabelvalorPoliticaFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorPoliticaFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorPoliticaFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorPoliticaFactu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorPoliticaFactu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorPoliticaFactu.setToolTipText(PoliticaFactuConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutPoliticaFactu = new GridBagLayout();
		this.jPanelvalorPoliticaFactu.setLayout(this.gridaBagLayoutPoliticaFactu);


		jTextFieldvalorPoliticaFactu= new JTextFieldMe();
		jTextFieldvalorPoliticaFactu.setEnabled(false);
		jTextFieldvalorPoliticaFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorPoliticaFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorPoliticaFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorPoliticaFactu,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorPoliticaFactu.setText("0.0");

		this.jButtonvalorPoliticaFactuBusqueda= new JButtonMe();
		this.jButtonvalorPoliticaFactuBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorPoliticaFactuBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorPoliticaFactuBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorPoliticaFactuBusqueda.setText("U");
		this.jButtonvalorPoliticaFactuBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorPoliticaFactuBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorPoliticaFactuBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorPoliticaFactu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorPoliticaFactu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorPoliticaFactuBusqueda"));

		if(this.politicafactuSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorPoliticaFactuBusqueda.setVisible(false);		}


					
		this.jLabelcon_banco_clientePoliticaFactu = new JLabelMe();
		this.jLabelcon_banco_clientePoliticaFactu.setText(""+PoliticaFactuConstantesFunciones.LABEL_CONBANCOCLIENTE+" : *");
		this.jLabelcon_banco_clientePoliticaFactu.setToolTipText("Con Banco Cliente");
		this.jLabelcon_banco_clientePoliticaFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_banco_clientePoliticaFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_banco_clientePoliticaFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_banco_clientePoliticaFactu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_banco_clientePoliticaFactu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_banco_clientePoliticaFactu.setToolTipText(PoliticaFactuConstantesFunciones.LABEL_CONBANCOCLIENTE);
		this.gridaBagLayoutPoliticaFactu = new GridBagLayout();
		this.jPanelcon_banco_clientePoliticaFactu.setLayout(this.gridaBagLayoutPoliticaFactu);


		jCheckBoxcon_banco_clientePoliticaFactu= new JCheckBoxMe();
		jCheckBoxcon_banco_clientePoliticaFactu.setEnabled(false);

		jCheckBoxcon_banco_clientePoliticaFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_banco_clientePoliticaFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_banco_clientePoliticaFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_banco_clientePoliticaFactu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_banco_clientePoliticaFactuBusqueda= new JButtonMe();
		this.jButtoncon_banco_clientePoliticaFactuBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_banco_clientePoliticaFactuBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_banco_clientePoliticaFactuBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_banco_clientePoliticaFactuBusqueda.setText("U");
		this.jButtoncon_banco_clientePoliticaFactuBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_banco_clientePoliticaFactuBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_banco_clientePoliticaFactuBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_banco_clientePoliticaFactu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_banco_clientePoliticaFactu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_banco_clientePoliticaFactuBusqueda"));

		if(this.politicafactuSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_banco_clientePoliticaFactuBusqueda.setVisible(false);		}


					
		this.jLabelcon_banco_productoPoliticaFactu = new JLabelMe();
		this.jLabelcon_banco_productoPoliticaFactu.setText(""+PoliticaFactuConstantesFunciones.LABEL_CONBANCOPRODUCTO+" : *");
		this.jLabelcon_banco_productoPoliticaFactu.setToolTipText("Con Banco Producto");
		this.jLabelcon_banco_productoPoliticaFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_banco_productoPoliticaFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_banco_productoPoliticaFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_banco_productoPoliticaFactu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_banco_productoPoliticaFactu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_banco_productoPoliticaFactu.setToolTipText(PoliticaFactuConstantesFunciones.LABEL_CONBANCOPRODUCTO);
		this.gridaBagLayoutPoliticaFactu = new GridBagLayout();
		this.jPanelcon_banco_productoPoliticaFactu.setLayout(this.gridaBagLayoutPoliticaFactu);


		jCheckBoxcon_banco_productoPoliticaFactu= new JCheckBoxMe();
		jCheckBoxcon_banco_productoPoliticaFactu.setEnabled(false);

		jCheckBoxcon_banco_productoPoliticaFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_banco_productoPoliticaFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_banco_productoPoliticaFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_banco_productoPoliticaFactu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_banco_productoPoliticaFactuBusqueda= new JButtonMe();
		this.jButtoncon_banco_productoPoliticaFactuBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_banco_productoPoliticaFactuBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_banco_productoPoliticaFactuBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_banco_productoPoliticaFactuBusqueda.setText("U");
		this.jButtoncon_banco_productoPoliticaFactuBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_banco_productoPoliticaFactuBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_banco_productoPoliticaFactuBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_banco_productoPoliticaFactu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_banco_productoPoliticaFactu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_banco_productoPoliticaFactuBusqueda"));

		if(this.politicafactuSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_banco_productoPoliticaFactuBusqueda.setVisible(false);		}


					
		this.jLabeles_activoPoliticaFactu = new JLabelMe();
		this.jLabeles_activoPoliticaFactu.setText(""+PoliticaFactuConstantesFunciones.LABEL_ESACTIVO+" : *");
		this.jLabeles_activoPoliticaFactu.setToolTipText("Es Activo");
		this.jLabeles_activoPoliticaFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_activoPoliticaFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_activoPoliticaFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_activoPoliticaFactu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_activoPoliticaFactu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_activoPoliticaFactu.setToolTipText(PoliticaFactuConstantesFunciones.LABEL_ESACTIVO);
		this.gridaBagLayoutPoliticaFactu = new GridBagLayout();
		this.jPaneles_activoPoliticaFactu.setLayout(this.gridaBagLayoutPoliticaFactu);


		jCheckBoxes_activoPoliticaFactu= new JCheckBoxMe();
		jCheckBoxes_activoPoliticaFactu.setEnabled(false);

		jCheckBoxes_activoPoliticaFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_activoPoliticaFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_activoPoliticaFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_activoPoliticaFactu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_activoPoliticaFactuBusqueda= new JButtonMe();
		this.jButtones_activoPoliticaFactuBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_activoPoliticaFactuBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_activoPoliticaFactuBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_activoPoliticaFactuBusqueda.setText("U");
		this.jButtones_activoPoliticaFactuBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_activoPoliticaFactuBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_activoPoliticaFactuBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_activoPoliticaFactu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_activoPoliticaFactu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_activoPoliticaFactuBusqueda"));

		if(this.politicafactuSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_activoPoliticaFactuBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysPoliticaFactu() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaPoliticaFactu = new JLabelMe();
		this.jLabelid_empresaPoliticaFactu.setText(""+PoliticaFactuConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaPoliticaFactu.setToolTipText("Empresa");
		this.jLabelid_empresaPoliticaFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPoliticaFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPoliticaFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaPoliticaFactu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaPoliticaFactu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaPoliticaFactu.setToolTipText(PoliticaFactuConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutPoliticaFactu = new GridBagLayout();
		this.jPanelid_empresaPoliticaFactu.setLayout(this.gridaBagLayoutPoliticaFactu);


		jComboBoxid_empresaPoliticaFactu= new JComboBoxMe();
		jComboBoxid_empresaPoliticaFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPoliticaFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPoliticaFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaPoliticaFactu,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaPoliticaFactu.setEnabled(false);

		this.jButtonid_empresaPoliticaFactu= new JButtonMe();
		this.jButtonid_empresaPoliticaFactu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPoliticaFactu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPoliticaFactu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPoliticaFactu.setText("Buscar");
		this.jButtonid_empresaPoliticaFactu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaPoliticaFactu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPoliticaFactu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaPoliticaFactu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPoliticaFactu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPoliticaFactu"));

		this.jButtonid_empresaPoliticaFactuBusqueda= new JButtonMe();
		this.jButtonid_empresaPoliticaFactuBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPoliticaFactuBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPoliticaFactuBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPoliticaFactuBusqueda.setText("U");
		this.jButtonid_empresaPoliticaFactuBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaPoliticaFactuBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPoliticaFactuBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaPoliticaFactu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPoliticaFactu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPoliticaFactuBusqueda"));

		if(this.politicafactuSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaPoliticaFactuBusqueda.setVisible(false);		}

		this.jButtonid_empresaPoliticaFactuUpdate= new JButtonMe();
		this.jButtonid_empresaPoliticaFactuUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPoliticaFactuUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPoliticaFactuUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPoliticaFactuUpdate.setText("U");
		this.jButtonid_empresaPoliticaFactuUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaPoliticaFactuUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPoliticaFactuUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaPoliticaFactu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPoliticaFactu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPoliticaFactuUpdate"));



					
		this.jLabelid_sucursalPoliticaFactu = new JLabelMe();
		this.jLabelid_sucursalPoliticaFactu.setText(""+PoliticaFactuConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalPoliticaFactu.setToolTipText("Sucursal");
		this.jLabelid_sucursalPoliticaFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalPoliticaFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalPoliticaFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalPoliticaFactu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalPoliticaFactu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalPoliticaFactu.setToolTipText(PoliticaFactuConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutPoliticaFactu = new GridBagLayout();
		this.jPanelid_sucursalPoliticaFactu.setLayout(this.gridaBagLayoutPoliticaFactu);


		jComboBoxid_sucursalPoliticaFactu= new JComboBoxMe();
		jComboBoxid_sucursalPoliticaFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalPoliticaFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalPoliticaFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalPoliticaFactu,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalPoliticaFactu.setEnabled(false);

		this.jButtonid_sucursalPoliticaFactu= new JButtonMe();
		this.jButtonid_sucursalPoliticaFactu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalPoliticaFactu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalPoliticaFactu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalPoliticaFactu.setText("Buscar");
		this.jButtonid_sucursalPoliticaFactu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalPoliticaFactu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalPoliticaFactu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalPoliticaFactu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalPoliticaFactu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalPoliticaFactu"));

		this.jButtonid_sucursalPoliticaFactuBusqueda= new JButtonMe();
		this.jButtonid_sucursalPoliticaFactuBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPoliticaFactuBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPoliticaFactuBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalPoliticaFactuBusqueda.setText("U");
		this.jButtonid_sucursalPoliticaFactuBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalPoliticaFactuBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalPoliticaFactuBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalPoliticaFactu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalPoliticaFactu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalPoliticaFactuBusqueda"));

		if(this.politicafactuSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalPoliticaFactuBusqueda.setVisible(false);		}

		this.jButtonid_sucursalPoliticaFactuUpdate= new JButtonMe();
		this.jButtonid_sucursalPoliticaFactuUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPoliticaFactuUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPoliticaFactuUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalPoliticaFactuUpdate.setText("U");
		this.jButtonid_sucursalPoliticaFactuUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalPoliticaFactuUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalPoliticaFactuUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalPoliticaFactu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalPoliticaFactu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalPoliticaFactuUpdate"));



					
		this.jLabelid_productoPoliticaFactu = new JLabelMe();
		this.jLabelid_productoPoliticaFactu.setText(""+PoliticaFactuConstantesFunciones.LABEL_IDPRODUCTO+" : *");
		this.jLabelid_productoPoliticaFactu.setToolTipText("Producto");
		this.jLabelid_productoPoliticaFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoPoliticaFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoPoliticaFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_productoPoliticaFactu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_productoPoliticaFactu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_productoPoliticaFactu.setToolTipText(PoliticaFactuConstantesFunciones.LABEL_IDPRODUCTO);
		this.gridaBagLayoutPoliticaFactu = new GridBagLayout();
		this.jPanelid_productoPoliticaFactu.setLayout(this.gridaBagLayoutPoliticaFactu);


		jComboBoxid_productoPoliticaFactu= new JComboBoxMe();
		jComboBoxid_productoPoliticaFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoPoliticaFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoPoliticaFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoPoliticaFactu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_productoPoliticaFactu= new JButtonMe();
		this.jButtonid_productoPoliticaFactu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoPoliticaFactu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoPoliticaFactu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoPoliticaFactu.setText("Buscar");
		this.jButtonid_productoPoliticaFactu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_productoPoliticaFactu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoPoliticaFactu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_productoPoliticaFactu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoPoliticaFactu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoPoliticaFactu"));

		this.jButtonid_productoPoliticaFactuBusqueda= new JButtonMe();
		this.jButtonid_productoPoliticaFactuBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoPoliticaFactuBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoPoliticaFactuBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoPoliticaFactuBusqueda.setText("U");
		this.jButtonid_productoPoliticaFactuBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_productoPoliticaFactuBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoPoliticaFactuBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_productoPoliticaFactu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoPoliticaFactu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoPoliticaFactuBusqueda"));

		if(this.politicafactuSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_productoPoliticaFactuBusqueda.setVisible(false);		}

		this.jButtonid_productoPoliticaFactuUpdate= new JButtonMe();
		this.jButtonid_productoPoliticaFactuUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoPoliticaFactuUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoPoliticaFactuUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoPoliticaFactuUpdate.setText("U");
		this.jButtonid_productoPoliticaFactuUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_productoPoliticaFactuUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoPoliticaFactuUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_productoPoliticaFactu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoPoliticaFactu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoPoliticaFactuUpdate"));



					
		this.jLabelid_grupo_clientePoliticaFactu = new JLabelMe();
		this.jLabelid_grupo_clientePoliticaFactu.setText(""+PoliticaFactuConstantesFunciones.LABEL_IDGRUPOCLIENTE+" : *");
		this.jLabelid_grupo_clientePoliticaFactu.setToolTipText("Grupo Cliente");
		this.jLabelid_grupo_clientePoliticaFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_grupo_clientePoliticaFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_grupo_clientePoliticaFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_grupo_clientePoliticaFactu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_grupo_clientePoliticaFactu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_grupo_clientePoliticaFactu.setToolTipText(PoliticaFactuConstantesFunciones.LABEL_IDGRUPOCLIENTE);
		this.gridaBagLayoutPoliticaFactu = new GridBagLayout();
		this.jPanelid_grupo_clientePoliticaFactu.setLayout(this.gridaBagLayoutPoliticaFactu);


		jComboBoxid_grupo_clientePoliticaFactu= new JComboBoxMe();
		jComboBoxid_grupo_clientePoliticaFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_clientePoliticaFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_clientePoliticaFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_grupo_clientePoliticaFactu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_grupo_clientePoliticaFactu= new JButtonMe();
		this.jButtonid_grupo_clientePoliticaFactu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_grupo_clientePoliticaFactu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_grupo_clientePoliticaFactu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_grupo_clientePoliticaFactu.setText("Buscar");
		this.jButtonid_grupo_clientePoliticaFactu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_grupo_clientePoliticaFactu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_grupo_clientePoliticaFactu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_grupo_clientePoliticaFactu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_grupo_clientePoliticaFactu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_grupo_clientePoliticaFactu"));

		this.jButtonid_grupo_clientePoliticaFactuBusqueda= new JButtonMe();
		this.jButtonid_grupo_clientePoliticaFactuBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_grupo_clientePoliticaFactuBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_grupo_clientePoliticaFactuBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_grupo_clientePoliticaFactuBusqueda.setText("U");
		this.jButtonid_grupo_clientePoliticaFactuBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_grupo_clientePoliticaFactuBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_grupo_clientePoliticaFactuBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_grupo_clientePoliticaFactu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_grupo_clientePoliticaFactu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_grupo_clientePoliticaFactuBusqueda"));

		if(this.politicafactuSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_grupo_clientePoliticaFactuBusqueda.setVisible(false);		}

		this.jButtonid_grupo_clientePoliticaFactuUpdate= new JButtonMe();
		this.jButtonid_grupo_clientePoliticaFactuUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_grupo_clientePoliticaFactuUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_grupo_clientePoliticaFactuUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_grupo_clientePoliticaFactuUpdate.setText("U");
		this.jButtonid_grupo_clientePoliticaFactuUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_grupo_clientePoliticaFactuUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_grupo_clientePoliticaFactuUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_grupo_clientePoliticaFactu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_grupo_clientePoliticaFactu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_grupo_clientePoliticaFactuUpdate"));



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
		//this.jInternalFrameDetallePoliticaFactu = new PoliticaFactuBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Politica Factu DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPoliticaFactu= new GridBagLayout();
		

		
		String sToolTipPoliticaFactu="";
		sToolTipPoliticaFactu=PoliticaFactuConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPoliticaFactu+="(Facturacion.PoliticaFactu)";
		}
		
		if(!this.politicafactuSessionBean.getEsGuardarRelacionado()) {
			sToolTipPoliticaFactu+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoPoliticaFactu = new JButtonMe();
		this.jButtonModificarPoliticaFactu = new JButtonMe();
        this.jButtonActualizarPoliticaFactu = new JButtonMe();
        this.jButtonEliminarPoliticaFactu = new JButtonMe();
        this.jButtonCancelarPoliticaFactu = new JButtonMe();
        this.jButtonGuardarCambiosPoliticaFactu = new JButtonMe();
		this.jButtonGuardarCambiosTablaPoliticaFactu = new JButtonMe();
		this.jButtonCerrarPoliticaFactu = new JButtonMe();
		
		this.jScrollPanelDatosPoliticaFactu = new JScrollPane();   
        this.jScrollPanelDatosEdicionPoliticaFactu = new JScrollPane();
		this.jScrollPanelDatosGeneralPoliticaFactu = new JScrollPane();
				
		
		
		this.jPanelCamposPoliticaFactu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosPoliticaFactu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesPoliticaFactu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioPoliticaFactu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Politica Factu";
		
		if(!this.politicafactuSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPoliticaFactu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Politica Factus" + this.sPath));
		} else {
			this.jScrollPanelDatosPoliticaFactu.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionPoliticaFactu.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralPoliticaFactu.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposPoliticaFactu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposPoliticaFactu.setName("jPanelCamposPoliticaFactu"); 

		this.jPanelCamposOcultosPoliticaFactu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosPoliticaFactu.setName("jPanelCamposOcultosPoliticaFactu"); 

        this.jPanelAccionesPoliticaFactu.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPoliticaFactu.setToolTipText("Acciones");
        this.jPanelAccionesPoliticaFactu.setName("Acciones"); 

		this.jPanelAccionesFormularioPoliticaFactu.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioPoliticaFactu.setToolTipText("Acciones");
        this.jPanelAccionesFormularioPoliticaFactu.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionPoliticaFactu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPoliticaFactu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPoliticaFactu, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposPoliticaFactu, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosPoliticaFactu, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioPoliticaFactu, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoPoliticaFactu.setText("Nuevo");
		this.jButtonModificarPoliticaFactu.setText("Editar");
        this.jButtonActualizarPoliticaFactu.setText("Actualizar");
        this.jButtonEliminarPoliticaFactu.setText("Eliminar");
        this.jButtonCancelarPoliticaFactu.setText("Cancelar");
        this.jButtonGuardarCambiosPoliticaFactu.setText("Guardar");
		this.jButtonGuardarCambiosTablaPoliticaFactu.setText("Guardar");
		this.jButtonCerrarPoliticaFactu.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPoliticaFactu,"nuevo_button","Nuevo",this.politicafactuSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarPoliticaFactu,"modificar_button","Editar",this.politicafactuSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarPoliticaFactu,"actualizar_button","Actualizar",this.politicafactuSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarPoliticaFactu,"eliminar_button","Eliminar",this.politicafactuSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarPoliticaFactu,"cancelar_button","Cancelar",this.politicafactuSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosPoliticaFactu,"guardarcambios_button","Guardar",this.politicafactuSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPoliticaFactu,"guardarcambiostabla_button","Guardar",this.politicafactuSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPoliticaFactu,"cerrar_button","Salir",this.politicafactuSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPoliticaFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarPoliticaFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosPoliticaFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPoliticaFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPoliticaFactu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarPoliticaFactu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarPoliticaFactu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarPoliticaFactu, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoPoliticaFactu.setToolTipText("Nuevo"+" "+PoliticaFactuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarPoliticaFactu.setToolTipText("Editar"+" "+PoliticaFactuConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarPoliticaFactu.setToolTipText("Actualizar"+" "+PoliticaFactuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarPoliticaFactu.setToolTipText("Eliminar)"+" "+PoliticaFactuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarPoliticaFactu.setToolTipText("Cancelar"+" "+PoliticaFactuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosPoliticaFactu.setToolTipText("Guardar"+" "+PoliticaFactuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaPoliticaFactu.setToolTipText("Guardar"+" "+PoliticaFactuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPoliticaFactu.setToolTipText("Salir"+" "+PoliticaFactuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPoliticaFactu";
		inputMap = this.jButtonNuevoPoliticaFactu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPoliticaFactu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPoliticaFactu"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarPoliticaFactu";
		inputMap = this.jButtonActualizarPoliticaFactu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarPoliticaFactu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarPoliticaFactu"));
		
		//ELIMINAR
		sMapKey = "EliminarPoliticaFactu";
		inputMap = this.jButtonEliminarPoliticaFactu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarPoliticaFactu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarPoliticaFactu"));
		
		//CANCELAR	
		sMapKey = "CancelarPoliticaFactu";
		inputMap = this.jButtonCancelarPoliticaFactu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarPoliticaFactu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarPoliticaFactu"));
		
		//CERRAR		
		sMapKey = "CerrarPoliticaFactu";
		inputMap = this.jButtonCerrarPoliticaFactu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPoliticaFactu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPoliticaFactu"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPoliticaFactu";
		inputMap = this.jButtonGuardarCambiosTablaPoliticaFactu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPoliticaFactu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPoliticaFactu"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoPoliticaFactu = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoPoliticaFactu.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoPoliticaFactu.setToolTipText("Nuevo PoliticaFactu");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoPoliticaFactu, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarPoliticaFactu = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarPoliticaFactu.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarPoliticaFactu.setToolTipText("Sin Cerrar Ventana PoliticaFactu");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarPoliticaFactu, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajePoliticaFactu = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajePoliticaFactu.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajePoliticaFactu.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajePoliticaFactu, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesPoliticaFactu = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPoliticaFactu.setText("Accion");
		this.jComboBoxTiposAccionesPoliticaFactu.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioPoliticaFactu = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioPoliticaFactu.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioPoliticaFactu.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesPoliticaFactu = new JLabelMe();
		
		this.jLabelAccionesPoliticaFactu.setText("Acciones");		
		this.jLabelAccionesPoliticaFactu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPoliticaFactu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPoliticaFactu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposPoliticaFactu();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysPoliticaFactu();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesPoliticaFactu=new JTabbedPane();
		this.jTabbedPaneRelacionesPoliticaFactu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesPoliticaFactu,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesPoliticaFactu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPoliticaFactu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPoliticaFactu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPoliticaFactu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioPoliticaFactu.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPoliticaFactu.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPoliticaFactu.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioPoliticaFactu, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposPoliticaFactu = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosPoliticaFactu = new GridBagLayout();
		
		this.jPanelCamposPoliticaFactu.setLayout(gridaBagLayoutCamposPoliticaFactu);
		this.jPanelCamposOcultosPoliticaFactu.setLayout(gridaBagLayoutCamposOcultosPoliticaFactu);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
	this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticaFactu.gridy = 0;
	this.gridBagConstraintsPoliticaFactu.gridx = 0;
	this.gridBagConstraintsPoliticaFactu.ipadx = 0;
	this.gridBagConstraintsPoliticaFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidPoliticaFactu.add(jLabelIdPoliticaFactu, this.gridBagConstraintsPoliticaFactu);



	this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
	this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticaFactu.gridy = 0;
	this.gridBagConstraintsPoliticaFactu.gridx = 1;
	this.gridBagConstraintsPoliticaFactu.ipadx = 0;
	this.gridBagConstraintsPoliticaFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidPoliticaFactu.add(jLabelidPoliticaFactu, this.gridBagConstraintsPoliticaFactu);


	this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
	this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticaFactu.gridy = 0;
	this.gridBagConstraintsPoliticaFactu.gridx = 0;
	this.gridBagConstraintsPoliticaFactu.ipadx = 0;
	this.gridBagConstraintsPoliticaFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaPoliticaFactu.add(jLabelid_empresaPoliticaFactu, this.gridBagConstraintsPoliticaFactu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
		//this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticaFactu.gridy = 0;
		this.gridBagConstraintsPoliticaFactu.gridx = 2;
		this.gridBagConstraintsPoliticaFactu.ipadx = 0;
		this.gridBagConstraintsPoliticaFactu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPoliticaFactu.add(jButtonid_empresaPoliticaFactuBusqueda, this.gridBagConstraintsPoliticaFactu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
		//this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticaFactu.gridy = 0;
		this.gridBagConstraintsPoliticaFactu.gridx = 3;
		this.gridBagConstraintsPoliticaFactu.ipadx = 0;
		this.gridBagConstraintsPoliticaFactu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPoliticaFactu.add(jButtonid_empresaPoliticaFactuUpdate, this.gridBagConstraintsPoliticaFactu);
	}

	this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
	this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticaFactu.gridy = 0;
	this.gridBagConstraintsPoliticaFactu.gridx = 1;
	this.gridBagConstraintsPoliticaFactu.ipadx = 0;
	this.gridBagConstraintsPoliticaFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaPoliticaFactu.add(jComboBoxid_empresaPoliticaFactu, this.gridBagConstraintsPoliticaFactu);


	this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
	this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticaFactu.gridy = 0;
	this.gridBagConstraintsPoliticaFactu.gridx = 0;
	this.gridBagConstraintsPoliticaFactu.ipadx = 0;
	this.gridBagConstraintsPoliticaFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalPoliticaFactu.add(jLabelid_sucursalPoliticaFactu, this.gridBagConstraintsPoliticaFactu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
		//this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticaFactu.gridy = 0;
		this.gridBagConstraintsPoliticaFactu.gridx = 2;
		this.gridBagConstraintsPoliticaFactu.ipadx = 0;
		this.gridBagConstraintsPoliticaFactu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalPoliticaFactu.add(jButtonid_sucursalPoliticaFactuBusqueda, this.gridBagConstraintsPoliticaFactu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
		//this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticaFactu.gridy = 0;
		this.gridBagConstraintsPoliticaFactu.gridx = 3;
		this.gridBagConstraintsPoliticaFactu.ipadx = 0;
		this.gridBagConstraintsPoliticaFactu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalPoliticaFactu.add(jButtonid_sucursalPoliticaFactuUpdate, this.gridBagConstraintsPoliticaFactu);
	}

	this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
	this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticaFactu.gridy = 0;
	this.gridBagConstraintsPoliticaFactu.gridx = 1;
	this.gridBagConstraintsPoliticaFactu.ipadx = 0;
	this.gridBagConstraintsPoliticaFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalPoliticaFactu.add(jComboBoxid_sucursalPoliticaFactu, this.gridBagConstraintsPoliticaFactu);


	this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
	this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticaFactu.gridy = 0;
	this.gridBagConstraintsPoliticaFactu.gridx = 0;
	this.gridBagConstraintsPoliticaFactu.ipadx = 0;
	this.gridBagConstraintsPoliticaFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_productoPoliticaFactu.add(jLabelid_productoPoliticaFactu, this.gridBagConstraintsPoliticaFactu);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
	//this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticaFactu.gridy = 0;
	this.gridBagConstraintsPoliticaFactu.gridx = 2;
	this.gridBagConstraintsPoliticaFactu.ipadx = 0;
	this.gridBagConstraintsPoliticaFactu.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_productoPoliticaFactu.add(jButtonid_productoPoliticaFactu, this.gridBagConstraintsPoliticaFactu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
		//this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticaFactu.gridy = 0;
		this.gridBagConstraintsPoliticaFactu.gridx = 3;
		this.gridBagConstraintsPoliticaFactu.ipadx = 0;
		this.gridBagConstraintsPoliticaFactu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoPoliticaFactu.add(jButtonid_productoPoliticaFactuBusqueda, this.gridBagConstraintsPoliticaFactu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
		//this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticaFactu.gridy = 0;
		this.gridBagConstraintsPoliticaFactu.gridx = 4;
		this.gridBagConstraintsPoliticaFactu.ipadx = 0;
		this.gridBagConstraintsPoliticaFactu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoPoliticaFactu.add(jButtonid_productoPoliticaFactuUpdate, this.gridBagConstraintsPoliticaFactu);
	}

	this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
	this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticaFactu.gridy = 0;
	this.gridBagConstraintsPoliticaFactu.gridx = 1;
	this.gridBagConstraintsPoliticaFactu.ipadx = 0;
	this.gridBagConstraintsPoliticaFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_productoPoliticaFactu.add(jComboBoxid_productoPoliticaFactu, this.gridBagConstraintsPoliticaFactu);


	this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
	this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticaFactu.gridy = 0;
	this.gridBagConstraintsPoliticaFactu.gridx = 0;
	this.gridBagConstraintsPoliticaFactu.ipadx = 0;
	this.gridBagConstraintsPoliticaFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_grupo_clientePoliticaFactu.add(jLabelid_grupo_clientePoliticaFactu, this.gridBagConstraintsPoliticaFactu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
		//this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticaFactu.gridy = 0;
		this.gridBagConstraintsPoliticaFactu.gridx = 2;
		this.gridBagConstraintsPoliticaFactu.ipadx = 0;
		this.gridBagConstraintsPoliticaFactu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_grupo_clientePoliticaFactu.add(jButtonid_grupo_clientePoliticaFactuBusqueda, this.gridBagConstraintsPoliticaFactu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
		//this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticaFactu.gridy = 0;
		this.gridBagConstraintsPoliticaFactu.gridx = 3;
		this.gridBagConstraintsPoliticaFactu.ipadx = 0;
		this.gridBagConstraintsPoliticaFactu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_grupo_clientePoliticaFactu.add(jButtonid_grupo_clientePoliticaFactuUpdate, this.gridBagConstraintsPoliticaFactu);
	}

	this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
	this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticaFactu.gridy = 0;
	this.gridBagConstraintsPoliticaFactu.gridx = 1;
	this.gridBagConstraintsPoliticaFactu.ipadx = 0;
	this.gridBagConstraintsPoliticaFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_grupo_clientePoliticaFactu.add(jComboBoxid_grupo_clientePoliticaFactu, this.gridBagConstraintsPoliticaFactu);


	this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
	this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticaFactu.gridy = 0;
	this.gridBagConstraintsPoliticaFactu.gridx = 0;
	this.gridBagConstraintsPoliticaFactu.ipadx = 0;
	this.gridBagConstraintsPoliticaFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombrePoliticaFactu.add(jLabelnombrePoliticaFactu, this.gridBagConstraintsPoliticaFactu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
		//this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticaFactu.gridy = 0;
		this.gridBagConstraintsPoliticaFactu.gridx = 2;
		this.gridBagConstraintsPoliticaFactu.ipadx = 0;
		this.gridBagConstraintsPoliticaFactu.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombrePoliticaFactu.add(jButtonnombrePoliticaFactuBusqueda, this.gridBagConstraintsPoliticaFactu);
	}

	this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
	this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticaFactu.gridy = 0;
	this.gridBagConstraintsPoliticaFactu.gridx = 1;
	this.gridBagConstraintsPoliticaFactu.ipadx = 0;
	this.gridBagConstraintsPoliticaFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombrePoliticaFactu.add(jscrollPanenombrePoliticaFactu, this.gridBagConstraintsPoliticaFactu);


	this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
	this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticaFactu.gridy = 0;
	this.gridBagConstraintsPoliticaFactu.gridx = 0;
	this.gridBagConstraintsPoliticaFactu.ipadx = 0;
	this.gridBagConstraintsPoliticaFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_desdePoliticaFactu.add(jLabelfecha_desdePoliticaFactu, this.gridBagConstraintsPoliticaFactu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
		//this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticaFactu.gridy = 0;
		this.gridBagConstraintsPoliticaFactu.gridx = 2;
		this.gridBagConstraintsPoliticaFactu.ipadx = 0;
		this.gridBagConstraintsPoliticaFactu.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_desdePoliticaFactu.add(jButtonfecha_desdePoliticaFactuBusqueda, this.gridBagConstraintsPoliticaFactu);
	}

	this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
	this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticaFactu.gridy = 0;
	this.gridBagConstraintsPoliticaFactu.gridx = 1;
	this.gridBagConstraintsPoliticaFactu.ipadx = 0;
	this.gridBagConstraintsPoliticaFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_desdePoliticaFactu.add(jDateChooserfecha_desdePoliticaFactu, this.gridBagConstraintsPoliticaFactu);


	this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
	this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticaFactu.gridy = 0;
	this.gridBagConstraintsPoliticaFactu.gridx = 0;
	this.gridBagConstraintsPoliticaFactu.ipadx = 0;
	this.gridBagConstraintsPoliticaFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_hastaPoliticaFactu.add(jLabelfecha_hastaPoliticaFactu, this.gridBagConstraintsPoliticaFactu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
		//this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticaFactu.gridy = 0;
		this.gridBagConstraintsPoliticaFactu.gridx = 2;
		this.gridBagConstraintsPoliticaFactu.ipadx = 0;
		this.gridBagConstraintsPoliticaFactu.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_hastaPoliticaFactu.add(jButtonfecha_hastaPoliticaFactuBusqueda, this.gridBagConstraintsPoliticaFactu);
	}

	this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
	this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticaFactu.gridy = 0;
	this.gridBagConstraintsPoliticaFactu.gridx = 1;
	this.gridBagConstraintsPoliticaFactu.ipadx = 0;
	this.gridBagConstraintsPoliticaFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_hastaPoliticaFactu.add(jDateChooserfecha_hastaPoliticaFactu, this.gridBagConstraintsPoliticaFactu);


	this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
	this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticaFactu.gridy = 0;
	this.gridBagConstraintsPoliticaFactu.gridx = 0;
	this.gridBagConstraintsPoliticaFactu.ipadx = 0;
	this.gridBagConstraintsPoliticaFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentajePoliticaFactu.add(jLabelporcentajePoliticaFactu, this.gridBagConstraintsPoliticaFactu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
		//this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticaFactu.gridy = 0;
		this.gridBagConstraintsPoliticaFactu.gridx = 2;
		this.gridBagConstraintsPoliticaFactu.ipadx = 0;
		this.gridBagConstraintsPoliticaFactu.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentajePoliticaFactu.add(jButtonporcentajePoliticaFactuBusqueda, this.gridBagConstraintsPoliticaFactu);
	}

	this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
	this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticaFactu.gridy = 0;
	this.gridBagConstraintsPoliticaFactu.gridx = 1;
	this.gridBagConstraintsPoliticaFactu.ipadx = 0;
	this.gridBagConstraintsPoliticaFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentajePoliticaFactu.add(jTextFieldporcentajePoliticaFactu, this.gridBagConstraintsPoliticaFactu);


	this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
	this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticaFactu.gridy = 0;
	this.gridBagConstraintsPoliticaFactu.gridx = 0;
	this.gridBagConstraintsPoliticaFactu.ipadx = 0;
	this.gridBagConstraintsPoliticaFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalorPoliticaFactu.add(jLabelvalorPoliticaFactu, this.gridBagConstraintsPoliticaFactu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
		//this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticaFactu.gridy = 0;
		this.gridBagConstraintsPoliticaFactu.gridx = 2;
		this.gridBagConstraintsPoliticaFactu.ipadx = 0;
		this.gridBagConstraintsPoliticaFactu.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorPoliticaFactu.add(jButtonvalorPoliticaFactuBusqueda, this.gridBagConstraintsPoliticaFactu);
	}

	this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
	this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticaFactu.gridy = 0;
	this.gridBagConstraintsPoliticaFactu.gridx = 1;
	this.gridBagConstraintsPoliticaFactu.ipadx = 0;
	this.gridBagConstraintsPoliticaFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalorPoliticaFactu.add(jTextFieldvalorPoliticaFactu, this.gridBagConstraintsPoliticaFactu);


	this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
	this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticaFactu.gridy = 0;
	this.gridBagConstraintsPoliticaFactu.gridx = 0;
	this.gridBagConstraintsPoliticaFactu.ipadx = 0;
	this.gridBagConstraintsPoliticaFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_banco_clientePoliticaFactu.add(jLabelcon_banco_clientePoliticaFactu, this.gridBagConstraintsPoliticaFactu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
		//this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticaFactu.gridy = 0;
		this.gridBagConstraintsPoliticaFactu.gridx = 2;
		this.gridBagConstraintsPoliticaFactu.ipadx = 0;
		this.gridBagConstraintsPoliticaFactu.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_banco_clientePoliticaFactu.add(jButtoncon_banco_clientePoliticaFactuBusqueda, this.gridBagConstraintsPoliticaFactu);
	}

	this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
	this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticaFactu.gridy = 0;
	this.gridBagConstraintsPoliticaFactu.gridx = 1;
	this.gridBagConstraintsPoliticaFactu.ipadx = 0;
	this.gridBagConstraintsPoliticaFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_banco_clientePoliticaFactu.add(jCheckBoxcon_banco_clientePoliticaFactu, this.gridBagConstraintsPoliticaFactu);


	this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
	this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticaFactu.gridy = 0;
	this.gridBagConstraintsPoliticaFactu.gridx = 0;
	this.gridBagConstraintsPoliticaFactu.ipadx = 0;
	this.gridBagConstraintsPoliticaFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_banco_productoPoliticaFactu.add(jLabelcon_banco_productoPoliticaFactu, this.gridBagConstraintsPoliticaFactu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
		//this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticaFactu.gridy = 0;
		this.gridBagConstraintsPoliticaFactu.gridx = 2;
		this.gridBagConstraintsPoliticaFactu.ipadx = 0;
		this.gridBagConstraintsPoliticaFactu.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_banco_productoPoliticaFactu.add(jButtoncon_banco_productoPoliticaFactuBusqueda, this.gridBagConstraintsPoliticaFactu);
	}

	this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
	this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticaFactu.gridy = 0;
	this.gridBagConstraintsPoliticaFactu.gridx = 1;
	this.gridBagConstraintsPoliticaFactu.ipadx = 0;
	this.gridBagConstraintsPoliticaFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_banco_productoPoliticaFactu.add(jCheckBoxcon_banco_productoPoliticaFactu, this.gridBagConstraintsPoliticaFactu);


	this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
	this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticaFactu.gridy = 0;
	this.gridBagConstraintsPoliticaFactu.gridx = 0;
	this.gridBagConstraintsPoliticaFactu.ipadx = 0;
	this.gridBagConstraintsPoliticaFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_activoPoliticaFactu.add(jLabeles_activoPoliticaFactu, this.gridBagConstraintsPoliticaFactu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
		//this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticaFactu.gridy = 0;
		this.gridBagConstraintsPoliticaFactu.gridx = 2;
		this.gridBagConstraintsPoliticaFactu.ipadx = 0;
		this.gridBagConstraintsPoliticaFactu.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_activoPoliticaFactu.add(jButtones_activoPoliticaFactuBusqueda, this.gridBagConstraintsPoliticaFactu);
	}

	this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
	this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticaFactu.gridy = 0;
	this.gridBagConstraintsPoliticaFactu.gridx = 1;
	this.gridBagConstraintsPoliticaFactu.ipadx = 0;
	this.gridBagConstraintsPoliticaFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_activoPoliticaFactu.add(jCheckBoxes_activoPoliticaFactu, this.gridBagConstraintsPoliticaFactu);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
	this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPoliticaFactu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPoliticaFactu.gridy = iYPanelCamposPoliticaFactu;
	this.gridBagConstraintsPoliticaFactu.gridx = iXPanelCamposPoliticaFactu++;
	this.gridBagConstraintsPoliticaFactu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPoliticaFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPoliticaFactu.add(this.jPanelidPoliticaFactu, this.gridBagConstraintsPoliticaFactu);



	if(iXPanelCamposPoliticaFactu % 2==0) {
		iXPanelCamposPoliticaFactu=0;
		iYPanelCamposPoliticaFactu++;
	}
	this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
	this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPoliticaFactu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPoliticaFactu.gridy = iYPanelCamposPoliticaFactu;
	this.gridBagConstraintsPoliticaFactu.gridx = iXPanelCamposPoliticaFactu++;
	this.gridBagConstraintsPoliticaFactu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPoliticaFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPoliticaFactu.add(this.jPanelid_productoPoliticaFactu, this.gridBagConstraintsPoliticaFactu);



	if(iXPanelCamposPoliticaFactu % 2==0) {
		iXPanelCamposPoliticaFactu=0;
		iYPanelCamposPoliticaFactu++;
	}
	this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
	this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPoliticaFactu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPoliticaFactu.gridy = iYPanelCamposPoliticaFactu;
	this.gridBagConstraintsPoliticaFactu.gridx = iXPanelCamposPoliticaFactu++;
	this.gridBagConstraintsPoliticaFactu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPoliticaFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPoliticaFactu.add(this.jPanelid_grupo_clientePoliticaFactu, this.gridBagConstraintsPoliticaFactu);



	if(iXPanelCamposPoliticaFactu % 2==0) {
		iXPanelCamposPoliticaFactu=0;
		iYPanelCamposPoliticaFactu++;
	}
	this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
	this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPoliticaFactu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPoliticaFactu.gridy = iYPanelCamposPoliticaFactu;
	this.gridBagConstraintsPoliticaFactu.gridx = iXPanelCamposPoliticaFactu++;
	this.gridBagConstraintsPoliticaFactu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPoliticaFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPoliticaFactu.add(this.jPanelnombrePoliticaFactu, this.gridBagConstraintsPoliticaFactu);



	if(iXPanelCamposPoliticaFactu % 2==0) {
		iXPanelCamposPoliticaFactu=0;
		iYPanelCamposPoliticaFactu++;
	}
	this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
	this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPoliticaFactu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPoliticaFactu.gridy = iYPanelCamposPoliticaFactu;
	this.gridBagConstraintsPoliticaFactu.gridx = iXPanelCamposPoliticaFactu++;
	this.gridBagConstraintsPoliticaFactu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPoliticaFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPoliticaFactu.add(this.jPanelfecha_desdePoliticaFactu, this.gridBagConstraintsPoliticaFactu);



	if(iXPanelCamposPoliticaFactu % 2==0) {
		iXPanelCamposPoliticaFactu=0;
		iYPanelCamposPoliticaFactu++;
	}
	this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
	this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPoliticaFactu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPoliticaFactu.gridy = iYPanelCamposPoliticaFactu;
	this.gridBagConstraintsPoliticaFactu.gridx = iXPanelCamposPoliticaFactu++;
	this.gridBagConstraintsPoliticaFactu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPoliticaFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPoliticaFactu.add(this.jPanelfecha_hastaPoliticaFactu, this.gridBagConstraintsPoliticaFactu);



	if(iXPanelCamposPoliticaFactu % 2==0) {
		iXPanelCamposPoliticaFactu=0;
		iYPanelCamposPoliticaFactu++;
	}
	this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
	this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPoliticaFactu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPoliticaFactu.gridy = iYPanelCamposPoliticaFactu;
	this.gridBagConstraintsPoliticaFactu.gridx = iXPanelCamposPoliticaFactu++;
	this.gridBagConstraintsPoliticaFactu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPoliticaFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPoliticaFactu.add(this.jPanelporcentajePoliticaFactu, this.gridBagConstraintsPoliticaFactu);



	if(iXPanelCamposPoliticaFactu % 2==0) {
		iXPanelCamposPoliticaFactu=0;
		iYPanelCamposPoliticaFactu++;
	}
	this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
	this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPoliticaFactu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPoliticaFactu.gridy = iYPanelCamposPoliticaFactu;
	this.gridBagConstraintsPoliticaFactu.gridx = iXPanelCamposPoliticaFactu++;
	this.gridBagConstraintsPoliticaFactu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPoliticaFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPoliticaFactu.add(this.jPanelvalorPoliticaFactu, this.gridBagConstraintsPoliticaFactu);



	if(iXPanelCamposPoliticaFactu % 2==0) {
		iXPanelCamposPoliticaFactu=0;
		iYPanelCamposPoliticaFactu++;
	}
	this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
	this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPoliticaFactu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPoliticaFactu.gridy = iYPanelCamposPoliticaFactu;
	this.gridBagConstraintsPoliticaFactu.gridx = iXPanelCamposPoliticaFactu++;
	this.gridBagConstraintsPoliticaFactu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPoliticaFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPoliticaFactu.add(this.jPanelcon_banco_clientePoliticaFactu, this.gridBagConstraintsPoliticaFactu);



	if(iXPanelCamposPoliticaFactu % 2==0) {
		iXPanelCamposPoliticaFactu=0;
		iYPanelCamposPoliticaFactu++;
	}
	this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
	this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPoliticaFactu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPoliticaFactu.gridy = iYPanelCamposPoliticaFactu;
	this.gridBagConstraintsPoliticaFactu.gridx = iXPanelCamposPoliticaFactu++;
	this.gridBagConstraintsPoliticaFactu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPoliticaFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPoliticaFactu.add(this.jPanelcon_banco_productoPoliticaFactu, this.gridBagConstraintsPoliticaFactu);



	if(iXPanelCamposPoliticaFactu % 2==0) {
		iXPanelCamposPoliticaFactu=0;
		iYPanelCamposPoliticaFactu++;
	}
	this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
	this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPoliticaFactu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPoliticaFactu.gridy = iYPanelCamposPoliticaFactu;
	this.gridBagConstraintsPoliticaFactu.gridx = iXPanelCamposPoliticaFactu++;
	this.gridBagConstraintsPoliticaFactu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPoliticaFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPoliticaFactu.add(this.jPaneles_activoPoliticaFactu, this.gridBagConstraintsPoliticaFactu);



	if(iXPanelCamposPoliticaFactu % 2==0) {
		iXPanelCamposPoliticaFactu=0;
		iYPanelCamposPoliticaFactu++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
	this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPoliticaFactu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPoliticaFactu.gridy = iYPanelCamposOcultosPoliticaFactu;
	this.gridBagConstraintsPoliticaFactu.gridx = iXPanelCamposOcultosPoliticaFactu++;
	this.gridBagConstraintsPoliticaFactu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPoliticaFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPoliticaFactu.add(this.jPanelid_empresaPoliticaFactu, this.gridBagConstraintsPoliticaFactu);



	if(iXPanelCamposOcultosPoliticaFactu % 2==0) {
		iXPanelCamposOcultosPoliticaFactu=0;
		iYPanelCamposOcultosPoliticaFactu++;
	}
	this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
	this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPoliticaFactu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPoliticaFactu.gridy = iYPanelCamposOcultosPoliticaFactu;
	this.gridBagConstraintsPoliticaFactu.gridx = iXPanelCamposOcultosPoliticaFactu++;
	this.gridBagConstraintsPoliticaFactu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPoliticaFactu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPoliticaFactu.add(this.jPanelid_sucursalPoliticaFactu, this.gridBagConstraintsPoliticaFactu);



	if(iXPanelCamposOcultosPoliticaFactu % 2==0) {
		iXPanelCamposOcultosPoliticaFactu=0;
		iYPanelCamposOcultosPoliticaFactu++;
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
			
		GridBagLayout gridaBagLayoutAccionesPoliticaFactu= new GridBagLayout();
		this.jPanelAccionesPoliticaFactu.setLayout(gridaBagLayoutAccionesPoliticaFactu);
		
		GridBagLayout gridaBagLayoutAccionesFormularioPoliticaFactu= new GridBagLayout();
		this.jPanelAccionesFormularioPoliticaFactu.setLayout(gridaBagLayoutAccionesFormularioPoliticaFactu);
		
		this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
		this.gridBagConstraintsPoliticaFactu.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPoliticaFactu.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPoliticaFactu.add(this.jComboBoxTiposAccionesFormularioPoliticaFactu, this.gridBagConstraintsPoliticaFactu);

		this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
		this.gridBagConstraintsPoliticaFactu.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPoliticaFactu.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPoliticaFactu.add(this.jCheckBoxPostAccionNuevoPoliticaFactu, this.gridBagConstraintsPoliticaFactu);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.politicafactuSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
			this.gridBagConstraintsPoliticaFactu.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPoliticaFactu.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPoliticaFactu.add(this.jCheckBoxPostAccionSinCerrarPoliticaFactu, this.gridBagConstraintsPoliticaFactu);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.politicafactuSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.politicafactuSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
			this.gridBagConstraintsPoliticaFactu.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPoliticaFactu.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPoliticaFactu.add(this.jCheckBoxPostAccionSinMensajePoliticaFactu, this.gridBagConstraintsPoliticaFactu);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
		this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPoliticaFactu.gridy = 0;
		this.gridBagConstraintsPoliticaFactu.gridx = iPosXAccion++;
			
		this.jPanelAccionesPoliticaFactu.add(this.jButtonModificarPoliticaFactu, this.gridBagConstraintsPoliticaFactu);							

		this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
		this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPoliticaFactu.gridy = 0;
		this.gridBagConstraintsPoliticaFactu.gridx =iPosXAccion++;
			
		this.jPanelAccionesPoliticaFactu.add(this.jButtonEliminarPoliticaFactu, this.gridBagConstraintsPoliticaFactu);
		
			
		this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
		this.gridBagConstraintsPoliticaFactu.gridy = 0;		
		this.gridBagConstraintsPoliticaFactu.gridx = iPosXAccion++;
		
		this.jPanelAccionesPoliticaFactu.add(this.jButtonActualizarPoliticaFactu, this.gridBagConstraintsPoliticaFactu);


		this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
		this.gridBagConstraintsPoliticaFactu.gridy = 0;		
		this.gridBagConstraintsPoliticaFactu.gridx = iPosXAccion++;
		
		this.jPanelAccionesPoliticaFactu.add(this.jButtonGuardarCambiosPoliticaFactu, this.gridBagConstraintsPoliticaFactu);	
		
		this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
		this.gridBagConstraintsPoliticaFactu.gridy = 0;		
		this.gridBagConstraintsPoliticaFactu.gridx =iPosXAccion++;
		
		this.jPanelAccionesPoliticaFactu.add(this.jButtonCancelarPoliticaFactu, this.gridBagConstraintsPoliticaFactu);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPoliticaFactu = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPoliticaFactu);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.politicafactuSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();						
			this.gridBagConstraintsPoliticaFactu.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPoliticaFactu.gridx = 0;		
			//this.gridBagConstraintsPoliticaFactu.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPoliticaFactu.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPoliticaFactu.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
		this.gridBagConstraintsPoliticaFactu.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPoliticaFactu.gridx =0;
		this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPoliticaFactu.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPoliticaFactu, this.gridBagConstraintsPoliticaFactu);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(PoliticaFactuJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetallePoliticaFactu = new PoliticaFactuBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Politica Factu DATOS");
			
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
			
	        //this.setTitle("[FOR] - Politica Factu DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Politica Factu Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			PoliticaFactuModel politicafactuModel=new PoliticaFactuModel(this);
			
			//SI USARA CLASE INTERNA
			//PoliticaFactuModel.PoliticaFactuFocusTraversalPolicy politicafactuFocusTraversalPolicy = politicafactuModel.new PoliticaFactuFocusTraversalPolicy(this);
			
			//politicafactuFocusTraversalPolicy.setpoliticafactuJInternalFrame(this);
			
			this.setFocusTraversalPolicy(politicafactuModel);
			
			
			this.jContentPaneDetallePoliticaFactu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetallePoliticaFactu = new GridBagLayout();	
			this.jContentPaneDetallePoliticaFactu.setLayout(gridaBagLayoutDetallePoliticaFactu);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPoliticaFactu = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
				this.gridBagConstraintsPoliticaFactu.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsPoliticaFactu.gridx = 0;
					
				
				this.jContentPaneDetallePoliticaFactu.add(jTtoolBarDetallePoliticaFactu, gridBagConstraintsPoliticaFactu);								
				
}
			
			this.jScrollPanelDatosEdicionPoliticaFactu=   new JScrollPane(jContentPaneDetallePoliticaFactu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPoliticaFactu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPoliticaFactu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPoliticaFactu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralPoliticaFactu=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPoliticaFactu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPoliticaFactu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPoliticaFactu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
			
			
	        this.gridBagConstraintsPoliticaFactu.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsPoliticaFactu.gridx = 0;
	        
			this.jContentPaneDetallePoliticaFactu.add(jPanelCamposPoliticaFactu, gridBagConstraintsPoliticaFactu);
			
			
			
			
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
						&& politicafactuSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.politicafactuSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsPoliticaFactu= new GridBagConstraints();
						this.gridBagConstraintsPoliticaFactu.gridy = iGridyRelaciones++;
						this.gridBagConstraintsPoliticaFactu.gridx = 0;
						this.jContentPaneDetallePoliticaFactu.add(this.jTabbedPaneRelacionesPoliticaFactu, this.gridBagConstraintsPoliticaFactu);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesPoliticaFactu.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosPoliticaFactu.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
					this.gridBagConstraintsPoliticaFactu.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsPoliticaFactu.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsPoliticaFactu.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsPoliticaFactu.gridx = 0;
					
				
					this.jContentPaneDetallePoliticaFactu.add(jPanelCamposOcultosPoliticaFactu, gridBagConstraintsPoliticaFactu);
				
					this.jPanelCamposOcultosPoliticaFactu.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
			this.gridBagConstraintsPoliticaFactu.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsPoliticaFactu.gridx = 0;
	        this.gridBagConstraintsPoliticaFactu.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetallePoliticaFactu.add(this.jPanelAccionesFormularioPoliticaFactu, this.gridBagConstraintsPoliticaFactu);							
			
			
			
			this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
	        this.gridBagConstraintsPoliticaFactu.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsPoliticaFactu.gridx = 0;
	        
			
			this.jContentPaneDetallePoliticaFactu.add(this.jPanelAccionesPoliticaFactu, this.gridBagConstraintsPoliticaFactu);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionPoliticaFactu);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionPoliticaFactu=   new JScrollPane(this.jPanelCamposPoliticaFactu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPoliticaFactu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPoliticaFactu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPoliticaFactu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
			this.gridBagConstraintsPoliticaFactu.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsPoliticaFactu.gridx = 0;
			this.gridBagConstraintsPoliticaFactu.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsPoliticaFactu.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsPoliticaFactu.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionPoliticaFactu, this.gridBagConstraintsPoliticaFactu);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
			this.gridBagConstraintsPoliticaFactu.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPoliticaFactu.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioPoliticaFactu, this.gridBagConstraintsPoliticaFactu);			
			
			this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
			this.gridBagConstraintsPoliticaFactu.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPoliticaFactu.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesPoliticaFactu, this.gridBagConstraintsPoliticaFactu);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
		this.gridBagConstraintsPoliticaFactu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPoliticaFactu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPoliticaFactu, this.gridBagConstraintsPoliticaFactu);
			
			
		this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
		this.gridBagConstraintsPoliticaFactu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPoliticaFactu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPoliticaFactu, this.gridBagConstraintsPoliticaFactu);
		
			
		this.gridBagConstraintsPoliticaFactu = new GridBagConstraints();
		this.gridBagConstraintsPoliticaFactu.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPoliticaFactu.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPoliticaFactu, this.gridBagConstraintsPoliticaFactu);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralPoliticaFactu;//jContentPane;
		
		return jScrollPanelDatosEdicionPoliticaFactu;
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
