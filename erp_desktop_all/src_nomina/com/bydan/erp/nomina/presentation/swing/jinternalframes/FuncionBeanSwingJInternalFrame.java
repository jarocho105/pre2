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

import com.bydan.erp.nomina.util.FuncionConstantesFunciones;
import com.bydan.erp.nomina.util.FuncionParameterReturnGeneral;
//import com.bydan.erp.nomina.util.FuncionParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.FuncionBean;
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
public class FuncionBeanSwingJInternalFrame extends FuncionJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(FuncionBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Funcion> funcionValidator = new ClassValidator<Funcion>(Funcion.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Funcion funcion;	
	public Funcion funcionAux;
	public Funcion funcionAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Funcion funcionTotales;
	public Long idFuncionActual;
	public Long iIdNuevoFuncion=0L;
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

		
	
	
	
	
	

	public Boolean isTienePermisosFuncionEstruc=false;

	public Boolean getIsTienePermisosFuncionEstruc() {
		return isTienePermisosFuncionEstruc;
	}

	public void setIsTienePermisosFuncionEstruc(Boolean isTienePermisosFuncionEstruc) {
		this.isTienePermisosFuncionEstruc= isTienePermisosFuncionEstruc;
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
	
	public Boolean isPermisoTodoFuncion;
	public Boolean isPermisoNuevoFuncion;
	public Boolean isPermisoActualizarFuncion;
	public Boolean isPermisoActualizarOriginalFuncion;
	public Boolean isPermisoEliminarFuncion;
	public Boolean isPermisoGuardarCambiosFuncion;
	public Boolean isPermisoConsultaFuncion;
	public Boolean isPermisoBusquedaFuncion;
	public Boolean isPermisoReporteFuncion;
	public Boolean isPermisoPaginacionMedioFuncion;
	public Boolean isPermisoPaginacionAltoFuncion;
	public Boolean isPermisoPaginacionTodoFuncion;
	public Boolean isPermisoCopiarFuncion;
	public Boolean isPermisoVerFormFuncion;
	public Boolean isPermisoDuplicarFuncion;
	public Boolean isPermisoOrdenFuncion;
	
	
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
	
	public FuncionParameterReturnGeneral funcionReturnGeneral;
	public FuncionParameterReturnGeneral funcionParameterGeneral;
	
	

	public FuncionEstrucLogic funcionestrucLogic=null;

	public FuncionEstrucLogic getFuncionEstrucLogic() {
		return funcionestrucLogic;
	}

	public void setFuncionEstrucLogic(FuncionEstrucLogic funcionestrucLogic) {
		this.funcionestrucLogic = funcionestrucLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoFuncion=false;
	public Boolean esParaAccionDesdeFormularioFuncion=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected FuncionSessionBeanAdditional funcionSessionBeanAdditional=null;
	
	public FuncionSessionBeanAdditional getFuncionSessionBeanAdditional() {
		return this.funcionSessionBeanAdditional;
	}
	
	public void setFuncionSessionBeanAdditional(FuncionSessionBeanAdditional funcionSessionBeanAdditional) {
		try {
			this.funcionSessionBeanAdditional=funcionSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected FuncionBeanSwingJInternalFrameAdditional funcionBeanSwingJInternalFrameAdditional=null;
	//public class FuncionBeanSwingJInternalFrame
	
	public FuncionBeanSwingJInternalFrameAdditional getFuncionBeanSwingJInternalFrameAdditional() {
		return this.funcionBeanSwingJInternalFrameAdditional;
	}
	
	public void setFuncionBeanSwingJInternalFrameAdditional(FuncionBeanSwingJInternalFrameAdditional funcionBeanSwingJInternalFrameAdditional) {
		try {
			this.funcionBeanSwingJInternalFrameAdditional=funcionBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public FuncionLogic funcionLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Funcion funcionBean;
	public FuncionConstantesFunciones funcionConstantesFunciones;
	//public FuncionParameterReturnGeneral funcionReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<Funcion> funcions;	
	//public List<Funcion> funcionsEliminados;
	//public List<Funcion> funcionsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoFuncion=false;
	public Boolean isVisibilidadCeldaDuplicarFuncion=true;
	public Boolean isVisibilidadCeldaCopiarFuncion=true;
	public Boolean isVisibilidadCeldaVerFormFuncion=true;
	public Boolean isVisibilidadCeldaOrdenFuncion=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesFuncion=false;
	public Boolean isVisibilidadCeldaModificarFuncion=false;
	public Boolean isVisibilidadCeldaActualizarFuncion=false;
	public Boolean isVisibilidadCeldaEliminarFuncion=false;
	public Boolean isVisibilidadCeldaCancelarFuncion=false;
	public Boolean isVisibilidadCeldaGuardarFuncion=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosFuncion=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoFuncion() {
		return this.iIdNuevoFuncion;
	}

	public void setiIdNuevoFuncion(Long iIdNuevoFuncion) {
		this.iIdNuevoFuncion = iIdNuevoFuncion;
	}
	
	public Long getidFuncionActual() {
		return this.idFuncionActual;
	}

	public void setidFuncionActual(Long idFuncionActual) {
		this.idFuncionActual = idFuncionActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Funcion getfuncion() {
		return this.funcion;
	}

	public void setfuncion(Funcion funcion) {
		this.funcion = funcion;
	}
	
	public Funcion getfuncionAux() {
		return this.funcionAux;
	}

	public void setfuncionAux(Funcion funcionAux) {
		this.funcionAux = funcionAux;
	}				
	
	public Funcion getfuncionAnterior() {
		return this.funcionAnterior;
	}

	public void setfuncionAnterior(Funcion funcionAnterior) {
		this.funcionAnterior = funcionAnterior;
	}	
	
	public Funcion getfuncionTotales() {
		return this.funcionTotales;
	}

	public void setfuncionTotales(Funcion funcionTotales) {
		this.funcionTotales = funcionTotales;
	}	
	
	public Funcion getfuncionBean() {
		return this.funcionBean;
	}

	public void setfuncionBean(Funcion funcionBean) {
		this.funcionBean = funcionBean;
	}	
	
	public FuncionParameterReturnGeneral getfuncionReturnGeneral() {
		return this.funcionReturnGeneral;
	}

	public void setfuncionReturnGeneral(FuncionParameterReturnGeneral funcionReturnGeneral) {
		this.funcionReturnGeneral = funcionReturnGeneral;
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
	
	
	public FuncionLogic getFuncionLogic()	{		
		return funcionLogic;
	}

	public void setFuncionLogic(FuncionLogic funcionLogic) {
		this.funcionLogic = funcionLogic;
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
	
	public Boolean getIsEsNuevoFuncion() {
		return isEsNuevoFuncion;
	}

	public void setIsEsNuevoFuncion(Boolean isEsNuevoFuncion) {
		this.isEsNuevoFuncion = isEsNuevoFuncion;
	}

	public Boolean getEsParaAccionDesdeFormularioFuncion() {
		return esParaAccionDesdeFormularioFuncion;
	}
	
	public void setEsParaAccionDesdeFormularioFuncion(Boolean esParaAccionDesdeFormularioFuncion) {
		this.esParaAccionDesdeFormularioFuncion = esParaAccionDesdeFormularioFuncion;
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

			if(this.funcionSessionBean==null) {
				this.funcionSessionBean=new FuncionSessionBean();
			}

			if(!this.funcionSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(funcionSessionBean.getlidEmpresaActual());
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

					if(this.funcion!=null) {
						this.funcion.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormFuncion!=null) {
						this.jInternalFrameDetalleFormFuncion.jComboBoxid_empresaFuncion.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaFuncion.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormFuncion!=null) {
						if(this.jInternalFrameDetalleFormFuncion.jComboBoxid_empresaFuncion.getItemCount()>0) {
							this.jInternalFrameDetalleFormFuncion.jComboBoxid_empresaFuncion.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaFuncionGenerico)throws Exception
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
				jComboBoxid_empresaFuncionGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaFuncionGenerico!=null && jComboBoxid_empresaFuncionGenerico.getItemCount()>0) {
					jComboBoxid_empresaFuncionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(Funcion funcion,JComboBox jComboBoxid_empresaFuncionGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaFuncionGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormFuncion.jComboBoxid_empresaFuncion.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaFuncionGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				funcion.setid_empresa(empresaAux.getId());
				funcion.setempresa_descripcion(FuncionConstantesFunciones.getEmpresaDescripcion(empresaAux));
				funcion.setEmpresa(empresaAux);			}
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

					if(!FuncionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormFuncion!=null) { 
							this.jInternalFrameDetalleFormFuncion.jComboBoxid_empresaFuncion.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormFuncion.jComboBoxid_empresaFuncion.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormFuncion!=null) { 
					}

					if(!FuncionJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormFuncion!=null) {
							this.jInternalFrameDetalleFormFuncion.jComboBoxid_empresaFuncion.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormFuncion!=null) {
							this.jInternalFrameDetalleFormFuncion.jComboBoxid_empresaFuncion.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesFuncion() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			FuncionConstantesFunciones.refrescarForeignKeysDescripcionesFuncion(this.funcionLogic.getFuncions());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			FuncionConstantesFunciones.refrescarForeignKeysDescripcionesFuncion(this.funcions);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//funcionLogic.setFuncions(this.funcions);
			funcionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public FuncionParameterReturnGeneral getFuncionParameterGeneral() {
		return this.funcionParameterGeneral;
	}
	
	public void setFuncionParameterGeneral(FuncionParameterReturnGeneral funcionParameterGeneral) {
		this.funcionParameterGeneral = funcionParameterGeneral;
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
	
	public Boolean getIsPermisoTodoFuncion() {
		return isPermisoTodoFuncion;
	}

	public void setIsPermisoTodoFuncion(Boolean isPermisoTodoFuncion) {
		this.isPermisoTodoFuncion = isPermisoTodoFuncion;
	}

	public Boolean getIsPermisoNuevoFuncion() {
		return isPermisoNuevoFuncion;
	}

	public void setIsPermisoNuevoFuncion(Boolean isPermisoNuevoFuncion) {
		this.isPermisoNuevoFuncion = isPermisoNuevoFuncion;
	}

	public Boolean getIsPermisoActualizarFuncion() {
		return isPermisoActualizarFuncion;
	}

	public void setIsPermisoActualizarFuncion(Boolean isPermisoActualizarFuncion) {
		this.isPermisoActualizarFuncion = isPermisoActualizarFuncion;
	}

	public Boolean getIsPermisoEliminarFuncion() {
		return isPermisoEliminarFuncion;
	}

	public void setIsPermisoEliminarFuncion(Boolean isPermisoEliminarFuncion) {
		this.isPermisoEliminarFuncion = isPermisoEliminarFuncion;
	}

	public Boolean getIsPermisoGuardarCambiosFuncion() {
		return isPermisoGuardarCambiosFuncion;
	}

	public void setIsPermisoGuardarCambiosFuncion(Boolean isPermisoGuardarCambiosFuncion) {
		this.isPermisoGuardarCambiosFuncion = isPermisoGuardarCambiosFuncion;
	}
	
	public Boolean getIsPermisoConsultaFuncion() {
		return isPermisoConsultaFuncion;
	}

	public void setIsPermisoConsultaFuncion(Boolean isPermisoConsultaFuncion) {
		this.isPermisoConsultaFuncion = isPermisoConsultaFuncion;
	}

	public Boolean getIsPermisoBusquedaFuncion() {
		return isPermisoBusquedaFuncion;
	}

	public void setIsPermisoBusquedaFuncion(Boolean isPermisoBusquedaFuncion) {
		this.isPermisoBusquedaFuncion = isPermisoBusquedaFuncion;
	}

	public Boolean getIsPermisoReporteFuncion() {
		return isPermisoReporteFuncion;
	}

	public void setIsPermisoReporteFuncion(Boolean isPermisoReporteFuncion) {
		this.isPermisoReporteFuncion = isPermisoReporteFuncion;
	}
	
	public Boolean getIsPermisoPaginacionMedioFuncion() {
		return isPermisoPaginacionMedioFuncion;
	}

	public void setIsPermisoPaginacionMedioFuncion(Boolean isPermisoPaginacionMedioFuncion) {
		this.isPermisoPaginacionMedioFuncion = isPermisoPaginacionMedioFuncion;
	}
	
	public Boolean getIsPermisoPaginacionTodoFuncion() {
		return isPermisoPaginacionTodoFuncion;
	}

	public void setIsPermisoPaginacionTodoFuncion(Boolean isPermisoPaginacionTodoFuncion) {
		this.isPermisoPaginacionTodoFuncion = isPermisoPaginacionTodoFuncion;
	}
	
	public Boolean getIsPermisoPaginacionAltoFuncion() {
		return isPermisoPaginacionAltoFuncion;
	}

	public void setIsPermisoPaginacionAltoFuncion(Boolean isPermisoPaginacionAltoFuncion) {
		this.isPermisoPaginacionAltoFuncion = isPermisoPaginacionAltoFuncion;
	}
	
	public Boolean getIsPermisoCopiarFuncion() {
		return isPermisoCopiarFuncion;
	}

	public void setIsPermisoCopiarFuncion(Boolean isPermisoCopiarFuncion) {
		this.isPermisoCopiarFuncion = isPermisoCopiarFuncion;
	}
	
	public Boolean getIsPermisoVerFormFuncion() {
		return isPermisoVerFormFuncion;
	}

	public void setIsPermisoVerFormFuncion(Boolean isPermisoVerFormFuncion) {
		this.isPermisoVerFormFuncion = isPermisoVerFormFuncion;
	}
	
	public Boolean getIsPermisoDuplicarFuncion() {
		return isPermisoDuplicarFuncion;
	}

	public void setIsPermisoDuplicarFuncion(Boolean isPermisoDuplicarFuncion) {
		this.isPermisoDuplicarFuncion = isPermisoDuplicarFuncion;
	}
	
	public Boolean getIsPermisoOrdenFuncion() {
		return isPermisoOrdenFuncion;
	}

	public void setIsPermisoOrdenFuncion(Boolean isPermisoOrdenFuncion) {
		this.isPermisoOrdenFuncion = isPermisoOrdenFuncion;
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
	
	public Boolean getIsVisibilidadCeldaNuevoFuncion() {
		return isVisibilidadCeldaNuevoFuncion;
	}

	public void setIsVisibilidadCeldaNuevoFuncion(Boolean isVisibilidadCeldaNuevoFuncion) {
		this.isVisibilidadCeldaNuevoFuncion = isVisibilidadCeldaNuevoFuncion;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarFuncion() {
		return isVisibilidadCeldaDuplicarFuncion;
	}

	public void setIsVisibilidadCeldaDuplicarFuncion(Boolean isVisibilidadCeldaDuplicarFuncion) {
		this.isVisibilidadCeldaDuplicarFuncion = isVisibilidadCeldaDuplicarFuncion;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarFuncion() {
		return isVisibilidadCeldaCopiarFuncion;
	}

	public void setIsVisibilidadCeldaCopiarFuncion(Boolean isVisibilidadCeldaCopiarFuncion) {
		this.isVisibilidadCeldaCopiarFuncion = isVisibilidadCeldaCopiarFuncion;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormFuncion() {
		return isVisibilidadCeldaVerFormFuncion;
	}

	public void setIsVisibilidadCeldaVerFormFuncion(Boolean isVisibilidadCeldaVerFormFuncion) {
		this.isVisibilidadCeldaVerFormFuncion = isVisibilidadCeldaVerFormFuncion;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenFuncion() {
		return isVisibilidadCeldaOrdenFuncion;
	}

	public void setIsVisibilidadCeldaOrdenFuncion(Boolean isVisibilidadCeldaOrdenFuncion) {
		this.isVisibilidadCeldaOrdenFuncion = isVisibilidadCeldaOrdenFuncion;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesFuncion() {
		return isVisibilidadCeldaNuevoRelacionesFuncion;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesFuncion(Boolean isVisibilidadCeldaNuevoRelacionesFuncion) {
		this.isVisibilidadCeldaNuevoRelacionesFuncion = isVisibilidadCeldaNuevoRelacionesFuncion;
	}
	
	public Boolean getIsVisibilidadCeldaModificarFuncion() {
		return isVisibilidadCeldaModificarFuncion;
	}

	public void setIsVisibilidadCeldaModificarFuncion(Boolean isVisibilidadCeldaModificarFuncion) {
		this.isVisibilidadCeldaModificarFuncion = isVisibilidadCeldaModificarFuncion;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarFuncion() {
		return isVisibilidadCeldaActualizarFuncion;
	}

	public void setIsVisibilidadCeldaActualizarFuncion(Boolean isVisibilidadCeldaActualizarFuncion) {
		this.isVisibilidadCeldaActualizarFuncion = isVisibilidadCeldaActualizarFuncion;
	}

	public Boolean getIsVisibilidadCeldaEliminarFuncion() {
		return isVisibilidadCeldaEliminarFuncion;
	}

	public void setIsVisibilidadCeldaEliminarFuncion(Boolean isVisibilidadCeldaEliminarFuncion) {
		this.isVisibilidadCeldaEliminarFuncion = isVisibilidadCeldaEliminarFuncion;
	}

	public Boolean getIsVisibilidadCeldaCancelarFuncion() {
		return isVisibilidadCeldaCancelarFuncion;
	}

	public void setIsVisibilidadCeldaCancelarFuncion(Boolean isVisibilidadCeldaCancelarFuncion) {
		this.isVisibilidadCeldaCancelarFuncion = isVisibilidadCeldaCancelarFuncion;
	}

	public Boolean getIsVisibilidadCeldaGuardarFuncion() {
		return isVisibilidadCeldaGuardarFuncion;
	}

	public void setIsVisibilidadCeldaGuardarFuncion(Boolean isVisibilidadCeldaGuardarFuncion) {
		this.isVisibilidadCeldaGuardarFuncion = isVisibilidadCeldaGuardarFuncion;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosFuncion() {
		return isVisibilidadCeldaGuardarCambiosFuncion;
	}

	public void setIsVisibilidadCeldaGuardarCambiosFuncion(Boolean isVisibilidadCeldaGuardarCambiosFuncion) {
		this.isVisibilidadCeldaGuardarCambiosFuncion = isVisibilidadCeldaGuardarCambiosFuncion;
	}
		
	public FuncionSessionBean getfuncionSessionBean() {
		return this.funcionSessionBean;
	}
	
	public void setfuncionSessionBean(FuncionSessionBean funcionSessionBean) {
		this.funcionSessionBean=funcionSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysFuncion(Funcion funcion)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(funcion,null);
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
	
	public void bugActualizarReferenciaActual(Funcion funcion,Funcion funcionAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalFuncion(funcion);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		funcionAux.setId(funcion.getId());
		funcionAux.setVersionRow(funcion.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessFuncion();
		
			int intSelectedRow = this.jTableDatosFuncion.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.funcion =(Funcion) this.funcionLogic.getFuncions().toArray()[this.jTableDatosFuncion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.funcion =(Funcion) this.funcions.toArray()[this.jTableDatosFuncion.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(FuncionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualFuncion(this.funcion,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysFuncion(this.funcion);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = funcionValidator.getInvalidValues(this.funcion);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			funcionLogic.setDatosCliente(datosCliente);
			funcionLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				funcionAux=new  Funcion();
				
				funcionAux.setIsNew(true);
				funcionAux.setIsChanged(true);
				
				funcionAux.setFuncionOriginal(this.funcion);
				
				funcionAux.setId(this.funcion.getId());	
				funcionAux.setVersionRow(this.funcion.getVersionRow());	
				funcionAux.setid_empresa(this.funcion.getid_empresa());	
				funcionAux.setnombre(this.funcion.getnombre());	
				funcionAux.setdescripcion(this.funcion.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.funcionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.funcionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(funcionAux,funcionLogic.getFuncions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(funcionAux,funcions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.funcionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.funcionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						funcionLogic.saveFuncions();//WithConnection
						//funcionLogic.getSetVersionRowFuncions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.funcion,funcionAux);
					
					this.refrescarForeignKeysDescripcionesFuncion();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.funcionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFrame.funcionestrucLogic.getFuncionEstrucs().addAll(this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFrame.funcionestrucsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFrame.funcionestrucs.addAll(this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFrame.funcionestrucsEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.funcionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								funcionLogic.saveFuncionRelaciones(funcionAux,this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFrame.funcionestrucLogic.getFuncionEstrucs());//WithConnection
								//funcionLogic.getSetVersionRowFuncions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.funcion,funcionAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFrame.funcionestrucLogic.setFuncionEstrucs(new ArrayList<FuncionEstruc>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFrame.funcionestrucs= new ArrayList<FuncionEstruc>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFrame.quitarFilaTotales();}
							funcionAux.setFuncionEstrucs(this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFrame.funcionestrucLogic.getFuncionEstrucs());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.funcionSessionBean.getEstaModoGuardarRelaciones() 
									|| this.funcionSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(funcionAux,funcionLogic.getFuncions());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(funcionAux,funcions);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.funcion,funcionAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				funcionAux=new  Funcion();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.funcionSessionBean.getEsGuardarRelacionado() 
					|| (this.funcionSessionBean.getEsGuardarRelacionado() && this.funcion.getId()>=0)) {
						
					funcionAux.setIsNew(false);
				}
				
				funcionAux.setIsDeleted(false);
			
				funcionAux.setId(this.funcion.getId());	
				funcionAux.setVersionRow(this.funcion.getVersionRow());	
				funcionAux.setid_empresa(this.funcion.getid_empresa());	
				funcionAux.setnombre(this.funcion.getnombre());	
				funcionAux.setdescripcion(this.funcion.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(funcionAux,funcionLogic.getFuncions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(funcionAux,funcions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.funcionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.funcionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						funcionLogic.saveFuncions();//WithConnection
						//funcionLogic.getSetVersionRowFuncions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.funcion,funcionAux);
					
					this.refrescarForeignKeysDescripcionesFuncion();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.funcionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFrame.funcionestrucLogic.getFuncionEstrucs().addAll(this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFrame.funcionestrucsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFrame.funcionestrucs.addAll(this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFrame.funcionestrucsEliminados);
						}
						//ARCHITECTURE
						
						if(!this.funcionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								funcionLogic.saveFuncionRelaciones(funcionAux,this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFrame.funcionestrucLogic.getFuncionEstrucs());//WithConnection
								//funcionLogic.getSetVersionRowFuncions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.funcion,funcionAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFrame.funcionestrucLogic.setFuncionEstrucs(new ArrayList<FuncionEstruc>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFrame.funcionestrucs= new ArrayList<FuncionEstruc>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFrame.quitarFilaTotales();}
							funcionAux.setFuncionEstrucs(this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFrame.funcionestrucLogic.getFuncionEstrucs());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.funcionSessionBean.getEstaModoGuardarRelaciones() 
									|| this.funcionSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(funcionAux,funcionLogic.getFuncions());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(funcionAux,funcions);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.funcion,funcionAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				funcionAux=new  Funcion();
				
				funcionAux.setIsNew(false);
				funcionAux.setIsChanged(false);
				
				funcionAux.setIsDeleted(true);
				
				funcionAux.setId(this.funcion.getId());	
				funcionAux.setVersionRow(this.funcion.getVersionRow());	
				funcionAux.setid_empresa(this.funcion.getid_empresa());	
				funcionAux.setnombre(this.funcion.getnombre());	
				funcionAux.setdescripcion(this.funcion.getdescripcion());	
				
				if(this.funcionSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.funcionAux.getId()>=0) {	
						this.funcionsEliminados.add(funcionAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(funcionAux,funcionLogic.getFuncions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(funcionAux,funcions);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.funcionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.funcionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						funcionLogic.saveFuncions();//WithConnection
						//funcionLogic.getSetVersionRowFuncions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.funcionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFrame.funcionestrucLogic.getFuncionEstrucs().addAll(this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFrame.funcionestrucsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFrame.funcionestrucs.addAll(this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFrame.funcionestrucsEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.funcionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								funcionLogic.saveFuncionRelaciones(funcionAux,this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFrame.funcionestrucLogic.getFuncionEstrucs());//WithConnection
								//funcionLogic.getSetVersionRowFuncions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFrame.funcionestrucLogic.setFuncionEstrucs(new ArrayList<FuncionEstruc>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFrame.funcionestrucs= new ArrayList<FuncionEstruc>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFrame.quitarFilaTotales();}
							funcionAux.setFuncionEstrucs(this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFrame.funcionestrucLogic.getFuncionEstrucs());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.funcionSessionBean.getEstaModoGuardarRelaciones() 
								|| this.funcionSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(funcionAux,funcionLogic.getFuncions());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(funcionAux,funcions);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.funcionLogic.getFuncions().addAll(this.funcionsEliminados);
					
					funcionLogic.saveFuncions();//WithConnection
					//funcionLogic.getSetVersionRowFuncions();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesFuncion();
				
				this.funcionsEliminados= new ArrayList<Funcion>();		
			}
			
			if(this.funcionSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.funcionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Funcion GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Funcion",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.funcion=funcionAux;
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
      		//this.finishProcessFuncion();
      	}
		
	}	
	
	public void actualizarRelaciones(Funcion funcionLocal) throws Exception {
		
		if(this.funcionSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				funcionLocal.setFuncionEstrucs(this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFrame.funcionestrucLogic.getFuncionEstrucs());
			
			} else {
			
				funcionLocal.setFuncionEstrucs(this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFrame.funcionestrucs);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Funcion funcionLocal) throws Exception {	
		if(this.funcionSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				funcionLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarFuncionActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosFuncion.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.funcion =(Funcion) this.funcionLogic.getFuncions().toArray()[this.jTableDatosFuncion.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.funcion =(Funcion) this.funcions.toArray()[this.jTableDatosFuncion.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = funcionValidator.getInvalidValues(this.funcion);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Funcion funcion,List<Funcion> funcions) throws Exception {
		try	{		
			FuncionConstantesFunciones.actualizarLista(funcion,funcions,this.funcionSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Funcion funcion,List<Funcion> funcions) throws Exception {
		try	{			
			FuncionConstantesFunciones.actualizarSelectedLista(funcion,funcions);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Funcion> funcionsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				funcionsLocal=this.funcionLogic.getFuncions();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				funcionsLocal=this.funcions;
			}
			//ARCHITECTURE
		
			for(Funcion funcionLocal:funcionsLocal) {
				if(this.permiteMantenimiento(funcionLocal) && funcionLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+FuncionConstantesFunciones.getFuncionLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(FuncionConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFuncion.jLabelid_empresaFuncion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FuncionConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFuncion.jLabelnombreFuncion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FuncionConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFuncion.jLabeldescripcionFuncion,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormFuncion!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFuncion.jLabelid_empresaFuncion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFuncion.jLabelnombreFuncion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFuncion.jLabeldescripcionFuncion,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("FuncionEstruc")) {
			if(this.funcion==null) {
				this.funcion= new Funcion();
			}

			if(this.funcionSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoFuncion
				this.setVariablesFormularioToObjetoActualFuncion(this.funcion,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysFuncion(this.funcion);

				this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFrame.getfuncionestruc().setFuncion(this.funcion);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoFuncion--;	
		
		
		this.funcionAux=new Funcion();
		
		this.funcionAux.setId(this.iIdNuevoFuncion);
		this.funcionAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.funcionLogic.getFuncions().add(this.funcionAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.funcions.add(this.funcionAux);
		}
		//ARCHITECTURE
		
		this.funcion=this.funcionAux;
		
		if(FuncionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioFuncion(this.funcion);
			this.setVariablesObjetoActualToFormularioForeignKeyFuncion(this.funcion);
		}
				
		//this.setDefaultControlesFuncion();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyFuncion();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyFuncion();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyFuncion();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualFuncion(this.funcionBean,this.funcion,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysFuncion(this.funcion);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(FuncionConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.funcionSessionBean.getConGuardarRelaciones()) {
			classes=FuncionConstantesFunciones.getClassesRelationshipsOfFuncion(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.funcionReturnGeneral=funcionLogic.procesarEventosFuncionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.funcionLogic.getFuncions(),this.funcion,this.funcionParameterGeneral,this.isEsNuevoFuncion,classes);//this.funcionLogic.getFuncion()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanFuncion(this.funcionReturnGeneral,this.funcionBean,false);
		
		if(this.funcionReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyFuncion(this.funcionReturnGeneral.getFuncion());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioFuncion(this.funcionReturnGeneral.getFuncion());
		}
		
		if(this.funcionReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioFuncion(this.funcionReturnGeneral.getFuncion(),classes);//this.funcionBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualFuncion(this.funcion,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyFuncion();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyFuncion();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			FuncionBeanSwingJInternalFrameAdditional.RecargarFormFuncion(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingFuncion(false);
						
			if(funcionSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFrame.funcionestrucSessionBean.getEsGuardarRelacionado() && FuncionEstrucJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonFuncionEstrucActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(FuncionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualFuncion();
			}
			
			this.actualizarVisualTableDatosFuncion();
			
			this.jTableDatosFuncion.setRowSelectionInterval(this.getIndiceNuevoFuncion(), this.getIndiceNuevoFuncion());
			
			this.seleccionarFilaTablaFuncionActual();
						
			this.actualizarEstadoCeldasBotonesFuncion("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesFuncion(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormFuncion.jTextAreanombreFuncion.setEnabled(isHabilitar && this.funcionConstantesFunciones.activarnombreFuncion);
		this.jInternalFrameDetalleFormFuncion.jTextAreadescripcionFuncion.setEnabled(isHabilitar && this.funcionConstantesFunciones.activardescripcionFuncion);	
		//
		this.jInternalFrameDetalleFormFuncion.jComboBoxid_empresaFuncion.setEnabled(isHabilitar && this.funcionConstantesFunciones.activarid_empresaFuncion);
	};
	
	public void setDefaultControlesFuncion() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoFuncion(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.funcionSessionBean.setConGuardarRelaciones(true);			
			this.funcionSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormFuncion.jTabbedPaneRelacionesFuncion.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFrame.funcionestrucSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.funcionSessionBean.setConGuardarRelaciones(false);			
			this.funcionSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormFuncion.jTabbedPaneRelacionesFuncion.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFrame.funcionestrucSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoFuncion() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Funcion funcionAux:this.funcionLogic.getFuncions()) {
				if(funcionAux.getId().equals(this.iIdNuevoFuncion)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Funcion funcionAux:this.funcions) {
				if(funcionAux.getId().equals(this.iIdNuevoFuncion)) {
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
	
	public int getIndiceActualFuncion(Funcion funcion,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Funcion funcionAux:this.funcionLogic.getFuncions()) {
				if(funcionAux.getId().equals(funcion.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Funcion funcionAux:this.funcions) {
				if(funcionAux.getId().equals(funcion.getId())) {
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
	
	public void setCamposBaseDesdeOriginalFuncion(Funcion funcionOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Funcion funcionAux:this.funcionLogic.getFuncions()) {
				if(funcionAux.getFuncionOriginal().getId().equals(funcionOriginal.getId())) {
					existe=true;
					funcionOriginal.setId(funcionAux.getId());
					funcionOriginal.setVersionRow(funcionAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Funcion funcionAux:this.funcions) {
				if(funcionAux.getFuncionOriginal().getId().equals(funcionOriginal.getId())) {
					existe=true;
					funcionOriginal.setId(funcionAux.getId());
					funcionOriginal.setVersionRow(funcionAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosFuncion(Boolean esParaCancelar) throws Exception {
		funcionsAux=new ArrayList<Funcion>();
		funcionAux=new Funcion();
		
		if(!this.funcionSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Funcion funcionAux:this.funcionLogic.getFuncions()) {
					if(funcionAux.getId()<0) {
						funcionsAux.add(funcionAux);
					}		
				}
				this.iIdNuevoFuncion=0L;
				this.funcionLogic.getFuncions().removeAll(funcionsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Funcion funcionAux:this.funcions) {
					if(funcionAux.getId()<0) {
						funcionsAux.add(funcionAux);
					}		
				}
				this.iIdNuevoFuncion=0L;
				this.funcions.removeAll(funcionsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoFuncion 
					&& this.funcionLogic.getFuncions().size()>0
					) {
					funcionAux=this.funcionLogic.getFuncions().get(this.funcionLogic.getFuncions().size() - 1);
				
					if(funcionAux.getId()<0) {
						this.funcionLogic.getFuncions().remove(funcionAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoFuncion && this.funcions.size()>0) {
					funcionAux=this.funcions.get(this.funcions.size() - 1);
				
					if(funcionAux.getId()<0) {
						this.funcions.remove(funcionAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoFuncion(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(funcion.getId()<0) {
				this.funcionLogic.getFuncions().remove(this.funcion);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(funcion.getId()<0) {
				this.funcions.remove(this.funcion);
			}
		}			
	}
	
	public void setEstadosInicialesFuncion(List<Funcion> funcionsAux) throws Exception {
		FuncionConstantesFunciones.setEstadosInicialesFuncion(funcionsAux);
	}
	
	public void setEstadosInicialesFuncion(Funcion funcionAux) throws Exception {
		FuncionConstantesFunciones.setEstadosInicialesFuncion(funcionAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarFuncionActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesFuncion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarFuncionActual()) {
				if(!this.isEsNuevoFuncion) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesFuncion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoFuncion=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarFuncionActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Funcion ?", "MANTENIMIENTO DE Funcion", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesFuncion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Funcion funcion) throws Exception {
		FuncionConstantesFunciones.seleccionarAsignar(this.funcion,funcion);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarFuncion=this.isPermisoActualizarOriginalFuncion;
			
			
			this.seleccionarAsignar(funcion);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			FuncionConstantesFunciones.quitarEspaciosFuncion(this.funcion,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesFuncion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.funcionSessionBean.setsFuncionBusquedaRapida(this.funcionSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoFuncion) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosFuncion(esParaCancelar);				
				this.cancelarNuevoFuncion(esParaCancelar);								
			}
			
			this.funcion=new Funcion();
			
			this.inicializarFuncion();
			
			this.actualizarEstadoCeldasBotonesFuncion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarFuncion() throws Exception {
		try {
			FuncionConstantesFunciones.inicializarFuncion(this.funcion);
			
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
			FuncionesSwing.manageException(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.funcionLogic.getFuncions().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteFuncions(String sAccionBusqueda,List<Funcion> funcionsParaReportes) throws Exception {
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
					sPathReporteFinal="Funcion"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="FuncionMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("FuncionMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Funcion"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Funciones");		
		parameters.put("busquedapor", FuncionConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(FuncionEstruc.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					FuncionLogic funcionLogicAuxiliar=new FuncionLogic();
					funcionLogicAuxiliar.setDatosCliente(funcionLogic.getDatosCliente());				
					funcionLogicAuxiliar.setFuncions(funcionsParaReportes);
					
					funcionLogicAuxiliar.cargarRelacionesLoteForeignKeyFuncionWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					funcionsParaReportes=funcionLogicAuxiliar.getFuncions();
					
					//funcionLogic.getNewConnexionToDeep();
					
					//for (Funcion funcion:funcionsParaReportes) {
					//	funcionLogic.deepLoad(funcion, false, DeepLoadType.INCLUDE, classes);
					//}						
					//funcionLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//funcionLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileFuncionEstruc = AuxiliarReportes.class.getResourceAsStream("FuncionEstrucDetalleRelacionesDesign.jasper");
			parameters.put("subreport_funcionestruc", reportFileFuncionEstruc);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceFuncion=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			FuncionConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			FuncionConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceFuncion=new JRBeanArrayDataSource(FuncionJInternalFrame.TraerFuncionBeans(funcionsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceFuncion);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+FuncionConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+FuncionConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(FuncionBean.TraerFuncionBeans(funcionsParaReportes).toArray()));
							
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
				this.generarExcelReporteFuncions(sAccionBusqueda,sTipoArchivoReporte,funcionsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalFuncions(sAccionBusqueda,sTipoArchivoReporte,funcionsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoFuncionActionPerformed(null);
					//this.generarExcelReporteFuncions(sAccionBusqueda,sTipoArchivoReporte,funcionsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalFuncions(sAccionBusqueda,sTipoArchivoReporte,funcionsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesFuncions(sAccionBusqueda,sTipoArchivoReporte,funcionsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesFuncions(sAccionBusqueda,sTipoArchivoReporte,funcionsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteFuncions(String sAccionBusqueda,String sTipoArchivoReporte,List<Funcion> funcionsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"funcion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Funcions");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderFuncion("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Funcion funcion : funcionsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			FuncionConstantesFunciones.generarExcelReporteDataFuncion("NORMAL",row,workbook,funcion,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.funcionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Funcion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderFuncion(String sTipo,Row row,Workbook workbook) {
		
		FuncionConstantesFunciones.generarExcelReporteHeaderFuncion(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalFuncions(String sAccionBusqueda,String sTipoArchivoReporte,List<Funcion> funcionsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"funcion_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Funcions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Funcion funcion : funcionsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(FuncionConstantesFunciones.getFuncionDescripcion(funcion));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FuncionConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FuncionConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(funcion.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FuncionConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FuncionConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(funcion.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FuncionConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FuncionConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(funcion.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.funcionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Funcion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesFuncions(String sAccionBusqueda,String sTipoArchivoReporte,List<Funcion> funcionsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Funcion> funcionsRespaldo=null;
		
		classes=FuncionConstantesFunciones.getClassesRelationshipsOfFuncion(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.funcionLogic.setDatosCliente(this.datosCliente);
		this.funcionLogic.setDatosDeep(this.datosDeep);
		this.funcionLogic.setIsConDeep(true);
		
		funcionsRespaldo=this.funcionLogic.getFuncions();
		
		this.funcionLogic.setFuncions(funcionsParaReportes);	
		this.funcionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		funcionsParaReportes=this.funcionLogic.getFuncions();
		this.funcionLogic.setFuncions(funcionsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"funcion_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Funcions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderFuncion("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Funcion funcion : funcionsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderFuncion("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			FuncionConstantesFunciones.generarExcelReporteDataFuncion("NORMAL",row,workbook,funcion,cellStyleDataAux);
		
			
			


				//FuncionEstruc
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(FuncionEstrucConstantesFunciones.SCLASSWEBTITULO))) {

				if(funcion.getFuncionEstrucs()!=null && funcion.getFuncionEstrucs().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(FuncionEstrucConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					FuncionEstrucConstantesFunciones.generarExcelReporteHeaderFuncionEstruc("RELACIONADO",row,workbook);
				}

				if(funcion.getFuncionEstrucs()!=null) {
					i2=0;
					for(FuncionEstruc funcionestruc : funcion.getFuncionEstrucs()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						FuncionEstrucConstantesFunciones.generarExcelReporteDataFuncionEstruc("RELACIONADO",row,workbook,funcionestruc,cellStyleDataAuxHijo);
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
		cell.setCellValue(FuncionConstantesFunciones.getFuncionDescripcion(funcion));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.funcionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Funcion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoFuncion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFuncion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoFuncion.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFuncion.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessFuncion() throws Exception {		
		this.startProcessFuncion(true);
	}
	
	public void startProcessFuncion(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasFuncion ,this.jPanelParametrosReportesFuncion, this.jScrollPanelDatosFuncion,this.jPanelPaginacionFuncion, this.jScrollPanelDatosEdicionFuncion, this.jPanelAccionesFuncion,this.jPanelAccionesFormularioFuncion,this.jmenuBarFuncion,this.jmenuBarDetalleFuncion,this.jTtoolBarFuncion,this.jTtoolBarDetalleFuncion);		
		
		final JTabbedPane jTabbedPaneBusquedasFuncion=this.jTabbedPaneBusquedasFuncion; 
		
		final JPanel jPanelParametrosReportesFuncion=this.jPanelParametrosReportesFuncion;
		//final JScrollPane jScrollPanelDatosFuncion=this.jScrollPanelDatosFuncion;
		final JTable jTableDatosFuncion=this.jTableDatosFuncion;		
		final JPanel jPanelPaginacionFuncion=this.jPanelPaginacionFuncion;
		//final JScrollPane jScrollPanelDatosEdicionFuncion=this.jScrollPanelDatosEdicionFuncion;
		final JPanel jPanelAccionesFuncion=this.jPanelAccionesFuncion;
		
		JPanel jPanelCamposAuxiliarFuncion=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarFuncion=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormFuncion!=null) {
			jPanelCamposAuxiliarFuncion=this.jInternalFrameDetalleFormFuncion.jPanelCamposFuncion;
			jPanelAccionesFormularioAuxiliarFuncion=this.jInternalFrameDetalleFormFuncion.jPanelAccionesFormularioFuncion;
		}
		
		final JPanel jPanelCamposFuncion=jPanelCamposAuxiliarFuncion;
		final JPanel jPanelAccionesFormularioFuncion=jPanelAccionesFormularioAuxiliarFuncion;
		
		
		final JMenuBar jmenuBarFuncion=this.jmenuBarFuncion;
		final JToolBar jTtoolBarFuncion=this.jTtoolBarFuncion;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarFuncion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarFuncion=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormFuncion!=null) {
			jmenuBarDetalleAuxiliarFuncion=this.jInternalFrameDetalleFormFuncion.jmenuBarDetalleFuncion;
			jTtoolBarDetalleAuxiliarFuncion=this.jInternalFrameDetalleFormFuncion.jTtoolBarDetalleFuncion;
		}
		
		final JMenuBar jmenuBarDetalleFuncion=jmenuBarDetalleAuxiliarFuncion;
		final JToolBar jTtoolBarDetalleFuncion=jTtoolBarDetalleAuxiliarFuncion;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasFuncion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesFuncion;
			processRunnable.jTableDatos=jTableDatosFuncion;
			processRunnable.jPanelCampos=jPanelCamposFuncion;
			processRunnable.jPanelPaginacion=jPanelPaginacionFuncion;
			processRunnable.jPanelAcciones=jPanelAccionesFuncion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioFuncion;
			
			
			processRunnable.jmenuBar=jmenuBarFuncion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleFuncion;
			processRunnable.jTtoolBar=jTtoolBarFuncion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleFuncion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasFuncion ,jPanelParametrosReportesFuncion,jTableDatosFuncion, /*jScrollPanelDatosFuncion,*/jPanelCamposFuncion,jPanelPaginacionFuncion, /*jScrollPanelDatosEdicionFuncion,*/ jPanelAccionesFuncion,jPanelAccionesFormularioFuncion,jmenuBarFuncion,jmenuBarDetalleFuncion,jTtoolBarFuncion,jTtoolBarDetalleFuncion);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasFuncion ,jPanelParametrosReportesFuncion, jScrollPanelDatosFuncion,jPanelPaginacionFuncion, jScrollPanelDatosEdicionFuncion, jPanelAccionesFuncion,jPanelAccionesFormularioFuncion,jmenuBarFuncion,jmenuBarDetalleFuncion,jTtoolBarFuncion,jTtoolBarDetalleFuncion);
						
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
	
	public void finishProcessFuncion() {// throws Exception 
		this.finishProcessFuncion(true);
	}
	
	public void finishProcessFuncion(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasFuncion ,this.jPanelParametrosReportesFuncion, this.jScrollPanelDatosFuncion,this.jPanelPaginacionFuncion, this.jScrollPanelDatosEdicionFuncion, this.jPanelAccionesFuncion,this.jPanelAccionesFormularioFuncion,this.jmenuBarFuncion,this.jmenuBarDetalleFuncion,this.jTtoolBarFuncion,this.jTtoolBarDetalleFuncion);		
		
		final JTabbedPane jTabbedPaneBusquedasFuncion=this.jTabbedPaneBusquedasFuncion; 
		
		final JPanel jPanelParametrosReportesFuncion=this.jPanelParametrosReportesFuncion;
		//final JScrollPane jScrollPanelDatosFuncion=this.jScrollPanelDatosFuncion;
		final JTable jTableDatosFuncion=this.jTableDatosFuncion;		
		final JPanel jPanelPaginacionFuncion=this.jPanelPaginacionFuncion;
		//final JScrollPane jScrollPanelDatosEdicionFuncion=this.jScrollPanelDatosEdicionFuncion;
		final JPanel jPanelAccionesFuncion=this.jPanelAccionesFuncion;
		
		JPanel jPanelCamposAuxiliarFuncion=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarFuncion=new JPanel();
		
		if(this.jInternalFrameDetalleFormFuncion!=null) {
			jPanelCamposAuxiliarFuncion=this.jInternalFrameDetalleFormFuncion.jPanelCamposFuncion;
			jPanelAccionesFormularioAuxiliarFuncion=this.jInternalFrameDetalleFormFuncion.jPanelAccionesFormularioFuncion;
		}
		
		final JPanel jPanelCamposFuncion=jPanelCamposAuxiliarFuncion;
		final JPanel jPanelAccionesFormularioFuncion=jPanelAccionesFormularioAuxiliarFuncion;
		
		
		final JMenuBar jmenuBarFuncion=this.jmenuBarFuncion;		
		final JToolBar jTtoolBarFuncion=this.jTtoolBarFuncion;
				
		JMenuBar jmenuBarDetalleAuxiliarFuncion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarFuncion=new JToolBar();
		
		if(this.jInternalFrameDetalleFormFuncion!=null) {
			jmenuBarDetalleAuxiliarFuncion=this.jInternalFrameDetalleFormFuncion.jmenuBarDetalleFuncion;
			jTtoolBarDetalleAuxiliarFuncion=this.jInternalFrameDetalleFormFuncion.jTtoolBarDetalleFuncion;		
		}
		
		final JMenuBar jmenuBarDetalleFuncion=jmenuBarDetalleAuxiliarFuncion;
		final JToolBar jTtoolBarDetalleFuncion=jTtoolBarDetalleAuxiliarFuncion;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasFuncion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesFuncion;
			processRunnable.jTableDatos=jTableDatosFuncion;
			processRunnable.jPanelCampos=jPanelCamposFuncion;
			processRunnable.jPanelPaginacion=jPanelPaginacionFuncion;
			processRunnable.jPanelAcciones=jPanelAccionesFuncion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioFuncion;
			
			
			processRunnable.jmenuBar=jmenuBarFuncion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleFuncion;
			processRunnable.jTtoolBar=jTtoolBarFuncion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleFuncion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasFuncion ,jPanelParametrosReportesFuncion, jTableDatosFuncion,/*jScrollPanelDatosFuncion,*/jPanelCamposFuncion,jPanelPaginacionFuncion, /*jScrollPanelDatosEdicionFuncion,*/ jPanelAccionesFuncion,jPanelAccionesFormularioFuncion,jmenuBarFuncion,jmenuBarDetalleFuncion,jTtoolBarFuncion,jTtoolBarDetalleFuncion));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesFuncion(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarFuncion(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuFuncion(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarFuncion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarFuncion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleFuncion,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuFuncion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarFuncion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleFuncion,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.funcionConstantesFunciones.getsFinalQueryFuncion();
		String  finalQueryPaginacionTodos=this.funcionConstantesFunciones.getsFinalQueryFuncion();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=FuncionConstantesFunciones.getArrayColumnasGlobalesNoFuncion(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=FuncionConstantesFunciones.getArrayColumnasGlobalesFuncion(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,FuncionConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.funcionsEliminados= new ArrayList<Funcion>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessFuncion();
		
				///*FuncionSessionBean*/this.funcionSessionBean=new FuncionSessionBean();
			
			if(this.funcionSessionBean==null) {
				this.funcionSessionBean=new FuncionSessionBean();
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
					this.iNumeroPaginacion=FuncionConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=FuncionConstantesFunciones.getClassesForeignKeysOfFuncion(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/funcion."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			funcionsAux= new ArrayList<Funcion>();
			
				
			funcionLogic.setDatosCliente(this.datosCliente);
			funcionLogic.setDatosDeep(this.datosDeep);
			funcionLogic.setIsConDeep(true);
			
			
			funcionLogic.getFuncionDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					funcionLogic.getTodosFuncions(finalQueryGlobal,pagination);
					
					//funcionLogic.getTodosFuncionsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(funcionLogic.getFuncions()==null|| funcionLogic.getFuncions().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							funcionsAux= new ArrayList<Funcion>();
							funcionsAux.addAll(funcionLogic.getFuncions());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							funcionsAux= new ArrayList<Funcion>();
							funcionsAux.addAll(funcions);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							funcionLogic.getTodosFuncions(finalQueryGlobal+"",this.pagination);												
							
							//funcionLogic.getTodosFuncionsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteFuncions("Todos",funcionLogic.getFuncions() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							funcionLogic.setFuncions(new ArrayList<Funcion>());					
							funcionLogic.getFuncions().addAll(funcionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							funcions=new ArrayList<Funcion>();
							funcions.addAll(funcionsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idFuncion=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idFuncion=this.idActual;
				
				} else if(this.idFuncionActual!=null && this.idFuncionActual!=0L) {
					idFuncion=idFuncionActual;
				}
				
					
				this.sDetalleReporte=FuncionConstantesFunciones.getDetalleIndicePorId(idFuncion);
				
				this.funcions=new ArrayList<Funcion>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					funcionLogic.getEntity(idFuncion);
					
					//funcionLogic.getEntityWithConnection(idFuncion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					funcionLogic.setFuncions(new ArrayList<Funcion>());
					funcionLogic.getFuncions().add(funcionLogic.getFuncion());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.funcions=new ArrayList<Funcion>();
					this.funcions.add(funcion);
				}
				
				if(funcionLogic.getFuncion()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=FuncionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					funcionLogic.getFuncionsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FuncionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FuncionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=funcionLogic.getFuncions()==null||funcionLogic.getFuncions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=funcions==null|| funcions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						funcionsAux=new ArrayList<Funcion>();
						funcionsAux.addAll(funcionLogic.getFuncions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							funcionsAux=new ArrayList<Funcion>();
							funcionsAux.addAll(funcions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							funcionLogic.getFuncionsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FuncionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FuncionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteFuncions("FK_IdEmpresa",funcionLogic.getFuncions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteFuncions("FK_IdEmpresa",funcions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						funcionLogic.setFuncions(new ArrayList<Funcion>());
						funcionLogic.getFuncions().addAll(funcionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							funcions=new ArrayList<Funcion>();
							funcions.addAll(funcionsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesFuncion();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessFuncion();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=funcionLogic.getFuncions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=funcions.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=funcionLogic.getFuncions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=funcions.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Funcion funcion) {
		Boolean permite=true;
		
		if(this.funcion.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=FuncionConstantesFunciones.getOrderByListaFuncion();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=FuncionConstantesFunciones.getOrderByListaFuncion();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Funcion funcion:funcionLogic.getFuncions()) {
				if(funcion.getsType().equals(Constantes2.S_TOTALES)) {
					funcionTotales=funcion;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Funcion funcion:this.funcions) {
				if(funcion.getsType().equals(Constantes2.S_TOTALES)) {
					funcionTotales=funcion;
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
			this.funcionAux=new Funcion();
			this.funcionAux.setsType(Constantes2.S_TOTALES);
			this.funcionAux.setIsNew(false);
			this.funcionAux.setIsChanged(false);
			this.funcionAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				FuncionConstantesFunciones.TotalizarValoresFilaFuncion(this.funcionLogic.getFuncions(),this.funcionAux);
				
				this.funcionLogic.getFuncions().add(this.funcionAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				FuncionConstantesFunciones.TotalizarValoresFilaFuncion(this.funcions,this.funcionAux);
				
				this.funcions.add(this.funcionAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		funcionTotales=new Funcion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.funcionLogic.getFuncions().remove(funcionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.funcions.remove(funcionTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		funcionTotales=new Funcion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Funcion funcion:funcionLogic.getFuncions()) {
				if(funcion.getsType().equals(Constantes2.S_TOTALES)) {
					funcionTotales=funcion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				FuncionConstantesFunciones.TotalizarValoresFilaFuncion(this.funcionLogic.getFuncions(),funcionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Funcion funcion:this.funcions) {
				if(funcion.getsType().equals(Constantes2.S_TOTALES)) {
					funcionTotales=funcion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				FuncionConstantesFunciones.TotalizarValoresFilaFuncion(this.funcions,funcionTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getFuncionsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getFuncionsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					funcionLogic.getFuncionsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosFuncion() {
		this.isPermisoTodoFuncion=false;
		this.isPermisoNuevoFuncion=false;
		this.isPermisoActualizarFuncion=false;
		this.isPermisoActualizarOriginalFuncion=false;
		this.isPermisoEliminarFuncion=false;
		this.isPermisoGuardarCambiosFuncion=false;
		this.isPermisoConsultaFuncion=false;
		this.isPermisoBusquedaFuncion=false;
		this.isPermisoReporteFuncion=false;		
		this.isPermisoOrdenFuncion=false;		
		this.isPermisoPaginacionMedioFuncion=false;		
		this.isPermisoPaginacionAltoFuncion=false;
		this.isPermisoPaginacionTodoFuncion=false;
		this.isPermisoCopiarFuncion=false;		
		this.isPermisoVerFormFuncion=false;		
		this.isPermisoDuplicarFuncion=false;		
		this.isPermisoOrdenFuncion=false;		
	}
	
	public void setPermisosUsuarioFuncion(Boolean isPermiso) {
		this.isPermisoTodoFuncion=isPermiso;
		this.isPermisoNuevoFuncion=isPermiso;
		this.isPermisoActualizarFuncion=isPermiso;
		this.isPermisoActualizarOriginalFuncion=isPermiso;
		this.isPermisoEliminarFuncion=isPermiso;
		this.isPermisoGuardarCambiosFuncion=isPermiso;
		this.isPermisoConsultaFuncion=isPermiso;
		this.isPermisoBusquedaFuncion=isPermiso;
		this.isPermisoReporteFuncion=isPermiso;
		this.isPermisoOrdenFuncion=isPermiso;		
		this.isPermisoPaginacionMedioFuncion=isPermiso;		
		this.isPermisoPaginacionAltoFuncion=isPermiso;		
		this.isPermisoPaginacionTodoFuncion=isPermiso;		
		this.isPermisoCopiarFuncion=isPermiso;		
		this.isPermisoVerFormFuncion=isPermiso;		
		this.isPermisoDuplicarFuncion=isPermiso;
		this.isPermisoOrdenFuncion=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioFuncion(Boolean isPermiso) {
		//this.isPermisoTodoFuncion=isPermiso;
		this.isPermisoNuevoFuncion=isPermiso;
		this.isPermisoActualizarFuncion=isPermiso;
		this.isPermisoActualizarOriginalFuncion=isPermiso;
		this.isPermisoEliminarFuncion=isPermiso;
		this.isPermisoGuardarCambiosFuncion=isPermiso;
		//this.isPermisoConsultaFuncion=isPermiso;
		//this.isPermisoBusquedaFuncion=isPermiso;
		//this.isPermisoReporteFuncion=isPermiso;
		//this.isPermisoOrdenFuncion=isPermiso;		
		//this.isPermisoPaginacionMedioFuncion=isPermiso;		
		//this.isPermisoPaginacionAltoFuncion=isPermiso;		
		//this.isPermisoPaginacionTodoFuncion=isPermiso;		
		//this.isPermisoCopiarFuncion=isPermiso;		
		//this.isPermisoDuplicarFuncion=isPermiso;
		//this.isPermisoOrdenFuncion=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioFuncionClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(FuncionEstrucConstantesFunciones.SNOMBREOPCION);
		
		if(FuncionJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosFuncionEstruc=false;
		this.isTienePermisosFuncionEstruc=this.verificarGetPermisosUsuarioOpcionFuncionClaseRelacionada(this.opcionsRelacionadas,FuncionEstrucConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebFuncion(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioFuncionClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosFuncionEstruc=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioFuncionClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionFuncionClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioFuncionClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosFuncionEstruc && this.jInternalFrameDetalleFormFuncion!=null && this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormFuncion.jTabbedPaneRelacionesFuncion.remove(this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioFuncion() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(FuncionJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.funcionSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, FuncionConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoFuncion=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarFuncion=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalFuncion=this.isPermisoActualizarFuncion;
			this.isPermisoEliminarFuncion=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosFuncion=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaFuncion=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaFuncion=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoFuncion=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteFuncion=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenFuncion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioFuncion=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoFuncion=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoFuncion=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarFuncion=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormFuncion=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarFuncion=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenFuncion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.funcionSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosFuncion.setToolTipText(this.jTableDatosFuncion.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioFuncion(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioFuncion(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(FuncionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(FuncionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioFuncion() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosFuncionEstruc && this.funcionConstantesFunciones.mostrarFuncionEstrucFuncion && !FuncionConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Funcion Estruc");
			reporte.setsDescripcion("Funcion Estruc");
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
	public void inicializarCombosForeignKeyFuncionListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyFuncionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(FuncionJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyFuncionListas(false);
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
	
	public void cargarCombosLoteForeignKeyFuncionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			FuncionParameterReturnGeneral funcionReturnGeneral=new FuncionParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.funcionConstantesFunciones.cargarid_empresaFuncion)
					 || (this.esRecargarFks && this.funcionConstantesFunciones.cargarid_empresaFuncion)) {

					if(!this.funcionSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+funcionSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				funcionReturnGeneral=funcionLogic.cargarCombosLoteForeignKeyFuncion(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=funcionReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyFuncion()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.funcionSessionBean==null) {
				this.funcionSessionBean=new FuncionSessionBean();
			}

			if(!this.funcionSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyFuncion()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyFuncion(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyFuncion()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyFuncion();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyFuncion(Funcion funcion)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyFuncion(Funcion funcion,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyFuncion()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyFuncion()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyFuncion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyFuncion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroFuncion()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyFuncion()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyFuncion(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyFuncion()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormFuncion.jComboBoxid_empresaFuncion!=null && this.jInternalFrameDetalleFormFuncion.jComboBoxid_empresaFuncion.getItemCount()>0) {
				this.jInternalFrameDetalleFormFuncion.jComboBoxid_empresaFuncion.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public FuncionBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public FuncionBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public FuncionBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.funcionSessionBean=new FuncionSessionBean(); 
		this.funcionConstantesFunciones=new FuncionConstantesFunciones(); 
		this.funcionBean=new Funcion();//(this.funcionConstantesFunciones); 		
		this.funcionReturnGeneral=new FuncionParameterReturnGeneral(); 
		
		this.funcionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.funcionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public FuncionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public FuncionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public FuncionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessFuncion(true);
			
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
			
			this.funcionConstantesFunciones=new FuncionConstantesFunciones(); 
			this.funcionBean=new Funcion();//this.funcionConstantesFunciones); 			
			this.funcionReturnGeneral=new FuncionParameterReturnGeneral(); 
		
			FuncionBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Funcion Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.funcion=new Funcion();
			this.funcions = new ArrayList<Funcion>();
			this.funcionsAux = new ArrayList<Funcion>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionLogic=new FuncionLogic();
				this.funcionLogic.getNewConnexionToDeep("");
			}
			
			//this.funcionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.funcionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormFuncion);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoFuncion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoFuncion);	
					}
					
					if(this.jInternalFrameImportacionFuncion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionFuncion);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByFuncion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByFuncion);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormFuncion!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormFuncion);
				this.jInternalFrameDetalleFormFuncion.setVisible(false);
				this.jInternalFrameDetalleFormFuncion.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoFuncion!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoFuncion);
					this.jInternalFrameReporteDinamicoFuncion.setVisible(false);
					this.jInternalFrameReporteDinamicoFuncion.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionFuncion!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionFuncion);
					this.jInternalFrameImportacionFuncion.setVisible(false);
					this.jInternalFrameImportacionFuncion.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByFuncion!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByFuncion);
					this.jInternalFrameOrderByFuncion.setVisible(false);
					this.jInternalFrameOrderByFuncion.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idFuncionActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=FuncionConstantesFunciones.INUMEROPAGINACION;
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
			
			this.funcionReturnGeneral=new FuncionParameterReturnGeneral();
			
			this.funcionParameterGeneral=new FuncionParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.funcionLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.funcionSessionBean.getEsGuardarRelacionado()) {
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
			
			if(FuncionJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.funcionSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(FuncionEstrucConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,FuncionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.funcionSessionBean.getEsGuardarRelacionado(),this.funcionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,FuncionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.funcionSessionBean.getEsGuardarRelacionado(),this.funcionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoFuncion=false;
			this.isVisibilidadCeldaDuplicarFuncion=true;
			this.isVisibilidadCeldaCopiarFuncion=true;
			this.isVisibilidadCeldaVerFormFuncion=true;
			this.isVisibilidadCeldaOrdenFuncion=true;
			this.isVisibilidadCeldaNuevoRelacionesFuncion=false;
			this.isVisibilidadCeldaModificarFuncion=false;
			this.isVisibilidadCeldaActualizarFuncion=false;
			this.isVisibilidadCeldaEliminarFuncion=false;
			this.isVisibilidadCeldaCancelarFuncion=false;
			this.isVisibilidadCeldaGuardarFuncion=false;
			this.isVisibilidadCeldaGuardarCambiosFuncion=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesFuncion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosFuncion();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioFuncion(false);
			
			this.setPermisosUsuarioFuncion();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.funcionSessionBean.getEsGuardarRelacionado() 
				|| (this.funcionSessionBean.getEsGuardarRelacionado() && this.funcionSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioFuncionClasesRelacionadas();
			}
			
			if(this.funcionSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioFuncionClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!FuncionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosFuncion();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualFuncion();
			}
			
			if(!this.isPermisoBusquedaFuncion) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasFuncion.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.funcionSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioFuncion,this.isPermisoPaginacionMedioFuncion,this.isPermisoPaginacionTodoFuncion);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(FuncionConstantesFunciones.getTiposSeleccionarFuncion());
				
				this.tiposColumnasSelect=FuncionConstantesFunciones.getTiposSeleccionarFuncion(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectFuncion();				
				//this.tiposRelacionesSelect=FuncionConstantesFunciones.getTiposRelacionesFuncion(true);
				
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
			//if(!this.funcionSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioFuncion();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioFuncion(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioFuncion(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesFuncion() ;
			
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
			
			
			this.funcionestrucLogic=new FuncionEstrucLogic(); 
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
				funcionImplementable= (FuncionImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+FuncionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				funcionImplementableHome= (FuncionImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+FuncionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.funcions= new ArrayList<Funcion>();
			this.funcionsEliminados= new ArrayList<Funcion>();
						
			this.isEsNuevoFuncion=false;
			this.esParaAccionDesdeFormularioFuncion=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyFuncion(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroFuncion();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.funcionSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			FuncionBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=FuncionConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesFuncion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingFuncion(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormFuncion!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioFuncion();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioFuncion();
			}
			
			FuncionBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasFuncion.getTabCount(); i++) {
					this.jTabbedPaneBusquedasFuncion.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasFuncion.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessFuncion(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Funcion: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectFuncion() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(FuncionEstrucConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(FuncionEstrucConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesFuncion")) {
				iIndex=this.jInternalFrameDetalleFormFuncion.jTabbedPaneRelacionesFuncion.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormFuncion.jTabbedPaneRelacionesFuncion.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosFuncion.getSelectedRow();	
				
				

				if(sTitle.equals("Funcion Estruces")) {
					if(!FuncionEstrucJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessFuncion();

						this.cargarParteTabPanelRelacionadaFuncionEstruc(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessFuncion();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaFuncionEstruc(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormFuncion.cargarSessionConBeanSwingJInternalFrameFuncionEstruc(false,true,iIndex);
		this.jButtonFuncionEstrucActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaFuncionEstruc();

		//this.jTabbedPaneRelacionesFuncion.updateUI();
		//this.jTabbedPaneRelacionesFuncion.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesFuncion.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("FuncionEstruc")) {
				int row=this.jTableDatosFuncion.getSelectedRow();
				jButtonFuncionEstrucActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.funcionSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Funcion Estruc")) {

					if(this.isTienePermisosFuncionEstruc && this.funcionConstantesFunciones.mostrarFuncionEstrucFuncion && !FuncionConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Funcion Estruces"+"("+FuncionEstrucConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Funcion Estruces");

						if(funcionConstantesFunciones.resaltarFuncionEstrucFuncion!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(funcionConstantesFunciones.resaltarFuncionEstrucFuncion);
						}

						jmenuItem.setEnabled(this.funcionConstantesFunciones.activarFuncionEstrucFuncion);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"FuncionEstruc"));

						

						this.jInternalFrameDetalleFormFuncion.jmenuDetalleFuncion.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyFuncion(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyFuncion(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyFuncion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyFuncionListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyFuncion();
		
		this.cargarCombosFrameForeignKeyFuncion();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyFuncion();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyFuncion();
		}
	}
	
	
	
	public void jButtonNuevoFuncionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.funcionSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormFuncion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			FuncionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.funcion,new Object(),this.funcionParameterGeneral,this.funcionReturnGeneral);
			
			
			if(jTableDatosFuncion.getRowCount()>=1) {
				jTableDatosFuncion.removeRowSelectionInterval(0, jTableDatosFuncion.getRowCount()-1);						
			}
			
			this.isEsNuevoFuncion=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoFuncion(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesFuncion(true);			
			//this.funcion=new Funcion();
			//this.funcion.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesFuncion(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFuncion() ;
			
			if(FuncionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleFuncion(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.funcion);	
			this.actualizarInformacion("INFO_PADRE",false,this.funcion);				
			
			FuncionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.funcion,new Object(),this.funcionParameterGeneral,this.funcionReturnGeneral);
			
			if(this.funcionSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Funcion: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			FuncionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.funcion,new Object(),this.funcionParameterGeneral,this.funcionReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarFuncionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Funcion> funcionsSeleccionados=new ArrayList<Funcion>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosFuncion.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosFuncion.getSelectedRows().length;			
			}
			
			funcionsSeleccionados=this.getFuncionsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoFuncion--;			
				//Funcion funcionAux= new Funcion();			
				//funcionAux.setId(this.iIdNuevoFuncion);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Funcion funcionOrigen=new Funcion();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Funcion funcionOrigen : funcionsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosFuncion.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							funcionOrigen =(Funcion) this.funcionLogic.getFuncions().toArray()[this.jTableDatosFuncion.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							funcionOrigen =(Funcion) this.funcions.toArray()[this.jTableDatosFuncion.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaFuncion();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.funcion.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosFuncion(funcionOrigen,this.funcion,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysFuncion(this.funcion);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.funcionLogic.getFuncions().add(this.funcionAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.funcions.add(this.funcionAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaFuncion(false);
				
				this.jTableDatosFuncion.setRowSelectionInterval(this.getIndiceNuevoFuncion(), this.getIndiceNuevoFuncion());
				
				int iLastRow =  this.jTableDatosFuncion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosFuncion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosFuncion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaFuncion(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarFuncionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Funcion> funcionsSeleccionados=new ArrayList<Funcion>();									
		
			Funcion funcionOrigen=new Funcion();
			Funcion funcionDestino=new Funcion();
				
			funcionsSeleccionados=this.getFuncionsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosFuncion.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || funcionsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosFuncion.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						funcionOrigen =(Funcion) this.funcionLogic.getFuncions().toArray()[this.jTableDatosFuncion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						funcionOrigen =(Funcion) this.funcions.toArray()[this.jTableDatosFuncion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						funcionDestino =(Funcion) this.funcionLogic.getFuncions().toArray()[this.jTableDatosFuncion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						funcionDestino =(Funcion) this.funcions.toArray()[this.jTableDatosFuncion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				funcionOrigen =funcionsSeleccionados.get(0);
				funcionDestino =funcionsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosFuncion(funcionOrigen,funcionDestino,true,false);
				
				funcionDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(funcionDestino,funcionLogic.getFuncions());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(funcionDestino,funcions);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaFuncion(false);
				
				//this.jTableDatosFuncion.setRowSelectionInterval(this.getIndiceNuevoFuncion(), this.getIndiceNuevoFuncion());
				
				int iLastRow =  this.jTableDatosFuncion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosFuncion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosFuncion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaFuncion(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormFuncionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormFuncion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormFuncion.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarFuncionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesFuncion.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasFuncion.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesFuncion.setVisible(!isVisible);
			this.jPanelPaginacionFuncion.setVisible(!isVisible);
			this.jPanelAccionesFuncion.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarFuncionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameFuncion();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoFuncionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoFuncion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionFuncionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionFuncion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByFuncionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByFuncion();
			
			this.abrirFrameOrderByFuncion();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByFuncionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByFuncion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleFuncion(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormFuncion);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormFuncion.isMaximum()) {
					this.jInternalFrameDetalleFormFuncion.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormFuncion.setSize(this.jInternalFrameDetalleFormFuncion.iWidthFormulario,this.jInternalFrameDetalleFormFuncion.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormFuncion.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormFuncion.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormFuncion.isMaximum()) {
						this.jInternalFrameDetalleFormFuncion.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormFuncion.jContentPaneDetalleFuncion.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormFuncion.jTabbedPaneRelacionesFuncion.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormFuncion.jContentPaneDetalleFuncion.getWidth(),FuncionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormFuncion.jTabbedPaneRelacionesFuncion.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormFuncion.jContentPaneDetalleFuncion.getWidth(),FuncionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormFuncion.jTabbedPaneRelacionesFuncion.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormFuncion.jContentPaneDetalleFuncion.getWidth(),FuncionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(FuncionEstrucJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaFuncionEstruc();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormFuncion.setVisible(true);
	        this.jInternalFrameDetalleFormFuncion.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByFuncion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByFuncion==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByFuncion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFuncion,false,this);
				} else {
					this.jInternalFrameOrderByFuncion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFuncion,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByFuncion);
				this.jInternalFrameOrderByFuncion.setVisible(false);
				this.jInternalFrameOrderByFuncion.setSelected(false);
				
				this.jInternalFrameOrderByFuncion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByFuncion"));
				
				this.inicializarActualizarBindingTablaOrderByFuncion();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionFuncion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionFuncion==null) {
				
				this.jInternalFrameImportacionFuncion=new ImportacionJInternalFrame(FuncionConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionFuncion);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionFuncion);
				this.jInternalFrameImportacionFuncion.setVisible(false);
				this.jInternalFrameImportacionFuncion.setSelected(false);


				this.jInternalFrameImportacionFuncion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionFuncion"));
				this.jInternalFrameImportacionFuncion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionFuncion"));
				this.jInternalFrameImportacionFuncion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionFuncion"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoFuncion() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoFuncion==null) {
				this.jInternalFrameReporteDinamicoFuncion=new ReporteDinamicoJInternalFrame(FuncionConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoFuncion);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoFuncion);
				this.jInternalFrameReporteDinamicoFuncion.setVisible(false);
				this.jInternalFrameReporteDinamicoFuncion.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoFuncion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoFuncion"));
				this.jInternalFrameReporteDinamicoFuncion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoFuncion"));
				this.jInternalFrameReporteDinamicoFuncion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoFuncion"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualFuncion();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaFuncionEstruc() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFrame.jScrollPanelDatosFuncionEstruc.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormFuncion.jContentPaneDetalleFuncion.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFrame.jScrollPanelDatosFuncionEstruc.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFrame.jScrollPanelDatosFuncionEstruc.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFrame.jScrollPanelDatosFuncionEstruc.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleFuncion() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormFuncion);
			
	       	this.jInternalFrameDetalleFormFuncion.setVisible(false);
	        this.jInternalFrameDetalleFormFuncion.setSelected(false);
			
			//this.jInternalFrameDetalleFormFuncion.dispose();
			//this.jInternalFrameDetalleFormFuncion=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoFuncion() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoFuncion.setVisible(true);
	        this.jInternalFrameReporteDinamicoFuncion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionFuncion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionFuncion.setVisible(true);
	        this.jInternalFrameImportacionFuncion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByFuncion() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByFuncion.setVisible(true);
	        this.jInternalFrameOrderByFuncion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByFuncion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByFuncion.setVisible(false);
	        this.jInternalFrameOrderByFuncion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoFuncion() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoFuncion.setVisible(false);
	        this.jInternalFrameReporteDinamicoFuncion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionFuncion() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionFuncion.setVisible(false);
	        this.jInternalFrameImportacionFuncion.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarFuncionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarFuncion(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarFuncion(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosFuncion.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesFuncion(true);
			//this.isEsNuevoFuncion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcion =(Funcion) this.funcionLogic.getFuncions().toArray()[this.jTableDatosFuncion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.funcion =(Funcion) this.funcions.toArray()[this.jTableDatosFuncion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesFuncion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesFuncion(false) ;
			
			if(funcionSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFrame.funcionestrucSessionBean.getEsGuardarRelacionado() && FuncionEstrucJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonFuncionEstrucActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(FuncionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleFuncion(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFuncion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaFuncionActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosFuncion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.funcion =(Funcion) this.funcionLogic.getFuncions().toArray()[this.jTableDatosFuncion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.funcion =(Funcion) this.funcions.toArray()[this.jTableDatosFuncion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarFuncion(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormFuncion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosFuncion.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesFuncion(true);
			//this.isEsNuevoFuncion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcion =(Funcion) this.funcionLogic.getFuncions().toArray()[this.jTableDatosFuncion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.funcion =(Funcion) this.funcions.toArray()[this.jTableDatosFuncion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.funcion.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesFuncion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesFuncion(false) ;
			
			if(FuncionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleFuncion(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFuncion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarFuncionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesFuncion(false);
			
			//if(!this.isEsNuevoFuncion) {								
				int intSelectedRow = this.jTableDatosFuncion.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.funcion =(Funcion) this.funcionLogic.getFuncions().toArray()[this.jTableDatosFuncion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.funcion =(Funcion) this.funcions.toArray()[this.jTableDatosFuncion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(FuncionJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualFuncion(this.funcion,true);
				this.setVariablesFormularioToObjetoActualForeignKeysFuncion(this.funcion);
				
			}
			
			if(this.permiteMantenimiento(this.funcion)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.funcionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoFuncion=true;
					this.inicializarActualizarBindingTablaFuncion(false);
					this.isEsNuevoFuncion=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoFuncion=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoFuncion=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesFuncion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualFuncion(false);
				
				this.habilitarDeshabilitarControlesFuncion(false);
			
												
				
				if(FuncionJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleFuncion();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoFuncionActionPerformed(evt,funcionSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualFuncion(this.funcion,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosFuncion.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,funcionSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.funcion.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Funcion.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Funcion.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarFuncionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosFuncion.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcion =(Funcion) this.funcionLogic.getFuncions().toArray()[this.jTableDatosFuncion.convertRowIndexToModel(intSelectedRow)];
				this.funcion.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.funcion =(Funcion) this.funcions.toArray()[this.jTableDatosFuncion.convertRowIndexToModel(intSelectedRow)];
				this.funcion.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.funcion)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.funcionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((FuncionModel) this.jTableDatosFuncion.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoFuncion=true;
				this.inicializarActualizarBindingTablaFuncion(false);
				this.isEsNuevoFuncion=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesFuncion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualFuncion(false);
				
				this.habilitarDeshabilitarControlesFuncion(false);
				
				
				
				if(FuncionJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleFuncion();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarFuncionActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosFuncion.getRowCount()>=1) {
				jTableDatosFuncion.removeRowSelectionInterval(0, jTableDatosFuncion.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesFuncion(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaFuncion(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesFuncion(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFuncion(false) ;
			
			this.isEsNuevoFuncion=false;
			
			if(FuncionJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleFuncion();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosFuncionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingFuncion(false);
				
				//SI ES MANUAL
				if(FuncionJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualFuncion();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosFuncionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoFuncion--;			
			//Funcion funcionAux= new Funcion();			
			//funcionAux.setId(this.iIdNuevoFuncion);
			
			if(this.jInternalFrameDetalleFormFuncion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaFuncion();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysFuncion(this.funcion);
			
			this.funcion.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.funcionLogic.getFuncions().add(this.funcionAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.funcions.add(this.funcionAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaFuncion(false);
			
			this.jTableDatosFuncion.setRowSelectionInterval(this.getIndiceNuevoFuncion(), this.getIndiceNuevoFuncion());
			
			int iLastRow =  this.jTableDatosFuncion.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosFuncion.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosFuncion.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaFuncion(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionFuncionActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingFuncion(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFuncion(false);
			
			//SI ES MANUAL
			if(FuncionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualFuncion();
			}
			
			//this.abrirFrameTreeFuncion();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionFuncionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE FuncionES ?", "MANTENIMIENTO DE Funcion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionFuncion.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralFuncion();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.funcionReturnGeneral=funcionLogic.procesarImportacionFuncionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.funcionParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarFuncionReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionFuncionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionFuncion.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionFuncion.setFileImportacion(this.jInternalFrameImportacionFuncion.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionFuncion.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionFuncion.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionFuncion.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionFuncion.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoFuncionActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Funcion> funcionsSeleccionados=new ArrayList<Funcion>();		

		funcionsSeleccionados=this.getFuncionsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFuncion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFuncion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("FuncionBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"FuncionBaseDesign.jrxml";
			
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
			
			this.generarReporteFuncions("Todos",funcionsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.funcionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Funcion",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoFuncion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFuncion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case FuncionConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FuncionConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FuncionConstantesFunciones.LABEL_DESCRIPCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scripcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scripcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scripcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scripcion_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoFuncion.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoFuncion.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoFuncion.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case FuncionConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case FuncionConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case FuncionConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoFuncion.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case FuncionConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case FuncionConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case FuncionConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoFuncion.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFuncion.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case FuncionConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case FuncionConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case FuncionConstantesFunciones.LABEL_DESCRIPCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descripcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descripcion");
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
	
	public void jButtonGenerarExcelReporteDinamicoFuncionActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Funcion> funcionsSeleccionados=new ArrayList<Funcion>();		
		
		funcionsSeleccionados=this.getFuncionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"funcion";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Funcions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoFuncion.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoFuncion.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case FuncionConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FuncionConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(Funcion funcion:funcionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(funcion.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FuncionConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FuncionConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(Funcion funcion:funcionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(funcion.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FuncionConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FuncionConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(Funcion funcion:funcionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(funcion.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelFuncion(row);				
			//	iRow++;
			//}				
			
			//for(Funcion funcionAux:funcionsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelFuncion(funcionAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.funcionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Funcion",JOptionPane.INFORMATION_MESSAGE);
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
				this.funcionLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFuncion(false);
			
			//SI ES MANUAL
			if(FuncionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualFuncion();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresFuncionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFuncion(false);
			
			//SI ES MANUAL
			if(FuncionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualFuncion();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesFuncionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFuncion(false);
			
			//SI ES MANUAL
			if(FuncionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualFuncion();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaFuncion() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosFuncion.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosFuncion.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosFuncion.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosFuncion.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosFuncion.setMinimumSize(dimensionMinimum);
		this.jTableDatosFuncion.setMaximumSize(dimensionMaximum);
		this.jTableDatosFuncion.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingFuncion(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingFuncion(esInicializar,true);
	}
	
	public void inicializarActualizarBindingFuncion(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaFuncion(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesFuncion(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.funcionSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasFuncion(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesFuncion(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesFuncion(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !FuncionJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!FuncionJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualFuncion() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaFuncion();
		
		this.inicializarActualizarBindingBotonesManualFuncion(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.funcionSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualFuncion();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesFuncion() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualFuncion(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualFuncion(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosFuncion.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosFuncion.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteFuncion.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormFuncion!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormFuncion.jCheckBoxPostAccionNuevoFuncion.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormFuncion.jCheckBoxPostAccionSinCerrarFuncion.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormFuncion.jCheckBoxPostAccionSinMensajeFuncion.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosFuncion.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosFuncion.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteFuncion.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormFuncion!=null) {
				this.jInternalFrameDetalleFormFuncion.jCheckBoxPostAccionNuevoFuncion.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormFuncion.jCheckBoxPostAccionSinCerrarFuncion.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormFuncion.jCheckBoxPostAccionSinMensajeFuncion.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionFuncion.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionFuncion.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormFuncion!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormFuncion.jComboBoxTiposAccionesFormularioFuncion.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesFuncion.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoFuncion!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFuncion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesFuncion.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesFuncion.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarFuncion.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesFuncion.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoFuncion!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFuncion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesFuncion.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralFuncion.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesFuncion(Boolean esInicializar) throws Exception {
		try	{	
			if(FuncionJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualFuncion(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesFuncion() throws Exception {
		try	{
			if(FuncionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFuncion();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleFuncion() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormFuncion.jComboBoxTiposAccionesFormularioFuncion.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormFuncion.jComboBoxTiposAccionesFormularioFuncion.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFuncion() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesFuncion.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesFuncion.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesFuncion.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesFuncion.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesFuncion.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesFuncion.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionFuncion.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionFuncion.addItem(reporte);
			}
			
			
			if(!this.funcionSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionFuncion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionFuncion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesFuncion.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesFuncion.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesFuncion.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesFuncion.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormFuncion!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormFuncion.jComboBoxTiposAccionesFormularioFuncion.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormFuncion.jComboBoxTiposAccionesFormularioFuncion.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarFuncion.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarFuncion.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarFuncion.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualFuncion();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualFuncion() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoFuncion!=null) {
				this.jInternalFrameReporteDinamicoFuncion.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoFuncion.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoFuncion!=null) {
				this.jInternalFrameReporteDinamicoFuncion.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoFuncion.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoFuncion!=null) {
				
				if(this.jInternalFrameReporteDinamicoFuncion.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoFuncion.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoFuncion.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoFuncion.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoFuncion.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoFuncion.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualFuncion()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasFuncion(Boolean esInicializar) throws Exception {				
		if(FuncionJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualFuncion();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaFuncion() throws Exception {
		this.inicializarActualizarBindingTablaFuncion(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByFuncion() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByFuncion.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByFuncion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByFuncion.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new FuncionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByFuncion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByFuncion.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new FuncionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosFuncionOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFuncionOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new FuncionPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByFuncion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByFuncion.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new FuncionPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByFuncion.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaFuncion(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=funcionLogic.getFuncions().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=funcions.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(FuncionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosFuncion.setModel(new FuncionModel(this.funcionLogic.getFuncions(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosFuncion.setModel(new FuncionModel(this.funcions,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByFuncion!=null && this.jInternalFrameOrderByFuncion.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByFuncion();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosFuncion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFuncion,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new FuncionPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+FuncionConstantesFunciones.SCLASSWEBTITULO,funcionConstantesFunciones.resaltarSeleccionarFuncion,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+FuncionConstantesFunciones.SCLASSWEBTITULO,funcionConstantesFunciones.resaltarSeleccionarFuncion,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosFuncion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFuncion,FuncionConstantesFunciones.LABEL_ID));

		if(this.funcionConstantesFunciones.mostraridFuncion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FuncionConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.funcionConstantesFunciones.resaltaridFuncion,this.funcionConstantesFunciones.activaridFuncion,this,true,"idFuncion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.funcionConstantesFunciones.resaltaridFuncion,this.funcionConstantesFunciones.activaridFuncion,this,true,"idFuncion","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFuncion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFuncion,FuncionConstantesFunciones.LABEL_IDEMPRESA));

		if(this.funcionConstantesFunciones.mostrarid_empresaFuncion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FuncionConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.funcionConstantesFunciones.resaltarid_empresaFuncion,this,this.funcionConstantesFunciones.activarid_empresaFuncion));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.funcionConstantesFunciones.resaltarid_empresaFuncion,this,this.funcionConstantesFunciones.activarid_empresaFuncion,false,"id_empresaFuncion","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FuncionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFuncion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFuncion,FuncionConstantesFunciones.LABEL_NOMBRE));

		if(this.funcionConstantesFunciones.mostrarnombreFuncion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FuncionConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.funcionConstantesFunciones.resaltarnombreFuncion,this.funcionConstantesFunciones.activarnombreFuncion,this,true,"nombreFuncion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.funcionConstantesFunciones.resaltarnombreFuncion,this.funcionConstantesFunciones.activarnombreFuncion,this,true,"nombreFuncion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FuncionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFuncion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFuncion,FuncionConstantesFunciones.LABEL_DESCRIPCION));

		if(this.funcionConstantesFunciones.mostrardescripcionFuncion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FuncionConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.funcionConstantesFunciones.resaltardescripcionFuncion,this.funcionConstantesFunciones.activardescripcionFuncion,this,true,"descripcionFuncion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.funcionConstantesFunciones.resaltardescripcionFuncion,this.funcionConstantesFunciones.activardescripcionFuncion,this,true,"descripcionFuncion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FuncionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.funcionSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosFuncionEstruc && this.funcionConstantesFunciones.mostrarFuncionEstrucFuncion && !FuncionConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Funcion Estruces");
				tableColumn.setHeaderValue("Funcion Estruces");
				tableColumn.setCellRenderer(new FuncionEstrucTableCell(funcionConstantesFunciones.resaltarFuncionEstrucFuncion,this,this.funcionConstantesFunciones.activarFuncionEstrucFuncion));
				tableColumn.setCellEditor(new FuncionEstrucTableCell(funcionConstantesFunciones.resaltarFuncionEstrucFuncion,this,this.funcionConstantesFunciones.activarFuncionEstrucFuncion));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosFuncion.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.funcionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.funcionSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosFuncion.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.funcionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.funcionSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosFuncion.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarFuncion && this.isPermisoGuardarCambiosFuncion) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.funcionSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.funcionSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosFuncion.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.funcionSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosFuncion.addColumn(tableColumn);
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
			
			this.jTableDatosFuncion.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarFuncion && this.isPermisoGuardarCambiosFuncion) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.funcionSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarFuncion && this.isPermisoGuardarCambiosFuncion) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosFuncion.moveColumn(this.jTableDatosFuncion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosFuncion.moveColumn(this.jTableDatosFuncion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.funcionSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosFuncion.moveColumn(this.jTableDatosFuncion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosFuncion.moveColumn(this.jTableDatosFuncion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosFuncion.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosFuncion.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosFuncion,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!FuncionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosFuncion.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosFuncion.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!FuncionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!FuncionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosFuncion.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosFuncion.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosFuncion.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=funcionLogic.getFuncions().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=funcions.size()-1;
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
		//this.jTableDatosFuncion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosFuncion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosFuncion();
			
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
				
				//this.isEsNuevoFuncion=false;
					
				FuncionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.funcion,new Object(),this.funcionParameterGeneral,this.funcionReturnGeneral);
			
				if(this.funcionSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormFuncion==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosFuncion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosFuncion.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.funcion =(Funcion) this.funcionLogic.getFuncions().toArray()[this.jTableDatosFuncion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.funcion =(Funcion) this.funcions.toArray()[this.jTableDatosFuncion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.funcion.getsType().equals("DUPLICADO")
				   || this.funcion.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoFuncion=true;
				
				} else {
					this.isEsNuevoFuncion=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.funcionSessionBean.getEsGuardarRelacionado()) {
					if(this.funcion.getId()>=0 && !this.funcion.getIsNew()) {						
						this.isEsNuevoFuncion=false;
						
					} else {
						this.isEsNuevoFuncion=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoFuncion(esRelaciones);						
				
				this.seleccionarFuncion(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.funcion.getId()<0) {
					this.isEsNuevoFuncion=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarFuncion(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarFuncion(evt,rowIndex);
				}	
				
				if(this.funcionSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Funcion: " + this.dDif); 
					}
				}								
				
				FuncionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.funcion,new Object(),this.funcionParameterGeneral,this.funcionReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarFuncion(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.funcion)) {
					if(this.funcion.getId()>0) {
						this.funcion.setIsDeleted(true);
						
						this.funcionsEliminados.add(this.funcion);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.funcionLogic.getFuncions().remove(this.funcion);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.funcions.remove(this.funcion);				
					}
					
					
					((FuncionModel) this.jTableDatosFuncion.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaFuncion(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarFuncion(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoFuncion) {
			
			if(this.jInternalFrameDetalleFormFuncion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosFuncion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosFuncion.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.funcion =(Funcion) this.funcionLogic.getFuncions().toArray()[this.jTableDatosFuncion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.funcion =(Funcion) this.funcions.toArray()[this.jTableDatosFuncion.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(FuncionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioFuncion(this.funcion);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.funcionConstantesFunciones.cargarid_empresaFuncion || this.funcionConstantesFunciones.event_dependid_empresaFuncion) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.funcion.getid_empresa());
									//this.inicializarActualizarBindingFuncion(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(funcion.getEmpresa()!=null) {
							this.empresasForeignKey.add(funcion.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.funcion.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesFuncion("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesFuncion(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualFuncion() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoFuncion(Funcion funcion) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoFuncion(funcion,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoFuncion(Funcion funcion,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioFuncion(funcion);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyFuncion(funcion,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyFuncion(funcion);
	}
	
	public void setVariablesObjetoActualToFormularioFuncion(Funcion funcion) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormFuncion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormFuncion.jLabelidFuncion.setText(funcion.getId().toString());
			this.jInternalFrameDetalleFormFuncion.jTextAreanombreFuncion.setText(funcion.getnombre());
			this.jInternalFrameDetalleFormFuncion.jTextAreadescripcionFuncion.setText(funcion.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Funcion funcionLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,funcionLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Funcion funcionLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				funcionLocal=this.funcion;
			} else {
				funcionLocal=this.funcionAnterior;
			}
		}
		
		if(this.permiteMantenimiento(funcionLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoFuncion(funcionLocal,true);
					
					if(funcionSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(funcionLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.funcionSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(funcionLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoFuncion(Funcion funcion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualFuncion(funcion,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysFuncion(funcion);
	}
	
	public void setVariablesFormularioToObjetoActualFuncion(Funcion funcion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualFuncion(funcion,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualFuncion(Funcion funcion,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormFuncion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormFuncion.jLabelidFuncion.getText()==null || this.jInternalFrameDetalleFormFuncion.jLabelidFuncion.getText()=="" || this.jInternalFrameDetalleFormFuncion.jLabelidFuncion.getText()=="Id") {
				this.jInternalFrameDetalleFormFuncion.jLabelidFuncion.setText("0");
			}

			if(conColumnasBase) {funcion.setId(Long.parseLong(this.jInternalFrameDetalleFormFuncion.jLabelidFuncion.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FuncionConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFuncion.jLabelIdFuncion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			funcion.setnombre(this.jInternalFrameDetalleFormFuncion.jTextAreanombreFuncion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FuncionConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFuncion.jLabelnombreFuncion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			funcion.setdescripcion(this.jInternalFrameDetalleFormFuncion.jTextAreadescripcionFuncion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FuncionConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFuncion.jLabeldescripcionFuncion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualFuncion(Funcion funcionBean,Funcion funcion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosFuncion(Funcion funcionOrigen,Funcion funcion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && funcionOrigen.getId()!=null && !funcionOrigen.getId().equals(0L))) {funcion.setId(funcionOrigen.getId());}}
			if(conDefault || (!conDefault && funcionOrigen.getnombre()!=null && !funcionOrigen.getnombre().equals(""))) {funcion.setnombre(funcionOrigen.getnombre());}
			if(conDefault || (!conDefault && funcionOrigen.getdescripcion()!=null && !funcionOrigen.getdescripcion().equals(""))) {funcion.setdescripcion(funcionOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioFuncion(Funcion funcion) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormFuncion.jLabelidFuncion.setText(funcion.getId().toString());
			this.jInternalFrameDetalleFormFuncion.jTextAreanombreFuncion.setText(funcion.getnombre());
			this.jInternalFrameDetalleFormFuncion.jTextAreadescripcionFuncion.setText(funcion.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioFuncion(FuncionBean funcionBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormFuncion.jLabelidFuncion.setText(funcionBean.getId().toString());
			this.jInternalFrameDetalleFormFuncion.jTextAreanombreFuncion.setText(funcionBean.getnombre());
			this.jInternalFrameDetalleFormFuncion.jTextAreadescripcionFuncion.setText(funcionBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanFuncion(FuncionParameterReturnGeneral funcionReturnGeneral,FuncionBean funcionBean,Boolean conDefault) throws Exception { 
		try {
			Funcion funcionLocal=new Funcion();
			
			funcionLocal=funcionReturnGeneral.getFuncion();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && funcionLocal.getId()!=null && !funcionLocal.getId().equals(0L))) {funcionBean.setId(funcionLocal.getId());}}
			if(conDefault || (!conDefault && funcionLocal.getnombre()!=null && !funcionLocal.getnombre().equals(""))) {funcionBean.setnombre(funcionLocal.getnombre());}
			if(conDefault || (!conDefault && funcionLocal.getdescripcion()!=null && !funcionLocal.getdescripcion().equals(""))) {funcionBean.setdescripcion(funcionLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxFuncionGenerico(Long idFuncionSeleccionado,JComboBox jComboBoxFuncion,List<Funcion> funcionsLocal)throws Exception {
		try {
			Funcion  funcionTemp=null;

			for(Funcion funcionAux:funcionsLocal) {
				if(funcionAux.getId()!=null && funcionAux.getId().equals(idFuncionSeleccionado)) {
					funcionTemp=funcionAux;
					break;
				}
			}

			jComboBoxFuncion.setSelectedItem(funcionTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxFuncionGenerico(JComboBox jComboBoxFuncion,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxFuncion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxFuncion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxFuncion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxFuncion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxFuncion.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxFuncion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxFuncion.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxFuncion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxFuncion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxFuncion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("FuncionEstruc")) {
			jButtonFuncionEstrucActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			funcion=(Funcion) funcionLogic.getFuncions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			funcion =(Funcion) funcions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!funcion.getIsNew() && !funcion.getIsChanged() && !funcion.getIsDeleted()) {
				sDescripcion=funcion.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=funcion.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Funcion funcionRow=new Funcion();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			funcionRow=(Funcion) funcionLogic.getFuncions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			funcionRow=(Funcion) funcions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonFuncionEstrucActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Funcion funcion) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormFuncion==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.funcionLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.funcion = (Funcion)this.funcionLogic.getFuncions().toArray()[this.jTableDatosFuncion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.funcion = (Funcion)this.funcions.toArray()[this.jTableDatosFuncion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(funcion!=null) {
						this.funcion = funcion;
					} else {
						this.funcion = new Funcion();
					}
				}

				if(this.isTienePermisosFuncionEstruc && this.permiteMantenimiento(this.funcion)) {
					FuncionEstrucBeanSwingJInternalFrame funcionestrucBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFramePopup=new FuncionEstrucBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						funcionestrucBeanSwingJInternalFrame=this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFramePopup;
					} else {
						funcionestrucBeanSwingJInternalFrame=this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFrame;
					}

					List<Funcion> funcions=new ArrayList<Funcion>();
					funcions.add(this.funcion);
					if(!esRelacionado) {
						//funcionestrucBeanSwingJInternalFrame.funcionestrucSessionBean.setConGuardarRelaciones(false);
						//funcionestrucBeanSwingJInternalFrame.funcionestrucSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					funcionestrucBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormFuncion.cargarFuncionEstrucBeanSwingJInternalFrame(funcions,this.funcion,funcionestrucBeanSwingJInternalFrame,/*conInicializar,*/funcionestrucBeanSwingJInternalFrame.funcionestrucSessionBean.getConGuardarRelaciones(),funcionestrucBeanSwingJInternalFrame.funcionestrucSessionBean.getEsGuardarRelacionado());
					funcionestrucBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						funcionestrucBeanSwingJInternalFrame.actualizarEstadoPanelsFuncionEstruc("no_relacionado");

						funcionestrucBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(FuncionEstrucConstantesFunciones.ITAMANIOFILATABLA + (FuncionEstrucConstantesFunciones.ITAMANIOFILATABLA/2));

						funcionestrucBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderFuncion=(TitledBorder)this.jScrollPanelDatosFuncion.getBorder();
						TitledBorder titledBorderFuncionEstruc=(TitledBorder)funcionestrucBeanSwingJInternalFrame.jScrollPanelDatosFuncionEstruc.getBorder();

						titledBorderFuncionEstruc.setTitle(titledBorderFuncion.getTitle() + " -> Funcion Estruc");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,funcionestrucBeanSwingJInternalFrame);
						}

						funcionestrucBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(funcionestrucBeanSwingJInternalFrame);

						funcionestrucBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.funcionSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Funcion Estruc",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.funcionLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.funcionLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.funcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualFuncion(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoFuncion.setVisible((this.isVisibilidadCeldaNuevoFuncion && this.isPermisoNuevoFuncion));			
			this.jButtonDuplicarFuncion.setVisible((this.isVisibilidadCeldaDuplicarFuncion && this.isPermisoDuplicarFuncion));			
			this.jButtonCopiarFuncion.setVisible((this.isVisibilidadCeldaCopiarFuncion && this.isPermisoCopiarFuncion));
			this.jButtonVerFormFuncion.setVisible((this.isVisibilidadCeldaVerFormFuncion && this.isPermisoVerFormFuncion));
			
			this.jButtonAbrirOrderByFuncion.setVisible((this.isVisibilidadCeldaOrdenFuncion && this.isPermisoOrdenFuncion));			
			
			this.jButtonNuevoRelacionesFuncion.setVisible((this.isVisibilidadCeldaNuevoRelacionesFuncion && this.isPermisoNuevoFuncion));			
			this.jButtonNuevoGuardarCambiosFuncion.setVisible((this.isVisibilidadCeldaNuevoFuncion && this.isPermisoNuevoFuncion && this.isPermisoGuardarCambiosFuncion));
			
			if(this.jInternalFrameDetalleFormFuncion!=null) {
			this.jInternalFrameDetalleFormFuncion.jButtonModificarFuncion.setVisible((this.isVisibilidadCeldaModificarFuncion && this.isPermisoActualizarFuncion));	
			this.jInternalFrameDetalleFormFuncion.jButtonActualizarFuncion.setVisible((this.isVisibilidadCeldaActualizarFuncion && this.isPermisoActualizarFuncion));	
			this.jInternalFrameDetalleFormFuncion.jButtonEliminarFuncion.setVisible((this.isVisibilidadCeldaEliminarFuncion && this.isPermisoEliminarFuncion));
			this.jInternalFrameDetalleFormFuncion.jButtonCancelarFuncion.setVisible(this.isVisibilidadCeldaCancelarFuncion);							
			this.jInternalFrameDetalleFormFuncion.jButtonGuardarCambiosFuncion.setVisible((this.isVisibilidadCeldaGuardarFuncion && this.isPermisoGuardarCambiosFuncion));			
			
			}
						
			this.jButtonGuardarCambiosTablaFuncion.setVisible((this.isVisibilidadCeldaGuardarCambiosFuncion && this.isPermisoGuardarCambiosFuncion));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarFuncion.setVisible((this.isVisibilidadCeldaNuevoFuncion && this.isPermisoNuevoFuncion));						
			this.jButtonDuplicarToolBarFuncion.setVisible((this.isVisibilidadCeldaDuplicarFuncion && this.isPermisoDuplicarFuncion));						
			this.jButtonCopiarToolBarFuncion.setVisible((this.isVisibilidadCeldaCopiarFuncion && this.isPermisoCopiarFuncion));			
			this.jButtonVerFormToolBarFuncion.setVisible((this.isVisibilidadCeldaVerFormFuncion && this.isPermisoVerFormFuncion));			
			this.jButtonAbrirOrderByToolBarFuncion.setVisible((this.isVisibilidadCeldaOrdenFuncion && this.isPermisoOrdenFuncion));
			this.jButtonNuevoRelacionesToolBarFuncion.setVisible((this.isVisibilidadCeldaNuevoRelacionesFuncion && this.isPermisoNuevoFuncion));			
			this.jButtonNuevoGuardarCambiosToolBarFuncion.setVisible((this.isVisibilidadCeldaNuevoFuncion && this.isPermisoNuevoFuncion && this.isPermisoGuardarCambiosFuncion));			
			
			if(this.jInternalFrameDetalleFormFuncion!=null) {
			this.jInternalFrameDetalleFormFuncion.jButtonModificarToolBarFuncion.setVisible((this.isVisibilidadCeldaModificarFuncion && this.isPermisoActualizarFuncion));	
			this.jInternalFrameDetalleFormFuncion.jButtonActualizarToolBarFuncion.setVisible((this.isVisibilidadCeldaActualizarFuncion  && this.isPermisoActualizarFuncion));	
			this.jInternalFrameDetalleFormFuncion.jButtonEliminarToolBarFuncion.setVisible((this.isVisibilidadCeldaEliminarFuncion && this.isPermisoEliminarFuncion));
			this.jInternalFrameDetalleFormFuncion.jButtonCancelarToolBarFuncion.setVisible(this.isVisibilidadCeldaCancelarFuncion);				
			this.jInternalFrameDetalleFormFuncion.jButtonGuardarCambiosToolBarFuncion.setVisible((this.isVisibilidadCeldaGuardarFuncion && this.isPermisoGuardarCambiosFuncion));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarFuncion.setVisible((this.isVisibilidadCeldaGuardarCambiosFuncion && this.isPermisoGuardarCambiosFuncion));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoFuncion.setVisible((this.isVisibilidadCeldaNuevoFuncion && this.isPermisoNuevoFuncion));			
			this.jMenuItemDuplicarFuncion.setVisible((this.isVisibilidadCeldaDuplicarFuncion && this.isPermisoDuplicarFuncion));			
			this.jMenuItemCopiarFuncion.setVisible((this.isVisibilidadCeldaCopiarFuncion && this.isPermisoCopiarFuncion));			
			this.jMenuItemVerFormFuncion.setVisible((this.isVisibilidadCeldaVerFormFuncion && this.isPermisoVerFormFuncion));			
			this.jMenuItemAbrirOrderByFuncion.setVisible((this.isVisibilidadCeldaOrdenFuncion && this.isPermisoOrdenFuncion));			
			//this.jMenuItemMostrarOcultarFuncion.setVisible((this.isVisibilidadCeldaOrdenFuncion && this.isPermisoOrdenFuncion));
			this.jMenuItemDetalleAbrirOrderByFuncion.setVisible((this.isVisibilidadCeldaOrdenFuncion && this.isPermisoOrdenFuncion));			
			//this.jMenuItemDetalleMostrarOcultarFuncion.setVisible((this.isVisibilidadCeldaOrdenFuncion && this.isPermisoOrdenFuncion));			
			this.jMenuItemNuevoRelacionesFuncion.setVisible((this.isVisibilidadCeldaNuevoRelacionesFuncion && this.isPermisoNuevoFuncion));			
			this.jMenuItemNuevoGuardarCambiosFuncion.setVisible((this.isVisibilidadCeldaNuevoFuncion && this.isPermisoNuevoFuncion && this.isPermisoGuardarCambiosFuncion));									
			
			if(this.jInternalFrameDetalleFormFuncion!=null) {
			this.jInternalFrameDetalleFormFuncion.jMenuItemModificarFuncion.setVisible((this.isVisibilidadCeldaModificarFuncion && this.isPermisoActualizarFuncion));	
			this.jInternalFrameDetalleFormFuncion.jMenuItemActualizarFuncion.setVisible((this.isVisibilidadCeldaActualizarFuncion && this.isPermisoActualizarFuncion));	
			this.jInternalFrameDetalleFormFuncion.jMenuItemEliminarFuncion.setVisible((this.isVisibilidadCeldaEliminarFuncion && this.isPermisoEliminarFuncion));
			this.jInternalFrameDetalleFormFuncion.jMenuItemCancelarFuncion.setVisible(this.isVisibilidadCeldaCancelarFuncion);				
			}
			
			this.jMenuItemGuardarCambiosFuncion.setVisible((this.isVisibilidadCeldaGuardarFuncion && this.isPermisoGuardarCambiosFuncion));						
			this.jMenuItemGuardarCambiosTablaFuncion.setVisible((this.isVisibilidadCeldaGuardarCambiosFuncion && this.isPermisoGuardarCambiosFuncion));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoFuncion=this.jButtonNuevoFuncion.isVisible();
			this.isVisibilidadCeldaDuplicarFuncion=this.jButtonDuplicarFuncion.isVisible();
			this.isVisibilidadCeldaCopiarFuncion=this.jButtonCopiarFuncion.isVisible();
			this.isVisibilidadCeldaVerFormFuncion=this.jButtonVerFormFuncion.isVisible();
			
			this.isVisibilidadCeldaOrdenFuncion=this.jButtonAbrirOrderByFuncion.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesFuncion=this.jButtonNuevoRelacionesFuncion.isVisible();
			this.isVisibilidadCeldaModificarFuncion=this.jButtonModificarFuncion.isVisible();
			
			if(this.jInternalFrameDetalleFormFuncion!=null) {
			this.isVisibilidadCeldaActualizarFuncion=this.jInternalFrameDetalleFormFuncion.jButtonActualizarFuncion.isVisible();
			this.isVisibilidadCeldaEliminarFuncion=this.jInternalFrameDetalleFormFuncion.jButtonEliminarFuncion.isVisible();
			this.isVisibilidadCeldaCancelarFuncion=this.jInternalFrameDetalleFormFuncion.jButtonCancelarFuncion.isVisible();
			this.isVisibilidadCeldaGuardarFuncion=this.jInternalFrameDetalleFormFuncion.jButtonGuardarCambiosFuncion.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosFuncion=this.jButtonGuardarCambiosTablaFuncion.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoFuncion=this.jButtonNuevoToolBarFuncion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesFuncion=this.jButtonNuevoRelacionesToolBarFuncion.isVisible();
			
			if(this.jInternalFrameDetalleFormFuncion!=null) {
			this.isVisibilidadCeldaModificarFuncion=this.jInternalFrameDetalleFormFuncion.jButtonModificarToolBarFuncion.isVisible();
			this.isVisibilidadCeldaActualizarFuncion=this.jInternalFrameDetalleFormFuncion.jButtonActualizarToolBarFuncion.isVisible();
			this.isVisibilidadCeldaEliminarFuncion=this.jInternalFrameDetalleFormFuncion.jButtonEliminarToolBarFuncion.isVisible();
			this.isVisibilidadCeldaCancelarFuncion=this.jInternalFrameDetalleFormFuncion.jButtonCancelarToolBarFuncion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarFuncion=this.jButtonGuardarCambiosToolBarFuncion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosFuncion=this.jButtonGuardarCambiosTablaToolBarFuncion.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoFuncion=this.jMenuItemNuevoFuncion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesFuncion=this.jMenuItemNuevoRelacionesFuncion.isVisible();
			
			if(this.jInternalFrameDetalleFormFuncion!=null) {
			this.isVisibilidadCeldaModificarFuncion=this.jInternalFrameDetalleFormFuncion.jMenuItemModificarFuncion.isVisible();
			this.isVisibilidadCeldaActualizarFuncion=this.jInternalFrameDetalleFormFuncion.jMenuItemActualizarFuncion.isVisible();
			this.isVisibilidadCeldaEliminarFuncion=this.jInternalFrameDetalleFormFuncion.jMenuItemEliminarFuncion.isVisible();
			this.isVisibilidadCeldaCancelarFuncion=this.jInternalFrameDetalleFormFuncion.jMenuItemCancelarFuncion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarFuncion=this.jMenuItemGuardarCambiosFuncion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosFuncion=this.jMenuItemGuardarCambiosTablaFuncion.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesFuncion(Boolean esInicializar) {
		if(FuncionJInternalFrame.ISBINDING_MANUAL) {			
			if(this.funcionSessionBean.getConGuardarRelaciones()) {
				//if(this.funcionSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesFuncion();
			}
			
			this.inicializarActualizarBindingBotonesManualFuncion(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualFuncion() {
		this.jButtonNuevoFuncion.setVisible(this.isPermisoNuevoFuncion);			
		this.jButtonDuplicarFuncion.setVisible(this.isPermisoDuplicarFuncion);			
		this.jButtonCopiarFuncion.setVisible(this.isPermisoCopiarFuncion);			
		this.jButtonVerFormFuncion.setVisible(this.isPermisoVerFormFuncion);			
		
		this.jButtonAbrirOrderByFuncion.setVisible(this.isPermisoOrdenFuncion);					
		
		this.jButtonNuevoRelacionesFuncion.setVisible(this.isPermisoNuevoFuncion);			
		
		if(this.jInternalFrameDetalleFormFuncion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFuncion.jButtonModificarFuncion.setVisible(this.isPermisoActualizarFuncion);	
			this.jInternalFrameDetalleFormFuncion.jButtonActualizarFuncion.setVisible(this.isPermisoActualizarFuncion);	
			this.jInternalFrameDetalleFormFuncion.jButtonEliminarFuncion.setVisible(this.isPermisoEliminarFuncion);
			this.jInternalFrameDetalleFormFuncion.jButtonCancelarFuncion.setVisible(this.isVisibilidadCeldaCancelarFuncion);						
			this.jInternalFrameDetalleFormFuncion.jButtonGuardarCambiosFuncion.setVisible(this.isPermisoGuardarCambiosFuncion);							
		}
		
		this.jButtonGuardarCambiosTablaFuncion.setVisible(this.isPermisoActualizarFuncion);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleFuncion() {
		this.jInternalFrameDetalleFormFuncion.jButtonModificarFuncion.setVisible(this.isPermisoActualizarFuncion);	
		this.jInternalFrameDetalleFormFuncion.jButtonActualizarFuncion.setVisible(this.isPermisoActualizarFuncion);	
		this.jInternalFrameDetalleFormFuncion.jButtonEliminarFuncion.setVisible(this.isPermisoEliminarFuncion);
		this.jInternalFrameDetalleFormFuncion.jButtonCancelarFuncion.setVisible(this.isVisibilidadCeldaCancelarFuncion);							
		this.jInternalFrameDetalleFormFuncion.jButtonGuardarCambiosFuncion.setVisible((this.isVisibilidadCeldaGuardarFuncion && this.isPermisoGuardarCambiosFuncion));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosFuncion() {
		if(FuncionJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualFuncion();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesFuncion() {
	}
	
	public void jTableDatosFuncionListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarFuncion(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidFuncionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.funcionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFuncion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFuncion(this.getfuncion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFuncion(this.funcion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.funcion =(Funcion) this.funcionLogic.getFuncions().toArray()[this.jTableDatosFuncion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.funcion =(Funcion) this.funcions.toArray()[this.jTableDatosFuncion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.funcion==null) {
						this.funcion = new Funcion();
					}

					this.setVariablesFormularioToObjetoActualFuncion(this.funcion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFuncion(this.funcion);
				}

				if(this.funcion.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.funcion.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFuncion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.funcionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.funcionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FuncionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.funcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaFuncionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebFuncion(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFuncion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosFuncion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosFuncion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.funcion =(Funcion) this.funcionLogic.getFuncions().toArray()[this.jTableDatosFuncion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.funcion =(Funcion) this.funcions.toArray()[this.jTableDatosFuncion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualFuncion(this.getfuncion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysFuncion(this.funcion);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.funcionLogic.getConnexion());

				if(this.funcion.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.funcion.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderFuncion=(TitledBorder)this.jScrollPanelDatosFuncion.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderFuncion.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FuncionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaFuncionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.funcionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFuncion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFuncion(this.getfuncion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFuncion(this.funcion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.funcion =(Funcion) this.funcionLogic.getFuncions().toArray()[this.jTableDatosFuncion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.funcion =(Funcion) this.funcions.toArray()[this.jTableDatosFuncion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.funcion==null) {
						this.funcion = new Funcion();
					}

					this.setVariablesFormularioToObjetoActualFuncion(this.funcion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFuncion(this.funcion);
				}

				if(this.funcion.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.funcion.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFuncion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.funcionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.funcionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FuncionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.funcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreFuncionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.funcionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFuncion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFuncion(this.getfuncion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFuncion(this.funcion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.funcion =(Funcion) this.funcionLogic.getFuncions().toArray()[this.jTableDatosFuncion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.funcion =(Funcion) this.funcions.toArray()[this.jTableDatosFuncion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.funcion==null) {
						this.funcion = new Funcion();
					}

					this.setVariablesFormularioToObjetoActualFuncion(this.funcion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFuncion(this.funcion);
				}

				if(this.funcion.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.funcion.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFuncion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.funcionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.funcionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FuncionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.funcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionFuncionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.funcionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFuncion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFuncion(this.getfuncion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFuncion(this.funcion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.funcion =(Funcion) this.funcionLogic.getFuncions().toArray()[this.jTableDatosFuncion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.funcion =(Funcion) this.funcions.toArray()[this.jTableDatosFuncion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.funcion==null) {
						this.funcion = new Funcion();
					}

					this.setVariablesFormularioToObjetoActualFuncion(this.funcion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFuncion(this.funcion);
				}

				if(this.funcion.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.funcion.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFuncion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.funcionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.funcionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FuncionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.funcionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaFuncionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingFuncion(false,false);

			this.getFuncionsFK_IdEmpresa();

			this.inicializarActualizarBindingFuncion(false);

			//if(FuncionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingFuncion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FuncionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.funcionLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameFuncion() {
		if(this.jInternalFrameDetalleFormFuncion!=null) {
		

		if(this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormFuncion!=null) {
			this.jInternalFrameDetalleFormFuncion.setVisible(false);	    			
			this.jInternalFrameDetalleFormFuncion.dispose();
			this.jInternalFrameDetalleFormFuncion=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoFuncion!=null) {
			this.jInternalFrameReporteDinamicoFuncion.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoFuncion.dispose();
			this.jInternalFrameReporteDinamicoFuncion=null;
		}
		
		if(this.jInternalFrameImportacionFuncion!=null) {
			this.jInternalFrameImportacionFuncion.setVisible(false);	    			
			this.jInternalFrameImportacionFuncion.dispose();
			this.jInternalFrameImportacionFuncion=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessFuncion();
			
			FuncionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.funcion,new Object(),this.funcionParameterGeneral,this.funcionReturnGeneral);
			
			
			if(sTipo.equals("NuevoFuncion")) {
				jButtonNuevoFuncionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarFuncion")) {
				jButtonDuplicarFuncionActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarFuncion")) {
				jButtonCopiarFuncionActionPerformed(evt);
			} else if(sTipo.equals("VerFormFuncion")) {
				jButtonVerFormFuncionActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarFuncion")) {
				jButtonNuevoFuncionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarFuncion")) {
				jButtonDuplicarFuncionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoFuncion")) {
				jButtonNuevoFuncionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarFuncion")) {
				jButtonDuplicarFuncionActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesFuncion")) {
				jButtonNuevoFuncionActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarFuncion")) {
				jButtonNuevoFuncionActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesFuncion")) {
				jButtonNuevoFuncionActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarFuncion")) {
				jButtonModificarFuncionActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarFuncion")) {
				jButtonModificarFuncionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarFuncion")) {
				jButtonModificarFuncionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarFuncion")) {
				jButtonActualizarFuncionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarFuncion")) {
				jButtonActualizarFuncionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarFuncion")) {
				jButtonActualizarFuncionActionPerformed(evt);
			} else if(sTipo.equals("EliminarFuncion")) {
				jButtonEliminarFuncionActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarFuncion")) {
				jButtonEliminarFuncionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarFuncion")) {
				jButtonEliminarFuncionActionPerformed(evt);
			} else if(sTipo.equals("CancelarFuncion")) {
				jButtonCancelarFuncionActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarFuncion")) {
				jButtonCancelarFuncionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarFuncion")) {
				jButtonCancelarFuncionActionPerformed(evt);
			} else if(sTipo.equals("CerrarFuncion")) {
				jButtonCerrarFuncionActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarFuncion")) {
				jButtonCerrarFuncionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarFuncion")) {
				jButtonCerrarFuncionActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarFuncion")) {
				jButtonMostrarOcultarFuncionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarFuncion")) {
				jButtonCancelarFuncionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosFuncion")) {
				jButtonGuardarCambiosFuncionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarFuncion")) {
				jButtonGuardarCambiosFuncionActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarFuncion")) {
				jButtonCopiarFuncionActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarFuncion")) {
				jButtonVerFormFuncionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosFuncion")) {
				jButtonGuardarCambiosFuncionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarFuncion")) {
				jButtonCopiarFuncionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormFuncion")) {
				jButtonVerFormFuncionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaFuncion")) {
				jButtonGuardarCambiosFuncionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarFuncion")) {
				jButtonGuardarCambiosFuncionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaFuncion")) {
				jButtonGuardarCambiosFuncionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionFuncion")) {
				jButtonRecargarInformacionFuncionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarFuncion")) {
				jButtonRecargarInformacionFuncionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionFuncion")) {
				jButtonRecargarInformacionFuncionActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresFuncion")) {
				jButtonAnterioresFuncionActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarFuncion")) {
				jButtonAnterioresFuncionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreFuncion")) {
				jButtonAnterioresFuncionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesFuncion")) {
				jButtonSiguientesFuncionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarFuncion")) {
				jButtonSiguientesFuncionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesFuncion")) {
				jButtonSiguientesFuncionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByFuncion") || sTipo.equals("MenuItemDetalleAbrirOrderByFuncion")) {
				jButtonAbrirOrderByFuncionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarFuncion") || sTipo.equals("MenuItemDetalleMostrarOcultarFuncion")) {
				jButtonMostrarOcultarFuncionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosFuncion")) {
				jButtonNuevoGuardarCambiosFuncionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarFuncion")) {
				jButtonNuevoGuardarCambiosFuncionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosFuncion")) {
				jButtonNuevoGuardarCambiosFuncionActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoFuncion")) {
				jButtonCerrarReporteDinamicoFuncionActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoFuncion")) {
				jButtonGenerarReporteDinamicoFuncionActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoFuncion")) {
				
				jButtonGenerarExcelReporteDinamicoFuncionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionFuncion")) {
				jButtonCerrarImportacionFuncionActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionFuncion")) {
				
				jButtonGenerarImportacionFuncionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionFuncion")) {
				
				jButtonAbrirImportacionFuncionActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesFuncion")) {
				jComboBoxTiposAccionesFuncionActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesFuncion")) {
				jComboBoxTiposRelacionesFuncionActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioFuncion")) {
				jComboBoxTiposAccionesFuncionActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarFuncion")) {
				
				jComboBoxTiposSeleccionarFuncionActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralFuncion")) {
				jTextFieldValorCampoGeneralFuncionActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByFuncion")) {
				jButtonAbrirOrderByFuncionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarFuncion")) {
				jButtonAbrirOrderByFuncionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByFuncion")) {
				jButtonCerrarOrderByFuncionActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idFuncionBusqueda")) {
				this.jButtonidFuncionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaFuncionUpdate")) {
				this.jButtonid_empresaFuncionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaFuncionBusqueda")) {
				this.jButtonid_empresaFuncionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreFuncionBusqueda")) {
				this.jButtonnombreFuncionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionFuncionBusqueda")) {
				this.jButtondescripcionFuncionBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			FuncionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.funcion,new Object(),this.funcionParameterGeneral,this.funcionReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessFuncion();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFuncionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.funcion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.funcion);
				
				FuncionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.funcion,new Object(),this.funcionParameterGeneral,this.funcionReturnGeneral);
				
				


				
				FuncionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.funcion,new Object(),this.funcionParameterGeneral,this.funcionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Funcion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Funcion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Funcion funcionLocal=null;
			
			if(!this.getEsControlTabla()) {
				funcionLocal=this.funcion;
			} else {
				funcionLocal=this.funcionAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.funcion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.funcion);
				
				FuncionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.funcion,new Object(),this.funcionParameterGeneral,this.funcionReturnGeneral);
							
				
				


				
				FuncionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.funcion,new Object(),this.funcionParameterGeneral,this.funcionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Funcion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Funcion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFuncionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFuncion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.funcionAnterior =(Funcion) this.funcionLogic.getFuncions().toArray()[this.jTableDatosFuncion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.funcionAnterior =(Funcion) this.funcions.toArray()[this.jTableDatosFuncion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
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
			
			FuncionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.funcion,new Object(),this.funcionParameterGeneral,this.funcionReturnGeneral);
			
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
			
			


			
			FuncionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.funcion,new Object(),this.funcionParameterGeneral,this.funcionReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFuncionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.funcion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.funcion);
				
				FuncionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.funcion,new Object(),this.funcionParameterGeneral,this.funcionReturnGeneral);
								
						
				


				
				FuncionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.funcion,new Object(),this.funcionParameterGeneral,this.funcionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Funcion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Funcion.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.funcion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.funcion);
				
				FuncionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.funcion,new Object(),this.funcionParameterGeneral,this.funcionReturnGeneral);
								
				
				


				
				FuncionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.funcion,new Object(),this.funcionParameterGeneral,this.funcionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Funcion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Funcion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFuncionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFuncion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.funcionAnterior =(Funcion) this.funcionLogic.getFuncions().toArray()[this.jTableDatosFuncion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.funcionAnterior =(Funcion) this.funcions.toArray()[this.jTableDatosFuncion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.funcion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.funcion);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFuncionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFuncion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.funcionAnterior =(Funcion) this.funcionLogic.getFuncions().toArray()[this.jTableDatosFuncion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.funcionAnterior =(Funcion) this.funcions.toArray()[this.jTableDatosFuncion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFuncionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.funcion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.funcion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.funcion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.funcion);
				
				FuncionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.funcion,new Object(),this.funcionParameterGeneral,this.funcionReturnGeneral);
							
				
				


				
				FuncionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.funcion,new Object(),this.funcionParameterGeneral,this.funcionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Funcion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Funcion.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFuncionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosFuncion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.funcionAnterior =(Funcion) this.funcionLogic.getFuncions().toArray()[this.jTableDatosFuncion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.funcionAnterior =(Funcion) this.funcions.toArray()[this.jTableDatosFuncion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
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
			
			FuncionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.funcion,new Object(),this.funcionParameterGeneral,this.funcionReturnGeneral);
			
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
			
			


			
			FuncionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.funcion,new Object(),this.funcionParameterGeneral,this.funcionReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFuncionActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.funcion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.funcion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.funcion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.funcion);
				
				FuncionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.funcion,new Object(),this.funcionParameterGeneral,this.funcionReturnGeneral);
								
				
				


				
				FuncionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.funcion,new Object(),this.funcionParameterGeneral,this.funcionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Funcion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Funcion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFuncionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFuncion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.funcionAnterior =(Funcion) this.funcionLogic.getFuncions().toArray()[this.jTableDatosFuncion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.funcionAnterior =(Funcion) this.funcions.toArray()[this.jTableDatosFuncion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFuncionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.funcion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.funcion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFuncionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.funcion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.funcion);
				
				FuncionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.funcion,new Object(),this.funcionParameterGeneral,this.funcionReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosFuncion")) {
					jCheckBoxSeleccionarTodosFuncionItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosFuncion")) {
					jCheckBoxSeleccionadosFuncionItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarFuncion")) {
					
				}
				
				


				
				
				FuncionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.funcion,new Object(),this.funcionParameterGeneral,this.funcionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Funcion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Funcion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.funcion);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.funcion);
				
				FuncionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.funcion,new Object(),this.funcionParameterGeneral,this.funcionReturnGeneral);
												
				
				


				
				
				FuncionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.funcion,new Object(),this.funcionParameterGeneral,this.funcionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Funcion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Funcion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFuncionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosFuncion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.funcionAnterior =(Funcion) this.funcionLogic.getFuncions().toArray()[this.jTableDatosFuncion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.funcionAnterior =(Funcion) this.funcions.toArray()[this.jTableDatosFuncion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFuncionActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.funcion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.funcion);
				
				FuncionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.funcion,new Object(),this.funcionParameterGeneral,this.funcionReturnGeneral);
				
				
				FuncionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.funcion,new Object(),this.funcionParameterGeneral,this.funcionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
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
			
			FuncionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.funcion,new Object(),this.funcionParameterGeneral,this.funcionReturnGeneral);
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
			
			


			
			FuncionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.funcion,new Object(),this.funcionParameterGeneral,this.funcionReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFuncionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.funcion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.funcion);
				
				FuncionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.funcion,new Object(),this.funcionParameterGeneral,this.funcionReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				FuncionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.funcion,new Object(),this.funcionParameterGeneral,this.funcionReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Funcion.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Funcion.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.funcion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.funcion);
				
				FuncionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.funcion,new Object(),this.funcionParameterGeneral,this.funcionReturnGeneral);
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
				
				


				
				FuncionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.funcion,new Object(),this.funcionParameterGeneral,this.funcionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Funcion.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Funcion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFuncionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFuncion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.funcionAnterior =(Funcion) this.funcionLogic.getFuncions().toArray()[this.jTableDatosFuncion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.funcionAnterior =(Funcion) this.funcions.toArray()[this.jTableDatosFuncion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				FuncionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.funcion,new Object(),this.funcionParameterGeneral,this.funcionReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarFuncion")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosFuncionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosFuncion.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.funcion =(Funcion) this.funcionLogic.getFuncions().toArray()[this.jTableDatosFuncion.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.funcion =(Funcion) this.funcions.toArray()[this.jTableDatosFuncion.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.funcion);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarFuncion")) {
				
				}
				
				FuncionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.funcion,new Object(),this.funcionParameterGeneral,this.funcionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			FuncionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.funcion,new Object(),this.funcionParameterGeneral,this.funcionReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarFuncion")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosFuncion.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarFuncion")) {
			
			}
			
			FuncionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.funcion,new Object(),this.funcionParameterGeneral,this.funcionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessFuncion();
			
			FuncionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.funcion,new Object(),this.funcionParameterGeneral,this.funcionReturnGeneral);
			
			if(sTipo.equals("NuevoFuncion")) {
				jButtonNuevoFuncionActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarFuncion")) {
				jButtonDuplicarFuncionActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarFuncion")) {
				jButtonCopiarFuncionActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormFuncion")) {
				jButtonVerFormFuncionActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesFuncion")) {
				jButtonNuevoFuncionActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarFuncion")) {
				jButtonModificarFuncionActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarFuncion")) {
				jButtonActualizarFuncionActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarFuncion")) {
				jButtonEliminarFuncionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaFuncion")) {
				jButtonGuardarCambiosFuncionActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarFuncion")) {
				jButtonCancelarFuncionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarFuncion")) {
				jButtonCerrarFuncionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosFuncion")) {
				jButtonGuardarCambiosFuncionActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosFuncion")) {
				jButtonNuevoGuardarCambiosFuncionActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByFuncion")) {
				jButtonAbrirOrderByFuncionActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionFuncion")) {
				jButtonRecargarInformacionFuncionActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresFuncion")) {
				jButtonAnterioresFuncionActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesFuncion")) {
				jButtonSiguientesFuncionActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idFuncionBusqueda")) {
				this.jButtonidFuncionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaFuncionUpdate")) {
				this.jButtonid_empresaFuncionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaFuncionBusqueda")) {
				this.jButtonid_empresaFuncionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreFuncionBusqueda")) {
				this.jButtonnombreFuncionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionFuncionBusqueda")) {
				this.jButtondescripcionFuncionBusquedaActionPerformed(evt);
			}
			
			FuncionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.funcion,new Object(),this.funcionParameterGeneral,this.funcionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessFuncion();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			FuncionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.funcion,new Object(),this.funcionParameterGeneral,this.funcionReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameFuncion")) {
				closingInternalFrameFuncion();
				
			} else if(sTipo.equals("jButtonCancelarFuncion")) {
				JInternalFrameBase jInternalFrameDetalleFormFuncion = (JInternalFrameBase)evt.getSource();
	            	
	            FuncionBeanSwingJInternalFrame jInternalFrameParent=(FuncionBeanSwingJInternalFrame)jInternalFrameDetalleFormFuncion.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarFuncionActionPerformed(null);
			}
			
			FuncionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.funcion,new Object(),this.funcionParameterGeneral,this.funcionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormFuncion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormFuncion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormFuncion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.funcion)) {
			if(!esControlTabla) {
				if(FuncionJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualFuncion(this.funcion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysFuncion(this.funcion);			
				}
				
				if(this.funcionSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualFuncion(this.funcion,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.funcionReturnGeneral=funcionLogic.procesarEventosFuncionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.funcionLogic.getFuncions(),this.funcion,this.funcionParameterGeneral,this.isEsNuevoFuncion,classes);//this.funcionLogic.getFuncion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanFuncion(this.funcionReturnGeneral,this.funcionBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.funcionSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanFuncion(classes,this.funcionReturnGeneral,this.funcionBean,false);
					}
						
					if(this.funcionReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyFuncion(this.funcionReturnGeneral.getFuncion());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioFuncion(this.funcionReturnGeneral.getFuncion());	
					}
						
					if(this.funcionReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioFuncion(this.funcionReturnGeneral.getFuncion(),classes);//this.funcionBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioFuncion(this.funcion,classes);//this.funcionBean);									
				}
			
				if(FuncionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualFuncion(this.funcion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysFuncion(this.funcion);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.funcionAnterior!=null) {
						this.funcion=this.funcionAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.funcionReturnGeneral=funcionLogic.procesarEventosFuncionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.funcionLogic.getFuncions(),this.funcion,this.funcionParameterGeneral,this.isEsNuevoFuncion,classes);//this.funcionLogic.getFuncion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.funcionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.funcionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.funcionReturnGeneral.getFuncion(),funcionLogic.getFuncions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.funcionReturnGeneral.getFuncion(),this.funcions);
				}
				//ARCHITECTURE
				
				//this.jTableDatosFuncion.repaint();
				
				//((AbstractTableModel) this.jTableDatosFuncion.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosFuncion();
			}
		}
	}
	
	public void actualizarVisualTableDatosFuncion() throws Exception {
		
		FuncionModel funcionModel=(FuncionModel)this.jTableDatosFuncion.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			funcionModel.funcions=this.funcionLogic.getFuncions();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			funcionModel.funcions=this.funcions;
		}
		
		
		((FuncionModel) this.jTableDatosFuncion.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaFuncion() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getfuncionAnterior(),this.funcionLogic.getFuncions());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getfuncionAnterior(),this.funcions);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosFuncion();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioFuncion(Funcion funcion,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(FuncionEstruc.class)) {
					this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFrame.funcionestrucLogic.setFuncionEstrucs(funcion.getFuncionEstrucs());
					this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFrame.inicializarActualizarBindingTablaFuncionEstruc(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
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
										
				FuncionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.funcion,new Object(),generalEntityParameterGeneral,this.funcionReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.funcionSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=FuncionConstantesFunciones.getClassesRelationshipsOfFuncion(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=FuncionConstantesFunciones.getClassesRelationshipsFromStringsOfFuncion(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormFuncion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				FuncionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.funcion,new Object(),generalEntityParameterGeneral,this.funcionReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioFuncion(FuncionBean funcionBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(FuncionEstruc.class)) {
					this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFrame.funcionestrucLogic.setFuncionEstrucs(funcion.getFuncionEstrucs());
					this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFrame.inicializarActualizarBindingTablaFuncionEstruc(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanFuncion(ArrayList<Classe> classes,FuncionReturnGeneral funcionReturnGeneral,FuncionBean funcionBean,Boolean conDefault) throws Exception {
		
			this.funcionBean.setFuncionEstrucs(funcionReturnGeneral.getFuncion().getFuncionEstrucs());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualFuncion(Funcion funcion,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(FuncionEstruc.class)) {
					funcion.setFuncionEstrucs(this.jInternalFrameDetalleFormFuncion.funcionestrucBeanSwingJInternalFrame.funcionestrucLogic.getFuncionEstrucs());
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
		if(!paraTabla && !this.permiteMantenimiento(this.funcion)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormFuncion = new FuncionDetalleFormJInternalFrame(jDesktopPane,this.funcionSessionBean.getConGuardarRelaciones(),this.funcionSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormFuncion);
		this.jInternalFrameDetalleFormFuncion.setVisible(false);
		this.jInternalFrameDetalleFormFuncion.setSelected(false);						
		
		this.jInternalFrameDetalleFormFuncion.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormFuncion.funcionLogic=this.funcionLogic;
		
		this.cargarCombosFrameForeignKeyFuncion("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleFuncion();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleFuncion();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyFuncion("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyFuncion();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormFuncion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarFuncion"));
		
		this.jInternalFrameDetalleFormFuncion.jButtonModificarFuncion.addActionListener(new ButtonActionListener(this,"ModificarFuncion"));

		
		this.jInternalFrameDetalleFormFuncion.jButtonModificarToolBarFuncion.addActionListener(new ButtonActionListener(this,"ModificarToolBarFuncion"));
					
		this.jInternalFrameDetalleFormFuncion.jMenuItemModificarFuncion.addActionListener(new ButtonActionListener(this,"MenuItemModificarFuncion"));		
		
		
		
		this.jInternalFrameDetalleFormFuncion.jButtonActualizarFuncion.addActionListener (new ButtonActionListener(this,"ActualizarFuncion"));
		
		
		this.jInternalFrameDetalleFormFuncion.jButtonActualizarToolBarFuncion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarFuncion"));
						
		this.jInternalFrameDetalleFormFuncion.jMenuItemActualizarFuncion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarFuncion"));		
		
		
		
		this.jInternalFrameDetalleFormFuncion.jButtonEliminarFuncion.addActionListener (new ButtonActionListener(this,"EliminarFuncion"));
		
		
		this.jInternalFrameDetalleFormFuncion.jButtonEliminarToolBarFuncion.addActionListener (new ButtonActionListener(this,"EliminarToolBarFuncion"));
								
		this.jInternalFrameDetalleFormFuncion.jMenuItemEliminarFuncion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarFuncion"));		
		
		
		
		this.jInternalFrameDetalleFormFuncion.jButtonCancelarFuncion.addActionListener (new ButtonActionListener(this,"CancelarFuncion"));
		
		
		this.jInternalFrameDetalleFormFuncion.jButtonCancelarToolBarFuncion.addActionListener (new ButtonActionListener(this,"CancelarToolBarFuncion"));
					
		this.jInternalFrameDetalleFormFuncion.jMenuItemCancelarFuncion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarFuncion"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormFuncion.jMenuItemDetalleCerrarFuncion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarFuncion"));		
		
		
		
		this.jInternalFrameDetalleFormFuncion.jButtonGuardarCambiosToolBarFuncion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarFuncion"));
		
		
		
		this.jInternalFrameDetalleFormFuncion.jButtonGuardarCambiosToolBarFuncion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarFuncion"));
		
		
		
		this.jInternalFrameDetalleFormFuncion.jComboBoxTiposAccionesFormularioFuncion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioFuncion"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFuncion.jButtonidFuncionBusqueda.addActionListener(new ButtonActionListener(this,"idFuncionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFuncion.jButtonid_empresaFuncionUpdate.addActionListener(new ButtonActionListener(this,"id_empresaFuncionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFuncion.jButtonid_empresaFuncionBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaFuncionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFuncion.jButtonnombreFuncionBusqueda.addActionListener(new ButtonActionListener(this,"nombreFuncionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFuncion.jButtondescripcionFuncionBusqueda.addActionListener(new ButtonActionListener(this,"descripcionFuncionBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormFuncion.jTabbedPaneRelacionesFuncion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesFuncion"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameFuncion"));
		
		if(this.jInternalFrameDetalleFormFuncion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFuncion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarFuncion"));
		}
		
		this.jTableDatosFuncion.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarFuncion"));
		
		this.jTableDatosFuncion.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarFuncion"));
		
		this.jButtonNuevoFuncion.addActionListener(new ButtonActionListener(this,"NuevoFuncion"));
		
		this.jButtonDuplicarFuncion.addActionListener(new ButtonActionListener(this,"DuplicarFuncion"));
		
		this.jButtonCopiarFuncion.addActionListener(new ButtonActionListener(this,"CopiarFuncion"));
		
		this.jButtonVerFormFuncion.addActionListener(new ButtonActionListener(this,"VerFormFuncion"));
		
		
		this.jButtonNuevoToolBarFuncion.addActionListener(new ButtonActionListener(this,"NuevoToolBarFuncion"));
			
		this.jButtonDuplicarToolBarFuncion.addActionListener(new ButtonActionListener(this,"DuplicarToolBarFuncion"));
			
		this.jMenuItemNuevoFuncion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoFuncion"));
			
		this.jMenuItemDuplicarFuncion.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarFuncion"));		
		
		
		this.jButtonNuevoRelacionesFuncion.addActionListener (new ButtonActionListener(this,"NuevoRelacionesFuncion"));
		
		
		this.jButtonNuevoRelacionesToolBarFuncion.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarFuncion"));
			
		this.jMenuItemNuevoRelacionesFuncion.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesFuncion"));		
		
		
		if(this.jInternalFrameDetalleFormFuncion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFuncion.jButtonModificarFuncion.addActionListener(new ButtonActionListener(this,"ModificarFuncion"));
		}
		
		
		if(this.jInternalFrameDetalleFormFuncion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFuncion.jButtonModificarToolBarFuncion.addActionListener(new ButtonActionListener(this,"ModificarToolBarFuncion"));
			
			this.jInternalFrameDetalleFormFuncion.jMenuItemModificarFuncion.addActionListener(new ButtonActionListener(this,"MenuItemModificarFuncion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFuncion!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormFuncion.jButtonActualizarFuncion.addActionListener (new ButtonActionListener(this,"ActualizarFuncion"));
		}
		
		
		if(this.jInternalFrameDetalleFormFuncion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFuncion.jButtonActualizarToolBarFuncion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarFuncion"));
				
			this.jInternalFrameDetalleFormFuncion.jMenuItemActualizarFuncion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarFuncion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFuncion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFuncion.jButtonEliminarFuncion.addActionListener (new ButtonActionListener(this,"EliminarFuncion"));
		}
		
		
		if(this.jInternalFrameDetalleFormFuncion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFuncion.jButtonEliminarToolBarFuncion.addActionListener (new ButtonActionListener(this,"EliminarToolBarFuncion"));
						
			this.jInternalFrameDetalleFormFuncion.jMenuItemEliminarFuncion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarFuncion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFuncion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFuncion.jButtonCancelarFuncion.addActionListener (new ButtonActionListener(this,"CancelarFuncion"));
		}
		
		
		if(this.jInternalFrameDetalleFormFuncion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFuncion.jButtonCancelarToolBarFuncion.addActionListener (new ButtonActionListener(this,"CancelarToolBarFuncion"));
			
			this.jInternalFrameDetalleFormFuncion.jMenuItemCancelarFuncion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarFuncion"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarFuncion.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarFuncion"));		
		
		
		this.jButtonCerrarFuncion.addActionListener (new ButtonActionListener(this,"CerrarFuncion"));
		
		
		this.jButtonCerrarToolBarFuncion.addActionListener (new ButtonActionListener(this,"CerrarToolBarFuncion"));
			
		this.jMenuItemCerrarFuncion.addActionListener (new ButtonActionListener(this,"MenuItemCerrarFuncion"));
			
		if(this.jInternalFrameDetalleFormFuncion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFuncion.jMenuItemDetalleCerrarFuncion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarFuncion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFuncion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFuncion.jButtonGuardarCambiosFuncion.addActionListener (new ButtonActionListener(this,"GuardarCambiosFuncion"));
		}
		
		
		if(this.jInternalFrameDetalleFormFuncion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFuncion.jButtonGuardarCambiosToolBarFuncion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarFuncion"));
		}
		
		this.jButtonCopiarToolBarFuncion.addActionListener (new ButtonActionListener(this,"CopiarToolBarFuncion"));
			
		this.jButtonVerFormToolBarFuncion.addActionListener (new ButtonActionListener(this,"VerFormToolBarFuncion"));
		
		this.jMenuItemGuardarCambiosFuncion.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosFuncion"));
			
		this.jMenuItemCopiarFuncion.addActionListener (new ButtonActionListener(this,"MenuItemCopiarFuncion"));		
		
		this.jMenuItemVerFormFuncion.addActionListener (new ButtonActionListener(this,"MenuItemVerFormFuncion"));		
		
		
		this.jButtonGuardarCambiosTablaFuncion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaFuncion"));
		
		
		this.jButtonGuardarCambiosTablaToolBarFuncion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarFuncion"));
			
		this.jMenuItemGuardarCambiosTablaFuncion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaFuncion"));		
		
		
		
		this.jButtonRecargarInformacionFuncion.addActionListener (new ButtonActionListener(this,"RecargarInformacionFuncion"));
					
		this.jButtonRecargarInformacionToolBarFuncion.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarFuncion"));
		
		this.jMenuItemRecargarInformacionFuncion.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionFuncion"));		
		
		
		
		this.jButtonAnterioresFuncion.addActionListener (new ButtonActionListener(this,"AnterioresFuncion"));
		
		
		this.jButtonAnterioresToolBarFuncion.addActionListener (new ButtonActionListener(this,"AnterioresToolBarFuncion"));
		
		this.jMenuItemAnterioresFuncion.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresFuncion"));		
		
		
		this.jButtonSiguientesFuncion.addActionListener (new ButtonActionListener(this,"SiguientesFuncion"));
		
		
		this.jButtonSiguientesToolBarFuncion.addActionListener (new ButtonActionListener(this,"SiguientesToolBarFuncion"));
			
		this.jMenuItemSiguientesFuncion.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesFuncion"));
			
		this.jMenuItemAbrirOrderByFuncion.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByFuncion"));
			
		this.jMenuItemMostrarOcultarFuncion.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarFuncion"));
			
		this.jMenuItemDetalleAbrirOrderByFuncion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByFuncion"));
			
		this.jMenuItemDetalleMostarOcultarFuncion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarFuncion"));		
		
		
		this.jButtonNuevoGuardarCambiosFuncion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosFuncion"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarFuncion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarFuncion"));
			
		this.jMenuItemNuevoGuardarCambiosFuncion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosFuncion"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosFuncion.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosFuncion"));

		this.jCheckBoxSeleccionadosFuncion.addItemListener(new CheckBoxItemListener(this,"SeleccionadosFuncion"));
		
		if(this.jInternalFrameDetalleFormFuncion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFuncion.jComboBoxTiposAccionesFormularioFuncion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioFuncion"));
		}
		
		
		this.jComboBoxTiposRelacionesFuncion.addActionListener (new ButtonActionListener(this,"TiposRelacionesFuncion"));
			
		this.jComboBoxTiposAccionesFuncion.addActionListener (new ButtonActionListener(this,"TiposAccionesFuncion"));
					
		this.jComboBoxTiposSeleccionarFuncion.addActionListener (new ButtonActionListener(this,"TiposSeleccionarFuncion"));
			
		this.jTextFieldValorCampoGeneralFuncion.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralFuncion"));		
		
		
		if(this.jInternalFrameDetalleFormFuncion!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFuncion.jButtonidFuncionBusqueda.addActionListener(new ButtonActionListener(this,"idFuncionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFuncion.jButtonid_empresaFuncionUpdate.addActionListener(new ButtonActionListener(this,"id_empresaFuncionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFuncion.jButtonid_empresaFuncionBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaFuncionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFuncion.jButtonnombreFuncionBusqueda.addActionListener(new ButtonActionListener(this,"nombreFuncionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFuncion.jButtondescripcionFuncionBusqueda.addActionListener(new ButtonActionListener(this,"descripcionFuncionBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoFuncion!=null) {
				this.jInternalFrameReporteDinamicoFuncion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoFuncion"));
				this.jInternalFrameReporteDinamicoFuncion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoFuncion"));
				this.jInternalFrameReporteDinamicoFuncion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoFuncion"));
			}
			
			//this.jButtonCerrarReporteDinamicoFuncion.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoFuncion"));				
			//this.jButtonGenerarReporteDinamicoFuncion.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoFuncion"));
			//this.jButtonGenerarExcelReporteDinamicoFuncion.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoFuncion"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionFuncion!=null) {
				this.jInternalFrameImportacionFuncion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionFuncion"));
				this.jInternalFrameImportacionFuncion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionFuncion"));
				this.jInternalFrameImportacionFuncion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionFuncion"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByFuncion.addActionListener (new ButtonActionListener(this,"AbrirOrderByFuncion"));
			
			this.jButtonAbrirOrderByToolBarFuncion.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarFuncion"));			
			
			if(this.jInternalFrameOrderByFuncion!=null) {
				this.jInternalFrameOrderByFuncion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByFuncion"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormFuncion!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormFuncion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFuncion.jTabbedPaneRelacionesFuncion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesFuncion"));
		
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
            		closingInternalFrameFuncion();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormFuncion.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormFuncion = (JInternalFrameBase)event.getSource();
	            	
	            FuncionBeanSwingJInternalFrame jInternalFrameParent=(FuncionBeanSwingJInternalFrame)jInternalFrameDetalleFormFuncion.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarFuncionActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosFuncion.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosFuncionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosFuncion.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosFuncion.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoFuncion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFuncionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarFuncion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFuncionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoFuncion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFuncionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoFuncion";
		inputMap = this.jButtonNuevoFuncion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoFuncion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoFuncionActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesFuncion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFuncionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarFuncion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFuncionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesFuncion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFuncionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesFuncion";
		inputMap = this.jButtonNuevoRelacionesFuncion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesFuncion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoFuncionActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarFuncion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarFuncionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarFuncion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarFuncionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarFuncion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarFuncionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarFuncion";
		inputMap = this.jButtonModificarFuncion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarFuncion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarFuncionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarFuncion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarFuncionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarFuncion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarFuncionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarFuncion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarFuncionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarFuncion";
		inputMap = this.jButtonActualizarFuncion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarFuncion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarFuncionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarFuncion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarFuncionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarFuncion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarFuncionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarFuncion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarFuncionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarFuncion";
		inputMap = this.jButtonEliminarFuncion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarFuncion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarFuncionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarFuncion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarFuncionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarFuncion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarFuncionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarFuncion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarFuncionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarFuncion";
		inputMap = this.jButtonCancelarFuncion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarFuncion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarFuncionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarFuncion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarFuncionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarFuncion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarFuncionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarFuncion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarFuncionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarFuncion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarFuncionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarFuncionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarFuncion";
		inputMap = this.jButtonCerrarFuncion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarFuncion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarFuncionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormFuncion.jButtonGuardarCambiosFuncion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFuncionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarFuncion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFuncionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosFuncion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFuncionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaFuncion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFuncionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarFuncion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFuncionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaFuncion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFuncionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosFuncion";
		inputMap = this.jInternalFrameDetalleFormFuncion.jButtonGuardarCambiosFuncion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormFuncion.jButtonGuardarCambiosFuncion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosFuncionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionFuncion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionFuncionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarFuncion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionFuncionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionFuncion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionFuncionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresFuncion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresFuncionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarFuncion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresFuncionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresFuncion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresFuncionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesFuncion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesFuncionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarFuncion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesFuncionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesFuncion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesFuncionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosFuncion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosFuncionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarFuncion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosFuncionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosFuncion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosFuncionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosFuncion.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosFuncionItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesFuncion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesFuncionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarFuncion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarFuncionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralFuncion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralFuncionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFuncion.jButtonidFuncionBusqueda.addActionListener(new ButtonActionListener(this,"idFuncionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFuncion.jButtonid_empresaFuncionUpdate.addActionListener(new ButtonActionListener(this,"id_empresaFuncionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFuncion.jButtonid_empresaFuncionBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaFuncionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFuncion.jButtonnombreFuncionBusqueda.addActionListener(new ButtonActionListener(this,"nombreFuncionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFuncion.jButtondescripcionFuncionBusqueda.addActionListener(new ButtonActionListener(this,"descripcionFuncionBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoFuncion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoFuncionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoFuncion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoFuncionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoFuncion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoFuncionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionFuncion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionFuncionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionFuncion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionFuncionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionFuncion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionFuncionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarFuncionActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarFuncion.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosFuncion(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Funcion funcionAux:this.funcionLogic.getFuncions()) {
					funcionAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Funcion funcionAux:funcions) {
					funcionAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosFuncionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingFuncion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Funcion funcionAux:this.funcionLogic.getFuncions()) {
						funcionAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Funcion funcionAux:funcions) {
						funcionAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Funcion funcionAux:this.funcionLogic.getFuncions()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Funcion funcionAux:funcions) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaFuncion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosFuncion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosFuncion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosFuncion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosFuncionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingFuncion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosFuncion.getSelectedRows();
			
			Funcion funcionLocal=new Funcion();
			
			//this.seleccionarTodosFuncion(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					funcionLocal =(Funcion) this.funcionLogic.getFuncions().toArray()[this.jTableDatosFuncion.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					funcionLocal =(Funcion) this.funcions.toArray()[this.jTableDatosFuncion.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				funcionLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Funcion funcionAux:this.funcionLogic.getFuncions()) {
						funcionAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Funcion funcionAux:funcions) {
						funcionAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaFuncion(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosFuncion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosFuncion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosFuncion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualFuncionItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarFuncionParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralFuncionActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingFuncion(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralFuncion.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Funcion funcionAux:this.funcionLogic.getFuncions()) {
				
						if(sTipoSeleccionar.equals(FuncionConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							funcionAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(FuncionConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							funcionAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Funcion funcionAux:funcions) {
					
						if(sTipoSeleccionar.equals(FuncionConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							funcionAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(FuncionConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							funcionAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaFuncion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesFuncionActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingFuncion(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioFuncion=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesFuncion.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormFuncion.jComboBoxTiposAccionesFormularioFuncion.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteFuncion) {				
					conSplash=true;//false;										
					
					//this.startProcessFuncion(conSplash);
				
					this.generarReporteFuncionsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFuncion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFuncion.jComboBoxTiposAccionesFormularioFuncion.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoFuncionsSeleccionados();
				//this.jComboBoxTiposAccionesFuncion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoFuncionsSeleccionados(false);
				//this.jComboBoxTiposAccionesFuncion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoFuncionsSeleccionados(true);
				//this.jComboBoxTiposAccionesFuncion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessFuncion();
				
				this.exportarFuncionsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFuncion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFuncion.jComboBoxTiposAccionesFormularioFuncion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionFuncions();
				//this.importarFuncions();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFuncion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFuncion.jComboBoxTiposAccionesFormularioFuncion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessFuncion();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelFuncionsSeleccionados();
				//this.jComboBoxTiposAccionesFuncion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Funcion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessFuncion();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoFuncion)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyFuncion(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Funcion",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFuncion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFuncion.jComboBoxTiposAccionesFormularioFuncion.setSelectedIndex(0);					
				}	
			} 			
			else if(FuncionBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteFuncion) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessFuncion(conSplash);
					
						//this.actualizarParametrosGeneralFuncion();
						
						this.generarReporteProcesoAccionFuncionsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesFuncion.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormFuncion.jComboBoxTiposAccionesFormularioFuncion.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(FuncionBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO FuncionES SELECCIONADOS?", "MANTENIMIENTO DE Funcion", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessFuncion();
				
						this.actualizarParametrosGeneralFuncion();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.funcionReturnGeneral=funcionLogic.procesarAccionFuncionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.funcionLogic.getFuncions(),this.funcionParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarFuncionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesFuncion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormFuncion.jComboBoxTiposAccionesFormularioFuncion.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralFuncion();
					
					FuncionBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarFuncionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesFuncion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormFuncion.jComboBoxTiposAccionesFormularioFuncion.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessFuncion(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesFuncionActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessFuncion();
			
			if(this.jInternalFrameDetalleFormFuncion==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Funcion> funcionsSeleccionados=new ArrayList<Funcion>();		
			Funcion funcion=new Funcion();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingFuncion(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesFuncion.getSelectedItem();
			
			
			
			
			funcionsSeleccionados=this.getFuncionsSeleccionados(true);
			//this.sTipoAccion;
			
			if(funcionsSeleccionados.size()==1) {
				for(Funcion funcionAux:funcionsSeleccionados) {
					funcion=funcionAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Funcion Estruc")) {
					jButtonFuncionEstrucActionPerformed(null,rowIndex,true,false,funcion);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessFuncion();
			
      		//this.finishProcessFuncion(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarFuncionReturnGeneral() throws Exception {
		if(this.funcionReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.funcionReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.funcionReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.funcionReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.funcionReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.funcionReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingFuncion(false);
		}
		
		if(this.funcionReturnGeneral.getConRetornoLista() || this.funcionReturnGeneral.getConRetornoObjeto()) {
			if(this.funcionReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.funcionLogic.setFuncions(this.funcionReturnGeneral.getFuncions());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.funcionReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.funcionLogic.setFuncion(this.funcionReturnGeneral.getFuncion());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingFuncion(false);
		}
	}
	
	public void actualizarParametrosGeneralFuncion() throws Exception {
		
		
	}
	
	public ArrayList<Funcion> getFuncionsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Funcion> funcionsSeleccionados=new ArrayList<Funcion>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioFuncion) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Funcion funcionAux:funcionLogic.getFuncions()) {
					if(funcionAux.getIsSelected()) {
						funcionsSeleccionados.add(funcionAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Funcion funcionAux:this.funcions) {
					if(funcionAux.getIsSelected()) {
						funcionsSeleccionados.add(funcionAux);				
					}
				}
			}
			
			if(funcionsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						funcionsSeleccionados.addAll(this.funcionLogic.getFuncions());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						funcionsSeleccionados.addAll(this.funcions);				
					}
				}
			}
		} else {
			funcionsSeleccionados.add(this.funcion);
		}
		
		return funcionsSeleccionados;
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
	
	public void generarReporteFuncionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalFuncionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoFuncionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoFuncionsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoFuncionsSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesFuncionsSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Funcion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesFuncionsSeleccionados() throws Exception {
		ArrayList<Funcion> funcionsSeleccionados=new ArrayList<Funcion>();		
		
		funcionsSeleccionados=this.getFuncionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteFuncions("Todos",funcionsSeleccionados);
		
	}	
	
	public void generarReporteNormalFuncionsSeleccionados() throws Exception {
		ArrayList<Funcion> funcionsSeleccionados=new ArrayList<Funcion>();		
		
		funcionsSeleccionados=this.getFuncionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteFuncions("Todos",funcionsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionFuncionsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Funcion> funcionsSeleccionados=new ArrayList<Funcion>();
		
		funcionsSeleccionados=this.getFuncionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteFuncions("Todos",funcionsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoFuncionsSeleccionados() throws Exception {
		ArrayList<Funcion> funcionsSeleccionados=new ArrayList<Funcion>();		
		
		
		this.abrirInicializarFrameReporteDinamicoFuncion();
		
		
		funcionsSeleccionados=this.getFuncionsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoFuncion();
		
		
		//this.generarReporteFuncions("Todos",funcionsSeleccionados ,funcionImplementable,funcionImplementableHome);
	}
	
	public void mostrarImportacionFuncions() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionFuncion();
		
		this.abrirFrameImportacionFuncion();		
		
			
		//this.generarReporteFuncions("Todos",funcionsSeleccionados ,funcionImplementable,funcionImplementableHome);
	}
	
	public void importarFuncions() throws Exception {		
	
	}
	
	public void exportarFuncionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelFuncionsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoFuncionsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlFuncionsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Funcion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoFuncionsSeleccionados() throws Exception {
		ArrayList<Funcion> funcionsSeleccionados=new ArrayList<Funcion>();		
		
		funcionsSeleccionados=this.getFuncionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"funcion."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarFuncion(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Funcion funcionAux:funcionsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarFuncion(funcionAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//funcionAux.setsDetalleGeneralEntityReporte(funcionAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.funcionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Funcion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarFuncion(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=FuncionConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FuncionConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FuncionConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FuncionConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FuncionConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarFuncion(Funcion funcion,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=funcion.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=funcion.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=funcion.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=funcion.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=funcion.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelFuncionsSeleccionados() throws Exception {
		ArrayList<Funcion> funcionsSeleccionados=new ArrayList<Funcion>();		
		
		funcionsSeleccionados=this.getFuncionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"funcion.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Funcions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelFuncion(row);				
				iRow++;
			}				
			
			for(Funcion funcionAux:funcionsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelFuncion(funcionAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.funcionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Funcion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlFuncionsSeleccionados() throws Exception {
		ArrayList<Funcion> funcionsSeleccionados=new ArrayList<Funcion>();		
		
		funcionsSeleccionados=this.getFuncionsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"funcion.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("funcions");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("funcion");
			//elementRoot.appendChild(element);
		
			for(Funcion funcionAux:funcionsSeleccionados) {
				element = document.createElement("funcion");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlFuncion(funcionAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.funcionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Funcion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelFuncion(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(FuncionConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(FuncionConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(FuncionConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(FuncionConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(FuncionConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelFuncion(Funcion funcion,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(funcion.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(funcion.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(funcion.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(funcion.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlFuncion(Funcion funcion,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(FuncionConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(funcion.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(FuncionConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(funcion.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(FuncionConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(funcion.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementnombre = document.createElement(FuncionConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(funcion.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementdescripcion = document.createElement(FuncionConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(funcion.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoFuncionsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Funcion> funcionsSeleccionados=new ArrayList<Funcion>();
		
		funcionsSeleccionados=this.getFuncionsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoFuncion(funcionsSeleccionados);
		
		this.generarReporteFuncions("Todos",funcionsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoFuncion(ArrayList<Funcion> funcionsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Funcion funcionAux:funcionsSeleccionados) {
				funcionAux.setsDetalleGeneralEntityReporte(funcionAux.toString());
			
				if(sTipoSeleccionar.equals(FuncionConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					funcionAux.setsDescripcionGeneralEntityReporte1(funcionAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(FuncionConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					funcionAux.setsDescripcionGeneralEntityReporte1(funcionAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(FuncionConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					funcionAux.setsDescripcionGeneralEntityReporte1(funcionAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FuncionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesFuncion(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoFuncion=true;
				this.isVisibilidadCeldaNuevoRelacionesFuncion=true;
				this.isVisibilidadCeldaGuardarCambiosFuncion=true;
			}
			
			this.isVisibilidadCeldaModificarFuncion=false;
			this.isVisibilidadCeldaActualizarFuncion=false;
			this.isVisibilidadCeldaEliminarFuncion=false;
			this.isVisibilidadCeldaCancelarFuncion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFuncion=true;
				} else {
					this.isVisibilidadCeldaGuardarFuncion=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoFuncion=false;
			this.isVisibilidadCeldaNuevoRelacionesFuncion=false;
			this.isVisibilidadCeldaGuardarCambiosFuncion=false;
			this.isVisibilidadCeldaModificarFuncion=false;
			this.isVisibilidadCeldaActualizarFuncion=true;
			this.isVisibilidadCeldaEliminarFuncion=false;
			this.isVisibilidadCeldaCancelarFuncion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFuncion=true;
				} else {
					this.isVisibilidadCeldaGuardarFuncion=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoFuncion=false;
			this.isVisibilidadCeldaNuevoRelacionesFuncion=false;
			this.isVisibilidadCeldaGuardarCambiosFuncion=false;
			this.isVisibilidadCeldaModificarFuncion=false;
			this.isVisibilidadCeldaActualizarFuncion=true;
			this.isVisibilidadCeldaEliminarFuncion=true;
			this.isVisibilidadCeldaCancelarFuncion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFuncion=true;
				} else {
					this.isVisibilidadCeldaGuardarFuncion=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoFuncion=false;
			this.isVisibilidadCeldaNuevoRelacionesFuncion=false;
			this.isVisibilidadCeldaGuardarCambiosFuncion=false;
			this.isVisibilidadCeldaModificarFuncion=false;
			this.isVisibilidadCeldaActualizarFuncion=true;
			this.isVisibilidadCeldaEliminarFuncion=false;
			this.isVisibilidadCeldaCancelarFuncion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFuncion=false;
				} else {
					this.isVisibilidadCeldaGuardarFuncion=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoFuncion=true;
			this.isVisibilidadCeldaNuevoRelacionesFuncion=true;
			this.isVisibilidadCeldaGuardarCambiosFuncion=true;
			this.isVisibilidadCeldaModificarFuncion=false;
			this.isVisibilidadCeldaActualizarFuncion=false;
			this.isVisibilidadCeldaEliminarFuncion=false;
			this.isVisibilidadCeldaCancelarFuncion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFuncion=true;
				} else {
					this.isVisibilidadCeldaGuardarFuncion=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoFuncion=false;
			this.isVisibilidadCeldaNuevoRelacionesFuncion=false;
			this.isVisibilidadCeldaGuardarCambiosFuncion=false;
			this.isVisibilidadCeldaActualizarFuncion=false;
			this.isVisibilidadCeldaEliminarFuncion=false;
			this.isVisibilidadCeldaCancelarFuncion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFuncion=false;
				} else {
					this.isVisibilidadCeldaGuardarFuncion=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoFuncion=false;
			this.isVisibilidadCeldaNuevoRelacionesFuncion=false;
			this.isVisibilidadCeldaGuardarCambiosFuncion=false;
			this.isVisibilidadCeldaModificarFuncion=true;
			this.isVisibilidadCeldaActualizarFuncion=false;
			this.isVisibilidadCeldaEliminarFuncion=false;
			this.isVisibilidadCeldaCancelarFuncion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFuncion=false;
				} else {
					this.isVisibilidadCeldaGuardarFuncion=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(FuncionJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoFuncion=true;
			this.isVisibilidadCeldaNuevoRelacionesFuncion=true;
			this.isVisibilidadCeldaGuardarCambiosFuncion=true;
		} else {
			this.actualizarEstadoPanelsFuncion(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarFuncion=false;
			//this.isVisibilidadCeldaVerFormFuncion=false;
			this.isVisibilidadCeldaDuplicarFuncion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!funcionSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesFuncion=false;
		} else {
			this.isVisibilidadCeldaNuevoFuncion=false;
			this.isVisibilidadCeldaGuardarCambiosFuncion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(funcionSessionBean.getEsGuardarRelacionado()) {
			if(!funcionSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesFuncion=false;												
			}
			
			this.jButtonCerrarFuncion.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesFuncion=false;
		}
		
		if(!this.permiteMantenimiento(this.funcion)) {
			this.isVisibilidadCeldaActualizarFuncion=false;
			this.isVisibilidadCeldaEliminarFuncion=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesFuncion() {
		this.isVisibilidadCeldaNuevoFuncion=false;
		this.isVisibilidadCeldaGuardarCambiosFuncion=false;
	}
	
	public void actualizarEstadoPanelsFuncion(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionFuncion!=null) {
				this.jScrollPanelDatosEdicionFuncion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFuncion!=null) {
				this.jTabbedPaneBusquedasFuncion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFuncion!=null) {
				this.jScrollPanelDatosFuncion.setVisible(true);
			}
			
			if(this.jPanelPaginacionFuncion!=null) {
				this.jPanelPaginacionFuncion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFuncion!=null) {
				this.jPanelParametrosReportesFuncion.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionFuncion!=null) {
				this.jScrollPanelDatosEdicionFuncion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFuncion!=null) {
				this.jTabbedPaneBusquedasFuncion.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosFuncion!=null) {
				this.jScrollPanelDatosFuncion.setVisible(false);
			}
			
			if(this.jPanelPaginacionFuncion!=null) {
				this.jPanelPaginacionFuncion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesFuncion!=null) {
				this.jPanelParametrosReportesFuncion.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionFuncion!=null) {
				this.jScrollPanelDatosEdicionFuncion.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFuncion!=null) {
				this.jTabbedPaneBusquedasFuncion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosFuncion!=null) {
				this.jScrollPanelDatosFuncion.setVisible(false);
			}
			
			if(this.jPanelPaginacionFuncion!=null) {
				this.jPanelPaginacionFuncion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesFuncion!=null) {
				this.jPanelParametrosReportesFuncion.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionFuncion!=null) {
				this.jScrollPanelDatosEdicionFuncion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFuncion!=null) {
				this.jTabbedPaneBusquedasFuncion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosFuncion!=null) {
				this.jScrollPanelDatosFuncion.setVisible(false);
			}
			
			if(this.jPanelPaginacionFuncion!=null) {
				this.jPanelPaginacionFuncion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesFuncion!=null) {
				this.jPanelParametrosReportesFuncion.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionFuncion!=null) {
				this.jScrollPanelDatosEdicionFuncion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFuncion!=null) {
				this.jTabbedPaneBusquedasFuncion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFuncion!=null) {
				this.jScrollPanelDatosFuncion.setVisible(true);
			}
			
			if(this.jPanelPaginacionFuncion!=null) {
				this.jPanelPaginacionFuncion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFuncion!=null) {
				this.jPanelParametrosReportesFuncion.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionFuncion!=null) {
				this.jScrollPanelDatosEdicionFuncion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFuncion!=null) {
				this.jTabbedPaneBusquedasFuncion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFuncion!=null) {
				this.jScrollPanelDatosFuncion.setVisible(true);
			}
			
			if(this.jPanelPaginacionFuncion!=null) {
				this.jPanelPaginacionFuncion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFuncion!=null) {
				this.jPanelParametrosReportesFuncion.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionFuncion!=null) {
				this.jScrollPanelDatosEdicionFuncion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFuncion!=null) {
				this.jTabbedPaneBusquedasFuncion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFuncion!=null) {
				this.jScrollPanelDatosFuncion.setVisible(true);
			}
			
			if(this.jPanelPaginacionFuncion!=null) {
				this.jPanelPaginacionFuncion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFuncion!=null) {
				this.jPanelParametrosReportesFuncion.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.funcionSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasFuncion!=null) {
					this.jTabbedPaneBusquedasFuncion.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesFuncion!=null) {
				this.jPanelParametrosReportesFuncion.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.funcionSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFuncion!=null) {
				this.jTabbedPaneBusquedasFuncion.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesFuncion!=null) {
				this.jPanelParametrosReportesFuncion.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;
		}
		
	}
	
	

	public String registrarSesionFuncionParaFuncionEstruces() throws Exception {
		Boolean isPaginaPopupFuncionEstruc=false;

		try {

			if(this.funcionSessionBean==null) {
				this.funcionSessionBean=new FuncionSessionBean();
			}

			if(this.jInternalFrameDetalleFormFuncion.funcionestrucSessionBean==null) {
				this.jInternalFrameDetalleFormFuncion.funcionestrucSessionBean=new FuncionEstrucSessionBean();
			}

			this.jInternalFrameDetalleFormFuncion.funcionestrucSessionBean.setsPathNavegacionActual(funcionSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+FuncionEstrucConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormFuncion.funcionestrucSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupFuncionEstruc=this.jInternalFrameDetalleFormFuncion.funcionestrucSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormFuncion.funcionestrucSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeFuncionEstruc(true);
			this.jInternalFrameDetalleFormFuncion.funcionestrucSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeFuncionEstruc(FuncionConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormFuncion.funcionestrucSessionBean.setisBusquedaDesdeForeignKeySesionFuncion(true);
			this.jInternalFrameDetalleFormFuncion.funcionestrucSessionBean.setlidFuncionActual(this.idFuncionActual);

			funcionSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyFuncion(true);
			funcionSessionBean.setlIdFuncionActualForeignKey(this.idFuncionActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//FuncionSessionBean funcionSessionBean=new FuncionSessionBean();
		
		if(this.funcionSessionBean==null) {
			this.funcionSessionBean=new FuncionSessionBean();
		}
		
		this.funcionSessionBean.setsUltimaBusquedaFuncion(this.getsAccionBusqueda());
		this.funcionSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.funcionSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			funcionSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//FuncionSessionBean funcionSessionBean=new FuncionSessionBean();
		
		if(this.funcionSessionBean==null) {
			this.funcionSessionBean=new FuncionSessionBean();
		}
		
		if(this.funcionSessionBean.getsUltimaBusquedaFuncion()!=null&&!this.funcionSessionBean.getsUltimaBusquedaFuncion().equals("")) {
			this.setsAccionBusqueda(funcionSessionBean.getsUltimaBusquedaFuncion());
			this.setiNumeroPaginacion(funcionSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(funcionSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(funcionSessionBean.getid_empresa());
				funcionSessionBean.setid_empresa(-1L);
			}
		}
		
		this.funcionSessionBean.setsUltimaBusquedaFuncion("");
		this.funcionSessionBean.setiNumeroPaginacion(FuncionConstantesFunciones.INUMEROPAGINACION);
		this.funcionSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaFuncion(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioFuncion() {
		this.updateBorderResaltarBusquedasFormularioFuncion();
		this.updateVisibilidadBusquedasFormularioFuncion();
		this.updateHabilitarBusquedasFormularioFuncion();
	}
	
	public void updateBorderResaltarBusquedasFormularioFuncion() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasFuncion.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioFuncion() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasFuncion.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioFuncion() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasFuncion.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaFuncion(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarFuncion.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioFuncion() throws Exception {

		if(this.jInternalFrameDetalleFormFuncion==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioFuncion();
		this.updateVisibilidadResaltarControlesFormularioFuncion();
		this.updateHabilitarResaltarControlesFormularioFuncion();
		
	}
	
	public void updateBorderResaltarControlesFormularioFuncion() throws Exception {
		if(this.jInternalFrameDetalleFormFuncion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.funcionConstantesFunciones.resaltaridFuncion!=null && this.jInternalFrameDetalleFormFuncion!=null) {this.jInternalFrameDetalleFormFuncion.jLabelidFuncion.setBorder(this.funcionConstantesFunciones.resaltaridFuncion);}
		if(this.funcionConstantesFunciones.resaltarid_empresaFuncion!=null && this.jInternalFrameDetalleFormFuncion!=null) {this.jInternalFrameDetalleFormFuncion.jComboBoxid_empresaFuncion.setBorder(this.funcionConstantesFunciones.resaltarid_empresaFuncion);}
		if(this.funcionConstantesFunciones.resaltarnombreFuncion!=null && this.jInternalFrameDetalleFormFuncion!=null) {this.jInternalFrameDetalleFormFuncion.jTextAreanombreFuncion.setBorder(this.funcionConstantesFunciones.resaltarnombreFuncion);}
		if(this.funcionConstantesFunciones.resaltardescripcionFuncion!=null && this.jInternalFrameDetalleFormFuncion!=null) {this.jInternalFrameDetalleFormFuncion.jTextAreadescripcionFuncion.setBorder(this.funcionConstantesFunciones.resaltardescripcionFuncion);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioFuncion() throws Exception {		
		if(this.jInternalFrameDetalleFormFuncion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormFuncion!=null) {
	
		//this.jInternalFrameDetalleFormFuncion.jLabelidFuncion.setVisible(this.funcionConstantesFunciones.mostraridFuncion);
		this.jInternalFrameDetalleFormFuncion.jPanelidFuncion.setVisible(this.funcionConstantesFunciones.mostraridFuncion);
		//this.jInternalFrameDetalleFormFuncion.jComboBoxid_empresaFuncion.setVisible(this.funcionConstantesFunciones.mostrarid_empresaFuncion);
		this.jInternalFrameDetalleFormFuncion.jPanelid_empresaFuncion.setVisible(this.funcionConstantesFunciones.mostrarid_empresaFuncion);
		//this.jInternalFrameDetalleFormFuncion.jTextAreanombreFuncion.setVisible(this.funcionConstantesFunciones.mostrarnombreFuncion);
		this.jInternalFrameDetalleFormFuncion.jPanelnombreFuncion.setVisible(this.funcionConstantesFunciones.mostrarnombreFuncion);
		//this.jInternalFrameDetalleFormFuncion.jTextAreadescripcionFuncion.setVisible(this.funcionConstantesFunciones.mostrardescripcionFuncion);
		this.jInternalFrameDetalleFormFuncion.jPaneldescripcionFuncion.setVisible(this.funcionConstantesFunciones.mostrardescripcionFuncion);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioFuncion() throws Exception {
		if(this.jInternalFrameDetalleFormFuncion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormFuncion!=null) {
	
		this.jInternalFrameDetalleFormFuncion.jLabelidFuncion.setEnabled(this.funcionConstantesFunciones.activaridFuncion);
		this.jInternalFrameDetalleFormFuncion.jComboBoxid_empresaFuncion.setEnabled(this.funcionConstantesFunciones.activarid_empresaFuncion);
		this.jInternalFrameDetalleFormFuncion.jTextAreanombreFuncion.setEnabled(this.funcionConstantesFunciones.activarnombreFuncion);
		this.jInternalFrameDetalleFormFuncion.jTextAreadescripcionFuncion.setEnabled(this.funcionConstantesFunciones.activardescripcionFuncion);
		}
	}
	
		
}