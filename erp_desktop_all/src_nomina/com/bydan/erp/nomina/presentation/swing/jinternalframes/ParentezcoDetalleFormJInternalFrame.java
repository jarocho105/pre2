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


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.nomina.util.ParentezcoConstantesFunciones;

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
public class ParentezcoDetalleFormJInternalFrame extends ParentezcoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleParentezco;
	
	protected JMenuBar jmenuBarDetalleParentezco;
	
	protected JMenu jmenuDetalleParentezco;
	protected JMenu jmenuDetalleArchivoParentezco;
	protected JMenu jmenuDetalleAccionesParentezco;
	protected JMenu jmenuDetalleDatosParentezco;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleParentezco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutParentezco;	
	protected GridBagConstraints gridBagConstraintsParentezco;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ParentezcoBeanSwingJInternalFrameAdditional jInternalFrameDetalleParentezco;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public ParentezcoSessionBean parentezcoSessionBean;
	
	

	public ReferenciaBeanSwingJInternalFrame referenciaBeanSwingJInternalFrame=null;
	public ReferenciaBeanSwingJInternalFrame referenciaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteReferencia=false;
	public ReferenciaSessionBean referenciaSessionBean;
	
		
	
	public ParentezcoLogic parentezcoLogic;
	
	public JScrollPane jScrollPanelDatosParentezco;
	public JScrollPane jScrollPanelDatosEdicionParentezco;
	public JScrollPane jScrollPanelDatosGeneralParentezco;
	
	protected JPanel jPanelCamposParentezco;    
	protected JPanel jPanelCamposOcultosParentezco;    	
	protected JPanel jPanelAccionesParentezco;
	protected JPanel jPanelAccionesFormularioParentezco;
    
	
	
	protected Integer iXPanelCamposParentezco=0;
	protected Integer iYPanelCamposParentezco=0;
	
	protected Integer iXPanelCamposOcultosParentezco=0;
	protected Integer iYPanelCamposOcultosParentezco=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoParentezco;
	public JButton jButtonModificarParentezco;
	public JButton jButtonActualizarParentezco;
    public JButton jButtonEliminarParentezco;
	public JButton jButtonCancelarParentezco;
    public JButton jButtonGuardarCambiosParentezco;
	public JButton jButtonGuardarCambiosTablaParentezco;
	protected JButton jButtonCerrarParentezco;
	
	
	protected JButton jButtonProcesarInformacionParentezco;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoParentezco;
	protected JCheckBox jCheckBoxPostAccionSinCerrarParentezco;
	protected JCheckBox jCheckBoxPostAccionSinMensajeParentezco;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarParentezco;
	protected JButton jButtonModificarToolBarParentezco;
	protected JButton jButtonActualizarToolBarParentezco;
    protected JButton jButtonEliminarToolBarParentezco;
	protected JButton jButtonCancelarToolBarParentezco;
    protected JButton jButtonGuardarCambiosToolBarParentezco;
	protected JButton jButtonGuardarCambiosTablaToolBarParentezco;
	protected JButton jButtonMostrarOcultarTablaToolBarParentezco;
	protected JButton jButtonCerrarToolBarParentezco;
	
	protected JButton jButtonProcesarInformacionToolBarParentezco;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoParentezco;
	protected JMenuItem jMenuItemModificarParentezco;
	protected JMenuItem jMenuItemActualizarParentezco;
    protected JMenuItem jMenuItemEliminarParentezco;
	protected JMenuItem jMenuItemCancelarParentezco;
    protected JMenuItem jMenuItemGuardarCambiosParentezco;
	protected JMenuItem jMenuItemGuardarCambiosTablaParentezco;
	protected JMenuItem jMenuItemCerrarParentezco;
	protected JMenuItem jMenuItemDetalleCerrarParentezco;
	protected JMenuItem jMenuItemDetalleMostarOcultarParentezco;
	
	protected JMenuItem jMenuItemProcesarInformacionParentezco;
	protected JMenuItem jMenuItemNuevoGuardarCambiosParentezco;
	protected JMenuItem jMenuItemMostrarOcultarParentezco;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesParentezco;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesParentezco;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesParentezco;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioParentezco;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidParentezco;
	public JLabel jLabelIdParentezco;
	public JLabel jLabelidParentezco;
	public JButton jButtonidParentezcoBusqueda= new JButtonMe();

	public JPanel jPanelcodigoParentezco;
	public JLabel jLabelcodigoParentezco;
	public JTextField jTextFieldcodigoParentezco;
	public JButton jButtoncodigoParentezcoBusqueda= new JButtonMe();

	public JPanel jPanelnombreParentezco;
	public JLabel jLabelnombreParentezco;
	public JTextArea jTextAreanombreParentezco;
	public JScrollPane jscrollPanenombreParentezco;
	public JButton jButtonnombreParentezcoBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesParentezco;
	
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
	
	public ParentezcoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposParentezco=new JPanel();
				this.jPanelAccionesFormularioParentezco=new JPanel();
				this.jmenuBarDetalleParentezco=new JMenuBar();
				this.jTtoolBarDetalleParentezco=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParentezcoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Parentezco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ParentezcoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Parentezco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParentezcoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Parentezco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParentezcoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Parentezco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParentezcoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Parentezco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarParentezco() {
		return this.jButtonActualizarToolBarParentezco;
	}
	
	public JButton getjButtonEliminarToolBarParentezco() {
		return this.jButtonEliminarToolBarParentezco;
	}
	
	public JButton getjButtonCancelarToolBarParentezco() {
		return this.jButtonCancelarToolBarParentezco;
	}		
	
	public JButton getjButtonProcesarInformacionParentezco() {
		return this.jButtonProcesarInformacionParentezco;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionParentezco)	{
		this.jButtonProcesarInformacionParentezco = jButtonProcesarInformacionParentezco;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesParentezco() {
		return this.jComboBoxTiposAccionesParentezco;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesParentezco(
			JComboBox jComboBoxTiposRelacionesParentezco) {
		this.jComboBoxTiposRelacionesParentezco = jComboBoxTiposRelacionesParentezco;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesParentezco(
			JComboBox jComboBoxTiposAccionesParentezco) {
		this.jComboBoxTiposAccionesParentezco = jComboBoxTiposAccionesParentezco;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioParentezco() {
		return this.jComboBoxTiposAccionesFormularioParentezco;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioParentezco(
			JComboBox jComboBoxTiposAccionesFormularioParentezco) {
		this.jComboBoxTiposAccionesFormularioParentezco = jComboBoxTiposAccionesFormularioParentezco;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.parentezcoSessionBean=new ParentezcoSessionBean();
		
		this.parentezcoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parentezcoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.parentezcoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.referenciaSessionBean=new ReferenciaSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ParentezcoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ParentezcoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ParentezcoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Parentezco MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.parentezcoSessionBean.getEsGuardarRelacionado()) {
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
	
		ParentezcoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleParentezco= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarParentezco=new JButtonMe();
				this.jButtonModificarToolBarParentezco=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarParentezco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarParentezco,this.jTtoolBarDetalleParentezco,
							"actualizar","actualizar","Actualizar"+" "+ParentezcoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarParentezco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarParentezco,this.jTtoolBarDetalleParentezco,
							"eliminar","eliminar","Eliminar"+" "+ParentezcoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarParentezco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarParentezco,this.jTtoolBarDetalleParentezco,
							"cancelar","cancelar","Cancelar"+" "+ParentezcoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarParentezco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarParentezco,this.jTtoolBarDetalleParentezco,
							"guardarcambios","guardarcambios","Guardar"+" "+ParentezcoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarParentezco,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarParentezco,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarParentezco,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleParentezco=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleParentezco=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoParentezco=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesParentezco=new JMenuMe("Acciones");
		this.jmenuDetalleDatosParentezco=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoParentezco= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoParentezco.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoParentezco,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoParentezco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarParentezco= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarParentezco.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarParentezco,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarParentezco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarParentezco= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarParentezco.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarParentezco,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarParentezco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarParentezco= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarParentezco.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarParentezco,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarParentezco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarParentezco= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarParentezco.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarParentezco,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarParentezco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosParentezco= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosParentezco.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosParentezco,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosParentezco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarParentezco= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarParentezco.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarParentezco,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarParentezco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarParentezco= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarParentezco.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarParentezco,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarParentezco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarParentezco= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarParentezco.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarParentezco,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarParentezco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarParentezco= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarParentezco.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarParentezco,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarParentezco, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoParentezco.add(this.jMenuItemDetalleCerrarParentezco);
		
		this.jmenuDetalleAccionesParentezco.add(this.jMenuItemActualizarParentezco);
		this.jmenuDetalleAccionesParentezco.add(this.jMenuItemEliminarParentezco);
		this.jmenuDetalleAccionesParentezco.add(this.jMenuItemCancelarParentezco);		
		
		//this.jmenuDetalleDatosParentezco.add(this.jMenuItemDetalleAbrirOrderByParentezco);				
		this.jmenuDetalleDatosParentezco.add(this.jMenuItemDetalleMostarOcultarParentezco);				
				
		//this.jmenuDetalleAccionesParentezco.add(this.jMenuItemGuardarCambiosParentezco);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoParentezco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesParentezco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosParentezco, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleParentezco.add(this.jmenuDetalleArchivoParentezco);		
		this.jmenuBarDetalleParentezco.add(this.jmenuDetalleAccionesParentezco);		
		this.jmenuBarDetalleParentezco.add(this.jmenuDetalleDatosParentezco);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleParentezco, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleParentezco.add(this.jmenuDetalleParentezco);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleParentezco);				
	}
	
	
	public void inicializarElementosCamposParentezco() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdParentezco = new JLabelMe();
		jLabelIdParentezco.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdParentezco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdParentezco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdParentezco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdParentezco,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidParentezco = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidParentezco.setToolTipText(ParentezcoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutParentezco= new GridBagLayout();

		this.jPanelidParentezco.setLayout(this.gridaBagLayoutParentezco);

		jLabelidParentezco = new JLabel();
		jLabelidParentezco.setText("Id");

		jLabelidParentezco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidParentezco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidParentezco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoParentezco = new JLabelMe();
		this.jLabelcodigoParentezco.setText(""+ParentezcoConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoParentezco.setToolTipText("Codigo");
		this.jLabelcodigoParentezco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoParentezco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoParentezco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoParentezco,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoParentezco=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoParentezco.setToolTipText(ParentezcoConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutParentezco = new GridBagLayout();
		this.jPanelcodigoParentezco.setLayout(this.gridaBagLayoutParentezco);


		jTextFieldcodigoParentezco= new JTextFieldMe();

		jTextFieldcodigoParentezco.setEnabled(false);
		jTextFieldcodigoParentezco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoParentezco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoParentezco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoParentezco,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoParentezcoBusqueda= new JButtonMe();
		this.jButtoncodigoParentezcoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoParentezcoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoParentezcoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoParentezcoBusqueda.setText("U");
		this.jButtoncodigoParentezcoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoParentezcoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoParentezcoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoParentezco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoParentezco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoParentezcoBusqueda"));

		if(this.parentezcoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoParentezcoBusqueda.setVisible(false);		}


					
		this.jLabelnombreParentezco = new JLabelMe();
		this.jLabelnombreParentezco.setText(""+ParentezcoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreParentezco.setToolTipText("Nombre");
		this.jLabelnombreParentezco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreParentezco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreParentezco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreParentezco,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreParentezco=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreParentezco.setToolTipText(ParentezcoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutParentezco = new GridBagLayout();
		this.jPanelnombreParentezco.setLayout(this.gridaBagLayoutParentezco);


		jTextAreanombreParentezco= new JTextAreaMe();
		jTextAreanombreParentezco.setEnabled(false);
		jTextAreanombreParentezco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreParentezco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreParentezco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreParentezco.setLineWrap(true);
		jTextAreanombreParentezco.setWrapStyleWord(true);
		jTextAreanombreParentezco.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreParentezco.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreParentezco,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreParentezco = new JScrollPane(jTextAreanombreParentezco);
		jscrollPanenombreParentezco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreParentezco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreParentezco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreParentezcoBusqueda= new JButtonMe();
		this.jButtonnombreParentezcoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreParentezcoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreParentezcoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreParentezcoBusqueda.setText("U");
		this.jButtonnombreParentezcoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreParentezcoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreParentezcoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreParentezco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreParentezco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreParentezcoBusqueda"));

		if(this.parentezcoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreParentezcoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysParentezco() {
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
		//this.jInternalFrameDetalleParentezco = new ParentezcoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Parentezco DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutParentezco= new GridBagLayout();
		

		
		String sToolTipParentezco="";
		sToolTipParentezco=ParentezcoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipParentezco+="(Nomina.Parentezco)";
		}
		
		if(!this.parentezcoSessionBean.getEsGuardarRelacionado()) {
			sToolTipParentezco+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoParentezco = new JButtonMe();
		this.jButtonModificarParentezco = new JButtonMe();
        this.jButtonActualizarParentezco = new JButtonMe();
        this.jButtonEliminarParentezco = new JButtonMe();
        this.jButtonCancelarParentezco = new JButtonMe();
        this.jButtonGuardarCambiosParentezco = new JButtonMe();
		this.jButtonGuardarCambiosTablaParentezco = new JButtonMe();
		this.jButtonCerrarParentezco = new JButtonMe();
		
		this.jScrollPanelDatosParentezco = new JScrollPane();   
        this.jScrollPanelDatosEdicionParentezco = new JScrollPane();
		this.jScrollPanelDatosGeneralParentezco = new JScrollPane();
				
		
		
		this.jPanelCamposParentezco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosParentezco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesParentezco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioParentezco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Parentezco";
		
		if(!this.parentezcoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosParentezco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parentezcos" + this.sPath));
		} else {
			this.jScrollPanelDatosParentezco.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionParentezco.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralParentezco.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposParentezco.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposParentezco.setName("jPanelCamposParentezco"); 

		this.jPanelCamposOcultosParentezco.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosParentezco.setName("jPanelCamposOcultosParentezco"); 

        this.jPanelAccionesParentezco.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesParentezco.setToolTipText("Acciones");
        this.jPanelAccionesParentezco.setName("Acciones"); 

		this.jPanelAccionesFormularioParentezco.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioParentezco.setToolTipText("Acciones");
        this.jPanelAccionesFormularioParentezco.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionParentezco, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralParentezco, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosParentezco, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposParentezco, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosParentezco, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioParentezco, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoParentezco.setText("Nuevo");
		this.jButtonModificarParentezco.setText("Editar");
        this.jButtonActualizarParentezco.setText("Actualizar");
        this.jButtonEliminarParentezco.setText("Eliminar");
        this.jButtonCancelarParentezco.setText("Cancelar");
        this.jButtonGuardarCambiosParentezco.setText("Guardar");
		this.jButtonGuardarCambiosTablaParentezco.setText("Guardar");
		this.jButtonCerrarParentezco.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoParentezco,"nuevo_button","Nuevo",this.parentezcoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarParentezco,"modificar_button","Editar",this.parentezcoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarParentezco,"actualizar_button","Actualizar",this.parentezcoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarParentezco,"eliminar_button","Eliminar",this.parentezcoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarParentezco,"cancelar_button","Cancelar",this.parentezcoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosParentezco,"guardarcambios_button","Guardar",this.parentezcoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaParentezco,"guardarcambiostabla_button","Guardar",this.parentezcoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarParentezco,"cerrar_button","Salir",this.parentezcoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoParentezco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarParentezco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosParentezco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaParentezco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarParentezco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarParentezco, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarParentezco, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarParentezco, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoParentezco.setToolTipText("Nuevo"+" "+ParentezcoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarParentezco.setToolTipText("Editar"+" "+ParentezcoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarParentezco.setToolTipText("Actualizar"+" "+ParentezcoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarParentezco.setToolTipText("Eliminar)"+" "+ParentezcoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarParentezco.setToolTipText("Cancelar"+" "+ParentezcoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosParentezco.setToolTipText("Guardar"+" "+ParentezcoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaParentezco.setToolTipText("Guardar"+" "+ParentezcoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarParentezco.setToolTipText("Salir"+" "+ParentezcoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoParentezco";
		inputMap = this.jButtonNuevoParentezco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoParentezco.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoParentezco"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarParentezco";
		inputMap = this.jButtonActualizarParentezco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarParentezco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarParentezco"));
		
		//ELIMINAR
		sMapKey = "EliminarParentezco";
		inputMap = this.jButtonEliminarParentezco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarParentezco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarParentezco"));
		
		//CANCELAR	
		sMapKey = "CancelarParentezco";
		inputMap = this.jButtonCancelarParentezco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarParentezco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarParentezco"));
		
		//CERRAR		
		sMapKey = "CerrarParentezco";
		inputMap = this.jButtonCerrarParentezco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarParentezco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarParentezco"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaParentezco";
		inputMap = this.jButtonGuardarCambiosTablaParentezco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaParentezco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaParentezco"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoParentezco = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoParentezco.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoParentezco.setToolTipText("Nuevo Parentezco");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoParentezco, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarParentezco = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarParentezco.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarParentezco.setToolTipText("Sin Cerrar Ventana Parentezco");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarParentezco, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeParentezco = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeParentezco.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeParentezco.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeParentezco, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesParentezco = new JComboBoxMe();
		//this.jComboBoxTiposAccionesParentezco.setText("Accion");
		this.jComboBoxTiposAccionesParentezco.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioParentezco = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioParentezco.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioParentezco.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesParentezco = new JLabelMe();
		
		this.jLabelAccionesParentezco.setText("Acciones");		
		this.jLabelAccionesParentezco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParentezco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParentezco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposParentezco();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysParentezco();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesParentezco=new JTabbedPane();
		this.jTabbedPaneRelacionesParentezco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesParentezco,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesParentezco.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParentezco.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParentezco.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesParentezco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioParentezco.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioParentezco.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioParentezco.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioParentezco, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposParentezco = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosParentezco = new GridBagLayout();
		
		this.jPanelCamposParentezco.setLayout(gridaBagLayoutCamposParentezco);
		this.jPanelCamposOcultosParentezco.setLayout(gridaBagLayoutCamposOcultosParentezco);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsParentezco = new GridBagConstraints();
	this.gridBagConstraintsParentezco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParentezco.gridy = 0;
	this.gridBagConstraintsParentezco.gridx = 0;
	this.gridBagConstraintsParentezco.ipadx = 0;
	this.gridBagConstraintsParentezco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidParentezco.add(jLabelIdParentezco, this.gridBagConstraintsParentezco);



	this.gridBagConstraintsParentezco = new GridBagConstraints();
	this.gridBagConstraintsParentezco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParentezco.gridy = 0;
	this.gridBagConstraintsParentezco.gridx = 1;
	this.gridBagConstraintsParentezco.ipadx = 0;
	this.gridBagConstraintsParentezco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidParentezco.add(jLabelidParentezco, this.gridBagConstraintsParentezco);


	this.gridBagConstraintsParentezco = new GridBagConstraints();
	this.gridBagConstraintsParentezco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParentezco.gridy = 0;
	this.gridBagConstraintsParentezco.gridx = 0;
	this.gridBagConstraintsParentezco.ipadx = 0;
	this.gridBagConstraintsParentezco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoParentezco.add(jLabelcodigoParentezco, this.gridBagConstraintsParentezco);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParentezco = new GridBagConstraints();
		//this.gridBagConstraintsParentezco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParentezco.gridy = 0;
		this.gridBagConstraintsParentezco.gridx = 2;
		this.gridBagConstraintsParentezco.ipadx = 0;
		this.gridBagConstraintsParentezco.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoParentezco.add(jButtoncodigoParentezcoBusqueda, this.gridBagConstraintsParentezco);
	}

	this.gridBagConstraintsParentezco = new GridBagConstraints();
	this.gridBagConstraintsParentezco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParentezco.gridy = 0;
	this.gridBagConstraintsParentezco.gridx = 1;
	this.gridBagConstraintsParentezco.ipadx = 0;
	this.gridBagConstraintsParentezco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoParentezco.add(jTextFieldcodigoParentezco, this.gridBagConstraintsParentezco);


	this.gridBagConstraintsParentezco = new GridBagConstraints();
	this.gridBagConstraintsParentezco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParentezco.gridy = 0;
	this.gridBagConstraintsParentezco.gridx = 0;
	this.gridBagConstraintsParentezco.ipadx = 0;
	this.gridBagConstraintsParentezco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreParentezco.add(jLabelnombreParentezco, this.gridBagConstraintsParentezco);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParentezco = new GridBagConstraints();
		//this.gridBagConstraintsParentezco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParentezco.gridy = 0;
		this.gridBagConstraintsParentezco.gridx = 2;
		this.gridBagConstraintsParentezco.ipadx = 0;
		this.gridBagConstraintsParentezco.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreParentezco.add(jButtonnombreParentezcoBusqueda, this.gridBagConstraintsParentezco);
	}

	this.gridBagConstraintsParentezco = new GridBagConstraints();
	this.gridBagConstraintsParentezco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParentezco.gridy = 0;
	this.gridBagConstraintsParentezco.gridx = 1;
	this.gridBagConstraintsParentezco.ipadx = 0;
	this.gridBagConstraintsParentezco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreParentezco.add(jscrollPanenombreParentezco, this.gridBagConstraintsParentezco);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsParentezco = new GridBagConstraints();
	this.gridBagConstraintsParentezco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParentezco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParentezco.gridy = iYPanelCamposParentezco;
	this.gridBagConstraintsParentezco.gridx = iXPanelCamposParentezco++;
	this.gridBagConstraintsParentezco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParentezco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParentezco.add(this.jPanelidParentezco, this.gridBagConstraintsParentezco);



	if(iXPanelCamposParentezco % 1==0) {
		iXPanelCamposParentezco=0;
		iYPanelCamposParentezco++;
	}
	this.gridBagConstraintsParentezco = new GridBagConstraints();
	this.gridBagConstraintsParentezco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParentezco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParentezco.gridy = iYPanelCamposParentezco;
	this.gridBagConstraintsParentezco.gridx = iXPanelCamposParentezco++;
	this.gridBagConstraintsParentezco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParentezco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParentezco.add(this.jPanelcodigoParentezco, this.gridBagConstraintsParentezco);



	if(iXPanelCamposParentezco % 1==0) {
		iXPanelCamposParentezco=0;
		iYPanelCamposParentezco++;
	}
	this.gridBagConstraintsParentezco = new GridBagConstraints();
	this.gridBagConstraintsParentezco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParentezco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParentezco.gridy = iYPanelCamposParentezco;
	this.gridBagConstraintsParentezco.gridx = iXPanelCamposParentezco++;
	this.gridBagConstraintsParentezco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParentezco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParentezco.add(this.jPanelnombreParentezco, this.gridBagConstraintsParentezco);



	if(iXPanelCamposParentezco % 1==0) {
		iXPanelCamposParentezco=0;
		iYPanelCamposParentezco++;
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
			
		GridBagLayout gridaBagLayoutAccionesParentezco= new GridBagLayout();
		this.jPanelAccionesParentezco.setLayout(gridaBagLayoutAccionesParentezco);
		
		GridBagLayout gridaBagLayoutAccionesFormularioParentezco= new GridBagLayout();
		this.jPanelAccionesFormularioParentezco.setLayout(gridaBagLayoutAccionesFormularioParentezco);
		
		this.gridBagConstraintsParentezco = new GridBagConstraints();
		this.gridBagConstraintsParentezco.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsParentezco.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioParentezco.add(this.jComboBoxTiposAccionesFormularioParentezco, this.gridBagConstraintsParentezco);

		this.gridBagConstraintsParentezco = new GridBagConstraints();
		this.gridBagConstraintsParentezco.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsParentezco.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioParentezco.add(this.jCheckBoxPostAccionNuevoParentezco, this.gridBagConstraintsParentezco);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.parentezcoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsParentezco = new GridBagConstraints();
			this.gridBagConstraintsParentezco.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsParentezco.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioParentezco.add(this.jCheckBoxPostAccionSinCerrarParentezco, this.gridBagConstraintsParentezco);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.parentezcoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.parentezcoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsParentezco = new GridBagConstraints();
			this.gridBagConstraintsParentezco.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsParentezco.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioParentezco.add(this.jCheckBoxPostAccionSinMensajeParentezco, this.gridBagConstraintsParentezco);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsParentezco = new GridBagConstraints();
		this.gridBagConstraintsParentezco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParentezco.gridy = 0;
		this.gridBagConstraintsParentezco.gridx = iPosXAccion++;
			
		this.jPanelAccionesParentezco.add(this.jButtonModificarParentezco, this.gridBagConstraintsParentezco);							

		this.gridBagConstraintsParentezco = new GridBagConstraints();
		this.gridBagConstraintsParentezco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParentezco.gridy = 0;
		this.gridBagConstraintsParentezco.gridx =iPosXAccion++;
			
		this.jPanelAccionesParentezco.add(this.jButtonEliminarParentezco, this.gridBagConstraintsParentezco);
		
			
		this.gridBagConstraintsParentezco = new GridBagConstraints();
		this.gridBagConstraintsParentezco.gridy = 0;		
		this.gridBagConstraintsParentezco.gridx = iPosXAccion++;
		
		this.jPanelAccionesParentezco.add(this.jButtonActualizarParentezco, this.gridBagConstraintsParentezco);


		this.gridBagConstraintsParentezco = new GridBagConstraints();
		this.gridBagConstraintsParentezco.gridy = 0;		
		this.gridBagConstraintsParentezco.gridx = iPosXAccion++;
		
		this.jPanelAccionesParentezco.add(this.jButtonGuardarCambiosParentezco, this.gridBagConstraintsParentezco);	
		
		this.gridBagConstraintsParentezco = new GridBagConstraints();
		this.gridBagConstraintsParentezco.gridy = 0;		
		this.gridBagConstraintsParentezco.gridx =iPosXAccion++;
		
		this.jPanelAccionesParentezco.add(this.jButtonCancelarParentezco, this.gridBagConstraintsParentezco);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutParentezco = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutParentezco);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.parentezcoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsParentezco = new GridBagConstraints();						
			this.gridBagConstraintsParentezco.gridy = iGridyPrincipal++;
			this.gridBagConstraintsParentezco.gridx = 0;		
			//this.gridBagConstraintsParentezco.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParentezco.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsParentezco.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsParentezco = new GridBagConstraints();
		this.gridBagConstraintsParentezco.gridy =iGridyPrincipal++;
		this.gridBagConstraintsParentezco.gridx =0;
		this.gridBagConstraintsParentezco.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsParentezco.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosParentezco, this.gridBagConstraintsParentezco);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ParentezcoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleParentezco = new ParentezcoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Parentezco DATOS");
			
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
			
	        //this.setTitle("[FOR] - Parentezco DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Parentezco Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ParentezcoModel parentezcoModel=new ParentezcoModel(this);
			
			//SI USARA CLASE INTERNA
			//ParentezcoModel.ParentezcoFocusTraversalPolicy parentezcoFocusTraversalPolicy = parentezcoModel.new ParentezcoFocusTraversalPolicy(this);
			
			//parentezcoFocusTraversalPolicy.setparentezcoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(parentezcoModel);
			
			
			this.jContentPaneDetalleParentezco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleParentezco = new GridBagLayout();	
			this.jContentPaneDetalleParentezco.setLayout(gridaBagLayoutDetalleParentezco);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosParentezco = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsParentezco = new GridBagConstraints();
				this.gridBagConstraintsParentezco.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsParentezco.gridx = 0;
					
				
				this.jContentPaneDetalleParentezco.add(jTtoolBarDetalleParentezco, gridBagConstraintsParentezco);								
				
}
			
			this.jScrollPanelDatosEdicionParentezco=   new JScrollPane(jContentPaneDetalleParentezco,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionParentezco.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParentezco.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParentezco.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralParentezco=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralParentezco.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParentezco.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParentezco.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsParentezco = new GridBagConstraints();
			
			
	        this.gridBagConstraintsParentezco.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsParentezco.gridx = 0;
	        
			this.jContentPaneDetalleParentezco.add(jPanelCamposParentezco, gridBagConstraintsParentezco);
			
			
			
			
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
						&& parentezcoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameReferencia(this.puedeCargarPorParteReferencia,false,-1);
					
					if(this.parentezcoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsParentezco= new GridBagConstraints();
						this.gridBagConstraintsParentezco.gridy = iGridyRelaciones++;
						this.gridBagConstraintsParentezco.gridx = 0;
						this.jContentPaneDetalleParentezco.add(this.jTabbedPaneRelacionesParentezco, this.gridBagConstraintsParentezco);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesParentezco.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameReferencia(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosParentezco.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsParentezco = new GridBagConstraints();
					this.gridBagConstraintsParentezco.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsParentezco.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsParentezco.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsParentezco.gridx = 0;
					
				
					this.jContentPaneDetalleParentezco.add(jPanelCamposOcultosParentezco, gridBagConstraintsParentezco);
				
					this.jPanelCamposOcultosParentezco.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsParentezco = new GridBagConstraints();
			this.gridBagConstraintsParentezco.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsParentezco.gridx = 0;
	        this.gridBagConstraintsParentezco.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleParentezco.add(this.jPanelAccionesFormularioParentezco, this.gridBagConstraintsParentezco);							
			
			
			
			this.gridBagConstraintsParentezco = new GridBagConstraints();
	        this.gridBagConstraintsParentezco.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsParentezco.gridx = 0;
	        
			
			this.jContentPaneDetalleParentezco.add(this.jPanelAccionesParentezco, this.gridBagConstraintsParentezco);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionParentezco);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionParentezco=   new JScrollPane(this.jPanelCamposParentezco,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionParentezco.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParentezco.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParentezco.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsParentezco = new GridBagConstraints();
			this.gridBagConstraintsParentezco.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsParentezco.gridx = 0;
			this.gridBagConstraintsParentezco.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsParentezco.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsParentezco.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionParentezco, this.gridBagConstraintsParentezco);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsParentezco = new GridBagConstraints();
			this.gridBagConstraintsParentezco.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsParentezco.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioParentezco, this.gridBagConstraintsParentezco);			
			
			this.gridBagConstraintsParentezco = new GridBagConstraints();
			this.gridBagConstraintsParentezco.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsParentezco.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesParentezco, this.gridBagConstraintsParentezco);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsParentezco = new GridBagConstraints();
		this.gridBagConstraintsParentezco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParentezco.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposParentezco, this.gridBagConstraintsParentezco);
			
			
		this.gridBagConstraintsParentezco = new GridBagConstraints();
		this.gridBagConstraintsParentezco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParentezco.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosParentezco, this.gridBagConstraintsParentezco);
		
			
		this.gridBagConstraintsParentezco = new GridBagConstraints();
		this.gridBagConstraintsParentezco.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsParentezco.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesParentezco, this.gridBagConstraintsParentezco);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralParentezco;//jContentPane;
		
		return jScrollPanelDatosEdicionParentezco;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameReferencia(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.referenciaSessionBean=new ReferenciaSessionBean();
		this.referenciaSessionBean.setConGuardarRelaciones(false);
		this.referenciaSessionBean.setEsGuardarRelacionado(true);

		this.referenciaBeanSwingJInternalFrame=null;//new ReferenciaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.referenciaBeanSwingJInternalFramePopup=new ReferenciaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.referenciaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.referenciaSessionBean.getEsGuardarRelacionado()) {

				ReferenciaJInternalFrame.STIPO_TAMANIO_GENERAL=ParentezcoJInternalFrame.STIPO_TAMANIO_GENERAL;
				ReferenciaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ParentezcoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.referenciaSessionBean.setEsGuardarRelacionado(true);

				this.referenciaBeanSwingJInternalFrame=new ReferenciaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.referenciaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.referenciaBeanSwingJInternalFrame.setreferenciaSessionBean(this.referenciaSessionBean);

				//this.gridBagConstraintsParentezco = new GridBagConstraints();
				//this.gridBagConstraintsParentezco.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsParentezco.gridx = 0;
				//this.jContentPaneDetalleParentezco.add(this.referenciaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsParentezco);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesParentezco.add("Referencias",this.referenciaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesParentezco.setComponentAt(iIndexTab,this.referenciaBeanSwingJInternalFrame.getContentPane());
				}

				//ReferenciaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.referenciaSessionBean.setEsGuardarRelacionado(false);
				this.referenciaBeanSwingJInternalFrame=null;//new ReferenciaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.referenciaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteReferencia) {
					this.jTabbedPaneRelacionesParentezco.add("Referencias",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarReferenciaBeanSwingJInternalFrame(List<Parentezco> parentezcos,Parentezco parentezco,ReferenciaBeanSwingJInternalFrame referenciaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//referenciaBeanSwingJInternalFrame=new ReferenciaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					referenciaBeanSwingJInternalFrame.getReferenciaLogic().setConnexion(this.parentezcoLogic.getConnexion());

					referenciaBeanSwingJInternalFrame.setparentezcosForeignKey(parentezcos);
					referenciaBeanSwingJInternalFrame.setparentezcoForeignKey(parentezco);
					referenciaBeanSwingJInternalFrame.referenciaSessionBean.setisBusquedaDesdeForeignKeySesionParentezco(true);
					referenciaBeanSwingJInternalFrame.referenciaSessionBean.setlidParentezcoActual(parentezco.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					referenciaBeanSwingJInternalFrame.cargarCombosForeignKeyReferencia(referenciaBeanSwingJInternalFrame.isCargarCombosDependencia);
					referenciaBeanSwingJInternalFrame.setVisibilidadBusquedasParaParentezco(true);
					referenciaBeanSwingJInternalFrame.setid_parentezcoFK_IdParentezco(parentezco.getId());

					if(!this.conCargarFormDetalle) {
						referenciaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					referenciaBeanSwingJInternalFrame.setSelectedItemCombosFrameParentezcoForeignKey(parentezco,1,false,true,true);
					referenciaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					referenciaBeanSwingJInternalFrame.procesarBusqueda("FK_IdParentezco");
					referenciaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdParentezco");
					referenciaBeanSwingJInternalFrame.inicializarActualizarBindingTablaReferencia(true);
					referenciaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesReferencia("n",referenciaBeanSwingJInternalFrame.isGuardarCambiosEnLote, referenciaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					referenciaBeanSwingJInternalFrame.setAutoscrolls(true);
					referenciaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						referenciaBeanSwingJInternalFrame.actualizarEstadoPanelsReferencia("relacionado");
					} else {
						referenciaBeanSwingJInternalFrame.actualizarEstadoPanelsReferencia("no_relacionado");
					}

					referenciaBeanSwingJInternalFrame.getjButtonRecargarInformacionReferencia().setVisible(false);

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
