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
import com.bydan.erp.seguridad.util.AuditoriaDetalleConstantesFunciones;

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
public class AuditoriaDetalleDetalleFormJInternalFrame extends AuditoriaDetalleBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleAuditoriaDetalle;
	
	protected JMenuBar jmenuBarDetalleAuditoriaDetalle;
	
	protected JMenu jmenuDetalleAuditoriaDetalle;
	protected JMenu jmenuDetalleArchivoAuditoriaDetalle;
	protected JMenu jmenuDetalleAccionesAuditoriaDetalle;
	protected JMenu jmenuDetalleDatosAuditoriaDetalle;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleAuditoriaDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutAuditoriaDetalle;	
	protected GridBagConstraints gridBagConstraintsAuditoriaDetalle;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected AuditoriaDetalleBeanSwingJInternalFrameAdditional jInternalFrameDetalleAuditoriaDetalle;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected AuditoriaBeanSwingJInternalFrame auditoriaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_auditoria="";
	
	public AuditoriaDetalleSessionBean auditoriadetalleSessionBean;
	
	
	
	
	public AuditoriaSessionBean auditoriaSessionBean;	
	
	public AuditoriaDetalleLogic auditoriadetalleLogic;
	
	public JScrollPane jScrollPanelDatosAuditoriaDetalle;
	public JScrollPane jScrollPanelDatosEdicionAuditoriaDetalle;
	public JScrollPane jScrollPanelDatosGeneralAuditoriaDetalle;
	
	protected JPanel jPanelCamposAuditoriaDetalle;    
	protected JPanel jPanelCamposOcultosAuditoriaDetalle;    	
	protected JPanel jPanelAccionesAuditoriaDetalle;
	protected JPanel jPanelAccionesFormularioAuditoriaDetalle;
    
	
	
	protected Integer iXPanelCamposAuditoriaDetalle=0;
	protected Integer iYPanelCamposAuditoriaDetalle=0;
	
	protected Integer iXPanelCamposOcultosAuditoriaDetalle=0;
	protected Integer iYPanelCamposOcultosAuditoriaDetalle=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoAuditoriaDetalle;
	public JButton jButtonModificarAuditoriaDetalle;
	public JButton jButtonActualizarAuditoriaDetalle;
    public JButton jButtonEliminarAuditoriaDetalle;
	public JButton jButtonCancelarAuditoriaDetalle;
    public JButton jButtonGuardarCambiosAuditoriaDetalle;
	public JButton jButtonGuardarCambiosTablaAuditoriaDetalle;
	protected JButton jButtonCerrarAuditoriaDetalle;
	
	
	protected JButton jButtonProcesarInformacionAuditoriaDetalle;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoAuditoriaDetalle;
	protected JCheckBox jCheckBoxPostAccionSinCerrarAuditoriaDetalle;
	protected JCheckBox jCheckBoxPostAccionSinMensajeAuditoriaDetalle;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarAuditoriaDetalle;
	protected JButton jButtonModificarToolBarAuditoriaDetalle;
	protected JButton jButtonActualizarToolBarAuditoriaDetalle;
    protected JButton jButtonEliminarToolBarAuditoriaDetalle;
	protected JButton jButtonCancelarToolBarAuditoriaDetalle;
    protected JButton jButtonGuardarCambiosToolBarAuditoriaDetalle;
	protected JButton jButtonGuardarCambiosTablaToolBarAuditoriaDetalle;
	protected JButton jButtonMostrarOcultarTablaToolBarAuditoriaDetalle;
	protected JButton jButtonCerrarToolBarAuditoriaDetalle;
	
	protected JButton jButtonProcesarInformacionToolBarAuditoriaDetalle;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoAuditoriaDetalle;
	protected JMenuItem jMenuItemModificarAuditoriaDetalle;
	protected JMenuItem jMenuItemActualizarAuditoriaDetalle;
    protected JMenuItem jMenuItemEliminarAuditoriaDetalle;
	protected JMenuItem jMenuItemCancelarAuditoriaDetalle;
    protected JMenuItem jMenuItemGuardarCambiosAuditoriaDetalle;
	protected JMenuItem jMenuItemGuardarCambiosTablaAuditoriaDetalle;
	protected JMenuItem jMenuItemCerrarAuditoriaDetalle;
	protected JMenuItem jMenuItemDetalleCerrarAuditoriaDetalle;
	protected JMenuItem jMenuItemDetalleMostarOcultarAuditoriaDetalle;
	
	protected JMenuItem jMenuItemProcesarInformacionAuditoriaDetalle;
	protected JMenuItem jMenuItemNuevoGuardarCambiosAuditoriaDetalle;
	protected JMenuItem jMenuItemMostrarOcultarAuditoriaDetalle;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesAuditoriaDetalle;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesAuditoriaDetalle;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesAuditoriaDetalle;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioAuditoriaDetalle;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidAuditoriaDetalle;
	public JLabel jLabelIdAuditoriaDetalle;
	public JLabel jLabelidAuditoriaDetalle;
	public JButton jButtonidAuditoriaDetalleBusqueda= new JButtonMe();

	public JPanel jPanelnombre_campoAuditoriaDetalle;
	public JLabel jLabelnombre_campoAuditoriaDetalle;
	public JTextArea jTextAreanombre_campoAuditoriaDetalle;
	public JScrollPane jscrollPanenombre_campoAuditoriaDetalle;
	public JButton jButtonnombre_campoAuditoriaDetalleBusqueda= new JButtonMe();

	public JPanel jPanelvalor_anteriorAuditoriaDetalle;
	public JLabel jLabelvalor_anteriorAuditoriaDetalle;
	public JTextArea jTextAreavalor_anteriorAuditoriaDetalle;
	public JScrollPane jscrollPanevalor_anteriorAuditoriaDetalle;
	public JButton jButtonvalor_anteriorAuditoriaDetalleBusqueda= new JButtonMe();

	public JPanel jPanelvalor_actualAuditoriaDetalle;
	public JLabel jLabelvalor_actualAuditoriaDetalle;
	public JTextArea jTextAreavalor_actualAuditoriaDetalle;
	public JScrollPane jscrollPanevalor_actualAuditoriaDetalle;
	public JButton jButtonvalor_actualAuditoriaDetalleBusqueda= new JButtonMe();

	
	public JPanel jPanelid_auditoriaAuditoriaDetalle;
	public JLabel jLabelid_auditoriaAuditoriaDetalle;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_auditoriaAuditoriaDetalle;
	public JButton jButtonid_auditoriaAuditoriaDetalle= new JButtonMe();
	public JButton jButtonid_auditoriaAuditoriaDetalleUpdate= new JButtonMe();
	public JButton jButtonid_auditoriaAuditoriaDetalleBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesAuditoriaDetalle;
	
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
	
	public AuditoriaDetalleDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposAuditoriaDetalle=new JPanel();
				this.jPanelAccionesFormularioAuditoriaDetalle=new JPanel();
				this.jmenuBarDetalleAuditoriaDetalle=new JMenuBar();
				this.jTtoolBarDetalleAuditoriaDetalle=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AuditoriaDetalleDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("AuditoriaDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public AuditoriaDetalleDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("AuditoriaDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AuditoriaDetalleDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("AuditoriaDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AuditoriaDetalleDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("AuditoriaDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AuditoriaDetalleDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("AuditoriaDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarAuditoriaDetalle() {
		return this.jButtonActualizarToolBarAuditoriaDetalle;
	}
	
	public JButton getjButtonEliminarToolBarAuditoriaDetalle() {
		return this.jButtonEliminarToolBarAuditoriaDetalle;
	}
	
	public JButton getjButtonCancelarToolBarAuditoriaDetalle() {
		return this.jButtonCancelarToolBarAuditoriaDetalle;
	}		
	
	public JButton getjButtonProcesarInformacionAuditoriaDetalle() {
		return this.jButtonProcesarInformacionAuditoriaDetalle;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionAuditoriaDetalle)	{
		this.jButtonProcesarInformacionAuditoriaDetalle = jButtonProcesarInformacionAuditoriaDetalle;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesAuditoriaDetalle() {
		return this.jComboBoxTiposAccionesAuditoriaDetalle;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesAuditoriaDetalle(
			JComboBox jComboBoxTiposRelacionesAuditoriaDetalle) {
		this.jComboBoxTiposRelacionesAuditoriaDetalle = jComboBoxTiposRelacionesAuditoriaDetalle;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesAuditoriaDetalle(
			JComboBox jComboBoxTiposAccionesAuditoriaDetalle) {
		this.jComboBoxTiposAccionesAuditoriaDetalle = jComboBoxTiposAccionesAuditoriaDetalle;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioAuditoriaDetalle() {
		return this.jComboBoxTiposAccionesFormularioAuditoriaDetalle;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioAuditoriaDetalle(
			JComboBox jComboBoxTiposAccionesFormularioAuditoriaDetalle) {
		this.jComboBoxTiposAccionesFormularioAuditoriaDetalle = jComboBoxTiposAccionesFormularioAuditoriaDetalle;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.auditoriadetalleSessionBean=new AuditoriaDetalleSessionBean();
		
		this.auditoriadetalleSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.auditoriadetalleSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.auditoriadetalleSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		AuditoriaDetalleJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		AuditoriaDetalleJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		AuditoriaDetalleJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Auditoria Detalle MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.auditoriadetalleSessionBean.getEsGuardarRelacionado()) {
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
	
		AuditoriaDetalleJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleAuditoriaDetalle= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarAuditoriaDetalle=new JButtonMe();
				this.jButtonModificarToolBarAuditoriaDetalle=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarAuditoriaDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarAuditoriaDetalle,this.jTtoolBarDetalleAuditoriaDetalle,
							"actualizar","actualizar","Actualizar"+" "+AuditoriaDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarAuditoriaDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarAuditoriaDetalle,this.jTtoolBarDetalleAuditoriaDetalle,
							"eliminar","eliminar","Eliminar"+" "+AuditoriaDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarAuditoriaDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarAuditoriaDetalle,this.jTtoolBarDetalleAuditoriaDetalle,
							"cancelar","cancelar","Cancelar"+" "+AuditoriaDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarAuditoriaDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarAuditoriaDetalle,this.jTtoolBarDetalleAuditoriaDetalle,
							"guardarcambios","guardarcambios","Guardar"+" "+AuditoriaDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarAuditoriaDetalle,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarAuditoriaDetalle,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarAuditoriaDetalle,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleAuditoriaDetalle=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleAuditoriaDetalle=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoAuditoriaDetalle=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesAuditoriaDetalle=new JMenuMe("Acciones");
		this.jmenuDetalleDatosAuditoriaDetalle=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoAuditoriaDetalle= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoAuditoriaDetalle.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoAuditoriaDetalle,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarAuditoriaDetalle= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarAuditoriaDetalle.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarAuditoriaDetalle,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarAuditoriaDetalle= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarAuditoriaDetalle.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarAuditoriaDetalle,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarAuditoriaDetalle= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarAuditoriaDetalle.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarAuditoriaDetalle,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarAuditoriaDetalle= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarAuditoriaDetalle.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarAuditoriaDetalle,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosAuditoriaDetalle= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosAuditoriaDetalle.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosAuditoriaDetalle,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarAuditoriaDetalle= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarAuditoriaDetalle.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarAuditoriaDetalle,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarAuditoriaDetalle= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarAuditoriaDetalle.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarAuditoriaDetalle,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarAuditoriaDetalle= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarAuditoriaDetalle.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarAuditoriaDetalle,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarAuditoriaDetalle= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarAuditoriaDetalle.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarAuditoriaDetalle,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoAuditoriaDetalle.add(this.jMenuItemDetalleCerrarAuditoriaDetalle);
		
		this.jmenuDetalleAccionesAuditoriaDetalle.add(this.jMenuItemActualizarAuditoriaDetalle);
		this.jmenuDetalleAccionesAuditoriaDetalle.add(this.jMenuItemEliminarAuditoriaDetalle);
		this.jmenuDetalleAccionesAuditoriaDetalle.add(this.jMenuItemCancelarAuditoriaDetalle);		
		
		//this.jmenuDetalleDatosAuditoriaDetalle.add(this.jMenuItemDetalleAbrirOrderByAuditoriaDetalle);				
		this.jmenuDetalleDatosAuditoriaDetalle.add(this.jMenuItemDetalleMostarOcultarAuditoriaDetalle);				
				
		//this.jmenuDetalleAccionesAuditoriaDetalle.add(this.jMenuItemGuardarCambiosAuditoriaDetalle);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleAuditoriaDetalle.add(this.jmenuDetalleArchivoAuditoriaDetalle);		
		this.jmenuBarDetalleAuditoriaDetalle.add(this.jmenuDetalleAccionesAuditoriaDetalle);		
		this.jmenuBarDetalleAuditoriaDetalle.add(this.jmenuDetalleDatosAuditoriaDetalle);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleAuditoriaDetalle);				
	}
	
	
	public void inicializarElementosCamposAuditoriaDetalle() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdAuditoriaDetalle = new JLabelMe();
		jLabelIdAuditoriaDetalle.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdAuditoriaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdAuditoriaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdAuditoriaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdAuditoriaDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidAuditoriaDetalle = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidAuditoriaDetalle.setToolTipText(AuditoriaDetalleConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutAuditoriaDetalle= new GridBagLayout();

		this.jPanelidAuditoriaDetalle.setLayout(this.gridaBagLayoutAuditoriaDetalle);

		jLabelidAuditoriaDetalle = new JLabel();
		jLabelidAuditoriaDetalle.setText("Id");

		jLabelidAuditoriaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidAuditoriaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidAuditoriaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombre_campoAuditoriaDetalle = new JLabelMe();
		this.jLabelnombre_campoAuditoriaDetalle.setText(""+AuditoriaDetalleConstantesFunciones.LABEL_NOMBRECAMPO+" : *");
		this.jLabelnombre_campoAuditoriaDetalle.setToolTipText("Nombre Del Campo");
		this.jLabelnombre_campoAuditoriaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_campoAuditoriaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_campoAuditoriaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_campoAuditoriaDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_campoAuditoriaDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_campoAuditoriaDetalle.setToolTipText(AuditoriaDetalleConstantesFunciones.LABEL_NOMBRECAMPO);
		this.gridaBagLayoutAuditoriaDetalle = new GridBagLayout();
		this.jPanelnombre_campoAuditoriaDetalle.setLayout(this.gridaBagLayoutAuditoriaDetalle);


		jTextAreanombre_campoAuditoriaDetalle= new JTextAreaMe();
		jTextAreanombre_campoAuditoriaDetalle.setEnabled(false);
		jTextAreanombre_campoAuditoriaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_campoAuditoriaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_campoAuditoriaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_campoAuditoriaDetalle.setLineWrap(true);
		jTextAreanombre_campoAuditoriaDetalle.setWrapStyleWord(true);
		jTextAreanombre_campoAuditoriaDetalle.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_campoAuditoriaDetalle.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_campoAuditoriaDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_campoAuditoriaDetalle = new JScrollPane(jTextAreanombre_campoAuditoriaDetalle);
		jscrollPanenombre_campoAuditoriaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_campoAuditoriaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_campoAuditoriaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_campoAuditoriaDetalleBusqueda= new JButtonMe();
		this.jButtonnombre_campoAuditoriaDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_campoAuditoriaDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_campoAuditoriaDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_campoAuditoriaDetalleBusqueda.setText("U");
		this.jButtonnombre_campoAuditoriaDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_campoAuditoriaDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_campoAuditoriaDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_campoAuditoriaDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_campoAuditoriaDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_campoAuditoriaDetalleBusqueda"));

		if(this.auditoriadetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_campoAuditoriaDetalleBusqueda.setVisible(false);		}


					
		this.jLabelvalor_anteriorAuditoriaDetalle = new JLabelMe();
		this.jLabelvalor_anteriorAuditoriaDetalle.setText(""+AuditoriaDetalleConstantesFunciones.LABEL_VALORANTERIOR+" : *");
		this.jLabelvalor_anteriorAuditoriaDetalle.setToolTipText("Valor Anterior");
		this.jLabelvalor_anteriorAuditoriaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_anteriorAuditoriaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_anteriorAuditoriaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_anteriorAuditoriaDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_anteriorAuditoriaDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_anteriorAuditoriaDetalle.setToolTipText(AuditoriaDetalleConstantesFunciones.LABEL_VALORANTERIOR);
		this.gridaBagLayoutAuditoriaDetalle = new GridBagLayout();
		this.jPanelvalor_anteriorAuditoriaDetalle.setLayout(this.gridaBagLayoutAuditoriaDetalle);


		jTextAreavalor_anteriorAuditoriaDetalle= new JTextAreaMe();
		jTextAreavalor_anteriorAuditoriaDetalle.setEnabled(false);
		jTextAreavalor_anteriorAuditoriaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreavalor_anteriorAuditoriaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreavalor_anteriorAuditoriaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreavalor_anteriorAuditoriaDetalle.setLineWrap(true);
		jTextAreavalor_anteriorAuditoriaDetalle.setWrapStyleWord(true);
		jTextAreavalor_anteriorAuditoriaDetalle.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreavalor_anteriorAuditoriaDetalle.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreavalor_anteriorAuditoriaDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanevalor_anteriorAuditoriaDetalle = new JScrollPane(jTextAreavalor_anteriorAuditoriaDetalle);
		jscrollPanevalor_anteriorAuditoriaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanevalor_anteriorAuditoriaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanevalor_anteriorAuditoriaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonvalor_anteriorAuditoriaDetalleBusqueda= new JButtonMe();
		this.jButtonvalor_anteriorAuditoriaDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_anteriorAuditoriaDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_anteriorAuditoriaDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_anteriorAuditoriaDetalleBusqueda.setText("U");
		this.jButtonvalor_anteriorAuditoriaDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_anteriorAuditoriaDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_anteriorAuditoriaDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreavalor_anteriorAuditoriaDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreavalor_anteriorAuditoriaDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_anteriorAuditoriaDetalleBusqueda"));

		if(this.auditoriadetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_anteriorAuditoriaDetalleBusqueda.setVisible(false);		}


					
		this.jLabelvalor_actualAuditoriaDetalle = new JLabelMe();
		this.jLabelvalor_actualAuditoriaDetalle.setText(""+AuditoriaDetalleConstantesFunciones.LABEL_VALORACTUAL+" : *");
		this.jLabelvalor_actualAuditoriaDetalle.setToolTipText("Valor Actual");
		this.jLabelvalor_actualAuditoriaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_actualAuditoriaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_actualAuditoriaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_actualAuditoriaDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_actualAuditoriaDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_actualAuditoriaDetalle.setToolTipText(AuditoriaDetalleConstantesFunciones.LABEL_VALORACTUAL);
		this.gridaBagLayoutAuditoriaDetalle = new GridBagLayout();
		this.jPanelvalor_actualAuditoriaDetalle.setLayout(this.gridaBagLayoutAuditoriaDetalle);


		jTextAreavalor_actualAuditoriaDetalle= new JTextAreaMe();
		jTextAreavalor_actualAuditoriaDetalle.setEnabled(false);
		jTextAreavalor_actualAuditoriaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreavalor_actualAuditoriaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreavalor_actualAuditoriaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreavalor_actualAuditoriaDetalle.setLineWrap(true);
		jTextAreavalor_actualAuditoriaDetalle.setWrapStyleWord(true);
		jTextAreavalor_actualAuditoriaDetalle.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreavalor_actualAuditoriaDetalle.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreavalor_actualAuditoriaDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanevalor_actualAuditoriaDetalle = new JScrollPane(jTextAreavalor_actualAuditoriaDetalle);
		jscrollPanevalor_actualAuditoriaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanevalor_actualAuditoriaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanevalor_actualAuditoriaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonvalor_actualAuditoriaDetalleBusqueda= new JButtonMe();
		this.jButtonvalor_actualAuditoriaDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_actualAuditoriaDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_actualAuditoriaDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_actualAuditoriaDetalleBusqueda.setText("U");
		this.jButtonvalor_actualAuditoriaDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_actualAuditoriaDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_actualAuditoriaDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreavalor_actualAuditoriaDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreavalor_actualAuditoriaDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_actualAuditoriaDetalleBusqueda"));

		if(this.auditoriadetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_actualAuditoriaDetalleBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysAuditoriaDetalle() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_auditoriaAuditoriaDetalle = new JLabelMe();
		this.jLabelid_auditoriaAuditoriaDetalle.setText(""+AuditoriaDetalleConstantesFunciones.LABEL_IDAUDITORIA+" : *");
		this.jLabelid_auditoriaAuditoriaDetalle.setToolTipText("Auditoria");
		this.jLabelid_auditoriaAuditoriaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_auditoriaAuditoriaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_auditoriaAuditoriaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_auditoriaAuditoriaDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_auditoriaAuditoriaDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_auditoriaAuditoriaDetalle.setToolTipText(AuditoriaDetalleConstantesFunciones.LABEL_IDAUDITORIA);
		this.gridaBagLayoutAuditoriaDetalle = new GridBagLayout();
		this.jPanelid_auditoriaAuditoriaDetalle.setLayout(this.gridaBagLayoutAuditoriaDetalle);


		jComboBoxid_auditoriaAuditoriaDetalle= new JComboBoxMe();
		jComboBoxid_auditoriaAuditoriaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_auditoriaAuditoriaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_auditoriaAuditoriaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_auditoriaAuditoriaDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_auditoriaAuditoriaDetalle= new JButtonMe();
		this.jButtonid_auditoriaAuditoriaDetalle.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_auditoriaAuditoriaDetalle.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_auditoriaAuditoriaDetalle.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_auditoriaAuditoriaDetalle.setText("Buscar");
		this.jButtonid_auditoriaAuditoriaDetalle.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_auditoriaAuditoriaDetalle.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_auditoriaAuditoriaDetalle,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_auditoriaAuditoriaDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_auditoriaAuditoriaDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_auditoriaAuditoriaDetalle"));

		this.jButtonid_auditoriaAuditoriaDetalleBusqueda= new JButtonMe();
		this.jButtonid_auditoriaAuditoriaDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_auditoriaAuditoriaDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_auditoriaAuditoriaDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_auditoriaAuditoriaDetalleBusqueda.setText("U");
		this.jButtonid_auditoriaAuditoriaDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_auditoriaAuditoriaDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_auditoriaAuditoriaDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_auditoriaAuditoriaDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_auditoriaAuditoriaDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_auditoriaAuditoriaDetalleBusqueda"));

		if(this.auditoriadetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_auditoriaAuditoriaDetalleBusqueda.setVisible(false);		}

		this.jButtonid_auditoriaAuditoriaDetalleUpdate= new JButtonMe();
		this.jButtonid_auditoriaAuditoriaDetalleUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_auditoriaAuditoriaDetalleUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_auditoriaAuditoriaDetalleUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_auditoriaAuditoriaDetalleUpdate.setText("U");
		this.jButtonid_auditoriaAuditoriaDetalleUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_auditoriaAuditoriaDetalleUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_auditoriaAuditoriaDetalleUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_auditoriaAuditoriaDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_auditoriaAuditoriaDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_auditoriaAuditoriaDetalleUpdate"));



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
		//this.jInternalFrameDetalleAuditoriaDetalle = new AuditoriaDetalleBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Auditoria Detalle DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutAuditoriaDetalle= new GridBagLayout();
		

		
		String sToolTipAuditoriaDetalle="";
		sToolTipAuditoriaDetalle=AuditoriaDetalleConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipAuditoriaDetalle+="(Seguridad.AuditoriaDetalle)";
		}
		
		if(!this.auditoriadetalleSessionBean.getEsGuardarRelacionado()) {
			sToolTipAuditoriaDetalle+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoAuditoriaDetalle = new JButtonMe();
		this.jButtonModificarAuditoriaDetalle = new JButtonMe();
        this.jButtonActualizarAuditoriaDetalle = new JButtonMe();
        this.jButtonEliminarAuditoriaDetalle = new JButtonMe();
        this.jButtonCancelarAuditoriaDetalle = new JButtonMe();
        this.jButtonGuardarCambiosAuditoriaDetalle = new JButtonMe();
		this.jButtonGuardarCambiosTablaAuditoriaDetalle = new JButtonMe();
		this.jButtonCerrarAuditoriaDetalle = new JButtonMe();
		
		this.jScrollPanelDatosAuditoriaDetalle = new JScrollPane();   
        this.jScrollPanelDatosEdicionAuditoriaDetalle = new JScrollPane();
		this.jScrollPanelDatosGeneralAuditoriaDetalle = new JScrollPane();
				
		
		
		this.jPanelCamposAuditoriaDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosAuditoriaDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesAuditoriaDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioAuditoriaDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Auditoria Detalle";
		
		if(!this.auditoriadetalleSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosAuditoriaDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Auditoria Detalles" + this.sPath));
		} else {
			this.jScrollPanelDatosAuditoriaDetalle.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionAuditoriaDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralAuditoriaDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposAuditoriaDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposAuditoriaDetalle.setName("jPanelCamposAuditoriaDetalle"); 

		this.jPanelCamposOcultosAuditoriaDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosAuditoriaDetalle.setName("jPanelCamposOcultosAuditoriaDetalle"); 

        this.jPanelAccionesAuditoriaDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesAuditoriaDetalle.setToolTipText("Acciones");
        this.jPanelAccionesAuditoriaDetalle.setName("Acciones"); 

		this.jPanelAccionesFormularioAuditoriaDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioAuditoriaDetalle.setToolTipText("Acciones");
        this.jPanelAccionesFormularioAuditoriaDetalle.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoAuditoriaDetalle.setText("Nuevo");
		this.jButtonModificarAuditoriaDetalle.setText("Editar");
        this.jButtonActualizarAuditoriaDetalle.setText("Actualizar");
        this.jButtonEliminarAuditoriaDetalle.setText("Eliminar");
        this.jButtonCancelarAuditoriaDetalle.setText("Cancelar");
        this.jButtonGuardarCambiosAuditoriaDetalle.setText("Guardar");
		this.jButtonGuardarCambiosTablaAuditoriaDetalle.setText("Guardar");
		this.jButtonCerrarAuditoriaDetalle.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoAuditoriaDetalle,"nuevo_button","Nuevo",this.auditoriadetalleSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarAuditoriaDetalle,"modificar_button","Editar",this.auditoriadetalleSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarAuditoriaDetalle,"actualizar_button","Actualizar",this.auditoriadetalleSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarAuditoriaDetalle,"eliminar_button","Eliminar",this.auditoriadetalleSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarAuditoriaDetalle,"cancelar_button","Cancelar",this.auditoriadetalleSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosAuditoriaDetalle,"guardarcambios_button","Guardar",this.auditoriadetalleSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaAuditoriaDetalle,"guardarcambiostabla_button","Guardar",this.auditoriadetalleSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarAuditoriaDetalle,"cerrar_button","Salir",this.auditoriadetalleSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoAuditoriaDetalle.setToolTipText("Nuevo"+" "+AuditoriaDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarAuditoriaDetalle.setToolTipText("Editar"+" "+AuditoriaDetalleConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarAuditoriaDetalle.setToolTipText("Actualizar"+" "+AuditoriaDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarAuditoriaDetalle.setToolTipText("Eliminar)"+" "+AuditoriaDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarAuditoriaDetalle.setToolTipText("Cancelar"+" "+AuditoriaDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosAuditoriaDetalle.setToolTipText("Guardar"+" "+AuditoriaDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaAuditoriaDetalle.setToolTipText("Guardar"+" "+AuditoriaDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarAuditoriaDetalle.setToolTipText("Salir"+" "+AuditoriaDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoAuditoriaDetalle";
		inputMap = this.jButtonNuevoAuditoriaDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoAuditoriaDetalle.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoAuditoriaDetalle"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarAuditoriaDetalle";
		inputMap = this.jButtonActualizarAuditoriaDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarAuditoriaDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarAuditoriaDetalle"));
		
		//ELIMINAR
		sMapKey = "EliminarAuditoriaDetalle";
		inputMap = this.jButtonEliminarAuditoriaDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarAuditoriaDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarAuditoriaDetalle"));
		
		//CANCELAR	
		sMapKey = "CancelarAuditoriaDetalle";
		inputMap = this.jButtonCancelarAuditoriaDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarAuditoriaDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarAuditoriaDetalle"));
		
		//CERRAR		
		sMapKey = "CerrarAuditoriaDetalle";
		inputMap = this.jButtonCerrarAuditoriaDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarAuditoriaDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarAuditoriaDetalle"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaAuditoriaDetalle";
		inputMap = this.jButtonGuardarCambiosTablaAuditoriaDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaAuditoriaDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaAuditoriaDetalle"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoAuditoriaDetalle = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoAuditoriaDetalle.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoAuditoriaDetalle.setToolTipText("Nuevo AuditoriaDetalle");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarAuditoriaDetalle = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarAuditoriaDetalle.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarAuditoriaDetalle.setToolTipText("Sin Cerrar Ventana AuditoriaDetalle");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeAuditoriaDetalle = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeAuditoriaDetalle.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeAuditoriaDetalle.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesAuditoriaDetalle = new JComboBoxMe();
		//this.jComboBoxTiposAccionesAuditoriaDetalle.setText("Accion");
		this.jComboBoxTiposAccionesAuditoriaDetalle.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioAuditoriaDetalle = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioAuditoriaDetalle.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioAuditoriaDetalle.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesAuditoriaDetalle = new JLabelMe();
		
		this.jLabelAccionesAuditoriaDetalle.setText("Acciones");		
		this.jLabelAccionesAuditoriaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAuditoriaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAuditoriaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposAuditoriaDetalle();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysAuditoriaDetalle();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesAuditoriaDetalle=new JTabbedPane();
		this.jTabbedPaneRelacionesAuditoriaDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesAuditoriaDetalle,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesAuditoriaDetalle.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAuditoriaDetalle.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAuditoriaDetalle.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioAuditoriaDetalle.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioAuditoriaDetalle.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioAuditoriaDetalle.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioAuditoriaDetalle, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposAuditoriaDetalle = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosAuditoriaDetalle = new GridBagLayout();
		
		this.jPanelCamposAuditoriaDetalle.setLayout(gridaBagLayoutCamposAuditoriaDetalle);
		this.jPanelCamposOcultosAuditoriaDetalle.setLayout(gridaBagLayoutCamposOcultosAuditoriaDetalle);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
	this.gridBagConstraintsAuditoriaDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAuditoriaDetalle.gridy = 0;
	this.gridBagConstraintsAuditoriaDetalle.gridx = 0;
	this.gridBagConstraintsAuditoriaDetalle.ipadx = 0;
	this.gridBagConstraintsAuditoriaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidAuditoriaDetalle.add(jLabelIdAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);



	this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
	this.gridBagConstraintsAuditoriaDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAuditoriaDetalle.gridy = 0;
	this.gridBagConstraintsAuditoriaDetalle.gridx = 1;
	this.gridBagConstraintsAuditoriaDetalle.ipadx = 0;
	this.gridBagConstraintsAuditoriaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidAuditoriaDetalle.add(jLabelidAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);


	this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
	this.gridBagConstraintsAuditoriaDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAuditoriaDetalle.gridy = 0;
	this.gridBagConstraintsAuditoriaDetalle.gridx = 0;
	this.gridBagConstraintsAuditoriaDetalle.ipadx = 0;
	this.gridBagConstraintsAuditoriaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_auditoriaAuditoriaDetalle.add(jLabelid_auditoriaAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
		//this.gridBagConstraintsAuditoriaDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAuditoriaDetalle.gridy = 0;
		this.gridBagConstraintsAuditoriaDetalle.gridx = 2;
		this.gridBagConstraintsAuditoriaDetalle.ipadx = 0;
		this.gridBagConstraintsAuditoriaDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_auditoriaAuditoriaDetalle.add(jButtonid_auditoriaAuditoriaDetalleBusqueda, this.gridBagConstraintsAuditoriaDetalle);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
		//this.gridBagConstraintsAuditoriaDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAuditoriaDetalle.gridy = 0;
		this.gridBagConstraintsAuditoriaDetalle.gridx = 3;
		this.gridBagConstraintsAuditoriaDetalle.ipadx = 0;
		this.gridBagConstraintsAuditoriaDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_auditoriaAuditoriaDetalle.add(jButtonid_auditoriaAuditoriaDetalleUpdate, this.gridBagConstraintsAuditoriaDetalle);
	}

	this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
	this.gridBagConstraintsAuditoriaDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAuditoriaDetalle.gridy = 0;
	this.gridBagConstraintsAuditoriaDetalle.gridx = 1;
	this.gridBagConstraintsAuditoriaDetalle.ipadx = 0;
	this.gridBagConstraintsAuditoriaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_auditoriaAuditoriaDetalle.add(jComboBoxid_auditoriaAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);


	this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
	this.gridBagConstraintsAuditoriaDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAuditoriaDetalle.gridy = 0;
	this.gridBagConstraintsAuditoriaDetalle.gridx = 0;
	this.gridBagConstraintsAuditoriaDetalle.ipadx = 0;
	this.gridBagConstraintsAuditoriaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_campoAuditoriaDetalle.add(jLabelnombre_campoAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
		//this.gridBagConstraintsAuditoriaDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAuditoriaDetalle.gridy = 0;
		this.gridBagConstraintsAuditoriaDetalle.gridx = 2;
		this.gridBagConstraintsAuditoriaDetalle.ipadx = 0;
		this.gridBagConstraintsAuditoriaDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_campoAuditoriaDetalle.add(jButtonnombre_campoAuditoriaDetalleBusqueda, this.gridBagConstraintsAuditoriaDetalle);
	}

	this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
	this.gridBagConstraintsAuditoriaDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAuditoriaDetalle.gridy = 0;
	this.gridBagConstraintsAuditoriaDetalle.gridx = 1;
	this.gridBagConstraintsAuditoriaDetalle.ipadx = 0;
	this.gridBagConstraintsAuditoriaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_campoAuditoriaDetalle.add(jscrollPanenombre_campoAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);


	this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
	this.gridBagConstraintsAuditoriaDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAuditoriaDetalle.gridy = 0;
	this.gridBagConstraintsAuditoriaDetalle.gridx = 0;
	this.gridBagConstraintsAuditoriaDetalle.ipadx = 0;
	this.gridBagConstraintsAuditoriaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_anteriorAuditoriaDetalle.add(jLabelvalor_anteriorAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
		//this.gridBagConstraintsAuditoriaDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAuditoriaDetalle.gridy = 0;
		this.gridBagConstraintsAuditoriaDetalle.gridx = 2;
		this.gridBagConstraintsAuditoriaDetalle.ipadx = 0;
		this.gridBagConstraintsAuditoriaDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_anteriorAuditoriaDetalle.add(jButtonvalor_anteriorAuditoriaDetalleBusqueda, this.gridBagConstraintsAuditoriaDetalle);
	}

	this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
	this.gridBagConstraintsAuditoriaDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAuditoriaDetalle.gridy = 0;
	this.gridBagConstraintsAuditoriaDetalle.gridx = 1;
	this.gridBagConstraintsAuditoriaDetalle.ipadx = 0;
	this.gridBagConstraintsAuditoriaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_anteriorAuditoriaDetalle.add(jscrollPanevalor_anteriorAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);


	this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
	this.gridBagConstraintsAuditoriaDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAuditoriaDetalle.gridy = 0;
	this.gridBagConstraintsAuditoriaDetalle.gridx = 0;
	this.gridBagConstraintsAuditoriaDetalle.ipadx = 0;
	this.gridBagConstraintsAuditoriaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_actualAuditoriaDetalle.add(jLabelvalor_actualAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
		//this.gridBagConstraintsAuditoriaDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAuditoriaDetalle.gridy = 0;
		this.gridBagConstraintsAuditoriaDetalle.gridx = 2;
		this.gridBagConstraintsAuditoriaDetalle.ipadx = 0;
		this.gridBagConstraintsAuditoriaDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_actualAuditoriaDetalle.add(jButtonvalor_actualAuditoriaDetalleBusqueda, this.gridBagConstraintsAuditoriaDetalle);
	}

	this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
	this.gridBagConstraintsAuditoriaDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAuditoriaDetalle.gridy = 0;
	this.gridBagConstraintsAuditoriaDetalle.gridx = 1;
	this.gridBagConstraintsAuditoriaDetalle.ipadx = 0;
	this.gridBagConstraintsAuditoriaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_actualAuditoriaDetalle.add(jscrollPanevalor_actualAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
	this.gridBagConstraintsAuditoriaDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAuditoriaDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAuditoriaDetalle.gridy = iYPanelCamposAuditoriaDetalle;
	this.gridBagConstraintsAuditoriaDetalle.gridx = iXPanelCamposAuditoriaDetalle++;
	this.gridBagConstraintsAuditoriaDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAuditoriaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAuditoriaDetalle.add(this.jPanelidAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);



	if(iXPanelCamposAuditoriaDetalle % 1==0) {
		iXPanelCamposAuditoriaDetalle=0;
		iYPanelCamposAuditoriaDetalle++;
	}
	this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
	this.gridBagConstraintsAuditoriaDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAuditoriaDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAuditoriaDetalle.gridy = iYPanelCamposAuditoriaDetalle;
	this.gridBagConstraintsAuditoriaDetalle.gridx = iXPanelCamposAuditoriaDetalle++;
	this.gridBagConstraintsAuditoriaDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAuditoriaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAuditoriaDetalle.add(this.jPanelid_auditoriaAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);



	if(iXPanelCamposAuditoriaDetalle % 1==0) {
		iXPanelCamposAuditoriaDetalle=0;
		iYPanelCamposAuditoriaDetalle++;
	}
	this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
	this.gridBagConstraintsAuditoriaDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAuditoriaDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAuditoriaDetalle.gridy = iYPanelCamposAuditoriaDetalle;
	this.gridBagConstraintsAuditoriaDetalle.gridx = iXPanelCamposAuditoriaDetalle++;
	this.gridBagConstraintsAuditoriaDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAuditoriaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAuditoriaDetalle.add(this.jPanelnombre_campoAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);



	if(iXPanelCamposAuditoriaDetalle % 1==0) {
		iXPanelCamposAuditoriaDetalle=0;
		iYPanelCamposAuditoriaDetalle++;
	}
	this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
	this.gridBagConstraintsAuditoriaDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAuditoriaDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAuditoriaDetalle.gridy = iYPanelCamposAuditoriaDetalle;
	this.gridBagConstraintsAuditoriaDetalle.gridx = iXPanelCamposAuditoriaDetalle++;
	this.gridBagConstraintsAuditoriaDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAuditoriaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAuditoriaDetalle.add(this.jPanelvalor_anteriorAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);



	if(iXPanelCamposAuditoriaDetalle % 1==0) {
		iXPanelCamposAuditoriaDetalle=0;
		iYPanelCamposAuditoriaDetalle++;
	}
	this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
	this.gridBagConstraintsAuditoriaDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAuditoriaDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAuditoriaDetalle.gridy = iYPanelCamposAuditoriaDetalle;
	this.gridBagConstraintsAuditoriaDetalle.gridx = iXPanelCamposAuditoriaDetalle++;
	this.gridBagConstraintsAuditoriaDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAuditoriaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAuditoriaDetalle.add(this.jPanelvalor_actualAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);



	if(iXPanelCamposAuditoriaDetalle % 1==0) {
		iXPanelCamposAuditoriaDetalle=0;
		iYPanelCamposAuditoriaDetalle++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
		
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
			
		GridBagLayout gridaBagLayoutAccionesAuditoriaDetalle= new GridBagLayout();
		this.jPanelAccionesAuditoriaDetalle.setLayout(gridaBagLayoutAccionesAuditoriaDetalle);
		
		GridBagLayout gridaBagLayoutAccionesFormularioAuditoriaDetalle= new GridBagLayout();
		this.jPanelAccionesFormularioAuditoriaDetalle.setLayout(gridaBagLayoutAccionesFormularioAuditoriaDetalle);
		
		this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
		this.gridBagConstraintsAuditoriaDetalle.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsAuditoriaDetalle.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioAuditoriaDetalle.add(this.jComboBoxTiposAccionesFormularioAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);

		this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
		this.gridBagConstraintsAuditoriaDetalle.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsAuditoriaDetalle.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioAuditoriaDetalle.add(this.jCheckBoxPostAccionNuevoAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.auditoriadetalleSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
			this.gridBagConstraintsAuditoriaDetalle.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsAuditoriaDetalle.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioAuditoriaDetalle.add(this.jCheckBoxPostAccionSinCerrarAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.auditoriadetalleSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.auditoriadetalleSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
			this.gridBagConstraintsAuditoriaDetalle.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsAuditoriaDetalle.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioAuditoriaDetalle.add(this.jCheckBoxPostAccionSinMensajeAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
		this.gridBagConstraintsAuditoriaDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAuditoriaDetalle.gridy = 0;
		this.gridBagConstraintsAuditoriaDetalle.gridx = iPosXAccion++;
			
		this.jPanelAccionesAuditoriaDetalle.add(this.jButtonModificarAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);							

		this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
		this.gridBagConstraintsAuditoriaDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAuditoriaDetalle.gridy = 0;
		this.gridBagConstraintsAuditoriaDetalle.gridx =iPosXAccion++;
			
		this.jPanelAccionesAuditoriaDetalle.add(this.jButtonEliminarAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);
		
			
		this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
		this.gridBagConstraintsAuditoriaDetalle.gridy = 0;		
		this.gridBagConstraintsAuditoriaDetalle.gridx = iPosXAccion++;
		
		this.jPanelAccionesAuditoriaDetalle.add(this.jButtonActualizarAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);


		this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
		this.gridBagConstraintsAuditoriaDetalle.gridy = 0;		
		this.gridBagConstraintsAuditoriaDetalle.gridx = iPosXAccion++;
		
		this.jPanelAccionesAuditoriaDetalle.add(this.jButtonGuardarCambiosAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);	
		
		this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
		this.gridBagConstraintsAuditoriaDetalle.gridy = 0;		
		this.gridBagConstraintsAuditoriaDetalle.gridx =iPosXAccion++;
		
		this.jPanelAccionesAuditoriaDetalle.add(this.jButtonCancelarAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutAuditoriaDetalle = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutAuditoriaDetalle);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.auditoriadetalleSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();						
			this.gridBagConstraintsAuditoriaDetalle.gridy = iGridyPrincipal++;
			this.gridBagConstraintsAuditoriaDetalle.gridx = 0;		
			//this.gridBagConstraintsAuditoriaDetalle.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAuditoriaDetalle.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsAuditoriaDetalle.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
		this.gridBagConstraintsAuditoriaDetalle.gridy =iGridyPrincipal++;
		this.gridBagConstraintsAuditoriaDetalle.gridx =0;
		this.gridBagConstraintsAuditoriaDetalle.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsAuditoriaDetalle.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(AuditoriaDetalleJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleAuditoriaDetalle = new AuditoriaDetalleBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Auditoria Detalle DATOS");
			
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
			
	        //this.setTitle("[FOR] - Auditoria Detalle DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Auditoria Detalle Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			AuditoriaDetalleModel auditoriadetalleModel=new AuditoriaDetalleModel(this);
			
			//SI USARA CLASE INTERNA
			//AuditoriaDetalleModel.AuditoriaDetalleFocusTraversalPolicy auditoriadetalleFocusTraversalPolicy = auditoriadetalleModel.new AuditoriaDetalleFocusTraversalPolicy(this);
			
			//auditoriadetalleFocusTraversalPolicy.setauditoriadetalleJInternalFrame(this);
			
			this.setFocusTraversalPolicy(auditoriadetalleModel);
			
			
			this.jContentPaneDetalleAuditoriaDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleAuditoriaDetalle = new GridBagLayout();	
			this.jContentPaneDetalleAuditoriaDetalle.setLayout(gridaBagLayoutDetalleAuditoriaDetalle);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosAuditoriaDetalle = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
				this.gridBagConstraintsAuditoriaDetalle.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsAuditoriaDetalle.gridx = 0;
					
				
				this.jContentPaneDetalleAuditoriaDetalle.add(jTtoolBarDetalleAuditoriaDetalle, gridBagConstraintsAuditoriaDetalle);								
				
}
			
			this.jScrollPanelDatosEdicionAuditoriaDetalle=   new JScrollPane(jContentPaneDetalleAuditoriaDetalle,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionAuditoriaDetalle.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAuditoriaDetalle.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAuditoriaDetalle.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralAuditoriaDetalle=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralAuditoriaDetalle.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAuditoriaDetalle.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAuditoriaDetalle.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
			
			
	        this.gridBagConstraintsAuditoriaDetalle.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsAuditoriaDetalle.gridx = 0;
	        
			this.jContentPaneDetalleAuditoriaDetalle.add(jPanelCamposAuditoriaDetalle, gridBagConstraintsAuditoriaDetalle);
			
			
			
			
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
						&& auditoriadetalleSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.auditoriadetalleSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsAuditoriaDetalle= new GridBagConstraints();
						this.gridBagConstraintsAuditoriaDetalle.gridy = iGridyRelaciones++;
						this.gridBagConstraintsAuditoriaDetalle.gridx = 0;
						this.jContentPaneDetalleAuditoriaDetalle.add(this.jTabbedPaneRelacionesAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesAuditoriaDetalle.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosAuditoriaDetalle.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
					this.gridBagConstraintsAuditoriaDetalle.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsAuditoriaDetalle.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsAuditoriaDetalle.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsAuditoriaDetalle.gridx = 0;
					
				
					this.jContentPaneDetalleAuditoriaDetalle.add(jPanelCamposOcultosAuditoriaDetalle, gridBagConstraintsAuditoriaDetalle);
				
					this.jPanelCamposOcultosAuditoriaDetalle.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
			this.gridBagConstraintsAuditoriaDetalle.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsAuditoriaDetalle.gridx = 0;
	        this.gridBagConstraintsAuditoriaDetalle.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleAuditoriaDetalle.add(this.jPanelAccionesFormularioAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);							
			
			
			
			this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
	        this.gridBagConstraintsAuditoriaDetalle.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsAuditoriaDetalle.gridx = 0;
	        
			
			this.jContentPaneDetalleAuditoriaDetalle.add(this.jPanelAccionesAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionAuditoriaDetalle);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionAuditoriaDetalle=   new JScrollPane(this.jPanelCamposAuditoriaDetalle,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionAuditoriaDetalle.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAuditoriaDetalle.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAuditoriaDetalle.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
			this.gridBagConstraintsAuditoriaDetalle.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsAuditoriaDetalle.gridx = 0;
			this.gridBagConstraintsAuditoriaDetalle.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsAuditoriaDetalle.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsAuditoriaDetalle.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
			this.gridBagConstraintsAuditoriaDetalle.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsAuditoriaDetalle.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);			
			
			this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
			this.gridBagConstraintsAuditoriaDetalle.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsAuditoriaDetalle.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
		this.gridBagConstraintsAuditoriaDetalle.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAuditoriaDetalle.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);
			
			
		this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
		this.gridBagConstraintsAuditoriaDetalle.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAuditoriaDetalle.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);
		
			
		this.gridBagConstraintsAuditoriaDetalle = new GridBagConstraints();
		this.gridBagConstraintsAuditoriaDetalle.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsAuditoriaDetalle.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesAuditoriaDetalle, this.gridBagConstraintsAuditoriaDetalle);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralAuditoriaDetalle;//jContentPane;
		
		return jScrollPanelDatosEdicionAuditoriaDetalle;
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
