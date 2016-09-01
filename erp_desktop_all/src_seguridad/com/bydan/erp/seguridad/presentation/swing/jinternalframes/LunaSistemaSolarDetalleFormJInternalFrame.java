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
import com.bydan.erp.seguridad.util.LunaSistemaSolarConstantesFunciones;

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
public class LunaSistemaSolarDetalleFormJInternalFrame extends LunaSistemaSolarBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleLunaSistemaSolar;
	
	protected JMenuBar jmenuBarDetalleLunaSistemaSolar;
	
	protected JMenu jmenuDetalleLunaSistemaSolar;
	protected JMenu jmenuDetalleArchivoLunaSistemaSolar;
	protected JMenu jmenuDetalleAccionesLunaSistemaSolar;
	protected JMenu jmenuDetalleDatosLunaSistemaSolar;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleLunaSistemaSolar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutLunaSistemaSolar;	
	protected GridBagConstraints gridBagConstraintsLunaSistemaSolar;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected LunaSistemaSolarBeanSwingJInternalFrameAdditional jInternalFrameDetalleLunaSistemaSolar;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected TipoValoracionBeanSwingJInternalFrame tipovaloracionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipovaloracion="";
	
	public LunaSistemaSolarSessionBean lunasistemasolarSessionBean;
	
	
	
	
	public TipoValoracionSessionBean tipovaloracionSessionBean;	
	
	public LunaSistemaSolarLogic lunasistemasolarLogic;
	
	public JScrollPane jScrollPanelDatosLunaSistemaSolar;
	public JScrollPane jScrollPanelDatosEdicionLunaSistemaSolar;
	public JScrollPane jScrollPanelDatosGeneralLunaSistemaSolar;
	
	protected JPanel jPanelCamposLunaSistemaSolar;    
	protected JPanel jPanelCamposOcultosLunaSistemaSolar;    	
	protected JPanel jPanelAccionesLunaSistemaSolar;
	protected JPanel jPanelAccionesFormularioLunaSistemaSolar;
    
	
	
	protected Integer iXPanelCamposLunaSistemaSolar=0;
	protected Integer iYPanelCamposLunaSistemaSolar=0;
	
	protected Integer iXPanelCamposOcultosLunaSistemaSolar=0;
	protected Integer iYPanelCamposOcultosLunaSistemaSolar=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoLunaSistemaSolar;
	public JButton jButtonModificarLunaSistemaSolar;
	public JButton jButtonActualizarLunaSistemaSolar;
    public JButton jButtonEliminarLunaSistemaSolar;
	public JButton jButtonCancelarLunaSistemaSolar;
    public JButton jButtonGuardarCambiosLunaSistemaSolar;
	public JButton jButtonGuardarCambiosTablaLunaSistemaSolar;
	protected JButton jButtonCerrarLunaSistemaSolar;
	
	
	protected JButton jButtonProcesarInformacionLunaSistemaSolar;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoLunaSistemaSolar;
	protected JCheckBox jCheckBoxPostAccionSinCerrarLunaSistemaSolar;
	protected JCheckBox jCheckBoxPostAccionSinMensajeLunaSistemaSolar;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarLunaSistemaSolar;
	protected JButton jButtonModificarToolBarLunaSistemaSolar;
	protected JButton jButtonActualizarToolBarLunaSistemaSolar;
    protected JButton jButtonEliminarToolBarLunaSistemaSolar;
	protected JButton jButtonCancelarToolBarLunaSistemaSolar;
    protected JButton jButtonGuardarCambiosToolBarLunaSistemaSolar;
	protected JButton jButtonGuardarCambiosTablaToolBarLunaSistemaSolar;
	protected JButton jButtonMostrarOcultarTablaToolBarLunaSistemaSolar;
	protected JButton jButtonCerrarToolBarLunaSistemaSolar;
	
	protected JButton jButtonProcesarInformacionToolBarLunaSistemaSolar;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoLunaSistemaSolar;
	protected JMenuItem jMenuItemModificarLunaSistemaSolar;
	protected JMenuItem jMenuItemActualizarLunaSistemaSolar;
    protected JMenuItem jMenuItemEliminarLunaSistemaSolar;
	protected JMenuItem jMenuItemCancelarLunaSistemaSolar;
    protected JMenuItem jMenuItemGuardarCambiosLunaSistemaSolar;
	protected JMenuItem jMenuItemGuardarCambiosTablaLunaSistemaSolar;
	protected JMenuItem jMenuItemCerrarLunaSistemaSolar;
	protected JMenuItem jMenuItemDetalleCerrarLunaSistemaSolar;
	protected JMenuItem jMenuItemDetalleMostarOcultarLunaSistemaSolar;
	
	protected JMenuItem jMenuItemProcesarInformacionLunaSistemaSolar;
	protected JMenuItem jMenuItemNuevoGuardarCambiosLunaSistemaSolar;
	protected JMenuItem jMenuItemMostrarOcultarLunaSistemaSolar;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesLunaSistemaSolar;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesLunaSistemaSolar;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesLunaSistemaSolar;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioLunaSistemaSolar;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidLunaSistemaSolar;
	public JLabel jLabelIdLunaSistemaSolar;
	public JTextFieldMe jTextFieldidLunaSistemaSolar;
	public JButton jButtonidLunaSistemaSolarBusqueda= new JButtonMe();

	public JPanel jPanelcodigoLunaSistemaSolar;
	public JLabel jLabelcodigoLunaSistemaSolar;
	public JTextField jTextFieldcodigoLunaSistemaSolar;
	public JButton jButtoncodigoLunaSistemaSolarBusqueda= new JButtonMe();

	public JPanel jPanelnombreLunaSistemaSolar;
	public JLabel jLabelnombreLunaSistemaSolar;
	public JTextArea jTextAreanombreLunaSistemaSolar;
	public JScrollPane jscrollPanenombreLunaSistemaSolar;
	public JButton jButtonnombreLunaSistemaSolarBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionLunaSistemaSolar;
	public JLabel jLabeldescripcionLunaSistemaSolar;
	public JTextArea jTextAreadescripcionLunaSistemaSolar;
	public JScrollPane jscrollPanedescripcionLunaSistemaSolar;
	public JButton jButtondescripcionLunaSistemaSolarBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_valoracionLunaSistemaSolar;
	public JLabel jLabelid_tipo_valoracionLunaSistemaSolar;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_valoracionLunaSistemaSolar;
	public JButton jButtonid_tipo_valoracionLunaSistemaSolar= new JButtonMe();
	public JButton jButtonid_tipo_valoracionLunaSistemaSolarUpdate= new JButtonMe();
	public JButton jButtonid_tipo_valoracionLunaSistemaSolarBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesLunaSistemaSolar;
	
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
	
	public LunaSistemaSolarDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposLunaSistemaSolar=new JPanel();
				this.jPanelAccionesFormularioLunaSistemaSolar=new JPanel();
				this.jmenuBarDetalleLunaSistemaSolar=new JMenuBar();
				this.jTtoolBarDetalleLunaSistemaSolar=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public LunaSistemaSolarDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("LunaSistemaSolar No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public LunaSistemaSolarDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("LunaSistemaSolar No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public LunaSistemaSolarDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("LunaSistemaSolar No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public LunaSistemaSolarDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("LunaSistemaSolar No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public LunaSistemaSolarDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("LunaSistemaSolar No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarLunaSistemaSolar() {
		return this.jButtonActualizarToolBarLunaSistemaSolar;
	}
	
	public JButton getjButtonEliminarToolBarLunaSistemaSolar() {
		return this.jButtonEliminarToolBarLunaSistemaSolar;
	}
	
	public JButton getjButtonCancelarToolBarLunaSistemaSolar() {
		return this.jButtonCancelarToolBarLunaSistemaSolar;
	}		
	
	public JButton getjButtonProcesarInformacionLunaSistemaSolar() {
		return this.jButtonProcesarInformacionLunaSistemaSolar;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionLunaSistemaSolar)	{
		this.jButtonProcesarInformacionLunaSistemaSolar = jButtonProcesarInformacionLunaSistemaSolar;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesLunaSistemaSolar() {
		return this.jComboBoxTiposAccionesLunaSistemaSolar;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesLunaSistemaSolar(
			JComboBox jComboBoxTiposRelacionesLunaSistemaSolar) {
		this.jComboBoxTiposRelacionesLunaSistemaSolar = jComboBoxTiposRelacionesLunaSistemaSolar;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesLunaSistemaSolar(
			JComboBox jComboBoxTiposAccionesLunaSistemaSolar) {
		this.jComboBoxTiposAccionesLunaSistemaSolar = jComboBoxTiposAccionesLunaSistemaSolar;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioLunaSistemaSolar() {
		return this.jComboBoxTiposAccionesFormularioLunaSistemaSolar;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioLunaSistemaSolar(
			JComboBox jComboBoxTiposAccionesFormularioLunaSistemaSolar) {
		this.jComboBoxTiposAccionesFormularioLunaSistemaSolar = jComboBoxTiposAccionesFormularioLunaSistemaSolar;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.lunasistemasolarSessionBean=new LunaSistemaSolarSessionBean();
		
		this.lunasistemasolarSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.lunasistemasolarSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.lunasistemasolarSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		LunaSistemaSolarJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		LunaSistemaSolarJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		LunaSistemaSolarJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Luna Sistema Solar MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.lunasistemasolarSessionBean.getEsGuardarRelacionado()) {
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
	
		LunaSistemaSolarJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleLunaSistemaSolar= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarLunaSistemaSolar=new JButtonMe();
				this.jButtonModificarToolBarLunaSistemaSolar=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarLunaSistemaSolar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarLunaSistemaSolar,this.jTtoolBarDetalleLunaSistemaSolar,
							"actualizar","actualizar","Actualizar"+" "+LunaSistemaSolarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarLunaSistemaSolar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarLunaSistemaSolar,this.jTtoolBarDetalleLunaSistemaSolar,
							"eliminar","eliminar","Eliminar"+" "+LunaSistemaSolarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarLunaSistemaSolar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarLunaSistemaSolar,this.jTtoolBarDetalleLunaSistemaSolar,
							"cancelar","cancelar","Cancelar"+" "+LunaSistemaSolarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarLunaSistemaSolar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarLunaSistemaSolar,this.jTtoolBarDetalleLunaSistemaSolar,
							"guardarcambios","guardarcambios","Guardar"+" "+LunaSistemaSolarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarLunaSistemaSolar,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarLunaSistemaSolar,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarLunaSistemaSolar,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleLunaSistemaSolar=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleLunaSistemaSolar=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoLunaSistemaSolar=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesLunaSistemaSolar=new JMenuMe("Acciones");
		this.jmenuDetalleDatosLunaSistemaSolar=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoLunaSistemaSolar= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoLunaSistemaSolar.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoLunaSistemaSolar,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarLunaSistemaSolar= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarLunaSistemaSolar.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarLunaSistemaSolar,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarLunaSistemaSolar= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarLunaSistemaSolar.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarLunaSistemaSolar,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarLunaSistemaSolar= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarLunaSistemaSolar.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarLunaSistemaSolar,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarLunaSistemaSolar= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarLunaSistemaSolar.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarLunaSistemaSolar,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosLunaSistemaSolar= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosLunaSistemaSolar.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosLunaSistemaSolar,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarLunaSistemaSolar= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarLunaSistemaSolar.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarLunaSistemaSolar,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarLunaSistemaSolar= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarLunaSistemaSolar.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarLunaSistemaSolar,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarLunaSistemaSolar= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarLunaSistemaSolar.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarLunaSistemaSolar,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarLunaSistemaSolar= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarLunaSistemaSolar.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarLunaSistemaSolar,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoLunaSistemaSolar.add(this.jMenuItemDetalleCerrarLunaSistemaSolar);
		
		this.jmenuDetalleAccionesLunaSistemaSolar.add(this.jMenuItemActualizarLunaSistemaSolar);
		this.jmenuDetalleAccionesLunaSistemaSolar.add(this.jMenuItemEliminarLunaSistemaSolar);
		this.jmenuDetalleAccionesLunaSistemaSolar.add(this.jMenuItemCancelarLunaSistemaSolar);		
		
		//this.jmenuDetalleDatosLunaSistemaSolar.add(this.jMenuItemDetalleAbrirOrderByLunaSistemaSolar);				
		this.jmenuDetalleDatosLunaSistemaSolar.add(this.jMenuItemDetalleMostarOcultarLunaSistemaSolar);				
				
		//this.jmenuDetalleAccionesLunaSistemaSolar.add(this.jMenuItemGuardarCambiosLunaSistemaSolar);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleLunaSistemaSolar.add(this.jmenuDetalleArchivoLunaSistemaSolar);		
		this.jmenuBarDetalleLunaSistemaSolar.add(this.jmenuDetalleAccionesLunaSistemaSolar);		
		this.jmenuBarDetalleLunaSistemaSolar.add(this.jmenuDetalleDatosLunaSistemaSolar);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleLunaSistemaSolar);				
	}
	
	
	public void inicializarElementosCamposLunaSistemaSolar() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdLunaSistemaSolar = new JLabelMe();
		jLabelIdLunaSistemaSolar.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdLunaSistemaSolar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdLunaSistemaSolar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdLunaSistemaSolar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdLunaSistemaSolar,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidLunaSistemaSolar = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidLunaSistemaSolar.setToolTipText(LunaSistemaSolarConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutLunaSistemaSolar= new GridBagLayout();

		this.jPanelidLunaSistemaSolar.setLayout(this.gridaBagLayoutLunaSistemaSolar);

		jTextFieldidLunaSistemaSolar = new JTextFieldMe();
		jTextFieldidLunaSistemaSolar.setText("Id");

		jTextFieldidLunaSistemaSolar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidLunaSistemaSolar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidLunaSistemaSolar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoLunaSistemaSolar = new JLabelMe();
		this.jLabelcodigoLunaSistemaSolar.setText(""+LunaSistemaSolarConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoLunaSistemaSolar.setToolTipText("Codigo");
		this.jLabelcodigoLunaSistemaSolar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoLunaSistemaSolar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoLunaSistemaSolar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoLunaSistemaSolar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoLunaSistemaSolar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoLunaSistemaSolar.setToolTipText(LunaSistemaSolarConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutLunaSistemaSolar = new GridBagLayout();
		this.jPanelcodigoLunaSistemaSolar.setLayout(this.gridaBagLayoutLunaSistemaSolar);


		jTextFieldcodigoLunaSistemaSolar= new JTextFieldMe();

		jTextFieldcodigoLunaSistemaSolar.setEnabled(false);
		jTextFieldcodigoLunaSistemaSolar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoLunaSistemaSolar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoLunaSistemaSolar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoLunaSistemaSolar,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoLunaSistemaSolarBusqueda= new JButtonMe();
		this.jButtoncodigoLunaSistemaSolarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoLunaSistemaSolarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoLunaSistemaSolarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoLunaSistemaSolarBusqueda.setText("U");
		this.jButtoncodigoLunaSistemaSolarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoLunaSistemaSolarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoLunaSistemaSolarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoLunaSistemaSolar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoLunaSistemaSolar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoLunaSistemaSolarBusqueda"));

		if(this.lunasistemasolarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoLunaSistemaSolarBusqueda.setVisible(false);		}


					
		this.jLabelnombreLunaSistemaSolar = new JLabelMe();
		this.jLabelnombreLunaSistemaSolar.setText(""+LunaSistemaSolarConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreLunaSistemaSolar.setToolTipText("Nombre");
		this.jLabelnombreLunaSistemaSolar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreLunaSistemaSolar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreLunaSistemaSolar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreLunaSistemaSolar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreLunaSistemaSolar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreLunaSistemaSolar.setToolTipText(LunaSistemaSolarConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutLunaSistemaSolar = new GridBagLayout();
		this.jPanelnombreLunaSistemaSolar.setLayout(this.gridaBagLayoutLunaSistemaSolar);


		jTextAreanombreLunaSistemaSolar= new JTextAreaMe();
		jTextAreanombreLunaSistemaSolar.setEnabled(false);
		jTextAreanombreLunaSistemaSolar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreLunaSistemaSolar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreLunaSistemaSolar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreLunaSistemaSolar.setLineWrap(true);
		jTextAreanombreLunaSistemaSolar.setWrapStyleWord(true);
		jTextAreanombreLunaSistemaSolar.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreLunaSistemaSolar.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreLunaSistemaSolar,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreLunaSistemaSolar = new JScrollPane(jTextAreanombreLunaSistemaSolar);
		jscrollPanenombreLunaSistemaSolar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreLunaSistemaSolar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreLunaSistemaSolar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreLunaSistemaSolarBusqueda= new JButtonMe();
		this.jButtonnombreLunaSistemaSolarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreLunaSistemaSolarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreLunaSistemaSolarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreLunaSistemaSolarBusqueda.setText("U");
		this.jButtonnombreLunaSistemaSolarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreLunaSistemaSolarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreLunaSistemaSolarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreLunaSistemaSolar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreLunaSistemaSolar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreLunaSistemaSolarBusqueda"));

		if(this.lunasistemasolarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreLunaSistemaSolarBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionLunaSistemaSolar = new JLabelMe();
		this.jLabeldescripcionLunaSistemaSolar.setText(""+LunaSistemaSolarConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionLunaSistemaSolar.setToolTipText("Descripcion");
		this.jLabeldescripcionLunaSistemaSolar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionLunaSistemaSolar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionLunaSistemaSolar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionLunaSistemaSolar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionLunaSistemaSolar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionLunaSistemaSolar.setToolTipText(LunaSistemaSolarConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutLunaSistemaSolar = new GridBagLayout();
		this.jPaneldescripcionLunaSistemaSolar.setLayout(this.gridaBagLayoutLunaSistemaSolar);


		jTextAreadescripcionLunaSistemaSolar= new JTextAreaMe();
		jTextAreadescripcionLunaSistemaSolar.setEnabled(false);
		jTextAreadescripcionLunaSistemaSolar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionLunaSistemaSolar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionLunaSistemaSolar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionLunaSistemaSolar.setLineWrap(true);
		jTextAreadescripcionLunaSistemaSolar.setWrapStyleWord(true);
		jTextAreadescripcionLunaSistemaSolar.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionLunaSistemaSolar.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionLunaSistemaSolar,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionLunaSistemaSolar = new JScrollPane(jTextAreadescripcionLunaSistemaSolar);
		jscrollPanedescripcionLunaSistemaSolar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionLunaSistemaSolar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionLunaSistemaSolar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionLunaSistemaSolarBusqueda= new JButtonMe();
		this.jButtondescripcionLunaSistemaSolarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionLunaSistemaSolarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionLunaSistemaSolarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionLunaSistemaSolarBusqueda.setText("U");
		this.jButtondescripcionLunaSistemaSolarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionLunaSistemaSolarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionLunaSistemaSolarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionLunaSistemaSolar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionLunaSistemaSolar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionLunaSistemaSolarBusqueda"));

		if(this.lunasistemasolarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionLunaSistemaSolarBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysLunaSistemaSolar() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_tipo_valoracionLunaSistemaSolar = new JLabelMe();
		this.jLabelid_tipo_valoracionLunaSistemaSolar.setText(""+LunaSistemaSolarConstantesFunciones.LABEL_IDTIPOVALORACION+" : *");
		this.jLabelid_tipo_valoracionLunaSistemaSolar.setToolTipText("Idtipo Valoracion");
		this.jLabelid_tipo_valoracionLunaSistemaSolar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_valoracionLunaSistemaSolar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_valoracionLunaSistemaSolar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_valoracionLunaSistemaSolar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_valoracionLunaSistemaSolar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_valoracionLunaSistemaSolar.setToolTipText(LunaSistemaSolarConstantesFunciones.LABEL_IDTIPOVALORACION);
		this.gridaBagLayoutLunaSistemaSolar = new GridBagLayout();
		this.jPanelid_tipo_valoracionLunaSistemaSolar.setLayout(this.gridaBagLayoutLunaSistemaSolar);


		jComboBoxid_tipo_valoracionLunaSistemaSolar= new JComboBoxMe();
		jComboBoxid_tipo_valoracionLunaSistemaSolar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_valoracionLunaSistemaSolar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_valoracionLunaSistemaSolar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_valoracionLunaSistemaSolar,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_valoracionLunaSistemaSolar= new JButtonMe();
		this.jButtonid_tipo_valoracionLunaSistemaSolar.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_valoracionLunaSistemaSolar.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_valoracionLunaSistemaSolar.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_valoracionLunaSistemaSolar.setText("Buscar");
		this.jButtonid_tipo_valoracionLunaSistemaSolar.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_valoracionLunaSistemaSolar.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_valoracionLunaSistemaSolar,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_valoracionLunaSistemaSolar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_valoracionLunaSistemaSolar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_valoracionLunaSistemaSolar"));

		this.jButtonid_tipo_valoracionLunaSistemaSolarBusqueda= new JButtonMe();
		this.jButtonid_tipo_valoracionLunaSistemaSolarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_valoracionLunaSistemaSolarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_valoracionLunaSistemaSolarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_valoracionLunaSistemaSolarBusqueda.setText("U");
		this.jButtonid_tipo_valoracionLunaSistemaSolarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_valoracionLunaSistemaSolarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_valoracionLunaSistemaSolarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_valoracionLunaSistemaSolar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_valoracionLunaSistemaSolar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_valoracionLunaSistemaSolarBusqueda"));

		if(this.lunasistemasolarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_valoracionLunaSistemaSolarBusqueda.setVisible(false);		}

		this.jButtonid_tipo_valoracionLunaSistemaSolarUpdate= new JButtonMe();
		this.jButtonid_tipo_valoracionLunaSistemaSolarUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_valoracionLunaSistemaSolarUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_valoracionLunaSistemaSolarUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_valoracionLunaSistemaSolarUpdate.setText("U");
		this.jButtonid_tipo_valoracionLunaSistemaSolarUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_valoracionLunaSistemaSolarUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_valoracionLunaSistemaSolarUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_valoracionLunaSistemaSolar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_valoracionLunaSistemaSolar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_valoracionLunaSistemaSolarUpdate"));



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
		//this.jInternalFrameDetalleLunaSistemaSolar = new LunaSistemaSolarBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Luna Sistema Solar DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutLunaSistemaSolar= new GridBagLayout();
		

		
		String sToolTipLunaSistemaSolar="";
		sToolTipLunaSistemaSolar=LunaSistemaSolarConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipLunaSistemaSolar+="(Seguridad.LunaSistemaSolar)";
		}
		
		if(!this.lunasistemasolarSessionBean.getEsGuardarRelacionado()) {
			sToolTipLunaSistemaSolar+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoLunaSistemaSolar = new JButtonMe();
		this.jButtonModificarLunaSistemaSolar = new JButtonMe();
        this.jButtonActualizarLunaSistemaSolar = new JButtonMe();
        this.jButtonEliminarLunaSistemaSolar = new JButtonMe();
        this.jButtonCancelarLunaSistemaSolar = new JButtonMe();
        this.jButtonGuardarCambiosLunaSistemaSolar = new JButtonMe();
		this.jButtonGuardarCambiosTablaLunaSistemaSolar = new JButtonMe();
		this.jButtonCerrarLunaSistemaSolar = new JButtonMe();
		
		this.jScrollPanelDatosLunaSistemaSolar = new JScrollPane();   
        this.jScrollPanelDatosEdicionLunaSistemaSolar = new JScrollPane();
		this.jScrollPanelDatosGeneralLunaSistemaSolar = new JScrollPane();
				
		
		
		this.jPanelCamposLunaSistemaSolar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosLunaSistemaSolar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesLunaSistemaSolar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioLunaSistemaSolar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Luna Sistema Solar";
		
		if(!this.lunasistemasolarSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosLunaSistemaSolar.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Luna Sistema Solares" + this.sPath));
		} else {
			this.jScrollPanelDatosLunaSistemaSolar.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionLunaSistemaSolar.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralLunaSistemaSolar.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposLunaSistemaSolar.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposLunaSistemaSolar.setName("jPanelCamposLunaSistemaSolar"); 

		this.jPanelCamposOcultosLunaSistemaSolar.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosLunaSistemaSolar.setName("jPanelCamposOcultosLunaSistemaSolar"); 

        this.jPanelAccionesLunaSistemaSolar.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesLunaSistemaSolar.setToolTipText("Acciones");
        this.jPanelAccionesLunaSistemaSolar.setName("Acciones"); 

		this.jPanelAccionesFormularioLunaSistemaSolar.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioLunaSistemaSolar.setToolTipText("Acciones");
        this.jPanelAccionesFormularioLunaSistemaSolar.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoLunaSistemaSolar.setText("Nuevo");
		this.jButtonModificarLunaSistemaSolar.setText("Editar");
        this.jButtonActualizarLunaSistemaSolar.setText("Actualizar");
        this.jButtonEliminarLunaSistemaSolar.setText("Eliminar");
        this.jButtonCancelarLunaSistemaSolar.setText("Cancelar");
        this.jButtonGuardarCambiosLunaSistemaSolar.setText("Guardar");
		this.jButtonGuardarCambiosTablaLunaSistemaSolar.setText("Guardar");
		this.jButtonCerrarLunaSistemaSolar.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoLunaSistemaSolar,"nuevo_button","Nuevo",this.lunasistemasolarSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarLunaSistemaSolar,"modificar_button","Editar",this.lunasistemasolarSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarLunaSistemaSolar,"actualizar_button","Actualizar",this.lunasistemasolarSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarLunaSistemaSolar,"eliminar_button","Eliminar",this.lunasistemasolarSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarLunaSistemaSolar,"cancelar_button","Cancelar",this.lunasistemasolarSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosLunaSistemaSolar,"guardarcambios_button","Guardar",this.lunasistemasolarSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaLunaSistemaSolar,"guardarcambiostabla_button","Guardar",this.lunasistemasolarSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarLunaSistemaSolar,"cerrar_button","Salir",this.lunasistemasolarSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoLunaSistemaSolar.setToolTipText("Nuevo"+" "+LunaSistemaSolarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarLunaSistemaSolar.setToolTipText("Editar"+" "+LunaSistemaSolarConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarLunaSistemaSolar.setToolTipText("Actualizar"+" "+LunaSistemaSolarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarLunaSistemaSolar.setToolTipText("Eliminar)"+" "+LunaSistemaSolarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarLunaSistemaSolar.setToolTipText("Cancelar"+" "+LunaSistemaSolarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosLunaSistemaSolar.setToolTipText("Guardar"+" "+LunaSistemaSolarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaLunaSistemaSolar.setToolTipText("Guardar"+" "+LunaSistemaSolarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarLunaSistemaSolar.setToolTipText("Salir"+" "+LunaSistemaSolarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoLunaSistemaSolar";
		inputMap = this.jButtonNuevoLunaSistemaSolar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoLunaSistemaSolar.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoLunaSistemaSolar"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarLunaSistemaSolar";
		inputMap = this.jButtonActualizarLunaSistemaSolar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarLunaSistemaSolar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarLunaSistemaSolar"));
		
		//ELIMINAR
		sMapKey = "EliminarLunaSistemaSolar";
		inputMap = this.jButtonEliminarLunaSistemaSolar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarLunaSistemaSolar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarLunaSistemaSolar"));
		
		//CANCELAR	
		sMapKey = "CancelarLunaSistemaSolar";
		inputMap = this.jButtonCancelarLunaSistemaSolar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarLunaSistemaSolar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarLunaSistemaSolar"));
		
		//CERRAR		
		sMapKey = "CerrarLunaSistemaSolar";
		inputMap = this.jButtonCerrarLunaSistemaSolar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarLunaSistemaSolar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarLunaSistemaSolar"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaLunaSistemaSolar";
		inputMap = this.jButtonGuardarCambiosTablaLunaSistemaSolar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaLunaSistemaSolar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaLunaSistemaSolar"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoLunaSistemaSolar = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoLunaSistemaSolar.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoLunaSistemaSolar.setToolTipText("Nuevo LunaSistemaSolar");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarLunaSistemaSolar = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarLunaSistemaSolar.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarLunaSistemaSolar.setToolTipText("Sin Cerrar Ventana LunaSistemaSolar");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeLunaSistemaSolar = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeLunaSistemaSolar.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeLunaSistemaSolar.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesLunaSistemaSolar = new JComboBoxMe();
		//this.jComboBoxTiposAccionesLunaSistemaSolar.setText("Accion");
		this.jComboBoxTiposAccionesLunaSistemaSolar.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioLunaSistemaSolar = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioLunaSistemaSolar.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioLunaSistemaSolar.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesLunaSistemaSolar = new JLabelMe();
		
		this.jLabelAccionesLunaSistemaSolar.setText("Acciones");		
		this.jLabelAccionesLunaSistemaSolar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesLunaSistemaSolar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesLunaSistemaSolar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposLunaSistemaSolar();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysLunaSistemaSolar();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesLunaSistemaSolar=new JTabbedPane();
		this.jTabbedPaneRelacionesLunaSistemaSolar.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesLunaSistemaSolar,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesLunaSistemaSolar.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesLunaSistemaSolar.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesLunaSistemaSolar.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioLunaSistemaSolar.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioLunaSistemaSolar.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioLunaSistemaSolar.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioLunaSistemaSolar, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposLunaSistemaSolar = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosLunaSistemaSolar = new GridBagLayout();
		
		this.jPanelCamposLunaSistemaSolar.setLayout(gridaBagLayoutCamposLunaSistemaSolar);
		this.jPanelCamposOcultosLunaSistemaSolar.setLayout(gridaBagLayoutCamposOcultosLunaSistemaSolar);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
	this.gridBagConstraintsLunaSistemaSolar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLunaSistemaSolar.gridy = 0;
	this.gridBagConstraintsLunaSistemaSolar.gridx = 0;
	this.gridBagConstraintsLunaSistemaSolar.ipadx = 0;
	this.gridBagConstraintsLunaSistemaSolar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidLunaSistemaSolar.add(jLabelIdLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);



	this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
	this.gridBagConstraintsLunaSistemaSolar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLunaSistemaSolar.gridy = 0;
	this.gridBagConstraintsLunaSistemaSolar.gridx = 1;
	this.gridBagConstraintsLunaSistemaSolar.ipadx = 0;
	this.gridBagConstraintsLunaSistemaSolar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidLunaSistemaSolar.add(jTextFieldidLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);


	this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
	this.gridBagConstraintsLunaSistemaSolar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLunaSistemaSolar.gridy = 0;
	this.gridBagConstraintsLunaSistemaSolar.gridx = 0;
	this.gridBagConstraintsLunaSistemaSolar.ipadx = 0;
	this.gridBagConstraintsLunaSistemaSolar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_valoracionLunaSistemaSolar.add(jLabelid_tipo_valoracionLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
		//this.gridBagConstraintsLunaSistemaSolar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLunaSistemaSolar.gridy = 0;
		this.gridBagConstraintsLunaSistemaSolar.gridx = 2;
		this.gridBagConstraintsLunaSistemaSolar.ipadx = 0;
		this.gridBagConstraintsLunaSistemaSolar.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_valoracionLunaSistemaSolar.add(jButtonid_tipo_valoracionLunaSistemaSolarBusqueda, this.gridBagConstraintsLunaSistemaSolar);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
		//this.gridBagConstraintsLunaSistemaSolar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLunaSistemaSolar.gridy = 0;
		this.gridBagConstraintsLunaSistemaSolar.gridx = 3;
		this.gridBagConstraintsLunaSistemaSolar.ipadx = 0;
		this.gridBagConstraintsLunaSistemaSolar.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_valoracionLunaSistemaSolar.add(jButtonid_tipo_valoracionLunaSistemaSolarUpdate, this.gridBagConstraintsLunaSistemaSolar);
	}

	this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
	this.gridBagConstraintsLunaSistemaSolar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLunaSistemaSolar.gridy = 0;
	this.gridBagConstraintsLunaSistemaSolar.gridx = 1;
	this.gridBagConstraintsLunaSistemaSolar.ipadx = 0;
	this.gridBagConstraintsLunaSistemaSolar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_valoracionLunaSistemaSolar.add(jComboBoxid_tipo_valoracionLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);


	this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
	this.gridBagConstraintsLunaSistemaSolar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLunaSistemaSolar.gridy = 0;
	this.gridBagConstraintsLunaSistemaSolar.gridx = 0;
	this.gridBagConstraintsLunaSistemaSolar.ipadx = 0;
	this.gridBagConstraintsLunaSistemaSolar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoLunaSistemaSolar.add(jLabelcodigoLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
		//this.gridBagConstraintsLunaSistemaSolar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLunaSistemaSolar.gridy = 0;
		this.gridBagConstraintsLunaSistemaSolar.gridx = 2;
		this.gridBagConstraintsLunaSistemaSolar.ipadx = 0;
		this.gridBagConstraintsLunaSistemaSolar.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoLunaSistemaSolar.add(jButtoncodigoLunaSistemaSolarBusqueda, this.gridBagConstraintsLunaSistemaSolar);
	}

	this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
	this.gridBagConstraintsLunaSistemaSolar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLunaSistemaSolar.gridy = 0;
	this.gridBagConstraintsLunaSistemaSolar.gridx = 1;
	this.gridBagConstraintsLunaSistemaSolar.ipadx = 0;
	this.gridBagConstraintsLunaSistemaSolar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoLunaSistemaSolar.add(jTextFieldcodigoLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);


	this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
	this.gridBagConstraintsLunaSistemaSolar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLunaSistemaSolar.gridy = 0;
	this.gridBagConstraintsLunaSistemaSolar.gridx = 0;
	this.gridBagConstraintsLunaSistemaSolar.ipadx = 0;
	this.gridBagConstraintsLunaSistemaSolar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreLunaSistemaSolar.add(jLabelnombreLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
		//this.gridBagConstraintsLunaSistemaSolar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLunaSistemaSolar.gridy = 0;
		this.gridBagConstraintsLunaSistemaSolar.gridx = 2;
		this.gridBagConstraintsLunaSistemaSolar.ipadx = 0;
		this.gridBagConstraintsLunaSistemaSolar.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreLunaSistemaSolar.add(jButtonnombreLunaSistemaSolarBusqueda, this.gridBagConstraintsLunaSistemaSolar);
	}

	this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
	this.gridBagConstraintsLunaSistemaSolar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLunaSistemaSolar.gridy = 0;
	this.gridBagConstraintsLunaSistemaSolar.gridx = 1;
	this.gridBagConstraintsLunaSistemaSolar.ipadx = 0;
	this.gridBagConstraintsLunaSistemaSolar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreLunaSistemaSolar.add(jscrollPanenombreLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);


	this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
	this.gridBagConstraintsLunaSistemaSolar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLunaSistemaSolar.gridy = 0;
	this.gridBagConstraintsLunaSistemaSolar.gridx = 0;
	this.gridBagConstraintsLunaSistemaSolar.ipadx = 0;
	this.gridBagConstraintsLunaSistemaSolar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionLunaSistemaSolar.add(jLabeldescripcionLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
		//this.gridBagConstraintsLunaSistemaSolar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLunaSistemaSolar.gridy = 0;
		this.gridBagConstraintsLunaSistemaSolar.gridx = 2;
		this.gridBagConstraintsLunaSistemaSolar.ipadx = 0;
		this.gridBagConstraintsLunaSistemaSolar.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionLunaSistemaSolar.add(jButtondescripcionLunaSistemaSolarBusqueda, this.gridBagConstraintsLunaSistemaSolar);
	}

	this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
	this.gridBagConstraintsLunaSistemaSolar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLunaSistemaSolar.gridy = 0;
	this.gridBagConstraintsLunaSistemaSolar.gridx = 1;
	this.gridBagConstraintsLunaSistemaSolar.ipadx = 0;
	this.gridBagConstraintsLunaSistemaSolar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionLunaSistemaSolar.add(jscrollPanedescripcionLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
	this.gridBagConstraintsLunaSistemaSolar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsLunaSistemaSolar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsLunaSistemaSolar.gridy = iYPanelCamposLunaSistemaSolar;
	this.gridBagConstraintsLunaSistemaSolar.gridx = iXPanelCamposLunaSistemaSolar++;
	this.gridBagConstraintsLunaSistemaSolar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsLunaSistemaSolar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposLunaSistemaSolar.add(this.jPanelidLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);



	if(iXPanelCamposLunaSistemaSolar % 1==0) {
		iXPanelCamposLunaSistemaSolar=0;
		iYPanelCamposLunaSistemaSolar++;
	}
	this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
	this.gridBagConstraintsLunaSistemaSolar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsLunaSistemaSolar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsLunaSistemaSolar.gridy = iYPanelCamposLunaSistemaSolar;
	this.gridBagConstraintsLunaSistemaSolar.gridx = iXPanelCamposLunaSistemaSolar++;
	this.gridBagConstraintsLunaSistemaSolar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsLunaSistemaSolar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposLunaSistemaSolar.add(this.jPanelid_tipo_valoracionLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);



	if(iXPanelCamposLunaSistemaSolar % 1==0) {
		iXPanelCamposLunaSistemaSolar=0;
		iYPanelCamposLunaSistemaSolar++;
	}
	this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
	this.gridBagConstraintsLunaSistemaSolar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsLunaSistemaSolar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsLunaSistemaSolar.gridy = iYPanelCamposLunaSistemaSolar;
	this.gridBagConstraintsLunaSistemaSolar.gridx = iXPanelCamposLunaSistemaSolar++;
	this.gridBagConstraintsLunaSistemaSolar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsLunaSistemaSolar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposLunaSistemaSolar.add(this.jPanelcodigoLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);



	if(iXPanelCamposLunaSistemaSolar % 1==0) {
		iXPanelCamposLunaSistemaSolar=0;
		iYPanelCamposLunaSistemaSolar++;
	}
	this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
	this.gridBagConstraintsLunaSistemaSolar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsLunaSistemaSolar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsLunaSistemaSolar.gridy = iYPanelCamposLunaSistemaSolar;
	this.gridBagConstraintsLunaSistemaSolar.gridx = iXPanelCamposLunaSistemaSolar++;
	this.gridBagConstraintsLunaSistemaSolar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsLunaSistemaSolar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposLunaSistemaSolar.add(this.jPanelnombreLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);



	if(iXPanelCamposLunaSistemaSolar % 1==0) {
		iXPanelCamposLunaSistemaSolar=0;
		iYPanelCamposLunaSistemaSolar++;
	}
	this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
	this.gridBagConstraintsLunaSistemaSolar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsLunaSistemaSolar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsLunaSistemaSolar.gridy = iYPanelCamposLunaSistemaSolar;
	this.gridBagConstraintsLunaSistemaSolar.gridx = iXPanelCamposLunaSistemaSolar++;
	this.gridBagConstraintsLunaSistemaSolar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsLunaSistemaSolar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposLunaSistemaSolar.add(this.jPaneldescripcionLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);



	if(iXPanelCamposLunaSistemaSolar % 1==0) {
		iXPanelCamposLunaSistemaSolar=0;
		iYPanelCamposLunaSistemaSolar++;
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
			
		GridBagLayout gridaBagLayoutAccionesLunaSistemaSolar= new GridBagLayout();
		this.jPanelAccionesLunaSistemaSolar.setLayout(gridaBagLayoutAccionesLunaSistemaSolar);
		
		GridBagLayout gridaBagLayoutAccionesFormularioLunaSistemaSolar= new GridBagLayout();
		this.jPanelAccionesFormularioLunaSistemaSolar.setLayout(gridaBagLayoutAccionesFormularioLunaSistemaSolar);
		
		this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
		this.gridBagConstraintsLunaSistemaSolar.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsLunaSistemaSolar.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioLunaSistemaSolar.add(this.jComboBoxTiposAccionesFormularioLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);

		this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
		this.gridBagConstraintsLunaSistemaSolar.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsLunaSistemaSolar.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioLunaSistemaSolar.add(this.jCheckBoxPostAccionNuevoLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.lunasistemasolarSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
			this.gridBagConstraintsLunaSistemaSolar.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsLunaSistemaSolar.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioLunaSistemaSolar.add(this.jCheckBoxPostAccionSinCerrarLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.lunasistemasolarSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.lunasistemasolarSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
			this.gridBagConstraintsLunaSistemaSolar.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsLunaSistemaSolar.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioLunaSistemaSolar.add(this.jCheckBoxPostAccionSinMensajeLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
		this.gridBagConstraintsLunaSistemaSolar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLunaSistemaSolar.gridy = 0;
		this.gridBagConstraintsLunaSistemaSolar.gridx = iPosXAccion++;
			
		this.jPanelAccionesLunaSistemaSolar.add(this.jButtonModificarLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);							

		this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
		this.gridBagConstraintsLunaSistemaSolar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLunaSistemaSolar.gridy = 0;
		this.gridBagConstraintsLunaSistemaSolar.gridx =iPosXAccion++;
			
		this.jPanelAccionesLunaSistemaSolar.add(this.jButtonEliminarLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);
		
			
		this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
		this.gridBagConstraintsLunaSistemaSolar.gridy = 0;		
		this.gridBagConstraintsLunaSistemaSolar.gridx = iPosXAccion++;
		
		this.jPanelAccionesLunaSistemaSolar.add(this.jButtonActualizarLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);


		this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
		this.gridBagConstraintsLunaSistemaSolar.gridy = 0;		
		this.gridBagConstraintsLunaSistemaSolar.gridx = iPosXAccion++;
		
		this.jPanelAccionesLunaSistemaSolar.add(this.jButtonGuardarCambiosLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);	
		
		this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
		this.gridBagConstraintsLunaSistemaSolar.gridy = 0;		
		this.gridBagConstraintsLunaSistemaSolar.gridx =iPosXAccion++;
		
		this.jPanelAccionesLunaSistemaSolar.add(this.jButtonCancelarLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutLunaSistemaSolar = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutLunaSistemaSolar);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.lunasistemasolarSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();						
			this.gridBagConstraintsLunaSistemaSolar.gridy = iGridyPrincipal++;
			this.gridBagConstraintsLunaSistemaSolar.gridx = 0;		
			//this.gridBagConstraintsLunaSistemaSolar.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLunaSistemaSolar.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsLunaSistemaSolar.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
		this.gridBagConstraintsLunaSistemaSolar.gridy =iGridyPrincipal++;
		this.gridBagConstraintsLunaSistemaSolar.gridx =0;
		this.gridBagConstraintsLunaSistemaSolar.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsLunaSistemaSolar.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(LunaSistemaSolarJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleLunaSistemaSolar = new LunaSistemaSolarBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Luna Sistema Solar DATOS");
			
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
			
	        //this.setTitle("[FOR] - Luna Sistema Solar DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Luna Sistema Solar Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			LunaSistemaSolarModel lunasistemasolarModel=new LunaSistemaSolarModel(this);
			
			//SI USARA CLASE INTERNA
			//LunaSistemaSolarModel.LunaSistemaSolarFocusTraversalPolicy lunasistemasolarFocusTraversalPolicy = lunasistemasolarModel.new LunaSistemaSolarFocusTraversalPolicy(this);
			
			//lunasistemasolarFocusTraversalPolicy.setlunasistemasolarJInternalFrame(this);
			
			this.setFocusTraversalPolicy(lunasistemasolarModel);
			
			
			this.jContentPaneDetalleLunaSistemaSolar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleLunaSistemaSolar = new GridBagLayout();	
			this.jContentPaneDetalleLunaSistemaSolar.setLayout(gridaBagLayoutDetalleLunaSistemaSolar);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosLunaSistemaSolar = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
				this.gridBagConstraintsLunaSistemaSolar.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsLunaSistemaSolar.gridx = 0;
					
				
				this.jContentPaneDetalleLunaSistemaSolar.add(jTtoolBarDetalleLunaSistemaSolar, gridBagConstraintsLunaSistemaSolar);								
				
}
			
			this.jScrollPanelDatosEdicionLunaSistemaSolar=   new JScrollPane(jContentPaneDetalleLunaSistemaSolar,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionLunaSistemaSolar.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionLunaSistemaSolar.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionLunaSistemaSolar.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralLunaSistemaSolar=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralLunaSistemaSolar.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralLunaSistemaSolar.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralLunaSistemaSolar.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
			
			
	        this.gridBagConstraintsLunaSistemaSolar.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsLunaSistemaSolar.gridx = 0;
	        
			this.jContentPaneDetalleLunaSistemaSolar.add(jPanelCamposLunaSistemaSolar, gridBagConstraintsLunaSistemaSolar);
			
			
			
			
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
						&& lunasistemasolarSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.lunasistemasolarSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsLunaSistemaSolar= new GridBagConstraints();
						this.gridBagConstraintsLunaSistemaSolar.gridy = iGridyRelaciones++;
						this.gridBagConstraintsLunaSistemaSolar.gridx = 0;
						this.jContentPaneDetalleLunaSistemaSolar.add(this.jTabbedPaneRelacionesLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesLunaSistemaSolar.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosLunaSistemaSolar.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
					this.gridBagConstraintsLunaSistemaSolar.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsLunaSistemaSolar.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsLunaSistemaSolar.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsLunaSistemaSolar.gridx = 0;
					
				
					this.jContentPaneDetalleLunaSistemaSolar.add(jPanelCamposOcultosLunaSistemaSolar, gridBagConstraintsLunaSistemaSolar);
				
					this.jPanelCamposOcultosLunaSistemaSolar.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
			this.gridBagConstraintsLunaSistemaSolar.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsLunaSistemaSolar.gridx = 0;
	        this.gridBagConstraintsLunaSistemaSolar.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleLunaSistemaSolar.add(this.jPanelAccionesFormularioLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);							
			
			
			
			this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
	        this.gridBagConstraintsLunaSistemaSolar.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsLunaSistemaSolar.gridx = 0;
	        
			
			this.jContentPaneDetalleLunaSistemaSolar.add(this.jPanelAccionesLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionLunaSistemaSolar);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionLunaSistemaSolar=   new JScrollPane(this.jPanelCamposLunaSistemaSolar,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionLunaSistemaSolar.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionLunaSistemaSolar.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionLunaSistemaSolar.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
			this.gridBagConstraintsLunaSistemaSolar.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsLunaSistemaSolar.gridx = 0;
			this.gridBagConstraintsLunaSistemaSolar.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsLunaSistemaSolar.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsLunaSistemaSolar.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
			this.gridBagConstraintsLunaSistemaSolar.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsLunaSistemaSolar.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);			
			
			this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
			this.gridBagConstraintsLunaSistemaSolar.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsLunaSistemaSolar.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
		this.gridBagConstraintsLunaSistemaSolar.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsLunaSistemaSolar.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);
			
			
		this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
		this.gridBagConstraintsLunaSistemaSolar.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsLunaSistemaSolar.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);
		
			
		this.gridBagConstraintsLunaSistemaSolar = new GridBagConstraints();
		this.gridBagConstraintsLunaSistemaSolar.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsLunaSistemaSolar.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesLunaSistemaSolar, this.gridBagConstraintsLunaSistemaSolar);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralLunaSistemaSolar;//jContentPane;
		
		return jScrollPanelDatosEdicionLunaSistemaSolar;
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
