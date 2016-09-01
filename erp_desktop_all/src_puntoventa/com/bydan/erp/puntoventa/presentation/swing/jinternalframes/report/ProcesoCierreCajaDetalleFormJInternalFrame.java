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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.puntoventa.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.puntoventa.business.entity.report.*;
import com.bydan.erp.puntoventa.util.report.ProcesoCierreCajaConstantesFunciones;

import com.bydan.erp.puntoventa.business.logic.report.*;
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
public class ProcesoCierreCajaDetalleFormJInternalFrame extends ProcesoCierreCajaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleProcesoCierreCaja;
	
	protected JMenuBar jmenuBarDetalleProcesoCierreCaja;
	
	protected JMenu jmenuDetalleProcesoCierreCaja;
	protected JMenu jmenuDetalleArchivoProcesoCierreCaja;
	protected JMenu jmenuDetalleAccionesProcesoCierreCaja;
	protected JMenu jmenuDetalleDatosProcesoCierreCaja;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleProcesoCierreCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProcesoCierreCaja;	
	protected GridBagConstraints gridBagConstraintsProcesoCierreCaja;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ProcesoCierreCajaBeanSwingJInternalFrameAdditional jInternalFrameDetalleProcesoCierreCaja;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";

	protected CajaBeanSwingJInternalFrame cajaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_caja="";
	
	public ProcesoCierreCajaSessionBean procesocierrecajaSessionBean;
	
	
	
	
	public UsuarioSessionBean usuarioSessionBean;
	public CajaSessionBean cajaSessionBean;	
	
	public ProcesoCierreCajaLogic procesocierrecajaLogic;
	
	public JScrollPane jScrollPanelDatosProcesoCierreCaja;
	public JScrollPane jScrollPanelDatosEdicionProcesoCierreCaja;
	public JScrollPane jScrollPanelDatosGeneralProcesoCierreCaja;
	
	protected JPanel jPanelCamposProcesoCierreCaja;    
	protected JPanel jPanelCamposOcultosProcesoCierreCaja;    	
	protected JPanel jPanelAccionesProcesoCierreCaja;
	protected JPanel jPanelAccionesFormularioProcesoCierreCaja;
    
	
	
	protected Integer iXPanelCamposProcesoCierreCaja=0;
	protected Integer iYPanelCamposProcesoCierreCaja=0;
	
	protected Integer iXPanelCamposOcultosProcesoCierreCaja=0;
	protected Integer iYPanelCamposOcultosProcesoCierreCaja=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoProcesoCierreCaja;
	public JButton jButtonModificarProcesoCierreCaja;
	public JButton jButtonActualizarProcesoCierreCaja;
    public JButton jButtonEliminarProcesoCierreCaja;
	public JButton jButtonCancelarProcesoCierreCaja;
    public JButton jButtonGuardarCambiosProcesoCierreCaja;
	public JButton jButtonGuardarCambiosTablaProcesoCierreCaja;
	protected JButton jButtonCerrarProcesoCierreCaja;
	
	
	protected JButton jButtonProcesarInformacionProcesoCierreCaja;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoProcesoCierreCaja;
	protected JCheckBox jCheckBoxPostAccionSinCerrarProcesoCierreCaja;
	protected JCheckBox jCheckBoxPostAccionSinMensajeProcesoCierreCaja;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProcesoCierreCaja;
	protected JButton jButtonModificarToolBarProcesoCierreCaja;
	protected JButton jButtonActualizarToolBarProcesoCierreCaja;
    protected JButton jButtonEliminarToolBarProcesoCierreCaja;
	protected JButton jButtonCancelarToolBarProcesoCierreCaja;
    protected JButton jButtonGuardarCambiosToolBarProcesoCierreCaja;
	protected JButton jButtonGuardarCambiosTablaToolBarProcesoCierreCaja;
	protected JButton jButtonMostrarOcultarTablaToolBarProcesoCierreCaja;
	protected JButton jButtonCerrarToolBarProcesoCierreCaja;
	
	protected JButton jButtonProcesarInformacionToolBarProcesoCierreCaja;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProcesoCierreCaja;
	protected JMenuItem jMenuItemModificarProcesoCierreCaja;
	protected JMenuItem jMenuItemActualizarProcesoCierreCaja;
    protected JMenuItem jMenuItemEliminarProcesoCierreCaja;
	protected JMenuItem jMenuItemCancelarProcesoCierreCaja;
    protected JMenuItem jMenuItemGuardarCambiosProcesoCierreCaja;
	protected JMenuItem jMenuItemGuardarCambiosTablaProcesoCierreCaja;
	protected JMenuItem jMenuItemCerrarProcesoCierreCaja;
	protected JMenuItem jMenuItemDetalleCerrarProcesoCierreCaja;
	protected JMenuItem jMenuItemDetalleMostarOcultarProcesoCierreCaja;
	
	protected JMenuItem jMenuItemProcesarInformacionProcesoCierreCaja;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProcesoCierreCaja;
	protected JMenuItem jMenuItemMostrarOcultarProcesoCierreCaja;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProcesoCierreCaja;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProcesoCierreCaja;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProcesoCierreCaja;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioProcesoCierreCaja;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidProcesoCierreCaja;
	public JLabel jLabelIdProcesoCierreCaja;
	public JTextFieldMe jTextFieldidProcesoCierreCaja;
	public JButton jButtonidProcesoCierreCajaBusqueda= new JButtonMe();

	public JPanel jPanelfechaProcesoCierreCaja;
	public JLabel jLabelfechaProcesoCierreCaja;
	//public JFormattedTextField jDateChooserfechaProcesoCierreCaja;

	public JDateChooser jDateChooserfechaProcesoCierreCaja;
	public JButton jButtonfechaProcesoCierreCajaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_usuarioProcesoCierreCaja;
	public JLabel jLabelid_usuarioProcesoCierreCaja;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_usuarioProcesoCierreCaja;
	public JButton jButtonid_usuarioProcesoCierreCaja= new JButtonMe();
	public JButton jButtonid_usuarioProcesoCierreCajaUpdate= new JButtonMe();
	public JButton jButtonid_usuarioProcesoCierreCajaBusqueda= new JButtonMe();

	public JPanel jPanelid_cajaProcesoCierreCaja;
	public JLabel jLabelid_cajaProcesoCierreCaja;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cajaProcesoCierreCaja;
	public JButton jButtonid_cajaProcesoCierreCaja= new JButtonMe();
	public JButton jButtonid_cajaProcesoCierreCajaUpdate= new JButtonMe();
	public JButton jButtonid_cajaProcesoCierreCajaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesProcesoCierreCaja;
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=false;
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
		
	public int iWidthFormulario=450;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=242;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ProcesoCierreCajaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposProcesoCierreCaja=new JPanel();
				this.jPanelAccionesFormularioProcesoCierreCaja=new JPanel();
				this.jmenuBarDetalleProcesoCierreCaja=new JMenuBar();
				this.jTtoolBarDetalleProcesoCierreCaja=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoCierreCajaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ProcesoCierreCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ProcesoCierreCajaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ProcesoCierreCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoCierreCajaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoCierreCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoCierreCajaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoCierreCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoCierreCajaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProcesoCierreCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarProcesoCierreCaja() {
		return this.jButtonActualizarToolBarProcesoCierreCaja;
	}
	
	public JButton getjButtonEliminarToolBarProcesoCierreCaja() {
		return this.jButtonEliminarToolBarProcesoCierreCaja;
	}
	
	public JButton getjButtonCancelarToolBarProcesoCierreCaja() {
		return this.jButtonCancelarToolBarProcesoCierreCaja;
	}		
	
	public JButton getjButtonProcesarInformacionProcesoCierreCaja() {
		return this.jButtonProcesarInformacionProcesoCierreCaja;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProcesoCierreCaja)	{
		this.jButtonProcesarInformacionProcesoCierreCaja = jButtonProcesarInformacionProcesoCierreCaja;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProcesoCierreCaja() {
		return this.jComboBoxTiposAccionesProcesoCierreCaja;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProcesoCierreCaja(
			JComboBox jComboBoxTiposRelacionesProcesoCierreCaja) {
		this.jComboBoxTiposRelacionesProcesoCierreCaja = jComboBoxTiposRelacionesProcesoCierreCaja;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProcesoCierreCaja(
			JComboBox jComboBoxTiposAccionesProcesoCierreCaja) {
		this.jComboBoxTiposAccionesProcesoCierreCaja = jComboBoxTiposAccionesProcesoCierreCaja;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioProcesoCierreCaja() {
		return this.jComboBoxTiposAccionesFormularioProcesoCierreCaja;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioProcesoCierreCaja(
			JComboBox jComboBoxTiposAccionesFormularioProcesoCierreCaja) {
		this.jComboBoxTiposAccionesFormularioProcesoCierreCaja = jComboBoxTiposAccionesFormularioProcesoCierreCaja;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.procesocierrecajaSessionBean=new ProcesoCierreCajaSessionBean();
		
		this.procesocierrecajaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesocierrecajaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.procesocierrecajaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProcesoCierreCajaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProcesoCierreCajaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProcesoCierreCajaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Proceso Cierre Caja MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.procesocierrecajaSessionBean.getEsGuardarRelacionado()) {
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
	
		ProcesoCierreCajaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleProcesoCierreCaja= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarProcesoCierreCaja=new JButtonMe();
				this.jButtonModificarToolBarProcesoCierreCaja=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarProcesoCierreCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarProcesoCierreCaja,this.jTtoolBarDetalleProcesoCierreCaja,
							"actualizar","actualizar","Actualizar"+" "+ProcesoCierreCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarProcesoCierreCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarProcesoCierreCaja,this.jTtoolBarDetalleProcesoCierreCaja,
							"eliminar","eliminar","Eliminar"+" "+ProcesoCierreCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarProcesoCierreCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarProcesoCierreCaja,this.jTtoolBarDetalleProcesoCierreCaja,
							"cancelar","cancelar","Cancelar"+" "+ProcesoCierreCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarProcesoCierreCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarProcesoCierreCaja,this.jTtoolBarDetalleProcesoCierreCaja,
							"guardarcambios","guardarcambios","Guardar"+" "+ProcesoCierreCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarProcesoCierreCaja,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarProcesoCierreCaja,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarProcesoCierreCaja,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleProcesoCierreCaja=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleProcesoCierreCaja=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoProcesoCierreCaja=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesProcesoCierreCaja=new JMenuMe("Acciones");
		this.jmenuDetalleDatosProcesoCierreCaja=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProcesoCierreCaja= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProcesoCierreCaja.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProcesoCierreCaja,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarProcesoCierreCaja= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarProcesoCierreCaja.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarProcesoCierreCaja,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarProcesoCierreCaja= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarProcesoCierreCaja.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarProcesoCierreCaja,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarProcesoCierreCaja= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarProcesoCierreCaja.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarProcesoCierreCaja,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarProcesoCierreCaja= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarProcesoCierreCaja.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarProcesoCierreCaja,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosProcesoCierreCaja= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProcesoCierreCaja.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProcesoCierreCaja,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProcesoCierreCaja= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProcesoCierreCaja.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProcesoCierreCaja,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarProcesoCierreCaja= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarProcesoCierreCaja.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarProcesoCierreCaja,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProcesoCierreCaja= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProcesoCierreCaja.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProcesoCierreCaja,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProcesoCierreCaja= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProcesoCierreCaja.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProcesoCierreCaja,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoProcesoCierreCaja.add(this.jMenuItemDetalleCerrarProcesoCierreCaja);
		
		this.jmenuDetalleAccionesProcesoCierreCaja.add(this.jMenuItemActualizarProcesoCierreCaja);
		this.jmenuDetalleAccionesProcesoCierreCaja.add(this.jMenuItemEliminarProcesoCierreCaja);
		this.jmenuDetalleAccionesProcesoCierreCaja.add(this.jMenuItemCancelarProcesoCierreCaja);		
		
		//this.jmenuDetalleDatosProcesoCierreCaja.add(this.jMenuItemDetalleAbrirOrderByProcesoCierreCaja);				
		this.jmenuDetalleDatosProcesoCierreCaja.add(this.jMenuItemDetalleMostarOcultarProcesoCierreCaja);				
				
		//this.jmenuDetalleAccionesProcesoCierreCaja.add(this.jMenuItemGuardarCambiosProcesoCierreCaja);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleProcesoCierreCaja.add(this.jmenuDetalleArchivoProcesoCierreCaja);		
		this.jmenuBarDetalleProcesoCierreCaja.add(this.jmenuDetalleAccionesProcesoCierreCaja);		
		this.jmenuBarDetalleProcesoCierreCaja.add(this.jmenuDetalleDatosProcesoCierreCaja);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleProcesoCierreCaja);				
	}
	
	
	public void inicializarElementosCamposProcesoCierreCaja() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdProcesoCierreCaja = new JLabelMe();
		jLabelIdProcesoCierreCaja.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdProcesoCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProcesoCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProcesoCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdProcesoCierreCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidProcesoCierreCaja = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidProcesoCierreCaja.setToolTipText(ProcesoCierreCajaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutProcesoCierreCaja= new GridBagLayout();

		this.jPanelidProcesoCierreCaja.setLayout(this.gridaBagLayoutProcesoCierreCaja);

		jTextFieldidProcesoCierreCaja = new JTextFieldMe();
		jTextFieldidProcesoCierreCaja.setText("Id");

		jTextFieldidProcesoCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidProcesoCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidProcesoCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfechaProcesoCierreCaja = new JLabelMe();
		this.jLabelfechaProcesoCierreCaja.setText(""+ProcesoCierreCajaConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaProcesoCierreCaja.setToolTipText("Fecha");
		this.jLabelfechaProcesoCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaProcesoCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaProcesoCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaProcesoCierreCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaProcesoCierreCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaProcesoCierreCaja.setToolTipText(ProcesoCierreCajaConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutProcesoCierreCaja = new GridBagLayout();
		this.jPanelfechaProcesoCierreCaja.setLayout(this.gridaBagLayoutProcesoCierreCaja);


		//jFormattedTextFieldfechaProcesoCierreCaja= new JFormattedTextFieldMe();

		jDateChooserfechaProcesoCierreCaja= new JDateChooser();
		jDateChooserfechaProcesoCierreCaja.setEnabled(false);
		jDateChooserfechaProcesoCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaProcesoCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaProcesoCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaProcesoCierreCaja,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaProcesoCierreCaja.setDate(new Date());
		jDateChooserfechaProcesoCierreCaja.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaProcesoCierreCaja.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaProcesoCierreCajaBusqueda= new JButtonMe();
		this.jButtonfechaProcesoCierreCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaProcesoCierreCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaProcesoCierreCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaProcesoCierreCajaBusqueda.setText("U");
		this.jButtonfechaProcesoCierreCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaProcesoCierreCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaProcesoCierreCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaProcesoCierreCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaProcesoCierreCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaProcesoCierreCajaBusqueda"));

		if(this.procesocierrecajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaProcesoCierreCajaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysProcesoCierreCaja() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_usuarioProcesoCierreCaja = new JLabelMe();
		this.jLabelid_usuarioProcesoCierreCaja.setText(""+ProcesoCierreCajaConstantesFunciones.LABEL_IDUSUARIO+" : *");
		this.jLabelid_usuarioProcesoCierreCaja.setToolTipText("Usuario");
		this.jLabelid_usuarioProcesoCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioProcesoCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioProcesoCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_usuarioProcesoCierreCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_usuarioProcesoCierreCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_usuarioProcesoCierreCaja.setToolTipText(ProcesoCierreCajaConstantesFunciones.LABEL_IDUSUARIO);
		this.gridaBagLayoutProcesoCierreCaja = new GridBagLayout();
		this.jPanelid_usuarioProcesoCierreCaja.setLayout(this.gridaBagLayoutProcesoCierreCaja);


		jComboBoxid_usuarioProcesoCierreCaja= new JComboBoxMe();
		jComboBoxid_usuarioProcesoCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioProcesoCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioProcesoCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_usuarioProcesoCierreCaja,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_usuarioProcesoCierreCaja.setEnabled(false);

		this.jButtonid_usuarioProcesoCierreCaja= new JButtonMe();
		this.jButtonid_usuarioProcesoCierreCaja.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioProcesoCierreCaja.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioProcesoCierreCaja.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioProcesoCierreCaja.setText("Procesar");
		this.jButtonid_usuarioProcesoCierreCaja.setToolTipText("Procesar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_usuarioProcesoCierreCaja.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioProcesoCierreCaja,"buscar_form","Procesar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_usuarioProcesoCierreCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioProcesoCierreCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioProcesoCierreCaja"));

		this.jButtonid_usuarioProcesoCierreCajaBusqueda= new JButtonMe();
		this.jButtonid_usuarioProcesoCierreCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioProcesoCierreCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioProcesoCierreCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioProcesoCierreCajaBusqueda.setText("U");
		this.jButtonid_usuarioProcesoCierreCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_usuarioProcesoCierreCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioProcesoCierreCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_usuarioProcesoCierreCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioProcesoCierreCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioProcesoCierreCajaBusqueda"));

		if(this.procesocierrecajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_usuarioProcesoCierreCajaBusqueda.setVisible(false);		}

		this.jButtonid_usuarioProcesoCierreCajaUpdate= new JButtonMe();
		this.jButtonid_usuarioProcesoCierreCajaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioProcesoCierreCajaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioProcesoCierreCajaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioProcesoCierreCajaUpdate.setText("U");
		this.jButtonid_usuarioProcesoCierreCajaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_usuarioProcesoCierreCajaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioProcesoCierreCajaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_usuarioProcesoCierreCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioProcesoCierreCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioProcesoCierreCajaUpdate"));



					
		this.jLabelid_cajaProcesoCierreCaja = new JLabelMe();
		this.jLabelid_cajaProcesoCierreCaja.setText(""+ProcesoCierreCajaConstantesFunciones.LABEL_IDCAJA+" : *");
		this.jLabelid_cajaProcesoCierreCaja.setToolTipText("Caja");
		this.jLabelid_cajaProcesoCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cajaProcesoCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cajaProcesoCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cajaProcesoCierreCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cajaProcesoCierreCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cajaProcesoCierreCaja.setToolTipText(ProcesoCierreCajaConstantesFunciones.LABEL_IDCAJA);
		this.gridaBagLayoutProcesoCierreCaja = new GridBagLayout();
		this.jPanelid_cajaProcesoCierreCaja.setLayout(this.gridaBagLayoutProcesoCierreCaja);


		jComboBoxid_cajaProcesoCierreCaja= new JComboBoxMe();
		jComboBoxid_cajaProcesoCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cajaProcesoCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cajaProcesoCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cajaProcesoCierreCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cajaProcesoCierreCaja= new JButtonMe();
		this.jButtonid_cajaProcesoCierreCaja.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cajaProcesoCierreCaja.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cajaProcesoCierreCaja.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cajaProcesoCierreCaja.setText("Procesar");
		this.jButtonid_cajaProcesoCierreCaja.setToolTipText("Procesar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cajaProcesoCierreCaja.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cajaProcesoCierreCaja,"buscar_form","Procesar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cajaProcesoCierreCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cajaProcesoCierreCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cajaProcesoCierreCaja"));

		this.jButtonid_cajaProcesoCierreCajaBusqueda= new JButtonMe();
		this.jButtonid_cajaProcesoCierreCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cajaProcesoCierreCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cajaProcesoCierreCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cajaProcesoCierreCajaBusqueda.setText("U");
		this.jButtonid_cajaProcesoCierreCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cajaProcesoCierreCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cajaProcesoCierreCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cajaProcesoCierreCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cajaProcesoCierreCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cajaProcesoCierreCajaBusqueda"));

		if(this.procesocierrecajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cajaProcesoCierreCajaBusqueda.setVisible(false);		}

		this.jButtonid_cajaProcesoCierreCajaUpdate= new JButtonMe();
		this.jButtonid_cajaProcesoCierreCajaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cajaProcesoCierreCajaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cajaProcesoCierreCajaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cajaProcesoCierreCajaUpdate.setText("U");
		this.jButtonid_cajaProcesoCierreCajaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cajaProcesoCierreCajaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cajaProcesoCierreCajaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cajaProcesoCierreCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cajaProcesoCierreCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cajaProcesoCierreCajaUpdate"));



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
		//this.jInternalFrameDetalleProcesoCierreCaja = new ProcesoCierreCajaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Proceso Cierre Caja DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProcesoCierreCaja= new GridBagLayout();
		

		
		String sToolTipProcesoCierreCaja="";
		sToolTipProcesoCierreCaja=ProcesoCierreCajaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProcesoCierreCaja+="(PuntoVenta.ProcesoCierreCaja)";
		}
		
		if(!this.procesocierrecajaSessionBean.getEsGuardarRelacionado()) {
			sToolTipProcesoCierreCaja+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoProcesoCierreCaja = new JButtonMe();
		this.jButtonModificarProcesoCierreCaja = new JButtonMe();
        this.jButtonActualizarProcesoCierreCaja = new JButtonMe();
        this.jButtonEliminarProcesoCierreCaja = new JButtonMe();
        this.jButtonCancelarProcesoCierreCaja = new JButtonMe();
        this.jButtonGuardarCambiosProcesoCierreCaja = new JButtonMe();
		this.jButtonGuardarCambiosTablaProcesoCierreCaja = new JButtonMe();
		this.jButtonCerrarProcesoCierreCaja = new JButtonMe();
		
		this.jScrollPanelDatosProcesoCierreCaja = new JScrollPane();   
        this.jScrollPanelDatosEdicionProcesoCierreCaja = new JScrollPane();
		this.jScrollPanelDatosGeneralProcesoCierreCaja = new JScrollPane();
				
		
		
		this.jPanelCamposProcesoCierreCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosProcesoCierreCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesProcesoCierreCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioProcesoCierreCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Proceso Cierre Caja";
		
		if(!this.procesocierrecajaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProcesoCierreCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Cierre Cajas" + this.sPath));
		} else {
			this.jScrollPanelDatosProcesoCierreCaja.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionProcesoCierreCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralProcesoCierreCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposProcesoCierreCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposProcesoCierreCaja.setName("jPanelCamposProcesoCierreCaja"); 

		this.jPanelCamposOcultosProcesoCierreCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosProcesoCierreCaja.setName("jPanelCamposOcultosProcesoCierreCaja"); 

        this.jPanelAccionesProcesoCierreCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProcesoCierreCaja.setToolTipText("Acciones");
        this.jPanelAccionesProcesoCierreCaja.setName("Acciones"); 

		this.jPanelAccionesFormularioProcesoCierreCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioProcesoCierreCaja.setToolTipText("Acciones");
        this.jPanelAccionesFormularioProcesoCierreCaja.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoProcesoCierreCaja.setText("Nuevo");
		this.jButtonModificarProcesoCierreCaja.setText("Editar");
        this.jButtonActualizarProcesoCierreCaja.setText("Actualizar");
        this.jButtonEliminarProcesoCierreCaja.setText("Eliminar");
        this.jButtonCancelarProcesoCierreCaja.setText("Cancelar");
        this.jButtonGuardarCambiosProcesoCierreCaja.setText("Guardar");
		this.jButtonGuardarCambiosTablaProcesoCierreCaja.setText("Guardar");
		this.jButtonCerrarProcesoCierreCaja.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProcesoCierreCaja,"nuevo_button","Nuevo",this.procesocierrecajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarProcesoCierreCaja,"modificar_button","Editar",this.procesocierrecajaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarProcesoCierreCaja,"actualizar_button","Actualizar",this.procesocierrecajaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarProcesoCierreCaja,"eliminar_button","Eliminar",this.procesocierrecajaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarProcesoCierreCaja,"cancelar_button","Cancelar",this.procesocierrecajaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosProcesoCierreCaja,"guardarcambios_button","Guardar",this.procesocierrecajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProcesoCierreCaja,"guardarcambiostabla_button","Guardar",this.procesocierrecajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProcesoCierreCaja,"cerrar_button","Salir",this.procesocierrecajaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoProcesoCierreCaja.setToolTipText("Nuevo"+" "+ProcesoCierreCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarProcesoCierreCaja.setToolTipText("Editar"+" "+ProcesoCierreCajaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarProcesoCierreCaja.setToolTipText("Actualizar"+" "+ProcesoCierreCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarProcesoCierreCaja.setToolTipText("Eliminar)"+" "+ProcesoCierreCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarProcesoCierreCaja.setToolTipText("Cancelar"+" "+ProcesoCierreCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosProcesoCierreCaja.setToolTipText("Guardar"+" "+ProcesoCierreCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaProcesoCierreCaja.setToolTipText("Guardar"+" "+ProcesoCierreCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProcesoCierreCaja.setToolTipText("Salir"+" "+ProcesoCierreCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProcesoCierreCaja";
		inputMap = this.jButtonNuevoProcesoCierreCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProcesoCierreCaja.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProcesoCierreCaja"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarProcesoCierreCaja";
		inputMap = this.jButtonActualizarProcesoCierreCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarProcesoCierreCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarProcesoCierreCaja"));
		
		//ELIMINAR
		sMapKey = "EliminarProcesoCierreCaja";
		inputMap = this.jButtonEliminarProcesoCierreCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarProcesoCierreCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarProcesoCierreCaja"));
		
		//CANCELAR	
		sMapKey = "CancelarProcesoCierreCaja";
		inputMap = this.jButtonCancelarProcesoCierreCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarProcesoCierreCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarProcesoCierreCaja"));
		
		//CERRAR		
		sMapKey = "CerrarProcesoCierreCaja";
		inputMap = this.jButtonCerrarProcesoCierreCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProcesoCierreCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProcesoCierreCaja"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProcesoCierreCaja";
		inputMap = this.jButtonGuardarCambiosTablaProcesoCierreCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProcesoCierreCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProcesoCierreCaja"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoProcesoCierreCaja = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoProcesoCierreCaja.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoProcesoCierreCaja.setToolTipText("Nuevo ProcesoCierreCaja");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarProcesoCierreCaja = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarProcesoCierreCaja.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarProcesoCierreCaja.setToolTipText("Sin Cerrar Ventana ProcesoCierreCaja");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeProcesoCierreCaja = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeProcesoCierreCaja.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeProcesoCierreCaja.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesProcesoCierreCaja = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProcesoCierreCaja.setText("Accion");
		this.jComboBoxTiposAccionesProcesoCierreCaja.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioProcesoCierreCaja = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioProcesoCierreCaja.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioProcesoCierreCaja.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesProcesoCierreCaja = new JLabelMe();
		
		this.jLabelAccionesProcesoCierreCaja.setText("Acciones");		
		this.jLabelAccionesProcesoCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposProcesoCierreCaja();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysProcesoCierreCaja();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesProcesoCierreCaja=new JTabbedPane();
		this.jTabbedPaneRelacionesProcesoCierreCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesProcesoCierreCaja,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesProcesoCierreCaja.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoCierreCaja.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoCierreCaja.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioProcesoCierreCaja.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProcesoCierreCaja.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProcesoCierreCaja.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioProcesoCierreCaja, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposProcesoCierreCaja = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosProcesoCierreCaja = new GridBagLayout();
		
		this.jPanelCamposProcesoCierreCaja.setLayout(gridaBagLayoutCamposProcesoCierreCaja);
		this.jPanelCamposOcultosProcesoCierreCaja.setLayout(gridaBagLayoutCamposOcultosProcesoCierreCaja);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
	this.gridBagConstraintsProcesoCierreCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCierreCaja.gridy = 0;
	this.gridBagConstraintsProcesoCierreCaja.gridx = 0;
	this.gridBagConstraintsProcesoCierreCaja.ipadx = 0;
	this.gridBagConstraintsProcesoCierreCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidProcesoCierreCaja.add(jLabelIdProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);



	this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
	this.gridBagConstraintsProcesoCierreCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCierreCaja.gridy = 0;
	this.gridBagConstraintsProcesoCierreCaja.gridx = 1;
	this.gridBagConstraintsProcesoCierreCaja.ipadx = 0;
	this.gridBagConstraintsProcesoCierreCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidProcesoCierreCaja.add(jTextFieldidProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);


	this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
	this.gridBagConstraintsProcesoCierreCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCierreCaja.gridy = 0;
	this.gridBagConstraintsProcesoCierreCaja.gridx = 0;
	this.gridBagConstraintsProcesoCierreCaja.ipadx = 0;
	this.gridBagConstraintsProcesoCierreCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_usuarioProcesoCierreCaja.add(jLabelid_usuarioProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCierreCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCierreCaja.gridy = 0;
		this.gridBagConstraintsProcesoCierreCaja.gridx = 2;
		this.gridBagConstraintsProcesoCierreCaja.ipadx = 0;
		this.gridBagConstraintsProcesoCierreCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioProcesoCierreCaja.add(jButtonid_usuarioProcesoCierreCajaBusqueda, this.gridBagConstraintsProcesoCierreCaja);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCierreCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCierreCaja.gridy = 0;
		this.gridBagConstraintsProcesoCierreCaja.gridx = 3;
		this.gridBagConstraintsProcesoCierreCaja.ipadx = 0;
		this.gridBagConstraintsProcesoCierreCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioProcesoCierreCaja.add(jButtonid_usuarioProcesoCierreCajaUpdate, this.gridBagConstraintsProcesoCierreCaja);
	}

	this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
	this.gridBagConstraintsProcesoCierreCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCierreCaja.gridy = 0;
	this.gridBagConstraintsProcesoCierreCaja.gridx = 1;
	this.gridBagConstraintsProcesoCierreCaja.ipadx = 0;
	this.gridBagConstraintsProcesoCierreCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_usuarioProcesoCierreCaja.add(jComboBoxid_usuarioProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);


	this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
	this.gridBagConstraintsProcesoCierreCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCierreCaja.gridy = 0;
	this.gridBagConstraintsProcesoCierreCaja.gridx = 0;
	this.gridBagConstraintsProcesoCierreCaja.ipadx = 0;
	this.gridBagConstraintsProcesoCierreCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cajaProcesoCierreCaja.add(jLabelid_cajaProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCierreCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCierreCaja.gridy = 0;
		this.gridBagConstraintsProcesoCierreCaja.gridx = 2;
		this.gridBagConstraintsProcesoCierreCaja.ipadx = 0;
		this.gridBagConstraintsProcesoCierreCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cajaProcesoCierreCaja.add(jButtonid_cajaProcesoCierreCajaBusqueda, this.gridBagConstraintsProcesoCierreCaja);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCierreCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCierreCaja.gridy = 0;
		this.gridBagConstraintsProcesoCierreCaja.gridx = 3;
		this.gridBagConstraintsProcesoCierreCaja.ipadx = 0;
		this.gridBagConstraintsProcesoCierreCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cajaProcesoCierreCaja.add(jButtonid_cajaProcesoCierreCajaUpdate, this.gridBagConstraintsProcesoCierreCaja);
	}

	this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
	this.gridBagConstraintsProcesoCierreCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCierreCaja.gridy = 0;
	this.gridBagConstraintsProcesoCierreCaja.gridx = 1;
	this.gridBagConstraintsProcesoCierreCaja.ipadx = 0;
	this.gridBagConstraintsProcesoCierreCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cajaProcesoCierreCaja.add(jComboBoxid_cajaProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);


	this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
	this.gridBagConstraintsProcesoCierreCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCierreCaja.gridy = 0;
	this.gridBagConstraintsProcesoCierreCaja.gridx = 0;
	this.gridBagConstraintsProcesoCierreCaja.ipadx = 0;
	this.gridBagConstraintsProcesoCierreCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaProcesoCierreCaja.add(jLabelfechaProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
		//this.gridBagConstraintsProcesoCierreCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoCierreCaja.gridy = 0;
		this.gridBagConstraintsProcesoCierreCaja.gridx = 2;
		this.gridBagConstraintsProcesoCierreCaja.ipadx = 0;
		this.gridBagConstraintsProcesoCierreCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaProcesoCierreCaja.add(jButtonfechaProcesoCierreCajaBusqueda, this.gridBagConstraintsProcesoCierreCaja);
	}

	this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
	this.gridBagConstraintsProcesoCierreCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoCierreCaja.gridy = 0;
	this.gridBagConstraintsProcesoCierreCaja.gridx = 1;
	this.gridBagConstraintsProcesoCierreCaja.ipadx = 0;
	this.gridBagConstraintsProcesoCierreCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaProcesoCierreCaja.add(jDateChooserfechaProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
	this.gridBagConstraintsProcesoCierreCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoCierreCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoCierreCaja.gridy = iYPanelCamposProcesoCierreCaja;
	this.gridBagConstraintsProcesoCierreCaja.gridx = iXPanelCamposProcesoCierreCaja++;
	this.gridBagConstraintsProcesoCierreCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoCierreCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoCierreCaja.add(this.jPanelidProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);



	if(iXPanelCamposProcesoCierreCaja % 1==0) {
		iXPanelCamposProcesoCierreCaja=0;
		iYPanelCamposProcesoCierreCaja++;
	}
	this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
	this.gridBagConstraintsProcesoCierreCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoCierreCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoCierreCaja.gridy = iYPanelCamposProcesoCierreCaja;
	this.gridBagConstraintsProcesoCierreCaja.gridx = iXPanelCamposProcesoCierreCaja++;
	this.gridBagConstraintsProcesoCierreCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoCierreCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoCierreCaja.add(this.jPanelid_cajaProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);



	if(iXPanelCamposProcesoCierreCaja % 1==0) {
		iXPanelCamposProcesoCierreCaja=0;
		iYPanelCamposProcesoCierreCaja++;
	}
	this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
	this.gridBagConstraintsProcesoCierreCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoCierreCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoCierreCaja.gridy = iYPanelCamposProcesoCierreCaja;
	this.gridBagConstraintsProcesoCierreCaja.gridx = iXPanelCamposProcesoCierreCaja++;
	this.gridBagConstraintsProcesoCierreCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoCierreCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoCierreCaja.add(this.jPanelfechaProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);



	if(iXPanelCamposProcesoCierreCaja % 1==0) {
		iXPanelCamposProcesoCierreCaja=0;
		iYPanelCamposProcesoCierreCaja++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
	this.gridBagConstraintsProcesoCierreCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoCierreCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoCierreCaja.gridy = iYPanelCamposOcultosProcesoCierreCaja;
	this.gridBagConstraintsProcesoCierreCaja.gridx = iXPanelCamposOcultosProcesoCierreCaja++;
	this.gridBagConstraintsProcesoCierreCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoCierreCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosProcesoCierreCaja.add(this.jPanelid_usuarioProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);



	if(iXPanelCamposOcultosProcesoCierreCaja % 1==0) {
		iXPanelCamposOcultosProcesoCierreCaja=0;
		iYPanelCamposOcultosProcesoCierreCaja++;
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
			
		GridBagLayout gridaBagLayoutAccionesProcesoCierreCaja= new GridBagLayout();
		this.jPanelAccionesProcesoCierreCaja.setLayout(gridaBagLayoutAccionesProcesoCierreCaja);
		
		GridBagLayout gridaBagLayoutAccionesFormularioProcesoCierreCaja= new GridBagLayout();
		this.jPanelAccionesFormularioProcesoCierreCaja.setLayout(gridaBagLayoutAccionesFormularioProcesoCierreCaja);
		
		this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreCaja.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProcesoCierreCaja.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProcesoCierreCaja.add(this.jComboBoxTiposAccionesFormularioProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCierreCaja.gridy = 0;
		this.gridBagConstraintsProcesoCierreCaja.gridx = iPosXAccion++;
			
		this.jPanelAccionesProcesoCierreCaja.add(this.jButtonModificarProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);							

		this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoCierreCaja.gridy = 0;
		this.gridBagConstraintsProcesoCierreCaja.gridx =iPosXAccion++;
			
		this.jPanelAccionesProcesoCierreCaja.add(this.jButtonEliminarProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);
		
			
		this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreCaja.gridy = 0;		
		this.gridBagConstraintsProcesoCierreCaja.gridx = iPosXAccion++;
		
		this.jPanelAccionesProcesoCierreCaja.add(this.jButtonActualizarProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);


		this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreCaja.gridy = 0;		
		this.gridBagConstraintsProcesoCierreCaja.gridx = iPosXAccion++;
		
		this.jPanelAccionesProcesoCierreCaja.add(this.jButtonGuardarCambiosProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);	
		
		this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreCaja.gridy = 0;		
		this.gridBagConstraintsProcesoCierreCaja.gridx =iPosXAccion++;
		
		this.jPanelAccionesProcesoCierreCaja.add(this.jButtonCancelarProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProcesoCierreCaja = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProcesoCierreCaja);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.procesocierrecajaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();						
			this.gridBagConstraintsProcesoCierreCaja.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoCierreCaja.gridx = 0;		
			//this.gridBagConstraintsProcesoCierreCaja.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoCierreCaja.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProcesoCierreCaja.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreCaja.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProcesoCierreCaja.gridx =0;
		this.gridBagConstraintsProcesoCierreCaja.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProcesoCierreCaja.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ProcesoCierreCajaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleProcesoCierreCaja = new ProcesoCierreCajaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Proceso Cierre Caja DATOS");
			
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
			
	        //this.setTitle("[FOR] - Proceso Cierre Caja DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Proceso Cierre Caja Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ProcesoCierreCajaModel procesocierrecajaModel=new ProcesoCierreCajaModel(this);
			
			//SI USARA CLASE INTERNA
			//ProcesoCierreCajaModel.ProcesoCierreCajaFocusTraversalPolicy procesocierrecajaFocusTraversalPolicy = procesocierrecajaModel.new ProcesoCierreCajaFocusTraversalPolicy(this);
			
			//procesocierrecajaFocusTraversalPolicy.setprocesocierrecajaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(procesocierrecajaModel);
			
			
			this.jContentPaneDetalleProcesoCierreCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleProcesoCierreCaja = new GridBagLayout();	
			this.jContentPaneDetalleProcesoCierreCaja.setLayout(gridaBagLayoutDetalleProcesoCierreCaja);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProcesoCierreCaja = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
				this.gridBagConstraintsProcesoCierreCaja.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsProcesoCierreCaja.gridx = 0;
					
				
				this.jContentPaneDetalleProcesoCierreCaja.add(jTtoolBarDetalleProcesoCierreCaja, gridBagConstraintsProcesoCierreCaja);								
				
}
			
			this.jScrollPanelDatosEdicionProcesoCierreCaja=   new JScrollPane(jContentPaneDetalleProcesoCierreCaja,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProcesoCierreCaja.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoCierreCaja.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoCierreCaja.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralProcesoCierreCaja=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProcesoCierreCaja.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoCierreCaja.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoCierreCaja.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
			
			
	        this.gridBagConstraintsProcesoCierreCaja.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsProcesoCierreCaja.gridx = 0;
	        
			this.jContentPaneDetalleProcesoCierreCaja.add(jPanelCamposProcesoCierreCaja, gridBagConstraintsProcesoCierreCaja);
			
			
			
			
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
						//&& procesocierrecajaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.procesocierrecajaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsProcesoCierreCaja= new GridBagConstraints();
						this.gridBagConstraintsProcesoCierreCaja.gridy = iGridyRelaciones++;
						this.gridBagConstraintsProcesoCierreCaja.gridx = 0;
						this.jContentPaneDetalleProcesoCierreCaja.add(this.jTabbedPaneRelacionesProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesProcesoCierreCaja.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosProcesoCierreCaja.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
					this.gridBagConstraintsProcesoCierreCaja.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsProcesoCierreCaja.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsProcesoCierreCaja.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsProcesoCierreCaja.gridx = 0;
					
				
					this.jContentPaneDetalleProcesoCierreCaja.add(jPanelCamposOcultosProcesoCierreCaja, gridBagConstraintsProcesoCierreCaja);
				
					this.jPanelCamposOcultosProcesoCierreCaja.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreCaja.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsProcesoCierreCaja.gridx = 0;
	        this.gridBagConstraintsProcesoCierreCaja.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleProcesoCierreCaja.add(this.jPanelAccionesFormularioProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);							
			
			
			
			this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
	        this.gridBagConstraintsProcesoCierreCaja.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsProcesoCierreCaja.gridx = 0;
	        
			
			this.jContentPaneDetalleProcesoCierreCaja.add(this.jPanelAccionesProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionProcesoCierreCaja);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionProcesoCierreCaja=   new JScrollPane(this.jPanelCamposProcesoCierreCaja,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProcesoCierreCaja.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoCierreCaja.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoCierreCaja.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreCaja.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsProcesoCierreCaja.gridx = 0;
			this.gridBagConstraintsProcesoCierreCaja.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsProcesoCierreCaja.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsProcesoCierreCaja.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreCaja.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProcesoCierreCaja.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);			
			
			this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsProcesoCierreCaja.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProcesoCierreCaja.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCierreCaja.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);
			
			
		this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCierreCaja.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);
		
			
		this.gridBagConstraintsProcesoCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsProcesoCierreCaja.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProcesoCierreCaja.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProcesoCierreCaja, this.gridBagConstraintsProcesoCierreCaja);
		*/
		
			
     	//pack();
		
		
		this.jScrollPanelDatosProcesoCierreCaja.setVisible(false);
		

		    	
		this.jComboBoxTiposAccionesProcesoCierreCaja.setVisible(false);
		//this.jComboBoxTiposAccionesFormularioProcesoCierreCaja.setVisible(false);
		//this.jComboBoxTiposSeleccionarProcesoCierreCaja.setVisible(false);		
		
		
		
		
		//this.jTtoolBarProcesoCierreCaja.setVisible(false);
			
		this.jMenuItemMostrarOcultarProcesoCierreCaja.setVisible(false);
		
		
		
		
		//return this.jScrollPanelDatosGeneralProcesoCierreCaja;//jContentPane;
		
		return jScrollPanelDatosEdicionProcesoCierreCaja;
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
