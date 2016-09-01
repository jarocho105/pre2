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
import com.bydan.erp.seguridad.util.UpdateDetalleConstantesFunciones;

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
public class UpdateDetalleDetalleFormJInternalFrame extends UpdateDetalleBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleUpdateDetalle;
	
	protected JMenuBar jmenuBarDetalleUpdateDetalle;
	
	protected JMenu jmenuDetalleUpdateDetalle;
	protected JMenu jmenuDetalleArchivoUpdateDetalle;
	protected JMenu jmenuDetalleAccionesUpdateDetalle;
	protected JMenu jmenuDetalleDatosUpdateDetalle;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleUpdateDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutUpdateDetalle;	
	protected GridBagConstraints gridBagConstraintsUpdateDetalle;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected UpdateDetalleBeanSwingJInternalFrameAdditional jInternalFrameDetalleUpdateDetalle;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected UpdateBeanSwingJInternalFrame updateBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_update="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";
	
	public UpdateDetalleSessionBean updatedetalleSessionBean;
	
	
	
	
	public UpdateSessionBean updateSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;	
	
	public UpdateDetalleLogic updatedetalleLogic;
	
	public JScrollPane jScrollPanelDatosUpdateDetalle;
	public JScrollPane jScrollPanelDatosEdicionUpdateDetalle;
	public JScrollPane jScrollPanelDatosGeneralUpdateDetalle;
	
	protected JPanel jPanelCamposUpdateDetalle;    
	protected JPanel jPanelCamposOcultosUpdateDetalle;    	
	protected JPanel jPanelAccionesUpdateDetalle;
	protected JPanel jPanelAccionesFormularioUpdateDetalle;
    
	
	
	protected Integer iXPanelCamposUpdateDetalle=0;
	protected Integer iYPanelCamposUpdateDetalle=0;
	
	protected Integer iXPanelCamposOcultosUpdateDetalle=0;
	protected Integer iYPanelCamposOcultosUpdateDetalle=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoUpdateDetalle;
	public JButton jButtonModificarUpdateDetalle;
	public JButton jButtonActualizarUpdateDetalle;
    public JButton jButtonEliminarUpdateDetalle;
	public JButton jButtonCancelarUpdateDetalle;
    public JButton jButtonGuardarCambiosUpdateDetalle;
	public JButton jButtonGuardarCambiosTablaUpdateDetalle;
	protected JButton jButtonCerrarUpdateDetalle;
	
	
	protected JButton jButtonProcesarInformacionUpdateDetalle;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoUpdateDetalle;
	protected JCheckBox jCheckBoxPostAccionSinCerrarUpdateDetalle;
	protected JCheckBox jCheckBoxPostAccionSinMensajeUpdateDetalle;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarUpdateDetalle;
	protected JButton jButtonModificarToolBarUpdateDetalle;
	protected JButton jButtonActualizarToolBarUpdateDetalle;
    protected JButton jButtonEliminarToolBarUpdateDetalle;
	protected JButton jButtonCancelarToolBarUpdateDetalle;
    protected JButton jButtonGuardarCambiosToolBarUpdateDetalle;
	protected JButton jButtonGuardarCambiosTablaToolBarUpdateDetalle;
	protected JButton jButtonMostrarOcultarTablaToolBarUpdateDetalle;
	protected JButton jButtonCerrarToolBarUpdateDetalle;
	
	protected JButton jButtonProcesarInformacionToolBarUpdateDetalle;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoUpdateDetalle;
	protected JMenuItem jMenuItemModificarUpdateDetalle;
	protected JMenuItem jMenuItemActualizarUpdateDetalle;
    protected JMenuItem jMenuItemEliminarUpdateDetalle;
	protected JMenuItem jMenuItemCancelarUpdateDetalle;
    protected JMenuItem jMenuItemGuardarCambiosUpdateDetalle;
	protected JMenuItem jMenuItemGuardarCambiosTablaUpdateDetalle;
	protected JMenuItem jMenuItemCerrarUpdateDetalle;
	protected JMenuItem jMenuItemDetalleCerrarUpdateDetalle;
	protected JMenuItem jMenuItemDetalleMostarOcultarUpdateDetalle;
	
	protected JMenuItem jMenuItemProcesarInformacionUpdateDetalle;
	protected JMenuItem jMenuItemNuevoGuardarCambiosUpdateDetalle;
	protected JMenuItem jMenuItemMostrarOcultarUpdateDetalle;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesUpdateDetalle;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesUpdateDetalle;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesUpdateDetalle;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioUpdateDetalle;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidUpdateDetalle;
	public JLabel jLabelIdUpdateDetalle;
	public JTextFieldMe jTextFieldidUpdateDetalle;
	public JButton jButtonidUpdateDetalleBusqueda= new JButtonMe();

	public JPanel jPanelcodigoUpdateDetalle;
	public JLabel jLabelcodigoUpdateDetalle;
	public JTextField jTextFieldcodigoUpdateDetalle;
	public JButton jButtoncodigoUpdateDetalleBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_procesoUpdateDetalle;
	public JLabel jLabelcodigo_procesoUpdateDetalle;
	public JTextField jTextFieldcodigo_procesoUpdateDetalle;
	public JButton jButtoncodigo_procesoUpdateDetalleBusqueda= new JButtonMe();

	public JPanel jPanelquery_resumenUpdateDetalle;
	public JLabel jLabelquery_resumenUpdateDetalle;
	public JTextArea jTextAreaquery_resumenUpdateDetalle;
	public JScrollPane jscrollPanequery_resumenUpdateDetalle;
	public JButton jButtonquery_resumenUpdateDetalleBusqueda= new JButtonMe();

	public JPanel jPanelnumero_intentoUpdateDetalle;
	public JLabel jLabelnumero_intentoUpdateDetalle;
	public JTextField jTextFieldnumero_intentoUpdateDetalle;
	public JButton jButtonnumero_intentoUpdateDetalleBusqueda= new JButtonMe();

	public JPanel jPanelfecha_archivoUpdateDetalle;
	public JLabel jLabelfecha_archivoUpdateDetalle;
	//public JFormattedTextField jDateChooserfecha_archivoUpdateDetalle;

	public JDateChooser jDateChooserfecha_archivoUpdateDetalle;
	public JButton jButtonfecha_archivoUpdateDetalleBusqueda= new JButtonMe();

	public JPanel jPanelfechaUpdateDetalle;
	public JLabel jLabelfechaUpdateDetalle;
	//public JFormattedTextField jDateChooserfechaUpdateDetalle;

	public JDateChooser jDateChooserfechaUpdateDetalle;
	public JButton jButtonfechaUpdateDetalleBusqueda= new JButtonMe();

	public JPanel jPanelordenUpdateDetalle;
	public JLabel jLabelordenUpdateDetalle;
	public JTextField jTextFieldordenUpdateDetalle;
	public JButton jButtonordenUpdateDetalleBusqueda= new JButtonMe();

	public JPanel jPanelejecutadoUpdateDetalle;
	public JLabel jLabelejecutadoUpdateDetalle;
	public JCheckBox jCheckBoxejecutadoUpdateDetalle;
	public JButton jButtonejecutadoUpdateDetalleBusqueda= new JButtonMe();

	public JPanel jPanelesta_activoUpdateDetalle;
	public JLabel jLabelesta_activoUpdateDetalle;
	public JCheckBox jCheckBoxesta_activoUpdateDetalle;
	public JButton jButtonesta_activoUpdateDetalleBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionUpdateDetalle;
	public JLabel jLabeldescripcionUpdateDetalle;
	public JTextArea jTextAreadescripcionUpdateDetalle;
	public JScrollPane jscrollPanedescripcionUpdateDetalle;
	public JButton jButtondescripcionUpdateDetalleBusqueda= new JButtonMe();

	
	public JPanel jPanelid_updateUpdateDetalle;
	public JLabel jLabelid_updateUpdateDetalle;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_updateUpdateDetalle;
	public JButton jButtonid_updateUpdateDetalle= new JButtonMe();
	public JButton jButtonid_updateUpdateDetalleUpdate= new JButtonMe();
	public JButton jButtonid_updateUpdateDetalleBusqueda= new JButtonMe();

	public JPanel jPanelid_anioUpdateDetalle;
	public JLabel jLabelid_anioUpdateDetalle;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioUpdateDetalle;
	public JButton jButtonid_anioUpdateDetalle= new JButtonMe();
	public JButton jButtonid_anioUpdateDetalleUpdate= new JButtonMe();
	public JButton jButtonid_anioUpdateDetalleBusqueda= new JButtonMe();

	public JPanel jPanelid_mesUpdateDetalle;
	public JLabel jLabelid_mesUpdateDetalle;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesUpdateDetalle;
	public JButton jButtonid_mesUpdateDetalle= new JButtonMe();
	public JButton jButtonid_mesUpdateDetalleUpdate= new JButtonMe();
	public JButton jButtonid_mesUpdateDetalleBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesUpdateDetalle;
	
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
	public int iHeightFormulario=594;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public UpdateDetalleDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposUpdateDetalle=new JPanel();
				this.jPanelAccionesFormularioUpdateDetalle=new JPanel();
				this.jmenuBarDetalleUpdateDetalle=new JMenuBar();
				this.jTtoolBarDetalleUpdateDetalle=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public UpdateDetalleDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("UpdateDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public UpdateDetalleDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("UpdateDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public UpdateDetalleDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("UpdateDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public UpdateDetalleDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("UpdateDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public UpdateDetalleDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("UpdateDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarUpdateDetalle() {
		return this.jButtonActualizarToolBarUpdateDetalle;
	}
	
	public JButton getjButtonEliminarToolBarUpdateDetalle() {
		return this.jButtonEliminarToolBarUpdateDetalle;
	}
	
	public JButton getjButtonCancelarToolBarUpdateDetalle() {
		return this.jButtonCancelarToolBarUpdateDetalle;
	}		
	
	public JButton getjButtonProcesarInformacionUpdateDetalle() {
		return this.jButtonProcesarInformacionUpdateDetalle;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionUpdateDetalle)	{
		this.jButtonProcesarInformacionUpdateDetalle = jButtonProcesarInformacionUpdateDetalle;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesUpdateDetalle() {
		return this.jComboBoxTiposAccionesUpdateDetalle;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesUpdateDetalle(
			JComboBox jComboBoxTiposRelacionesUpdateDetalle) {
		this.jComboBoxTiposRelacionesUpdateDetalle = jComboBoxTiposRelacionesUpdateDetalle;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesUpdateDetalle(
			JComboBox jComboBoxTiposAccionesUpdateDetalle) {
		this.jComboBoxTiposAccionesUpdateDetalle = jComboBoxTiposAccionesUpdateDetalle;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioUpdateDetalle() {
		return this.jComboBoxTiposAccionesFormularioUpdateDetalle;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioUpdateDetalle(
			JComboBox jComboBoxTiposAccionesFormularioUpdateDetalle) {
		this.jComboBoxTiposAccionesFormularioUpdateDetalle = jComboBoxTiposAccionesFormularioUpdateDetalle;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.updatedetalleSessionBean=new UpdateDetalleSessionBean();
		
		this.updatedetalleSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.updatedetalleSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.updatedetalleSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		UpdateDetalleJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		UpdateDetalleJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		UpdateDetalleJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Update Detalle MANTENIMIENTO"));
		
		
		if(iWidth > 1550) {
			iWidth=1550;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.updatedetalleSessionBean.getEsGuardarRelacionado()) {
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
	
		UpdateDetalleJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleUpdateDetalle= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarUpdateDetalle=new JButtonMe();
				this.jButtonModificarToolBarUpdateDetalle=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarUpdateDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarUpdateDetalle,this.jTtoolBarDetalleUpdateDetalle,
							"actualizar","actualizar","Actualizar"+" "+UpdateDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarUpdateDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarUpdateDetalle,this.jTtoolBarDetalleUpdateDetalle,
							"eliminar","eliminar","Eliminar"+" "+UpdateDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarUpdateDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarUpdateDetalle,this.jTtoolBarDetalleUpdateDetalle,
							"cancelar","cancelar","Cancelar"+" "+UpdateDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarUpdateDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarUpdateDetalle,this.jTtoolBarDetalleUpdateDetalle,
							"guardarcambios","guardarcambios","Guardar"+" "+UpdateDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarUpdateDetalle,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarUpdateDetalle,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarUpdateDetalle,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleUpdateDetalle=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleUpdateDetalle=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoUpdateDetalle=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesUpdateDetalle=new JMenuMe("Acciones");
		this.jmenuDetalleDatosUpdateDetalle=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoUpdateDetalle= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoUpdateDetalle.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoUpdateDetalle,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoUpdateDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarUpdateDetalle= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarUpdateDetalle.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarUpdateDetalle,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarUpdateDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarUpdateDetalle= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarUpdateDetalle.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarUpdateDetalle,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarUpdateDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarUpdateDetalle= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarUpdateDetalle.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarUpdateDetalle,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarUpdateDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarUpdateDetalle= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarUpdateDetalle.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarUpdateDetalle,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarUpdateDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosUpdateDetalle= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosUpdateDetalle.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosUpdateDetalle,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosUpdateDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarUpdateDetalle= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarUpdateDetalle.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarUpdateDetalle,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarUpdateDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarUpdateDetalle= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarUpdateDetalle.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarUpdateDetalle,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarUpdateDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarUpdateDetalle= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarUpdateDetalle.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarUpdateDetalle,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarUpdateDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarUpdateDetalle= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarUpdateDetalle.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarUpdateDetalle,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarUpdateDetalle, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoUpdateDetalle.add(this.jMenuItemDetalleCerrarUpdateDetalle);
		
		this.jmenuDetalleAccionesUpdateDetalle.add(this.jMenuItemActualizarUpdateDetalle);
		this.jmenuDetalleAccionesUpdateDetalle.add(this.jMenuItemEliminarUpdateDetalle);
		this.jmenuDetalleAccionesUpdateDetalle.add(this.jMenuItemCancelarUpdateDetalle);		
		
		//this.jmenuDetalleDatosUpdateDetalle.add(this.jMenuItemDetalleAbrirOrderByUpdateDetalle);				
		this.jmenuDetalleDatosUpdateDetalle.add(this.jMenuItemDetalleMostarOcultarUpdateDetalle);				
				
		//this.jmenuDetalleAccionesUpdateDetalle.add(this.jMenuItemGuardarCambiosUpdateDetalle);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoUpdateDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesUpdateDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosUpdateDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleUpdateDetalle.add(this.jmenuDetalleArchivoUpdateDetalle);		
		this.jmenuBarDetalleUpdateDetalle.add(this.jmenuDetalleAccionesUpdateDetalle);		
		this.jmenuBarDetalleUpdateDetalle.add(this.jmenuDetalleDatosUpdateDetalle);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleUpdateDetalle);				
	}
	
	
	public void inicializarElementosCamposUpdateDetalle() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdUpdateDetalle = new JLabelMe();
		jLabelIdUpdateDetalle.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdUpdateDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdUpdateDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdUpdateDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdUpdateDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidUpdateDetalle = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidUpdateDetalle.setToolTipText(UpdateDetalleConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutUpdateDetalle= new GridBagLayout();

		this.jPanelidUpdateDetalle.setLayout(this.gridaBagLayoutUpdateDetalle);

		jTextFieldidUpdateDetalle = new JTextFieldMe();
		jTextFieldidUpdateDetalle.setText("Id");

		jTextFieldidUpdateDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidUpdateDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidUpdateDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoUpdateDetalle = new JLabelMe();
		this.jLabelcodigoUpdateDetalle.setText(""+UpdateDetalleConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoUpdateDetalle.setToolTipText("Codigo");
		this.jLabelcodigoUpdateDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoUpdateDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoUpdateDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoUpdateDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoUpdateDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoUpdateDetalle.setToolTipText(UpdateDetalleConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutUpdateDetalle = new GridBagLayout();
		this.jPanelcodigoUpdateDetalle.setLayout(this.gridaBagLayoutUpdateDetalle);


		jTextFieldcodigoUpdateDetalle= new JTextFieldMe();

		jTextFieldcodigoUpdateDetalle.setEnabled(false);
		jTextFieldcodigoUpdateDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoUpdateDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoUpdateDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoUpdateDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoUpdateDetalleBusqueda= new JButtonMe();
		this.jButtoncodigoUpdateDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoUpdateDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoUpdateDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoUpdateDetalleBusqueda.setText("U");
		this.jButtoncodigoUpdateDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoUpdateDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoUpdateDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoUpdateDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoUpdateDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoUpdateDetalleBusqueda"));

		if(this.updatedetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoUpdateDetalleBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_procesoUpdateDetalle = new JLabelMe();
		this.jLabelcodigo_procesoUpdateDetalle.setText(""+UpdateDetalleConstantesFunciones.LABEL_CODIGOPROCESO+" : *");
		this.jLabelcodigo_procesoUpdateDetalle.setToolTipText("Codigo Proceso");
		this.jLabelcodigo_procesoUpdateDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_procesoUpdateDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_procesoUpdateDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_procesoUpdateDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_procesoUpdateDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_procesoUpdateDetalle.setToolTipText(UpdateDetalleConstantesFunciones.LABEL_CODIGOPROCESO);
		this.gridaBagLayoutUpdateDetalle = new GridBagLayout();
		this.jPanelcodigo_procesoUpdateDetalle.setLayout(this.gridaBagLayoutUpdateDetalle);


		jTextFieldcodigo_procesoUpdateDetalle= new JTextFieldMe();

		jTextFieldcodigo_procesoUpdateDetalle.setEnabled(false);
		jTextFieldcodigo_procesoUpdateDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_procesoUpdateDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_procesoUpdateDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_procesoUpdateDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_procesoUpdateDetalleBusqueda= new JButtonMe();
		this.jButtoncodigo_procesoUpdateDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_procesoUpdateDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_procesoUpdateDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_procesoUpdateDetalleBusqueda.setText("U");
		this.jButtoncodigo_procesoUpdateDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_procesoUpdateDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_procesoUpdateDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_procesoUpdateDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_procesoUpdateDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_procesoUpdateDetalleBusqueda"));

		if(this.updatedetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_procesoUpdateDetalleBusqueda.setVisible(false);		}


					
		this.jLabelquery_resumenUpdateDetalle = new JLabelMe();
		this.jLabelquery_resumenUpdateDetalle.setText(""+UpdateDetalleConstantesFunciones.LABEL_QUERYRESUMEN+" : *");
		this.jLabelquery_resumenUpdateDetalle.setToolTipText("Query Resumen");
		this.jLabelquery_resumenUpdateDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelquery_resumenUpdateDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelquery_resumenUpdateDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelquery_resumenUpdateDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelquery_resumenUpdateDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelquery_resumenUpdateDetalle.setToolTipText(UpdateDetalleConstantesFunciones.LABEL_QUERYRESUMEN);
		this.gridaBagLayoutUpdateDetalle = new GridBagLayout();
		this.jPanelquery_resumenUpdateDetalle.setLayout(this.gridaBagLayoutUpdateDetalle);


		jTextAreaquery_resumenUpdateDetalle= new JTextAreaMe();
		jTextAreaquery_resumenUpdateDetalle.setEnabled(false);
		jTextAreaquery_resumenUpdateDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaquery_resumenUpdateDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaquery_resumenUpdateDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaquery_resumenUpdateDetalle.setLineWrap(true);
		jTextAreaquery_resumenUpdateDetalle.setWrapStyleWord(true);
		jTextAreaquery_resumenUpdateDetalle.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaquery_resumenUpdateDetalle.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreaquery_resumenUpdateDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanequery_resumenUpdateDetalle = new JScrollPane(jTextAreaquery_resumenUpdateDetalle);
		jscrollPanequery_resumenUpdateDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanequery_resumenUpdateDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanequery_resumenUpdateDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonquery_resumenUpdateDetalleBusqueda= new JButtonMe();
		this.jButtonquery_resumenUpdateDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonquery_resumenUpdateDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonquery_resumenUpdateDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonquery_resumenUpdateDetalleBusqueda.setText("U");
		this.jButtonquery_resumenUpdateDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonquery_resumenUpdateDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonquery_resumenUpdateDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaquery_resumenUpdateDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaquery_resumenUpdateDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"query_resumenUpdateDetalleBusqueda"));

		if(this.updatedetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonquery_resumenUpdateDetalleBusqueda.setVisible(false);		}


					
		this.jLabelnumero_intentoUpdateDetalle = new JLabelMe();
		this.jLabelnumero_intentoUpdateDetalle.setText(""+UpdateDetalleConstantesFunciones.LABEL_NUMEROINTENTO+" : *");
		this.jLabelnumero_intentoUpdateDetalle.setToolTipText("Numero Intento");
		this.jLabelnumero_intentoUpdateDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_intentoUpdateDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_intentoUpdateDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_intentoUpdateDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_intentoUpdateDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_intentoUpdateDetalle.setToolTipText(UpdateDetalleConstantesFunciones.LABEL_NUMEROINTENTO);
		this.gridaBagLayoutUpdateDetalle = new GridBagLayout();
		this.jPanelnumero_intentoUpdateDetalle.setLayout(this.gridaBagLayoutUpdateDetalle);


		jTextFieldnumero_intentoUpdateDetalle= new JTextFieldMe();
		jTextFieldnumero_intentoUpdateDetalle.setEnabled(false);
		jTextFieldnumero_intentoUpdateDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_intentoUpdateDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_intentoUpdateDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_intentoUpdateDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_intentoUpdateDetalle.setText("0");

		this.jButtonnumero_intentoUpdateDetalleBusqueda= new JButtonMe();
		this.jButtonnumero_intentoUpdateDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_intentoUpdateDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_intentoUpdateDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_intentoUpdateDetalleBusqueda.setText("U");
		this.jButtonnumero_intentoUpdateDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_intentoUpdateDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_intentoUpdateDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_intentoUpdateDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_intentoUpdateDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_intentoUpdateDetalleBusqueda"));

		if(this.updatedetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_intentoUpdateDetalleBusqueda.setVisible(false);		}


					
		this.jLabelfecha_archivoUpdateDetalle = new JLabelMe();
		this.jLabelfecha_archivoUpdateDetalle.setText(""+UpdateDetalleConstantesFunciones.LABEL_FECHAARCHIVO+" : *");
		this.jLabelfecha_archivoUpdateDetalle.setToolTipText("Fecha Archivo");
		this.jLabelfecha_archivoUpdateDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_archivoUpdateDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_archivoUpdateDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_archivoUpdateDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_archivoUpdateDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_archivoUpdateDetalle.setToolTipText(UpdateDetalleConstantesFunciones.LABEL_FECHAARCHIVO);
		this.gridaBagLayoutUpdateDetalle = new GridBagLayout();
		this.jPanelfecha_archivoUpdateDetalle.setLayout(this.gridaBagLayoutUpdateDetalle);


		//jFormattedTextFieldfecha_archivoUpdateDetalle= new JFormattedTextFieldMe();

		jDateChooserfecha_archivoUpdateDetalle= new JDateChooser();
		jDateChooserfecha_archivoUpdateDetalle.setEnabled(false);
		jDateChooserfecha_archivoUpdateDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_archivoUpdateDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_archivoUpdateDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_archivoUpdateDetalle,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_archivoUpdateDetalle.setDate(new Date());
		jDateChooserfecha_archivoUpdateDetalle.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_archivoUpdateDetalle.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_archivoUpdateDetalleBusqueda= new JButtonMe();
		this.jButtonfecha_archivoUpdateDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_archivoUpdateDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_archivoUpdateDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_archivoUpdateDetalleBusqueda.setText("U");
		this.jButtonfecha_archivoUpdateDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_archivoUpdateDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_archivoUpdateDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_archivoUpdateDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_archivoUpdateDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_archivoUpdateDetalleBusqueda"));

		if(this.updatedetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_archivoUpdateDetalleBusqueda.setVisible(false);		}


					
		this.jLabelfechaUpdateDetalle = new JLabelMe();
		this.jLabelfechaUpdateDetalle.setText(""+UpdateDetalleConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaUpdateDetalle.setToolTipText("Fecha");
		this.jLabelfechaUpdateDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaUpdateDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaUpdateDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaUpdateDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaUpdateDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaUpdateDetalle.setToolTipText(UpdateDetalleConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutUpdateDetalle = new GridBagLayout();
		this.jPanelfechaUpdateDetalle.setLayout(this.gridaBagLayoutUpdateDetalle);


		//jFormattedTextFieldfechaUpdateDetalle= new JFormattedTextFieldMe();

		jDateChooserfechaUpdateDetalle= new JDateChooser();
		jDateChooserfechaUpdateDetalle.setEnabled(false);
		jDateChooserfechaUpdateDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaUpdateDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaUpdateDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaUpdateDetalle,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaUpdateDetalle.setDate(new Date());
		jDateChooserfechaUpdateDetalle.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaUpdateDetalle.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaUpdateDetalleBusqueda= new JButtonMe();
		this.jButtonfechaUpdateDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaUpdateDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaUpdateDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaUpdateDetalleBusqueda.setText("U");
		this.jButtonfechaUpdateDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaUpdateDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaUpdateDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaUpdateDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaUpdateDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaUpdateDetalleBusqueda"));

		if(this.updatedetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaUpdateDetalleBusqueda.setVisible(false);		}


					
		this.jLabelordenUpdateDetalle = new JLabelMe();
		this.jLabelordenUpdateDetalle.setText(""+UpdateDetalleConstantesFunciones.LABEL_ORDEN+" : *");
		this.jLabelordenUpdateDetalle.setToolTipText("Orden");
		this.jLabelordenUpdateDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelordenUpdateDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelordenUpdateDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelordenUpdateDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelordenUpdateDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelordenUpdateDetalle.setToolTipText(UpdateDetalleConstantesFunciones.LABEL_ORDEN);
		this.gridaBagLayoutUpdateDetalle = new GridBagLayout();
		this.jPanelordenUpdateDetalle.setLayout(this.gridaBagLayoutUpdateDetalle);


		jTextFieldordenUpdateDetalle= new JTextFieldMe();
		jTextFieldordenUpdateDetalle.setEnabled(false);
		jTextFieldordenUpdateDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldordenUpdateDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldordenUpdateDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldordenUpdateDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldordenUpdateDetalle.setText("0");

		this.jButtonordenUpdateDetalleBusqueda= new JButtonMe();
		this.jButtonordenUpdateDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonordenUpdateDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonordenUpdateDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonordenUpdateDetalleBusqueda.setText("U");
		this.jButtonordenUpdateDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonordenUpdateDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonordenUpdateDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldordenUpdateDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldordenUpdateDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ordenUpdateDetalleBusqueda"));

		if(this.updatedetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonordenUpdateDetalleBusqueda.setVisible(false);		}


					
		this.jLabelejecutadoUpdateDetalle = new JLabelMe();
		this.jLabelejecutadoUpdateDetalle.setText(""+UpdateDetalleConstantesFunciones.LABEL_EJECUTADO+" : *");
		this.jLabelejecutadoUpdateDetalle.setToolTipText("Ejecutado");
		this.jLabelejecutadoUpdateDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelejecutadoUpdateDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelejecutadoUpdateDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelejecutadoUpdateDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelejecutadoUpdateDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelejecutadoUpdateDetalle.setToolTipText(UpdateDetalleConstantesFunciones.LABEL_EJECUTADO);
		this.gridaBagLayoutUpdateDetalle = new GridBagLayout();
		this.jPanelejecutadoUpdateDetalle.setLayout(this.gridaBagLayoutUpdateDetalle);


		jCheckBoxejecutadoUpdateDetalle= new JCheckBoxMe();
		jCheckBoxejecutadoUpdateDetalle.setEnabled(false);

		jCheckBoxejecutadoUpdateDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxejecutadoUpdateDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxejecutadoUpdateDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxejecutadoUpdateDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonejecutadoUpdateDetalleBusqueda= new JButtonMe();
		this.jButtonejecutadoUpdateDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonejecutadoUpdateDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonejecutadoUpdateDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonejecutadoUpdateDetalleBusqueda.setText("U");
		this.jButtonejecutadoUpdateDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonejecutadoUpdateDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonejecutadoUpdateDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxejecutadoUpdateDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxejecutadoUpdateDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ejecutadoUpdateDetalleBusqueda"));

		if(this.updatedetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonejecutadoUpdateDetalleBusqueda.setVisible(false);		}


					
		this.jLabelesta_activoUpdateDetalle = new JLabelMe();
		this.jLabelesta_activoUpdateDetalle.setText(""+UpdateDetalleConstantesFunciones.LABEL_ESTAACTIVO+" : *");
		this.jLabelesta_activoUpdateDetalle.setToolTipText("Esta Activo");
		this.jLabelesta_activoUpdateDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesta_activoUpdateDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesta_activoUpdateDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelesta_activoUpdateDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelesta_activoUpdateDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelesta_activoUpdateDetalle.setToolTipText(UpdateDetalleConstantesFunciones.LABEL_ESTAACTIVO);
		this.gridaBagLayoutUpdateDetalle = new GridBagLayout();
		this.jPanelesta_activoUpdateDetalle.setLayout(this.gridaBagLayoutUpdateDetalle);


		jCheckBoxesta_activoUpdateDetalle= new JCheckBoxMe();
		jCheckBoxesta_activoUpdateDetalle.setEnabled(false);

		jCheckBoxesta_activoUpdateDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_activoUpdateDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_activoUpdateDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxesta_activoUpdateDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonesta_activoUpdateDetalleBusqueda= new JButtonMe();
		this.jButtonesta_activoUpdateDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_activoUpdateDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_activoUpdateDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonesta_activoUpdateDetalleBusqueda.setText("U");
		this.jButtonesta_activoUpdateDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonesta_activoUpdateDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonesta_activoUpdateDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxesta_activoUpdateDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxesta_activoUpdateDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"esta_activoUpdateDetalleBusqueda"));

		if(this.updatedetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonesta_activoUpdateDetalleBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionUpdateDetalle = new JLabelMe();
		this.jLabeldescripcionUpdateDetalle.setText(""+UpdateDetalleConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionUpdateDetalle.setToolTipText("Descripcion");
		this.jLabeldescripcionUpdateDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionUpdateDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionUpdateDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionUpdateDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionUpdateDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionUpdateDetalle.setToolTipText(UpdateDetalleConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutUpdateDetalle = new GridBagLayout();
		this.jPaneldescripcionUpdateDetalle.setLayout(this.gridaBagLayoutUpdateDetalle);


		jTextAreadescripcionUpdateDetalle= new JTextAreaMe();
		jTextAreadescripcionUpdateDetalle.setEnabled(false);
		jTextAreadescripcionUpdateDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionUpdateDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionUpdateDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionUpdateDetalle.setLineWrap(true);
		jTextAreadescripcionUpdateDetalle.setWrapStyleWord(true);
		jTextAreadescripcionUpdateDetalle.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionUpdateDetalle.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionUpdateDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionUpdateDetalle = new JScrollPane(jTextAreadescripcionUpdateDetalle);
		jscrollPanedescripcionUpdateDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionUpdateDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionUpdateDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondescripcionUpdateDetalleBusqueda= new JButtonMe();
		this.jButtondescripcionUpdateDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionUpdateDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionUpdateDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionUpdateDetalleBusqueda.setText("U");
		this.jButtondescripcionUpdateDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionUpdateDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionUpdateDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionUpdateDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionUpdateDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionUpdateDetalleBusqueda"));

		if(this.updatedetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionUpdateDetalleBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysUpdateDetalle() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_updateUpdateDetalle = new JLabelMe();
		this.jLabelid_updateUpdateDetalle.setText(""+UpdateDetalleConstantesFunciones.LABEL_IDUPDATE+" : *");
		this.jLabelid_updateUpdateDetalle.setToolTipText("Update");
		this.jLabelid_updateUpdateDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_updateUpdateDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_updateUpdateDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_updateUpdateDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_updateUpdateDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_updateUpdateDetalle.setToolTipText(UpdateDetalleConstantesFunciones.LABEL_IDUPDATE);
		this.gridaBagLayoutUpdateDetalle = new GridBagLayout();
		this.jPanelid_updateUpdateDetalle.setLayout(this.gridaBagLayoutUpdateDetalle);


		jComboBoxid_updateUpdateDetalle= new JComboBoxMe();
		jComboBoxid_updateUpdateDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_updateUpdateDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_updateUpdateDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_updateUpdateDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_updateUpdateDetalle= new JButtonMe();
		this.jButtonid_updateUpdateDetalle.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_updateUpdateDetalle.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_updateUpdateDetalle.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_updateUpdateDetalle.setText("Buscar");
		this.jButtonid_updateUpdateDetalle.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_updateUpdateDetalle.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_updateUpdateDetalle,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_updateUpdateDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_updateUpdateDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_updateUpdateDetalle"));

		this.jButtonid_updateUpdateDetalleBusqueda= new JButtonMe();
		this.jButtonid_updateUpdateDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_updateUpdateDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_updateUpdateDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_updateUpdateDetalleBusqueda.setText("U");
		this.jButtonid_updateUpdateDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_updateUpdateDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_updateUpdateDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_updateUpdateDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_updateUpdateDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_updateUpdateDetalleBusqueda"));

		if(this.updatedetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_updateUpdateDetalleBusqueda.setVisible(false);		}

		this.jButtonid_updateUpdateDetalleUpdate= new JButtonMe();
		this.jButtonid_updateUpdateDetalleUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_updateUpdateDetalleUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_updateUpdateDetalleUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_updateUpdateDetalleUpdate.setText("U");
		this.jButtonid_updateUpdateDetalleUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_updateUpdateDetalleUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_updateUpdateDetalleUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_updateUpdateDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_updateUpdateDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_updateUpdateDetalleUpdate"));



					
		this.jLabelid_anioUpdateDetalle = new JLabelMe();
		this.jLabelid_anioUpdateDetalle.setText(""+UpdateDetalleConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioUpdateDetalle.setToolTipText("Anio");
		this.jLabelid_anioUpdateDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioUpdateDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioUpdateDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioUpdateDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioUpdateDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioUpdateDetalle.setToolTipText(UpdateDetalleConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutUpdateDetalle = new GridBagLayout();
		this.jPanelid_anioUpdateDetalle.setLayout(this.gridaBagLayoutUpdateDetalle);


		jComboBoxid_anioUpdateDetalle= new JComboBoxMe();
		jComboBoxid_anioUpdateDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioUpdateDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioUpdateDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioUpdateDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_anioUpdateDetalle= new JButtonMe();
		this.jButtonid_anioUpdateDetalle.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioUpdateDetalle.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioUpdateDetalle.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioUpdateDetalle.setText("Buscar");
		this.jButtonid_anioUpdateDetalle.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioUpdateDetalle.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioUpdateDetalle,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioUpdateDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioUpdateDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioUpdateDetalle"));

		this.jButtonid_anioUpdateDetalleBusqueda= new JButtonMe();
		this.jButtonid_anioUpdateDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioUpdateDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioUpdateDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioUpdateDetalleBusqueda.setText("U");
		this.jButtonid_anioUpdateDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioUpdateDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioUpdateDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioUpdateDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioUpdateDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioUpdateDetalleBusqueda"));

		if(this.updatedetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioUpdateDetalleBusqueda.setVisible(false);		}

		this.jButtonid_anioUpdateDetalleUpdate= new JButtonMe();
		this.jButtonid_anioUpdateDetalleUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioUpdateDetalleUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioUpdateDetalleUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioUpdateDetalleUpdate.setText("U");
		this.jButtonid_anioUpdateDetalleUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioUpdateDetalleUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioUpdateDetalleUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioUpdateDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioUpdateDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioUpdateDetalleUpdate"));



					
		this.jLabelid_mesUpdateDetalle = new JLabelMe();
		this.jLabelid_mesUpdateDetalle.setText(""+UpdateDetalleConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesUpdateDetalle.setToolTipText("Mes");
		this.jLabelid_mesUpdateDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesUpdateDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesUpdateDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesUpdateDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesUpdateDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesUpdateDetalle.setToolTipText(UpdateDetalleConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutUpdateDetalle = new GridBagLayout();
		this.jPanelid_mesUpdateDetalle.setLayout(this.gridaBagLayoutUpdateDetalle);


		jComboBoxid_mesUpdateDetalle= new JComboBoxMe();
		jComboBoxid_mesUpdateDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesUpdateDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesUpdateDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesUpdateDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_mesUpdateDetalle= new JButtonMe();
		this.jButtonid_mesUpdateDetalle.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesUpdateDetalle.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesUpdateDetalle.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesUpdateDetalle.setText("Buscar");
		this.jButtonid_mesUpdateDetalle.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesUpdateDetalle.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesUpdateDetalle,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesUpdateDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesUpdateDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesUpdateDetalle"));

		this.jButtonid_mesUpdateDetalleBusqueda= new JButtonMe();
		this.jButtonid_mesUpdateDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesUpdateDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesUpdateDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesUpdateDetalleBusqueda.setText("U");
		this.jButtonid_mesUpdateDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesUpdateDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesUpdateDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesUpdateDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesUpdateDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesUpdateDetalleBusqueda"));

		if(this.updatedetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesUpdateDetalleBusqueda.setVisible(false);		}

		this.jButtonid_mesUpdateDetalleUpdate= new JButtonMe();
		this.jButtonid_mesUpdateDetalleUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesUpdateDetalleUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesUpdateDetalleUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesUpdateDetalleUpdate.setText("U");
		this.jButtonid_mesUpdateDetalleUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesUpdateDetalleUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesUpdateDetalleUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesUpdateDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesUpdateDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesUpdateDetalleUpdate"));



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
		//this.jInternalFrameDetalleUpdateDetalle = new UpdateDetalleBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Update Detalle DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutUpdateDetalle= new GridBagLayout();
		

		
		String sToolTipUpdateDetalle="";
		sToolTipUpdateDetalle=UpdateDetalleConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipUpdateDetalle+="(Seguridad.UpdateDetalle)";
		}
		
		if(!this.updatedetalleSessionBean.getEsGuardarRelacionado()) {
			sToolTipUpdateDetalle+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoUpdateDetalle = new JButtonMe();
		this.jButtonModificarUpdateDetalle = new JButtonMe();
        this.jButtonActualizarUpdateDetalle = new JButtonMe();
        this.jButtonEliminarUpdateDetalle = new JButtonMe();
        this.jButtonCancelarUpdateDetalle = new JButtonMe();
        this.jButtonGuardarCambiosUpdateDetalle = new JButtonMe();
		this.jButtonGuardarCambiosTablaUpdateDetalle = new JButtonMe();
		this.jButtonCerrarUpdateDetalle = new JButtonMe();
		
		this.jScrollPanelDatosUpdateDetalle = new JScrollPane();   
        this.jScrollPanelDatosEdicionUpdateDetalle = new JScrollPane();
		this.jScrollPanelDatosGeneralUpdateDetalle = new JScrollPane();
				
		
		
		this.jPanelCamposUpdateDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosUpdateDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesUpdateDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioUpdateDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Update Detalle";
		
		if(!this.updatedetalleSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosUpdateDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Update Detalles" + this.sPath));
		} else {
			this.jScrollPanelDatosUpdateDetalle.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionUpdateDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralUpdateDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposUpdateDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposUpdateDetalle.setName("jPanelCamposUpdateDetalle"); 

		this.jPanelCamposOcultosUpdateDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosUpdateDetalle.setName("jPanelCamposOcultosUpdateDetalle"); 

        this.jPanelAccionesUpdateDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesUpdateDetalle.setToolTipText("Acciones");
        this.jPanelAccionesUpdateDetalle.setName("Acciones"); 

		this.jPanelAccionesFormularioUpdateDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioUpdateDetalle.setToolTipText("Acciones");
        this.jPanelAccionesFormularioUpdateDetalle.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionUpdateDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralUpdateDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosUpdateDetalle, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposUpdateDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosUpdateDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioUpdateDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoUpdateDetalle.setText("Nuevo");
		this.jButtonModificarUpdateDetalle.setText("Editar");
        this.jButtonActualizarUpdateDetalle.setText("Actualizar");
        this.jButtonEliminarUpdateDetalle.setText("Eliminar");
        this.jButtonCancelarUpdateDetalle.setText("Cancelar");
        this.jButtonGuardarCambiosUpdateDetalle.setText("Guardar");
		this.jButtonGuardarCambiosTablaUpdateDetalle.setText("Guardar");
		this.jButtonCerrarUpdateDetalle.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoUpdateDetalle,"nuevo_button","Nuevo",this.updatedetalleSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarUpdateDetalle,"modificar_button","Editar",this.updatedetalleSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarUpdateDetalle,"actualizar_button","Actualizar",this.updatedetalleSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarUpdateDetalle,"eliminar_button","Eliminar",this.updatedetalleSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarUpdateDetalle,"cancelar_button","Cancelar",this.updatedetalleSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosUpdateDetalle,"guardarcambios_button","Guardar",this.updatedetalleSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaUpdateDetalle,"guardarcambiostabla_button","Guardar",this.updatedetalleSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarUpdateDetalle,"cerrar_button","Salir",this.updatedetalleSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoUpdateDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarUpdateDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosUpdateDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaUpdateDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarUpdateDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarUpdateDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarUpdateDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarUpdateDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoUpdateDetalle.setToolTipText("Nuevo"+" "+UpdateDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarUpdateDetalle.setToolTipText("Editar"+" "+UpdateDetalleConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarUpdateDetalle.setToolTipText("Actualizar"+" "+UpdateDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarUpdateDetalle.setToolTipText("Eliminar)"+" "+UpdateDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarUpdateDetalle.setToolTipText("Cancelar"+" "+UpdateDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosUpdateDetalle.setToolTipText("Guardar"+" "+UpdateDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaUpdateDetalle.setToolTipText("Guardar"+" "+UpdateDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarUpdateDetalle.setToolTipText("Salir"+" "+UpdateDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoUpdateDetalle";
		inputMap = this.jButtonNuevoUpdateDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoUpdateDetalle.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoUpdateDetalle"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarUpdateDetalle";
		inputMap = this.jButtonActualizarUpdateDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarUpdateDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarUpdateDetalle"));
		
		//ELIMINAR
		sMapKey = "EliminarUpdateDetalle";
		inputMap = this.jButtonEliminarUpdateDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarUpdateDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarUpdateDetalle"));
		
		//CANCELAR	
		sMapKey = "CancelarUpdateDetalle";
		inputMap = this.jButtonCancelarUpdateDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarUpdateDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarUpdateDetalle"));
		
		//CERRAR		
		sMapKey = "CerrarUpdateDetalle";
		inputMap = this.jButtonCerrarUpdateDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarUpdateDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarUpdateDetalle"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaUpdateDetalle";
		inputMap = this.jButtonGuardarCambiosTablaUpdateDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaUpdateDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaUpdateDetalle"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoUpdateDetalle = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoUpdateDetalle.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoUpdateDetalle.setToolTipText("Nuevo UpdateDetalle");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoUpdateDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarUpdateDetalle = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarUpdateDetalle.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarUpdateDetalle.setToolTipText("Sin Cerrar Ventana UpdateDetalle");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarUpdateDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeUpdateDetalle = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeUpdateDetalle.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeUpdateDetalle.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeUpdateDetalle, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesUpdateDetalle = new JComboBoxMe();
		//this.jComboBoxTiposAccionesUpdateDetalle.setText("Accion");
		this.jComboBoxTiposAccionesUpdateDetalle.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioUpdateDetalle = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioUpdateDetalle.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioUpdateDetalle.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesUpdateDetalle = new JLabelMe();
		
		this.jLabelAccionesUpdateDetalle.setText("Acciones");		
		this.jLabelAccionesUpdateDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesUpdateDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesUpdateDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposUpdateDetalle();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysUpdateDetalle();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesUpdateDetalle=new JTabbedPane();
		this.jTabbedPaneRelacionesUpdateDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesUpdateDetalle,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesUpdateDetalle.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesUpdateDetalle.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesUpdateDetalle.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesUpdateDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioUpdateDetalle.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioUpdateDetalle.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioUpdateDetalle.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioUpdateDetalle, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposUpdateDetalle = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosUpdateDetalle = new GridBagLayout();
		
		this.jPanelCamposUpdateDetalle.setLayout(gridaBagLayoutCamposUpdateDetalle);
		this.jPanelCamposOcultosUpdateDetalle.setLayout(gridaBagLayoutCamposOcultosUpdateDetalle);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
	this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUpdateDetalle.gridy = 0;
	this.gridBagConstraintsUpdateDetalle.gridx = 0;
	this.gridBagConstraintsUpdateDetalle.ipadx = 0;
	this.gridBagConstraintsUpdateDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidUpdateDetalle.add(jLabelIdUpdateDetalle, this.gridBagConstraintsUpdateDetalle);



	this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
	this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUpdateDetalle.gridy = 0;
	this.gridBagConstraintsUpdateDetalle.gridx = 1;
	this.gridBagConstraintsUpdateDetalle.ipadx = 0;
	this.gridBagConstraintsUpdateDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidUpdateDetalle.add(jTextFieldidUpdateDetalle, this.gridBagConstraintsUpdateDetalle);


	this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
	this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUpdateDetalle.gridy = 0;
	this.gridBagConstraintsUpdateDetalle.gridx = 0;
	this.gridBagConstraintsUpdateDetalle.ipadx = 0;
	this.gridBagConstraintsUpdateDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_updateUpdateDetalle.add(jLabelid_updateUpdateDetalle, this.gridBagConstraintsUpdateDetalle);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
		//this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUpdateDetalle.gridy = 0;
		this.gridBagConstraintsUpdateDetalle.gridx = 2;
		this.gridBagConstraintsUpdateDetalle.ipadx = 0;
		this.gridBagConstraintsUpdateDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_updateUpdateDetalle.add(jButtonid_updateUpdateDetalleBusqueda, this.gridBagConstraintsUpdateDetalle);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
		//this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUpdateDetalle.gridy = 0;
		this.gridBagConstraintsUpdateDetalle.gridx = 3;
		this.gridBagConstraintsUpdateDetalle.ipadx = 0;
		this.gridBagConstraintsUpdateDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_updateUpdateDetalle.add(jButtonid_updateUpdateDetalleUpdate, this.gridBagConstraintsUpdateDetalle);
	}

	this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
	this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUpdateDetalle.gridy = 0;
	this.gridBagConstraintsUpdateDetalle.gridx = 1;
	this.gridBagConstraintsUpdateDetalle.ipadx = 0;
	this.gridBagConstraintsUpdateDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_updateUpdateDetalle.add(jComboBoxid_updateUpdateDetalle, this.gridBagConstraintsUpdateDetalle);


	this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
	this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUpdateDetalle.gridy = 0;
	this.gridBagConstraintsUpdateDetalle.gridx = 0;
	this.gridBagConstraintsUpdateDetalle.ipadx = 0;
	this.gridBagConstraintsUpdateDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_anioUpdateDetalle.add(jLabelid_anioUpdateDetalle, this.gridBagConstraintsUpdateDetalle);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
		//this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUpdateDetalle.gridy = 0;
		this.gridBagConstraintsUpdateDetalle.gridx = 2;
		this.gridBagConstraintsUpdateDetalle.ipadx = 0;
		this.gridBagConstraintsUpdateDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioUpdateDetalle.add(jButtonid_anioUpdateDetalleBusqueda, this.gridBagConstraintsUpdateDetalle);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
		//this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUpdateDetalle.gridy = 0;
		this.gridBagConstraintsUpdateDetalle.gridx = 3;
		this.gridBagConstraintsUpdateDetalle.ipadx = 0;
		this.gridBagConstraintsUpdateDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioUpdateDetalle.add(jButtonid_anioUpdateDetalleUpdate, this.gridBagConstraintsUpdateDetalle);
	}

	this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
	this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUpdateDetalle.gridy = 0;
	this.gridBagConstraintsUpdateDetalle.gridx = 1;
	this.gridBagConstraintsUpdateDetalle.ipadx = 0;
	this.gridBagConstraintsUpdateDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_anioUpdateDetalle.add(jComboBoxid_anioUpdateDetalle, this.gridBagConstraintsUpdateDetalle);


	this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
	this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUpdateDetalle.gridy = 0;
	this.gridBagConstraintsUpdateDetalle.gridx = 0;
	this.gridBagConstraintsUpdateDetalle.ipadx = 0;
	this.gridBagConstraintsUpdateDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mesUpdateDetalle.add(jLabelid_mesUpdateDetalle, this.gridBagConstraintsUpdateDetalle);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
		//this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUpdateDetalle.gridy = 0;
		this.gridBagConstraintsUpdateDetalle.gridx = 2;
		this.gridBagConstraintsUpdateDetalle.ipadx = 0;
		this.gridBagConstraintsUpdateDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesUpdateDetalle.add(jButtonid_mesUpdateDetalleBusqueda, this.gridBagConstraintsUpdateDetalle);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
		//this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUpdateDetalle.gridy = 0;
		this.gridBagConstraintsUpdateDetalle.gridx = 3;
		this.gridBagConstraintsUpdateDetalle.ipadx = 0;
		this.gridBagConstraintsUpdateDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesUpdateDetalle.add(jButtonid_mesUpdateDetalleUpdate, this.gridBagConstraintsUpdateDetalle);
	}

	this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
	this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUpdateDetalle.gridy = 0;
	this.gridBagConstraintsUpdateDetalle.gridx = 1;
	this.gridBagConstraintsUpdateDetalle.ipadx = 0;
	this.gridBagConstraintsUpdateDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mesUpdateDetalle.add(jComboBoxid_mesUpdateDetalle, this.gridBagConstraintsUpdateDetalle);


	this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
	this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUpdateDetalle.gridy = 0;
	this.gridBagConstraintsUpdateDetalle.gridx = 0;
	this.gridBagConstraintsUpdateDetalle.ipadx = 0;
	this.gridBagConstraintsUpdateDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoUpdateDetalle.add(jLabelcodigoUpdateDetalle, this.gridBagConstraintsUpdateDetalle);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
		//this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUpdateDetalle.gridy = 0;
		this.gridBagConstraintsUpdateDetalle.gridx = 2;
		this.gridBagConstraintsUpdateDetalle.ipadx = 0;
		this.gridBagConstraintsUpdateDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoUpdateDetalle.add(jButtoncodigoUpdateDetalleBusqueda, this.gridBagConstraintsUpdateDetalle);
	}

	this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
	this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUpdateDetalle.gridy = 0;
	this.gridBagConstraintsUpdateDetalle.gridx = 1;
	this.gridBagConstraintsUpdateDetalle.ipadx = 0;
	this.gridBagConstraintsUpdateDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoUpdateDetalle.add(jTextFieldcodigoUpdateDetalle, this.gridBagConstraintsUpdateDetalle);


	this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
	this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUpdateDetalle.gridy = 0;
	this.gridBagConstraintsUpdateDetalle.gridx = 0;
	this.gridBagConstraintsUpdateDetalle.ipadx = 0;
	this.gridBagConstraintsUpdateDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_procesoUpdateDetalle.add(jLabelcodigo_procesoUpdateDetalle, this.gridBagConstraintsUpdateDetalle);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
		//this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUpdateDetalle.gridy = 0;
		this.gridBagConstraintsUpdateDetalle.gridx = 2;
		this.gridBagConstraintsUpdateDetalle.ipadx = 0;
		this.gridBagConstraintsUpdateDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_procesoUpdateDetalle.add(jButtoncodigo_procesoUpdateDetalleBusqueda, this.gridBagConstraintsUpdateDetalle);
	}

	this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
	this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUpdateDetalle.gridy = 0;
	this.gridBagConstraintsUpdateDetalle.gridx = 1;
	this.gridBagConstraintsUpdateDetalle.ipadx = 0;
	this.gridBagConstraintsUpdateDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_procesoUpdateDetalle.add(jTextFieldcodigo_procesoUpdateDetalle, this.gridBagConstraintsUpdateDetalle);


	this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
	this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUpdateDetalle.gridy = 0;
	this.gridBagConstraintsUpdateDetalle.gridx = 0;
	this.gridBagConstraintsUpdateDetalle.ipadx = 0;
	this.gridBagConstraintsUpdateDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelquery_resumenUpdateDetalle.add(jLabelquery_resumenUpdateDetalle, this.gridBagConstraintsUpdateDetalle);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
		//this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUpdateDetalle.gridy = 0;
		this.gridBagConstraintsUpdateDetalle.gridx = 2;
		this.gridBagConstraintsUpdateDetalle.ipadx = 0;
		this.gridBagConstraintsUpdateDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelquery_resumenUpdateDetalle.add(jButtonquery_resumenUpdateDetalleBusqueda, this.gridBagConstraintsUpdateDetalle);
	}

	this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
	this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUpdateDetalle.gridy = 0;
	this.gridBagConstraintsUpdateDetalle.gridx = 1;
	this.gridBagConstraintsUpdateDetalle.ipadx = 0;
	this.gridBagConstraintsUpdateDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelquery_resumenUpdateDetalle.add(jscrollPanequery_resumenUpdateDetalle, this.gridBagConstraintsUpdateDetalle);


	this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
	this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUpdateDetalle.gridy = 0;
	this.gridBagConstraintsUpdateDetalle.gridx = 0;
	this.gridBagConstraintsUpdateDetalle.ipadx = 0;
	this.gridBagConstraintsUpdateDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_intentoUpdateDetalle.add(jLabelnumero_intentoUpdateDetalle, this.gridBagConstraintsUpdateDetalle);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
		//this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUpdateDetalle.gridy = 0;
		this.gridBagConstraintsUpdateDetalle.gridx = 2;
		this.gridBagConstraintsUpdateDetalle.ipadx = 0;
		this.gridBagConstraintsUpdateDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_intentoUpdateDetalle.add(jButtonnumero_intentoUpdateDetalleBusqueda, this.gridBagConstraintsUpdateDetalle);
	}

	this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
	this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUpdateDetalle.gridy = 0;
	this.gridBagConstraintsUpdateDetalle.gridx = 1;
	this.gridBagConstraintsUpdateDetalle.ipadx = 0;
	this.gridBagConstraintsUpdateDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_intentoUpdateDetalle.add(jTextFieldnumero_intentoUpdateDetalle, this.gridBagConstraintsUpdateDetalle);


	this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
	this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUpdateDetalle.gridy = 0;
	this.gridBagConstraintsUpdateDetalle.gridx = 0;
	this.gridBagConstraintsUpdateDetalle.ipadx = 0;
	this.gridBagConstraintsUpdateDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_archivoUpdateDetalle.add(jLabelfecha_archivoUpdateDetalle, this.gridBagConstraintsUpdateDetalle);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
		//this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUpdateDetalle.gridy = 0;
		this.gridBagConstraintsUpdateDetalle.gridx = 2;
		this.gridBagConstraintsUpdateDetalle.ipadx = 0;
		this.gridBagConstraintsUpdateDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_archivoUpdateDetalle.add(jButtonfecha_archivoUpdateDetalleBusqueda, this.gridBagConstraintsUpdateDetalle);
	}

	this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
	this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUpdateDetalle.gridy = 0;
	this.gridBagConstraintsUpdateDetalle.gridx = 1;
	this.gridBagConstraintsUpdateDetalle.ipadx = 0;
	this.gridBagConstraintsUpdateDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_archivoUpdateDetalle.add(jDateChooserfecha_archivoUpdateDetalle, this.gridBagConstraintsUpdateDetalle);


	this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
	this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUpdateDetalle.gridy = 0;
	this.gridBagConstraintsUpdateDetalle.gridx = 0;
	this.gridBagConstraintsUpdateDetalle.ipadx = 0;
	this.gridBagConstraintsUpdateDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaUpdateDetalle.add(jLabelfechaUpdateDetalle, this.gridBagConstraintsUpdateDetalle);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
		//this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUpdateDetalle.gridy = 0;
		this.gridBagConstraintsUpdateDetalle.gridx = 2;
		this.gridBagConstraintsUpdateDetalle.ipadx = 0;
		this.gridBagConstraintsUpdateDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaUpdateDetalle.add(jButtonfechaUpdateDetalleBusqueda, this.gridBagConstraintsUpdateDetalle);
	}

	this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
	this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUpdateDetalle.gridy = 0;
	this.gridBagConstraintsUpdateDetalle.gridx = 1;
	this.gridBagConstraintsUpdateDetalle.ipadx = 0;
	this.gridBagConstraintsUpdateDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaUpdateDetalle.add(jDateChooserfechaUpdateDetalle, this.gridBagConstraintsUpdateDetalle);


	this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
	this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUpdateDetalle.gridy = 0;
	this.gridBagConstraintsUpdateDetalle.gridx = 0;
	this.gridBagConstraintsUpdateDetalle.ipadx = 0;
	this.gridBagConstraintsUpdateDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelordenUpdateDetalle.add(jLabelordenUpdateDetalle, this.gridBagConstraintsUpdateDetalle);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
		//this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUpdateDetalle.gridy = 0;
		this.gridBagConstraintsUpdateDetalle.gridx = 2;
		this.gridBagConstraintsUpdateDetalle.ipadx = 0;
		this.gridBagConstraintsUpdateDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelordenUpdateDetalle.add(jButtonordenUpdateDetalleBusqueda, this.gridBagConstraintsUpdateDetalle);
	}

	this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
	this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUpdateDetalle.gridy = 0;
	this.gridBagConstraintsUpdateDetalle.gridx = 1;
	this.gridBagConstraintsUpdateDetalle.ipadx = 0;
	this.gridBagConstraintsUpdateDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelordenUpdateDetalle.add(jTextFieldordenUpdateDetalle, this.gridBagConstraintsUpdateDetalle);


	this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
	this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUpdateDetalle.gridy = 0;
	this.gridBagConstraintsUpdateDetalle.gridx = 0;
	this.gridBagConstraintsUpdateDetalle.ipadx = 0;
	this.gridBagConstraintsUpdateDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelejecutadoUpdateDetalle.add(jLabelejecutadoUpdateDetalle, this.gridBagConstraintsUpdateDetalle);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
		//this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUpdateDetalle.gridy = 0;
		this.gridBagConstraintsUpdateDetalle.gridx = 2;
		this.gridBagConstraintsUpdateDetalle.ipadx = 0;
		this.gridBagConstraintsUpdateDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelejecutadoUpdateDetalle.add(jButtonejecutadoUpdateDetalleBusqueda, this.gridBagConstraintsUpdateDetalle);
	}

	this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
	this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUpdateDetalle.gridy = 0;
	this.gridBagConstraintsUpdateDetalle.gridx = 1;
	this.gridBagConstraintsUpdateDetalle.ipadx = 0;
	this.gridBagConstraintsUpdateDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelejecutadoUpdateDetalle.add(jCheckBoxejecutadoUpdateDetalle, this.gridBagConstraintsUpdateDetalle);


	this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
	this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUpdateDetalle.gridy = 0;
	this.gridBagConstraintsUpdateDetalle.gridx = 0;
	this.gridBagConstraintsUpdateDetalle.ipadx = 0;
	this.gridBagConstraintsUpdateDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelesta_activoUpdateDetalle.add(jLabelesta_activoUpdateDetalle, this.gridBagConstraintsUpdateDetalle);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
		//this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUpdateDetalle.gridy = 0;
		this.gridBagConstraintsUpdateDetalle.gridx = 2;
		this.gridBagConstraintsUpdateDetalle.ipadx = 0;
		this.gridBagConstraintsUpdateDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelesta_activoUpdateDetalle.add(jButtonesta_activoUpdateDetalleBusqueda, this.gridBagConstraintsUpdateDetalle);
	}

	this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
	this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUpdateDetalle.gridy = 0;
	this.gridBagConstraintsUpdateDetalle.gridx = 1;
	this.gridBagConstraintsUpdateDetalle.ipadx = 0;
	this.gridBagConstraintsUpdateDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelesta_activoUpdateDetalle.add(jCheckBoxesta_activoUpdateDetalle, this.gridBagConstraintsUpdateDetalle);


	this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
	this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUpdateDetalle.gridy = 0;
	this.gridBagConstraintsUpdateDetalle.gridx = 0;
	this.gridBagConstraintsUpdateDetalle.ipadx = 0;
	this.gridBagConstraintsUpdateDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionUpdateDetalle.add(jLabeldescripcionUpdateDetalle, this.gridBagConstraintsUpdateDetalle);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
		//this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUpdateDetalle.gridy = 0;
		this.gridBagConstraintsUpdateDetalle.gridx = 2;
		this.gridBagConstraintsUpdateDetalle.ipadx = 0;
		this.gridBagConstraintsUpdateDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionUpdateDetalle.add(jButtondescripcionUpdateDetalleBusqueda, this.gridBagConstraintsUpdateDetalle);
	}

	this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
	this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUpdateDetalle.gridy = 0;
	this.gridBagConstraintsUpdateDetalle.gridx = 1;
	this.gridBagConstraintsUpdateDetalle.ipadx = 0;
	this.gridBagConstraintsUpdateDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionUpdateDetalle.add(jscrollPanedescripcionUpdateDetalle, this.gridBagConstraintsUpdateDetalle);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
	this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUpdateDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUpdateDetalle.gridy = iYPanelCamposUpdateDetalle;
	this.gridBagConstraintsUpdateDetalle.gridx = iXPanelCamposUpdateDetalle++;
	this.gridBagConstraintsUpdateDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUpdateDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUpdateDetalle.add(this.jPanelidUpdateDetalle, this.gridBagConstraintsUpdateDetalle);



	if(iXPanelCamposUpdateDetalle % 2==0) {
		iXPanelCamposUpdateDetalle=0;
		iYPanelCamposUpdateDetalle++;
	}
	this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
	this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUpdateDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUpdateDetalle.gridy = iYPanelCamposUpdateDetalle;
	this.gridBagConstraintsUpdateDetalle.gridx = iXPanelCamposUpdateDetalle++;
	this.gridBagConstraintsUpdateDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUpdateDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUpdateDetalle.add(this.jPanelid_updateUpdateDetalle, this.gridBagConstraintsUpdateDetalle);



	if(iXPanelCamposUpdateDetalle % 2==0) {
		iXPanelCamposUpdateDetalle=0;
		iYPanelCamposUpdateDetalle++;
	}
	this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
	this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUpdateDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUpdateDetalle.gridy = iYPanelCamposUpdateDetalle;
	this.gridBagConstraintsUpdateDetalle.gridx = iXPanelCamposUpdateDetalle++;
	this.gridBagConstraintsUpdateDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUpdateDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUpdateDetalle.add(this.jPanelid_anioUpdateDetalle, this.gridBagConstraintsUpdateDetalle);



	if(iXPanelCamposUpdateDetalle % 2==0) {
		iXPanelCamposUpdateDetalle=0;
		iYPanelCamposUpdateDetalle++;
	}
	this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
	this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUpdateDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUpdateDetalle.gridy = iYPanelCamposUpdateDetalle;
	this.gridBagConstraintsUpdateDetalle.gridx = iXPanelCamposUpdateDetalle++;
	this.gridBagConstraintsUpdateDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUpdateDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUpdateDetalle.add(this.jPanelid_mesUpdateDetalle, this.gridBagConstraintsUpdateDetalle);



	if(iXPanelCamposUpdateDetalle % 2==0) {
		iXPanelCamposUpdateDetalle=0;
		iYPanelCamposUpdateDetalle++;
	}
	this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
	this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUpdateDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUpdateDetalle.gridy = iYPanelCamposUpdateDetalle;
	this.gridBagConstraintsUpdateDetalle.gridx = iXPanelCamposUpdateDetalle++;
	this.gridBagConstraintsUpdateDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUpdateDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUpdateDetalle.add(this.jPanelcodigoUpdateDetalle, this.gridBagConstraintsUpdateDetalle);



	if(iXPanelCamposUpdateDetalle % 2==0) {
		iXPanelCamposUpdateDetalle=0;
		iYPanelCamposUpdateDetalle++;
	}
	this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
	this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUpdateDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUpdateDetalle.gridy = iYPanelCamposUpdateDetalle;
	this.gridBagConstraintsUpdateDetalle.gridx = iXPanelCamposUpdateDetalle++;
	this.gridBagConstraintsUpdateDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUpdateDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUpdateDetalle.add(this.jPanelcodigo_procesoUpdateDetalle, this.gridBagConstraintsUpdateDetalle);



	if(iXPanelCamposUpdateDetalle % 2==0) {
		iXPanelCamposUpdateDetalle=0;
		iYPanelCamposUpdateDetalle++;
	}
	this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
	this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUpdateDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUpdateDetalle.gridy = iYPanelCamposUpdateDetalle;
	this.gridBagConstraintsUpdateDetalle.gridx = iXPanelCamposUpdateDetalle++;
	this.gridBagConstraintsUpdateDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUpdateDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUpdateDetalle.add(this.jPanelquery_resumenUpdateDetalle, this.gridBagConstraintsUpdateDetalle);



	if(iXPanelCamposUpdateDetalle % 2==0) {
		iXPanelCamposUpdateDetalle=0;
		iYPanelCamposUpdateDetalle++;
	}
	this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
	this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUpdateDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUpdateDetalle.gridy = iYPanelCamposUpdateDetalle;
	this.gridBagConstraintsUpdateDetalle.gridx = iXPanelCamposUpdateDetalle++;
	this.gridBagConstraintsUpdateDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUpdateDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUpdateDetalle.add(this.jPanelnumero_intentoUpdateDetalle, this.gridBagConstraintsUpdateDetalle);



	if(iXPanelCamposUpdateDetalle % 2==0) {
		iXPanelCamposUpdateDetalle=0;
		iYPanelCamposUpdateDetalle++;
	}
	this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
	this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUpdateDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUpdateDetalle.gridy = iYPanelCamposUpdateDetalle;
	this.gridBagConstraintsUpdateDetalle.gridx = iXPanelCamposUpdateDetalle++;
	this.gridBagConstraintsUpdateDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUpdateDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUpdateDetalle.add(this.jPanelfecha_archivoUpdateDetalle, this.gridBagConstraintsUpdateDetalle);



	if(iXPanelCamposUpdateDetalle % 2==0) {
		iXPanelCamposUpdateDetalle=0;
		iYPanelCamposUpdateDetalle++;
	}
	this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
	this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUpdateDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUpdateDetalle.gridy = iYPanelCamposUpdateDetalle;
	this.gridBagConstraintsUpdateDetalle.gridx = iXPanelCamposUpdateDetalle++;
	this.gridBagConstraintsUpdateDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUpdateDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUpdateDetalle.add(this.jPanelfechaUpdateDetalle, this.gridBagConstraintsUpdateDetalle);



	if(iXPanelCamposUpdateDetalle % 2==0) {
		iXPanelCamposUpdateDetalle=0;
		iYPanelCamposUpdateDetalle++;
	}
	this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
	this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUpdateDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUpdateDetalle.gridy = iYPanelCamposUpdateDetalle;
	this.gridBagConstraintsUpdateDetalle.gridx = iXPanelCamposUpdateDetalle++;
	this.gridBagConstraintsUpdateDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUpdateDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUpdateDetalle.add(this.jPanelordenUpdateDetalle, this.gridBagConstraintsUpdateDetalle);



	if(iXPanelCamposUpdateDetalle % 2==0) {
		iXPanelCamposUpdateDetalle=0;
		iYPanelCamposUpdateDetalle++;
	}
	this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
	this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUpdateDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUpdateDetalle.gridy = iYPanelCamposUpdateDetalle;
	this.gridBagConstraintsUpdateDetalle.gridx = iXPanelCamposUpdateDetalle++;
	this.gridBagConstraintsUpdateDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUpdateDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUpdateDetalle.add(this.jPanelejecutadoUpdateDetalle, this.gridBagConstraintsUpdateDetalle);



	if(iXPanelCamposUpdateDetalle % 2==0) {
		iXPanelCamposUpdateDetalle=0;
		iYPanelCamposUpdateDetalle++;
	}
	this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
	this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUpdateDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUpdateDetalle.gridy = iYPanelCamposUpdateDetalle;
	this.gridBagConstraintsUpdateDetalle.gridx = iXPanelCamposUpdateDetalle++;
	this.gridBagConstraintsUpdateDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUpdateDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUpdateDetalle.add(this.jPanelesta_activoUpdateDetalle, this.gridBagConstraintsUpdateDetalle);



	if(iXPanelCamposUpdateDetalle % 2==0) {
		iXPanelCamposUpdateDetalle=0;
		iYPanelCamposUpdateDetalle++;
	}
	this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
	this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUpdateDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUpdateDetalle.gridy = iYPanelCamposUpdateDetalle;
	this.gridBagConstraintsUpdateDetalle.gridx = iXPanelCamposUpdateDetalle++;
	this.gridBagConstraintsUpdateDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUpdateDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUpdateDetalle.add(this.jPaneldescripcionUpdateDetalle, this.gridBagConstraintsUpdateDetalle);



	if(iXPanelCamposUpdateDetalle % 2==0) {
		iXPanelCamposUpdateDetalle=0;
		iYPanelCamposUpdateDetalle++;
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
			
		GridBagLayout gridaBagLayoutAccionesUpdateDetalle= new GridBagLayout();
		this.jPanelAccionesUpdateDetalle.setLayout(gridaBagLayoutAccionesUpdateDetalle);
		
		GridBagLayout gridaBagLayoutAccionesFormularioUpdateDetalle= new GridBagLayout();
		this.jPanelAccionesFormularioUpdateDetalle.setLayout(gridaBagLayoutAccionesFormularioUpdateDetalle);
		
		this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
		this.gridBagConstraintsUpdateDetalle.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsUpdateDetalle.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioUpdateDetalle.add(this.jComboBoxTiposAccionesFormularioUpdateDetalle, this.gridBagConstraintsUpdateDetalle);

		this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
		this.gridBagConstraintsUpdateDetalle.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsUpdateDetalle.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioUpdateDetalle.add(this.jCheckBoxPostAccionNuevoUpdateDetalle, this.gridBagConstraintsUpdateDetalle);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.updatedetalleSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
			this.gridBagConstraintsUpdateDetalle.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsUpdateDetalle.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioUpdateDetalle.add(this.jCheckBoxPostAccionSinCerrarUpdateDetalle, this.gridBagConstraintsUpdateDetalle);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.updatedetalleSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.updatedetalleSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
			this.gridBagConstraintsUpdateDetalle.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsUpdateDetalle.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioUpdateDetalle.add(this.jCheckBoxPostAccionSinMensajeUpdateDetalle, this.gridBagConstraintsUpdateDetalle);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
		this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUpdateDetalle.gridy = 0;
		this.gridBagConstraintsUpdateDetalle.gridx = iPosXAccion++;
			
		this.jPanelAccionesUpdateDetalle.add(this.jButtonModificarUpdateDetalle, this.gridBagConstraintsUpdateDetalle);							

		this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
		this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUpdateDetalle.gridy = 0;
		this.gridBagConstraintsUpdateDetalle.gridx =iPosXAccion++;
			
		this.jPanelAccionesUpdateDetalle.add(this.jButtonEliminarUpdateDetalle, this.gridBagConstraintsUpdateDetalle);
		
			
		this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
		this.gridBagConstraintsUpdateDetalle.gridy = 0;		
		this.gridBagConstraintsUpdateDetalle.gridx = iPosXAccion++;
		
		this.jPanelAccionesUpdateDetalle.add(this.jButtonActualizarUpdateDetalle, this.gridBagConstraintsUpdateDetalle);


		this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
		this.gridBagConstraintsUpdateDetalle.gridy = 0;		
		this.gridBagConstraintsUpdateDetalle.gridx = iPosXAccion++;
		
		this.jPanelAccionesUpdateDetalle.add(this.jButtonGuardarCambiosUpdateDetalle, this.gridBagConstraintsUpdateDetalle);	
		
		this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
		this.gridBagConstraintsUpdateDetalle.gridy = 0;		
		this.gridBagConstraintsUpdateDetalle.gridx =iPosXAccion++;
		
		this.jPanelAccionesUpdateDetalle.add(this.jButtonCancelarUpdateDetalle, this.gridBagConstraintsUpdateDetalle);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutUpdateDetalle = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutUpdateDetalle);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.updatedetalleSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();						
			this.gridBagConstraintsUpdateDetalle.gridy = iGridyPrincipal++;
			this.gridBagConstraintsUpdateDetalle.gridx = 0;		
			//this.gridBagConstraintsUpdateDetalle.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUpdateDetalle.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsUpdateDetalle.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
		this.gridBagConstraintsUpdateDetalle.gridy =iGridyPrincipal++;
		this.gridBagConstraintsUpdateDetalle.gridx =0;
		this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsUpdateDetalle.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosUpdateDetalle, this.gridBagConstraintsUpdateDetalle);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(UpdateDetalleJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleUpdateDetalle = new UpdateDetalleBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Update Detalle DATOS");
			
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
			
	        //this.setTitle("[FOR] - Update Detalle DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Update Detalle Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			UpdateDetalleModel updatedetalleModel=new UpdateDetalleModel(this);
			
			//SI USARA CLASE INTERNA
			//UpdateDetalleModel.UpdateDetalleFocusTraversalPolicy updatedetalleFocusTraversalPolicy = updatedetalleModel.new UpdateDetalleFocusTraversalPolicy(this);
			
			//updatedetalleFocusTraversalPolicy.setupdatedetalleJInternalFrame(this);
			
			this.setFocusTraversalPolicy(updatedetalleModel);
			
			
			this.jContentPaneDetalleUpdateDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleUpdateDetalle = new GridBagLayout();	
			this.jContentPaneDetalleUpdateDetalle.setLayout(gridaBagLayoutDetalleUpdateDetalle);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosUpdateDetalle = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
				this.gridBagConstraintsUpdateDetalle.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsUpdateDetalle.gridx = 0;
					
				
				this.jContentPaneDetalleUpdateDetalle.add(jTtoolBarDetalleUpdateDetalle, gridBagConstraintsUpdateDetalle);								
				
}
			
			this.jScrollPanelDatosEdicionUpdateDetalle=   new JScrollPane(jContentPaneDetalleUpdateDetalle,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionUpdateDetalle.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionUpdateDetalle.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionUpdateDetalle.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralUpdateDetalle=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralUpdateDetalle.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralUpdateDetalle.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralUpdateDetalle.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
			
			
	        this.gridBagConstraintsUpdateDetalle.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsUpdateDetalle.gridx = 0;
	        
			this.jContentPaneDetalleUpdateDetalle.add(jPanelCamposUpdateDetalle, gridBagConstraintsUpdateDetalle);
			
			
			
			
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
						&& updatedetalleSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.updatedetalleSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsUpdateDetalle= new GridBagConstraints();
						this.gridBagConstraintsUpdateDetalle.gridy = iGridyRelaciones++;
						this.gridBagConstraintsUpdateDetalle.gridx = 0;
						this.jContentPaneDetalleUpdateDetalle.add(this.jTabbedPaneRelacionesUpdateDetalle, this.gridBagConstraintsUpdateDetalle);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesUpdateDetalle.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosUpdateDetalle.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
					this.gridBagConstraintsUpdateDetalle.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsUpdateDetalle.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsUpdateDetalle.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsUpdateDetalle.gridx = 0;
					
				
					this.jContentPaneDetalleUpdateDetalle.add(jPanelCamposOcultosUpdateDetalle, gridBagConstraintsUpdateDetalle);
				
					this.jPanelCamposOcultosUpdateDetalle.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
			this.gridBagConstraintsUpdateDetalle.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsUpdateDetalle.gridx = 0;
	        this.gridBagConstraintsUpdateDetalle.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleUpdateDetalle.add(this.jPanelAccionesFormularioUpdateDetalle, this.gridBagConstraintsUpdateDetalle);							
			
			
			
			this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
	        this.gridBagConstraintsUpdateDetalle.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsUpdateDetalle.gridx = 0;
	        
			
			this.jContentPaneDetalleUpdateDetalle.add(this.jPanelAccionesUpdateDetalle, this.gridBagConstraintsUpdateDetalle);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionUpdateDetalle);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionUpdateDetalle=   new JScrollPane(this.jPanelCamposUpdateDetalle,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionUpdateDetalle.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionUpdateDetalle.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionUpdateDetalle.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
			this.gridBagConstraintsUpdateDetalle.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsUpdateDetalle.gridx = 0;
			this.gridBagConstraintsUpdateDetalle.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsUpdateDetalle.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsUpdateDetalle.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionUpdateDetalle, this.gridBagConstraintsUpdateDetalle);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
			this.gridBagConstraintsUpdateDetalle.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsUpdateDetalle.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioUpdateDetalle, this.gridBagConstraintsUpdateDetalle);			
			
			this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
			this.gridBagConstraintsUpdateDetalle.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsUpdateDetalle.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesUpdateDetalle, this.gridBagConstraintsUpdateDetalle);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
		this.gridBagConstraintsUpdateDetalle.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsUpdateDetalle.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposUpdateDetalle, this.gridBagConstraintsUpdateDetalle);
			
			
		this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
		this.gridBagConstraintsUpdateDetalle.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsUpdateDetalle.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosUpdateDetalle, this.gridBagConstraintsUpdateDetalle);
		
			
		this.gridBagConstraintsUpdateDetalle = new GridBagConstraints();
		this.gridBagConstraintsUpdateDetalle.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsUpdateDetalle.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesUpdateDetalle, this.gridBagConstraintsUpdateDetalle);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralUpdateDetalle;//jContentPane;
		
		return jScrollPanelDatosEdicionUpdateDetalle;
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
