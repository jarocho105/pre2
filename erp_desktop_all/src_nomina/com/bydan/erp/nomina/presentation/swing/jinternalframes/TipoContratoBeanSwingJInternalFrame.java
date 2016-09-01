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

import com.bydan.erp.nomina.util.TipoContratoConstantesFunciones;
import com.bydan.erp.nomina.util.TipoContratoParameterReturnGeneral;
//import com.bydan.erp.nomina.util.TipoContratoParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.TipoContratoBean;
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

import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.nomina.resources.reportes.AuxiliarReportes;


import com.bydan.erp.nomina.util.*;
import com.bydan.erp.nomina.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.nomina.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TipoContratoBeanSwingJInternalFrame extends TipoContratoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoContratoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoContrato> tipocontratoValidator = new ClassValidator<TipoContrato>(TipoContrato.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoContrato tipocontrato;	
	public TipoContrato tipocontratoAux;
	public TipoContrato tipocontratoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoContrato tipocontratoTotales;
	public Long idTipoContratoActual;
	public Long iIdNuevoTipoContrato=0L;
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

	public String sFinalQueryComboFormato="";

	public List<Formato> formatosForeignKey;

	public List<Formato> getformatosForeignKey() {
		return formatosForeignKey;
	}

	public void setformatosForeignKey(List<Formato> formatosForeignKey) {
		this.formatosForeignKey = formatosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Formato formatoForeignKey;

	public Formato getformatoForeignKey() {
		return formatoForeignKey;
	}

	public void setformatoForeignKey(Formato formatoForeignKey) {
		this.formatoForeignKey = formatoForeignKey;
	}

		
	
	
	
	
	

	public Boolean isTienePermisosDatoGeneralEmpleado=false;

	public Boolean getIsTienePermisosDatoGeneralEmpleado() {
		return isTienePermisosDatoGeneralEmpleado;
	}

	public void setIsTienePermisosDatoGeneralEmpleado(Boolean isTienePermisosDatoGeneralEmpleado) {
		this.isTienePermisosDatoGeneralEmpleado= isTienePermisosDatoGeneralEmpleado;
	}


	public Boolean isTienePermisosEmpleado=false;

	public Boolean getIsTienePermisosEmpleado() {
		return isTienePermisosEmpleado;
	}

	public void setIsTienePermisosEmpleado(Boolean isTienePermisosEmpleado) {
		this.isTienePermisosEmpleado= isTienePermisosEmpleado;
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
	
	public Boolean isPermisoTodoTipoContrato;
	public Boolean isPermisoNuevoTipoContrato;
	public Boolean isPermisoActualizarTipoContrato;
	public Boolean isPermisoActualizarOriginalTipoContrato;
	public Boolean isPermisoEliminarTipoContrato;
	public Boolean isPermisoGuardarCambiosTipoContrato;
	public Boolean isPermisoConsultaTipoContrato;
	public Boolean isPermisoBusquedaTipoContrato;
	public Boolean isPermisoReporteTipoContrato;
	public Boolean isPermisoPaginacionMedioTipoContrato;
	public Boolean isPermisoPaginacionAltoTipoContrato;
	public Boolean isPermisoPaginacionTodoTipoContrato;
	public Boolean isPermisoCopiarTipoContrato;
	public Boolean isPermisoVerFormTipoContrato;
	public Boolean isPermisoDuplicarTipoContrato;
	public Boolean isPermisoOrdenTipoContrato;
	
	
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
	
	public TipoContratoParameterReturnGeneral tipocontratoReturnGeneral;
	public TipoContratoParameterReturnGeneral tipocontratoParameterGeneral;
	
	

	public DatoGeneralEmpleadoLogic datogeneralempleadoLogic=null;

	public DatoGeneralEmpleadoLogic getDatoGeneralEmpleadoLogic() {
		return datogeneralempleadoLogic;
	}

	public void setDatoGeneralEmpleadoLogic(DatoGeneralEmpleadoLogic datogeneralempleadoLogic) {
		this.datogeneralempleadoLogic = datogeneralempleadoLogic;
	}


	public EmpleadoLogic empleadoLogic=null;

	public EmpleadoLogic getEmpleadoLogic() {
		return empleadoLogic;
	}

	public void setEmpleadoLogic(EmpleadoLogic empleadoLogic) {
		this.empleadoLogic = empleadoLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoContrato=false;
	public Boolean esParaAccionDesdeFormularioTipoContrato=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoContratoSessionBeanAdditional tipocontratoSessionBeanAdditional=null;
	
	public TipoContratoSessionBeanAdditional getTipoContratoSessionBeanAdditional() {
		return this.tipocontratoSessionBeanAdditional;
	}
	
	public void setTipoContratoSessionBeanAdditional(TipoContratoSessionBeanAdditional tipocontratoSessionBeanAdditional) {
		try {
			this.tipocontratoSessionBeanAdditional=tipocontratoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoContratoBeanSwingJInternalFrameAdditional tipocontratoBeanSwingJInternalFrameAdditional=null;
	//public class TipoContratoBeanSwingJInternalFrame
	
	public TipoContratoBeanSwingJInternalFrameAdditional getTipoContratoBeanSwingJInternalFrameAdditional() {
		return this.tipocontratoBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoContratoBeanSwingJInternalFrameAdditional(TipoContratoBeanSwingJInternalFrameAdditional tipocontratoBeanSwingJInternalFrameAdditional) {
		try {
			this.tipocontratoBeanSwingJInternalFrameAdditional=tipocontratoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoContratoLogic tipocontratoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoContrato tipocontratoBean;
	public TipoContratoConstantesFunciones tipocontratoConstantesFunciones;
	//public TipoContratoParameterReturnGeneral tipocontratoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public FormatoLogic formatoLogic;
	
	//PARAMETROS
	
	
	//public List<TipoContrato> tipocontratos;	
	//public List<TipoContrato> tipocontratosEliminados;
	//public List<TipoContrato> tipocontratosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoContrato=false;
	public Boolean isVisibilidadCeldaDuplicarTipoContrato=true;
	public Boolean isVisibilidadCeldaCopiarTipoContrato=true;
	public Boolean isVisibilidadCeldaVerFormTipoContrato=true;
	public Boolean isVisibilidadCeldaOrdenTipoContrato=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoContrato=false;
	public Boolean isVisibilidadCeldaModificarTipoContrato=false;
	public Boolean isVisibilidadCeldaActualizarTipoContrato=false;
	public Boolean isVisibilidadCeldaEliminarTipoContrato=false;
	public Boolean isVisibilidadCeldaCancelarTipoContrato=false;
	public Boolean isVisibilidadCeldaGuardarTipoContrato=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoContrato=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdTipoContrato=false;
	
	public Long getiIdNuevoTipoContrato() {
		return this.iIdNuevoTipoContrato;
	}

	public void setiIdNuevoTipoContrato(Long iIdNuevoTipoContrato) {
		this.iIdNuevoTipoContrato = iIdNuevoTipoContrato;
	}
	
	public Long getidTipoContratoActual() {
		return this.idTipoContratoActual;
	}

	public void setidTipoContratoActual(Long idTipoContratoActual) {
		this.idTipoContratoActual = idTipoContratoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoContrato gettipocontrato() {
		return this.tipocontrato;
	}

	public void settipocontrato(TipoContrato tipocontrato) {
		this.tipocontrato = tipocontrato;
	}
	
	public TipoContrato gettipocontratoAux() {
		return this.tipocontratoAux;
	}

	public void settipocontratoAux(TipoContrato tipocontratoAux) {
		this.tipocontratoAux = tipocontratoAux;
	}				
	
	public TipoContrato gettipocontratoAnterior() {
		return this.tipocontratoAnterior;
	}

	public void settipocontratoAnterior(TipoContrato tipocontratoAnterior) {
		this.tipocontratoAnterior = tipocontratoAnterior;
	}	
	
	public TipoContrato gettipocontratoTotales() {
		return this.tipocontratoTotales;
	}

	public void settipocontratoTotales(TipoContrato tipocontratoTotales) {
		this.tipocontratoTotales = tipocontratoTotales;
	}	
	
	public TipoContrato gettipocontratoBean() {
		return this.tipocontratoBean;
	}

	public void settipocontratoBean(TipoContrato tipocontratoBean) {
		this.tipocontratoBean = tipocontratoBean;
	}	
	
	public TipoContratoParameterReturnGeneral gettipocontratoReturnGeneral() {
		return this.tipocontratoReturnGeneral;
	}

	public void settipocontratoReturnGeneral(TipoContratoParameterReturnGeneral tipocontratoReturnGeneral) {
		this.tipocontratoReturnGeneral = tipocontratoReturnGeneral;
	}	
	
	
	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_formatoFK_IdTipoContrato=-1L;

	public Long getid_formatoFK_IdTipoContrato() {
		return this.id_formatoFK_IdTipoContrato;
	}

	public void setid_formatoFK_IdTipoContrato(Long id_formatoFK_IdTipoContrato) {
		this.id_formatoFK_IdTipoContrato = id_formatoFK_IdTipoContrato;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoContratoLogic getTipoContratoLogic()	{		
		return tipocontratoLogic;
	}

	public void setTipoContratoLogic(TipoContratoLogic tipocontratoLogic) {
		this.tipocontratoLogic = tipocontratoLogic;
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
	
	public Boolean getIsEsNuevoTipoContrato() {
		return isEsNuevoTipoContrato;
	}

	public void setIsEsNuevoTipoContrato(Boolean isEsNuevoTipoContrato) {
		this.isEsNuevoTipoContrato = isEsNuevoTipoContrato;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoContrato() {
		return esParaAccionDesdeFormularioTipoContrato;
	}
	
	public void setEsParaAccionDesdeFormularioTipoContrato(Boolean esParaAccionDesdeFormularioTipoContrato) {
		this.esParaAccionDesdeFormularioTipoContrato = esParaAccionDesdeFormularioTipoContrato;
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

			if(this.tipocontratoSessionBean==null) {
				this.tipocontratoSessionBean=new TipoContratoSessionBean();
			}

			if(!this.tipocontratoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tipocontratoSessionBean.getlidEmpresaActual());
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

	public void cargarCombosFormatosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.formatosForeignKey=new ArrayList<Formato>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			FormatoLogic formatoLogic=new FormatoLogic();

			//formatoLogic.getFormatoDataAccess().setIsForForeingKeyData(true);

			if(this.tipocontratoSessionBean==null) {
				this.tipocontratoSessionBean=new TipoContratoSessionBean();
			}

			if(!this.tipocontratoSessionBean.getisBusquedaDesdeForeignKeySesionFormato()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//formatoLogic.getFormatoDataAccess().setIsForForeingKeyData(true);

					formatoLogic.getTodosFormatosWithConnection(sFinalQuery,new Pagination());

					this.formatosForeignKey=formatoLogic.getFormatos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaFormato(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					formatoLogic.getEntityWithConnection(tipocontratoSessionBean.getlidFormatoActual());
					this.formatosForeignKey.add(formatoLogic.getFormato());
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

					if(this.tipocontrato!=null) {
						this.tipocontrato.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoContrato!=null) {
						this.jInternalFrameDetalleFormTipoContrato.jComboBoxid_empresaTipoContrato.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTipoContrato.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTipoContrato!=null) {
						if(this.jInternalFrameDetalleFormTipoContrato.jComboBoxid_empresaTipoContrato.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoContrato.jComboBoxid_empresaTipoContrato.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTipoContratoGenerico)throws Exception
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
				jComboBoxid_empresaTipoContratoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTipoContratoGenerico!=null && jComboBoxid_empresaTipoContratoGenerico.getItemCount()>0) {
					jComboBoxid_empresaTipoContratoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualFormatoForeignKey(Long idFormatoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Formato  formatoTemp=null;

			for(Formato formatoAux:formatosForeignKey) {
				if(formatoAux.getId()!=null && formatoAux.getId().equals(idFormatoSeleccionado)) {
					formatoTemp=formatoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(formatoTemp!=null) {

					if(this.tipocontrato!=null) {
						this.tipocontrato.setFormato(formatoTemp);
					}

					if(this.jInternalFrameDetalleFormTipoContrato!=null) {
						this.jInternalFrameDetalleFormTipoContrato.jComboBoxid_formatoTipoContrato.setSelectedItem(formatoTemp);
					}
				} else {
					//jComboBoxid_formatoTipoContrato.setSelectedItem(formatoTemp);
					if(this.jInternalFrameDetalleFormTipoContrato!=null) {
						if(this.jInternalFrameDetalleFormTipoContrato.jComboBoxid_formatoTipoContrato.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoContrato.jComboBoxid_formatoTipoContrato.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoContrato") || sFormularioTipoBusqueda.equals("Todos")){
					if(formatoTemp!=null && jComboBoxid_formatoFK_IdTipoContratoTipoContrato!=null) {
						jComboBoxid_formatoFK_IdTipoContratoTipoContrato.setSelectedItem(formatoTemp);
					} else {
						if(jComboBoxid_formatoFK_IdTipoContratoTipoContrato!=null) {
							//jComboBoxid_formatoFK_IdTipoContratoTipoContrato.setSelectedItem(formatoTemp);
							if(jComboBoxid_formatoFK_IdTipoContratoTipoContrato.getItemCount()>0) {
								jComboBoxid_formatoFK_IdTipoContratoTipoContrato.setSelectedIndex(0);
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

	public String getActualFormatoForeignKeyDescripcion(Long idFormatoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Formato  formatoTemp=null;

			for(Formato formatoAux:formatosForeignKey) {
				if(formatoAux.getId()!=null && formatoAux.getId().equals(idFormatoSeleccionado)) {
					formatoTemp=formatoAux;
					break;
				}
			}


			sDescripcion=FormatoConstantesFunciones.getFormatoDescripcion(formatoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualFormatoForeignKeyGenerico(Long idFormatoSeleccionado,JComboBox jComboBoxid_formatoTipoContratoGenerico)throws Exception
	{
		try
		{
			Formato  formatoTemp=null;

			for(Formato formatoAux:formatosForeignKey) {
				if(formatoAux.getId()!=null && formatoAux.getId().equals(idFormatoSeleccionado)) {
					formatoTemp=formatoAux;
					break;
				}
			}

			if(formatoTemp!=null) {
				jComboBoxid_formatoTipoContratoGenerico.setSelectedItem(formatoTemp);
			} else {
				if(jComboBoxid_formatoTipoContratoGenerico!=null && jComboBoxid_formatoTipoContratoGenerico.getItemCount()>0) {
					jComboBoxid_formatoTipoContratoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TipoContrato tipocontrato,JComboBox jComboBoxid_empresaTipoContratoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTipoContratoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTipoContrato.jComboBoxid_empresaTipoContrato.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTipoContratoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tipocontrato.setid_empresa(empresaAux.getId());
				tipocontrato.setempresa_descripcion(TipoContratoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tipocontrato.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarFormatoForeignKey(TipoContrato tipocontrato,JComboBox jComboBoxid_formatoTipoContratoGenerico)throws Exception
	{
		try
		{
			Formato  formatoAux=new Formato();

			if(jComboBoxid_formatoTipoContratoGenerico==null) {
				formatoAux=(Formato)this.jInternalFrameDetalleFormTipoContrato.jComboBoxid_formatoTipoContrato.getSelectedItem();
			} else {
				formatoAux=(Formato)jComboBoxid_formatoTipoContratoGenerico.getSelectedItem();
			}

			if(formatoAux!=null && formatoAux.getId()!=null) {
				tipocontrato.setid_formato(formatoAux.getId());
				tipocontrato.setformato_descripcion(TipoContratoConstantesFunciones.getFormatoDescripcion(formatoAux));
				tipocontrato.setFormato(formatoAux);			}
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

					if(!TipoContratoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoContrato!=null) { 
							this.jInternalFrameDetalleFormTipoContrato.jComboBoxid_empresaTipoContrato.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTipoContrato.jComboBoxid_empresaTipoContrato.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoContrato!=null) { 
					}

					if(!TipoContratoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameFormatosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingFormato=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!TipoContratoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoContrato!=null) { 
							this.jInternalFrameDetalleFormTipoContrato.jComboBoxid_formatoTipoContrato.removeAllItems();

							for(Formato formato:this.formatosForeignKey) {
								this.jInternalFrameDetalleFormTipoContrato.jComboBoxid_formatoTipoContrato.addItem(formato);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoContrato!=null) { 
					}

					if(!TipoContratoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoContrato") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!TipoContratoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_formatoFK_IdTipoContratoTipoContrato.removeAllItems();

							for(Formato formato:this.formatosForeignKey) {
								this.jComboBoxid_formatoFK_IdTipoContratoTipoContrato.addItem(formato);
							}
						}

						if(!TipoContratoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTipoContrato!=null) {
							this.jInternalFrameDetalleFormTipoContrato.jComboBoxid_empresaTipoContrato.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoContrato!=null) {
							this.jInternalFrameDetalleFormTipoContrato.jComboBoxid_empresaTipoContrato.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameFormatoForeignKey(Formato formato,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTipoContrato!=null) {
							this.jInternalFrameDetalleFormTipoContrato.jComboBoxid_formatoTipoContrato.setSelectedItem(formato);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoContrato!=null) {
							this.jInternalFrameDetalleFormTipoContrato.jComboBoxid_formatoTipoContrato.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_formatoFK_IdTipoContratoTipoContrato.setSelectedItem(formato);
						} else {
							this.jComboBoxid_formatoFK_IdTipoContratoTipoContrato.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesTipoContrato() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoContratoConstantesFunciones.refrescarForeignKeysDescripcionesTipoContrato(this.tipocontratoLogic.getTipoContratos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoContratoConstantesFunciones.refrescarForeignKeysDescripcionesTipoContrato(this.tipocontratos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Formato.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipocontratoLogic.setTipoContratos(this.tipocontratos);
			tipocontratoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoContratoParameterReturnGeneral getTipoContratoParameterGeneral() {
		return this.tipocontratoParameterGeneral;
	}
	
	public void setTipoContratoParameterGeneral(TipoContratoParameterReturnGeneral tipocontratoParameterGeneral) {
		this.tipocontratoParameterGeneral = tipocontratoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoContrato() {
		return isPermisoTodoTipoContrato;
	}

	public void setIsPermisoTodoTipoContrato(Boolean isPermisoTodoTipoContrato) {
		this.isPermisoTodoTipoContrato = isPermisoTodoTipoContrato;
	}

	public Boolean getIsPermisoNuevoTipoContrato() {
		return isPermisoNuevoTipoContrato;
	}

	public void setIsPermisoNuevoTipoContrato(Boolean isPermisoNuevoTipoContrato) {
		this.isPermisoNuevoTipoContrato = isPermisoNuevoTipoContrato;
	}

	public Boolean getIsPermisoActualizarTipoContrato() {
		return isPermisoActualizarTipoContrato;
	}

	public void setIsPermisoActualizarTipoContrato(Boolean isPermisoActualizarTipoContrato) {
		this.isPermisoActualizarTipoContrato = isPermisoActualizarTipoContrato;
	}

	public Boolean getIsPermisoEliminarTipoContrato() {
		return isPermisoEliminarTipoContrato;
	}

	public void setIsPermisoEliminarTipoContrato(Boolean isPermisoEliminarTipoContrato) {
		this.isPermisoEliminarTipoContrato = isPermisoEliminarTipoContrato;
	}

	public Boolean getIsPermisoGuardarCambiosTipoContrato() {
		return isPermisoGuardarCambiosTipoContrato;
	}

	public void setIsPermisoGuardarCambiosTipoContrato(Boolean isPermisoGuardarCambiosTipoContrato) {
		this.isPermisoGuardarCambiosTipoContrato = isPermisoGuardarCambiosTipoContrato;
	}
	
	public Boolean getIsPermisoConsultaTipoContrato() {
		return isPermisoConsultaTipoContrato;
	}

	public void setIsPermisoConsultaTipoContrato(Boolean isPermisoConsultaTipoContrato) {
		this.isPermisoConsultaTipoContrato = isPermisoConsultaTipoContrato;
	}

	public Boolean getIsPermisoBusquedaTipoContrato() {
		return isPermisoBusquedaTipoContrato;
	}

	public void setIsPermisoBusquedaTipoContrato(Boolean isPermisoBusquedaTipoContrato) {
		this.isPermisoBusquedaTipoContrato = isPermisoBusquedaTipoContrato;
	}

	public Boolean getIsPermisoReporteTipoContrato() {
		return isPermisoReporteTipoContrato;
	}

	public void setIsPermisoReporteTipoContrato(Boolean isPermisoReporteTipoContrato) {
		this.isPermisoReporteTipoContrato = isPermisoReporteTipoContrato;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoContrato() {
		return isPermisoPaginacionMedioTipoContrato;
	}

	public void setIsPermisoPaginacionMedioTipoContrato(Boolean isPermisoPaginacionMedioTipoContrato) {
		this.isPermisoPaginacionMedioTipoContrato = isPermisoPaginacionMedioTipoContrato;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoContrato() {
		return isPermisoPaginacionTodoTipoContrato;
	}

	public void setIsPermisoPaginacionTodoTipoContrato(Boolean isPermisoPaginacionTodoTipoContrato) {
		this.isPermisoPaginacionTodoTipoContrato = isPermisoPaginacionTodoTipoContrato;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoContrato() {
		return isPermisoPaginacionAltoTipoContrato;
	}

	public void setIsPermisoPaginacionAltoTipoContrato(Boolean isPermisoPaginacionAltoTipoContrato) {
		this.isPermisoPaginacionAltoTipoContrato = isPermisoPaginacionAltoTipoContrato;
	}
	
	public Boolean getIsPermisoCopiarTipoContrato() {
		return isPermisoCopiarTipoContrato;
	}

	public void setIsPermisoCopiarTipoContrato(Boolean isPermisoCopiarTipoContrato) {
		this.isPermisoCopiarTipoContrato = isPermisoCopiarTipoContrato;
	}
	
	public Boolean getIsPermisoVerFormTipoContrato() {
		return isPermisoVerFormTipoContrato;
	}

	public void setIsPermisoVerFormTipoContrato(Boolean isPermisoVerFormTipoContrato) {
		this.isPermisoVerFormTipoContrato = isPermisoVerFormTipoContrato;
	}
	
	public Boolean getIsPermisoDuplicarTipoContrato() {
		return isPermisoDuplicarTipoContrato;
	}

	public void setIsPermisoDuplicarTipoContrato(Boolean isPermisoDuplicarTipoContrato) {
		this.isPermisoDuplicarTipoContrato = isPermisoDuplicarTipoContrato;
	}
	
	public Boolean getIsPermisoOrdenTipoContrato() {
		return isPermisoOrdenTipoContrato;
	}

	public void setIsPermisoOrdenTipoContrato(Boolean isPermisoOrdenTipoContrato) {
		this.isPermisoOrdenTipoContrato = isPermisoOrdenTipoContrato;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoContrato() {
		return isVisibilidadCeldaNuevoTipoContrato;
	}

	public void setIsVisibilidadCeldaNuevoTipoContrato(Boolean isVisibilidadCeldaNuevoTipoContrato) {
		this.isVisibilidadCeldaNuevoTipoContrato = isVisibilidadCeldaNuevoTipoContrato;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoContrato() {
		return isVisibilidadCeldaDuplicarTipoContrato;
	}

	public void setIsVisibilidadCeldaDuplicarTipoContrato(Boolean isVisibilidadCeldaDuplicarTipoContrato) {
		this.isVisibilidadCeldaDuplicarTipoContrato = isVisibilidadCeldaDuplicarTipoContrato;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoContrato() {
		return isVisibilidadCeldaCopiarTipoContrato;
	}

	public void setIsVisibilidadCeldaCopiarTipoContrato(Boolean isVisibilidadCeldaCopiarTipoContrato) {
		this.isVisibilidadCeldaCopiarTipoContrato = isVisibilidadCeldaCopiarTipoContrato;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoContrato() {
		return isVisibilidadCeldaVerFormTipoContrato;
	}

	public void setIsVisibilidadCeldaVerFormTipoContrato(Boolean isVisibilidadCeldaVerFormTipoContrato) {
		this.isVisibilidadCeldaVerFormTipoContrato = isVisibilidadCeldaVerFormTipoContrato;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoContrato() {
		return isVisibilidadCeldaOrdenTipoContrato;
	}

	public void setIsVisibilidadCeldaOrdenTipoContrato(Boolean isVisibilidadCeldaOrdenTipoContrato) {
		this.isVisibilidadCeldaOrdenTipoContrato = isVisibilidadCeldaOrdenTipoContrato;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoContrato() {
		return isVisibilidadCeldaNuevoRelacionesTipoContrato;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoContrato(Boolean isVisibilidadCeldaNuevoRelacionesTipoContrato) {
		this.isVisibilidadCeldaNuevoRelacionesTipoContrato = isVisibilidadCeldaNuevoRelacionesTipoContrato;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoContrato() {
		return isVisibilidadCeldaModificarTipoContrato;
	}

	public void setIsVisibilidadCeldaModificarTipoContrato(Boolean isVisibilidadCeldaModificarTipoContrato) {
		this.isVisibilidadCeldaModificarTipoContrato = isVisibilidadCeldaModificarTipoContrato;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoContrato() {
		return isVisibilidadCeldaActualizarTipoContrato;
	}

	public void setIsVisibilidadCeldaActualizarTipoContrato(Boolean isVisibilidadCeldaActualizarTipoContrato) {
		this.isVisibilidadCeldaActualizarTipoContrato = isVisibilidadCeldaActualizarTipoContrato;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoContrato() {
		return isVisibilidadCeldaEliminarTipoContrato;
	}

	public void setIsVisibilidadCeldaEliminarTipoContrato(Boolean isVisibilidadCeldaEliminarTipoContrato) {
		this.isVisibilidadCeldaEliminarTipoContrato = isVisibilidadCeldaEliminarTipoContrato;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoContrato() {
		return isVisibilidadCeldaCancelarTipoContrato;
	}

	public void setIsVisibilidadCeldaCancelarTipoContrato(Boolean isVisibilidadCeldaCancelarTipoContrato) {
		this.isVisibilidadCeldaCancelarTipoContrato = isVisibilidadCeldaCancelarTipoContrato;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoContrato() {
		return isVisibilidadCeldaGuardarTipoContrato;
	}

	public void setIsVisibilidadCeldaGuardarTipoContrato(Boolean isVisibilidadCeldaGuardarTipoContrato) {
		this.isVisibilidadCeldaGuardarTipoContrato = isVisibilidadCeldaGuardarTipoContrato;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoContrato() {
		return isVisibilidadCeldaGuardarCambiosTipoContrato;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoContrato(Boolean isVisibilidadCeldaGuardarCambiosTipoContrato) {
		this.isVisibilidadCeldaGuardarCambiosTipoContrato = isVisibilidadCeldaGuardarCambiosTipoContrato;
	}
		
	public TipoContratoSessionBean gettipocontratoSessionBean() {
		return this.tipocontratoSessionBean;
	}
	
	public void settipocontratoSessionBean(TipoContratoSessionBean tipocontratoSessionBean) {
		this.tipocontratoSessionBean=tipocontratoSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdTipoContrato() {
		return this.isVisibilidadFK_IdTipoContrato;
	}

	public void setisVisibilidadFK_IdTipoContrato(Boolean isVisibilidadFK_IdTipoContrato) {
		this.isVisibilidadFK_IdTipoContrato=isVisibilidadFK_IdTipoContrato;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoContrato(TipoContrato tipocontrato)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tipocontrato,null);
				this.setActualParaGuardarFormatoForeignKey(tipocontrato,null);
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
	
	public void bugActualizarReferenciaActual(TipoContrato tipocontrato,TipoContrato tipocontratoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoContrato(tipocontrato);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipocontratoAux.setId(tipocontrato.getId());
		tipocontratoAux.setVersionRow(tipocontrato.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoContrato();
		
			int intSelectedRow = this.jTableDatosTipoContrato.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocontrato =(TipoContrato) this.tipocontratoLogic.getTipoContratos().toArray()[this.jTableDatosTipoContrato.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipocontrato =(TipoContrato) this.tipocontratos.toArray()[this.jTableDatosTipoContrato.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoContratoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoContrato(this.tipocontrato,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoContrato(this.tipocontrato);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipocontratoValidator.getInvalidValues(this.tipocontrato);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipocontratoLogic.setDatosCliente(datosCliente);
			tipocontratoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipocontratoAux=new  TipoContrato();
				
				tipocontratoAux.setIsNew(true);
				tipocontratoAux.setIsChanged(true);
				
				tipocontratoAux.setTipoContratoOriginal(this.tipocontrato);
				
				tipocontratoAux.setId(this.tipocontrato.getId());	
				tipocontratoAux.setVersionRow(this.tipocontrato.getVersionRow());	
				tipocontratoAux.setid_empresa(this.tipocontrato.getid_empresa());	
				tipocontratoAux.setid_formato(this.tipocontrato.getid_formato());	
				tipocontratoAux.setcodigo(this.tipocontrato.getcodigo());	
				tipocontratoAux.setnombre(this.tipocontrato.getnombre());	
				tipocontratoAux.setnumero_dias(this.tipocontrato.getnumero_dias());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipocontratoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipocontratoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipocontratoAux,tipocontratoLogic.getTipoContratos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocontratoAux,tipocontratos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipocontratoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipocontratoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocontratoLogic.saveTipoContratos();//WithConnection
						//tipocontratoLogic.getSetVersionRowTipoContratos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipocontrato,tipocontratoAux);
					
					this.refrescarForeignKeysDescripcionesTipoContrato();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipocontratoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.getDatoGeneralEmpleados().addAll(this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadosEliminados);
							this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFrame.empleadoLogic.getEmpleados().addAll(this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFrame.empleadosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleados.addAll(this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadosEliminados);
							this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFrame.empleados.addAll(this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFrame.empleadosEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.tipocontratoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipocontratoLogic.saveTipoContratoRelaciones(tipocontratoAux,this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.getDatoGeneralEmpleados(),this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFrame.empleadoLogic.getEmpleados());//WithConnection
								//tipocontratoLogic.getSetVersionRowTipoContratos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipocontrato,tipocontratoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.setDatoGeneralEmpleados(new ArrayList<DatoGeneralEmpleado>());
							this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFrame.empleadoLogic.setEmpleados(new ArrayList<Empleado>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleados= new ArrayList<DatoGeneralEmpleado>();
							this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFrame.empleados= new ArrayList<Empleado>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipocontratoAux.setDatoGeneralEmpleados(this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.getDatoGeneralEmpleados());

							if(this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipocontratoAux.setEmpleados(this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFrame.empleadoLogic.getEmpleados());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipocontratoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipocontratoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipocontratoAux,tipocontratoLogic.getTipoContratos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipocontratoAux,tipocontratos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipocontrato,tipocontratoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipocontratoAux=new  TipoContrato();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipocontratoSessionBean.getEsGuardarRelacionado() 
					|| (this.tipocontratoSessionBean.getEsGuardarRelacionado() && this.tipocontrato.getId()>=0)) {
						
					tipocontratoAux.setIsNew(false);
				}
				
				tipocontratoAux.setIsDeleted(false);
			
				tipocontratoAux.setId(this.tipocontrato.getId());	
				tipocontratoAux.setVersionRow(this.tipocontrato.getVersionRow());	
				tipocontratoAux.setid_empresa(this.tipocontrato.getid_empresa());	
				tipocontratoAux.setid_formato(this.tipocontrato.getid_formato());	
				tipocontratoAux.setcodigo(this.tipocontrato.getcodigo());	
				tipocontratoAux.setnombre(this.tipocontrato.getnombre());	
				tipocontratoAux.setnumero_dias(this.tipocontrato.getnumero_dias());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipocontratoAux,tipocontratoLogic.getTipoContratos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocontratoAux,tipocontratos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipocontratoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipocontratoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocontratoLogic.saveTipoContratos();//WithConnection
						//tipocontratoLogic.getSetVersionRowTipoContratos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipocontrato,tipocontratoAux);
					
					this.refrescarForeignKeysDescripcionesTipoContrato();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipocontratoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.getDatoGeneralEmpleados().addAll(this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadosEliminados);
							this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFrame.empleadoLogic.getEmpleados().addAll(this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFrame.empleadosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleados.addAll(this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadosEliminados);
							this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFrame.empleados.addAll(this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFrame.empleadosEliminados);
						}
						//ARCHITECTURE
						
						if(!this.tipocontratoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipocontratoLogic.saveTipoContratoRelaciones(tipocontratoAux,this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.getDatoGeneralEmpleados(),this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFrame.empleadoLogic.getEmpleados());//WithConnection
								//tipocontratoLogic.getSetVersionRowTipoContratos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipocontrato,tipocontratoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.setDatoGeneralEmpleados(new ArrayList<DatoGeneralEmpleado>());
							this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFrame.empleadoLogic.setEmpleados(new ArrayList<Empleado>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleados= new ArrayList<DatoGeneralEmpleado>();
							this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFrame.empleados= new ArrayList<Empleado>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipocontratoAux.setDatoGeneralEmpleados(this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.getDatoGeneralEmpleados());

							if(this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipocontratoAux.setEmpleados(this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFrame.empleadoLogic.getEmpleados());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipocontratoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipocontratoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipocontratoAux,tipocontratoLogic.getTipoContratos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipocontratoAux,tipocontratos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipocontrato,tipocontratoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipocontratoAux=new  TipoContrato();
				
				tipocontratoAux.setIsNew(false);
				tipocontratoAux.setIsChanged(false);
				
				tipocontratoAux.setIsDeleted(true);
				
				tipocontratoAux.setId(this.tipocontrato.getId());	
				tipocontratoAux.setVersionRow(this.tipocontrato.getVersionRow());	
				tipocontratoAux.setid_empresa(this.tipocontrato.getid_empresa());	
				tipocontratoAux.setid_formato(this.tipocontrato.getid_formato());	
				tipocontratoAux.setcodigo(this.tipocontrato.getcodigo());	
				tipocontratoAux.setnombre(this.tipocontrato.getnombre());	
				tipocontratoAux.setnumero_dias(this.tipocontrato.getnumero_dias());	
				
				if(this.tipocontratoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipocontratoAux.getId()>=0) {	
						this.tipocontratosEliminados.add(tipocontratoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipocontratoAux,tipocontratoLogic.getTipoContratos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocontratoAux,tipocontratos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipocontratoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipocontratoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocontratoLogic.saveTipoContratos();//WithConnection
						//tipocontratoLogic.getSetVersionRowTipoContratos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipocontratoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.getDatoGeneralEmpleados().addAll(this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadosEliminados);
							this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFrame.empleadoLogic.getEmpleados().addAll(this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFrame.empleadosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleados.addAll(this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadosEliminados);
							this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFrame.empleados.addAll(this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFrame.empleadosEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.tipocontratoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipocontratoLogic.saveTipoContratoRelaciones(tipocontratoAux,this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.getDatoGeneralEmpleados(),this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFrame.empleadoLogic.getEmpleados());//WithConnection
								//tipocontratoLogic.getSetVersionRowTipoContratos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.setDatoGeneralEmpleados(new ArrayList<DatoGeneralEmpleado>());
							this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFrame.empleadoLogic.setEmpleados(new ArrayList<Empleado>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleados= new ArrayList<DatoGeneralEmpleado>();
							this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFrame.empleados= new ArrayList<Empleado>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipocontratoAux.setDatoGeneralEmpleados(this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.getDatoGeneralEmpleados());

							if(this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipocontratoAux.setEmpleados(this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFrame.empleadoLogic.getEmpleados());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipocontratoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipocontratoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipocontratoAux,tipocontratoLogic.getTipoContratos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipocontratoAux,tipocontratos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocontratoLogic.getTipoContratos().addAll(this.tipocontratosEliminados);
					
					tipocontratoLogic.saveTipoContratos();//WithConnection
					//tipocontratoLogic.getSetVersionRowTipoContratos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoContrato();
				
				this.tipocontratosEliminados= new ArrayList<TipoContrato>();		
			}
			
			if(this.tipocontratoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocontratoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Contrato GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Contrato",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipocontrato=tipocontratoAux;
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
      		//this.finishProcessTipoContrato();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoContrato tipocontratoLocal) throws Exception {
		
		if(this.tipocontratoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipocontratoLocal.setDatoGeneralEmpleados(this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.getDatoGeneralEmpleados());
				tipocontratoLocal.setEmpleados(this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFrame.empleadoLogic.getEmpleados());
			
			} else {
			
				tipocontratoLocal.setDatoGeneralEmpleados(this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleados);
				tipocontratoLocal.setEmpleados(this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFrame.empleados);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoContrato tipocontratoLocal) throws Exception {	
		if(this.tipocontratoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tipocontratoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(FormatoDetalleFormJInternalFrame.class)) {
				FormatoBeanSwingJInternalFrame formatoBeanSwingJInternalFrameLocal=(FormatoBeanSwingJInternalFrame) ((FormatoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				formatoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoFormato(formatoBeanSwingJInternalFrameLocal.getformato(),true);
				formatoBeanSwingJInternalFrameLocal.actualizarLista(formatoBeanSwingJInternalFrameLocal.formato,this.formatosForeignKey);

				formatoBeanSwingJInternalFrameLocal.actualizarRelaciones(formatoBeanSwingJInternalFrameLocal.formato);

				tipocontratoLocal.setFormato(formatoBeanSwingJInternalFrameLocal.formato);

				this.addItemDefectoCombosForeignKeyFormato();
				this.cargarCombosFrameFormatosForeignKey("Formulario");
				this.setActualFormatoForeignKey(formatoBeanSwingJInternalFrameLocal.formato.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoContratoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoContrato.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipocontrato =(TipoContrato) this.tipocontratoLogic.getTipoContratos().toArray()[this.jTableDatosTipoContrato.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipocontrato =(TipoContrato) this.tipocontratos.toArray()[this.jTableDatosTipoContrato.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipocontratoValidator.getInvalidValues(this.tipocontrato);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoContrato tipocontrato,List<TipoContrato> tipocontratos) throws Exception {
		try	{		
			TipoContratoConstantesFunciones.actualizarLista(tipocontrato,tipocontratos,this.tipocontratoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoContrato tipocontrato,List<TipoContrato> tipocontratos) throws Exception {
		try	{			
			TipoContratoConstantesFunciones.actualizarSelectedLista(tipocontrato,tipocontratos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoContrato> tipocontratosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipocontratosLocal=this.tipocontratoLogic.getTipoContratos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipocontratosLocal=this.tipocontratos;
			}
			//ARCHITECTURE
		
			for(TipoContrato tipocontratoLocal:tipocontratosLocal) {
				if(this.permiteMantenimiento(tipocontratoLocal) && tipocontratoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoContratoConstantesFunciones.getTipoContratoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoContratoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoContrato.jLabelid_empresaTipoContrato,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoContratoConstantesFunciones.IDFORMATO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoContrato.jLabelid_formatoTipoContrato,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoContratoConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoContrato.jLabelcodigoTipoContrato,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoContratoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoContrato.jLabelnombreTipoContrato,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoContratoConstantesFunciones.NUMERODIAS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoContrato.jLabelnumero_diasTipoContrato,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoContrato!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoContrato.jLabelid_empresaTipoContrato,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoContrato.jLabelid_formatoTipoContrato,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoContrato.jLabelcodigoTipoContrato,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoContrato.jLabelnombreTipoContrato,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoContrato.jLabelnumero_diasTipoContrato,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("DatoGeneralEmpleado")) {
			if(this.tipocontrato==null) {
				this.tipocontrato= new TipoContrato();
			}

			if(this.tipocontratoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoContrato
				this.setVariablesFormularioToObjetoActualTipoContrato(this.tipocontrato,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoContrato(this.tipocontrato);

				this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFrame.getdatogeneralempleado().setTipoContrato(this.tipocontrato);
			}

			return;
		}
		 else  if(sTipo.equals("Empleado")) {
			if(this.tipocontrato==null) {
				this.tipocontrato= new TipoContrato();
			}

			if(this.tipocontratoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoContrato
				this.setVariablesFormularioToObjetoActualTipoContrato(this.tipocontrato,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoContrato(this.tipocontrato);

				this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFrame.getempleado().setTipoContrato(this.tipocontrato);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoContrato--;	
		
		
		this.tipocontratoAux=new TipoContrato();
		
		this.tipocontratoAux.setId(this.iIdNuevoTipoContrato);
		this.tipocontratoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipocontratoLogic.getTipoContratos().add(this.tipocontratoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipocontratos.add(this.tipocontratoAux);
		}
		//ARCHITECTURE
		
		this.tipocontrato=this.tipocontratoAux;
		
		if(TipoContratoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoContrato(this.tipocontrato);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoContrato(this.tipocontrato);
		}
				
		//this.setDefaultControlesTipoContrato();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoContrato();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoContrato();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoContrato();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoContrato(this.tipocontratoBean,this.tipocontrato,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoContrato(this.tipocontrato);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoContratoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipocontratoSessionBean.getConGuardarRelaciones()) {
			classes=TipoContratoConstantesFunciones.getClassesRelationshipsOfTipoContrato(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipocontratoReturnGeneral=tipocontratoLogic.procesarEventosTipoContratosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipocontratoLogic.getTipoContratos(),this.tipocontrato,this.tipocontratoParameterGeneral,this.isEsNuevoTipoContrato,classes);//this.tipocontratoLogic.getTipoContrato()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoContrato(this.tipocontratoReturnGeneral,this.tipocontratoBean,false);
		
		if(this.tipocontratoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoContrato(this.tipocontratoReturnGeneral.getTipoContrato());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoContrato(this.tipocontratoReturnGeneral.getTipoContrato());
		}
		
		if(this.tipocontratoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoContrato(this.tipocontratoReturnGeneral.getTipoContrato(),classes);//this.tipocontratoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoContrato(this.tipocontrato,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoContrato();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoContrato();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoContratoBeanSwingJInternalFrameAdditional.RecargarFormTipoContrato(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoContrato(false);
						
			if(tipocontratoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoSessionBean.getEsGuardarRelacionado() && DatoGeneralEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDatoGeneralEmpleadoActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFrame.empleadoSessionBean.getEsGuardarRelacionado() && EmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonEmpleadoActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoContratoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoContrato();
			}
			
			this.actualizarVisualTableDatosTipoContrato();
			
			this.jTableDatosTipoContrato.setRowSelectionInterval(this.getIndiceNuevoTipoContrato(), this.getIndiceNuevoTipoContrato());
			
			this.seleccionarFilaTablaTipoContratoActual();
						
			this.actualizarEstadoCeldasBotonesTipoContrato("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoContrato(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoContrato.jTextFieldcodigoTipoContrato.setEnabled(isHabilitar && this.tipocontratoConstantesFunciones.activarcodigoTipoContrato);
		this.jInternalFrameDetalleFormTipoContrato.jTextAreanombreTipoContrato.setEnabled(isHabilitar && this.tipocontratoConstantesFunciones.activarnombreTipoContrato);
		this.jInternalFrameDetalleFormTipoContrato.jTextFieldnumero_diasTipoContrato.setEnabled(isHabilitar && this.tipocontratoConstantesFunciones.activarnumero_diasTipoContrato);	
		//
		this.jInternalFrameDetalleFormTipoContrato.jComboBoxid_empresaTipoContrato.setEnabled(isHabilitar && this.tipocontratoConstantesFunciones.activarid_empresaTipoContrato);
		this.jInternalFrameDetalleFormTipoContrato.jComboBoxid_formatoTipoContrato.setEnabled(isHabilitar && this.tipocontratoConstantesFunciones.activarid_formatoTipoContrato);
	};
	
	public void setDefaultControlesTipoContrato() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoContrato(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipocontratoSessionBean.setConGuardarRelaciones(true);			
			this.tipocontratoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoContrato.jTabbedPaneRelacionesTipoContrato.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFrame.empleadoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipocontratoSessionBean.setConGuardarRelaciones(false);			
			this.tipocontratoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoContrato.jTabbedPaneRelacionesTipoContrato.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFrame.empleadoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoContrato() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoContrato tipocontratoAux:this.tipocontratoLogic.getTipoContratos()) {
				if(tipocontratoAux.getId().equals(this.iIdNuevoTipoContrato)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoContrato tipocontratoAux:this.tipocontratos) {
				if(tipocontratoAux.getId().equals(this.iIdNuevoTipoContrato)) {
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
	
	public int getIndiceActualTipoContrato(TipoContrato tipocontrato,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoContrato tipocontratoAux:this.tipocontratoLogic.getTipoContratos()) {
				if(tipocontratoAux.getId().equals(tipocontrato.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoContrato tipocontratoAux:this.tipocontratos) {
				if(tipocontratoAux.getId().equals(tipocontrato.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoContrato(TipoContrato tipocontratoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoContrato tipocontratoAux:this.tipocontratoLogic.getTipoContratos()) {
				if(tipocontratoAux.getTipoContratoOriginal().getId().equals(tipocontratoOriginal.getId())) {
					existe=true;
					tipocontratoOriginal.setId(tipocontratoAux.getId());
					tipocontratoOriginal.setVersionRow(tipocontratoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoContrato tipocontratoAux:this.tipocontratos) {
				if(tipocontratoAux.getTipoContratoOriginal().getId().equals(tipocontratoOriginal.getId())) {
					existe=true;
					tipocontratoOriginal.setId(tipocontratoAux.getId());
					tipocontratoOriginal.setVersionRow(tipocontratoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoContrato(Boolean esParaCancelar) throws Exception {
		tipocontratosAux=new ArrayList<TipoContrato>();
		tipocontratoAux=new TipoContrato();
		
		if(!this.tipocontratoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoContrato tipocontratoAux:this.tipocontratoLogic.getTipoContratos()) {
					if(tipocontratoAux.getId()<0) {
						tipocontratosAux.add(tipocontratoAux);
					}		
				}
				this.iIdNuevoTipoContrato=0L;
				this.tipocontratoLogic.getTipoContratos().removeAll(tipocontratosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoContrato tipocontratoAux:this.tipocontratos) {
					if(tipocontratoAux.getId()<0) {
						tipocontratosAux.add(tipocontratoAux);
					}		
				}
				this.iIdNuevoTipoContrato=0L;
				this.tipocontratos.removeAll(tipocontratosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoContrato 
					&& this.tipocontratoLogic.getTipoContratos().size()>0
					) {
					tipocontratoAux=this.tipocontratoLogic.getTipoContratos().get(this.tipocontratoLogic.getTipoContratos().size() - 1);
				
					if(tipocontratoAux.getId()<0) {
						this.tipocontratoLogic.getTipoContratos().remove(tipocontratoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoContrato && this.tipocontratos.size()>0) {
					tipocontratoAux=this.tipocontratos.get(this.tipocontratos.size() - 1);
				
					if(tipocontratoAux.getId()<0) {
						this.tipocontratos.remove(tipocontratoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoContrato(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipocontrato.getId()<0) {
				this.tipocontratoLogic.getTipoContratos().remove(this.tipocontrato);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipocontrato.getId()<0) {
				this.tipocontratos.remove(this.tipocontrato);
			}
		}			
	}
	
	public void setEstadosInicialesTipoContrato(List<TipoContrato> tipocontratosAux) throws Exception {
		TipoContratoConstantesFunciones.setEstadosInicialesTipoContrato(tipocontratosAux);
	}
	
	public void setEstadosInicialesTipoContrato(TipoContrato tipocontratoAux) throws Exception {
		TipoContratoConstantesFunciones.setEstadosInicialesTipoContrato(tipocontratoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoContratoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoContrato("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoContratoActual()) {
				if(!this.isEsNuevoTipoContrato) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoContrato("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoContrato=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoContratoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Contrato ?", "MANTENIMIENTO DE Tipo Contrato", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoContrato("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoContrato tipocontrato) throws Exception {
		TipoContratoConstantesFunciones.seleccionarAsignar(this.tipocontrato,tipocontrato);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoContrato=this.isPermisoActualizarOriginalTipoContrato;
			
			
			this.seleccionarAsignar(tipocontrato);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoContratoConstantesFunciones.quitarEspaciosTipoContrato(this.tipocontrato,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoContrato("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipocontratoSessionBean.setsFuncionBusquedaRapida(this.tipocontratoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoContrato) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoContrato(esParaCancelar);				
				this.cancelarNuevoTipoContrato(esParaCancelar);								
			}
			
			this.tipocontrato=new TipoContrato();
			
			this.inicializarTipoContrato();
			
			this.actualizarEstadoCeldasBotonesTipoContrato("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoContrato() throws Exception {
		try {
			TipoContratoConstantesFunciones.inicializarTipoContrato(this.tipocontrato);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipocontratoLogic.getTipoContratos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoContratos(String sAccionBusqueda,List<TipoContrato> tipocontratosParaReportes) throws Exception {
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
					sPathReporteFinal="TipoContrato"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoContratoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoContratoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoContrato"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Contratos");		
		parameters.put("busquedapor", TipoContratoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(DatoGeneralEmpleado.class));
			classes.add(new Classe(Empleado.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoContratoLogic tipocontratoLogicAuxiliar=new TipoContratoLogic();
					tipocontratoLogicAuxiliar.setDatosCliente(tipocontratoLogic.getDatosCliente());				
					tipocontratoLogicAuxiliar.setTipoContratos(tipocontratosParaReportes);
					
					tipocontratoLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoContratoWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipocontratosParaReportes=tipocontratoLogicAuxiliar.getTipoContratos();
					
					//tipocontratoLogic.getNewConnexionToDeep();
					
					//for (TipoContrato tipocontrato:tipocontratosParaReportes) {
					//	tipocontratoLogic.deepLoad(tipocontrato, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipocontratoLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipocontratoLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileDatoGeneralEmpleado = AuxiliarReportes.class.getResourceAsStream("DatoGeneralEmpleadoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_datogeneralempleado", reportFileDatoGeneralEmpleado);

			InputStream reportFileEmpleado = AuxiliarReportes.class.getResourceAsStream("EmpleadoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_empleado", reportFileEmpleado);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoContrato=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoContratoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoContratoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoContrato=new JRBeanArrayDataSource(TipoContratoJInternalFrame.TraerTipoContratoBeans(tipocontratosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoContrato);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoContratoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoContratoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoContratoBean.TraerTipoContratoBeans(tipocontratosParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoContratos(sAccionBusqueda,sTipoArchivoReporte,tipocontratosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoContratos(sAccionBusqueda,sTipoArchivoReporte,tipocontratosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoContratoActionPerformed(null);
					//this.generarExcelReporteTipoContratos(sAccionBusqueda,sTipoArchivoReporte,tipocontratosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoContratos(sAccionBusqueda,sTipoArchivoReporte,tipocontratosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoContratos(sAccionBusqueda,sTipoArchivoReporte,tipocontratosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoContratos(sAccionBusqueda,sTipoArchivoReporte,tipocontratosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoContratos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoContrato> tipocontratosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocontrato";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoContratos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoContrato("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoContrato tipocontrato : tipocontratosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoContratoConstantesFunciones.generarExcelReporteDataTipoContrato("NORMAL",row,workbook,tipocontrato,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocontratoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Contrato",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoContrato(String sTipo,Row row,Workbook workbook) {
		
		TipoContratoConstantesFunciones.generarExcelReporteHeaderTipoContrato(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoContratos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoContrato> tipocontratosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocontrato_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoContratos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoContrato tipocontrato : tipocontratosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoContratoConstantesFunciones.getTipoContratoDescripcion(tipocontrato));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoContratoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoContratoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipocontrato.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoContratoConstantesFunciones.LABEL_IDFORMATO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoContratoConstantesFunciones.LABEL_IDFORMATO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipocontrato.getformato_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoContratoConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoContratoConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipocontrato.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoContratoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoContratoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipocontrato.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoContratoConstantesFunciones.LABEL_NUMERODIAS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoContratoConstantesFunciones.LABEL_NUMERODIAS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipocontrato.getnumero_dias());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocontratoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Contrato",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoContratos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoContrato> tipocontratosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoContrato> tipocontratosRespaldo=null;
		
		classes=TipoContratoConstantesFunciones.getClassesRelationshipsOfTipoContrato(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipocontratoLogic.setDatosCliente(this.datosCliente);
		this.tipocontratoLogic.setDatosDeep(this.datosDeep);
		this.tipocontratoLogic.setIsConDeep(true);
		
		tipocontratosRespaldo=this.tipocontratoLogic.getTipoContratos();
		
		this.tipocontratoLogic.setTipoContratos(tipocontratosParaReportes);	
		this.tipocontratoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipocontratosParaReportes=this.tipocontratoLogic.getTipoContratos();
		this.tipocontratoLogic.setTipoContratos(tipocontratosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocontrato_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoContratos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoContrato("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoContrato tipocontrato : tipocontratosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoContrato("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoContratoConstantesFunciones.generarExcelReporteDataTipoContrato("NORMAL",row,workbook,tipocontrato,cellStyleDataAux);
		
			
			


				//DatoGeneralEmpleado
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(DatoGeneralEmpleadoConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipocontrato.getDatoGeneralEmpleados()!=null && tipocontrato.getDatoGeneralEmpleados().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(DatoGeneralEmpleadoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					DatoGeneralEmpleadoConstantesFunciones.generarExcelReporteHeaderDatoGeneralEmpleado("RELACIONADO",row,workbook);
				}

				if(tipocontrato.getDatoGeneralEmpleados()!=null) {
					i2=0;
					for(DatoGeneralEmpleado datogeneralempleado : tipocontrato.getDatoGeneralEmpleados()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						DatoGeneralEmpleadoConstantesFunciones.generarExcelReporteDataDatoGeneralEmpleado("RELACIONADO",row,workbook,datogeneralempleado,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//Empleado
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(EmpleadoConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipocontrato.getEmpleados()!=null && tipocontrato.getEmpleados().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(EmpleadoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					EmpleadoConstantesFunciones.generarExcelReporteHeaderEmpleado("RELACIONADO",row,workbook);
				}

				if(tipocontrato.getEmpleados()!=null) {
					i2=0;
					for(Empleado empleado : tipocontrato.getEmpleados()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						EmpleadoConstantesFunciones.generarExcelReporteDataEmpleado("RELACIONADO",row,workbook,empleado,cellStyleDataAuxHijo);
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
		cell.setCellValue(TipoContratoConstantesFunciones.getTipoContratoDescripcion(tipocontrato));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocontratoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Contrato",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoContrato.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoContrato.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoContrato.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoContrato.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoContrato() throws Exception {		
		this.startProcessTipoContrato(true);
	}
	
	public void startProcessTipoContrato(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoContrato ,this.jPanelParametrosReportesTipoContrato, this.jScrollPanelDatosTipoContrato,this.jPanelPaginacionTipoContrato, this.jScrollPanelDatosEdicionTipoContrato, this.jPanelAccionesTipoContrato,this.jPanelAccionesFormularioTipoContrato,this.jmenuBarTipoContrato,this.jmenuBarDetalleTipoContrato,this.jTtoolBarTipoContrato,this.jTtoolBarDetalleTipoContrato);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoContrato=this.jTabbedPaneBusquedasTipoContrato; 
		
		final JPanel jPanelParametrosReportesTipoContrato=this.jPanelParametrosReportesTipoContrato;
		//final JScrollPane jScrollPanelDatosTipoContrato=this.jScrollPanelDatosTipoContrato;
		final JTable jTableDatosTipoContrato=this.jTableDatosTipoContrato;		
		final JPanel jPanelPaginacionTipoContrato=this.jPanelPaginacionTipoContrato;
		//final JScrollPane jScrollPanelDatosEdicionTipoContrato=this.jScrollPanelDatosEdicionTipoContrato;
		final JPanel jPanelAccionesTipoContrato=this.jPanelAccionesTipoContrato;
		
		JPanel jPanelCamposAuxiliarTipoContrato=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoContrato=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoContrato!=null) {
			jPanelCamposAuxiliarTipoContrato=this.jInternalFrameDetalleFormTipoContrato.jPanelCamposTipoContrato;
			jPanelAccionesFormularioAuxiliarTipoContrato=this.jInternalFrameDetalleFormTipoContrato.jPanelAccionesFormularioTipoContrato;
		}
		
		final JPanel jPanelCamposTipoContrato=jPanelCamposAuxiliarTipoContrato;
		final JPanel jPanelAccionesFormularioTipoContrato=jPanelAccionesFormularioAuxiliarTipoContrato;
		
		
		final JMenuBar jmenuBarTipoContrato=this.jmenuBarTipoContrato;
		final JToolBar jTtoolBarTipoContrato=this.jTtoolBarTipoContrato;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoContrato=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoContrato=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoContrato!=null) {
			jmenuBarDetalleAuxiliarTipoContrato=this.jInternalFrameDetalleFormTipoContrato.jmenuBarDetalleTipoContrato;
			jTtoolBarDetalleAuxiliarTipoContrato=this.jInternalFrameDetalleFormTipoContrato.jTtoolBarDetalleTipoContrato;
		}
		
		final JMenuBar jmenuBarDetalleTipoContrato=jmenuBarDetalleAuxiliarTipoContrato;
		final JToolBar jTtoolBarDetalleTipoContrato=jTtoolBarDetalleAuxiliarTipoContrato;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoContrato;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoContrato;
			processRunnable.jTableDatos=jTableDatosTipoContrato;
			processRunnable.jPanelCampos=jPanelCamposTipoContrato;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoContrato;
			processRunnable.jPanelAcciones=jPanelAccionesTipoContrato;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoContrato;
			
			
			processRunnable.jmenuBar=jmenuBarTipoContrato;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoContrato;
			processRunnable.jTtoolBar=jTtoolBarTipoContrato;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoContrato;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoContrato ,jPanelParametrosReportesTipoContrato,jTableDatosTipoContrato, /*jScrollPanelDatosTipoContrato,*/jPanelCamposTipoContrato,jPanelPaginacionTipoContrato, /*jScrollPanelDatosEdicionTipoContrato,*/ jPanelAccionesTipoContrato,jPanelAccionesFormularioTipoContrato,jmenuBarTipoContrato,jmenuBarDetalleTipoContrato,jTtoolBarTipoContrato,jTtoolBarDetalleTipoContrato);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoContrato ,jPanelParametrosReportesTipoContrato, jScrollPanelDatosTipoContrato,jPanelPaginacionTipoContrato, jScrollPanelDatosEdicionTipoContrato, jPanelAccionesTipoContrato,jPanelAccionesFormularioTipoContrato,jmenuBarTipoContrato,jmenuBarDetalleTipoContrato,jTtoolBarTipoContrato,jTtoolBarDetalleTipoContrato);
						
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
	
	public void finishProcessTipoContrato() {// throws Exception 
		this.finishProcessTipoContrato(true);
	}
	
	public void finishProcessTipoContrato(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoContrato ,this.jPanelParametrosReportesTipoContrato, this.jScrollPanelDatosTipoContrato,this.jPanelPaginacionTipoContrato, this.jScrollPanelDatosEdicionTipoContrato, this.jPanelAccionesTipoContrato,this.jPanelAccionesFormularioTipoContrato,this.jmenuBarTipoContrato,this.jmenuBarDetalleTipoContrato,this.jTtoolBarTipoContrato,this.jTtoolBarDetalleTipoContrato);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoContrato=this.jTabbedPaneBusquedasTipoContrato; 
		
		final JPanel jPanelParametrosReportesTipoContrato=this.jPanelParametrosReportesTipoContrato;
		//final JScrollPane jScrollPanelDatosTipoContrato=this.jScrollPanelDatosTipoContrato;
		final JTable jTableDatosTipoContrato=this.jTableDatosTipoContrato;		
		final JPanel jPanelPaginacionTipoContrato=this.jPanelPaginacionTipoContrato;
		//final JScrollPane jScrollPanelDatosEdicionTipoContrato=this.jScrollPanelDatosEdicionTipoContrato;
		final JPanel jPanelAccionesTipoContrato=this.jPanelAccionesTipoContrato;
		
		JPanel jPanelCamposAuxiliarTipoContrato=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoContrato=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoContrato!=null) {
			jPanelCamposAuxiliarTipoContrato=this.jInternalFrameDetalleFormTipoContrato.jPanelCamposTipoContrato;
			jPanelAccionesFormularioAuxiliarTipoContrato=this.jInternalFrameDetalleFormTipoContrato.jPanelAccionesFormularioTipoContrato;
		}
		
		final JPanel jPanelCamposTipoContrato=jPanelCamposAuxiliarTipoContrato;
		final JPanel jPanelAccionesFormularioTipoContrato=jPanelAccionesFormularioAuxiliarTipoContrato;
		
		
		final JMenuBar jmenuBarTipoContrato=this.jmenuBarTipoContrato;		
		final JToolBar jTtoolBarTipoContrato=this.jTtoolBarTipoContrato;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoContrato=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoContrato=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoContrato!=null) {
			jmenuBarDetalleAuxiliarTipoContrato=this.jInternalFrameDetalleFormTipoContrato.jmenuBarDetalleTipoContrato;
			jTtoolBarDetalleAuxiliarTipoContrato=this.jInternalFrameDetalleFormTipoContrato.jTtoolBarDetalleTipoContrato;		
		}
		
		final JMenuBar jmenuBarDetalleTipoContrato=jmenuBarDetalleAuxiliarTipoContrato;
		final JToolBar jTtoolBarDetalleTipoContrato=jTtoolBarDetalleAuxiliarTipoContrato;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoContrato;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoContrato;
			processRunnable.jTableDatos=jTableDatosTipoContrato;
			processRunnable.jPanelCampos=jPanelCamposTipoContrato;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoContrato;
			processRunnable.jPanelAcciones=jPanelAccionesTipoContrato;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoContrato;
			
			
			processRunnable.jmenuBar=jmenuBarTipoContrato;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoContrato;
			processRunnable.jTtoolBar=jTtoolBarTipoContrato;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoContrato;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoContrato ,jPanelParametrosReportesTipoContrato, jTableDatosTipoContrato,/*jScrollPanelDatosTipoContrato,*/jPanelCamposTipoContrato,jPanelPaginacionTipoContrato, /*jScrollPanelDatosEdicionTipoContrato,*/ jPanelAccionesTipoContrato,jPanelAccionesFormularioTipoContrato,jmenuBarTipoContrato,jmenuBarDetalleTipoContrato,jTtoolBarTipoContrato,jTtoolBarDetalleTipoContrato));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoContrato(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoContrato(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoContrato(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoContrato(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoContrato,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoContrato,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoContrato(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoContrato,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoContrato,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipocontratoConstantesFunciones.getsFinalQueryTipoContrato();
		String  finalQueryPaginacionTodos=this.tipocontratoConstantesFunciones.getsFinalQueryTipoContrato();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoContratoConstantesFunciones.getArrayColumnasGlobalesNoTipoContrato(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoContratoConstantesFunciones.getArrayColumnasGlobalesTipoContrato(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoContratoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipocontratosEliminados= new ArrayList<TipoContrato>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoContrato();
		
				///*TipoContratoSessionBean*/this.tipocontratoSessionBean=new TipoContratoSessionBean();
			
			if(this.tipocontratoSessionBean==null) {
				this.tipocontratoSessionBean=new TipoContratoSessionBean();
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
					this.iNumeroPaginacion=TipoContratoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoContratoConstantesFunciones.getClassesForeignKeysOfTipoContrato(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipocontrato."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipocontratosAux= new ArrayList<TipoContrato>();
			
				
			tipocontratoLogic.setDatosCliente(this.datosCliente);
			tipocontratoLogic.setDatosDeep(this.datosDeep);
			tipocontratoLogic.setIsConDeep(true);
			
			
			tipocontratoLogic.getTipoContratoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipocontratoLogic.getTodosTipoContratos(finalQueryGlobal,pagination);
					
					//tipocontratoLogic.getTodosTipoContratosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipocontratoLogic.getTipoContratos()==null|| tipocontratoLogic.getTipoContratos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipocontratosAux= new ArrayList<TipoContrato>();
							tipocontratosAux.addAll(tipocontratoLogic.getTipoContratos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocontratosAux= new ArrayList<TipoContrato>();
							tipocontratosAux.addAll(tipocontratos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipocontratoLogic.getTodosTipoContratos(finalQueryGlobal+"",this.pagination);												
							
							//tipocontratoLogic.getTodosTipoContratosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoContratos("Todos",tipocontratoLogic.getTipoContratos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipocontratoLogic.setTipoContratos(new ArrayList<TipoContrato>());					
							tipocontratoLogic.getTipoContratos().addAll(tipocontratosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocontratos=new ArrayList<TipoContrato>();
							tipocontratos.addAll(tipocontratosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoContrato=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoContrato=this.idActual;
				
				} else if(this.idTipoContratoActual!=null && this.idTipoContratoActual!=0L) {
					idTipoContrato=idTipoContratoActual;
				}
				
					
				this.sDetalleReporte=TipoContratoConstantesFunciones.getDetalleIndicePorId(idTipoContrato);
				
				this.tipocontratos=new ArrayList<TipoContrato>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipocontratoLogic.getEntity(idTipoContrato);
					
					//tipocontratoLogic.getEntityWithConnection(idTipoContrato);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocontratoLogic.setTipoContratos(new ArrayList<TipoContrato>());
					tipocontratoLogic.getTipoContratos().add(tipocontratoLogic.getTipoContrato());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipocontratos=new ArrayList<TipoContrato>();
					this.tipocontratos.add(tipocontrato);
				}
				
				if(tipocontratoLogic.getTipoContrato()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TipoContratoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipocontratoLogic.getTipoContratosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoContratoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoContratoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipocontratoLogic.getTipoContratos()==null||tipocontratoLogic.getTipoContratos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipocontratos==null|| tipocontratos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocontratosAux=new ArrayList<TipoContrato>();
						tipocontratosAux.addAll(tipocontratoLogic.getTipoContratos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocontratosAux=new ArrayList<TipoContrato>();
							tipocontratosAux.addAll(tipocontratos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipocontratoLogic.getTipoContratosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoContratoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoContratoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoContratos("FK_IdEmpresa",tipocontratoLogic.getTipoContratos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoContratos("FK_IdEmpresa",tipocontratos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocontratoLogic.setTipoContratos(new ArrayList<TipoContrato>());
						tipocontratoLogic.getTipoContratos().addAll(tipocontratosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocontratos=new ArrayList<TipoContrato>();
							tipocontratos.addAll(tipocontratosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoContrato")) {
				this.sDetalleReporte=TipoContratoConstantesFunciones.getDetalleIndiceFK_IdTipoContrato(id_formatoFK_IdTipoContrato);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipocontratoLogic.getTipoContratosFK_IdTipoContrato(finalQueryGlobal,pagination,id_formatoFK_IdTipoContrato);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoContratoConstantesFunciones.getDetalleIndiceFK_IdTipoContrato(id_formatoFK_IdTipoContrato);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoContratoConstantesFunciones.getDetalleIndiceFK_IdTipoContrato(id_formatoFK_IdTipoContrato);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipocontratoLogic.getTipoContratos()==null||tipocontratoLogic.getTipoContratos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipocontratos==null|| tipocontratos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocontratosAux=new ArrayList<TipoContrato>();
						tipocontratosAux.addAll(tipocontratoLogic.getTipoContratos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocontratosAux=new ArrayList<TipoContrato>();
							tipocontratosAux.addAll(tipocontratos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipocontratoLogic.getTipoContratosFK_IdTipoContrato(finalQueryGlobal,pagination,id_formatoFK_IdTipoContrato);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoContratoConstantesFunciones.getDetalleIndiceFK_IdTipoContrato(id_formatoFK_IdTipoContrato);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoContratoConstantesFunciones.getDetalleIndiceFK_IdTipoContrato(id_formatoFK_IdTipoContrato);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoContratos("FK_IdTipoContrato",tipocontratoLogic.getTipoContratos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoContratos("FK_IdTipoContrato",tipocontratos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocontratoLogic.setTipoContratos(new ArrayList<TipoContrato>());
						tipocontratoLogic.getTipoContratos().addAll(tipocontratosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocontratos=new ArrayList<TipoContrato>();
							tipocontratos.addAll(tipocontratosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoContrato();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoContrato();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipocontratoLogic.getTipoContratos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipocontratos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipocontratoLogic.getTipoContratos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipocontratos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoContrato tipocontrato) {
		Boolean permite=true;
		
		if(this.tipocontrato.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoContratoConstantesFunciones.getOrderByListaTipoContrato();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoContratoConstantesFunciones.getOrderByListaTipoContrato();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoContrato tipocontrato:tipocontratoLogic.getTipoContratos()) {
				if(tipocontrato.getsType().equals(Constantes2.S_TOTALES)) {
					tipocontratoTotales=tipocontrato;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoContrato tipocontrato:this.tipocontratos) {
				if(tipocontrato.getsType().equals(Constantes2.S_TOTALES)) {
					tipocontratoTotales=tipocontrato;
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
			this.tipocontratoAux=new TipoContrato();
			this.tipocontratoAux.setsType(Constantes2.S_TOTALES);
			this.tipocontratoAux.setIsNew(false);
			this.tipocontratoAux.setIsChanged(false);
			this.tipocontratoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoContratoConstantesFunciones.TotalizarValoresFilaTipoContrato(this.tipocontratoLogic.getTipoContratos(),this.tipocontratoAux);
				
				this.tipocontratoLogic.getTipoContratos().add(this.tipocontratoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoContratoConstantesFunciones.TotalizarValoresFilaTipoContrato(this.tipocontratos,this.tipocontratoAux);
				
				this.tipocontratos.add(this.tipocontratoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipocontratoTotales=new TipoContrato();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipocontratoLogic.getTipoContratos().remove(tipocontratoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipocontratos.remove(tipocontratoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipocontratoTotales=new TipoContrato();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoContrato tipocontrato:tipocontratoLogic.getTipoContratos()) {
				if(tipocontrato.getsType().equals(Constantes2.S_TOTALES)) {
					tipocontratoTotales=tipocontrato;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoContratoConstantesFunciones.TotalizarValoresFilaTipoContrato(this.tipocontratoLogic.getTipoContratos(),tipocontratoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoContrato tipocontrato:this.tipocontratos) {
				if(tipocontrato.getsType().equals(Constantes2.S_TOTALES)) {
					tipocontratoTotales=tipocontrato;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoContratoConstantesFunciones.TotalizarValoresFilaTipoContrato(this.tipocontratos,tipocontratoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoContratosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoContratosFK_IdTipoContrato()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoContrato";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoContratosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocontratoLogic.getTipoContratosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoContratosFK_IdTipoContrato(String sFinalQuery,Long id_formato)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocontratoLogic.getTipoContratosFK_IdTipoContrato(sFinalQuery,this.pagination,id_formato);
				
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
	
	public void inicializarPermisosTipoContrato() {
		this.isPermisoTodoTipoContrato=false;
		this.isPermisoNuevoTipoContrato=false;
		this.isPermisoActualizarTipoContrato=false;
		this.isPermisoActualizarOriginalTipoContrato=false;
		this.isPermisoEliminarTipoContrato=false;
		this.isPermisoGuardarCambiosTipoContrato=false;
		this.isPermisoConsultaTipoContrato=false;
		this.isPermisoBusquedaTipoContrato=false;
		this.isPermisoReporteTipoContrato=false;		
		this.isPermisoOrdenTipoContrato=false;		
		this.isPermisoPaginacionMedioTipoContrato=false;		
		this.isPermisoPaginacionAltoTipoContrato=false;
		this.isPermisoPaginacionTodoTipoContrato=false;
		this.isPermisoCopiarTipoContrato=false;		
		this.isPermisoVerFormTipoContrato=false;		
		this.isPermisoDuplicarTipoContrato=false;		
		this.isPermisoOrdenTipoContrato=false;		
	}
	
	public void setPermisosUsuarioTipoContrato(Boolean isPermiso) {
		this.isPermisoTodoTipoContrato=isPermiso;
		this.isPermisoNuevoTipoContrato=isPermiso;
		this.isPermisoActualizarTipoContrato=isPermiso;
		this.isPermisoActualizarOriginalTipoContrato=isPermiso;
		this.isPermisoEliminarTipoContrato=isPermiso;
		this.isPermisoGuardarCambiosTipoContrato=isPermiso;
		this.isPermisoConsultaTipoContrato=isPermiso;
		this.isPermisoBusquedaTipoContrato=isPermiso;
		this.isPermisoReporteTipoContrato=isPermiso;
		this.isPermisoOrdenTipoContrato=isPermiso;		
		this.isPermisoPaginacionMedioTipoContrato=isPermiso;		
		this.isPermisoPaginacionAltoTipoContrato=isPermiso;		
		this.isPermisoPaginacionTodoTipoContrato=isPermiso;		
		this.isPermisoCopiarTipoContrato=isPermiso;		
		this.isPermisoVerFormTipoContrato=isPermiso;		
		this.isPermisoDuplicarTipoContrato=isPermiso;
		this.isPermisoOrdenTipoContrato=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoContrato(Boolean isPermiso) {
		//this.isPermisoTodoTipoContrato=isPermiso;
		this.isPermisoNuevoTipoContrato=isPermiso;
		this.isPermisoActualizarTipoContrato=isPermiso;
		this.isPermisoActualizarOriginalTipoContrato=isPermiso;
		this.isPermisoEliminarTipoContrato=isPermiso;
		this.isPermisoGuardarCambiosTipoContrato=isPermiso;
		//this.isPermisoConsultaTipoContrato=isPermiso;
		//this.isPermisoBusquedaTipoContrato=isPermiso;
		//this.isPermisoReporteTipoContrato=isPermiso;
		//this.isPermisoOrdenTipoContrato=isPermiso;		
		//this.isPermisoPaginacionMedioTipoContrato=isPermiso;		
		//this.isPermisoPaginacionAltoTipoContrato=isPermiso;		
		//this.isPermisoPaginacionTodoTipoContrato=isPermiso;		
		//this.isPermisoCopiarTipoContrato=isPermiso;		
		//this.isPermisoDuplicarTipoContrato=isPermiso;
		//this.isPermisoOrdenTipoContrato=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoContratoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(DatoGeneralEmpleadoConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(EmpleadoConstantesFunciones.SNOMBREOPCION);
		
		if(TipoContratoJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosDatoGeneralEmpleado=false;
		this.isTienePermisosDatoGeneralEmpleado=this.verificarGetPermisosUsuarioOpcionTipoContratoClaseRelacionada(this.opcionsRelacionadas,DatoGeneralEmpleadoConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosEmpleado=false;
		this.isTienePermisosEmpleado=this.verificarGetPermisosUsuarioOpcionTipoContratoClaseRelacionada(this.opcionsRelacionadas,EmpleadoConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoContrato(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoContratoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosDatoGeneralEmpleado=conPermiso;
		this.isTienePermisosEmpleado=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoContratoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoContratoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoContratoClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosDatoGeneralEmpleado && this.jInternalFrameDetalleFormTipoContrato!=null && this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoContrato.jTabbedPaneRelacionesTipoContrato.remove(this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosEmpleado && this.jInternalFrameDetalleFormTipoContrato!=null && this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoContrato.jTabbedPaneRelacionesTipoContrato.remove(this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoContrato() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoContratoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipocontratoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoContratoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoContrato=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoContrato=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoContrato=this.isPermisoActualizarTipoContrato;
			this.isPermisoEliminarTipoContrato=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoContrato=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoContrato=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoContrato=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoContrato=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoContrato=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoContrato=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoContrato=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoContrato=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoContrato=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoContrato=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoContrato=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoContrato=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoContrato=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipocontratoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoContrato.setToolTipText(this.jTableDatosTipoContrato.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoContrato(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoContrato(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoContratoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoContratoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoContrato() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosDatoGeneralEmpleado && this.tipocontratoConstantesFunciones.mostrarDatoGeneralEmpleadoTipoContrato && !TipoContratoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Dato General Empleado");
			reporte.setsDescripcion("Dato General Empleado");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosEmpleado && this.tipocontratoConstantesFunciones.mostrarEmpleadoTipoContrato && !TipoContratoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Empleado");
			reporte.setsDescripcion("Empleado");
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
	public void inicializarCombosForeignKeyTipoContratoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.formatosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoContratoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoContratoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoContratoListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyFormatoListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyFormatoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.formatosForeignKey==null||this.formatosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=FormatoConstantesFunciones.getArrayColumnasGlobalesFormato(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,FormatoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=FormatoConstantesFunciones.SFINALQUERY;

				this.cargarCombosFormatosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyTipoContratoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoContratoParameterReturnGeneral tipocontratoReturnGeneral=new TipoContratoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tipocontratoConstantesFunciones.cargarid_empresaTipoContrato)
					 || (this.esRecargarFks && this.tipocontratoConstantesFunciones.cargarid_empresaTipoContrato)) {

					if(!this.tipocontratoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tipocontratoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalFormato="";

				if(((this.formatosForeignKey==null||this.formatosForeignKey.size()<=0) && this.tipocontratoConstantesFunciones.cargarid_formatoTipoContrato)
					 || (this.esRecargarFks && this.tipocontratoConstantesFunciones.cargarid_formatoTipoContrato)) {

					if(!this.tipocontratoSessionBean.getisBusquedaDesdeForeignKeySesionFormato()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=FormatoConstantesFunciones.getArrayColumnasGlobalesFormato(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalFormato=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,FormatoConstantesFunciones.TABLENAME);

						finalQueryGlobalFormato=Funciones.GetFinalQueryAppend(finalQueryGlobalFormato, "");
						finalQueryGlobalFormato+=FormatoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosFormatosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalFormato=" WHERE " + ConstantesSql.ID + "="+tipocontratoSessionBean.getlidFormatoActual();
					}
				} else {
					finalQueryGlobalFormato="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipocontratoReturnGeneral=tipocontratoLogic.cargarCombosLoteForeignKeyTipoContrato(finalQueryGlobalEmpresa,finalQueryGlobalFormato);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tipocontratoReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalFormato.equals("NONE")) {
				this.formatosForeignKey=tipocontratoReturnGeneral.getformatosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoContrato()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyFormato();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tipocontratoSessionBean==null) {
				this.tipocontratoSessionBean=new TipoContratoSessionBean();
			}

			if(!this.tipocontratoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyFormato()throws Exception {
		try {

			if(!this.tipocontratoSessionBean.getisBusquedaDesdeForeignKeySesionFormato()) {
				Formato formato=new Formato();
				FormatoConstantesFunciones.setFormatoDescripcion(formato,Constantes.SMENSAJE_ESCOJA_OPCION);
				formato.setId(null);

				if(!FormatoConstantesFunciones.ExisteEnLista(this.formatosForeignKey,formato,true)) {

					this.formatosForeignKey.add(0,formato);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyTipoContrato()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoContrato(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoContrato()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoContrato();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoContrato(TipoContrato tipocontrato)throws Exception {	
		try {
			
			this.setActualFormatoForeignKey(tipocontrato.getid_formato(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoContrato(TipoContrato tipocontrato,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoContrato()throws Exception {	
		try {
			
			this.setActualFormatoForeignKey(this.tipocontratoConstantesFunciones.getid_formato(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoContrato()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoContrato()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoContrato()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoContrato()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoContrato()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameFormatosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoContrato(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameFormatosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoContrato()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoContrato.jComboBoxid_empresaTipoContrato!=null && this.jInternalFrameDetalleFormTipoContrato.jComboBoxid_empresaTipoContrato.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoContrato.jComboBoxid_empresaTipoContrato.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTipoContrato.jComboBoxid_formatoTipoContrato!=null && this.jInternalFrameDetalleFormTipoContrato.jComboBoxid_formatoTipoContrato.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoContrato.jComboBoxid_formatoTipoContrato.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




	
	

	public TipoContratoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoContratoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoContratoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipocontratoSessionBean=new TipoContratoSessionBean(); 
		this.tipocontratoConstantesFunciones=new TipoContratoConstantesFunciones(); 
		this.tipocontratoBean=new TipoContrato();//(this.tipocontratoConstantesFunciones); 		
		this.tipocontratoReturnGeneral=new TipoContratoParameterReturnGeneral(); 
		
		this.tipocontratoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipocontratoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoContratoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoContratoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoContratoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoContrato(true);
			
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
			
			this.tipocontratoConstantesFunciones=new TipoContratoConstantesFunciones(); 
			this.tipocontratoBean=new TipoContrato();//this.tipocontratoConstantesFunciones); 			
			this.tipocontratoReturnGeneral=new TipoContratoParameterReturnGeneral(); 
		
			TipoContratoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Contrato Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.tipocontrato=new TipoContrato();
			this.tipocontratos = new ArrayList<TipoContrato>();
			this.tipocontratosAux = new ArrayList<TipoContrato>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocontratoLogic=new TipoContratoLogic();
				this.tipocontratoLogic.getNewConnexionToDeep("");
			}
			
			//this.tipocontratoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipocontratoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoContrato);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoContrato!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoContrato);	
					}
					
					if(this.jInternalFrameImportacionTipoContrato!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoContrato);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoContrato!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoContrato);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoContrato!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoContrato);
				this.jInternalFrameDetalleFormTipoContrato.setVisible(false);
				this.jInternalFrameDetalleFormTipoContrato.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoContrato!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoContrato);
					this.jInternalFrameReporteDinamicoTipoContrato.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoContrato.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoContrato!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoContrato);
					this.jInternalFrameImportacionTipoContrato.setVisible(false);
					this.jInternalFrameImportacionTipoContrato.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoContrato!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoContrato);
					this.jInternalFrameOrderByTipoContrato.setVisible(false);
					this.jInternalFrameOrderByTipoContrato.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoContratoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoContratoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipocontratoReturnGeneral=new TipoContratoParameterReturnGeneral();
			
			this.tipocontratoParameterGeneral=new TipoContratoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipocontratoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipocontratoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoContratoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipocontratoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(DatoGeneralEmpleadoConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(EmpleadoConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoContratoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipocontratoSessionBean.getEsGuardarRelacionado(),this.tipocontratoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoContratoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipocontratoSessionBean.getEsGuardarRelacionado(),this.tipocontratoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoContrato=false;
			this.isVisibilidadCeldaDuplicarTipoContrato=true;
			this.isVisibilidadCeldaCopiarTipoContrato=true;
			this.isVisibilidadCeldaVerFormTipoContrato=true;
			this.isVisibilidadCeldaOrdenTipoContrato=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoContrato=false;
			this.isVisibilidadCeldaModificarTipoContrato=false;
			this.isVisibilidadCeldaActualizarTipoContrato=false;
			this.isVisibilidadCeldaEliminarTipoContrato=false;
			this.isVisibilidadCeldaCancelarTipoContrato=false;
			this.isVisibilidadCeldaGuardarTipoContrato=false;
			this.isVisibilidadCeldaGuardarCambiosTipoContrato=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdTipoContrato=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoContrato("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoContrato();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoContrato(false);
			
			this.setPermisosUsuarioTipoContrato();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipocontratoSessionBean.getEsGuardarRelacionado() 
				|| (this.tipocontratoSessionBean.getEsGuardarRelacionado() && this.tipocontratoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoContratoClasesRelacionadas();
			}
			
			if(this.tipocontratoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoContratoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoContratoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoContrato();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoContrato();
			}
			
			if(!this.isPermisoBusquedaTipoContrato) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoContrato.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipocontratoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoContrato,this.isPermisoPaginacionMedioTipoContrato,this.isPermisoPaginacionTodoTipoContrato);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoContratoConstantesFunciones.getTiposSeleccionarTipoContrato());
				
				this.tiposColumnasSelect=TipoContratoConstantesFunciones.getTiposSeleccionarTipoContrato(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoContrato();				
				//this.tiposRelacionesSelect=TipoContratoConstantesFunciones.getTiposRelacionesTipoContrato(true);
				
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
			//if(!this.tipocontratoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoContrato();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoContrato(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoContrato(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoContrato() ;
			
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
			
			
			this.datogeneralempleadoLogic=new DatoGeneralEmpleadoLogic();
			this.empleadoLogic=new EmpleadoLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.formatoLogic=new FormatoLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				tipocontratoImplementable= (TipoContratoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoContratoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipocontratoImplementableHome= (TipoContratoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoContratoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipocontratos= new ArrayList<TipoContrato>();
			this.tipocontratosEliminados= new ArrayList<TipoContrato>();
						
			this.isEsNuevoTipoContrato=false;
			this.esParaAccionDesdeFormularioTipoContrato=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.formatosForeignKey=new ArrayList<Formato>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoContrato(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoContrato();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipocontratoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoContratoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoContratoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoContrato("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoContrato(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoContrato!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoContrato();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoContrato();
			}
			
			TipoContratoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoContrato.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoContrato.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoContrato.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocontratoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoContrato(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoContrato: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocontratoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocontratoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoContrato() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(DatoGeneralEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(DatoGeneralEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(EmpleadoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(EmpleadoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoContrato")) {
				iIndex=this.jInternalFrameDetalleFormTipoContrato.jTabbedPaneRelacionesTipoContrato.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoContrato.jTabbedPaneRelacionesTipoContrato.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoContrato.getSelectedRow();	
				
				

				if(sTitle.equals("Dato General Empleados")) {
					if(!DatoGeneralEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoContrato();

						this.cargarParteTabPanelRelacionadaDatoGeneralEmpleado(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Empleados")) {
					if(!EmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoContrato();

						this.cargarParteTabPanelRelacionadaEmpleado(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoContrato();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaDatoGeneralEmpleado(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoContrato.cargarSessionConBeanSwingJInternalFrameDatoGeneralEmpleado(false,true,iIndex);
		this.jButtonDatoGeneralEmpleadoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaDatoGeneralEmpleado();

		//this.jTabbedPaneRelacionesTipoContrato.updateUI();
		//this.jTabbedPaneRelacionesTipoContrato.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoContrato.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaEmpleado(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoContrato.cargarSessionConBeanSwingJInternalFrameEmpleado(false,true,iIndex);
		this.jButtonEmpleadoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaEmpleado();

		//this.jTabbedPaneRelacionesTipoContrato.updateUI();
		//this.jTabbedPaneRelacionesTipoContrato.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoContrato.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("DatoGeneralEmpleado")) {
				int row=this.jTableDatosTipoContrato.getSelectedRow();
				jButtonDatoGeneralEmpleadoActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("Empleado")) {
				int row=this.jTableDatosTipoContrato.getSelectedRow();
				jButtonEmpleadoActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipocontratoSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Dato General Empleado")) {

					if(this.isTienePermisosDatoGeneralEmpleado && this.tipocontratoConstantesFunciones.mostrarDatoGeneralEmpleadoTipoContrato && !TipoContratoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Dato General Empleados"+"("+DatoGeneralEmpleadoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Dato General Empleados");

						if(tipocontratoConstantesFunciones.resaltarDatoGeneralEmpleadoTipoContrato!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipocontratoConstantesFunciones.resaltarDatoGeneralEmpleadoTipoContrato);
						}

						jmenuItem.setEnabled(this.tipocontratoConstantesFunciones.activarDatoGeneralEmpleadoTipoContrato);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"DatoGeneralEmpleado"));

						

						this.jInternalFrameDetalleFormTipoContrato.jmenuDetalleTipoContrato.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Empleado")) {

					if(this.isTienePermisosEmpleado && this.tipocontratoConstantesFunciones.mostrarEmpleadoTipoContrato && !TipoContratoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Empleados"+"("+EmpleadoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Empleados");

						if(tipocontratoConstantesFunciones.resaltarEmpleadoTipoContrato!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipocontratoConstantesFunciones.resaltarEmpleadoTipoContrato);
						}

						jmenuItem.setEnabled(this.tipocontratoConstantesFunciones.activarEmpleadoTipoContrato);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Empleado"));

						

						this.jInternalFrameDetalleFormTipoContrato.jmenuDetalleTipoContrato.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoContrato(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoContrato(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoContrato(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoContratoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoContrato();
		
		this.cargarCombosFrameForeignKeyTipoContrato();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoContrato();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoContrato();
		}
	}
	
	

	public void cargarCombosForeignKeyFormato(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyFormatoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyFormato();
				this.cargarCombosFrameFormatosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaFormato(this.formatosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoTipoContratoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipocontratoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoContrato==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoContratoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipocontrato,new Object(),this.tipocontratoParameterGeneral,this.tipocontratoReturnGeneral);
			
			
			if(jTableDatosTipoContrato.getRowCount()>=1) {
				jTableDatosTipoContrato.removeRowSelectionInterval(0, jTableDatosTipoContrato.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoContrato=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoContrato(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoContrato(true);			
			//this.tipocontrato=new TipoContrato();
			//this.tipocontrato.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoContrato(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoContrato() ;
			
			if(TipoContratoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoContrato(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipocontrato);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipocontrato);				
			
			TipoContratoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipocontrato,new Object(),this.tipocontratoParameterGeneral,this.tipocontratoReturnGeneral);
			
			if(this.tipocontratoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoContrato: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoContratoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipocontrato,new Object(),this.tipocontratoParameterGeneral,this.tipocontratoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoContratoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoContrato> tipocontratosSeleccionados=new ArrayList<TipoContrato>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoContrato.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoContrato.getSelectedRows().length;			
			}
			
			tipocontratosSeleccionados=this.getTipoContratosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoContrato--;			
				//TipoContrato tipocontratoAux= new TipoContrato();			
				//tipocontratoAux.setId(this.iIdNuevoTipoContrato);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoContrato tipocontratoOrigen=new TipoContrato();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoContrato tipocontratoOrigen : tipocontratosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoContrato.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipocontratoOrigen =(TipoContrato) this.tipocontratoLogic.getTipoContratos().toArray()[this.jTableDatosTipoContrato.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocontratoOrigen =(TipoContrato) this.tipocontratos.toArray()[this.jTableDatosTipoContrato.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoContrato();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipocontrato.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoContrato(tipocontratoOrigen,this.tipocontrato,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoContrato(this.tipocontrato);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipocontratoLogic.getTipoContratos().add(this.tipocontratoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipocontratos.add(this.tipocontratoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoContrato(false);
				
				this.jTableDatosTipoContrato.setRowSelectionInterval(this.getIndiceNuevoTipoContrato(), this.getIndiceNuevoTipoContrato());
				
				int iLastRow =  this.jTableDatosTipoContrato.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoContrato.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoContrato.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoContrato(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoContratoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoContrato> tipocontratosSeleccionados=new ArrayList<TipoContrato>();									
		
			TipoContrato tipocontratoOrigen=new TipoContrato();
			TipoContrato tipocontratoDestino=new TipoContrato();
				
			tipocontratosSeleccionados=this.getTipoContratosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoContrato.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipocontratosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoContrato.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocontratoOrigen =(TipoContrato) this.tipocontratoLogic.getTipoContratos().toArray()[this.jTableDatosTipoContrato.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipocontratoOrigen =(TipoContrato) this.tipocontratos.toArray()[this.jTableDatosTipoContrato.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocontratoDestino =(TipoContrato) this.tipocontratoLogic.getTipoContratos().toArray()[this.jTableDatosTipoContrato.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipocontratoDestino =(TipoContrato) this.tipocontratos.toArray()[this.jTableDatosTipoContrato.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipocontratoOrigen =tipocontratosSeleccionados.get(0);
				tipocontratoDestino =tipocontratosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoContrato(tipocontratoOrigen,tipocontratoDestino,true,false);
				
				tipocontratoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipocontratoDestino,tipocontratoLogic.getTipoContratos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocontratoDestino,tipocontratos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoContrato(false);
				
				//this.jTableDatosTipoContrato.setRowSelectionInterval(this.getIndiceNuevoTipoContrato(), this.getIndiceNuevoTipoContrato());
				
				int iLastRow =  this.jTableDatosTipoContrato.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoContrato.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoContrato.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoContrato(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoContratoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoContrato==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoContrato.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoContratoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoContrato.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoContrato.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoContrato.setVisible(!isVisible);
			this.jPanelPaginacionTipoContrato.setVisible(!isVisible);
			this.jPanelAccionesTipoContrato.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoContratoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoContrato();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoContratoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoContrato();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoContratoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoContrato();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoContratoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoContrato();
			
			this.abrirFrameOrderByTipoContrato();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoContratoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoContrato();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoContrato(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoContrato);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoContrato.isMaximum()) {
					this.jInternalFrameDetalleFormTipoContrato.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoContrato.setSize(this.jInternalFrameDetalleFormTipoContrato.iWidthFormulario,this.jInternalFrameDetalleFormTipoContrato.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoContrato.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoContrato.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoContrato.isMaximum()) {
						this.jInternalFrameDetalleFormTipoContrato.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoContrato.jContentPaneDetalleTipoContrato.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoContrato.jTabbedPaneRelacionesTipoContrato.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoContrato.jContentPaneDetalleTipoContrato.getWidth(),TipoContratoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoContrato.jTabbedPaneRelacionesTipoContrato.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoContrato.jContentPaneDetalleTipoContrato.getWidth(),TipoContratoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoContrato.jTabbedPaneRelacionesTipoContrato.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoContrato.jContentPaneDetalleTipoContrato.getWidth(),TipoContratoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(DatoGeneralEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaDatoGeneralEmpleado();
					}

					if(EmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaEmpleado();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoContrato.setVisible(true);
	        this.jInternalFrameDetalleFormTipoContrato.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoContrato() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoContrato==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoContrato=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoContrato,false,this);
				} else {
					this.jInternalFrameOrderByTipoContrato=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoContrato,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoContrato);
				this.jInternalFrameOrderByTipoContrato.setVisible(false);
				this.jInternalFrameOrderByTipoContrato.setSelected(false);
				
				this.jInternalFrameOrderByTipoContrato.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoContrato"));
				
				this.inicializarActualizarBindingTablaOrderByTipoContrato();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoContrato() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoContrato==null) {
				
				this.jInternalFrameImportacionTipoContrato=new ImportacionJInternalFrame(TipoContratoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoContrato);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoContrato);
				this.jInternalFrameImportacionTipoContrato.setVisible(false);
				this.jInternalFrameImportacionTipoContrato.setSelected(false);


				this.jInternalFrameImportacionTipoContrato.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoContrato"));
				this.jInternalFrameImportacionTipoContrato.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoContrato"));
				this.jInternalFrameImportacionTipoContrato.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoContrato"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoContrato() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoContrato==null) {
				this.jInternalFrameReporteDinamicoTipoContrato=new ReporteDinamicoJInternalFrame(TipoContratoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoContrato);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoContrato);
				this.jInternalFrameReporteDinamicoTipoContrato.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoContrato.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoContrato.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoContrato"));
				this.jInternalFrameReporteDinamicoTipoContrato.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoContrato"));
				this.jInternalFrameReporteDinamicoTipoContrato.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoContrato"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoContrato();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaDatoGeneralEmpleado() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFrame.jScrollPanelDatosDatoGeneralEmpleado.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoContrato.jContentPaneDetalleTipoContrato.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFrame.jScrollPanelDatosDatoGeneralEmpleado.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFrame.jScrollPanelDatosDatoGeneralEmpleado.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFrame.jScrollPanelDatosDatoGeneralEmpleado.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaEmpleado() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoContrato.jContentPaneDetalleTipoContrato.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoContrato() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoContrato);
			
	       	this.jInternalFrameDetalleFormTipoContrato.setVisible(false);
	        this.jInternalFrameDetalleFormTipoContrato.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoContrato.dispose();
			//this.jInternalFrameDetalleFormTipoContrato=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoContrato() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoContrato.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoContrato.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoContrato() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoContrato.setVisible(true);
	        this.jInternalFrameImportacionTipoContrato.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoContrato() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoContrato.setVisible(true);
	        this.jInternalFrameOrderByTipoContrato.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoContrato() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoContrato.setVisible(false);
	        this.jInternalFrameOrderByTipoContrato.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoContrato() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoContrato.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoContrato.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoContrato() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoContrato.setVisible(false);
	        this.jInternalFrameImportacionTipoContrato.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoContratoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoContrato(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoContrato(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoContrato.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoContrato(true);
			//this.isEsNuevoTipoContrato=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocontrato =(TipoContrato) this.tipocontratoLogic.getTipoContratos().toArray()[this.jTableDatosTipoContrato.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipocontrato =(TipoContrato) this.tipocontratos.toArray()[this.jTableDatosTipoContrato.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoContrato("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoContrato(false) ;
			
			if(tipocontratoSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoSessionBean.getEsGuardarRelacionado() && DatoGeneralEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDatoGeneralEmpleadoActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFrame.empleadoSessionBean.getEsGuardarRelacionado() && EmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonEmpleadoActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoContratoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoContrato(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoContrato(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoContratoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoContrato.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocontrato =(TipoContrato) this.tipocontratoLogic.getTipoContratos().toArray()[this.jTableDatosTipoContrato.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocontrato =(TipoContrato) this.tipocontratos.toArray()[this.jTableDatosTipoContrato.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoContrato(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoContrato==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoContrato.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoContrato(true);
			//this.isEsNuevoTipoContrato=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocontrato =(TipoContrato) this.tipocontratoLogic.getTipoContratos().toArray()[this.jTableDatosTipoContrato.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipocontrato =(TipoContrato) this.tipocontratos.toArray()[this.jTableDatosTipoContrato.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipocontrato.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoContrato("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoContrato(false) ;
			
			if(TipoContratoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoContrato(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoContrato(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaFormato(List<Formato> formatosForeignKey)throws Exception{
		TableColumn tableColumnFormato=this.jTableDatosTipoContrato.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoContrato,TipoContratoConstantesFunciones.LABEL_IDFORMATO));
		TableCellEditor tableCellEditorFormato =tableColumnFormato.getCellEditor();

		FormatoTableCell formatoTableCellFk=(FormatoTableCell)tableCellEditorFormato;

		if(formatoTableCellFk!=null) {
			formatoTableCellFk.setformatosForeignKey(formatosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTipoContrato.getSelectedRow();

		//if(intSelectedRow<=0) {
			//formatoTableCellFk.setRowActual(intSelectedRow);
			//formatoTableCellFk.setformatosForeignKeyActual(formatosForeignKey);
		//}


		if(formatoTableCellFk!=null) {
			formatoTableCellFk.RecargarFormatosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarTipoContratoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocontratoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoContrato(false);
			
			//if(!this.isEsNuevoTipoContrato) {								
				int intSelectedRow = this.jTableDatosTipoContrato.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocontrato =(TipoContrato) this.tipocontratoLogic.getTipoContratos().toArray()[this.jTableDatosTipoContrato.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipocontrato =(TipoContrato) this.tipocontratos.toArray()[this.jTableDatosTipoContrato.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoContratoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoContrato(this.tipocontrato,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoContrato(this.tipocontrato);
				
			}
			
			if(this.permiteMantenimiento(this.tipocontrato)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipocontratoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoContrato=true;
					this.inicializarActualizarBindingTablaTipoContrato(false);
					this.isEsNuevoTipoContrato=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoContrato=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoContrato=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoContrato(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoContrato(false);
				
				this.habilitarDeshabilitarControlesTipoContrato(false);
			
												
				
				if(TipoContratoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoContrato();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoContratoActionPerformed(evt,tipocontratoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoContrato(this.tipocontrato,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoContrato.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipocontratoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocontratoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipocontrato.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoContrato.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoContrato.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocontratoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocontratoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoContratoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocontratoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoContrato.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocontrato =(TipoContrato) this.tipocontratoLogic.getTipoContratos().toArray()[this.jTableDatosTipoContrato.convertRowIndexToModel(intSelectedRow)];
				this.tipocontrato.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipocontrato =(TipoContrato) this.tipocontratos.toArray()[this.jTableDatosTipoContrato.convertRowIndexToModel(intSelectedRow)];
				this.tipocontrato.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipocontrato)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipocontratoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoContratoModel) this.jTableDatosTipoContrato.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoContrato=true;
				this.inicializarActualizarBindingTablaTipoContrato(false);
				this.isEsNuevoTipoContrato=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoContrato(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoContrato(false);
				
				this.habilitarDeshabilitarControlesTipoContrato(false);
				
				
				
				if(TipoContratoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoContrato();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocontratoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocontratoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocontratoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoContratoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoContrato.getRowCount()>=1) {
				jTableDatosTipoContrato.removeRowSelectionInterval(0, jTableDatosTipoContrato.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoContrato(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoContrato(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoContrato(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoContrato(false) ;
			
			this.isEsNuevoTipoContrato=false;
			
			if(TipoContratoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoContrato();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoContratoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocontratoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoContrato(false);
				
				//SI ES MANUAL
				if(TipoContratoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoContrato();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocontratoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocontratoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocontratoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoContratoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoContrato--;			
			//TipoContrato tipocontratoAux= new TipoContrato();			
			//tipocontratoAux.setId(this.iIdNuevoTipoContrato);
			
			if(this.jInternalFrameDetalleFormTipoContrato==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoContrato();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoContrato(this.tipocontrato);
			
			this.tipocontrato.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipocontratoLogic.getTipoContratos().add(this.tipocontratoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipocontratos.add(this.tipocontratoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoContrato(false);
			
			this.jTableDatosTipoContrato.setRowSelectionInterval(this.getIndiceNuevoTipoContrato(), this.getIndiceNuevoTipoContrato());
			
			int iLastRow =  this.jTableDatosTipoContrato.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoContrato.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoContrato.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoContrato(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoContratoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocontratoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoContrato(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoContrato(false);
			
			//SI ES MANUAL
			if(TipoContratoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoContrato();
			}
			
			//this.abrirFrameTreeTipoContrato();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocontratoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocontratoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocontratoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoContratoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo ContratoS ?", "MANTENIMIENTO DE Tipo Contrato", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoContrato.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoContrato();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipocontratoReturnGeneral=tipocontratoLogic.procesarImportacionTipoContratosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipocontratoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoContratoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoContratoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoContrato.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoContrato.setFileImportacion(this.jInternalFrameImportacionTipoContrato.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoContrato.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoContrato.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoContrato.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoContrato.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoContratoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoContrato> tipocontratosSeleccionados=new ArrayList<TipoContrato>();		

		tipocontratosSeleccionados=this.getTipoContratosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoContrato.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoContrato.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoContratoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoContratoBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoContratos("Todos",tipocontratosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocontratoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Contrato",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoContrato.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoContrato.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoContratoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoContratoConstantesFunciones.LABEL_IDFORMATO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Formato_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Formato_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Formato_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Formato_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoContratoConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoContratoConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoContratoConstantesFunciones.LABEL_NUMERODIAS:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroDias_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroDias_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroDias_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroDias_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoTipoContrato.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoContrato.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoContrato.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoContratoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TipoContratoConstantesFunciones.LABEL_IDFORMATO:
					sNombreCampoCategoria="id_formato";
					break;

				case TipoContratoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoContratoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case TipoContratoConstantesFunciones.LABEL_NUMERODIAS:
					sNombreCampoCategoria="numero_dias";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoContrato.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoContratoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TipoContratoConstantesFunciones.LABEL_IDFORMATO:
					sNombreCampoCategoriaValor="id_formato";
					break;

				case TipoContratoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoContratoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case TipoContratoConstantesFunciones.LABEL_NUMERODIAS:
					sNombreCampoCategoriaValor="numero_dias";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoContrato.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoContrato.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoContratoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TipoContratoConstantesFunciones.LABEL_IDFORMATO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Formato",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_formato");
					break;

				case TipoContratoConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoContratoConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case TipoContratoConstantesFunciones.LABEL_NUMERODIAS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Dias",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_dias");
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoContratoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoContrato> tipocontratosSeleccionados=new ArrayList<TipoContrato>();		
		
		tipocontratosSeleccionados=this.getTipoContratosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocontrato";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoContratos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoContrato.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoContrato.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoContratoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoContratoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TipoContrato tipocontrato:tipocontratosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipocontrato.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoContratoConstantesFunciones.LABEL_IDFORMATO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoContratoConstantesFunciones.LABEL_IDFORMATO);
					iRow++;

					for(TipoContrato tipocontrato:tipocontratosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipocontrato.getformato_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoContratoConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoContratoConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoContrato tipocontrato:tipocontratosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipocontrato.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoContratoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoContratoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoContrato tipocontrato:tipocontratosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipocontrato.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoContratoConstantesFunciones.LABEL_NUMERODIAS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoContratoConstantesFunciones.LABEL_NUMERODIAS);
					iRow++;

					for(TipoContrato tipocontrato:tipocontratosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipocontrato.getnumero_dias());
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
			//	this.getFilaCabeceraExportarExcelTipoContrato(row);				
			//	iRow++;
			//}				
			
			//for(TipoContrato tipocontratoAux:tipocontratosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoContrato(tipocontratoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocontratoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Contrato",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipocontratoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoContrato(false);
			
			//SI ES MANUAL
			if(TipoContratoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoContrato();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocontratoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocontratoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocontratoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoContratoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocontratoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoContrato(false);
			
			//SI ES MANUAL
			if(TipoContratoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoContrato();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocontratoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocontratoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocontratoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoContratoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocontratoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoContrato(false);
			
			//SI ES MANUAL
			if(TipoContratoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoContrato();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocontratoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocontratoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocontratoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoContrato() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoContrato.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoContrato.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoContrato.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoContrato.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoContrato.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoContrato.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoContrato.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoContrato(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoContrato(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoContrato(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoContrato(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoContrato(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipocontratoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoContrato(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoContrato(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoContrato(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoContratoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoContratoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoContrato() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoContrato();
		
		this.inicializarActualizarBindingBotonesManualTipoContrato(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipocontratoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoContrato();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoContrato() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoContrato(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoContrato(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoContrato.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoContrato.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoContrato.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoContrato!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoContrato.jCheckBoxPostAccionNuevoTipoContrato.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoContrato.jCheckBoxPostAccionSinCerrarTipoContrato.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoContrato.jCheckBoxPostAccionSinMensajeTipoContrato.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoContrato.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoContrato.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoContrato.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoContrato!=null) {
				this.jInternalFrameDetalleFormTipoContrato.jCheckBoxPostAccionNuevoTipoContrato.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoContrato.jCheckBoxPostAccionSinCerrarTipoContrato.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoContrato.jCheckBoxPostAccionSinMensajeTipoContrato.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoContrato.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoContrato.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoContrato!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoContrato.jComboBoxTiposAccionesFormularioTipoContrato.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoContrato.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoContrato!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoContrato.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoContrato.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoContrato.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoContrato.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoContrato.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoContrato!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoContrato.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoContrato.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoContrato.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoContrato(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoContratoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoContrato(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoContrato() throws Exception {
		try	{
			if(TipoContratoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoContrato();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoContrato() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoContrato.jComboBoxTiposAccionesFormularioTipoContrato.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoContrato.jComboBoxTiposAccionesFormularioTipoContrato.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoContrato() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoContrato.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoContrato.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoContrato.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoContrato.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoContrato.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoContrato.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoContrato.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoContrato.addItem(reporte);
			}
			
			
			if(!this.tipocontratoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoContrato.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoContrato.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoContrato.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoContrato.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoContrato.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoContrato.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoContrato!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoContrato.jComboBoxTiposAccionesFormularioTipoContrato.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoContrato.jComboBoxTiposAccionesFormularioTipoContrato.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoContrato.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoContrato.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoContrato.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoContrato();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoContrato() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoContrato!=null) {
				this.jInternalFrameReporteDinamicoTipoContrato.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoContrato.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoContrato!=null) {
				this.jInternalFrameReporteDinamicoTipoContrato.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoContrato.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoContrato!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoContrato.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoContrato.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoContrato.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoContrato.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoContrato.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoContrato.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoContrato()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_formatoFK_IdTipoContratoTipoContrato.getSelectedItem()!=null){this.id_formatoFK_IdTipoContrato=((Formato)this.jComboBoxid_formatoFK_IdTipoContratoTipoContrato.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoContrato(Boolean esInicializar) throws Exception {				
		if(TipoContratoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoContrato();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoContrato() throws Exception {
		this.inicializarActualizarBindingTablaTipoContrato(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoContrato() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoContrato.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoContrato.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoContrato.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoContratoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoContrato.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoContrato.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoContratoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoContratoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoContratoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoContratoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoContrato.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoContrato.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoContratoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoContrato.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoContrato(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipocontratoLogic.getTipoContratos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipocontratos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoContratoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoContrato.setModel(new TipoContratoModel(this.tipocontratoLogic.getTipoContratos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoContrato.setModel(new TipoContratoModel(this.tipocontratos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoContrato!=null && this.jInternalFrameOrderByTipoContrato.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoContrato();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoContrato.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoContrato,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoContratoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoContratoConstantesFunciones.SCLASSWEBTITULO,tipocontratoConstantesFunciones.resaltarSeleccionarTipoContrato,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoContratoConstantesFunciones.SCLASSWEBTITULO,tipocontratoConstantesFunciones.resaltarSeleccionarTipoContrato,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoContrato.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoContrato,TipoContratoConstantesFunciones.LABEL_ID));

		if(this.tipocontratoConstantesFunciones.mostraridTipoContrato && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoContratoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipocontratoConstantesFunciones.resaltaridTipoContrato,this.tipocontratoConstantesFunciones.activaridTipoContrato,this,true,"idTipoContrato","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipocontratoConstantesFunciones.resaltaridTipoContrato,this.tipocontratoConstantesFunciones.activaridTipoContrato,this,true,"idTipoContrato","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoContrato.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoContrato,TipoContratoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tipocontratoConstantesFunciones.mostrarid_empresaTipoContrato && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoContratoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tipocontratoConstantesFunciones.resaltarid_empresaTipoContrato,this,this.tipocontratoConstantesFunciones.activarid_empresaTipoContrato));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tipocontratoConstantesFunciones.resaltarid_empresaTipoContrato,this,this.tipocontratoConstantesFunciones.activarid_empresaTipoContrato,false,"id_empresaTipoContrato","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoContratoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoContrato.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoContrato,TipoContratoConstantesFunciones.LABEL_IDFORMATO));

		if(this.tipocontratoConstantesFunciones.mostrarid_formatoTipoContrato && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoContratoConstantesFunciones.LABEL_IDFORMATO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new FormatoTableCell(this.formatosForeignKey,this.tipocontratoConstantesFunciones.resaltarid_formatoTipoContrato,this,this.tipocontratoConstantesFunciones.activarid_formatoTipoContrato));
			tableColumn.setCellEditor(new FormatoTableCell(this.formatosForeignKey,this.tipocontratoConstantesFunciones.resaltarid_formatoTipoContrato,this,this.tipocontratoConstantesFunciones.activarid_formatoTipoContrato,true,"id_formatoTipoContrato","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoContratoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoContrato.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoContrato,TipoContratoConstantesFunciones.LABEL_CODIGO));

		if(this.tipocontratoConstantesFunciones.mostrarcodigoTipoContrato && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoContratoConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipocontratoConstantesFunciones.resaltarcodigoTipoContrato,this.tipocontratoConstantesFunciones.activarcodigoTipoContrato,this,true,"codigoTipoContrato","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipocontratoConstantesFunciones.resaltarcodigoTipoContrato,this.tipocontratoConstantesFunciones.activarcodigoTipoContrato,this,true,"codigoTipoContrato","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoContratoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoContrato.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoContrato,TipoContratoConstantesFunciones.LABEL_NOMBRE));

		if(this.tipocontratoConstantesFunciones.mostrarnombreTipoContrato && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoContratoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipocontratoConstantesFunciones.resaltarnombreTipoContrato,this.tipocontratoConstantesFunciones.activarnombreTipoContrato,this,true,"nombreTipoContrato","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipocontratoConstantesFunciones.resaltarnombreTipoContrato,this.tipocontratoConstantesFunciones.activarnombreTipoContrato,this,true,"nombreTipoContrato","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoContratoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoContrato.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoContrato,TipoContratoConstantesFunciones.LABEL_NUMERODIAS));

		if(this.tipocontratoConstantesFunciones.mostrarnumero_diasTipoContrato && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoContratoConstantesFunciones.LABEL_NUMERODIAS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipocontratoConstantesFunciones.resaltarnumero_diasTipoContrato,this.tipocontratoConstantesFunciones.activarnumero_diasTipoContrato,this,true,"numero_diasTipoContrato","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipocontratoConstantesFunciones.resaltarnumero_diasTipoContrato,this.tipocontratoConstantesFunciones.activarnumero_diasTipoContrato,this,true,"numero_diasTipoContrato","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new TipoContratoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipocontratoSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosDatoGeneralEmpleado && this.tipocontratoConstantesFunciones.mostrarDatoGeneralEmpleadoTipoContrato && !TipoContratoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Dato General Empleados");
				tableColumn.setHeaderValue("Dato General Empleados");
				tableColumn.setCellRenderer(new DatoGeneralEmpleadoTableCell(tipocontratoConstantesFunciones.resaltarDatoGeneralEmpleadoTipoContrato,this,this.tipocontratoConstantesFunciones.activarDatoGeneralEmpleadoTipoContrato));
				tableColumn.setCellEditor(new DatoGeneralEmpleadoTableCell(tipocontratoConstantesFunciones.resaltarDatoGeneralEmpleadoTipoContrato,this,this.tipocontratoConstantesFunciones.activarDatoGeneralEmpleadoTipoContrato));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoContrato.addColumn(tableColumn);
			}

			if(this.isTienePermisosEmpleado && this.tipocontratoConstantesFunciones.mostrarEmpleadoTipoContrato && !TipoContratoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Empleados");
				tableColumn.setHeaderValue("Empleados");
				tableColumn.setCellRenderer(new EmpleadoTableCell(tipocontratoConstantesFunciones.resaltarEmpleadoTipoContrato,this,this.tipocontratoConstantesFunciones.activarEmpleadoTipoContrato));
				tableColumn.setCellEditor(new EmpleadoTableCell(tipocontratoConstantesFunciones.resaltarEmpleadoTipoContrato,this,this.tipocontratoConstantesFunciones.activarEmpleadoTipoContrato));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoContrato.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipocontratoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipocontratoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoContrato.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipocontratoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipocontratoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoContrato.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoContrato && this.isPermisoGuardarCambiosTipoContrato) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipocontratoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipocontratoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoContrato.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipocontratoSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosTipoContrato.addColumn(tableColumn);
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
			
			this.jTableDatosTipoContrato.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoContrato && this.isPermisoGuardarCambiosTipoContrato) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipocontratoSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoContrato && this.isPermisoGuardarCambiosTipoContrato) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoContrato.moveColumn(this.jTableDatosTipoContrato.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoContrato.moveColumn(this.jTableDatosTipoContrato.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipocontratoSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoContrato.moveColumn(this.jTableDatosTipoContrato.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoContrato.moveColumn(this.jTableDatosTipoContrato.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoContrato.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoContrato.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoContrato,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoContratoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoContrato.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoContrato.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoContratoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoContratoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoContrato.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoContrato.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoContrato.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipocontratoLogic.getTipoContratos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipocontratos.size()-1;
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
		//this.jTableDatosTipoContrato.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoContrato.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoContrato();
			
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
				
				//this.isEsNuevoTipoContrato=false;
					
				TipoContratoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipocontrato,new Object(),this.tipocontratoParameterGeneral,this.tipocontratoReturnGeneral);
			
				if(this.tipocontratoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoContrato==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoContrato.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoContrato.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocontrato =(TipoContrato) this.tipocontratoLogic.getTipoContratos().toArray()[this.jTableDatosTipoContrato.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocontrato =(TipoContrato) this.tipocontratos.toArray()[this.jTableDatosTipoContrato.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipocontrato.getsType().equals("DUPLICADO")
				   || this.tipocontrato.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoContrato=true;
				
				} else {
					this.isEsNuevoTipoContrato=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipocontratoSessionBean.getEsGuardarRelacionado()) {
					if(this.tipocontrato.getId()>=0 && !this.tipocontrato.getIsNew()) {						
						this.isEsNuevoTipoContrato=false;
						
					} else {
						this.isEsNuevoTipoContrato=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoContrato(esRelaciones);						
				
				this.seleccionarTipoContrato(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipocontrato.getId()<0) {
					this.isEsNuevoTipoContrato=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoContrato(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoContrato(evt,rowIndex);
				}	
				
				if(this.tipocontratoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoContrato: " + this.dDif); 
					}
				}								
				
				TipoContratoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipocontrato,new Object(),this.tipocontratoParameterGeneral,this.tipocontratoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoContrato(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipocontrato)) {
					if(this.tipocontrato.getId()>0) {
						this.tipocontrato.setIsDeleted(true);
						
						this.tipocontratosEliminados.add(this.tipocontrato);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipocontratoLogic.getTipoContratos().remove(this.tipocontrato);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipocontratos.remove(this.tipocontrato);				
					}
					
					
					((TipoContratoModel) this.jTableDatosTipoContrato.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoContrato(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoContrato(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoContrato) {
			
			if(this.jInternalFrameDetalleFormTipoContrato==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoContrato.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoContrato.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocontrato =(TipoContrato) this.tipocontratoLogic.getTipoContratos().toArray()[this.jTableDatosTipoContrato.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocontrato =(TipoContrato) this.tipocontratos.toArray()[this.jTableDatosTipoContrato.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoContratoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoContrato(this.tipocontrato);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tipocontratoConstantesFunciones.cargarid_empresaTipoContrato || this.tipocontratoConstantesFunciones.event_dependid_empresaTipoContrato) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tipocontrato.getid_empresa());
									//this.inicializarActualizarBindingTipoContrato(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tipocontrato.getEmpresa()!=null) {
							this.empresasForeignKey.add(tipocontrato.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tipocontrato.getid_empresa(),false,"Formulario");

					//Formato
					if(!this.tipocontratoConstantesFunciones.cargarid_formatoTipoContrato || this.tipocontratoConstantesFunciones.event_dependid_formatoTipoContrato) {
						//this.cargarCombosFormatosForeignKeyLista(" where id="+this.tipocontrato.getid_formato());
									//this.inicializarActualizarBindingTipoContrato(false,false);
						this.formatosForeignKey=new ArrayList<Formato>();

						if(tipocontrato.getFormato()!=null) {
							this.formatosForeignKey.add(tipocontrato.getFormato());
						}

						this.addItemDefectoCombosForeignKeyFormato();
						this.cargarCombosFrameFormatosForeignKey("Todos");
					}
					this.setActualFormatoForeignKey(this.tipocontrato.getid_formato(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoContrato("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoContrato(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoContrato() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoContrato(TipoContrato tipocontrato) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoContrato(tipocontrato,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoContrato(TipoContrato tipocontrato,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoContrato(tipocontrato);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoContrato(tipocontrato,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoContrato(tipocontrato);
	}
	
	public void setVariablesObjetoActualToFormularioTipoContrato(TipoContrato tipocontrato) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoContrato==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoContrato.jLabelidTipoContrato.setText(tipocontrato.getId().toString());
			this.jInternalFrameDetalleFormTipoContrato.jTextFieldcodigoTipoContrato.setText(tipocontrato.getcodigo());
			this.jInternalFrameDetalleFormTipoContrato.jTextAreanombreTipoContrato.setText(tipocontrato.getnombre());
			this.jInternalFrameDetalleFormTipoContrato.jTextFieldnumero_diasTipoContrato.setText(tipocontrato.getnumero_dias().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoContrato tipocontratoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipocontratoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoContrato tipocontratoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipocontratoLocal=this.tipocontrato;
			} else {
				tipocontratoLocal=this.tipocontratoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipocontratoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoContrato(tipocontratoLocal,true);
					
					if(tipocontratoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipocontratoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipocontratoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipocontratoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoContrato(TipoContrato tipocontrato,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoContrato(tipocontrato,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoContrato(tipocontrato);
	}
	
	public void setVariablesFormularioToObjetoActualTipoContrato(TipoContrato tipocontrato,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoContrato(tipocontrato,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoContrato(TipoContrato tipocontrato,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoContrato==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoContrato.jLabelidTipoContrato.getText()==null || this.jInternalFrameDetalleFormTipoContrato.jLabelidTipoContrato.getText()=="" || this.jInternalFrameDetalleFormTipoContrato.jLabelidTipoContrato.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoContrato.jLabelidTipoContrato.setText("0");
			}

			if(conColumnasBase) {tipocontrato.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoContrato.jLabelidTipoContrato.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoContratoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoContrato.jLabelIdTipoContrato,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipocontrato.setcodigo(this.jInternalFrameDetalleFormTipoContrato.jTextFieldcodigoTipoContrato.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoContratoConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoContrato.jLabelcodigoTipoContrato,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipocontrato.setnombre(this.jInternalFrameDetalleFormTipoContrato.jTextAreanombreTipoContrato.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoContratoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoContrato.jLabelnombreTipoContrato,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipocontrato.setnumero_dias(Integer.parseInt(this.jInternalFrameDetalleFormTipoContrato.jTextFieldnumero_diasTipoContrato.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoContratoConstantesFunciones.LABEL_NUMERODIAS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoContrato.jLabelnumero_diasTipoContrato,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoContrato(TipoContrato tipocontratoBean,TipoContrato tipocontrato,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && tipocontratoBean.getid_formato()!=null && !tipocontratoBean.getid_formato().equals(-1L))) {tipocontrato.setid_formato(tipocontratoBean.getid_formato());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoContrato(TipoContrato tipocontratoOrigen,TipoContrato tipocontrato,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipocontratoOrigen.getId()!=null && !tipocontratoOrigen.getId().equals(0L))) {tipocontrato.setId(tipocontratoOrigen.getId());}}
			if(conDefault || (!conDefault && tipocontratoOrigen.getid_formato()!=null && !tipocontratoOrigen.getid_formato().equals(-1L))) {tipocontrato.setid_formato(tipocontratoOrigen.getid_formato());}
			if(conDefault || (!conDefault && tipocontratoOrigen.getcodigo()!=null && !tipocontratoOrigen.getcodigo().equals(""))) {tipocontrato.setcodigo(tipocontratoOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipocontratoOrigen.getnombre()!=null && !tipocontratoOrigen.getnombre().equals(""))) {tipocontrato.setnombre(tipocontratoOrigen.getnombre());}
			if(conDefault || (!conDefault && tipocontratoOrigen.getnumero_dias()!=null && !tipocontratoOrigen.getnumero_dias().equals(0))) {tipocontrato.setnumero_dias(tipocontratoOrigen.getnumero_dias());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoContrato(TipoContrato tipocontrato) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoContrato.jLabelidTipoContrato.setText(tipocontrato.getId().toString());
			this.jInternalFrameDetalleFormTipoContrato.jTextFieldcodigoTipoContrato.setText(tipocontrato.getcodigo());
			this.jInternalFrameDetalleFormTipoContrato.jTextAreanombreTipoContrato.setText(tipocontrato.getnombre());
			this.jInternalFrameDetalleFormTipoContrato.jTextFieldnumero_diasTipoContrato.setText(tipocontrato.getnumero_dias().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoContrato(TipoContratoBean tipocontratoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoContrato.jLabelidTipoContrato.setText(tipocontratoBean.getId().toString());
			this.jInternalFrameDetalleFormTipoContrato.jTextFieldcodigoTipoContrato.setText(tipocontratoBean.getcodigo());
			this.jInternalFrameDetalleFormTipoContrato.jTextAreanombreTipoContrato.setText(tipocontratoBean.getnombre());
			this.jInternalFrameDetalleFormTipoContrato.jTextFieldnumero_diasTipoContrato.setText(tipocontratoBean.getnumero_dias().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoContrato(TipoContratoParameterReturnGeneral tipocontratoReturnGeneral,TipoContratoBean tipocontratoBean,Boolean conDefault) throws Exception { 
		try {
			TipoContrato tipocontratoLocal=new TipoContrato();
			
			tipocontratoLocal=tipocontratoReturnGeneral.getTipoContrato();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipocontratoLocal.getId()!=null && !tipocontratoLocal.getId().equals(0L))) {tipocontratoBean.setId(tipocontratoLocal.getId());}}
			if(conDefault || (!conDefault && tipocontratoLocal.getid_formato()!=null && !tipocontratoLocal.getid_formato().equals(-1L))) {tipocontratoBean.setid_formato(tipocontratoLocal.getid_formato());}
			if(conDefault || (!conDefault && tipocontratoLocal.getcodigo()!=null && !tipocontratoLocal.getcodigo().equals(""))) {tipocontratoBean.setcodigo(tipocontratoLocal.getcodigo());}
			if(conDefault || (!conDefault && tipocontratoLocal.getnombre()!=null && !tipocontratoLocal.getnombre().equals(""))) {tipocontratoBean.setnombre(tipocontratoLocal.getnombre());}
			if(conDefault || (!conDefault && tipocontratoLocal.getnumero_dias()!=null && !tipocontratoLocal.getnumero_dias().equals(0))) {tipocontratoBean.setnumero_dias(tipocontratoLocal.getnumero_dias());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoContratoGenerico(Long idTipoContratoSeleccionado,JComboBox jComboBoxTipoContrato,List<TipoContrato> tipocontratosLocal)throws Exception {
		try {
			TipoContrato  tipocontratoTemp=null;

			for(TipoContrato tipocontratoAux:tipocontratosLocal) {
				if(tipocontratoAux.getId()!=null && tipocontratoAux.getId().equals(idTipoContratoSeleccionado)) {
					tipocontratoTemp=tipocontratoAux;
					break;
				}
			}

			jComboBoxTipoContrato.setSelectedItem(tipocontratoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoContratoGenerico(JComboBox jComboBoxTipoContrato,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoContrato.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoContrato.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoContrato.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoContrato.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoContrato.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoContrato.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoContrato.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoContrato.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoContrato.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoContrato.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("DatoGeneralEmpleado")) {
			jButtonDatoGeneralEmpleadoActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("Empleado")) {
			jButtonEmpleadoActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipocontrato=(TipoContrato) tipocontratoLogic.getTipoContratos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipocontrato =(TipoContrato) tipocontratos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tipocontrato.getIsNew() && !tipocontrato.getIsChanged() && !tipocontrato.getIsDeleted()) {
				sDescripcion=tipocontrato.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tipocontrato.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Formato")) {
			//sDescripcion=this.getActualFormatoForeignKeyDescripcion((Long)value);
			if(!tipocontrato.getIsNew() && !tipocontrato.getIsChanged() && !tipocontrato.getIsDeleted()) {
				sDescripcion=tipocontrato.getformato_descripcion();
			} else {
				//sDescripcion=this.getActualFormatoForeignKeyDescripcion((Long)value);
				sDescripcion=tipocontrato.getformato_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoContrato tipocontratoRow=new TipoContrato();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipocontratoRow=(TipoContrato) tipocontratoLogic.getTipoContratos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipocontratoRow=(TipoContrato) tipocontratos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonDatoGeneralEmpleadoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoContrato tipocontrato) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoContrato==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocontratoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocontrato = (TipoContrato)this.tipocontratoLogic.getTipoContratos().toArray()[this.jTableDatosTipoContrato.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipocontrato = (TipoContrato)this.tipocontratos.toArray()[this.jTableDatosTipoContrato.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipocontrato!=null) {
						this.tipocontrato = tipocontrato;
					} else {
						this.tipocontrato = new TipoContrato();
					}
				}

				if(this.isTienePermisosDatoGeneralEmpleado && this.permiteMantenimiento(this.tipocontrato)) {
					DatoGeneralEmpleadoBeanSwingJInternalFrame datogeneralempleadoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFramePopup=new DatoGeneralEmpleadoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						datogeneralempleadoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFramePopup;
					} else {
						datogeneralempleadoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFrame;
					}

					List<TipoContrato> tipocontratos=new ArrayList<TipoContrato>();
					tipocontratos.add(this.tipocontrato);
					if(!esRelacionado) {
						//datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoSessionBean.setConGuardarRelaciones(false);
						//datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					datogeneralempleadoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoContrato.cargarDatoGeneralEmpleadoBeanSwingJInternalFrame(tipocontratos,this.tipocontrato,datogeneralempleadoBeanSwingJInternalFrame,/*conInicializar,*/datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoSessionBean.getConGuardarRelaciones(),datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoSessionBean.getEsGuardarRelacionado());
					datogeneralempleadoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						datogeneralempleadoBeanSwingJInternalFrame.actualizarEstadoPanelsDatoGeneralEmpleado("no_relacionado");

						datogeneralempleadoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(DatoGeneralEmpleadoConstantesFunciones.ITAMANIOFILATABLA + (DatoGeneralEmpleadoConstantesFunciones.ITAMANIOFILATABLA/2));

						datogeneralempleadoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoContrato=(TitledBorder)this.jScrollPanelDatosTipoContrato.getBorder();
						TitledBorder titledBorderDatoGeneralEmpleado=(TitledBorder)datogeneralempleadoBeanSwingJInternalFrame.jScrollPanelDatosDatoGeneralEmpleado.getBorder();

						titledBorderDatoGeneralEmpleado.setTitle(titledBorderTipoContrato.getTitle() + " -> Dato General Empleado");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,datogeneralempleadoBeanSwingJInternalFrame);
						}

						datogeneralempleadoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(datogeneralempleadoBeanSwingJInternalFrame);

						datogeneralempleadoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipocontratoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Dato General Empleado",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocontratoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocontratoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocontratoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonEmpleadoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoContrato tipocontrato) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoContrato==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocontratoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocontrato = (TipoContrato)this.tipocontratoLogic.getTipoContratos().toArray()[this.jTableDatosTipoContrato.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipocontrato = (TipoContrato)this.tipocontratos.toArray()[this.jTableDatosTipoContrato.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipocontrato!=null) {
						this.tipocontrato = tipocontrato;
					} else {
						this.tipocontrato = new TipoContrato();
					}
				}

				if(this.isTienePermisosEmpleado && this.permiteMantenimiento(this.tipocontrato)) {
					EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFramePopup=new EmpleadoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						empleadoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFramePopup;
					} else {
						empleadoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFrame;
					}

					List<TipoContrato> tipocontratos=new ArrayList<TipoContrato>();
					tipocontratos.add(this.tipocontrato);
					if(!esRelacionado) {
						//empleadoBeanSwingJInternalFrame.empleadoSessionBean.setConGuardarRelaciones(false);
						//empleadoBeanSwingJInternalFrame.empleadoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					empleadoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoContrato.cargarEmpleadoBeanSwingJInternalFrame(tipocontratos,this.tipocontrato,empleadoBeanSwingJInternalFrame,/*conInicializar,*/empleadoBeanSwingJInternalFrame.empleadoSessionBean.getConGuardarRelaciones(),empleadoBeanSwingJInternalFrame.empleadoSessionBean.getEsGuardarRelacionado());
					empleadoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						empleadoBeanSwingJInternalFrame.actualizarEstadoPanelsEmpleado("no_relacionado");

						empleadoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(EmpleadoConstantesFunciones.ITAMANIOFILATABLA + (EmpleadoConstantesFunciones.ITAMANIOFILATABLA/2));

						empleadoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoContrato=(TitledBorder)this.jScrollPanelDatosTipoContrato.getBorder();
						TitledBorder titledBorderEmpleado=(TitledBorder)empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

						titledBorderEmpleado.setTitle(titledBorderTipoContrato.getTitle() + " -> Empleado");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,empleadoBeanSwingJInternalFrame);
						}

						empleadoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(empleadoBeanSwingJInternalFrame);

						empleadoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipocontratoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Empleado",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocontratoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocontratoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocontratoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoContrato(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoContrato.setVisible((this.isVisibilidadCeldaNuevoTipoContrato && this.isPermisoNuevoTipoContrato));			
			this.jButtonDuplicarTipoContrato.setVisible((this.isVisibilidadCeldaDuplicarTipoContrato && this.isPermisoDuplicarTipoContrato));			
			this.jButtonCopiarTipoContrato.setVisible((this.isVisibilidadCeldaCopiarTipoContrato && this.isPermisoCopiarTipoContrato));
			this.jButtonVerFormTipoContrato.setVisible((this.isVisibilidadCeldaVerFormTipoContrato && this.isPermisoVerFormTipoContrato));
			
			this.jButtonAbrirOrderByTipoContrato.setVisible((this.isVisibilidadCeldaOrdenTipoContrato && this.isPermisoOrdenTipoContrato));			
			
			this.jButtonNuevoRelacionesTipoContrato.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoContrato && this.isPermisoNuevoTipoContrato));			
			this.jButtonNuevoGuardarCambiosTipoContrato.setVisible((this.isVisibilidadCeldaNuevoTipoContrato && this.isPermisoNuevoTipoContrato && this.isPermisoGuardarCambiosTipoContrato));
			
			if(this.jInternalFrameDetalleFormTipoContrato!=null) {
			this.jInternalFrameDetalleFormTipoContrato.jButtonModificarTipoContrato.setVisible((this.isVisibilidadCeldaModificarTipoContrato && this.isPermisoActualizarTipoContrato));	
			this.jInternalFrameDetalleFormTipoContrato.jButtonActualizarTipoContrato.setVisible((this.isVisibilidadCeldaActualizarTipoContrato && this.isPermisoActualizarTipoContrato));	
			this.jInternalFrameDetalleFormTipoContrato.jButtonEliminarTipoContrato.setVisible((this.isVisibilidadCeldaEliminarTipoContrato && this.isPermisoEliminarTipoContrato));
			this.jInternalFrameDetalleFormTipoContrato.jButtonCancelarTipoContrato.setVisible(this.isVisibilidadCeldaCancelarTipoContrato);							
			this.jInternalFrameDetalleFormTipoContrato.jButtonGuardarCambiosTipoContrato.setVisible((this.isVisibilidadCeldaGuardarTipoContrato && this.isPermisoGuardarCambiosTipoContrato));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoContrato.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoContrato && this.isPermisoGuardarCambiosTipoContrato));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoContrato.setVisible((this.isVisibilidadCeldaNuevoTipoContrato && this.isPermisoNuevoTipoContrato));						
			this.jButtonDuplicarToolBarTipoContrato.setVisible((this.isVisibilidadCeldaDuplicarTipoContrato && this.isPermisoDuplicarTipoContrato));						
			this.jButtonCopiarToolBarTipoContrato.setVisible((this.isVisibilidadCeldaCopiarTipoContrato && this.isPermisoCopiarTipoContrato));			
			this.jButtonVerFormToolBarTipoContrato.setVisible((this.isVisibilidadCeldaVerFormTipoContrato && this.isPermisoVerFormTipoContrato));			
			this.jButtonAbrirOrderByToolBarTipoContrato.setVisible((this.isVisibilidadCeldaOrdenTipoContrato && this.isPermisoOrdenTipoContrato));
			this.jButtonNuevoRelacionesToolBarTipoContrato.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoContrato && this.isPermisoNuevoTipoContrato));			
			this.jButtonNuevoGuardarCambiosToolBarTipoContrato.setVisible((this.isVisibilidadCeldaNuevoTipoContrato && this.isPermisoNuevoTipoContrato && this.isPermisoGuardarCambiosTipoContrato));			
			
			if(this.jInternalFrameDetalleFormTipoContrato!=null) {
			this.jInternalFrameDetalleFormTipoContrato.jButtonModificarToolBarTipoContrato.setVisible((this.isVisibilidadCeldaModificarTipoContrato && this.isPermisoActualizarTipoContrato));	
			this.jInternalFrameDetalleFormTipoContrato.jButtonActualizarToolBarTipoContrato.setVisible((this.isVisibilidadCeldaActualizarTipoContrato  && this.isPermisoActualizarTipoContrato));	
			this.jInternalFrameDetalleFormTipoContrato.jButtonEliminarToolBarTipoContrato.setVisible((this.isVisibilidadCeldaEliminarTipoContrato && this.isPermisoEliminarTipoContrato));
			this.jInternalFrameDetalleFormTipoContrato.jButtonCancelarToolBarTipoContrato.setVisible(this.isVisibilidadCeldaCancelarTipoContrato);				
			this.jInternalFrameDetalleFormTipoContrato.jButtonGuardarCambiosToolBarTipoContrato.setVisible((this.isVisibilidadCeldaGuardarTipoContrato && this.isPermisoGuardarCambiosTipoContrato));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoContrato.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoContrato && this.isPermisoGuardarCambiosTipoContrato));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoContrato.setVisible((this.isVisibilidadCeldaNuevoTipoContrato && this.isPermisoNuevoTipoContrato));			
			this.jMenuItemDuplicarTipoContrato.setVisible((this.isVisibilidadCeldaDuplicarTipoContrato && this.isPermisoDuplicarTipoContrato));			
			this.jMenuItemCopiarTipoContrato.setVisible((this.isVisibilidadCeldaCopiarTipoContrato && this.isPermisoCopiarTipoContrato));			
			this.jMenuItemVerFormTipoContrato.setVisible((this.isVisibilidadCeldaVerFormTipoContrato && this.isPermisoVerFormTipoContrato));			
			this.jMenuItemAbrirOrderByTipoContrato.setVisible((this.isVisibilidadCeldaOrdenTipoContrato && this.isPermisoOrdenTipoContrato));			
			//this.jMenuItemMostrarOcultarTipoContrato.setVisible((this.isVisibilidadCeldaOrdenTipoContrato && this.isPermisoOrdenTipoContrato));
			this.jMenuItemDetalleAbrirOrderByTipoContrato.setVisible((this.isVisibilidadCeldaOrdenTipoContrato && this.isPermisoOrdenTipoContrato));			
			//this.jMenuItemDetalleMostrarOcultarTipoContrato.setVisible((this.isVisibilidadCeldaOrdenTipoContrato && this.isPermisoOrdenTipoContrato));			
			this.jMenuItemNuevoRelacionesTipoContrato.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoContrato && this.isPermisoNuevoTipoContrato));			
			this.jMenuItemNuevoGuardarCambiosTipoContrato.setVisible((this.isVisibilidadCeldaNuevoTipoContrato && this.isPermisoNuevoTipoContrato && this.isPermisoGuardarCambiosTipoContrato));									
			
			if(this.jInternalFrameDetalleFormTipoContrato!=null) {
			this.jInternalFrameDetalleFormTipoContrato.jMenuItemModificarTipoContrato.setVisible((this.isVisibilidadCeldaModificarTipoContrato && this.isPermisoActualizarTipoContrato));	
			this.jInternalFrameDetalleFormTipoContrato.jMenuItemActualizarTipoContrato.setVisible((this.isVisibilidadCeldaActualizarTipoContrato && this.isPermisoActualizarTipoContrato));	
			this.jInternalFrameDetalleFormTipoContrato.jMenuItemEliminarTipoContrato.setVisible((this.isVisibilidadCeldaEliminarTipoContrato && this.isPermisoEliminarTipoContrato));
			this.jInternalFrameDetalleFormTipoContrato.jMenuItemCancelarTipoContrato.setVisible(this.isVisibilidadCeldaCancelarTipoContrato);				
			}
			
			this.jMenuItemGuardarCambiosTipoContrato.setVisible((this.isVisibilidadCeldaGuardarTipoContrato && this.isPermisoGuardarCambiosTipoContrato));						
			this.jMenuItemGuardarCambiosTablaTipoContrato.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoContrato && this.isPermisoGuardarCambiosTipoContrato));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoContrato=this.jButtonNuevoTipoContrato.isVisible();
			this.isVisibilidadCeldaDuplicarTipoContrato=this.jButtonDuplicarTipoContrato.isVisible();
			this.isVisibilidadCeldaCopiarTipoContrato=this.jButtonCopiarTipoContrato.isVisible();
			this.isVisibilidadCeldaVerFormTipoContrato=this.jButtonVerFormTipoContrato.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoContrato=this.jButtonAbrirOrderByTipoContrato.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoContrato=this.jButtonNuevoRelacionesTipoContrato.isVisible();
			this.isVisibilidadCeldaModificarTipoContrato=this.jButtonModificarTipoContrato.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoContrato!=null) {
			this.isVisibilidadCeldaActualizarTipoContrato=this.jInternalFrameDetalleFormTipoContrato.jButtonActualizarTipoContrato.isVisible();
			this.isVisibilidadCeldaEliminarTipoContrato=this.jInternalFrameDetalleFormTipoContrato.jButtonEliminarTipoContrato.isVisible();
			this.isVisibilidadCeldaCancelarTipoContrato=this.jInternalFrameDetalleFormTipoContrato.jButtonCancelarTipoContrato.isVisible();
			this.isVisibilidadCeldaGuardarTipoContrato=this.jInternalFrameDetalleFormTipoContrato.jButtonGuardarCambiosTipoContrato.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoContrato=this.jButtonGuardarCambiosTablaTipoContrato.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoContrato=this.jButtonNuevoToolBarTipoContrato.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoContrato=this.jButtonNuevoRelacionesToolBarTipoContrato.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoContrato!=null) {
			this.isVisibilidadCeldaModificarTipoContrato=this.jInternalFrameDetalleFormTipoContrato.jButtonModificarToolBarTipoContrato.isVisible();
			this.isVisibilidadCeldaActualizarTipoContrato=this.jInternalFrameDetalleFormTipoContrato.jButtonActualizarToolBarTipoContrato.isVisible();
			this.isVisibilidadCeldaEliminarTipoContrato=this.jInternalFrameDetalleFormTipoContrato.jButtonEliminarToolBarTipoContrato.isVisible();
			this.isVisibilidadCeldaCancelarTipoContrato=this.jInternalFrameDetalleFormTipoContrato.jButtonCancelarToolBarTipoContrato.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoContrato=this.jButtonGuardarCambiosToolBarTipoContrato.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoContrato=this.jButtonGuardarCambiosTablaToolBarTipoContrato.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoContrato=this.jMenuItemNuevoTipoContrato.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoContrato=this.jMenuItemNuevoRelacionesTipoContrato.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoContrato!=null) {
			this.isVisibilidadCeldaModificarTipoContrato=this.jInternalFrameDetalleFormTipoContrato.jMenuItemModificarTipoContrato.isVisible();
			this.isVisibilidadCeldaActualizarTipoContrato=this.jInternalFrameDetalleFormTipoContrato.jMenuItemActualizarTipoContrato.isVisible();
			this.isVisibilidadCeldaEliminarTipoContrato=this.jInternalFrameDetalleFormTipoContrato.jMenuItemEliminarTipoContrato.isVisible();
			this.isVisibilidadCeldaCancelarTipoContrato=this.jInternalFrameDetalleFormTipoContrato.jMenuItemCancelarTipoContrato.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoContrato=this.jMenuItemGuardarCambiosTipoContrato.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoContrato=this.jMenuItemGuardarCambiosTablaTipoContrato.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoContrato(Boolean esInicializar) {
		if(TipoContratoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipocontratoSessionBean.getConGuardarRelaciones()) {
				//if(this.tipocontratoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoContrato();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoContrato(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoContrato() {
		this.jButtonNuevoTipoContrato.setVisible(this.isPermisoNuevoTipoContrato);			
		this.jButtonDuplicarTipoContrato.setVisible(this.isPermisoDuplicarTipoContrato);			
		this.jButtonCopiarTipoContrato.setVisible(this.isPermisoCopiarTipoContrato);			
		this.jButtonVerFormTipoContrato.setVisible(this.isPermisoVerFormTipoContrato);			
		
		this.jButtonAbrirOrderByTipoContrato.setVisible(this.isPermisoOrdenTipoContrato);					
		
		this.jButtonNuevoRelacionesTipoContrato.setVisible(this.isPermisoNuevoTipoContrato);			
		
		if(this.jInternalFrameDetalleFormTipoContrato!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoContrato.jButtonModificarTipoContrato.setVisible(this.isPermisoActualizarTipoContrato);	
			this.jInternalFrameDetalleFormTipoContrato.jButtonActualizarTipoContrato.setVisible(this.isPermisoActualizarTipoContrato);	
			this.jInternalFrameDetalleFormTipoContrato.jButtonEliminarTipoContrato.setVisible(this.isPermisoEliminarTipoContrato);
			this.jInternalFrameDetalleFormTipoContrato.jButtonCancelarTipoContrato.setVisible(this.isVisibilidadCeldaCancelarTipoContrato);						
			this.jInternalFrameDetalleFormTipoContrato.jButtonGuardarCambiosTipoContrato.setVisible(this.isPermisoGuardarCambiosTipoContrato);							
		}
		
		this.jButtonGuardarCambiosTablaTipoContrato.setVisible(this.isPermisoActualizarTipoContrato);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoContrato() {
		this.jInternalFrameDetalleFormTipoContrato.jButtonModificarTipoContrato.setVisible(this.isPermisoActualizarTipoContrato);	
		this.jInternalFrameDetalleFormTipoContrato.jButtonActualizarTipoContrato.setVisible(this.isPermisoActualizarTipoContrato);	
		this.jInternalFrameDetalleFormTipoContrato.jButtonEliminarTipoContrato.setVisible(this.isPermisoEliminarTipoContrato);
		this.jInternalFrameDetalleFormTipoContrato.jButtonCancelarTipoContrato.setVisible(this.isVisibilidadCeldaCancelarTipoContrato);							
		this.jInternalFrameDetalleFormTipoContrato.jButtonGuardarCambiosTipoContrato.setVisible((this.isVisibilidadCeldaGuardarTipoContrato && this.isPermisoGuardarCambiosTipoContrato));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoContrato() {
		if(TipoContratoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoContrato();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoContrato() {
	}
	
	public void jTableDatosTipoContratoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoContrato(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoContratoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocontratoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoContrato.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoContrato(this.gettipocontrato(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoContrato(this.tipocontrato);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocontrato =(TipoContrato) this.tipocontratoLogic.getTipoContratos().toArray()[this.jTableDatosTipoContrato.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocontrato =(TipoContrato) this.tipocontratos.toArray()[this.jTableDatosTipoContrato.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocontrato==null) {
						this.tipocontrato = new TipoContrato();
					}

					this.setVariablesFormularioToObjetoActualTipoContrato(this.tipocontrato,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoContrato(this.tipocontrato);
				}

				if(this.tipocontrato.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipocontrato.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoContrato(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocontratoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocontratoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocontratoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTipoContratoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocontratoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTipoContrato(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoContrato.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoContrato.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoContrato.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocontrato =(TipoContrato) this.tipocontratoLogic.getTipoContratos().toArray()[this.jTableDatosTipoContrato.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipocontrato =(TipoContrato) this.tipocontratos.toArray()[this.jTableDatosTipoContrato.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoContrato(this.gettipocontrato(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoContrato(this.tipocontrato);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tipocontratoLogic.getConnexion());

				if(this.tipocontrato.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tipocontrato.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoContrato=(TitledBorder)this.jScrollPanelDatosTipoContrato.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTipoContrato.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocontratoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocontratoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocontratoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTipoContratoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocontratoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoContrato.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoContrato(this.gettipocontrato(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoContrato(this.tipocontrato);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocontrato =(TipoContrato) this.tipocontratoLogic.getTipoContratos().toArray()[this.jTableDatosTipoContrato.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocontrato =(TipoContrato) this.tipocontratos.toArray()[this.jTableDatosTipoContrato.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocontrato==null) {
						this.tipocontrato = new TipoContrato();
					}

					this.setVariablesFormularioToObjetoActualTipoContrato(this.tipocontrato,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoContrato(this.tipocontrato);
				}

				if(this.tipocontrato.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tipocontrato.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoContrato(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocontratoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocontratoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocontratoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_formatoTipoContratoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocontratoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoformato=true;

			idTienePermisoformato=this.tienePermisosUsuarioEnPaginaWebTipoContrato(FormatoConstantesFunciones.CLASSNAME);

			if(idTienePermisoformato) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoContrato.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoContrato.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoContrato.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocontrato =(TipoContrato) this.tipocontratoLogic.getTipoContratos().toArray()[this.jTableDatosTipoContrato.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipocontrato =(TipoContrato) this.tipocontratos.toArray()[this.jTableDatosTipoContrato.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoContrato(this.gettipocontrato(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoContrato(this.tipocontrato);

				this.formatoBeanSwingJInternalFrame=new FormatoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.formatoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.formatoBeanSwingJInternalFrame.getFormatoLogic().setConnexion(this.tipocontratoLogic.getConnexion());

				if(this.tipocontrato.getid_formato()!=null) {
					this.formatoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.formatoBeanSwingJInternalFrame.setIdActual(this.tipocontrato.getid_formato());
					this.formatoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.formatoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.formatoBeanSwingJInternalFrame.inicializarActualizarBindingTablaFormato();
				}

				JInternalFrameBase jinternalFrame =this.formatoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoContrato=(TitledBorder)this.jScrollPanelDatosTipoContrato.getBorder();
				TitledBorder titledBorderformato=(TitledBorder)this.formatoBeanSwingJInternalFrame.jScrollPanelDatosFormato.getBorder();

				titledBorderformato.setTitle(titledBorderTipoContrato.getTitle() + " -> Formato");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocontratoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocontratoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocontratoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_formatoTipoContratoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocontratoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoContrato.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoContrato(this.gettipocontrato(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoContrato(this.tipocontrato);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocontrato =(TipoContrato) this.tipocontratoLogic.getTipoContratos().toArray()[this.jTableDatosTipoContrato.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocontrato =(TipoContrato) this.tipocontratos.toArray()[this.jTableDatosTipoContrato.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocontrato==null) {
						this.tipocontrato = new TipoContrato();
					}

					this.setVariablesFormularioToObjetoActualTipoContrato(this.tipocontrato,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoContrato(this.tipocontrato);
				}

				if(this.tipocontrato.getid_formato()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_formato = "+this.tipocontrato.getid_formato().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoContrato(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocontratoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocontratoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocontratoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoContratoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocontratoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoContrato.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoContrato(this.gettipocontrato(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoContrato(this.tipocontrato);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocontrato =(TipoContrato) this.tipocontratoLogic.getTipoContratos().toArray()[this.jTableDatosTipoContrato.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocontrato =(TipoContrato) this.tipocontratos.toArray()[this.jTableDatosTipoContrato.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocontrato==null) {
						this.tipocontrato = new TipoContrato();
					}

					this.setVariablesFormularioToObjetoActualTipoContrato(this.tipocontrato,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoContrato(this.tipocontrato);
				}

				if(this.tipocontrato.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipocontrato.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoContrato(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocontratoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocontratoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocontratoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoContratoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocontratoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoContrato.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoContrato(this.gettipocontrato(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoContrato(this.tipocontrato);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocontrato =(TipoContrato) this.tipocontratoLogic.getTipoContratos().toArray()[this.jTableDatosTipoContrato.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocontrato =(TipoContrato) this.tipocontratos.toArray()[this.jTableDatosTipoContrato.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocontrato==null) {
						this.tipocontrato = new TipoContrato();
					}

					this.setVariablesFormularioToObjetoActualTipoContrato(this.tipocontrato,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoContrato(this.tipocontrato);
				}

				if(this.tipocontrato.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipocontrato.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoContrato(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocontratoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocontratoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocontratoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_diasTipoContratoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocontratoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoContrato.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoContrato(this.gettipocontrato(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoContrato(this.tipocontrato);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocontrato =(TipoContrato) this.tipocontratoLogic.getTipoContratos().toArray()[this.jTableDatosTipoContrato.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocontrato =(TipoContrato) this.tipocontratos.toArray()[this.jTableDatosTipoContrato.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocontrato==null) {
						this.tipocontrato = new TipoContrato();
					}

					this.setVariablesFormularioToObjetoActualTipoContrato(this.tipocontrato,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoContrato(this.tipocontrato);
				}

				if(this.tipocontrato.getnumero_dias()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_dias = "+this.tipocontrato.getnumero_dias().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoContrato(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocontratoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocontratoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocontratoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaTipoContratoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocontratoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoContrato(false,false);

			this.getTipoContratosFK_IdEmpresa();

			this.inicializarActualizarBindingTipoContrato(false);

			//if(TipoContratoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoContrato(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocontratoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocontratoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocontratoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoContratoTipoContratoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocontratoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoContrato(false,false);

			this.getTipoContratosFK_IdTipoContrato();

			this.inicializarActualizarBindingTipoContrato(false);

			//if(TipoContratoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoContrato(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocontratoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocontratoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocontratoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoContrato() {
		if(this.jInternalFrameDetalleFormTipoContrato!=null) {
		

		if(this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoContrato!=null) {
			this.jInternalFrameDetalleFormTipoContrato.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoContrato.dispose();
			this.jInternalFrameDetalleFormTipoContrato=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoContrato!=null) {
			this.jInternalFrameReporteDinamicoTipoContrato.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoContrato.dispose();
			this.jInternalFrameReporteDinamicoTipoContrato=null;
		}
		
		if(this.jInternalFrameImportacionTipoContrato!=null) {
			this.jInternalFrameImportacionTipoContrato.setVisible(false);	    			
			this.jInternalFrameImportacionTipoContrato.dispose();
			this.jInternalFrameImportacionTipoContrato=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoContrato();
			
			TipoContratoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocontrato,new Object(),this.tipocontratoParameterGeneral,this.tipocontratoReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoContrato")) {
				jButtonNuevoTipoContratoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoContrato")) {
				jButtonDuplicarTipoContratoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoContrato")) {
				jButtonCopiarTipoContratoActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoContrato")) {
				jButtonVerFormTipoContratoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoContrato")) {
				jButtonNuevoTipoContratoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoContrato")) {
				jButtonDuplicarTipoContratoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoContrato")) {
				jButtonNuevoTipoContratoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoContrato")) {
				jButtonDuplicarTipoContratoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoContrato")) {
				jButtonNuevoTipoContratoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoContrato")) {
				jButtonNuevoTipoContratoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoContrato")) {
				jButtonNuevoTipoContratoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoContrato")) {
				jButtonModificarTipoContratoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoContrato")) {
				jButtonModificarTipoContratoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoContrato")) {
				jButtonModificarTipoContratoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoContrato")) {
				jButtonActualizarTipoContratoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoContrato")) {
				jButtonActualizarTipoContratoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoContrato")) {
				jButtonActualizarTipoContratoActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoContrato")) {
				jButtonEliminarTipoContratoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoContrato")) {
				jButtonEliminarTipoContratoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoContrato")) {
				jButtonEliminarTipoContratoActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoContrato")) {
				jButtonCancelarTipoContratoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoContrato")) {
				jButtonCancelarTipoContratoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoContrato")) {
				jButtonCancelarTipoContratoActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoContrato")) {
				jButtonCerrarTipoContratoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoContrato")) {
				jButtonCerrarTipoContratoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoContrato")) {
				jButtonCerrarTipoContratoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoContrato")) {
				jButtonMostrarOcultarTipoContratoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoContrato")) {
				jButtonCancelarTipoContratoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoContrato")) {
				jButtonGuardarCambiosTipoContratoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoContrato")) {
				jButtonGuardarCambiosTipoContratoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoContrato")) {
				jButtonCopiarTipoContratoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoContrato")) {
				jButtonVerFormTipoContratoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoContrato")) {
				jButtonGuardarCambiosTipoContratoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoContrato")) {
				jButtonCopiarTipoContratoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoContrato")) {
				jButtonVerFormTipoContratoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoContrato")) {
				jButtonGuardarCambiosTipoContratoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoContrato")) {
				jButtonGuardarCambiosTipoContratoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoContrato")) {
				jButtonGuardarCambiosTipoContratoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoContrato")) {
				jButtonRecargarInformacionTipoContratoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoContrato")) {
				jButtonRecargarInformacionTipoContratoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoContrato")) {
				jButtonRecargarInformacionTipoContratoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoContrato")) {
				jButtonAnterioresTipoContratoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoContrato")) {
				jButtonAnterioresTipoContratoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoContrato")) {
				jButtonAnterioresTipoContratoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoContrato")) {
				jButtonSiguientesTipoContratoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoContrato")) {
				jButtonSiguientesTipoContratoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoContrato")) {
				jButtonSiguientesTipoContratoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoContrato") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoContrato")) {
				jButtonAbrirOrderByTipoContratoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoContrato") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoContrato")) {
				jButtonMostrarOcultarTipoContratoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoContrato")) {
				jButtonNuevoGuardarCambiosTipoContratoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoContrato")) {
				jButtonNuevoGuardarCambiosTipoContratoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoContrato")) {
				jButtonNuevoGuardarCambiosTipoContratoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoContrato")) {
				jButtonCerrarReporteDinamicoTipoContratoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoContrato")) {
				jButtonGenerarReporteDinamicoTipoContratoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoContrato")) {
				
				jButtonGenerarExcelReporteDinamicoTipoContratoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoContrato")) {
				jButtonCerrarImportacionTipoContratoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoContrato")) {
				
				jButtonGenerarImportacionTipoContratoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoContrato")) {
				
				jButtonAbrirImportacionTipoContratoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoContrato")) {
				jComboBoxTiposAccionesTipoContratoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoContrato")) {
				jComboBoxTiposRelacionesTipoContratoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoContrato")) {
				jComboBoxTiposAccionesTipoContratoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoContrato")) {
				
				jComboBoxTiposSeleccionarTipoContratoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoContrato")) {
				jTextFieldValorCampoGeneralTipoContratoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoContrato")) {
				jButtonAbrirOrderByTipoContratoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoContrato")) {
				jButtonAbrirOrderByTipoContratoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoContrato")) {
				jButtonCerrarOrderByTipoContratoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoContratoBusqueda")) {
				this.jButtonidTipoContratoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoContratoUpdate")) {
				this.jButtonid_empresaTipoContratoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoContratoBusqueda")) {
				this.jButtonid_empresaTipoContratoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_formatoTipoContratoUpdate")) {
				this.jButtonid_formatoTipoContratoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_formatoTipoContratoBusqueda")) {
				this.jButtonid_formatoTipoContratoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoContratoBusqueda")) {
				this.jButtoncodigoTipoContratoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoContratoBusqueda")) {
				this.jButtonnombreTipoContratoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_diasTipoContratoBusqueda")) {
				this.jButtonnumero_diasTipoContratoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdTipoContratoTipoContrato")) {
				this.jButtonFK_IdTipoContratoTipoContratoActionPerformed(evt);
			}
			
			;
			
			
			TipoContratoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocontrato,new Object(),this.tipocontratoParameterGeneral,this.tipocontratoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoContrato();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoContratoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocontrato);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocontrato);
				
				TipoContratoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocontrato,new Object(),this.tipocontratoParameterGeneral,this.tipocontratoReturnGeneral);
				
				


				
				TipoContratoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocontrato,new Object(),this.tipocontratoParameterGeneral,this.tipocontratoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoContrato.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoContrato.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoContrato tipocontratoLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipocontratoLocal=this.tipocontrato;
			} else {
				tipocontratoLocal=this.tipocontratoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocontrato);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocontrato);
				
				TipoContratoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocontrato,new Object(),this.tipocontratoParameterGeneral,this.tipocontratoReturnGeneral);
							
				
				


				
				TipoContratoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocontrato,new Object(),this.tipocontratoParameterGeneral,this.tipocontratoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoContrato.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoContrato.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoContratoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoContrato.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocontratoAnterior =(TipoContrato) this.tipocontratoLogic.getTipoContratos().toArray()[this.jTableDatosTipoContrato.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocontratoAnterior =(TipoContrato) this.tipocontratos.toArray()[this.jTableDatosTipoContrato.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
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
			
			TipoContratoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocontrato,new Object(),this.tipocontratoParameterGeneral,this.tipocontratoReturnGeneral);
			
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
			
			


			
			TipoContratoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocontrato,new Object(),this.tipocontratoParameterGeneral,this.tipocontratoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoContratoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocontrato);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocontrato);
				
				TipoContratoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocontrato,new Object(),this.tipocontratoParameterGeneral,this.tipocontratoReturnGeneral);
								
						
				


				
				TipoContratoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocontrato,new Object(),this.tipocontratoParameterGeneral,this.tipocontratoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoContrato.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoContrato.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocontrato);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocontrato);
				
				TipoContratoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocontrato,new Object(),this.tipocontratoParameterGeneral,this.tipocontratoReturnGeneral);
								
				
				


				
				TipoContratoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocontrato,new Object(),this.tipocontratoParameterGeneral,this.tipocontratoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoContrato.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoContrato.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoContratoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoContrato.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocontratoAnterior =(TipoContrato) this.tipocontratoLogic.getTipoContratos().toArray()[this.jTableDatosTipoContrato.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocontratoAnterior =(TipoContrato) this.tipocontratos.toArray()[this.jTableDatosTipoContrato.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocontrato);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocontrato);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoContratoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoContrato.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocontratoAnterior =(TipoContrato) this.tipocontratoLogic.getTipoContratos().toArray()[this.jTableDatosTipoContrato.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocontratoAnterior =(TipoContrato) this.tipocontratos.toArray()[this.jTableDatosTipoContrato.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoContratoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocontrato);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipocontrato);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocontrato);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocontrato);
				
				TipoContratoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocontrato,new Object(),this.tipocontratoParameterGeneral,this.tipocontratoReturnGeneral);
							
				
				


				
				TipoContratoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocontrato,new Object(),this.tipocontratoParameterGeneral,this.tipocontratoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoContrato.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoContrato.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoContratoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoContrato.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocontratoAnterior =(TipoContrato) this.tipocontratoLogic.getTipoContratos().toArray()[this.jTableDatosTipoContrato.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipocontratoAnterior =(TipoContrato) this.tipocontratos.toArray()[this.jTableDatosTipoContrato.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
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
			
			TipoContratoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocontrato,new Object(),this.tipocontratoParameterGeneral,this.tipocontratoReturnGeneral);
			
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
			
			


			
			TipoContratoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocontrato,new Object(),this.tipocontratoParameterGeneral,this.tipocontratoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoContratoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocontrato);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipocontrato);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocontrato);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocontrato);
				
				TipoContratoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocontrato,new Object(),this.tipocontratoParameterGeneral,this.tipocontratoReturnGeneral);
								
				
				


				
				TipoContratoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocontrato,new Object(),this.tipocontratoParameterGeneral,this.tipocontratoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoContrato.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoContrato.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoContratoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoContrato.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocontratoAnterior =(TipoContrato) this.tipocontratoLogic.getTipoContratos().toArray()[this.jTableDatosTipoContrato.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocontratoAnterior =(TipoContrato) this.tipocontratos.toArray()[this.jTableDatosTipoContrato.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoContratoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocontrato);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipocontrato);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoContratoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocontrato);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocontrato);
				
				TipoContratoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocontrato,new Object(),this.tipocontratoParameterGeneral,this.tipocontratoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoContrato")) {
					jCheckBoxSeleccionarTodosTipoContratoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoContrato")) {
					jCheckBoxSeleccionadosTipoContratoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoContrato")) {
					
				}
				
				


				
				
				TipoContratoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocontrato,new Object(),this.tipocontratoParameterGeneral,this.tipocontratoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoContrato.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoContrato.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocontrato);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipocontrato);
				
				TipoContratoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocontrato,new Object(),this.tipocontratoParameterGeneral,this.tipocontratoReturnGeneral);
												
				
				


				
				
				TipoContratoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocontrato,new Object(),this.tipocontratoParameterGeneral,this.tipocontratoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoContrato.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoContrato.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoContratoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoContrato.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocontratoAnterior =(TipoContrato) this.tipocontratoLogic.getTipoContratos().toArray()[this.jTableDatosTipoContrato.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipocontratoAnterior =(TipoContrato) this.tipocontratos.toArray()[this.jTableDatosTipoContrato.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoContratoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocontrato);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocontrato);
				
				TipoContratoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocontrato,new Object(),this.tipocontratoParameterGeneral,this.tipocontratoReturnGeneral);
				
				
				TipoContratoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocontrato,new Object(),this.tipocontratoParameterGeneral,this.tipocontratoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
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
			
			TipoContratoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipocontrato,new Object(),this.tipocontratoParameterGeneral,this.tipocontratoReturnGeneral);
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
			
			


			
			TipoContratoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocontrato,new Object(),this.tipocontratoParameterGeneral,this.tipocontratoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoContratoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocontrato);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocontrato);
				
				TipoContratoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipocontrato,new Object(),this.tipocontratoParameterGeneral,this.tipocontratoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoContratoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocontrato,new Object(),this.tipocontratoParameterGeneral,this.tipocontratoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoContrato.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoContrato.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocontrato);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocontrato);
				
				TipoContratoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipocontrato,new Object(),this.tipocontratoParameterGeneral,this.tipocontratoReturnGeneral);
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
				
				


				
				TipoContratoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocontrato,new Object(),this.tipocontratoParameterGeneral,this.tipocontratoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoContrato.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoContrato.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoContratoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoContrato.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocontratoAnterior =(TipoContrato) this.tipocontratoLogic.getTipoContratos().toArray()[this.jTableDatosTipoContrato.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocontratoAnterior =(TipoContrato) this.tipocontratos.toArray()[this.jTableDatosTipoContrato.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoContratoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocontrato,new Object(),this.tipocontratoParameterGeneral,this.tipocontratoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoContrato")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoContratoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoContrato.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipocontrato =(TipoContrato) this.tipocontratoLogic.getTipoContratos().toArray()[this.jTableDatosTipoContrato.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipocontrato =(TipoContrato) this.tipocontratos.toArray()[this.jTableDatosTipoContrato.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipocontrato);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoContrato")) {
				
				}
				
				TipoContratoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocontrato,new Object(),this.tipocontratoParameterGeneral,this.tipocontratoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoContratoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipocontrato,new Object(),this.tipocontratoParameterGeneral,this.tipocontratoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoContrato")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoContrato.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoContrato")) {
			
			}
			
			TipoContratoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipocontrato,new Object(),this.tipocontratoParameterGeneral,this.tipocontratoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoContrato();
			
			TipoContratoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocontrato,new Object(),this.tipocontratoParameterGeneral,this.tipocontratoReturnGeneral);
			
			if(sTipo.equals("NuevoTipoContrato")) {
				jButtonNuevoTipoContratoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoContrato")) {
				jButtonDuplicarTipoContratoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoContrato")) {
				jButtonCopiarTipoContratoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoContrato")) {
				jButtonVerFormTipoContratoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoContrato")) {
				jButtonNuevoTipoContratoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoContrato")) {
				jButtonModificarTipoContratoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoContrato")) {
				jButtonActualizarTipoContratoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoContrato")) {
				jButtonEliminarTipoContratoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoContrato")) {
				jButtonGuardarCambiosTipoContratoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoContrato")) {
				jButtonCancelarTipoContratoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoContrato")) {
				jButtonCerrarTipoContratoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoContrato")) {
				jButtonGuardarCambiosTipoContratoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoContrato")) {
				jButtonNuevoGuardarCambiosTipoContratoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoContrato")) {
				jButtonAbrirOrderByTipoContratoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoContrato")) {
				jButtonRecargarInformacionTipoContratoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoContrato")) {
				jButtonAnterioresTipoContratoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoContrato")) {
				jButtonSiguientesTipoContratoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoContratoBusqueda")) {
				this.jButtonidTipoContratoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoContratoUpdate")) {
				this.jButtonid_empresaTipoContratoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoContratoBusqueda")) {
				this.jButtonid_empresaTipoContratoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_formatoTipoContratoUpdate")) {
				this.jButtonid_formatoTipoContratoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_formatoTipoContratoBusqueda")) {
				this.jButtonid_formatoTipoContratoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoContratoBusqueda")) {
				this.jButtoncodigoTipoContratoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoContratoBusqueda")) {
				this.jButtonnombreTipoContratoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_diasTipoContratoBusqueda")) {
				this.jButtonnumero_diasTipoContratoBusquedaActionPerformed(evt);
			}
			
			TipoContratoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocontrato,new Object(),this.tipocontratoParameterGeneral,this.tipocontratoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoContrato();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoContratoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipocontrato,new Object(),this.tipocontratoParameterGeneral,this.tipocontratoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoContrato")) {
				closingInternalFrameTipoContrato();
				
			} else if(sTipo.equals("jButtonCancelarTipoContrato")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoContrato = (JInternalFrameBase)evt.getSource();
	            	
	            TipoContratoBeanSwingJInternalFrame jInternalFrameParent=(TipoContratoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoContrato.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoContratoActionPerformed(null);
			}
			
			TipoContratoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipocontrato,new Object(),this.tipocontratoParameterGeneral,this.tipocontratoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoContrato(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoContrato(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoContrato(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipocontrato)) {
			if(!esControlTabla) {
				if(TipoContratoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoContrato(this.tipocontrato,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoContrato(this.tipocontrato);			
				}
				
				if(this.tipocontratoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoContrato(this.tipocontrato,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipocontratoReturnGeneral=tipocontratoLogic.procesarEventosTipoContratosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocontratoLogic.getTipoContratos(),this.tipocontrato,this.tipocontratoParameterGeneral,this.isEsNuevoTipoContrato,classes);//this.tipocontratoLogic.getTipoContrato()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoContrato(this.tipocontratoReturnGeneral,this.tipocontratoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipocontratoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoContrato(classes,this.tipocontratoReturnGeneral,this.tipocontratoBean,false);
					}
						
					if(this.tipocontratoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoContrato(this.tipocontratoReturnGeneral.getTipoContrato());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoContrato(this.tipocontratoReturnGeneral.getTipoContrato());	
					}
						
					if(this.tipocontratoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoContrato(this.tipocontratoReturnGeneral.getTipoContrato(),classes);//this.tipocontratoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoContrato(this.tipocontrato,classes);//this.tipocontratoBean);									
				}
			
				if(TipoContratoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoContrato(this.tipocontrato,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoContrato(this.tipocontrato);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipocontratoAnterior!=null) {
						this.tipocontrato=this.tipocontratoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipocontratoReturnGeneral=tipocontratoLogic.procesarEventosTipoContratosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocontratoLogic.getTipoContratos(),this.tipocontrato,this.tipocontratoParameterGeneral,this.isEsNuevoTipoContrato,classes);//this.tipocontratoLogic.getTipoContrato()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipocontratoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipocontratoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipocontratoReturnGeneral.getTipoContrato(),tipocontratoLogic.getTipoContratos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipocontratoReturnGeneral.getTipoContrato(),this.tipocontratos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoContrato.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoContrato.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoContrato();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoContrato() throws Exception {
		
		TipoContratoModel tipocontratoModel=(TipoContratoModel)this.jTableDatosTipoContrato.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipocontratoModel.tipocontratos=this.tipocontratoLogic.getTipoContratos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipocontratoModel.tipocontratos=this.tipocontratos;
		}
		
		
		((TipoContratoModel) this.jTableDatosTipoContrato.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoContrato() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipocontratoAnterior(),this.tipocontratoLogic.getTipoContratos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipocontratoAnterior(),this.tipocontratos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoContrato();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoContrato(TipoContrato tipocontrato,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DatoGeneralEmpleado.class)) {
					this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.setDatoGeneralEmpleados(tipocontrato.getDatoGeneralEmpleados());
					this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDatoGeneralEmpleado(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Empleado.class)) {
					this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFrame.empleadoLogic.setEmpleados(tipocontrato.getEmpleados());
					this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
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
										
				TipoContratoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocontrato,new Object(),generalEntityParameterGeneral,this.tipocontratoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipocontratoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoContratoConstantesFunciones.getClassesRelationshipsOfTipoContrato(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoContratoConstantesFunciones.getClassesRelationshipsFromStringsOfTipoContrato(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoContrato(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoContratoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocontrato,new Object(),generalEntityParameterGeneral,this.tipocontratoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoContrato(TipoContratoBean tipocontratoBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DatoGeneralEmpleado.class)) {
					this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.setDatoGeneralEmpleados(tipocontrato.getDatoGeneralEmpleados());
					this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDatoGeneralEmpleado(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Empleado.class)) {
					this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFrame.empleadoLogic.setEmpleados(tipocontrato.getEmpleados());
					this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoContrato(ArrayList<Classe> classes,TipoContratoReturnGeneral tipocontratoReturnGeneral,TipoContratoBean tipocontratoBean,Boolean conDefault) throws Exception {
		
			this.tipocontratoBean.setDatoGeneralEmpleados(tipocontratoReturnGeneral.getTipoContrato().getDatoGeneralEmpleados());
			this.tipocontratoBean.setEmpleados(tipocontratoReturnGeneral.getTipoContrato().getEmpleados());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoContrato(TipoContrato tipocontrato,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(DatoGeneralEmpleado.class)) {
					tipocontrato.setDatoGeneralEmpleados(this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.getDatoGeneralEmpleados());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Empleado.class)) {
					tipocontrato.setEmpleados(this.jInternalFrameDetalleFormTipoContrato.empleadoBeanSwingJInternalFrame.empleadoLogic.getEmpleados());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tipocontrato)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoContrato = new TipoContratoDetalleFormJInternalFrame(jDesktopPane,this.tipocontratoSessionBean.getConGuardarRelaciones(),this.tipocontratoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoContrato);
		this.jInternalFrameDetalleFormTipoContrato.setVisible(false);
		this.jInternalFrameDetalleFormTipoContrato.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoContrato.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoContrato.tipocontratoLogic=this.tipocontratoLogic;
		
		this.cargarCombosFrameForeignKeyTipoContrato("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoContrato();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoContrato();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoContrato("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoContrato();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoContrato.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoContrato"));
		
		this.jInternalFrameDetalleFormTipoContrato.jButtonModificarTipoContrato.addActionListener(new ButtonActionListener(this,"ModificarTipoContrato"));

		
		this.jInternalFrameDetalleFormTipoContrato.jButtonModificarToolBarTipoContrato.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoContrato"));
					
		this.jInternalFrameDetalleFormTipoContrato.jMenuItemModificarTipoContrato.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoContrato"));		
		
		
		
		this.jInternalFrameDetalleFormTipoContrato.jButtonActualizarTipoContrato.addActionListener (new ButtonActionListener(this,"ActualizarTipoContrato"));
		
		
		this.jInternalFrameDetalleFormTipoContrato.jButtonActualizarToolBarTipoContrato.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoContrato"));
						
		this.jInternalFrameDetalleFormTipoContrato.jMenuItemActualizarTipoContrato.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoContrato"));		
		
		
		
		this.jInternalFrameDetalleFormTipoContrato.jButtonEliminarTipoContrato.addActionListener (new ButtonActionListener(this,"EliminarTipoContrato"));
		
		
		this.jInternalFrameDetalleFormTipoContrato.jButtonEliminarToolBarTipoContrato.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoContrato"));
								
		this.jInternalFrameDetalleFormTipoContrato.jMenuItemEliminarTipoContrato.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoContrato"));		
		
		
		
		this.jInternalFrameDetalleFormTipoContrato.jButtonCancelarTipoContrato.addActionListener (new ButtonActionListener(this,"CancelarTipoContrato"));
		
		
		this.jInternalFrameDetalleFormTipoContrato.jButtonCancelarToolBarTipoContrato.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoContrato"));
					
		this.jInternalFrameDetalleFormTipoContrato.jMenuItemCancelarTipoContrato.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoContrato"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoContrato.jMenuItemDetalleCerrarTipoContrato.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoContrato"));		
		
		
		
		this.jInternalFrameDetalleFormTipoContrato.jButtonGuardarCambiosToolBarTipoContrato.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoContrato"));
		
		
		
		this.jInternalFrameDetalleFormTipoContrato.jButtonGuardarCambiosToolBarTipoContrato.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoContrato"));
		
		
		
		this.jInternalFrameDetalleFormTipoContrato.jComboBoxTiposAccionesFormularioTipoContrato.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoContrato"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoContrato.jButtonidTipoContratoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoContratoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoContrato.jButtonid_empresaTipoContratoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoContratoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoContrato.jButtonid_empresaTipoContratoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoContratoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoContrato.jButtonid_formatoTipoContratoUpdate.addActionListener(new ButtonActionListener(this,"id_formatoTipoContratoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoContrato.jButtonid_formatoTipoContratoBusqueda.addActionListener(new ButtonActionListener(this,"id_formatoTipoContratoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoContrato.jButtoncodigoTipoContratoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoContratoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoContrato.jButtonnombreTipoContratoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoContratoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoContrato.jButtonnumero_diasTipoContratoBusqueda.addActionListener(new ButtonActionListener(this,"numero_diasTipoContratoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoContrato.jTabbedPaneRelacionesTipoContrato.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoContrato"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoContrato"));
		
		if(this.jInternalFrameDetalleFormTipoContrato!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoContrato.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoContrato"));
		}
		
		this.jTableDatosTipoContrato.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoContrato"));
		
		this.jTableDatosTipoContrato.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoContrato"));
		
		this.jButtonNuevoTipoContrato.addActionListener(new ButtonActionListener(this,"NuevoTipoContrato"));
		
		this.jButtonDuplicarTipoContrato.addActionListener(new ButtonActionListener(this,"DuplicarTipoContrato"));
		
		this.jButtonCopiarTipoContrato.addActionListener(new ButtonActionListener(this,"CopiarTipoContrato"));
		
		this.jButtonVerFormTipoContrato.addActionListener(new ButtonActionListener(this,"VerFormTipoContrato"));
		
		
		this.jButtonNuevoToolBarTipoContrato.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoContrato"));
			
		this.jButtonDuplicarToolBarTipoContrato.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoContrato"));
			
		this.jMenuItemNuevoTipoContrato.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoContrato"));
			
		this.jMenuItemDuplicarTipoContrato.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoContrato"));		
		
		
		this.jButtonNuevoRelacionesTipoContrato.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoContrato"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoContrato.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoContrato"));
			
		this.jMenuItemNuevoRelacionesTipoContrato.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoContrato"));		
		
		
		if(this.jInternalFrameDetalleFormTipoContrato!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoContrato.jButtonModificarTipoContrato.addActionListener(new ButtonActionListener(this,"ModificarTipoContrato"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoContrato!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoContrato.jButtonModificarToolBarTipoContrato.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoContrato"));
			
			this.jInternalFrameDetalleFormTipoContrato.jMenuItemModificarTipoContrato.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoContrato"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoContrato!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoContrato.jButtonActualizarTipoContrato.addActionListener (new ButtonActionListener(this,"ActualizarTipoContrato"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoContrato!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoContrato.jButtonActualizarToolBarTipoContrato.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoContrato"));
				
			this.jInternalFrameDetalleFormTipoContrato.jMenuItemActualizarTipoContrato.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoContrato"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoContrato!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoContrato.jButtonEliminarTipoContrato.addActionListener (new ButtonActionListener(this,"EliminarTipoContrato"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoContrato!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoContrato.jButtonEliminarToolBarTipoContrato.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoContrato"));
						
			this.jInternalFrameDetalleFormTipoContrato.jMenuItemEliminarTipoContrato.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoContrato"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoContrato!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoContrato.jButtonCancelarTipoContrato.addActionListener (new ButtonActionListener(this,"CancelarTipoContrato"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoContrato!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoContrato.jButtonCancelarToolBarTipoContrato.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoContrato"));
			
			this.jInternalFrameDetalleFormTipoContrato.jMenuItemCancelarTipoContrato.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoContrato"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoContrato.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoContrato"));		
		
		
		this.jButtonCerrarTipoContrato.addActionListener (new ButtonActionListener(this,"CerrarTipoContrato"));
		
		
		this.jButtonCerrarToolBarTipoContrato.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoContrato"));
			
		this.jMenuItemCerrarTipoContrato.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoContrato"));
			
		if(this.jInternalFrameDetalleFormTipoContrato!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoContrato.jMenuItemDetalleCerrarTipoContrato.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoContrato"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoContrato!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoContrato.jButtonGuardarCambiosTipoContrato.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoContrato"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoContrato!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoContrato.jButtonGuardarCambiosToolBarTipoContrato.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoContrato"));
		}
		
		this.jButtonCopiarToolBarTipoContrato.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoContrato"));
			
		this.jButtonVerFormToolBarTipoContrato.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoContrato"));
		
		this.jMenuItemGuardarCambiosTipoContrato.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoContrato"));
			
		this.jMenuItemCopiarTipoContrato.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoContrato"));		
		
		this.jMenuItemVerFormTipoContrato.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoContrato"));		
		
		
		this.jButtonGuardarCambiosTablaTipoContrato.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoContrato"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoContrato.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoContrato"));
			
		this.jMenuItemGuardarCambiosTablaTipoContrato.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoContrato"));		
		
		
		
		this.jButtonRecargarInformacionTipoContrato.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoContrato"));
					
		this.jButtonRecargarInformacionToolBarTipoContrato.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoContrato"));
		
		this.jMenuItemRecargarInformacionTipoContrato.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoContrato"));		
		
		
		
		this.jButtonAnterioresTipoContrato.addActionListener (new ButtonActionListener(this,"AnterioresTipoContrato"));
		
		
		this.jButtonAnterioresToolBarTipoContrato.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoContrato"));
		
		this.jMenuItemAnterioresTipoContrato.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoContrato"));		
		
		
		this.jButtonSiguientesTipoContrato.addActionListener (new ButtonActionListener(this,"SiguientesTipoContrato"));
		
		
		this.jButtonSiguientesToolBarTipoContrato.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoContrato"));
			
		this.jMenuItemSiguientesTipoContrato.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoContrato"));
			
		this.jMenuItemAbrirOrderByTipoContrato.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoContrato"));
			
		this.jMenuItemMostrarOcultarTipoContrato.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoContrato"));
			
		this.jMenuItemDetalleAbrirOrderByTipoContrato.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoContrato"));
			
		this.jMenuItemDetalleMostarOcultarTipoContrato.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoContrato"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoContrato.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoContrato"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoContrato.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoContrato"));
			
		this.jMenuItemNuevoGuardarCambiosTipoContrato.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoContrato"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoContrato.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoContrato"));

		this.jCheckBoxSeleccionadosTipoContrato.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoContrato"));
		
		if(this.jInternalFrameDetalleFormTipoContrato!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoContrato.jComboBoxTiposAccionesFormularioTipoContrato.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoContrato"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoContrato.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoContrato"));
			
		this.jComboBoxTiposAccionesTipoContrato.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoContrato"));
					
		this.jComboBoxTiposSeleccionarTipoContrato.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoContrato"));
			
		this.jTextFieldValorCampoGeneralTipoContrato.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoContrato"));		
		
		
		if(this.jInternalFrameDetalleFormTipoContrato!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoContrato.jButtonidTipoContratoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoContratoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoContrato.jButtonid_empresaTipoContratoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoContratoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoContrato.jButtonid_empresaTipoContratoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoContratoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoContrato.jButtonid_formatoTipoContratoUpdate.addActionListener(new ButtonActionListener(this,"id_formatoTipoContratoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoContrato.jButtonid_formatoTipoContratoBusqueda.addActionListener(new ButtonActionListener(this,"id_formatoTipoContratoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoContrato.jButtoncodigoTipoContratoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoContratoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoContrato.jButtonnombreTipoContratoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoContratoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoContrato.jButtonnumero_diasTipoContratoBusqueda.addActionListener(new ButtonActionListener(this,"numero_diasTipoContratoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdTipoContratoTipoContrato.addActionListener(new ButtonActionListener(this,"FK_IdTipoContratoTipoContrato"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoContrato!=null) {
				this.jInternalFrameReporteDinamicoTipoContrato.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoContrato"));
				this.jInternalFrameReporteDinamicoTipoContrato.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoContrato"));
				this.jInternalFrameReporteDinamicoTipoContrato.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoContrato"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoContrato.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoContrato"));				
			//this.jButtonGenerarReporteDinamicoTipoContrato.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoContrato"));
			//this.jButtonGenerarExcelReporteDinamicoTipoContrato.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoContrato"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoContrato!=null) {
				this.jInternalFrameImportacionTipoContrato.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoContrato"));
				this.jInternalFrameImportacionTipoContrato.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoContrato"));
				this.jInternalFrameImportacionTipoContrato.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoContrato"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoContrato.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoContrato"));
			
			this.jButtonAbrirOrderByToolBarTipoContrato.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoContrato"));			
			
			if(this.jInternalFrameOrderByTipoContrato!=null) {
				this.jInternalFrameOrderByTipoContrato.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoContrato"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoContrato!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoContrato!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoContrato.jTabbedPaneRelacionesTipoContrato.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoContrato"));
		
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
            		closingInternalFrameTipoContrato();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoContrato.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoContrato = (JInternalFrameBase)event.getSource();
	            	
	            TipoContratoBeanSwingJInternalFrame jInternalFrameParent=(TipoContratoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoContrato.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoContratoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoContrato.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoContratoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoContrato.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoContrato.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoContrato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoContratoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoContrato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoContratoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoContrato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoContratoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoContrato";
		inputMap = this.jButtonNuevoTipoContrato.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoContrato.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoContratoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoContrato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoContratoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoContrato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoContratoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoContrato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoContratoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoContrato";
		inputMap = this.jButtonNuevoRelacionesTipoContrato.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoContrato.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoContratoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoContrato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoContratoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoContrato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoContratoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoContrato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoContratoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoContrato";
		inputMap = this.jButtonModificarTipoContrato.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoContrato.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoContratoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoContrato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoContratoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoContrato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoContratoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoContrato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoContratoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoContrato";
		inputMap = this.jButtonActualizarTipoContrato.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoContrato.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoContratoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoContrato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoContratoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoContrato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoContratoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoContrato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoContratoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoContrato";
		inputMap = this.jButtonEliminarTipoContrato.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoContrato.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoContratoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoContrato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoContratoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoContrato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoContratoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoContrato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoContratoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoContrato";
		inputMap = this.jButtonCancelarTipoContrato.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoContrato.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoContratoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoContrato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoContratoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoContrato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoContratoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoContrato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoContratoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoContrato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoContratoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoContratoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoContrato";
		inputMap = this.jButtonCerrarTipoContrato.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoContrato.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoContratoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoContrato.jButtonGuardarCambiosTipoContrato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoContratoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoContrato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoContratoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoContrato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoContratoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoContrato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoContratoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoContrato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoContratoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoContrato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoContratoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoContrato";
		inputMap = this.jInternalFrameDetalleFormTipoContrato.jButtonGuardarCambiosTipoContrato.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoContrato.jButtonGuardarCambiosTipoContrato.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoContratoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoContrato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoContratoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoContrato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoContratoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoContrato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoContratoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoContrato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoContratoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoContrato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoContratoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoContrato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoContratoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoContrato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoContratoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoContrato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoContratoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoContrato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoContratoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoContrato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoContratoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoContrato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoContratoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoContrato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoContratoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoContrato.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoContratoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoContrato.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoContratoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoContrato.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoContratoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoContrato.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoContratoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoContrato.jButtonidTipoContratoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoContratoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoContrato.jButtonid_empresaTipoContratoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoContratoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoContrato.jButtonid_empresaTipoContratoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoContratoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoContrato.jButtonid_formatoTipoContratoUpdate.addActionListener(new ButtonActionListener(this,"id_formatoTipoContratoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoContrato.jButtonid_formatoTipoContratoBusqueda.addActionListener(new ButtonActionListener(this,"id_formatoTipoContratoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoContrato.jButtoncodigoTipoContratoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoContratoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoContrato.jButtonnombreTipoContratoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoContratoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoContrato.jButtonnumero_diasTipoContratoBusqueda.addActionListener(new ButtonActionListener(this,"numero_diasTipoContratoBusqueda"));
		
		
		this.jButtonFK_IdTipoContratoTipoContrato.addActionListener(new ButtonActionListener(this,"FK_IdTipoContratoTipoContrato"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoContrato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoContratoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoContrato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoContratoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoContrato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoContratoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoContrato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoContratoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoContrato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoContratoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoContrato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoContratoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoContratoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoContrato.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoContrato(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoContrato tipocontratoAux:this.tipocontratoLogic.getTipoContratos()) {
					tipocontratoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoContrato tipocontratoAux:tipocontratos) {
					tipocontratoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoContratoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoContrato(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoContrato tipocontratoAux:this.tipocontratoLogic.getTipoContratos()) {
						tipocontratoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoContrato tipocontratoAux:tipocontratos) {
						tipocontratoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoContrato tipocontratoAux:this.tipocontratoLogic.getTipoContratos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoContrato tipocontratoAux:tipocontratos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoContrato(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoContrato.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoContrato.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoContrato,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoContratoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoContrato(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoContrato.getSelectedRows();
			
			TipoContrato tipocontratoLocal=new TipoContrato();
			
			//this.seleccionarTodosTipoContrato(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocontratoLocal =(TipoContrato) this.tipocontratoLogic.getTipoContratos().toArray()[this.jTableDatosTipoContrato.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipocontratoLocal =(TipoContrato) this.tipocontratos.toArray()[this.jTableDatosTipoContrato.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipocontratoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoContrato tipocontratoAux:this.tipocontratoLogic.getTipoContratos()) {
						tipocontratoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoContrato tipocontratoAux:tipocontratos) {
						tipocontratoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoContrato(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoContrato.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoContrato.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoContrato,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoContratoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoContratoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoContratoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoContrato(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoContrato.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoContrato tipocontratoAux:this.tipocontratoLogic.getTipoContratos()) {
				
						if(sTipoSeleccionar.equals(TipoContratoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipocontratoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoContratoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipocontratoAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoContratoConstantesFunciones.LABEL_NUMERODIAS)) {
							existe=true;
							tipocontratoAux.setnumero_dias(Integer.parseInt(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoContrato tipocontratoAux:tipocontratos) {
					
						if(sTipoSeleccionar.equals(TipoContratoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipocontratoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoContratoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipocontratoAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoContratoConstantesFunciones.LABEL_NUMERODIAS)) {
							existe=true;
							tipocontratoAux.setnumero_dias(Integer.parseInt(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoContrato(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoContratoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoContrato(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoContrato=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoContrato.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoContrato.jComboBoxTiposAccionesFormularioTipoContrato.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoContrato) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoContrato(conSplash);
				
					this.generarReporteTipoContratosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoContrato.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoContrato.jComboBoxTiposAccionesFormularioTipoContrato.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoContratosSeleccionados();
				//this.jComboBoxTiposAccionesTipoContrato.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoContratosSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoContrato.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoContratosSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoContrato.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoContrato();
				
				this.exportarTipoContratosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoContrato.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoContrato.jComboBoxTiposAccionesFormularioTipoContrato.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoContratos();
				//this.importarTipoContratos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoContrato.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoContrato.jComboBoxTiposAccionesFormularioTipoContrato.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoContrato();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoContratosSeleccionados();
				//this.jComboBoxTiposAccionesTipoContrato.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Contrato", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoContrato();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoContrato)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoContrato(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Contrato",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoContrato.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoContrato.jComboBoxTiposAccionesFormularioTipoContrato.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoContratoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoContrato) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoContrato(conSplash);
					
						//this.actualizarParametrosGeneralTipoContrato();
						
						this.generarReporteProcesoAccionTipoContratosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoContrato.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoContrato.jComboBoxTiposAccionesFormularioTipoContrato.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoContratoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo ContratoS SELECCIONADOS?", "MANTENIMIENTO DE Tipo Contrato", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoContrato();
				
						this.actualizarParametrosGeneralTipoContrato();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tipocontratoReturnGeneral=tipocontratoLogic.procesarAccionTipoContratosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tipocontratoLogic.getTipoContratos(),this.tipocontratoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoContratoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoContrato.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoContrato.jComboBoxTiposAccionesFormularioTipoContrato.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoContrato();
					
					TipoContratoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoContratoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoContrato.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoContrato.jComboBoxTiposAccionesFormularioTipoContrato.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoContrato(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoContratoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoContrato();
			
			if(this.jInternalFrameDetalleFormTipoContrato==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoContrato> tipocontratosSeleccionados=new ArrayList<TipoContrato>();		
			TipoContrato tipocontrato=new TipoContrato();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoContrato(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoContrato.getSelectedItem();
			
			
			
			
			tipocontratosSeleccionados=this.getTipoContratosSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipocontratosSeleccionados.size()==1) {
				for(TipoContrato tipocontratoAux:tipocontratosSeleccionados) {
					tipocontrato=tipocontratoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Dato General Empleado")) {
					jButtonDatoGeneralEmpleadoActionPerformed(null,rowIndex,true,false,tipocontrato);
				}
				else if(this.sTipoRelacion.equals("Empleado")) {
					jButtonEmpleadoActionPerformed(null,rowIndex,true,false,tipocontrato);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoContrato();
			
      		//this.finishProcessTipoContrato(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoContratoReturnGeneral() throws Exception {
		if(this.tipocontratoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipocontratoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipocontratoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipocontratoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipocontratoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipocontratoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoContrato(false);
		}
		
		if(this.tipocontratoReturnGeneral.getConRetornoLista() || this.tipocontratoReturnGeneral.getConRetornoObjeto()) {
			if(this.tipocontratoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipocontratoLogic.setTipoContratos(this.tipocontratoReturnGeneral.getTipoContratos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipocontratoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipocontratoLogic.setTipoContrato(this.tipocontratoReturnGeneral.getTipoContrato());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoContrato(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoContrato() throws Exception {
		
		
	}
	
	public ArrayList<TipoContrato> getTipoContratosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoContrato> tipocontratosSeleccionados=new ArrayList<TipoContrato>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoContrato) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoContrato tipocontratoAux:tipocontratoLogic.getTipoContratos()) {
					if(tipocontratoAux.getIsSelected()) {
						tipocontratosSeleccionados.add(tipocontratoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoContrato tipocontratoAux:this.tipocontratos) {
					if(tipocontratoAux.getIsSelected()) {
						tipocontratosSeleccionados.add(tipocontratoAux);				
					}
				}
			}
			
			if(tipocontratosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipocontratosSeleccionados.addAll(this.tipocontratoLogic.getTipoContratos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipocontratosSeleccionados.addAll(this.tipocontratos);				
					}
				}
			}
		} else {
			tipocontratosSeleccionados.add(this.tipocontrato);
		}
		
		return tipocontratosSeleccionados;
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
	
	public void generarReporteTipoContratosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoContratosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoContratosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoContratosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoContratosSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoContratosSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Contrato",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoContratosSeleccionados() throws Exception {
		ArrayList<TipoContrato> tipocontratosSeleccionados=new ArrayList<TipoContrato>();		
		
		tipocontratosSeleccionados=this.getTipoContratosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoContratos("Todos",tipocontratosSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoContratosSeleccionados() throws Exception {
		ArrayList<TipoContrato> tipocontratosSeleccionados=new ArrayList<TipoContrato>();		
		
		tipocontratosSeleccionados=this.getTipoContratosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoContratos("Todos",tipocontratosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoContratosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoContrato> tipocontratosSeleccionados=new ArrayList<TipoContrato>();
		
		tipocontratosSeleccionados=this.getTipoContratosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoContratos("Todos",tipocontratosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoContratosSeleccionados() throws Exception {
		ArrayList<TipoContrato> tipocontratosSeleccionados=new ArrayList<TipoContrato>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoContrato();
		
		
		tipocontratosSeleccionados=this.getTipoContratosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoContrato();
		
		
		//this.generarReporteTipoContratos("Todos",tipocontratosSeleccionados ,tipocontratoImplementable,tipocontratoImplementableHome);
	}
	
	public void mostrarImportacionTipoContratos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoContrato();
		
		this.abrirFrameImportacionTipoContrato();		
		
			
		//this.generarReporteTipoContratos("Todos",tipocontratosSeleccionados ,tipocontratoImplementable,tipocontratoImplementableHome);
	}
	
	public void importarTipoContratos() throws Exception {		
	
	}
	
	public void exportarTipoContratosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoContratosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoContratosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoContratosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Contrato",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoContratosSeleccionados() throws Exception {
		ArrayList<TipoContrato> tipocontratosSeleccionados=new ArrayList<TipoContrato>();		
		
		tipocontratosSeleccionados=this.getTipoContratosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocontrato."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoContrato(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoContrato tipocontratoAux:tipocontratosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoContrato(tipocontratoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipocontratoAux.setsDetalleGeneralEntityReporte(tipocontratoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocontratoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Contrato",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoContrato(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoContratoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoContratoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoContratoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoContratoConstantesFunciones.LABEL_IDFORMATO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoContratoConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoContratoConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoContratoConstantesFunciones.LABEL_NUMERODIAS;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoContrato(TipoContrato tipocontrato,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipocontrato.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocontrato.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocontrato.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocontrato.getformato_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocontrato.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocontrato.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocontrato.getnumero_dias().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoContratosSeleccionados() throws Exception {
		ArrayList<TipoContrato> tipocontratosSeleccionados=new ArrayList<TipoContrato>();		
		
		tipocontratosSeleccionados=this.getTipoContratosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocontrato.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoContratos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoContrato(row);				
				iRow++;
			}				
			
			for(TipoContrato tipocontratoAux:tipocontratosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoContrato(tipocontratoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocontratoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Contrato",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoContratosSeleccionados() throws Exception {
		ArrayList<TipoContrato> tipocontratosSeleccionados=new ArrayList<TipoContrato>();		
		
		tipocontratosSeleccionados=this.getTipoContratosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocontrato.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipocontratos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipocontrato");
			//elementRoot.appendChild(element);
		
			for(TipoContrato tipocontratoAux:tipocontratosSeleccionados) {
				element = document.createElement("tipocontrato");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoContrato(tipocontratoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocontratoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Contrato",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoContrato(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoContratoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoContratoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoContratoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoContratoConstantesFunciones.LABEL_IDFORMATO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoContratoConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoContratoConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoContratoConstantesFunciones.LABEL_NUMERODIAS);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoContrato(TipoContrato tipocontrato,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipocontrato.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipocontrato.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipocontrato.getformato_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipocontrato.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipocontrato.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(tipocontrato.getnumero_dias());				
	}
	
	public void setFilaDatosExportarXmlTipoContrato(TipoContrato tipocontrato,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoContratoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipocontrato.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoContratoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipocontrato.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TipoContratoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tipocontrato.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementformato_descripcion = document.createElement(TipoContratoConstantesFunciones.IDFORMATO);
		elementformato_descripcion.appendChild(document.createTextNode(tipocontrato.getformato_descripcion()));
		element.appendChild(elementformato_descripcion);

		Element elementcodigo = document.createElement(TipoContratoConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipocontrato.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoContratoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipocontrato.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementnumero_dias = document.createElement(TipoContratoConstantesFunciones.NUMERODIAS);
		elementnumero_dias.appendChild(document.createTextNode(tipocontrato.getnumero_dias().toString().trim()));
		element.appendChild(elementnumero_dias);
	}
	
	public void generarReporteGroupGenericoTipoContratosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoContrato> tipocontratosSeleccionados=new ArrayList<TipoContrato>();
		
		tipocontratosSeleccionados=this.getTipoContratosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoContrato(tipocontratosSeleccionados);
		
		this.generarReporteTipoContratos("Todos",tipocontratosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoContrato(ArrayList<TipoContrato> tipocontratosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoContrato tipocontratoAux:tipocontratosSeleccionados) {
				tipocontratoAux.setsDetalleGeneralEntityReporte(tipocontratoAux.toString());
			
				if(sTipoSeleccionar.equals(TipoContratoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tipocontratoAux.setsDescripcionGeneralEntityReporte1(tipocontratoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoContratoConstantesFunciones.LABEL_IDFORMATO)) {
					existe=true;
					tipocontratoAux.setsDescripcionGeneralEntityReporte1(tipocontratoAux.getformato_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoContratoConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipocontratoAux.setsDescripcionGeneralEntityReporte1(tipocontratoAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoContratoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipocontratoAux.setsDescripcionGeneralEntityReporte1(tipocontratoAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(TipoContratoConstantesFunciones.LABEL_NUMERODIAS)) {
					existe=true;
					tipocontratoAux.setsDescripcionGeneralEntityReporte1(tipocontratoAux.getnumero_dias().toString());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoContratoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoContrato(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoContrato=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoContrato=true;
				this.isVisibilidadCeldaGuardarCambiosTipoContrato=true;
			}
			
			this.isVisibilidadCeldaModificarTipoContrato=false;
			this.isVisibilidadCeldaActualizarTipoContrato=false;
			this.isVisibilidadCeldaEliminarTipoContrato=false;
			this.isVisibilidadCeldaCancelarTipoContrato=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoContrato=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoContrato=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoContrato=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoContrato=false;
			this.isVisibilidadCeldaGuardarCambiosTipoContrato=false;
			this.isVisibilidadCeldaModificarTipoContrato=false;
			this.isVisibilidadCeldaActualizarTipoContrato=true;
			this.isVisibilidadCeldaEliminarTipoContrato=false;
			this.isVisibilidadCeldaCancelarTipoContrato=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoContrato=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoContrato=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoContrato=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoContrato=false;
			this.isVisibilidadCeldaGuardarCambiosTipoContrato=false;
			this.isVisibilidadCeldaModificarTipoContrato=false;
			this.isVisibilidadCeldaActualizarTipoContrato=true;
			this.isVisibilidadCeldaEliminarTipoContrato=true;
			this.isVisibilidadCeldaCancelarTipoContrato=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoContrato=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoContrato=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoContrato=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoContrato=false;
			this.isVisibilidadCeldaGuardarCambiosTipoContrato=false;
			this.isVisibilidadCeldaModificarTipoContrato=false;
			this.isVisibilidadCeldaActualizarTipoContrato=true;
			this.isVisibilidadCeldaEliminarTipoContrato=false;
			this.isVisibilidadCeldaCancelarTipoContrato=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoContrato=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoContrato=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoContrato=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoContrato=true;
			this.isVisibilidadCeldaGuardarCambiosTipoContrato=true;
			this.isVisibilidadCeldaModificarTipoContrato=false;
			this.isVisibilidadCeldaActualizarTipoContrato=false;
			this.isVisibilidadCeldaEliminarTipoContrato=false;
			this.isVisibilidadCeldaCancelarTipoContrato=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoContrato=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoContrato=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoContrato=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoContrato=false;
			this.isVisibilidadCeldaGuardarCambiosTipoContrato=false;
			this.isVisibilidadCeldaActualizarTipoContrato=false;
			this.isVisibilidadCeldaEliminarTipoContrato=false;
			this.isVisibilidadCeldaCancelarTipoContrato=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoContrato=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoContrato=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoContrato=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoContrato=false;
			this.isVisibilidadCeldaGuardarCambiosTipoContrato=false;
			this.isVisibilidadCeldaModificarTipoContrato=true;
			this.isVisibilidadCeldaActualizarTipoContrato=false;
			this.isVisibilidadCeldaEliminarTipoContrato=false;
			this.isVisibilidadCeldaCancelarTipoContrato=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoContrato=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoContrato=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoContratoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoContrato=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoContrato=true;
			this.isVisibilidadCeldaGuardarCambiosTipoContrato=true;
		} else {
			this.actualizarEstadoPanelsTipoContrato(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoContrato=false;
			//this.isVisibilidadCeldaVerFormTipoContrato=false;
			this.isVisibilidadCeldaDuplicarTipoContrato=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipocontratoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoContrato=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoContrato=false;
			this.isVisibilidadCeldaGuardarCambiosTipoContrato=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipocontratoSessionBean.getEsGuardarRelacionado()) {
			if(!tipocontratoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoContrato=false;												
			}
			
			this.jButtonCerrarTipoContrato.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoContrato=false;
		}
		
		if(!this.permiteMantenimiento(this.tipocontrato)) {
			this.isVisibilidadCeldaActualizarTipoContrato=false;
			this.isVisibilidadCeldaEliminarTipoContrato=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoContrato() {
		this.isVisibilidadCeldaNuevoTipoContrato=false;
		this.isVisibilidadCeldaGuardarCambiosTipoContrato=false;
	}
	
	public void actualizarEstadoPanelsTipoContrato(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoContrato!=null) {
				this.jScrollPanelDatosEdicionTipoContrato.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoContrato!=null) {
				this.jTabbedPaneBusquedasTipoContrato.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoContrato!=null) {
				this.jScrollPanelDatosTipoContrato.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoContrato!=null) {
				this.jPanelPaginacionTipoContrato.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoContrato!=null) {
				this.jPanelParametrosReportesTipoContrato.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoContrato!=null) {
				this.jScrollPanelDatosEdicionTipoContrato.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoContrato!=null) {
				this.jTabbedPaneBusquedasTipoContrato.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoContrato!=null) {
				this.jScrollPanelDatosTipoContrato.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoContrato!=null) {
				this.jPanelPaginacionTipoContrato.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoContrato!=null) {
				this.jPanelParametrosReportesTipoContrato.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoContrato!=null) {
				this.jScrollPanelDatosEdicionTipoContrato.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoContrato!=null) {
				this.jTabbedPaneBusquedasTipoContrato.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoContrato!=null) {
				this.jScrollPanelDatosTipoContrato.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoContrato!=null) {
				this.jPanelPaginacionTipoContrato.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoContrato!=null) {
				this.jPanelParametrosReportesTipoContrato.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoContrato!=null) {
				this.jScrollPanelDatosEdicionTipoContrato.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoContrato!=null) {
				this.jTabbedPaneBusquedasTipoContrato.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoContrato!=null) {
				this.jScrollPanelDatosTipoContrato.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoContrato!=null) {
				this.jPanelPaginacionTipoContrato.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoContrato!=null) {
				this.jPanelParametrosReportesTipoContrato.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoContrato!=null) {
				this.jScrollPanelDatosEdicionTipoContrato.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoContrato!=null) {
				this.jTabbedPaneBusquedasTipoContrato.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoContrato!=null) {
				this.jScrollPanelDatosTipoContrato.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoContrato!=null) {
				this.jPanelPaginacionTipoContrato.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoContrato!=null) {
				this.jPanelParametrosReportesTipoContrato.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoContrato!=null) {
				this.jScrollPanelDatosEdicionTipoContrato.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoContrato!=null) {
				this.jTabbedPaneBusquedasTipoContrato.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoContrato!=null) {
				this.jScrollPanelDatosTipoContrato.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoContrato!=null) {
				this.jPanelPaginacionTipoContrato.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoContrato!=null) {
				this.jPanelParametrosReportesTipoContrato.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoContrato!=null) {
				this.jScrollPanelDatosEdicionTipoContrato.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoContrato!=null) {
				this.jTabbedPaneBusquedasTipoContrato.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoContrato!=null) {
				this.jScrollPanelDatosTipoContrato.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoContrato!=null) {
				this.jPanelPaginacionTipoContrato.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoContrato!=null) {
				this.jPanelParametrosReportesTipoContrato.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipocontratoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoContrato!=null) {
					this.jTabbedPaneBusquedasTipoContrato.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoContrato!=null) {
				this.jPanelParametrosReportesTipoContrato.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipocontratoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoContrato!=null) {
				this.jTabbedPaneBusquedasTipoContrato.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoContrato!=null) {
				this.jPanelParametrosReportesTipoContrato.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdTipoContrato=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoContrato) {this.jTabbedPaneBusquedasTipoContrato.remove(jPanelFK_IdTipoContratoTipoContrato);}
		}
		
	}

	public void setVisibilidadBusquedasParaFormato(Boolean isParaFormato){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaFormatoNegation=!isParaFormato;

			this.isVisibilidadFK_IdTipoContrato=isParaFormato;
			if(!this.isVisibilidadFK_IdTipoContrato) {this.jTabbedPaneBusquedasTipoContrato.remove(jPanelFK_IdTipoContratoTipoContrato);}
		}
		
	}
	
	

	public String registrarSesionTipoContratoParaDatoGeneralEmpleados() throws Exception {
		Boolean isPaginaPopupDatoGeneralEmpleado=false;

		try {

			if(this.tipocontratoSessionBean==null) {
				this.tipocontratoSessionBean=new TipoContratoSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoSessionBean==null) {
				this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoSessionBean=new DatoGeneralEmpleadoSessionBean();
			}

			this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoSessionBean.setsPathNavegacionActual(tipocontratoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+DatoGeneralEmpleadoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupDatoGeneralEmpleado=this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeDatoGeneralEmpleado(true);
			this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeDatoGeneralEmpleado(TipoContratoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoSessionBean.setisBusquedaDesdeForeignKeySesionTipoContrato(true);
			this.jInternalFrameDetalleFormTipoContrato.datogeneralempleadoSessionBean.setlidTipoContratoActual(this.idTipoContratoActual);

			tipocontratoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoContrato(true);
			tipocontratoSessionBean.setlIdTipoContratoActualForeignKey(this.idTipoContratoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionTipoContratoParaEmpleados() throws Exception {
		Boolean isPaginaPopupEmpleado=false;

		try {

			if(this.tipocontratoSessionBean==null) {
				this.tipocontratoSessionBean=new TipoContratoSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoContrato.empleadoSessionBean==null) {
				this.jInternalFrameDetalleFormTipoContrato.empleadoSessionBean=new EmpleadoSessionBean();
			}

			this.jInternalFrameDetalleFormTipoContrato.empleadoSessionBean.setsPathNavegacionActual(tipocontratoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+EmpleadoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoContrato.empleadoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupEmpleado=this.jInternalFrameDetalleFormTipoContrato.empleadoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoContrato.empleadoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeEmpleado(true);
			this.jInternalFrameDetalleFormTipoContrato.empleadoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleado(TipoContratoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoContrato.empleadoSessionBean.setisBusquedaDesdeForeignKeySesionTipoContrato(true);
			this.jInternalFrameDetalleFormTipoContrato.empleadoSessionBean.setlidTipoContratoActual(this.idTipoContratoActual);

			tipocontratoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoContrato(true);
			tipocontratoSessionBean.setlIdTipoContratoActualForeignKey(this.idTipoContratoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoContratoSessionBean tipocontratoSessionBean=new TipoContratoSessionBean();
		
		if(this.tipocontratoSessionBean==null) {
			this.tipocontratoSessionBean=new TipoContratoSessionBean();
		}
		
		this.tipocontratoSessionBean.setsUltimaBusquedaTipoContrato(this.getsAccionBusqueda());
		this.tipocontratoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipocontratoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tipocontratoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoContrato")) {
			tipocontratoSessionBean.setid_formato(this.getid_formatoFK_IdTipoContrato());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoContratoSessionBean tipocontratoSessionBean=new TipoContratoSessionBean();
		
		if(this.tipocontratoSessionBean==null) {
			this.tipocontratoSessionBean=new TipoContratoSessionBean();
		}
		
		if(this.tipocontratoSessionBean.getsUltimaBusquedaTipoContrato()!=null&&!this.tipocontratoSessionBean.getsUltimaBusquedaTipoContrato().equals("")) {
			this.setsAccionBusqueda(tipocontratoSessionBean.getsUltimaBusquedaTipoContrato());
			this.setiNumeroPaginacion(tipocontratoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipocontratoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tipocontratoSessionBean.getid_empresa());
				tipocontratoSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoContrato")) {
				this.setid_formatoFK_IdTipoContrato(tipocontratoSessionBean.getid_formato());
				tipocontratoSessionBean.setid_formato(-1L);
			}
		}
		
		this.tipocontratoSessionBean.setsUltimaBusquedaTipoContrato("");
		this.tipocontratoSessionBean.setiNumeroPaginacion(TipoContratoConstantesFunciones.INUMEROPAGINACION);
		this.tipocontratoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoContrato(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoContrato() {
		this.updateBorderResaltarBusquedasFormularioTipoContrato();
		this.updateVisibilidadBusquedasFormularioTipoContrato();
		this.updateHabilitarBusquedasFormularioTipoContrato();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoContrato() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoContrato.getComponents().length>0) {
	

		if(this.tipocontratoConstantesFunciones.resaltarFK_IdTipoContratoTipoContrato!=null) {
			index= this.jTabbedPaneBusquedasTipoContrato.indexOfComponent(this.jPanelFK_IdTipoContratoTipoContrato);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoContrato.getComponent(index);
				jPanel.setBorder(this.tipocontratoConstantesFunciones.resaltarFK_IdTipoContratoTipoContrato);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoContrato() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoContrato.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoContrato.indexOfComponent(this.jPanelFK_IdTipoContratoTipoContrato);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoContrato.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipocontratoConstantesFunciones.mostrarFK_IdTipoContratoTipoContrato);
			if(!this.tipocontratoConstantesFunciones.mostrarFK_IdTipoContratoTipoContrato && index>-1) {
				this.jTabbedPaneBusquedasTipoContrato.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoContrato() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoContrato.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoContrato.indexOfComponent(this.jPanelFK_IdTipoContratoTipoContrato);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoContrato.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipocontratoConstantesFunciones.activarFK_IdTipoContratoTipoContrato);
				this.jTabbedPaneBusquedasTipoContrato.setEnabledAt(index,this.tipocontratoConstantesFunciones.activarFK_IdTipoContratoTipoContrato);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoContrato(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdTipoContrato")) {
			index= this.jTabbedPaneBusquedasTipoContrato.indexOfComponent(this.jPanelFK_IdTipoContratoTipoContrato);

			this.jTabbedPaneBusquedasTipoContrato.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoContrato.getComponent(index);

			this.tipocontratoConstantesFunciones.setResaltarFK_IdTipoContratoTipoContrato(resaltar);

			jPanel.setBorder(this.tipocontratoConstantesFunciones.resaltarFK_IdTipoContratoTipoContrato);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTipoContrato.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoContrato() throws Exception {

		if(this.jInternalFrameDetalleFormTipoContrato==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoContrato();
		this.updateVisibilidadResaltarControlesFormularioTipoContrato();
		this.updateHabilitarResaltarControlesFormularioTipoContrato();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoContrato() throws Exception {
		if(this.jInternalFrameDetalleFormTipoContrato==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipocontratoConstantesFunciones.resaltaridTipoContrato!=null && this.jInternalFrameDetalleFormTipoContrato!=null) {this.jInternalFrameDetalleFormTipoContrato.jLabelidTipoContrato.setBorder(this.tipocontratoConstantesFunciones.resaltaridTipoContrato);}
		if(this.tipocontratoConstantesFunciones.resaltarid_empresaTipoContrato!=null && this.jInternalFrameDetalleFormTipoContrato!=null) {this.jInternalFrameDetalleFormTipoContrato.jComboBoxid_empresaTipoContrato.setBorder(this.tipocontratoConstantesFunciones.resaltarid_empresaTipoContrato);}
		if(this.tipocontratoConstantesFunciones.resaltarid_formatoTipoContrato!=null && this.jInternalFrameDetalleFormTipoContrato!=null) {this.jInternalFrameDetalleFormTipoContrato.jComboBoxid_formatoTipoContrato.setBorder(this.tipocontratoConstantesFunciones.resaltarid_formatoTipoContrato);}
		if(this.tipocontratoConstantesFunciones.resaltarcodigoTipoContrato!=null && this.jInternalFrameDetalleFormTipoContrato!=null) {this.jInternalFrameDetalleFormTipoContrato.jTextFieldcodigoTipoContrato.setBorder(this.tipocontratoConstantesFunciones.resaltarcodigoTipoContrato);}
		if(this.tipocontratoConstantesFunciones.resaltarnombreTipoContrato!=null && this.jInternalFrameDetalleFormTipoContrato!=null) {this.jInternalFrameDetalleFormTipoContrato.jTextAreanombreTipoContrato.setBorder(this.tipocontratoConstantesFunciones.resaltarnombreTipoContrato);}
		if(this.tipocontratoConstantesFunciones.resaltarnumero_diasTipoContrato!=null && this.jInternalFrameDetalleFormTipoContrato!=null) {this.jInternalFrameDetalleFormTipoContrato.jTextFieldnumero_diasTipoContrato.setBorder(this.tipocontratoConstantesFunciones.resaltarnumero_diasTipoContrato);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoContrato() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoContrato==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoContrato!=null) {
	
		//this.jInternalFrameDetalleFormTipoContrato.jLabelidTipoContrato.setVisible(this.tipocontratoConstantesFunciones.mostraridTipoContrato);
		this.jInternalFrameDetalleFormTipoContrato.jPanelidTipoContrato.setVisible(this.tipocontratoConstantesFunciones.mostraridTipoContrato);
		//this.jInternalFrameDetalleFormTipoContrato.jComboBoxid_empresaTipoContrato.setVisible(this.tipocontratoConstantesFunciones.mostrarid_empresaTipoContrato);
		this.jInternalFrameDetalleFormTipoContrato.jPanelid_empresaTipoContrato.setVisible(this.tipocontratoConstantesFunciones.mostrarid_empresaTipoContrato);
		//this.jInternalFrameDetalleFormTipoContrato.jComboBoxid_formatoTipoContrato.setVisible(this.tipocontratoConstantesFunciones.mostrarid_formatoTipoContrato);
		this.jInternalFrameDetalleFormTipoContrato.jPanelid_formatoTipoContrato.setVisible(this.tipocontratoConstantesFunciones.mostrarid_formatoTipoContrato);
		//this.jInternalFrameDetalleFormTipoContrato.jTextFieldcodigoTipoContrato.setVisible(this.tipocontratoConstantesFunciones.mostrarcodigoTipoContrato);
		this.jInternalFrameDetalleFormTipoContrato.jPanelcodigoTipoContrato.setVisible(this.tipocontratoConstantesFunciones.mostrarcodigoTipoContrato);
		//this.jInternalFrameDetalleFormTipoContrato.jTextAreanombreTipoContrato.setVisible(this.tipocontratoConstantesFunciones.mostrarnombreTipoContrato);
		this.jInternalFrameDetalleFormTipoContrato.jPanelnombreTipoContrato.setVisible(this.tipocontratoConstantesFunciones.mostrarnombreTipoContrato);
		//this.jInternalFrameDetalleFormTipoContrato.jTextFieldnumero_diasTipoContrato.setVisible(this.tipocontratoConstantesFunciones.mostrarnumero_diasTipoContrato);
		this.jInternalFrameDetalleFormTipoContrato.jPanelnumero_diasTipoContrato.setVisible(this.tipocontratoConstantesFunciones.mostrarnumero_diasTipoContrato);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoContrato() throws Exception {
		if(this.jInternalFrameDetalleFormTipoContrato==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoContrato!=null) {
	
		this.jInternalFrameDetalleFormTipoContrato.jLabelidTipoContrato.setEnabled(this.tipocontratoConstantesFunciones.activaridTipoContrato);
		this.jInternalFrameDetalleFormTipoContrato.jComboBoxid_empresaTipoContrato.setEnabled(this.tipocontratoConstantesFunciones.activarid_empresaTipoContrato);
		this.jInternalFrameDetalleFormTipoContrato.jComboBoxid_formatoTipoContrato.setEnabled(this.tipocontratoConstantesFunciones.activarid_formatoTipoContrato);
		this.jInternalFrameDetalleFormTipoContrato.jTextFieldcodigoTipoContrato.setEnabled(this.tipocontratoConstantesFunciones.activarcodigoTipoContrato);
		this.jInternalFrameDetalleFormTipoContrato.jTextAreanombreTipoContrato.setEnabled(this.tipocontratoConstantesFunciones.activarnombreTipoContrato);
		this.jInternalFrameDetalleFormTipoContrato.jTextFieldnumero_diasTipoContrato.setEnabled(this.tipocontratoConstantesFunciones.activarnumero_diasTipoContrato);
		}
	}
	
		
}