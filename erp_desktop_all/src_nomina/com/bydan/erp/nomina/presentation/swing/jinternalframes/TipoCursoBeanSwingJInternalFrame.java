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

import com.bydan.erp.nomina.util.TipoCursoConstantesFunciones;
import com.bydan.erp.nomina.util.TipoCursoParameterReturnGeneral;
//import com.bydan.erp.nomina.util.TipoCursoParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.TipoCursoBean;
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
public class TipoCursoBeanSwingJInternalFrame extends TipoCursoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoCursoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoCurso> tipocursoValidator = new ClassValidator<TipoCurso>(TipoCurso.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoCurso tipocurso;	
	public TipoCurso tipocursoAux;
	public TipoCurso tipocursoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoCurso tipocursoTotales;
	public Long idTipoCursoActual;
	public Long iIdNuevoTipoCurso=0L;
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
	
	public Boolean isPermisoTodoTipoCurso;
	public Boolean isPermisoNuevoTipoCurso;
	public Boolean isPermisoActualizarTipoCurso;
	public Boolean isPermisoActualizarOriginalTipoCurso;
	public Boolean isPermisoEliminarTipoCurso;
	public Boolean isPermisoGuardarCambiosTipoCurso;
	public Boolean isPermisoConsultaTipoCurso;
	public Boolean isPermisoBusquedaTipoCurso;
	public Boolean isPermisoReporteTipoCurso;
	public Boolean isPermisoPaginacionMedioTipoCurso;
	public Boolean isPermisoPaginacionAltoTipoCurso;
	public Boolean isPermisoPaginacionTodoTipoCurso;
	public Boolean isPermisoCopiarTipoCurso;
	public Boolean isPermisoVerFormTipoCurso;
	public Boolean isPermisoDuplicarTipoCurso;
	public Boolean isPermisoOrdenTipoCurso;
	
	
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
	
	public TipoCursoParameterReturnGeneral tipocursoReturnGeneral;
	public TipoCursoParameterReturnGeneral tipocursoParameterGeneral;
	
	

	public CursoLogic cursoLogic=null;

	public CursoLogic getCursoLogic() {
		return cursoLogic;
	}

	public void setCursoLogic(CursoLogic cursoLogic) {
		this.cursoLogic = cursoLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoCurso=false;
	public Boolean esParaAccionDesdeFormularioTipoCurso=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoCursoLogic tipocursoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoCurso tipocursoBean;
	public TipoCursoConstantesFunciones tipocursoConstantesFunciones;
	//public TipoCursoParameterReturnGeneral tipocursoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<TipoCurso> tipocursos;	
	//public List<TipoCurso> tipocursosEliminados;
	//public List<TipoCurso> tipocursosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoCurso=false;
	public Boolean isVisibilidadCeldaDuplicarTipoCurso=true;
	public Boolean isVisibilidadCeldaCopiarTipoCurso=true;
	public Boolean isVisibilidadCeldaVerFormTipoCurso=true;
	public Boolean isVisibilidadCeldaOrdenTipoCurso=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoCurso=false;
	public Boolean isVisibilidadCeldaModificarTipoCurso=false;
	public Boolean isVisibilidadCeldaActualizarTipoCurso=false;
	public Boolean isVisibilidadCeldaEliminarTipoCurso=false;
	public Boolean isVisibilidadCeldaCancelarTipoCurso=false;
	public Boolean isVisibilidadCeldaGuardarTipoCurso=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoCurso=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoTipoCurso() {
		return this.iIdNuevoTipoCurso;
	}

	public void setiIdNuevoTipoCurso(Long iIdNuevoTipoCurso) {
		this.iIdNuevoTipoCurso = iIdNuevoTipoCurso;
	}
	
	public Long getidTipoCursoActual() {
		return this.idTipoCursoActual;
	}

	public void setidTipoCursoActual(Long idTipoCursoActual) {
		this.idTipoCursoActual = idTipoCursoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoCurso gettipocurso() {
		return this.tipocurso;
	}

	public void settipocurso(TipoCurso tipocurso) {
		this.tipocurso = tipocurso;
	}
	
	public TipoCurso gettipocursoAux() {
		return this.tipocursoAux;
	}

	public void settipocursoAux(TipoCurso tipocursoAux) {
		this.tipocursoAux = tipocursoAux;
	}				
	
	public TipoCurso gettipocursoAnterior() {
		return this.tipocursoAnterior;
	}

	public void settipocursoAnterior(TipoCurso tipocursoAnterior) {
		this.tipocursoAnterior = tipocursoAnterior;
	}	
	
	public TipoCurso gettipocursoTotales() {
		return this.tipocursoTotales;
	}

	public void settipocursoTotales(TipoCurso tipocursoTotales) {
		this.tipocursoTotales = tipocursoTotales;
	}	
	
	public TipoCurso gettipocursoBean() {
		return this.tipocursoBean;
	}

	public void settipocursoBean(TipoCurso tipocursoBean) {
		this.tipocursoBean = tipocursoBean;
	}	
	
	public TipoCursoParameterReturnGeneral gettipocursoReturnGeneral() {
		return this.tipocursoReturnGeneral;
	}

	public void settipocursoReturnGeneral(TipoCursoParameterReturnGeneral tipocursoReturnGeneral) {
		this.tipocursoReturnGeneral = tipocursoReturnGeneral;
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
	
	
	public TipoCursoLogic getTipoCursoLogic()	{		
		return tipocursoLogic;
	}

	public void setTipoCursoLogic(TipoCursoLogic tipocursoLogic) {
		this.tipocursoLogic = tipocursoLogic;
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
	
	public Boolean getIsEsNuevoTipoCurso() {
		return isEsNuevoTipoCurso;
	}

	public void setIsEsNuevoTipoCurso(Boolean isEsNuevoTipoCurso) {
		this.isEsNuevoTipoCurso = isEsNuevoTipoCurso;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoCurso() {
		return esParaAccionDesdeFormularioTipoCurso;
	}
	
	public void setEsParaAccionDesdeFormularioTipoCurso(Boolean esParaAccionDesdeFormularioTipoCurso) {
		this.esParaAccionDesdeFormularioTipoCurso = esParaAccionDesdeFormularioTipoCurso;
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

			if(this.tipocursoSessionBean==null) {
				this.tipocursoSessionBean=new TipoCursoSessionBean();
			}

			if(!this.tipocursoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tipocursoSessionBean.getlidEmpresaActual());
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

					if(this.tipocurso!=null) {
						this.tipocurso.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoCurso!=null) {
						this.jInternalFrameDetalleFormTipoCurso.jComboBoxid_empresaTipoCurso.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTipoCurso.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTipoCurso!=null) {
						if(this.jInternalFrameDetalleFormTipoCurso.jComboBoxid_empresaTipoCurso.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoCurso.jComboBoxid_empresaTipoCurso.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTipoCursoGenerico)throws Exception
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
				jComboBoxid_empresaTipoCursoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTipoCursoGenerico!=null && jComboBoxid_empresaTipoCursoGenerico.getItemCount()>0) {
					jComboBoxid_empresaTipoCursoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TipoCurso tipocurso,JComboBox jComboBoxid_empresaTipoCursoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTipoCursoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTipoCurso.jComboBoxid_empresaTipoCurso.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTipoCursoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tipocurso.setid_empresa(empresaAux.getId());
				tipocurso.setempresa_descripcion(TipoCursoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tipocurso.setEmpresa(empresaAux);			}
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

					if(!TipoCursoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoCurso!=null) { 
							this.jInternalFrameDetalleFormTipoCurso.jComboBoxid_empresaTipoCurso.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTipoCurso.jComboBoxid_empresaTipoCurso.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoCurso!=null) { 
					}

					if(!TipoCursoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTipoCurso!=null) {
							this.jInternalFrameDetalleFormTipoCurso.jComboBoxid_empresaTipoCurso.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoCurso!=null) {
							this.jInternalFrameDetalleFormTipoCurso.jComboBoxid_empresaTipoCurso.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesTipoCurso() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoCursoConstantesFunciones.refrescarForeignKeysDescripcionesTipoCurso(this.tipocursoLogic.getTipoCursos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoCursoConstantesFunciones.refrescarForeignKeysDescripcionesTipoCurso(this.tipocursos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipocursoLogic.setTipoCursos(this.tipocursos);
			tipocursoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoCursoParameterReturnGeneral getTipoCursoParameterGeneral() {
		return this.tipocursoParameterGeneral;
	}
	
	public void setTipoCursoParameterGeneral(TipoCursoParameterReturnGeneral tipocursoParameterGeneral) {
		this.tipocursoParameterGeneral = tipocursoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoCurso() {
		return isPermisoTodoTipoCurso;
	}

	public void setIsPermisoTodoTipoCurso(Boolean isPermisoTodoTipoCurso) {
		this.isPermisoTodoTipoCurso = isPermisoTodoTipoCurso;
	}

	public Boolean getIsPermisoNuevoTipoCurso() {
		return isPermisoNuevoTipoCurso;
	}

	public void setIsPermisoNuevoTipoCurso(Boolean isPermisoNuevoTipoCurso) {
		this.isPermisoNuevoTipoCurso = isPermisoNuevoTipoCurso;
	}

	public Boolean getIsPermisoActualizarTipoCurso() {
		return isPermisoActualizarTipoCurso;
	}

	public void setIsPermisoActualizarTipoCurso(Boolean isPermisoActualizarTipoCurso) {
		this.isPermisoActualizarTipoCurso = isPermisoActualizarTipoCurso;
	}

	public Boolean getIsPermisoEliminarTipoCurso() {
		return isPermisoEliminarTipoCurso;
	}

	public void setIsPermisoEliminarTipoCurso(Boolean isPermisoEliminarTipoCurso) {
		this.isPermisoEliminarTipoCurso = isPermisoEliminarTipoCurso;
	}

	public Boolean getIsPermisoGuardarCambiosTipoCurso() {
		return isPermisoGuardarCambiosTipoCurso;
	}

	public void setIsPermisoGuardarCambiosTipoCurso(Boolean isPermisoGuardarCambiosTipoCurso) {
		this.isPermisoGuardarCambiosTipoCurso = isPermisoGuardarCambiosTipoCurso;
	}
	
	public Boolean getIsPermisoConsultaTipoCurso() {
		return isPermisoConsultaTipoCurso;
	}

	public void setIsPermisoConsultaTipoCurso(Boolean isPermisoConsultaTipoCurso) {
		this.isPermisoConsultaTipoCurso = isPermisoConsultaTipoCurso;
	}

	public Boolean getIsPermisoBusquedaTipoCurso() {
		return isPermisoBusquedaTipoCurso;
	}

	public void setIsPermisoBusquedaTipoCurso(Boolean isPermisoBusquedaTipoCurso) {
		this.isPermisoBusquedaTipoCurso = isPermisoBusquedaTipoCurso;
	}

	public Boolean getIsPermisoReporteTipoCurso() {
		return isPermisoReporteTipoCurso;
	}

	public void setIsPermisoReporteTipoCurso(Boolean isPermisoReporteTipoCurso) {
		this.isPermisoReporteTipoCurso = isPermisoReporteTipoCurso;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoCurso() {
		return isPermisoPaginacionMedioTipoCurso;
	}

	public void setIsPermisoPaginacionMedioTipoCurso(Boolean isPermisoPaginacionMedioTipoCurso) {
		this.isPermisoPaginacionMedioTipoCurso = isPermisoPaginacionMedioTipoCurso;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoCurso() {
		return isPermisoPaginacionTodoTipoCurso;
	}

	public void setIsPermisoPaginacionTodoTipoCurso(Boolean isPermisoPaginacionTodoTipoCurso) {
		this.isPermisoPaginacionTodoTipoCurso = isPermisoPaginacionTodoTipoCurso;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoCurso() {
		return isPermisoPaginacionAltoTipoCurso;
	}

	public void setIsPermisoPaginacionAltoTipoCurso(Boolean isPermisoPaginacionAltoTipoCurso) {
		this.isPermisoPaginacionAltoTipoCurso = isPermisoPaginacionAltoTipoCurso;
	}
	
	public Boolean getIsPermisoCopiarTipoCurso() {
		return isPermisoCopiarTipoCurso;
	}

	public void setIsPermisoCopiarTipoCurso(Boolean isPermisoCopiarTipoCurso) {
		this.isPermisoCopiarTipoCurso = isPermisoCopiarTipoCurso;
	}
	
	public Boolean getIsPermisoVerFormTipoCurso() {
		return isPermisoVerFormTipoCurso;
	}

	public void setIsPermisoVerFormTipoCurso(Boolean isPermisoVerFormTipoCurso) {
		this.isPermisoVerFormTipoCurso = isPermisoVerFormTipoCurso;
	}
	
	public Boolean getIsPermisoDuplicarTipoCurso() {
		return isPermisoDuplicarTipoCurso;
	}

	public void setIsPermisoDuplicarTipoCurso(Boolean isPermisoDuplicarTipoCurso) {
		this.isPermisoDuplicarTipoCurso = isPermisoDuplicarTipoCurso;
	}
	
	public Boolean getIsPermisoOrdenTipoCurso() {
		return isPermisoOrdenTipoCurso;
	}

	public void setIsPermisoOrdenTipoCurso(Boolean isPermisoOrdenTipoCurso) {
		this.isPermisoOrdenTipoCurso = isPermisoOrdenTipoCurso;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoCurso() {
		return isVisibilidadCeldaNuevoTipoCurso;
	}

	public void setIsVisibilidadCeldaNuevoTipoCurso(Boolean isVisibilidadCeldaNuevoTipoCurso) {
		this.isVisibilidadCeldaNuevoTipoCurso = isVisibilidadCeldaNuevoTipoCurso;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoCurso() {
		return isVisibilidadCeldaDuplicarTipoCurso;
	}

	public void setIsVisibilidadCeldaDuplicarTipoCurso(Boolean isVisibilidadCeldaDuplicarTipoCurso) {
		this.isVisibilidadCeldaDuplicarTipoCurso = isVisibilidadCeldaDuplicarTipoCurso;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoCurso() {
		return isVisibilidadCeldaCopiarTipoCurso;
	}

	public void setIsVisibilidadCeldaCopiarTipoCurso(Boolean isVisibilidadCeldaCopiarTipoCurso) {
		this.isVisibilidadCeldaCopiarTipoCurso = isVisibilidadCeldaCopiarTipoCurso;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoCurso() {
		return isVisibilidadCeldaVerFormTipoCurso;
	}

	public void setIsVisibilidadCeldaVerFormTipoCurso(Boolean isVisibilidadCeldaVerFormTipoCurso) {
		this.isVisibilidadCeldaVerFormTipoCurso = isVisibilidadCeldaVerFormTipoCurso;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoCurso() {
		return isVisibilidadCeldaOrdenTipoCurso;
	}

	public void setIsVisibilidadCeldaOrdenTipoCurso(Boolean isVisibilidadCeldaOrdenTipoCurso) {
		this.isVisibilidadCeldaOrdenTipoCurso = isVisibilidadCeldaOrdenTipoCurso;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoCurso() {
		return isVisibilidadCeldaNuevoRelacionesTipoCurso;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoCurso(Boolean isVisibilidadCeldaNuevoRelacionesTipoCurso) {
		this.isVisibilidadCeldaNuevoRelacionesTipoCurso = isVisibilidadCeldaNuevoRelacionesTipoCurso;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoCurso() {
		return isVisibilidadCeldaModificarTipoCurso;
	}

	public void setIsVisibilidadCeldaModificarTipoCurso(Boolean isVisibilidadCeldaModificarTipoCurso) {
		this.isVisibilidadCeldaModificarTipoCurso = isVisibilidadCeldaModificarTipoCurso;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoCurso() {
		return isVisibilidadCeldaActualizarTipoCurso;
	}

	public void setIsVisibilidadCeldaActualizarTipoCurso(Boolean isVisibilidadCeldaActualizarTipoCurso) {
		this.isVisibilidadCeldaActualizarTipoCurso = isVisibilidadCeldaActualizarTipoCurso;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoCurso() {
		return isVisibilidadCeldaEliminarTipoCurso;
	}

	public void setIsVisibilidadCeldaEliminarTipoCurso(Boolean isVisibilidadCeldaEliminarTipoCurso) {
		this.isVisibilidadCeldaEliminarTipoCurso = isVisibilidadCeldaEliminarTipoCurso;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoCurso() {
		return isVisibilidadCeldaCancelarTipoCurso;
	}

	public void setIsVisibilidadCeldaCancelarTipoCurso(Boolean isVisibilidadCeldaCancelarTipoCurso) {
		this.isVisibilidadCeldaCancelarTipoCurso = isVisibilidadCeldaCancelarTipoCurso;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoCurso() {
		return isVisibilidadCeldaGuardarTipoCurso;
	}

	public void setIsVisibilidadCeldaGuardarTipoCurso(Boolean isVisibilidadCeldaGuardarTipoCurso) {
		this.isVisibilidadCeldaGuardarTipoCurso = isVisibilidadCeldaGuardarTipoCurso;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoCurso() {
		return isVisibilidadCeldaGuardarCambiosTipoCurso;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoCurso(Boolean isVisibilidadCeldaGuardarCambiosTipoCurso) {
		this.isVisibilidadCeldaGuardarCambiosTipoCurso = isVisibilidadCeldaGuardarCambiosTipoCurso;
	}
		
	public TipoCursoSessionBean gettipocursoSessionBean() {
		return this.tipocursoSessionBean;
	}
	
	public void settipocursoSessionBean(TipoCursoSessionBean tipocursoSessionBean) {
		this.tipocursoSessionBean=tipocursoSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoCurso(TipoCurso tipocurso)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tipocurso,null);
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
	
	public void bugActualizarReferenciaActual(TipoCurso tipocurso,TipoCurso tipocursoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoCurso(tipocurso);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipocursoAux.setId(tipocurso.getId());
		tipocursoAux.setVersionRow(tipocurso.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoCurso();
		
			int intSelectedRow = this.jTableDatosTipoCurso.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocurso =(TipoCurso) this.tipocursoLogic.getTipoCursos().toArray()[this.jTableDatosTipoCurso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipocurso =(TipoCurso) this.tipocursos.toArray()[this.jTableDatosTipoCurso.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoCursoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoCurso(this.tipocurso,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoCurso(this.tipocurso);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipocursoValidator.getInvalidValues(this.tipocurso);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipocursoLogic.setDatosCliente(datosCliente);
			tipocursoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipocursoAux=new  TipoCurso();
				
				tipocursoAux.setIsNew(true);
				tipocursoAux.setIsChanged(true);
				
				tipocursoAux.setTipoCursoOriginal(this.tipocurso);
				
				tipocursoAux.setId(this.tipocurso.getId());	
				tipocursoAux.setVersionRow(this.tipocurso.getVersionRow());	
				tipocursoAux.setid_empresa(this.tipocurso.getid_empresa());	
				tipocursoAux.setcodigo(this.tipocurso.getcodigo());	
				tipocursoAux.setnombre(this.tipocurso.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipocursoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipocursoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipocursoAux,tipocursoLogic.getTipoCursos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocursoAux,tipocursos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipocursoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipocursoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocursoLogic.saveTipoCursos();//WithConnection
						//tipocursoLogic.getSetVersionRowTipoCursos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipocurso,tipocursoAux);
					
					this.refrescarForeignKeysDescripcionesTipoCurso();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipocursoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipocursoAux=new  TipoCurso();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipocursoSessionBean.getEsGuardarRelacionado() 
					|| (this.tipocursoSessionBean.getEsGuardarRelacionado() && this.tipocurso.getId()>=0)) {
						
					tipocursoAux.setIsNew(false);
				}
				
				tipocursoAux.setIsDeleted(false);
			
				tipocursoAux.setId(this.tipocurso.getId());	
				tipocursoAux.setVersionRow(this.tipocurso.getVersionRow());	
				tipocursoAux.setid_empresa(this.tipocurso.getid_empresa());	
				tipocursoAux.setcodigo(this.tipocurso.getcodigo());	
				tipocursoAux.setnombre(this.tipocurso.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipocursoAux,tipocursoLogic.getTipoCursos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocursoAux,tipocursos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipocursoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipocursoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocursoLogic.saveTipoCursos();//WithConnection
						//tipocursoLogic.getSetVersionRowTipoCursos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipocurso,tipocursoAux);
					
					this.refrescarForeignKeysDescripcionesTipoCurso();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipocursoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipocursoAux=new  TipoCurso();
				
				tipocursoAux.setIsNew(false);
				tipocursoAux.setIsChanged(false);
				
				tipocursoAux.setIsDeleted(true);
				
				tipocursoAux.setId(this.tipocurso.getId());	
				tipocursoAux.setVersionRow(this.tipocurso.getVersionRow());	
				tipocursoAux.setid_empresa(this.tipocurso.getid_empresa());	
				tipocursoAux.setcodigo(this.tipocurso.getcodigo());	
				tipocursoAux.setnombre(this.tipocurso.getnombre());	
				
				if(this.tipocursoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipocursoAux.getId()>=0) {	
						this.tipocursosEliminados.add(tipocursoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipocursoAux,tipocursoLogic.getTipoCursos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocursoAux,tipocursos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipocursoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipocursoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocursoLogic.saveTipoCursos();//WithConnection
						//tipocursoLogic.getSetVersionRowTipoCursos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipocursoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoCurso.cursoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCurso.cursoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoCurso.cursoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipocursoAux.setCursos(this.jInternalFrameDetalleFormTipoCurso.cursoBeanSwingJInternalFrame.cursoLogic.getCursos());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipocursoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipocursoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipocursoAux,tipocursoLogic.getTipoCursos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipocursoAux,tipocursos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocursoLogic.getTipoCursos().addAll(this.tipocursosEliminados);
					
					tipocursoLogic.saveTipoCursos();//WithConnection
					//tipocursoLogic.getSetVersionRowTipoCursos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoCurso();
				
				this.tipocursosEliminados= new ArrayList<TipoCurso>();		
			}
			
			if(this.tipocursoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocursoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Curso GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Curso",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipocurso=tipocursoAux;
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
      		//this.finishProcessTipoCurso();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoCurso tipocursoLocal) throws Exception {
		
		if(this.tipocursoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipocursoLocal.setCursos(this.jInternalFrameDetalleFormTipoCurso.cursoBeanSwingJInternalFrame.cursoLogic.getCursos());
			
			} else {
			
				tipocursoLocal.setCursos(this.jInternalFrameDetalleFormTipoCurso.cursoBeanSwingJInternalFrame.cursos);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoCurso tipocursoLocal) throws Exception {	
		if(this.tipocursoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tipocursoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoCursoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoCurso.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipocurso =(TipoCurso) this.tipocursoLogic.getTipoCursos().toArray()[this.jTableDatosTipoCurso.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipocurso =(TipoCurso) this.tipocursos.toArray()[this.jTableDatosTipoCurso.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipocursoValidator.getInvalidValues(this.tipocurso);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoCurso tipocurso,List<TipoCurso> tipocursos) throws Exception {
		try	{		
			TipoCursoConstantesFunciones.actualizarLista(tipocurso,tipocursos,this.tipocursoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoCurso tipocurso,List<TipoCurso> tipocursos) throws Exception {
		try	{			
			TipoCursoConstantesFunciones.actualizarSelectedLista(tipocurso,tipocursos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoCurso> tipocursosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipocursosLocal=this.tipocursoLogic.getTipoCursos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipocursosLocal=this.tipocursos;
			}
			//ARCHITECTURE
		
			for(TipoCurso tipocursoLocal:tipocursosLocal) {
				if(this.permiteMantenimiento(tipocursoLocal) && tipocursoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoCursoConstantesFunciones.getTipoCursoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoCursoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCurso.jLabelid_empresaTipoCurso,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoCursoConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCurso.jLabelcodigoTipoCurso,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoCursoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCurso.jLabelnombreTipoCurso,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoCurso!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoCurso.jLabelid_empresaTipoCurso,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoCurso.jLabelcodigoTipoCurso,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoCurso.jLabelnombreTipoCurso,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("Curso")) {
			if(this.tipocurso==null) {
				this.tipocurso= new TipoCurso();
			}

			if(this.tipocursoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoCurso
				this.setVariablesFormularioToObjetoActualTipoCurso(this.tipocurso,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoCurso(this.tipocurso);

				this.jInternalFrameDetalleFormTipoCurso.cursoBeanSwingJInternalFrame.getcurso().setTipoCurso(this.tipocurso);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoCurso--;	
		
		
		this.tipocursoAux=new TipoCurso();
		
		this.tipocursoAux.setId(this.iIdNuevoTipoCurso);
		this.tipocursoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipocursoLogic.getTipoCursos().add(this.tipocursoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipocursos.add(this.tipocursoAux);
		}
		//ARCHITECTURE
		
		this.tipocurso=this.tipocursoAux;
		
		if(TipoCursoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoCurso(this.tipocurso);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoCurso(this.tipocurso);
		}
				
		//this.setDefaultControlesTipoCurso();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoCurso();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoCurso();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoCurso();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoCurso(this.tipocursoBean,this.tipocurso,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoCurso(this.tipocurso);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoCursoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipocursoSessionBean.getConGuardarRelaciones()) {
			classes=TipoCursoConstantesFunciones.getClassesRelationshipsOfTipoCurso(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipocursoReturnGeneral=tipocursoLogic.procesarEventosTipoCursosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipocursoLogic.getTipoCursos(),this.tipocurso,this.tipocursoParameterGeneral,this.isEsNuevoTipoCurso,classes);//this.tipocursoLogic.getTipoCurso()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoCurso(this.tipocursoReturnGeneral,this.tipocursoBean,false);
		
		if(this.tipocursoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoCurso(this.tipocursoReturnGeneral.getTipoCurso());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoCurso(this.tipocursoReturnGeneral.getTipoCurso());
		}
		
		if(this.tipocursoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoCurso(this.tipocursoReturnGeneral.getTipoCurso(),classes);//this.tipocursoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoCurso(this.tipocurso,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoCurso();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoCurso();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoCurso(false);
						
			if(tipocursoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoCurso.cursoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCurso.cursoBeanSwingJInternalFrame.cursoSessionBean.getEsGuardarRelacionado() && CursoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCursoActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoCursoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoCurso();
			}
			
			this.actualizarVisualTableDatosTipoCurso();
			
			this.jTableDatosTipoCurso.setRowSelectionInterval(this.getIndiceNuevoTipoCurso(), this.getIndiceNuevoTipoCurso());
			
			this.seleccionarFilaTablaTipoCursoActual();
						
			this.actualizarEstadoCeldasBotonesTipoCurso("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoCurso(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoCurso.jTextFieldcodigoTipoCurso.setEnabled(isHabilitar && this.tipocursoConstantesFunciones.activarcodigoTipoCurso);
		this.jInternalFrameDetalleFormTipoCurso.jTextAreanombreTipoCurso.setEnabled(isHabilitar && this.tipocursoConstantesFunciones.activarnombreTipoCurso);	
		//
		this.jInternalFrameDetalleFormTipoCurso.jComboBoxid_empresaTipoCurso.setEnabled(isHabilitar && this.tipocursoConstantesFunciones.activarid_empresaTipoCurso);
	};
	
	public void setDefaultControlesTipoCurso() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoCurso(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipocursoSessionBean.setConGuardarRelaciones(true);			
			this.tipocursoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoCurso.jTabbedPaneRelacionesTipoCurso.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoCurso.cursoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoCurso.cursoBeanSwingJInternalFrame.cursoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoCurso.cursoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipocursoSessionBean.setConGuardarRelaciones(false);			
			this.tipocursoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoCurso.jTabbedPaneRelacionesTipoCurso.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoCurso.cursoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoCurso.cursoBeanSwingJInternalFrame.cursoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoCurso.cursoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoCurso() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCurso tipocursoAux:this.tipocursoLogic.getTipoCursos()) {
				if(tipocursoAux.getId().equals(this.iIdNuevoTipoCurso)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCurso tipocursoAux:this.tipocursos) {
				if(tipocursoAux.getId().equals(this.iIdNuevoTipoCurso)) {
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
	
	public int getIndiceActualTipoCurso(TipoCurso tipocurso,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCurso tipocursoAux:this.tipocursoLogic.getTipoCursos()) {
				if(tipocursoAux.getId().equals(tipocurso.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCurso tipocursoAux:this.tipocursos) {
				if(tipocursoAux.getId().equals(tipocurso.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoCurso(TipoCurso tipocursoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCurso tipocursoAux:this.tipocursoLogic.getTipoCursos()) {
				if(tipocursoAux.getTipoCursoOriginal().getId().equals(tipocursoOriginal.getId())) {
					existe=true;
					tipocursoOriginal.setId(tipocursoAux.getId());
					tipocursoOriginal.setVersionRow(tipocursoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCurso tipocursoAux:this.tipocursos) {
				if(tipocursoAux.getTipoCursoOriginal().getId().equals(tipocursoOriginal.getId())) {
					existe=true;
					tipocursoOriginal.setId(tipocursoAux.getId());
					tipocursoOriginal.setVersionRow(tipocursoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoCurso(Boolean esParaCancelar) throws Exception {
		tipocursosAux=new ArrayList<TipoCurso>();
		tipocursoAux=new TipoCurso();
		
		if(!this.tipocursoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoCurso tipocursoAux:this.tipocursoLogic.getTipoCursos()) {
					if(tipocursoAux.getId()<0) {
						tipocursosAux.add(tipocursoAux);
					}		
				}
				this.iIdNuevoTipoCurso=0L;
				this.tipocursoLogic.getTipoCursos().removeAll(tipocursosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCurso tipocursoAux:this.tipocursos) {
					if(tipocursoAux.getId()<0) {
						tipocursosAux.add(tipocursoAux);
					}		
				}
				this.iIdNuevoTipoCurso=0L;
				this.tipocursos.removeAll(tipocursosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoCurso 
					&& this.tipocursoLogic.getTipoCursos().size()>0
					) {
					tipocursoAux=this.tipocursoLogic.getTipoCursos().get(this.tipocursoLogic.getTipoCursos().size() - 1);
				
					if(tipocursoAux.getId()<0) {
						this.tipocursoLogic.getTipoCursos().remove(tipocursoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoCurso && this.tipocursos.size()>0) {
					tipocursoAux=this.tipocursos.get(this.tipocursos.size() - 1);
				
					if(tipocursoAux.getId()<0) {
						this.tipocursos.remove(tipocursoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoCurso(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipocurso.getId()<0) {
				this.tipocursoLogic.getTipoCursos().remove(this.tipocurso);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipocurso.getId()<0) {
				this.tipocursos.remove(this.tipocurso);
			}
		}			
	}
	
	public void setEstadosInicialesTipoCurso(List<TipoCurso> tipocursosAux) throws Exception {
		TipoCursoConstantesFunciones.setEstadosInicialesTipoCurso(tipocursosAux);
	}
	
	public void setEstadosInicialesTipoCurso(TipoCurso tipocursoAux) throws Exception {
		TipoCursoConstantesFunciones.setEstadosInicialesTipoCurso(tipocursoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoCursoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoCurso("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoCursoActual()) {
				if(!this.isEsNuevoTipoCurso) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoCurso("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoCurso=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoCursoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Curso ?", "MANTENIMIENTO DE Tipo Curso", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoCurso("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoCurso tipocurso) throws Exception {
		TipoCursoConstantesFunciones.seleccionarAsignar(this.tipocurso,tipocurso);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoCurso=this.isPermisoActualizarOriginalTipoCurso;
			
			
			this.seleccionarAsignar(tipocurso);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoCursoConstantesFunciones.quitarEspaciosTipoCurso(this.tipocurso,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoCurso("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipocursoSessionBean.setsFuncionBusquedaRapida(this.tipocursoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoCurso) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoCurso(esParaCancelar);				
				this.cancelarNuevoTipoCurso(esParaCancelar);								
			}
			
			this.tipocurso=new TipoCurso();
			
			this.inicializarTipoCurso();
			
			this.actualizarEstadoCeldasBotonesTipoCurso("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoCurso() throws Exception {
		try {
			TipoCursoConstantesFunciones.inicializarTipoCurso(this.tipocurso);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipocursoLogic.getTipoCursos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoCursos(String sAccionBusqueda,List<TipoCurso> tipocursosParaReportes) throws Exception {
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
					sPathReporteFinal="TipoCurso"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoCursoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoCursoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoCurso"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Cursos");		
		parameters.put("busquedapor", TipoCursoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
					
					TipoCursoLogic tipocursoLogicAuxiliar=new TipoCursoLogic();
					tipocursoLogicAuxiliar.setDatosCliente(tipocursoLogic.getDatosCliente());				
					tipocursoLogicAuxiliar.setTipoCursos(tipocursosParaReportes);
					
					tipocursoLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoCursoWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipocursosParaReportes=tipocursoLogicAuxiliar.getTipoCursos();
					
					//tipocursoLogic.getNewConnexionToDeep();
					
					//for (TipoCurso tipocurso:tipocursosParaReportes) {
					//	tipocursoLogic.deepLoad(tipocurso, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipocursoLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipocursoLogic.closeNewConnexionToDeep();
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoCurso=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoCursoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoCursoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoCurso=new JRBeanArrayDataSource(TipoCursoJInternalFrame.TraerTipoCursoBeans(tipocursosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoCurso);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoCursoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoCursoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoCursoBean.TraerTipoCursoBeans(tipocursosParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoCursos(sAccionBusqueda,sTipoArchivoReporte,tipocursosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoCursos(sAccionBusqueda,sTipoArchivoReporte,tipocursosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoCursoActionPerformed(null);
					//this.generarExcelReporteTipoCursos(sAccionBusqueda,sTipoArchivoReporte,tipocursosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoCursos(sAccionBusqueda,sTipoArchivoReporte,tipocursosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoCursos(sAccionBusqueda,sTipoArchivoReporte,tipocursosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoCursos(sAccionBusqueda,sTipoArchivoReporte,tipocursosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoCursos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoCurso> tipocursosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocurso";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoCursos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoCurso("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoCurso tipocurso : tipocursosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoCursoConstantesFunciones.generarExcelReporteDataTipoCurso("NORMAL",row,workbook,tipocurso,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocursoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Curso",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoCurso(String sTipo,Row row,Workbook workbook) {
		
		TipoCursoConstantesFunciones.generarExcelReporteHeaderTipoCurso(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoCursos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoCurso> tipocursosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocurso_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoCursos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoCurso tipocurso : tipocursosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoCursoConstantesFunciones.getTipoCursoDescripcion(tipocurso));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoCursoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoCursoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipocurso.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoCursoConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoCursoConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipocurso.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoCursoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoCursoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipocurso.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocursoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Curso",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoCursos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoCurso> tipocursosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoCurso> tipocursosRespaldo=null;
		
		classes=TipoCursoConstantesFunciones.getClassesRelationshipsOfTipoCurso(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipocursoLogic.setDatosCliente(this.datosCliente);
		this.tipocursoLogic.setDatosDeep(this.datosDeep);
		this.tipocursoLogic.setIsConDeep(true);
		
		tipocursosRespaldo=this.tipocursoLogic.getTipoCursos();
		
		this.tipocursoLogic.setTipoCursos(tipocursosParaReportes);	
		this.tipocursoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipocursosParaReportes=this.tipocursoLogic.getTipoCursos();
		this.tipocursoLogic.setTipoCursos(tipocursosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocurso_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoCursos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoCurso("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoCurso tipocurso : tipocursosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoCurso("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoCursoConstantesFunciones.generarExcelReporteDataTipoCurso("NORMAL",row,workbook,tipocurso,cellStyleDataAux);
		
			
			


				//Curso
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(CursoConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipocurso.getCursos()!=null && tipocurso.getCursos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(CursoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					CursoConstantesFunciones.generarExcelReporteHeaderCurso("RELACIONADO",row,workbook);
				}

				if(tipocurso.getCursos()!=null) {
					i2=0;
					for(Curso curso : tipocurso.getCursos()) {
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
		cell.setCellValue(TipoCursoConstantesFunciones.getTipoCursoDescripcion(tipocurso));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocursoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Curso",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoCurso.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCurso.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoCurso.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCurso.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoCurso() throws Exception {		
		this.startProcessTipoCurso(true);
	}
	
	public void startProcessTipoCurso(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoCurso ,this.jPanelParametrosReportesTipoCurso, this.jScrollPanelDatosTipoCurso,this.jPanelPaginacionTipoCurso, this.jScrollPanelDatosEdicionTipoCurso, this.jPanelAccionesTipoCurso,this.jPanelAccionesFormularioTipoCurso,this.jmenuBarTipoCurso,this.jmenuBarDetalleTipoCurso,this.jTtoolBarTipoCurso,this.jTtoolBarDetalleTipoCurso);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoCurso=this.jTabbedPaneBusquedasTipoCurso; 
		
		final JPanel jPanelParametrosReportesTipoCurso=this.jPanelParametrosReportesTipoCurso;
		//final JScrollPane jScrollPanelDatosTipoCurso=this.jScrollPanelDatosTipoCurso;
		final JTable jTableDatosTipoCurso=this.jTableDatosTipoCurso;		
		final JPanel jPanelPaginacionTipoCurso=this.jPanelPaginacionTipoCurso;
		//final JScrollPane jScrollPanelDatosEdicionTipoCurso=this.jScrollPanelDatosEdicionTipoCurso;
		final JPanel jPanelAccionesTipoCurso=this.jPanelAccionesTipoCurso;
		
		JPanel jPanelCamposAuxiliarTipoCurso=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoCurso=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoCurso!=null) {
			jPanelCamposAuxiliarTipoCurso=this.jInternalFrameDetalleFormTipoCurso.jPanelCamposTipoCurso;
			jPanelAccionesFormularioAuxiliarTipoCurso=this.jInternalFrameDetalleFormTipoCurso.jPanelAccionesFormularioTipoCurso;
		}
		
		final JPanel jPanelCamposTipoCurso=jPanelCamposAuxiliarTipoCurso;
		final JPanel jPanelAccionesFormularioTipoCurso=jPanelAccionesFormularioAuxiliarTipoCurso;
		
		
		final JMenuBar jmenuBarTipoCurso=this.jmenuBarTipoCurso;
		final JToolBar jTtoolBarTipoCurso=this.jTtoolBarTipoCurso;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoCurso=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoCurso=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoCurso!=null) {
			jmenuBarDetalleAuxiliarTipoCurso=this.jInternalFrameDetalleFormTipoCurso.jmenuBarDetalleTipoCurso;
			jTtoolBarDetalleAuxiliarTipoCurso=this.jInternalFrameDetalleFormTipoCurso.jTtoolBarDetalleTipoCurso;
		}
		
		final JMenuBar jmenuBarDetalleTipoCurso=jmenuBarDetalleAuxiliarTipoCurso;
		final JToolBar jTtoolBarDetalleTipoCurso=jTtoolBarDetalleAuxiliarTipoCurso;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoCurso;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoCurso;
			processRunnable.jTableDatos=jTableDatosTipoCurso;
			processRunnable.jPanelCampos=jPanelCamposTipoCurso;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoCurso;
			processRunnable.jPanelAcciones=jPanelAccionesTipoCurso;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoCurso;
			
			
			processRunnable.jmenuBar=jmenuBarTipoCurso;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoCurso;
			processRunnable.jTtoolBar=jTtoolBarTipoCurso;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoCurso;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoCurso ,jPanelParametrosReportesTipoCurso,jTableDatosTipoCurso, /*jScrollPanelDatosTipoCurso,*/jPanelCamposTipoCurso,jPanelPaginacionTipoCurso, /*jScrollPanelDatosEdicionTipoCurso,*/ jPanelAccionesTipoCurso,jPanelAccionesFormularioTipoCurso,jmenuBarTipoCurso,jmenuBarDetalleTipoCurso,jTtoolBarTipoCurso,jTtoolBarDetalleTipoCurso);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoCurso ,jPanelParametrosReportesTipoCurso, jScrollPanelDatosTipoCurso,jPanelPaginacionTipoCurso, jScrollPanelDatosEdicionTipoCurso, jPanelAccionesTipoCurso,jPanelAccionesFormularioTipoCurso,jmenuBarTipoCurso,jmenuBarDetalleTipoCurso,jTtoolBarTipoCurso,jTtoolBarDetalleTipoCurso);
						
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
	
	public void finishProcessTipoCurso() {// throws Exception 
		this.finishProcessTipoCurso(true);
	}
	
	public void finishProcessTipoCurso(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoCurso ,this.jPanelParametrosReportesTipoCurso, this.jScrollPanelDatosTipoCurso,this.jPanelPaginacionTipoCurso, this.jScrollPanelDatosEdicionTipoCurso, this.jPanelAccionesTipoCurso,this.jPanelAccionesFormularioTipoCurso,this.jmenuBarTipoCurso,this.jmenuBarDetalleTipoCurso,this.jTtoolBarTipoCurso,this.jTtoolBarDetalleTipoCurso);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoCurso=this.jTabbedPaneBusquedasTipoCurso; 
		
		final JPanel jPanelParametrosReportesTipoCurso=this.jPanelParametrosReportesTipoCurso;
		//final JScrollPane jScrollPanelDatosTipoCurso=this.jScrollPanelDatosTipoCurso;
		final JTable jTableDatosTipoCurso=this.jTableDatosTipoCurso;		
		final JPanel jPanelPaginacionTipoCurso=this.jPanelPaginacionTipoCurso;
		//final JScrollPane jScrollPanelDatosEdicionTipoCurso=this.jScrollPanelDatosEdicionTipoCurso;
		final JPanel jPanelAccionesTipoCurso=this.jPanelAccionesTipoCurso;
		
		JPanel jPanelCamposAuxiliarTipoCurso=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoCurso=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoCurso!=null) {
			jPanelCamposAuxiliarTipoCurso=this.jInternalFrameDetalleFormTipoCurso.jPanelCamposTipoCurso;
			jPanelAccionesFormularioAuxiliarTipoCurso=this.jInternalFrameDetalleFormTipoCurso.jPanelAccionesFormularioTipoCurso;
		}
		
		final JPanel jPanelCamposTipoCurso=jPanelCamposAuxiliarTipoCurso;
		final JPanel jPanelAccionesFormularioTipoCurso=jPanelAccionesFormularioAuxiliarTipoCurso;
		
		
		final JMenuBar jmenuBarTipoCurso=this.jmenuBarTipoCurso;		
		final JToolBar jTtoolBarTipoCurso=this.jTtoolBarTipoCurso;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoCurso=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoCurso=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoCurso!=null) {
			jmenuBarDetalleAuxiliarTipoCurso=this.jInternalFrameDetalleFormTipoCurso.jmenuBarDetalleTipoCurso;
			jTtoolBarDetalleAuxiliarTipoCurso=this.jInternalFrameDetalleFormTipoCurso.jTtoolBarDetalleTipoCurso;		
		}
		
		final JMenuBar jmenuBarDetalleTipoCurso=jmenuBarDetalleAuxiliarTipoCurso;
		final JToolBar jTtoolBarDetalleTipoCurso=jTtoolBarDetalleAuxiliarTipoCurso;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoCurso;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoCurso;
			processRunnable.jTableDatos=jTableDatosTipoCurso;
			processRunnable.jPanelCampos=jPanelCamposTipoCurso;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoCurso;
			processRunnable.jPanelAcciones=jPanelAccionesTipoCurso;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoCurso;
			
			
			processRunnable.jmenuBar=jmenuBarTipoCurso;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoCurso;
			processRunnable.jTtoolBar=jTtoolBarTipoCurso;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoCurso;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoCurso ,jPanelParametrosReportesTipoCurso, jTableDatosTipoCurso,/*jScrollPanelDatosTipoCurso,*/jPanelCamposTipoCurso,jPanelPaginacionTipoCurso, /*jScrollPanelDatosEdicionTipoCurso,*/ jPanelAccionesTipoCurso,jPanelAccionesFormularioTipoCurso,jmenuBarTipoCurso,jmenuBarDetalleTipoCurso,jTtoolBarTipoCurso,jTtoolBarDetalleTipoCurso));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoCurso(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoCurso(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoCurso(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoCurso(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoCurso,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoCurso,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoCurso(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoCurso,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoCurso,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipocursoConstantesFunciones.getsFinalQueryTipoCurso();
		String  finalQueryPaginacionTodos=this.tipocursoConstantesFunciones.getsFinalQueryTipoCurso();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoCursoConstantesFunciones.getArrayColumnasGlobalesNoTipoCurso(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoCursoConstantesFunciones.getArrayColumnasGlobalesTipoCurso(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoCursoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipocursosEliminados= new ArrayList<TipoCurso>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoCurso();
		
				///*TipoCursoSessionBean*/this.tipocursoSessionBean=new TipoCursoSessionBean();
			
			if(this.tipocursoSessionBean==null) {
				this.tipocursoSessionBean=new TipoCursoSessionBean();
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
					this.iNumeroPaginacion=TipoCursoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoCursoConstantesFunciones.getClassesForeignKeysOfTipoCurso(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipocurso."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipocursosAux= new ArrayList<TipoCurso>();
			
				
			tipocursoLogic.setDatosCliente(this.datosCliente);
			tipocursoLogic.setDatosDeep(this.datosDeep);
			tipocursoLogic.setIsConDeep(true);
			
			
			tipocursoLogic.getTipoCursoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipocursoLogic.getTodosTipoCursos(finalQueryGlobal,pagination);
					
					//tipocursoLogic.getTodosTipoCursosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipocursoLogic.getTipoCursos()==null|| tipocursoLogic.getTipoCursos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipocursosAux= new ArrayList<TipoCurso>();
							tipocursosAux.addAll(tipocursoLogic.getTipoCursos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocursosAux= new ArrayList<TipoCurso>();
							tipocursosAux.addAll(tipocursos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipocursoLogic.getTodosTipoCursos(finalQueryGlobal+"",this.pagination);												
							
							//tipocursoLogic.getTodosTipoCursosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoCursos("Todos",tipocursoLogic.getTipoCursos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipocursoLogic.setTipoCursos(new ArrayList<TipoCurso>());					
							tipocursoLogic.getTipoCursos().addAll(tipocursosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocursos=new ArrayList<TipoCurso>();
							tipocursos.addAll(tipocursosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoCurso=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoCurso=this.idActual;
				
				} else if(this.idTipoCursoActual!=null && this.idTipoCursoActual!=0L) {
					idTipoCurso=idTipoCursoActual;
				}
				
					
				this.sDetalleReporte=TipoCursoConstantesFunciones.getDetalleIndicePorId(idTipoCurso);
				
				this.tipocursos=new ArrayList<TipoCurso>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipocursoLogic.getEntity(idTipoCurso);
					
					//tipocursoLogic.getEntityWithConnection(idTipoCurso);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocursoLogic.setTipoCursos(new ArrayList<TipoCurso>());
					tipocursoLogic.getTipoCursos().add(tipocursoLogic.getTipoCurso());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipocursos=new ArrayList<TipoCurso>();
					this.tipocursos.add(tipocurso);
				}
				
				if(tipocursoLogic.getTipoCurso()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TipoCursoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipocursoLogic.getTipoCursosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoCursoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoCursoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipocursoLogic.getTipoCursos()==null||tipocursoLogic.getTipoCursos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipocursos==null|| tipocursos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocursosAux=new ArrayList<TipoCurso>();
						tipocursosAux.addAll(tipocursoLogic.getTipoCursos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocursosAux=new ArrayList<TipoCurso>();
							tipocursosAux.addAll(tipocursos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipocursoLogic.getTipoCursosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoCursoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoCursoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoCursos("FK_IdEmpresa",tipocursoLogic.getTipoCursos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoCursos("FK_IdEmpresa",tipocursos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocursoLogic.setTipoCursos(new ArrayList<TipoCurso>());
						tipocursoLogic.getTipoCursos().addAll(tipocursosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocursos=new ArrayList<TipoCurso>();
							tipocursos.addAll(tipocursosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoCurso();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoCurso();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipocursoLogic.getTipoCursos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipocursos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipocursoLogic.getTipoCursos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipocursos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoCurso tipocurso) {
		Boolean permite=true;
		
		if(this.tipocurso.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoCursoConstantesFunciones.getOrderByListaTipoCurso();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoCursoConstantesFunciones.getOrderByListaTipoCurso();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCurso tipocurso:tipocursoLogic.getTipoCursos()) {
				if(tipocurso.getsType().equals(Constantes2.S_TOTALES)) {
					tipocursoTotales=tipocurso;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCurso tipocurso:this.tipocursos) {
				if(tipocurso.getsType().equals(Constantes2.S_TOTALES)) {
					tipocursoTotales=tipocurso;
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
			this.tipocursoAux=new TipoCurso();
			this.tipocursoAux.setsType(Constantes2.S_TOTALES);
			this.tipocursoAux.setIsNew(false);
			this.tipocursoAux.setIsChanged(false);
			this.tipocursoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoCursoConstantesFunciones.TotalizarValoresFilaTipoCurso(this.tipocursoLogic.getTipoCursos(),this.tipocursoAux);
				
				this.tipocursoLogic.getTipoCursos().add(this.tipocursoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoCursoConstantesFunciones.TotalizarValoresFilaTipoCurso(this.tipocursos,this.tipocursoAux);
				
				this.tipocursos.add(this.tipocursoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipocursoTotales=new TipoCurso();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipocursoLogic.getTipoCursos().remove(tipocursoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipocursos.remove(tipocursoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipocursoTotales=new TipoCurso();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCurso tipocurso:tipocursoLogic.getTipoCursos()) {
				if(tipocurso.getsType().equals(Constantes2.S_TOTALES)) {
					tipocursoTotales=tipocurso;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoCursoConstantesFunciones.TotalizarValoresFilaTipoCurso(this.tipocursoLogic.getTipoCursos(),tipocursoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCurso tipocurso:this.tipocursos) {
				if(tipocurso.getsType().equals(Constantes2.S_TOTALES)) {
					tipocursoTotales=tipocurso;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoCursoConstantesFunciones.TotalizarValoresFilaTipoCurso(this.tipocursos,tipocursoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoCursosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoCursosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocursoLogic.getTipoCursosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosTipoCurso() {
		this.isPermisoTodoTipoCurso=false;
		this.isPermisoNuevoTipoCurso=false;
		this.isPermisoActualizarTipoCurso=false;
		this.isPermisoActualizarOriginalTipoCurso=false;
		this.isPermisoEliminarTipoCurso=false;
		this.isPermisoGuardarCambiosTipoCurso=false;
		this.isPermisoConsultaTipoCurso=false;
		this.isPermisoBusquedaTipoCurso=false;
		this.isPermisoReporteTipoCurso=false;		
		this.isPermisoOrdenTipoCurso=false;		
		this.isPermisoPaginacionMedioTipoCurso=false;		
		this.isPermisoPaginacionAltoTipoCurso=false;
		this.isPermisoPaginacionTodoTipoCurso=false;
		this.isPermisoCopiarTipoCurso=false;		
		this.isPermisoVerFormTipoCurso=false;		
		this.isPermisoDuplicarTipoCurso=false;		
		this.isPermisoOrdenTipoCurso=false;		
	}
	
	public void setPermisosUsuarioTipoCurso(Boolean isPermiso) {
		this.isPermisoTodoTipoCurso=isPermiso;
		this.isPermisoNuevoTipoCurso=isPermiso;
		this.isPermisoActualizarTipoCurso=isPermiso;
		this.isPermisoActualizarOriginalTipoCurso=isPermiso;
		this.isPermisoEliminarTipoCurso=isPermiso;
		this.isPermisoGuardarCambiosTipoCurso=isPermiso;
		this.isPermisoConsultaTipoCurso=isPermiso;
		this.isPermisoBusquedaTipoCurso=isPermiso;
		this.isPermisoReporteTipoCurso=isPermiso;
		this.isPermisoOrdenTipoCurso=isPermiso;		
		this.isPermisoPaginacionMedioTipoCurso=isPermiso;		
		this.isPermisoPaginacionAltoTipoCurso=isPermiso;		
		this.isPermisoPaginacionTodoTipoCurso=isPermiso;		
		this.isPermisoCopiarTipoCurso=isPermiso;		
		this.isPermisoVerFormTipoCurso=isPermiso;		
		this.isPermisoDuplicarTipoCurso=isPermiso;
		this.isPermisoOrdenTipoCurso=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoCurso(Boolean isPermiso) {
		//this.isPermisoTodoTipoCurso=isPermiso;
		this.isPermisoNuevoTipoCurso=isPermiso;
		this.isPermisoActualizarTipoCurso=isPermiso;
		this.isPermisoActualizarOriginalTipoCurso=isPermiso;
		this.isPermisoEliminarTipoCurso=isPermiso;
		this.isPermisoGuardarCambiosTipoCurso=isPermiso;
		//this.isPermisoConsultaTipoCurso=isPermiso;
		//this.isPermisoBusquedaTipoCurso=isPermiso;
		//this.isPermisoReporteTipoCurso=isPermiso;
		//this.isPermisoOrdenTipoCurso=isPermiso;		
		//this.isPermisoPaginacionMedioTipoCurso=isPermiso;		
		//this.isPermisoPaginacionAltoTipoCurso=isPermiso;		
		//this.isPermisoPaginacionTodoTipoCurso=isPermiso;		
		//this.isPermisoCopiarTipoCurso=isPermiso;		
		//this.isPermisoDuplicarTipoCurso=isPermiso;
		//this.isPermisoOrdenTipoCurso=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoCursoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(CursoConstantesFunciones.SNOMBREOPCION);
		
		if(TipoCursoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
		this.isTienePermisosCurso=this.verificarGetPermisosUsuarioOpcionTipoCursoClaseRelacionada(this.opcionsRelacionadas,CursoConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoCurso(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoCursoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosCurso=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoCursoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoCursoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoCursoClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosCurso && this.jInternalFrameDetalleFormTipoCurso!=null && this.jInternalFrameDetalleFormTipoCurso.cursoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoCurso.jTabbedPaneRelacionesTipoCurso.remove(this.jInternalFrameDetalleFormTipoCurso.cursoBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoCurso() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoCursoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipocursoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoCursoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoCurso=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoCurso=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoCurso=this.isPermisoActualizarTipoCurso;
			this.isPermisoEliminarTipoCurso=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoCurso=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoCurso=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoCurso=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoCurso=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoCurso=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoCurso=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoCurso=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoCurso=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoCurso=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoCurso=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoCurso=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoCurso=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoCurso=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipocursoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoCurso.setToolTipText(this.jTableDatosTipoCurso.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoCurso(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoCurso(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoCursoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoCursoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoCurso() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosCurso && this.tipocursoConstantesFunciones.mostrarCursoTipoCurso && !TipoCursoConstantesFunciones.ISGUARDARREL) {

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
	public void inicializarCombosForeignKeyTipoCursoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoCursoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoCursoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoCursoListas(false);
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
	
	public void cargarCombosLoteForeignKeyTipoCursoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoCursoParameterReturnGeneral tipocursoReturnGeneral=new TipoCursoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tipocursoConstantesFunciones.cargarid_empresaTipoCurso)
					 || (this.esRecargarFks && this.tipocursoConstantesFunciones.cargarid_empresaTipoCurso)) {

					if(!this.tipocursoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tipocursoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipocursoReturnGeneral=tipocursoLogic.cargarCombosLoteForeignKeyTipoCurso(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tipocursoReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoCurso()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tipocursoSessionBean==null) {
				this.tipocursoSessionBean=new TipoCursoSessionBean();
			}

			if(!this.tipocursoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyTipoCurso()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoCurso(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoCurso()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoCurso();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoCurso(TipoCurso tipocurso)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoCurso(TipoCurso tipocurso,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoCurso()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoCurso()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoCurso()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoCurso()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoCurso()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoCurso()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoCurso(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoCurso()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoCurso.jComboBoxid_empresaTipoCurso!=null && this.jInternalFrameDetalleFormTipoCurso.jComboBoxid_empresaTipoCurso.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoCurso.jComboBoxid_empresaTipoCurso.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoCursoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoCursoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoCursoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipocursoSessionBean=new TipoCursoSessionBean(); 
		this.tipocursoConstantesFunciones=new TipoCursoConstantesFunciones(); 
		this.tipocursoBean=new TipoCurso();//(this.tipocursoConstantesFunciones); 		
		this.tipocursoReturnGeneral=new TipoCursoParameterReturnGeneral(); 
		
		this.tipocursoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipocursoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoCursoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoCursoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoCursoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoCurso(true);
			
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
			
			this.tipocursoConstantesFunciones=new TipoCursoConstantesFunciones(); 
			this.tipocursoBean=new TipoCurso();//this.tipocursoConstantesFunciones); 			
			this.tipocursoReturnGeneral=new TipoCursoParameterReturnGeneral(); 
		
			TipoCursoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Curso Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipocurso=new TipoCurso();
			this.tipocursos = new ArrayList<TipoCurso>();
			this.tipocursosAux = new ArrayList<TipoCurso>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocursoLogic=new TipoCursoLogic();
				this.tipocursoLogic.getNewConnexionToDeep("");
			}
			
			//this.tipocursoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipocursoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoCurso);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoCurso!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoCurso);	
					}
					
					if(this.jInternalFrameImportacionTipoCurso!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoCurso);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoCurso!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoCurso);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoCurso!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoCurso);
				this.jInternalFrameDetalleFormTipoCurso.setVisible(false);
				this.jInternalFrameDetalleFormTipoCurso.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoCurso!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoCurso);
					this.jInternalFrameReporteDinamicoTipoCurso.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoCurso.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoCurso!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoCurso);
					this.jInternalFrameImportacionTipoCurso.setVisible(false);
					this.jInternalFrameImportacionTipoCurso.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoCurso!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoCurso);
					this.jInternalFrameOrderByTipoCurso.setVisible(false);
					this.jInternalFrameOrderByTipoCurso.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoCursoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoCursoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipocursoReturnGeneral=new TipoCursoParameterReturnGeneral();
			
			this.tipocursoParameterGeneral=new TipoCursoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipocursoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipocursoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoCursoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipocursoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(CursoConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoCursoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipocursoSessionBean.getEsGuardarRelacionado(),this.tipocursoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoCursoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipocursoSessionBean.getEsGuardarRelacionado(),this.tipocursoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoCurso=false;
			this.isVisibilidadCeldaDuplicarTipoCurso=true;
			this.isVisibilidadCeldaCopiarTipoCurso=true;
			this.isVisibilidadCeldaVerFormTipoCurso=true;
			this.isVisibilidadCeldaOrdenTipoCurso=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoCurso=false;
			this.isVisibilidadCeldaModificarTipoCurso=false;
			this.isVisibilidadCeldaActualizarTipoCurso=false;
			this.isVisibilidadCeldaEliminarTipoCurso=false;
			this.isVisibilidadCeldaCancelarTipoCurso=false;
			this.isVisibilidadCeldaGuardarTipoCurso=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCurso=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoCurso("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoCurso();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoCurso(false);
			
			this.setPermisosUsuarioTipoCurso();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipocursoSessionBean.getEsGuardarRelacionado() 
				|| (this.tipocursoSessionBean.getEsGuardarRelacionado() && this.tipocursoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoCursoClasesRelacionadas();
			}
			
			if(this.tipocursoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoCursoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoCursoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoCurso();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoCurso();
			}
			
			if(!this.isPermisoBusquedaTipoCurso) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoCurso.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipocursoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoCurso,this.isPermisoPaginacionMedioTipoCurso,this.isPermisoPaginacionTodoTipoCurso);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoCursoConstantesFunciones.getTiposSeleccionarTipoCurso());
				
				this.tiposColumnasSelect=TipoCursoConstantesFunciones.getTiposSeleccionarTipoCurso(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoCurso();				
				//this.tiposRelacionesSelect=TipoCursoConstantesFunciones.getTiposRelacionesTipoCurso(true);
				
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
			//if(!this.tipocursoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoCurso();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoCurso(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoCurso(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoCurso() ;
			
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
				tipocursoImplementable= (TipoCursoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoCursoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipocursoImplementableHome= (TipoCursoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoCursoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipocursos= new ArrayList<TipoCurso>();
			this.tipocursosEliminados= new ArrayList<TipoCurso>();
						
			this.isEsNuevoTipoCurso=false;
			this.esParaAccionDesdeFormularioTipoCurso=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoCurso(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoCurso();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipocursoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoCursoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoCurso("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoCurso(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoCurso!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoCurso();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoCurso();
			}
			
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoCurso.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoCurso.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoCurso.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocursoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoCurso(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoCurso: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocursoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocursoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoCurso() {
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
			if(sTipo.equals("RelacionesTipoCurso")) {
				iIndex=this.jInternalFrameDetalleFormTipoCurso.jTabbedPaneRelacionesTipoCurso.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoCurso.jTabbedPaneRelacionesTipoCurso.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoCurso.getSelectedRow();	
				
				

				if(sTitle.equals("Cursos")) {
					if(!CursoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoCurso();

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
				this.finishProcessTipoCurso();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaCurso(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoCurso.cargarSessionConBeanSwingJInternalFrameCurso(false,true,iIndex);
		this.jButtonCursoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaCurso();

		//this.jTabbedPaneRelacionesTipoCurso.updateUI();
		//this.jTabbedPaneRelacionesTipoCurso.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoCurso.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("Curso")) {
				int row=this.jTableDatosTipoCurso.getSelectedRow();
				jButtonCursoActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipocursoSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Curso")) {

					if(this.isTienePermisosCurso && this.tipocursoConstantesFunciones.mostrarCursoTipoCurso && !TipoCursoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Cursos"+"("+CursoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Cursos");

						if(tipocursoConstantesFunciones.resaltarCursoTipoCurso!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipocursoConstantesFunciones.resaltarCursoTipoCurso);
						}

						jmenuItem.setEnabled(this.tipocursoConstantesFunciones.activarCursoTipoCurso);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Curso"));

						

						this.jInternalFrameDetalleFormTipoCurso.jmenuDetalleTipoCurso.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoCurso(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoCurso(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoCurso(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoCursoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoCurso();
		
		this.cargarCombosFrameForeignKeyTipoCurso();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoCurso();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoCurso();
		}
	}
	
	
	
	public void jButtonNuevoTipoCursoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipocursoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoCurso==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipocurso,new Object(),this.tipocursoParameterGeneral,this.tipocursoReturnGeneral);
			
			
			if(jTableDatosTipoCurso.getRowCount()>=1) {
				jTableDatosTipoCurso.removeRowSelectionInterval(0, jTableDatosTipoCurso.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoCurso=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoCurso(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoCurso(true);			
			//this.tipocurso=new TipoCurso();
			//this.tipocurso.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoCurso(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCurso() ;
			
			if(TipoCursoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoCurso(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipocurso);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipocurso);				
			
			TipoCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipocurso,new Object(),this.tipocursoParameterGeneral,this.tipocursoReturnGeneral);
			
			if(this.tipocursoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoCurso: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipocurso,new Object(),this.tipocursoParameterGeneral,this.tipocursoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoCursoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoCurso> tipocursosSeleccionados=new ArrayList<TipoCurso>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoCurso.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoCurso.getSelectedRows().length;			
			}
			
			tipocursosSeleccionados=this.getTipoCursosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoCurso--;			
				//TipoCurso tipocursoAux= new TipoCurso();			
				//tipocursoAux.setId(this.iIdNuevoTipoCurso);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoCurso tipocursoOrigen=new TipoCurso();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoCurso tipocursoOrigen : tipocursosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoCurso.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipocursoOrigen =(TipoCurso) this.tipocursoLogic.getTipoCursos().toArray()[this.jTableDatosTipoCurso.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocursoOrigen =(TipoCurso) this.tipocursos.toArray()[this.jTableDatosTipoCurso.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoCurso();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipocurso.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoCurso(tipocursoOrigen,this.tipocurso,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCurso(this.tipocurso);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipocursoLogic.getTipoCursos().add(this.tipocursoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipocursos.add(this.tipocursoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoCurso(false);
				
				this.jTableDatosTipoCurso.setRowSelectionInterval(this.getIndiceNuevoTipoCurso(), this.getIndiceNuevoTipoCurso());
				
				int iLastRow =  this.jTableDatosTipoCurso.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoCurso.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoCurso.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoCurso(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoCursoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoCurso> tipocursosSeleccionados=new ArrayList<TipoCurso>();									
		
			TipoCurso tipocursoOrigen=new TipoCurso();
			TipoCurso tipocursoDestino=new TipoCurso();
				
			tipocursosSeleccionados=this.getTipoCursosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoCurso.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipocursosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoCurso.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocursoOrigen =(TipoCurso) this.tipocursoLogic.getTipoCursos().toArray()[this.jTableDatosTipoCurso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipocursoOrigen =(TipoCurso) this.tipocursos.toArray()[this.jTableDatosTipoCurso.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocursoDestino =(TipoCurso) this.tipocursoLogic.getTipoCursos().toArray()[this.jTableDatosTipoCurso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipocursoDestino =(TipoCurso) this.tipocursos.toArray()[this.jTableDatosTipoCurso.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipocursoOrigen =tipocursosSeleccionados.get(0);
				tipocursoDestino =tipocursosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoCurso(tipocursoOrigen,tipocursoDestino,true,false);
				
				tipocursoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipocursoDestino,tipocursoLogic.getTipoCursos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocursoDestino,tipocursos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoCurso(false);
				
				//this.jTableDatosTipoCurso.setRowSelectionInterval(this.getIndiceNuevoTipoCurso(), this.getIndiceNuevoTipoCurso());
				
				int iLastRow =  this.jTableDatosTipoCurso.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoCurso.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoCurso.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoCurso(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoCursoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoCurso==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoCurso.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoCursoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoCurso.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoCurso.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoCurso.setVisible(!isVisible);
			this.jPanelPaginacionTipoCurso.setVisible(!isVisible);
			this.jPanelAccionesTipoCurso.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoCursoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoCurso();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoCursoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoCurso();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoCursoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoCurso();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoCursoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoCurso();
			
			this.abrirFrameOrderByTipoCurso();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoCursoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoCurso();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoCurso(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoCurso);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoCurso.isMaximum()) {
					this.jInternalFrameDetalleFormTipoCurso.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoCurso.setSize(this.jInternalFrameDetalleFormTipoCurso.iWidthFormulario,this.jInternalFrameDetalleFormTipoCurso.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoCurso.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoCurso.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoCurso.isMaximum()) {
						this.jInternalFrameDetalleFormTipoCurso.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoCurso.jContentPaneDetalleTipoCurso.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoCurso.jTabbedPaneRelacionesTipoCurso.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoCurso.jContentPaneDetalleTipoCurso.getWidth(),TipoCursoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoCurso.jTabbedPaneRelacionesTipoCurso.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoCurso.jContentPaneDetalleTipoCurso.getWidth(),TipoCursoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoCurso.jTabbedPaneRelacionesTipoCurso.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoCurso.jContentPaneDetalleTipoCurso.getWidth(),TipoCursoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(CursoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaCurso();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoCurso.setVisible(true);
	        this.jInternalFrameDetalleFormTipoCurso.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoCurso() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoCurso==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoCurso=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCurso,false,this);
				} else {
					this.jInternalFrameOrderByTipoCurso=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCurso,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoCurso);
				this.jInternalFrameOrderByTipoCurso.setVisible(false);
				this.jInternalFrameOrderByTipoCurso.setSelected(false);
				
				this.jInternalFrameOrderByTipoCurso.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoCurso"));
				
				this.inicializarActualizarBindingTablaOrderByTipoCurso();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoCurso() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoCurso==null) {
				
				this.jInternalFrameImportacionTipoCurso=new ImportacionJInternalFrame(TipoCursoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoCurso);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoCurso);
				this.jInternalFrameImportacionTipoCurso.setVisible(false);
				this.jInternalFrameImportacionTipoCurso.setSelected(false);


				this.jInternalFrameImportacionTipoCurso.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoCurso"));
				this.jInternalFrameImportacionTipoCurso.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoCurso"));
				this.jInternalFrameImportacionTipoCurso.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoCurso"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoCurso() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoCurso==null) {
				this.jInternalFrameReporteDinamicoTipoCurso=new ReporteDinamicoJInternalFrame(TipoCursoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoCurso);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoCurso);
				this.jInternalFrameReporteDinamicoTipoCurso.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoCurso.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoCurso.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoCurso"));
				this.jInternalFrameReporteDinamicoTipoCurso.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoCurso"));
				this.jInternalFrameReporteDinamicoTipoCurso.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoCurso"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoCurso();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaCurso() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoCurso.cursoBeanSwingJInternalFrame.jScrollPanelDatosCurso.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoCurso.jContentPaneDetalleTipoCurso.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoCurso.cursoBeanSwingJInternalFrame.jScrollPanelDatosCurso.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoCurso.cursoBeanSwingJInternalFrame.jScrollPanelDatosCurso.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoCurso.cursoBeanSwingJInternalFrame.jScrollPanelDatosCurso.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoCurso() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoCurso);
			
	       	this.jInternalFrameDetalleFormTipoCurso.setVisible(false);
	        this.jInternalFrameDetalleFormTipoCurso.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoCurso.dispose();
			//this.jInternalFrameDetalleFormTipoCurso=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoCurso() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoCurso.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoCurso.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoCurso() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoCurso.setVisible(true);
	        this.jInternalFrameImportacionTipoCurso.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoCurso() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoCurso.setVisible(true);
	        this.jInternalFrameOrderByTipoCurso.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoCurso() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoCurso.setVisible(false);
	        this.jInternalFrameOrderByTipoCurso.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoCurso() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoCurso.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoCurso.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoCurso() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoCurso.setVisible(false);
	        this.jInternalFrameImportacionTipoCurso.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoCursoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoCurso(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoCurso(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoCurso.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoCurso(true);
			//this.isEsNuevoTipoCurso=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocurso =(TipoCurso) this.tipocursoLogic.getTipoCursos().toArray()[this.jTableDatosTipoCurso.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipocurso =(TipoCurso) this.tipocursos.toArray()[this.jTableDatosTipoCurso.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoCurso("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoCurso(false) ;
			
			if(tipocursoSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoCurso.cursoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCurso.cursoBeanSwingJInternalFrame.cursoSessionBean.getEsGuardarRelacionado() && CursoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCursoActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoCursoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoCurso(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCurso(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoCursoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoCurso.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocurso =(TipoCurso) this.tipocursoLogic.getTipoCursos().toArray()[this.jTableDatosTipoCurso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocurso =(TipoCurso) this.tipocursos.toArray()[this.jTableDatosTipoCurso.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoCurso(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoCurso==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoCurso.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoCurso(true);
			//this.isEsNuevoTipoCurso=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocurso =(TipoCurso) this.tipocursoLogic.getTipoCursos().toArray()[this.jTableDatosTipoCurso.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipocurso =(TipoCurso) this.tipocursos.toArray()[this.jTableDatosTipoCurso.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipocurso.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoCurso("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoCurso(false) ;
			
			if(TipoCursoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoCurso(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCurso(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarTipoCursoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocursoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoCurso(false);
			
			//if(!this.isEsNuevoTipoCurso) {								
				int intSelectedRow = this.jTableDatosTipoCurso.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocurso =(TipoCurso) this.tipocursoLogic.getTipoCursos().toArray()[this.jTableDatosTipoCurso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipocurso =(TipoCurso) this.tipocursos.toArray()[this.jTableDatosTipoCurso.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoCursoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoCurso(this.tipocurso,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoCurso(this.tipocurso);
				
			}
			
			if(this.permiteMantenimiento(this.tipocurso)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipocursoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoCurso=true;
					this.inicializarActualizarBindingTablaTipoCurso(false);
					this.isEsNuevoTipoCurso=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoCurso=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoCurso=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoCurso(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoCurso(false);
				
				this.habilitarDeshabilitarControlesTipoCurso(false);
			
												
				
				if(TipoCursoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoCurso();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoCursoActionPerformed(evt,tipocursoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoCurso(this.tipocurso,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoCurso.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipocursoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocursoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipocurso.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoCurso.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCurso.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocursoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocursoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoCursoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocursoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoCurso.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocurso =(TipoCurso) this.tipocursoLogic.getTipoCursos().toArray()[this.jTableDatosTipoCurso.convertRowIndexToModel(intSelectedRow)];
				this.tipocurso.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipocurso =(TipoCurso) this.tipocursos.toArray()[this.jTableDatosTipoCurso.convertRowIndexToModel(intSelectedRow)];
				this.tipocurso.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipocurso)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipocursoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoCursoModel) this.jTableDatosTipoCurso.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoCurso=true;
				this.inicializarActualizarBindingTablaTipoCurso(false);
				this.isEsNuevoTipoCurso=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoCurso(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoCurso(false);
				
				this.habilitarDeshabilitarControlesTipoCurso(false);
				
				
				
				if(TipoCursoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoCurso();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocursoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocursoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocursoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoCursoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoCurso.getRowCount()>=1) {
				jTableDatosTipoCurso.removeRowSelectionInterval(0, jTableDatosTipoCurso.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoCurso(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoCurso(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoCurso(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCurso(false) ;
			
			this.isEsNuevoTipoCurso=false;
			
			if(TipoCursoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoCurso();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoCursoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocursoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoCurso(false);
				
				//SI ES MANUAL
				if(TipoCursoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoCurso();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocursoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocursoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocursoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoCursoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoCurso--;			
			//TipoCurso tipocursoAux= new TipoCurso();			
			//tipocursoAux.setId(this.iIdNuevoTipoCurso);
			
			if(this.jInternalFrameDetalleFormTipoCurso==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoCurso();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoCurso(this.tipocurso);
			
			this.tipocurso.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipocursoLogic.getTipoCursos().add(this.tipocursoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipocursos.add(this.tipocursoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoCurso(false);
			
			this.jTableDatosTipoCurso.setRowSelectionInterval(this.getIndiceNuevoTipoCurso(), this.getIndiceNuevoTipoCurso());
			
			int iLastRow =  this.jTableDatosTipoCurso.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoCurso.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoCurso.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoCurso(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoCursoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocursoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoCurso(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCurso(false);
			
			//SI ES MANUAL
			if(TipoCursoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoCurso();
			}
			
			//this.abrirFrameTreeTipoCurso();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocursoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocursoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocursoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoCursoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo CursoS ?", "MANTENIMIENTO DE Tipo Curso", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoCurso.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoCurso();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipocursoReturnGeneral=tipocursoLogic.procesarImportacionTipoCursosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipocursoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoCursoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoCursoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoCurso.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoCurso.setFileImportacion(this.jInternalFrameImportacionTipoCurso.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoCurso.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoCurso.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoCurso.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoCurso.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoCursoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoCurso> tipocursosSeleccionados=new ArrayList<TipoCurso>();		

		tipocursosSeleccionados=this.getTipoCursosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCurso.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCurso.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoCursoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoCursoBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoCursos("Todos",tipocursosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocursoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Curso",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoCurso.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCurso.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoCursoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoCursoConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoCursoConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoCurso.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoCurso.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoCurso.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoCursoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TipoCursoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoCursoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoCurso.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoCursoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TipoCursoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoCursoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoCurso.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCurso.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoCursoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TipoCursoConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoCursoConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoCursoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoCurso> tipocursosSeleccionados=new ArrayList<TipoCurso>();		
		
		tipocursosSeleccionados=this.getTipoCursosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocurso";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoCursos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoCurso.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCurso.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoCursoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoCursoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TipoCurso tipocurso:tipocursosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipocurso.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoCursoConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoCursoConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoCurso tipocurso:tipocursosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipocurso.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoCursoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoCursoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoCurso tipocurso:tipocursosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipocurso.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoCurso(row);				
			//	iRow++;
			//}				
			
			//for(TipoCurso tipocursoAux:tipocursosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoCurso(tipocursoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocursoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Curso",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipocursoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCurso(false);
			
			//SI ES MANUAL
			if(TipoCursoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoCurso();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocursoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocursoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocursoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoCursoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocursoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCurso(false);
			
			//SI ES MANUAL
			if(TipoCursoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoCurso();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocursoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocursoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocursoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoCursoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocursoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCurso(false);
			
			//SI ES MANUAL
			if(TipoCursoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoCurso();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocursoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocursoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocursoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoCurso() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoCurso.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoCurso.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoCurso.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoCurso.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoCurso.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoCurso.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoCurso.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoCurso(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoCurso(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoCurso(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoCurso(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoCurso(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipocursoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoCurso(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoCurso(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoCurso(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoCursoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoCursoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoCurso() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoCurso();
		
		this.inicializarActualizarBindingBotonesManualTipoCurso(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipocursoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoCurso();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoCurso() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoCurso(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoCurso(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoCurso.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoCurso.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoCurso.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoCurso!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoCurso.jCheckBoxPostAccionNuevoTipoCurso.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoCurso.jCheckBoxPostAccionSinCerrarTipoCurso.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoCurso.jCheckBoxPostAccionSinMensajeTipoCurso.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoCurso.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoCurso.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoCurso.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoCurso!=null) {
				this.jInternalFrameDetalleFormTipoCurso.jCheckBoxPostAccionNuevoTipoCurso.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoCurso.jCheckBoxPostAccionSinCerrarTipoCurso.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoCurso.jCheckBoxPostAccionSinMensajeTipoCurso.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoCurso.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoCurso.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoCurso!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoCurso.jComboBoxTiposAccionesFormularioTipoCurso.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoCurso.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoCurso!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCurso.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoCurso.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoCurso.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoCurso.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoCurso.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoCurso!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCurso.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoCurso.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoCurso.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoCurso(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoCursoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoCurso(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoCurso() throws Exception {
		try	{
			if(TipoCursoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoCurso();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoCurso() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoCurso.jComboBoxTiposAccionesFormularioTipoCurso.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoCurso.jComboBoxTiposAccionesFormularioTipoCurso.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoCurso() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoCurso.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoCurso.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoCurso.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoCurso.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoCurso.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoCurso.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoCurso.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoCurso.addItem(reporte);
			}
			
			
			if(!this.tipocursoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoCurso.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoCurso.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoCurso.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoCurso.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoCurso.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoCurso.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoCurso!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoCurso.jComboBoxTiposAccionesFormularioTipoCurso.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoCurso.jComboBoxTiposAccionesFormularioTipoCurso.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoCurso.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoCurso.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoCurso.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoCurso();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoCurso() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoCurso!=null) {
				this.jInternalFrameReporteDinamicoTipoCurso.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoCurso.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoCurso!=null) {
				this.jInternalFrameReporteDinamicoTipoCurso.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoCurso.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoCurso!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoCurso.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoCurso.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoCurso.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoCurso.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoCurso.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoCurso.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoCurso()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoCurso(Boolean esInicializar) throws Exception {				
		if(TipoCursoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoCurso();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoCurso() throws Exception {
		this.inicializarActualizarBindingTablaTipoCurso(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoCurso() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoCurso.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoCurso.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoCurso.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoCursoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoCurso.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoCurso.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoCursoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoCursoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCursoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoCursoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoCurso.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoCurso.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoCursoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoCurso.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoCurso(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipocursoLogic.getTipoCursos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipocursos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoCursoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoCurso.setModel(new TipoCursoModel(this.tipocursoLogic.getTipoCursos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoCurso.setModel(new TipoCursoModel(this.tipocursos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoCurso!=null && this.jInternalFrameOrderByTipoCurso.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoCurso();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoCurso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCurso,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoCursoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoCursoConstantesFunciones.SCLASSWEBTITULO,tipocursoConstantesFunciones.resaltarSeleccionarTipoCurso,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoCursoConstantesFunciones.SCLASSWEBTITULO,tipocursoConstantesFunciones.resaltarSeleccionarTipoCurso,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoCurso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCurso,TipoCursoConstantesFunciones.LABEL_ID));

		if(this.tipocursoConstantesFunciones.mostraridTipoCurso && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoCursoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipocursoConstantesFunciones.resaltaridTipoCurso,this.tipocursoConstantesFunciones.activaridTipoCurso,this,true,"idTipoCurso","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipocursoConstantesFunciones.resaltaridTipoCurso,this.tipocursoConstantesFunciones.activaridTipoCurso,this,true,"idTipoCurso","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoCurso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCurso,TipoCursoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tipocursoConstantesFunciones.mostrarid_empresaTipoCurso && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoCursoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tipocursoConstantesFunciones.resaltarid_empresaTipoCurso,this,this.tipocursoConstantesFunciones.activarid_empresaTipoCurso));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tipocursoConstantesFunciones.resaltarid_empresaTipoCurso,this,this.tipocursoConstantesFunciones.activarid_empresaTipoCurso,false,"id_empresaTipoCurso","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoCursoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoCurso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCurso,TipoCursoConstantesFunciones.LABEL_CODIGO));

		if(this.tipocursoConstantesFunciones.mostrarcodigoTipoCurso && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoCursoConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipocursoConstantesFunciones.resaltarcodigoTipoCurso,this.tipocursoConstantesFunciones.activarcodigoTipoCurso,this,true,"codigoTipoCurso","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipocursoConstantesFunciones.resaltarcodigoTipoCurso,this.tipocursoConstantesFunciones.activarcodigoTipoCurso,this,true,"codigoTipoCurso","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoCursoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoCurso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCurso,TipoCursoConstantesFunciones.LABEL_NOMBRE));

		if(this.tipocursoConstantesFunciones.mostrarnombreTipoCurso && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoCursoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipocursoConstantesFunciones.resaltarnombreTipoCurso,this.tipocursoConstantesFunciones.activarnombreTipoCurso,this,true,"nombreTipoCurso","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipocursoConstantesFunciones.resaltarnombreTipoCurso,this.tipocursoConstantesFunciones.activarnombreTipoCurso,this,true,"nombreTipoCurso","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoCursoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipocursoSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosCurso && this.tipocursoConstantesFunciones.mostrarCursoTipoCurso && !TipoCursoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Cursos");
				tableColumn.setHeaderValue("Cursos");
				tableColumn.setCellRenderer(new CursoTableCell(tipocursoConstantesFunciones.resaltarCursoTipoCurso,this,this.tipocursoConstantesFunciones.activarCursoTipoCurso));
				tableColumn.setCellEditor(new CursoTableCell(tipocursoConstantesFunciones.resaltarCursoTipoCurso,this,this.tipocursoConstantesFunciones.activarCursoTipoCurso));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoCurso.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipocursoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipocursoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoCurso.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipocursoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipocursoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoCurso.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoCurso && this.isPermisoGuardarCambiosTipoCurso) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipocursoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipocursoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoCurso.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipocursoSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosTipoCurso.addColumn(tableColumn);
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
			
			this.jTableDatosTipoCurso.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoCurso && this.isPermisoGuardarCambiosTipoCurso) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipocursoSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoCurso && this.isPermisoGuardarCambiosTipoCurso) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoCurso.moveColumn(this.jTableDatosTipoCurso.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoCurso.moveColumn(this.jTableDatosTipoCurso.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipocursoSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoCurso.moveColumn(this.jTableDatosTipoCurso.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoCurso.moveColumn(this.jTableDatosTipoCurso.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoCurso.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoCurso.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoCurso,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoCursoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoCurso.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoCurso.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoCursoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoCursoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoCurso.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoCurso.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoCurso.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipocursoLogic.getTipoCursos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipocursos.size()-1;
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
		//this.jTableDatosTipoCurso.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoCurso.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoCurso();
			
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
				
				//this.isEsNuevoTipoCurso=false;
					
				TipoCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipocurso,new Object(),this.tipocursoParameterGeneral,this.tipocursoReturnGeneral);
			
				if(this.tipocursoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoCurso==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoCurso.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoCurso.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocurso =(TipoCurso) this.tipocursoLogic.getTipoCursos().toArray()[this.jTableDatosTipoCurso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocurso =(TipoCurso) this.tipocursos.toArray()[this.jTableDatosTipoCurso.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipocurso.getsType().equals("DUPLICADO")
				   || this.tipocurso.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoCurso=true;
				
				} else {
					this.isEsNuevoTipoCurso=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipocursoSessionBean.getEsGuardarRelacionado()) {
					if(this.tipocurso.getId()>=0 && !this.tipocurso.getIsNew()) {						
						this.isEsNuevoTipoCurso=false;
						
					} else {
						this.isEsNuevoTipoCurso=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoCurso(esRelaciones);						
				
				this.seleccionarTipoCurso(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipocurso.getId()<0) {
					this.isEsNuevoTipoCurso=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoCurso(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoCurso(evt,rowIndex);
				}	
				
				if(this.tipocursoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoCurso: " + this.dDif); 
					}
				}								
				
				TipoCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipocurso,new Object(),this.tipocursoParameterGeneral,this.tipocursoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoCurso(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipocurso)) {
					if(this.tipocurso.getId()>0) {
						this.tipocurso.setIsDeleted(true);
						
						this.tipocursosEliminados.add(this.tipocurso);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipocursoLogic.getTipoCursos().remove(this.tipocurso);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipocursos.remove(this.tipocurso);				
					}
					
					
					((TipoCursoModel) this.jTableDatosTipoCurso.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoCurso(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoCurso(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoCurso) {
			
			if(this.jInternalFrameDetalleFormTipoCurso==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoCurso.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoCurso.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocurso =(TipoCurso) this.tipocursoLogic.getTipoCursos().toArray()[this.jTableDatosTipoCurso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocurso =(TipoCurso) this.tipocursos.toArray()[this.jTableDatosTipoCurso.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoCursoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoCurso(this.tipocurso);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tipocursoConstantesFunciones.cargarid_empresaTipoCurso || this.tipocursoConstantesFunciones.event_dependid_empresaTipoCurso) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tipocurso.getid_empresa());
									//this.inicializarActualizarBindingTipoCurso(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tipocurso.getEmpresa()!=null) {
							this.empresasForeignKey.add(tipocurso.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tipocurso.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoCurso("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoCurso(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoCurso() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoCurso(TipoCurso tipocurso) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoCurso(tipocurso,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoCurso(TipoCurso tipocurso,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoCurso(tipocurso);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoCurso(tipocurso,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoCurso(tipocurso);
	}
	
	public void setVariablesObjetoActualToFormularioTipoCurso(TipoCurso tipocurso) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoCurso==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoCurso.jLabelidTipoCurso.setText(tipocurso.getId().toString());
			this.jInternalFrameDetalleFormTipoCurso.jTextFieldcodigoTipoCurso.setText(tipocurso.getcodigo());
			this.jInternalFrameDetalleFormTipoCurso.jTextAreanombreTipoCurso.setText(tipocurso.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoCurso tipocursoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipocursoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoCurso tipocursoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipocursoLocal=this.tipocurso;
			} else {
				tipocursoLocal=this.tipocursoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipocursoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoCurso(tipocursoLocal,true);
					
					if(tipocursoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipocursoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipocursoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipocursoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoCurso(TipoCurso tipocurso,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoCurso(tipocurso,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoCurso(tipocurso);
	}
	
	public void setVariablesFormularioToObjetoActualTipoCurso(TipoCurso tipocurso,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoCurso(tipocurso,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoCurso(TipoCurso tipocurso,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoCurso==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoCurso.jLabelidTipoCurso.getText()==null || this.jInternalFrameDetalleFormTipoCurso.jLabelidTipoCurso.getText()=="" || this.jInternalFrameDetalleFormTipoCurso.jLabelidTipoCurso.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoCurso.jLabelidTipoCurso.setText("0");
			}

			if(conColumnasBase) {tipocurso.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoCurso.jLabelidTipoCurso.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoCursoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCurso.jLabelIdTipoCurso,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipocurso.setcodigo(this.jInternalFrameDetalleFormTipoCurso.jTextFieldcodigoTipoCurso.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoCursoConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCurso.jLabelcodigoTipoCurso,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipocurso.setnombre(this.jInternalFrameDetalleFormTipoCurso.jTextAreanombreTipoCurso.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoCursoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCurso.jLabelnombreTipoCurso,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoCurso(TipoCurso tipocursoBean,TipoCurso tipocurso,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoCurso(TipoCurso tipocursoOrigen,TipoCurso tipocurso,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipocursoOrigen.getId()!=null && !tipocursoOrigen.getId().equals(0L))) {tipocurso.setId(tipocursoOrigen.getId());}}
			if(conDefault || (!conDefault && tipocursoOrigen.getcodigo()!=null && !tipocursoOrigen.getcodigo().equals(""))) {tipocurso.setcodigo(tipocursoOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipocursoOrigen.getnombre()!=null && !tipocursoOrigen.getnombre().equals(""))) {tipocurso.setnombre(tipocursoOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoCurso(TipoCurso tipocurso) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoCurso.jLabelidTipoCurso.setText(tipocurso.getId().toString());
			this.jInternalFrameDetalleFormTipoCurso.jTextFieldcodigoTipoCurso.setText(tipocurso.getcodigo());
			this.jInternalFrameDetalleFormTipoCurso.jTextAreanombreTipoCurso.setText(tipocurso.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoCurso(TipoCursoBean tipocursoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoCurso.jLabelidTipoCurso.setText(tipocursoBean.getId().toString());
			this.jInternalFrameDetalleFormTipoCurso.jTextFieldcodigoTipoCurso.setText(tipocursoBean.getcodigo());
			this.jInternalFrameDetalleFormTipoCurso.jTextAreanombreTipoCurso.setText(tipocursoBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoCurso(TipoCursoParameterReturnGeneral tipocursoReturnGeneral,TipoCursoBean tipocursoBean,Boolean conDefault) throws Exception { 
		try {
			TipoCurso tipocursoLocal=new TipoCurso();
			
			tipocursoLocal=tipocursoReturnGeneral.getTipoCurso();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipocursoLocal.getId()!=null && !tipocursoLocal.getId().equals(0L))) {tipocursoBean.setId(tipocursoLocal.getId());}}
			if(conDefault || (!conDefault && tipocursoLocal.getcodigo()!=null && !tipocursoLocal.getcodigo().equals(""))) {tipocursoBean.setcodigo(tipocursoLocal.getcodigo());}
			if(conDefault || (!conDefault && tipocursoLocal.getnombre()!=null && !tipocursoLocal.getnombre().equals(""))) {tipocursoBean.setnombre(tipocursoLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoCursoGenerico(Long idTipoCursoSeleccionado,JComboBox jComboBoxTipoCurso,List<TipoCurso> tipocursosLocal)throws Exception {
		try {
			TipoCurso  tipocursoTemp=null;

			for(TipoCurso tipocursoAux:tipocursosLocal) {
				if(tipocursoAux.getId()!=null && tipocursoAux.getId().equals(idTipoCursoSeleccionado)) {
					tipocursoTemp=tipocursoAux;
					break;
				}
			}

			jComboBoxTipoCurso.setSelectedItem(tipocursoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoCursoGenerico(JComboBox jComboBoxTipoCurso,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoCurso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoCurso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoCurso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoCurso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoCurso.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoCurso.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoCurso.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoCurso.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoCurso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoCurso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipocurso=(TipoCurso) tipocursoLogic.getTipoCursos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipocurso =(TipoCurso) tipocursos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tipocurso.getIsNew() && !tipocurso.getIsChanged() && !tipocurso.getIsDeleted()) {
				sDescripcion=tipocurso.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tipocurso.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoCurso tipocursoRow=new TipoCurso();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipocursoRow=(TipoCurso) tipocursoLogic.getTipoCursos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipocursoRow=(TipoCurso) tipocursos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonCursoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoCurso tipocurso) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoCurso==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocursoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocurso = (TipoCurso)this.tipocursoLogic.getTipoCursos().toArray()[this.jTableDatosTipoCurso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipocurso = (TipoCurso)this.tipocursos.toArray()[this.jTableDatosTipoCurso.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipocurso!=null) {
						this.tipocurso = tipocurso;
					} else {
						this.tipocurso = new TipoCurso();
					}
				}

				if(this.isTienePermisosCurso && this.permiteMantenimiento(this.tipocurso)) {
					CursoBeanSwingJInternalFrame cursoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoCurso.cursoBeanSwingJInternalFramePopup=new CursoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoCurso.cursoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						cursoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoCurso.cursoBeanSwingJInternalFramePopup;
					} else {
						cursoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoCurso.cursoBeanSwingJInternalFrame;
					}

					List<TipoCurso> tipocursos=new ArrayList<TipoCurso>();
					tipocursos.add(this.tipocurso);
					if(!esRelacionado) {
						//cursoBeanSwingJInternalFrame.cursoSessionBean.setConGuardarRelaciones(false);
						//cursoBeanSwingJInternalFrame.cursoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					cursoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoCurso.cargarCursoBeanSwingJInternalFrame(tipocursos,this.tipocurso,cursoBeanSwingJInternalFrame,/*conInicializar,*/cursoBeanSwingJInternalFrame.cursoSessionBean.getConGuardarRelaciones(),cursoBeanSwingJInternalFrame.cursoSessionBean.getEsGuardarRelacionado());
					cursoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						cursoBeanSwingJInternalFrame.actualizarEstadoPanelsCurso("no_relacionado");

						cursoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(CursoConstantesFunciones.ITAMANIOFILATABLA + (CursoConstantesFunciones.ITAMANIOFILATABLA/2));

						cursoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoCurso=(TitledBorder)this.jScrollPanelDatosTipoCurso.getBorder();
						TitledBorder titledBorderCurso=(TitledBorder)cursoBeanSwingJInternalFrame.jScrollPanelDatosCurso.getBorder();

						titledBorderCurso.setTitle(titledBorderTipoCurso.getTitle() + " -> Curso");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,cursoBeanSwingJInternalFrame);
						}

						cursoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(cursoBeanSwingJInternalFrame);

						cursoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipocursoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Curso",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocursoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocursoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocursoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoCurso(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoCurso.setVisible((this.isVisibilidadCeldaNuevoTipoCurso && this.isPermisoNuevoTipoCurso));			
			this.jButtonDuplicarTipoCurso.setVisible((this.isVisibilidadCeldaDuplicarTipoCurso && this.isPermisoDuplicarTipoCurso));			
			this.jButtonCopiarTipoCurso.setVisible((this.isVisibilidadCeldaCopiarTipoCurso && this.isPermisoCopiarTipoCurso));
			this.jButtonVerFormTipoCurso.setVisible((this.isVisibilidadCeldaVerFormTipoCurso && this.isPermisoVerFormTipoCurso));
			
			this.jButtonAbrirOrderByTipoCurso.setVisible((this.isVisibilidadCeldaOrdenTipoCurso && this.isPermisoOrdenTipoCurso));			
			
			this.jButtonNuevoRelacionesTipoCurso.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoCurso && this.isPermisoNuevoTipoCurso));			
			this.jButtonNuevoGuardarCambiosTipoCurso.setVisible((this.isVisibilidadCeldaNuevoTipoCurso && this.isPermisoNuevoTipoCurso && this.isPermisoGuardarCambiosTipoCurso));
			
			if(this.jInternalFrameDetalleFormTipoCurso!=null) {
			this.jInternalFrameDetalleFormTipoCurso.jButtonModificarTipoCurso.setVisible((this.isVisibilidadCeldaModificarTipoCurso && this.isPermisoActualizarTipoCurso));	
			this.jInternalFrameDetalleFormTipoCurso.jButtonActualizarTipoCurso.setVisible((this.isVisibilidadCeldaActualizarTipoCurso && this.isPermisoActualizarTipoCurso));	
			this.jInternalFrameDetalleFormTipoCurso.jButtonEliminarTipoCurso.setVisible((this.isVisibilidadCeldaEliminarTipoCurso && this.isPermisoEliminarTipoCurso));
			this.jInternalFrameDetalleFormTipoCurso.jButtonCancelarTipoCurso.setVisible(this.isVisibilidadCeldaCancelarTipoCurso);							
			this.jInternalFrameDetalleFormTipoCurso.jButtonGuardarCambiosTipoCurso.setVisible((this.isVisibilidadCeldaGuardarTipoCurso && this.isPermisoGuardarCambiosTipoCurso));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoCurso.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoCurso && this.isPermisoGuardarCambiosTipoCurso));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoCurso.setVisible((this.isVisibilidadCeldaNuevoTipoCurso && this.isPermisoNuevoTipoCurso));						
			this.jButtonDuplicarToolBarTipoCurso.setVisible((this.isVisibilidadCeldaDuplicarTipoCurso && this.isPermisoDuplicarTipoCurso));						
			this.jButtonCopiarToolBarTipoCurso.setVisible((this.isVisibilidadCeldaCopiarTipoCurso && this.isPermisoCopiarTipoCurso));			
			this.jButtonVerFormToolBarTipoCurso.setVisible((this.isVisibilidadCeldaVerFormTipoCurso && this.isPermisoVerFormTipoCurso));			
			this.jButtonAbrirOrderByToolBarTipoCurso.setVisible((this.isVisibilidadCeldaOrdenTipoCurso && this.isPermisoOrdenTipoCurso));
			this.jButtonNuevoRelacionesToolBarTipoCurso.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoCurso && this.isPermisoNuevoTipoCurso));			
			this.jButtonNuevoGuardarCambiosToolBarTipoCurso.setVisible((this.isVisibilidadCeldaNuevoTipoCurso && this.isPermisoNuevoTipoCurso && this.isPermisoGuardarCambiosTipoCurso));			
			
			if(this.jInternalFrameDetalleFormTipoCurso!=null) {
			this.jInternalFrameDetalleFormTipoCurso.jButtonModificarToolBarTipoCurso.setVisible((this.isVisibilidadCeldaModificarTipoCurso && this.isPermisoActualizarTipoCurso));	
			this.jInternalFrameDetalleFormTipoCurso.jButtonActualizarToolBarTipoCurso.setVisible((this.isVisibilidadCeldaActualizarTipoCurso  && this.isPermisoActualizarTipoCurso));	
			this.jInternalFrameDetalleFormTipoCurso.jButtonEliminarToolBarTipoCurso.setVisible((this.isVisibilidadCeldaEliminarTipoCurso && this.isPermisoEliminarTipoCurso));
			this.jInternalFrameDetalleFormTipoCurso.jButtonCancelarToolBarTipoCurso.setVisible(this.isVisibilidadCeldaCancelarTipoCurso);				
			this.jInternalFrameDetalleFormTipoCurso.jButtonGuardarCambiosToolBarTipoCurso.setVisible((this.isVisibilidadCeldaGuardarTipoCurso && this.isPermisoGuardarCambiosTipoCurso));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoCurso.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoCurso && this.isPermisoGuardarCambiosTipoCurso));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoCurso.setVisible((this.isVisibilidadCeldaNuevoTipoCurso && this.isPermisoNuevoTipoCurso));			
			this.jMenuItemDuplicarTipoCurso.setVisible((this.isVisibilidadCeldaDuplicarTipoCurso && this.isPermisoDuplicarTipoCurso));			
			this.jMenuItemCopiarTipoCurso.setVisible((this.isVisibilidadCeldaCopiarTipoCurso && this.isPermisoCopiarTipoCurso));			
			this.jMenuItemVerFormTipoCurso.setVisible((this.isVisibilidadCeldaVerFormTipoCurso && this.isPermisoVerFormTipoCurso));			
			this.jMenuItemAbrirOrderByTipoCurso.setVisible((this.isVisibilidadCeldaOrdenTipoCurso && this.isPermisoOrdenTipoCurso));			
			//this.jMenuItemMostrarOcultarTipoCurso.setVisible((this.isVisibilidadCeldaOrdenTipoCurso && this.isPermisoOrdenTipoCurso));
			this.jMenuItemDetalleAbrirOrderByTipoCurso.setVisible((this.isVisibilidadCeldaOrdenTipoCurso && this.isPermisoOrdenTipoCurso));			
			//this.jMenuItemDetalleMostrarOcultarTipoCurso.setVisible((this.isVisibilidadCeldaOrdenTipoCurso && this.isPermisoOrdenTipoCurso));			
			this.jMenuItemNuevoRelacionesTipoCurso.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoCurso && this.isPermisoNuevoTipoCurso));			
			this.jMenuItemNuevoGuardarCambiosTipoCurso.setVisible((this.isVisibilidadCeldaNuevoTipoCurso && this.isPermisoNuevoTipoCurso && this.isPermisoGuardarCambiosTipoCurso));									
			
			if(this.jInternalFrameDetalleFormTipoCurso!=null) {
			this.jInternalFrameDetalleFormTipoCurso.jMenuItemModificarTipoCurso.setVisible((this.isVisibilidadCeldaModificarTipoCurso && this.isPermisoActualizarTipoCurso));	
			this.jInternalFrameDetalleFormTipoCurso.jMenuItemActualizarTipoCurso.setVisible((this.isVisibilidadCeldaActualizarTipoCurso && this.isPermisoActualizarTipoCurso));	
			this.jInternalFrameDetalleFormTipoCurso.jMenuItemEliminarTipoCurso.setVisible((this.isVisibilidadCeldaEliminarTipoCurso && this.isPermisoEliminarTipoCurso));
			this.jInternalFrameDetalleFormTipoCurso.jMenuItemCancelarTipoCurso.setVisible(this.isVisibilidadCeldaCancelarTipoCurso);				
			}
			
			this.jMenuItemGuardarCambiosTipoCurso.setVisible((this.isVisibilidadCeldaGuardarTipoCurso && this.isPermisoGuardarCambiosTipoCurso));						
			this.jMenuItemGuardarCambiosTablaTipoCurso.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoCurso && this.isPermisoGuardarCambiosTipoCurso));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoCurso=this.jButtonNuevoTipoCurso.isVisible();
			this.isVisibilidadCeldaDuplicarTipoCurso=this.jButtonDuplicarTipoCurso.isVisible();
			this.isVisibilidadCeldaCopiarTipoCurso=this.jButtonCopiarTipoCurso.isVisible();
			this.isVisibilidadCeldaVerFormTipoCurso=this.jButtonVerFormTipoCurso.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoCurso=this.jButtonAbrirOrderByTipoCurso.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoCurso=this.jButtonNuevoRelacionesTipoCurso.isVisible();
			this.isVisibilidadCeldaModificarTipoCurso=this.jButtonModificarTipoCurso.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoCurso!=null) {
			this.isVisibilidadCeldaActualizarTipoCurso=this.jInternalFrameDetalleFormTipoCurso.jButtonActualizarTipoCurso.isVisible();
			this.isVisibilidadCeldaEliminarTipoCurso=this.jInternalFrameDetalleFormTipoCurso.jButtonEliminarTipoCurso.isVisible();
			this.isVisibilidadCeldaCancelarTipoCurso=this.jInternalFrameDetalleFormTipoCurso.jButtonCancelarTipoCurso.isVisible();
			this.isVisibilidadCeldaGuardarTipoCurso=this.jInternalFrameDetalleFormTipoCurso.jButtonGuardarCambiosTipoCurso.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoCurso=this.jButtonGuardarCambiosTablaTipoCurso.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoCurso=this.jButtonNuevoToolBarTipoCurso.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoCurso=this.jButtonNuevoRelacionesToolBarTipoCurso.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoCurso!=null) {
			this.isVisibilidadCeldaModificarTipoCurso=this.jInternalFrameDetalleFormTipoCurso.jButtonModificarToolBarTipoCurso.isVisible();
			this.isVisibilidadCeldaActualizarTipoCurso=this.jInternalFrameDetalleFormTipoCurso.jButtonActualizarToolBarTipoCurso.isVisible();
			this.isVisibilidadCeldaEliminarTipoCurso=this.jInternalFrameDetalleFormTipoCurso.jButtonEliminarToolBarTipoCurso.isVisible();
			this.isVisibilidadCeldaCancelarTipoCurso=this.jInternalFrameDetalleFormTipoCurso.jButtonCancelarToolBarTipoCurso.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoCurso=this.jButtonGuardarCambiosToolBarTipoCurso.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoCurso=this.jButtonGuardarCambiosTablaToolBarTipoCurso.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoCurso=this.jMenuItemNuevoTipoCurso.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoCurso=this.jMenuItemNuevoRelacionesTipoCurso.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoCurso!=null) {
			this.isVisibilidadCeldaModificarTipoCurso=this.jInternalFrameDetalleFormTipoCurso.jMenuItemModificarTipoCurso.isVisible();
			this.isVisibilidadCeldaActualizarTipoCurso=this.jInternalFrameDetalleFormTipoCurso.jMenuItemActualizarTipoCurso.isVisible();
			this.isVisibilidadCeldaEliminarTipoCurso=this.jInternalFrameDetalleFormTipoCurso.jMenuItemEliminarTipoCurso.isVisible();
			this.isVisibilidadCeldaCancelarTipoCurso=this.jInternalFrameDetalleFormTipoCurso.jMenuItemCancelarTipoCurso.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoCurso=this.jMenuItemGuardarCambiosTipoCurso.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoCurso=this.jMenuItemGuardarCambiosTablaTipoCurso.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoCurso(Boolean esInicializar) {
		if(TipoCursoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipocursoSessionBean.getConGuardarRelaciones()) {
				//if(this.tipocursoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoCurso();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoCurso(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoCurso() {
		this.jButtonNuevoTipoCurso.setVisible(this.isPermisoNuevoTipoCurso);			
		this.jButtonDuplicarTipoCurso.setVisible(this.isPermisoDuplicarTipoCurso);			
		this.jButtonCopiarTipoCurso.setVisible(this.isPermisoCopiarTipoCurso);			
		this.jButtonVerFormTipoCurso.setVisible(this.isPermisoVerFormTipoCurso);			
		
		this.jButtonAbrirOrderByTipoCurso.setVisible(this.isPermisoOrdenTipoCurso);					
		
		this.jButtonNuevoRelacionesTipoCurso.setVisible(this.isPermisoNuevoTipoCurso);			
		
		if(this.jInternalFrameDetalleFormTipoCurso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCurso.jButtonModificarTipoCurso.setVisible(this.isPermisoActualizarTipoCurso);	
			this.jInternalFrameDetalleFormTipoCurso.jButtonActualizarTipoCurso.setVisible(this.isPermisoActualizarTipoCurso);	
			this.jInternalFrameDetalleFormTipoCurso.jButtonEliminarTipoCurso.setVisible(this.isPermisoEliminarTipoCurso);
			this.jInternalFrameDetalleFormTipoCurso.jButtonCancelarTipoCurso.setVisible(this.isVisibilidadCeldaCancelarTipoCurso);						
			this.jInternalFrameDetalleFormTipoCurso.jButtonGuardarCambiosTipoCurso.setVisible(this.isPermisoGuardarCambiosTipoCurso);							
		}
		
		this.jButtonGuardarCambiosTablaTipoCurso.setVisible(this.isPermisoActualizarTipoCurso);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoCurso() {
		this.jInternalFrameDetalleFormTipoCurso.jButtonModificarTipoCurso.setVisible(this.isPermisoActualizarTipoCurso);	
		this.jInternalFrameDetalleFormTipoCurso.jButtonActualizarTipoCurso.setVisible(this.isPermisoActualizarTipoCurso);	
		this.jInternalFrameDetalleFormTipoCurso.jButtonEliminarTipoCurso.setVisible(this.isPermisoEliminarTipoCurso);
		this.jInternalFrameDetalleFormTipoCurso.jButtonCancelarTipoCurso.setVisible(this.isVisibilidadCeldaCancelarTipoCurso);							
		this.jInternalFrameDetalleFormTipoCurso.jButtonGuardarCambiosTipoCurso.setVisible((this.isVisibilidadCeldaGuardarTipoCurso && this.isPermisoGuardarCambiosTipoCurso));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoCurso() {
		if(TipoCursoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoCurso();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoCurso() {
	}
	
	public void jTableDatosTipoCursoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoCurso(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoCursoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocursoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCurso.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoCurso(this.gettipocurso(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCurso(this.tipocurso);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocurso =(TipoCurso) this.tipocursoLogic.getTipoCursos().toArray()[this.jTableDatosTipoCurso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocurso =(TipoCurso) this.tipocursos.toArray()[this.jTableDatosTipoCurso.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocurso==null) {
						this.tipocurso = new TipoCurso();
					}

					this.setVariablesFormularioToObjetoActualTipoCurso(this.tipocurso,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCurso(this.tipocurso);
				}

				if(this.tipocurso.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipocurso.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoCurso(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocursoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocursoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocursoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTipoCursoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocursoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTipoCurso(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCurso.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoCurso.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoCurso.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocurso =(TipoCurso) this.tipocursoLogic.getTipoCursos().toArray()[this.jTableDatosTipoCurso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipocurso =(TipoCurso) this.tipocursos.toArray()[this.jTableDatosTipoCurso.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoCurso(this.gettipocurso(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoCurso(this.tipocurso);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tipocursoLogic.getConnexion());

				if(this.tipocurso.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tipocurso.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoCurso=(TitledBorder)this.jScrollPanelDatosTipoCurso.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTipoCurso.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocursoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocursoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocursoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTipoCursoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocursoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCurso.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoCurso(this.gettipocurso(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCurso(this.tipocurso);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocurso =(TipoCurso) this.tipocursoLogic.getTipoCursos().toArray()[this.jTableDatosTipoCurso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocurso =(TipoCurso) this.tipocursos.toArray()[this.jTableDatosTipoCurso.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocurso==null) {
						this.tipocurso = new TipoCurso();
					}

					this.setVariablesFormularioToObjetoActualTipoCurso(this.tipocurso,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCurso(this.tipocurso);
				}

				if(this.tipocurso.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tipocurso.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoCurso(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocursoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocursoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocursoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoCursoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocursoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCurso.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoCurso(this.gettipocurso(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCurso(this.tipocurso);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocurso =(TipoCurso) this.tipocursoLogic.getTipoCursos().toArray()[this.jTableDatosTipoCurso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocurso =(TipoCurso) this.tipocursos.toArray()[this.jTableDatosTipoCurso.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocurso==null) {
						this.tipocurso = new TipoCurso();
					}

					this.setVariablesFormularioToObjetoActualTipoCurso(this.tipocurso,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCurso(this.tipocurso);
				}

				if(this.tipocurso.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipocurso.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoCurso(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocursoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocursoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocursoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoCursoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocursoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCurso.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoCurso(this.gettipocurso(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCurso(this.tipocurso);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocurso =(TipoCurso) this.tipocursoLogic.getTipoCursos().toArray()[this.jTableDatosTipoCurso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocurso =(TipoCurso) this.tipocursos.toArray()[this.jTableDatosTipoCurso.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocurso==null) {
						this.tipocurso = new TipoCurso();
					}

					this.setVariablesFormularioToObjetoActualTipoCurso(this.tipocurso,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCurso(this.tipocurso);
				}

				if(this.tipocurso.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipocurso.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoCurso(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocursoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocursoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocursoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaTipoCursoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocursoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoCurso(false,false);

			this.getTipoCursosFK_IdEmpresa();

			this.inicializarActualizarBindingTipoCurso(false);

			//if(TipoCursoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoCurso(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocursoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocursoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocursoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoCurso() {
		if(this.jInternalFrameDetalleFormTipoCurso!=null) {
		

		if(this.jInternalFrameDetalleFormTipoCurso.cursoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoCurso.cursoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoCurso.cursoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoCurso.cursoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoCurso.cursoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoCurso.cursoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoCurso.cursoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoCurso.cursoBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoCurso!=null) {
			this.jInternalFrameDetalleFormTipoCurso.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoCurso.dispose();
			this.jInternalFrameDetalleFormTipoCurso=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoCurso!=null) {
			this.jInternalFrameReporteDinamicoTipoCurso.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoCurso.dispose();
			this.jInternalFrameReporteDinamicoTipoCurso=null;
		}
		
		if(this.jInternalFrameImportacionTipoCurso!=null) {
			this.jInternalFrameImportacionTipoCurso.setVisible(false);	    			
			this.jInternalFrameImportacionTipoCurso.dispose();
			this.jInternalFrameImportacionTipoCurso=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoCurso();
			
			TipoCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocurso,new Object(),this.tipocursoParameterGeneral,this.tipocursoReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoCurso")) {
				jButtonNuevoTipoCursoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoCurso")) {
				jButtonDuplicarTipoCursoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoCurso")) {
				jButtonCopiarTipoCursoActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoCurso")) {
				jButtonVerFormTipoCursoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoCurso")) {
				jButtonNuevoTipoCursoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoCurso")) {
				jButtonDuplicarTipoCursoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoCurso")) {
				jButtonNuevoTipoCursoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoCurso")) {
				jButtonDuplicarTipoCursoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoCurso")) {
				jButtonNuevoTipoCursoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoCurso")) {
				jButtonNuevoTipoCursoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoCurso")) {
				jButtonNuevoTipoCursoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoCurso")) {
				jButtonModificarTipoCursoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoCurso")) {
				jButtonModificarTipoCursoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoCurso")) {
				jButtonModificarTipoCursoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoCurso")) {
				jButtonActualizarTipoCursoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoCurso")) {
				jButtonActualizarTipoCursoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoCurso")) {
				jButtonActualizarTipoCursoActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoCurso")) {
				jButtonEliminarTipoCursoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoCurso")) {
				jButtonEliminarTipoCursoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoCurso")) {
				jButtonEliminarTipoCursoActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoCurso")) {
				jButtonCancelarTipoCursoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoCurso")) {
				jButtonCancelarTipoCursoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoCurso")) {
				jButtonCancelarTipoCursoActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoCurso")) {
				jButtonCerrarTipoCursoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoCurso")) {
				jButtonCerrarTipoCursoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoCurso")) {
				jButtonCerrarTipoCursoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoCurso")) {
				jButtonMostrarOcultarTipoCursoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoCurso")) {
				jButtonCancelarTipoCursoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoCurso")) {
				jButtonGuardarCambiosTipoCursoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoCurso")) {
				jButtonGuardarCambiosTipoCursoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoCurso")) {
				jButtonCopiarTipoCursoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoCurso")) {
				jButtonVerFormTipoCursoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoCurso")) {
				jButtonGuardarCambiosTipoCursoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoCurso")) {
				jButtonCopiarTipoCursoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoCurso")) {
				jButtonVerFormTipoCursoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoCurso")) {
				jButtonGuardarCambiosTipoCursoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoCurso")) {
				jButtonGuardarCambiosTipoCursoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoCurso")) {
				jButtonGuardarCambiosTipoCursoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoCurso")) {
				jButtonRecargarInformacionTipoCursoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoCurso")) {
				jButtonRecargarInformacionTipoCursoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoCurso")) {
				jButtonRecargarInformacionTipoCursoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoCurso")) {
				jButtonAnterioresTipoCursoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoCurso")) {
				jButtonAnterioresTipoCursoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoCurso")) {
				jButtonAnterioresTipoCursoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoCurso")) {
				jButtonSiguientesTipoCursoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoCurso")) {
				jButtonSiguientesTipoCursoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoCurso")) {
				jButtonSiguientesTipoCursoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoCurso") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoCurso")) {
				jButtonAbrirOrderByTipoCursoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoCurso") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoCurso")) {
				jButtonMostrarOcultarTipoCursoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoCurso")) {
				jButtonNuevoGuardarCambiosTipoCursoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoCurso")) {
				jButtonNuevoGuardarCambiosTipoCursoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoCurso")) {
				jButtonNuevoGuardarCambiosTipoCursoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoCurso")) {
				jButtonCerrarReporteDinamicoTipoCursoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoCurso")) {
				jButtonGenerarReporteDinamicoTipoCursoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoCurso")) {
				
				jButtonGenerarExcelReporteDinamicoTipoCursoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoCurso")) {
				jButtonCerrarImportacionTipoCursoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoCurso")) {
				
				jButtonGenerarImportacionTipoCursoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoCurso")) {
				
				jButtonAbrirImportacionTipoCursoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoCurso")) {
				jComboBoxTiposAccionesTipoCursoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoCurso")) {
				jComboBoxTiposRelacionesTipoCursoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoCurso")) {
				jComboBoxTiposAccionesTipoCursoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoCurso")) {
				
				jComboBoxTiposSeleccionarTipoCursoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoCurso")) {
				jTextFieldValorCampoGeneralTipoCursoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoCurso")) {
				jButtonAbrirOrderByTipoCursoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoCurso")) {
				jButtonAbrirOrderByTipoCursoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoCurso")) {
				jButtonCerrarOrderByTipoCursoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoCursoBusqueda")) {
				this.jButtonidTipoCursoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoCursoUpdate")) {
				this.jButtonid_empresaTipoCursoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoCursoBusqueda")) {
				this.jButtonid_empresaTipoCursoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoCursoBusqueda")) {
				this.jButtoncodigoTipoCursoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoCursoBusqueda")) {
				this.jButtonnombreTipoCursoBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocurso,new Object(),this.tipocursoParameterGeneral,this.tipocursoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoCurso();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCursoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocurso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocurso);
				
				TipoCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocurso,new Object(),this.tipocursoParameterGeneral,this.tipocursoReturnGeneral);
				
				


				
				TipoCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocurso,new Object(),this.tipocursoParameterGeneral,this.tipocursoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCurso.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCurso.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoCurso tipocursoLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipocursoLocal=this.tipocurso;
			} else {
				tipocursoLocal=this.tipocursoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocurso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocurso);
				
				TipoCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocurso,new Object(),this.tipocursoParameterGeneral,this.tipocursoReturnGeneral);
							
				
				


				
				TipoCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocurso,new Object(),this.tipocursoParameterGeneral,this.tipocursoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCurso.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCurso.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCursoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCurso.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocursoAnterior =(TipoCurso) this.tipocursoLogic.getTipoCursos().toArray()[this.jTableDatosTipoCurso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocursoAnterior =(TipoCurso) this.tipocursos.toArray()[this.jTableDatosTipoCurso.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
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
			
			TipoCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocurso,new Object(),this.tipocursoParameterGeneral,this.tipocursoReturnGeneral);
			
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
			
			


			
			TipoCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocurso,new Object(),this.tipocursoParameterGeneral,this.tipocursoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCursoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocurso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocurso);
				
				TipoCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocurso,new Object(),this.tipocursoParameterGeneral,this.tipocursoReturnGeneral);
								
						
				


				
				TipoCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocurso,new Object(),this.tipocursoParameterGeneral,this.tipocursoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCurso.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCurso.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocurso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocurso);
				
				TipoCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocurso,new Object(),this.tipocursoParameterGeneral,this.tipocursoReturnGeneral);
								
				
				


				
				TipoCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocurso,new Object(),this.tipocursoParameterGeneral,this.tipocursoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCurso.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCurso.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCursoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCurso.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocursoAnterior =(TipoCurso) this.tipocursoLogic.getTipoCursos().toArray()[this.jTableDatosTipoCurso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocursoAnterior =(TipoCurso) this.tipocursos.toArray()[this.jTableDatosTipoCurso.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocurso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocurso);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCursoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCurso.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocursoAnterior =(TipoCurso) this.tipocursoLogic.getTipoCursos().toArray()[this.jTableDatosTipoCurso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocursoAnterior =(TipoCurso) this.tipocursos.toArray()[this.jTableDatosTipoCurso.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCursoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocurso);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipocurso);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocurso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocurso);
				
				TipoCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocurso,new Object(),this.tipocursoParameterGeneral,this.tipocursoReturnGeneral);
							
				
				


				
				TipoCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocurso,new Object(),this.tipocursoParameterGeneral,this.tipocursoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCurso.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCurso.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCursoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoCurso.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocursoAnterior =(TipoCurso) this.tipocursoLogic.getTipoCursos().toArray()[this.jTableDatosTipoCurso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipocursoAnterior =(TipoCurso) this.tipocursos.toArray()[this.jTableDatosTipoCurso.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
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
			
			TipoCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocurso,new Object(),this.tipocursoParameterGeneral,this.tipocursoReturnGeneral);
			
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
			
			


			
			TipoCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocurso,new Object(),this.tipocursoParameterGeneral,this.tipocursoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCursoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocurso);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipocurso);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocurso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocurso);
				
				TipoCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocurso,new Object(),this.tipocursoParameterGeneral,this.tipocursoReturnGeneral);
								
				
				


				
				TipoCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocurso,new Object(),this.tipocursoParameterGeneral,this.tipocursoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCurso.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCurso.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCursoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCurso.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocursoAnterior =(TipoCurso) this.tipocursoLogic.getTipoCursos().toArray()[this.jTableDatosTipoCurso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocursoAnterior =(TipoCurso) this.tipocursos.toArray()[this.jTableDatosTipoCurso.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCursoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocurso);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipocurso);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCursoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocurso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocurso);
				
				TipoCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocurso,new Object(),this.tipocursoParameterGeneral,this.tipocursoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoCurso")) {
					jCheckBoxSeleccionarTodosTipoCursoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoCurso")) {
					jCheckBoxSeleccionadosTipoCursoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoCurso")) {
					
				}
				
				


				
				
				TipoCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocurso,new Object(),this.tipocursoParameterGeneral,this.tipocursoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCurso.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCurso.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocurso);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipocurso);
				
				TipoCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocurso,new Object(),this.tipocursoParameterGeneral,this.tipocursoReturnGeneral);
												
				
				


				
				
				TipoCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocurso,new Object(),this.tipocursoParameterGeneral,this.tipocursoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCurso.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCurso.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCursoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoCurso.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocursoAnterior =(TipoCurso) this.tipocursoLogic.getTipoCursos().toArray()[this.jTableDatosTipoCurso.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipocursoAnterior =(TipoCurso) this.tipocursos.toArray()[this.jTableDatosTipoCurso.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCursoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocurso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocurso);
				
				TipoCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocurso,new Object(),this.tipocursoParameterGeneral,this.tipocursoReturnGeneral);
				
				
				TipoCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocurso,new Object(),this.tipocursoParameterGeneral,this.tipocursoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
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
			
			TipoCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipocurso,new Object(),this.tipocursoParameterGeneral,this.tipocursoReturnGeneral);
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
			
			


			
			TipoCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocurso,new Object(),this.tipocursoParameterGeneral,this.tipocursoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCursoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocurso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocurso);
				
				TipoCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipocurso,new Object(),this.tipocursoParameterGeneral,this.tipocursoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocurso,new Object(),this.tipocursoParameterGeneral,this.tipocursoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCurso.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCurso.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocurso);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocurso);
				
				TipoCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipocurso,new Object(),this.tipocursoParameterGeneral,this.tipocursoReturnGeneral);
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
				
				


				
				TipoCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocurso,new Object(),this.tipocursoParameterGeneral,this.tipocursoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCurso.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCurso.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCursoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCurso.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocursoAnterior =(TipoCurso) this.tipocursoLogic.getTipoCursos().toArray()[this.jTableDatosTipoCurso.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocursoAnterior =(TipoCurso) this.tipocursos.toArray()[this.jTableDatosTipoCurso.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocurso,new Object(),this.tipocursoParameterGeneral,this.tipocursoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoCurso")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoCursoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoCurso.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipocurso =(TipoCurso) this.tipocursoLogic.getTipoCursos().toArray()[this.jTableDatosTipoCurso.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipocurso =(TipoCurso) this.tipocursos.toArray()[this.jTableDatosTipoCurso.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipocurso);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoCurso")) {
				
				}
				
				TipoCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocurso,new Object(),this.tipocursoParameterGeneral,this.tipocursoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipocurso,new Object(),this.tipocursoParameterGeneral,this.tipocursoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoCurso")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoCurso.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoCurso")) {
			
			}
			
			TipoCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipocurso,new Object(),this.tipocursoParameterGeneral,this.tipocursoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoCurso();
			
			TipoCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocurso,new Object(),this.tipocursoParameterGeneral,this.tipocursoReturnGeneral);
			
			if(sTipo.equals("NuevoTipoCurso")) {
				jButtonNuevoTipoCursoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoCurso")) {
				jButtonDuplicarTipoCursoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoCurso")) {
				jButtonCopiarTipoCursoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoCurso")) {
				jButtonVerFormTipoCursoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoCurso")) {
				jButtonNuevoTipoCursoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoCurso")) {
				jButtonModificarTipoCursoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoCurso")) {
				jButtonActualizarTipoCursoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoCurso")) {
				jButtonEliminarTipoCursoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoCurso")) {
				jButtonGuardarCambiosTipoCursoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoCurso")) {
				jButtonCancelarTipoCursoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoCurso")) {
				jButtonCerrarTipoCursoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoCurso")) {
				jButtonGuardarCambiosTipoCursoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoCurso")) {
				jButtonNuevoGuardarCambiosTipoCursoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoCurso")) {
				jButtonAbrirOrderByTipoCursoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoCurso")) {
				jButtonRecargarInformacionTipoCursoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoCurso")) {
				jButtonAnterioresTipoCursoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoCurso")) {
				jButtonSiguientesTipoCursoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoCursoBusqueda")) {
				this.jButtonidTipoCursoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoCursoUpdate")) {
				this.jButtonid_empresaTipoCursoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoCursoBusqueda")) {
				this.jButtonid_empresaTipoCursoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoCursoBusqueda")) {
				this.jButtoncodigoTipoCursoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoCursoBusqueda")) {
				this.jButtonnombreTipoCursoBusquedaActionPerformed(evt);
			}
			
			TipoCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocurso,new Object(),this.tipocursoParameterGeneral,this.tipocursoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoCurso();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipocurso,new Object(),this.tipocursoParameterGeneral,this.tipocursoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoCurso")) {
				closingInternalFrameTipoCurso();
				
			} else if(sTipo.equals("jButtonCancelarTipoCurso")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoCurso = (JInternalFrameBase)evt.getSource();
	            	
	            TipoCursoBeanSwingJInternalFrame jInternalFrameParent=(TipoCursoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoCurso.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoCursoActionPerformed(null);
			}
			
			TipoCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipocurso,new Object(),this.tipocursoParameterGeneral,this.tipocursoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoCurso(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoCurso(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoCurso(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipocurso)) {
			if(!esControlTabla) {
				if(TipoCursoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoCurso(this.tipocurso,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCurso(this.tipocurso);			
				}
				
				if(this.tipocursoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoCurso(this.tipocurso,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipocursoReturnGeneral=tipocursoLogic.procesarEventosTipoCursosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocursoLogic.getTipoCursos(),this.tipocurso,this.tipocursoParameterGeneral,this.isEsNuevoTipoCurso,classes);//this.tipocursoLogic.getTipoCurso()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoCurso(this.tipocursoReturnGeneral,this.tipocursoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipocursoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoCurso(classes,this.tipocursoReturnGeneral,this.tipocursoBean,false);
					}
						
					if(this.tipocursoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoCurso(this.tipocursoReturnGeneral.getTipoCurso());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoCurso(this.tipocursoReturnGeneral.getTipoCurso());	
					}
						
					if(this.tipocursoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoCurso(this.tipocursoReturnGeneral.getTipoCurso(),classes);//this.tipocursoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoCurso(this.tipocurso,classes);//this.tipocursoBean);									
				}
			
				if(TipoCursoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoCurso(this.tipocurso,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCurso(this.tipocurso);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipocursoAnterior!=null) {
						this.tipocurso=this.tipocursoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipocursoReturnGeneral=tipocursoLogic.procesarEventosTipoCursosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocursoLogic.getTipoCursos(),this.tipocurso,this.tipocursoParameterGeneral,this.isEsNuevoTipoCurso,classes);//this.tipocursoLogic.getTipoCurso()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipocursoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipocursoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipocursoReturnGeneral.getTipoCurso(),tipocursoLogic.getTipoCursos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipocursoReturnGeneral.getTipoCurso(),this.tipocursos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoCurso.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoCurso.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoCurso();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoCurso() throws Exception {
		
		TipoCursoModel tipocursoModel=(TipoCursoModel)this.jTableDatosTipoCurso.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipocursoModel.tipocursos=this.tipocursoLogic.getTipoCursos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipocursoModel.tipocursos=this.tipocursos;
		}
		
		
		((TipoCursoModel) this.jTableDatosTipoCurso.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoCurso() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipocursoAnterior(),this.tipocursoLogic.getTipoCursos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipocursoAnterior(),this.tipocursos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoCurso();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoCurso(TipoCurso tipocurso,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Curso.class)) {
					this.jInternalFrameDetalleFormTipoCurso.cursoBeanSwingJInternalFrame.cursoLogic.setCursos(tipocurso.getCursos());
					this.jInternalFrameDetalleFormTipoCurso.cursoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCurso(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
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
										
				TipoCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocurso,new Object(),generalEntityParameterGeneral,this.tipocursoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipocursoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoCursoConstantesFunciones.getClassesRelationshipsOfTipoCurso(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoCursoConstantesFunciones.getClassesRelationshipsFromStringsOfTipoCurso(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoCurso(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoCursoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocurso,new Object(),generalEntityParameterGeneral,this.tipocursoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoCurso(TipoCursoBean tipocursoBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Curso.class)) {
					this.jInternalFrameDetalleFormTipoCurso.cursoBeanSwingJInternalFrame.cursoLogic.setCursos(tipocurso.getCursos());
					this.jInternalFrameDetalleFormTipoCurso.cursoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCurso(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoCurso(ArrayList<Classe> classes,TipoCursoReturnGeneral tipocursoReturnGeneral,TipoCursoBean tipocursoBean,Boolean conDefault) throws Exception {
		
			this.tipocursoBean.setCursos(tipocursoReturnGeneral.getTipoCurso().getCursos());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoCurso(TipoCurso tipocurso,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(Curso.class)) {
					tipocurso.setCursos(this.jInternalFrameDetalleFormTipoCurso.cursoBeanSwingJInternalFrame.cursoLogic.getCursos());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tipocurso)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoCurso = new TipoCursoDetalleFormJInternalFrame(jDesktopPane,this.tipocursoSessionBean.getConGuardarRelaciones(),this.tipocursoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoCurso);
		this.jInternalFrameDetalleFormTipoCurso.setVisible(false);
		this.jInternalFrameDetalleFormTipoCurso.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoCurso.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoCurso.tipocursoLogic=this.tipocursoLogic;
		
		this.cargarCombosFrameForeignKeyTipoCurso("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoCurso();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoCurso();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoCurso("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoCurso();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoCurso.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoCurso"));
		
		this.jInternalFrameDetalleFormTipoCurso.jButtonModificarTipoCurso.addActionListener(new ButtonActionListener(this,"ModificarTipoCurso"));

		
		this.jInternalFrameDetalleFormTipoCurso.jButtonModificarToolBarTipoCurso.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoCurso"));
					
		this.jInternalFrameDetalleFormTipoCurso.jMenuItemModificarTipoCurso.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoCurso"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCurso.jButtonActualizarTipoCurso.addActionListener (new ButtonActionListener(this,"ActualizarTipoCurso"));
		
		
		this.jInternalFrameDetalleFormTipoCurso.jButtonActualizarToolBarTipoCurso.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoCurso"));
						
		this.jInternalFrameDetalleFormTipoCurso.jMenuItemActualizarTipoCurso.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoCurso"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCurso.jButtonEliminarTipoCurso.addActionListener (new ButtonActionListener(this,"EliminarTipoCurso"));
		
		
		this.jInternalFrameDetalleFormTipoCurso.jButtonEliminarToolBarTipoCurso.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoCurso"));
								
		this.jInternalFrameDetalleFormTipoCurso.jMenuItemEliminarTipoCurso.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoCurso"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCurso.jButtonCancelarTipoCurso.addActionListener (new ButtonActionListener(this,"CancelarTipoCurso"));
		
		
		this.jInternalFrameDetalleFormTipoCurso.jButtonCancelarToolBarTipoCurso.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoCurso"));
					
		this.jInternalFrameDetalleFormTipoCurso.jMenuItemCancelarTipoCurso.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoCurso"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoCurso.jMenuItemDetalleCerrarTipoCurso.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoCurso"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCurso.jButtonGuardarCambiosToolBarTipoCurso.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoCurso"));
		
		
		
		this.jInternalFrameDetalleFormTipoCurso.jButtonGuardarCambiosToolBarTipoCurso.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoCurso"));
		
		
		
		this.jInternalFrameDetalleFormTipoCurso.jComboBoxTiposAccionesFormularioTipoCurso.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoCurso"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCurso.jButtonidTipoCursoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoCursoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoCurso.jButtonid_empresaTipoCursoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoCursoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCurso.jButtonid_empresaTipoCursoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoCursoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCurso.jButtoncodigoTipoCursoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoCursoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCurso.jButtonnombreTipoCursoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoCursoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoCurso.jTabbedPaneRelacionesTipoCurso.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoCurso"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoCurso"));
		
		if(this.jInternalFrameDetalleFormTipoCurso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCurso.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoCurso"));
		}
		
		this.jTableDatosTipoCurso.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoCurso"));
		
		this.jTableDatosTipoCurso.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoCurso"));
		
		this.jButtonNuevoTipoCurso.addActionListener(new ButtonActionListener(this,"NuevoTipoCurso"));
		
		this.jButtonDuplicarTipoCurso.addActionListener(new ButtonActionListener(this,"DuplicarTipoCurso"));
		
		this.jButtonCopiarTipoCurso.addActionListener(new ButtonActionListener(this,"CopiarTipoCurso"));
		
		this.jButtonVerFormTipoCurso.addActionListener(new ButtonActionListener(this,"VerFormTipoCurso"));
		
		
		this.jButtonNuevoToolBarTipoCurso.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoCurso"));
			
		this.jButtonDuplicarToolBarTipoCurso.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoCurso"));
			
		this.jMenuItemNuevoTipoCurso.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoCurso"));
			
		this.jMenuItemDuplicarTipoCurso.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoCurso"));		
		
		
		this.jButtonNuevoRelacionesTipoCurso.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoCurso"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoCurso.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoCurso"));
			
		this.jMenuItemNuevoRelacionesTipoCurso.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoCurso"));		
		
		
		if(this.jInternalFrameDetalleFormTipoCurso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCurso.jButtonModificarTipoCurso.addActionListener(new ButtonActionListener(this,"ModificarTipoCurso"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCurso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCurso.jButtonModificarToolBarTipoCurso.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoCurso"));
			
			this.jInternalFrameDetalleFormTipoCurso.jMenuItemModificarTipoCurso.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoCurso"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCurso!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoCurso.jButtonActualizarTipoCurso.addActionListener (new ButtonActionListener(this,"ActualizarTipoCurso"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCurso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCurso.jButtonActualizarToolBarTipoCurso.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoCurso"));
				
			this.jInternalFrameDetalleFormTipoCurso.jMenuItemActualizarTipoCurso.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoCurso"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCurso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCurso.jButtonEliminarTipoCurso.addActionListener (new ButtonActionListener(this,"EliminarTipoCurso"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCurso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCurso.jButtonEliminarToolBarTipoCurso.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoCurso"));
						
			this.jInternalFrameDetalleFormTipoCurso.jMenuItemEliminarTipoCurso.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoCurso"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCurso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCurso.jButtonCancelarTipoCurso.addActionListener (new ButtonActionListener(this,"CancelarTipoCurso"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCurso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCurso.jButtonCancelarToolBarTipoCurso.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoCurso"));
			
			this.jInternalFrameDetalleFormTipoCurso.jMenuItemCancelarTipoCurso.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoCurso"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoCurso.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoCurso"));		
		
		
		this.jButtonCerrarTipoCurso.addActionListener (new ButtonActionListener(this,"CerrarTipoCurso"));
		
		
		this.jButtonCerrarToolBarTipoCurso.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoCurso"));
			
		this.jMenuItemCerrarTipoCurso.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoCurso"));
			
		if(this.jInternalFrameDetalleFormTipoCurso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCurso.jMenuItemDetalleCerrarTipoCurso.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoCurso"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCurso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCurso.jButtonGuardarCambiosTipoCurso.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoCurso"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCurso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCurso.jButtonGuardarCambiosToolBarTipoCurso.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoCurso"));
		}
		
		this.jButtonCopiarToolBarTipoCurso.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoCurso"));
			
		this.jButtonVerFormToolBarTipoCurso.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoCurso"));
		
		this.jMenuItemGuardarCambiosTipoCurso.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoCurso"));
			
		this.jMenuItemCopiarTipoCurso.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoCurso"));		
		
		this.jMenuItemVerFormTipoCurso.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoCurso"));		
		
		
		this.jButtonGuardarCambiosTablaTipoCurso.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoCurso"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoCurso.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoCurso"));
			
		this.jMenuItemGuardarCambiosTablaTipoCurso.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoCurso"));		
		
		
		
		this.jButtonRecargarInformacionTipoCurso.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoCurso"));
					
		this.jButtonRecargarInformacionToolBarTipoCurso.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoCurso"));
		
		this.jMenuItemRecargarInformacionTipoCurso.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoCurso"));		
		
		
		
		this.jButtonAnterioresTipoCurso.addActionListener (new ButtonActionListener(this,"AnterioresTipoCurso"));
		
		
		this.jButtonAnterioresToolBarTipoCurso.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoCurso"));
		
		this.jMenuItemAnterioresTipoCurso.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoCurso"));		
		
		
		this.jButtonSiguientesTipoCurso.addActionListener (new ButtonActionListener(this,"SiguientesTipoCurso"));
		
		
		this.jButtonSiguientesToolBarTipoCurso.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoCurso"));
			
		this.jMenuItemSiguientesTipoCurso.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoCurso"));
			
		this.jMenuItemAbrirOrderByTipoCurso.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoCurso"));
			
		this.jMenuItemMostrarOcultarTipoCurso.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoCurso"));
			
		this.jMenuItemDetalleAbrirOrderByTipoCurso.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoCurso"));
			
		this.jMenuItemDetalleMostarOcultarTipoCurso.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoCurso"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoCurso.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoCurso"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoCurso.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoCurso"));
			
		this.jMenuItemNuevoGuardarCambiosTipoCurso.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoCurso"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoCurso.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoCurso"));

		this.jCheckBoxSeleccionadosTipoCurso.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoCurso"));
		
		if(this.jInternalFrameDetalleFormTipoCurso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCurso.jComboBoxTiposAccionesFormularioTipoCurso.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoCurso"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoCurso.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoCurso"));
			
		this.jComboBoxTiposAccionesTipoCurso.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoCurso"));
					
		this.jComboBoxTiposSeleccionarTipoCurso.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoCurso"));
			
		this.jTextFieldValorCampoGeneralTipoCurso.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoCurso"));		
		
		
		if(this.jInternalFrameDetalleFormTipoCurso!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCurso.jButtonidTipoCursoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoCursoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoCurso.jButtonid_empresaTipoCursoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoCursoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCurso.jButtonid_empresaTipoCursoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoCursoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCurso.jButtoncodigoTipoCursoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoCursoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCurso.jButtonnombreTipoCursoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoCursoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoCurso!=null) {
				this.jInternalFrameReporteDinamicoTipoCurso.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoCurso"));
				this.jInternalFrameReporteDinamicoTipoCurso.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoCurso"));
				this.jInternalFrameReporteDinamicoTipoCurso.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoCurso"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoCurso.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoCurso"));				
			//this.jButtonGenerarReporteDinamicoTipoCurso.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoCurso"));
			//this.jButtonGenerarExcelReporteDinamicoTipoCurso.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoCurso"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoCurso!=null) {
				this.jInternalFrameImportacionTipoCurso.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoCurso"));
				this.jInternalFrameImportacionTipoCurso.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoCurso"));
				this.jInternalFrameImportacionTipoCurso.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoCurso"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoCurso.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoCurso"));
			
			this.jButtonAbrirOrderByToolBarTipoCurso.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoCurso"));			
			
			if(this.jInternalFrameOrderByTipoCurso!=null) {
				this.jInternalFrameOrderByTipoCurso.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoCurso"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoCurso!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoCurso!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCurso.jTabbedPaneRelacionesTipoCurso.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoCurso"));
		
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
            		closingInternalFrameTipoCurso();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoCurso.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoCurso = (JInternalFrameBase)event.getSource();
	            	
	            TipoCursoBeanSwingJInternalFrame jInternalFrameParent=(TipoCursoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoCurso.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoCursoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoCurso.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoCursoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoCurso.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoCurso.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCursoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCursoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCursoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoCurso";
		inputMap = this.jButtonNuevoTipoCurso.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoCurso.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoCursoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCursoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCursoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCursoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoCurso";
		inputMap = this.jButtonNuevoRelacionesTipoCurso.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoCurso.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoCursoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoCurso";
		inputMap = this.jButtonModificarTipoCurso.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoCurso.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoCursoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoCurso";
		inputMap = this.jButtonActualizarTipoCurso.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoCurso.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoCursoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoCurso";
		inputMap = this.jButtonEliminarTipoCurso.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoCurso.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoCursoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoCurso";
		inputMap = this.jButtonCancelarTipoCurso.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoCurso.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoCursoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoCurso";
		inputMap = this.jButtonCerrarTipoCurso.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoCurso.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoCursoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoCurso.jButtonGuardarCambiosTipoCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoCurso";
		inputMap = this.jInternalFrameDetalleFormTipoCurso.jButtonGuardarCambiosTipoCurso.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoCurso.jButtonGuardarCambiosTipoCurso.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoCursoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoCurso.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoCursoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoCurso.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoCursoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoCurso.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoCursoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoCurso.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoCursoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCurso.jButtonidTipoCursoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoCursoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoCurso.jButtonid_empresaTipoCursoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoCursoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCurso.jButtonid_empresaTipoCursoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoCursoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCurso.jButtoncodigoTipoCursoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoCursoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCurso.jButtonnombreTipoCursoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoCursoBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoCurso.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoCursoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoCursoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoCurso.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoCurso(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoCurso tipocursoAux:this.tipocursoLogic.getTipoCursos()) {
					tipocursoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCurso tipocursoAux:tipocursos) {
					tipocursoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoCursoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoCurso(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoCurso tipocursoAux:this.tipocursoLogic.getTipoCursos()) {
						tipocursoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoCurso tipocursoAux:tipocursos) {
						tipocursoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoCurso tipocursoAux:this.tipocursoLogic.getTipoCursos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoCurso tipocursoAux:tipocursos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoCurso(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoCurso.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoCurso.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoCurso,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoCursoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoCurso(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoCurso.getSelectedRows();
			
			TipoCurso tipocursoLocal=new TipoCurso();
			
			//this.seleccionarTodosTipoCurso(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocursoLocal =(TipoCurso) this.tipocursoLogic.getTipoCursos().toArray()[this.jTableDatosTipoCurso.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipocursoLocal =(TipoCurso) this.tipocursos.toArray()[this.jTableDatosTipoCurso.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipocursoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoCurso tipocursoAux:this.tipocursoLogic.getTipoCursos()) {
						tipocursoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoCurso tipocursoAux:tipocursos) {
						tipocursoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoCurso(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoCurso.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoCurso.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoCurso,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoCursoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoCursoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoCursoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoCurso(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoCurso.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoCurso tipocursoAux:this.tipocursoLogic.getTipoCursos()) {
				
						if(sTipoSeleccionar.equals(TipoCursoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipocursoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoCursoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipocursoAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCurso tipocursoAux:tipocursos) {
					
						if(sTipoSeleccionar.equals(TipoCursoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipocursoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoCursoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipocursoAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoCurso(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoCursoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoCurso(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoCurso=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoCurso.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoCurso.jComboBoxTiposAccionesFormularioTipoCurso.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoCurso) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoCurso(conSplash);
				
					this.generarReporteTipoCursosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCurso.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCurso.jComboBoxTiposAccionesFormularioTipoCurso.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoCursosSeleccionados();
				//this.jComboBoxTiposAccionesTipoCurso.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoCursosSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoCurso.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoCursosSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoCurso.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoCurso();
				
				this.exportarTipoCursosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCurso.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCurso.jComboBoxTiposAccionesFormularioTipoCurso.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoCursos();
				//this.importarTipoCursos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCurso.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCurso.jComboBoxTiposAccionesFormularioTipoCurso.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoCurso();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoCursosSeleccionados();
				//this.jComboBoxTiposAccionesTipoCurso.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Curso", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoCurso();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoCurso)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoCurso(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Curso",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCurso.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCurso.jComboBoxTiposAccionesFormularioTipoCurso.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoCurso();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoCurso(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoCursoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoCurso();
			
			if(this.jInternalFrameDetalleFormTipoCurso==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoCurso> tipocursosSeleccionados=new ArrayList<TipoCurso>();		
			TipoCurso tipocurso=new TipoCurso();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoCurso(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoCurso.getSelectedItem();
			
			
			
			
			tipocursosSeleccionados=this.getTipoCursosSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipocursosSeleccionados.size()==1) {
				for(TipoCurso tipocursoAux:tipocursosSeleccionados) {
					tipocurso=tipocursoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Curso")) {
					jButtonCursoActionPerformed(null,rowIndex,true,false,tipocurso);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoCurso();
			
      		//this.finishProcessTipoCurso(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoCursoReturnGeneral() throws Exception {
		if(this.tipocursoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipocursoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipocursoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipocursoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipocursoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipocursoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoCurso(false);
		}
		
		if(this.tipocursoReturnGeneral.getConRetornoLista() || this.tipocursoReturnGeneral.getConRetornoObjeto()) {
			if(this.tipocursoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipocursoLogic.setTipoCursos(this.tipocursoReturnGeneral.getTipoCursos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipocursoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipocursoLogic.setTipoCurso(this.tipocursoReturnGeneral.getTipoCurso());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoCurso(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoCurso() throws Exception {
		
		
	}
	
	public ArrayList<TipoCurso> getTipoCursosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoCurso> tipocursosSeleccionados=new ArrayList<TipoCurso>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoCurso) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoCurso tipocursoAux:tipocursoLogic.getTipoCursos()) {
					if(tipocursoAux.getIsSelected()) {
						tipocursosSeleccionados.add(tipocursoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCurso tipocursoAux:this.tipocursos) {
					if(tipocursoAux.getIsSelected()) {
						tipocursosSeleccionados.add(tipocursoAux);				
					}
				}
			}
			
			if(tipocursosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipocursosSeleccionados.addAll(this.tipocursoLogic.getTipoCursos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipocursosSeleccionados.addAll(this.tipocursos);				
					}
				}
			}
		} else {
			tipocursosSeleccionados.add(this.tipocurso);
		}
		
		return tipocursosSeleccionados;
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
	
	public void generarReporteTipoCursosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoCursosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoCursosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoCursosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoCursosSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoCursosSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Curso",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoCursosSeleccionados() throws Exception {
		ArrayList<TipoCurso> tipocursosSeleccionados=new ArrayList<TipoCurso>();		
		
		tipocursosSeleccionados=this.getTipoCursosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoCursos("Todos",tipocursosSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoCursosSeleccionados() throws Exception {
		ArrayList<TipoCurso> tipocursosSeleccionados=new ArrayList<TipoCurso>();		
		
		tipocursosSeleccionados=this.getTipoCursosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoCursos("Todos",tipocursosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoCursosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoCurso> tipocursosSeleccionados=new ArrayList<TipoCurso>();
		
		tipocursosSeleccionados=this.getTipoCursosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoCursos("Todos",tipocursosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoCursosSeleccionados() throws Exception {
		ArrayList<TipoCurso> tipocursosSeleccionados=new ArrayList<TipoCurso>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoCurso();
		
		
		tipocursosSeleccionados=this.getTipoCursosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoCurso();
		
		
		//this.generarReporteTipoCursos("Todos",tipocursosSeleccionados ,tipocursoImplementable,tipocursoImplementableHome);
	}
	
	public void mostrarImportacionTipoCursos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoCurso();
		
		this.abrirFrameImportacionTipoCurso();		
		
			
		//this.generarReporteTipoCursos("Todos",tipocursosSeleccionados ,tipocursoImplementable,tipocursoImplementableHome);
	}
	
	public void importarTipoCursos() throws Exception {		
	
	}
	
	public void exportarTipoCursosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoCursosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoCursosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoCursosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Curso",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoCursosSeleccionados() throws Exception {
		ArrayList<TipoCurso> tipocursosSeleccionados=new ArrayList<TipoCurso>();		
		
		tipocursosSeleccionados=this.getTipoCursosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocurso."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoCurso(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoCurso tipocursoAux:tipocursosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoCurso(tipocursoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipocursoAux.setsDetalleGeneralEntityReporte(tipocursoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocursoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Curso",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoCurso(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoCursoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoCursoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoCursoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoCursoConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoCursoConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoCurso(TipoCurso tipocurso,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipocurso.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocurso.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocurso.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocurso.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocurso.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoCursosSeleccionados() throws Exception {
		ArrayList<TipoCurso> tipocursosSeleccionados=new ArrayList<TipoCurso>();		
		
		tipocursosSeleccionados=this.getTipoCursosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocurso.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoCursos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoCurso(row);				
				iRow++;
			}				
			
			for(TipoCurso tipocursoAux:tipocursosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoCurso(tipocursoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocursoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Curso",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoCursosSeleccionados() throws Exception {
		ArrayList<TipoCurso> tipocursosSeleccionados=new ArrayList<TipoCurso>();		
		
		tipocursosSeleccionados=this.getTipoCursosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocurso.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipocursos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipocurso");
			//elementRoot.appendChild(element);
		
			for(TipoCurso tipocursoAux:tipocursosSeleccionados) {
				element = document.createElement("tipocurso");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoCurso(tipocursoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocursoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Curso",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoCurso(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoCursoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoCursoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoCursoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoCursoConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoCursoConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoCurso(TipoCurso tipocurso,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipocurso.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipocurso.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipocurso.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipocurso.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoCurso(TipoCurso tipocurso,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoCursoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipocurso.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoCursoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipocurso.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TipoCursoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tipocurso.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo = document.createElement(TipoCursoConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipocurso.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoCursoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipocurso.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoCursosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoCurso> tipocursosSeleccionados=new ArrayList<TipoCurso>();
		
		tipocursosSeleccionados=this.getTipoCursosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoCurso(tipocursosSeleccionados);
		
		this.generarReporteTipoCursos("Todos",tipocursosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoCurso(ArrayList<TipoCurso> tipocursosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoCurso tipocursoAux:tipocursosSeleccionados) {
				tipocursoAux.setsDetalleGeneralEntityReporte(tipocursoAux.toString());
			
				if(sTipoSeleccionar.equals(TipoCursoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tipocursoAux.setsDescripcionGeneralEntityReporte1(tipocursoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoCursoConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipocursoAux.setsDescripcionGeneralEntityReporte1(tipocursoAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoCursoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipocursoAux.setsDescripcionGeneralEntityReporte1(tipocursoAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCursoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoCurso(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoCurso=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoCurso=true;
				this.isVisibilidadCeldaGuardarCambiosTipoCurso=true;
			}
			
			this.isVisibilidadCeldaModificarTipoCurso=false;
			this.isVisibilidadCeldaActualizarTipoCurso=false;
			this.isVisibilidadCeldaEliminarTipoCurso=false;
			this.isVisibilidadCeldaCancelarTipoCurso=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCurso=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCurso=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoCurso=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCurso=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCurso=false;
			this.isVisibilidadCeldaModificarTipoCurso=false;
			this.isVisibilidadCeldaActualizarTipoCurso=true;
			this.isVisibilidadCeldaEliminarTipoCurso=false;
			this.isVisibilidadCeldaCancelarTipoCurso=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCurso=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCurso=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoCurso=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCurso=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCurso=false;
			this.isVisibilidadCeldaModificarTipoCurso=false;
			this.isVisibilidadCeldaActualizarTipoCurso=true;
			this.isVisibilidadCeldaEliminarTipoCurso=true;
			this.isVisibilidadCeldaCancelarTipoCurso=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCurso=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCurso=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoCurso=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCurso=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCurso=false;
			this.isVisibilidadCeldaModificarTipoCurso=false;
			this.isVisibilidadCeldaActualizarTipoCurso=true;
			this.isVisibilidadCeldaEliminarTipoCurso=false;
			this.isVisibilidadCeldaCancelarTipoCurso=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCurso=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoCurso=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoCurso=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoCurso=true;
			this.isVisibilidadCeldaGuardarCambiosTipoCurso=true;
			this.isVisibilidadCeldaModificarTipoCurso=false;
			this.isVisibilidadCeldaActualizarTipoCurso=false;
			this.isVisibilidadCeldaEliminarTipoCurso=false;
			this.isVisibilidadCeldaCancelarTipoCurso=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCurso=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCurso=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoCurso=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCurso=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCurso=false;
			this.isVisibilidadCeldaActualizarTipoCurso=false;
			this.isVisibilidadCeldaEliminarTipoCurso=false;
			this.isVisibilidadCeldaCancelarTipoCurso=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCurso=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoCurso=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoCurso=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCurso=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCurso=false;
			this.isVisibilidadCeldaModificarTipoCurso=true;
			this.isVisibilidadCeldaActualizarTipoCurso=false;
			this.isVisibilidadCeldaEliminarTipoCurso=false;
			this.isVisibilidadCeldaCancelarTipoCurso=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCurso=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoCurso=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoCursoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoCurso=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoCurso=true;
			this.isVisibilidadCeldaGuardarCambiosTipoCurso=true;
		} else {
			this.actualizarEstadoPanelsTipoCurso(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoCurso=false;
			//this.isVisibilidadCeldaVerFormTipoCurso=false;
			this.isVisibilidadCeldaDuplicarTipoCurso=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipocursoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoCurso=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoCurso=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCurso=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipocursoSessionBean.getEsGuardarRelacionado()) {
			if(!tipocursoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoCurso=false;												
			}
			
			this.jButtonCerrarTipoCurso.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoCurso=false;
		}
		
		if(!this.permiteMantenimiento(this.tipocurso)) {
			this.isVisibilidadCeldaActualizarTipoCurso=false;
			this.isVisibilidadCeldaEliminarTipoCurso=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoCurso() {
		this.isVisibilidadCeldaNuevoTipoCurso=false;
		this.isVisibilidadCeldaGuardarCambiosTipoCurso=false;
	}
	
	public void actualizarEstadoPanelsTipoCurso(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoCurso!=null) {
				this.jScrollPanelDatosEdicionTipoCurso.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCurso!=null) {
				this.jTabbedPaneBusquedasTipoCurso.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoCurso!=null) {
				this.jScrollPanelDatosTipoCurso.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCurso!=null) {
				this.jPanelPaginacionTipoCurso.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCurso!=null) {
				this.jPanelParametrosReportesTipoCurso.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoCurso!=null) {
				this.jScrollPanelDatosEdicionTipoCurso.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCurso!=null) {
				this.jTabbedPaneBusquedasTipoCurso.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoCurso!=null) {
				this.jScrollPanelDatosTipoCurso.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoCurso!=null) {
				this.jPanelPaginacionTipoCurso.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoCurso!=null) {
				this.jPanelParametrosReportesTipoCurso.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoCurso!=null) {
				this.jScrollPanelDatosEdicionTipoCurso.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCurso!=null) {
				this.jTabbedPaneBusquedasTipoCurso.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoCurso!=null) {
				this.jScrollPanelDatosTipoCurso.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoCurso!=null) {
				this.jPanelPaginacionTipoCurso.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoCurso!=null) {
				this.jPanelParametrosReportesTipoCurso.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoCurso!=null) {
				this.jScrollPanelDatosEdicionTipoCurso.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCurso!=null) {
				this.jTabbedPaneBusquedasTipoCurso.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoCurso!=null) {
				this.jScrollPanelDatosTipoCurso.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoCurso!=null) {
				this.jPanelPaginacionTipoCurso.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoCurso!=null) {
				this.jPanelParametrosReportesTipoCurso.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoCurso!=null) {
				this.jScrollPanelDatosEdicionTipoCurso.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCurso!=null) {
				this.jTabbedPaneBusquedasTipoCurso.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoCurso!=null) {
				this.jScrollPanelDatosTipoCurso.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCurso!=null) {
				this.jPanelPaginacionTipoCurso.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCurso!=null) {
				this.jPanelParametrosReportesTipoCurso.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoCurso!=null) {
				this.jScrollPanelDatosEdicionTipoCurso.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCurso!=null) {
				this.jTabbedPaneBusquedasTipoCurso.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoCurso!=null) {
				this.jScrollPanelDatosTipoCurso.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCurso!=null) {
				this.jPanelPaginacionTipoCurso.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCurso!=null) {
				this.jPanelParametrosReportesTipoCurso.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoCurso!=null) {
				this.jScrollPanelDatosEdicionTipoCurso.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCurso!=null) {
				this.jTabbedPaneBusquedasTipoCurso.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoCurso!=null) {
				this.jScrollPanelDatosTipoCurso.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCurso!=null) {
				this.jPanelPaginacionTipoCurso.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCurso!=null) {
				this.jPanelParametrosReportesTipoCurso.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipocursoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoCurso!=null) {
					this.jTabbedPaneBusquedasTipoCurso.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoCurso!=null) {
				this.jPanelParametrosReportesTipoCurso.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipocursoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCurso!=null) {
				this.jTabbedPaneBusquedasTipoCurso.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoCurso!=null) {
				this.jPanelParametrosReportesTipoCurso.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;
		}
		
	}
	
	

	public String registrarSesionTipoCursoParaCursos() throws Exception {
		Boolean isPaginaPopupCurso=false;

		try {

			if(this.tipocursoSessionBean==null) {
				this.tipocursoSessionBean=new TipoCursoSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoCurso.cursoSessionBean==null) {
				this.jInternalFrameDetalleFormTipoCurso.cursoSessionBean=new CursoSessionBean();
			}

			this.jInternalFrameDetalleFormTipoCurso.cursoSessionBean.setsPathNavegacionActual(tipocursoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CursoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoCurso.cursoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupCurso=this.jInternalFrameDetalleFormTipoCurso.cursoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoCurso.cursoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCurso(true);
			this.jInternalFrameDetalleFormTipoCurso.cursoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCurso(TipoCursoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoCurso.cursoSessionBean.setisBusquedaDesdeForeignKeySesionTipoCurso(true);
			this.jInternalFrameDetalleFormTipoCurso.cursoSessionBean.setlidTipoCursoActual(this.idTipoCursoActual);

			tipocursoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoCurso(true);
			tipocursoSessionBean.setlIdTipoCursoActualForeignKey(this.idTipoCursoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoCursoSessionBean tipocursoSessionBean=new TipoCursoSessionBean();
		
		if(this.tipocursoSessionBean==null) {
			this.tipocursoSessionBean=new TipoCursoSessionBean();
		}
		
		this.tipocursoSessionBean.setsUltimaBusquedaTipoCurso(this.getsAccionBusqueda());
		this.tipocursoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipocursoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tipocursoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoCursoSessionBean tipocursoSessionBean=new TipoCursoSessionBean();
		
		if(this.tipocursoSessionBean==null) {
			this.tipocursoSessionBean=new TipoCursoSessionBean();
		}
		
		if(this.tipocursoSessionBean.getsUltimaBusquedaTipoCurso()!=null&&!this.tipocursoSessionBean.getsUltimaBusquedaTipoCurso().equals("")) {
			this.setsAccionBusqueda(tipocursoSessionBean.getsUltimaBusquedaTipoCurso());
			this.setiNumeroPaginacion(tipocursoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipocursoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tipocursoSessionBean.getid_empresa());
				tipocursoSessionBean.setid_empresa(-1L);
			}
		}
		
		this.tipocursoSessionBean.setsUltimaBusquedaTipoCurso("");
		this.tipocursoSessionBean.setiNumeroPaginacion(TipoCursoConstantesFunciones.INUMEROPAGINACION);
		this.tipocursoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoCurso(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoCurso() {
		this.updateBorderResaltarBusquedasFormularioTipoCurso();
		this.updateVisibilidadBusquedasFormularioTipoCurso();
		this.updateHabilitarBusquedasFormularioTipoCurso();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoCurso() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoCurso.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoCurso() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoCurso.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoCurso() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoCurso.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoCurso(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarTipoCurso.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoCurso() throws Exception {

		if(this.jInternalFrameDetalleFormTipoCurso==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoCurso();
		this.updateVisibilidadResaltarControlesFormularioTipoCurso();
		this.updateHabilitarResaltarControlesFormularioTipoCurso();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoCurso() throws Exception {
		if(this.jInternalFrameDetalleFormTipoCurso==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipocursoConstantesFunciones.resaltaridTipoCurso!=null && this.jInternalFrameDetalleFormTipoCurso!=null) {this.jInternalFrameDetalleFormTipoCurso.jLabelidTipoCurso.setBorder(this.tipocursoConstantesFunciones.resaltaridTipoCurso);}
		if(this.tipocursoConstantesFunciones.resaltarid_empresaTipoCurso!=null && this.jInternalFrameDetalleFormTipoCurso!=null) {this.jInternalFrameDetalleFormTipoCurso.jComboBoxid_empresaTipoCurso.setBorder(this.tipocursoConstantesFunciones.resaltarid_empresaTipoCurso);}
		if(this.tipocursoConstantesFunciones.resaltarcodigoTipoCurso!=null && this.jInternalFrameDetalleFormTipoCurso!=null) {this.jInternalFrameDetalleFormTipoCurso.jTextFieldcodigoTipoCurso.setBorder(this.tipocursoConstantesFunciones.resaltarcodigoTipoCurso);}
		if(this.tipocursoConstantesFunciones.resaltarnombreTipoCurso!=null && this.jInternalFrameDetalleFormTipoCurso!=null) {this.jInternalFrameDetalleFormTipoCurso.jTextAreanombreTipoCurso.setBorder(this.tipocursoConstantesFunciones.resaltarnombreTipoCurso);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoCurso() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoCurso==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoCurso!=null) {
	
		//this.jInternalFrameDetalleFormTipoCurso.jLabelidTipoCurso.setVisible(this.tipocursoConstantesFunciones.mostraridTipoCurso);
		this.jInternalFrameDetalleFormTipoCurso.jPanelidTipoCurso.setVisible(this.tipocursoConstantesFunciones.mostraridTipoCurso);
		//this.jInternalFrameDetalleFormTipoCurso.jComboBoxid_empresaTipoCurso.setVisible(this.tipocursoConstantesFunciones.mostrarid_empresaTipoCurso);
		this.jInternalFrameDetalleFormTipoCurso.jPanelid_empresaTipoCurso.setVisible(this.tipocursoConstantesFunciones.mostrarid_empresaTipoCurso);
		//this.jInternalFrameDetalleFormTipoCurso.jTextFieldcodigoTipoCurso.setVisible(this.tipocursoConstantesFunciones.mostrarcodigoTipoCurso);
		this.jInternalFrameDetalleFormTipoCurso.jPanelcodigoTipoCurso.setVisible(this.tipocursoConstantesFunciones.mostrarcodigoTipoCurso);
		//this.jInternalFrameDetalleFormTipoCurso.jTextAreanombreTipoCurso.setVisible(this.tipocursoConstantesFunciones.mostrarnombreTipoCurso);
		this.jInternalFrameDetalleFormTipoCurso.jPanelnombreTipoCurso.setVisible(this.tipocursoConstantesFunciones.mostrarnombreTipoCurso);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoCurso() throws Exception {
		if(this.jInternalFrameDetalleFormTipoCurso==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoCurso!=null) {
	
		this.jInternalFrameDetalleFormTipoCurso.jLabelidTipoCurso.setEnabled(this.tipocursoConstantesFunciones.activaridTipoCurso);
		this.jInternalFrameDetalleFormTipoCurso.jComboBoxid_empresaTipoCurso.setEnabled(this.tipocursoConstantesFunciones.activarid_empresaTipoCurso);
		this.jInternalFrameDetalleFormTipoCurso.jTextFieldcodigoTipoCurso.setEnabled(this.tipocursoConstantesFunciones.activarcodigoTipoCurso);
		this.jInternalFrameDetalleFormTipoCurso.jTextAreanombreTipoCurso.setEnabled(this.tipocursoConstantesFunciones.activarnombreTipoCurso);
		}
	}
	
		
}