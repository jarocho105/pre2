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
import com.bydan.erp.seguridad.util.UpdateConstantesFunciones;

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
public class UpdateDetalleFormJInternalFrame extends UpdateBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleUpdate;
	
	protected JMenuBar jmenuBarDetalleUpdate;
	
	protected JMenu jmenuDetalleUpdate;
	protected JMenu jmenuDetalleArchivoUpdate;
	protected JMenu jmenuDetalleAccionesUpdate;
	protected JMenu jmenuDetalleDatosUpdate;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleUpdate = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutUpdate;	
	protected GridBagConstraints gridBagConstraintsUpdate;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected UpdateBeanSwingJInternalFrameAdditional jInternalFrameDetalleUpdate;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";
	
	public UpdateSessionBean updateSessionBean;
	
	

	public UpdateDetalleBeanSwingJInternalFrame updatedetalleBeanSwingJInternalFrame=null;
	public UpdateDetalleBeanSwingJInternalFrame updatedetalleBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteUpdateDetalle=false;
	public UpdateDetalleSessionBean updatedetalleSessionBean;
	
	
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;	
	
	public UpdateLogic updateLogic;
	
	public JScrollPane jScrollPanelDatosUpdate;
	public JScrollPane jScrollPanelDatosEdicionUpdate;
	public JScrollPane jScrollPanelDatosGeneralUpdate;
	
	protected JPanel jPanelCamposUpdate;    
	protected JPanel jPanelCamposOcultosUpdate;    	
	protected JPanel jPanelAccionesUpdate;
	protected JPanel jPanelAccionesFormularioUpdate;
    
	
	
	protected Integer iXPanelCamposUpdate=0;
	protected Integer iYPanelCamposUpdate=0;
	
	protected Integer iXPanelCamposOcultosUpdate=0;
	protected Integer iYPanelCamposOcultosUpdate=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoUpdate;
	public JButton jButtonModificarUpdate;
	public JButton jButtonActualizarUpdate;
    public JButton jButtonEliminarUpdate;
	public JButton jButtonCancelarUpdate;
    public JButton jButtonGuardarCambiosUpdate;
	public JButton jButtonGuardarCambiosTablaUpdate;
	protected JButton jButtonCerrarUpdate;
	
	
	protected JButton jButtonProcesarInformacionUpdate;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoUpdate;
	protected JCheckBox jCheckBoxPostAccionSinCerrarUpdate;
	protected JCheckBox jCheckBoxPostAccionSinMensajeUpdate;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarUpdate;
	protected JButton jButtonModificarToolBarUpdate;
	protected JButton jButtonActualizarToolBarUpdate;
    protected JButton jButtonEliminarToolBarUpdate;
	protected JButton jButtonCancelarToolBarUpdate;
    protected JButton jButtonGuardarCambiosToolBarUpdate;
	protected JButton jButtonGuardarCambiosTablaToolBarUpdate;
	protected JButton jButtonMostrarOcultarTablaToolBarUpdate;
	protected JButton jButtonCerrarToolBarUpdate;
	
	protected JButton jButtonProcesarInformacionToolBarUpdate;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoUpdate;
	protected JMenuItem jMenuItemModificarUpdate;
	protected JMenuItem jMenuItemActualizarUpdate;
    protected JMenuItem jMenuItemEliminarUpdate;
	protected JMenuItem jMenuItemCancelarUpdate;
    protected JMenuItem jMenuItemGuardarCambiosUpdate;
	protected JMenuItem jMenuItemGuardarCambiosTablaUpdate;
	protected JMenuItem jMenuItemCerrarUpdate;
	protected JMenuItem jMenuItemDetalleCerrarUpdate;
	protected JMenuItem jMenuItemDetalleMostarOcultarUpdate;
	
	protected JMenuItem jMenuItemProcesarInformacionUpdate;
	protected JMenuItem jMenuItemNuevoGuardarCambiosUpdate;
	protected JMenuItem jMenuItemMostrarOcultarUpdate;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesUpdate;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesUpdate;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesUpdate;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioUpdate;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidUpdate;
	public JLabel jLabelIdUpdate;
	public JTextFieldMe jTextFieldidUpdate;
	public JButton jButtonidUpdateBusqueda= new JButtonMe();

	public JPanel jPanelcodigoUpdate;
	public JLabel jLabelcodigoUpdate;
	public JTextField jTextFieldcodigoUpdate;
	public JButton jButtoncodigoUpdateBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_procesoUpdate;
	public JLabel jLabelcodigo_procesoUpdate;
	public JTextField jTextFieldcodigo_procesoUpdate;
	public JButton jButtoncodigo_procesoUpdateBusqueda= new JButtonMe();

	public JPanel jPanelquery_resumenUpdate;
	public JLabel jLabelquery_resumenUpdate;
	public JTextArea jTextAreaquery_resumenUpdate;
	public JScrollPane jscrollPanequery_resumenUpdate;
	public JButton jButtonquery_resumenUpdateBusqueda= new JButtonMe();

	public JPanel jPanelnumero_intentoUpdate;
	public JLabel jLabelnumero_intentoUpdate;
	public JTextField jTextFieldnumero_intentoUpdate;
	public JButton jButtonnumero_intentoUpdateBusqueda= new JButtonMe();

	public JPanel jPanelfechaUpdate;
	public JLabel jLabelfechaUpdate;
	//public JFormattedTextField jDateChooserfechaUpdate;

	public JDateChooser jDateChooserfechaUpdate;
	public JButton jButtonfechaUpdateBusqueda= new JButtonMe();

	public JPanel jPanelfecha_archivoUpdate;
	public JLabel jLabelfecha_archivoUpdate;
	//public JFormattedTextField jDateChooserfecha_archivoUpdate;

	public JDateChooser jDateChooserfecha_archivoUpdate;
	public JButton jButtonfecha_archivoUpdateBusqueda= new JButtonMe();

	public JPanel jPanelordenUpdate;
	public JLabel jLabelordenUpdate;
	public JTextField jTextFieldordenUpdate;
	public JButton jButtonordenUpdateBusqueda= new JButtonMe();

	public JPanel jPanelejecutadoUpdate;
	public JLabel jLabelejecutadoUpdate;
	public JCheckBox jCheckBoxejecutadoUpdate;
	public JButton jButtonejecutadoUpdateBusqueda= new JButtonMe();

	public JPanel jPanelesta_activoUpdate;
	public JLabel jLabelesta_activoUpdate;
	public JCheckBox jCheckBoxesta_activoUpdate;
	public JButton jButtonesta_activoUpdateBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionUpdate;
	public JLabel jLabeldescripcionUpdate;
	public JTextArea jTextAreadescripcionUpdate;
	public JScrollPane jscrollPanedescripcionUpdate;
	public JButton jButtondescripcionUpdateBusqueda= new JButtonMe();

	
	public JPanel jPanelid_anioUpdate;
	public JLabel jLabelid_anioUpdate;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioUpdate;
	public JButton jButtonid_anioUpdate= new JButtonMe();
	public JButton jButtonid_anioUpdateUpdate= new JButtonMe();
	public JButton jButtonid_anioUpdateBusqueda= new JButtonMe();

	public JPanel jPanelid_mesUpdate;
	public JLabel jLabelid_mesUpdate;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesUpdate;
	public JButton jButtonid_mesUpdate= new JButtonMe();
	public JButton jButtonid_mesUpdateUpdate= new JButtonMe();
	public JButton jButtonid_mesUpdateBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesUpdate;
	
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
	public int iHeightFormulario=572;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public UpdateDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposUpdate=new JPanel();
				this.jPanelAccionesFormularioUpdate=new JPanel();
				this.jmenuBarDetalleUpdate=new JMenuBar();
				this.jTtoolBarDetalleUpdate=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public UpdateDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Update No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public UpdateDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Update No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public UpdateDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Update No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public UpdateDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Update No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public UpdateDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Update No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarUpdate() {
		return this.jButtonActualizarToolBarUpdate;
	}
	
	public JButton getjButtonEliminarToolBarUpdate() {
		return this.jButtonEliminarToolBarUpdate;
	}
	
	public JButton getjButtonCancelarToolBarUpdate() {
		return this.jButtonCancelarToolBarUpdate;
	}		
	
	public JButton getjButtonProcesarInformacionUpdate() {
		return this.jButtonProcesarInformacionUpdate;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionUpdate)	{
		this.jButtonProcesarInformacionUpdate = jButtonProcesarInformacionUpdate;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesUpdate() {
		return this.jComboBoxTiposAccionesUpdate;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesUpdate(
			JComboBox jComboBoxTiposRelacionesUpdate) {
		this.jComboBoxTiposRelacionesUpdate = jComboBoxTiposRelacionesUpdate;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesUpdate(
			JComboBox jComboBoxTiposAccionesUpdate) {
		this.jComboBoxTiposAccionesUpdate = jComboBoxTiposAccionesUpdate;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioUpdate() {
		return this.jComboBoxTiposAccionesFormularioUpdate;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioUpdate(
			JComboBox jComboBoxTiposAccionesFormularioUpdate) {
		this.jComboBoxTiposAccionesFormularioUpdate = jComboBoxTiposAccionesFormularioUpdate;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.updateSessionBean=new UpdateSessionBean();
		
		this.updateSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.updateSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.updateSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.updatedetalleSessionBean=new UpdateDetalleSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		UpdateJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		UpdateJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		UpdateJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Update MANTENIMIENTO"));
		
		
		if(iWidth > 1450) {
			iWidth=1450;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.updateSessionBean.getEsGuardarRelacionado()) {
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
	
		UpdateJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleUpdate= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarUpdate=new JButtonMe();
				this.jButtonModificarToolBarUpdate=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarUpdate=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarUpdate,this.jTtoolBarDetalleUpdate,
							"actualizar","actualizar","Actualizar"+" "+UpdateConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarUpdate=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarUpdate,this.jTtoolBarDetalleUpdate,
							"eliminar","eliminar","Eliminar"+" "+UpdateConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarUpdate=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarUpdate,this.jTtoolBarDetalleUpdate,
							"cancelar","cancelar","Cancelar"+" "+UpdateConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarUpdate=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarUpdate,this.jTtoolBarDetalleUpdate,
							"guardarcambios","guardarcambios","Guardar"+" "+UpdateConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarUpdate,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarUpdate,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarUpdate,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleUpdate=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleUpdate=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoUpdate=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesUpdate=new JMenuMe("Acciones");
		this.jmenuDetalleDatosUpdate=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoUpdate= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoUpdate.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoUpdate,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoUpdate, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarUpdate= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarUpdate.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarUpdate,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarUpdate, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarUpdate= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarUpdate.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarUpdate,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarUpdate, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarUpdate= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarUpdate.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarUpdate,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarUpdate, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarUpdate= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarUpdate.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarUpdate,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarUpdate, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosUpdate= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosUpdate.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosUpdate,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosUpdate, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarUpdate= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarUpdate.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarUpdate,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarUpdate, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarUpdate= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarUpdate.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarUpdate,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarUpdate, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarUpdate= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarUpdate.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarUpdate,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarUpdate, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarUpdate= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarUpdate.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarUpdate,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarUpdate, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoUpdate.add(this.jMenuItemDetalleCerrarUpdate);
		
		this.jmenuDetalleAccionesUpdate.add(this.jMenuItemActualizarUpdate);
		this.jmenuDetalleAccionesUpdate.add(this.jMenuItemEliminarUpdate);
		this.jmenuDetalleAccionesUpdate.add(this.jMenuItemCancelarUpdate);		
		
		//this.jmenuDetalleDatosUpdate.add(this.jMenuItemDetalleAbrirOrderByUpdate);				
		this.jmenuDetalleDatosUpdate.add(this.jMenuItemDetalleMostarOcultarUpdate);				
				
		//this.jmenuDetalleAccionesUpdate.add(this.jMenuItemGuardarCambiosUpdate);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoUpdate, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesUpdate, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosUpdate, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleUpdate.add(this.jmenuDetalleArchivoUpdate);		
		this.jmenuBarDetalleUpdate.add(this.jmenuDetalleAccionesUpdate);		
		this.jmenuBarDetalleUpdate.add(this.jmenuDetalleDatosUpdate);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleUpdate, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleUpdate.add(this.jmenuDetalleUpdate);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleUpdate);				
	}
	
	
	public void inicializarElementosCamposUpdate() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdUpdate = new JLabelMe();
		jLabelIdUpdate.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdUpdate.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdUpdate.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdUpdate.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdUpdate,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidUpdate = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidUpdate.setToolTipText(UpdateConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutUpdate= new GridBagLayout();

		this.jPanelidUpdate.setLayout(this.gridaBagLayoutUpdate);

		jTextFieldidUpdate = new JTextFieldMe();
		jTextFieldidUpdate.setText("Id");

		jTextFieldidUpdate.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidUpdate.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidUpdate.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoUpdate = new JLabelMe();
		this.jLabelcodigoUpdate.setText(""+UpdateConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoUpdate.setToolTipText("Codigo");
		this.jLabelcodigoUpdate.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoUpdate.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoUpdate.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoUpdate,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoUpdate=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoUpdate.setToolTipText(UpdateConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutUpdate = new GridBagLayout();
		this.jPanelcodigoUpdate.setLayout(this.gridaBagLayoutUpdate);


		jTextFieldcodigoUpdate= new JTextFieldMe();

		jTextFieldcodigoUpdate.setEnabled(false);
		jTextFieldcodigoUpdate.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoUpdate.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoUpdate.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoUpdate,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoUpdateBusqueda= new JButtonMe();
		this.jButtoncodigoUpdateBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoUpdateBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoUpdateBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoUpdateBusqueda.setText("U");
		this.jButtoncodigoUpdateBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoUpdateBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoUpdateBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoUpdate.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoUpdate.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoUpdateBusqueda"));

		if(this.updateSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoUpdateBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_procesoUpdate = new JLabelMe();
		this.jLabelcodigo_procesoUpdate.setText(""+UpdateConstantesFunciones.LABEL_CODIGOPROCESO+" : *");
		this.jLabelcodigo_procesoUpdate.setToolTipText("Codigo Proceso");
		this.jLabelcodigo_procesoUpdate.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_procesoUpdate.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_procesoUpdate.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_procesoUpdate,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_procesoUpdate=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_procesoUpdate.setToolTipText(UpdateConstantesFunciones.LABEL_CODIGOPROCESO);
		this.gridaBagLayoutUpdate = new GridBagLayout();
		this.jPanelcodigo_procesoUpdate.setLayout(this.gridaBagLayoutUpdate);


		jTextFieldcodigo_procesoUpdate= new JTextFieldMe();

		jTextFieldcodigo_procesoUpdate.setEnabled(false);
		jTextFieldcodigo_procesoUpdate.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_procesoUpdate.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_procesoUpdate.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_procesoUpdate,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_procesoUpdateBusqueda= new JButtonMe();
		this.jButtoncodigo_procesoUpdateBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_procesoUpdateBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_procesoUpdateBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_procesoUpdateBusqueda.setText("U");
		this.jButtoncodigo_procesoUpdateBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_procesoUpdateBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_procesoUpdateBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_procesoUpdate.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_procesoUpdate.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_procesoUpdateBusqueda"));

		if(this.updateSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_procesoUpdateBusqueda.setVisible(false);		}


					
		this.jLabelquery_resumenUpdate = new JLabelMe();
		this.jLabelquery_resumenUpdate.setText(""+UpdateConstantesFunciones.LABEL_QUERYRESUMEN+" : *");
		this.jLabelquery_resumenUpdate.setToolTipText("Query Resumen");
		this.jLabelquery_resumenUpdate.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelquery_resumenUpdate.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelquery_resumenUpdate.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelquery_resumenUpdate,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelquery_resumenUpdate=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelquery_resumenUpdate.setToolTipText(UpdateConstantesFunciones.LABEL_QUERYRESUMEN);
		this.gridaBagLayoutUpdate = new GridBagLayout();
		this.jPanelquery_resumenUpdate.setLayout(this.gridaBagLayoutUpdate);


		jTextAreaquery_resumenUpdate= new JTextAreaMe();
		jTextAreaquery_resumenUpdate.setEnabled(false);
		jTextAreaquery_resumenUpdate.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaquery_resumenUpdate.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaquery_resumenUpdate.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaquery_resumenUpdate.setLineWrap(true);
		jTextAreaquery_resumenUpdate.setWrapStyleWord(true);
		jTextAreaquery_resumenUpdate.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaquery_resumenUpdate.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreaquery_resumenUpdate,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanequery_resumenUpdate = new JScrollPane(jTextAreaquery_resumenUpdate);
		jscrollPanequery_resumenUpdate.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanequery_resumenUpdate.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanequery_resumenUpdate.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonquery_resumenUpdateBusqueda= new JButtonMe();
		this.jButtonquery_resumenUpdateBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonquery_resumenUpdateBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonquery_resumenUpdateBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonquery_resumenUpdateBusqueda.setText("U");
		this.jButtonquery_resumenUpdateBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonquery_resumenUpdateBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonquery_resumenUpdateBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaquery_resumenUpdate.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaquery_resumenUpdate.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"query_resumenUpdateBusqueda"));

		if(this.updateSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonquery_resumenUpdateBusqueda.setVisible(false);		}


					
		this.jLabelnumero_intentoUpdate = new JLabelMe();
		this.jLabelnumero_intentoUpdate.setText(""+UpdateConstantesFunciones.LABEL_NUMEROINTENTO+" : *");
		this.jLabelnumero_intentoUpdate.setToolTipText("Numero Intento");
		this.jLabelnumero_intentoUpdate.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_intentoUpdate.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_intentoUpdate.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_intentoUpdate,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_intentoUpdate=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_intentoUpdate.setToolTipText(UpdateConstantesFunciones.LABEL_NUMEROINTENTO);
		this.gridaBagLayoutUpdate = new GridBagLayout();
		this.jPanelnumero_intentoUpdate.setLayout(this.gridaBagLayoutUpdate);


		jTextFieldnumero_intentoUpdate= new JTextFieldMe();
		jTextFieldnumero_intentoUpdate.setEnabled(false);
		jTextFieldnumero_intentoUpdate.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_intentoUpdate.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_intentoUpdate.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_intentoUpdate,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_intentoUpdate.setText("0");

		this.jButtonnumero_intentoUpdateBusqueda= new JButtonMe();
		this.jButtonnumero_intentoUpdateBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_intentoUpdateBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_intentoUpdateBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_intentoUpdateBusqueda.setText("U");
		this.jButtonnumero_intentoUpdateBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_intentoUpdateBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_intentoUpdateBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_intentoUpdate.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_intentoUpdate.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_intentoUpdateBusqueda"));

		if(this.updateSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_intentoUpdateBusqueda.setVisible(false);		}


					
		this.jLabelfechaUpdate = new JLabelMe();
		this.jLabelfechaUpdate.setText(""+UpdateConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaUpdate.setToolTipText("Fecha");
		this.jLabelfechaUpdate.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaUpdate.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaUpdate.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaUpdate,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaUpdate=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaUpdate.setToolTipText(UpdateConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutUpdate = new GridBagLayout();
		this.jPanelfechaUpdate.setLayout(this.gridaBagLayoutUpdate);


		//jFormattedTextFieldfechaUpdate= new JFormattedTextFieldMe();

		jDateChooserfechaUpdate= new JDateChooser();
		jDateChooserfechaUpdate.setEnabled(false);
		jDateChooserfechaUpdate.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaUpdate.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaUpdate.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaUpdate,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaUpdate.setDate(new Date());
		jDateChooserfechaUpdate.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaUpdate.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaUpdateBusqueda= new JButtonMe();
		this.jButtonfechaUpdateBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaUpdateBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaUpdateBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaUpdateBusqueda.setText("U");
		this.jButtonfechaUpdateBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaUpdateBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaUpdateBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaUpdate.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaUpdate.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaUpdateBusqueda"));

		if(this.updateSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaUpdateBusqueda.setVisible(false);		}


					
		this.jLabelfecha_archivoUpdate = new JLabelMe();
		this.jLabelfecha_archivoUpdate.setText(""+UpdateConstantesFunciones.LABEL_FECHAARCHIVO+" : *");
		this.jLabelfecha_archivoUpdate.setToolTipText("Fecha Archivo");
		this.jLabelfecha_archivoUpdate.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_archivoUpdate.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_archivoUpdate.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_archivoUpdate,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_archivoUpdate=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_archivoUpdate.setToolTipText(UpdateConstantesFunciones.LABEL_FECHAARCHIVO);
		this.gridaBagLayoutUpdate = new GridBagLayout();
		this.jPanelfecha_archivoUpdate.setLayout(this.gridaBagLayoutUpdate);


		//jFormattedTextFieldfecha_archivoUpdate= new JFormattedTextFieldMe();

		jDateChooserfecha_archivoUpdate= new JDateChooser();
		jDateChooserfecha_archivoUpdate.setEnabled(false);
		jDateChooserfecha_archivoUpdate.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_archivoUpdate.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_archivoUpdate.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_archivoUpdate,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_archivoUpdate.setDate(new Date());
		jDateChooserfecha_archivoUpdate.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_archivoUpdate.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_archivoUpdateBusqueda= new JButtonMe();
		this.jButtonfecha_archivoUpdateBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_archivoUpdateBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_archivoUpdateBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_archivoUpdateBusqueda.setText("U");
		this.jButtonfecha_archivoUpdateBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_archivoUpdateBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_archivoUpdateBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_archivoUpdate.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_archivoUpdate.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_archivoUpdateBusqueda"));

		if(this.updateSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_archivoUpdateBusqueda.setVisible(false);		}


					
		this.jLabelordenUpdate = new JLabelMe();
		this.jLabelordenUpdate.setText(""+UpdateConstantesFunciones.LABEL_ORDEN+" : *");
		this.jLabelordenUpdate.setToolTipText("Orden");
		this.jLabelordenUpdate.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelordenUpdate.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelordenUpdate.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelordenUpdate,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelordenUpdate=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelordenUpdate.setToolTipText(UpdateConstantesFunciones.LABEL_ORDEN);
		this.gridaBagLayoutUpdate = new GridBagLayout();
		this.jPanelordenUpdate.setLayout(this.gridaBagLayoutUpdate);


		jTextFieldordenUpdate= new JTextFieldMe();
		jTextFieldordenUpdate.setEnabled(false);
		jTextFieldordenUpdate.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldordenUpdate.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldordenUpdate.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldordenUpdate,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldordenUpdate.setText("0");

		this.jButtonordenUpdateBusqueda= new JButtonMe();
		this.jButtonordenUpdateBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonordenUpdateBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonordenUpdateBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonordenUpdateBusqueda.setText("U");
		this.jButtonordenUpdateBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonordenUpdateBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonordenUpdateBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldordenUpdate.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldordenUpdate.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ordenUpdateBusqueda"));

		if(this.updateSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonordenUpdateBusqueda.setVisible(false);		}


					
		this.jLabelejecutadoUpdate = new JLabelMe();
		this.jLabelejecutadoUpdate.setText(""+UpdateConstantesFunciones.LABEL_EJECUTADO+" : *");
		this.jLabelejecutadoUpdate.setToolTipText("Ejecutado");
		this.jLabelejecutadoUpdate.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelejecutadoUpdate.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelejecutadoUpdate.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelejecutadoUpdate,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelejecutadoUpdate=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelejecutadoUpdate.setToolTipText(UpdateConstantesFunciones.LABEL_EJECUTADO);
		this.gridaBagLayoutUpdate = new GridBagLayout();
		this.jPanelejecutadoUpdate.setLayout(this.gridaBagLayoutUpdate);


		jCheckBoxejecutadoUpdate= new JCheckBoxMe();
		jCheckBoxejecutadoUpdate.setEnabled(false);

		jCheckBoxejecutadoUpdate.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxejecutadoUpdate.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxejecutadoUpdate.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxejecutadoUpdate,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonejecutadoUpdateBusqueda= new JButtonMe();
		this.jButtonejecutadoUpdateBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonejecutadoUpdateBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonejecutadoUpdateBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonejecutadoUpdateBusqueda.setText("U");
		this.jButtonejecutadoUpdateBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonejecutadoUpdateBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonejecutadoUpdateBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxejecutadoUpdate.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxejecutadoUpdate.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ejecutadoUpdateBusqueda"));

		if(this.updateSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonejecutadoUpdateBusqueda.setVisible(false);		}


					
		this.jLabelesta_activoUpdate = new JLabelMe();
		this.jLabelesta_activoUpdate.setText(""+UpdateConstantesFunciones.LABEL_ESTAACTIVO+" : *");
		this.jLabelesta_activoUpdate.setToolTipText("Esta Activo");
		this.jLabelesta_activoUpdate.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesta_activoUpdate.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesta_activoUpdate.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelesta_activoUpdate,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelesta_activoUpdate=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelesta_activoUpdate.setToolTipText(UpdateConstantesFunciones.LABEL_ESTAACTIVO);
		this.gridaBagLayoutUpdate = new GridBagLayout();
		this.jPanelesta_activoUpdate.setLayout(this.gridaBagLayoutUpdate);


		jCheckBoxesta_activoUpdate= new JCheckBoxMe();
		jCheckBoxesta_activoUpdate.setEnabled(false);

		jCheckBoxesta_activoUpdate.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_activoUpdate.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_activoUpdate.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxesta_activoUpdate,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonesta_activoUpdateBusqueda= new JButtonMe();
		this.jButtonesta_activoUpdateBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_activoUpdateBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_activoUpdateBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonesta_activoUpdateBusqueda.setText("U");
		this.jButtonesta_activoUpdateBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonesta_activoUpdateBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonesta_activoUpdateBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxesta_activoUpdate.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxesta_activoUpdate.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"esta_activoUpdateBusqueda"));

		if(this.updateSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonesta_activoUpdateBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionUpdate = new JLabelMe();
		this.jLabeldescripcionUpdate.setText(""+UpdateConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionUpdate.setToolTipText("Descripcion");
		this.jLabeldescripcionUpdate.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionUpdate.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionUpdate.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionUpdate,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionUpdate=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionUpdate.setToolTipText(UpdateConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutUpdate = new GridBagLayout();
		this.jPaneldescripcionUpdate.setLayout(this.gridaBagLayoutUpdate);


		jTextAreadescripcionUpdate= new JTextAreaMe();
		jTextAreadescripcionUpdate.setEnabled(false);
		jTextAreadescripcionUpdate.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionUpdate.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionUpdate.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionUpdate.setLineWrap(true);
		jTextAreadescripcionUpdate.setWrapStyleWord(true);
		jTextAreadescripcionUpdate.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionUpdate.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionUpdate,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionUpdate = new JScrollPane(jTextAreadescripcionUpdate);
		jscrollPanedescripcionUpdate.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionUpdate.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionUpdate.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondescripcionUpdateBusqueda= new JButtonMe();
		this.jButtondescripcionUpdateBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionUpdateBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionUpdateBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionUpdateBusqueda.setText("U");
		this.jButtondescripcionUpdateBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionUpdateBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionUpdateBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionUpdate.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionUpdate.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionUpdateBusqueda"));

		if(this.updateSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionUpdateBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysUpdate() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_anioUpdate = new JLabelMe();
		this.jLabelid_anioUpdate.setText(""+UpdateConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioUpdate.setToolTipText("Anio");
		this.jLabelid_anioUpdate.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioUpdate.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioUpdate.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioUpdate,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioUpdate=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioUpdate.setToolTipText(UpdateConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutUpdate = new GridBagLayout();
		this.jPanelid_anioUpdate.setLayout(this.gridaBagLayoutUpdate);


		jComboBoxid_anioUpdate= new JComboBoxMe();
		jComboBoxid_anioUpdate.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioUpdate.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioUpdate.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioUpdate,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_anioUpdate= new JButtonMe();
		this.jButtonid_anioUpdate.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioUpdate.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioUpdate.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioUpdate.setText("Buscar");
		this.jButtonid_anioUpdate.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioUpdate,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioUpdate.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioUpdate.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioUpdate"));

		this.jButtonid_anioUpdateBusqueda= new JButtonMe();
		this.jButtonid_anioUpdateBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioUpdateBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioUpdateBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioUpdateBusqueda.setText("U");
		this.jButtonid_anioUpdateBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioUpdateBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioUpdateBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioUpdate.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioUpdate.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioUpdateBusqueda"));

		if(this.updateSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioUpdateBusqueda.setVisible(false);		}

		this.jButtonid_anioUpdateUpdate= new JButtonMe();
		this.jButtonid_anioUpdateUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioUpdateUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioUpdateUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioUpdateUpdate.setText("U");
		this.jButtonid_anioUpdateUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioUpdateUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioUpdateUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioUpdate.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioUpdate.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioUpdateUpdate"));



					
		this.jLabelid_mesUpdate = new JLabelMe();
		this.jLabelid_mesUpdate.setText(""+UpdateConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesUpdate.setToolTipText("Mes");
		this.jLabelid_mesUpdate.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesUpdate.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesUpdate.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesUpdate,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesUpdate=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesUpdate.setToolTipText(UpdateConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutUpdate = new GridBagLayout();
		this.jPanelid_mesUpdate.setLayout(this.gridaBagLayoutUpdate);


		jComboBoxid_mesUpdate= new JComboBoxMe();
		jComboBoxid_mesUpdate.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesUpdate.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesUpdate.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesUpdate,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_mesUpdate= new JButtonMe();
		this.jButtonid_mesUpdate.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesUpdate.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesUpdate.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesUpdate.setText("Buscar");
		this.jButtonid_mesUpdate.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesUpdate,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesUpdate.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesUpdate.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesUpdate"));

		this.jButtonid_mesUpdateBusqueda= new JButtonMe();
		this.jButtonid_mesUpdateBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesUpdateBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesUpdateBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesUpdateBusqueda.setText("U");
		this.jButtonid_mesUpdateBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesUpdateBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesUpdateBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesUpdate.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesUpdate.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesUpdateBusqueda"));

		if(this.updateSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesUpdateBusqueda.setVisible(false);		}

		this.jButtonid_mesUpdateUpdate= new JButtonMe();
		this.jButtonid_mesUpdateUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesUpdateUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesUpdateUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesUpdateUpdate.setText("U");
		this.jButtonid_mesUpdateUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesUpdateUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesUpdateUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesUpdate.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesUpdate.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesUpdateUpdate"));



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
		//this.jInternalFrameDetalleUpdate = new UpdateBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Update DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutUpdate= new GridBagLayout();
		

		
		String sToolTipUpdate="";
		sToolTipUpdate=UpdateConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipUpdate+="(Seguridad.Update)";
		}
		
		if(!this.updateSessionBean.getEsGuardarRelacionado()) {
			sToolTipUpdate+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoUpdate = new JButtonMe();
		this.jButtonModificarUpdate = new JButtonMe();
        this.jButtonActualizarUpdate = new JButtonMe();
        this.jButtonEliminarUpdate = new JButtonMe();
        this.jButtonCancelarUpdate = new JButtonMe();
        this.jButtonGuardarCambiosUpdate = new JButtonMe();
		this.jButtonGuardarCambiosTablaUpdate = new JButtonMe();
		this.jButtonCerrarUpdate = new JButtonMe();
		
		this.jScrollPanelDatosUpdate = new JScrollPane();   
        this.jScrollPanelDatosEdicionUpdate = new JScrollPane();
		this.jScrollPanelDatosGeneralUpdate = new JScrollPane();
				
		
		
		this.jPanelCamposUpdate = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosUpdate = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesUpdate = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioUpdate = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Update";
		
		if(!this.updateSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosUpdate.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Updates" + this.sPath));
		} else {
			this.jScrollPanelDatosUpdate.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionUpdate.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralUpdate.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposUpdate.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposUpdate.setName("jPanelCamposUpdate"); 

		this.jPanelCamposOcultosUpdate.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosUpdate.setName("jPanelCamposOcultosUpdate"); 

        this.jPanelAccionesUpdate.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesUpdate.setToolTipText("Acciones");
        this.jPanelAccionesUpdate.setName("Acciones"); 

		this.jPanelAccionesFormularioUpdate.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioUpdate.setToolTipText("Acciones");
        this.jPanelAccionesFormularioUpdate.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionUpdate, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralUpdate, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosUpdate, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposUpdate, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosUpdate, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioUpdate, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoUpdate.setText("Nuevo");
		this.jButtonModificarUpdate.setText("Editar");
        this.jButtonActualizarUpdate.setText("Actualizar");
        this.jButtonEliminarUpdate.setText("Eliminar");
        this.jButtonCancelarUpdate.setText("Cancelar");
        this.jButtonGuardarCambiosUpdate.setText("Guardar");
		this.jButtonGuardarCambiosTablaUpdate.setText("Guardar");
		this.jButtonCerrarUpdate.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoUpdate,"nuevo_button","Nuevo",this.updateSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarUpdate,"modificar_button","Editar",this.updateSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarUpdate,"actualizar_button","Actualizar",this.updateSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarUpdate,"eliminar_button","Eliminar",this.updateSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarUpdate,"cancelar_button","Cancelar",this.updateSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosUpdate,"guardarcambios_button","Guardar",this.updateSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaUpdate,"guardarcambiostabla_button","Guardar",this.updateSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarUpdate,"cerrar_button","Salir",this.updateSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoUpdate, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarUpdate, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosUpdate, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaUpdate, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarUpdate, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarUpdate, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarUpdate, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarUpdate, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoUpdate.setToolTipText("Nuevo"+" "+UpdateConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarUpdate.setToolTipText("Editar"+" "+UpdateConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarUpdate.setToolTipText("Actualizar"+" "+UpdateConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarUpdate.setToolTipText("Eliminar)"+" "+UpdateConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarUpdate.setToolTipText("Cancelar"+" "+UpdateConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosUpdate.setToolTipText("Guardar"+" "+UpdateConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaUpdate.setToolTipText("Guardar"+" "+UpdateConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarUpdate.setToolTipText("Salir"+" "+UpdateConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoUpdate";
		inputMap = this.jButtonNuevoUpdate.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoUpdate.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoUpdate"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarUpdate";
		inputMap = this.jButtonActualizarUpdate.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarUpdate.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarUpdate"));
		
		//ELIMINAR
		sMapKey = "EliminarUpdate";
		inputMap = this.jButtonEliminarUpdate.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarUpdate.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarUpdate"));
		
		//CANCELAR	
		sMapKey = "CancelarUpdate";
		inputMap = this.jButtonCancelarUpdate.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarUpdate.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarUpdate"));
		
		//CERRAR		
		sMapKey = "CerrarUpdate";
		inputMap = this.jButtonCerrarUpdate.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarUpdate.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarUpdate"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaUpdate";
		inputMap = this.jButtonGuardarCambiosTablaUpdate.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaUpdate.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaUpdate"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoUpdate = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoUpdate.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoUpdate.setToolTipText("Nuevo Update");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoUpdate, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarUpdate = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarUpdate.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarUpdate.setToolTipText("Sin Cerrar Ventana Update");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarUpdate, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeUpdate = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeUpdate.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeUpdate.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeUpdate, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesUpdate = new JComboBoxMe();
		//this.jComboBoxTiposAccionesUpdate.setText("Accion");
		this.jComboBoxTiposAccionesUpdate.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioUpdate = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioUpdate.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioUpdate.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesUpdate = new JLabelMe();
		
		this.jLabelAccionesUpdate.setText("Acciones");		
		this.jLabelAccionesUpdate.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesUpdate.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesUpdate.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposUpdate();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysUpdate();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesUpdate=new JTabbedPane();
		this.jTabbedPaneRelacionesUpdate.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesUpdate,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesUpdate.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesUpdate.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesUpdate.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesUpdate, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioUpdate.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioUpdate.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioUpdate.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioUpdate, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposUpdate = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosUpdate = new GridBagLayout();
		
		this.jPanelCamposUpdate.setLayout(gridaBagLayoutCamposUpdate);
		this.jPanelCamposOcultosUpdate.setLayout(gridaBagLayoutCamposOcultosUpdate);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsUpdate = new GridBagConstraints();
	this.gridBagConstraintsUpdate.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUpdate.gridy = 0;
	this.gridBagConstraintsUpdate.gridx = 0;
	this.gridBagConstraintsUpdate.ipadx = 0;
	this.gridBagConstraintsUpdate.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidUpdate.add(jLabelIdUpdate, this.gridBagConstraintsUpdate);



	this.gridBagConstraintsUpdate = new GridBagConstraints();
	this.gridBagConstraintsUpdate.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUpdate.gridy = 0;
	this.gridBagConstraintsUpdate.gridx = 1;
	this.gridBagConstraintsUpdate.ipadx = 0;
	this.gridBagConstraintsUpdate.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidUpdate.add(jTextFieldidUpdate, this.gridBagConstraintsUpdate);


	this.gridBagConstraintsUpdate = new GridBagConstraints();
	this.gridBagConstraintsUpdate.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUpdate.gridy = 0;
	this.gridBagConstraintsUpdate.gridx = 0;
	this.gridBagConstraintsUpdate.ipadx = 0;
	this.gridBagConstraintsUpdate.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_anioUpdate.add(jLabelid_anioUpdate, this.gridBagConstraintsUpdate);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUpdate = new GridBagConstraints();
		//this.gridBagConstraintsUpdate.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUpdate.gridy = 0;
		this.gridBagConstraintsUpdate.gridx = 2;
		this.gridBagConstraintsUpdate.ipadx = 0;
		this.gridBagConstraintsUpdate.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioUpdate.add(jButtonid_anioUpdateBusqueda, this.gridBagConstraintsUpdate);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUpdate = new GridBagConstraints();
		//this.gridBagConstraintsUpdate.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUpdate.gridy = 0;
		this.gridBagConstraintsUpdate.gridx = 3;
		this.gridBagConstraintsUpdate.ipadx = 0;
		this.gridBagConstraintsUpdate.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioUpdate.add(jButtonid_anioUpdateUpdate, this.gridBagConstraintsUpdate);
	}

	this.gridBagConstraintsUpdate = new GridBagConstraints();
	this.gridBagConstraintsUpdate.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUpdate.gridy = 0;
	this.gridBagConstraintsUpdate.gridx = 1;
	this.gridBagConstraintsUpdate.ipadx = 0;
	this.gridBagConstraintsUpdate.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_anioUpdate.add(jComboBoxid_anioUpdate, this.gridBagConstraintsUpdate);


	this.gridBagConstraintsUpdate = new GridBagConstraints();
	this.gridBagConstraintsUpdate.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUpdate.gridy = 0;
	this.gridBagConstraintsUpdate.gridx = 0;
	this.gridBagConstraintsUpdate.ipadx = 0;
	this.gridBagConstraintsUpdate.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mesUpdate.add(jLabelid_mesUpdate, this.gridBagConstraintsUpdate);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUpdate = new GridBagConstraints();
		//this.gridBagConstraintsUpdate.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUpdate.gridy = 0;
		this.gridBagConstraintsUpdate.gridx = 2;
		this.gridBagConstraintsUpdate.ipadx = 0;
		this.gridBagConstraintsUpdate.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesUpdate.add(jButtonid_mesUpdateBusqueda, this.gridBagConstraintsUpdate);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUpdate = new GridBagConstraints();
		//this.gridBagConstraintsUpdate.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUpdate.gridy = 0;
		this.gridBagConstraintsUpdate.gridx = 3;
		this.gridBagConstraintsUpdate.ipadx = 0;
		this.gridBagConstraintsUpdate.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesUpdate.add(jButtonid_mesUpdateUpdate, this.gridBagConstraintsUpdate);
	}

	this.gridBagConstraintsUpdate = new GridBagConstraints();
	this.gridBagConstraintsUpdate.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUpdate.gridy = 0;
	this.gridBagConstraintsUpdate.gridx = 1;
	this.gridBagConstraintsUpdate.ipadx = 0;
	this.gridBagConstraintsUpdate.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mesUpdate.add(jComboBoxid_mesUpdate, this.gridBagConstraintsUpdate);


	this.gridBagConstraintsUpdate = new GridBagConstraints();
	this.gridBagConstraintsUpdate.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUpdate.gridy = 0;
	this.gridBagConstraintsUpdate.gridx = 0;
	this.gridBagConstraintsUpdate.ipadx = 0;
	this.gridBagConstraintsUpdate.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoUpdate.add(jLabelcodigoUpdate, this.gridBagConstraintsUpdate);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUpdate = new GridBagConstraints();
		//this.gridBagConstraintsUpdate.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUpdate.gridy = 0;
		this.gridBagConstraintsUpdate.gridx = 2;
		this.gridBagConstraintsUpdate.ipadx = 0;
		this.gridBagConstraintsUpdate.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoUpdate.add(jButtoncodigoUpdateBusqueda, this.gridBagConstraintsUpdate);
	}

	this.gridBagConstraintsUpdate = new GridBagConstraints();
	this.gridBagConstraintsUpdate.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUpdate.gridy = 0;
	this.gridBagConstraintsUpdate.gridx = 1;
	this.gridBagConstraintsUpdate.ipadx = 0;
	this.gridBagConstraintsUpdate.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoUpdate.add(jTextFieldcodigoUpdate, this.gridBagConstraintsUpdate);


	this.gridBagConstraintsUpdate = new GridBagConstraints();
	this.gridBagConstraintsUpdate.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUpdate.gridy = 0;
	this.gridBagConstraintsUpdate.gridx = 0;
	this.gridBagConstraintsUpdate.ipadx = 0;
	this.gridBagConstraintsUpdate.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_procesoUpdate.add(jLabelcodigo_procesoUpdate, this.gridBagConstraintsUpdate);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUpdate = new GridBagConstraints();
		//this.gridBagConstraintsUpdate.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUpdate.gridy = 0;
		this.gridBagConstraintsUpdate.gridx = 2;
		this.gridBagConstraintsUpdate.ipadx = 0;
		this.gridBagConstraintsUpdate.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_procesoUpdate.add(jButtoncodigo_procesoUpdateBusqueda, this.gridBagConstraintsUpdate);
	}

	this.gridBagConstraintsUpdate = new GridBagConstraints();
	this.gridBagConstraintsUpdate.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUpdate.gridy = 0;
	this.gridBagConstraintsUpdate.gridx = 1;
	this.gridBagConstraintsUpdate.ipadx = 0;
	this.gridBagConstraintsUpdate.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_procesoUpdate.add(jTextFieldcodigo_procesoUpdate, this.gridBagConstraintsUpdate);


	this.gridBagConstraintsUpdate = new GridBagConstraints();
	this.gridBagConstraintsUpdate.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUpdate.gridy = 0;
	this.gridBagConstraintsUpdate.gridx = 0;
	this.gridBagConstraintsUpdate.ipadx = 0;
	this.gridBagConstraintsUpdate.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelquery_resumenUpdate.add(jLabelquery_resumenUpdate, this.gridBagConstraintsUpdate);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUpdate = new GridBagConstraints();
		//this.gridBagConstraintsUpdate.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUpdate.gridy = 0;
		this.gridBagConstraintsUpdate.gridx = 2;
		this.gridBagConstraintsUpdate.ipadx = 0;
		this.gridBagConstraintsUpdate.insets = new Insets(0, 0, 0, 0);
		this.jPanelquery_resumenUpdate.add(jButtonquery_resumenUpdateBusqueda, this.gridBagConstraintsUpdate);
	}

	this.gridBagConstraintsUpdate = new GridBagConstraints();
	this.gridBagConstraintsUpdate.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUpdate.gridy = 0;
	this.gridBagConstraintsUpdate.gridx = 1;
	this.gridBagConstraintsUpdate.ipadx = 0;
	this.gridBagConstraintsUpdate.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelquery_resumenUpdate.add(jscrollPanequery_resumenUpdate, this.gridBagConstraintsUpdate);


	this.gridBagConstraintsUpdate = new GridBagConstraints();
	this.gridBagConstraintsUpdate.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUpdate.gridy = 0;
	this.gridBagConstraintsUpdate.gridx = 0;
	this.gridBagConstraintsUpdate.ipadx = 0;
	this.gridBagConstraintsUpdate.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_intentoUpdate.add(jLabelnumero_intentoUpdate, this.gridBagConstraintsUpdate);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUpdate = new GridBagConstraints();
		//this.gridBagConstraintsUpdate.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUpdate.gridy = 0;
		this.gridBagConstraintsUpdate.gridx = 2;
		this.gridBagConstraintsUpdate.ipadx = 0;
		this.gridBagConstraintsUpdate.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_intentoUpdate.add(jButtonnumero_intentoUpdateBusqueda, this.gridBagConstraintsUpdate);
	}

	this.gridBagConstraintsUpdate = new GridBagConstraints();
	this.gridBagConstraintsUpdate.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUpdate.gridy = 0;
	this.gridBagConstraintsUpdate.gridx = 1;
	this.gridBagConstraintsUpdate.ipadx = 0;
	this.gridBagConstraintsUpdate.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_intentoUpdate.add(jTextFieldnumero_intentoUpdate, this.gridBagConstraintsUpdate);


	this.gridBagConstraintsUpdate = new GridBagConstraints();
	this.gridBagConstraintsUpdate.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUpdate.gridy = 0;
	this.gridBagConstraintsUpdate.gridx = 0;
	this.gridBagConstraintsUpdate.ipadx = 0;
	this.gridBagConstraintsUpdate.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaUpdate.add(jLabelfechaUpdate, this.gridBagConstraintsUpdate);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUpdate = new GridBagConstraints();
		//this.gridBagConstraintsUpdate.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUpdate.gridy = 0;
		this.gridBagConstraintsUpdate.gridx = 2;
		this.gridBagConstraintsUpdate.ipadx = 0;
		this.gridBagConstraintsUpdate.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaUpdate.add(jButtonfechaUpdateBusqueda, this.gridBagConstraintsUpdate);
	}

	this.gridBagConstraintsUpdate = new GridBagConstraints();
	this.gridBagConstraintsUpdate.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUpdate.gridy = 0;
	this.gridBagConstraintsUpdate.gridx = 1;
	this.gridBagConstraintsUpdate.ipadx = 0;
	this.gridBagConstraintsUpdate.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaUpdate.add(jDateChooserfechaUpdate, this.gridBagConstraintsUpdate);


	this.gridBagConstraintsUpdate = new GridBagConstraints();
	this.gridBagConstraintsUpdate.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUpdate.gridy = 0;
	this.gridBagConstraintsUpdate.gridx = 0;
	this.gridBagConstraintsUpdate.ipadx = 0;
	this.gridBagConstraintsUpdate.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_archivoUpdate.add(jLabelfecha_archivoUpdate, this.gridBagConstraintsUpdate);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUpdate = new GridBagConstraints();
		//this.gridBagConstraintsUpdate.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUpdate.gridy = 0;
		this.gridBagConstraintsUpdate.gridx = 2;
		this.gridBagConstraintsUpdate.ipadx = 0;
		this.gridBagConstraintsUpdate.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_archivoUpdate.add(jButtonfecha_archivoUpdateBusqueda, this.gridBagConstraintsUpdate);
	}

	this.gridBagConstraintsUpdate = new GridBagConstraints();
	this.gridBagConstraintsUpdate.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUpdate.gridy = 0;
	this.gridBagConstraintsUpdate.gridx = 1;
	this.gridBagConstraintsUpdate.ipadx = 0;
	this.gridBagConstraintsUpdate.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_archivoUpdate.add(jDateChooserfecha_archivoUpdate, this.gridBagConstraintsUpdate);


	this.gridBagConstraintsUpdate = new GridBagConstraints();
	this.gridBagConstraintsUpdate.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUpdate.gridy = 0;
	this.gridBagConstraintsUpdate.gridx = 0;
	this.gridBagConstraintsUpdate.ipadx = 0;
	this.gridBagConstraintsUpdate.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelordenUpdate.add(jLabelordenUpdate, this.gridBagConstraintsUpdate);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUpdate = new GridBagConstraints();
		//this.gridBagConstraintsUpdate.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUpdate.gridy = 0;
		this.gridBagConstraintsUpdate.gridx = 2;
		this.gridBagConstraintsUpdate.ipadx = 0;
		this.gridBagConstraintsUpdate.insets = new Insets(0, 0, 0, 0);
		this.jPanelordenUpdate.add(jButtonordenUpdateBusqueda, this.gridBagConstraintsUpdate);
	}

	this.gridBagConstraintsUpdate = new GridBagConstraints();
	this.gridBagConstraintsUpdate.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUpdate.gridy = 0;
	this.gridBagConstraintsUpdate.gridx = 1;
	this.gridBagConstraintsUpdate.ipadx = 0;
	this.gridBagConstraintsUpdate.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelordenUpdate.add(jTextFieldordenUpdate, this.gridBagConstraintsUpdate);


	this.gridBagConstraintsUpdate = new GridBagConstraints();
	this.gridBagConstraintsUpdate.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUpdate.gridy = 0;
	this.gridBagConstraintsUpdate.gridx = 0;
	this.gridBagConstraintsUpdate.ipadx = 0;
	this.gridBagConstraintsUpdate.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelejecutadoUpdate.add(jLabelejecutadoUpdate, this.gridBagConstraintsUpdate);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUpdate = new GridBagConstraints();
		//this.gridBagConstraintsUpdate.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUpdate.gridy = 0;
		this.gridBagConstraintsUpdate.gridx = 2;
		this.gridBagConstraintsUpdate.ipadx = 0;
		this.gridBagConstraintsUpdate.insets = new Insets(0, 0, 0, 0);
		this.jPanelejecutadoUpdate.add(jButtonejecutadoUpdateBusqueda, this.gridBagConstraintsUpdate);
	}

	this.gridBagConstraintsUpdate = new GridBagConstraints();
	this.gridBagConstraintsUpdate.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUpdate.gridy = 0;
	this.gridBagConstraintsUpdate.gridx = 1;
	this.gridBagConstraintsUpdate.ipadx = 0;
	this.gridBagConstraintsUpdate.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelejecutadoUpdate.add(jCheckBoxejecutadoUpdate, this.gridBagConstraintsUpdate);


	this.gridBagConstraintsUpdate = new GridBagConstraints();
	this.gridBagConstraintsUpdate.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUpdate.gridy = 0;
	this.gridBagConstraintsUpdate.gridx = 0;
	this.gridBagConstraintsUpdate.ipadx = 0;
	this.gridBagConstraintsUpdate.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelesta_activoUpdate.add(jLabelesta_activoUpdate, this.gridBagConstraintsUpdate);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUpdate = new GridBagConstraints();
		//this.gridBagConstraintsUpdate.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUpdate.gridy = 0;
		this.gridBagConstraintsUpdate.gridx = 2;
		this.gridBagConstraintsUpdate.ipadx = 0;
		this.gridBagConstraintsUpdate.insets = new Insets(0, 0, 0, 0);
		this.jPanelesta_activoUpdate.add(jButtonesta_activoUpdateBusqueda, this.gridBagConstraintsUpdate);
	}

	this.gridBagConstraintsUpdate = new GridBagConstraints();
	this.gridBagConstraintsUpdate.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUpdate.gridy = 0;
	this.gridBagConstraintsUpdate.gridx = 1;
	this.gridBagConstraintsUpdate.ipadx = 0;
	this.gridBagConstraintsUpdate.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelesta_activoUpdate.add(jCheckBoxesta_activoUpdate, this.gridBagConstraintsUpdate);


	this.gridBagConstraintsUpdate = new GridBagConstraints();
	this.gridBagConstraintsUpdate.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUpdate.gridy = 0;
	this.gridBagConstraintsUpdate.gridx = 0;
	this.gridBagConstraintsUpdate.ipadx = 0;
	this.gridBagConstraintsUpdate.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionUpdate.add(jLabeldescripcionUpdate, this.gridBagConstraintsUpdate);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUpdate = new GridBagConstraints();
		//this.gridBagConstraintsUpdate.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUpdate.gridy = 0;
		this.gridBagConstraintsUpdate.gridx = 2;
		this.gridBagConstraintsUpdate.ipadx = 0;
		this.gridBagConstraintsUpdate.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionUpdate.add(jButtondescripcionUpdateBusqueda, this.gridBagConstraintsUpdate);
	}

	this.gridBagConstraintsUpdate = new GridBagConstraints();
	this.gridBagConstraintsUpdate.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUpdate.gridy = 0;
	this.gridBagConstraintsUpdate.gridx = 1;
	this.gridBagConstraintsUpdate.ipadx = 0;
	this.gridBagConstraintsUpdate.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionUpdate.add(jscrollPanedescripcionUpdate, this.gridBagConstraintsUpdate);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsUpdate = new GridBagConstraints();
	this.gridBagConstraintsUpdate.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUpdate.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUpdate.gridy = iYPanelCamposUpdate;
	this.gridBagConstraintsUpdate.gridx = iXPanelCamposUpdate++;
	this.gridBagConstraintsUpdate.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUpdate.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUpdate.add(this.jPanelidUpdate, this.gridBagConstraintsUpdate);



	if(iXPanelCamposUpdate % 2==0) {
		iXPanelCamposUpdate=0;
		iYPanelCamposUpdate++;
	}
	this.gridBagConstraintsUpdate = new GridBagConstraints();
	this.gridBagConstraintsUpdate.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUpdate.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUpdate.gridy = iYPanelCamposUpdate;
	this.gridBagConstraintsUpdate.gridx = iXPanelCamposUpdate++;
	this.gridBagConstraintsUpdate.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUpdate.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUpdate.add(this.jPanelid_anioUpdate, this.gridBagConstraintsUpdate);



	if(iXPanelCamposUpdate % 2==0) {
		iXPanelCamposUpdate=0;
		iYPanelCamposUpdate++;
	}
	this.gridBagConstraintsUpdate = new GridBagConstraints();
	this.gridBagConstraintsUpdate.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUpdate.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUpdate.gridy = iYPanelCamposUpdate;
	this.gridBagConstraintsUpdate.gridx = iXPanelCamposUpdate++;
	this.gridBagConstraintsUpdate.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUpdate.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUpdate.add(this.jPanelid_mesUpdate, this.gridBagConstraintsUpdate);



	if(iXPanelCamposUpdate % 2==0) {
		iXPanelCamposUpdate=0;
		iYPanelCamposUpdate++;
	}
	this.gridBagConstraintsUpdate = new GridBagConstraints();
	this.gridBagConstraintsUpdate.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUpdate.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUpdate.gridy = iYPanelCamposUpdate;
	this.gridBagConstraintsUpdate.gridx = iXPanelCamposUpdate++;
	this.gridBagConstraintsUpdate.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUpdate.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUpdate.add(this.jPanelcodigoUpdate, this.gridBagConstraintsUpdate);



	if(iXPanelCamposUpdate % 2==0) {
		iXPanelCamposUpdate=0;
		iYPanelCamposUpdate++;
	}
	this.gridBagConstraintsUpdate = new GridBagConstraints();
	this.gridBagConstraintsUpdate.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUpdate.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUpdate.gridy = iYPanelCamposUpdate;
	this.gridBagConstraintsUpdate.gridx = iXPanelCamposUpdate++;
	this.gridBagConstraintsUpdate.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUpdate.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUpdate.add(this.jPanelcodigo_procesoUpdate, this.gridBagConstraintsUpdate);



	if(iXPanelCamposUpdate % 2==0) {
		iXPanelCamposUpdate=0;
		iYPanelCamposUpdate++;
	}
	this.gridBagConstraintsUpdate = new GridBagConstraints();
	this.gridBagConstraintsUpdate.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUpdate.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUpdate.gridy = iYPanelCamposUpdate;
	this.gridBagConstraintsUpdate.gridx = iXPanelCamposUpdate++;
	this.gridBagConstraintsUpdate.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUpdate.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUpdate.add(this.jPanelquery_resumenUpdate, this.gridBagConstraintsUpdate);



	if(iXPanelCamposUpdate % 2==0) {
		iXPanelCamposUpdate=0;
		iYPanelCamposUpdate++;
	}
	this.gridBagConstraintsUpdate = new GridBagConstraints();
	this.gridBagConstraintsUpdate.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUpdate.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUpdate.gridy = iYPanelCamposUpdate;
	this.gridBagConstraintsUpdate.gridx = iXPanelCamposUpdate++;
	this.gridBagConstraintsUpdate.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUpdate.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUpdate.add(this.jPanelnumero_intentoUpdate, this.gridBagConstraintsUpdate);



	if(iXPanelCamposUpdate % 2==0) {
		iXPanelCamposUpdate=0;
		iYPanelCamposUpdate++;
	}
	this.gridBagConstraintsUpdate = new GridBagConstraints();
	this.gridBagConstraintsUpdate.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUpdate.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUpdate.gridy = iYPanelCamposUpdate;
	this.gridBagConstraintsUpdate.gridx = iXPanelCamposUpdate++;
	this.gridBagConstraintsUpdate.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUpdate.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUpdate.add(this.jPanelfechaUpdate, this.gridBagConstraintsUpdate);



	if(iXPanelCamposUpdate % 2==0) {
		iXPanelCamposUpdate=0;
		iYPanelCamposUpdate++;
	}
	this.gridBagConstraintsUpdate = new GridBagConstraints();
	this.gridBagConstraintsUpdate.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUpdate.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUpdate.gridy = iYPanelCamposUpdate;
	this.gridBagConstraintsUpdate.gridx = iXPanelCamposUpdate++;
	this.gridBagConstraintsUpdate.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUpdate.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUpdate.add(this.jPanelfecha_archivoUpdate, this.gridBagConstraintsUpdate);



	if(iXPanelCamposUpdate % 2==0) {
		iXPanelCamposUpdate=0;
		iYPanelCamposUpdate++;
	}
	this.gridBagConstraintsUpdate = new GridBagConstraints();
	this.gridBagConstraintsUpdate.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUpdate.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUpdate.gridy = iYPanelCamposUpdate;
	this.gridBagConstraintsUpdate.gridx = iXPanelCamposUpdate++;
	this.gridBagConstraintsUpdate.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUpdate.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUpdate.add(this.jPanelordenUpdate, this.gridBagConstraintsUpdate);



	if(iXPanelCamposUpdate % 2==0) {
		iXPanelCamposUpdate=0;
		iYPanelCamposUpdate++;
	}
	this.gridBagConstraintsUpdate = new GridBagConstraints();
	this.gridBagConstraintsUpdate.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUpdate.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUpdate.gridy = iYPanelCamposUpdate;
	this.gridBagConstraintsUpdate.gridx = iXPanelCamposUpdate++;
	this.gridBagConstraintsUpdate.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUpdate.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUpdate.add(this.jPanelejecutadoUpdate, this.gridBagConstraintsUpdate);



	if(iXPanelCamposUpdate % 2==0) {
		iXPanelCamposUpdate=0;
		iYPanelCamposUpdate++;
	}
	this.gridBagConstraintsUpdate = new GridBagConstraints();
	this.gridBagConstraintsUpdate.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUpdate.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUpdate.gridy = iYPanelCamposUpdate;
	this.gridBagConstraintsUpdate.gridx = iXPanelCamposUpdate++;
	this.gridBagConstraintsUpdate.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUpdate.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUpdate.add(this.jPanelesta_activoUpdate, this.gridBagConstraintsUpdate);



	if(iXPanelCamposUpdate % 2==0) {
		iXPanelCamposUpdate=0;
		iYPanelCamposUpdate++;
	}
	this.gridBagConstraintsUpdate = new GridBagConstraints();
	this.gridBagConstraintsUpdate.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUpdate.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUpdate.gridy = iYPanelCamposUpdate;
	this.gridBagConstraintsUpdate.gridx = iXPanelCamposUpdate++;
	this.gridBagConstraintsUpdate.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUpdate.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUpdate.add(this.jPaneldescripcionUpdate, this.gridBagConstraintsUpdate);



	if(iXPanelCamposUpdate % 2==0) {
		iXPanelCamposUpdate=0;
		iYPanelCamposUpdate++;
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
			
		GridBagLayout gridaBagLayoutAccionesUpdate= new GridBagLayout();
		this.jPanelAccionesUpdate.setLayout(gridaBagLayoutAccionesUpdate);
		
		GridBagLayout gridaBagLayoutAccionesFormularioUpdate= new GridBagLayout();
		this.jPanelAccionesFormularioUpdate.setLayout(gridaBagLayoutAccionesFormularioUpdate);
		
		this.gridBagConstraintsUpdate = new GridBagConstraints();
		this.gridBagConstraintsUpdate.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsUpdate.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioUpdate.add(this.jComboBoxTiposAccionesFormularioUpdate, this.gridBagConstraintsUpdate);

		this.gridBagConstraintsUpdate = new GridBagConstraints();
		this.gridBagConstraintsUpdate.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsUpdate.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioUpdate.add(this.jCheckBoxPostAccionNuevoUpdate, this.gridBagConstraintsUpdate);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.updateSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsUpdate = new GridBagConstraints();
			this.gridBagConstraintsUpdate.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsUpdate.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioUpdate.add(this.jCheckBoxPostAccionSinCerrarUpdate, this.gridBagConstraintsUpdate);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.updateSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.updateSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsUpdate = new GridBagConstraints();
			this.gridBagConstraintsUpdate.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsUpdate.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioUpdate.add(this.jCheckBoxPostAccionSinMensajeUpdate, this.gridBagConstraintsUpdate);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsUpdate = new GridBagConstraints();
		this.gridBagConstraintsUpdate.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUpdate.gridy = 0;
		this.gridBagConstraintsUpdate.gridx = iPosXAccion++;
			
		this.jPanelAccionesUpdate.add(this.jButtonModificarUpdate, this.gridBagConstraintsUpdate);							

		this.gridBagConstraintsUpdate = new GridBagConstraints();
		this.gridBagConstraintsUpdate.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUpdate.gridy = 0;
		this.gridBagConstraintsUpdate.gridx =iPosXAccion++;
			
		this.jPanelAccionesUpdate.add(this.jButtonEliminarUpdate, this.gridBagConstraintsUpdate);
		
			
		this.gridBagConstraintsUpdate = new GridBagConstraints();
		this.gridBagConstraintsUpdate.gridy = 0;		
		this.gridBagConstraintsUpdate.gridx = iPosXAccion++;
		
		this.jPanelAccionesUpdate.add(this.jButtonActualizarUpdate, this.gridBagConstraintsUpdate);


		this.gridBagConstraintsUpdate = new GridBagConstraints();
		this.gridBagConstraintsUpdate.gridy = 0;		
		this.gridBagConstraintsUpdate.gridx = iPosXAccion++;
		
		this.jPanelAccionesUpdate.add(this.jButtonGuardarCambiosUpdate, this.gridBagConstraintsUpdate);	
		
		this.gridBagConstraintsUpdate = new GridBagConstraints();
		this.gridBagConstraintsUpdate.gridy = 0;		
		this.gridBagConstraintsUpdate.gridx =iPosXAccion++;
		
		this.jPanelAccionesUpdate.add(this.jButtonCancelarUpdate, this.gridBagConstraintsUpdate);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutUpdate = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutUpdate);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.updateSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsUpdate = new GridBagConstraints();						
			this.gridBagConstraintsUpdate.gridy = iGridyPrincipal++;
			this.gridBagConstraintsUpdate.gridx = 0;		
			//this.gridBagConstraintsUpdate.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUpdate.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsUpdate.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsUpdate = new GridBagConstraints();
		this.gridBagConstraintsUpdate.gridy =iGridyPrincipal++;
		this.gridBagConstraintsUpdate.gridx =0;
		this.gridBagConstraintsUpdate.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsUpdate.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosUpdate, this.gridBagConstraintsUpdate);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(UpdateJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleUpdate = new UpdateBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Update DATOS");
			
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
			
	        //this.setTitle("[FOR] - Update DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Update Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			UpdateModel updateModel=new UpdateModel(this);
			
			//SI USARA CLASE INTERNA
			//UpdateModel.UpdateFocusTraversalPolicy updateFocusTraversalPolicy = updateModel.new UpdateFocusTraversalPolicy(this);
			
			//updateFocusTraversalPolicy.setupdateJInternalFrame(this);
			
			this.setFocusTraversalPolicy(updateModel);
			
			
			this.jContentPaneDetalleUpdate = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleUpdate = new GridBagLayout();	
			this.jContentPaneDetalleUpdate.setLayout(gridaBagLayoutDetalleUpdate);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosUpdate = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsUpdate = new GridBagConstraints();
				this.gridBagConstraintsUpdate.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsUpdate.gridx = 0;
					
				
				this.jContentPaneDetalleUpdate.add(jTtoolBarDetalleUpdate, gridBagConstraintsUpdate);								
				
}
			
			this.jScrollPanelDatosEdicionUpdate=   new JScrollPane(jContentPaneDetalleUpdate,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionUpdate.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionUpdate.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionUpdate.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralUpdate=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralUpdate.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralUpdate.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralUpdate.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsUpdate = new GridBagConstraints();
			
			
	        this.gridBagConstraintsUpdate.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsUpdate.gridx = 0;
	        
			this.jContentPaneDetalleUpdate.add(jPanelCamposUpdate, gridBagConstraintsUpdate);
			
			
			
			
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
						&& updateSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameUpdateDetalle(this.puedeCargarPorParteUpdateDetalle,false,-1);
					
					if(this.updateSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsUpdate= new GridBagConstraints();
						this.gridBagConstraintsUpdate.gridy = iGridyRelaciones++;
						this.gridBagConstraintsUpdate.gridx = 0;
						this.jContentPaneDetalleUpdate.add(this.jTabbedPaneRelacionesUpdate, this.gridBagConstraintsUpdate);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesUpdate.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameUpdateDetalle(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosUpdate.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsUpdate = new GridBagConstraints();
					this.gridBagConstraintsUpdate.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsUpdate.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsUpdate.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsUpdate.gridx = 0;
					
				
					this.jContentPaneDetalleUpdate.add(jPanelCamposOcultosUpdate, gridBagConstraintsUpdate);
				
					this.jPanelCamposOcultosUpdate.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsUpdate = new GridBagConstraints();
			this.gridBagConstraintsUpdate.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsUpdate.gridx = 0;
	        this.gridBagConstraintsUpdate.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleUpdate.add(this.jPanelAccionesFormularioUpdate, this.gridBagConstraintsUpdate);							
			
			
			
			this.gridBagConstraintsUpdate = new GridBagConstraints();
	        this.gridBagConstraintsUpdate.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsUpdate.gridx = 0;
	        
			
			this.jContentPaneDetalleUpdate.add(this.jPanelAccionesUpdate, this.gridBagConstraintsUpdate);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionUpdate);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionUpdate=   new JScrollPane(this.jPanelCamposUpdate,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionUpdate.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionUpdate.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionUpdate.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsUpdate = new GridBagConstraints();
			this.gridBagConstraintsUpdate.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsUpdate.gridx = 0;
			this.gridBagConstraintsUpdate.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsUpdate.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsUpdate.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionUpdate, this.gridBagConstraintsUpdate);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsUpdate = new GridBagConstraints();
			this.gridBagConstraintsUpdate.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsUpdate.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioUpdate, this.gridBagConstraintsUpdate);			
			
			this.gridBagConstraintsUpdate = new GridBagConstraints();
			this.gridBagConstraintsUpdate.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsUpdate.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesUpdate, this.gridBagConstraintsUpdate);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsUpdate = new GridBagConstraints();
		this.gridBagConstraintsUpdate.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsUpdate.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposUpdate, this.gridBagConstraintsUpdate);
			
			
		this.gridBagConstraintsUpdate = new GridBagConstraints();
		this.gridBagConstraintsUpdate.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsUpdate.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosUpdate, this.gridBagConstraintsUpdate);
		
			
		this.gridBagConstraintsUpdate = new GridBagConstraints();
		this.gridBagConstraintsUpdate.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsUpdate.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesUpdate, this.gridBagConstraintsUpdate);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralUpdate;//jContentPane;
		
		return jScrollPanelDatosEdicionUpdate;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameUpdateDetalle(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.updatedetalleSessionBean=new UpdateDetalleSessionBean();
		this.updatedetalleSessionBean.setConGuardarRelaciones(false);
		this.updatedetalleSessionBean.setEsGuardarRelacionado(true);

		this.updatedetalleBeanSwingJInternalFrame=null;//new UpdateDetalleBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.updatedetalleBeanSwingJInternalFramePopup=new UpdateDetalleBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.updatedetalleBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.updatedetalleSessionBean.getEsGuardarRelacionado()) {

				UpdateDetalleJInternalFrame.STIPO_TAMANIO_GENERAL=UpdateJInternalFrame.STIPO_TAMANIO_GENERAL;
				UpdateDetalleJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=UpdateJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.updatedetalleSessionBean.setEsGuardarRelacionado(true);

				this.updatedetalleBeanSwingJInternalFrame=new UpdateDetalleBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.updatedetalleBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.updatedetalleBeanSwingJInternalFrame.setupdatedetalleSessionBean(this.updatedetalleSessionBean);

				//this.gridBagConstraintsUpdate = new GridBagConstraints();
				//this.gridBagConstraintsUpdate.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsUpdate.gridx = 0;
				//this.jContentPaneDetalleUpdate.add(this.updatedetalleBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsUpdate);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesUpdate.add("Update Detalles",this.updatedetalleBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesUpdate.setComponentAt(iIndexTab,this.updatedetalleBeanSwingJInternalFrame.getContentPane());
				}

				//UpdateDetalleJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.updatedetalleSessionBean.setEsGuardarRelacionado(false);
				this.updatedetalleBeanSwingJInternalFrame=null;//new UpdateDetalleBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.updatedetalleSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteUpdateDetalle) {
					this.jTabbedPaneRelacionesUpdate.add("Update Detalles",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarUpdateDetalleBeanSwingJInternalFrame(List<Update> updates,Update update,UpdateDetalleBeanSwingJInternalFrame updatedetalleBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//updatedetalleBeanSwingJInternalFrame=new UpdateDetalleBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					updatedetalleBeanSwingJInternalFrame.getUpdateDetalleLogic().setConnexion(this.updateLogic.getConnexion());

					updatedetalleBeanSwingJInternalFrame.setupdatesForeignKey(updates);
					updatedetalleBeanSwingJInternalFrame.setupdateForeignKey(update);
					updatedetalleBeanSwingJInternalFrame.updatedetalleSessionBean.setisBusquedaDesdeForeignKeySesionUpdate(true);
					updatedetalleBeanSwingJInternalFrame.updatedetalleSessionBean.setlidUpdateActual(update.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					updatedetalleBeanSwingJInternalFrame.cargarCombosForeignKeyUpdateDetalle(updatedetalleBeanSwingJInternalFrame.isCargarCombosDependencia);
					updatedetalleBeanSwingJInternalFrame.setVisibilidadBusquedasParaUpdate(true);
					updatedetalleBeanSwingJInternalFrame.setid_updateFK_IdUpdate(update.getId());

					if(!this.conCargarFormDetalle) {
						updatedetalleBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					updatedetalleBeanSwingJInternalFrame.setSelectedItemCombosFrameUpdateForeignKey(update,1,false,true,true);
					updatedetalleBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					updatedetalleBeanSwingJInternalFrame.procesarBusqueda("FK_IdUpdate");
					updatedetalleBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdUpdate");
					updatedetalleBeanSwingJInternalFrame.inicializarActualizarBindingTablaUpdateDetalle(true);
					updatedetalleBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesUpdateDetalle("n",updatedetalleBeanSwingJInternalFrame.isGuardarCambiosEnLote, updatedetalleBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					updatedetalleBeanSwingJInternalFrame.setAutoscrolls(true);
					updatedetalleBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						updatedetalleBeanSwingJInternalFrame.actualizarEstadoPanelsUpdateDetalle("relacionado");
					} else {
						updatedetalleBeanSwingJInternalFrame.actualizarEstadoPanelsUpdateDetalle("no_relacionado");
					}

					updatedetalleBeanSwingJInternalFrame.getjButtonRecargarInformacionUpdateDetalle().setVisible(false);

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
