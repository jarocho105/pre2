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



import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;



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
import com.bydan.erp.nomina.util.EstadoSolicitudNomiConstantesFunciones;

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
public class EstadoSolicitudNomiDetalleFormJInternalFrame extends EstadoSolicitudNomiBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleEstadoSolicitudNomi;
	
	protected JMenuBar jmenuBarDetalleEstadoSolicitudNomi;
	
	protected JMenu jmenuDetalleEstadoSolicitudNomi;
	protected JMenu jmenuDetalleArchivoEstadoSolicitudNomi;
	protected JMenu jmenuDetalleAccionesEstadoSolicitudNomi;
	protected JMenu jmenuDetalleDatosEstadoSolicitudNomi;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleEstadoSolicitudNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoSolicitudNomi;	
	protected GridBagConstraints gridBagConstraintsEstadoSolicitudNomi;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected EstadoSolicitudNomiBeanSwingJInternalFrameAdditional jInternalFrameDetalleEstadoSolicitudNomi;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EstadoSolicitudNomiSessionBean estadosolicitudnomiSessionBean;
	
	

	public SolicitudReemplazoBeanSwingJInternalFrame solicitudreemplazoBeanSwingJInternalFrame=null;
	public SolicitudReemplazoBeanSwingJInternalFrame solicitudreemplazoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteSolicitudReemplazo=false;
	public SolicitudReemplazoSessionBean solicitudreemplazoSessionBean;

	public SolicitudHoraExtraBeanSwingJInternalFrame solicitudhoraextraBeanSwingJInternalFrame=null;
	public SolicitudHoraExtraBeanSwingJInternalFrame solicitudhoraextraBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteSolicitudHoraExtra=false;
	public SolicitudHoraExtraSessionBean solicitudhoraextraSessionBean;

	public SolicitudVacacionBeanSwingJInternalFrame solicitudvacacionBeanSwingJInternalFrame=null;
	public SolicitudVacacionBeanSwingJInternalFrame solicitudvacacionBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteSolicitudVacacion=false;
	public SolicitudVacacionSessionBean solicitudvacacionSessionBean;
	
		
	
	public EstadoSolicitudNomiLogic estadosolicitudnomiLogic;
	
	public JScrollPane jScrollPanelDatosEstadoSolicitudNomi;
	public JScrollPane jScrollPanelDatosEdicionEstadoSolicitudNomi;
	public JScrollPane jScrollPanelDatosGeneralEstadoSolicitudNomi;
	
	protected JPanel jPanelCamposEstadoSolicitudNomi;    
	protected JPanel jPanelCamposOcultosEstadoSolicitudNomi;    	
	protected JPanel jPanelAccionesEstadoSolicitudNomi;
	protected JPanel jPanelAccionesFormularioEstadoSolicitudNomi;
    
	
	
	protected Integer iXPanelCamposEstadoSolicitudNomi=0;
	protected Integer iYPanelCamposEstadoSolicitudNomi=0;
	
	protected Integer iXPanelCamposOcultosEstadoSolicitudNomi=0;
	protected Integer iYPanelCamposOcultosEstadoSolicitudNomi=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoEstadoSolicitudNomi;
	public JButton jButtonModificarEstadoSolicitudNomi;
	public JButton jButtonActualizarEstadoSolicitudNomi;
    public JButton jButtonEliminarEstadoSolicitudNomi;
	public JButton jButtonCancelarEstadoSolicitudNomi;
    public JButton jButtonGuardarCambiosEstadoSolicitudNomi;
	public JButton jButtonGuardarCambiosTablaEstadoSolicitudNomi;
	protected JButton jButtonCerrarEstadoSolicitudNomi;
	
	
	protected JButton jButtonProcesarInformacionEstadoSolicitudNomi;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoEstadoSolicitudNomi;
	protected JCheckBox jCheckBoxPostAccionSinCerrarEstadoSolicitudNomi;
	protected JCheckBox jCheckBoxPostAccionSinMensajeEstadoSolicitudNomi;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoSolicitudNomi;
	protected JButton jButtonModificarToolBarEstadoSolicitudNomi;
	protected JButton jButtonActualizarToolBarEstadoSolicitudNomi;
    protected JButton jButtonEliminarToolBarEstadoSolicitudNomi;
	protected JButton jButtonCancelarToolBarEstadoSolicitudNomi;
    protected JButton jButtonGuardarCambiosToolBarEstadoSolicitudNomi;
	protected JButton jButtonGuardarCambiosTablaToolBarEstadoSolicitudNomi;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoSolicitudNomi;
	protected JButton jButtonCerrarToolBarEstadoSolicitudNomi;
	
	protected JButton jButtonProcesarInformacionToolBarEstadoSolicitudNomi;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoSolicitudNomi;
	protected JMenuItem jMenuItemModificarEstadoSolicitudNomi;
	protected JMenuItem jMenuItemActualizarEstadoSolicitudNomi;
    protected JMenuItem jMenuItemEliminarEstadoSolicitudNomi;
	protected JMenuItem jMenuItemCancelarEstadoSolicitudNomi;
    protected JMenuItem jMenuItemGuardarCambiosEstadoSolicitudNomi;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoSolicitudNomi;
	protected JMenuItem jMenuItemCerrarEstadoSolicitudNomi;
	protected JMenuItem jMenuItemDetalleCerrarEstadoSolicitudNomi;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoSolicitudNomi;
	
	protected JMenuItem jMenuItemProcesarInformacionEstadoSolicitudNomi;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoSolicitudNomi;
	protected JMenuItem jMenuItemMostrarOcultarEstadoSolicitudNomi;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoSolicitudNomi;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoSolicitudNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoSolicitudNomi;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioEstadoSolicitudNomi;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidEstadoSolicitudNomi;
	public JLabel jLabelIdEstadoSolicitudNomi;
	public JTextFieldMe jTextFieldidEstadoSolicitudNomi;
	public JButton jButtonidEstadoSolicitudNomiBusqueda= new JButtonMe();

	public JPanel jPanelcodigoEstadoSolicitudNomi;
	public JLabel jLabelcodigoEstadoSolicitudNomi;
	public JTextField jTextFieldcodigoEstadoSolicitudNomi;
	public JButton jButtoncodigoEstadoSolicitudNomiBusqueda= new JButtonMe();

	public JPanel jPanelnombreEstadoSolicitudNomi;
	public JLabel jLabelnombreEstadoSolicitudNomi;
	public JTextArea jTextAreanombreEstadoSolicitudNomi;
	public JScrollPane jscrollPanenombreEstadoSolicitudNomi;
	public JButton jButtonnombreEstadoSolicitudNomiBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesEstadoSolicitudNomi;
	
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
	public int iHeightFormulario=418;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public EstadoSolicitudNomiDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposEstadoSolicitudNomi=new JPanel();
				this.jPanelAccionesFormularioEstadoSolicitudNomi=new JPanel();
				this.jmenuBarDetalleEstadoSolicitudNomi=new JMenuBar();
				this.jTtoolBarDetalleEstadoSolicitudNomi=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoSolicitudNomiDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("EstadoSolicitudNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public EstadoSolicitudNomiDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("EstadoSolicitudNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoSolicitudNomiDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoSolicitudNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoSolicitudNomiDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoSolicitudNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoSolicitudNomiDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoSolicitudNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarEstadoSolicitudNomi() {
		return this.jButtonActualizarToolBarEstadoSolicitudNomi;
	}
	
	public JButton getjButtonEliminarToolBarEstadoSolicitudNomi() {
		return this.jButtonEliminarToolBarEstadoSolicitudNomi;
	}
	
	public JButton getjButtonCancelarToolBarEstadoSolicitudNomi() {
		return this.jButtonCancelarToolBarEstadoSolicitudNomi;
	}		
	
	public JButton getjButtonProcesarInformacionEstadoSolicitudNomi() {
		return this.jButtonProcesarInformacionEstadoSolicitudNomi;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoSolicitudNomi)	{
		this.jButtonProcesarInformacionEstadoSolicitudNomi = jButtonProcesarInformacionEstadoSolicitudNomi;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoSolicitudNomi() {
		return this.jComboBoxTiposAccionesEstadoSolicitudNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoSolicitudNomi(
			JComboBox jComboBoxTiposRelacionesEstadoSolicitudNomi) {
		this.jComboBoxTiposRelacionesEstadoSolicitudNomi = jComboBoxTiposRelacionesEstadoSolicitudNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoSolicitudNomi(
			JComboBox jComboBoxTiposAccionesEstadoSolicitudNomi) {
		this.jComboBoxTiposAccionesEstadoSolicitudNomi = jComboBoxTiposAccionesEstadoSolicitudNomi;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioEstadoSolicitudNomi() {
		return this.jComboBoxTiposAccionesFormularioEstadoSolicitudNomi;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioEstadoSolicitudNomi(
			JComboBox jComboBoxTiposAccionesFormularioEstadoSolicitudNomi) {
		this.jComboBoxTiposAccionesFormularioEstadoSolicitudNomi = jComboBoxTiposAccionesFormularioEstadoSolicitudNomi;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.estadosolicitudnomiSessionBean=new EstadoSolicitudNomiSessionBean();
		
		this.estadosolicitudnomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadosolicitudnomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.solicitudreemplazoSessionBean=new SolicitudReemplazoSessionBean();
		//this.solicitudhoraextraSessionBean=new SolicitudHoraExtraSessionBean();
		//this.solicitudvacacionSessionBean=new SolicitudVacacionSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoSolicitudNomiJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoSolicitudNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoSolicitudNomiJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Solicitud MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado()) {
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
	
		EstadoSolicitudNomiJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleEstadoSolicitudNomi= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarEstadoSolicitudNomi=new JButtonMe();
				this.jButtonModificarToolBarEstadoSolicitudNomi=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarEstadoSolicitudNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarEstadoSolicitudNomi,this.jTtoolBarDetalleEstadoSolicitudNomi,
							"actualizar","actualizar","Actualizar"+" "+EstadoSolicitudNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarEstadoSolicitudNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarEstadoSolicitudNomi,this.jTtoolBarDetalleEstadoSolicitudNomi,
							"eliminar","eliminar","Eliminar"+" "+EstadoSolicitudNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarEstadoSolicitudNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarEstadoSolicitudNomi,this.jTtoolBarDetalleEstadoSolicitudNomi,
							"cancelar","cancelar","Cancelar"+" "+EstadoSolicitudNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarEstadoSolicitudNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarEstadoSolicitudNomi,this.jTtoolBarDetalleEstadoSolicitudNomi,
							"guardarcambios","guardarcambios","Guardar"+" "+EstadoSolicitudNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarEstadoSolicitudNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarEstadoSolicitudNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarEstadoSolicitudNomi,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleEstadoSolicitudNomi=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleEstadoSolicitudNomi=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoEstadoSolicitudNomi=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesEstadoSolicitudNomi=new JMenuMe("Acciones");
		this.jmenuDetalleDatosEstadoSolicitudNomi=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoSolicitudNomi= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoSolicitudNomi.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoSolicitudNomi,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarEstadoSolicitudNomi= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarEstadoSolicitudNomi.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarEstadoSolicitudNomi,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarEstadoSolicitudNomi= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarEstadoSolicitudNomi.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarEstadoSolicitudNomi,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarEstadoSolicitudNomi= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarEstadoSolicitudNomi.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarEstadoSolicitudNomi,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarEstadoSolicitudNomi= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarEstadoSolicitudNomi.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarEstadoSolicitudNomi,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosEstadoSolicitudNomi= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoSolicitudNomi.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoSolicitudNomi,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoSolicitudNomi= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoSolicitudNomi.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoSolicitudNomi,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarEstadoSolicitudNomi= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarEstadoSolicitudNomi.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarEstadoSolicitudNomi,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoSolicitudNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoSolicitudNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoSolicitudNomi,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoSolicitudNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoSolicitudNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoSolicitudNomi,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoEstadoSolicitudNomi.add(this.jMenuItemDetalleCerrarEstadoSolicitudNomi);
		
		this.jmenuDetalleAccionesEstadoSolicitudNomi.add(this.jMenuItemActualizarEstadoSolicitudNomi);
		this.jmenuDetalleAccionesEstadoSolicitudNomi.add(this.jMenuItemEliminarEstadoSolicitudNomi);
		this.jmenuDetalleAccionesEstadoSolicitudNomi.add(this.jMenuItemCancelarEstadoSolicitudNomi);		
		
		//this.jmenuDetalleDatosEstadoSolicitudNomi.add(this.jMenuItemDetalleAbrirOrderByEstadoSolicitudNomi);				
		this.jmenuDetalleDatosEstadoSolicitudNomi.add(this.jMenuItemDetalleMostarOcultarEstadoSolicitudNomi);				
				
		//this.jmenuDetalleAccionesEstadoSolicitudNomi.add(this.jMenuItemGuardarCambiosEstadoSolicitudNomi);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleEstadoSolicitudNomi.add(this.jmenuDetalleArchivoEstadoSolicitudNomi);		
		this.jmenuBarDetalleEstadoSolicitudNomi.add(this.jmenuDetalleAccionesEstadoSolicitudNomi);		
		this.jmenuBarDetalleEstadoSolicitudNomi.add(this.jmenuDetalleDatosEstadoSolicitudNomi);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleEstadoSolicitudNomi.add(this.jmenuDetalleEstadoSolicitudNomi);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleEstadoSolicitudNomi);				
	}
	
	
	public void inicializarElementosCamposEstadoSolicitudNomi() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdEstadoSolicitudNomi = new JLabelMe();
		jLabelIdEstadoSolicitudNomi.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdEstadoSolicitudNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoSolicitudNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoSolicitudNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdEstadoSolicitudNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidEstadoSolicitudNomi = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidEstadoSolicitudNomi.setToolTipText(EstadoSolicitudNomiConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutEstadoSolicitudNomi= new GridBagLayout();

		this.jPanelidEstadoSolicitudNomi.setLayout(this.gridaBagLayoutEstadoSolicitudNomi);

		jTextFieldidEstadoSolicitudNomi = new JTextFieldMe();
		jTextFieldidEstadoSolicitudNomi.setText("Id");

		jTextFieldidEstadoSolicitudNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidEstadoSolicitudNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidEstadoSolicitudNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoEstadoSolicitudNomi = new JLabelMe();
		this.jLabelcodigoEstadoSolicitudNomi.setText(""+EstadoSolicitudNomiConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoEstadoSolicitudNomi.setToolTipText("Codigo");
		this.jLabelcodigoEstadoSolicitudNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoSolicitudNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoSolicitudNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoEstadoSolicitudNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoEstadoSolicitudNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoEstadoSolicitudNomi.setToolTipText(EstadoSolicitudNomiConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutEstadoSolicitudNomi = new GridBagLayout();
		this.jPanelcodigoEstadoSolicitudNomi.setLayout(this.gridaBagLayoutEstadoSolicitudNomi);


		jTextFieldcodigoEstadoSolicitudNomi= new JTextFieldMe();

		jTextFieldcodigoEstadoSolicitudNomi.setEnabled(false);
		jTextFieldcodigoEstadoSolicitudNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoSolicitudNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoSolicitudNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoEstadoSolicitudNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoEstadoSolicitudNomiBusqueda= new JButtonMe();
		this.jButtoncodigoEstadoSolicitudNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoSolicitudNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoSolicitudNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoEstadoSolicitudNomiBusqueda.setText("U");
		this.jButtoncodigoEstadoSolicitudNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoEstadoSolicitudNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoEstadoSolicitudNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoEstadoSolicitudNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoEstadoSolicitudNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoEstadoSolicitudNomiBusqueda"));

		if(this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoEstadoSolicitudNomiBusqueda.setVisible(false);		}


					
		this.jLabelnombreEstadoSolicitudNomi = new JLabelMe();
		this.jLabelnombreEstadoSolicitudNomi.setText(""+EstadoSolicitudNomiConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreEstadoSolicitudNomi.setToolTipText("Nombre");
		this.jLabelnombreEstadoSolicitudNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoSolicitudNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoSolicitudNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreEstadoSolicitudNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreEstadoSolicitudNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreEstadoSolicitudNomi.setToolTipText(EstadoSolicitudNomiConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutEstadoSolicitudNomi = new GridBagLayout();
		this.jPanelnombreEstadoSolicitudNomi.setLayout(this.gridaBagLayoutEstadoSolicitudNomi);


		jTextAreanombreEstadoSolicitudNomi= new JTextAreaMe();
		jTextAreanombreEstadoSolicitudNomi.setEnabled(false);
		jTextAreanombreEstadoSolicitudNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoSolicitudNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoSolicitudNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoSolicitudNomi.setLineWrap(true);
		jTextAreanombreEstadoSolicitudNomi.setWrapStyleWord(true);
		jTextAreanombreEstadoSolicitudNomi.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreEstadoSolicitudNomi.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreEstadoSolicitudNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreEstadoSolicitudNomi = new JScrollPane(jTextAreanombreEstadoSolicitudNomi);
		jscrollPanenombreEstadoSolicitudNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoSolicitudNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoSolicitudNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreEstadoSolicitudNomiBusqueda= new JButtonMe();
		this.jButtonnombreEstadoSolicitudNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoSolicitudNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoSolicitudNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreEstadoSolicitudNomiBusqueda.setText("U");
		this.jButtonnombreEstadoSolicitudNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreEstadoSolicitudNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreEstadoSolicitudNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreEstadoSolicitudNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreEstadoSolicitudNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreEstadoSolicitudNomiBusqueda"));

		if(this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreEstadoSolicitudNomiBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysEstadoSolicitudNomi() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
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
		//this.jInternalFrameDetalleEstadoSolicitudNomi = new EstadoSolicitudNomiBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Estado Solicitud DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoSolicitudNomi= new GridBagLayout();
		

		
		String sToolTipEstadoSolicitudNomi="";
		sToolTipEstadoSolicitudNomi=EstadoSolicitudNomiConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoSolicitudNomi+="(Nomina.EstadoSolicitudNomi)";
		}
		
		if(!this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoSolicitudNomi+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoEstadoSolicitudNomi = new JButtonMe();
		this.jButtonModificarEstadoSolicitudNomi = new JButtonMe();
        this.jButtonActualizarEstadoSolicitudNomi = new JButtonMe();
        this.jButtonEliminarEstadoSolicitudNomi = new JButtonMe();
        this.jButtonCancelarEstadoSolicitudNomi = new JButtonMe();
        this.jButtonGuardarCambiosEstadoSolicitudNomi = new JButtonMe();
		this.jButtonGuardarCambiosTablaEstadoSolicitudNomi = new JButtonMe();
		this.jButtonCerrarEstadoSolicitudNomi = new JButtonMe();
		
		this.jScrollPanelDatosEstadoSolicitudNomi = new JScrollPane();   
        this.jScrollPanelDatosEdicionEstadoSolicitudNomi = new JScrollPane();
		this.jScrollPanelDatosGeneralEstadoSolicitudNomi = new JScrollPane();
				
		
		
		this.jPanelCamposEstadoSolicitudNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosEstadoSolicitudNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesEstadoSolicitudNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioEstadoSolicitudNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Solicitud";
		
		if(!this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoSolicitudNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Solicituds" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoSolicitudNomi.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionEstadoSolicitudNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralEstadoSolicitudNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposEstadoSolicitudNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposEstadoSolicitudNomi.setName("jPanelCamposEstadoSolicitudNomi"); 

		this.jPanelCamposOcultosEstadoSolicitudNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosEstadoSolicitudNomi.setName("jPanelCamposOcultosEstadoSolicitudNomi"); 

        this.jPanelAccionesEstadoSolicitudNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoSolicitudNomi.setToolTipText("Acciones");
        this.jPanelAccionesEstadoSolicitudNomi.setName("Acciones"); 

		this.jPanelAccionesFormularioEstadoSolicitudNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioEstadoSolicitudNomi.setToolTipText("Acciones");
        this.jPanelAccionesFormularioEstadoSolicitudNomi.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoEstadoSolicitudNomi.setText("Nuevo");
		this.jButtonModificarEstadoSolicitudNomi.setText("Editar");
        this.jButtonActualizarEstadoSolicitudNomi.setText("Actualizar");
        this.jButtonEliminarEstadoSolicitudNomi.setText("Eliminar");
        this.jButtonCancelarEstadoSolicitudNomi.setText("Cancelar");
        this.jButtonGuardarCambiosEstadoSolicitudNomi.setText("Guardar");
		this.jButtonGuardarCambiosTablaEstadoSolicitudNomi.setText("Guardar");
		this.jButtonCerrarEstadoSolicitudNomi.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoSolicitudNomi,"nuevo_button","Nuevo",this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarEstadoSolicitudNomi,"modificar_button","Editar",this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarEstadoSolicitudNomi,"actualizar_button","Actualizar",this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarEstadoSolicitudNomi,"eliminar_button","Eliminar",this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarEstadoSolicitudNomi,"cancelar_button","Cancelar",this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosEstadoSolicitudNomi,"guardarcambios_button","Guardar",this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoSolicitudNomi,"guardarcambiostabla_button","Guardar",this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoSolicitudNomi,"cerrar_button","Salir",this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoEstadoSolicitudNomi.setToolTipText("Nuevo"+" "+EstadoSolicitudNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarEstadoSolicitudNomi.setToolTipText("Editar"+" "+EstadoSolicitudNomiConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarEstadoSolicitudNomi.setToolTipText("Actualizar"+" "+EstadoSolicitudNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarEstadoSolicitudNomi.setToolTipText("Eliminar)"+" "+EstadoSolicitudNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarEstadoSolicitudNomi.setToolTipText("Cancelar"+" "+EstadoSolicitudNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosEstadoSolicitudNomi.setToolTipText("Guardar"+" "+EstadoSolicitudNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaEstadoSolicitudNomi.setToolTipText("Guardar"+" "+EstadoSolicitudNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoSolicitudNomi.setToolTipText("Salir"+" "+EstadoSolicitudNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoSolicitudNomi";
		inputMap = this.jButtonNuevoEstadoSolicitudNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoSolicitudNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoSolicitudNomi"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarEstadoSolicitudNomi";
		inputMap = this.jButtonActualizarEstadoSolicitudNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarEstadoSolicitudNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarEstadoSolicitudNomi"));
		
		//ELIMINAR
		sMapKey = "EliminarEstadoSolicitudNomi";
		inputMap = this.jButtonEliminarEstadoSolicitudNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarEstadoSolicitudNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarEstadoSolicitudNomi"));
		
		//CANCELAR	
		sMapKey = "CancelarEstadoSolicitudNomi";
		inputMap = this.jButtonCancelarEstadoSolicitudNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarEstadoSolicitudNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarEstadoSolicitudNomi"));
		
		//CERRAR		
		sMapKey = "CerrarEstadoSolicitudNomi";
		inputMap = this.jButtonCerrarEstadoSolicitudNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoSolicitudNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoSolicitudNomi"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoSolicitudNomi";
		inputMap = this.jButtonGuardarCambiosTablaEstadoSolicitudNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoSolicitudNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoSolicitudNomi"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoEstadoSolicitudNomi = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoEstadoSolicitudNomi.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoEstadoSolicitudNomi.setToolTipText("Nuevo EstadoSolicitudNomi");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarEstadoSolicitudNomi = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarEstadoSolicitudNomi.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarEstadoSolicitudNomi.setToolTipText("Sin Cerrar Ventana EstadoSolicitudNomi");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeEstadoSolicitudNomi = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeEstadoSolicitudNomi.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeEstadoSolicitudNomi.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesEstadoSolicitudNomi = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoSolicitudNomi.setText("Accion");
		this.jComboBoxTiposAccionesEstadoSolicitudNomi.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioEstadoSolicitudNomi = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioEstadoSolicitudNomi.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioEstadoSolicitudNomi.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesEstadoSolicitudNomi = new JLabelMe();
		
		this.jLabelAccionesEstadoSolicitudNomi.setText("Acciones");		
		this.jLabelAccionesEstadoSolicitudNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoSolicitudNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoSolicitudNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposEstadoSolicitudNomi();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysEstadoSolicitudNomi();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesEstadoSolicitudNomi=new JTabbedPane();
		this.jTabbedPaneRelacionesEstadoSolicitudNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesEstadoSolicitudNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesEstadoSolicitudNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoSolicitudNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoSolicitudNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioEstadoSolicitudNomi.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoSolicitudNomi.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoSolicitudNomi.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioEstadoSolicitudNomi, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposEstadoSolicitudNomi = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosEstadoSolicitudNomi = new GridBagLayout();
		
		this.jPanelCamposEstadoSolicitudNomi.setLayout(gridaBagLayoutCamposEstadoSolicitudNomi);
		this.jPanelCamposOcultosEstadoSolicitudNomi.setLayout(gridaBagLayoutCamposOcultosEstadoSolicitudNomi);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
	this.gridBagConstraintsEstadoSolicitudNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoSolicitudNomi.gridy = 0;
	this.gridBagConstraintsEstadoSolicitudNomi.gridx = 0;
	this.gridBagConstraintsEstadoSolicitudNomi.ipadx = 0;
	this.gridBagConstraintsEstadoSolicitudNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidEstadoSolicitudNomi.add(jLabelIdEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);



	this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
	this.gridBagConstraintsEstadoSolicitudNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoSolicitudNomi.gridy = 0;
	this.gridBagConstraintsEstadoSolicitudNomi.gridx = 1;
	this.gridBagConstraintsEstadoSolicitudNomi.ipadx = 0;
	this.gridBagConstraintsEstadoSolicitudNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidEstadoSolicitudNomi.add(jTextFieldidEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);


	this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
	this.gridBagConstraintsEstadoSolicitudNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoSolicitudNomi.gridy = 0;
	this.gridBagConstraintsEstadoSolicitudNomi.gridx = 0;
	this.gridBagConstraintsEstadoSolicitudNomi.ipadx = 0;
	this.gridBagConstraintsEstadoSolicitudNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoEstadoSolicitudNomi.add(jLabelcodigoEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
		//this.gridBagConstraintsEstadoSolicitudNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoSolicitudNomi.gridy = 0;
		this.gridBagConstraintsEstadoSolicitudNomi.gridx = 2;
		this.gridBagConstraintsEstadoSolicitudNomi.ipadx = 0;
		this.gridBagConstraintsEstadoSolicitudNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoEstadoSolicitudNomi.add(jButtoncodigoEstadoSolicitudNomiBusqueda, this.gridBagConstraintsEstadoSolicitudNomi);
	}

	this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
	this.gridBagConstraintsEstadoSolicitudNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoSolicitudNomi.gridy = 0;
	this.gridBagConstraintsEstadoSolicitudNomi.gridx = 1;
	this.gridBagConstraintsEstadoSolicitudNomi.ipadx = 0;
	this.gridBagConstraintsEstadoSolicitudNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoEstadoSolicitudNomi.add(jTextFieldcodigoEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);


	this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
	this.gridBagConstraintsEstadoSolicitudNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoSolicitudNomi.gridy = 0;
	this.gridBagConstraintsEstadoSolicitudNomi.gridx = 0;
	this.gridBagConstraintsEstadoSolicitudNomi.ipadx = 0;
	this.gridBagConstraintsEstadoSolicitudNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreEstadoSolicitudNomi.add(jLabelnombreEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
		//this.gridBagConstraintsEstadoSolicitudNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoSolicitudNomi.gridy = 0;
		this.gridBagConstraintsEstadoSolicitudNomi.gridx = 2;
		this.gridBagConstraintsEstadoSolicitudNomi.ipadx = 0;
		this.gridBagConstraintsEstadoSolicitudNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreEstadoSolicitudNomi.add(jButtonnombreEstadoSolicitudNomiBusqueda, this.gridBagConstraintsEstadoSolicitudNomi);
	}

	this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
	this.gridBagConstraintsEstadoSolicitudNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoSolicitudNomi.gridy = 0;
	this.gridBagConstraintsEstadoSolicitudNomi.gridx = 1;
	this.gridBagConstraintsEstadoSolicitudNomi.ipadx = 0;
	this.gridBagConstraintsEstadoSolicitudNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreEstadoSolicitudNomi.add(jscrollPanenombreEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
	this.gridBagConstraintsEstadoSolicitudNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoSolicitudNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoSolicitudNomi.gridy = iYPanelCamposEstadoSolicitudNomi;
	this.gridBagConstraintsEstadoSolicitudNomi.gridx = iXPanelCamposEstadoSolicitudNomi++;
	this.gridBagConstraintsEstadoSolicitudNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoSolicitudNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoSolicitudNomi.add(this.jPanelidEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);



	if(iXPanelCamposEstadoSolicitudNomi % 1==0) {
		iXPanelCamposEstadoSolicitudNomi=0;
		iYPanelCamposEstadoSolicitudNomi++;
	}
	this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
	this.gridBagConstraintsEstadoSolicitudNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoSolicitudNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoSolicitudNomi.gridy = iYPanelCamposEstadoSolicitudNomi;
	this.gridBagConstraintsEstadoSolicitudNomi.gridx = iXPanelCamposEstadoSolicitudNomi++;
	this.gridBagConstraintsEstadoSolicitudNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoSolicitudNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoSolicitudNomi.add(this.jPanelcodigoEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);



	if(iXPanelCamposEstadoSolicitudNomi % 1==0) {
		iXPanelCamposEstadoSolicitudNomi=0;
		iYPanelCamposEstadoSolicitudNomi++;
	}
	this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
	this.gridBagConstraintsEstadoSolicitudNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoSolicitudNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoSolicitudNomi.gridy = iYPanelCamposEstadoSolicitudNomi;
	this.gridBagConstraintsEstadoSolicitudNomi.gridx = iXPanelCamposEstadoSolicitudNomi++;
	this.gridBagConstraintsEstadoSolicitudNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoSolicitudNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoSolicitudNomi.add(this.jPanelnombreEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);



	if(iXPanelCamposEstadoSolicitudNomi % 1==0) {
		iXPanelCamposEstadoSolicitudNomi=0;
		iYPanelCamposEstadoSolicitudNomi++;
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
			
		GridBagLayout gridaBagLayoutAccionesEstadoSolicitudNomi= new GridBagLayout();
		this.jPanelAccionesEstadoSolicitudNomi.setLayout(gridaBagLayoutAccionesEstadoSolicitudNomi);
		
		GridBagLayout gridaBagLayoutAccionesFormularioEstadoSolicitudNomi= new GridBagLayout();
		this.jPanelAccionesFormularioEstadoSolicitudNomi.setLayout(gridaBagLayoutAccionesFormularioEstadoSolicitudNomi);
		
		this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
		this.gridBagConstraintsEstadoSolicitudNomi.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoSolicitudNomi.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoSolicitudNomi.add(this.jComboBoxTiposAccionesFormularioEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);

		this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
		this.gridBagConstraintsEstadoSolicitudNomi.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoSolicitudNomi.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoSolicitudNomi.add(this.jCheckBoxPostAccionNuevoEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.estadosolicitudnomiSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
			this.gridBagConstraintsEstadoSolicitudNomi.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoSolicitudNomi.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoSolicitudNomi.add(this.jCheckBoxPostAccionSinCerrarEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.estadosolicitudnomiSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
			this.gridBagConstraintsEstadoSolicitudNomi.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoSolicitudNomi.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoSolicitudNomi.add(this.jCheckBoxPostAccionSinMensajeEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
		this.gridBagConstraintsEstadoSolicitudNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoSolicitudNomi.gridy = 0;
		this.gridBagConstraintsEstadoSolicitudNomi.gridx = iPosXAccion++;
			
		this.jPanelAccionesEstadoSolicitudNomi.add(this.jButtonModificarEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);							

		this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
		this.gridBagConstraintsEstadoSolicitudNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoSolicitudNomi.gridy = 0;
		this.gridBagConstraintsEstadoSolicitudNomi.gridx =iPosXAccion++;
			
		this.jPanelAccionesEstadoSolicitudNomi.add(this.jButtonEliminarEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);
		
			
		this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
		this.gridBagConstraintsEstadoSolicitudNomi.gridy = 0;		
		this.gridBagConstraintsEstadoSolicitudNomi.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoSolicitudNomi.add(this.jButtonActualizarEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);


		this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
		this.gridBagConstraintsEstadoSolicitudNomi.gridy = 0;		
		this.gridBagConstraintsEstadoSolicitudNomi.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoSolicitudNomi.add(this.jButtonGuardarCambiosEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);	
		
		this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
		this.gridBagConstraintsEstadoSolicitudNomi.gridy = 0;		
		this.gridBagConstraintsEstadoSolicitudNomi.gridx =iPosXAccion++;
		
		this.jPanelAccionesEstadoSolicitudNomi.add(this.jButtonCancelarEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoSolicitudNomi = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoSolicitudNomi);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();						
			this.gridBagConstraintsEstadoSolicitudNomi.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoSolicitudNomi.gridx = 0;		
			//this.gridBagConstraintsEstadoSolicitudNomi.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoSolicitudNomi.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoSolicitudNomi.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
		this.gridBagConstraintsEstadoSolicitudNomi.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoSolicitudNomi.gridx =0;
		this.gridBagConstraintsEstadoSolicitudNomi.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoSolicitudNomi.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(EstadoSolicitudNomiJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleEstadoSolicitudNomi = new EstadoSolicitudNomiBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Estado Solicitud DATOS");
			
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
			
	        //this.setTitle("[FOR] - Estado Solicitud DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Solicitud Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			EstadoSolicitudNomiModel estadosolicitudnomiModel=new EstadoSolicitudNomiModel(this);
			
			//SI USARA CLASE INTERNA
			//EstadoSolicitudNomiModel.EstadoSolicitudNomiFocusTraversalPolicy estadosolicitudnomiFocusTraversalPolicy = estadosolicitudnomiModel.new EstadoSolicitudNomiFocusTraversalPolicy(this);
			
			//estadosolicitudnomiFocusTraversalPolicy.setestadosolicitudnomiJInternalFrame(this);
			
			this.setFocusTraversalPolicy(estadosolicitudnomiModel);
			
			
			this.jContentPaneDetalleEstadoSolicitudNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleEstadoSolicitudNomi = new GridBagLayout();	
			this.jContentPaneDetalleEstadoSolicitudNomi.setLayout(gridaBagLayoutDetalleEstadoSolicitudNomi);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoSolicitudNomi = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
				this.gridBagConstraintsEstadoSolicitudNomi.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsEstadoSolicitudNomi.gridx = 0;
					
				
				this.jContentPaneDetalleEstadoSolicitudNomi.add(jTtoolBarDetalleEstadoSolicitudNomi, gridBagConstraintsEstadoSolicitudNomi);								
				
}
			
			this.jScrollPanelDatosEdicionEstadoSolicitudNomi=   new JScrollPane(jContentPaneDetalleEstadoSolicitudNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoSolicitudNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoSolicitudNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoSolicitudNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralEstadoSolicitudNomi=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoSolicitudNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoSolicitudNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoSolicitudNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
			
			
	        this.gridBagConstraintsEstadoSolicitudNomi.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsEstadoSolicitudNomi.gridx = 0;
	        
			this.jContentPaneDetalleEstadoSolicitudNomi.add(jPanelCamposEstadoSolicitudNomi, gridBagConstraintsEstadoSolicitudNomi);
			
			
			
			
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
						&& estadosolicitudnomiSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameSolicitudHoraExtra(this.puedeCargarPorParteSolicitudHoraExtra,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameSolicitudReemplazo(this.puedeCargarPorParteSolicitudReemplazo,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameSolicitudVacacion(this.puedeCargarPorParteSolicitudVacacion,false,-1);
					
					if(this.estadosolicitudnomiSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsEstadoSolicitudNomi= new GridBagConstraints();
						this.gridBagConstraintsEstadoSolicitudNomi.gridy = iGridyRelaciones++;
						this.gridBagConstraintsEstadoSolicitudNomi.gridx = 0;
						this.jContentPaneDetalleEstadoSolicitudNomi.add(this.jTabbedPaneRelacionesEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesEstadoSolicitudNomi.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameSolicitudHoraExtra(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameSolicitudReemplazo(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameSolicitudVacacion(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosEstadoSolicitudNomi.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
					this.gridBagConstraintsEstadoSolicitudNomi.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsEstadoSolicitudNomi.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsEstadoSolicitudNomi.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsEstadoSolicitudNomi.gridx = 0;
					
				
					this.jContentPaneDetalleEstadoSolicitudNomi.add(jPanelCamposOcultosEstadoSolicitudNomi, gridBagConstraintsEstadoSolicitudNomi);
				
					this.jPanelCamposOcultosEstadoSolicitudNomi.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
			this.gridBagConstraintsEstadoSolicitudNomi.gridy = iGridyRelaciones++;//10;		
	        this.gridBagConstraintsEstadoSolicitudNomi.gridx = 0;
	        this.gridBagConstraintsEstadoSolicitudNomi.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleEstadoSolicitudNomi.add(this.jPanelAccionesFormularioEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);							
			
			
			
			this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
	        this.gridBagConstraintsEstadoSolicitudNomi.gridy = iGridyRelaciones;//10;		
	        this.gridBagConstraintsEstadoSolicitudNomi.gridx = 0;
	        
			
			this.jContentPaneDetalleEstadoSolicitudNomi.add(this.jPanelAccionesEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionEstadoSolicitudNomi);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionEstadoSolicitudNomi=   new JScrollPane(this.jPanelCamposEstadoSolicitudNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoSolicitudNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoSolicitudNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoSolicitudNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
			this.gridBagConstraintsEstadoSolicitudNomi.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsEstadoSolicitudNomi.gridx = 0;
			this.gridBagConstraintsEstadoSolicitudNomi.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsEstadoSolicitudNomi.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsEstadoSolicitudNomi.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
			this.gridBagConstraintsEstadoSolicitudNomi.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoSolicitudNomi.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);			
			
			this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
			this.gridBagConstraintsEstadoSolicitudNomi.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoSolicitudNomi.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
		this.gridBagConstraintsEstadoSolicitudNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoSolicitudNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);
			
			
		this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
		this.gridBagConstraintsEstadoSolicitudNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoSolicitudNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);
		
			
		this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
		this.gridBagConstraintsEstadoSolicitudNomi.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoSolicitudNomi.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoSolicitudNomi, this.gridBagConstraintsEstadoSolicitudNomi);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralEstadoSolicitudNomi;//jContentPane;
		
		return jScrollPanelDatosEdicionEstadoSolicitudNomi;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameSolicitudHoraExtra(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.solicitudhoraextraSessionBean=new SolicitudHoraExtraSessionBean();
		this.solicitudhoraextraSessionBean.setConGuardarRelaciones(false);
		this.solicitudhoraextraSessionBean.setEsGuardarRelacionado(true);

		this.solicitudhoraextraBeanSwingJInternalFrame=null;//new SolicitudHoraExtraBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.solicitudhoraextraBeanSwingJInternalFramePopup=new SolicitudHoraExtraBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.solicitudhoraextraBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.solicitudhoraextraSessionBean.getEsGuardarRelacionado()) {

				SolicitudHoraExtraJInternalFrame.STIPO_TAMANIO_GENERAL=EstadoSolicitudNomiJInternalFrame.STIPO_TAMANIO_GENERAL;
				SolicitudHoraExtraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EstadoSolicitudNomiJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.solicitudhoraextraSessionBean.setEsGuardarRelacionado(true);

				this.solicitudhoraextraBeanSwingJInternalFrame=new SolicitudHoraExtraBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.solicitudhoraextraBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.solicitudhoraextraBeanSwingJInternalFrame.setsolicitudhoraextraSessionBean(this.solicitudhoraextraSessionBean);

				//this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
				//this.gridBagConstraintsEstadoSolicitudNomi.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEstadoSolicitudNomi.gridx = 0;
				//this.jContentPaneDetalleEstadoSolicitudNomi.add(this.solicitudhoraextraBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEstadoSolicitudNomi);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEstadoSolicitudNomi.add("Solicitud Hora Extras",this.solicitudhoraextraBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEstadoSolicitudNomi.setComponentAt(iIndexTab,this.solicitudhoraextraBeanSwingJInternalFrame.getContentPane());
				}

				//SolicitudHoraExtraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.solicitudhoraextraSessionBean.setEsGuardarRelacionado(false);
				this.solicitudhoraextraBeanSwingJInternalFrame=null;//new SolicitudHoraExtraBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.solicitudhoraextraSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteSolicitudHoraExtra) {
					this.jTabbedPaneRelacionesEstadoSolicitudNomi.add("Solicitud Hora Extras",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameSolicitudReemplazo(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.solicitudreemplazoSessionBean=new SolicitudReemplazoSessionBean();
		this.solicitudreemplazoSessionBean.setConGuardarRelaciones(false);
		this.solicitudreemplazoSessionBean.setEsGuardarRelacionado(true);

		this.solicitudreemplazoBeanSwingJInternalFrame=null;//new SolicitudReemplazoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.solicitudreemplazoBeanSwingJInternalFramePopup=new SolicitudReemplazoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.solicitudreemplazoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.solicitudreemplazoSessionBean.getEsGuardarRelacionado()) {

				SolicitudReemplazoJInternalFrame.STIPO_TAMANIO_GENERAL=EstadoSolicitudNomiJInternalFrame.STIPO_TAMANIO_GENERAL;
				SolicitudReemplazoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EstadoSolicitudNomiJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.solicitudreemplazoSessionBean.setEsGuardarRelacionado(true);

				this.solicitudreemplazoBeanSwingJInternalFrame=new SolicitudReemplazoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.solicitudreemplazoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.solicitudreemplazoBeanSwingJInternalFrame.setsolicitudreemplazoSessionBean(this.solicitudreemplazoSessionBean);

				//this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
				//this.gridBagConstraintsEstadoSolicitudNomi.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEstadoSolicitudNomi.gridx = 0;
				//this.jContentPaneDetalleEstadoSolicitudNomi.add(this.solicitudreemplazoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEstadoSolicitudNomi);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEstadoSolicitudNomi.add("Solicitud Reemplazos",this.solicitudreemplazoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEstadoSolicitudNomi.setComponentAt(iIndexTab,this.solicitudreemplazoBeanSwingJInternalFrame.getContentPane());
				}

				//SolicitudReemplazoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.solicitudreemplazoSessionBean.setEsGuardarRelacionado(false);
				this.solicitudreemplazoBeanSwingJInternalFrame=null;//new SolicitudReemplazoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.solicitudreemplazoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteSolicitudReemplazo) {
					this.jTabbedPaneRelacionesEstadoSolicitudNomi.add("Solicitud Reemplazos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameSolicitudVacacion(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.solicitudvacacionSessionBean=new SolicitudVacacionSessionBean();
		this.solicitudvacacionSessionBean.setConGuardarRelaciones(false);
		this.solicitudvacacionSessionBean.setEsGuardarRelacionado(true);

		this.solicitudvacacionBeanSwingJInternalFrame=null;//new SolicitudVacacionBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.solicitudvacacionBeanSwingJInternalFramePopup=new SolicitudVacacionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.solicitudvacacionBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.solicitudvacacionSessionBean.getEsGuardarRelacionado()) {

				SolicitudVacacionJInternalFrame.STIPO_TAMANIO_GENERAL=EstadoSolicitudNomiJInternalFrame.STIPO_TAMANIO_GENERAL;
				SolicitudVacacionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EstadoSolicitudNomiJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.solicitudvacacionSessionBean.setEsGuardarRelacionado(true);

				this.solicitudvacacionBeanSwingJInternalFrame=new SolicitudVacacionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.solicitudvacacionBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.solicitudvacacionBeanSwingJInternalFrame.setsolicitudvacacionSessionBean(this.solicitudvacacionSessionBean);

				//this.gridBagConstraintsEstadoSolicitudNomi = new GridBagConstraints();
				//this.gridBagConstraintsEstadoSolicitudNomi.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEstadoSolicitudNomi.gridx = 0;
				//this.jContentPaneDetalleEstadoSolicitudNomi.add(this.solicitudvacacionBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEstadoSolicitudNomi);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEstadoSolicitudNomi.add("Solicitud Vacaciones",this.solicitudvacacionBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEstadoSolicitudNomi.setComponentAt(iIndexTab,this.solicitudvacacionBeanSwingJInternalFrame.getContentPane());
				}

				//SolicitudVacacionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.solicitudvacacionSessionBean.setEsGuardarRelacionado(false);
				this.solicitudvacacionBeanSwingJInternalFrame=null;//new SolicitudVacacionBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.solicitudvacacionSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteSolicitudVacacion) {
					this.jTabbedPaneRelacionesEstadoSolicitudNomi.add("Solicitud Vacaciones",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarSolicitudReemplazoBeanSwingJInternalFrame(List<EstadoSolicitudNomi> estadosolicitudnomis,EstadoSolicitudNomi estadosolicitudnomi,SolicitudReemplazoBeanSwingJInternalFrame solicitudreemplazoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//solicitudreemplazoBeanSwingJInternalFrame=new SolicitudReemplazoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					solicitudreemplazoBeanSwingJInternalFrame.getSolicitudReemplazoLogic().setConnexion(this.estadosolicitudnomiLogic.getConnexion());

					solicitudreemplazoBeanSwingJInternalFrame.setestadosolicitudnomisForeignKey(estadosolicitudnomis);
					solicitudreemplazoBeanSwingJInternalFrame.setestadosolicitudnomiForeignKey(estadosolicitudnomi);
					solicitudreemplazoBeanSwingJInternalFrame.solicitudreemplazoSessionBean.setisBusquedaDesdeForeignKeySesionEstadoSolicitudNomi(true);
					solicitudreemplazoBeanSwingJInternalFrame.solicitudreemplazoSessionBean.setlidEstadoSolicitudNomiActual(estadosolicitudnomi.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					solicitudreemplazoBeanSwingJInternalFrame.cargarCombosForeignKeySolicitudReemplazo(solicitudreemplazoBeanSwingJInternalFrame.isCargarCombosDependencia);
					solicitudreemplazoBeanSwingJInternalFrame.setVisibilidadBusquedasParaEstadoSolicitudNomi(true);
					solicitudreemplazoBeanSwingJInternalFrame.setid_estado_solicitud_nomiFK_IdEstadoSolicitudNomi(estadosolicitudnomi.getId());

					if(!this.conCargarFormDetalle) {
						solicitudreemplazoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					solicitudreemplazoBeanSwingJInternalFrame.setSelectedItemCombosFrameEstadoSolicitudNomiForeignKey(estadosolicitudnomi,1,false,true,true);
					solicitudreemplazoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					solicitudreemplazoBeanSwingJInternalFrame.procesarBusqueda("FK_IdEstadoSolicitudNomi");
					solicitudreemplazoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEstadoSolicitudNomi");
					solicitudreemplazoBeanSwingJInternalFrame.inicializarActualizarBindingTablaSolicitudReemplazo(true);
					solicitudreemplazoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesSolicitudReemplazo("n",solicitudreemplazoBeanSwingJInternalFrame.isGuardarCambiosEnLote, solicitudreemplazoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					solicitudreemplazoBeanSwingJInternalFrame.setAutoscrolls(true);
					solicitudreemplazoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						solicitudreemplazoBeanSwingJInternalFrame.actualizarEstadoPanelsSolicitudReemplazo("relacionado");
					} else {
						solicitudreemplazoBeanSwingJInternalFrame.actualizarEstadoPanelsSolicitudReemplazo("no_relacionado");
					}

					solicitudreemplazoBeanSwingJInternalFrame.getjButtonRecargarInformacionSolicitudReemplazo().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarSolicitudHoraExtraBeanSwingJInternalFrame(List<EstadoSolicitudNomi> estadosolicitudnomis,EstadoSolicitudNomi estadosolicitudnomi,SolicitudHoraExtraBeanSwingJInternalFrame solicitudhoraextraBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//solicitudhoraextraBeanSwingJInternalFrame=new SolicitudHoraExtraBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					solicitudhoraextraBeanSwingJInternalFrame.getSolicitudHoraExtraLogic().setConnexion(this.estadosolicitudnomiLogic.getConnexion());

					solicitudhoraextraBeanSwingJInternalFrame.setestadosolicitudnomisForeignKey(estadosolicitudnomis);
					solicitudhoraextraBeanSwingJInternalFrame.setestadosolicitudnomiForeignKey(estadosolicitudnomi);
					solicitudhoraextraBeanSwingJInternalFrame.solicitudhoraextraSessionBean.setisBusquedaDesdeForeignKeySesionEstadoSolicitudNomi(true);
					solicitudhoraextraBeanSwingJInternalFrame.solicitudhoraextraSessionBean.setlidEstadoSolicitudNomiActual(estadosolicitudnomi.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					solicitudhoraextraBeanSwingJInternalFrame.cargarCombosForeignKeySolicitudHoraExtra(solicitudhoraextraBeanSwingJInternalFrame.isCargarCombosDependencia);
					solicitudhoraextraBeanSwingJInternalFrame.setVisibilidadBusquedasParaEstadoSolicitudNomi(true);
					solicitudhoraextraBeanSwingJInternalFrame.setid_estado_solicitud_nomiFK_IdEstadoSolicitudNomi(estadosolicitudnomi.getId());

					if(!this.conCargarFormDetalle) {
						solicitudhoraextraBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					solicitudhoraextraBeanSwingJInternalFrame.setSelectedItemCombosFrameEstadoSolicitudNomiForeignKey(estadosolicitudnomi,1,false,true,true);
					solicitudhoraextraBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					solicitudhoraextraBeanSwingJInternalFrame.procesarBusqueda("FK_IdEstadoSolicitudNomi");
					solicitudhoraextraBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEstadoSolicitudNomi");
					solicitudhoraextraBeanSwingJInternalFrame.inicializarActualizarBindingTablaSolicitudHoraExtra(true);
					solicitudhoraextraBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesSolicitudHoraExtra("n",solicitudhoraextraBeanSwingJInternalFrame.isGuardarCambiosEnLote, solicitudhoraextraBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					solicitudhoraextraBeanSwingJInternalFrame.setAutoscrolls(true);
					solicitudhoraextraBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						solicitudhoraextraBeanSwingJInternalFrame.actualizarEstadoPanelsSolicitudHoraExtra("relacionado");
					} else {
						solicitudhoraextraBeanSwingJInternalFrame.actualizarEstadoPanelsSolicitudHoraExtra("no_relacionado");
					}

					solicitudhoraextraBeanSwingJInternalFrame.getjButtonRecargarInformacionSolicitudHoraExtra().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarSolicitudVacacionBeanSwingJInternalFrame(List<EstadoSolicitudNomi> estadosolicitudnomis,EstadoSolicitudNomi estadosolicitudnomi,SolicitudVacacionBeanSwingJInternalFrame solicitudvacacionBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//solicitudvacacionBeanSwingJInternalFrame=new SolicitudVacacionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					solicitudvacacionBeanSwingJInternalFrame.getSolicitudVacacionLogic().setConnexion(this.estadosolicitudnomiLogic.getConnexion());

					solicitudvacacionBeanSwingJInternalFrame.setestadosolicitudnomisForeignKey(estadosolicitudnomis);
					solicitudvacacionBeanSwingJInternalFrame.setestadosolicitudnomiForeignKey(estadosolicitudnomi);
					solicitudvacacionBeanSwingJInternalFrame.solicitudvacacionSessionBean.setisBusquedaDesdeForeignKeySesionEstadoSolicitudNomi(true);
					solicitudvacacionBeanSwingJInternalFrame.solicitudvacacionSessionBean.setlidEstadoSolicitudNomiActual(estadosolicitudnomi.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					solicitudvacacionBeanSwingJInternalFrame.cargarCombosForeignKeySolicitudVacacion(solicitudvacacionBeanSwingJInternalFrame.isCargarCombosDependencia);
					solicitudvacacionBeanSwingJInternalFrame.setVisibilidadBusquedasParaEstadoSolicitudNomi(true);
					solicitudvacacionBeanSwingJInternalFrame.setid_estado_solicitud_nomiFK_IdEstadoSolicitudNomi(estadosolicitudnomi.getId());

					if(!this.conCargarFormDetalle) {
						solicitudvacacionBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					solicitudvacacionBeanSwingJInternalFrame.setSelectedItemCombosFrameEstadoSolicitudNomiForeignKey(estadosolicitudnomi,1,false,true,true);
					solicitudvacacionBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					solicitudvacacionBeanSwingJInternalFrame.procesarBusqueda("FK_IdEstadoSolicitudNomi");
					solicitudvacacionBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEstadoSolicitudNomi");
					solicitudvacacionBeanSwingJInternalFrame.inicializarActualizarBindingTablaSolicitudVacacion(true);
					solicitudvacacionBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesSolicitudVacacion("n",solicitudvacacionBeanSwingJInternalFrame.isGuardarCambiosEnLote, solicitudvacacionBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					solicitudvacacionBeanSwingJInternalFrame.setAutoscrolls(true);
					solicitudvacacionBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						solicitudvacacionBeanSwingJInternalFrame.actualizarEstadoPanelsSolicitudVacacion("relacionado");
					} else {
						solicitudvacacionBeanSwingJInternalFrame.actualizarEstadoPanelsSolicitudVacacion("no_relacionado");
					}

					solicitudvacacionBeanSwingJInternalFrame.getjButtonRecargarInformacionSolicitudVacacion().setVisible(false);

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
