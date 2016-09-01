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
package com.bydan.erp.seguridad.presentation.swing.jinternalframes;



import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;



//import com.bydan.erp.seguridad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.seguridad.util.ResumenUsuarioConstantesFunciones;

import com.bydan.erp.seguridad.business.logic.*;
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
public class ResumenUsuarioDetalleFormJInternalFrame extends ResumenUsuarioBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleResumenUsuario;
	
	protected JMenuBar jmenuBarDetalleResumenUsuario;
	
	protected JMenu jmenuDetalleResumenUsuario;
	protected JMenu jmenuDetalleArchivoResumenUsuario;
	protected JMenu jmenuDetalleAccionesResumenUsuario;
	protected JMenu jmenuDetalleDatosResumenUsuario;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleResumenUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutResumenUsuario;	
	protected GridBagConstraints gridBagConstraintsResumenUsuario;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ResumenUsuarioBeanSwingJInternalFrameAdditional jInternalFrameDetalleResumenUsuario;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";
	
	public ResumenUsuarioSessionBean resumenusuarioSessionBean;
	
	
	
	
	public UsuarioSessionBean usuarioSessionBean;	
	
	public ResumenUsuarioLogic resumenusuarioLogic;
	
	public JScrollPane jScrollPanelDatosResumenUsuario;
	public JScrollPane jScrollPanelDatosEdicionResumenUsuario;
	public JScrollPane jScrollPanelDatosGeneralResumenUsuario;
	
	protected JPanel jPanelCamposResumenUsuario;    
	protected JPanel jPanelCamposOcultosResumenUsuario;    	
	protected JPanel jPanelAccionesResumenUsuario;
	protected JPanel jPanelAccionesFormularioResumenUsuario;
    
	
	
	protected Integer iXPanelCamposResumenUsuario=0;
	protected Integer iYPanelCamposResumenUsuario=0;
	
	protected Integer iXPanelCamposOcultosResumenUsuario=0;
	protected Integer iYPanelCamposOcultosResumenUsuario=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoResumenUsuario;
	public JButton jButtonModificarResumenUsuario;
	public JButton jButtonActualizarResumenUsuario;
    public JButton jButtonEliminarResumenUsuario;
	public JButton jButtonCancelarResumenUsuario;
    public JButton jButtonGuardarCambiosResumenUsuario;
	public JButton jButtonGuardarCambiosTablaResumenUsuario;
	protected JButton jButtonCerrarResumenUsuario;
	
	
	protected JButton jButtonProcesarInformacionResumenUsuario;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoResumenUsuario;
	protected JCheckBox jCheckBoxPostAccionSinCerrarResumenUsuario;
	protected JCheckBox jCheckBoxPostAccionSinMensajeResumenUsuario;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarResumenUsuario;
	protected JButton jButtonModificarToolBarResumenUsuario;
	protected JButton jButtonActualizarToolBarResumenUsuario;
    protected JButton jButtonEliminarToolBarResumenUsuario;
	protected JButton jButtonCancelarToolBarResumenUsuario;
    protected JButton jButtonGuardarCambiosToolBarResumenUsuario;
	protected JButton jButtonGuardarCambiosTablaToolBarResumenUsuario;
	protected JButton jButtonMostrarOcultarTablaToolBarResumenUsuario;
	protected JButton jButtonCerrarToolBarResumenUsuario;
	
	protected JButton jButtonProcesarInformacionToolBarResumenUsuario;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoResumenUsuario;
	protected JMenuItem jMenuItemModificarResumenUsuario;
	protected JMenuItem jMenuItemActualizarResumenUsuario;
    protected JMenuItem jMenuItemEliminarResumenUsuario;
	protected JMenuItem jMenuItemCancelarResumenUsuario;
    protected JMenuItem jMenuItemGuardarCambiosResumenUsuario;
	protected JMenuItem jMenuItemGuardarCambiosTablaResumenUsuario;
	protected JMenuItem jMenuItemCerrarResumenUsuario;
	protected JMenuItem jMenuItemDetalleCerrarResumenUsuario;
	protected JMenuItem jMenuItemDetalleMostarOcultarResumenUsuario;
	
	protected JMenuItem jMenuItemProcesarInformacionResumenUsuario;
	protected JMenuItem jMenuItemNuevoGuardarCambiosResumenUsuario;
	protected JMenuItem jMenuItemMostrarOcultarResumenUsuario;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesResumenUsuario;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesResumenUsuario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesResumenUsuario;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioResumenUsuario;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidResumenUsuario;
	public JLabel jLabelIdResumenUsuario;
	public JLabel jLabelidResumenUsuario;
	public JButton jButtonidResumenUsuarioBusqueda= new JButtonMe();

	public JPanel jPanelnumero_ingresosResumenUsuario;
	public JLabel jLabelnumero_ingresosResumenUsuario;
	public JTextField jTextFieldnumero_ingresosResumenUsuario;
	public JButton jButtonnumero_ingresosResumenUsuarioBusqueda= new JButtonMe();

	public JPanel jPanelnumero_error_ingresoResumenUsuario;
	public JLabel jLabelnumero_error_ingresoResumenUsuario;
	public JTextField jTextFieldnumero_error_ingresoResumenUsuario;
	public JButton jButtonnumero_error_ingresoResumenUsuarioBusqueda= new JButtonMe();

	public JPanel jPanelnumero_intentosResumenUsuario;
	public JLabel jLabelnumero_intentosResumenUsuario;
	public JTextField jTextFieldnumero_intentosResumenUsuario;
	public JButton jButtonnumero_intentosResumenUsuarioBusqueda= new JButtonMe();

	public JPanel jPanelnumero_cierresResumenUsuario;
	public JLabel jLabelnumero_cierresResumenUsuario;
	public JTextField jTextFieldnumero_cierresResumenUsuario;
	public JButton jButtonnumero_cierresResumenUsuarioBusqueda= new JButtonMe();

	public JPanel jPanelnumero_reiniciosResumenUsuario;
	public JLabel jLabelnumero_reiniciosResumenUsuario;
	public JTextField jTextFieldnumero_reiniciosResumenUsuario;
	public JButton jButtonnumero_reiniciosResumenUsuarioBusqueda= new JButtonMe();

	public JPanel jPanelnumero_ingreso_actualResumenUsuario;
	public JLabel jLabelnumero_ingreso_actualResumenUsuario;
	public JTextField jTextFieldnumero_ingreso_actualResumenUsuario;
	public JButton jButtonnumero_ingreso_actualResumenUsuarioBusqueda= new JButtonMe();

	public JPanel jPanelfecha_ultimo_ingresoResumenUsuario;
	public JLabel jLabelfecha_ultimo_ingresoResumenUsuario;
	//public JFormattedTextField jDateChooserfecha_ultimo_ingresoResumenUsuario;

	public JDateChooser jDateChooserfecha_ultimo_ingresoResumenUsuario;
	public JButton jButtonfecha_ultimo_ingresoResumenUsuarioBusqueda= new JButtonMe();

	public JPanel jPanelfecha_ultimo_error_ingresoResumenUsuario;
	public JLabel jLabelfecha_ultimo_error_ingresoResumenUsuario;
	//public JFormattedTextField jDateChooserfecha_ultimo_error_ingresoResumenUsuario;

	public JDateChooser jDateChooserfecha_ultimo_error_ingresoResumenUsuario;
	public JButton jButtonfecha_ultimo_error_ingresoResumenUsuarioBusqueda= new JButtonMe();

	public JPanel jPanelfecha_ultimo_intentoResumenUsuario;
	public JLabel jLabelfecha_ultimo_intentoResumenUsuario;
	//public JFormattedTextField jDateChooserfecha_ultimo_intentoResumenUsuario;

	public JDateChooser jDateChooserfecha_ultimo_intentoResumenUsuario;
	public JButton jButtonfecha_ultimo_intentoResumenUsuarioBusqueda= new JButtonMe();

	public JPanel jPanelfecha_ultimo_cierreResumenUsuario;
	public JLabel jLabelfecha_ultimo_cierreResumenUsuario;
	//public JFormattedTextField jDateChooserfecha_ultimo_cierreResumenUsuario;

	public JDateChooser jDateChooserfecha_ultimo_cierreResumenUsuario;
	public JButton jButtonfecha_ultimo_cierreResumenUsuarioBusqueda= new JButtonMe();

	
	public JPanel jPanelid_usuarioResumenUsuario;
	public JLabel jLabelid_usuarioResumenUsuario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_usuarioResumenUsuario;
	public JButton jButtonid_usuarioResumenUsuario= new JButtonMe();
	public JButton jButtonid_usuarioResumenUsuarioUpdate= new JButtonMe();
	public JButton jButtonid_usuarioResumenUsuarioBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesResumenUsuario;
	
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
		
	public int iWidthFormulario=450;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=594;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ResumenUsuarioDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposResumenUsuario=new JPanel();
				this.jPanelAccionesFormularioResumenUsuario=new JPanel();
				this.jmenuBarDetalleResumenUsuario=new JMenuBar();
				this.jTtoolBarDetalleResumenUsuario=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ResumenUsuarioDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ResumenUsuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ResumenUsuarioDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ResumenUsuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ResumenUsuarioDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ResumenUsuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ResumenUsuarioDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ResumenUsuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ResumenUsuarioDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ResumenUsuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarResumenUsuario() {
		return this.jButtonActualizarToolBarResumenUsuario;
	}
	
	public JButton getjButtonEliminarToolBarResumenUsuario() {
		return this.jButtonEliminarToolBarResumenUsuario;
	}
	
	public JButton getjButtonCancelarToolBarResumenUsuario() {
		return this.jButtonCancelarToolBarResumenUsuario;
	}		
	
	public JButton getjButtonProcesarInformacionResumenUsuario() {
		return this.jButtonProcesarInformacionResumenUsuario;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionResumenUsuario)	{
		this.jButtonProcesarInformacionResumenUsuario = jButtonProcesarInformacionResumenUsuario;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesResumenUsuario() {
		return this.jComboBoxTiposAccionesResumenUsuario;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesResumenUsuario(
			JComboBox jComboBoxTiposRelacionesResumenUsuario) {
		this.jComboBoxTiposRelacionesResumenUsuario = jComboBoxTiposRelacionesResumenUsuario;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesResumenUsuario(
			JComboBox jComboBoxTiposAccionesResumenUsuario) {
		this.jComboBoxTiposAccionesResumenUsuario = jComboBoxTiposAccionesResumenUsuario;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioResumenUsuario() {
		return this.jComboBoxTiposAccionesFormularioResumenUsuario;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioResumenUsuario(
			JComboBox jComboBoxTiposAccionesFormularioResumenUsuario) {
		this.jComboBoxTiposAccionesFormularioResumenUsuario = jComboBoxTiposAccionesFormularioResumenUsuario;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.resumenusuarioSessionBean=new ResumenUsuarioSessionBean();
		
		this.resumenusuarioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.resumenusuarioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.resumenusuarioSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ResumenUsuarioJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ResumenUsuarioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ResumenUsuarioJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Resumen Usuario MANTENIMIENTO"));
		
		
		if(iWidth > 1250) {
			iWidth=1250;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.resumenusuarioSessionBean.getEsGuardarRelacionado()) {
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
	
		ResumenUsuarioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleResumenUsuario= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarResumenUsuario=new JButtonMe();
				this.jButtonModificarToolBarResumenUsuario=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarResumenUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarResumenUsuario,this.jTtoolBarDetalleResumenUsuario,
							"actualizar","actualizar","Actualizar"+" "+ResumenUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarResumenUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarResumenUsuario,this.jTtoolBarDetalleResumenUsuario,
							"eliminar","eliminar","Eliminar"+" "+ResumenUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarResumenUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarResumenUsuario,this.jTtoolBarDetalleResumenUsuario,
							"cancelar","cancelar","Cancelar"+" "+ResumenUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarResumenUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarResumenUsuario,this.jTtoolBarDetalleResumenUsuario,
							"guardarcambios","guardarcambios","Guardar"+" "+ResumenUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarResumenUsuario,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarResumenUsuario,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarResumenUsuario,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleResumenUsuario=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleResumenUsuario=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoResumenUsuario=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesResumenUsuario=new JMenuMe("Acciones");
		this.jmenuDetalleDatosResumenUsuario=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoResumenUsuario= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoResumenUsuario.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoResumenUsuario,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoResumenUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarResumenUsuario= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarResumenUsuario.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarResumenUsuario,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarResumenUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarResumenUsuario= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarResumenUsuario.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarResumenUsuario,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarResumenUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarResumenUsuario= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarResumenUsuario.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarResumenUsuario,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarResumenUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarResumenUsuario= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarResumenUsuario.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarResumenUsuario,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarResumenUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosResumenUsuario= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosResumenUsuario.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosResumenUsuario,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosResumenUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarResumenUsuario= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarResumenUsuario.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarResumenUsuario,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarResumenUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarResumenUsuario= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarResumenUsuario.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarResumenUsuario,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarResumenUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarResumenUsuario= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarResumenUsuario.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarResumenUsuario,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarResumenUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarResumenUsuario= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarResumenUsuario.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarResumenUsuario,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarResumenUsuario, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoResumenUsuario.add(this.jMenuItemDetalleCerrarResumenUsuario);
		
		this.jmenuDetalleAccionesResumenUsuario.add(this.jMenuItemActualizarResumenUsuario);
		this.jmenuDetalleAccionesResumenUsuario.add(this.jMenuItemEliminarResumenUsuario);
		this.jmenuDetalleAccionesResumenUsuario.add(this.jMenuItemCancelarResumenUsuario);		
		
		//this.jmenuDetalleDatosResumenUsuario.add(this.jMenuItemDetalleAbrirOrderByResumenUsuario);				
		this.jmenuDetalleDatosResumenUsuario.add(this.jMenuItemDetalleMostarOcultarResumenUsuario);				
				
		//this.jmenuDetalleAccionesResumenUsuario.add(this.jMenuItemGuardarCambiosResumenUsuario);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoResumenUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesResumenUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosResumenUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleResumenUsuario.add(this.jmenuDetalleArchivoResumenUsuario);		
		this.jmenuBarDetalleResumenUsuario.add(this.jmenuDetalleAccionesResumenUsuario);		
		this.jmenuBarDetalleResumenUsuario.add(this.jmenuDetalleDatosResumenUsuario);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleResumenUsuario);				
	}
	
	
	public void inicializarElementosCamposResumenUsuario() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdResumenUsuario = new JLabelMe();
		jLabelIdResumenUsuario.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdResumenUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdResumenUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdResumenUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdResumenUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidResumenUsuario = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidResumenUsuario.setToolTipText(ResumenUsuarioConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutResumenUsuario= new GridBagLayout();

		this.jPanelidResumenUsuario.setLayout(this.gridaBagLayoutResumenUsuario);

		jLabelidResumenUsuario = new JLabel();
		jLabelidResumenUsuario.setText("Id");

		jLabelidResumenUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidResumenUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidResumenUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnumero_ingresosResumenUsuario = new JLabelMe();
		this.jLabelnumero_ingresosResumenUsuario.setText(""+ResumenUsuarioConstantesFunciones.LABEL_NUMEROINGRESOS+" : *");
		this.jLabelnumero_ingresosResumenUsuario.setToolTipText("Numero Ingresos");
		this.jLabelnumero_ingresosResumenUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_ingresosResumenUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_ingresosResumenUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_ingresosResumenUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_ingresosResumenUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_ingresosResumenUsuario.setToolTipText(ResumenUsuarioConstantesFunciones.LABEL_NUMEROINGRESOS);
		this.gridaBagLayoutResumenUsuario = new GridBagLayout();
		this.jPanelnumero_ingresosResumenUsuario.setLayout(this.gridaBagLayoutResumenUsuario);


		jTextFieldnumero_ingresosResumenUsuario= new JTextFieldMe();
		jTextFieldnumero_ingresosResumenUsuario.setEnabled(false);
		jTextFieldnumero_ingresosResumenUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_ingresosResumenUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_ingresosResumenUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_ingresosResumenUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_ingresosResumenUsuario.setText("0");

		this.jButtonnumero_ingresosResumenUsuarioBusqueda= new JButtonMe();
		this.jButtonnumero_ingresosResumenUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_ingresosResumenUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_ingresosResumenUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_ingresosResumenUsuarioBusqueda.setText("U");
		this.jButtonnumero_ingresosResumenUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_ingresosResumenUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_ingresosResumenUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_ingresosResumenUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_ingresosResumenUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_ingresosResumenUsuarioBusqueda"));

		if(this.resumenusuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_ingresosResumenUsuarioBusqueda.setVisible(false);		}


					
		this.jLabelnumero_error_ingresoResumenUsuario = new JLabelMe();
		this.jLabelnumero_error_ingresoResumenUsuario.setText(""+ResumenUsuarioConstantesFunciones.LABEL_NUMEROERRORINGRESO+" : *");
		this.jLabelnumero_error_ingresoResumenUsuario.setToolTipText("Numero Error Ingreso");
		this.jLabelnumero_error_ingresoResumenUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnumero_error_ingresoResumenUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnumero_error_ingresoResumenUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_error_ingresoResumenUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_error_ingresoResumenUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_error_ingresoResumenUsuario.setToolTipText(ResumenUsuarioConstantesFunciones.LABEL_NUMEROERRORINGRESO);
		this.gridaBagLayoutResumenUsuario = new GridBagLayout();
		this.jPanelnumero_error_ingresoResumenUsuario.setLayout(this.gridaBagLayoutResumenUsuario);


		jTextFieldnumero_error_ingresoResumenUsuario= new JTextFieldMe();
		jTextFieldnumero_error_ingresoResumenUsuario.setEnabled(false);
		jTextFieldnumero_error_ingresoResumenUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_error_ingresoResumenUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_error_ingresoResumenUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_error_ingresoResumenUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_error_ingresoResumenUsuario.setText("0");

		this.jButtonnumero_error_ingresoResumenUsuarioBusqueda= new JButtonMe();
		this.jButtonnumero_error_ingresoResumenUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_error_ingresoResumenUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_error_ingresoResumenUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_error_ingresoResumenUsuarioBusqueda.setText("U");
		this.jButtonnumero_error_ingresoResumenUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_error_ingresoResumenUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_error_ingresoResumenUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_error_ingresoResumenUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_error_ingresoResumenUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_error_ingresoResumenUsuarioBusqueda"));

		if(this.resumenusuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_error_ingresoResumenUsuarioBusqueda.setVisible(false);		}


					
		this.jLabelnumero_intentosResumenUsuario = new JLabelMe();
		this.jLabelnumero_intentosResumenUsuario.setText(""+ResumenUsuarioConstantesFunciones.LABEL_NUMEROINTENTOS+" : *");
		this.jLabelnumero_intentosResumenUsuario.setToolTipText("Numero Intentos");
		this.jLabelnumero_intentosResumenUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_intentosResumenUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_intentosResumenUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_intentosResumenUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_intentosResumenUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_intentosResumenUsuario.setToolTipText(ResumenUsuarioConstantesFunciones.LABEL_NUMEROINTENTOS);
		this.gridaBagLayoutResumenUsuario = new GridBagLayout();
		this.jPanelnumero_intentosResumenUsuario.setLayout(this.gridaBagLayoutResumenUsuario);


		jTextFieldnumero_intentosResumenUsuario= new JTextFieldMe();
		jTextFieldnumero_intentosResumenUsuario.setEnabled(false);
		jTextFieldnumero_intentosResumenUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_intentosResumenUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_intentosResumenUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_intentosResumenUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_intentosResumenUsuario.setText("0");

		this.jButtonnumero_intentosResumenUsuarioBusqueda= new JButtonMe();
		this.jButtonnumero_intentosResumenUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_intentosResumenUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_intentosResumenUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_intentosResumenUsuarioBusqueda.setText("U");
		this.jButtonnumero_intentosResumenUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_intentosResumenUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_intentosResumenUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_intentosResumenUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_intentosResumenUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_intentosResumenUsuarioBusqueda"));

		if(this.resumenusuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_intentosResumenUsuarioBusqueda.setVisible(false);		}


					
		this.jLabelnumero_cierresResumenUsuario = new JLabelMe();
		this.jLabelnumero_cierresResumenUsuario.setText(""+ResumenUsuarioConstantesFunciones.LABEL_NUMEROCIERRES+" : *");
		this.jLabelnumero_cierresResumenUsuario.setToolTipText("Numero Cierres");
		this.jLabelnumero_cierresResumenUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_cierresResumenUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_cierresResumenUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_cierresResumenUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_cierresResumenUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_cierresResumenUsuario.setToolTipText(ResumenUsuarioConstantesFunciones.LABEL_NUMEROCIERRES);
		this.gridaBagLayoutResumenUsuario = new GridBagLayout();
		this.jPanelnumero_cierresResumenUsuario.setLayout(this.gridaBagLayoutResumenUsuario);


		jTextFieldnumero_cierresResumenUsuario= new JTextFieldMe();
		jTextFieldnumero_cierresResumenUsuario.setEnabled(false);
		jTextFieldnumero_cierresResumenUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_cierresResumenUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_cierresResumenUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_cierresResumenUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_cierresResumenUsuario.setText("0");

		this.jButtonnumero_cierresResumenUsuarioBusqueda= new JButtonMe();
		this.jButtonnumero_cierresResumenUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_cierresResumenUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_cierresResumenUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_cierresResumenUsuarioBusqueda.setText("U");
		this.jButtonnumero_cierresResumenUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_cierresResumenUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_cierresResumenUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_cierresResumenUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_cierresResumenUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_cierresResumenUsuarioBusqueda"));

		if(this.resumenusuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_cierresResumenUsuarioBusqueda.setVisible(false);		}


					
		this.jLabelnumero_reiniciosResumenUsuario = new JLabelMe();
		this.jLabelnumero_reiniciosResumenUsuario.setText(""+ResumenUsuarioConstantesFunciones.LABEL_NUMEROREINICIOS+" : *");
		this.jLabelnumero_reiniciosResumenUsuario.setToolTipText("Numero Reinicios");
		this.jLabelnumero_reiniciosResumenUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_reiniciosResumenUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_reiniciosResumenUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_reiniciosResumenUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_reiniciosResumenUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_reiniciosResumenUsuario.setToolTipText(ResumenUsuarioConstantesFunciones.LABEL_NUMEROREINICIOS);
		this.gridaBagLayoutResumenUsuario = new GridBagLayout();
		this.jPanelnumero_reiniciosResumenUsuario.setLayout(this.gridaBagLayoutResumenUsuario);


		jTextFieldnumero_reiniciosResumenUsuario= new JTextFieldMe();
		jTextFieldnumero_reiniciosResumenUsuario.setEnabled(false);
		jTextFieldnumero_reiniciosResumenUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_reiniciosResumenUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_reiniciosResumenUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_reiniciosResumenUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_reiniciosResumenUsuario.setText("0");

		this.jButtonnumero_reiniciosResumenUsuarioBusqueda= new JButtonMe();
		this.jButtonnumero_reiniciosResumenUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_reiniciosResumenUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_reiniciosResumenUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_reiniciosResumenUsuarioBusqueda.setText("U");
		this.jButtonnumero_reiniciosResumenUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_reiniciosResumenUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_reiniciosResumenUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_reiniciosResumenUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_reiniciosResumenUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_reiniciosResumenUsuarioBusqueda"));

		if(this.resumenusuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_reiniciosResumenUsuarioBusqueda.setVisible(false);		}


					
		this.jLabelnumero_ingreso_actualResumenUsuario = new JLabelMe();
		this.jLabelnumero_ingreso_actualResumenUsuario.setText(""+ResumenUsuarioConstantesFunciones.LABEL_NUMEROINGRESOACTUAL+" : *");
		this.jLabelnumero_ingreso_actualResumenUsuario.setToolTipText("Numero Ingreso Actual");
		this.jLabelnumero_ingreso_actualResumenUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnumero_ingreso_actualResumenUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnumero_ingreso_actualResumenUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_ingreso_actualResumenUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_ingreso_actualResumenUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_ingreso_actualResumenUsuario.setToolTipText(ResumenUsuarioConstantesFunciones.LABEL_NUMEROINGRESOACTUAL);
		this.gridaBagLayoutResumenUsuario = new GridBagLayout();
		this.jPanelnumero_ingreso_actualResumenUsuario.setLayout(this.gridaBagLayoutResumenUsuario);


		jTextFieldnumero_ingreso_actualResumenUsuario= new JTextFieldMe();
		jTextFieldnumero_ingreso_actualResumenUsuario.setEnabled(false);
		jTextFieldnumero_ingreso_actualResumenUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_ingreso_actualResumenUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_ingreso_actualResumenUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_ingreso_actualResumenUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_ingreso_actualResumenUsuario.setText("0");

		this.jButtonnumero_ingreso_actualResumenUsuarioBusqueda= new JButtonMe();
		this.jButtonnumero_ingreso_actualResumenUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_ingreso_actualResumenUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_ingreso_actualResumenUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_ingreso_actualResumenUsuarioBusqueda.setText("U");
		this.jButtonnumero_ingreso_actualResumenUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_ingreso_actualResumenUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_ingreso_actualResumenUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_ingreso_actualResumenUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_ingreso_actualResumenUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_ingreso_actualResumenUsuarioBusqueda"));

		if(this.resumenusuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_ingreso_actualResumenUsuarioBusqueda.setVisible(false);		}


					
		this.jLabelfecha_ultimo_ingresoResumenUsuario = new JLabelMe();
		this.jLabelfecha_ultimo_ingresoResumenUsuario.setText(""+ResumenUsuarioConstantesFunciones.LABEL_FECHAULTIMOINGRESO+" : *");
		this.jLabelfecha_ultimo_ingresoResumenUsuario.setToolTipText("Fecha Ultimo Ingreso");
		this.jLabelfecha_ultimo_ingresoResumenUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelfecha_ultimo_ingresoResumenUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelfecha_ultimo_ingresoResumenUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_ultimo_ingresoResumenUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_ultimo_ingresoResumenUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_ultimo_ingresoResumenUsuario.setToolTipText(ResumenUsuarioConstantesFunciones.LABEL_FECHAULTIMOINGRESO);
		this.gridaBagLayoutResumenUsuario = new GridBagLayout();
		this.jPanelfecha_ultimo_ingresoResumenUsuario.setLayout(this.gridaBagLayoutResumenUsuario);


		//jFormattedTextFieldfecha_ultimo_ingresoResumenUsuario= new JFormattedTextFieldMe();

		jDateChooserfecha_ultimo_ingresoResumenUsuario= new JDateChooser();
		jDateChooserfecha_ultimo_ingresoResumenUsuario.setEnabled(false);
		jDateChooserfecha_ultimo_ingresoResumenUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ultimo_ingresoResumenUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ultimo_ingresoResumenUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_ultimo_ingresoResumenUsuario,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_ultimo_ingresoResumenUsuario.setDate(new Date());
		jDateChooserfecha_ultimo_ingresoResumenUsuario.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_ultimo_ingresoResumenUsuario.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_ultimo_ingresoResumenUsuarioBusqueda= new JButtonMe();
		this.jButtonfecha_ultimo_ingresoResumenUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ultimo_ingresoResumenUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ultimo_ingresoResumenUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_ultimo_ingresoResumenUsuarioBusqueda.setText("U");
		this.jButtonfecha_ultimo_ingresoResumenUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_ultimo_ingresoResumenUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_ultimo_ingresoResumenUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_ultimo_ingresoResumenUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_ultimo_ingresoResumenUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_ultimo_ingresoResumenUsuarioBusqueda"));

		if(this.resumenusuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_ultimo_ingresoResumenUsuarioBusqueda.setVisible(false);		}


					
		this.jLabelfecha_ultimo_error_ingresoResumenUsuario = new JLabelMe();
		this.jLabelfecha_ultimo_error_ingresoResumenUsuario.setText(""+ResumenUsuarioConstantesFunciones.LABEL_FECHAULTIMOERRORINGRESO+" : *");
		this.jLabelfecha_ultimo_error_ingresoResumenUsuario.setToolTipText("Fecha Ultimo Error Ingreso");
		this.jLabelfecha_ultimo_error_ingresoResumenUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelfecha_ultimo_error_ingresoResumenUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelfecha_ultimo_error_ingresoResumenUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_ultimo_error_ingresoResumenUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_ultimo_error_ingresoResumenUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_ultimo_error_ingresoResumenUsuario.setToolTipText(ResumenUsuarioConstantesFunciones.LABEL_FECHAULTIMOERRORINGRESO);
		this.gridaBagLayoutResumenUsuario = new GridBagLayout();
		this.jPanelfecha_ultimo_error_ingresoResumenUsuario.setLayout(this.gridaBagLayoutResumenUsuario);


		//jFormattedTextFieldfecha_ultimo_error_ingresoResumenUsuario= new JFormattedTextFieldMe();

		jDateChooserfecha_ultimo_error_ingresoResumenUsuario= new JDateChooser();
		jDateChooserfecha_ultimo_error_ingresoResumenUsuario.setEnabled(false);
		jDateChooserfecha_ultimo_error_ingresoResumenUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ultimo_error_ingresoResumenUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ultimo_error_ingresoResumenUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_ultimo_error_ingresoResumenUsuario,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_ultimo_error_ingresoResumenUsuario.setDate(new Date());
		jDateChooserfecha_ultimo_error_ingresoResumenUsuario.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_ultimo_error_ingresoResumenUsuario.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_ultimo_error_ingresoResumenUsuarioBusqueda= new JButtonMe();
		this.jButtonfecha_ultimo_error_ingresoResumenUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ultimo_error_ingresoResumenUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ultimo_error_ingresoResumenUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_ultimo_error_ingresoResumenUsuarioBusqueda.setText("U");
		this.jButtonfecha_ultimo_error_ingresoResumenUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_ultimo_error_ingresoResumenUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_ultimo_error_ingresoResumenUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_ultimo_error_ingresoResumenUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_ultimo_error_ingresoResumenUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_ultimo_error_ingresoResumenUsuarioBusqueda"));

		if(this.resumenusuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_ultimo_error_ingresoResumenUsuarioBusqueda.setVisible(false);		}


					
		this.jLabelfecha_ultimo_intentoResumenUsuario = new JLabelMe();
		this.jLabelfecha_ultimo_intentoResumenUsuario.setText(""+ResumenUsuarioConstantesFunciones.LABEL_FECHAULTIMOINTENTO+" : *");
		this.jLabelfecha_ultimo_intentoResumenUsuario.setToolTipText("Fecha Ultimo Intento");
		this.jLabelfecha_ultimo_intentoResumenUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelfecha_ultimo_intentoResumenUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelfecha_ultimo_intentoResumenUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_ultimo_intentoResumenUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_ultimo_intentoResumenUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_ultimo_intentoResumenUsuario.setToolTipText(ResumenUsuarioConstantesFunciones.LABEL_FECHAULTIMOINTENTO);
		this.gridaBagLayoutResumenUsuario = new GridBagLayout();
		this.jPanelfecha_ultimo_intentoResumenUsuario.setLayout(this.gridaBagLayoutResumenUsuario);


		//jFormattedTextFieldfecha_ultimo_intentoResumenUsuario= new JFormattedTextFieldMe();

		jDateChooserfecha_ultimo_intentoResumenUsuario= new JDateChooser();
		jDateChooserfecha_ultimo_intentoResumenUsuario.setEnabled(false);
		jDateChooserfecha_ultimo_intentoResumenUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ultimo_intentoResumenUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ultimo_intentoResumenUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_ultimo_intentoResumenUsuario,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_ultimo_intentoResumenUsuario.setDate(new Date());
		jDateChooserfecha_ultimo_intentoResumenUsuario.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_ultimo_intentoResumenUsuario.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_ultimo_intentoResumenUsuarioBusqueda= new JButtonMe();
		this.jButtonfecha_ultimo_intentoResumenUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ultimo_intentoResumenUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ultimo_intentoResumenUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_ultimo_intentoResumenUsuarioBusqueda.setText("U");
		this.jButtonfecha_ultimo_intentoResumenUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_ultimo_intentoResumenUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_ultimo_intentoResumenUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_ultimo_intentoResumenUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_ultimo_intentoResumenUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_ultimo_intentoResumenUsuarioBusqueda"));

		if(this.resumenusuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_ultimo_intentoResumenUsuarioBusqueda.setVisible(false);		}


					
		this.jLabelfecha_ultimo_cierreResumenUsuario = new JLabelMe();
		this.jLabelfecha_ultimo_cierreResumenUsuario.setText(""+ResumenUsuarioConstantesFunciones.LABEL_FECHAULTIMOCIERRE+" : *");
		this.jLabelfecha_ultimo_cierreResumenUsuario.setToolTipText("Fecha Ultimo Cierre");
		this.jLabelfecha_ultimo_cierreResumenUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_ultimo_cierreResumenUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_ultimo_cierreResumenUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_ultimo_cierreResumenUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_ultimo_cierreResumenUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_ultimo_cierreResumenUsuario.setToolTipText(ResumenUsuarioConstantesFunciones.LABEL_FECHAULTIMOCIERRE);
		this.gridaBagLayoutResumenUsuario = new GridBagLayout();
		this.jPanelfecha_ultimo_cierreResumenUsuario.setLayout(this.gridaBagLayoutResumenUsuario);


		//jFormattedTextFieldfecha_ultimo_cierreResumenUsuario= new JFormattedTextFieldMe();

		jDateChooserfecha_ultimo_cierreResumenUsuario= new JDateChooser();
		jDateChooserfecha_ultimo_cierreResumenUsuario.setEnabled(false);
		jDateChooserfecha_ultimo_cierreResumenUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ultimo_cierreResumenUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_ultimo_cierreResumenUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_ultimo_cierreResumenUsuario,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_ultimo_cierreResumenUsuario.setDate(new Date());
		jDateChooserfecha_ultimo_cierreResumenUsuario.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_ultimo_cierreResumenUsuario.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_ultimo_cierreResumenUsuarioBusqueda= new JButtonMe();
		this.jButtonfecha_ultimo_cierreResumenUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ultimo_cierreResumenUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_ultimo_cierreResumenUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_ultimo_cierreResumenUsuarioBusqueda.setText("U");
		this.jButtonfecha_ultimo_cierreResumenUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_ultimo_cierreResumenUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_ultimo_cierreResumenUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_ultimo_cierreResumenUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_ultimo_cierreResumenUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_ultimo_cierreResumenUsuarioBusqueda"));

		if(this.resumenusuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_ultimo_cierreResumenUsuarioBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysResumenUsuario() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_usuarioResumenUsuario = new JLabelMe();
		this.jLabelid_usuarioResumenUsuario.setText(""+ResumenUsuarioConstantesFunciones.LABEL_IDUSUARIO+" : *");
		this.jLabelid_usuarioResumenUsuario.setToolTipText("Usuario");
		this.jLabelid_usuarioResumenUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioResumenUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioResumenUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_usuarioResumenUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_usuarioResumenUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_usuarioResumenUsuario.setToolTipText(ResumenUsuarioConstantesFunciones.LABEL_IDUSUARIO);
		this.gridaBagLayoutResumenUsuario = new GridBagLayout();
		this.jPanelid_usuarioResumenUsuario.setLayout(this.gridaBagLayoutResumenUsuario);


		jComboBoxid_usuarioResumenUsuario= new JComboBoxMe();
		jComboBoxid_usuarioResumenUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioResumenUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioResumenUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_usuarioResumenUsuario,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_usuarioResumenUsuario.setEnabled(false);

		this.jButtonid_usuarioResumenUsuario= new JButtonMe();
		this.jButtonid_usuarioResumenUsuario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioResumenUsuario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioResumenUsuario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioResumenUsuario.setText("Buscar");
		this.jButtonid_usuarioResumenUsuario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_usuarioResumenUsuario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioResumenUsuario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_usuarioResumenUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioResumenUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioResumenUsuario"));

		this.jButtonid_usuarioResumenUsuarioBusqueda= new JButtonMe();
		this.jButtonid_usuarioResumenUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioResumenUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioResumenUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioResumenUsuarioBusqueda.setText("U");
		this.jButtonid_usuarioResumenUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_usuarioResumenUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioResumenUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_usuarioResumenUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioResumenUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioResumenUsuarioBusqueda"));

		if(this.resumenusuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_usuarioResumenUsuarioBusqueda.setVisible(false);		}

		this.jButtonid_usuarioResumenUsuarioUpdate= new JButtonMe();
		this.jButtonid_usuarioResumenUsuarioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioResumenUsuarioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioResumenUsuarioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioResumenUsuarioUpdate.setText("U");
		this.jButtonid_usuarioResumenUsuarioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_usuarioResumenUsuarioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioResumenUsuarioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_usuarioResumenUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioResumenUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioResumenUsuarioUpdate"));



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
		//this.jInternalFrameDetalleResumenUsuario = new ResumenUsuarioBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Resumen Usuario DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutResumenUsuario= new GridBagLayout();
		

		
		String sToolTipResumenUsuario="";
		sToolTipResumenUsuario=ResumenUsuarioConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipResumenUsuario+="(Seguridad.ResumenUsuario)";
		}
		
		if(!this.resumenusuarioSessionBean.getEsGuardarRelacionado()) {
			sToolTipResumenUsuario+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoResumenUsuario = new JButtonMe();
		this.jButtonModificarResumenUsuario = new JButtonMe();
        this.jButtonActualizarResumenUsuario = new JButtonMe();
        this.jButtonEliminarResumenUsuario = new JButtonMe();
        this.jButtonCancelarResumenUsuario = new JButtonMe();
        this.jButtonGuardarCambiosResumenUsuario = new JButtonMe();
		this.jButtonGuardarCambiosTablaResumenUsuario = new JButtonMe();
		this.jButtonCerrarResumenUsuario = new JButtonMe();
		
		this.jScrollPanelDatosResumenUsuario = new JScrollPane();   
        this.jScrollPanelDatosEdicionResumenUsuario = new JScrollPane();
		this.jScrollPanelDatosGeneralResumenUsuario = new JScrollPane();
				
		
		
		this.jPanelCamposResumenUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosResumenUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesResumenUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioResumenUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Resumen Usuario";
		
		if(!this.resumenusuarioSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosResumenUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Resumen Usuarios" + this.sPath));
		} else {
			this.jScrollPanelDatosResumenUsuario.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionResumenUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralResumenUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposResumenUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposResumenUsuario.setName("jPanelCamposResumenUsuario"); 

		this.jPanelCamposOcultosResumenUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosResumenUsuario.setName("jPanelCamposOcultosResumenUsuario"); 

        this.jPanelAccionesResumenUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesResumenUsuario.setToolTipText("Acciones");
        this.jPanelAccionesResumenUsuario.setName("Acciones"); 

		this.jPanelAccionesFormularioResumenUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioResumenUsuario.setToolTipText("Acciones");
        this.jPanelAccionesFormularioResumenUsuario.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionResumenUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralResumenUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosResumenUsuario, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposResumenUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosResumenUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioResumenUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoResumenUsuario.setText("Nuevo");
		this.jButtonModificarResumenUsuario.setText("Editar");
        this.jButtonActualizarResumenUsuario.setText("Actualizar");
        this.jButtonEliminarResumenUsuario.setText("Eliminar");
        this.jButtonCancelarResumenUsuario.setText("Cancelar");
        this.jButtonGuardarCambiosResumenUsuario.setText("Guardar");
		this.jButtonGuardarCambiosTablaResumenUsuario.setText("Guardar");
		this.jButtonCerrarResumenUsuario.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoResumenUsuario,"nuevo_button","Nuevo",this.resumenusuarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarResumenUsuario,"modificar_button","Editar",this.resumenusuarioSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarResumenUsuario,"actualizar_button","Actualizar",this.resumenusuarioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarResumenUsuario,"eliminar_button","Eliminar",this.resumenusuarioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarResumenUsuario,"cancelar_button","Cancelar",this.resumenusuarioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosResumenUsuario,"guardarcambios_button","Guardar",this.resumenusuarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaResumenUsuario,"guardarcambiostabla_button","Guardar",this.resumenusuarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarResumenUsuario,"cerrar_button","Salir",this.resumenusuarioSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoResumenUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarResumenUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosResumenUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaResumenUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarResumenUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarResumenUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarResumenUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarResumenUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoResumenUsuario.setToolTipText("Nuevo"+" "+ResumenUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarResumenUsuario.setToolTipText("Editar"+" "+ResumenUsuarioConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarResumenUsuario.setToolTipText("Actualizar"+" "+ResumenUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarResumenUsuario.setToolTipText("Eliminar)"+" "+ResumenUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarResumenUsuario.setToolTipText("Cancelar"+" "+ResumenUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosResumenUsuario.setToolTipText("Guardar"+" "+ResumenUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaResumenUsuario.setToolTipText("Guardar"+" "+ResumenUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarResumenUsuario.setToolTipText("Salir"+" "+ResumenUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoResumenUsuario";
		inputMap = this.jButtonNuevoResumenUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoResumenUsuario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoResumenUsuario"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarResumenUsuario";
		inputMap = this.jButtonActualizarResumenUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarResumenUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarResumenUsuario"));
		
		//ELIMINAR
		sMapKey = "EliminarResumenUsuario";
		inputMap = this.jButtonEliminarResumenUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarResumenUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarResumenUsuario"));
		
		//CANCELAR	
		sMapKey = "CancelarResumenUsuario";
		inputMap = this.jButtonCancelarResumenUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarResumenUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarResumenUsuario"));
		
		//CERRAR		
		sMapKey = "CerrarResumenUsuario";
		inputMap = this.jButtonCerrarResumenUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarResumenUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarResumenUsuario"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaResumenUsuario";
		inputMap = this.jButtonGuardarCambiosTablaResumenUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaResumenUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaResumenUsuario"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoResumenUsuario = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoResumenUsuario.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoResumenUsuario.setToolTipText("Nuevo ResumenUsuario");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoResumenUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarResumenUsuario = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarResumenUsuario.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarResumenUsuario.setToolTipText("Sin Cerrar Ventana ResumenUsuario");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarResumenUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeResumenUsuario = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeResumenUsuario.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeResumenUsuario.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeResumenUsuario, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesResumenUsuario = new JComboBoxMe();
		//this.jComboBoxTiposAccionesResumenUsuario.setText("Accion");
		this.jComboBoxTiposAccionesResumenUsuario.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioResumenUsuario = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioResumenUsuario.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioResumenUsuario.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesResumenUsuario = new JLabelMe();
		
		this.jLabelAccionesResumenUsuario.setText("Acciones");		
		this.jLabelAccionesResumenUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesResumenUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesResumenUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposResumenUsuario();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysResumenUsuario();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesResumenUsuario=new JTabbedPane();
		this.jTabbedPaneRelacionesResumenUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesResumenUsuario,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesResumenUsuario.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesResumenUsuario.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesResumenUsuario.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesResumenUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioResumenUsuario.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioResumenUsuario.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioResumenUsuario.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioResumenUsuario, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposResumenUsuario = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosResumenUsuario = new GridBagLayout();
		
		this.jPanelCamposResumenUsuario.setLayout(gridaBagLayoutCamposResumenUsuario);
		this.jPanelCamposOcultosResumenUsuario.setLayout(gridaBagLayoutCamposOcultosResumenUsuario);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
	this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResumenUsuario.gridy = 0;
	this.gridBagConstraintsResumenUsuario.gridx = 0;
	this.gridBagConstraintsResumenUsuario.ipadx = 0;
	this.gridBagConstraintsResumenUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidResumenUsuario.add(jLabelIdResumenUsuario, this.gridBagConstraintsResumenUsuario);



	this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
	this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResumenUsuario.gridy = 0;
	this.gridBagConstraintsResumenUsuario.gridx = 1;
	this.gridBagConstraintsResumenUsuario.ipadx = 0;
	this.gridBagConstraintsResumenUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidResumenUsuario.add(jLabelidResumenUsuario, this.gridBagConstraintsResumenUsuario);


	this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
	this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResumenUsuario.gridy = 0;
	this.gridBagConstraintsResumenUsuario.gridx = 0;
	this.gridBagConstraintsResumenUsuario.ipadx = 0;
	this.gridBagConstraintsResumenUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_usuarioResumenUsuario.add(jLabelid_usuarioResumenUsuario, this.gridBagConstraintsResumenUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
		//this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResumenUsuario.gridy = 0;
		this.gridBagConstraintsResumenUsuario.gridx = 2;
		this.gridBagConstraintsResumenUsuario.ipadx = 0;
		this.gridBagConstraintsResumenUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioResumenUsuario.add(jButtonid_usuarioResumenUsuarioBusqueda, this.gridBagConstraintsResumenUsuario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
		//this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResumenUsuario.gridy = 0;
		this.gridBagConstraintsResumenUsuario.gridx = 3;
		this.gridBagConstraintsResumenUsuario.ipadx = 0;
		this.gridBagConstraintsResumenUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioResumenUsuario.add(jButtonid_usuarioResumenUsuarioUpdate, this.gridBagConstraintsResumenUsuario);
	}

	this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
	this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResumenUsuario.gridy = 0;
	this.gridBagConstraintsResumenUsuario.gridx = 1;
	this.gridBagConstraintsResumenUsuario.ipadx = 0;
	this.gridBagConstraintsResumenUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_usuarioResumenUsuario.add(jComboBoxid_usuarioResumenUsuario, this.gridBagConstraintsResumenUsuario);


	this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
	this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResumenUsuario.gridy = 0;
	this.gridBagConstraintsResumenUsuario.gridx = 0;
	this.gridBagConstraintsResumenUsuario.ipadx = 0;
	this.gridBagConstraintsResumenUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_ingresosResumenUsuario.add(jLabelnumero_ingresosResumenUsuario, this.gridBagConstraintsResumenUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
		//this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResumenUsuario.gridy = 0;
		this.gridBagConstraintsResumenUsuario.gridx = 2;
		this.gridBagConstraintsResumenUsuario.ipadx = 0;
		this.gridBagConstraintsResumenUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_ingresosResumenUsuario.add(jButtonnumero_ingresosResumenUsuarioBusqueda, this.gridBagConstraintsResumenUsuario);
	}

	this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
	this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResumenUsuario.gridy = 0;
	this.gridBagConstraintsResumenUsuario.gridx = 1;
	this.gridBagConstraintsResumenUsuario.ipadx = 0;
	this.gridBagConstraintsResumenUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_ingresosResumenUsuario.add(jTextFieldnumero_ingresosResumenUsuario, this.gridBagConstraintsResumenUsuario);


	this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
	this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResumenUsuario.gridy = 0;
	this.gridBagConstraintsResumenUsuario.gridx = 0;
	this.gridBagConstraintsResumenUsuario.ipadx = 0;
	this.gridBagConstraintsResumenUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_error_ingresoResumenUsuario.add(jLabelnumero_error_ingresoResumenUsuario, this.gridBagConstraintsResumenUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
		//this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResumenUsuario.gridy = 0;
		this.gridBagConstraintsResumenUsuario.gridx = 2;
		this.gridBagConstraintsResumenUsuario.ipadx = 0;
		this.gridBagConstraintsResumenUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_error_ingresoResumenUsuario.add(jButtonnumero_error_ingresoResumenUsuarioBusqueda, this.gridBagConstraintsResumenUsuario);
	}

	this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
	this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResumenUsuario.gridy = 0;
	this.gridBagConstraintsResumenUsuario.gridx = 1;
	this.gridBagConstraintsResumenUsuario.ipadx = 0;
	this.gridBagConstraintsResumenUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_error_ingresoResumenUsuario.add(jTextFieldnumero_error_ingresoResumenUsuario, this.gridBagConstraintsResumenUsuario);


	this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
	this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResumenUsuario.gridy = 0;
	this.gridBagConstraintsResumenUsuario.gridx = 0;
	this.gridBagConstraintsResumenUsuario.ipadx = 0;
	this.gridBagConstraintsResumenUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_intentosResumenUsuario.add(jLabelnumero_intentosResumenUsuario, this.gridBagConstraintsResumenUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
		//this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResumenUsuario.gridy = 0;
		this.gridBagConstraintsResumenUsuario.gridx = 2;
		this.gridBagConstraintsResumenUsuario.ipadx = 0;
		this.gridBagConstraintsResumenUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_intentosResumenUsuario.add(jButtonnumero_intentosResumenUsuarioBusqueda, this.gridBagConstraintsResumenUsuario);
	}

	this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
	this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResumenUsuario.gridy = 0;
	this.gridBagConstraintsResumenUsuario.gridx = 1;
	this.gridBagConstraintsResumenUsuario.ipadx = 0;
	this.gridBagConstraintsResumenUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_intentosResumenUsuario.add(jTextFieldnumero_intentosResumenUsuario, this.gridBagConstraintsResumenUsuario);


	this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
	this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResumenUsuario.gridy = 0;
	this.gridBagConstraintsResumenUsuario.gridx = 0;
	this.gridBagConstraintsResumenUsuario.ipadx = 0;
	this.gridBagConstraintsResumenUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_cierresResumenUsuario.add(jLabelnumero_cierresResumenUsuario, this.gridBagConstraintsResumenUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
		//this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResumenUsuario.gridy = 0;
		this.gridBagConstraintsResumenUsuario.gridx = 2;
		this.gridBagConstraintsResumenUsuario.ipadx = 0;
		this.gridBagConstraintsResumenUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_cierresResumenUsuario.add(jButtonnumero_cierresResumenUsuarioBusqueda, this.gridBagConstraintsResumenUsuario);
	}

	this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
	this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResumenUsuario.gridy = 0;
	this.gridBagConstraintsResumenUsuario.gridx = 1;
	this.gridBagConstraintsResumenUsuario.ipadx = 0;
	this.gridBagConstraintsResumenUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_cierresResumenUsuario.add(jTextFieldnumero_cierresResumenUsuario, this.gridBagConstraintsResumenUsuario);


	this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
	this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResumenUsuario.gridy = 0;
	this.gridBagConstraintsResumenUsuario.gridx = 0;
	this.gridBagConstraintsResumenUsuario.ipadx = 0;
	this.gridBagConstraintsResumenUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_reiniciosResumenUsuario.add(jLabelnumero_reiniciosResumenUsuario, this.gridBagConstraintsResumenUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
		//this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResumenUsuario.gridy = 0;
		this.gridBagConstraintsResumenUsuario.gridx = 2;
		this.gridBagConstraintsResumenUsuario.ipadx = 0;
		this.gridBagConstraintsResumenUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_reiniciosResumenUsuario.add(jButtonnumero_reiniciosResumenUsuarioBusqueda, this.gridBagConstraintsResumenUsuario);
	}

	this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
	this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResumenUsuario.gridy = 0;
	this.gridBagConstraintsResumenUsuario.gridx = 1;
	this.gridBagConstraintsResumenUsuario.ipadx = 0;
	this.gridBagConstraintsResumenUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_reiniciosResumenUsuario.add(jTextFieldnumero_reiniciosResumenUsuario, this.gridBagConstraintsResumenUsuario);


	this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
	this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResumenUsuario.gridy = 0;
	this.gridBagConstraintsResumenUsuario.gridx = 0;
	this.gridBagConstraintsResumenUsuario.ipadx = 0;
	this.gridBagConstraintsResumenUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_ingreso_actualResumenUsuario.add(jLabelnumero_ingreso_actualResumenUsuario, this.gridBagConstraintsResumenUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
		//this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResumenUsuario.gridy = 0;
		this.gridBagConstraintsResumenUsuario.gridx = 2;
		this.gridBagConstraintsResumenUsuario.ipadx = 0;
		this.gridBagConstraintsResumenUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_ingreso_actualResumenUsuario.add(jButtonnumero_ingreso_actualResumenUsuarioBusqueda, this.gridBagConstraintsResumenUsuario);
	}

	this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
	this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResumenUsuario.gridy = 0;
	this.gridBagConstraintsResumenUsuario.gridx = 1;
	this.gridBagConstraintsResumenUsuario.ipadx = 0;
	this.gridBagConstraintsResumenUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_ingreso_actualResumenUsuario.add(jTextFieldnumero_ingreso_actualResumenUsuario, this.gridBagConstraintsResumenUsuario);


	this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
	this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResumenUsuario.gridy = 0;
	this.gridBagConstraintsResumenUsuario.gridx = 0;
	this.gridBagConstraintsResumenUsuario.ipadx = 0;
	this.gridBagConstraintsResumenUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_ultimo_ingresoResumenUsuario.add(jLabelfecha_ultimo_ingresoResumenUsuario, this.gridBagConstraintsResumenUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
		//this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResumenUsuario.gridy = 0;
		this.gridBagConstraintsResumenUsuario.gridx = 2;
		this.gridBagConstraintsResumenUsuario.ipadx = 0;
		this.gridBagConstraintsResumenUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_ultimo_ingresoResumenUsuario.add(jButtonfecha_ultimo_ingresoResumenUsuarioBusqueda, this.gridBagConstraintsResumenUsuario);
	}

	this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
	this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResumenUsuario.gridy = 0;
	this.gridBagConstraintsResumenUsuario.gridx = 1;
	this.gridBagConstraintsResumenUsuario.ipadx = 0;
	this.gridBagConstraintsResumenUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_ultimo_ingresoResumenUsuario.add(jDateChooserfecha_ultimo_ingresoResumenUsuario, this.gridBagConstraintsResumenUsuario);


	this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
	this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResumenUsuario.gridy = 0;
	this.gridBagConstraintsResumenUsuario.gridx = 0;
	this.gridBagConstraintsResumenUsuario.ipadx = 0;
	this.gridBagConstraintsResumenUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_ultimo_error_ingresoResumenUsuario.add(jLabelfecha_ultimo_error_ingresoResumenUsuario, this.gridBagConstraintsResumenUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
		//this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResumenUsuario.gridy = 0;
		this.gridBagConstraintsResumenUsuario.gridx = 2;
		this.gridBagConstraintsResumenUsuario.ipadx = 0;
		this.gridBagConstraintsResumenUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_ultimo_error_ingresoResumenUsuario.add(jButtonfecha_ultimo_error_ingresoResumenUsuarioBusqueda, this.gridBagConstraintsResumenUsuario);
	}

	this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
	this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResumenUsuario.gridy = 0;
	this.gridBagConstraintsResumenUsuario.gridx = 1;
	this.gridBagConstraintsResumenUsuario.ipadx = 0;
	this.gridBagConstraintsResumenUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_ultimo_error_ingresoResumenUsuario.add(jDateChooserfecha_ultimo_error_ingresoResumenUsuario, this.gridBagConstraintsResumenUsuario);


	this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
	this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResumenUsuario.gridy = 0;
	this.gridBagConstraintsResumenUsuario.gridx = 0;
	this.gridBagConstraintsResumenUsuario.ipadx = 0;
	this.gridBagConstraintsResumenUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_ultimo_intentoResumenUsuario.add(jLabelfecha_ultimo_intentoResumenUsuario, this.gridBagConstraintsResumenUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
		//this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResumenUsuario.gridy = 0;
		this.gridBagConstraintsResumenUsuario.gridx = 2;
		this.gridBagConstraintsResumenUsuario.ipadx = 0;
		this.gridBagConstraintsResumenUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_ultimo_intentoResumenUsuario.add(jButtonfecha_ultimo_intentoResumenUsuarioBusqueda, this.gridBagConstraintsResumenUsuario);
	}

	this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
	this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResumenUsuario.gridy = 0;
	this.gridBagConstraintsResumenUsuario.gridx = 1;
	this.gridBagConstraintsResumenUsuario.ipadx = 0;
	this.gridBagConstraintsResumenUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_ultimo_intentoResumenUsuario.add(jDateChooserfecha_ultimo_intentoResumenUsuario, this.gridBagConstraintsResumenUsuario);


	this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
	this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResumenUsuario.gridy = 0;
	this.gridBagConstraintsResumenUsuario.gridx = 0;
	this.gridBagConstraintsResumenUsuario.ipadx = 0;
	this.gridBagConstraintsResumenUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_ultimo_cierreResumenUsuario.add(jLabelfecha_ultimo_cierreResumenUsuario, this.gridBagConstraintsResumenUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
		//this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResumenUsuario.gridy = 0;
		this.gridBagConstraintsResumenUsuario.gridx = 2;
		this.gridBagConstraintsResumenUsuario.ipadx = 0;
		this.gridBagConstraintsResumenUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_ultimo_cierreResumenUsuario.add(jButtonfecha_ultimo_cierreResumenUsuarioBusqueda, this.gridBagConstraintsResumenUsuario);
	}

	this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
	this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResumenUsuario.gridy = 0;
	this.gridBagConstraintsResumenUsuario.gridx = 1;
	this.gridBagConstraintsResumenUsuario.ipadx = 0;
	this.gridBagConstraintsResumenUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_ultimo_cierreResumenUsuario.add(jDateChooserfecha_ultimo_cierreResumenUsuario, this.gridBagConstraintsResumenUsuario);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
	this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsResumenUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsResumenUsuario.gridy = iYPanelCamposResumenUsuario;
	this.gridBagConstraintsResumenUsuario.gridx = iXPanelCamposResumenUsuario++;
	this.gridBagConstraintsResumenUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsResumenUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposResumenUsuario.add(this.jPanelidResumenUsuario, this.gridBagConstraintsResumenUsuario);



	if(iXPanelCamposResumenUsuario % 1==0) {
		iXPanelCamposResumenUsuario=0;
		iYPanelCamposResumenUsuario++;
	}
	this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
	this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsResumenUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsResumenUsuario.gridy = iYPanelCamposResumenUsuario;
	this.gridBagConstraintsResumenUsuario.gridx = iXPanelCamposResumenUsuario++;
	this.gridBagConstraintsResumenUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsResumenUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposResumenUsuario.add(this.jPanelnumero_ingresosResumenUsuario, this.gridBagConstraintsResumenUsuario);



	if(iXPanelCamposResumenUsuario % 1==0) {
		iXPanelCamposResumenUsuario=0;
		iYPanelCamposResumenUsuario++;
	}
	this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
	this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsResumenUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsResumenUsuario.gridy = iYPanelCamposResumenUsuario;
	this.gridBagConstraintsResumenUsuario.gridx = iXPanelCamposResumenUsuario++;
	this.gridBagConstraintsResumenUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsResumenUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposResumenUsuario.add(this.jPanelnumero_error_ingresoResumenUsuario, this.gridBagConstraintsResumenUsuario);



	if(iXPanelCamposResumenUsuario % 1==0) {
		iXPanelCamposResumenUsuario=0;
		iYPanelCamposResumenUsuario++;
	}
	this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
	this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsResumenUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsResumenUsuario.gridy = iYPanelCamposResumenUsuario;
	this.gridBagConstraintsResumenUsuario.gridx = iXPanelCamposResumenUsuario++;
	this.gridBagConstraintsResumenUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsResumenUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposResumenUsuario.add(this.jPanelnumero_intentosResumenUsuario, this.gridBagConstraintsResumenUsuario);



	if(iXPanelCamposResumenUsuario % 1==0) {
		iXPanelCamposResumenUsuario=0;
		iYPanelCamposResumenUsuario++;
	}
	this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
	this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsResumenUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsResumenUsuario.gridy = iYPanelCamposResumenUsuario;
	this.gridBagConstraintsResumenUsuario.gridx = iXPanelCamposResumenUsuario++;
	this.gridBagConstraintsResumenUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsResumenUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposResumenUsuario.add(this.jPanelnumero_cierresResumenUsuario, this.gridBagConstraintsResumenUsuario);



	if(iXPanelCamposResumenUsuario % 1==0) {
		iXPanelCamposResumenUsuario=0;
		iYPanelCamposResumenUsuario++;
	}
	this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
	this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsResumenUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsResumenUsuario.gridy = iYPanelCamposResumenUsuario;
	this.gridBagConstraintsResumenUsuario.gridx = iXPanelCamposResumenUsuario++;
	this.gridBagConstraintsResumenUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsResumenUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposResumenUsuario.add(this.jPanelnumero_reiniciosResumenUsuario, this.gridBagConstraintsResumenUsuario);



	if(iXPanelCamposResumenUsuario % 1==0) {
		iXPanelCamposResumenUsuario=0;
		iYPanelCamposResumenUsuario++;
	}
	this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
	this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsResumenUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsResumenUsuario.gridy = iYPanelCamposResumenUsuario;
	this.gridBagConstraintsResumenUsuario.gridx = iXPanelCamposResumenUsuario++;
	this.gridBagConstraintsResumenUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsResumenUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposResumenUsuario.add(this.jPanelnumero_ingreso_actualResumenUsuario, this.gridBagConstraintsResumenUsuario);



	if(iXPanelCamposResumenUsuario % 1==0) {
		iXPanelCamposResumenUsuario=0;
		iYPanelCamposResumenUsuario++;
	}
	this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
	this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsResumenUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsResumenUsuario.gridy = iYPanelCamposResumenUsuario;
	this.gridBagConstraintsResumenUsuario.gridx = iXPanelCamposResumenUsuario++;
	this.gridBagConstraintsResumenUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsResumenUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposResumenUsuario.add(this.jPanelfecha_ultimo_ingresoResumenUsuario, this.gridBagConstraintsResumenUsuario);



	if(iXPanelCamposResumenUsuario % 1==0) {
		iXPanelCamposResumenUsuario=0;
		iYPanelCamposResumenUsuario++;
	}
	this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
	this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsResumenUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsResumenUsuario.gridy = iYPanelCamposResumenUsuario;
	this.gridBagConstraintsResumenUsuario.gridx = iXPanelCamposResumenUsuario++;
	this.gridBagConstraintsResumenUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsResumenUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposResumenUsuario.add(this.jPanelfecha_ultimo_error_ingresoResumenUsuario, this.gridBagConstraintsResumenUsuario);



	if(iXPanelCamposResumenUsuario % 1==0) {
		iXPanelCamposResumenUsuario=0;
		iYPanelCamposResumenUsuario++;
	}
	this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
	this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsResumenUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsResumenUsuario.gridy = iYPanelCamposResumenUsuario;
	this.gridBagConstraintsResumenUsuario.gridx = iXPanelCamposResumenUsuario++;
	this.gridBagConstraintsResumenUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsResumenUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposResumenUsuario.add(this.jPanelfecha_ultimo_intentoResumenUsuario, this.gridBagConstraintsResumenUsuario);



	if(iXPanelCamposResumenUsuario % 1==0) {
		iXPanelCamposResumenUsuario=0;
		iYPanelCamposResumenUsuario++;
	}
	this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
	this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsResumenUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsResumenUsuario.gridy = iYPanelCamposResumenUsuario;
	this.gridBagConstraintsResumenUsuario.gridx = iXPanelCamposResumenUsuario++;
	this.gridBagConstraintsResumenUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsResumenUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposResumenUsuario.add(this.jPanelfecha_ultimo_cierreResumenUsuario, this.gridBagConstraintsResumenUsuario);



	if(iXPanelCamposResumenUsuario % 1==0) {
		iXPanelCamposResumenUsuario=0;
		iYPanelCamposResumenUsuario++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
	this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsResumenUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsResumenUsuario.gridy = iYPanelCamposOcultosResumenUsuario;
	this.gridBagConstraintsResumenUsuario.gridx = iXPanelCamposOcultosResumenUsuario++;
	this.gridBagConstraintsResumenUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsResumenUsuario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosResumenUsuario.add(this.jPanelid_usuarioResumenUsuario, this.gridBagConstraintsResumenUsuario);



	if(iXPanelCamposOcultosResumenUsuario % 1==0) {
		iXPanelCamposOcultosResumenUsuario=0;
		iYPanelCamposOcultosResumenUsuario++;
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
			
		GridBagLayout gridaBagLayoutAccionesResumenUsuario= new GridBagLayout();
		this.jPanelAccionesResumenUsuario.setLayout(gridaBagLayoutAccionesResumenUsuario);
		
		GridBagLayout gridaBagLayoutAccionesFormularioResumenUsuario= new GridBagLayout();
		this.jPanelAccionesFormularioResumenUsuario.setLayout(gridaBagLayoutAccionesFormularioResumenUsuario);
		
		this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
		this.gridBagConstraintsResumenUsuario.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsResumenUsuario.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioResumenUsuario.add(this.jComboBoxTiposAccionesFormularioResumenUsuario, this.gridBagConstraintsResumenUsuario);

		this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
		this.gridBagConstraintsResumenUsuario.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsResumenUsuario.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioResumenUsuario.add(this.jCheckBoxPostAccionNuevoResumenUsuario, this.gridBagConstraintsResumenUsuario);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.resumenusuarioSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
			this.gridBagConstraintsResumenUsuario.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsResumenUsuario.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioResumenUsuario.add(this.jCheckBoxPostAccionSinCerrarResumenUsuario, this.gridBagConstraintsResumenUsuario);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.resumenusuarioSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.resumenusuarioSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
			this.gridBagConstraintsResumenUsuario.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsResumenUsuario.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioResumenUsuario.add(this.jCheckBoxPostAccionSinMensajeResumenUsuario, this.gridBagConstraintsResumenUsuario);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
		this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsResumenUsuario.gridy = 0;
		this.gridBagConstraintsResumenUsuario.gridx = iPosXAccion++;
			
		this.jPanelAccionesResumenUsuario.add(this.jButtonModificarResumenUsuario, this.gridBagConstraintsResumenUsuario);							

		this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
		this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsResumenUsuario.gridy = 0;
		this.gridBagConstraintsResumenUsuario.gridx =iPosXAccion++;
			
		this.jPanelAccionesResumenUsuario.add(this.jButtonEliminarResumenUsuario, this.gridBagConstraintsResumenUsuario);
		
			
		this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
		this.gridBagConstraintsResumenUsuario.gridy = 0;		
		this.gridBagConstraintsResumenUsuario.gridx = iPosXAccion++;
		
		this.jPanelAccionesResumenUsuario.add(this.jButtonActualizarResumenUsuario, this.gridBagConstraintsResumenUsuario);


		this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
		this.gridBagConstraintsResumenUsuario.gridy = 0;		
		this.gridBagConstraintsResumenUsuario.gridx = iPosXAccion++;
		
		this.jPanelAccionesResumenUsuario.add(this.jButtonGuardarCambiosResumenUsuario, this.gridBagConstraintsResumenUsuario);	
		
		this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
		this.gridBagConstraintsResumenUsuario.gridy = 0;		
		this.gridBagConstraintsResumenUsuario.gridx =iPosXAccion++;
		
		this.jPanelAccionesResumenUsuario.add(this.jButtonCancelarResumenUsuario, this.gridBagConstraintsResumenUsuario);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutResumenUsuario = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutResumenUsuario);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.resumenusuarioSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsResumenUsuario = new GridBagConstraints();						
			this.gridBagConstraintsResumenUsuario.gridy = iGridyPrincipal++;
			this.gridBagConstraintsResumenUsuario.gridx = 0;		
			//this.gridBagConstraintsResumenUsuario.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResumenUsuario.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsResumenUsuario.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
		this.gridBagConstraintsResumenUsuario.gridy =iGridyPrincipal++;
		this.gridBagConstraintsResumenUsuario.gridx =0;
		this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsResumenUsuario.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosResumenUsuario, this.gridBagConstraintsResumenUsuario);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ResumenUsuarioJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleResumenUsuario = new ResumenUsuarioBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Resumen Usuario DATOS");
			
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
			
	        //this.setTitle("[FOR] - Resumen Usuario DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Resumen Usuario Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ResumenUsuarioModel resumenusuarioModel=new ResumenUsuarioModel(this);
			
			//SI USARA CLASE INTERNA
			//ResumenUsuarioModel.ResumenUsuarioFocusTraversalPolicy resumenusuarioFocusTraversalPolicy = resumenusuarioModel.new ResumenUsuarioFocusTraversalPolicy(this);
			
			//resumenusuarioFocusTraversalPolicy.setresumenusuarioJInternalFrame(this);
			
			this.setFocusTraversalPolicy(resumenusuarioModel);
			
			
			this.jContentPaneDetalleResumenUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleResumenUsuario = new GridBagLayout();	
			this.jContentPaneDetalleResumenUsuario.setLayout(gridaBagLayoutDetalleResumenUsuario);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosResumenUsuario = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
				this.gridBagConstraintsResumenUsuario.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsResumenUsuario.gridx = 0;
					
				
				this.jContentPaneDetalleResumenUsuario.add(jTtoolBarDetalleResumenUsuario, gridBagConstraintsResumenUsuario);								
				
}
			
			this.jScrollPanelDatosEdicionResumenUsuario=   new JScrollPane(jContentPaneDetalleResumenUsuario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionResumenUsuario.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionResumenUsuario.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionResumenUsuario.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralResumenUsuario=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralResumenUsuario.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralResumenUsuario.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralResumenUsuario.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
			
			
	        this.gridBagConstraintsResumenUsuario.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsResumenUsuario.gridx = 0;
	        
			this.jContentPaneDetalleResumenUsuario.add(jPanelCamposResumenUsuario, gridBagConstraintsResumenUsuario);
			
			
			
			
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
						&& resumenusuarioSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.resumenusuarioSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsResumenUsuario= new GridBagConstraints();
						this.gridBagConstraintsResumenUsuario.gridy = iGridyRelaciones++;
						this.gridBagConstraintsResumenUsuario.gridx = 0;
						this.jContentPaneDetalleResumenUsuario.add(this.jTabbedPaneRelacionesResumenUsuario, this.gridBagConstraintsResumenUsuario);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesResumenUsuario.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosResumenUsuario.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
					this.gridBagConstraintsResumenUsuario.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsResumenUsuario.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsResumenUsuario.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsResumenUsuario.gridx = 0;
					
				
					this.jContentPaneDetalleResumenUsuario.add(jPanelCamposOcultosResumenUsuario, gridBagConstraintsResumenUsuario);
				
					this.jPanelCamposOcultosResumenUsuario.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
			this.gridBagConstraintsResumenUsuario.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsResumenUsuario.gridx = 0;
	        this.gridBagConstraintsResumenUsuario.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleResumenUsuario.add(this.jPanelAccionesFormularioResumenUsuario, this.gridBagConstraintsResumenUsuario);							
			
			
			
			this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
	        this.gridBagConstraintsResumenUsuario.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsResumenUsuario.gridx = 0;
	        
			
			this.jContentPaneDetalleResumenUsuario.add(this.jPanelAccionesResumenUsuario, this.gridBagConstraintsResumenUsuario);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionResumenUsuario);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionResumenUsuario=   new JScrollPane(this.jPanelCamposResumenUsuario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionResumenUsuario.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionResumenUsuario.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionResumenUsuario.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
			this.gridBagConstraintsResumenUsuario.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsResumenUsuario.gridx = 0;
			this.gridBagConstraintsResumenUsuario.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsResumenUsuario.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsResumenUsuario.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionResumenUsuario, this.gridBagConstraintsResumenUsuario);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
			this.gridBagConstraintsResumenUsuario.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsResumenUsuario.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioResumenUsuario, this.gridBagConstraintsResumenUsuario);			
			
			this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
			this.gridBagConstraintsResumenUsuario.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsResumenUsuario.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesResumenUsuario, this.gridBagConstraintsResumenUsuario);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
		this.gridBagConstraintsResumenUsuario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsResumenUsuario.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposResumenUsuario, this.gridBagConstraintsResumenUsuario);
			
			
		this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
		this.gridBagConstraintsResumenUsuario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsResumenUsuario.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosResumenUsuario, this.gridBagConstraintsResumenUsuario);
		
			
		this.gridBagConstraintsResumenUsuario = new GridBagConstraints();
		this.gridBagConstraintsResumenUsuario.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsResumenUsuario.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesResumenUsuario, this.gridBagConstraintsResumenUsuario);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralResumenUsuario;//jContentPane;
		
		return jScrollPanelDatosEdicionResumenUsuario;
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
