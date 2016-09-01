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
package com.bydan.erp.inventario.presentation.swing.jinternalframes;




import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.PerfilOpcion;
import com.bydan.erp.seguridad.business.entity.PerfilCampo;
import com.bydan.erp.seguridad.business.entity.PerfilAccion;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;
import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Accion;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneralAdditional;
import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;


//import com.bydan.erp.seguridad.business.entity.PerfilAccion;


import com.bydan.erp.seguridad.util.SistemaConstantesFunciones;
import com.bydan.erp.seguridad.util.SistemaConstantesFuncionesAdditional;
import com.bydan.erp.seguridad.business.logic.SistemaLogicAdditional;

import com.bydan.erp.inventario.util.MensajeCorreoInvenConstantesFunciones;
import com.bydan.erp.inventario.util.MensajeCorreoInvenParameterReturnGeneral;
//import com.bydan.erp.inventario.util.MensajeCorreoInvenParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.MensajeCorreoInvenBean;
import com.bydan.framework.erp.business.dataaccess.ConstantesSql;
import com.bydan.framework.erp.business.entity.Classe;
import com.bydan.framework.erp.business.entity.DatoGeneral;
import com.bydan.framework.erp.business.entity.GeneralEntityParameterGeneral;
import com.bydan.framework.erp.business.entity.OrderBy;
import com.bydan.framework.erp.business.entity.DatoGeneralMinimo;
import com.bydan.framework.erp.business.entity.GeneralEntity;
import com.bydan.framework.erp.business.entity.Mensajes;
import com.bydan.framework.erp.business.entity.GeneralEntityParameterReturnGeneral;
//import com.bydan.framework.erp.business.entity.MaintenanceType;
import com.bydan.framework.erp.util.MaintenanceType;
import com.bydan.framework.erp.util.FuncionesReporte;
import com.bydan.framework.erp.business.logic.DatosCliente;
import com.bydan.framework.erp.business.logic.Pagination;

import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.framework.erp.presentation.desktop.swing.TablaGeneralTotalModel;
import com.bydan.framework.erp.presentation.desktop.swing.TablaGeneralOrderByModel;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverter;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverterFromDate;
import com.bydan.framework.erp.presentation.desktop.swing.DateRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.DateEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.TextFieldRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.RunnableProceso;
import com.bydan.framework.erp.presentation.desktop.swing.*;
//import com.bydan.framework.erp.presentation.desktop.swing.TextFieldEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.HeaderRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.JInternalFrameBase;
import com.bydan.framework.erp.presentation.desktop.swing.FuncionesSwing;
import com.bydan.framework.erp.presentation.desktop.swing.MainJFrame;
import com.bydan.framework.erp.resources.imagenes.AuxiliarImagenes;
import com.bydan.erp.inventario.resources.reportes.AuxiliarReportes;


import com.bydan.erp.inventario.util.*;
import com.bydan.erp.inventario.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.inventario.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;






import javax.imageio.ImageIO;
import java.net.NetworkInterface;
import java.net.InterfaceAddress;
import java.net.InetAddress;
import javax.naming.InitialContext;
import java.lang.Long;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;
import java.util.Hashtable;
import java.util.Collections;
import java.io.File;
import java.io.FileInputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.stream.StreamSource;

import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import org.w3c.dom.Document;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.util.CellRangeAddress;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;


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
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

import org.apache.log4j.Logger;

import com.bydan.framework.erp.business.entity.Reporte;


//VALIDACION
import org.hibernate.validator.ClassValidator;
import org.hibernate.validator.InvalidValue;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperRunManager;
import net.sf.jasperreports.engine.export.JExcelApiExporter;
import net.sf.jasperreports.engine.export.JRCsvExporter;
import net.sf.jasperreports.engine.export.JRRtfExporter;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.engine.export.JRXlsExporterParameter;
import net.sf.jasperreports.engine.util.JRSaver;
import net.sf.jasperreports.engine.xml.JRXmlWriter;


import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

import java.util.EventObject;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.event.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.awt.event.*;

import org.jdesktop.beansbinding.Binding.SyncFailure;
import org.jdesktop.beansbinding.BindingListener;
import org.jdesktop.beansbinding.Bindings;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.beansbinding.ELProperty;
import org.jdesktop.beansbinding.AutoBinding.UpdateStrategy;
import org.jdesktop.beansbinding.PropertyStateEvent;
import org.jdesktop.swingbinding.JComboBoxBinding;
import org.jdesktop.swingbinding.SwingBindings;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

import com.toedter.calendar.JDateChooser;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class MensajeCorreoInvenBeanSwingJInternalFrame extends MensajeCorreoInvenJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(MensajeCorreoInvenBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<MensajeCorreoInven> mensajecorreoinvenValidator = new ClassValidator<MensajeCorreoInven>(MensajeCorreoInven.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public MensajeCorreoInven mensajecorreoinven;	
	public MensajeCorreoInven mensajecorreoinvenAux;
	public MensajeCorreoInven mensajecorreoinvenAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public MensajeCorreoInven mensajecorreoinvenTotales;
	public Long idMensajeCorreoInvenActual;
	public Long iIdNuevoMensajeCorreoInven=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboEmpresa="";

	public List<Empresa> empresasForeignKey;

	public List<Empresa> getempresasForeignKey() {
		return empresasForeignKey;
	}

	public void setempresasForeignKey(List<Empresa> empresasForeignKey) {
		this.empresasForeignKey = empresasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Empresa empresaForeignKey;

	public Empresa getempresaForeignKey() {
		return empresaForeignKey;
	}

	public void setempresaForeignKey(Empresa empresaForeignKey) {
		this.empresaForeignKey = empresaForeignKey;
	}

	public String sFinalQueryComboSucursal="";

	public List<Sucursal> sucursalsForeignKey;

	public List<Sucursal> getsucursalsForeignKey() {
		return sucursalsForeignKey;
	}

	public void setsucursalsForeignKey(List<Sucursal> sucursalsForeignKey) {
		this.sucursalsForeignKey = sucursalsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Sucursal sucursalForeignKey;

	public Sucursal getsucursalForeignKey() {
		return sucursalForeignKey;
	}

	public void setsucursalForeignKey(Sucursal sucursalForeignKey) {
		this.sucursalForeignKey = sucursalForeignKey;
	}

	public String sFinalQueryComboModulo="";

	public List<Modulo> modulosForeignKey;

	public List<Modulo> getmodulosForeignKey() {
		return modulosForeignKey;
	}

	public void setmodulosForeignKey(List<Modulo> modulosForeignKey) {
		this.modulosForeignKey = modulosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Modulo moduloForeignKey;

	public Modulo getmoduloForeignKey() {
		return moduloForeignKey;
	}

	public void setmoduloForeignKey(Modulo moduloForeignKey) {
		this.moduloForeignKey = moduloForeignKey;
	}

	public String sFinalQueryComboTipoMensajeCorreoInven="";

	public List<TipoMensajeCorreoInven> tipomensajecorreoinvensForeignKey;

	public List<TipoMensajeCorreoInven> gettipomensajecorreoinvensForeignKey() {
		return tipomensajecorreoinvensForeignKey;
	}

	public void settipomensajecorreoinvensForeignKey(List<TipoMensajeCorreoInven> tipomensajecorreoinvensForeignKey) {
		this.tipomensajecorreoinvensForeignKey = tipomensajecorreoinvensForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoMensajeCorreoInven tipomensajecorreoinvenForeignKey;

	public TipoMensajeCorreoInven gettipomensajecorreoinvenForeignKey() {
		return tipomensajecorreoinvenForeignKey;
	}

	public void settipomensajecorreoinvenForeignKey(TipoMensajeCorreoInven tipomensajecorreoinvenForeignKey) {
		this.tipomensajecorreoinvenForeignKey = tipomensajecorreoinvenForeignKey;
	}

		
	
	
	
	
	

	public Boolean isTienePermisosDetalleMensajeCorreoInven=false;

	public Boolean getIsTienePermisosDetalleMensajeCorreoInven() {
		return isTienePermisosDetalleMensajeCorreoInven;
	}

	public void setIsTienePermisosDetalleMensajeCorreoInven(Boolean isTienePermisosDetalleMensajeCorreoInven) {
		this.isTienePermisosDetalleMensajeCorreoInven= isTienePermisosDetalleMensajeCorreoInven;
	}


	public Boolean isTienePermisosMailMensajeCorreoInven=false;

	public Boolean getIsTienePermisosMailMensajeCorreoInven() {
		return isTienePermisosMailMensajeCorreoInven;
	}

	public void setIsTienePermisosMailMensajeCorreoInven(Boolean isTienePermisosMailMensajeCorreoInven) {
		this.isTienePermisosMailMensajeCorreoInven= isTienePermisosMailMensajeCorreoInven;
	}

	
	
	//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
	public String sFinalQueryGeneral="";
	public Boolean isEntroOnLoad=false;
	public Boolean isErrorGuardar=false;
	
	public Boolean isGuardarCambiosEnLote=false;
	public Boolean isCargarCombosDependencia=false;
	public Boolean isSeleccionarTodos=false;
	public Boolean isSeleccionados=false;
	public Boolean conGraficoReporte=false;
	
	public Boolean isPostAccionNuevo=false;
	public Boolean isPostAccionSinCerrar=false;
	public Boolean isPostAccionSinMensaje=false;
	
	
	public Boolean esControlTabla=false;
	
	public Boolean isPermisoTodoMensajeCorreoInven;
	public Boolean isPermisoNuevoMensajeCorreoInven;
	public Boolean isPermisoActualizarMensajeCorreoInven;
	public Boolean isPermisoActualizarOriginalMensajeCorreoInven;
	public Boolean isPermisoEliminarMensajeCorreoInven;
	public Boolean isPermisoGuardarCambiosMensajeCorreoInven;
	public Boolean isPermisoConsultaMensajeCorreoInven;
	public Boolean isPermisoBusquedaMensajeCorreoInven;
	public Boolean isPermisoReporteMensajeCorreoInven;
	public Boolean isPermisoPaginacionMedioMensajeCorreoInven;
	public Boolean isPermisoPaginacionAltoMensajeCorreoInven;
	public Boolean isPermisoPaginacionTodoMensajeCorreoInven;
	public Boolean isPermisoCopiarMensajeCorreoInven;
	public Boolean isPermisoVerFormMensajeCorreoInven;
	public Boolean isPermisoDuplicarMensajeCorreoInven;
	public Boolean isPermisoOrdenMensajeCorreoInven;
	
	
	public ArrayList<DatoGeneral> arrDatoGeneral;
	public ArrayList<String> arrDatoGeneralNo;
	ArrayList<Classe> classesActual=new ArrayList<Classe>();
	
	public List<Accion> accions;	
	public List<Accion> accionsFormulario;
	
	
	public ArrayList<DatoGeneralMinimo> arrDatoGeneralMinimos;
	
	public ArrayList<Reporte> tiposArchivosReportes;
	public ArrayList<Reporte> tiposArchivosReportesDinamico;
	public ArrayList<Reporte> tiposReportes;
	public ArrayList<Reporte> tiposReportesDinamico;
	public ArrayList<Reporte> tiposGraficosReportes;
	public ArrayList<Reporte> tiposPaginacion;
	public ArrayList<Reporte> tiposRelaciones;
	public ArrayList<Reporte> tiposAcciones;
	public ArrayList<Reporte> tiposAccionesFormulario;
	public ArrayList<Reporte> tiposSeleccionar;
	
	public ArrayList<Reporte> tiposColumnasSelect;
	public ArrayList<Reporte> tiposRelacionesSelect;
	
	
	public Integer iNumeroPaginacion;
	public Integer iNumeroPaginacionPagina;
	public Pagination pagination;
	public DatosCliente datosCliente;
	public DatosDeep datosDeep;
	public String sTipoArchivoReporte="";
	public String sTipoArchivoReporteDinamico="";
	public String sTipoReporte="";
	public String sTipoReporteDinamico="";
	public String sTipoGraficoReporte="";
	public String sTipoPaginacion="";
	public String sTipoRelacion="";
	public String sTipoAccion="";
	public String sTipoAccionFormulario="";
	public String sTipoSeleccionar="";	
	public String sDetalleReporte="";
	public Boolean isMostrarNumeroPaginacion;
	public String sTipoReporteExtra="";
	public String sValorCampoGeneral="";
	public Boolean esReporteDinamico=false;
	public Boolean esReporteAccionProceso=false;
	public Boolean esRecargarFks=false;
	public String sPathReporteDinamico="";
	
	public MensajeCorreoInvenParameterReturnGeneral mensajecorreoinvenReturnGeneral;
	public MensajeCorreoInvenParameterReturnGeneral mensajecorreoinvenParameterGeneral;
	
	

	public DetalleMensajeCorreoInvenLogic detallemensajecorreoinvenLogic=null;

	public DetalleMensajeCorreoInvenLogic getDetalleMensajeCorreoInvenLogic() {
		return detallemensajecorreoinvenLogic;
	}

	public void setDetalleMensajeCorreoInvenLogic(DetalleMensajeCorreoInvenLogic detallemensajecorreoinvenLogic) {
		this.detallemensajecorreoinvenLogic = detallemensajecorreoinvenLogic;
	}


	public MailMensajeCorreoInvenLogic mailmensajecorreoinvenLogic=null;

	public MailMensajeCorreoInvenLogic getMailMensajeCorreoInvenLogic() {
		return mailmensajecorreoinvenLogic;
	}

	public void setMailMensajeCorreoInvenLogic(MailMensajeCorreoInvenLogic mailmensajecorreoinvenLogic) {
		this.mailmensajecorreoinvenLogic = mailmensajecorreoinvenLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoMensajeCorreoInven=false;
	public Boolean esParaAccionDesdeFormularioMensajeCorreoInven=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected MensajeCorreoInvenSessionBeanAdditional mensajecorreoinvenSessionBeanAdditional=null;
	
	public MensajeCorreoInvenSessionBeanAdditional getMensajeCorreoInvenSessionBeanAdditional() {
		return this.mensajecorreoinvenSessionBeanAdditional;
	}
	
	public void setMensajeCorreoInvenSessionBeanAdditional(MensajeCorreoInvenSessionBeanAdditional mensajecorreoinvenSessionBeanAdditional) {
		try {
			this.mensajecorreoinvenSessionBeanAdditional=mensajecorreoinvenSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected MensajeCorreoInvenBeanSwingJInternalFrameAdditional mensajecorreoinvenBeanSwingJInternalFrameAdditional=null;
	//public class MensajeCorreoInvenBeanSwingJInternalFrame
	
	public MensajeCorreoInvenBeanSwingJInternalFrameAdditional getMensajeCorreoInvenBeanSwingJInternalFrameAdditional() {
		return this.mensajecorreoinvenBeanSwingJInternalFrameAdditional;
	}
	
	public void setMensajeCorreoInvenBeanSwingJInternalFrameAdditional(MensajeCorreoInvenBeanSwingJInternalFrameAdditional mensajecorreoinvenBeanSwingJInternalFrameAdditional) {
		try {
			this.mensajecorreoinvenBeanSwingJInternalFrameAdditional=mensajecorreoinvenBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public MensajeCorreoInvenLogic mensajecorreoinvenLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public MensajeCorreoInven mensajecorreoinvenBean;
	public MensajeCorreoInvenConstantesFunciones mensajecorreoinvenConstantesFunciones;
	//public MensajeCorreoInvenParameterReturnGeneral mensajecorreoinvenReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public ModuloLogic moduloLogic;
	public TipoMensajeCorreoInvenLogic tipomensajecorreoinvenLogic;
	
	//PARAMETROS
	
	
	//public List<MensajeCorreoInven> mensajecorreoinvens;	
	//public List<MensajeCorreoInven> mensajecorreoinvensEliminados;
	//public List<MensajeCorreoInven> mensajecorreoinvensAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoMensajeCorreoInven=false;
	public Boolean isVisibilidadCeldaDuplicarMensajeCorreoInven=true;
	public Boolean isVisibilidadCeldaCopiarMensajeCorreoInven=true;
	public Boolean isVisibilidadCeldaVerFormMensajeCorreoInven=true;
	public Boolean isVisibilidadCeldaOrdenMensajeCorreoInven=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesMensajeCorreoInven=false;
	public Boolean isVisibilidadCeldaModificarMensajeCorreoInven=false;
	public Boolean isVisibilidadCeldaActualizarMensajeCorreoInven=false;
	public Boolean isVisibilidadCeldaEliminarMensajeCorreoInven=false;
	public Boolean isVisibilidadCeldaCancelarMensajeCorreoInven=false;
	public Boolean isVisibilidadCeldaGuardarMensajeCorreoInven=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosMensajeCorreoInven=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdModulo=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdTipoMensajeCorreoInven=false;
	
	public Long getiIdNuevoMensajeCorreoInven() {
		return this.iIdNuevoMensajeCorreoInven;
	}

	public void setiIdNuevoMensajeCorreoInven(Long iIdNuevoMensajeCorreoInven) {
		this.iIdNuevoMensajeCorreoInven = iIdNuevoMensajeCorreoInven;
	}
	
	public Long getidMensajeCorreoInvenActual() {
		return this.idMensajeCorreoInvenActual;
	}

	public void setidMensajeCorreoInvenActual(Long idMensajeCorreoInvenActual) {
		this.idMensajeCorreoInvenActual = idMensajeCorreoInvenActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public MensajeCorreoInven getmensajecorreoinven() {
		return this.mensajecorreoinven;
	}

	public void setmensajecorreoinven(MensajeCorreoInven mensajecorreoinven) {
		this.mensajecorreoinven = mensajecorreoinven;
	}
	
	public MensajeCorreoInven getmensajecorreoinvenAux() {
		return this.mensajecorreoinvenAux;
	}

	public void setmensajecorreoinvenAux(MensajeCorreoInven mensajecorreoinvenAux) {
		this.mensajecorreoinvenAux = mensajecorreoinvenAux;
	}				
	
	public MensajeCorreoInven getmensajecorreoinvenAnterior() {
		return this.mensajecorreoinvenAnterior;
	}

	public void setmensajecorreoinvenAnterior(MensajeCorreoInven mensajecorreoinvenAnterior) {
		this.mensajecorreoinvenAnterior = mensajecorreoinvenAnterior;
	}	
	
	public MensajeCorreoInven getmensajecorreoinvenTotales() {
		return this.mensajecorreoinvenTotales;
	}

	public void setmensajecorreoinvenTotales(MensajeCorreoInven mensajecorreoinvenTotales) {
		this.mensajecorreoinvenTotales = mensajecorreoinvenTotales;
	}	
	
	public MensajeCorreoInven getmensajecorreoinvenBean() {
		return this.mensajecorreoinvenBean;
	}

	public void setmensajecorreoinvenBean(MensajeCorreoInven mensajecorreoinvenBean) {
		this.mensajecorreoinvenBean = mensajecorreoinvenBean;
	}	
	
	public MensajeCorreoInvenParameterReturnGeneral getmensajecorreoinvenReturnGeneral() {
		return this.mensajecorreoinvenReturnGeneral;
	}

	public void setmensajecorreoinvenReturnGeneral(MensajeCorreoInvenParameterReturnGeneral mensajecorreoinvenReturnGeneral) {
		this.mensajecorreoinvenReturnGeneral = mensajecorreoinvenReturnGeneral;
	}	
	
	
	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_moduloFK_IdModulo=-1L;

	public Long getid_moduloFK_IdModulo() {
		return this.id_moduloFK_IdModulo;
	}

	public void setid_moduloFK_IdModulo(Long id_moduloFK_IdModulo) {
		this.id_moduloFK_IdModulo = id_moduloFK_IdModulo;
	}

	public Long id_sucursalFK_IdSucursal=-1L;

	public Long getid_sucursalFK_IdSucursal() {
		return this.id_sucursalFK_IdSucursal;
	}

	public void setid_sucursalFK_IdSucursal(Long id_sucursalFK_IdSucursal) {
		this.id_sucursalFK_IdSucursal = id_sucursalFK_IdSucursal;
	}

	public Long id_tipo_mensaje_correo_invenFK_IdTipoMensajeCorreoInven=-1L;

	public Long getid_tipo_mensaje_correo_invenFK_IdTipoMensajeCorreoInven() {
		return this.id_tipo_mensaje_correo_invenFK_IdTipoMensajeCorreoInven;
	}

	public void setid_tipo_mensaje_correo_invenFK_IdTipoMensajeCorreoInven(Long id_tipo_mensaje_correo_invenFK_IdTipoMensajeCorreoInven) {
		this.id_tipo_mensaje_correo_invenFK_IdTipoMensajeCorreoInven = id_tipo_mensaje_correo_invenFK_IdTipoMensajeCorreoInven;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public MensajeCorreoInvenLogic getMensajeCorreoInvenLogic()	{		
		return mensajecorreoinvenLogic;
	}

	public void setMensajeCorreoInvenLogic(MensajeCorreoInvenLogic mensajecorreoinvenLogic) {
		this.mensajecorreoinvenLogic = mensajecorreoinvenLogic;
	}
	
	
	public void setsFinalQueryGeneral(String sFinalQueryGeneral) {
		this.sFinalQueryGeneral=sFinalQueryGeneral;
	}
	
	public String getsFinalQueryGeneral() {
		return this.sFinalQueryGeneral;
	}
		
	public Boolean getIsGuardarCambiosEnLote() {
		return isGuardarCambiosEnLote;
	}

	public void setIsGuardarCambiosEnLote(Boolean isGuardarCambiosEnLote) {
		this.isGuardarCambiosEnLote = isGuardarCambiosEnLote;
	}
	
	public Boolean getIsCargarCombosDependencia() {
		return isCargarCombosDependencia;
	}

	public void setIsCargarCombosDependencia(Boolean isCargarCombosDependencia) {
		this.isCargarCombosDependencia = isCargarCombosDependencia;
	}
	
	public Boolean getIsEsNuevoMensajeCorreoInven() {
		return isEsNuevoMensajeCorreoInven;
	}

	public void setIsEsNuevoMensajeCorreoInven(Boolean isEsNuevoMensajeCorreoInven) {
		this.isEsNuevoMensajeCorreoInven = isEsNuevoMensajeCorreoInven;
	}

	public Boolean getEsParaAccionDesdeFormularioMensajeCorreoInven() {
		return esParaAccionDesdeFormularioMensajeCorreoInven;
	}
	
	public void setEsParaAccionDesdeFormularioMensajeCorreoInven(Boolean esParaAccionDesdeFormularioMensajeCorreoInven) {
		this.esParaAccionDesdeFormularioMensajeCorreoInven = esParaAccionDesdeFormularioMensajeCorreoInven;
	}
	
	public Boolean getIsEsMantenimientoRelacionesRelacionadoUnico() {
		return isEsMantenimientoRelacionesRelacionadoUnico;
	}

	public void setIsEsMantenimientoRelacionesRelacionadoUnico(Boolean isEsMantenimientoRelacionesRelacionadoUnico) {
		this.isEsMantenimientoRelacionesRelacionadoUnico = isEsMantenimientoRelacionesRelacionadoUnico;
	}

	public Boolean getIsEsMantenimientoRelaciones() {
		return isEsMantenimientoRelaciones;
	}

	public void setIsEsMantenimientoRelaciones(Boolean isEsMantenimientoRelaciones) {
		this.isEsMantenimientoRelaciones = isEsMantenimientoRelaciones;
	}

	public Boolean getIsEsMantenimientoRelacionado() {
		return isEsMantenimientoRelacionado;
	}

	public void setIsEsMantenimientoRelacionado(Boolean isEsMantenimientoRelacionado) {
		this.isEsMantenimientoRelacionado = isEsMantenimientoRelacionado;
	}

	public Boolean getesParaBusquedaForeignKey() {
		return esParaBusquedaForeignKey;
	}

	public void setesParaBusquedaForeignKey(Boolean esParaBusquedaForeignKey) {
		this.esParaBusquedaForeignKey = esParaBusquedaForeignKey;
	}

	public Boolean getIsContieneImagenes() {
		return isContieneImagenes;
	}

	public void setIsContieneImagenes(Boolean isContieneImagenes) {
		this.isContieneImagenes = isContieneImagenes;
	}		
	
	
	public void cargarCombosEmpresasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.empresasForeignKey=new ArrayList<Empresa>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EmpresaLogic empresaLogic=new EmpresaLogic();

			//empresaLogic.getEmpresaDataAccess().setIsForForeingKeyData(true);

			if(this.mensajecorreoinvenSessionBean==null) {
				this.mensajecorreoinvenSessionBean=new MensajeCorreoInvenSessionBean();
			}

			if(!this.mensajecorreoinvenSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//empresaLogic.getEmpresaDataAccess().setIsForForeingKeyData(true);

					empresaLogic.getTodosEmpresasWithConnection(sFinalQuery,new Pagination());

					this.empresasForeignKey=empresaLogic.getEmpresas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEmpresa(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					empresaLogic.getEntityWithConnection(mensajecorreoinvenSessionBean.getlidEmpresaActual());
					this.empresasForeignKey.add(empresaLogic.getEmpresa());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosSucursalsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.sucursalsForeignKey=new ArrayList<Sucursal>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			SucursalLogic sucursalLogic=new SucursalLogic();

			//sucursalLogic.getSucursalDataAccess().setIsForForeingKeyData(true);

			if(this.mensajecorreoinvenSessionBean==null) {
				this.mensajecorreoinvenSessionBean=new MensajeCorreoInvenSessionBean();
			}

			if(!this.mensajecorreoinvenSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//sucursalLogic.getSucursalDataAccess().setIsForForeingKeyData(true);

					sucursalLogic.getTodosSucursalsWithConnection(sFinalQuery,new Pagination());

					this.sucursalsForeignKey=sucursalLogic.getSucursals();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaSucursal(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					sucursalLogic.getEntityWithConnection(mensajecorreoinvenSessionBean.getlidSucursalActual());
					this.sucursalsForeignKey.add(sucursalLogic.getSucursal());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosModulosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.modulosForeignKey=new ArrayList<Modulo>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ModuloLogic moduloLogic=new ModuloLogic();

			//moduloLogic.getModuloDataAccess().setIsForForeingKeyData(true);

			if(this.mensajecorreoinvenSessionBean==null) {
				this.mensajecorreoinvenSessionBean=new MensajeCorreoInvenSessionBean();
			}

			if(!this.mensajecorreoinvenSessionBean.getisBusquedaDesdeForeignKeySesionModulo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//moduloLogic.getModuloDataAccess().setIsForForeingKeyData(true);

					moduloLogic.getTodosModulosWithConnection(sFinalQuery,new Pagination());

					this.modulosForeignKey=moduloLogic.getModulos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaModulo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					moduloLogic.getEntityWithConnection(mensajecorreoinvenSessionBean.getlidModuloActual());
					this.modulosForeignKey.add(moduloLogic.getModulo());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosTipoMensajeCorreoInvensForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipomensajecorreoinvensForeignKey=new ArrayList<TipoMensajeCorreoInven>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoMensajeCorreoInvenLogic tipomensajecorreoinvenLogic=new TipoMensajeCorreoInvenLogic();

			//tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvenDataAccess().setIsForForeingKeyData(true);

			if(this.mensajecorreoinvenSessionBean==null) {
				this.mensajecorreoinvenSessionBean=new MensajeCorreoInvenSessionBean();
			}

			if(!this.mensajecorreoinvenSessionBean.getisBusquedaDesdeForeignKeySesionTipoMensajeCorreoInven()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvenDataAccess().setIsForForeingKeyData(true);

					tipomensajecorreoinvenLogic.getTodosTipoMensajeCorreoInvensWithConnection(sFinalQuery,new Pagination());

					this.tipomensajecorreoinvensForeignKey=tipomensajecorreoinvenLogic.getTipoMensajeCorreoInvens();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoMensajeCorreoInven(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipomensajecorreoinvenLogic.getEntityWithConnection(mensajecorreoinvenSessionBean.getlidTipoMensajeCorreoInvenActual());
					this.tipomensajecorreoinvensForeignKey.add(tipomensajecorreoinvenLogic.getTipoMensajeCorreoInven());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	
	public void setActualEmpresaForeignKey(Long idEmpresaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(empresaTemp!=null) {

					if(this.mensajecorreoinven!=null) {
						this.mensajecorreoinven.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormMensajeCorreoInven!=null) {
						this.jInternalFrameDetalleFormMensajeCorreoInven.jComboBoxid_empresaMensajeCorreoInven.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaMensajeCorreoInven.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormMensajeCorreoInven!=null) {
						if(this.jInternalFrameDetalleFormMensajeCorreoInven.jComboBoxid_empresaMensajeCorreoInven.getItemCount()>0) {
							this.jInternalFrameDetalleFormMensajeCorreoInven.jComboBoxid_empresaMensajeCorreoInven.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualEmpresaForeignKeyDescripcion(Long idEmpresaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}


			sDescripcion=EmpresaConstantesFunciones.getEmpresaDescripcion(empresaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaMensajeCorreoInvenGenerico)throws Exception
	{
		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}

			if(empresaTemp!=null) {
				jComboBoxid_empresaMensajeCorreoInvenGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaMensajeCorreoInvenGenerico!=null && jComboBoxid_empresaMensajeCorreoInvenGenerico.getItemCount()>0) {
					jComboBoxid_empresaMensajeCorreoInvenGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualSucursalForeignKey(Long idSucursalSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(sucursalTemp!=null) {

					if(this.mensajecorreoinven!=null) {
						this.mensajecorreoinven.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormMensajeCorreoInven!=null) {
						this.jInternalFrameDetalleFormMensajeCorreoInven.jComboBoxid_sucursalMensajeCorreoInven.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalMensajeCorreoInven.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormMensajeCorreoInven!=null) {
						if(this.jInternalFrameDetalleFormMensajeCorreoInven.jComboBoxid_sucursalMensajeCorreoInven.getItemCount()>0) {
							this.jInternalFrameDetalleFormMensajeCorreoInven.jComboBoxid_sucursalMensajeCorreoInven.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualSucursalForeignKeyDescripcion(Long idSucursalSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}


			sDescripcion=SucursalConstantesFunciones.getSucursalDescripcion(sucursalTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalMensajeCorreoInvenGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}

			if(sucursalTemp!=null) {
				jComboBoxid_sucursalMensajeCorreoInvenGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalMensajeCorreoInvenGenerico!=null && jComboBoxid_sucursalMensajeCorreoInvenGenerico.getItemCount()>0) {
					jComboBoxid_sucursalMensajeCorreoInvenGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualModuloForeignKey(Long idModuloSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Modulo  moduloTemp=null;

			for(Modulo moduloAux:modulosForeignKey) {
				if(moduloAux.getId()!=null && moduloAux.getId().equals(idModuloSeleccionado)) {
					moduloTemp=moduloAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(moduloTemp!=null) {

					if(this.mensajecorreoinven!=null) {
						this.mensajecorreoinven.setModulo(moduloTemp);
					}

					if(this.jInternalFrameDetalleFormMensajeCorreoInven!=null) {
						this.jInternalFrameDetalleFormMensajeCorreoInven.jComboBoxid_moduloMensajeCorreoInven.setSelectedItem(moduloTemp);
					}
				} else {
					//jComboBoxid_moduloMensajeCorreoInven.setSelectedItem(moduloTemp);
					if(this.jInternalFrameDetalleFormMensajeCorreoInven!=null) {
						if(this.jInternalFrameDetalleFormMensajeCorreoInven.jComboBoxid_moduloMensajeCorreoInven.getItemCount()>0) {
							this.jInternalFrameDetalleFormMensajeCorreoInven.jComboBoxid_moduloMensajeCorreoInven.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualModuloForeignKeyDescripcion(Long idModuloSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Modulo  moduloTemp=null;

			for(Modulo moduloAux:modulosForeignKey) {
				if(moduloAux.getId()!=null && moduloAux.getId().equals(idModuloSeleccionado)) {
					moduloTemp=moduloAux;
					break;
				}
			}


			sDescripcion=ModuloConstantesFunciones.getModuloDescripcion(moduloTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualModuloForeignKeyGenerico(Long idModuloSeleccionado,JComboBox jComboBoxid_moduloMensajeCorreoInvenGenerico)throws Exception
	{
		try
		{
			Modulo  moduloTemp=null;

			for(Modulo moduloAux:modulosForeignKey) {
				if(moduloAux.getId()!=null && moduloAux.getId().equals(idModuloSeleccionado)) {
					moduloTemp=moduloAux;
					break;
				}
			}

			if(moduloTemp!=null) {
				jComboBoxid_moduloMensajeCorreoInvenGenerico.setSelectedItem(moduloTemp);
			} else {
				if(jComboBoxid_moduloMensajeCorreoInvenGenerico!=null && jComboBoxid_moduloMensajeCorreoInvenGenerico.getItemCount()>0) {
					jComboBoxid_moduloMensajeCorreoInvenGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoMensajeCorreoInvenForeignKey(Long idTipoMensajeCorreoInvenSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoMensajeCorreoInven  tipomensajecorreoinvenTemp=null;

			for(TipoMensajeCorreoInven tipomensajecorreoinvenAux:tipomensajecorreoinvensForeignKey) {
				if(tipomensajecorreoinvenAux.getId()!=null && tipomensajecorreoinvenAux.getId().equals(idTipoMensajeCorreoInvenSeleccionado)) {
					tipomensajecorreoinvenTemp=tipomensajecorreoinvenAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipomensajecorreoinvenTemp!=null) {

					if(this.mensajecorreoinven!=null) {
						this.mensajecorreoinven.setTipoMensajeCorreoInven(tipomensajecorreoinvenTemp);
					}

					if(this.jInternalFrameDetalleFormMensajeCorreoInven!=null) {
						this.jInternalFrameDetalleFormMensajeCorreoInven.jComboBoxid_tipo_mensaje_correo_invenMensajeCorreoInven.setSelectedItem(tipomensajecorreoinvenTemp);
					}
				} else {
					//jComboBoxid_tipo_mensaje_correo_invenMensajeCorreoInven.setSelectedItem(tipomensajecorreoinvenTemp);
					if(this.jInternalFrameDetalleFormMensajeCorreoInven!=null) {
						if(this.jInternalFrameDetalleFormMensajeCorreoInven.jComboBoxid_tipo_mensaje_correo_invenMensajeCorreoInven.getItemCount()>0) {
							this.jInternalFrameDetalleFormMensajeCorreoInven.jComboBoxid_tipo_mensaje_correo_invenMensajeCorreoInven.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoMensajeCorreoInven") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipomensajecorreoinvenTemp!=null && jComboBoxid_tipo_mensaje_correo_invenFK_IdTipoMensajeCorreoInvenMensajeCorreoInven!=null) {
						jComboBoxid_tipo_mensaje_correo_invenFK_IdTipoMensajeCorreoInvenMensajeCorreoInven.setSelectedItem(tipomensajecorreoinvenTemp);
					} else {
						if(jComboBoxid_tipo_mensaje_correo_invenFK_IdTipoMensajeCorreoInvenMensajeCorreoInven!=null) {
							//jComboBoxid_tipo_mensaje_correo_invenFK_IdTipoMensajeCorreoInvenMensajeCorreoInven.setSelectedItem(tipomensajecorreoinvenTemp);
							if(jComboBoxid_tipo_mensaje_correo_invenFK_IdTipoMensajeCorreoInvenMensajeCorreoInven.getItemCount()>0) {
								jComboBoxid_tipo_mensaje_correo_invenFK_IdTipoMensajeCorreoInvenMensajeCorreoInven.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualTipoMensajeCorreoInvenForeignKeyDescripcion(Long idTipoMensajeCorreoInvenSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoMensajeCorreoInven  tipomensajecorreoinvenTemp=null;

			for(TipoMensajeCorreoInven tipomensajecorreoinvenAux:tipomensajecorreoinvensForeignKey) {
				if(tipomensajecorreoinvenAux.getId()!=null && tipomensajecorreoinvenAux.getId().equals(idTipoMensajeCorreoInvenSeleccionado)) {
					tipomensajecorreoinvenTemp=tipomensajecorreoinvenAux;
					break;
				}
			}


			sDescripcion=TipoMensajeCorreoInvenConstantesFunciones.getTipoMensajeCorreoInvenDescripcion(tipomensajecorreoinvenTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoMensajeCorreoInvenForeignKeyGenerico(Long idTipoMensajeCorreoInvenSeleccionado,JComboBox jComboBoxid_tipo_mensaje_correo_invenMensajeCorreoInvenGenerico)throws Exception
	{
		try
		{
			TipoMensajeCorreoInven  tipomensajecorreoinvenTemp=null;

			for(TipoMensajeCorreoInven tipomensajecorreoinvenAux:tipomensajecorreoinvensForeignKey) {
				if(tipomensajecorreoinvenAux.getId()!=null && tipomensajecorreoinvenAux.getId().equals(idTipoMensajeCorreoInvenSeleccionado)) {
					tipomensajecorreoinvenTemp=tipomensajecorreoinvenAux;
					break;
				}
			}

			if(tipomensajecorreoinvenTemp!=null) {
				jComboBoxid_tipo_mensaje_correo_invenMensajeCorreoInvenGenerico.setSelectedItem(tipomensajecorreoinvenTemp);
			} else {
				if(jComboBoxid_tipo_mensaje_correo_invenMensajeCorreoInvenGenerico!=null && jComboBoxid_tipo_mensaje_correo_invenMensajeCorreoInvenGenerico.getItemCount()>0) {
					jComboBoxid_tipo_mensaje_correo_invenMensajeCorreoInvenGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(MensajeCorreoInven mensajecorreoinven,JComboBox jComboBoxid_empresaMensajeCorreoInvenGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaMensajeCorreoInvenGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormMensajeCorreoInven.jComboBoxid_empresaMensajeCorreoInven.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaMensajeCorreoInvenGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				mensajecorreoinven.setid_empresa(empresaAux.getId());
				mensajecorreoinven.setempresa_descripcion(MensajeCorreoInvenConstantesFunciones.getEmpresaDescripcion(empresaAux));
				mensajecorreoinven.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(MensajeCorreoInven mensajecorreoinven,JComboBox jComboBoxid_sucursalMensajeCorreoInvenGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalMensajeCorreoInvenGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormMensajeCorreoInven.jComboBoxid_sucursalMensajeCorreoInven.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalMensajeCorreoInvenGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				mensajecorreoinven.setid_sucursal(sucursalAux.getId());
				mensajecorreoinven.setsucursal_descripcion(MensajeCorreoInvenConstantesFunciones.getSucursalDescripcion(sucursalAux));
				mensajecorreoinven.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarModuloForeignKey(MensajeCorreoInven mensajecorreoinven,JComboBox jComboBoxid_moduloMensajeCorreoInvenGenerico)throws Exception
	{
		try
		{
			Modulo  moduloAux=new Modulo();

			if(jComboBoxid_moduloMensajeCorreoInvenGenerico==null) {
				moduloAux=(Modulo)this.jInternalFrameDetalleFormMensajeCorreoInven.jComboBoxid_moduloMensajeCorreoInven.getSelectedItem();
			} else {
				moduloAux=(Modulo)jComboBoxid_moduloMensajeCorreoInvenGenerico.getSelectedItem();
			}

			if(moduloAux!=null && moduloAux.getId()!=null) {
				mensajecorreoinven.setid_modulo(moduloAux.getId());
				mensajecorreoinven.setmodulo_descripcion(MensajeCorreoInvenConstantesFunciones.getModuloDescripcion(moduloAux));
				mensajecorreoinven.setModulo(moduloAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoMensajeCorreoInvenForeignKey(MensajeCorreoInven mensajecorreoinven,JComboBox jComboBoxid_tipo_mensaje_correo_invenMensajeCorreoInvenGenerico)throws Exception
	{
		try
		{
			TipoMensajeCorreoInven  tipomensajecorreoinvenAux=new TipoMensajeCorreoInven();

			if(jComboBoxid_tipo_mensaje_correo_invenMensajeCorreoInvenGenerico==null) {
				tipomensajecorreoinvenAux=(TipoMensajeCorreoInven)this.jInternalFrameDetalleFormMensajeCorreoInven.jComboBoxid_tipo_mensaje_correo_invenMensajeCorreoInven.getSelectedItem();
			} else {
				tipomensajecorreoinvenAux=(TipoMensajeCorreoInven)jComboBoxid_tipo_mensaje_correo_invenMensajeCorreoInvenGenerico.getSelectedItem();
			}

			if(tipomensajecorreoinvenAux!=null && tipomensajecorreoinvenAux.getId()!=null) {
				mensajecorreoinven.setid_tipo_mensaje_correo_inven(tipomensajecorreoinvenAux.getId());
				mensajecorreoinven.settipomensajecorreoinven_descripcion(MensajeCorreoInvenConstantesFunciones.getTipoMensajeCorreoInvenDescripcion(tipomensajecorreoinvenAux));
				mensajecorreoinven.setTipoMensajeCorreoInven(tipomensajecorreoinvenAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEmpresasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEmpresa=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!MensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormMensajeCorreoInven!=null) { 
							this.jInternalFrameDetalleFormMensajeCorreoInven.jComboBoxid_empresaMensajeCorreoInven.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormMensajeCorreoInven.jComboBoxid_empresaMensajeCorreoInven.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormMensajeCorreoInven!=null) { 
					}

					if(!MensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameSucursalsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingSucursal=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!MensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormMensajeCorreoInven!=null) { 
							this.jInternalFrameDetalleFormMensajeCorreoInven.jComboBoxid_sucursalMensajeCorreoInven.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormMensajeCorreoInven.jComboBoxid_sucursalMensajeCorreoInven.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormMensajeCorreoInven!=null) { 
					}

					if(!MensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameModulosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingModulo=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!MensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormMensajeCorreoInven!=null) { 
							this.jInternalFrameDetalleFormMensajeCorreoInven.jComboBoxid_moduloMensajeCorreoInven.removeAllItems();

							for(Modulo modulo:this.modulosForeignKey) {
								this.jInternalFrameDetalleFormMensajeCorreoInven.jComboBoxid_moduloMensajeCorreoInven.addItem(modulo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormMensajeCorreoInven!=null) { 
					}

					if(!MensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoMensajeCorreoInvensForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoMensajeCorreoInven=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!MensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormMensajeCorreoInven!=null) { 
							this.jInternalFrameDetalleFormMensajeCorreoInven.jComboBoxid_tipo_mensaje_correo_invenMensajeCorreoInven.removeAllItems();

							for(TipoMensajeCorreoInven tipomensajecorreoinven:this.tipomensajecorreoinvensForeignKey) {
								this.jInternalFrameDetalleFormMensajeCorreoInven.jComboBoxid_tipo_mensaje_correo_invenMensajeCorreoInven.addItem(tipomensajecorreoinven);
							}
						}
					}

					if(this.jInternalFrameDetalleFormMensajeCorreoInven!=null) { 
					}

					if(!MensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoMensajeCorreoInven") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!MensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_mensaje_correo_invenFK_IdTipoMensajeCorreoInvenMensajeCorreoInven.removeAllItems();

							for(TipoMensajeCorreoInven tipomensajecorreoinven:this.tipomensajecorreoinvensForeignKey) {
								this.jComboBoxid_tipo_mensaje_correo_invenFK_IdTipoMensajeCorreoInvenMensajeCorreoInven.addItem(tipomensajecorreoinven);
							}
						}

						if(!MensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormMensajeCorreoInven!=null) {
							this.jInternalFrameDetalleFormMensajeCorreoInven.jComboBoxid_empresaMensajeCorreoInven.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormMensajeCorreoInven!=null) {
							this.jInternalFrameDetalleFormMensajeCorreoInven.jComboBoxid_empresaMensajeCorreoInven.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameSucursalForeignKey(Sucursal sucursal,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormMensajeCorreoInven!=null) {
							this.jInternalFrameDetalleFormMensajeCorreoInven.jComboBoxid_sucursalMensajeCorreoInven.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormMensajeCorreoInven!=null) {
							this.jInternalFrameDetalleFormMensajeCorreoInven.jComboBoxid_sucursalMensajeCorreoInven.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameModuloForeignKey(Modulo modulo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormMensajeCorreoInven!=null) {
							this.jInternalFrameDetalleFormMensajeCorreoInven.jComboBoxid_moduloMensajeCorreoInven.setSelectedItem(modulo);
						}
					} else {
						if(this.jInternalFrameDetalleFormMensajeCorreoInven!=null) {
							this.jInternalFrameDetalleFormMensajeCorreoInven.jComboBoxid_moduloMensajeCorreoInven.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoMensajeCorreoInvenForeignKey(TipoMensajeCorreoInven tipomensajecorreoinven,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormMensajeCorreoInven!=null) {
							this.jInternalFrameDetalleFormMensajeCorreoInven.jComboBoxid_tipo_mensaje_correo_invenMensajeCorreoInven.setSelectedItem(tipomensajecorreoinven);
						}
					} else {
						if(this.jInternalFrameDetalleFormMensajeCorreoInven!=null) {
							this.jInternalFrameDetalleFormMensajeCorreoInven.jComboBoxid_tipo_mensaje_correo_invenMensajeCorreoInven.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_mensaje_correo_invenFK_IdTipoMensajeCorreoInvenMensajeCorreoInven.setSelectedItem(tipomensajecorreoinven);
						} else {
							this.jComboBoxid_tipo_mensaje_correo_invenFK_IdTipoMensajeCorreoInvenMensajeCorreoInven.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesMensajeCorreoInven() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			MensajeCorreoInvenConstantesFunciones.refrescarForeignKeysDescripcionesMensajeCorreoInven(this.mensajecorreoinvenLogic.getMensajeCorreoInvens());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			MensajeCorreoInvenConstantesFunciones.refrescarForeignKeysDescripcionesMensajeCorreoInven(this.mensajecorreoinvens);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Modulo.class));
		classes.add(new Classe(TipoMensajeCorreoInven.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//mensajecorreoinvenLogic.setMensajeCorreoInvens(this.mensajecorreoinvens);
			mensajecorreoinvenLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		*/				
	}	
	
	
	
	public Integer getiNumeroPaginacion() {
		return iNumeroPaginacion;
	}

	public void setiNumeroPaginacion(Integer iNumeroPaginacion) {
		this.iNumeroPaginacion= iNumeroPaginacion;
	}
	
	public Integer getiNumeroPaginacionPagina() {
		return iNumeroPaginacionPagina;
	}

	public void setiNumeroPaginacionPagina(Integer iNumeroPaginacionPagina) {
		this.iNumeroPaginacionPagina= iNumeroPaginacionPagina;
	}
	
	
	public Boolean getIsSeleccionarTodos() {
		return this.isSeleccionarTodos;
	}

	public void setIsSeleccionarTodos(Boolean isSeleccionarTodos) {
		this.isSeleccionarTodos= isSeleccionarTodos;
	}
	
	public Boolean getEsControlTabla() {
		return this.esControlTabla;
	}

	public void setEsControlTabla(Boolean esControlTabla) {
		this.esControlTabla= esControlTabla;
	}
	
	public Boolean getIsSeleccionados() {
		return this.isSeleccionados;
	}

	public void setIsSeleccionados(Boolean isSeleccionados) {
		this.isSeleccionados= isSeleccionados;
	}
	
	public Boolean getIsPostAccionNuevo() {
		return this.isPostAccionNuevo;
	}

	public void setIsPostAccionNuevo(Boolean isPostAccionNuevo) {
		this.isPostAccionNuevo= isPostAccionNuevo;
	}
	
	public Boolean getIsPostAccionSinCerrar() {
		return this.isPostAccionSinCerrar;
	}

	public void setIsPostAccionSinCerrar(Boolean isPostAccionSinCerrar) {
		this.isPostAccionSinCerrar= isPostAccionSinCerrar;
	}
	
	public Boolean getIsPostAccionSinMensaje() {
		return this.isPostAccionSinMensaje;
	}

	public void setIsPostAccionSinMensaje(Boolean isPostAccionSinMensaje) {
		this.isPostAccionSinMensaje= isPostAccionSinMensaje;
	}
	
	public Boolean getConGraficoReporte() {
		return this.conGraficoReporte;
	}

	public void setConGraficoReporte(Boolean conGraficoReporte) {
		this.conGraficoReporte= conGraficoReporte;
	}
	
	
	public ArrayList<Reporte> gettiposArchivosReportes() {
		return this.tiposArchivosReportes;
	}
	
	public void settiposArchivosReportes(ArrayList<Reporte> tiposArchivosReportes) {
		this.tiposArchivosReportes = tiposArchivosReportes;
	}
	
	//TIPOS ARCHIVOS DINAMICOS
	public ArrayList<Reporte> gettiposArchivosReportesDinamico() {
		return this.tiposArchivosReportesDinamico;
	}
	
	public void settiposArchivosReportesDinamico(ArrayList<Reporte> tiposArchivosReportesDinamico) {
		this.tiposArchivosReportesDinamico = tiposArchivosReportesDinamico;
	}
	
	//TIPOS REPORTES
	public ArrayList<Reporte> gettiposReportes() {
		return this.tiposReportes;
	}
	
	public void settiposReportes(ArrayList<Reporte> tiposReportes) {
		this.tiposReportes = tiposReportes;
	}
	
	//TIPOS REPORTES
	public ArrayList<Reporte> gettiposReportesDinamico() {
		return this.tiposReportesDinamico;
	}
	
	public void settiposReportesDinamico(ArrayList<Reporte> tiposReportesDinamico) {
		this.tiposReportesDinamico = tiposReportesDinamico;
	}
	
	//TIPOS GRAFICOS REPORTES
	public ArrayList<Reporte> gettiposGraficosReportes() {
		return this.tiposGraficosReportes;
	}
	
	public void settiposGraficosReportes(ArrayList<Reporte> tiposGraficosReportes) {
		this.tiposGraficosReportes = tiposGraficosReportes;
	}
	
	public ArrayList<Reporte> gettiposPaginacion() {
		return this.tiposPaginacion;
	}
	
	public void settiposPaginacion(ArrayList<Reporte> tiposPaginacion) {
		this.tiposPaginacion = tiposPaginacion;
	}
	
	public ArrayList<Reporte> gettiposRelaciones() {
		return this.tiposRelaciones;
	}
	
	public void settiposRelaciones(ArrayList<Reporte> tiposRelaciones) {
		this.tiposRelaciones= tiposRelaciones;
	}
	
	public ArrayList<Reporte> gettiposAcciones() {
		return this.tiposAcciones;
	}
	
	public void settiposAcciones(ArrayList<Reporte> tiposAcciones) {
		this.tiposAcciones = tiposAcciones;
	}
	
	public ArrayList<Reporte> gettiposAccionesFormulario() {
		return this.tiposAccionesFormulario;
	}
	
	public void settiposAccionesFormulario(ArrayList<Reporte> tiposAccionesFormulario) {
		this.tiposAccionesFormulario = tiposAccionesFormulario;
	}
	
	public ArrayList<Reporte> gettiposSeleccionar() {
		return this.tiposSeleccionar;
	}
	
	public void settiposSeleccionar(ArrayList<Reporte> tiposSeleccionar) {
		this.tiposSeleccionar = tiposSeleccionar;
	}
	
	public ArrayList<Reporte> gettiposColumnasSelect() {
		return this.tiposColumnasSelect;
	}
	
	public void settiposColumnasSelect(ArrayList<Reporte> tiposColumnasSelect) {
		this.tiposColumnasSelect = tiposColumnasSelect;
	}
		
	public ArrayList<Reporte> gettiposRelacionesSelect() {
		return this.tiposRelacionesSelect;
	}
	
	public void settiposRelacionesSelect(ArrayList<Reporte> tiposRelacionesSelect) {
		this.tiposRelacionesSelect = tiposRelacionesSelect;
	}
	
	public Long getIIdUsuarioSesion() {
		return lIdUsuarioSesion;
	}

	public void setIIdUsuarioSesion(Long lIdUsuarioSesion) {
		this.lIdUsuarioSesion = lIdUsuarioSesion;
	}
	
	
	public List<Accion> getAccions() {
		return this.accions;
	}

	public void setAccions(List<Accion> accions) {
		this.accions = accions;
	}
	
	public List<Accion> getAccionsFormulario() {
		return this.accionsFormulario;
	}

	public void setAccionsFormulario(List<Accion> accionsFormulario) {
		this.accionsFormulario = accionsFormulario;
	}
	
	public String getsAccionMantenimiento() {
		return sAccionMantenimiento;
	}

	public void setsAccionMantenimiento(String sAccionMantenimiento) {
		this.sAccionMantenimiento = sAccionMantenimiento;
	}

	public String getsAccionBusqueda() {
		return sAccionBusqueda;
	}

	public void setsAccionBusqueda(String sAccionBusqueda) {
		this.sAccionBusqueda = sAccionBusqueda;
	}

	public String getsAccionAdicional() {
		return sAccionAdicional;
	}

	public void setsAccionAdicional(String sAccionAdicional) {
		this.sAccionAdicional = sAccionAdicional;
	}

	public String getsUltimaBusqueda() {
		return sUltimaBusqueda;
	}

	public void setsUltimaBusqueda(String sUltimaBusqueda) {
		this.sUltimaBusqueda = sUltimaBusqueda;
	}
	
	public String getsTipoArchivoReporte() {
		return sTipoArchivoReporte;
	}

	public void setsTipoArchivoReporte(String sTipoArchivoReporte) {
		this.sTipoArchivoReporte = sTipoArchivoReporte;
	}
	
	public String getsTipoArchivoReporteDinamico() {
		return sTipoArchivoReporteDinamico;
	}

	public void setsTipoArchivoReporteDinamico(String sTipoArchivoReporteDinamico) {
		this.sTipoArchivoReporteDinamico = sTipoArchivoReporteDinamico;
	}
	
	public String getsTipoReporte() {
		return sTipoReporte;
	}

	public void setsTipoReporte(String sTipoReporte) {
		this.sTipoReporte = sTipoReporte;
	}
	
	public String getsTipoReporteDinamico() {
		return sTipoReporteDinamico;
	}

	public void setsTipoReporteDinamico(String sTipoReporteDinamico) {
		this.sTipoReporteDinamico = sTipoReporteDinamico;
	}
	
	public String getsTipoGraficoReporte() {
		return sTipoGraficoReporte;
	}

	public void setsTipoGraficoReporte(String sTipoGraficoReporte) {
		this.sTipoGraficoReporte = sTipoGraficoReporte;
	}
	
	public String getsTipoPaginacion() {
		return sTipoPaginacion;
	}

	public void setsTipoPaginacion(String sTipoPaginacion) {
		this.sTipoPaginacion = sTipoPaginacion;
	}
	
	public String getsTipoRelacion() {
		return sTipoRelacion;
	}

	public void setsTipoRelacion(String sTipoRelacion) {
		this.sTipoRelacion = sTipoRelacion;
	}
	
	public String getsTipoAccion() {
		return sTipoAccion;
	}

	public void setsTipoAccion(String sTipoAccion) {
		this.sTipoAccion = sTipoAccion;
	}
	
	public String getsTipoAccionFormulario() {
		return sTipoAccionFormulario;
	}

	public void setsTipoAccionFormulario(String sTipoAccionFormulario) {
		this.sTipoAccionFormulario = sTipoAccionFormulario;
	}
	
	public String getsTipoSeleccionar() {
		return sTipoSeleccionar;
	}

	public void setsTipoSeleccionar(String sTipoSeleccionar) {
		this.sTipoSeleccionar = sTipoSeleccionar;
	}
	
	public String getsValorCampoGeneral() {
		return sValorCampoGeneral;
	}

	public void setsValorCampoGeneral(String sValorCampoGeneral) {
		this.sValorCampoGeneral = sValorCampoGeneral;
	}			

	public String getsDetalleReporte() {
		return sDetalleReporte;
	}

	public void setsDetalleReporte(String sDetalleReporte) {
		this.sDetalleReporte = sDetalleReporte;
	}
	
	
	public String getsTipoReporteExtra() {
		return sTipoReporteExtra;
	}

	public void setsTipoReporteExtra(String sTipoReporteExtra) {
		this.sTipoReporteExtra = sTipoReporteExtra;
	}
	
	public Boolean getesReporteDinamico() {
		return esReporteDinamico;
	}	
	
	public void setesReporteDinamico(Boolean esReporteDinamico) {
		this.esReporteDinamico = esReporteDinamico;
	}
	
	public Boolean getesRecargarFks() {
		return esRecargarFks;
	}	
	
	public void setesRecargarFks(Boolean esRecargarFks) {
		this.esRecargarFks = esRecargarFks;
	}
	
	public Boolean getesReporteAccionProceso() {
		return esReporteAccionProceso;
	}	
	
	public void setesReporteAccionProceso(Boolean esReporteAccionProceso) {
		this.esReporteAccionProceso= esReporteAccionProceso;
	}
		
	public MensajeCorreoInvenParameterReturnGeneral getMensajeCorreoInvenParameterGeneral() {
		return this.mensajecorreoinvenParameterGeneral;
	}
	
	public void setMensajeCorreoInvenParameterGeneral(MensajeCorreoInvenParameterReturnGeneral mensajecorreoinvenParameterGeneral) {
		this.mensajecorreoinvenParameterGeneral = mensajecorreoinvenParameterGeneral;
	}
	
	public String getsPathReporteDinamico() {
		return sPathReporteDinamico;
	}

	public void setsPathReporteDinamico(String sPathReporteDinamico) {
		this.sPathReporteDinamico = sPathReporteDinamico;
	}
		
	public Boolean getisMostrarNumeroPaginacion() {
		return isMostrarNumeroPaginacion;
	}

	public void setisMostrarNumeroPaginacion(Boolean isMostrarNumeroPaginacion) {
		this.isMostrarNumeroPaginacion = isMostrarNumeroPaginacion;
	}
	
	public Mensaje getMensaje() {
		return mensaje;
	}

	public void setMensaje(Mensaje mensaje) {
		this.mensaje = mensaje;
	}
	
	public Boolean getIsPermisoTodoMensajeCorreoInven() {
		return isPermisoTodoMensajeCorreoInven;
	}

	public void setIsPermisoTodoMensajeCorreoInven(Boolean isPermisoTodoMensajeCorreoInven) {
		this.isPermisoTodoMensajeCorreoInven = isPermisoTodoMensajeCorreoInven;
	}

	public Boolean getIsPermisoNuevoMensajeCorreoInven() {
		return isPermisoNuevoMensajeCorreoInven;
	}

	public void setIsPermisoNuevoMensajeCorreoInven(Boolean isPermisoNuevoMensajeCorreoInven) {
		this.isPermisoNuevoMensajeCorreoInven = isPermisoNuevoMensajeCorreoInven;
	}

	public Boolean getIsPermisoActualizarMensajeCorreoInven() {
		return isPermisoActualizarMensajeCorreoInven;
	}

	public void setIsPermisoActualizarMensajeCorreoInven(Boolean isPermisoActualizarMensajeCorreoInven) {
		this.isPermisoActualizarMensajeCorreoInven = isPermisoActualizarMensajeCorreoInven;
	}

	public Boolean getIsPermisoEliminarMensajeCorreoInven() {
		return isPermisoEliminarMensajeCorreoInven;
	}

	public void setIsPermisoEliminarMensajeCorreoInven(Boolean isPermisoEliminarMensajeCorreoInven) {
		this.isPermisoEliminarMensajeCorreoInven = isPermisoEliminarMensajeCorreoInven;
	}

	public Boolean getIsPermisoGuardarCambiosMensajeCorreoInven() {
		return isPermisoGuardarCambiosMensajeCorreoInven;
	}

	public void setIsPermisoGuardarCambiosMensajeCorreoInven(Boolean isPermisoGuardarCambiosMensajeCorreoInven) {
		this.isPermisoGuardarCambiosMensajeCorreoInven = isPermisoGuardarCambiosMensajeCorreoInven;
	}
	
	public Boolean getIsPermisoConsultaMensajeCorreoInven() {
		return isPermisoConsultaMensajeCorreoInven;
	}

	public void setIsPermisoConsultaMensajeCorreoInven(Boolean isPermisoConsultaMensajeCorreoInven) {
		this.isPermisoConsultaMensajeCorreoInven = isPermisoConsultaMensajeCorreoInven;
	}

	public Boolean getIsPermisoBusquedaMensajeCorreoInven() {
		return isPermisoBusquedaMensajeCorreoInven;
	}

	public void setIsPermisoBusquedaMensajeCorreoInven(Boolean isPermisoBusquedaMensajeCorreoInven) {
		this.isPermisoBusquedaMensajeCorreoInven = isPermisoBusquedaMensajeCorreoInven;
	}

	public Boolean getIsPermisoReporteMensajeCorreoInven() {
		return isPermisoReporteMensajeCorreoInven;
	}

	public void setIsPermisoReporteMensajeCorreoInven(Boolean isPermisoReporteMensajeCorreoInven) {
		this.isPermisoReporteMensajeCorreoInven = isPermisoReporteMensajeCorreoInven;
	}
	
	public Boolean getIsPermisoPaginacionMedioMensajeCorreoInven() {
		return isPermisoPaginacionMedioMensajeCorreoInven;
	}

	public void setIsPermisoPaginacionMedioMensajeCorreoInven(Boolean isPermisoPaginacionMedioMensajeCorreoInven) {
		this.isPermisoPaginacionMedioMensajeCorreoInven = isPermisoPaginacionMedioMensajeCorreoInven;
	}
	
	public Boolean getIsPermisoPaginacionTodoMensajeCorreoInven() {
		return isPermisoPaginacionTodoMensajeCorreoInven;
	}

	public void setIsPermisoPaginacionTodoMensajeCorreoInven(Boolean isPermisoPaginacionTodoMensajeCorreoInven) {
		this.isPermisoPaginacionTodoMensajeCorreoInven = isPermisoPaginacionTodoMensajeCorreoInven;
	}
	
	public Boolean getIsPermisoPaginacionAltoMensajeCorreoInven() {
		return isPermisoPaginacionAltoMensajeCorreoInven;
	}

	public void setIsPermisoPaginacionAltoMensajeCorreoInven(Boolean isPermisoPaginacionAltoMensajeCorreoInven) {
		this.isPermisoPaginacionAltoMensajeCorreoInven = isPermisoPaginacionAltoMensajeCorreoInven;
	}
	
	public Boolean getIsPermisoCopiarMensajeCorreoInven() {
		return isPermisoCopiarMensajeCorreoInven;
	}

	public void setIsPermisoCopiarMensajeCorreoInven(Boolean isPermisoCopiarMensajeCorreoInven) {
		this.isPermisoCopiarMensajeCorreoInven = isPermisoCopiarMensajeCorreoInven;
	}
	
	public Boolean getIsPermisoVerFormMensajeCorreoInven() {
		return isPermisoVerFormMensajeCorreoInven;
	}

	public void setIsPermisoVerFormMensajeCorreoInven(Boolean isPermisoVerFormMensajeCorreoInven) {
		this.isPermisoVerFormMensajeCorreoInven = isPermisoVerFormMensajeCorreoInven;
	}
	
	public Boolean getIsPermisoDuplicarMensajeCorreoInven() {
		return isPermisoDuplicarMensajeCorreoInven;
	}

	public void setIsPermisoDuplicarMensajeCorreoInven(Boolean isPermisoDuplicarMensajeCorreoInven) {
		this.isPermisoDuplicarMensajeCorreoInven = isPermisoDuplicarMensajeCorreoInven;
	}
	
	public Boolean getIsPermisoOrdenMensajeCorreoInven() {
		return isPermisoOrdenMensajeCorreoInven;
	}

	public void setIsPermisoOrdenMensajeCorreoInven(Boolean isPermisoOrdenMensajeCorreoInven) {
		this.isPermisoOrdenMensajeCorreoInven = isPermisoOrdenMensajeCorreoInven;
	}
	
	public String getsVisibilidadTablaBusquedas() {
		return sVisibilidadTablaBusquedas;
	}

	public void setsVisibilidadTablaBusquedas(String sVisibilidadTablaBusquedas) {
		this.sVisibilidadTablaBusquedas = sVisibilidadTablaBusquedas;
	}
	
	public String getsVisibilidadTablaElementos() {
		return sVisibilidadTablaElementos;
	}

	public void setsVisibilidadTablaElementos(String sVisibilidadTablaElementos) {
		this.sVisibilidadTablaElementos = sVisibilidadTablaElementos;
	}

	public String getsVisibilidadTablaAcciones() {
		return sVisibilidadTablaAcciones;
	}

	public void setsVisibilidadTablaAcciones(String sVisibilidadTablaAcciones) {
		this.sVisibilidadTablaAcciones = sVisibilidadTablaAcciones;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoMensajeCorreoInven() {
		return isVisibilidadCeldaNuevoMensajeCorreoInven;
	}

	public void setIsVisibilidadCeldaNuevoMensajeCorreoInven(Boolean isVisibilidadCeldaNuevoMensajeCorreoInven) {
		this.isVisibilidadCeldaNuevoMensajeCorreoInven = isVisibilidadCeldaNuevoMensajeCorreoInven;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarMensajeCorreoInven() {
		return isVisibilidadCeldaDuplicarMensajeCorreoInven;
	}

	public void setIsVisibilidadCeldaDuplicarMensajeCorreoInven(Boolean isVisibilidadCeldaDuplicarMensajeCorreoInven) {
		this.isVisibilidadCeldaDuplicarMensajeCorreoInven = isVisibilidadCeldaDuplicarMensajeCorreoInven;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarMensajeCorreoInven() {
		return isVisibilidadCeldaCopiarMensajeCorreoInven;
	}

	public void setIsVisibilidadCeldaCopiarMensajeCorreoInven(Boolean isVisibilidadCeldaCopiarMensajeCorreoInven) {
		this.isVisibilidadCeldaCopiarMensajeCorreoInven = isVisibilidadCeldaCopiarMensajeCorreoInven;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormMensajeCorreoInven() {
		return isVisibilidadCeldaVerFormMensajeCorreoInven;
	}

	public void setIsVisibilidadCeldaVerFormMensajeCorreoInven(Boolean isVisibilidadCeldaVerFormMensajeCorreoInven) {
		this.isVisibilidadCeldaVerFormMensajeCorreoInven = isVisibilidadCeldaVerFormMensajeCorreoInven;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenMensajeCorreoInven() {
		return isVisibilidadCeldaOrdenMensajeCorreoInven;
	}

	public void setIsVisibilidadCeldaOrdenMensajeCorreoInven(Boolean isVisibilidadCeldaOrdenMensajeCorreoInven) {
		this.isVisibilidadCeldaOrdenMensajeCorreoInven = isVisibilidadCeldaOrdenMensajeCorreoInven;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesMensajeCorreoInven() {
		return isVisibilidadCeldaNuevoRelacionesMensajeCorreoInven;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesMensajeCorreoInven(Boolean isVisibilidadCeldaNuevoRelacionesMensajeCorreoInven) {
		this.isVisibilidadCeldaNuevoRelacionesMensajeCorreoInven = isVisibilidadCeldaNuevoRelacionesMensajeCorreoInven;
	}
	
	public Boolean getIsVisibilidadCeldaModificarMensajeCorreoInven() {
		return isVisibilidadCeldaModificarMensajeCorreoInven;
	}

	public void setIsVisibilidadCeldaModificarMensajeCorreoInven(Boolean isVisibilidadCeldaModificarMensajeCorreoInven) {
		this.isVisibilidadCeldaModificarMensajeCorreoInven = isVisibilidadCeldaModificarMensajeCorreoInven;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarMensajeCorreoInven() {
		return isVisibilidadCeldaActualizarMensajeCorreoInven;
	}

	public void setIsVisibilidadCeldaActualizarMensajeCorreoInven(Boolean isVisibilidadCeldaActualizarMensajeCorreoInven) {
		this.isVisibilidadCeldaActualizarMensajeCorreoInven = isVisibilidadCeldaActualizarMensajeCorreoInven;
	}

	public Boolean getIsVisibilidadCeldaEliminarMensajeCorreoInven() {
		return isVisibilidadCeldaEliminarMensajeCorreoInven;
	}

	public void setIsVisibilidadCeldaEliminarMensajeCorreoInven(Boolean isVisibilidadCeldaEliminarMensajeCorreoInven) {
		this.isVisibilidadCeldaEliminarMensajeCorreoInven = isVisibilidadCeldaEliminarMensajeCorreoInven;
	}

	public Boolean getIsVisibilidadCeldaCancelarMensajeCorreoInven() {
		return isVisibilidadCeldaCancelarMensajeCorreoInven;
	}

	public void setIsVisibilidadCeldaCancelarMensajeCorreoInven(Boolean isVisibilidadCeldaCancelarMensajeCorreoInven) {
		this.isVisibilidadCeldaCancelarMensajeCorreoInven = isVisibilidadCeldaCancelarMensajeCorreoInven;
	}

	public Boolean getIsVisibilidadCeldaGuardarMensajeCorreoInven() {
		return isVisibilidadCeldaGuardarMensajeCorreoInven;
	}

	public void setIsVisibilidadCeldaGuardarMensajeCorreoInven(Boolean isVisibilidadCeldaGuardarMensajeCorreoInven) {
		this.isVisibilidadCeldaGuardarMensajeCorreoInven = isVisibilidadCeldaGuardarMensajeCorreoInven;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosMensajeCorreoInven() {
		return isVisibilidadCeldaGuardarCambiosMensajeCorreoInven;
	}

	public void setIsVisibilidadCeldaGuardarCambiosMensajeCorreoInven(Boolean isVisibilidadCeldaGuardarCambiosMensajeCorreoInven) {
		this.isVisibilidadCeldaGuardarCambiosMensajeCorreoInven = isVisibilidadCeldaGuardarCambiosMensajeCorreoInven;
	}
		
	public MensajeCorreoInvenSessionBean getmensajecorreoinvenSessionBean() {
		return this.mensajecorreoinvenSessionBean;
	}
	
	public void setmensajecorreoinvenSessionBean(MensajeCorreoInvenSessionBean mensajecorreoinvenSessionBean) {
		this.mensajecorreoinvenSessionBean=mensajecorreoinvenSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdModulo() {
		return this.isVisibilidadFK_IdModulo;
	}

	public void setisVisibilidadFK_IdModulo(Boolean isVisibilidadFK_IdModulo) {
		this.isVisibilidadFK_IdModulo=isVisibilidadFK_IdModulo;
	}

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	public Boolean getisVisibilidadFK_IdTipoMensajeCorreoInven() {
		return this.isVisibilidadFK_IdTipoMensajeCorreoInven;
	}

	public void setisVisibilidadFK_IdTipoMensajeCorreoInven(Boolean isVisibilidadFK_IdTipoMensajeCorreoInven) {
		this.isVisibilidadFK_IdTipoMensajeCorreoInven=isVisibilidadFK_IdTipoMensajeCorreoInven;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysMensajeCorreoInven(MensajeCorreoInven mensajecorreoinven)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(mensajecorreoinven,null);
				this.setActualParaGuardarSucursalForeignKey(mensajecorreoinven,null);
				this.setActualParaGuardarModuloForeignKey(mensajecorreoinven,null);
				this.setActualParaGuardarTipoMensajeCorreoInvenForeignKey(mensajecorreoinven,null);
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarLicenciaCliente(DatosCliente datosCliente) throws Exception {
		Boolean existe=false;
			
		try {
				InputStream reportFile=null;
				
				String sPath=this.parametroGeneralUsuario.getpath_exportar()+"erp_bydan/license/license.xml";
				
				reportFile = new FileInputStream(sPath);
				
				Document documentBuilder=null;
				
				if(this.constantes2.DOCUMENT_BUILDER==null) {
					documentBuilder=Funciones2.parseXml(reportFile);
				} else {
					documentBuilder=this.constantes2.DOCUMENT_BUILDER;
				}
				
				//GlobalSeguridad.readXml(documentBuilder);
				
				String sNamePCServerLicencia="";
				String sClaveSistemaLicencia="";
				Date dFechaServerLicencia=null;
				
				//CARGAR ELEMENTOS DE LICENCIA
				NodeList nodeList = documentBuilder.getElementsByTagName("Licencia");
				
				for (int iIndice = 0; iIndice < nodeList.getLength(); iIndice++) {
					Node node = nodeList.item(iIndice);
				
					if (node.getNodeType() == Node.ELEMENT_NODE) {
						Element element = (Element) node;
						 
						sNamePCServerLicencia=element.getElementsByTagName("NombrePc").item(0).getTextContent();
						sClaveSistemaLicencia=element.getElementsByTagName("ClaveSistema").item(0).getTextContent();
						
						existe=true;
						break;
					}
				}														
			
				
			if(existe) {
				datosCliente.setsClaveSistema(sClaveSistemaLicencia);
				
				if(!datosCliente.getsNamePCServer().equals(sNamePCServerLicencia)
					&& !datosCliente.getsNamePCServer().equals("")) {
					
					datosCliente.setsNamePCServer(sNamePCServerLicencia);
				}
			} else {
				throw new Exception("NO EXISTE LICENCIA O NO ESTA BIEN FORMADO");
			}
		} catch(Exception e) {
			throw new Exception("NO EXISTE LICENCIA O NO ESTA BIEN FORMADO");
		}						
	}
	
	public void cargarDatosCliente() throws Exception {
		String sPrimerMacAddress="";		
		String sHostName="";		 
		String sHostIp="";		  
		String sHostUser="";
		
		
		sPrimerMacAddress=FuncionesNetwork.getPrimerMacAddress();		
		sHostName=FuncionesNetwork.getHostName();		 
		sHostIp=FuncionesNetwork.getHostIp();		  
		sHostUser=FuncionesNetwork.getHostUser();
		
		
		this.datosCliente=new DatosCliente();
		if(lIdUsuarioSesion!=null){datosCliente.setIdUsuario(this.lIdUsuarioSesion);}
		
		//SERVIDOR WEB Y TALVEZ SERVIDOR SWING WINDOWS
		this.datosCliente.setsUsuarioPCServer(sHostUser);
		this.datosCliente.setsNamePCServer(sHostName);
		this.datosCliente.setsIPPCServer(sHostIp);
		this.datosCliente.setsMacAddressPCServer(sPrimerMacAddress);
			
			//CLIENTE SWING WINDOWS
			this.datosCliente.setIsClienteWeb(false);
			
			this.datosCliente.setsUsuarioPC(sHostUser);
			this.datosCliente.setsNamePC(sHostName);
			this.datosCliente.setsIPPC(sHostIp);
			this.datosCliente.setsMacAddressPC(sPrimerMacAddress);	
			
			
			//this.cargarLicenciaCliente(this.datosCliente);
			
	}
	
	public void bugActualizarReferenciaActual(MensajeCorreoInven mensajecorreoinven,MensajeCorreoInven mensajecorreoinvenAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalMensajeCorreoInven(mensajecorreoinven);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		mensajecorreoinvenAux.setId(mensajecorreoinven.getId());
		mensajecorreoinvenAux.setVersionRow(mensajecorreoinven.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessMensajeCorreoInven();
		
			int intSelectedRow = this.jTableDatosMensajeCorreoInven.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mensajecorreoinven =(MensajeCorreoInven) this.mensajecorreoinvenLogic.getMensajeCorreoInvens().toArray()[this.jTableDatosMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.mensajecorreoinven =(MensajeCorreoInven) this.mensajecorreoinvens.toArray()[this.jTableDatosMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(MensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualMensajeCorreoInven(this.mensajecorreoinven,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysMensajeCorreoInven(this.mensajecorreoinven);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = mensajecorreoinvenValidator.getInvalidValues(this.mensajecorreoinven);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			mensajecorreoinvenLogic.setDatosCliente(datosCliente);
			mensajecorreoinvenLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				mensajecorreoinvenAux=new  MensajeCorreoInven();
				
				mensajecorreoinvenAux.setIsNew(true);
				mensajecorreoinvenAux.setIsChanged(true);
				
				mensajecorreoinvenAux.setMensajeCorreoInvenOriginal(this.mensajecorreoinven);
				
				mensajecorreoinvenAux.setId(this.mensajecorreoinven.getId());	
				mensajecorreoinvenAux.setVersionRow(this.mensajecorreoinven.getVersionRow());	
				mensajecorreoinvenAux.setid_empresa(this.mensajecorreoinven.getid_empresa());	
				mensajecorreoinvenAux.setid_sucursal(this.mensajecorreoinven.getid_sucursal());	
				mensajecorreoinvenAux.setid_modulo(this.mensajecorreoinven.getid_modulo());	
				mensajecorreoinvenAux.setid_tipo_mensaje_correo_inven(this.mensajecorreoinven.getid_tipo_mensaje_correo_inven());	
				mensajecorreoinvenAux.settema(this.mensajecorreoinven.gettema());	
				mensajecorreoinvenAux.setmensaje(this.mensajecorreoinven.getmensaje());	
				mensajecorreoinvenAux.setaviso(this.mensajecorreoinven.getaviso());	
				mensajecorreoinvenAux.setesta_activo(this.mensajecorreoinven.getesta_activo());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.mensajecorreoinvenSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(mensajecorreoinvenAux,mensajecorreoinvenLogic.getMensajeCorreoInvens());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(mensajecorreoinvenAux,mensajecorreoinvens);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.mensajecorreoinvenSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						mensajecorreoinvenLogic.saveMensajeCorreoInvens();//WithConnection
						//mensajecorreoinvenLogic.getSetVersionRowMensajeCorreoInvens();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.mensajecorreoinven,mensajecorreoinvenAux);
					
					this.refrescarForeignKeysDescripcionesMensajeCorreoInven();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.mensajecorreoinvenSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFrame.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens().addAll(this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFrame.detallemensajecorreoinvensEliminados);
							this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFrame.mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens().addAll(this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFrame.mailmensajecorreoinvensEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFrame.detallemensajecorreoinvens.addAll(this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFrame.detallemensajecorreoinvensEliminados);
							this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFrame.mailmensajecorreoinvens.addAll(this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFrame.mailmensajecorreoinvensEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								mensajecorreoinvenLogic.saveMensajeCorreoInvenRelaciones(mensajecorreoinvenAux,this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFrame.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens(),this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFrame.mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens());//WithConnection
								//mensajecorreoinvenLogic.getSetVersionRowMensajeCorreoInvens();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.mensajecorreoinven,mensajecorreoinvenAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFrame.detallemensajecorreoinvenLogic.setDetalleMensajeCorreoInvens(new ArrayList<DetalleMensajeCorreoInven>());
							this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFrame.mailmensajecorreoinvenLogic.setMailMensajeCorreoInvens(new ArrayList<MailMensajeCorreoInven>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFrame.detallemensajecorreoinvens= new ArrayList<DetalleMensajeCorreoInven>();
							this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFrame.mailmensajecorreoinvens= new ArrayList<MailMensajeCorreoInven>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFrame.quitarFilaTotales();}
							mensajecorreoinvenAux.setDetalleMensajeCorreoInvens(this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFrame.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens());

							if(this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFrame.quitarFilaTotales();}
							mensajecorreoinvenAux.setMailMensajeCorreoInvens(this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFrame.mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.mensajecorreoinvenSessionBean.getEstaModoGuardarRelaciones() 
									|| this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(mensajecorreoinvenAux,mensajecorreoinvenLogic.getMensajeCorreoInvens());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(mensajecorreoinvenAux,mensajecorreoinvens);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.mensajecorreoinven,mensajecorreoinvenAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				mensajecorreoinvenAux=new  MensajeCorreoInven();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado() 
					|| (this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado() && this.mensajecorreoinven.getId()>=0)) {
						
					mensajecorreoinvenAux.setIsNew(false);
				}
				
				mensajecorreoinvenAux.setIsDeleted(false);
			
				mensajecorreoinvenAux.setId(this.mensajecorreoinven.getId());	
				mensajecorreoinvenAux.setVersionRow(this.mensajecorreoinven.getVersionRow());	
				mensajecorreoinvenAux.setid_empresa(this.mensajecorreoinven.getid_empresa());	
				mensajecorreoinvenAux.setid_sucursal(this.mensajecorreoinven.getid_sucursal());	
				mensajecorreoinvenAux.setid_modulo(this.mensajecorreoinven.getid_modulo());	
				mensajecorreoinvenAux.setid_tipo_mensaje_correo_inven(this.mensajecorreoinven.getid_tipo_mensaje_correo_inven());	
				mensajecorreoinvenAux.settema(this.mensajecorreoinven.gettema());	
				mensajecorreoinvenAux.setmensaje(this.mensajecorreoinven.getmensaje());	
				mensajecorreoinvenAux.setaviso(this.mensajecorreoinven.getaviso());	
				mensajecorreoinvenAux.setesta_activo(this.mensajecorreoinven.getesta_activo());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(mensajecorreoinvenAux,mensajecorreoinvenLogic.getMensajeCorreoInvens());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(mensajecorreoinvenAux,mensajecorreoinvens);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.mensajecorreoinvenSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						mensajecorreoinvenLogic.saveMensajeCorreoInvens();//WithConnection
						//mensajecorreoinvenLogic.getSetVersionRowMensajeCorreoInvens();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.mensajecorreoinven,mensajecorreoinvenAux);
					
					this.refrescarForeignKeysDescripcionesMensajeCorreoInven();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.mensajecorreoinvenSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFrame.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens().addAll(this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFrame.detallemensajecorreoinvensEliminados);
							this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFrame.mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens().addAll(this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFrame.mailmensajecorreoinvensEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFrame.detallemensajecorreoinvens.addAll(this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFrame.detallemensajecorreoinvensEliminados);
							this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFrame.mailmensajecorreoinvens.addAll(this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFrame.mailmensajecorreoinvensEliminados);
						}
						//ARCHITECTURE
						
						if(!this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								mensajecorreoinvenLogic.saveMensajeCorreoInvenRelaciones(mensajecorreoinvenAux,this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFrame.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens(),this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFrame.mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens());//WithConnection
								//mensajecorreoinvenLogic.getSetVersionRowMensajeCorreoInvens();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.mensajecorreoinven,mensajecorreoinvenAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFrame.detallemensajecorreoinvenLogic.setDetalleMensajeCorreoInvens(new ArrayList<DetalleMensajeCorreoInven>());
							this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFrame.mailmensajecorreoinvenLogic.setMailMensajeCorreoInvens(new ArrayList<MailMensajeCorreoInven>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFrame.detallemensajecorreoinvens= new ArrayList<DetalleMensajeCorreoInven>();
							this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFrame.mailmensajecorreoinvens= new ArrayList<MailMensajeCorreoInven>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFrame.quitarFilaTotales();}
							mensajecorreoinvenAux.setDetalleMensajeCorreoInvens(this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFrame.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens());

							if(this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFrame.quitarFilaTotales();}
							mensajecorreoinvenAux.setMailMensajeCorreoInvens(this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFrame.mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.mensajecorreoinvenSessionBean.getEstaModoGuardarRelaciones() 
									|| this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(mensajecorreoinvenAux,mensajecorreoinvenLogic.getMensajeCorreoInvens());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(mensajecorreoinvenAux,mensajecorreoinvens);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.mensajecorreoinven,mensajecorreoinvenAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				mensajecorreoinvenAux=new  MensajeCorreoInven();
				
				mensajecorreoinvenAux.setIsNew(false);
				mensajecorreoinvenAux.setIsChanged(false);
				
				mensajecorreoinvenAux.setIsDeleted(true);
				
				mensajecorreoinvenAux.setId(this.mensajecorreoinven.getId());	
				mensajecorreoinvenAux.setVersionRow(this.mensajecorreoinven.getVersionRow());	
				mensajecorreoinvenAux.setid_empresa(this.mensajecorreoinven.getid_empresa());	
				mensajecorreoinvenAux.setid_sucursal(this.mensajecorreoinven.getid_sucursal());	
				mensajecorreoinvenAux.setid_modulo(this.mensajecorreoinven.getid_modulo());	
				mensajecorreoinvenAux.setid_tipo_mensaje_correo_inven(this.mensajecorreoinven.getid_tipo_mensaje_correo_inven());	
				mensajecorreoinvenAux.settema(this.mensajecorreoinven.gettema());	
				mensajecorreoinvenAux.setmensaje(this.mensajecorreoinven.getmensaje());	
				mensajecorreoinvenAux.setaviso(this.mensajecorreoinven.getaviso());	
				mensajecorreoinvenAux.setesta_activo(this.mensajecorreoinven.getesta_activo());	
				
				if(this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.mensajecorreoinvenAux.getId()>=0) {	
						this.mensajecorreoinvensEliminados.add(mensajecorreoinvenAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(mensajecorreoinvenAux,mensajecorreoinvenLogic.getMensajeCorreoInvens());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(mensajecorreoinvenAux,mensajecorreoinvens);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.mensajecorreoinvenSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						mensajecorreoinvenLogic.saveMensajeCorreoInvens();//WithConnection
						//mensajecorreoinvenLogic.getSetVersionRowMensajeCorreoInvens();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.mensajecorreoinvenSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFrame.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens().addAll(this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFrame.detallemensajecorreoinvensEliminados);
							this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFrame.mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens().addAll(this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFrame.mailmensajecorreoinvensEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFrame.detallemensajecorreoinvens.addAll(this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFrame.detallemensajecorreoinvensEliminados);
							this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFrame.mailmensajecorreoinvens.addAll(this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFrame.mailmensajecorreoinvensEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								mensajecorreoinvenLogic.saveMensajeCorreoInvenRelaciones(mensajecorreoinvenAux,this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFrame.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens(),this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFrame.mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens());//WithConnection
								//mensajecorreoinvenLogic.getSetVersionRowMensajeCorreoInvens();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFrame.detallemensajecorreoinvenLogic.setDetalleMensajeCorreoInvens(new ArrayList<DetalleMensajeCorreoInven>());
							this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFrame.mailmensajecorreoinvenLogic.setMailMensajeCorreoInvens(new ArrayList<MailMensajeCorreoInven>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFrame.detallemensajecorreoinvens= new ArrayList<DetalleMensajeCorreoInven>();
							this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFrame.mailmensajecorreoinvens= new ArrayList<MailMensajeCorreoInven>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFrame.quitarFilaTotales();}
							mensajecorreoinvenAux.setDetalleMensajeCorreoInvens(this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFrame.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens());

							if(this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFrame.quitarFilaTotales();}
							mensajecorreoinvenAux.setMailMensajeCorreoInvens(this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFrame.mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.mensajecorreoinvenSessionBean.getEstaModoGuardarRelaciones() 
								|| this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(mensajecorreoinvenAux,mensajecorreoinvenLogic.getMensajeCorreoInvens());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(mensajecorreoinvenAux,mensajecorreoinvens);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mensajecorreoinvenLogic.getMensajeCorreoInvens().addAll(this.mensajecorreoinvensEliminados);
					
					mensajecorreoinvenLogic.saveMensajeCorreoInvens();//WithConnection
					//mensajecorreoinvenLogic.getSetVersionRowMensajeCorreoInvens();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesMensajeCorreoInven();
				
				this.mensajecorreoinvensEliminados= new ArrayList<MensajeCorreoInven>();		
			}
			
			if(this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Mensaje Correo GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Mensaje Correo",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.mensajecorreoinven=mensajecorreoinvenAux;
					}
				}
			}
			
			this.isErrorGuardar=false;
			
			this.inicializarInvalidValues();
		/*
		} else {
			this.mostrarInvalidValues();	
		}
		*/
			
		} catch(Exception e) {
			this.isErrorGuardar=true;
			
			this.crearFilaTotales();
			
			throw e;
		} finally {
      		//this.finishProcessMensajeCorreoInven();
      	}
		
	}	
	
	public void actualizarRelaciones(MensajeCorreoInven mensajecorreoinvenLocal) throws Exception {
		
		if(this.mensajecorreoinvenSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				mensajecorreoinvenLocal.setDetalleMensajeCorreoInvens(this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFrame.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens());
				mensajecorreoinvenLocal.setMailMensajeCorreoInvens(this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFrame.mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens());
			
			} else {
			
				mensajecorreoinvenLocal.setDetalleMensajeCorreoInvens(this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFrame.detallemensajecorreoinvens);
				mensajecorreoinvenLocal.setMailMensajeCorreoInvens(this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFrame.mailmensajecorreoinvens);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(MensajeCorreoInven mensajecorreoinvenLocal) throws Exception {	
		if(this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				mensajecorreoinvenLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				mensajecorreoinvenLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ModuloDetalleFormJInternalFrame.class)) {
				ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrameLocal=(ModuloBeanSwingJInternalFrame) ((ModuloDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				moduloBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoModulo(moduloBeanSwingJInternalFrameLocal.getmodulo(),true);
				moduloBeanSwingJInternalFrameLocal.actualizarLista(moduloBeanSwingJInternalFrameLocal.modulo,this.modulosForeignKey);

				moduloBeanSwingJInternalFrameLocal.actualizarRelaciones(moduloBeanSwingJInternalFrameLocal.modulo);

				mensajecorreoinvenLocal.setModulo(moduloBeanSwingJInternalFrameLocal.modulo);

				this.addItemDefectoCombosForeignKeyModulo();
				this.cargarCombosFrameModulosForeignKey("Formulario");
				this.setActualModuloForeignKey(moduloBeanSwingJInternalFrameLocal.modulo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoMensajeCorreoInvenDetalleFormJInternalFrame.class)) {
				TipoMensajeCorreoInvenBeanSwingJInternalFrame tipomensajecorreoinvenBeanSwingJInternalFrameLocal=(TipoMensajeCorreoInvenBeanSwingJInternalFrame) ((TipoMensajeCorreoInvenDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipomensajecorreoinvenBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoMensajeCorreoInven(tipomensajecorreoinvenBeanSwingJInternalFrameLocal.gettipomensajecorreoinven(),true);
				tipomensajecorreoinvenBeanSwingJInternalFrameLocal.actualizarLista(tipomensajecorreoinvenBeanSwingJInternalFrameLocal.tipomensajecorreoinven,this.tipomensajecorreoinvensForeignKey);

				tipomensajecorreoinvenBeanSwingJInternalFrameLocal.actualizarRelaciones(tipomensajecorreoinvenBeanSwingJInternalFrameLocal.tipomensajecorreoinven);

				mensajecorreoinvenLocal.setTipoMensajeCorreoInven(tipomensajecorreoinvenBeanSwingJInternalFrameLocal.tipomensajecorreoinven);

				this.addItemDefectoCombosForeignKeyTipoMensajeCorreoInven();
				this.cargarCombosFrameTipoMensajeCorreoInvensForeignKey("Formulario");
				this.setActualTipoMensajeCorreoInvenForeignKey(tipomensajecorreoinvenBeanSwingJInternalFrameLocal.tipomensajecorreoinven.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarMensajeCorreoInvenActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosMensajeCorreoInven.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.mensajecorreoinven =(MensajeCorreoInven) this.mensajecorreoinvenLogic.getMensajeCorreoInvens().toArray()[this.jTableDatosMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.mensajecorreoinven =(MensajeCorreoInven) this.mensajecorreoinvens.toArray()[this.jTableDatosMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = mensajecorreoinvenValidator.getInvalidValues(this.mensajecorreoinven);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(MensajeCorreoInven mensajecorreoinven,List<MensajeCorreoInven> mensajecorreoinvens) throws Exception {
		try	{		
			MensajeCorreoInvenConstantesFunciones.actualizarLista(mensajecorreoinven,mensajecorreoinvens,this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(MensajeCorreoInven mensajecorreoinven,List<MensajeCorreoInven> mensajecorreoinvens) throws Exception {
		try	{			
			MensajeCorreoInvenConstantesFunciones.actualizarSelectedLista(mensajecorreoinven,mensajecorreoinvens);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<MensajeCorreoInven> mensajecorreoinvensLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				mensajecorreoinvensLocal=this.mensajecorreoinvenLogic.getMensajeCorreoInvens();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				mensajecorreoinvensLocal=this.mensajecorreoinvens;
			}
			//ARCHITECTURE
		
			for(MensajeCorreoInven mensajecorreoinvenLocal:mensajecorreoinvensLocal) {
				if(this.permiteMantenimiento(mensajecorreoinvenLocal) && mensajecorreoinvenLocal.getIsSelected()) {
					tiene=true;
					break;
				}
			}
		} catch(Exception e) {
			throw e;
		}
		
		return tiene;
	}			
	
	public void mostrarInvalidValues() throws Exception {
		String sMensaje="";
				
		for (InvalidValue invalidValue : this.invalidValues) {
			sMensaje+="\r\n"+MensajeCorreoInvenConstantesFunciones.getMensajeCorreoInvenLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(MensajeCorreoInvenConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMensajeCorreoInven.jLabelid_empresaMensajeCorreoInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MensajeCorreoInvenConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMensajeCorreoInven.jLabelid_sucursalMensajeCorreoInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MensajeCorreoInvenConstantesFunciones.IDMODULO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMensajeCorreoInven.jLabelid_moduloMensajeCorreoInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MensajeCorreoInvenConstantesFunciones.IDTIPOMENSAJECORREOINVEN)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMensajeCorreoInven.jLabelid_tipo_mensaje_correo_invenMensajeCorreoInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MensajeCorreoInvenConstantesFunciones.TEMA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMensajeCorreoInven.jLabeltemaMensajeCorreoInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MensajeCorreoInvenConstantesFunciones.MENSAJE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMensajeCorreoInven.jLabelmensajeMensajeCorreoInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MensajeCorreoInvenConstantesFunciones.AVISO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMensajeCorreoInven.jLabelavisoMensajeCorreoInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MensajeCorreoInvenConstantesFunciones.ESTAACTIVO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMensajeCorreoInven.jLabelesta_activoMensajeCorreoInven,invalidValue.getMessage());}
        }
		
		
		if(!sMensaje.equals("")) {
			//JOptionPane.showMessageDialog(this,sMensaje,"VALIDACION ",JOptionPane.ERROR_MESSAGE);
			throw new Exception(sMensaje);			
		}
		
		/*
		System.out.println(invalidValue);
        System.out.println("message=" + invalidValue.getMessage());
        System.out.println("propertyName=" + invalidValue.getPropertyName());
        System.out.println("propertyPath=" + invalidValue.getPropertyPath());
        System.out.println("value=" + invalidValue.getValue());
        */
	}		
	
	public void inicializarInvalidValues() throws Exception {
		String sMensaje="";	
		
		if(this.jInternalFrameDetalleFormMensajeCorreoInven!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMensajeCorreoInven.jLabelid_empresaMensajeCorreoInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMensajeCorreoInven.jLabelid_sucursalMensajeCorreoInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMensajeCorreoInven.jLabelid_moduloMensajeCorreoInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMensajeCorreoInven.jLabelid_tipo_mensaje_correo_invenMensajeCorreoInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMensajeCorreoInven.jLabeltemaMensajeCorreoInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMensajeCorreoInven.jLabelmensajeMensajeCorreoInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMensajeCorreoInven.jLabelavisoMensajeCorreoInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMensajeCorreoInven.jLabelesta_activoMensajeCorreoInven,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("DetalleMensajeCorreoInven")) {
			if(this.mensajecorreoinven==null) {
				this.mensajecorreoinven= new MensajeCorreoInven();
			}

			if(this.mensajecorreoinvenSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoMensajeCorreoInven
				this.setVariablesFormularioToObjetoActualMensajeCorreoInven(this.mensajecorreoinven,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysMensajeCorreoInven(this.mensajecorreoinven);

				this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFrame.getdetallemensajecorreoinven().setMensajeCorreoInven(this.mensajecorreoinven);
			}

			return;
		}
		 else  if(sTipo.equals("MailMensajeCorreoInven")) {
			if(this.mensajecorreoinven==null) {
				this.mensajecorreoinven= new MensajeCorreoInven();
			}

			if(this.mensajecorreoinvenSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoMensajeCorreoInven
				this.setVariablesFormularioToObjetoActualMensajeCorreoInven(this.mensajecorreoinven,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysMensajeCorreoInven(this.mensajecorreoinven);

				this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFrame.getmailmensajecorreoinven().setMensajeCorreoInven(this.mensajecorreoinven);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoMensajeCorreoInven--;	
		
		
		this.mensajecorreoinvenAux=new MensajeCorreoInven();
		
		this.mensajecorreoinvenAux.setId(this.iIdNuevoMensajeCorreoInven);
		this.mensajecorreoinvenAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.mensajecorreoinvenLogic.getMensajeCorreoInvens().add(this.mensajecorreoinvenAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.mensajecorreoinvens.add(this.mensajecorreoinvenAux);
		}
		//ARCHITECTURE
		
		this.mensajecorreoinven=this.mensajecorreoinvenAux;
		
		if(MensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioMensajeCorreoInven(this.mensajecorreoinven);
			this.setVariablesObjetoActualToFormularioForeignKeyMensajeCorreoInven(this.mensajecorreoinven);
		}
				
		//this.setDefaultControlesMensajeCorreoInven();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyMensajeCorreoInven();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyMensajeCorreoInven();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyMensajeCorreoInven();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualMensajeCorreoInven(this.mensajecorreoinvenBean,this.mensajecorreoinven,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysMensajeCorreoInven(this.mensajecorreoinven);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(MensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.mensajecorreoinvenSessionBean.getConGuardarRelaciones()) {
			classes=MensajeCorreoInvenConstantesFunciones.getClassesRelationshipsOfMensajeCorreoInven(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.mensajecorreoinvenReturnGeneral=mensajecorreoinvenLogic.procesarEventosMensajeCorreoInvensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.mensajecorreoinvenLogic.getMensajeCorreoInvens(),this.mensajecorreoinven,this.mensajecorreoinvenParameterGeneral,this.isEsNuevoMensajeCorreoInven,classes);//this.mensajecorreoinvenLogic.getMensajeCorreoInven()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanMensajeCorreoInven(this.mensajecorreoinvenReturnGeneral,this.mensajecorreoinvenBean,false);
		
		if(this.mensajecorreoinvenReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyMensajeCorreoInven(this.mensajecorreoinvenReturnGeneral.getMensajeCorreoInven());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioMensajeCorreoInven(this.mensajecorreoinvenReturnGeneral.getMensajeCorreoInven());
		}
		
		if(this.mensajecorreoinvenReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioMensajeCorreoInven(this.mensajecorreoinvenReturnGeneral.getMensajeCorreoInven(),classes);//this.mensajecorreoinvenBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualMensajeCorreoInven(this.mensajecorreoinven,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyMensajeCorreoInven();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyMensajeCorreoInven();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			MensajeCorreoInvenBeanSwingJInternalFrameAdditional.RecargarFormMensajeCorreoInven(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingMensajeCorreoInven(false);
						
			if(mensajecorreoinvenSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFrame.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado() && DetalleMensajeCorreoInvenJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleMensajeCorreoInvenActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFrame.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado() && MailMensajeCorreoInvenJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonMailMensajeCorreoInvenActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(MensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualMensajeCorreoInven();
			}
			
			this.actualizarVisualTableDatosMensajeCorreoInven();
			
			this.jTableDatosMensajeCorreoInven.setRowSelectionInterval(this.getIndiceNuevoMensajeCorreoInven(), this.getIndiceNuevoMensajeCorreoInven());
			
			this.seleccionarFilaTablaMensajeCorreoInvenActual();
						
			this.actualizarEstadoCeldasBotonesMensajeCorreoInven("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesMensajeCorreoInven(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormMensajeCorreoInven.jTextAreatemaMensajeCorreoInven.setEnabled(isHabilitar && this.mensajecorreoinvenConstantesFunciones.activartemaMensajeCorreoInven);
		this.jInternalFrameDetalleFormMensajeCorreoInven.jTextAreamensajeMensajeCorreoInven.setEnabled(isHabilitar && this.mensajecorreoinvenConstantesFunciones.activarmensajeMensajeCorreoInven);
		this.jInternalFrameDetalleFormMensajeCorreoInven.jTextAreaavisoMensajeCorreoInven.setEnabled(isHabilitar && this.mensajecorreoinvenConstantesFunciones.activaravisoMensajeCorreoInven);
		this.jInternalFrameDetalleFormMensajeCorreoInven.jCheckBoxesta_activoMensajeCorreoInven.setEnabled(isHabilitar && this.mensajecorreoinvenConstantesFunciones.activaresta_activoMensajeCorreoInven);	
		//
		this.jInternalFrameDetalleFormMensajeCorreoInven.jComboBoxid_empresaMensajeCorreoInven.setEnabled(isHabilitar && this.mensajecorreoinvenConstantesFunciones.activarid_empresaMensajeCorreoInven);//
		this.jInternalFrameDetalleFormMensajeCorreoInven.jComboBoxid_sucursalMensajeCorreoInven.setEnabled(isHabilitar && this.mensajecorreoinvenConstantesFunciones.activarid_sucursalMensajeCorreoInven);//
		this.jInternalFrameDetalleFormMensajeCorreoInven.jComboBoxid_moduloMensajeCorreoInven.setEnabled(isHabilitar && this.mensajecorreoinvenConstantesFunciones.activarid_moduloMensajeCorreoInven);
		this.jInternalFrameDetalleFormMensajeCorreoInven.jComboBoxid_tipo_mensaje_correo_invenMensajeCorreoInven.setEnabled(isHabilitar && this.mensajecorreoinvenConstantesFunciones.activarid_tipo_mensaje_correo_invenMensajeCorreoInven);
	};
	
	public void setDefaultControlesMensajeCorreoInven() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoMensajeCorreoInven(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.mensajecorreoinvenSessionBean.setConGuardarRelaciones(true);			
			this.mensajecorreoinvenSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormMensajeCorreoInven.jTabbedPaneRelacionesMensajeCorreoInven.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFrame.detallemensajecorreoinvenSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFrame.mailmensajecorreoinvenSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.mensajecorreoinvenSessionBean.setConGuardarRelaciones(false);			
			this.mensajecorreoinvenSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormMensajeCorreoInven.jTabbedPaneRelacionesMensajeCorreoInven.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFrame.detallemensajecorreoinvenSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFrame.mailmensajecorreoinvenSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoMensajeCorreoInven() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(MensajeCorreoInven mensajecorreoinvenAux:this.mensajecorreoinvenLogic.getMensajeCorreoInvens()) {
				if(mensajecorreoinvenAux.getId().equals(this.iIdNuevoMensajeCorreoInven)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(MensajeCorreoInven mensajecorreoinvenAux:this.mensajecorreoinvens) {
				if(mensajecorreoinvenAux.getId().equals(this.iIdNuevoMensajeCorreoInven)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
			iIndice=iIndice-1;
		}
		
		return iIndice;
	}
	
	public int getIndiceActualMensajeCorreoInven(MensajeCorreoInven mensajecorreoinven,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(MensajeCorreoInven mensajecorreoinvenAux:this.mensajecorreoinvenLogic.getMensajeCorreoInvens()) {
				if(mensajecorreoinvenAux.getId().equals(mensajecorreoinven.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(MensajeCorreoInven mensajecorreoinvenAux:this.mensajecorreoinvens) {
				if(mensajecorreoinvenAux.getId().equals(mensajecorreoinven.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
			iIndice=iIndiceActual;
		}
		
		return iIndice;
	}
	
	public void setCamposBaseDesdeOriginalMensajeCorreoInven(MensajeCorreoInven mensajecorreoinvenOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(MensajeCorreoInven mensajecorreoinvenAux:this.mensajecorreoinvenLogic.getMensajeCorreoInvens()) {
				if(mensajecorreoinvenAux.getMensajeCorreoInvenOriginal().getId().equals(mensajecorreoinvenOriginal.getId())) {
					existe=true;
					mensajecorreoinvenOriginal.setId(mensajecorreoinvenAux.getId());
					mensajecorreoinvenOriginal.setVersionRow(mensajecorreoinvenAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(MensajeCorreoInven mensajecorreoinvenAux:this.mensajecorreoinvens) {
				if(mensajecorreoinvenAux.getMensajeCorreoInvenOriginal().getId().equals(mensajecorreoinvenOriginal.getId())) {
					existe=true;
					mensajecorreoinvenOriginal.setId(mensajecorreoinvenAux.getId());
					mensajecorreoinvenOriginal.setVersionRow(mensajecorreoinvenAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosMensajeCorreoInven(Boolean esParaCancelar) throws Exception {
		mensajecorreoinvensAux=new ArrayList<MensajeCorreoInven>();
		mensajecorreoinvenAux=new MensajeCorreoInven();
		
		if(!this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(MensajeCorreoInven mensajecorreoinvenAux:this.mensajecorreoinvenLogic.getMensajeCorreoInvens()) {
					if(mensajecorreoinvenAux.getId()<0) {
						mensajecorreoinvensAux.add(mensajecorreoinvenAux);
					}		
				}
				this.iIdNuevoMensajeCorreoInven=0L;
				this.mensajecorreoinvenLogic.getMensajeCorreoInvens().removeAll(mensajecorreoinvensAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(MensajeCorreoInven mensajecorreoinvenAux:this.mensajecorreoinvens) {
					if(mensajecorreoinvenAux.getId()<0) {
						mensajecorreoinvensAux.add(mensajecorreoinvenAux);
					}		
				}
				this.iIdNuevoMensajeCorreoInven=0L;
				this.mensajecorreoinvens.removeAll(mensajecorreoinvensAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoMensajeCorreoInven 
					&& this.mensajecorreoinvenLogic.getMensajeCorreoInvens().size()>0
					) {
					mensajecorreoinvenAux=this.mensajecorreoinvenLogic.getMensajeCorreoInvens().get(this.mensajecorreoinvenLogic.getMensajeCorreoInvens().size() - 1);
				
					if(mensajecorreoinvenAux.getId()<0) {
						this.mensajecorreoinvenLogic.getMensajeCorreoInvens().remove(mensajecorreoinvenAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoMensajeCorreoInven && this.mensajecorreoinvens.size()>0) {
					mensajecorreoinvenAux=this.mensajecorreoinvens.get(this.mensajecorreoinvens.size() - 1);
				
					if(mensajecorreoinvenAux.getId()<0) {
						this.mensajecorreoinvens.remove(mensajecorreoinvenAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoMensajeCorreoInven(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(mensajecorreoinven.getId()<0) {
				this.mensajecorreoinvenLogic.getMensajeCorreoInvens().remove(this.mensajecorreoinven);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(mensajecorreoinven.getId()<0) {
				this.mensajecorreoinvens.remove(this.mensajecorreoinven);
			}
		}			
	}
	
	public void setEstadosInicialesMensajeCorreoInven(List<MensajeCorreoInven> mensajecorreoinvensAux) throws Exception {
		MensajeCorreoInvenConstantesFunciones.setEstadosInicialesMensajeCorreoInven(mensajecorreoinvensAux);
	}
	
	public void setEstadosInicialesMensajeCorreoInven(MensajeCorreoInven mensajecorreoinvenAux) throws Exception {
		MensajeCorreoInvenConstantesFunciones.setEstadosInicialesMensajeCorreoInven(mensajecorreoinvenAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarMensajeCorreoInvenActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesMensajeCorreoInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarMensajeCorreoInvenActual()) {
				if(!this.isEsNuevoMensajeCorreoInven) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesMensajeCorreoInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoMensajeCorreoInven=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarMensajeCorreoInvenActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Mensaje Correo ?", "MANTENIMIENTO DE Mensaje Correo", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesMensajeCorreoInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(MensajeCorreoInven mensajecorreoinven) throws Exception {
		MensajeCorreoInvenConstantesFunciones.seleccionarAsignar(this.mensajecorreoinven,mensajecorreoinven);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarMensajeCorreoInven=this.isPermisoActualizarOriginalMensajeCorreoInven;
			
			
			this.seleccionarAsignar(mensajecorreoinven);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			MensajeCorreoInvenConstantesFunciones.quitarEspaciosMensajeCorreoInven(this.mensajecorreoinven,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesMensajeCorreoInven("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.mensajecorreoinvenSessionBean.setsFuncionBusquedaRapida(this.mensajecorreoinvenSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoMensajeCorreoInven) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosMensajeCorreoInven(esParaCancelar);				
				this.cancelarNuevoMensajeCorreoInven(esParaCancelar);								
			}
			
			this.mensajecorreoinven=new MensajeCorreoInven();
			
			this.inicializarMensajeCorreoInven();
			
			this.actualizarEstadoCeldasBotonesMensajeCorreoInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarMensajeCorreoInven() throws Exception {
		try {
			MensajeCorreoInvenConstantesFunciones.inicializarMensajeCorreoInven(this.mensajecorreoinven);
			
			} catch(Exception e) {
			throw e;
		}
	}
	
	public void anteriores()throws Exception {
		try	{
			//this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina-this.iNumeroPaginacion;
			
			if(this.iNumeroPaginacionPagina-this.iNumeroPaginacion<this.iNumeroPaginacion) {
				this.iNumeroPaginacionPagina=0;		
			} else {
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina-this.iNumeroPaginacion;
			}
			
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.mensajecorreoinvenLogic.getMensajeCorreoInvens().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteMensajeCorreoInvens(String sAccionBusqueda,List<MensajeCorreoInven> mensajecorreoinvensParaReportes) throws Exception {
		//HttpSession httpSession = httpServletRequest.getSession();
		Long iIdUsuarioSesion=0L;	
		
		
		if(usuarioActual==null) {
			this.usuarioActual=new Usuario();
		}
		
		iIdUsuarioSesion=usuarioActual.getId();
		
		String sPathReportes="";
		
		InputStream reportFile=null;
		InputStream imageFile=null;
			
		imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		String sPathReporteFinal="";
		
		if(!esReporteAccionProceso) {
			if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
				if(!this.esReporteDinamico) {
					sPathReporteFinal="MensajeCorreoInven"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="MensajeCorreoInvenMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("MensajeCorreoInvenMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="MensajeCorreoInven"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
		}
		
		if(reportFile==null) {
			throw new JRRuntimeException(sPathReporteFinal+" no existe");
		}
		
		String sUsuario="";
		
		if(usuarioActual!=null) {
			sUsuario=usuarioActual.getuser_name();
		}
		
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("usuario", sUsuario);
		
		parameters.put("titulo", Funciones.GetTituloSistemaReporte(this.parametroGeneralSg,this.moduloActual,this.usuarioActual));
		parameters.put("subtitulo", "Reporte De  Mensaje Correoes");		
		parameters.put("busquedapor", MensajeCorreoInvenConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(DetalleMensajeCorreoInven.class));
			classes.add(new Classe(MailMensajeCorreoInven.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					MensajeCorreoInvenLogic mensajecorreoinvenLogicAuxiliar=new MensajeCorreoInvenLogic();
					mensajecorreoinvenLogicAuxiliar.setDatosCliente(mensajecorreoinvenLogic.getDatosCliente());				
					mensajecorreoinvenLogicAuxiliar.setMensajeCorreoInvens(mensajecorreoinvensParaReportes);
					
					mensajecorreoinvenLogicAuxiliar.cargarRelacionesLoteForeignKeyMensajeCorreoInvenWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					mensajecorreoinvensParaReportes=mensajecorreoinvenLogicAuxiliar.getMensajeCorreoInvens();
					
					//mensajecorreoinvenLogic.getNewConnexionToDeep();
					
					//for (MensajeCorreoInven mensajecorreoinven:mensajecorreoinvensParaReportes) {
					//	mensajecorreoinvenLogic.deepLoad(mensajecorreoinven, false, DeepLoadType.INCLUDE, classes);
					//}						
					//mensajecorreoinvenLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//mensajecorreoinvenLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileDetalleMensajeCorreoInven = AuxiliarReportes.class.getResourceAsStream("DetalleMensajeCorreoInvenDetalleRelacionesDesign.jasper");
			parameters.put("subreport_detallemensajecorreoinven", reportFileDetalleMensajeCorreoInven);

			InputStream reportFileMailMensajeCorreoInven = AuxiliarReportes.class.getResourceAsStream("MailMensajeCorreoInvenDetalleRelacionesDesign.jasper");
			parameters.put("subreport_mailmensajecorreoinven", reportFileMailMensajeCorreoInven);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceMensajeCorreoInven=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			MensajeCorreoInvenConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			MensajeCorreoInvenConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceMensajeCorreoInven=new JRBeanArrayDataSource(MensajeCorreoInvenJInternalFrame.TraerMensajeCorreoInvenBeans(mensajecorreoinvensParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceMensajeCorreoInven);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+MensajeCorreoInvenConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+MensajeCorreoInvenConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(MensajeCorreoInvenBean.TraerMensajeCorreoInvenBeans(mensajecorreoinvensParaReportes).toArray()));
							
			if(this.sTipoArchivoReporte=="HTML") {
				sDestFileName+=".html";
				JasperExportManager.exportReportToHtmlFile(jasperPrint,sDestFileName);
					
			} else if(this.sTipoArchivoReporte=="PDF") {
				sDestFileName+=".pdf";
				JasperExportManager.exportReportToPdfFile(jasperPrint,sDestFileName);
			} else {
				sDestFileName+=".xml";
				JasperExportManager.exportReportToXmlFile(jasperPrint,sDestFileName, false);
			}	
			
		} else if(this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {
				
			if(this.sTipoArchivoReporte=="WORD") {
				sDestFileName+=".rtf";
					
				JRRtfExporter exporter = new JRRtfExporter();
		
				exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
				exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, sDestFileName);
		
				exporter.exportReport();
				
			} else	{
				sDestFileName+=".xls";
					
				JRXlsExporter exporterXls = new JRXlsExporter();
		
				exporterXls.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
				exporterXls.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, sDestFileName);
				exporterXls.setParameter(JRXlsExporterParameter.IS_ONE_PAGE_PER_SHEET, Boolean.TRUE);
		
				exporterXls.exportReport();
			}
			
		} else if(this.sTipoArchivoReporte=="EXCEL2"||this.sTipoArchivoReporte=="EXCEL2_2") {
			//sDestFileName+=".xlsx";
			
			if(this.sTipoReporte.equals("NORMAL")) {
				this.generarExcelReporteMensajeCorreoInvens(sAccionBusqueda,sTipoArchivoReporte,mensajecorreoinvensParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalMensajeCorreoInvens(sAccionBusqueda,sTipoArchivoReporte,mensajecorreoinvensParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoMensajeCorreoInvenActionPerformed(null);
					//this.generarExcelReporteMensajeCorreoInvens(sAccionBusqueda,sTipoArchivoReporte,mensajecorreoinvensParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalMensajeCorreoInvens(sAccionBusqueda,sTipoArchivoReporte,mensajecorreoinvensParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesMensajeCorreoInvens(sAccionBusqueda,sTipoArchivoReporte,mensajecorreoinvensParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesMensajeCorreoInvens(sAccionBusqueda,sTipoArchivoReporte,mensajecorreoinvensParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteMensajeCorreoInvens(String sAccionBusqueda,String sTipoArchivoReporte,List<MensajeCorreoInven> mensajecorreoinvensParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"mensajecorreoinven";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("MensajeCorreoInvens");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderMensajeCorreoInven("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(MensajeCorreoInven mensajecorreoinven : mensajecorreoinvensParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			MensajeCorreoInvenConstantesFunciones.generarExcelReporteDataMensajeCorreoInven("NORMAL",row,workbook,mensajecorreoinven,cellStyleDataAux);
		
			
			/*
            Cell cell0 = row.createCell(0);
            cell0.setCellValue(country.getName());
            Cell cell1 = row.createCell(1);
            cell1.setCellValue(country.getShortCode());
			*/
			
			i++;
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Mensaje Correo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderMensajeCorreoInven(String sTipo,Row row,Workbook workbook) {
		
		MensajeCorreoInvenConstantesFunciones.generarExcelReporteHeaderMensajeCorreoInven(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalMensajeCorreoInvens(String sAccionBusqueda,String sTipoArchivoReporte,List<MensajeCorreoInven> mensajecorreoinvensParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"mensajecorreoinven_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("MensajeCorreoInvens");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(MensajeCorreoInven mensajecorreoinven : mensajecorreoinvensParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(MensajeCorreoInvenConstantesFunciones.getMensajeCorreoInvenDescripcion(mensajecorreoinven));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MensajeCorreoInvenConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MensajeCorreoInvenConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(mensajecorreoinven.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MensajeCorreoInvenConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MensajeCorreoInvenConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(mensajecorreoinven.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MensajeCorreoInvenConstantesFunciones.LABEL_IDMODULO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MensajeCorreoInvenConstantesFunciones.LABEL_IDMODULO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(mensajecorreoinven.getmodulo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MensajeCorreoInvenConstantesFunciones.LABEL_IDTIPOMENSAJECORREOINVEN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MensajeCorreoInvenConstantesFunciones.LABEL_IDTIPOMENSAJECORREOINVEN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(mensajecorreoinven.gettipomensajecorreoinven_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MensajeCorreoInvenConstantesFunciones.LABEL_TEMA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MensajeCorreoInvenConstantesFunciones.LABEL_TEMA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(mensajecorreoinven.gettema());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MensajeCorreoInvenConstantesFunciones.LABEL_MENSAJE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MensajeCorreoInvenConstantesFunciones.LABEL_MENSAJE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(mensajecorreoinven.getmensaje());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MensajeCorreoInvenConstantesFunciones.LABEL_AVISO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MensajeCorreoInvenConstantesFunciones.LABEL_AVISO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(mensajecorreoinven.getaviso());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MensajeCorreoInvenConstantesFunciones.LABEL_ESTAACTIVO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MensajeCorreoInvenConstantesFunciones.LABEL_ESTAACTIVO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(mensajecorreoinven.getesta_activo()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Mensaje Correo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesMensajeCorreoInvens(String sAccionBusqueda,String sTipoArchivoReporte,List<MensajeCorreoInven> mensajecorreoinvensParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<MensajeCorreoInven> mensajecorreoinvensRespaldo=null;
		
		classes=MensajeCorreoInvenConstantesFunciones.getClassesRelationshipsOfMensajeCorreoInven(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.mensajecorreoinvenLogic.setDatosCliente(this.datosCliente);
		this.mensajecorreoinvenLogic.setDatosDeep(this.datosDeep);
		this.mensajecorreoinvenLogic.setIsConDeep(true);
		
		mensajecorreoinvensRespaldo=this.mensajecorreoinvenLogic.getMensajeCorreoInvens();
		
		this.mensajecorreoinvenLogic.setMensajeCorreoInvens(mensajecorreoinvensParaReportes);	
		this.mensajecorreoinvenLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		mensajecorreoinvensParaReportes=this.mensajecorreoinvenLogic.getMensajeCorreoInvens();
		this.mensajecorreoinvenLogic.setMensajeCorreoInvens(mensajecorreoinvensRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"mensajecorreoinven_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("MensajeCorreoInvens");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderMensajeCorreoInven("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(MensajeCorreoInven mensajecorreoinven : mensajecorreoinvensParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderMensajeCorreoInven("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			MensajeCorreoInvenConstantesFunciones.generarExcelReporteDataMensajeCorreoInven("NORMAL",row,workbook,mensajecorreoinven,cellStyleDataAux);
		
			
			


				//DetalleMensajeCorreoInven
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(DetalleMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO))) {

				if(mensajecorreoinven.getDetalleMensajeCorreoInvens()!=null && mensajecorreoinven.getDetalleMensajeCorreoInvens().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(DetalleMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					DetalleMensajeCorreoInvenConstantesFunciones.generarExcelReporteHeaderDetalleMensajeCorreoInven("RELACIONADO",row,workbook);
				}

				if(mensajecorreoinven.getDetalleMensajeCorreoInvens()!=null) {
					i2=0;
					for(DetalleMensajeCorreoInven detallemensajecorreoinven : mensajecorreoinven.getDetalleMensajeCorreoInvens()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						DetalleMensajeCorreoInvenConstantesFunciones.generarExcelReporteDataDetalleMensajeCorreoInven("RELACIONADO",row,workbook,detallemensajecorreoinven,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//MailMensajeCorreoInven
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(MailMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO))) {

				if(mensajecorreoinven.getMailMensajeCorreoInvens()!=null && mensajecorreoinven.getMailMensajeCorreoInvens().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(MailMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					MailMensajeCorreoInvenConstantesFunciones.generarExcelReporteHeaderMailMensajeCorreoInven("RELACIONADO",row,workbook);
				}

				if(mensajecorreoinven.getMailMensajeCorreoInvens()!=null) {
					i2=0;
					for(MailMensajeCorreoInven mailmensajecorreoinven : mensajecorreoinven.getMailMensajeCorreoInvens()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						MailMensajeCorreoInvenConstantesFunciones.generarExcelReporteDataMailMensajeCorreoInven("RELACIONADO",row,workbook,mailmensajecorreoinven,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(MensajeCorreoInvenConstantesFunciones.getMensajeCorreoInvenDescripcion(mensajecorreoinven));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Mensaje Correo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoMensajeCorreoInven.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoMensajeCorreoInven.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public Boolean existeRelacionReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoMensajeCorreoInven.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoMensajeCorreoInven.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessMensajeCorreoInven() throws Exception {		
		this.startProcessMensajeCorreoInven(true);
	}
	
	public void startProcessMensajeCorreoInven(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasMensajeCorreoInven ,this.jPanelParametrosReportesMensajeCorreoInven, this.jScrollPanelDatosMensajeCorreoInven,this.jPanelPaginacionMensajeCorreoInven, this.jScrollPanelDatosEdicionMensajeCorreoInven, this.jPanelAccionesMensajeCorreoInven,this.jPanelAccionesFormularioMensajeCorreoInven,this.jmenuBarMensajeCorreoInven,this.jmenuBarDetalleMensajeCorreoInven,this.jTtoolBarMensajeCorreoInven,this.jTtoolBarDetalleMensajeCorreoInven);		
		
		final JTabbedPane jTabbedPaneBusquedasMensajeCorreoInven=this.jTabbedPaneBusquedasMensajeCorreoInven; 
		
		final JPanel jPanelParametrosReportesMensajeCorreoInven=this.jPanelParametrosReportesMensajeCorreoInven;
		//final JScrollPane jScrollPanelDatosMensajeCorreoInven=this.jScrollPanelDatosMensajeCorreoInven;
		final JTable jTableDatosMensajeCorreoInven=this.jTableDatosMensajeCorreoInven;		
		final JPanel jPanelPaginacionMensajeCorreoInven=this.jPanelPaginacionMensajeCorreoInven;
		//final JScrollPane jScrollPanelDatosEdicionMensajeCorreoInven=this.jScrollPanelDatosEdicionMensajeCorreoInven;
		final JPanel jPanelAccionesMensajeCorreoInven=this.jPanelAccionesMensajeCorreoInven;
		
		JPanel jPanelCamposAuxiliarMensajeCorreoInven=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarMensajeCorreoInven=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormMensajeCorreoInven!=null) {
			jPanelCamposAuxiliarMensajeCorreoInven=this.jInternalFrameDetalleFormMensajeCorreoInven.jPanelCamposMensajeCorreoInven;
			jPanelAccionesFormularioAuxiliarMensajeCorreoInven=this.jInternalFrameDetalleFormMensajeCorreoInven.jPanelAccionesFormularioMensajeCorreoInven;
		}
		
		final JPanel jPanelCamposMensajeCorreoInven=jPanelCamposAuxiliarMensajeCorreoInven;
		final JPanel jPanelAccionesFormularioMensajeCorreoInven=jPanelAccionesFormularioAuxiliarMensajeCorreoInven;
		
		
		final JMenuBar jmenuBarMensajeCorreoInven=this.jmenuBarMensajeCorreoInven;
		final JToolBar jTtoolBarMensajeCorreoInven=this.jTtoolBarMensajeCorreoInven;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarMensajeCorreoInven=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarMensajeCorreoInven=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormMensajeCorreoInven!=null) {
			jmenuBarDetalleAuxiliarMensajeCorreoInven=this.jInternalFrameDetalleFormMensajeCorreoInven.jmenuBarDetalleMensajeCorreoInven;
			jTtoolBarDetalleAuxiliarMensajeCorreoInven=this.jInternalFrameDetalleFormMensajeCorreoInven.jTtoolBarDetalleMensajeCorreoInven;
		}
		
		final JMenuBar jmenuBarDetalleMensajeCorreoInven=jmenuBarDetalleAuxiliarMensajeCorreoInven;
		final JToolBar jTtoolBarDetalleMensajeCorreoInven=jTtoolBarDetalleAuxiliarMensajeCorreoInven;		
		
		
		
		
		
		if(Constantes2.CON_PROCESO_HILO) {
			Thread threadRunnableProcess;
			ProcessRunnable processRunnable;
			
			processRunnable=new ProcessRunnable();
			
			processRunnable.setsTipo("START");
			processRunnable.setDesktop(jDesktopPane);
			processRunnable.setModuloActual(moduloActual);
			processRunnable.setModuloUsuarioSeleccionado(moduloActual);
			processRunnable.setOpcionActual(opcionActual);
			processRunnable.setParametroGeneralSg(parametroGeneralSg);
			processRunnable.setParametroGeneralUsuario(parametroGeneralUsuario);
			processRunnable.setResumenUsuarioActual(resumenUsuarioActual);
			processRunnable.setUsuarioActual(usuarioActual);
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasMensajeCorreoInven;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesMensajeCorreoInven;
			processRunnable.jTableDatos=jTableDatosMensajeCorreoInven;
			processRunnable.jPanelCampos=jPanelCamposMensajeCorreoInven;
			processRunnable.jPanelPaginacion=jPanelPaginacionMensajeCorreoInven;
			processRunnable.jPanelAcciones=jPanelAccionesMensajeCorreoInven;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioMensajeCorreoInven;
			
			
			processRunnable.jmenuBar=jmenuBarMensajeCorreoInven;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleMensajeCorreoInven;
			processRunnable.jTtoolBar=jTtoolBarMensajeCorreoInven;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleMensajeCorreoInven;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasMensajeCorreoInven ,jPanelParametrosReportesMensajeCorreoInven,jTableDatosMensajeCorreoInven, /*jScrollPanelDatosMensajeCorreoInven,*/jPanelCamposMensajeCorreoInven,jPanelPaginacionMensajeCorreoInven, /*jScrollPanelDatosEdicionMensajeCorreoInven,*/ jPanelAccionesMensajeCorreoInven,jPanelAccionesFormularioMensajeCorreoInven,jmenuBarMensajeCorreoInven,jmenuBarDetalleMensajeCorreoInven,jTtoolBarMensajeCorreoInven,jTtoolBarDetalleMensajeCorreoInven);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasMensajeCorreoInven ,jPanelParametrosReportesMensajeCorreoInven, jScrollPanelDatosMensajeCorreoInven,jPanelPaginacionMensajeCorreoInven, jScrollPanelDatosEdicionMensajeCorreoInven, jPanelAccionesMensajeCorreoInven,jPanelAccionesFormularioMensajeCorreoInven,jmenuBarMensajeCorreoInven,jmenuBarDetalleMensajeCorreoInven,jTtoolBarMensajeCorreoInven,jTtoolBarDetalleMensajeCorreoInven);
						
							startProcess();//this.
							
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			      }
			});
		}
		*/
	}
	
	public void finishProcessMensajeCorreoInven() {// throws Exception 
		this.finishProcessMensajeCorreoInven(true);
	}
	
	public void finishProcessMensajeCorreoInven(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasMensajeCorreoInven ,this.jPanelParametrosReportesMensajeCorreoInven, this.jScrollPanelDatosMensajeCorreoInven,this.jPanelPaginacionMensajeCorreoInven, this.jScrollPanelDatosEdicionMensajeCorreoInven, this.jPanelAccionesMensajeCorreoInven,this.jPanelAccionesFormularioMensajeCorreoInven,this.jmenuBarMensajeCorreoInven,this.jmenuBarDetalleMensajeCorreoInven,this.jTtoolBarMensajeCorreoInven,this.jTtoolBarDetalleMensajeCorreoInven);		
		
		final JTabbedPane jTabbedPaneBusquedasMensajeCorreoInven=this.jTabbedPaneBusquedasMensajeCorreoInven; 
		
		final JPanel jPanelParametrosReportesMensajeCorreoInven=this.jPanelParametrosReportesMensajeCorreoInven;
		//final JScrollPane jScrollPanelDatosMensajeCorreoInven=this.jScrollPanelDatosMensajeCorreoInven;
		final JTable jTableDatosMensajeCorreoInven=this.jTableDatosMensajeCorreoInven;		
		final JPanel jPanelPaginacionMensajeCorreoInven=this.jPanelPaginacionMensajeCorreoInven;
		//final JScrollPane jScrollPanelDatosEdicionMensajeCorreoInven=this.jScrollPanelDatosEdicionMensajeCorreoInven;
		final JPanel jPanelAccionesMensajeCorreoInven=this.jPanelAccionesMensajeCorreoInven;
		
		JPanel jPanelCamposAuxiliarMensajeCorreoInven=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarMensajeCorreoInven=new JPanel();
		
		if(this.jInternalFrameDetalleFormMensajeCorreoInven!=null) {
			jPanelCamposAuxiliarMensajeCorreoInven=this.jInternalFrameDetalleFormMensajeCorreoInven.jPanelCamposMensajeCorreoInven;
			jPanelAccionesFormularioAuxiliarMensajeCorreoInven=this.jInternalFrameDetalleFormMensajeCorreoInven.jPanelAccionesFormularioMensajeCorreoInven;
		}
		
		final JPanel jPanelCamposMensajeCorreoInven=jPanelCamposAuxiliarMensajeCorreoInven;
		final JPanel jPanelAccionesFormularioMensajeCorreoInven=jPanelAccionesFormularioAuxiliarMensajeCorreoInven;
		
		
		final JMenuBar jmenuBarMensajeCorreoInven=this.jmenuBarMensajeCorreoInven;		
		final JToolBar jTtoolBarMensajeCorreoInven=this.jTtoolBarMensajeCorreoInven;
				
		JMenuBar jmenuBarDetalleAuxiliarMensajeCorreoInven=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarMensajeCorreoInven=new JToolBar();
		
		if(this.jInternalFrameDetalleFormMensajeCorreoInven!=null) {
			jmenuBarDetalleAuxiliarMensajeCorreoInven=this.jInternalFrameDetalleFormMensajeCorreoInven.jmenuBarDetalleMensajeCorreoInven;
			jTtoolBarDetalleAuxiliarMensajeCorreoInven=this.jInternalFrameDetalleFormMensajeCorreoInven.jTtoolBarDetalleMensajeCorreoInven;		
		}
		
		final JMenuBar jmenuBarDetalleMensajeCorreoInven=jmenuBarDetalleAuxiliarMensajeCorreoInven;
		final JToolBar jTtoolBarDetalleMensajeCorreoInven=jTtoolBarDetalleAuxiliarMensajeCorreoInven;
		
		
		
		if(Constantes2.CON_PROCESO_HILO) {
			Thread threadRunnableProcess;
			ProcessRunnable processRunnable;
			
			processRunnable=new ProcessRunnable();
			
			processRunnable.setsTipo("END");
			processRunnable.setDesktop(jDesktopPane);
			processRunnable.setModuloActual(moduloActual);
			processRunnable.setModuloUsuarioSeleccionado(moduloActual);
			processRunnable.setOpcionActual(opcionActual);
			processRunnable.setParametroGeneralSg(parametroGeneralSg);
			processRunnable.setParametroGeneralUsuario(parametroGeneralUsuario);
			processRunnable.setResumenUsuarioActual(resumenUsuarioActual);
			processRunnable.setUsuarioActual(usuarioActual);
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasMensajeCorreoInven;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesMensajeCorreoInven;
			processRunnable.jTableDatos=jTableDatosMensajeCorreoInven;
			processRunnable.jPanelCampos=jPanelCamposMensajeCorreoInven;
			processRunnable.jPanelPaginacion=jPanelPaginacionMensajeCorreoInven;
			processRunnable.jPanelAcciones=jPanelAccionesMensajeCorreoInven;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioMensajeCorreoInven;
			
			
			processRunnable.jmenuBar=jmenuBarMensajeCorreoInven;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleMensajeCorreoInven;
			processRunnable.jTtoolBar=jTtoolBarMensajeCorreoInven;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleMensajeCorreoInven;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasMensajeCorreoInven ,jPanelParametrosReportesMensajeCorreoInven, jTableDatosMensajeCorreoInven,/*jScrollPanelDatosMensajeCorreoInven,*/jPanelCamposMensajeCorreoInven,jPanelPaginacionMensajeCorreoInven, /*jScrollPanelDatosEdicionMensajeCorreoInven,*/ jPanelAccionesMensajeCorreoInven,jPanelAccionesFormularioMensajeCorreoInven,jmenuBarMensajeCorreoInven,jmenuBarDetalleMensajeCorreoInven,jTtoolBarMensajeCorreoInven,jTtoolBarDetalleMensajeCorreoInven));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesMensajeCorreoInven(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarMensajeCorreoInven(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuMensajeCorreoInven(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarMensajeCorreoInven(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarMensajeCorreoInven,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleMensajeCorreoInven,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuMensajeCorreoInven(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarMensajeCorreoInven,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleMensajeCorreoInven,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.mensajecorreoinvenConstantesFunciones.getsFinalQueryMensajeCorreoInven();
		String  finalQueryPaginacionTodos=this.mensajecorreoinvenConstantesFunciones.getsFinalQueryMensajeCorreoInven();
		
		Boolean esBusqueda=false;
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		if(!sAccionBusqueda.equals("Todos"))	{
			esBusqueda=true;
		}
		
		this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
		this.arrDatoGeneralNo= new  ArrayList<String>();
		
		ArrayList<String> arrColumnasGlobalesNo=MensajeCorreoInvenConstantesFunciones.getArrayColumnasGlobalesNoMensajeCorreoInven(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=MensajeCorreoInvenConstantesFunciones.getArrayColumnasGlobalesMensajeCorreoInven(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,MensajeCorreoInvenConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.mensajecorreoinvensEliminados= new ArrayList<MensajeCorreoInven>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessMensajeCorreoInven();
		
				///*MensajeCorreoInvenSessionBean*/this.mensajecorreoinvenSessionBean=new MensajeCorreoInvenSessionBean();
			
			if(this.mensajecorreoinvenSessionBean==null) {
				this.mensajecorreoinvenSessionBean=new MensajeCorreoInvenSessionBean();
			}
			
			//ACTUALIZA EL TAMANIO DE PAGINACION DESDE EL COMBO
			if(this.sTipoPaginacion!=null && !this.sTipoPaginacion.equals("")) {
				if(!this.sTipoPaginacion.equals("TODOS")) {
					this.iNumeroPaginacion=Integer.parseInt(this.sTipoPaginacion);
				} else {
					this.iNumeroPaginacion=-1;
					this.iNumeroPaginacionPagina=-1;
				}
			} else {
				if(this.iNumeroPaginacion==null || (this.iNumeroPaginacion!=null && this.iNumeroPaginacion<=0)) {
					this.iNumeroPaginacion=MensajeCorreoInvenConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=MensajeCorreoInvenConstantesFunciones.getClassesForeignKeysOfMensajeCorreoInven(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/mensajecorreoinven."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			mensajecorreoinvensAux= new ArrayList<MensajeCorreoInven>();
			
				
			mensajecorreoinvenLogic.setDatosCliente(this.datosCliente);
			mensajecorreoinvenLogic.setDatosDeep(this.datosDeep);
			mensajecorreoinvenLogic.setIsConDeep(true);
			
			
			mensajecorreoinvenLogic.getMensajeCorreoInvenDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					mensajecorreoinvenLogic.getTodosMensajeCorreoInvens(finalQueryGlobal,pagination);
					
					//mensajecorreoinvenLogic.getTodosMensajeCorreoInvensWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(mensajecorreoinvenLogic.getMensajeCorreoInvens()==null|| mensajecorreoinvenLogic.getMensajeCorreoInvens().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							mensajecorreoinvensAux= new ArrayList<MensajeCorreoInven>();
							mensajecorreoinvensAux.addAll(mensajecorreoinvenLogic.getMensajeCorreoInvens());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							mensajecorreoinvensAux= new ArrayList<MensajeCorreoInven>();
							mensajecorreoinvensAux.addAll(mensajecorreoinvens);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							mensajecorreoinvenLogic.getTodosMensajeCorreoInvens(finalQueryGlobal+"",this.pagination);												
							
							//mensajecorreoinvenLogic.getTodosMensajeCorreoInvensWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteMensajeCorreoInvens("Todos",mensajecorreoinvenLogic.getMensajeCorreoInvens() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							mensajecorreoinvenLogic.setMensajeCorreoInvens(new ArrayList<MensajeCorreoInven>());					
							mensajecorreoinvenLogic.getMensajeCorreoInvens().addAll(mensajecorreoinvensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							mensajecorreoinvens=new ArrayList<MensajeCorreoInven>();
							mensajecorreoinvens.addAll(mensajecorreoinvensAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idMensajeCorreoInven=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idMensajeCorreoInven=this.idActual;
				
				} else if(this.idMensajeCorreoInvenActual!=null && this.idMensajeCorreoInvenActual!=0L) {
					idMensajeCorreoInven=idMensajeCorreoInvenActual;
				}
				
					
				this.sDetalleReporte=MensajeCorreoInvenConstantesFunciones.getDetalleIndicePorId(idMensajeCorreoInven);
				
				this.mensajecorreoinvens=new ArrayList<MensajeCorreoInven>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					mensajecorreoinvenLogic.getEntity(idMensajeCorreoInven);
					
					//mensajecorreoinvenLogic.getEntityWithConnection(idMensajeCorreoInven);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					mensajecorreoinvenLogic.setMensajeCorreoInvens(new ArrayList<MensajeCorreoInven>());
					mensajecorreoinvenLogic.getMensajeCorreoInvens().add(mensajecorreoinvenLogic.getMensajeCorreoInven());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.mensajecorreoinvens=new ArrayList<MensajeCorreoInven>();
					this.mensajecorreoinvens.add(mensajecorreoinven);
				}
				
				if(mensajecorreoinvenLogic.getMensajeCorreoInven()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=MensajeCorreoInvenConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					mensajecorreoinvenLogic.getMensajeCorreoInvensFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=MensajeCorreoInvenConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=MensajeCorreoInvenConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=mensajecorreoinvenLogic.getMensajeCorreoInvens()==null||mensajecorreoinvenLogic.getMensajeCorreoInvens().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=mensajecorreoinvens==null|| mensajecorreoinvens.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						mensajecorreoinvensAux=new ArrayList<MensajeCorreoInven>();
						mensajecorreoinvensAux.addAll(mensajecorreoinvenLogic.getMensajeCorreoInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							mensajecorreoinvensAux=new ArrayList<MensajeCorreoInven>();
							mensajecorreoinvensAux.addAll(mensajecorreoinvens);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							mensajecorreoinvenLogic.getMensajeCorreoInvensFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=MensajeCorreoInvenConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=MensajeCorreoInvenConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteMensajeCorreoInvens("FK_IdEmpresa",mensajecorreoinvenLogic.getMensajeCorreoInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteMensajeCorreoInvens("FK_IdEmpresa",mensajecorreoinvens);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						mensajecorreoinvenLogic.setMensajeCorreoInvens(new ArrayList<MensajeCorreoInven>());
						mensajecorreoinvenLogic.getMensajeCorreoInvens().addAll(mensajecorreoinvensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							mensajecorreoinvens=new ArrayList<MensajeCorreoInven>();
							mensajecorreoinvens.addAll(mensajecorreoinvensAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdModulo")) {
				this.sDetalleReporte=MensajeCorreoInvenConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					mensajecorreoinvenLogic.getMensajeCorreoInvensFK_IdModulo(finalQueryGlobal,pagination,id_moduloFK_IdModulo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=MensajeCorreoInvenConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=MensajeCorreoInvenConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=mensajecorreoinvenLogic.getMensajeCorreoInvens()==null||mensajecorreoinvenLogic.getMensajeCorreoInvens().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=mensajecorreoinvens==null|| mensajecorreoinvens.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						mensajecorreoinvensAux=new ArrayList<MensajeCorreoInven>();
						mensajecorreoinvensAux.addAll(mensajecorreoinvenLogic.getMensajeCorreoInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							mensajecorreoinvensAux=new ArrayList<MensajeCorreoInven>();
							mensajecorreoinvensAux.addAll(mensajecorreoinvens);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							mensajecorreoinvenLogic.getMensajeCorreoInvensFK_IdModulo(finalQueryGlobal,pagination,id_moduloFK_IdModulo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=MensajeCorreoInvenConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=MensajeCorreoInvenConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteMensajeCorreoInvens("FK_IdModulo",mensajecorreoinvenLogic.getMensajeCorreoInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteMensajeCorreoInvens("FK_IdModulo",mensajecorreoinvens);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						mensajecorreoinvenLogic.setMensajeCorreoInvens(new ArrayList<MensajeCorreoInven>());
						mensajecorreoinvenLogic.getMensajeCorreoInvens().addAll(mensajecorreoinvensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							mensajecorreoinvens=new ArrayList<MensajeCorreoInven>();
							mensajecorreoinvens.addAll(mensajecorreoinvensAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=MensajeCorreoInvenConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					mensajecorreoinvenLogic.getMensajeCorreoInvensFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=MensajeCorreoInvenConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=MensajeCorreoInvenConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=mensajecorreoinvenLogic.getMensajeCorreoInvens()==null||mensajecorreoinvenLogic.getMensajeCorreoInvens().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=mensajecorreoinvens==null|| mensajecorreoinvens.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						mensajecorreoinvensAux=new ArrayList<MensajeCorreoInven>();
						mensajecorreoinvensAux.addAll(mensajecorreoinvenLogic.getMensajeCorreoInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							mensajecorreoinvensAux=new ArrayList<MensajeCorreoInven>();
							mensajecorreoinvensAux.addAll(mensajecorreoinvens);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							mensajecorreoinvenLogic.getMensajeCorreoInvensFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=MensajeCorreoInvenConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=MensajeCorreoInvenConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteMensajeCorreoInvens("FK_IdSucursal",mensajecorreoinvenLogic.getMensajeCorreoInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteMensajeCorreoInvens("FK_IdSucursal",mensajecorreoinvens);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						mensajecorreoinvenLogic.setMensajeCorreoInvens(new ArrayList<MensajeCorreoInven>());
						mensajecorreoinvenLogic.getMensajeCorreoInvens().addAll(mensajecorreoinvensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							mensajecorreoinvens=new ArrayList<MensajeCorreoInven>();
							mensajecorreoinvens.addAll(mensajecorreoinvensAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoMensajeCorreoInven")) {
				this.sDetalleReporte=MensajeCorreoInvenConstantesFunciones.getDetalleIndiceFK_IdTipoMensajeCorreoInven(id_tipo_mensaje_correo_invenFK_IdTipoMensajeCorreoInven);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					mensajecorreoinvenLogic.getMensajeCorreoInvensFK_IdTipoMensajeCorreoInven(finalQueryGlobal,pagination,id_tipo_mensaje_correo_invenFK_IdTipoMensajeCorreoInven);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=MensajeCorreoInvenConstantesFunciones.getDetalleIndiceFK_IdTipoMensajeCorreoInven(id_tipo_mensaje_correo_invenFK_IdTipoMensajeCorreoInven);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=MensajeCorreoInvenConstantesFunciones.getDetalleIndiceFK_IdTipoMensajeCorreoInven(id_tipo_mensaje_correo_invenFK_IdTipoMensajeCorreoInven);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=mensajecorreoinvenLogic.getMensajeCorreoInvens()==null||mensajecorreoinvenLogic.getMensajeCorreoInvens().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=mensajecorreoinvens==null|| mensajecorreoinvens.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						mensajecorreoinvensAux=new ArrayList<MensajeCorreoInven>();
						mensajecorreoinvensAux.addAll(mensajecorreoinvenLogic.getMensajeCorreoInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							mensajecorreoinvensAux=new ArrayList<MensajeCorreoInven>();
							mensajecorreoinvensAux.addAll(mensajecorreoinvens);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							mensajecorreoinvenLogic.getMensajeCorreoInvensFK_IdTipoMensajeCorreoInven(finalQueryGlobal,pagination,id_tipo_mensaje_correo_invenFK_IdTipoMensajeCorreoInven);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=MensajeCorreoInvenConstantesFunciones.getDetalleIndiceFK_IdTipoMensajeCorreoInven(id_tipo_mensaje_correo_invenFK_IdTipoMensajeCorreoInven);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=MensajeCorreoInvenConstantesFunciones.getDetalleIndiceFK_IdTipoMensajeCorreoInven(id_tipo_mensaje_correo_invenFK_IdTipoMensajeCorreoInven);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteMensajeCorreoInvens("FK_IdTipoMensajeCorreoInven",mensajecorreoinvenLogic.getMensajeCorreoInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteMensajeCorreoInvens("FK_IdTipoMensajeCorreoInven",mensajecorreoinvens);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						mensajecorreoinvenLogic.setMensajeCorreoInvens(new ArrayList<MensajeCorreoInven>());
						mensajecorreoinvenLogic.getMensajeCorreoInvens().addAll(mensajecorreoinvensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							mensajecorreoinvens=new ArrayList<MensajeCorreoInven>();
							mensajecorreoinvens.addAll(mensajecorreoinvensAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesMensajeCorreoInven();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessMensajeCorreoInven();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=mensajecorreoinvenLogic.getMensajeCorreoInvens().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=mensajecorreoinvens.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=mensajecorreoinvenLogic.getMensajeCorreoInvens().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=mensajecorreoinvens.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(MensajeCorreoInven mensajecorreoinven) {
		Boolean permite=true;
		
		if(this.mensajecorreoinven.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=MensajeCorreoInvenConstantesFunciones.getOrderByListaMensajeCorreoInven();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=MensajeCorreoInvenConstantesFunciones.getOrderByListaMensajeCorreoInven();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(MensajeCorreoInven mensajecorreoinven:mensajecorreoinvenLogic.getMensajeCorreoInvens()) {
				if(mensajecorreoinven.getsType().equals(Constantes2.S_TOTALES)) {
					mensajecorreoinvenTotales=mensajecorreoinven;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(MensajeCorreoInven mensajecorreoinven:this.mensajecorreoinvens) {
				if(mensajecorreoinven.getsType().equals(Constantes2.S_TOTALES)) {
					mensajecorreoinvenTotales=mensajecorreoinven;
					existe=true;
					break;
				}
			}
		}
		
		return existe;
	}
	
	public void crearFilaTotales() throws Exception {
		Boolean existe=false;
		
		existe=this.existeFilaTotales();
		
		if(!existe) {
			//SI NO ES UNO A UNO SE CREA FILA TOTALES
			this.mensajecorreoinvenAux=new MensajeCorreoInven();
			this.mensajecorreoinvenAux.setsType(Constantes2.S_TOTALES);
			this.mensajecorreoinvenAux.setIsNew(false);
			this.mensajecorreoinvenAux.setIsChanged(false);
			this.mensajecorreoinvenAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				MensajeCorreoInvenConstantesFunciones.TotalizarValoresFilaMensajeCorreoInven(this.mensajecorreoinvenLogic.getMensajeCorreoInvens(),this.mensajecorreoinvenAux);
				
				this.mensajecorreoinvenLogic.getMensajeCorreoInvens().add(this.mensajecorreoinvenAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				MensajeCorreoInvenConstantesFunciones.TotalizarValoresFilaMensajeCorreoInven(this.mensajecorreoinvens,this.mensajecorreoinvenAux);
				
				this.mensajecorreoinvens.add(this.mensajecorreoinvenAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		mensajecorreoinvenTotales=new MensajeCorreoInven();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.mensajecorreoinvenLogic.getMensajeCorreoInvens().remove(mensajecorreoinvenTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.mensajecorreoinvens.remove(mensajecorreoinvenTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		mensajecorreoinvenTotales=new MensajeCorreoInven();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(MensajeCorreoInven mensajecorreoinven:mensajecorreoinvenLogic.getMensajeCorreoInvens()) {
				if(mensajecorreoinven.getsType().equals(Constantes2.S_TOTALES)) {
					mensajecorreoinvenTotales=mensajecorreoinven;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				MensajeCorreoInvenConstantesFunciones.TotalizarValoresFilaMensajeCorreoInven(this.mensajecorreoinvenLogic.getMensajeCorreoInvens(),mensajecorreoinvenTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(MensajeCorreoInven mensajecorreoinven:this.mensajecorreoinvens) {
				if(mensajecorreoinven.getsType().equals(Constantes2.S_TOTALES)) {
					mensajecorreoinvenTotales=mensajecorreoinven;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				MensajeCorreoInvenConstantesFunciones.TotalizarValoresFilaMensajeCorreoInven(this.mensajecorreoinvens,mensajecorreoinvenTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getMensajeCorreoInvensFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getMensajeCorreoInvensFK_IdModulo()throws Exception {
		try {
			sAccionBusqueda="FK_IdModulo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getMensajeCorreoInvensFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getMensajeCorreoInvensFK_IdTipoMensajeCorreoInven()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoMensajeCorreoInven";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getMensajeCorreoInvensFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					mensajecorreoinvenLogic.getMensajeCorreoInvensFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getMensajeCorreoInvensFK_IdModulo(String sFinalQuery,Long id_modulo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					mensajecorreoinvenLogic.getMensajeCorreoInvensFK_IdModulo(sFinalQuery,this.pagination,id_modulo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getMensajeCorreoInvensFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					mensajecorreoinvenLogic.getMensajeCorreoInvensFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getMensajeCorreoInvensFK_IdTipoMensajeCorreoInven(String sFinalQuery,Long id_tipo_mensaje_correo_inven)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					mensajecorreoinvenLogic.getMensajeCorreoInvensFK_IdTipoMensajeCorreoInven(sFinalQuery,this.pagination,id_tipo_mensaje_correo_inven);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	
	public void onLoad()throws Exception {		
		try {		
			isEntroOnLoad=true;
			//INTENTA TRAER DATOS DE BUSQUEDA ANTERIOR
			this.traerDatosBusquedaDesdeSession();
					
			//SINO SE CUMPLE VIENE DE PADRE FOREIGN O BUSQUEDA ANTIGUA
			if(this.sAccionBusqueda.equals("")) {
				this.sAccionBusqueda="Todos";
			}
								
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch (Exception e) {
			throw e;
		}
	}		
	
	public void inicializarPermisosMensajeCorreoInven() {
		this.isPermisoTodoMensajeCorreoInven=false;
		this.isPermisoNuevoMensajeCorreoInven=false;
		this.isPermisoActualizarMensajeCorreoInven=false;
		this.isPermisoActualizarOriginalMensajeCorreoInven=false;
		this.isPermisoEliminarMensajeCorreoInven=false;
		this.isPermisoGuardarCambiosMensajeCorreoInven=false;
		this.isPermisoConsultaMensajeCorreoInven=false;
		this.isPermisoBusquedaMensajeCorreoInven=false;
		this.isPermisoReporteMensajeCorreoInven=false;		
		this.isPermisoOrdenMensajeCorreoInven=false;		
		this.isPermisoPaginacionMedioMensajeCorreoInven=false;		
		this.isPermisoPaginacionAltoMensajeCorreoInven=false;
		this.isPermisoPaginacionTodoMensajeCorreoInven=false;
		this.isPermisoCopiarMensajeCorreoInven=false;		
		this.isPermisoVerFormMensajeCorreoInven=false;		
		this.isPermisoDuplicarMensajeCorreoInven=false;		
		this.isPermisoOrdenMensajeCorreoInven=false;		
	}
	
	public void setPermisosUsuarioMensajeCorreoInven(Boolean isPermiso) {
		this.isPermisoTodoMensajeCorreoInven=isPermiso;
		this.isPermisoNuevoMensajeCorreoInven=isPermiso;
		this.isPermisoActualizarMensajeCorreoInven=isPermiso;
		this.isPermisoActualizarOriginalMensajeCorreoInven=isPermiso;
		this.isPermisoEliminarMensajeCorreoInven=isPermiso;
		this.isPermisoGuardarCambiosMensajeCorreoInven=isPermiso;
		this.isPermisoConsultaMensajeCorreoInven=isPermiso;
		this.isPermisoBusquedaMensajeCorreoInven=isPermiso;
		this.isPermisoReporteMensajeCorreoInven=isPermiso;
		this.isPermisoOrdenMensajeCorreoInven=isPermiso;		
		this.isPermisoPaginacionMedioMensajeCorreoInven=isPermiso;		
		this.isPermisoPaginacionAltoMensajeCorreoInven=isPermiso;		
		this.isPermisoPaginacionTodoMensajeCorreoInven=isPermiso;		
		this.isPermisoCopiarMensajeCorreoInven=isPermiso;		
		this.isPermisoVerFormMensajeCorreoInven=isPermiso;		
		this.isPermisoDuplicarMensajeCorreoInven=isPermiso;
		this.isPermisoOrdenMensajeCorreoInven=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioMensajeCorreoInven(Boolean isPermiso) {
		//this.isPermisoTodoMensajeCorreoInven=isPermiso;
		this.isPermisoNuevoMensajeCorreoInven=isPermiso;
		this.isPermisoActualizarMensajeCorreoInven=isPermiso;
		this.isPermisoActualizarOriginalMensajeCorreoInven=isPermiso;
		this.isPermisoEliminarMensajeCorreoInven=isPermiso;
		this.isPermisoGuardarCambiosMensajeCorreoInven=isPermiso;
		//this.isPermisoConsultaMensajeCorreoInven=isPermiso;
		//this.isPermisoBusquedaMensajeCorreoInven=isPermiso;
		//this.isPermisoReporteMensajeCorreoInven=isPermiso;
		//this.isPermisoOrdenMensajeCorreoInven=isPermiso;		
		//this.isPermisoPaginacionMedioMensajeCorreoInven=isPermiso;		
		//this.isPermisoPaginacionAltoMensajeCorreoInven=isPermiso;		
		//this.isPermisoPaginacionTodoMensajeCorreoInven=isPermiso;		
		//this.isPermisoCopiarMensajeCorreoInven=isPermiso;		
		//this.isPermisoDuplicarMensajeCorreoInven=isPermiso;
		//this.isPermisoOrdenMensajeCorreoInven=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioMensajeCorreoInvenClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(DetalleMensajeCorreoInvenConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(MailMensajeCorreoInvenConstantesFunciones.SNOMBREOPCION);
		
		if(MensajeCorreoInvenJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosDetalleMensajeCorreoInven=false;
		this.isTienePermisosDetalleMensajeCorreoInven=this.verificarGetPermisosUsuarioOpcionMensajeCorreoInvenClaseRelacionada(this.opcionsRelacionadas,DetalleMensajeCorreoInvenConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosMailMensajeCorreoInven=false;
		this.isTienePermisosMailMensajeCorreoInven=this.verificarGetPermisosUsuarioOpcionMensajeCorreoInvenClaseRelacionada(this.opcionsRelacionadas,MailMensajeCorreoInvenConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebMensajeCorreoInven(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioMensajeCorreoInvenClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosDetalleMensajeCorreoInven=conPermiso;
		this.isTienePermisosMailMensajeCorreoInven=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioMensajeCorreoInvenClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionMensajeCorreoInvenClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioMensajeCorreoInvenClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosDetalleMensajeCorreoInven && this.jInternalFrameDetalleFormMensajeCorreoInven!=null && this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormMensajeCorreoInven.jTabbedPaneRelacionesMensajeCorreoInven.remove(this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosMailMensajeCorreoInven && this.jInternalFrameDetalleFormMensajeCorreoInven!=null && this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormMensajeCorreoInven.jTabbedPaneRelacionesMensajeCorreoInven.remove(this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioMensajeCorreoInven() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(MensajeCorreoInvenJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, MensajeCorreoInvenConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoMensajeCorreoInven=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarMensajeCorreoInven=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalMensajeCorreoInven=this.isPermisoActualizarMensajeCorreoInven;
			this.isPermisoEliminarMensajeCorreoInven=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosMensajeCorreoInven=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaMensajeCorreoInven=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaMensajeCorreoInven=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoMensajeCorreoInven=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteMensajeCorreoInven=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenMensajeCorreoInven=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioMensajeCorreoInven=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoMensajeCorreoInven=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoMensajeCorreoInven=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarMensajeCorreoInven=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormMensajeCorreoInven=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarMensajeCorreoInven=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenMensajeCorreoInven=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosMensajeCorreoInven.setToolTipText(this.jTableDatosMensajeCorreoInven.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioMensajeCorreoInven(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioMensajeCorreoInven(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(MensajeCorreoInvenJInternalFrame.CON_LLAMADA_SIMPLE) {
				this.accions=this.sistemaReturnGeneral.getAccions();
				
				
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.accions=sistemaLogicAdditional.getAccionesUsuario(this.usuarioActual,this.opcionActual,false);				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}
			
			if(this.accions.size()>0) {			
				for(Accion accion:this.accions) {
					reporte=new Reporte();
					reporte.setsCodigo(accion.getcodigo());
					reporte.setsDescripcion(accion.getnombre());
		
		
					this.tiposAcciones.add(reporte);
				}
			}	
			
			

			reporte=new Reporte();
			reporte.setsCodigo("");
			reporte.setsDescripcion("");

			this.tiposAcciones.add(reporte);
			
		} else {
			//ACCIONES FORMULARIO
			this.accionsFormulario=new ArrayList<Accion>();
			
			if(MensajeCorreoInvenJInternalFrame.CON_LLAMADA_SIMPLE) {
				this.accionsFormulario=this.sistemaReturnGeneral.getAccionsFormulario();
			
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.accionsFormulario=sistemaLogicAdditional.getAccionesUsuario(this.usuarioActual,this.opcionActual,true);				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}
			
			if(this.accionsFormulario.size()>0) {			
				for(Accion accion:this.accionsFormulario) {
					reporte=new Reporte();
					reporte.setsCodigo(accion.getcodigo());
					reporte.setsDescripcion(accion.getnombre());
					
					this.tiposAccionesFormulario.add(reporte);
				}
			}	
			
			

			reporte=new Reporte();
			reporte.setsCodigo("");
			reporte.setsDescripcion("");

			this.tiposAccionesFormulario.add(reporte);
		}				
	}	 	
	
	public void setRelacionesUsuarioMensajeCorreoInven() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosDetalleMensajeCorreoInven && this.mensajecorreoinvenConstantesFunciones.mostrarDetalleMensajeCorreoInvenMensajeCorreoInven && !MensajeCorreoInvenConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Detalle Mensaje Correo Inven");
			reporte.setsDescripcion("Detalle Mensaje Correo Inven");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosMailMensajeCorreoInven && this.mensajecorreoinvenConstantesFunciones.mostrarMailMensajeCorreoInvenMensajeCorreoInven && !MensajeCorreoInvenConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Mail Mensaje Correo Inven");
			reporte.setsDescripcion("Mail Mensaje Correo Inven");
			this.tiposRelaciones.add(reporte);
		}
		
		
		//ORDENAR ALFABETICAMENTE
		Collections.sort(this.tiposRelaciones, new ReporteComparator());
		/*
		reporte=new Reporte();
		reporte.setsCodigo(accion.getcodigo());
		reporte.setsDescripcion(accion.getnombre());
			
		this.tiposRelaciones.add(reporte);
		*/
	}	
	
		
	@SuppressWarnings({ "unchecked", "rawtypes" } )
	public void inicializarCombosForeignKeyMensajeCorreoInvenListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.modulosForeignKey=new ArrayList();
				this.tipomensajecorreoinvensForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyMensajeCorreoInvenListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(MensajeCorreoInvenJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyMensajeCorreoInvenListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyModuloListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoMensajeCorreoInvenListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyEmpresaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EmpresaConstantesFunciones.SFINALQUERY;

				this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeySucursalListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=SucursalConstantesFunciones.SFINALQUERY;

				this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyModuloListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.modulosForeignKey==null||this.modulosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ModuloConstantesFunciones.getArrayColumnasGlobalesModulo(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ModuloConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ModuloConstantesFunciones.SFINALQUERY;

				this.cargarCombosModulosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoMensajeCorreoInvenListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipomensajecorreoinvensForeignKey==null||this.tipomensajecorreoinvensForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoMensajeCorreoInvenConstantesFunciones.getArrayColumnasGlobalesTipoMensajeCorreoInven(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoMensajeCorreoInvenConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoMensajeCorreoInvenConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoMensajeCorreoInvensForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyMensajeCorreoInvenListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			MensajeCorreoInvenParameterReturnGeneral mensajecorreoinvenReturnGeneral=new MensajeCorreoInvenParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.mensajecorreoinvenConstantesFunciones.cargarid_empresaMensajeCorreoInven)
					 || (this.esRecargarFks && this.mensajecorreoinvenConstantesFunciones.cargarid_empresaMensajeCorreoInven)) {

					if(!this.mensajecorreoinvenSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+mensajecorreoinvenSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.mensajecorreoinvenConstantesFunciones.cargarid_sucursalMensajeCorreoInven)
					 || (this.esRecargarFks && this.mensajecorreoinvenConstantesFunciones.cargarid_sucursalMensajeCorreoInven)) {

					if(!this.mensajecorreoinvenSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+mensajecorreoinvenSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalModulo="";

				if(((this.modulosForeignKey==null||this.modulosForeignKey.size()<=0) && this.mensajecorreoinvenConstantesFunciones.cargarid_moduloMensajeCorreoInven)
					 || (this.esRecargarFks && this.mensajecorreoinvenConstantesFunciones.cargarid_moduloMensajeCorreoInven)) {

					if(!this.mensajecorreoinvenSessionBean.getisBusquedaDesdeForeignKeySesionModulo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ModuloConstantesFunciones.getArrayColumnasGlobalesModulo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalModulo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ModuloConstantesFunciones.TABLENAME);

						finalQueryGlobalModulo=Funciones.GetFinalQueryAppend(finalQueryGlobalModulo, "");
						finalQueryGlobalModulo+=ModuloConstantesFunciones.SFINALQUERY;

						//this.cargarCombosModulosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalModulo=" WHERE " + ConstantesSql.ID + "="+mensajecorreoinvenSessionBean.getlidModuloActual();
					}
				} else {
					finalQueryGlobalModulo="NONE";
				}


				String finalQueryGlobalTipoMensajeCorreoInven="";

				if(((this.tipomensajecorreoinvensForeignKey==null||this.tipomensajecorreoinvensForeignKey.size()<=0) && this.mensajecorreoinvenConstantesFunciones.cargarid_tipo_mensaje_correo_invenMensajeCorreoInven)
					 || (this.esRecargarFks && this.mensajecorreoinvenConstantesFunciones.cargarid_tipo_mensaje_correo_invenMensajeCorreoInven)) {

					if(!this.mensajecorreoinvenSessionBean.getisBusquedaDesdeForeignKeySesionTipoMensajeCorreoInven()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoMensajeCorreoInvenConstantesFunciones.getArrayColumnasGlobalesTipoMensajeCorreoInven(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoMensajeCorreoInven=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoMensajeCorreoInvenConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoMensajeCorreoInven=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoMensajeCorreoInven, "");
						finalQueryGlobalTipoMensajeCorreoInven+=TipoMensajeCorreoInvenConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoMensajeCorreoInvensForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoMensajeCorreoInven=" WHERE " + ConstantesSql.ID + "="+mensajecorreoinvenSessionBean.getlidTipoMensajeCorreoInvenActual();
					}
				} else {
					finalQueryGlobalTipoMensajeCorreoInven="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				mensajecorreoinvenReturnGeneral=mensajecorreoinvenLogic.cargarCombosLoteForeignKeyMensajeCorreoInven(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalModulo,finalQueryGlobalTipoMensajeCorreoInven);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=mensajecorreoinvenReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=mensajecorreoinvenReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalModulo.equals("NONE")) {
				this.modulosForeignKey=mensajecorreoinvenReturnGeneral.getmodulosForeignKey();
			}

			if(!finalQueryGlobalTipoMensajeCorreoInven.equals("NONE")) {
				this.tipomensajecorreoinvensForeignKey=mensajecorreoinvenReturnGeneral.gettipomensajecorreoinvensForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyMensajeCorreoInven()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyModulo();
			this.addItemDefectoCombosForeignKeyTipoMensajeCorreoInven();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.mensajecorreoinvenSessionBean==null) {
				this.mensajecorreoinvenSessionBean=new MensajeCorreoInvenSessionBean();
			}

			if(!this.mensajecorreoinvenSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
				Empresa empresa=new Empresa();
				EmpresaConstantesFunciones.setEmpresaDescripcion(empresa,Constantes.SMENSAJE_ESCOJA_OPCION);
				empresa.setId(null);

				if(!EmpresaConstantesFunciones.ExisteEnLista(this.empresasForeignKey,empresa,true)) {

					this.empresasForeignKey.add(0,empresa);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeySucursal()throws Exception {
		try {

			if(!this.mensajecorreoinvenSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
				Sucursal sucursal=new Sucursal();
				SucursalConstantesFunciones.setSucursalDescripcion(sucursal,Constantes.SMENSAJE_ESCOJA_OPCION);
				sucursal.setId(null);

				if(!SucursalConstantesFunciones.ExisteEnLista(this.sucursalsForeignKey,sucursal,true)) {

					this.sucursalsForeignKey.add(0,sucursal);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyModulo()throws Exception {
		try {

			if(!this.mensajecorreoinvenSessionBean.getisBusquedaDesdeForeignKeySesionModulo()) {
				Modulo modulo=new Modulo();
				ModuloConstantesFunciones.setModuloDescripcion(modulo,Constantes.SMENSAJE_ESCOJA_OPCION);
				modulo.setId(null);

				if(!ModuloConstantesFunciones.ExisteEnLista(this.modulosForeignKey,modulo,true)) {

					this.modulosForeignKey.add(0,modulo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoMensajeCorreoInven()throws Exception {
		try {

			if(!this.mensajecorreoinvenSessionBean.getisBusquedaDesdeForeignKeySesionTipoMensajeCorreoInven()) {
				TipoMensajeCorreoInven tipomensajecorreoinven=new TipoMensajeCorreoInven();
				TipoMensajeCorreoInvenConstantesFunciones.setTipoMensajeCorreoInvenDescripcion(tipomensajecorreoinven,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipomensajecorreoinven.setId(null);

				if(!TipoMensajeCorreoInvenConstantesFunciones.ExisteEnLista(this.tipomensajecorreoinvensForeignKey,tipomensajecorreoinven,true)) {

					this.tipomensajecorreoinvensForeignKey.add(0,tipomensajecorreoinven);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyMensajeCorreoInven()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyMensajeCorreoInven(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyMensajeCorreoInven()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
				this.setActualModuloForeignKey(this.moduloActual.getId(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyMensajeCorreoInven();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyMensajeCorreoInven(MensajeCorreoInven mensajecorreoinven)throws Exception {	
		try {
			
			this.setActualTipoMensajeCorreoInvenForeignKey(mensajecorreoinven.getid_tipo_mensaje_correo_inven(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyMensajeCorreoInven(MensajeCorreoInven mensajecorreoinven,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyMensajeCorreoInven()throws Exception {	
		try {
			
			this.setActualTipoMensajeCorreoInvenForeignKey(this.mensajecorreoinvenConstantesFunciones.getid_tipo_mensaje_correo_inven(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyMensajeCorreoInven()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyMensajeCorreoInven()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyMensajeCorreoInven()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroMensajeCorreoInven()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyMensajeCorreoInven()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameModulosForeignKey("Todos");
			this.cargarCombosFrameTipoMensajeCorreoInvensForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyMensajeCorreoInven(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameModulosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoMensajeCorreoInvensForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyMensajeCorreoInven()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormMensajeCorreoInven.jComboBoxid_empresaMensajeCorreoInven!=null && this.jInternalFrameDetalleFormMensajeCorreoInven.jComboBoxid_empresaMensajeCorreoInven.getItemCount()>0) {
				this.jInternalFrameDetalleFormMensajeCorreoInven.jComboBoxid_empresaMensajeCorreoInven.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormMensajeCorreoInven.jComboBoxid_sucursalMensajeCorreoInven!=null && this.jInternalFrameDetalleFormMensajeCorreoInven.jComboBoxid_sucursalMensajeCorreoInven.getItemCount()>0) {
				this.jInternalFrameDetalleFormMensajeCorreoInven.jComboBoxid_sucursalMensajeCorreoInven.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormMensajeCorreoInven.jComboBoxid_moduloMensajeCorreoInven!=null && this.jInternalFrameDetalleFormMensajeCorreoInven.jComboBoxid_moduloMensajeCorreoInven.getItemCount()>0) {
				this.jInternalFrameDetalleFormMensajeCorreoInven.jComboBoxid_moduloMensajeCorreoInven.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormMensajeCorreoInven.jComboBoxid_tipo_mensaje_correo_invenMensajeCorreoInven!=null && this.jInternalFrameDetalleFormMensajeCorreoInven.jComboBoxid_tipo_mensaje_correo_invenMensajeCorreoInven.getItemCount()>0) {
				this.jInternalFrameDetalleFormMensajeCorreoInven.jComboBoxid_tipo_mensaje_correo_invenMensajeCorreoInven.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	








	
	

	public MensajeCorreoInvenBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public MensajeCorreoInvenBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public MensajeCorreoInvenBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.mensajecorreoinvenSessionBean=new MensajeCorreoInvenSessionBean(); 
		this.mensajecorreoinvenConstantesFunciones=new MensajeCorreoInvenConstantesFunciones(); 
		this.mensajecorreoinvenBean=new MensajeCorreoInven();//(this.mensajecorreoinvenConstantesFunciones); 		
		this.mensajecorreoinvenReturnGeneral=new MensajeCorreoInvenParameterReturnGeneral(); 
		
		this.mensajecorreoinvenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.mensajecorreoinvenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public MensajeCorreoInvenBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public MensajeCorreoInvenBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public MensajeCorreoInvenBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessMensajeCorreoInven(true);
			
			Boolean esParaBusquedaForeignKey=false;//ANTES USADO COMO PARAMETRO DEL CONSTRUCTOR
			
			if(paginaTipo.equals(PaginaTipo.BUSQUEDA)) {
				esParaBusquedaForeignKey=true;
			}
			
			
			
			//SE ASIGNA EN CLASE PADRE
			/*
			this.parametroGeneralSg=parametroGeneralSg;		
			this.parametroGeneralUsuario=parametroGeneralUsuario;	
			this.usuarioActual=usuarioActual;
			this.moduloActual=moduloActual;
			*/						
			
			long start_time=0;
			long end_time=0;
			
			if(Constantes2.ISDEVELOPING2) {
				start_time = System.currentTimeMillis();
			}
			
			if(!cargarTodosDatos) {
				this.sAccionBusqueda="NINGUNO";
			}
			
			this.mensajecorreoinvenConstantesFunciones=new MensajeCorreoInvenConstantesFunciones(); 
			this.mensajecorreoinvenBean=new MensajeCorreoInven();//this.mensajecorreoinvenConstantesFunciones); 			
			this.mensajecorreoinvenReturnGeneral=new MensajeCorreoInvenParameterReturnGeneral(); 
		
			MensajeCorreoInvenBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Mensaje Correo Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.mensajecorreoinven=new MensajeCorreoInven();
			this.mensajecorreoinvens = new ArrayList<MensajeCorreoInven>();
			this.mensajecorreoinvensAux = new ArrayList<MensajeCorreoInven>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mensajecorreoinvenLogic=new MensajeCorreoInvenLogic();
				this.mensajecorreoinvenLogic.getNewConnexionToDeep("");
			}
			
			//this.mensajecorreoinvenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.mensajecorreoinvenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormMensajeCorreoInven);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoMensajeCorreoInven!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoMensajeCorreoInven);	
					}
					
					if(this.jInternalFrameImportacionMensajeCorreoInven!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionMensajeCorreoInven);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByMensajeCorreoInven!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByMensajeCorreoInven);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormMensajeCorreoInven!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormMensajeCorreoInven);
				this.jInternalFrameDetalleFormMensajeCorreoInven.setVisible(false);
				this.jInternalFrameDetalleFormMensajeCorreoInven.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoMensajeCorreoInven!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoMensajeCorreoInven);
					this.jInternalFrameReporteDinamicoMensajeCorreoInven.setVisible(false);
					this.jInternalFrameReporteDinamicoMensajeCorreoInven.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionMensajeCorreoInven!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionMensajeCorreoInven);
					this.jInternalFrameImportacionMensajeCorreoInven.setVisible(false);
					this.jInternalFrameImportacionMensajeCorreoInven.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByMensajeCorreoInven!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByMensajeCorreoInven);
					this.jInternalFrameOrderByMensajeCorreoInven.setVisible(false);
					this.jInternalFrameOrderByMensajeCorreoInven.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idMensajeCorreoInvenActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=MensajeCorreoInvenConstantesFunciones.INUMEROPAGINACION;
			this.pagination=new Pagination();
			this.datosCliente=new DatosCliente();
			this.lIdUsuarioSesion=0L;	
			this.sTipoArchivoReporte="";
			this.sTipoArchivoReporteDinamico="";
			this.sTipoReporte="";
			this.sTipoReporteDinamico="";
			this.sTipoPaginacion="";
			this.sTipoRelacion="";
			this.sTipoAccion="";
			this.sTipoAccionFormulario="";
			this.sTipoSeleccionar="";			
			this.sDetalleReporte="";
			this.sTipoReporteExtra="";
			this.sValorCampoGeneral="";
			this.sPathReporteDinamico="";			
			
			this.isMostrarNumeroPaginacion=false;
			this.isSeleccionarTodos=false;
			this.isSeleccionados=false;
			this.conGraficoReporte=false;
			this.isPostAccionNuevo=false;
			this.isPostAccionSinCerrar=false;
			this.isPostAccionSinMensaje=false;
			this.esReporteDinamico=false;
			this.esRecargarFks=false;
			this.esReporteAccionProceso=false;
			
			this.mensajecorreoinvenReturnGeneral=new MensajeCorreoInvenParameterReturnGeneral();
			
			this.mensajecorreoinvenParameterGeneral=new MensajeCorreoInvenParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.mensajecorreoinvenLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					if(!sistemaLogicAdditional.validarLicenciaCliente(this.datosCliente,this.moduloActual,this.usuarioActual)) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_CONTROLGLOBAL);
					}
					
				} else if(Constantes.ISUSAEJBREMOTE) {
					
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}			
			
			//VERIFICAR GLOBAL
			
			//VERIFICAR SESSION ACTUAL
			//this.cargarDatosCliente();
			
			this.sistemaReturnGeneral=new SistemaParameterReturnGeneral();
			
			SistemaParameterReturnGeneralAdditional.inicializarSinSeguridad(this.sistemaReturnGeneral);
			
			if(MensajeCorreoInvenJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(DetalleMensajeCorreoInvenConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(MailMensajeCorreoInvenConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,MensajeCorreoInvenConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado(),this.mensajecorreoinvenSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,MensajeCorreoInvenConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado(),this.mensajecorreoinvenSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					if(!this.sistemaReturnGeneral.getEsValidado()) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_SESIONACTUAL);
					}
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
					//FALTA
				}
			} else { 
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					if(!sistemaLogicAdditional.validarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual)) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_SESIONACTUAL);
					}
				
				} else if(Constantes.ISUSAEJBREMOTE) {
					
				} else if(Constantes.ISUSAEJBHOME) {
				}
			} 
			//VERIFICAR SESSION ACTUAL
			
			
			this.sVisibilidadTablaBusquedas="table-row";
			this.sVisibilidadTablaElementos="none";
			this.sVisibilidadTablaAcciones="none";
			
			this.isVisibilidadCeldaNuevoMensajeCorreoInven=false;
			this.isVisibilidadCeldaDuplicarMensajeCorreoInven=true;
			this.isVisibilidadCeldaCopiarMensajeCorreoInven=true;
			this.isVisibilidadCeldaVerFormMensajeCorreoInven=true;
			this.isVisibilidadCeldaOrdenMensajeCorreoInven=true;
			this.isVisibilidadCeldaNuevoRelacionesMensajeCorreoInven=false;
			this.isVisibilidadCeldaModificarMensajeCorreoInven=false;
			this.isVisibilidadCeldaActualizarMensajeCorreoInven=false;
			this.isVisibilidadCeldaEliminarMensajeCorreoInven=false;
			this.isVisibilidadCeldaCancelarMensajeCorreoInven=false;
			this.isVisibilidadCeldaGuardarMensajeCorreoInven=false;
			this.isVisibilidadCeldaGuardarCambiosMensajeCorreoInven=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdModulo=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdTipoMensajeCorreoInven=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesMensajeCorreoInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosMensajeCorreoInven();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioMensajeCorreoInven(false);
			
			this.setPermisosUsuarioMensajeCorreoInven();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado() 
				|| (this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado() && this.mensajecorreoinvenSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioMensajeCorreoInvenClasesRelacionadas();
			}
			
			if(this.mensajecorreoinvenSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioMensajeCorreoInvenClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!MensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosMensajeCorreoInven();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualMensajeCorreoInven();
			}
			
			if(!this.isPermisoBusquedaMensajeCorreoInven) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasMensajeCorreoInven.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioMensajeCorreoInven,this.isPermisoPaginacionMedioMensajeCorreoInven,this.isPermisoPaginacionTodoMensajeCorreoInven);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(MensajeCorreoInvenConstantesFunciones.getTiposSeleccionarMensajeCorreoInven());
				
				this.tiposColumnasSelect=MensajeCorreoInvenConstantesFunciones.getTiposSeleccionarMensajeCorreoInven(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectMensajeCorreoInven();				
				//this.tiposRelacionesSelect=MensajeCorreoInvenConstantesFunciones.getTiposRelacionesMensajeCorreoInven(true);
				
			} else {
				this.tiposArchivosReportes=new ArrayList<Reporte>();
				this.tiposArchivosReportesDinamico=new ArrayList<Reporte>();
				this.tiposReportes=new ArrayList<Reporte>();
				this.tiposReportesDinamico=new ArrayList<Reporte>();
				this.tiposGraficosReportes=new ArrayList<Reporte>();
				this.tiposPaginacion=new ArrayList<Reporte>();
				this.tiposSeleccionar=new ArrayList<Reporte>();			
				this.tiposColumnasSelect=new ArrayList<Reporte>();	
				this.tiposRelacionesSelect=new ArrayList<Reporte>();	
			}
						
			
			//FUNCIONALIDAD_RELACIONADO
			//if(!this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioMensajeCorreoInven();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioMensajeCorreoInven(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioMensajeCorreoInven(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesMensajeCorreoInven() ;
			
			/*
			} else {
				this.tiposAcciones=new ArrayList<Reporte>();
				this.tiposAccionesFormulario=new ArrayList<Reporte>();
			}
			*/						
			
			this.inicializarInvalidValues();
						
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			
			
			this.arrOrderBy= new  ArrayList<OrderBy>();
			
			
			this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
			
			
			this.traerValoresTablaOrderBy();			
			
			
			this.isGuardarCambiosEnLote=false;
			this.isCargarCombosDependencia=false;
			
			
			this.detallemensajecorreoinvenLogic=new DetalleMensajeCorreoInvenLogic();
			this.mailmensajecorreoinvenLogic=new MailMensajeCorreoInvenLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.sucursalLogic=new SucursalLogic();
			this.moduloLogic=new ModuloLogic();
			this.tipomensajecorreoinvenLogic=new TipoMensajeCorreoInvenLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				mensajecorreoinvenImplementable= (MensajeCorreoInvenImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+MensajeCorreoInvenConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				mensajecorreoinvenImplementableHome= (MensajeCorreoInvenImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+MensajeCorreoInvenConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.mensajecorreoinvens= new ArrayList<MensajeCorreoInven>();
			this.mensajecorreoinvensEliminados= new ArrayList<MensajeCorreoInven>();
						
			this.isEsNuevoMensajeCorreoInven=false;
			this.esParaAccionDesdeFormularioMensajeCorreoInven=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.modulosForeignKey=new ArrayList<Modulo>() ;
			this.tipomensajecorreoinvensForeignKey=new ArrayList<TipoMensajeCorreoInven>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyMensajeCorreoInven(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroMensajeCorreoInven();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			MensajeCorreoInvenBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=MensajeCorreoInvenConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesMensajeCorreoInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingMensajeCorreoInven(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormMensajeCorreoInven!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioMensajeCorreoInven();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioMensajeCorreoInven();
			}
			
			MensajeCorreoInvenBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasMensajeCorreoInven.getTabCount(); i++) {
					this.jTabbedPaneBusquedasMensajeCorreoInven.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasMensajeCorreoInven.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mensajecorreoinvenLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessMensajeCorreoInven(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga MensajeCorreoInven: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mensajecorreoinvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mensajecorreoinvenLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectMensajeCorreoInven() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(DetalleMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(DetalleMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(MailMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(MailMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesMensajeCorreoInven")) {
				iIndex=this.jInternalFrameDetalleFormMensajeCorreoInven.jTabbedPaneRelacionesMensajeCorreoInven.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormMensajeCorreoInven.jTabbedPaneRelacionesMensajeCorreoInven.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosMensajeCorreoInven.getSelectedRow();	
				
				

				if(sTitle.equals("Detalle Mensaje Correo Invenes")) {
					if(!DetalleMensajeCorreoInvenJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessMensajeCorreoInven();

						this.cargarParteTabPanelRelacionadaDetalleMensajeCorreoInven(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Mail Mensaje Correo Invenes")) {
					if(!MailMensajeCorreoInvenJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessMensajeCorreoInven();

						this.cargarParteTabPanelRelacionadaMailMensajeCorreoInven(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessMensajeCorreoInven();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaDetalleMensajeCorreoInven(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormMensajeCorreoInven.cargarSessionConBeanSwingJInternalFrameDetalleMensajeCorreoInven(false,true,iIndex);
		this.jButtonDetalleMensajeCorreoInvenActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaDetalleMensajeCorreoInven();

		//this.jTabbedPaneRelacionesMensajeCorreoInven.updateUI();
		//this.jTabbedPaneRelacionesMensajeCorreoInven.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesMensajeCorreoInven.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaMailMensajeCorreoInven(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormMensajeCorreoInven.cargarSessionConBeanSwingJInternalFrameMailMensajeCorreoInven(false,true,iIndex);
		this.jButtonMailMensajeCorreoInvenActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaMailMensajeCorreoInven();

		//this.jTabbedPaneRelacionesMensajeCorreoInven.updateUI();
		//this.jTabbedPaneRelacionesMensajeCorreoInven.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesMensajeCorreoInven.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("DetalleMensajeCorreoInven")) {
				int row=this.jTableDatosMensajeCorreoInven.getSelectedRow();
				jButtonDetalleMensajeCorreoInvenActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("MailMensajeCorreoInven")) {
				int row=this.jTableDatosMensajeCorreoInven.getSelectedRow();
				jButtonMailMensajeCorreoInvenActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Detalle Mensaje Correo Inven")) {

					if(this.isTienePermisosDetalleMensajeCorreoInven && this.mensajecorreoinvenConstantesFunciones.mostrarDetalleMensajeCorreoInvenMensajeCorreoInven && !MensajeCorreoInvenConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Detalle Mensaje Correo Invenes"+"("+DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Detalle Mensaje Correo Invenes");

						if(mensajecorreoinvenConstantesFunciones.resaltarDetalleMensajeCorreoInvenMensajeCorreoInven!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(mensajecorreoinvenConstantesFunciones.resaltarDetalleMensajeCorreoInvenMensajeCorreoInven);
						}

						jmenuItem.setEnabled(this.mensajecorreoinvenConstantesFunciones.activarDetalleMensajeCorreoInvenMensajeCorreoInven);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"DetalleMensajeCorreoInven"));

						

						this.jInternalFrameDetalleFormMensajeCorreoInven.jmenuDetalleMensajeCorreoInven.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Mail Mensaje Correo Inven")) {

					if(this.isTienePermisosMailMensajeCorreoInven && this.mensajecorreoinvenConstantesFunciones.mostrarMailMensajeCorreoInvenMensajeCorreoInven && !MensajeCorreoInvenConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Mail Mensaje Correo Invenes"+"("+MailMensajeCorreoInvenConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Mail Mensaje Correo Invenes");

						if(mensajecorreoinvenConstantesFunciones.resaltarMailMensajeCorreoInvenMensajeCorreoInven!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(mensajecorreoinvenConstantesFunciones.resaltarMailMensajeCorreoInvenMensajeCorreoInven);
						}

						jmenuItem.setEnabled(this.mensajecorreoinvenConstantesFunciones.activarMailMensajeCorreoInvenMensajeCorreoInven);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"MailMensajeCorreoInven"));

						

						this.jInternalFrameDetalleFormMensajeCorreoInven.jmenuDetalleMensajeCorreoInven.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyMensajeCorreoInven(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyMensajeCorreoInven(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyMensajeCorreoInven(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyMensajeCorreoInvenListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyMensajeCorreoInven();
		
		this.cargarCombosFrameForeignKeyMensajeCorreoInven();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyMensajeCorreoInven();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyMensajeCorreoInven();
		}
	}
	
	

	public void cargarCombosForeignKeyTipoMensajeCorreoInven(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoMensajeCorreoInvenListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoMensajeCorreoInven();
				this.cargarCombosFrameTipoMensajeCorreoInvensForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoMensajeCorreoInven(this.tipomensajecorreoinvensForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoMensajeCorreoInvenActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.mensajecorreoinvenSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormMensajeCorreoInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			MensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.mensajecorreoinven,new Object(),this.mensajecorreoinvenParameterGeneral,this.mensajecorreoinvenReturnGeneral);
			
			
			if(jTableDatosMensajeCorreoInven.getRowCount()>=1) {
				jTableDatosMensajeCorreoInven.removeRowSelectionInterval(0, jTableDatosMensajeCorreoInven.getRowCount()-1);						
			}
			
			this.isEsNuevoMensajeCorreoInven=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoMensajeCorreoInven(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesMensajeCorreoInven(true);			
			//this.mensajecorreoinven=new MensajeCorreoInven();
			//this.mensajecorreoinven.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesMensajeCorreoInven(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualMensajeCorreoInven() ;
			
			if(MensajeCorreoInvenJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleMensajeCorreoInven(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.mensajecorreoinven);	
			this.actualizarInformacion("INFO_PADRE",false,this.mensajecorreoinven);				
			
			MensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.mensajecorreoinven,new Object(),this.mensajecorreoinvenParameterGeneral,this.mensajecorreoinvenReturnGeneral);
			
			if(this.mensajecorreoinvenSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar MensajeCorreoInven: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			MensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.mensajecorreoinven,new Object(),this.mensajecorreoinvenParameterGeneral,this.mensajecorreoinvenReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarMensajeCorreoInvenActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<MensajeCorreoInven> mensajecorreoinvensSeleccionados=new ArrayList<MensajeCorreoInven>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosMensajeCorreoInven.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosMensajeCorreoInven.getSelectedRows().length;			
			}
			
			mensajecorreoinvensSeleccionados=this.getMensajeCorreoInvensSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoMensajeCorreoInven--;			
				//MensajeCorreoInven mensajecorreoinvenAux= new MensajeCorreoInven();			
				//mensajecorreoinvenAux.setId(this.iIdNuevoMensajeCorreoInven);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//MensajeCorreoInven mensajecorreoinvenOrigen=new MensajeCorreoInven();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(MensajeCorreoInven mensajecorreoinvenOrigen : mensajecorreoinvensSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosMensajeCorreoInven.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							mensajecorreoinvenOrigen =(MensajeCorreoInven) this.mensajecorreoinvenLogic.getMensajeCorreoInvens().toArray()[this.jTableDatosMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							mensajecorreoinvenOrigen =(MensajeCorreoInven) this.mensajecorreoinvens.toArray()[this.jTableDatosMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaMensajeCorreoInven();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.mensajecorreoinven.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosMensajeCorreoInven(mensajecorreoinvenOrigen,this.mensajecorreoinven,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysMensajeCorreoInven(this.mensajecorreoinven);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.mensajecorreoinvenLogic.getMensajeCorreoInvens().add(this.mensajecorreoinvenAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.mensajecorreoinvens.add(this.mensajecorreoinvenAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaMensajeCorreoInven(false);
				
				this.jTableDatosMensajeCorreoInven.setRowSelectionInterval(this.getIndiceNuevoMensajeCorreoInven(), this.getIndiceNuevoMensajeCorreoInven());
				
				int iLastRow =  this.jTableDatosMensajeCorreoInven.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosMensajeCorreoInven.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosMensajeCorreoInven.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaMensajeCorreoInven(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<MensajeCorreoInven> mensajecorreoinvensSeleccionados=new ArrayList<MensajeCorreoInven>();									
		
			MensajeCorreoInven mensajecorreoinvenOrigen=new MensajeCorreoInven();
			MensajeCorreoInven mensajecorreoinvenDestino=new MensajeCorreoInven();
				
			mensajecorreoinvensSeleccionados=this.getMensajeCorreoInvensSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosMensajeCorreoInven.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || mensajecorreoinvensSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosMensajeCorreoInven.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						mensajecorreoinvenOrigen =(MensajeCorreoInven) this.mensajecorreoinvenLogic.getMensajeCorreoInvens().toArray()[this.jTableDatosMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						mensajecorreoinvenOrigen =(MensajeCorreoInven) this.mensajecorreoinvens.toArray()[this.jTableDatosMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						mensajecorreoinvenDestino =(MensajeCorreoInven) this.mensajecorreoinvenLogic.getMensajeCorreoInvens().toArray()[this.jTableDatosMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						mensajecorreoinvenDestino =(MensajeCorreoInven) this.mensajecorreoinvens.toArray()[this.jTableDatosMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				mensajecorreoinvenOrigen =mensajecorreoinvensSeleccionados.get(0);
				mensajecorreoinvenDestino =mensajecorreoinvensSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosMensajeCorreoInven(mensajecorreoinvenOrigen,mensajecorreoinvenDestino,true,false);
				
				mensajecorreoinvenDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(mensajecorreoinvenDestino,mensajecorreoinvenLogic.getMensajeCorreoInvens());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(mensajecorreoinvenDestino,mensajecorreoinvens);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaMensajeCorreoInven(false);
				
				//this.jTableDatosMensajeCorreoInven.setRowSelectionInterval(this.getIndiceNuevoMensajeCorreoInven(), this.getIndiceNuevoMensajeCorreoInven());
				
				int iLastRow =  this.jTableDatosMensajeCorreoInven.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosMensajeCorreoInven.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosMensajeCorreoInven.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaMensajeCorreoInven(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormMensajeCorreoInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormMensajeCorreoInven.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesMensajeCorreoInven.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasMensajeCorreoInven.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesMensajeCorreoInven.setVisible(!isVisible);
			this.jPanelPaginacionMensajeCorreoInven.setVisible(!isVisible);
			this.jPanelAccionesMensajeCorreoInven.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameMensajeCorreoInven();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoMensajeCorreoInven();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionMensajeCorreoInven();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByMensajeCorreoInven();
			
			this.abrirFrameOrderByMensajeCorreoInven();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByMensajeCorreoInven();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleMensajeCorreoInven(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormMensajeCorreoInven);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormMensajeCorreoInven.isMaximum()) {
					this.jInternalFrameDetalleFormMensajeCorreoInven.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormMensajeCorreoInven.setSize(this.jInternalFrameDetalleFormMensajeCorreoInven.iWidthFormulario,this.jInternalFrameDetalleFormMensajeCorreoInven.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormMensajeCorreoInven.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormMensajeCorreoInven.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormMensajeCorreoInven.isMaximum()) {
						this.jInternalFrameDetalleFormMensajeCorreoInven.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormMensajeCorreoInven.jContentPaneDetalleMensajeCorreoInven.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormMensajeCorreoInven.jTabbedPaneRelacionesMensajeCorreoInven.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormMensajeCorreoInven.jContentPaneDetalleMensajeCorreoInven.getWidth(),MensajeCorreoInvenConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormMensajeCorreoInven.jTabbedPaneRelacionesMensajeCorreoInven.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormMensajeCorreoInven.jContentPaneDetalleMensajeCorreoInven.getWidth(),MensajeCorreoInvenConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormMensajeCorreoInven.jTabbedPaneRelacionesMensajeCorreoInven.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormMensajeCorreoInven.jContentPaneDetalleMensajeCorreoInven.getWidth(),MensajeCorreoInvenConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(DetalleMensajeCorreoInvenJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaDetalleMensajeCorreoInven();
					}

					if(MailMensajeCorreoInvenJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaMailMensajeCorreoInven();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormMensajeCorreoInven.setVisible(true);
	        this.jInternalFrameDetalleFormMensajeCorreoInven.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByMensajeCorreoInven() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByMensajeCorreoInven==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByMensajeCorreoInven=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByMensajeCorreoInven,false,this);
				} else {
					this.jInternalFrameOrderByMensajeCorreoInven=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByMensajeCorreoInven,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByMensajeCorreoInven);
				this.jInternalFrameOrderByMensajeCorreoInven.setVisible(false);
				this.jInternalFrameOrderByMensajeCorreoInven.setSelected(false);
				
				this.jInternalFrameOrderByMensajeCorreoInven.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByMensajeCorreoInven"));
				
				this.inicializarActualizarBindingTablaOrderByMensajeCorreoInven();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionMensajeCorreoInven() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionMensajeCorreoInven==null) {
				
				this.jInternalFrameImportacionMensajeCorreoInven=new ImportacionJInternalFrame(MensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionMensajeCorreoInven);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionMensajeCorreoInven);
				this.jInternalFrameImportacionMensajeCorreoInven.setVisible(false);
				this.jInternalFrameImportacionMensajeCorreoInven.setSelected(false);


				this.jInternalFrameImportacionMensajeCorreoInven.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionMensajeCorreoInven"));
				this.jInternalFrameImportacionMensajeCorreoInven.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionMensajeCorreoInven"));
				this.jInternalFrameImportacionMensajeCorreoInven.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionMensajeCorreoInven"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoMensajeCorreoInven() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoMensajeCorreoInven==null) {
				this.jInternalFrameReporteDinamicoMensajeCorreoInven=new ReporteDinamicoJInternalFrame(MensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoMensajeCorreoInven);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoMensajeCorreoInven);
				this.jInternalFrameReporteDinamicoMensajeCorreoInven.setVisible(false);
				this.jInternalFrameReporteDinamicoMensajeCorreoInven.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoMensajeCorreoInven.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoMensajeCorreoInven"));
				this.jInternalFrameReporteDinamicoMensajeCorreoInven.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoMensajeCorreoInven"));
				this.jInternalFrameReporteDinamicoMensajeCorreoInven.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoMensajeCorreoInven"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualMensajeCorreoInven();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaDetalleMensajeCorreoInven() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFrame.jScrollPanelDatosDetalleMensajeCorreoInven.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormMensajeCorreoInven.jContentPaneDetalleMensajeCorreoInven.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFrame.jScrollPanelDatosDetalleMensajeCorreoInven.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFrame.jScrollPanelDatosDetalleMensajeCorreoInven.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFrame.jScrollPanelDatosDetalleMensajeCorreoInven.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaMailMensajeCorreoInven() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFrame.jScrollPanelDatosMailMensajeCorreoInven.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormMensajeCorreoInven.jContentPaneDetalleMensajeCorreoInven.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFrame.jScrollPanelDatosMailMensajeCorreoInven.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFrame.jScrollPanelDatosMailMensajeCorreoInven.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFrame.jScrollPanelDatosMailMensajeCorreoInven.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleMensajeCorreoInven() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormMensajeCorreoInven);
			
	       	this.jInternalFrameDetalleFormMensajeCorreoInven.setVisible(false);
	        this.jInternalFrameDetalleFormMensajeCorreoInven.setSelected(false);
			
			//this.jInternalFrameDetalleFormMensajeCorreoInven.dispose();
			//this.jInternalFrameDetalleFormMensajeCorreoInven=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoMensajeCorreoInven() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoMensajeCorreoInven.setVisible(true);
	        this.jInternalFrameReporteDinamicoMensajeCorreoInven.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionMensajeCorreoInven() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionMensajeCorreoInven.setVisible(true);
	        this.jInternalFrameImportacionMensajeCorreoInven.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByMensajeCorreoInven() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByMensajeCorreoInven.setVisible(true);
	        this.jInternalFrameOrderByMensajeCorreoInven.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByMensajeCorreoInven() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByMensajeCorreoInven.setVisible(false);
	        this.jInternalFrameOrderByMensajeCorreoInven.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoMensajeCorreoInven() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoMensajeCorreoInven.setVisible(false);
	        this.jInternalFrameReporteDinamicoMensajeCorreoInven.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionMensajeCorreoInven() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionMensajeCorreoInven.setVisible(false);
	        this.jInternalFrameImportacionMensajeCorreoInven.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarMensajeCorreoInven(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarMensajeCorreoInven(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosMensajeCorreoInven.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesMensajeCorreoInven(true);
			//this.isEsNuevoMensajeCorreoInven=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mensajecorreoinven =(MensajeCorreoInven) this.mensajecorreoinvenLogic.getMensajeCorreoInvens().toArray()[this.jTableDatosMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.mensajecorreoinven =(MensajeCorreoInven) this.mensajecorreoinvens.toArray()[this.jTableDatosMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesMensajeCorreoInven("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesMensajeCorreoInven(false) ;
			
			if(mensajecorreoinvenSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFrame.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado() && DetalleMensajeCorreoInvenJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleMensajeCorreoInvenActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFrame.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado() && MailMensajeCorreoInvenJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonMailMensajeCorreoInvenActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(MensajeCorreoInvenJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleMensajeCorreoInven(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualMensajeCorreoInven(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaMensajeCorreoInvenActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosMensajeCorreoInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mensajecorreoinven =(MensajeCorreoInven) this.mensajecorreoinvenLogic.getMensajeCorreoInvens().toArray()[this.jTableDatosMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.mensajecorreoinven =(MensajeCorreoInven) this.mensajecorreoinvens.toArray()[this.jTableDatosMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarMensajeCorreoInven(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormMensajeCorreoInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosMensajeCorreoInven.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesMensajeCorreoInven(true);
			//this.isEsNuevoMensajeCorreoInven=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mensajecorreoinven =(MensajeCorreoInven) this.mensajecorreoinvenLogic.getMensajeCorreoInvens().toArray()[this.jTableDatosMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.mensajecorreoinven =(MensajeCorreoInven) this.mensajecorreoinvens.toArray()[this.jTableDatosMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.mensajecorreoinven.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesMensajeCorreoInven("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesMensajeCorreoInven(false) ;
			
			if(MensajeCorreoInvenJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleMensajeCorreoInven(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualMensajeCorreoInven(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
				
	
	public void recargarComboTablaTipoMensajeCorreoInven(List<TipoMensajeCorreoInven> tipomensajecorreoinvensForeignKey)throws Exception{
		TableColumn tableColumnTipoMensajeCorreoInven=this.jTableDatosMensajeCorreoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMensajeCorreoInven,MensajeCorreoInvenConstantesFunciones.LABEL_IDTIPOMENSAJECORREOINVEN));
		TableCellEditor tableCellEditorTipoMensajeCorreoInven =tableColumnTipoMensajeCorreoInven.getCellEditor();

		TipoMensajeCorreoInvenTableCell tipomensajecorreoinvenTableCellFk=(TipoMensajeCorreoInvenTableCell)tableCellEditorTipoMensajeCorreoInven;

		if(tipomensajecorreoinvenTableCellFk!=null) {
			tipomensajecorreoinvenTableCellFk.settipomensajecorreoinvensForeignKey(tipomensajecorreoinvensForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosMensajeCorreoInven.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipomensajecorreoinvenTableCellFk.setRowActual(intSelectedRow);
			//tipomensajecorreoinvenTableCellFk.settipomensajecorreoinvensForeignKeyActual(tipomensajecorreoinvensForeignKey);
		//}


		if(tipomensajecorreoinvenTableCellFk!=null) {
			tipomensajecorreoinvenTableCellFk.RecargarTipoMensajeCorreoInvensForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mensajecorreoinvenLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesMensajeCorreoInven(false);
			
			//if(!this.isEsNuevoMensajeCorreoInven) {								
				int intSelectedRow = this.jTableDatosMensajeCorreoInven.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mensajecorreoinven =(MensajeCorreoInven) this.mensajecorreoinvenLogic.getMensajeCorreoInvens().toArray()[this.jTableDatosMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.mensajecorreoinven =(MensajeCorreoInven) this.mensajecorreoinvens.toArray()[this.jTableDatosMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(MensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualMensajeCorreoInven(this.mensajecorreoinven,true);
				this.setVariablesFormularioToObjetoActualForeignKeysMensajeCorreoInven(this.mensajecorreoinven);
				
			}
			
			if(this.permiteMantenimiento(this.mensajecorreoinven)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoMensajeCorreoInven=true;
					this.inicializarActualizarBindingTablaMensajeCorreoInven(false);
					this.isEsNuevoMensajeCorreoInven=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoMensajeCorreoInven=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoMensajeCorreoInven=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesMensajeCorreoInven(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualMensajeCorreoInven(false);
				
				this.habilitarDeshabilitarControlesMensajeCorreoInven(false);
			
												
				
				if(MensajeCorreoInvenJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleMensajeCorreoInven();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoMensajeCorreoInvenActionPerformed(evt,mensajecorreoinvenSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualMensajeCorreoInven(this.mensajecorreoinven,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosMensajeCorreoInven.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,mensajecorreoinvenSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mensajecorreoinvenLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.mensajecorreoinven.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(MensajeCorreoInven.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MensajeCorreoInven.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mensajecorreoinvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mensajecorreoinvenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mensajecorreoinvenLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosMensajeCorreoInven.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mensajecorreoinven =(MensajeCorreoInven) this.mensajecorreoinvenLogic.getMensajeCorreoInvens().toArray()[this.jTableDatosMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				this.mensajecorreoinven.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.mensajecorreoinven =(MensajeCorreoInven) this.mensajecorreoinvens.toArray()[this.jTableDatosMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				this.mensajecorreoinven.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.mensajecorreoinven)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((MensajeCorreoInvenModel) this.jTableDatosMensajeCorreoInven.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoMensajeCorreoInven=true;
				this.inicializarActualizarBindingTablaMensajeCorreoInven(false);
				this.isEsNuevoMensajeCorreoInven=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesMensajeCorreoInven(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualMensajeCorreoInven(false);
				
				this.habilitarDeshabilitarControlesMensajeCorreoInven(false);
				
				
				
				if(MensajeCorreoInvenJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleMensajeCorreoInven();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mensajecorreoinvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mensajecorreoinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mensajecorreoinvenLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosMensajeCorreoInven.getRowCount()>=1) {
				jTableDatosMensajeCorreoInven.removeRowSelectionInterval(0, jTableDatosMensajeCorreoInven.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesMensajeCorreoInven(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaMensajeCorreoInven(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesMensajeCorreoInven(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualMensajeCorreoInven(false) ;
			
			this.isEsNuevoMensajeCorreoInven=false;
			
			if(MensajeCorreoInvenJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleMensajeCorreoInven();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mensajecorreoinvenLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingMensajeCorreoInven(false);
				
				//SI ES MANUAL
				if(MensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualMensajeCorreoInven();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mensajecorreoinvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mensajecorreoinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mensajecorreoinvenLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoMensajeCorreoInven--;			
			//MensajeCorreoInven mensajecorreoinvenAux= new MensajeCorreoInven();			
			//mensajecorreoinvenAux.setId(this.iIdNuevoMensajeCorreoInven);
			
			if(this.jInternalFrameDetalleFormMensajeCorreoInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaMensajeCorreoInven();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysMensajeCorreoInven(this.mensajecorreoinven);
			
			this.mensajecorreoinven.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.mensajecorreoinvenLogic.getMensajeCorreoInvens().add(this.mensajecorreoinvenAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.mensajecorreoinvens.add(this.mensajecorreoinvenAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaMensajeCorreoInven(false);
			
			this.jTableDatosMensajeCorreoInven.setRowSelectionInterval(this.getIndiceNuevoMensajeCorreoInven(), this.getIndiceNuevoMensajeCorreoInven());
			
			int iLastRow =  this.jTableDatosMensajeCorreoInven.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosMensajeCorreoInven.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosMensajeCorreoInven.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaMensajeCorreoInven(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mensajecorreoinvenLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingMensajeCorreoInven(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingMensajeCorreoInven(false);
			
			//SI ES MANUAL
			if(MensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualMensajeCorreoInven();
			}
			
			//this.abrirFrameTreeMensajeCorreoInven();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mensajecorreoinvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mensajecorreoinvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mensajecorreoinvenLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Mensaje CorreoES ?", "MANTENIMIENTO DE Mensaje Correo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionMensajeCorreoInven.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralMensajeCorreoInven();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.mensajecorreoinvenReturnGeneral=mensajecorreoinvenLogic.procesarImportacionMensajeCorreoInvensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.mensajecorreoinvenParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarMensajeCorreoInvenReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionMensajeCorreoInven.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionMensajeCorreoInven.setFileImportacion(this.jInternalFrameImportacionMensajeCorreoInven.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionMensajeCorreoInven.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionMensajeCorreoInven.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionMensajeCorreoInven.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionMensajeCorreoInven.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<MensajeCorreoInven> mensajecorreoinvensSeleccionados=new ArrayList<MensajeCorreoInven>();		

		mensajecorreoinvensSeleccionados=this.getMensajeCorreoInvensSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoMensajeCorreoInven.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoMensajeCorreoInven.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("MensajeCorreoInvenBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"MensajeCorreoInvenBaseDesign.jrxml";
			
			sXmlStringFile=Funciones2.getStringFromInputStream(reportFile);
						
			bufferedWriter = new BufferedWriter(new FileWriter(sPath));
			
			
			sXmlStringFile=this.actualizarReporteDinamico(sXmlStringFile);
			
			
			bufferedWriter.write(sXmlStringFile);
			
			bufferedWriter.close();
			
			try{JasperCompileManager.compileReportToFile(sPath);}catch(Exception e){e.printStackTrace();}
			
			this.actualizarVariablesTipoReporte(false,true,false,sPath);
			
			/*
			this.esReporteDinamico=true;
			this.sPathReporteDinamico=sPath.replace(".jrxml",".jasper");
			this.sTipoReporteExtra="";
			*/
			
			this.generarReporteMensajeCorreoInvens("Todos",mensajecorreoinvensSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Mensaje Correo",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}
	}		
	
	
	public String actualizarReporteDinamico(String sXmlStringFile) {				
		Reporte reporte=new Reporte();
		Integer iAnchoMaximoVertical=535;//781,782
		Integer iAnchoMaximoHorizontal=782;
		Integer iAnchoSum=0;
		Integer iAnchoColumna=0;
		
		Integer iAnchoMargenes=60;
		String sWidthGrafico="535";
		
		for(int index:this.jInternalFrameReporteDinamicoMensajeCorreoInven.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoMensajeCorreoInven.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case MensajeCorreoInvenConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MensajeCorreoInvenConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MensajeCorreoInvenConstantesFunciones.LABEL_IDMODULO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Modulo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Modulo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Modulo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Modulo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MensajeCorreoInvenConstantesFunciones.LABEL_IDTIPOMENSAJECORREOINVEN:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoMensajeCorreoInven_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoMensajeCorreoInven_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoMensajeCorreoInven_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoMensajeCorreoInven_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MensajeCorreoInvenConstantesFunciones.LABEL_TEMA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ma_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ma_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ma_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ma_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MensajeCorreoInvenConstantesFunciones.LABEL_MENSAJE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nsaje_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nsaje_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nsaje_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nsaje_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MensajeCorreoInvenConstantesFunciones.LABEL_AVISO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_iso_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_iso_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_iso_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_iso_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MensajeCorreoInvenConstantesFunciones.LABEL_ESTAACTIVO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_taActivo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_taActivo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_taActivo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_taActivo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;
					
				default :
					break;
			}
		}
		
		iAnchoSum+=iAnchoMargenes;
		
		if(iAnchoSum>iAnchoMaximoVertical) {
			sXmlStringFile=sXmlStringFile.replace("595", "842");
			//sXmlStringFile=sXmlStringFile.replace("842", "595");
			sXmlStringFile=sXmlStringFile.replace("535", "782");
			sXmlStringFile=sXmlStringFile.replace("Portrait", "Landscape");			
			sWidthGrafico="782";
		
		} else {
			sXmlStringFile=sXmlStringFile.replace("842", "595");
			//sXmlStringFile=sXmlStringFile.replace("595", "842");
			sXmlStringFile=sXmlStringFile.replace("782", "535");
			sXmlStringFile=sXmlStringFile.replace("Landscape", "Portrait");
			sWidthGrafico="535";
		}
		
		if(this.jInternalFrameReporteDinamicoMensajeCorreoInven.getjCheckBoxConGraficoDinamico().isSelected()) {
			sXmlStringFile=this.actualizarGraficoReporteDinamico(sXmlStringFile,sWidthGrafico);
		} else {
			sXmlStringFile=sXmlStringFile.replace("colancho_summary_colancho", "30");
		}
		
		return sXmlStringFile;
	}
	
	
	
	public String actualizarGraficoReporteDinamico(String sXmlStringFile,String sWidthGrafico) {		
		String strGrafico="";		
		String sTipo="NORMAL";
		String strCategorySeries="";
		String sNombreCampoCategoria="";
		String sNombreCampoCategoriaValor="";
		Reporte reporte=new Reporte();
		Reporte reporteCategoriaValor=new Reporte();
		Reporte reporteTipoGraficoReporte=new Reporte();
		Boolean existe=false;
		
		sXmlStringFile=sXmlStringFile.replace("colancho_summary_colancho", "280");
		
		//CATEGORIA GRAFICO				
		reporte=((Reporte)this.jInternalFrameReporteDinamicoMensajeCorreoInven.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoMensajeCorreoInven.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case MensajeCorreoInvenConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case MensajeCorreoInvenConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case MensajeCorreoInvenConstantesFunciones.LABEL_IDMODULO:
					sNombreCampoCategoria="id_modulo";
					break;

				case MensajeCorreoInvenConstantesFunciones.LABEL_IDTIPOMENSAJECORREOINVEN:
					sNombreCampoCategoria="id_tipo_mensaje_correo_inven";
					break;

				case MensajeCorreoInvenConstantesFunciones.LABEL_TEMA:
					sNombreCampoCategoria="tema";
					break;

				case MensajeCorreoInvenConstantesFunciones.LABEL_MENSAJE:
					sNombreCampoCategoria="mensaje";
					break;

				case MensajeCorreoInvenConstantesFunciones.LABEL_AVISO:
					sNombreCampoCategoria="aviso";
					break;

				case MensajeCorreoInvenConstantesFunciones.LABEL_ESTAACTIVO:
					sNombreCampoCategoria="esta_activo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoMensajeCorreoInven.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case MensajeCorreoInvenConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case MensajeCorreoInvenConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case MensajeCorreoInvenConstantesFunciones.LABEL_IDMODULO:
					sNombreCampoCategoriaValor="id_modulo";
					break;

				case MensajeCorreoInvenConstantesFunciones.LABEL_IDTIPOMENSAJECORREOINVEN:
					sNombreCampoCategoriaValor="id_tipo_mensaje_correo_inven";
					break;

				case MensajeCorreoInvenConstantesFunciones.LABEL_TEMA:
					sNombreCampoCategoriaValor="tema";
					break;

				case MensajeCorreoInvenConstantesFunciones.LABEL_MENSAJE:
					sNombreCampoCategoriaValor="mensaje";
					break;

				case MensajeCorreoInvenConstantesFunciones.LABEL_AVISO:
					sNombreCampoCategoriaValor="aviso";
					break;

				case MensajeCorreoInvenConstantesFunciones.LABEL_ESTAACTIVO:
					sNombreCampoCategoriaValor="esta_activo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoMensajeCorreoInven.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoMensajeCorreoInven.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case MensajeCorreoInvenConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case MensajeCorreoInvenConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case MensajeCorreoInvenConstantesFunciones.LABEL_IDMODULO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Modulo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_modulo");
					break;

				case MensajeCorreoInvenConstantesFunciones.LABEL_IDTIPOMENSAJECORREOINVEN:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"T. Mensaje Correo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_mensaje_correo_inven");
					break;

				case MensajeCorreoInvenConstantesFunciones.LABEL_TEMA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tema",sNombreCampoCategoria,sNombreCampoCategoriaValor,"tema");
					break;

				case MensajeCorreoInvenConstantesFunciones.LABEL_MENSAJE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Mensaje",sNombreCampoCategoria,sNombreCampoCategoriaValor,"mensaje");
					break;

				case MensajeCorreoInvenConstantesFunciones.LABEL_AVISO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Aviso",sNombreCampoCategoria,sNombreCampoCategoriaValor,"aviso");
					break;

				case MensajeCorreoInvenConstantesFunciones.LABEL_ESTAACTIVO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Esta Activo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"esta_activo");
					break;
					
				default :
					break;
			}
		}
		//VALORES GRAFICO
		//if(sTipoGraficoReporte.equals("BARRAS") || sTipoGraficoReporte.equals("BARRAS_3D") || sTipoGraficoReporte.equals("BARRAS_XY") ||
		//   sTipoGraficoReporte.equals("PASTEL") || sTipoGraficoReporte.equals("PASTEL_3D") || sTipoGraficoReporte.equals("APILADO")) {
			
			existe=true;
			strGrafico=FuncionesReporte.getStringGraficoReporte(sTipoGraficoReporte,sWidthGrafico,strCategorySeries);			
		//}
		
		if(existe) {
			sXmlStringFile=sXmlStringFile.replace("<!--GRAFICO-->", strGrafico);
		}												
		
		return sXmlStringFile;
	}
	
	
	//@SuppressWarnings("deprecation")
	
	public void jButtonGenerarExcelReporteDinamicoMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<MensajeCorreoInven> mensajecorreoinvensSeleccionados=new ArrayList<MensajeCorreoInven>();		
		
		mensajecorreoinvensSeleccionados=this.getMensajeCorreoInvensSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"mensajecorreoinven";//.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		Boolean existeFilas=false;
		
		Workbook workbook = null;
		FileOutputStream fileOutputStream=null;
		Reporte reporte=new Reporte();
		
		try {
			
			if(sTipoArchivoReporte=="EXCEL2") {
				workbook = new HSSFWorkbook();
				sPath+=".xls";
			
			} else if(sTipoArchivoReporte=="EXCEL2_2") {
				workbook = new XSSFWorkbook();
				sPath+=".xlsx";			
			}
		
			Sheet sheet = workbook.createSheet("MensajeCorreoInvens");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoMensajeCorreoInven.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoMensajeCorreoInven.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case MensajeCorreoInvenConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MensajeCorreoInvenConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(MensajeCorreoInven mensajecorreoinven:mensajecorreoinvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(mensajecorreoinven.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MensajeCorreoInvenConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MensajeCorreoInvenConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(MensajeCorreoInven mensajecorreoinven:mensajecorreoinvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(mensajecorreoinven.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MensajeCorreoInvenConstantesFunciones.LABEL_IDMODULO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MensajeCorreoInvenConstantesFunciones.LABEL_IDMODULO);
					iRow++;

					for(MensajeCorreoInven mensajecorreoinven:mensajecorreoinvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(mensajecorreoinven.getmodulo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MensajeCorreoInvenConstantesFunciones.LABEL_IDTIPOMENSAJECORREOINVEN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MensajeCorreoInvenConstantesFunciones.LABEL_IDTIPOMENSAJECORREOINVEN);
					iRow++;

					for(MensajeCorreoInven mensajecorreoinven:mensajecorreoinvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(mensajecorreoinven.gettipomensajecorreoinven_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MensajeCorreoInvenConstantesFunciones.LABEL_TEMA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MensajeCorreoInvenConstantesFunciones.LABEL_TEMA);
					iRow++;

					for(MensajeCorreoInven mensajecorreoinven:mensajecorreoinvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(mensajecorreoinven.gettema());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MensajeCorreoInvenConstantesFunciones.LABEL_MENSAJE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MensajeCorreoInvenConstantesFunciones.LABEL_MENSAJE);
					iRow++;

					for(MensajeCorreoInven mensajecorreoinven:mensajecorreoinvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(mensajecorreoinven.getmensaje());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MensajeCorreoInvenConstantesFunciones.LABEL_AVISO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MensajeCorreoInvenConstantesFunciones.LABEL_AVISO);
					iRow++;

					for(MensajeCorreoInven mensajecorreoinven:mensajecorreoinvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(mensajecorreoinven.getaviso());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MensajeCorreoInvenConstantesFunciones.LABEL_ESTAACTIVO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MensajeCorreoInvenConstantesFunciones.LABEL_ESTAACTIVO);
					iRow++;

					for(MensajeCorreoInven mensajecorreoinven:mensajecorreoinvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(mensajecorreoinven.getesta_activo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;
					
					default :
						break;
				}
			}
			
			
			//if(conCabecera) {
			//	this.getFilaCabeceraExportarExcelMensajeCorreoInven(row);				
			//	iRow++;
			//}				
			
			//for(MensajeCorreoInven mensajecorreoinvenAux:mensajecorreoinvensSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelMensajeCorreoInven(mensajecorreoinvenAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Mensaje Correo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}				
	}	
	
	
	
	
	public void buscarPorId(Long idActual) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mensajecorreoinvenLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingMensajeCorreoInven(false);
			
			//SI ES MANUAL
			if(MensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualMensajeCorreoInven();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mensajecorreoinvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mensajecorreoinvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mensajecorreoinvenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mensajecorreoinvenLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingMensajeCorreoInven(false);
			
			//SI ES MANUAL
			if(MensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualMensajeCorreoInven();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mensajecorreoinvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mensajecorreoinvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mensajecorreoinvenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mensajecorreoinvenLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingMensajeCorreoInven(false);
			
			//SI ES MANUAL
			if(MensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualMensajeCorreoInven();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mensajecorreoinvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mensajecorreoinvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mensajecorreoinvenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaMensajeCorreoInven() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosMensajeCorreoInven.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosMensajeCorreoInven.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosMensajeCorreoInven.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosMensajeCorreoInven.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosMensajeCorreoInven.setMinimumSize(dimensionMinimum);
		this.jTableDatosMensajeCorreoInven.setMaximumSize(dimensionMaximum);
		this.jTableDatosMensajeCorreoInven.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingMensajeCorreoInven(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingMensajeCorreoInven(esInicializar,true);
	}
	
	public void inicializarActualizarBindingMensajeCorreoInven(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaMensajeCorreoInven(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesMensajeCorreoInven(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasMensajeCorreoInven(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesMensajeCorreoInven(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesMensajeCorreoInven(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !MensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!MensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualMensajeCorreoInven() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaMensajeCorreoInven();
		
		this.inicializarActualizarBindingBotonesManualMensajeCorreoInven(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualMensajeCorreoInven();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesMensajeCorreoInven() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualMensajeCorreoInven(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualMensajeCorreoInven(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosMensajeCorreoInven.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosMensajeCorreoInven.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteMensajeCorreoInven.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormMensajeCorreoInven!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormMensajeCorreoInven.jCheckBoxPostAccionNuevoMensajeCorreoInven.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormMensajeCorreoInven.jCheckBoxPostAccionSinCerrarMensajeCorreoInven.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormMensajeCorreoInven.jCheckBoxPostAccionSinMensajeMensajeCorreoInven.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosMensajeCorreoInven.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosMensajeCorreoInven.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteMensajeCorreoInven.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormMensajeCorreoInven!=null) {
				this.jInternalFrameDetalleFormMensajeCorreoInven.jCheckBoxPostAccionNuevoMensajeCorreoInven.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormMensajeCorreoInven.jCheckBoxPostAccionSinCerrarMensajeCorreoInven.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormMensajeCorreoInven.jCheckBoxPostAccionSinMensajeMensajeCorreoInven.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionMensajeCorreoInven.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionMensajeCorreoInven.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormMensajeCorreoInven!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormMensajeCorreoInven.jComboBoxTiposAccionesFormularioMensajeCorreoInven.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesMensajeCorreoInven.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoMensajeCorreoInven!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoMensajeCorreoInven.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesMensajeCorreoInven.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesMensajeCorreoInven.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarMensajeCorreoInven.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesMensajeCorreoInven.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoMensajeCorreoInven!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoMensajeCorreoInven.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesMensajeCorreoInven.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralMensajeCorreoInven.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesMensajeCorreoInven(Boolean esInicializar) throws Exception {
		try	{	
			if(MensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualMensajeCorreoInven(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesMensajeCorreoInven() throws Exception {
		try	{
			if(MensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualMensajeCorreoInven();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleMensajeCorreoInven() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormMensajeCorreoInven.jComboBoxTiposAccionesFormularioMensajeCorreoInven.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormMensajeCorreoInven.jComboBoxTiposAccionesFormularioMensajeCorreoInven.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualMensajeCorreoInven() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesMensajeCorreoInven.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesMensajeCorreoInven.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesMensajeCorreoInven.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesMensajeCorreoInven.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesMensajeCorreoInven.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesMensajeCorreoInven.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionMensajeCorreoInven.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionMensajeCorreoInven.addItem(reporte);
			}
			
			
			if(!this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionMensajeCorreoInven.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionMensajeCorreoInven.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesMensajeCorreoInven.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesMensajeCorreoInven.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesMensajeCorreoInven.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesMensajeCorreoInven.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormMensajeCorreoInven!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormMensajeCorreoInven.jComboBoxTiposAccionesFormularioMensajeCorreoInven.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormMensajeCorreoInven.jComboBoxTiposAccionesFormularioMensajeCorreoInven.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarMensajeCorreoInven.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarMensajeCorreoInven.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarMensajeCorreoInven.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualMensajeCorreoInven();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualMensajeCorreoInven() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoMensajeCorreoInven!=null) {
				this.jInternalFrameReporteDinamicoMensajeCorreoInven.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoMensajeCorreoInven.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoMensajeCorreoInven!=null) {
				this.jInternalFrameReporteDinamicoMensajeCorreoInven.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoMensajeCorreoInven.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoMensajeCorreoInven!=null) {
				
				if(this.jInternalFrameReporteDinamicoMensajeCorreoInven.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoMensajeCorreoInven.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoMensajeCorreoInven.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoMensajeCorreoInven.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoMensajeCorreoInven.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoMensajeCorreoInven.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualMensajeCorreoInven()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_tipo_mensaje_correo_invenFK_IdTipoMensajeCorreoInvenMensajeCorreoInven.getSelectedItem()!=null){this.id_tipo_mensaje_correo_invenFK_IdTipoMensajeCorreoInven=((TipoMensajeCorreoInven)this.jComboBoxid_tipo_mensaje_correo_invenFK_IdTipoMensajeCorreoInvenMensajeCorreoInven.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasMensajeCorreoInven(Boolean esInicializar) throws Exception {				
		if(MensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualMensajeCorreoInven();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaMensajeCorreoInven() throws Exception {
		this.inicializarActualizarBindingTablaMensajeCorreoInven(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByMensajeCorreoInven() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByMensajeCorreoInven.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByMensajeCorreoInven.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByMensajeCorreoInven.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new MensajeCorreoInvenPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByMensajeCorreoInven.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByMensajeCorreoInven.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new MensajeCorreoInvenPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosMensajeCorreoInvenOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMensajeCorreoInvenOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new MensajeCorreoInvenPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByMensajeCorreoInven.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByMensajeCorreoInven.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new MensajeCorreoInvenPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByMensajeCorreoInven.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaMensajeCorreoInven(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=mensajecorreoinvenLogic.getMensajeCorreoInvens().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=mensajecorreoinvens.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(MensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosMensajeCorreoInven.setModel(new MensajeCorreoInvenModel(this.mensajecorreoinvenLogic.getMensajeCorreoInvens(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosMensajeCorreoInven.setModel(new MensajeCorreoInvenModel(this.mensajecorreoinvens,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByMensajeCorreoInven!=null && this.jInternalFrameOrderByMensajeCorreoInven.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByMensajeCorreoInven();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosMensajeCorreoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMensajeCorreoInven,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new MensajeCorreoInvenPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+MensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO,mensajecorreoinvenConstantesFunciones.resaltarSeleccionarMensajeCorreoInven,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+MensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO,mensajecorreoinvenConstantesFunciones.resaltarSeleccionarMensajeCorreoInven,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosMensajeCorreoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMensajeCorreoInven,MensajeCorreoInvenConstantesFunciones.LABEL_ID));

		if(this.mensajecorreoinvenConstantesFunciones.mostraridMensajeCorreoInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MensajeCorreoInvenConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.mensajecorreoinvenConstantesFunciones.resaltaridMensajeCorreoInven,this.mensajecorreoinvenConstantesFunciones.activaridMensajeCorreoInven,this,true,"idMensajeCorreoInven","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.mensajecorreoinvenConstantesFunciones.resaltaridMensajeCorreoInven,this.mensajecorreoinvenConstantesFunciones.activaridMensajeCorreoInven,this,true,"idMensajeCorreoInven","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMensajeCorreoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMensajeCorreoInven,MensajeCorreoInvenConstantesFunciones.LABEL_IDEMPRESA));

		if(this.mensajecorreoinvenConstantesFunciones.mostrarid_empresaMensajeCorreoInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MensajeCorreoInvenConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.mensajecorreoinvenConstantesFunciones.resaltarid_empresaMensajeCorreoInven,this,this.mensajecorreoinvenConstantesFunciones.activarid_empresaMensajeCorreoInven));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.mensajecorreoinvenConstantesFunciones.resaltarid_empresaMensajeCorreoInven,this,this.mensajecorreoinvenConstantesFunciones.activarid_empresaMensajeCorreoInven,false,"id_empresaMensajeCorreoInven","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new MensajeCorreoInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMensajeCorreoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMensajeCorreoInven,MensajeCorreoInvenConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.mensajecorreoinvenConstantesFunciones.mostrarid_sucursalMensajeCorreoInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MensajeCorreoInvenConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.mensajecorreoinvenConstantesFunciones.resaltarid_sucursalMensajeCorreoInven,this,this.mensajecorreoinvenConstantesFunciones.activarid_sucursalMensajeCorreoInven));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.mensajecorreoinvenConstantesFunciones.resaltarid_sucursalMensajeCorreoInven,this,this.mensajecorreoinvenConstantesFunciones.activarid_sucursalMensajeCorreoInven,false,"id_sucursalMensajeCorreoInven","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new MensajeCorreoInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMensajeCorreoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMensajeCorreoInven,MensajeCorreoInvenConstantesFunciones.LABEL_IDMODULO));

		if(this.mensajecorreoinvenConstantesFunciones.mostrarid_moduloMensajeCorreoInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MensajeCorreoInvenConstantesFunciones.LABEL_IDMODULO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ModuloTableCell(this.modulosForeignKey,this.mensajecorreoinvenConstantesFunciones.resaltarid_moduloMensajeCorreoInven,this,this.mensajecorreoinvenConstantesFunciones.activarid_moduloMensajeCorreoInven));
			tableColumn.setCellEditor(new ModuloTableCell(this.modulosForeignKey,this.mensajecorreoinvenConstantesFunciones.resaltarid_moduloMensajeCorreoInven,this,this.mensajecorreoinvenConstantesFunciones.activarid_moduloMensajeCorreoInven,false,"id_moduloMensajeCorreoInven","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new MensajeCorreoInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMensajeCorreoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMensajeCorreoInven,MensajeCorreoInvenConstantesFunciones.LABEL_IDTIPOMENSAJECORREOINVEN));

		if(this.mensajecorreoinvenConstantesFunciones.mostrarid_tipo_mensaje_correo_invenMensajeCorreoInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MensajeCorreoInvenConstantesFunciones.LABEL_IDTIPOMENSAJECORREOINVEN,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoMensajeCorreoInvenTableCell(this.tipomensajecorreoinvensForeignKey,this.mensajecorreoinvenConstantesFunciones.resaltarid_tipo_mensaje_correo_invenMensajeCorreoInven,this,this.mensajecorreoinvenConstantesFunciones.activarid_tipo_mensaje_correo_invenMensajeCorreoInven));
			tableColumn.setCellEditor(new TipoMensajeCorreoInvenTableCell(this.tipomensajecorreoinvensForeignKey,this.mensajecorreoinvenConstantesFunciones.resaltarid_tipo_mensaje_correo_invenMensajeCorreoInven,this,this.mensajecorreoinvenConstantesFunciones.activarid_tipo_mensaje_correo_invenMensajeCorreoInven,true,"id_tipo_mensaje_correo_invenMensajeCorreoInven","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new MensajeCorreoInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMensajeCorreoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMensajeCorreoInven,MensajeCorreoInvenConstantesFunciones.LABEL_TEMA));

		if(this.mensajecorreoinvenConstantesFunciones.mostrartemaMensajeCorreoInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MensajeCorreoInvenConstantesFunciones.LABEL_TEMA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.mensajecorreoinvenConstantesFunciones.resaltartemaMensajeCorreoInven,this.mensajecorreoinvenConstantesFunciones.activartemaMensajeCorreoInven,this,true,"temaMensajeCorreoInven","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.mensajecorreoinvenConstantesFunciones.resaltartemaMensajeCorreoInven,this.mensajecorreoinvenConstantesFunciones.activartemaMensajeCorreoInven,this,true,"temaMensajeCorreoInven","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new MensajeCorreoInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMensajeCorreoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMensajeCorreoInven,MensajeCorreoInvenConstantesFunciones.LABEL_MENSAJE));

		if(this.mensajecorreoinvenConstantesFunciones.mostrarmensajeMensajeCorreoInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MensajeCorreoInvenConstantesFunciones.LABEL_MENSAJE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.mensajecorreoinvenConstantesFunciones.resaltarmensajeMensajeCorreoInven,this.mensajecorreoinvenConstantesFunciones.activarmensajeMensajeCorreoInven,this,true,"mensajeMensajeCorreoInven","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.mensajecorreoinvenConstantesFunciones.resaltarmensajeMensajeCorreoInven,this.mensajecorreoinvenConstantesFunciones.activarmensajeMensajeCorreoInven,this,true,"mensajeMensajeCorreoInven","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new MensajeCorreoInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMensajeCorreoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMensajeCorreoInven,MensajeCorreoInvenConstantesFunciones.LABEL_AVISO));

		if(this.mensajecorreoinvenConstantesFunciones.mostraravisoMensajeCorreoInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MensajeCorreoInvenConstantesFunciones.LABEL_AVISO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.mensajecorreoinvenConstantesFunciones.resaltaravisoMensajeCorreoInven,this.mensajecorreoinvenConstantesFunciones.activaravisoMensajeCorreoInven,this,true,"avisoMensajeCorreoInven","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.mensajecorreoinvenConstantesFunciones.resaltaravisoMensajeCorreoInven,this.mensajecorreoinvenConstantesFunciones.activaravisoMensajeCorreoInven,this,true,"avisoMensajeCorreoInven","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new MensajeCorreoInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMensajeCorreoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMensajeCorreoInven,MensajeCorreoInvenConstantesFunciones.LABEL_ESTAACTIVO));

		if(this.mensajecorreoinvenConstantesFunciones.mostraresta_activoMensajeCorreoInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MensajeCorreoInvenConstantesFunciones.LABEL_ESTAACTIVO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.mensajecorreoinvenConstantesFunciones.resaltaresta_activoMensajeCorreoInven,this.mensajecorreoinvenConstantesFunciones.activaresta_activoMensajeCorreoInven));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.mensajecorreoinvenConstantesFunciones.resaltaresta_activoMensajeCorreoInven,this.mensajecorreoinvenConstantesFunciones.activaresta_activoMensajeCorreoInven,this,true,"esta_activoMensajeCorreoInven","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new MensajeCorreoInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosDetalleMensajeCorreoInven && this.mensajecorreoinvenConstantesFunciones.mostrarDetalleMensajeCorreoInvenMensajeCorreoInven && !MensajeCorreoInvenConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Detalle Mensaje Correo Invenes");
				tableColumn.setHeaderValue("Detalle Mensaje Correo Invenes");
				tableColumn.setCellRenderer(new DetalleMensajeCorreoInvenTableCell(mensajecorreoinvenConstantesFunciones.resaltarDetalleMensajeCorreoInvenMensajeCorreoInven,this,this.mensajecorreoinvenConstantesFunciones.activarDetalleMensajeCorreoInvenMensajeCorreoInven));
				tableColumn.setCellEditor(new DetalleMensajeCorreoInvenTableCell(mensajecorreoinvenConstantesFunciones.resaltarDetalleMensajeCorreoInvenMensajeCorreoInven,this,this.mensajecorreoinvenConstantesFunciones.activarDetalleMensajeCorreoInvenMensajeCorreoInven));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosMensajeCorreoInven.addColumn(tableColumn);
			}

			if(this.isTienePermisosMailMensajeCorreoInven && this.mensajecorreoinvenConstantesFunciones.mostrarMailMensajeCorreoInvenMensajeCorreoInven && !MensajeCorreoInvenConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Mail Mensaje Correo Invenes");
				tableColumn.setHeaderValue("Mail Mensaje Correo Invenes");
				tableColumn.setCellRenderer(new MailMensajeCorreoInvenTableCell(mensajecorreoinvenConstantesFunciones.resaltarMailMensajeCorreoInvenMensajeCorreoInven,this,this.mensajecorreoinvenConstantesFunciones.activarMailMensajeCorreoInvenMensajeCorreoInven));
				tableColumn.setCellEditor(new MailMensajeCorreoInvenTableCell(mensajecorreoinvenConstantesFunciones.resaltarMailMensajeCorreoInvenMensajeCorreoInven,this,this.mensajecorreoinvenConstantesFunciones.activarMailMensajeCorreoInvenMensajeCorreoInven));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosMensajeCorreoInven.addColumn(tableColumn);
			}
		}
		
		if(true) {
			String sLabelColumnAccion="Editar";
			String sLabelColumnAccionEli="Eli";
			
			if(this.esParaBusquedaForeignKey)  {
				sLabelColumnAccion="Seleccionar";
				
				//LO MISMO QUE ELSE
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosMensajeCorreoInven.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosMensajeCorreoInven.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarMensajeCorreoInven && this.isPermisoGuardarCambiosMensajeCorreoInven) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosMensajeCorreoInven.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.mensajecorreoinvenSessionBean.getConGuardarRelaciones()) {
				if(this.conFuncionalidadRelaciones) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier("Editar Rel");
					tableColumn.setHeaderValue("Editar Rel");
					tableColumn.setCellRenderer(new IdTableCell(this,true,false));
					tableColumn.setCellEditor(new IdTableCell(this,true,false));
		
					tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					
					this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
					this.jTableDatosMensajeCorreoInven.addColumn(tableColumn);
				}
			}
			
			/*
			tableColumn= new TableColumn();
			tableColumn.setIdentifier(Constantes2.S_SELECCIONAR);
			tableColumn.setHeaderValue(Constantes2.S_SELECCIONAR);
			tableColumn.setCellRenderer(new IdSeleccionarTableCell(this));
			tableColumn.setCellEditor(new IdSeleccionarTableCell(this));
			
			tableColumn.setPreferredWidth(30); 	 
			tableColumn.setWidth(30); 	 
			tableColumn.setMinWidth(30); 
			
			this.iWidthTableDefinicion+=30;
			
			this.jTableDatosMensajeCorreoInven.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarMensajeCorreoInven && this.isPermisoGuardarCambiosMensajeCorreoInven) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.mensajecorreoinvenSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarMensajeCorreoInven && this.isPermisoGuardarCambiosMensajeCorreoInven) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosMensajeCorreoInven.moveColumn(this.jTableDatosMensajeCorreoInven.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosMensajeCorreoInven.moveColumn(this.jTableDatosMensajeCorreoInven.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.mensajecorreoinvenSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosMensajeCorreoInven.moveColumn(this.jTableDatosMensajeCorreoInven.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosMensajeCorreoInven.moveColumn(this.jTableDatosMensajeCorreoInven.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosMensajeCorreoInven.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosMensajeCorreoInven.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosMensajeCorreoInven,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!MensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosMensajeCorreoInven.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosMensajeCorreoInven.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!MensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!MensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosMensajeCorreoInven.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosMensajeCorreoInven.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosMensajeCorreoInven.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
			private static final long serialVersionUID = 1L;
			
		    @Override
		    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
		        final Component component= super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
		        //POR DEFECTO ES MEJOR, SE PIERDE DATOS AL SELECCIONAR BLANCO LETRAS BLANCAS
				component.setBackground(row % 2 == 0 ? FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR) : Funciones2.getColorFilaTabla2()); //FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR)
				component.setForeground(Funciones2.getColorTextoFilaTabla1());
				
				try {
		        	int iSize=-999;
		        	
		        	if(conTotales) {
						//FILA TOTALES OTRO COLOR, SI TABLA NO ES UNO A UNO
			        	if(Constantes.ISUSAEJBLOGICLAYER) {
							iSize=mensajecorreoinvenLogic.getMensajeCorreoInvens().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=mensajecorreoinvens.size()-1;
						}
						
						if(iSize==row) {
							component.setBackground(Funciones2.getColorFilaTablaTotales());
						}
		        	}
					
					//POR EFICIENCIA NO UTILIZAR					
					//if (component instanceof JComponent) {
		            //    JComponent jcomponent = (JComponent) component;		                 		                
		        	//}				
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
		        return component;
		    }
		});
		*/
		
		//ESTA EN LA DEFINICION DE LA TABLA
		//this.jTableDatosMensajeCorreoInven.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosMensajeCorreoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosMensajeCorreoInven();
			
		}
	}
	
	/*
	//COPY_TABLES
	/* FALTARIA RESOLVER:
	   1 SOLO SCROLL PARA 2 TABLAS
	   COPIA EXACTA DE COLUMNAS DE UNA TABLA A OTRA, SI SE MODIFICA TAMANIO TAMBIEN LA OTRA
	*/
	
	public void jButtonIdActionPerformed(ActionEvent evt,int rowIndex,Boolean esRelaciones,Boolean esEliminar) { 
		try {
			if(!esEliminar) {
				this.estaModoSeleccionar=true;
				
				//this.isEsNuevoMensajeCorreoInven=false;
					
				MensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.mensajecorreoinven,new Object(),this.mensajecorreoinvenParameterGeneral,this.mensajecorreoinvenReturnGeneral);
			
				if(this.mensajecorreoinvenSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormMensajeCorreoInven==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosMensajeCorreoInven.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosMensajeCorreoInven.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mensajecorreoinven =(MensajeCorreoInven) this.mensajecorreoinvenLogic.getMensajeCorreoInvens().toArray()[this.jTableDatosMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.mensajecorreoinven =(MensajeCorreoInven) this.mensajecorreoinvens.toArray()[this.jTableDatosMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.mensajecorreoinven.getsType().equals("DUPLICADO")
				   || this.mensajecorreoinven.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoMensajeCorreoInven=true;
				
				} else {
					this.isEsNuevoMensajeCorreoInven=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
					if(this.mensajecorreoinven.getId()>=0 && !this.mensajecorreoinven.getIsNew()) {						
						this.isEsNuevoMensajeCorreoInven=false;
						
					} else {
						this.isEsNuevoMensajeCorreoInven=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoMensajeCorreoInven(esRelaciones);						
				
				this.seleccionarMensajeCorreoInven(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.mensajecorreoinven.getId()<0) {
					this.isEsNuevoMensajeCorreoInven=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarMensajeCorreoInven(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarMensajeCorreoInven(evt,rowIndex);
				}	
				
				if(this.mensajecorreoinvenSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion MensajeCorreoInven: " + this.dDif); 
					}
				}								
				
				MensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.mensajecorreoinven,new Object(),this.mensajecorreoinvenParameterGeneral,this.mensajecorreoinvenReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarMensajeCorreoInven(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.mensajecorreoinven)) {
					if(this.mensajecorreoinven.getId()>0) {
						this.mensajecorreoinven.setIsDeleted(true);
						
						this.mensajecorreoinvensEliminados.add(this.mensajecorreoinven);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.mensajecorreoinvenLogic.getMensajeCorreoInvens().remove(this.mensajecorreoinven);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.mensajecorreoinvens.remove(this.mensajecorreoinven);				
					}
					
					
					((MensajeCorreoInvenModel) this.jTableDatosMensajeCorreoInven.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaMensajeCorreoInven(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarMensajeCorreoInven(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoMensajeCorreoInven) {
			
			if(this.jInternalFrameDetalleFormMensajeCorreoInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosMensajeCorreoInven.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosMensajeCorreoInven.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mensajecorreoinven =(MensajeCorreoInven) this.mensajecorreoinvenLogic.getMensajeCorreoInvens().toArray()[this.jTableDatosMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.mensajecorreoinven =(MensajeCorreoInven) this.mensajecorreoinvens.toArray()[this.jTableDatosMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(MensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioMensajeCorreoInven(this.mensajecorreoinven);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.mensajecorreoinvenConstantesFunciones.cargarid_empresaMensajeCorreoInven || this.mensajecorreoinvenConstantesFunciones.event_dependid_empresaMensajeCorreoInven) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.mensajecorreoinven.getid_empresa());
									//this.inicializarActualizarBindingMensajeCorreoInven(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(mensajecorreoinven.getEmpresa()!=null) {
							this.empresasForeignKey.add(mensajecorreoinven.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.mensajecorreoinven.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.mensajecorreoinvenConstantesFunciones.cargarid_sucursalMensajeCorreoInven || this.mensajecorreoinvenConstantesFunciones.event_dependid_sucursalMensajeCorreoInven) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.mensajecorreoinven.getid_sucursal());
									//this.inicializarActualizarBindingMensajeCorreoInven(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(mensajecorreoinven.getSucursal()!=null) {
							this.sucursalsForeignKey.add(mensajecorreoinven.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.mensajecorreoinven.getid_sucursal(),false,"Formulario");

					//Modulo
					if(!this.mensajecorreoinvenConstantesFunciones.cargarid_moduloMensajeCorreoInven || this.mensajecorreoinvenConstantesFunciones.event_dependid_moduloMensajeCorreoInven) {
						//this.cargarCombosModulosForeignKeyLista(" where id="+this.mensajecorreoinven.getid_modulo());
									//this.inicializarActualizarBindingMensajeCorreoInven(false,false);
						this.modulosForeignKey=new ArrayList<Modulo>();

						if(mensajecorreoinven.getModulo()!=null) {
							this.modulosForeignKey.add(mensajecorreoinven.getModulo());
						}

						this.addItemDefectoCombosForeignKeyModulo();
						this.cargarCombosFrameModulosForeignKey("Todos");
					}
					this.setActualModuloForeignKey(this.mensajecorreoinven.getid_modulo(),false,"Formulario");

					//TipoMensajeCorreoInven
					if(!this.mensajecorreoinvenConstantesFunciones.cargarid_tipo_mensaje_correo_invenMensajeCorreoInven || this.mensajecorreoinvenConstantesFunciones.event_dependid_tipo_mensaje_correo_invenMensajeCorreoInven) {
						//this.cargarCombosTipoMensajeCorreoInvensForeignKeyLista(" where id="+this.mensajecorreoinven.getid_tipo_mensaje_correo_inven());
									//this.inicializarActualizarBindingMensajeCorreoInven(false,false);
						this.tipomensajecorreoinvensForeignKey=new ArrayList<TipoMensajeCorreoInven>();

						if(mensajecorreoinven.getTipoMensajeCorreoInven()!=null) {
							this.tipomensajecorreoinvensForeignKey.add(mensajecorreoinven.getTipoMensajeCorreoInven());
						}

						this.addItemDefectoCombosForeignKeyTipoMensajeCorreoInven();
						this.cargarCombosFrameTipoMensajeCorreoInvensForeignKey("Todos");
					}
					this.setActualTipoMensajeCorreoInvenForeignKey(this.mensajecorreoinven.getid_tipo_mensaje_correo_inven(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesMensajeCorreoInven("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesMensajeCorreoInven(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualMensajeCorreoInven() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoMensajeCorreoInven(MensajeCorreoInven mensajecorreoinven) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoMensajeCorreoInven(mensajecorreoinven,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoMensajeCorreoInven(MensajeCorreoInven mensajecorreoinven,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioMensajeCorreoInven(mensajecorreoinven);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyMensajeCorreoInven(mensajecorreoinven,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyMensajeCorreoInven(mensajecorreoinven);
	}
	
	public void setVariablesObjetoActualToFormularioMensajeCorreoInven(MensajeCorreoInven mensajecorreoinven) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormMensajeCorreoInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormMensajeCorreoInven.jLabelidMensajeCorreoInven.setText(mensajecorreoinven.getId().toString());
			this.jInternalFrameDetalleFormMensajeCorreoInven.jTextAreatemaMensajeCorreoInven.setText(mensajecorreoinven.gettema());
			this.jInternalFrameDetalleFormMensajeCorreoInven.jTextAreamensajeMensajeCorreoInven.setText(mensajecorreoinven.getmensaje());
			this.jInternalFrameDetalleFormMensajeCorreoInven.jTextAreaavisoMensajeCorreoInven.setText(mensajecorreoinven.getaviso());
			this.jInternalFrameDetalleFormMensajeCorreoInven.jCheckBoxesta_activoMensajeCorreoInven.setSelected(mensajecorreoinven.getesta_activo());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,MensajeCorreoInven mensajecorreoinvenLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,mensajecorreoinvenLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,MensajeCorreoInven mensajecorreoinvenLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				mensajecorreoinvenLocal=this.mensajecorreoinven;
			} else {
				mensajecorreoinvenLocal=this.mensajecorreoinvenAnterior;
			}
		}
		
		if(this.permiteMantenimiento(mensajecorreoinvenLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoMensajeCorreoInven(mensajecorreoinvenLocal,true);
					
					if(mensajecorreoinvenSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(mensajecorreoinvenLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(mensajecorreoinvenLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoMensajeCorreoInven(MensajeCorreoInven mensajecorreoinven,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualMensajeCorreoInven(mensajecorreoinven,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysMensajeCorreoInven(mensajecorreoinven);
	}
	
	public void setVariablesFormularioToObjetoActualMensajeCorreoInven(MensajeCorreoInven mensajecorreoinven,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualMensajeCorreoInven(mensajecorreoinven,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualMensajeCorreoInven(MensajeCorreoInven mensajecorreoinven,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormMensajeCorreoInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormMensajeCorreoInven.jLabelidMensajeCorreoInven.getText()==null || this.jInternalFrameDetalleFormMensajeCorreoInven.jLabelidMensajeCorreoInven.getText()=="" || this.jInternalFrameDetalleFormMensajeCorreoInven.jLabelidMensajeCorreoInven.getText()=="Id") {
				this.jInternalFrameDetalleFormMensajeCorreoInven.jLabelidMensajeCorreoInven.setText("0");
			}

			if(conColumnasBase) {mensajecorreoinven.setId(Long.parseLong(this.jInternalFrameDetalleFormMensajeCorreoInven.jLabelidMensajeCorreoInven.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MensajeCorreoInvenConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMensajeCorreoInven.jLabelIdMensajeCorreoInven,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			mensajecorreoinven.settema(this.jInternalFrameDetalleFormMensajeCorreoInven.jTextAreatemaMensajeCorreoInven.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MensajeCorreoInvenConstantesFunciones.LABEL_TEMA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMensajeCorreoInven.jLabeltemaMensajeCorreoInven,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			mensajecorreoinven.setmensaje(this.jInternalFrameDetalleFormMensajeCorreoInven.jTextAreamensajeMensajeCorreoInven.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MensajeCorreoInvenConstantesFunciones.LABEL_MENSAJE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMensajeCorreoInven.jLabelmensajeMensajeCorreoInven,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			mensajecorreoinven.setaviso(this.jInternalFrameDetalleFormMensajeCorreoInven.jTextAreaavisoMensajeCorreoInven.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MensajeCorreoInvenConstantesFunciones.LABEL_AVISO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMensajeCorreoInven.jLabelavisoMensajeCorreoInven,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			mensajecorreoinven.setesta_activo(this.jInternalFrameDetalleFormMensajeCorreoInven.jCheckBoxesta_activoMensajeCorreoInven.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MensajeCorreoInvenConstantesFunciones.LABEL_ESTAACTIVO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMensajeCorreoInven.jLabelesta_activoMensajeCorreoInven,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualMensajeCorreoInven(MensajeCorreoInven mensajecorreoinvenBean,MensajeCorreoInven mensajecorreoinven,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && mensajecorreoinvenBean.getid_tipo_mensaje_correo_inven()!=null && !mensajecorreoinvenBean.getid_tipo_mensaje_correo_inven().equals(-1L))) {mensajecorreoinven.setid_tipo_mensaje_correo_inven(mensajecorreoinvenBean.getid_tipo_mensaje_correo_inven());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosMensajeCorreoInven(MensajeCorreoInven mensajecorreoinvenOrigen,MensajeCorreoInven mensajecorreoinven,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && mensajecorreoinvenOrigen.getId()!=null && !mensajecorreoinvenOrigen.getId().equals(0L))) {mensajecorreoinven.setId(mensajecorreoinvenOrigen.getId());}}
			if(conDefault || (!conDefault && mensajecorreoinvenOrigen.getid_tipo_mensaje_correo_inven()!=null && !mensajecorreoinvenOrigen.getid_tipo_mensaje_correo_inven().equals(-1L))) {mensajecorreoinven.setid_tipo_mensaje_correo_inven(mensajecorreoinvenOrigen.getid_tipo_mensaje_correo_inven());}
			if(conDefault || (!conDefault && mensajecorreoinvenOrigen.gettema()!=null && !mensajecorreoinvenOrigen.gettema().equals(""))) {mensajecorreoinven.settema(mensajecorreoinvenOrigen.gettema());}
			if(conDefault || (!conDefault && mensajecorreoinvenOrigen.getmensaje()!=null && !mensajecorreoinvenOrigen.getmensaje().equals(""))) {mensajecorreoinven.setmensaje(mensajecorreoinvenOrigen.getmensaje());}
			if(conDefault || (!conDefault && mensajecorreoinvenOrigen.getaviso()!=null && !mensajecorreoinvenOrigen.getaviso().equals(""))) {mensajecorreoinven.setaviso(mensajecorreoinvenOrigen.getaviso());}
			if(conDefault || (!conDefault && mensajecorreoinvenOrigen.getesta_activo()!=null && !mensajecorreoinvenOrigen.getesta_activo().equals(false))) {mensajecorreoinven.setesta_activo(mensajecorreoinvenOrigen.getesta_activo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioMensajeCorreoInven(MensajeCorreoInven mensajecorreoinven) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormMensajeCorreoInven.jLabelidMensajeCorreoInven.setText(mensajecorreoinven.getId().toString());
			this.jInternalFrameDetalleFormMensajeCorreoInven.jTextAreatemaMensajeCorreoInven.setText(mensajecorreoinven.gettema());
			this.jInternalFrameDetalleFormMensajeCorreoInven.jTextAreamensajeMensajeCorreoInven.setText(mensajecorreoinven.getmensaje());
			this.jInternalFrameDetalleFormMensajeCorreoInven.jTextAreaavisoMensajeCorreoInven.setText(mensajecorreoinven.getaviso());
			this.jInternalFrameDetalleFormMensajeCorreoInven.jCheckBoxesta_activoMensajeCorreoInven.setSelected(mensajecorreoinven.getesta_activo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioMensajeCorreoInven(MensajeCorreoInvenBean mensajecorreoinvenBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormMensajeCorreoInven.jLabelidMensajeCorreoInven.setText(mensajecorreoinvenBean.getId().toString());
			this.jInternalFrameDetalleFormMensajeCorreoInven.jTextAreatemaMensajeCorreoInven.setText(mensajecorreoinvenBean.gettema());
			this.jInternalFrameDetalleFormMensajeCorreoInven.jTextAreamensajeMensajeCorreoInven.setText(mensajecorreoinvenBean.getmensaje());
			this.jInternalFrameDetalleFormMensajeCorreoInven.jTextAreaavisoMensajeCorreoInven.setText(mensajecorreoinvenBean.getaviso());
			this.jInternalFrameDetalleFormMensajeCorreoInven.jCheckBoxesta_activoMensajeCorreoInven.setSelected(mensajecorreoinvenBean.getesta_activo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanMensajeCorreoInven(MensajeCorreoInvenParameterReturnGeneral mensajecorreoinvenReturnGeneral,MensajeCorreoInvenBean mensajecorreoinvenBean,Boolean conDefault) throws Exception { 
		try {
			MensajeCorreoInven mensajecorreoinvenLocal=new MensajeCorreoInven();
			
			mensajecorreoinvenLocal=mensajecorreoinvenReturnGeneral.getMensajeCorreoInven();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && mensajecorreoinvenLocal.getId()!=null && !mensajecorreoinvenLocal.getId().equals(0L))) {mensajecorreoinvenBean.setId(mensajecorreoinvenLocal.getId());}}
			if(conDefault || (!conDefault && mensajecorreoinvenLocal.getid_tipo_mensaje_correo_inven()!=null && !mensajecorreoinvenLocal.getid_tipo_mensaje_correo_inven().equals(-1L))) {mensajecorreoinvenBean.setid_tipo_mensaje_correo_inven(mensajecorreoinvenLocal.getid_tipo_mensaje_correo_inven());}
			if(conDefault || (!conDefault && mensajecorreoinvenLocal.gettema()!=null && !mensajecorreoinvenLocal.gettema().equals(""))) {mensajecorreoinvenBean.settema(mensajecorreoinvenLocal.gettema());}
			if(conDefault || (!conDefault && mensajecorreoinvenLocal.getmensaje()!=null && !mensajecorreoinvenLocal.getmensaje().equals(""))) {mensajecorreoinvenBean.setmensaje(mensajecorreoinvenLocal.getmensaje());}
			if(conDefault || (!conDefault && mensajecorreoinvenLocal.getaviso()!=null && !mensajecorreoinvenLocal.getaviso().equals(""))) {mensajecorreoinvenBean.setaviso(mensajecorreoinvenLocal.getaviso());}
			if(conDefault || (!conDefault && mensajecorreoinvenLocal.getesta_activo()!=null && !mensajecorreoinvenLocal.getesta_activo().equals(false))) {mensajecorreoinvenBean.setesta_activo(mensajecorreoinvenLocal.getesta_activo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxMensajeCorreoInvenGenerico(Long idMensajeCorreoInvenSeleccionado,JComboBox jComboBoxMensajeCorreoInven,List<MensajeCorreoInven> mensajecorreoinvensLocal)throws Exception {
		try {
			MensajeCorreoInven  mensajecorreoinvenTemp=null;

			for(MensajeCorreoInven mensajecorreoinvenAux:mensajecorreoinvensLocal) {
				if(mensajecorreoinvenAux.getId()!=null && mensajecorreoinvenAux.getId().equals(idMensajeCorreoInvenSeleccionado)) {
					mensajecorreoinvenTemp=mensajecorreoinvenAux;
					break;
				}
			}

			jComboBoxMensajeCorreoInven.setSelectedItem(mensajecorreoinvenTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxMensajeCorreoInvenGenerico(JComboBox jComboBoxMensajeCorreoInven,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
		try {
			//GLOBAL(id_empresa,id_sucursal,id_ejercicio)
			//BASICO(normal)
			//CON_BUSQUEDA(Permite buscar Fk)
			
			String sKeyStrokeName="";
			KeyStroke keyStrokeControl=null;
			
			if(!sTipoBusqueda.equals("GLOBAL")) {
				
				//BUSCAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSCAR");
				
				jComboBoxMensajeCorreoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxMensajeCorreoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxMensajeCorreoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxMensajeCorreoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxMensajeCorreoInven.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxMensajeCorreoInven.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxMensajeCorreoInven.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxMensajeCorreoInven.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxMensajeCorreoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxMensajeCorreoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
				}
				//CON_BUSQUEDA
				
				
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	@SuppressWarnings("rawtypes")
	public void setHotKeysComboBoxGenerico(JComboBox jComboBox,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
			if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
				jComboBox.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
				jComboBox.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
			} else {
				jComboBox.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
				jComboBox.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
			}
		}
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJTextFieldGenerico(JTextField jTextField,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jTextField.addFocusListener(new TextFieldFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		jTextField.addActionListener(new TextFieldActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJTextAreaGenerico(JTextArea jTextArea,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jTextArea.addFocusListener(new TextAreaFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//NO EXISTE
		//jTextArea.addActionListener(new TextAreaActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJLabelGenerico(JLabel jLabel,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jLabel.addFocusListener(new LabelFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//NO EXISTE
		//jLabel.addActionListener(new LabelActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJCheckBoxGenerico(JCheckBox jCheckBox,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jCheckBox.addFocusListener(new CheckBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//SI SE DEFINE AL CAMBIAR VALOR, ESTE NUEVO VALOR NO SE ENVIA AL EVENTO
		//jCheckBox.addItemListener(new CheckBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJDateChooserGenerico(JDateChooser jDateChooser,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		FuncionesSwing.addDateListener(jDateChooser, jInternalFrameBase, sNombreHotKeyAbstractAction);
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJButtonGenerico(JButton jButton,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jButton.addActionListener(new ButtonActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	public void jButtonRelacionActionPerformed(String sTipo,ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado) {
		//ABRIR RELACIONES
		try {
			
		if(sTipo.equals("DetalleMensajeCorreoInven")) {
			jButtonDetalleMensajeCorreoInvenActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("MailMensajeCorreoInven")) {
			jButtonMailMensajeCorreoInvenActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			mensajecorreoinven=(MensajeCorreoInven) mensajecorreoinvenLogic.getMensajeCorreoInvens().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			mensajecorreoinven =(MensajeCorreoInven) mensajecorreoinvens.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!mensajecorreoinven.getIsNew() && !mensajecorreoinven.getIsChanged() && !mensajecorreoinven.getIsDeleted()) {
				sDescripcion=mensajecorreoinven.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=mensajecorreoinven.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!mensajecorreoinven.getIsNew() && !mensajecorreoinven.getIsChanged() && !mensajecorreoinven.getIsDeleted()) {
				sDescripcion=mensajecorreoinven.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=mensajecorreoinven.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Modulo")) {
			//sDescripcion=this.getActualModuloForeignKeyDescripcion((Long)value);
			if(!mensajecorreoinven.getIsNew() && !mensajecorreoinven.getIsChanged() && !mensajecorreoinven.getIsDeleted()) {
				sDescripcion=mensajecorreoinven.getmodulo_descripcion();
			} else {
				//sDescripcion=this.getActualModuloForeignKeyDescripcion((Long)value);
				sDescripcion=mensajecorreoinven.getmodulo_descripcion();
			}
		}

		if(sTipo.equals("TipoMensajeCorreoInven")) {
			//sDescripcion=this.getActualTipoMensajeCorreoInvenForeignKeyDescripcion((Long)value);
			if(!mensajecorreoinven.getIsNew() && !mensajecorreoinven.getIsChanged() && !mensajecorreoinven.getIsDeleted()) {
				sDescripcion=mensajecorreoinven.gettipomensajecorreoinven_descripcion();
			} else {
				//sDescripcion=this.getActualTipoMensajeCorreoInvenForeignKeyDescripcion((Long)value);
				sDescripcion=mensajecorreoinven.gettipomensajecorreoinven_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		MensajeCorreoInven mensajecorreoinvenRow=new MensajeCorreoInven();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			mensajecorreoinvenRow=(MensajeCorreoInven) mensajecorreoinvenLogic.getMensajeCorreoInvens().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			mensajecorreoinvenRow=(MensajeCorreoInven) mensajecorreoinvens.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonDetalleMensajeCorreoInvenActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,MensajeCorreoInven mensajecorreoinven) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormMensajeCorreoInven==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mensajecorreoinvenLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mensajecorreoinven = (MensajeCorreoInven)this.mensajecorreoinvenLogic.getMensajeCorreoInvens().toArray()[this.jTableDatosMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.mensajecorreoinven = (MensajeCorreoInven)this.mensajecorreoinvens.toArray()[this.jTableDatosMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(mensajecorreoinven!=null) {
						this.mensajecorreoinven = mensajecorreoinven;
					} else {
						this.mensajecorreoinven = new MensajeCorreoInven();
					}
				}

				if(this.isTienePermisosDetalleMensajeCorreoInven && this.permiteMantenimiento(this.mensajecorreoinven)) {
					DetalleMensajeCorreoInvenBeanSwingJInternalFrame detallemensajecorreoinvenBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFramePopup=new DetalleMensajeCorreoInvenBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						detallemensajecorreoinvenBeanSwingJInternalFrame=this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFramePopup;
					} else {
						detallemensajecorreoinvenBeanSwingJInternalFrame=this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFrame;
					}

					List<MensajeCorreoInven> mensajecorreoinvens=new ArrayList<MensajeCorreoInven>();
					mensajecorreoinvens.add(this.mensajecorreoinven);
					if(!esRelacionado) {
						//detallemensajecorreoinvenBeanSwingJInternalFrame.detallemensajecorreoinvenSessionBean.setConGuardarRelaciones(false);
						//detallemensajecorreoinvenBeanSwingJInternalFrame.detallemensajecorreoinvenSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					detallemensajecorreoinvenBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormMensajeCorreoInven.cargarDetalleMensajeCorreoInvenBeanSwingJInternalFrame(mensajecorreoinvens,this.mensajecorreoinven,detallemensajecorreoinvenBeanSwingJInternalFrame,/*conInicializar,*/detallemensajecorreoinvenBeanSwingJInternalFrame.detallemensajecorreoinvenSessionBean.getConGuardarRelaciones(),detallemensajecorreoinvenBeanSwingJInternalFrame.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado());
					detallemensajecorreoinvenBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						detallemensajecorreoinvenBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleMensajeCorreoInven("no_relacionado");

						detallemensajecorreoinvenBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(DetalleMensajeCorreoInvenConstantesFunciones.ITAMANIOFILATABLA + (DetalleMensajeCorreoInvenConstantesFunciones.ITAMANIOFILATABLA/2));

						detallemensajecorreoinvenBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderMensajeCorreoInven=(TitledBorder)this.jScrollPanelDatosMensajeCorreoInven.getBorder();
						TitledBorder titledBorderDetalleMensajeCorreoInven=(TitledBorder)detallemensajecorreoinvenBeanSwingJInternalFrame.jScrollPanelDatosDetalleMensajeCorreoInven.getBorder();

						titledBorderDetalleMensajeCorreoInven.setTitle(titledBorderMensajeCorreoInven.getTitle() + " -> Detalle Mensaje Correo Inven");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,detallemensajecorreoinvenBeanSwingJInternalFrame);
						}

						detallemensajecorreoinvenBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(detallemensajecorreoinvenBeanSwingJInternalFrame);

						detallemensajecorreoinvenBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.mensajecorreoinvenSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Detalle Mensaje Correo Inven",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mensajecorreoinvenLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mensajecorreoinvenLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mensajecorreoinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonMailMensajeCorreoInvenActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,MensajeCorreoInven mensajecorreoinven) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormMensajeCorreoInven==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mensajecorreoinvenLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mensajecorreoinven = (MensajeCorreoInven)this.mensajecorreoinvenLogic.getMensajeCorreoInvens().toArray()[this.jTableDatosMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.mensajecorreoinven = (MensajeCorreoInven)this.mensajecorreoinvens.toArray()[this.jTableDatosMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(mensajecorreoinven!=null) {
						this.mensajecorreoinven = mensajecorreoinven;
					} else {
						this.mensajecorreoinven = new MensajeCorreoInven();
					}
				}

				if(this.isTienePermisosMailMensajeCorreoInven && this.permiteMantenimiento(this.mensajecorreoinven)) {
					MailMensajeCorreoInvenBeanSwingJInternalFrame mailmensajecorreoinvenBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFramePopup=new MailMensajeCorreoInvenBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						mailmensajecorreoinvenBeanSwingJInternalFrame=this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFramePopup;
					} else {
						mailmensajecorreoinvenBeanSwingJInternalFrame=this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFrame;
					}

					List<MensajeCorreoInven> mensajecorreoinvens=new ArrayList<MensajeCorreoInven>();
					mensajecorreoinvens.add(this.mensajecorreoinven);
					if(!esRelacionado) {
						//mailmensajecorreoinvenBeanSwingJInternalFrame.mailmensajecorreoinvenSessionBean.setConGuardarRelaciones(false);
						//mailmensajecorreoinvenBeanSwingJInternalFrame.mailmensajecorreoinvenSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					mailmensajecorreoinvenBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormMensajeCorreoInven.cargarMailMensajeCorreoInvenBeanSwingJInternalFrame(mensajecorreoinvens,this.mensajecorreoinven,mailmensajecorreoinvenBeanSwingJInternalFrame,/*conInicializar,*/mailmensajecorreoinvenBeanSwingJInternalFrame.mailmensajecorreoinvenSessionBean.getConGuardarRelaciones(),mailmensajecorreoinvenBeanSwingJInternalFrame.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado());
					mailmensajecorreoinvenBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						mailmensajecorreoinvenBeanSwingJInternalFrame.actualizarEstadoPanelsMailMensajeCorreoInven("no_relacionado");

						mailmensajecorreoinvenBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(MailMensajeCorreoInvenConstantesFunciones.ITAMANIOFILATABLA + (MailMensajeCorreoInvenConstantesFunciones.ITAMANIOFILATABLA/2));

						mailmensajecorreoinvenBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderMensajeCorreoInven=(TitledBorder)this.jScrollPanelDatosMensajeCorreoInven.getBorder();
						TitledBorder titledBorderMailMensajeCorreoInven=(TitledBorder)mailmensajecorreoinvenBeanSwingJInternalFrame.jScrollPanelDatosMailMensajeCorreoInven.getBorder();

						titledBorderMailMensajeCorreoInven.setTitle(titledBorderMensajeCorreoInven.getTitle() + " -> Mail Mensaje Correo Inven");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,mailmensajecorreoinvenBeanSwingJInternalFrame);
						}

						mailmensajecorreoinvenBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(mailmensajecorreoinvenBeanSwingJInternalFrame);

						mailmensajecorreoinvenBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.mensajecorreoinvenSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Mail Mensaje Correo Inven",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mensajecorreoinvenLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mensajecorreoinvenLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mensajecorreoinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualMensajeCorreoInven(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoMensajeCorreoInven.setVisible((this.isVisibilidadCeldaNuevoMensajeCorreoInven && this.isPermisoNuevoMensajeCorreoInven));			
			this.jButtonDuplicarMensajeCorreoInven.setVisible((this.isVisibilidadCeldaDuplicarMensajeCorreoInven && this.isPermisoDuplicarMensajeCorreoInven));			
			this.jButtonCopiarMensajeCorreoInven.setVisible((this.isVisibilidadCeldaCopiarMensajeCorreoInven && this.isPermisoCopiarMensajeCorreoInven));
			this.jButtonVerFormMensajeCorreoInven.setVisible((this.isVisibilidadCeldaVerFormMensajeCorreoInven && this.isPermisoVerFormMensajeCorreoInven));
			
			this.jButtonAbrirOrderByMensajeCorreoInven.setVisible((this.isVisibilidadCeldaOrdenMensajeCorreoInven && this.isPermisoOrdenMensajeCorreoInven));			
			
			this.jButtonNuevoRelacionesMensajeCorreoInven.setVisible((this.isVisibilidadCeldaNuevoRelacionesMensajeCorreoInven && this.isPermisoNuevoMensajeCorreoInven));			
			this.jButtonNuevoGuardarCambiosMensajeCorreoInven.setVisible((this.isVisibilidadCeldaNuevoMensajeCorreoInven && this.isPermisoNuevoMensajeCorreoInven && this.isPermisoGuardarCambiosMensajeCorreoInven));
			
			if(this.jInternalFrameDetalleFormMensajeCorreoInven!=null) {
			this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonModificarMensajeCorreoInven.setVisible((this.isVisibilidadCeldaModificarMensajeCorreoInven && this.isPermisoActualizarMensajeCorreoInven));	
			this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonActualizarMensajeCorreoInven.setVisible((this.isVisibilidadCeldaActualizarMensajeCorreoInven && this.isPermisoActualizarMensajeCorreoInven));	
			this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonEliminarMensajeCorreoInven.setVisible((this.isVisibilidadCeldaEliminarMensajeCorreoInven && this.isPermisoEliminarMensajeCorreoInven));
			this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonCancelarMensajeCorreoInven.setVisible(this.isVisibilidadCeldaCancelarMensajeCorreoInven);							
			this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonGuardarCambiosMensajeCorreoInven.setVisible((this.isVisibilidadCeldaGuardarMensajeCorreoInven && this.isPermisoGuardarCambiosMensajeCorreoInven));			
			
			}
						
			this.jButtonGuardarCambiosTablaMensajeCorreoInven.setVisible((this.isVisibilidadCeldaGuardarCambiosMensajeCorreoInven && this.isPermisoGuardarCambiosMensajeCorreoInven));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarMensajeCorreoInven.setVisible((this.isVisibilidadCeldaNuevoMensajeCorreoInven && this.isPermisoNuevoMensajeCorreoInven));						
			this.jButtonDuplicarToolBarMensajeCorreoInven.setVisible((this.isVisibilidadCeldaDuplicarMensajeCorreoInven && this.isPermisoDuplicarMensajeCorreoInven));						
			this.jButtonCopiarToolBarMensajeCorreoInven.setVisible((this.isVisibilidadCeldaCopiarMensajeCorreoInven && this.isPermisoCopiarMensajeCorreoInven));			
			this.jButtonVerFormToolBarMensajeCorreoInven.setVisible((this.isVisibilidadCeldaVerFormMensajeCorreoInven && this.isPermisoVerFormMensajeCorreoInven));			
			this.jButtonAbrirOrderByToolBarMensajeCorreoInven.setVisible((this.isVisibilidadCeldaOrdenMensajeCorreoInven && this.isPermisoOrdenMensajeCorreoInven));
			this.jButtonNuevoRelacionesToolBarMensajeCorreoInven.setVisible((this.isVisibilidadCeldaNuevoRelacionesMensajeCorreoInven && this.isPermisoNuevoMensajeCorreoInven));			
			this.jButtonNuevoGuardarCambiosToolBarMensajeCorreoInven.setVisible((this.isVisibilidadCeldaNuevoMensajeCorreoInven && this.isPermisoNuevoMensajeCorreoInven && this.isPermisoGuardarCambiosMensajeCorreoInven));			
			
			if(this.jInternalFrameDetalleFormMensajeCorreoInven!=null) {
			this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonModificarToolBarMensajeCorreoInven.setVisible((this.isVisibilidadCeldaModificarMensajeCorreoInven && this.isPermisoActualizarMensajeCorreoInven));	
			this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonActualizarToolBarMensajeCorreoInven.setVisible((this.isVisibilidadCeldaActualizarMensajeCorreoInven  && this.isPermisoActualizarMensajeCorreoInven));	
			this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonEliminarToolBarMensajeCorreoInven.setVisible((this.isVisibilidadCeldaEliminarMensajeCorreoInven && this.isPermisoEliminarMensajeCorreoInven));
			this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonCancelarToolBarMensajeCorreoInven.setVisible(this.isVisibilidadCeldaCancelarMensajeCorreoInven);				
			this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonGuardarCambiosToolBarMensajeCorreoInven.setVisible((this.isVisibilidadCeldaGuardarMensajeCorreoInven && this.isPermisoGuardarCambiosMensajeCorreoInven));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarMensajeCorreoInven.setVisible((this.isVisibilidadCeldaGuardarCambiosMensajeCorreoInven && this.isPermisoGuardarCambiosMensajeCorreoInven));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoMensajeCorreoInven.setVisible((this.isVisibilidadCeldaNuevoMensajeCorreoInven && this.isPermisoNuevoMensajeCorreoInven));			
			this.jMenuItemDuplicarMensajeCorreoInven.setVisible((this.isVisibilidadCeldaDuplicarMensajeCorreoInven && this.isPermisoDuplicarMensajeCorreoInven));			
			this.jMenuItemCopiarMensajeCorreoInven.setVisible((this.isVisibilidadCeldaCopiarMensajeCorreoInven && this.isPermisoCopiarMensajeCorreoInven));			
			this.jMenuItemVerFormMensajeCorreoInven.setVisible((this.isVisibilidadCeldaVerFormMensajeCorreoInven && this.isPermisoVerFormMensajeCorreoInven));			
			this.jMenuItemAbrirOrderByMensajeCorreoInven.setVisible((this.isVisibilidadCeldaOrdenMensajeCorreoInven && this.isPermisoOrdenMensajeCorreoInven));			
			//this.jMenuItemMostrarOcultarMensajeCorreoInven.setVisible((this.isVisibilidadCeldaOrdenMensajeCorreoInven && this.isPermisoOrdenMensajeCorreoInven));
			this.jMenuItemDetalleAbrirOrderByMensajeCorreoInven.setVisible((this.isVisibilidadCeldaOrdenMensajeCorreoInven && this.isPermisoOrdenMensajeCorreoInven));			
			//this.jMenuItemDetalleMostrarOcultarMensajeCorreoInven.setVisible((this.isVisibilidadCeldaOrdenMensajeCorreoInven && this.isPermisoOrdenMensajeCorreoInven));			
			this.jMenuItemNuevoRelacionesMensajeCorreoInven.setVisible((this.isVisibilidadCeldaNuevoRelacionesMensajeCorreoInven && this.isPermisoNuevoMensajeCorreoInven));			
			this.jMenuItemNuevoGuardarCambiosMensajeCorreoInven.setVisible((this.isVisibilidadCeldaNuevoMensajeCorreoInven && this.isPermisoNuevoMensajeCorreoInven && this.isPermisoGuardarCambiosMensajeCorreoInven));									
			
			if(this.jInternalFrameDetalleFormMensajeCorreoInven!=null) {
			this.jInternalFrameDetalleFormMensajeCorreoInven.jMenuItemModificarMensajeCorreoInven.setVisible((this.isVisibilidadCeldaModificarMensajeCorreoInven && this.isPermisoActualizarMensajeCorreoInven));	
			this.jInternalFrameDetalleFormMensajeCorreoInven.jMenuItemActualizarMensajeCorreoInven.setVisible((this.isVisibilidadCeldaActualizarMensajeCorreoInven && this.isPermisoActualizarMensajeCorreoInven));	
			this.jInternalFrameDetalleFormMensajeCorreoInven.jMenuItemEliminarMensajeCorreoInven.setVisible((this.isVisibilidadCeldaEliminarMensajeCorreoInven && this.isPermisoEliminarMensajeCorreoInven));
			this.jInternalFrameDetalleFormMensajeCorreoInven.jMenuItemCancelarMensajeCorreoInven.setVisible(this.isVisibilidadCeldaCancelarMensajeCorreoInven);				
			}
			
			this.jMenuItemGuardarCambiosMensajeCorreoInven.setVisible((this.isVisibilidadCeldaGuardarMensajeCorreoInven && this.isPermisoGuardarCambiosMensajeCorreoInven));						
			this.jMenuItemGuardarCambiosTablaMensajeCorreoInven.setVisible((this.isVisibilidadCeldaGuardarCambiosMensajeCorreoInven && this.isPermisoGuardarCambiosMensajeCorreoInven));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoMensajeCorreoInven=this.jButtonNuevoMensajeCorreoInven.isVisible();
			this.isVisibilidadCeldaDuplicarMensajeCorreoInven=this.jButtonDuplicarMensajeCorreoInven.isVisible();
			this.isVisibilidadCeldaCopiarMensajeCorreoInven=this.jButtonCopiarMensajeCorreoInven.isVisible();
			this.isVisibilidadCeldaVerFormMensajeCorreoInven=this.jButtonVerFormMensajeCorreoInven.isVisible();
			
			this.isVisibilidadCeldaOrdenMensajeCorreoInven=this.jButtonAbrirOrderByMensajeCorreoInven.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesMensajeCorreoInven=this.jButtonNuevoRelacionesMensajeCorreoInven.isVisible();
			this.isVisibilidadCeldaModificarMensajeCorreoInven=this.jButtonModificarMensajeCorreoInven.isVisible();
			
			if(this.jInternalFrameDetalleFormMensajeCorreoInven!=null) {
			this.isVisibilidadCeldaActualizarMensajeCorreoInven=this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonActualizarMensajeCorreoInven.isVisible();
			this.isVisibilidadCeldaEliminarMensajeCorreoInven=this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonEliminarMensajeCorreoInven.isVisible();
			this.isVisibilidadCeldaCancelarMensajeCorreoInven=this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonCancelarMensajeCorreoInven.isVisible();
			this.isVisibilidadCeldaGuardarMensajeCorreoInven=this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonGuardarCambiosMensajeCorreoInven.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosMensajeCorreoInven=this.jButtonGuardarCambiosTablaMensajeCorreoInven.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoMensajeCorreoInven=this.jButtonNuevoToolBarMensajeCorreoInven.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesMensajeCorreoInven=this.jButtonNuevoRelacionesToolBarMensajeCorreoInven.isVisible();
			
			if(this.jInternalFrameDetalleFormMensajeCorreoInven!=null) {
			this.isVisibilidadCeldaModificarMensajeCorreoInven=this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonModificarToolBarMensajeCorreoInven.isVisible();
			this.isVisibilidadCeldaActualizarMensajeCorreoInven=this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonActualizarToolBarMensajeCorreoInven.isVisible();
			this.isVisibilidadCeldaEliminarMensajeCorreoInven=this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonEliminarToolBarMensajeCorreoInven.isVisible();
			this.isVisibilidadCeldaCancelarMensajeCorreoInven=this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonCancelarToolBarMensajeCorreoInven.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarMensajeCorreoInven=this.jButtonGuardarCambiosToolBarMensajeCorreoInven.isVisible();
			this.isVisibilidadCeldaGuardarCambiosMensajeCorreoInven=this.jButtonGuardarCambiosTablaToolBarMensajeCorreoInven.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoMensajeCorreoInven=this.jMenuItemNuevoMensajeCorreoInven.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesMensajeCorreoInven=this.jMenuItemNuevoRelacionesMensajeCorreoInven.isVisible();
			
			if(this.jInternalFrameDetalleFormMensajeCorreoInven!=null) {
			this.isVisibilidadCeldaModificarMensajeCorreoInven=this.jInternalFrameDetalleFormMensajeCorreoInven.jMenuItemModificarMensajeCorreoInven.isVisible();
			this.isVisibilidadCeldaActualizarMensajeCorreoInven=this.jInternalFrameDetalleFormMensajeCorreoInven.jMenuItemActualizarMensajeCorreoInven.isVisible();
			this.isVisibilidadCeldaEliminarMensajeCorreoInven=this.jInternalFrameDetalleFormMensajeCorreoInven.jMenuItemEliminarMensajeCorreoInven.isVisible();
			this.isVisibilidadCeldaCancelarMensajeCorreoInven=this.jInternalFrameDetalleFormMensajeCorreoInven.jMenuItemCancelarMensajeCorreoInven.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarMensajeCorreoInven=this.jMenuItemGuardarCambiosMensajeCorreoInven.isVisible();
			this.isVisibilidadCeldaGuardarCambiosMensajeCorreoInven=this.jMenuItemGuardarCambiosTablaMensajeCorreoInven.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesMensajeCorreoInven(Boolean esInicializar) {
		if(MensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {			
			if(this.mensajecorreoinvenSessionBean.getConGuardarRelaciones()) {
				//if(this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesMensajeCorreoInven();
			}
			
			this.inicializarActualizarBindingBotonesManualMensajeCorreoInven(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualMensajeCorreoInven() {
		this.jButtonNuevoMensajeCorreoInven.setVisible(this.isPermisoNuevoMensajeCorreoInven);			
		this.jButtonDuplicarMensajeCorreoInven.setVisible(this.isPermisoDuplicarMensajeCorreoInven);			
		this.jButtonCopiarMensajeCorreoInven.setVisible(this.isPermisoCopiarMensajeCorreoInven);			
		this.jButtonVerFormMensajeCorreoInven.setVisible(this.isPermisoVerFormMensajeCorreoInven);			
		
		this.jButtonAbrirOrderByMensajeCorreoInven.setVisible(this.isPermisoOrdenMensajeCorreoInven);					
		
		this.jButtonNuevoRelacionesMensajeCorreoInven.setVisible(this.isPermisoNuevoMensajeCorreoInven);			
		
		if(this.jInternalFrameDetalleFormMensajeCorreoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonModificarMensajeCorreoInven.setVisible(this.isPermisoActualizarMensajeCorreoInven);	
			this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonActualizarMensajeCorreoInven.setVisible(this.isPermisoActualizarMensajeCorreoInven);	
			this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonEliminarMensajeCorreoInven.setVisible(this.isPermisoEliminarMensajeCorreoInven);
			this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonCancelarMensajeCorreoInven.setVisible(this.isVisibilidadCeldaCancelarMensajeCorreoInven);						
			this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonGuardarCambiosMensajeCorreoInven.setVisible(this.isPermisoGuardarCambiosMensajeCorreoInven);							
		}
		
		this.jButtonGuardarCambiosTablaMensajeCorreoInven.setVisible(this.isPermisoActualizarMensajeCorreoInven);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleMensajeCorreoInven() {
		this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonModificarMensajeCorreoInven.setVisible(this.isPermisoActualizarMensajeCorreoInven);	
		this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonActualizarMensajeCorreoInven.setVisible(this.isPermisoActualizarMensajeCorreoInven);	
		this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonEliminarMensajeCorreoInven.setVisible(this.isPermisoEliminarMensajeCorreoInven);
		this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonCancelarMensajeCorreoInven.setVisible(this.isVisibilidadCeldaCancelarMensajeCorreoInven);							
		this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonGuardarCambiosMensajeCorreoInven.setVisible((this.isVisibilidadCeldaGuardarMensajeCorreoInven && this.isPermisoGuardarCambiosMensajeCorreoInven));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosMensajeCorreoInven() {
		if(MensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualMensajeCorreoInven();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesMensajeCorreoInven() {
	}
	
	public void jTableDatosMensajeCorreoInvenListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarMensajeCorreoInven(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidMensajeCorreoInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mensajecorreoinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMensajeCorreoInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMensajeCorreoInven(this.getmensajecorreoinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMensajeCorreoInven(this.mensajecorreoinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mensajecorreoinven =(MensajeCorreoInven) this.mensajecorreoinvenLogic.getMensajeCorreoInvens().toArray()[this.jTableDatosMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.mensajecorreoinven =(MensajeCorreoInven) this.mensajecorreoinvens.toArray()[this.jTableDatosMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.mensajecorreoinven==null) {
						this.mensajecorreoinven = new MensajeCorreoInven();
					}

					this.setVariablesFormularioToObjetoActualMensajeCorreoInven(this.mensajecorreoinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMensajeCorreoInven(this.mensajecorreoinven);
				}

				if(this.mensajecorreoinven.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.mensajecorreoinven.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMensajeCorreoInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mensajecorreoinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mensajecorreoinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mensajecorreoinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaMensajeCorreoInvenUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mensajecorreoinvenLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebMensajeCorreoInven(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMensajeCorreoInven.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosMensajeCorreoInven.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosMensajeCorreoInven.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mensajecorreoinven =(MensajeCorreoInven) this.mensajecorreoinvenLogic.getMensajeCorreoInvens().toArray()[this.jTableDatosMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.mensajecorreoinven =(MensajeCorreoInven) this.mensajecorreoinvens.toArray()[this.jTableDatosMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualMensajeCorreoInven(this.getmensajecorreoinven(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysMensajeCorreoInven(this.mensajecorreoinven);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.mensajecorreoinvenLogic.getConnexion());

				if(this.mensajecorreoinven.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.mensajecorreoinven.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderMensajeCorreoInven=(TitledBorder)this.jScrollPanelDatosMensajeCorreoInven.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderMensajeCorreoInven.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mensajecorreoinvenLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mensajecorreoinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mensajecorreoinvenLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaMensajeCorreoInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mensajecorreoinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMensajeCorreoInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMensajeCorreoInven(this.getmensajecorreoinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMensajeCorreoInven(this.mensajecorreoinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mensajecorreoinven =(MensajeCorreoInven) this.mensajecorreoinvenLogic.getMensajeCorreoInvens().toArray()[this.jTableDatosMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.mensajecorreoinven =(MensajeCorreoInven) this.mensajecorreoinvens.toArray()[this.jTableDatosMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.mensajecorreoinven==null) {
						this.mensajecorreoinven = new MensajeCorreoInven();
					}

					this.setVariablesFormularioToObjetoActualMensajeCorreoInven(this.mensajecorreoinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMensajeCorreoInven(this.mensajecorreoinven);
				}

				if(this.mensajecorreoinven.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.mensajecorreoinven.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMensajeCorreoInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mensajecorreoinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mensajecorreoinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mensajecorreoinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalMensajeCorreoInvenUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mensajecorreoinvenLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebMensajeCorreoInven(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMensajeCorreoInven.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosMensajeCorreoInven.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosMensajeCorreoInven.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mensajecorreoinven =(MensajeCorreoInven) this.mensajecorreoinvenLogic.getMensajeCorreoInvens().toArray()[this.jTableDatosMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.mensajecorreoinven =(MensajeCorreoInven) this.mensajecorreoinvens.toArray()[this.jTableDatosMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualMensajeCorreoInven(this.getmensajecorreoinven(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysMensajeCorreoInven(this.mensajecorreoinven);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.mensajecorreoinvenLogic.getConnexion());

				if(this.mensajecorreoinven.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.mensajecorreoinven.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderMensajeCorreoInven=(TitledBorder)this.jScrollPanelDatosMensajeCorreoInven.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderMensajeCorreoInven.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mensajecorreoinvenLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mensajecorreoinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mensajecorreoinvenLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalMensajeCorreoInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mensajecorreoinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMensajeCorreoInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMensajeCorreoInven(this.getmensajecorreoinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMensajeCorreoInven(this.mensajecorreoinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mensajecorreoinven =(MensajeCorreoInven) this.mensajecorreoinvenLogic.getMensajeCorreoInvens().toArray()[this.jTableDatosMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.mensajecorreoinven =(MensajeCorreoInven) this.mensajecorreoinvens.toArray()[this.jTableDatosMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.mensajecorreoinven==null) {
						this.mensajecorreoinven = new MensajeCorreoInven();
					}

					this.setVariablesFormularioToObjetoActualMensajeCorreoInven(this.mensajecorreoinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMensajeCorreoInven(this.mensajecorreoinven);
				}

				if(this.mensajecorreoinven.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.mensajecorreoinven.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMensajeCorreoInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mensajecorreoinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mensajecorreoinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mensajecorreoinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_moduloMensajeCorreoInvenUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mensajecorreoinvenLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomodulo=true;

			idTienePermisomodulo=this.tienePermisosUsuarioEnPaginaWebMensajeCorreoInven(ModuloConstantesFunciones.CLASSNAME);

			if(idTienePermisomodulo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMensajeCorreoInven.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosMensajeCorreoInven.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosMensajeCorreoInven.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mensajecorreoinven =(MensajeCorreoInven) this.mensajecorreoinvenLogic.getMensajeCorreoInvens().toArray()[this.jTableDatosMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.mensajecorreoinven =(MensajeCorreoInven) this.mensajecorreoinvens.toArray()[this.jTableDatosMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualMensajeCorreoInven(this.getmensajecorreoinven(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysMensajeCorreoInven(this.mensajecorreoinven);

				this.moduloBeanSwingJInternalFrame=new ModuloBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.moduloBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.moduloBeanSwingJInternalFrame.getModuloLogic().setConnexion(this.mensajecorreoinvenLogic.getConnexion());

				if(this.mensajecorreoinven.getid_modulo()!=null) {
					this.moduloBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.moduloBeanSwingJInternalFrame.setIdActual(this.mensajecorreoinven.getid_modulo());
					this.moduloBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.moduloBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.moduloBeanSwingJInternalFrame.inicializarActualizarBindingTablaModulo();
				}

				JInternalFrameBase jinternalFrame =this.moduloBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderMensajeCorreoInven=(TitledBorder)this.jScrollPanelDatosMensajeCorreoInven.getBorder();
				TitledBorder titledBordermodulo=(TitledBorder)this.moduloBeanSwingJInternalFrame.jScrollPanelDatosModulo.getBorder();

				titledBordermodulo.setTitle(titledBorderMensajeCorreoInven.getTitle() + " -> Modulo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mensajecorreoinvenLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mensajecorreoinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mensajecorreoinvenLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_moduloMensajeCorreoInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mensajecorreoinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMensajeCorreoInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMensajeCorreoInven(this.getmensajecorreoinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMensajeCorreoInven(this.mensajecorreoinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mensajecorreoinven =(MensajeCorreoInven) this.mensajecorreoinvenLogic.getMensajeCorreoInvens().toArray()[this.jTableDatosMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.mensajecorreoinven =(MensajeCorreoInven) this.mensajecorreoinvens.toArray()[this.jTableDatosMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.mensajecorreoinven==null) {
						this.mensajecorreoinven = new MensajeCorreoInven();
					}

					this.setVariablesFormularioToObjetoActualMensajeCorreoInven(this.mensajecorreoinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMensajeCorreoInven(this.mensajecorreoinven);
				}

				if(this.mensajecorreoinven.getid_modulo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_modulo = "+this.mensajecorreoinven.getid_modulo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMensajeCorreoInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mensajecorreoinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mensajecorreoinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mensajecorreoinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_mensaje_correo_invenMensajeCorreoInvenUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mensajecorreoinvenLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipomensajecorreoinven=true;

			idTienePermisotipomensajecorreoinven=this.tienePermisosUsuarioEnPaginaWebMensajeCorreoInven(TipoMensajeCorreoInvenConstantesFunciones.CLASSNAME);

			if(idTienePermisotipomensajecorreoinven) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMensajeCorreoInven.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosMensajeCorreoInven.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosMensajeCorreoInven.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mensajecorreoinven =(MensajeCorreoInven) this.mensajecorreoinvenLogic.getMensajeCorreoInvens().toArray()[this.jTableDatosMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.mensajecorreoinven =(MensajeCorreoInven) this.mensajecorreoinvens.toArray()[this.jTableDatosMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualMensajeCorreoInven(this.getmensajecorreoinven(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysMensajeCorreoInven(this.mensajecorreoinven);

				this.tipomensajecorreoinvenBeanSwingJInternalFrame=new TipoMensajeCorreoInvenBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipomensajecorreoinvenBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipomensajecorreoinvenBeanSwingJInternalFrame.getTipoMensajeCorreoInvenLogic().setConnexion(this.mensajecorreoinvenLogic.getConnexion());

				if(this.mensajecorreoinven.getid_tipo_mensaje_correo_inven()!=null) {
					this.tipomensajecorreoinvenBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipomensajecorreoinvenBeanSwingJInternalFrame.setIdActual(this.mensajecorreoinven.getid_tipo_mensaje_correo_inven());
					this.tipomensajecorreoinvenBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipomensajecorreoinvenBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipomensajecorreoinvenBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoMensajeCorreoInven();
				}

				JInternalFrameBase jinternalFrame =this.tipomensajecorreoinvenBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderMensajeCorreoInven=(TitledBorder)this.jScrollPanelDatosMensajeCorreoInven.getBorder();
				TitledBorder titledBordertipomensajecorreoinven=(TitledBorder)this.tipomensajecorreoinvenBeanSwingJInternalFrame.jScrollPanelDatosTipoMensajeCorreoInven.getBorder();

				titledBordertipomensajecorreoinven.setTitle(titledBorderMensajeCorreoInven.getTitle() + " -> Tipo Mensaje Correo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mensajecorreoinvenLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mensajecorreoinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mensajecorreoinvenLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_mensaje_correo_invenMensajeCorreoInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mensajecorreoinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMensajeCorreoInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMensajeCorreoInven(this.getmensajecorreoinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMensajeCorreoInven(this.mensajecorreoinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mensajecorreoinven =(MensajeCorreoInven) this.mensajecorreoinvenLogic.getMensajeCorreoInvens().toArray()[this.jTableDatosMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.mensajecorreoinven =(MensajeCorreoInven) this.mensajecorreoinvens.toArray()[this.jTableDatosMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.mensajecorreoinven==null) {
						this.mensajecorreoinven = new MensajeCorreoInven();
					}

					this.setVariablesFormularioToObjetoActualMensajeCorreoInven(this.mensajecorreoinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMensajeCorreoInven(this.mensajecorreoinven);
				}

				if(this.mensajecorreoinven.getid_tipo_mensaje_correo_inven()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_mensaje_correo_inven = "+this.mensajecorreoinven.getid_tipo_mensaje_correo_inven().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMensajeCorreoInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mensajecorreoinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mensajecorreoinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mensajecorreoinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontemaMensajeCorreoInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mensajecorreoinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMensajeCorreoInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMensajeCorreoInven(this.getmensajecorreoinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMensajeCorreoInven(this.mensajecorreoinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mensajecorreoinven =(MensajeCorreoInven) this.mensajecorreoinvenLogic.getMensajeCorreoInvens().toArray()[this.jTableDatosMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.mensajecorreoinven =(MensajeCorreoInven) this.mensajecorreoinvens.toArray()[this.jTableDatosMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.mensajecorreoinven==null) {
						this.mensajecorreoinven = new MensajeCorreoInven();
					}

					this.setVariablesFormularioToObjetoActualMensajeCorreoInven(this.mensajecorreoinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMensajeCorreoInven(this.mensajecorreoinven);
				}

				if(this.mensajecorreoinven.gettema()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where tema like '%"+this.mensajecorreoinven.gettema()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMensajeCorreoInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mensajecorreoinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mensajecorreoinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mensajecorreoinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonmensajeMensajeCorreoInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mensajecorreoinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMensajeCorreoInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMensajeCorreoInven(this.getmensajecorreoinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMensajeCorreoInven(this.mensajecorreoinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mensajecorreoinven =(MensajeCorreoInven) this.mensajecorreoinvenLogic.getMensajeCorreoInvens().toArray()[this.jTableDatosMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.mensajecorreoinven =(MensajeCorreoInven) this.mensajecorreoinvens.toArray()[this.jTableDatosMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.mensajecorreoinven==null) {
						this.mensajecorreoinven = new MensajeCorreoInven();
					}

					this.setVariablesFormularioToObjetoActualMensajeCorreoInven(this.mensajecorreoinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMensajeCorreoInven(this.mensajecorreoinven);
				}

				if(this.mensajecorreoinven.getmensaje()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where mensaje like '%"+this.mensajecorreoinven.getmensaje()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMensajeCorreoInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mensajecorreoinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mensajecorreoinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mensajecorreoinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonavisoMensajeCorreoInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mensajecorreoinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMensajeCorreoInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMensajeCorreoInven(this.getmensajecorreoinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMensajeCorreoInven(this.mensajecorreoinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mensajecorreoinven =(MensajeCorreoInven) this.mensajecorreoinvenLogic.getMensajeCorreoInvens().toArray()[this.jTableDatosMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.mensajecorreoinven =(MensajeCorreoInven) this.mensajecorreoinvens.toArray()[this.jTableDatosMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.mensajecorreoinven==null) {
						this.mensajecorreoinven = new MensajeCorreoInven();
					}

					this.setVariablesFormularioToObjetoActualMensajeCorreoInven(this.mensajecorreoinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMensajeCorreoInven(this.mensajecorreoinven);
				}

				if(this.mensajecorreoinven.getaviso()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where aviso like '%"+this.mensajecorreoinven.getaviso()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMensajeCorreoInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mensajecorreoinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mensajecorreoinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mensajecorreoinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonesta_activoMensajeCorreoInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mensajecorreoinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMensajeCorreoInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMensajeCorreoInven(this.getmensajecorreoinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMensajeCorreoInven(this.mensajecorreoinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mensajecorreoinven =(MensajeCorreoInven) this.mensajecorreoinvenLogic.getMensajeCorreoInvens().toArray()[this.jTableDatosMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.mensajecorreoinven =(MensajeCorreoInven) this.mensajecorreoinvens.toArray()[this.jTableDatosMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.mensajecorreoinven==null) {
						this.mensajecorreoinven = new MensajeCorreoInven();
					}

					this.setVariablesFormularioToObjetoActualMensajeCorreoInven(this.mensajecorreoinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMensajeCorreoInven(this.mensajecorreoinven);
				}

				if(this.mensajecorreoinven.getesta_activo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where esta_activo = "+this.mensajecorreoinven.getesta_activo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMensajeCorreoInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mensajecorreoinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mensajecorreoinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mensajecorreoinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mensajecorreoinvenLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingMensajeCorreoInven(false,false);

			this.getMensajeCorreoInvensFK_IdEmpresa();

			this.inicializarActualizarBindingMensajeCorreoInven(false);

			//if(MensajeCorreoInvenBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingMensajeCorreoInven(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mensajecorreoinvenLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mensajecorreoinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mensajecorreoinvenLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdModuloMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mensajecorreoinvenLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingMensajeCorreoInven(false,false);

			this.getMensajeCorreoInvensFK_IdModulo();

			this.inicializarActualizarBindingMensajeCorreoInven(false);

			//if(MensajeCorreoInvenBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingMensajeCorreoInven(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mensajecorreoinvenLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mensajecorreoinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mensajecorreoinvenLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mensajecorreoinvenLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingMensajeCorreoInven(false,false);

			this.getMensajeCorreoInvensFK_IdSucursal();

			this.inicializarActualizarBindingMensajeCorreoInven(false);

			//if(MensajeCorreoInvenBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingMensajeCorreoInven(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mensajecorreoinvenLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mensajecorreoinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mensajecorreoinvenLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoMensajeCorreoInvenMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mensajecorreoinvenLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingMensajeCorreoInven(false,false);

			this.getMensajeCorreoInvensFK_IdTipoMensajeCorreoInven();

			this.inicializarActualizarBindingMensajeCorreoInven(false);

			//if(MensajeCorreoInvenBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingMensajeCorreoInven(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mensajecorreoinvenLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mensajecorreoinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mensajecorreoinvenLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameMensajeCorreoInven() {
		if(this.jInternalFrameDetalleFormMensajeCorreoInven!=null) {
		

		if(this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormMensajeCorreoInven!=null) {
			this.jInternalFrameDetalleFormMensajeCorreoInven.setVisible(false);	    			
			this.jInternalFrameDetalleFormMensajeCorreoInven.dispose();
			this.jInternalFrameDetalleFormMensajeCorreoInven=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoMensajeCorreoInven!=null) {
			this.jInternalFrameReporteDinamicoMensajeCorreoInven.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoMensajeCorreoInven.dispose();
			this.jInternalFrameReporteDinamicoMensajeCorreoInven=null;
		}
		
		if(this.jInternalFrameImportacionMensajeCorreoInven!=null) {
			this.jInternalFrameImportacionMensajeCorreoInven.setVisible(false);	    			
			this.jInternalFrameImportacionMensajeCorreoInven.dispose();
			this.jInternalFrameImportacionMensajeCorreoInven=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessMensajeCorreoInven();
			
			MensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.mensajecorreoinven,new Object(),this.mensajecorreoinvenParameterGeneral,this.mensajecorreoinvenReturnGeneral);
			
			
			if(sTipo.equals("NuevoMensajeCorreoInven")) {
				jButtonNuevoMensajeCorreoInvenActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarMensajeCorreoInven")) {
				jButtonDuplicarMensajeCorreoInvenActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarMensajeCorreoInven")) {
				jButtonCopiarMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("VerFormMensajeCorreoInven")) {
				jButtonVerFormMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarMensajeCorreoInven")) {
				jButtonNuevoMensajeCorreoInvenActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarMensajeCorreoInven")) {
				jButtonDuplicarMensajeCorreoInvenActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoMensajeCorreoInven")) {
				jButtonNuevoMensajeCorreoInvenActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarMensajeCorreoInven")) {
				jButtonDuplicarMensajeCorreoInvenActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesMensajeCorreoInven")) {
				jButtonNuevoMensajeCorreoInvenActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarMensajeCorreoInven")) {
				jButtonNuevoMensajeCorreoInvenActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesMensajeCorreoInven")) {
				jButtonNuevoMensajeCorreoInvenActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarMensajeCorreoInven")) {
				jButtonModificarMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarMensajeCorreoInven")) {
				jButtonModificarMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarMensajeCorreoInven")) {
				jButtonModificarMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("ActualizarMensajeCorreoInven")) {
				jButtonActualizarMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarMensajeCorreoInven")) {
				jButtonActualizarMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarMensajeCorreoInven")) {
				jButtonActualizarMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("EliminarMensajeCorreoInven")) {
				jButtonEliminarMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarMensajeCorreoInven")) {
				jButtonEliminarMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarMensajeCorreoInven")) {
				jButtonEliminarMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("CancelarMensajeCorreoInven")) {
				jButtonCancelarMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarMensajeCorreoInven")) {
				jButtonCancelarMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarMensajeCorreoInven")) {
				jButtonCancelarMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("CerrarMensajeCorreoInven")) {
				jButtonCerrarMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarMensajeCorreoInven")) {
				jButtonCerrarMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarMensajeCorreoInven")) {
				jButtonCerrarMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarMensajeCorreoInven")) {
				jButtonMostrarOcultarMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarMensajeCorreoInven")) {
				jButtonCancelarMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosMensajeCorreoInven")) {
				jButtonGuardarCambiosMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarMensajeCorreoInven")) {
				jButtonGuardarCambiosMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarMensajeCorreoInven")) {
				jButtonCopiarMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarMensajeCorreoInven")) {
				jButtonVerFormMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosMensajeCorreoInven")) {
				jButtonGuardarCambiosMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarMensajeCorreoInven")) {
				jButtonCopiarMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormMensajeCorreoInven")) {
				jButtonVerFormMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaMensajeCorreoInven")) {
				jButtonGuardarCambiosMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarMensajeCorreoInven")) {
				jButtonGuardarCambiosMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaMensajeCorreoInven")) {
				jButtonGuardarCambiosMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionMensajeCorreoInven")) {
				jButtonRecargarInformacionMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarMensajeCorreoInven")) {
				jButtonRecargarInformacionMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionMensajeCorreoInven")) {
				jButtonRecargarInformacionMensajeCorreoInvenActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresMensajeCorreoInven")) {
				jButtonAnterioresMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarMensajeCorreoInven")) {
				jButtonAnterioresMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreMensajeCorreoInven")) {
				jButtonAnterioresMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("SiguientesMensajeCorreoInven")) {
				jButtonSiguientesMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarMensajeCorreoInven")) {
				jButtonSiguientesMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesMensajeCorreoInven")) {
				jButtonSiguientesMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByMensajeCorreoInven") || sTipo.equals("MenuItemDetalleAbrirOrderByMensajeCorreoInven")) {
				jButtonAbrirOrderByMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarMensajeCorreoInven") || sTipo.equals("MenuItemDetalleMostrarOcultarMensajeCorreoInven")) {
				jButtonMostrarOcultarMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosMensajeCorreoInven")) {
				jButtonNuevoGuardarCambiosMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarMensajeCorreoInven")) {
				jButtonNuevoGuardarCambiosMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosMensajeCorreoInven")) {
				jButtonNuevoGuardarCambiosMensajeCorreoInvenActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoMensajeCorreoInven")) {
				jButtonCerrarReporteDinamicoMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoMensajeCorreoInven")) {
				jButtonGenerarReporteDinamicoMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoMensajeCorreoInven")) {
				
				jButtonGenerarExcelReporteDinamicoMensajeCorreoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionMensajeCorreoInven")) {
				jButtonCerrarImportacionMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionMensajeCorreoInven")) {
				
				jButtonGenerarImportacionMensajeCorreoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionMensajeCorreoInven")) {
				
				jButtonAbrirImportacionMensajeCorreoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesMensajeCorreoInven")) {
				jComboBoxTiposAccionesMensajeCorreoInvenActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesMensajeCorreoInven")) {
				jComboBoxTiposRelacionesMensajeCorreoInvenActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioMensajeCorreoInven")) {
				jComboBoxTiposAccionesMensajeCorreoInvenActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarMensajeCorreoInven")) {
				
				jComboBoxTiposSeleccionarMensajeCorreoInvenActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralMensajeCorreoInven")) {
				jTextFieldValorCampoGeneralMensajeCorreoInvenActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByMensajeCorreoInven")) {
				jButtonAbrirOrderByMensajeCorreoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarMensajeCorreoInven")) {
				jButtonAbrirOrderByMensajeCorreoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByMensajeCorreoInven")) {
				jButtonCerrarOrderByMensajeCorreoInvenActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idMensajeCorreoInvenBusqueda")) {
				this.jButtonidMensajeCorreoInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaMensajeCorreoInvenUpdate")) {
				this.jButtonid_empresaMensajeCorreoInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaMensajeCorreoInvenBusqueda")) {
				this.jButtonid_empresaMensajeCorreoInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalMensajeCorreoInvenUpdate")) {
				this.jButtonid_sucursalMensajeCorreoInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalMensajeCorreoInvenBusqueda")) {
				this.jButtonid_sucursalMensajeCorreoInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_moduloMensajeCorreoInvenUpdate")) {
				this.jButtonid_moduloMensajeCorreoInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_moduloMensajeCorreoInvenBusqueda")) {
				this.jButtonid_moduloMensajeCorreoInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_mensaje_correo_invenMensajeCorreoInvenUpdate")) {
				this.jButtonid_tipo_mensaje_correo_invenMensajeCorreoInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_mensaje_correo_invenMensajeCorreoInvenBusqueda")) {
				this.jButtonid_tipo_mensaje_correo_invenMensajeCorreoInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("temaMensajeCorreoInvenBusqueda")) {
				this.jButtontemaMensajeCorreoInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("mensajeMensajeCorreoInvenBusqueda")) {
				this.jButtonmensajeMensajeCorreoInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("avisoMensajeCorreoInvenBusqueda")) {
				this.jButtonavisoMensajeCorreoInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esta_activoMensajeCorreoInvenBusqueda")) {
				this.jButtonesta_activoMensajeCorreoInvenBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdTipoMensajeCorreoInvenMensajeCorreoInven")) {
				this.jButtonFK_IdTipoMensajeCorreoInvenMensajeCorreoInvenActionPerformed(evt);
			}
			
			;
			
			
			MensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.mensajecorreoinven,new Object(),this.mensajecorreoinvenParameterGeneral,this.mensajecorreoinvenReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessMensajeCorreoInven();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMensajeCorreoInvenActual();
			
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				Container containerParent=null;
				JTextField jTextField=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParent=jTextField.getParent();
						
				if(containerParent!=null && containerParent.getClass().equals(JTableMe.class)) {
					esControlTabla=true;
				}
						
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.mensajecorreoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.mensajecorreoinven);
				
				MensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mensajecorreoinven,new Object(),this.mensajecorreoinvenParameterGeneral,this.mensajecorreoinvenReturnGeneral);
				
				


				
				MensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mensajecorreoinven,new Object(),this.mensajecorreoinvenParameterGeneral,this.mensajecorreoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MensajeCorreoInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MensajeCorreoInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			MensajeCorreoInven mensajecorreoinvenLocal=null;
			
			if(!this.getEsControlTabla()) {
				mensajecorreoinvenLocal=this.mensajecorreoinven;
			} else {
				mensajecorreoinvenLocal=this.mensajecorreoinvenAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
		
		return existeCambio;
	}
	
	public void jTextFieldFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTBOX,sTipo)) {
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextField jTextField=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParent=jTextField.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.mensajecorreoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.mensajecorreoinven);
				
				MensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mensajecorreoinven,new Object(),this.mensajecorreoinvenParameterGeneral,this.mensajecorreoinvenReturnGeneral);
							
				
				


				
				MensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mensajecorreoinven,new Object(),this.mensajecorreoinvenParameterGeneral,this.mensajecorreoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MensajeCorreoInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MensajeCorreoInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMensajeCorreoInvenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosMensajeCorreoInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mensajecorreoinvenAnterior =(MensajeCorreoInven) this.mensajecorreoinvenLogic.getMensajeCorreoInvens().toArray()[this.jTableDatosMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.mensajecorreoinvenAnterior =(MensajeCorreoInven) this.mensajecorreoinvens.toArray()[this.jTableDatosMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	//CUANDO SE CAMBIA ALGUN FORMATO(TIPO DE LETRA,NEGRILLA,ETC)
	public void jTextFieldChangedUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			/*
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			//System.out.println("UPDATE");
			
			Boolean esControlTabla=false;
			//JTextField jTextField=null;
			Container containerParent=null;
			Component componentOpposite=null;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			MensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mensajecorreoinven,new Object(),this.mensajecorreoinvenParameterGeneral,this.mensajecorreoinvenReturnGeneral);
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			//jTextField=(JTextField)evt.getSource();
			
			containerParent=jTextField.getParent();
					
			componentOpposite=null;//evt.getOppositeComponent();
			
			if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
				|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
			) {					
				esControlTabla=true;
			}
			
			this.esControlTabla=esControlTabla;
			
			


			
			MensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mensajecorreoinven,new Object(),this.mensajecorreoinvenParameterGeneral,this.mensajecorreoinvenReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMensajeCorreoInvenActual();
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				Container containerParent=null;
				Container containerParentAux=null;
				JFormattedTextField JFormattedTextField=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				JFormattedTextField=(JFormattedTextField)evt.getSource();
				
				containerParentAux=JFormattedTextField.getParent();
				
				if(containerParentAux!=null && containerParentAux.getClass().equals(JDateChooser.class)) {
					containerParent=containerParentAux.getParent();
				}
				
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.mensajecorreoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.mensajecorreoinven);
				
				MensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mensajecorreoinven,new Object(),this.mensajecorreoinvenParameterGeneral,this.mensajecorreoinvenReturnGeneral);
								
						
				


				
				MensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mensajecorreoinven,new Object(),this.mensajecorreoinvenParameterGeneral,this.mensajecorreoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MensajeCorreoInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MensajeCorreoInven.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTBOX,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextField jTextField=null;
				Container containerParent=null;
				Container containerParentAux=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParentAux=jTextField.getParent();
						
				if(containerParentAux!=null && containerParentAux.getClass().equals(JDateChooser.class)) {
					containerParent=containerParentAux.getParent();
				}
				
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.mensajecorreoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.mensajecorreoinven);
				
				MensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mensajecorreoinven,new Object(),this.mensajecorreoinvenParameterGeneral,this.mensajecorreoinvenReturnGeneral);
								
				
				


				
				MensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mensajecorreoinven,new Object(),this.mensajecorreoinvenParameterGeneral,this.mensajecorreoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MensajeCorreoInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MensajeCorreoInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMensajeCorreoInvenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosMensajeCorreoInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mensajecorreoinvenAnterior =(MensajeCorreoInven) this.mensajecorreoinvenLogic.getMensajeCorreoInvens().toArray()[this.jTableDatosMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.mensajecorreoinvenAnterior =(MensajeCorreoInven) this.mensajecorreoinvens.toArray()[this.jTableDatosMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.mensajecorreoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.mensajecorreoinven);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMensajeCorreoInvenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosMensajeCorreoInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mensajecorreoinvenAnterior =(MensajeCorreoInven) this.mensajecorreoinvenLogic.getMensajeCorreoInvens().toArray()[this.jTableDatosMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.mensajecorreoinvenAnterior =(MensajeCorreoInven) this.mensajecorreoinvens.toArray()[this.jTableDatosMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMensajeCorreoInvenActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.mensajecorreoinven);
			
			this.actualizarInformacion("INFO_PADRE",false,this.mensajecorreoinven);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jTextAreaFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTAREA,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextArea jTextArea=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextArea=(JTextArea)evt.getSource();
				
				containerParent=jTextArea.getParent();
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.mensajecorreoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.mensajecorreoinven);
				
				MensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mensajecorreoinven,new Object(),this.mensajecorreoinvenParameterGeneral,this.mensajecorreoinvenReturnGeneral);
							
				
				


				
				MensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mensajecorreoinven,new Object(),this.mensajecorreoinvenParameterGeneral,this.mensajecorreoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MensajeCorreoInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MensajeCorreoInven.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMensajeCorreoInvenActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosMensajeCorreoInven.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mensajecorreoinvenAnterior =(MensajeCorreoInven) this.mensajecorreoinvenLogic.getMensajeCorreoInvens().toArray()[this.jTableDatosMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.mensajecorreoinvenAnterior =(MensajeCorreoInven) this.mensajecorreoinvens.toArray()[this.jTableDatosMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaChangedUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			/*
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			//System.out.println("UPDATE");
			
			Boolean esControlTabla=false;
			//JTextArea jTextArea=null;
			Container containerParent=null;
			Component componentOpposite=null;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			MensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mensajecorreoinven,new Object(),this.mensajecorreoinvenParameterGeneral,this.mensajecorreoinvenReturnGeneral);
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			//jTextArea=(JTextArea)evt.getSource();
			
			containerParent=jTextArea.getParent();
			componentOpposite=null;//evt.getOppositeComponent();
			
			if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
				|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
			) {
				esControlTabla=true;
			}
			
			this.esControlTabla=esControlTabla;
			
			


			
			MensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mensajecorreoinven,new Object(),this.mensajecorreoinvenParameterGeneral,this.mensajecorreoinvenReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMensajeCorreoInvenActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.mensajecorreoinven);
			
			this.actualizarInformacion("INFO_PADRE",false,this.mensajecorreoinven);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JLabel jLabel=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jLabel=(JLabel)evt.getSource();
				
				containerParent=jLabel.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.mensajecorreoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.mensajecorreoinven);
				
				MensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mensajecorreoinven,new Object(),this.mensajecorreoinvenParameterGeneral,this.mensajecorreoinvenReturnGeneral);
								
				
				


				
				MensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mensajecorreoinven,new Object(),this.mensajecorreoinvenParameterGeneral,this.mensajecorreoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MensajeCorreoInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MensajeCorreoInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMensajeCorreoInvenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosMensajeCorreoInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mensajecorreoinvenAnterior =(MensajeCorreoInven) this.mensajecorreoinvenLogic.getMensajeCorreoInvens().toArray()[this.jTableDatosMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.mensajecorreoinvenAnterior =(MensajeCorreoInven) this.mensajecorreoinvens.toArray()[this.jTableDatosMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMensajeCorreoInvenActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.mensajecorreoinven);
			
			this.actualizarInformacion("INFO_PADRE",false,this.mensajecorreoinven);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMensajeCorreoInvenActual();
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JCheckBox jCheckBox=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
							
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jCheckBox=(JCheckBox)evt.getSource();
				
				containerParent=jCheckBox.getParent();
						
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.mensajecorreoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.mensajecorreoinven);
				
				MensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.mensajecorreoinven,new Object(),this.mensajecorreoinvenParameterGeneral,this.mensajecorreoinvenReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosMensajeCorreoInven")) {
					jCheckBoxSeleccionarTodosMensajeCorreoInvenItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosMensajeCorreoInven")) {
					jCheckBoxSeleccionadosMensajeCorreoInvenItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarMensajeCorreoInven")) {
					
				}
				
				


				
				
				MensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.mensajecorreoinven,new Object(),this.mensajecorreoinvenParameterGeneral,this.mensajecorreoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MensajeCorreoInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MensajeCorreoInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.CHECKBOX,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JCheckBox jCheckBox=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jCheckBox=(JCheckBox)evt.getSource();
				
				containerParent=jCheckBox.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.mensajecorreoinven);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.mensajecorreoinven);
				
				MensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.mensajecorreoinven,new Object(),this.mensajecorreoinvenParameterGeneral,this.mensajecorreoinvenReturnGeneral);
												
				
				


				
				
				MensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.mensajecorreoinven,new Object(),this.mensajecorreoinvenParameterGeneral,this.mensajecorreoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MensajeCorreoInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MensajeCorreoInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMensajeCorreoInvenActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosMensajeCorreoInven.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mensajecorreoinvenAnterior =(MensajeCorreoInven) this.mensajecorreoinvenLogic.getMensajeCorreoInvens().toArray()[this.jTableDatosMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.mensajecorreoinvenAnterior =(MensajeCorreoInven) this.mensajecorreoinvens.toArray()[this.jTableDatosMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMensajeCorreoInvenActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.mensajecorreoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.mensajecorreoinven);
				
				MensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.mensajecorreoinven,new Object(),this.mensajecorreoinvenParameterGeneral,this.mensajecorreoinvenReturnGeneral);
				
				
				MensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.mensajecorreoinven,new Object(),this.mensajecorreoinvenParameterGeneral,this.mensajecorreoinvenReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO SE UTILIZA, SE USA EL DE ABAJO, IGUAL SE DEJA EL CODIGO COMO RESPALDO Y ES CASI IGUAL
	//ERROR:SI SE USA,AL HACER CLIC EN EL MISMO ELEMENTO O EJECUTAR SELECTEDITEM, SIEMPRE SE EJECUTA COMO SI ESCOGIERA OTRO ELEMENTO(NO DEBERIA)
	//@SuppressWarnings("rawtypes")
	public void jComboBoxActionPerformedGeneral(String sTipo,ActionEvent evt) {		
		try {
			/*		
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			Container containerParent=null;
			Component componentOpposite=null;
			Boolean esControlTabla=false;
				
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			MensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.mensajecorreoinven,new Object(),this.mensajecorreoinvenParameterGeneral,this.mensajecorreoinvenReturnGeneral);
			JComboBox jComboBoxGenerico=null;						
			
			if(evt.getSource().getClass().equals(JComboBox.class)
				|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
					
				jComboBoxGenerico=(JComboBox)evt.getSource();
				
				containerParent=jComboBoxGenerico.getParent();
				
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
			}
			
			String sFinalQueryCombo="";
			
			


			
			MensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mensajecorreoinven,new Object(),this.mensajecorreoinvenParameterGeneral,this.mensajecorreoinvenReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMensajeCorreoInvenActual();
			
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
			
			
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				Container containerParent=null;
				Component componentOpposite=null;
				Boolean esControlTabla=false;
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				JComboBox jComboBoxGenerico=null;						
				
				if(evt.getSource().getClass().equals(JComboBox.class)
					|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
						
					jComboBoxGenerico=(JComboBox)evt.getSource();
					
					containerParent=jComboBoxGenerico.getParent();
					
					componentOpposite=null;//evt.getOppositeComponent();
					
					if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
					) {					
						esControlTabla=true;
					}		
					
					this.esControlTabla=esControlTabla;
				}
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.mensajecorreoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.mensajecorreoinven);
				
				MensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.mensajecorreoinven,new Object(),this.mensajecorreoinvenParameterGeneral,this.mensajecorreoinvenReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				MensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mensajecorreoinven,new Object(),this.mensajecorreoinvenParameterGeneral,this.mensajecorreoinvenReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MensajeCorreoInven.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MensajeCorreoInven.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//@SuppressWarnings("rawtypes")
	public void jComboBoxFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		//MANEJADO EN ITEMLISTENER
		/*
		try {
			if(this.permiteManejarEventosControl()) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				
				//if(this.esUsoDesdeHijo) {
				//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				//}
				
				
				Container containerParent=null;
				Component componentOpposite=null;
				Boolean esControlTabla=false;
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.mensajecorreoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.mensajecorreoinven);
				
				MensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.mensajecorreoinven,new Object(),this.mensajecorreoinvenParameterGeneral,this.mensajecorreoinvenReturnGeneral);
				JComboBox jComboBoxGenerico=null;						
				
				if(evt.getSource().getClass().equals(JComboBox.class)
					|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
						
					jComboBoxGenerico=(JComboBox)evt.getSource();
					
					containerParent=jComboBoxGenerico.getParent();
					
					componentOpposite=evt.getOppositeComponent();
					
					if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
					) {					
						esControlTabla=true;
					}
					
					this.esControlTabla=esControlTabla;
				}
				
				String sFinalQueryCombo="";
				
				


				
				MensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mensajecorreoinven,new Object(),this.mensajecorreoinvenParameterGeneral,this.mensajecorreoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MensajeCorreoInven.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MensajeCorreoInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMensajeCorreoInvenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosMensajeCorreoInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mensajecorreoinvenAnterior =(MensajeCorreoInven) this.mensajecorreoinvenLogic.getMensajeCorreoInvens().toArray()[this.jTableDatosMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.mensajecorreoinvenAnterior =(MensajeCorreoInven) this.mensajecorreoinvens.toArray()[this.jTableDatosMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				MensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mensajecorreoinven,new Object(),this.mensajecorreoinvenParameterGeneral,this.mensajecorreoinvenReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarMensajeCorreoInven")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosMensajeCorreoInvenListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosMensajeCorreoInven.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.mensajecorreoinven =(MensajeCorreoInven) this.mensajecorreoinvenLogic.getMensajeCorreoInvens().toArray()[this.jTableDatosMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.mensajecorreoinven =(MensajeCorreoInven) this.mensajecorreoinvens.toArray()[this.jTableDatosMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.mensajecorreoinven);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarMensajeCorreoInven")) {
				
				}
				
				MensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mensajecorreoinven,new Object(),this.mensajecorreoinvenParameterGeneral,this.mensajecorreoinvenReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			MensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.mensajecorreoinven,new Object(),this.mensajecorreoinvenParameterGeneral,this.mensajecorreoinvenReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarMensajeCorreoInven")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosMensajeCorreoInven.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarMensajeCorreoInven")) {
			
			}
			
			MensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.mensajecorreoinven,new Object(),this.mensajecorreoinvenParameterGeneral,this.mensajecorreoinvenReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessMensajeCorreoInven();
			
			MensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.mensajecorreoinven,new Object(),this.mensajecorreoinvenParameterGeneral,this.mensajecorreoinvenReturnGeneral);
			
			if(sTipo.equals("NuevoMensajeCorreoInven")) {
				jButtonNuevoMensajeCorreoInvenActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarMensajeCorreoInven")) {
				jButtonDuplicarMensajeCorreoInvenActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarMensajeCorreoInven")) {
				jButtonCopiarMensajeCorreoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormMensajeCorreoInven")) {
				jButtonVerFormMensajeCorreoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesMensajeCorreoInven")) {
				jButtonNuevoMensajeCorreoInvenActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarMensajeCorreoInven")) {
				jButtonModificarMensajeCorreoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarMensajeCorreoInven")) {
				jButtonActualizarMensajeCorreoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarMensajeCorreoInven")) {
				jButtonEliminarMensajeCorreoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaMensajeCorreoInven")) {
				jButtonGuardarCambiosMensajeCorreoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarMensajeCorreoInven")) {
				jButtonCancelarMensajeCorreoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarMensajeCorreoInven")) {
				jButtonCerrarMensajeCorreoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosMensajeCorreoInven")) {
				jButtonGuardarCambiosMensajeCorreoInvenActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosMensajeCorreoInven")) {
				jButtonNuevoGuardarCambiosMensajeCorreoInvenActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByMensajeCorreoInven")) {
				jButtonAbrirOrderByMensajeCorreoInvenActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionMensajeCorreoInven")) {
				jButtonRecargarInformacionMensajeCorreoInvenActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresMensajeCorreoInven")) {
				jButtonAnterioresMensajeCorreoInvenActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesMensajeCorreoInven")) {
				jButtonSiguientesMensajeCorreoInvenActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idMensajeCorreoInvenBusqueda")) {
				this.jButtonidMensajeCorreoInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaMensajeCorreoInvenUpdate")) {
				this.jButtonid_empresaMensajeCorreoInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaMensajeCorreoInvenBusqueda")) {
				this.jButtonid_empresaMensajeCorreoInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalMensajeCorreoInvenUpdate")) {
				this.jButtonid_sucursalMensajeCorreoInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalMensajeCorreoInvenBusqueda")) {
				this.jButtonid_sucursalMensajeCorreoInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_moduloMensajeCorreoInvenUpdate")) {
				this.jButtonid_moduloMensajeCorreoInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_moduloMensajeCorreoInvenBusqueda")) {
				this.jButtonid_moduloMensajeCorreoInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_mensaje_correo_invenMensajeCorreoInvenUpdate")) {
				this.jButtonid_tipo_mensaje_correo_invenMensajeCorreoInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_mensaje_correo_invenMensajeCorreoInvenBusqueda")) {
				this.jButtonid_tipo_mensaje_correo_invenMensajeCorreoInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("temaMensajeCorreoInvenBusqueda")) {
				this.jButtontemaMensajeCorreoInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("mensajeMensajeCorreoInvenBusqueda")) {
				this.jButtonmensajeMensajeCorreoInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("avisoMensajeCorreoInvenBusqueda")) {
				this.jButtonavisoMensajeCorreoInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esta_activoMensajeCorreoInvenBusqueda")) {
				this.jButtonesta_activoMensajeCorreoInvenBusquedaActionPerformed(evt);
			}
			
			MensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.mensajecorreoinven,new Object(),this.mensajecorreoinvenParameterGeneral,this.mensajecorreoinvenReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessMensajeCorreoInven();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			MensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.mensajecorreoinven,new Object(),this.mensajecorreoinvenParameterGeneral,this.mensajecorreoinvenReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameMensajeCorreoInven")) {
				closingInternalFrameMensajeCorreoInven();
				
			} else if(sTipo.equals("jButtonCancelarMensajeCorreoInven")) {
				JInternalFrameBase jInternalFrameDetalleFormMensajeCorreoInven = (JInternalFrameBase)evt.getSource();
	            	
	            MensajeCorreoInvenBeanSwingJInternalFrame jInternalFrameParent=(MensajeCorreoInvenBeanSwingJInternalFrame)jInternalFrameDetalleFormMensajeCorreoInven.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarMensajeCorreoInvenActionPerformed(null);
			}
			
			MensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.mensajecorreoinven,new Object(),this.mensajecorreoinvenParameterGeneral,this.mensajecorreoinvenReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormMensajeCorreoInven(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormMensajeCorreoInven(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormMensajeCorreoInven(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.mensajecorreoinven)) {
			if(!esControlTabla) {
				if(MensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualMensajeCorreoInven(this.mensajecorreoinven,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysMensajeCorreoInven(this.mensajecorreoinven);			
				}
				
				if(this.mensajecorreoinvenSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualMensajeCorreoInven(this.mensajecorreoinven,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.mensajecorreoinvenReturnGeneral=mensajecorreoinvenLogic.procesarEventosMensajeCorreoInvensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.mensajecorreoinvenLogic.getMensajeCorreoInvens(),this.mensajecorreoinven,this.mensajecorreoinvenParameterGeneral,this.isEsNuevoMensajeCorreoInven,classes);//this.mensajecorreoinvenLogic.getMensajeCorreoInven()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanMensajeCorreoInven(this.mensajecorreoinvenReturnGeneral,this.mensajecorreoinvenBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.mensajecorreoinvenSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanMensajeCorreoInven(classes,this.mensajecorreoinvenReturnGeneral,this.mensajecorreoinvenBean,false);
					}
						
					if(this.mensajecorreoinvenReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyMensajeCorreoInven(this.mensajecorreoinvenReturnGeneral.getMensajeCorreoInven());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioMensajeCorreoInven(this.mensajecorreoinvenReturnGeneral.getMensajeCorreoInven());	
					}
						
					if(this.mensajecorreoinvenReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioMensajeCorreoInven(this.mensajecorreoinvenReturnGeneral.getMensajeCorreoInven(),classes);//this.mensajecorreoinvenBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioMensajeCorreoInven(this.mensajecorreoinven,classes);//this.mensajecorreoinvenBean);									
				}
			
				if(MensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualMensajeCorreoInven(this.mensajecorreoinven,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysMensajeCorreoInven(this.mensajecorreoinven);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.mensajecorreoinvenAnterior!=null) {
						this.mensajecorreoinven=this.mensajecorreoinvenAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.mensajecorreoinvenReturnGeneral=mensajecorreoinvenLogic.procesarEventosMensajeCorreoInvensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.mensajecorreoinvenLogic.getMensajeCorreoInvens(),this.mensajecorreoinven,this.mensajecorreoinvenParameterGeneral,this.isEsNuevoMensajeCorreoInven,classes);//this.mensajecorreoinvenLogic.getMensajeCorreoInven()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.mensajecorreoinvenSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.mensajecorreoinvenReturnGeneral.getMensajeCorreoInven(),mensajecorreoinvenLogic.getMensajeCorreoInvens());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.mensajecorreoinvenReturnGeneral.getMensajeCorreoInven(),this.mensajecorreoinvens);
				}
				//ARCHITECTURE
				
				//this.jTableDatosMensajeCorreoInven.repaint();
				
				//((AbstractTableModel) this.jTableDatosMensajeCorreoInven.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosMensajeCorreoInven();
			}
		}
	}
	
	public void actualizarVisualTableDatosMensajeCorreoInven() throws Exception {
		
		MensajeCorreoInvenModel mensajecorreoinvenModel=(MensajeCorreoInvenModel)this.jTableDatosMensajeCorreoInven.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			mensajecorreoinvenModel.mensajecorreoinvens=this.mensajecorreoinvenLogic.getMensajeCorreoInvens();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			mensajecorreoinvenModel.mensajecorreoinvens=this.mensajecorreoinvens;
		}
		
		
		((MensajeCorreoInvenModel) this.jTableDatosMensajeCorreoInven.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaMensajeCorreoInven() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getmensajecorreoinvenAnterior(),this.mensajecorreoinvenLogic.getMensajeCorreoInvens());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getmensajecorreoinvenAnterior(),this.mensajecorreoinvens);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosMensajeCorreoInven();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioMensajeCorreoInven(MensajeCorreoInven mensajecorreoinven,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleMensajeCorreoInven.class)) {
					this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFrame.detallemensajecorreoinvenLogic.setDetalleMensajeCorreoInvens(mensajecorreoinven.getDetalleMensajeCorreoInvens());
					this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleMensajeCorreoInven(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(MailMensajeCorreoInven.class)) {
					this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFrame.mailmensajecorreoinvenLogic.setMailMensajeCorreoInvens(mensajecorreoinven.getMailMensajeCorreoInvens());
					this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFrame.inicializarActualizarBindingTablaMailMensajeCorreoInven(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setEventoParentGeneral(Boolean esUsoDesdeHijo,String sDominio,String sDominioTipo,String sTipo,String sTipoGeneral,Boolean esControlTabla,Boolean conIrServidorAplicacion,
						Long id,Component control, EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,ArrayList<String> arrClasses,
						Object evt,GeneralEntityParameterReturnGeneral generalEntityParameterGeneral,Object otro) { 	  
		try {
			
			if(this.permiteManejarEventosControl()) {
				
				//BASE COPIADO DESDE TEXTFIELLOSTFOCUS
				
				//EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				Boolean conTodasRelaciones=false;
				
				this.esUsoDesdeHijo=esUsoDesdeHijo;
										
				MensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.mensajecorreoinven,new Object(),generalEntityParameterGeneral,this.mensajecorreoinvenReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.mensajecorreoinvenSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=MensajeCorreoInvenConstantesFunciones.getClassesRelationshipsOfMensajeCorreoInven(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=MensajeCorreoInvenConstantesFunciones.getClassesRelationshipsFromStringsOfMensajeCorreoInven(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormMensajeCorreoInven(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				MensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.mensajecorreoinven,new Object(),generalEntityParameterGeneral,this.mensajecorreoinvenReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioMensajeCorreoInven(MensajeCorreoInvenBean mensajecorreoinvenBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleMensajeCorreoInven.class)) {
					this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFrame.detallemensajecorreoinvenLogic.setDetalleMensajeCorreoInvens(mensajecorreoinven.getDetalleMensajeCorreoInvens());
					this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleMensajeCorreoInven(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(MailMensajeCorreoInven.class)) {
					this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFrame.mailmensajecorreoinvenLogic.setMailMensajeCorreoInvens(mensajecorreoinven.getMailMensajeCorreoInvens());
					this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFrame.inicializarActualizarBindingTablaMailMensajeCorreoInven(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanMensajeCorreoInven(ArrayList<Classe> classes,MensajeCorreoInvenReturnGeneral mensajecorreoinvenReturnGeneral,MensajeCorreoInvenBean mensajecorreoinvenBean,Boolean conDefault) throws Exception {
		
			this.mensajecorreoinvenBean.setDetalleMensajeCorreoInvens(mensajecorreoinvenReturnGeneral.getMensajeCorreoInven().getDetalleMensajeCorreoInvens());
			this.mensajecorreoinvenBean.setMailMensajeCorreoInvens(mensajecorreoinvenReturnGeneral.getMensajeCorreoInven().getMailMensajeCorreoInvens());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualMensajeCorreoInven(MensajeCorreoInven mensajecorreoinven,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleMensajeCorreoInven.class)) {
					mensajecorreoinven.setDetalleMensajeCorreoInvens(this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenBeanSwingJInternalFrame.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(MailMensajeCorreoInven.class)) {
					mensajecorreoinven.setMailMensajeCorreoInvens(this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenBeanSwingJInternalFrame.mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens());
					break;
				}
			}
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.mensajecorreoinven)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormMensajeCorreoInven = new MensajeCorreoInvenDetalleFormJInternalFrame(jDesktopPane,this.mensajecorreoinvenSessionBean.getConGuardarRelaciones(),this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormMensajeCorreoInven);
		this.jInternalFrameDetalleFormMensajeCorreoInven.setVisible(false);
		this.jInternalFrameDetalleFormMensajeCorreoInven.setSelected(false);						
		
		this.jInternalFrameDetalleFormMensajeCorreoInven.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormMensajeCorreoInven.mensajecorreoinvenLogic=this.mensajecorreoinvenLogic;
		
		this.cargarCombosFrameForeignKeyMensajeCorreoInven("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleMensajeCorreoInven();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleMensajeCorreoInven();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyMensajeCorreoInven("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyMensajeCorreoInven();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormMensajeCorreoInven.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarMensajeCorreoInven"));
		
		this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonModificarMensajeCorreoInven.addActionListener(new ButtonActionListener(this,"ModificarMensajeCorreoInven"));

		
		this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonModificarToolBarMensajeCorreoInven.addActionListener(new ButtonActionListener(this,"ModificarToolBarMensajeCorreoInven"));
					
		this.jInternalFrameDetalleFormMensajeCorreoInven.jMenuItemModificarMensajeCorreoInven.addActionListener(new ButtonActionListener(this,"MenuItemModificarMensajeCorreoInven"));		
		
		
		
		this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonActualizarMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"ActualizarMensajeCorreoInven"));
		
		
		this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonActualizarToolBarMensajeCorreoInven.addActionListener(new ButtonActionListener(this,"ActualizarToolBarMensajeCorreoInven"));
						
		this.jInternalFrameDetalleFormMensajeCorreoInven.jMenuItemActualizarMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemActualizarMensajeCorreoInven"));		
		
		
		
		this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonEliminarMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"EliminarMensajeCorreoInven"));
		
		
		this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonEliminarToolBarMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"EliminarToolBarMensajeCorreoInven"));
								
		this.jInternalFrameDetalleFormMensajeCorreoInven.jMenuItemEliminarMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemEliminarMensajeCorreoInven"));		
		
		
		
		this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonCancelarMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"CancelarMensajeCorreoInven"));
		
		
		this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonCancelarToolBarMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"CancelarToolBarMensajeCorreoInven"));
					
		this.jInternalFrameDetalleFormMensajeCorreoInven.jMenuItemCancelarMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemCancelarMensajeCorreoInven"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormMensajeCorreoInven.jMenuItemDetalleCerrarMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarMensajeCorreoInven"));		
		
		
		
		this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonGuardarCambiosToolBarMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarMensajeCorreoInven"));
		
		
		
		this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonGuardarCambiosToolBarMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarMensajeCorreoInven"));
		
		
		
		this.jInternalFrameDetalleFormMensajeCorreoInven.jComboBoxTiposAccionesFormularioMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioMensajeCorreoInven"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonidMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"idMensajeCorreoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonid_empresaMensajeCorreoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_empresaMensajeCorreoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonid_empresaMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaMensajeCorreoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonid_sucursalMensajeCorreoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalMensajeCorreoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonid_sucursalMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalMensajeCorreoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonid_moduloMensajeCorreoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_moduloMensajeCorreoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonid_moduloMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloMensajeCorreoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonid_tipo_mensaje_correo_invenMensajeCorreoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_mensaje_correo_invenMensajeCorreoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonid_tipo_mensaje_correo_invenMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_mensaje_correo_invenMensajeCorreoInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMensajeCorreoInven.jButtontemaMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"temaMensajeCorreoInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonmensajeMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"mensajeMensajeCorreoInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonavisoMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"avisoMensajeCorreoInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonesta_activoMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoMensajeCorreoInvenBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormMensajeCorreoInven.jTabbedPaneRelacionesMensajeCorreoInven.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesMensajeCorreoInven"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameMensajeCorreoInven"));
		
		if(this.jInternalFrameDetalleFormMensajeCorreoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMensajeCorreoInven.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarMensajeCorreoInven"));
		}
		
		this.jTableDatosMensajeCorreoInven.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarMensajeCorreoInven"));
		
		this.jTableDatosMensajeCorreoInven.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarMensajeCorreoInven"));
		
		this.jButtonNuevoMensajeCorreoInven.addActionListener(new ButtonActionListener(this,"NuevoMensajeCorreoInven"));
		
		this.jButtonDuplicarMensajeCorreoInven.addActionListener(new ButtonActionListener(this,"DuplicarMensajeCorreoInven"));
		
		this.jButtonCopiarMensajeCorreoInven.addActionListener(new ButtonActionListener(this,"CopiarMensajeCorreoInven"));
		
		this.jButtonVerFormMensajeCorreoInven.addActionListener(new ButtonActionListener(this,"VerFormMensajeCorreoInven"));
		
		
		this.jButtonNuevoToolBarMensajeCorreoInven.addActionListener(new ButtonActionListener(this,"NuevoToolBarMensajeCorreoInven"));
			
		this.jButtonDuplicarToolBarMensajeCorreoInven.addActionListener(new ButtonActionListener(this,"DuplicarToolBarMensajeCorreoInven"));
			
		this.jMenuItemNuevoMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemNuevoMensajeCorreoInven"));
			
		this.jMenuItemDuplicarMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarMensajeCorreoInven"));		
		
		
		this.jButtonNuevoRelacionesMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"NuevoRelacionesMensajeCorreoInven"));
		
		
		this.jButtonNuevoRelacionesToolBarMensajeCorreoInven.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarMensajeCorreoInven"));
			
		this.jMenuItemNuevoRelacionesMensajeCorreoInven.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesMensajeCorreoInven"));		
		
		
		if(this.jInternalFrameDetalleFormMensajeCorreoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonModificarMensajeCorreoInven.addActionListener(new ButtonActionListener(this,"ModificarMensajeCorreoInven"));
		}
		
		
		if(this.jInternalFrameDetalleFormMensajeCorreoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonModificarToolBarMensajeCorreoInven.addActionListener(new ButtonActionListener(this,"ModificarToolBarMensajeCorreoInven"));
			
			this.jInternalFrameDetalleFormMensajeCorreoInven.jMenuItemModificarMensajeCorreoInven.addActionListener(new ButtonActionListener(this,"MenuItemModificarMensajeCorreoInven"));		
		}
		
		
		if(this.jInternalFrameDetalleFormMensajeCorreoInven!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonActualizarMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"ActualizarMensajeCorreoInven"));
		}
		
		
		if(this.jInternalFrameDetalleFormMensajeCorreoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonActualizarToolBarMensajeCorreoInven.addActionListener(new ButtonActionListener(this,"ActualizarToolBarMensajeCorreoInven"));
				
			this.jInternalFrameDetalleFormMensajeCorreoInven.jMenuItemActualizarMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemActualizarMensajeCorreoInven"));		
		}
		
		
		if(this.jInternalFrameDetalleFormMensajeCorreoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonEliminarMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"EliminarMensajeCorreoInven"));
		}
		
		
		if(this.jInternalFrameDetalleFormMensajeCorreoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonEliminarToolBarMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"EliminarToolBarMensajeCorreoInven"));
						
			this.jInternalFrameDetalleFormMensajeCorreoInven.jMenuItemEliminarMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemEliminarMensajeCorreoInven"));		
		}
		
		
		if(this.jInternalFrameDetalleFormMensajeCorreoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonCancelarMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"CancelarMensajeCorreoInven"));
		}
		
		
		if(this.jInternalFrameDetalleFormMensajeCorreoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonCancelarToolBarMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"CancelarToolBarMensajeCorreoInven"));
			
			this.jInternalFrameDetalleFormMensajeCorreoInven.jMenuItemCancelarMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemCancelarMensajeCorreoInven"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarMensajeCorreoInven"));		
		
		
		this.jButtonCerrarMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"CerrarMensajeCorreoInven"));
		
		
		this.jButtonCerrarToolBarMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"CerrarToolBarMensajeCorreoInven"));
			
		this.jMenuItemCerrarMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemCerrarMensajeCorreoInven"));
			
		if(this.jInternalFrameDetalleFormMensajeCorreoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMensajeCorreoInven.jMenuItemDetalleCerrarMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarMensajeCorreoInven"));		
		}
		
		
		if(this.jInternalFrameDetalleFormMensajeCorreoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonGuardarCambiosMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosMensajeCorreoInven"));
		}
		
		
		if(this.jInternalFrameDetalleFormMensajeCorreoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonGuardarCambiosToolBarMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarMensajeCorreoInven"));
		}
		
		this.jButtonCopiarToolBarMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"CopiarToolBarMensajeCorreoInven"));
			
		this.jButtonVerFormToolBarMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"VerFormToolBarMensajeCorreoInven"));
		
		this.jMenuItemGuardarCambiosMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosMensajeCorreoInven"));
			
		this.jMenuItemCopiarMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemCopiarMensajeCorreoInven"));		
		
		this.jMenuItemVerFormMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemVerFormMensajeCorreoInven"));		
		
		
		this.jButtonGuardarCambiosTablaMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaMensajeCorreoInven"));
		
		
		this.jButtonGuardarCambiosTablaToolBarMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarMensajeCorreoInven"));
			
		this.jMenuItemGuardarCambiosTablaMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaMensajeCorreoInven"));		
		
		
		
		this.jButtonRecargarInformacionMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"RecargarInformacionMensajeCorreoInven"));
					
		this.jButtonRecargarInformacionToolBarMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarMensajeCorreoInven"));
		
		this.jMenuItemRecargarInformacionMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionMensajeCorreoInven"));		
		
		
		
		this.jButtonAnterioresMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"AnterioresMensajeCorreoInven"));
		
		
		this.jButtonAnterioresToolBarMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"AnterioresToolBarMensajeCorreoInven"));
		
		this.jMenuItemAnterioresMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresMensajeCorreoInven"));		
		
		
		this.jButtonSiguientesMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"SiguientesMensajeCorreoInven"));
		
		
		this.jButtonSiguientesToolBarMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"SiguientesToolBarMensajeCorreoInven"));
			
		this.jMenuItemSiguientesMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesMensajeCorreoInven"));
			
		this.jMenuItemAbrirOrderByMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByMensajeCorreoInven"));
			
		this.jMenuItemMostrarOcultarMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarMensajeCorreoInven"));
			
		this.jMenuItemDetalleAbrirOrderByMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByMensajeCorreoInven"));
			
		this.jMenuItemDetalleMostarOcultarMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarMensajeCorreoInven"));		
		
		
		this.jButtonNuevoGuardarCambiosMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosMensajeCorreoInven"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarMensajeCorreoInven"));
			
		this.jMenuItemNuevoGuardarCambiosMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosMensajeCorreoInven"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosMensajeCorreoInven.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosMensajeCorreoInven"));

		this.jCheckBoxSeleccionadosMensajeCorreoInven.addItemListener(new CheckBoxItemListener(this,"SeleccionadosMensajeCorreoInven"));
		
		if(this.jInternalFrameDetalleFormMensajeCorreoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMensajeCorreoInven.jComboBoxTiposAccionesFormularioMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioMensajeCorreoInven"));
		}
		
		
		this.jComboBoxTiposRelacionesMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"TiposRelacionesMensajeCorreoInven"));
			
		this.jComboBoxTiposAccionesMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"TiposAccionesMensajeCorreoInven"));
					
		this.jComboBoxTiposSeleccionarMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"TiposSeleccionarMensajeCorreoInven"));
			
		this.jTextFieldValorCampoGeneralMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralMensajeCorreoInven"));		
		
		
		if(this.jInternalFrameDetalleFormMensajeCorreoInven!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonidMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"idMensajeCorreoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonid_empresaMensajeCorreoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_empresaMensajeCorreoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonid_empresaMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaMensajeCorreoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonid_sucursalMensajeCorreoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalMensajeCorreoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonid_sucursalMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalMensajeCorreoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonid_moduloMensajeCorreoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_moduloMensajeCorreoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonid_moduloMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloMensajeCorreoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonid_tipo_mensaje_correo_invenMensajeCorreoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_mensaje_correo_invenMensajeCorreoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonid_tipo_mensaje_correo_invenMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_mensaje_correo_invenMensajeCorreoInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMensajeCorreoInven.jButtontemaMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"temaMensajeCorreoInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonmensajeMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"mensajeMensajeCorreoInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonavisoMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"avisoMensajeCorreoInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonesta_activoMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoMensajeCorreoInvenBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdTipoMensajeCorreoInvenMensajeCorreoInven.addActionListener(new ButtonActionListener(this,"FK_IdTipoMensajeCorreoInvenMensajeCorreoInven"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoMensajeCorreoInven!=null) {
				this.jInternalFrameReporteDinamicoMensajeCorreoInven.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoMensajeCorreoInven"));
				this.jInternalFrameReporteDinamicoMensajeCorreoInven.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoMensajeCorreoInven"));
				this.jInternalFrameReporteDinamicoMensajeCorreoInven.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoMensajeCorreoInven"));
			}
			
			//this.jButtonCerrarReporteDinamicoMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoMensajeCorreoInven"));				
			//this.jButtonGenerarReporteDinamicoMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoMensajeCorreoInven"));
			//this.jButtonGenerarExcelReporteDinamicoMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoMensajeCorreoInven"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionMensajeCorreoInven!=null) {
				this.jInternalFrameImportacionMensajeCorreoInven.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionMensajeCorreoInven"));
				this.jInternalFrameImportacionMensajeCorreoInven.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionMensajeCorreoInven"));
				this.jInternalFrameImportacionMensajeCorreoInven.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionMensajeCorreoInven"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"AbrirOrderByMensajeCorreoInven"));
			
			this.jButtonAbrirOrderByToolBarMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarMensajeCorreoInven"));			
			
			if(this.jInternalFrameOrderByMensajeCorreoInven!=null) {
				this.jInternalFrameOrderByMensajeCorreoInven.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByMensajeCorreoInven"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormMensajeCorreoInven!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormMensajeCorreoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMensajeCorreoInven.jTabbedPaneRelacionesMensajeCorreoInven.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesMensajeCorreoInven"));
		
		;
		}
		//TABBED PANE RELACIONES FIN(EXTRA TAB)		
	}
	
	/*
	public void initActions() {
		String sMapKey = "";
		InputMap inputMap =null;
		
		this.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
            public void internalFrameClosing(InternalFrameEvent event) {          	
            	try {
            		closingInternalFrameMensajeCorreoInven();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormMensajeCorreoInven.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormMensajeCorreoInven = (JInternalFrameBase)event.getSource();
	            	
	            MensajeCorreoInvenBeanSwingJInternalFrame jInternalFrameParent=(MensajeCorreoInvenBeanSwingJInternalFrame)jInternalFrameDetalleFormMensajeCorreoInven.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarMensajeCorreoInvenActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosMensajeCorreoInven.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosMensajeCorreoInvenListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosMensajeCorreoInven.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosMensajeCorreoInven.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMensajeCorreoInvenActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMensajeCorreoInvenActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMensajeCorreoInvenActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoMensajeCorreoInven";
		inputMap = this.jButtonNuevoMensajeCorreoInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoMensajeCorreoInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoMensajeCorreoInvenActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMensajeCorreoInvenActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMensajeCorreoInvenActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMensajeCorreoInvenActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesMensajeCorreoInven";
		inputMap = this.jButtonNuevoRelacionesMensajeCorreoInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesMensajeCorreoInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoMensajeCorreoInvenActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarMensajeCorreoInven";
		inputMap = this.jButtonModificarMensajeCorreoInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarMensajeCorreoInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarMensajeCorreoInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarMensajeCorreoInven";
		inputMap = this.jButtonActualizarMensajeCorreoInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarMensajeCorreoInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarMensajeCorreoInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarMensajeCorreoInven";
		inputMap = this.jButtonEliminarMensajeCorreoInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarMensajeCorreoInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarMensajeCorreoInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarMensajeCorreoInven";
		inputMap = this.jButtonCancelarMensajeCorreoInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarMensajeCorreoInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarMensajeCorreoInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarMensajeCorreoInven";
		inputMap = this.jButtonCerrarMensajeCorreoInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarMensajeCorreoInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarMensajeCorreoInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonGuardarCambiosMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosMensajeCorreoInven";
		inputMap = this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonGuardarCambiosMensajeCorreoInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonGuardarCambiosMensajeCorreoInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosMensajeCorreoInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosMensajeCorreoInven.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosMensajeCorreoInvenItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesMensajeCorreoInven.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesMensajeCorreoInvenActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarMensajeCorreoInven.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarMensajeCorreoInvenActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralMensajeCorreoInven.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralMensajeCorreoInvenActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonidMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"idMensajeCorreoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonid_empresaMensajeCorreoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_empresaMensajeCorreoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonid_empresaMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaMensajeCorreoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonid_sucursalMensajeCorreoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalMensajeCorreoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonid_sucursalMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalMensajeCorreoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonid_moduloMensajeCorreoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_moduloMensajeCorreoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonid_moduloMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloMensajeCorreoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonid_tipo_mensaje_correo_invenMensajeCorreoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_mensaje_correo_invenMensajeCorreoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonid_tipo_mensaje_correo_invenMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_mensaje_correo_invenMensajeCorreoInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMensajeCorreoInven.jButtontemaMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"temaMensajeCorreoInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonmensajeMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"mensajeMensajeCorreoInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonavisoMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"avisoMensajeCorreoInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMensajeCorreoInven.jButtonesta_activoMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoMensajeCorreoInvenBusqueda"));
		
		
		this.jButtonFK_IdTipoMensajeCorreoInvenMensajeCorreoInven.addActionListener(new ButtonActionListener(this,"FK_IdTipoMensajeCorreoInvenMensajeCorreoInven"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarMensajeCorreoInvenActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarMensajeCorreoInven.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosMensajeCorreoInven(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(MensajeCorreoInven mensajecorreoinvenAux:this.mensajecorreoinvenLogic.getMensajeCorreoInvens()) {
					mensajecorreoinvenAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(MensajeCorreoInven mensajecorreoinvenAux:mensajecorreoinvens) {
					mensajecorreoinvenAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosMensajeCorreoInvenItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingMensajeCorreoInven(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(MensajeCorreoInven mensajecorreoinvenAux:this.mensajecorreoinvenLogic.getMensajeCorreoInvens()) {
						mensajecorreoinvenAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(MensajeCorreoInven mensajecorreoinvenAux:mensajecorreoinvens) {
						mensajecorreoinvenAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(MensajeCorreoInven mensajecorreoinvenAux:this.mensajecorreoinvenLogic.getMensajeCorreoInvens()) {
					
						if(sTipoSeleccionar.equals(MensajeCorreoInvenConstantesFunciones.LABEL_ESTAACTIVO)) {
							existe=true;
							mensajecorreoinvenAux.setesta_activo(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(MensajeCorreoInven mensajecorreoinvenAux:mensajecorreoinvens) {
						
						if(sTipoSeleccionar.equals(MensajeCorreoInvenConstantesFunciones.LABEL_ESTAACTIVO)) {
							existe=true;
							mensajecorreoinvenAux.setesta_activo(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaMensajeCorreoInven(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosMensajeCorreoInven.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosMensajeCorreoInven.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosMensajeCorreoInven,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosMensajeCorreoInvenItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingMensajeCorreoInven(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosMensajeCorreoInven.getSelectedRows();
			
			MensajeCorreoInven mensajecorreoinvenLocal=new MensajeCorreoInven();
			
			//this.seleccionarTodosMensajeCorreoInven(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					mensajecorreoinvenLocal =(MensajeCorreoInven) this.mensajecorreoinvenLogic.getMensajeCorreoInvens().toArray()[this.jTableDatosMensajeCorreoInven.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					mensajecorreoinvenLocal =(MensajeCorreoInven) this.mensajecorreoinvens.toArray()[this.jTableDatosMensajeCorreoInven.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				mensajecorreoinvenLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(MensajeCorreoInven mensajecorreoinvenAux:this.mensajecorreoinvenLogic.getMensajeCorreoInvens()) {
						mensajecorreoinvenAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(MensajeCorreoInven mensajecorreoinvenAux:mensajecorreoinvens) {
						mensajecorreoinvenAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaMensajeCorreoInven(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosMensajeCorreoInven.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosMensajeCorreoInven.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosMensajeCorreoInven,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualMensajeCorreoInvenItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarMensajeCorreoInvenParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralMensajeCorreoInvenActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingMensajeCorreoInven(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralMensajeCorreoInven.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(MensajeCorreoInven mensajecorreoinvenAux:this.mensajecorreoinvenLogic.getMensajeCorreoInvens()) {
				
						if(sTipoSeleccionar.equals(MensajeCorreoInvenConstantesFunciones.LABEL_TEMA)) {
							existe=true;
							mensajecorreoinvenAux.settema(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MensajeCorreoInvenConstantesFunciones.LABEL_MENSAJE)) {
							existe=true;
							mensajecorreoinvenAux.setmensaje(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MensajeCorreoInvenConstantesFunciones.LABEL_AVISO)) {
							existe=true;
							mensajecorreoinvenAux.setaviso(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(MensajeCorreoInven mensajecorreoinvenAux:mensajecorreoinvens) {
					
						if(sTipoSeleccionar.equals(MensajeCorreoInvenConstantesFunciones.LABEL_TEMA)) {
							existe=true;
							mensajecorreoinvenAux.settema(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MensajeCorreoInvenConstantesFunciones.LABEL_MENSAJE)) {
							existe=true;
							mensajecorreoinvenAux.setmensaje(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MensajeCorreoInvenConstantesFunciones.LABEL_AVISO)) {
							existe=true;
							mensajecorreoinvenAux.setaviso(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaMensajeCorreoInven(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesMensajeCorreoInvenActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingMensajeCorreoInven(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioMensajeCorreoInven=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesMensajeCorreoInven.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormMensajeCorreoInven.jComboBoxTiposAccionesFormularioMensajeCorreoInven.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteMensajeCorreoInven) {				
					conSplash=true;//false;										
					
					//this.startProcessMensajeCorreoInven(conSplash);
				
					this.generarReporteMensajeCorreoInvensSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesMensajeCorreoInven.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormMensajeCorreoInven.jComboBoxTiposAccionesFormularioMensajeCorreoInven.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoMensajeCorreoInvensSeleccionados();
				//this.jComboBoxTiposAccionesMensajeCorreoInven.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoMensajeCorreoInvensSeleccionados(false);
				//this.jComboBoxTiposAccionesMensajeCorreoInven.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoMensajeCorreoInvensSeleccionados(true);
				//this.jComboBoxTiposAccionesMensajeCorreoInven.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessMensajeCorreoInven();
				
				this.exportarMensajeCorreoInvensSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesMensajeCorreoInven.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormMensajeCorreoInven.jComboBoxTiposAccionesFormularioMensajeCorreoInven.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionMensajeCorreoInvens();
				//this.importarMensajeCorreoInvens();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesMensajeCorreoInven.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormMensajeCorreoInven.jComboBoxTiposAccionesFormularioMensajeCorreoInven.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessMensajeCorreoInven();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelMensajeCorreoInvensSeleccionados();
				//this.jComboBoxTiposAccionesMensajeCorreoInven.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Mensaje Correo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessMensajeCorreoInven();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoMensajeCorreoInven)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyMensajeCorreoInven(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Mensaje Correo",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesMensajeCorreoInven.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormMensajeCorreoInven.jComboBoxTiposAccionesFormularioMensajeCorreoInven.setSelectedIndex(0);					
				}	
			} 			
			else if(MensajeCorreoInvenBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteMensajeCorreoInven) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessMensajeCorreoInven(conSplash);
					
						//this.actualizarParametrosGeneralMensajeCorreoInven();
						
						this.generarReporteProcesoAccionMensajeCorreoInvensSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesMensajeCorreoInven.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormMensajeCorreoInven.jComboBoxTiposAccionesFormularioMensajeCorreoInven.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(MensajeCorreoInvenBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Mensaje CorreoES SELECCIONADOS?", "MANTENIMIENTO DE Mensaje Correo", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessMensajeCorreoInven();
				
						this.actualizarParametrosGeneralMensajeCorreoInven();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.mensajecorreoinvenReturnGeneral=mensajecorreoinvenLogic.procesarAccionMensajeCorreoInvensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.mensajecorreoinvenLogic.getMensajeCorreoInvens(),this.mensajecorreoinvenParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarMensajeCorreoInvenReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesMensajeCorreoInven.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormMensajeCorreoInven.jComboBoxTiposAccionesFormularioMensajeCorreoInven.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralMensajeCorreoInven();
					
					MensajeCorreoInvenBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarMensajeCorreoInvenReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesMensajeCorreoInven.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormMensajeCorreoInven.jComboBoxTiposAccionesFormularioMensajeCorreoInven.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessMensajeCorreoInven(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesMensajeCorreoInvenActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessMensajeCorreoInven();
			
			if(this.jInternalFrameDetalleFormMensajeCorreoInven==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<MensajeCorreoInven> mensajecorreoinvensSeleccionados=new ArrayList<MensajeCorreoInven>();		
			MensajeCorreoInven mensajecorreoinven=new MensajeCorreoInven();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingMensajeCorreoInven(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesMensajeCorreoInven.getSelectedItem();
			
			
			
			
			mensajecorreoinvensSeleccionados=this.getMensajeCorreoInvensSeleccionados(true);
			//this.sTipoAccion;
			
			if(mensajecorreoinvensSeleccionados.size()==1) {
				for(MensajeCorreoInven mensajecorreoinvenAux:mensajecorreoinvensSeleccionados) {
					mensajecorreoinven=mensajecorreoinvenAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Detalle Mensaje Correo Inven")) {
					jButtonDetalleMensajeCorreoInvenActionPerformed(null,rowIndex,true,false,mensajecorreoinven);
				}
				else if(this.sTipoRelacion.equals("Mail Mensaje Correo Inven")) {
					jButtonMailMensajeCorreoInvenActionPerformed(null,rowIndex,true,false,mensajecorreoinven);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessMensajeCorreoInven();
			
      		//this.finishProcessMensajeCorreoInven(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarMensajeCorreoInvenReturnGeneral() throws Exception {
		if(this.mensajecorreoinvenReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.mensajecorreoinvenReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.mensajecorreoinvenReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.mensajecorreoinvenReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.mensajecorreoinvenReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.mensajecorreoinvenReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingMensajeCorreoInven(false);
		}
		
		if(this.mensajecorreoinvenReturnGeneral.getConRetornoLista() || this.mensajecorreoinvenReturnGeneral.getConRetornoObjeto()) {
			if(this.mensajecorreoinvenReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.mensajecorreoinvenLogic.setMensajeCorreoInvens(this.mensajecorreoinvenReturnGeneral.getMensajeCorreoInvens());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.mensajecorreoinvenReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.mensajecorreoinvenLogic.setMensajeCorreoInven(this.mensajecorreoinvenReturnGeneral.getMensajeCorreoInven());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingMensajeCorreoInven(false);
		}
	}
	
	public void actualizarParametrosGeneralMensajeCorreoInven() throws Exception {
		
		
	}
	
	public ArrayList<MensajeCorreoInven> getMensajeCorreoInvensSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<MensajeCorreoInven> mensajecorreoinvensSeleccionados=new ArrayList<MensajeCorreoInven>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioMensajeCorreoInven) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(MensajeCorreoInven mensajecorreoinvenAux:mensajecorreoinvenLogic.getMensajeCorreoInvens()) {
					if(mensajecorreoinvenAux.getIsSelected()) {
						mensajecorreoinvensSeleccionados.add(mensajecorreoinvenAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(MensajeCorreoInven mensajecorreoinvenAux:this.mensajecorreoinvens) {
					if(mensajecorreoinvenAux.getIsSelected()) {
						mensajecorreoinvensSeleccionados.add(mensajecorreoinvenAux);				
					}
				}
			}
			
			if(mensajecorreoinvensSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						mensajecorreoinvensSeleccionados.addAll(this.mensajecorreoinvenLogic.getMensajeCorreoInvens());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						mensajecorreoinvensSeleccionados.addAll(this.mensajecorreoinvens);				
					}
				}
			}
		} else {
			mensajecorreoinvensSeleccionados.add(this.mensajecorreoinven);
		}
		
		return mensajecorreoinvensSeleccionados;
	}
	
	public void actualizarVariablesTipoReporte(Boolean esReporteNormal,Boolean esReporteDinamico,Boolean esReporteAccionProceso,String sPath) {
		if(esReporteNormal) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=false;
			this.sPathReporteDinamico="";
			this.esReporteAccionProceso=false;
			
		} else if(esReporteAccionProceso) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=false;
			this.sPathReporteDinamico="";
			this.esReporteAccionProceso=true;
			
		} else if(esReporteDinamico) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=true;
			this.esReporteAccionProceso=false;
			this.sPathReporteDinamico=sPath.replace(".jrxml",".jasper");			
		}
	}
	
	public void generarReporteMensajeCorreoInvensSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalMensajeCorreoInvensSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoMensajeCorreoInvensSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoMensajeCorreoInvensSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoMensajeCorreoInvensSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesMensajeCorreoInvensSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Mensaje Correo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesMensajeCorreoInvensSeleccionados() throws Exception {
		ArrayList<MensajeCorreoInven> mensajecorreoinvensSeleccionados=new ArrayList<MensajeCorreoInven>();		
		
		mensajecorreoinvensSeleccionados=this.getMensajeCorreoInvensSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteMensajeCorreoInvens("Todos",mensajecorreoinvensSeleccionados);
		
	}	
	
	public void generarReporteNormalMensajeCorreoInvensSeleccionados() throws Exception {
		ArrayList<MensajeCorreoInven> mensajecorreoinvensSeleccionados=new ArrayList<MensajeCorreoInven>();		
		
		mensajecorreoinvensSeleccionados=this.getMensajeCorreoInvensSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteMensajeCorreoInvens("Todos",mensajecorreoinvensSeleccionados);
	}		
	
	public void generarReporteProcesoAccionMensajeCorreoInvensSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<MensajeCorreoInven> mensajecorreoinvensSeleccionados=new ArrayList<MensajeCorreoInven>();
		
		mensajecorreoinvensSeleccionados=this.getMensajeCorreoInvensSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteMensajeCorreoInvens("Todos",mensajecorreoinvensSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoMensajeCorreoInvensSeleccionados() throws Exception {
		ArrayList<MensajeCorreoInven> mensajecorreoinvensSeleccionados=new ArrayList<MensajeCorreoInven>();		
		
		
		this.abrirInicializarFrameReporteDinamicoMensajeCorreoInven();
		
		
		mensajecorreoinvensSeleccionados=this.getMensajeCorreoInvensSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoMensajeCorreoInven();
		
		
		//this.generarReporteMensajeCorreoInvens("Todos",mensajecorreoinvensSeleccionados ,mensajecorreoinvenImplementable,mensajecorreoinvenImplementableHome);
	}
	
	public void mostrarImportacionMensajeCorreoInvens() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionMensajeCorreoInven();
		
		this.abrirFrameImportacionMensajeCorreoInven();		
		
			
		//this.generarReporteMensajeCorreoInvens("Todos",mensajecorreoinvensSeleccionados ,mensajecorreoinvenImplementable,mensajecorreoinvenImplementableHome);
	}
	
	public void importarMensajeCorreoInvens() throws Exception {		
	
	}
	
	public void exportarMensajeCorreoInvensSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelMensajeCorreoInvensSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoMensajeCorreoInvensSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlMensajeCorreoInvensSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Mensaje Correo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoMensajeCorreoInvensSeleccionados() throws Exception {
		ArrayList<MensajeCorreoInven> mensajecorreoinvensSeleccionados=new ArrayList<MensajeCorreoInven>();		
		
		mensajecorreoinvensSeleccionados=this.getMensajeCorreoInvensSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"mensajecorreoinven."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarMensajeCorreoInven(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(MensajeCorreoInven mensajecorreoinvenAux:mensajecorreoinvensSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarMensajeCorreoInven(mensajecorreoinvenAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//mensajecorreoinvenAux.setsDetalleGeneralEntityReporte(mensajecorreoinvenAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Mensaje Correo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarMensajeCorreoInven(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=MensajeCorreoInvenConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MensajeCorreoInvenConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MensajeCorreoInvenConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MensajeCorreoInvenConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MensajeCorreoInvenConstantesFunciones.LABEL_IDMODULO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MensajeCorreoInvenConstantesFunciones.LABEL_IDTIPOMENSAJECORREOINVEN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MensajeCorreoInvenConstantesFunciones.LABEL_TEMA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MensajeCorreoInvenConstantesFunciones.LABEL_MENSAJE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MensajeCorreoInvenConstantesFunciones.LABEL_AVISO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MensajeCorreoInvenConstantesFunciones.LABEL_ESTAACTIVO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarMensajeCorreoInven(MensajeCorreoInven mensajecorreoinven,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=mensajecorreoinven.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=mensajecorreoinven.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=mensajecorreoinven.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=mensajecorreoinven.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=mensajecorreoinven.getmodulo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=mensajecorreoinven.gettipomensajecorreoinven_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=mensajecorreoinven.gettema();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=mensajecorreoinven.getmensaje();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=mensajecorreoinven.getaviso();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=mensajecorreoinven.getesta_activo().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelMensajeCorreoInvensSeleccionados() throws Exception {
		ArrayList<MensajeCorreoInven> mensajecorreoinvensSeleccionados=new ArrayList<MensajeCorreoInven>();		
		
		mensajecorreoinvensSeleccionados=this.getMensajeCorreoInvensSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"mensajecorreoinven.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("MensajeCorreoInvens");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelMensajeCorreoInven(row);				
				iRow++;
			}				
			
			for(MensajeCorreoInven mensajecorreoinvenAux:mensajecorreoinvensSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelMensajeCorreoInven(mensajecorreoinvenAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Mensaje Correo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlMensajeCorreoInvensSeleccionados() throws Exception {
		ArrayList<MensajeCorreoInven> mensajecorreoinvensSeleccionados=new ArrayList<MensajeCorreoInven>();		
		
		mensajecorreoinvensSeleccionados=this.getMensajeCorreoInvensSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"mensajecorreoinven.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("mensajecorreoinvens");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("mensajecorreoinven");
			//elementRoot.appendChild(element);
		
			for(MensajeCorreoInven mensajecorreoinvenAux:mensajecorreoinvensSeleccionados) {
				element = document.createElement("mensajecorreoinven");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlMensajeCorreoInven(mensajecorreoinvenAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Mensaje Correo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelMensajeCorreoInven(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(MensajeCorreoInvenConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(MensajeCorreoInvenConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(MensajeCorreoInvenConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(MensajeCorreoInvenConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(MensajeCorreoInvenConstantesFunciones.LABEL_IDMODULO);
		cell = row.createCell(iColumn++);cell.setCellValue(MensajeCorreoInvenConstantesFunciones.LABEL_IDTIPOMENSAJECORREOINVEN);
		cell = row.createCell(iColumn++);cell.setCellValue(MensajeCorreoInvenConstantesFunciones.LABEL_TEMA);
		cell = row.createCell(iColumn++);cell.setCellValue(MensajeCorreoInvenConstantesFunciones.LABEL_MENSAJE);
		cell = row.createCell(iColumn++);cell.setCellValue(MensajeCorreoInvenConstantesFunciones.LABEL_AVISO);
		cell = row.createCell(iColumn++);cell.setCellValue(MensajeCorreoInvenConstantesFunciones.LABEL_ESTAACTIVO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelMensajeCorreoInven(MensajeCorreoInven mensajecorreoinven,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(mensajecorreoinven.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(mensajecorreoinven.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(mensajecorreoinven.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(mensajecorreoinven.getmodulo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(mensajecorreoinven.gettipomensajecorreoinven_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(mensajecorreoinven.gettema());
		cell = row.createCell(iColumn++);cell.setCellValue(mensajecorreoinven.getmensaje());
		cell = row.createCell(iColumn++);cell.setCellValue(mensajecorreoinven.getaviso());
		cell = row.createCell(iColumn++);cell.setCellValue(mensajecorreoinven.getesta_activo());				
	}
	
	public void setFilaDatosExportarXmlMensajeCorreoInven(MensajeCorreoInven mensajecorreoinven,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(MensajeCorreoInvenConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(mensajecorreoinven.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(MensajeCorreoInvenConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(mensajecorreoinven.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(MensajeCorreoInvenConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(mensajecorreoinven.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(MensajeCorreoInvenConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(mensajecorreoinven.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementmodulo_descripcion = document.createElement(MensajeCorreoInvenConstantesFunciones.IDMODULO);
		elementmodulo_descripcion.appendChild(document.createTextNode(mensajecorreoinven.getmodulo_descripcion()));
		element.appendChild(elementmodulo_descripcion);

		Element elementtipomensajecorreoinven_descripcion = document.createElement(MensajeCorreoInvenConstantesFunciones.IDTIPOMENSAJECORREOINVEN);
		elementtipomensajecorreoinven_descripcion.appendChild(document.createTextNode(mensajecorreoinven.gettipomensajecorreoinven_descripcion()));
		element.appendChild(elementtipomensajecorreoinven_descripcion);

		Element elementtema = document.createElement(MensajeCorreoInvenConstantesFunciones.TEMA);
		elementtema.appendChild(document.createTextNode(mensajecorreoinven.gettema().trim()));
		element.appendChild(elementtema);

		Element elementmensaje = document.createElement(MensajeCorreoInvenConstantesFunciones.MENSAJE);
		elementmensaje.appendChild(document.createTextNode(mensajecorreoinven.getmensaje().trim()));
		element.appendChild(elementmensaje);

		Element elementaviso = document.createElement(MensajeCorreoInvenConstantesFunciones.AVISO);
		elementaviso.appendChild(document.createTextNode(mensajecorreoinven.getaviso().trim()));
		element.appendChild(elementaviso);

		Element elementesta_activo = document.createElement(MensajeCorreoInvenConstantesFunciones.ESTAACTIVO);
		elementesta_activo.appendChild(document.createTextNode(mensajecorreoinven.getesta_activo().toString().trim()));
		element.appendChild(elementesta_activo);
	}
	
	public void generarReporteGroupGenericoMensajeCorreoInvensSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<MensajeCorreoInven> mensajecorreoinvensSeleccionados=new ArrayList<MensajeCorreoInven>();
		
		mensajecorreoinvensSeleccionados=this.getMensajeCorreoInvensSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		if(!soloTotales) {
			this.sTipoReporteExtra=Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO;
		} else {
			this.sTipoReporteExtra=Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO;
		}
		
		this.setColumnaDescripcionReporteGroupGenericoMensajeCorreoInven(mensajecorreoinvensSeleccionados);
		
		this.generarReporteMensajeCorreoInvens("Todos",mensajecorreoinvensSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoMensajeCorreoInven(ArrayList<MensajeCorreoInven> mensajecorreoinvensSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(MensajeCorreoInven mensajecorreoinvenAux:mensajecorreoinvensSeleccionados) {
				mensajecorreoinvenAux.setsDetalleGeneralEntityReporte(mensajecorreoinvenAux.toString());
			
				if(sTipoSeleccionar.equals(MensajeCorreoInvenConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					mensajecorreoinvenAux.setsDescripcionGeneralEntityReporte1(mensajecorreoinvenAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(MensajeCorreoInvenConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					mensajecorreoinvenAux.setsDescripcionGeneralEntityReporte1(mensajecorreoinvenAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(MensajeCorreoInvenConstantesFunciones.LABEL_IDMODULO)) {
					existe=true;
					mensajecorreoinvenAux.setsDescripcionGeneralEntityReporte1(mensajecorreoinvenAux.getmodulo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(MensajeCorreoInvenConstantesFunciones.LABEL_IDTIPOMENSAJECORREOINVEN)) {
					existe=true;
					mensajecorreoinvenAux.setsDescripcionGeneralEntityReporte1(mensajecorreoinvenAux.gettipomensajecorreoinven_descripcion());
				}
				 else if(sTipoSeleccionar.equals(MensajeCorreoInvenConstantesFunciones.LABEL_TEMA)) {
					existe=true;
					mensajecorreoinvenAux.setsDescripcionGeneralEntityReporte1(mensajecorreoinvenAux.gettema());
				}
				 else if(sTipoSeleccionar.equals(MensajeCorreoInvenConstantesFunciones.LABEL_MENSAJE)) {
					existe=true;
					mensajecorreoinvenAux.setsDescripcionGeneralEntityReporte1(mensajecorreoinvenAux.getmensaje());
				}
				 else if(sTipoSeleccionar.equals(MensajeCorreoInvenConstantesFunciones.LABEL_AVISO)) {
					existe=true;
					mensajecorreoinvenAux.setsDescripcionGeneralEntityReporte1(mensajecorreoinvenAux.getaviso());
				}
				 else if(sTipoSeleccionar.equals(MensajeCorreoInvenConstantesFunciones.LABEL_ESTAACTIVO)) {
					existe=true;
					mensajecorreoinvenAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(mensajecorreoinvenAux.getesta_activo()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesMensajeCorreoInven(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoMensajeCorreoInven=true;
				this.isVisibilidadCeldaNuevoRelacionesMensajeCorreoInven=true;
				this.isVisibilidadCeldaGuardarCambiosMensajeCorreoInven=true;
			}
			
			this.isVisibilidadCeldaModificarMensajeCorreoInven=false;
			this.isVisibilidadCeldaActualizarMensajeCorreoInven=false;
			this.isVisibilidadCeldaEliminarMensajeCorreoInven=false;
			this.isVisibilidadCeldaCancelarMensajeCorreoInven=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMensajeCorreoInven=true;
				} else {
					this.isVisibilidadCeldaGuardarMensajeCorreoInven=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoMensajeCorreoInven=false;
			this.isVisibilidadCeldaNuevoRelacionesMensajeCorreoInven=false;
			this.isVisibilidadCeldaGuardarCambiosMensajeCorreoInven=false;
			this.isVisibilidadCeldaModificarMensajeCorreoInven=false;
			this.isVisibilidadCeldaActualizarMensajeCorreoInven=true;
			this.isVisibilidadCeldaEliminarMensajeCorreoInven=false;
			this.isVisibilidadCeldaCancelarMensajeCorreoInven=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMensajeCorreoInven=true;
				} else {
					this.isVisibilidadCeldaGuardarMensajeCorreoInven=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoMensajeCorreoInven=false;
			this.isVisibilidadCeldaNuevoRelacionesMensajeCorreoInven=false;
			this.isVisibilidadCeldaGuardarCambiosMensajeCorreoInven=false;
			this.isVisibilidadCeldaModificarMensajeCorreoInven=false;
			this.isVisibilidadCeldaActualizarMensajeCorreoInven=true;
			this.isVisibilidadCeldaEliminarMensajeCorreoInven=true;
			this.isVisibilidadCeldaCancelarMensajeCorreoInven=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMensajeCorreoInven=true;
				} else {
					this.isVisibilidadCeldaGuardarMensajeCorreoInven=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoMensajeCorreoInven=false;
			this.isVisibilidadCeldaNuevoRelacionesMensajeCorreoInven=false;
			this.isVisibilidadCeldaGuardarCambiosMensajeCorreoInven=false;
			this.isVisibilidadCeldaModificarMensajeCorreoInven=false;
			this.isVisibilidadCeldaActualizarMensajeCorreoInven=true;
			this.isVisibilidadCeldaEliminarMensajeCorreoInven=false;
			this.isVisibilidadCeldaCancelarMensajeCorreoInven=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMensajeCorreoInven=false;
				} else {
					this.isVisibilidadCeldaGuardarMensajeCorreoInven=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoMensajeCorreoInven=true;
			this.isVisibilidadCeldaNuevoRelacionesMensajeCorreoInven=true;
			this.isVisibilidadCeldaGuardarCambiosMensajeCorreoInven=true;
			this.isVisibilidadCeldaModificarMensajeCorreoInven=false;
			this.isVisibilidadCeldaActualizarMensajeCorreoInven=false;
			this.isVisibilidadCeldaEliminarMensajeCorreoInven=false;
			this.isVisibilidadCeldaCancelarMensajeCorreoInven=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMensajeCorreoInven=true;
				} else {
					this.isVisibilidadCeldaGuardarMensajeCorreoInven=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoMensajeCorreoInven=false;
			this.isVisibilidadCeldaNuevoRelacionesMensajeCorreoInven=false;
			this.isVisibilidadCeldaGuardarCambiosMensajeCorreoInven=false;
			this.isVisibilidadCeldaActualizarMensajeCorreoInven=false;
			this.isVisibilidadCeldaEliminarMensajeCorreoInven=false;
			this.isVisibilidadCeldaCancelarMensajeCorreoInven=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMensajeCorreoInven=false;
				} else {
					this.isVisibilidadCeldaGuardarMensajeCorreoInven=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoMensajeCorreoInven=false;
			this.isVisibilidadCeldaNuevoRelacionesMensajeCorreoInven=false;
			this.isVisibilidadCeldaGuardarCambiosMensajeCorreoInven=false;
			this.isVisibilidadCeldaModificarMensajeCorreoInven=true;
			this.isVisibilidadCeldaActualizarMensajeCorreoInven=false;
			this.isVisibilidadCeldaEliminarMensajeCorreoInven=false;
			this.isVisibilidadCeldaCancelarMensajeCorreoInven=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMensajeCorreoInven=false;
				} else {
					this.isVisibilidadCeldaGuardarMensajeCorreoInven=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(MensajeCorreoInvenJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoMensajeCorreoInven=true;
			this.isVisibilidadCeldaNuevoRelacionesMensajeCorreoInven=true;
			this.isVisibilidadCeldaGuardarCambiosMensajeCorreoInven=true;
		} else {
			this.actualizarEstadoPanelsMensajeCorreoInven(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarMensajeCorreoInven=false;
			//this.isVisibilidadCeldaVerFormMensajeCorreoInven=false;
			this.isVisibilidadCeldaDuplicarMensajeCorreoInven=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!mensajecorreoinvenSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesMensajeCorreoInven=false;
		} else {
			this.isVisibilidadCeldaNuevoMensajeCorreoInven=false;
			this.isVisibilidadCeldaGuardarCambiosMensajeCorreoInven=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(mensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
			if(!mensajecorreoinvenSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesMensajeCorreoInven=false;												
			}
			
			this.jButtonCerrarMensajeCorreoInven.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesMensajeCorreoInven=false;
		}
		
		if(!this.permiteMantenimiento(this.mensajecorreoinven)) {
			this.isVisibilidadCeldaActualizarMensajeCorreoInven=false;
			this.isVisibilidadCeldaEliminarMensajeCorreoInven=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesMensajeCorreoInven() {
		this.isVisibilidadCeldaNuevoMensajeCorreoInven=false;
		this.isVisibilidadCeldaGuardarCambiosMensajeCorreoInven=false;
	}
	
	public void actualizarEstadoPanelsMensajeCorreoInven(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionMensajeCorreoInven!=null) {
				this.jScrollPanelDatosEdicionMensajeCorreoInven.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMensajeCorreoInven!=null) {
				this.jTabbedPaneBusquedasMensajeCorreoInven.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosMensajeCorreoInven!=null) {
				this.jScrollPanelDatosMensajeCorreoInven.setVisible(true);
			}
			
			if(this.jPanelPaginacionMensajeCorreoInven!=null) {
				this.jPanelPaginacionMensajeCorreoInven.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesMensajeCorreoInven!=null) {
				this.jPanelParametrosReportesMensajeCorreoInven.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionMensajeCorreoInven!=null) {
				this.jScrollPanelDatosEdicionMensajeCorreoInven.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMensajeCorreoInven!=null) {
				this.jTabbedPaneBusquedasMensajeCorreoInven.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosMensajeCorreoInven!=null) {
				this.jScrollPanelDatosMensajeCorreoInven.setVisible(false);
			}
			
			if(this.jPanelPaginacionMensajeCorreoInven!=null) {
				this.jPanelPaginacionMensajeCorreoInven.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesMensajeCorreoInven!=null) {
				this.jPanelParametrosReportesMensajeCorreoInven.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionMensajeCorreoInven!=null) {
				this.jScrollPanelDatosEdicionMensajeCorreoInven.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMensajeCorreoInven!=null) {
				this.jTabbedPaneBusquedasMensajeCorreoInven.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosMensajeCorreoInven!=null) {
				this.jScrollPanelDatosMensajeCorreoInven.setVisible(false);
			}
			
			if(this.jPanelPaginacionMensajeCorreoInven!=null) {
				this.jPanelPaginacionMensajeCorreoInven.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesMensajeCorreoInven!=null) {
				this.jPanelParametrosReportesMensajeCorreoInven.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionMensajeCorreoInven!=null) {
				this.jScrollPanelDatosEdicionMensajeCorreoInven.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMensajeCorreoInven!=null) {
				this.jTabbedPaneBusquedasMensajeCorreoInven.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosMensajeCorreoInven!=null) {
				this.jScrollPanelDatosMensajeCorreoInven.setVisible(false);
			}
			
			if(this.jPanelPaginacionMensajeCorreoInven!=null) {
				this.jPanelPaginacionMensajeCorreoInven.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesMensajeCorreoInven!=null) {
				this.jPanelParametrosReportesMensajeCorreoInven.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionMensajeCorreoInven!=null) {
				this.jScrollPanelDatosEdicionMensajeCorreoInven.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMensajeCorreoInven!=null) {
				this.jTabbedPaneBusquedasMensajeCorreoInven.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosMensajeCorreoInven!=null) {
				this.jScrollPanelDatosMensajeCorreoInven.setVisible(true);
			}
			
			if(this.jPanelPaginacionMensajeCorreoInven!=null) {
				this.jPanelPaginacionMensajeCorreoInven.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesMensajeCorreoInven!=null) {
				this.jPanelParametrosReportesMensajeCorreoInven.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionMensajeCorreoInven!=null) {
				this.jScrollPanelDatosEdicionMensajeCorreoInven.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMensajeCorreoInven!=null) {
				this.jTabbedPaneBusquedasMensajeCorreoInven.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosMensajeCorreoInven!=null) {
				this.jScrollPanelDatosMensajeCorreoInven.setVisible(true);
			}
			
			if(this.jPanelPaginacionMensajeCorreoInven!=null) {
				this.jPanelPaginacionMensajeCorreoInven.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesMensajeCorreoInven!=null) {
				this.jPanelParametrosReportesMensajeCorreoInven.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionMensajeCorreoInven!=null) {
				this.jScrollPanelDatosEdicionMensajeCorreoInven.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMensajeCorreoInven!=null) {
				this.jTabbedPaneBusquedasMensajeCorreoInven.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosMensajeCorreoInven!=null) {
				this.jScrollPanelDatosMensajeCorreoInven.setVisible(true);
			}
			
			if(this.jPanelPaginacionMensajeCorreoInven!=null) {
				this.jPanelPaginacionMensajeCorreoInven.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesMensajeCorreoInven!=null) {
				this.jPanelParametrosReportesMensajeCorreoInven.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasMensajeCorreoInven!=null) {
					this.jTabbedPaneBusquedasMensajeCorreoInven.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesMensajeCorreoInven!=null) {
				this.jPanelParametrosReportesMensajeCorreoInven.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.mensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMensajeCorreoInven!=null) {
				this.jTabbedPaneBusquedasMensajeCorreoInven.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesMensajeCorreoInven!=null) {
				this.jPanelParametrosReportesMensajeCorreoInven.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdTipoMensajeCorreoInven=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoMensajeCorreoInven) {this.jTabbedPaneBusquedasMensajeCorreoInven.remove(jPanelFK_IdTipoMensajeCorreoInvenMensajeCorreoInven);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdTipoMensajeCorreoInven=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdTipoMensajeCorreoInven) {this.jTabbedPaneBusquedasMensajeCorreoInven.remove(jPanelFK_IdTipoMensajeCorreoInvenMensajeCorreoInven);}
		}
		
	}

	public void setVisibilidadBusquedasParaModulo(Boolean isParaModulo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaModuloNegation=!isParaModulo;

			this.isVisibilidadFK_IdTipoMensajeCorreoInven=isParaModuloNegation;
			if(!this.isVisibilidadFK_IdTipoMensajeCorreoInven) {this.jTabbedPaneBusquedasMensajeCorreoInven.remove(jPanelFK_IdTipoMensajeCorreoInvenMensajeCorreoInven);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoMensajeCorreoInven(Boolean isParaTipoMensajeCorreoInven){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoMensajeCorreoInvenNegation=!isParaTipoMensajeCorreoInven;

			this.isVisibilidadFK_IdTipoMensajeCorreoInven=isParaTipoMensajeCorreoInven;
			if(!this.isVisibilidadFK_IdTipoMensajeCorreoInven) {this.jTabbedPaneBusquedasMensajeCorreoInven.remove(jPanelFK_IdTipoMensajeCorreoInvenMensajeCorreoInven);}
		}
		
	}
	
	

	public String registrarSesionMensajeCorreoInvenParaDetalleMensajeCorreoInvenes() throws Exception {
		Boolean isPaginaPopupDetalleMensajeCorreoInven=false;

		try {

			if(this.mensajecorreoinvenSessionBean==null) {
				this.mensajecorreoinvenSessionBean=new MensajeCorreoInvenSessionBean();
			}

			if(this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenSessionBean==null) {
				this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenSessionBean=new DetalleMensajeCorreoInvenSessionBean();
			}

			this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenSessionBean.setsPathNavegacionActual(mensajecorreoinvenSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+DetalleMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupDetalleMensajeCorreoInven=this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeDetalleMensajeCorreoInven(true);
			this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleMensajeCorreoInven(MensajeCorreoInvenConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenSessionBean.setisBusquedaDesdeForeignKeySesionMensajeCorreoInven(true);
			this.jInternalFrameDetalleFormMensajeCorreoInven.detallemensajecorreoinvenSessionBean.setlidMensajeCorreoInvenActual(this.idMensajeCorreoInvenActual);

			mensajecorreoinvenSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyMensajeCorreoInven(true);
			mensajecorreoinvenSessionBean.setlIdMensajeCorreoInvenActualForeignKey(this.idMensajeCorreoInvenActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionMensajeCorreoInvenParaMailMensajeCorreoInvenes() throws Exception {
		Boolean isPaginaPopupMailMensajeCorreoInven=false;

		try {

			if(this.mensajecorreoinvenSessionBean==null) {
				this.mensajecorreoinvenSessionBean=new MensajeCorreoInvenSessionBean();
			}

			if(this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenSessionBean==null) {
				this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenSessionBean=new MailMensajeCorreoInvenSessionBean();
			}

			this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenSessionBean.setsPathNavegacionActual(mensajecorreoinvenSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+MailMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupMailMensajeCorreoInven=this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeMailMensajeCorreoInven(true);
			this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeMailMensajeCorreoInven(MensajeCorreoInvenConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenSessionBean.setisBusquedaDesdeForeignKeySesionMensajeCorreoInven(true);
			this.jInternalFrameDetalleFormMensajeCorreoInven.mailmensajecorreoinvenSessionBean.setlidMensajeCorreoInvenActual(this.idMensajeCorreoInvenActual);

			mensajecorreoinvenSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyMensajeCorreoInven(true);
			mensajecorreoinvenSessionBean.setlIdMensajeCorreoInvenActualForeignKey(this.idMensajeCorreoInvenActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//MensajeCorreoInvenSessionBean mensajecorreoinvenSessionBean=new MensajeCorreoInvenSessionBean();
		
		if(this.mensajecorreoinvenSessionBean==null) {
			this.mensajecorreoinvenSessionBean=new MensajeCorreoInvenSessionBean();
		}
		
		this.mensajecorreoinvenSessionBean.setsUltimaBusquedaMensajeCorreoInven(this.getsAccionBusqueda());
		this.mensajecorreoinvenSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.mensajecorreoinvenSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			mensajecorreoinvenSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdModulo")) {
			mensajecorreoinvenSessionBean.setid_modulo(this.getid_moduloFK_IdModulo());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			mensajecorreoinvenSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoMensajeCorreoInven")) {
			mensajecorreoinvenSessionBean.setid_tipo_mensaje_correo_inven(this.getid_tipo_mensaje_correo_invenFK_IdTipoMensajeCorreoInven());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//MensajeCorreoInvenSessionBean mensajecorreoinvenSessionBean=new MensajeCorreoInvenSessionBean();
		
		if(this.mensajecorreoinvenSessionBean==null) {
			this.mensajecorreoinvenSessionBean=new MensajeCorreoInvenSessionBean();
		}
		
		if(this.mensajecorreoinvenSessionBean.getsUltimaBusquedaMensajeCorreoInven()!=null&&!this.mensajecorreoinvenSessionBean.getsUltimaBusquedaMensajeCorreoInven().equals("")) {
			this.setsAccionBusqueda(mensajecorreoinvenSessionBean.getsUltimaBusquedaMensajeCorreoInven());
			this.setiNumeroPaginacion(mensajecorreoinvenSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(mensajecorreoinvenSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(mensajecorreoinvenSessionBean.getid_empresa());
				mensajecorreoinvenSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdModulo")) {
				this.setid_moduloFK_IdModulo(mensajecorreoinvenSessionBean.getid_modulo());
				mensajecorreoinvenSessionBean.setid_modulo(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(mensajecorreoinvenSessionBean.getid_sucursal());
				mensajecorreoinvenSessionBean.setid_sucursal(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoMensajeCorreoInven")) {
				this.setid_tipo_mensaje_correo_invenFK_IdTipoMensajeCorreoInven(mensajecorreoinvenSessionBean.getid_tipo_mensaje_correo_inven());
				mensajecorreoinvenSessionBean.setid_tipo_mensaje_correo_inven(-1L);
			}
		}
		
		this.mensajecorreoinvenSessionBean.setsUltimaBusquedaMensajeCorreoInven("");
		this.mensajecorreoinvenSessionBean.setiNumeroPaginacion(MensajeCorreoInvenConstantesFunciones.INUMEROPAGINACION);
		this.mensajecorreoinvenSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaMensajeCorreoInven(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioMensajeCorreoInven() {
		this.updateBorderResaltarBusquedasFormularioMensajeCorreoInven();
		this.updateVisibilidadBusquedasFormularioMensajeCorreoInven();
		this.updateHabilitarBusquedasFormularioMensajeCorreoInven();
	}
	
	public void updateBorderResaltarBusquedasFormularioMensajeCorreoInven() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasMensajeCorreoInven.getComponents().length>0) {
	

		if(this.mensajecorreoinvenConstantesFunciones.resaltarFK_IdTipoMensajeCorreoInvenMensajeCorreoInven!=null) {
			index= this.jTabbedPaneBusquedasMensajeCorreoInven.indexOfComponent(this.jPanelFK_IdTipoMensajeCorreoInvenMensajeCorreoInven);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasMensajeCorreoInven.getComponent(index);
				jPanel.setBorder(this.mensajecorreoinvenConstantesFunciones.resaltarFK_IdTipoMensajeCorreoInvenMensajeCorreoInven);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioMensajeCorreoInven() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasMensajeCorreoInven.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasMensajeCorreoInven.indexOfComponent(this.jPanelFK_IdTipoMensajeCorreoInvenMensajeCorreoInven);
			jPanel=(JPanel)this.jTabbedPaneBusquedasMensajeCorreoInven.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.mensajecorreoinvenConstantesFunciones.mostrarFK_IdTipoMensajeCorreoInvenMensajeCorreoInven);
			if(!this.mensajecorreoinvenConstantesFunciones.mostrarFK_IdTipoMensajeCorreoInvenMensajeCorreoInven && index>-1) {
				this.jTabbedPaneBusquedasMensajeCorreoInven.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioMensajeCorreoInven() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasMensajeCorreoInven.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasMensajeCorreoInven.indexOfComponent(this.jPanelFK_IdTipoMensajeCorreoInvenMensajeCorreoInven);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasMensajeCorreoInven.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.mensajecorreoinvenConstantesFunciones.activarFK_IdTipoMensajeCorreoInvenMensajeCorreoInven);
				this.jTabbedPaneBusquedasMensajeCorreoInven.setEnabledAt(index,this.mensajecorreoinvenConstantesFunciones.activarFK_IdTipoMensajeCorreoInvenMensajeCorreoInven);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaMensajeCorreoInven(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdTipoMensajeCorreoInven")) {
			index= this.jTabbedPaneBusquedasMensajeCorreoInven.indexOfComponent(this.jPanelFK_IdTipoMensajeCorreoInvenMensajeCorreoInven);

			this.jTabbedPaneBusquedasMensajeCorreoInven.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasMensajeCorreoInven.getComponent(index);

			this.mensajecorreoinvenConstantesFunciones.setResaltarFK_IdTipoMensajeCorreoInvenMensajeCorreoInven(resaltar);

			jPanel.setBorder(this.mensajecorreoinvenConstantesFunciones.resaltarFK_IdTipoMensajeCorreoInvenMensajeCorreoInven);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarMensajeCorreoInven.setBorder(resaltar);
			
		}
	}	
	
	//NO FUNCIONA
	public void windowClosed(WindowEvent e) {	
	}
		
	public void windowClosing(WindowEvent e) {	    	    
	}

	public void windowOpened(WindowEvent e) {	    
	}

	public void windowIconified(WindowEvent e) {	    
	}

	public void windowDeiconified(WindowEvent e) {	    
	}

	public void windowActivated(WindowEvent e) {	    
	}

	public void windowDeactivated(WindowEvent e) {	    
	}

	public void windowGainedFocus(WindowEvent e) {	    
	}

	public void windowLostFocus(WindowEvent e) {	    
	}
	
	public void updateControlesFormularioMensajeCorreoInven() throws Exception {

		if(this.jInternalFrameDetalleFormMensajeCorreoInven==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioMensajeCorreoInven();
		this.updateVisibilidadResaltarControlesFormularioMensajeCorreoInven();
		this.updateHabilitarResaltarControlesFormularioMensajeCorreoInven();
		
	}
	
	public void updateBorderResaltarControlesFormularioMensajeCorreoInven() throws Exception {
		if(this.jInternalFrameDetalleFormMensajeCorreoInven==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.mensajecorreoinvenConstantesFunciones.resaltaridMensajeCorreoInven!=null && this.jInternalFrameDetalleFormMensajeCorreoInven!=null) {this.jInternalFrameDetalleFormMensajeCorreoInven.jLabelidMensajeCorreoInven.setBorder(this.mensajecorreoinvenConstantesFunciones.resaltaridMensajeCorreoInven);}
		if(this.mensajecorreoinvenConstantesFunciones.resaltarid_empresaMensajeCorreoInven!=null && this.jInternalFrameDetalleFormMensajeCorreoInven!=null) {this.jInternalFrameDetalleFormMensajeCorreoInven.jComboBoxid_empresaMensajeCorreoInven.setBorder(this.mensajecorreoinvenConstantesFunciones.resaltarid_empresaMensajeCorreoInven);}
		if(this.mensajecorreoinvenConstantesFunciones.resaltarid_sucursalMensajeCorreoInven!=null && this.jInternalFrameDetalleFormMensajeCorreoInven!=null) {this.jInternalFrameDetalleFormMensajeCorreoInven.jComboBoxid_sucursalMensajeCorreoInven.setBorder(this.mensajecorreoinvenConstantesFunciones.resaltarid_sucursalMensajeCorreoInven);}
		if(this.mensajecorreoinvenConstantesFunciones.resaltarid_moduloMensajeCorreoInven!=null && this.jInternalFrameDetalleFormMensajeCorreoInven!=null) {this.jInternalFrameDetalleFormMensajeCorreoInven.jComboBoxid_moduloMensajeCorreoInven.setBorder(this.mensajecorreoinvenConstantesFunciones.resaltarid_moduloMensajeCorreoInven);}
		if(this.mensajecorreoinvenConstantesFunciones.resaltarid_tipo_mensaje_correo_invenMensajeCorreoInven!=null && this.jInternalFrameDetalleFormMensajeCorreoInven!=null) {this.jInternalFrameDetalleFormMensajeCorreoInven.jComboBoxid_tipo_mensaje_correo_invenMensajeCorreoInven.setBorder(this.mensajecorreoinvenConstantesFunciones.resaltarid_tipo_mensaje_correo_invenMensajeCorreoInven);}
		if(this.mensajecorreoinvenConstantesFunciones.resaltartemaMensajeCorreoInven!=null && this.jInternalFrameDetalleFormMensajeCorreoInven!=null) {this.jInternalFrameDetalleFormMensajeCorreoInven.jTextAreatemaMensajeCorreoInven.setBorder(this.mensajecorreoinvenConstantesFunciones.resaltartemaMensajeCorreoInven);}
		if(this.mensajecorreoinvenConstantesFunciones.resaltarmensajeMensajeCorreoInven!=null && this.jInternalFrameDetalleFormMensajeCorreoInven!=null) {this.jInternalFrameDetalleFormMensajeCorreoInven.jTextAreamensajeMensajeCorreoInven.setBorder(this.mensajecorreoinvenConstantesFunciones.resaltarmensajeMensajeCorreoInven);}
		if(this.mensajecorreoinvenConstantesFunciones.resaltaravisoMensajeCorreoInven!=null && this.jInternalFrameDetalleFormMensajeCorreoInven!=null) {this.jInternalFrameDetalleFormMensajeCorreoInven.jTextAreaavisoMensajeCorreoInven.setBorder(this.mensajecorreoinvenConstantesFunciones.resaltaravisoMensajeCorreoInven);}
		if(this.mensajecorreoinvenConstantesFunciones.resaltaresta_activoMensajeCorreoInven!=null && this.jInternalFrameDetalleFormMensajeCorreoInven!=null) {this.jInternalFrameDetalleFormMensajeCorreoInven.jCheckBoxesta_activoMensajeCorreoInven.setBorderPainted(true);this.jInternalFrameDetalleFormMensajeCorreoInven.jCheckBoxesta_activoMensajeCorreoInven.setBorder(this.mensajecorreoinvenConstantesFunciones.resaltaresta_activoMensajeCorreoInven);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioMensajeCorreoInven() throws Exception {		
		if(this.jInternalFrameDetalleFormMensajeCorreoInven==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormMensajeCorreoInven!=null) {
	
		//this.jInternalFrameDetalleFormMensajeCorreoInven.jLabelidMensajeCorreoInven.setVisible(this.mensajecorreoinvenConstantesFunciones.mostraridMensajeCorreoInven);
		this.jInternalFrameDetalleFormMensajeCorreoInven.jPanelidMensajeCorreoInven.setVisible(this.mensajecorreoinvenConstantesFunciones.mostraridMensajeCorreoInven);
		//this.jInternalFrameDetalleFormMensajeCorreoInven.jComboBoxid_empresaMensajeCorreoInven.setVisible(this.mensajecorreoinvenConstantesFunciones.mostrarid_empresaMensajeCorreoInven);
		this.jInternalFrameDetalleFormMensajeCorreoInven.jPanelid_empresaMensajeCorreoInven.setVisible(this.mensajecorreoinvenConstantesFunciones.mostrarid_empresaMensajeCorreoInven);
		//this.jInternalFrameDetalleFormMensajeCorreoInven.jComboBoxid_sucursalMensajeCorreoInven.setVisible(this.mensajecorreoinvenConstantesFunciones.mostrarid_sucursalMensajeCorreoInven);
		this.jInternalFrameDetalleFormMensajeCorreoInven.jPanelid_sucursalMensajeCorreoInven.setVisible(this.mensajecorreoinvenConstantesFunciones.mostrarid_sucursalMensajeCorreoInven);
		//this.jInternalFrameDetalleFormMensajeCorreoInven.jComboBoxid_moduloMensajeCorreoInven.setVisible(this.mensajecorreoinvenConstantesFunciones.mostrarid_moduloMensajeCorreoInven);
		this.jInternalFrameDetalleFormMensajeCorreoInven.jPanelid_moduloMensajeCorreoInven.setVisible(this.mensajecorreoinvenConstantesFunciones.mostrarid_moduloMensajeCorreoInven);
		//this.jInternalFrameDetalleFormMensajeCorreoInven.jComboBoxid_tipo_mensaje_correo_invenMensajeCorreoInven.setVisible(this.mensajecorreoinvenConstantesFunciones.mostrarid_tipo_mensaje_correo_invenMensajeCorreoInven);
		this.jInternalFrameDetalleFormMensajeCorreoInven.jPanelid_tipo_mensaje_correo_invenMensajeCorreoInven.setVisible(this.mensajecorreoinvenConstantesFunciones.mostrarid_tipo_mensaje_correo_invenMensajeCorreoInven);
		//this.jInternalFrameDetalleFormMensajeCorreoInven.jTextAreatemaMensajeCorreoInven.setVisible(this.mensajecorreoinvenConstantesFunciones.mostrartemaMensajeCorreoInven);
		this.jInternalFrameDetalleFormMensajeCorreoInven.jPaneltemaMensajeCorreoInven.setVisible(this.mensajecorreoinvenConstantesFunciones.mostrartemaMensajeCorreoInven);
		//this.jInternalFrameDetalleFormMensajeCorreoInven.jTextAreamensajeMensajeCorreoInven.setVisible(this.mensajecorreoinvenConstantesFunciones.mostrarmensajeMensajeCorreoInven);
		this.jInternalFrameDetalleFormMensajeCorreoInven.jPanelmensajeMensajeCorreoInven.setVisible(this.mensajecorreoinvenConstantesFunciones.mostrarmensajeMensajeCorreoInven);
		//this.jInternalFrameDetalleFormMensajeCorreoInven.jTextAreaavisoMensajeCorreoInven.setVisible(this.mensajecorreoinvenConstantesFunciones.mostraravisoMensajeCorreoInven);
		this.jInternalFrameDetalleFormMensajeCorreoInven.jPanelavisoMensajeCorreoInven.setVisible(this.mensajecorreoinvenConstantesFunciones.mostraravisoMensajeCorreoInven);
		//this.jInternalFrameDetalleFormMensajeCorreoInven.jCheckBoxesta_activoMensajeCorreoInven.setVisible(this.mensajecorreoinvenConstantesFunciones.mostraresta_activoMensajeCorreoInven);
		this.jInternalFrameDetalleFormMensajeCorreoInven.jPanelesta_activoMensajeCorreoInven.setVisible(this.mensajecorreoinvenConstantesFunciones.mostraresta_activoMensajeCorreoInven);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioMensajeCorreoInven() throws Exception {
		if(this.jInternalFrameDetalleFormMensajeCorreoInven==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormMensajeCorreoInven!=null) {
	
		this.jInternalFrameDetalleFormMensajeCorreoInven.jLabelidMensajeCorreoInven.setEnabled(this.mensajecorreoinvenConstantesFunciones.activaridMensajeCorreoInven);
		this.jInternalFrameDetalleFormMensajeCorreoInven.jComboBoxid_empresaMensajeCorreoInven.setEnabled(this.mensajecorreoinvenConstantesFunciones.activarid_empresaMensajeCorreoInven);
		this.jInternalFrameDetalleFormMensajeCorreoInven.jComboBoxid_sucursalMensajeCorreoInven.setEnabled(this.mensajecorreoinvenConstantesFunciones.activarid_sucursalMensajeCorreoInven);
		this.jInternalFrameDetalleFormMensajeCorreoInven.jComboBoxid_moduloMensajeCorreoInven.setEnabled(this.mensajecorreoinvenConstantesFunciones.activarid_moduloMensajeCorreoInven);
		this.jInternalFrameDetalleFormMensajeCorreoInven.jComboBoxid_tipo_mensaje_correo_invenMensajeCorreoInven.setEnabled(this.mensajecorreoinvenConstantesFunciones.activarid_tipo_mensaje_correo_invenMensajeCorreoInven);
		this.jInternalFrameDetalleFormMensajeCorreoInven.jTextAreatemaMensajeCorreoInven.setEnabled(this.mensajecorreoinvenConstantesFunciones.activartemaMensajeCorreoInven);
		this.jInternalFrameDetalleFormMensajeCorreoInven.jTextAreamensajeMensajeCorreoInven.setEnabled(this.mensajecorreoinvenConstantesFunciones.activarmensajeMensajeCorreoInven);
		this.jInternalFrameDetalleFormMensajeCorreoInven.jTextAreaavisoMensajeCorreoInven.setEnabled(this.mensajecorreoinvenConstantesFunciones.activaravisoMensajeCorreoInven);
		this.jInternalFrameDetalleFormMensajeCorreoInven.jCheckBoxesta_activoMensajeCorreoInven.setEnabled(this.mensajecorreoinvenConstantesFunciones.activaresta_activoMensajeCorreoInven);
		}
	}
	
		
}