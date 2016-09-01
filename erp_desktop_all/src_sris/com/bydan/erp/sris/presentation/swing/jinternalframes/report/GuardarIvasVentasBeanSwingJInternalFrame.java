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
package com.bydan.erp.sris.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.sris.util.GuardarIvasVentasConstantesFunciones;
import com.bydan.erp.sris.util.report.GuardarIvasVentasParameterReturnGeneral;
//import com.bydan.erp.sris.util.report.GuardarIvasVentasParameterGeneral;
//import com.bydan.erp.sris.presentation.report.source.report.GuardarIvasVentasBean;
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

import com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.sris.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.sris.util.*;

import com.bydan.erp.sris.util.report.*;
import com.bydan.erp.sris.business.logic.report.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.sris.business.entity.report.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;






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

//import org.hibernate.collection.PersistentBag;

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


import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.report.*;

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
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class GuardarIvasVentasBeanSwingJInternalFrame extends GuardarIvasVentasJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(GuardarIvasVentasBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<GuardarIvasVentas> guardarivasventasValidator = new ClassValidator<GuardarIvasVentas>(GuardarIvasVentas.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public GuardarIvasVentas guardarivasventas;	
	public GuardarIvasVentas guardarivasventasAux;
	public GuardarIvasVentas guardarivasventasAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public GuardarIvasVentas guardarivasventasTotales;
	public Long idGuardarIvasVentasActual;
	public Long iIdNuevoGuardarIvasVentas=0L;
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

	public String sFinalQueryComboEjercicio="";

	public List<Ejercicio> ejerciciosForeignKey;

	public List<Ejercicio> getejerciciosForeignKey() {
		return ejerciciosForeignKey;
	}

	public void setejerciciosForeignKey(List<Ejercicio> ejerciciosForeignKey) {
		this.ejerciciosForeignKey = ejerciciosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Ejercicio ejercicioForeignKey;

	public Ejercicio getejercicioForeignKey() {
		return ejercicioForeignKey;
	}

	public void setejercicioForeignKey(Ejercicio ejercicioForeignKey) {
		this.ejercicioForeignKey = ejercicioForeignKey;
	}

	public String sFinalQueryComboPeriodo="";

	public List<Periodo> periodosForeignKey;

	public List<Periodo> getperiodosForeignKey() {
		return periodosForeignKey;
	}

	public void setperiodosForeignKey(List<Periodo> periodosForeignKey) {
		this.periodosForeignKey = periodosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Periodo periodoForeignKey;

	public Periodo getperiodoForeignKey() {
		return periodoForeignKey;
	}

	public void setperiodoForeignKey(Periodo periodoForeignKey) {
		this.periodoForeignKey = periodoForeignKey;
	}

	public String sFinalQueryComboTipoRetencionFuenteIva="";

	public List<TipoRetencion> tiporetencionfuenteivasForeignKey;

	public List<TipoRetencion> gettiporetencionfuenteivasForeignKey() {
		return tiporetencionfuenteivasForeignKey;
	}

	public void settiporetencionfuenteivasForeignKey(List<TipoRetencion> tiporetencionfuenteivasForeignKey) {
		this.tiporetencionfuenteivasForeignKey = tiporetencionfuenteivasForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoRetencion tiporetencionfuenteivaForeignKey;

	public TipoRetencion gettiporetencionfuenteivaForeignKey() {
		return tiporetencionfuenteivaForeignKey;
	}

	public void settiporetencionfuenteivaForeignKey(TipoRetencion tiporetencionfuenteivaForeignKey) {
		this.tiporetencionfuenteivaForeignKey = tiporetencionfuenteivaForeignKey;
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
	
	public Boolean isPermisoTodoGuardarIvasVentas;
	public Boolean isPermisoNuevoGuardarIvasVentas;
	public Boolean isPermisoActualizarGuardarIvasVentas;
	public Boolean isPermisoActualizarOriginalGuardarIvasVentas;
	public Boolean isPermisoEliminarGuardarIvasVentas;
	public Boolean isPermisoGuardarCambiosGuardarIvasVentas;
	public Boolean isPermisoConsultaGuardarIvasVentas;
	public Boolean isPermisoBusquedaGuardarIvasVentas;
	public Boolean isPermisoReporteGuardarIvasVentas;
	public Boolean isPermisoPaginacionMedioGuardarIvasVentas;
	public Boolean isPermisoPaginacionAltoGuardarIvasVentas;
	public Boolean isPermisoPaginacionTodoGuardarIvasVentas;
	public Boolean isPermisoCopiarGuardarIvasVentas;
	public Boolean isPermisoVerFormGuardarIvasVentas;
	public Boolean isPermisoDuplicarGuardarIvasVentas;
	public Boolean isPermisoOrdenGuardarIvasVentas;
	
	
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
	
	public GuardarIvasVentasParameterReturnGeneral guardarivasventasReturnGeneral;
	public GuardarIvasVentasParameterReturnGeneral guardarivasventasParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoGuardarIvasVentas=false;
	public Boolean esParaAccionDesdeFormularioGuardarIvasVentas=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected GuardarIvasVentasSessionBeanAdditional guardarivasventasSessionBeanAdditional=null;
	
	public GuardarIvasVentasSessionBeanAdditional getGuardarIvasVentasSessionBeanAdditional() {
		return this.guardarivasventasSessionBeanAdditional;
	}
	
	public void setGuardarIvasVentasSessionBeanAdditional(GuardarIvasVentasSessionBeanAdditional guardarivasventasSessionBeanAdditional) {
		try {
			this.guardarivasventasSessionBeanAdditional=guardarivasventasSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected GuardarIvasVentasBeanSwingJInternalFrameAdditional guardarivasventasBeanSwingJInternalFrameAdditional=null;
	//public class GuardarIvasVentasBeanSwingJInternalFrame
	
	public GuardarIvasVentasBeanSwingJInternalFrameAdditional getGuardarIvasVentasBeanSwingJInternalFrameAdditional() {
		return this.guardarivasventasBeanSwingJInternalFrameAdditional;
	}
	
	public void setGuardarIvasVentasBeanSwingJInternalFrameAdditional(GuardarIvasVentasBeanSwingJInternalFrameAdditional guardarivasventasBeanSwingJInternalFrameAdditional) {
		try {
			this.guardarivasventasBeanSwingJInternalFrameAdditional=guardarivasventasBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public GuardarIvasVentasLogic guardarivasventasLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public GuardarIvasVentas guardarivasventasBean;
	public GuardarIvasVentasConstantesFunciones guardarivasventasConstantesFunciones;
	//public GuardarIvasVentasParameterReturnGeneral guardarivasventasReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public EjercicioLogic ejercicioLogic;
	public PeriodoLogic periodoLogic;
	public TipoRetencionLogic tiporetencionfuenteivaLogic;
	
	//PARAMETROS
	
	
	//public List<GuardarIvasVentas> guardarivasventass;	
	//public List<GuardarIvasVentas> guardarivasventassEliminados;
	//public List<GuardarIvasVentas> guardarivasventassAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoGuardarIvasVentas=false;
	public Boolean isVisibilidadCeldaDuplicarGuardarIvasVentas=true;
	public Boolean isVisibilidadCeldaCopiarGuardarIvasVentas=true;
	public Boolean isVisibilidadCeldaVerFormGuardarIvasVentas=true;
	public Boolean isVisibilidadCeldaOrdenGuardarIvasVentas=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesGuardarIvasVentas=false;
	public Boolean isVisibilidadCeldaModificarGuardarIvasVentas=false;
	public Boolean isVisibilidadCeldaActualizarGuardarIvasVentas=false;
	public Boolean isVisibilidadCeldaEliminarGuardarIvasVentas=false;
	public Boolean isVisibilidadCeldaCancelarGuardarIvasVentas=false;
	public Boolean isVisibilidadCeldaGuardarGuardarIvasVentas=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosGuardarIvasVentas=false;	
	
	
	public Boolean isVisibilidadBusquedaGuardarIvasVentas=false;
	public Boolean isVisibilidadFK_IdEjercicio=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdPeriodo=false;
	public Boolean isVisibilidadFK_IdTipoRetencionFuenteIva=false;
	
	public Long getiIdNuevoGuardarIvasVentas() {
		return this.iIdNuevoGuardarIvasVentas;
	}

	public void setiIdNuevoGuardarIvasVentas(Long iIdNuevoGuardarIvasVentas) {
		this.iIdNuevoGuardarIvasVentas = iIdNuevoGuardarIvasVentas;
	}
	
	public Long getidGuardarIvasVentasActual() {
		return this.idGuardarIvasVentasActual;
	}

	public void setidGuardarIvasVentasActual(Long idGuardarIvasVentasActual) {
		this.idGuardarIvasVentasActual = idGuardarIvasVentasActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public GuardarIvasVentas getguardarivasventas() {
		return this.guardarivasventas;
	}

	public void setguardarivasventas(GuardarIvasVentas guardarivasventas) {
		this.guardarivasventas = guardarivasventas;
	}
	
	public GuardarIvasVentas getguardarivasventasAux() {
		return this.guardarivasventasAux;
	}

	public void setguardarivasventasAux(GuardarIvasVentas guardarivasventasAux) {
		this.guardarivasventasAux = guardarivasventasAux;
	}				
	
	public GuardarIvasVentas getguardarivasventasAnterior() {
		return this.guardarivasventasAnterior;
	}

	public void setguardarivasventasAnterior(GuardarIvasVentas guardarivasventasAnterior) {
		this.guardarivasventasAnterior = guardarivasventasAnterior;
	}	
	
	public GuardarIvasVentas getguardarivasventasTotales() {
		return this.guardarivasventasTotales;
	}

	public void setguardarivasventasTotales(GuardarIvasVentas guardarivasventasTotales) {
		this.guardarivasventasTotales = guardarivasventasTotales;
	}	
	
	public GuardarIvasVentas getguardarivasventasBean() {
		return this.guardarivasventasBean;
	}

	public void setguardarivasventasBean(GuardarIvasVentas guardarivasventasBean) {
		this.guardarivasventasBean = guardarivasventasBean;
	}	
	
	public GuardarIvasVentasParameterReturnGeneral getguardarivasventasReturnGeneral() {
		return this.guardarivasventasReturnGeneral;
	}

	public void setguardarivasventasReturnGeneral(GuardarIvasVentasParameterReturnGeneral guardarivasventasReturnGeneral) {
		this.guardarivasventasReturnGeneral = guardarivasventasReturnGeneral;
	}	
	
	
	public Long id_ejercicioBusquedaGuardarIvasVentas=-1L;

	public Long getid_ejercicioBusquedaGuardarIvasVentas() {
		return this.id_ejercicioBusquedaGuardarIvasVentas;
	}

	public void setid_ejercicioBusquedaGuardarIvasVentas(Long id_ejercicioBusquedaGuardarIvasVentas) {
		this.id_ejercicioBusquedaGuardarIvasVentas = id_ejercicioBusquedaGuardarIvasVentas;
	}

;
	public Long id_periodoBusquedaGuardarIvasVentas=-1L;

	public Long getid_periodoBusquedaGuardarIvasVentas() {
		return this.id_periodoBusquedaGuardarIvasVentas;
	}

	public void setid_periodoBusquedaGuardarIvasVentas(Long id_periodoBusquedaGuardarIvasVentas) {
		this.id_periodoBusquedaGuardarIvasVentas = id_periodoBusquedaGuardarIvasVentas;
	}

;
	public Long id_tipo_retencion_fuente_ivaBusquedaGuardarIvasVentas=-1L;

	public Long getid_tipo_retencion_fuente_ivaBusquedaGuardarIvasVentas() {
		return this.id_tipo_retencion_fuente_ivaBusquedaGuardarIvasVentas;
	}

	public void setid_tipo_retencion_fuente_ivaBusquedaGuardarIvasVentas(Long id_tipo_retencion_fuente_ivaBusquedaGuardarIvasVentas) {
		this.id_tipo_retencion_fuente_ivaBusquedaGuardarIvasVentas = id_tipo_retencion_fuente_ivaBusquedaGuardarIvasVentas;
	}

	public Long id_ejercicioFK_IdEjercicio=-1L;

	public Long getid_ejercicioFK_IdEjercicio() {
		return this.id_ejercicioFK_IdEjercicio;
	}

	public void setid_ejercicioFK_IdEjercicio(Long id_ejercicioFK_IdEjercicio) {
		this.id_ejercicioFK_IdEjercicio = id_ejercicioFK_IdEjercicio;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_periodoFK_IdPeriodo=-1L;

	public Long getid_periodoFK_IdPeriodo() {
		return this.id_periodoFK_IdPeriodo;
	}

	public void setid_periodoFK_IdPeriodo(Long id_periodoFK_IdPeriodo) {
		this.id_periodoFK_IdPeriodo = id_periodoFK_IdPeriodo;
	}

	public Long id_tipo_retencion_fuente_ivaFK_IdTipoRetencionFuenteIva=-1L;

	public Long getid_tipo_retencion_fuente_ivaFK_IdTipoRetencionFuenteIva() {
		return this.id_tipo_retencion_fuente_ivaFK_IdTipoRetencionFuenteIva;
	}

	public void setid_tipo_retencion_fuente_ivaFK_IdTipoRetencionFuenteIva(Long id_tipo_retencion_fuente_ivaFK_IdTipoRetencionFuenteIva) {
		this.id_tipo_retencion_fuente_ivaFK_IdTipoRetencionFuenteIva = id_tipo_retencion_fuente_ivaFK_IdTipoRetencionFuenteIva;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public GuardarIvasVentasLogic getGuardarIvasVentasLogic()	{		
		return guardarivasventasLogic;
	}

	public void setGuardarIvasVentasLogic(GuardarIvasVentasLogic guardarivasventasLogic) {
		this.guardarivasventasLogic = guardarivasventasLogic;
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
	
	public Boolean getIsEsNuevoGuardarIvasVentas() {
		return isEsNuevoGuardarIvasVentas;
	}

	public void setIsEsNuevoGuardarIvasVentas(Boolean isEsNuevoGuardarIvasVentas) {
		this.isEsNuevoGuardarIvasVentas = isEsNuevoGuardarIvasVentas;
	}

	public Boolean getEsParaAccionDesdeFormularioGuardarIvasVentas() {
		return esParaAccionDesdeFormularioGuardarIvasVentas;
	}
	
	public void setEsParaAccionDesdeFormularioGuardarIvasVentas(Boolean esParaAccionDesdeFormularioGuardarIvasVentas) {
		this.esParaAccionDesdeFormularioGuardarIvasVentas = esParaAccionDesdeFormularioGuardarIvasVentas;
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

			if(this.guardarivasventasSessionBean==null) {
				this.guardarivasventasSessionBean=new GuardarIvasVentasSessionBean();
			}

			if(!this.guardarivasventasSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(guardarivasventasSessionBean.getlidEmpresaActual());
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

	public void cargarCombosEjerciciosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EjercicioLogic ejercicioLogic=new EjercicioLogic();

			//ejercicioLogic.getEjercicioDataAccess().setIsForForeingKeyData(true);

			if(this.guardarivasventasSessionBean==null) {
				this.guardarivasventasSessionBean=new GuardarIvasVentasSessionBean();
			}

			if(!this.guardarivasventasSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//ejercicioLogic.getEjercicioDataAccess().setIsForForeingKeyData(true);

					ejercicioLogic.getTodosEjerciciosWithConnection(sFinalQuery,new Pagination());

					this.ejerciciosForeignKey=ejercicioLogic.getEjercicios();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEjercicio(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					ejercicioLogic.getEntityWithConnection(guardarivasventasSessionBean.getlidEjercicioActual());
					this.ejerciciosForeignKey.add(ejercicioLogic.getEjercicio());
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

	public void cargarCombosPeriodosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.periodosForeignKey=new ArrayList<Periodo>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			PeriodoLogic periodoLogic=new PeriodoLogic();

			//periodoLogic.getPeriodoDataAccess().setIsForForeingKeyData(true);

			if(this.guardarivasventasSessionBean==null) {
				this.guardarivasventasSessionBean=new GuardarIvasVentasSessionBean();
			}

			if(!this.guardarivasventasSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//periodoLogic.getPeriodoDataAccess().setIsForForeingKeyData(true);

					periodoLogic.getTodosPeriodosWithConnection(sFinalQuery,new Pagination());

					this.periodosForeignKey=periodoLogic.getPeriodos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaPeriodo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					periodoLogic.getEntityWithConnection(guardarivasventasSessionBean.getlidPeriodoActual());
					this.periodosForeignKey.add(periodoLogic.getPeriodo());
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

	public void cargarCombosTipoRetencionFuenteIvasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tiporetencionfuenteivasForeignKey=new ArrayList<TipoRetencion>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoRetencionLogic tiporetencionLogic=new TipoRetencionLogic();

			//tiporetencionLogic.getTipoRetencionDataAccess().setIsForForeingKeyData(true);

			if(this.guardarivasventasSessionBean==null) {
				this.guardarivasventasSessionBean=new GuardarIvasVentasSessionBean();
			}

			if(!this.guardarivasventasSessionBean.getisBusquedaDesdeForeignKeySesionTipoRetencionFuenteIva()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tiporetencionfuenteivaLogic.getTipoRetencionDataAccess().setIsForForeingKeyData(true);

					tiporetencionLogic.getTodosTipoRetencionsWithConnection(sFinalQuery,new Pagination());

					this.tiporetencionfuenteivasForeignKey=tiporetencionLogic.getTipoRetencions();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoRetencionFuenteIva(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiporetencionLogic.getEntityWithConnection(guardarivasventasSessionBean.getlidTipoRetencionFuenteIvaActual());
					this.tiporetencionfuenteivasForeignKey.add(tiporetencionLogic.getTipoRetencion());
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

					if(this.guardarivasventas!=null) {
						this.guardarivasventas.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormGuardarIvasVentas!=null) {
						this.jInternalFrameDetalleFormGuardarIvasVentas.jComboBoxid_empresaGuardarIvasVentas.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaGuardarIvasVentas.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormGuardarIvasVentas!=null) {
						if(this.jInternalFrameDetalleFormGuardarIvasVentas.jComboBoxid_empresaGuardarIvasVentas.getItemCount()>0) {
							this.jInternalFrameDetalleFormGuardarIvasVentas.jComboBoxid_empresaGuardarIvasVentas.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaGuardarIvasVentasGenerico)throws Exception
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
				jComboBoxid_empresaGuardarIvasVentasGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaGuardarIvasVentasGenerico!=null && jComboBoxid_empresaGuardarIvasVentasGenerico.getItemCount()>0) {
					jComboBoxid_empresaGuardarIvasVentasGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEjercicioForeignKey(Long idEjercicioSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Ejercicio  ejercicioTemp=null;

			for(Ejercicio ejercicioAux:ejerciciosForeignKey) {
				if(ejercicioAux.getId()!=null && ejercicioAux.getId().equals(idEjercicioSeleccionado)) {
					ejercicioTemp=ejercicioAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(ejercicioTemp!=null) {

					if(this.guardarivasventas!=null) {
						this.guardarivasventas.setEjercicio(ejercicioTemp);
					}

					if(this.jInternalFrameDetalleFormGuardarIvasVentas!=null) {
						this.jInternalFrameDetalleFormGuardarIvasVentas.jComboBoxid_ejercicioGuardarIvasVentas.setSelectedItem(ejercicioTemp);
					}
				} else {
					//jComboBoxid_ejercicioGuardarIvasVentas.setSelectedItem(ejercicioTemp);
					if(this.jInternalFrameDetalleFormGuardarIvasVentas!=null) {
						if(this.jInternalFrameDetalleFormGuardarIvasVentas.jComboBoxid_ejercicioGuardarIvasVentas.getItemCount()>0) {
							this.jInternalFrameDetalleFormGuardarIvasVentas.jComboBoxid_ejercicioGuardarIvasVentas.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaGuardarIvasVentas") || sFormularioTipoBusqueda.equals("Todos")){
					if(ejercicioTemp!=null && jComboBoxid_ejercicioBusquedaGuardarIvasVentasGuardarIvasVentas!=null) {
						jComboBoxid_ejercicioBusquedaGuardarIvasVentasGuardarIvasVentas.setSelectedItem(ejercicioTemp);
					} else {
						if(jComboBoxid_ejercicioBusquedaGuardarIvasVentasGuardarIvasVentas!=null) {
							//jComboBoxid_ejercicioBusquedaGuardarIvasVentasGuardarIvasVentas.setSelectedItem(ejercicioTemp);
							if(jComboBoxid_ejercicioBusquedaGuardarIvasVentasGuardarIvasVentas.getItemCount()>0) {
								jComboBoxid_ejercicioBusquedaGuardarIvasVentasGuardarIvasVentas.setSelectedIndex(0);
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

	public String getActualEjercicioForeignKeyDescripcion(Long idEjercicioSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Ejercicio  ejercicioTemp=null;

			for(Ejercicio ejercicioAux:ejerciciosForeignKey) {
				if(ejercicioAux.getId()!=null && ejercicioAux.getId().equals(idEjercicioSeleccionado)) {
					ejercicioTemp=ejercicioAux;
					break;
				}
			}


			sDescripcion=EjercicioConstantesFunciones.getEjercicioDescripcion(ejercicioTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEjercicioForeignKeyGenerico(Long idEjercicioSeleccionado,JComboBox jComboBoxid_ejercicioGuardarIvasVentasGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioTemp=null;

			for(Ejercicio ejercicioAux:ejerciciosForeignKey) {
				if(ejercicioAux.getId()!=null && ejercicioAux.getId().equals(idEjercicioSeleccionado)) {
					ejercicioTemp=ejercicioAux;
					break;
				}
			}

			if(ejercicioTemp!=null) {
				jComboBoxid_ejercicioGuardarIvasVentasGenerico.setSelectedItem(ejercicioTemp);
			} else {
				if(jComboBoxid_ejercicioGuardarIvasVentasGenerico!=null && jComboBoxid_ejercicioGuardarIvasVentasGenerico.getItemCount()>0) {
					jComboBoxid_ejercicioGuardarIvasVentasGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualPeriodoForeignKey(Long idPeriodoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Periodo  periodoTemp=null;

			for(Periodo periodoAux:periodosForeignKey) {
				if(periodoAux.getId()!=null && periodoAux.getId().equals(idPeriodoSeleccionado)) {
					periodoTemp=periodoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(periodoTemp!=null) {

					if(this.guardarivasventas!=null) {
						this.guardarivasventas.setPeriodo(periodoTemp);
					}

					if(this.jInternalFrameDetalleFormGuardarIvasVentas!=null) {
						this.jInternalFrameDetalleFormGuardarIvasVentas.jComboBoxid_periodoGuardarIvasVentas.setSelectedItem(periodoTemp);
					}
				} else {
					//jComboBoxid_periodoGuardarIvasVentas.setSelectedItem(periodoTemp);
					if(this.jInternalFrameDetalleFormGuardarIvasVentas!=null) {
						if(this.jInternalFrameDetalleFormGuardarIvasVentas.jComboBoxid_periodoGuardarIvasVentas.getItemCount()>0) {
							this.jInternalFrameDetalleFormGuardarIvasVentas.jComboBoxid_periodoGuardarIvasVentas.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaGuardarIvasVentas") || sFormularioTipoBusqueda.equals("Todos")){
					if(periodoTemp!=null && jComboBoxid_periodoBusquedaGuardarIvasVentasGuardarIvasVentas!=null) {
						jComboBoxid_periodoBusquedaGuardarIvasVentasGuardarIvasVentas.setSelectedItem(periodoTemp);
					} else {
						if(jComboBoxid_periodoBusquedaGuardarIvasVentasGuardarIvasVentas!=null) {
							//jComboBoxid_periodoBusquedaGuardarIvasVentasGuardarIvasVentas.setSelectedItem(periodoTemp);
							if(jComboBoxid_periodoBusquedaGuardarIvasVentasGuardarIvasVentas.getItemCount()>0) {
								jComboBoxid_periodoBusquedaGuardarIvasVentasGuardarIvasVentas.setSelectedIndex(0);
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

	public String getActualPeriodoForeignKeyDescripcion(Long idPeriodoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Periodo  periodoTemp=null;

			for(Periodo periodoAux:periodosForeignKey) {
				if(periodoAux.getId()!=null && periodoAux.getId().equals(idPeriodoSeleccionado)) {
					periodoTemp=periodoAux;
					break;
				}
			}


			sDescripcion=PeriodoConstantesFunciones.getPeriodoDescripcion(periodoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualPeriodoForeignKeyGenerico(Long idPeriodoSeleccionado,JComboBox jComboBoxid_periodoGuardarIvasVentasGenerico)throws Exception
	{
		try
		{
			Periodo  periodoTemp=null;

			for(Periodo periodoAux:periodosForeignKey) {
				if(periodoAux.getId()!=null && periodoAux.getId().equals(idPeriodoSeleccionado)) {
					periodoTemp=periodoAux;
					break;
				}
			}

			if(periodoTemp!=null) {
				jComboBoxid_periodoGuardarIvasVentasGenerico.setSelectedItem(periodoTemp);
			} else {
				if(jComboBoxid_periodoGuardarIvasVentasGenerico!=null && jComboBoxid_periodoGuardarIvasVentasGenerico.getItemCount()>0) {
					jComboBoxid_periodoGuardarIvasVentasGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoRetencionFuenteIvaForeignKey(Long idTipoRetencionFuenteIvaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoRetencion  tiporetencionfuenteivaTemp=null;

			for(TipoRetencion tiporetencionfuenteivaAux:tiporetencionfuenteivasForeignKey) {
				if(tiporetencionfuenteivaAux.getId()!=null && tiporetencionfuenteivaAux.getId().equals(idTipoRetencionFuenteIvaSeleccionado)) {
					tiporetencionfuenteivaTemp=tiporetencionfuenteivaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tiporetencionfuenteivaTemp!=null) {

					if(this.guardarivasventas!=null) {
						this.guardarivasventas.setTipoRetencionFuenteIva(tiporetencionfuenteivaTemp);
					}

					if(this.jInternalFrameDetalleFormGuardarIvasVentas!=null) {
						this.jInternalFrameDetalleFormGuardarIvasVentas.jComboBoxid_tipo_retencion_fuente_ivaGuardarIvasVentas.setSelectedItem(tiporetencionfuenteivaTemp);
					}
				} else {
					//jComboBoxid_tipo_retencion_fuente_ivaGuardarIvasVentas.setSelectedItem(tiporetencionfuenteivaTemp);
					if(this.jInternalFrameDetalleFormGuardarIvasVentas!=null) {
						if(this.jInternalFrameDetalleFormGuardarIvasVentas.jComboBoxid_tipo_retencion_fuente_ivaGuardarIvasVentas.getItemCount()>0) {
							this.jInternalFrameDetalleFormGuardarIvasVentas.jComboBoxid_tipo_retencion_fuente_ivaGuardarIvasVentas.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaGuardarIvasVentas") || sFormularioTipoBusqueda.equals("Todos")){
					if(tiporetencionfuenteivaTemp!=null && jComboBoxid_tipo_retencion_fuente_ivaBusquedaGuardarIvasVentasGuardarIvasVentas!=null) {
						jComboBoxid_tipo_retencion_fuente_ivaBusquedaGuardarIvasVentasGuardarIvasVentas.setSelectedItem(tiporetencionfuenteivaTemp);
					} else {
						if(jComboBoxid_tipo_retencion_fuente_ivaBusquedaGuardarIvasVentasGuardarIvasVentas!=null) {
							//jComboBoxid_tipo_retencion_fuente_ivaBusquedaGuardarIvasVentasGuardarIvasVentas.setSelectedItem(tiporetencionfuenteivaTemp);
							if(jComboBoxid_tipo_retencion_fuente_ivaBusquedaGuardarIvasVentasGuardarIvasVentas.getItemCount()>0) {
								jComboBoxid_tipo_retencion_fuente_ivaBusquedaGuardarIvasVentasGuardarIvasVentas.setSelectedIndex(0);
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

	public String getActualTipoRetencionFuenteIvaForeignKeyDescripcion(Long idTipoRetencionFuenteIvaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoRetencion  tiporetencionfuenteivaTemp=null;

			for(TipoRetencion tiporetencionfuenteivaAux:tiporetencionfuenteivasForeignKey) {
				if(tiporetencionfuenteivaAux.getId()!=null && tiporetencionfuenteivaAux.getId().equals(idTipoRetencionFuenteIvaSeleccionado)) {
					tiporetencionfuenteivaTemp=tiporetencionfuenteivaAux;
					break;
				}
			}


			sDescripcion=TipoRetencionConstantesFunciones.getTipoRetencionDescripcion(tiporetencionfuenteivaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoRetencionFuenteIvaForeignKeyGenerico(Long idTipoRetencionFuenteIvaSeleccionado,JComboBox jComboBoxid_tipo_retencion_fuente_ivaGuardarIvasVentasGenerico)throws Exception
	{
		try
		{
			TipoRetencion  tiporetencionfuenteivaTemp=null;

			for(TipoRetencion tiporetencionfuenteivaAux:tiporetencionfuenteivasForeignKey) {
				if(tiporetencionfuenteivaAux.getId()!=null && tiporetencionfuenteivaAux.getId().equals(idTipoRetencionFuenteIvaSeleccionado)) {
					tiporetencionfuenteivaTemp=tiporetencionfuenteivaAux;
					break;
				}
			}

			if(tiporetencionfuenteivaTemp!=null) {
				jComboBoxid_tipo_retencion_fuente_ivaGuardarIvasVentasGenerico.setSelectedItem(tiporetencionfuenteivaTemp);
			} else {
				if(jComboBoxid_tipo_retencion_fuente_ivaGuardarIvasVentasGenerico!=null && jComboBoxid_tipo_retencion_fuente_ivaGuardarIvasVentasGenerico.getItemCount()>0) {
					jComboBoxid_tipo_retencion_fuente_ivaGuardarIvasVentasGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(GuardarIvasVentas guardarivasventas,JComboBox jComboBoxid_empresaGuardarIvasVentasGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaGuardarIvasVentasGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormGuardarIvasVentas.jComboBoxid_empresaGuardarIvasVentas.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaGuardarIvasVentasGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				guardarivasventas.setid_empresa(empresaAux.getId());
				guardarivasventas.setempresa_descripcion(GuardarIvasVentasConstantesFunciones.getEmpresaDescripcion(empresaAux));
				guardarivasventas.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEjercicioForeignKey(GuardarIvasVentas guardarivasventas,JComboBox jComboBoxid_ejercicioGuardarIvasVentasGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioAux=new Ejercicio();

			if(jComboBoxid_ejercicioGuardarIvasVentasGenerico==null) {
				ejercicioAux=(Ejercicio)this.jInternalFrameDetalleFormGuardarIvasVentas.jComboBoxid_ejercicioGuardarIvasVentas.getSelectedItem();
			} else {
				ejercicioAux=(Ejercicio)jComboBoxid_ejercicioGuardarIvasVentasGenerico.getSelectedItem();
			}

			if(ejercicioAux!=null && ejercicioAux.getId()!=null) {
				guardarivasventas.setid_ejercicio(ejercicioAux.getId());
				guardarivasventas.setejercicio_descripcion(GuardarIvasVentasConstantesFunciones.getEjercicioDescripcion(ejercicioAux));
				guardarivasventas.setEjercicio(ejercicioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPeriodoForeignKey(GuardarIvasVentas guardarivasventas,JComboBox jComboBoxid_periodoGuardarIvasVentasGenerico)throws Exception
	{
		try
		{
			Periodo  periodoAux=new Periodo();

			if(jComboBoxid_periodoGuardarIvasVentasGenerico==null) {
				periodoAux=(Periodo)this.jInternalFrameDetalleFormGuardarIvasVentas.jComboBoxid_periodoGuardarIvasVentas.getSelectedItem();
			} else {
				periodoAux=(Periodo)jComboBoxid_periodoGuardarIvasVentasGenerico.getSelectedItem();
			}

			if(periodoAux!=null && periodoAux.getId()!=null) {
				guardarivasventas.setid_periodo(periodoAux.getId());
				guardarivasventas.setperiodo_descripcion(GuardarIvasVentasConstantesFunciones.getPeriodoDescripcion(periodoAux));
				guardarivasventas.setPeriodo(periodoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoRetencionFuenteIvaForeignKey(GuardarIvasVentas guardarivasventas,JComboBox jComboBoxid_tipo_retencion_fuente_ivaGuardarIvasVentasGenerico)throws Exception
	{
		try
		{
			TipoRetencion  tiporetencionAux=new TipoRetencion();

			if(jComboBoxid_tipo_retencion_fuente_ivaGuardarIvasVentasGenerico==null) {
				tiporetencionAux=(TipoRetencion)this.jInternalFrameDetalleFormGuardarIvasVentas.jComboBoxid_tipo_retencion_fuente_ivaGuardarIvasVentas.getSelectedItem();
			} else {
				tiporetencionAux=(TipoRetencion)jComboBoxid_tipo_retencion_fuente_ivaGuardarIvasVentasGenerico.getSelectedItem();
			}

			if(tiporetencionAux!=null && tiporetencionAux.getId()!=null) {
				guardarivasventas.setid_tipo_retencion_fuente_iva(tiporetencionAux.getId());
				guardarivasventas.settiporetencionfuenteiva_descripcion(GuardarIvasVentasConstantesFunciones.getTipoRetencionFuenteIvaDescripcion(tiporetencionAux));
				guardarivasventas.setTipoRetencionFuenteIva(tiporetencionAux);			}
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

					if(!GuardarIvasVentasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormGuardarIvasVentas!=null) { 
							this.jInternalFrameDetalleFormGuardarIvasVentas.jComboBoxid_empresaGuardarIvasVentas.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormGuardarIvasVentas.jComboBoxid_empresaGuardarIvasVentas.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormGuardarIvasVentas!=null) { 
					}

					if(!GuardarIvasVentasJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEjerciciosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEjercicio=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!GuardarIvasVentasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormGuardarIvasVentas!=null) { 
							this.jInternalFrameDetalleFormGuardarIvasVentas.jComboBoxid_ejercicioGuardarIvasVentas.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jInternalFrameDetalleFormGuardarIvasVentas.jComboBoxid_ejercicioGuardarIvasVentas.addItem(ejercicio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormGuardarIvasVentas!=null) { 
					}

					if(!GuardarIvasVentasJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaGuardarIvasVentas") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!GuardarIvasVentasJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_ejercicioBusquedaGuardarIvasVentasGuardarIvasVentas.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jComboBoxid_ejercicioBusquedaGuardarIvasVentasGuardarIvasVentas.addItem(ejercicio);
							}
						}

						if(!GuardarIvasVentasJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFramePeriodosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingPeriodo=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!GuardarIvasVentasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormGuardarIvasVentas!=null) { 
							this.jInternalFrameDetalleFormGuardarIvasVentas.jComboBoxid_periodoGuardarIvasVentas.removeAllItems();

							for(Periodo periodo:this.periodosForeignKey) {
								this.jInternalFrameDetalleFormGuardarIvasVentas.jComboBoxid_periodoGuardarIvasVentas.addItem(periodo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormGuardarIvasVentas!=null) { 
					}

					if(!GuardarIvasVentasJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaGuardarIvasVentas") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!GuardarIvasVentasJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_periodoBusquedaGuardarIvasVentasGuardarIvasVentas.removeAllItems();

							for(Periodo periodo:this.periodosForeignKey) {
								this.jComboBoxid_periodoBusquedaGuardarIvasVentasGuardarIvasVentas.addItem(periodo);
							}
						}

						if(!GuardarIvasVentasJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoRetencionFuenteIvasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoRetencion=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!GuardarIvasVentasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormGuardarIvasVentas!=null) { 
							this.jInternalFrameDetalleFormGuardarIvasVentas.jComboBoxid_tipo_retencion_fuente_ivaGuardarIvasVentas.removeAllItems();

							for(TipoRetencion tiporetencionfuenteiva:this.tiporetencionfuenteivasForeignKey) {
								this.jInternalFrameDetalleFormGuardarIvasVentas.jComboBoxid_tipo_retencion_fuente_ivaGuardarIvasVentas.addItem(tiporetencionfuenteiva);
							}
						}
					}

					if(this.jInternalFrameDetalleFormGuardarIvasVentas!=null) { 
					}

					if(!GuardarIvasVentasJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaGuardarIvasVentas") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!GuardarIvasVentasJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_retencion_fuente_ivaBusquedaGuardarIvasVentasGuardarIvasVentas.removeAllItems();

							for(TipoRetencion tiporetencionfuenteiva:this.tiporetencionfuenteivasForeignKey) {
								this.jComboBoxid_tipo_retencion_fuente_ivaBusquedaGuardarIvasVentasGuardarIvasVentas.addItem(tiporetencionfuenteiva);
							}
						}

						if(!GuardarIvasVentasJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormGuardarIvasVentas!=null) {
							this.jInternalFrameDetalleFormGuardarIvasVentas.jComboBoxid_empresaGuardarIvasVentas.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormGuardarIvasVentas!=null) {
							this.jInternalFrameDetalleFormGuardarIvasVentas.jComboBoxid_empresaGuardarIvasVentas.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameEjercicioForeignKey(Ejercicio ejercicio,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormGuardarIvasVentas!=null) {
							this.jInternalFrameDetalleFormGuardarIvasVentas.jComboBoxid_ejercicioGuardarIvasVentas.setSelectedItem(ejercicio);
						}
					} else {
						if(this.jInternalFrameDetalleFormGuardarIvasVentas!=null) {
							this.jInternalFrameDetalleFormGuardarIvasVentas.jComboBoxid_ejercicioGuardarIvasVentas.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_ejercicioBusquedaGuardarIvasVentasGuardarIvasVentas.setSelectedItem(ejercicio);
						} else {
							this.jComboBoxid_ejercicioBusquedaGuardarIvasVentasGuardarIvasVentas.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFramePeriodoForeignKey(Periodo periodo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormGuardarIvasVentas!=null) {
							this.jInternalFrameDetalleFormGuardarIvasVentas.jComboBoxid_periodoGuardarIvasVentas.setSelectedItem(periodo);
						}
					} else {
						if(this.jInternalFrameDetalleFormGuardarIvasVentas!=null) {
							this.jInternalFrameDetalleFormGuardarIvasVentas.jComboBoxid_periodoGuardarIvasVentas.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_periodoBusquedaGuardarIvasVentasGuardarIvasVentas.setSelectedItem(periodo);
						} else {
							this.jComboBoxid_periodoBusquedaGuardarIvasVentasGuardarIvasVentas.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoRetencionFuenteIvaForeignKey(TipoRetencion tiporetencionfuenteiva,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormGuardarIvasVentas!=null) {
							this.jInternalFrameDetalleFormGuardarIvasVentas.jComboBoxid_tipo_retencion_fuente_ivaGuardarIvasVentas.setSelectedItem(tiporetencionfuenteiva);
						}
					} else {
						if(this.jInternalFrameDetalleFormGuardarIvasVentas!=null) {
							this.jInternalFrameDetalleFormGuardarIvasVentas.jComboBoxid_tipo_retencion_fuente_ivaGuardarIvasVentas.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_retencion_fuente_ivaBusquedaGuardarIvasVentasGuardarIvasVentas.setSelectedItem(tiporetencionfuenteiva);
						} else {
							this.jComboBoxid_tipo_retencion_fuente_ivaBusquedaGuardarIvasVentasGuardarIvasVentas.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesGuardarIvasVentas() throws Exception {
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
		
	public GuardarIvasVentasParameterReturnGeneral getGuardarIvasVentasParameterGeneral() {
		return this.guardarivasventasParameterGeneral;
	}
	
	public void setGuardarIvasVentasParameterGeneral(GuardarIvasVentasParameterReturnGeneral guardarivasventasParameterGeneral) {
		this.guardarivasventasParameterGeneral = guardarivasventasParameterGeneral;
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
	
	public Boolean getIsPermisoTodoGuardarIvasVentas() {
		return isPermisoTodoGuardarIvasVentas;
	}

	public void setIsPermisoTodoGuardarIvasVentas(Boolean isPermisoTodoGuardarIvasVentas) {
		this.isPermisoTodoGuardarIvasVentas = isPermisoTodoGuardarIvasVentas;
	}

	public Boolean getIsPermisoNuevoGuardarIvasVentas() {
		return isPermisoNuevoGuardarIvasVentas;
	}

	public void setIsPermisoNuevoGuardarIvasVentas(Boolean isPermisoNuevoGuardarIvasVentas) {
		this.isPermisoNuevoGuardarIvasVentas = isPermisoNuevoGuardarIvasVentas;
	}

	public Boolean getIsPermisoActualizarGuardarIvasVentas() {
		return isPermisoActualizarGuardarIvasVentas;
	}

	public void setIsPermisoActualizarGuardarIvasVentas(Boolean isPermisoActualizarGuardarIvasVentas) {
		this.isPermisoActualizarGuardarIvasVentas = isPermisoActualizarGuardarIvasVentas;
	}

	public Boolean getIsPermisoEliminarGuardarIvasVentas() {
		return isPermisoEliminarGuardarIvasVentas;
	}

	public void setIsPermisoEliminarGuardarIvasVentas(Boolean isPermisoEliminarGuardarIvasVentas) {
		this.isPermisoEliminarGuardarIvasVentas = isPermisoEliminarGuardarIvasVentas;
	}

	public Boolean getIsPermisoGuardarCambiosGuardarIvasVentas() {
		return isPermisoGuardarCambiosGuardarIvasVentas;
	}

	public void setIsPermisoGuardarCambiosGuardarIvasVentas(Boolean isPermisoGuardarCambiosGuardarIvasVentas) {
		this.isPermisoGuardarCambiosGuardarIvasVentas = isPermisoGuardarCambiosGuardarIvasVentas;
	}
	
	public Boolean getIsPermisoConsultaGuardarIvasVentas() {
		return isPermisoConsultaGuardarIvasVentas;
	}

	public void setIsPermisoConsultaGuardarIvasVentas(Boolean isPermisoConsultaGuardarIvasVentas) {
		this.isPermisoConsultaGuardarIvasVentas = isPermisoConsultaGuardarIvasVentas;
	}

	public Boolean getIsPermisoBusquedaGuardarIvasVentas() {
		return isPermisoBusquedaGuardarIvasVentas;
	}

	public void setIsPermisoBusquedaGuardarIvasVentas(Boolean isPermisoBusquedaGuardarIvasVentas) {
		this.isPermisoBusquedaGuardarIvasVentas = isPermisoBusquedaGuardarIvasVentas;
	}

	public Boolean getIsPermisoReporteGuardarIvasVentas() {
		return isPermisoReporteGuardarIvasVentas;
	}

	public void setIsPermisoReporteGuardarIvasVentas(Boolean isPermisoReporteGuardarIvasVentas) {
		this.isPermisoReporteGuardarIvasVentas = isPermisoReporteGuardarIvasVentas;
	}
	
	public Boolean getIsPermisoPaginacionMedioGuardarIvasVentas() {
		return isPermisoPaginacionMedioGuardarIvasVentas;
	}

	public void setIsPermisoPaginacionMedioGuardarIvasVentas(Boolean isPermisoPaginacionMedioGuardarIvasVentas) {
		this.isPermisoPaginacionMedioGuardarIvasVentas = isPermisoPaginacionMedioGuardarIvasVentas;
	}
	
	public Boolean getIsPermisoPaginacionTodoGuardarIvasVentas() {
		return isPermisoPaginacionTodoGuardarIvasVentas;
	}

	public void setIsPermisoPaginacionTodoGuardarIvasVentas(Boolean isPermisoPaginacionTodoGuardarIvasVentas) {
		this.isPermisoPaginacionTodoGuardarIvasVentas = isPermisoPaginacionTodoGuardarIvasVentas;
	}
	
	public Boolean getIsPermisoPaginacionAltoGuardarIvasVentas() {
		return isPermisoPaginacionAltoGuardarIvasVentas;
	}

	public void setIsPermisoPaginacionAltoGuardarIvasVentas(Boolean isPermisoPaginacionAltoGuardarIvasVentas) {
		this.isPermisoPaginacionAltoGuardarIvasVentas = isPermisoPaginacionAltoGuardarIvasVentas;
	}
	
	public Boolean getIsPermisoCopiarGuardarIvasVentas() {
		return isPermisoCopiarGuardarIvasVentas;
	}

	public void setIsPermisoCopiarGuardarIvasVentas(Boolean isPermisoCopiarGuardarIvasVentas) {
		this.isPermisoCopiarGuardarIvasVentas = isPermisoCopiarGuardarIvasVentas;
	}
	
	public Boolean getIsPermisoVerFormGuardarIvasVentas() {
		return isPermisoVerFormGuardarIvasVentas;
	}

	public void setIsPermisoVerFormGuardarIvasVentas(Boolean isPermisoVerFormGuardarIvasVentas) {
		this.isPermisoVerFormGuardarIvasVentas = isPermisoVerFormGuardarIvasVentas;
	}
	
	public Boolean getIsPermisoDuplicarGuardarIvasVentas() {
		return isPermisoDuplicarGuardarIvasVentas;
	}

	public void setIsPermisoDuplicarGuardarIvasVentas(Boolean isPermisoDuplicarGuardarIvasVentas) {
		this.isPermisoDuplicarGuardarIvasVentas = isPermisoDuplicarGuardarIvasVentas;
	}
	
	public Boolean getIsPermisoOrdenGuardarIvasVentas() {
		return isPermisoOrdenGuardarIvasVentas;
	}

	public void setIsPermisoOrdenGuardarIvasVentas(Boolean isPermisoOrdenGuardarIvasVentas) {
		this.isPermisoOrdenGuardarIvasVentas = isPermisoOrdenGuardarIvasVentas;
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
	
	public Boolean getIsVisibilidadCeldaNuevoGuardarIvasVentas() {
		return isVisibilidadCeldaNuevoGuardarIvasVentas;
	}

	public void setIsVisibilidadCeldaNuevoGuardarIvasVentas(Boolean isVisibilidadCeldaNuevoGuardarIvasVentas) {
		this.isVisibilidadCeldaNuevoGuardarIvasVentas = isVisibilidadCeldaNuevoGuardarIvasVentas;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarGuardarIvasVentas() {
		return isVisibilidadCeldaDuplicarGuardarIvasVentas;
	}

	public void setIsVisibilidadCeldaDuplicarGuardarIvasVentas(Boolean isVisibilidadCeldaDuplicarGuardarIvasVentas) {
		this.isVisibilidadCeldaDuplicarGuardarIvasVentas = isVisibilidadCeldaDuplicarGuardarIvasVentas;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarGuardarIvasVentas() {
		return isVisibilidadCeldaCopiarGuardarIvasVentas;
	}

	public void setIsVisibilidadCeldaCopiarGuardarIvasVentas(Boolean isVisibilidadCeldaCopiarGuardarIvasVentas) {
		this.isVisibilidadCeldaCopiarGuardarIvasVentas = isVisibilidadCeldaCopiarGuardarIvasVentas;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormGuardarIvasVentas() {
		return isVisibilidadCeldaVerFormGuardarIvasVentas;
	}

	public void setIsVisibilidadCeldaVerFormGuardarIvasVentas(Boolean isVisibilidadCeldaVerFormGuardarIvasVentas) {
		this.isVisibilidadCeldaVerFormGuardarIvasVentas = isVisibilidadCeldaVerFormGuardarIvasVentas;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenGuardarIvasVentas() {
		return isVisibilidadCeldaOrdenGuardarIvasVentas;
	}

	public void setIsVisibilidadCeldaOrdenGuardarIvasVentas(Boolean isVisibilidadCeldaOrdenGuardarIvasVentas) {
		this.isVisibilidadCeldaOrdenGuardarIvasVentas = isVisibilidadCeldaOrdenGuardarIvasVentas;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesGuardarIvasVentas() {
		return isVisibilidadCeldaNuevoRelacionesGuardarIvasVentas;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesGuardarIvasVentas(Boolean isVisibilidadCeldaNuevoRelacionesGuardarIvasVentas) {
		this.isVisibilidadCeldaNuevoRelacionesGuardarIvasVentas = isVisibilidadCeldaNuevoRelacionesGuardarIvasVentas;
	}
	
	public Boolean getIsVisibilidadCeldaModificarGuardarIvasVentas() {
		return isVisibilidadCeldaModificarGuardarIvasVentas;
	}

	public void setIsVisibilidadCeldaModificarGuardarIvasVentas(Boolean isVisibilidadCeldaModificarGuardarIvasVentas) {
		this.isVisibilidadCeldaModificarGuardarIvasVentas = isVisibilidadCeldaModificarGuardarIvasVentas;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarGuardarIvasVentas() {
		return isVisibilidadCeldaActualizarGuardarIvasVentas;
	}

	public void setIsVisibilidadCeldaActualizarGuardarIvasVentas(Boolean isVisibilidadCeldaActualizarGuardarIvasVentas) {
		this.isVisibilidadCeldaActualizarGuardarIvasVentas = isVisibilidadCeldaActualizarGuardarIvasVentas;
	}

	public Boolean getIsVisibilidadCeldaEliminarGuardarIvasVentas() {
		return isVisibilidadCeldaEliminarGuardarIvasVentas;
	}

	public void setIsVisibilidadCeldaEliminarGuardarIvasVentas(Boolean isVisibilidadCeldaEliminarGuardarIvasVentas) {
		this.isVisibilidadCeldaEliminarGuardarIvasVentas = isVisibilidadCeldaEliminarGuardarIvasVentas;
	}

	public Boolean getIsVisibilidadCeldaCancelarGuardarIvasVentas() {
		return isVisibilidadCeldaCancelarGuardarIvasVentas;
	}

	public void setIsVisibilidadCeldaCancelarGuardarIvasVentas(Boolean isVisibilidadCeldaCancelarGuardarIvasVentas) {
		this.isVisibilidadCeldaCancelarGuardarIvasVentas = isVisibilidadCeldaCancelarGuardarIvasVentas;
	}

	public Boolean getIsVisibilidadCeldaGuardarGuardarIvasVentas() {
		return isVisibilidadCeldaGuardarGuardarIvasVentas;
	}

	public void setIsVisibilidadCeldaGuardarGuardarIvasVentas(Boolean isVisibilidadCeldaGuardarGuardarIvasVentas) {
		this.isVisibilidadCeldaGuardarGuardarIvasVentas = isVisibilidadCeldaGuardarGuardarIvasVentas;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosGuardarIvasVentas() {
		return isVisibilidadCeldaGuardarCambiosGuardarIvasVentas;
	}

	public void setIsVisibilidadCeldaGuardarCambiosGuardarIvasVentas(Boolean isVisibilidadCeldaGuardarCambiosGuardarIvasVentas) {
		this.isVisibilidadCeldaGuardarCambiosGuardarIvasVentas = isVisibilidadCeldaGuardarCambiosGuardarIvasVentas;
	}
		
	public GuardarIvasVentasSessionBean getguardarivasventasSessionBean() {
		return this.guardarivasventasSessionBean;
	}
	
	public void setguardarivasventasSessionBean(GuardarIvasVentasSessionBean guardarivasventasSessionBean) {
		this.guardarivasventasSessionBean=guardarivasventasSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaGuardarIvasVentas() {
		return this.isVisibilidadBusquedaGuardarIvasVentas;
	}

	public void setisVisibilidadBusquedaGuardarIvasVentas(Boolean isVisibilidadBusquedaGuardarIvasVentas) {
		this.isVisibilidadBusquedaGuardarIvasVentas=isVisibilidadBusquedaGuardarIvasVentas;
	}

	public Boolean getisVisibilidadFK_IdEjercicio() {
		return this.isVisibilidadFK_IdEjercicio;
	}

	public void setisVisibilidadFK_IdEjercicio(Boolean isVisibilidadFK_IdEjercicio) {
		this.isVisibilidadFK_IdEjercicio=isVisibilidadFK_IdEjercicio;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdPeriodo() {
		return this.isVisibilidadFK_IdPeriodo;
	}

	public void setisVisibilidadFK_IdPeriodo(Boolean isVisibilidadFK_IdPeriodo) {
		this.isVisibilidadFK_IdPeriodo=isVisibilidadFK_IdPeriodo;
	}

	public Boolean getisVisibilidadFK_IdTipoRetencionFuenteIva() {
		return this.isVisibilidadFK_IdTipoRetencionFuenteIva;
	}

	public void setisVisibilidadFK_IdTipoRetencionFuenteIva(Boolean isVisibilidadFK_IdTipoRetencionFuenteIva) {
		this.isVisibilidadFK_IdTipoRetencionFuenteIva=isVisibilidadFK_IdTipoRetencionFuenteIva;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysGuardarIvasVentas(GuardarIvasVentas guardarivasventas)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(guardarivasventas,null);
				this.setActualParaGuardarEjercicioForeignKey(guardarivasventas,null);
				this.setActualParaGuardarPeriodoForeignKey(guardarivasventas,null);
				this.setActualParaGuardarTipoRetencionFuenteIvaForeignKey(guardarivasventas,null);
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
	
	public void bugActualizarReferenciaActual(GuardarIvasVentas guardarivasventas,GuardarIvasVentas guardarivasventasAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalGuardarIvasVentas(guardarivasventas);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		guardarivasventasAux.setId(guardarivasventas.getId());
		guardarivasventasAux.setVersionRow(guardarivasventas.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(GuardarIvasVentas guardarivasventasLocal) throws Exception {
		
		if(this.guardarivasventasSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(GuardarIvasVentas guardarivasventasLocal) throws Exception {	
		if(this.guardarivasventasSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				guardarivasventasLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EjercicioDetalleFormJInternalFrame.class)) {
				EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrameLocal=(EjercicioBeanSwingJInternalFrame) ((EjercicioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ejercicioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEjercicio(ejercicioBeanSwingJInternalFrameLocal.getejercicio(),true);
				ejercicioBeanSwingJInternalFrameLocal.actualizarLista(ejercicioBeanSwingJInternalFrameLocal.ejercicio,this.ejerciciosForeignKey);

				ejercicioBeanSwingJInternalFrameLocal.actualizarRelaciones(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				guardarivasventasLocal.setEjercicio(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				this.addItemDefectoCombosForeignKeyEjercicio();
				this.cargarCombosFrameEjerciciosForeignKey("Formulario");
				this.setActualEjercicioForeignKey(ejercicioBeanSwingJInternalFrameLocal.ejercicio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PeriodoDetalleFormJInternalFrame.class)) {
				PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrameLocal=(PeriodoBeanSwingJInternalFrame) ((PeriodoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				periodoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPeriodo(periodoBeanSwingJInternalFrameLocal.getperiodo(),true);
				periodoBeanSwingJInternalFrameLocal.actualizarLista(periodoBeanSwingJInternalFrameLocal.periodo,this.periodosForeignKey);

				periodoBeanSwingJInternalFrameLocal.actualizarRelaciones(periodoBeanSwingJInternalFrameLocal.periodo);

				guardarivasventasLocal.setPeriodo(periodoBeanSwingJInternalFrameLocal.periodo);

				this.addItemDefectoCombosForeignKeyPeriodo();
				this.cargarCombosFramePeriodosForeignKey("Formulario");
				this.setActualPeriodoForeignKey(periodoBeanSwingJInternalFrameLocal.periodo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoRetencionDetalleFormJInternalFrame.class)) {
				TipoRetencionBeanSwingJInternalFrame tiporetencionfuenteivaBeanSwingJInternalFrameLocal=(TipoRetencionBeanSwingJInternalFrame) ((TipoRetencionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tiporetencionfuenteivaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoRetencion(tiporetencionfuenteivaBeanSwingJInternalFrameLocal.gettiporetencion(),true);
				tiporetencionfuenteivaBeanSwingJInternalFrameLocal.actualizarLista(tiporetencionfuenteivaBeanSwingJInternalFrameLocal.tiporetencion,this.tiporetencionfuenteivasForeignKey);

				tiporetencionfuenteivaBeanSwingJInternalFrameLocal.actualizarRelaciones(tiporetencionfuenteivaBeanSwingJInternalFrameLocal.tiporetencion);

				guardarivasventasLocal.setTipoRetencionFuenteIva(tiporetencionfuenteivaBeanSwingJInternalFrameLocal.tiporetencion);

				this.addItemDefectoCombosForeignKeyTipoRetencionFuenteIva();
				this.cargarCombosFrameTipoRetencionFuenteIvasForeignKey("Formulario");
				this.setActualTipoRetencionFuenteIvaForeignKey(tiporetencionfuenteivaBeanSwingJInternalFrameLocal.tiporetencion.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarGuardarIvasVentasActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosGuardarIvasVentas.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.guardarivasventas =(GuardarIvasVentas) this.guardarivasventasLogic.getGuardarIvasVentass().toArray()[this.jTableDatosGuardarIvasVentas.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.guardarivasventas =(GuardarIvasVentas) this.guardarivasventass.toArray()[this.jTableDatosGuardarIvasVentas.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = guardarivasventasValidator.getInvalidValues(this.guardarivasventas);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(GuardarIvasVentas guardarivasventas,List<GuardarIvasVentas> guardarivasventass) throws Exception {
	}		
	
	public void actualizarSelectedLista(GuardarIvasVentas guardarivasventas,List<GuardarIvasVentas> guardarivasventass) throws Exception {
		try	{			
			GuardarIvasVentasConstantesFunciones.actualizarSelectedLista(guardarivasventas,guardarivasventass);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<GuardarIvasVentas> guardarivasventassLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				guardarivasventassLocal=this.guardarivasventasLogic.getGuardarIvasVentass();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				guardarivasventassLocal=this.guardarivasventass;
			}
			//ARCHITECTURE
		
			for(GuardarIvasVentas guardarivasventasLocal:guardarivasventassLocal) {
				if(this.permiteMantenimiento(guardarivasventasLocal) && guardarivasventasLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+GuardarIvasVentasConstantesFunciones.getGuardarIvasVentasLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(GuardarIvasVentasConstantesFunciones.CODIGOESTADOASIENTOCONTABLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGuardarIvasVentas.jLabelcodigo_estado_asiento_contableGuardarIvasVentas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(GuardarIvasVentasConstantesFunciones.NOMBREPERIODO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGuardarIvasVentas.jLabelnombre_periodoGuardarIvasVentas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(GuardarIvasVentasConstantesFunciones.NOMBRETIPORETENCIONFUENTEIVA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGuardarIvasVentas.jLabelnombre_tipo_retencion_fuente_ivaGuardarIvasVentas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(GuardarIvasVentasConstantesFunciones.PORCENTAJE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGuardarIvasVentas.jLabelporcentajeGuardarIvasVentas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(GuardarIvasVentasConstantesFunciones.BASEIMPONIBLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGuardarIvasVentas.jLabelbase_imponibleGuardarIvasVentas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(GuardarIvasVentasConstantesFunciones.VALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGuardarIvasVentas.jLabelvalorGuardarIvasVentas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(GuardarIvasVentasConstantesFunciones.NUMERO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGuardarIvasVentas.jLabelnumeroGuardarIvasVentas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(GuardarIvasVentasConstantesFunciones.RUCBENEF)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGuardarIvasVentas.jLabelruc_benefGuardarIvasVentas,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormGuardarIvasVentas!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormGuardarIvasVentas.jLabelcodigo_estado_asiento_contableGuardarIvasVentas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormGuardarIvasVentas.jLabelnombre_periodoGuardarIvasVentas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormGuardarIvasVentas.jLabelnombre_tipo_retencion_fuente_ivaGuardarIvasVentas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormGuardarIvasVentas.jLabelporcentajeGuardarIvasVentas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormGuardarIvasVentas.jLabelbase_imponibleGuardarIvasVentas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormGuardarIvasVentas.jLabelvalorGuardarIvasVentas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormGuardarIvasVentas.jLabelnumeroGuardarIvasVentas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormGuardarIvasVentas.jLabelruc_benefGuardarIvasVentas,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoGuardarIvasVentas--;	
		
		
		this.guardarivasventasAux=new GuardarIvasVentas();
		
		this.guardarivasventasAux.setId(this.iIdNuevoGuardarIvasVentas);
		this.guardarivasventasAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.guardarivasventasLogic.getGuardarIvasVentass().add(this.guardarivasventasAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.guardarivasventass.add(this.guardarivasventasAux);
		}
		//ARCHITECTURE
		
		this.guardarivasventas=this.guardarivasventasAux;
		
		if(GuardarIvasVentasJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioGuardarIvasVentas(this.guardarivasventas);
			this.setVariablesObjetoActualToFormularioForeignKeyGuardarIvasVentas(this.guardarivasventas);
		}
				
		//this.setDefaultControlesGuardarIvasVentas();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyGuardarIvasVentas();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyGuardarIvasVentas();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyGuardarIvasVentas();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualGuardarIvasVentas(this.guardarivasventasBean,this.guardarivasventas,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysGuardarIvasVentas(this.guardarivasventas);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanGuardarIvasVentas(this.guardarivasventasReturnGeneral,this.guardarivasventasBean,false);
		
		if(this.guardarivasventasReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyGuardarIvasVentas(this.guardarivasventasReturnGeneral.getGuardarIvasVentas());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioGuardarIvasVentas(this.guardarivasventasReturnGeneral.getGuardarIvasVentas());
		}
		
		if(this.guardarivasventasReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioGuardarIvasVentas(this.guardarivasventasReturnGeneral.getGuardarIvasVentas(),classes);//this.guardarivasventasBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualGuardarIvasVentas(this.guardarivasventas,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyGuardarIvasVentas();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyGuardarIvasVentas();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			GuardarIvasVentasBeanSwingJInternalFrameAdditional.RecargarFormGuardarIvasVentas(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingGuardarIvasVentas(false);
						
			if(guardarivasventasSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(GuardarIvasVentasJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualGuardarIvasVentas();
			}
			
			this.actualizarVisualTableDatosGuardarIvasVentas();
			
			this.jTableDatosGuardarIvasVentas.setRowSelectionInterval(this.getIndiceNuevoGuardarIvasVentas(), this.getIndiceNuevoGuardarIvasVentas());
			
			this.seleccionarFilaTablaGuardarIvasVentasActual();
						
			this.actualizarEstadoCeldasBotonesGuardarIvasVentas("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesGuardarIvasVentas(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormGuardarIvasVentas.jTextFieldcodigo_estado_asiento_contableGuardarIvasVentas.setEnabled(isHabilitar && this.guardarivasventasConstantesFunciones.activarcodigo_estado_asiento_contableGuardarIvasVentas);
		this.jInternalFrameDetalleFormGuardarIvasVentas.jTextFieldnombre_periodoGuardarIvasVentas.setEnabled(isHabilitar && this.guardarivasventasConstantesFunciones.activarnombre_periodoGuardarIvasVentas);
		this.jInternalFrameDetalleFormGuardarIvasVentas.jTextAreanombre_tipo_retencion_fuente_ivaGuardarIvasVentas.setEnabled(isHabilitar && this.guardarivasventasConstantesFunciones.activarnombre_tipo_retencion_fuente_ivaGuardarIvasVentas);
		this.jInternalFrameDetalleFormGuardarIvasVentas.jTextFieldporcentajeGuardarIvasVentas.setEnabled(isHabilitar && this.guardarivasventasConstantesFunciones.activarporcentajeGuardarIvasVentas);
		this.jInternalFrameDetalleFormGuardarIvasVentas.jTextFieldbase_imponibleGuardarIvasVentas.setEnabled(isHabilitar && this.guardarivasventasConstantesFunciones.activarbase_imponibleGuardarIvasVentas);
		this.jInternalFrameDetalleFormGuardarIvasVentas.jTextFieldvalorGuardarIvasVentas.setEnabled(isHabilitar && this.guardarivasventasConstantesFunciones.activarvalorGuardarIvasVentas);
		this.jInternalFrameDetalleFormGuardarIvasVentas.jTextFieldnumeroGuardarIvasVentas.setEnabled(isHabilitar && this.guardarivasventasConstantesFunciones.activarnumeroGuardarIvasVentas);
		this.jInternalFrameDetalleFormGuardarIvasVentas.jTextFieldruc_benefGuardarIvasVentas.setEnabled(isHabilitar && this.guardarivasventasConstantesFunciones.activarruc_benefGuardarIvasVentas);	
		//
		this.jInternalFrameDetalleFormGuardarIvasVentas.jComboBoxid_empresaGuardarIvasVentas.setEnabled(isHabilitar && this.guardarivasventasConstantesFunciones.activarid_empresaGuardarIvasVentas);//
		this.jInternalFrameDetalleFormGuardarIvasVentas.jComboBoxid_ejercicioGuardarIvasVentas.setEnabled(isHabilitar && this.guardarivasventasConstantesFunciones.activarid_ejercicioGuardarIvasVentas);//
		this.jInternalFrameDetalleFormGuardarIvasVentas.jComboBoxid_periodoGuardarIvasVentas.setEnabled(isHabilitar && this.guardarivasventasConstantesFunciones.activarid_periodoGuardarIvasVentas);
		this.jInternalFrameDetalleFormGuardarIvasVentas.jComboBoxid_tipo_retencion_fuente_ivaGuardarIvasVentas.setEnabled(isHabilitar && this.guardarivasventasConstantesFunciones.activarid_tipo_retencion_fuente_ivaGuardarIvasVentas);
	};
	
	public void setDefaultControlesGuardarIvasVentas() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoGuardarIvasVentas(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.guardarivasventasSessionBean.setConGuardarRelaciones(true);			
			this.guardarivasventasSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormGuardarIvasVentas.jTabbedPaneRelacionesGuardarIvasVentas.setVisible(true);
			
					
		} else {
			//this.guardarivasventasSessionBean.setConGuardarRelaciones(false);			
			this.guardarivasventasSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormGuardarIvasVentas.jTabbedPaneRelacionesGuardarIvasVentas.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoGuardarIvasVentas() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(GuardarIvasVentas guardarivasventasAux:this.guardarivasventasLogic.getGuardarIvasVentass()) {
				if(guardarivasventasAux.getId().equals(this.iIdNuevoGuardarIvasVentas)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(GuardarIvasVentas guardarivasventasAux:this.guardarivasventass) {
				if(guardarivasventasAux.getId().equals(this.iIdNuevoGuardarIvasVentas)) {
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
	
	public int getIndiceActualGuardarIvasVentas(GuardarIvasVentas guardarivasventas,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(GuardarIvasVentas guardarivasventasAux:this.guardarivasventasLogic.getGuardarIvasVentass()) {
				if(guardarivasventasAux.getId().equals(guardarivasventas.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(GuardarIvasVentas guardarivasventasAux:this.guardarivasventass) {
				if(guardarivasventasAux.getId().equals(guardarivasventas.getId())) {
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
	
	public void setCamposBaseDesdeOriginalGuardarIvasVentas(GuardarIvasVentas guardarivasventasOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(GuardarIvasVentas guardarivasventasAux:this.guardarivasventasLogic.getGuardarIvasVentass()) {
				if(guardarivasventasAux.getGuardarIvasVentasOriginal().getId().equals(guardarivasventasOriginal.getId())) {
					existe=true;
					guardarivasventasOriginal.setId(guardarivasventasAux.getId());
					guardarivasventasOriginal.setVersionRow(guardarivasventasAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(GuardarIvasVentas guardarivasventasAux:this.guardarivasventass) {
				if(guardarivasventasAux.getGuardarIvasVentasOriginal().getId().equals(guardarivasventasOriginal.getId())) {
					existe=true;
					guardarivasventasOriginal.setId(guardarivasventasAux.getId());
					guardarivasventasOriginal.setVersionRow(guardarivasventasAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosGuardarIvasVentas(Boolean esParaCancelar) throws Exception {
		guardarivasventassAux=new ArrayList<GuardarIvasVentas>();
		guardarivasventasAux=new GuardarIvasVentas();
		
		if(!this.guardarivasventasSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(GuardarIvasVentas guardarivasventasAux:this.guardarivasventasLogic.getGuardarIvasVentass()) {
					if(guardarivasventasAux.getId()<0) {
						guardarivasventassAux.add(guardarivasventasAux);
					}		
				}
				this.iIdNuevoGuardarIvasVentas=0L;
				this.guardarivasventasLogic.getGuardarIvasVentass().removeAll(guardarivasventassAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(GuardarIvasVentas guardarivasventasAux:this.guardarivasventass) {
					if(guardarivasventasAux.getId()<0) {
						guardarivasventassAux.add(guardarivasventasAux);
					}		
				}
				this.iIdNuevoGuardarIvasVentas=0L;
				this.guardarivasventass.removeAll(guardarivasventassAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoGuardarIvasVentas 
					&& this.guardarivasventasLogic.getGuardarIvasVentass().size()>0
					) {
					guardarivasventasAux=this.guardarivasventasLogic.getGuardarIvasVentass().get(this.guardarivasventasLogic.getGuardarIvasVentass().size() - 1);
				
					if(guardarivasventasAux.getId()<0) {
						this.guardarivasventasLogic.getGuardarIvasVentass().remove(guardarivasventasAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoGuardarIvasVentas && this.guardarivasventass.size()>0) {
					guardarivasventasAux=this.guardarivasventass.get(this.guardarivasventass.size() - 1);
				
					if(guardarivasventasAux.getId()<0) {
						this.guardarivasventass.remove(guardarivasventasAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoGuardarIvasVentas(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(guardarivasventas.getId()<0) {
				this.guardarivasventasLogic.getGuardarIvasVentass().remove(this.guardarivasventas);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(guardarivasventas.getId()<0) {
				this.guardarivasventass.remove(this.guardarivasventas);
			}
		}			
	}
	
	public void setEstadosInicialesGuardarIvasVentas(List<GuardarIvasVentas> guardarivasventassAux) throws Exception {
		GuardarIvasVentasConstantesFunciones.setEstadosInicialesGuardarIvasVentas(guardarivasventassAux);
	}
	
	public void setEstadosInicialesGuardarIvasVentas(GuardarIvasVentas guardarivasventasAux) throws Exception {
		GuardarIvasVentasConstantesFunciones.setEstadosInicialesGuardarIvasVentas(guardarivasventasAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarGuardarIvasVentasActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesGuardarIvasVentas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarGuardarIvasVentasActual()) {
				if(!this.isEsNuevoGuardarIvasVentas) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesGuardarIvasVentas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoGuardarIvasVentas=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarGuardarIvasVentasActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Guardar Ivas Ventas ?", "MANTENIMIENTO DE Guardar Ivas Ventas", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesGuardarIvasVentas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(GuardarIvasVentas guardarivasventas) throws Exception {
		GuardarIvasVentasConstantesFunciones.seleccionarAsignar(this.guardarivasventas,guardarivasventas);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarGuardarIvasVentas=this.isPermisoActualizarOriginalGuardarIvasVentas;
			
			
			this.seleccionarAsignar(guardarivasventas);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesGuardarIvasVentas("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.guardarivasventasSessionBean.setsFuncionBusquedaRapida(this.guardarivasventasSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoGuardarIvasVentas) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosGuardarIvasVentas(esParaCancelar);				
				this.cancelarNuevoGuardarIvasVentas(esParaCancelar);								
			}
			
			this.guardarivasventas=new GuardarIvasVentas();
			
			this.inicializarGuardarIvasVentas();
			
			this.actualizarEstadoCeldasBotonesGuardarIvasVentas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarGuardarIvasVentas() throws Exception {
		try {
			GuardarIvasVentasConstantesFunciones.inicializarGuardarIvasVentas(this.guardarivasventas);
			
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
			FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.guardarivasventasLogic.getGuardarIvasVentass().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteGuardarIvasVentass(String sAccionBusqueda,List<GuardarIvasVentas> guardarivasventassParaReportes) throws Exception {
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
					sPathReporteFinal="GuardarIvasVentas"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="GuardarIvasVentasMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("GuardarIvasVentasMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="GuardarIvasVentas"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Guardar Ivas Ventases");		
		parameters.put("busquedapor", GuardarIvasVentasConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceGuardarIvasVentas=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			GuardarIvasVentasConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			GuardarIvasVentasConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceGuardarIvasVentas=new JRBeanArrayDataSource(GuardarIvasVentasJInternalFrame.TraerGuardarIvasVentasBeans(guardarivasventassParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceGuardarIvasVentas);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+GuardarIvasVentasConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+GuardarIvasVentasConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(GuardarIvasVentasBean.TraerGuardarIvasVentasBeans(guardarivasventassParaReportes).toArray()));
							
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
				this.generarExcelReporteGuardarIvasVentass(sAccionBusqueda,sTipoArchivoReporte,guardarivasventassParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalGuardarIvasVentass(sAccionBusqueda,sTipoArchivoReporte,guardarivasventassParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoGuardarIvasVentasActionPerformed(null);
					//this.generarExcelReporteGuardarIvasVentass(sAccionBusqueda,sTipoArchivoReporte,guardarivasventassParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalGuardarIvasVentass(sAccionBusqueda,sTipoArchivoReporte,guardarivasventassParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesGuardarIvasVentass(sAccionBusqueda,sTipoArchivoReporte,guardarivasventassParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesGuardarIvasVentass(sAccionBusqueda,sTipoArchivoReporte,guardarivasventassParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteGuardarIvasVentass(String sAccionBusqueda,String sTipoArchivoReporte,List<GuardarIvasVentas> guardarivasventassParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"guardarivasventas";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("GuardarIvasVentass");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderGuardarIvasVentas("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(GuardarIvasVentas guardarivasventas : guardarivasventassParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			GuardarIvasVentasConstantesFunciones.generarExcelReporteDataGuardarIvasVentas("NORMAL",row,workbook,guardarivasventas,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.guardarivasventasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Guardar Ivas Ventas",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderGuardarIvasVentas(String sTipo,Row row,Workbook workbook) {
		
		GuardarIvasVentasConstantesFunciones.generarExcelReporteHeaderGuardarIvasVentas(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalGuardarIvasVentass(String sAccionBusqueda,String sTipoArchivoReporte,List<GuardarIvasVentas> guardarivasventassParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"guardarivasventas_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("GuardarIvasVentass");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(GuardarIvasVentas guardarivasventas : guardarivasventassParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(GuardarIvasVentasConstantesFunciones.getGuardarIvasVentasDescripcion(guardarivasventas));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(GuardarIvasVentasConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(GuardarIvasVentasConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(guardarivasventas.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(GuardarIvasVentasConstantesFunciones.LABEL_IDEJERCICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(GuardarIvasVentasConstantesFunciones.LABEL_IDEJERCICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(guardarivasventas.getejercicio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(GuardarIvasVentasConstantesFunciones.LABEL_IDPERIODO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(GuardarIvasVentasConstantesFunciones.LABEL_IDPERIODO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(guardarivasventas.getperiodo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(GuardarIvasVentasConstantesFunciones.LABEL_IDTIPORETENCIONFUENTEIVA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(GuardarIvasVentasConstantesFunciones.LABEL_IDTIPORETENCIONFUENTEIVA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(guardarivasventas.gettiporetencionfuenteiva_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(GuardarIvasVentasConstantesFunciones.LABEL_CODIGOESTADOASIENTOCONTABLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(GuardarIvasVentasConstantesFunciones.LABEL_CODIGOESTADOASIENTOCONTABLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(guardarivasventas.getcodigo_estado_asiento_contable());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(GuardarIvasVentasConstantesFunciones.LABEL_NOMBREPERIODO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(GuardarIvasVentasConstantesFunciones.LABEL_NOMBREPERIODO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(guardarivasventas.getnombre_periodo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(GuardarIvasVentasConstantesFunciones.LABEL_NOMBRETIPORETENCIONFUENTEIVA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(GuardarIvasVentasConstantesFunciones.LABEL_NOMBRETIPORETENCIONFUENTEIVA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(guardarivasventas.getnombre_tipo_retencion_fuente_iva());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(GuardarIvasVentasConstantesFunciones.LABEL_PORCENTAJE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(GuardarIvasVentasConstantesFunciones.LABEL_PORCENTAJE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(guardarivasventas.getporcentaje());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(GuardarIvasVentasConstantesFunciones.LABEL_BASEIMPONIBLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(GuardarIvasVentasConstantesFunciones.LABEL_BASEIMPONIBLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(guardarivasventas.getbase_imponible());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(GuardarIvasVentasConstantesFunciones.LABEL_VALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(GuardarIvasVentasConstantesFunciones.LABEL_VALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(guardarivasventas.getvalor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(GuardarIvasVentasConstantesFunciones.LABEL_NUMERO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(GuardarIvasVentasConstantesFunciones.LABEL_NUMERO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(guardarivasventas.getnumero());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(GuardarIvasVentasConstantesFunciones.LABEL_RUCBENEF))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(GuardarIvasVentasConstantesFunciones.LABEL_RUCBENEF);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(guardarivasventas.getruc_benef());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.guardarivasventasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Guardar Ivas Ventas",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesGuardarIvasVentass(String sAccionBusqueda,String sTipoArchivoReporte,List<GuardarIvasVentas> guardarivasventassParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<GuardarIvasVentas> guardarivasventassRespaldo=null;
		
		classes=GuardarIvasVentasConstantesFunciones.getClassesRelationshipsOfGuardarIvasVentas(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.guardarivasventasLogic.setDatosCliente(this.datosCliente);
		this.guardarivasventasLogic.setDatosDeep(this.datosDeep);
		this.guardarivasventasLogic.setIsConDeep(true);
		
		guardarivasventassRespaldo=this.guardarivasventasLogic.getGuardarIvasVentass();
		
		this.guardarivasventasLogic.setGuardarIvasVentass(guardarivasventassParaReportes);	
		this.guardarivasventasLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		guardarivasventassParaReportes=this.guardarivasventasLogic.getGuardarIvasVentass();
		this.guardarivasventasLogic.setGuardarIvasVentass(guardarivasventassRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"guardarivasventas_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("GuardarIvasVentass");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderGuardarIvasVentas("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(GuardarIvasVentas guardarivasventas : guardarivasventassParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderGuardarIvasVentas("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			GuardarIvasVentasConstantesFunciones.generarExcelReporteDataGuardarIvasVentas("NORMAL",row,workbook,guardarivasventas,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(GuardarIvasVentasConstantesFunciones.getGuardarIvasVentasDescripcion(guardarivasventas));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.guardarivasventasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Guardar Ivas Ventas",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoGuardarIvasVentas.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoGuardarIvasVentas.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoGuardarIvasVentas.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoGuardarIvasVentas.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessGuardarIvasVentas() throws Exception {		
		this.startProcessGuardarIvasVentas(true);
	}
	
	public void startProcessGuardarIvasVentas(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasGuardarIvasVentas ,this.jPanelParametrosReportesGuardarIvasVentas, this.jScrollPanelDatosGuardarIvasVentas,this.jPanelPaginacionGuardarIvasVentas, this.jScrollPanelDatosEdicionGuardarIvasVentas, this.jPanelAccionesGuardarIvasVentas,this.jPanelAccionesFormularioGuardarIvasVentas,this.jmenuBarGuardarIvasVentas,this.jmenuBarDetalleGuardarIvasVentas,this.jTtoolBarGuardarIvasVentas,this.jTtoolBarDetalleGuardarIvasVentas);		
		
		final JTabbedPane jTabbedPaneBusquedasGuardarIvasVentas=this.jTabbedPaneBusquedasGuardarIvasVentas; 
		
		final JPanel jPanelParametrosReportesGuardarIvasVentas=this.jPanelParametrosReportesGuardarIvasVentas;
		//final JScrollPane jScrollPanelDatosGuardarIvasVentas=this.jScrollPanelDatosGuardarIvasVentas;
		final JTable jTableDatosGuardarIvasVentas=this.jTableDatosGuardarIvasVentas;		
		final JPanel jPanelPaginacionGuardarIvasVentas=this.jPanelPaginacionGuardarIvasVentas;
		//final JScrollPane jScrollPanelDatosEdicionGuardarIvasVentas=this.jScrollPanelDatosEdicionGuardarIvasVentas;
		final JPanel jPanelAccionesGuardarIvasVentas=this.jPanelAccionesGuardarIvasVentas;
		
		JPanel jPanelCamposAuxiliarGuardarIvasVentas=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarGuardarIvasVentas=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormGuardarIvasVentas!=null) {
			jPanelCamposAuxiliarGuardarIvasVentas=this.jInternalFrameDetalleFormGuardarIvasVentas.jPanelCamposGuardarIvasVentas;
			jPanelAccionesFormularioAuxiliarGuardarIvasVentas=this.jInternalFrameDetalleFormGuardarIvasVentas.jPanelAccionesFormularioGuardarIvasVentas;
		}
		
		final JPanel jPanelCamposGuardarIvasVentas=jPanelCamposAuxiliarGuardarIvasVentas;
		final JPanel jPanelAccionesFormularioGuardarIvasVentas=jPanelAccionesFormularioAuxiliarGuardarIvasVentas;
		
		
		final JMenuBar jmenuBarGuardarIvasVentas=this.jmenuBarGuardarIvasVentas;
		final JToolBar jTtoolBarGuardarIvasVentas=this.jTtoolBarGuardarIvasVentas;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarGuardarIvasVentas=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarGuardarIvasVentas=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormGuardarIvasVentas!=null) {
			jmenuBarDetalleAuxiliarGuardarIvasVentas=this.jInternalFrameDetalleFormGuardarIvasVentas.jmenuBarDetalleGuardarIvasVentas;
			jTtoolBarDetalleAuxiliarGuardarIvasVentas=this.jInternalFrameDetalleFormGuardarIvasVentas.jTtoolBarDetalleGuardarIvasVentas;
		}
		
		final JMenuBar jmenuBarDetalleGuardarIvasVentas=jmenuBarDetalleAuxiliarGuardarIvasVentas;
		final JToolBar jTtoolBarDetalleGuardarIvasVentas=jTtoolBarDetalleAuxiliarGuardarIvasVentas;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasGuardarIvasVentas;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesGuardarIvasVentas;
			processRunnable.jTableDatos=jTableDatosGuardarIvasVentas;
			processRunnable.jPanelCampos=jPanelCamposGuardarIvasVentas;
			processRunnable.jPanelPaginacion=jPanelPaginacionGuardarIvasVentas;
			processRunnable.jPanelAcciones=jPanelAccionesGuardarIvasVentas;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioGuardarIvasVentas;
			
			
			processRunnable.jmenuBar=jmenuBarGuardarIvasVentas;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleGuardarIvasVentas;
			processRunnable.jTtoolBar=jTtoolBarGuardarIvasVentas;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleGuardarIvasVentas;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasGuardarIvasVentas ,jPanelParametrosReportesGuardarIvasVentas,jTableDatosGuardarIvasVentas, /*jScrollPanelDatosGuardarIvasVentas,*/jPanelCamposGuardarIvasVentas,jPanelPaginacionGuardarIvasVentas, /*jScrollPanelDatosEdicionGuardarIvasVentas,*/ jPanelAccionesGuardarIvasVentas,jPanelAccionesFormularioGuardarIvasVentas,jmenuBarGuardarIvasVentas,jmenuBarDetalleGuardarIvasVentas,jTtoolBarGuardarIvasVentas,jTtoolBarDetalleGuardarIvasVentas);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasGuardarIvasVentas ,jPanelParametrosReportesGuardarIvasVentas, jScrollPanelDatosGuardarIvasVentas,jPanelPaginacionGuardarIvasVentas, jScrollPanelDatosEdicionGuardarIvasVentas, jPanelAccionesGuardarIvasVentas,jPanelAccionesFormularioGuardarIvasVentas,jmenuBarGuardarIvasVentas,jmenuBarDetalleGuardarIvasVentas,jTtoolBarGuardarIvasVentas,jTtoolBarDetalleGuardarIvasVentas);
						
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
	
	public void finishProcessGuardarIvasVentas() {// throws Exception 
		this.finishProcessGuardarIvasVentas(true);
	}
	
	public void finishProcessGuardarIvasVentas(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasGuardarIvasVentas ,this.jPanelParametrosReportesGuardarIvasVentas, this.jScrollPanelDatosGuardarIvasVentas,this.jPanelPaginacionGuardarIvasVentas, this.jScrollPanelDatosEdicionGuardarIvasVentas, this.jPanelAccionesGuardarIvasVentas,this.jPanelAccionesFormularioGuardarIvasVentas,this.jmenuBarGuardarIvasVentas,this.jmenuBarDetalleGuardarIvasVentas,this.jTtoolBarGuardarIvasVentas,this.jTtoolBarDetalleGuardarIvasVentas);		
		
		final JTabbedPane jTabbedPaneBusquedasGuardarIvasVentas=this.jTabbedPaneBusquedasGuardarIvasVentas; 
		
		final JPanel jPanelParametrosReportesGuardarIvasVentas=this.jPanelParametrosReportesGuardarIvasVentas;
		//final JScrollPane jScrollPanelDatosGuardarIvasVentas=this.jScrollPanelDatosGuardarIvasVentas;
		final JTable jTableDatosGuardarIvasVentas=this.jTableDatosGuardarIvasVentas;		
		final JPanel jPanelPaginacionGuardarIvasVentas=this.jPanelPaginacionGuardarIvasVentas;
		//final JScrollPane jScrollPanelDatosEdicionGuardarIvasVentas=this.jScrollPanelDatosEdicionGuardarIvasVentas;
		final JPanel jPanelAccionesGuardarIvasVentas=this.jPanelAccionesGuardarIvasVentas;
		
		JPanel jPanelCamposAuxiliarGuardarIvasVentas=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarGuardarIvasVentas=new JPanel();
		
		if(this.jInternalFrameDetalleFormGuardarIvasVentas!=null) {
			jPanelCamposAuxiliarGuardarIvasVentas=this.jInternalFrameDetalleFormGuardarIvasVentas.jPanelCamposGuardarIvasVentas;
			jPanelAccionesFormularioAuxiliarGuardarIvasVentas=this.jInternalFrameDetalleFormGuardarIvasVentas.jPanelAccionesFormularioGuardarIvasVentas;
		}
		
		final JPanel jPanelCamposGuardarIvasVentas=jPanelCamposAuxiliarGuardarIvasVentas;
		final JPanel jPanelAccionesFormularioGuardarIvasVentas=jPanelAccionesFormularioAuxiliarGuardarIvasVentas;
		
		
		final JMenuBar jmenuBarGuardarIvasVentas=this.jmenuBarGuardarIvasVentas;		
		final JToolBar jTtoolBarGuardarIvasVentas=this.jTtoolBarGuardarIvasVentas;
				
		JMenuBar jmenuBarDetalleAuxiliarGuardarIvasVentas=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarGuardarIvasVentas=new JToolBar();
		
		if(this.jInternalFrameDetalleFormGuardarIvasVentas!=null) {
			jmenuBarDetalleAuxiliarGuardarIvasVentas=this.jInternalFrameDetalleFormGuardarIvasVentas.jmenuBarDetalleGuardarIvasVentas;
			jTtoolBarDetalleAuxiliarGuardarIvasVentas=this.jInternalFrameDetalleFormGuardarIvasVentas.jTtoolBarDetalleGuardarIvasVentas;		
		}
		
		final JMenuBar jmenuBarDetalleGuardarIvasVentas=jmenuBarDetalleAuxiliarGuardarIvasVentas;
		final JToolBar jTtoolBarDetalleGuardarIvasVentas=jTtoolBarDetalleAuxiliarGuardarIvasVentas;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasGuardarIvasVentas;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesGuardarIvasVentas;
			processRunnable.jTableDatos=jTableDatosGuardarIvasVentas;
			processRunnable.jPanelCampos=jPanelCamposGuardarIvasVentas;
			processRunnable.jPanelPaginacion=jPanelPaginacionGuardarIvasVentas;
			processRunnable.jPanelAcciones=jPanelAccionesGuardarIvasVentas;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioGuardarIvasVentas;
			
			
			processRunnable.jmenuBar=jmenuBarGuardarIvasVentas;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleGuardarIvasVentas;
			processRunnable.jTtoolBar=jTtoolBarGuardarIvasVentas;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleGuardarIvasVentas;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasGuardarIvasVentas ,jPanelParametrosReportesGuardarIvasVentas, jTableDatosGuardarIvasVentas,/*jScrollPanelDatosGuardarIvasVentas,*/jPanelCamposGuardarIvasVentas,jPanelPaginacionGuardarIvasVentas, /*jScrollPanelDatosEdicionGuardarIvasVentas,*/ jPanelAccionesGuardarIvasVentas,jPanelAccionesFormularioGuardarIvasVentas,jmenuBarGuardarIvasVentas,jmenuBarDetalleGuardarIvasVentas,jTtoolBarGuardarIvasVentas,jTtoolBarDetalleGuardarIvasVentas));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesGuardarIvasVentas(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarGuardarIvasVentas(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuGuardarIvasVentas(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarGuardarIvasVentas(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarGuardarIvasVentas,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleGuardarIvasVentas,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuGuardarIvasVentas(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarGuardarIvasVentas,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleGuardarIvasVentas,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.guardarivasventasConstantesFunciones.getsFinalQueryGuardarIvasVentas();
		String  finalQueryPaginacionTodos=this.guardarivasventasConstantesFunciones.getsFinalQueryGuardarIvasVentas();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=GuardarIvasVentasConstantesFunciones.getArrayColumnasGlobalesNoGuardarIvasVentas(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=GuardarIvasVentasConstantesFunciones.getArrayColumnasGlobalesGuardarIvasVentas(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,GuardarIvasVentasConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.guardarivasventassEliminados= new ArrayList<GuardarIvasVentas>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessGuardarIvasVentas();
		
				///*GuardarIvasVentasSessionBean*/this.guardarivasventasSessionBean=new GuardarIvasVentasSessionBean();
			
			if(this.guardarivasventasSessionBean==null) {
				this.guardarivasventasSessionBean=new GuardarIvasVentasSessionBean();
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
					this.iNumeroPaginacion=GuardarIvasVentasConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=GuardarIvasVentasConstantesFunciones.getClassesForeignKeysOfGuardarIvasVentas(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/guardarivasventas."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			guardarivasventassAux= new ArrayList<GuardarIvasVentas>();
			
				
			guardarivasventasLogic.setDatosCliente(this.datosCliente);
			guardarivasventasLogic.setDatosDeep(this.datosDeep);
			guardarivasventasLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaGuardarIvasVentas")) {
				this.sDetalleReporte=GuardarIvasVentasConstantesFunciones.getDetalleIndiceBusquedaGuardarIvasVentas(id_ejercicioBusquedaGuardarIvasVentas,id_periodoBusquedaGuardarIvasVentas,id_tipo_retencion_fuente_ivaBusquedaGuardarIvasVentas);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					guardarivasventasLogic.getGuardarIvasVentassBusquedaGuardarIvasVentas(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_ejercicioBusquedaGuardarIvasVentas,id_periodoBusquedaGuardarIvasVentas,id_tipo_retencion_fuente_ivaBusquedaGuardarIvasVentas);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=GuardarIvasVentasConstantesFunciones.getDetalleIndiceBusquedaGuardarIvasVentas(id_ejercicioBusquedaGuardarIvasVentas,id_periodoBusquedaGuardarIvasVentas,id_tipo_retencion_fuente_ivaBusquedaGuardarIvasVentas);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=GuardarIvasVentasConstantesFunciones.getDetalleIndiceBusquedaGuardarIvasVentas(id_ejercicioBusquedaGuardarIvasVentas,id_periodoBusquedaGuardarIvasVentas,id_tipo_retencion_fuente_ivaBusquedaGuardarIvasVentas);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=guardarivasventasLogic.getGuardarIvasVentass()==null||guardarivasventasLogic.getGuardarIvasVentass().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=guardarivasventass==null|| guardarivasventass.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						guardarivasventassAux=new ArrayList<GuardarIvasVentas>();
						guardarivasventassAux.addAll(guardarivasventasLogic.getGuardarIvasVentass());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							guardarivasventassAux=new ArrayList<GuardarIvasVentas>();
							guardarivasventassAux.addAll(guardarivasventass);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							guardarivasventasLogic.getGuardarIvasVentassBusquedaGuardarIvasVentas(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_ejercicioBusquedaGuardarIvasVentas,id_periodoBusquedaGuardarIvasVentas,id_tipo_retencion_fuente_ivaBusquedaGuardarIvasVentas);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=GuardarIvasVentasConstantesFunciones.getDetalleIndiceBusquedaGuardarIvasVentas(id_ejercicioBusquedaGuardarIvasVentas,id_periodoBusquedaGuardarIvasVentas,id_tipo_retencion_fuente_ivaBusquedaGuardarIvasVentas);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=GuardarIvasVentasConstantesFunciones.getDetalleIndiceBusquedaGuardarIvasVentas(id_ejercicioBusquedaGuardarIvasVentas,id_periodoBusquedaGuardarIvasVentas,id_tipo_retencion_fuente_ivaBusquedaGuardarIvasVentas);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteGuardarIvasVentass("BusquedaGuardarIvasVentas",guardarivasventasLogic.getGuardarIvasVentass());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteGuardarIvasVentass("BusquedaGuardarIvasVentas",guardarivasventass);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						guardarivasventasLogic.setGuardarIvasVentass(new ArrayList<GuardarIvasVentas>());
						guardarivasventasLogic.getGuardarIvasVentass().addAll(guardarivasventassAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							guardarivasventass=new ArrayList<GuardarIvasVentas>();
							guardarivasventass.addAll(guardarivasventassAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesGuardarIvasVentas();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessGuardarIvasVentas();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=guardarivasventasLogic.getGuardarIvasVentass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=guardarivasventass.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=guardarivasventasLogic.getGuardarIvasVentass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=guardarivasventass.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(GuardarIvasVentas guardarivasventas) {
		Boolean permite=true;
		
		if(this.guardarivasventas.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=GuardarIvasVentasConstantesFunciones.getOrderByListaGuardarIvasVentas();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=GuardarIvasVentasConstantesFunciones.getOrderByListaGuardarIvasVentas();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(GuardarIvasVentas guardarivasventas:guardarivasventasLogic.getGuardarIvasVentass()) {
				if(guardarivasventas.getsType().equals(Constantes2.S_TOTALES)) {
					guardarivasventasTotales=guardarivasventas;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(GuardarIvasVentas guardarivasventas:this.guardarivasventass) {
				if(guardarivasventas.getsType().equals(Constantes2.S_TOTALES)) {
					guardarivasventasTotales=guardarivasventas;
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
			this.guardarivasventasAux=new GuardarIvasVentas();
			this.guardarivasventasAux.setsType(Constantes2.S_TOTALES);
			this.guardarivasventasAux.setIsNew(false);
			this.guardarivasventasAux.setIsChanged(false);
			this.guardarivasventasAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//GuardarIvasVentasConstantesFunciones.TotalizarValoresFilaGuardarIvasVentas(this.guardarivasventasLogic.getGuardarIvasVentass(),this.guardarivasventasAux);
				
				//this.guardarivasventasLogic.getGuardarIvasVentass().add(this.guardarivasventasAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				GuardarIvasVentasConstantesFunciones.TotalizarValoresFilaGuardarIvasVentas(this.guardarivasventass,this.guardarivasventasAux);
				
				this.guardarivasventass.add(this.guardarivasventasAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		guardarivasventasTotales=new GuardarIvasVentas();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.guardarivasventasLogic.getGuardarIvasVentass().remove(guardarivasventasTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.guardarivasventass.remove(guardarivasventasTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		guardarivasventasTotales=new GuardarIvasVentas();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(GuardarIvasVentas guardarivasventas:guardarivasventasLogic.getGuardarIvasVentass()) {
				if(guardarivasventas.getsType().equals(Constantes2.S_TOTALES)) {
					guardarivasventasTotales=guardarivasventas;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				GuardarIvasVentasConstantesFunciones.TotalizarValoresFilaGuardarIvasVentas(this.guardarivasventasLogic.getGuardarIvasVentass(),guardarivasventasTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(GuardarIvasVentas guardarivasventas:this.guardarivasventass) {
				if(guardarivasventas.getsType().equals(Constantes2.S_TOTALES)) {
					guardarivasventasTotales=guardarivasventas;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				GuardarIvasVentasConstantesFunciones.TotalizarValoresFilaGuardarIvasVentas(this.guardarivasventass,guardarivasventasTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getGuardarIvasVentassBusquedaGuardarIvasVentas()throws Exception {
		try {
			sAccionBusqueda="BusquedaGuardarIvasVentas";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getGuardarIvasVentassFK_IdEjercicio()throws Exception {
		try {
			sAccionBusqueda="FK_IdEjercicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getGuardarIvasVentassFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getGuardarIvasVentassFK_IdPeriodo()throws Exception {
		try {
			sAccionBusqueda="FK_IdPeriodo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getGuardarIvasVentassFK_IdTipoRetencionFuenteIva()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoRetencionFuenteIva";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getGuardarIvasVentassBusquedaGuardarIvasVentas(String sFinalQuery,Long id_ejercicio,Long id_periodo,Long id_tipo_retencion_fuente_iva)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//guardarivasventasLogic.getGuardarIvasVentassBusquedaGuardarIvasVentas(sFinalQuery,this.pagination,id_ejercicio,id_periodo,id_tipo_retencion_fuente_iva);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getGuardarIvasVentassFK_IdEjercicio(String sFinalQuery,Long id_ejercicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//guardarivasventasLogic.getGuardarIvasVentassFK_IdEjercicio(sFinalQuery,this.pagination,id_ejercicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getGuardarIvasVentassFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//guardarivasventasLogic.getGuardarIvasVentassFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getGuardarIvasVentassFK_IdPeriodo(String sFinalQuery,Long id_periodo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//guardarivasventasLogic.getGuardarIvasVentassFK_IdPeriodo(sFinalQuery,this.pagination,id_periodo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getGuardarIvasVentassFK_IdTipoRetencionFuenteIva(String sFinalQuery,Long id_tipo_retencion_fuente_iva)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//guardarivasventasLogic.getGuardarIvasVentassFK_IdTipoRetencionFuenteIva(sFinalQuery,this.pagination,id_tipo_retencion_fuente_iva);
				
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
								
			//this.procesarBusqueda(sAccionBusqueda);
			
		} catch (Exception e) {
			throw e;
		}
	}		
	
	public void inicializarPermisosGuardarIvasVentas() {
		this.isPermisoTodoGuardarIvasVentas=false;
		this.isPermisoNuevoGuardarIvasVentas=false;
		this.isPermisoActualizarGuardarIvasVentas=false;
		this.isPermisoActualizarOriginalGuardarIvasVentas=false;
		this.isPermisoEliminarGuardarIvasVentas=false;
		this.isPermisoGuardarCambiosGuardarIvasVentas=false;
		this.isPermisoConsultaGuardarIvasVentas=true;
		this.isPermisoBusquedaGuardarIvasVentas=true;
		this.isPermisoReporteGuardarIvasVentas=true;
		this.isPermisoOrdenGuardarIvasVentas=false;		
		this.isPermisoPaginacionMedioGuardarIvasVentas=false;		
		this.isPermisoPaginacionAltoGuardarIvasVentas=false;		
		this.isPermisoPaginacionTodoGuardarIvasVentas=false;		
		this.isPermisoCopiarGuardarIvasVentas=false;		
		this.isPermisoVerFormGuardarIvasVentas=false;		
		this.isPermisoDuplicarGuardarIvasVentas=false;
		this.isPermisoOrdenGuardarIvasVentas=false;
	}
	
	public void setPermisosUsuarioGuardarIvasVentas(Boolean isPermiso) {
		this.isPermisoTodoGuardarIvasVentas=isPermiso;
		this.isPermisoNuevoGuardarIvasVentas=isPermiso;
		this.isPermisoActualizarGuardarIvasVentas=isPermiso;
		this.isPermisoActualizarOriginalGuardarIvasVentas=isPermiso;
		this.isPermisoEliminarGuardarIvasVentas=isPermiso;
		this.isPermisoGuardarCambiosGuardarIvasVentas=isPermiso;
		this.isPermisoConsultaGuardarIvasVentas=isPermiso;
		this.isPermisoBusquedaGuardarIvasVentas=isPermiso;
		this.isPermisoReporteGuardarIvasVentas=isPermiso;
		this.isPermisoOrdenGuardarIvasVentas=isPermiso;		
		this.isPermisoPaginacionMedioGuardarIvasVentas=isPermiso;		
		this.isPermisoPaginacionAltoGuardarIvasVentas=isPermiso;		
		this.isPermisoPaginacionTodoGuardarIvasVentas=isPermiso;		
		this.isPermisoCopiarGuardarIvasVentas=isPermiso;		
		this.isPermisoVerFormGuardarIvasVentas=isPermiso;		
		this.isPermisoDuplicarGuardarIvasVentas=isPermiso;
		this.isPermisoOrdenGuardarIvasVentas=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioGuardarIvasVentas(Boolean isPermiso) {
		//this.isPermisoTodoGuardarIvasVentas=isPermiso;
		this.isPermisoNuevoGuardarIvasVentas=isPermiso;
		this.isPermisoActualizarGuardarIvasVentas=isPermiso;
		this.isPermisoActualizarOriginalGuardarIvasVentas=isPermiso;
		this.isPermisoEliminarGuardarIvasVentas=isPermiso;
		this.isPermisoGuardarCambiosGuardarIvasVentas=isPermiso;
		//this.isPermisoConsultaGuardarIvasVentas=isPermiso;
		//this.isPermisoBusquedaGuardarIvasVentas=isPermiso;
		//this.isPermisoReporteGuardarIvasVentas=isPermiso;
		//this.isPermisoOrdenGuardarIvasVentas=isPermiso;		
		//this.isPermisoPaginacionMedioGuardarIvasVentas=isPermiso;		
		//this.isPermisoPaginacionAltoGuardarIvasVentas=isPermiso;		
		//this.isPermisoPaginacionTodoGuardarIvasVentas=isPermiso;		
		//this.isPermisoCopiarGuardarIvasVentas=isPermiso;		
		//this.isPermisoDuplicarGuardarIvasVentas=isPermiso;
		//this.isPermisoOrdenGuardarIvasVentas=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioGuardarIvasVentasClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(GuardarIvasVentasJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebGuardarIvasVentas(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioGuardarIvasVentasClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioGuardarIvasVentasClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionGuardarIvasVentasClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioGuardarIvasVentasClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioGuardarIvasVentas() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(GuardarIvasVentasJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.guardarivasventasSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, GuardarIvasVentasConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoGuardarIvasVentas=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarGuardarIvasVentas=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalGuardarIvasVentas=this.isPermisoActualizarGuardarIvasVentas;
			this.isPermisoEliminarGuardarIvasVentas=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosGuardarIvasVentas=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaGuardarIvasVentas=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaGuardarIvasVentas=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoGuardarIvasVentas=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteGuardarIvasVentas=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenGuardarIvasVentas=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioGuardarIvasVentas=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoGuardarIvasVentas=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoGuardarIvasVentas=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarGuardarIvasVentas=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormGuardarIvasVentas=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarGuardarIvasVentas=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenGuardarIvasVentas=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.guardarivasventasSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosGuardarIvasVentas.setToolTipText(this.jTableDatosGuardarIvasVentas.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioGuardarIvasVentas(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioGuardarIvasVentas(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(GuardarIvasVentasJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(GuardarIvasVentasJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioGuardarIvasVentas() throws Exception {
		Reporte reporte=null;
		
		
		
		
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
	public void inicializarCombosForeignKeyGuardarIvasVentasListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.ejerciciosForeignKey=new ArrayList();
				this.periodosForeignKey=new ArrayList();
				this.tiporetencionfuenteivasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyGuardarIvasVentasListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(GuardarIvasVentasJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEjercicioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPeriodoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoRetencionFuenteIvaListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyEjercicioListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.ejerciciosForeignKey==null||this.ejerciciosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EjercicioConstantesFunciones.getArrayColumnasGlobalesEjercicio(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EjercicioConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EjercicioConstantesFunciones.SFINALQUERY;

				this.cargarCombosEjerciciosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyPeriodoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.periodosForeignKey==null||this.periodosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=PeriodoConstantesFunciones.getArrayColumnasGlobalesPeriodo(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PeriodoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=PeriodoConstantesFunciones.SFINALQUERY;

				this.cargarCombosPeriodosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoRetencionFuenteIvaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tiporetencionfuenteivasForeignKey==null||this.tiporetencionfuenteivasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoRetencionConstantesFunciones.getArrayColumnasGlobalesTipoRetencion(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoRetencionConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoRetencionConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoRetencionFuenteIvasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public void addItemDefectoCombosTodosForeignKeyGuardarIvasVentas()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyEjercicio();
			this.addItemDefectoCombosForeignKeyPeriodo();
			this.addItemDefectoCombosForeignKeyTipoRetencionFuenteIva();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.guardarivasventasSessionBean==null) {
				this.guardarivasventasSessionBean=new GuardarIvasVentasSessionBean();
			}

			if(!this.guardarivasventasSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyEjercicio()throws Exception {
		try {

			if(!this.guardarivasventasSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
				Ejercicio ejercicio=new Ejercicio();
				EjercicioConstantesFunciones.setEjercicioDescripcion(ejercicio,Constantes.SMENSAJE_ESCOJA_OPCION);
				ejercicio.setId(null);

				if(!EjercicioConstantesFunciones.ExisteEnLista(this.ejerciciosForeignKey,ejercicio,true)) {

					this.ejerciciosForeignKey.add(0,ejercicio);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyPeriodo()throws Exception {
		try {

			if(!this.guardarivasventasSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
				Periodo periodo=new Periodo();
				PeriodoConstantesFunciones.setPeriodoDescripcion(periodo,Constantes.SMENSAJE_ESCOJA_OPCION);
				periodo.setId(null);

				if(!PeriodoConstantesFunciones.ExisteEnLista(this.periodosForeignKey,periodo,true)) {

					this.periodosForeignKey.add(0,periodo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoRetencionFuenteIva()throws Exception {
		try {

			if(!this.guardarivasventasSessionBean.getisBusquedaDesdeForeignKeySesionTipoRetencionFuenteIva()) {
				TipoRetencion tiporetencionfuenteiva=new TipoRetencion();
				TipoRetencionConstantesFunciones.setTipoRetencionDescripcion(tiporetencionfuenteiva,Constantes.SMENSAJE_ESCOJA_OPCION);
				tiporetencionfuenteiva.setId(null);

				if(!TipoRetencionConstantesFunciones.ExisteEnLista(this.tiporetencionfuenteivasForeignKey,tiporetencionfuenteiva,true)) {

					this.tiporetencionfuenteivasForeignKey.add(0,tiporetencionfuenteiva);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyGuardarIvasVentas()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyGuardarIvasVentas(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyGuardarIvasVentas()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyGuardarIvasVentas();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyGuardarIvasVentas(GuardarIvasVentas guardarivasventas)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyGuardarIvasVentas(GuardarIvasVentas guardarivasventas,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyGuardarIvasVentas()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyGuardarIvasVentas()throws Exception {	
		try {
			

				if(this.jInternalFrameDetalleFormGuardarIvasVentas!=null) {
					Ejercicio ejercicioActual=(Ejercicio)this.jInternalFrameDetalleFormGuardarIvasVentas.jComboBoxid_ejercicioGuardarIvasVentas.getSelectedItem();
				}

				if(this.jInternalFrameDetalleFormGuardarIvasVentas!=null) {
					Periodo periodoActual=(Periodo)this.jInternalFrameDetalleFormGuardarIvasVentas.jComboBoxid_periodoGuardarIvasVentas.getSelectedItem();
				}
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyGuardarIvasVentas()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyGuardarIvasVentas()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroGuardarIvasVentas()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyGuardarIvasVentas()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameEjerciciosForeignKey("Todos");
			this.cargarCombosFramePeriodosForeignKey("Todos");
			this.cargarCombosFrameTipoRetencionFuenteIvasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyGuardarIvasVentas(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEjerciciosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePeriodosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoRetencionFuenteIvasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyGuardarIvasVentas()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormGuardarIvasVentas.jComboBoxid_empresaGuardarIvasVentas!=null && this.jInternalFrameDetalleFormGuardarIvasVentas.jComboBoxid_empresaGuardarIvasVentas.getItemCount()>0) {
				this.jInternalFrameDetalleFormGuardarIvasVentas.jComboBoxid_empresaGuardarIvasVentas.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormGuardarIvasVentas.jComboBoxid_ejercicioGuardarIvasVentas!=null && this.jInternalFrameDetalleFormGuardarIvasVentas.jComboBoxid_ejercicioGuardarIvasVentas.getItemCount()>0) {
				this.jInternalFrameDetalleFormGuardarIvasVentas.jComboBoxid_ejercicioGuardarIvasVentas.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormGuardarIvasVentas.jComboBoxid_periodoGuardarIvasVentas!=null && this.jInternalFrameDetalleFormGuardarIvasVentas.jComboBoxid_periodoGuardarIvasVentas.getItemCount()>0) {
				this.jInternalFrameDetalleFormGuardarIvasVentas.jComboBoxid_periodoGuardarIvasVentas.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormGuardarIvasVentas.jComboBoxid_tipo_retencion_fuente_ivaGuardarIvasVentas!=null && this.jInternalFrameDetalleFormGuardarIvasVentas.jComboBoxid_tipo_retencion_fuente_ivaGuardarIvasVentas.getItemCount()>0) {
				this.jInternalFrameDetalleFormGuardarIvasVentas.jComboBoxid_tipo_retencion_fuente_ivaGuardarIvasVentas.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	








	
	

	public GuardarIvasVentasBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public GuardarIvasVentasBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public GuardarIvasVentasBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.guardarivasventasSessionBean=new GuardarIvasVentasSessionBean(); 
		this.guardarivasventasConstantesFunciones=new GuardarIvasVentasConstantesFunciones(); 
		this.guardarivasventasBean=new GuardarIvasVentas();//(this.guardarivasventasConstantesFunciones); 		
		this.guardarivasventasReturnGeneral=new GuardarIvasVentasParameterReturnGeneral(); 
		
		this.guardarivasventasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.guardarivasventasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public GuardarIvasVentasBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public GuardarIvasVentasBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public GuardarIvasVentasBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessGuardarIvasVentas(true);
			
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
			
			this.guardarivasventasConstantesFunciones=new GuardarIvasVentasConstantesFunciones(); 
			this.guardarivasventasBean=new GuardarIvasVentas();//this.guardarivasventasConstantesFunciones); 			
			this.guardarivasventasReturnGeneral=new GuardarIvasVentasParameterReturnGeneral(); 
		
			GuardarIvasVentasBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Guardar Ivas Ventas Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.guardarivasventas=new GuardarIvasVentas();
			this.guardarivasventass = new ArrayList<GuardarIvasVentas>();
			this.guardarivasventassAux = new ArrayList<GuardarIvasVentas>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guardarivasventasLogic=new GuardarIvasVentasLogic();
				this.guardarivasventasLogic.getNewConnexionToDeep("");
			}
			
			//this.guardarivasventasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.guardarivasventasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormGuardarIvasVentas);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoGuardarIvasVentas!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoGuardarIvasVentas);	
					}
					
					if(this.jInternalFrameImportacionGuardarIvasVentas!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionGuardarIvasVentas);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByGuardarIvasVentas!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByGuardarIvasVentas);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormGuardarIvasVentas!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormGuardarIvasVentas);
				this.jInternalFrameDetalleFormGuardarIvasVentas.setVisible(false);
				this.jInternalFrameDetalleFormGuardarIvasVentas.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoGuardarIvasVentas!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoGuardarIvasVentas);
					this.jInternalFrameReporteDinamicoGuardarIvasVentas.setVisible(false);
					this.jInternalFrameReporteDinamicoGuardarIvasVentas.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionGuardarIvasVentas!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionGuardarIvasVentas);
					this.jInternalFrameImportacionGuardarIvasVentas.setVisible(false);
					this.jInternalFrameImportacionGuardarIvasVentas.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByGuardarIvasVentas!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByGuardarIvasVentas);
					this.jInternalFrameOrderByGuardarIvasVentas.setVisible(false);
					this.jInternalFrameOrderByGuardarIvasVentas.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idGuardarIvasVentasActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=GuardarIvasVentasConstantesFunciones.INUMEROPAGINACION;
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
			
			this.guardarivasventasReturnGeneral=new GuardarIvasVentasParameterReturnGeneral();
			
			this.guardarivasventasParameterGeneral=new GuardarIvasVentasParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.guardarivasventasLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.guardarivasventasSessionBean.getEsGuardarRelacionado()) {
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
			
			if(GuardarIvasVentasJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.guardarivasventasSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,GuardarIvasVentasConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.guardarivasventasSessionBean.getEsGuardarRelacionado(),this.guardarivasventasSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,GuardarIvasVentasConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.guardarivasventasSessionBean.getEsGuardarRelacionado(),this.guardarivasventasSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoGuardarIvasVentas=false;
			this.isVisibilidadCeldaDuplicarGuardarIvasVentas=true;
			this.isVisibilidadCeldaCopiarGuardarIvasVentas=true;
			this.isVisibilidadCeldaVerFormGuardarIvasVentas=true;
			this.isVisibilidadCeldaOrdenGuardarIvasVentas=true;
			this.isVisibilidadCeldaNuevoRelacionesGuardarIvasVentas=false;
			this.isVisibilidadCeldaModificarGuardarIvasVentas=false;
			this.isVisibilidadCeldaActualizarGuardarIvasVentas=false;
			this.isVisibilidadCeldaEliminarGuardarIvasVentas=false;
			this.isVisibilidadCeldaCancelarGuardarIvasVentas=false;
			this.isVisibilidadCeldaGuardarGuardarIvasVentas=false;
			this.isVisibilidadCeldaGuardarCambiosGuardarIvasVentas=false;
			
			
			this.isVisibilidadBusquedaGuardarIvasVentas=true;
			this.isVisibilidadFK_IdEjercicio=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdPeriodo=true;
			this.isVisibilidadFK_IdTipoRetencionFuenteIva=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesGuardarIvasVentas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosGuardarIvasVentas();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioGuardarIvasVentas(false);
			
			this.setPermisosUsuarioGuardarIvasVentas();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.guardarivasventasSessionBean.getEsGuardarRelacionado() 
				|| (this.guardarivasventasSessionBean.getEsGuardarRelacionado() && this.guardarivasventasSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioGuardarIvasVentasClasesRelacionadas();
			}
			
			if(this.guardarivasventasSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioGuardarIvasVentasClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!GuardarIvasVentasJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosGuardarIvasVentas();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualGuardarIvasVentas();
			}
			
			if(!this.isPermisoBusquedaGuardarIvasVentas) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasGuardarIvasVentas.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.guardarivasventasSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(GuardarIvasVentasConstantesFunciones.getTiposSeleccionarGuardarIvasVentas());
				
				this.tiposColumnasSelect=GuardarIvasVentasConstantesFunciones.getTiposSeleccionarGuardarIvasVentas(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				
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
			//if(!this.guardarivasventasSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioGuardarIvasVentas();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioGuardarIvasVentas(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioGuardarIvasVentas(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesGuardarIvasVentas() ;
			
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
			
			 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.ejercicioLogic=new EjercicioLogic();
			this.periodoLogic=new PeriodoLogic();
			this.tiporetencionfuenteivaLogic=new TipoRetencionLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				guardarivasventasImplementable= (GuardarIvasVentasImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+GuardarIvasVentasConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				guardarivasventasImplementableHome= (GuardarIvasVentasImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+GuardarIvasVentasConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.guardarivasventass= new ArrayList<GuardarIvasVentas>();
			this.guardarivasventassEliminados= new ArrayList<GuardarIvasVentas>();
						
			this.isEsNuevoGuardarIvasVentas=false;
			this.esParaAccionDesdeFormularioGuardarIvasVentas=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>() ;
			this.periodosForeignKey=new ArrayList<Periodo>() ;
			this.tiporetencionfuenteivasForeignKey=new ArrayList<TipoRetencion>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyGuardarIvasVentas(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroGuardarIvasVentas();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.guardarivasventasSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			GuardarIvasVentasBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=GuardarIvasVentasConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesGuardarIvasVentas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingGuardarIvasVentas(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormGuardarIvasVentas!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioGuardarIvasVentas();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioGuardarIvasVentas();
			}
			
			GuardarIvasVentasBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasGuardarIvasVentas.getTabCount(); i++) {
					this.jTabbedPaneBusquedasGuardarIvasVentas.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasGuardarIvasVentas.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guardarivasventasLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessGuardarIvasVentas(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga GuardarIvasVentas: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guardarivasventasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guardarivasventasLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectGuardarIvasVentas() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesGuardarIvasVentas")) {
				iIndex=this.jInternalFrameDetalleFormGuardarIvasVentas.jTabbedPaneRelacionesGuardarIvasVentas.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormGuardarIvasVentas.jTabbedPaneRelacionesGuardarIvasVentas.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosGuardarIvasVentas.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessGuardarIvasVentas();	
			}
		}
    }
	
	
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
	}		
	
	public void cargarCombosForeignKeyGuardarIvasVentas(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyGuardarIvasVentas(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyGuardarIvasVentas(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyGuardarIvasVentasListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyGuardarIvasVentas();
		
		this.cargarCombosFrameForeignKeyGuardarIvasVentas();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyGuardarIvasVentas();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyGuardarIvasVentas();
		}
	}
	
	

	public void cargarCombosForeignKeyTipoRetencionFuenteIva(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoRetencionFuenteIvaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoRetencionFuenteIva();
				this.cargarCombosFrameTipoRetencionFuenteIvasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoRetencionFuenteIva(this.tiporetencionfuenteivasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoGuardarIvasVentasActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.guardarivasventasSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormGuardarIvasVentas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			GuardarIvasVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.guardarivasventas,new Object(),this.guardarivasventasParameterGeneral,this.guardarivasventasReturnGeneral);
			
			
			if(jTableDatosGuardarIvasVentas.getRowCount()>=1) {
				jTableDatosGuardarIvasVentas.removeRowSelectionInterval(0, jTableDatosGuardarIvasVentas.getRowCount()-1);						
			}
			
			this.isEsNuevoGuardarIvasVentas=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoGuardarIvasVentas(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesGuardarIvasVentas(true);			
			//this.guardarivasventas=new GuardarIvasVentas();
			//this.guardarivasventas.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesGuardarIvasVentas(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualGuardarIvasVentas() ;
			
			if(GuardarIvasVentasJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleGuardarIvasVentas(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.guardarivasventas);	
			this.actualizarInformacion("INFO_PADRE",false,this.guardarivasventas);				
			
			GuardarIvasVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.guardarivasventas,new Object(),this.guardarivasventasParameterGeneral,this.guardarivasventasReturnGeneral);
			
			if(this.guardarivasventasSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar GuardarIvasVentas: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			GuardarIvasVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.guardarivasventas,new Object(),this.guardarivasventasParameterGeneral,this.guardarivasventasReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarGuardarIvasVentasActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<GuardarIvasVentas> guardarivasventassSeleccionados=new ArrayList<GuardarIvasVentas>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosGuardarIvasVentas.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosGuardarIvasVentas.getSelectedRows().length;			
			}
			
			guardarivasventassSeleccionados=this.getGuardarIvasVentassSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoGuardarIvasVentas--;			
				//GuardarIvasVentas guardarivasventasAux= new GuardarIvasVentas();			
				//guardarivasventasAux.setId(this.iIdNuevoGuardarIvasVentas);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//GuardarIvasVentas guardarivasventasOrigen=new GuardarIvasVentas();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(GuardarIvasVentas guardarivasventasOrigen : guardarivasventassSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosGuardarIvasVentas.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							guardarivasventasOrigen =(GuardarIvasVentas) this.guardarivasventasLogic.getGuardarIvasVentass().toArray()[this.jTableDatosGuardarIvasVentas.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							guardarivasventasOrigen =(GuardarIvasVentas) this.guardarivasventass.toArray()[this.jTableDatosGuardarIvasVentas.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaGuardarIvasVentas();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.guardarivasventas.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosGuardarIvasVentas(guardarivasventasOrigen,this.guardarivasventas,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysGuardarIvasVentas(this.guardarivasventas);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.guardarivasventasLogic.getGuardarIvasVentass().add(this.guardarivasventasAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.guardarivasventass.add(this.guardarivasventasAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaGuardarIvasVentas(false);
				
				this.jTableDatosGuardarIvasVentas.setRowSelectionInterval(this.getIndiceNuevoGuardarIvasVentas(), this.getIndiceNuevoGuardarIvasVentas());
				
				int iLastRow =  this.jTableDatosGuardarIvasVentas.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosGuardarIvasVentas.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosGuardarIvasVentas.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaGuardarIvasVentas(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarGuardarIvasVentasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<GuardarIvasVentas> guardarivasventassSeleccionados=new ArrayList<GuardarIvasVentas>();									
		
			GuardarIvasVentas guardarivasventasOrigen=new GuardarIvasVentas();
			GuardarIvasVentas guardarivasventasDestino=new GuardarIvasVentas();
				
			guardarivasventassSeleccionados=this.getGuardarIvasVentassSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosGuardarIvasVentas.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || guardarivasventassSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosGuardarIvasVentas.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						guardarivasventasOrigen =(GuardarIvasVentas) this.guardarivasventasLogic.getGuardarIvasVentass().toArray()[this.jTableDatosGuardarIvasVentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						guardarivasventasOrigen =(GuardarIvasVentas) this.guardarivasventass.toArray()[this.jTableDatosGuardarIvasVentas.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						guardarivasventasDestino =(GuardarIvasVentas) this.guardarivasventasLogic.getGuardarIvasVentass().toArray()[this.jTableDatosGuardarIvasVentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						guardarivasventasDestino =(GuardarIvasVentas) this.guardarivasventass.toArray()[this.jTableDatosGuardarIvasVentas.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				guardarivasventasOrigen =guardarivasventassSeleccionados.get(0);
				guardarivasventasDestino =guardarivasventassSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosGuardarIvasVentas(guardarivasventasOrigen,guardarivasventasDestino,true,false);
				
				guardarivasventasDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(guardarivasventasDestino,guardarivasventasLogic.getGuardarIvasVentass());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(guardarivasventasDestino,guardarivasventass);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaGuardarIvasVentas(false);
				
				//this.jTableDatosGuardarIvasVentas.setRowSelectionInterval(this.getIndiceNuevoGuardarIvasVentas(), this.getIndiceNuevoGuardarIvasVentas());
				
				int iLastRow =  this.jTableDatosGuardarIvasVentas.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosGuardarIvasVentas.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosGuardarIvasVentas.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaGuardarIvasVentas(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormGuardarIvasVentasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormGuardarIvasVentas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormGuardarIvasVentas.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarGuardarIvasVentasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesGuardarIvasVentas.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasGuardarIvasVentas.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesGuardarIvasVentas.setVisible(!isVisible);
			this.jPanelPaginacionGuardarIvasVentas.setVisible(!isVisible);
			this.jPanelAccionesGuardarIvasVentas.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarGuardarIvasVentasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameGuardarIvasVentas();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoGuardarIvasVentasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoGuardarIvasVentas();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionGuardarIvasVentasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionGuardarIvasVentas();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByGuardarIvasVentasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByGuardarIvasVentas();
			
			this.abrirFrameOrderByGuardarIvasVentas();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByGuardarIvasVentasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByGuardarIvasVentas();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleGuardarIvasVentas(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormGuardarIvasVentas);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormGuardarIvasVentas.isMaximum()) {
					this.jInternalFrameDetalleFormGuardarIvasVentas.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormGuardarIvasVentas.setSize(this.jInternalFrameDetalleFormGuardarIvasVentas.iWidthFormulario,this.jInternalFrameDetalleFormGuardarIvasVentas.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormGuardarIvasVentas.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormGuardarIvasVentas.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormGuardarIvasVentas.isMaximum()) {
						this.jInternalFrameDetalleFormGuardarIvasVentas.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormGuardarIvasVentas.jContentPaneDetalleGuardarIvasVentas.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormGuardarIvasVentas.jTabbedPaneRelacionesGuardarIvasVentas.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormGuardarIvasVentas.jContentPaneDetalleGuardarIvasVentas.getWidth(),GuardarIvasVentasConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormGuardarIvasVentas.jTabbedPaneRelacionesGuardarIvasVentas.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormGuardarIvasVentas.jContentPaneDetalleGuardarIvasVentas.getWidth(),GuardarIvasVentasConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormGuardarIvasVentas.jTabbedPaneRelacionesGuardarIvasVentas.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormGuardarIvasVentas.jContentPaneDetalleGuardarIvasVentas.getWidth(),GuardarIvasVentasConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormGuardarIvasVentas.setVisible(true);
	        this.jInternalFrameDetalleFormGuardarIvasVentas.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByGuardarIvasVentas() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByGuardarIvasVentas==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByGuardarIvasVentas=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByGuardarIvasVentas,false,this);
				} else {
					this.jInternalFrameOrderByGuardarIvasVentas=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByGuardarIvasVentas,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByGuardarIvasVentas);
				this.jInternalFrameOrderByGuardarIvasVentas.setVisible(false);
				this.jInternalFrameOrderByGuardarIvasVentas.setSelected(false);
				
				this.jInternalFrameOrderByGuardarIvasVentas.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByGuardarIvasVentas"));
				
				this.inicializarActualizarBindingTablaOrderByGuardarIvasVentas();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionGuardarIvasVentas() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionGuardarIvasVentas==null) {
				
				this.jInternalFrameImportacionGuardarIvasVentas=new ImportacionJInternalFrame(GuardarIvasVentasConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionGuardarIvasVentas);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionGuardarIvasVentas);
				this.jInternalFrameImportacionGuardarIvasVentas.setVisible(false);
				this.jInternalFrameImportacionGuardarIvasVentas.setSelected(false);


				this.jInternalFrameImportacionGuardarIvasVentas.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionGuardarIvasVentas"));
				this.jInternalFrameImportacionGuardarIvasVentas.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionGuardarIvasVentas"));
				this.jInternalFrameImportacionGuardarIvasVentas.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionGuardarIvasVentas"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoGuardarIvasVentas() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoGuardarIvasVentas==null) {
				this.jInternalFrameReporteDinamicoGuardarIvasVentas=new ReporteDinamicoJInternalFrame(GuardarIvasVentasConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoGuardarIvasVentas);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoGuardarIvasVentas);
				this.jInternalFrameReporteDinamicoGuardarIvasVentas.setVisible(false);
				this.jInternalFrameReporteDinamicoGuardarIvasVentas.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoGuardarIvasVentas.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoGuardarIvasVentas"));
				this.jInternalFrameReporteDinamicoGuardarIvasVentas.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoGuardarIvasVentas"));
				this.jInternalFrameReporteDinamicoGuardarIvasVentas.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoGuardarIvasVentas"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualGuardarIvasVentas();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleGuardarIvasVentas() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormGuardarIvasVentas);
			
	       	this.jInternalFrameDetalleFormGuardarIvasVentas.setVisible(false);
	        this.jInternalFrameDetalleFormGuardarIvasVentas.setSelected(false);
			
			//this.jInternalFrameDetalleFormGuardarIvasVentas.dispose();
			//this.jInternalFrameDetalleFormGuardarIvasVentas=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoGuardarIvasVentas() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoGuardarIvasVentas.setVisible(true);
	        this.jInternalFrameReporteDinamicoGuardarIvasVentas.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionGuardarIvasVentas() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionGuardarIvasVentas.setVisible(true);
	        this.jInternalFrameImportacionGuardarIvasVentas.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByGuardarIvasVentas() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByGuardarIvasVentas.setVisible(true);
	        this.jInternalFrameOrderByGuardarIvasVentas.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByGuardarIvasVentas() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByGuardarIvasVentas.setVisible(false);
	        this.jInternalFrameOrderByGuardarIvasVentas.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoGuardarIvasVentas() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoGuardarIvasVentas.setVisible(false);
	        this.jInternalFrameReporteDinamicoGuardarIvasVentas.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionGuardarIvasVentas() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionGuardarIvasVentas.setVisible(false);
	        this.jInternalFrameImportacionGuardarIvasVentas.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarGuardarIvasVentasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarGuardarIvasVentas(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarGuardarIvasVentas(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosGuardarIvasVentas.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesGuardarIvasVentas(true);
			//this.isEsNuevoGuardarIvasVentas=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guardarivasventas =(GuardarIvasVentas) this.guardarivasventasLogic.getGuardarIvasVentass().toArray()[this.jTableDatosGuardarIvasVentas.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.guardarivasventas =(GuardarIvasVentas) this.guardarivasventass.toArray()[this.jTableDatosGuardarIvasVentas.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesGuardarIvasVentas("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesGuardarIvasVentas(false) ;
			
			if(guardarivasventasSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(GuardarIvasVentasJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleGuardarIvasVentas(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualGuardarIvasVentas(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaGuardarIvasVentasActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosGuardarIvasVentas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guardarivasventas =(GuardarIvasVentas) this.guardarivasventasLogic.getGuardarIvasVentass().toArray()[this.jTableDatosGuardarIvasVentas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.guardarivasventas =(GuardarIvasVentas) this.guardarivasventass.toArray()[this.jTableDatosGuardarIvasVentas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarGuardarIvasVentas(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormGuardarIvasVentas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosGuardarIvasVentas.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesGuardarIvasVentas(true);
			//this.isEsNuevoGuardarIvasVentas=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guardarivasventas =(GuardarIvasVentas) this.guardarivasventasLogic.getGuardarIvasVentass().toArray()[this.jTableDatosGuardarIvasVentas.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.guardarivasventas =(GuardarIvasVentas) this.guardarivasventass.toArray()[this.jTableDatosGuardarIvasVentas.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.guardarivasventas.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesGuardarIvasVentas("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesGuardarIvasVentas(false) ;
			
			if(GuardarIvasVentasJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleGuardarIvasVentas(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualGuardarIvasVentas(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
				
	
	public void recargarComboTablaTipoRetencionFuenteIva(List<TipoRetencion> tiporetencionfuenteivasForeignKey)throws Exception{
		TableColumn tableColumnTipoRetencionFuenteIva=this.jTableDatosGuardarIvasVentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGuardarIvasVentas,GuardarIvasVentasConstantesFunciones.LABEL_IDTIPORETENCIONFUENTEIVA));
		TableCellEditor tableCellEditorTipoRetencionFuenteIva =tableColumnTipoRetencionFuenteIva.getCellEditor();

		TipoRetencionTableCell tiporetencionTableCellFk=(TipoRetencionTableCell)tableCellEditorTipoRetencionFuenteIva;

		if(tiporetencionTableCellFk!=null) {
			tiporetencionTableCellFk.settiporetencionsForeignKey(tiporetencionfuenteivasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosGuardarIvasVentas.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tiporetencionTableCellFk.setRowActual(intSelectedRow);
			//tiporetencionTableCellFk.settiporetencionsForeignKeyActual(tiporetencionfuenteivasForeignKey);
		//}


		if(tiporetencionTableCellFk!=null) {
			tiporetencionTableCellFk.RecargarTipoRetencionsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarGuardarIvasVentasActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guardarivasventasLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesGuardarIvasVentas(false);
			
			//if(!this.isEsNuevoGuardarIvasVentas) {								
				int intSelectedRow = this.jTableDatosGuardarIvasVentas.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guardarivasventas =(GuardarIvasVentas) this.guardarivasventasLogic.getGuardarIvasVentass().toArray()[this.jTableDatosGuardarIvasVentas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.guardarivasventas =(GuardarIvasVentas) this.guardarivasventass.toArray()[this.jTableDatosGuardarIvasVentas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(GuardarIvasVentasJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualGuardarIvasVentas(this.guardarivasventas,true);
				this.setVariablesFormularioToObjetoActualForeignKeysGuardarIvasVentas(this.guardarivasventas);
				
			}
			
			if(this.permiteMantenimiento(this.guardarivasventas)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.guardarivasventasSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoGuardarIvasVentas=true;
					this.inicializarActualizarBindingTablaGuardarIvasVentas(false);
					this.isEsNuevoGuardarIvasVentas=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoGuardarIvasVentas=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoGuardarIvasVentas=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesGuardarIvasVentas(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualGuardarIvasVentas(false);
				
				this.habilitarDeshabilitarControlesGuardarIvasVentas(false);
			
												
				
				if(GuardarIvasVentasJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleGuardarIvasVentas();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoGuardarIvasVentasActionPerformed(evt,guardarivasventasSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualGuardarIvasVentas(this.guardarivasventas,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosGuardarIvasVentas.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,guardarivasventasSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guardarivasventasLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.guardarivasventas.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(GuardarIvasVentas.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GuardarIvasVentas.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guardarivasventasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guardarivasventasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarGuardarIvasVentasActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guardarivasventasLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosGuardarIvasVentas.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guardarivasventas =(GuardarIvasVentas) this.guardarivasventasLogic.getGuardarIvasVentass().toArray()[this.jTableDatosGuardarIvasVentas.convertRowIndexToModel(intSelectedRow)];
				this.guardarivasventas.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.guardarivasventas =(GuardarIvasVentas) this.guardarivasventass.toArray()[this.jTableDatosGuardarIvasVentas.convertRowIndexToModel(intSelectedRow)];
				this.guardarivasventas.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.guardarivasventas)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.guardarivasventasSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((GuardarIvasVentasModel) this.jTableDatosGuardarIvasVentas.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoGuardarIvasVentas=true;
				this.inicializarActualizarBindingTablaGuardarIvasVentas(false);
				this.isEsNuevoGuardarIvasVentas=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesGuardarIvasVentas(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualGuardarIvasVentas(false);
				
				this.habilitarDeshabilitarControlesGuardarIvasVentas(false);
				
				
				
				if(GuardarIvasVentasJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleGuardarIvasVentas();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guardarivasventasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guardarivasventasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guardarivasventasLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarGuardarIvasVentasActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosGuardarIvasVentas.getRowCount()>=1) {
				jTableDatosGuardarIvasVentas.removeRowSelectionInterval(0, jTableDatosGuardarIvasVentas.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesGuardarIvasVentas(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaGuardarIvasVentas(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesGuardarIvasVentas(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualGuardarIvasVentas(false) ;
			
			this.isEsNuevoGuardarIvasVentas=false;
			
			if(GuardarIvasVentasJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleGuardarIvasVentas();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosGuardarIvasVentasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guardarivasventasLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingGuardarIvasVentas(false);
				
				//SI ES MANUAL
				if(GuardarIvasVentasJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualGuardarIvasVentas();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guardarivasventasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guardarivasventasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guardarivasventasLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosGuardarIvasVentasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoGuardarIvasVentas--;			
			//GuardarIvasVentas guardarivasventasAux= new GuardarIvasVentas();			
			//guardarivasventasAux.setId(this.iIdNuevoGuardarIvasVentas);
			
			if(this.jInternalFrameDetalleFormGuardarIvasVentas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaGuardarIvasVentas();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysGuardarIvasVentas(this.guardarivasventas);
			
			this.guardarivasventas.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.guardarivasventasLogic.getGuardarIvasVentass().add(this.guardarivasventasAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.guardarivasventass.add(this.guardarivasventasAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaGuardarIvasVentas(false);
			
			this.jTableDatosGuardarIvasVentas.setRowSelectionInterval(this.getIndiceNuevoGuardarIvasVentas(), this.getIndiceNuevoGuardarIvasVentas());
			
			int iLastRow =  this.jTableDatosGuardarIvasVentas.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosGuardarIvasVentas.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosGuardarIvasVentas.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaGuardarIvasVentas(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionGuardarIvasVentasActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guardarivasventasLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingGuardarIvasVentas(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingGuardarIvasVentas(false);
			
			//SI ES MANUAL
			if(GuardarIvasVentasJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualGuardarIvasVentas();
			}
			
			//this.abrirFrameTreeGuardarIvasVentas();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guardarivasventasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guardarivasventasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guardarivasventasLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionGuardarIvasVentasActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionGuardarIvasVentasActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionGuardarIvasVentas.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionGuardarIvasVentas.setFileImportacion(this.jInternalFrameImportacionGuardarIvasVentas.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionGuardarIvasVentas.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionGuardarIvasVentas.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionGuardarIvasVentas.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionGuardarIvasVentas.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoGuardarIvasVentasActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<GuardarIvasVentas> guardarivasventassSeleccionados=new ArrayList<GuardarIvasVentas>();		

		guardarivasventassSeleccionados=this.getGuardarIvasVentassSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoGuardarIvasVentas.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoGuardarIvasVentas.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("GuardarIvasVentasBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"GuardarIvasVentasBaseDesign.jrxml";
			
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
			
			this.generarReporteGuardarIvasVentass("Todos",guardarivasventassSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.guardarivasventasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Guardar Ivas Ventas",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoGuardarIvasVentas.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoGuardarIvasVentas.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case GuardarIvasVentasConstantesFunciones.LABEL_CODIGOESTADOASIENTOCONTABLE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoEstadoAsientoContable_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoEstadoAsientoContable_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoEstadoAsientoContable_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoEstadoAsientoContable_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case GuardarIvasVentasConstantesFunciones.LABEL_NOMBREPERIODO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbrePeriodo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbrePeriodo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbrePeriodo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbrePeriodo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case GuardarIvasVentasConstantesFunciones.LABEL_NOMBRETIPORETENCIONFUENTEIVA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreTipoRetencionFuenteIva_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreTipoRetencionFuenteIva_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreTipoRetencionFuenteIva_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreTipoRetencionFuenteIva_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case GuardarIvasVentasConstantesFunciones.LABEL_PORCENTAJE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rcentaje_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rcentaje_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rcentaje_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rcentaje_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case GuardarIvasVentasConstantesFunciones.LABEL_BASEIMPONIBLE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_seImponible_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_seImponible_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_seImponible_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_seImponible_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case GuardarIvasVentasConstantesFunciones.LABEL_VALOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case GuardarIvasVentasConstantesFunciones.LABEL_NUMERO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mero_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mero_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mero_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mero_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case GuardarIvasVentasConstantesFunciones.LABEL_RUCBENEF:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cBenef_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cBenef_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cBenef_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cBenef_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoGuardarIvasVentas.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoGuardarIvasVentas.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoGuardarIvasVentas.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case GuardarIvasVentasConstantesFunciones.LABEL_CODIGOESTADOASIENTOCONTABLE:
					sNombreCampoCategoria="codigo_estado_asiento_contable";
					break;

				case GuardarIvasVentasConstantesFunciones.LABEL_NOMBREPERIODO:
					sNombreCampoCategoria="nombre_periodo";
					break;

				case GuardarIvasVentasConstantesFunciones.LABEL_NOMBRETIPORETENCIONFUENTEIVA:
					sNombreCampoCategoria="nombre_tipo_retencion_fuente_iva";
					break;

				case GuardarIvasVentasConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoria="porcentaje";
					break;

				case GuardarIvasVentasConstantesFunciones.LABEL_BASEIMPONIBLE:
					sNombreCampoCategoria="base_imponible";
					break;

				case GuardarIvasVentasConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoria="valor";
					break;

				case GuardarIvasVentasConstantesFunciones.LABEL_NUMERO:
					sNombreCampoCategoria="numero";
					break;

				case GuardarIvasVentasConstantesFunciones.LABEL_RUCBENEF:
					sNombreCampoCategoria="ruc_benef";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoGuardarIvasVentas.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case GuardarIvasVentasConstantesFunciones.LABEL_CODIGOESTADOASIENTOCONTABLE:
					sNombreCampoCategoriaValor="codigo_estado_asiento_contable";
					break;

				case GuardarIvasVentasConstantesFunciones.LABEL_NOMBREPERIODO:
					sNombreCampoCategoriaValor="nombre_periodo";
					break;

				case GuardarIvasVentasConstantesFunciones.LABEL_NOMBRETIPORETENCIONFUENTEIVA:
					sNombreCampoCategoriaValor="nombre_tipo_retencion_fuente_iva";
					break;

				case GuardarIvasVentasConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoriaValor="porcentaje";
					break;

				case GuardarIvasVentasConstantesFunciones.LABEL_BASEIMPONIBLE:
					sNombreCampoCategoriaValor="base_imponible";
					break;

				case GuardarIvasVentasConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoriaValor="valor";
					break;

				case GuardarIvasVentasConstantesFunciones.LABEL_NUMERO:
					sNombreCampoCategoriaValor="numero";
					break;

				case GuardarIvasVentasConstantesFunciones.LABEL_RUCBENEF:
					sNombreCampoCategoriaValor="ruc_benef";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoGuardarIvasVentas.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoGuardarIvasVentas.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case GuardarIvasVentasConstantesFunciones.LABEL_CODIGOESTADOASIENTOCONTABLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Estado Asiento Contable",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_estado_asiento_contable");
					break;

				case GuardarIvasVentasConstantesFunciones.LABEL_NOMBREPERIODO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Periodo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_periodo");
					break;

				case GuardarIvasVentasConstantesFunciones.LABEL_NOMBRETIPORETENCIONFUENTEIVA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Tipo Retencion Fuente Iva",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_tipo_retencion_fuente_iva");
					break;

				case GuardarIvasVentasConstantesFunciones.LABEL_PORCENTAJE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Porcentaje",sNombreCampoCategoria,sNombreCampoCategoriaValor,"porcentaje");
					break;

				case GuardarIvasVentasConstantesFunciones.LABEL_BASEIMPONIBLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Base Imponible",sNombreCampoCategoria,sNombreCampoCategoriaValor,"base_imponible");
					break;

				case GuardarIvasVentasConstantesFunciones.LABEL_VALOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor");
					break;

				case GuardarIvasVentasConstantesFunciones.LABEL_NUMERO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero");
					break;

				case GuardarIvasVentasConstantesFunciones.LABEL_RUCBENEF:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ruc Benef",sNombreCampoCategoria,sNombreCampoCategoriaValor,"ruc_benef");
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
	
	public void jButtonGenerarExcelReporteDinamicoGuardarIvasVentasActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<GuardarIvasVentas> guardarivasventassSeleccionados=new ArrayList<GuardarIvasVentas>();		
		
		guardarivasventassSeleccionados=this.getGuardarIvasVentassSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"guardarivasventas";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("GuardarIvasVentass");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoGuardarIvasVentas.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoGuardarIvasVentas.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case GuardarIvasVentasConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(GuardarIvasVentasConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(GuardarIvasVentas guardarivasventas:guardarivasventassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(guardarivasventas.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case GuardarIvasVentasConstantesFunciones.LABEL_IDEJERCICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(GuardarIvasVentasConstantesFunciones.LABEL_IDEJERCICIO);
					iRow++;

					for(GuardarIvasVentas guardarivasventas:guardarivasventassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(guardarivasventas.getejercicio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case GuardarIvasVentasConstantesFunciones.LABEL_IDPERIODO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(GuardarIvasVentasConstantesFunciones.LABEL_IDPERIODO);
					iRow++;

					for(GuardarIvasVentas guardarivasventas:guardarivasventassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(guardarivasventas.getperiodo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case GuardarIvasVentasConstantesFunciones.LABEL_IDTIPORETENCIONFUENTEIVA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(GuardarIvasVentasConstantesFunciones.LABEL_IDTIPORETENCIONFUENTEIVA);
					iRow++;

					for(GuardarIvasVentas guardarivasventas:guardarivasventassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(guardarivasventas.gettiporetencionfuenteiva_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case GuardarIvasVentasConstantesFunciones.LABEL_CODIGOESTADOASIENTOCONTABLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(GuardarIvasVentasConstantesFunciones.LABEL_CODIGOESTADOASIENTOCONTABLE);
					iRow++;

					for(GuardarIvasVentas guardarivasventas:guardarivasventassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(guardarivasventas.getcodigo_estado_asiento_contable());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case GuardarIvasVentasConstantesFunciones.LABEL_NOMBREPERIODO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(GuardarIvasVentasConstantesFunciones.LABEL_NOMBREPERIODO);
					iRow++;

					for(GuardarIvasVentas guardarivasventas:guardarivasventassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(guardarivasventas.getnombre_periodo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case GuardarIvasVentasConstantesFunciones.LABEL_NOMBRETIPORETENCIONFUENTEIVA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(GuardarIvasVentasConstantesFunciones.LABEL_NOMBRETIPORETENCIONFUENTEIVA);
					iRow++;

					for(GuardarIvasVentas guardarivasventas:guardarivasventassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(guardarivasventas.getnombre_tipo_retencion_fuente_iva());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case GuardarIvasVentasConstantesFunciones.LABEL_PORCENTAJE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(GuardarIvasVentasConstantesFunciones.LABEL_PORCENTAJE);
					iRow++;

					for(GuardarIvasVentas guardarivasventas:guardarivasventassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(guardarivasventas.getporcentaje());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case GuardarIvasVentasConstantesFunciones.LABEL_BASEIMPONIBLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(GuardarIvasVentasConstantesFunciones.LABEL_BASEIMPONIBLE);
					iRow++;

					for(GuardarIvasVentas guardarivasventas:guardarivasventassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(guardarivasventas.getbase_imponible());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case GuardarIvasVentasConstantesFunciones.LABEL_VALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(GuardarIvasVentasConstantesFunciones.LABEL_VALOR);
					iRow++;

					for(GuardarIvasVentas guardarivasventas:guardarivasventassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(guardarivasventas.getvalor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case GuardarIvasVentasConstantesFunciones.LABEL_NUMERO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(GuardarIvasVentasConstantesFunciones.LABEL_NUMERO);
					iRow++;

					for(GuardarIvasVentas guardarivasventas:guardarivasventassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(guardarivasventas.getnumero());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case GuardarIvasVentasConstantesFunciones.LABEL_RUCBENEF:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(GuardarIvasVentasConstantesFunciones.LABEL_RUCBENEF);
					iRow++;

					for(GuardarIvasVentas guardarivasventas:guardarivasventassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(guardarivasventas.getruc_benef());
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
			//	this.getFilaCabeceraExportarExcelGuardarIvasVentas(row);				
			//	iRow++;
			//}				
			
			//for(GuardarIvasVentas guardarivasventasAux:guardarivasventassSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelGuardarIvasVentas(guardarivasventasAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.guardarivasventasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Guardar Ivas Ventas",JOptionPane.INFORMATION_MESSAGE);
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
				this.guardarivasventasLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingGuardarIvasVentas(false);
			
			//SI ES MANUAL
			if(GuardarIvasVentasJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualGuardarIvasVentas();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guardarivasventasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guardarivasventasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guardarivasventasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresGuardarIvasVentasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guardarivasventasLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingGuardarIvasVentas(false);
			
			//SI ES MANUAL
			if(GuardarIvasVentasJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualGuardarIvasVentas();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guardarivasventasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guardarivasventasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guardarivasventasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesGuardarIvasVentasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guardarivasventasLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingGuardarIvasVentas(false);
			
			//SI ES MANUAL
			if(GuardarIvasVentasJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualGuardarIvasVentas();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guardarivasventasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guardarivasventasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guardarivasventasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaGuardarIvasVentas() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosGuardarIvasVentas.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosGuardarIvasVentas.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosGuardarIvasVentas.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosGuardarIvasVentas.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosGuardarIvasVentas.setMinimumSize(dimensionMinimum);
		this.jTableDatosGuardarIvasVentas.setMaximumSize(dimensionMaximum);
		this.jTableDatosGuardarIvasVentas.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingGuardarIvasVentas(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingGuardarIvasVentas(esInicializar,true);
	}
	
	public void inicializarActualizarBindingGuardarIvasVentas(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaGuardarIvasVentas(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesGuardarIvasVentas(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.guardarivasventasSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasGuardarIvasVentas(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesGuardarIvasVentas(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesGuardarIvasVentas(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !GuardarIvasVentasJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!GuardarIvasVentasJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualGuardarIvasVentas() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaGuardarIvasVentas();
		
		this.inicializarActualizarBindingBotonesManualGuardarIvasVentas(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.guardarivasventasSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualGuardarIvasVentas();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesGuardarIvasVentas() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualGuardarIvasVentas(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualGuardarIvasVentas(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosGuardarIvasVentas.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosGuardarIvasVentas.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteGuardarIvasVentas.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormGuardarIvasVentas!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormGuardarIvasVentas.jCheckBoxPostAccionNuevoGuardarIvasVentas.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormGuardarIvasVentas.jCheckBoxPostAccionSinCerrarGuardarIvasVentas.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormGuardarIvasVentas.jCheckBoxPostAccionSinMensajeGuardarIvasVentas.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosGuardarIvasVentas.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosGuardarIvasVentas.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteGuardarIvasVentas.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormGuardarIvasVentas!=null) {
				this.jInternalFrameDetalleFormGuardarIvasVentas.jCheckBoxPostAccionNuevoGuardarIvasVentas.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormGuardarIvasVentas.jCheckBoxPostAccionSinCerrarGuardarIvasVentas.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormGuardarIvasVentas.jCheckBoxPostAccionSinMensajeGuardarIvasVentas.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionGuardarIvasVentas.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionGuardarIvasVentas.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormGuardarIvasVentas!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormGuardarIvasVentas.jComboBoxTiposAccionesFormularioGuardarIvasVentas.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesGuardarIvasVentas.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoGuardarIvasVentas!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoGuardarIvasVentas.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesGuardarIvasVentas.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesGuardarIvasVentas.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarGuardarIvasVentas.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesGuardarIvasVentas.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoGuardarIvasVentas!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoGuardarIvasVentas.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesGuardarIvasVentas.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralGuardarIvasVentas.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesGuardarIvasVentas(Boolean esInicializar) throws Exception {
		try	{	
			if(GuardarIvasVentasJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualGuardarIvasVentas(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesGuardarIvasVentas() throws Exception {
		try	{
			if(GuardarIvasVentasJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualGuardarIvasVentas();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleGuardarIvasVentas() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormGuardarIvasVentas.jComboBoxTiposAccionesFormularioGuardarIvasVentas.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormGuardarIvasVentas.jComboBoxTiposAccionesFormularioGuardarIvasVentas.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualGuardarIvasVentas() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesGuardarIvasVentas.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesGuardarIvasVentas.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesGuardarIvasVentas.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesGuardarIvasVentas.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesGuardarIvasVentas.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesGuardarIvasVentas.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionGuardarIvasVentas.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionGuardarIvasVentas.addItem(reporte);
			}
			
			
			if(!this.guardarivasventasSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionGuardarIvasVentas.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionGuardarIvasVentas.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesGuardarIvasVentas.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesGuardarIvasVentas.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesGuardarIvasVentas.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesGuardarIvasVentas.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormGuardarIvasVentas!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormGuardarIvasVentas.jComboBoxTiposAccionesFormularioGuardarIvasVentas.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormGuardarIvasVentas.jComboBoxTiposAccionesFormularioGuardarIvasVentas.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarGuardarIvasVentas.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarGuardarIvasVentas.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarGuardarIvasVentas.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualGuardarIvasVentas();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualGuardarIvasVentas() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoGuardarIvasVentas!=null) {
				this.jInternalFrameReporteDinamicoGuardarIvasVentas.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoGuardarIvasVentas.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoGuardarIvasVentas!=null) {
				this.jInternalFrameReporteDinamicoGuardarIvasVentas.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoGuardarIvasVentas.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoGuardarIvasVentas!=null) {
				
				if(this.jInternalFrameReporteDinamicoGuardarIvasVentas.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoGuardarIvasVentas.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoGuardarIvasVentas.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoGuardarIvasVentas.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoGuardarIvasVentas.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoGuardarIvasVentas.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoGuardarIvasVentas.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoGuardarIvasVentas.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=GuardarIvasVentasConstantesFunciones.getTiposSeleccionarGuardarIvasVentas(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoGuardarIvasVentas.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoGuardarIvasVentas.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoGuardarIvasVentas.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=GuardarIvasVentasConstantesFunciones.getTiposSeleccionarGuardarIvasVentas(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoGuardarIvasVentas.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoGuardarIvasVentas.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoGuardarIvasVentas.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=GuardarIvasVentasConstantesFunciones.getTiposSeleccionarGuardarIvasVentas(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoGuardarIvasVentas.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoGuardarIvasVentas.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoGuardarIvasVentas.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoGuardarIvasVentas.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualGuardarIvasVentas()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_ejercicioBusquedaGuardarIvasVentasGuardarIvasVentas.getSelectedItem()!=null){this.id_ejercicioBusquedaGuardarIvasVentas=((Ejercicio)this.jComboBoxid_ejercicioBusquedaGuardarIvasVentasGuardarIvasVentas.getSelectedItem()).getId();}
		if(this.jComboBoxid_periodoBusquedaGuardarIvasVentasGuardarIvasVentas.getSelectedItem()!=null){this.id_periodoBusquedaGuardarIvasVentas=((Periodo)this.jComboBoxid_periodoBusquedaGuardarIvasVentasGuardarIvasVentas.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_retencion_fuente_ivaBusquedaGuardarIvasVentasGuardarIvasVentas.getSelectedItem()!=null){this.id_tipo_retencion_fuente_ivaBusquedaGuardarIvasVentas=((TipoRetencion)this.jComboBoxid_tipo_retencion_fuente_ivaBusquedaGuardarIvasVentasGuardarIvasVentas.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasGuardarIvasVentas(Boolean esInicializar) throws Exception {				
		if(GuardarIvasVentasJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualGuardarIvasVentas();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaGuardarIvasVentas() throws Exception {
		this.inicializarActualizarBindingTablaGuardarIvasVentas(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByGuardarIvasVentas() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByGuardarIvasVentas.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByGuardarIvasVentas.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByGuardarIvasVentas.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new GuardarIvasVentasPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByGuardarIvasVentas.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByGuardarIvasVentas.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new GuardarIvasVentasPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosGuardarIvasVentasOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGuardarIvasVentasOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new GuardarIvasVentasPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByGuardarIvasVentas.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByGuardarIvasVentas.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new GuardarIvasVentasPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByGuardarIvasVentas.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaGuardarIvasVentas(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=guardarivasventasLogic.getGuardarIvasVentass().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=guardarivasventass.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(GuardarIvasVentasJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosGuardarIvasVentas.setModel(new GuardarIvasVentasModel(this.guardarivasventasLogic.getGuardarIvasVentass(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosGuardarIvasVentas.setModel(new GuardarIvasVentasModel(this.guardarivasventass,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByGuardarIvasVentas!=null && this.jInternalFrameOrderByGuardarIvasVentas.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByGuardarIvasVentas();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosGuardarIvasVentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGuardarIvasVentas,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new GuardarIvasVentasPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+GuardarIvasVentasConstantesFunciones.SCLASSWEBTITULO,guardarivasventasConstantesFunciones.resaltarSeleccionarGuardarIvasVentas,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+GuardarIvasVentasConstantesFunciones.SCLASSWEBTITULO,guardarivasventasConstantesFunciones.resaltarSeleccionarGuardarIvasVentas,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosGuardarIvasVentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGuardarIvasVentas,GuardarIvasVentasConstantesFunciones.LABEL_ID));

		if(this.guardarivasventasConstantesFunciones.mostraridGuardarIvasVentas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,GuardarIvasVentasConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.guardarivasventasConstantesFunciones.resaltaridGuardarIvasVentas,this.guardarivasventasConstantesFunciones.activaridGuardarIvasVentas,iSizeTabla,this,true,"idGuardarIvasVentas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.guardarivasventasConstantesFunciones.resaltaridGuardarIvasVentas,this.guardarivasventasConstantesFunciones.activaridGuardarIvasVentas,this,true,"idGuardarIvasVentas","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosGuardarIvasVentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGuardarIvasVentas,GuardarIvasVentasConstantesFunciones.LABEL_CODIGOESTADOASIENTOCONTABLE));

		if(this.guardarivasventasConstantesFunciones.mostrarcodigo_estado_asiento_contableGuardarIvasVentas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,GuardarIvasVentasConstantesFunciones.LABEL_CODIGOESTADOASIENTOCONTABLE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.guardarivasventasConstantesFunciones.resaltarcodigo_estado_asiento_contableGuardarIvasVentas,this.guardarivasventasConstantesFunciones.activarcodigo_estado_asiento_contableGuardarIvasVentas,iSizeTabla,this,true,"codigo_estado_asiento_contableGuardarIvasVentas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.guardarivasventasConstantesFunciones.resaltarcodigo_estado_asiento_contableGuardarIvasVentas,this.guardarivasventasConstantesFunciones.activarcodigo_estado_asiento_contableGuardarIvasVentas,this,true,"codigo_estado_asiento_contableGuardarIvasVentas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new GuardarIvasVentasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosGuardarIvasVentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGuardarIvasVentas,GuardarIvasVentasConstantesFunciones.LABEL_NOMBREPERIODO));

		if(this.guardarivasventasConstantesFunciones.mostrarnombre_periodoGuardarIvasVentas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,GuardarIvasVentasConstantesFunciones.LABEL_NOMBREPERIODO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.guardarivasventasConstantesFunciones.resaltarnombre_periodoGuardarIvasVentas,this.guardarivasventasConstantesFunciones.activarnombre_periodoGuardarIvasVentas,iSizeTabla,this,true,"nombre_periodoGuardarIvasVentas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.guardarivasventasConstantesFunciones.resaltarnombre_periodoGuardarIvasVentas,this.guardarivasventasConstantesFunciones.activarnombre_periodoGuardarIvasVentas,this,true,"nombre_periodoGuardarIvasVentas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new GuardarIvasVentasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosGuardarIvasVentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGuardarIvasVentas,GuardarIvasVentasConstantesFunciones.LABEL_NOMBRETIPORETENCIONFUENTEIVA));

		if(this.guardarivasventasConstantesFunciones.mostrarnombre_tipo_retencion_fuente_ivaGuardarIvasVentas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,GuardarIvasVentasConstantesFunciones.LABEL_NOMBRETIPORETENCIONFUENTEIVA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.guardarivasventasConstantesFunciones.resaltarnombre_tipo_retencion_fuente_ivaGuardarIvasVentas,this.guardarivasventasConstantesFunciones.activarnombre_tipo_retencion_fuente_ivaGuardarIvasVentas,iSizeTabla,this,true,"nombre_tipo_retencion_fuente_ivaGuardarIvasVentas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.guardarivasventasConstantesFunciones.resaltarnombre_tipo_retencion_fuente_ivaGuardarIvasVentas,this.guardarivasventasConstantesFunciones.activarnombre_tipo_retencion_fuente_ivaGuardarIvasVentas,this,true,"nombre_tipo_retencion_fuente_ivaGuardarIvasVentas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new GuardarIvasVentasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosGuardarIvasVentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGuardarIvasVentas,GuardarIvasVentasConstantesFunciones.LABEL_PORCENTAJE));

		if(this.guardarivasventasConstantesFunciones.mostrarporcentajeGuardarIvasVentas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,GuardarIvasVentasConstantesFunciones.LABEL_PORCENTAJE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.guardarivasventasConstantesFunciones.resaltarporcentajeGuardarIvasVentas,this.guardarivasventasConstantesFunciones.activarporcentajeGuardarIvasVentas,iSizeTabla,this,true,"porcentajeGuardarIvasVentas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.guardarivasventasConstantesFunciones.resaltarporcentajeGuardarIvasVentas,this.guardarivasventasConstantesFunciones.activarporcentajeGuardarIvasVentas,this,true,"porcentajeGuardarIvasVentas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new GuardarIvasVentasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosGuardarIvasVentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGuardarIvasVentas,GuardarIvasVentasConstantesFunciones.LABEL_BASEIMPONIBLE));

		if(this.guardarivasventasConstantesFunciones.mostrarbase_imponibleGuardarIvasVentas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,GuardarIvasVentasConstantesFunciones.LABEL_BASEIMPONIBLE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.guardarivasventasConstantesFunciones.resaltarbase_imponibleGuardarIvasVentas,this.guardarivasventasConstantesFunciones.activarbase_imponibleGuardarIvasVentas,iSizeTabla,this,true,"base_imponibleGuardarIvasVentas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.guardarivasventasConstantesFunciones.resaltarbase_imponibleGuardarIvasVentas,this.guardarivasventasConstantesFunciones.activarbase_imponibleGuardarIvasVentas,this,true,"base_imponibleGuardarIvasVentas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new GuardarIvasVentasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosGuardarIvasVentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGuardarIvasVentas,GuardarIvasVentasConstantesFunciones.LABEL_VALOR));

		if(this.guardarivasventasConstantesFunciones.mostrarvalorGuardarIvasVentas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,GuardarIvasVentasConstantesFunciones.LABEL_VALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.guardarivasventasConstantesFunciones.resaltarvalorGuardarIvasVentas,this.guardarivasventasConstantesFunciones.activarvalorGuardarIvasVentas,iSizeTabla,this,true,"valorGuardarIvasVentas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.guardarivasventasConstantesFunciones.resaltarvalorGuardarIvasVentas,this.guardarivasventasConstantesFunciones.activarvalorGuardarIvasVentas,this,true,"valorGuardarIvasVentas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new GuardarIvasVentasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosGuardarIvasVentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGuardarIvasVentas,GuardarIvasVentasConstantesFunciones.LABEL_NUMERO));

		if(this.guardarivasventasConstantesFunciones.mostrarnumeroGuardarIvasVentas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,GuardarIvasVentasConstantesFunciones.LABEL_NUMERO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.guardarivasventasConstantesFunciones.resaltarnumeroGuardarIvasVentas,this.guardarivasventasConstantesFunciones.activarnumeroGuardarIvasVentas,iSizeTabla,this,true,"numeroGuardarIvasVentas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.guardarivasventasConstantesFunciones.resaltarnumeroGuardarIvasVentas,this.guardarivasventasConstantesFunciones.activarnumeroGuardarIvasVentas,this,true,"numeroGuardarIvasVentas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new GuardarIvasVentasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosGuardarIvasVentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGuardarIvasVentas,GuardarIvasVentasConstantesFunciones.LABEL_RUCBENEF));

		if(this.guardarivasventasConstantesFunciones.mostrarruc_benefGuardarIvasVentas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,GuardarIvasVentasConstantesFunciones.LABEL_RUCBENEF,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.guardarivasventasConstantesFunciones.resaltarruc_benefGuardarIvasVentas,this.guardarivasventasConstantesFunciones.activarruc_benefGuardarIvasVentas,iSizeTabla,this,true,"ruc_benefGuardarIvasVentas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.guardarivasventasConstantesFunciones.resaltarruc_benefGuardarIvasVentas,this.guardarivasventasConstantesFunciones.activarruc_benefGuardarIvasVentas,this,true,"ruc_benefGuardarIvasVentas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new GuardarIvasVentasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.guardarivasventasSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.guardarivasventasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.guardarivasventasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosGuardarIvasVentas.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.guardarivasventasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.guardarivasventasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosGuardarIvasVentas.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarGuardarIvasVentas && this.isPermisoGuardarCambiosGuardarIvasVentas) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.guardarivasventasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.guardarivasventasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosGuardarIvasVentas.addColumn(tableColumn);
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
			
			this.jTableDatosGuardarIvasVentas.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarGuardarIvasVentas && this.isPermisoGuardarCambiosGuardarIvasVentas) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarGuardarIvasVentas && this.isPermisoGuardarCambiosGuardarIvasVentas) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosGuardarIvasVentas.moveColumn(this.jTableDatosGuardarIvasVentas.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosGuardarIvasVentas.moveColumn(this.jTableDatosGuardarIvasVentas.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosGuardarIvasVentas.moveColumn(this.jTableDatosGuardarIvasVentas.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosGuardarIvasVentas.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosGuardarIvasVentas.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosGuardarIvasVentas,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!GuardarIvasVentasJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosGuardarIvasVentas.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosGuardarIvasVentas.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!GuardarIvasVentasJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!GuardarIvasVentasJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosGuardarIvasVentas.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosGuardarIvasVentas.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosGuardarIvasVentas.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=guardarivasventasLogic.getGuardarIvasVentass().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=guardarivasventass.size()-1;
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
		//this.jTableDatosGuardarIvasVentas.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosGuardarIvasVentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosGuardarIvasVentas();
			
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
				
				//this.isEsNuevoGuardarIvasVentas=false;
					
				GuardarIvasVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.guardarivasventas,new Object(),this.guardarivasventasParameterGeneral,this.guardarivasventasReturnGeneral);
			
				if(this.guardarivasventasSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormGuardarIvasVentas==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosGuardarIvasVentas.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosGuardarIvasVentas.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guardarivasventas =(GuardarIvasVentas) this.guardarivasventasLogic.getGuardarIvasVentass().toArray()[this.jTableDatosGuardarIvasVentas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.guardarivasventas =(GuardarIvasVentas) this.guardarivasventass.toArray()[this.jTableDatosGuardarIvasVentas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.guardarivasventas.getsType().equals("DUPLICADO")
				   || this.guardarivasventas.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoGuardarIvasVentas=true;
				
				} else {
					this.isEsNuevoGuardarIvasVentas=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.guardarivasventasSessionBean.getEsGuardarRelacionado()) {
					if(this.guardarivasventas.getId()>=0 && !this.guardarivasventas.getIsNew()) {						
						this.isEsNuevoGuardarIvasVentas=false;
						
					} else {
						this.isEsNuevoGuardarIvasVentas=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoGuardarIvasVentas(esRelaciones);						
				
				this.seleccionarGuardarIvasVentas(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.guardarivasventas.getId()<0) {
					this.isEsNuevoGuardarIvasVentas=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarGuardarIvasVentas(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarGuardarIvasVentas(evt,rowIndex);
				}	
				
				if(this.guardarivasventasSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion GuardarIvasVentas: " + this.dDif); 
					}
				}								
				
				GuardarIvasVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.guardarivasventas,new Object(),this.guardarivasventasParameterGeneral,this.guardarivasventasReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarGuardarIvasVentas(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.guardarivasventas)) {
					if(this.guardarivasventas.getId()>0) {
						this.guardarivasventas.setIsDeleted(true);
						
						this.guardarivasventassEliminados.add(this.guardarivasventas);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.guardarivasventasLogic.getGuardarIvasVentass().remove(this.guardarivasventas);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.guardarivasventass.remove(this.guardarivasventas);				
					}
					
					
					((GuardarIvasVentasModel) this.jTableDatosGuardarIvasVentas.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaGuardarIvasVentas(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarGuardarIvasVentas(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoGuardarIvasVentas) {
			
			if(this.jInternalFrameDetalleFormGuardarIvasVentas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosGuardarIvasVentas.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosGuardarIvasVentas.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guardarivasventas =(GuardarIvasVentas) this.guardarivasventasLogic.getGuardarIvasVentass().toArray()[this.jTableDatosGuardarIvasVentas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.guardarivasventas =(GuardarIvasVentas) this.guardarivasventass.toArray()[this.jTableDatosGuardarIvasVentas.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(GuardarIvasVentasJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioGuardarIvasVentas(this.guardarivasventas);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesGuardarIvasVentas("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesGuardarIvasVentas(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualGuardarIvasVentas() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoGuardarIvasVentas(GuardarIvasVentas guardarivasventas) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoGuardarIvasVentas(guardarivasventas,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoGuardarIvasVentas(GuardarIvasVentas guardarivasventas,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioGuardarIvasVentas(guardarivasventas);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyGuardarIvasVentas(guardarivasventas,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyGuardarIvasVentas(guardarivasventas);
	}
	
	public void setVariablesObjetoActualToFormularioGuardarIvasVentas(GuardarIvasVentas guardarivasventas) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormGuardarIvasVentas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormGuardarIvasVentas.jLabelidGuardarIvasVentas.setText(guardarivasventas.getId().toString());
			this.jInternalFrameDetalleFormGuardarIvasVentas.jTextFieldcodigo_estado_asiento_contableGuardarIvasVentas.setText(guardarivasventas.getcodigo_estado_asiento_contable());
			this.jInternalFrameDetalleFormGuardarIvasVentas.jTextFieldnombre_periodoGuardarIvasVentas.setText(guardarivasventas.getnombre_periodo());
			this.jInternalFrameDetalleFormGuardarIvasVentas.jTextAreanombre_tipo_retencion_fuente_ivaGuardarIvasVentas.setText(guardarivasventas.getnombre_tipo_retencion_fuente_iva());
			this.jInternalFrameDetalleFormGuardarIvasVentas.jTextFieldporcentajeGuardarIvasVentas.setText(guardarivasventas.getporcentaje().toString());
			this.jInternalFrameDetalleFormGuardarIvasVentas.jTextFieldbase_imponibleGuardarIvasVentas.setText(guardarivasventas.getbase_imponible().toString());
			this.jInternalFrameDetalleFormGuardarIvasVentas.jTextFieldvalorGuardarIvasVentas.setText(guardarivasventas.getvalor().toString());
			this.jInternalFrameDetalleFormGuardarIvasVentas.jTextFieldnumeroGuardarIvasVentas.setText(guardarivasventas.getnumero());
			this.jInternalFrameDetalleFormGuardarIvasVentas.jTextFieldruc_benefGuardarIvasVentas.setText(guardarivasventas.getruc_benef());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,GuardarIvasVentas guardarivasventasLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,guardarivasventasLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,GuardarIvasVentas guardarivasventasLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				guardarivasventasLocal=this.guardarivasventas;
			} else {
				guardarivasventasLocal=this.guardarivasventasAnterior;
			}
		}
		
		if(this.permiteMantenimiento(guardarivasventasLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoGuardarIvasVentas(guardarivasventasLocal,true);
					
					if(guardarivasventasSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(guardarivasventasLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.guardarivasventasSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(guardarivasventasLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoGuardarIvasVentas(GuardarIvasVentas guardarivasventas,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualGuardarIvasVentas(guardarivasventas,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysGuardarIvasVentas(guardarivasventas);
	}
	
	public void setVariablesFormularioToObjetoActualGuardarIvasVentas(GuardarIvasVentas guardarivasventas,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualGuardarIvasVentas(guardarivasventas,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualGuardarIvasVentas(GuardarIvasVentas guardarivasventas,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormGuardarIvasVentas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormGuardarIvasVentas.jLabelidGuardarIvasVentas.getText()==null || this.jInternalFrameDetalleFormGuardarIvasVentas.jLabelidGuardarIvasVentas.getText()=="" || this.jInternalFrameDetalleFormGuardarIvasVentas.jLabelidGuardarIvasVentas.getText()=="Id") {
				this.jInternalFrameDetalleFormGuardarIvasVentas.jLabelidGuardarIvasVentas.setText("0");
			}

			if(conColumnasBase) {guardarivasventas.setId(Long.parseLong(this.jInternalFrameDetalleFormGuardarIvasVentas.jLabelidGuardarIvasVentas.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+GuardarIvasVentasConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGuardarIvasVentas.jLabelIdGuardarIvasVentas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			guardarivasventas.setcodigo_estado_asiento_contable(this.jInternalFrameDetalleFormGuardarIvasVentas.jTextFieldcodigo_estado_asiento_contableGuardarIvasVentas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+GuardarIvasVentasConstantesFunciones.LABEL_CODIGOESTADOASIENTOCONTABLE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGuardarIvasVentas.jLabelcodigo_estado_asiento_contableGuardarIvasVentas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			guardarivasventas.setnombre_periodo(this.jInternalFrameDetalleFormGuardarIvasVentas.jTextFieldnombre_periodoGuardarIvasVentas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+GuardarIvasVentasConstantesFunciones.LABEL_NOMBREPERIODO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGuardarIvasVentas.jLabelnombre_periodoGuardarIvasVentas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			guardarivasventas.setnombre_tipo_retencion_fuente_iva(this.jInternalFrameDetalleFormGuardarIvasVentas.jTextAreanombre_tipo_retencion_fuente_ivaGuardarIvasVentas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+GuardarIvasVentasConstantesFunciones.LABEL_NOMBRETIPORETENCIONFUENTEIVA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGuardarIvasVentas.jLabelnombre_tipo_retencion_fuente_ivaGuardarIvasVentas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			guardarivasventas.setporcentaje(Double.parseDouble(this.jInternalFrameDetalleFormGuardarIvasVentas.jTextFieldporcentajeGuardarIvasVentas.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+GuardarIvasVentasConstantesFunciones.LABEL_PORCENTAJE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGuardarIvasVentas.jLabelporcentajeGuardarIvasVentas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			guardarivasventas.setbase_imponible(Double.parseDouble(this.jInternalFrameDetalleFormGuardarIvasVentas.jTextFieldbase_imponibleGuardarIvasVentas.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+GuardarIvasVentasConstantesFunciones.LABEL_BASEIMPONIBLE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGuardarIvasVentas.jLabelbase_imponibleGuardarIvasVentas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			guardarivasventas.setvalor(Double.parseDouble(this.jInternalFrameDetalleFormGuardarIvasVentas.jTextFieldvalorGuardarIvasVentas.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+GuardarIvasVentasConstantesFunciones.LABEL_VALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGuardarIvasVentas.jLabelvalorGuardarIvasVentas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			guardarivasventas.setnumero(this.jInternalFrameDetalleFormGuardarIvasVentas.jTextFieldnumeroGuardarIvasVentas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+GuardarIvasVentasConstantesFunciones.LABEL_NUMERO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGuardarIvasVentas.jLabelnumeroGuardarIvasVentas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			guardarivasventas.setruc_benef(this.jInternalFrameDetalleFormGuardarIvasVentas.jTextFieldruc_benefGuardarIvasVentas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+GuardarIvasVentasConstantesFunciones.LABEL_RUCBENEF+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGuardarIvasVentas.jLabelruc_benefGuardarIvasVentas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualGuardarIvasVentas(GuardarIvasVentas guardarivasventasBean,GuardarIvasVentas guardarivasventas,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosGuardarIvasVentas(GuardarIvasVentas guardarivasventasOrigen,GuardarIvasVentas guardarivasventas,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && guardarivasventasOrigen.getId()!=null && !guardarivasventasOrigen.getId().equals(0L))) {guardarivasventas.setId(guardarivasventasOrigen.getId());}}
			if(conDefault || (!conDefault && guardarivasventasOrigen.getcodigo_estado_asiento_contable()!=null && !guardarivasventasOrigen.getcodigo_estado_asiento_contable().equals(""))) {guardarivasventas.setcodigo_estado_asiento_contable(guardarivasventasOrigen.getcodigo_estado_asiento_contable());}
			if(conDefault || (!conDefault && guardarivasventasOrigen.getnombre_periodo()!=null && !guardarivasventasOrigen.getnombre_periodo().equals(""))) {guardarivasventas.setnombre_periodo(guardarivasventasOrigen.getnombre_periodo());}
			if(conDefault || (!conDefault && guardarivasventasOrigen.getnombre_tipo_retencion_fuente_iva()!=null && !guardarivasventasOrigen.getnombre_tipo_retencion_fuente_iva().equals(""))) {guardarivasventas.setnombre_tipo_retencion_fuente_iva(guardarivasventasOrigen.getnombre_tipo_retencion_fuente_iva());}
			if(conDefault || (!conDefault && guardarivasventasOrigen.getporcentaje()!=null && !guardarivasventasOrigen.getporcentaje().equals(0.0))) {guardarivasventas.setporcentaje(guardarivasventasOrigen.getporcentaje());}
			if(conDefault || (!conDefault && guardarivasventasOrigen.getbase_imponible()!=null && !guardarivasventasOrigen.getbase_imponible().equals(0.0))) {guardarivasventas.setbase_imponible(guardarivasventasOrigen.getbase_imponible());}
			if(conDefault || (!conDefault && guardarivasventasOrigen.getvalor()!=null && !guardarivasventasOrigen.getvalor().equals(0.0))) {guardarivasventas.setvalor(guardarivasventasOrigen.getvalor());}
			if(conDefault || (!conDefault && guardarivasventasOrigen.getnumero()!=null && !guardarivasventasOrigen.getnumero().equals(""))) {guardarivasventas.setnumero(guardarivasventasOrigen.getnumero());}
			if(conDefault || (!conDefault && guardarivasventasOrigen.getruc_benef()!=null && !guardarivasventasOrigen.getruc_benef().equals(""))) {guardarivasventas.setruc_benef(guardarivasventasOrigen.getruc_benef());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioGuardarIvasVentas(GuardarIvasVentas guardarivasventas) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormGuardarIvasVentas.jLabelidGuardarIvasVentas.setText(guardarivasventas.getId().toString());
			this.jInternalFrameDetalleFormGuardarIvasVentas.jTextFieldcodigo_estado_asiento_contableGuardarIvasVentas.setText(guardarivasventas.getcodigo_estado_asiento_contable());
			this.jInternalFrameDetalleFormGuardarIvasVentas.jTextFieldnombre_periodoGuardarIvasVentas.setText(guardarivasventas.getnombre_periodo());
			this.jInternalFrameDetalleFormGuardarIvasVentas.jTextAreanombre_tipo_retencion_fuente_ivaGuardarIvasVentas.setText(guardarivasventas.getnombre_tipo_retencion_fuente_iva());
			this.jInternalFrameDetalleFormGuardarIvasVentas.jTextFieldporcentajeGuardarIvasVentas.setText(guardarivasventas.getporcentaje().toString());
			this.jInternalFrameDetalleFormGuardarIvasVentas.jTextFieldbase_imponibleGuardarIvasVentas.setText(guardarivasventas.getbase_imponible().toString());
			this.jInternalFrameDetalleFormGuardarIvasVentas.jTextFieldvalorGuardarIvasVentas.setText(guardarivasventas.getvalor().toString());
			this.jInternalFrameDetalleFormGuardarIvasVentas.jTextFieldnumeroGuardarIvasVentas.setText(guardarivasventas.getnumero());
			this.jInternalFrameDetalleFormGuardarIvasVentas.jTextFieldruc_benefGuardarIvasVentas.setText(guardarivasventas.getruc_benef());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioGuardarIvasVentas(GuardarIvasVentasBean guardarivasventasBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormGuardarIvasVentas.jLabelidGuardarIvasVentas.setText(guardarivasventasBean.getId().toString());
			this.jInternalFrameDetalleFormGuardarIvasVentas.jTextFieldcodigo_estado_asiento_contableGuardarIvasVentas.setText(guardarivasventasBean.getcodigo_estado_asiento_contable());
			this.jInternalFrameDetalleFormGuardarIvasVentas.jTextFieldnombre_periodoGuardarIvasVentas.setText(guardarivasventasBean.getnombre_periodo());
			this.jInternalFrameDetalleFormGuardarIvasVentas.jTextAreanombre_tipo_retencion_fuente_ivaGuardarIvasVentas.setText(guardarivasventasBean.getnombre_tipo_retencion_fuente_iva());
			this.jInternalFrameDetalleFormGuardarIvasVentas.jTextFieldporcentajeGuardarIvasVentas.setText(guardarivasventasBean.getporcentaje().toString());
			this.jInternalFrameDetalleFormGuardarIvasVentas.jTextFieldbase_imponibleGuardarIvasVentas.setText(guardarivasventasBean.getbase_imponible().toString());
			this.jInternalFrameDetalleFormGuardarIvasVentas.jTextFieldvalorGuardarIvasVentas.setText(guardarivasventasBean.getvalor().toString());
			this.jInternalFrameDetalleFormGuardarIvasVentas.jTextFieldnumeroGuardarIvasVentas.setText(guardarivasventasBean.getnumero());
			this.jInternalFrameDetalleFormGuardarIvasVentas.jTextFieldruc_benefGuardarIvasVentas.setText(guardarivasventasBean.getruc_benef());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanGuardarIvasVentas(GuardarIvasVentasParameterReturnGeneral guardarivasventasReturnGeneral,GuardarIvasVentasBean guardarivasventasBean,Boolean conDefault) throws Exception { 
		try {
			GuardarIvasVentas guardarivasventasLocal=new GuardarIvasVentas();
			
			guardarivasventasLocal=guardarivasventasReturnGeneral.getGuardarIvasVentas();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && guardarivasventasLocal.getId()!=null && !guardarivasventasLocal.getId().equals(0L))) {guardarivasventasBean.setId(guardarivasventasLocal.getId());}}
			if(conDefault || (!conDefault && guardarivasventasLocal.getcodigo_estado_asiento_contable()!=null && !guardarivasventasLocal.getcodigo_estado_asiento_contable().equals(""))) {guardarivasventasBean.setcodigo_estado_asiento_contable(guardarivasventasLocal.getcodigo_estado_asiento_contable());}
			if(conDefault || (!conDefault && guardarivasventasLocal.getnombre_periodo()!=null && !guardarivasventasLocal.getnombre_periodo().equals(""))) {guardarivasventasBean.setnombre_periodo(guardarivasventasLocal.getnombre_periodo());}
			if(conDefault || (!conDefault && guardarivasventasLocal.getnombre_tipo_retencion_fuente_iva()!=null && !guardarivasventasLocal.getnombre_tipo_retencion_fuente_iva().equals(""))) {guardarivasventasBean.setnombre_tipo_retencion_fuente_iva(guardarivasventasLocal.getnombre_tipo_retencion_fuente_iva());}
			if(conDefault || (!conDefault && guardarivasventasLocal.getporcentaje()!=null && !guardarivasventasLocal.getporcentaje().equals(0.0))) {guardarivasventasBean.setporcentaje(guardarivasventasLocal.getporcentaje());}
			if(conDefault || (!conDefault && guardarivasventasLocal.getbase_imponible()!=null && !guardarivasventasLocal.getbase_imponible().equals(0.0))) {guardarivasventasBean.setbase_imponible(guardarivasventasLocal.getbase_imponible());}
			if(conDefault || (!conDefault && guardarivasventasLocal.getvalor()!=null && !guardarivasventasLocal.getvalor().equals(0.0))) {guardarivasventasBean.setvalor(guardarivasventasLocal.getvalor());}
			if(conDefault || (!conDefault && guardarivasventasLocal.getnumero()!=null && !guardarivasventasLocal.getnumero().equals(""))) {guardarivasventasBean.setnumero(guardarivasventasLocal.getnumero());}
			if(conDefault || (!conDefault && guardarivasventasLocal.getruc_benef()!=null && !guardarivasventasLocal.getruc_benef().equals(""))) {guardarivasventasBean.setruc_benef(guardarivasventasLocal.getruc_benef());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxGuardarIvasVentasGenerico(Long idGuardarIvasVentasSeleccionado,JComboBox jComboBoxGuardarIvasVentas,List<GuardarIvasVentas> guardarivasventassLocal)throws Exception {
		try {
			GuardarIvasVentas  guardarivasventasTemp=null;

			for(GuardarIvasVentas guardarivasventasAux:guardarivasventassLocal) {
				if(guardarivasventasAux.getId()!=null && guardarivasventasAux.getId().equals(idGuardarIvasVentasSeleccionado)) {
					guardarivasventasTemp=guardarivasventasAux;
					break;
				}
			}

			jComboBoxGuardarIvasVentas.setSelectedItem(guardarivasventasTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxGuardarIvasVentasGenerico(JComboBox jComboBoxGuardarIvasVentas,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxGuardarIvasVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxGuardarIvasVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxGuardarIvasVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxGuardarIvasVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxGuardarIvasVentas.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxGuardarIvasVentas.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxGuardarIvasVentas.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxGuardarIvasVentas.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxGuardarIvasVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxGuardarIvasVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			guardarivasventas=(GuardarIvasVentas) guardarivasventasLogic.getGuardarIvasVentass().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			guardarivasventas =(GuardarIvasVentas) guardarivasventass.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!guardarivasventas.getIsNew() && !guardarivasventas.getIsChanged() && !guardarivasventas.getIsDeleted()) {
				sDescripcion=guardarivasventas.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=guardarivasventas.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Ejercicio")) {
			//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
			if(!guardarivasventas.getIsNew() && !guardarivasventas.getIsChanged() && !guardarivasventas.getIsDeleted()) {
				sDescripcion=guardarivasventas.getejercicio_descripcion();
			} else {
				//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
				sDescripcion=guardarivasventas.getejercicio_descripcion();
			}
		}

		if(sTipo.equals("Periodo")) {
			//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
			if(!guardarivasventas.getIsNew() && !guardarivasventas.getIsChanged() && !guardarivasventas.getIsDeleted()) {
				sDescripcion=guardarivasventas.getperiodo_descripcion();
			} else {
				//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
				sDescripcion=guardarivasventas.getperiodo_descripcion();
			}
		}

		if(sTipo.equals("TipoRetencionFuenteIva")) {
			//sDescripcion=this.getActualTipoRetencionFuenteIvaForeignKeyDescripcion((Long)value);
			if(!guardarivasventas.getIsNew() && !guardarivasventas.getIsChanged() && !guardarivasventas.getIsDeleted()) {
				sDescripcion=guardarivasventas.gettiporetencionfuenteiva_descripcion();
			} else {
				//sDescripcion=this.getActualTipoRetencionFuenteIvaForeignKeyDescripcion((Long)value);
				sDescripcion=guardarivasventas.gettiporetencionfuenteiva_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		GuardarIvasVentas guardarivasventasRow=new GuardarIvasVentas();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			guardarivasventasRow=(GuardarIvasVentas) guardarivasventasLogic.getGuardarIvasVentass().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			guardarivasventasRow=(GuardarIvasVentas) guardarivasventass.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualGuardarIvasVentas(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoGuardarIvasVentas.setVisible((this.isVisibilidadCeldaNuevoGuardarIvasVentas && this.isPermisoNuevoGuardarIvasVentas));			
			this.jButtonDuplicarGuardarIvasVentas.setVisible((this.isVisibilidadCeldaDuplicarGuardarIvasVentas && this.isPermisoDuplicarGuardarIvasVentas));			
			this.jButtonCopiarGuardarIvasVentas.setVisible((this.isVisibilidadCeldaCopiarGuardarIvasVentas && this.isPermisoCopiarGuardarIvasVentas));
			this.jButtonVerFormGuardarIvasVentas.setVisible((this.isVisibilidadCeldaVerFormGuardarIvasVentas && this.isPermisoVerFormGuardarIvasVentas));
			
			this.jButtonAbrirOrderByGuardarIvasVentas.setVisible((this.isVisibilidadCeldaOrdenGuardarIvasVentas && this.isPermisoOrdenGuardarIvasVentas));			
			
			this.jButtonNuevoRelacionesGuardarIvasVentas.setVisible((this.isVisibilidadCeldaNuevoRelacionesGuardarIvasVentas && this.isPermisoNuevoGuardarIvasVentas));			
			this.jButtonNuevoGuardarCambiosGuardarIvasVentas.setVisible((this.isVisibilidadCeldaNuevoGuardarIvasVentas && this.isPermisoNuevoGuardarIvasVentas && this.isPermisoGuardarCambiosGuardarIvasVentas));
			
			if(this.jInternalFrameDetalleFormGuardarIvasVentas!=null) {
			this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonModificarGuardarIvasVentas.setVisible((this.isVisibilidadCeldaModificarGuardarIvasVentas && this.isPermisoActualizarGuardarIvasVentas));	
			this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonActualizarGuardarIvasVentas.setVisible((this.isVisibilidadCeldaActualizarGuardarIvasVentas && this.isPermisoActualizarGuardarIvasVentas));	
			this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonEliminarGuardarIvasVentas.setVisible((this.isVisibilidadCeldaEliminarGuardarIvasVentas && this.isPermisoEliminarGuardarIvasVentas));
			this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonCancelarGuardarIvasVentas.setVisible(this.isVisibilidadCeldaCancelarGuardarIvasVentas);							
			this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonGuardarCambiosGuardarIvasVentas.setVisible((this.isVisibilidadCeldaGuardarGuardarIvasVentas && this.isPermisoGuardarCambiosGuardarIvasVentas));			
			
			}
						
			this.jButtonGuardarCambiosTablaGuardarIvasVentas.setVisible((this.isVisibilidadCeldaGuardarCambiosGuardarIvasVentas && this.isPermisoGuardarCambiosGuardarIvasVentas));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarGuardarIvasVentas.setVisible((this.isVisibilidadCeldaNuevoGuardarIvasVentas && this.isPermisoNuevoGuardarIvasVentas));						
			this.jButtonDuplicarToolBarGuardarIvasVentas.setVisible((this.isVisibilidadCeldaDuplicarGuardarIvasVentas && this.isPermisoDuplicarGuardarIvasVentas));						
			this.jButtonCopiarToolBarGuardarIvasVentas.setVisible((this.isVisibilidadCeldaCopiarGuardarIvasVentas && this.isPermisoCopiarGuardarIvasVentas));			
			this.jButtonVerFormToolBarGuardarIvasVentas.setVisible((this.isVisibilidadCeldaVerFormGuardarIvasVentas && this.isPermisoVerFormGuardarIvasVentas));			
			this.jButtonAbrirOrderByToolBarGuardarIvasVentas.setVisible((this.isVisibilidadCeldaOrdenGuardarIvasVentas && this.isPermisoOrdenGuardarIvasVentas));
			this.jButtonNuevoRelacionesToolBarGuardarIvasVentas.setVisible((this.isVisibilidadCeldaNuevoRelacionesGuardarIvasVentas && this.isPermisoNuevoGuardarIvasVentas));			
			this.jButtonNuevoGuardarCambiosToolBarGuardarIvasVentas.setVisible((this.isVisibilidadCeldaNuevoGuardarIvasVentas && this.isPermisoNuevoGuardarIvasVentas && this.isPermisoGuardarCambiosGuardarIvasVentas));			
			
			if(this.jInternalFrameDetalleFormGuardarIvasVentas!=null) {
			this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonModificarToolBarGuardarIvasVentas.setVisible((this.isVisibilidadCeldaModificarGuardarIvasVentas && this.isPermisoActualizarGuardarIvasVentas));	
			this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonActualizarToolBarGuardarIvasVentas.setVisible((this.isVisibilidadCeldaActualizarGuardarIvasVentas  && this.isPermisoActualizarGuardarIvasVentas));	
			this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonEliminarToolBarGuardarIvasVentas.setVisible((this.isVisibilidadCeldaEliminarGuardarIvasVentas && this.isPermisoEliminarGuardarIvasVentas));
			this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonCancelarToolBarGuardarIvasVentas.setVisible(this.isVisibilidadCeldaCancelarGuardarIvasVentas);				
			this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonGuardarCambiosToolBarGuardarIvasVentas.setVisible((this.isVisibilidadCeldaGuardarGuardarIvasVentas && this.isPermisoGuardarCambiosGuardarIvasVentas));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarGuardarIvasVentas.setVisible((this.isVisibilidadCeldaGuardarCambiosGuardarIvasVentas && this.isPermisoGuardarCambiosGuardarIvasVentas));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoGuardarIvasVentas.setVisible((this.isVisibilidadCeldaNuevoGuardarIvasVentas && this.isPermisoNuevoGuardarIvasVentas));			
			this.jMenuItemDuplicarGuardarIvasVentas.setVisible((this.isVisibilidadCeldaDuplicarGuardarIvasVentas && this.isPermisoDuplicarGuardarIvasVentas));			
			this.jMenuItemCopiarGuardarIvasVentas.setVisible((this.isVisibilidadCeldaCopiarGuardarIvasVentas && this.isPermisoCopiarGuardarIvasVentas));			
			this.jMenuItemVerFormGuardarIvasVentas.setVisible((this.isVisibilidadCeldaVerFormGuardarIvasVentas && this.isPermisoVerFormGuardarIvasVentas));			
			this.jMenuItemAbrirOrderByGuardarIvasVentas.setVisible((this.isVisibilidadCeldaOrdenGuardarIvasVentas && this.isPermisoOrdenGuardarIvasVentas));			
			//this.jMenuItemMostrarOcultarGuardarIvasVentas.setVisible((this.isVisibilidadCeldaOrdenGuardarIvasVentas && this.isPermisoOrdenGuardarIvasVentas));
			this.jMenuItemDetalleAbrirOrderByGuardarIvasVentas.setVisible((this.isVisibilidadCeldaOrdenGuardarIvasVentas && this.isPermisoOrdenGuardarIvasVentas));			
			//this.jMenuItemDetalleMostrarOcultarGuardarIvasVentas.setVisible((this.isVisibilidadCeldaOrdenGuardarIvasVentas && this.isPermisoOrdenGuardarIvasVentas));			
			this.jMenuItemNuevoRelacionesGuardarIvasVentas.setVisible((this.isVisibilidadCeldaNuevoRelacionesGuardarIvasVentas && this.isPermisoNuevoGuardarIvasVentas));			
			this.jMenuItemNuevoGuardarCambiosGuardarIvasVentas.setVisible((this.isVisibilidadCeldaNuevoGuardarIvasVentas && this.isPermisoNuevoGuardarIvasVentas && this.isPermisoGuardarCambiosGuardarIvasVentas));									
			
			if(this.jInternalFrameDetalleFormGuardarIvasVentas!=null) {
			this.jInternalFrameDetalleFormGuardarIvasVentas.jMenuItemModificarGuardarIvasVentas.setVisible((this.isVisibilidadCeldaModificarGuardarIvasVentas && this.isPermisoActualizarGuardarIvasVentas));	
			this.jInternalFrameDetalleFormGuardarIvasVentas.jMenuItemActualizarGuardarIvasVentas.setVisible((this.isVisibilidadCeldaActualizarGuardarIvasVentas && this.isPermisoActualizarGuardarIvasVentas));	
			this.jInternalFrameDetalleFormGuardarIvasVentas.jMenuItemEliminarGuardarIvasVentas.setVisible((this.isVisibilidadCeldaEliminarGuardarIvasVentas && this.isPermisoEliminarGuardarIvasVentas));
			this.jInternalFrameDetalleFormGuardarIvasVentas.jMenuItemCancelarGuardarIvasVentas.setVisible(this.isVisibilidadCeldaCancelarGuardarIvasVentas);				
			}
			
			this.jMenuItemGuardarCambiosGuardarIvasVentas.setVisible((this.isVisibilidadCeldaGuardarGuardarIvasVentas && this.isPermisoGuardarCambiosGuardarIvasVentas));						
			this.jMenuItemGuardarCambiosTablaGuardarIvasVentas.setVisible((this.isVisibilidadCeldaGuardarCambiosGuardarIvasVentas && this.isPermisoGuardarCambiosGuardarIvasVentas));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoGuardarIvasVentas=this.jButtonNuevoGuardarIvasVentas.isVisible();
			this.isVisibilidadCeldaDuplicarGuardarIvasVentas=this.jButtonDuplicarGuardarIvasVentas.isVisible();
			this.isVisibilidadCeldaCopiarGuardarIvasVentas=this.jButtonCopiarGuardarIvasVentas.isVisible();
			this.isVisibilidadCeldaVerFormGuardarIvasVentas=this.jButtonVerFormGuardarIvasVentas.isVisible();
			
			this.isVisibilidadCeldaOrdenGuardarIvasVentas=this.jButtonAbrirOrderByGuardarIvasVentas.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesGuardarIvasVentas=this.jButtonNuevoRelacionesGuardarIvasVentas.isVisible();
			this.isVisibilidadCeldaModificarGuardarIvasVentas=this.jButtonModificarGuardarIvasVentas.isVisible();
			
			if(this.jInternalFrameDetalleFormGuardarIvasVentas!=null) {
			this.isVisibilidadCeldaActualizarGuardarIvasVentas=this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonActualizarGuardarIvasVentas.isVisible();
			this.isVisibilidadCeldaEliminarGuardarIvasVentas=this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonEliminarGuardarIvasVentas.isVisible();
			this.isVisibilidadCeldaCancelarGuardarIvasVentas=this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonCancelarGuardarIvasVentas.isVisible();
			this.isVisibilidadCeldaGuardarGuardarIvasVentas=this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonGuardarCambiosGuardarIvasVentas.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosGuardarIvasVentas=this.jButtonGuardarCambiosTablaGuardarIvasVentas.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoGuardarIvasVentas=this.jButtonNuevoToolBarGuardarIvasVentas.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesGuardarIvasVentas=this.jButtonNuevoRelacionesToolBarGuardarIvasVentas.isVisible();
			
			if(this.jInternalFrameDetalleFormGuardarIvasVentas!=null) {
			this.isVisibilidadCeldaModificarGuardarIvasVentas=this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonModificarToolBarGuardarIvasVentas.isVisible();
			this.isVisibilidadCeldaActualizarGuardarIvasVentas=this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonActualizarToolBarGuardarIvasVentas.isVisible();
			this.isVisibilidadCeldaEliminarGuardarIvasVentas=this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonEliminarToolBarGuardarIvasVentas.isVisible();
			this.isVisibilidadCeldaCancelarGuardarIvasVentas=this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonCancelarToolBarGuardarIvasVentas.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarGuardarIvasVentas=this.jButtonGuardarCambiosToolBarGuardarIvasVentas.isVisible();
			this.isVisibilidadCeldaGuardarCambiosGuardarIvasVentas=this.jButtonGuardarCambiosTablaToolBarGuardarIvasVentas.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoGuardarIvasVentas=this.jMenuItemNuevoGuardarIvasVentas.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesGuardarIvasVentas=this.jMenuItemNuevoRelacionesGuardarIvasVentas.isVisible();
			
			if(this.jInternalFrameDetalleFormGuardarIvasVentas!=null) {
			this.isVisibilidadCeldaModificarGuardarIvasVentas=this.jInternalFrameDetalleFormGuardarIvasVentas.jMenuItemModificarGuardarIvasVentas.isVisible();
			this.isVisibilidadCeldaActualizarGuardarIvasVentas=this.jInternalFrameDetalleFormGuardarIvasVentas.jMenuItemActualizarGuardarIvasVentas.isVisible();
			this.isVisibilidadCeldaEliminarGuardarIvasVentas=this.jInternalFrameDetalleFormGuardarIvasVentas.jMenuItemEliminarGuardarIvasVentas.isVisible();
			this.isVisibilidadCeldaCancelarGuardarIvasVentas=this.jInternalFrameDetalleFormGuardarIvasVentas.jMenuItemCancelarGuardarIvasVentas.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarGuardarIvasVentas=this.jMenuItemGuardarCambiosGuardarIvasVentas.isVisible();
			this.isVisibilidadCeldaGuardarCambiosGuardarIvasVentas=this.jMenuItemGuardarCambiosTablaGuardarIvasVentas.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesGuardarIvasVentas(Boolean esInicializar) {
		if(GuardarIvasVentasJInternalFrame.ISBINDING_MANUAL) {			
			if(this.guardarivasventasSessionBean.getConGuardarRelaciones()) {
				//if(this.guardarivasventasSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesGuardarIvasVentas();
			}
			
			this.inicializarActualizarBindingBotonesManualGuardarIvasVentas(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualGuardarIvasVentas() {
		this.jButtonNuevoGuardarIvasVentas.setVisible(this.isPermisoNuevoGuardarIvasVentas);			
		this.jButtonDuplicarGuardarIvasVentas.setVisible(this.isPermisoDuplicarGuardarIvasVentas);			
		this.jButtonCopiarGuardarIvasVentas.setVisible(this.isPermisoCopiarGuardarIvasVentas);			
		this.jButtonVerFormGuardarIvasVentas.setVisible(this.isPermisoVerFormGuardarIvasVentas);			
		
		this.jButtonAbrirOrderByGuardarIvasVentas.setVisible(this.isPermisoOrdenGuardarIvasVentas);					
		
		this.jButtonNuevoRelacionesGuardarIvasVentas.setVisible(this.isPermisoNuevoGuardarIvasVentas);			
		
		if(this.jInternalFrameDetalleFormGuardarIvasVentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonModificarGuardarIvasVentas.setVisible(this.isPermisoActualizarGuardarIvasVentas);	
			this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonActualizarGuardarIvasVentas.setVisible(this.isPermisoActualizarGuardarIvasVentas);	
			this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonEliminarGuardarIvasVentas.setVisible(this.isPermisoEliminarGuardarIvasVentas);
			this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonCancelarGuardarIvasVentas.setVisible(this.isVisibilidadCeldaCancelarGuardarIvasVentas);						
			this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonGuardarCambiosGuardarIvasVentas.setVisible(this.isPermisoGuardarCambiosGuardarIvasVentas);							
		}
		
		this.jButtonGuardarCambiosTablaGuardarIvasVentas.setVisible(this.isPermisoActualizarGuardarIvasVentas);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleGuardarIvasVentas() {
		this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonModificarGuardarIvasVentas.setVisible(this.isPermisoActualizarGuardarIvasVentas);	
		this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonActualizarGuardarIvasVentas.setVisible(this.isPermisoActualizarGuardarIvasVentas);	
		this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonEliminarGuardarIvasVentas.setVisible(this.isPermisoEliminarGuardarIvasVentas);
		this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonCancelarGuardarIvasVentas.setVisible(this.isVisibilidadCeldaCancelarGuardarIvasVentas);							
		this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonGuardarCambiosGuardarIvasVentas.setVisible((this.isVisibilidadCeldaGuardarGuardarIvasVentas && this.isPermisoGuardarCambiosGuardarIvasVentas));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosGuardarIvasVentas() {
		if(GuardarIvasVentasJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualGuardarIvasVentas();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesGuardarIvasVentas() {
	}
	
	public void jTableDatosGuardarIvasVentasListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarGuardarIvasVentas(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidGuardarIvasVentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guardarivasventasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGuardarIvasVentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGuardarIvasVentas(this.getguardarivasventas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGuardarIvasVentas(this.guardarivasventas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.guardarivasventas =(GuardarIvasVentas) this.guardarivasventasLogic.getGuardarIvasVentass().toArray()[this.jTableDatosGuardarIvasVentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.guardarivasventas =(GuardarIvasVentas) this.guardarivasventass.toArray()[this.jTableDatosGuardarIvasVentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.guardarivasventas==null) {
						this.guardarivasventas = new GuardarIvasVentas();
					}

					this.setVariablesFormularioToObjetoActualGuardarIvasVentas(this.guardarivasventas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGuardarIvasVentas(this.guardarivasventas);
				}

				if(this.guardarivasventas.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.guardarivasventas.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGuardarIvasVentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guardarivasventasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guardarivasventasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guardarivasventasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaGuardarIvasVentasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guardarivasventasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebGuardarIvasVentas(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGuardarIvasVentas.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosGuardarIvasVentas.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosGuardarIvasVentas.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guardarivasventas =(GuardarIvasVentas) this.guardarivasventasLogic.getGuardarIvasVentass().toArray()[this.jTableDatosGuardarIvasVentas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.guardarivasventas =(GuardarIvasVentas) this.guardarivasventass.toArray()[this.jTableDatosGuardarIvasVentas.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualGuardarIvasVentas(this.getguardarivasventas(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysGuardarIvasVentas(this.guardarivasventas);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.guardarivasventasLogic.getConnexion());

				if(this.guardarivasventas.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.guardarivasventas.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderGuardarIvasVentas=(TitledBorder)this.jScrollPanelDatosGuardarIvasVentas.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderGuardarIvasVentas.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guardarivasventasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guardarivasventasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guardarivasventasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaGuardarIvasVentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guardarivasventasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGuardarIvasVentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGuardarIvasVentas(this.getguardarivasventas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGuardarIvasVentas(this.guardarivasventas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.guardarivasventas =(GuardarIvasVentas) this.guardarivasventasLogic.getGuardarIvasVentass().toArray()[this.jTableDatosGuardarIvasVentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.guardarivasventas =(GuardarIvasVentas) this.guardarivasventass.toArray()[this.jTableDatosGuardarIvasVentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.guardarivasventas==null) {
						this.guardarivasventas = new GuardarIvasVentas();
					}

					this.setVariablesFormularioToObjetoActualGuardarIvasVentas(this.guardarivasventas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGuardarIvasVentas(this.guardarivasventas);
				}

				if(this.guardarivasventas.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.guardarivasventas.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGuardarIvasVentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guardarivasventasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guardarivasventasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guardarivasventasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ejercicioGuardarIvasVentasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guardarivasventasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoejercicio=true;

			idTienePermisoejercicio=this.tienePermisosUsuarioEnPaginaWebGuardarIvasVentas(EjercicioConstantesFunciones.CLASSNAME);

			if(idTienePermisoejercicio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGuardarIvasVentas.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosGuardarIvasVentas.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosGuardarIvasVentas.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guardarivasventas =(GuardarIvasVentas) this.guardarivasventasLogic.getGuardarIvasVentass().toArray()[this.jTableDatosGuardarIvasVentas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.guardarivasventas =(GuardarIvasVentas) this.guardarivasventass.toArray()[this.jTableDatosGuardarIvasVentas.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualGuardarIvasVentas(this.getguardarivasventas(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysGuardarIvasVentas(this.guardarivasventas);

				this.ejercicioBeanSwingJInternalFrame=new EjercicioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ejercicioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ejercicioBeanSwingJInternalFrame.getEjercicioLogic().setConnexion(this.guardarivasventasLogic.getConnexion());

				if(this.guardarivasventas.getid_ejercicio()!=null) {
					this.ejercicioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ejercicioBeanSwingJInternalFrame.setIdActual(this.guardarivasventas.getid_ejercicio());
					this.ejercicioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaEjercicio();
				}

				JInternalFrameBase jinternalFrame =this.ejercicioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderGuardarIvasVentas=(TitledBorder)this.jScrollPanelDatosGuardarIvasVentas.getBorder();
				TitledBorder titledBorderejercicio=(TitledBorder)this.ejercicioBeanSwingJInternalFrame.jScrollPanelDatosEjercicio.getBorder();

				titledBorderejercicio.setTitle(titledBorderGuardarIvasVentas.getTitle() + " -> Ejercicio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guardarivasventasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guardarivasventasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guardarivasventasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ejercicioGuardarIvasVentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guardarivasventasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGuardarIvasVentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGuardarIvasVentas(this.getguardarivasventas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGuardarIvasVentas(this.guardarivasventas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.guardarivasventas =(GuardarIvasVentas) this.guardarivasventasLogic.getGuardarIvasVentass().toArray()[this.jTableDatosGuardarIvasVentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.guardarivasventas =(GuardarIvasVentas) this.guardarivasventass.toArray()[this.jTableDatosGuardarIvasVentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.guardarivasventas==null) {
						this.guardarivasventas = new GuardarIvasVentas();
					}

					this.setVariablesFormularioToObjetoActualGuardarIvasVentas(this.guardarivasventas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGuardarIvasVentas(this.guardarivasventas);
				}

				if(this.guardarivasventas.getid_ejercicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ejercicio = "+this.guardarivasventas.getid_ejercicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGuardarIvasVentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guardarivasventasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guardarivasventasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guardarivasventasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_periodoGuardarIvasVentasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guardarivasventasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoperiodo=true;

			idTienePermisoperiodo=this.tienePermisosUsuarioEnPaginaWebGuardarIvasVentas(PeriodoConstantesFunciones.CLASSNAME);

			if(idTienePermisoperiodo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGuardarIvasVentas.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosGuardarIvasVentas.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosGuardarIvasVentas.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guardarivasventas =(GuardarIvasVentas) this.guardarivasventasLogic.getGuardarIvasVentass().toArray()[this.jTableDatosGuardarIvasVentas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.guardarivasventas =(GuardarIvasVentas) this.guardarivasventass.toArray()[this.jTableDatosGuardarIvasVentas.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualGuardarIvasVentas(this.getguardarivasventas(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysGuardarIvasVentas(this.guardarivasventas);

				this.periodoBeanSwingJInternalFrame=new PeriodoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.periodoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.periodoBeanSwingJInternalFrame.getPeriodoLogic().setConnexion(this.guardarivasventasLogic.getConnexion());

				if(this.guardarivasventas.getid_periodo()!=null) {
					this.periodoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.periodoBeanSwingJInternalFrame.setIdActual(this.guardarivasventas.getid_periodo());
					this.periodoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPeriodo();
				}

				JInternalFrameBase jinternalFrame =this.periodoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderGuardarIvasVentas=(TitledBorder)this.jScrollPanelDatosGuardarIvasVentas.getBorder();
				TitledBorder titledBorderperiodo=(TitledBorder)this.periodoBeanSwingJInternalFrame.jScrollPanelDatosPeriodo.getBorder();

				titledBorderperiodo.setTitle(titledBorderGuardarIvasVentas.getTitle() + " -> Periodo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guardarivasventasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guardarivasventasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guardarivasventasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_periodoGuardarIvasVentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guardarivasventasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGuardarIvasVentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGuardarIvasVentas(this.getguardarivasventas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGuardarIvasVentas(this.guardarivasventas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.guardarivasventas =(GuardarIvasVentas) this.guardarivasventasLogic.getGuardarIvasVentass().toArray()[this.jTableDatosGuardarIvasVentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.guardarivasventas =(GuardarIvasVentas) this.guardarivasventass.toArray()[this.jTableDatosGuardarIvasVentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.guardarivasventas==null) {
						this.guardarivasventas = new GuardarIvasVentas();
					}

					this.setVariablesFormularioToObjetoActualGuardarIvasVentas(this.guardarivasventas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGuardarIvasVentas(this.guardarivasventas);
				}

				if(this.guardarivasventas.getid_periodo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_periodo = "+this.guardarivasventas.getid_periodo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGuardarIvasVentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guardarivasventasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guardarivasventasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guardarivasventasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_retencion_fuente_ivaGuardarIvasVentasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guardarivasventasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotiporetencionfuenteiva=true;

			idTienePermisotiporetencionfuenteiva=this.tienePermisosUsuarioEnPaginaWebGuardarIvasVentas(TipoRetencionConstantesFunciones.CLASSNAME);

			if(idTienePermisotiporetencionfuenteiva) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGuardarIvasVentas.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosGuardarIvasVentas.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosGuardarIvasVentas.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guardarivasventas =(GuardarIvasVentas) this.guardarivasventasLogic.getGuardarIvasVentass().toArray()[this.jTableDatosGuardarIvasVentas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.guardarivasventas =(GuardarIvasVentas) this.guardarivasventass.toArray()[this.jTableDatosGuardarIvasVentas.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualGuardarIvasVentas(this.getguardarivasventas(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysGuardarIvasVentas(this.guardarivasventas);

				this.tiporetencionfuenteivaBeanSwingJInternalFrame=new TipoRetencionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tiporetencionfuenteivaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tiporetencionfuenteivaBeanSwingJInternalFrame.getTipoRetencionLogic().setConnexion(this.guardarivasventasLogic.getConnexion());

				if(this.guardarivasventas.getid_tipo_retencion_fuente_iva()!=null) {
					this.tiporetencionfuenteivaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tiporetencionfuenteivaBeanSwingJInternalFrame.setIdActual(this.guardarivasventas.getid_tipo_retencion_fuente_iva());
					this.tiporetencionfuenteivaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tiporetencionfuenteivaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tiporetencionfuenteivaBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoRetencion();
				}

				JInternalFrameBase jinternalFrame =this.tiporetencionfuenteivaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderGuardarIvasVentas=(TitledBorder)this.jScrollPanelDatosGuardarIvasVentas.getBorder();
				TitledBorder titledBordertiporetencionfuenteiva=(TitledBorder)this.tiporetencionfuenteivaBeanSwingJInternalFrame.jScrollPanelDatosTipoRetencion.getBorder();

				titledBordertiporetencionfuenteiva.setTitle(titledBorderGuardarIvasVentas.getTitle() + " -> Tipo Retencion ");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guardarivasventasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guardarivasventasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guardarivasventasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_retencion_fuente_ivaGuardarIvasVentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guardarivasventasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGuardarIvasVentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGuardarIvasVentas(this.getguardarivasventas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGuardarIvasVentas(this.guardarivasventas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.guardarivasventas =(GuardarIvasVentas) this.guardarivasventasLogic.getGuardarIvasVentass().toArray()[this.jTableDatosGuardarIvasVentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.guardarivasventas =(GuardarIvasVentas) this.guardarivasventass.toArray()[this.jTableDatosGuardarIvasVentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.guardarivasventas==null) {
						this.guardarivasventas = new GuardarIvasVentas();
					}

					this.setVariablesFormularioToObjetoActualGuardarIvasVentas(this.guardarivasventas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGuardarIvasVentas(this.guardarivasventas);
				}

				if(this.guardarivasventas.getid_tipo_retencion_fuente_iva()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_retencion_fuente_iva = "+this.guardarivasventas.getid_tipo_retencion_fuente_iva().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGuardarIvasVentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guardarivasventasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guardarivasventasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guardarivasventasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_estado_asiento_contableGuardarIvasVentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guardarivasventasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGuardarIvasVentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGuardarIvasVentas(this.getguardarivasventas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGuardarIvasVentas(this.guardarivasventas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.guardarivasventas =(GuardarIvasVentas) this.guardarivasventasLogic.getGuardarIvasVentass().toArray()[this.jTableDatosGuardarIvasVentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.guardarivasventas =(GuardarIvasVentas) this.guardarivasventass.toArray()[this.jTableDatosGuardarIvasVentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.guardarivasventas==null) {
						this.guardarivasventas = new GuardarIvasVentas();
					}

					this.setVariablesFormularioToObjetoActualGuardarIvasVentas(this.guardarivasventas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGuardarIvasVentas(this.guardarivasventas);
				}

				if(this.guardarivasventas.getcodigo_estado_asiento_contable()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_estado_asiento_contable like '%"+this.guardarivasventas.getcodigo_estado_asiento_contable()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGuardarIvasVentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guardarivasventasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guardarivasventasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guardarivasventasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_periodoGuardarIvasVentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guardarivasventasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGuardarIvasVentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGuardarIvasVentas(this.getguardarivasventas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGuardarIvasVentas(this.guardarivasventas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.guardarivasventas =(GuardarIvasVentas) this.guardarivasventasLogic.getGuardarIvasVentass().toArray()[this.jTableDatosGuardarIvasVentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.guardarivasventas =(GuardarIvasVentas) this.guardarivasventass.toArray()[this.jTableDatosGuardarIvasVentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.guardarivasventas==null) {
						this.guardarivasventas = new GuardarIvasVentas();
					}

					this.setVariablesFormularioToObjetoActualGuardarIvasVentas(this.guardarivasventas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGuardarIvasVentas(this.guardarivasventas);
				}

				if(this.guardarivasventas.getnombre_periodo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_periodo like '%"+this.guardarivasventas.getnombre_periodo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGuardarIvasVentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guardarivasventasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guardarivasventasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guardarivasventasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_tipo_retencion_fuente_ivaGuardarIvasVentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guardarivasventasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGuardarIvasVentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGuardarIvasVentas(this.getguardarivasventas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGuardarIvasVentas(this.guardarivasventas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.guardarivasventas =(GuardarIvasVentas) this.guardarivasventasLogic.getGuardarIvasVentass().toArray()[this.jTableDatosGuardarIvasVentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.guardarivasventas =(GuardarIvasVentas) this.guardarivasventass.toArray()[this.jTableDatosGuardarIvasVentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.guardarivasventas==null) {
						this.guardarivasventas = new GuardarIvasVentas();
					}

					this.setVariablesFormularioToObjetoActualGuardarIvasVentas(this.guardarivasventas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGuardarIvasVentas(this.guardarivasventas);
				}

				if(this.guardarivasventas.getnombre_tipo_retencion_fuente_iva()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_tipo_retencion_fuente_iva like '%"+this.guardarivasventas.getnombre_tipo_retencion_fuente_iva()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGuardarIvasVentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guardarivasventasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guardarivasventasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guardarivasventasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonporcentajeGuardarIvasVentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guardarivasventasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGuardarIvasVentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGuardarIvasVentas(this.getguardarivasventas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGuardarIvasVentas(this.guardarivasventas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.guardarivasventas =(GuardarIvasVentas) this.guardarivasventasLogic.getGuardarIvasVentass().toArray()[this.jTableDatosGuardarIvasVentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.guardarivasventas =(GuardarIvasVentas) this.guardarivasventass.toArray()[this.jTableDatosGuardarIvasVentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.guardarivasventas==null) {
						this.guardarivasventas = new GuardarIvasVentas();
					}

					this.setVariablesFormularioToObjetoActualGuardarIvasVentas(this.guardarivasventas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGuardarIvasVentas(this.guardarivasventas);
				}

				if(this.guardarivasventas.getporcentaje()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where porcentaje = "+this.guardarivasventas.getporcentaje().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGuardarIvasVentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guardarivasventasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guardarivasventasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guardarivasventasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonbase_imponibleGuardarIvasVentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guardarivasventasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGuardarIvasVentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGuardarIvasVentas(this.getguardarivasventas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGuardarIvasVentas(this.guardarivasventas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.guardarivasventas =(GuardarIvasVentas) this.guardarivasventasLogic.getGuardarIvasVentass().toArray()[this.jTableDatosGuardarIvasVentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.guardarivasventas =(GuardarIvasVentas) this.guardarivasventass.toArray()[this.jTableDatosGuardarIvasVentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.guardarivasventas==null) {
						this.guardarivasventas = new GuardarIvasVentas();
					}

					this.setVariablesFormularioToObjetoActualGuardarIvasVentas(this.guardarivasventas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGuardarIvasVentas(this.guardarivasventas);
				}

				if(this.guardarivasventas.getbase_imponible()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where base_imponible = "+this.guardarivasventas.getbase_imponible().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGuardarIvasVentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guardarivasventasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guardarivasventasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guardarivasventasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalorGuardarIvasVentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guardarivasventasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGuardarIvasVentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGuardarIvasVentas(this.getguardarivasventas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGuardarIvasVentas(this.guardarivasventas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.guardarivasventas =(GuardarIvasVentas) this.guardarivasventasLogic.getGuardarIvasVentass().toArray()[this.jTableDatosGuardarIvasVentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.guardarivasventas =(GuardarIvasVentas) this.guardarivasventass.toArray()[this.jTableDatosGuardarIvasVentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.guardarivasventas==null) {
						this.guardarivasventas = new GuardarIvasVentas();
					}

					this.setVariablesFormularioToObjetoActualGuardarIvasVentas(this.guardarivasventas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGuardarIvasVentas(this.guardarivasventas);
				}

				if(this.guardarivasventas.getvalor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor = "+this.guardarivasventas.getvalor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGuardarIvasVentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guardarivasventasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guardarivasventasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guardarivasventasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumeroGuardarIvasVentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guardarivasventasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGuardarIvasVentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGuardarIvasVentas(this.getguardarivasventas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGuardarIvasVentas(this.guardarivasventas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.guardarivasventas =(GuardarIvasVentas) this.guardarivasventasLogic.getGuardarIvasVentass().toArray()[this.jTableDatosGuardarIvasVentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.guardarivasventas =(GuardarIvasVentas) this.guardarivasventass.toArray()[this.jTableDatosGuardarIvasVentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.guardarivasventas==null) {
						this.guardarivasventas = new GuardarIvasVentas();
					}

					this.setVariablesFormularioToObjetoActualGuardarIvasVentas(this.guardarivasventas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGuardarIvasVentas(this.guardarivasventas);
				}

				if(this.guardarivasventas.getnumero()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero like '%"+this.guardarivasventas.getnumero()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGuardarIvasVentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guardarivasventasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guardarivasventasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guardarivasventasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonruc_benefGuardarIvasVentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guardarivasventasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGuardarIvasVentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGuardarIvasVentas(this.getguardarivasventas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGuardarIvasVentas(this.guardarivasventas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.guardarivasventas =(GuardarIvasVentas) this.guardarivasventasLogic.getGuardarIvasVentass().toArray()[this.jTableDatosGuardarIvasVentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.guardarivasventas =(GuardarIvasVentas) this.guardarivasventass.toArray()[this.jTableDatosGuardarIvasVentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.guardarivasventas==null) {
						this.guardarivasventas = new GuardarIvasVentas();
					}

					this.setVariablesFormularioToObjetoActualGuardarIvasVentas(this.guardarivasventas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGuardarIvasVentas(this.guardarivasventas);
				}

				if(this.guardarivasventas.getruc_benef()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where ruc_benef like '%"+this.guardarivasventas.getruc_benef()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGuardarIvasVentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guardarivasventasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guardarivasventasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guardarivasventasLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaGuardarIvasVentasGuardarIvasVentasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guardarivasventasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingGuardarIvasVentas(false,false);

			this.getGuardarIvasVentassBusquedaGuardarIvasVentas();

			this.inicializarActualizarBindingGuardarIvasVentas(false);

			//if(GuardarIvasVentasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingGuardarIvasVentas(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guardarivasventasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guardarivasventasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guardarivasventasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEjercicioGuardarIvasVentasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guardarivasventasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingGuardarIvasVentas(false,false);

			this.getGuardarIvasVentassFK_IdEjercicio();

			this.inicializarActualizarBindingGuardarIvasVentas(false);

			//if(GuardarIvasVentasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingGuardarIvasVentas(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guardarivasventasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guardarivasventasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guardarivasventasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaGuardarIvasVentasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guardarivasventasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingGuardarIvasVentas(false,false);

			this.getGuardarIvasVentassFK_IdEmpresa();

			this.inicializarActualizarBindingGuardarIvasVentas(false);

			//if(GuardarIvasVentasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingGuardarIvasVentas(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guardarivasventasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guardarivasventasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guardarivasventasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPeriodoGuardarIvasVentasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guardarivasventasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingGuardarIvasVentas(false,false);

			this.getGuardarIvasVentassFK_IdPeriodo();

			this.inicializarActualizarBindingGuardarIvasVentas(false);

			//if(GuardarIvasVentasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingGuardarIvasVentas(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guardarivasventasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guardarivasventasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guardarivasventasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoRetencionFuenteIvaGuardarIvasVentasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guardarivasventasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingGuardarIvasVentas(false,false);

			this.getGuardarIvasVentassFK_IdTipoRetencionFuenteIva();

			this.inicializarActualizarBindingGuardarIvasVentas(false);

			//if(GuardarIvasVentasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingGuardarIvasVentas(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guardarivasventasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guardarivasventasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.guardarivasventasLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameGuardarIvasVentas() {
		if(this.jInternalFrameDetalleFormGuardarIvasVentas!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormGuardarIvasVentas!=null) {
			this.jInternalFrameDetalleFormGuardarIvasVentas.setVisible(false);	    			
			this.jInternalFrameDetalleFormGuardarIvasVentas.dispose();
			this.jInternalFrameDetalleFormGuardarIvasVentas=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoGuardarIvasVentas!=null) {
			this.jInternalFrameReporteDinamicoGuardarIvasVentas.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoGuardarIvasVentas.dispose();
			this.jInternalFrameReporteDinamicoGuardarIvasVentas=null;
		}
		
		if(this.jInternalFrameImportacionGuardarIvasVentas!=null) {
			this.jInternalFrameImportacionGuardarIvasVentas.setVisible(false);	    			
			this.jInternalFrameImportacionGuardarIvasVentas.dispose();
			this.jInternalFrameImportacionGuardarIvasVentas=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessGuardarIvasVentas();
			
			GuardarIvasVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.guardarivasventas,new Object(),this.guardarivasventasParameterGeneral,this.guardarivasventasReturnGeneral);
			
			
			if(sTipo.equals("NuevoGuardarIvasVentas")) {
				jButtonNuevoGuardarIvasVentasActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarGuardarIvasVentas")) {
				jButtonDuplicarGuardarIvasVentasActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarGuardarIvasVentas")) {
				jButtonCopiarGuardarIvasVentasActionPerformed(evt);
			} else if(sTipo.equals("VerFormGuardarIvasVentas")) {
				jButtonVerFormGuardarIvasVentasActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarGuardarIvasVentas")) {
				jButtonNuevoGuardarIvasVentasActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarGuardarIvasVentas")) {
				jButtonDuplicarGuardarIvasVentasActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoGuardarIvasVentas")) {
				jButtonNuevoGuardarIvasVentasActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarGuardarIvasVentas")) {
				jButtonDuplicarGuardarIvasVentasActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesGuardarIvasVentas")) {
				jButtonNuevoGuardarIvasVentasActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarGuardarIvasVentas")) {
				jButtonNuevoGuardarIvasVentasActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesGuardarIvasVentas")) {
				jButtonNuevoGuardarIvasVentasActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarGuardarIvasVentas")) {
				jButtonModificarGuardarIvasVentasActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarGuardarIvasVentas")) {
				jButtonModificarGuardarIvasVentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarGuardarIvasVentas")) {
				jButtonModificarGuardarIvasVentasActionPerformed(evt);
			} else if(sTipo.equals("ActualizarGuardarIvasVentas")) {
				jButtonActualizarGuardarIvasVentasActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarGuardarIvasVentas")) {
				jButtonActualizarGuardarIvasVentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarGuardarIvasVentas")) {
				jButtonActualizarGuardarIvasVentasActionPerformed(evt);
			} else if(sTipo.equals("EliminarGuardarIvasVentas")) {
				jButtonEliminarGuardarIvasVentasActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarGuardarIvasVentas")) {
				jButtonEliminarGuardarIvasVentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarGuardarIvasVentas")) {
				jButtonEliminarGuardarIvasVentasActionPerformed(evt);
			} else if(sTipo.equals("CancelarGuardarIvasVentas")) {
				jButtonCancelarGuardarIvasVentasActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarGuardarIvasVentas")) {
				jButtonCancelarGuardarIvasVentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarGuardarIvasVentas")) {
				jButtonCancelarGuardarIvasVentasActionPerformed(evt);
			} else if(sTipo.equals("CerrarGuardarIvasVentas")) {
				jButtonCerrarGuardarIvasVentasActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarGuardarIvasVentas")) {
				jButtonCerrarGuardarIvasVentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarGuardarIvasVentas")) {
				jButtonCerrarGuardarIvasVentasActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarGuardarIvasVentas")) {
				jButtonMostrarOcultarGuardarIvasVentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarGuardarIvasVentas")) {
				jButtonCancelarGuardarIvasVentasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosGuardarIvasVentas")) {
				jButtonGuardarCambiosGuardarIvasVentasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarGuardarIvasVentas")) {
				jButtonGuardarCambiosGuardarIvasVentasActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarGuardarIvasVentas")) {
				jButtonCopiarGuardarIvasVentasActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarGuardarIvasVentas")) {
				jButtonVerFormGuardarIvasVentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosGuardarIvasVentas")) {
				jButtonGuardarCambiosGuardarIvasVentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarGuardarIvasVentas")) {
				jButtonCopiarGuardarIvasVentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormGuardarIvasVentas")) {
				jButtonVerFormGuardarIvasVentasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaGuardarIvasVentas")) {
				jButtonGuardarCambiosGuardarIvasVentasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarGuardarIvasVentas")) {
				jButtonGuardarCambiosGuardarIvasVentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaGuardarIvasVentas")) {
				jButtonGuardarCambiosGuardarIvasVentasActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionGuardarIvasVentas")) {
				jButtonRecargarInformacionGuardarIvasVentasActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarGuardarIvasVentas")) {
				jButtonRecargarInformacionGuardarIvasVentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionGuardarIvasVentas")) {
				jButtonRecargarInformacionGuardarIvasVentasActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresGuardarIvasVentas")) {
				jButtonAnterioresGuardarIvasVentasActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarGuardarIvasVentas")) {
				jButtonAnterioresGuardarIvasVentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreGuardarIvasVentas")) {
				jButtonAnterioresGuardarIvasVentasActionPerformed(evt);
			} else if(sTipo.equals("SiguientesGuardarIvasVentas")) {
				jButtonSiguientesGuardarIvasVentasActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarGuardarIvasVentas")) {
				jButtonSiguientesGuardarIvasVentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesGuardarIvasVentas")) {
				jButtonSiguientesGuardarIvasVentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByGuardarIvasVentas") || sTipo.equals("MenuItemDetalleAbrirOrderByGuardarIvasVentas")) {
				jButtonAbrirOrderByGuardarIvasVentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarGuardarIvasVentas") || sTipo.equals("MenuItemDetalleMostrarOcultarGuardarIvasVentas")) {
				jButtonMostrarOcultarGuardarIvasVentasActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosGuardarIvasVentas")) {
				jButtonNuevoGuardarCambiosGuardarIvasVentasActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarGuardarIvasVentas")) {
				jButtonNuevoGuardarCambiosGuardarIvasVentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosGuardarIvasVentas")) {
				jButtonNuevoGuardarCambiosGuardarIvasVentasActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoGuardarIvasVentas")) {
				jButtonCerrarReporteDinamicoGuardarIvasVentasActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoGuardarIvasVentas")) {
				jButtonGenerarReporteDinamicoGuardarIvasVentasActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoGuardarIvasVentas")) {
				
				jButtonGenerarExcelReporteDinamicoGuardarIvasVentasActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionGuardarIvasVentas")) {
				jButtonCerrarImportacionGuardarIvasVentasActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionGuardarIvasVentas")) {
				
				jButtonGenerarImportacionGuardarIvasVentasActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionGuardarIvasVentas")) {
				
				jButtonAbrirImportacionGuardarIvasVentasActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesGuardarIvasVentas")) {
				jComboBoxTiposAccionesGuardarIvasVentasActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesGuardarIvasVentas")) {
				jComboBoxTiposRelacionesGuardarIvasVentasActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioGuardarIvasVentas")) {
				jComboBoxTiposAccionesGuardarIvasVentasActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarGuardarIvasVentas")) {
				
				jComboBoxTiposSeleccionarGuardarIvasVentasActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralGuardarIvasVentas")) {
				jTextFieldValorCampoGeneralGuardarIvasVentasActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByGuardarIvasVentas")) {
				jButtonAbrirOrderByGuardarIvasVentasActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarGuardarIvasVentas")) {
				jButtonAbrirOrderByGuardarIvasVentasActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByGuardarIvasVentas")) {
				jButtonCerrarOrderByGuardarIvasVentasActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idGuardarIvasVentasBusqueda")) {
				this.jButtonidGuardarIvasVentasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaGuardarIvasVentasUpdate")) {
				this.jButtonid_empresaGuardarIvasVentasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaGuardarIvasVentasBusqueda")) {
				this.jButtonid_empresaGuardarIvasVentasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioGuardarIvasVentasUpdate")) {
				this.jButtonid_ejercicioGuardarIvasVentasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioGuardarIvasVentasBusqueda")) {
				this.jButtonid_ejercicioGuardarIvasVentasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoGuardarIvasVentasUpdate")) {
				this.jButtonid_periodoGuardarIvasVentasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoGuardarIvasVentasBusqueda")) {
				this.jButtonid_periodoGuardarIvasVentasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_retencion_fuente_ivaGuardarIvasVentasUpdate")) {
				this.jButtonid_tipo_retencion_fuente_ivaGuardarIvasVentasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_retencion_fuente_ivaGuardarIvasVentasBusqueda")) {
				this.jButtonid_tipo_retencion_fuente_ivaGuardarIvasVentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_estado_asiento_contableGuardarIvasVentasBusqueda")) {
				this.jButtoncodigo_estado_asiento_contableGuardarIvasVentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_periodoGuardarIvasVentasBusqueda")) {
				this.jButtonnombre_periodoGuardarIvasVentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_tipo_retencion_fuente_ivaGuardarIvasVentasBusqueda")) {
				this.jButtonnombre_tipo_retencion_fuente_ivaGuardarIvasVentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeGuardarIvasVentasBusqueda")) {
				this.jButtonporcentajeGuardarIvasVentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("base_imponibleGuardarIvasVentasBusqueda")) {
				this.jButtonbase_imponibleGuardarIvasVentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorGuardarIvasVentasBusqueda")) {
				this.jButtonvalorGuardarIvasVentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numeroGuardarIvasVentasBusqueda")) {
				this.jButtonnumeroGuardarIvasVentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ruc_benefGuardarIvasVentasBusqueda")) {
				this.jButtonruc_benefGuardarIvasVentasBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaGuardarIvasVentasGuardarIvasVentas")) {
				this.jButtonBusquedaGuardarIvasVentasGuardarIvasVentasActionPerformed(evt);
			}
			
			;
			
			
			GuardarIvasVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.guardarivasventas,new Object(),this.guardarivasventasParameterGeneral,this.guardarivasventasReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessGuardarIvasVentas();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaGuardarIvasVentasActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.guardarivasventas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.guardarivasventas);
				
				GuardarIvasVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.guardarivasventas,new Object(),this.guardarivasventasParameterGeneral,this.guardarivasventasReturnGeneral);
				
				


				
				GuardarIvasVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.guardarivasventas,new Object(),this.guardarivasventasParameterGeneral,this.guardarivasventasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GuardarIvasVentas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GuardarIvasVentas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			GuardarIvasVentas guardarivasventasLocal=null;
			
			if(!this.getEsControlTabla()) {
				guardarivasventasLocal=this.guardarivasventas;
			} else {
				guardarivasventasLocal=this.guardarivasventasAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.guardarivasventas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.guardarivasventas);
				
				GuardarIvasVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.guardarivasventas,new Object(),this.guardarivasventasParameterGeneral,this.guardarivasventasReturnGeneral);
							
				
				


				
				GuardarIvasVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.guardarivasventas,new Object(),this.guardarivasventasParameterGeneral,this.guardarivasventasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GuardarIvasVentas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GuardarIvasVentas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGuardarIvasVentasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosGuardarIvasVentas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guardarivasventasAnterior =(GuardarIvasVentas) this.guardarivasventasLogic.getGuardarIvasVentass().toArray()[this.jTableDatosGuardarIvasVentas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.guardarivasventasAnterior =(GuardarIvasVentas) this.guardarivasventass.toArray()[this.jTableDatosGuardarIvasVentas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
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
			
			GuardarIvasVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.guardarivasventas,new Object(),this.guardarivasventasParameterGeneral,this.guardarivasventasReturnGeneral);
			
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
			
			


			
			GuardarIvasVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.guardarivasventas,new Object(),this.guardarivasventasParameterGeneral,this.guardarivasventasReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaGuardarIvasVentasActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.guardarivasventas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.guardarivasventas);
				
				GuardarIvasVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.guardarivasventas,new Object(),this.guardarivasventasParameterGeneral,this.guardarivasventasReturnGeneral);
								
						
				


				
				GuardarIvasVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.guardarivasventas,new Object(),this.guardarivasventasParameterGeneral,this.guardarivasventasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GuardarIvasVentas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GuardarIvasVentas.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.guardarivasventas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.guardarivasventas);
				
				GuardarIvasVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.guardarivasventas,new Object(),this.guardarivasventasParameterGeneral,this.guardarivasventasReturnGeneral);
								
				
				


				
				GuardarIvasVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.guardarivasventas,new Object(),this.guardarivasventasParameterGeneral,this.guardarivasventasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GuardarIvasVentas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GuardarIvasVentas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGuardarIvasVentasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosGuardarIvasVentas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guardarivasventasAnterior =(GuardarIvasVentas) this.guardarivasventasLogic.getGuardarIvasVentass().toArray()[this.jTableDatosGuardarIvasVentas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.guardarivasventasAnterior =(GuardarIvasVentas) this.guardarivasventass.toArray()[this.jTableDatosGuardarIvasVentas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.guardarivasventas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.guardarivasventas);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGuardarIvasVentasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosGuardarIvasVentas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guardarivasventasAnterior =(GuardarIvasVentas) this.guardarivasventasLogic.getGuardarIvasVentass().toArray()[this.jTableDatosGuardarIvasVentas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.guardarivasventasAnterior =(GuardarIvasVentas) this.guardarivasventass.toArray()[this.jTableDatosGuardarIvasVentas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGuardarIvasVentasActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.guardarivasventas);
			
			this.actualizarInformacion("INFO_PADRE",false,this.guardarivasventas);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.guardarivasventas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.guardarivasventas);
				
				GuardarIvasVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.guardarivasventas,new Object(),this.guardarivasventasParameterGeneral,this.guardarivasventasReturnGeneral);
							
				
				


				
				GuardarIvasVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.guardarivasventas,new Object(),this.guardarivasventasParameterGeneral,this.guardarivasventasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GuardarIvasVentas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GuardarIvasVentas.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaGuardarIvasVentasActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosGuardarIvasVentas.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.guardarivasventasAnterior =(GuardarIvasVentas) this.guardarivasventasLogic.getGuardarIvasVentass().toArray()[this.jTableDatosGuardarIvasVentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.guardarivasventasAnterior =(GuardarIvasVentas) this.guardarivasventass.toArray()[this.jTableDatosGuardarIvasVentas.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
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
			
			GuardarIvasVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.guardarivasventas,new Object(),this.guardarivasventasParameterGeneral,this.guardarivasventasReturnGeneral);
			
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
			
			


			
			GuardarIvasVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.guardarivasventas,new Object(),this.guardarivasventasParameterGeneral,this.guardarivasventasReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGuardarIvasVentasActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.guardarivasventas);
			
			this.actualizarInformacion("INFO_PADRE",false,this.guardarivasventas);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.guardarivasventas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.guardarivasventas);
				
				GuardarIvasVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.guardarivasventas,new Object(),this.guardarivasventasParameterGeneral,this.guardarivasventasReturnGeneral);
								
				
				


				
				GuardarIvasVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.guardarivasventas,new Object(),this.guardarivasventasParameterGeneral,this.guardarivasventasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GuardarIvasVentas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GuardarIvasVentas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGuardarIvasVentasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosGuardarIvasVentas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guardarivasventasAnterior =(GuardarIvasVentas) this.guardarivasventasLogic.getGuardarIvasVentass().toArray()[this.jTableDatosGuardarIvasVentas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.guardarivasventasAnterior =(GuardarIvasVentas) this.guardarivasventass.toArray()[this.jTableDatosGuardarIvasVentas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGuardarIvasVentasActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.guardarivasventas);
			
			this.actualizarInformacion("INFO_PADRE",false,this.guardarivasventas);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaGuardarIvasVentasActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.guardarivasventas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.guardarivasventas);
				
				GuardarIvasVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.guardarivasventas,new Object(),this.guardarivasventasParameterGeneral,this.guardarivasventasReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosGuardarIvasVentas")) {
					jCheckBoxSeleccionarTodosGuardarIvasVentasItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosGuardarIvasVentas")) {
					jCheckBoxSeleccionadosGuardarIvasVentasItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarGuardarIvasVentas")) {
					
				}
				
				


				
				
				GuardarIvasVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.guardarivasventas,new Object(),this.guardarivasventasParameterGeneral,this.guardarivasventasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GuardarIvasVentas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GuardarIvasVentas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.guardarivasventas);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.guardarivasventas);
				
				GuardarIvasVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.guardarivasventas,new Object(),this.guardarivasventasParameterGeneral,this.guardarivasventasReturnGeneral);
												
				
				


				
				
				GuardarIvasVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.guardarivasventas,new Object(),this.guardarivasventasParameterGeneral,this.guardarivasventasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GuardarIvasVentas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GuardarIvasVentas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaGuardarIvasVentasActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosGuardarIvasVentas.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.guardarivasventasAnterior =(GuardarIvasVentas) this.guardarivasventasLogic.getGuardarIvasVentass().toArray()[this.jTableDatosGuardarIvasVentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.guardarivasventasAnterior =(GuardarIvasVentas) this.guardarivasventass.toArray()[this.jTableDatosGuardarIvasVentas.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaGuardarIvasVentasActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.guardarivasventas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.guardarivasventas);
				
				GuardarIvasVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.guardarivasventas,new Object(),this.guardarivasventasParameterGeneral,this.guardarivasventasReturnGeneral);
				
				
				GuardarIvasVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.guardarivasventas,new Object(),this.guardarivasventasParameterGeneral,this.guardarivasventasReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
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
			
			GuardarIvasVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.guardarivasventas,new Object(),this.guardarivasventasParameterGeneral,this.guardarivasventasReturnGeneral);
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
			
			


			
			GuardarIvasVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.guardarivasventas,new Object(),this.guardarivasventasParameterGeneral,this.guardarivasventasReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaGuardarIvasVentasActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.guardarivasventas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.guardarivasventas);
				
				GuardarIvasVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.guardarivasventas,new Object(),this.guardarivasventasParameterGeneral,this.guardarivasventasReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				GuardarIvasVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.guardarivasventas,new Object(),this.guardarivasventasParameterGeneral,this.guardarivasventasReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GuardarIvasVentas.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GuardarIvasVentas.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.guardarivasventas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.guardarivasventas);
				
				GuardarIvasVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.guardarivasventas,new Object(),this.guardarivasventasParameterGeneral,this.guardarivasventasReturnGeneral);
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
				
				


				
				GuardarIvasVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.guardarivasventas,new Object(),this.guardarivasventasParameterGeneral,this.guardarivasventasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GuardarIvasVentas.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GuardarIvasVentas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGuardarIvasVentasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosGuardarIvasVentas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.guardarivasventasAnterior =(GuardarIvasVentas) this.guardarivasventasLogic.getGuardarIvasVentass().toArray()[this.jTableDatosGuardarIvasVentas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.guardarivasventasAnterior =(GuardarIvasVentas) this.guardarivasventass.toArray()[this.jTableDatosGuardarIvasVentas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				GuardarIvasVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.guardarivasventas,new Object(),this.guardarivasventasParameterGeneral,this.guardarivasventasReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarGuardarIvasVentas")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosGuardarIvasVentasListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosGuardarIvasVentas.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.guardarivasventas =(GuardarIvasVentas) this.guardarivasventasLogic.getGuardarIvasVentass().toArray()[this.jTableDatosGuardarIvasVentas.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.guardarivasventas =(GuardarIvasVentas) this.guardarivasventass.toArray()[this.jTableDatosGuardarIvasVentas.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.guardarivasventas);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarGuardarIvasVentas")) {
				
				}
				
				GuardarIvasVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.guardarivasventas,new Object(),this.guardarivasventasParameterGeneral,this.guardarivasventasReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			GuardarIvasVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.guardarivasventas,new Object(),this.guardarivasventasParameterGeneral,this.guardarivasventasReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarGuardarIvasVentas")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosGuardarIvasVentas.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarGuardarIvasVentas")) {
			
			}
			
			GuardarIvasVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.guardarivasventas,new Object(),this.guardarivasventasParameterGeneral,this.guardarivasventasReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessGuardarIvasVentas();
			
			GuardarIvasVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.guardarivasventas,new Object(),this.guardarivasventasParameterGeneral,this.guardarivasventasReturnGeneral);
			
			if(sTipo.equals("NuevoGuardarIvasVentas")) {
				jButtonNuevoGuardarIvasVentasActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarGuardarIvasVentas")) {
				jButtonDuplicarGuardarIvasVentasActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarGuardarIvasVentas")) {
				jButtonCopiarGuardarIvasVentasActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormGuardarIvasVentas")) {
				jButtonVerFormGuardarIvasVentasActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesGuardarIvasVentas")) {
				jButtonNuevoGuardarIvasVentasActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarGuardarIvasVentas")) {
				jButtonModificarGuardarIvasVentasActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarGuardarIvasVentas")) {
				jButtonActualizarGuardarIvasVentasActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarGuardarIvasVentas")) {
				jButtonEliminarGuardarIvasVentasActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaGuardarIvasVentas")) {
				jButtonGuardarCambiosGuardarIvasVentasActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarGuardarIvasVentas")) {
				jButtonCancelarGuardarIvasVentasActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarGuardarIvasVentas")) {
				jButtonCerrarGuardarIvasVentasActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosGuardarIvasVentas")) {
				jButtonGuardarCambiosGuardarIvasVentasActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosGuardarIvasVentas")) {
				jButtonNuevoGuardarCambiosGuardarIvasVentasActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByGuardarIvasVentas")) {
				jButtonAbrirOrderByGuardarIvasVentasActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionGuardarIvasVentas")) {
				jButtonRecargarInformacionGuardarIvasVentasActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresGuardarIvasVentas")) {
				jButtonAnterioresGuardarIvasVentasActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesGuardarIvasVentas")) {
				jButtonSiguientesGuardarIvasVentasActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idGuardarIvasVentasBusqueda")) {
				this.jButtonidGuardarIvasVentasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaGuardarIvasVentasUpdate")) {
				this.jButtonid_empresaGuardarIvasVentasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaGuardarIvasVentasBusqueda")) {
				this.jButtonid_empresaGuardarIvasVentasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioGuardarIvasVentasUpdate")) {
				this.jButtonid_ejercicioGuardarIvasVentasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioGuardarIvasVentasBusqueda")) {
				this.jButtonid_ejercicioGuardarIvasVentasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoGuardarIvasVentasUpdate")) {
				this.jButtonid_periodoGuardarIvasVentasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoGuardarIvasVentasBusqueda")) {
				this.jButtonid_periodoGuardarIvasVentasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_retencion_fuente_ivaGuardarIvasVentasUpdate")) {
				this.jButtonid_tipo_retencion_fuente_ivaGuardarIvasVentasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_retencion_fuente_ivaGuardarIvasVentasBusqueda")) {
				this.jButtonid_tipo_retencion_fuente_ivaGuardarIvasVentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_estado_asiento_contableGuardarIvasVentasBusqueda")) {
				this.jButtoncodigo_estado_asiento_contableGuardarIvasVentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_periodoGuardarIvasVentasBusqueda")) {
				this.jButtonnombre_periodoGuardarIvasVentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_tipo_retencion_fuente_ivaGuardarIvasVentasBusqueda")) {
				this.jButtonnombre_tipo_retencion_fuente_ivaGuardarIvasVentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeGuardarIvasVentasBusqueda")) {
				this.jButtonporcentajeGuardarIvasVentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("base_imponibleGuardarIvasVentasBusqueda")) {
				this.jButtonbase_imponibleGuardarIvasVentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorGuardarIvasVentasBusqueda")) {
				this.jButtonvalorGuardarIvasVentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numeroGuardarIvasVentasBusqueda")) {
				this.jButtonnumeroGuardarIvasVentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ruc_benefGuardarIvasVentasBusqueda")) {
				this.jButtonruc_benefGuardarIvasVentasBusquedaActionPerformed(evt);
			}
			
			GuardarIvasVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.guardarivasventas,new Object(),this.guardarivasventasParameterGeneral,this.guardarivasventasReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessGuardarIvasVentas();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			GuardarIvasVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.guardarivasventas,new Object(),this.guardarivasventasParameterGeneral,this.guardarivasventasReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameGuardarIvasVentas")) {
				closingInternalFrameGuardarIvasVentas();
				
			} else if(sTipo.equals("jButtonCancelarGuardarIvasVentas")) {
				JInternalFrameBase jInternalFrameDetalleFormGuardarIvasVentas = (JInternalFrameBase)evt.getSource();
	            	
	            GuardarIvasVentasBeanSwingJInternalFrame jInternalFrameParent=(GuardarIvasVentasBeanSwingJInternalFrame)jInternalFrameDetalleFormGuardarIvasVentas.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarGuardarIvasVentasActionPerformed(null);
			}
			
			GuardarIvasVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.guardarivasventas,new Object(),this.guardarivasventasParameterGeneral,this.guardarivasventasReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormGuardarIvasVentas(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormGuardarIvasVentas(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormGuardarIvasVentas(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.guardarivasventas)) {
			if(!esControlTabla) {
				if(GuardarIvasVentasJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualGuardarIvasVentas(this.guardarivasventas,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysGuardarIvasVentas(this.guardarivasventas);			
				}
				
				if(this.guardarivasventasSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualGuardarIvasVentas(this.guardarivasventas,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanGuardarIvasVentas(this.guardarivasventasReturnGeneral,this.guardarivasventasBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.guardarivasventasSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanGuardarIvasVentas(classes,this.guardarivasventasReturnGeneral,this.guardarivasventasBean,false);
					}
						
					if(this.guardarivasventasReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyGuardarIvasVentas(this.guardarivasventasReturnGeneral.getGuardarIvasVentas());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioGuardarIvasVentas(this.guardarivasventasReturnGeneral.getGuardarIvasVentas());	
					}
						
					if(this.guardarivasventasReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioGuardarIvasVentas(this.guardarivasventasReturnGeneral.getGuardarIvasVentas(),classes);//this.guardarivasventasBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioGuardarIvasVentas(this.guardarivasventas,classes);//this.guardarivasventasBean);									
				}
			
				if(GuardarIvasVentasJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualGuardarIvasVentas(this.guardarivasventas,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysGuardarIvasVentas(this.guardarivasventas);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.guardarivasventasAnterior!=null) {
						this.guardarivasventas=this.guardarivasventasAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.guardarivasventasSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.guardarivasventasSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.guardarivasventasReturnGeneral.getGuardarIvasVentas(),guardarivasventasLogic.getGuardarIvasVentass());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.guardarivasventasReturnGeneral.getGuardarIvasVentas(),this.guardarivasventass);
				}
				//ARCHITECTURE
				
				//this.jTableDatosGuardarIvasVentas.repaint();
				
				//((AbstractTableModel) this.jTableDatosGuardarIvasVentas.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosGuardarIvasVentas();
			}
		}
	}
	
	public void actualizarVisualTableDatosGuardarIvasVentas() throws Exception {
		
		GuardarIvasVentasModel guardarivasventasModel=(GuardarIvasVentasModel)this.jTableDatosGuardarIvasVentas.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			guardarivasventasModel.guardarivasventass=this.guardarivasventasLogic.getGuardarIvasVentass();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			guardarivasventasModel.guardarivasventass=this.guardarivasventass;
		}
		
		
		((GuardarIvasVentasModel) this.jTableDatosGuardarIvasVentas.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaGuardarIvasVentas() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getguardarivasventasAnterior(),this.guardarivasventasLogic.getGuardarIvasVentass());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getguardarivasventasAnterior(),this.guardarivasventass);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosGuardarIvasVentas();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioGuardarIvasVentas(GuardarIvasVentas guardarivasventas,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
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
										
				GuardarIvasVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.guardarivasventas,new Object(),generalEntityParameterGeneral,this.guardarivasventasReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.guardarivasventasSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=GuardarIvasVentasConstantesFunciones.getClassesRelationshipsOfGuardarIvasVentas(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=GuardarIvasVentasConstantesFunciones.getClassesRelationshipsFromStringsOfGuardarIvasVentas(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormGuardarIvasVentas(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				GuardarIvasVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.guardarivasventas,new Object(),generalEntityParameterGeneral,this.guardarivasventasReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioGuardarIvasVentas(GuardarIvasVentasBean guardarivasventasBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanGuardarIvasVentas(ArrayList<Classe> classes,GuardarIvasVentasReturnGeneral guardarivasventasReturnGeneral,GuardarIvasVentasBean guardarivasventasBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualGuardarIvasVentas(GuardarIvasVentas guardarivasventas,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.guardarivasventas)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormGuardarIvasVentas = new GuardarIvasVentasDetalleFormJInternalFrame(jDesktopPane,this.guardarivasventasSessionBean.getConGuardarRelaciones(),this.guardarivasventasSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormGuardarIvasVentas);
		this.jInternalFrameDetalleFormGuardarIvasVentas.setVisible(false);
		this.jInternalFrameDetalleFormGuardarIvasVentas.setSelected(false);						
		
		this.jInternalFrameDetalleFormGuardarIvasVentas.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormGuardarIvasVentas.guardarivasventasLogic=this.guardarivasventasLogic;
		
		this.cargarCombosFrameForeignKeyGuardarIvasVentas("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleGuardarIvasVentas();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleGuardarIvasVentas();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyGuardarIvasVentas("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyGuardarIvasVentas();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormGuardarIvasVentas.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarGuardarIvasVentas"));
		
		this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonModificarGuardarIvasVentas.addActionListener(new ButtonActionListener(this,"ModificarGuardarIvasVentas"));

		
		this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonModificarToolBarGuardarIvasVentas.addActionListener(new ButtonActionListener(this,"ModificarToolBarGuardarIvasVentas"));
					
		this.jInternalFrameDetalleFormGuardarIvasVentas.jMenuItemModificarGuardarIvasVentas.addActionListener(new ButtonActionListener(this,"MenuItemModificarGuardarIvasVentas"));		
		
		
		
		this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonActualizarGuardarIvasVentas.addActionListener (new ButtonActionListener(this,"ActualizarGuardarIvasVentas"));
		
		
		this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonActualizarToolBarGuardarIvasVentas.addActionListener(new ButtonActionListener(this,"ActualizarToolBarGuardarIvasVentas"));
						
		this.jInternalFrameDetalleFormGuardarIvasVentas.jMenuItemActualizarGuardarIvasVentas.addActionListener (new ButtonActionListener(this,"MenuItemActualizarGuardarIvasVentas"));		
		
		
		
		this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonEliminarGuardarIvasVentas.addActionListener (new ButtonActionListener(this,"EliminarGuardarIvasVentas"));
		
		
		this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonEliminarToolBarGuardarIvasVentas.addActionListener (new ButtonActionListener(this,"EliminarToolBarGuardarIvasVentas"));
								
		this.jInternalFrameDetalleFormGuardarIvasVentas.jMenuItemEliminarGuardarIvasVentas.addActionListener (new ButtonActionListener(this,"MenuItemEliminarGuardarIvasVentas"));		
		
		
		
		this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonCancelarGuardarIvasVentas.addActionListener (new ButtonActionListener(this,"CancelarGuardarIvasVentas"));
		
		
		this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonCancelarToolBarGuardarIvasVentas.addActionListener (new ButtonActionListener(this,"CancelarToolBarGuardarIvasVentas"));
					
		this.jInternalFrameDetalleFormGuardarIvasVentas.jMenuItemCancelarGuardarIvasVentas.addActionListener (new ButtonActionListener(this,"MenuItemCancelarGuardarIvasVentas"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormGuardarIvasVentas.jMenuItemDetalleCerrarGuardarIvasVentas.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarGuardarIvasVentas"));		
		
		
		
		this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonGuardarCambiosToolBarGuardarIvasVentas.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarGuardarIvasVentas"));
		
		
		
		this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonGuardarCambiosToolBarGuardarIvasVentas.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarGuardarIvasVentas"));
		
		
		
		this.jInternalFrameDetalleFormGuardarIvasVentas.jComboBoxTiposAccionesFormularioGuardarIvasVentas.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioGuardarIvasVentas"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonidGuardarIvasVentasBusqueda.addActionListener(new ButtonActionListener(this,"idGuardarIvasVentasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonid_empresaGuardarIvasVentasUpdate.addActionListener(new ButtonActionListener(this,"id_empresaGuardarIvasVentasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonid_empresaGuardarIvasVentasBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaGuardarIvasVentasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonid_ejercicioGuardarIvasVentasUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioGuardarIvasVentasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonid_ejercicioGuardarIvasVentasBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioGuardarIvasVentasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonid_periodoGuardarIvasVentasUpdate.addActionListener(new ButtonActionListener(this,"id_periodoGuardarIvasVentasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonid_periodoGuardarIvasVentasBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoGuardarIvasVentasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonid_tipo_retencion_fuente_ivaGuardarIvasVentasUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_retencion_fuente_ivaGuardarIvasVentasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonid_tipo_retencion_fuente_ivaGuardarIvasVentasBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_retencion_fuente_ivaGuardarIvasVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGuardarIvasVentas.jButtoncodigo_estado_asiento_contableGuardarIvasVentasBusqueda.addActionListener(new ButtonActionListener(this,"codigo_estado_asiento_contableGuardarIvasVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonnombre_periodoGuardarIvasVentasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_periodoGuardarIvasVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonnombre_tipo_retencion_fuente_ivaGuardarIvasVentasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_tipo_retencion_fuente_ivaGuardarIvasVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonporcentajeGuardarIvasVentasBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeGuardarIvasVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonbase_imponibleGuardarIvasVentasBusqueda.addActionListener(new ButtonActionListener(this,"base_imponibleGuardarIvasVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonvalorGuardarIvasVentasBusqueda.addActionListener(new ButtonActionListener(this,"valorGuardarIvasVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonnumeroGuardarIvasVentasBusqueda.addActionListener(new ButtonActionListener(this,"numeroGuardarIvasVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonruc_benefGuardarIvasVentasBusqueda.addActionListener(new ButtonActionListener(this,"ruc_benefGuardarIvasVentasBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormGuardarIvasVentas.jTabbedPaneRelacionesGuardarIvasVentas.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesGuardarIvasVentas"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameGuardarIvasVentas"));
		
		if(this.jInternalFrameDetalleFormGuardarIvasVentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGuardarIvasVentas.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarGuardarIvasVentas"));
		}
		
		this.jTableDatosGuardarIvasVentas.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarGuardarIvasVentas"));
		
		this.jTableDatosGuardarIvasVentas.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarGuardarIvasVentas"));
		
		this.jButtonNuevoGuardarIvasVentas.addActionListener(new ButtonActionListener(this,"NuevoGuardarIvasVentas"));
		
		this.jButtonDuplicarGuardarIvasVentas.addActionListener(new ButtonActionListener(this,"DuplicarGuardarIvasVentas"));
		
		this.jButtonCopiarGuardarIvasVentas.addActionListener(new ButtonActionListener(this,"CopiarGuardarIvasVentas"));
		
		this.jButtonVerFormGuardarIvasVentas.addActionListener(new ButtonActionListener(this,"VerFormGuardarIvasVentas"));
		
		
		this.jButtonNuevoToolBarGuardarIvasVentas.addActionListener(new ButtonActionListener(this,"NuevoToolBarGuardarIvasVentas"));
			
		this.jButtonDuplicarToolBarGuardarIvasVentas.addActionListener(new ButtonActionListener(this,"DuplicarToolBarGuardarIvasVentas"));
			
		this.jMenuItemNuevoGuardarIvasVentas.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarIvasVentas"));
			
		this.jMenuItemDuplicarGuardarIvasVentas.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarGuardarIvasVentas"));		
		
		
		this.jButtonNuevoRelacionesGuardarIvasVentas.addActionListener (new ButtonActionListener(this,"NuevoRelacionesGuardarIvasVentas"));
		
		
		this.jButtonNuevoRelacionesToolBarGuardarIvasVentas.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarGuardarIvasVentas"));
			
		this.jMenuItemNuevoRelacionesGuardarIvasVentas.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesGuardarIvasVentas"));		
		
		
		if(this.jInternalFrameDetalleFormGuardarIvasVentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonModificarGuardarIvasVentas.addActionListener(new ButtonActionListener(this,"ModificarGuardarIvasVentas"));
		}
		
		
		if(this.jInternalFrameDetalleFormGuardarIvasVentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonModificarToolBarGuardarIvasVentas.addActionListener(new ButtonActionListener(this,"ModificarToolBarGuardarIvasVentas"));
			
			this.jInternalFrameDetalleFormGuardarIvasVentas.jMenuItemModificarGuardarIvasVentas.addActionListener(new ButtonActionListener(this,"MenuItemModificarGuardarIvasVentas"));		
		}
		
		
		if(this.jInternalFrameDetalleFormGuardarIvasVentas!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonActualizarGuardarIvasVentas.addActionListener (new ButtonActionListener(this,"ActualizarGuardarIvasVentas"));
		}
		
		
		if(this.jInternalFrameDetalleFormGuardarIvasVentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonActualizarToolBarGuardarIvasVentas.addActionListener(new ButtonActionListener(this,"ActualizarToolBarGuardarIvasVentas"));
				
			this.jInternalFrameDetalleFormGuardarIvasVentas.jMenuItemActualizarGuardarIvasVentas.addActionListener (new ButtonActionListener(this,"MenuItemActualizarGuardarIvasVentas"));		
		}
		
		
		if(this.jInternalFrameDetalleFormGuardarIvasVentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonEliminarGuardarIvasVentas.addActionListener (new ButtonActionListener(this,"EliminarGuardarIvasVentas"));
		}
		
		
		if(this.jInternalFrameDetalleFormGuardarIvasVentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonEliminarToolBarGuardarIvasVentas.addActionListener (new ButtonActionListener(this,"EliminarToolBarGuardarIvasVentas"));
						
			this.jInternalFrameDetalleFormGuardarIvasVentas.jMenuItemEliminarGuardarIvasVentas.addActionListener (new ButtonActionListener(this,"MenuItemEliminarGuardarIvasVentas"));		
		}
		
		
		if(this.jInternalFrameDetalleFormGuardarIvasVentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonCancelarGuardarIvasVentas.addActionListener (new ButtonActionListener(this,"CancelarGuardarIvasVentas"));
		}
		
		
		if(this.jInternalFrameDetalleFormGuardarIvasVentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonCancelarToolBarGuardarIvasVentas.addActionListener (new ButtonActionListener(this,"CancelarToolBarGuardarIvasVentas"));
			
			this.jInternalFrameDetalleFormGuardarIvasVentas.jMenuItemCancelarGuardarIvasVentas.addActionListener (new ButtonActionListener(this,"MenuItemCancelarGuardarIvasVentas"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarGuardarIvasVentas.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarGuardarIvasVentas"));		
		
		
		this.jButtonCerrarGuardarIvasVentas.addActionListener (new ButtonActionListener(this,"CerrarGuardarIvasVentas"));
		
		
		this.jButtonCerrarToolBarGuardarIvasVentas.addActionListener (new ButtonActionListener(this,"CerrarToolBarGuardarIvasVentas"));
			
		this.jMenuItemCerrarGuardarIvasVentas.addActionListener (new ButtonActionListener(this,"MenuItemCerrarGuardarIvasVentas"));
			
		if(this.jInternalFrameDetalleFormGuardarIvasVentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGuardarIvasVentas.jMenuItemDetalleCerrarGuardarIvasVentas.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarGuardarIvasVentas"));		
		}
		
		
		if(this.jInternalFrameDetalleFormGuardarIvasVentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonGuardarCambiosGuardarIvasVentas.addActionListener (new ButtonActionListener(this,"GuardarCambiosGuardarIvasVentas"));
		}
		
		
		if(this.jInternalFrameDetalleFormGuardarIvasVentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonGuardarCambiosToolBarGuardarIvasVentas.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarGuardarIvasVentas"));
		}
		
		this.jButtonCopiarToolBarGuardarIvasVentas.addActionListener (new ButtonActionListener(this,"CopiarToolBarGuardarIvasVentas"));
			
		this.jButtonVerFormToolBarGuardarIvasVentas.addActionListener (new ButtonActionListener(this,"VerFormToolBarGuardarIvasVentas"));
		
		this.jMenuItemGuardarCambiosGuardarIvasVentas.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosGuardarIvasVentas"));
			
		this.jMenuItemCopiarGuardarIvasVentas.addActionListener (new ButtonActionListener(this,"MenuItemCopiarGuardarIvasVentas"));		
		
		this.jMenuItemVerFormGuardarIvasVentas.addActionListener (new ButtonActionListener(this,"MenuItemVerFormGuardarIvasVentas"));		
		
		
		this.jButtonGuardarCambiosTablaGuardarIvasVentas.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaGuardarIvasVentas"));
		
		
		this.jButtonGuardarCambiosTablaToolBarGuardarIvasVentas.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarGuardarIvasVentas"));
			
		this.jMenuItemGuardarCambiosTablaGuardarIvasVentas.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaGuardarIvasVentas"));		
		
		
		
		this.jButtonRecargarInformacionGuardarIvasVentas.addActionListener (new ButtonActionListener(this,"RecargarInformacionGuardarIvasVentas"));
					
		this.jButtonRecargarInformacionToolBarGuardarIvasVentas.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarGuardarIvasVentas"));
		
		this.jMenuItemRecargarInformacionGuardarIvasVentas.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionGuardarIvasVentas"));		
		
		
		
		this.jButtonAnterioresGuardarIvasVentas.addActionListener (new ButtonActionListener(this,"AnterioresGuardarIvasVentas"));
		
		
		this.jButtonAnterioresToolBarGuardarIvasVentas.addActionListener (new ButtonActionListener(this,"AnterioresToolBarGuardarIvasVentas"));
		
		this.jMenuItemAnterioresGuardarIvasVentas.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresGuardarIvasVentas"));		
		
		
		this.jButtonSiguientesGuardarIvasVentas.addActionListener (new ButtonActionListener(this,"SiguientesGuardarIvasVentas"));
		
		
		this.jButtonSiguientesToolBarGuardarIvasVentas.addActionListener (new ButtonActionListener(this,"SiguientesToolBarGuardarIvasVentas"));
			
		this.jMenuItemSiguientesGuardarIvasVentas.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesGuardarIvasVentas"));
			
		this.jMenuItemAbrirOrderByGuardarIvasVentas.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByGuardarIvasVentas"));
			
		this.jMenuItemMostrarOcultarGuardarIvasVentas.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarGuardarIvasVentas"));
			
		this.jMenuItemDetalleAbrirOrderByGuardarIvasVentas.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByGuardarIvasVentas"));
			
		this.jMenuItemDetalleMostarOcultarGuardarIvasVentas.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarGuardarIvasVentas"));		
		
		
		this.jButtonNuevoGuardarCambiosGuardarIvasVentas.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosGuardarIvasVentas"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarGuardarIvasVentas.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarGuardarIvasVentas"));
			
		this.jMenuItemNuevoGuardarCambiosGuardarIvasVentas.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosGuardarIvasVentas"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosGuardarIvasVentas.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosGuardarIvasVentas"));

		this.jCheckBoxSeleccionadosGuardarIvasVentas.addItemListener(new CheckBoxItemListener(this,"SeleccionadosGuardarIvasVentas"));
		
		if(this.jInternalFrameDetalleFormGuardarIvasVentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGuardarIvasVentas.jComboBoxTiposAccionesFormularioGuardarIvasVentas.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioGuardarIvasVentas"));
		}
		
		
		this.jComboBoxTiposRelacionesGuardarIvasVentas.addActionListener (new ButtonActionListener(this,"TiposRelacionesGuardarIvasVentas"));
			
		this.jComboBoxTiposAccionesGuardarIvasVentas.addActionListener (new ButtonActionListener(this,"TiposAccionesGuardarIvasVentas"));
					
		this.jComboBoxTiposSeleccionarGuardarIvasVentas.addActionListener (new ButtonActionListener(this,"TiposSeleccionarGuardarIvasVentas"));
			
		this.jTextFieldValorCampoGeneralGuardarIvasVentas.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralGuardarIvasVentas"));		
		
		
		if(this.jInternalFrameDetalleFormGuardarIvasVentas!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonidGuardarIvasVentasBusqueda.addActionListener(new ButtonActionListener(this,"idGuardarIvasVentasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonid_empresaGuardarIvasVentasUpdate.addActionListener(new ButtonActionListener(this,"id_empresaGuardarIvasVentasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonid_empresaGuardarIvasVentasBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaGuardarIvasVentasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonid_ejercicioGuardarIvasVentasUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioGuardarIvasVentasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonid_ejercicioGuardarIvasVentasBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioGuardarIvasVentasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonid_periodoGuardarIvasVentasUpdate.addActionListener(new ButtonActionListener(this,"id_periodoGuardarIvasVentasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonid_periodoGuardarIvasVentasBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoGuardarIvasVentasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonid_tipo_retencion_fuente_ivaGuardarIvasVentasUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_retencion_fuente_ivaGuardarIvasVentasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonid_tipo_retencion_fuente_ivaGuardarIvasVentasBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_retencion_fuente_ivaGuardarIvasVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGuardarIvasVentas.jButtoncodigo_estado_asiento_contableGuardarIvasVentasBusqueda.addActionListener(new ButtonActionListener(this,"codigo_estado_asiento_contableGuardarIvasVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonnombre_periodoGuardarIvasVentasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_periodoGuardarIvasVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonnombre_tipo_retencion_fuente_ivaGuardarIvasVentasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_tipo_retencion_fuente_ivaGuardarIvasVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonporcentajeGuardarIvasVentasBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeGuardarIvasVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonbase_imponibleGuardarIvasVentasBusqueda.addActionListener(new ButtonActionListener(this,"base_imponibleGuardarIvasVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonvalorGuardarIvasVentasBusqueda.addActionListener(new ButtonActionListener(this,"valorGuardarIvasVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonnumeroGuardarIvasVentasBusqueda.addActionListener(new ButtonActionListener(this,"numeroGuardarIvasVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonruc_benefGuardarIvasVentasBusqueda.addActionListener(new ButtonActionListener(this,"ruc_benefGuardarIvasVentasBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaGuardarIvasVentasGuardarIvasVentas.addActionListener(new ButtonActionListener(this,"BusquedaGuardarIvasVentasGuardarIvasVentas"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoGuardarIvasVentas!=null) {
				this.jInternalFrameReporteDinamicoGuardarIvasVentas.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoGuardarIvasVentas"));
				this.jInternalFrameReporteDinamicoGuardarIvasVentas.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoGuardarIvasVentas"));
				this.jInternalFrameReporteDinamicoGuardarIvasVentas.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoGuardarIvasVentas"));
			}
			
			//this.jButtonCerrarReporteDinamicoGuardarIvasVentas.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoGuardarIvasVentas"));				
			//this.jButtonGenerarReporteDinamicoGuardarIvasVentas.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoGuardarIvasVentas"));
			//this.jButtonGenerarExcelReporteDinamicoGuardarIvasVentas.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoGuardarIvasVentas"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionGuardarIvasVentas!=null) {
				this.jInternalFrameImportacionGuardarIvasVentas.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionGuardarIvasVentas"));
				this.jInternalFrameImportacionGuardarIvasVentas.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionGuardarIvasVentas"));
				this.jInternalFrameImportacionGuardarIvasVentas.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionGuardarIvasVentas"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByGuardarIvasVentas.addActionListener (new ButtonActionListener(this,"AbrirOrderByGuardarIvasVentas"));
			
			this.jButtonAbrirOrderByToolBarGuardarIvasVentas.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarGuardarIvasVentas"));			
			
			if(this.jInternalFrameOrderByGuardarIvasVentas!=null) {
				this.jInternalFrameOrderByGuardarIvasVentas.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByGuardarIvasVentas"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormGuardarIvasVentas!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormGuardarIvasVentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGuardarIvasVentas.jTabbedPaneRelacionesGuardarIvasVentas.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesGuardarIvasVentas"));
		
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
            		closingInternalFrameGuardarIvasVentas();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormGuardarIvasVentas.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormGuardarIvasVentas = (JInternalFrameBase)event.getSource();
	            	
	            GuardarIvasVentasBeanSwingJInternalFrame jInternalFrameParent=(GuardarIvasVentasBeanSwingJInternalFrame)jInternalFrameDetalleFormGuardarIvasVentas.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarGuardarIvasVentasActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosGuardarIvasVentas.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosGuardarIvasVentasListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosGuardarIvasVentas.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosGuardarIvasVentas.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoGuardarIvasVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarIvasVentasActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarGuardarIvasVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarIvasVentasActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarIvasVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarIvasVentasActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoGuardarIvasVentas";
		inputMap = this.jButtonNuevoGuardarIvasVentas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoGuardarIvasVentas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoGuardarIvasVentasActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesGuardarIvasVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarIvasVentasActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarGuardarIvasVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarIvasVentasActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesGuardarIvasVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarIvasVentasActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesGuardarIvasVentas";
		inputMap = this.jButtonNuevoRelacionesGuardarIvasVentas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesGuardarIvasVentas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoGuardarIvasVentasActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarGuardarIvasVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarGuardarIvasVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarGuardarIvasVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarGuardarIvasVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarGuardarIvasVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarGuardarIvasVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarGuardarIvasVentas";
		inputMap = this.jButtonModificarGuardarIvasVentas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarGuardarIvasVentas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarGuardarIvasVentasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarGuardarIvasVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarGuardarIvasVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarGuardarIvasVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarGuardarIvasVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarGuardarIvasVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarGuardarIvasVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarGuardarIvasVentas";
		inputMap = this.jButtonActualizarGuardarIvasVentas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarGuardarIvasVentas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarGuardarIvasVentasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarGuardarIvasVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarGuardarIvasVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarGuardarIvasVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarGuardarIvasVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarGuardarIvasVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarGuardarIvasVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarGuardarIvasVentas";
		inputMap = this.jButtonEliminarGuardarIvasVentas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarGuardarIvasVentas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarGuardarIvasVentasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarGuardarIvasVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarGuardarIvasVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarGuardarIvasVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarGuardarIvasVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarGuardarIvasVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarGuardarIvasVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarGuardarIvasVentas";
		inputMap = this.jButtonCancelarGuardarIvasVentas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarGuardarIvasVentas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarGuardarIvasVentasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarGuardarIvasVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarGuardarIvasVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarGuardarIvasVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarGuardarIvasVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarGuardarIvasVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarGuardarIvasVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarGuardarIvasVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarGuardarIvasVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarGuardarIvasVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarGuardarIvasVentas";
		inputMap = this.jButtonCerrarGuardarIvasVentas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarGuardarIvasVentas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarGuardarIvasVentasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonGuardarCambiosGuardarIvasVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosGuardarIvasVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarGuardarIvasVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosGuardarIvasVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosGuardarIvasVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosGuardarIvasVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaGuardarIvasVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosGuardarIvasVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarGuardarIvasVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosGuardarIvasVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaGuardarIvasVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosGuardarIvasVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosGuardarIvasVentas";
		inputMap = this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonGuardarCambiosGuardarIvasVentas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonGuardarCambiosGuardarIvasVentas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosGuardarIvasVentasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionGuardarIvasVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionGuardarIvasVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarGuardarIvasVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionGuardarIvasVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionGuardarIvasVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionGuardarIvasVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresGuardarIvasVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresGuardarIvasVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarGuardarIvasVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresGuardarIvasVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresGuardarIvasVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresGuardarIvasVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesGuardarIvasVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesGuardarIvasVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarGuardarIvasVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesGuardarIvasVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesGuardarIvasVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesGuardarIvasVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosGuardarIvasVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosGuardarIvasVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarGuardarIvasVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosGuardarIvasVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosGuardarIvasVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosGuardarIvasVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosGuardarIvasVentas.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosGuardarIvasVentasItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesGuardarIvasVentas.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesGuardarIvasVentasActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarGuardarIvasVentas.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarGuardarIvasVentasActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralGuardarIvasVentas.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralGuardarIvasVentasActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonidGuardarIvasVentasBusqueda.addActionListener(new ButtonActionListener(this,"idGuardarIvasVentasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonid_empresaGuardarIvasVentasUpdate.addActionListener(new ButtonActionListener(this,"id_empresaGuardarIvasVentasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonid_empresaGuardarIvasVentasBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaGuardarIvasVentasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonid_ejercicioGuardarIvasVentasUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioGuardarIvasVentasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonid_ejercicioGuardarIvasVentasBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioGuardarIvasVentasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonid_periodoGuardarIvasVentasUpdate.addActionListener(new ButtonActionListener(this,"id_periodoGuardarIvasVentasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonid_periodoGuardarIvasVentasBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoGuardarIvasVentasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonid_tipo_retencion_fuente_ivaGuardarIvasVentasUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_retencion_fuente_ivaGuardarIvasVentasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonid_tipo_retencion_fuente_ivaGuardarIvasVentasBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_retencion_fuente_ivaGuardarIvasVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGuardarIvasVentas.jButtoncodigo_estado_asiento_contableGuardarIvasVentasBusqueda.addActionListener(new ButtonActionListener(this,"codigo_estado_asiento_contableGuardarIvasVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonnombre_periodoGuardarIvasVentasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_periodoGuardarIvasVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonnombre_tipo_retencion_fuente_ivaGuardarIvasVentasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_tipo_retencion_fuente_ivaGuardarIvasVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonporcentajeGuardarIvasVentasBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeGuardarIvasVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonbase_imponibleGuardarIvasVentasBusqueda.addActionListener(new ButtonActionListener(this,"base_imponibleGuardarIvasVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonvalorGuardarIvasVentasBusqueda.addActionListener(new ButtonActionListener(this,"valorGuardarIvasVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonnumeroGuardarIvasVentasBusqueda.addActionListener(new ButtonActionListener(this,"numeroGuardarIvasVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGuardarIvasVentas.jButtonruc_benefGuardarIvasVentasBusqueda.addActionListener(new ButtonActionListener(this,"ruc_benefGuardarIvasVentasBusqueda"));
		
		
		this.jButtonBusquedaGuardarIvasVentasGuardarIvasVentas.addActionListener(new ButtonActionListener(this,"BusquedaGuardarIvasVentasGuardarIvasVentas"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoGuardarIvasVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoGuardarIvasVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoGuardarIvasVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoGuardarIvasVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoGuardarIvasVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoGuardarIvasVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionGuardarIvasVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionGuardarIvasVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionGuardarIvasVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionGuardarIvasVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionGuardarIvasVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionGuardarIvasVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarGuardarIvasVentasActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarGuardarIvasVentas.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosGuardarIvasVentas(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(GuardarIvasVentas guardarivasventasAux:this.guardarivasventasLogic.getGuardarIvasVentass()) {
					guardarivasventasAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(GuardarIvasVentas guardarivasventasAux:guardarivasventass) {
					guardarivasventasAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosGuardarIvasVentasItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingGuardarIvasVentas(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(GuardarIvasVentas guardarivasventasAux:this.guardarivasventasLogic.getGuardarIvasVentass()) {
						guardarivasventasAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(GuardarIvasVentas guardarivasventasAux:guardarivasventass) {
						guardarivasventasAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(GuardarIvasVentas guardarivasventasAux:this.guardarivasventasLogic.getGuardarIvasVentass()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(GuardarIvasVentas guardarivasventasAux:guardarivasventass) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaGuardarIvasVentas(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosGuardarIvasVentas.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosGuardarIvasVentas.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosGuardarIvasVentas,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosGuardarIvasVentasItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingGuardarIvasVentas(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosGuardarIvasVentas.getSelectedRows();
			
			GuardarIvasVentas guardarivasventasLocal=new GuardarIvasVentas();
			
			//this.seleccionarTodosGuardarIvasVentas(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					guardarivasventasLocal =(GuardarIvasVentas) this.guardarivasventasLogic.getGuardarIvasVentass().toArray()[this.jTableDatosGuardarIvasVentas.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					guardarivasventasLocal =(GuardarIvasVentas) this.guardarivasventass.toArray()[this.jTableDatosGuardarIvasVentas.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				guardarivasventasLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(GuardarIvasVentas guardarivasventasAux:this.guardarivasventasLogic.getGuardarIvasVentass()) {
						guardarivasventasAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(GuardarIvasVentas guardarivasventasAux:guardarivasventass) {
						guardarivasventasAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaGuardarIvasVentas(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosGuardarIvasVentas.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosGuardarIvasVentas.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosGuardarIvasVentas,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualGuardarIvasVentasItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarGuardarIvasVentasParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralGuardarIvasVentasActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingGuardarIvasVentas(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralGuardarIvasVentas.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(GuardarIvasVentas guardarivasventasAux:this.guardarivasventasLogic.getGuardarIvasVentass()) {
				
						if(sTipoSeleccionar.equals(GuardarIvasVentasConstantesFunciones.LABEL_CODIGOESTADOASIENTOCONTABLE)) {
							existe=true;
							guardarivasventasAux.setcodigo_estado_asiento_contable(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(GuardarIvasVentasConstantesFunciones.LABEL_NOMBREPERIODO)) {
							existe=true;
							guardarivasventasAux.setnombre_periodo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(GuardarIvasVentasConstantesFunciones.LABEL_NOMBRETIPORETENCIONFUENTEIVA)) {
							existe=true;
							guardarivasventasAux.setnombre_tipo_retencion_fuente_iva(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(GuardarIvasVentasConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							guardarivasventasAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(GuardarIvasVentasConstantesFunciones.LABEL_BASEIMPONIBLE)) {
							existe=true;
							guardarivasventasAux.setbase_imponible(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(GuardarIvasVentasConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							guardarivasventasAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(GuardarIvasVentasConstantesFunciones.LABEL_NUMERO)) {
							existe=true;
							guardarivasventasAux.setnumero(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(GuardarIvasVentasConstantesFunciones.LABEL_RUCBENEF)) {
							existe=true;
							guardarivasventasAux.setruc_benef(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(GuardarIvasVentas guardarivasventasAux:guardarivasventass) {
					
						if(sTipoSeleccionar.equals(GuardarIvasVentasConstantesFunciones.LABEL_CODIGOESTADOASIENTOCONTABLE)) {
							existe=true;
							guardarivasventasAux.setcodigo_estado_asiento_contable(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(GuardarIvasVentasConstantesFunciones.LABEL_NOMBREPERIODO)) {
							existe=true;
							guardarivasventasAux.setnombre_periodo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(GuardarIvasVentasConstantesFunciones.LABEL_NOMBRETIPORETENCIONFUENTEIVA)) {
							existe=true;
							guardarivasventasAux.setnombre_tipo_retencion_fuente_iva(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(GuardarIvasVentasConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							guardarivasventasAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(GuardarIvasVentasConstantesFunciones.LABEL_BASEIMPONIBLE)) {
							existe=true;
							guardarivasventasAux.setbase_imponible(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(GuardarIvasVentasConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							guardarivasventasAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(GuardarIvasVentasConstantesFunciones.LABEL_NUMERO)) {
							existe=true;
							guardarivasventasAux.setnumero(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(GuardarIvasVentasConstantesFunciones.LABEL_RUCBENEF)) {
							existe=true;
							guardarivasventasAux.setruc_benef(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaGuardarIvasVentas(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesGuardarIvasVentasActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingGuardarIvasVentas(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioGuardarIvasVentas=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesGuardarIvasVentas.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormGuardarIvasVentas.jComboBoxTiposAccionesFormularioGuardarIvasVentas.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteGuardarIvasVentas) {				
					conSplash=true;//false;										
					
					//this.startProcessGuardarIvasVentas(conSplash);
				
					this.generarReporteGuardarIvasVentassSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesGuardarIvasVentas.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormGuardarIvasVentas.jComboBoxTiposAccionesFormularioGuardarIvasVentas.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoGuardarIvasVentassSeleccionados();
				//this.jComboBoxTiposAccionesGuardarIvasVentas.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoGuardarIvasVentassSeleccionados(false);
				//this.jComboBoxTiposAccionesGuardarIvasVentas.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoGuardarIvasVentassSeleccionados(true);
				//this.jComboBoxTiposAccionesGuardarIvasVentas.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessGuardarIvasVentas();
				
				this.exportarGuardarIvasVentassSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesGuardarIvasVentas.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormGuardarIvasVentas.jComboBoxTiposAccionesFormularioGuardarIvasVentas.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionGuardarIvasVentass();
				//this.importarGuardarIvasVentass();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesGuardarIvasVentas.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormGuardarIvasVentas.jComboBoxTiposAccionesFormularioGuardarIvasVentas.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessGuardarIvasVentas();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelGuardarIvasVentassSeleccionados();
				//this.jComboBoxTiposAccionesGuardarIvasVentas.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Guardar Ivas Ventas", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessGuardarIvasVentas();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoGuardarIvasVentas)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyGuardarIvasVentas(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Guardar Ivas Ventas",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesGuardarIvasVentas.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormGuardarIvasVentas.jComboBoxTiposAccionesFormularioGuardarIvasVentas.setSelectedIndex(0);					
				}	
			} 			
			else if(GuardarIvasVentasBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteGuardarIvasVentas) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessGuardarIvasVentas(conSplash);
					
						//this.actualizarParametrosGeneralGuardarIvasVentas();
						
						this.generarReporteProcesoAccionGuardarIvasVentassSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesGuardarIvasVentas.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormGuardarIvasVentas.jComboBoxTiposAccionesFormularioGuardarIvasVentas.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(GuardarIvasVentasBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Guardar Ivas VentasES SELECCIONADOS?", "MANTENIMIENTO DE Guardar Ivas Ventas", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessGuardarIvasVentas();
				
						this.actualizarParametrosGeneralGuardarIvasVentas();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.guardarivasventasReturnGeneral=guardarivasventasLogic.procesarAccionGuardarIvasVentassWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.guardarivasventasLogic.getGuardarIvasVentass(),this.guardarivasventasParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarGuardarIvasVentasReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesGuardarIvasVentas.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormGuardarIvasVentas.jComboBoxTiposAccionesFormularioGuardarIvasVentas.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralGuardarIvasVentas();
					
					GuardarIvasVentasBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarGuardarIvasVentasReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesGuardarIvasVentas.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormGuardarIvasVentas.jComboBoxTiposAccionesFormularioGuardarIvasVentas.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessGuardarIvasVentas(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesGuardarIvasVentasActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessGuardarIvasVentas();
			
			if(this.jInternalFrameDetalleFormGuardarIvasVentas==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<GuardarIvasVentas> guardarivasventassSeleccionados=new ArrayList<GuardarIvasVentas>();		
			GuardarIvasVentas guardarivasventas=new GuardarIvasVentas();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingGuardarIvasVentas(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesGuardarIvasVentas.getSelectedItem();
			
			
			
			
			guardarivasventassSeleccionados=this.getGuardarIvasVentassSeleccionados(true);
			//this.sTipoAccion;
			
			if(guardarivasventassSeleccionados.size()==1) {
				for(GuardarIvasVentas guardarivasventasAux:guardarivasventassSeleccionados) {
					guardarivasventas=guardarivasventasAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessGuardarIvasVentas();
			
      		//this.finishProcessGuardarIvasVentas(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarGuardarIvasVentasReturnGeneral() throws Exception {
		if(this.guardarivasventasReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.guardarivasventasReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.guardarivasventasReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.guardarivasventasReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.guardarivasventasReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.guardarivasventasReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingGuardarIvasVentas(false);
		}
		
		if(this.guardarivasventasReturnGeneral.getConRetornoLista() || this.guardarivasventasReturnGeneral.getConRetornoObjeto()) {
			if(this.guardarivasventasReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.guardarivasventasLogic.setGuardarIvasVentass(this.guardarivasventasReturnGeneral.getGuardarIvasVentass());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingGuardarIvasVentas(false);
		}
	}
	
	public void actualizarParametrosGeneralGuardarIvasVentas() throws Exception {
		
		
	}
	
	public ArrayList<GuardarIvasVentas> getGuardarIvasVentassSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<GuardarIvasVentas> guardarivasventassSeleccionados=new ArrayList<GuardarIvasVentas>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioGuardarIvasVentas) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(GuardarIvasVentas guardarivasventasAux:guardarivasventasLogic.getGuardarIvasVentass()) {
					if(guardarivasventasAux.getIsSelected()) {
						guardarivasventassSeleccionados.add(guardarivasventasAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(GuardarIvasVentas guardarivasventasAux:this.guardarivasventass) {
					if(guardarivasventasAux.getIsSelected()) {
						guardarivasventassSeleccionados.add(guardarivasventasAux);				
					}
				}
			}
			
			if(guardarivasventassSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						guardarivasventassSeleccionados.addAll(this.guardarivasventasLogic.getGuardarIvasVentass());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						guardarivasventassSeleccionados.addAll(this.guardarivasventass);				
					}
				}
			}
		} else {
			guardarivasventassSeleccionados.add(this.guardarivasventas);
		}
		
		return guardarivasventassSeleccionados;
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
	
	public void generarReporteGuardarIvasVentassSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalGuardarIvasVentassSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoGuardarIvasVentassSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoGuardarIvasVentassSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoGuardarIvasVentassSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Guardar Ivas Ventas",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesGuardarIvasVentassSeleccionados() throws Exception {
		ArrayList<GuardarIvasVentas> guardarivasventassSeleccionados=new ArrayList<GuardarIvasVentas>();		
		
		guardarivasventassSeleccionados=this.getGuardarIvasVentassSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteGuardarIvasVentass("Todos",guardarivasventassSeleccionados);
		
	}	
	
	public void generarReporteNormalGuardarIvasVentassSeleccionados() throws Exception {
		ArrayList<GuardarIvasVentas> guardarivasventassSeleccionados=new ArrayList<GuardarIvasVentas>();		
		
		guardarivasventassSeleccionados=this.getGuardarIvasVentassSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteGuardarIvasVentass("Todos",guardarivasventassSeleccionados);
	}		
	
	public void generarReporteProcesoAccionGuardarIvasVentassSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<GuardarIvasVentas> guardarivasventassSeleccionados=new ArrayList<GuardarIvasVentas>();
		
		guardarivasventassSeleccionados=this.getGuardarIvasVentassSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteGuardarIvasVentass("Todos",guardarivasventassSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoGuardarIvasVentassSeleccionados() throws Exception {
		ArrayList<GuardarIvasVentas> guardarivasventassSeleccionados=new ArrayList<GuardarIvasVentas>();		
		
		
		this.abrirInicializarFrameReporteDinamicoGuardarIvasVentas();
		
		
		guardarivasventassSeleccionados=this.getGuardarIvasVentassSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoGuardarIvasVentas();
		
		
		//this.generarReporteGuardarIvasVentass("Todos",guardarivasventassSeleccionados ,guardarivasventasImplementable,guardarivasventasImplementableHome);
	}
	
	public void mostrarImportacionGuardarIvasVentass() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionGuardarIvasVentas();
		
		this.abrirFrameImportacionGuardarIvasVentas();		
		
			
		//this.generarReporteGuardarIvasVentass("Todos",guardarivasventassSeleccionados ,guardarivasventasImplementable,guardarivasventasImplementableHome);
	}
	
	public void importarGuardarIvasVentass() throws Exception {		
	
	}
	
	public void exportarGuardarIvasVentassSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelGuardarIvasVentassSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoGuardarIvasVentassSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlGuardarIvasVentassSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Guardar Ivas Ventas",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoGuardarIvasVentassSeleccionados() throws Exception {
		ArrayList<GuardarIvasVentas> guardarivasventassSeleccionados=new ArrayList<GuardarIvasVentas>();		
		
		guardarivasventassSeleccionados=this.getGuardarIvasVentassSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"guardarivasventas."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarGuardarIvasVentas(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(GuardarIvasVentas guardarivasventasAux:guardarivasventassSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarGuardarIvasVentas(guardarivasventasAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//guardarivasventasAux.setsDetalleGeneralEntityReporte(guardarivasventasAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.guardarivasventasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Guardar Ivas Ventas",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarGuardarIvasVentas(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=GuardarIvasVentasConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GuardarIvasVentasConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GuardarIvasVentasConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GuardarIvasVentasConstantesFunciones.LABEL_IDEJERCICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GuardarIvasVentasConstantesFunciones.LABEL_IDPERIODO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GuardarIvasVentasConstantesFunciones.LABEL_IDTIPORETENCIONFUENTEIVA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GuardarIvasVentasConstantesFunciones.LABEL_CODIGOESTADOASIENTOCONTABLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GuardarIvasVentasConstantesFunciones.LABEL_NOMBREPERIODO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GuardarIvasVentasConstantesFunciones.LABEL_NOMBRETIPORETENCIONFUENTEIVA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GuardarIvasVentasConstantesFunciones.LABEL_PORCENTAJE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GuardarIvasVentasConstantesFunciones.LABEL_BASEIMPONIBLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GuardarIvasVentasConstantesFunciones.LABEL_VALOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GuardarIvasVentasConstantesFunciones.LABEL_NUMERO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GuardarIvasVentasConstantesFunciones.LABEL_RUCBENEF;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarGuardarIvasVentas(GuardarIvasVentas guardarivasventas,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=guardarivasventas.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=guardarivasventas.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=guardarivasventas.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=guardarivasventas.getejercicio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=guardarivasventas.getperiodo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=guardarivasventas.gettiporetencionfuenteiva_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=guardarivasventas.getcodigo_estado_asiento_contable();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=guardarivasventas.getnombre_periodo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=guardarivasventas.getnombre_tipo_retencion_fuente_iva();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=guardarivasventas.getporcentaje().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=guardarivasventas.getbase_imponible().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=guardarivasventas.getvalor().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=guardarivasventas.getnumero();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=guardarivasventas.getruc_benef();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelGuardarIvasVentassSeleccionados() throws Exception {
		ArrayList<GuardarIvasVentas> guardarivasventassSeleccionados=new ArrayList<GuardarIvasVentas>();		
		
		guardarivasventassSeleccionados=this.getGuardarIvasVentassSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"guardarivasventas.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("GuardarIvasVentass");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelGuardarIvasVentas(row);				
				iRow++;
			}				
			
			for(GuardarIvasVentas guardarivasventasAux:guardarivasventassSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelGuardarIvasVentas(guardarivasventasAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.guardarivasventasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Guardar Ivas Ventas",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlGuardarIvasVentassSeleccionados() throws Exception {
		ArrayList<GuardarIvasVentas> guardarivasventassSeleccionados=new ArrayList<GuardarIvasVentas>();		
		
		guardarivasventassSeleccionados=this.getGuardarIvasVentassSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"guardarivasventas.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("guardarivasventass");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("guardarivasventas");
			//elementRoot.appendChild(element);
		
			for(GuardarIvasVentas guardarivasventasAux:guardarivasventassSeleccionados) {
				element = document.createElement("guardarivasventas");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlGuardarIvasVentas(guardarivasventasAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.guardarivasventasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Guardar Ivas Ventas",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelGuardarIvasVentas(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(GuardarIvasVentasConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(GuardarIvasVentasConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(GuardarIvasVentasConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(GuardarIvasVentasConstantesFunciones.LABEL_IDEJERCICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(GuardarIvasVentasConstantesFunciones.LABEL_IDPERIODO);
		cell = row.createCell(iColumn++);cell.setCellValue(GuardarIvasVentasConstantesFunciones.LABEL_IDTIPORETENCIONFUENTEIVA);
		cell = row.createCell(iColumn++);cell.setCellValue(GuardarIvasVentasConstantesFunciones.LABEL_CODIGOESTADOASIENTOCONTABLE);
		cell = row.createCell(iColumn++);cell.setCellValue(GuardarIvasVentasConstantesFunciones.LABEL_NOMBREPERIODO);
		cell = row.createCell(iColumn++);cell.setCellValue(GuardarIvasVentasConstantesFunciones.LABEL_NOMBRETIPORETENCIONFUENTEIVA);
		cell = row.createCell(iColumn++);cell.setCellValue(GuardarIvasVentasConstantesFunciones.LABEL_PORCENTAJE);
		cell = row.createCell(iColumn++);cell.setCellValue(GuardarIvasVentasConstantesFunciones.LABEL_BASEIMPONIBLE);
		cell = row.createCell(iColumn++);cell.setCellValue(GuardarIvasVentasConstantesFunciones.LABEL_VALOR);
		cell = row.createCell(iColumn++);cell.setCellValue(GuardarIvasVentasConstantesFunciones.LABEL_NUMERO);
		cell = row.createCell(iColumn++);cell.setCellValue(GuardarIvasVentasConstantesFunciones.LABEL_RUCBENEF);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelGuardarIvasVentas(GuardarIvasVentas guardarivasventas,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(guardarivasventas.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(guardarivasventas.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(guardarivasventas.getejercicio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(guardarivasventas.getperiodo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(guardarivasventas.gettiporetencionfuenteiva_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(guardarivasventas.getcodigo_estado_asiento_contable());
		cell = row.createCell(iColumn++);cell.setCellValue(guardarivasventas.getnombre_periodo());
		cell = row.createCell(iColumn++);cell.setCellValue(guardarivasventas.getnombre_tipo_retencion_fuente_iva());
		cell = row.createCell(iColumn++);cell.setCellValue(guardarivasventas.getporcentaje());
		cell = row.createCell(iColumn++);cell.setCellValue(guardarivasventas.getbase_imponible());
		cell = row.createCell(iColumn++);cell.setCellValue(guardarivasventas.getvalor());
		cell = row.createCell(iColumn++);cell.setCellValue(guardarivasventas.getnumero());
		cell = row.createCell(iColumn++);cell.setCellValue(guardarivasventas.getruc_benef());				
	}
	
	public void setFilaDatosExportarXmlGuardarIvasVentas(GuardarIvasVentas guardarivasventas,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(GuardarIvasVentasConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(guardarivasventas.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(GuardarIvasVentasConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(guardarivasventas.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(GuardarIvasVentasConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(guardarivasventas.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementejercicio_descripcion = document.createElement(GuardarIvasVentasConstantesFunciones.IDEJERCICIO);
		elementejercicio_descripcion.appendChild(document.createTextNode(guardarivasventas.getejercicio_descripcion()));
		element.appendChild(elementejercicio_descripcion);

		Element elementperiodo_descripcion = document.createElement(GuardarIvasVentasConstantesFunciones.IDPERIODO);
		elementperiodo_descripcion.appendChild(document.createTextNode(guardarivasventas.getperiodo_descripcion()));
		element.appendChild(elementperiodo_descripcion);

		Element elementtiporetencionfuenteiva_descripcion = document.createElement(GuardarIvasVentasConstantesFunciones.IDTIPORETENCIONFUENTEIVA);
		elementtiporetencionfuenteiva_descripcion.appendChild(document.createTextNode(guardarivasventas.gettiporetencionfuenteiva_descripcion()));
		element.appendChild(elementtiporetencionfuenteiva_descripcion);

		Element elementcodigo_estado_asiento_contable = document.createElement(GuardarIvasVentasConstantesFunciones.CODIGOESTADOASIENTOCONTABLE);
		elementcodigo_estado_asiento_contable.appendChild(document.createTextNode(guardarivasventas.getcodigo_estado_asiento_contable().trim()));
		element.appendChild(elementcodigo_estado_asiento_contable);

		Element elementnombre_periodo = document.createElement(GuardarIvasVentasConstantesFunciones.NOMBREPERIODO);
		elementnombre_periodo.appendChild(document.createTextNode(guardarivasventas.getnombre_periodo().trim()));
		element.appendChild(elementnombre_periodo);

		Element elementnombre_tipo_retencion_fuente_iva = document.createElement(GuardarIvasVentasConstantesFunciones.NOMBRETIPORETENCIONFUENTEIVA);
		elementnombre_tipo_retencion_fuente_iva.appendChild(document.createTextNode(guardarivasventas.getnombre_tipo_retencion_fuente_iva().trim()));
		element.appendChild(elementnombre_tipo_retencion_fuente_iva);

		Element elementporcentaje = document.createElement(GuardarIvasVentasConstantesFunciones.PORCENTAJE);
		elementporcentaje.appendChild(document.createTextNode(guardarivasventas.getporcentaje().toString().trim()));
		element.appendChild(elementporcentaje);

		Element elementbase_imponible = document.createElement(GuardarIvasVentasConstantesFunciones.BASEIMPONIBLE);
		elementbase_imponible.appendChild(document.createTextNode(guardarivasventas.getbase_imponible().toString().trim()));
		element.appendChild(elementbase_imponible);

		Element elementvalor = document.createElement(GuardarIvasVentasConstantesFunciones.VALOR);
		elementvalor.appendChild(document.createTextNode(guardarivasventas.getvalor().toString().trim()));
		element.appendChild(elementvalor);

		Element elementnumero = document.createElement(GuardarIvasVentasConstantesFunciones.NUMERO);
		elementnumero.appendChild(document.createTextNode(guardarivasventas.getnumero().trim()));
		element.appendChild(elementnumero);

		Element elementruc_benef = document.createElement(GuardarIvasVentasConstantesFunciones.RUCBENEF);
		elementruc_benef.appendChild(document.createTextNode(guardarivasventas.getruc_benef().trim()));
		element.appendChild(elementruc_benef);
	}
	
	public void generarReporteGroupGenericoGuardarIvasVentassSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<GuardarIvasVentas> guardarivasventassSeleccionados=new ArrayList<GuardarIvasVentas>();
		
		guardarivasventassSeleccionados=this.getGuardarIvasVentassSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoGuardarIvasVentas(guardarivasventassSeleccionados);
		
		this.generarReporteGuardarIvasVentass("Todos",guardarivasventassSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoGuardarIvasVentas(ArrayList<GuardarIvasVentas> guardarivasventassSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(GuardarIvasVentas guardarivasventasAux:guardarivasventassSeleccionados) {
				guardarivasventasAux.setsDetalleGeneralEntityReporte(guardarivasventasAux.toString());
			
				if(sTipoSeleccionar.equals(GuardarIvasVentasConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					guardarivasventasAux.setsDescripcionGeneralEntityReporte1(guardarivasventasAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(GuardarIvasVentasConstantesFunciones.LABEL_IDEJERCICIO)) {
					existe=true;
					guardarivasventasAux.setsDescripcionGeneralEntityReporte1(guardarivasventasAux.getejercicio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(GuardarIvasVentasConstantesFunciones.LABEL_IDPERIODO)) {
					existe=true;
					guardarivasventasAux.setsDescripcionGeneralEntityReporte1(guardarivasventasAux.getperiodo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(GuardarIvasVentasConstantesFunciones.LABEL_IDTIPORETENCIONFUENTEIVA)) {
					existe=true;
					guardarivasventasAux.setsDescripcionGeneralEntityReporte1(guardarivasventasAux.gettiporetencionfuenteiva_descripcion());
				}
				 else if(sTipoSeleccionar.equals(GuardarIvasVentasConstantesFunciones.LABEL_CODIGOESTADOASIENTOCONTABLE)) {
					existe=true;
					guardarivasventasAux.setsDescripcionGeneralEntityReporte1(guardarivasventasAux.getcodigo_estado_asiento_contable());
				}
				 else if(sTipoSeleccionar.equals(GuardarIvasVentasConstantesFunciones.LABEL_NOMBREPERIODO)) {
					existe=true;
					guardarivasventasAux.setsDescripcionGeneralEntityReporte1(guardarivasventasAux.getnombre_periodo());
				}
				 else if(sTipoSeleccionar.equals(GuardarIvasVentasConstantesFunciones.LABEL_NOMBRETIPORETENCIONFUENTEIVA)) {
					existe=true;
					guardarivasventasAux.setsDescripcionGeneralEntityReporte1(guardarivasventasAux.getnombre_tipo_retencion_fuente_iva());
				}
				 else if(sTipoSeleccionar.equals(GuardarIvasVentasConstantesFunciones.LABEL_NUMERO)) {
					existe=true;
					guardarivasventasAux.setsDescripcionGeneralEntityReporte1(guardarivasventasAux.getnumero());
				}
				 else if(sTipoSeleccionar.equals(GuardarIvasVentasConstantesFunciones.LABEL_RUCBENEF)) {
					existe=true;
					guardarivasventasAux.setsDescripcionGeneralEntityReporte1(guardarivasventasAux.getruc_benef());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GuardarIvasVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesGuardarIvasVentas(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoGuardarIvasVentas=true;
				this.isVisibilidadCeldaNuevoRelacionesGuardarIvasVentas=true;
				this.isVisibilidadCeldaGuardarCambiosGuardarIvasVentas=true;
			}
			
			this.isVisibilidadCeldaModificarGuardarIvasVentas=false;
			this.isVisibilidadCeldaActualizarGuardarIvasVentas=false;
			this.isVisibilidadCeldaEliminarGuardarIvasVentas=false;
			this.isVisibilidadCeldaCancelarGuardarIvasVentas=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarGuardarIvasVentas=true;
				} else {
					this.isVisibilidadCeldaGuardarGuardarIvasVentas=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoGuardarIvasVentas=false;
			this.isVisibilidadCeldaNuevoRelacionesGuardarIvasVentas=false;
			this.isVisibilidadCeldaGuardarCambiosGuardarIvasVentas=false;
			this.isVisibilidadCeldaModificarGuardarIvasVentas=false;
			this.isVisibilidadCeldaActualizarGuardarIvasVentas=true;
			this.isVisibilidadCeldaEliminarGuardarIvasVentas=false;
			this.isVisibilidadCeldaCancelarGuardarIvasVentas=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarGuardarIvasVentas=true;
				} else {
					this.isVisibilidadCeldaGuardarGuardarIvasVentas=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoGuardarIvasVentas=false;
			this.isVisibilidadCeldaNuevoRelacionesGuardarIvasVentas=false;
			this.isVisibilidadCeldaGuardarCambiosGuardarIvasVentas=false;
			this.isVisibilidadCeldaModificarGuardarIvasVentas=false;
			this.isVisibilidadCeldaActualizarGuardarIvasVentas=true;
			this.isVisibilidadCeldaEliminarGuardarIvasVentas=true;
			this.isVisibilidadCeldaCancelarGuardarIvasVentas=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarGuardarIvasVentas=true;
				} else {
					this.isVisibilidadCeldaGuardarGuardarIvasVentas=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoGuardarIvasVentas=false;
			this.isVisibilidadCeldaNuevoRelacionesGuardarIvasVentas=false;
			this.isVisibilidadCeldaGuardarCambiosGuardarIvasVentas=false;
			this.isVisibilidadCeldaModificarGuardarIvasVentas=false;
			this.isVisibilidadCeldaActualizarGuardarIvasVentas=true;
			this.isVisibilidadCeldaEliminarGuardarIvasVentas=false;
			this.isVisibilidadCeldaCancelarGuardarIvasVentas=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarGuardarIvasVentas=false;
				} else {
					this.isVisibilidadCeldaGuardarGuardarIvasVentas=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoGuardarIvasVentas=true;
			this.isVisibilidadCeldaNuevoRelacionesGuardarIvasVentas=true;
			this.isVisibilidadCeldaGuardarCambiosGuardarIvasVentas=true;
			this.isVisibilidadCeldaModificarGuardarIvasVentas=false;
			this.isVisibilidadCeldaActualizarGuardarIvasVentas=false;
			this.isVisibilidadCeldaEliminarGuardarIvasVentas=false;
			this.isVisibilidadCeldaCancelarGuardarIvasVentas=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarGuardarIvasVentas=true;
				} else {
					this.isVisibilidadCeldaGuardarGuardarIvasVentas=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoGuardarIvasVentas=false;
			this.isVisibilidadCeldaNuevoRelacionesGuardarIvasVentas=false;
			this.isVisibilidadCeldaGuardarCambiosGuardarIvasVentas=false;
			this.isVisibilidadCeldaActualizarGuardarIvasVentas=false;
			this.isVisibilidadCeldaEliminarGuardarIvasVentas=false;
			this.isVisibilidadCeldaCancelarGuardarIvasVentas=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarGuardarIvasVentas=false;
				} else {
					this.isVisibilidadCeldaGuardarGuardarIvasVentas=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoGuardarIvasVentas=false;
			this.isVisibilidadCeldaNuevoRelacionesGuardarIvasVentas=false;
			this.isVisibilidadCeldaGuardarCambiosGuardarIvasVentas=false;
			this.isVisibilidadCeldaModificarGuardarIvasVentas=true;
			this.isVisibilidadCeldaActualizarGuardarIvasVentas=false;
			this.isVisibilidadCeldaEliminarGuardarIvasVentas=false;
			this.isVisibilidadCeldaCancelarGuardarIvasVentas=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarGuardarIvasVentas=false;
				} else {
					this.isVisibilidadCeldaGuardarGuardarIvasVentas=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(GuardarIvasVentasJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoGuardarIvasVentas=true;
			this.isVisibilidadCeldaNuevoRelacionesGuardarIvasVentas=true;
			this.isVisibilidadCeldaGuardarCambiosGuardarIvasVentas=true;
		} else {
			this.actualizarEstadoPanelsGuardarIvasVentas(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarGuardarIvasVentas=false;
			//this.isVisibilidadCeldaVerFormGuardarIvasVentas=false;
			this.isVisibilidadCeldaDuplicarGuardarIvasVentas=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!guardarivasventasSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesGuardarIvasVentas=false;
		} else {
			this.isVisibilidadCeldaNuevoGuardarIvasVentas=false;
			this.isVisibilidadCeldaGuardarCambiosGuardarIvasVentas=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(guardarivasventasSessionBean.getEsGuardarRelacionado()) {
			if(!guardarivasventasSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesGuardarIvasVentas=false;												
			}
			
			this.jButtonCerrarGuardarIvasVentas.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesGuardarIvasVentas=false;
		}
		
		if(!this.permiteMantenimiento(this.guardarivasventas)) {
			this.isVisibilidadCeldaActualizarGuardarIvasVentas=false;
			this.isVisibilidadCeldaEliminarGuardarIvasVentas=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoGuardarIvasVentas=false;
		this.isVisibilidadCeldaNuevoRelacionesGuardarIvasVentas=false;
		this.isVisibilidadCeldaGuardarCambiosGuardarIvasVentas=false;
		//this.isVisibilidadCeldaModificarGuardarIvasVentas=true;
		this.isVisibilidadCeldaActualizarGuardarIvasVentas=false;
		this.isVisibilidadCeldaEliminarGuardarIvasVentas=false;
		//this.isVisibilidadCeldaCancelarGuardarIvasVentas=true;			
		this.isVisibilidadCeldaGuardarGuardarIvasVentas=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesGuardarIvasVentas() {
	}
	
	public void actualizarEstadoPanelsGuardarIvasVentas(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionGuardarIvasVentas!=null) {
				this.jScrollPanelDatosEdicionGuardarIvasVentas.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGuardarIvasVentas!=null) {
				this.jTabbedPaneBusquedasGuardarIvasVentas.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosGuardarIvasVentas!=null) {
				this.jScrollPanelDatosGuardarIvasVentas.setVisible(true);
			}
			
			if(this.jPanelPaginacionGuardarIvasVentas!=null) {
				this.jPanelPaginacionGuardarIvasVentas.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesGuardarIvasVentas!=null) {
				this.jPanelParametrosReportesGuardarIvasVentas.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionGuardarIvasVentas!=null) {
				this.jScrollPanelDatosEdicionGuardarIvasVentas.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGuardarIvasVentas!=null) {
				this.jTabbedPaneBusquedasGuardarIvasVentas.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosGuardarIvasVentas!=null) {
				this.jScrollPanelDatosGuardarIvasVentas.setVisible(false);
			}
			
			if(this.jPanelPaginacionGuardarIvasVentas!=null) {
				this.jPanelPaginacionGuardarIvasVentas.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesGuardarIvasVentas!=null) {
				this.jPanelParametrosReportesGuardarIvasVentas.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionGuardarIvasVentas!=null) {
				this.jScrollPanelDatosEdicionGuardarIvasVentas.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGuardarIvasVentas!=null) {
				this.jTabbedPaneBusquedasGuardarIvasVentas.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosGuardarIvasVentas!=null) {
				this.jScrollPanelDatosGuardarIvasVentas.setVisible(false);
			}
			
			if(this.jPanelPaginacionGuardarIvasVentas!=null) {
				this.jPanelPaginacionGuardarIvasVentas.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesGuardarIvasVentas!=null) {
				this.jPanelParametrosReportesGuardarIvasVentas.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionGuardarIvasVentas!=null) {
				this.jScrollPanelDatosEdicionGuardarIvasVentas.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGuardarIvasVentas!=null) {
				this.jTabbedPaneBusquedasGuardarIvasVentas.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosGuardarIvasVentas!=null) {
				this.jScrollPanelDatosGuardarIvasVentas.setVisible(false);
			}
			
			if(this.jPanelPaginacionGuardarIvasVentas!=null) {
				this.jPanelPaginacionGuardarIvasVentas.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesGuardarIvasVentas!=null) {
				this.jPanelParametrosReportesGuardarIvasVentas.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionGuardarIvasVentas!=null) {
				this.jScrollPanelDatosEdicionGuardarIvasVentas.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGuardarIvasVentas!=null) {
				this.jTabbedPaneBusquedasGuardarIvasVentas.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosGuardarIvasVentas!=null) {
				this.jScrollPanelDatosGuardarIvasVentas.setVisible(true);
			}
			
			if(this.jPanelPaginacionGuardarIvasVentas!=null) {
				this.jPanelPaginacionGuardarIvasVentas.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesGuardarIvasVentas!=null) {
				this.jPanelParametrosReportesGuardarIvasVentas.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionGuardarIvasVentas!=null) {
				this.jScrollPanelDatosEdicionGuardarIvasVentas.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGuardarIvasVentas!=null) {
				this.jTabbedPaneBusquedasGuardarIvasVentas.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosGuardarIvasVentas!=null) {
				this.jScrollPanelDatosGuardarIvasVentas.setVisible(true);
			}
			
			if(this.jPanelPaginacionGuardarIvasVentas!=null) {
				this.jPanelPaginacionGuardarIvasVentas.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesGuardarIvasVentas!=null) {
				this.jPanelParametrosReportesGuardarIvasVentas.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionGuardarIvasVentas!=null) {
				this.jScrollPanelDatosEdicionGuardarIvasVentas.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGuardarIvasVentas!=null) {
				this.jTabbedPaneBusquedasGuardarIvasVentas.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosGuardarIvasVentas!=null) {
				this.jScrollPanelDatosGuardarIvasVentas.setVisible(true);
			}
			
			if(this.jPanelPaginacionGuardarIvasVentas!=null) {
				this.jPanelPaginacionGuardarIvasVentas.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesGuardarIvasVentas!=null) {
				this.jPanelParametrosReportesGuardarIvasVentas.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.guardarivasventasSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasGuardarIvasVentas!=null) {
					this.jTabbedPaneBusquedasGuardarIvasVentas.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesGuardarIvasVentas!=null) {
				this.jPanelParametrosReportesGuardarIvasVentas.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.guardarivasventasSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGuardarIvasVentas!=null) {
				this.jTabbedPaneBusquedasGuardarIvasVentas.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesGuardarIvasVentas!=null) {
				this.jPanelParametrosReportesGuardarIvasVentas.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaGuardarIvasVentas=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaGuardarIvasVentas) {this.jTabbedPaneBusquedasGuardarIvasVentas.remove(jPanelBusquedaGuardarIvasVentasGuardarIvasVentas);}
		}
		
	}

	public void setVisibilidadBusquedasParaEjercicio(Boolean isParaEjercicio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEjercicioNegation=!isParaEjercicio;

			this.isVisibilidadBusquedaGuardarIvasVentas=isParaEjercicio;
			if(!this.isVisibilidadBusquedaGuardarIvasVentas) {this.jTabbedPaneBusquedasGuardarIvasVentas.remove(jPanelBusquedaGuardarIvasVentasGuardarIvasVentas);}
		}
		
	}

	public void setVisibilidadBusquedasParaPeriodo(Boolean isParaPeriodo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPeriodoNegation=!isParaPeriodo;

			this.isVisibilidadBusquedaGuardarIvasVentas=isParaPeriodo;
			if(!this.isVisibilidadBusquedaGuardarIvasVentas) {this.jTabbedPaneBusquedasGuardarIvasVentas.remove(jPanelBusquedaGuardarIvasVentasGuardarIvasVentas);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoRetencionFuenteIva(Boolean isParaTipoRetencionFuenteIva){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoRetencionFuenteIvaNegation=!isParaTipoRetencionFuenteIva;

			this.isVisibilidadBusquedaGuardarIvasVentas=isParaTipoRetencionFuenteIva;
			if(!this.isVisibilidadBusquedaGuardarIvasVentas) {this.jTabbedPaneBusquedasGuardarIvasVentas.remove(jPanelBusquedaGuardarIvasVentasGuardarIvasVentas);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaGuardarIvasVentas(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioGuardarIvasVentas() {
		this.updateBorderResaltarBusquedasFormularioGuardarIvasVentas();
		this.updateVisibilidadBusquedasFormularioGuardarIvasVentas();
		this.updateHabilitarBusquedasFormularioGuardarIvasVentas();
	}
	
	public void updateBorderResaltarBusquedasFormularioGuardarIvasVentas() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasGuardarIvasVentas.getComponents().length>0) {
	

		if(this.guardarivasventasConstantesFunciones.resaltarBusquedaGuardarIvasVentasGuardarIvasVentas!=null) {
			index= this.jTabbedPaneBusquedasGuardarIvasVentas.indexOfComponent(this.jPanelBusquedaGuardarIvasVentasGuardarIvasVentas);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasGuardarIvasVentas.getComponent(index);
				jPanel.setBorder(this.guardarivasventasConstantesFunciones.resaltarBusquedaGuardarIvasVentasGuardarIvasVentas);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioGuardarIvasVentas() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasGuardarIvasVentas.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasGuardarIvasVentas.indexOfComponent(this.jPanelBusquedaGuardarIvasVentasGuardarIvasVentas);
			jPanel=(JPanel)this.jTabbedPaneBusquedasGuardarIvasVentas.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.guardarivasventasConstantesFunciones.mostrarBusquedaGuardarIvasVentasGuardarIvasVentas);
			if(!this.guardarivasventasConstantesFunciones.mostrarBusquedaGuardarIvasVentasGuardarIvasVentas && index>-1) {
				this.jTabbedPaneBusquedasGuardarIvasVentas.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioGuardarIvasVentas() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasGuardarIvasVentas.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasGuardarIvasVentas.indexOfComponent(this.jPanelBusquedaGuardarIvasVentasGuardarIvasVentas);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasGuardarIvasVentas.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.guardarivasventasConstantesFunciones.activarBusquedaGuardarIvasVentasGuardarIvasVentas);
				this.jTabbedPaneBusquedasGuardarIvasVentas.setEnabledAt(index,this.guardarivasventasConstantesFunciones.activarBusquedaGuardarIvasVentasGuardarIvasVentas);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaGuardarIvasVentas(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaGuardarIvasVentas")) {
			index= this.jTabbedPaneBusquedasGuardarIvasVentas.indexOfComponent(this.jPanelBusquedaGuardarIvasVentasGuardarIvasVentas);

			this.jTabbedPaneBusquedasGuardarIvasVentas.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasGuardarIvasVentas.getComponent(index);

			this.guardarivasventasConstantesFunciones.setResaltarBusquedaGuardarIvasVentasGuardarIvasVentas(resaltar);

			jPanel.setBorder(this.guardarivasventasConstantesFunciones.resaltarBusquedaGuardarIvasVentasGuardarIvasVentas);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarGuardarIvasVentas.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioGuardarIvasVentas() throws Exception {

		if(this.jInternalFrameDetalleFormGuardarIvasVentas==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioGuardarIvasVentas();
		this.updateVisibilidadResaltarControlesFormularioGuardarIvasVentas();
		this.updateHabilitarResaltarControlesFormularioGuardarIvasVentas();
		
	}
	
	public void updateBorderResaltarControlesFormularioGuardarIvasVentas() throws Exception {
		if(this.jInternalFrameDetalleFormGuardarIvasVentas==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.guardarivasventasConstantesFunciones.resaltaridGuardarIvasVentas!=null && this.jInternalFrameDetalleFormGuardarIvasVentas!=null) {this.jInternalFrameDetalleFormGuardarIvasVentas.jLabelidGuardarIvasVentas.setBorder(this.guardarivasventasConstantesFunciones.resaltaridGuardarIvasVentas);}
		if(this.guardarivasventasConstantesFunciones.resaltarid_empresaGuardarIvasVentas!=null && this.jInternalFrameDetalleFormGuardarIvasVentas!=null) {this.jInternalFrameDetalleFormGuardarIvasVentas.jComboBoxid_empresaGuardarIvasVentas.setBorder(this.guardarivasventasConstantesFunciones.resaltarid_empresaGuardarIvasVentas);}
		if(this.guardarivasventasConstantesFunciones.resaltarid_ejercicioGuardarIvasVentas!=null && this.jInternalFrameDetalleFormGuardarIvasVentas!=null) {this.jInternalFrameDetalleFormGuardarIvasVentas.jComboBoxid_ejercicioGuardarIvasVentas.setBorder(this.guardarivasventasConstantesFunciones.resaltarid_ejercicioGuardarIvasVentas);}
		if(this.guardarivasventasConstantesFunciones.resaltarid_periodoGuardarIvasVentas!=null && this.jInternalFrameDetalleFormGuardarIvasVentas!=null) {this.jInternalFrameDetalleFormGuardarIvasVentas.jComboBoxid_periodoGuardarIvasVentas.setBorder(this.guardarivasventasConstantesFunciones.resaltarid_periodoGuardarIvasVentas);}
		if(this.guardarivasventasConstantesFunciones.resaltarid_tipo_retencion_fuente_ivaGuardarIvasVentas!=null && this.jInternalFrameDetalleFormGuardarIvasVentas!=null) {this.jInternalFrameDetalleFormGuardarIvasVentas.jComboBoxid_tipo_retencion_fuente_ivaGuardarIvasVentas.setBorder(this.guardarivasventasConstantesFunciones.resaltarid_tipo_retencion_fuente_ivaGuardarIvasVentas);}
		if(this.guardarivasventasConstantesFunciones.resaltarcodigo_estado_asiento_contableGuardarIvasVentas!=null && this.jInternalFrameDetalleFormGuardarIvasVentas!=null) {this.jInternalFrameDetalleFormGuardarIvasVentas.jTextFieldcodigo_estado_asiento_contableGuardarIvasVentas.setBorder(this.guardarivasventasConstantesFunciones.resaltarcodigo_estado_asiento_contableGuardarIvasVentas);}
		if(this.guardarivasventasConstantesFunciones.resaltarnombre_periodoGuardarIvasVentas!=null && this.jInternalFrameDetalleFormGuardarIvasVentas!=null) {this.jInternalFrameDetalleFormGuardarIvasVentas.jTextFieldnombre_periodoGuardarIvasVentas.setBorder(this.guardarivasventasConstantesFunciones.resaltarnombre_periodoGuardarIvasVentas);}
		if(this.guardarivasventasConstantesFunciones.resaltarnombre_tipo_retencion_fuente_ivaGuardarIvasVentas!=null && this.jInternalFrameDetalleFormGuardarIvasVentas!=null) {this.jInternalFrameDetalleFormGuardarIvasVentas.jTextAreanombre_tipo_retencion_fuente_ivaGuardarIvasVentas.setBorder(this.guardarivasventasConstantesFunciones.resaltarnombre_tipo_retencion_fuente_ivaGuardarIvasVentas);}
		if(this.guardarivasventasConstantesFunciones.resaltarporcentajeGuardarIvasVentas!=null && this.jInternalFrameDetalleFormGuardarIvasVentas!=null) {this.jInternalFrameDetalleFormGuardarIvasVentas.jTextFieldporcentajeGuardarIvasVentas.setBorder(this.guardarivasventasConstantesFunciones.resaltarporcentajeGuardarIvasVentas);}
		if(this.guardarivasventasConstantesFunciones.resaltarbase_imponibleGuardarIvasVentas!=null && this.jInternalFrameDetalleFormGuardarIvasVentas!=null) {this.jInternalFrameDetalleFormGuardarIvasVentas.jTextFieldbase_imponibleGuardarIvasVentas.setBorder(this.guardarivasventasConstantesFunciones.resaltarbase_imponibleGuardarIvasVentas);}
		if(this.guardarivasventasConstantesFunciones.resaltarvalorGuardarIvasVentas!=null && this.jInternalFrameDetalleFormGuardarIvasVentas!=null) {this.jInternalFrameDetalleFormGuardarIvasVentas.jTextFieldvalorGuardarIvasVentas.setBorder(this.guardarivasventasConstantesFunciones.resaltarvalorGuardarIvasVentas);}
		if(this.guardarivasventasConstantesFunciones.resaltarnumeroGuardarIvasVentas!=null && this.jInternalFrameDetalleFormGuardarIvasVentas!=null) {this.jInternalFrameDetalleFormGuardarIvasVentas.jTextFieldnumeroGuardarIvasVentas.setBorder(this.guardarivasventasConstantesFunciones.resaltarnumeroGuardarIvasVentas);}
		if(this.guardarivasventasConstantesFunciones.resaltarruc_benefGuardarIvasVentas!=null && this.jInternalFrameDetalleFormGuardarIvasVentas!=null) {this.jInternalFrameDetalleFormGuardarIvasVentas.jTextFieldruc_benefGuardarIvasVentas.setBorder(this.guardarivasventasConstantesFunciones.resaltarruc_benefGuardarIvasVentas);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioGuardarIvasVentas() throws Exception {		
		if(this.jInternalFrameDetalleFormGuardarIvasVentas==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormGuardarIvasVentas!=null) {
	
		//this.jInternalFrameDetalleFormGuardarIvasVentas.jLabelidGuardarIvasVentas.setVisible(this.guardarivasventasConstantesFunciones.mostraridGuardarIvasVentas);
		this.jInternalFrameDetalleFormGuardarIvasVentas.jPanelidGuardarIvasVentas.setVisible(this.guardarivasventasConstantesFunciones.mostraridGuardarIvasVentas);
		//this.jInternalFrameDetalleFormGuardarIvasVentas.jComboBoxid_empresaGuardarIvasVentas.setVisible(this.guardarivasventasConstantesFunciones.mostrarid_empresaGuardarIvasVentas);
		this.jInternalFrameDetalleFormGuardarIvasVentas.jPanelid_empresaGuardarIvasVentas.setVisible(this.guardarivasventasConstantesFunciones.mostrarid_empresaGuardarIvasVentas);
		//this.jInternalFrameDetalleFormGuardarIvasVentas.jComboBoxid_ejercicioGuardarIvasVentas.setVisible(this.guardarivasventasConstantesFunciones.mostrarid_ejercicioGuardarIvasVentas);
		this.jInternalFrameDetalleFormGuardarIvasVentas.jPanelid_ejercicioGuardarIvasVentas.setVisible(this.guardarivasventasConstantesFunciones.mostrarid_ejercicioGuardarIvasVentas);
		//this.jInternalFrameDetalleFormGuardarIvasVentas.jComboBoxid_periodoGuardarIvasVentas.setVisible(this.guardarivasventasConstantesFunciones.mostrarid_periodoGuardarIvasVentas);
		this.jInternalFrameDetalleFormGuardarIvasVentas.jPanelid_periodoGuardarIvasVentas.setVisible(this.guardarivasventasConstantesFunciones.mostrarid_periodoGuardarIvasVentas);
		//this.jInternalFrameDetalleFormGuardarIvasVentas.jComboBoxid_tipo_retencion_fuente_ivaGuardarIvasVentas.setVisible(this.guardarivasventasConstantesFunciones.mostrarid_tipo_retencion_fuente_ivaGuardarIvasVentas);
		this.jInternalFrameDetalleFormGuardarIvasVentas.jPanelid_tipo_retencion_fuente_ivaGuardarIvasVentas.setVisible(this.guardarivasventasConstantesFunciones.mostrarid_tipo_retencion_fuente_ivaGuardarIvasVentas);
		//this.jInternalFrameDetalleFormGuardarIvasVentas.jTextFieldcodigo_estado_asiento_contableGuardarIvasVentas.setVisible(this.guardarivasventasConstantesFunciones.mostrarcodigo_estado_asiento_contableGuardarIvasVentas);
		this.jInternalFrameDetalleFormGuardarIvasVentas.jPanelcodigo_estado_asiento_contableGuardarIvasVentas.setVisible(this.guardarivasventasConstantesFunciones.mostrarcodigo_estado_asiento_contableGuardarIvasVentas);
		//this.jInternalFrameDetalleFormGuardarIvasVentas.jTextFieldnombre_periodoGuardarIvasVentas.setVisible(this.guardarivasventasConstantesFunciones.mostrarnombre_periodoGuardarIvasVentas);
		this.jInternalFrameDetalleFormGuardarIvasVentas.jPanelnombre_periodoGuardarIvasVentas.setVisible(this.guardarivasventasConstantesFunciones.mostrarnombre_periodoGuardarIvasVentas);
		//this.jInternalFrameDetalleFormGuardarIvasVentas.jTextAreanombre_tipo_retencion_fuente_ivaGuardarIvasVentas.setVisible(this.guardarivasventasConstantesFunciones.mostrarnombre_tipo_retencion_fuente_ivaGuardarIvasVentas);
		this.jInternalFrameDetalleFormGuardarIvasVentas.jPanelnombre_tipo_retencion_fuente_ivaGuardarIvasVentas.setVisible(this.guardarivasventasConstantesFunciones.mostrarnombre_tipo_retencion_fuente_ivaGuardarIvasVentas);
		//this.jInternalFrameDetalleFormGuardarIvasVentas.jTextFieldporcentajeGuardarIvasVentas.setVisible(this.guardarivasventasConstantesFunciones.mostrarporcentajeGuardarIvasVentas);
		this.jInternalFrameDetalleFormGuardarIvasVentas.jPanelporcentajeGuardarIvasVentas.setVisible(this.guardarivasventasConstantesFunciones.mostrarporcentajeGuardarIvasVentas);
		//this.jInternalFrameDetalleFormGuardarIvasVentas.jTextFieldbase_imponibleGuardarIvasVentas.setVisible(this.guardarivasventasConstantesFunciones.mostrarbase_imponibleGuardarIvasVentas);
		this.jInternalFrameDetalleFormGuardarIvasVentas.jPanelbase_imponibleGuardarIvasVentas.setVisible(this.guardarivasventasConstantesFunciones.mostrarbase_imponibleGuardarIvasVentas);
		//this.jInternalFrameDetalleFormGuardarIvasVentas.jTextFieldvalorGuardarIvasVentas.setVisible(this.guardarivasventasConstantesFunciones.mostrarvalorGuardarIvasVentas);
		this.jInternalFrameDetalleFormGuardarIvasVentas.jPanelvalorGuardarIvasVentas.setVisible(this.guardarivasventasConstantesFunciones.mostrarvalorGuardarIvasVentas);
		//this.jInternalFrameDetalleFormGuardarIvasVentas.jTextFieldnumeroGuardarIvasVentas.setVisible(this.guardarivasventasConstantesFunciones.mostrarnumeroGuardarIvasVentas);
		this.jInternalFrameDetalleFormGuardarIvasVentas.jPanelnumeroGuardarIvasVentas.setVisible(this.guardarivasventasConstantesFunciones.mostrarnumeroGuardarIvasVentas);
		//this.jInternalFrameDetalleFormGuardarIvasVentas.jTextFieldruc_benefGuardarIvasVentas.setVisible(this.guardarivasventasConstantesFunciones.mostrarruc_benefGuardarIvasVentas);
		this.jInternalFrameDetalleFormGuardarIvasVentas.jPanelruc_benefGuardarIvasVentas.setVisible(this.guardarivasventasConstantesFunciones.mostrarruc_benefGuardarIvasVentas);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioGuardarIvasVentas() throws Exception {
		if(this.jInternalFrameDetalleFormGuardarIvasVentas==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormGuardarIvasVentas!=null) {
	
		this.jInternalFrameDetalleFormGuardarIvasVentas.jLabelidGuardarIvasVentas.setEnabled(this.guardarivasventasConstantesFunciones.activaridGuardarIvasVentas);
		this.jInternalFrameDetalleFormGuardarIvasVentas.jComboBoxid_empresaGuardarIvasVentas.setEnabled(this.guardarivasventasConstantesFunciones.activarid_empresaGuardarIvasVentas);
		this.jInternalFrameDetalleFormGuardarIvasVentas.jComboBoxid_ejercicioGuardarIvasVentas.setEnabled(this.guardarivasventasConstantesFunciones.activarid_ejercicioGuardarIvasVentas);
		this.jInternalFrameDetalleFormGuardarIvasVentas.jComboBoxid_periodoGuardarIvasVentas.setEnabled(this.guardarivasventasConstantesFunciones.activarid_periodoGuardarIvasVentas);
		this.jInternalFrameDetalleFormGuardarIvasVentas.jComboBoxid_tipo_retencion_fuente_ivaGuardarIvasVentas.setEnabled(this.guardarivasventasConstantesFunciones.activarid_tipo_retencion_fuente_ivaGuardarIvasVentas);
		this.jInternalFrameDetalleFormGuardarIvasVentas.jTextFieldcodigo_estado_asiento_contableGuardarIvasVentas.setEnabled(this.guardarivasventasConstantesFunciones.activarcodigo_estado_asiento_contableGuardarIvasVentas);
		this.jInternalFrameDetalleFormGuardarIvasVentas.jTextFieldnombre_periodoGuardarIvasVentas.setEnabled(this.guardarivasventasConstantesFunciones.activarnombre_periodoGuardarIvasVentas);
		this.jInternalFrameDetalleFormGuardarIvasVentas.jTextAreanombre_tipo_retencion_fuente_ivaGuardarIvasVentas.setEnabled(this.guardarivasventasConstantesFunciones.activarnombre_tipo_retencion_fuente_ivaGuardarIvasVentas);
		this.jInternalFrameDetalleFormGuardarIvasVentas.jTextFieldporcentajeGuardarIvasVentas.setEnabled(this.guardarivasventasConstantesFunciones.activarporcentajeGuardarIvasVentas);
		this.jInternalFrameDetalleFormGuardarIvasVentas.jTextFieldbase_imponibleGuardarIvasVentas.setEnabled(this.guardarivasventasConstantesFunciones.activarbase_imponibleGuardarIvasVentas);
		this.jInternalFrameDetalleFormGuardarIvasVentas.jTextFieldvalorGuardarIvasVentas.setEnabled(this.guardarivasventasConstantesFunciones.activarvalorGuardarIvasVentas);
		this.jInternalFrameDetalleFormGuardarIvasVentas.jTextFieldnumeroGuardarIvasVentas.setEnabled(this.guardarivasventasConstantesFunciones.activarnumeroGuardarIvasVentas);
		this.jInternalFrameDetalleFormGuardarIvasVentas.jTextFieldruc_benefGuardarIvasVentas.setEnabled(this.guardarivasventasConstantesFunciones.activarruc_benefGuardarIvasVentas);
		}
	}
	
		
}