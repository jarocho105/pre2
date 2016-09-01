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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.contabilidad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.contabilidad.util.PresuEstadoConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.*;
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
public class PresuEstadoDetalleFormJInternalFrame extends PresuEstadoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetallePresuEstado;
	
	protected JMenuBar jmenuBarDetallePresuEstado;
	
	protected JMenu jmenuDetallePresuEstado;
	protected JMenu jmenuDetalleArchivoPresuEstado;
	protected JMenu jmenuDetalleAccionesPresuEstado;
	protected JMenu jmenuDetalleDatosPresuEstado;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetallePresuEstado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPresuEstado;	
	protected GridBagConstraints gridBagConstraintsPresuEstado;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected PresuEstadoBeanSwingJInternalFrameAdditional jInternalFrameDetallePresuEstado;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public PresuEstadoSessionBean presuestadoSessionBean;
	
	
	
		
	
	public PresuEstadoLogic presuestadoLogic;
	
	public JScrollPane jScrollPanelDatosPresuEstado;
	public JScrollPane jScrollPanelDatosEdicionPresuEstado;
	public JScrollPane jScrollPanelDatosGeneralPresuEstado;
	
	protected JPanel jPanelCamposPresuEstado;    
	protected JPanel jPanelCamposOcultosPresuEstado;    	
	protected JPanel jPanelAccionesPresuEstado;
	protected JPanel jPanelAccionesFormularioPresuEstado;
    
	
	
	protected Integer iXPanelCamposPresuEstado=0;
	protected Integer iYPanelCamposPresuEstado=0;
	
	protected Integer iXPanelCamposOcultosPresuEstado=0;
	protected Integer iYPanelCamposOcultosPresuEstado=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoPresuEstado;
	public JButton jButtonModificarPresuEstado;
	public JButton jButtonActualizarPresuEstado;
    public JButton jButtonEliminarPresuEstado;
	public JButton jButtonCancelarPresuEstado;
    public JButton jButtonGuardarCambiosPresuEstado;
	public JButton jButtonGuardarCambiosTablaPresuEstado;
	protected JButton jButtonCerrarPresuEstado;
	
	
	protected JButton jButtonProcesarInformacionPresuEstado;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoPresuEstado;
	protected JCheckBox jCheckBoxPostAccionSinCerrarPresuEstado;
	protected JCheckBox jCheckBoxPostAccionSinMensajePresuEstado;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPresuEstado;
	protected JButton jButtonModificarToolBarPresuEstado;
	protected JButton jButtonActualizarToolBarPresuEstado;
    protected JButton jButtonEliminarToolBarPresuEstado;
	protected JButton jButtonCancelarToolBarPresuEstado;
    protected JButton jButtonGuardarCambiosToolBarPresuEstado;
	protected JButton jButtonGuardarCambiosTablaToolBarPresuEstado;
	protected JButton jButtonMostrarOcultarTablaToolBarPresuEstado;
	protected JButton jButtonCerrarToolBarPresuEstado;
	
	protected JButton jButtonProcesarInformacionToolBarPresuEstado;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPresuEstado;
	protected JMenuItem jMenuItemModificarPresuEstado;
	protected JMenuItem jMenuItemActualizarPresuEstado;
    protected JMenuItem jMenuItemEliminarPresuEstado;
	protected JMenuItem jMenuItemCancelarPresuEstado;
    protected JMenuItem jMenuItemGuardarCambiosPresuEstado;
	protected JMenuItem jMenuItemGuardarCambiosTablaPresuEstado;
	protected JMenuItem jMenuItemCerrarPresuEstado;
	protected JMenuItem jMenuItemDetalleCerrarPresuEstado;
	protected JMenuItem jMenuItemDetalleMostarOcultarPresuEstado;
	
	protected JMenuItem jMenuItemProcesarInformacionPresuEstado;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPresuEstado;
	protected JMenuItem jMenuItemMostrarOcultarPresuEstado;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPresuEstado;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPresuEstado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPresuEstado;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioPresuEstado;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidPresuEstado;
	public JLabel jLabelIdPresuEstado;
	public JTextFieldMe jTextFieldidPresuEstado;
	public JButton jButtonidPresuEstadoBusqueda= new JButtonMe();

	public JPanel jPanelnombrePresuEstado;
	public JLabel jLabelnombrePresuEstado;
	public JTextArea jTextAreanombrePresuEstado;
	public JScrollPane jscrollPanenombrePresuEstado;
	public JButton jButtonnombrePresuEstadoBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesPresuEstado;
	
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
	public int iHeightFormulario=286;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public PresuEstadoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposPresuEstado=new JPanel();
				this.jPanelAccionesFormularioPresuEstado=new JPanel();
				this.jmenuBarDetallePresuEstado=new JMenuBar();
				this.jTtoolBarDetallePresuEstado=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresuEstadoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("PresuEstado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public PresuEstadoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("PresuEstado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresuEstadoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PresuEstado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresuEstadoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PresuEstado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresuEstadoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PresuEstado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarPresuEstado() {
		return this.jButtonActualizarToolBarPresuEstado;
	}
	
	public JButton getjButtonEliminarToolBarPresuEstado() {
		return this.jButtonEliminarToolBarPresuEstado;
	}
	
	public JButton getjButtonCancelarToolBarPresuEstado() {
		return this.jButtonCancelarToolBarPresuEstado;
	}		
	
	public JButton getjButtonProcesarInformacionPresuEstado() {
		return this.jButtonProcesarInformacionPresuEstado;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPresuEstado)	{
		this.jButtonProcesarInformacionPresuEstado = jButtonProcesarInformacionPresuEstado;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPresuEstado() {
		return this.jComboBoxTiposAccionesPresuEstado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPresuEstado(
			JComboBox jComboBoxTiposRelacionesPresuEstado) {
		this.jComboBoxTiposRelacionesPresuEstado = jComboBoxTiposRelacionesPresuEstado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPresuEstado(
			JComboBox jComboBoxTiposAccionesPresuEstado) {
		this.jComboBoxTiposAccionesPresuEstado = jComboBoxTiposAccionesPresuEstado;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioPresuEstado() {
		return this.jComboBoxTiposAccionesFormularioPresuEstado;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioPresuEstado(
			JComboBox jComboBoxTiposAccionesFormularioPresuEstado) {
		this.jComboBoxTiposAccionesFormularioPresuEstado = jComboBoxTiposAccionesFormularioPresuEstado;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.presuestadoSessionBean=new PresuEstadoSessionBean();
		
		this.presuestadoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.presuestadoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.presuestadoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PresuEstadoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PresuEstadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PresuEstadoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.presuestadoSessionBean.getEsGuardarRelacionado()) {
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
	
		PresuEstadoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetallePresuEstado= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarPresuEstado=new JButtonMe();
				this.jButtonModificarToolBarPresuEstado=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarPresuEstado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarPresuEstado,this.jTtoolBarDetallePresuEstado,
							"actualizar","actualizar","Actualizar"+" "+PresuEstadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarPresuEstado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarPresuEstado,this.jTtoolBarDetallePresuEstado,
							"eliminar","eliminar","Eliminar"+" "+PresuEstadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarPresuEstado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarPresuEstado,this.jTtoolBarDetallePresuEstado,
							"cancelar","cancelar","Cancelar"+" "+PresuEstadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarPresuEstado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarPresuEstado,this.jTtoolBarDetallePresuEstado,
							"guardarcambios","guardarcambios","Guardar"+" "+PresuEstadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarPresuEstado,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarPresuEstado,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarPresuEstado,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetallePresuEstado=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetallePresuEstado=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoPresuEstado=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesPresuEstado=new JMenuMe("Acciones");
		this.jmenuDetalleDatosPresuEstado=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPresuEstado= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPresuEstado.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPresuEstado,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPresuEstado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarPresuEstado= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarPresuEstado.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarPresuEstado,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarPresuEstado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarPresuEstado= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarPresuEstado.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarPresuEstado,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarPresuEstado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarPresuEstado= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarPresuEstado.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarPresuEstado,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarPresuEstado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarPresuEstado= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarPresuEstado.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarPresuEstado,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarPresuEstado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosPresuEstado= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPresuEstado.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPresuEstado,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPresuEstado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPresuEstado= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPresuEstado.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPresuEstado,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPresuEstado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarPresuEstado= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarPresuEstado.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarPresuEstado,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarPresuEstado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPresuEstado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPresuEstado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPresuEstado,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPresuEstado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPresuEstado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPresuEstado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPresuEstado,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPresuEstado, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoPresuEstado.add(this.jMenuItemDetalleCerrarPresuEstado);
		
		this.jmenuDetalleAccionesPresuEstado.add(this.jMenuItemActualizarPresuEstado);
		this.jmenuDetalleAccionesPresuEstado.add(this.jMenuItemEliminarPresuEstado);
		this.jmenuDetalleAccionesPresuEstado.add(this.jMenuItemCancelarPresuEstado);		
		
		//this.jmenuDetalleDatosPresuEstado.add(this.jMenuItemDetalleAbrirOrderByPresuEstado);				
		this.jmenuDetalleDatosPresuEstado.add(this.jMenuItemDetalleMostarOcultarPresuEstado);				
				
		//this.jmenuDetalleAccionesPresuEstado.add(this.jMenuItemGuardarCambiosPresuEstado);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoPresuEstado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesPresuEstado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosPresuEstado, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetallePresuEstado.add(this.jmenuDetalleArchivoPresuEstado);		
		this.jmenuBarDetallePresuEstado.add(this.jmenuDetalleAccionesPresuEstado);		
		this.jmenuBarDetallePresuEstado.add(this.jmenuDetalleDatosPresuEstado);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetallePresuEstado);				
	}
	
	
	public void inicializarElementosCamposPresuEstado() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdPresuEstado = new JLabelMe();
		jLabelIdPresuEstado.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdPresuEstado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPresuEstado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPresuEstado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdPresuEstado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidPresuEstado = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidPresuEstado.setToolTipText(PresuEstadoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutPresuEstado= new GridBagLayout();

		this.jPanelidPresuEstado.setLayout(this.gridaBagLayoutPresuEstado);

		jTextFieldidPresuEstado = new JTextFieldMe();
		jTextFieldidPresuEstado.setText("Id");

		jTextFieldidPresuEstado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidPresuEstado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidPresuEstado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombrePresuEstado = new JLabelMe();
		this.jLabelnombrePresuEstado.setText(""+PresuEstadoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombrePresuEstado.setToolTipText("Nombre");
		this.jLabelnombrePresuEstado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombrePresuEstado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombrePresuEstado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombrePresuEstado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombrePresuEstado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombrePresuEstado.setToolTipText(PresuEstadoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutPresuEstado = new GridBagLayout();
		this.jPanelnombrePresuEstado.setLayout(this.gridaBagLayoutPresuEstado);


		jTextAreanombrePresuEstado= new JTextAreaMe();
		jTextAreanombrePresuEstado.setEnabled(false);
		jTextAreanombrePresuEstado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombrePresuEstado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombrePresuEstado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombrePresuEstado.setLineWrap(true);
		jTextAreanombrePresuEstado.setWrapStyleWord(true);
		jTextAreanombrePresuEstado.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombrePresuEstado.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombrePresuEstado,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombrePresuEstado = new JScrollPane(jTextAreanombrePresuEstado);
		jscrollPanenombrePresuEstado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombrePresuEstado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombrePresuEstado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombrePresuEstadoBusqueda= new JButtonMe();
		this.jButtonnombrePresuEstadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombrePresuEstadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombrePresuEstadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombrePresuEstadoBusqueda.setText("U");
		this.jButtonnombrePresuEstadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombrePresuEstadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombrePresuEstadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombrePresuEstado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombrePresuEstado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombrePresuEstadoBusqueda"));

		if(this.presuestadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombrePresuEstadoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysPresuEstado() {
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
		//this.jInternalFrameDetallePresuEstado = new PresuEstadoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Estado DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPresuEstado= new GridBagLayout();
		

		
		String sToolTipPresuEstado="";
		sToolTipPresuEstado=PresuEstadoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPresuEstado+="(Contabilidad.PresuEstado)";
		}
		
		if(!this.presuestadoSessionBean.getEsGuardarRelacionado()) {
			sToolTipPresuEstado+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoPresuEstado = new JButtonMe();
		this.jButtonModificarPresuEstado = new JButtonMe();
        this.jButtonActualizarPresuEstado = new JButtonMe();
        this.jButtonEliminarPresuEstado = new JButtonMe();
        this.jButtonCancelarPresuEstado = new JButtonMe();
        this.jButtonGuardarCambiosPresuEstado = new JButtonMe();
		this.jButtonGuardarCambiosTablaPresuEstado = new JButtonMe();
		this.jButtonCerrarPresuEstado = new JButtonMe();
		
		this.jScrollPanelDatosPresuEstado = new JScrollPane();   
        this.jScrollPanelDatosEdicionPresuEstado = new JScrollPane();
		this.jScrollPanelDatosGeneralPresuEstado = new JScrollPane();
				
		
		
		this.jPanelCamposPresuEstado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosPresuEstado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesPresuEstado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioPresuEstado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Estado";
		
		if(!this.presuestadoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPresuEstado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estados" + this.sPath));
		} else {
			this.jScrollPanelDatosPresuEstado.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionPresuEstado.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralPresuEstado.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposPresuEstado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposPresuEstado.setName("jPanelCamposPresuEstado"); 

		this.jPanelCamposOcultosPresuEstado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosPresuEstado.setName("jPanelCamposOcultosPresuEstado"); 

        this.jPanelAccionesPresuEstado.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPresuEstado.setToolTipText("Acciones");
        this.jPanelAccionesPresuEstado.setName("Acciones"); 

		this.jPanelAccionesFormularioPresuEstado.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioPresuEstado.setToolTipText("Acciones");
        this.jPanelAccionesFormularioPresuEstado.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionPresuEstado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPresuEstado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPresuEstado, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposPresuEstado, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosPresuEstado, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioPresuEstado, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoPresuEstado.setText("Nuevo");
		this.jButtonModificarPresuEstado.setText("Editar");
        this.jButtonActualizarPresuEstado.setText("Actualizar");
        this.jButtonEliminarPresuEstado.setText("Eliminar");
        this.jButtonCancelarPresuEstado.setText("Cancelar");
        this.jButtonGuardarCambiosPresuEstado.setText("Guardar");
		this.jButtonGuardarCambiosTablaPresuEstado.setText("Guardar");
		this.jButtonCerrarPresuEstado.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPresuEstado,"nuevo_button","Nuevo",this.presuestadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarPresuEstado,"modificar_button","Editar",this.presuestadoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarPresuEstado,"actualizar_button","Actualizar",this.presuestadoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarPresuEstado,"eliminar_button","Eliminar",this.presuestadoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarPresuEstado,"cancelar_button","Cancelar",this.presuestadoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosPresuEstado,"guardarcambios_button","Guardar",this.presuestadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPresuEstado,"guardarcambiostabla_button","Guardar",this.presuestadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPresuEstado,"cerrar_button","Salir",this.presuestadoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPresuEstado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarPresuEstado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosPresuEstado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPresuEstado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPresuEstado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarPresuEstado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarPresuEstado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarPresuEstado, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoPresuEstado.setToolTipText("Nuevo"+" "+PresuEstadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarPresuEstado.setToolTipText("Editar"+" "+PresuEstadoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarPresuEstado.setToolTipText("Actualizar"+" "+PresuEstadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarPresuEstado.setToolTipText("Eliminar)"+" "+PresuEstadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarPresuEstado.setToolTipText("Cancelar"+" "+PresuEstadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosPresuEstado.setToolTipText("Guardar"+" "+PresuEstadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaPresuEstado.setToolTipText("Guardar"+" "+PresuEstadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPresuEstado.setToolTipText("Salir"+" "+PresuEstadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPresuEstado";
		inputMap = this.jButtonNuevoPresuEstado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPresuEstado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPresuEstado"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarPresuEstado";
		inputMap = this.jButtonActualizarPresuEstado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarPresuEstado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarPresuEstado"));
		
		//ELIMINAR
		sMapKey = "EliminarPresuEstado";
		inputMap = this.jButtonEliminarPresuEstado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarPresuEstado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarPresuEstado"));
		
		//CANCELAR	
		sMapKey = "CancelarPresuEstado";
		inputMap = this.jButtonCancelarPresuEstado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarPresuEstado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarPresuEstado"));
		
		//CERRAR		
		sMapKey = "CerrarPresuEstado";
		inputMap = this.jButtonCerrarPresuEstado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPresuEstado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPresuEstado"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPresuEstado";
		inputMap = this.jButtonGuardarCambiosTablaPresuEstado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPresuEstado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPresuEstado"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoPresuEstado = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoPresuEstado.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoPresuEstado.setToolTipText("Nuevo PresuEstado");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoPresuEstado, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarPresuEstado = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarPresuEstado.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarPresuEstado.setToolTipText("Sin Cerrar Ventana PresuEstado");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarPresuEstado, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajePresuEstado = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajePresuEstado.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajePresuEstado.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajePresuEstado, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesPresuEstado = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPresuEstado.setText("Accion");
		this.jComboBoxTiposAccionesPresuEstado.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioPresuEstado = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioPresuEstado.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioPresuEstado.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesPresuEstado = new JLabelMe();
		
		this.jLabelAccionesPresuEstado.setText("Acciones");		
		this.jLabelAccionesPresuEstado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPresuEstado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPresuEstado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposPresuEstado();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysPresuEstado();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesPresuEstado=new JTabbedPane();
		this.jTabbedPaneRelacionesPresuEstado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesPresuEstado,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesPresuEstado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPresuEstado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPresuEstado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPresuEstado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioPresuEstado.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPresuEstado.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPresuEstado.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioPresuEstado, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposPresuEstado = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosPresuEstado = new GridBagLayout();
		
		this.jPanelCamposPresuEstado.setLayout(gridaBagLayoutCamposPresuEstado);
		this.jPanelCamposOcultosPresuEstado.setLayout(gridaBagLayoutCamposOcultosPresuEstado);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsPresuEstado = new GridBagConstraints();
	this.gridBagConstraintsPresuEstado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuEstado.gridy = 0;
	this.gridBagConstraintsPresuEstado.gridx = 0;
	this.gridBagConstraintsPresuEstado.ipadx = 0;
	this.gridBagConstraintsPresuEstado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidPresuEstado.add(jLabelIdPresuEstado, this.gridBagConstraintsPresuEstado);



	this.gridBagConstraintsPresuEstado = new GridBagConstraints();
	this.gridBagConstraintsPresuEstado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuEstado.gridy = 0;
	this.gridBagConstraintsPresuEstado.gridx = 1;
	this.gridBagConstraintsPresuEstado.ipadx = 0;
	this.gridBagConstraintsPresuEstado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidPresuEstado.add(jTextFieldidPresuEstado, this.gridBagConstraintsPresuEstado);


	this.gridBagConstraintsPresuEstado = new GridBagConstraints();
	this.gridBagConstraintsPresuEstado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuEstado.gridy = 0;
	this.gridBagConstraintsPresuEstado.gridx = 0;
	this.gridBagConstraintsPresuEstado.ipadx = 0;
	this.gridBagConstraintsPresuEstado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombrePresuEstado.add(jLabelnombrePresuEstado, this.gridBagConstraintsPresuEstado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresuEstado = new GridBagConstraints();
		//this.gridBagConstraintsPresuEstado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuEstado.gridy = 0;
		this.gridBagConstraintsPresuEstado.gridx = 2;
		this.gridBagConstraintsPresuEstado.ipadx = 0;
		this.gridBagConstraintsPresuEstado.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombrePresuEstado.add(jButtonnombrePresuEstadoBusqueda, this.gridBagConstraintsPresuEstado);
	}

	this.gridBagConstraintsPresuEstado = new GridBagConstraints();
	this.gridBagConstraintsPresuEstado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuEstado.gridy = 0;
	this.gridBagConstraintsPresuEstado.gridx = 1;
	this.gridBagConstraintsPresuEstado.ipadx = 0;
	this.gridBagConstraintsPresuEstado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombrePresuEstado.add(jscrollPanenombrePresuEstado, this.gridBagConstraintsPresuEstado);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsPresuEstado = new GridBagConstraints();
	this.gridBagConstraintsPresuEstado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresuEstado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresuEstado.gridy = iYPanelCamposPresuEstado;
	this.gridBagConstraintsPresuEstado.gridx = iXPanelCamposPresuEstado++;
	this.gridBagConstraintsPresuEstado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresuEstado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresuEstado.add(this.jPanelidPresuEstado, this.gridBagConstraintsPresuEstado);



	if(iXPanelCamposPresuEstado % 1==0) {
		iXPanelCamposPresuEstado=0;
		iYPanelCamposPresuEstado++;
	}
	this.gridBagConstraintsPresuEstado = new GridBagConstraints();
	this.gridBagConstraintsPresuEstado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresuEstado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresuEstado.gridy = iYPanelCamposPresuEstado;
	this.gridBagConstraintsPresuEstado.gridx = iXPanelCamposPresuEstado++;
	this.gridBagConstraintsPresuEstado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresuEstado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresuEstado.add(this.jPanelnombrePresuEstado, this.gridBagConstraintsPresuEstado);



	if(iXPanelCamposPresuEstado % 1==0) {
		iXPanelCamposPresuEstado=0;
		iYPanelCamposPresuEstado++;
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
			
		GridBagLayout gridaBagLayoutAccionesPresuEstado= new GridBagLayout();
		this.jPanelAccionesPresuEstado.setLayout(gridaBagLayoutAccionesPresuEstado);
		
		GridBagLayout gridaBagLayoutAccionesFormularioPresuEstado= new GridBagLayout();
		this.jPanelAccionesFormularioPresuEstado.setLayout(gridaBagLayoutAccionesFormularioPresuEstado);
		
		this.gridBagConstraintsPresuEstado = new GridBagConstraints();
		this.gridBagConstraintsPresuEstado.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPresuEstado.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPresuEstado.add(this.jComboBoxTiposAccionesFormularioPresuEstado, this.gridBagConstraintsPresuEstado);

		this.gridBagConstraintsPresuEstado = new GridBagConstraints();
		this.gridBagConstraintsPresuEstado.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPresuEstado.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPresuEstado.add(this.jCheckBoxPostAccionNuevoPresuEstado, this.gridBagConstraintsPresuEstado);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.presuestadoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsPresuEstado = new GridBagConstraints();
			this.gridBagConstraintsPresuEstado.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPresuEstado.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPresuEstado.add(this.jCheckBoxPostAccionSinCerrarPresuEstado, this.gridBagConstraintsPresuEstado);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.presuestadoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.presuestadoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsPresuEstado = new GridBagConstraints();
			this.gridBagConstraintsPresuEstado.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPresuEstado.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPresuEstado.add(this.jCheckBoxPostAccionSinMensajePresuEstado, this.gridBagConstraintsPresuEstado);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsPresuEstado = new GridBagConstraints();
		this.gridBagConstraintsPresuEstado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuEstado.gridy = 0;
		this.gridBagConstraintsPresuEstado.gridx = iPosXAccion++;
			
		this.jPanelAccionesPresuEstado.add(this.jButtonModificarPresuEstado, this.gridBagConstraintsPresuEstado);							

		this.gridBagConstraintsPresuEstado = new GridBagConstraints();
		this.gridBagConstraintsPresuEstado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuEstado.gridy = 0;
		this.gridBagConstraintsPresuEstado.gridx =iPosXAccion++;
			
		this.jPanelAccionesPresuEstado.add(this.jButtonEliminarPresuEstado, this.gridBagConstraintsPresuEstado);
		
			
		this.gridBagConstraintsPresuEstado = new GridBagConstraints();
		this.gridBagConstraintsPresuEstado.gridy = 0;		
		this.gridBagConstraintsPresuEstado.gridx = iPosXAccion++;
		
		this.jPanelAccionesPresuEstado.add(this.jButtonActualizarPresuEstado, this.gridBagConstraintsPresuEstado);


		this.gridBagConstraintsPresuEstado = new GridBagConstraints();
		this.gridBagConstraintsPresuEstado.gridy = 0;		
		this.gridBagConstraintsPresuEstado.gridx = iPosXAccion++;
		
		this.jPanelAccionesPresuEstado.add(this.jButtonGuardarCambiosPresuEstado, this.gridBagConstraintsPresuEstado);	
		
		this.gridBagConstraintsPresuEstado = new GridBagConstraints();
		this.gridBagConstraintsPresuEstado.gridy = 0;		
		this.gridBagConstraintsPresuEstado.gridx =iPosXAccion++;
		
		this.jPanelAccionesPresuEstado.add(this.jButtonCancelarPresuEstado, this.gridBagConstraintsPresuEstado);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPresuEstado = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPresuEstado);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.presuestadoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPresuEstado = new GridBagConstraints();						
			this.gridBagConstraintsPresuEstado.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPresuEstado.gridx = 0;		
			//this.gridBagConstraintsPresuEstado.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuEstado.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPresuEstado.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsPresuEstado = new GridBagConstraints();
		this.gridBagConstraintsPresuEstado.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPresuEstado.gridx =0;
		this.gridBagConstraintsPresuEstado.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPresuEstado.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPresuEstado, this.gridBagConstraintsPresuEstado);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(PresuEstadoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetallePresuEstado = new PresuEstadoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Estado DATOS");
			
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
			
	        //this.setTitle("[FOR] - Estado DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			PresuEstadoModel presuestadoModel=new PresuEstadoModel(this);
			
			//SI USARA CLASE INTERNA
			//PresuEstadoModel.PresuEstadoFocusTraversalPolicy presuestadoFocusTraversalPolicy = presuestadoModel.new PresuEstadoFocusTraversalPolicy(this);
			
			//presuestadoFocusTraversalPolicy.setpresuestadoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(presuestadoModel);
			
			
			this.jContentPaneDetallePresuEstado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetallePresuEstado = new GridBagLayout();	
			this.jContentPaneDetallePresuEstado.setLayout(gridaBagLayoutDetallePresuEstado);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPresuEstado = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsPresuEstado = new GridBagConstraints();
				this.gridBagConstraintsPresuEstado.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsPresuEstado.gridx = 0;
					
				
				this.jContentPaneDetallePresuEstado.add(jTtoolBarDetallePresuEstado, gridBagConstraintsPresuEstado);								
				
}
			
			this.jScrollPanelDatosEdicionPresuEstado=   new JScrollPane(jContentPaneDetallePresuEstado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPresuEstado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPresuEstado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPresuEstado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralPresuEstado=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPresuEstado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPresuEstado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPresuEstado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPresuEstado = new GridBagConstraints();
			
			
	        this.gridBagConstraintsPresuEstado.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsPresuEstado.gridx = 0;
	        
			this.jContentPaneDetallePresuEstado.add(jPanelCamposPresuEstado, gridBagConstraintsPresuEstado);
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			
			;
			//}
						
			this.conMaximoRelaciones=false;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
			}									
			
			//CARGA O NO CARGA RELACIONADOS(MAESTRO DETALLE)
									  // ABAJO VIENE DE PARAMETRO GENERAL USUARIO
			if(conMaximoRelaciones) { // && this.conFuncionalidadRelaciones) {
				if(!this.conCargarMinimo) {
					if(cargarRelaciones 
						&& presuestadoSessionBean.getConGuardarRelaciones()
						) {
					
					if(this.presuestadoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsPresuEstado= new GridBagConstraints();
						this.gridBagConstraintsPresuEstado.gridy = iGridyRelaciones++;
						this.gridBagConstraintsPresuEstado.gridx = 0;
						this.jContentPaneDetallePresuEstado.add(this.jTabbedPaneRelacionesPresuEstado, this.gridBagConstraintsPresuEstado);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesPresuEstado.setVisible(false);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosPresuEstado.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsPresuEstado = new GridBagConstraints();
					this.gridBagConstraintsPresuEstado.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsPresuEstado.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsPresuEstado.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsPresuEstado.gridx = 0;
					
				
					this.jContentPaneDetallePresuEstado.add(jPanelCamposOcultosPresuEstado, gridBagConstraintsPresuEstado);
				
					this.jPanelCamposOcultosPresuEstado.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsPresuEstado = new GridBagConstraints();
			this.gridBagConstraintsPresuEstado.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsPresuEstado.gridx = 0;
	        this.gridBagConstraintsPresuEstado.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetallePresuEstado.add(this.jPanelAccionesFormularioPresuEstado, this.gridBagConstraintsPresuEstado);							
			
			
			
			this.gridBagConstraintsPresuEstado = new GridBagConstraints();
	        this.gridBagConstraintsPresuEstado.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsPresuEstado.gridx = 0;
	        
			
			this.jContentPaneDetallePresuEstado.add(this.jPanelAccionesPresuEstado, this.gridBagConstraintsPresuEstado);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionPresuEstado);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionPresuEstado=   new JScrollPane(this.jPanelCamposPresuEstado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPresuEstado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPresuEstado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPresuEstado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsPresuEstado = new GridBagConstraints();
			this.gridBagConstraintsPresuEstado.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsPresuEstado.gridx = 0;
			this.gridBagConstraintsPresuEstado.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsPresuEstado.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsPresuEstado.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionPresuEstado, this.gridBagConstraintsPresuEstado);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsPresuEstado = new GridBagConstraints();
			this.gridBagConstraintsPresuEstado.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPresuEstado.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioPresuEstado, this.gridBagConstraintsPresuEstado);			
			
			this.gridBagConstraintsPresuEstado = new GridBagConstraints();
			this.gridBagConstraintsPresuEstado.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPresuEstado.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesPresuEstado, this.gridBagConstraintsPresuEstado);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsPresuEstado = new GridBagConstraints();
		this.gridBagConstraintsPresuEstado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresuEstado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPresuEstado, this.gridBagConstraintsPresuEstado);
			
			
		this.gridBagConstraintsPresuEstado = new GridBagConstraints();
		this.gridBagConstraintsPresuEstado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresuEstado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPresuEstado, this.gridBagConstraintsPresuEstado);
		
			
		this.gridBagConstraintsPresuEstado = new GridBagConstraints();
		this.gridBagConstraintsPresuEstado.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPresuEstado.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPresuEstado, this.gridBagConstraintsPresuEstado);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralPresuEstado;//jContentPane;
		
		return jScrollPanelDatosEdicionPresuEstado;
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
