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

import com.bydan.erp.nomina.util.TipoInstitucionConstantesFunciones;
import com.bydan.erp.nomina.util.TipoInstitucionParameterReturnGeneral;
//import com.bydan.erp.nomina.util.TipoInstitucionParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.TipoInstitucionBean;
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

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.nomina.business.entity.*;
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
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TipoInstitucionBeanSwingJInternalFrame extends TipoInstitucionJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoInstitucionBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoInstitucion> tipoinstitucionValidator = new ClassValidator<TipoInstitucion>(TipoInstitucion.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoInstitucion tipoinstitucion;	
	public TipoInstitucion tipoinstitucionAux;
	public TipoInstitucion tipoinstitucionAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoInstitucion tipoinstitucionTotales;
	public Long idTipoInstitucionActual;
	public Long iIdNuevoTipoInstitucion=0L;
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

		
	
	
	
	
	

	public Boolean isTienePermisosCurso=false;

	public Boolean getIsTienePermisosCurso() {
		return isTienePermisosCurso;
	}

	public void setIsTienePermisosCurso(Boolean isTienePermisosCurso) {
		this.isTienePermisosCurso= isTienePermisosCurso;
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
	
	public Boolean isPermisoTodoTipoInstitucion;
	public Boolean isPermisoNuevoTipoInstitucion;
	public Boolean isPermisoActualizarTipoInstitucion;
	public Boolean isPermisoActualizarOriginalTipoInstitucion;
	public Boolean isPermisoEliminarTipoInstitucion;
	public Boolean isPermisoGuardarCambiosTipoInstitucion;
	public Boolean isPermisoConsultaTipoInstitucion;
	public Boolean isPermisoBusquedaTipoInstitucion;
	public Boolean isPermisoReporteTipoInstitucion;
	public Boolean isPermisoPaginacionMedioTipoInstitucion;
	public Boolean isPermisoPaginacionAltoTipoInstitucion;
	public Boolean isPermisoPaginacionTodoTipoInstitucion;
	public Boolean isPermisoCopiarTipoInstitucion;
	public Boolean isPermisoVerFormTipoInstitucion;
	public Boolean isPermisoDuplicarTipoInstitucion;
	public Boolean isPermisoOrdenTipoInstitucion;
	
	
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
	
	public TipoInstitucionParameterReturnGeneral tipoinstitucionReturnGeneral;
	public TipoInstitucionParameterReturnGeneral tipoinstitucionParameterGeneral;
	
	

	public CursoLogic cursoLogic=null;

	public CursoLogic getCursoLogic() {
		return cursoLogic;
	}

	public void setCursoLogic(CursoLogic cursoLogic) {
		this.cursoLogic = cursoLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoInstitucion=false;
	public Boolean esParaAccionDesdeFormularioTipoInstitucion=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoInstitucionLogic tipoinstitucionLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoInstitucion tipoinstitucionBean;
	public TipoInstitucionConstantesFunciones tipoinstitucionConstantesFunciones;
	//public TipoInstitucionParameterReturnGeneral tipoinstitucionReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<TipoInstitucion> tipoinstitucions;	
	//public List<TipoInstitucion> tipoinstitucionsEliminados;
	//public List<TipoInstitucion> tipoinstitucionsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoInstitucion=false;
	public Boolean isVisibilidadCeldaDuplicarTipoInstitucion=true;
	public Boolean isVisibilidadCeldaCopiarTipoInstitucion=true;
	public Boolean isVisibilidadCeldaVerFormTipoInstitucion=true;
	public Boolean isVisibilidadCeldaOrdenTipoInstitucion=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoInstitucion=false;
	public Boolean isVisibilidadCeldaModificarTipoInstitucion=false;
	public Boolean isVisibilidadCeldaActualizarTipoInstitucion=false;
	public Boolean isVisibilidadCeldaEliminarTipoInstitucion=false;
	public Boolean isVisibilidadCeldaCancelarTipoInstitucion=false;
	public Boolean isVisibilidadCeldaGuardarTipoInstitucion=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoInstitucion=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoTipoInstitucion() {
		return this.iIdNuevoTipoInstitucion;
	}

	public void setiIdNuevoTipoInstitucion(Long iIdNuevoTipoInstitucion) {
		this.iIdNuevoTipoInstitucion = iIdNuevoTipoInstitucion;
	}
	
	public Long getidTipoInstitucionActual() {
		return this.idTipoInstitucionActual;
	}

	public void setidTipoInstitucionActual(Long idTipoInstitucionActual) {
		this.idTipoInstitucionActual = idTipoInstitucionActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoInstitucion gettipoinstitucion() {
		return this.tipoinstitucion;
	}

	public void settipoinstitucion(TipoInstitucion tipoinstitucion) {
		this.tipoinstitucion = tipoinstitucion;
	}
	
	public TipoInstitucion gettipoinstitucionAux() {
		return this.tipoinstitucionAux;
	}

	public void settipoinstitucionAux(TipoInstitucion tipoinstitucionAux) {
		this.tipoinstitucionAux = tipoinstitucionAux;
	}				
	
	public TipoInstitucion gettipoinstitucionAnterior() {
		return this.tipoinstitucionAnterior;
	}

	public void settipoinstitucionAnterior(TipoInstitucion tipoinstitucionAnterior) {
		this.tipoinstitucionAnterior = tipoinstitucionAnterior;
	}	
	
	public TipoInstitucion gettipoinstitucionTotales() {
		return this.tipoinstitucionTotales;
	}

	public void settipoinstitucionTotales(TipoInstitucion tipoinstitucionTotales) {
		this.tipoinstitucionTotales = tipoinstitucionTotales;
	}	
	
	public TipoInstitucion gettipoinstitucionBean() {
		return this.tipoinstitucionBean;
	}

	public void settipoinstitucionBean(TipoInstitucion tipoinstitucionBean) {
		this.tipoinstitucionBean = tipoinstitucionBean;
	}	
	
	public TipoInstitucionParameterReturnGeneral gettipoinstitucionReturnGeneral() {
		return this.tipoinstitucionReturnGeneral;
	}

	public void settipoinstitucionReturnGeneral(TipoInstitucionParameterReturnGeneral tipoinstitucionReturnGeneral) {
		this.tipoinstitucionReturnGeneral = tipoinstitucionReturnGeneral;
	}	
	
	
	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoInstitucionLogic getTipoInstitucionLogic()	{		
		return tipoinstitucionLogic;
	}

	public void setTipoInstitucionLogic(TipoInstitucionLogic tipoinstitucionLogic) {
		this.tipoinstitucionLogic = tipoinstitucionLogic;
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
	
	public Boolean getIsEsNuevoTipoInstitucion() {
		return isEsNuevoTipoInstitucion;
	}

	public void setIsEsNuevoTipoInstitucion(Boolean isEsNuevoTipoInstitucion) {
		this.isEsNuevoTipoInstitucion = isEsNuevoTipoInstitucion;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoInstitucion() {
		return esParaAccionDesdeFormularioTipoInstitucion;
	}
	
	public void setEsParaAccionDesdeFormularioTipoInstitucion(Boolean esParaAccionDesdeFormularioTipoInstitucion) {
		this.esParaAccionDesdeFormularioTipoInstitucion = esParaAccionDesdeFormularioTipoInstitucion;
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

			if(this.tipoinstitucionSessionBean==null) {
				this.tipoinstitucionSessionBean=new TipoInstitucionSessionBean();
			}

			if(!this.tipoinstitucionSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tipoinstitucionSessionBean.getlidEmpresaActual());
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

					if(this.tipoinstitucion!=null) {
						this.tipoinstitucion.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoInstitucion!=null) {
						this.jInternalFrameDetalleFormTipoInstitucion.jComboBoxid_empresaTipoInstitucion.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTipoInstitucion.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTipoInstitucion!=null) {
						if(this.jInternalFrameDetalleFormTipoInstitucion.jComboBoxid_empresaTipoInstitucion.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoInstitucion.jComboBoxid_empresaTipoInstitucion.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTipoInstitucionGenerico)throws Exception
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
				jComboBoxid_empresaTipoInstitucionGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTipoInstitucionGenerico!=null && jComboBoxid_empresaTipoInstitucionGenerico.getItemCount()>0) {
					jComboBoxid_empresaTipoInstitucionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TipoInstitucion tipoinstitucion,JComboBox jComboBoxid_empresaTipoInstitucionGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTipoInstitucionGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTipoInstitucion.jComboBoxid_empresaTipoInstitucion.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTipoInstitucionGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tipoinstitucion.setid_empresa(empresaAux.getId());
				tipoinstitucion.setempresa_descripcion(TipoInstitucionConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tipoinstitucion.setEmpresa(empresaAux);			}
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

					if(!TipoInstitucionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoInstitucion!=null) { 
							this.jInternalFrameDetalleFormTipoInstitucion.jComboBoxid_empresaTipoInstitucion.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTipoInstitucion.jComboBoxid_empresaTipoInstitucion.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoInstitucion!=null) { 
					}

					if(!TipoInstitucionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTipoInstitucion!=null) {
							this.jInternalFrameDetalleFormTipoInstitucion.jComboBoxid_empresaTipoInstitucion.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoInstitucion!=null) {
							this.jInternalFrameDetalleFormTipoInstitucion.jComboBoxid_empresaTipoInstitucion.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesTipoInstitucion() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoInstitucionConstantesFunciones.refrescarForeignKeysDescripcionesTipoInstitucion(this.tipoinstitucionLogic.getTipoInstitucions());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoInstitucionConstantesFunciones.refrescarForeignKeysDescripcionesTipoInstitucion(this.tipoinstitucions);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipoinstitucionLogic.setTipoInstitucions(this.tipoinstitucions);
			tipoinstitucionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoInstitucionParameterReturnGeneral getTipoInstitucionParameterGeneral() {
		return this.tipoinstitucionParameterGeneral;
	}
	
	public void setTipoInstitucionParameterGeneral(TipoInstitucionParameterReturnGeneral tipoinstitucionParameterGeneral) {
		this.tipoinstitucionParameterGeneral = tipoinstitucionParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoInstitucion() {
		return isPermisoTodoTipoInstitucion;
	}

	public void setIsPermisoTodoTipoInstitucion(Boolean isPermisoTodoTipoInstitucion) {
		this.isPermisoTodoTipoInstitucion = isPermisoTodoTipoInstitucion;
	}

	public Boolean getIsPermisoNuevoTipoInstitucion() {
		return isPermisoNuevoTipoInstitucion;
	}

	public void setIsPermisoNuevoTipoInstitucion(Boolean isPermisoNuevoTipoInstitucion) {
		this.isPermisoNuevoTipoInstitucion = isPermisoNuevoTipoInstitucion;
	}

	public Boolean getIsPermisoActualizarTipoInstitucion() {
		return isPermisoActualizarTipoInstitucion;
	}

	public void setIsPermisoActualizarTipoInstitucion(Boolean isPermisoActualizarTipoInstitucion) {
		this.isPermisoActualizarTipoInstitucion = isPermisoActualizarTipoInstitucion;
	}

	public Boolean getIsPermisoEliminarTipoInstitucion() {
		return isPermisoEliminarTipoInstitucion;
	}

	public void setIsPermisoEliminarTipoInstitucion(Boolean isPermisoEliminarTipoInstitucion) {
		this.isPermisoEliminarTipoInstitucion = isPermisoEliminarTipoInstitucion;
	}

	public Boolean getIsPermisoGuardarCambiosTipoInstitucion() {
		return isPermisoGuardarCambiosTipoInstitucion;
	}

	public void setIsPermisoGuardarCambiosTipoInstitucion(Boolean isPermisoGuardarCambiosTipoInstitucion) {
		this.isPermisoGuardarCambiosTipoInstitucion = isPermisoGuardarCambiosTipoInstitucion;
	}
	
	public Boolean getIsPermisoConsultaTipoInstitucion() {
		return isPermisoConsultaTipoInstitucion;
	}

	public void setIsPermisoConsultaTipoInstitucion(Boolean isPermisoConsultaTipoInstitucion) {
		this.isPermisoConsultaTipoInstitucion = isPermisoConsultaTipoInstitucion;
	}

	public Boolean getIsPermisoBusquedaTipoInstitucion() {
		return isPermisoBusquedaTipoInstitucion;
	}

	public void setIsPermisoBusquedaTipoInstitucion(Boolean isPermisoBusquedaTipoInstitucion) {
		this.isPermisoBusquedaTipoInstitucion = isPermisoBusquedaTipoInstitucion;
	}

	public Boolean getIsPermisoReporteTipoInstitucion() {
		return isPermisoReporteTipoInstitucion;
	}

	public void setIsPermisoReporteTipoInstitucion(Boolean isPermisoReporteTipoInstitucion) {
		this.isPermisoReporteTipoInstitucion = isPermisoReporteTipoInstitucion;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoInstitucion() {
		return isPermisoPaginacionMedioTipoInstitucion;
	}

	public void setIsPermisoPaginacionMedioTipoInstitucion(Boolean isPermisoPaginacionMedioTipoInstitucion) {
		this.isPermisoPaginacionMedioTipoInstitucion = isPermisoPaginacionMedioTipoInstitucion;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoInstitucion() {
		return isPermisoPaginacionTodoTipoInstitucion;
	}

	public void setIsPermisoPaginacionTodoTipoInstitucion(Boolean isPermisoPaginacionTodoTipoInstitucion) {
		this.isPermisoPaginacionTodoTipoInstitucion = isPermisoPaginacionTodoTipoInstitucion;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoInstitucion() {
		return isPermisoPaginacionAltoTipoInstitucion;
	}

	public void setIsPermisoPaginacionAltoTipoInstitucion(Boolean isPermisoPaginacionAltoTipoInstitucion) {
		this.isPermisoPaginacionAltoTipoInstitucion = isPermisoPaginacionAltoTipoInstitucion;
	}
	
	public Boolean getIsPermisoCopiarTipoInstitucion() {
		return isPermisoCopiarTipoInstitucion;
	}

	public void setIsPermisoCopiarTipoInstitucion(Boolean isPermisoCopiarTipoInstitucion) {
		this.isPermisoCopiarTipoInstitucion = isPermisoCopiarTipoInstitucion;
	}
	
	public Boolean getIsPermisoVerFormTipoInstitucion() {
		return isPermisoVerFormTipoInstitucion;
	}

	public void setIsPermisoVerFormTipoInstitucion(Boolean isPermisoVerFormTipoInstitucion) {
		this.isPermisoVerFormTipoInstitucion = isPermisoVerFormTipoInstitucion;
	}
	
	public Boolean getIsPermisoDuplicarTipoInstitucion() {
		return isPermisoDuplicarTipoInstitucion;
	}

	public void setIsPermisoDuplicarTipoInstitucion(Boolean isPermisoDuplicarTipoInstitucion) {
		this.isPermisoDuplicarTipoInstitucion = isPermisoDuplicarTipoInstitucion;
	}
	
	public Boolean getIsPermisoOrdenTipoInstitucion() {
		return isPermisoOrdenTipoInstitucion;
	}

	public void setIsPermisoOrdenTipoInstitucion(Boolean isPermisoOrdenTipoInstitucion) {
		this.isPermisoOrdenTipoInstitucion = isPermisoOrdenTipoInstitucion;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoInstitucion() {
		return isVisibilidadCeldaNuevoTipoInstitucion;
	}

	public void setIsVisibilidadCeldaNuevoTipoInstitucion(Boolean isVisibilidadCeldaNuevoTipoInstitucion) {
		this.isVisibilidadCeldaNuevoTipoInstitucion = isVisibilidadCeldaNuevoTipoInstitucion;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoInstitucion() {
		return isVisibilidadCeldaDuplicarTipoInstitucion;
	}

	public void setIsVisibilidadCeldaDuplicarTipoInstitucion(Boolean isVisibilidadCeldaDuplicarTipoInstitucion) {
		this.isVisibilidadCeldaDuplicarTipoInstitucion = isVisibilidadCeldaDuplicarTipoInstitucion;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoInstitucion() {
		return isVisibilidadCeldaCopiarTipoInstitucion;
	}

	public void setIsVisibilidadCeldaCopiarTipoInstitucion(Boolean isVisibilidadCeldaCopiarTipoInstitucion) {
		this.isVisibilidadCeldaCopiarTipoInstitucion = isVisibilidadCeldaCopiarTipoInstitucion;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoInstitucion() {
		return isVisibilidadCeldaVerFormTipoInstitucion;
	}

	public void setIsVisibilidadCeldaVerFormTipoInstitucion(Boolean isVisibilidadCeldaVerFormTipoInstitucion) {
		this.isVisibilidadCeldaVerFormTipoInstitucion = isVisibilidadCeldaVerFormTipoInstitucion;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoInstitucion() {
		return isVisibilidadCeldaOrdenTipoInstitucion;
	}

	public void setIsVisibilidadCeldaOrdenTipoInstitucion(Boolean isVisibilidadCeldaOrdenTipoInstitucion) {
		this.isVisibilidadCeldaOrdenTipoInstitucion = isVisibilidadCeldaOrdenTipoInstitucion;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoInstitucion() {
		return isVisibilidadCeldaNuevoRelacionesTipoInstitucion;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoInstitucion(Boolean isVisibilidadCeldaNuevoRelacionesTipoInstitucion) {
		this.isVisibilidadCeldaNuevoRelacionesTipoInstitucion = isVisibilidadCeldaNuevoRelacionesTipoInstitucion;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoInstitucion() {
		return isVisibilidadCeldaModificarTipoInstitucion;
	}

	public void setIsVisibilidadCeldaModificarTipoInstitucion(Boolean isVisibilidadCeldaModificarTipoInstitucion) {
		this.isVisibilidadCeldaModificarTipoInstitucion = isVisibilidadCeldaModificarTipoInstitucion;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoInstitucion() {
		return isVisibilidadCeldaActualizarTipoInstitucion;
	}

	public void setIsVisibilidadCeldaActualizarTipoInstitucion(Boolean isVisibilidadCeldaActualizarTipoInstitucion) {
		this.isVisibilidadCeldaActualizarTipoInstitucion = isVisibilidadCeldaActualizarTipoInstitucion;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoInstitucion() {
		return isVisibilidadCeldaEliminarTipoInstitucion;
	}

	public void setIsVisibilidadCeldaEliminarTipoInstitucion(Boolean isVisibilidadCeldaEliminarTipoInstitucion) {
		this.isVisibilidadCeldaEliminarTipoInstitucion = isVisibilidadCeldaEliminarTipoInstitucion;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoInstitucion() {
		return isVisibilidadCeldaCancelarTipoInstitucion;
	}

	public void setIsVisibilidadCeldaCancelarTipoInstitucion(Boolean isVisibilidadCeldaCancelarTipoInstitucion) {
		this.isVisibilidadCeldaCancelarTipoInstitucion = isVisibilidadCeldaCancelarTipoInstitucion;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoInstitucion() {
		return isVisibilidadCeldaGuardarTipoInstitucion;
	}

	public void setIsVisibilidadCeldaGuardarTipoInstitucion(Boolean isVisibilidadCeldaGuardarTipoInstitucion) {
		this.isVisibilidadCeldaGuardarTipoInstitucion = isVisibilidadCeldaGuardarTipoInstitucion;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoInstitucion() {
		return isVisibilidadCeldaGuardarCambiosTipoInstitucion;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoInstitucion(Boolean isVisibilidadCeldaGuardarCambiosTipoInstitucion) {
		this.isVisibilidadCeldaGuardarCambiosTipoInstitucion = isVisibilidadCeldaGuardarCambiosTipoInstitucion;
	}
		
	public TipoInstitucionSessionBean gettipoinstitucionSessionBean() {
		return this.tipoinstitucionSessionBean;
	}
	
	public void settipoinstitucionSessionBean(TipoInstitucionSessionBean tipoinstitucionSessionBean) {
		this.tipoinstitucionSessionBean=tipoinstitucionSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoInstitucion(TipoInstitucion tipoinstitucion)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tipoinstitucion,null);
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
	
	public void bugActualizarReferenciaActual(TipoInstitucion tipoinstitucion,TipoInstitucion tipoinstitucionAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoInstitucion(tipoinstitucion);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipoinstitucionAux.setId(tipoinstitucion.getId());
		tipoinstitucionAux.setVersionRow(tipoinstitucion.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoInstitucion();
		
			int intSelectedRow = this.jTableDatosTipoInstitucion.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinstitucion =(TipoInstitucion) this.tipoinstitucionLogic.getTipoInstitucions().toArray()[this.jTableDatosTipoInstitucion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipoinstitucion =(TipoInstitucion) this.tipoinstitucions.toArray()[this.jTableDatosTipoInstitucion.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoInstitucionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoInstitucion(this.tipoinstitucion,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoInstitucion(this.tipoinstitucion);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipoinstitucionValidator.getInvalidValues(this.tipoinstitucion);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipoinstitucionLogic.setDatosCliente(datosCliente);
			tipoinstitucionLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipoinstitucionAux=new  TipoInstitucion();
				
				tipoinstitucionAux.setIsNew(true);
				tipoinstitucionAux.setIsChanged(true);
				
				tipoinstitucionAux.setTipoInstitucionOriginal(this.tipoinstitucion);
				
				tipoinstitucionAux.setId(this.tipoinstitucion.getId());	
				tipoinstitucionAux.setVersionRow(this.tipoinstitucion.getVersionRow());	
				tipoinstitucionAux.setid_empresa(this.tipoinstitucion.getid_empresa());	
				tipoinstitucionAux.setcodigo(this.tipoinstitucion.getcodigo());	
				tipoinstitucionAux.setnombre(this.tipoinstitucion.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoinstitucionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoinstitucionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipoinstitucionAux,tipoinstitucionLogic.getTipoInstitucions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoinstitucionAux,tipoinstitucions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipoinstitucionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoinstitucionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoinstitucionLogic.saveTipoInstitucions();//WithConnection
						//tipoinstitucionLogic.getSetVersionRowTipoInstitucions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoinstitucion,tipoinstitucionAux);
					
					this.refrescarForeignKeysDescripcionesTipoInstitucion();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoinstitucionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipoinstitucionAux=new  TipoInstitucion();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipoinstitucionSessionBean.getEsGuardarRelacionado() 
					|| (this.tipoinstitucionSessionBean.getEsGuardarRelacionado() && this.tipoinstitucion.getId()>=0)) {
						
					tipoinstitucionAux.setIsNew(false);
				}
				
				tipoinstitucionAux.setIsDeleted(false);
			
				tipoinstitucionAux.setId(this.tipoinstitucion.getId());	
				tipoinstitucionAux.setVersionRow(this.tipoinstitucion.getVersionRow());	
				tipoinstitucionAux.setid_empresa(this.tipoinstitucion.getid_empresa());	
				tipoinstitucionAux.setcodigo(this.tipoinstitucion.getcodigo());	
				tipoinstitucionAux.setnombre(this.tipoinstitucion.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoinstitucionAux,tipoinstitucionLogic.getTipoInstitucions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoinstitucionAux,tipoinstitucions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipoinstitucionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoinstitucionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoinstitucionLogic.saveTipoInstitucions();//WithConnection
						//tipoinstitucionLogic.getSetVersionRowTipoInstitucions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoinstitucion,tipoinstitucionAux);
					
					this.refrescarForeignKeysDescripcionesTipoInstitucion();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoinstitucionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipoinstitucionAux=new  TipoInstitucion();
				
				tipoinstitucionAux.setIsNew(false);
				tipoinstitucionAux.setIsChanged(false);
				
				tipoinstitucionAux.setIsDeleted(true);
				
				tipoinstitucionAux.setId(this.tipoinstitucion.getId());	
				tipoinstitucionAux.setVersionRow(this.tipoinstitucion.getVersionRow());	
				tipoinstitucionAux.setid_empresa(this.tipoinstitucion.getid_empresa());	
				tipoinstitucionAux.setcodigo(this.tipoinstitucion.getcodigo());	
				tipoinstitucionAux.setnombre(this.tipoinstitucion.getnombre());	
				
				if(this.tipoinstitucionSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipoinstitucionAux.getId()>=0) {	
						this.tipoinstitucionsEliminados.add(tipoinstitucionAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipoinstitucionAux,tipoinstitucionLogic.getTipoInstitucions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoinstitucionAux,tipoinstitucions);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipoinstitucionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoinstitucionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoinstitucionLogic.saveTipoInstitucions();//WithConnection
						//tipoinstitucionLogic.getSetVersionRowTipoInstitucions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoinstitucionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoInstitucion.cursoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoInstitucion.cursoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoInstitucion.cursoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoinstitucionAux.setCursos(this.jInternalFrameDetalleFormTipoInstitucion.cursoBeanSwingJInternalFrame.cursoLogic.getCursos());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipoinstitucionSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipoinstitucionSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipoinstitucionAux,tipoinstitucionLogic.getTipoInstitucions());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipoinstitucionAux,tipoinstitucions);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinstitucionLogic.getTipoInstitucions().addAll(this.tipoinstitucionsEliminados);
					
					tipoinstitucionLogic.saveTipoInstitucions();//WithConnection
					//tipoinstitucionLogic.getSetVersionRowTipoInstitucions();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoInstitucion();
				
				this.tipoinstitucionsEliminados= new ArrayList<TipoInstitucion>();		
			}
			
			if(this.tipoinstitucionSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoinstitucionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Institucion GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Institucion",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipoinstitucion=tipoinstitucionAux;
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
      		//this.finishProcessTipoInstitucion();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoInstitucion tipoinstitucionLocal) throws Exception {
		
		if(this.tipoinstitucionSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipoinstitucionLocal.setCursos(this.jInternalFrameDetalleFormTipoInstitucion.cursoBeanSwingJInternalFrame.cursoLogic.getCursos());
			
			} else {
			
				tipoinstitucionLocal.setCursos(this.jInternalFrameDetalleFormTipoInstitucion.cursoBeanSwingJInternalFrame.cursos);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoInstitucion tipoinstitucionLocal) throws Exception {	
		if(this.tipoinstitucionSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tipoinstitucionLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoInstitucionActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoInstitucion.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoinstitucion =(TipoInstitucion) this.tipoinstitucionLogic.getTipoInstitucions().toArray()[this.jTableDatosTipoInstitucion.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipoinstitucion =(TipoInstitucion) this.tipoinstitucions.toArray()[this.jTableDatosTipoInstitucion.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipoinstitucionValidator.getInvalidValues(this.tipoinstitucion);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoInstitucion tipoinstitucion,List<TipoInstitucion> tipoinstitucions) throws Exception {
		try	{		
			TipoInstitucionConstantesFunciones.actualizarLista(tipoinstitucion,tipoinstitucions,this.tipoinstitucionSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoInstitucion tipoinstitucion,List<TipoInstitucion> tipoinstitucions) throws Exception {
		try	{			
			TipoInstitucionConstantesFunciones.actualizarSelectedLista(tipoinstitucion,tipoinstitucions);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoInstitucion> tipoinstitucionsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipoinstitucionsLocal=this.tipoinstitucionLogic.getTipoInstitucions();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipoinstitucionsLocal=this.tipoinstitucions;
			}
			//ARCHITECTURE
		
			for(TipoInstitucion tipoinstitucionLocal:tipoinstitucionsLocal) {
				if(this.permiteMantenimiento(tipoinstitucionLocal) && tipoinstitucionLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoInstitucionConstantesFunciones.getTipoInstitucionLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoInstitucionConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoInstitucion.jLabelid_empresaTipoInstitucion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoInstitucionConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoInstitucion.jLabelcodigoTipoInstitucion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoInstitucionConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoInstitucion.jLabelnombreTipoInstitucion,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoInstitucion!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoInstitucion.jLabelid_empresaTipoInstitucion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoInstitucion.jLabelcodigoTipoInstitucion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoInstitucion.jLabelnombreTipoInstitucion,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("Curso")) {
			if(this.tipoinstitucion==null) {
				this.tipoinstitucion= new TipoInstitucion();
			}

			if(this.tipoinstitucionSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoInstitucion
				this.setVariablesFormularioToObjetoActualTipoInstitucion(this.tipoinstitucion,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoInstitucion(this.tipoinstitucion);

				this.jInternalFrameDetalleFormTipoInstitucion.cursoBeanSwingJInternalFrame.getcurso().setTipoInstitucion(this.tipoinstitucion);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoInstitucion--;	
		
		
		this.tipoinstitucionAux=new TipoInstitucion();
		
		this.tipoinstitucionAux.setId(this.iIdNuevoTipoInstitucion);
		this.tipoinstitucionAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoinstitucionLogic.getTipoInstitucions().add(this.tipoinstitucionAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipoinstitucions.add(this.tipoinstitucionAux);
		}
		//ARCHITECTURE
		
		this.tipoinstitucion=this.tipoinstitucionAux;
		
		if(TipoInstitucionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoInstitucion(this.tipoinstitucion);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoInstitucion(this.tipoinstitucion);
		}
				
		//this.setDefaultControlesTipoInstitucion();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoInstitucion();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoInstitucion();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoInstitucion();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoInstitucion(this.tipoinstitucionBean,this.tipoinstitucion,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoInstitucion(this.tipoinstitucion);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoInstitucionConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipoinstitucionSessionBean.getConGuardarRelaciones()) {
			classes=TipoInstitucionConstantesFunciones.getClassesRelationshipsOfTipoInstitucion(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipoinstitucionReturnGeneral=tipoinstitucionLogic.procesarEventosTipoInstitucionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoinstitucionLogic.getTipoInstitucions(),this.tipoinstitucion,this.tipoinstitucionParameterGeneral,this.isEsNuevoTipoInstitucion,classes);//this.tipoinstitucionLogic.getTipoInstitucion()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoInstitucion(this.tipoinstitucionReturnGeneral,this.tipoinstitucionBean,false);
		
		if(this.tipoinstitucionReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoInstitucion(this.tipoinstitucionReturnGeneral.getTipoInstitucion());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoInstitucion(this.tipoinstitucionReturnGeneral.getTipoInstitucion());
		}
		
		if(this.tipoinstitucionReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoInstitucion(this.tipoinstitucionReturnGeneral.getTipoInstitucion(),classes);//this.tipoinstitucionBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoInstitucion(this.tipoinstitucion,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoInstitucion();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoInstitucion();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoInstitucion(false);
						
			if(tipoinstitucionSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoInstitucion.cursoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoInstitucion.cursoBeanSwingJInternalFrame.cursoSessionBean.getEsGuardarRelacionado() && CursoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCursoActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoInstitucionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoInstitucion();
			}
			
			this.actualizarVisualTableDatosTipoInstitucion();
			
			this.jTableDatosTipoInstitucion.setRowSelectionInterval(this.getIndiceNuevoTipoInstitucion(), this.getIndiceNuevoTipoInstitucion());
			
			this.seleccionarFilaTablaTipoInstitucionActual();
						
			this.actualizarEstadoCeldasBotonesTipoInstitucion("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoInstitucion(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoInstitucion.jTextFieldcodigoTipoInstitucion.setEnabled(isHabilitar && this.tipoinstitucionConstantesFunciones.activarcodigoTipoInstitucion);
		this.jInternalFrameDetalleFormTipoInstitucion.jTextAreanombreTipoInstitucion.setEnabled(isHabilitar && this.tipoinstitucionConstantesFunciones.activarnombreTipoInstitucion);	
		//
		this.jInternalFrameDetalleFormTipoInstitucion.jComboBoxid_empresaTipoInstitucion.setEnabled(isHabilitar && this.tipoinstitucionConstantesFunciones.activarid_empresaTipoInstitucion);
	};
	
	public void setDefaultControlesTipoInstitucion() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoInstitucion(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipoinstitucionSessionBean.setConGuardarRelaciones(true);			
			this.tipoinstitucionSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoInstitucion.jTabbedPaneRelacionesTipoInstitucion.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoInstitucion.cursoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoInstitucion.cursoBeanSwingJInternalFrame.cursoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoInstitucion.cursoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipoinstitucionSessionBean.setConGuardarRelaciones(false);			
			this.tipoinstitucionSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoInstitucion.jTabbedPaneRelacionesTipoInstitucion.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoInstitucion.cursoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoInstitucion.cursoBeanSwingJInternalFrame.cursoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoInstitucion.cursoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoInstitucion() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoInstitucion tipoinstitucionAux:this.tipoinstitucionLogic.getTipoInstitucions()) {
				if(tipoinstitucionAux.getId().equals(this.iIdNuevoTipoInstitucion)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoInstitucion tipoinstitucionAux:this.tipoinstitucions) {
				if(tipoinstitucionAux.getId().equals(this.iIdNuevoTipoInstitucion)) {
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
	
	public int getIndiceActualTipoInstitucion(TipoInstitucion tipoinstitucion,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoInstitucion tipoinstitucionAux:this.tipoinstitucionLogic.getTipoInstitucions()) {
				if(tipoinstitucionAux.getId().equals(tipoinstitucion.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoInstitucion tipoinstitucionAux:this.tipoinstitucions) {
				if(tipoinstitucionAux.getId().equals(tipoinstitucion.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoInstitucion(TipoInstitucion tipoinstitucionOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoInstitucion tipoinstitucionAux:this.tipoinstitucionLogic.getTipoInstitucions()) {
				if(tipoinstitucionAux.getTipoInstitucionOriginal().getId().equals(tipoinstitucionOriginal.getId())) {
					existe=true;
					tipoinstitucionOriginal.setId(tipoinstitucionAux.getId());
					tipoinstitucionOriginal.setVersionRow(tipoinstitucionAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoInstitucion tipoinstitucionAux:this.tipoinstitucions) {
				if(tipoinstitucionAux.getTipoInstitucionOriginal().getId().equals(tipoinstitucionOriginal.getId())) {
					existe=true;
					tipoinstitucionOriginal.setId(tipoinstitucionAux.getId());
					tipoinstitucionOriginal.setVersionRow(tipoinstitucionAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoInstitucion(Boolean esParaCancelar) throws Exception {
		tipoinstitucionsAux=new ArrayList<TipoInstitucion>();
		tipoinstitucionAux=new TipoInstitucion();
		
		if(!this.tipoinstitucionSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoInstitucion tipoinstitucionAux:this.tipoinstitucionLogic.getTipoInstitucions()) {
					if(tipoinstitucionAux.getId()<0) {
						tipoinstitucionsAux.add(tipoinstitucionAux);
					}		
				}
				this.iIdNuevoTipoInstitucion=0L;
				this.tipoinstitucionLogic.getTipoInstitucions().removeAll(tipoinstitucionsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoInstitucion tipoinstitucionAux:this.tipoinstitucions) {
					if(tipoinstitucionAux.getId()<0) {
						tipoinstitucionsAux.add(tipoinstitucionAux);
					}		
				}
				this.iIdNuevoTipoInstitucion=0L;
				this.tipoinstitucions.removeAll(tipoinstitucionsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoInstitucion 
					&& this.tipoinstitucionLogic.getTipoInstitucions().size()>0
					) {
					tipoinstitucionAux=this.tipoinstitucionLogic.getTipoInstitucions().get(this.tipoinstitucionLogic.getTipoInstitucions().size() - 1);
				
					if(tipoinstitucionAux.getId()<0) {
						this.tipoinstitucionLogic.getTipoInstitucions().remove(tipoinstitucionAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoInstitucion && this.tipoinstitucions.size()>0) {
					tipoinstitucionAux=this.tipoinstitucions.get(this.tipoinstitucions.size() - 1);
				
					if(tipoinstitucionAux.getId()<0) {
						this.tipoinstitucions.remove(tipoinstitucionAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoInstitucion(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipoinstitucion.getId()<0) {
				this.tipoinstitucionLogic.getTipoInstitucions().remove(this.tipoinstitucion);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipoinstitucion.getId()<0) {
				this.tipoinstitucions.remove(this.tipoinstitucion);
			}
		}			
	}
	
	public void setEstadosInicialesTipoInstitucion(List<TipoInstitucion> tipoinstitucionsAux) throws Exception {
		TipoInstitucionConstantesFunciones.setEstadosInicialesTipoInstitucion(tipoinstitucionsAux);
	}
	
	public void setEstadosInicialesTipoInstitucion(TipoInstitucion tipoinstitucionAux) throws Exception {
		TipoInstitucionConstantesFunciones.setEstadosInicialesTipoInstitucion(tipoinstitucionAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoInstitucionActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoInstitucion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoInstitucionActual()) {
				if(!this.isEsNuevoTipoInstitucion) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoInstitucion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoInstitucion=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoInstitucionActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Institucion ?", "MANTENIMIENTO DE Tipo Institucion", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoInstitucion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoInstitucion tipoinstitucion) throws Exception {
		TipoInstitucionConstantesFunciones.seleccionarAsignar(this.tipoinstitucion,tipoinstitucion);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoInstitucion=this.isPermisoActualizarOriginalTipoInstitucion;
			
			
			this.seleccionarAsignar(tipoinstitucion);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoInstitucionConstantesFunciones.quitarEspaciosTipoInstitucion(this.tipoinstitucion,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoInstitucion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipoinstitucionSessionBean.setsFuncionBusquedaRapida(this.tipoinstitucionSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoInstitucion) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoInstitucion(esParaCancelar);				
				this.cancelarNuevoTipoInstitucion(esParaCancelar);								
			}
			
			this.tipoinstitucion=new TipoInstitucion();
			
			this.inicializarTipoInstitucion();
			
			this.actualizarEstadoCeldasBotonesTipoInstitucion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoInstitucion() throws Exception {
		try {
			TipoInstitucionConstantesFunciones.inicializarTipoInstitucion(this.tipoinstitucion);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipoinstitucionLogic.getTipoInstitucions().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoInstitucions(String sAccionBusqueda,List<TipoInstitucion> tipoinstitucionsParaReportes) throws Exception {
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
					sPathReporteFinal="TipoInstitucion"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoInstitucionMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoInstitucionMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoInstitucion"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Instituciones");		
		parameters.put("busquedapor", TipoInstitucionConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(Curso.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoInstitucionLogic tipoinstitucionLogicAuxiliar=new TipoInstitucionLogic();
					tipoinstitucionLogicAuxiliar.setDatosCliente(tipoinstitucionLogic.getDatosCliente());				
					tipoinstitucionLogicAuxiliar.setTipoInstitucions(tipoinstitucionsParaReportes);
					
					tipoinstitucionLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoInstitucionWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipoinstitucionsParaReportes=tipoinstitucionLogicAuxiliar.getTipoInstitucions();
					
					//tipoinstitucionLogic.getNewConnexionToDeep();
					
					//for (TipoInstitucion tipoinstitucion:tipoinstitucionsParaReportes) {
					//	tipoinstitucionLogic.deepLoad(tipoinstitucion, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipoinstitucionLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipoinstitucionLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileCurso = AuxiliarReportes.class.getResourceAsStream("CursoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_curso", reportFileCurso);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoInstitucion=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoInstitucionConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoInstitucionConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoInstitucion=new JRBeanArrayDataSource(TipoInstitucionJInternalFrame.TraerTipoInstitucionBeans(tipoinstitucionsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoInstitucion);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoInstitucionConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoInstitucionConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoInstitucionBean.TraerTipoInstitucionBeans(tipoinstitucionsParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoInstitucions(sAccionBusqueda,sTipoArchivoReporte,tipoinstitucionsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoInstitucions(sAccionBusqueda,sTipoArchivoReporte,tipoinstitucionsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoInstitucionActionPerformed(null);
					//this.generarExcelReporteTipoInstitucions(sAccionBusqueda,sTipoArchivoReporte,tipoinstitucionsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoInstitucions(sAccionBusqueda,sTipoArchivoReporte,tipoinstitucionsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoInstitucions(sAccionBusqueda,sTipoArchivoReporte,tipoinstitucionsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoInstitucions(sAccionBusqueda,sTipoArchivoReporte,tipoinstitucionsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoInstitucions(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoInstitucion> tipoinstitucionsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoinstitucion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoInstitucions");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoInstitucion("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoInstitucion tipoinstitucion : tipoinstitucionsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoInstitucionConstantesFunciones.generarExcelReporteDataTipoInstitucion("NORMAL",row,workbook,tipoinstitucion,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoinstitucionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Institucion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoInstitucion(String sTipo,Row row,Workbook workbook) {
		
		TipoInstitucionConstantesFunciones.generarExcelReporteHeaderTipoInstitucion(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoInstitucions(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoInstitucion> tipoinstitucionsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoinstitucion_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoInstitucions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoInstitucion tipoinstitucion : tipoinstitucionsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoInstitucionConstantesFunciones.getTipoInstitucionDescripcion(tipoinstitucion));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoInstitucionConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoInstitucionConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoinstitucion.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoInstitucionConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoInstitucionConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoinstitucion.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoInstitucionConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoInstitucionConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoinstitucion.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoinstitucionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Institucion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoInstitucions(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoInstitucion> tipoinstitucionsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoInstitucion> tipoinstitucionsRespaldo=null;
		
		classes=TipoInstitucionConstantesFunciones.getClassesRelationshipsOfTipoInstitucion(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipoinstitucionLogic.setDatosCliente(this.datosCliente);
		this.tipoinstitucionLogic.setDatosDeep(this.datosDeep);
		this.tipoinstitucionLogic.setIsConDeep(true);
		
		tipoinstitucionsRespaldo=this.tipoinstitucionLogic.getTipoInstitucions();
		
		this.tipoinstitucionLogic.setTipoInstitucions(tipoinstitucionsParaReportes);	
		this.tipoinstitucionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipoinstitucionsParaReportes=this.tipoinstitucionLogic.getTipoInstitucions();
		this.tipoinstitucionLogic.setTipoInstitucions(tipoinstitucionsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoinstitucion_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoInstitucions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoInstitucion("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoInstitucion tipoinstitucion : tipoinstitucionsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoInstitucion("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoInstitucionConstantesFunciones.generarExcelReporteDataTipoInstitucion("NORMAL",row,workbook,tipoinstitucion,cellStyleDataAux);
		
			
			


				//Curso
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(CursoConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipoinstitucion.getCursos()!=null && tipoinstitucion.getCursos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(CursoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					CursoConstantesFunciones.generarExcelReporteHeaderCurso("RELACIONADO",row,workbook);
				}

				if(tipoinstitucion.getCursos()!=null) {
					i2=0;
					for(Curso curso : tipoinstitucion.getCursos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						CursoConstantesFunciones.generarExcelReporteDataCurso("RELACIONADO",row,workbook,curso,cellStyleDataAuxHijo);
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
		cell.setCellValue(TipoInstitucionConstantesFunciones.getTipoInstitucionDescripcion(tipoinstitucion));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoinstitucionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Institucion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoInstitucion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoInstitucion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoInstitucion.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoInstitucion.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoInstitucion() throws Exception {		
		this.startProcessTipoInstitucion(true);
	}
	
	public void startProcessTipoInstitucion(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoInstitucion ,this.jPanelParametrosReportesTipoInstitucion, this.jScrollPanelDatosTipoInstitucion,this.jPanelPaginacionTipoInstitucion, this.jScrollPanelDatosEdicionTipoInstitucion, this.jPanelAccionesTipoInstitucion,this.jPanelAccionesFormularioTipoInstitucion,this.jmenuBarTipoInstitucion,this.jmenuBarDetalleTipoInstitucion,this.jTtoolBarTipoInstitucion,this.jTtoolBarDetalleTipoInstitucion);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoInstitucion=this.jTabbedPaneBusquedasTipoInstitucion; 
		
		final JPanel jPanelParametrosReportesTipoInstitucion=this.jPanelParametrosReportesTipoInstitucion;
		//final JScrollPane jScrollPanelDatosTipoInstitucion=this.jScrollPanelDatosTipoInstitucion;
		final JTable jTableDatosTipoInstitucion=this.jTableDatosTipoInstitucion;		
		final JPanel jPanelPaginacionTipoInstitucion=this.jPanelPaginacionTipoInstitucion;
		//final JScrollPane jScrollPanelDatosEdicionTipoInstitucion=this.jScrollPanelDatosEdicionTipoInstitucion;
		final JPanel jPanelAccionesTipoInstitucion=this.jPanelAccionesTipoInstitucion;
		
		JPanel jPanelCamposAuxiliarTipoInstitucion=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoInstitucion=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoInstitucion!=null) {
			jPanelCamposAuxiliarTipoInstitucion=this.jInternalFrameDetalleFormTipoInstitucion.jPanelCamposTipoInstitucion;
			jPanelAccionesFormularioAuxiliarTipoInstitucion=this.jInternalFrameDetalleFormTipoInstitucion.jPanelAccionesFormularioTipoInstitucion;
		}
		
		final JPanel jPanelCamposTipoInstitucion=jPanelCamposAuxiliarTipoInstitucion;
		final JPanel jPanelAccionesFormularioTipoInstitucion=jPanelAccionesFormularioAuxiliarTipoInstitucion;
		
		
		final JMenuBar jmenuBarTipoInstitucion=this.jmenuBarTipoInstitucion;
		final JToolBar jTtoolBarTipoInstitucion=this.jTtoolBarTipoInstitucion;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoInstitucion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoInstitucion=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoInstitucion!=null) {
			jmenuBarDetalleAuxiliarTipoInstitucion=this.jInternalFrameDetalleFormTipoInstitucion.jmenuBarDetalleTipoInstitucion;
			jTtoolBarDetalleAuxiliarTipoInstitucion=this.jInternalFrameDetalleFormTipoInstitucion.jTtoolBarDetalleTipoInstitucion;
		}
		
		final JMenuBar jmenuBarDetalleTipoInstitucion=jmenuBarDetalleAuxiliarTipoInstitucion;
		final JToolBar jTtoolBarDetalleTipoInstitucion=jTtoolBarDetalleAuxiliarTipoInstitucion;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoInstitucion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoInstitucion;
			processRunnable.jTableDatos=jTableDatosTipoInstitucion;
			processRunnable.jPanelCampos=jPanelCamposTipoInstitucion;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoInstitucion;
			processRunnable.jPanelAcciones=jPanelAccionesTipoInstitucion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoInstitucion;
			
			
			processRunnable.jmenuBar=jmenuBarTipoInstitucion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoInstitucion;
			processRunnable.jTtoolBar=jTtoolBarTipoInstitucion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoInstitucion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoInstitucion ,jPanelParametrosReportesTipoInstitucion,jTableDatosTipoInstitucion, /*jScrollPanelDatosTipoInstitucion,*/jPanelCamposTipoInstitucion,jPanelPaginacionTipoInstitucion, /*jScrollPanelDatosEdicionTipoInstitucion,*/ jPanelAccionesTipoInstitucion,jPanelAccionesFormularioTipoInstitucion,jmenuBarTipoInstitucion,jmenuBarDetalleTipoInstitucion,jTtoolBarTipoInstitucion,jTtoolBarDetalleTipoInstitucion);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoInstitucion ,jPanelParametrosReportesTipoInstitucion, jScrollPanelDatosTipoInstitucion,jPanelPaginacionTipoInstitucion, jScrollPanelDatosEdicionTipoInstitucion, jPanelAccionesTipoInstitucion,jPanelAccionesFormularioTipoInstitucion,jmenuBarTipoInstitucion,jmenuBarDetalleTipoInstitucion,jTtoolBarTipoInstitucion,jTtoolBarDetalleTipoInstitucion);
						
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
	
	public void finishProcessTipoInstitucion() {// throws Exception 
		this.finishProcessTipoInstitucion(true);
	}
	
	public void finishProcessTipoInstitucion(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoInstitucion ,this.jPanelParametrosReportesTipoInstitucion, this.jScrollPanelDatosTipoInstitucion,this.jPanelPaginacionTipoInstitucion, this.jScrollPanelDatosEdicionTipoInstitucion, this.jPanelAccionesTipoInstitucion,this.jPanelAccionesFormularioTipoInstitucion,this.jmenuBarTipoInstitucion,this.jmenuBarDetalleTipoInstitucion,this.jTtoolBarTipoInstitucion,this.jTtoolBarDetalleTipoInstitucion);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoInstitucion=this.jTabbedPaneBusquedasTipoInstitucion; 
		
		final JPanel jPanelParametrosReportesTipoInstitucion=this.jPanelParametrosReportesTipoInstitucion;
		//final JScrollPane jScrollPanelDatosTipoInstitucion=this.jScrollPanelDatosTipoInstitucion;
		final JTable jTableDatosTipoInstitucion=this.jTableDatosTipoInstitucion;		
		final JPanel jPanelPaginacionTipoInstitucion=this.jPanelPaginacionTipoInstitucion;
		//final JScrollPane jScrollPanelDatosEdicionTipoInstitucion=this.jScrollPanelDatosEdicionTipoInstitucion;
		final JPanel jPanelAccionesTipoInstitucion=this.jPanelAccionesTipoInstitucion;
		
		JPanel jPanelCamposAuxiliarTipoInstitucion=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoInstitucion=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoInstitucion!=null) {
			jPanelCamposAuxiliarTipoInstitucion=this.jInternalFrameDetalleFormTipoInstitucion.jPanelCamposTipoInstitucion;
			jPanelAccionesFormularioAuxiliarTipoInstitucion=this.jInternalFrameDetalleFormTipoInstitucion.jPanelAccionesFormularioTipoInstitucion;
		}
		
		final JPanel jPanelCamposTipoInstitucion=jPanelCamposAuxiliarTipoInstitucion;
		final JPanel jPanelAccionesFormularioTipoInstitucion=jPanelAccionesFormularioAuxiliarTipoInstitucion;
		
		
		final JMenuBar jmenuBarTipoInstitucion=this.jmenuBarTipoInstitucion;		
		final JToolBar jTtoolBarTipoInstitucion=this.jTtoolBarTipoInstitucion;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoInstitucion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoInstitucion=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoInstitucion!=null) {
			jmenuBarDetalleAuxiliarTipoInstitucion=this.jInternalFrameDetalleFormTipoInstitucion.jmenuBarDetalleTipoInstitucion;
			jTtoolBarDetalleAuxiliarTipoInstitucion=this.jInternalFrameDetalleFormTipoInstitucion.jTtoolBarDetalleTipoInstitucion;		
		}
		
		final JMenuBar jmenuBarDetalleTipoInstitucion=jmenuBarDetalleAuxiliarTipoInstitucion;
		final JToolBar jTtoolBarDetalleTipoInstitucion=jTtoolBarDetalleAuxiliarTipoInstitucion;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoInstitucion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoInstitucion;
			processRunnable.jTableDatos=jTableDatosTipoInstitucion;
			processRunnable.jPanelCampos=jPanelCamposTipoInstitucion;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoInstitucion;
			processRunnable.jPanelAcciones=jPanelAccionesTipoInstitucion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoInstitucion;
			
			
			processRunnable.jmenuBar=jmenuBarTipoInstitucion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoInstitucion;
			processRunnable.jTtoolBar=jTtoolBarTipoInstitucion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoInstitucion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoInstitucion ,jPanelParametrosReportesTipoInstitucion, jTableDatosTipoInstitucion,/*jScrollPanelDatosTipoInstitucion,*/jPanelCamposTipoInstitucion,jPanelPaginacionTipoInstitucion, /*jScrollPanelDatosEdicionTipoInstitucion,*/ jPanelAccionesTipoInstitucion,jPanelAccionesFormularioTipoInstitucion,jmenuBarTipoInstitucion,jmenuBarDetalleTipoInstitucion,jTtoolBarTipoInstitucion,jTtoolBarDetalleTipoInstitucion));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoInstitucion(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoInstitucion(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoInstitucion(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoInstitucion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoInstitucion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoInstitucion,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoInstitucion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoInstitucion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoInstitucion,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipoinstitucionConstantesFunciones.getsFinalQueryTipoInstitucion();
		String  finalQueryPaginacionTodos=this.tipoinstitucionConstantesFunciones.getsFinalQueryTipoInstitucion();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoInstitucionConstantesFunciones.getArrayColumnasGlobalesNoTipoInstitucion(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoInstitucionConstantesFunciones.getArrayColumnasGlobalesTipoInstitucion(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoInstitucionConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipoinstitucionsEliminados= new ArrayList<TipoInstitucion>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoInstitucion();
		
				///*TipoInstitucionSessionBean*/this.tipoinstitucionSessionBean=new TipoInstitucionSessionBean();
			
			if(this.tipoinstitucionSessionBean==null) {
				this.tipoinstitucionSessionBean=new TipoInstitucionSessionBean();
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
					this.iNumeroPaginacion=TipoInstitucionConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoInstitucionConstantesFunciones.getClassesForeignKeysOfTipoInstitucion(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipoinstitucion."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipoinstitucionsAux= new ArrayList<TipoInstitucion>();
			
				
			tipoinstitucionLogic.setDatosCliente(this.datosCliente);
			tipoinstitucionLogic.setDatosDeep(this.datosDeep);
			tipoinstitucionLogic.setIsConDeep(true);
			
			
			tipoinstitucionLogic.getTipoInstitucionDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipoinstitucionLogic.getTodosTipoInstitucions(finalQueryGlobal,pagination);
					
					//tipoinstitucionLogic.getTodosTipoInstitucionsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipoinstitucionLogic.getTipoInstitucions()==null|| tipoinstitucionLogic.getTipoInstitucions().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoinstitucionsAux= new ArrayList<TipoInstitucion>();
							tipoinstitucionsAux.addAll(tipoinstitucionLogic.getTipoInstitucions());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoinstitucionsAux= new ArrayList<TipoInstitucion>();
							tipoinstitucionsAux.addAll(tipoinstitucions);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoinstitucionLogic.getTodosTipoInstitucions(finalQueryGlobal+"",this.pagination);												
							
							//tipoinstitucionLogic.getTodosTipoInstitucionsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoInstitucions("Todos",tipoinstitucionLogic.getTipoInstitucions() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoinstitucionLogic.setTipoInstitucions(new ArrayList<TipoInstitucion>());					
							tipoinstitucionLogic.getTipoInstitucions().addAll(tipoinstitucionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoinstitucions=new ArrayList<TipoInstitucion>();
							tipoinstitucions.addAll(tipoinstitucionsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoInstitucion=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoInstitucion=this.idActual;
				
				} else if(this.idTipoInstitucionActual!=null && this.idTipoInstitucionActual!=0L) {
					idTipoInstitucion=idTipoInstitucionActual;
				}
				
					
				this.sDetalleReporte=TipoInstitucionConstantesFunciones.getDetalleIndicePorId(idTipoInstitucion);
				
				this.tipoinstitucions=new ArrayList<TipoInstitucion>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipoinstitucionLogic.getEntity(idTipoInstitucion);
					
					//tipoinstitucionLogic.getEntityWithConnection(idTipoInstitucion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoinstitucionLogic.setTipoInstitucions(new ArrayList<TipoInstitucion>());
					tipoinstitucionLogic.getTipoInstitucions().add(tipoinstitucionLogic.getTipoInstitucion());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoinstitucions=new ArrayList<TipoInstitucion>();
					this.tipoinstitucions.add(tipoinstitucion);
				}
				
				if(tipoinstitucionLogic.getTipoInstitucion()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TipoInstitucionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipoinstitucionLogic.getTipoInstitucionsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoInstitucionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoInstitucionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipoinstitucionLogic.getTipoInstitucions()==null||tipoinstitucionLogic.getTipoInstitucions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipoinstitucions==null|| tipoinstitucions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoinstitucionsAux=new ArrayList<TipoInstitucion>();
						tipoinstitucionsAux.addAll(tipoinstitucionLogic.getTipoInstitucions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoinstitucionsAux=new ArrayList<TipoInstitucion>();
							tipoinstitucionsAux.addAll(tipoinstitucions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipoinstitucionLogic.getTipoInstitucionsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoInstitucionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoInstitucionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoInstitucions("FK_IdEmpresa",tipoinstitucionLogic.getTipoInstitucions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoInstitucions("FK_IdEmpresa",tipoinstitucions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoinstitucionLogic.setTipoInstitucions(new ArrayList<TipoInstitucion>());
						tipoinstitucionLogic.getTipoInstitucions().addAll(tipoinstitucionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoinstitucions=new ArrayList<TipoInstitucion>();
							tipoinstitucions.addAll(tipoinstitucionsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoInstitucion();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoInstitucion();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoinstitucionLogic.getTipoInstitucions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoinstitucions.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoinstitucionLogic.getTipoInstitucions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoinstitucions.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoInstitucion tipoinstitucion) {
		Boolean permite=true;
		
		if(this.tipoinstitucion.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoInstitucionConstantesFunciones.getOrderByListaTipoInstitucion();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoInstitucionConstantesFunciones.getOrderByListaTipoInstitucion();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoInstitucion tipoinstitucion:tipoinstitucionLogic.getTipoInstitucions()) {
				if(tipoinstitucion.getsType().equals(Constantes2.S_TOTALES)) {
					tipoinstitucionTotales=tipoinstitucion;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoInstitucion tipoinstitucion:this.tipoinstitucions) {
				if(tipoinstitucion.getsType().equals(Constantes2.S_TOTALES)) {
					tipoinstitucionTotales=tipoinstitucion;
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
			this.tipoinstitucionAux=new TipoInstitucion();
			this.tipoinstitucionAux.setsType(Constantes2.S_TOTALES);
			this.tipoinstitucionAux.setIsNew(false);
			this.tipoinstitucionAux.setIsChanged(false);
			this.tipoinstitucionAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoInstitucionConstantesFunciones.TotalizarValoresFilaTipoInstitucion(this.tipoinstitucionLogic.getTipoInstitucions(),this.tipoinstitucionAux);
				
				this.tipoinstitucionLogic.getTipoInstitucions().add(this.tipoinstitucionAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoInstitucionConstantesFunciones.TotalizarValoresFilaTipoInstitucion(this.tipoinstitucions,this.tipoinstitucionAux);
				
				this.tipoinstitucions.add(this.tipoinstitucionAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipoinstitucionTotales=new TipoInstitucion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoinstitucionLogic.getTipoInstitucions().remove(tipoinstitucionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoinstitucions.remove(tipoinstitucionTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipoinstitucionTotales=new TipoInstitucion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoInstitucion tipoinstitucion:tipoinstitucionLogic.getTipoInstitucions()) {
				if(tipoinstitucion.getsType().equals(Constantes2.S_TOTALES)) {
					tipoinstitucionTotales=tipoinstitucion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoInstitucionConstantesFunciones.TotalizarValoresFilaTipoInstitucion(this.tipoinstitucionLogic.getTipoInstitucions(),tipoinstitucionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoInstitucion tipoinstitucion:this.tipoinstitucions) {
				if(tipoinstitucion.getsType().equals(Constantes2.S_TOTALES)) {
					tipoinstitucionTotales=tipoinstitucion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoInstitucionConstantesFunciones.TotalizarValoresFilaTipoInstitucion(this.tipoinstitucions,tipoinstitucionTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoInstitucionsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoInstitucionsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoinstitucionLogic.getTipoInstitucionsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosTipoInstitucion() {
		this.isPermisoTodoTipoInstitucion=false;
		this.isPermisoNuevoTipoInstitucion=false;
		this.isPermisoActualizarTipoInstitucion=false;
		this.isPermisoActualizarOriginalTipoInstitucion=false;
		this.isPermisoEliminarTipoInstitucion=false;
		this.isPermisoGuardarCambiosTipoInstitucion=false;
		this.isPermisoConsultaTipoInstitucion=false;
		this.isPermisoBusquedaTipoInstitucion=false;
		this.isPermisoReporteTipoInstitucion=false;		
		this.isPermisoOrdenTipoInstitucion=false;		
		this.isPermisoPaginacionMedioTipoInstitucion=false;		
		this.isPermisoPaginacionAltoTipoInstitucion=false;
		this.isPermisoPaginacionTodoTipoInstitucion=false;
		this.isPermisoCopiarTipoInstitucion=false;		
		this.isPermisoVerFormTipoInstitucion=false;		
		this.isPermisoDuplicarTipoInstitucion=false;		
		this.isPermisoOrdenTipoInstitucion=false;		
	}
	
	public void setPermisosUsuarioTipoInstitucion(Boolean isPermiso) {
		this.isPermisoTodoTipoInstitucion=isPermiso;
		this.isPermisoNuevoTipoInstitucion=isPermiso;
		this.isPermisoActualizarTipoInstitucion=isPermiso;
		this.isPermisoActualizarOriginalTipoInstitucion=isPermiso;
		this.isPermisoEliminarTipoInstitucion=isPermiso;
		this.isPermisoGuardarCambiosTipoInstitucion=isPermiso;
		this.isPermisoConsultaTipoInstitucion=isPermiso;
		this.isPermisoBusquedaTipoInstitucion=isPermiso;
		this.isPermisoReporteTipoInstitucion=isPermiso;
		this.isPermisoOrdenTipoInstitucion=isPermiso;		
		this.isPermisoPaginacionMedioTipoInstitucion=isPermiso;		
		this.isPermisoPaginacionAltoTipoInstitucion=isPermiso;		
		this.isPermisoPaginacionTodoTipoInstitucion=isPermiso;		
		this.isPermisoCopiarTipoInstitucion=isPermiso;		
		this.isPermisoVerFormTipoInstitucion=isPermiso;		
		this.isPermisoDuplicarTipoInstitucion=isPermiso;
		this.isPermisoOrdenTipoInstitucion=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoInstitucion(Boolean isPermiso) {
		//this.isPermisoTodoTipoInstitucion=isPermiso;
		this.isPermisoNuevoTipoInstitucion=isPermiso;
		this.isPermisoActualizarTipoInstitucion=isPermiso;
		this.isPermisoActualizarOriginalTipoInstitucion=isPermiso;
		this.isPermisoEliminarTipoInstitucion=isPermiso;
		this.isPermisoGuardarCambiosTipoInstitucion=isPermiso;
		//this.isPermisoConsultaTipoInstitucion=isPermiso;
		//this.isPermisoBusquedaTipoInstitucion=isPermiso;
		//this.isPermisoReporteTipoInstitucion=isPermiso;
		//this.isPermisoOrdenTipoInstitucion=isPermiso;		
		//this.isPermisoPaginacionMedioTipoInstitucion=isPermiso;		
		//this.isPermisoPaginacionAltoTipoInstitucion=isPermiso;		
		//this.isPermisoPaginacionTodoTipoInstitucion=isPermiso;		
		//this.isPermisoCopiarTipoInstitucion=isPermiso;		
		//this.isPermisoDuplicarTipoInstitucion=isPermiso;
		//this.isPermisoOrdenTipoInstitucion=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoInstitucionClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(CursoConstantesFunciones.SNOMBREOPCION);
		
		if(TipoInstitucionJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosCurso=false;
		this.isTienePermisosCurso=this.verificarGetPermisosUsuarioOpcionTipoInstitucionClaseRelacionada(this.opcionsRelacionadas,CursoConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoInstitucion(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoInstitucionClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosCurso=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoInstitucionClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoInstitucionClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoInstitucionClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosCurso && this.jInternalFrameDetalleFormTipoInstitucion!=null && this.jInternalFrameDetalleFormTipoInstitucion.cursoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoInstitucion.jTabbedPaneRelacionesTipoInstitucion.remove(this.jInternalFrameDetalleFormTipoInstitucion.cursoBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoInstitucion() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoInstitucionJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipoinstitucionSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoInstitucionConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoInstitucion=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoInstitucion=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoInstitucion=this.isPermisoActualizarTipoInstitucion;
			this.isPermisoEliminarTipoInstitucion=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoInstitucion=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoInstitucion=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoInstitucion=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoInstitucion=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoInstitucion=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoInstitucion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoInstitucion=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoInstitucion=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoInstitucion=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoInstitucion=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoInstitucion=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoInstitucion=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoInstitucion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipoinstitucionSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoInstitucion.setToolTipText(this.jTableDatosTipoInstitucion.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoInstitucion(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoInstitucion(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoInstitucionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoInstitucionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoInstitucion() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosCurso && this.tipoinstitucionConstantesFunciones.mostrarCursoTipoInstitucion && !TipoInstitucionConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Curso");
			reporte.setsDescripcion("Curso");
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
	public void inicializarCombosForeignKeyTipoInstitucionListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoInstitucionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoInstitucionJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoInstitucionListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	public void cargarCombosLoteForeignKeyTipoInstitucionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoInstitucionParameterReturnGeneral tipoinstitucionReturnGeneral=new TipoInstitucionParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tipoinstitucionConstantesFunciones.cargarid_empresaTipoInstitucion)
					 || (this.esRecargarFks && this.tipoinstitucionConstantesFunciones.cargarid_empresaTipoInstitucion)) {

					if(!this.tipoinstitucionSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tipoinstitucionSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipoinstitucionReturnGeneral=tipoinstitucionLogic.cargarCombosLoteForeignKeyTipoInstitucion(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tipoinstitucionReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoInstitucion()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tipoinstitucionSessionBean==null) {
				this.tipoinstitucionSessionBean=new TipoInstitucionSessionBean();
			}

			if(!this.tipoinstitucionSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyTipoInstitucion()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoInstitucion(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoInstitucion()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoInstitucion();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoInstitucion(TipoInstitucion tipoinstitucion)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoInstitucion(TipoInstitucion tipoinstitucion,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoInstitucion()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoInstitucion()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoInstitucion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoInstitucion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoInstitucion()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoInstitucion()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoInstitucion(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoInstitucion()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoInstitucion.jComboBoxid_empresaTipoInstitucion!=null && this.jInternalFrameDetalleFormTipoInstitucion.jComboBoxid_empresaTipoInstitucion.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoInstitucion.jComboBoxid_empresaTipoInstitucion.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoInstitucionBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoInstitucionBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoInstitucionBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipoinstitucionSessionBean=new TipoInstitucionSessionBean(); 
		this.tipoinstitucionConstantesFunciones=new TipoInstitucionConstantesFunciones(); 
		this.tipoinstitucionBean=new TipoInstitucion();//(this.tipoinstitucionConstantesFunciones); 		
		this.tipoinstitucionReturnGeneral=new TipoInstitucionParameterReturnGeneral(); 
		
		this.tipoinstitucionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoinstitucionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoInstitucionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoInstitucionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoInstitucionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoInstitucion(true);
			
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
			
			this.tipoinstitucionConstantesFunciones=new TipoInstitucionConstantesFunciones(); 
			this.tipoinstitucionBean=new TipoInstitucion();//this.tipoinstitucionConstantesFunciones); 			
			this.tipoinstitucionReturnGeneral=new TipoInstitucionParameterReturnGeneral(); 
		
			TipoInstitucionBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Institucion Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipoinstitucion=new TipoInstitucion();
			this.tipoinstitucions = new ArrayList<TipoInstitucion>();
			this.tipoinstitucionsAux = new ArrayList<TipoInstitucion>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinstitucionLogic=new TipoInstitucionLogic();
				this.tipoinstitucionLogic.getNewConnexionToDeep("");
			}
			
			//this.tipoinstitucionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipoinstitucionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoInstitucion);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoInstitucion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoInstitucion);	
					}
					
					if(this.jInternalFrameImportacionTipoInstitucion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoInstitucion);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoInstitucion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoInstitucion);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoInstitucion!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoInstitucion);
				this.jInternalFrameDetalleFormTipoInstitucion.setVisible(false);
				this.jInternalFrameDetalleFormTipoInstitucion.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoInstitucion!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoInstitucion);
					this.jInternalFrameReporteDinamicoTipoInstitucion.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoInstitucion.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoInstitucion!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoInstitucion);
					this.jInternalFrameImportacionTipoInstitucion.setVisible(false);
					this.jInternalFrameImportacionTipoInstitucion.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoInstitucion!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoInstitucion);
					this.jInternalFrameOrderByTipoInstitucion.setVisible(false);
					this.jInternalFrameOrderByTipoInstitucion.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoInstitucionActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoInstitucionConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipoinstitucionReturnGeneral=new TipoInstitucionParameterReturnGeneral();
			
			this.tipoinstitucionParameterGeneral=new TipoInstitucionParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipoinstitucionLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipoinstitucionSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoInstitucionJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipoinstitucionSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(CursoConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoInstitucionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoinstitucionSessionBean.getEsGuardarRelacionado(),this.tipoinstitucionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoInstitucionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoinstitucionSessionBean.getEsGuardarRelacionado(),this.tipoinstitucionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoInstitucion=false;
			this.isVisibilidadCeldaDuplicarTipoInstitucion=true;
			this.isVisibilidadCeldaCopiarTipoInstitucion=true;
			this.isVisibilidadCeldaVerFormTipoInstitucion=true;
			this.isVisibilidadCeldaOrdenTipoInstitucion=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoInstitucion=false;
			this.isVisibilidadCeldaModificarTipoInstitucion=false;
			this.isVisibilidadCeldaActualizarTipoInstitucion=false;
			this.isVisibilidadCeldaEliminarTipoInstitucion=false;
			this.isVisibilidadCeldaCancelarTipoInstitucion=false;
			this.isVisibilidadCeldaGuardarTipoInstitucion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoInstitucion=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoInstitucion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoInstitucion();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoInstitucion(false);
			
			this.setPermisosUsuarioTipoInstitucion();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoinstitucionSessionBean.getEsGuardarRelacionado() 
				|| (this.tipoinstitucionSessionBean.getEsGuardarRelacionado() && this.tipoinstitucionSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoInstitucionClasesRelacionadas();
			}
			
			if(this.tipoinstitucionSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoInstitucionClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoInstitucionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoInstitucion();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoInstitucion();
			}
			
			if(!this.isPermisoBusquedaTipoInstitucion) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoInstitucion.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoinstitucionSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoInstitucion,this.isPermisoPaginacionMedioTipoInstitucion,this.isPermisoPaginacionTodoTipoInstitucion);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoInstitucionConstantesFunciones.getTiposSeleccionarTipoInstitucion());
				
				this.tiposColumnasSelect=TipoInstitucionConstantesFunciones.getTiposSeleccionarTipoInstitucion(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoInstitucion();				
				//this.tiposRelacionesSelect=TipoInstitucionConstantesFunciones.getTiposRelacionesTipoInstitucion(true);
				
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
			//if(!this.tipoinstitucionSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoInstitucion();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoInstitucion(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoInstitucion(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoInstitucion() ;
			
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
			
			
			this.cursoLogic=new CursoLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				tipoinstitucionImplementable= (TipoInstitucionImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoInstitucionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipoinstitucionImplementableHome= (TipoInstitucionImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoInstitucionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipoinstitucions= new ArrayList<TipoInstitucion>();
			this.tipoinstitucionsEliminados= new ArrayList<TipoInstitucion>();
						
			this.isEsNuevoTipoInstitucion=false;
			this.esParaAccionDesdeFormularioTipoInstitucion=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoInstitucion(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoInstitucion();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoinstitucionSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoInstitucionConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoInstitucion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoInstitucion(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoInstitucion!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoInstitucion();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoInstitucion();
			}
			
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoInstitucion.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoInstitucion.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoInstitucion.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinstitucionLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoInstitucion(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoInstitucion: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinstitucionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinstitucionLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoInstitucion() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(CursoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(CursoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoInstitucion")) {
				iIndex=this.jInternalFrameDetalleFormTipoInstitucion.jTabbedPaneRelacionesTipoInstitucion.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoInstitucion.jTabbedPaneRelacionesTipoInstitucion.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoInstitucion.getSelectedRow();	
				
				

				if(sTitle.equals("Cursos")) {
					if(!CursoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoInstitucion();

						this.cargarParteTabPanelRelacionadaCurso(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoInstitucion();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaCurso(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoInstitucion.cargarSessionConBeanSwingJInternalFrameCurso(false,true,iIndex);
		this.jButtonCursoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaCurso();

		//this.jTabbedPaneRelacionesTipoInstitucion.updateUI();
		//this.jTabbedPaneRelacionesTipoInstitucion.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoInstitucion.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("Curso")) {
				int row=this.jTableDatosTipoInstitucion.getSelectedRow();
				jButtonCursoActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipoinstitucionSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Curso")) {

					if(this.isTienePermisosCurso && this.tipoinstitucionConstantesFunciones.mostrarCursoTipoInstitucion && !TipoInstitucionConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Cursos"+"("+CursoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Cursos");

						if(tipoinstitucionConstantesFunciones.resaltarCursoTipoInstitucion!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipoinstitucionConstantesFunciones.resaltarCursoTipoInstitucion);
						}

						jmenuItem.setEnabled(this.tipoinstitucionConstantesFunciones.activarCursoTipoInstitucion);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Curso"));

						

						this.jInternalFrameDetalleFormTipoInstitucion.jmenuDetalleTipoInstitucion.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoInstitucion(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoInstitucion(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoInstitucion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoInstitucionListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoInstitucion();
		
		this.cargarCombosFrameForeignKeyTipoInstitucion();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoInstitucion();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoInstitucion();
		}
	}
	
	
	
	public void jButtonNuevoTipoInstitucionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipoinstitucionSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoInstitucion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoInstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoinstitucion,new Object(),this.tipoinstitucionParameterGeneral,this.tipoinstitucionReturnGeneral);
			
			
			if(jTableDatosTipoInstitucion.getRowCount()>=1) {
				jTableDatosTipoInstitucion.removeRowSelectionInterval(0, jTableDatosTipoInstitucion.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoInstitucion=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoInstitucion(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoInstitucion(true);			
			//this.tipoinstitucion=new TipoInstitucion();
			//this.tipoinstitucion.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoInstitucion(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoInstitucion() ;
			
			if(TipoInstitucionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoInstitucion(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipoinstitucion);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipoinstitucion);				
			
			TipoInstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoinstitucion,new Object(),this.tipoinstitucionParameterGeneral,this.tipoinstitucionReturnGeneral);
			
			if(this.tipoinstitucionSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoInstitucion: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoInstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipoinstitucion,new Object(),this.tipoinstitucionParameterGeneral,this.tipoinstitucionReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoInstitucionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoInstitucion> tipoinstitucionsSeleccionados=new ArrayList<TipoInstitucion>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoInstitucion.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoInstitucion.getSelectedRows().length;			
			}
			
			tipoinstitucionsSeleccionados=this.getTipoInstitucionsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoInstitucion--;			
				//TipoInstitucion tipoinstitucionAux= new TipoInstitucion();			
				//tipoinstitucionAux.setId(this.iIdNuevoTipoInstitucion);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoInstitucion tipoinstitucionOrigen=new TipoInstitucion();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoInstitucion tipoinstitucionOrigen : tipoinstitucionsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoInstitucion.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipoinstitucionOrigen =(TipoInstitucion) this.tipoinstitucionLogic.getTipoInstitucions().toArray()[this.jTableDatosTipoInstitucion.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoinstitucionOrigen =(TipoInstitucion) this.tipoinstitucions.toArray()[this.jTableDatosTipoInstitucion.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoInstitucion();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipoinstitucion.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoInstitucion(tipoinstitucionOrigen,this.tipoinstitucion,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoInstitucion(this.tipoinstitucion);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoinstitucionLogic.getTipoInstitucions().add(this.tipoinstitucionAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoinstitucions.add(this.tipoinstitucionAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoInstitucion(false);
				
				this.jTableDatosTipoInstitucion.setRowSelectionInterval(this.getIndiceNuevoTipoInstitucion(), this.getIndiceNuevoTipoInstitucion());
				
				int iLastRow =  this.jTableDatosTipoInstitucion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoInstitucion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoInstitucion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoInstitucion(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoInstitucionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoInstitucion> tipoinstitucionsSeleccionados=new ArrayList<TipoInstitucion>();									
		
			TipoInstitucion tipoinstitucionOrigen=new TipoInstitucion();
			TipoInstitucion tipoinstitucionDestino=new TipoInstitucion();
				
			tipoinstitucionsSeleccionados=this.getTipoInstitucionsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoInstitucion.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipoinstitucionsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoInstitucion.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoinstitucionOrigen =(TipoInstitucion) this.tipoinstitucionLogic.getTipoInstitucions().toArray()[this.jTableDatosTipoInstitucion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoinstitucionOrigen =(TipoInstitucion) this.tipoinstitucions.toArray()[this.jTableDatosTipoInstitucion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoinstitucionDestino =(TipoInstitucion) this.tipoinstitucionLogic.getTipoInstitucions().toArray()[this.jTableDatosTipoInstitucion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoinstitucionDestino =(TipoInstitucion) this.tipoinstitucions.toArray()[this.jTableDatosTipoInstitucion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipoinstitucionOrigen =tipoinstitucionsSeleccionados.get(0);
				tipoinstitucionDestino =tipoinstitucionsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoInstitucion(tipoinstitucionOrigen,tipoinstitucionDestino,true,false);
				
				tipoinstitucionDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoinstitucionDestino,tipoinstitucionLogic.getTipoInstitucions());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoinstitucionDestino,tipoinstitucions);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoInstitucion(false);
				
				//this.jTableDatosTipoInstitucion.setRowSelectionInterval(this.getIndiceNuevoTipoInstitucion(), this.getIndiceNuevoTipoInstitucion());
				
				int iLastRow =  this.jTableDatosTipoInstitucion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoInstitucion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoInstitucion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoInstitucion(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoInstitucionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoInstitucion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoInstitucion.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoInstitucionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoInstitucion.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoInstitucion.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoInstitucion.setVisible(!isVisible);
			this.jPanelPaginacionTipoInstitucion.setVisible(!isVisible);
			this.jPanelAccionesTipoInstitucion.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoInstitucionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoInstitucion();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoInstitucionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoInstitucion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoInstitucionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoInstitucion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoInstitucionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoInstitucion();
			
			this.abrirFrameOrderByTipoInstitucion();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoInstitucionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoInstitucion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoInstitucion(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoInstitucion);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoInstitucion.isMaximum()) {
					this.jInternalFrameDetalleFormTipoInstitucion.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoInstitucion.setSize(this.jInternalFrameDetalleFormTipoInstitucion.iWidthFormulario,this.jInternalFrameDetalleFormTipoInstitucion.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoInstitucion.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoInstitucion.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoInstitucion.isMaximum()) {
						this.jInternalFrameDetalleFormTipoInstitucion.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoInstitucion.jContentPaneDetalleTipoInstitucion.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoInstitucion.jTabbedPaneRelacionesTipoInstitucion.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoInstitucion.jContentPaneDetalleTipoInstitucion.getWidth(),TipoInstitucionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoInstitucion.jTabbedPaneRelacionesTipoInstitucion.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoInstitucion.jContentPaneDetalleTipoInstitucion.getWidth(),TipoInstitucionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoInstitucion.jTabbedPaneRelacionesTipoInstitucion.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoInstitucion.jContentPaneDetalleTipoInstitucion.getWidth(),TipoInstitucionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(CursoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaCurso();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoInstitucion.setVisible(true);
	        this.jInternalFrameDetalleFormTipoInstitucion.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoInstitucion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoInstitucion==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoInstitucion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoInstitucion,false,this);
				} else {
					this.jInternalFrameOrderByTipoInstitucion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoInstitucion,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoInstitucion);
				this.jInternalFrameOrderByTipoInstitucion.setVisible(false);
				this.jInternalFrameOrderByTipoInstitucion.setSelected(false);
				
				this.jInternalFrameOrderByTipoInstitucion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoInstitucion"));
				
				this.inicializarActualizarBindingTablaOrderByTipoInstitucion();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoInstitucion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoInstitucion==null) {
				
				this.jInternalFrameImportacionTipoInstitucion=new ImportacionJInternalFrame(TipoInstitucionConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoInstitucion);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoInstitucion);
				this.jInternalFrameImportacionTipoInstitucion.setVisible(false);
				this.jInternalFrameImportacionTipoInstitucion.setSelected(false);


				this.jInternalFrameImportacionTipoInstitucion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoInstitucion"));
				this.jInternalFrameImportacionTipoInstitucion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoInstitucion"));
				this.jInternalFrameImportacionTipoInstitucion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoInstitucion"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoInstitucion() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoInstitucion==null) {
				this.jInternalFrameReporteDinamicoTipoInstitucion=new ReporteDinamicoJInternalFrame(TipoInstitucionConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoInstitucion);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoInstitucion);
				this.jInternalFrameReporteDinamicoTipoInstitucion.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoInstitucion.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoInstitucion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoInstitucion"));
				this.jInternalFrameReporteDinamicoTipoInstitucion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoInstitucion"));
				this.jInternalFrameReporteDinamicoTipoInstitucion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoInstitucion"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoInstitucion();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaCurso() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoInstitucion.cursoBeanSwingJInternalFrame.jScrollPanelDatosCurso.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoInstitucion.jContentPaneDetalleTipoInstitucion.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoInstitucion.cursoBeanSwingJInternalFrame.jScrollPanelDatosCurso.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoInstitucion.cursoBeanSwingJInternalFrame.jScrollPanelDatosCurso.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoInstitucion.cursoBeanSwingJInternalFrame.jScrollPanelDatosCurso.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoInstitucion() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoInstitucion);
			
	       	this.jInternalFrameDetalleFormTipoInstitucion.setVisible(false);
	        this.jInternalFrameDetalleFormTipoInstitucion.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoInstitucion.dispose();
			//this.jInternalFrameDetalleFormTipoInstitucion=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoInstitucion() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoInstitucion.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoInstitucion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoInstitucion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoInstitucion.setVisible(true);
	        this.jInternalFrameImportacionTipoInstitucion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoInstitucion() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoInstitucion.setVisible(true);
	        this.jInternalFrameOrderByTipoInstitucion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoInstitucion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoInstitucion.setVisible(false);
	        this.jInternalFrameOrderByTipoInstitucion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoInstitucion() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoInstitucion.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoInstitucion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoInstitucion() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoInstitucion.setVisible(false);
	        this.jInternalFrameImportacionTipoInstitucion.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoInstitucionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoInstitucion(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoInstitucion(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoInstitucion.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoInstitucion(true);
			//this.isEsNuevoTipoInstitucion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinstitucion =(TipoInstitucion) this.tipoinstitucionLogic.getTipoInstitucions().toArray()[this.jTableDatosTipoInstitucion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoinstitucion =(TipoInstitucion) this.tipoinstitucions.toArray()[this.jTableDatosTipoInstitucion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoInstitucion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoInstitucion(false) ;
			
			if(tipoinstitucionSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoInstitucion.cursoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoInstitucion.cursoBeanSwingJInternalFrame.cursoSessionBean.getEsGuardarRelacionado() && CursoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCursoActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoInstitucionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoInstitucion(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoInstitucion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoInstitucionActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoInstitucion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinstitucion =(TipoInstitucion) this.tipoinstitucionLogic.getTipoInstitucions().toArray()[this.jTableDatosTipoInstitucion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoinstitucion =(TipoInstitucion) this.tipoinstitucions.toArray()[this.jTableDatosTipoInstitucion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoInstitucion(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoInstitucion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoInstitucion.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoInstitucion(true);
			//this.isEsNuevoTipoInstitucion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinstitucion =(TipoInstitucion) this.tipoinstitucionLogic.getTipoInstitucions().toArray()[this.jTableDatosTipoInstitucion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoinstitucion =(TipoInstitucion) this.tipoinstitucions.toArray()[this.jTableDatosTipoInstitucion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipoinstitucion.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoInstitucion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoInstitucion(false) ;
			
			if(TipoInstitucionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoInstitucion(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoInstitucion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarTipoInstitucionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinstitucionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoInstitucion(false);
			
			//if(!this.isEsNuevoTipoInstitucion) {								
				int intSelectedRow = this.jTableDatosTipoInstitucion.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinstitucion =(TipoInstitucion) this.tipoinstitucionLogic.getTipoInstitucions().toArray()[this.jTableDatosTipoInstitucion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoinstitucion =(TipoInstitucion) this.tipoinstitucions.toArray()[this.jTableDatosTipoInstitucion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoInstitucionJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoInstitucion(this.tipoinstitucion,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoInstitucion(this.tipoinstitucion);
				
			}
			
			if(this.permiteMantenimiento(this.tipoinstitucion)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoinstitucionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoInstitucion=true;
					this.inicializarActualizarBindingTablaTipoInstitucion(false);
					this.isEsNuevoTipoInstitucion=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoInstitucion=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoInstitucion=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoInstitucion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoInstitucion(false);
				
				this.habilitarDeshabilitarControlesTipoInstitucion(false);
			
												
				
				if(TipoInstitucionJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoInstitucion();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoInstitucionActionPerformed(evt,tipoinstitucionSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoInstitucion(this.tipoinstitucion,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoInstitucion.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipoinstitucionSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinstitucionLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipoinstitucion.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoInstitucion.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoInstitucion.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinstitucionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinstitucionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoInstitucionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinstitucionLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoInstitucion.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinstitucion =(TipoInstitucion) this.tipoinstitucionLogic.getTipoInstitucions().toArray()[this.jTableDatosTipoInstitucion.convertRowIndexToModel(intSelectedRow)];
				this.tipoinstitucion.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoinstitucion =(TipoInstitucion) this.tipoinstitucions.toArray()[this.jTableDatosTipoInstitucion.convertRowIndexToModel(intSelectedRow)];
				this.tipoinstitucion.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipoinstitucion)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoinstitucionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoInstitucionModel) this.jTableDatosTipoInstitucion.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoInstitucion=true;
				this.inicializarActualizarBindingTablaTipoInstitucion(false);
				this.isEsNuevoTipoInstitucion=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoInstitucion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoInstitucion(false);
				
				this.habilitarDeshabilitarControlesTipoInstitucion(false);
				
				
				
				if(TipoInstitucionJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoInstitucion();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinstitucionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinstitucionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinstitucionLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoInstitucionActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoInstitucion.getRowCount()>=1) {
				jTableDatosTipoInstitucion.removeRowSelectionInterval(0, jTableDatosTipoInstitucion.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoInstitucion(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoInstitucion(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoInstitucion(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoInstitucion(false) ;
			
			this.isEsNuevoTipoInstitucion=false;
			
			if(TipoInstitucionJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoInstitucion();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoInstitucionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinstitucionLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoInstitucion(false);
				
				//SI ES MANUAL
				if(TipoInstitucionJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoInstitucion();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinstitucionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinstitucionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinstitucionLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoInstitucionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoInstitucion--;			
			//TipoInstitucion tipoinstitucionAux= new TipoInstitucion();			
			//tipoinstitucionAux.setId(this.iIdNuevoTipoInstitucion);
			
			if(this.jInternalFrameDetalleFormTipoInstitucion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoInstitucion();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoInstitucion(this.tipoinstitucion);
			
			this.tipoinstitucion.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipoinstitucionLogic.getTipoInstitucions().add(this.tipoinstitucionAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipoinstitucions.add(this.tipoinstitucionAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoInstitucion(false);
			
			this.jTableDatosTipoInstitucion.setRowSelectionInterval(this.getIndiceNuevoTipoInstitucion(), this.getIndiceNuevoTipoInstitucion());
			
			int iLastRow =  this.jTableDatosTipoInstitucion.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoInstitucion.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoInstitucion.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoInstitucion(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoInstitucionActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinstitucionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoInstitucion(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoInstitucion(false);
			
			//SI ES MANUAL
			if(TipoInstitucionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoInstitucion();
			}
			
			//this.abrirFrameTreeTipoInstitucion();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinstitucionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinstitucionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinstitucionLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoInstitucionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo InstitucionES ?", "MANTENIMIENTO DE Tipo Institucion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoInstitucion.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoInstitucion();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipoinstitucionReturnGeneral=tipoinstitucionLogic.procesarImportacionTipoInstitucionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipoinstitucionParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoInstitucionReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoInstitucionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoInstitucion.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoInstitucion.setFileImportacion(this.jInternalFrameImportacionTipoInstitucion.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoInstitucion.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoInstitucion.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoInstitucion.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoInstitucion.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoInstitucionActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoInstitucion> tipoinstitucionsSeleccionados=new ArrayList<TipoInstitucion>();		

		tipoinstitucionsSeleccionados=this.getTipoInstitucionsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoInstitucion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoInstitucion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoInstitucionBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoInstitucionBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoInstitucions("Todos",tipoinstitucionsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoinstitucionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Institucion",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoInstitucion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoInstitucion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoInstitucionConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoInstitucionConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoInstitucionConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoTipoInstitucion.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoInstitucion.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoInstitucion.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoInstitucionConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TipoInstitucionConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoInstitucionConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoInstitucion.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoInstitucionConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TipoInstitucionConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoInstitucionConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoInstitucion.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoInstitucion.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoInstitucionConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TipoInstitucionConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoInstitucionConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoInstitucionActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoInstitucion> tipoinstitucionsSeleccionados=new ArrayList<TipoInstitucion>();		
		
		tipoinstitucionsSeleccionados=this.getTipoInstitucionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoinstitucion";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoInstitucions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoInstitucion.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoInstitucion.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoInstitucionConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoInstitucionConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TipoInstitucion tipoinstitucion:tipoinstitucionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoinstitucion.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoInstitucionConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoInstitucionConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoInstitucion tipoinstitucion:tipoinstitucionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoinstitucion.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoInstitucionConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoInstitucionConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoInstitucion tipoinstitucion:tipoinstitucionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoinstitucion.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoInstitucion(row);				
			//	iRow++;
			//}				
			
			//for(TipoInstitucion tipoinstitucionAux:tipoinstitucionsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoInstitucion(tipoinstitucionAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoinstitucionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Institucion",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipoinstitucionLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoInstitucion(false);
			
			//SI ES MANUAL
			if(TipoInstitucionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoInstitucion();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinstitucionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinstitucionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinstitucionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoInstitucionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinstitucionLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoInstitucion(false);
			
			//SI ES MANUAL
			if(TipoInstitucionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoInstitucion();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinstitucionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinstitucionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinstitucionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoInstitucionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinstitucionLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoInstitucion(false);
			
			//SI ES MANUAL
			if(TipoInstitucionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoInstitucion();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinstitucionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinstitucionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinstitucionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoInstitucion() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoInstitucion.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoInstitucion.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoInstitucion.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoInstitucion.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoInstitucion.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoInstitucion.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoInstitucion.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoInstitucion(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoInstitucion(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoInstitucion(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoInstitucion(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoInstitucion(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoinstitucionSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoInstitucion(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoInstitucion(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoInstitucion(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoInstitucionJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoInstitucionJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoInstitucion() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoInstitucion();
		
		this.inicializarActualizarBindingBotonesManualTipoInstitucion(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoinstitucionSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoInstitucion();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoInstitucion() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoInstitucion(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoInstitucion(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoInstitucion.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoInstitucion.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoInstitucion.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoInstitucion!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoInstitucion.jCheckBoxPostAccionNuevoTipoInstitucion.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoInstitucion.jCheckBoxPostAccionSinCerrarTipoInstitucion.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoInstitucion.jCheckBoxPostAccionSinMensajeTipoInstitucion.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoInstitucion.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoInstitucion.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoInstitucion.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoInstitucion!=null) {
				this.jInternalFrameDetalleFormTipoInstitucion.jCheckBoxPostAccionNuevoTipoInstitucion.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoInstitucion.jCheckBoxPostAccionSinCerrarTipoInstitucion.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoInstitucion.jCheckBoxPostAccionSinMensajeTipoInstitucion.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoInstitucion.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoInstitucion.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoInstitucion!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoInstitucion.jComboBoxTiposAccionesFormularioTipoInstitucion.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoInstitucion.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoInstitucion!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoInstitucion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoInstitucion.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoInstitucion.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoInstitucion.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoInstitucion.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoInstitucion!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoInstitucion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoInstitucion.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoInstitucion.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoInstitucion(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoInstitucionJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoInstitucion(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoInstitucion() throws Exception {
		try	{
			if(TipoInstitucionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoInstitucion();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoInstitucion() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoInstitucion.jComboBoxTiposAccionesFormularioTipoInstitucion.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoInstitucion.jComboBoxTiposAccionesFormularioTipoInstitucion.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoInstitucion() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoInstitucion.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoInstitucion.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoInstitucion.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoInstitucion.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoInstitucion.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoInstitucion.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoInstitucion.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoInstitucion.addItem(reporte);
			}
			
			
			if(!this.tipoinstitucionSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoInstitucion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoInstitucion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoInstitucion.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoInstitucion.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoInstitucion.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoInstitucion.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoInstitucion!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoInstitucion.jComboBoxTiposAccionesFormularioTipoInstitucion.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoInstitucion.jComboBoxTiposAccionesFormularioTipoInstitucion.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoInstitucion.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoInstitucion.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoInstitucion.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoInstitucion();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoInstitucion() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoInstitucion!=null) {
				this.jInternalFrameReporteDinamicoTipoInstitucion.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoInstitucion.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoInstitucion!=null) {
				this.jInternalFrameReporteDinamicoTipoInstitucion.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoInstitucion.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoInstitucion!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoInstitucion.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoInstitucion.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoInstitucion.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoInstitucion.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoInstitucion.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoInstitucion.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoInstitucion()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoInstitucion(Boolean esInicializar) throws Exception {				
		if(TipoInstitucionJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoInstitucion();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoInstitucion() throws Exception {
		this.inicializarActualizarBindingTablaTipoInstitucion(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoInstitucion() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoInstitucion.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoInstitucion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoInstitucion.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoInstitucionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoInstitucion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoInstitucion.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoInstitucionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoInstitucionOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoInstitucionOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoInstitucionPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoInstitucion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoInstitucion.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoInstitucionPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoInstitucion.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoInstitucion(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipoinstitucionLogic.getTipoInstitucions().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipoinstitucions.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoInstitucionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoInstitucion.setModel(new TipoInstitucionModel(this.tipoinstitucionLogic.getTipoInstitucions(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoInstitucion.setModel(new TipoInstitucionModel(this.tipoinstitucions,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoInstitucion!=null && this.jInternalFrameOrderByTipoInstitucion.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoInstitucion();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoInstitucion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoInstitucion,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoInstitucionPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoInstitucionConstantesFunciones.SCLASSWEBTITULO,tipoinstitucionConstantesFunciones.resaltarSeleccionarTipoInstitucion,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoInstitucionConstantesFunciones.SCLASSWEBTITULO,tipoinstitucionConstantesFunciones.resaltarSeleccionarTipoInstitucion,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoInstitucion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoInstitucion,TipoInstitucionConstantesFunciones.LABEL_ID));

		if(this.tipoinstitucionConstantesFunciones.mostraridTipoInstitucion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoInstitucionConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipoinstitucionConstantesFunciones.resaltaridTipoInstitucion,this.tipoinstitucionConstantesFunciones.activaridTipoInstitucion,this,true,"idTipoInstitucion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoinstitucionConstantesFunciones.resaltaridTipoInstitucion,this.tipoinstitucionConstantesFunciones.activaridTipoInstitucion,this,true,"idTipoInstitucion","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoInstitucion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoInstitucion,TipoInstitucionConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tipoinstitucionConstantesFunciones.mostrarid_empresaTipoInstitucion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoInstitucionConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tipoinstitucionConstantesFunciones.resaltarid_empresaTipoInstitucion,this,this.tipoinstitucionConstantesFunciones.activarid_empresaTipoInstitucion));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tipoinstitucionConstantesFunciones.resaltarid_empresaTipoInstitucion,this,this.tipoinstitucionConstantesFunciones.activarid_empresaTipoInstitucion,false,"id_empresaTipoInstitucion","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoInstitucionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoInstitucion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoInstitucion,TipoInstitucionConstantesFunciones.LABEL_CODIGO));

		if(this.tipoinstitucionConstantesFunciones.mostrarcodigoTipoInstitucion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoInstitucionConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoinstitucionConstantesFunciones.resaltarcodigoTipoInstitucion,this.tipoinstitucionConstantesFunciones.activarcodigoTipoInstitucion,this,true,"codigoTipoInstitucion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoinstitucionConstantesFunciones.resaltarcodigoTipoInstitucion,this.tipoinstitucionConstantesFunciones.activarcodigoTipoInstitucion,this,true,"codigoTipoInstitucion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoInstitucionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoInstitucion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoInstitucion,TipoInstitucionConstantesFunciones.LABEL_NOMBRE));

		if(this.tipoinstitucionConstantesFunciones.mostrarnombreTipoInstitucion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoInstitucionConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoinstitucionConstantesFunciones.resaltarnombreTipoInstitucion,this.tipoinstitucionConstantesFunciones.activarnombreTipoInstitucion,this,true,"nombreTipoInstitucion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoinstitucionConstantesFunciones.resaltarnombreTipoInstitucion,this.tipoinstitucionConstantesFunciones.activarnombreTipoInstitucion,this,true,"nombreTipoInstitucion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoInstitucionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipoinstitucionSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosCurso && this.tipoinstitucionConstantesFunciones.mostrarCursoTipoInstitucion && !TipoInstitucionConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Cursos");
				tableColumn.setHeaderValue("Cursos");
				tableColumn.setCellRenderer(new CursoTableCell(tipoinstitucionConstantesFunciones.resaltarCursoTipoInstitucion,this,this.tipoinstitucionConstantesFunciones.activarCursoTipoInstitucion));
				tableColumn.setCellEditor(new CursoTableCell(tipoinstitucionConstantesFunciones.resaltarCursoTipoInstitucion,this,this.tipoinstitucionConstantesFunciones.activarCursoTipoInstitucion));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoInstitucion.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoinstitucionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoinstitucionSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoInstitucion.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoinstitucionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoinstitucionSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoInstitucion.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoInstitucion && this.isPermisoGuardarCambiosTipoInstitucion) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipoinstitucionSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipoinstitucionSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoInstitucion.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipoinstitucionSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosTipoInstitucion.addColumn(tableColumn);
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
			
			this.jTableDatosTipoInstitucion.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoInstitucion && this.isPermisoGuardarCambiosTipoInstitucion) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipoinstitucionSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoInstitucion && this.isPermisoGuardarCambiosTipoInstitucion) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoInstitucion.moveColumn(this.jTableDatosTipoInstitucion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoInstitucion.moveColumn(this.jTableDatosTipoInstitucion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipoinstitucionSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoInstitucion.moveColumn(this.jTableDatosTipoInstitucion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoInstitucion.moveColumn(this.jTableDatosTipoInstitucion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoInstitucion.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoInstitucion.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoInstitucion,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoInstitucionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoInstitucion.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoInstitucion.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoInstitucionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoInstitucionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoInstitucion.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoInstitucion.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoInstitucion.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipoinstitucionLogic.getTipoInstitucions().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipoinstitucions.size()-1;
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
		//this.jTableDatosTipoInstitucion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoInstitucion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoInstitucion();
			
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
				
				//this.isEsNuevoTipoInstitucion=false;
					
				TipoInstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoinstitucion,new Object(),this.tipoinstitucionParameterGeneral,this.tipoinstitucionReturnGeneral);
			
				if(this.tipoinstitucionSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoInstitucion==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoInstitucion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoInstitucion.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinstitucion =(TipoInstitucion) this.tipoinstitucionLogic.getTipoInstitucions().toArray()[this.jTableDatosTipoInstitucion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoinstitucion =(TipoInstitucion) this.tipoinstitucions.toArray()[this.jTableDatosTipoInstitucion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipoinstitucion.getsType().equals("DUPLICADO")
				   || this.tipoinstitucion.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoInstitucion=true;
				
				} else {
					this.isEsNuevoTipoInstitucion=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipoinstitucionSessionBean.getEsGuardarRelacionado()) {
					if(this.tipoinstitucion.getId()>=0 && !this.tipoinstitucion.getIsNew()) {						
						this.isEsNuevoTipoInstitucion=false;
						
					} else {
						this.isEsNuevoTipoInstitucion=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoInstitucion(esRelaciones);						
				
				this.seleccionarTipoInstitucion(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipoinstitucion.getId()<0) {
					this.isEsNuevoTipoInstitucion=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoInstitucion(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoInstitucion(evt,rowIndex);
				}	
				
				if(this.tipoinstitucionSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoInstitucion: " + this.dDif); 
					}
				}								
				
				TipoInstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoinstitucion,new Object(),this.tipoinstitucionParameterGeneral,this.tipoinstitucionReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoInstitucion(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipoinstitucion)) {
					if(this.tipoinstitucion.getId()>0) {
						this.tipoinstitucion.setIsDeleted(true);
						
						this.tipoinstitucionsEliminados.add(this.tipoinstitucion);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoinstitucionLogic.getTipoInstitucions().remove(this.tipoinstitucion);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoinstitucions.remove(this.tipoinstitucion);				
					}
					
					
					((TipoInstitucionModel) this.jTableDatosTipoInstitucion.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoInstitucion(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoInstitucion(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoInstitucion) {
			
			if(this.jInternalFrameDetalleFormTipoInstitucion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoInstitucion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoInstitucion.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinstitucion =(TipoInstitucion) this.tipoinstitucionLogic.getTipoInstitucions().toArray()[this.jTableDatosTipoInstitucion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoinstitucion =(TipoInstitucion) this.tipoinstitucions.toArray()[this.jTableDatosTipoInstitucion.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoInstitucionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoInstitucion(this.tipoinstitucion);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tipoinstitucionConstantesFunciones.cargarid_empresaTipoInstitucion || this.tipoinstitucionConstantesFunciones.event_dependid_empresaTipoInstitucion) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tipoinstitucion.getid_empresa());
									//this.inicializarActualizarBindingTipoInstitucion(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tipoinstitucion.getEmpresa()!=null) {
							this.empresasForeignKey.add(tipoinstitucion.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tipoinstitucion.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoInstitucion("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoInstitucion(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoInstitucion() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoInstitucion(TipoInstitucion tipoinstitucion) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoInstitucion(tipoinstitucion,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoInstitucion(TipoInstitucion tipoinstitucion,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoInstitucion(tipoinstitucion);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoInstitucion(tipoinstitucion,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoInstitucion(tipoinstitucion);
	}
	
	public void setVariablesObjetoActualToFormularioTipoInstitucion(TipoInstitucion tipoinstitucion) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoInstitucion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoInstitucion.jLabelidTipoInstitucion.setText(tipoinstitucion.getId().toString());
			this.jInternalFrameDetalleFormTipoInstitucion.jTextFieldcodigoTipoInstitucion.setText(tipoinstitucion.getcodigo());
			this.jInternalFrameDetalleFormTipoInstitucion.jTextAreanombreTipoInstitucion.setText(tipoinstitucion.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoInstitucion tipoinstitucionLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipoinstitucionLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoInstitucion tipoinstitucionLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipoinstitucionLocal=this.tipoinstitucion;
			} else {
				tipoinstitucionLocal=this.tipoinstitucionAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipoinstitucionLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoInstitucion(tipoinstitucionLocal,true);
					
					if(tipoinstitucionSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipoinstitucionLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipoinstitucionSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipoinstitucionLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoInstitucion(TipoInstitucion tipoinstitucion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoInstitucion(tipoinstitucion,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoInstitucion(tipoinstitucion);
	}
	
	public void setVariablesFormularioToObjetoActualTipoInstitucion(TipoInstitucion tipoinstitucion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoInstitucion(tipoinstitucion,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoInstitucion(TipoInstitucion tipoinstitucion,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoInstitucion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoInstitucion.jLabelidTipoInstitucion.getText()==null || this.jInternalFrameDetalleFormTipoInstitucion.jLabelidTipoInstitucion.getText()=="" || this.jInternalFrameDetalleFormTipoInstitucion.jLabelidTipoInstitucion.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoInstitucion.jLabelidTipoInstitucion.setText("0");
			}

			if(conColumnasBase) {tipoinstitucion.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoInstitucion.jLabelidTipoInstitucion.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoInstitucionConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoInstitucion.jLabelIdTipoInstitucion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoinstitucion.setcodigo(this.jInternalFrameDetalleFormTipoInstitucion.jTextFieldcodigoTipoInstitucion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoInstitucionConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoInstitucion.jLabelcodigoTipoInstitucion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoinstitucion.setnombre(this.jInternalFrameDetalleFormTipoInstitucion.jTextAreanombreTipoInstitucion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoInstitucionConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoInstitucion.jLabelnombreTipoInstitucion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoInstitucion(TipoInstitucion tipoinstitucionBean,TipoInstitucion tipoinstitucion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoInstitucion(TipoInstitucion tipoinstitucionOrigen,TipoInstitucion tipoinstitucion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoinstitucionOrigen.getId()!=null && !tipoinstitucionOrigen.getId().equals(0L))) {tipoinstitucion.setId(tipoinstitucionOrigen.getId());}}
			if(conDefault || (!conDefault && tipoinstitucionOrigen.getcodigo()!=null && !tipoinstitucionOrigen.getcodigo().equals(""))) {tipoinstitucion.setcodigo(tipoinstitucionOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipoinstitucionOrigen.getnombre()!=null && !tipoinstitucionOrigen.getnombre().equals(""))) {tipoinstitucion.setnombre(tipoinstitucionOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoInstitucion(TipoInstitucion tipoinstitucion) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoInstitucion.jLabelidTipoInstitucion.setText(tipoinstitucion.getId().toString());
			this.jInternalFrameDetalleFormTipoInstitucion.jTextFieldcodigoTipoInstitucion.setText(tipoinstitucion.getcodigo());
			this.jInternalFrameDetalleFormTipoInstitucion.jTextAreanombreTipoInstitucion.setText(tipoinstitucion.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoInstitucion(TipoInstitucionBean tipoinstitucionBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoInstitucion.jLabelidTipoInstitucion.setText(tipoinstitucionBean.getId().toString());
			this.jInternalFrameDetalleFormTipoInstitucion.jTextFieldcodigoTipoInstitucion.setText(tipoinstitucionBean.getcodigo());
			this.jInternalFrameDetalleFormTipoInstitucion.jTextAreanombreTipoInstitucion.setText(tipoinstitucionBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoInstitucion(TipoInstitucionParameterReturnGeneral tipoinstitucionReturnGeneral,TipoInstitucionBean tipoinstitucionBean,Boolean conDefault) throws Exception { 
		try {
			TipoInstitucion tipoinstitucionLocal=new TipoInstitucion();
			
			tipoinstitucionLocal=tipoinstitucionReturnGeneral.getTipoInstitucion();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoinstitucionLocal.getId()!=null && !tipoinstitucionLocal.getId().equals(0L))) {tipoinstitucionBean.setId(tipoinstitucionLocal.getId());}}
			if(conDefault || (!conDefault && tipoinstitucionLocal.getcodigo()!=null && !tipoinstitucionLocal.getcodigo().equals(""))) {tipoinstitucionBean.setcodigo(tipoinstitucionLocal.getcodigo());}
			if(conDefault || (!conDefault && tipoinstitucionLocal.getnombre()!=null && !tipoinstitucionLocal.getnombre().equals(""))) {tipoinstitucionBean.setnombre(tipoinstitucionLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoInstitucionGenerico(Long idTipoInstitucionSeleccionado,JComboBox jComboBoxTipoInstitucion,List<TipoInstitucion> tipoinstitucionsLocal)throws Exception {
		try {
			TipoInstitucion  tipoinstitucionTemp=null;

			for(TipoInstitucion tipoinstitucionAux:tipoinstitucionsLocal) {
				if(tipoinstitucionAux.getId()!=null && tipoinstitucionAux.getId().equals(idTipoInstitucionSeleccionado)) {
					tipoinstitucionTemp=tipoinstitucionAux;
					break;
				}
			}

			jComboBoxTipoInstitucion.setSelectedItem(tipoinstitucionTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoInstitucionGenerico(JComboBox jComboBoxTipoInstitucion,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoInstitucion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoInstitucion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoInstitucion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoInstitucion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoInstitucion.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoInstitucion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoInstitucion.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoInstitucion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoInstitucion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoInstitucion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("Curso")) {
			jButtonCursoActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoinstitucion=(TipoInstitucion) tipoinstitucionLogic.getTipoInstitucions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoinstitucion =(TipoInstitucion) tipoinstitucions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tipoinstitucion.getIsNew() && !tipoinstitucion.getIsChanged() && !tipoinstitucion.getIsDeleted()) {
				sDescripcion=tipoinstitucion.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tipoinstitucion.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoInstitucion tipoinstitucionRow=new TipoInstitucion();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoinstitucionRow=(TipoInstitucion) tipoinstitucionLogic.getTipoInstitucions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoinstitucionRow=(TipoInstitucion) tipoinstitucions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonCursoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoInstitucion tipoinstitucion) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoInstitucion==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinstitucionLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoinstitucion = (TipoInstitucion)this.tipoinstitucionLogic.getTipoInstitucions().toArray()[this.jTableDatosTipoInstitucion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipoinstitucion = (TipoInstitucion)this.tipoinstitucions.toArray()[this.jTableDatosTipoInstitucion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipoinstitucion!=null) {
						this.tipoinstitucion = tipoinstitucion;
					} else {
						this.tipoinstitucion = new TipoInstitucion();
					}
				}

				if(this.isTienePermisosCurso && this.permiteMantenimiento(this.tipoinstitucion)) {
					CursoBeanSwingJInternalFrame cursoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoInstitucion.cursoBeanSwingJInternalFramePopup=new CursoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoInstitucion.cursoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						cursoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoInstitucion.cursoBeanSwingJInternalFramePopup;
					} else {
						cursoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoInstitucion.cursoBeanSwingJInternalFrame;
					}

					List<TipoInstitucion> tipoinstitucions=new ArrayList<TipoInstitucion>();
					tipoinstitucions.add(this.tipoinstitucion);
					if(!esRelacionado) {
						//cursoBeanSwingJInternalFrame.cursoSessionBean.setConGuardarRelaciones(false);
						//cursoBeanSwingJInternalFrame.cursoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					cursoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoInstitucion.cargarCursoBeanSwingJInternalFrame(tipoinstitucions,this.tipoinstitucion,cursoBeanSwingJInternalFrame,/*conInicializar,*/cursoBeanSwingJInternalFrame.cursoSessionBean.getConGuardarRelaciones(),cursoBeanSwingJInternalFrame.cursoSessionBean.getEsGuardarRelacionado());
					cursoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						cursoBeanSwingJInternalFrame.actualizarEstadoPanelsCurso("no_relacionado");

						cursoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(CursoConstantesFunciones.ITAMANIOFILATABLA + (CursoConstantesFunciones.ITAMANIOFILATABLA/2));

						cursoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoInstitucion=(TitledBorder)this.jScrollPanelDatosTipoInstitucion.getBorder();
						TitledBorder titledBorderCurso=(TitledBorder)cursoBeanSwingJInternalFrame.jScrollPanelDatosCurso.getBorder();

						titledBorderCurso.setTitle(titledBorderTipoInstitucion.getTitle() + " -> Curso");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,cursoBeanSwingJInternalFrame);
						}

						cursoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(cursoBeanSwingJInternalFrame);

						cursoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipoinstitucionSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Curso",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinstitucionLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinstitucionLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinstitucionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoInstitucion(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoInstitucion.setVisible((this.isVisibilidadCeldaNuevoTipoInstitucion && this.isPermisoNuevoTipoInstitucion));			
			this.jButtonDuplicarTipoInstitucion.setVisible((this.isVisibilidadCeldaDuplicarTipoInstitucion && this.isPermisoDuplicarTipoInstitucion));			
			this.jButtonCopiarTipoInstitucion.setVisible((this.isVisibilidadCeldaCopiarTipoInstitucion && this.isPermisoCopiarTipoInstitucion));
			this.jButtonVerFormTipoInstitucion.setVisible((this.isVisibilidadCeldaVerFormTipoInstitucion && this.isPermisoVerFormTipoInstitucion));
			
			this.jButtonAbrirOrderByTipoInstitucion.setVisible((this.isVisibilidadCeldaOrdenTipoInstitucion && this.isPermisoOrdenTipoInstitucion));			
			
			this.jButtonNuevoRelacionesTipoInstitucion.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoInstitucion && this.isPermisoNuevoTipoInstitucion));			
			this.jButtonNuevoGuardarCambiosTipoInstitucion.setVisible((this.isVisibilidadCeldaNuevoTipoInstitucion && this.isPermisoNuevoTipoInstitucion && this.isPermisoGuardarCambiosTipoInstitucion));
			
			if(this.jInternalFrameDetalleFormTipoInstitucion!=null) {
			this.jInternalFrameDetalleFormTipoInstitucion.jButtonModificarTipoInstitucion.setVisible((this.isVisibilidadCeldaModificarTipoInstitucion && this.isPermisoActualizarTipoInstitucion));	
			this.jInternalFrameDetalleFormTipoInstitucion.jButtonActualizarTipoInstitucion.setVisible((this.isVisibilidadCeldaActualizarTipoInstitucion && this.isPermisoActualizarTipoInstitucion));	
			this.jInternalFrameDetalleFormTipoInstitucion.jButtonEliminarTipoInstitucion.setVisible((this.isVisibilidadCeldaEliminarTipoInstitucion && this.isPermisoEliminarTipoInstitucion));
			this.jInternalFrameDetalleFormTipoInstitucion.jButtonCancelarTipoInstitucion.setVisible(this.isVisibilidadCeldaCancelarTipoInstitucion);							
			this.jInternalFrameDetalleFormTipoInstitucion.jButtonGuardarCambiosTipoInstitucion.setVisible((this.isVisibilidadCeldaGuardarTipoInstitucion && this.isPermisoGuardarCambiosTipoInstitucion));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoInstitucion.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoInstitucion && this.isPermisoGuardarCambiosTipoInstitucion));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoInstitucion.setVisible((this.isVisibilidadCeldaNuevoTipoInstitucion && this.isPermisoNuevoTipoInstitucion));						
			this.jButtonDuplicarToolBarTipoInstitucion.setVisible((this.isVisibilidadCeldaDuplicarTipoInstitucion && this.isPermisoDuplicarTipoInstitucion));						
			this.jButtonCopiarToolBarTipoInstitucion.setVisible((this.isVisibilidadCeldaCopiarTipoInstitucion && this.isPermisoCopiarTipoInstitucion));			
			this.jButtonVerFormToolBarTipoInstitucion.setVisible((this.isVisibilidadCeldaVerFormTipoInstitucion && this.isPermisoVerFormTipoInstitucion));			
			this.jButtonAbrirOrderByToolBarTipoInstitucion.setVisible((this.isVisibilidadCeldaOrdenTipoInstitucion && this.isPermisoOrdenTipoInstitucion));
			this.jButtonNuevoRelacionesToolBarTipoInstitucion.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoInstitucion && this.isPermisoNuevoTipoInstitucion));			
			this.jButtonNuevoGuardarCambiosToolBarTipoInstitucion.setVisible((this.isVisibilidadCeldaNuevoTipoInstitucion && this.isPermisoNuevoTipoInstitucion && this.isPermisoGuardarCambiosTipoInstitucion));			
			
			if(this.jInternalFrameDetalleFormTipoInstitucion!=null) {
			this.jInternalFrameDetalleFormTipoInstitucion.jButtonModificarToolBarTipoInstitucion.setVisible((this.isVisibilidadCeldaModificarTipoInstitucion && this.isPermisoActualizarTipoInstitucion));	
			this.jInternalFrameDetalleFormTipoInstitucion.jButtonActualizarToolBarTipoInstitucion.setVisible((this.isVisibilidadCeldaActualizarTipoInstitucion  && this.isPermisoActualizarTipoInstitucion));	
			this.jInternalFrameDetalleFormTipoInstitucion.jButtonEliminarToolBarTipoInstitucion.setVisible((this.isVisibilidadCeldaEliminarTipoInstitucion && this.isPermisoEliminarTipoInstitucion));
			this.jInternalFrameDetalleFormTipoInstitucion.jButtonCancelarToolBarTipoInstitucion.setVisible(this.isVisibilidadCeldaCancelarTipoInstitucion);				
			this.jInternalFrameDetalleFormTipoInstitucion.jButtonGuardarCambiosToolBarTipoInstitucion.setVisible((this.isVisibilidadCeldaGuardarTipoInstitucion && this.isPermisoGuardarCambiosTipoInstitucion));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoInstitucion.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoInstitucion && this.isPermisoGuardarCambiosTipoInstitucion));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoInstitucion.setVisible((this.isVisibilidadCeldaNuevoTipoInstitucion && this.isPermisoNuevoTipoInstitucion));			
			this.jMenuItemDuplicarTipoInstitucion.setVisible((this.isVisibilidadCeldaDuplicarTipoInstitucion && this.isPermisoDuplicarTipoInstitucion));			
			this.jMenuItemCopiarTipoInstitucion.setVisible((this.isVisibilidadCeldaCopiarTipoInstitucion && this.isPermisoCopiarTipoInstitucion));			
			this.jMenuItemVerFormTipoInstitucion.setVisible((this.isVisibilidadCeldaVerFormTipoInstitucion && this.isPermisoVerFormTipoInstitucion));			
			this.jMenuItemAbrirOrderByTipoInstitucion.setVisible((this.isVisibilidadCeldaOrdenTipoInstitucion && this.isPermisoOrdenTipoInstitucion));			
			//this.jMenuItemMostrarOcultarTipoInstitucion.setVisible((this.isVisibilidadCeldaOrdenTipoInstitucion && this.isPermisoOrdenTipoInstitucion));
			this.jMenuItemDetalleAbrirOrderByTipoInstitucion.setVisible((this.isVisibilidadCeldaOrdenTipoInstitucion && this.isPermisoOrdenTipoInstitucion));			
			//this.jMenuItemDetalleMostrarOcultarTipoInstitucion.setVisible((this.isVisibilidadCeldaOrdenTipoInstitucion && this.isPermisoOrdenTipoInstitucion));			
			this.jMenuItemNuevoRelacionesTipoInstitucion.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoInstitucion && this.isPermisoNuevoTipoInstitucion));			
			this.jMenuItemNuevoGuardarCambiosTipoInstitucion.setVisible((this.isVisibilidadCeldaNuevoTipoInstitucion && this.isPermisoNuevoTipoInstitucion && this.isPermisoGuardarCambiosTipoInstitucion));									
			
			if(this.jInternalFrameDetalleFormTipoInstitucion!=null) {
			this.jInternalFrameDetalleFormTipoInstitucion.jMenuItemModificarTipoInstitucion.setVisible((this.isVisibilidadCeldaModificarTipoInstitucion && this.isPermisoActualizarTipoInstitucion));	
			this.jInternalFrameDetalleFormTipoInstitucion.jMenuItemActualizarTipoInstitucion.setVisible((this.isVisibilidadCeldaActualizarTipoInstitucion && this.isPermisoActualizarTipoInstitucion));	
			this.jInternalFrameDetalleFormTipoInstitucion.jMenuItemEliminarTipoInstitucion.setVisible((this.isVisibilidadCeldaEliminarTipoInstitucion && this.isPermisoEliminarTipoInstitucion));
			this.jInternalFrameDetalleFormTipoInstitucion.jMenuItemCancelarTipoInstitucion.setVisible(this.isVisibilidadCeldaCancelarTipoInstitucion);				
			}
			
			this.jMenuItemGuardarCambiosTipoInstitucion.setVisible((this.isVisibilidadCeldaGuardarTipoInstitucion && this.isPermisoGuardarCambiosTipoInstitucion));						
			this.jMenuItemGuardarCambiosTablaTipoInstitucion.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoInstitucion && this.isPermisoGuardarCambiosTipoInstitucion));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoInstitucion=this.jButtonNuevoTipoInstitucion.isVisible();
			this.isVisibilidadCeldaDuplicarTipoInstitucion=this.jButtonDuplicarTipoInstitucion.isVisible();
			this.isVisibilidadCeldaCopiarTipoInstitucion=this.jButtonCopiarTipoInstitucion.isVisible();
			this.isVisibilidadCeldaVerFormTipoInstitucion=this.jButtonVerFormTipoInstitucion.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoInstitucion=this.jButtonAbrirOrderByTipoInstitucion.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoInstitucion=this.jButtonNuevoRelacionesTipoInstitucion.isVisible();
			this.isVisibilidadCeldaModificarTipoInstitucion=this.jButtonModificarTipoInstitucion.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoInstitucion!=null) {
			this.isVisibilidadCeldaActualizarTipoInstitucion=this.jInternalFrameDetalleFormTipoInstitucion.jButtonActualizarTipoInstitucion.isVisible();
			this.isVisibilidadCeldaEliminarTipoInstitucion=this.jInternalFrameDetalleFormTipoInstitucion.jButtonEliminarTipoInstitucion.isVisible();
			this.isVisibilidadCeldaCancelarTipoInstitucion=this.jInternalFrameDetalleFormTipoInstitucion.jButtonCancelarTipoInstitucion.isVisible();
			this.isVisibilidadCeldaGuardarTipoInstitucion=this.jInternalFrameDetalleFormTipoInstitucion.jButtonGuardarCambiosTipoInstitucion.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoInstitucion=this.jButtonGuardarCambiosTablaTipoInstitucion.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoInstitucion=this.jButtonNuevoToolBarTipoInstitucion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoInstitucion=this.jButtonNuevoRelacionesToolBarTipoInstitucion.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoInstitucion!=null) {
			this.isVisibilidadCeldaModificarTipoInstitucion=this.jInternalFrameDetalleFormTipoInstitucion.jButtonModificarToolBarTipoInstitucion.isVisible();
			this.isVisibilidadCeldaActualizarTipoInstitucion=this.jInternalFrameDetalleFormTipoInstitucion.jButtonActualizarToolBarTipoInstitucion.isVisible();
			this.isVisibilidadCeldaEliminarTipoInstitucion=this.jInternalFrameDetalleFormTipoInstitucion.jButtonEliminarToolBarTipoInstitucion.isVisible();
			this.isVisibilidadCeldaCancelarTipoInstitucion=this.jInternalFrameDetalleFormTipoInstitucion.jButtonCancelarToolBarTipoInstitucion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoInstitucion=this.jButtonGuardarCambiosToolBarTipoInstitucion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoInstitucion=this.jButtonGuardarCambiosTablaToolBarTipoInstitucion.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoInstitucion=this.jMenuItemNuevoTipoInstitucion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoInstitucion=this.jMenuItemNuevoRelacionesTipoInstitucion.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoInstitucion!=null) {
			this.isVisibilidadCeldaModificarTipoInstitucion=this.jInternalFrameDetalleFormTipoInstitucion.jMenuItemModificarTipoInstitucion.isVisible();
			this.isVisibilidadCeldaActualizarTipoInstitucion=this.jInternalFrameDetalleFormTipoInstitucion.jMenuItemActualizarTipoInstitucion.isVisible();
			this.isVisibilidadCeldaEliminarTipoInstitucion=this.jInternalFrameDetalleFormTipoInstitucion.jMenuItemEliminarTipoInstitucion.isVisible();
			this.isVisibilidadCeldaCancelarTipoInstitucion=this.jInternalFrameDetalleFormTipoInstitucion.jMenuItemCancelarTipoInstitucion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoInstitucion=this.jMenuItemGuardarCambiosTipoInstitucion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoInstitucion=this.jMenuItemGuardarCambiosTablaTipoInstitucion.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoInstitucion(Boolean esInicializar) {
		if(TipoInstitucionJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipoinstitucionSessionBean.getConGuardarRelaciones()) {
				//if(this.tipoinstitucionSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoInstitucion();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoInstitucion(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoInstitucion() {
		this.jButtonNuevoTipoInstitucion.setVisible(this.isPermisoNuevoTipoInstitucion);			
		this.jButtonDuplicarTipoInstitucion.setVisible(this.isPermisoDuplicarTipoInstitucion);			
		this.jButtonCopiarTipoInstitucion.setVisible(this.isPermisoCopiarTipoInstitucion);			
		this.jButtonVerFormTipoInstitucion.setVisible(this.isPermisoVerFormTipoInstitucion);			
		
		this.jButtonAbrirOrderByTipoInstitucion.setVisible(this.isPermisoOrdenTipoInstitucion);					
		
		this.jButtonNuevoRelacionesTipoInstitucion.setVisible(this.isPermisoNuevoTipoInstitucion);			
		
		if(this.jInternalFrameDetalleFormTipoInstitucion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoInstitucion.jButtonModificarTipoInstitucion.setVisible(this.isPermisoActualizarTipoInstitucion);	
			this.jInternalFrameDetalleFormTipoInstitucion.jButtonActualizarTipoInstitucion.setVisible(this.isPermisoActualizarTipoInstitucion);	
			this.jInternalFrameDetalleFormTipoInstitucion.jButtonEliminarTipoInstitucion.setVisible(this.isPermisoEliminarTipoInstitucion);
			this.jInternalFrameDetalleFormTipoInstitucion.jButtonCancelarTipoInstitucion.setVisible(this.isVisibilidadCeldaCancelarTipoInstitucion);						
			this.jInternalFrameDetalleFormTipoInstitucion.jButtonGuardarCambiosTipoInstitucion.setVisible(this.isPermisoGuardarCambiosTipoInstitucion);							
		}
		
		this.jButtonGuardarCambiosTablaTipoInstitucion.setVisible(this.isPermisoActualizarTipoInstitucion);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoInstitucion() {
		this.jInternalFrameDetalleFormTipoInstitucion.jButtonModificarTipoInstitucion.setVisible(this.isPermisoActualizarTipoInstitucion);	
		this.jInternalFrameDetalleFormTipoInstitucion.jButtonActualizarTipoInstitucion.setVisible(this.isPermisoActualizarTipoInstitucion);	
		this.jInternalFrameDetalleFormTipoInstitucion.jButtonEliminarTipoInstitucion.setVisible(this.isPermisoEliminarTipoInstitucion);
		this.jInternalFrameDetalleFormTipoInstitucion.jButtonCancelarTipoInstitucion.setVisible(this.isVisibilidadCeldaCancelarTipoInstitucion);							
		this.jInternalFrameDetalleFormTipoInstitucion.jButtonGuardarCambiosTipoInstitucion.setVisible((this.isVisibilidadCeldaGuardarTipoInstitucion && this.isPermisoGuardarCambiosTipoInstitucion));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoInstitucion() {
		if(TipoInstitucionJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoInstitucion();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoInstitucion() {
	}
	
	public void jTableDatosTipoInstitucionListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoInstitucion(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoInstitucionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinstitucionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoInstitucion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoInstitucion(this.gettipoinstitucion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoInstitucion(this.tipoinstitucion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoinstitucion =(TipoInstitucion) this.tipoinstitucionLogic.getTipoInstitucions().toArray()[this.jTableDatosTipoInstitucion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoinstitucion =(TipoInstitucion) this.tipoinstitucions.toArray()[this.jTableDatosTipoInstitucion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoinstitucion==null) {
						this.tipoinstitucion = new TipoInstitucion();
					}

					this.setVariablesFormularioToObjetoActualTipoInstitucion(this.tipoinstitucion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoInstitucion(this.tipoinstitucion);
				}

				if(this.tipoinstitucion.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipoinstitucion.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoInstitucion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinstitucionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinstitucionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinstitucionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTipoInstitucionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinstitucionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTipoInstitucion(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoInstitucion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoInstitucion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoInstitucion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinstitucion =(TipoInstitucion) this.tipoinstitucionLogic.getTipoInstitucions().toArray()[this.jTableDatosTipoInstitucion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoinstitucion =(TipoInstitucion) this.tipoinstitucions.toArray()[this.jTableDatosTipoInstitucion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoInstitucion(this.gettipoinstitucion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoInstitucion(this.tipoinstitucion);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tipoinstitucionLogic.getConnexion());

				if(this.tipoinstitucion.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tipoinstitucion.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoInstitucion=(TitledBorder)this.jScrollPanelDatosTipoInstitucion.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTipoInstitucion.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinstitucionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinstitucionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinstitucionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTipoInstitucionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinstitucionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoInstitucion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoInstitucion(this.gettipoinstitucion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoInstitucion(this.tipoinstitucion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoinstitucion =(TipoInstitucion) this.tipoinstitucionLogic.getTipoInstitucions().toArray()[this.jTableDatosTipoInstitucion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoinstitucion =(TipoInstitucion) this.tipoinstitucions.toArray()[this.jTableDatosTipoInstitucion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoinstitucion==null) {
						this.tipoinstitucion = new TipoInstitucion();
					}

					this.setVariablesFormularioToObjetoActualTipoInstitucion(this.tipoinstitucion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoInstitucion(this.tipoinstitucion);
				}

				if(this.tipoinstitucion.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tipoinstitucion.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoInstitucion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinstitucionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinstitucionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinstitucionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoInstitucionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinstitucionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoInstitucion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoInstitucion(this.gettipoinstitucion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoInstitucion(this.tipoinstitucion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoinstitucion =(TipoInstitucion) this.tipoinstitucionLogic.getTipoInstitucions().toArray()[this.jTableDatosTipoInstitucion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoinstitucion =(TipoInstitucion) this.tipoinstitucions.toArray()[this.jTableDatosTipoInstitucion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoinstitucion==null) {
						this.tipoinstitucion = new TipoInstitucion();
					}

					this.setVariablesFormularioToObjetoActualTipoInstitucion(this.tipoinstitucion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoInstitucion(this.tipoinstitucion);
				}

				if(this.tipoinstitucion.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipoinstitucion.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoInstitucion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinstitucionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinstitucionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinstitucionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoInstitucionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinstitucionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoInstitucion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoInstitucion(this.gettipoinstitucion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoInstitucion(this.tipoinstitucion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoinstitucion =(TipoInstitucion) this.tipoinstitucionLogic.getTipoInstitucions().toArray()[this.jTableDatosTipoInstitucion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoinstitucion =(TipoInstitucion) this.tipoinstitucions.toArray()[this.jTableDatosTipoInstitucion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoinstitucion==null) {
						this.tipoinstitucion = new TipoInstitucion();
					}

					this.setVariablesFormularioToObjetoActualTipoInstitucion(this.tipoinstitucion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoInstitucion(this.tipoinstitucion);
				}

				if(this.tipoinstitucion.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipoinstitucion.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoInstitucion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinstitucionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinstitucionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinstitucionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaTipoInstitucionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinstitucionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoInstitucion(false,false);

			this.getTipoInstitucionsFK_IdEmpresa();

			this.inicializarActualizarBindingTipoInstitucion(false);

			//if(TipoInstitucionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoInstitucion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinstitucionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinstitucionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinstitucionLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoInstitucion() {
		if(this.jInternalFrameDetalleFormTipoInstitucion!=null) {
		

		if(this.jInternalFrameDetalleFormTipoInstitucion.cursoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoInstitucion.cursoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoInstitucion.cursoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoInstitucion.cursoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoInstitucion.cursoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoInstitucion.cursoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoInstitucion.cursoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoInstitucion.cursoBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoInstitucion!=null) {
			this.jInternalFrameDetalleFormTipoInstitucion.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoInstitucion.dispose();
			this.jInternalFrameDetalleFormTipoInstitucion=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoInstitucion!=null) {
			this.jInternalFrameReporteDinamicoTipoInstitucion.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoInstitucion.dispose();
			this.jInternalFrameReporteDinamicoTipoInstitucion=null;
		}
		
		if(this.jInternalFrameImportacionTipoInstitucion!=null) {
			this.jInternalFrameImportacionTipoInstitucion.setVisible(false);	    			
			this.jInternalFrameImportacionTipoInstitucion.dispose();
			this.jInternalFrameImportacionTipoInstitucion=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoInstitucion();
			
			TipoInstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoinstitucion,new Object(),this.tipoinstitucionParameterGeneral,this.tipoinstitucionReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoInstitucion")) {
				jButtonNuevoTipoInstitucionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoInstitucion")) {
				jButtonDuplicarTipoInstitucionActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoInstitucion")) {
				jButtonCopiarTipoInstitucionActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoInstitucion")) {
				jButtonVerFormTipoInstitucionActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoInstitucion")) {
				jButtonNuevoTipoInstitucionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoInstitucion")) {
				jButtonDuplicarTipoInstitucionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoInstitucion")) {
				jButtonNuevoTipoInstitucionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoInstitucion")) {
				jButtonDuplicarTipoInstitucionActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoInstitucion")) {
				jButtonNuevoTipoInstitucionActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoInstitucion")) {
				jButtonNuevoTipoInstitucionActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoInstitucion")) {
				jButtonNuevoTipoInstitucionActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoInstitucion")) {
				jButtonModificarTipoInstitucionActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoInstitucion")) {
				jButtonModificarTipoInstitucionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoInstitucion")) {
				jButtonModificarTipoInstitucionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoInstitucion")) {
				jButtonActualizarTipoInstitucionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoInstitucion")) {
				jButtonActualizarTipoInstitucionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoInstitucion")) {
				jButtonActualizarTipoInstitucionActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoInstitucion")) {
				jButtonEliminarTipoInstitucionActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoInstitucion")) {
				jButtonEliminarTipoInstitucionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoInstitucion")) {
				jButtonEliminarTipoInstitucionActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoInstitucion")) {
				jButtonCancelarTipoInstitucionActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoInstitucion")) {
				jButtonCancelarTipoInstitucionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoInstitucion")) {
				jButtonCancelarTipoInstitucionActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoInstitucion")) {
				jButtonCerrarTipoInstitucionActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoInstitucion")) {
				jButtonCerrarTipoInstitucionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoInstitucion")) {
				jButtonCerrarTipoInstitucionActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoInstitucion")) {
				jButtonMostrarOcultarTipoInstitucionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoInstitucion")) {
				jButtonCancelarTipoInstitucionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoInstitucion")) {
				jButtonGuardarCambiosTipoInstitucionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoInstitucion")) {
				jButtonGuardarCambiosTipoInstitucionActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoInstitucion")) {
				jButtonCopiarTipoInstitucionActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoInstitucion")) {
				jButtonVerFormTipoInstitucionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoInstitucion")) {
				jButtonGuardarCambiosTipoInstitucionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoInstitucion")) {
				jButtonCopiarTipoInstitucionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoInstitucion")) {
				jButtonVerFormTipoInstitucionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoInstitucion")) {
				jButtonGuardarCambiosTipoInstitucionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoInstitucion")) {
				jButtonGuardarCambiosTipoInstitucionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoInstitucion")) {
				jButtonGuardarCambiosTipoInstitucionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoInstitucion")) {
				jButtonRecargarInformacionTipoInstitucionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoInstitucion")) {
				jButtonRecargarInformacionTipoInstitucionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoInstitucion")) {
				jButtonRecargarInformacionTipoInstitucionActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoInstitucion")) {
				jButtonAnterioresTipoInstitucionActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoInstitucion")) {
				jButtonAnterioresTipoInstitucionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoInstitucion")) {
				jButtonAnterioresTipoInstitucionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoInstitucion")) {
				jButtonSiguientesTipoInstitucionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoInstitucion")) {
				jButtonSiguientesTipoInstitucionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoInstitucion")) {
				jButtonSiguientesTipoInstitucionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoInstitucion") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoInstitucion")) {
				jButtonAbrirOrderByTipoInstitucionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoInstitucion") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoInstitucion")) {
				jButtonMostrarOcultarTipoInstitucionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoInstitucion")) {
				jButtonNuevoGuardarCambiosTipoInstitucionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoInstitucion")) {
				jButtonNuevoGuardarCambiosTipoInstitucionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoInstitucion")) {
				jButtonNuevoGuardarCambiosTipoInstitucionActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoInstitucion")) {
				jButtonCerrarReporteDinamicoTipoInstitucionActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoInstitucion")) {
				jButtonGenerarReporteDinamicoTipoInstitucionActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoInstitucion")) {
				
				jButtonGenerarExcelReporteDinamicoTipoInstitucionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoInstitucion")) {
				jButtonCerrarImportacionTipoInstitucionActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoInstitucion")) {
				
				jButtonGenerarImportacionTipoInstitucionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoInstitucion")) {
				
				jButtonAbrirImportacionTipoInstitucionActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoInstitucion")) {
				jComboBoxTiposAccionesTipoInstitucionActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoInstitucion")) {
				jComboBoxTiposRelacionesTipoInstitucionActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoInstitucion")) {
				jComboBoxTiposAccionesTipoInstitucionActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoInstitucion")) {
				
				jComboBoxTiposSeleccionarTipoInstitucionActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoInstitucion")) {
				jTextFieldValorCampoGeneralTipoInstitucionActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoInstitucion")) {
				jButtonAbrirOrderByTipoInstitucionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoInstitucion")) {
				jButtonAbrirOrderByTipoInstitucionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoInstitucion")) {
				jButtonCerrarOrderByTipoInstitucionActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoInstitucionBusqueda")) {
				this.jButtonidTipoInstitucionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoInstitucionUpdate")) {
				this.jButtonid_empresaTipoInstitucionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoInstitucionBusqueda")) {
				this.jButtonid_empresaTipoInstitucionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoInstitucionBusqueda")) {
				this.jButtoncodigoTipoInstitucionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoInstitucionBusqueda")) {
				this.jButtonnombreTipoInstitucionBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoInstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoinstitucion,new Object(),this.tipoinstitucionParameterGeneral,this.tipoinstitucionReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoInstitucion();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoInstitucionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoinstitucion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoinstitucion);
				
				TipoInstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinstitucion,new Object(),this.tipoinstitucionParameterGeneral,this.tipoinstitucionReturnGeneral);
				
				


				
				TipoInstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinstitucion,new Object(),this.tipoinstitucionParameterGeneral,this.tipoinstitucionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoInstitucion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoInstitucion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoInstitucion tipoinstitucionLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipoinstitucionLocal=this.tipoinstitucion;
			} else {
				tipoinstitucionLocal=this.tipoinstitucionAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoinstitucion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoinstitucion);
				
				TipoInstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinstitucion,new Object(),this.tipoinstitucionParameterGeneral,this.tipoinstitucionReturnGeneral);
							
				
				


				
				TipoInstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinstitucion,new Object(),this.tipoinstitucionParameterGeneral,this.tipoinstitucionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoInstitucion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoInstitucion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoInstitucionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoInstitucion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinstitucionAnterior =(TipoInstitucion) this.tipoinstitucionLogic.getTipoInstitucions().toArray()[this.jTableDatosTipoInstitucion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoinstitucionAnterior =(TipoInstitucion) this.tipoinstitucions.toArray()[this.jTableDatosTipoInstitucion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
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
			
			TipoInstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinstitucion,new Object(),this.tipoinstitucionParameterGeneral,this.tipoinstitucionReturnGeneral);
			
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
			
			


			
			TipoInstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinstitucion,new Object(),this.tipoinstitucionParameterGeneral,this.tipoinstitucionReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoInstitucionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoinstitucion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoinstitucion);
				
				TipoInstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinstitucion,new Object(),this.tipoinstitucionParameterGeneral,this.tipoinstitucionReturnGeneral);
								
						
				


				
				TipoInstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinstitucion,new Object(),this.tipoinstitucionParameterGeneral,this.tipoinstitucionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoInstitucion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoInstitucion.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoinstitucion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoinstitucion);
				
				TipoInstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinstitucion,new Object(),this.tipoinstitucionParameterGeneral,this.tipoinstitucionReturnGeneral);
								
				
				


				
				TipoInstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinstitucion,new Object(),this.tipoinstitucionParameterGeneral,this.tipoinstitucionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoInstitucion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoInstitucion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoInstitucionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoInstitucion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinstitucionAnterior =(TipoInstitucion) this.tipoinstitucionLogic.getTipoInstitucions().toArray()[this.jTableDatosTipoInstitucion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoinstitucionAnterior =(TipoInstitucion) this.tipoinstitucions.toArray()[this.jTableDatosTipoInstitucion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoinstitucion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoinstitucion);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoInstitucionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoInstitucion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinstitucionAnterior =(TipoInstitucion) this.tipoinstitucionLogic.getTipoInstitucions().toArray()[this.jTableDatosTipoInstitucion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoinstitucionAnterior =(TipoInstitucion) this.tipoinstitucions.toArray()[this.jTableDatosTipoInstitucion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoInstitucionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoinstitucion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoinstitucion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoinstitucion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoinstitucion);
				
				TipoInstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinstitucion,new Object(),this.tipoinstitucionParameterGeneral,this.tipoinstitucionReturnGeneral);
							
				
				


				
				TipoInstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinstitucion,new Object(),this.tipoinstitucionParameterGeneral,this.tipoinstitucionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoInstitucion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoInstitucion.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoInstitucionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoInstitucion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoinstitucionAnterior =(TipoInstitucion) this.tipoinstitucionLogic.getTipoInstitucions().toArray()[this.jTableDatosTipoInstitucion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoinstitucionAnterior =(TipoInstitucion) this.tipoinstitucions.toArray()[this.jTableDatosTipoInstitucion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
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
			
			TipoInstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinstitucion,new Object(),this.tipoinstitucionParameterGeneral,this.tipoinstitucionReturnGeneral);
			
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
			
			


			
			TipoInstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinstitucion,new Object(),this.tipoinstitucionParameterGeneral,this.tipoinstitucionReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoInstitucionActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoinstitucion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoinstitucion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoinstitucion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoinstitucion);
				
				TipoInstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinstitucion,new Object(),this.tipoinstitucionParameterGeneral,this.tipoinstitucionReturnGeneral);
								
				
				


				
				TipoInstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinstitucion,new Object(),this.tipoinstitucionParameterGeneral,this.tipoinstitucionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoInstitucion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoInstitucion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoInstitucionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoInstitucion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinstitucionAnterior =(TipoInstitucion) this.tipoinstitucionLogic.getTipoInstitucions().toArray()[this.jTableDatosTipoInstitucion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoinstitucionAnterior =(TipoInstitucion) this.tipoinstitucions.toArray()[this.jTableDatosTipoInstitucion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoInstitucionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoinstitucion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoinstitucion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoInstitucionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoinstitucion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoinstitucion);
				
				TipoInstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoinstitucion,new Object(),this.tipoinstitucionParameterGeneral,this.tipoinstitucionReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoInstitucion")) {
					jCheckBoxSeleccionarTodosTipoInstitucionItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoInstitucion")) {
					jCheckBoxSeleccionadosTipoInstitucionItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoInstitucion")) {
					
				}
				
				


				
				
				TipoInstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoinstitucion,new Object(),this.tipoinstitucionParameterGeneral,this.tipoinstitucionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoInstitucion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoInstitucion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoinstitucion);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipoinstitucion);
				
				TipoInstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoinstitucion,new Object(),this.tipoinstitucionParameterGeneral,this.tipoinstitucionReturnGeneral);
												
				
				


				
				
				TipoInstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoinstitucion,new Object(),this.tipoinstitucionParameterGeneral,this.tipoinstitucionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoInstitucion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoInstitucion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoInstitucionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoInstitucion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoinstitucionAnterior =(TipoInstitucion) this.tipoinstitucionLogic.getTipoInstitucions().toArray()[this.jTableDatosTipoInstitucion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoinstitucionAnterior =(TipoInstitucion) this.tipoinstitucions.toArray()[this.jTableDatosTipoInstitucion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoInstitucionActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoinstitucion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoinstitucion);
				
				TipoInstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoinstitucion,new Object(),this.tipoinstitucionParameterGeneral,this.tipoinstitucionReturnGeneral);
				
				
				TipoInstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoinstitucion,new Object(),this.tipoinstitucionParameterGeneral,this.tipoinstitucionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
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
			
			TipoInstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoinstitucion,new Object(),this.tipoinstitucionParameterGeneral,this.tipoinstitucionReturnGeneral);
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
			
			


			
			TipoInstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinstitucion,new Object(),this.tipoinstitucionParameterGeneral,this.tipoinstitucionReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoInstitucionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoinstitucion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoinstitucion);
				
				TipoInstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoinstitucion,new Object(),this.tipoinstitucionParameterGeneral,this.tipoinstitucionReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoInstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinstitucion,new Object(),this.tipoinstitucionParameterGeneral,this.tipoinstitucionReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoInstitucion.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoInstitucion.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoinstitucion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoinstitucion);
				
				TipoInstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoinstitucion,new Object(),this.tipoinstitucionParameterGeneral,this.tipoinstitucionReturnGeneral);
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
				
				


				
				TipoInstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinstitucion,new Object(),this.tipoinstitucionParameterGeneral,this.tipoinstitucionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoInstitucion.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoInstitucion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoInstitucionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoInstitucion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinstitucionAnterior =(TipoInstitucion) this.tipoinstitucionLogic.getTipoInstitucions().toArray()[this.jTableDatosTipoInstitucion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoinstitucionAnterior =(TipoInstitucion) this.tipoinstitucions.toArray()[this.jTableDatosTipoInstitucion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoInstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinstitucion,new Object(),this.tipoinstitucionParameterGeneral,this.tipoinstitucionReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoInstitucion")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoInstitucionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoInstitucion.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipoinstitucion =(TipoInstitucion) this.tipoinstitucionLogic.getTipoInstitucions().toArray()[this.jTableDatosTipoInstitucion.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipoinstitucion =(TipoInstitucion) this.tipoinstitucions.toArray()[this.jTableDatosTipoInstitucion.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipoinstitucion);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoInstitucion")) {
				
				}
				
				TipoInstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinstitucion,new Object(),this.tipoinstitucionParameterGeneral,this.tipoinstitucionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoInstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoinstitucion,new Object(),this.tipoinstitucionParameterGeneral,this.tipoinstitucionReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoInstitucion")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoInstitucion.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoInstitucion")) {
			
			}
			
			TipoInstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoinstitucion,new Object(),this.tipoinstitucionParameterGeneral,this.tipoinstitucionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoInstitucion();
			
			TipoInstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoinstitucion,new Object(),this.tipoinstitucionParameterGeneral,this.tipoinstitucionReturnGeneral);
			
			if(sTipo.equals("NuevoTipoInstitucion")) {
				jButtonNuevoTipoInstitucionActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoInstitucion")) {
				jButtonDuplicarTipoInstitucionActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoInstitucion")) {
				jButtonCopiarTipoInstitucionActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoInstitucion")) {
				jButtonVerFormTipoInstitucionActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoInstitucion")) {
				jButtonNuevoTipoInstitucionActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoInstitucion")) {
				jButtonModificarTipoInstitucionActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoInstitucion")) {
				jButtonActualizarTipoInstitucionActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoInstitucion")) {
				jButtonEliminarTipoInstitucionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoInstitucion")) {
				jButtonGuardarCambiosTipoInstitucionActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoInstitucion")) {
				jButtonCancelarTipoInstitucionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoInstitucion")) {
				jButtonCerrarTipoInstitucionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoInstitucion")) {
				jButtonGuardarCambiosTipoInstitucionActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoInstitucion")) {
				jButtonNuevoGuardarCambiosTipoInstitucionActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoInstitucion")) {
				jButtonAbrirOrderByTipoInstitucionActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoInstitucion")) {
				jButtonRecargarInformacionTipoInstitucionActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoInstitucion")) {
				jButtonAnterioresTipoInstitucionActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoInstitucion")) {
				jButtonSiguientesTipoInstitucionActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoInstitucionBusqueda")) {
				this.jButtonidTipoInstitucionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoInstitucionUpdate")) {
				this.jButtonid_empresaTipoInstitucionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoInstitucionBusqueda")) {
				this.jButtonid_empresaTipoInstitucionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoInstitucionBusqueda")) {
				this.jButtoncodigoTipoInstitucionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoInstitucionBusqueda")) {
				this.jButtonnombreTipoInstitucionBusquedaActionPerformed(evt);
			}
			
			TipoInstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoinstitucion,new Object(),this.tipoinstitucionParameterGeneral,this.tipoinstitucionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoInstitucion();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoInstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoinstitucion,new Object(),this.tipoinstitucionParameterGeneral,this.tipoinstitucionReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoInstitucion")) {
				closingInternalFrameTipoInstitucion();
				
			} else if(sTipo.equals("jButtonCancelarTipoInstitucion")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoInstitucion = (JInternalFrameBase)evt.getSource();
	            	
	            TipoInstitucionBeanSwingJInternalFrame jInternalFrameParent=(TipoInstitucionBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoInstitucion.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoInstitucionActionPerformed(null);
			}
			
			TipoInstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoinstitucion,new Object(),this.tipoinstitucionParameterGeneral,this.tipoinstitucionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoInstitucion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoInstitucion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoInstitucion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipoinstitucion)) {
			if(!esControlTabla) {
				if(TipoInstitucionJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoInstitucion(this.tipoinstitucion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoInstitucion(this.tipoinstitucion);			
				}
				
				if(this.tipoinstitucionSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoInstitucion(this.tipoinstitucion,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoinstitucionReturnGeneral=tipoinstitucionLogic.procesarEventosTipoInstitucionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoinstitucionLogic.getTipoInstitucions(),this.tipoinstitucion,this.tipoinstitucionParameterGeneral,this.isEsNuevoTipoInstitucion,classes);//this.tipoinstitucionLogic.getTipoInstitucion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoInstitucion(this.tipoinstitucionReturnGeneral,this.tipoinstitucionBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipoinstitucionSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoInstitucion(classes,this.tipoinstitucionReturnGeneral,this.tipoinstitucionBean,false);
					}
						
					if(this.tipoinstitucionReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoInstitucion(this.tipoinstitucionReturnGeneral.getTipoInstitucion());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoInstitucion(this.tipoinstitucionReturnGeneral.getTipoInstitucion());	
					}
						
					if(this.tipoinstitucionReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoInstitucion(this.tipoinstitucionReturnGeneral.getTipoInstitucion(),classes);//this.tipoinstitucionBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoInstitucion(this.tipoinstitucion,classes);//this.tipoinstitucionBean);									
				}
			
				if(TipoInstitucionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoInstitucion(this.tipoinstitucion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoInstitucion(this.tipoinstitucion);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipoinstitucionAnterior!=null) {
						this.tipoinstitucion=this.tipoinstitucionAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoinstitucionReturnGeneral=tipoinstitucionLogic.procesarEventosTipoInstitucionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoinstitucionLogic.getTipoInstitucions(),this.tipoinstitucion,this.tipoinstitucionParameterGeneral,this.isEsNuevoTipoInstitucion,classes);//this.tipoinstitucionLogic.getTipoInstitucion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoinstitucionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoinstitucionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipoinstitucionReturnGeneral.getTipoInstitucion(),tipoinstitucionLogic.getTipoInstitucions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipoinstitucionReturnGeneral.getTipoInstitucion(),this.tipoinstitucions);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoInstitucion.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoInstitucion.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoInstitucion();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoInstitucion() throws Exception {
		
		TipoInstitucionModel tipoinstitucionModel=(TipoInstitucionModel)this.jTableDatosTipoInstitucion.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoinstitucionModel.tipoinstitucions=this.tipoinstitucionLogic.getTipoInstitucions();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipoinstitucionModel.tipoinstitucions=this.tipoinstitucions;
		}
		
		
		((TipoInstitucionModel) this.jTableDatosTipoInstitucion.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoInstitucion() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipoinstitucionAnterior(),this.tipoinstitucionLogic.getTipoInstitucions());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipoinstitucionAnterior(),this.tipoinstitucions);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoInstitucion();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoInstitucion(TipoInstitucion tipoinstitucion,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Curso.class)) {
					this.jInternalFrameDetalleFormTipoInstitucion.cursoBeanSwingJInternalFrame.cursoLogic.setCursos(tipoinstitucion.getCursos());
					this.jInternalFrameDetalleFormTipoInstitucion.cursoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCurso(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
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
										
				TipoInstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoinstitucion,new Object(),generalEntityParameterGeneral,this.tipoinstitucionReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipoinstitucionSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoInstitucionConstantesFunciones.getClassesRelationshipsOfTipoInstitucion(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoInstitucionConstantesFunciones.getClassesRelationshipsFromStringsOfTipoInstitucion(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoInstitucion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoInstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoinstitucion,new Object(),generalEntityParameterGeneral,this.tipoinstitucionReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoInstitucion(TipoInstitucionBean tipoinstitucionBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Curso.class)) {
					this.jInternalFrameDetalleFormTipoInstitucion.cursoBeanSwingJInternalFrame.cursoLogic.setCursos(tipoinstitucion.getCursos());
					this.jInternalFrameDetalleFormTipoInstitucion.cursoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCurso(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoInstitucion(ArrayList<Classe> classes,TipoInstitucionReturnGeneral tipoinstitucionReturnGeneral,TipoInstitucionBean tipoinstitucionBean,Boolean conDefault) throws Exception {
		
			this.tipoinstitucionBean.setCursos(tipoinstitucionReturnGeneral.getTipoInstitucion().getCursos());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoInstitucion(TipoInstitucion tipoinstitucion,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(Curso.class)) {
					tipoinstitucion.setCursos(this.jInternalFrameDetalleFormTipoInstitucion.cursoBeanSwingJInternalFrame.cursoLogic.getCursos());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tipoinstitucion)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoInstitucion = new TipoInstitucionDetalleFormJInternalFrame(jDesktopPane,this.tipoinstitucionSessionBean.getConGuardarRelaciones(),this.tipoinstitucionSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoInstitucion);
		this.jInternalFrameDetalleFormTipoInstitucion.setVisible(false);
		this.jInternalFrameDetalleFormTipoInstitucion.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoInstitucion.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoInstitucion.tipoinstitucionLogic=this.tipoinstitucionLogic;
		
		this.cargarCombosFrameForeignKeyTipoInstitucion("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoInstitucion();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoInstitucion();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoInstitucion("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoInstitucion();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoInstitucion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoInstitucion"));
		
		this.jInternalFrameDetalleFormTipoInstitucion.jButtonModificarTipoInstitucion.addActionListener(new ButtonActionListener(this,"ModificarTipoInstitucion"));

		
		this.jInternalFrameDetalleFormTipoInstitucion.jButtonModificarToolBarTipoInstitucion.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoInstitucion"));
					
		this.jInternalFrameDetalleFormTipoInstitucion.jMenuItemModificarTipoInstitucion.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoInstitucion"));		
		
		
		
		this.jInternalFrameDetalleFormTipoInstitucion.jButtonActualizarTipoInstitucion.addActionListener (new ButtonActionListener(this,"ActualizarTipoInstitucion"));
		
		
		this.jInternalFrameDetalleFormTipoInstitucion.jButtonActualizarToolBarTipoInstitucion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoInstitucion"));
						
		this.jInternalFrameDetalleFormTipoInstitucion.jMenuItemActualizarTipoInstitucion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoInstitucion"));		
		
		
		
		this.jInternalFrameDetalleFormTipoInstitucion.jButtonEliminarTipoInstitucion.addActionListener (new ButtonActionListener(this,"EliminarTipoInstitucion"));
		
		
		this.jInternalFrameDetalleFormTipoInstitucion.jButtonEliminarToolBarTipoInstitucion.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoInstitucion"));
								
		this.jInternalFrameDetalleFormTipoInstitucion.jMenuItemEliminarTipoInstitucion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoInstitucion"));		
		
		
		
		this.jInternalFrameDetalleFormTipoInstitucion.jButtonCancelarTipoInstitucion.addActionListener (new ButtonActionListener(this,"CancelarTipoInstitucion"));
		
		
		this.jInternalFrameDetalleFormTipoInstitucion.jButtonCancelarToolBarTipoInstitucion.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoInstitucion"));
					
		this.jInternalFrameDetalleFormTipoInstitucion.jMenuItemCancelarTipoInstitucion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoInstitucion"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoInstitucion.jMenuItemDetalleCerrarTipoInstitucion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoInstitucion"));		
		
		
		
		this.jInternalFrameDetalleFormTipoInstitucion.jButtonGuardarCambiosToolBarTipoInstitucion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoInstitucion"));
		
		
		
		this.jInternalFrameDetalleFormTipoInstitucion.jButtonGuardarCambiosToolBarTipoInstitucion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoInstitucion"));
		
		
		
		this.jInternalFrameDetalleFormTipoInstitucion.jComboBoxTiposAccionesFormularioTipoInstitucion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoInstitucion"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoInstitucion.jButtonidTipoInstitucionBusqueda.addActionListener(new ButtonActionListener(this,"idTipoInstitucionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoInstitucion.jButtonid_empresaTipoInstitucionUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoInstitucionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoInstitucion.jButtonid_empresaTipoInstitucionBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoInstitucionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoInstitucion.jButtoncodigoTipoInstitucionBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoInstitucionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoInstitucion.jButtonnombreTipoInstitucionBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoInstitucionBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoInstitucion.jTabbedPaneRelacionesTipoInstitucion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoInstitucion"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoInstitucion"));
		
		if(this.jInternalFrameDetalleFormTipoInstitucion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoInstitucion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoInstitucion"));
		}
		
		this.jTableDatosTipoInstitucion.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoInstitucion"));
		
		this.jTableDatosTipoInstitucion.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoInstitucion"));
		
		this.jButtonNuevoTipoInstitucion.addActionListener(new ButtonActionListener(this,"NuevoTipoInstitucion"));
		
		this.jButtonDuplicarTipoInstitucion.addActionListener(new ButtonActionListener(this,"DuplicarTipoInstitucion"));
		
		this.jButtonCopiarTipoInstitucion.addActionListener(new ButtonActionListener(this,"CopiarTipoInstitucion"));
		
		this.jButtonVerFormTipoInstitucion.addActionListener(new ButtonActionListener(this,"VerFormTipoInstitucion"));
		
		
		this.jButtonNuevoToolBarTipoInstitucion.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoInstitucion"));
			
		this.jButtonDuplicarToolBarTipoInstitucion.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoInstitucion"));
			
		this.jMenuItemNuevoTipoInstitucion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoInstitucion"));
			
		this.jMenuItemDuplicarTipoInstitucion.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoInstitucion"));		
		
		
		this.jButtonNuevoRelacionesTipoInstitucion.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoInstitucion"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoInstitucion.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoInstitucion"));
			
		this.jMenuItemNuevoRelacionesTipoInstitucion.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoInstitucion"));		
		
		
		if(this.jInternalFrameDetalleFormTipoInstitucion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoInstitucion.jButtonModificarTipoInstitucion.addActionListener(new ButtonActionListener(this,"ModificarTipoInstitucion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoInstitucion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoInstitucion.jButtonModificarToolBarTipoInstitucion.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoInstitucion"));
			
			this.jInternalFrameDetalleFormTipoInstitucion.jMenuItemModificarTipoInstitucion.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoInstitucion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoInstitucion!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoInstitucion.jButtonActualizarTipoInstitucion.addActionListener (new ButtonActionListener(this,"ActualizarTipoInstitucion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoInstitucion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoInstitucion.jButtonActualizarToolBarTipoInstitucion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoInstitucion"));
				
			this.jInternalFrameDetalleFormTipoInstitucion.jMenuItemActualizarTipoInstitucion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoInstitucion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoInstitucion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoInstitucion.jButtonEliminarTipoInstitucion.addActionListener (new ButtonActionListener(this,"EliminarTipoInstitucion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoInstitucion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoInstitucion.jButtonEliminarToolBarTipoInstitucion.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoInstitucion"));
						
			this.jInternalFrameDetalleFormTipoInstitucion.jMenuItemEliminarTipoInstitucion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoInstitucion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoInstitucion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoInstitucion.jButtonCancelarTipoInstitucion.addActionListener (new ButtonActionListener(this,"CancelarTipoInstitucion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoInstitucion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoInstitucion.jButtonCancelarToolBarTipoInstitucion.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoInstitucion"));
			
			this.jInternalFrameDetalleFormTipoInstitucion.jMenuItemCancelarTipoInstitucion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoInstitucion"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoInstitucion.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoInstitucion"));		
		
		
		this.jButtonCerrarTipoInstitucion.addActionListener (new ButtonActionListener(this,"CerrarTipoInstitucion"));
		
		
		this.jButtonCerrarToolBarTipoInstitucion.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoInstitucion"));
			
		this.jMenuItemCerrarTipoInstitucion.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoInstitucion"));
			
		if(this.jInternalFrameDetalleFormTipoInstitucion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoInstitucion.jMenuItemDetalleCerrarTipoInstitucion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoInstitucion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoInstitucion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoInstitucion.jButtonGuardarCambiosTipoInstitucion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoInstitucion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoInstitucion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoInstitucion.jButtonGuardarCambiosToolBarTipoInstitucion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoInstitucion"));
		}
		
		this.jButtonCopiarToolBarTipoInstitucion.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoInstitucion"));
			
		this.jButtonVerFormToolBarTipoInstitucion.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoInstitucion"));
		
		this.jMenuItemGuardarCambiosTipoInstitucion.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoInstitucion"));
			
		this.jMenuItemCopiarTipoInstitucion.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoInstitucion"));		
		
		this.jMenuItemVerFormTipoInstitucion.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoInstitucion"));		
		
		
		this.jButtonGuardarCambiosTablaTipoInstitucion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoInstitucion"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoInstitucion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoInstitucion"));
			
		this.jMenuItemGuardarCambiosTablaTipoInstitucion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoInstitucion"));		
		
		
		
		this.jButtonRecargarInformacionTipoInstitucion.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoInstitucion"));
					
		this.jButtonRecargarInformacionToolBarTipoInstitucion.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoInstitucion"));
		
		this.jMenuItemRecargarInformacionTipoInstitucion.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoInstitucion"));		
		
		
		
		this.jButtonAnterioresTipoInstitucion.addActionListener (new ButtonActionListener(this,"AnterioresTipoInstitucion"));
		
		
		this.jButtonAnterioresToolBarTipoInstitucion.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoInstitucion"));
		
		this.jMenuItemAnterioresTipoInstitucion.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoInstitucion"));		
		
		
		this.jButtonSiguientesTipoInstitucion.addActionListener (new ButtonActionListener(this,"SiguientesTipoInstitucion"));
		
		
		this.jButtonSiguientesToolBarTipoInstitucion.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoInstitucion"));
			
		this.jMenuItemSiguientesTipoInstitucion.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoInstitucion"));
			
		this.jMenuItemAbrirOrderByTipoInstitucion.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoInstitucion"));
			
		this.jMenuItemMostrarOcultarTipoInstitucion.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoInstitucion"));
			
		this.jMenuItemDetalleAbrirOrderByTipoInstitucion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoInstitucion"));
			
		this.jMenuItemDetalleMostarOcultarTipoInstitucion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoInstitucion"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoInstitucion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoInstitucion"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoInstitucion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoInstitucion"));
			
		this.jMenuItemNuevoGuardarCambiosTipoInstitucion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoInstitucion"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoInstitucion.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoInstitucion"));

		this.jCheckBoxSeleccionadosTipoInstitucion.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoInstitucion"));
		
		if(this.jInternalFrameDetalleFormTipoInstitucion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoInstitucion.jComboBoxTiposAccionesFormularioTipoInstitucion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoInstitucion"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoInstitucion.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoInstitucion"));
			
		this.jComboBoxTiposAccionesTipoInstitucion.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoInstitucion"));
					
		this.jComboBoxTiposSeleccionarTipoInstitucion.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoInstitucion"));
			
		this.jTextFieldValorCampoGeneralTipoInstitucion.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoInstitucion"));		
		
		
		if(this.jInternalFrameDetalleFormTipoInstitucion!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoInstitucion.jButtonidTipoInstitucionBusqueda.addActionListener(new ButtonActionListener(this,"idTipoInstitucionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoInstitucion.jButtonid_empresaTipoInstitucionUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoInstitucionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoInstitucion.jButtonid_empresaTipoInstitucionBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoInstitucionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoInstitucion.jButtoncodigoTipoInstitucionBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoInstitucionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoInstitucion.jButtonnombreTipoInstitucionBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoInstitucionBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoInstitucion!=null) {
				this.jInternalFrameReporteDinamicoTipoInstitucion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoInstitucion"));
				this.jInternalFrameReporteDinamicoTipoInstitucion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoInstitucion"));
				this.jInternalFrameReporteDinamicoTipoInstitucion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoInstitucion"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoInstitucion.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoInstitucion"));				
			//this.jButtonGenerarReporteDinamicoTipoInstitucion.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoInstitucion"));
			//this.jButtonGenerarExcelReporteDinamicoTipoInstitucion.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoInstitucion"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoInstitucion!=null) {
				this.jInternalFrameImportacionTipoInstitucion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoInstitucion"));
				this.jInternalFrameImportacionTipoInstitucion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoInstitucion"));
				this.jInternalFrameImportacionTipoInstitucion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoInstitucion"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoInstitucion.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoInstitucion"));
			
			this.jButtonAbrirOrderByToolBarTipoInstitucion.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoInstitucion"));			
			
			if(this.jInternalFrameOrderByTipoInstitucion!=null) {
				this.jInternalFrameOrderByTipoInstitucion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoInstitucion"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoInstitucion!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoInstitucion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoInstitucion.jTabbedPaneRelacionesTipoInstitucion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoInstitucion"));
		
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
            		closingInternalFrameTipoInstitucion();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoInstitucion.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoInstitucion = (JInternalFrameBase)event.getSource();
	            	
	            TipoInstitucionBeanSwingJInternalFrame jInternalFrameParent=(TipoInstitucionBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoInstitucion.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoInstitucionActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoInstitucion.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoInstitucionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoInstitucion.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoInstitucion.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoInstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoInstitucionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoInstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoInstitucionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoInstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoInstitucionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoInstitucion";
		inputMap = this.jButtonNuevoTipoInstitucion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoInstitucion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoInstitucionActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoInstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoInstitucionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoInstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoInstitucionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoInstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoInstitucionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoInstitucion";
		inputMap = this.jButtonNuevoRelacionesTipoInstitucion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoInstitucion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoInstitucionActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoInstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoInstitucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoInstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoInstitucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoInstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoInstitucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoInstitucion";
		inputMap = this.jButtonModificarTipoInstitucion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoInstitucion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoInstitucionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoInstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoInstitucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoInstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoInstitucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoInstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoInstitucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoInstitucion";
		inputMap = this.jButtonActualizarTipoInstitucion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoInstitucion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoInstitucionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoInstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoInstitucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoInstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoInstitucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoInstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoInstitucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoInstitucion";
		inputMap = this.jButtonEliminarTipoInstitucion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoInstitucion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoInstitucionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoInstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoInstitucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoInstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoInstitucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoInstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoInstitucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoInstitucion";
		inputMap = this.jButtonCancelarTipoInstitucion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoInstitucion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoInstitucionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoInstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoInstitucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoInstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoInstitucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoInstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoInstitucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoInstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoInstitucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoInstitucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoInstitucion";
		inputMap = this.jButtonCerrarTipoInstitucion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoInstitucion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoInstitucionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoInstitucion.jButtonGuardarCambiosTipoInstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoInstitucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoInstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoInstitucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoInstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoInstitucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoInstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoInstitucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoInstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoInstitucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoInstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoInstitucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoInstitucion";
		inputMap = this.jInternalFrameDetalleFormTipoInstitucion.jButtonGuardarCambiosTipoInstitucion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoInstitucion.jButtonGuardarCambiosTipoInstitucion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoInstitucionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoInstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoInstitucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoInstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoInstitucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoInstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoInstitucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoInstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoInstitucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoInstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoInstitucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoInstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoInstitucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoInstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoInstitucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoInstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoInstitucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoInstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoInstitucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoInstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoInstitucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoInstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoInstitucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoInstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoInstitucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoInstitucion.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoInstitucionItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoInstitucion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoInstitucionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoInstitucion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoInstitucionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoInstitucion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoInstitucionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoInstitucion.jButtonidTipoInstitucionBusqueda.addActionListener(new ButtonActionListener(this,"idTipoInstitucionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoInstitucion.jButtonid_empresaTipoInstitucionUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoInstitucionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoInstitucion.jButtonid_empresaTipoInstitucionBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoInstitucionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoInstitucion.jButtoncodigoTipoInstitucionBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoInstitucionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoInstitucion.jButtonnombreTipoInstitucionBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoInstitucionBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoInstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoInstitucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoInstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoInstitucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoInstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoInstitucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoInstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoInstitucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoInstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoInstitucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoInstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoInstitucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoInstitucionActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoInstitucion.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoInstitucion(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoInstitucion tipoinstitucionAux:this.tipoinstitucionLogic.getTipoInstitucions()) {
					tipoinstitucionAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoInstitucion tipoinstitucionAux:tipoinstitucions) {
					tipoinstitucionAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoInstitucionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoInstitucion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoInstitucion tipoinstitucionAux:this.tipoinstitucionLogic.getTipoInstitucions()) {
						tipoinstitucionAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoInstitucion tipoinstitucionAux:tipoinstitucions) {
						tipoinstitucionAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoInstitucion tipoinstitucionAux:this.tipoinstitucionLogic.getTipoInstitucions()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoInstitucion tipoinstitucionAux:tipoinstitucions) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoInstitucion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoInstitucion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoInstitucion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoInstitucion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoInstitucionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoInstitucion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoInstitucion.getSelectedRows();
			
			TipoInstitucion tipoinstitucionLocal=new TipoInstitucion();
			
			//this.seleccionarTodosTipoInstitucion(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoinstitucionLocal =(TipoInstitucion) this.tipoinstitucionLogic.getTipoInstitucions().toArray()[this.jTableDatosTipoInstitucion.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipoinstitucionLocal =(TipoInstitucion) this.tipoinstitucions.toArray()[this.jTableDatosTipoInstitucion.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipoinstitucionLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoInstitucion tipoinstitucionAux:this.tipoinstitucionLogic.getTipoInstitucions()) {
						tipoinstitucionAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoInstitucion tipoinstitucionAux:tipoinstitucions) {
						tipoinstitucionAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoInstitucion(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoInstitucion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoInstitucion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoInstitucion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoInstitucionItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoInstitucionParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoInstitucionActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoInstitucion(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoInstitucion.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoInstitucion tipoinstitucionAux:this.tipoinstitucionLogic.getTipoInstitucions()) {
				
						if(sTipoSeleccionar.equals(TipoInstitucionConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoinstitucionAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoInstitucionConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoinstitucionAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoInstitucion tipoinstitucionAux:tipoinstitucions) {
					
						if(sTipoSeleccionar.equals(TipoInstitucionConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoinstitucionAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoInstitucionConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoinstitucionAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoInstitucion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoInstitucionActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoInstitucion(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoInstitucion=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoInstitucion.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoInstitucion.jComboBoxTiposAccionesFormularioTipoInstitucion.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoInstitucion) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoInstitucion(conSplash);
				
					this.generarReporteTipoInstitucionsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoInstitucion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoInstitucion.jComboBoxTiposAccionesFormularioTipoInstitucion.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoInstitucionsSeleccionados();
				//this.jComboBoxTiposAccionesTipoInstitucion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoInstitucionsSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoInstitucion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoInstitucionsSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoInstitucion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoInstitucion();
				
				this.exportarTipoInstitucionsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoInstitucion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoInstitucion.jComboBoxTiposAccionesFormularioTipoInstitucion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoInstitucions();
				//this.importarTipoInstitucions();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoInstitucion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoInstitucion.jComboBoxTiposAccionesFormularioTipoInstitucion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoInstitucion();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoInstitucionsSeleccionados();
				//this.jComboBoxTiposAccionesTipoInstitucion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Institucion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoInstitucion();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoInstitucion)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoInstitucion(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Institucion",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoInstitucion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoInstitucion.jComboBoxTiposAccionesFormularioTipoInstitucion.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoInstitucion();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoInstitucion(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoInstitucionActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoInstitucion();
			
			if(this.jInternalFrameDetalleFormTipoInstitucion==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoInstitucion> tipoinstitucionsSeleccionados=new ArrayList<TipoInstitucion>();		
			TipoInstitucion tipoinstitucion=new TipoInstitucion();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoInstitucion(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoInstitucion.getSelectedItem();
			
			
			
			
			tipoinstitucionsSeleccionados=this.getTipoInstitucionsSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipoinstitucionsSeleccionados.size()==1) {
				for(TipoInstitucion tipoinstitucionAux:tipoinstitucionsSeleccionados) {
					tipoinstitucion=tipoinstitucionAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Curso")) {
					jButtonCursoActionPerformed(null,rowIndex,true,false,tipoinstitucion);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoInstitucion();
			
      		//this.finishProcessTipoInstitucion(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoInstitucionReturnGeneral() throws Exception {
		if(this.tipoinstitucionReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipoinstitucionReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipoinstitucionReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipoinstitucionReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipoinstitucionReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipoinstitucionReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoInstitucion(false);
		}
		
		if(this.tipoinstitucionReturnGeneral.getConRetornoLista() || this.tipoinstitucionReturnGeneral.getConRetornoObjeto()) {
			if(this.tipoinstitucionReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoinstitucionLogic.setTipoInstitucions(this.tipoinstitucionReturnGeneral.getTipoInstitucions());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipoinstitucionReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoinstitucionLogic.setTipoInstitucion(this.tipoinstitucionReturnGeneral.getTipoInstitucion());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoInstitucion(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoInstitucion() throws Exception {
		
		
	}
	
	public ArrayList<TipoInstitucion> getTipoInstitucionsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoInstitucion> tipoinstitucionsSeleccionados=new ArrayList<TipoInstitucion>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoInstitucion) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoInstitucion tipoinstitucionAux:tipoinstitucionLogic.getTipoInstitucions()) {
					if(tipoinstitucionAux.getIsSelected()) {
						tipoinstitucionsSeleccionados.add(tipoinstitucionAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoInstitucion tipoinstitucionAux:this.tipoinstitucions) {
					if(tipoinstitucionAux.getIsSelected()) {
						tipoinstitucionsSeleccionados.add(tipoinstitucionAux);				
					}
				}
			}
			
			if(tipoinstitucionsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipoinstitucionsSeleccionados.addAll(this.tipoinstitucionLogic.getTipoInstitucions());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipoinstitucionsSeleccionados.addAll(this.tipoinstitucions);				
					}
				}
			}
		} else {
			tipoinstitucionsSeleccionados.add(this.tipoinstitucion);
		}
		
		return tipoinstitucionsSeleccionados;
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
	
	public void generarReporteTipoInstitucionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoInstitucionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoInstitucionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoInstitucionsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoInstitucionsSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoInstitucionsSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Institucion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoInstitucionsSeleccionados() throws Exception {
		ArrayList<TipoInstitucion> tipoinstitucionsSeleccionados=new ArrayList<TipoInstitucion>();		
		
		tipoinstitucionsSeleccionados=this.getTipoInstitucionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoInstitucions("Todos",tipoinstitucionsSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoInstitucionsSeleccionados() throws Exception {
		ArrayList<TipoInstitucion> tipoinstitucionsSeleccionados=new ArrayList<TipoInstitucion>();		
		
		tipoinstitucionsSeleccionados=this.getTipoInstitucionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoInstitucions("Todos",tipoinstitucionsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoInstitucionsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoInstitucion> tipoinstitucionsSeleccionados=new ArrayList<TipoInstitucion>();
		
		tipoinstitucionsSeleccionados=this.getTipoInstitucionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoInstitucions("Todos",tipoinstitucionsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoInstitucionsSeleccionados() throws Exception {
		ArrayList<TipoInstitucion> tipoinstitucionsSeleccionados=new ArrayList<TipoInstitucion>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoInstitucion();
		
		
		tipoinstitucionsSeleccionados=this.getTipoInstitucionsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoInstitucion();
		
		
		//this.generarReporteTipoInstitucions("Todos",tipoinstitucionsSeleccionados ,tipoinstitucionImplementable,tipoinstitucionImplementableHome);
	}
	
	public void mostrarImportacionTipoInstitucions() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoInstitucion();
		
		this.abrirFrameImportacionTipoInstitucion();		
		
			
		//this.generarReporteTipoInstitucions("Todos",tipoinstitucionsSeleccionados ,tipoinstitucionImplementable,tipoinstitucionImplementableHome);
	}
	
	public void importarTipoInstitucions() throws Exception {		
	
	}
	
	public void exportarTipoInstitucionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoInstitucionsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoInstitucionsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoInstitucionsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Institucion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoInstitucionsSeleccionados() throws Exception {
		ArrayList<TipoInstitucion> tipoinstitucionsSeleccionados=new ArrayList<TipoInstitucion>();		
		
		tipoinstitucionsSeleccionados=this.getTipoInstitucionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoinstitucion."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoInstitucion(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoInstitucion tipoinstitucionAux:tipoinstitucionsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoInstitucion(tipoinstitucionAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipoinstitucionAux.setsDetalleGeneralEntityReporte(tipoinstitucionAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoinstitucionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Institucion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoInstitucion(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoInstitucionConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoInstitucionConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoInstitucionConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoInstitucionConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoInstitucionConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoInstitucion(TipoInstitucion tipoinstitucion,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipoinstitucion.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoinstitucion.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoinstitucion.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoinstitucion.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoinstitucion.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoInstitucionsSeleccionados() throws Exception {
		ArrayList<TipoInstitucion> tipoinstitucionsSeleccionados=new ArrayList<TipoInstitucion>();		
		
		tipoinstitucionsSeleccionados=this.getTipoInstitucionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoinstitucion.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoInstitucions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoInstitucion(row);				
				iRow++;
			}				
			
			for(TipoInstitucion tipoinstitucionAux:tipoinstitucionsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoInstitucion(tipoinstitucionAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoinstitucionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Institucion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoInstitucionsSeleccionados() throws Exception {
		ArrayList<TipoInstitucion> tipoinstitucionsSeleccionados=new ArrayList<TipoInstitucion>();		
		
		tipoinstitucionsSeleccionados=this.getTipoInstitucionsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoinstitucion.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipoinstitucions");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipoinstitucion");
			//elementRoot.appendChild(element);
		
			for(TipoInstitucion tipoinstitucionAux:tipoinstitucionsSeleccionados) {
				element = document.createElement("tipoinstitucion");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoInstitucion(tipoinstitucionAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoinstitucionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Institucion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoInstitucion(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoInstitucionConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoInstitucionConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoInstitucionConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoInstitucionConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoInstitucionConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoInstitucion(TipoInstitucion tipoinstitucion,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipoinstitucion.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoinstitucion.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoinstitucion.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoinstitucion.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoInstitucion(TipoInstitucion tipoinstitucion,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoInstitucionConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipoinstitucion.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoInstitucionConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipoinstitucion.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TipoInstitucionConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tipoinstitucion.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo = document.createElement(TipoInstitucionConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipoinstitucion.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoInstitucionConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipoinstitucion.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoInstitucionsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoInstitucion> tipoinstitucionsSeleccionados=new ArrayList<TipoInstitucion>();
		
		tipoinstitucionsSeleccionados=this.getTipoInstitucionsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoInstitucion(tipoinstitucionsSeleccionados);
		
		this.generarReporteTipoInstitucions("Todos",tipoinstitucionsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoInstitucion(ArrayList<TipoInstitucion> tipoinstitucionsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoInstitucion tipoinstitucionAux:tipoinstitucionsSeleccionados) {
				tipoinstitucionAux.setsDetalleGeneralEntityReporte(tipoinstitucionAux.toString());
			
				if(sTipoSeleccionar.equals(TipoInstitucionConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tipoinstitucionAux.setsDescripcionGeneralEntityReporte1(tipoinstitucionAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoInstitucionConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipoinstitucionAux.setsDescripcionGeneralEntityReporte1(tipoinstitucionAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoInstitucionConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipoinstitucionAux.setsDescripcionGeneralEntityReporte1(tipoinstitucionAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInstitucionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoInstitucion(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoInstitucion=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoInstitucion=true;
				this.isVisibilidadCeldaGuardarCambiosTipoInstitucion=true;
			}
			
			this.isVisibilidadCeldaModificarTipoInstitucion=false;
			this.isVisibilidadCeldaActualizarTipoInstitucion=false;
			this.isVisibilidadCeldaEliminarTipoInstitucion=false;
			this.isVisibilidadCeldaCancelarTipoInstitucion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoInstitucion=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoInstitucion=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoInstitucion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoInstitucion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoInstitucion=false;
			this.isVisibilidadCeldaModificarTipoInstitucion=false;
			this.isVisibilidadCeldaActualizarTipoInstitucion=true;
			this.isVisibilidadCeldaEliminarTipoInstitucion=false;
			this.isVisibilidadCeldaCancelarTipoInstitucion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoInstitucion=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoInstitucion=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoInstitucion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoInstitucion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoInstitucion=false;
			this.isVisibilidadCeldaModificarTipoInstitucion=false;
			this.isVisibilidadCeldaActualizarTipoInstitucion=true;
			this.isVisibilidadCeldaEliminarTipoInstitucion=true;
			this.isVisibilidadCeldaCancelarTipoInstitucion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoInstitucion=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoInstitucion=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoInstitucion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoInstitucion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoInstitucion=false;
			this.isVisibilidadCeldaModificarTipoInstitucion=false;
			this.isVisibilidadCeldaActualizarTipoInstitucion=true;
			this.isVisibilidadCeldaEliminarTipoInstitucion=false;
			this.isVisibilidadCeldaCancelarTipoInstitucion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoInstitucion=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoInstitucion=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoInstitucion=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoInstitucion=true;
			this.isVisibilidadCeldaGuardarCambiosTipoInstitucion=true;
			this.isVisibilidadCeldaModificarTipoInstitucion=false;
			this.isVisibilidadCeldaActualizarTipoInstitucion=false;
			this.isVisibilidadCeldaEliminarTipoInstitucion=false;
			this.isVisibilidadCeldaCancelarTipoInstitucion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoInstitucion=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoInstitucion=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoInstitucion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoInstitucion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoInstitucion=false;
			this.isVisibilidadCeldaActualizarTipoInstitucion=false;
			this.isVisibilidadCeldaEliminarTipoInstitucion=false;
			this.isVisibilidadCeldaCancelarTipoInstitucion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoInstitucion=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoInstitucion=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoInstitucion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoInstitucion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoInstitucion=false;
			this.isVisibilidadCeldaModificarTipoInstitucion=true;
			this.isVisibilidadCeldaActualizarTipoInstitucion=false;
			this.isVisibilidadCeldaEliminarTipoInstitucion=false;
			this.isVisibilidadCeldaCancelarTipoInstitucion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoInstitucion=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoInstitucion=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoInstitucionJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoInstitucion=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoInstitucion=true;
			this.isVisibilidadCeldaGuardarCambiosTipoInstitucion=true;
		} else {
			this.actualizarEstadoPanelsTipoInstitucion(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoInstitucion=false;
			//this.isVisibilidadCeldaVerFormTipoInstitucion=false;
			this.isVisibilidadCeldaDuplicarTipoInstitucion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipoinstitucionSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoInstitucion=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoInstitucion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoInstitucion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipoinstitucionSessionBean.getEsGuardarRelacionado()) {
			if(!tipoinstitucionSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoInstitucion=false;												
			}
			
			this.jButtonCerrarTipoInstitucion.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoInstitucion=false;
		}
		
		if(!this.permiteMantenimiento(this.tipoinstitucion)) {
			this.isVisibilidadCeldaActualizarTipoInstitucion=false;
			this.isVisibilidadCeldaEliminarTipoInstitucion=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoInstitucion() {
		this.isVisibilidadCeldaNuevoTipoInstitucion=false;
		this.isVisibilidadCeldaGuardarCambiosTipoInstitucion=false;
	}
	
	public void actualizarEstadoPanelsTipoInstitucion(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoInstitucion!=null) {
				this.jScrollPanelDatosEdicionTipoInstitucion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoInstitucion!=null) {
				this.jTabbedPaneBusquedasTipoInstitucion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoInstitucion!=null) {
				this.jScrollPanelDatosTipoInstitucion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoInstitucion!=null) {
				this.jPanelPaginacionTipoInstitucion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoInstitucion!=null) {
				this.jPanelParametrosReportesTipoInstitucion.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoInstitucion!=null) {
				this.jScrollPanelDatosEdicionTipoInstitucion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoInstitucion!=null) {
				this.jTabbedPaneBusquedasTipoInstitucion.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoInstitucion!=null) {
				this.jScrollPanelDatosTipoInstitucion.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoInstitucion!=null) {
				this.jPanelPaginacionTipoInstitucion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoInstitucion!=null) {
				this.jPanelParametrosReportesTipoInstitucion.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoInstitucion!=null) {
				this.jScrollPanelDatosEdicionTipoInstitucion.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoInstitucion!=null) {
				this.jTabbedPaneBusquedasTipoInstitucion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoInstitucion!=null) {
				this.jScrollPanelDatosTipoInstitucion.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoInstitucion!=null) {
				this.jPanelPaginacionTipoInstitucion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoInstitucion!=null) {
				this.jPanelParametrosReportesTipoInstitucion.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoInstitucion!=null) {
				this.jScrollPanelDatosEdicionTipoInstitucion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoInstitucion!=null) {
				this.jTabbedPaneBusquedasTipoInstitucion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoInstitucion!=null) {
				this.jScrollPanelDatosTipoInstitucion.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoInstitucion!=null) {
				this.jPanelPaginacionTipoInstitucion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoInstitucion!=null) {
				this.jPanelParametrosReportesTipoInstitucion.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoInstitucion!=null) {
				this.jScrollPanelDatosEdicionTipoInstitucion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoInstitucion!=null) {
				this.jTabbedPaneBusquedasTipoInstitucion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoInstitucion!=null) {
				this.jScrollPanelDatosTipoInstitucion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoInstitucion!=null) {
				this.jPanelPaginacionTipoInstitucion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoInstitucion!=null) {
				this.jPanelParametrosReportesTipoInstitucion.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoInstitucion!=null) {
				this.jScrollPanelDatosEdicionTipoInstitucion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoInstitucion!=null) {
				this.jTabbedPaneBusquedasTipoInstitucion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoInstitucion!=null) {
				this.jScrollPanelDatosTipoInstitucion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoInstitucion!=null) {
				this.jPanelPaginacionTipoInstitucion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoInstitucion!=null) {
				this.jPanelParametrosReportesTipoInstitucion.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoInstitucion!=null) {
				this.jScrollPanelDatosEdicionTipoInstitucion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoInstitucion!=null) {
				this.jTabbedPaneBusquedasTipoInstitucion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoInstitucion!=null) {
				this.jScrollPanelDatosTipoInstitucion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoInstitucion!=null) {
				this.jPanelPaginacionTipoInstitucion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoInstitucion!=null) {
				this.jPanelParametrosReportesTipoInstitucion.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipoinstitucionSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoInstitucion!=null) {
					this.jTabbedPaneBusquedasTipoInstitucion.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoInstitucion!=null) {
				this.jPanelParametrosReportesTipoInstitucion.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipoinstitucionSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoInstitucion!=null) {
				this.jTabbedPaneBusquedasTipoInstitucion.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoInstitucion!=null) {
				this.jPanelParametrosReportesTipoInstitucion.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;
		}
		
	}
	
	

	public String registrarSesionTipoInstitucionParaCursos() throws Exception {
		Boolean isPaginaPopupCurso=false;

		try {

			if(this.tipoinstitucionSessionBean==null) {
				this.tipoinstitucionSessionBean=new TipoInstitucionSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoInstitucion.cursoSessionBean==null) {
				this.jInternalFrameDetalleFormTipoInstitucion.cursoSessionBean=new CursoSessionBean();
			}

			this.jInternalFrameDetalleFormTipoInstitucion.cursoSessionBean.setsPathNavegacionActual(tipoinstitucionSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CursoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoInstitucion.cursoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupCurso=this.jInternalFrameDetalleFormTipoInstitucion.cursoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoInstitucion.cursoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCurso(true);
			this.jInternalFrameDetalleFormTipoInstitucion.cursoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCurso(TipoInstitucionConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoInstitucion.cursoSessionBean.setisBusquedaDesdeForeignKeySesionTipoInstitucion(true);
			this.jInternalFrameDetalleFormTipoInstitucion.cursoSessionBean.setlidTipoInstitucionActual(this.idTipoInstitucionActual);

			tipoinstitucionSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoInstitucion(true);
			tipoinstitucionSessionBean.setlIdTipoInstitucionActualForeignKey(this.idTipoInstitucionActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoInstitucionSessionBean tipoinstitucionSessionBean=new TipoInstitucionSessionBean();
		
		if(this.tipoinstitucionSessionBean==null) {
			this.tipoinstitucionSessionBean=new TipoInstitucionSessionBean();
		}
		
		this.tipoinstitucionSessionBean.setsUltimaBusquedaTipoInstitucion(this.getsAccionBusqueda());
		this.tipoinstitucionSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipoinstitucionSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tipoinstitucionSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoInstitucionSessionBean tipoinstitucionSessionBean=new TipoInstitucionSessionBean();
		
		if(this.tipoinstitucionSessionBean==null) {
			this.tipoinstitucionSessionBean=new TipoInstitucionSessionBean();
		}
		
		if(this.tipoinstitucionSessionBean.getsUltimaBusquedaTipoInstitucion()!=null&&!this.tipoinstitucionSessionBean.getsUltimaBusquedaTipoInstitucion().equals("")) {
			this.setsAccionBusqueda(tipoinstitucionSessionBean.getsUltimaBusquedaTipoInstitucion());
			this.setiNumeroPaginacion(tipoinstitucionSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipoinstitucionSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tipoinstitucionSessionBean.getid_empresa());
				tipoinstitucionSessionBean.setid_empresa(-1L);
			}
		}
		
		this.tipoinstitucionSessionBean.setsUltimaBusquedaTipoInstitucion("");
		this.tipoinstitucionSessionBean.setiNumeroPaginacion(TipoInstitucionConstantesFunciones.INUMEROPAGINACION);
		this.tipoinstitucionSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoInstitucion(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoInstitucion() {
		this.updateBorderResaltarBusquedasFormularioTipoInstitucion();
		this.updateVisibilidadBusquedasFormularioTipoInstitucion();
		this.updateHabilitarBusquedasFormularioTipoInstitucion();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoInstitucion() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoInstitucion.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoInstitucion() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoInstitucion.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoInstitucion() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoInstitucion.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoInstitucion(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarTipoInstitucion.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoInstitucion() throws Exception {

		if(this.jInternalFrameDetalleFormTipoInstitucion==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoInstitucion();
		this.updateVisibilidadResaltarControlesFormularioTipoInstitucion();
		this.updateHabilitarResaltarControlesFormularioTipoInstitucion();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoInstitucion() throws Exception {
		if(this.jInternalFrameDetalleFormTipoInstitucion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipoinstitucionConstantesFunciones.resaltaridTipoInstitucion!=null && this.jInternalFrameDetalleFormTipoInstitucion!=null) {this.jInternalFrameDetalleFormTipoInstitucion.jLabelidTipoInstitucion.setBorder(this.tipoinstitucionConstantesFunciones.resaltaridTipoInstitucion);}
		if(this.tipoinstitucionConstantesFunciones.resaltarid_empresaTipoInstitucion!=null && this.jInternalFrameDetalleFormTipoInstitucion!=null) {this.jInternalFrameDetalleFormTipoInstitucion.jComboBoxid_empresaTipoInstitucion.setBorder(this.tipoinstitucionConstantesFunciones.resaltarid_empresaTipoInstitucion);}
		if(this.tipoinstitucionConstantesFunciones.resaltarcodigoTipoInstitucion!=null && this.jInternalFrameDetalleFormTipoInstitucion!=null) {this.jInternalFrameDetalleFormTipoInstitucion.jTextFieldcodigoTipoInstitucion.setBorder(this.tipoinstitucionConstantesFunciones.resaltarcodigoTipoInstitucion);}
		if(this.tipoinstitucionConstantesFunciones.resaltarnombreTipoInstitucion!=null && this.jInternalFrameDetalleFormTipoInstitucion!=null) {this.jInternalFrameDetalleFormTipoInstitucion.jTextAreanombreTipoInstitucion.setBorder(this.tipoinstitucionConstantesFunciones.resaltarnombreTipoInstitucion);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoInstitucion() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoInstitucion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoInstitucion!=null) {
	
		//this.jInternalFrameDetalleFormTipoInstitucion.jLabelidTipoInstitucion.setVisible(this.tipoinstitucionConstantesFunciones.mostraridTipoInstitucion);
		this.jInternalFrameDetalleFormTipoInstitucion.jPanelidTipoInstitucion.setVisible(this.tipoinstitucionConstantesFunciones.mostraridTipoInstitucion);
		//this.jInternalFrameDetalleFormTipoInstitucion.jComboBoxid_empresaTipoInstitucion.setVisible(this.tipoinstitucionConstantesFunciones.mostrarid_empresaTipoInstitucion);
		this.jInternalFrameDetalleFormTipoInstitucion.jPanelid_empresaTipoInstitucion.setVisible(this.tipoinstitucionConstantesFunciones.mostrarid_empresaTipoInstitucion);
		//this.jInternalFrameDetalleFormTipoInstitucion.jTextFieldcodigoTipoInstitucion.setVisible(this.tipoinstitucionConstantesFunciones.mostrarcodigoTipoInstitucion);
		this.jInternalFrameDetalleFormTipoInstitucion.jPanelcodigoTipoInstitucion.setVisible(this.tipoinstitucionConstantesFunciones.mostrarcodigoTipoInstitucion);
		//this.jInternalFrameDetalleFormTipoInstitucion.jTextAreanombreTipoInstitucion.setVisible(this.tipoinstitucionConstantesFunciones.mostrarnombreTipoInstitucion);
		this.jInternalFrameDetalleFormTipoInstitucion.jPanelnombreTipoInstitucion.setVisible(this.tipoinstitucionConstantesFunciones.mostrarnombreTipoInstitucion);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoInstitucion() throws Exception {
		if(this.jInternalFrameDetalleFormTipoInstitucion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoInstitucion!=null) {
	
		this.jInternalFrameDetalleFormTipoInstitucion.jLabelidTipoInstitucion.setEnabled(this.tipoinstitucionConstantesFunciones.activaridTipoInstitucion);
		this.jInternalFrameDetalleFormTipoInstitucion.jComboBoxid_empresaTipoInstitucion.setEnabled(this.tipoinstitucionConstantesFunciones.activarid_empresaTipoInstitucion);
		this.jInternalFrameDetalleFormTipoInstitucion.jTextFieldcodigoTipoInstitucion.setEnabled(this.tipoinstitucionConstantesFunciones.activarcodigoTipoInstitucion);
		this.jInternalFrameDetalleFormTipoInstitucion.jTextAreanombreTipoInstitucion.setEnabled(this.tipoinstitucionConstantesFunciones.activarnombreTipoInstitucion);
		}
	}
	
		
}