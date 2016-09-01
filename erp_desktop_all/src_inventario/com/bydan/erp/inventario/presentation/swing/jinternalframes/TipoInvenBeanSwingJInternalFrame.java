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

import com.bydan.erp.inventario.util.TipoInvenConstantesFunciones;
import com.bydan.erp.inventario.util.TipoInvenParameterReturnGeneral;
//import com.bydan.erp.inventario.util.TipoInvenParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.TipoInvenBean;
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
public class TipoInvenBeanSwingJInternalFrame extends TipoInvenJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoInvenBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoInven> tipoinvenValidator = new ClassValidator<TipoInven>(TipoInven.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoInven tipoinven;	
	public TipoInven tipoinvenAux;
	public TipoInven tipoinvenAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoInven tipoinvenTotales;
	public Long idTipoInvenActual;
	public Long iIdNuevoTipoInven=0L;
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
	
	public Boolean isPermisoTodoTipoInven;
	public Boolean isPermisoNuevoTipoInven;
	public Boolean isPermisoActualizarTipoInven;
	public Boolean isPermisoActualizarOriginalTipoInven;
	public Boolean isPermisoEliminarTipoInven;
	public Boolean isPermisoGuardarCambiosTipoInven;
	public Boolean isPermisoConsultaTipoInven;
	public Boolean isPermisoBusquedaTipoInven;
	public Boolean isPermisoReporteTipoInven;
	public Boolean isPermisoPaginacionMedioTipoInven;
	public Boolean isPermisoPaginacionAltoTipoInven;
	public Boolean isPermisoPaginacionTodoTipoInven;
	public Boolean isPermisoCopiarTipoInven;
	public Boolean isPermisoVerFormTipoInven;
	public Boolean isPermisoDuplicarTipoInven;
	public Boolean isPermisoOrdenTipoInven;
	
	
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
	
	public TipoInvenParameterReturnGeneral tipoinvenReturnGeneral;
	public TipoInvenParameterReturnGeneral tipoinvenParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoInven=false;
	public Boolean esParaAccionDesdeFormularioTipoInven=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoInvenSessionBeanAdditional tipoinvenSessionBeanAdditional=null;
	
	public TipoInvenSessionBeanAdditional getTipoInvenSessionBeanAdditional() {
		return this.tipoinvenSessionBeanAdditional;
	}
	
	public void setTipoInvenSessionBeanAdditional(TipoInvenSessionBeanAdditional tipoinvenSessionBeanAdditional) {
		try {
			this.tipoinvenSessionBeanAdditional=tipoinvenSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoInvenBeanSwingJInternalFrameAdditional tipoinvenBeanSwingJInternalFrameAdditional=null;
	//public class TipoInvenBeanSwingJInternalFrame
	
	public TipoInvenBeanSwingJInternalFrameAdditional getTipoInvenBeanSwingJInternalFrameAdditional() {
		return this.tipoinvenBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoInvenBeanSwingJInternalFrameAdditional(TipoInvenBeanSwingJInternalFrameAdditional tipoinvenBeanSwingJInternalFrameAdditional) {
		try {
			this.tipoinvenBeanSwingJInternalFrameAdditional=tipoinvenBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoInvenLogic tipoinvenLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoInven tipoinvenBean;
	public TipoInvenConstantesFunciones tipoinvenConstantesFunciones;
	//public TipoInvenParameterReturnGeneral tipoinvenReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<TipoInven> tipoinvens;	
	//public List<TipoInven> tipoinvensEliminados;
	//public List<TipoInven> tipoinvensAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoInven=false;
	public Boolean isVisibilidadCeldaDuplicarTipoInven=true;
	public Boolean isVisibilidadCeldaCopiarTipoInven=true;
	public Boolean isVisibilidadCeldaVerFormTipoInven=true;
	public Boolean isVisibilidadCeldaOrdenTipoInven=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoInven=false;
	public Boolean isVisibilidadCeldaModificarTipoInven=false;
	public Boolean isVisibilidadCeldaActualizarTipoInven=false;
	public Boolean isVisibilidadCeldaEliminarTipoInven=false;
	public Boolean isVisibilidadCeldaCancelarTipoInven=false;
	public Boolean isVisibilidadCeldaGuardarTipoInven=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoInven=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoTipoInven() {
		return this.iIdNuevoTipoInven;
	}

	public void setiIdNuevoTipoInven(Long iIdNuevoTipoInven) {
		this.iIdNuevoTipoInven = iIdNuevoTipoInven;
	}
	
	public Long getidTipoInvenActual() {
		return this.idTipoInvenActual;
	}

	public void setidTipoInvenActual(Long idTipoInvenActual) {
		this.idTipoInvenActual = idTipoInvenActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoInven gettipoinven() {
		return this.tipoinven;
	}

	public void settipoinven(TipoInven tipoinven) {
		this.tipoinven = tipoinven;
	}
	
	public TipoInven gettipoinvenAux() {
		return this.tipoinvenAux;
	}

	public void settipoinvenAux(TipoInven tipoinvenAux) {
		this.tipoinvenAux = tipoinvenAux;
	}				
	
	public TipoInven gettipoinvenAnterior() {
		return this.tipoinvenAnterior;
	}

	public void settipoinvenAnterior(TipoInven tipoinvenAnterior) {
		this.tipoinvenAnterior = tipoinvenAnterior;
	}	
	
	public TipoInven gettipoinvenTotales() {
		return this.tipoinvenTotales;
	}

	public void settipoinvenTotales(TipoInven tipoinvenTotales) {
		this.tipoinvenTotales = tipoinvenTotales;
	}	
	
	public TipoInven gettipoinvenBean() {
		return this.tipoinvenBean;
	}

	public void settipoinvenBean(TipoInven tipoinvenBean) {
		this.tipoinvenBean = tipoinvenBean;
	}	
	
	public TipoInvenParameterReturnGeneral gettipoinvenReturnGeneral() {
		return this.tipoinvenReturnGeneral;
	}

	public void settipoinvenReturnGeneral(TipoInvenParameterReturnGeneral tipoinvenReturnGeneral) {
		this.tipoinvenReturnGeneral = tipoinvenReturnGeneral;
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
	
	
	public TipoInvenLogic getTipoInvenLogic()	{		
		return tipoinvenLogic;
	}

	public void setTipoInvenLogic(TipoInvenLogic tipoinvenLogic) {
		this.tipoinvenLogic = tipoinvenLogic;
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
	
	public Boolean getIsEsNuevoTipoInven() {
		return isEsNuevoTipoInven;
	}

	public void setIsEsNuevoTipoInven(Boolean isEsNuevoTipoInven) {
		this.isEsNuevoTipoInven = isEsNuevoTipoInven;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoInven() {
		return esParaAccionDesdeFormularioTipoInven;
	}
	
	public void setEsParaAccionDesdeFormularioTipoInven(Boolean esParaAccionDesdeFormularioTipoInven) {
		this.esParaAccionDesdeFormularioTipoInven = esParaAccionDesdeFormularioTipoInven;
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

			if(this.tipoinvenSessionBean==null) {
				this.tipoinvenSessionBean=new TipoInvenSessionBean();
			}

			if(!this.tipoinvenSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tipoinvenSessionBean.getlidEmpresaActual());
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

					if(this.tipoinven!=null) {
						this.tipoinven.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoInven!=null) {
						this.jInternalFrameDetalleFormTipoInven.jComboBoxid_empresaTipoInven.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTipoInven.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTipoInven!=null) {
						if(this.jInternalFrameDetalleFormTipoInven.jComboBoxid_empresaTipoInven.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoInven.jComboBoxid_empresaTipoInven.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTipoInvenGenerico)throws Exception
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
				jComboBoxid_empresaTipoInvenGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTipoInvenGenerico!=null && jComboBoxid_empresaTipoInvenGenerico.getItemCount()>0) {
					jComboBoxid_empresaTipoInvenGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TipoInven tipoinven,JComboBox jComboBoxid_empresaTipoInvenGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTipoInvenGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTipoInven.jComboBoxid_empresaTipoInven.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTipoInvenGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tipoinven.setid_empresa(empresaAux.getId());
				tipoinven.setempresa_descripcion(TipoInvenConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tipoinven.setEmpresa(empresaAux);			}
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

					if(!TipoInvenJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoInven!=null) { 
							this.jInternalFrameDetalleFormTipoInven.jComboBoxid_empresaTipoInven.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTipoInven.jComboBoxid_empresaTipoInven.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoInven!=null) { 
					}

					if(!TipoInvenJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTipoInven!=null) {
							this.jInternalFrameDetalleFormTipoInven.jComboBoxid_empresaTipoInven.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoInven!=null) {
							this.jInternalFrameDetalleFormTipoInven.jComboBoxid_empresaTipoInven.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesTipoInven() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoInvenConstantesFunciones.refrescarForeignKeysDescripcionesTipoInven(this.tipoinvenLogic.getTipoInvens());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoInvenConstantesFunciones.refrescarForeignKeysDescripcionesTipoInven(this.tipoinvens);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipoinvenLogic.setTipoInvens(this.tipoinvens);
			tipoinvenLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoInvenParameterReturnGeneral getTipoInvenParameterGeneral() {
		return this.tipoinvenParameterGeneral;
	}
	
	public void setTipoInvenParameterGeneral(TipoInvenParameterReturnGeneral tipoinvenParameterGeneral) {
		this.tipoinvenParameterGeneral = tipoinvenParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoInven() {
		return isPermisoTodoTipoInven;
	}

	public void setIsPermisoTodoTipoInven(Boolean isPermisoTodoTipoInven) {
		this.isPermisoTodoTipoInven = isPermisoTodoTipoInven;
	}

	public Boolean getIsPermisoNuevoTipoInven() {
		return isPermisoNuevoTipoInven;
	}

	public void setIsPermisoNuevoTipoInven(Boolean isPermisoNuevoTipoInven) {
		this.isPermisoNuevoTipoInven = isPermisoNuevoTipoInven;
	}

	public Boolean getIsPermisoActualizarTipoInven() {
		return isPermisoActualizarTipoInven;
	}

	public void setIsPermisoActualizarTipoInven(Boolean isPermisoActualizarTipoInven) {
		this.isPermisoActualizarTipoInven = isPermisoActualizarTipoInven;
	}

	public Boolean getIsPermisoEliminarTipoInven() {
		return isPermisoEliminarTipoInven;
	}

	public void setIsPermisoEliminarTipoInven(Boolean isPermisoEliminarTipoInven) {
		this.isPermisoEliminarTipoInven = isPermisoEliminarTipoInven;
	}

	public Boolean getIsPermisoGuardarCambiosTipoInven() {
		return isPermisoGuardarCambiosTipoInven;
	}

	public void setIsPermisoGuardarCambiosTipoInven(Boolean isPermisoGuardarCambiosTipoInven) {
		this.isPermisoGuardarCambiosTipoInven = isPermisoGuardarCambiosTipoInven;
	}
	
	public Boolean getIsPermisoConsultaTipoInven() {
		return isPermisoConsultaTipoInven;
	}

	public void setIsPermisoConsultaTipoInven(Boolean isPermisoConsultaTipoInven) {
		this.isPermisoConsultaTipoInven = isPermisoConsultaTipoInven;
	}

	public Boolean getIsPermisoBusquedaTipoInven() {
		return isPermisoBusquedaTipoInven;
	}

	public void setIsPermisoBusquedaTipoInven(Boolean isPermisoBusquedaTipoInven) {
		this.isPermisoBusquedaTipoInven = isPermisoBusquedaTipoInven;
	}

	public Boolean getIsPermisoReporteTipoInven() {
		return isPermisoReporteTipoInven;
	}

	public void setIsPermisoReporteTipoInven(Boolean isPermisoReporteTipoInven) {
		this.isPermisoReporteTipoInven = isPermisoReporteTipoInven;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoInven() {
		return isPermisoPaginacionMedioTipoInven;
	}

	public void setIsPermisoPaginacionMedioTipoInven(Boolean isPermisoPaginacionMedioTipoInven) {
		this.isPermisoPaginacionMedioTipoInven = isPermisoPaginacionMedioTipoInven;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoInven() {
		return isPermisoPaginacionTodoTipoInven;
	}

	public void setIsPermisoPaginacionTodoTipoInven(Boolean isPermisoPaginacionTodoTipoInven) {
		this.isPermisoPaginacionTodoTipoInven = isPermisoPaginacionTodoTipoInven;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoInven() {
		return isPermisoPaginacionAltoTipoInven;
	}

	public void setIsPermisoPaginacionAltoTipoInven(Boolean isPermisoPaginacionAltoTipoInven) {
		this.isPermisoPaginacionAltoTipoInven = isPermisoPaginacionAltoTipoInven;
	}
	
	public Boolean getIsPermisoCopiarTipoInven() {
		return isPermisoCopiarTipoInven;
	}

	public void setIsPermisoCopiarTipoInven(Boolean isPermisoCopiarTipoInven) {
		this.isPermisoCopiarTipoInven = isPermisoCopiarTipoInven;
	}
	
	public Boolean getIsPermisoVerFormTipoInven() {
		return isPermisoVerFormTipoInven;
	}

	public void setIsPermisoVerFormTipoInven(Boolean isPermisoVerFormTipoInven) {
		this.isPermisoVerFormTipoInven = isPermisoVerFormTipoInven;
	}
	
	public Boolean getIsPermisoDuplicarTipoInven() {
		return isPermisoDuplicarTipoInven;
	}

	public void setIsPermisoDuplicarTipoInven(Boolean isPermisoDuplicarTipoInven) {
		this.isPermisoDuplicarTipoInven = isPermisoDuplicarTipoInven;
	}
	
	public Boolean getIsPermisoOrdenTipoInven() {
		return isPermisoOrdenTipoInven;
	}

	public void setIsPermisoOrdenTipoInven(Boolean isPermisoOrdenTipoInven) {
		this.isPermisoOrdenTipoInven = isPermisoOrdenTipoInven;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoInven() {
		return isVisibilidadCeldaNuevoTipoInven;
	}

	public void setIsVisibilidadCeldaNuevoTipoInven(Boolean isVisibilidadCeldaNuevoTipoInven) {
		this.isVisibilidadCeldaNuevoTipoInven = isVisibilidadCeldaNuevoTipoInven;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoInven() {
		return isVisibilidadCeldaDuplicarTipoInven;
	}

	public void setIsVisibilidadCeldaDuplicarTipoInven(Boolean isVisibilidadCeldaDuplicarTipoInven) {
		this.isVisibilidadCeldaDuplicarTipoInven = isVisibilidadCeldaDuplicarTipoInven;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoInven() {
		return isVisibilidadCeldaCopiarTipoInven;
	}

	public void setIsVisibilidadCeldaCopiarTipoInven(Boolean isVisibilidadCeldaCopiarTipoInven) {
		this.isVisibilidadCeldaCopiarTipoInven = isVisibilidadCeldaCopiarTipoInven;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoInven() {
		return isVisibilidadCeldaVerFormTipoInven;
	}

	public void setIsVisibilidadCeldaVerFormTipoInven(Boolean isVisibilidadCeldaVerFormTipoInven) {
		this.isVisibilidadCeldaVerFormTipoInven = isVisibilidadCeldaVerFormTipoInven;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoInven() {
		return isVisibilidadCeldaOrdenTipoInven;
	}

	public void setIsVisibilidadCeldaOrdenTipoInven(Boolean isVisibilidadCeldaOrdenTipoInven) {
		this.isVisibilidadCeldaOrdenTipoInven = isVisibilidadCeldaOrdenTipoInven;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoInven() {
		return isVisibilidadCeldaNuevoRelacionesTipoInven;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoInven(Boolean isVisibilidadCeldaNuevoRelacionesTipoInven) {
		this.isVisibilidadCeldaNuevoRelacionesTipoInven = isVisibilidadCeldaNuevoRelacionesTipoInven;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoInven() {
		return isVisibilidadCeldaModificarTipoInven;
	}

	public void setIsVisibilidadCeldaModificarTipoInven(Boolean isVisibilidadCeldaModificarTipoInven) {
		this.isVisibilidadCeldaModificarTipoInven = isVisibilidadCeldaModificarTipoInven;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoInven() {
		return isVisibilidadCeldaActualizarTipoInven;
	}

	public void setIsVisibilidadCeldaActualizarTipoInven(Boolean isVisibilidadCeldaActualizarTipoInven) {
		this.isVisibilidadCeldaActualizarTipoInven = isVisibilidadCeldaActualizarTipoInven;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoInven() {
		return isVisibilidadCeldaEliminarTipoInven;
	}

	public void setIsVisibilidadCeldaEliminarTipoInven(Boolean isVisibilidadCeldaEliminarTipoInven) {
		this.isVisibilidadCeldaEliminarTipoInven = isVisibilidadCeldaEliminarTipoInven;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoInven() {
		return isVisibilidadCeldaCancelarTipoInven;
	}

	public void setIsVisibilidadCeldaCancelarTipoInven(Boolean isVisibilidadCeldaCancelarTipoInven) {
		this.isVisibilidadCeldaCancelarTipoInven = isVisibilidadCeldaCancelarTipoInven;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoInven() {
		return isVisibilidadCeldaGuardarTipoInven;
	}

	public void setIsVisibilidadCeldaGuardarTipoInven(Boolean isVisibilidadCeldaGuardarTipoInven) {
		this.isVisibilidadCeldaGuardarTipoInven = isVisibilidadCeldaGuardarTipoInven;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoInven() {
		return isVisibilidadCeldaGuardarCambiosTipoInven;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoInven(Boolean isVisibilidadCeldaGuardarCambiosTipoInven) {
		this.isVisibilidadCeldaGuardarCambiosTipoInven = isVisibilidadCeldaGuardarCambiosTipoInven;
	}
		
	public TipoInvenSessionBean gettipoinvenSessionBean() {
		return this.tipoinvenSessionBean;
	}
	
	public void settipoinvenSessionBean(TipoInvenSessionBean tipoinvenSessionBean) {
		this.tipoinvenSessionBean=tipoinvenSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoInven(TipoInven tipoinven)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tipoinven,null);
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
	
	public void bugActualizarReferenciaActual(TipoInven tipoinven,TipoInven tipoinvenAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoInven(tipoinven);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipoinvenAux.setId(tipoinven.getId());
		tipoinvenAux.setVersionRow(tipoinven.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoInven();
		
			int intSelectedRow = this.jTableDatosTipoInven.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinven =(TipoInven) this.tipoinvenLogic.getTipoInvens().toArray()[this.jTableDatosTipoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipoinven =(TipoInven) this.tipoinvens.toArray()[this.jTableDatosTipoInven.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoInven(this.tipoinven,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoInven(this.tipoinven);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipoinvenValidator.getInvalidValues(this.tipoinven);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipoinvenLogic.setDatosCliente(datosCliente);
			tipoinvenLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipoinvenAux=new  TipoInven();
				
				tipoinvenAux.setIsNew(true);
				tipoinvenAux.setIsChanged(true);
				
				tipoinvenAux.setTipoInvenOriginal(this.tipoinven);
				
				tipoinvenAux.setId(this.tipoinven.getId());	
				tipoinvenAux.setVersionRow(this.tipoinven.getVersionRow());	
				tipoinvenAux.setid_empresa(this.tipoinven.getid_empresa());	
				tipoinvenAux.setcodigo(this.tipoinven.getcodigo());	
				tipoinvenAux.setnombre(this.tipoinven.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoinvenSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoinvenSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipoinvenAux,tipoinvenLogic.getTipoInvens());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoinvenAux,tipoinvens);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipoinvenSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoinvenSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoinvenLogic.saveTipoInvens();//WithConnection
						//tipoinvenLogic.getSetVersionRowTipoInvens();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoinven,tipoinvenAux);
					
					this.refrescarForeignKeysDescripcionesTipoInven();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoinvenSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.tipoinvenSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoinvenLogic.saveTipoInvenRelaciones(tipoinvenAux);//WithConnection
								//tipoinvenLogic.getSetVersionRowTipoInvens();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipoinven,tipoinvenAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipoinvenSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipoinvenSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipoinvenAux,tipoinvenLogic.getTipoInvens());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipoinvenAux,tipoinvens);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipoinven,tipoinvenAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipoinvenAux=new  TipoInven();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipoinvenSessionBean.getEsGuardarRelacionado() 
					|| (this.tipoinvenSessionBean.getEsGuardarRelacionado() && this.tipoinven.getId()>=0)) {
						
					tipoinvenAux.setIsNew(false);
				}
				
				tipoinvenAux.setIsDeleted(false);
			
				tipoinvenAux.setId(this.tipoinven.getId());	
				tipoinvenAux.setVersionRow(this.tipoinven.getVersionRow());	
				tipoinvenAux.setid_empresa(this.tipoinven.getid_empresa());	
				tipoinvenAux.setcodigo(this.tipoinven.getcodigo());	
				tipoinvenAux.setnombre(this.tipoinven.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoinvenAux,tipoinvenLogic.getTipoInvens());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoinvenAux,tipoinvens);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipoinvenSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoinvenSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoinvenLogic.saveTipoInvens();//WithConnection
						//tipoinvenLogic.getSetVersionRowTipoInvens();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoinven,tipoinvenAux);
					
					this.refrescarForeignKeysDescripcionesTipoInven();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoinvenSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.tipoinvenSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoinvenLogic.saveTipoInvenRelaciones(tipoinvenAux);//WithConnection
								//tipoinvenLogic.getSetVersionRowTipoInvens();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipoinven,tipoinvenAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipoinvenSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipoinvenSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipoinvenAux,tipoinvenLogic.getTipoInvens());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipoinvenAux,tipoinvens);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipoinven,tipoinvenAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipoinvenAux=new  TipoInven();
				
				tipoinvenAux.setIsNew(false);
				tipoinvenAux.setIsChanged(false);
				
				tipoinvenAux.setIsDeleted(true);
				
				tipoinvenAux.setId(this.tipoinven.getId());	
				tipoinvenAux.setVersionRow(this.tipoinven.getVersionRow());	
				tipoinvenAux.setid_empresa(this.tipoinven.getid_empresa());	
				tipoinvenAux.setcodigo(this.tipoinven.getcodigo());	
				tipoinvenAux.setnombre(this.tipoinven.getnombre());	
				
				if(this.tipoinvenSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipoinvenAux.getId()>=0) {	
						this.tipoinvensEliminados.add(tipoinvenAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipoinvenAux,tipoinvenLogic.getTipoInvens());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoinvenAux,tipoinvens);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipoinvenSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoinvenSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoinvenLogic.saveTipoInvens();//WithConnection
						//tipoinvenLogic.getSetVersionRowTipoInvens();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoinvenSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.tipoinvenSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoinvenLogic.saveTipoInvenRelaciones(tipoinvenAux);//WithConnection
								//tipoinvenLogic.getSetVersionRowTipoInvens();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						}
					}  else {
							
						
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipoinvenSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipoinvenSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipoinvenAux,tipoinvenLogic.getTipoInvens());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipoinvenAux,tipoinvens);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinvenLogic.getTipoInvens().addAll(this.tipoinvensEliminados);
					
					tipoinvenLogic.saveTipoInvens();//WithConnection
					//tipoinvenLogic.getSetVersionRowTipoInvens();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoInven();
				
				this.tipoinvensEliminados= new ArrayList<TipoInven>();		
			}
			
			if(this.tipoinvenSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Inven GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Inven",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipoinven=tipoinvenAux;
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
      		//this.finishProcessTipoInven();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoInven tipoinvenLocal) throws Exception {
		
		if(this.tipoinvenSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoInven tipoinvenLocal) throws Exception {	
		if(this.tipoinvenSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tipoinvenLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoInvenActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoInven.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoinven =(TipoInven) this.tipoinvenLogic.getTipoInvens().toArray()[this.jTableDatosTipoInven.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipoinven =(TipoInven) this.tipoinvens.toArray()[this.jTableDatosTipoInven.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipoinvenValidator.getInvalidValues(this.tipoinven);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoInven tipoinven,List<TipoInven> tipoinvens) throws Exception {
		try	{		
			TipoInvenConstantesFunciones.actualizarLista(tipoinven,tipoinvens,this.tipoinvenSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoInven tipoinven,List<TipoInven> tipoinvens) throws Exception {
		try	{			
			TipoInvenConstantesFunciones.actualizarSelectedLista(tipoinven,tipoinvens);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoInven> tipoinvensLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipoinvensLocal=this.tipoinvenLogic.getTipoInvens();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipoinvensLocal=this.tipoinvens;
			}
			//ARCHITECTURE
		
			for(TipoInven tipoinvenLocal:tipoinvensLocal) {
				if(this.permiteMantenimiento(tipoinvenLocal) && tipoinvenLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoInvenConstantesFunciones.getTipoInvenLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoInvenConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoInven.jLabelid_empresaTipoInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoInvenConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoInven.jLabelcodigoTipoInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoInvenConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoInven.jLabelnombreTipoInven,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoInven!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoInven.jLabelid_empresaTipoInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoInven.jLabelcodigoTipoInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoInven.jLabelnombreTipoInven,"");
		
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
		this.iIdNuevoTipoInven--;	
		
		
		this.tipoinvenAux=new TipoInven();
		
		this.tipoinvenAux.setId(this.iIdNuevoTipoInven);
		this.tipoinvenAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoinvenLogic.getTipoInvens().add(this.tipoinvenAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipoinvens.add(this.tipoinvenAux);
		}
		//ARCHITECTURE
		
		this.tipoinven=this.tipoinvenAux;
		
		if(TipoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoInven(this.tipoinven);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoInven(this.tipoinven);
		}
				
		//this.setDefaultControlesTipoInven();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoInven();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoInven();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoInven();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoInven(this.tipoinvenBean,this.tipoinven,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoInven(this.tipoinven);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoInvenConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipoinvenSessionBean.getConGuardarRelaciones()) {
			classes=TipoInvenConstantesFunciones.getClassesRelationshipsOfTipoInven(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipoinvenReturnGeneral=tipoinvenLogic.procesarEventosTipoInvensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoinvenLogic.getTipoInvens(),this.tipoinven,this.tipoinvenParameterGeneral,this.isEsNuevoTipoInven,classes);//this.tipoinvenLogic.getTipoInven()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoInven(this.tipoinvenReturnGeneral,this.tipoinvenBean,false);
		
		if(this.tipoinvenReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoInven(this.tipoinvenReturnGeneral.getTipoInven());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoInven(this.tipoinvenReturnGeneral.getTipoInven());
		}
		
		if(this.tipoinvenReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoInven(this.tipoinvenReturnGeneral.getTipoInven(),classes);//this.tipoinvenBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoInven(this.tipoinven,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoInven();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoInven();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoInvenBeanSwingJInternalFrameAdditional.RecargarFormTipoInven(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoInven(false);
						
			if(tipoinvenSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoInvenJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoInven();
			}
			
			this.actualizarVisualTableDatosTipoInven();
			
			this.jTableDatosTipoInven.setRowSelectionInterval(this.getIndiceNuevoTipoInven(), this.getIndiceNuevoTipoInven());
			
			this.seleccionarFilaTablaTipoInvenActual();
						
			this.actualizarEstadoCeldasBotonesTipoInven("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoInven(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoInven.jTextFieldcodigoTipoInven.setEnabled(isHabilitar && this.tipoinvenConstantesFunciones.activarcodigoTipoInven);
		this.jInternalFrameDetalleFormTipoInven.jTextFieldnombreTipoInven.setEnabled(isHabilitar && this.tipoinvenConstantesFunciones.activarnombreTipoInven);	
		//
		this.jInternalFrameDetalleFormTipoInven.jComboBoxid_empresaTipoInven.setEnabled(isHabilitar && this.tipoinvenConstantesFunciones.activarid_empresaTipoInven);
	};
	
	public void setDefaultControlesTipoInven() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoInven(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipoinvenSessionBean.setConGuardarRelaciones(true);			
			this.tipoinvenSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoInven.jTabbedPaneRelacionesTipoInven.setVisible(true);
			
					
		} else {
			//this.tipoinvenSessionBean.setConGuardarRelaciones(false);			
			this.tipoinvenSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoInven.jTabbedPaneRelacionesTipoInven.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoInven() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoInven tipoinvenAux:this.tipoinvenLogic.getTipoInvens()) {
				if(tipoinvenAux.getId().equals(this.iIdNuevoTipoInven)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoInven tipoinvenAux:this.tipoinvens) {
				if(tipoinvenAux.getId().equals(this.iIdNuevoTipoInven)) {
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
	
	public int getIndiceActualTipoInven(TipoInven tipoinven,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoInven tipoinvenAux:this.tipoinvenLogic.getTipoInvens()) {
				if(tipoinvenAux.getId().equals(tipoinven.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoInven tipoinvenAux:this.tipoinvens) {
				if(tipoinvenAux.getId().equals(tipoinven.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoInven(TipoInven tipoinvenOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoInven tipoinvenAux:this.tipoinvenLogic.getTipoInvens()) {
				if(tipoinvenAux.getTipoInvenOriginal().getId().equals(tipoinvenOriginal.getId())) {
					existe=true;
					tipoinvenOriginal.setId(tipoinvenAux.getId());
					tipoinvenOriginal.setVersionRow(tipoinvenAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoInven tipoinvenAux:this.tipoinvens) {
				if(tipoinvenAux.getTipoInvenOriginal().getId().equals(tipoinvenOriginal.getId())) {
					existe=true;
					tipoinvenOriginal.setId(tipoinvenAux.getId());
					tipoinvenOriginal.setVersionRow(tipoinvenAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoInven(Boolean esParaCancelar) throws Exception {
		tipoinvensAux=new ArrayList<TipoInven>();
		tipoinvenAux=new TipoInven();
		
		if(!this.tipoinvenSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoInven tipoinvenAux:this.tipoinvenLogic.getTipoInvens()) {
					if(tipoinvenAux.getId()<0) {
						tipoinvensAux.add(tipoinvenAux);
					}		
				}
				this.iIdNuevoTipoInven=0L;
				this.tipoinvenLogic.getTipoInvens().removeAll(tipoinvensAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoInven tipoinvenAux:this.tipoinvens) {
					if(tipoinvenAux.getId()<0) {
						tipoinvensAux.add(tipoinvenAux);
					}		
				}
				this.iIdNuevoTipoInven=0L;
				this.tipoinvens.removeAll(tipoinvensAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoInven 
					&& this.tipoinvenLogic.getTipoInvens().size()>0
					) {
					tipoinvenAux=this.tipoinvenLogic.getTipoInvens().get(this.tipoinvenLogic.getTipoInvens().size() - 1);
				
					if(tipoinvenAux.getId()<0) {
						this.tipoinvenLogic.getTipoInvens().remove(tipoinvenAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoInven && this.tipoinvens.size()>0) {
					tipoinvenAux=this.tipoinvens.get(this.tipoinvens.size() - 1);
				
					if(tipoinvenAux.getId()<0) {
						this.tipoinvens.remove(tipoinvenAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoInven(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipoinven.getId()<0) {
				this.tipoinvenLogic.getTipoInvens().remove(this.tipoinven);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipoinven.getId()<0) {
				this.tipoinvens.remove(this.tipoinven);
			}
		}			
	}
	
	public void setEstadosInicialesTipoInven(List<TipoInven> tipoinvensAux) throws Exception {
		TipoInvenConstantesFunciones.setEstadosInicialesTipoInven(tipoinvensAux);
	}
	
	public void setEstadosInicialesTipoInven(TipoInven tipoinvenAux) throws Exception {
		TipoInvenConstantesFunciones.setEstadosInicialesTipoInven(tipoinvenAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoInvenActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoInvenActual()) {
				if(!this.isEsNuevoTipoInven) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoInven=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoInvenActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Inven ?", "MANTENIMIENTO DE Tipo Inven", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoInven tipoinven) throws Exception {
		TipoInvenConstantesFunciones.seleccionarAsignar(this.tipoinven,tipoinven);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoInven=this.isPermisoActualizarOriginalTipoInven;
			
			
			this.seleccionarAsignar(tipoinven);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoInvenConstantesFunciones.quitarEspaciosTipoInven(this.tipoinven,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoInven("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipoinvenSessionBean.setsFuncionBusquedaRapida(this.tipoinvenSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoInven) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoInven(esParaCancelar);				
				this.cancelarNuevoTipoInven(esParaCancelar);								
			}
			
			this.tipoinven=new TipoInven();
			
			this.inicializarTipoInven();
			
			this.actualizarEstadoCeldasBotonesTipoInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoInven() throws Exception {
		try {
			TipoInvenConstantesFunciones.inicializarTipoInven(this.tipoinven);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipoinvenLogic.getTipoInvens().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoInvens(String sAccionBusqueda,List<TipoInven> tipoinvensParaReportes) throws Exception {
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
					sPathReporteFinal="TipoInven"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoInvenMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoInvenMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoInven"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Invenes");		
		parameters.put("busquedapor", TipoInvenConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoInven=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoInvenConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoInvenConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoInven=new JRBeanArrayDataSource(TipoInvenJInternalFrame.TraerTipoInvenBeans(tipoinvensParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoInven);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoInvenConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoInvenConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoInvenBean.TraerTipoInvenBeans(tipoinvensParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoInvens(sAccionBusqueda,sTipoArchivoReporte,tipoinvensParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoInvens(sAccionBusqueda,sTipoArchivoReporte,tipoinvensParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoInvenActionPerformed(null);
					//this.generarExcelReporteTipoInvens(sAccionBusqueda,sTipoArchivoReporte,tipoinvensParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoInvens(sAccionBusqueda,sTipoArchivoReporte,tipoinvensParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoInvens(sAccionBusqueda,sTipoArchivoReporte,tipoinvensParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoInvens(sAccionBusqueda,sTipoArchivoReporte,tipoinvensParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoInvens(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoInven> tipoinvensParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoinven";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoInvens");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoInven("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoInven tipoinven : tipoinvensParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoInvenConstantesFunciones.generarExcelReporteDataTipoInven("NORMAL",row,workbook,tipoinven,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Inven",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoInven(String sTipo,Row row,Workbook workbook) {
		
		TipoInvenConstantesFunciones.generarExcelReporteHeaderTipoInven(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoInvens(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoInven> tipoinvensParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoinven_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoInvens");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoInven tipoinven : tipoinvensParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoInvenConstantesFunciones.getTipoInvenDescripcion(tipoinven));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoInvenConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoInvenConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoinven.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoInvenConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoInvenConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoinven.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoInvenConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoInvenConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoinven.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Inven",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoInvens(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoInven> tipoinvensParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoInven> tipoinvensRespaldo=null;
		
		classes=TipoInvenConstantesFunciones.getClassesRelationshipsOfTipoInven(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipoinvenLogic.setDatosCliente(this.datosCliente);
		this.tipoinvenLogic.setDatosDeep(this.datosDeep);
		this.tipoinvenLogic.setIsConDeep(true);
		
		tipoinvensRespaldo=this.tipoinvenLogic.getTipoInvens();
		
		this.tipoinvenLogic.setTipoInvens(tipoinvensParaReportes);	
		this.tipoinvenLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipoinvensParaReportes=this.tipoinvenLogic.getTipoInvens();
		this.tipoinvenLogic.setTipoInvens(tipoinvensRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoinven_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoInvens");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoInven("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoInven tipoinven : tipoinvensParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoInven("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoInvenConstantesFunciones.generarExcelReporteDataTipoInven("NORMAL",row,workbook,tipoinven,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoInvenConstantesFunciones.getTipoInvenDescripcion(tipoinven));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Inven",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoInven.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoInven.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoInven.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoInven.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoInven() throws Exception {		
		this.startProcessTipoInven(true);
	}
	
	public void startProcessTipoInven(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoInven ,this.jPanelParametrosReportesTipoInven, this.jScrollPanelDatosTipoInven,this.jPanelPaginacionTipoInven, this.jScrollPanelDatosEdicionTipoInven, this.jPanelAccionesTipoInven,this.jPanelAccionesFormularioTipoInven,this.jmenuBarTipoInven,this.jmenuBarDetalleTipoInven,this.jTtoolBarTipoInven,this.jTtoolBarDetalleTipoInven);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoInven=this.jTabbedPaneBusquedasTipoInven; 
		
		final JPanel jPanelParametrosReportesTipoInven=this.jPanelParametrosReportesTipoInven;
		//final JScrollPane jScrollPanelDatosTipoInven=this.jScrollPanelDatosTipoInven;
		final JTable jTableDatosTipoInven=this.jTableDatosTipoInven;		
		final JPanel jPanelPaginacionTipoInven=this.jPanelPaginacionTipoInven;
		//final JScrollPane jScrollPanelDatosEdicionTipoInven=this.jScrollPanelDatosEdicionTipoInven;
		final JPanel jPanelAccionesTipoInven=this.jPanelAccionesTipoInven;
		
		JPanel jPanelCamposAuxiliarTipoInven=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoInven=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoInven!=null) {
			jPanelCamposAuxiliarTipoInven=this.jInternalFrameDetalleFormTipoInven.jPanelCamposTipoInven;
			jPanelAccionesFormularioAuxiliarTipoInven=this.jInternalFrameDetalleFormTipoInven.jPanelAccionesFormularioTipoInven;
		}
		
		final JPanel jPanelCamposTipoInven=jPanelCamposAuxiliarTipoInven;
		final JPanel jPanelAccionesFormularioTipoInven=jPanelAccionesFormularioAuxiliarTipoInven;
		
		
		final JMenuBar jmenuBarTipoInven=this.jmenuBarTipoInven;
		final JToolBar jTtoolBarTipoInven=this.jTtoolBarTipoInven;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoInven=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoInven=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoInven!=null) {
			jmenuBarDetalleAuxiliarTipoInven=this.jInternalFrameDetalleFormTipoInven.jmenuBarDetalleTipoInven;
			jTtoolBarDetalleAuxiliarTipoInven=this.jInternalFrameDetalleFormTipoInven.jTtoolBarDetalleTipoInven;
		}
		
		final JMenuBar jmenuBarDetalleTipoInven=jmenuBarDetalleAuxiliarTipoInven;
		final JToolBar jTtoolBarDetalleTipoInven=jTtoolBarDetalleAuxiliarTipoInven;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoInven;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoInven;
			processRunnable.jTableDatos=jTableDatosTipoInven;
			processRunnable.jPanelCampos=jPanelCamposTipoInven;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoInven;
			processRunnable.jPanelAcciones=jPanelAccionesTipoInven;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoInven;
			
			
			processRunnable.jmenuBar=jmenuBarTipoInven;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoInven;
			processRunnable.jTtoolBar=jTtoolBarTipoInven;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoInven;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoInven ,jPanelParametrosReportesTipoInven,jTableDatosTipoInven, /*jScrollPanelDatosTipoInven,*/jPanelCamposTipoInven,jPanelPaginacionTipoInven, /*jScrollPanelDatosEdicionTipoInven,*/ jPanelAccionesTipoInven,jPanelAccionesFormularioTipoInven,jmenuBarTipoInven,jmenuBarDetalleTipoInven,jTtoolBarTipoInven,jTtoolBarDetalleTipoInven);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoInven ,jPanelParametrosReportesTipoInven, jScrollPanelDatosTipoInven,jPanelPaginacionTipoInven, jScrollPanelDatosEdicionTipoInven, jPanelAccionesTipoInven,jPanelAccionesFormularioTipoInven,jmenuBarTipoInven,jmenuBarDetalleTipoInven,jTtoolBarTipoInven,jTtoolBarDetalleTipoInven);
						
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
	
	public void finishProcessTipoInven() {// throws Exception 
		this.finishProcessTipoInven(true);
	}
	
	public void finishProcessTipoInven(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoInven ,this.jPanelParametrosReportesTipoInven, this.jScrollPanelDatosTipoInven,this.jPanelPaginacionTipoInven, this.jScrollPanelDatosEdicionTipoInven, this.jPanelAccionesTipoInven,this.jPanelAccionesFormularioTipoInven,this.jmenuBarTipoInven,this.jmenuBarDetalleTipoInven,this.jTtoolBarTipoInven,this.jTtoolBarDetalleTipoInven);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoInven=this.jTabbedPaneBusquedasTipoInven; 
		
		final JPanel jPanelParametrosReportesTipoInven=this.jPanelParametrosReportesTipoInven;
		//final JScrollPane jScrollPanelDatosTipoInven=this.jScrollPanelDatosTipoInven;
		final JTable jTableDatosTipoInven=this.jTableDatosTipoInven;		
		final JPanel jPanelPaginacionTipoInven=this.jPanelPaginacionTipoInven;
		//final JScrollPane jScrollPanelDatosEdicionTipoInven=this.jScrollPanelDatosEdicionTipoInven;
		final JPanel jPanelAccionesTipoInven=this.jPanelAccionesTipoInven;
		
		JPanel jPanelCamposAuxiliarTipoInven=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoInven=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoInven!=null) {
			jPanelCamposAuxiliarTipoInven=this.jInternalFrameDetalleFormTipoInven.jPanelCamposTipoInven;
			jPanelAccionesFormularioAuxiliarTipoInven=this.jInternalFrameDetalleFormTipoInven.jPanelAccionesFormularioTipoInven;
		}
		
		final JPanel jPanelCamposTipoInven=jPanelCamposAuxiliarTipoInven;
		final JPanel jPanelAccionesFormularioTipoInven=jPanelAccionesFormularioAuxiliarTipoInven;
		
		
		final JMenuBar jmenuBarTipoInven=this.jmenuBarTipoInven;		
		final JToolBar jTtoolBarTipoInven=this.jTtoolBarTipoInven;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoInven=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoInven=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoInven!=null) {
			jmenuBarDetalleAuxiliarTipoInven=this.jInternalFrameDetalleFormTipoInven.jmenuBarDetalleTipoInven;
			jTtoolBarDetalleAuxiliarTipoInven=this.jInternalFrameDetalleFormTipoInven.jTtoolBarDetalleTipoInven;		
		}
		
		final JMenuBar jmenuBarDetalleTipoInven=jmenuBarDetalleAuxiliarTipoInven;
		final JToolBar jTtoolBarDetalleTipoInven=jTtoolBarDetalleAuxiliarTipoInven;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoInven;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoInven;
			processRunnable.jTableDatos=jTableDatosTipoInven;
			processRunnable.jPanelCampos=jPanelCamposTipoInven;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoInven;
			processRunnable.jPanelAcciones=jPanelAccionesTipoInven;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoInven;
			
			
			processRunnable.jmenuBar=jmenuBarTipoInven;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoInven;
			processRunnable.jTtoolBar=jTtoolBarTipoInven;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoInven;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoInven ,jPanelParametrosReportesTipoInven, jTableDatosTipoInven,/*jScrollPanelDatosTipoInven,*/jPanelCamposTipoInven,jPanelPaginacionTipoInven, /*jScrollPanelDatosEdicionTipoInven,*/ jPanelAccionesTipoInven,jPanelAccionesFormularioTipoInven,jmenuBarTipoInven,jmenuBarDetalleTipoInven,jTtoolBarTipoInven,jTtoolBarDetalleTipoInven));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoInven(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoInven(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoInven(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoInven(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoInven,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoInven,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoInven(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoInven,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoInven,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipoinvenConstantesFunciones.getsFinalQueryTipoInven();
		String  finalQueryPaginacionTodos=this.tipoinvenConstantesFunciones.getsFinalQueryTipoInven();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoInvenConstantesFunciones.getArrayColumnasGlobalesNoTipoInven(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoInvenConstantesFunciones.getArrayColumnasGlobalesTipoInven(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoInvenConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipoinvensEliminados= new ArrayList<TipoInven>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoInven();
		
				///*TipoInvenSessionBean*/this.tipoinvenSessionBean=new TipoInvenSessionBean();
			
			if(this.tipoinvenSessionBean==null) {
				this.tipoinvenSessionBean=new TipoInvenSessionBean();
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
					this.iNumeroPaginacion=TipoInvenConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoInvenConstantesFunciones.getClassesForeignKeysOfTipoInven(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipoinven."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipoinvensAux= new ArrayList<TipoInven>();
			
				
			tipoinvenLogic.setDatosCliente(this.datosCliente);
			tipoinvenLogic.setDatosDeep(this.datosDeep);
			tipoinvenLogic.setIsConDeep(true);
			
			
			tipoinvenLogic.getTipoInvenDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipoinvenLogic.getTodosTipoInvens(finalQueryGlobal,pagination);
					
					//tipoinvenLogic.getTodosTipoInvensWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipoinvenLogic.getTipoInvens()==null|| tipoinvenLogic.getTipoInvens().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoinvensAux= new ArrayList<TipoInven>();
							tipoinvensAux.addAll(tipoinvenLogic.getTipoInvens());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoinvensAux= new ArrayList<TipoInven>();
							tipoinvensAux.addAll(tipoinvens);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoinvenLogic.getTodosTipoInvens(finalQueryGlobal+"",this.pagination);												
							
							//tipoinvenLogic.getTodosTipoInvensWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoInvens("Todos",tipoinvenLogic.getTipoInvens() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoinvenLogic.setTipoInvens(new ArrayList<TipoInven>());					
							tipoinvenLogic.getTipoInvens().addAll(tipoinvensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoinvens=new ArrayList<TipoInven>();
							tipoinvens.addAll(tipoinvensAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoInven=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoInven=this.idActual;
				
				} else if(this.idTipoInvenActual!=null && this.idTipoInvenActual!=0L) {
					idTipoInven=idTipoInvenActual;
				}
				
					
				this.sDetalleReporte=TipoInvenConstantesFunciones.getDetalleIndicePorId(idTipoInven);
				
				this.tipoinvens=new ArrayList<TipoInven>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipoinvenLogic.getEntity(idTipoInven);
					
					//tipoinvenLogic.getEntityWithConnection(idTipoInven);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoinvenLogic.setTipoInvens(new ArrayList<TipoInven>());
					tipoinvenLogic.getTipoInvens().add(tipoinvenLogic.getTipoInven());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoinvens=new ArrayList<TipoInven>();
					this.tipoinvens.add(tipoinven);
				}
				
				if(tipoinvenLogic.getTipoInven()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TipoInvenConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipoinvenLogic.getTipoInvensFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoInvenConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoInvenConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipoinvenLogic.getTipoInvens()==null||tipoinvenLogic.getTipoInvens().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipoinvens==null|| tipoinvens.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoinvensAux=new ArrayList<TipoInven>();
						tipoinvensAux.addAll(tipoinvenLogic.getTipoInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoinvensAux=new ArrayList<TipoInven>();
							tipoinvensAux.addAll(tipoinvens);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipoinvenLogic.getTipoInvensFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoInvenConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoInvenConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoInvens("FK_IdEmpresa",tipoinvenLogic.getTipoInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoInvens("FK_IdEmpresa",tipoinvens);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoinvenLogic.setTipoInvens(new ArrayList<TipoInven>());
						tipoinvenLogic.getTipoInvens().addAll(tipoinvensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoinvens=new ArrayList<TipoInven>();
							tipoinvens.addAll(tipoinvensAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoInven();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoInven();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoinvenLogic.getTipoInvens().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoinvens.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoinvenLogic.getTipoInvens().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoinvens.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoInven tipoinven) {
		Boolean permite=true;
		
		if(this.tipoinven.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoInvenConstantesFunciones.getOrderByListaTipoInven();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoInvenConstantesFunciones.getOrderByListaTipoInven();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoInven tipoinven:tipoinvenLogic.getTipoInvens()) {
				if(tipoinven.getsType().equals(Constantes2.S_TOTALES)) {
					tipoinvenTotales=tipoinven;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoInven tipoinven:this.tipoinvens) {
				if(tipoinven.getsType().equals(Constantes2.S_TOTALES)) {
					tipoinvenTotales=tipoinven;
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
			this.tipoinvenAux=new TipoInven();
			this.tipoinvenAux.setsType(Constantes2.S_TOTALES);
			this.tipoinvenAux.setIsNew(false);
			this.tipoinvenAux.setIsChanged(false);
			this.tipoinvenAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoInvenConstantesFunciones.TotalizarValoresFilaTipoInven(this.tipoinvenLogic.getTipoInvens(),this.tipoinvenAux);
				
				this.tipoinvenLogic.getTipoInvens().add(this.tipoinvenAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoInvenConstantesFunciones.TotalizarValoresFilaTipoInven(this.tipoinvens,this.tipoinvenAux);
				
				this.tipoinvens.add(this.tipoinvenAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipoinvenTotales=new TipoInven();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoinvenLogic.getTipoInvens().remove(tipoinvenTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoinvens.remove(tipoinvenTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipoinvenTotales=new TipoInven();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoInven tipoinven:tipoinvenLogic.getTipoInvens()) {
				if(tipoinven.getsType().equals(Constantes2.S_TOTALES)) {
					tipoinvenTotales=tipoinven;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoInvenConstantesFunciones.TotalizarValoresFilaTipoInven(this.tipoinvenLogic.getTipoInvens(),tipoinvenTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoInven tipoinven:this.tipoinvens) {
				if(tipoinven.getsType().equals(Constantes2.S_TOTALES)) {
					tipoinvenTotales=tipoinven;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoInvenConstantesFunciones.TotalizarValoresFilaTipoInven(this.tipoinvens,tipoinvenTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoInvensFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoInvensFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoinvenLogic.getTipoInvensFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosTipoInven() {
		this.isPermisoTodoTipoInven=false;
		this.isPermisoNuevoTipoInven=false;
		this.isPermisoActualizarTipoInven=false;
		this.isPermisoActualizarOriginalTipoInven=false;
		this.isPermisoEliminarTipoInven=false;
		this.isPermisoGuardarCambiosTipoInven=false;
		this.isPermisoConsultaTipoInven=false;
		this.isPermisoBusquedaTipoInven=false;
		this.isPermisoReporteTipoInven=false;		
		this.isPermisoOrdenTipoInven=false;		
		this.isPermisoPaginacionMedioTipoInven=false;		
		this.isPermisoPaginacionAltoTipoInven=false;
		this.isPermisoPaginacionTodoTipoInven=false;
		this.isPermisoCopiarTipoInven=false;		
		this.isPermisoVerFormTipoInven=false;		
		this.isPermisoDuplicarTipoInven=false;		
		this.isPermisoOrdenTipoInven=false;		
	}
	
	public void setPermisosUsuarioTipoInven(Boolean isPermiso) {
		this.isPermisoTodoTipoInven=isPermiso;
		this.isPermisoNuevoTipoInven=isPermiso;
		this.isPermisoActualizarTipoInven=isPermiso;
		this.isPermisoActualizarOriginalTipoInven=isPermiso;
		this.isPermisoEliminarTipoInven=isPermiso;
		this.isPermisoGuardarCambiosTipoInven=isPermiso;
		this.isPermisoConsultaTipoInven=isPermiso;
		this.isPermisoBusquedaTipoInven=isPermiso;
		this.isPermisoReporteTipoInven=isPermiso;
		this.isPermisoOrdenTipoInven=isPermiso;		
		this.isPermisoPaginacionMedioTipoInven=isPermiso;		
		this.isPermisoPaginacionAltoTipoInven=isPermiso;		
		this.isPermisoPaginacionTodoTipoInven=isPermiso;		
		this.isPermisoCopiarTipoInven=isPermiso;		
		this.isPermisoVerFormTipoInven=isPermiso;		
		this.isPermisoDuplicarTipoInven=isPermiso;
		this.isPermisoOrdenTipoInven=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoInven(Boolean isPermiso) {
		//this.isPermisoTodoTipoInven=isPermiso;
		this.isPermisoNuevoTipoInven=isPermiso;
		this.isPermisoActualizarTipoInven=isPermiso;
		this.isPermisoActualizarOriginalTipoInven=isPermiso;
		this.isPermisoEliminarTipoInven=isPermiso;
		this.isPermisoGuardarCambiosTipoInven=isPermiso;
		//this.isPermisoConsultaTipoInven=isPermiso;
		//this.isPermisoBusquedaTipoInven=isPermiso;
		//this.isPermisoReporteTipoInven=isPermiso;
		//this.isPermisoOrdenTipoInven=isPermiso;		
		//this.isPermisoPaginacionMedioTipoInven=isPermiso;		
		//this.isPermisoPaginacionAltoTipoInven=isPermiso;		
		//this.isPermisoPaginacionTodoTipoInven=isPermiso;		
		//this.isPermisoCopiarTipoInven=isPermiso;		
		//this.isPermisoDuplicarTipoInven=isPermiso;
		//this.isPermisoOrdenTipoInven=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoInvenClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoInvenJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoInven(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoInvenClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoInvenClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoInvenClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoInvenClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoInven() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoInvenJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipoinvenSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoInvenConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoInven=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoInven=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoInven=this.isPermisoActualizarTipoInven;
			this.isPermisoEliminarTipoInven=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoInven=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoInven=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoInven=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoInven=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoInven=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoInven=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoInven=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoInven=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoInven=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoInven=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoInven=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoInven=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoInven=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipoinvenSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoInven.setToolTipText(this.jTableDatosTipoInven.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoInven(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoInven(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoInvenJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoInvenJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoInven() throws Exception {
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
	public void inicializarCombosForeignKeyTipoInvenListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoInvenListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoInvenJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoInvenListas(false);
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
	
	public void cargarCombosLoteForeignKeyTipoInvenListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoInvenParameterReturnGeneral tipoinvenReturnGeneral=new TipoInvenParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tipoinvenConstantesFunciones.cargarid_empresaTipoInven)
					 || (this.esRecargarFks && this.tipoinvenConstantesFunciones.cargarid_empresaTipoInven)) {

					if(!this.tipoinvenSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tipoinvenSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipoinvenReturnGeneral=tipoinvenLogic.cargarCombosLoteForeignKeyTipoInven(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tipoinvenReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoInven()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tipoinvenSessionBean==null) {
				this.tipoinvenSessionBean=new TipoInvenSessionBean();
			}

			if(!this.tipoinvenSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyTipoInven()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoInven(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoInven()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoInven();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoInven(TipoInven tipoinven)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoInven(TipoInven tipoinven,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoInven()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoInven()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoInven()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoInven()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoInven()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoInven()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoInven(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoInven()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoInven.jComboBoxid_empresaTipoInven!=null && this.jInternalFrameDetalleFormTipoInven.jComboBoxid_empresaTipoInven.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoInven.jComboBoxid_empresaTipoInven.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoInvenBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoInvenBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoInvenBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipoinvenSessionBean=new TipoInvenSessionBean(); 
		this.tipoinvenConstantesFunciones=new TipoInvenConstantesFunciones(); 
		this.tipoinvenBean=new TipoInven();//(this.tipoinvenConstantesFunciones); 		
		this.tipoinvenReturnGeneral=new TipoInvenParameterReturnGeneral(); 
		
		this.tipoinvenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoinvenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoInvenBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoInvenBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoInvenBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoInven(true);
			
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
			
			this.tipoinvenConstantesFunciones=new TipoInvenConstantesFunciones(); 
			this.tipoinvenBean=new TipoInven();//this.tipoinvenConstantesFunciones); 			
			this.tipoinvenReturnGeneral=new TipoInvenParameterReturnGeneral(); 
		
			TipoInvenBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Inven Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipoinven=new TipoInven();
			this.tipoinvens = new ArrayList<TipoInven>();
			this.tipoinvensAux = new ArrayList<TipoInven>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinvenLogic=new TipoInvenLogic();
				this.tipoinvenLogic.getNewConnexionToDeep("");
			}
			
			//this.tipoinvenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipoinvenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoInven);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoInven!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoInven);	
					}
					
					if(this.jInternalFrameImportacionTipoInven!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoInven);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoInven!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoInven);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoInven!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoInven);
				this.jInternalFrameDetalleFormTipoInven.setVisible(false);
				this.jInternalFrameDetalleFormTipoInven.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoInven!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoInven);
					this.jInternalFrameReporteDinamicoTipoInven.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoInven.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoInven!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoInven);
					this.jInternalFrameImportacionTipoInven.setVisible(false);
					this.jInternalFrameImportacionTipoInven.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoInven!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoInven);
					this.jInternalFrameOrderByTipoInven.setVisible(false);
					this.jInternalFrameOrderByTipoInven.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoInvenActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoInvenConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipoinvenReturnGeneral=new TipoInvenParameterReturnGeneral();
			
			this.tipoinvenParameterGeneral=new TipoInvenParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipoinvenLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipoinvenSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoInvenJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipoinvenSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoInvenConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoinvenSessionBean.getEsGuardarRelacionado(),this.tipoinvenSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoInvenConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoinvenSessionBean.getEsGuardarRelacionado(),this.tipoinvenSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoInven=false;
			this.isVisibilidadCeldaDuplicarTipoInven=true;
			this.isVisibilidadCeldaCopiarTipoInven=true;
			this.isVisibilidadCeldaVerFormTipoInven=true;
			this.isVisibilidadCeldaOrdenTipoInven=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoInven=false;
			this.isVisibilidadCeldaModificarTipoInven=false;
			this.isVisibilidadCeldaActualizarTipoInven=false;
			this.isVisibilidadCeldaEliminarTipoInven=false;
			this.isVisibilidadCeldaCancelarTipoInven=false;
			this.isVisibilidadCeldaGuardarTipoInven=false;
			this.isVisibilidadCeldaGuardarCambiosTipoInven=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoInven();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoInven(false);
			
			this.setPermisosUsuarioTipoInven();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoinvenSessionBean.getEsGuardarRelacionado() 
				|| (this.tipoinvenSessionBean.getEsGuardarRelacionado() && this.tipoinvenSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoInvenClasesRelacionadas();
			}
			
			if(this.tipoinvenSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoInvenClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoInvenJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoInven();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoInven();
			}
			
			if(!this.isPermisoBusquedaTipoInven) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoInven.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoinvenSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoInven,this.isPermisoPaginacionMedioTipoInven,this.isPermisoPaginacionTodoTipoInven);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoInvenConstantesFunciones.getTiposSeleccionarTipoInven());
				
				this.tiposColumnasSelect=TipoInvenConstantesFunciones.getTiposSeleccionarTipoInven(true);
				
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
			//if(!this.tipoinvenSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoInven();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoInven(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoInven(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoInven() ;
			
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
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				tipoinvenImplementable= (TipoInvenImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoInvenConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipoinvenImplementableHome= (TipoInvenImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoInvenConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipoinvens= new ArrayList<TipoInven>();
			this.tipoinvensEliminados= new ArrayList<TipoInven>();
						
			this.isEsNuevoTipoInven=false;
			this.esParaAccionDesdeFormularioTipoInven=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoInven(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoInven();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoinvenSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoInvenBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoInvenConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoInven(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoInven!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoInven();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoInven();
			}
			
			TipoInvenBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoInven.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoInven.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoInven.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinvenLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoInven(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoInven: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinvenLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoInven() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoInven")) {
				iIndex=this.jInternalFrameDetalleFormTipoInven.jTabbedPaneRelacionesTipoInven.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoInven.jTabbedPaneRelacionesTipoInven.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoInven.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoInven();	
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
	
	public void cargarCombosForeignKeyTipoInven(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoInven(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoInven(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoInvenListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoInven();
		
		this.cargarCombosFrameForeignKeyTipoInven();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoInven();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoInven();
		}
	}
	
	
	
	public void jButtonNuevoTipoInvenActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipoinvenSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoinven,new Object(),this.tipoinvenParameterGeneral,this.tipoinvenReturnGeneral);
			
			
			if(jTableDatosTipoInven.getRowCount()>=1) {
				jTableDatosTipoInven.removeRowSelectionInterval(0, jTableDatosTipoInven.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoInven=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoInven(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoInven(true);			
			//this.tipoinven=new TipoInven();
			//this.tipoinven.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoInven(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoInven() ;
			
			if(TipoInvenJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoInven(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipoinven);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipoinven);				
			
			TipoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoinven,new Object(),this.tipoinvenParameterGeneral,this.tipoinvenReturnGeneral);
			
			if(this.tipoinvenSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoInven: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipoinven,new Object(),this.tipoinvenParameterGeneral,this.tipoinvenReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoInvenActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoInven> tipoinvensSeleccionados=new ArrayList<TipoInven>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoInven.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoInven.getSelectedRows().length;			
			}
			
			tipoinvensSeleccionados=this.getTipoInvensSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoInven--;			
				//TipoInven tipoinvenAux= new TipoInven();			
				//tipoinvenAux.setId(this.iIdNuevoTipoInven);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoInven tipoinvenOrigen=new TipoInven();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoInven tipoinvenOrigen : tipoinvensSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoInven.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipoinvenOrigen =(TipoInven) this.tipoinvenLogic.getTipoInvens().toArray()[this.jTableDatosTipoInven.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoinvenOrigen =(TipoInven) this.tipoinvens.toArray()[this.jTableDatosTipoInven.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoInven();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipoinven.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoInven(tipoinvenOrigen,this.tipoinven,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoInven(this.tipoinven);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoinvenLogic.getTipoInvens().add(this.tipoinvenAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoinvens.add(this.tipoinvenAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoInven(false);
				
				this.jTableDatosTipoInven.setRowSelectionInterval(this.getIndiceNuevoTipoInven(), this.getIndiceNuevoTipoInven());
				
				int iLastRow =  this.jTableDatosTipoInven.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoInven.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoInven.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoInven(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoInven> tipoinvensSeleccionados=new ArrayList<TipoInven>();									
		
			TipoInven tipoinvenOrigen=new TipoInven();
			TipoInven tipoinvenDestino=new TipoInven();
				
			tipoinvensSeleccionados=this.getTipoInvensSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoInven.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipoinvensSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoInven.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoinvenOrigen =(TipoInven) this.tipoinvenLogic.getTipoInvens().toArray()[this.jTableDatosTipoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoinvenOrigen =(TipoInven) this.tipoinvens.toArray()[this.jTableDatosTipoInven.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoinvenDestino =(TipoInven) this.tipoinvenLogic.getTipoInvens().toArray()[this.jTableDatosTipoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoinvenDestino =(TipoInven) this.tipoinvens.toArray()[this.jTableDatosTipoInven.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipoinvenOrigen =tipoinvensSeleccionados.get(0);
				tipoinvenDestino =tipoinvensSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoInven(tipoinvenOrigen,tipoinvenDestino,true,false);
				
				tipoinvenDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoinvenDestino,tipoinvenLogic.getTipoInvens());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoinvenDestino,tipoinvens);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoInven(false);
				
				//this.jTableDatosTipoInven.setRowSelectionInterval(this.getIndiceNuevoTipoInven(), this.getIndiceNuevoTipoInven());
				
				int iLastRow =  this.jTableDatosTipoInven.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoInven.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoInven.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoInven(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoInven.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoInven.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoInven.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoInven.setVisible(!isVisible);
			this.jPanelPaginacionTipoInven.setVisible(!isVisible);
			this.jPanelAccionesTipoInven.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoInven();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoInven();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoInven();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoInven();
			
			this.abrirFrameOrderByTipoInven();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoInven();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoInven(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoInven);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoInven.isMaximum()) {
					this.jInternalFrameDetalleFormTipoInven.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoInven.setSize(this.jInternalFrameDetalleFormTipoInven.iWidthFormulario,this.jInternalFrameDetalleFormTipoInven.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoInven.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoInven.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoInven.isMaximum()) {
						this.jInternalFrameDetalleFormTipoInven.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoInven.jContentPaneDetalleTipoInven.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoInven.jTabbedPaneRelacionesTipoInven.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoInven.jContentPaneDetalleTipoInven.getWidth(),TipoInvenConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoInven.jTabbedPaneRelacionesTipoInven.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoInven.jContentPaneDetalleTipoInven.getWidth(),TipoInvenConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoInven.jTabbedPaneRelacionesTipoInven.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoInven.jContentPaneDetalleTipoInven.getWidth(),TipoInvenConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoInven.setVisible(true);
	        this.jInternalFrameDetalleFormTipoInven.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoInven() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoInven==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoInven=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoInven,false,this);
				} else {
					this.jInternalFrameOrderByTipoInven=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoInven,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoInven);
				this.jInternalFrameOrderByTipoInven.setVisible(false);
				this.jInternalFrameOrderByTipoInven.setSelected(false);
				
				this.jInternalFrameOrderByTipoInven.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoInven"));
				
				this.inicializarActualizarBindingTablaOrderByTipoInven();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoInven() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoInven==null) {
				
				this.jInternalFrameImportacionTipoInven=new ImportacionJInternalFrame(TipoInvenConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoInven);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoInven);
				this.jInternalFrameImportacionTipoInven.setVisible(false);
				this.jInternalFrameImportacionTipoInven.setSelected(false);


				this.jInternalFrameImportacionTipoInven.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoInven"));
				this.jInternalFrameImportacionTipoInven.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoInven"));
				this.jInternalFrameImportacionTipoInven.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoInven"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoInven() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoInven==null) {
				this.jInternalFrameReporteDinamicoTipoInven=new ReporteDinamicoJInternalFrame(TipoInvenConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoInven);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoInven);
				this.jInternalFrameReporteDinamicoTipoInven.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoInven.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoInven.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoInven"));
				this.jInternalFrameReporteDinamicoTipoInven.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoInven"));
				this.jInternalFrameReporteDinamicoTipoInven.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoInven"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoInven();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleTipoInven() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoInven);
			
	       	this.jInternalFrameDetalleFormTipoInven.setVisible(false);
	        this.jInternalFrameDetalleFormTipoInven.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoInven.dispose();
			//this.jInternalFrameDetalleFormTipoInven=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoInven() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoInven.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoInven.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoInven() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoInven.setVisible(true);
	        this.jInternalFrameImportacionTipoInven.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoInven() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoInven.setVisible(true);
	        this.jInternalFrameOrderByTipoInven.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoInven() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoInven.setVisible(false);
	        this.jInternalFrameOrderByTipoInven.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoInven() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoInven.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoInven.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoInven() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoInven.setVisible(false);
	        this.jInternalFrameImportacionTipoInven.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoInven(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoInven(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoInven.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoInven(true);
			//this.isEsNuevoTipoInven=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinven =(TipoInven) this.tipoinvenLogic.getTipoInvens().toArray()[this.jTableDatosTipoInven.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoinven =(TipoInven) this.tipoinvens.toArray()[this.jTableDatosTipoInven.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoInven("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoInven(false) ;
			
			if(tipoinvenSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoInvenJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoInven(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoInven(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoInvenActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinven =(TipoInven) this.tipoinvenLogic.getTipoInvens().toArray()[this.jTableDatosTipoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoinven =(TipoInven) this.tipoinvens.toArray()[this.jTableDatosTipoInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoInven(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoInven.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoInven(true);
			//this.isEsNuevoTipoInven=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinven =(TipoInven) this.tipoinvenLogic.getTipoInvens().toArray()[this.jTableDatosTipoInven.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoinven =(TipoInven) this.tipoinvens.toArray()[this.jTableDatosTipoInven.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipoinven.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoInven("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoInven(false) ;
			
			if(TipoInvenJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoInven(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoInven(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarTipoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinvenLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoInven(false);
			
			//if(!this.isEsNuevoTipoInven) {								
				int intSelectedRow = this.jTableDatosTipoInven.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinven =(TipoInven) this.tipoinvenLogic.getTipoInvens().toArray()[this.jTableDatosTipoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoinven =(TipoInven) this.tipoinvens.toArray()[this.jTableDatosTipoInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoInven(this.tipoinven,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoInven(this.tipoinven);
				
			}
			
			if(this.permiteMantenimiento(this.tipoinven)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoinvenSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoInven=true;
					this.inicializarActualizarBindingTablaTipoInven(false);
					this.isEsNuevoTipoInven=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoInven=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoInven=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoInven(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoInven(false);
				
				this.habilitarDeshabilitarControlesTipoInven(false);
			
												
				
				if(TipoInvenJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoInven();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoInvenActionPerformed(evt,tipoinvenSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoInven(this.tipoinven,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoInven.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipoinvenSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinvenLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipoinven.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoInven.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoInven.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinvenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinvenLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoInven.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinven =(TipoInven) this.tipoinvenLogic.getTipoInvens().toArray()[this.jTableDatosTipoInven.convertRowIndexToModel(intSelectedRow)];
				this.tipoinven.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoinven =(TipoInven) this.tipoinvens.toArray()[this.jTableDatosTipoInven.convertRowIndexToModel(intSelectedRow)];
				this.tipoinven.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipoinven)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoinvenSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoInvenModel) this.jTableDatosTipoInven.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoInven=true;
				this.inicializarActualizarBindingTablaTipoInven(false);
				this.isEsNuevoTipoInven=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoInven(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoInven(false);
				
				this.habilitarDeshabilitarControlesTipoInven(false);
				
				
				
				if(TipoInvenJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoInven();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinvenLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoInvenActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoInven.getRowCount()>=1) {
				jTableDatosTipoInven.removeRowSelectionInterval(0, jTableDatosTipoInven.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoInven(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoInven(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoInven(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoInven(false) ;
			
			this.isEsNuevoTipoInven=false;
			
			if(TipoInvenJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoInven();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoInvenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinvenLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoInven(false);
				
				//SI ES MANUAL
				if(TipoInvenJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoInven();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinvenLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoInvenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoInven--;			
			//TipoInven tipoinvenAux= new TipoInven();			
			//tipoinvenAux.setId(this.iIdNuevoTipoInven);
			
			if(this.jInternalFrameDetalleFormTipoInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoInven();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoInven(this.tipoinven);
			
			this.tipoinven.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipoinvenLogic.getTipoInvens().add(this.tipoinvenAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipoinvens.add(this.tipoinvenAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoInven(false);
			
			this.jTableDatosTipoInven.setRowSelectionInterval(this.getIndiceNuevoTipoInven(), this.getIndiceNuevoTipoInven());
			
			int iLastRow =  this.jTableDatosTipoInven.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoInven.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoInven.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoInven(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoInvenActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinvenLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoInven(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoInven(false);
			
			//SI ES MANUAL
			if(TipoInvenJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoInven();
			}
			
			//this.abrirFrameTreeTipoInven();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinvenLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoInvenActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo InvenES ?", "MANTENIMIENTO DE Tipo Inven", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoInven.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoInven();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipoinvenReturnGeneral=tipoinvenLogic.procesarImportacionTipoInvensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipoinvenParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoInvenReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoInvenActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoInven.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoInven.setFileImportacion(this.jInternalFrameImportacionTipoInven.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoInven.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoInven.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoInven.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoInven.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoInvenActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoInven> tipoinvensSeleccionados=new ArrayList<TipoInven>();		

		tipoinvensSeleccionados=this.getTipoInvensSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoInven.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoInven.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoInvenBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoInvenBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoInvens("Todos",tipoinvensSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Inven",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoInven.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoInven.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoInvenConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoInvenConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoInvenConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoInven.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoInven.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoInven.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoInvenConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TipoInvenConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoInvenConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoInven.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoInvenConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TipoInvenConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoInvenConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoInven.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoInven.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoInvenConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TipoInvenConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoInvenConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoInvenActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoInven> tipoinvensSeleccionados=new ArrayList<TipoInven>();		
		
		tipoinvensSeleccionados=this.getTipoInvensSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoinven";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoInvens");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoInven.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoInven.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoInvenConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoInvenConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TipoInven tipoinven:tipoinvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoinven.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoInvenConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoInvenConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoInven tipoinven:tipoinvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoinven.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoInvenConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoInvenConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoInven tipoinven:tipoinvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoinven.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoInven(row);				
			//	iRow++;
			//}				
			
			//for(TipoInven tipoinvenAux:tipoinvensSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoInven(tipoinvenAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Inven",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipoinvenLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoInven(false);
			
			//SI ES MANUAL
			if(TipoInvenJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoInven();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinvenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoInvenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinvenLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoInven(false);
			
			//SI ES MANUAL
			if(TipoInvenJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoInven();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinvenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoInvenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinvenLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoInven(false);
			
			//SI ES MANUAL
			if(TipoInvenJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoInven();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinvenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoInven() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoInven.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoInven.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoInven.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoInven.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoInven.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoInven.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoInven.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoInven(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoInven(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoInven(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoInven(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoInven(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoinvenSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoInven(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoInven(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoInven(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoInvenJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoInvenJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoInven() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoInven();
		
		this.inicializarActualizarBindingBotonesManualTipoInven(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoinvenSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoInven();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoInven() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoInven(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoInven(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoInven.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoInven.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoInven.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoInven!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoInven.jCheckBoxPostAccionNuevoTipoInven.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoInven.jCheckBoxPostAccionSinCerrarTipoInven.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoInven.jCheckBoxPostAccionSinMensajeTipoInven.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoInven.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoInven.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoInven.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoInven!=null) {
				this.jInternalFrameDetalleFormTipoInven.jCheckBoxPostAccionNuevoTipoInven.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoInven.jCheckBoxPostAccionSinCerrarTipoInven.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoInven.jCheckBoxPostAccionSinMensajeTipoInven.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoInven.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoInven.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoInven!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoInven.jComboBoxTiposAccionesFormularioTipoInven.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoInven.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoInven!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoInven.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoInven.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoInven.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoInven.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoInven.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoInven!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoInven.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoInven.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoInven.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoInven(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoInvenJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoInven(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoInven() throws Exception {
		try	{
			if(TipoInvenJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoInven();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoInven() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoInven.jComboBoxTiposAccionesFormularioTipoInven.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoInven.jComboBoxTiposAccionesFormularioTipoInven.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoInven() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoInven.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoInven.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoInven.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoInven.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoInven.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoInven.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoInven.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoInven.addItem(reporte);
			}
			
			
			if(!this.tipoinvenSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoInven.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoInven.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoInven.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoInven.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoInven.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoInven.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoInven!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoInven.jComboBoxTiposAccionesFormularioTipoInven.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoInven.jComboBoxTiposAccionesFormularioTipoInven.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoInven.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoInven.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoInven.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoInven();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoInven() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoInven!=null) {
				this.jInternalFrameReporteDinamicoTipoInven.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoInven.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoInven!=null) {
				this.jInternalFrameReporteDinamicoTipoInven.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoInven.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoInven!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoInven.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoInven.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoInven.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoInven.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoInven.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoInven.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoInven()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoInven(Boolean esInicializar) throws Exception {				
		if(TipoInvenJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoInven();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoInven() throws Exception {
		this.inicializarActualizarBindingTablaTipoInven(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoInven() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoInven.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoInven.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoInven.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoInvenPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoInven.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoInven.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoInvenPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoInvenOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoInvenOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoInvenPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoInven.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoInven.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoInvenPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoInven.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoInven(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipoinvenLogic.getTipoInvens().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipoinvens.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoInven.setModel(new TipoInvenModel(this.tipoinvenLogic.getTipoInvens(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoInven.setModel(new TipoInvenModel(this.tipoinvens,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoInven!=null && this.jInternalFrameOrderByTipoInven.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoInven();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoInven,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoInvenPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoInvenConstantesFunciones.SCLASSWEBTITULO,tipoinvenConstantesFunciones.resaltarSeleccionarTipoInven,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoInvenConstantesFunciones.SCLASSWEBTITULO,tipoinvenConstantesFunciones.resaltarSeleccionarTipoInven,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoInven,TipoInvenConstantesFunciones.LABEL_ID));

		if(this.tipoinvenConstantesFunciones.mostraridTipoInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoInvenConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipoinvenConstantesFunciones.resaltaridTipoInven,this.tipoinvenConstantesFunciones.activaridTipoInven,this,true,"idTipoInven","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoinvenConstantesFunciones.resaltaridTipoInven,this.tipoinvenConstantesFunciones.activaridTipoInven,this,true,"idTipoInven","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoInven,TipoInvenConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tipoinvenConstantesFunciones.mostrarid_empresaTipoInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoInvenConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tipoinvenConstantesFunciones.resaltarid_empresaTipoInven,this,this.tipoinvenConstantesFunciones.activarid_empresaTipoInven));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tipoinvenConstantesFunciones.resaltarid_empresaTipoInven,this,this.tipoinvenConstantesFunciones.activarid_empresaTipoInven,false,"id_empresaTipoInven","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoInven,TipoInvenConstantesFunciones.LABEL_CODIGO));

		if(this.tipoinvenConstantesFunciones.mostrarcodigoTipoInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoInvenConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoinvenConstantesFunciones.resaltarcodigoTipoInven,this.tipoinvenConstantesFunciones.activarcodigoTipoInven,this,true,"codigoTipoInven","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoinvenConstantesFunciones.resaltarcodigoTipoInven,this.tipoinvenConstantesFunciones.activarcodigoTipoInven,this,true,"codigoTipoInven","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoInven,TipoInvenConstantesFunciones.LABEL_NOMBRE));

		if(this.tipoinvenConstantesFunciones.mostrarnombreTipoInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoInvenConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoinvenConstantesFunciones.resaltarnombreTipoInven,this.tipoinvenConstantesFunciones.activarnombreTipoInven,this,true,"nombreTipoInven","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoinvenConstantesFunciones.resaltarnombreTipoInven,this.tipoinvenConstantesFunciones.activarnombreTipoInven,this,true,"nombreTipoInven","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipoinvenSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoinvenSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoinvenSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoInven.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoinvenSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoinvenSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoInven.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoInven && this.isPermisoGuardarCambiosTipoInven) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipoinvenSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipoinvenSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoInven.addColumn(tableColumn);
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
			
			this.jTableDatosTipoInven.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoInven && this.isPermisoGuardarCambiosTipoInven) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoInven && this.isPermisoGuardarCambiosTipoInven) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoInven.moveColumn(this.jTableDatosTipoInven.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoInven.moveColumn(this.jTableDatosTipoInven.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoInven.moveColumn(this.jTableDatosTipoInven.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoInven.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoInven.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoInven,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoInven.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoInven.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoInven.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoInven.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoInven.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipoinvenLogic.getTipoInvens().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipoinvens.size()-1;
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
		//this.jTableDatosTipoInven.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoInven();
			
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
				
				//this.isEsNuevoTipoInven=false;
					
				TipoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoinven,new Object(),this.tipoinvenParameterGeneral,this.tipoinvenReturnGeneral);
			
				if(this.tipoinvenSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoInven==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoInven.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoInven.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinven =(TipoInven) this.tipoinvenLogic.getTipoInvens().toArray()[this.jTableDatosTipoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoinven =(TipoInven) this.tipoinvens.toArray()[this.jTableDatosTipoInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipoinven.getsType().equals("DUPLICADO")
				   || this.tipoinven.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoInven=true;
				
				} else {
					this.isEsNuevoTipoInven=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipoinvenSessionBean.getEsGuardarRelacionado()) {
					if(this.tipoinven.getId()>=0 && !this.tipoinven.getIsNew()) {						
						this.isEsNuevoTipoInven=false;
						
					} else {
						this.isEsNuevoTipoInven=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoInven(esRelaciones);						
				
				this.seleccionarTipoInven(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipoinven.getId()<0) {
					this.isEsNuevoTipoInven=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoInven(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoInven(evt,rowIndex);
				}	
				
				if(this.tipoinvenSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoInven: " + this.dDif); 
					}
				}								
				
				TipoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoinven,new Object(),this.tipoinvenParameterGeneral,this.tipoinvenReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoInven(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipoinven)) {
					if(this.tipoinven.getId()>0) {
						this.tipoinven.setIsDeleted(true);
						
						this.tipoinvensEliminados.add(this.tipoinven);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoinvenLogic.getTipoInvens().remove(this.tipoinven);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoinvens.remove(this.tipoinven);				
					}
					
					
					((TipoInvenModel) this.jTableDatosTipoInven.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoInven(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoInven(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoInven) {
			
			if(this.jInternalFrameDetalleFormTipoInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoInven.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoInven.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinven =(TipoInven) this.tipoinvenLogic.getTipoInvens().toArray()[this.jTableDatosTipoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoinven =(TipoInven) this.tipoinvens.toArray()[this.jTableDatosTipoInven.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoInven(this.tipoinven);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tipoinvenConstantesFunciones.cargarid_empresaTipoInven || this.tipoinvenConstantesFunciones.event_dependid_empresaTipoInven) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tipoinven.getid_empresa());
									//this.inicializarActualizarBindingTipoInven(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tipoinven.getEmpresa()!=null) {
							this.empresasForeignKey.add(tipoinven.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tipoinven.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoInven("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoInven(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoInven() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoInven(TipoInven tipoinven) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoInven(tipoinven,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoInven(TipoInven tipoinven,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoInven(tipoinven);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoInven(tipoinven,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoInven(tipoinven);
	}
	
	public void setVariablesObjetoActualToFormularioTipoInven(TipoInven tipoinven) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoInven.jLabelidTipoInven.setText(tipoinven.getId().toString());
			this.jInternalFrameDetalleFormTipoInven.jTextFieldcodigoTipoInven.setText(tipoinven.getcodigo());
			this.jInternalFrameDetalleFormTipoInven.jTextFieldnombreTipoInven.setText(tipoinven.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoInven tipoinvenLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipoinvenLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoInven tipoinvenLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipoinvenLocal=this.tipoinven;
			} else {
				tipoinvenLocal=this.tipoinvenAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipoinvenLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoInven(tipoinvenLocal,true);
					
					if(tipoinvenSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipoinvenLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipoinvenSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipoinvenLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoInven(TipoInven tipoinven,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoInven(tipoinven,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoInven(tipoinven);
	}
	
	public void setVariablesFormularioToObjetoActualTipoInven(TipoInven tipoinven,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoInven(tipoinven,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoInven(TipoInven tipoinven,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoInven.jLabelidTipoInven.getText()==null || this.jInternalFrameDetalleFormTipoInven.jLabelidTipoInven.getText()=="" || this.jInternalFrameDetalleFormTipoInven.jLabelidTipoInven.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoInven.jLabelidTipoInven.setText("0");
			}

			if(conColumnasBase) {tipoinven.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoInven.jLabelidTipoInven.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoInvenConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoInven.jLabelIdTipoInven,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoinven.setcodigo(this.jInternalFrameDetalleFormTipoInven.jTextFieldcodigoTipoInven.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoInvenConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoInven.jLabelcodigoTipoInven,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoinven.setnombre(this.jInternalFrameDetalleFormTipoInven.jTextFieldnombreTipoInven.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoInvenConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoInven.jLabelnombreTipoInven,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoInven(TipoInven tipoinvenBean,TipoInven tipoinven,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoInven(TipoInven tipoinvenOrigen,TipoInven tipoinven,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoinvenOrigen.getId()!=null && !tipoinvenOrigen.getId().equals(0L))) {tipoinven.setId(tipoinvenOrigen.getId());}}
			if(conDefault || (!conDefault && tipoinvenOrigen.getcodigo()!=null && !tipoinvenOrigen.getcodigo().equals(""))) {tipoinven.setcodigo(tipoinvenOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipoinvenOrigen.getnombre()!=null && !tipoinvenOrigen.getnombre().equals(""))) {tipoinven.setnombre(tipoinvenOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoInven(TipoInven tipoinven) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoInven.jLabelidTipoInven.setText(tipoinven.getId().toString());
			this.jInternalFrameDetalleFormTipoInven.jTextFieldcodigoTipoInven.setText(tipoinven.getcodigo());
			this.jInternalFrameDetalleFormTipoInven.jTextFieldnombreTipoInven.setText(tipoinven.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoInven(TipoInvenBean tipoinvenBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoInven.jLabelidTipoInven.setText(tipoinvenBean.getId().toString());
			this.jInternalFrameDetalleFormTipoInven.jTextFieldcodigoTipoInven.setText(tipoinvenBean.getcodigo());
			this.jInternalFrameDetalleFormTipoInven.jTextFieldnombreTipoInven.setText(tipoinvenBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoInven(TipoInvenParameterReturnGeneral tipoinvenReturnGeneral,TipoInvenBean tipoinvenBean,Boolean conDefault) throws Exception { 
		try {
			TipoInven tipoinvenLocal=new TipoInven();
			
			tipoinvenLocal=tipoinvenReturnGeneral.getTipoInven();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoinvenLocal.getId()!=null && !tipoinvenLocal.getId().equals(0L))) {tipoinvenBean.setId(tipoinvenLocal.getId());}}
			if(conDefault || (!conDefault && tipoinvenLocal.getcodigo()!=null && !tipoinvenLocal.getcodigo().equals(""))) {tipoinvenBean.setcodigo(tipoinvenLocal.getcodigo());}
			if(conDefault || (!conDefault && tipoinvenLocal.getnombre()!=null && !tipoinvenLocal.getnombre().equals(""))) {tipoinvenBean.setnombre(tipoinvenLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoInvenGenerico(Long idTipoInvenSeleccionado,JComboBox jComboBoxTipoInven,List<TipoInven> tipoinvensLocal)throws Exception {
		try {
			TipoInven  tipoinvenTemp=null;

			for(TipoInven tipoinvenAux:tipoinvensLocal) {
				if(tipoinvenAux.getId()!=null && tipoinvenAux.getId().equals(idTipoInvenSeleccionado)) {
					tipoinvenTemp=tipoinvenAux;
					break;
				}
			}

			jComboBoxTipoInven.setSelectedItem(tipoinvenTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoInvenGenerico(JComboBox jComboBoxTipoInven,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoInven.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoInven.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoInven.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoInven.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoinven=(TipoInven) tipoinvenLogic.getTipoInvens().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoinven =(TipoInven) tipoinvens.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tipoinven.getIsNew() && !tipoinven.getIsChanged() && !tipoinven.getIsDeleted()) {
				sDescripcion=tipoinven.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tipoinven.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoInven tipoinvenRow=new TipoInven();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoinvenRow=(TipoInven) tipoinvenLogic.getTipoInvens().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoinvenRow=(TipoInven) tipoinvens.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoInven(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoInven.setVisible((this.isVisibilidadCeldaNuevoTipoInven && this.isPermisoNuevoTipoInven));			
			this.jButtonDuplicarTipoInven.setVisible((this.isVisibilidadCeldaDuplicarTipoInven && this.isPermisoDuplicarTipoInven));			
			this.jButtonCopiarTipoInven.setVisible((this.isVisibilidadCeldaCopiarTipoInven && this.isPermisoCopiarTipoInven));
			this.jButtonVerFormTipoInven.setVisible((this.isVisibilidadCeldaVerFormTipoInven && this.isPermisoVerFormTipoInven));
			
			this.jButtonAbrirOrderByTipoInven.setVisible((this.isVisibilidadCeldaOrdenTipoInven && this.isPermisoOrdenTipoInven));			
			
			this.jButtonNuevoRelacionesTipoInven.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoInven && this.isPermisoNuevoTipoInven));			
			this.jButtonNuevoGuardarCambiosTipoInven.setVisible((this.isVisibilidadCeldaNuevoTipoInven && this.isPermisoNuevoTipoInven && this.isPermisoGuardarCambiosTipoInven));
			
			if(this.jInternalFrameDetalleFormTipoInven!=null) {
			this.jInternalFrameDetalleFormTipoInven.jButtonModificarTipoInven.setVisible((this.isVisibilidadCeldaModificarTipoInven && this.isPermisoActualizarTipoInven));	
			this.jInternalFrameDetalleFormTipoInven.jButtonActualizarTipoInven.setVisible((this.isVisibilidadCeldaActualizarTipoInven && this.isPermisoActualizarTipoInven));	
			this.jInternalFrameDetalleFormTipoInven.jButtonEliminarTipoInven.setVisible((this.isVisibilidadCeldaEliminarTipoInven && this.isPermisoEliminarTipoInven));
			this.jInternalFrameDetalleFormTipoInven.jButtonCancelarTipoInven.setVisible(this.isVisibilidadCeldaCancelarTipoInven);							
			this.jInternalFrameDetalleFormTipoInven.jButtonGuardarCambiosTipoInven.setVisible((this.isVisibilidadCeldaGuardarTipoInven && this.isPermisoGuardarCambiosTipoInven));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoInven.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoInven && this.isPermisoGuardarCambiosTipoInven));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoInven.setVisible((this.isVisibilidadCeldaNuevoTipoInven && this.isPermisoNuevoTipoInven));						
			this.jButtonDuplicarToolBarTipoInven.setVisible((this.isVisibilidadCeldaDuplicarTipoInven && this.isPermisoDuplicarTipoInven));						
			this.jButtonCopiarToolBarTipoInven.setVisible((this.isVisibilidadCeldaCopiarTipoInven && this.isPermisoCopiarTipoInven));			
			this.jButtonVerFormToolBarTipoInven.setVisible((this.isVisibilidadCeldaVerFormTipoInven && this.isPermisoVerFormTipoInven));			
			this.jButtonAbrirOrderByToolBarTipoInven.setVisible((this.isVisibilidadCeldaOrdenTipoInven && this.isPermisoOrdenTipoInven));
			this.jButtonNuevoRelacionesToolBarTipoInven.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoInven && this.isPermisoNuevoTipoInven));			
			this.jButtonNuevoGuardarCambiosToolBarTipoInven.setVisible((this.isVisibilidadCeldaNuevoTipoInven && this.isPermisoNuevoTipoInven && this.isPermisoGuardarCambiosTipoInven));			
			
			if(this.jInternalFrameDetalleFormTipoInven!=null) {
			this.jInternalFrameDetalleFormTipoInven.jButtonModificarToolBarTipoInven.setVisible((this.isVisibilidadCeldaModificarTipoInven && this.isPermisoActualizarTipoInven));	
			this.jInternalFrameDetalleFormTipoInven.jButtonActualizarToolBarTipoInven.setVisible((this.isVisibilidadCeldaActualizarTipoInven  && this.isPermisoActualizarTipoInven));	
			this.jInternalFrameDetalleFormTipoInven.jButtonEliminarToolBarTipoInven.setVisible((this.isVisibilidadCeldaEliminarTipoInven && this.isPermisoEliminarTipoInven));
			this.jInternalFrameDetalleFormTipoInven.jButtonCancelarToolBarTipoInven.setVisible(this.isVisibilidadCeldaCancelarTipoInven);				
			this.jInternalFrameDetalleFormTipoInven.jButtonGuardarCambiosToolBarTipoInven.setVisible((this.isVisibilidadCeldaGuardarTipoInven && this.isPermisoGuardarCambiosTipoInven));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoInven.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoInven && this.isPermisoGuardarCambiosTipoInven));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoInven.setVisible((this.isVisibilidadCeldaNuevoTipoInven && this.isPermisoNuevoTipoInven));			
			this.jMenuItemDuplicarTipoInven.setVisible((this.isVisibilidadCeldaDuplicarTipoInven && this.isPermisoDuplicarTipoInven));			
			this.jMenuItemCopiarTipoInven.setVisible((this.isVisibilidadCeldaCopiarTipoInven && this.isPermisoCopiarTipoInven));			
			this.jMenuItemVerFormTipoInven.setVisible((this.isVisibilidadCeldaVerFormTipoInven && this.isPermisoVerFormTipoInven));			
			this.jMenuItemAbrirOrderByTipoInven.setVisible((this.isVisibilidadCeldaOrdenTipoInven && this.isPermisoOrdenTipoInven));			
			//this.jMenuItemMostrarOcultarTipoInven.setVisible((this.isVisibilidadCeldaOrdenTipoInven && this.isPermisoOrdenTipoInven));
			this.jMenuItemDetalleAbrirOrderByTipoInven.setVisible((this.isVisibilidadCeldaOrdenTipoInven && this.isPermisoOrdenTipoInven));			
			//this.jMenuItemDetalleMostrarOcultarTipoInven.setVisible((this.isVisibilidadCeldaOrdenTipoInven && this.isPermisoOrdenTipoInven));			
			this.jMenuItemNuevoRelacionesTipoInven.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoInven && this.isPermisoNuevoTipoInven));			
			this.jMenuItemNuevoGuardarCambiosTipoInven.setVisible((this.isVisibilidadCeldaNuevoTipoInven && this.isPermisoNuevoTipoInven && this.isPermisoGuardarCambiosTipoInven));									
			
			if(this.jInternalFrameDetalleFormTipoInven!=null) {
			this.jInternalFrameDetalleFormTipoInven.jMenuItemModificarTipoInven.setVisible((this.isVisibilidadCeldaModificarTipoInven && this.isPermisoActualizarTipoInven));	
			this.jInternalFrameDetalleFormTipoInven.jMenuItemActualizarTipoInven.setVisible((this.isVisibilidadCeldaActualizarTipoInven && this.isPermisoActualizarTipoInven));	
			this.jInternalFrameDetalleFormTipoInven.jMenuItemEliminarTipoInven.setVisible((this.isVisibilidadCeldaEliminarTipoInven && this.isPermisoEliminarTipoInven));
			this.jInternalFrameDetalleFormTipoInven.jMenuItemCancelarTipoInven.setVisible(this.isVisibilidadCeldaCancelarTipoInven);				
			}
			
			this.jMenuItemGuardarCambiosTipoInven.setVisible((this.isVisibilidadCeldaGuardarTipoInven && this.isPermisoGuardarCambiosTipoInven));						
			this.jMenuItemGuardarCambiosTablaTipoInven.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoInven && this.isPermisoGuardarCambiosTipoInven));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoInven=this.jButtonNuevoTipoInven.isVisible();
			this.isVisibilidadCeldaDuplicarTipoInven=this.jButtonDuplicarTipoInven.isVisible();
			this.isVisibilidadCeldaCopiarTipoInven=this.jButtonCopiarTipoInven.isVisible();
			this.isVisibilidadCeldaVerFormTipoInven=this.jButtonVerFormTipoInven.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoInven=this.jButtonAbrirOrderByTipoInven.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoInven=this.jButtonNuevoRelacionesTipoInven.isVisible();
			this.isVisibilidadCeldaModificarTipoInven=this.jButtonModificarTipoInven.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoInven!=null) {
			this.isVisibilidadCeldaActualizarTipoInven=this.jInternalFrameDetalleFormTipoInven.jButtonActualizarTipoInven.isVisible();
			this.isVisibilidadCeldaEliminarTipoInven=this.jInternalFrameDetalleFormTipoInven.jButtonEliminarTipoInven.isVisible();
			this.isVisibilidadCeldaCancelarTipoInven=this.jInternalFrameDetalleFormTipoInven.jButtonCancelarTipoInven.isVisible();
			this.isVisibilidadCeldaGuardarTipoInven=this.jInternalFrameDetalleFormTipoInven.jButtonGuardarCambiosTipoInven.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoInven=this.jButtonGuardarCambiosTablaTipoInven.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoInven=this.jButtonNuevoToolBarTipoInven.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoInven=this.jButtonNuevoRelacionesToolBarTipoInven.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoInven!=null) {
			this.isVisibilidadCeldaModificarTipoInven=this.jInternalFrameDetalleFormTipoInven.jButtonModificarToolBarTipoInven.isVisible();
			this.isVisibilidadCeldaActualizarTipoInven=this.jInternalFrameDetalleFormTipoInven.jButtonActualizarToolBarTipoInven.isVisible();
			this.isVisibilidadCeldaEliminarTipoInven=this.jInternalFrameDetalleFormTipoInven.jButtonEliminarToolBarTipoInven.isVisible();
			this.isVisibilidadCeldaCancelarTipoInven=this.jInternalFrameDetalleFormTipoInven.jButtonCancelarToolBarTipoInven.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoInven=this.jButtonGuardarCambiosToolBarTipoInven.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoInven=this.jButtonGuardarCambiosTablaToolBarTipoInven.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoInven=this.jMenuItemNuevoTipoInven.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoInven=this.jMenuItemNuevoRelacionesTipoInven.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoInven!=null) {
			this.isVisibilidadCeldaModificarTipoInven=this.jInternalFrameDetalleFormTipoInven.jMenuItemModificarTipoInven.isVisible();
			this.isVisibilidadCeldaActualizarTipoInven=this.jInternalFrameDetalleFormTipoInven.jMenuItemActualizarTipoInven.isVisible();
			this.isVisibilidadCeldaEliminarTipoInven=this.jInternalFrameDetalleFormTipoInven.jMenuItemEliminarTipoInven.isVisible();
			this.isVisibilidadCeldaCancelarTipoInven=this.jInternalFrameDetalleFormTipoInven.jMenuItemCancelarTipoInven.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoInven=this.jMenuItemGuardarCambiosTipoInven.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoInven=this.jMenuItemGuardarCambiosTablaTipoInven.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoInven(Boolean esInicializar) {
		if(TipoInvenJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipoinvenSessionBean.getConGuardarRelaciones()) {
				//if(this.tipoinvenSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoInven();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoInven(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoInven() {
		this.jButtonNuevoTipoInven.setVisible(this.isPermisoNuevoTipoInven);			
		this.jButtonDuplicarTipoInven.setVisible(this.isPermisoDuplicarTipoInven);			
		this.jButtonCopiarTipoInven.setVisible(this.isPermisoCopiarTipoInven);			
		this.jButtonVerFormTipoInven.setVisible(this.isPermisoVerFormTipoInven);			
		
		this.jButtonAbrirOrderByTipoInven.setVisible(this.isPermisoOrdenTipoInven);					
		
		this.jButtonNuevoRelacionesTipoInven.setVisible(this.isPermisoNuevoTipoInven);			
		
		if(this.jInternalFrameDetalleFormTipoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoInven.jButtonModificarTipoInven.setVisible(this.isPermisoActualizarTipoInven);	
			this.jInternalFrameDetalleFormTipoInven.jButtonActualizarTipoInven.setVisible(this.isPermisoActualizarTipoInven);	
			this.jInternalFrameDetalleFormTipoInven.jButtonEliminarTipoInven.setVisible(this.isPermisoEliminarTipoInven);
			this.jInternalFrameDetalleFormTipoInven.jButtonCancelarTipoInven.setVisible(this.isVisibilidadCeldaCancelarTipoInven);						
			this.jInternalFrameDetalleFormTipoInven.jButtonGuardarCambiosTipoInven.setVisible(this.isPermisoGuardarCambiosTipoInven);							
		}
		
		this.jButtonGuardarCambiosTablaTipoInven.setVisible(this.isPermisoActualizarTipoInven);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoInven() {
		this.jInternalFrameDetalleFormTipoInven.jButtonModificarTipoInven.setVisible(this.isPermisoActualizarTipoInven);	
		this.jInternalFrameDetalleFormTipoInven.jButtonActualizarTipoInven.setVisible(this.isPermisoActualizarTipoInven);	
		this.jInternalFrameDetalleFormTipoInven.jButtonEliminarTipoInven.setVisible(this.isPermisoEliminarTipoInven);
		this.jInternalFrameDetalleFormTipoInven.jButtonCancelarTipoInven.setVisible(this.isVisibilidadCeldaCancelarTipoInven);							
		this.jInternalFrameDetalleFormTipoInven.jButtonGuardarCambiosTipoInven.setVisible((this.isVisibilidadCeldaGuardarTipoInven && this.isPermisoGuardarCambiosTipoInven));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoInven() {
		if(TipoInvenJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoInven();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoInven() {
	}
	
	public void jTableDatosTipoInvenListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoInven(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoInven(this.gettipoinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoInven(this.tipoinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoinven =(TipoInven) this.tipoinvenLogic.getTipoInvens().toArray()[this.jTableDatosTipoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoinven =(TipoInven) this.tipoinvens.toArray()[this.jTableDatosTipoInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoinven==null) {
						this.tipoinven = new TipoInven();
					}

					this.setVariablesFormularioToObjetoActualTipoInven(this.tipoinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoInven(this.tipoinven);
				}

				if(this.tipoinven.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipoinven.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTipoInvenUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinvenLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTipoInven(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoInven.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoInven.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoInven.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinven =(TipoInven) this.tipoinvenLogic.getTipoInvens().toArray()[this.jTableDatosTipoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoinven =(TipoInven) this.tipoinvens.toArray()[this.jTableDatosTipoInven.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoInven(this.gettipoinven(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoInven(this.tipoinven);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tipoinvenLogic.getConnexion());

				if(this.tipoinven.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tipoinven.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoInven=(TitledBorder)this.jScrollPanelDatosTipoInven.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTipoInven.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinvenLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinvenLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTipoInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoInven(this.gettipoinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoInven(this.tipoinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoinven =(TipoInven) this.tipoinvenLogic.getTipoInvens().toArray()[this.jTableDatosTipoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoinven =(TipoInven) this.tipoinvens.toArray()[this.jTableDatosTipoInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoinven==null) {
						this.tipoinven = new TipoInven();
					}

					this.setVariablesFormularioToObjetoActualTipoInven(this.tipoinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoInven(this.tipoinven);
				}

				if(this.tipoinven.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tipoinven.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoInven(this.gettipoinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoInven(this.tipoinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoinven =(TipoInven) this.tipoinvenLogic.getTipoInvens().toArray()[this.jTableDatosTipoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoinven =(TipoInven) this.tipoinvens.toArray()[this.jTableDatosTipoInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoinven==null) {
						this.tipoinven = new TipoInven();
					}

					this.setVariablesFormularioToObjetoActualTipoInven(this.tipoinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoInven(this.tipoinven);
				}

				if(this.tipoinven.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipoinven.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoInven(this.gettipoinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoInven(this.tipoinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoinven =(TipoInven) this.tipoinvenLogic.getTipoInvens().toArray()[this.jTableDatosTipoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoinven =(TipoInven) this.tipoinvens.toArray()[this.jTableDatosTipoInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoinven==null) {
						this.tipoinven = new TipoInven();
					}

					this.setVariablesFormularioToObjetoActualTipoInven(this.tipoinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoInven(this.tipoinven);
				}

				if(this.tipoinven.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipoinven.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaTipoInvenActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinvenLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoInven(false,false);

			this.getTipoInvensFK_IdEmpresa();

			this.inicializarActualizarBindingTipoInven(false);

			//if(TipoInvenBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoInven(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinvenLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinvenLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoInven() {
		if(this.jInternalFrameDetalleFormTipoInven!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoInven!=null) {
			this.jInternalFrameDetalleFormTipoInven.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoInven.dispose();
			this.jInternalFrameDetalleFormTipoInven=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoInven!=null) {
			this.jInternalFrameReporteDinamicoTipoInven.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoInven.dispose();
			this.jInternalFrameReporteDinamicoTipoInven=null;
		}
		
		if(this.jInternalFrameImportacionTipoInven!=null) {
			this.jInternalFrameImportacionTipoInven.setVisible(false);	    			
			this.jInternalFrameImportacionTipoInven.dispose();
			this.jInternalFrameImportacionTipoInven=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoInven();
			
			TipoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoinven,new Object(),this.tipoinvenParameterGeneral,this.tipoinvenReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoInven")) {
				jButtonNuevoTipoInvenActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoInven")) {
				jButtonDuplicarTipoInvenActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoInven")) {
				jButtonCopiarTipoInvenActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoInven")) {
				jButtonVerFormTipoInvenActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoInven")) {
				jButtonNuevoTipoInvenActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoInven")) {
				jButtonDuplicarTipoInvenActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoInven")) {
				jButtonNuevoTipoInvenActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoInven")) {
				jButtonDuplicarTipoInvenActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoInven")) {
				jButtonNuevoTipoInvenActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoInven")) {
				jButtonNuevoTipoInvenActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoInven")) {
				jButtonNuevoTipoInvenActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoInven")) {
				jButtonModificarTipoInvenActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoInven")) {
				jButtonModificarTipoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoInven")) {
				jButtonModificarTipoInvenActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoInven")) {
				jButtonActualizarTipoInvenActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoInven")) {
				jButtonActualizarTipoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoInven")) {
				jButtonActualizarTipoInvenActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoInven")) {
				jButtonEliminarTipoInvenActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoInven")) {
				jButtonEliminarTipoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoInven")) {
				jButtonEliminarTipoInvenActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoInven")) {
				jButtonCancelarTipoInvenActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoInven")) {
				jButtonCancelarTipoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoInven")) {
				jButtonCancelarTipoInvenActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoInven")) {
				jButtonCerrarTipoInvenActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoInven")) {
				jButtonCerrarTipoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoInven")) {
				jButtonCerrarTipoInvenActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoInven")) {
				jButtonMostrarOcultarTipoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoInven")) {
				jButtonCancelarTipoInvenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoInven")) {
				jButtonGuardarCambiosTipoInvenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoInven")) {
				jButtonGuardarCambiosTipoInvenActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoInven")) {
				jButtonCopiarTipoInvenActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoInven")) {
				jButtonVerFormTipoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoInven")) {
				jButtonGuardarCambiosTipoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoInven")) {
				jButtonCopiarTipoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoInven")) {
				jButtonVerFormTipoInvenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoInven")) {
				jButtonGuardarCambiosTipoInvenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoInven")) {
				jButtonGuardarCambiosTipoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoInven")) {
				jButtonGuardarCambiosTipoInvenActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoInven")) {
				jButtonRecargarInformacionTipoInvenActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoInven")) {
				jButtonRecargarInformacionTipoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoInven")) {
				jButtonRecargarInformacionTipoInvenActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoInven")) {
				jButtonAnterioresTipoInvenActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoInven")) {
				jButtonAnterioresTipoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoInven")) {
				jButtonAnterioresTipoInvenActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoInven")) {
				jButtonSiguientesTipoInvenActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoInven")) {
				jButtonSiguientesTipoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoInven")) {
				jButtonSiguientesTipoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoInven") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoInven")) {
				jButtonAbrirOrderByTipoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoInven") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoInven")) {
				jButtonMostrarOcultarTipoInvenActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoInven")) {
				jButtonNuevoGuardarCambiosTipoInvenActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoInven")) {
				jButtonNuevoGuardarCambiosTipoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoInven")) {
				jButtonNuevoGuardarCambiosTipoInvenActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoInven")) {
				jButtonCerrarReporteDinamicoTipoInvenActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoInven")) {
				jButtonGenerarReporteDinamicoTipoInvenActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoInven")) {
				
				jButtonGenerarExcelReporteDinamicoTipoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoInven")) {
				jButtonCerrarImportacionTipoInvenActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoInven")) {
				
				jButtonGenerarImportacionTipoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoInven")) {
				
				jButtonAbrirImportacionTipoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoInven")) {
				jComboBoxTiposAccionesTipoInvenActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoInven")) {
				jComboBoxTiposRelacionesTipoInvenActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoInven")) {
				jComboBoxTiposAccionesTipoInvenActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoInven")) {
				
				jComboBoxTiposSeleccionarTipoInvenActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoInven")) {
				jTextFieldValorCampoGeneralTipoInvenActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoInven")) {
				jButtonAbrirOrderByTipoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoInven")) {
				jButtonAbrirOrderByTipoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoInven")) {
				jButtonCerrarOrderByTipoInvenActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoInvenBusqueda")) {
				this.jButtonidTipoInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoInvenUpdate")) {
				this.jButtonid_empresaTipoInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoInvenBusqueda")) {
				this.jButtonid_empresaTipoInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoInvenBusqueda")) {
				this.jButtoncodigoTipoInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoInvenBusqueda")) {
				this.jButtonnombreTipoInvenBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoinven,new Object(),this.tipoinvenParameterGeneral,this.tipoinvenReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoInven();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoInvenActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoinven);
				
				TipoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinven,new Object(),this.tipoinvenParameterGeneral,this.tipoinvenReturnGeneral);
				
				


				
				TipoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinven,new Object(),this.tipoinvenParameterGeneral,this.tipoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoInven tipoinvenLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipoinvenLocal=this.tipoinven;
			} else {
				tipoinvenLocal=this.tipoinvenAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoinven);
				
				TipoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinven,new Object(),this.tipoinvenParameterGeneral,this.tipoinvenReturnGeneral);
							
				
				


				
				TipoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinven,new Object(),this.tipoinvenParameterGeneral,this.tipoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoInvenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinvenAnterior =(TipoInven) this.tipoinvenLogic.getTipoInvens().toArray()[this.jTableDatosTipoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoinvenAnterior =(TipoInven) this.tipoinvens.toArray()[this.jTableDatosTipoInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
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
			
			TipoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinven,new Object(),this.tipoinvenParameterGeneral,this.tipoinvenReturnGeneral);
			
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
			
			


			
			TipoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinven,new Object(),this.tipoinvenParameterGeneral,this.tipoinvenReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoInvenActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoinven);
				
				TipoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinven,new Object(),this.tipoinvenParameterGeneral,this.tipoinvenReturnGeneral);
								
						
				


				
				TipoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinven,new Object(),this.tipoinvenParameterGeneral,this.tipoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoInven.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoinven);
				
				TipoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinven,new Object(),this.tipoinvenParameterGeneral,this.tipoinvenReturnGeneral);
								
				
				


				
				TipoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinven,new Object(),this.tipoinvenParameterGeneral,this.tipoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoInvenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinvenAnterior =(TipoInven) this.tipoinvenLogic.getTipoInvens().toArray()[this.jTableDatosTipoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoinvenAnterior =(TipoInven) this.tipoinvens.toArray()[this.jTableDatosTipoInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoinven);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoInvenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinvenAnterior =(TipoInven) this.tipoinvenLogic.getTipoInvens().toArray()[this.jTableDatosTipoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoinvenAnterior =(TipoInven) this.tipoinvens.toArray()[this.jTableDatosTipoInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoInvenActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoinven);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoinven);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoinven);
				
				TipoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinven,new Object(),this.tipoinvenParameterGeneral,this.tipoinvenReturnGeneral);
							
				
				


				
				TipoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinven,new Object(),this.tipoinvenParameterGeneral,this.tipoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoInven.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoInvenActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoInven.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoinvenAnterior =(TipoInven) this.tipoinvenLogic.getTipoInvens().toArray()[this.jTableDatosTipoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoinvenAnterior =(TipoInven) this.tipoinvens.toArray()[this.jTableDatosTipoInven.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
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
			
			TipoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinven,new Object(),this.tipoinvenParameterGeneral,this.tipoinvenReturnGeneral);
			
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
			
			


			
			TipoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinven,new Object(),this.tipoinvenParameterGeneral,this.tipoinvenReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoInvenActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoinven);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoinven);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoinven);
				
				TipoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinven,new Object(),this.tipoinvenParameterGeneral,this.tipoinvenReturnGeneral);
								
				
				


				
				TipoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinven,new Object(),this.tipoinvenParameterGeneral,this.tipoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoInvenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinvenAnterior =(TipoInven) this.tipoinvenLogic.getTipoInvens().toArray()[this.jTableDatosTipoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoinvenAnterior =(TipoInven) this.tipoinvens.toArray()[this.jTableDatosTipoInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoInvenActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoinven);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoinven);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoInvenActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoinven);
				
				TipoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoinven,new Object(),this.tipoinvenParameterGeneral,this.tipoinvenReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoInven")) {
					jCheckBoxSeleccionarTodosTipoInvenItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoInven")) {
					jCheckBoxSeleccionadosTipoInvenItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoInven")) {
					
				}
				
				


				
				
				TipoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoinven,new Object(),this.tipoinvenParameterGeneral,this.tipoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoinven);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipoinven);
				
				TipoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoinven,new Object(),this.tipoinvenParameterGeneral,this.tipoinvenReturnGeneral);
												
				
				


				
				
				TipoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoinven,new Object(),this.tipoinvenParameterGeneral,this.tipoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoInvenActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoInven.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoinvenAnterior =(TipoInven) this.tipoinvenLogic.getTipoInvens().toArray()[this.jTableDatosTipoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoinvenAnterior =(TipoInven) this.tipoinvens.toArray()[this.jTableDatosTipoInven.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoInvenActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoinven);
				
				TipoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoinven,new Object(),this.tipoinvenParameterGeneral,this.tipoinvenReturnGeneral);
				
				
				TipoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoinven,new Object(),this.tipoinvenParameterGeneral,this.tipoinvenReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
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
			
			TipoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoinven,new Object(),this.tipoinvenParameterGeneral,this.tipoinvenReturnGeneral);
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
			
			


			
			TipoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinven,new Object(),this.tipoinvenParameterGeneral,this.tipoinvenReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoInvenActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoinven);
				
				TipoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoinven,new Object(),this.tipoinvenParameterGeneral,this.tipoinvenReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinven,new Object(),this.tipoinvenParameterGeneral,this.tipoinvenReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoInven.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoInven.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoinven);
				
				TipoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoinven,new Object(),this.tipoinvenParameterGeneral,this.tipoinvenReturnGeneral);
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
				
				


				
				TipoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinven,new Object(),this.tipoinvenParameterGeneral,this.tipoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoInven.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoInvenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinvenAnterior =(TipoInven) this.tipoinvenLogic.getTipoInvens().toArray()[this.jTableDatosTipoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoinvenAnterior =(TipoInven) this.tipoinvens.toArray()[this.jTableDatosTipoInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinven,new Object(),this.tipoinvenParameterGeneral,this.tipoinvenReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoInven")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoInvenListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoInven.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipoinven =(TipoInven) this.tipoinvenLogic.getTipoInvens().toArray()[this.jTableDatosTipoInven.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipoinven =(TipoInven) this.tipoinvens.toArray()[this.jTableDatosTipoInven.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipoinven);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoInven")) {
				
				}
				
				TipoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinven,new Object(),this.tipoinvenParameterGeneral,this.tipoinvenReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoinven,new Object(),this.tipoinvenParameterGeneral,this.tipoinvenReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoInven")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoInven.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoInven")) {
			
			}
			
			TipoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoinven,new Object(),this.tipoinvenParameterGeneral,this.tipoinvenReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoInven();
			
			TipoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoinven,new Object(),this.tipoinvenParameterGeneral,this.tipoinvenReturnGeneral);
			
			if(sTipo.equals("NuevoTipoInven")) {
				jButtonNuevoTipoInvenActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoInven")) {
				jButtonDuplicarTipoInvenActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoInven")) {
				jButtonCopiarTipoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoInven")) {
				jButtonVerFormTipoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoInven")) {
				jButtonNuevoTipoInvenActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoInven")) {
				jButtonModificarTipoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoInven")) {
				jButtonActualizarTipoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoInven")) {
				jButtonEliminarTipoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoInven")) {
				jButtonGuardarCambiosTipoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoInven")) {
				jButtonCancelarTipoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoInven")) {
				jButtonCerrarTipoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoInven")) {
				jButtonGuardarCambiosTipoInvenActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoInven")) {
				jButtonNuevoGuardarCambiosTipoInvenActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoInven")) {
				jButtonAbrirOrderByTipoInvenActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoInven")) {
				jButtonRecargarInformacionTipoInvenActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoInven")) {
				jButtonAnterioresTipoInvenActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoInven")) {
				jButtonSiguientesTipoInvenActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoInvenBusqueda")) {
				this.jButtonidTipoInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoInvenUpdate")) {
				this.jButtonid_empresaTipoInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoInvenBusqueda")) {
				this.jButtonid_empresaTipoInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoInvenBusqueda")) {
				this.jButtoncodigoTipoInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoInvenBusqueda")) {
				this.jButtonnombreTipoInvenBusquedaActionPerformed(evt);
			}
			
			TipoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoinven,new Object(),this.tipoinvenParameterGeneral,this.tipoinvenReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoInven();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoinven,new Object(),this.tipoinvenParameterGeneral,this.tipoinvenReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoInven")) {
				closingInternalFrameTipoInven();
				
			} else if(sTipo.equals("jButtonCancelarTipoInven")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoInven = (JInternalFrameBase)evt.getSource();
	            	
	            TipoInvenBeanSwingJInternalFrame jInternalFrameParent=(TipoInvenBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoInven.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoInvenActionPerformed(null);
			}
			
			TipoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoinven,new Object(),this.tipoinvenParameterGeneral,this.tipoinvenReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoInven(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoInven(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoInven(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipoinven)) {
			if(!esControlTabla) {
				if(TipoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoInven(this.tipoinven,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoInven(this.tipoinven);			
				}
				
				if(this.tipoinvenSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoInven(this.tipoinven,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoinvenReturnGeneral=tipoinvenLogic.procesarEventosTipoInvensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoinvenLogic.getTipoInvens(),this.tipoinven,this.tipoinvenParameterGeneral,this.isEsNuevoTipoInven,classes);//this.tipoinvenLogic.getTipoInven()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoInven(this.tipoinvenReturnGeneral,this.tipoinvenBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipoinvenSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoInven(classes,this.tipoinvenReturnGeneral,this.tipoinvenBean,false);
					}
						
					if(this.tipoinvenReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoInven(this.tipoinvenReturnGeneral.getTipoInven());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoInven(this.tipoinvenReturnGeneral.getTipoInven());	
					}
						
					if(this.tipoinvenReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoInven(this.tipoinvenReturnGeneral.getTipoInven(),classes);//this.tipoinvenBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoInven(this.tipoinven,classes);//this.tipoinvenBean);									
				}
			
				if(TipoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoInven(this.tipoinven,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoInven(this.tipoinven);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipoinvenAnterior!=null) {
						this.tipoinven=this.tipoinvenAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoinvenReturnGeneral=tipoinvenLogic.procesarEventosTipoInvensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoinvenLogic.getTipoInvens(),this.tipoinven,this.tipoinvenParameterGeneral,this.isEsNuevoTipoInven,classes);//this.tipoinvenLogic.getTipoInven()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoinvenSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoinvenSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipoinvenReturnGeneral.getTipoInven(),tipoinvenLogic.getTipoInvens());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipoinvenReturnGeneral.getTipoInven(),this.tipoinvens);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoInven.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoInven.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoInven();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoInven() throws Exception {
		
		TipoInvenModel tipoinvenModel=(TipoInvenModel)this.jTableDatosTipoInven.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoinvenModel.tipoinvens=this.tipoinvenLogic.getTipoInvens();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipoinvenModel.tipoinvens=this.tipoinvens;
		}
		
		
		((TipoInvenModel) this.jTableDatosTipoInven.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoInven() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipoinvenAnterior(),this.tipoinvenLogic.getTipoInvens());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipoinvenAnterior(),this.tipoinvens);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoInven();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoInven(TipoInven tipoinven,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
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
										
				TipoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoinven,new Object(),generalEntityParameterGeneral,this.tipoinvenReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipoinvenSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoInvenConstantesFunciones.getClassesRelationshipsOfTipoInven(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoInvenConstantesFunciones.getClassesRelationshipsFromStringsOfTipoInven(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoInven(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoinven,new Object(),generalEntityParameterGeneral,this.tipoinvenReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoInven(TipoInvenBean tipoinvenBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoInven(ArrayList<Classe> classes,TipoInvenReturnGeneral tipoinvenReturnGeneral,TipoInvenBean tipoinvenBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoInven(TipoInven tipoinven,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipoinven)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoInven = new TipoInvenDetalleFormJInternalFrame(jDesktopPane,this.tipoinvenSessionBean.getConGuardarRelaciones(),this.tipoinvenSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoInven);
		this.jInternalFrameDetalleFormTipoInven.setVisible(false);
		this.jInternalFrameDetalleFormTipoInven.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoInven.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoInven.tipoinvenLogic=this.tipoinvenLogic;
		
		this.cargarCombosFrameForeignKeyTipoInven("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoInven();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoInven();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoInven("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoInven();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoInven.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoInven"));
		
		this.jInternalFrameDetalleFormTipoInven.jButtonModificarTipoInven.addActionListener(new ButtonActionListener(this,"ModificarTipoInven"));

		
		this.jInternalFrameDetalleFormTipoInven.jButtonModificarToolBarTipoInven.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoInven"));
					
		this.jInternalFrameDetalleFormTipoInven.jMenuItemModificarTipoInven.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoInven"));		
		
		
		
		this.jInternalFrameDetalleFormTipoInven.jButtonActualizarTipoInven.addActionListener (new ButtonActionListener(this,"ActualizarTipoInven"));
		
		
		this.jInternalFrameDetalleFormTipoInven.jButtonActualizarToolBarTipoInven.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoInven"));
						
		this.jInternalFrameDetalleFormTipoInven.jMenuItemActualizarTipoInven.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoInven"));		
		
		
		
		this.jInternalFrameDetalleFormTipoInven.jButtonEliminarTipoInven.addActionListener (new ButtonActionListener(this,"EliminarTipoInven"));
		
		
		this.jInternalFrameDetalleFormTipoInven.jButtonEliminarToolBarTipoInven.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoInven"));
								
		this.jInternalFrameDetalleFormTipoInven.jMenuItemEliminarTipoInven.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoInven"));		
		
		
		
		this.jInternalFrameDetalleFormTipoInven.jButtonCancelarTipoInven.addActionListener (new ButtonActionListener(this,"CancelarTipoInven"));
		
		
		this.jInternalFrameDetalleFormTipoInven.jButtonCancelarToolBarTipoInven.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoInven"));
					
		this.jInternalFrameDetalleFormTipoInven.jMenuItemCancelarTipoInven.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoInven"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoInven.jMenuItemDetalleCerrarTipoInven.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoInven"));		
		
		
		
		this.jInternalFrameDetalleFormTipoInven.jButtonGuardarCambiosToolBarTipoInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoInven"));
		
		
		
		this.jInternalFrameDetalleFormTipoInven.jButtonGuardarCambiosToolBarTipoInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoInven"));
		
		
		
		this.jInternalFrameDetalleFormTipoInven.jComboBoxTiposAccionesFormularioTipoInven.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoInven"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoInven.jButtonidTipoInvenBusqueda.addActionListener(new ButtonActionListener(this,"idTipoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoInven.jButtonid_empresaTipoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoInven.jButtonid_empresaTipoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoInven.jButtoncodigoTipoInvenBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoInven.jButtonnombreTipoInvenBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoInvenBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoInven.jTabbedPaneRelacionesTipoInven.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoInven"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoInven"));
		
		if(this.jInternalFrameDetalleFormTipoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoInven.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoInven"));
		}
		
		this.jTableDatosTipoInven.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoInven"));
		
		this.jTableDatosTipoInven.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoInven"));
		
		this.jButtonNuevoTipoInven.addActionListener(new ButtonActionListener(this,"NuevoTipoInven"));
		
		this.jButtonDuplicarTipoInven.addActionListener(new ButtonActionListener(this,"DuplicarTipoInven"));
		
		this.jButtonCopiarTipoInven.addActionListener(new ButtonActionListener(this,"CopiarTipoInven"));
		
		this.jButtonVerFormTipoInven.addActionListener(new ButtonActionListener(this,"VerFormTipoInven"));
		
		
		this.jButtonNuevoToolBarTipoInven.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoInven"));
			
		this.jButtonDuplicarToolBarTipoInven.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoInven"));
			
		this.jMenuItemNuevoTipoInven.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoInven"));
			
		this.jMenuItemDuplicarTipoInven.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoInven"));		
		
		
		this.jButtonNuevoRelacionesTipoInven.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoInven"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoInven.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoInven"));
			
		this.jMenuItemNuevoRelacionesTipoInven.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoInven"));		
		
		
		if(this.jInternalFrameDetalleFormTipoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoInven.jButtonModificarTipoInven.addActionListener(new ButtonActionListener(this,"ModificarTipoInven"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoInven.jButtonModificarToolBarTipoInven.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoInven"));
			
			this.jInternalFrameDetalleFormTipoInven.jMenuItemModificarTipoInven.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoInven"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoInven!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoInven.jButtonActualizarTipoInven.addActionListener (new ButtonActionListener(this,"ActualizarTipoInven"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoInven.jButtonActualizarToolBarTipoInven.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoInven"));
				
			this.jInternalFrameDetalleFormTipoInven.jMenuItemActualizarTipoInven.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoInven"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoInven.jButtonEliminarTipoInven.addActionListener (new ButtonActionListener(this,"EliminarTipoInven"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoInven.jButtonEliminarToolBarTipoInven.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoInven"));
						
			this.jInternalFrameDetalleFormTipoInven.jMenuItemEliminarTipoInven.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoInven"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoInven.jButtonCancelarTipoInven.addActionListener (new ButtonActionListener(this,"CancelarTipoInven"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoInven.jButtonCancelarToolBarTipoInven.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoInven"));
			
			this.jInternalFrameDetalleFormTipoInven.jMenuItemCancelarTipoInven.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoInven"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoInven.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoInven"));		
		
		
		this.jButtonCerrarTipoInven.addActionListener (new ButtonActionListener(this,"CerrarTipoInven"));
		
		
		this.jButtonCerrarToolBarTipoInven.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoInven"));
			
		this.jMenuItemCerrarTipoInven.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoInven"));
			
		if(this.jInternalFrameDetalleFormTipoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoInven.jMenuItemDetalleCerrarTipoInven.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoInven"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoInven.jButtonGuardarCambiosTipoInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoInven"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoInven.jButtonGuardarCambiosToolBarTipoInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoInven"));
		}
		
		this.jButtonCopiarToolBarTipoInven.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoInven"));
			
		this.jButtonVerFormToolBarTipoInven.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoInven"));
		
		this.jMenuItemGuardarCambiosTipoInven.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoInven"));
			
		this.jMenuItemCopiarTipoInven.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoInven"));		
		
		this.jMenuItemVerFormTipoInven.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoInven"));		
		
		
		this.jButtonGuardarCambiosTablaTipoInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoInven"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoInven"));
			
		this.jMenuItemGuardarCambiosTablaTipoInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoInven"));		
		
		
		
		this.jButtonRecargarInformacionTipoInven.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoInven"));
					
		this.jButtonRecargarInformacionToolBarTipoInven.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoInven"));
		
		this.jMenuItemRecargarInformacionTipoInven.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoInven"));		
		
		
		
		this.jButtonAnterioresTipoInven.addActionListener (new ButtonActionListener(this,"AnterioresTipoInven"));
		
		
		this.jButtonAnterioresToolBarTipoInven.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoInven"));
		
		this.jMenuItemAnterioresTipoInven.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoInven"));		
		
		
		this.jButtonSiguientesTipoInven.addActionListener (new ButtonActionListener(this,"SiguientesTipoInven"));
		
		
		this.jButtonSiguientesToolBarTipoInven.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoInven"));
			
		this.jMenuItemSiguientesTipoInven.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoInven"));
			
		this.jMenuItemAbrirOrderByTipoInven.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoInven"));
			
		this.jMenuItemMostrarOcultarTipoInven.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoInven"));
			
		this.jMenuItemDetalleAbrirOrderByTipoInven.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoInven"));
			
		this.jMenuItemDetalleMostarOcultarTipoInven.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoInven"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoInven.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoInven"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoInven.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoInven"));
			
		this.jMenuItemNuevoGuardarCambiosTipoInven.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoInven"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoInven.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoInven"));

		this.jCheckBoxSeleccionadosTipoInven.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoInven"));
		
		if(this.jInternalFrameDetalleFormTipoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoInven.jComboBoxTiposAccionesFormularioTipoInven.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoInven"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoInven.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoInven"));
			
		this.jComboBoxTiposAccionesTipoInven.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoInven"));
					
		this.jComboBoxTiposSeleccionarTipoInven.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoInven"));
			
		this.jTextFieldValorCampoGeneralTipoInven.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoInven"));		
		
		
		if(this.jInternalFrameDetalleFormTipoInven!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoInven.jButtonidTipoInvenBusqueda.addActionListener(new ButtonActionListener(this,"idTipoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoInven.jButtonid_empresaTipoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoInven.jButtonid_empresaTipoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoInven.jButtoncodigoTipoInvenBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoInven.jButtonnombreTipoInvenBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoInvenBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoInven!=null) {
				this.jInternalFrameReporteDinamicoTipoInven.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoInven"));
				this.jInternalFrameReporteDinamicoTipoInven.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoInven"));
				this.jInternalFrameReporteDinamicoTipoInven.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoInven"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoInven.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoInven"));				
			//this.jButtonGenerarReporteDinamicoTipoInven.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoInven"));
			//this.jButtonGenerarExcelReporteDinamicoTipoInven.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoInven"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoInven!=null) {
				this.jInternalFrameImportacionTipoInven.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoInven"));
				this.jInternalFrameImportacionTipoInven.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoInven"));
				this.jInternalFrameImportacionTipoInven.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoInven"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoInven.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoInven"));
			
			this.jButtonAbrirOrderByToolBarTipoInven.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoInven"));			
			
			if(this.jInternalFrameOrderByTipoInven!=null) {
				this.jInternalFrameOrderByTipoInven.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoInven"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoInven!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoInven.jTabbedPaneRelacionesTipoInven.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoInven"));
		
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
            		closingInternalFrameTipoInven();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoInven.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoInven = (JInternalFrameBase)event.getSource();
	            	
	            TipoInvenBeanSwingJInternalFrame jInternalFrameParent=(TipoInvenBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoInven.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoInvenActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoInven.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoInvenListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoInven.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoInven.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoInvenActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoInvenActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoInvenActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoInven";
		inputMap = this.jButtonNuevoTipoInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoInvenActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoInvenActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoInvenActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoInvenActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoInven";
		inputMap = this.jButtonNuevoRelacionesTipoInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoInvenActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoInven";
		inputMap = this.jButtonModificarTipoInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoInven";
		inputMap = this.jButtonActualizarTipoInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoInven";
		inputMap = this.jButtonEliminarTipoInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoInven";
		inputMap = this.jButtonCancelarTipoInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoInven";
		inputMap = this.jButtonCerrarTipoInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoInven.jButtonGuardarCambiosTipoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoInven";
		inputMap = this.jInternalFrameDetalleFormTipoInven.jButtonGuardarCambiosTipoInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoInven.jButtonGuardarCambiosTipoInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoInven.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoInvenItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoInven.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoInvenActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoInven.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoInvenActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoInven.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoInvenActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoInven.jButtonidTipoInvenBusqueda.addActionListener(new ButtonActionListener(this,"idTipoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoInven.jButtonid_empresaTipoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoInven.jButtonid_empresaTipoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoInven.jButtoncodigoTipoInvenBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoInven.jButtonnombreTipoInvenBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoInvenBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoInvenActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoInven.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoInven(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoInven tipoinvenAux:this.tipoinvenLogic.getTipoInvens()) {
					tipoinvenAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoInven tipoinvenAux:tipoinvens) {
					tipoinvenAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoInvenItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoInven(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoInven tipoinvenAux:this.tipoinvenLogic.getTipoInvens()) {
						tipoinvenAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoInven tipoinvenAux:tipoinvens) {
						tipoinvenAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoInven tipoinvenAux:this.tipoinvenLogic.getTipoInvens()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoInven tipoinvenAux:tipoinvens) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoInven(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoInven.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoInven.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoInven,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoInvenItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoInven(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoInven.getSelectedRows();
			
			TipoInven tipoinvenLocal=new TipoInven();
			
			//this.seleccionarTodosTipoInven(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoinvenLocal =(TipoInven) this.tipoinvenLogic.getTipoInvens().toArray()[this.jTableDatosTipoInven.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipoinvenLocal =(TipoInven) this.tipoinvens.toArray()[this.jTableDatosTipoInven.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipoinvenLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoInven tipoinvenAux:this.tipoinvenLogic.getTipoInvens()) {
						tipoinvenAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoInven tipoinvenAux:tipoinvens) {
						tipoinvenAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoInven(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoInven.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoInven.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoInven,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoInvenItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoInvenParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoInvenActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoInven(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoInven.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoInven tipoinvenAux:this.tipoinvenLogic.getTipoInvens()) {
				
						if(sTipoSeleccionar.equals(TipoInvenConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoinvenAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoInvenConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoinvenAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoInven tipoinvenAux:tipoinvens) {
					
						if(sTipoSeleccionar.equals(TipoInvenConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoinvenAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoInvenConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoinvenAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoInven(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoInvenActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoInven(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoInven=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoInven.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoInven.jComboBoxTiposAccionesFormularioTipoInven.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoInven) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoInven(conSplash);
				
					this.generarReporteTipoInvensSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoInven.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoInven.jComboBoxTiposAccionesFormularioTipoInven.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoInvensSeleccionados();
				//this.jComboBoxTiposAccionesTipoInven.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoInvensSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoInven.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoInvensSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoInven.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoInven();
				
				this.exportarTipoInvensSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoInven.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoInven.jComboBoxTiposAccionesFormularioTipoInven.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoInvens();
				//this.importarTipoInvens();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoInven.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoInven.jComboBoxTiposAccionesFormularioTipoInven.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoInven();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoInvensSeleccionados();
				//this.jComboBoxTiposAccionesTipoInven.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Inven", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoInven();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoInven)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoInven(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Inven",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoInven.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoInven.jComboBoxTiposAccionesFormularioTipoInven.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoInvenBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoInven) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoInven(conSplash);
					
						//this.actualizarParametrosGeneralTipoInven();
						
						this.generarReporteProcesoAccionTipoInvensSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoInven.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoInven.jComboBoxTiposAccionesFormularioTipoInven.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoInvenBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo InvenES SELECCIONADOS?", "MANTENIMIENTO DE Tipo Inven", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoInven();
				
						this.actualizarParametrosGeneralTipoInven();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tipoinvenReturnGeneral=tipoinvenLogic.procesarAccionTipoInvensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tipoinvenLogic.getTipoInvens(),this.tipoinvenParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoInvenReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoInven.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoInven.jComboBoxTiposAccionesFormularioTipoInven.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoInven();
					
					TipoInvenBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoInvenReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoInven.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoInven.jComboBoxTiposAccionesFormularioTipoInven.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoInven(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoInvenActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoInven();
			
			if(this.jInternalFrameDetalleFormTipoInven==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoInven> tipoinvensSeleccionados=new ArrayList<TipoInven>();		
			TipoInven tipoinven=new TipoInven();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoInven(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoInven.getSelectedItem();
			
			
			
			
			tipoinvensSeleccionados=this.getTipoInvensSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipoinvensSeleccionados.size()==1) {
				for(TipoInven tipoinvenAux:tipoinvensSeleccionados) {
					tipoinven=tipoinvenAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoInven();
			
      		//this.finishProcessTipoInven(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoInvenReturnGeneral() throws Exception {
		if(this.tipoinvenReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipoinvenReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipoinvenReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipoinvenReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipoinvenReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipoinvenReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoInven(false);
		}
		
		if(this.tipoinvenReturnGeneral.getConRetornoLista() || this.tipoinvenReturnGeneral.getConRetornoObjeto()) {
			if(this.tipoinvenReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoinvenLogic.setTipoInvens(this.tipoinvenReturnGeneral.getTipoInvens());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipoinvenReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoinvenLogic.setTipoInven(this.tipoinvenReturnGeneral.getTipoInven());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoInven(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoInven() throws Exception {
		
		
	}
	
	public ArrayList<TipoInven> getTipoInvensSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoInven> tipoinvensSeleccionados=new ArrayList<TipoInven>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoInven) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoInven tipoinvenAux:tipoinvenLogic.getTipoInvens()) {
					if(tipoinvenAux.getIsSelected()) {
						tipoinvensSeleccionados.add(tipoinvenAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoInven tipoinvenAux:this.tipoinvens) {
					if(tipoinvenAux.getIsSelected()) {
						tipoinvensSeleccionados.add(tipoinvenAux);				
					}
				}
			}
			
			if(tipoinvensSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipoinvensSeleccionados.addAll(this.tipoinvenLogic.getTipoInvens());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipoinvensSeleccionados.addAll(this.tipoinvens);				
					}
				}
			}
		} else {
			tipoinvensSeleccionados.add(this.tipoinven);
		}
		
		return tipoinvensSeleccionados;
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
	
	public void generarReporteTipoInvensSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoInvensSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoInvensSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoInvensSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoInvensSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Inven",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoInvensSeleccionados() throws Exception {
		ArrayList<TipoInven> tipoinvensSeleccionados=new ArrayList<TipoInven>();		
		
		tipoinvensSeleccionados=this.getTipoInvensSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoInvens("Todos",tipoinvensSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoInvensSeleccionados() throws Exception {
		ArrayList<TipoInven> tipoinvensSeleccionados=new ArrayList<TipoInven>();		
		
		tipoinvensSeleccionados=this.getTipoInvensSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoInvens("Todos",tipoinvensSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoInvensSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoInven> tipoinvensSeleccionados=new ArrayList<TipoInven>();
		
		tipoinvensSeleccionados=this.getTipoInvensSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoInvens("Todos",tipoinvensSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoInvensSeleccionados() throws Exception {
		ArrayList<TipoInven> tipoinvensSeleccionados=new ArrayList<TipoInven>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoInven();
		
		
		tipoinvensSeleccionados=this.getTipoInvensSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoInven();
		
		
		//this.generarReporteTipoInvens("Todos",tipoinvensSeleccionados ,tipoinvenImplementable,tipoinvenImplementableHome);
	}
	
	public void mostrarImportacionTipoInvens() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoInven();
		
		this.abrirFrameImportacionTipoInven();		
		
			
		//this.generarReporteTipoInvens("Todos",tipoinvensSeleccionados ,tipoinvenImplementable,tipoinvenImplementableHome);
	}
	
	public void importarTipoInvens() throws Exception {		
	
	}
	
	public void exportarTipoInvensSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoInvensSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoInvensSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoInvensSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Inven",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoInvensSeleccionados() throws Exception {
		ArrayList<TipoInven> tipoinvensSeleccionados=new ArrayList<TipoInven>();		
		
		tipoinvensSeleccionados=this.getTipoInvensSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoinven."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoInven(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoInven tipoinvenAux:tipoinvensSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoInven(tipoinvenAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipoinvenAux.setsDetalleGeneralEntityReporte(tipoinvenAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Inven",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoInven(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoInvenConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoInvenConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoInvenConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoInvenConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoInvenConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoInven(TipoInven tipoinven,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipoinven.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoinven.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoinven.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoinven.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoinven.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoInvensSeleccionados() throws Exception {
		ArrayList<TipoInven> tipoinvensSeleccionados=new ArrayList<TipoInven>();		
		
		tipoinvensSeleccionados=this.getTipoInvensSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoinven.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoInvens");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoInven(row);				
				iRow++;
			}				
			
			for(TipoInven tipoinvenAux:tipoinvensSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoInven(tipoinvenAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Inven",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoInvensSeleccionados() throws Exception {
		ArrayList<TipoInven> tipoinvensSeleccionados=new ArrayList<TipoInven>();		
		
		tipoinvensSeleccionados=this.getTipoInvensSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoinven.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipoinvens");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipoinven");
			//elementRoot.appendChild(element);
		
			for(TipoInven tipoinvenAux:tipoinvensSeleccionados) {
				element = document.createElement("tipoinven");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoInven(tipoinvenAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Inven",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoInven(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoInvenConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoInvenConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoInvenConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoInvenConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoInvenConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoInven(TipoInven tipoinven,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipoinven.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoinven.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoinven.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoinven.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoInven(TipoInven tipoinven,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoInvenConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipoinven.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoInvenConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipoinven.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TipoInvenConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tipoinven.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo = document.createElement(TipoInvenConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipoinven.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoInvenConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipoinven.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoInvensSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoInven> tipoinvensSeleccionados=new ArrayList<TipoInven>();
		
		tipoinvensSeleccionados=this.getTipoInvensSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoInven(tipoinvensSeleccionados);
		
		this.generarReporteTipoInvens("Todos",tipoinvensSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoInven(ArrayList<TipoInven> tipoinvensSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoInven tipoinvenAux:tipoinvensSeleccionados) {
				tipoinvenAux.setsDetalleGeneralEntityReporte(tipoinvenAux.toString());
			
				if(sTipoSeleccionar.equals(TipoInvenConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tipoinvenAux.setsDescripcionGeneralEntityReporte1(tipoinvenAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoInvenConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipoinvenAux.setsDescripcionGeneralEntityReporte1(tipoinvenAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoInvenConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipoinvenAux.setsDescripcionGeneralEntityReporte1(tipoinvenAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoInven(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoInven=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoInven=true;
				this.isVisibilidadCeldaGuardarCambiosTipoInven=true;
			}
			
			this.isVisibilidadCeldaModificarTipoInven=false;
			this.isVisibilidadCeldaActualizarTipoInven=false;
			this.isVisibilidadCeldaEliminarTipoInven=false;
			this.isVisibilidadCeldaCancelarTipoInven=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoInven=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoInven=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoInven=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoInven=false;
			this.isVisibilidadCeldaGuardarCambiosTipoInven=false;
			this.isVisibilidadCeldaModificarTipoInven=false;
			this.isVisibilidadCeldaActualizarTipoInven=true;
			this.isVisibilidadCeldaEliminarTipoInven=false;
			this.isVisibilidadCeldaCancelarTipoInven=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoInven=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoInven=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoInven=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoInven=false;
			this.isVisibilidadCeldaGuardarCambiosTipoInven=false;
			this.isVisibilidadCeldaModificarTipoInven=false;
			this.isVisibilidadCeldaActualizarTipoInven=true;
			this.isVisibilidadCeldaEliminarTipoInven=true;
			this.isVisibilidadCeldaCancelarTipoInven=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoInven=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoInven=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoInven=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoInven=false;
			this.isVisibilidadCeldaGuardarCambiosTipoInven=false;
			this.isVisibilidadCeldaModificarTipoInven=false;
			this.isVisibilidadCeldaActualizarTipoInven=true;
			this.isVisibilidadCeldaEliminarTipoInven=false;
			this.isVisibilidadCeldaCancelarTipoInven=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoInven=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoInven=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoInven=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoInven=true;
			this.isVisibilidadCeldaGuardarCambiosTipoInven=true;
			this.isVisibilidadCeldaModificarTipoInven=false;
			this.isVisibilidadCeldaActualizarTipoInven=false;
			this.isVisibilidadCeldaEliminarTipoInven=false;
			this.isVisibilidadCeldaCancelarTipoInven=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoInven=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoInven=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoInven=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoInven=false;
			this.isVisibilidadCeldaGuardarCambiosTipoInven=false;
			this.isVisibilidadCeldaActualizarTipoInven=false;
			this.isVisibilidadCeldaEliminarTipoInven=false;
			this.isVisibilidadCeldaCancelarTipoInven=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoInven=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoInven=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoInven=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoInven=false;
			this.isVisibilidadCeldaGuardarCambiosTipoInven=false;
			this.isVisibilidadCeldaModificarTipoInven=true;
			this.isVisibilidadCeldaActualizarTipoInven=false;
			this.isVisibilidadCeldaEliminarTipoInven=false;
			this.isVisibilidadCeldaCancelarTipoInven=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoInven=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoInven=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoInvenJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoInven=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoInven=true;
			this.isVisibilidadCeldaGuardarCambiosTipoInven=true;
		} else {
			this.actualizarEstadoPanelsTipoInven(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoInven=false;
			//this.isVisibilidadCeldaVerFormTipoInven=false;
			this.isVisibilidadCeldaDuplicarTipoInven=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipoinvenSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoInven=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoInven=false;
			this.isVisibilidadCeldaGuardarCambiosTipoInven=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipoinvenSessionBean.getEsGuardarRelacionado()) {
			if(!tipoinvenSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoInven=false;												
			}
			
			this.jButtonCerrarTipoInven.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoInven=false;
		}
		
		if(!this.permiteMantenimiento(this.tipoinven)) {
			this.isVisibilidadCeldaActualizarTipoInven=false;
			this.isVisibilidadCeldaEliminarTipoInven=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoInven() {
	}
	
	public void actualizarEstadoPanelsTipoInven(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoInven!=null) {
				this.jScrollPanelDatosEdicionTipoInven.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoInven!=null) {
				this.jTabbedPaneBusquedasTipoInven.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoInven!=null) {
				this.jScrollPanelDatosTipoInven.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoInven!=null) {
				this.jPanelPaginacionTipoInven.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoInven!=null) {
				this.jPanelParametrosReportesTipoInven.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoInven!=null) {
				this.jScrollPanelDatosEdicionTipoInven.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoInven!=null) {
				this.jTabbedPaneBusquedasTipoInven.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoInven!=null) {
				this.jScrollPanelDatosTipoInven.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoInven!=null) {
				this.jPanelPaginacionTipoInven.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoInven!=null) {
				this.jPanelParametrosReportesTipoInven.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoInven!=null) {
				this.jScrollPanelDatosEdicionTipoInven.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoInven!=null) {
				this.jTabbedPaneBusquedasTipoInven.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoInven!=null) {
				this.jScrollPanelDatosTipoInven.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoInven!=null) {
				this.jPanelPaginacionTipoInven.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoInven!=null) {
				this.jPanelParametrosReportesTipoInven.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoInven!=null) {
				this.jScrollPanelDatosEdicionTipoInven.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoInven!=null) {
				this.jTabbedPaneBusquedasTipoInven.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoInven!=null) {
				this.jScrollPanelDatosTipoInven.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoInven!=null) {
				this.jPanelPaginacionTipoInven.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoInven!=null) {
				this.jPanelParametrosReportesTipoInven.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoInven!=null) {
				this.jScrollPanelDatosEdicionTipoInven.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoInven!=null) {
				this.jTabbedPaneBusquedasTipoInven.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoInven!=null) {
				this.jScrollPanelDatosTipoInven.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoInven!=null) {
				this.jPanelPaginacionTipoInven.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoInven!=null) {
				this.jPanelParametrosReportesTipoInven.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoInven!=null) {
				this.jScrollPanelDatosEdicionTipoInven.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoInven!=null) {
				this.jTabbedPaneBusquedasTipoInven.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoInven!=null) {
				this.jScrollPanelDatosTipoInven.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoInven!=null) {
				this.jPanelPaginacionTipoInven.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoInven!=null) {
				this.jPanelParametrosReportesTipoInven.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoInven!=null) {
				this.jScrollPanelDatosEdicionTipoInven.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoInven!=null) {
				this.jTabbedPaneBusquedasTipoInven.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoInven!=null) {
				this.jScrollPanelDatosTipoInven.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoInven!=null) {
				this.jPanelPaginacionTipoInven.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoInven!=null) {
				this.jPanelParametrosReportesTipoInven.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipoinvenSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoInven!=null) {
					this.jTabbedPaneBusquedasTipoInven.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoInven!=null) {
				this.jPanelParametrosReportesTipoInven.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipoinvenSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoInven!=null) {
				this.jTabbedPaneBusquedasTipoInven.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoInven!=null) {
				this.jPanelParametrosReportesTipoInven.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoInvenSessionBean tipoinvenSessionBean=new TipoInvenSessionBean();
		
		if(this.tipoinvenSessionBean==null) {
			this.tipoinvenSessionBean=new TipoInvenSessionBean();
		}
		
		this.tipoinvenSessionBean.setsUltimaBusquedaTipoInven(this.getsAccionBusqueda());
		this.tipoinvenSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipoinvenSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tipoinvenSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoInvenSessionBean tipoinvenSessionBean=new TipoInvenSessionBean();
		
		if(this.tipoinvenSessionBean==null) {
			this.tipoinvenSessionBean=new TipoInvenSessionBean();
		}
		
		if(this.tipoinvenSessionBean.getsUltimaBusquedaTipoInven()!=null&&!this.tipoinvenSessionBean.getsUltimaBusquedaTipoInven().equals("")) {
			this.setsAccionBusqueda(tipoinvenSessionBean.getsUltimaBusquedaTipoInven());
			this.setiNumeroPaginacion(tipoinvenSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipoinvenSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tipoinvenSessionBean.getid_empresa());
				tipoinvenSessionBean.setid_empresa(-1L);
			}
		}
		
		this.tipoinvenSessionBean.setsUltimaBusquedaTipoInven("");
		this.tipoinvenSessionBean.setiNumeroPaginacion(TipoInvenConstantesFunciones.INUMEROPAGINACION);
		this.tipoinvenSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoInven(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoInven() {
		this.updateBorderResaltarBusquedasFormularioTipoInven();
		this.updateVisibilidadBusquedasFormularioTipoInven();
		this.updateHabilitarBusquedasFormularioTipoInven();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoInven() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoInven.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoInven() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoInven.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoInven() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoInven.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoInven(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarTipoInven.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoInven() throws Exception {

		if(this.jInternalFrameDetalleFormTipoInven==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoInven();
		this.updateVisibilidadResaltarControlesFormularioTipoInven();
		this.updateHabilitarResaltarControlesFormularioTipoInven();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoInven() throws Exception {
		if(this.jInternalFrameDetalleFormTipoInven==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipoinvenConstantesFunciones.resaltaridTipoInven!=null && this.jInternalFrameDetalleFormTipoInven!=null) {this.jInternalFrameDetalleFormTipoInven.jLabelidTipoInven.setBorder(this.tipoinvenConstantesFunciones.resaltaridTipoInven);}
		if(this.tipoinvenConstantesFunciones.resaltarid_empresaTipoInven!=null && this.jInternalFrameDetalleFormTipoInven!=null) {this.jInternalFrameDetalleFormTipoInven.jComboBoxid_empresaTipoInven.setBorder(this.tipoinvenConstantesFunciones.resaltarid_empresaTipoInven);}
		if(this.tipoinvenConstantesFunciones.resaltarcodigoTipoInven!=null && this.jInternalFrameDetalleFormTipoInven!=null) {this.jInternalFrameDetalleFormTipoInven.jTextFieldcodigoTipoInven.setBorder(this.tipoinvenConstantesFunciones.resaltarcodigoTipoInven);}
		if(this.tipoinvenConstantesFunciones.resaltarnombreTipoInven!=null && this.jInternalFrameDetalleFormTipoInven!=null) {this.jInternalFrameDetalleFormTipoInven.jTextFieldnombreTipoInven.setBorder(this.tipoinvenConstantesFunciones.resaltarnombreTipoInven);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoInven() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoInven==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoInven!=null) {
	
		//this.jInternalFrameDetalleFormTipoInven.jLabelidTipoInven.setVisible(this.tipoinvenConstantesFunciones.mostraridTipoInven);
		this.jInternalFrameDetalleFormTipoInven.jPanelidTipoInven.setVisible(this.tipoinvenConstantesFunciones.mostraridTipoInven);
		//this.jInternalFrameDetalleFormTipoInven.jComboBoxid_empresaTipoInven.setVisible(this.tipoinvenConstantesFunciones.mostrarid_empresaTipoInven);
		this.jInternalFrameDetalleFormTipoInven.jPanelid_empresaTipoInven.setVisible(this.tipoinvenConstantesFunciones.mostrarid_empresaTipoInven);
		//this.jInternalFrameDetalleFormTipoInven.jTextFieldcodigoTipoInven.setVisible(this.tipoinvenConstantesFunciones.mostrarcodigoTipoInven);
		this.jInternalFrameDetalleFormTipoInven.jPanelcodigoTipoInven.setVisible(this.tipoinvenConstantesFunciones.mostrarcodigoTipoInven);
		//this.jInternalFrameDetalleFormTipoInven.jTextFieldnombreTipoInven.setVisible(this.tipoinvenConstantesFunciones.mostrarnombreTipoInven);
		this.jInternalFrameDetalleFormTipoInven.jPanelnombreTipoInven.setVisible(this.tipoinvenConstantesFunciones.mostrarnombreTipoInven);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoInven() throws Exception {
		if(this.jInternalFrameDetalleFormTipoInven==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoInven!=null) {
	
		this.jInternalFrameDetalleFormTipoInven.jLabelidTipoInven.setEnabled(this.tipoinvenConstantesFunciones.activaridTipoInven);
		this.jInternalFrameDetalleFormTipoInven.jComboBoxid_empresaTipoInven.setEnabled(this.tipoinvenConstantesFunciones.activarid_empresaTipoInven);
		this.jInternalFrameDetalleFormTipoInven.jTextFieldcodigoTipoInven.setEnabled(this.tipoinvenConstantesFunciones.activarcodigoTipoInven);
		this.jInternalFrameDetalleFormTipoInven.jTextFieldnombreTipoInven.setEnabled(this.tipoinvenConstantesFunciones.activarnombreTipoInven);
		}
	}
	
		
}