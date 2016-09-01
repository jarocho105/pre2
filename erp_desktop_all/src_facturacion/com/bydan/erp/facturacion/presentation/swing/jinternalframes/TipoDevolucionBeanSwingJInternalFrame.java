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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;




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

import com.bydan.erp.facturacion.util.TipoDevolucionConstantesFunciones;
import com.bydan.erp.facturacion.util.TipoDevolucionParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.TipoDevolucionParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.TipoDevolucionBean;
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

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.facturacion.resources.reportes.AuxiliarReportes;


import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.facturacion.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.facturacion.business.entity.*;
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


import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;

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
public class TipoDevolucionBeanSwingJInternalFrame extends TipoDevolucionJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoDevolucionBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoDevolucion> tipodevolucionValidator = new ClassValidator<TipoDevolucion>(TipoDevolucion.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoDevolucion tipodevolucion;	
	public TipoDevolucion tipodevolucionAux;
	public TipoDevolucion tipodevolucionAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoDevolucion tipodevolucionTotales;
	public Long idTipoDevolucionActual;
	public Long iIdNuevoTipoDevolucion=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboPais="";

	public List<Pais> paissForeignKey;

	public List<Pais> getpaissForeignKey() {
		return paissForeignKey;
	}

	public void setpaissForeignKey(List<Pais> paissForeignKey) {
		this.paissForeignKey = paissForeignKey;
	}

	//OBJETO FK ACTUAL
	public Pais paisForeignKey;

	public Pais getpaisForeignKey() {
		return paisForeignKey;
	}

	public void setpaisForeignKey(Pais paisForeignKey) {
		this.paisForeignKey = paisForeignKey;
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
	
	public Boolean isPermisoTodoTipoDevolucion;
	public Boolean isPermisoNuevoTipoDevolucion;
	public Boolean isPermisoActualizarTipoDevolucion;
	public Boolean isPermisoActualizarOriginalTipoDevolucion;
	public Boolean isPermisoEliminarTipoDevolucion;
	public Boolean isPermisoGuardarCambiosTipoDevolucion;
	public Boolean isPermisoConsultaTipoDevolucion;
	public Boolean isPermisoBusquedaTipoDevolucion;
	public Boolean isPermisoReporteTipoDevolucion;
	public Boolean isPermisoPaginacionMedioTipoDevolucion;
	public Boolean isPermisoPaginacionAltoTipoDevolucion;
	public Boolean isPermisoPaginacionTodoTipoDevolucion;
	public Boolean isPermisoCopiarTipoDevolucion;
	public Boolean isPermisoVerFormTipoDevolucion;
	public Boolean isPermisoDuplicarTipoDevolucion;
	public Boolean isPermisoOrdenTipoDevolucion;
	
	
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
	
	public TipoDevolucionParameterReturnGeneral tipodevolucionReturnGeneral;
	public TipoDevolucionParameterReturnGeneral tipodevolucionParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoDevolucion=false;
	public Boolean esParaAccionDesdeFormularioTipoDevolucion=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoDevolucionLogic tipodevolucionLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoDevolucion tipodevolucionBean;
	public TipoDevolucionConstantesFunciones tipodevolucionConstantesFunciones;
	//public TipoDevolucionParameterReturnGeneral tipodevolucionReturnGeneral;
	
	//FK
	
	public PaisLogic paisLogic;
	
	//PARAMETROS
	
	
	//public List<TipoDevolucion> tipodevolucions;	
	//public List<TipoDevolucion> tipodevolucionsEliminados;
	//public List<TipoDevolucion> tipodevolucionsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoDevolucion=false;
	public Boolean isVisibilidadCeldaDuplicarTipoDevolucion=true;
	public Boolean isVisibilidadCeldaCopiarTipoDevolucion=true;
	public Boolean isVisibilidadCeldaVerFormTipoDevolucion=true;
	public Boolean isVisibilidadCeldaOrdenTipoDevolucion=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoDevolucion=false;
	public Boolean isVisibilidadCeldaModificarTipoDevolucion=false;
	public Boolean isVisibilidadCeldaActualizarTipoDevolucion=false;
	public Boolean isVisibilidadCeldaEliminarTipoDevolucion=false;
	public Boolean isVisibilidadCeldaCancelarTipoDevolucion=false;
	public Boolean isVisibilidadCeldaGuardarTipoDevolucion=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoDevolucion=false;	
	
	
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadFK_IdPais=false;
	
	public Long getiIdNuevoTipoDevolucion() {
		return this.iIdNuevoTipoDevolucion;
	}

	public void setiIdNuevoTipoDevolucion(Long iIdNuevoTipoDevolucion) {
		this.iIdNuevoTipoDevolucion = iIdNuevoTipoDevolucion;
	}
	
	public Long getidTipoDevolucionActual() {
		return this.idTipoDevolucionActual;
	}

	public void setidTipoDevolucionActual(Long idTipoDevolucionActual) {
		this.idTipoDevolucionActual = idTipoDevolucionActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoDevolucion gettipodevolucion() {
		return this.tipodevolucion;
	}

	public void settipodevolucion(TipoDevolucion tipodevolucion) {
		this.tipodevolucion = tipodevolucion;
	}
	
	public TipoDevolucion gettipodevolucionAux() {
		return this.tipodevolucionAux;
	}

	public void settipodevolucionAux(TipoDevolucion tipodevolucionAux) {
		this.tipodevolucionAux = tipodevolucionAux;
	}				
	
	public TipoDevolucion gettipodevolucionAnterior() {
		return this.tipodevolucionAnterior;
	}

	public void settipodevolucionAnterior(TipoDevolucion tipodevolucionAnterior) {
		this.tipodevolucionAnterior = tipodevolucionAnterior;
	}	
	
	public TipoDevolucion gettipodevolucionTotales() {
		return this.tipodevolucionTotales;
	}

	public void settipodevolucionTotales(TipoDevolucion tipodevolucionTotales) {
		this.tipodevolucionTotales = tipodevolucionTotales;
	}	
	
	public TipoDevolucion gettipodevolucionBean() {
		return this.tipodevolucionBean;
	}

	public void settipodevolucionBean(TipoDevolucion tipodevolucionBean) {
		this.tipodevolucionBean = tipodevolucionBean;
	}	
	
	public TipoDevolucionParameterReturnGeneral gettipodevolucionReturnGeneral() {
		return this.tipodevolucionReturnGeneral;
	}

	public void settipodevolucionReturnGeneral(TipoDevolucionParameterReturnGeneral tipodevolucionReturnGeneral) {
		this.tipodevolucionReturnGeneral = tipodevolucionReturnGeneral;
	}	
	
	
	public String nombreBusquedaPorNombre="";

	public String getnombreBusquedaPorNombre() {
		return this.nombreBusquedaPorNombre;
	}

	public void setnombreBusquedaPorNombre(String nombreBusquedaPorNombre) {
		this.nombreBusquedaPorNombre = nombreBusquedaPorNombre;
	}

	public Long id_paisFK_IdPais=-1L;

	public Long getid_paisFK_IdPais() {
		return this.id_paisFK_IdPais;
	}

	public void setid_paisFK_IdPais(Long id_paisFK_IdPais) {
		this.id_paisFK_IdPais = id_paisFK_IdPais;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoDevolucionLogic getTipoDevolucionLogic()	{		
		return tipodevolucionLogic;
	}

	public void setTipoDevolucionLogic(TipoDevolucionLogic tipodevolucionLogic) {
		this.tipodevolucionLogic = tipodevolucionLogic;
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
	
	public Boolean getIsEsNuevoTipoDevolucion() {
		return isEsNuevoTipoDevolucion;
	}

	public void setIsEsNuevoTipoDevolucion(Boolean isEsNuevoTipoDevolucion) {
		this.isEsNuevoTipoDevolucion = isEsNuevoTipoDevolucion;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoDevolucion() {
		return esParaAccionDesdeFormularioTipoDevolucion;
	}
	
	public void setEsParaAccionDesdeFormularioTipoDevolucion(Boolean esParaAccionDesdeFormularioTipoDevolucion) {
		this.esParaAccionDesdeFormularioTipoDevolucion = esParaAccionDesdeFormularioTipoDevolucion;
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
	
	
	public void cargarCombosPaissForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.paissForeignKey=new ArrayList<Pais>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			PaisLogic paisLogic=new PaisLogic();

			paisLogic.getPaisDataAccess().setIsForForeingKeyData(true);

			if(this.tipodevolucionSessionBean==null) {
				this.tipodevolucionSessionBean=new TipoDevolucionSessionBean();
			}

			if(!this.tipodevolucionSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					paisLogic.getPaisDataAccess().setIsForForeingKeyData(true);

					paisLogic.getTodosPaissWithConnection(sFinalQuery,new Pagination());

					this.paissForeignKey=paisLogic.getPaiss();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaPais(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					paisLogic.getEntityWithConnection(tipodevolucionSessionBean.getlidPaisActual());
					this.paissForeignKey.add(paisLogic.getPais());
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

	
	
	public void setActualPaisForeignKey(Long idPaisSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Pais  paisTemp=null;

			for(Pais paisAux:paissForeignKey) {
				if(paisAux.getId()!=null && paisAux.getId().equals(idPaisSeleccionado)) {
					paisTemp=paisAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(paisTemp!=null) {

					if(this.tipodevolucion!=null) {
						this.tipodevolucion.setPais(paisTemp);
					}

					if(this.jInternalFrameDetalleFormTipoDevolucion!=null) {
						this.jInternalFrameDetalleFormTipoDevolucion.jComboBoxid_paisTipoDevolucion.setSelectedItem(paisTemp);
					}
				} else {
					//jComboBoxid_paisTipoDevolucion.setSelectedItem(paisTemp);
					if(this.jInternalFrameDetalleFormTipoDevolucion!=null) {
						if(this.jInternalFrameDetalleFormTipoDevolucion.jComboBoxid_paisTipoDevolucion.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoDevolucion.jComboBoxid_paisTipoDevolucion.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdPais") || sFormularioTipoBusqueda.equals("Todos")){
					if(paisTemp!=null && jComboBoxid_paisFK_IdPaisTipoDevolucion!=null) {
						jComboBoxid_paisFK_IdPaisTipoDevolucion.setSelectedItem(paisTemp);
					} else {
						if(jComboBoxid_paisFK_IdPaisTipoDevolucion!=null) {
							//jComboBoxid_paisFK_IdPaisTipoDevolucion.setSelectedItem(paisTemp);
							if(jComboBoxid_paisFK_IdPaisTipoDevolucion.getItemCount()>0) {
								jComboBoxid_paisFK_IdPaisTipoDevolucion.setSelectedIndex(0);
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

	public String getActualPaisForeignKeyDescripcion(Long idPaisSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Pais  paisTemp=null;

			for(Pais paisAux:paissForeignKey) {
				if(paisAux.getId()!=null && paisAux.getId().equals(idPaisSeleccionado)) {
					paisTemp=paisAux;
					break;
				}
			}


			sDescripcion=PaisConstantesFunciones.getPaisDescripcion(paisTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualPaisForeignKeyGenerico(Long idPaisSeleccionado,JComboBox jComboBoxid_paisTipoDevolucionGenerico)throws Exception
	{
		try
		{
			Pais  paisTemp=null;

			for(Pais paisAux:paissForeignKey) {
				if(paisAux.getId()!=null && paisAux.getId().equals(idPaisSeleccionado)) {
					paisTemp=paisAux;
					break;
				}
			}

			if(paisTemp!=null) {
				jComboBoxid_paisTipoDevolucionGenerico.setSelectedItem(paisTemp);
			} else {
				if(jComboBoxid_paisTipoDevolucionGenerico!=null && jComboBoxid_paisTipoDevolucionGenerico.getItemCount()>0) {
					jComboBoxid_paisTipoDevolucionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPaisForeignKey(TipoDevolucion tipodevolucion,JComboBox jComboBoxid_paisTipoDevolucionGenerico)throws Exception
	{
		try
		{
			Pais  paisAux=new Pais();

			if(jComboBoxid_paisTipoDevolucionGenerico==null) {
				paisAux=(Pais)this.jInternalFrameDetalleFormTipoDevolucion.jComboBoxid_paisTipoDevolucion.getSelectedItem();
			} else {
				paisAux=(Pais)jComboBoxid_paisTipoDevolucionGenerico.getSelectedItem();
			}

			if(paisAux!=null && paisAux.getId()!=null) {
				tipodevolucion.setid_pais(paisAux.getId());
				tipodevolucion.setpais_descripcion(TipoDevolucionConstantesFunciones.getPaisDescripcion(paisAux));
				tipodevolucion.setPais(paisAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFramePaissForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingPais=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!TipoDevolucionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoDevolucion!=null) { 
							this.jInternalFrameDetalleFormTipoDevolucion.jComboBoxid_paisTipoDevolucion.removeAllItems();

							for(Pais pais:this.paissForeignKey) {
								this.jInternalFrameDetalleFormTipoDevolucion.jComboBoxid_paisTipoDevolucion.addItem(pais);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoDevolucion!=null) { 
					}

					if(!TipoDevolucionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdPais") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!TipoDevolucionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_paisFK_IdPaisTipoDevolucion.removeAllItems();

							for(Pais pais:this.paissForeignKey) {
								this.jComboBoxid_paisFK_IdPaisTipoDevolucion.addItem(pais);
							}
						}

						if(!TipoDevolucionJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFramePaisForeignKey(Pais pais,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTipoDevolucion!=null) {
							this.jInternalFrameDetalleFormTipoDevolucion.jComboBoxid_paisTipoDevolucion.setSelectedItem(pais);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoDevolucion!=null) {
							this.jInternalFrameDetalleFormTipoDevolucion.jComboBoxid_paisTipoDevolucion.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_paisFK_IdPaisTipoDevolucion.setSelectedItem(pais);
						} else {
							this.jComboBoxid_paisFK_IdPaisTipoDevolucion.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesTipoDevolucion() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoDevolucionConstantesFunciones.refrescarForeignKeysDescripcionesTipoDevolucion(this.tipodevolucionLogic.getTipoDevolucions());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoDevolucionConstantesFunciones.refrescarForeignKeysDescripcionesTipoDevolucion(this.tipodevolucions);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Pais.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipodevolucionLogic.setTipoDevolucions(this.tipodevolucions);
			tipodevolucionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoDevolucionParameterReturnGeneral getTipoDevolucionParameterGeneral() {
		return this.tipodevolucionParameterGeneral;
	}
	
	public void setTipoDevolucionParameterGeneral(TipoDevolucionParameterReturnGeneral tipodevolucionParameterGeneral) {
		this.tipodevolucionParameterGeneral = tipodevolucionParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoDevolucion() {
		return isPermisoTodoTipoDevolucion;
	}

	public void setIsPermisoTodoTipoDevolucion(Boolean isPermisoTodoTipoDevolucion) {
		this.isPermisoTodoTipoDevolucion = isPermisoTodoTipoDevolucion;
	}

	public Boolean getIsPermisoNuevoTipoDevolucion() {
		return isPermisoNuevoTipoDevolucion;
	}

	public void setIsPermisoNuevoTipoDevolucion(Boolean isPermisoNuevoTipoDevolucion) {
		this.isPermisoNuevoTipoDevolucion = isPermisoNuevoTipoDevolucion;
	}

	public Boolean getIsPermisoActualizarTipoDevolucion() {
		return isPermisoActualizarTipoDevolucion;
	}

	public void setIsPermisoActualizarTipoDevolucion(Boolean isPermisoActualizarTipoDevolucion) {
		this.isPermisoActualizarTipoDevolucion = isPermisoActualizarTipoDevolucion;
	}

	public Boolean getIsPermisoEliminarTipoDevolucion() {
		return isPermisoEliminarTipoDevolucion;
	}

	public void setIsPermisoEliminarTipoDevolucion(Boolean isPermisoEliminarTipoDevolucion) {
		this.isPermisoEliminarTipoDevolucion = isPermisoEliminarTipoDevolucion;
	}

	public Boolean getIsPermisoGuardarCambiosTipoDevolucion() {
		return isPermisoGuardarCambiosTipoDevolucion;
	}

	public void setIsPermisoGuardarCambiosTipoDevolucion(Boolean isPermisoGuardarCambiosTipoDevolucion) {
		this.isPermisoGuardarCambiosTipoDevolucion = isPermisoGuardarCambiosTipoDevolucion;
	}
	
	public Boolean getIsPermisoConsultaTipoDevolucion() {
		return isPermisoConsultaTipoDevolucion;
	}

	public void setIsPermisoConsultaTipoDevolucion(Boolean isPermisoConsultaTipoDevolucion) {
		this.isPermisoConsultaTipoDevolucion = isPermisoConsultaTipoDevolucion;
	}

	public Boolean getIsPermisoBusquedaTipoDevolucion() {
		return isPermisoBusquedaTipoDevolucion;
	}

	public void setIsPermisoBusquedaTipoDevolucion(Boolean isPermisoBusquedaTipoDevolucion) {
		this.isPermisoBusquedaTipoDevolucion = isPermisoBusquedaTipoDevolucion;
	}

	public Boolean getIsPermisoReporteTipoDevolucion() {
		return isPermisoReporteTipoDevolucion;
	}

	public void setIsPermisoReporteTipoDevolucion(Boolean isPermisoReporteTipoDevolucion) {
		this.isPermisoReporteTipoDevolucion = isPermisoReporteTipoDevolucion;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoDevolucion() {
		return isPermisoPaginacionMedioTipoDevolucion;
	}

	public void setIsPermisoPaginacionMedioTipoDevolucion(Boolean isPermisoPaginacionMedioTipoDevolucion) {
		this.isPermisoPaginacionMedioTipoDevolucion = isPermisoPaginacionMedioTipoDevolucion;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoDevolucion() {
		return isPermisoPaginacionTodoTipoDevolucion;
	}

	public void setIsPermisoPaginacionTodoTipoDevolucion(Boolean isPermisoPaginacionTodoTipoDevolucion) {
		this.isPermisoPaginacionTodoTipoDevolucion = isPermisoPaginacionTodoTipoDevolucion;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoDevolucion() {
		return isPermisoPaginacionAltoTipoDevolucion;
	}

	public void setIsPermisoPaginacionAltoTipoDevolucion(Boolean isPermisoPaginacionAltoTipoDevolucion) {
		this.isPermisoPaginacionAltoTipoDevolucion = isPermisoPaginacionAltoTipoDevolucion;
	}
	
	public Boolean getIsPermisoCopiarTipoDevolucion() {
		return isPermisoCopiarTipoDevolucion;
	}

	public void setIsPermisoCopiarTipoDevolucion(Boolean isPermisoCopiarTipoDevolucion) {
		this.isPermisoCopiarTipoDevolucion = isPermisoCopiarTipoDevolucion;
	}
	
	public Boolean getIsPermisoVerFormTipoDevolucion() {
		return isPermisoVerFormTipoDevolucion;
	}

	public void setIsPermisoVerFormTipoDevolucion(Boolean isPermisoVerFormTipoDevolucion) {
		this.isPermisoVerFormTipoDevolucion = isPermisoVerFormTipoDevolucion;
	}
	
	public Boolean getIsPermisoDuplicarTipoDevolucion() {
		return isPermisoDuplicarTipoDevolucion;
	}

	public void setIsPermisoDuplicarTipoDevolucion(Boolean isPermisoDuplicarTipoDevolucion) {
		this.isPermisoDuplicarTipoDevolucion = isPermisoDuplicarTipoDevolucion;
	}
	
	public Boolean getIsPermisoOrdenTipoDevolucion() {
		return isPermisoOrdenTipoDevolucion;
	}

	public void setIsPermisoOrdenTipoDevolucion(Boolean isPermisoOrdenTipoDevolucion) {
		this.isPermisoOrdenTipoDevolucion = isPermisoOrdenTipoDevolucion;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoDevolucion() {
		return isVisibilidadCeldaNuevoTipoDevolucion;
	}

	public void setIsVisibilidadCeldaNuevoTipoDevolucion(Boolean isVisibilidadCeldaNuevoTipoDevolucion) {
		this.isVisibilidadCeldaNuevoTipoDevolucion = isVisibilidadCeldaNuevoTipoDevolucion;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoDevolucion() {
		return isVisibilidadCeldaDuplicarTipoDevolucion;
	}

	public void setIsVisibilidadCeldaDuplicarTipoDevolucion(Boolean isVisibilidadCeldaDuplicarTipoDevolucion) {
		this.isVisibilidadCeldaDuplicarTipoDevolucion = isVisibilidadCeldaDuplicarTipoDevolucion;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoDevolucion() {
		return isVisibilidadCeldaCopiarTipoDevolucion;
	}

	public void setIsVisibilidadCeldaCopiarTipoDevolucion(Boolean isVisibilidadCeldaCopiarTipoDevolucion) {
		this.isVisibilidadCeldaCopiarTipoDevolucion = isVisibilidadCeldaCopiarTipoDevolucion;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoDevolucion() {
		return isVisibilidadCeldaVerFormTipoDevolucion;
	}

	public void setIsVisibilidadCeldaVerFormTipoDevolucion(Boolean isVisibilidadCeldaVerFormTipoDevolucion) {
		this.isVisibilidadCeldaVerFormTipoDevolucion = isVisibilidadCeldaVerFormTipoDevolucion;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoDevolucion() {
		return isVisibilidadCeldaOrdenTipoDevolucion;
	}

	public void setIsVisibilidadCeldaOrdenTipoDevolucion(Boolean isVisibilidadCeldaOrdenTipoDevolucion) {
		this.isVisibilidadCeldaOrdenTipoDevolucion = isVisibilidadCeldaOrdenTipoDevolucion;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoDevolucion() {
		return isVisibilidadCeldaNuevoRelacionesTipoDevolucion;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoDevolucion(Boolean isVisibilidadCeldaNuevoRelacionesTipoDevolucion) {
		this.isVisibilidadCeldaNuevoRelacionesTipoDevolucion = isVisibilidadCeldaNuevoRelacionesTipoDevolucion;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoDevolucion() {
		return isVisibilidadCeldaModificarTipoDevolucion;
	}

	public void setIsVisibilidadCeldaModificarTipoDevolucion(Boolean isVisibilidadCeldaModificarTipoDevolucion) {
		this.isVisibilidadCeldaModificarTipoDevolucion = isVisibilidadCeldaModificarTipoDevolucion;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoDevolucion() {
		return isVisibilidadCeldaActualizarTipoDevolucion;
	}

	public void setIsVisibilidadCeldaActualizarTipoDevolucion(Boolean isVisibilidadCeldaActualizarTipoDevolucion) {
		this.isVisibilidadCeldaActualizarTipoDevolucion = isVisibilidadCeldaActualizarTipoDevolucion;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoDevolucion() {
		return isVisibilidadCeldaEliminarTipoDevolucion;
	}

	public void setIsVisibilidadCeldaEliminarTipoDevolucion(Boolean isVisibilidadCeldaEliminarTipoDevolucion) {
		this.isVisibilidadCeldaEliminarTipoDevolucion = isVisibilidadCeldaEliminarTipoDevolucion;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoDevolucion() {
		return isVisibilidadCeldaCancelarTipoDevolucion;
	}

	public void setIsVisibilidadCeldaCancelarTipoDevolucion(Boolean isVisibilidadCeldaCancelarTipoDevolucion) {
		this.isVisibilidadCeldaCancelarTipoDevolucion = isVisibilidadCeldaCancelarTipoDevolucion;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoDevolucion() {
		return isVisibilidadCeldaGuardarTipoDevolucion;
	}

	public void setIsVisibilidadCeldaGuardarTipoDevolucion(Boolean isVisibilidadCeldaGuardarTipoDevolucion) {
		this.isVisibilidadCeldaGuardarTipoDevolucion = isVisibilidadCeldaGuardarTipoDevolucion;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoDevolucion() {
		return isVisibilidadCeldaGuardarCambiosTipoDevolucion;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoDevolucion(Boolean isVisibilidadCeldaGuardarCambiosTipoDevolucion) {
		this.isVisibilidadCeldaGuardarCambiosTipoDevolucion = isVisibilidadCeldaGuardarCambiosTipoDevolucion;
	}
		
	public TipoDevolucionSessionBean gettipodevolucionSessionBean() {
		return this.tipodevolucionSessionBean;
	}
	
	public void settipodevolucionSessionBean(TipoDevolucionSessionBean tipodevolucionSessionBean) {
		this.tipodevolucionSessionBean=tipodevolucionSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorNombre() {
		return this.isVisibilidadBusquedaPorNombre;
	}

	public void setisVisibilidadBusquedaPorNombre(Boolean isVisibilidadBusquedaPorNombre) {
		this.isVisibilidadBusquedaPorNombre=isVisibilidadBusquedaPorNombre;
	}

	public Boolean getisVisibilidadFK_IdPais() {
		return this.isVisibilidadFK_IdPais;
	}

	public void setisVisibilidadFK_IdPais(Boolean isVisibilidadFK_IdPais) {
		this.isVisibilidadFK_IdPais=isVisibilidadFK_IdPais;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoDevolucion(TipoDevolucion tipodevolucion)throws Exception {
		try {
			
				this.setActualParaGuardarPaisForeignKey(tipodevolucion,null);
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
	
	public void bugActualizarReferenciaActual(TipoDevolucion tipodevolucion,TipoDevolucion tipodevolucionAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoDevolucion(tipodevolucion);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipodevolucionAux.setId(tipodevolucion.getId());
		tipodevolucionAux.setVersionRow(tipodevolucion.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoDevolucion();
		
			int intSelectedRow = this.jTableDatosTipoDevolucion.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodevolucion =(TipoDevolucion) this.tipodevolucionLogic.getTipoDevolucions().toArray()[this.jTableDatosTipoDevolucion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipodevolucion =(TipoDevolucion) this.tipodevolucions.toArray()[this.jTableDatosTipoDevolucion.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoDevolucionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoDevolucion(this.tipodevolucion,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoDevolucion(this.tipodevolucion);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipodevolucionValidator.getInvalidValues(this.tipodevolucion);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipodevolucionLogic.setDatosCliente(datosCliente);
			tipodevolucionLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipodevolucionAux=new  TipoDevolucion();
				
				tipodevolucionAux.setIsNew(true);
				tipodevolucionAux.setIsChanged(true);
				
				tipodevolucionAux.setTipoDevolucionOriginal(this.tipodevolucion);
				
				tipodevolucionAux.setId(this.tipodevolucion.getId());	
				tipodevolucionAux.setVersionRow(this.tipodevolucion.getVersionRow());	
				tipodevolucionAux.setid_pais(this.tipodevolucion.getid_pais());	
				tipodevolucionAux.setnombre(this.tipodevolucion.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipodevolucionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipodevolucionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipodevolucionAux,tipodevolucionLogic.getTipoDevolucions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipodevolucionAux,tipodevolucions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipodevolucionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipodevolucionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodevolucionLogic.saveTipoDevolucions();//WithConnection
						//tipodevolucionLogic.getSetVersionRowTipoDevolucions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipodevolucion,tipodevolucionAux);
					
					this.refrescarForeignKeysDescripcionesTipoDevolucion();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipodevolucionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipodevolucionAux=new  TipoDevolucion();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipodevolucionSessionBean.getEsGuardarRelacionado() 
					|| (this.tipodevolucionSessionBean.getEsGuardarRelacionado() && this.tipodevolucion.getId()>=0)) {
						
					tipodevolucionAux.setIsNew(false);
				}
				
				tipodevolucionAux.setIsDeleted(false);
			
				tipodevolucionAux.setId(this.tipodevolucion.getId());	
				tipodevolucionAux.setVersionRow(this.tipodevolucion.getVersionRow());	
				tipodevolucionAux.setid_pais(this.tipodevolucion.getid_pais());	
				tipodevolucionAux.setnombre(this.tipodevolucion.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipodevolucionAux,tipodevolucionLogic.getTipoDevolucions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipodevolucionAux,tipodevolucions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipodevolucionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipodevolucionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodevolucionLogic.saveTipoDevolucions();//WithConnection
						//tipodevolucionLogic.getSetVersionRowTipoDevolucions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipodevolucion,tipodevolucionAux);
					
					this.refrescarForeignKeysDescripcionesTipoDevolucion();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipodevolucionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipodevolucionAux=new  TipoDevolucion();
				
				tipodevolucionAux.setIsNew(false);
				tipodevolucionAux.setIsChanged(false);
				
				tipodevolucionAux.setIsDeleted(true);
				
				tipodevolucionAux.setId(this.tipodevolucion.getId());	
				tipodevolucionAux.setVersionRow(this.tipodevolucion.getVersionRow());	
				tipodevolucionAux.setid_pais(this.tipodevolucion.getid_pais());	
				tipodevolucionAux.setnombre(this.tipodevolucion.getnombre());	
				
				if(this.tipodevolucionSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipodevolucionAux.getId()>=0) {	
						this.tipodevolucionsEliminados.add(tipodevolucionAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipodevolucionAux,tipodevolucionLogic.getTipoDevolucions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipodevolucionAux,tipodevolucions);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipodevolucionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipodevolucionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodevolucionLogic.saveTipoDevolucions();//WithConnection
						//tipodevolucionLogic.getSetVersionRowTipoDevolucions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipodevolucionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipodevolucionSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipodevolucionSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipodevolucionAux,tipodevolucionLogic.getTipoDevolucions());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipodevolucionAux,tipodevolucions);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodevolucionLogic.getTipoDevolucions().addAll(this.tipodevolucionsEliminados);
					
					tipodevolucionLogic.saveTipoDevolucions();//WithConnection
					//tipodevolucionLogic.getSetVersionRowTipoDevolucions();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoDevolucion();
				
				this.tipodevolucionsEliminados= new ArrayList<TipoDevolucion>();		
			}
			
			if(this.tipodevolucionSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodevolucionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Devolucion GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Devolucion",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipodevolucion=tipodevolucionAux;
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
      		//this.finishProcessTipoDevolucion();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoDevolucion tipodevolucionLocal) throws Exception {
		
		if(this.tipodevolucionSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoDevolucion tipodevolucionLocal) throws Exception {	
		if(this.tipodevolucionSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(PaisDetalleFormJInternalFrame.class)) {
				PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrameLocal=(PaisBeanSwingJInternalFrame) ((PaisDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				paisBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPais(paisBeanSwingJInternalFrameLocal.getpais(),true);
				paisBeanSwingJInternalFrameLocal.actualizarLista(paisBeanSwingJInternalFrameLocal.pais,this.paissForeignKey);

				paisBeanSwingJInternalFrameLocal.actualizarRelaciones(paisBeanSwingJInternalFrameLocal.pais);

				tipodevolucionLocal.setPais(paisBeanSwingJInternalFrameLocal.pais);

				this.addItemDefectoCombosForeignKeyPais();
				this.cargarCombosFramePaissForeignKey("Formulario");
				this.setActualPaisForeignKey(paisBeanSwingJInternalFrameLocal.pais.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoDevolucionActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoDevolucion.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipodevolucion =(TipoDevolucion) this.tipodevolucionLogic.getTipoDevolucions().toArray()[this.jTableDatosTipoDevolucion.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipodevolucion =(TipoDevolucion) this.tipodevolucions.toArray()[this.jTableDatosTipoDevolucion.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipodevolucionValidator.getInvalidValues(this.tipodevolucion);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoDevolucion tipodevolucion,List<TipoDevolucion> tipodevolucions) throws Exception {
		try	{		
			TipoDevolucionConstantesFunciones.actualizarLista(tipodevolucion,tipodevolucions,this.tipodevolucionSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoDevolucion tipodevolucion,List<TipoDevolucion> tipodevolucions) throws Exception {
		try	{			
			TipoDevolucionConstantesFunciones.actualizarSelectedLista(tipodevolucion,tipodevolucions);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoDevolucion> tipodevolucionsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipodevolucionsLocal=this.tipodevolucionLogic.getTipoDevolucions();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipodevolucionsLocal=this.tipodevolucions;
			}
			//ARCHITECTURE
		
			for(TipoDevolucion tipodevolucionLocal:tipodevolucionsLocal) {
				if(this.permiteMantenimiento(tipodevolucionLocal) && tipodevolucionLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoDevolucionConstantesFunciones.getTipoDevolucionLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoDevolucionConstantesFunciones.IDPAIS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDevolucion.jLabelid_paisTipoDevolucion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoDevolucionConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDevolucion.jLabelnombreTipoDevolucion,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoDevolucion!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoDevolucion.jLabelid_paisTipoDevolucion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoDevolucion.jLabelnombreTipoDevolucion,"");
		
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
		this.iIdNuevoTipoDevolucion--;	
		
		
		this.tipodevolucionAux=new TipoDevolucion();
		
		this.tipodevolucionAux.setId(this.iIdNuevoTipoDevolucion);
		this.tipodevolucionAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipodevolucionLogic.getTipoDevolucions().add(this.tipodevolucionAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipodevolucions.add(this.tipodevolucionAux);
		}
		//ARCHITECTURE
		
		this.tipodevolucion=this.tipodevolucionAux;
		
		if(TipoDevolucionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoDevolucion(this.tipodevolucion);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoDevolucion(this.tipodevolucion);
		}
				
		//this.setDefaultControlesTipoDevolucion();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoDevolucion();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoDevolucion();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoDevolucion();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoDevolucion(this.tipodevolucionBean,this.tipodevolucion,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoDevolucion(this.tipodevolucion);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoDevolucionConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipodevolucionSessionBean.getConGuardarRelaciones()) {
			classes=TipoDevolucionConstantesFunciones.getClassesRelationshipsOfTipoDevolucion(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipodevolucionReturnGeneral=tipodevolucionLogic.procesarEventosTipoDevolucionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipodevolucionLogic.getTipoDevolucions(),this.tipodevolucion,this.tipodevolucionParameterGeneral,this.isEsNuevoTipoDevolucion,classes);//this.tipodevolucionLogic.getTipoDevolucion()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoDevolucion(this.tipodevolucionReturnGeneral,this.tipodevolucionBean,false);
		
		if(this.tipodevolucionReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoDevolucion(this.tipodevolucionReturnGeneral.getTipoDevolucion());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoDevolucion(this.tipodevolucionReturnGeneral.getTipoDevolucion());
		}
		
		if(this.tipodevolucionReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoDevolucion(this.tipodevolucionReturnGeneral.getTipoDevolucion(),classes);//this.tipodevolucionBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoDevolucion(this.tipodevolucion,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoDevolucion();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoDevolucion();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoDevolucion(false);
						
			if(tipodevolucionSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoDevolucionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoDevolucion();
			}
			
			this.actualizarVisualTableDatosTipoDevolucion();
			
			this.jTableDatosTipoDevolucion.setRowSelectionInterval(this.getIndiceNuevoTipoDevolucion(), this.getIndiceNuevoTipoDevolucion());
			
			this.seleccionarFilaTablaTipoDevolucionActual();
						
			this.actualizarEstadoCeldasBotonesTipoDevolucion("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoDevolucion(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoDevolucion.jTextAreanombreTipoDevolucion.setEnabled(isHabilitar && this.tipodevolucionConstantesFunciones.activarnombreTipoDevolucion);	
		
		this.jInternalFrameDetalleFormTipoDevolucion.jComboBoxid_paisTipoDevolucion.setEnabled(isHabilitar && this.tipodevolucionConstantesFunciones.activarid_paisTipoDevolucion);
	};
	
	public void setDefaultControlesTipoDevolucion() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoDevolucion(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipodevolucionSessionBean.setConGuardarRelaciones(true);			
			this.tipodevolucionSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoDevolucion.jTabbedPaneRelacionesTipoDevolucion.setVisible(true);
			
					
		} else {
			//this.tipodevolucionSessionBean.setConGuardarRelaciones(false);			
			this.tipodevolucionSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoDevolucion.jTabbedPaneRelacionesTipoDevolucion.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoDevolucion() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoDevolucion tipodevolucionAux:this.tipodevolucionLogic.getTipoDevolucions()) {
				if(tipodevolucionAux.getId().equals(this.iIdNuevoTipoDevolucion)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoDevolucion tipodevolucionAux:this.tipodevolucions) {
				if(tipodevolucionAux.getId().equals(this.iIdNuevoTipoDevolucion)) {
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
	
	public int getIndiceActualTipoDevolucion(TipoDevolucion tipodevolucion,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoDevolucion tipodevolucionAux:this.tipodevolucionLogic.getTipoDevolucions()) {
				if(tipodevolucionAux.getId().equals(tipodevolucion.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoDevolucion tipodevolucionAux:this.tipodevolucions) {
				if(tipodevolucionAux.getId().equals(tipodevolucion.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoDevolucion(TipoDevolucion tipodevolucionOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoDevolucion tipodevolucionAux:this.tipodevolucionLogic.getTipoDevolucions()) {
				if(tipodevolucionAux.getTipoDevolucionOriginal().getId().equals(tipodevolucionOriginal.getId())) {
					existe=true;
					tipodevolucionOriginal.setId(tipodevolucionAux.getId());
					tipodevolucionOriginal.setVersionRow(tipodevolucionAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoDevolucion tipodevolucionAux:this.tipodevolucions) {
				if(tipodevolucionAux.getTipoDevolucionOriginal().getId().equals(tipodevolucionOriginal.getId())) {
					existe=true;
					tipodevolucionOriginal.setId(tipodevolucionAux.getId());
					tipodevolucionOriginal.setVersionRow(tipodevolucionAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoDevolucion(Boolean esParaCancelar) throws Exception {
		tipodevolucionsAux=new ArrayList<TipoDevolucion>();
		tipodevolucionAux=new TipoDevolucion();
		
		if(!this.tipodevolucionSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoDevolucion tipodevolucionAux:this.tipodevolucionLogic.getTipoDevolucions()) {
					if(tipodevolucionAux.getId()<0) {
						tipodevolucionsAux.add(tipodevolucionAux);
					}		
				}
				this.iIdNuevoTipoDevolucion=0L;
				this.tipodevolucionLogic.getTipoDevolucions().removeAll(tipodevolucionsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoDevolucion tipodevolucionAux:this.tipodevolucions) {
					if(tipodevolucionAux.getId()<0) {
						tipodevolucionsAux.add(tipodevolucionAux);
					}		
				}
				this.iIdNuevoTipoDevolucion=0L;
				this.tipodevolucions.removeAll(tipodevolucionsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoDevolucion 
					&& this.tipodevolucionLogic.getTipoDevolucions().size()>0
					) {
					tipodevolucionAux=this.tipodevolucionLogic.getTipoDevolucions().get(this.tipodevolucionLogic.getTipoDevolucions().size() - 1);
				
					if(tipodevolucionAux.getId()<0) {
						this.tipodevolucionLogic.getTipoDevolucions().remove(tipodevolucionAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoDevolucion && this.tipodevolucions.size()>0) {
					tipodevolucionAux=this.tipodevolucions.get(this.tipodevolucions.size() - 1);
				
					if(tipodevolucionAux.getId()<0) {
						this.tipodevolucions.remove(tipodevolucionAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoDevolucion(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipodevolucion.getId()<0) {
				this.tipodevolucionLogic.getTipoDevolucions().remove(this.tipodevolucion);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipodevolucion.getId()<0) {
				this.tipodevolucions.remove(this.tipodevolucion);
			}
		}			
	}
	
	public void setEstadosInicialesTipoDevolucion(List<TipoDevolucion> tipodevolucionsAux) throws Exception {
		TipoDevolucionConstantesFunciones.setEstadosInicialesTipoDevolucion(tipodevolucionsAux);
	}
	
	public void setEstadosInicialesTipoDevolucion(TipoDevolucion tipodevolucionAux) throws Exception {
		TipoDevolucionConstantesFunciones.setEstadosInicialesTipoDevolucion(tipodevolucionAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoDevolucionActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoDevolucion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoDevolucionActual()) {
				if(!this.isEsNuevoTipoDevolucion) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoDevolucion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoDevolucion=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoDevolucionActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Devolucion ?", "MANTENIMIENTO DE Tipo Devolucion", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoDevolucion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoDevolucion tipodevolucion) throws Exception {
		TipoDevolucionConstantesFunciones.seleccionarAsignar(this.tipodevolucion,tipodevolucion);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoDevolucion=this.isPermisoActualizarOriginalTipoDevolucion;
			
			
			this.seleccionarAsignar(tipodevolucion);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoDevolucionConstantesFunciones.quitarEspaciosTipoDevolucion(this.tipodevolucion,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoDevolucion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipodevolucionSessionBean.setsFuncionBusquedaRapida(this.tipodevolucionSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoDevolucion) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoDevolucion(esParaCancelar);				
				this.cancelarNuevoTipoDevolucion(esParaCancelar);								
			}
			
			this.tipodevolucion=new TipoDevolucion();
			
			this.inicializarTipoDevolucion();
			
			this.actualizarEstadoCeldasBotonesTipoDevolucion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoDevolucion() throws Exception {
		try {
			TipoDevolucionConstantesFunciones.inicializarTipoDevolucion(this.tipodevolucion);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipodevolucionLogic.getTipoDevolucions().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoDevolucions(String sAccionBusqueda,List<TipoDevolucion> tipodevolucionsParaReportes) throws Exception {
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
					sPathReporteFinal="TipoDevolucion"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoDevolucionMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoDevolucionMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoDevolucion"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Devolucions");		
		parameters.put("busquedapor", TipoDevolucionConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoDevolucion=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoDevolucionConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoDevolucionConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoDevolucion=new JRBeanArrayDataSource(TipoDevolucionJInternalFrame.TraerTipoDevolucionBeans(tipodevolucionsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoDevolucion);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoDevolucionConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoDevolucionConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoDevolucionBean.TraerTipoDevolucionBeans(tipodevolucionsParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoDevolucions(sAccionBusqueda,sTipoArchivoReporte,tipodevolucionsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoDevolucions(sAccionBusqueda,sTipoArchivoReporte,tipodevolucionsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoDevolucionActionPerformed(null);
					//this.generarExcelReporteTipoDevolucions(sAccionBusqueda,sTipoArchivoReporte,tipodevolucionsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoDevolucions(sAccionBusqueda,sTipoArchivoReporte,tipodevolucionsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoDevolucions(sAccionBusqueda,sTipoArchivoReporte,tipodevolucionsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoDevolucions(sAccionBusqueda,sTipoArchivoReporte,tipodevolucionsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoDevolucions(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoDevolucion> tipodevolucionsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodevolucion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoDevolucions");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoDevolucion("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoDevolucion tipodevolucion : tipodevolucionsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoDevolucionConstantesFunciones.generarExcelReporteDataTipoDevolucion("NORMAL",row,workbook,tipodevolucion,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodevolucionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Devolucion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoDevolucion(String sTipo,Row row,Workbook workbook) {
		
		TipoDevolucionConstantesFunciones.generarExcelReporteHeaderTipoDevolucion(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoDevolucions(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoDevolucion> tipodevolucionsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodevolucion_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoDevolucions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoDevolucion tipodevolucion : tipodevolucionsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoDevolucionConstantesFunciones.getTipoDevolucionDescripcion(tipodevolucion));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoDevolucionConstantesFunciones.LABEL_IDPAIS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoDevolucionConstantesFunciones.LABEL_IDPAIS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipodevolucion.getpais_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoDevolucionConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoDevolucionConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipodevolucion.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodevolucionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Devolucion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoDevolucions(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoDevolucion> tipodevolucionsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoDevolucion> tipodevolucionsRespaldo=null;
		
		classes=TipoDevolucionConstantesFunciones.getClassesRelationshipsOfTipoDevolucion(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipodevolucionLogic.setDatosCliente(this.datosCliente);
		this.tipodevolucionLogic.setDatosDeep(this.datosDeep);
		this.tipodevolucionLogic.setIsConDeep(true);
		
		tipodevolucionsRespaldo=this.tipodevolucionLogic.getTipoDevolucions();
		
		this.tipodevolucionLogic.setTipoDevolucions(tipodevolucionsParaReportes);	
		this.tipodevolucionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipodevolucionsParaReportes=this.tipodevolucionLogic.getTipoDevolucions();
		this.tipodevolucionLogic.setTipoDevolucions(tipodevolucionsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodevolucion_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoDevolucions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoDevolucion("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoDevolucion tipodevolucion : tipodevolucionsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoDevolucion("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoDevolucionConstantesFunciones.generarExcelReporteDataTipoDevolucion("NORMAL",row,workbook,tipodevolucion,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoDevolucionConstantesFunciones.getTipoDevolucionDescripcion(tipodevolucion));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodevolucionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Devolucion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoDevolucion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoDevolucion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoDevolucion.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoDevolucion.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoDevolucion() throws Exception {		
		this.startProcessTipoDevolucion(true);
	}
	
	public void startProcessTipoDevolucion(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoDevolucion ,this.jPanelParametrosReportesTipoDevolucion, this.jScrollPanelDatosTipoDevolucion,this.jPanelPaginacionTipoDevolucion, this.jScrollPanelDatosEdicionTipoDevolucion, this.jPanelAccionesTipoDevolucion,this.jPanelAccionesFormularioTipoDevolucion,this.jmenuBarTipoDevolucion,this.jmenuBarDetalleTipoDevolucion,this.jTtoolBarTipoDevolucion,this.jTtoolBarDetalleTipoDevolucion);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoDevolucion=this.jTabbedPaneBusquedasTipoDevolucion; 
		
		final JPanel jPanelParametrosReportesTipoDevolucion=this.jPanelParametrosReportesTipoDevolucion;
		//final JScrollPane jScrollPanelDatosTipoDevolucion=this.jScrollPanelDatosTipoDevolucion;
		final JTable jTableDatosTipoDevolucion=this.jTableDatosTipoDevolucion;		
		final JPanel jPanelPaginacionTipoDevolucion=this.jPanelPaginacionTipoDevolucion;
		//final JScrollPane jScrollPanelDatosEdicionTipoDevolucion=this.jScrollPanelDatosEdicionTipoDevolucion;
		final JPanel jPanelAccionesTipoDevolucion=this.jPanelAccionesTipoDevolucion;
		
		JPanel jPanelCamposAuxiliarTipoDevolucion=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoDevolucion=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoDevolucion!=null) {
			jPanelCamposAuxiliarTipoDevolucion=this.jInternalFrameDetalleFormTipoDevolucion.jPanelCamposTipoDevolucion;
			jPanelAccionesFormularioAuxiliarTipoDevolucion=this.jInternalFrameDetalleFormTipoDevolucion.jPanelAccionesFormularioTipoDevolucion;
		}
		
		final JPanel jPanelCamposTipoDevolucion=jPanelCamposAuxiliarTipoDevolucion;
		final JPanel jPanelAccionesFormularioTipoDevolucion=jPanelAccionesFormularioAuxiliarTipoDevolucion;
		
		
		final JMenuBar jmenuBarTipoDevolucion=this.jmenuBarTipoDevolucion;
		final JToolBar jTtoolBarTipoDevolucion=this.jTtoolBarTipoDevolucion;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoDevolucion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoDevolucion=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoDevolucion!=null) {
			jmenuBarDetalleAuxiliarTipoDevolucion=this.jInternalFrameDetalleFormTipoDevolucion.jmenuBarDetalleTipoDevolucion;
			jTtoolBarDetalleAuxiliarTipoDevolucion=this.jInternalFrameDetalleFormTipoDevolucion.jTtoolBarDetalleTipoDevolucion;
		}
		
		final JMenuBar jmenuBarDetalleTipoDevolucion=jmenuBarDetalleAuxiliarTipoDevolucion;
		final JToolBar jTtoolBarDetalleTipoDevolucion=jTtoolBarDetalleAuxiliarTipoDevolucion;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoDevolucion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoDevolucion;
			processRunnable.jTableDatos=jTableDatosTipoDevolucion;
			processRunnable.jPanelCampos=jPanelCamposTipoDevolucion;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoDevolucion;
			processRunnable.jPanelAcciones=jPanelAccionesTipoDevolucion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoDevolucion;
			
			
			processRunnable.jmenuBar=jmenuBarTipoDevolucion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoDevolucion;
			processRunnable.jTtoolBar=jTtoolBarTipoDevolucion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoDevolucion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoDevolucion ,jPanelParametrosReportesTipoDevolucion,jTableDatosTipoDevolucion, /*jScrollPanelDatosTipoDevolucion,*/jPanelCamposTipoDevolucion,jPanelPaginacionTipoDevolucion, /*jScrollPanelDatosEdicionTipoDevolucion,*/ jPanelAccionesTipoDevolucion,jPanelAccionesFormularioTipoDevolucion,jmenuBarTipoDevolucion,jmenuBarDetalleTipoDevolucion,jTtoolBarTipoDevolucion,jTtoolBarDetalleTipoDevolucion);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoDevolucion ,jPanelParametrosReportesTipoDevolucion, jScrollPanelDatosTipoDevolucion,jPanelPaginacionTipoDevolucion, jScrollPanelDatosEdicionTipoDevolucion, jPanelAccionesTipoDevolucion,jPanelAccionesFormularioTipoDevolucion,jmenuBarTipoDevolucion,jmenuBarDetalleTipoDevolucion,jTtoolBarTipoDevolucion,jTtoolBarDetalleTipoDevolucion);
						
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
	
	public void finishProcessTipoDevolucion() {// throws Exception 
		this.finishProcessTipoDevolucion(true);
	}
	
	public void finishProcessTipoDevolucion(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoDevolucion ,this.jPanelParametrosReportesTipoDevolucion, this.jScrollPanelDatosTipoDevolucion,this.jPanelPaginacionTipoDevolucion, this.jScrollPanelDatosEdicionTipoDevolucion, this.jPanelAccionesTipoDevolucion,this.jPanelAccionesFormularioTipoDevolucion,this.jmenuBarTipoDevolucion,this.jmenuBarDetalleTipoDevolucion,this.jTtoolBarTipoDevolucion,this.jTtoolBarDetalleTipoDevolucion);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoDevolucion=this.jTabbedPaneBusquedasTipoDevolucion; 
		
		final JPanel jPanelParametrosReportesTipoDevolucion=this.jPanelParametrosReportesTipoDevolucion;
		//final JScrollPane jScrollPanelDatosTipoDevolucion=this.jScrollPanelDatosTipoDevolucion;
		final JTable jTableDatosTipoDevolucion=this.jTableDatosTipoDevolucion;		
		final JPanel jPanelPaginacionTipoDevolucion=this.jPanelPaginacionTipoDevolucion;
		//final JScrollPane jScrollPanelDatosEdicionTipoDevolucion=this.jScrollPanelDatosEdicionTipoDevolucion;
		final JPanel jPanelAccionesTipoDevolucion=this.jPanelAccionesTipoDevolucion;
		
		JPanel jPanelCamposAuxiliarTipoDevolucion=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoDevolucion=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoDevolucion!=null) {
			jPanelCamposAuxiliarTipoDevolucion=this.jInternalFrameDetalleFormTipoDevolucion.jPanelCamposTipoDevolucion;
			jPanelAccionesFormularioAuxiliarTipoDevolucion=this.jInternalFrameDetalleFormTipoDevolucion.jPanelAccionesFormularioTipoDevolucion;
		}
		
		final JPanel jPanelCamposTipoDevolucion=jPanelCamposAuxiliarTipoDevolucion;
		final JPanel jPanelAccionesFormularioTipoDevolucion=jPanelAccionesFormularioAuxiliarTipoDevolucion;
		
		
		final JMenuBar jmenuBarTipoDevolucion=this.jmenuBarTipoDevolucion;		
		final JToolBar jTtoolBarTipoDevolucion=this.jTtoolBarTipoDevolucion;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoDevolucion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoDevolucion=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoDevolucion!=null) {
			jmenuBarDetalleAuxiliarTipoDevolucion=this.jInternalFrameDetalleFormTipoDevolucion.jmenuBarDetalleTipoDevolucion;
			jTtoolBarDetalleAuxiliarTipoDevolucion=this.jInternalFrameDetalleFormTipoDevolucion.jTtoolBarDetalleTipoDevolucion;		
		}
		
		final JMenuBar jmenuBarDetalleTipoDevolucion=jmenuBarDetalleAuxiliarTipoDevolucion;
		final JToolBar jTtoolBarDetalleTipoDevolucion=jTtoolBarDetalleAuxiliarTipoDevolucion;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoDevolucion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoDevolucion;
			processRunnable.jTableDatos=jTableDatosTipoDevolucion;
			processRunnable.jPanelCampos=jPanelCamposTipoDevolucion;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoDevolucion;
			processRunnable.jPanelAcciones=jPanelAccionesTipoDevolucion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoDevolucion;
			
			
			processRunnable.jmenuBar=jmenuBarTipoDevolucion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoDevolucion;
			processRunnable.jTtoolBar=jTtoolBarTipoDevolucion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoDevolucion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoDevolucion ,jPanelParametrosReportesTipoDevolucion, jTableDatosTipoDevolucion,/*jScrollPanelDatosTipoDevolucion,*/jPanelCamposTipoDevolucion,jPanelPaginacionTipoDevolucion, /*jScrollPanelDatosEdicionTipoDevolucion,*/ jPanelAccionesTipoDevolucion,jPanelAccionesFormularioTipoDevolucion,jmenuBarTipoDevolucion,jmenuBarDetalleTipoDevolucion,jTtoolBarTipoDevolucion,jTtoolBarDetalleTipoDevolucion));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoDevolucion(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoDevolucion(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoDevolucion(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoDevolucion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoDevolucion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoDevolucion,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoDevolucion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoDevolucion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoDevolucion,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipodevolucionConstantesFunciones.getsFinalQueryTipoDevolucion();
		String  finalQueryPaginacionTodos=this.tipodevolucionConstantesFunciones.getsFinalQueryTipoDevolucion();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoDevolucionConstantesFunciones.getArrayColumnasGlobalesNoTipoDevolucion(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoDevolucionConstantesFunciones.getArrayColumnasGlobalesTipoDevolucion(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoDevolucionConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipodevolucionsEliminados= new ArrayList<TipoDevolucion>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoDevolucion();
		
				///*TipoDevolucionSessionBean*/this.tipodevolucionSessionBean=new TipoDevolucionSessionBean();
			
			if(this.tipodevolucionSessionBean==null) {
				this.tipodevolucionSessionBean=new TipoDevolucionSessionBean();
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
					this.iNumeroPaginacion=TipoDevolucionConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoDevolucionConstantesFunciones.getClassesForeignKeysOfTipoDevolucion(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipodevolucion."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipodevolucionsAux= new ArrayList<TipoDevolucion>();
			
				
			tipodevolucionLogic.setDatosCliente(this.datosCliente);
			tipodevolucionLogic.setDatosDeep(this.datosDeep);
			tipodevolucionLogic.setIsConDeep(true);
			
			
			tipodevolucionLogic.getTipoDevolucionDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipodevolucionLogic.getTodosTipoDevolucions(finalQueryGlobal,pagination);
					
					//tipodevolucionLogic.getTodosTipoDevolucionsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipodevolucionLogic.getTipoDevolucions()==null|| tipodevolucionLogic.getTipoDevolucions().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipodevolucionsAux= new ArrayList<TipoDevolucion>();
							tipodevolucionsAux.addAll(tipodevolucionLogic.getTipoDevolucions());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodevolucionsAux= new ArrayList<TipoDevolucion>();
							tipodevolucionsAux.addAll(tipodevolucions);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipodevolucionLogic.getTodosTipoDevolucions(finalQueryGlobal+"",this.pagination);												
							
							//tipodevolucionLogic.getTodosTipoDevolucionsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoDevolucions("Todos",tipodevolucionLogic.getTipoDevolucions() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipodevolucionLogic.setTipoDevolucions(new ArrayList<TipoDevolucion>());					
							tipodevolucionLogic.getTipoDevolucions().addAll(tipodevolucionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodevolucions=new ArrayList<TipoDevolucion>();
							tipodevolucions.addAll(tipodevolucionsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoDevolucion=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoDevolucion=this.idActual;
				
				} else if(this.idTipoDevolucionActual!=null && this.idTipoDevolucionActual!=0L) {
					idTipoDevolucion=idTipoDevolucionActual;
				}
				
					
				this.sDetalleReporte=TipoDevolucionConstantesFunciones.getDetalleIndicePorId(idTipoDevolucion);
				
				this.tipodevolucions=new ArrayList<TipoDevolucion>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipodevolucionLogic.getEntity(idTipoDevolucion);
					
					//tipodevolucionLogic.getEntityWithConnection(idTipoDevolucion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodevolucionLogic.setTipoDevolucions(new ArrayList<TipoDevolucion>());
					tipodevolucionLogic.getTipoDevolucions().add(tipodevolucionLogic.getTipoDevolucion());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipodevolucions=new ArrayList<TipoDevolucion>();
					this.tipodevolucions.add(tipodevolucion);
				}
				
				if(tipodevolucionLogic.getTipoDevolucion()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=TipoDevolucionConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipodevolucionLogic.getTipoDevolucionsBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoDevolucionConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoDevolucionConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipodevolucionLogic.getTipoDevolucions()==null||tipodevolucionLogic.getTipoDevolucions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipodevolucions==null|| tipodevolucions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodevolucionsAux=new ArrayList<TipoDevolucion>();
						tipodevolucionsAux.addAll(tipodevolucionLogic.getTipoDevolucions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodevolucionsAux=new ArrayList<TipoDevolucion>();
							tipodevolucionsAux.addAll(tipodevolucions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipodevolucionLogic.getTipoDevolucionsBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoDevolucionConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoDevolucionConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoDevolucions("BusquedaPorNombre",tipodevolucionLogic.getTipoDevolucions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoDevolucions("BusquedaPorNombre",tipodevolucions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodevolucionLogic.setTipoDevolucions(new ArrayList<TipoDevolucion>());
						tipodevolucionLogic.getTipoDevolucions().addAll(tipodevolucionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodevolucions=new ArrayList<TipoDevolucion>();
							tipodevolucions.addAll(tipodevolucionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPais")) {
				this.sDetalleReporte=TipoDevolucionConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipodevolucionLogic.getTipoDevolucionsFK_IdPais(finalQueryGlobal,pagination,id_paisFK_IdPais);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoDevolucionConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoDevolucionConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipodevolucionLogic.getTipoDevolucions()==null||tipodevolucionLogic.getTipoDevolucions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipodevolucions==null|| tipodevolucions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodevolucionsAux=new ArrayList<TipoDevolucion>();
						tipodevolucionsAux.addAll(tipodevolucionLogic.getTipoDevolucions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodevolucionsAux=new ArrayList<TipoDevolucion>();
							tipodevolucionsAux.addAll(tipodevolucions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipodevolucionLogic.getTipoDevolucionsFK_IdPais(finalQueryGlobal,pagination,id_paisFK_IdPais);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoDevolucionConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoDevolucionConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoDevolucions("FK_IdPais",tipodevolucionLogic.getTipoDevolucions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoDevolucions("FK_IdPais",tipodevolucions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodevolucionLogic.setTipoDevolucions(new ArrayList<TipoDevolucion>());
						tipodevolucionLogic.getTipoDevolucions().addAll(tipodevolucionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodevolucions=new ArrayList<TipoDevolucion>();
							tipodevolucions.addAll(tipodevolucionsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoDevolucion();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoDevolucion();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipodevolucionLogic.getTipoDevolucions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipodevolucions.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipodevolucionLogic.getTipoDevolucions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipodevolucions.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoDevolucion tipodevolucion) {
		Boolean permite=true;
		
		if(this.tipodevolucion.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoDevolucionConstantesFunciones.getOrderByListaTipoDevolucion();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoDevolucionConstantesFunciones.getOrderByListaTipoDevolucion();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoDevolucion tipodevolucion:tipodevolucionLogic.getTipoDevolucions()) {
				if(tipodevolucion.getsType().equals(Constantes2.S_TOTALES)) {
					tipodevolucionTotales=tipodevolucion;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoDevolucion tipodevolucion:this.tipodevolucions) {
				if(tipodevolucion.getsType().equals(Constantes2.S_TOTALES)) {
					tipodevolucionTotales=tipodevolucion;
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
			this.tipodevolucionAux=new TipoDevolucion();
			this.tipodevolucionAux.setsType(Constantes2.S_TOTALES);
			this.tipodevolucionAux.setIsNew(false);
			this.tipodevolucionAux.setIsChanged(false);
			this.tipodevolucionAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoDevolucionConstantesFunciones.TotalizarValoresFilaTipoDevolucion(this.tipodevolucionLogic.getTipoDevolucions(),this.tipodevolucionAux);
				
				this.tipodevolucionLogic.getTipoDevolucions().add(this.tipodevolucionAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoDevolucionConstantesFunciones.TotalizarValoresFilaTipoDevolucion(this.tipodevolucions,this.tipodevolucionAux);
				
				this.tipodevolucions.add(this.tipodevolucionAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipodevolucionTotales=new TipoDevolucion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipodevolucionLogic.getTipoDevolucions().remove(tipodevolucionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipodevolucions.remove(tipodevolucionTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipodevolucionTotales=new TipoDevolucion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoDevolucion tipodevolucion:tipodevolucionLogic.getTipoDevolucions()) {
				if(tipodevolucion.getsType().equals(Constantes2.S_TOTALES)) {
					tipodevolucionTotales=tipodevolucion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoDevolucionConstantesFunciones.TotalizarValoresFilaTipoDevolucion(this.tipodevolucionLogic.getTipoDevolucions(),tipodevolucionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoDevolucion tipodevolucion:this.tipodevolucions) {
				if(tipodevolucion.getsType().equals(Constantes2.S_TOTALES)) {
					tipodevolucionTotales=tipodevolucion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoDevolucionConstantesFunciones.TotalizarValoresFilaTipoDevolucion(this.tipodevolucions,tipodevolucionTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoDevolucionsBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoDevolucionsFK_IdPais()throws Exception {
		try {
			sAccionBusqueda="FK_IdPais";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoDevolucionPorNombre()throws Exception {
		try {
			sAccionBusqueda="PorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getTipoDevolucionsBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodevolucionLogic.getTipoDevolucionsBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoDevolucionsFK_IdPais(String sFinalQuery,Long id_pais)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodevolucionLogic.getTipoDevolucionsFK_IdPais(sFinalQuery,this.pagination,id_pais);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoDevolucionPorNombre(String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodevolucionLogic.getTipoDevolucionPorNombre(nombre);
				
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
	
	public void inicializarPermisosTipoDevolucion() {
		this.isPermisoTodoTipoDevolucion=false;
		this.isPermisoNuevoTipoDevolucion=false;
		this.isPermisoActualizarTipoDevolucion=false;
		this.isPermisoActualizarOriginalTipoDevolucion=false;
		this.isPermisoEliminarTipoDevolucion=false;
		this.isPermisoGuardarCambiosTipoDevolucion=false;
		this.isPermisoConsultaTipoDevolucion=false;
		this.isPermisoBusquedaTipoDevolucion=false;
		this.isPermisoReporteTipoDevolucion=false;		
		this.isPermisoOrdenTipoDevolucion=false;		
		this.isPermisoPaginacionMedioTipoDevolucion=false;		
		this.isPermisoPaginacionAltoTipoDevolucion=false;
		this.isPermisoPaginacionTodoTipoDevolucion=false;
		this.isPermisoCopiarTipoDevolucion=false;		
		this.isPermisoVerFormTipoDevolucion=false;		
		this.isPermisoDuplicarTipoDevolucion=false;		
		this.isPermisoOrdenTipoDevolucion=false;		
	}
	
	public void setPermisosUsuarioTipoDevolucion(Boolean isPermiso) {
		this.isPermisoTodoTipoDevolucion=isPermiso;
		this.isPermisoNuevoTipoDevolucion=isPermiso;
		this.isPermisoActualizarTipoDevolucion=isPermiso;
		this.isPermisoActualizarOriginalTipoDevolucion=isPermiso;
		this.isPermisoEliminarTipoDevolucion=isPermiso;
		this.isPermisoGuardarCambiosTipoDevolucion=isPermiso;
		this.isPermisoConsultaTipoDevolucion=isPermiso;
		this.isPermisoBusquedaTipoDevolucion=isPermiso;
		this.isPermisoReporteTipoDevolucion=isPermiso;
		this.isPermisoOrdenTipoDevolucion=isPermiso;		
		this.isPermisoPaginacionMedioTipoDevolucion=isPermiso;		
		this.isPermisoPaginacionAltoTipoDevolucion=isPermiso;		
		this.isPermisoPaginacionTodoTipoDevolucion=isPermiso;		
		this.isPermisoCopiarTipoDevolucion=isPermiso;		
		this.isPermisoVerFormTipoDevolucion=isPermiso;		
		this.isPermisoDuplicarTipoDevolucion=isPermiso;
		this.isPermisoOrdenTipoDevolucion=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoDevolucion(Boolean isPermiso) {
		//this.isPermisoTodoTipoDevolucion=isPermiso;
		this.isPermisoNuevoTipoDevolucion=isPermiso;
		this.isPermisoActualizarTipoDevolucion=isPermiso;
		this.isPermisoActualizarOriginalTipoDevolucion=isPermiso;
		this.isPermisoEliminarTipoDevolucion=isPermiso;
		this.isPermisoGuardarCambiosTipoDevolucion=isPermiso;
		//this.isPermisoConsultaTipoDevolucion=isPermiso;
		//this.isPermisoBusquedaTipoDevolucion=isPermiso;
		//this.isPermisoReporteTipoDevolucion=isPermiso;
		//this.isPermisoOrdenTipoDevolucion=isPermiso;		
		//this.isPermisoPaginacionMedioTipoDevolucion=isPermiso;		
		//this.isPermisoPaginacionAltoTipoDevolucion=isPermiso;		
		//this.isPermisoPaginacionTodoTipoDevolucion=isPermiso;		
		//this.isPermisoCopiarTipoDevolucion=isPermiso;		
		//this.isPermisoDuplicarTipoDevolucion=isPermiso;
		//this.isPermisoOrdenTipoDevolucion=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoDevolucionClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoDevolucionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoDevolucion(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoDevolucionClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoDevolucionClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoDevolucionClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoDevolucionClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoDevolucion() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoDevolucionJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipodevolucionSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoDevolucionConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoDevolucion=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoDevolucion=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoDevolucion=this.isPermisoActualizarTipoDevolucion;
			this.isPermisoEliminarTipoDevolucion=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoDevolucion=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoDevolucion=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoDevolucion=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoDevolucion=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoDevolucion=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoDevolucion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoDevolucion=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoDevolucion=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoDevolucion=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoDevolucion=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoDevolucion=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoDevolucion=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoDevolucion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipodevolucionSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoDevolucion.setToolTipText(this.jTableDatosTipoDevolucion.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoDevolucion(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoDevolucion(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoDevolucionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoDevolucionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoDevolucion() throws Exception {
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
	public void inicializarCombosForeignKeyTipoDevolucionListas()throws Exception {
		try	{						
			
				this.paissForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoDevolucionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoDevolucionJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoDevolucionListas(false);
			} else {
			
				this.cargarCombosForeignKeyPaisListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyPaisListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.paissForeignKey==null||this.paissForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=PaisConstantesFunciones.getArrayColumnasGlobalesPais(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PaisConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=PaisConstantesFunciones.SFINALQUERY;

				this.cargarCombosPaissForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyTipoDevolucionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoDevolucionParameterReturnGeneral tipodevolucionReturnGeneral=new TipoDevolucionParameterReturnGeneral();
						
			


				String finalQueryGlobalPais="";

				if(((this.paissForeignKey==null||this.paissForeignKey.size()<=0) && this.tipodevolucionConstantesFunciones.cargarid_paisTipoDevolucion)
					 || (this.esRecargarFks && this.tipodevolucionConstantesFunciones.cargarid_paisTipoDevolucion)) {

					if(!this.tipodevolucionSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PaisConstantesFunciones.getArrayColumnasGlobalesPais(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPais=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PaisConstantesFunciones.TABLENAME);

						finalQueryGlobalPais=Funciones.GetFinalQueryAppend(finalQueryGlobalPais, "");
						finalQueryGlobalPais+=PaisConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPaissForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPais=" WHERE " + ConstantesSql.ID + "="+tipodevolucionSessionBean.getlidPaisActual();
					}
				} else {
					finalQueryGlobalPais="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipodevolucionReturnGeneral=tipodevolucionLogic.cargarCombosLoteForeignKeyTipoDevolucion(finalQueryGlobalPais);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalPais.equals("NONE")) {
				this.paissForeignKey=tipodevolucionReturnGeneral.getpaissForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoDevolucion()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyPais();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyPais()throws Exception {
		try {
			if(this.tipodevolucionSessionBean==null) {
				this.tipodevolucionSessionBean=new TipoDevolucionSessionBean();
			}

			if(!this.tipodevolucionSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {
				Pais pais=new Pais();
				PaisConstantesFunciones.setPaisDescripcion(pais,Constantes.SMENSAJE_ESCOJA_OPCION);
				pais.setId(null);

				if(!PaisConstantesFunciones.ExisteEnLista(this.paissForeignKey,pais,true)) {

					this.paissForeignKey.add(0,pais);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyTipoDevolucion()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoDevolucion(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoDevolucion()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoDevolucion();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoDevolucion(TipoDevolucion tipodevolucion)throws Exception {	
		try {
			
			this.setActualPaisForeignKey(tipodevolucion.getid_pais(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoDevolucion(TipoDevolucion tipodevolucion,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoDevolucion()throws Exception {	
		try {
			
			this.setActualPaisForeignKey(this.tipodevolucionConstantesFunciones.getid_pais(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoDevolucion()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoDevolucion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoDevolucion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoDevolucion()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoDevolucion()throws Exception {
		try {
			

			this.cargarCombosFramePaissForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoDevolucion(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFramePaissForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoDevolucion()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoDevolucion.jComboBoxid_paisTipoDevolucion!=null && this.jInternalFrameDetalleFormTipoDevolucion.jComboBoxid_paisTipoDevolucion.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoDevolucion.jComboBoxid_paisTipoDevolucion.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoDevolucionBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoDevolucionBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoDevolucionBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipodevolucionSessionBean=new TipoDevolucionSessionBean(); 
		this.tipodevolucionConstantesFunciones=new TipoDevolucionConstantesFunciones(); 
		this.tipodevolucionBean=new TipoDevolucion();//(this.tipodevolucionConstantesFunciones); 		
		this.tipodevolucionReturnGeneral=new TipoDevolucionParameterReturnGeneral(); 
		
		this.tipodevolucionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipodevolucionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoDevolucionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoDevolucionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoDevolucionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoDevolucion(true);
			
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
			
			this.tipodevolucionConstantesFunciones=new TipoDevolucionConstantesFunciones(); 
			this.tipodevolucionBean=new TipoDevolucion();//this.tipodevolucionConstantesFunciones); 			
			this.tipodevolucionReturnGeneral=new TipoDevolucionParameterReturnGeneral(); 
		
			TipoDevolucionBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Devolucion Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipodevolucion=new TipoDevolucion();
			this.tipodevolucions = new ArrayList<TipoDevolucion>();
			this.tipodevolucionsAux = new ArrayList<TipoDevolucion>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionLogic=new TipoDevolucionLogic();
				this.tipodevolucionLogic.getNewConnexionToDeep("");
			}
			
			//this.tipodevolucionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipodevolucionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoDevolucion);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoDevolucion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoDevolucion);	
					}
					
					if(this.jInternalFrameImportacionTipoDevolucion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoDevolucion);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoDevolucion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoDevolucion);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoDevolucion!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoDevolucion);
				this.jInternalFrameDetalleFormTipoDevolucion.setVisible(false);
				this.jInternalFrameDetalleFormTipoDevolucion.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoDevolucion!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoDevolucion);
					this.jInternalFrameReporteDinamicoTipoDevolucion.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoDevolucion.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoDevolucion!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoDevolucion);
					this.jInternalFrameImportacionTipoDevolucion.setVisible(false);
					this.jInternalFrameImportacionTipoDevolucion.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoDevolucion!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoDevolucion);
					this.jInternalFrameOrderByTipoDevolucion.setVisible(false);
					this.jInternalFrameOrderByTipoDevolucion.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoDevolucionActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoDevolucionConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipodevolucionReturnGeneral=new TipoDevolucionParameterReturnGeneral();
			
			this.tipodevolucionParameterGeneral=new TipoDevolucionParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipodevolucionLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipodevolucionSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoDevolucionJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipodevolucionSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoDevolucionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipodevolucionSessionBean.getEsGuardarRelacionado(),this.tipodevolucionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoDevolucionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipodevolucionSessionBean.getEsGuardarRelacionado(),this.tipodevolucionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoDevolucion=false;
			this.isVisibilidadCeldaDuplicarTipoDevolucion=true;
			this.isVisibilidadCeldaCopiarTipoDevolucion=true;
			this.isVisibilidadCeldaVerFormTipoDevolucion=true;
			this.isVisibilidadCeldaOrdenTipoDevolucion=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoDevolucion=false;
			this.isVisibilidadCeldaModificarTipoDevolucion=false;
			this.isVisibilidadCeldaActualizarTipoDevolucion=false;
			this.isVisibilidadCeldaEliminarTipoDevolucion=false;
			this.isVisibilidadCeldaCancelarTipoDevolucion=false;
			this.isVisibilidadCeldaGuardarTipoDevolucion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDevolucion=false;
			
			
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadFK_IdPais=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoDevolucion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoDevolucion();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoDevolucion(false);
			
			this.setPermisosUsuarioTipoDevolucion();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipodevolucionSessionBean.getEsGuardarRelacionado() 
				|| (this.tipodevolucionSessionBean.getEsGuardarRelacionado() && this.tipodevolucionSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoDevolucionClasesRelacionadas();
			}
			
			if(this.tipodevolucionSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoDevolucionClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoDevolucionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoDevolucion();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoDevolucion();
			}
			
			if(!this.isPermisoBusquedaTipoDevolucion) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoDevolucion.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipodevolucionSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoDevolucion,this.isPermisoPaginacionMedioTipoDevolucion,this.isPermisoPaginacionTodoTipoDevolucion);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoDevolucionConstantesFunciones.getTiposSeleccionarTipoDevolucion());
				
				this.tiposColumnasSelect=TipoDevolucionConstantesFunciones.getTiposSeleccionarTipoDevolucion(true);
				
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
			//if(!this.tipodevolucionSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoDevolucion();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoDevolucion(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoDevolucion(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoDevolucion() ;
			
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
			
			this.paisLogic=new PaisLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				tipodevolucionImplementable= (TipoDevolucionImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoDevolucionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipodevolucionImplementableHome= (TipoDevolucionImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoDevolucionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipodevolucions= new ArrayList<TipoDevolucion>();
			this.tipodevolucionsEliminados= new ArrayList<TipoDevolucion>();
						
			this.isEsNuevoTipoDevolucion=false;
			this.esParaAccionDesdeFormularioTipoDevolucion=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.paissForeignKey=new ArrayList<Pais>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoDevolucion(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoDevolucion();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipodevolucionSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoDevolucionConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoDevolucion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoDevolucion(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoDevolucion!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoDevolucion();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoDevolucion();
			}
			
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoDevolucion.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoDevolucion.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoDevolucion.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoDevolucion(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoDevolucion: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoDevolucion() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoDevolucion")) {
				iIndex=this.jInternalFrameDetalleFormTipoDevolucion.jTabbedPaneRelacionesTipoDevolucion.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoDevolucion.jTabbedPaneRelacionesTipoDevolucion.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoDevolucion.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoDevolucion();	
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
	
	public void cargarCombosForeignKeyTipoDevolucion(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoDevolucion(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoDevolucion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoDevolucionListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoDevolucion();
		
		this.cargarCombosFrameForeignKeyTipoDevolucion();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoDevolucion();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoDevolucion();
		}
	}
	
	

	public void cargarCombosForeignKeyPais(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyPaisListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyPais();
				this.cargarCombosFramePaissForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaPais(this.paissForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoTipoDevolucionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipodevolucionSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoDevolucion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoDevolucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipodevolucion,new Object(),this.tipodevolucionParameterGeneral,this.tipodevolucionReturnGeneral);
			
			
			if(jTableDatosTipoDevolucion.getRowCount()>=1) {
				jTableDatosTipoDevolucion.removeRowSelectionInterval(0, jTableDatosTipoDevolucion.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoDevolucion=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoDevolucion(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoDevolucion(true);			
			//this.tipodevolucion=new TipoDevolucion();
			//this.tipodevolucion.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoDevolucion(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoDevolucion() ;
			
			if(TipoDevolucionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoDevolucion(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipodevolucion);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipodevolucion);				
			
			TipoDevolucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipodevolucion,new Object(),this.tipodevolucionParameterGeneral,this.tipodevolucionReturnGeneral);
			
			if(this.tipodevolucionSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoDevolucion: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoDevolucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipodevolucion,new Object(),this.tipodevolucionParameterGeneral,this.tipodevolucionReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoDevolucionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoDevolucion> tipodevolucionsSeleccionados=new ArrayList<TipoDevolucion>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoDevolucion.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoDevolucion.getSelectedRows().length;			
			}
			
			tipodevolucionsSeleccionados=this.getTipoDevolucionsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoDevolucion--;			
				//TipoDevolucion tipodevolucionAux= new TipoDevolucion();			
				//tipodevolucionAux.setId(this.iIdNuevoTipoDevolucion);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoDevolucion tipodevolucionOrigen=new TipoDevolucion();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoDevolucion tipodevolucionOrigen : tipodevolucionsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoDevolucion.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipodevolucionOrigen =(TipoDevolucion) this.tipodevolucionLogic.getTipoDevolucions().toArray()[this.jTableDatosTipoDevolucion.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodevolucionOrigen =(TipoDevolucion) this.tipodevolucions.toArray()[this.jTableDatosTipoDevolucion.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoDevolucion();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipodevolucion.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoDevolucion(tipodevolucionOrigen,this.tipodevolucion,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDevolucion(this.tipodevolucion);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipodevolucionLogic.getTipoDevolucions().add(this.tipodevolucionAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipodevolucions.add(this.tipodevolucionAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoDevolucion(false);
				
				this.jTableDatosTipoDevolucion.setRowSelectionInterval(this.getIndiceNuevoTipoDevolucion(), this.getIndiceNuevoTipoDevolucion());
				
				int iLastRow =  this.jTableDatosTipoDevolucion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoDevolucion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoDevolucion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoDevolucion(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoDevolucionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoDevolucion> tipodevolucionsSeleccionados=new ArrayList<TipoDevolucion>();									
		
			TipoDevolucion tipodevolucionOrigen=new TipoDevolucion();
			TipoDevolucion tipodevolucionDestino=new TipoDevolucion();
				
			tipodevolucionsSeleccionados=this.getTipoDevolucionsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoDevolucion.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipodevolucionsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoDevolucion.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodevolucionOrigen =(TipoDevolucion) this.tipodevolucionLogic.getTipoDevolucions().toArray()[this.jTableDatosTipoDevolucion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipodevolucionOrigen =(TipoDevolucion) this.tipodevolucions.toArray()[this.jTableDatosTipoDevolucion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodevolucionDestino =(TipoDevolucion) this.tipodevolucionLogic.getTipoDevolucions().toArray()[this.jTableDatosTipoDevolucion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipodevolucionDestino =(TipoDevolucion) this.tipodevolucions.toArray()[this.jTableDatosTipoDevolucion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipodevolucionOrigen =tipodevolucionsSeleccionados.get(0);
				tipodevolucionDestino =tipodevolucionsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoDevolucion(tipodevolucionOrigen,tipodevolucionDestino,true,false);
				
				tipodevolucionDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipodevolucionDestino,tipodevolucionLogic.getTipoDevolucions());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipodevolucionDestino,tipodevolucions);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoDevolucion(false);
				
				//this.jTableDatosTipoDevolucion.setRowSelectionInterval(this.getIndiceNuevoTipoDevolucion(), this.getIndiceNuevoTipoDevolucion());
				
				int iLastRow =  this.jTableDatosTipoDevolucion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoDevolucion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoDevolucion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoDevolucion(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoDevolucionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoDevolucion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoDevolucion.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoDevolucionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoDevolucion.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoDevolucion.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoDevolucion.setVisible(!isVisible);
			this.jPanelPaginacionTipoDevolucion.setVisible(!isVisible);
			this.jPanelAccionesTipoDevolucion.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoDevolucionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoDevolucion();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoDevolucionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoDevolucion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoDevolucionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoDevolucion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoDevolucionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoDevolucion();
			
			this.abrirFrameOrderByTipoDevolucion();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoDevolucionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoDevolucion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoDevolucion(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoDevolucion);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoDevolucion.isMaximum()) {
					this.jInternalFrameDetalleFormTipoDevolucion.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoDevolucion.setSize(this.jInternalFrameDetalleFormTipoDevolucion.iWidthFormulario,this.jInternalFrameDetalleFormTipoDevolucion.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoDevolucion.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoDevolucion.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoDevolucion.isMaximum()) {
						this.jInternalFrameDetalleFormTipoDevolucion.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoDevolucion.jContentPaneDetalleTipoDevolucion.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoDevolucion.jTabbedPaneRelacionesTipoDevolucion.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoDevolucion.jContentPaneDetalleTipoDevolucion.getWidth(),TipoDevolucionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoDevolucion.jTabbedPaneRelacionesTipoDevolucion.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoDevolucion.jContentPaneDetalleTipoDevolucion.getWidth(),TipoDevolucionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoDevolucion.jTabbedPaneRelacionesTipoDevolucion.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoDevolucion.jContentPaneDetalleTipoDevolucion.getWidth(),TipoDevolucionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoDevolucion.setVisible(true);
	        this.jInternalFrameDetalleFormTipoDevolucion.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoDevolucion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoDevolucion==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoDevolucion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoDevolucion,false,this);
				} else {
					this.jInternalFrameOrderByTipoDevolucion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoDevolucion,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoDevolucion);
				this.jInternalFrameOrderByTipoDevolucion.setVisible(false);
				this.jInternalFrameOrderByTipoDevolucion.setSelected(false);
				
				this.jInternalFrameOrderByTipoDevolucion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoDevolucion"));
				
				this.inicializarActualizarBindingTablaOrderByTipoDevolucion();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoDevolucion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoDevolucion==null) {
				
				this.jInternalFrameImportacionTipoDevolucion=new ImportacionJInternalFrame(TipoDevolucionConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoDevolucion);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoDevolucion);
				this.jInternalFrameImportacionTipoDevolucion.setVisible(false);
				this.jInternalFrameImportacionTipoDevolucion.setSelected(false);


				this.jInternalFrameImportacionTipoDevolucion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoDevolucion"));
				this.jInternalFrameImportacionTipoDevolucion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoDevolucion"));
				this.jInternalFrameImportacionTipoDevolucion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoDevolucion"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoDevolucion() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoDevolucion==null) {
				this.jInternalFrameReporteDinamicoTipoDevolucion=new ReporteDinamicoJInternalFrame(TipoDevolucionConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoDevolucion);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoDevolucion);
				this.jInternalFrameReporteDinamicoTipoDevolucion.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoDevolucion.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoDevolucion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoDevolucion"));
				this.jInternalFrameReporteDinamicoTipoDevolucion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoDevolucion"));
				this.jInternalFrameReporteDinamicoTipoDevolucion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoDevolucion"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoDevolucion();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleTipoDevolucion() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoDevolucion);
			
	       	this.jInternalFrameDetalleFormTipoDevolucion.setVisible(false);
	        this.jInternalFrameDetalleFormTipoDevolucion.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoDevolucion.dispose();
			//this.jInternalFrameDetalleFormTipoDevolucion=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoDevolucion() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoDevolucion.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoDevolucion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoDevolucion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoDevolucion.setVisible(true);
	        this.jInternalFrameImportacionTipoDevolucion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoDevolucion() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoDevolucion.setVisible(true);
	        this.jInternalFrameOrderByTipoDevolucion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoDevolucion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoDevolucion.setVisible(false);
	        this.jInternalFrameOrderByTipoDevolucion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoDevolucion() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoDevolucion.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoDevolucion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoDevolucion() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoDevolucion.setVisible(false);
	        this.jInternalFrameImportacionTipoDevolucion.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoDevolucionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoDevolucion(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoDevolucion(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoDevolucion.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoDevolucion(true);
			//this.isEsNuevoTipoDevolucion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucion =(TipoDevolucion) this.tipodevolucionLogic.getTipoDevolucions().toArray()[this.jTableDatosTipoDevolucion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipodevolucion =(TipoDevolucion) this.tipodevolucions.toArray()[this.jTableDatosTipoDevolucion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoDevolucion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoDevolucion(false) ;
			
			if(tipodevolucionSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoDevolucionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoDevolucion(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoDevolucion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoDevolucionActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoDevolucion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodevolucion =(TipoDevolucion) this.tipodevolucionLogic.getTipoDevolucions().toArray()[this.jTableDatosTipoDevolucion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodevolucion =(TipoDevolucion) this.tipodevolucions.toArray()[this.jTableDatosTipoDevolucion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoDevolucion(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoDevolucion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoDevolucion.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoDevolucion(true);
			//this.isEsNuevoTipoDevolucion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucion =(TipoDevolucion) this.tipodevolucionLogic.getTipoDevolucions().toArray()[this.jTableDatosTipoDevolucion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipodevolucion =(TipoDevolucion) this.tipodevolucions.toArray()[this.jTableDatosTipoDevolucion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipodevolucion.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoDevolucion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoDevolucion(false) ;
			
			if(TipoDevolucionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoDevolucion(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoDevolucion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaPais(List<Pais> paissForeignKey)throws Exception{
		TableColumn tableColumnPais=this.jTableDatosTipoDevolucion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDevolucion,TipoDevolucionConstantesFunciones.LABEL_IDPAIS));
		TableCellEditor tableCellEditorPais =tableColumnPais.getCellEditor();

		PaisTableCell paisTableCellFk=(PaisTableCell)tableCellEditorPais;

		if(paisTableCellFk!=null) {
			paisTableCellFk.setpaissForeignKey(paissForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTipoDevolucion.getSelectedRow();

		//if(intSelectedRow<=0) {
			//paisTableCellFk.setRowActual(intSelectedRow);
			//paisTableCellFk.setpaissForeignKeyActual(paissForeignKey);
		//}


		if(paisTableCellFk!=null) {
			paisTableCellFk.RecargarPaissForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarTipoDevolucionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoDevolucion(false);
			
			//if(!this.isEsNuevoTipoDevolucion) {								
				int intSelectedRow = this.jTableDatosTipoDevolucion.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodevolucion =(TipoDevolucion) this.tipodevolucionLogic.getTipoDevolucions().toArray()[this.jTableDatosTipoDevolucion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipodevolucion =(TipoDevolucion) this.tipodevolucions.toArray()[this.jTableDatosTipoDevolucion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoDevolucionJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoDevolucion(this.tipodevolucion,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoDevolucion(this.tipodevolucion);
				
			}
			
			if(this.permiteMantenimiento(this.tipodevolucion)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipodevolucionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoDevolucion=true;
					this.inicializarActualizarBindingTablaTipoDevolucion(false);
					this.isEsNuevoTipoDevolucion=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoDevolucion=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoDevolucion=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoDevolucion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoDevolucion(false);
				
				this.habilitarDeshabilitarControlesTipoDevolucion(false);
			
												
				
				if(TipoDevolucionJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoDevolucion();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoDevolucionActionPerformed(evt,tipodevolucionSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoDevolucion(this.tipodevolucion,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoDevolucion.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipodevolucionSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipodevolucion.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoDevolucion.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDevolucion.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoDevolucionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoDevolucion.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucion =(TipoDevolucion) this.tipodevolucionLogic.getTipoDevolucions().toArray()[this.jTableDatosTipoDevolucion.convertRowIndexToModel(intSelectedRow)];
				this.tipodevolucion.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipodevolucion =(TipoDevolucion) this.tipodevolucions.toArray()[this.jTableDatosTipoDevolucion.convertRowIndexToModel(intSelectedRow)];
				this.tipodevolucion.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipodevolucion)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipodevolucionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoDevolucionModel) this.jTableDatosTipoDevolucion.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoDevolucion=true;
				this.inicializarActualizarBindingTablaTipoDevolucion(false);
				this.isEsNuevoTipoDevolucion=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoDevolucion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoDevolucion(false);
				
				this.habilitarDeshabilitarControlesTipoDevolucion(false);
				
				
				
				if(TipoDevolucionJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoDevolucion();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoDevolucionActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoDevolucion.getRowCount()>=1) {
				jTableDatosTipoDevolucion.removeRowSelectionInterval(0, jTableDatosTipoDevolucion.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoDevolucion(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoDevolucion(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoDevolucion(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoDevolucion(false) ;
			
			this.isEsNuevoTipoDevolucion=false;
			
			if(TipoDevolucionJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoDevolucion();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoDevolucionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoDevolucion(false);
				
				//SI ES MANUAL
				if(TipoDevolucionJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoDevolucion();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoDevolucionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoDevolucion--;			
			//TipoDevolucion tipodevolucionAux= new TipoDevolucion();			
			//tipodevolucionAux.setId(this.iIdNuevoTipoDevolucion);
			
			if(this.jInternalFrameDetalleFormTipoDevolucion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoDevolucion();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoDevolucion(this.tipodevolucion);
			
			this.tipodevolucion.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipodevolucionLogic.getTipoDevolucions().add(this.tipodevolucionAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipodevolucions.add(this.tipodevolucionAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoDevolucion(false);
			
			this.jTableDatosTipoDevolucion.setRowSelectionInterval(this.getIndiceNuevoTipoDevolucion(), this.getIndiceNuevoTipoDevolucion());
			
			int iLastRow =  this.jTableDatosTipoDevolucion.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoDevolucion.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoDevolucion.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoDevolucion(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoDevolucionActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoDevolucion(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoDevolucion(false);
			
			//SI ES MANUAL
			if(TipoDevolucionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoDevolucion();
			}
			
			//this.abrirFrameTreeTipoDevolucion();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoDevolucionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo DevolucionS ?", "MANTENIMIENTO DE Tipo Devolucion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoDevolucion.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoDevolucion();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipodevolucionReturnGeneral=tipodevolucionLogic.procesarImportacionTipoDevolucionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipodevolucionParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoDevolucionReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoDevolucionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoDevolucion.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoDevolucion.setFileImportacion(this.jInternalFrameImportacionTipoDevolucion.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoDevolucion.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoDevolucion.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoDevolucion.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoDevolucion.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoDevolucionActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoDevolucion> tipodevolucionsSeleccionados=new ArrayList<TipoDevolucion>();		

		tipodevolucionsSeleccionados=this.getTipoDevolucionsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoDevolucion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoDevolucion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoDevolucionBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoDevolucionBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoDevolucions("Todos",tipodevolucionsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodevolucionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Devolucion",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoDevolucion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoDevolucion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoDevolucionConstantesFunciones.LABEL_IDPAIS:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Pais_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Pais_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Pais_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Pais_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoDevolucionConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoDevolucion.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoDevolucion.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoDevolucion.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoDevolucionConstantesFunciones.LABEL_IDPAIS:
					sNombreCampoCategoria="id_pais";
					break;

				case TipoDevolucionConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoDevolucion.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoDevolucionConstantesFunciones.LABEL_IDPAIS:
					sNombreCampoCategoriaValor="id_pais";
					break;

				case TipoDevolucionConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoDevolucion.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoDevolucion.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoDevolucionConstantesFunciones.LABEL_IDPAIS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Pais",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_pais");
					break;

				case TipoDevolucionConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoDevolucionActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoDevolucion> tipodevolucionsSeleccionados=new ArrayList<TipoDevolucion>();		
		
		tipodevolucionsSeleccionados=this.getTipoDevolucionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodevolucion";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoDevolucions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoDevolucion.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoDevolucion.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoDevolucionConstantesFunciones.LABEL_IDPAIS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoDevolucionConstantesFunciones.LABEL_IDPAIS);
					iRow++;

					for(TipoDevolucion tipodevolucion:tipodevolucionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipodevolucion.getpais_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoDevolucionConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoDevolucionConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoDevolucion tipodevolucion:tipodevolucionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipodevolucion.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoDevolucion(row);				
			//	iRow++;
			//}				
			
			//for(TipoDevolucion tipodevolucionAux:tipodevolucionsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoDevolucion(tipodevolucionAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodevolucionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Devolucion",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipodevolucionLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoDevolucion(false);
			
			//SI ES MANUAL
			if(TipoDevolucionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoDevolucion();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoDevolucionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoDevolucion(false);
			
			//SI ES MANUAL
			if(TipoDevolucionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoDevolucion();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoDevolucionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoDevolucion(false);
			
			//SI ES MANUAL
			if(TipoDevolucionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoDevolucion();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoDevolucion() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoDevolucion.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoDevolucion.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoDevolucion.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoDevolucion.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoDevolucion.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoDevolucion.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoDevolucion.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoDevolucion(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoDevolucion(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoDevolucion(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoDevolucion(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoDevolucion(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipodevolucionSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoDevolucion(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoDevolucion(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoDevolucion(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoDevolucionJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoDevolucionJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoDevolucion() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoDevolucion();
		
		this.inicializarActualizarBindingBotonesManualTipoDevolucion(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipodevolucionSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoDevolucion();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoDevolucion() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoDevolucion(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoDevolucion(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoDevolucion.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoDevolucion.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoDevolucion.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoDevolucion!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoDevolucion.jCheckBoxPostAccionNuevoTipoDevolucion.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoDevolucion.jCheckBoxPostAccionSinCerrarTipoDevolucion.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoDevolucion.jCheckBoxPostAccionSinMensajeTipoDevolucion.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoDevolucion.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoDevolucion.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoDevolucion.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoDevolucion!=null) {
				this.jInternalFrameDetalleFormTipoDevolucion.jCheckBoxPostAccionNuevoTipoDevolucion.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoDevolucion.jCheckBoxPostAccionSinCerrarTipoDevolucion.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoDevolucion.jCheckBoxPostAccionSinMensajeTipoDevolucion.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoDevolucion.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoDevolucion.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoDevolucion!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoDevolucion.jComboBoxTiposAccionesFormularioTipoDevolucion.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoDevolucion.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoDevolucion!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoDevolucion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoDevolucion.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoDevolucion.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoDevolucion.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoDevolucion.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoDevolucion!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoDevolucion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoDevolucion.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoDevolucion.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoDevolucion(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoDevolucionJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoDevolucion(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoDevolucion() throws Exception {
		try	{
			if(TipoDevolucionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoDevolucion();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoDevolucion() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoDevolucion.jComboBoxTiposAccionesFormularioTipoDevolucion.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoDevolucion.jComboBoxTiposAccionesFormularioTipoDevolucion.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoDevolucion() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoDevolucion.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoDevolucion.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoDevolucion.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoDevolucion.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoDevolucion.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoDevolucion.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoDevolucion.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoDevolucion.addItem(reporte);
			}
			
			
			if(!this.tipodevolucionSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoDevolucion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoDevolucion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoDevolucion.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoDevolucion.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoDevolucion.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoDevolucion.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoDevolucion!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoDevolucion.jComboBoxTiposAccionesFormularioTipoDevolucion.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoDevolucion.jComboBoxTiposAccionesFormularioTipoDevolucion.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoDevolucion.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoDevolucion.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoDevolucion.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoDevolucion();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoDevolucion() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoDevolucion!=null) {
				this.jInternalFrameReporteDinamicoTipoDevolucion.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoDevolucion.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoDevolucion!=null) {
				this.jInternalFrameReporteDinamicoTipoDevolucion.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoDevolucion.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoDevolucion!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoDevolucion.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoDevolucion.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoDevolucion.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoDevolucion.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoDevolucion.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoDevolucion.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoDevolucion()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreTipoDevolucion.getText();
		if(this.jComboBoxid_paisFK_IdPaisTipoDevolucion.getSelectedItem()!=null){this.id_paisFK_IdPais=((Pais)this.jComboBoxid_paisFK_IdPaisTipoDevolucion.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoDevolucion(Boolean esInicializar) throws Exception {				
		if(TipoDevolucionJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoDevolucion();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoDevolucion() throws Exception {
		this.inicializarActualizarBindingTablaTipoDevolucion(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoDevolucion() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoDevolucion.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoDevolucion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoDevolucion.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoDevolucionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoDevolucion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoDevolucion.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoDevolucionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoDevolucionOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDevolucionOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoDevolucionPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoDevolucion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoDevolucion.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoDevolucionPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoDevolucion.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoDevolucion(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipodevolucionLogic.getTipoDevolucions().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipodevolucions.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoDevolucionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoDevolucion.setModel(new TipoDevolucionModel(this.tipodevolucionLogic.getTipoDevolucions(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoDevolucion.setModel(new TipoDevolucionModel(this.tipodevolucions,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoDevolucion!=null && this.jInternalFrameOrderByTipoDevolucion.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoDevolucion();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoDevolucion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDevolucion,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoDevolucionPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoDevolucionConstantesFunciones.SCLASSWEBTITULO,tipodevolucionConstantesFunciones.resaltarSeleccionarTipoDevolucion,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoDevolucionConstantesFunciones.SCLASSWEBTITULO,tipodevolucionConstantesFunciones.resaltarSeleccionarTipoDevolucion,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoDevolucion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDevolucion,TipoDevolucionConstantesFunciones.LABEL_ID));

		if(this.tipodevolucionConstantesFunciones.mostraridTipoDevolucion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoDevolucionConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipodevolucionConstantesFunciones.resaltaridTipoDevolucion,this.tipodevolucionConstantesFunciones.activaridTipoDevolucion,this,true,"idTipoDevolucion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipodevolucionConstantesFunciones.resaltaridTipoDevolucion,this.tipodevolucionConstantesFunciones.activaridTipoDevolucion,this,true,"idTipoDevolucion","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoDevolucion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDevolucion,TipoDevolucionConstantesFunciones.LABEL_IDPAIS));

		if(this.tipodevolucionConstantesFunciones.mostrarid_paisTipoDevolucion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoDevolucionConstantesFunciones.LABEL_IDPAIS,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new PaisTableCell(this.paissForeignKey,this.tipodevolucionConstantesFunciones.resaltarid_paisTipoDevolucion,this,this.tipodevolucionConstantesFunciones.activarid_paisTipoDevolucion));
			tableColumn.setCellEditor(new PaisTableCell(this.paissForeignKey,this.tipodevolucionConstantesFunciones.resaltarid_paisTipoDevolucion,this,this.tipodevolucionConstantesFunciones.activarid_paisTipoDevolucion,true,"id_paisTipoDevolucion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoDevolucionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoDevolucion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDevolucion,TipoDevolucionConstantesFunciones.LABEL_NOMBRE));

		if(this.tipodevolucionConstantesFunciones.mostrarnombreTipoDevolucion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoDevolucionConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipodevolucionConstantesFunciones.resaltarnombreTipoDevolucion,this.tipodevolucionConstantesFunciones.activarnombreTipoDevolucion,this,true,"nombreTipoDevolucion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipodevolucionConstantesFunciones.resaltarnombreTipoDevolucion,this.tipodevolucionConstantesFunciones.activarnombreTipoDevolucion,this,true,"nombreTipoDevolucion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new TipoDevolucionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipodevolucionSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipodevolucionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipodevolucionSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoDevolucion.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipodevolucionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipodevolucionSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoDevolucion.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoDevolucion && this.isPermisoGuardarCambiosTipoDevolucion) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipodevolucionSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipodevolucionSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoDevolucion.addColumn(tableColumn);
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
			
			this.jTableDatosTipoDevolucion.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoDevolucion && this.isPermisoGuardarCambiosTipoDevolucion) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoDevolucion && this.isPermisoGuardarCambiosTipoDevolucion) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoDevolucion.moveColumn(this.jTableDatosTipoDevolucion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoDevolucion.moveColumn(this.jTableDatosTipoDevolucion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoDevolucion.moveColumn(this.jTableDatosTipoDevolucion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoDevolucion.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoDevolucion.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoDevolucion,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoDevolucionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoDevolucion.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoDevolucion.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoDevolucionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoDevolucionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoDevolucion.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoDevolucion.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoDevolucion.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipodevolucionLogic.getTipoDevolucions().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipodevolucions.size()-1;
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
		//this.jTableDatosTipoDevolucion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoDevolucion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoDevolucion();
			
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
				
				//this.isEsNuevoTipoDevolucion=false;
					
				TipoDevolucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipodevolucion,new Object(),this.tipodevolucionParameterGeneral,this.tipodevolucionReturnGeneral);
			
				if(this.tipodevolucionSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoDevolucion==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoDevolucion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoDevolucion.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodevolucion =(TipoDevolucion) this.tipodevolucionLogic.getTipoDevolucions().toArray()[this.jTableDatosTipoDevolucion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodevolucion =(TipoDevolucion) this.tipodevolucions.toArray()[this.jTableDatosTipoDevolucion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipodevolucion.getsType().equals("DUPLICADO")
				   || this.tipodevolucion.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoDevolucion=true;
				
				} else {
					this.isEsNuevoTipoDevolucion=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipodevolucionSessionBean.getEsGuardarRelacionado()) {
					if(this.tipodevolucion.getId()>=0 && !this.tipodevolucion.getIsNew()) {						
						this.isEsNuevoTipoDevolucion=false;
						
					} else {
						this.isEsNuevoTipoDevolucion=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoDevolucion(esRelaciones);						
				
				this.seleccionarTipoDevolucion(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipodevolucion.getId()<0) {
					this.isEsNuevoTipoDevolucion=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoDevolucion(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoDevolucion(evt,rowIndex);
				}	
				
				if(this.tipodevolucionSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoDevolucion: " + this.dDif); 
					}
				}								
				
				TipoDevolucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipodevolucion,new Object(),this.tipodevolucionParameterGeneral,this.tipodevolucionReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoDevolucion(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipodevolucion)) {
					if(this.tipodevolucion.getId()>0) {
						this.tipodevolucion.setIsDeleted(true);
						
						this.tipodevolucionsEliminados.add(this.tipodevolucion);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipodevolucionLogic.getTipoDevolucions().remove(this.tipodevolucion);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipodevolucions.remove(this.tipodevolucion);				
					}
					
					
					((TipoDevolucionModel) this.jTableDatosTipoDevolucion.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoDevolucion(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoDevolucion(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoDevolucion) {
			
			if(this.jInternalFrameDetalleFormTipoDevolucion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoDevolucion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoDevolucion.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodevolucion =(TipoDevolucion) this.tipodevolucionLogic.getTipoDevolucions().toArray()[this.jTableDatosTipoDevolucion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodevolucion =(TipoDevolucion) this.tipodevolucions.toArray()[this.jTableDatosTipoDevolucion.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoDevolucionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoDevolucion(this.tipodevolucion);
				}
				
				//ARCHITECTURE
				try {
					

					//Pais
					if(!this.tipodevolucionConstantesFunciones.cargarid_paisTipoDevolucion || this.tipodevolucionConstantesFunciones.event_dependid_paisTipoDevolucion) {
						//this.cargarCombosPaissForeignKeyLista(" where id="+this.tipodevolucion.getid_pais());
									//this.inicializarActualizarBindingTipoDevolucion(false,false);
						this.paissForeignKey=new ArrayList<Pais>();

						if(tipodevolucion.getPais()!=null) {
							this.paissForeignKey.add(tipodevolucion.getPais());
						}

						this.addItemDefectoCombosForeignKeyPais();
						this.cargarCombosFramePaissForeignKey("Todos");
					}
					this.setActualPaisForeignKey(this.tipodevolucion.getid_pais(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoDevolucion("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoDevolucion(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoDevolucion() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoDevolucion(TipoDevolucion tipodevolucion) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoDevolucion(tipodevolucion,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoDevolucion(TipoDevolucion tipodevolucion,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoDevolucion(tipodevolucion);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoDevolucion(tipodevolucion,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoDevolucion(tipodevolucion);
	}
	
	public void setVariablesObjetoActualToFormularioTipoDevolucion(TipoDevolucion tipodevolucion) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoDevolucion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoDevolucion.jTextFieldidTipoDevolucion.setText(tipodevolucion.getId().toString());
			this.jInternalFrameDetalleFormTipoDevolucion.jTextAreanombreTipoDevolucion.setText(tipodevolucion.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoDevolucion tipodevolucionLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipodevolucionLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoDevolucion tipodevolucionLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipodevolucionLocal=this.tipodevolucion;
			} else {
				tipodevolucionLocal=this.tipodevolucionAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipodevolucionLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoDevolucion(tipodevolucionLocal,true);
					
					if(tipodevolucionSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipodevolucionLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipodevolucionSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipodevolucionLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoDevolucion(TipoDevolucion tipodevolucion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoDevolucion(tipodevolucion,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoDevolucion(tipodevolucion);
	}
	
	public void setVariablesFormularioToObjetoActualTipoDevolucion(TipoDevolucion tipodevolucion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoDevolucion(tipodevolucion,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoDevolucion(TipoDevolucion tipodevolucion,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoDevolucion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoDevolucion.jTextFieldidTipoDevolucion.getText()==null || this.jInternalFrameDetalleFormTipoDevolucion.jTextFieldidTipoDevolucion.getText()=="" || this.jInternalFrameDetalleFormTipoDevolucion.jTextFieldidTipoDevolucion.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoDevolucion.jTextFieldidTipoDevolucion.setText("0");
			}

			if(conColumnasBase) {tipodevolucion.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoDevolucion.jTextFieldidTipoDevolucion.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoDevolucionConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDevolucion.jLabelIdTipoDevolucion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipodevolucion.setnombre(this.jInternalFrameDetalleFormTipoDevolucion.jTextAreanombreTipoDevolucion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoDevolucionConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDevolucion.jLabelnombreTipoDevolucion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoDevolucion(TipoDevolucion tipodevolucionBean,TipoDevolucion tipodevolucion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && tipodevolucionBean.getid_pais()!=null && !tipodevolucionBean.getid_pais().equals(-1L))) {tipodevolucion.setid_pais(tipodevolucionBean.getid_pais());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoDevolucion(TipoDevolucion tipodevolucionOrigen,TipoDevolucion tipodevolucion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipodevolucionOrigen.getId()!=null && !tipodevolucionOrigen.getId().equals(0L))) {tipodevolucion.setId(tipodevolucionOrigen.getId());}}
			if(conDefault || (!conDefault && tipodevolucionOrigen.getid_pais()!=null && !tipodevolucionOrigen.getid_pais().equals(-1L))) {tipodevolucion.setid_pais(tipodevolucionOrigen.getid_pais());}
			if(conDefault || (!conDefault && tipodevolucionOrigen.getnombre()!=null && !tipodevolucionOrigen.getnombre().equals(""))) {tipodevolucion.setnombre(tipodevolucionOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoDevolucion(TipoDevolucion tipodevolucion) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoDevolucion.jTextFieldidTipoDevolucion.setText(tipodevolucion.getId().toString());
			this.jInternalFrameDetalleFormTipoDevolucion.jTextAreanombreTipoDevolucion.setText(tipodevolucion.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoDevolucion(TipoDevolucionBean tipodevolucionBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoDevolucion.jTextFieldidTipoDevolucion.setText(tipodevolucionBean.getId().toString());
			this.jInternalFrameDetalleFormTipoDevolucion.jTextAreanombreTipoDevolucion.setText(tipodevolucionBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoDevolucion(TipoDevolucionParameterReturnGeneral tipodevolucionReturnGeneral,TipoDevolucionBean tipodevolucionBean,Boolean conDefault) throws Exception { 
		try {
			TipoDevolucion tipodevolucionLocal=new TipoDevolucion();
			
			tipodevolucionLocal=tipodevolucionReturnGeneral.getTipoDevolucion();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipodevolucionLocal.getId()!=null && !tipodevolucionLocal.getId().equals(0L))) {tipodevolucionBean.setId(tipodevolucionLocal.getId());}}
			if(conDefault || (!conDefault && tipodevolucionLocal.getid_pais()!=null && !tipodevolucionLocal.getid_pais().equals(-1L))) {tipodevolucionBean.setid_pais(tipodevolucionLocal.getid_pais());}
			if(conDefault || (!conDefault && tipodevolucionLocal.getnombre()!=null && !tipodevolucionLocal.getnombre().equals(""))) {tipodevolucionBean.setnombre(tipodevolucionLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoDevolucionGenerico(Long idTipoDevolucionSeleccionado,JComboBox jComboBoxTipoDevolucion,List<TipoDevolucion> tipodevolucionsLocal)throws Exception {
		try {
			TipoDevolucion  tipodevolucionTemp=null;

			for(TipoDevolucion tipodevolucionAux:tipodevolucionsLocal) {
				if(tipodevolucionAux.getId()!=null && tipodevolucionAux.getId().equals(idTipoDevolucionSeleccionado)) {
					tipodevolucionTemp=tipodevolucionAux;
					break;
				}
			}

			jComboBoxTipoDevolucion.setSelectedItem(tipodevolucionTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoDevolucionGenerico(JComboBox jComboBoxTipoDevolucion,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoDevolucion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoDevolucion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoDevolucion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoDevolucion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoDevolucion.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoDevolucion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoDevolucion.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoDevolucion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoDevolucion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoDevolucion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipodevolucion=(TipoDevolucion) tipodevolucionLogic.getTipoDevolucions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipodevolucion =(TipoDevolucion) tipodevolucions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Pais")) {
			//sDescripcion=this.getActualPaisForeignKeyDescripcion((Long)value);
			if(!tipodevolucion.getIsNew() && !tipodevolucion.getIsChanged() && !tipodevolucion.getIsDeleted()) {
				sDescripcion=tipodevolucion.getpais_descripcion();
			} else {
				//sDescripcion=this.getActualPaisForeignKeyDescripcion((Long)value);
				sDescripcion=tipodevolucion.getpais_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoDevolucion tipodevolucionRow=new TipoDevolucion();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipodevolucionRow=(TipoDevolucion) tipodevolucionLogic.getTipoDevolucions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipodevolucionRow=(TipoDevolucion) tipodevolucions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoDevolucion(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoDevolucion.setVisible((this.isVisibilidadCeldaNuevoTipoDevolucion && this.isPermisoNuevoTipoDevolucion));			
			this.jButtonDuplicarTipoDevolucion.setVisible((this.isVisibilidadCeldaDuplicarTipoDevolucion && this.isPermisoDuplicarTipoDevolucion));			
			this.jButtonCopiarTipoDevolucion.setVisible((this.isVisibilidadCeldaCopiarTipoDevolucion && this.isPermisoCopiarTipoDevolucion));
			this.jButtonVerFormTipoDevolucion.setVisible((this.isVisibilidadCeldaVerFormTipoDevolucion && this.isPermisoVerFormTipoDevolucion));
			
			this.jButtonAbrirOrderByTipoDevolucion.setVisible((this.isVisibilidadCeldaOrdenTipoDevolucion && this.isPermisoOrdenTipoDevolucion));			
			
			this.jButtonNuevoRelacionesTipoDevolucion.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoDevolucion && this.isPermisoNuevoTipoDevolucion));			
			this.jButtonNuevoGuardarCambiosTipoDevolucion.setVisible((this.isVisibilidadCeldaNuevoTipoDevolucion && this.isPermisoNuevoTipoDevolucion && this.isPermisoGuardarCambiosTipoDevolucion));
			
			if(this.jInternalFrameDetalleFormTipoDevolucion!=null) {
			this.jInternalFrameDetalleFormTipoDevolucion.jButtonModificarTipoDevolucion.setVisible((this.isVisibilidadCeldaModificarTipoDevolucion && this.isPermisoActualizarTipoDevolucion));	
			this.jInternalFrameDetalleFormTipoDevolucion.jButtonActualizarTipoDevolucion.setVisible((this.isVisibilidadCeldaActualizarTipoDevolucion && this.isPermisoActualizarTipoDevolucion));	
			this.jInternalFrameDetalleFormTipoDevolucion.jButtonEliminarTipoDevolucion.setVisible((this.isVisibilidadCeldaEliminarTipoDevolucion && this.isPermisoEliminarTipoDevolucion));
			this.jInternalFrameDetalleFormTipoDevolucion.jButtonCancelarTipoDevolucion.setVisible(this.isVisibilidadCeldaCancelarTipoDevolucion);							
			this.jInternalFrameDetalleFormTipoDevolucion.jButtonGuardarCambiosTipoDevolucion.setVisible((this.isVisibilidadCeldaGuardarTipoDevolucion && this.isPermisoGuardarCambiosTipoDevolucion));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoDevolucion.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoDevolucion && this.isPermisoGuardarCambiosTipoDevolucion));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoDevolucion.setVisible((this.isVisibilidadCeldaNuevoTipoDevolucion && this.isPermisoNuevoTipoDevolucion));						
			this.jButtonDuplicarToolBarTipoDevolucion.setVisible((this.isVisibilidadCeldaDuplicarTipoDevolucion && this.isPermisoDuplicarTipoDevolucion));						
			this.jButtonCopiarToolBarTipoDevolucion.setVisible((this.isVisibilidadCeldaCopiarTipoDevolucion && this.isPermisoCopiarTipoDevolucion));			
			this.jButtonVerFormToolBarTipoDevolucion.setVisible((this.isVisibilidadCeldaVerFormTipoDevolucion && this.isPermisoVerFormTipoDevolucion));			
			this.jButtonAbrirOrderByToolBarTipoDevolucion.setVisible((this.isVisibilidadCeldaOrdenTipoDevolucion && this.isPermisoOrdenTipoDevolucion));
			this.jButtonNuevoRelacionesToolBarTipoDevolucion.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoDevolucion && this.isPermisoNuevoTipoDevolucion));			
			this.jButtonNuevoGuardarCambiosToolBarTipoDevolucion.setVisible((this.isVisibilidadCeldaNuevoTipoDevolucion && this.isPermisoNuevoTipoDevolucion && this.isPermisoGuardarCambiosTipoDevolucion));			
			
			if(this.jInternalFrameDetalleFormTipoDevolucion!=null) {
			this.jInternalFrameDetalleFormTipoDevolucion.jButtonModificarToolBarTipoDevolucion.setVisible((this.isVisibilidadCeldaModificarTipoDevolucion && this.isPermisoActualizarTipoDevolucion));	
			this.jInternalFrameDetalleFormTipoDevolucion.jButtonActualizarToolBarTipoDevolucion.setVisible((this.isVisibilidadCeldaActualizarTipoDevolucion  && this.isPermisoActualizarTipoDevolucion));	
			this.jInternalFrameDetalleFormTipoDevolucion.jButtonEliminarToolBarTipoDevolucion.setVisible((this.isVisibilidadCeldaEliminarTipoDevolucion && this.isPermisoEliminarTipoDevolucion));
			this.jInternalFrameDetalleFormTipoDevolucion.jButtonCancelarToolBarTipoDevolucion.setVisible(this.isVisibilidadCeldaCancelarTipoDevolucion);				
			this.jInternalFrameDetalleFormTipoDevolucion.jButtonGuardarCambiosToolBarTipoDevolucion.setVisible((this.isVisibilidadCeldaGuardarTipoDevolucion && this.isPermisoGuardarCambiosTipoDevolucion));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoDevolucion.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoDevolucion && this.isPermisoGuardarCambiosTipoDevolucion));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoDevolucion.setVisible((this.isVisibilidadCeldaNuevoTipoDevolucion && this.isPermisoNuevoTipoDevolucion));			
			this.jMenuItemDuplicarTipoDevolucion.setVisible((this.isVisibilidadCeldaDuplicarTipoDevolucion && this.isPermisoDuplicarTipoDevolucion));			
			this.jMenuItemCopiarTipoDevolucion.setVisible((this.isVisibilidadCeldaCopiarTipoDevolucion && this.isPermisoCopiarTipoDevolucion));			
			this.jMenuItemVerFormTipoDevolucion.setVisible((this.isVisibilidadCeldaVerFormTipoDevolucion && this.isPermisoVerFormTipoDevolucion));			
			this.jMenuItemAbrirOrderByTipoDevolucion.setVisible((this.isVisibilidadCeldaOrdenTipoDevolucion && this.isPermisoOrdenTipoDevolucion));			
			//this.jMenuItemMostrarOcultarTipoDevolucion.setVisible((this.isVisibilidadCeldaOrdenTipoDevolucion && this.isPermisoOrdenTipoDevolucion));
			this.jMenuItemDetalleAbrirOrderByTipoDevolucion.setVisible((this.isVisibilidadCeldaOrdenTipoDevolucion && this.isPermisoOrdenTipoDevolucion));			
			//this.jMenuItemDetalleMostrarOcultarTipoDevolucion.setVisible((this.isVisibilidadCeldaOrdenTipoDevolucion && this.isPermisoOrdenTipoDevolucion));			
			this.jMenuItemNuevoRelacionesTipoDevolucion.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoDevolucion && this.isPermisoNuevoTipoDevolucion));			
			this.jMenuItemNuevoGuardarCambiosTipoDevolucion.setVisible((this.isVisibilidadCeldaNuevoTipoDevolucion && this.isPermisoNuevoTipoDevolucion && this.isPermisoGuardarCambiosTipoDevolucion));									
			
			if(this.jInternalFrameDetalleFormTipoDevolucion!=null) {
			this.jInternalFrameDetalleFormTipoDevolucion.jMenuItemModificarTipoDevolucion.setVisible((this.isVisibilidadCeldaModificarTipoDevolucion && this.isPermisoActualizarTipoDevolucion));	
			this.jInternalFrameDetalleFormTipoDevolucion.jMenuItemActualizarTipoDevolucion.setVisible((this.isVisibilidadCeldaActualizarTipoDevolucion && this.isPermisoActualizarTipoDevolucion));	
			this.jInternalFrameDetalleFormTipoDevolucion.jMenuItemEliminarTipoDevolucion.setVisible((this.isVisibilidadCeldaEliminarTipoDevolucion && this.isPermisoEliminarTipoDevolucion));
			this.jInternalFrameDetalleFormTipoDevolucion.jMenuItemCancelarTipoDevolucion.setVisible(this.isVisibilidadCeldaCancelarTipoDevolucion);				
			}
			
			this.jMenuItemGuardarCambiosTipoDevolucion.setVisible((this.isVisibilidadCeldaGuardarTipoDevolucion && this.isPermisoGuardarCambiosTipoDevolucion));						
			this.jMenuItemGuardarCambiosTablaTipoDevolucion.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoDevolucion && this.isPermisoGuardarCambiosTipoDevolucion));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoDevolucion=this.jButtonNuevoTipoDevolucion.isVisible();
			this.isVisibilidadCeldaDuplicarTipoDevolucion=this.jButtonDuplicarTipoDevolucion.isVisible();
			this.isVisibilidadCeldaCopiarTipoDevolucion=this.jButtonCopiarTipoDevolucion.isVisible();
			this.isVisibilidadCeldaVerFormTipoDevolucion=this.jButtonVerFormTipoDevolucion.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoDevolucion=this.jButtonAbrirOrderByTipoDevolucion.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoDevolucion=this.jButtonNuevoRelacionesTipoDevolucion.isVisible();
			this.isVisibilidadCeldaModificarTipoDevolucion=this.jButtonModificarTipoDevolucion.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoDevolucion!=null) {
			this.isVisibilidadCeldaActualizarTipoDevolucion=this.jInternalFrameDetalleFormTipoDevolucion.jButtonActualizarTipoDevolucion.isVisible();
			this.isVisibilidadCeldaEliminarTipoDevolucion=this.jInternalFrameDetalleFormTipoDevolucion.jButtonEliminarTipoDevolucion.isVisible();
			this.isVisibilidadCeldaCancelarTipoDevolucion=this.jInternalFrameDetalleFormTipoDevolucion.jButtonCancelarTipoDevolucion.isVisible();
			this.isVisibilidadCeldaGuardarTipoDevolucion=this.jInternalFrameDetalleFormTipoDevolucion.jButtonGuardarCambiosTipoDevolucion.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoDevolucion=this.jButtonGuardarCambiosTablaTipoDevolucion.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoDevolucion=this.jButtonNuevoToolBarTipoDevolucion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoDevolucion=this.jButtonNuevoRelacionesToolBarTipoDevolucion.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoDevolucion!=null) {
			this.isVisibilidadCeldaModificarTipoDevolucion=this.jInternalFrameDetalleFormTipoDevolucion.jButtonModificarToolBarTipoDevolucion.isVisible();
			this.isVisibilidadCeldaActualizarTipoDevolucion=this.jInternalFrameDetalleFormTipoDevolucion.jButtonActualizarToolBarTipoDevolucion.isVisible();
			this.isVisibilidadCeldaEliminarTipoDevolucion=this.jInternalFrameDetalleFormTipoDevolucion.jButtonEliminarToolBarTipoDevolucion.isVisible();
			this.isVisibilidadCeldaCancelarTipoDevolucion=this.jInternalFrameDetalleFormTipoDevolucion.jButtonCancelarToolBarTipoDevolucion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoDevolucion=this.jButtonGuardarCambiosToolBarTipoDevolucion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoDevolucion=this.jButtonGuardarCambiosTablaToolBarTipoDevolucion.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoDevolucion=this.jMenuItemNuevoTipoDevolucion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoDevolucion=this.jMenuItemNuevoRelacionesTipoDevolucion.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoDevolucion!=null) {
			this.isVisibilidadCeldaModificarTipoDevolucion=this.jInternalFrameDetalleFormTipoDevolucion.jMenuItemModificarTipoDevolucion.isVisible();
			this.isVisibilidadCeldaActualizarTipoDevolucion=this.jInternalFrameDetalleFormTipoDevolucion.jMenuItemActualizarTipoDevolucion.isVisible();
			this.isVisibilidadCeldaEliminarTipoDevolucion=this.jInternalFrameDetalleFormTipoDevolucion.jMenuItemEliminarTipoDevolucion.isVisible();
			this.isVisibilidadCeldaCancelarTipoDevolucion=this.jInternalFrameDetalleFormTipoDevolucion.jMenuItemCancelarTipoDevolucion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoDevolucion=this.jMenuItemGuardarCambiosTipoDevolucion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoDevolucion=this.jMenuItemGuardarCambiosTablaTipoDevolucion.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoDevolucion(Boolean esInicializar) {
		if(TipoDevolucionJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipodevolucionSessionBean.getConGuardarRelaciones()) {
				//if(this.tipodevolucionSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoDevolucion();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoDevolucion(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoDevolucion() {
		this.jButtonNuevoTipoDevolucion.setVisible(this.isPermisoNuevoTipoDevolucion);			
		this.jButtonDuplicarTipoDevolucion.setVisible(this.isPermisoDuplicarTipoDevolucion);			
		this.jButtonCopiarTipoDevolucion.setVisible(this.isPermisoCopiarTipoDevolucion);			
		this.jButtonVerFormTipoDevolucion.setVisible(this.isPermisoVerFormTipoDevolucion);			
		
		this.jButtonAbrirOrderByTipoDevolucion.setVisible(this.isPermisoOrdenTipoDevolucion);					
		
		this.jButtonNuevoRelacionesTipoDevolucion.setVisible(this.isPermisoNuevoTipoDevolucion);			
		
		if(this.jInternalFrameDetalleFormTipoDevolucion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDevolucion.jButtonModificarTipoDevolucion.setVisible(this.isPermisoActualizarTipoDevolucion);	
			this.jInternalFrameDetalleFormTipoDevolucion.jButtonActualizarTipoDevolucion.setVisible(this.isPermisoActualizarTipoDevolucion);	
			this.jInternalFrameDetalleFormTipoDevolucion.jButtonEliminarTipoDevolucion.setVisible(this.isPermisoEliminarTipoDevolucion);
			this.jInternalFrameDetalleFormTipoDevolucion.jButtonCancelarTipoDevolucion.setVisible(this.isVisibilidadCeldaCancelarTipoDevolucion);						
			this.jInternalFrameDetalleFormTipoDevolucion.jButtonGuardarCambiosTipoDevolucion.setVisible(this.isPermisoGuardarCambiosTipoDevolucion);							
		}
		
		this.jButtonGuardarCambiosTablaTipoDevolucion.setVisible(this.isPermisoActualizarTipoDevolucion);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoDevolucion() {
		this.jInternalFrameDetalleFormTipoDevolucion.jButtonModificarTipoDevolucion.setVisible(this.isPermisoActualizarTipoDevolucion);	
		this.jInternalFrameDetalleFormTipoDevolucion.jButtonActualizarTipoDevolucion.setVisible(this.isPermisoActualizarTipoDevolucion);	
		this.jInternalFrameDetalleFormTipoDevolucion.jButtonEliminarTipoDevolucion.setVisible(this.isPermisoEliminarTipoDevolucion);
		this.jInternalFrameDetalleFormTipoDevolucion.jButtonCancelarTipoDevolucion.setVisible(this.isVisibilidadCeldaCancelarTipoDevolucion);							
		this.jInternalFrameDetalleFormTipoDevolucion.jButtonGuardarCambiosTipoDevolucion.setVisible((this.isVisibilidadCeldaGuardarTipoDevolucion && this.isPermisoGuardarCambiosTipoDevolucion));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoDevolucion() {
		if(TipoDevolucionJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoDevolucion();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoDevolucion() {
	}
	
	public void jTableDatosTipoDevolucionListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoDevolucion(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoDevolucionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodevolucionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoDevolucion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoDevolucion(this.gettipodevolucion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDevolucion(this.tipodevolucion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodevolucion =(TipoDevolucion) this.tipodevolucionLogic.getTipoDevolucions().toArray()[this.jTableDatosTipoDevolucion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipodevolucion =(TipoDevolucion) this.tipodevolucions.toArray()[this.jTableDatosTipoDevolucion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipodevolucion==null) {
						this.tipodevolucion = new TipoDevolucion();
					}

					this.setVariablesFormularioToObjetoActualTipoDevolucion(this.tipodevolucion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDevolucion(this.tipodevolucion);
				}

				if(this.tipodevolucion.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipodevolucion.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoDevolucion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodevolucionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodevolucionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodevolucionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_paisTipoDevolucionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisopais=true;

			idTienePermisopais=this.tienePermisosUsuarioEnPaginaWebTipoDevolucion(PaisConstantesFunciones.CLASSNAME);

			if(idTienePermisopais) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoDevolucion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoDevolucion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoDevolucion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodevolucion =(TipoDevolucion) this.tipodevolucionLogic.getTipoDevolucions().toArray()[this.jTableDatosTipoDevolucion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipodevolucion =(TipoDevolucion) this.tipodevolucions.toArray()[this.jTableDatosTipoDevolucion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoDevolucion(this.gettipodevolucion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoDevolucion(this.tipodevolucion);

				this.paisBeanSwingJInternalFrame=new PaisBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.paisBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.paisBeanSwingJInternalFrame.getPaisLogic().setConnexion(this.tipodevolucionLogic.getConnexion());

				if(this.tipodevolucion.getid_pais()!=null) {
					this.paisBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.paisBeanSwingJInternalFrame.setIdActual(this.tipodevolucion.getid_pais());
					this.paisBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.paisBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.paisBeanSwingJInternalFrame.inicializarActualizarBindingTablaPais();
				}

				JInternalFrameBase jinternalFrame =this.paisBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoDevolucion=(TitledBorder)this.jScrollPanelDatosTipoDevolucion.getBorder();
				TitledBorder titledBorderpais=(TitledBorder)this.paisBeanSwingJInternalFrame.jScrollPanelDatosPais.getBorder();

				titledBorderpais.setTitle(titledBorderTipoDevolucion.getTitle() + " -> Pais");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_paisTipoDevolucionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodevolucionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoDevolucion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoDevolucion(this.gettipodevolucion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDevolucion(this.tipodevolucion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodevolucion =(TipoDevolucion) this.tipodevolucionLogic.getTipoDevolucions().toArray()[this.jTableDatosTipoDevolucion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipodevolucion =(TipoDevolucion) this.tipodevolucions.toArray()[this.jTableDatosTipoDevolucion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipodevolucion==null) {
						this.tipodevolucion = new TipoDevolucion();
					}

					this.setVariablesFormularioToObjetoActualTipoDevolucion(this.tipodevolucion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDevolucion(this.tipodevolucion);
				}

				if(this.tipodevolucion.getid_pais()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_pais = "+this.tipodevolucion.getid_pais().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoDevolucion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodevolucionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodevolucionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodevolucionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoDevolucionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodevolucionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoDevolucion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoDevolucion(this.gettipodevolucion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDevolucion(this.tipodevolucion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodevolucion =(TipoDevolucion) this.tipodevolucionLogic.getTipoDevolucions().toArray()[this.jTableDatosTipoDevolucion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipodevolucion =(TipoDevolucion) this.tipodevolucions.toArray()[this.jTableDatosTipoDevolucion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipodevolucion==null) {
						this.tipodevolucion = new TipoDevolucion();
					}

					this.setVariablesFormularioToObjetoActualTipoDevolucion(this.tipodevolucion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDevolucion(this.tipodevolucion);
				}

				if(this.tipodevolucion.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipodevolucion.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoDevolucion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodevolucionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodevolucionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodevolucionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorNombreTipoDevolucionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoDevolucion(false,false);

			this.getTipoDevolucionsBusquedaPorNombre();

			this.inicializarActualizarBindingTipoDevolucion(false);

			//if(TipoDevolucionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoDevolucion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPaisTipoDevolucionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoDevolucion(false,false);

			this.getTipoDevolucionsFK_IdPais();

			this.inicializarActualizarBindingTipoDevolucion(false);

			//if(TipoDevolucionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoDevolucion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodevolucionLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoDevolucion() {
		if(this.jInternalFrameDetalleFormTipoDevolucion!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoDevolucion!=null) {
			this.jInternalFrameDetalleFormTipoDevolucion.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoDevolucion.dispose();
			this.jInternalFrameDetalleFormTipoDevolucion=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoDevolucion!=null) {
			this.jInternalFrameReporteDinamicoTipoDevolucion.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoDevolucion.dispose();
			this.jInternalFrameReporteDinamicoTipoDevolucion=null;
		}
		
		if(this.jInternalFrameImportacionTipoDevolucion!=null) {
			this.jInternalFrameImportacionTipoDevolucion.setVisible(false);	    			
			this.jInternalFrameImportacionTipoDevolucion.dispose();
			this.jInternalFrameImportacionTipoDevolucion=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoDevolucion();
			
			TipoDevolucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodevolucion,new Object(),this.tipodevolucionParameterGeneral,this.tipodevolucionReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoDevolucion")) {
				jButtonNuevoTipoDevolucionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoDevolucion")) {
				jButtonDuplicarTipoDevolucionActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoDevolucion")) {
				jButtonCopiarTipoDevolucionActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoDevolucion")) {
				jButtonVerFormTipoDevolucionActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoDevolucion")) {
				jButtonNuevoTipoDevolucionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoDevolucion")) {
				jButtonDuplicarTipoDevolucionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoDevolucion")) {
				jButtonNuevoTipoDevolucionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoDevolucion")) {
				jButtonDuplicarTipoDevolucionActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoDevolucion")) {
				jButtonNuevoTipoDevolucionActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoDevolucion")) {
				jButtonNuevoTipoDevolucionActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoDevolucion")) {
				jButtonNuevoTipoDevolucionActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoDevolucion")) {
				jButtonModificarTipoDevolucionActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoDevolucion")) {
				jButtonModificarTipoDevolucionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoDevolucion")) {
				jButtonModificarTipoDevolucionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoDevolucion")) {
				jButtonActualizarTipoDevolucionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoDevolucion")) {
				jButtonActualizarTipoDevolucionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoDevolucion")) {
				jButtonActualizarTipoDevolucionActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoDevolucion")) {
				jButtonEliminarTipoDevolucionActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoDevolucion")) {
				jButtonEliminarTipoDevolucionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoDevolucion")) {
				jButtonEliminarTipoDevolucionActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoDevolucion")) {
				jButtonCancelarTipoDevolucionActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoDevolucion")) {
				jButtonCancelarTipoDevolucionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoDevolucion")) {
				jButtonCancelarTipoDevolucionActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoDevolucion")) {
				jButtonCerrarTipoDevolucionActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoDevolucion")) {
				jButtonCerrarTipoDevolucionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoDevolucion")) {
				jButtonCerrarTipoDevolucionActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoDevolucion")) {
				jButtonMostrarOcultarTipoDevolucionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoDevolucion")) {
				jButtonCancelarTipoDevolucionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoDevolucion")) {
				jButtonGuardarCambiosTipoDevolucionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoDevolucion")) {
				jButtonGuardarCambiosTipoDevolucionActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoDevolucion")) {
				jButtonCopiarTipoDevolucionActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoDevolucion")) {
				jButtonVerFormTipoDevolucionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoDevolucion")) {
				jButtonGuardarCambiosTipoDevolucionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoDevolucion")) {
				jButtonCopiarTipoDevolucionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoDevolucion")) {
				jButtonVerFormTipoDevolucionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoDevolucion")) {
				jButtonGuardarCambiosTipoDevolucionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoDevolucion")) {
				jButtonGuardarCambiosTipoDevolucionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoDevolucion")) {
				jButtonGuardarCambiosTipoDevolucionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoDevolucion")) {
				jButtonRecargarInformacionTipoDevolucionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoDevolucion")) {
				jButtonRecargarInformacionTipoDevolucionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoDevolucion")) {
				jButtonRecargarInformacionTipoDevolucionActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoDevolucion")) {
				jButtonAnterioresTipoDevolucionActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoDevolucion")) {
				jButtonAnterioresTipoDevolucionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoDevolucion")) {
				jButtonAnterioresTipoDevolucionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoDevolucion")) {
				jButtonSiguientesTipoDevolucionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoDevolucion")) {
				jButtonSiguientesTipoDevolucionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoDevolucion")) {
				jButtonSiguientesTipoDevolucionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoDevolucion") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoDevolucion")) {
				jButtonAbrirOrderByTipoDevolucionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoDevolucion") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoDevolucion")) {
				jButtonMostrarOcultarTipoDevolucionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoDevolucion")) {
				jButtonNuevoGuardarCambiosTipoDevolucionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoDevolucion")) {
				jButtonNuevoGuardarCambiosTipoDevolucionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoDevolucion")) {
				jButtonNuevoGuardarCambiosTipoDevolucionActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoDevolucion")) {
				jButtonCerrarReporteDinamicoTipoDevolucionActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoDevolucion")) {
				jButtonGenerarReporteDinamicoTipoDevolucionActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoDevolucion")) {
				
				jButtonGenerarExcelReporteDinamicoTipoDevolucionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoDevolucion")) {
				jButtonCerrarImportacionTipoDevolucionActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoDevolucion")) {
				
				jButtonGenerarImportacionTipoDevolucionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoDevolucion")) {
				
				jButtonAbrirImportacionTipoDevolucionActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoDevolucion")) {
				jComboBoxTiposAccionesTipoDevolucionActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoDevolucion")) {
				jComboBoxTiposRelacionesTipoDevolucionActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoDevolucion")) {
				jComboBoxTiposAccionesTipoDevolucionActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoDevolucion")) {
				
				jComboBoxTiposSeleccionarTipoDevolucionActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoDevolucion")) {
				jTextFieldValorCampoGeneralTipoDevolucionActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoDevolucion")) {
				jButtonAbrirOrderByTipoDevolucionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoDevolucion")) {
				jButtonAbrirOrderByTipoDevolucionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoDevolucion")) {
				jButtonCerrarOrderByTipoDevolucionActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoDevolucionBusqueda")) {
				this.jButtonidTipoDevolucionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_paisTipoDevolucionUpdate")) {
				this.jButtonid_paisTipoDevolucionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_paisTipoDevolucionBusqueda")) {
				this.jButtonid_paisTipoDevolucionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoDevolucionBusqueda")) {
				this.jButtonnombreTipoDevolucionBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorNombreTipoDevolucion")) {
				this.jButtonBusquedaPorNombreTipoDevolucionActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdPaisTipoDevolucion")) {
				this.jButtonFK_IdPaisTipoDevolucionActionPerformed(evt);
			}
			
			;
			
			
			TipoDevolucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodevolucion,new Object(),this.tipodevolucionParameterGeneral,this.tipodevolucionReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoDevolucion();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDevolucionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodevolucion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodevolucion);
				
				TipoDevolucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodevolucion,new Object(),this.tipodevolucionParameterGeneral,this.tipodevolucionReturnGeneral);
				
				


				
				TipoDevolucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodevolucion,new Object(),this.tipodevolucionParameterGeneral,this.tipodevolucionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDevolucion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDevolucion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoDevolucion tipodevolucionLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipodevolucionLocal=this.tipodevolucion;
			} else {
				tipodevolucionLocal=this.tipodevolucionAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodevolucion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodevolucion);
				
				TipoDevolucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodevolucion,new Object(),this.tipodevolucionParameterGeneral,this.tipodevolucionReturnGeneral);
							
				
				


				
				TipoDevolucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodevolucion,new Object(),this.tipodevolucionParameterGeneral,this.tipodevolucionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDevolucion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDevolucion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDevolucionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoDevolucion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodevolucionAnterior =(TipoDevolucion) this.tipodevolucionLogic.getTipoDevolucions().toArray()[this.jTableDatosTipoDevolucion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodevolucionAnterior =(TipoDevolucion) this.tipodevolucions.toArray()[this.jTableDatosTipoDevolucion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
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
			
			TipoDevolucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodevolucion,new Object(),this.tipodevolucionParameterGeneral,this.tipodevolucionReturnGeneral);
			
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
			
			


			
			TipoDevolucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodevolucion,new Object(),this.tipodevolucionParameterGeneral,this.tipodevolucionReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDevolucionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodevolucion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodevolucion);
				
				TipoDevolucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodevolucion,new Object(),this.tipodevolucionParameterGeneral,this.tipodevolucionReturnGeneral);
								
						
				


				
				TipoDevolucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodevolucion,new Object(),this.tipodevolucionParameterGeneral,this.tipodevolucionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDevolucion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDevolucion.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodevolucion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodevolucion);
				
				TipoDevolucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodevolucion,new Object(),this.tipodevolucionParameterGeneral,this.tipodevolucionReturnGeneral);
								
				
				


				
				TipoDevolucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodevolucion,new Object(),this.tipodevolucionParameterGeneral,this.tipodevolucionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDevolucion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDevolucion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDevolucionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoDevolucion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodevolucionAnterior =(TipoDevolucion) this.tipodevolucionLogic.getTipoDevolucions().toArray()[this.jTableDatosTipoDevolucion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodevolucionAnterior =(TipoDevolucion) this.tipodevolucions.toArray()[this.jTableDatosTipoDevolucion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodevolucion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodevolucion);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDevolucionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoDevolucion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodevolucionAnterior =(TipoDevolucion) this.tipodevolucionLogic.getTipoDevolucions().toArray()[this.jTableDatosTipoDevolucion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodevolucionAnterior =(TipoDevolucion) this.tipodevolucions.toArray()[this.jTableDatosTipoDevolucion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDevolucionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodevolucion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipodevolucion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodevolucion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodevolucion);
				
				TipoDevolucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodevolucion,new Object(),this.tipodevolucionParameterGeneral,this.tipodevolucionReturnGeneral);
							
				
				


				
				TipoDevolucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodevolucion,new Object(),this.tipodevolucionParameterGeneral,this.tipodevolucionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDevolucion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDevolucion.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDevolucionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoDevolucion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodevolucionAnterior =(TipoDevolucion) this.tipodevolucionLogic.getTipoDevolucions().toArray()[this.jTableDatosTipoDevolucion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipodevolucionAnterior =(TipoDevolucion) this.tipodevolucions.toArray()[this.jTableDatosTipoDevolucion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
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
			
			TipoDevolucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodevolucion,new Object(),this.tipodevolucionParameterGeneral,this.tipodevolucionReturnGeneral);
			
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
			
			


			
			TipoDevolucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodevolucion,new Object(),this.tipodevolucionParameterGeneral,this.tipodevolucionReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDevolucionActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodevolucion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipodevolucion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodevolucion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodevolucion);
				
				TipoDevolucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodevolucion,new Object(),this.tipodevolucionParameterGeneral,this.tipodevolucionReturnGeneral);
								
				
				


				
				TipoDevolucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodevolucion,new Object(),this.tipodevolucionParameterGeneral,this.tipodevolucionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDevolucion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDevolucion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDevolucionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoDevolucion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodevolucionAnterior =(TipoDevolucion) this.tipodevolucionLogic.getTipoDevolucions().toArray()[this.jTableDatosTipoDevolucion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodevolucionAnterior =(TipoDevolucion) this.tipodevolucions.toArray()[this.jTableDatosTipoDevolucion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDevolucionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodevolucion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipodevolucion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDevolucionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodevolucion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodevolucion);
				
				TipoDevolucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodevolucion,new Object(),this.tipodevolucionParameterGeneral,this.tipodevolucionReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoDevolucion")) {
					jCheckBoxSeleccionarTodosTipoDevolucionItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoDevolucion")) {
					jCheckBoxSeleccionadosTipoDevolucionItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoDevolucion")) {
					
				}
				
				


				
				
				TipoDevolucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodevolucion,new Object(),this.tipodevolucionParameterGeneral,this.tipodevolucionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDevolucion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDevolucion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodevolucion);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipodevolucion);
				
				TipoDevolucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodevolucion,new Object(),this.tipodevolucionParameterGeneral,this.tipodevolucionReturnGeneral);
												
				
				


				
				
				TipoDevolucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodevolucion,new Object(),this.tipodevolucionParameterGeneral,this.tipodevolucionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDevolucion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDevolucion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDevolucionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoDevolucion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodevolucionAnterior =(TipoDevolucion) this.tipodevolucionLogic.getTipoDevolucions().toArray()[this.jTableDatosTipoDevolucion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipodevolucionAnterior =(TipoDevolucion) this.tipodevolucions.toArray()[this.jTableDatosTipoDevolucion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDevolucionActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodevolucion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodevolucion);
				
				TipoDevolucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodevolucion,new Object(),this.tipodevolucionParameterGeneral,this.tipodevolucionReturnGeneral);
				
				
				TipoDevolucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodevolucion,new Object(),this.tipodevolucionParameterGeneral,this.tipodevolucionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
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
			
			TipoDevolucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipodevolucion,new Object(),this.tipodevolucionParameterGeneral,this.tipodevolucionReturnGeneral);
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
			
			


			
			TipoDevolucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodevolucion,new Object(),this.tipodevolucionParameterGeneral,this.tipodevolucionReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDevolucionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodevolucion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodevolucion);
				
				TipoDevolucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipodevolucion,new Object(),this.tipodevolucionParameterGeneral,this.tipodevolucionReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoDevolucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodevolucion,new Object(),this.tipodevolucionParameterGeneral,this.tipodevolucionReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDevolucion.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDevolucion.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodevolucion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodevolucion);
				
				TipoDevolucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipodevolucion,new Object(),this.tipodevolucionParameterGeneral,this.tipodevolucionReturnGeneral);
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
				
				


				
				TipoDevolucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodevolucion,new Object(),this.tipodevolucionParameterGeneral,this.tipodevolucionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDevolucion.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDevolucion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDevolucionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoDevolucion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodevolucionAnterior =(TipoDevolucion) this.tipodevolucionLogic.getTipoDevolucions().toArray()[this.jTableDatosTipoDevolucion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodevolucionAnterior =(TipoDevolucion) this.tipodevolucions.toArray()[this.jTableDatosTipoDevolucion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoDevolucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodevolucion,new Object(),this.tipodevolucionParameterGeneral,this.tipodevolucionReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoDevolucion")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoDevolucionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoDevolucion.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipodevolucion =(TipoDevolucion) this.tipodevolucionLogic.getTipoDevolucions().toArray()[this.jTableDatosTipoDevolucion.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipodevolucion =(TipoDevolucion) this.tipodevolucions.toArray()[this.jTableDatosTipoDevolucion.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipodevolucion);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoDevolucion")) {
				
				}
				
				TipoDevolucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodevolucion,new Object(),this.tipodevolucionParameterGeneral,this.tipodevolucionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoDevolucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipodevolucion,new Object(),this.tipodevolucionParameterGeneral,this.tipodevolucionReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoDevolucion")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoDevolucion.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoDevolucion")) {
			
			}
			
			TipoDevolucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipodevolucion,new Object(),this.tipodevolucionParameterGeneral,this.tipodevolucionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoDevolucion();
			
			TipoDevolucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodevolucion,new Object(),this.tipodevolucionParameterGeneral,this.tipodevolucionReturnGeneral);
			
			if(sTipo.equals("NuevoTipoDevolucion")) {
				jButtonNuevoTipoDevolucionActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoDevolucion")) {
				jButtonDuplicarTipoDevolucionActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoDevolucion")) {
				jButtonCopiarTipoDevolucionActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoDevolucion")) {
				jButtonVerFormTipoDevolucionActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoDevolucion")) {
				jButtonNuevoTipoDevolucionActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoDevolucion")) {
				jButtonModificarTipoDevolucionActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoDevolucion")) {
				jButtonActualizarTipoDevolucionActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoDevolucion")) {
				jButtonEliminarTipoDevolucionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoDevolucion")) {
				jButtonGuardarCambiosTipoDevolucionActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoDevolucion")) {
				jButtonCancelarTipoDevolucionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoDevolucion")) {
				jButtonCerrarTipoDevolucionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoDevolucion")) {
				jButtonGuardarCambiosTipoDevolucionActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoDevolucion")) {
				jButtonNuevoGuardarCambiosTipoDevolucionActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoDevolucion")) {
				jButtonAbrirOrderByTipoDevolucionActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoDevolucion")) {
				jButtonRecargarInformacionTipoDevolucionActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoDevolucion")) {
				jButtonAnterioresTipoDevolucionActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoDevolucion")) {
				jButtonSiguientesTipoDevolucionActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoDevolucionBusqueda")) {
				this.jButtonidTipoDevolucionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_paisTipoDevolucionUpdate")) {
				this.jButtonid_paisTipoDevolucionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_paisTipoDevolucionBusqueda")) {
				this.jButtonid_paisTipoDevolucionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoDevolucionBusqueda")) {
				this.jButtonnombreTipoDevolucionBusquedaActionPerformed(evt);
			}
			
			TipoDevolucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodevolucion,new Object(),this.tipodevolucionParameterGeneral,this.tipodevolucionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoDevolucion();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoDevolucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipodevolucion,new Object(),this.tipodevolucionParameterGeneral,this.tipodevolucionReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoDevolucion")) {
				closingInternalFrameTipoDevolucion();
				
			} else if(sTipo.equals("jButtonCancelarTipoDevolucion")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoDevolucion = (JInternalFrameBase)evt.getSource();
	            	
	            TipoDevolucionBeanSwingJInternalFrame jInternalFrameParent=(TipoDevolucionBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoDevolucion.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoDevolucionActionPerformed(null);
			}
			
			TipoDevolucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipodevolucion,new Object(),this.tipodevolucionParameterGeneral,this.tipodevolucionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoDevolucion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoDevolucion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoDevolucion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipodevolucion)) {
			if(!esControlTabla) {
				if(TipoDevolucionJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoDevolucion(this.tipodevolucion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDevolucion(this.tipodevolucion);			
				}
				
				if(this.tipodevolucionSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoDevolucion(this.tipodevolucion,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipodevolucionReturnGeneral=tipodevolucionLogic.procesarEventosTipoDevolucionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipodevolucionLogic.getTipoDevolucions(),this.tipodevolucion,this.tipodevolucionParameterGeneral,this.isEsNuevoTipoDevolucion,classes);//this.tipodevolucionLogic.getTipoDevolucion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoDevolucion(this.tipodevolucionReturnGeneral,this.tipodevolucionBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipodevolucionSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoDevolucion(classes,this.tipodevolucionReturnGeneral,this.tipodevolucionBean,false);
					}
						
					if(this.tipodevolucionReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoDevolucion(this.tipodevolucionReturnGeneral.getTipoDevolucion());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoDevolucion(this.tipodevolucionReturnGeneral.getTipoDevolucion());	
					}
						
					if(this.tipodevolucionReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoDevolucion(this.tipodevolucionReturnGeneral.getTipoDevolucion(),classes);//this.tipodevolucionBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoDevolucion(this.tipodevolucion,classes);//this.tipodevolucionBean);									
				}
			
				if(TipoDevolucionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoDevolucion(this.tipodevolucion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDevolucion(this.tipodevolucion);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipodevolucionAnterior!=null) {
						this.tipodevolucion=this.tipodevolucionAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipodevolucionReturnGeneral=tipodevolucionLogic.procesarEventosTipoDevolucionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipodevolucionLogic.getTipoDevolucions(),this.tipodevolucion,this.tipodevolucionParameterGeneral,this.isEsNuevoTipoDevolucion,classes);//this.tipodevolucionLogic.getTipoDevolucion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipodevolucionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipodevolucionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipodevolucionReturnGeneral.getTipoDevolucion(),tipodevolucionLogic.getTipoDevolucions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipodevolucionReturnGeneral.getTipoDevolucion(),this.tipodevolucions);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoDevolucion.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoDevolucion.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoDevolucion();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoDevolucion() throws Exception {
		
		TipoDevolucionModel tipodevolucionModel=(TipoDevolucionModel)this.jTableDatosTipoDevolucion.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipodevolucionModel.tipodevolucions=this.tipodevolucionLogic.getTipoDevolucions();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipodevolucionModel.tipodevolucions=this.tipodevolucions;
		}
		
		
		((TipoDevolucionModel) this.jTableDatosTipoDevolucion.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoDevolucion() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipodevolucionAnterior(),this.tipodevolucionLogic.getTipoDevolucions());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipodevolucionAnterior(),this.tipodevolucions);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoDevolucion();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoDevolucion(TipoDevolucion tipodevolucion,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
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
										
				TipoDevolucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipodevolucion,new Object(),generalEntityParameterGeneral,this.tipodevolucionReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipodevolucionSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoDevolucionConstantesFunciones.getClassesRelationshipsOfTipoDevolucion(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoDevolucionConstantesFunciones.getClassesRelationshipsFromStringsOfTipoDevolucion(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoDevolucion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoDevolucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipodevolucion,new Object(),generalEntityParameterGeneral,this.tipodevolucionReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoDevolucion(TipoDevolucionBean tipodevolucionBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoDevolucion(ArrayList<Classe> classes,TipoDevolucionReturnGeneral tipodevolucionReturnGeneral,TipoDevolucionBean tipodevolucionBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoDevolucion(TipoDevolucion tipodevolucion,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipodevolucion)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoDevolucion = new TipoDevolucionDetalleFormJInternalFrame(jDesktopPane,this.tipodevolucionSessionBean.getConGuardarRelaciones(),this.tipodevolucionSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoDevolucion);
		this.jInternalFrameDetalleFormTipoDevolucion.setVisible(false);
		this.jInternalFrameDetalleFormTipoDevolucion.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoDevolucion.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoDevolucion.tipodevolucionLogic=this.tipodevolucionLogic;
		
		this.cargarCombosFrameForeignKeyTipoDevolucion("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoDevolucion();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoDevolucion();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoDevolucion("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoDevolucion();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoDevolucion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoDevolucion"));
		
		this.jInternalFrameDetalleFormTipoDevolucion.jButtonModificarTipoDevolucion.addActionListener(new ButtonActionListener(this,"ModificarTipoDevolucion"));

		
		this.jInternalFrameDetalleFormTipoDevolucion.jButtonModificarToolBarTipoDevolucion.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoDevolucion"));
					
		this.jInternalFrameDetalleFormTipoDevolucion.jMenuItemModificarTipoDevolucion.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoDevolucion"));		
		
		
		
		this.jInternalFrameDetalleFormTipoDevolucion.jButtonActualizarTipoDevolucion.addActionListener (new ButtonActionListener(this,"ActualizarTipoDevolucion"));
		
		
		this.jInternalFrameDetalleFormTipoDevolucion.jButtonActualizarToolBarTipoDevolucion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoDevolucion"));
						
		this.jInternalFrameDetalleFormTipoDevolucion.jMenuItemActualizarTipoDevolucion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoDevolucion"));		
		
		
		
		this.jInternalFrameDetalleFormTipoDevolucion.jButtonEliminarTipoDevolucion.addActionListener (new ButtonActionListener(this,"EliminarTipoDevolucion"));
		
		
		this.jInternalFrameDetalleFormTipoDevolucion.jButtonEliminarToolBarTipoDevolucion.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoDevolucion"));
								
		this.jInternalFrameDetalleFormTipoDevolucion.jMenuItemEliminarTipoDevolucion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoDevolucion"));		
		
		
		
		this.jInternalFrameDetalleFormTipoDevolucion.jButtonCancelarTipoDevolucion.addActionListener (new ButtonActionListener(this,"CancelarTipoDevolucion"));
		
		
		this.jInternalFrameDetalleFormTipoDevolucion.jButtonCancelarToolBarTipoDevolucion.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoDevolucion"));
					
		this.jInternalFrameDetalleFormTipoDevolucion.jMenuItemCancelarTipoDevolucion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoDevolucion"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoDevolucion.jMenuItemDetalleCerrarTipoDevolucion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoDevolucion"));		
		
		
		
		this.jInternalFrameDetalleFormTipoDevolucion.jButtonGuardarCambiosToolBarTipoDevolucion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoDevolucion"));
		
		
		
		this.jInternalFrameDetalleFormTipoDevolucion.jButtonGuardarCambiosToolBarTipoDevolucion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoDevolucion"));
		
		
		
		this.jInternalFrameDetalleFormTipoDevolucion.jComboBoxTiposAccionesFormularioTipoDevolucion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoDevolucion"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDevolucion.jButtonidTipoDevolucionBusqueda.addActionListener(new ButtonActionListener(this,"idTipoDevolucionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoDevolucion.jButtonid_paisTipoDevolucionUpdate.addActionListener(new ButtonActionListener(this,"id_paisTipoDevolucionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDevolucion.jButtonid_paisTipoDevolucionBusqueda.addActionListener(new ButtonActionListener(this,"id_paisTipoDevolucionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDevolucion.jButtonnombreTipoDevolucionBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoDevolucionBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoDevolucion.jTabbedPaneRelacionesTipoDevolucion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoDevolucion"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoDevolucion"));
		
		if(this.jInternalFrameDetalleFormTipoDevolucion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDevolucion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoDevolucion"));
		}
		
		this.jTableDatosTipoDevolucion.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoDevolucion"));
		
		this.jTableDatosTipoDevolucion.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoDevolucion"));
		
		this.jButtonNuevoTipoDevolucion.addActionListener(new ButtonActionListener(this,"NuevoTipoDevolucion"));
		
		this.jButtonDuplicarTipoDevolucion.addActionListener(new ButtonActionListener(this,"DuplicarTipoDevolucion"));
		
		this.jButtonCopiarTipoDevolucion.addActionListener(new ButtonActionListener(this,"CopiarTipoDevolucion"));
		
		this.jButtonVerFormTipoDevolucion.addActionListener(new ButtonActionListener(this,"VerFormTipoDevolucion"));
		
		
		this.jButtonNuevoToolBarTipoDevolucion.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoDevolucion"));
			
		this.jButtonDuplicarToolBarTipoDevolucion.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoDevolucion"));
			
		this.jMenuItemNuevoTipoDevolucion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoDevolucion"));
			
		this.jMenuItemDuplicarTipoDevolucion.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoDevolucion"));		
		
		
		this.jButtonNuevoRelacionesTipoDevolucion.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoDevolucion"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoDevolucion.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoDevolucion"));
			
		this.jMenuItemNuevoRelacionesTipoDevolucion.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoDevolucion"));		
		
		
		if(this.jInternalFrameDetalleFormTipoDevolucion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDevolucion.jButtonModificarTipoDevolucion.addActionListener(new ButtonActionListener(this,"ModificarTipoDevolucion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDevolucion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDevolucion.jButtonModificarToolBarTipoDevolucion.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoDevolucion"));
			
			this.jInternalFrameDetalleFormTipoDevolucion.jMenuItemModificarTipoDevolucion.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoDevolucion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDevolucion!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoDevolucion.jButtonActualizarTipoDevolucion.addActionListener (new ButtonActionListener(this,"ActualizarTipoDevolucion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDevolucion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDevolucion.jButtonActualizarToolBarTipoDevolucion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoDevolucion"));
				
			this.jInternalFrameDetalleFormTipoDevolucion.jMenuItemActualizarTipoDevolucion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoDevolucion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDevolucion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDevolucion.jButtonEliminarTipoDevolucion.addActionListener (new ButtonActionListener(this,"EliminarTipoDevolucion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDevolucion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDevolucion.jButtonEliminarToolBarTipoDevolucion.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoDevolucion"));
						
			this.jInternalFrameDetalleFormTipoDevolucion.jMenuItemEliminarTipoDevolucion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoDevolucion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDevolucion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDevolucion.jButtonCancelarTipoDevolucion.addActionListener (new ButtonActionListener(this,"CancelarTipoDevolucion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDevolucion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDevolucion.jButtonCancelarToolBarTipoDevolucion.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoDevolucion"));
			
			this.jInternalFrameDetalleFormTipoDevolucion.jMenuItemCancelarTipoDevolucion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoDevolucion"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoDevolucion.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoDevolucion"));		
		
		
		this.jButtonCerrarTipoDevolucion.addActionListener (new ButtonActionListener(this,"CerrarTipoDevolucion"));
		
		
		this.jButtonCerrarToolBarTipoDevolucion.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoDevolucion"));
			
		this.jMenuItemCerrarTipoDevolucion.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoDevolucion"));
			
		if(this.jInternalFrameDetalleFormTipoDevolucion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDevolucion.jMenuItemDetalleCerrarTipoDevolucion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoDevolucion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDevolucion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDevolucion.jButtonGuardarCambiosTipoDevolucion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoDevolucion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDevolucion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDevolucion.jButtonGuardarCambiosToolBarTipoDevolucion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoDevolucion"));
		}
		
		this.jButtonCopiarToolBarTipoDevolucion.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoDevolucion"));
			
		this.jButtonVerFormToolBarTipoDevolucion.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoDevolucion"));
		
		this.jMenuItemGuardarCambiosTipoDevolucion.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoDevolucion"));
			
		this.jMenuItemCopiarTipoDevolucion.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoDevolucion"));		
		
		this.jMenuItemVerFormTipoDevolucion.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoDevolucion"));		
		
		
		this.jButtonGuardarCambiosTablaTipoDevolucion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoDevolucion"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoDevolucion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoDevolucion"));
			
		this.jMenuItemGuardarCambiosTablaTipoDevolucion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoDevolucion"));		
		
		
		
		this.jButtonRecargarInformacionTipoDevolucion.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoDevolucion"));
					
		this.jButtonRecargarInformacionToolBarTipoDevolucion.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoDevolucion"));
		
		this.jMenuItemRecargarInformacionTipoDevolucion.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoDevolucion"));		
		
		
		
		this.jButtonAnterioresTipoDevolucion.addActionListener (new ButtonActionListener(this,"AnterioresTipoDevolucion"));
		
		
		this.jButtonAnterioresToolBarTipoDevolucion.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoDevolucion"));
		
		this.jMenuItemAnterioresTipoDevolucion.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoDevolucion"));		
		
		
		this.jButtonSiguientesTipoDevolucion.addActionListener (new ButtonActionListener(this,"SiguientesTipoDevolucion"));
		
		
		this.jButtonSiguientesToolBarTipoDevolucion.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoDevolucion"));
			
		this.jMenuItemSiguientesTipoDevolucion.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoDevolucion"));
			
		this.jMenuItemAbrirOrderByTipoDevolucion.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoDevolucion"));
			
		this.jMenuItemMostrarOcultarTipoDevolucion.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoDevolucion"));
			
		this.jMenuItemDetalleAbrirOrderByTipoDevolucion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoDevolucion"));
			
		this.jMenuItemDetalleMostarOcultarTipoDevolucion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoDevolucion"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoDevolucion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoDevolucion"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoDevolucion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoDevolucion"));
			
		this.jMenuItemNuevoGuardarCambiosTipoDevolucion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoDevolucion"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoDevolucion.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoDevolucion"));

		this.jCheckBoxSeleccionadosTipoDevolucion.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoDevolucion"));
		
		if(this.jInternalFrameDetalleFormTipoDevolucion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDevolucion.jComboBoxTiposAccionesFormularioTipoDevolucion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoDevolucion"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoDevolucion.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoDevolucion"));
			
		this.jComboBoxTiposAccionesTipoDevolucion.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoDevolucion"));
					
		this.jComboBoxTiposSeleccionarTipoDevolucion.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoDevolucion"));
			
		this.jTextFieldValorCampoGeneralTipoDevolucion.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoDevolucion"));		
		
		
		if(this.jInternalFrameDetalleFormTipoDevolucion!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDevolucion.jButtonidTipoDevolucionBusqueda.addActionListener(new ButtonActionListener(this,"idTipoDevolucionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoDevolucion.jButtonid_paisTipoDevolucionUpdate.addActionListener(new ButtonActionListener(this,"id_paisTipoDevolucionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDevolucion.jButtonid_paisTipoDevolucionBusqueda.addActionListener(new ButtonActionListener(this,"id_paisTipoDevolucionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDevolucion.jButtonnombreTipoDevolucionBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoDevolucionBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorNombreTipoDevolucion.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoDevolucion"));

			this.jButtonFK_IdPaisTipoDevolucion.addActionListener(new ButtonActionListener(this,"FK_IdPaisTipoDevolucion"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoDevolucion!=null) {
				this.jInternalFrameReporteDinamicoTipoDevolucion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoDevolucion"));
				this.jInternalFrameReporteDinamicoTipoDevolucion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoDevolucion"));
				this.jInternalFrameReporteDinamicoTipoDevolucion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoDevolucion"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoDevolucion.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoDevolucion"));				
			//this.jButtonGenerarReporteDinamicoTipoDevolucion.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoDevolucion"));
			//this.jButtonGenerarExcelReporteDinamicoTipoDevolucion.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoDevolucion"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoDevolucion!=null) {
				this.jInternalFrameImportacionTipoDevolucion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoDevolucion"));
				this.jInternalFrameImportacionTipoDevolucion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoDevolucion"));
				this.jInternalFrameImportacionTipoDevolucion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoDevolucion"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoDevolucion.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoDevolucion"));
			
			this.jButtonAbrirOrderByToolBarTipoDevolucion.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoDevolucion"));			
			
			if(this.jInternalFrameOrderByTipoDevolucion!=null) {
				this.jInternalFrameOrderByTipoDevolucion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoDevolucion"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoDevolucion!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoDevolucion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDevolucion.jTabbedPaneRelacionesTipoDevolucion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoDevolucion"));
		
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
            		closingInternalFrameTipoDevolucion();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoDevolucion.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoDevolucion = (JInternalFrameBase)event.getSource();
	            	
	            TipoDevolucionBeanSwingJInternalFrame jInternalFrameParent=(TipoDevolucionBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoDevolucion.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoDevolucionActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoDevolucion.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoDevolucionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoDevolucion.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoDevolucion.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoDevolucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDevolucionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoDevolucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDevolucionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoDevolucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDevolucionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoDevolucion";
		inputMap = this.jButtonNuevoTipoDevolucion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoDevolucion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoDevolucionActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoDevolucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDevolucionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoDevolucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDevolucionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoDevolucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDevolucionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoDevolucion";
		inputMap = this.jButtonNuevoRelacionesTipoDevolucion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoDevolucion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoDevolucionActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoDevolucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoDevolucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoDevolucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoDevolucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoDevolucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoDevolucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoDevolucion";
		inputMap = this.jButtonModificarTipoDevolucion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoDevolucion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoDevolucionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoDevolucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoDevolucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoDevolucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoDevolucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoDevolucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoDevolucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoDevolucion";
		inputMap = this.jButtonActualizarTipoDevolucion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoDevolucion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoDevolucionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoDevolucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoDevolucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoDevolucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoDevolucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoDevolucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoDevolucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoDevolucion";
		inputMap = this.jButtonEliminarTipoDevolucion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoDevolucion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoDevolucionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoDevolucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoDevolucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoDevolucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoDevolucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoDevolucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoDevolucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoDevolucion";
		inputMap = this.jButtonCancelarTipoDevolucion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoDevolucion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoDevolucionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoDevolucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoDevolucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoDevolucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoDevolucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoDevolucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoDevolucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoDevolucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoDevolucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoDevolucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoDevolucion";
		inputMap = this.jButtonCerrarTipoDevolucion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoDevolucion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoDevolucionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoDevolucion.jButtonGuardarCambiosTipoDevolucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDevolucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoDevolucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDevolucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoDevolucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDevolucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoDevolucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDevolucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoDevolucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDevolucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoDevolucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDevolucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoDevolucion";
		inputMap = this.jInternalFrameDetalleFormTipoDevolucion.jButtonGuardarCambiosTipoDevolucion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoDevolucion.jButtonGuardarCambiosTipoDevolucion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoDevolucionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoDevolucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoDevolucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoDevolucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoDevolucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoDevolucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoDevolucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoDevolucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoDevolucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoDevolucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoDevolucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoDevolucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoDevolucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoDevolucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoDevolucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoDevolucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoDevolucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoDevolucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoDevolucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoDevolucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoDevolucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoDevolucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoDevolucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoDevolucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoDevolucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoDevolucion.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoDevolucionItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoDevolucion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoDevolucionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoDevolucion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoDevolucionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoDevolucion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoDevolucionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDevolucion.jButtonidTipoDevolucionBusqueda.addActionListener(new ButtonActionListener(this,"idTipoDevolucionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoDevolucion.jButtonid_paisTipoDevolucionUpdate.addActionListener(new ButtonActionListener(this,"id_paisTipoDevolucionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDevolucion.jButtonid_paisTipoDevolucionBusqueda.addActionListener(new ButtonActionListener(this,"id_paisTipoDevolucionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDevolucion.jButtonnombreTipoDevolucionBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoDevolucionBusqueda"));
		
		
		this.jButtonBusquedaPorNombreTipoDevolucion.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoDevolucion"));

		this.jButtonFK_IdPaisTipoDevolucion.addActionListener(new ButtonActionListener(this,"FK_IdPaisTipoDevolucion"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoDevolucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoDevolucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoDevolucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoDevolucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoDevolucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoDevolucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoDevolucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoDevolucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoDevolucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoDevolucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoDevolucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoDevolucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoDevolucionActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoDevolucion.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoDevolucion(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoDevolucion tipodevolucionAux:this.tipodevolucionLogic.getTipoDevolucions()) {
					tipodevolucionAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoDevolucion tipodevolucionAux:tipodevolucions) {
					tipodevolucionAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoDevolucionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoDevolucion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoDevolucion tipodevolucionAux:this.tipodevolucionLogic.getTipoDevolucions()) {
						tipodevolucionAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoDevolucion tipodevolucionAux:tipodevolucions) {
						tipodevolucionAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoDevolucion tipodevolucionAux:this.tipodevolucionLogic.getTipoDevolucions()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoDevolucion tipodevolucionAux:tipodevolucions) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoDevolucion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoDevolucion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoDevolucion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoDevolucion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoDevolucionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoDevolucion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoDevolucion.getSelectedRows();
			
			TipoDevolucion tipodevolucionLocal=new TipoDevolucion();
			
			//this.seleccionarTodosTipoDevolucion(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodevolucionLocal =(TipoDevolucion) this.tipodevolucionLogic.getTipoDevolucions().toArray()[this.jTableDatosTipoDevolucion.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipodevolucionLocal =(TipoDevolucion) this.tipodevolucions.toArray()[this.jTableDatosTipoDevolucion.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipodevolucionLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoDevolucion tipodevolucionAux:this.tipodevolucionLogic.getTipoDevolucions()) {
						tipodevolucionAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoDevolucion tipodevolucionAux:tipodevolucions) {
						tipodevolucionAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoDevolucion(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoDevolucion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoDevolucion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoDevolucion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoDevolucionItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoDevolucionParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoDevolucionActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoDevolucion(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoDevolucion.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoDevolucion tipodevolucionAux:this.tipodevolucionLogic.getTipoDevolucions()) {
				
						if(sTipoSeleccionar.equals(TipoDevolucionConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipodevolucionAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoDevolucion tipodevolucionAux:tipodevolucions) {
					
						if(sTipoSeleccionar.equals(TipoDevolucionConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipodevolucionAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoDevolucion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoDevolucionActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoDevolucion(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoDevolucion=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoDevolucion.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoDevolucion.jComboBoxTiposAccionesFormularioTipoDevolucion.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoDevolucion) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoDevolucion(conSplash);
				
					this.generarReporteTipoDevolucionsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoDevolucion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoDevolucion.jComboBoxTiposAccionesFormularioTipoDevolucion.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoDevolucionsSeleccionados();
				//this.jComboBoxTiposAccionesTipoDevolucion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoDevolucionsSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoDevolucion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoDevolucionsSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoDevolucion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoDevolucion();
				
				this.exportarTipoDevolucionsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoDevolucion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoDevolucion.jComboBoxTiposAccionesFormularioTipoDevolucion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoDevolucions();
				//this.importarTipoDevolucions();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoDevolucion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoDevolucion.jComboBoxTiposAccionesFormularioTipoDevolucion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoDevolucion();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoDevolucionsSeleccionados();
				//this.jComboBoxTiposAccionesTipoDevolucion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Devolucion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoDevolucion();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoDevolucion)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoDevolucion(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Devolucion",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoDevolucion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoDevolucion.jComboBoxTiposAccionesFormularioTipoDevolucion.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoDevolucion();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoDevolucion(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoDevolucionActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoDevolucion();
			
			if(this.jInternalFrameDetalleFormTipoDevolucion==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoDevolucion> tipodevolucionsSeleccionados=new ArrayList<TipoDevolucion>();		
			TipoDevolucion tipodevolucion=new TipoDevolucion();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoDevolucion(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoDevolucion.getSelectedItem();
			
			
			
			
			tipodevolucionsSeleccionados=this.getTipoDevolucionsSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipodevolucionsSeleccionados.size()==1) {
				for(TipoDevolucion tipodevolucionAux:tipodevolucionsSeleccionados) {
					tipodevolucion=tipodevolucionAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoDevolucion();
			
      		//this.finishProcessTipoDevolucion(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoDevolucionReturnGeneral() throws Exception {
		if(this.tipodevolucionReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipodevolucionReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipodevolucionReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipodevolucionReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipodevolucionReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipodevolucionReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoDevolucion(false);
		}
		
		if(this.tipodevolucionReturnGeneral.getConRetornoLista() || this.tipodevolucionReturnGeneral.getConRetornoObjeto()) {
			if(this.tipodevolucionReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipodevolucionLogic.setTipoDevolucions(this.tipodevolucionReturnGeneral.getTipoDevolucions());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipodevolucionReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipodevolucionLogic.setTipoDevolucion(this.tipodevolucionReturnGeneral.getTipoDevolucion());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoDevolucion(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoDevolucion() throws Exception {
		
		
	}
	
	public ArrayList<TipoDevolucion> getTipoDevolucionsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoDevolucion> tipodevolucionsSeleccionados=new ArrayList<TipoDevolucion>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoDevolucion) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoDevolucion tipodevolucionAux:tipodevolucionLogic.getTipoDevolucions()) {
					if(tipodevolucionAux.getIsSelected()) {
						tipodevolucionsSeleccionados.add(tipodevolucionAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoDevolucion tipodevolucionAux:this.tipodevolucions) {
					if(tipodevolucionAux.getIsSelected()) {
						tipodevolucionsSeleccionados.add(tipodevolucionAux);				
					}
				}
			}
			
			if(tipodevolucionsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipodevolucionsSeleccionados.addAll(this.tipodevolucionLogic.getTipoDevolucions());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipodevolucionsSeleccionados.addAll(this.tipodevolucions);				
					}
				}
			}
		} else {
			tipodevolucionsSeleccionados.add(this.tipodevolucion);
		}
		
		return tipodevolucionsSeleccionados;
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
	
	public void generarReporteTipoDevolucionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoDevolucionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoDevolucionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoDevolucionsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoDevolucionsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Devolucion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoDevolucionsSeleccionados() throws Exception {
		ArrayList<TipoDevolucion> tipodevolucionsSeleccionados=new ArrayList<TipoDevolucion>();		
		
		tipodevolucionsSeleccionados=this.getTipoDevolucionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoDevolucions("Todos",tipodevolucionsSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoDevolucionsSeleccionados() throws Exception {
		ArrayList<TipoDevolucion> tipodevolucionsSeleccionados=new ArrayList<TipoDevolucion>();		
		
		tipodevolucionsSeleccionados=this.getTipoDevolucionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoDevolucions("Todos",tipodevolucionsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoDevolucionsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoDevolucion> tipodevolucionsSeleccionados=new ArrayList<TipoDevolucion>();
		
		tipodevolucionsSeleccionados=this.getTipoDevolucionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoDevolucions("Todos",tipodevolucionsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoDevolucionsSeleccionados() throws Exception {
		ArrayList<TipoDevolucion> tipodevolucionsSeleccionados=new ArrayList<TipoDevolucion>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoDevolucion();
		
		
		tipodevolucionsSeleccionados=this.getTipoDevolucionsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoDevolucion();
		
		
		//this.generarReporteTipoDevolucions("Todos",tipodevolucionsSeleccionados ,tipodevolucionImplementable,tipodevolucionImplementableHome);
	}
	
	public void mostrarImportacionTipoDevolucions() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoDevolucion();
		
		this.abrirFrameImportacionTipoDevolucion();		
		
			
		//this.generarReporteTipoDevolucions("Todos",tipodevolucionsSeleccionados ,tipodevolucionImplementable,tipodevolucionImplementableHome);
	}
	
	public void importarTipoDevolucions() throws Exception {		
	
	}
	
	public void exportarTipoDevolucionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoDevolucionsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoDevolucionsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoDevolucionsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Devolucion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoDevolucionsSeleccionados() throws Exception {
		ArrayList<TipoDevolucion> tipodevolucionsSeleccionados=new ArrayList<TipoDevolucion>();		
		
		tipodevolucionsSeleccionados=this.getTipoDevolucionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodevolucion."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoDevolucion(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoDevolucion tipodevolucionAux:tipodevolucionsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoDevolucion(tipodevolucionAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipodevolucionAux.setsDetalleGeneralEntityReporte(tipodevolucionAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodevolucionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Devolucion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoDevolucion(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoDevolucionConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoDevolucionConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoDevolucionConstantesFunciones.LABEL_IDPAIS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoDevolucionConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoDevolucion(TipoDevolucion tipodevolucion,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipodevolucion.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipodevolucion.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipodevolucion.getpais_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipodevolucion.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoDevolucionsSeleccionados() throws Exception {
		ArrayList<TipoDevolucion> tipodevolucionsSeleccionados=new ArrayList<TipoDevolucion>();		
		
		tipodevolucionsSeleccionados=this.getTipoDevolucionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodevolucion.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoDevolucions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoDevolucion(row);				
				iRow++;
			}				
			
			for(TipoDevolucion tipodevolucionAux:tipodevolucionsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoDevolucion(tipodevolucionAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodevolucionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Devolucion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoDevolucionsSeleccionados() throws Exception {
		ArrayList<TipoDevolucion> tipodevolucionsSeleccionados=new ArrayList<TipoDevolucion>();		
		
		tipodevolucionsSeleccionados=this.getTipoDevolucionsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodevolucion.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipodevolucions");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipodevolucion");
			//elementRoot.appendChild(element);
		
			for(TipoDevolucion tipodevolucionAux:tipodevolucionsSeleccionados) {
				element = document.createElement("tipodevolucion");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoDevolucion(tipodevolucionAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodevolucionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Devolucion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoDevolucion(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoDevolucionConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoDevolucionConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoDevolucionConstantesFunciones.LABEL_IDPAIS);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoDevolucionConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoDevolucion(TipoDevolucion tipodevolucion,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipodevolucion.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipodevolucion.getpais_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipodevolucion.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoDevolucion(TipoDevolucion tipodevolucion,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoDevolucionConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipodevolucion.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoDevolucionConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipodevolucion.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementpais_descripcion = document.createElement(TipoDevolucionConstantesFunciones.IDPAIS);
		elementpais_descripcion.appendChild(document.createTextNode(tipodevolucion.getpais_descripcion()));
		element.appendChild(elementpais_descripcion);

		Element elementnombre = document.createElement(TipoDevolucionConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipodevolucion.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoDevolucionsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoDevolucion> tipodevolucionsSeleccionados=new ArrayList<TipoDevolucion>();
		
		tipodevolucionsSeleccionados=this.getTipoDevolucionsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoDevolucion(tipodevolucionsSeleccionados);
		
		this.generarReporteTipoDevolucions("Todos",tipodevolucionsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoDevolucion(ArrayList<TipoDevolucion> tipodevolucionsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoDevolucion tipodevolucionAux:tipodevolucionsSeleccionados) {
				tipodevolucionAux.setsDetalleGeneralEntityReporte(tipodevolucionAux.toString());
			
				if(sTipoSeleccionar.equals(TipoDevolucionConstantesFunciones.LABEL_IDPAIS)) {
					existe=true;
					tipodevolucionAux.setsDescripcionGeneralEntityReporte1(tipodevolucionAux.getpais_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoDevolucionConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipodevolucionAux.setsDescripcionGeneralEntityReporte1(tipodevolucionAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDevolucionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoDevolucion(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoDevolucion=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoDevolucion=true;
				this.isVisibilidadCeldaGuardarCambiosTipoDevolucion=true;
			}
			
			this.isVisibilidadCeldaModificarTipoDevolucion=false;
			this.isVisibilidadCeldaActualizarTipoDevolucion=false;
			this.isVisibilidadCeldaEliminarTipoDevolucion=false;
			this.isVisibilidadCeldaCancelarTipoDevolucion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDevolucion=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoDevolucion=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoDevolucion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoDevolucion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDevolucion=false;
			this.isVisibilidadCeldaModificarTipoDevolucion=false;
			this.isVisibilidadCeldaActualizarTipoDevolucion=true;
			this.isVisibilidadCeldaEliminarTipoDevolucion=false;
			this.isVisibilidadCeldaCancelarTipoDevolucion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDevolucion=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoDevolucion=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoDevolucion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoDevolucion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDevolucion=false;
			this.isVisibilidadCeldaModificarTipoDevolucion=false;
			this.isVisibilidadCeldaActualizarTipoDevolucion=true;
			this.isVisibilidadCeldaEliminarTipoDevolucion=true;
			this.isVisibilidadCeldaCancelarTipoDevolucion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDevolucion=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoDevolucion=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoDevolucion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoDevolucion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDevolucion=false;
			this.isVisibilidadCeldaModificarTipoDevolucion=false;
			this.isVisibilidadCeldaActualizarTipoDevolucion=true;
			this.isVisibilidadCeldaEliminarTipoDevolucion=false;
			this.isVisibilidadCeldaCancelarTipoDevolucion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDevolucion=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoDevolucion=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoDevolucion=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoDevolucion=true;
			this.isVisibilidadCeldaGuardarCambiosTipoDevolucion=true;
			this.isVisibilidadCeldaModificarTipoDevolucion=false;
			this.isVisibilidadCeldaActualizarTipoDevolucion=false;
			this.isVisibilidadCeldaEliminarTipoDevolucion=false;
			this.isVisibilidadCeldaCancelarTipoDevolucion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDevolucion=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoDevolucion=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoDevolucion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoDevolucion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDevolucion=false;
			this.isVisibilidadCeldaActualizarTipoDevolucion=false;
			this.isVisibilidadCeldaEliminarTipoDevolucion=false;
			this.isVisibilidadCeldaCancelarTipoDevolucion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDevolucion=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoDevolucion=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoDevolucion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoDevolucion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDevolucion=false;
			this.isVisibilidadCeldaModificarTipoDevolucion=true;
			this.isVisibilidadCeldaActualizarTipoDevolucion=false;
			this.isVisibilidadCeldaEliminarTipoDevolucion=false;
			this.isVisibilidadCeldaCancelarTipoDevolucion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDevolucion=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoDevolucion=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoDevolucionJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoDevolucion=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoDevolucion=true;
			this.isVisibilidadCeldaGuardarCambiosTipoDevolucion=true;
		} else {
			this.actualizarEstadoPanelsTipoDevolucion(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoDevolucion=false;
			//this.isVisibilidadCeldaVerFormTipoDevolucion=false;
			this.isVisibilidadCeldaDuplicarTipoDevolucion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipodevolucionSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoDevolucion=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoDevolucion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDevolucion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipodevolucionSessionBean.getEsGuardarRelacionado()) {
			if(!tipodevolucionSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoDevolucion=false;												
			}
			
			this.jButtonCerrarTipoDevolucion.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoDevolucion=false;
		}
		
		if(!this.permiteMantenimiento(this.tipodevolucion)) {
			this.isVisibilidadCeldaActualizarTipoDevolucion=false;
			this.isVisibilidadCeldaEliminarTipoDevolucion=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoDevolucion() {
	}
	
	public void actualizarEstadoPanelsTipoDevolucion(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoDevolucion!=null) {
				this.jScrollPanelDatosEdicionTipoDevolucion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDevolucion!=null) {
				this.jTabbedPaneBusquedasTipoDevolucion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoDevolucion!=null) {
				this.jScrollPanelDatosTipoDevolucion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoDevolucion!=null) {
				this.jPanelPaginacionTipoDevolucion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoDevolucion!=null) {
				this.jPanelParametrosReportesTipoDevolucion.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoDevolucion!=null) {
				this.jScrollPanelDatosEdicionTipoDevolucion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDevolucion!=null) {
				this.jTabbedPaneBusquedasTipoDevolucion.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoDevolucion!=null) {
				this.jScrollPanelDatosTipoDevolucion.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoDevolucion!=null) {
				this.jPanelPaginacionTipoDevolucion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoDevolucion!=null) {
				this.jPanelParametrosReportesTipoDevolucion.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoDevolucion!=null) {
				this.jScrollPanelDatosEdicionTipoDevolucion.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDevolucion!=null) {
				this.jTabbedPaneBusquedasTipoDevolucion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoDevolucion!=null) {
				this.jScrollPanelDatosTipoDevolucion.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoDevolucion!=null) {
				this.jPanelPaginacionTipoDevolucion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoDevolucion!=null) {
				this.jPanelParametrosReportesTipoDevolucion.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoDevolucion!=null) {
				this.jScrollPanelDatosEdicionTipoDevolucion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDevolucion!=null) {
				this.jTabbedPaneBusquedasTipoDevolucion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoDevolucion!=null) {
				this.jScrollPanelDatosTipoDevolucion.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoDevolucion!=null) {
				this.jPanelPaginacionTipoDevolucion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoDevolucion!=null) {
				this.jPanelParametrosReportesTipoDevolucion.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoDevolucion!=null) {
				this.jScrollPanelDatosEdicionTipoDevolucion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDevolucion!=null) {
				this.jTabbedPaneBusquedasTipoDevolucion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoDevolucion!=null) {
				this.jScrollPanelDatosTipoDevolucion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoDevolucion!=null) {
				this.jPanelPaginacionTipoDevolucion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoDevolucion!=null) {
				this.jPanelParametrosReportesTipoDevolucion.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoDevolucion!=null) {
				this.jScrollPanelDatosEdicionTipoDevolucion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDevolucion!=null) {
				this.jTabbedPaneBusquedasTipoDevolucion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoDevolucion!=null) {
				this.jScrollPanelDatosTipoDevolucion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoDevolucion!=null) {
				this.jPanelPaginacionTipoDevolucion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoDevolucion!=null) {
				this.jPanelParametrosReportesTipoDevolucion.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoDevolucion!=null) {
				this.jScrollPanelDatosEdicionTipoDevolucion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDevolucion!=null) {
				this.jTabbedPaneBusquedasTipoDevolucion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoDevolucion!=null) {
				this.jScrollPanelDatosTipoDevolucion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoDevolucion!=null) {
				this.jPanelPaginacionTipoDevolucion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoDevolucion!=null) {
				this.jPanelParametrosReportesTipoDevolucion.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipodevolucionSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoDevolucion!=null) {
					this.jTabbedPaneBusquedasTipoDevolucion.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoDevolucion!=null) {
				this.jPanelParametrosReportesTipoDevolucion.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipodevolucionSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDevolucion!=null) {
				this.jTabbedPaneBusquedasTipoDevolucion.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoDevolucion!=null) {
				this.jPanelParametrosReportesTipoDevolucion.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaPais(Boolean isParaPais){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPaisNegation=!isParaPais;

			this.isVisibilidadBusquedaPorNombre=isParaPaisNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasTipoDevolucion.remove(jPanelBusquedaPorNombreTipoDevolucion);}

			this.isVisibilidadFK_IdPais=isParaPais;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasTipoDevolucion.remove(jPanelFK_IdPaisTipoDevolucion);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoDevolucionSessionBean tipodevolucionSessionBean=new TipoDevolucionSessionBean();
		
		if(this.tipodevolucionSessionBean==null) {
			this.tipodevolucionSessionBean=new TipoDevolucionSessionBean();
		}
		
		this.tipodevolucionSessionBean.setsUltimaBusquedaTipoDevolucion(this.getsAccionBusqueda());
		this.tipodevolucionSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipodevolucionSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			tipodevolucionSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPais")) {
			tipodevolucionSessionBean.setid_pais(this.getid_paisFK_IdPais());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoDevolucionSessionBean tipodevolucionSessionBean=new TipoDevolucionSessionBean();
		
		if(this.tipodevolucionSessionBean==null) {
			this.tipodevolucionSessionBean=new TipoDevolucionSessionBean();
		}
		
		if(this.tipodevolucionSessionBean.getsUltimaBusquedaTipoDevolucion()!=null&&!this.tipodevolucionSessionBean.getsUltimaBusquedaTipoDevolucion().equals("")) {
			this.setsAccionBusqueda(tipodevolucionSessionBean.getsUltimaBusquedaTipoDevolucion());
			this.setiNumeroPaginacion(tipodevolucionSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipodevolucionSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(tipodevolucionSessionBean.getnombre());
				tipodevolucionSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPais")) {
				this.setid_paisFK_IdPais(tipodevolucionSessionBean.getid_pais());
				tipodevolucionSessionBean.setid_pais(-1L);
			}
		}
		
		this.tipodevolucionSessionBean.setsUltimaBusquedaTipoDevolucion("");
		this.tipodevolucionSessionBean.setiNumeroPaginacion(TipoDevolucionConstantesFunciones.INUMEROPAGINACION);
		this.tipodevolucionSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoDevolucion(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoDevolucion() {
		this.updateBorderResaltarBusquedasFormularioTipoDevolucion();
		this.updateVisibilidadBusquedasFormularioTipoDevolucion();
		this.updateHabilitarBusquedasFormularioTipoDevolucion();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoDevolucion() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoDevolucion.getComponents().length>0) {
	

		if(this.tipodevolucionConstantesFunciones.resaltarBusquedaPorNombreTipoDevolucion!=null) {
			index= this.jTabbedPaneBusquedasTipoDevolucion.indexOfComponent(this.jPanelBusquedaPorNombreTipoDevolucion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDevolucion.getComponent(index);
				jPanel.setBorder(this.tipodevolucionConstantesFunciones.resaltarBusquedaPorNombreTipoDevolucion);
			}
		}

		if(this.tipodevolucionConstantesFunciones.resaltarFK_IdPaisTipoDevolucion!=null) {
			index= this.jTabbedPaneBusquedasTipoDevolucion.indexOfComponent(this.jPanelFK_IdPaisTipoDevolucion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDevolucion.getComponent(index);
				jPanel.setBorder(this.tipodevolucionConstantesFunciones.resaltarFK_IdPaisTipoDevolucion);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoDevolucion() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoDevolucion.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoDevolucion.indexOfComponent(this.jPanelBusquedaPorNombreTipoDevolucion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDevolucion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipodevolucionConstantesFunciones.mostrarBusquedaPorNombreTipoDevolucion);
			if(!this.tipodevolucionConstantesFunciones.mostrarBusquedaPorNombreTipoDevolucion && index>-1) {
				this.jTabbedPaneBusquedasTipoDevolucion.remove(index);
			}

			index= this.jTabbedPaneBusquedasTipoDevolucion.indexOfComponent(this.jPanelFK_IdPaisTipoDevolucion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDevolucion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipodevolucionConstantesFunciones.mostrarFK_IdPaisTipoDevolucion);
			if(!this.tipodevolucionConstantesFunciones.mostrarFK_IdPaisTipoDevolucion && index>-1) {
				this.jTabbedPaneBusquedasTipoDevolucion.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoDevolucion() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoDevolucion.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoDevolucion.indexOfComponent(this.jPanelBusquedaPorNombreTipoDevolucion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDevolucion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipodevolucionConstantesFunciones.activarBusquedaPorNombreTipoDevolucion);
				this.jTabbedPaneBusquedasTipoDevolucion.setEnabledAt(index,this.tipodevolucionConstantesFunciones.activarBusquedaPorNombreTipoDevolucion);
			}

			index= this.jTabbedPaneBusquedasTipoDevolucion.indexOfComponent(this.jPanelFK_IdPaisTipoDevolucion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDevolucion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipodevolucionConstantesFunciones.activarFK_IdPaisTipoDevolucion);
				this.jTabbedPaneBusquedasTipoDevolucion.setEnabledAt(index,this.tipodevolucionConstantesFunciones.activarFK_IdPaisTipoDevolucion);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoDevolucion(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasTipoDevolucion.indexOfComponent(this.jPanelBusquedaPorNombreTipoDevolucion);

			this.jTabbedPaneBusquedasTipoDevolucion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDevolucion.getComponent(index);

			this.tipodevolucionConstantesFunciones.setResaltarBusquedaPorNombreTipoDevolucion(resaltar);

			jPanel.setBorder(this.tipodevolucionConstantesFunciones.resaltarBusquedaPorNombreTipoDevolucion);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdPais")) {
			index= this.jTabbedPaneBusquedasTipoDevolucion.indexOfComponent(this.jPanelFK_IdPaisTipoDevolucion);

			this.jTabbedPaneBusquedasTipoDevolucion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDevolucion.getComponent(index);

			this.tipodevolucionConstantesFunciones.setResaltarFK_IdPaisTipoDevolucion(resaltar);

			jPanel.setBorder(this.tipodevolucionConstantesFunciones.resaltarFK_IdPaisTipoDevolucion);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTipoDevolucion.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoDevolucion() throws Exception {

		if(this.jInternalFrameDetalleFormTipoDevolucion==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoDevolucion();
		this.updateVisibilidadResaltarControlesFormularioTipoDevolucion();
		this.updateHabilitarResaltarControlesFormularioTipoDevolucion();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoDevolucion() throws Exception {
		if(this.jInternalFrameDetalleFormTipoDevolucion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipodevolucionConstantesFunciones.resaltaridTipoDevolucion!=null && this.jInternalFrameDetalleFormTipoDevolucion!=null) {this.jInternalFrameDetalleFormTipoDevolucion.jTextFieldidTipoDevolucion.setBorder(this.tipodevolucionConstantesFunciones.resaltaridTipoDevolucion);}
		if(this.tipodevolucionConstantesFunciones.resaltarid_paisTipoDevolucion!=null && this.jInternalFrameDetalleFormTipoDevolucion!=null) {this.jInternalFrameDetalleFormTipoDevolucion.jComboBoxid_paisTipoDevolucion.setBorder(this.tipodevolucionConstantesFunciones.resaltarid_paisTipoDevolucion);}
		if(this.tipodevolucionConstantesFunciones.resaltarnombreTipoDevolucion!=null && this.jInternalFrameDetalleFormTipoDevolucion!=null) {this.jInternalFrameDetalleFormTipoDevolucion.jTextAreanombreTipoDevolucion.setBorder(this.tipodevolucionConstantesFunciones.resaltarnombreTipoDevolucion);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoDevolucion() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoDevolucion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoDevolucion!=null) {
	
		//this.jInternalFrameDetalleFormTipoDevolucion.jTextFieldidTipoDevolucion.setVisible(this.tipodevolucionConstantesFunciones.mostraridTipoDevolucion);
		this.jInternalFrameDetalleFormTipoDevolucion.jPanelidTipoDevolucion.setVisible(this.tipodevolucionConstantesFunciones.mostraridTipoDevolucion);
		//this.jInternalFrameDetalleFormTipoDevolucion.jComboBoxid_paisTipoDevolucion.setVisible(this.tipodevolucionConstantesFunciones.mostrarid_paisTipoDevolucion);
		this.jInternalFrameDetalleFormTipoDevolucion.jPanelid_paisTipoDevolucion.setVisible(this.tipodevolucionConstantesFunciones.mostrarid_paisTipoDevolucion);
		//this.jInternalFrameDetalleFormTipoDevolucion.jTextAreanombreTipoDevolucion.setVisible(this.tipodevolucionConstantesFunciones.mostrarnombreTipoDevolucion);
		this.jInternalFrameDetalleFormTipoDevolucion.jPanelnombreTipoDevolucion.setVisible(this.tipodevolucionConstantesFunciones.mostrarnombreTipoDevolucion);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoDevolucion() throws Exception {
		if(this.jInternalFrameDetalleFormTipoDevolucion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoDevolucion!=null) {
	
		this.jInternalFrameDetalleFormTipoDevolucion.jTextFieldidTipoDevolucion.setEnabled(this.tipodevolucionConstantesFunciones.activaridTipoDevolucion);
		this.jInternalFrameDetalleFormTipoDevolucion.jComboBoxid_paisTipoDevolucion.setEnabled(this.tipodevolucionConstantesFunciones.activarid_paisTipoDevolucion);
		this.jInternalFrameDetalleFormTipoDevolucion.jTextAreanombreTipoDevolucion.setEnabled(this.tipodevolucionConstantesFunciones.activarnombreTipoDevolucion);
		}
	}
	
		
}