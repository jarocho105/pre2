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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;




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

import com.bydan.erp.cartera.util.ClaseClienteConstantesFunciones;
import com.bydan.erp.cartera.util.ClaseClienteParameterReturnGeneral;
//import com.bydan.erp.cartera.util.ClaseClienteParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.ClaseClienteBean;
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

import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.cartera.resources.reportes.AuxiliarReportes;


import com.bydan.erp.cartera.util.*;
import com.bydan.erp.cartera.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.cartera.business.entity.*;
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


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

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
public class ClaseClienteBeanSwingJInternalFrame extends ClaseClienteJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ClaseClienteBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ClaseCliente> claseclienteValidator = new ClassValidator<ClaseCliente>(ClaseCliente.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ClaseCliente clasecliente;	
	public ClaseCliente claseclienteAux;
	public ClaseCliente claseclienteAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ClaseCliente claseclienteTotales;
	public Long idClaseClienteActual;
	public Long iIdNuevoClaseCliente=0L;
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
	
	public Boolean isPermisoTodoClaseCliente;
	public Boolean isPermisoNuevoClaseCliente;
	public Boolean isPermisoActualizarClaseCliente;
	public Boolean isPermisoActualizarOriginalClaseCliente;
	public Boolean isPermisoEliminarClaseCliente;
	public Boolean isPermisoGuardarCambiosClaseCliente;
	public Boolean isPermisoConsultaClaseCliente;
	public Boolean isPermisoBusquedaClaseCliente;
	public Boolean isPermisoReporteClaseCliente;
	public Boolean isPermisoPaginacionMedioClaseCliente;
	public Boolean isPermisoPaginacionAltoClaseCliente;
	public Boolean isPermisoPaginacionTodoClaseCliente;
	public Boolean isPermisoCopiarClaseCliente;
	public Boolean isPermisoVerFormClaseCliente;
	public Boolean isPermisoDuplicarClaseCliente;
	public Boolean isPermisoOrdenClaseCliente;
	
	
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
	
	public ClaseClienteParameterReturnGeneral claseclienteReturnGeneral;
	public ClaseClienteParameterReturnGeneral claseclienteParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoClaseCliente=false;
	public Boolean esParaAccionDesdeFormularioClaseCliente=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public ClaseClienteLogic claseclienteLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ClaseCliente claseclienteBean;
	public ClaseClienteConstantesFunciones claseclienteConstantesFunciones;
	//public ClaseClienteParameterReturnGeneral claseclienteReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<ClaseCliente> claseclientes;	
	//public List<ClaseCliente> claseclientesEliminados;
	//public List<ClaseCliente> claseclientesAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoClaseCliente=false;
	public Boolean isVisibilidadCeldaDuplicarClaseCliente=true;
	public Boolean isVisibilidadCeldaCopiarClaseCliente=true;
	public Boolean isVisibilidadCeldaVerFormClaseCliente=true;
	public Boolean isVisibilidadCeldaOrdenClaseCliente=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesClaseCliente=false;
	public Boolean isVisibilidadCeldaModificarClaseCliente=false;
	public Boolean isVisibilidadCeldaActualizarClaseCliente=false;
	public Boolean isVisibilidadCeldaEliminarClaseCliente=false;
	public Boolean isVisibilidadCeldaCancelarClaseCliente=false;
	public Boolean isVisibilidadCeldaGuardarClaseCliente=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosClaseCliente=false;	
	
	
	public Boolean isVisibilidadBusquedaPorCodigo=false;
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoClaseCliente() {
		return this.iIdNuevoClaseCliente;
	}

	public void setiIdNuevoClaseCliente(Long iIdNuevoClaseCliente) {
		this.iIdNuevoClaseCliente = iIdNuevoClaseCliente;
	}
	
	public Long getidClaseClienteActual() {
		return this.idClaseClienteActual;
	}

	public void setidClaseClienteActual(Long idClaseClienteActual) {
		this.idClaseClienteActual = idClaseClienteActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ClaseCliente getclasecliente() {
		return this.clasecliente;
	}

	public void setclasecliente(ClaseCliente clasecliente) {
		this.clasecliente = clasecliente;
	}
	
	public ClaseCliente getclaseclienteAux() {
		return this.claseclienteAux;
	}

	public void setclaseclienteAux(ClaseCliente claseclienteAux) {
		this.claseclienteAux = claseclienteAux;
	}				
	
	public ClaseCliente getclaseclienteAnterior() {
		return this.claseclienteAnterior;
	}

	public void setclaseclienteAnterior(ClaseCliente claseclienteAnterior) {
		this.claseclienteAnterior = claseclienteAnterior;
	}	
	
	public ClaseCliente getclaseclienteTotales() {
		return this.claseclienteTotales;
	}

	public void setclaseclienteTotales(ClaseCliente claseclienteTotales) {
		this.claseclienteTotales = claseclienteTotales;
	}	
	
	public ClaseCliente getclaseclienteBean() {
		return this.claseclienteBean;
	}

	public void setclaseclienteBean(ClaseCliente claseclienteBean) {
		this.claseclienteBean = claseclienteBean;
	}	
	
	public ClaseClienteParameterReturnGeneral getclaseclienteReturnGeneral() {
		return this.claseclienteReturnGeneral;
	}

	public void setclaseclienteReturnGeneral(ClaseClienteParameterReturnGeneral claseclienteReturnGeneral) {
		this.claseclienteReturnGeneral = claseclienteReturnGeneral;
	}	
	
	
	public String codigoBusquedaPorCodigo="";

	public String getcodigoBusquedaPorCodigo() {
		return this.codigoBusquedaPorCodigo;
	}

	public void setcodigoBusquedaPorCodigo(String codigoBusquedaPorCodigo) {
		this.codigoBusquedaPorCodigo = codigoBusquedaPorCodigo;
	}

	public String nombreBusquedaPorNombre="";

	public String getnombreBusquedaPorNombre() {
		return this.nombreBusquedaPorNombre;
	}

	public void setnombreBusquedaPorNombre(String nombreBusquedaPorNombre) {
		this.nombreBusquedaPorNombre = nombreBusquedaPorNombre;
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
	
	
	public ClaseClienteLogic getClaseClienteLogic()	{		
		return claseclienteLogic;
	}

	public void setClaseClienteLogic(ClaseClienteLogic claseclienteLogic) {
		this.claseclienteLogic = claseclienteLogic;
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
	
	public Boolean getIsEsNuevoClaseCliente() {
		return isEsNuevoClaseCliente;
	}

	public void setIsEsNuevoClaseCliente(Boolean isEsNuevoClaseCliente) {
		this.isEsNuevoClaseCliente = isEsNuevoClaseCliente;
	}

	public Boolean getEsParaAccionDesdeFormularioClaseCliente() {
		return esParaAccionDesdeFormularioClaseCliente;
	}
	
	public void setEsParaAccionDesdeFormularioClaseCliente(Boolean esParaAccionDesdeFormularioClaseCliente) {
		this.esParaAccionDesdeFormularioClaseCliente = esParaAccionDesdeFormularioClaseCliente;
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

			if(this.claseclienteSessionBean==null) {
				this.claseclienteSessionBean=new ClaseClienteSessionBean();
			}

			if(!this.claseclienteSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(claseclienteSessionBean.getlidEmpresaActual());
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

					if(this.clasecliente!=null) {
						this.clasecliente.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormClaseCliente!=null) {
						this.jInternalFrameDetalleFormClaseCliente.jComboBoxid_empresaClaseCliente.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaClaseCliente.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormClaseCliente!=null) {
						if(this.jInternalFrameDetalleFormClaseCliente.jComboBoxid_empresaClaseCliente.getItemCount()>0) {
							this.jInternalFrameDetalleFormClaseCliente.jComboBoxid_empresaClaseCliente.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaClaseClienteGenerico)throws Exception
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
				jComboBoxid_empresaClaseClienteGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaClaseClienteGenerico!=null && jComboBoxid_empresaClaseClienteGenerico.getItemCount()>0) {
					jComboBoxid_empresaClaseClienteGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ClaseCliente clasecliente,JComboBox jComboBoxid_empresaClaseClienteGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaClaseClienteGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormClaseCliente.jComboBoxid_empresaClaseCliente.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaClaseClienteGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				clasecliente.setid_empresa(empresaAux.getId());
				clasecliente.setempresa_descripcion(ClaseClienteConstantesFunciones.getEmpresaDescripcion(empresaAux));
				clasecliente.setEmpresa(empresaAux);			}
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

					if(!ClaseClienteJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormClaseCliente!=null) { 
							this.jInternalFrameDetalleFormClaseCliente.jComboBoxid_empresaClaseCliente.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormClaseCliente.jComboBoxid_empresaClaseCliente.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormClaseCliente!=null) { 
					}

					if(!ClaseClienteJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormClaseCliente!=null) {
							this.jInternalFrameDetalleFormClaseCliente.jComboBoxid_empresaClaseCliente.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormClaseCliente!=null) {
							this.jInternalFrameDetalleFormClaseCliente.jComboBoxid_empresaClaseCliente.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesClaseCliente() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ClaseClienteConstantesFunciones.refrescarForeignKeysDescripcionesClaseCliente(this.claseclienteLogic.getClaseClientes());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ClaseClienteConstantesFunciones.refrescarForeignKeysDescripcionesClaseCliente(this.claseclientes);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//claseclienteLogic.setClaseClientes(this.claseclientes);
			claseclienteLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ClaseClienteParameterReturnGeneral getClaseClienteParameterGeneral() {
		return this.claseclienteParameterGeneral;
	}
	
	public void setClaseClienteParameterGeneral(ClaseClienteParameterReturnGeneral claseclienteParameterGeneral) {
		this.claseclienteParameterGeneral = claseclienteParameterGeneral;
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
	
	public Boolean getIsPermisoTodoClaseCliente() {
		return isPermisoTodoClaseCliente;
	}

	public void setIsPermisoTodoClaseCliente(Boolean isPermisoTodoClaseCliente) {
		this.isPermisoTodoClaseCliente = isPermisoTodoClaseCliente;
	}

	public Boolean getIsPermisoNuevoClaseCliente() {
		return isPermisoNuevoClaseCliente;
	}

	public void setIsPermisoNuevoClaseCliente(Boolean isPermisoNuevoClaseCliente) {
		this.isPermisoNuevoClaseCliente = isPermisoNuevoClaseCliente;
	}

	public Boolean getIsPermisoActualizarClaseCliente() {
		return isPermisoActualizarClaseCliente;
	}

	public void setIsPermisoActualizarClaseCliente(Boolean isPermisoActualizarClaseCliente) {
		this.isPermisoActualizarClaseCliente = isPermisoActualizarClaseCliente;
	}

	public Boolean getIsPermisoEliminarClaseCliente() {
		return isPermisoEliminarClaseCliente;
	}

	public void setIsPermisoEliminarClaseCliente(Boolean isPermisoEliminarClaseCliente) {
		this.isPermisoEliminarClaseCliente = isPermisoEliminarClaseCliente;
	}

	public Boolean getIsPermisoGuardarCambiosClaseCliente() {
		return isPermisoGuardarCambiosClaseCliente;
	}

	public void setIsPermisoGuardarCambiosClaseCliente(Boolean isPermisoGuardarCambiosClaseCliente) {
		this.isPermisoGuardarCambiosClaseCliente = isPermisoGuardarCambiosClaseCliente;
	}
	
	public Boolean getIsPermisoConsultaClaseCliente() {
		return isPermisoConsultaClaseCliente;
	}

	public void setIsPermisoConsultaClaseCliente(Boolean isPermisoConsultaClaseCliente) {
		this.isPermisoConsultaClaseCliente = isPermisoConsultaClaseCliente;
	}

	public Boolean getIsPermisoBusquedaClaseCliente() {
		return isPermisoBusquedaClaseCliente;
	}

	public void setIsPermisoBusquedaClaseCliente(Boolean isPermisoBusquedaClaseCliente) {
		this.isPermisoBusquedaClaseCliente = isPermisoBusquedaClaseCliente;
	}

	public Boolean getIsPermisoReporteClaseCliente() {
		return isPermisoReporteClaseCliente;
	}

	public void setIsPermisoReporteClaseCliente(Boolean isPermisoReporteClaseCliente) {
		this.isPermisoReporteClaseCliente = isPermisoReporteClaseCliente;
	}
	
	public Boolean getIsPermisoPaginacionMedioClaseCliente() {
		return isPermisoPaginacionMedioClaseCliente;
	}

	public void setIsPermisoPaginacionMedioClaseCliente(Boolean isPermisoPaginacionMedioClaseCliente) {
		this.isPermisoPaginacionMedioClaseCliente = isPermisoPaginacionMedioClaseCliente;
	}
	
	public Boolean getIsPermisoPaginacionTodoClaseCliente() {
		return isPermisoPaginacionTodoClaseCliente;
	}

	public void setIsPermisoPaginacionTodoClaseCliente(Boolean isPermisoPaginacionTodoClaseCliente) {
		this.isPermisoPaginacionTodoClaseCliente = isPermisoPaginacionTodoClaseCliente;
	}
	
	public Boolean getIsPermisoPaginacionAltoClaseCliente() {
		return isPermisoPaginacionAltoClaseCliente;
	}

	public void setIsPermisoPaginacionAltoClaseCliente(Boolean isPermisoPaginacionAltoClaseCliente) {
		this.isPermisoPaginacionAltoClaseCliente = isPermisoPaginacionAltoClaseCliente;
	}
	
	public Boolean getIsPermisoCopiarClaseCliente() {
		return isPermisoCopiarClaseCliente;
	}

	public void setIsPermisoCopiarClaseCliente(Boolean isPermisoCopiarClaseCliente) {
		this.isPermisoCopiarClaseCliente = isPermisoCopiarClaseCliente;
	}
	
	public Boolean getIsPermisoVerFormClaseCliente() {
		return isPermisoVerFormClaseCliente;
	}

	public void setIsPermisoVerFormClaseCliente(Boolean isPermisoVerFormClaseCliente) {
		this.isPermisoVerFormClaseCliente = isPermisoVerFormClaseCliente;
	}
	
	public Boolean getIsPermisoDuplicarClaseCliente() {
		return isPermisoDuplicarClaseCliente;
	}

	public void setIsPermisoDuplicarClaseCliente(Boolean isPermisoDuplicarClaseCliente) {
		this.isPermisoDuplicarClaseCliente = isPermisoDuplicarClaseCliente;
	}
	
	public Boolean getIsPermisoOrdenClaseCliente() {
		return isPermisoOrdenClaseCliente;
	}

	public void setIsPermisoOrdenClaseCliente(Boolean isPermisoOrdenClaseCliente) {
		this.isPermisoOrdenClaseCliente = isPermisoOrdenClaseCliente;
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
	
	public Boolean getIsVisibilidadCeldaNuevoClaseCliente() {
		return isVisibilidadCeldaNuevoClaseCliente;
	}

	public void setIsVisibilidadCeldaNuevoClaseCliente(Boolean isVisibilidadCeldaNuevoClaseCliente) {
		this.isVisibilidadCeldaNuevoClaseCliente = isVisibilidadCeldaNuevoClaseCliente;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarClaseCliente() {
		return isVisibilidadCeldaDuplicarClaseCliente;
	}

	public void setIsVisibilidadCeldaDuplicarClaseCliente(Boolean isVisibilidadCeldaDuplicarClaseCliente) {
		this.isVisibilidadCeldaDuplicarClaseCliente = isVisibilidadCeldaDuplicarClaseCliente;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarClaseCliente() {
		return isVisibilidadCeldaCopiarClaseCliente;
	}

	public void setIsVisibilidadCeldaCopiarClaseCliente(Boolean isVisibilidadCeldaCopiarClaseCliente) {
		this.isVisibilidadCeldaCopiarClaseCliente = isVisibilidadCeldaCopiarClaseCliente;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormClaseCliente() {
		return isVisibilidadCeldaVerFormClaseCliente;
	}

	public void setIsVisibilidadCeldaVerFormClaseCliente(Boolean isVisibilidadCeldaVerFormClaseCliente) {
		this.isVisibilidadCeldaVerFormClaseCliente = isVisibilidadCeldaVerFormClaseCliente;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenClaseCliente() {
		return isVisibilidadCeldaOrdenClaseCliente;
	}

	public void setIsVisibilidadCeldaOrdenClaseCliente(Boolean isVisibilidadCeldaOrdenClaseCliente) {
		this.isVisibilidadCeldaOrdenClaseCliente = isVisibilidadCeldaOrdenClaseCliente;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesClaseCliente() {
		return isVisibilidadCeldaNuevoRelacionesClaseCliente;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesClaseCliente(Boolean isVisibilidadCeldaNuevoRelacionesClaseCliente) {
		this.isVisibilidadCeldaNuevoRelacionesClaseCliente = isVisibilidadCeldaNuevoRelacionesClaseCliente;
	}
	
	public Boolean getIsVisibilidadCeldaModificarClaseCliente() {
		return isVisibilidadCeldaModificarClaseCliente;
	}

	public void setIsVisibilidadCeldaModificarClaseCliente(Boolean isVisibilidadCeldaModificarClaseCliente) {
		this.isVisibilidadCeldaModificarClaseCliente = isVisibilidadCeldaModificarClaseCliente;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarClaseCliente() {
		return isVisibilidadCeldaActualizarClaseCliente;
	}

	public void setIsVisibilidadCeldaActualizarClaseCliente(Boolean isVisibilidadCeldaActualizarClaseCliente) {
		this.isVisibilidadCeldaActualizarClaseCliente = isVisibilidadCeldaActualizarClaseCliente;
	}

	public Boolean getIsVisibilidadCeldaEliminarClaseCliente() {
		return isVisibilidadCeldaEliminarClaseCliente;
	}

	public void setIsVisibilidadCeldaEliminarClaseCliente(Boolean isVisibilidadCeldaEliminarClaseCliente) {
		this.isVisibilidadCeldaEliminarClaseCliente = isVisibilidadCeldaEliminarClaseCliente;
	}

	public Boolean getIsVisibilidadCeldaCancelarClaseCliente() {
		return isVisibilidadCeldaCancelarClaseCliente;
	}

	public void setIsVisibilidadCeldaCancelarClaseCliente(Boolean isVisibilidadCeldaCancelarClaseCliente) {
		this.isVisibilidadCeldaCancelarClaseCliente = isVisibilidadCeldaCancelarClaseCliente;
	}

	public Boolean getIsVisibilidadCeldaGuardarClaseCliente() {
		return isVisibilidadCeldaGuardarClaseCliente;
	}

	public void setIsVisibilidadCeldaGuardarClaseCliente(Boolean isVisibilidadCeldaGuardarClaseCliente) {
		this.isVisibilidadCeldaGuardarClaseCliente = isVisibilidadCeldaGuardarClaseCliente;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosClaseCliente() {
		return isVisibilidadCeldaGuardarCambiosClaseCliente;
	}

	public void setIsVisibilidadCeldaGuardarCambiosClaseCliente(Boolean isVisibilidadCeldaGuardarCambiosClaseCliente) {
		this.isVisibilidadCeldaGuardarCambiosClaseCliente = isVisibilidadCeldaGuardarCambiosClaseCliente;
	}
		
	public ClaseClienteSessionBean getclaseclienteSessionBean() {
		return this.claseclienteSessionBean;
	}
	
	public void setclaseclienteSessionBean(ClaseClienteSessionBean claseclienteSessionBean) {
		this.claseclienteSessionBean=claseclienteSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorCodigo() {
		return this.isVisibilidadBusquedaPorCodigo;
	}

	public void setisVisibilidadBusquedaPorCodigo(Boolean isVisibilidadBusquedaPorCodigo) {
		this.isVisibilidadBusquedaPorCodigo=isVisibilidadBusquedaPorCodigo;
	}

	public Boolean getisVisibilidadBusquedaPorNombre() {
		return this.isVisibilidadBusquedaPorNombre;
	}

	public void setisVisibilidadBusquedaPorNombre(Boolean isVisibilidadBusquedaPorNombre) {
		this.isVisibilidadBusquedaPorNombre=isVisibilidadBusquedaPorNombre;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysClaseCliente(ClaseCliente clasecliente)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(clasecliente,null);
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
	
	public void bugActualizarReferenciaActual(ClaseCliente clasecliente,ClaseCliente claseclienteAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalClaseCliente(clasecliente);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		claseclienteAux.setId(clasecliente.getId());
		claseclienteAux.setVersionRow(clasecliente.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessClaseCliente();
		
			int intSelectedRow = this.jTableDatosClaseCliente.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clasecliente =(ClaseCliente) this.claseclienteLogic.getClaseClientes().toArray()[this.jTableDatosClaseCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.clasecliente =(ClaseCliente) this.claseclientes.toArray()[this.jTableDatosClaseCliente.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ClaseClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualClaseCliente(this.clasecliente,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysClaseCliente(this.clasecliente);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = claseclienteValidator.getInvalidValues(this.clasecliente);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			claseclienteLogic.setDatosCliente(datosCliente);
			claseclienteLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				claseclienteAux=new  ClaseCliente();
				
				claseclienteAux.setIsNew(true);
				claseclienteAux.setIsChanged(true);
				
				claseclienteAux.setClaseClienteOriginal(this.clasecliente);
				
				claseclienteAux.setId(this.clasecliente.getId());	
				claseclienteAux.setVersionRow(this.clasecliente.getVersionRow());	
				claseclienteAux.setid_empresa(this.clasecliente.getid_empresa());	
				claseclienteAux.setcodigo(this.clasecliente.getcodigo());	
				claseclienteAux.setnombre(this.clasecliente.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.claseclienteSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.claseclienteSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(claseclienteAux,claseclienteLogic.getClaseClientes());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(claseclienteAux,claseclientes);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.claseclienteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.claseclienteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						claseclienteLogic.saveClaseClientes();//WithConnection
						//claseclienteLogic.getSetVersionRowClaseClientes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.clasecliente,claseclienteAux);
					
					this.refrescarForeignKeysDescripcionesClaseCliente();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.claseclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				claseclienteAux=new  ClaseCliente();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.claseclienteSessionBean.getEsGuardarRelacionado() 
					|| (this.claseclienteSessionBean.getEsGuardarRelacionado() && this.clasecliente.getId()>=0)) {
						
					claseclienteAux.setIsNew(false);
				}
				
				claseclienteAux.setIsDeleted(false);
			
				claseclienteAux.setId(this.clasecliente.getId());	
				claseclienteAux.setVersionRow(this.clasecliente.getVersionRow());	
				claseclienteAux.setid_empresa(this.clasecliente.getid_empresa());	
				claseclienteAux.setcodigo(this.clasecliente.getcodigo());	
				claseclienteAux.setnombre(this.clasecliente.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(claseclienteAux,claseclienteLogic.getClaseClientes());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(claseclienteAux,claseclientes);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.claseclienteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.claseclienteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						claseclienteLogic.saveClaseClientes();//WithConnection
						//claseclienteLogic.getSetVersionRowClaseClientes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.clasecliente,claseclienteAux);
					
					this.refrescarForeignKeysDescripcionesClaseCliente();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.claseclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				claseclienteAux=new  ClaseCliente();
				
				claseclienteAux.setIsNew(false);
				claseclienteAux.setIsChanged(false);
				
				claseclienteAux.setIsDeleted(true);
				
				claseclienteAux.setId(this.clasecliente.getId());	
				claseclienteAux.setVersionRow(this.clasecliente.getVersionRow());	
				claseclienteAux.setid_empresa(this.clasecliente.getid_empresa());	
				claseclienteAux.setcodigo(this.clasecliente.getcodigo());	
				claseclienteAux.setnombre(this.clasecliente.getnombre());	
				
				if(this.claseclienteSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.claseclienteAux.getId()>=0) {	
						this.claseclientesEliminados.add(claseclienteAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(claseclienteAux,claseclienteLogic.getClaseClientes());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(claseclienteAux,claseclientes);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.claseclienteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.claseclienteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						claseclienteLogic.saveClaseClientes();//WithConnection
						//claseclienteLogic.getSetVersionRowClaseClientes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.claseclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.claseclienteSessionBean.getEstaModoGuardarRelaciones() 
								|| this.claseclienteSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(claseclienteAux,claseclienteLogic.getClaseClientes());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(claseclienteAux,claseclientes);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.claseclienteLogic.getClaseClientes().addAll(this.claseclientesEliminados);
					
					claseclienteLogic.saveClaseClientes();//WithConnection
					//claseclienteLogic.getSetVersionRowClaseClientes();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesClaseCliente();
				
				this.claseclientesEliminados= new ArrayList<ClaseCliente>();		
			}
			
			if(this.claseclienteSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.claseclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Clase Cliente GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Clase Cliente",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.clasecliente=claseclienteAux;
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
      		//this.finishProcessClaseCliente();
      	}
		
	}	
	
	public void actualizarRelaciones(ClaseCliente claseclienteLocal) throws Exception {
		
		if(this.claseclienteSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ClaseCliente claseclienteLocal) throws Exception {	
		if(this.claseclienteSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				claseclienteLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarClaseClienteActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosClaseCliente.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.clasecliente =(ClaseCliente) this.claseclienteLogic.getClaseClientes().toArray()[this.jTableDatosClaseCliente.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.clasecliente =(ClaseCliente) this.claseclientes.toArray()[this.jTableDatosClaseCliente.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = claseclienteValidator.getInvalidValues(this.clasecliente);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ClaseCliente clasecliente,List<ClaseCliente> claseclientes) throws Exception {
		try	{		
			ClaseClienteConstantesFunciones.actualizarLista(clasecliente,claseclientes,this.claseclienteSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(ClaseCliente clasecliente,List<ClaseCliente> claseclientes) throws Exception {
		try	{			
			ClaseClienteConstantesFunciones.actualizarSelectedLista(clasecliente,claseclientes);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ClaseCliente> claseclientesLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				claseclientesLocal=this.claseclienteLogic.getClaseClientes();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				claseclientesLocal=this.claseclientes;
			}
			//ARCHITECTURE
		
			for(ClaseCliente claseclienteLocal:claseclientesLocal) {
				if(this.permiteMantenimiento(claseclienteLocal) && claseclienteLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ClaseClienteConstantesFunciones.getClaseClienteLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ClaseClienteConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormClaseCliente.jLabelid_empresaClaseCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ClaseClienteConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormClaseCliente.jLabelcodigoClaseCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ClaseClienteConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormClaseCliente.jLabelnombreClaseCliente,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormClaseCliente!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormClaseCliente.jLabelid_empresaClaseCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormClaseCliente.jLabelcodigoClaseCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormClaseCliente.jLabelnombreClaseCliente,"");
		
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
		this.iIdNuevoClaseCliente--;	
		
		
		this.claseclienteAux=new ClaseCliente();
		
		this.claseclienteAux.setId(this.iIdNuevoClaseCliente);
		this.claseclienteAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.claseclienteLogic.getClaseClientes().add(this.claseclienteAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.claseclientes.add(this.claseclienteAux);
		}
		//ARCHITECTURE
		
		this.clasecliente=this.claseclienteAux;
		
		if(ClaseClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioClaseCliente(this.clasecliente);
			this.setVariablesObjetoActualToFormularioForeignKeyClaseCliente(this.clasecliente);
		}
				
		//this.setDefaultControlesClaseCliente();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyClaseCliente();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyClaseCliente();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyClaseCliente();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualClaseCliente(this.claseclienteBean,this.clasecliente,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysClaseCliente(this.clasecliente);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ClaseClienteConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.claseclienteSessionBean.getConGuardarRelaciones()) {
			classes=ClaseClienteConstantesFunciones.getClassesRelationshipsOfClaseCliente(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.claseclienteReturnGeneral=claseclienteLogic.procesarEventosClaseClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.claseclienteLogic.getClaseClientes(),this.clasecliente,this.claseclienteParameterGeneral,this.isEsNuevoClaseCliente,classes);//this.claseclienteLogic.getClaseCliente()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanClaseCliente(this.claseclienteReturnGeneral,this.claseclienteBean,false);
		
		if(this.claseclienteReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyClaseCliente(this.claseclienteReturnGeneral.getClaseCliente());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioClaseCliente(this.claseclienteReturnGeneral.getClaseCliente());
		}
		
		if(this.claseclienteReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioClaseCliente(this.claseclienteReturnGeneral.getClaseCliente(),classes);//this.claseclienteBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualClaseCliente(this.clasecliente,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyClaseCliente();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyClaseCliente();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingClaseCliente(false);
						
			if(claseclienteSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ClaseClienteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualClaseCliente();
			}
			
			this.actualizarVisualTableDatosClaseCliente();
			
			this.jTableDatosClaseCliente.setRowSelectionInterval(this.getIndiceNuevoClaseCliente(), this.getIndiceNuevoClaseCliente());
			
			this.seleccionarFilaTablaClaseClienteActual();
						
			this.actualizarEstadoCeldasBotonesClaseCliente("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesClaseCliente(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormClaseCliente.jTextFieldcodigoClaseCliente.setEnabled(isHabilitar && this.claseclienteConstantesFunciones.activarcodigoClaseCliente);
		this.jInternalFrameDetalleFormClaseCliente.jTextAreanombreClaseCliente.setEnabled(isHabilitar && this.claseclienteConstantesFunciones.activarnombreClaseCliente);	
		//
		this.jInternalFrameDetalleFormClaseCliente.jComboBoxid_empresaClaseCliente.setEnabled(isHabilitar && this.claseclienteConstantesFunciones.activarid_empresaClaseCliente);
	};
	
	public void setDefaultControlesClaseCliente() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoClaseCliente(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.claseclienteSessionBean.setConGuardarRelaciones(true);			
			this.claseclienteSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormClaseCliente.jTabbedPaneRelacionesClaseCliente.setVisible(true);
			
					
		} else {
			//this.claseclienteSessionBean.setConGuardarRelaciones(false);			
			this.claseclienteSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormClaseCliente.jTabbedPaneRelacionesClaseCliente.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoClaseCliente() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ClaseCliente claseclienteAux:this.claseclienteLogic.getClaseClientes()) {
				if(claseclienteAux.getId().equals(this.iIdNuevoClaseCliente)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ClaseCliente claseclienteAux:this.claseclientes) {
				if(claseclienteAux.getId().equals(this.iIdNuevoClaseCliente)) {
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
	
	public int getIndiceActualClaseCliente(ClaseCliente clasecliente,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ClaseCliente claseclienteAux:this.claseclienteLogic.getClaseClientes()) {
				if(claseclienteAux.getId().equals(clasecliente.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ClaseCliente claseclienteAux:this.claseclientes) {
				if(claseclienteAux.getId().equals(clasecliente.getId())) {
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
	
	public void setCamposBaseDesdeOriginalClaseCliente(ClaseCliente claseclienteOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ClaseCliente claseclienteAux:this.claseclienteLogic.getClaseClientes()) {
				if(claseclienteAux.getClaseClienteOriginal().getId().equals(claseclienteOriginal.getId())) {
					existe=true;
					claseclienteOriginal.setId(claseclienteAux.getId());
					claseclienteOriginal.setVersionRow(claseclienteAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ClaseCliente claseclienteAux:this.claseclientes) {
				if(claseclienteAux.getClaseClienteOriginal().getId().equals(claseclienteOriginal.getId())) {
					existe=true;
					claseclienteOriginal.setId(claseclienteAux.getId());
					claseclienteOriginal.setVersionRow(claseclienteAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosClaseCliente(Boolean esParaCancelar) throws Exception {
		claseclientesAux=new ArrayList<ClaseCliente>();
		claseclienteAux=new ClaseCliente();
		
		if(!this.claseclienteSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ClaseCliente claseclienteAux:this.claseclienteLogic.getClaseClientes()) {
					if(claseclienteAux.getId()<0) {
						claseclientesAux.add(claseclienteAux);
					}		
				}
				this.iIdNuevoClaseCliente=0L;
				this.claseclienteLogic.getClaseClientes().removeAll(claseclientesAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ClaseCliente claseclienteAux:this.claseclientes) {
					if(claseclienteAux.getId()<0) {
						claseclientesAux.add(claseclienteAux);
					}		
				}
				this.iIdNuevoClaseCliente=0L;
				this.claseclientes.removeAll(claseclientesAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoClaseCliente 
					&& this.claseclienteLogic.getClaseClientes().size()>0
					) {
					claseclienteAux=this.claseclienteLogic.getClaseClientes().get(this.claseclienteLogic.getClaseClientes().size() - 1);
				
					if(claseclienteAux.getId()<0) {
						this.claseclienteLogic.getClaseClientes().remove(claseclienteAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoClaseCliente && this.claseclientes.size()>0) {
					claseclienteAux=this.claseclientes.get(this.claseclientes.size() - 1);
				
					if(claseclienteAux.getId()<0) {
						this.claseclientes.remove(claseclienteAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoClaseCliente(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(clasecliente.getId()<0) {
				this.claseclienteLogic.getClaseClientes().remove(this.clasecliente);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(clasecliente.getId()<0) {
				this.claseclientes.remove(this.clasecliente);
			}
		}			
	}
	
	public void setEstadosInicialesClaseCliente(List<ClaseCliente> claseclientesAux) throws Exception {
		ClaseClienteConstantesFunciones.setEstadosInicialesClaseCliente(claseclientesAux);
	}
	
	public void setEstadosInicialesClaseCliente(ClaseCliente claseclienteAux) throws Exception {
		ClaseClienteConstantesFunciones.setEstadosInicialesClaseCliente(claseclienteAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarClaseClienteActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesClaseCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarClaseClienteActual()) {
				if(!this.isEsNuevoClaseCliente) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesClaseCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoClaseCliente=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarClaseClienteActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Clase Cliente ?", "MANTENIMIENTO DE Clase Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesClaseCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ClaseCliente clasecliente) throws Exception {
		ClaseClienteConstantesFunciones.seleccionarAsignar(this.clasecliente,clasecliente);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarClaseCliente=this.isPermisoActualizarOriginalClaseCliente;
			
			
			this.seleccionarAsignar(clasecliente);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ClaseClienteConstantesFunciones.quitarEspaciosClaseCliente(this.clasecliente,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesClaseCliente("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.claseclienteSessionBean.setsFuncionBusquedaRapida(this.claseclienteSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoClaseCliente) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosClaseCliente(esParaCancelar);				
				this.cancelarNuevoClaseCliente(esParaCancelar);								
			}
			
			this.clasecliente=new ClaseCliente();
			
			this.inicializarClaseCliente();
			
			this.actualizarEstadoCeldasBotonesClaseCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarClaseCliente() throws Exception {
		try {
			ClaseClienteConstantesFunciones.inicializarClaseCliente(this.clasecliente);
			
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
			FuncionesSwing.manageException(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.claseclienteLogic.getClaseClientes().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteClaseClientes(String sAccionBusqueda,List<ClaseCliente> claseclientesParaReportes) throws Exception {
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
					sPathReporteFinal="ClaseCliente"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ClaseClienteMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ClaseClienteMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ClaseCliente"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Clase Clientes");		
		parameters.put("busquedapor", ClaseClienteConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceClaseCliente=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ClaseClienteConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ClaseClienteConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceClaseCliente=new JRBeanArrayDataSource(ClaseClienteJInternalFrame.TraerClaseClienteBeans(claseclientesParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceClaseCliente);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ClaseClienteConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ClaseClienteConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ClaseClienteBean.TraerClaseClienteBeans(claseclientesParaReportes).toArray()));
							
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
				this.generarExcelReporteClaseClientes(sAccionBusqueda,sTipoArchivoReporte,claseclientesParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalClaseClientes(sAccionBusqueda,sTipoArchivoReporte,claseclientesParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoClaseClienteActionPerformed(null);
					//this.generarExcelReporteClaseClientes(sAccionBusqueda,sTipoArchivoReporte,claseclientesParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalClaseClientes(sAccionBusqueda,sTipoArchivoReporte,claseclientesParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesClaseClientes(sAccionBusqueda,sTipoArchivoReporte,claseclientesParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesClaseClientes(sAccionBusqueda,sTipoArchivoReporte,claseclientesParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteClaseClientes(String sAccionBusqueda,String sTipoArchivoReporte,List<ClaseCliente> claseclientesParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"clasecliente";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ClaseClientes");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderClaseCliente("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ClaseCliente clasecliente : claseclientesParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ClaseClienteConstantesFunciones.generarExcelReporteDataClaseCliente("NORMAL",row,workbook,clasecliente,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.claseclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Clase Cliente",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderClaseCliente(String sTipo,Row row,Workbook workbook) {
		
		ClaseClienteConstantesFunciones.generarExcelReporteHeaderClaseCliente(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalClaseClientes(String sAccionBusqueda,String sTipoArchivoReporte,List<ClaseCliente> claseclientesParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"clasecliente_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ClaseClientes");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ClaseCliente clasecliente : claseclientesParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ClaseClienteConstantesFunciones.getClaseClienteDescripcion(clasecliente));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ClaseClienteConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ClaseClienteConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(clasecliente.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ClaseClienteConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ClaseClienteConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(clasecliente.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ClaseClienteConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ClaseClienteConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(clasecliente.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.claseclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Clase Cliente",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesClaseClientes(String sAccionBusqueda,String sTipoArchivoReporte,List<ClaseCliente> claseclientesParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ClaseCliente> claseclientesRespaldo=null;
		
		classes=ClaseClienteConstantesFunciones.getClassesRelationshipsOfClaseCliente(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.claseclienteLogic.setDatosCliente(this.datosCliente);
		this.claseclienteLogic.setDatosDeep(this.datosDeep);
		this.claseclienteLogic.setIsConDeep(true);
		
		claseclientesRespaldo=this.claseclienteLogic.getClaseClientes();
		
		this.claseclienteLogic.setClaseClientes(claseclientesParaReportes);	
		this.claseclienteLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		claseclientesParaReportes=this.claseclienteLogic.getClaseClientes();
		this.claseclienteLogic.setClaseClientes(claseclientesRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"clasecliente_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ClaseClientes");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderClaseCliente("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ClaseCliente clasecliente : claseclientesParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderClaseCliente("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ClaseClienteConstantesFunciones.generarExcelReporteDataClaseCliente("NORMAL",row,workbook,clasecliente,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ClaseClienteConstantesFunciones.getClaseClienteDescripcion(clasecliente));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.claseclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Clase Cliente",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoClaseCliente.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoClaseCliente.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoClaseCliente.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoClaseCliente.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessClaseCliente() throws Exception {		
		this.startProcessClaseCliente(true);
	}
	
	public void startProcessClaseCliente(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasClaseCliente ,this.jPanelParametrosReportesClaseCliente, this.jScrollPanelDatosClaseCliente,this.jPanelPaginacionClaseCliente, this.jScrollPanelDatosEdicionClaseCliente, this.jPanelAccionesClaseCliente,this.jPanelAccionesFormularioClaseCliente,this.jmenuBarClaseCliente,this.jmenuBarDetalleClaseCliente,this.jTtoolBarClaseCliente,this.jTtoolBarDetalleClaseCliente);		
		
		final JTabbedPane jTabbedPaneBusquedasClaseCliente=this.jTabbedPaneBusquedasClaseCliente; 
		
		final JPanel jPanelParametrosReportesClaseCliente=this.jPanelParametrosReportesClaseCliente;
		//final JScrollPane jScrollPanelDatosClaseCliente=this.jScrollPanelDatosClaseCliente;
		final JTable jTableDatosClaseCliente=this.jTableDatosClaseCliente;		
		final JPanel jPanelPaginacionClaseCliente=this.jPanelPaginacionClaseCliente;
		//final JScrollPane jScrollPanelDatosEdicionClaseCliente=this.jScrollPanelDatosEdicionClaseCliente;
		final JPanel jPanelAccionesClaseCliente=this.jPanelAccionesClaseCliente;
		
		JPanel jPanelCamposAuxiliarClaseCliente=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarClaseCliente=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormClaseCliente!=null) {
			jPanelCamposAuxiliarClaseCliente=this.jInternalFrameDetalleFormClaseCliente.jPanelCamposClaseCliente;
			jPanelAccionesFormularioAuxiliarClaseCliente=this.jInternalFrameDetalleFormClaseCliente.jPanelAccionesFormularioClaseCliente;
		}
		
		final JPanel jPanelCamposClaseCliente=jPanelCamposAuxiliarClaseCliente;
		final JPanel jPanelAccionesFormularioClaseCliente=jPanelAccionesFormularioAuxiliarClaseCliente;
		
		
		final JMenuBar jmenuBarClaseCliente=this.jmenuBarClaseCliente;
		final JToolBar jTtoolBarClaseCliente=this.jTtoolBarClaseCliente;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarClaseCliente=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarClaseCliente=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormClaseCliente!=null) {
			jmenuBarDetalleAuxiliarClaseCliente=this.jInternalFrameDetalleFormClaseCliente.jmenuBarDetalleClaseCliente;
			jTtoolBarDetalleAuxiliarClaseCliente=this.jInternalFrameDetalleFormClaseCliente.jTtoolBarDetalleClaseCliente;
		}
		
		final JMenuBar jmenuBarDetalleClaseCliente=jmenuBarDetalleAuxiliarClaseCliente;
		final JToolBar jTtoolBarDetalleClaseCliente=jTtoolBarDetalleAuxiliarClaseCliente;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasClaseCliente;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesClaseCliente;
			processRunnable.jTableDatos=jTableDatosClaseCliente;
			processRunnable.jPanelCampos=jPanelCamposClaseCliente;
			processRunnable.jPanelPaginacion=jPanelPaginacionClaseCliente;
			processRunnable.jPanelAcciones=jPanelAccionesClaseCliente;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioClaseCliente;
			
			
			processRunnable.jmenuBar=jmenuBarClaseCliente;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleClaseCliente;
			processRunnable.jTtoolBar=jTtoolBarClaseCliente;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleClaseCliente;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasClaseCliente ,jPanelParametrosReportesClaseCliente,jTableDatosClaseCliente, /*jScrollPanelDatosClaseCliente,*/jPanelCamposClaseCliente,jPanelPaginacionClaseCliente, /*jScrollPanelDatosEdicionClaseCliente,*/ jPanelAccionesClaseCliente,jPanelAccionesFormularioClaseCliente,jmenuBarClaseCliente,jmenuBarDetalleClaseCliente,jTtoolBarClaseCliente,jTtoolBarDetalleClaseCliente);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasClaseCliente ,jPanelParametrosReportesClaseCliente, jScrollPanelDatosClaseCliente,jPanelPaginacionClaseCliente, jScrollPanelDatosEdicionClaseCliente, jPanelAccionesClaseCliente,jPanelAccionesFormularioClaseCliente,jmenuBarClaseCliente,jmenuBarDetalleClaseCliente,jTtoolBarClaseCliente,jTtoolBarDetalleClaseCliente);
						
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
	
	public void finishProcessClaseCliente() {// throws Exception 
		this.finishProcessClaseCliente(true);
	}
	
	public void finishProcessClaseCliente(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasClaseCliente ,this.jPanelParametrosReportesClaseCliente, this.jScrollPanelDatosClaseCliente,this.jPanelPaginacionClaseCliente, this.jScrollPanelDatosEdicionClaseCliente, this.jPanelAccionesClaseCliente,this.jPanelAccionesFormularioClaseCliente,this.jmenuBarClaseCliente,this.jmenuBarDetalleClaseCliente,this.jTtoolBarClaseCliente,this.jTtoolBarDetalleClaseCliente);		
		
		final JTabbedPane jTabbedPaneBusquedasClaseCliente=this.jTabbedPaneBusquedasClaseCliente; 
		
		final JPanel jPanelParametrosReportesClaseCliente=this.jPanelParametrosReportesClaseCliente;
		//final JScrollPane jScrollPanelDatosClaseCliente=this.jScrollPanelDatosClaseCliente;
		final JTable jTableDatosClaseCliente=this.jTableDatosClaseCliente;		
		final JPanel jPanelPaginacionClaseCliente=this.jPanelPaginacionClaseCliente;
		//final JScrollPane jScrollPanelDatosEdicionClaseCliente=this.jScrollPanelDatosEdicionClaseCliente;
		final JPanel jPanelAccionesClaseCliente=this.jPanelAccionesClaseCliente;
		
		JPanel jPanelCamposAuxiliarClaseCliente=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarClaseCliente=new JPanel();
		
		if(this.jInternalFrameDetalleFormClaseCliente!=null) {
			jPanelCamposAuxiliarClaseCliente=this.jInternalFrameDetalleFormClaseCliente.jPanelCamposClaseCliente;
			jPanelAccionesFormularioAuxiliarClaseCliente=this.jInternalFrameDetalleFormClaseCliente.jPanelAccionesFormularioClaseCliente;
		}
		
		final JPanel jPanelCamposClaseCliente=jPanelCamposAuxiliarClaseCliente;
		final JPanel jPanelAccionesFormularioClaseCliente=jPanelAccionesFormularioAuxiliarClaseCliente;
		
		
		final JMenuBar jmenuBarClaseCliente=this.jmenuBarClaseCliente;		
		final JToolBar jTtoolBarClaseCliente=this.jTtoolBarClaseCliente;
				
		JMenuBar jmenuBarDetalleAuxiliarClaseCliente=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarClaseCliente=new JToolBar();
		
		if(this.jInternalFrameDetalleFormClaseCliente!=null) {
			jmenuBarDetalleAuxiliarClaseCliente=this.jInternalFrameDetalleFormClaseCliente.jmenuBarDetalleClaseCliente;
			jTtoolBarDetalleAuxiliarClaseCliente=this.jInternalFrameDetalleFormClaseCliente.jTtoolBarDetalleClaseCliente;		
		}
		
		final JMenuBar jmenuBarDetalleClaseCliente=jmenuBarDetalleAuxiliarClaseCliente;
		final JToolBar jTtoolBarDetalleClaseCliente=jTtoolBarDetalleAuxiliarClaseCliente;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasClaseCliente;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesClaseCliente;
			processRunnable.jTableDatos=jTableDatosClaseCliente;
			processRunnable.jPanelCampos=jPanelCamposClaseCliente;
			processRunnable.jPanelPaginacion=jPanelPaginacionClaseCliente;
			processRunnable.jPanelAcciones=jPanelAccionesClaseCliente;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioClaseCliente;
			
			
			processRunnable.jmenuBar=jmenuBarClaseCliente;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleClaseCliente;
			processRunnable.jTtoolBar=jTtoolBarClaseCliente;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleClaseCliente;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasClaseCliente ,jPanelParametrosReportesClaseCliente, jTableDatosClaseCliente,/*jScrollPanelDatosClaseCliente,*/jPanelCamposClaseCliente,jPanelPaginacionClaseCliente, /*jScrollPanelDatosEdicionClaseCliente,*/ jPanelAccionesClaseCliente,jPanelAccionesFormularioClaseCliente,jmenuBarClaseCliente,jmenuBarDetalleClaseCliente,jTtoolBarClaseCliente,jTtoolBarDetalleClaseCliente));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesClaseCliente(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarClaseCliente(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuClaseCliente(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarClaseCliente(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarClaseCliente,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleClaseCliente,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuClaseCliente(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarClaseCliente,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleClaseCliente,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.claseclienteConstantesFunciones.getsFinalQueryClaseCliente();
		String  finalQueryPaginacionTodos=this.claseclienteConstantesFunciones.getsFinalQueryClaseCliente();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ClaseClienteConstantesFunciones.getArrayColumnasGlobalesNoClaseCliente(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ClaseClienteConstantesFunciones.getArrayColumnasGlobalesClaseCliente(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ClaseClienteConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.claseclientesEliminados= new ArrayList<ClaseCliente>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessClaseCliente();
		
				///*ClaseClienteSessionBean*/this.claseclienteSessionBean=new ClaseClienteSessionBean();
			
			if(this.claseclienteSessionBean==null) {
				this.claseclienteSessionBean=new ClaseClienteSessionBean();
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
					this.iNumeroPaginacion=ClaseClienteConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ClaseClienteConstantesFunciones.getClassesForeignKeysOfClaseCliente(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/clasecliente."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			claseclientesAux= new ArrayList<ClaseCliente>();
			
				
			claseclienteLogic.setDatosCliente(this.datosCliente);
			claseclienteLogic.setDatosDeep(this.datosDeep);
			claseclienteLogic.setIsConDeep(true);
			
			
			claseclienteLogic.getClaseClienteDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					claseclienteLogic.getTodosClaseClientes(finalQueryGlobal,pagination);
					
					//claseclienteLogic.getTodosClaseClientesWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(claseclienteLogic.getClaseClientes()==null|| claseclienteLogic.getClaseClientes().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							claseclientesAux= new ArrayList<ClaseCliente>();
							claseclientesAux.addAll(claseclienteLogic.getClaseClientes());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							claseclientesAux= new ArrayList<ClaseCliente>();
							claseclientesAux.addAll(claseclientes);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							claseclienteLogic.getTodosClaseClientes(finalQueryGlobal+"",this.pagination);												
							
							//claseclienteLogic.getTodosClaseClientesWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteClaseClientes("Todos",claseclienteLogic.getClaseClientes() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							claseclienteLogic.setClaseClientes(new ArrayList<ClaseCliente>());					
							claseclienteLogic.getClaseClientes().addAll(claseclientesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							claseclientes=new ArrayList<ClaseCliente>();
							claseclientes.addAll(claseclientesAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idClaseCliente=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idClaseCliente=this.idActual;
				
				} else if(this.idClaseClienteActual!=null && this.idClaseClienteActual!=0L) {
					idClaseCliente=idClaseClienteActual;
				}
				
					
				this.sDetalleReporte=ClaseClienteConstantesFunciones.getDetalleIndicePorId(idClaseCliente);
				
				this.claseclientes=new ArrayList<ClaseCliente>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					claseclienteLogic.getEntity(idClaseCliente);
					
					//claseclienteLogic.getEntityWithConnection(idClaseCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					claseclienteLogic.setClaseClientes(new ArrayList<ClaseCliente>());
					claseclienteLogic.getClaseClientes().add(claseclienteLogic.getClaseCliente());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.claseclientes=new ArrayList<ClaseCliente>();
					this.claseclientes.add(clasecliente);
				}
				
				if(claseclienteLogic.getClaseCliente()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorCodigo")) {
				this.sDetalleReporte=ClaseClienteConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					claseclienteLogic.getClaseClientesBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ClaseClienteConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ClaseClienteConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=claseclienteLogic.getClaseClientes()==null||claseclienteLogic.getClaseClientes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=claseclientes==null|| claseclientes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						claseclientesAux=new ArrayList<ClaseCliente>();
						claseclientesAux.addAll(claseclienteLogic.getClaseClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							claseclientesAux=new ArrayList<ClaseCliente>();
							claseclientesAux.addAll(claseclientes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							claseclienteLogic.getClaseClientesBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ClaseClienteConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ClaseClienteConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteClaseClientes("BusquedaPorCodigo",claseclienteLogic.getClaseClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteClaseClientes("BusquedaPorCodigo",claseclientes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						claseclienteLogic.setClaseClientes(new ArrayList<ClaseCliente>());
						claseclienteLogic.getClaseClientes().addAll(claseclientesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							claseclientes=new ArrayList<ClaseCliente>();
							claseclientes.addAll(claseclientesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=ClaseClienteConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					claseclienteLogic.getClaseClientesBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ClaseClienteConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ClaseClienteConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=claseclienteLogic.getClaseClientes()==null||claseclienteLogic.getClaseClientes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=claseclientes==null|| claseclientes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						claseclientesAux=new ArrayList<ClaseCliente>();
						claseclientesAux.addAll(claseclienteLogic.getClaseClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							claseclientesAux=new ArrayList<ClaseCliente>();
							claseclientesAux.addAll(claseclientes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							claseclienteLogic.getClaseClientesBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ClaseClienteConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ClaseClienteConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteClaseClientes("BusquedaPorNombre",claseclienteLogic.getClaseClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteClaseClientes("BusquedaPorNombre",claseclientes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						claseclienteLogic.setClaseClientes(new ArrayList<ClaseCliente>());
						claseclienteLogic.getClaseClientes().addAll(claseclientesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							claseclientes=new ArrayList<ClaseCliente>();
							claseclientes.addAll(claseclientesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=ClaseClienteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					claseclienteLogic.getClaseClientesFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ClaseClienteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ClaseClienteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=claseclienteLogic.getClaseClientes()==null||claseclienteLogic.getClaseClientes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=claseclientes==null|| claseclientes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						claseclientesAux=new ArrayList<ClaseCliente>();
						claseclientesAux.addAll(claseclienteLogic.getClaseClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							claseclientesAux=new ArrayList<ClaseCliente>();
							claseclientesAux.addAll(claseclientes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							claseclienteLogic.getClaseClientesFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ClaseClienteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ClaseClienteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteClaseClientes("FK_IdEmpresa",claseclienteLogic.getClaseClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteClaseClientes("FK_IdEmpresa",claseclientes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						claseclienteLogic.setClaseClientes(new ArrayList<ClaseCliente>());
						claseclienteLogic.getClaseClientes().addAll(claseclientesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							claseclientes=new ArrayList<ClaseCliente>();
							claseclientes.addAll(claseclientesAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesClaseCliente();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessClaseCliente();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=claseclienteLogic.getClaseClientes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=claseclientes.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=claseclienteLogic.getClaseClientes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=claseclientes.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ClaseCliente clasecliente) {
		Boolean permite=true;
		
		if(this.clasecliente.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ClaseClienteConstantesFunciones.getOrderByListaClaseCliente();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ClaseClienteConstantesFunciones.getOrderByListaClaseCliente();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ClaseCliente clasecliente:claseclienteLogic.getClaseClientes()) {
				if(clasecliente.getsType().equals(Constantes2.S_TOTALES)) {
					claseclienteTotales=clasecliente;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ClaseCliente clasecliente:this.claseclientes) {
				if(clasecliente.getsType().equals(Constantes2.S_TOTALES)) {
					claseclienteTotales=clasecliente;
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
			this.claseclienteAux=new ClaseCliente();
			this.claseclienteAux.setsType(Constantes2.S_TOTALES);
			this.claseclienteAux.setIsNew(false);
			this.claseclienteAux.setIsChanged(false);
			this.claseclienteAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ClaseClienteConstantesFunciones.TotalizarValoresFilaClaseCliente(this.claseclienteLogic.getClaseClientes(),this.claseclienteAux);
				
				this.claseclienteLogic.getClaseClientes().add(this.claseclienteAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ClaseClienteConstantesFunciones.TotalizarValoresFilaClaseCliente(this.claseclientes,this.claseclienteAux);
				
				this.claseclientes.add(this.claseclienteAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		claseclienteTotales=new ClaseCliente();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.claseclienteLogic.getClaseClientes().remove(claseclienteTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.claseclientes.remove(claseclienteTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		claseclienteTotales=new ClaseCliente();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ClaseCliente clasecliente:claseclienteLogic.getClaseClientes()) {
				if(clasecliente.getsType().equals(Constantes2.S_TOTALES)) {
					claseclienteTotales=clasecliente;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ClaseClienteConstantesFunciones.TotalizarValoresFilaClaseCliente(this.claseclienteLogic.getClaseClientes(),claseclienteTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ClaseCliente clasecliente:this.claseclientes) {
				if(clasecliente.getsType().equals(Constantes2.S_TOTALES)) {
					claseclienteTotales=clasecliente;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ClaseClienteConstantesFunciones.TotalizarValoresFilaClaseCliente(this.claseclientes,claseclienteTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getClaseClientesBusquedaPorCodigo()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getClaseClientesBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getClaseClientesFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getClaseClientesBusquedaPorCodigo(String sFinalQuery,String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					claseclienteLogic.getClaseClientesBusquedaPorCodigo(sFinalQuery,this.pagination,codigo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getClaseClientesBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					claseclienteLogic.getClaseClientesBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getClaseClientesFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					claseclienteLogic.getClaseClientesFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosClaseCliente() {
		this.isPermisoTodoClaseCliente=false;
		this.isPermisoNuevoClaseCliente=false;
		this.isPermisoActualizarClaseCliente=false;
		this.isPermisoActualizarOriginalClaseCliente=false;
		this.isPermisoEliminarClaseCliente=false;
		this.isPermisoGuardarCambiosClaseCliente=false;
		this.isPermisoConsultaClaseCliente=false;
		this.isPermisoBusquedaClaseCliente=false;
		this.isPermisoReporteClaseCliente=false;		
		this.isPermisoOrdenClaseCliente=false;		
		this.isPermisoPaginacionMedioClaseCliente=false;		
		this.isPermisoPaginacionAltoClaseCliente=false;
		this.isPermisoPaginacionTodoClaseCliente=false;
		this.isPermisoCopiarClaseCliente=false;		
		this.isPermisoVerFormClaseCliente=false;		
		this.isPermisoDuplicarClaseCliente=false;		
		this.isPermisoOrdenClaseCliente=false;		
	}
	
	public void setPermisosUsuarioClaseCliente(Boolean isPermiso) {
		this.isPermisoTodoClaseCliente=isPermiso;
		this.isPermisoNuevoClaseCliente=isPermiso;
		this.isPermisoActualizarClaseCliente=isPermiso;
		this.isPermisoActualizarOriginalClaseCliente=isPermiso;
		this.isPermisoEliminarClaseCliente=isPermiso;
		this.isPermisoGuardarCambiosClaseCliente=isPermiso;
		this.isPermisoConsultaClaseCliente=isPermiso;
		this.isPermisoBusquedaClaseCliente=isPermiso;
		this.isPermisoReporteClaseCliente=isPermiso;
		this.isPermisoOrdenClaseCliente=isPermiso;		
		this.isPermisoPaginacionMedioClaseCliente=isPermiso;		
		this.isPermisoPaginacionAltoClaseCliente=isPermiso;		
		this.isPermisoPaginacionTodoClaseCliente=isPermiso;		
		this.isPermisoCopiarClaseCliente=isPermiso;		
		this.isPermisoVerFormClaseCliente=isPermiso;		
		this.isPermisoDuplicarClaseCliente=isPermiso;
		this.isPermisoOrdenClaseCliente=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioClaseCliente(Boolean isPermiso) {
		//this.isPermisoTodoClaseCliente=isPermiso;
		this.isPermisoNuevoClaseCliente=isPermiso;
		this.isPermisoActualizarClaseCliente=isPermiso;
		this.isPermisoActualizarOriginalClaseCliente=isPermiso;
		this.isPermisoEliminarClaseCliente=isPermiso;
		this.isPermisoGuardarCambiosClaseCliente=isPermiso;
		//this.isPermisoConsultaClaseCliente=isPermiso;
		//this.isPermisoBusquedaClaseCliente=isPermiso;
		//this.isPermisoReporteClaseCliente=isPermiso;
		//this.isPermisoOrdenClaseCliente=isPermiso;		
		//this.isPermisoPaginacionMedioClaseCliente=isPermiso;		
		//this.isPermisoPaginacionAltoClaseCliente=isPermiso;		
		//this.isPermisoPaginacionTodoClaseCliente=isPermiso;		
		//this.isPermisoCopiarClaseCliente=isPermiso;		
		//this.isPermisoDuplicarClaseCliente=isPermiso;
		//this.isPermisoOrdenClaseCliente=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioClaseClienteClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ClaseClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebClaseCliente(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioClaseClienteClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioClaseClienteClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionClaseClienteClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioClaseClienteClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioClaseCliente() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ClaseClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.claseclienteSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ClaseClienteConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoClaseCliente=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarClaseCliente=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalClaseCliente=this.isPermisoActualizarClaseCliente;
			this.isPermisoEliminarClaseCliente=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosClaseCliente=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaClaseCliente=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaClaseCliente=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoClaseCliente=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteClaseCliente=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenClaseCliente=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioClaseCliente=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoClaseCliente=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoClaseCliente=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarClaseCliente=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormClaseCliente=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarClaseCliente=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenClaseCliente=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.claseclienteSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosClaseCliente.setToolTipText(this.jTableDatosClaseCliente.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioClaseCliente(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioClaseCliente(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ClaseClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ClaseClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioClaseCliente() throws Exception {
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
	public void inicializarCombosForeignKeyClaseClienteListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyClaseClienteListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ClaseClienteJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyClaseClienteListas(false);
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
	
	public void cargarCombosLoteForeignKeyClaseClienteListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ClaseClienteParameterReturnGeneral claseclienteReturnGeneral=new ClaseClienteParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.claseclienteConstantesFunciones.cargarid_empresaClaseCliente)
					 || (this.esRecargarFks && this.claseclienteConstantesFunciones.cargarid_empresaClaseCliente)) {

					if(!this.claseclienteSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+claseclienteSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				claseclienteReturnGeneral=claseclienteLogic.cargarCombosLoteForeignKeyClaseCliente(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=claseclienteReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyClaseCliente()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.claseclienteSessionBean==null) {
				this.claseclienteSessionBean=new ClaseClienteSessionBean();
			}

			if(!this.claseclienteSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyClaseCliente()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyClaseCliente(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyClaseCliente()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyClaseCliente();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyClaseCliente(ClaseCliente clasecliente)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyClaseCliente(ClaseCliente clasecliente,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyClaseCliente()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyClaseCliente()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyClaseCliente()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyClaseCliente()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroClaseCliente()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyClaseCliente()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyClaseCliente(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyClaseCliente()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormClaseCliente.jComboBoxid_empresaClaseCliente!=null && this.jInternalFrameDetalleFormClaseCliente.jComboBoxid_empresaClaseCliente.getItemCount()>0) {
				this.jInternalFrameDetalleFormClaseCliente.jComboBoxid_empresaClaseCliente.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public ClaseClienteBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ClaseClienteBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ClaseClienteBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.claseclienteSessionBean=new ClaseClienteSessionBean(); 
		this.claseclienteConstantesFunciones=new ClaseClienteConstantesFunciones(); 
		this.claseclienteBean=new ClaseCliente();//(this.claseclienteConstantesFunciones); 		
		this.claseclienteReturnGeneral=new ClaseClienteParameterReturnGeneral(); 
		
		this.claseclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.claseclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ClaseClienteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ClaseClienteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ClaseClienteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessClaseCliente(true);
			
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
			
			this.claseclienteConstantesFunciones=new ClaseClienteConstantesFunciones(); 
			this.claseclienteBean=new ClaseCliente();//this.claseclienteConstantesFunciones); 			
			this.claseclienteReturnGeneral=new ClaseClienteParameterReturnGeneral(); 
		
			ClaseClienteBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Clase Cliente Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.clasecliente=new ClaseCliente();
			this.claseclientes = new ArrayList<ClaseCliente>();
			this.claseclientesAux = new ArrayList<ClaseCliente>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseclienteLogic=new ClaseClienteLogic();
				this.claseclienteLogic.getNewConnexionToDeep("");
			}
			
			//this.claseclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.claseclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormClaseCliente);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoClaseCliente!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoClaseCliente);	
					}
					
					if(this.jInternalFrameImportacionClaseCliente!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionClaseCliente);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByClaseCliente!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByClaseCliente);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormClaseCliente!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormClaseCliente);
				this.jInternalFrameDetalleFormClaseCliente.setVisible(false);
				this.jInternalFrameDetalleFormClaseCliente.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoClaseCliente!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoClaseCliente);
					this.jInternalFrameReporteDinamicoClaseCliente.setVisible(false);
					this.jInternalFrameReporteDinamicoClaseCliente.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionClaseCliente!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionClaseCliente);
					this.jInternalFrameImportacionClaseCliente.setVisible(false);
					this.jInternalFrameImportacionClaseCliente.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByClaseCliente!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByClaseCliente);
					this.jInternalFrameOrderByClaseCliente.setVisible(false);
					this.jInternalFrameOrderByClaseCliente.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idClaseClienteActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ClaseClienteConstantesFunciones.INUMEROPAGINACION;
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
			
			this.claseclienteReturnGeneral=new ClaseClienteParameterReturnGeneral();
			
			this.claseclienteParameterGeneral=new ClaseClienteParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.claseclienteLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.claseclienteSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ClaseClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.claseclienteSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ClaseClienteConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.claseclienteSessionBean.getEsGuardarRelacionado(),this.claseclienteSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ClaseClienteConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.claseclienteSessionBean.getEsGuardarRelacionado(),this.claseclienteSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoClaseCliente=false;
			this.isVisibilidadCeldaDuplicarClaseCliente=true;
			this.isVisibilidadCeldaCopiarClaseCliente=true;
			this.isVisibilidadCeldaVerFormClaseCliente=true;
			this.isVisibilidadCeldaOrdenClaseCliente=true;
			this.isVisibilidadCeldaNuevoRelacionesClaseCliente=false;
			this.isVisibilidadCeldaModificarClaseCliente=false;
			this.isVisibilidadCeldaActualizarClaseCliente=false;
			this.isVisibilidadCeldaEliminarClaseCliente=false;
			this.isVisibilidadCeldaCancelarClaseCliente=false;
			this.isVisibilidadCeldaGuardarClaseCliente=false;
			this.isVisibilidadCeldaGuardarCambiosClaseCliente=false;
			
			
			this.isVisibilidadBusquedaPorCodigo=true;
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesClaseCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosClaseCliente();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioClaseCliente(false);
			
			this.setPermisosUsuarioClaseCliente();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.claseclienteSessionBean.getEsGuardarRelacionado() 
				|| (this.claseclienteSessionBean.getEsGuardarRelacionado() && this.claseclienteSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioClaseClienteClasesRelacionadas();
			}
			
			if(this.claseclienteSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioClaseClienteClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ClaseClienteJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosClaseCliente();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualClaseCliente();
			}
			
			if(!this.isPermisoBusquedaClaseCliente) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasClaseCliente.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.claseclienteSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioClaseCliente,this.isPermisoPaginacionMedioClaseCliente,this.isPermisoPaginacionTodoClaseCliente);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ClaseClienteConstantesFunciones.getTiposSeleccionarClaseCliente());
				
				this.tiposColumnasSelect=ClaseClienteConstantesFunciones.getTiposSeleccionarClaseCliente(true);
				
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
			//if(!this.claseclienteSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioClaseCliente();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioClaseCliente(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioClaseCliente(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesClaseCliente() ;
			
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
				claseclienteImplementable= (ClaseClienteImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ClaseClienteConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				claseclienteImplementableHome= (ClaseClienteImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ClaseClienteConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.claseclientes= new ArrayList<ClaseCliente>();
			this.claseclientesEliminados= new ArrayList<ClaseCliente>();
						
			this.isEsNuevoClaseCliente=false;
			this.esParaAccionDesdeFormularioClaseCliente=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyClaseCliente(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroClaseCliente();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.claseclienteSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ClaseClienteConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesClaseCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingClaseCliente(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormClaseCliente!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioClaseCliente();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioClaseCliente();
			}
			
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasClaseCliente.getTabCount(); i++) {
					this.jTabbedPaneBusquedasClaseCliente.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasClaseCliente.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseclienteLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessClaseCliente(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ClaseCliente: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseclienteLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectClaseCliente() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesClaseCliente")) {
				iIndex=this.jInternalFrameDetalleFormClaseCliente.jTabbedPaneRelacionesClaseCliente.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormClaseCliente.jTabbedPaneRelacionesClaseCliente.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosClaseCliente.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessClaseCliente();	
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
	
	public void cargarCombosForeignKeyClaseCliente(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyClaseCliente(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyClaseCliente(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyClaseClienteListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyClaseCliente();
		
		this.cargarCombosFrameForeignKeyClaseCliente();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyClaseCliente();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyClaseCliente();
		}
	}
	
	
	
	public void jButtonNuevoClaseClienteActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.claseclienteSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormClaseCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ClaseClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.clasecliente,new Object(),this.claseclienteParameterGeneral,this.claseclienteReturnGeneral);
			
			
			if(jTableDatosClaseCliente.getRowCount()>=1) {
				jTableDatosClaseCliente.removeRowSelectionInterval(0, jTableDatosClaseCliente.getRowCount()-1);						
			}
			
			this.isEsNuevoClaseCliente=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoClaseCliente(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesClaseCliente(true);			
			//this.clasecliente=new ClaseCliente();
			//this.clasecliente.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesClaseCliente(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualClaseCliente() ;
			
			if(ClaseClienteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleClaseCliente(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.clasecliente);	
			this.actualizarInformacion("INFO_PADRE",false,this.clasecliente);				
			
			ClaseClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.clasecliente,new Object(),this.claseclienteParameterGeneral,this.claseclienteReturnGeneral);
			
			if(this.claseclienteSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ClaseCliente: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ClaseClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.clasecliente,new Object(),this.claseclienteParameterGeneral,this.claseclienteReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarClaseClienteActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ClaseCliente> claseclientesSeleccionados=new ArrayList<ClaseCliente>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosClaseCliente.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosClaseCliente.getSelectedRows().length;			
			}
			
			claseclientesSeleccionados=this.getClaseClientesSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoClaseCliente--;			
				//ClaseCliente claseclienteAux= new ClaseCliente();			
				//claseclienteAux.setId(this.iIdNuevoClaseCliente);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ClaseCliente claseclienteOrigen=new ClaseCliente();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ClaseCliente claseclienteOrigen : claseclientesSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosClaseCliente.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							claseclienteOrigen =(ClaseCliente) this.claseclienteLogic.getClaseClientes().toArray()[this.jTableDatosClaseCliente.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							claseclienteOrigen =(ClaseCliente) this.claseclientes.toArray()[this.jTableDatosClaseCliente.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaClaseCliente();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.clasecliente.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosClaseCliente(claseclienteOrigen,this.clasecliente,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysClaseCliente(this.clasecliente);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.claseclienteLogic.getClaseClientes().add(this.claseclienteAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.claseclientes.add(this.claseclienteAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaClaseCliente(false);
				
				this.jTableDatosClaseCliente.setRowSelectionInterval(this.getIndiceNuevoClaseCliente(), this.getIndiceNuevoClaseCliente());
				
				int iLastRow =  this.jTableDatosClaseCliente.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosClaseCliente.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosClaseCliente.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaClaseCliente(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarClaseClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ClaseCliente> claseclientesSeleccionados=new ArrayList<ClaseCliente>();									
		
			ClaseCliente claseclienteOrigen=new ClaseCliente();
			ClaseCliente claseclienteDestino=new ClaseCliente();
				
			claseclientesSeleccionados=this.getClaseClientesSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosClaseCliente.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || claseclientesSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosClaseCliente.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						claseclienteOrigen =(ClaseCliente) this.claseclienteLogic.getClaseClientes().toArray()[this.jTableDatosClaseCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						claseclienteOrigen =(ClaseCliente) this.claseclientes.toArray()[this.jTableDatosClaseCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						claseclienteDestino =(ClaseCliente) this.claseclienteLogic.getClaseClientes().toArray()[this.jTableDatosClaseCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						claseclienteDestino =(ClaseCliente) this.claseclientes.toArray()[this.jTableDatosClaseCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				claseclienteOrigen =claseclientesSeleccionados.get(0);
				claseclienteDestino =claseclientesSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosClaseCliente(claseclienteOrigen,claseclienteDestino,true,false);
				
				claseclienteDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(claseclienteDestino,claseclienteLogic.getClaseClientes());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(claseclienteDestino,claseclientes);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaClaseCliente(false);
				
				//this.jTableDatosClaseCliente.setRowSelectionInterval(this.getIndiceNuevoClaseCliente(), this.getIndiceNuevoClaseCliente());
				
				int iLastRow =  this.jTableDatosClaseCliente.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosClaseCliente.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosClaseCliente.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaClaseCliente(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormClaseClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormClaseCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormClaseCliente.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarClaseClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesClaseCliente.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasClaseCliente.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesClaseCliente.setVisible(!isVisible);
			this.jPanelPaginacionClaseCliente.setVisible(!isVisible);
			this.jPanelAccionesClaseCliente.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarClaseClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameClaseCliente();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoClaseClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoClaseCliente();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionClaseClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionClaseCliente();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByClaseClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByClaseCliente();
			
			this.abrirFrameOrderByClaseCliente();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByClaseClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByClaseCliente();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleClaseCliente(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormClaseCliente);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormClaseCliente.isMaximum()) {
					this.jInternalFrameDetalleFormClaseCliente.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormClaseCliente.setSize(this.jInternalFrameDetalleFormClaseCliente.iWidthFormulario,this.jInternalFrameDetalleFormClaseCliente.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormClaseCliente.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormClaseCliente.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormClaseCliente.isMaximum()) {
						this.jInternalFrameDetalleFormClaseCliente.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormClaseCliente.jContentPaneDetalleClaseCliente.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormClaseCliente.jTabbedPaneRelacionesClaseCliente.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormClaseCliente.jContentPaneDetalleClaseCliente.getWidth(),ClaseClienteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormClaseCliente.jTabbedPaneRelacionesClaseCliente.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormClaseCliente.jContentPaneDetalleClaseCliente.getWidth(),ClaseClienteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormClaseCliente.jTabbedPaneRelacionesClaseCliente.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormClaseCliente.jContentPaneDetalleClaseCliente.getWidth(),ClaseClienteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormClaseCliente.setVisible(true);
	        this.jInternalFrameDetalleFormClaseCliente.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByClaseCliente() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByClaseCliente==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByClaseCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByClaseCliente,false,this);
				} else {
					this.jInternalFrameOrderByClaseCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByClaseCliente,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByClaseCliente);
				this.jInternalFrameOrderByClaseCliente.setVisible(false);
				this.jInternalFrameOrderByClaseCliente.setSelected(false);
				
				this.jInternalFrameOrderByClaseCliente.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByClaseCliente"));
				
				this.inicializarActualizarBindingTablaOrderByClaseCliente();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionClaseCliente() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionClaseCliente==null) {
				
				this.jInternalFrameImportacionClaseCliente=new ImportacionJInternalFrame(ClaseClienteConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionClaseCliente);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionClaseCliente);
				this.jInternalFrameImportacionClaseCliente.setVisible(false);
				this.jInternalFrameImportacionClaseCliente.setSelected(false);


				this.jInternalFrameImportacionClaseCliente.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionClaseCliente"));
				this.jInternalFrameImportacionClaseCliente.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionClaseCliente"));
				this.jInternalFrameImportacionClaseCliente.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionClaseCliente"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoClaseCliente() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoClaseCliente==null) {
				this.jInternalFrameReporteDinamicoClaseCliente=new ReporteDinamicoJInternalFrame(ClaseClienteConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoClaseCliente);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoClaseCliente);
				this.jInternalFrameReporteDinamicoClaseCliente.setVisible(false);
				this.jInternalFrameReporteDinamicoClaseCliente.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoClaseCliente.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoClaseCliente"));
				this.jInternalFrameReporteDinamicoClaseCliente.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoClaseCliente"));
				this.jInternalFrameReporteDinamicoClaseCliente.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoClaseCliente"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualClaseCliente();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleClaseCliente() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormClaseCliente);
			
	       	this.jInternalFrameDetalleFormClaseCliente.setVisible(false);
	        this.jInternalFrameDetalleFormClaseCliente.setSelected(false);
			
			//this.jInternalFrameDetalleFormClaseCliente.dispose();
			//this.jInternalFrameDetalleFormClaseCliente=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoClaseCliente() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoClaseCliente.setVisible(true);
	        this.jInternalFrameReporteDinamicoClaseCliente.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionClaseCliente() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionClaseCliente.setVisible(true);
	        this.jInternalFrameImportacionClaseCliente.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByClaseCliente() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByClaseCliente.setVisible(true);
	        this.jInternalFrameOrderByClaseCliente.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByClaseCliente() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByClaseCliente.setVisible(false);
	        this.jInternalFrameOrderByClaseCliente.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoClaseCliente() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoClaseCliente.setVisible(false);
	        this.jInternalFrameReporteDinamicoClaseCliente.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionClaseCliente() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionClaseCliente.setVisible(false);
	        this.jInternalFrameImportacionClaseCliente.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarClaseClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarClaseCliente(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarClaseCliente(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosClaseCliente.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesClaseCliente(true);
			//this.isEsNuevoClaseCliente=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clasecliente =(ClaseCliente) this.claseclienteLogic.getClaseClientes().toArray()[this.jTableDatosClaseCliente.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.clasecliente =(ClaseCliente) this.claseclientes.toArray()[this.jTableDatosClaseCliente.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesClaseCliente("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesClaseCliente(false) ;
			
			if(claseclienteSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ClaseClienteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleClaseCliente(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualClaseCliente(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaClaseClienteActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosClaseCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clasecliente =(ClaseCliente) this.claseclienteLogic.getClaseClientes().toArray()[this.jTableDatosClaseCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.clasecliente =(ClaseCliente) this.claseclientes.toArray()[this.jTableDatosClaseCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarClaseCliente(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormClaseCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosClaseCliente.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesClaseCliente(true);
			//this.isEsNuevoClaseCliente=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clasecliente =(ClaseCliente) this.claseclienteLogic.getClaseClientes().toArray()[this.jTableDatosClaseCliente.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.clasecliente =(ClaseCliente) this.claseclientes.toArray()[this.jTableDatosClaseCliente.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.clasecliente.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesClaseCliente("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesClaseCliente(false) ;
			
			if(ClaseClienteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleClaseCliente(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualClaseCliente(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarClaseClienteActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseclienteLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesClaseCliente(false);
			
			//if(!this.isEsNuevoClaseCliente) {								
				int intSelectedRow = this.jTableDatosClaseCliente.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clasecliente =(ClaseCliente) this.claseclienteLogic.getClaseClientes().toArray()[this.jTableDatosClaseCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.clasecliente =(ClaseCliente) this.claseclientes.toArray()[this.jTableDatosClaseCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ClaseClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualClaseCliente(this.clasecliente,true);
				this.setVariablesFormularioToObjetoActualForeignKeysClaseCliente(this.clasecliente);
				
			}
			
			if(this.permiteMantenimiento(this.clasecliente)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.claseclienteSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoClaseCliente=true;
					this.inicializarActualizarBindingTablaClaseCliente(false);
					this.isEsNuevoClaseCliente=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoClaseCliente=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoClaseCliente=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesClaseCliente(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualClaseCliente(false);
				
				this.habilitarDeshabilitarControlesClaseCliente(false);
			
												
				
				if(ClaseClienteJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleClaseCliente();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoClaseClienteActionPerformed(evt,claseclienteSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualClaseCliente(this.clasecliente,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosClaseCliente.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,claseclienteSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseclienteLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.clasecliente.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ClaseCliente.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ClaseCliente.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarClaseClienteActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseclienteLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosClaseCliente.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.clasecliente =(ClaseCliente) this.claseclienteLogic.getClaseClientes().toArray()[this.jTableDatosClaseCliente.convertRowIndexToModel(intSelectedRow)];
				this.clasecliente.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.clasecliente =(ClaseCliente) this.claseclientes.toArray()[this.jTableDatosClaseCliente.convertRowIndexToModel(intSelectedRow)];
				this.clasecliente.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.clasecliente)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.claseclienteSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ClaseClienteModel) this.jTableDatosClaseCliente.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoClaseCliente=true;
				this.inicializarActualizarBindingTablaClaseCliente(false);
				this.isEsNuevoClaseCliente=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesClaseCliente(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualClaseCliente(false);
				
				this.habilitarDeshabilitarControlesClaseCliente(false);
				
				
				
				if(ClaseClienteJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleClaseCliente();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseclienteLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarClaseClienteActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosClaseCliente.getRowCount()>=1) {
				jTableDatosClaseCliente.removeRowSelectionInterval(0, jTableDatosClaseCliente.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesClaseCliente(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaClaseCliente(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesClaseCliente(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualClaseCliente(false) ;
			
			this.isEsNuevoClaseCliente=false;
			
			if(ClaseClienteJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleClaseCliente();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosClaseClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseclienteLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingClaseCliente(false);
				
				//SI ES MANUAL
				if(ClaseClienteJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualClaseCliente();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseclienteLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosClaseClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoClaseCliente--;			
			//ClaseCliente claseclienteAux= new ClaseCliente();			
			//claseclienteAux.setId(this.iIdNuevoClaseCliente);
			
			if(this.jInternalFrameDetalleFormClaseCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaClaseCliente();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysClaseCliente(this.clasecliente);
			
			this.clasecliente.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.claseclienteLogic.getClaseClientes().add(this.claseclienteAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.claseclientes.add(this.claseclienteAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaClaseCliente(false);
			
			this.jTableDatosClaseCliente.setRowSelectionInterval(this.getIndiceNuevoClaseCliente(), this.getIndiceNuevoClaseCliente());
			
			int iLastRow =  this.jTableDatosClaseCliente.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosClaseCliente.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosClaseCliente.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaClaseCliente(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionClaseClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseclienteLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingClaseCliente(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingClaseCliente(false);
			
			//SI ES MANUAL
			if(ClaseClienteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualClaseCliente();
			}
			
			//this.abrirFrameTreeClaseCliente();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseclienteLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionClaseClienteActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Clase ClienteS ?", "MANTENIMIENTO DE Clase Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionClaseCliente.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralClaseCliente();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.claseclienteReturnGeneral=claseclienteLogic.procesarImportacionClaseClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.claseclienteParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarClaseClienteReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionClaseClienteActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionClaseCliente.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionClaseCliente.setFileImportacion(this.jInternalFrameImportacionClaseCliente.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionClaseCliente.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionClaseCliente.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionClaseCliente.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionClaseCliente.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoClaseClienteActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ClaseCliente> claseclientesSeleccionados=new ArrayList<ClaseCliente>();		

		claseclientesSeleccionados=this.getClaseClientesSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoClaseCliente.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoClaseCliente.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ClaseClienteBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ClaseClienteBaseDesign.jrxml";
			
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
			
			this.generarReporteClaseClientes("Todos",claseclientesSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.claseclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Clase Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoClaseCliente.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoClaseCliente.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ClaseClienteConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ClaseClienteConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ClaseClienteConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoClaseCliente.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoClaseCliente.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoClaseCliente.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ClaseClienteConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case ClaseClienteConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case ClaseClienteConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoClaseCliente.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ClaseClienteConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case ClaseClienteConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case ClaseClienteConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoClaseCliente.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoClaseCliente.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ClaseClienteConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case ClaseClienteConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case ClaseClienteConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoClaseClienteActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ClaseCliente> claseclientesSeleccionados=new ArrayList<ClaseCliente>();		
		
		claseclientesSeleccionados=this.getClaseClientesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"clasecliente";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ClaseClientes");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoClaseCliente.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoClaseCliente.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ClaseClienteConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ClaseClienteConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ClaseCliente clasecliente:claseclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(clasecliente.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ClaseClienteConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ClaseClienteConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(ClaseCliente clasecliente:claseclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(clasecliente.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ClaseClienteConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ClaseClienteConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(ClaseCliente clasecliente:claseclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(clasecliente.getnombre());
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
			//	this.getFilaCabeceraExportarExcelClaseCliente(row);				
			//	iRow++;
			//}				
			
			//for(ClaseCliente claseclienteAux:claseclientesSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelClaseCliente(claseclienteAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.claseclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Clase Cliente",JOptionPane.INFORMATION_MESSAGE);
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
				this.claseclienteLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingClaseCliente(false);
			
			//SI ES MANUAL
			if(ClaseClienteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualClaseCliente();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresClaseClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseclienteLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingClaseCliente(false);
			
			//SI ES MANUAL
			if(ClaseClienteJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualClaseCliente();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesClaseClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseclienteLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingClaseCliente(false);
			
			//SI ES MANUAL
			if(ClaseClienteJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualClaseCliente();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaClaseCliente() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosClaseCliente.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosClaseCliente.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosClaseCliente.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosClaseCliente.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosClaseCliente.setMinimumSize(dimensionMinimum);
		this.jTableDatosClaseCliente.setMaximumSize(dimensionMaximum);
		this.jTableDatosClaseCliente.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingClaseCliente(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingClaseCliente(esInicializar,true);
	}
	
	public void inicializarActualizarBindingClaseCliente(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaClaseCliente(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesClaseCliente(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.claseclienteSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasClaseCliente(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesClaseCliente(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesClaseCliente(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ClaseClienteJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ClaseClienteJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualClaseCliente() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaClaseCliente();
		
		this.inicializarActualizarBindingBotonesManualClaseCliente(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.claseclienteSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualClaseCliente();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesClaseCliente() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualClaseCliente(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualClaseCliente(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosClaseCliente.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosClaseCliente.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteClaseCliente.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormClaseCliente!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormClaseCliente.jCheckBoxPostAccionNuevoClaseCliente.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormClaseCliente.jCheckBoxPostAccionSinCerrarClaseCliente.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormClaseCliente.jCheckBoxPostAccionSinMensajeClaseCliente.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosClaseCliente.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosClaseCliente.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteClaseCliente.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormClaseCliente!=null) {
				this.jInternalFrameDetalleFormClaseCliente.jCheckBoxPostAccionNuevoClaseCliente.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormClaseCliente.jCheckBoxPostAccionSinCerrarClaseCliente.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormClaseCliente.jCheckBoxPostAccionSinMensajeClaseCliente.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionClaseCliente.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionClaseCliente.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormClaseCliente!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormClaseCliente.jComboBoxTiposAccionesFormularioClaseCliente.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesClaseCliente.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoClaseCliente!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoClaseCliente.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesClaseCliente.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesClaseCliente.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarClaseCliente.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesClaseCliente.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoClaseCliente!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoClaseCliente.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesClaseCliente.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralClaseCliente.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesClaseCliente(Boolean esInicializar) throws Exception {
		try	{	
			if(ClaseClienteJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualClaseCliente(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesClaseCliente() throws Exception {
		try	{
			if(ClaseClienteJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualClaseCliente();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleClaseCliente() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormClaseCliente.jComboBoxTiposAccionesFormularioClaseCliente.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormClaseCliente.jComboBoxTiposAccionesFormularioClaseCliente.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualClaseCliente() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesClaseCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesClaseCliente.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesClaseCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesClaseCliente.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesClaseCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesClaseCliente.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionClaseCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionClaseCliente.addItem(reporte);
			}
			
			
			if(!this.claseclienteSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionClaseCliente.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionClaseCliente.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesClaseCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesClaseCliente.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesClaseCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesClaseCliente.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormClaseCliente!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormClaseCliente.jComboBoxTiposAccionesFormularioClaseCliente.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormClaseCliente.jComboBoxTiposAccionesFormularioClaseCliente.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarClaseCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarClaseCliente.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarClaseCliente.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualClaseCliente();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualClaseCliente() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoClaseCliente!=null) {
				this.jInternalFrameReporteDinamicoClaseCliente.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoClaseCliente.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoClaseCliente!=null) {
				this.jInternalFrameReporteDinamicoClaseCliente.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoClaseCliente.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoClaseCliente!=null) {
				
				if(this.jInternalFrameReporteDinamicoClaseCliente.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoClaseCliente.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoClaseCliente.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoClaseCliente.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoClaseCliente.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoClaseCliente.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualClaseCliente()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.codigoBusquedaPorCodigo=this.jTextFieldcodigoBusquedaPorCodigoClaseCliente.getText();
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreClaseCliente.getText();
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasClaseCliente(Boolean esInicializar) throws Exception {				
		if(ClaseClienteJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualClaseCliente();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaClaseCliente() throws Exception {
		this.inicializarActualizarBindingTablaClaseCliente(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByClaseCliente() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByClaseCliente.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByClaseCliente.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByClaseCliente.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ClaseClientePropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByClaseCliente.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByClaseCliente.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ClaseClientePropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosClaseClienteOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosClaseClienteOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ClaseClientePropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByClaseCliente.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByClaseCliente.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ClaseClientePropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByClaseCliente.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaClaseCliente(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=claseclienteLogic.getClaseClientes().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=claseclientes.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ClaseClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosClaseCliente.setModel(new ClaseClienteModel(this.claseclienteLogic.getClaseClientes(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosClaseCliente.setModel(new ClaseClienteModel(this.claseclientes,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByClaseCliente!=null && this.jInternalFrameOrderByClaseCliente.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByClaseCliente();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosClaseCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosClaseCliente,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ClaseClientePropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ClaseClienteConstantesFunciones.SCLASSWEBTITULO,claseclienteConstantesFunciones.resaltarSeleccionarClaseCliente,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ClaseClienteConstantesFunciones.SCLASSWEBTITULO,claseclienteConstantesFunciones.resaltarSeleccionarClaseCliente,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosClaseCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosClaseCliente,ClaseClienteConstantesFunciones.LABEL_ID));

		if(this.claseclienteConstantesFunciones.mostraridClaseCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ClaseClienteConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.claseclienteConstantesFunciones.resaltaridClaseCliente,this.claseclienteConstantesFunciones.activaridClaseCliente,this,true,"idClaseCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.claseclienteConstantesFunciones.resaltaridClaseCliente,this.claseclienteConstantesFunciones.activaridClaseCliente,this,true,"idClaseCliente","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosClaseCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosClaseCliente,ClaseClienteConstantesFunciones.LABEL_IDEMPRESA));

		if(this.claseclienteConstantesFunciones.mostrarid_empresaClaseCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ClaseClienteConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.claseclienteConstantesFunciones.resaltarid_empresaClaseCliente,this,this.claseclienteConstantesFunciones.activarid_empresaClaseCliente));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.claseclienteConstantesFunciones.resaltarid_empresaClaseCliente,this,this.claseclienteConstantesFunciones.activarid_empresaClaseCliente,false,"id_empresaClaseCliente","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ClaseClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosClaseCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosClaseCliente,ClaseClienteConstantesFunciones.LABEL_CODIGO));

		if(this.claseclienteConstantesFunciones.mostrarcodigoClaseCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ClaseClienteConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.claseclienteConstantesFunciones.resaltarcodigoClaseCliente,this.claseclienteConstantesFunciones.activarcodigoClaseCliente,this,true,"codigoClaseCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.claseclienteConstantesFunciones.resaltarcodigoClaseCliente,this.claseclienteConstantesFunciones.activarcodigoClaseCliente,this,true,"codigoClaseCliente","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ClaseClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosClaseCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosClaseCliente,ClaseClienteConstantesFunciones.LABEL_NOMBRE));

		if(this.claseclienteConstantesFunciones.mostrarnombreClaseCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ClaseClienteConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.claseclienteConstantesFunciones.resaltarnombreClaseCliente,this.claseclienteConstantesFunciones.activarnombreClaseCliente,this,true,"nombreClaseCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.claseclienteConstantesFunciones.resaltarnombreClaseCliente,this.claseclienteConstantesFunciones.activarnombreClaseCliente,this,true,"nombreClaseCliente","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ClaseClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.claseclienteSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.claseclienteSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.claseclienteSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosClaseCliente.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.claseclienteSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.claseclienteSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosClaseCliente.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarClaseCliente && this.isPermisoGuardarCambiosClaseCliente) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.claseclienteSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.claseclienteSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosClaseCliente.addColumn(tableColumn);
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
			
			this.jTableDatosClaseCliente.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarClaseCliente && this.isPermisoGuardarCambiosClaseCliente) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarClaseCliente && this.isPermisoGuardarCambiosClaseCliente) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosClaseCliente.moveColumn(this.jTableDatosClaseCliente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosClaseCliente.moveColumn(this.jTableDatosClaseCliente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosClaseCliente.moveColumn(this.jTableDatosClaseCliente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosClaseCliente.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosClaseCliente.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosClaseCliente,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ClaseClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosClaseCliente.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosClaseCliente.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ClaseClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ClaseClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosClaseCliente.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosClaseCliente.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosClaseCliente.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=claseclienteLogic.getClaseClientes().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=claseclientes.size()-1;
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
		//this.jTableDatosClaseCliente.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosClaseCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosClaseCliente();
			
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
				
				//this.isEsNuevoClaseCliente=false;
					
				ClaseClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.clasecliente,new Object(),this.claseclienteParameterGeneral,this.claseclienteReturnGeneral);
			
				if(this.claseclienteSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormClaseCliente==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosClaseCliente.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosClaseCliente.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clasecliente =(ClaseCliente) this.claseclienteLogic.getClaseClientes().toArray()[this.jTableDatosClaseCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.clasecliente =(ClaseCliente) this.claseclientes.toArray()[this.jTableDatosClaseCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.clasecliente.getsType().equals("DUPLICADO")
				   || this.clasecliente.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoClaseCliente=true;
				
				} else {
					this.isEsNuevoClaseCliente=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.claseclienteSessionBean.getEsGuardarRelacionado()) {
					if(this.clasecliente.getId()>=0 && !this.clasecliente.getIsNew()) {						
						this.isEsNuevoClaseCliente=false;
						
					} else {
						this.isEsNuevoClaseCliente=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoClaseCliente(esRelaciones);						
				
				this.seleccionarClaseCliente(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.clasecliente.getId()<0) {
					this.isEsNuevoClaseCliente=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarClaseCliente(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarClaseCliente(evt,rowIndex);
				}	
				
				if(this.claseclienteSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ClaseCliente: " + this.dDif); 
					}
				}								
				
				ClaseClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.clasecliente,new Object(),this.claseclienteParameterGeneral,this.claseclienteReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarClaseCliente(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.clasecliente)) {
					if(this.clasecliente.getId()>0) {
						this.clasecliente.setIsDeleted(true);
						
						this.claseclientesEliminados.add(this.clasecliente);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.claseclienteLogic.getClaseClientes().remove(this.clasecliente);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.claseclientes.remove(this.clasecliente);				
					}
					
					
					((ClaseClienteModel) this.jTableDatosClaseCliente.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaClaseCliente(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarClaseCliente(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoClaseCliente) {
			
			if(this.jInternalFrameDetalleFormClaseCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosClaseCliente.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosClaseCliente.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clasecliente =(ClaseCliente) this.claseclienteLogic.getClaseClientes().toArray()[this.jTableDatosClaseCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.clasecliente =(ClaseCliente) this.claseclientes.toArray()[this.jTableDatosClaseCliente.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ClaseClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioClaseCliente(this.clasecliente);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.claseclienteConstantesFunciones.cargarid_empresaClaseCliente || this.claseclienteConstantesFunciones.event_dependid_empresaClaseCliente) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.clasecliente.getid_empresa());
									//this.inicializarActualizarBindingClaseCliente(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(clasecliente.getEmpresa()!=null) {
							this.empresasForeignKey.add(clasecliente.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.clasecliente.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesClaseCliente("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesClaseCliente(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualClaseCliente() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoClaseCliente(ClaseCliente clasecliente) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoClaseCliente(clasecliente,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoClaseCliente(ClaseCliente clasecliente,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioClaseCliente(clasecliente);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyClaseCliente(clasecliente,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyClaseCliente(clasecliente);
	}
	
	public void setVariablesObjetoActualToFormularioClaseCliente(ClaseCliente clasecliente) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormClaseCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormClaseCliente.jLabelidClaseCliente.setText(clasecliente.getId().toString());
			this.jInternalFrameDetalleFormClaseCliente.jTextFieldcodigoClaseCliente.setText(clasecliente.getcodigo());
			this.jInternalFrameDetalleFormClaseCliente.jTextAreanombreClaseCliente.setText(clasecliente.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ClaseCliente claseclienteLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,claseclienteLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ClaseCliente claseclienteLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				claseclienteLocal=this.clasecliente;
			} else {
				claseclienteLocal=this.claseclienteAnterior;
			}
		}
		
		if(this.permiteMantenimiento(claseclienteLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoClaseCliente(claseclienteLocal,true);
					
					if(claseclienteSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(claseclienteLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.claseclienteSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(claseclienteLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoClaseCliente(ClaseCliente clasecliente,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualClaseCliente(clasecliente,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysClaseCliente(clasecliente);
	}
	
	public void setVariablesFormularioToObjetoActualClaseCliente(ClaseCliente clasecliente,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualClaseCliente(clasecliente,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualClaseCliente(ClaseCliente clasecliente,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormClaseCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormClaseCliente.jLabelidClaseCliente.getText()==null || this.jInternalFrameDetalleFormClaseCliente.jLabelidClaseCliente.getText()=="" || this.jInternalFrameDetalleFormClaseCliente.jLabelidClaseCliente.getText()=="Id") {
				this.jInternalFrameDetalleFormClaseCliente.jLabelidClaseCliente.setText("0");
			}

			if(conColumnasBase) {clasecliente.setId(Long.parseLong(this.jInternalFrameDetalleFormClaseCliente.jLabelidClaseCliente.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ClaseClienteConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormClaseCliente.jLabelIdClaseCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			clasecliente.setcodigo(this.jInternalFrameDetalleFormClaseCliente.jTextFieldcodigoClaseCliente.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ClaseClienteConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormClaseCliente.jLabelcodigoClaseCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			clasecliente.setnombre(this.jInternalFrameDetalleFormClaseCliente.jTextAreanombreClaseCliente.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ClaseClienteConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormClaseCliente.jLabelnombreClaseCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualClaseCliente(ClaseCliente claseclienteBean,ClaseCliente clasecliente,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosClaseCliente(ClaseCliente claseclienteOrigen,ClaseCliente clasecliente,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && claseclienteOrigen.getId()!=null && !claseclienteOrigen.getId().equals(0L))) {clasecliente.setId(claseclienteOrigen.getId());}}
			if(conDefault || (!conDefault && claseclienteOrigen.getcodigo()!=null && !claseclienteOrigen.getcodigo().equals(""))) {clasecliente.setcodigo(claseclienteOrigen.getcodigo());}
			if(conDefault || (!conDefault && claseclienteOrigen.getnombre()!=null && !claseclienteOrigen.getnombre().equals(""))) {clasecliente.setnombre(claseclienteOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioClaseCliente(ClaseCliente clasecliente) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormClaseCliente.jLabelidClaseCliente.setText(clasecliente.getId().toString());
			this.jInternalFrameDetalleFormClaseCliente.jTextFieldcodigoClaseCliente.setText(clasecliente.getcodigo());
			this.jInternalFrameDetalleFormClaseCliente.jTextAreanombreClaseCliente.setText(clasecliente.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioClaseCliente(ClaseClienteBean claseclienteBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormClaseCliente.jLabelidClaseCliente.setText(claseclienteBean.getId().toString());
			this.jInternalFrameDetalleFormClaseCliente.jTextFieldcodigoClaseCliente.setText(claseclienteBean.getcodigo());
			this.jInternalFrameDetalleFormClaseCliente.jTextAreanombreClaseCliente.setText(claseclienteBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanClaseCliente(ClaseClienteParameterReturnGeneral claseclienteReturnGeneral,ClaseClienteBean claseclienteBean,Boolean conDefault) throws Exception { 
		try {
			ClaseCliente claseclienteLocal=new ClaseCliente();
			
			claseclienteLocal=claseclienteReturnGeneral.getClaseCliente();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && claseclienteLocal.getId()!=null && !claseclienteLocal.getId().equals(0L))) {claseclienteBean.setId(claseclienteLocal.getId());}}
			if(conDefault || (!conDefault && claseclienteLocal.getcodigo()!=null && !claseclienteLocal.getcodigo().equals(""))) {claseclienteBean.setcodigo(claseclienteLocal.getcodigo());}
			if(conDefault || (!conDefault && claseclienteLocal.getnombre()!=null && !claseclienteLocal.getnombre().equals(""))) {claseclienteBean.setnombre(claseclienteLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxClaseClienteGenerico(Long idClaseClienteSeleccionado,JComboBox jComboBoxClaseCliente,List<ClaseCliente> claseclientesLocal)throws Exception {
		try {
			ClaseCliente  claseclienteTemp=null;

			for(ClaseCliente claseclienteAux:claseclientesLocal) {
				if(claseclienteAux.getId()!=null && claseclienteAux.getId().equals(idClaseClienteSeleccionado)) {
					claseclienteTemp=claseclienteAux;
					break;
				}
			}

			jComboBoxClaseCliente.setSelectedItem(claseclienteTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxClaseClienteGenerico(JComboBox jComboBoxClaseCliente,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxClaseCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxClaseCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxClaseCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxClaseCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxClaseCliente.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxClaseCliente.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxClaseCliente.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxClaseCliente.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxClaseCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxClaseCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			clasecliente=(ClaseCliente) claseclienteLogic.getClaseClientes().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			clasecliente =(ClaseCliente) claseclientes.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!clasecliente.getIsNew() && !clasecliente.getIsChanged() && !clasecliente.getIsDeleted()) {
				sDescripcion=clasecliente.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=clasecliente.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ClaseCliente claseclienteRow=new ClaseCliente();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			claseclienteRow=(ClaseCliente) claseclienteLogic.getClaseClientes().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			claseclienteRow=(ClaseCliente) claseclientes.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualClaseCliente(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoClaseCliente.setVisible((this.isVisibilidadCeldaNuevoClaseCliente && this.isPermisoNuevoClaseCliente));			
			this.jButtonDuplicarClaseCliente.setVisible((this.isVisibilidadCeldaDuplicarClaseCliente && this.isPermisoDuplicarClaseCliente));			
			this.jButtonCopiarClaseCliente.setVisible((this.isVisibilidadCeldaCopiarClaseCliente && this.isPermisoCopiarClaseCliente));
			this.jButtonVerFormClaseCliente.setVisible((this.isVisibilidadCeldaVerFormClaseCliente && this.isPermisoVerFormClaseCliente));
			
			this.jButtonAbrirOrderByClaseCliente.setVisible((this.isVisibilidadCeldaOrdenClaseCliente && this.isPermisoOrdenClaseCliente));			
			
			this.jButtonNuevoRelacionesClaseCliente.setVisible((this.isVisibilidadCeldaNuevoRelacionesClaseCliente && this.isPermisoNuevoClaseCliente));			
			this.jButtonNuevoGuardarCambiosClaseCliente.setVisible((this.isVisibilidadCeldaNuevoClaseCliente && this.isPermisoNuevoClaseCliente && this.isPermisoGuardarCambiosClaseCliente));
			
			if(this.jInternalFrameDetalleFormClaseCliente!=null) {
			this.jInternalFrameDetalleFormClaseCliente.jButtonModificarClaseCliente.setVisible((this.isVisibilidadCeldaModificarClaseCliente && this.isPermisoActualizarClaseCliente));	
			this.jInternalFrameDetalleFormClaseCliente.jButtonActualizarClaseCliente.setVisible((this.isVisibilidadCeldaActualizarClaseCliente && this.isPermisoActualizarClaseCliente));	
			this.jInternalFrameDetalleFormClaseCliente.jButtonEliminarClaseCliente.setVisible((this.isVisibilidadCeldaEliminarClaseCliente && this.isPermisoEliminarClaseCliente));
			this.jInternalFrameDetalleFormClaseCliente.jButtonCancelarClaseCliente.setVisible(this.isVisibilidadCeldaCancelarClaseCliente);							
			this.jInternalFrameDetalleFormClaseCliente.jButtonGuardarCambiosClaseCliente.setVisible((this.isVisibilidadCeldaGuardarClaseCliente && this.isPermisoGuardarCambiosClaseCliente));			
			
			}
						
			this.jButtonGuardarCambiosTablaClaseCliente.setVisible((this.isVisibilidadCeldaGuardarCambiosClaseCliente && this.isPermisoGuardarCambiosClaseCliente));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarClaseCliente.setVisible((this.isVisibilidadCeldaNuevoClaseCliente && this.isPermisoNuevoClaseCliente));						
			this.jButtonDuplicarToolBarClaseCliente.setVisible((this.isVisibilidadCeldaDuplicarClaseCliente && this.isPermisoDuplicarClaseCliente));						
			this.jButtonCopiarToolBarClaseCliente.setVisible((this.isVisibilidadCeldaCopiarClaseCliente && this.isPermisoCopiarClaseCliente));			
			this.jButtonVerFormToolBarClaseCliente.setVisible((this.isVisibilidadCeldaVerFormClaseCliente && this.isPermisoVerFormClaseCliente));			
			this.jButtonAbrirOrderByToolBarClaseCliente.setVisible((this.isVisibilidadCeldaOrdenClaseCliente && this.isPermisoOrdenClaseCliente));
			this.jButtonNuevoRelacionesToolBarClaseCliente.setVisible((this.isVisibilidadCeldaNuevoRelacionesClaseCliente && this.isPermisoNuevoClaseCliente));			
			this.jButtonNuevoGuardarCambiosToolBarClaseCliente.setVisible((this.isVisibilidadCeldaNuevoClaseCliente && this.isPermisoNuevoClaseCliente && this.isPermisoGuardarCambiosClaseCliente));			
			
			if(this.jInternalFrameDetalleFormClaseCliente!=null) {
			this.jInternalFrameDetalleFormClaseCliente.jButtonModificarToolBarClaseCliente.setVisible((this.isVisibilidadCeldaModificarClaseCliente && this.isPermisoActualizarClaseCliente));	
			this.jInternalFrameDetalleFormClaseCliente.jButtonActualizarToolBarClaseCliente.setVisible((this.isVisibilidadCeldaActualizarClaseCliente  && this.isPermisoActualizarClaseCliente));	
			this.jInternalFrameDetalleFormClaseCliente.jButtonEliminarToolBarClaseCliente.setVisible((this.isVisibilidadCeldaEliminarClaseCliente && this.isPermisoEliminarClaseCliente));
			this.jInternalFrameDetalleFormClaseCliente.jButtonCancelarToolBarClaseCliente.setVisible(this.isVisibilidadCeldaCancelarClaseCliente);				
			this.jInternalFrameDetalleFormClaseCliente.jButtonGuardarCambiosToolBarClaseCliente.setVisible((this.isVisibilidadCeldaGuardarClaseCliente && this.isPermisoGuardarCambiosClaseCliente));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarClaseCliente.setVisible((this.isVisibilidadCeldaGuardarCambiosClaseCliente && this.isPermisoGuardarCambiosClaseCliente));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoClaseCliente.setVisible((this.isVisibilidadCeldaNuevoClaseCliente && this.isPermisoNuevoClaseCliente));			
			this.jMenuItemDuplicarClaseCliente.setVisible((this.isVisibilidadCeldaDuplicarClaseCliente && this.isPermisoDuplicarClaseCliente));			
			this.jMenuItemCopiarClaseCliente.setVisible((this.isVisibilidadCeldaCopiarClaseCliente && this.isPermisoCopiarClaseCliente));			
			this.jMenuItemVerFormClaseCliente.setVisible((this.isVisibilidadCeldaVerFormClaseCliente && this.isPermisoVerFormClaseCliente));			
			this.jMenuItemAbrirOrderByClaseCliente.setVisible((this.isVisibilidadCeldaOrdenClaseCliente && this.isPermisoOrdenClaseCliente));			
			//this.jMenuItemMostrarOcultarClaseCliente.setVisible((this.isVisibilidadCeldaOrdenClaseCliente && this.isPermisoOrdenClaseCliente));
			this.jMenuItemDetalleAbrirOrderByClaseCliente.setVisible((this.isVisibilidadCeldaOrdenClaseCliente && this.isPermisoOrdenClaseCliente));			
			//this.jMenuItemDetalleMostrarOcultarClaseCliente.setVisible((this.isVisibilidadCeldaOrdenClaseCliente && this.isPermisoOrdenClaseCliente));			
			this.jMenuItemNuevoRelacionesClaseCliente.setVisible((this.isVisibilidadCeldaNuevoRelacionesClaseCliente && this.isPermisoNuevoClaseCliente));			
			this.jMenuItemNuevoGuardarCambiosClaseCliente.setVisible((this.isVisibilidadCeldaNuevoClaseCliente && this.isPermisoNuevoClaseCliente && this.isPermisoGuardarCambiosClaseCliente));									
			
			if(this.jInternalFrameDetalleFormClaseCliente!=null) {
			this.jInternalFrameDetalleFormClaseCliente.jMenuItemModificarClaseCliente.setVisible((this.isVisibilidadCeldaModificarClaseCliente && this.isPermisoActualizarClaseCliente));	
			this.jInternalFrameDetalleFormClaseCliente.jMenuItemActualizarClaseCliente.setVisible((this.isVisibilidadCeldaActualizarClaseCliente && this.isPermisoActualizarClaseCliente));	
			this.jInternalFrameDetalleFormClaseCliente.jMenuItemEliminarClaseCliente.setVisible((this.isVisibilidadCeldaEliminarClaseCliente && this.isPermisoEliminarClaseCliente));
			this.jInternalFrameDetalleFormClaseCliente.jMenuItemCancelarClaseCliente.setVisible(this.isVisibilidadCeldaCancelarClaseCliente);				
			}
			
			this.jMenuItemGuardarCambiosClaseCliente.setVisible((this.isVisibilidadCeldaGuardarClaseCliente && this.isPermisoGuardarCambiosClaseCliente));						
			this.jMenuItemGuardarCambiosTablaClaseCliente.setVisible((this.isVisibilidadCeldaGuardarCambiosClaseCliente && this.isPermisoGuardarCambiosClaseCliente));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoClaseCliente=this.jButtonNuevoClaseCliente.isVisible();
			this.isVisibilidadCeldaDuplicarClaseCliente=this.jButtonDuplicarClaseCliente.isVisible();
			this.isVisibilidadCeldaCopiarClaseCliente=this.jButtonCopiarClaseCliente.isVisible();
			this.isVisibilidadCeldaVerFormClaseCliente=this.jButtonVerFormClaseCliente.isVisible();
			
			this.isVisibilidadCeldaOrdenClaseCliente=this.jButtonAbrirOrderByClaseCliente.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesClaseCliente=this.jButtonNuevoRelacionesClaseCliente.isVisible();
			this.isVisibilidadCeldaModificarClaseCliente=this.jButtonModificarClaseCliente.isVisible();
			
			if(this.jInternalFrameDetalleFormClaseCliente!=null) {
			this.isVisibilidadCeldaActualizarClaseCliente=this.jInternalFrameDetalleFormClaseCliente.jButtonActualizarClaseCliente.isVisible();
			this.isVisibilidadCeldaEliminarClaseCliente=this.jInternalFrameDetalleFormClaseCliente.jButtonEliminarClaseCliente.isVisible();
			this.isVisibilidadCeldaCancelarClaseCliente=this.jInternalFrameDetalleFormClaseCliente.jButtonCancelarClaseCliente.isVisible();
			this.isVisibilidadCeldaGuardarClaseCliente=this.jInternalFrameDetalleFormClaseCliente.jButtonGuardarCambiosClaseCliente.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosClaseCliente=this.jButtonGuardarCambiosTablaClaseCliente.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoClaseCliente=this.jButtonNuevoToolBarClaseCliente.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesClaseCliente=this.jButtonNuevoRelacionesToolBarClaseCliente.isVisible();
			
			if(this.jInternalFrameDetalleFormClaseCliente!=null) {
			this.isVisibilidadCeldaModificarClaseCliente=this.jInternalFrameDetalleFormClaseCliente.jButtonModificarToolBarClaseCliente.isVisible();
			this.isVisibilidadCeldaActualizarClaseCliente=this.jInternalFrameDetalleFormClaseCliente.jButtonActualizarToolBarClaseCliente.isVisible();
			this.isVisibilidadCeldaEliminarClaseCliente=this.jInternalFrameDetalleFormClaseCliente.jButtonEliminarToolBarClaseCliente.isVisible();
			this.isVisibilidadCeldaCancelarClaseCliente=this.jInternalFrameDetalleFormClaseCliente.jButtonCancelarToolBarClaseCliente.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarClaseCliente=this.jButtonGuardarCambiosToolBarClaseCliente.isVisible();
			this.isVisibilidadCeldaGuardarCambiosClaseCliente=this.jButtonGuardarCambiosTablaToolBarClaseCliente.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoClaseCliente=this.jMenuItemNuevoClaseCliente.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesClaseCliente=this.jMenuItemNuevoRelacionesClaseCliente.isVisible();
			
			if(this.jInternalFrameDetalleFormClaseCliente!=null) {
			this.isVisibilidadCeldaModificarClaseCliente=this.jInternalFrameDetalleFormClaseCliente.jMenuItemModificarClaseCliente.isVisible();
			this.isVisibilidadCeldaActualizarClaseCliente=this.jInternalFrameDetalleFormClaseCliente.jMenuItemActualizarClaseCliente.isVisible();
			this.isVisibilidadCeldaEliminarClaseCliente=this.jInternalFrameDetalleFormClaseCliente.jMenuItemEliminarClaseCliente.isVisible();
			this.isVisibilidadCeldaCancelarClaseCliente=this.jInternalFrameDetalleFormClaseCliente.jMenuItemCancelarClaseCliente.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarClaseCliente=this.jMenuItemGuardarCambiosClaseCliente.isVisible();
			this.isVisibilidadCeldaGuardarCambiosClaseCliente=this.jMenuItemGuardarCambiosTablaClaseCliente.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesClaseCliente(Boolean esInicializar) {
		if(ClaseClienteJInternalFrame.ISBINDING_MANUAL) {			
			if(this.claseclienteSessionBean.getConGuardarRelaciones()) {
				//if(this.claseclienteSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesClaseCliente();
			}
			
			this.inicializarActualizarBindingBotonesManualClaseCliente(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualClaseCliente() {
		this.jButtonNuevoClaseCliente.setVisible(this.isPermisoNuevoClaseCliente);			
		this.jButtonDuplicarClaseCliente.setVisible(this.isPermisoDuplicarClaseCliente);			
		this.jButtonCopiarClaseCliente.setVisible(this.isPermisoCopiarClaseCliente);			
		this.jButtonVerFormClaseCliente.setVisible(this.isPermisoVerFormClaseCliente);			
		
		this.jButtonAbrirOrderByClaseCliente.setVisible(this.isPermisoOrdenClaseCliente);					
		
		this.jButtonNuevoRelacionesClaseCliente.setVisible(this.isPermisoNuevoClaseCliente);			
		
		if(this.jInternalFrameDetalleFormClaseCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormClaseCliente.jButtonModificarClaseCliente.setVisible(this.isPermisoActualizarClaseCliente);	
			this.jInternalFrameDetalleFormClaseCliente.jButtonActualizarClaseCliente.setVisible(this.isPermisoActualizarClaseCliente);	
			this.jInternalFrameDetalleFormClaseCliente.jButtonEliminarClaseCliente.setVisible(this.isPermisoEliminarClaseCliente);
			this.jInternalFrameDetalleFormClaseCliente.jButtonCancelarClaseCliente.setVisible(this.isVisibilidadCeldaCancelarClaseCliente);						
			this.jInternalFrameDetalleFormClaseCliente.jButtonGuardarCambiosClaseCliente.setVisible(this.isPermisoGuardarCambiosClaseCliente);							
		}
		
		this.jButtonGuardarCambiosTablaClaseCliente.setVisible(this.isPermisoActualizarClaseCliente);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleClaseCliente() {
		this.jInternalFrameDetalleFormClaseCliente.jButtonModificarClaseCliente.setVisible(this.isPermisoActualizarClaseCliente);	
		this.jInternalFrameDetalleFormClaseCliente.jButtonActualizarClaseCliente.setVisible(this.isPermisoActualizarClaseCliente);	
		this.jInternalFrameDetalleFormClaseCliente.jButtonEliminarClaseCliente.setVisible(this.isPermisoEliminarClaseCliente);
		this.jInternalFrameDetalleFormClaseCliente.jButtonCancelarClaseCliente.setVisible(this.isVisibilidadCeldaCancelarClaseCliente);							
		this.jInternalFrameDetalleFormClaseCliente.jButtonGuardarCambiosClaseCliente.setVisible((this.isVisibilidadCeldaGuardarClaseCliente && this.isPermisoGuardarCambiosClaseCliente));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosClaseCliente() {
		if(ClaseClienteJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualClaseCliente();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesClaseCliente() {
	}
	
	public void jTableDatosClaseClienteListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarClaseCliente(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidClaseClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.claseclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosClaseCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualClaseCliente(this.getclasecliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysClaseCliente(this.clasecliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.clasecliente =(ClaseCliente) this.claseclienteLogic.getClaseClientes().toArray()[this.jTableDatosClaseCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.clasecliente =(ClaseCliente) this.claseclientes.toArray()[this.jTableDatosClaseCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.clasecliente==null) {
						this.clasecliente = new ClaseCliente();
					}

					this.setVariablesFormularioToObjetoActualClaseCliente(this.clasecliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysClaseCliente(this.clasecliente);
				}

				if(this.clasecliente.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.clasecliente.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingClaseCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.claseclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.claseclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.claseclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaClaseClienteUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseclienteLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebClaseCliente(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosClaseCliente.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosClaseCliente.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosClaseCliente.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.clasecliente =(ClaseCliente) this.claseclienteLogic.getClaseClientes().toArray()[this.jTableDatosClaseCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.clasecliente =(ClaseCliente) this.claseclientes.toArray()[this.jTableDatosClaseCliente.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualClaseCliente(this.getclasecliente(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysClaseCliente(this.clasecliente);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.claseclienteLogic.getConnexion());

				if(this.clasecliente.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.clasecliente.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderClaseCliente=(TitledBorder)this.jScrollPanelDatosClaseCliente.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderClaseCliente.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseclienteLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseclienteLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaClaseClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.claseclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosClaseCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualClaseCliente(this.getclasecliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysClaseCliente(this.clasecliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.clasecliente =(ClaseCliente) this.claseclienteLogic.getClaseClientes().toArray()[this.jTableDatosClaseCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.clasecliente =(ClaseCliente) this.claseclientes.toArray()[this.jTableDatosClaseCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.clasecliente==null) {
						this.clasecliente = new ClaseCliente();
					}

					this.setVariablesFormularioToObjetoActualClaseCliente(this.clasecliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysClaseCliente(this.clasecliente);
				}

				if(this.clasecliente.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.clasecliente.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingClaseCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.claseclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.claseclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.claseclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoClaseClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.claseclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosClaseCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualClaseCliente(this.getclasecliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysClaseCliente(this.clasecliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.clasecliente =(ClaseCliente) this.claseclienteLogic.getClaseClientes().toArray()[this.jTableDatosClaseCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.clasecliente =(ClaseCliente) this.claseclientes.toArray()[this.jTableDatosClaseCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.clasecliente==null) {
						this.clasecliente = new ClaseCliente();
					}

					this.setVariablesFormularioToObjetoActualClaseCliente(this.clasecliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysClaseCliente(this.clasecliente);
				}

				if(this.clasecliente.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.clasecliente.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingClaseCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.claseclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.claseclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.claseclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreClaseClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.claseclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosClaseCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualClaseCliente(this.getclasecliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysClaseCliente(this.clasecliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.clasecliente =(ClaseCliente) this.claseclienteLogic.getClaseClientes().toArray()[this.jTableDatosClaseCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.clasecliente =(ClaseCliente) this.claseclientes.toArray()[this.jTableDatosClaseCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.clasecliente==null) {
						this.clasecliente = new ClaseCliente();
					}

					this.setVariablesFormularioToObjetoActualClaseCliente(this.clasecliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysClaseCliente(this.clasecliente);
				}

				if(this.clasecliente.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.clasecliente.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingClaseCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.claseclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.claseclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.claseclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorCodigoClaseClienteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseclienteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingClaseCliente(false,false);

			this.getClaseClientesBusquedaPorCodigo();

			this.inicializarActualizarBindingClaseCliente(false);

			//if(ClaseClienteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingClaseCliente(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseclienteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseclienteLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorNombreClaseClienteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseclienteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingClaseCliente(false,false);

			this.getClaseClientesBusquedaPorNombre();

			this.inicializarActualizarBindingClaseCliente(false);

			//if(ClaseClienteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingClaseCliente(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseclienteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseclienteLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaClaseClienteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseclienteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingClaseCliente(false,false);

			this.getClaseClientesFK_IdEmpresa();

			this.inicializarActualizarBindingClaseCliente(false);

			//if(ClaseClienteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingClaseCliente(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseclienteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.claseclienteLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameClaseCliente() {
		if(this.jInternalFrameDetalleFormClaseCliente!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormClaseCliente!=null) {
			this.jInternalFrameDetalleFormClaseCliente.setVisible(false);	    			
			this.jInternalFrameDetalleFormClaseCliente.dispose();
			this.jInternalFrameDetalleFormClaseCliente=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoClaseCliente!=null) {
			this.jInternalFrameReporteDinamicoClaseCliente.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoClaseCliente.dispose();
			this.jInternalFrameReporteDinamicoClaseCliente=null;
		}
		
		if(this.jInternalFrameImportacionClaseCliente!=null) {
			this.jInternalFrameImportacionClaseCliente.setVisible(false);	    			
			this.jInternalFrameImportacionClaseCliente.dispose();
			this.jInternalFrameImportacionClaseCliente=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessClaseCliente();
			
			ClaseClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.clasecliente,new Object(),this.claseclienteParameterGeneral,this.claseclienteReturnGeneral);
			
			
			if(sTipo.equals("NuevoClaseCliente")) {
				jButtonNuevoClaseClienteActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarClaseCliente")) {
				jButtonDuplicarClaseClienteActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarClaseCliente")) {
				jButtonCopiarClaseClienteActionPerformed(evt);
			} else if(sTipo.equals("VerFormClaseCliente")) {
				jButtonVerFormClaseClienteActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarClaseCliente")) {
				jButtonNuevoClaseClienteActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarClaseCliente")) {
				jButtonDuplicarClaseClienteActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoClaseCliente")) {
				jButtonNuevoClaseClienteActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarClaseCliente")) {
				jButtonDuplicarClaseClienteActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesClaseCliente")) {
				jButtonNuevoClaseClienteActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarClaseCliente")) {
				jButtonNuevoClaseClienteActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesClaseCliente")) {
				jButtonNuevoClaseClienteActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarClaseCliente")) {
				jButtonModificarClaseClienteActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarClaseCliente")) {
				jButtonModificarClaseClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarClaseCliente")) {
				jButtonModificarClaseClienteActionPerformed(evt);
			} else if(sTipo.equals("ActualizarClaseCliente")) {
				jButtonActualizarClaseClienteActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarClaseCliente")) {
				jButtonActualizarClaseClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarClaseCliente")) {
				jButtonActualizarClaseClienteActionPerformed(evt);
			} else if(sTipo.equals("EliminarClaseCliente")) {
				jButtonEliminarClaseClienteActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarClaseCliente")) {
				jButtonEliminarClaseClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarClaseCliente")) {
				jButtonEliminarClaseClienteActionPerformed(evt);
			} else if(sTipo.equals("CancelarClaseCliente")) {
				jButtonCancelarClaseClienteActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarClaseCliente")) {
				jButtonCancelarClaseClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarClaseCliente")) {
				jButtonCancelarClaseClienteActionPerformed(evt);
			} else if(sTipo.equals("CerrarClaseCliente")) {
				jButtonCerrarClaseClienteActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarClaseCliente")) {
				jButtonCerrarClaseClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarClaseCliente")) {
				jButtonCerrarClaseClienteActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarClaseCliente")) {
				jButtonMostrarOcultarClaseClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarClaseCliente")) {
				jButtonCancelarClaseClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosClaseCliente")) {
				jButtonGuardarCambiosClaseClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarClaseCliente")) {
				jButtonGuardarCambiosClaseClienteActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarClaseCliente")) {
				jButtonCopiarClaseClienteActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarClaseCliente")) {
				jButtonVerFormClaseClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosClaseCliente")) {
				jButtonGuardarCambiosClaseClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarClaseCliente")) {
				jButtonCopiarClaseClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormClaseCliente")) {
				jButtonVerFormClaseClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaClaseCliente")) {
				jButtonGuardarCambiosClaseClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarClaseCliente")) {
				jButtonGuardarCambiosClaseClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaClaseCliente")) {
				jButtonGuardarCambiosClaseClienteActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionClaseCliente")) {
				jButtonRecargarInformacionClaseClienteActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarClaseCliente")) {
				jButtonRecargarInformacionClaseClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionClaseCliente")) {
				jButtonRecargarInformacionClaseClienteActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresClaseCliente")) {
				jButtonAnterioresClaseClienteActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarClaseCliente")) {
				jButtonAnterioresClaseClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreClaseCliente")) {
				jButtonAnterioresClaseClienteActionPerformed(evt);
			} else if(sTipo.equals("SiguientesClaseCliente")) {
				jButtonSiguientesClaseClienteActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarClaseCliente")) {
				jButtonSiguientesClaseClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesClaseCliente")) {
				jButtonSiguientesClaseClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByClaseCliente") || sTipo.equals("MenuItemDetalleAbrirOrderByClaseCliente")) {
				jButtonAbrirOrderByClaseClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarClaseCliente") || sTipo.equals("MenuItemDetalleMostrarOcultarClaseCliente")) {
				jButtonMostrarOcultarClaseClienteActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosClaseCliente")) {
				jButtonNuevoGuardarCambiosClaseClienteActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarClaseCliente")) {
				jButtonNuevoGuardarCambiosClaseClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosClaseCliente")) {
				jButtonNuevoGuardarCambiosClaseClienteActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoClaseCliente")) {
				jButtonCerrarReporteDinamicoClaseClienteActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoClaseCliente")) {
				jButtonGenerarReporteDinamicoClaseClienteActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoClaseCliente")) {
				
				jButtonGenerarExcelReporteDinamicoClaseClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionClaseCliente")) {
				jButtonCerrarImportacionClaseClienteActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionClaseCliente")) {
				
				jButtonGenerarImportacionClaseClienteActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionClaseCliente")) {
				
				jButtonAbrirImportacionClaseClienteActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesClaseCliente")) {
				jComboBoxTiposAccionesClaseClienteActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesClaseCliente")) {
				jComboBoxTiposRelacionesClaseClienteActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioClaseCliente")) {
				jComboBoxTiposAccionesClaseClienteActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarClaseCliente")) {
				
				jComboBoxTiposSeleccionarClaseClienteActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralClaseCliente")) {
				jTextFieldValorCampoGeneralClaseClienteActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByClaseCliente")) {
				jButtonAbrirOrderByClaseClienteActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarClaseCliente")) {
				jButtonAbrirOrderByClaseClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByClaseCliente")) {
				jButtonCerrarOrderByClaseClienteActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idClaseClienteBusqueda")) {
				this.jButtonidClaseClienteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaClaseClienteUpdate")) {
				this.jButtonid_empresaClaseClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaClaseClienteBusqueda")) {
				this.jButtonid_empresaClaseClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoClaseClienteBusqueda")) {
				this.jButtoncodigoClaseClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreClaseClienteBusqueda")) {
				this.jButtonnombreClaseClienteBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorCodigoClaseCliente")) {
				this.jButtonBusquedaPorCodigoClaseClienteActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorNombreClaseCliente")) {
				this.jButtonBusquedaPorNombreClaseClienteActionPerformed(evt);
			}
			
			;
			
			
			ClaseClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.clasecliente,new Object(),this.claseclienteParameterGeneral,this.claseclienteReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessClaseCliente();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaClaseClienteActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.clasecliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.clasecliente);
				
				ClaseClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clasecliente,new Object(),this.claseclienteParameterGeneral,this.claseclienteReturnGeneral);
				
				


				
				ClaseClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clasecliente,new Object(),this.claseclienteParameterGeneral,this.claseclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ClaseCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ClaseCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ClaseCliente claseclienteLocal=null;
			
			if(!this.getEsControlTabla()) {
				claseclienteLocal=this.clasecliente;
			} else {
				claseclienteLocal=this.claseclienteAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.clasecliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.clasecliente);
				
				ClaseClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clasecliente,new Object(),this.claseclienteParameterGeneral,this.claseclienteReturnGeneral);
							
				
				


				
				ClaseClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clasecliente,new Object(),this.claseclienteParameterGeneral,this.claseclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ClaseCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ClaseCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaClaseClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosClaseCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.claseclienteAnterior =(ClaseCliente) this.claseclienteLogic.getClaseClientes().toArray()[this.jTableDatosClaseCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.claseclienteAnterior =(ClaseCliente) this.claseclientes.toArray()[this.jTableDatosClaseCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
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
			
			ClaseClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clasecliente,new Object(),this.claseclienteParameterGeneral,this.claseclienteReturnGeneral);
			
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
			
			


			
			ClaseClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clasecliente,new Object(),this.claseclienteParameterGeneral,this.claseclienteReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaClaseClienteActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.clasecliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.clasecliente);
				
				ClaseClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clasecliente,new Object(),this.claseclienteParameterGeneral,this.claseclienteReturnGeneral);
								
						
				


				
				ClaseClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clasecliente,new Object(),this.claseclienteParameterGeneral,this.claseclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ClaseCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ClaseCliente.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.clasecliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.clasecliente);
				
				ClaseClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clasecliente,new Object(),this.claseclienteParameterGeneral,this.claseclienteReturnGeneral);
								
				
				


				
				ClaseClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clasecliente,new Object(),this.claseclienteParameterGeneral,this.claseclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ClaseCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ClaseCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaClaseClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosClaseCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.claseclienteAnterior =(ClaseCliente) this.claseclienteLogic.getClaseClientes().toArray()[this.jTableDatosClaseCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.claseclienteAnterior =(ClaseCliente) this.claseclientes.toArray()[this.jTableDatosClaseCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.clasecliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.clasecliente);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaClaseClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosClaseCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.claseclienteAnterior =(ClaseCliente) this.claseclienteLogic.getClaseClientes().toArray()[this.jTableDatosClaseCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.claseclienteAnterior =(ClaseCliente) this.claseclientes.toArray()[this.jTableDatosClaseCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaClaseClienteActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.clasecliente);
			
			this.actualizarInformacion("INFO_PADRE",false,this.clasecliente);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.clasecliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.clasecliente);
				
				ClaseClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clasecliente,new Object(),this.claseclienteParameterGeneral,this.claseclienteReturnGeneral);
							
				
				


				
				ClaseClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clasecliente,new Object(),this.claseclienteParameterGeneral,this.claseclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ClaseCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ClaseCliente.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaClaseClienteActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosClaseCliente.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.claseclienteAnterior =(ClaseCliente) this.claseclienteLogic.getClaseClientes().toArray()[this.jTableDatosClaseCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.claseclienteAnterior =(ClaseCliente) this.claseclientes.toArray()[this.jTableDatosClaseCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
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
			
			ClaseClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clasecliente,new Object(),this.claseclienteParameterGeneral,this.claseclienteReturnGeneral);
			
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
			
			


			
			ClaseClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clasecliente,new Object(),this.claseclienteParameterGeneral,this.claseclienteReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaClaseClienteActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.clasecliente);
			
			this.actualizarInformacion("INFO_PADRE",false,this.clasecliente);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.clasecliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.clasecliente);
				
				ClaseClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clasecliente,new Object(),this.claseclienteParameterGeneral,this.claseclienteReturnGeneral);
								
				
				


				
				ClaseClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clasecliente,new Object(),this.claseclienteParameterGeneral,this.claseclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ClaseCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ClaseCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaClaseClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosClaseCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.claseclienteAnterior =(ClaseCliente) this.claseclienteLogic.getClaseClientes().toArray()[this.jTableDatosClaseCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.claseclienteAnterior =(ClaseCliente) this.claseclientes.toArray()[this.jTableDatosClaseCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaClaseClienteActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.clasecliente);
			
			this.actualizarInformacion("INFO_PADRE",false,this.clasecliente);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaClaseClienteActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.clasecliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.clasecliente);
				
				ClaseClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.clasecliente,new Object(),this.claseclienteParameterGeneral,this.claseclienteReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosClaseCliente")) {
					jCheckBoxSeleccionarTodosClaseClienteItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosClaseCliente")) {
					jCheckBoxSeleccionadosClaseClienteItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarClaseCliente")) {
					
				}
				
				


				
				
				ClaseClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.clasecliente,new Object(),this.claseclienteParameterGeneral,this.claseclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ClaseCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ClaseCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.clasecliente);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.clasecliente);
				
				ClaseClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.clasecliente,new Object(),this.claseclienteParameterGeneral,this.claseclienteReturnGeneral);
												
				
				


				
				
				ClaseClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.clasecliente,new Object(),this.claseclienteParameterGeneral,this.claseclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ClaseCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ClaseCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaClaseClienteActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosClaseCliente.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.claseclienteAnterior =(ClaseCliente) this.claseclienteLogic.getClaseClientes().toArray()[this.jTableDatosClaseCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.claseclienteAnterior =(ClaseCliente) this.claseclientes.toArray()[this.jTableDatosClaseCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaClaseClienteActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.clasecliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.clasecliente);
				
				ClaseClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.clasecliente,new Object(),this.claseclienteParameterGeneral,this.claseclienteReturnGeneral);
				
				
				ClaseClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.clasecliente,new Object(),this.claseclienteParameterGeneral,this.claseclienteReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
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
			
			ClaseClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.clasecliente,new Object(),this.claseclienteParameterGeneral,this.claseclienteReturnGeneral);
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
			
			


			
			ClaseClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clasecliente,new Object(),this.claseclienteParameterGeneral,this.claseclienteReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaClaseClienteActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.clasecliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.clasecliente);
				
				ClaseClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.clasecliente,new Object(),this.claseclienteParameterGeneral,this.claseclienteReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ClaseClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clasecliente,new Object(),this.claseclienteParameterGeneral,this.claseclienteReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ClaseCliente.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ClaseCliente.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.clasecliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.clasecliente);
				
				ClaseClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.clasecliente,new Object(),this.claseclienteParameterGeneral,this.claseclienteReturnGeneral);
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
				
				


				
				ClaseClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clasecliente,new Object(),this.claseclienteParameterGeneral,this.claseclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ClaseCliente.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ClaseCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaClaseClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosClaseCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.claseclienteAnterior =(ClaseCliente) this.claseclienteLogic.getClaseClientes().toArray()[this.jTableDatosClaseCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.claseclienteAnterior =(ClaseCliente) this.claseclientes.toArray()[this.jTableDatosClaseCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ClaseClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clasecliente,new Object(),this.claseclienteParameterGeneral,this.claseclienteReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarClaseCliente")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosClaseClienteListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosClaseCliente.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.clasecliente =(ClaseCliente) this.claseclienteLogic.getClaseClientes().toArray()[this.jTableDatosClaseCliente.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.clasecliente =(ClaseCliente) this.claseclientes.toArray()[this.jTableDatosClaseCliente.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.clasecliente);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarClaseCliente")) {
				
				}
				
				ClaseClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.clasecliente,new Object(),this.claseclienteParameterGeneral,this.claseclienteReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ClaseClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.clasecliente,new Object(),this.claseclienteParameterGeneral,this.claseclienteReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarClaseCliente")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosClaseCliente.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarClaseCliente")) {
			
			}
			
			ClaseClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.clasecliente,new Object(),this.claseclienteParameterGeneral,this.claseclienteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessClaseCliente();
			
			ClaseClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.clasecliente,new Object(),this.claseclienteParameterGeneral,this.claseclienteReturnGeneral);
			
			if(sTipo.equals("NuevoClaseCliente")) {
				jButtonNuevoClaseClienteActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarClaseCliente")) {
				jButtonDuplicarClaseClienteActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarClaseCliente")) {
				jButtonCopiarClaseClienteActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormClaseCliente")) {
				jButtonVerFormClaseClienteActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesClaseCliente")) {
				jButtonNuevoClaseClienteActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarClaseCliente")) {
				jButtonModificarClaseClienteActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarClaseCliente")) {
				jButtonActualizarClaseClienteActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarClaseCliente")) {
				jButtonEliminarClaseClienteActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaClaseCliente")) {
				jButtonGuardarCambiosClaseClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarClaseCliente")) {
				jButtonCancelarClaseClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarClaseCliente")) {
				jButtonCerrarClaseClienteActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosClaseCliente")) {
				jButtonGuardarCambiosClaseClienteActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosClaseCliente")) {
				jButtonNuevoGuardarCambiosClaseClienteActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByClaseCliente")) {
				jButtonAbrirOrderByClaseClienteActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionClaseCliente")) {
				jButtonRecargarInformacionClaseClienteActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresClaseCliente")) {
				jButtonAnterioresClaseClienteActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesClaseCliente")) {
				jButtonSiguientesClaseClienteActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idClaseClienteBusqueda")) {
				this.jButtonidClaseClienteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaClaseClienteUpdate")) {
				this.jButtonid_empresaClaseClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaClaseClienteBusqueda")) {
				this.jButtonid_empresaClaseClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoClaseClienteBusqueda")) {
				this.jButtoncodigoClaseClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreClaseClienteBusqueda")) {
				this.jButtonnombreClaseClienteBusquedaActionPerformed(evt);
			}
			
			ClaseClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.clasecliente,new Object(),this.claseclienteParameterGeneral,this.claseclienteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessClaseCliente();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ClaseClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.clasecliente,new Object(),this.claseclienteParameterGeneral,this.claseclienteReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameClaseCliente")) {
				closingInternalFrameClaseCliente();
				
			} else if(sTipo.equals("jButtonCancelarClaseCliente")) {
				JInternalFrameBase jInternalFrameDetalleFormClaseCliente = (JInternalFrameBase)evt.getSource();
	            	
	            ClaseClienteBeanSwingJInternalFrame jInternalFrameParent=(ClaseClienteBeanSwingJInternalFrame)jInternalFrameDetalleFormClaseCliente.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarClaseClienteActionPerformed(null);
			}
			
			ClaseClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.clasecliente,new Object(),this.claseclienteParameterGeneral,this.claseclienteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormClaseCliente(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormClaseCliente(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormClaseCliente(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.clasecliente)) {
			if(!esControlTabla) {
				if(ClaseClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualClaseCliente(this.clasecliente,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysClaseCliente(this.clasecliente);			
				}
				
				if(this.claseclienteSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualClaseCliente(this.clasecliente,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.claseclienteReturnGeneral=claseclienteLogic.procesarEventosClaseClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.claseclienteLogic.getClaseClientes(),this.clasecliente,this.claseclienteParameterGeneral,this.isEsNuevoClaseCliente,classes);//this.claseclienteLogic.getClaseCliente()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanClaseCliente(this.claseclienteReturnGeneral,this.claseclienteBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.claseclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanClaseCliente(classes,this.claseclienteReturnGeneral,this.claseclienteBean,false);
					}
						
					if(this.claseclienteReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyClaseCliente(this.claseclienteReturnGeneral.getClaseCliente());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioClaseCliente(this.claseclienteReturnGeneral.getClaseCliente());	
					}
						
					if(this.claseclienteReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioClaseCliente(this.claseclienteReturnGeneral.getClaseCliente(),classes);//this.claseclienteBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioClaseCliente(this.clasecliente,classes);//this.claseclienteBean);									
				}
			
				if(ClaseClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualClaseCliente(this.clasecliente,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysClaseCliente(this.clasecliente);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.claseclienteAnterior!=null) {
						this.clasecliente=this.claseclienteAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.claseclienteReturnGeneral=claseclienteLogic.procesarEventosClaseClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.claseclienteLogic.getClaseClientes(),this.clasecliente,this.claseclienteParameterGeneral,this.isEsNuevoClaseCliente,classes);//this.claseclienteLogic.getClaseCliente()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.claseclienteSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.claseclienteSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.claseclienteReturnGeneral.getClaseCliente(),claseclienteLogic.getClaseClientes());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.claseclienteReturnGeneral.getClaseCliente(),this.claseclientes);
				}
				//ARCHITECTURE
				
				//this.jTableDatosClaseCliente.repaint();
				
				//((AbstractTableModel) this.jTableDatosClaseCliente.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosClaseCliente();
			}
		}
	}
	
	public void actualizarVisualTableDatosClaseCliente() throws Exception {
		
		ClaseClienteModel claseclienteModel=(ClaseClienteModel)this.jTableDatosClaseCliente.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			claseclienteModel.claseclientes=this.claseclienteLogic.getClaseClientes();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			claseclienteModel.claseclientes=this.claseclientes;
		}
		
		
		((ClaseClienteModel) this.jTableDatosClaseCliente.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaClaseCliente() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getclaseclienteAnterior(),this.claseclienteLogic.getClaseClientes());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getclaseclienteAnterior(),this.claseclientes);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosClaseCliente();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioClaseCliente(ClaseCliente clasecliente,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
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
										
				ClaseClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.clasecliente,new Object(),generalEntityParameterGeneral,this.claseclienteReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.claseclienteSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ClaseClienteConstantesFunciones.getClassesRelationshipsOfClaseCliente(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ClaseClienteConstantesFunciones.getClassesRelationshipsFromStringsOfClaseCliente(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormClaseCliente(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ClaseClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.clasecliente,new Object(),generalEntityParameterGeneral,this.claseclienteReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioClaseCliente(ClaseClienteBean claseclienteBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanClaseCliente(ArrayList<Classe> classes,ClaseClienteReturnGeneral claseclienteReturnGeneral,ClaseClienteBean claseclienteBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualClaseCliente(ClaseCliente clasecliente,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.clasecliente)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormClaseCliente = new ClaseClienteDetalleFormJInternalFrame(jDesktopPane,this.claseclienteSessionBean.getConGuardarRelaciones(),this.claseclienteSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormClaseCliente);
		this.jInternalFrameDetalleFormClaseCliente.setVisible(false);
		this.jInternalFrameDetalleFormClaseCliente.setSelected(false);						
		
		this.jInternalFrameDetalleFormClaseCliente.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormClaseCliente.claseclienteLogic=this.claseclienteLogic;
		
		this.cargarCombosFrameForeignKeyClaseCliente("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleClaseCliente();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleClaseCliente();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyClaseCliente("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyClaseCliente();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormClaseCliente.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarClaseCliente"));
		
		this.jInternalFrameDetalleFormClaseCliente.jButtonModificarClaseCliente.addActionListener(new ButtonActionListener(this,"ModificarClaseCliente"));

		
		this.jInternalFrameDetalleFormClaseCliente.jButtonModificarToolBarClaseCliente.addActionListener(new ButtonActionListener(this,"ModificarToolBarClaseCliente"));
					
		this.jInternalFrameDetalleFormClaseCliente.jMenuItemModificarClaseCliente.addActionListener(new ButtonActionListener(this,"MenuItemModificarClaseCliente"));		
		
		
		
		this.jInternalFrameDetalleFormClaseCliente.jButtonActualizarClaseCliente.addActionListener (new ButtonActionListener(this,"ActualizarClaseCliente"));
		
		
		this.jInternalFrameDetalleFormClaseCliente.jButtonActualizarToolBarClaseCliente.addActionListener(new ButtonActionListener(this,"ActualizarToolBarClaseCliente"));
						
		this.jInternalFrameDetalleFormClaseCliente.jMenuItemActualizarClaseCliente.addActionListener (new ButtonActionListener(this,"MenuItemActualizarClaseCliente"));		
		
		
		
		this.jInternalFrameDetalleFormClaseCliente.jButtonEliminarClaseCliente.addActionListener (new ButtonActionListener(this,"EliminarClaseCliente"));
		
		
		this.jInternalFrameDetalleFormClaseCliente.jButtonEliminarToolBarClaseCliente.addActionListener (new ButtonActionListener(this,"EliminarToolBarClaseCliente"));
								
		this.jInternalFrameDetalleFormClaseCliente.jMenuItemEliminarClaseCliente.addActionListener (new ButtonActionListener(this,"MenuItemEliminarClaseCliente"));		
		
		
		
		this.jInternalFrameDetalleFormClaseCliente.jButtonCancelarClaseCliente.addActionListener (new ButtonActionListener(this,"CancelarClaseCliente"));
		
		
		this.jInternalFrameDetalleFormClaseCliente.jButtonCancelarToolBarClaseCliente.addActionListener (new ButtonActionListener(this,"CancelarToolBarClaseCliente"));
					
		this.jInternalFrameDetalleFormClaseCliente.jMenuItemCancelarClaseCliente.addActionListener (new ButtonActionListener(this,"MenuItemCancelarClaseCliente"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormClaseCliente.jMenuItemDetalleCerrarClaseCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarClaseCliente"));		
		
		
		
		this.jInternalFrameDetalleFormClaseCliente.jButtonGuardarCambiosToolBarClaseCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarClaseCliente"));
		
		
		
		this.jInternalFrameDetalleFormClaseCliente.jButtonGuardarCambiosToolBarClaseCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarClaseCliente"));
		
		
		
		this.jInternalFrameDetalleFormClaseCliente.jComboBoxTiposAccionesFormularioClaseCliente.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioClaseCliente"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClaseCliente.jButtonidClaseClienteBusqueda.addActionListener(new ButtonActionListener(this,"idClaseClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormClaseCliente.jButtonid_empresaClaseClienteUpdate.addActionListener(new ButtonActionListener(this,"id_empresaClaseClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClaseCliente.jButtonid_empresaClaseClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaClaseClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClaseCliente.jButtoncodigoClaseClienteBusqueda.addActionListener(new ButtonActionListener(this,"codigoClaseClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClaseCliente.jButtonnombreClaseClienteBusqueda.addActionListener(new ButtonActionListener(this,"nombreClaseClienteBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormClaseCliente.jTabbedPaneRelacionesClaseCliente.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesClaseCliente"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameClaseCliente"));
		
		if(this.jInternalFrameDetalleFormClaseCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormClaseCliente.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarClaseCliente"));
		}
		
		this.jTableDatosClaseCliente.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarClaseCliente"));
		
		this.jTableDatosClaseCliente.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarClaseCliente"));
		
		this.jButtonNuevoClaseCliente.addActionListener(new ButtonActionListener(this,"NuevoClaseCliente"));
		
		this.jButtonDuplicarClaseCliente.addActionListener(new ButtonActionListener(this,"DuplicarClaseCliente"));
		
		this.jButtonCopiarClaseCliente.addActionListener(new ButtonActionListener(this,"CopiarClaseCliente"));
		
		this.jButtonVerFormClaseCliente.addActionListener(new ButtonActionListener(this,"VerFormClaseCliente"));
		
		
		this.jButtonNuevoToolBarClaseCliente.addActionListener(new ButtonActionListener(this,"NuevoToolBarClaseCliente"));
			
		this.jButtonDuplicarToolBarClaseCliente.addActionListener(new ButtonActionListener(this,"DuplicarToolBarClaseCliente"));
			
		this.jMenuItemNuevoClaseCliente.addActionListener (new ButtonActionListener(this,"MenuItemNuevoClaseCliente"));
			
		this.jMenuItemDuplicarClaseCliente.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarClaseCliente"));		
		
		
		this.jButtonNuevoRelacionesClaseCliente.addActionListener (new ButtonActionListener(this,"NuevoRelacionesClaseCliente"));
		
		
		this.jButtonNuevoRelacionesToolBarClaseCliente.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarClaseCliente"));
			
		this.jMenuItemNuevoRelacionesClaseCliente.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesClaseCliente"));		
		
		
		if(this.jInternalFrameDetalleFormClaseCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormClaseCliente.jButtonModificarClaseCliente.addActionListener(new ButtonActionListener(this,"ModificarClaseCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormClaseCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormClaseCliente.jButtonModificarToolBarClaseCliente.addActionListener(new ButtonActionListener(this,"ModificarToolBarClaseCliente"));
			
			this.jInternalFrameDetalleFormClaseCliente.jMenuItemModificarClaseCliente.addActionListener(new ButtonActionListener(this,"MenuItemModificarClaseCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormClaseCliente!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormClaseCliente.jButtonActualizarClaseCliente.addActionListener (new ButtonActionListener(this,"ActualizarClaseCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormClaseCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormClaseCliente.jButtonActualizarToolBarClaseCliente.addActionListener(new ButtonActionListener(this,"ActualizarToolBarClaseCliente"));
				
			this.jInternalFrameDetalleFormClaseCliente.jMenuItemActualizarClaseCliente.addActionListener (new ButtonActionListener(this,"MenuItemActualizarClaseCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormClaseCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormClaseCliente.jButtonEliminarClaseCliente.addActionListener (new ButtonActionListener(this,"EliminarClaseCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormClaseCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormClaseCliente.jButtonEliminarToolBarClaseCliente.addActionListener (new ButtonActionListener(this,"EliminarToolBarClaseCliente"));
						
			this.jInternalFrameDetalleFormClaseCliente.jMenuItemEliminarClaseCliente.addActionListener (new ButtonActionListener(this,"MenuItemEliminarClaseCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormClaseCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormClaseCliente.jButtonCancelarClaseCliente.addActionListener (new ButtonActionListener(this,"CancelarClaseCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormClaseCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormClaseCliente.jButtonCancelarToolBarClaseCliente.addActionListener (new ButtonActionListener(this,"CancelarToolBarClaseCliente"));
			
			this.jInternalFrameDetalleFormClaseCliente.jMenuItemCancelarClaseCliente.addActionListener (new ButtonActionListener(this,"MenuItemCancelarClaseCliente"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarClaseCliente.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarClaseCliente"));		
		
		
		this.jButtonCerrarClaseCliente.addActionListener (new ButtonActionListener(this,"CerrarClaseCliente"));
		
		
		this.jButtonCerrarToolBarClaseCliente.addActionListener (new ButtonActionListener(this,"CerrarToolBarClaseCliente"));
			
		this.jMenuItemCerrarClaseCliente.addActionListener (new ButtonActionListener(this,"MenuItemCerrarClaseCliente"));
			
		if(this.jInternalFrameDetalleFormClaseCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormClaseCliente.jMenuItemDetalleCerrarClaseCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarClaseCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormClaseCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormClaseCliente.jButtonGuardarCambiosClaseCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosClaseCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormClaseCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormClaseCliente.jButtonGuardarCambiosToolBarClaseCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarClaseCliente"));
		}
		
		this.jButtonCopiarToolBarClaseCliente.addActionListener (new ButtonActionListener(this,"CopiarToolBarClaseCliente"));
			
		this.jButtonVerFormToolBarClaseCliente.addActionListener (new ButtonActionListener(this,"VerFormToolBarClaseCliente"));
		
		this.jMenuItemGuardarCambiosClaseCliente.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosClaseCliente"));
			
		this.jMenuItemCopiarClaseCliente.addActionListener (new ButtonActionListener(this,"MenuItemCopiarClaseCliente"));		
		
		this.jMenuItemVerFormClaseCliente.addActionListener (new ButtonActionListener(this,"MenuItemVerFormClaseCliente"));		
		
		
		this.jButtonGuardarCambiosTablaClaseCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaClaseCliente"));
		
		
		this.jButtonGuardarCambiosTablaToolBarClaseCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarClaseCliente"));
			
		this.jMenuItemGuardarCambiosTablaClaseCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaClaseCliente"));		
		
		
		
		this.jButtonRecargarInformacionClaseCliente.addActionListener (new ButtonActionListener(this,"RecargarInformacionClaseCliente"));
					
		this.jButtonRecargarInformacionToolBarClaseCliente.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarClaseCliente"));
		
		this.jMenuItemRecargarInformacionClaseCliente.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionClaseCliente"));		
		
		
		
		this.jButtonAnterioresClaseCliente.addActionListener (new ButtonActionListener(this,"AnterioresClaseCliente"));
		
		
		this.jButtonAnterioresToolBarClaseCliente.addActionListener (new ButtonActionListener(this,"AnterioresToolBarClaseCliente"));
		
		this.jMenuItemAnterioresClaseCliente.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresClaseCliente"));		
		
		
		this.jButtonSiguientesClaseCliente.addActionListener (new ButtonActionListener(this,"SiguientesClaseCliente"));
		
		
		this.jButtonSiguientesToolBarClaseCliente.addActionListener (new ButtonActionListener(this,"SiguientesToolBarClaseCliente"));
			
		this.jMenuItemSiguientesClaseCliente.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesClaseCliente"));
			
		this.jMenuItemAbrirOrderByClaseCliente.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByClaseCliente"));
			
		this.jMenuItemMostrarOcultarClaseCliente.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarClaseCliente"));
			
		this.jMenuItemDetalleAbrirOrderByClaseCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByClaseCliente"));
			
		this.jMenuItemDetalleMostarOcultarClaseCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarClaseCliente"));		
		
		
		this.jButtonNuevoGuardarCambiosClaseCliente.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosClaseCliente"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarClaseCliente.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarClaseCliente"));
			
		this.jMenuItemNuevoGuardarCambiosClaseCliente.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosClaseCliente"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosClaseCliente.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosClaseCliente"));

		this.jCheckBoxSeleccionadosClaseCliente.addItemListener(new CheckBoxItemListener(this,"SeleccionadosClaseCliente"));
		
		if(this.jInternalFrameDetalleFormClaseCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormClaseCliente.jComboBoxTiposAccionesFormularioClaseCliente.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioClaseCliente"));
		}
		
		
		this.jComboBoxTiposRelacionesClaseCliente.addActionListener (new ButtonActionListener(this,"TiposRelacionesClaseCliente"));
			
		this.jComboBoxTiposAccionesClaseCliente.addActionListener (new ButtonActionListener(this,"TiposAccionesClaseCliente"));
					
		this.jComboBoxTiposSeleccionarClaseCliente.addActionListener (new ButtonActionListener(this,"TiposSeleccionarClaseCliente"));
			
		this.jTextFieldValorCampoGeneralClaseCliente.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralClaseCliente"));		
		
		
		if(this.jInternalFrameDetalleFormClaseCliente!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClaseCliente.jButtonidClaseClienteBusqueda.addActionListener(new ButtonActionListener(this,"idClaseClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormClaseCliente.jButtonid_empresaClaseClienteUpdate.addActionListener(new ButtonActionListener(this,"id_empresaClaseClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClaseCliente.jButtonid_empresaClaseClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaClaseClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClaseCliente.jButtoncodigoClaseClienteBusqueda.addActionListener(new ButtonActionListener(this,"codigoClaseClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClaseCliente.jButtonnombreClaseClienteBusqueda.addActionListener(new ButtonActionListener(this,"nombreClaseClienteBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorCodigoClaseCliente.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoClaseCliente"));

			this.jButtonBusquedaPorNombreClaseCliente.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreClaseCliente"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoClaseCliente!=null) {
				this.jInternalFrameReporteDinamicoClaseCliente.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoClaseCliente"));
				this.jInternalFrameReporteDinamicoClaseCliente.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoClaseCliente"));
				this.jInternalFrameReporteDinamicoClaseCliente.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoClaseCliente"));
			}
			
			//this.jButtonCerrarReporteDinamicoClaseCliente.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoClaseCliente"));				
			//this.jButtonGenerarReporteDinamicoClaseCliente.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoClaseCliente"));
			//this.jButtonGenerarExcelReporteDinamicoClaseCliente.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoClaseCliente"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionClaseCliente!=null) {
				this.jInternalFrameImportacionClaseCliente.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionClaseCliente"));
				this.jInternalFrameImportacionClaseCliente.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionClaseCliente"));
				this.jInternalFrameImportacionClaseCliente.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionClaseCliente"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByClaseCliente.addActionListener (new ButtonActionListener(this,"AbrirOrderByClaseCliente"));
			
			this.jButtonAbrirOrderByToolBarClaseCliente.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarClaseCliente"));			
			
			if(this.jInternalFrameOrderByClaseCliente!=null) {
				this.jInternalFrameOrderByClaseCliente.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByClaseCliente"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormClaseCliente!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormClaseCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormClaseCliente.jTabbedPaneRelacionesClaseCliente.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesClaseCliente"));
		
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
            		closingInternalFrameClaseCliente();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormClaseCliente.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormClaseCliente = (JInternalFrameBase)event.getSource();
	            	
	            ClaseClienteBeanSwingJInternalFrame jInternalFrameParent=(ClaseClienteBeanSwingJInternalFrame)jInternalFrameDetalleFormClaseCliente.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarClaseClienteActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosClaseCliente.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosClaseClienteListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosClaseCliente.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosClaseCliente.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoClaseCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoClaseClienteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarClaseCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoClaseClienteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoClaseCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoClaseClienteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoClaseCliente";
		inputMap = this.jButtonNuevoClaseCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoClaseCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoClaseClienteActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesClaseCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoClaseClienteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarClaseCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoClaseClienteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesClaseCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoClaseClienteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesClaseCliente";
		inputMap = this.jButtonNuevoRelacionesClaseCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesClaseCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoClaseClienteActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarClaseCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarClaseClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarClaseCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarClaseClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarClaseCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarClaseClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarClaseCliente";
		inputMap = this.jButtonModificarClaseCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarClaseCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarClaseClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarClaseCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarClaseClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarClaseCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarClaseClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarClaseCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarClaseClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarClaseCliente";
		inputMap = this.jButtonActualizarClaseCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarClaseCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarClaseClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarClaseCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarClaseClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarClaseCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarClaseClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarClaseCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarClaseClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarClaseCliente";
		inputMap = this.jButtonEliminarClaseCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarClaseCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarClaseClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarClaseCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarClaseClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarClaseCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarClaseClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarClaseCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarClaseClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarClaseCliente";
		inputMap = this.jButtonCancelarClaseCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarClaseCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarClaseClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarClaseCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarClaseClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarClaseCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarClaseClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarClaseCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarClaseClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarClaseCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarClaseClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarClaseClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarClaseCliente";
		inputMap = this.jButtonCerrarClaseCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarClaseCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarClaseClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormClaseCliente.jButtonGuardarCambiosClaseCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosClaseClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarClaseCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosClaseClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosClaseCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosClaseClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaClaseCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosClaseClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarClaseCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosClaseClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaClaseCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosClaseClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosClaseCliente";
		inputMap = this.jInternalFrameDetalleFormClaseCliente.jButtonGuardarCambiosClaseCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormClaseCliente.jButtonGuardarCambiosClaseCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosClaseClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionClaseCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionClaseClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarClaseCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionClaseClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionClaseCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionClaseClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresClaseCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresClaseClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarClaseCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresClaseClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresClaseCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresClaseClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesClaseCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesClaseClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarClaseCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesClaseClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesClaseCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesClaseClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosClaseCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosClaseClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarClaseCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosClaseClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosClaseCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosClaseClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosClaseCliente.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosClaseClienteItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesClaseCliente.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesClaseClienteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarClaseCliente.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarClaseClienteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralClaseCliente.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralClaseClienteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClaseCliente.jButtonidClaseClienteBusqueda.addActionListener(new ButtonActionListener(this,"idClaseClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormClaseCliente.jButtonid_empresaClaseClienteUpdate.addActionListener(new ButtonActionListener(this,"id_empresaClaseClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClaseCliente.jButtonid_empresaClaseClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaClaseClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClaseCliente.jButtoncodigoClaseClienteBusqueda.addActionListener(new ButtonActionListener(this,"codigoClaseClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormClaseCliente.jButtonnombreClaseClienteBusqueda.addActionListener(new ButtonActionListener(this,"nombreClaseClienteBusqueda"));
		
		
		this.jButtonBusquedaPorCodigoClaseCliente.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoClaseCliente"));

		this.jButtonBusquedaPorNombreClaseCliente.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreClaseCliente"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoClaseCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoClaseClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoClaseCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoClaseClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoClaseCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoClaseClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionClaseCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionClaseClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionClaseCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionClaseClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionClaseCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionClaseClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarClaseClienteActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarClaseCliente.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosClaseCliente(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ClaseCliente claseclienteAux:this.claseclienteLogic.getClaseClientes()) {
					claseclienteAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ClaseCliente claseclienteAux:claseclientes) {
					claseclienteAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosClaseClienteItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingClaseCliente(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ClaseCliente claseclienteAux:this.claseclienteLogic.getClaseClientes()) {
						claseclienteAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ClaseCliente claseclienteAux:claseclientes) {
						claseclienteAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ClaseCliente claseclienteAux:this.claseclienteLogic.getClaseClientes()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ClaseCliente claseclienteAux:claseclientes) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaClaseCliente(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosClaseCliente.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosClaseCliente.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosClaseCliente,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosClaseClienteItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingClaseCliente(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosClaseCliente.getSelectedRows();
			
			ClaseCliente claseclienteLocal=new ClaseCliente();
			
			//this.seleccionarTodosClaseCliente(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					claseclienteLocal =(ClaseCliente) this.claseclienteLogic.getClaseClientes().toArray()[this.jTableDatosClaseCliente.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					claseclienteLocal =(ClaseCliente) this.claseclientes.toArray()[this.jTableDatosClaseCliente.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				claseclienteLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ClaseCliente claseclienteAux:this.claseclienteLogic.getClaseClientes()) {
						claseclienteAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ClaseCliente claseclienteAux:claseclientes) {
						claseclienteAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaClaseCliente(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosClaseCliente.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosClaseCliente.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosClaseCliente,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualClaseClienteItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarClaseClienteParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralClaseClienteActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingClaseCliente(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralClaseCliente.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ClaseCliente claseclienteAux:this.claseclienteLogic.getClaseClientes()) {
				
						if(sTipoSeleccionar.equals(ClaseClienteConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							claseclienteAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ClaseClienteConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							claseclienteAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ClaseCliente claseclienteAux:claseclientes) {
					
						if(sTipoSeleccionar.equals(ClaseClienteConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							claseclienteAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ClaseClienteConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							claseclienteAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaClaseCliente(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesClaseClienteActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingClaseCliente(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioClaseCliente=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesClaseCliente.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormClaseCliente.jComboBoxTiposAccionesFormularioClaseCliente.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteClaseCliente) {				
					conSplash=true;//false;										
					
					//this.startProcessClaseCliente(conSplash);
				
					this.generarReporteClaseClientesSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesClaseCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormClaseCliente.jComboBoxTiposAccionesFormularioClaseCliente.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoClaseClientesSeleccionados();
				//this.jComboBoxTiposAccionesClaseCliente.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoClaseClientesSeleccionados(false);
				//this.jComboBoxTiposAccionesClaseCliente.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoClaseClientesSeleccionados(true);
				//this.jComboBoxTiposAccionesClaseCliente.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessClaseCliente();
				
				this.exportarClaseClientesSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesClaseCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormClaseCliente.jComboBoxTiposAccionesFormularioClaseCliente.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionClaseClientes();
				//this.importarClaseClientes();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesClaseCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormClaseCliente.jComboBoxTiposAccionesFormularioClaseCliente.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessClaseCliente();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelClaseClientesSeleccionados();
				//this.jComboBoxTiposAccionesClaseCliente.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Clase Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessClaseCliente();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoClaseCliente)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyClaseCliente(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Clase Cliente",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesClaseCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormClaseCliente.jComboBoxTiposAccionesFormularioClaseCliente.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralClaseCliente();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessClaseCliente(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesClaseClienteActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessClaseCliente();
			
			if(this.jInternalFrameDetalleFormClaseCliente==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ClaseCliente> claseclientesSeleccionados=new ArrayList<ClaseCliente>();		
			ClaseCliente clasecliente=new ClaseCliente();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingClaseCliente(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesClaseCliente.getSelectedItem();
			
			
			
			
			claseclientesSeleccionados=this.getClaseClientesSeleccionados(true);
			//this.sTipoAccion;
			
			if(claseclientesSeleccionados.size()==1) {
				for(ClaseCliente claseclienteAux:claseclientesSeleccionados) {
					clasecliente=claseclienteAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessClaseCliente();
			
      		//this.finishProcessClaseCliente(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarClaseClienteReturnGeneral() throws Exception {
		if(this.claseclienteReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.claseclienteReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.claseclienteReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.claseclienteReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.claseclienteReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.claseclienteReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingClaseCliente(false);
		}
		
		if(this.claseclienteReturnGeneral.getConRetornoLista() || this.claseclienteReturnGeneral.getConRetornoObjeto()) {
			if(this.claseclienteReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.claseclienteLogic.setClaseClientes(this.claseclienteReturnGeneral.getClaseClientes());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.claseclienteReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.claseclienteLogic.setClaseCliente(this.claseclienteReturnGeneral.getClaseCliente());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingClaseCliente(false);
		}
	}
	
	public void actualizarParametrosGeneralClaseCliente() throws Exception {
		
		
	}
	
	public ArrayList<ClaseCliente> getClaseClientesSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ClaseCliente> claseclientesSeleccionados=new ArrayList<ClaseCliente>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioClaseCliente) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ClaseCliente claseclienteAux:claseclienteLogic.getClaseClientes()) {
					if(claseclienteAux.getIsSelected()) {
						claseclientesSeleccionados.add(claseclienteAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ClaseCliente claseclienteAux:this.claseclientes) {
					if(claseclienteAux.getIsSelected()) {
						claseclientesSeleccionados.add(claseclienteAux);				
					}
				}
			}
			
			if(claseclientesSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						claseclientesSeleccionados.addAll(this.claseclienteLogic.getClaseClientes());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						claseclientesSeleccionados.addAll(this.claseclientes);				
					}
				}
			}
		} else {
			claseclientesSeleccionados.add(this.clasecliente);
		}
		
		return claseclientesSeleccionados;
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
	
	public void generarReporteClaseClientesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalClaseClientesSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoClaseClientesSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoClaseClientesSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoClaseClientesSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Clase Cliente",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesClaseClientesSeleccionados() throws Exception {
		ArrayList<ClaseCliente> claseclientesSeleccionados=new ArrayList<ClaseCliente>();		
		
		claseclientesSeleccionados=this.getClaseClientesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteClaseClientes("Todos",claseclientesSeleccionados);
		
	}	
	
	public void generarReporteNormalClaseClientesSeleccionados() throws Exception {
		ArrayList<ClaseCliente> claseclientesSeleccionados=new ArrayList<ClaseCliente>();		
		
		claseclientesSeleccionados=this.getClaseClientesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteClaseClientes("Todos",claseclientesSeleccionados);
	}		
	
	public void generarReporteProcesoAccionClaseClientesSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ClaseCliente> claseclientesSeleccionados=new ArrayList<ClaseCliente>();
		
		claseclientesSeleccionados=this.getClaseClientesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteClaseClientes("Todos",claseclientesSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoClaseClientesSeleccionados() throws Exception {
		ArrayList<ClaseCliente> claseclientesSeleccionados=new ArrayList<ClaseCliente>();		
		
		
		this.abrirInicializarFrameReporteDinamicoClaseCliente();
		
		
		claseclientesSeleccionados=this.getClaseClientesSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoClaseCliente();
		
		
		//this.generarReporteClaseClientes("Todos",claseclientesSeleccionados ,claseclienteImplementable,claseclienteImplementableHome);
	}
	
	public void mostrarImportacionClaseClientes() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionClaseCliente();
		
		this.abrirFrameImportacionClaseCliente();		
		
			
		//this.generarReporteClaseClientes("Todos",claseclientesSeleccionados ,claseclienteImplementable,claseclienteImplementableHome);
	}
	
	public void importarClaseClientes() throws Exception {		
	
	}
	
	public void exportarClaseClientesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelClaseClientesSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoClaseClientesSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlClaseClientesSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Clase Cliente",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoClaseClientesSeleccionados() throws Exception {
		ArrayList<ClaseCliente> claseclientesSeleccionados=new ArrayList<ClaseCliente>();		
		
		claseclientesSeleccionados=this.getClaseClientesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"clasecliente."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarClaseCliente(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ClaseCliente claseclienteAux:claseclientesSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarClaseCliente(claseclienteAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//claseclienteAux.setsDetalleGeneralEntityReporte(claseclienteAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.claseclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Clase Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarClaseCliente(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ClaseClienteConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ClaseClienteConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ClaseClienteConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ClaseClienteConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ClaseClienteConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarClaseCliente(ClaseCliente clasecliente,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=clasecliente.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=clasecliente.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=clasecliente.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=clasecliente.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=clasecliente.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelClaseClientesSeleccionados() throws Exception {
		ArrayList<ClaseCliente> claseclientesSeleccionados=new ArrayList<ClaseCliente>();		
		
		claseclientesSeleccionados=this.getClaseClientesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"clasecliente.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ClaseClientes");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelClaseCliente(row);				
				iRow++;
			}				
			
			for(ClaseCliente claseclienteAux:claseclientesSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelClaseCliente(claseclienteAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.claseclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Clase Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlClaseClientesSeleccionados() throws Exception {
		ArrayList<ClaseCliente> claseclientesSeleccionados=new ArrayList<ClaseCliente>();		
		
		claseclientesSeleccionados=this.getClaseClientesSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"clasecliente.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("claseclientes");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("clasecliente");
			//elementRoot.appendChild(element);
		
			for(ClaseCliente claseclienteAux:claseclientesSeleccionados) {
				element = document.createElement("clasecliente");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlClaseCliente(claseclienteAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.claseclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Clase Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelClaseCliente(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ClaseClienteConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ClaseClienteConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ClaseClienteConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ClaseClienteConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(ClaseClienteConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelClaseCliente(ClaseCliente clasecliente,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(clasecliente.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(clasecliente.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(clasecliente.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(clasecliente.getnombre());				
	}
	
	public void setFilaDatosExportarXmlClaseCliente(ClaseCliente clasecliente,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ClaseClienteConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(clasecliente.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ClaseClienteConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(clasecliente.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ClaseClienteConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(clasecliente.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo = document.createElement(ClaseClienteConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(clasecliente.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(ClaseClienteConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(clasecliente.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoClaseClientesSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ClaseCliente> claseclientesSeleccionados=new ArrayList<ClaseCliente>();
		
		claseclientesSeleccionados=this.getClaseClientesSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoClaseCliente(claseclientesSeleccionados);
		
		this.generarReporteClaseClientes("Todos",claseclientesSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoClaseCliente(ArrayList<ClaseCliente> claseclientesSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ClaseCliente claseclienteAux:claseclientesSeleccionados) {
				claseclienteAux.setsDetalleGeneralEntityReporte(claseclienteAux.toString());
			
				if(sTipoSeleccionar.equals(ClaseClienteConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					claseclienteAux.setsDescripcionGeneralEntityReporte1(claseclienteAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ClaseClienteConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					claseclienteAux.setsDescripcionGeneralEntityReporte1(claseclienteAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(ClaseClienteConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					claseclienteAux.setsDescripcionGeneralEntityReporte1(claseclienteAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ClaseClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesClaseCliente(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoClaseCliente=true;
				this.isVisibilidadCeldaNuevoRelacionesClaseCliente=true;
				this.isVisibilidadCeldaGuardarCambiosClaseCliente=true;
			}
			
			this.isVisibilidadCeldaModificarClaseCliente=false;
			this.isVisibilidadCeldaActualizarClaseCliente=false;
			this.isVisibilidadCeldaEliminarClaseCliente=false;
			this.isVisibilidadCeldaCancelarClaseCliente=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarClaseCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarClaseCliente=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoClaseCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesClaseCliente=false;
			this.isVisibilidadCeldaGuardarCambiosClaseCliente=false;
			this.isVisibilidadCeldaModificarClaseCliente=false;
			this.isVisibilidadCeldaActualizarClaseCliente=true;
			this.isVisibilidadCeldaEliminarClaseCliente=false;
			this.isVisibilidadCeldaCancelarClaseCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarClaseCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarClaseCliente=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoClaseCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesClaseCliente=false;
			this.isVisibilidadCeldaGuardarCambiosClaseCliente=false;
			this.isVisibilidadCeldaModificarClaseCliente=false;
			this.isVisibilidadCeldaActualizarClaseCliente=true;
			this.isVisibilidadCeldaEliminarClaseCliente=true;
			this.isVisibilidadCeldaCancelarClaseCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarClaseCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarClaseCliente=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoClaseCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesClaseCliente=false;
			this.isVisibilidadCeldaGuardarCambiosClaseCliente=false;
			this.isVisibilidadCeldaModificarClaseCliente=false;
			this.isVisibilidadCeldaActualizarClaseCliente=true;
			this.isVisibilidadCeldaEliminarClaseCliente=false;
			this.isVisibilidadCeldaCancelarClaseCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarClaseCliente=false;
				} else {
					this.isVisibilidadCeldaGuardarClaseCliente=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoClaseCliente=true;
			this.isVisibilidadCeldaNuevoRelacionesClaseCliente=true;
			this.isVisibilidadCeldaGuardarCambiosClaseCliente=true;
			this.isVisibilidadCeldaModificarClaseCliente=false;
			this.isVisibilidadCeldaActualizarClaseCliente=false;
			this.isVisibilidadCeldaEliminarClaseCliente=false;
			this.isVisibilidadCeldaCancelarClaseCliente=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarClaseCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarClaseCliente=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoClaseCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesClaseCliente=false;
			this.isVisibilidadCeldaGuardarCambiosClaseCliente=false;
			this.isVisibilidadCeldaActualizarClaseCliente=false;
			this.isVisibilidadCeldaEliminarClaseCliente=false;
			this.isVisibilidadCeldaCancelarClaseCliente=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarClaseCliente=false;
				} else {
					this.isVisibilidadCeldaGuardarClaseCliente=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoClaseCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesClaseCliente=false;
			this.isVisibilidadCeldaGuardarCambiosClaseCliente=false;
			this.isVisibilidadCeldaModificarClaseCliente=true;
			this.isVisibilidadCeldaActualizarClaseCliente=false;
			this.isVisibilidadCeldaEliminarClaseCliente=false;
			this.isVisibilidadCeldaCancelarClaseCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarClaseCliente=false;
				} else {
					this.isVisibilidadCeldaGuardarClaseCliente=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ClaseClienteJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoClaseCliente=true;
			this.isVisibilidadCeldaNuevoRelacionesClaseCliente=true;
			this.isVisibilidadCeldaGuardarCambiosClaseCliente=true;
		} else {
			this.actualizarEstadoPanelsClaseCliente(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarClaseCliente=false;
			//this.isVisibilidadCeldaVerFormClaseCliente=false;
			this.isVisibilidadCeldaDuplicarClaseCliente=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!claseclienteSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesClaseCliente=false;
		} else {
			this.isVisibilidadCeldaNuevoClaseCliente=false;
			this.isVisibilidadCeldaGuardarCambiosClaseCliente=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(claseclienteSessionBean.getEsGuardarRelacionado()) {
			if(!claseclienteSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesClaseCliente=false;												
			}
			
			this.jButtonCerrarClaseCliente.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesClaseCliente=false;
		}
		
		if(!this.permiteMantenimiento(this.clasecliente)) {
			this.isVisibilidadCeldaActualizarClaseCliente=false;
			this.isVisibilidadCeldaEliminarClaseCliente=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesClaseCliente() {
	}
	
	public void actualizarEstadoPanelsClaseCliente(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionClaseCliente!=null) {
				this.jScrollPanelDatosEdicionClaseCliente.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasClaseCliente!=null) {
				this.jTabbedPaneBusquedasClaseCliente.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosClaseCliente!=null) {
				this.jScrollPanelDatosClaseCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionClaseCliente!=null) {
				this.jPanelPaginacionClaseCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesClaseCliente!=null) {
				this.jPanelParametrosReportesClaseCliente.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionClaseCliente!=null) {
				this.jScrollPanelDatosEdicionClaseCliente.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasClaseCliente!=null) {
				this.jTabbedPaneBusquedasClaseCliente.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosClaseCliente!=null) {
				this.jScrollPanelDatosClaseCliente.setVisible(false);
			}
			
			if(this.jPanelPaginacionClaseCliente!=null) {
				this.jPanelPaginacionClaseCliente.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesClaseCliente!=null) {
				this.jPanelParametrosReportesClaseCliente.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionClaseCliente!=null) {
				this.jScrollPanelDatosEdicionClaseCliente.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasClaseCliente!=null) {
				this.jTabbedPaneBusquedasClaseCliente.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosClaseCliente!=null) {
				this.jScrollPanelDatosClaseCliente.setVisible(false);
			}
			
			if(this.jPanelPaginacionClaseCliente!=null) {
				this.jPanelPaginacionClaseCliente.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesClaseCliente!=null) {
				this.jPanelParametrosReportesClaseCliente.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionClaseCliente!=null) {
				this.jScrollPanelDatosEdicionClaseCliente.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasClaseCliente!=null) {
				this.jTabbedPaneBusquedasClaseCliente.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosClaseCliente!=null) {
				this.jScrollPanelDatosClaseCliente.setVisible(false);
			}
			
			if(this.jPanelPaginacionClaseCliente!=null) {
				this.jPanelPaginacionClaseCliente.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesClaseCliente!=null) {
				this.jPanelParametrosReportesClaseCliente.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionClaseCliente!=null) {
				this.jScrollPanelDatosEdicionClaseCliente.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasClaseCliente!=null) {
				this.jTabbedPaneBusquedasClaseCliente.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosClaseCliente!=null) {
				this.jScrollPanelDatosClaseCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionClaseCliente!=null) {
				this.jPanelPaginacionClaseCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesClaseCliente!=null) {
				this.jPanelParametrosReportesClaseCliente.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionClaseCliente!=null) {
				this.jScrollPanelDatosEdicionClaseCliente.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasClaseCliente!=null) {
				this.jTabbedPaneBusquedasClaseCliente.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosClaseCliente!=null) {
				this.jScrollPanelDatosClaseCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionClaseCliente!=null) {
				this.jPanelPaginacionClaseCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesClaseCliente!=null) {
				this.jPanelParametrosReportesClaseCliente.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionClaseCliente!=null) {
				this.jScrollPanelDatosEdicionClaseCliente.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasClaseCliente!=null) {
				this.jTabbedPaneBusquedasClaseCliente.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosClaseCliente!=null) {
				this.jScrollPanelDatosClaseCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionClaseCliente!=null) {
				this.jPanelPaginacionClaseCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesClaseCliente!=null) {
				this.jPanelParametrosReportesClaseCliente.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.claseclienteSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasClaseCliente!=null) {
					this.jTabbedPaneBusquedasClaseCliente.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesClaseCliente!=null) {
				this.jPanelParametrosReportesClaseCliente.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.claseclienteSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasClaseCliente!=null) {
				this.jTabbedPaneBusquedasClaseCliente.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesClaseCliente!=null) {
				this.jPanelParametrosReportesClaseCliente.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorCodigo=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasClaseCliente.remove(jPanelBusquedaPorCodigoClaseCliente);}

			this.isVisibilidadBusquedaPorNombre=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasClaseCliente.remove(jPanelBusquedaPorNombreClaseCliente);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ClaseClienteSessionBean claseclienteSessionBean=new ClaseClienteSessionBean();
		
		if(this.claseclienteSessionBean==null) {
			this.claseclienteSessionBean=new ClaseClienteSessionBean();
		}
		
		this.claseclienteSessionBean.setsUltimaBusquedaClaseCliente(this.getsAccionBusqueda());
		this.claseclienteSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.claseclienteSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
			claseclienteSessionBean.setcodigo(this.getcodigoBusquedaPorCodigo());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			claseclienteSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			claseclienteSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ClaseClienteSessionBean claseclienteSessionBean=new ClaseClienteSessionBean();
		
		if(this.claseclienteSessionBean==null) {
			this.claseclienteSessionBean=new ClaseClienteSessionBean();
		}
		
		if(this.claseclienteSessionBean.getsUltimaBusquedaClaseCliente()!=null&&!this.claseclienteSessionBean.getsUltimaBusquedaClaseCliente().equals("")) {
			this.setsAccionBusqueda(claseclienteSessionBean.getsUltimaBusquedaClaseCliente());
			this.setiNumeroPaginacion(claseclienteSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(claseclienteSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
				this.setcodigoBusquedaPorCodigo(claseclienteSessionBean.getcodigo());
				claseclienteSessionBean.setcodigo("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(claseclienteSessionBean.getnombre());
				claseclienteSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(claseclienteSessionBean.getid_empresa());
				claseclienteSessionBean.setid_empresa(-1L);
			}
		}
		
		this.claseclienteSessionBean.setsUltimaBusquedaClaseCliente("");
		this.claseclienteSessionBean.setiNumeroPaginacion(ClaseClienteConstantesFunciones.INUMEROPAGINACION);
		this.claseclienteSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaClaseCliente(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioClaseCliente() {
		this.updateBorderResaltarBusquedasFormularioClaseCliente();
		this.updateVisibilidadBusquedasFormularioClaseCliente();
		this.updateHabilitarBusquedasFormularioClaseCliente();
	}
	
	public void updateBorderResaltarBusquedasFormularioClaseCliente() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasClaseCliente.getComponents().length>0) {
	

		if(this.claseclienteConstantesFunciones.resaltarBusquedaPorCodigoClaseCliente!=null) {
			index= this.jTabbedPaneBusquedasClaseCliente.indexOfComponent(this.jPanelBusquedaPorCodigoClaseCliente);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasClaseCliente.getComponent(index);
				jPanel.setBorder(this.claseclienteConstantesFunciones.resaltarBusquedaPorCodigoClaseCliente);
			}
		}

		if(this.claseclienteConstantesFunciones.resaltarBusquedaPorNombreClaseCliente!=null) {
			index= this.jTabbedPaneBusquedasClaseCliente.indexOfComponent(this.jPanelBusquedaPorNombreClaseCliente);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasClaseCliente.getComponent(index);
				jPanel.setBorder(this.claseclienteConstantesFunciones.resaltarBusquedaPorNombreClaseCliente);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioClaseCliente() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasClaseCliente.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasClaseCliente.indexOfComponent(this.jPanelBusquedaPorCodigoClaseCliente);
			jPanel=(JPanel)this.jTabbedPaneBusquedasClaseCliente.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.claseclienteConstantesFunciones.mostrarBusquedaPorCodigoClaseCliente);
			if(!this.claseclienteConstantesFunciones.mostrarBusquedaPorCodigoClaseCliente && index>-1) {
				this.jTabbedPaneBusquedasClaseCliente.remove(index);
			}

			index= this.jTabbedPaneBusquedasClaseCliente.indexOfComponent(this.jPanelBusquedaPorNombreClaseCliente);
			jPanel=(JPanel)this.jTabbedPaneBusquedasClaseCliente.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.claseclienteConstantesFunciones.mostrarBusquedaPorNombreClaseCliente);
			if(!this.claseclienteConstantesFunciones.mostrarBusquedaPorNombreClaseCliente && index>-1) {
				this.jTabbedPaneBusquedasClaseCliente.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioClaseCliente() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasClaseCliente.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasClaseCliente.indexOfComponent(this.jPanelBusquedaPorCodigoClaseCliente);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasClaseCliente.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.claseclienteConstantesFunciones.activarBusquedaPorCodigoClaseCliente);
				this.jTabbedPaneBusquedasClaseCliente.setEnabledAt(index,this.claseclienteConstantesFunciones.activarBusquedaPorCodigoClaseCliente);
			}

			index= this.jTabbedPaneBusquedasClaseCliente.indexOfComponent(this.jPanelBusquedaPorNombreClaseCliente);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasClaseCliente.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.claseclienteConstantesFunciones.activarBusquedaPorNombreClaseCliente);
				this.jTabbedPaneBusquedasClaseCliente.setEnabledAt(index,this.claseclienteConstantesFunciones.activarBusquedaPorNombreClaseCliente);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaClaseCliente(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorCodigo")) {
			index= this.jTabbedPaneBusquedasClaseCliente.indexOfComponent(this.jPanelBusquedaPorCodigoClaseCliente);

			this.jTabbedPaneBusquedasClaseCliente.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasClaseCliente.getComponent(index);

			this.claseclienteConstantesFunciones.setResaltarBusquedaPorCodigoClaseCliente(resaltar);

			jPanel.setBorder(this.claseclienteConstantesFunciones.resaltarBusquedaPorCodigoClaseCliente);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasClaseCliente.indexOfComponent(this.jPanelBusquedaPorNombreClaseCliente);

			this.jTabbedPaneBusquedasClaseCliente.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasClaseCliente.getComponent(index);

			this.claseclienteConstantesFunciones.setResaltarBusquedaPorNombreClaseCliente(resaltar);

			jPanel.setBorder(this.claseclienteConstantesFunciones.resaltarBusquedaPorNombreClaseCliente);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarClaseCliente.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioClaseCliente() throws Exception {

		if(this.jInternalFrameDetalleFormClaseCliente==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioClaseCliente();
		this.updateVisibilidadResaltarControlesFormularioClaseCliente();
		this.updateHabilitarResaltarControlesFormularioClaseCliente();
		
	}
	
	public void updateBorderResaltarControlesFormularioClaseCliente() throws Exception {
		if(this.jInternalFrameDetalleFormClaseCliente==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.claseclienteConstantesFunciones.resaltaridClaseCliente!=null && this.jInternalFrameDetalleFormClaseCliente!=null) {this.jInternalFrameDetalleFormClaseCliente.jLabelidClaseCliente.setBorder(this.claseclienteConstantesFunciones.resaltaridClaseCliente);}
		if(this.claseclienteConstantesFunciones.resaltarid_empresaClaseCliente!=null && this.jInternalFrameDetalleFormClaseCliente!=null) {this.jInternalFrameDetalleFormClaseCliente.jComboBoxid_empresaClaseCliente.setBorder(this.claseclienteConstantesFunciones.resaltarid_empresaClaseCliente);}
		if(this.claseclienteConstantesFunciones.resaltarcodigoClaseCliente!=null && this.jInternalFrameDetalleFormClaseCliente!=null) {this.jInternalFrameDetalleFormClaseCliente.jTextFieldcodigoClaseCliente.setBorder(this.claseclienteConstantesFunciones.resaltarcodigoClaseCliente);}
		if(this.claseclienteConstantesFunciones.resaltarnombreClaseCliente!=null && this.jInternalFrameDetalleFormClaseCliente!=null) {this.jInternalFrameDetalleFormClaseCliente.jTextAreanombreClaseCliente.setBorder(this.claseclienteConstantesFunciones.resaltarnombreClaseCliente);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioClaseCliente() throws Exception {		
		if(this.jInternalFrameDetalleFormClaseCliente==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormClaseCliente!=null) {
	
		//this.jInternalFrameDetalleFormClaseCliente.jLabelidClaseCliente.setVisible(this.claseclienteConstantesFunciones.mostraridClaseCliente);
		this.jInternalFrameDetalleFormClaseCliente.jPanelidClaseCliente.setVisible(this.claseclienteConstantesFunciones.mostraridClaseCliente);
		//this.jInternalFrameDetalleFormClaseCliente.jComboBoxid_empresaClaseCliente.setVisible(this.claseclienteConstantesFunciones.mostrarid_empresaClaseCliente);
		this.jInternalFrameDetalleFormClaseCliente.jPanelid_empresaClaseCliente.setVisible(this.claseclienteConstantesFunciones.mostrarid_empresaClaseCliente);
		//this.jInternalFrameDetalleFormClaseCliente.jTextFieldcodigoClaseCliente.setVisible(this.claseclienteConstantesFunciones.mostrarcodigoClaseCliente);
		this.jInternalFrameDetalleFormClaseCliente.jPanelcodigoClaseCliente.setVisible(this.claseclienteConstantesFunciones.mostrarcodigoClaseCliente);
		//this.jInternalFrameDetalleFormClaseCliente.jTextAreanombreClaseCliente.setVisible(this.claseclienteConstantesFunciones.mostrarnombreClaseCliente);
		this.jInternalFrameDetalleFormClaseCliente.jPanelnombreClaseCliente.setVisible(this.claseclienteConstantesFunciones.mostrarnombreClaseCliente);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioClaseCliente() throws Exception {
		if(this.jInternalFrameDetalleFormClaseCliente==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormClaseCliente!=null) {
	
		this.jInternalFrameDetalleFormClaseCliente.jLabelidClaseCliente.setEnabled(this.claseclienteConstantesFunciones.activaridClaseCliente);
		this.jInternalFrameDetalleFormClaseCliente.jComboBoxid_empresaClaseCliente.setEnabled(this.claseclienteConstantesFunciones.activarid_empresaClaseCliente);
		this.jInternalFrameDetalleFormClaseCliente.jTextFieldcodigoClaseCliente.setEnabled(this.claseclienteConstantesFunciones.activarcodigoClaseCliente);
		this.jInternalFrameDetalleFormClaseCliente.jTextAreanombreClaseCliente.setEnabled(this.claseclienteConstantesFunciones.activarnombreClaseCliente);
		}
	}
	
		
}